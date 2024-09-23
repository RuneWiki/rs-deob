import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("lc")
public class IdkType {

    @OriginalMember(owner = "lc", name = "a", descriptor = "I")
    private int field1101 = 5;

    @OriginalMember(owner = "lc", name = "e", descriptor = "I")
    public int field1105 = -1;

    @OriginalMember(owner = "lc", name = "g", descriptor = "[I")
    public int[] field1107 = new int[6];

    @OriginalMember(owner = "lc", name = "h", descriptor = "[I")
    public int[] field1108 = new int[6];

    @OriginalMember(owner = "lc", name = "i", descriptor = "[I")
    public int[] field1109 = new int[] { -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "lc", name = "j", descriptor = "Z")
    public boolean field1110 = false;

    @OriginalMember(owner = "lc", name = "c", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "lc", name = "b", descriptor = "Z")
    private static boolean field1102;

    @OriginalMember(owner = "lc", name = "f", descriptor = "[I")
    public int[] field1106;

    @OriginalMember(owner = "lc", name = "d", descriptor = "[Llc;")
    public static IdkType[] field1104;

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ILyb;)V")
    public static void method375(int arg0, Jagfile arg1) {
        Packet var2 = new Packet(arg1.method308("idk.dat", null), false);
        field1103 = var2.method240();
        if (field1104 == null) {
            field1104 = new IdkType[field1103];
        }
        for (int var3 = 0; var3 < field1103; var3++) {
            if (field1104[var3] == null) {
                field1104[var3] = new IdkType();
            }
            field1104[var3].method376(true, var2);
        }
        if (arg0 < 3 || arg0 > 3) {
            field1102 = !field1102;
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(ZLmb;)V")
    public void method376(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        while (true) {
            while (true) {
                int var3 = arg1.method238();
                if (var3 == 0) {
                    return;
                }
                if (var3 == 1) {
                    this.field1105 = arg1.method238();
                } else if (var3 == 2) {
                    int var4 = arg1.method238();
                    this.field1106 = new int[var4];
                    for (int var5 = 0; var5 < var4; var5++) {
                        this.field1106[var5] = arg1.method240();
                    }
                } else if (var3 == 3) {
                    this.field1110 = true;
                } else if (var3 >= 40 && var3 < 50) {
                    this.field1107[var3 - 40] = arg1.method240();
                } else if (var3 >= 50 && var3 < 60) {
                    this.field1108[var3 - 50] = arg1.method240();
                } else if (var3 >= 60 && var3 < 70) {
                    this.field1109[var3 - 60] = arg1.method240();
                } else {
                    System.out.println("Error unrecognised config code: " + var3);
                }
            }
        }
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(I)Z")
    public boolean method377(int arg0) {
        if (arg0 != 0) {
            this.field1101 = 195;
        }
        if (this.field1106 == null) {
            return true;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < this.field1106.length; var3++) {
            if (!Model.method139(this.field1106[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(Z)Lfb;")
    public Model method378(boolean arg0) {
        if (this.field1106 == null) {
            return null;
        }
        Model[] var2 = new Model[this.field1106.length];
        for (int var3 = 0; var3 < this.field1106.length; var3++) {
            var2[var3] = Model.method138(this.field1106[var3], -58);
        }
        Model var4;
        if (var2.length == 1) {
            var4 = var2[0];
        } else {
            var4 = new Model(false, var2, var2.length);
        }
        for (int var5 = 0; var5 < 6 && this.field1107[var5] != 0; var5++) {
            var4.method152(this.field1107[var5], this.field1108[var5]);
        }
        if (!arg0) {
            throw new NullPointerException();
        }
        return var4;
    }

    @OriginalMember(owner = "lc", name = "b", descriptor = "(I)Z")
    public boolean method379(int arg0) {
        boolean var2 = true;
        if (arg0 != 8) {
            throw new NullPointerException();
        }
        for (int var3 = 0; var3 < 5; var3++) {
            if (this.field1109[var3] != -1 && !Model.method139(this.field1109[var3])) {
                var2 = false;
            }
        }
        return var2;
    }

    @OriginalMember(owner = "lc", name = "a", descriptor = "(B)Lfb;")
    public Model method380(byte arg0) {
        Model[] var2 = new Model[5];
        int var3 = 0;
        for (int var4 = 0; var4 < 5; var4++) {
            if (this.field1109[var4] != -1) {
                var2[var3++] = Model.method138(this.field1109[var4], -58);
            }
        }
        Model var5 = new Model(false, var2, var3);
        for (int var6 = 0; var6 < 6 && this.field1107[var6] != 0; var6++) {
            var5.method152(this.field1107[var6], this.field1108[var6]);
        }
        if (arg0 != 7) {
            throw new NullPointerException();
        }
        return var5;
    }
}
