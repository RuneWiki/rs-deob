import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!h")
public class class341 extends class285 {

    @OriginalMember(owner = "client!h", name = "S", descriptor = "I")
    private int field5299 = 1;

    @OriginalMember(owner = "client!h", name = "Q", descriptor = "I")
    private int field5297 = 0;

    @OriginalMember(owner = "client!h", name = "Z", descriptor = "I")
    private int field5306 = 0;

    @OriginalMember(owner = "client!h", name = "T", descriptor = "Ljava/lang/String;")
    public static String field5300 = "wave:";

    @OriginalMember(owner = "client!h", name = "bb", descriptor = "I")
    public static int field5308 = 0;

    @OriginalMember(owner = "client!h", name = "eb", descriptor = "I")
    public static int field5311 = 0;

    @OriginalMember(owner = "client!h", name = "fb", descriptor = "Ljava/lang/String;")
    public static String field5312 = "Loaded fonts";

    @OriginalMember(owner = "client!h", name = "R", descriptor = "I")
    public static int field5298;

    @OriginalMember(owner = "client!h", name = "U", descriptor = "I")
    public static int field5301;

    @OriginalMember(owner = "client!h", name = "V", descriptor = "I")
    public static int field5302;

    @OriginalMember(owner = "client!h", name = "W", descriptor = "I")
    public static int field5303;

    @OriginalMember(owner = "client!h", name = "X", descriptor = "I")
    public static int field5304;

    @OriginalMember(owner = "client!h", name = "Y", descriptor = "I")
    public static int field5305;

    @OriginalMember(owner = "client!h", name = "ab", descriptor = "I")
    public static int field5307;

    @OriginalMember(owner = "client!h", name = "cb", descriptor = "I")
    public static int field5309;

    @OriginalMember(owner = "client!h", name = "db", descriptor = "Lak;")
    public static class172 field5310;

    @OriginalMember(owner = "client!h", name = "gb", descriptor = "Lha;")
    public static class328 field5313;

    @OriginalMember(owner = "client!h", name = "O", descriptor = "Lclient;")
    public static client field5296;

