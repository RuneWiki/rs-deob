import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iga")
public class class78 extends class381 {

    @OriginalMember(owner = "client!iga", name = "l", descriptor = "I")
    public int field1275;

    @OriginalMember(owner = "client!iga", name = "i", descriptor = "I")
    public int field1272;

    @OriginalMember(owner = "client!iga", name = "h", descriptor = "I")
    public static int field1271;

    @OriginalMember(owner = "client!iga", name = "j", descriptor = "I")
    public static int field1273;

    @OriginalMember(owner = "client!iga", name = "k", descriptor = "I")
    public static int field1274;

    @OriginalMember(owner = "client!iga", name = "m", descriptor = "I")
    public static int field1276;

    @OriginalMember(owner = "client!iga", name = "n", descriptor = "I")
    public static int field1277;

    @OriginalMember(owner = "client!iga", name = "o", descriptor = "I")
    public static int field1278;

    @OriginalMember(owner = "client!iga", name = "p", descriptor = "I")
    public static int field1279;

    @OriginalMember(owner = "client!iga", name = "r", descriptor = "I")
    public static int field1281;

    @OriginalMember(owner = "client!iga", name = "s", descriptor = "I")
    public static int field1282;

    @OriginalMember(owner = "client!iga", name = "q", descriptor = "J")
    public static long field1280;

