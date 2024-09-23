import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private boolean field1123 = false;

    @OriginalMember(owner = "lc", name = "b", descriptor = "B")
    private byte field1124 = 4;

    @OriginalMember(owner = "lc", name = "g", descriptor = "I")
    public int field1129 = -1;

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1131 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1132 = new int[6];

    @OriginalMember(owner = "lc", name = "k", descriptor = "[I")
    public int[] field1133 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "l", descriptor = "Z")
    public boolean field1134 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    private int field1125;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "lc", name = "d", descriptor = "Z")
    private static boolean field1126;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1130;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[Llc;")
    public static IdkType[] field1128;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLxb;)V")
    public static void method371(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method297("idk.dat", null), 15787);
        if (!arg0) {
            field1126 = !field1126;
        }
        field1127 = var2.method229();
        if (field1128 == null) {
            field1128 = new IdkType[field1127];
        }
        for (int var3 = 0; var3 < field1127; var3++) {
            if (field1128[var3] == null) {
                field1128[var3] = new IdkType();
            }
            field1128[var3].method372(false, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLlb;)V")
    public void method372(boolean arg0, Packet arg1) {
        if (arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method227();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1129 = arg1.method227();
                } else if (var3 == 2) {
                    int var4 = arg1.method227();
                    this.field1130 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1130[var5] = arg1.method229();
                    }
                } else if (var3 == 3) {
                    this.field1134 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1131[var3 - 40] = arg1.method229();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1132[var3 - 50] = arg1.method229();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1133[var3 - 60] = arg1.method229();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method373(int arg0) {
        if (this.field1130 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 < 9 || arg0 > 9) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < this.field1130.length; var3++) {
            if (!Model.method126(this.field1130[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Leb;")
    public Model method374(int arg0) {
        if (this.field1130 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1130.length];
        if (arg0 != 0) {
            this.field1125 = 428;
        }
        for (int var3 = 0; var3 < this.field1130.length; var3++) {
            var2[var3] = Model.method125(this.field1130[var3], this.field1124);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2, var2.length, -33019);
        }
        for (int var5 = 0; var5 < 6 && this.field1131[var5] != 0; var5++) {
            var4.method139(this.field1131[var5], this.field1132[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Z")
    public boolean method375(byte arg0) {
        if (arg0 != 0) {
            throw new NullPointerException();
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1133[var3] != -1 && !Model.method126(this.field1133[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(B)Leb;")
    public Model method376(byte arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1133[var4] != -1) {
                var2[var3++] = Model.method125(this.field1133[var4], this.field1124);
            }
        }
        if (arg0 != -45) {
            for (int var5 = 1; var5 > 0; var5++) {
            }
        }
        Model var6 = new Model(var2, var3, -33019);
        for (int var7 = 0; var7 < 6 && this.field1131[var7] != 0; var7++) {
            var6.method139(this.field1131[var7], this.field1132[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field361) {
        }
    }
}
