import java.awt.Component;
import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mc")
public abstract class class51 {

    @OriginalMember(owner = "client!mc", name = "g", descriptor = "I")
    public static int field935 = 0;

    @OriginalMember(owner = "client!mc", name = "d", descriptor = "I")
    public static int field932 = 0;

    @OriginalMember(owner = "client!mc", name = "h", descriptor = "B")
    public static byte field936;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "I")
    public static int field930;

    @OriginalMember(owner = "client!mc", name = "c", descriptor = "I")
    public static int field931;

    @OriginalMember(owner = "client!mc", name = "e", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!mc", name = "f", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!mc", name = "i", descriptor = "I")
    public static int field937;

    @OriginalMember(owner = "client!mc", name = "j", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!mc", name = "l", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!mc", name = "k", descriptor = "[[B")
    public static byte[][] field939;

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lff;Ljava/awt/Frame;I)V", line = 6)
    public static final void method405(class4 arg0, Frame arg1, int arg2) {
        field940++;
        while (true) {
            class82 var3 = arg0.method38(arg1, (byte) 123);
            while (var3.field1500 == 0) {
                class46.method381(10L, 79);
            }
            if (var3.field1500 == 1) {
                arg1.setVisible(false);
                if (arg2 != -4) {
                    field939 = (byte[][]) ((byte[][]) null);
                }
                arg1.dispose();
                return;
            }
            class46.method381(100L, 59);
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(ILff;Ljava/awt/Component;II)Lwi;", line = 32)
    public static final class195 method406(int arg0, class4 arg1, Component arg2, int arg3, int arg4) {
        field933++;
        if (class175.field3109 == 0) {
            throw new IllegalStateException();
        } else if (arg4 >= 0 && arg4 < 2) {
            if (arg0 < 256) {
                arg0 = 256;
            }
            try {
                class195 var5 = (class195) Class.forName("te").getDeclaredConstructor().newInstance();
                var5.field3582 = arg0;
                var5.field3570 = new int[(class305.field5277 ? 2 : 1) * 256];
                var5.method226(arg2);
                var5.field3579 = (arg0 & 0xFFFFFC00) + 1024;
                if (var5.field3579 > 16384) {
                    var5.field3579 = 16384;
                }
                var5.method232(var5.field3579);
                if (class209.field3780 > 0 && class121.field2127 == null) {
                    class121.field2127 = new class270();
                    class121.field2127.field4614 = arg1;
                    arg1.method20(class209.field3780, class121.field2127, (byte) -31);
                }
                if (class121.field2127 != null) {
                    if (class121.field2127.field4613[arg4] != null) {
                        throw new IllegalArgumentException();
                    }
                    class121.field2127.field4613[arg4] = var5;
                }
                if (arg3 != -25535) {
                    method406(-126, (class4) null, (Component) null, 57, 2);
                }
                return var5;
            } catch (Throwable var10) {
                try {
                    class33 var7 = new class33(arg1, arg4);
                    var7.field3582 = arg0;
                    var7.field3570 = new int[(class305.field5277 ? 2 : 1) * 256];
                    var7.method226(arg2);
                    var7.field3579 = 16384;
                    var7.method232(var7.field3579);
                    if (class209.field3780 > 0 && class121.field2127 == null) {
                        class121.field2127 = new class270();
                        class121.field2127.field4614 = arg1;
                        arg1.method20(class209.field3780, class121.field2127, (byte) 121);
                    }
                    if (class121.field2127 != null) {
                        if (class121.field2127.field4613[arg4] != null) {
                            throw new IllegalArgumentException();
                        }
                        class121.field2127.field4613[arg4] = var7;
                    }
                    return var7;
                } catch (Throwable var9) {
                    return new class195();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(I)V", line = 118)
    public static void method407(int arg0) {
        if (arg0 == 1) {
            field939 = (byte[][]) null;
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "()Z", line = 138)
    public boolean method408() {
        field929++;
        return false;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "([Lsd;ZI)V", line = 160)
    public static final void method409(class37[] arg0, boolean arg1, int arg2) {
        field931++;
        if (arg2 != -5) {
            field932 = 85;
        }
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        if (!arg1) {
            for (int var4 = 0; var4 < 4; var4++) {
                for (int var5 = 0; var5 < 104; var5++) {
                    for (int var6 = 0; var6 < 104; var6++) {
                        if ((class308.field5296[var4][var5][var6] & 0x1) == 1) {
                            int var7 = var4;
                            if ((class308.field5296[1][var5][var6] & 0x2) == 2) {
                                var7 = var4 - 1;
                            }
                            if (var7 >= 0) {
                                arg0[var7].method279((byte) 110, var6, var5);
                            }
                        }
                    }
                }
            }
            class71.field1301 += (int) (Math.random() * 5.0D) - 2;
            if (class71.field1301 < -16) {
                class71.field1301 = -16;
            }
            class179.field3171 += (int) (Math.random() * 5.0D) - 2;
            if (class179.field3171 < -8) {
                class179.field3171 = -8;
            }
            if (class179.field3171 > 8) {
                class179.field3171 = 8;
            }
            if (class71.field1301 > 16) {
                class71.field1301 = 16;
            }
        }
        int var8 = class179.field3171 >> 2 << 10;
        int[][] var9 = new int[104][104];
        int var10 = class71.field1301 >> 1;
        int[][] var11 = new int[104][104];
        for (int var12 = 0; var12 < var3; var12++) {
            byte[][] var13 = class249.field4234[var12];
            if (!class253.field4323) {
                int var14 = (int) Math.sqrt(5100.0D);
                int var15 = var14 * 768 >> 8;
                for (int var16 = 1; var16 < 103; var16++) {
                    for (int var17 = 1; var17 < 103; var17++) {
                        int var18 = class118.field2090[var12][var17][var16 + 1] - class118.field2090[var12][var17][var16 - 1];
                        int var19 = class118.field2090[var12][var17 + 1][var16] - class118.field2090[var12][var17 - 1][var16];
                        byte var20 = 74;
                        int var21 = (int) Math.sqrt((double) (var18 * var18 + var19 * var19 + 65536));
                        int var22 = (var19 << 8) / var21;
                        int var23 = -65536 / var21;
                        int var24 = (var18 << 8) / var21;
                        int var25 = (var13[var17][var16] >> 1) + (var13[var17][var16 + 1] >> 3) + ((var13[var17 + -1][var16] >> 2) - (-(var13[var17 - -1][var16] >> 3) - (var13[var17][var16 + -1] >> 2)));
                        int var26 = (var24 * -50 + var22 * -50 + var23 * -10) / var15 + var20;
                        var11[var17][var16] = var26 - var25;
                    }
                }
            } else if (class193.field3531) {
                for (int var43 = 1; var43 < 103; var43++) {
                    for (int var44 = 1; var44 < 103; var44++) {
                        byte var45 = 74;
                        int var46 = (var13[var44][var43 - 1] >> 2) + (var13[var44][var43] >> 1) + (var13[var44][var43 + 1] >> 3) + ((var13[var44 + -1][var43] >> 2) - -(var13[var44 + 1][var43] >> 3));
                        var11[var44][var43] = var45 - var46;
                    }
                }
            } else {
                int var27 = (int) class169.field3000[1];
                int var28 = (int) class169.field3000[2];
                int var29 = (int) class169.field3000[0];
                int var30 = (int) Math.sqrt((double) (var27 * var27 + var28 * var28 + var29 * var29));
                int var31 = var30 * 1024 >> 8;
                for (int var32 = 1; var32 < 103; var32++) {
                    for (int var33 = 1; var33 < 103; var33++) {
                        byte var34 = 96;
                        int var35 = class118.field2090[var12][var33][var32 + 1] - class118.field2090[var12][var33][var32 - 1];
                        int var36 = class118.field2090[var12][var33 + 1][var32] - class118.field2090[var12][var33 - 1][var32];
                        int var37 = (int) Math.sqrt((double) (var35 * var35 + var36 * var36 + 65536));
                        int var38 = (var36 << 8) / var37;
                        int var39 = -65536 / var37;
                        int var40 = (var13[var33 - 1][var32] >> 2) + (var13[var33 + 1][var32] >> 3) + (var13[var33][var32 + -1] >> 2) + (var13[var33][var32 + 1] >> 3) + (var13[var33][var32] >> 1);
                        int var41 = (var35 << 8) / var37;
                        int var42 = (var29 * var38 + (var27 * var39) + (var28 * var41)) / var31 + var34;
                        var11[var33][var32] = var42 - (int) ((float) var40 * 1.7F);
                    }
                }
            }
            for (int var47 = 0; var47 < 104; var47++) {
                class305.field5268[var47] = 0;
                class213.field3805[var47] = 0;
                class10.field151[var47] = 0;
                class74.field1377[var47] = 0;
                class130.field2273[var47] = 0;
            }
            for (int var48 = -5; var48 < 104; var48++) {
                for (int var49 = 0; var49 < 104; var49++) {
                    int var50 = var48 + 5;
                    int var10002;
                    if (var50 < 104) {
                        int var51 = class301.field5179[var12][var50][var49] & 0xFF;
                        if (var51 > 0) {
                            class53 var52 = class108.method762(-86, var51 - 1);
                            class305.field5268[var49] += var52.field973;
                            class213.field3805[var49] += var52.field966;
                            class10.field151[var49] += var52.field971;
                            class74.field1377[var49] += var52.field976;
                            var10002 = class130.field2273[var49]++;
                        }
                    }
                    int var53 = var48 - 5;
                    if (var53 >= 0) {
                        int var54 = class301.field5179[var12][var53][var49] & 0xFF;
                        if (var54 > 0) {
                            class53 var55 = class108.method762(arg2 - 16, var54 + -1);
                            class305.field5268[var49] -= var55.field973;
                            class213.field3805[var49] -= var55.field966;
                            class10.field151[var49] -= var55.field971;
                            class74.field1377[var49] -= var55.field976;
                            var10002 = class130.field2273[var49]--;
                        }
                    }
                }
                if (var48 >= 0) {
                    int var56 = 0;
                    int var57 = 0;
                    int var58 = 0;
                    int var59 = 0;
                    int var60 = 0;
                    for (int var61 = -5; var61 < 104; var61++) {
                        int var62 = var61 - 5;
                        int var63 = var61 + 5;
                        if (var63 < 104) {
                            var57 += class213.field3805[var63];
                            var59 += class74.field1377[var63];
                            var60 += class130.field2273[var63];
                            var56 += class305.field5268[var63];
                            var58 += class10.field151[var63];
                        }
                        if (var62 >= 0) {
                            var57 -= class213.field3805[var62];
                            var58 -= class10.field151[var62];
                            var56 -= class305.field5268[var62];
                            var59 -= class74.field1377[var62];
                            var60 -= class130.field2273[var62];
                        }
                        if (var61 >= 0 && var60 > 0) {
                            var9[var48][var61] = class189.method1375(var57 / var60, var58 / var60, var56 * 256 / var59, (byte) 53);
                        }
                    }
                }
            }
            for (int var64 = 1; var64 < 103; var64++) {
                label771: for (int var65 = 1; var65 < 103; var65++) {
                    if (arg1 || class216.method1512(128) || (class308.field5296[0][var64][var65] & 0x2) != 0 || (class308.field5296[var12][var64][var65] & 0x10) == 0 && class159.method1179(var64, var65, 9373, var12) == class7.field110) {
                        if (class191.field3491 > var12) {
                            class191.field3491 = var12;
                        }
                        int var66 = class301.field5179[var12][var64][var65] & 0xFF;
                        int var67 = class13.field175[var12][var64][var65] & 0xFF;
                        if (var66 > 0 || var67 > 0) {
                            int var68 = class118.field2090[var12][var64 + 1][var65];
                            int var69 = class118.field2090[var12][var64][var65];
                            int var70 = class118.field2090[var12][var64 + 1][var65 + 1];
                            int var71 = class118.field2090[var12][var64][var65 + 1];
                            if (var12 > 0) {
                                boolean var72 = true;
                                if (var66 == 0 && class257.field4452[var12][var64][var65] != 0) {
                                    var72 = false;
                                }
                                if (var67 > 0 && !class252.method1695(var67 - 1, arg2 ^ 0x7C9A).field3507) {
                                    var72 = false;
                                }
                                if (var72 && var68 == var69 && var69 == var70 && var69 == var71) {
                                    class210.field3792[var12][var64][var65] = class100.method721(class210.field3792[var12][var64][var65], 4);
                                }
                            }
                            int var73;
                            int var74;
                            if (var66 <= 0) {
                                var73 = -1;
                                var74 = 0;
                            } else {
                                var73 = var9[var64][var65];
                                int var75 = (var73 & 0x7F) + var10;
                                if (var75 < 0) {
                                    var75 = 0;
                                } else if (var75 > 127) {
                                    var75 = 127;
                                }
                                int var76 = (var8 + var73 & 0xFC00) + (var73 & 0x380) + var75;
                                var74 = class136.field2370[class119.method810(var76, 25709, 96)];
                            }
                            int var77 = var11[var64][var65];
                            int var78 = var11[var64 + 1][var65];
                            int var79 = var11[var64 + 1][var65 + 1];
                            int var80 = var11[var64][var65 + 1];
                            if (var67 == 0) {
                                class251.method1685(var12, var64, var65, 0, 0, -1, var69, var68, var70, var71, class119.method810(var73, arg2 ^ 0xFFFF9B96, var77), class119.method810(var73, arg2 ^ 0xFFFF9B96, var78), class119.method810(var73, 25709, var79), class119.method810(var73, 25709, var80), 0, 0, 0, 0, var74, 0);
                                if (class253.field4323 && var12 > 0 && var73 != -1 && class108.method762(arg2 ^ 0x70, var66 - 1).field977) {
                                    class123.method840(0, 0, true, false, var64, var65, var69 - class118.field2090[0][var64][var65], -class118.field2090[0][var64 + 1][var65] + var68, var70 - class118.field2090[0][var64 + 1][var65 + 1], -class118.field2090[0][var64][var65 + 1] + var71);
                                }
                                if (class253.field4323 && !arg1 && class11.field167 != null && var12 == 0) {
                                    for (int var81 = var64 - 1; var81 <= var64 + 1; var81++) {
                                        for (int var82 = var65 - 1; var82 <= (var65 + 1); var82++) {
                                            if ((var64 != var81 || var65 != var82) && var81 >= 0 && var81 < 104 && var82 >= 0 && var82 < 104) {
                                                int var83 = class13.field175[var12][var81][var82] & 0xFF;
                                                if (var83 != 0) {
                                                    class192 var84 = class252.method1695(var83 - 1, arg2 + -31898);
                                                    if (var84.field3522 != -1 && class136.field2373.method199(var84.field3522, (byte) 87) == 4) {
                                                        class11.field167[var64][var65] = (var84.field3516 << 24) + var84.field3512;
                                                        continue label771;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            } else {
                                int var85 = class257.field4452[var12][var64][var65] + 1;
                                byte var86 = class48.field858[var12][var64][var65];
                                class192 var87 = class252.method1695(var67 - 1, -31903);
                                if (class253.field4323 && !arg1 && class11.field167 != null && var12 == 0) {
                                    if (var87.field3522 != -1 && class136.field2373.method199(var87.field3522, (byte) 127) == 4) {
                                        class11.field167[var64][var65] = (var87.field3516 << 24) + var87.field3512;
                                    } else {
                                        label752: for (int var88 = var64 - 1; var88 <= var64 + 1; var88++) {
                                            for (int var89 = var65 - 1; var89 <= (var65 + 1); var89++) {
                                                if ((var64 != var88 || var65 != var89) && var88 >= 0 && var88 < 104 && var89 >= 0 && var89 < 104) {
                                                    int var90 = class13.field175[var12][var88][var89] & 0xFF;
                                                    if (var90 != 0) {
                                                        class192 var91 = class252.method1695(var90 - 1, -31903);
                                                        if (var91.field3522 != -1 && class136.field2373.method199(var91.field3522, (byte) 68) == 4) {
                                                            class11.field167[var64][var65] = (var91.field3516 << 24) + var91.field3512;
                                                            break label752;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                                int var92 = var87.field3522;
                                if (var92 >= 0 && !class136.field2373.method205(var92, false)) {
                                    var92 = -1;
                                }
                                int var93;
                                int var94;
                                if (var92 >= 0) {
                                    var93 = -1;
                                    var94 = class136.field2370[class90.method674(class136.field2373.method190(var92, 65535), -77, 96)];
                                } else if (var87.field3506 == -1) {
                                    var93 = -2;
                                    var94 = 0;
                                } else {
                                    var93 = var87.field3506;
                                    int var95 = (var93 & 0x7F) + var10;
                                    if (var95 < 0) {
                                        var95 = 0;
                                    } else if (var95 > 127) {
                                        var95 = 127;
                                    }
                                    int var96 = (var93 + var8 & 0xFC00) - (-(var93 & 0x380) - var95);
                                    var94 = class136.field2370[class90.method674(var96, arg2 - 46, 96)];
                                }
                                if (var87.field3499 >= 0) {
                                    int var97 = var87.field3499;
                                    int var98 = (var97 & 0x7F) + var10;
                                    if (var98 < 0) {
                                        var98 = 0;
                                    } else if (var98 > 127) {
                                        var98 = 127;
                                    }
                                    int var99 = (var97 + var8 & 0xFC00) + (var97 & 0x380) + var98;
                                    var94 = class136.field2370[class90.method674(var99, -113, 96)];
                                }
                                class251.method1685(var12, var64, var65, var85, var86, var92, var69, var68, var70, var71, class119.method810(var73, arg2 + 25714, var77), class119.method810(var73, 25709, var78), class119.method810(var73, arg2 + 25714, var79), class119.method810(var73, arg2 + 25714, var80), class90.method674(var93, -76, var77), class90.method674(var93, -101, var78), class90.method674(var93, -121, var79), class90.method674(var93, arg2 ^ 0x7E, var80), var74, var94);
                                if (class253.field4323 && var12 > 0) {
                                    class123.method840(var85, var86, var93 == -2 || !var87.field3514, var73 == -1 || !class108.method762(-101, var66 - 1).field977, var64, var65, var69 - class118.field2090[0][var64][var65], -class118.field2090[0][var64 + 1][var65] + var68, var70 - class118.field2090[0][var64 + 1][var65 + 1], -class118.field2090[0][var64][var65 + 1] + var71);
                                }
                            }
                        }
                    }
                }
            }
            if (class253.field4323) {
                float[][] var100 = new float[105][105];
                float[][] var101 = new float[105][105];
                int[][] var102 = class118.field2090[var12];
                float[][] var103 = new float[105][105];
                int var104 = 1;
                while (true) {
                    if (var104 > 103) {
                        if (arg1) {
                            class113[] var109 = class194.method1402(var101, class48.field858[var12], class11.field167, var9, class301.field5179[var12], var11, class13.field175[var12], var103, var100, class118.field2090[var12], var12, true, class308.field5296, class257.field4452[var12], class72.field1329[0]);
                            class22.method145(var12, var109);
                            break;
                        }
                        class113[] var110 = class194.method1402(var101, class48.field858[var12], (int[][]) null, var9, class301.field5179[var12], var11, class13.field175[var12], var103, var100, class118.field2090[var12], var12, true, class308.field5296, class257.field4452[var12], (int[][]) null);
                        class113[] var111 = class107.method760(class48.field858[var12], class118.field2090[var12], var100, class301.field5179[var12], var12, var101, var11, 27564, var103, class308.field5296, class257.field4452[var12], class13.field175[var12]);
                        class113[] var112 = new class113[var110.length + var111.length];
                        for (int var113 = 0; var113 < var110.length; var113++) {
                            var112[var113] = var110[var113];
                        }
                        for (int var114 = 0; var114 < var111.length; var114++) {
                            var112[var114 + var110.length] = var111[var114];
                        }
                        class22.method145(var12, var112);
                        class13.method78(var100, class245.field4174, class301.field5179[var12], var101, class257.field4452[var12], var12, class13.field175[var12], class48.field858[var12], class118.field2090[var12], var103, 3254, class245.field4178);
                        break;
                    }
                    for (int var105 = 1; var105 <= 103; var105++) {
                        int var106 = var102[var105][var104 + 1] - var102[var105][var104 - 1];
                        int var107 = var102[var105 + 1][var104] - var102[var105 - 1][var104];
                        float var108 = (float) Math.sqrt((double) (var107 * var107 + var106 * var106 + 65536));
                        var100[var105][var104] = (float) var107 / var108;
                        var101[var105][var104] = -256.0F / var108;
                        var103[var105][var104] = (float) var106 / var108;
                    }
                    var104++;
                }
            }
            class301.field5179[var12] = (byte[][]) null;
            class13.field175[var12] = (byte[][]) null;
            class257.field4452[var12] = (byte[][]) null;
            class48.field858[var12] = (byte[][]) null;
            class249.field4234[var12] = (byte[][]) null;
        }
        class193.method1398(-50, -10, -50);
        if (arg1) {
            return;
        }
        for (int var115 = 0; var115 < 104; var115++) {
            for (int var116 = 0; var116 < 104; var116++) {
                if ((class308.field5296[1][var115][var116] & 0x2) == 2) {
                    class48.method383(var115, var116);
                }
            }
        }
        for (int var117 = 0; var117 < 4; var117++) {
            for (int var118 = 0; var118 <= 104; var118++) {
                for (int var119 = 0; var119 <= 104; var119++) {
                    if ((class210.field3792[var117][var119][var118] & 0x1) != 0) {
                        int var120;
                        for (var120 = var118; var120 > 0 && (class210.field3792[var117][var119][var120 - 1] & 0x1) != 0; var120--) {
                        }
                        int var121;
                        for (var121 = var118; var121 < 104 && (class210.field3792[var117][var119][var121 + 1] & 0x1) != 0; var121++) {
                        }
                        int var122;
                        label454: for (var122 = var117; var122 > 0; var122--) {
                            for (int var123 = var120; var123 <= var121; var123++) {
                                if ((class210.field3792[var122 - 1][var119][var123] & 0x1) == 0) {
                                    break label454;
                                }
                            }
                        }
                        int var124;
                        label442: for (var124 = var117; var124 < 3; var124++) {
                            for (int var125 = var120; var125 <= var121; var125++) {
                                if ((class210.field3792[var124 + 1][var119][var125] & 0x1) == 0) {
                                    break label442;
                                }
                            }
                        }
                        int var126 = (var121 + 1 - var120) * (var124 + 1 - var122);
                        if (var126 >= 8) {
                            int var127 = class118.field2090[var122][var119][var120];
                            short var128 = 240;
                            int var129 = class118.field2090[var124][var119][var120] - var128;
                            class148.method1078(1, var119 * 128, var119 * 128, var120 * 128, var121 * 128 + 128, var129, var127);
                            for (int var130 = var122; var130 <= var124; var130++) {
                                for (int var131 = var120; var131 <= var121; var131++) {
                                    class210.field3792[var130][var119][var131] = class150.method1123(class210.field3792[var130][var119][var131], -2);
                                }
                            }
                        }
                    }
                    if ((class210.field3792[var117][var119][var118] & 0x2) != 0) {
                        int var132 = var119;
                        int var133 = var119;
                        int var134 = var117;
                        while (var132 > 0 && (class210.field3792[var117][var132 - 1][var118] & 0x2) != 0) {
                            var132--;
                        }
                        while (var133 < 104 && (class210.field3792[var117][var133 + 1][var118] & 0x2) != 0) {
                            var133++;
                        }
                        int var135 = var117;
                        label509: while (var134 > 0) {
                            for (int var136 = var132; var136 <= var133; var136++) {
                                if ((class210.field3792[var134 - 1][var136][var118] & 0x2) == 0) {
                                    break label509;
                                }
                            }
                            var134--;
                        }
                        label498: while (var135 < 3) {
                            for (int var137 = var132; var137 <= var133; var137++) {
                                if ((class210.field3792[var135 + 1][var137][var118] & 0x2) == 0) {
                                    break label498;
                                }
                            }
                            var135++;
                        }
                        int var138 = (var135 + 1 - var134) * (var133 + 1 - var132);
                        if (var138 >= 8) {
                            int var139 = class118.field2090[var134][var132][var118];
                            short var140 = 240;
                            int var141 = class118.field2090[var135][var132][var118] - var140;
                            class148.method1078(2, var132 * 128, var133 * 128 + 128, var118 * 128, var118 * 128, var141, var139);
                            for (int var142 = var134; var142 <= var135; var142++) {
                                for (int var143 = var132; var143 <= var133; var143++) {
                                    class210.field3792[var142][var143][var118] = class150.method1123(class210.field3792[var142][var143][var118], -3);
                                }
                            }
                        }
                    }
                    if ((class210.field3792[var117][var119][var118] & 0x4) != 0) {
                        int var144 = var119;
                        int var145 = var119;
                        int var146 = var118;
                        int var147 = var118;
                        while (var146 > 0 && (class210.field3792[var117][var119][var146 - 1] & 0x4) != 0) {
                            var146--;
                        }
                        while (var147 < 104 && (class210.field3792[var117][var119][var147 + 1] & 0x4) != 0) {
                            var147++;
                        }
                        label563: while (var144 > 0) {
                            for (int var148 = var146; var148 <= var147; var148++) {
                                if ((class210.field3792[var117][var144 - 1][var148] & 0x4) == 0) {
                                    break label563;
                                }
                            }
                            var144--;
                        }
                        label552: while (var145 < 104) {
                            for (int var149 = var146; var149 <= var147; var149++) {
                                if ((class210.field3792[var117][var145 + 1][var149] & 0x4) == 0) {
                                    break label552;
                                }
                            }
                            var145++;
                        }
                        if (((var147 + 1 - var146) * (var145 + 1 - var144)) >= 4) {
                            int var150 = class118.field2090[var117][var144][var146];
                            class148.method1078(4, var144 * 128, var145 * 128 + 128, var146 * 128, var147 * 128 + 128, var150, var150);
                            for (int var151 = var144; var151 <= var145; var151++) {
                                for (int var152 = var146; var152 <= var147; var152++) {
                                    class210.field3792[var117][var151][var152] = class150.method1123(class210.field3792[var117][var151][var152], -5);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(Lmc;IIIZ)V", line = 1136)
    public void method410(class51 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field930++;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(III)Lmc;", line = 1145)
    public class51 method411(int arg0, int arg1, int arg2) {
        field938++;
        return this;
    }

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIIIIIIJILfk;)V")
    public abstract void method150(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class283 arg10);

    @OriginalMember(owner = "client!mc", name = "b", descriptor = "()I")
    public abstract int method154();

    @OriginalMember(owner = "client!mc", name = "a", descriptor = "(IIIII)V")
    public abstract void method152(int arg0, int arg1, int arg2, int arg3, int arg4);
}
