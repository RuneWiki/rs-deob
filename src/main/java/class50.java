import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NVLIPBUR")
public class class50 {

    @OriginalMember(owner = "NVLIPBUR", name = "h", descriptor = "I")
    public int field1270 = -1;

    @OriginalMember(owner = "NVLIPBUR", name = "i", descriptor = "Z")
    public boolean field1271 = false;

    @OriginalMember(owner = "NVLIPBUR", name = "j", descriptor = "Z")
    public boolean field1272 = true;

    @OriginalMember(owner = "NVLIPBUR", name = "a", descriptor = "Z")
    private static boolean field1263 = true;

    @OriginalMember(owner = "NVLIPBUR", name = "c", descriptor = "Z")
    private static boolean field1265 = true;

    @OriginalMember(owner = "NVLIPBUR", name = "d", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "NVLIPBUR", name = "g", descriptor = "I")
    public int field1269;

    @OriginalMember(owner = "NVLIPBUR", name = "k", descriptor = "I")
    public int field1273;

    @OriginalMember(owner = "NVLIPBUR", name = "l", descriptor = "I")
    public int field1274;

    @OriginalMember(owner = "NVLIPBUR", name = "m", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "NVLIPBUR", name = "n", descriptor = "I")
    public int field1276;

    @OriginalMember(owner = "NVLIPBUR", name = "o", descriptor = "I")
    public int field1277;

    @OriginalMember(owner = "NVLIPBUR", name = "p", descriptor = "I")
    public int field1278;

    @OriginalMember(owner = "NVLIPBUR", name = "f", descriptor = "Ljava/lang/String;")
    public String field1268;

    @OriginalMember(owner = "NVLIPBUR", name = "b", descriptor = "Z")
    private static boolean field1264;

    @OriginalMember(owner = "NVLIPBUR", name = "e", descriptor = "[LNVLIPBUR;")
    public static class50[] field1267;

    @OriginalMember(owner = "NVLIPBUR", name = "a", descriptor = "(ZLMJLXHQTQ;)V")
    public static void method324(boolean arg0, class44 arg1) {
        class69 var2 = new class69(arg1.method317("flo.dat", null), -82);
        field1266 = var2.method467();
        if (!arg0) {
            field1264 = !field1264;
        }
        if (field1267 == null) {
            field1267 = new class50[field1266];
        }
        for (int var3 = 0; var3 < field1266; var3++) {
            if (field1267[var3] == null) {
                field1267[var3] = new class50();
            }
            field1267[var3].method325(field1263, var2);
        }
    }

    @OriginalMember(owner = "NVLIPBUR", name = "a", descriptor = "(ZLXGRGMPUQ;)V")
    public void method325(boolean arg0, class69 arg1) {
        if (!arg0) {
            field1264 = !field1264;
        }
        while (true) {
            int var3 = arg1.method465();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1269 = arg1.method469();
                this.method326(this.field1269, 0);
            } else if (var3 == 2) {
                this.field1270 = arg1.method465();
            } else if (var3 == 3) {
                this.field1271 = true;
            } else if (var3 == 5) {
                this.field1272 = false;
            } else if (var3 == 6) {
                this.field1268 = arg1.method472();
            } else if (var3 == 7) {
                int var4 = this.field1273;
                int var5 = this.field1274;
                int var6 = this.field1275;
                int var7 = this.field1276;
                int var8 = arg1.method469();
                this.method326(var8, 0);
                this.field1273 = var4;
                this.field1274 = var5;
                this.field1275 = var6;
                this.field1276 = var7;
                this.field1277 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "NVLIPBUR", name = "a", descriptor = "(II)V")
    private void method326(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (arg1 != 0) {
            field1264 = !field1264;
        }
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
        this.field1273 = (int) (var19 * 256.0D);
        this.field1274 = (int) (var15 * 256.0D);
        this.field1275 = (int) (var17 * 256.0D);
        if (this.field1274 < 0) {
            this.field1274 = 0;
        } else if (this.field1274 > 255) {
            this.field1274 = 255;
        }
        if (this.field1275 < 0) {
            this.field1275 = 0;
        } else if (this.field1275 > 255) {
            this.field1275 = 255;
        }
        if (var17 > 0.5D) {
            this.field1277 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1277 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1277 < 1) {
            this.field1277 = 1;
        }
        this.field1276 = (int) ((double) this.field1277 * var19);
        int var21 = this.field1273 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1274 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1275 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1278 = this.method327(var21, var22, var23);
    }

    @OriginalMember(owner = "NVLIPBUR", name = "a", descriptor = "(III)I")
    private final int method327(int arg0, int arg1, int arg2) {
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
