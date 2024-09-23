import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "B")
    private byte field1123 = -41;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private boolean field1124 = true;

    @OriginalMember(owner = "lc", name = "f", descriptor = "I")
    public int field1128 = -1;

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1130 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1131 = new int[6];

    @OriginalMember(owner = "lc", name = "j", descriptor = "[I")
    public int[] field1132 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "k", descriptor = "Z")
    public boolean field1133 = false;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public static int field1126;

    @OriginalMember(owner = "lc", name = "c", descriptor = "Z")
    private static boolean field1125;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1129;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[Llc;")
    public static IdkType[] field1127;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lxb;Z)V")
    public static void method375(Jagfile arg0, boolean arg1) {
        if (arg1) {
            field1125 = !field1125;
        }
        Packet var2 = new Packet(-49365, arg0.method299("idk.dat", null));
        field1126 = var2.method231();
        if (field1127 == null) {
            field1127 = new IdkType[field1126];
        }
        for (int var3 = 0; var3 < field1126; var3++) {
            if (field1127[var3] == null) {
                field1127[var3] = new IdkType();
            }
            field1127[var3].method376(var2, false);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Llb;Z)V")
    public void method376(Packet arg0, boolean arg1) {
        if (arg1) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        while (true) {
            while (true) {
                int var4 = arg0.method229();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1128 = arg0.method229();
                } else if (var4 == 2) {
                    int var5 = arg0.method229();
                    this.field1129 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1129[var6] = arg0.method231();
                    }
                } else if (var4 == 3) {
                    this.field1133 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1130[var4 - 40] = arg0.method231();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1131[var4 - 50] = arg0.method231();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1132[var4 - 60] = arg0.method231();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1129 == null) {
            return true;
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field1129.length; var4++) {
            if (!Model.method127(this.field1129[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Leb;")
    public Model method378(byte arg0) {
        if (arg0 != 5) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1129 == null) {
            return null;
        }
        Model[] var3 = new Model[this.field1129.length];
        for (int var4 = 0; var4 < this.field1129.length; var4++) {
            var3[var4] = Model.method126(0, this.field1129[var4]);
        }
        Model var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new Model(var3, this.field1123, var3.length);
        }
        for (int var6 = 0; var6 < 6 && this.field1130[var6] != 0; var6++) {
            var5.method140(this.field1130[var6], this.field1131[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Z")
    public boolean method379(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1132[var4] != -1 && !Model.method127(this.field1132[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(Z)Leb;")
    public Model method380(boolean arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1132[var4] != -1) {
                var2[var3++] = Model.method126(0, this.field1132[var4]);
            }
        }
        if (!arg0) {
            this.field1124 = !this.field1124;
        }
        Model var5 = new Model(var2, this.field1123, var3);
        for (int var6 = 0; var6 < 6 && this.field1130[var6] != 0; var6++) {
            var5.method140(this.field1130[var6], this.field1131[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field367) {
        }
    }
}
