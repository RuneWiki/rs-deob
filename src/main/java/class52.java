import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SXDNVMNH")
public class class52 {

    @OriginalMember(owner = "SXDNVMNH", name = "e", descriptor = "I")
    public int field1447 = -1;

    @OriginalMember(owner = "SXDNVMNH", name = "f", descriptor = "Z")
    public boolean field1448 = false;

    @OriginalMember(owner = "SXDNVMNH", name = "g", descriptor = "Z")
    public boolean field1449 = true;

    @OriginalMember(owner = "SXDNVMNH", name = "a", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "SXDNVMNH", name = "d", descriptor = "I")
    public int field1446;

    @OriginalMember(owner = "SXDNVMNH", name = "h", descriptor = "I")
    public int field1450;

    @OriginalMember(owner = "SXDNVMNH", name = "i", descriptor = "I")
    public int field1451;

    @OriginalMember(owner = "SXDNVMNH", name = "j", descriptor = "I")
    public int field1452;

    @OriginalMember(owner = "SXDNVMNH", name = "k", descriptor = "I")
    public int field1453;

    @OriginalMember(owner = "SXDNVMNH", name = "l", descriptor = "I")
    public int field1454;

    @OriginalMember(owner = "SXDNVMNH", name = "m", descriptor = "I")
    public int field1455;

    @OriginalMember(owner = "SXDNVMNH", name = "c", descriptor = "Ljava/lang/String;")
    public String field1445;

    @OriginalMember(owner = "SXDNVMNH", name = "b", descriptor = "[LSXDNVMNH;")
    public static class52[] field1444;

    @OriginalMember(owner = "SXDNVMNH", name = "a", descriptor = "(LGWOEELWB;B)V")
    public static void method482(class18 arg0, byte arg1) {
        if (arg1 != 3) {
            return;
        }
        class30 var2 = new class30(true, arg0.method249("flo.dat", null));
        field1443 = var2.method298();
        if (field1444 == null) {
            field1444 = new class52[field1443];
        }
        for (int var3 = 0; var3 < field1443; var3++) {
            if (field1444[var3] == null) {
                field1444[var3] = new class52();
            }
            field1444[var3].method483(var2, (byte) 2);
        }
    }

    @OriginalMember(owner = "SXDNVMNH", name = "a", descriptor = "(LMLYYHULT;B)V")
    public void method483(class30 arg0, byte arg1) {
        if (arg1 != 2) {
            throw new NullPointerException();
        }
        while (true) {
            int var3 = arg0.method296();
            if (var3 == 0) {
                return;
            }
            if (var3 == 1) {
                this.field1446 = arg0.method300();
                this.method484(this.field1446, 0);
            } else if (var3 == 2) {
                this.field1447 = arg0.method296();
            } else if (var3 == 3) {
                this.field1448 = true;
            } else if (var3 == 5) {
                this.field1449 = false;
            } else if (var3 == 6) {
                this.field1445 = arg0.method303();
            } else if (var3 == 7) {
                int var4 = this.field1450;
                int var5 = this.field1451;
                int var6 = this.field1452;
                int var7 = this.field1453;
                int var8 = arg0.method300();
                this.method484(var8, 0);
                this.field1450 = var4;
                this.field1451 = var5;
                this.field1452 = var6;
                this.field1453 = var7;
                this.field1454 = var7;
            } else {
                System.out.println("Error unrecognised config code: " + var3);
            }
        }
    }

    @OriginalMember(owner = "SXDNVMNH", name = "a", descriptor = "(II)V")
    private void method484(int arg0, int arg1) {
        double var3 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var3;
        if (var5 < var3) {
            var9 = var5;
        }
        if (var7 < var9) {
            var9 = var7;
        }
        double var11 = var3;
        if (arg1 != 0) {
            return;
        }
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
        this.field1450 = (int) (var19 * 256.0D);
        this.field1451 = (int) (var15 * 256.0D);
        this.field1452 = (int) (var17 * 256.0D);
        if (this.field1451 < 0) {
            this.field1451 = 0;
        } else if (this.field1451 > 255) {
            this.field1451 = 255;
        }
        if (this.field1452 < 0) {
            this.field1452 = 0;
        } else if (this.field1452 > 255) {
            this.field1452 = 255;
        }
        if (var17 > 0.5D) {
            this.field1454 = (int) ((1.0D - var17) * var15 * 512.0D);
        } else {
            this.field1454 = (int) (var15 * var17 * 512.0D);
        }
        if (this.field1454 < 1) {
            this.field1454 = 1;
        }
        this.field1453 = (int) ((double) this.field1454 * var19);
        int var21 = this.field1450 + (int) (Math.random() * 16.0D) - 8;
        if (var21 < 0) {
            var21 = 0;
        } else if (var21 > 255) {
            var21 = 255;
        }
        int var22 = this.field1451 + (int) (Math.random() * 48.0D) - 24;
        if (var22 < 0) {
            var22 = 0;
        } else if (var22 > 255) {
            var22 = 255;
        }
        int var23 = this.field1452 + (int) (Math.random() * 48.0D) - 24;
        if (var23 < 0) {
            var23 = 0;
        } else if (var23 > 255) {
            var23 = 255;
        }
        this.field1455 = this.method485(var21, var22, var23);
    }

    @OriginalMember(owner = "SXDNVMNH", name = "a", descriptor = "(III)I")
    private final int method485(int arg0, int arg1, int arg2) {
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
