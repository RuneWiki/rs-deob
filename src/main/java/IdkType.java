import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private int field1125 = 9;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private boolean field1126 = true;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1129 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1131 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1132 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1133 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1134 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1127;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1130;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1128;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lyb;I)V")
    public static void method377(Jagfile arg0, int arg1) {
        Packet var2 = new Packet(45427, arg0.method309("idk.dat", null));
        if (arg1 <= 0) {
            return;
        }
        field1127 = var2.method241();
        if (field1128 == null) {
            field1128 = new IdkType[field1127];
        }
        for (int var3 = 0; var3 < field1127; var3++) {
            if (field1128[var3] == null) {
                field1128[var3] = new IdkType();
            }
            field1128[var3].method378(var2, (byte) 66);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lmb;B)V")
    public void method378(Packet arg0, byte arg1) {
        if (arg1 != 66) {
            this.field1125 = -366;
        }
        while (true) {
            while (true) {
                int var3 = arg0.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1129 = arg0.method239();
                } else if (var3 == 2) {
                    int var4 = arg0.method239();
                    this.field1130 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1130[var5] = arg0.method241();
                    }
                } else if (var3 == 3) {
                    this.field1134 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1131[var3 - 40] = arg0.method241();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1132[var3 - 50] = arg0.method241();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1133[var3 - 60] = arg0.method241();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Z")
    public boolean method379(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        if (this.field1130 == null) {
            return true;
        }
        boolean var4 = true;
        for (int var5 = 0; var5 < this.field1130.length; var5++) {
            if (!Model.method140(this.field1130[var5])) {
                var4 = false;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Lfb;")
    public Model method380(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        if (this.field1130 == null) {
            return null;
        }
        Model[] var3 = new Model[this.field1130.length];
        for (int var4 = 0; var4 < this.field1130.length; var4++) {
            var3[var4] = Model.method139(0, this.field1130[var4]);
        }
        Model var5;
        if (var3.length == 1) {
            var5 = var3[0];
        } else {
            var5 = new Model(var3.length, var3, -38792);
        }
        for (int var6 = 0; var6 < 6 && this.field1131[var6] != 0; var6++) {
            var5.method153(this.field1131[var6], this.field1132[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method381(int arg0) {
        boolean var2 = true;
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1133[var3] != -1 && !Model.method140(this.field1133[var3])) {
                var2 = false;
            }
        }
        if (arg0 != 0) {
            this.field1126 = !this.field1126;
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Lfb;")
    public Model method382(boolean arg0) {
        Model[] var2 = new Model[5];
        if (arg0) {
            this.field1126 = !this.field1126;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1133[var4] != -1) {
                var2[var3++] = Model.method139(0, this.field1133[var4]);
            }
        }
        Model var5 = new Model(var3, var2, -38792);
        for (int var6 = 0; var6 < 6 && this.field1131[var6] != 0; var6++) {
            var5.method153(this.field1131[var6], this.field1132[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field393) {
        }
    }
}
