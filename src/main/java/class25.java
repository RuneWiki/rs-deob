import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class25 {

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "Lhb;")
    public static class250 field436 = new class250(55, 4);

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "Loi;")
    public static class169 field438 = new class169("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "[[Z")
    public static boolean[][] field441 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field433;

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "I")
    public static int field434;

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "I")
    public static int field435;

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "I")
    public static int field437;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public static int field439;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "I")
    public static int field440;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(Ljt;Lqt;Lmv;IIIII)V", line = 6)
    public static final void method167(class402 arg0, class295 arg1, class518 arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg5 != 255) {
            method171(-126);
        }
        field437++;
        class72 var8 = new class72();
        var8.field896 = arg3 << 7;
        var8.field906 = arg7 << 7;
        var8.field892 = arg6;
        if (arg0 != null) {
            var8.field895 = arg0;
            int var9 = arg0.field5340;
            int var10 = arg0.field5396;
            if (arg4 == 1 || arg4 == 3) {
                var9 = arg0.field5396;
                var10 = arg0.field5340;
            }
            var8.field904 = arg0.field5404;
            var8.field883 = arg3 + var9 << 7;
            var8.field887 = arg0.field5413;
            var8.field902 = arg0.field5402;
            var8.field890 = arg0.field5374 << 7;
            var8.field897 = arg7 + var10 << 7;
            var8.field885 = arg0.field5352;
            var8.field905 = arg0.field5408;
            if (arg0.field5419 != null) {
                var8.field884 = true;
                var8.method409(arg5 - 160);
            }
            if (var8.field887 != null) {
                var8.field888 = (int) (Math.random() * (double) (var8.field905 - var8.field904)) + var8.field904;
            }
            class315.field4060.method42(var8, arg5 - 255);
        } else if (arg1 != null) {
            var8.field891 = arg1;
            class10 var11 = arg1.field3831;
            if (var11.field111 != null) {
                var8.field884 = true;
                var11 = var11.method63(false, class198.field2555);
            }
            if (var11 != null) {
                var8.field883 = arg3 + var11.field128 << 7;
                var8.field897 = arg7 + var11.field128 << 7;
                var8.field902 = class485.method2902(arg1, (byte) 74);
                var8.field885 = var11.field137;
                var8.field890 = var11.field106 << 7;
            }
            class368.field4741.method42(var8, 0);
        } else if (arg2 != null) {
            var8.field894 = arg2;
            var8.field883 = arg3 + arg2.method2342(arg5 ^ 0x2ACB) << 7;
            var8.field897 = arg2.method2342(10804) + arg7 << 7;
            var8.field902 = class470.method2822(arg5 ^ 0xE7, arg2);
            var8.field890 = arg2.field7662 << 7;
            var8.field885 = arg2.field7652;
            class157.field2072.method2096((long) arg2.field5159, var8, (byte) 76);
            return;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V", line = 98)
    public static void method168(int arg0) {
        if (arg0 < 76) {
            method168(15);
        }
        field441 = null;
        field438 = null;
        field436 = null;
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(IZI)V", line = 114)
    public static final void method169(int arg0, boolean arg1, int arg2) {
        if (!arg1) {
            field435++;
            class436 var3 = class459.method2712(1, arg0, -1759243680);
            var3.method2574((byte) 34);
            var3.field5980 = arg2;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILwt;Z)Z", line = 128)
    public static final boolean method170(int arg0, class16 arg1, boolean arg2) {
        field434++;
        int var3 = arg1.method100((byte) 43, 2);
        if (var3 == 0) {
            if (arg1.method100((byte) -108, 1) != 0) {
                method170(arg0, arg1, false);
            }
            int var4 = arg1.method100((byte) -128, 6);
            int var5 = arg1.method100((byte) 80, 6);
            boolean var6 = arg1.method100((byte) -65, 1) == 1;
            if (var6) {
                class290.field3718[class415.field5519++] = arg0;
            }
            if (class76.field952[arg0] != null) {
                throw new RuntimeException("hr:lr");
            }
            class117 var7 = class351.field4491[arg0];
            class518 var8 = class76.field952[arg0] = new class518();
            var8.field5159 = arg0;
            if (class514.field7559[arg0] != null) {
                var8.method3084(class514.field7559[arg0], 0);
            }
            var8.method2344(var7.field1640, -18840);
            var8.field5202 = var7.field1634;
            int var9 = var7.field1635;
            int var10 = var9 >> 28;
            int var11 = var9 >> 14 & 0xFF;
            var8.field7649 = var7.field1642;
            int var12 = var9 & 0xFF;
            var8.field5248[0] = class332.field4257[arg0];
            var8.field6220 = (byte) var10;
            var8.method3083((var11 << 6) + var4 - class35.field545, (var12 << 6) - -var5 + -class336.field4299, -13603);
            var8.field7651 = false;
            class351.field4491[arg0] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg1.method100((byte) -78, 2);
            int var14 = class351.field4491[arg0].field1635;
            class351.field4491[arg0].field1635 = ((var14 >> 28) + var13 & 0x3 << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg1.method100((byte) -84, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class351.field4491[arg0].field1635;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FF241) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var21--;
                var20--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var20++;
                var21--;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class351.field4491[arg0].field1635 = (var19 << 28) + var21 + (var20 << 14);
            return false;
        } else {
            int var22 = arg1.method100((byte) -84, 18);
            int var23 = var22 >> 16;
            if (arg2) {
                method168(21);
            }
            int var24 = (var22 & 0xFFEB) >> 8;
            int var25 = var22 & 0xFF;
            int var26 = class351.field4491[arg0].field1635;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class351.field4491[arg0].field1635 = (var28 << 14) + (var27 << 28) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "(I)V", line = 285)
    public static final void method171(int arg0) {
        field433++;
        if (class9.field97 != null) {
            return;
        }
        class9.field97 = new int[65536];
        double var1 = Math.random() * 0.03D + 0.7D - 0.015D;
        if (arg0 != 21991) {
            method169(48, true, -92);
        }
        for (int var3 = 0; var3 < 65536; var3++) {
            double var4 = (double) (var3 >> 10 & 0x3F) / 64.0D + 0.0078125D;
            double var6 = (double) (var3 >> 7 & 0x7) / 8.0D + 0.0625D;
            double var8 = (double) (var3 & 0x7F) / 128.0D;
            double var10 = var8;
            double var12 = var8;
            double var14 = var8;
            if (var6 != 0.0D) {
                double var16;
                if (var8 < 0.5D) {
                    var16 = (var6 + 1.0D) * var8;
                } else {
                    var16 = var6 + var8 - (var6 * var8);
                }
                double var18 = var8 * 2.0D - var16;
                double var20 = var4 + 0.3333333333333333D;
                if (var20 > 1.0D) {
                    var20--;
                }
                double var24 = var4 - 0.3333333333333333D;
                if (var20 * 6.0D < 1.0D) {
                    var10 = (var16 - var18) * 6.0D * var20 + var18;
                } else if (var20 * 2.0D < 1.0D) {
                    var10 = var16;
                } else if ((var20 * 3.0D < 2.0D)) {
                    var10 = (var16 - var18) * (0.6666666666666666D - var20) * 6.0D + var18;
                } else {
                    var10 = var18;
                }
                if (var24 < 0.0D) {
                    var24++;
                }
                if (var4 * 6.0D < 1.0D) {
                    var12 = (var16 - var18) * 6.0D * var4 + var18;
                } else if ((var4 * 2.0D < 1.0D)) {
                    var12 = var16;
                } else if (var4 * 3.0D < 2.0D) {
                    var12 = (var16 - var18) * (0.6666666666666666D - var4) * 6.0D + var18;
                } else {
                    var12 = var18;
                }
                if (var24 * 6.0D < 1.0D) {
                    var14 = (var16 - var18) * 6.0D * var24 + var18;
                } else if ((var24 * 2.0D < 1.0D)) {
                    var14 = var16;
                } else if ((var24 * 3.0D < 2.0D)) {
                    var14 = (var16 - var18) * (0.6666666666666666D - var24) * 6.0D + var18;
                } else {
                    var14 = var18;
                }
            }
            double var26 = Math.pow(var10, var1);
            double var28 = Math.pow(var12, var1);
            double var30 = Math.pow(var14, var1);
            int var32 = (int) (var26 * 256.0D);
            int var33 = (int) (var28 * 256.0D);
            int var34 = (int) (var30 * 256.0D);
            int var35 = (var32 << 16) + (var33 << 8) + var34;
            class9.field97[var3] = var35;
        }
    }
}
