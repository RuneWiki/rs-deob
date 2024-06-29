import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class317 extends class211 {

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "[Ljava/lang/String;")
    private static final String[] field5031 = new String[] { method2687(method2686("\u0002h:d6")), method2687(method2686("\u0002h:o6")), method2687(method2686("\u0002h:g6")), method2687(method2686("\u0017$:\bc")), method2687(method2686("\u0002\u007fxJ")), method2687(method2686("\u0002h:e6")) };

    @OriginalMember(owner = "client!nb", name = "H", descriptor = "Z")
    public static boolean field5026 = false;

    @OriginalMember(owner = "client!nb", name = "I", descriptor = "I")
    public static int field5024;

    @OriginalMember(owner = "client!nb", name = "G", descriptor = "I")
    public static int field5025;

    @OriginalMember(owner = "client!nb", name = "F", descriptor = "I")
    public static int field5027;

    @OriginalMember(owner = "client!nb", name = "J", descriptor = "I")
    public static int field5028;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field5029;

    @OriginalMember(owner = "client!nb", name = "K", descriptor = "I")
    public static int field5030;

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(II)[[I", line = 8)
    public final int[][] method234(int arg0, int arg1) {
        try {
            if (arg1 >= -38) {
                field5029 = -126;
            }
            ++field5028;
            int[][] var3 = super.field3230.method5463((byte) -8, arg0);
            if (super.field3230.field10931) {
                int[] var4 = this.method1856(2, arg0, 104);
                int[][] var5 = this.method1853(0, 0, arg0);
                int[][] var6 = this.method1853(1, 0, arg0);
                int[] var7 = var3[0];
                int[] var8 = var3[1];
                int[] var9 = var3[2];
                int[] var10 = var5[0];
                int[] var11 = var5[1];
                int[] var12 = var5[2];
                int[] var13 = var6[0];
                int[] var14 = var6[1];
                int[] var15 = var6[2];
                for (int var16 = 0; var16 < class343.field5332; ++var16) {
                    int var17 = var4[var16];
                    if (~var17 != -4097) {
                        if (var17 != 0) {
                            int var18 = -var17 + 4096;
                            var7[var16] = var10[var16] * var17 + var13[var16] * var18 >> 12;
                            var8[var16] = var11[var16] * var17 - -(var14[var16] * var18) >> 12;
                            var9[var16] = var12[var16] * var17 + var15[var16] * var18 >> 12;
                        } else {
                            var7[var16] = var13[var16];
                            var8[var16] = var14[var16];
                            var9[var16] = var15[var16];
                        }
                    } else {
                        var7[var16] = var10[var16];
                        var8[var16] = var11[var16];
                        var9[var16] = var12[var16];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var20) {
            throw class759.method5498(var20, field5031[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IILha;ILcn;)V", line = 87)
    public static final void method2685(int arg0, int arg1, class66 arg2, int arg3, class541 arg4) {
        try {
            ++field5030;
            class512 var5 = arg4.method4090(-28749, arg2);
            if (var5 != null) {
                arg2.method489(arg3, arg1, arg4.field8029 + arg3, arg4.field8045 + arg1);
                if (arg0 > 122) {
                    if (~class582.field8619 != -3 && ~class582.field8619 != -6 && class338.field5274 != null) {
                        int var6;
                        int var7;
                        int var8;
                        int var9;
                        if (~class185.field2559 != -5) {
                            var6 = 16383 & (int) (-class377.field5748) + class550.field8201;
                            var7 = class225.field3446.field6197;
                            var8 = class225.field3446.field6211;
                            var9 = -(class681.field9866 * 16) + 4096;
                        } else {
                            var9 = 4096;
                            var7 = class194.field2605;
                            var6 = 16383 & (int) (-class377.field5748);
                            var8 = class114.field1356;
                        }
                        int var10 = var7 / 128 + 48 + -((class648.field9378 + -104) * 2);
                        int var11 = -(class659.field9506 * 2) - (-208 - (class659.field9506 * 4 + -(var8 / 128) + 48));
                        class338.field5274.method4348((float) arg4.field8029 / 2.0F + (float) arg3, (float) arg4.field8045 / 2.0F + (float) arg1, (float) var10, (float) var11, var9, var6 << 2, var5, arg3, arg1);
                        for (class609 var12 = (class609) class265.field4056.method3863((byte) 64); var12 != null; var12 = (class609) class265.field4056.method3862(-353)) {
                            int var13 = var12.field8902;
                            int var14 = ((class224.field3436.field6050[var13] & 268421958) >> 14) + -class494.field7101;
                            int var15 = (class224.field3436.field6050[var13] & 16383) + -class281.field4219;
                            int var16 = var14 * 4 + 2 - var7 / 128;
                            int var17 = var15 * 4 + -(var8 / 128) + 2;
                            class432.method3311(var16, arg2, arg3, var17, arg4, arg1, 2376, class224.field3436.field6049[var13], var5);
                        }
                        for (int var18 = 0; ~class296.field4505 < ~var18; ++var18) {
                            int var19 = class271.field4111[var18] * 4 + 2 - var7 / 128;
                            int var20 = class569.field8418[var18] * 4 + -(var8 / 128) + 2;
                            class198 var21 = class417.field6144.method3030(0, class274.field4148[var18]);
                            if (var21.field3017 != null) {
                                var21 = var21.method1764(class276.field4168, -174);
                                if (var21 == null || var21.field3061 == -1) {
                                    continue;
                                }
                            }
                            class432.method3311(var19, arg2, arg3, var20, arg4, arg1, 2376, var21.field3061, var5);
                        }
                        for (class672 var22 = (class672) class29.field357.method971(347); var22 != null; var22 = (class672) class29.field357.method973(true)) {
                            int var23 = (int) (3L & var22.field3177 >> 28);
                            if (class12.field142 == var23) {
                                int var24 = (int) (16383L & var22.field3177) + -class494.field7101;
                                int var25 = -class281.field4219 + (int) (var22.field3177 >> 14 & 16383L);
                                int var26 = var24 * 4 - var7 / 128 + 2;
                                int var27 = var25 * 4 + -(var8 / 128) + 2;
                                class162.method1396(arg1, arg4, class50.field575[0], false, arg3, var5, var27, var26);
                            }
                        }
                        for (int var28 = 0; class6.field60 > var28; ++var28) {
                            class383 var29 = (class383) class207.field3184.method977((long) class590.field8680[var28], 1);
                            if (var29 != null) {
                                class612 var30 = var29.field5799;
                                if (var30.method4525((byte) -102) && ~class225.field3446.field6200 == ~var30.field6200) {
                                    class496 var31 = var30.field8947;
                                    if (var31 != null && var31.field7110 != null) {
                                        var31 = var31.method3742(-1, class276.field4168);
                                    }
                                    if (var31 != null && var31.field7143 && var31.field7119) {
                                        int var32 = var30.field6197 / 128 - var7 / 128;
                                        int var33 = var30.field6211 / 128 + -(var8 / 128);
                                        if (var31.field7139 != -1) {
                                            class432.method3311(var32, arg2, arg3, var33, arg4, arg1, 2376, var31.field7139, var5);
                                        } else {
                                            class162.method1396(arg1, arg4, class50.field575[1], false, arg3, var5, var33, var32);
                                        }
                                    }
                                }
                            }
                        }
                        int var34 = class3.field34;
                        int[] var35 = class358.field5483;
                        for (int var36 = 0; var36 < var34; ++var36) {
                            class726 var37 = class197.field2685[var35[var36]];
                            if (var37 != null && var37.method5290((byte) -102) && !var37.field10511 && class225.field3446 != var37 && ~class225.field3446.field6200 == ~var37.field6200) {
                                int var38 = var37.field6197 / 128 + -(var7 / 128);
                                int var39 = var37.field6211 / 128 + -(var8 / 128);
                                boolean var40 = false;
                                for (int var41 = 0; ~var41 > ~class588.field8654; ++var41) {
                                    if (var37.field10506.equals(class754.field10971[var41]) && class722.field10461[var41] != 0) {
                                        var40 = true;
                                        break;
                                    }
                                }
                                boolean var42 = false;
                                for (int var43 = 0; var43 < class173.field2407; ++var43) {
                                    if (var37.field10506.equals(class186.field2563[var43].field3639)) {
                                        var42 = true;
                                        break;
                                    }
                                }
                                boolean var44 = false;
                                if (~class225.field3446.field10533 != -1 && ~var37.field10533 != -1 && ~class225.field3446.field10533 == ~var37.field10533) {
                                    var44 = true;
                                }
                                if (!var37.field10512) {
                                    if (var44) {
                                        class162.method1396(arg1, arg4, class50.field575[4], false, arg3, var5, var39, var38);
                                    } else if (var37.field10494) {
                                        class162.method1396(arg1, arg4, class50.field575[7], false, arg3, var5, var39, var38);
                                    } else if (!var40) {
                                        if (var42) {
                                            class162.method1396(arg1, arg4, class50.field575[5], false, arg3, var5, var39, var38);
                                        } else {
                                            class162.method1396(arg1, arg4, class50.field575[2], false, arg3, var5, var39, var38);
                                        }
                                    } else {
                                        class162.method1396(arg1, arg4, class50.field575[3], false, arg3, var5, var39, var38);
                                    }
                                } else {
                                    class162.method1396(arg1, arg4, class50.field575[6], false, arg3, var5, var39, var38);
                                }
                            }
                        }
                        class352[] var45 = class708.field10260;
                        for (int var46 = 0; var45.length > var46; ++var46) {
                            class352 var47 = var45[var46];
                            if (var47 != null && var47.field5432 != 0 && ~(class375.field5711 % 20) > -11) {
                                if (~var47.field5432 == -2) {
                                    class383 var48 = (class383) class207.field3184.method977((long) var47.field5435, 1);
                                    if (var48 != null) {
                                        class612 var49 = var48.field5799;
                                        int var50 = var49.field6197 / 128 + -(var7 / 128);
                                        int var51 = var49.field6211 / 128 + -(var8 / 128);
                                        class324.method2752(360000L, var47.field5438, -9, arg1, var50, var51, arg3, var5, arg4);
                                    }
                                }
                                if (~var47.field5432 == -3) {
                                    int var52 = var47.field5436 / 128 + -(var7 / 128);
                                    int var53 = var47.field5430 / 128 - var8 / 128;
                                    long var54 = (long) (var47.field5437 << 7);
                                    long var56 = var54 * var54;
                                    class324.method2752(var56, var47.field5438, -9, arg1, var52, var53, arg3, var5, arg4);
                                }
                                if (var47.field5432 == 10 && var47.field5435 >= 0 && ~var47.field5435 > ~class197.field2685.length) {
                                    class726 var58 = class197.field2685[var47.field5435];
                                    if (var58 != null) {
                                        int var59 = var58.field6197 / 128 - var7 / 128;
                                        int var60 = var58.field6211 / 128 + -(var8 / 128);
                                        class324.method2752(360000L, var47.field5438, -9, arg1, var59, var60, arg3, var5, arg4);
                                    }
                                }
                            }
                        }
                        if (class185.field2559 != 4) {
                            if (class492.field7065 != 0) {
                                int var61 = class492.field7065 * 4 - (var7 / 128 + -2) - -(2 * (-1 + class225.field3446.method2101(31463)));
                                int var62 = class153.field1893 * 4 + -(var8 / 128) + 2 + (class225.field3446.method2101(31463) * 2 - 2);
                                class162.method1396(arg1, arg4, class451.field6615[class649.field9397 ? 1 : 0], false, arg3, var5, var62, var61);
                            }
                            if (!class225.field3446.field10511) {
                                arg2.method593(-1, arg4.field8029 / 2 + arg3 + -1, (byte) -82, 3, 3, arg4.field8045 / 2 + arg1 + -1);
                                return;
                            }
                        }
                    } else {
                        arg2.method567(-16777216, var5, arg3, arg1);
                    }
                }
            }
        } catch (RuntimeException var64) {
            throw class759.method5498(var64, field5031[2] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5031[3] : field5031[4]) + ',' + arg3 + ',' + (arg4 != null ? field5031[3] : field5031[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "()V", line = 399)
    public class317() {
        super(3, false);
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(BILib;)V", line = 403)
    public final void method201(byte arg0, int arg1, class163 arg2) {
        try {
            ++field5027;
            if (arg1 == 0) {
                super.field3235 = ~arg2.method1455((byte) 62) == -2;
            }
            if (arg0 <= 67) {
                field5024 = 44;
            }
        } catch (RuntimeException var5) {
            throw class759.method5498(var5, field5031[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field5031[3] : field5031[4]) + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "b", descriptor = "(II)[I", line = 418)
    public final int[] method197(int arg0, int arg1) {
        try {
            ++field5025;
            int[] var3 = super.field3231.method34((byte) -64, arg1);
            if (arg0 != 8217) {
                this.method197(-39, -77);
            }
            if (super.field3231.field57) {
                int[] var4 = this.method1856(0, arg1, 88);
                int[] var5 = this.method1856(1, arg1, arg0 + -8184);
                int[] var6 = this.method1856(2, arg1, 93);
                for (int var7 = 0; ~class343.field5332 < ~var7; ++var7) {
                    int var8 = var6[var7];
                    if (var8 != 4096) {
                        if (var8 != 0) {
                            var3[var7] = (-var8 + 4096) * var5[var7] + var4[var7] * var8 >> 12;
                        } else {
                            var3[var7] = var5[var7];
                        }
                    } else {
                        var3[var7] = var4[var7];
                    }
                }
            }
            return var3;
        } catch (RuntimeException var10) {
            throw class759.method5498(var10, field5031[0] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method2686(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 30);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method2687(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var10000 > var1; ++var1) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 108;
                    break;
                case 1:
                    var10005 = 10;
                    break;
                case 2:
                    var10005 = 20;
                    break;
                case 3:
                    var10005 = 38;
                    break;
                default:
                    var10005 = 30;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