    @OriginalMember(owner = "client!iga", name = "t", descriptor = "[Lsu;")
    public static class486[] field1283;

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(B)Z", line = 6)
    public final boolean method449(byte arg0) {
        field1271++;
        if (arg0 != 123) {
            this.method457(false);
        }
        return ((this.field1275 & 0x2F8427) >> 21) != 0;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(III)Z", line = 17)
    public static final boolean method450(int arg0, int arg1, int arg2) {
        field1278++;
        if (arg1 != -23951) {
            field1280 = 125L;
        }
        return (arg2 & 0x22) != 0;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(I)Z", line = 28)
    public final boolean method451(int arg0) {
        field1279++;
        if (arg0 != 0) {
            this.method449((byte) 48);
        }
        return (this.field1275 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(I)I", line = 40)
    public final int method452(int arg0) {
        if (arg0 != 16711680) {
            method455(true, 25, -45, -41, 49, -19, 33);
        }
        field1277++;
        return class181.method1218((byte) 23, this.field1275);
    }

    @OriginalMember(owner = "client!iga", name = "b", descriptor = "(B)Z", line = 52)
    public final boolean method453(byte arg0) {
        if (arg0 == 2) {
            field1273++;
            return (this.field1275 >> 22 & 0x1) != 0;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!iga", name = "<init>", descriptor = "(II)V", line = 64)
    public class78(int arg0, int arg1) {
        this.field1275 = arg0;
        this.field1272 = arg1;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(IILmv;IIZ)V", line = 73)
    public static final void method454(int arg0, int arg1, class295 arg2, int arg3, int arg4, boolean arg5) {
        field1282++;
        if (arg3 != -23561) {
            method458(-111);
        }
        class252.method1520(arg5, arg4, arg2, arg1, arg0, 0L, (byte) 122);
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(ZIIIIII)V", line = 86)
    public static final void method455(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1276++;
        int var7 = class416.field6150;
        int[] var8 = class35.field554;
        class574.field8345 = 0;
        for (int var9 = 0; var9 < class155.field2213 + var7; var9++) {
            class76 var32 = null;
            class523 var33;
            if (var7 > var9) {
                var33 = class35.field551[var8[var9]];
            } else {
                var33 = ((class177) class271.field3550.method2002((byte) -122, (long) class523.field7379[var9 - var7])).field2476;
                var32 = ((class53) var33).field805;
                if (var32.field1212 != null) {
                    var32 = var32.method443(class308.field4545, (byte) 110);
                    if (var32 == null) {
                        continue;
                    }
                }
            }
            if (var33.field7394 >= 0 && (class229.field3041 == var33.field7412 || class321.field4681.field7905 == var33.field7905)) {
                class566.method3265(arg5 >> 1, var33, arg6 >> 1, arg2, arg3, var33.method312((byte) -102), 90);
                if (class194.field2602[0] >= 0) {
                    if (var33.field7362 != null && (var9 >= var7 || class639.field9183 == 0 || class639.field9183 == 3 || class639.field9183 == 1 && class451.method2653(((class71) var33).field1094, -30963)) && class574.field8345 < class392.field5942) {
                        class392.field5941[class574.field8345] = class141.field2042.method3455(var33.field7362, (byte) 1) / 2;
                        class392.field5926[class574.field8345] = class194.field2602[0];
                        class392.field5940[class574.field8345] = class194.field2602[1];
                        class392.field5929[class574.field8345] = var33.field7416;
                        class392.field5918[class574.field8345] = var33.field7410;
                        class392.field5931[class574.field8345] = var33.field7386;
                        class392.field5927[class574.field8345] = var33.field7362;
                        class574.field8345++;
                    }
                    int var34 = class194.field2602[1] + arg4;
                    int var45;
                    if (var33.field7372 || class45.field685 >= var33.field7339) {
                        var45 = var34 - Math.max(class141.field2042.field8749, class580.field8447[0].method56());
                    } else {
                        boolean var35 = true;
                        byte var36 = 1;
                        int var38;
                        if (var9 < var7) {
                            class71 var37 = class35.field551[var8[var9]];
                            var38 = var33.method2957(true).field8578;
                            if (var37.field1140) {
                                var36 = 2;
                            }
                        } else {
                            var38 = var32.field1205;
                            if (var38 == -1) {
                                var38 = var33.method2957(arg0).field8578;
                            }
                        }
                        class256[] var39 = class580.field8447;
                        if (var38 != -1) {
                            class256[] var40 = (class256[]) class86.field1341.method3901((long) var38, -91);
                            if (var40 == null) {
                                class616[] var41 = class616.method3513(class595.field8616, var38, 0);
                                if (var41 != null) {
                                    var40 = new class256[var41.length];
                                    for (int var42 = 0; var42 < var41.length; var42++) {
                                        var40[var42] = class332.field4821.method660(var41[var42], true);
                                    }
                                    class86.field1341.method3894(var40, (byte) 60, (long) var38);
                                }
                            }
                            if (var40 != null && var40.length >= 2) {
                                var39 = var40;
                            }
                        }
                        if (var36 >= var39.length) {
                            var36 = 1;
                        }
                        class256 var43 = var39[0];
                        class256 var44 = var39[var36];
                        var45 = var34 - Math.max(class141.field2042.field8749, var43.method56());
                        int var46 = class194.field2602[0] + arg1 - (var43.method48() >> 1);
                        int var47 = var43.method48() * var33.field7330 / 255;
                        if (var33.field7330 > 0 && var47 < 2) {
                            var47 = 2;
                        }
                        var43.method1534(var46, var45);
                        class332.field4821.method692(var46, var45, var46 + var47, var45 - -var43.method56());
                        var44.method1534(var46, var45);
                        class332.field4821.method652(arg1, arg4, arg1 + arg6, arg4 + arg5);
                    }
                    var45 -= 2;
                    if (!var33.field7372) {
                        if (var33.field7341 > class45.field685) {
                            class256 var48 = class302.field4493[var33.field7335 ? 2 : 0];
                            class256 var49 = class302.field4493[var33.field7335 ? 3 : 1];
                            boolean var50 = true;
                            int var51;
                            if (var33 instanceof class53) {
                                var51 = var32.field1233;
                                if (var51 == -1) {
                                    var51 = var33.method2957(true).field8558;
                                }
                            } else {
                                var51 = var33.method2957(true).field8558;
                            }
                            if (var51 != -1) {
                                class256[] var52 = (class256[]) class218.field2908.method3901((long) var51, -124);
                                if (var52 == null) {
                                    class616[] var53 = class616.method3513(class595.field8616, var51, 0);
                                    if (var53 != null) {
                                        var52 = new class256[var53.length];
                                        for (int var54 = 0; var54 < var53.length; var54++) {
                                            var52[var54] = class332.field4821.method660(var53[var54], true);
                                        }
                                        class218.field2908.method3894(var52, (byte) 60, (long) var51);
                                    }
                                }
                                if (var52 != null && var52.length == 4) {
                                    var48 = var52[var33.field7335 ? 2 : 0];
                                    var49 = var52[var33.field7335 ? 3 : 1];
                                }
                            }
                            int var55 = var33.field7341 - class45.field685;
                            int var56;
                            if (var33.field7366 >= var55) {
                                var56 = var48.method48();
                            } else {
                                int var57 = var55 - var33.field7366;
                                int var58 = var33.field7364 == 0 ? 0 : (var33.field7400 - var57) / var33.field7364 * var33.field7364;
                                var56 = var58 * var48.method48() / var33.field7400;
                            }
                            int var59 = var48.method56();
                            var45 -= var59;
                            int var60 = class194.field2602[0] + (arg1 - (var48.method48() >> 1));
                            var48.method1534(var60, var45);
                            class332.field4821.method692(var60, var45, var56 + var60, var45 + var59);
                            var49.method1534(var60, var45);
                            class332.field4821.method652(arg1, arg4, arg1 + arg6, arg4 + arg5);
                            var45 -= 2;
                        }
                        if (var9 < var7) {
                            class71 var62 = (class71) var33;
                            if (var62.field1129 != -1) {
                                var45 -= 25;
                                class353.field5244[var62.field1129].method1534(class194.field2602[0] + arg1 - 12, var45);
                                var45 -= 2;
                            }
                            if (var62.field1124 != -1) {
                                var45 -= 25;
                                class479.field6860[var62.field1124].method1534(class194.field2602[0] + arg1 - 12, var45);
                                var45 -= 2;
                            }
                        } else if (var32.field1194 >= 0 && class479.field6860.length > var32.field1194) {
                            var45 -= 25;
                            class256 var61 = class479.field6860[var32.field1194];
                            var61.method1534(class194.field2602[0] + arg1 - (var61.method48() >> 1), var45);
                            var45 -= 2;
                        }
                    }
                    int var10000;
                    if (!var33 instanceof class71) {
                        int var69 = 0;
                        class14[] var70 = class700.field9879;
                        for (int var71 = 0; var71 < var70.length; var71++) {
                            class14 var76 = var70[var71];
                            if (var76 != null && var76.field317 == 1 && class523.field7379[var9 - var7] == var76.field309) {
                                class256 var77 = class519.field7280[var76.field312];
                                if (var77.method56() > var69) {
                                    var69 = var77.method56();
                                }
                                if (class45.field685 % 20 < 10) {
                                    var77.method1534(class194.field2602[0] + arg1 - 12, var45 - var77.method56());
                                }
                            }
                        }
                        if (var69 > 0) {
                            var10000 = var45 - (var69 + 2);
                        }
                    } else if (var9 >= 0) {
                        int var63 = 0;
                        class14[] var64 = class700.field9879;
                        for (int var65 = 0; var65 < var64.length; var65++) {
                            class14 var67 = var64[var65];
                            if (var67 != null && var67.field317 == 10 && var8[var9] == var67.field309) {
                                class256 var68 = class519.field7280[var67.field312];
                                if (var68.method56() > var63) {
                                    var63 = var68.method56();
                                }
                                var68.method1534(arg1 - (12 - class194.field2602[0]), -var68.method56() + var45);
                            }
                        }
                        if (var63 > 0) {
                            var10000 = var45 - (var63 + 2);
                        }
                    }
                    for (int var73 = 0; var73 < 4; var73++) {
                        if (class45.field685 < var33.field7369[var73]) {
                            int var74 = var33.method312((byte) -102) / 2;
                            class566.method3265(arg5 >> 1, var33, arg6 >> 1, arg2, arg3, var74, 33);
                            if (class194.field2602[0] > -1) {
                                int var75 = class489.field6946[var33.field7399[var73]].method48();
                                if (var73 == 1) {
                                    class194.field2602[1] -= 20;
                                }
                                if (var73 == 2) {
                                    class194.field2602[1] -= 10;
                                    class194.field2602[0] -= var75 - 9;
                                }
                                if (var73 == 3) {
                                    class194.field2602[1] -= 10;
                                    class194.field2602[0] += var75 - 9;
                                }
                                class489.field6946[var33.field7399[var73]].method1534(arg1 + class194.field2602[0] - (var75 >> 1), class194.field2602[1] - 12 + arg4);
                                class597.field8642.method2448((byte) 112, -1, 0, Integer.toString(var33.field7403[var73]), class194.field2602[1] + arg4 + 3, arg1 + -1 + class194.field2602[0]);
                            }
                        }
                    }
                }
            }
        }
        for (int var10 = 0; var10 < class22.field400; var10++) {
            int var28 = class417.field6159[var10];
            class523 var29;
            if (var28 >= 2048) {
                var29 = ((class177) class271.field3550.method2002((byte) -119, (long) (var28 - 2048))).field2476;
            } else {
                var29 = class35.field551[var28];
            }
            int var30 = class243.field3229[var10];
            class523 var31;
            if (var30 < 2048) {
                var31 = class35.field551[var30];
            } else {
                var31 = ((class177) class271.field3550.method2002((byte) -128, (long) (var30 - 2048))).field2476;
            }
            class561.method3250(var29, arg2, --var29.field7368, arg4, var31, arg6, arg1, false, arg3, arg5);
        }
        if (!arg0) {
            field1283 = null;
        }
        int var11 = class141.field2042.field8749 + class141.field2042.field8759 + 2;
        for (int var12 = 0; var12 < class574.field8345; var12++) {
            int var13 = class392.field5926[var12];
            int var14 = class392.field5940[var12];
            int var15 = class392.field5941[var12];
            boolean var16 = true;
            while (var16) {
                var16 = false;
                for (int var27 = 0; var27 < var12; var27++) {
                    if ((class392.field5940[var27] - var11) < (var14 + 2) && class392.field5940[var27] + 2 > -var11 + var14 && (var13 - var15) < (class392.field5941[var27] + class392.field5926[var27]) && (class392.field5926[var27] - class392.field5941[var27]) < (var13 + var15) && var14 > (class392.field5940[var27] - var11)) {
                        var14 = class392.field5940[var27] - var11;
                        var16 = true;
                    }
                }
            }
            class392.field5940[var12] = var14;
            String var17 = class392.field5927[var12];
            if (class380.field5728 == 0) {
                int var18 = 16776960;
                if (class392.field5929[var12] < 6) {
                    var18 = class252.field3304[class392.field5929[var12]];
                }
                if (class392.field5929[var12] == 6) {
                    var18 = (class229.field3041 % 20) < 10 ? 16711680 : 16776960;
                }
                if (class392.field5929[var12] == 7) {
                    var18 = (class229.field3041 % 20) >= 10 ? 65535 : 255;
                }
                if (class392.field5929[var12] == 8) {
                    var18 = (class229.field3041 % 20) < 10 ? 45056 : 8454016;
                }
                if (class392.field5929[var12] == 9) {
                    int var19 = 150 - class392.field5931[var12];
                    if (var19 < 50) {
                        var18 = var19 * 1280 + 16711680;
                    } else if (var19 < 100) {
                        var18 = 33160960 - var19 * 327680;
                    } else if (var19 < 150) {
                        var18 = (var19 - 100) * 5 + 65280;
                    }
                }
                if (class392.field5929[var12] == 10) {
                    int var20 = 150 - class392.field5931[var12];
                    if (var20 < 50) {
                        var18 = var20 * 5 + 16711680;
                    } else if (var20 < 100) {
                        var18 = 16711935 - ((var20 - 50) * 327680);
                    } else if (var20 < 150) {
                        var18 = ((var20 - 100) * 327680) + 255 - ((var20 + -100) * 5);
                    }
                }
                if (class392.field5929[var12] == 11) {
                    int var21 = 150 - class392.field5931[var12];
                    if (var21 < 50) {
                        var18 = 16777215 - (var21 * 327685);
                    } else if (var21 < 100) {
                        var18 = (var21 - 50) * 327685 + 65280;
                    } else if (var21 < 150) {
                        var18 = 32768000 + 16777215 - (var21 * 327680);
                    }
                }
                int var22 = var18 | 0xFF000000;
                if (class392.field5918[var12] == 0) {
                    class395.field5976.method2448((byte) 110, var22, -16777216, var17, arg4 + var14, arg1 + var13);
                }
                if (class392.field5918[var12] == 1) {
                    class395.field5976.method2446(class229.field3041, (byte) -76, var22, arg4 + var14, -16777216, arg1 - -var13, var17);
                }
                if (class392.field5918[var12] == 2) {
                    class395.field5976.method2443(9789, -16777216, var22, var17, arg4 + var14, arg1 - -var13, class229.field3041);
                }
                if (class392.field5918[var12] == 3) {
                    class395.field5976.method2440(arg1 + var13, class229.field3041, arg4 + var14, var22, -16777216, 150 - class392.field5931[var12], var17, 26309);
                }
                if (class392.field5918[var12] == 4) {
                    int var23 = (150 - class392.field5931[var12]) * (class141.field2042.method3455(var17, (byte) 1) + 100) / 150;
                    class332.field4821.method692(var13 + arg1 - 50, arg4, arg1 + var13 + 50, arg4 - -arg5);
                    class395.field5976.method2447(arg1 + var13 + 50 - var23, var17, var22, 2, arg4 + var14, -16777216);
                    class332.field4821.method652(arg1, arg4, arg1 + arg6, arg4 + arg5);
                }
                if (class392.field5918[var12] == 5) {
                    int var24 = 150 - class392.field5931[var12];
                    int var25 = 0;
                    if (var24 < 25) {
                        var25 = var24 - 25;
                    } else if (var24 > 125) {
                        var25 = var24 - 125;
                    }
                    int var26 = class141.field2042.field8759 + class141.field2042.field8749;
                    class332.field4821.method692(arg1, arg4 + var14 - var26 - 1, arg1 + arg6, arg4 + var14 + 5);
                    class395.field5976.method2448((byte) 114, var22, -16777216, var17, arg4 + var14 + var25, arg1 + var13);
                    class332.field4821.method652(arg1, arg4, arg1 + arg6, arg4 + arg5);
                }
            } else {
                class395.field5976.method2448((byte) 120, -256, -16777216, var17, arg4 + var14, arg1 + var13);
            }
        }
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(II)Z", line = 673)
    public final boolean method456(int arg0, int arg1) {
        if (arg1 >= -22) {
            this.method452(120);
        }
        field1281++;
        return (this.field1275 >> arg0 + 1 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!iga", name = "a", descriptor = "(Z)I", line = 685)
    public final int method457(boolean arg0) {
        field1274++;
        if (arg0) {
            this.method457(true);
        }
        return (this.field1275 & 0x1DCBE1) >> 18;
    }

    @OriginalMember(owner = "client!iga", name = "d", descriptor = "(I)V", line = 697)
    public static void method458(int arg0) {
        if (arg0 > -124) {
            field1283 = null;
        }
        field1283 = null;
    }
}
