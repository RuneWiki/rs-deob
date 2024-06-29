import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bia")
public class class526 {

    @OriginalMember(owner = "client!bia", name = "h", descriptor = "[I")
    private int[] field7146;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "I")
    public static int field7139 = 0;

    @OriginalMember(owner = "client!bia", name = "b", descriptor = "[I")
    public static int[] field7140 = new int[] { 32, 39, 44, 47 };

    @OriginalMember(owner = "client!bia", name = "c", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!bia", name = "e", descriptor = "I")
    public static int field7143;

    @OriginalMember(owner = "client!bia", name = "f", descriptor = "I")
    public static int field7144;

    @OriginalMember(owner = "client!bia", name = "d", descriptor = "Lkw;")
    public static class264 field7142;

    @OriginalMember(owner = "client!bia", name = "g", descriptor = "Z")
    public static boolean field7145;

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(I)V")
    public static void method2991(int arg0) {
        field7142 = null;
        if (arg0 == 128) {
            field7140 = null;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(II)I")
    public final int method2992(int arg0, int arg1) {
        field7141++;
        int var3 = (this.field7146.length >> 1) - 1;
        int var4 = var3 & arg1;
        if (arg0 <= 4) {
            method2991(59);
        }
        while (true) {
            int var5 = this.field7146[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field7146[var4 + var4] == arg1) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(IIILha;Lkh;)V")
    public static final void method2993(int arg0, int arg1, int arg2, class66 arg3, class17 arg4) {
        if (arg1 != 27064) {
            method2993(109, 99, 55, null, null);
        }
        field7143++;
        class514 var5 = arg4.method102(arg3, -256);
        if (var5 == null) {
            return;
        }
        arg3.method512(arg2, arg0, arg2 + arg4.field347, arg0 - -arg4.field330);
        if (class442.field5989 == 2 || class442.field5989 == 5 || class435.field5918 == null) {
            arg3.method511(-16777216, var5, arg2, arg0);
            return;
        }
        int var6;
        int var7;
        int var8;
        int var9;
        if (class536.field7291 == 4) {
            var6 = 4096;
            var7 = class492.field6736;
            var8 = (int) (-class53.field763) & 0x3FFF;
            var9 = class229.field3347;
        } else {
            var7 = class235.field3379.field7396;
            var9 = class235.field3379.field7398;
            var6 = 4096 - (class301.field4140 * 16);
            var8 = (int) (-class53.field763) + class408.field5599 & 0x3FFF;
        }
        int var10 = -(class483.field6515 * 2) - (-(var7 / 128 + 48) - 208);
        int var11 = class65.field926 * 4 + 48 - ((class65.field926 - 104) * 2) - (var9 / 128);
        class435.field5918.method3428((float) arg4.field347 / 2.0F + (float) arg2, (float) arg4.field330 / 2.0F + (float) arg0, (float) var10, (float) var11, var6, var8 << 2, var5, arg2, arg0);
        for (class345 var12 = (class345) class578.field8188.method3589((byte) -127); var12 != null; var12 = (class345) class578.field8188.method3591(0)) {
            int var58 = var12.field4640;
            int var59 = (class333.field4502.field9443[var58] >> 14 & 0x3FFF) - class217.field3198;
            int var60 = (class333.field4502.field9443[var58] & 0x3FFF) - class400.field5510;
            int var61 = var59 * 4 - (var7 / 128 - 2);
            int var62 = var60 * 4 + 2 - (var9 / 128);
            class130.method1101(var61, arg2, var62, class333.field4502.field9447[var58], 2, arg4, var5, arg0, arg3);
        }
        for (int var13 = 0; var13 < class338.field4577; var13++) {
            int var55 = class576.field8172[var13] * 4 - ((var7 / 128) - 2);
            int var56 = class355.field4833[var13] * 4 + 2 - var9 / 128;
            class445 var57 = class414.field5670.method2319(class333.field4505[var13], false);
            if (var57.field6028 != null) {
                var57 = var57.method2580(87, class694.field9613);
                if (var57 == null || var57.field6120 == -1) {
                    continue;
                }
            }
            class130.method1101(var55, arg2, var56, var57.field6120, arg1 ^ 0x69BA, arg4, var5, arg0, arg3);
        }
        for (class234 var14 = (class234) class214.field3181.method335(arg1 ^ 0xFFFFE7CD); var14 != null; var14 = (class234) class214.field3181.method336(arg1 ^ 0x69CB)) {
            int var50 = (int) (var14.field2528 >> 28 & 0x3L);
            if (class573.field8161 == var50) {
                int var51 = (int) (var14.field2528 & 0x3FFFL) - class217.field3198;
                int var52 = (int) (var14.field2528 >> 14 & 0x3FFFL) - class400.field5510;
                int var53 = var51 * 4 + 2 - (var7 / 128);
                int var54 = var52 * 4 + 2 - var9 / 128;
                class536.method3036(var54, arg2, class766.field10566[0], var5, (byte) 70, arg0, var53, arg4);
            }
        }
        for (int var15 = 0; var15 < class610.field8520; var15++) {
            class755 var45 = (class755) class664.field9216.method337((long) class744.field10273[var15], 1);
            if (var45 != null) {
                class666 var46 = var45.field10414;
                if (var46.method3760(32767) && class235.field3379.field7391 == var46.field7391) {
                    class568 var47 = var46.field9253;
                    if (var47 != null && var47.field8023 != null) {
                        var47 = var47.method3283((byte) -126, class694.field9613);
                    }
                    if (var47 != null && var47.field8038 && var47.field8073) {
                        int var48 = var46.field7396 / 128 - (var7 / 128);
                        int var49 = var46.field7398 / 128 - var9 / 128;
                        if (var47.field8064 == -1) {
                            class536.method3036(var49, arg2, class766.field10566[1], var5, (byte) 70, arg0, var48, arg4);
                        } else {
                            class130.method1101(var48, arg2, var49, var47.field8064, arg1 ^ 0x69BA, arg4, var5, arg0, arg3);
                        }
                    }
                }
            }
        }
        int var16 = class696.field9624;
        int[] var17 = class417.field5700;
        for (int var18 = 0; var18 < var16; var18++) {
            class771 var37 = class527.field7150[var17[var18]];
            if (var37 != null && var37.method4239(32767) && !var37.field10622 && class235.field3379 != var37 && class235.field3379.field7391 == var37.field7391) {
                int var38 = var37.field7396 / 128 - var7 / 128;
                int var39 = var37.field7398 / 128 - (var9 / 128);
                boolean var40 = false;
                for (int var41 = 0; var41 < class749.field10345; var41++) {
                    if (var37.field10641.equals(class463.field6303[var41]) && class759.field10458[var41] != 0) {
                        var40 = true;
                        break;
                    }
                }
                boolean var42 = false;
                for (int var43 = 0; var43 < class683.field9510; var43++) {
                    if (var37.field10641.equals(class502.field6862[var43].field3520)) {
                        var42 = true;
                        break;
                    }
                }
                boolean var44 = false;
                if (class235.field3379.field10667 != 0 && var37.field10667 != 0 && class235.field3379.field10667 == var37.field10667) {
                    var44 = true;
                }
                if (var37.field10639) {
                    class536.method3036(var39, arg2, class766.field10566[6], var5, (byte) 70, arg0, var38, arg4);
                } else if (var40) {
                    class536.method3036(var39, arg2, class766.field10566[3], var5, (byte) 70, arg0, var38, arg4);
                } else if (var42) {
                    class536.method3036(var39, arg2, class766.field10566[5], var5, (byte) 70, arg0, var38, arg4);
                } else if (var44) {
                    class536.method3036(var39, arg2, class766.field10566[4], var5, (byte) 70, arg0, var38, arg4);
                } else {
                    class536.method3036(var39, arg2, class766.field10566[2], var5, (byte) 70, arg0, var38, arg4);
                }
            }
        }
        class12[] var19 = class13.field198;
        for (int var20 = 0; var20 < var19.length; var20++) {
            class12 var23 = var19[var20];
            if (var23 != null && var23.field194 != 0 && (class440.field5977 % 20) < 10) {
                if (var23.field194 == 1) {
                    class755 var24 = (class755) class664.field9216.method337((long) var23.field192, 1);
                    if (var24 != null) {
                        class666 var25 = var24.field10414;
                        int var26 = var25.field7396 / 128 - (var7 / 128);
                        int var27 = var25.field7398 / 128 - (var9 / 128);
                        class487.method2781(var26, 360000L, var27, arg4, arg2, 106, var5, arg0, var23.field195);
                    }
                }
                if (var23.field194 == 2) {
                    int var28 = var23.field188 / 128 - var7 / 128;
                    int var29 = var23.field187 / 128 - var9 / 128;
                    long var30 = (long) (var23.field190 << 7);
                    long var32 = var30 * var30;
                    class487.method2781(var28, var32, var29, arg4, arg2, arg1 - 26974, var5, arg0, var23.field195);
                }
                if (var23.field194 == 10 && var23.field192 >= 0 && class527.field7150.length > var23.field192) {
                    class771 var34 = class527.field7150[var23.field192];
                    if (var34 != null) {
                        int var35 = var34.field7396 / 128 - (var7 / 128);
                        int var36 = var34.field7398 / 128 - (var9 / 128);
                        class487.method2781(var35, 360000L, var36, arg4, arg2, arg1 ^ 0x69F1, var5, arg0, var23.field195);
                    }
                }
            }
        }
        if (class536.field7291 == 4) {
            return;
        }
        if (class231.field3356 != 0) {
            int var21 = class231.field3356 * 4 - ((var7 / 128 - (class235.field3379.method2342((byte) -54) - 1) * 2) - 2);
            int var22 = class392.field5380 * 4 + (-(var9 / 128) - (-(class235.field3379.method2342((byte) -60) * 2) - -2)) + 2;
            class536.method3036(var22, arg2, class521.field7068[class625.field8714 ? 1 : 0], var5, (byte) 70, arg0, var21, arg4);
        }
        if (!class235.field3379.field10622) {
            arg3.method472(25692, 3, arg4.field347 / 2 + arg2 - 1, 3, -1, arg4.field330 / 2 + arg0 - 1);
            return;
        }
    }

    @OriginalMember(owner = "client!bia", name = "a", descriptor = "(III)V")
    public static final void method2994(int arg0, int arg1, int arg2) {
        field7144++;
        class281 var3 = class54.method395((byte) -53, (long) arg1, 7);
        var3.method1821((byte) -127);
        if (arg0 > -108) {
            field7145 = true;
        }
        var3.field3910 = arg2;
    }

    @OriginalMember(owner = "client!bia", name = "<init>", descriptor = "([I)V")
    public class526(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= ((arg0.length >> 1) + arg0.length); var2 <<= 0x1) {
        }
        this.field7146 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field7146[var3] = -1;
        }
        int var4 = 0;
        while (var4 < arg0.length) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field7146[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field7146[var5 + var5] = arg0[var4];
            this.field7146[var5 + var5 + 1] = var4++;
        }
    }
}
