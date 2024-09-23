import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MQVXAZFZ")
public class class34 {

    @OriginalMember(owner = "MQVXAZFZ", name = "b", descriptor = "Z")
    private boolean field1043 = false;

    @OriginalMember(owner = "MQVXAZFZ", name = "g", descriptor = "I")
    public int field1048 = -1;

    @OriginalMember(owner = "MQVXAZFZ", name = "h", descriptor = "Z")
    public boolean field1049 = false;

    @OriginalMember(owner = "MQVXAZFZ", name = "i", descriptor = "Z")
    public boolean field1050 = true;

    @OriginalMember(owner = "MQVXAZFZ", name = "a", descriptor = "B")
    private static byte field1042 = -27;

    @OriginalMember(owner = "MQVXAZFZ", name = "c", descriptor = "I")
    public static int field1044;

    @OriginalMember(owner = "MQVXAZFZ", name = "f", descriptor = "I")
    public int field1047;

    @OriginalMember(owner = "MQVXAZFZ", name = "j", descriptor = "I")
    public int field1051;

    @OriginalMember(owner = "MQVXAZFZ", name = "k", descriptor = "I")
    public int field1052;

    @OriginalMember(owner = "MQVXAZFZ", name = "l", descriptor = "I")
    public int field1053;

    @OriginalMember(owner = "MQVXAZFZ", name = "m", descriptor = "I")
    public int field1054;

    @OriginalMember(owner = "MQVXAZFZ", name = "n", descriptor = "I")
    public int field1055;

    @OriginalMember(owner = "MQVXAZFZ", name = "o", descriptor = "I")
    public int field1056;

    @OriginalMember(owner = "MQVXAZFZ", name = "e", descriptor = "Ljava/lang/String;")
    public String field1046;

    @OriginalMember(owner = "MQVXAZFZ", name = "d", descriptor = "[LMQVXAZFZ;")
    public static class34[] field1045;

    @OriginalMember(owner = "MQVXAZFZ", name = "a", descriptor = "(ILQKFGLETG;)V")
    public static void method358(int arg0, class50 arg1) {
        class68 var2 = new class68((byte) 9, arg1.method402("flo.dat", null));
        if (arg0 != 0) {
            return;
        }
        field1044 = var2.method536();
        if (field1045 == null) {
            field1045 = new class34[field1044];
        }
        for (int var3 = 0; var3 < field1044; var3++) {
            if (field1045[var3] == null) {
                field1045[var3] = new class34();
            }
            field1045[var3].method359(field1042, var2);
        }
    }

    @OriginalMember(owner = "MQVXAZFZ", name = "a", descriptor = "(BLXJCNBMKS;)V")
    public void method359(byte arg0, class68 arg1) {
        if (field1042 != arg0) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg1.method534();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1047 = arg1.method538();
                this.method360((byte) -60, this.field1047);
            } else if (var3 == 2) {
                this.field1048 = arg1.method534();
            } else if (var3 == 3) {
                this.field1049 = true;
            } else if (var3 == 5) {
                this.field1050 = false;
            } else if (var3 == 6) {
                this.field1046 = arg1.method541();
            } else if (var3 == 7) {
                int var4 = this.field1051;
                int var5 = this.field1052;
                int var6 = this.field1053;
                int var7 = this.field1054;
                int var8 = arg1.method538();
                this.method360((byte) -60, var8);
                this.field1051 = var4;
                this.field1052 = var5;
                this.field1053 = var6;
                this.field1054 = var7;
                this.field1055 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "MQVXAZFZ", name = "a", descriptor = "(BI)V")
    private void method360(byte arg0, int arg1) {
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
        this.field1051 = (int) (var19 * 256.0D);
        if (arg0 != -60) {
            this.field1043 = !this.field1043;
        }
        this.field1052 = (int) (var15 * 256.0D);
        this.field1053 = (int) (var17 * 256.0D);
        if (this.field1052 < 0) {
            this.field1052 = 0;
        } else if (this.field1052 > 255) {
            this.field1052 = 255;
        }
        if (this.field1053 < 0) {
            this.field1053 = 0;
        } else if (this.field1053 > 255) {
            this.field1053 = 255;
        }
        if (var17 > 0.5D) {
            this.field1055 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1055 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1055 < 1) {
            this.field1055 = 1;
        }
        this.field1054 = (int) ((double) this.field1055 * var19);
        int var21 = this.field1051 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1052 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1053 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1056 = this.method361(var21, var22, var23);
    }

    @OriginalMember(owner = "MQVXAZFZ", name = "a", descriptor = "(III)I")
    private final int method361(int arg0, int arg1, int arg2) {
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
