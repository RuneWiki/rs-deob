import java.awt.Canvas;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hd")
public class class46 extends class120 {

    @OriginalMember(owner = "client!hd", name = "db", descriptor = "[Lma;")
    public class73[] field1083;

    @OriginalMember(owner = "client!hd", name = "N", descriptor = "J")
    public static long field1067 = 0L;

    @OriginalMember(owner = "client!hd", name = "U", descriptor = "[I")
    public static int[] field1074 = new int[500];

    @OriginalMember(owner = "client!hd", name = "S", descriptor = "Li;")
    public static class48 field1072 = new class48(260);

    @OriginalMember(owner = "client!hd", name = "ab", descriptor = "Lva;")
    private static class121 field1080 = class107.method797("Choose Option", -10983);

    @OriginalMember(owner = "client!hd", name = "bb", descriptor = "Lva;")
    public static class121 field1081 = field1080;

    @OriginalMember(owner = "client!hd", name = "cb", descriptor = "[[[I")
    public static int[][][] field1082 = new int[4][13][13];

    @OriginalMember(owner = "client!hd", name = "eb", descriptor = "Z")
    public static boolean field1084 = false;

    @OriginalMember(owner = "client!hd", name = "O", descriptor = "I")
    public static int field1068;

    @OriginalMember(owner = "client!hd", name = "P", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!hd", name = "Q", descriptor = "I")
    public static int field1070;

    @OriginalMember(owner = "client!hd", name = "R", descriptor = "I")
    public static int field1071;

    @OriginalMember(owner = "client!hd", name = "T", descriptor = "I")
    public static int field1073;

    @OriginalMember(owner = "client!hd", name = "V", descriptor = "I")
    public static int field1075;

    @OriginalMember(owner = "client!hd", name = "W", descriptor = "I")
    public static int field1076;

    @OriginalMember(owner = "client!hd", name = "X", descriptor = "I")
    public static int field1077;

    @OriginalMember(owner = "client!hd", name = "Y", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!hd", name = "Z", descriptor = "Ljava/awt/Canvas;")
    public static Canvas field1079;

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IB)V", line = 15)
    public static final void method304(int arg0, byte arg1) {
        class80.method550(false, arg0, 0, null, arg1 ^ 0xFFFFC4CA);
        field1076++;
        if (arg1 != -82) {
            field1074 = null;
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZI)Z", line = 26)
    public final boolean method305(boolean arg0, int arg1) {
        field1071++;
        if (!arg0) {
            method304(47, (byte) -46);
        }
        return this.field1083[arg1].field1703;
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(I)V", line = 63)
    public static final void method306(int arg0) {
        class66.field1578.method617(17591);
        field1073++;
        if (arg0 != 7) {
            return;
        }
        int var1 = class66.field1578.method626(1, -101);
        if (var1 == 0) {
            return;
        }
        int var2 = class66.field1578.method626(2, -120);
        if (var2 == 0) {
            class15.field274[class92.field2087++] = 2047;
        } else if (var2 == 1) {
            int var3 = class66.field1578.method626(3, arg0 - 129);
            class62.field1494.method225(var3, 64, false);
            int var4 = class66.field1578.method626(1, -68);
            if (var4 == 1) {
                class15.field274[class92.field2087++] = 2047;
            }
        } else if (var2 == 2) {
            int var5 = class66.field1578.method626(3, -67);
            class62.field1494.method225(var5, 64, true);
            int var6 = class66.field1578.method626(3, arg0 - 82);
            class62.field1494.method225(var6, 64, true);
            int var7 = class66.field1578.method626(1, arg0 - 60);
            if (var7 == 1) {
                class15.field274[class92.field2087++] = 2047;
            }
        } else if (var2 == 3) {
            int var8 = class66.field1578.method626(7, arg0 - 83);
            int var9 = class66.field1578.method626(1, -71);
            if (var9 == 1) {
                class15.field274[class92.field2087++] = 2047;
            }
            int var10 = class66.field1578.method626(7, -42);
            int var11 = class66.field1578.method626(1, arg0 ^ 0xFFFFFFD7);
            class121.field2807 = class66.field1578.method626(2, -64);
            class62.field1494.method233(var10, var11 == 1, false, var8);
        }
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(I[BB)I", line = 138)
    public static final int method307(int arg0, byte[] arg1, byte arg2) {
        field1070++;
        return arg2 == 52 ? class95.method635(0, arg0, arg1, (byte) -125) : -68;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(Led;IB)V", line = 150)
    public static final void method308(class29 arg0, int arg1, byte arg2) {
        field1075++;
        class60.method441(arg1, 119, arg0.field742, arg0.field750);
        int var3 = 5 % ((arg2 - 53) / 63);
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(IB)Z", line = 160)
    public static final boolean method309(int arg0, byte arg1) {
        field1077++;
        if (arg0 < 0) {
            return false;
        }
        int var2 = class35.field844[arg0];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        if (arg1 != 54) {
            method309(37, (byte) -35);
        }
        return var2 == 17;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(IIIIIIBII)Z", line = 191)
    public static final boolean method310(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
        field1069++;
        if (!class28.method221(arg5, 14585)) {
            return false;
        }
        class55.method400(arg4, arg8, arg1, arg7);
        if (arg6 != 99) {
            return false;
        }
        boolean var9 = true;
        class19[] var10 = class126.field2872[arg5];
        for (int var11 = 0; var11 < var10.length; var11++) {
            class19 var12 = var10[var11];
            if (var12 != null && var12.field445 == arg2) {
                if (var12.field518 > 0) {
                    class37.method256((byte) -61, var12);
                }
                int var13 = var12.field509 + arg4;
                int var14 = var12.field504 + arg8 - arg0;
                if (var12.field479 == 0) {
                    if (var12.field507 && !class60.method438(var11, (byte) -45, arg3)) {
                        continue;
                    }
                    if (var12.field476 - var12.field449 < var12.field481) {
                        var12.field481 = var12.field476 - var12.field449;
                    }
                    if (var12.field481 < 0) {
                        var12.field481 = 0;
                    }
                    var9 &= method310(var12.field481, var13 + var12.field459, var11, arg3, var13, arg5, (byte) 99, var14 + var12.field449, var14);
                    class55.method400(arg4, arg8, arg1, arg7);
                    if (var12.field449 < var12.field476) {
                        class61.method445(var14, var12.field476, var12.field449, (byte) 102, var12.field481, var13 + var12.field459);
                    }
                }
                if (var12.field479 != 1) {
                    if (var12.field479 == 2) {
                        int var15 = 0;
                        for (int var16 = 0; var16 < var12.field449; var16++) {
                            for (int var17 = 0; var17 < var12.field459; var17++) {
                                int var18 = var14 + (var12.field471 + 32) * var16;
                                int var19 = (var12.field489 + 32) * var17 + var13;
                                if (var15 < 20) {
                                    var19 += var12.field501[var15];
                                    var18 += var12.field520[var15];
                                }
                                if (var12.field478[var15] > 0) {
                                    int var21 = 0;
                                    int var22 = 0;
                                    int var23 = var12.field478[var15] - 1;
                                    if (var19 > class55.field1270 - 32 && class55.field1268 > var19 && var18 > class55.field1269 - 32 && var18 < class55.field1266 || class90.field2048 != 0 && class58.field1338 == var15) {
                                        int var24 = 0;
                                        if (class114.field2564 == 1 && class26.field668 == var15 && (arg5 << 16) + var11 == class14.field261) {
                                            var24 = 16777215;
                                        }
                                        class10 var25 = class47.method339(var12.field487[var15], var24, var23, (byte) 31);
                                        if (var25 == null) {
                                            var9 = false;
                                        } else {
                                            if (class90.field2048 != 0 && class58.field1338 == var15 && (arg5 << 16) + var11 == class125.field2849) {
                                                var22 = class19.field514 - class127.field2885;
                                                if (var22 < 5 && var22 > -5) {
                                                    var22 = 0;
                                                }
                                                var21 = class34.field822 - class45.field1065;
                                                if (var21 < 5 && var21 > -5) {
                                                    var21 = 0;
                                                }
                                                if (class79.field1839 < 5) {
                                                    var21 = 0;
                                                    var22 = 0;
                                                }
                                                var25.method79(var19 + var21, var18 + var22, 128);
                                                if (arg2 != -1) {
                                                    class19 var26 = var10[arg2];
                                                    if (class55.field1269 > var18 + var22 && var26.field481 > 0) {
                                                        int var27 = (class55.field1269 - var18 - var22) * class128.field2955 / 3;
                                                        if (var27 > class128.field2955 * 10) {
                                                            var27 = class128.field2955 * 10;
                                                        }
                                                        if (var26.field481 < var27) {
                                                            var27 = var26.field481;
                                                        }
                                                        var26.field481 -= var27;
                                                        class127.field2885 += var27;
                                                    }
                                                    if (var18 + var22 + 32 > class55.field1266 && var26.field476 - var26.field449 > var26.field481) {
                                                        int var28 = (var18 + var22 + 32 - class55.field1266) * class128.field2955 / 3;
                                                        if (var28 > class128.field2955 * 10) {
                                                            var28 = class128.field2955 * 10;
                                                        }
                                                        if (var28 > var26.field476 - var26.field449 - var26.field481) {
                                                            var28 = var26.field476 - var26.field449 - var26.field481;
                                                        }
                                                        class127.field2885 -= var28;
                                                        var26.field481 += var28;
                                                    }
                                                }
                                            } else if (class126.field2884 != 0 && class66.field1598 == var15 && (arg5 << 16) + var11 == class77.field1788) {
                                                var25.method79(var19, var18, 128);
                                            } else {
                                                var25.method71(var19, var18);
                                            }
                                            if (var25.field161 == 33 || var12.field487[var15] != 1) {
                                                int var29 = var12.field487[var15];
                                                class11.field194.method897(class64.method459(var29, arg6 ^ 0xB), var19 + var21 + 1, var22 + 10 + var18, 0);
                                                class11.field194.method897(class64.method459(var29, 81), var19 + var21, var18 + 9 + var22, 16776960);
                                            }
                                        }
                                    }
                                } else if (var12.field486 != null && var15 < 20) {
                                    class10 var20 = var12.method175((byte) 33, var15);
                                    if (var20 != null) {
                                        var20.method71(var19, var18);
                                    } else if (class15.field278) {
                                        var9 = false;
                                    }
                                }
                                var15++;
                            }
                        }
                    } else if (var12.field479 == 3) {
                        int var30;
                        if (class48.method342(var12, 47)) {
                            var30 = var12.field505;
                            if (class60.method438(var11, (byte) -45, arg3) && var12.field503 != 0) {
                                var30 = var12.field503;
                            }
                        } else {
                            var30 = var12.field524;
                            if (class60.method438(var11, (byte) -45, arg3) && var12.field474 != 0) {
                                var30 = var12.field474;
                            }
                        }
                        if (var12.field458 == 0) {
                            if (var12.field515) {
                                class55.method401(var13, var14, var12.field459, var12.field449, var30);
                            } else {
                                class55.method393(var13, var14, var12.field459, var12.field449, var30);
                            }
                        } else if (var12.field515) {
                            class55.method404(var13, var14, var12.field459, var12.field449, var30, 256 - (var12.field458 & 0xFF));
                        } else {
                            class55.method394(var13, var14, var12.field459, var12.field449, var30, 256 - (var12.field458 & 0xFF));
                        }
                    } else if (var12.field479 == 4) {
                        class117 var31 = class129.field2964[var12.field498];
                        class121 var32 = var12.field468;
                        int var33;
                        if (class48.method342(var12, arg6 ^ 0x2E)) {
                            var33 = var12.field505;
                            if (class60.method438(var11, (byte) -45, arg3) && var12.field503 != 0) {
                                var33 = var12.field503;
                            }
                            if (var12.field488.method942(36) > 0) {
                                var32 = var12.field488;
                            }
                        } else {
                            var33 = var12.field524;
                            if (class60.method438(var11, (byte) -45, arg3) && var12.field474 != 0) {
                                var33 = var12.field474;
                            }
                        }
                        if (var12.field483 == 6 && class126.field2883) {
                            var33 = var12.field524;
                            var32 = class126.field2876;
                        }
                        if (class55.field1272 == 479) {
                            if (var33 == 16776960) {
                                var33 = 255;
                            }
                            if (var33 == 49152) {
                                var33 = 16777215;
                            }
                        }
                        class121 var34 = class119.method916(var12, -1, var32);
                        var31.method895(var34, var13, var14, var12.field459, var12.field449, var33, var12.field491, var12.field460, var12.field519, var12.field455);
                    } else if (var12.field479 == 5) {
                        class10 var35 = var12.method169(class48.method342(var12, 109), arg6 - 169);
                        if (var35 != null) {
                            var35.method71(var13, var14);
                        } else if (class15.field278) {
                            var9 = false;
                        }
                    } else if (var12.field479 == 6) {
                        class83.method573(var12.field459 / 2 + var13, var12.field449 / 2 + var14);
                        int var36 = class83.field1924[var12.field485] * var12.field477 >> 16;
                        int var37 = class83.field1930[var12.field485] * var12.field477 >> 16;
                        boolean var38 = class48.method342(var12, -120);
                        int var39;
                        if (var38) {
                            var39 = var12.field467;
                        } else {
                            var39 = var12.field480;
                        }
                        class102 var40;
                        if (var12.field452 == 5) {
                            var40 = class97.field2162.method561(false, -1, null, null, -1);
                        } else if (var39 == -1) {
                            var40 = var12.method171(var38, class62.field1494.field1769, arg6 ^ 0xFFFFFF9C, -1, null);
                            if (var40 == null && class15.field278) {
                                var9 = false;
                            }
                        } else {
                            class41 var41 = class5.method33(arg6 ^ 0x6A, var39);
                            var40 = var12.method171(var38, class62.field1494.field1769, -1, var12.field470, var41);
                            if (var40 == null && class15.field278) {
                                var9 = false;
                            }
                        }
                        if (var40 != null) {
                            var40.method707(0, var12.field461, 0, var12.field485, 0, var36, var37);
                        }
                        class83.method585();
                    } else {
                        if (var12.field479 == 7) {
                            class117 var42 = class129.field2964[var12.field498];
                            int var43 = 0;
                            for (int var44 = 0; var44 < var12.field449; var44++) {
                                for (int var45 = 0; var45 < var12.field459; var45++) {
                                    if (var12.field478[var43] > 0) {
                                        class119 var46 = class114.method872((byte) 121, var12.field478[var43] - 1);
                                        class121 var47 = var46.field2708;
                                        if (var47 == null) {
                                            var47 = class86.field1996;
                                        }
                                        if (var46.field2701 || var12.field487[var43] != 1) {
                                            var47 = class113.method866((byte) -48, new class121[] { var47, class92.field2089, class52.method369((byte) -76, var12.field487[var43]) });
                                        }
                                        int var48 = var13 + (var12.field489 + 115) * var45;
                                        int var49 = (var12.field471 + 12) * var44 + var14;
                                        if (var12.field460 == 0) {
                                            var42.method892(var47, var12.field459 / 2 + var48, var49, var12.field524, var12.field491);
                                        } else {
                                            var42.method903(var47, var48, var49, var12.field524, var12.field491);
                                        }
                                    }
                                    var43++;
                                }
                            }
                        }
                        if (var12.field479 == 8 && class5.method34(var11, (byte) -66, arg3) && class81.field1870 == class61.field1480) {
                            int var50 = 0;
                            int var51 = 0;
                            class117 var52 = class119.field2757;
                            class121 var53 = var12.field468;
                            class121 var54 = class119.method916(var12, arg6 - 100, var53);
                            while (var54.method942(36) > 0) {
                                int var62 = var54.method950(-2, class15.field300);
                                class121 var63;
                                if (var62 == -1) {
                                    var63 = var54;
                                    var54 = class18.field415;
                                } else {
                                    var63 = var54.method957(var62, true, 0);
                                    var54 = var54.method965(63, var62 + 2);
                                }
                                int var64 = var52.method890(var63);
                                var51 += var52.field2650 + 1;
                                if (var50 < var64) {
                                    var50 = var64;
                                }
                            }
                            var51 += 7;
                            var50 += 6;
                            int var55 = var14 + var12.field449 + 5;
                            int var56 = var12.field459 + var13 - var50 - 5;
                            if (var13 + 5 > var56) {
                                var56 = var13 + 5;
                            }
                            if (var55 + var51 > arg7) {
                                var55 = arg7 - var51;
                            }
                            if (arg1 < var50 + var56) {
                                var56 = arg1 - var50;
                            }
                            class55.method401(var56, var55, var50, var51, 16777120);
                            class55.method393(var56, var55, var50, var51, 0);
                            class121 var57 = var12.field468;
                            int var58 = var52.field2650 + var55 + 2;
                            class121 var59 = class119.method916(var12, -1, var57);
                            while (var59.method942(36) > 0) {
                                int var60 = var59.method950(-2, class15.field300);
                                class121 var61;
                                if (var60 == -1) {
                                    var61 = var59;
                                    var59 = class18.field415;
                                } else {
                                    var61 = var59.method957(var60, true, 0);
                                    var59 = var59.method965(63, var60 + 2);
                                }
                                var52.method903(var61, var56 + 3, var58, 0, false);
                                var58 += var52.field2650 + 1;
                            }
                        }
                    }
                }
            }
        }
        return var9;
    }

    @OriginalMember(owner = "client!hd", name = "a", descriptor = "(ZZLs;I)Z", line = 692)
    public static final boolean method311(boolean arg0, boolean arg1, class105 arg2, int arg3) {
        field1068++;
        if (!class59.method426(arg0, arg2, -95)) {
            return false;
        } else if (arg1) {
            if (arg3 > 0) {
                class118.field2678 = new class48(arg3);
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!hd", name = "b", descriptor = "(Z)V", line = 717)
    public static final void method312(boolean arg0) {
        int var1 = (class62.field1494.field750 >> 7) + class129.field2977;
        field1078++;
        int var2 = (class62.field1494.field742 >> 7) + class9.field132;
        class20.field528 = 0;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class20.field528 = 1;
        }
        if (arg0) {
            method309(-39, (byte) -53);
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class20.field528 = 1;
        }
        if (class20.field528 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class20.field528 = 0;
        }
    }

    @OriginalMember(owner = "client!hd", name = "e", descriptor = "(B)V", line = 741)
    public static void method313(byte arg0) {
        field1081 = null;
        field1079 = null;
        field1082 = null;
        field1074 = null;
        int var1 = -25 / ((45 - arg0) / 61);
        field1072 = null;
        field1080 = null;
    }

    @OriginalMember(owner = "client!hd", name = "<init>", descriptor = "(Lhe;Lhe;IZ)V", line = 778)
    public class46(class47 arg0, class47 arg1, int arg2, boolean arg3) {
        class9 var5 = new class9();
        int var6 = arg0.method328(arg2, false);
        this.field1083 = new class73[var6];
        int[] var7 = arg0.method333(arg2, 93);
        for (int var8 = 0; var8 < var7.length; var8++) {
            byte[] var9 = arg0.method315(arg2, true, var7[var8]);
            int var10 = (var9[0] & 0xFF) << 8 | var9[1] & 0xFF;
            class40 var11 = (class40) var5.method57((byte) 86);
            class40 var12 = null;
            while (var11 != null) {
                if (var11.field898 == var10) {
                    var12 = var11;
                    break;
                }
                var11 = (class40) var5.method66(-29860);
            }
            if (var12 == null) {
                byte[] var13;
                if (arg3) {
                    var13 = arg1.method320(var10, 18054, 0);
                } else {
                    var13 = arg1.method320(0, 18054, var10);
                }
                var12 = new class40(var10, var13);
                var5.method64(var12, (byte) 79);
            }
            this.field1083[var7[var8]] = new class73(var9, var12);
        }
    }
}
