import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("kc")
public class FloType {

    @OriginalMember(owner = "kc", name = "a", descriptor = "I")
    private int field1087 = 4;

    @OriginalMember(owner = "kc", name = "e", descriptor = "I")
    public int field1091 = -1;

    @OriginalMember(owner = "kc", name = "f", descriptor = "Z")
    public boolean field1092 = false;

    @OriginalMember(owner = "kc", name = "g", descriptor = "Z")
    public boolean field1093 = true;

    @OriginalMember(owner = "kc", name = "b", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "kc", name = "d", descriptor = "I")
    public int field1090;

    @OriginalMember(owner = "kc", name = "i", descriptor = "I")
    public int field1095;

    @OriginalMember(owner = "kc", name = "j", descriptor = "I")
    public int field1096;

    @OriginalMember(owner = "kc", name = "k", descriptor = "I")
    public int field1097;

    @OriginalMember(owner = "kc", name = "l", descriptor = "I")
    public int field1098;

    @OriginalMember(owner = "kc", name = "m", descriptor = "I")
    public int field1099;

    @OriginalMember(owner = "kc", name = "n", descriptor = "I")
    public int field1100;

    @OriginalMember(owner = "kc", name = "h", descriptor = "Ljava/lang/String;")
    public String field1094;

    @OriginalMember(owner = "kc", name = "c", descriptor = "[Lkc;")
    public static FloType[] field1089;

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ILyb;)V")
    public static void method371(int arg0, Jagfile arg1) {
        if (arg0 < 3 || arg0 > 3) {
            return;
        }
        Packet var2 = new Packet(arg1.method308("flo.dat", null), false);
        field1088 = var2.method240();
        if (field1089 == null) {
            field1089 = new FloType[field1088];
        }
        for (int var3 = 0; var3 < field1088; var3++) {
            if (field1089[var3] == null) {
                field1089[var3] = new FloType();
            }
            field1089[var3].method372(true, var2);
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(ZLmb;)V")
    public void method372(boolean arg0, Packet arg1) {
        if (!arg0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method238();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1090 = arg1.method242();
                this.method373(this.field1087, this.field1090);
            } else if (var3 == 2) {
                this.field1091 = arg1.method238();
            } else if (var3 == 3) {
                this.field1092 = true;
            } else if (var3 == 5) {
                this.field1093 = false;
            } else if (var3 == 6) {
                this.field1094 = arg1.method245();
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(II)V")
    private void method373(int arg0, int arg1) {
        double var3 = (double) (arg1 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg1 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg1 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (var5 > var3) {
            var11 = var5;
        }
        if (var7 > var11) {
            var11 = var7;
        }
        double var13 = 0.0D;
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var11 - var9) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var11 - var9) / (2.0D - var11 - var9);
            }
            if (var3 == var11) {
                var13 = (var5 - var7) / (var11 - var9);
            } else if (var5 == var11) {
                var13 = (var7 - var3) / (var11 - var9) + 2.0D;
            } else if (var7 == var11) {
                var13 = (var3 - var5) / (var11 - var9) + 4.0D;
            }
        }
        double var19 = var13 / 6.0D;
        this.field1095 = (int) (var19 * 256.0D);
        this.field1096 = (int) (var15 * 256.0D);
        if (arg0 != 4) {
            return;
        }
        this.field1097 = (int) (var17 * 256.0D);
        if (this.field1096 < 0) {
            this.field1096 = 0;
        } else if (this.field1096 > 255) {
            this.field1096 = 255;
        }
        if (this.field1097 < 0) {
            this.field1097 = 0;
        } else if (this.field1097 > 255) {
            this.field1097 = 255;
        }
        if (var17 > 0.5D) {
            this.field1099 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1099 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1099 < 1) {
            this.field1099 = 1;
        }
        this.field1098 = (int) ((double) this.field1099 * var19);
        int var21 = this.field1095 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1096 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1097 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1100 = this.method374(var21, var22, var23);
    }

    @OriginalMember(owner = "kc", name = "a", descriptor = "(III)I")
    private final int method374(int arg0, int arg1, int arg2) {
        if (arg2 > 179) {
            arg1 /= 2;
        }
        if (arg2 > 192) {
            arg1 /= 2;
        }
        if (arg2 > 217) {
            arg1 /= 2;
        }
        if (arg2 > 243) {
            arg1 /= 2;
        }
        return arg2 / 2 + (arg0 / 4 << 10) + (arg1 / 32 << 7);
    }
}
