import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class165 {

    @OriginalMember(owner = "client!lc", name = "k", descriptor = "[I")
    private int[] field2565;

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "[I")
    private int[] field2556;

    @OriginalMember(owner = "client!lc", name = "d", descriptor = "Lj;")
    private class283 field2558;

    @OriginalMember(owner = "client!lc", name = "i", descriptor = "Lj;")
    private class283 field2563;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "[Lj;")
    private class283[] field2561;

    @OriginalMember(owner = "client!lc", name = "e", descriptor = "Ln;")
    public static class282 field2559 = new class282(64);

    @OriginalMember(owner = "client!lc", name = "l", descriptor = "I")
    public static int field2566 = -1;

    @OriginalMember(owner = "client!lc", name = "m", descriptor = "Lna;")
    public static class26 field2567 = class69.method505("settings=", (byte) -128);

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!lc", name = "c", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!lc", name = "h", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!lc", name = "j", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!lc", name = "n", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IZIDILve;Lm;Z)[I", line = 12)
    public final int[] method1118(int arg0, boolean arg1, int arg2, double arg3, int arg4, class266 arg5, class48 arg6, boolean arg7) {
        class86.method667(arg3, arg4 ^ 0x57E02);
        class192.field2996 = arg6;
        class290.field4830 = arg5;
        field2555++;
        class320.method2224(-1, arg0, arg2);
        for (int var10 = 0; var10 < this.field2561.length; var10++) {
            this.field2561[var10].method1993(arg0, arg2, 250);
        }
        if (arg4 != 327680) {
            method1119(68, 8, 20, -51, 31, 61, -34);
        }
        int[] var11 = new int[arg0 * arg2];
        byte var12;
        int var13;
        int var14;
        if (arg7) {
            var12 = -1;
            var14 = -1;
            var13 = arg2 - 1;
        } else {
            var12 = 1;
            var13 = 0;
            var14 = arg2;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg0; var16++) {
            if (arg1) {
                var15 = var16;
            }
            int[] var18;
            int[] var19;
            int[] var20;
            if (this.field2558.field4715) {
                int[] var17 = this.field2558.method8(var16, (byte) 109);
                var18 = var17;
                var19 = var17;
                var20 = var17;
            } else {
                int[][] var21 = this.field2558.method3(-1, var16);
                var18 = var21[0];
                var20 = var21[2];
                var19 = var21[1];
            }
            for (int var22 = var13; var22 != var14; var22 += var12) {
                int var23 = var18[var22] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                if (var23 < 0) {
                    var23 = 0;
                }
                int var24 = class214.field3336[var23];
                int var25 = var20[var22] >> 4;
                int var26 = var19[var22] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var26 < 0) {
                    var26 = 0;
                }
                if (var25 > 255) {
                    var25 = 255;
                }
                int var27 = class214.field3336[var26];
                if (var25 < 0) {
                    var25 = 0;
                }
                int var28 = class214.field3336[var25];
                var11[var15++] = (var24 << 16) + (var27 << 8) + var28;
                if (arg1) {
                    var15 += arg2 - 1;
                }
            }
        }
        for (int var29 = 0; var29 < this.field2561.length; var29++) {
            this.field2561[var29].method805((byte) -45);
        }
        return var11;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIIIIII)V", line = 144)
    public static final void method1119(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class261.field4270 = 0;
        for (int var7 = -1; var7 < class81.field1270 + class80.field1261; var7++) {
            class241 var8;
            if (var7 == -1) {
                var8 = class13.field221;
            } else if (class80.field1261 > var7) {
                var8 = class268.field4427[class95.field1550[var7]];
            } else {
                var8 = class185.field2877[class316.field5412[var7 - class80.field1261]];
            }
            if (var8 != null && var8.method1082((byte) 17)) {
                if (var8 instanceof class324) {
                    class187 var9 = ((class324) var8).field5565;
                    if (var9.field2953 != null) {
                        var9 = var9.method1273((byte) -93);
                    }
                    if (var9 == null) {
                        continue;
                    }
                }
                if (var7 >= class80.field1261) {
                    class187 var15 = ((class324) var8).field5565;
                    if (var15.field2953 != null) {
                        var15 = var15.method1273((byte) 102);
                    }
                    if (var15.field2927 >= 0 && class324.field5566.length > var15.field2927) {
                        int var16;
                        if (var15.field2923 == -1) {
                            var16 = var8.method1664(27855) + 15;
                        } else {
                            var16 = var15.field2923 + 15;
                        }
                        class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var16, arg1 >> 1);
                        if (class223.field3524 > -1) {
                            class324.field5566[var15.field2927].method876(arg2 + class223.field3524 - 12, arg0 + -30 - -class327.field5665);
                        }
                    }
                    class145[] var17 = class122.field1901;
                    for (int var18 = 0; var18 < var17.length; var18++) {
                        class145 var19 = var17[var18];
                        if (var19 != null && var19.field2213 == 1 && class316.field5412[var7 - class80.field1261] == var19.field2212 && (class229.field3626 % 20) < 10) {
                            int var20;
                            if (var15.field2923 == -1) {
                                var20 = var8.method1664(arg6 + 35252) + 15;
                            } else {
                                var20 = var15.field2923 + 15;
                            }
                            class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var20, arg1 >> 1);
                            if (class223.field3524 > -1) {
                                class10.field133[var19.field2203].method876(class223.field3524 + arg2 - 12, class327.field5665 + -28 + arg0);
                            }
                        }
                    }
                } else {
                    int var10 = 30;
                    class159 var11 = (class159) var8;
                    if (var11.field2504 != -1 || var11.field2476 != -1) {
                        class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var8.method1664(arg6 ^ 0xFFFF8FD4) + 15, arg1 >> 1);
                        if (class223.field3524 > -1) {
                            if (var11.field2504 != -1) {
                                class194.field3022[var11.field2504].method876(class223.field3524 + arg2 - 12, class327.field5665 + arg0 + -var10);
                                var10 += 25;
                            }
                            if (var11.field2476 != -1) {
                                class324.field5566[var11.field2476].method876(arg2 + class223.field3524 - 12, arg0 - (-class327.field5665 + var10));
                                var10 += 25;
                            }
                        }
                    }
                    if (var7 >= 0) {
                        class145[] var12 = class122.field1901;
                        for (int var13 = 0; var13 < var12.length; var13++) {
                            class145 var14 = var12[var13];
                            if (var14 != null && var14.field2213 == 10 && class95.field1550[var7] == var14.field2212) {
                                class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var8.method1664(arg6 ^ 0xFFFF8FD4) + 15, arg1 >> 1);
                                if (class223.field3524 > -1) {
                                    class10.field133[var14.field2203].method876(arg2 - (12 - class223.field3524), class327.field5665 - var10 + arg0);
                                }
                            }
                        }
                    }
                }
                if (var8.field3968 != null && (var7 >= class80.field1261 || class158.field2463 == 0 || class158.field2463 == 3 || class158.field2463 == 1 && class29.method236(((class159) var8).field2495, (byte) -82))) {
                    class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var8.method1664(27855), arg1 >> 1);
                    if (class223.field3524 > -1 && class261.field4270 < class201.field3132) {
                        class201.field3129[class261.field4270] = class89.field1474.method1199(var8.field3968) / 2;
                        class201.field3126[class261.field4270] = class89.field1474.field2746;
                        class201.field3118[class261.field4270] = class223.field3524;
                        class201.field3138[class261.field4270] = class327.field5665;
                        class201.field3131[class261.field4270] = var8.field3981;
                        class201.field3137[class261.field4270] = var8.field3886;
                        class201.field3117[class261.field4270] = var8.field3957;
                        class201.field3116[class261.field4270] = var8.field3968;
                        class261.field4270++;
                    }
                }
                if (var8.field3918 > class229.field3626) {
                    class148 var21 = class28.field472[0];
                    class148 var22 = class28.field472[1];
                    int var26;
                    if (var8 instanceof class324) {
                        class324 var23 = (class324) var8;
                        class148[] var24 = (class148[]) ((class148[]) class46.field721.method1989((long) var23.field5565.field2937, (byte) 121));
                        if (var24 == null) {
                            var24 = class319.method2219(0, (byte) 11, var23.field5565.field2937, class319.field5464);
                            if (var24 != null) {
                                class46.field721.method1978((byte) -98, var24, (long) var23.field5565.field2937);
                            }
                        }
                        if (var24 != null && var24.length == 2) {
                            var22 = var24[1];
                            var21 = var24[0];
                        }
                        class187 var25 = var23.field5565;
                        if (var25.field2923 == -1) {
                            var26 = var8.method1664(27855);
                        } else {
                            var26 = var25.field2923;
                        }
                    } else {
                        var26 = var8.method1664(27855);
                    }
                    class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var26 + var21.field2308 + 10, arg1 >> 1);
                    if (class223.field3524 > -1) {
                        int var27 = class223.field3524 + arg2 - (var21.field2320 >> 1);
                        int var28 = class327.field5665 + arg0 - 3;
                        var21.method876(var27, var28);
                        int var29 = var8.field3912 * var21.field2320 / 255;
                        int var30 = var21.field2308;
                        if (class255.field4184) {
                            class326.method2275(var27, var28, var27 + var29, var28 + var30);
                        } else {
                            class34.method289(var27, var28, var27 + var29, var28 + var30);
                        }
                        var22.method876(var27, var28);
                        if (class255.field4184) {
                            class326.method2279(arg2, arg0, arg1 + arg2, arg0 - -arg4);
                        } else {
                            class34.method287(arg2, arg0, arg1 + arg2, arg0 + arg4);
                        }
                    }
                }
                for (int var31 = 0; var31 < 4; var31++) {
                    if (var8.field3905[var31] > class229.field3626) {
                        int var32;
                        if ((var8 instanceof class324)) {
                            class324 var33 = (class324) var8;
                            class187 var34 = var33.field5565;
                            if (var34.field2923 == -1) {
                                var32 = var8.method1664(27855) / 2;
                            } else {
                                var32 = var34.field2923 / 2;
                            }
                        } else {
                            var32 = var8.method1664(arg6 ^ 0xFFFF8FD4) / 2;
                        }
                        class204.method1378((byte) 122, arg4 >> 1, arg3, var8, arg5, var32, arg1 >> 1);
                        if (class223.field3524 > -1) {
                            if (var31 == 1) {
                                class327.field5665 -= 20;
                            }
                            if (var31 == 2) {
                                class327.field5665 -= 10;
                                class223.field3524 -= 15;
                            }
                            if (var31 == 3) {
                                class327.field5665 -= 10;
                                class223.field3524 += 15;
                            }
                            class276.field4615[var8.field3958[var31]].method876(class223.field3524 + arg2 - 12, class327.field5665 + arg0 - 12);
                            class283.field4723.method1216(class149.method1019((byte) 9, var8.field3980[var31]), class223.field3524 + arg2 - 1, class327.field5665 + arg0 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        field2562++;
        int var35 = 0;
        if (arg6 != -7397) {
            method1123(true);
        }
        while (class261.field4270 > var35) {
            int var36 = class201.field3138[var35];
            int var37 = class201.field3118[var35];
            int var38 = class201.field3126[var35];
            int var39 = class201.field3129[var35];
            boolean var40 = true;
            while (var40) {
                var40 = false;
                for (int var41 = 0; var41 < var35; var41++) {
                    if (class201.field3138[var41] - class201.field3126[var41] < var36 + 2 && var36 - var38 < class201.field3138[var41] - -2 && var37 - var39 < class201.field3129[var41] + class201.field3118[var41] && class201.field3118[var41] - class201.field3129[var41] < var37 + var39 && class201.field3138[var41] - class201.field3126[var41] < var36) {
                        var36 = class201.field3138[var41] - class201.field3126[var41];
                        var40 = true;
                    }
                }
            }
            class223.field3524 = class201.field3118[var35];
            class327.field5665 = class201.field3138[var35] = var36;
            class26 var42 = class201.field3116[var35];
            if (class153.field2394 == 0) {
                int var43 = 16776960;
                if (class201.field3131[var35] < 6) {
                    var43 = class327.field5672[class201.field3131[var35]];
                }
                if (class201.field3131[var35] == 6) {
                    var43 = class232.field3677 % 20 >= 10 ? 16776960 : 16711680;
                }
                if (class201.field3131[var35] == 7) {
                    var43 = (class232.field3677 % 20) < 10 ? 255 : 65535;
                }
                if (class201.field3131[var35] == 8) {
                    var43 = (class232.field3677 % 20) >= 10 ? 8454016 : 45056;
                }
                if (class201.field3131[var35] == 9) {
                    int var44 = 150 - class201.field3117[var35];
                    if (var44 < 50) {
                        var43 = var44 * 1280 + 16711680;
                    } else if (var44 < 100) {
                        var43 = 16384000 + 16776960 - (var44 * 327680);
                    } else if (var44 < 150) {
                        var43 = -(-(var44 * 5) - 65280) - 500;
                    }
                }
                if (class201.field3131[var35] == 10) {
                    int var45 = 150 - class201.field3117[var35];
                    if (var45 < 50) {
                        var43 = var45 * 5 + 16711680;
                    } else if (var45 < 100) {
                        var43 = 16711935 - ((var45 - 50) * 327680);
                    } else if (var45 < 150) {
                        var43 = var45 * 327680 - (32768000 - (255 + 500 - (var45 * 5)));
                    }
                }
                if (class201.field3131[var35] == 11) {
                    int var46 = 150 - class201.field3117[var35];
                    if (var46 < 50) {
                        var43 = 16777215 - var46 * 327685;
                    } else if (var46 < 100) {
                        var43 = 65280 - (16384250 - (var46 * 327685));
                    } else if (var46 < 150) {
                        var43 = 16777215 + 32768000 - var46 * 327680;
                    }
                }
                if (class201.field3137[var35] == 0) {
                    class89.field1474.method1216(var42, class223.field3524 + arg2, class327.field5665 + arg0, var43, 0);
                }
                if (class201.field3137[var35] == 1) {
                    class89.field1474.method1213(var42, arg2 + class223.field3524, class327.field5665 + arg0, var43, 0, class232.field3677);
                }
                if (class201.field3137[var35] == 2) {
                    class89.field1474.method1212(var42, arg2 + class223.field3524, arg0 - -class327.field5665, var43, 0, class232.field3677);
                }
                if (class201.field3137[var35] == 3) {
                    class89.field1474.method1209(var42, class223.field3524 + arg2, class327.field5665 + arg0, var43, 0, class232.field3677, 150 - class201.field3117[var35]);
                }
                if (class201.field3137[var35] == 4) {
                    int var47 = (150 - class201.field3117[var35]) * (class89.field1474.method1199(var42) + 100) / 150;
                    if (class255.field4184) {
                        class326.method2275(class223.field3524 + arg2 - 50, arg0, class223.field3524 + arg2 + 50, arg0 + arg4);
                    } else {
                        class34.method289(arg2 + class223.field3524 - 50, arg0, class223.field3524 + arg2 + 50, arg0 + arg4);
                    }
                    class89.field1474.method1198(var42, arg2 - (-class223.field3524 - 50) - var47, class327.field5665 + arg0, var43, 0);
                    if (class255.field4184) {
                        class326.method2279(arg2, arg0, arg1 + arg2, arg0 + arg4);
                    } else {
                        class34.method287(arg2, arg0, arg2 + arg1, arg0 + arg4);
                    }
                }
                if (class201.field3137[var35] == 5) {
                    int var48 = 0;
                    int var49 = 150 - class201.field3117[var35];
                    if (class255.field4184) {
                        class326.method2275(arg2, class327.field5665 + arg0 - class89.field1474.field2746 - 1, arg1 + arg2, arg0 + class327.field5665 + 5);
                    } else {
                        class34.method289(arg2, class327.field5665 + arg0 - class89.field1474.field2746 - 1, arg1 + arg2, class327.field5665 + arg0 + 5);
                    }
                    if (var49 < 25) {
                        var48 = var49 - 25;
                    } else if (var49 > 125) {
                        var48 = var49 - 125;
                    }
                    class89.field1474.method1216(var42, class223.field3524 + arg2, class327.field5665 + arg0 + var48, var43, 0);
                    if (class255.field4184) {
                        class326.method2279(arg2, arg0, arg2 + arg1, arg0 + arg4);
                    } else {
                        class34.method287(arg2, arg0, arg1 + arg2, arg0 + arg4);
                    }
                }
            } else {
                class89.field1474.method1216(var42, arg2 + class223.field3524, class327.field5665 + arg0, 16776960, 0);
            }
            var35++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(B)I", line = 628)
    public static final int method1120(byte arg0) {
        field2560++;
        int var1 = -21 % ((63 - arg0) / 49);
        return class94.field1536;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(IIZLm;DILve;)[B", line = 643)
    public final byte[] method1121(int arg0, int arg1, boolean arg2, class48 arg3, double arg4, int arg5, class266 arg6) {
        byte[] var9 = new byte[arg1 * 4 * arg0];
        if (arg5 != 8839) {
            return (byte[]) null;
        }
        field2557++;
        class86.method667(arg4, 32258);
        class290.field4830 = arg6;
        class192.field2996 = arg3;
        class320.method2224(-32, arg0, arg1);
        for (int var10 = 0; var10 < this.field2561.length; var10++) {
            this.field2561[var10].method1993(arg0, arg1, arg5 - 8589);
        }
        int var11 = 0;
        for (int var12 = 0; var12 < arg0; var12++) {
            if (arg2) {
                var11 = var12 << 2;
            }
            int[] var14;
            int[] var15;
            int[] var16;
            if (this.field2558.field4715) {
                int[] var13 = this.field2558.method8(var12, (byte) -98);
                var14 = var13;
                var15 = var13;
                var16 = var13;
            } else {
                int[][] var17 = this.field2558.method3(-1, var12);
                var14 = var17[0];
                var15 = var17[1];
                var16 = var17[2];
            }
            int[] var18;
            if (this.field2563.field4715) {
                var18 = this.field2563.method8(var12, (byte) -103);
            } else {
                var18 = this.field2563.method3(-1, var12)[0];
            }
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = var14[var19] >> 4;
                if (var20 > 255) {
                    var20 = 255;
                }
                if (var20 < 0) {
                    var20 = 0;
                }
                int var21 = var15[var19] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                int var22 = var16[var19] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                int var23 = class214.field3336[var20];
                if (var22 < 0) {
                    var22 = 0;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var24 = class214.field3336[var21];
                int var25 = class214.field3336[var22];
                int var26;
                if (var23 == 0 && var24 == 0 && var25 == 0) {
                    var26 = 0;
                } else {
                    var26 = var18[var19] >> 4;
                    if (var26 > 255) {
                        var26 = 255;
                    }
                    if (var26 < 0) {
                        var26 = 0;
                    }
                }
                var9[var11++] = (byte) var23;
                var9[var11++] = (byte) var24;
                var9[var11++] = (byte) var25;
                var9[var11++] = (byte) var26;
                if (arg2) {
                    var11 += (arg1 << 2) - 4;
                }
            }
        }
        for (int var27 = 0; var27 < this.field2561.length; var27++) {
            this.field2561[var27].method805((byte) -45);
        }
        return var9;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ZLm;Lve;)Z", line = 800)
    public final boolean method1122(boolean arg0, class48 arg1, class266 arg2) {
        field2564++;
        if (class136.field2082 > 0) {
            for (int var4 = 0; var4 < this.field2556.length; var4++) {
                if (!arg2.method1885((byte) -78, this.field2556[var4], class136.field2082)) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field2556.length; var5++) {
                if (!arg2.method1900(0, this.field2556[var5])) {
                    return false;
                }
            }
        }
        if (!arg0) {
            this.field2556 = (int[]) null;
        }
        for (int var6 = 0; var6 < this.field2565.length; var6++) {
            if (!arg1.method94(21, this.field2565[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 854)
    public static void method1123(boolean arg0) {
        field2559 = null;
        if (arg0) {
            field2567 = (class26) null;
        }
        field2567 = null;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 875)
    public class165() {
        this.field2565 = new int[0];
        this.field2556 = new int[0];
        this.field2558 = new class268();
        this.field2558.field4732 = 1;
        this.field2563 = new class268();
        this.field2561 = new class283[] { this.field2558, this.field2563 };
        this.field2563.field4732 = 1;
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "(Lwa;)V", line = 888)
    public class165(class82 arg0) {
        int var2 = arg0.method642((byte) -93);
        this.field2561 = new class283[var2];
        int[][] var3 = new int[var2][];
        int var4 = 0;
        int var5 = 0;
        for (int var6 = 0; var6 < var2; var6++) {
            class283 var7 = class61.method475((byte) -67, arg0);
            if (var7.method802(4) >= 0) {
                var5++;
            }
            if (var7.method1860((byte) 19) >= 0) {
                var4++;
            }
            int var8 = var7.field4720.length;
            var3[var6] = new int[var8];
            for (int var9 = 0; var9 < var8; var9++) {
                var3[var6][var9] = arg0.method642((byte) -85);
            }
            this.field2561[var6] = var7;
        }
        this.field2556 = new int[var5];
        this.field2565 = new int[var4];
        int var10 = 0;
        int var11 = 0;
        for (int var12 = 0; var12 < var2; var12++) {
            class283 var13 = this.field2561[var12];
            int var14 = var13.field4720.length;
            for (int var15 = 0; var15 < var14; var15++) {
                var13.field4720[var15] = this.field2561[var3[var12][var15]];
            }
            int var16 = var13.method802(4);
            int var17 = var13.method1860((byte) 19);
            if (var16 > 0) {
                this.field2556[var10++] = var16;
            }
            if (var17 > 0) {
                this.field2565[var11++] = var17;
            }
            var3[var12] = null;
        }
        this.field2558 = this.field2561[arg0.method642((byte) -85)];
        int[][] var18 = (int[][]) null;
        this.field2563 = this.field2561[arg0.method642((byte) -87)];
    }
}
