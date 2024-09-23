import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mc")
public class IdkType {

    @OriginalMember(owner = "mc", name = "a", descriptor = "Z")
    private boolean field1110 = false;

    @OriginalMember(owner = "mc", name = "e", descriptor = "I")
    public int field1114 = -1;

    @OriginalMember(owner = "mc", name = "g", descriptor = "[I")
    public int[] field1116 = new int[6];

    @OriginalMember(owner = "mc", name = "h", descriptor = "[I")
    public int[] field1117 = new int[6];

    @OriginalMember(owner = "mc", name = "i", descriptor = "[I")
    public int[] field1118 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mc", name = "j", descriptor = "Z")
    public boolean field1119 = false;

    @OriginalMember(owner = "mc", name = "b", descriptor = "I")
    private static int field1111 = 6771;

    @OriginalMember(owner = "mc", name = "c", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "mc", name = "f", descriptor = "[I")
    public int[] field1115;

    @OriginalMember(owner = "mc", name = "d", descriptor = "[Lmc;")
    public static IdkType[] field1113;

    @OriginalMember(owner = "mc", name = "a", descriptor = "(ILyb;)V")
    public static void method372(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method298("idk.dat", null), true);
        field1112 = var2.method230();
        if (field1111 != arg0) {
            field1111 = 38;
        }
        if (field1113 == null) {
            field1113 = new IdkType[field1112];
        }
        for (int var3 = 0; var3 < field1112; var3++) {
            if (field1113[var3] == null) {
                field1113[var3] = new IdkType();
            }
            field1113[var3].method373((byte) 44, var2);
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(BLmb;)V")
    public void method373(byte arg0, Packet arg1) {
        if (arg0 != 44) {
            this.field1110 = !this.field1110;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method228();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1114 = arg1.method228();
                } else if (var3 == 2) {
                    int var4 = arg1.method228();
                    this.field1115 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1115[var5] = arg1.method230();
                    }
                } else if (var3 == 3) {
                    this.field1119 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1116[var3 - 40] = arg1.method230();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1117[var3 - 50] = arg1.method230();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1118[var3 - 60] = arg1.method230();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(I)Z")
    public boolean method374(int arg0) {
        if (arg0 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1115 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1115.length; var4++) {
            if (!Model.method126(this.field1115[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "mc", name = "b", descriptor = "(I)Leb;")
    public Model method375(int arg0) {
        if (this.field1115 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1115.length];
        for (int var3 = 0; var3 < this.field1115.length; var3++) {
            var2[var3] = Model.method125(this.field1115[var3], 196);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(172, var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1116[var5] != 0; var5++) {
            var4.method139(this.field1116[var5], this.field1117[var5]);
        }
        if (arg0 < 2 || arg0 > 2) {
            for (int var6 = 1; var6 > 0; var6++) {
            }
        }
        return var4;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(B)Z")
    public boolean method376(byte arg0) {
        boolean var2 = true;
        if (arg0 != 26) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1118[var3] != -1 && !Model.method126(this.field1118[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "mc", name = "a", descriptor = "(Z)Leb;")
    public Model method377(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1118[var4] != -1) {
                var2[var3++] = Model.method125(this.field1118[var4], 196);
            }
        }
        Model var5 = new Model(172, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1116[var6] != 0; var6++) {
            var5.method139(this.field1116[var6], this.field1117[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "mc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field369) {
        }
    }
}
