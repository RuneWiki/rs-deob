import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private boolean field1089 = false;

    @OriginalMember(owner = "lc", name = "d", descriptor = "I")
    public int field1092 = -1;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1094 = new int[6];

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1095 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1096 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "i", descriptor = "Z")
    public boolean field1097 = false;

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "lc", name = "e", descriptor = "[I")
    public int[] field1093;

    @OriginalMember(owner = "lc", name = "c", descriptor = "[Llc;")
    public static IdkType[] field1091;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLyb;)V")
    public static void method377(boolean arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method309("idk.dat", null), (byte) 3);
        field1090 = var2.method241();
        if (!arg0) {
            return;
        }
        if (field1091 == null) {
            field1091 = new IdkType[field1090];
        }
        for (int var3 = 0; var3 < field1090; var3++) {
            if (field1091[var3] == null) {
                field1091[var3] = new IdkType();
            }
            field1091[var3].method378(9, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILmb;)V")
    public void method378(int arg0, Packet arg1) {
        if (arg0 < 9 || arg0 > 9) {
            this.field1089 = !this.field1089;
        }
        while (true) {
            while (true) {
                int var3 = arg1.method239();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1092 = arg1.method239();
                } else if (var3 == 2) {
                    int var4 = arg1.method239();
                    this.field1093 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1093[var5] = arg1.method241();
                    }
                } else if (var3 == 3) {
                    this.field1097 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1094[var3 - 40] = arg1.method241();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1095[var3 - 50] = arg1.method241();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1096[var3 - 60] = arg1.method241();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Z")
    public boolean method379(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (this.field1093 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1093.length; var3++) {
                if (!Model.method140(this.field1093[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(Z)Lfb;")
    public Model method380(boolean arg0) {
        if (!arg0) {
            this.field1089 = !this.field1089;
        }
        if (this.field1093 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1093.length];
        for (int var3 = 0; var3 < this.field1093.length; var3++) {
            var2[var3] = Model.method139(0, this.field1093[var3]);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(var2, var2.length, -928);
        }
        for (int var5 = 0; var5 < 6 && this.field1094[var5] != 0; var5++) {
            var4.method153(this.field1094[var5], this.field1095[var5]);
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method381(int arg0) {
        if (arg0 != 0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1096[var4] != -1 && !Model.method140(this.field1096[var4])) {
                var3 = false;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Lfb;")
    public Model method382(byte arg0) {
        if (arg0 != 9) {
            throw new NullPointerException();
        }
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1096[var4] != -1) {
                var2[var3++] = Model.method139(0, this.field1096[var4]);
            }
        }
        Model var5 = new Model(var2, var3, -928);
        for (int var6 = 0; var6 < 6 && this.field1094[var6] != 0; var6++) {
            var5.method153(this.field1094[var6], this.field1095[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "<init>", descriptor = "()V")
    public IdkType() {
        if (Linkable.field377) {
        }
    }
}