    @OriginalMember(owner = "client!h", name = "<init>", descriptor = "()V", line = 7)
    public class341() {
        super(0, true);
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZLjj;I)V", line = 13)
    public final void method63(boolean arg0, class44 arg1, int arg2) {
        field5305++;
        if (arg2 == 0) {
            this.field5297 = arg1.method286((byte) -108);
        } else if (arg2 == 1) {
            this.field5306 = arg1.method286((byte) -95);
        } else if (arg2 == 3) {
            this.field5299 = arg1.method286((byte) -110);
        }
        if (!arg0) {
            this.method63(true, (class44) null, -104);
        }
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(ZI)[I", line = 71)
    public final int[] method60(boolean arg0, int arg1) {
        int[] var3 = this.field4573.method1116(113, arg1);
        if (this.field4573.field2420) {
            int var4 = class27.field382[arg1];
            int var5 = var4 - 2048 >> 1;
            for (int var6 = 0; var6 < class287.field4599; var6++) {
                int var7 = class48.field669[var6];
                int var8 = var7 - 2048 >> 1;
                int var9;
                if (this.field5297 == 0) {
                    var9 = (var7 - var4) * this.field5299;
                } else {
                    int var10 = var5 * var5 + var8 * var8 >> 12;
                    int var11 = (int) (Math.sqrt((double) ((float) var10 / 4096.0F)) * 4096.0D);
                    var9 = (int) ((double) (this.field5299 * var11) * 3.141592653589793D);
                }
                int var12 = var9 - (var9 & 0xFFFFF000);
                if (this.field5306 == 0) {
                    var12 = class175.field2898[var12 >> 4 & 0xFF] + 4096 >> 1;
                } else if (this.field5306 == 2) {
                    var12 -= 2048;
                    if (var12 < 0) {
                        var12 = -var12;
                    }
                    var12 = 2048 - var12 << 1;
                }
                var3[var6] = var12;
            }
        }
        if (!arg0) {
            field5313 = (class328) null;
        }
        field5302++;
        return var3;
    }

    @OriginalMember(owner = "client!h", name = "b", descriptor = "(ZI)V", line = 137)
    public static final void method2365(boolean arg0, int arg1) {
        if (arg1 <= 110) {
            method2366(47, -85, 118, 115, 87, -63, -5);
        }
        class199.field3238 = new int[5];
        class164.field2733 = new int[104];
        class103.field1501 = new int[104];
        class101.field1478 = 99;
        byte var2;
        if (arg0) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class180.field2987 = new byte[var2][104][104];
        class199.field3240 = new byte[var2][104][104];
        class160.field2646 = new int[104];
        field5303++;
        class145.field2259 = new byte[var2][104][104];
        class296.field4685 = new byte[var2][104][104];
        class323.field5021 = new byte[var2][105][105];
        class70.field988 = new int[104];
        class309.field4799 = new int[var2][105][105];
        class142.field2212 = new int[104];
    }

    @OriginalMember(owner = "client!h", name = "a", descriptor = "(IIIIIII)V", line = 167)
    public static final void method2366(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class10.field126 = 0;
        field5298++;
        for (int var7 = -1; var7 < (class275.field4435 + class233.field3736); var7++) {
            class263 var8;
            if (var7 == -1) {
                var8 = class191.field3129;
            } else if (var7 < class275.field4435) {
                var8 = class74.field1049[class160.field2656[var7]];
            } else {
                var8 = class99.field1445[class142.field2225[var7 - class275.field4435]];
            }
            if (var8 != null && var8.method1695(29082)) {
                if (var8 instanceof class234) {
                    class256 var9 = ((class234) var8).field3752;
                    if (var9.field4080 != null) {
                        var9 = var9.method1843(-1);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class275.field4435) {
                    class256 var15 = ((class234) var8).field3752;
                    if (var15.field4080 != null) {
                        var15 = var15.method1843(-1);
                    }
                    if (var15.field4053 >= 0 && class48.field675.length > var15.field4053) {
                        int var16;
                        if (var15.field4105 == -1) {
                            var16 = var8.method1882((byte) -125) + 15;
                        } else {
                            var16 = var15.field4105 + 15;
                        }
                        class322.method2258(var16, 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                        if (class193.field3154 > -1) {
                            class48.field675[var15.field4053].method375(arg0 - (12 - class193.field3154), class78.field1100 + arg4 + -30);
                        }
                    }
                    class193[] var17 = class175.field2895;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class193 var19 = var17[var18];
                        if (var19 != null && var19.field3156 == 1 && class142.field2225[var7 - class275.field4435] == var19.field3162 && class240.field3818 % 20 < 10) {
                            int var20;
                            if (var15.field4105 == -1) {
                                var20 = var8.method1882((byte) -100) + 15;
                            } else {
                                var20 = var15.field4105 + 15;
                            }
                            class322.method2258(var20, 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                            if (class193.field3154 > -1) {
                                class147.field2288[var19.field3152].method375(class193.field3154 + arg0 - 12, class78.field1100 + -28 + arg4);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class334 var11 = (class334) var8;
                    if (var11.field5215 != -1 || var11.field5212 != -1) {
                        class322.method2258(var8.method1882((byte) -103) + 15, 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                        if (class193.field3154 > -1) {
                            if (var11.field5215 != -1) {
                                class100.field1463[var11.field5215].method375(class193.field3154 + arg0 - 12, arg4 - var10 + class78.field1100);
                                var10 += 25;
                            }
                            if (var11.field5212 != -1) {
                                class48.field675[var11.field5212].method375(class193.field3154 + arg0 - 12, arg4 - var10 + class78.field1100);
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        int var12 = 0;
                        class193[] var13 = class175.field2895;
                        while (var12 < var13.length) {
                            class193 var14 = var13[var12];
                            if (var14 != null && var14.field3156 == 10 && class160.field2656[var7] == var14.field3162) {
                                class322.method2258(var8.method1882((byte) -105) + 15, 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                                if (class193.field3154 > -1) {
                                    class147.field2288[var14.field3152].method375(class193.field3154 + arg0 - 12, arg4 - -class78.field1100 - var10);
                                }
                            }
                            var12++;
                        }
                    }
                }
                if (var8.field4240 != null && (class275.field4435 <= var7 || class48.field654 == 0 || class48.field654 == 3 || class48.field654 == 1 && class78.method532(96, ((class334) var8).field5216))) {
                    class322.method2258(var8.method1882((byte) -118), 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                    if (class193.field3154 > -1 && class10.field126 < class160.field2640) {
                        class160.field2647[class10.field126] = class282.field4538.method1804(var8.field4240) / 2;
                        class160.field2658[class10.field126] = class282.field4538.field4016;
                        class160.field2645[class10.field126] = class193.field3154;
                        class160.field2657[class10.field126] = class78.field1100;
                        class160.field2651[class10.field126] = var8.field4215;
                        class160.field2650[class10.field126] = var8.field4207;
                        class160.field2649[class10.field126] = var8.field4257;
                        class160.field2654[class10.field126] = var8.field4240;
                        class10.field126++;
                    }
                }
                if (class240.field3818 < var8.field4183) {
                    class58 var21 = class234.field3760[1];
                    class58 var22 = class234.field3760[0];
                    int var26;
                    if (var8 instanceof class234) {
                        class234 var23 = (class234) var8;
                        class58[] var24 = (class58[]) ((class58[]) class93.field1270.method704((byte) 126, (long) var23.field3752.field4062));
                        if (var24 == null) {
                            var24 = class265.method1888(true, var23.field3752.field4062, class130.field2034, 0);
                            if (var24 != null) {
                                class93.field1270.method703(var24, (long) var23.field3752.field4062, (byte) -81);
                            }
                        }
                        class256 var25 = var23.field3752;
                        if (var24 != null && var24.length == 2) {
                            var21 = var24[1];
                            var22 = var24[0];
                        }
                        if (var25.field4105 == -1) {
                            var26 = var8.method1882((byte) -124);
                        } else {
                            var26 = var25.field4105;
                        }
                    } else {
                        var26 = var8.method1882((byte) -97);
                    }
                    class322.method2258(var26 + var22.field816 + 10, 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                    if (class193.field3154 > -1) {
                        int var27 = arg0 + class193.field3154 - (var22.field825 >> 1);
                        int var28 = arg4 + class78.field1100 - 3;
                        var22.method375(var27, var28);
                        int var29 = var22.field816;
                        int var30 = var8.field4223 * var22.field825 / 255;
                        if (class232.field3690) {
                            class75.method497(var27, var28, var27 + var30, var28 - -var29);
                        } else {
                            class59.method386(var27, var28, var27 + var30, var28 - -var29);
                        }
                        var21.method375(var27, var28);
                        if (class232.field3690) {
                            class75.method506(arg0, arg4, arg0 + arg6, arg1 + arg4);
                        } else {
                            class59.method389(arg0, arg4, arg0 + arg6, arg1 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field4256[var31] > class240.field3818) {
                        int var34;
                        if (var8 instanceof class234) {
                            class234 var32 = (class234) var8;
                            class256 var33 = var32.field3752;
                            if (var33.field4105 == -1) {
                                var34 = var8.method1882((byte) -93) / 2;
                            } else {
                                var34 = var33.field4105 / 2;
                            }
                        } else {
                            var34 = var8.method1882((byte) -106) / 2;
                        }
                        class322.method2258(var34, 497, arg3, var8, arg5, arg1 >> 1, arg6 >> 1);
                        if (class193.field3154 > -1) {
                            if (var31 == 1) {
                                class78.field1100 -= 20;
                            }
                            if (var31 == 2) {
                                class193.field3154 -= 15;
                                class78.field1100 -= 10;
                            }
                            if (var31 == 3) {
                                class193.field3154 += 15;
                                class78.field1100 -= 10;
                            }
                            class150.field2319[var8.field4187[var31]].method375(arg0 + class193.field3154 - 12, class78.field1100 + arg4 + -12);
                            class2.field30.method1796(Integer.toString(var8.field4220[var31]), class193.field3154 + arg0 - 1, class78.field1100 + arg4 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        if (arg2 >= -120) {
            return;
        }
        for (int var35 = 0; var35 < class10.field126; var35++) {
            int var36 = class160.field2645[var35];
            int var37 = class160.field2657[var35];
            int var38 = class160.field2658[var35];
            int var39 = class160.field2647[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if ((class160.field2657[var41] - class160.field2658[var41]) < (var37 + 2) && var37 - var38 < class160.field2657[var41] + 2 && var36 - var39 < class160.field2647[var41] + class160.field2645[var41] && (var36 + var39) > (class160.field2645[var41] - class160.field2647[var41]) && class160.field2657[var41] - class160.field2658[var41] < var37) {
                        var40 = true;
                        var37 = class160.field2657[var41] - class160.field2658[var41];
                    }
                }
            }
            class193.field3154 = class160.field2645[var35];
            class78.field1100 = class160.field2657[var35] = var37;
            String var42 = class160.field2654[var35];
            if (class240.field3815 == 0) {
                int var43 = 16776960;
                if (class160.field2651[var35] < 6) {
                    var43 = class152.field2353[class160.field2651[var35]];
                }
                if (class160.field2651[var35] == 6) {
                    var43 = (class97.field1385 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class160.field2651[var35] == 7) {
                    var43 = class97.field1385 % 20 >= 10 ? 65535 : 255;
                }
                if (class160.field2651[var35] == 8) {
                    var43 = (class97.field1385 % 20) < 10 ? 45056 : 8454016;
                }
                if (class160.field2651[var35] == 9) {
                    int var44 = 150 - class160.field2649[var35];
                    if (var44 < 50) {
                        var43 = (var44 * 1280) + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16776960 - (var44 * 327680 - 16384000);
                    } else if (var44 < 150) {
                        var43 = -(-(var44 * 5) - 65280) - 500;
                    }
                }
                if (class160.field2651[var35] == 10) {
                    int var45 = 150 - class160.field2649[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16384000 + 16711935 - (var45 * 327680);
                    } else if (var45 < 150) {
                        var43 = (var45 - 100) * 327680 + 255 + 500 - (var45 * 5);
                    }
                }
                if (class160.field2651[var35] == 11) {
                    int var46 = 150 - class160.field2649[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - (var46 * 327685);
                    } else if (var46 < 100) {
                        var43 = (var46 - 50) * 327685 + 65280;
                    } else if (var46 < 150) {
                        var43 = 16777215 - (var46 - 100) * 327680;
                    }
                }
                if (class160.field2650[var35] == 0) {
                    class282.field4538.method1796(var42, class193.field3154 + arg0, class78.field1100 + arg4, var43, 0);
                }
                if (class160.field2650[var35] == 1) {
                    class282.field4538.method1797(var42, class193.field3154 + arg0, class78.field1100 + arg4, var43, 0, class97.field1385);
                }
                if (class160.field2650[var35] == 2) {
                    class282.field4538.method1798(var42, arg0 + class193.field3154, class78.field1100 + arg4, var43, 0, class97.field1385);
                }
                if (class160.field2650[var35] == 3) {
                    class282.field4538.method1801(var42, class193.field3154 + arg0, class78.field1100 + arg4, var43, 0, class97.field1385, 150 - class160.field2649[var35]);
                }
                if (class160.field2650[var35] == 4) {
                    int var47 = (150 - class160.field2649[var35]) * (class282.field4538.method1804(var42) + 100) / 150;
                    if (class232.field3690) {
                        class75.method497(arg0 + class193.field3154 - 50, arg4, arg0 + class193.field3154 + 50, arg4 - -arg1);
                    } else {
                        class59.method386(class193.field3154 + arg0 - 50, arg4, arg0 + class193.field3154 + 50, arg4 - -arg1);
                    }
                    class282.field4538.method1808(var42, class193.field3154 + arg0 + 50 - var47, arg4 - -class78.field1100, var43, 0);
                    if (class232.field3690) {
                        class75.method506(arg0, arg4, arg0 + arg6, arg4 - -arg1);
                    } else {
                        class59.method389(arg0, arg4, arg0 + arg6, arg4 - -arg1);
                    }
                }
                if (class160.field2650[var35] == 5) {
                    int var48 = 150 - class160.field2649[var35];
                    int var49 = 0;
                    if (class232.field3690) {
                        class75.method497(arg0, arg4 + class78.field1100 - (class282.field4538.field4016 - -1), arg0 + arg6, arg4 + class78.field1100 + 5);
                    } else {
                        class59.method386(arg0, class78.field1100 + arg4 - class282.field4538.field4016 - 1, arg0 + arg6, arg4 + class78.field1100 + 5);
                    }
                    if (var48 < 25) {
                        var49 = var48 - 25;
                    } else if (var48 > 125) {
                        var49 = var48 - 125;
                    }
                    class282.field4538.method1796(var42, class193.field3154 + arg0, class78.field1100 + arg4 + var49, var43, 0);
                    if (class232.field3690) {
                        class75.method506(arg0, arg4, arg0 + arg6, arg1 + arg4);
                    } else {
                        class59.method389(arg0, arg4, arg0 + arg6, arg4 - -arg1);
                    }
                }
            } else {
                class282.field4538.method1796(var42, arg0 + class193.field3154, class78.field1100 + arg4, 16776960, 0);
            }
        }
    }

    @OriginalMember(owner = "client!h", name = "j", descriptor = "(I)V", line = 647)
    public static void method2367(int arg0) {
        field5310 = null;
        field5296 = null;
        field5313 = null;
        int var1 = 104 / ((arg0 + 27) / 54);
        field5300 = null;
        field5312 = null;
    }

    @OriginalMember(owner = "client!h", name = "g", descriptor = "(I)V", line = 666)
    public final void method361(int arg0) {
        field5304++;
        int var2 = -112 / ((arg0 - 42) / 36);
        class208.method1511((byte) -45);
    }

    @OriginalMember(owner = "client!h", name = "k", descriptor = "(I)V", line = 684)
    public static final void method2368(int arg0) {
        field5301++;
        class168.field2779.method702((byte) 123);
        class164.field2742.method702((byte) 125);
        if (arg0 <= 35) {
            method2366(39, 39, -67, 55, 15, -52, 31);
        }
    }
}
