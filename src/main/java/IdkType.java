import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private boolean field1096 = true;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private boolean field1097 = true;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1100 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1102 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1103 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1104 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1105 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1098;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1101;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1099;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLyb;)V")
    public static void method377(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(16, arg1.method309("idk.dat", null));
        field1098 = var2.method241();
        if (!arg0) {
            return;
        }
        if (field1099 == null) {
            field1099 = new IdkType[field1098];
        }
        for (int var3 = 0; var3 < field1098; var3++) {
            if (field1099[var3] == null) {
                field1099[var3] = new IdkType();
            }
            field1099[var3].method378(891, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILmb;)V")
    public void method378(int arg0, Packet arg1) {
        int var3 = 67 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method239();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1100 = arg1.method239();
                } else if (var4 == 2) {
                    int var5 = arg1.method239();
                    this.field1101 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1101[var6] = arg1.method241();
                    }
                } else if (var4 == 3) {
                    this.field1105 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1102[var4 - 40] = arg1.method241();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1103[var4 - 50] = arg1.method241();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1104[var4 - 60] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Z")
    public boolean method379(byte arg0) {
        if (this.field1101 == null) {
            return true;
        }
        boolean var2 = true;
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        boolean var3 = false;
        for (int var4 = 0; var4 < this.field1101.length; var4++) {
            if (!Model.method140(this.field1101[var4])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Lfb;")
    public Model method380(int arg0) {
        if (arg0 >= 0) {
            this.field1097 = !this.field1097;
        }
        if (this.field1101 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1101.length];
        for (int var3 = 0; var3 < this.field1101.length; var3++) {
            var2[var3] = Model.method139(this.field1096, this.field1101[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2, var2.length, (byte) 2);
        }
        for (int var5 = 0; var5 < 6 && this.field1102[var5] != 0; var5++) {
            var4.method153(this.field1102[var5], this.field1103[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method381(int arg0) {
        boolean var2 = true;
        if (arg0 != 0) {
            this.field1097 = !this.field1097;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1104[var3] != -1 && !Model.method140(this.field1104[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "c", descriptor = "(I)Lfb;")
    public Model method382(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        if (arg0 != 8) {
            for (int var4 = 1; var4 > 0; var4++) {
            }
        }
        for (int var5 = 0; var5 < 5; var5++) {
            if (this.field1104[var5] != -1) {
                var2[var3++] = Model.method139(this.field1096, this.field1104[var5]);
            }
        }
        Model var6 = new Model(var2, var3, (byte) 2);
        for (int var7 = 0; var7 < 6 && this.field1102[var7] != 0; var7++) {
            var6.method153(this.field1102[var7], this.field1103[var7]);
        }
        return var6;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field377) {
        }
    }
}
