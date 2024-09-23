import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "b", descriptor = "I")
    private int field1099 = -949;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1102 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1104 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1105 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1106 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1107 = false;

    @OriginalMember(owner = "lc", name = "a", descriptor = "Z")
    private static boolean field1098 = true;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1103;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1101;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Lyb;B)V")
    public static void method375(Jagfile arg0, byte arg1) {
        if (arg1 != 127) {
            field1098 = !field1098;
        }
        Packet var2 = new Packet((byte) -109, arg0.method308("idk.dat", null));
        field1100 = var2.method240();
        if (field1101 == null) {
            field1101 = new IdkType[field1100];
        }
        for (int var3 = 0; var3 < field1100; var3++) {
            if (field1101[var3] == null) {
                field1101[var3] = new IdkType();
            }
            field1101[var3].method376(168, var2);
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILmb;)V")
    public void method376(int arg0, Packet arg1) {
        int var3 = 22 / arg0;
        while (true) {
            while (true) {
                int var4 = arg1.method238();
                if (var4 == 0) {
                    return;
                }
                if (var4 == 1) {
                    this.field1102 = arg1.method238();
                } else if (var4 == 2) {
                    int var5 = arg1.method238();
                    this.field1103 = new int[var5];
                    for (int var6 = 0; var6 < var5; var6++) {
                        this.field1103[var6] = arg1.method240();
                    }
                } else if (var4 == 3) {
                    this.field1107 = true;
                } else if (var4 >= 40 && var4 < 50) {
                    this.field1104[var4 - 40] = arg1.method240();
                } else if (var4 >= 50 && var4 < 60) {
                    this.field1105[var4 - 50] = arg1.method240();
                } else if (var4 >= 60 && var4 < 70) {
                    this.field1106[var4 - 60] = arg1.method240();
                } else {
                    System.out.println("Error unrecognised config code: " + var4);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (arg0 != 6) {
            throw new NullPointerException();
        } else if (this.field1103 == null) {
            return true;
        } else {
            boolean var2 = true;
            for (int var3 = 0; var3 < this.field1103.length; var3++) {
                if (!Model.method139(this.field1103[var3])) {
                    var2 = false;
                }
            }
            return var2;
        }
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Lfb;")
    public Model method378(int arg0) {
        if (this.field1103 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1103.length];
        if (arg0 <= 0) {
            for (int var3 = 1; var3 > 0; var3++) {
            }
        }
        for (int var4 = 0; var4 < this.field1103.length; var4++) {
            var2[var4] = Model.method138(this.field1103[var4], -404);
        }
        Model var5;
        if (var2.length == 1) {
            var5 = var2[0];
        } else {
            var5 = new Model(var2.length, 652, var2);
        }
        for (int var6 = 0; var6 < 6 && this.field1104[var6] != 0; var6++) {
            var5.method152(this.field1104[var6], this.field1105[var6]);
        }
        return var5;
    }

    @OriginalMember(owner = "lc", name = "c", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        boolean var2 = true;
        if (arg0 < 8 || arg0 > 8) {
            this.field1099 = 223;
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1106[var3] != -1 && !Model.method139(this.field1106[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "d", descriptor = "(I)Lfb;")
    public Model method380(int arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1106[var4] != -1) {
                var2[var3++] = Model.method138(this.field1106[var4], -404);
            }
        }
        Model var5 = new Model(var3, 652, var2);
        if (arg0 >= 0) {
            this.field1099 = -459;
        }
        for (int var6 = 0; var6 < 6 && this.field1104[var6] != 0; var6++) {
            var5.method152(this.field1104[var6], this.field1105[var6]);
        }
        return var5;
    }
}
