import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private boolean field1105 = true;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private int field1106 = 4697;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    private int field1108 = 5;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1111 = -1;

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1113 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1114 = new int[6];

    @OriginalMember(owner = "lc", name = "k", descriptor = "[I")
    public int[] field1115 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1116 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    private int field1107;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public static int field1109;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1112;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[Llc;")
    public static IdkType[] field1110;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILxb;)V")
    public static void method368(int arg0, Jagfile arg1) {
        Packet var2 = new Packet((byte) 3, arg1.method294("idk.dat", null));
        int var3 = 63 / arg0;
        field1109 = var2.method226();
        if (field1110 == null) {
            field1110 = new IdkType[field1109];
        }
        for (int var4 = 0; var4 < field1109; var4++) {
            if (field1110[var4] == null) {
                field1110[var4] = new IdkType();
            }
            field1110[var4].method369(var2, -32477);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Llb;I)V")
    public void method369(Packet arg0, int arg1) {
        if (arg1 != -32477) {
            this.field1108 = 175;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method224();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1111 = arg0.method224();
                } else if (var3 == 2) {
                    int var4 = arg0.method224();
                    this.field1112 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1112[var5] = arg0.method226();
                    }
                } else if (var3 == 3) {
                    this.field1116 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1113[var3 - 40] = arg0.method226();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1114[var3 - 50] = arg0.method226();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1115[var3 - 60] = arg0.method226();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method370(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1112 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1112.length; var4++) {
            if (!Model.method126(this.field1112[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Leb;")
    public Model method371(byte arg0) {
        if (this.field1112 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1112.length];
        for (int var3 = 0; var3 < this.field1112.length; var3++) {
            var2[var3] = Model.method125(this.field1105, this.field1112[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2.length, var2, this.field1106);
        }
        for (int var5 = 0; var5 < 6 && this.field1113[var5] != 0; var5++) {
            var4.method139(this.field1113[var5], this.field1114[var5]);
        }
        if (arg0 != 68) {
            this.field1107 = -496;
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(B)Z")
    public boolean method372(byte arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1115[var3] != -1 && !Model.method126(this.field1115[var3])) {
                var2 = false;
            }
        }
        if (arg0 != 3) {
            throw new NullPointerException();
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Leb;")
    public Model method373(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        Model[] var3 = new Model[5];
        int var4 = 0;
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field1115[var5] != -1) {
                var3[var4++] = Model.method125(this.field1105, this.field1115[var5]);
            }
        }
        Model var6 = new Model(var4, var3, this.field1106);
        for (int var7 = 0; var7 < 6 && this.field1113[var7] != 0; var7++) {
            var6.method139(this.field1113[var7], this.field1114[var7]);
        }
        return var6;
    }
}
