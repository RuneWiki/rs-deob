import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "B")
    private byte field1110 = 0;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private boolean field1111 = false;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1114 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1116 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1117 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1118 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1119 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1115;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1113;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLxb;)V")
    public static void method368(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method294("idk.dat", null), (byte) 1);
        if (arg0) {
            return;
        }
        field1112 = var2.method226();
        if (field1113 == null) {
            field1113 = new IdkType[field1112];
        }
        for (int var3 = 0; var3 < field1112; var3++) {
            if (field1113[var3] == null) {
                field1113[var3] = new IdkType();
            }
            field1113[var3].method369((byte) 2, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(BLlb;)V")
    public void method369(byte arg0, Packet arg1) {
        if (arg0 != 2) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1114 = arg1.method224();
                } else if (var3 == 2) {
                    int var4 = arg1.method224();
                    this.field1115 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1115[var5] = arg1.method226();
                    }
                } else if (var3 == 3) {
                    this.field1119 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1116[var3 - 40] = arg1.method226();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1117[var3 - 50] = arg1.method226();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1118[var3 - 60] = arg1.method226();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method370(int arg0) {
        if (this.field1115 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1115.length; var3++) {
            if (!Model.method126(this.field1115[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Leb;")
    public Model method371(byte arg0) {
        if (this.field1110 != arg0) {
            this.field1111 = !this.field1111;
        }
        if (this.field1115 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1115.length];
        for (int var3 = 0; var3 < this.field1115.length; var3++) {
            var2[var3] = Model.method125(this.field1115[var3], 6);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2.length, -643, var2);
        }
        for (int var5 = 0; var5 < 6 && this.field1116[var5] != 0; var5++) {
            var4.method139(this.field1116[var5], this.field1117[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method372(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1118[var3] != -1 && !Model.method126(this.field1118[var3])) {
                var2 = false;
            }
        }
        if (arg0 != 0) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(B)Leb;")
    public Model method373(byte arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        boolean var4 = false;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field1118[var5] != -1) {
                var2[var3++] = Model.method125(this.field1118[var5], 6);
            }
        }
        Model var6 = new Model(var3, -643, var2);
        for (int var7 = 0; var7 < 6 && this.field1116[var7] != 0; var7++) {
            var6.method139(this.field1116[var7], this.field1117[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field365) {
        }
    }
}
