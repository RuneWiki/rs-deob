import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!od")
public abstract class class101 extends class99 {

    @OriginalMember(owner = "client!od", name = "T", descriptor = "I")
    public int field2386 = 1000;

    @OriginalMember(owner = "client!od", name = "R", descriptor = "I")
    public static int field2384 = 0;

    @OriginalMember(owner = "client!od", name = "V", descriptor = "Laf;")
    public static class7 field2388 = class48.method406(40, "null");

    @OriginalMember(owner = "client!od", name = "X", descriptor = "Laf;")
    public static class7 field2390 = class48.method406(40, "(U3");

    @OriginalMember(owner = "client!od", name = "bb", descriptor = "Laf;")
    private static class7 field2394 = class48.method406(40, "Loading textures )2 ");

    @OriginalMember(owner = "client!od", name = "gb", descriptor = "Laf;")
    private static class7 field2399 = class48.method406(40, "Please wait )2 attempting to reestablish");

    @OriginalMember(owner = "client!od", name = "Z", descriptor = "Laf;")
    public static class7 field2392 = field2394;

    @OriginalMember(owner = "client!od", name = "db", descriptor = "[I")
    public static int[] field2396 = new int[25];

    @OriginalMember(owner = "client!od", name = "cb", descriptor = "I")
    public static int field2395 = -2;

    @OriginalMember(owner = "client!od", name = "hb", descriptor = "Laf;")
    public static class7 field2400 = field2399;

    @OriginalMember(owner = "client!od", name = "jb", descriptor = "Laf;")
    public static class7 field2402 = class48.method406(40, "Benutzen Sie die (WPasswort -=ndern(W Option");

    @OriginalMember(owner = "client!od", name = "mb", descriptor = "Laf;")
    private static class7 field2405 = class48.method406(40, "Prepared visibility map");

    @OriginalMember(owner = "client!od", name = "fb", descriptor = "Laf;")
    public static class7 field2398 = field2405;

    @OriginalMember(owner = "client!od", name = "nb", descriptor = "Laf;")
    public static class7 field2406 = class48.method406(40, "jolt");

    @OriginalMember(owner = "client!od", name = "S", descriptor = "I")
    public static int field2385;

    @OriginalMember(owner = "client!od", name = "U", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!od", name = "Y", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!od", name = "ab", descriptor = "I")
    public static int field2393;

    @OriginalMember(owner = "client!od", name = "eb", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!od", name = "ib", descriptor = "I")
    public static int field2401;

    @OriginalMember(owner = "client!od", name = "kb", descriptor = "I")
    public static int field2403;

    @OriginalMember(owner = "client!od", name = "lb", descriptor = "I")
    public static int field2404;

    @OriginalMember(owner = "client!od", name = "W", descriptor = "[Z")
    public static boolean[] field2389;

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIIIIIII)V")
    public void method266(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field2393++;
        class31 var10 = this.method190(1);
        if (var10 != null) {
            this.field2386 = var10.field2386;
            var10.method266(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!od", name = "c", descriptor = "(I)V")
    public static final void method829(int arg0) {
        if (arg0 != -2991) {
            field2402 = null;
        }
        boolean var1 = false;
        field2401++;
        while (!var1) {
            var1 = true;
            for (int var2 = 0; var2 < class19.field449 - 1; var2++) {
                if (class147.field3473[var2] < 1000 && class147.field3473[var2 + 1] > 1000) {
                    var1 = false;
                    class7 var3 = class84.field1977[var2];
                    class84.field1977[var2] = class84.field1977[var2 + 1];
                    class84.field1977[var2 + 1] = var3;
                    class7 var4 = class147.field3449[var2];
                    class147.field3449[var2] = class147.field3449[var2 + 1];
                    class147.field3449[var2 + 1] = var4;
                    int var5 = class147.field3473[var2];
                    class147.field3473[var2] = class147.field3473[var2 + 1];
                    class147.field3473[var2 + 1] = var5;
                    int var6 = class45.field1084[var2];
                    class45.field1084[var2] = class45.field1084[var2 + 1];
                    class45.field1084[var2 + 1] = var6;
                    int var7 = class115.field2731[var2];
                    class115.field2731[var2] = class115.field2731[var2 + 1];
                    class115.field2731[var2 + 1] = var7;
                    int var8 = class135.field3177[var2];
                    class135.field3177[var2] = class135.field3177[var2 + 1];
                    class135.field3177[var2 + 1] = var8;
                }
            }
        }
    }

    @OriginalMember(owner = "client!od", name = "e", descriptor = "(B)V")
    public static void method830(byte arg0) {
        field2396 = null;
        field2398 = null;
        field2406 = null;
        field2399 = null;
        field2394 = null;
        field2389 = null;
        field2400 = null;
        field2388 = null;
        field2392 = null;
        if (arg0 > -14) {
            field2395 = 57;
        }
        field2402 = null;
        field2390 = null;
        field2405 = null;
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IBII)V")
    public static final void method831(int arg0, byte arg1, int arg2, int arg3) {
        for (int var4 = 0; var4 < 8; var4++) {
            for (int var8 = 0; var8 < 8; var8++) {
                class108.field2636[arg3][arg2 + var4][arg0 + var8] = 0;
            }
        }
        field2397++;
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class108.field2636[arg3][arg2][arg0 + var5] = class108.field2636[arg3][arg2 - 1][arg0 + var5];
            }
        }
        if (arg0 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class108.field2636[arg3][arg2 + var6][arg0] = class108.field2636[arg3][arg2 + var6][arg0 - 1];
            }
        }
        int var7 = 79 % ((arg1 - 31) / 54);
        if (arg2 > 0 && class108.field2636[arg3][arg2 - 1][arg0] != 0) {
            class108.field2636[arg3][arg2][arg0] = class108.field2636[arg3][arg2 - 1][arg0];
        } else if (arg0 > 0 && class108.field2636[arg3][arg2][arg0 - 1] != 0) {
            class108.field2636[arg3][arg2][arg0] = class108.field2636[arg3][arg2][arg0 - 1];
        } else if (arg2 > 0 && arg0 > 0 && class108.field2636[arg3][arg2 - 1][arg0 - 1] != 0) {
            class108.field2636[arg3][arg2][arg0] = class108.field2636[arg3][arg2 - 1][arg0 - 1];
        }
    }

    @OriginalMember(owner = "client!od", name = "a", descriptor = "(IIIII)V")
    public static final void method832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -5 % ((-arg4 - 57) / 58);
        class91.field2108 = 0;
        for (int var6 = -1; var6 < class130.field3088 + class106.field2615; var6++) {
            class19 var22;
            if (var6 == -1) {
                var22 = class21.field531;
            } else if (class130.field3088 <= var6) {
                var22 = class121.field2843[class155.field3600[var6 - class130.field3088]];
            } else {
                var22 = class18.field425[class87.field2046[var6]];
            }
            if (var22 != null && var22.method186(-127)) {
                if (var22 instanceof class141) {
                    class95 var23 = ((class141) var22).field3323;
                    if (var23.field2213 != null) {
                        var23 = var23.method775(30856);
                    }
                    if (var23 == null) {
                        continue;
                    }
                }
                if (class130.field3088 <= var6) {
                    class95 var26 = ((class141) var22).field3323;
                    if (var26.field2213 != null) {
                        var26 = var26.method775(30856);
                    }
                    if (var26.field2242 >= 0 && var26.field2242 < class7.field171.length) {
                        class139.method1141(var22.field504 + 15, 0, var22);
                        if (class77.field1767 > -1) {
                            class7.field171[var26.field2242].method341(class77.field1767 + arg1 - 12, arg3 + -30 + class13.field340);
                        }
                    }
                    if (class23.field622 == 1 && class155.field3600[var6 - class130.field3088] == class72.field1589 && class155.field3611 % 20 < 10) {
                        class139.method1141(var22.field504 + 15, 0, var22);
                        if (class77.field1767 > -1) {
                            class111.field2687[0].method341(class77.field1767 + arg1 - 12, class13.field340 + arg3 + -28);
                        }
                    }
                } else {
                    int var24 = 30;
                    class92 var25 = (class92) var22;
                    if (var25.field2140 != -1 || var25.field2143 != -1) {
                        class139.method1141(var22.field504 + 15, 0, var22);
                        if (class77.field1767 > -1) {
                            if (var25.field2140 != -1) {
                                class113.field2717[var25.field2140].method341(arg1 + class77.field1767 - 12, -var24 + class13.field340 + arg3);
                                var24 += 25;
                            }
                            if (var25.field2143 != -1) {
                                class7.field171[var25.field2143].method341(arg1 + class77.field1767 - 12, -var24 + arg3 + class13.field340);
                                var24 += 25;
                            }
                        }
                    }
                    if (var6 >= 0 && class23.field622 == 10 && class87.field2046[var6] == class151.field3533) {
                        class139.method1141(var22.field504 + 15, 0, var22);
                        if (class77.field1767 > -1) {
                            class111.field2687[1].method341(arg1 + class77.field1767 - 12, -var24 + class13.field340 + arg3);
                        }
                    }
                }
                if (var22.field453 != null && (class130.field3088 <= var6 || class87.field2045 == 0 || class87.field2045 == 3 || class87.field2045 == 1 && class39.method338(false, ((class92) var22).field2121))) {
                    class139.method1141(var22.field504, 0, var22);
                    if (class77.field1767 > -1 && class42.field1015 > class91.field2108) {
                        class42.field1022[class91.field2108] = class25.field660.method31(var22.field453) / 2;
                        class42.field995[class91.field2108] = class25.field660.field76;
                        class42.field1011[class91.field2108] = class77.field1767;
                        class42.field1013[class91.field2108] = class13.field340;
                        class42.field1001[class91.field2108] = var22.field507;
                        class42.field1010[class91.field2108] = var22.field451;
                        class42.field1005[class91.field2108] = var22.field488;
                        class42.field1006[class91.field2108] = var22.field453;
                        class91.field2108++;
                    }
                }
                if (class155.field3611 < var22.field468) {
                    class139.method1141(var22.field504 + 15, 0, var22);
                    if (class77.field1767 > -1) {
                        int var27 = var22.field496 * 30 / var22.field467;
                        if (var27 > 30) {
                            var27 = 30;
                        }
                        class33.method304(class77.field1767 + arg1 - 15, class13.field340 + -3 + arg3, var27, 5, 65280);
                        class33.method304(arg1 + class77.field1767 + var27 - 15, class13.field340 - 3 + arg3, 30 - var27, 5, 16711680);
                    }
                }
                for (int var28 = 0; var28 < 4; var28++) {
                    if (var22.field495[var28] > class155.field3611) {
                        class139.method1141(var22.field504 / 2, 0, var22);
                        if (class77.field1767 > -1) {
                            if (var28 == 1) {
                                class13.field340 -= 20;
                            }
                            if (var28 == 2) {
                                class77.field1767 -= 15;
                                class13.field340 -= 10;
                            }
                            if (var28 == 3) {
                                class77.field1767 += 15;
                                class13.field340 -= 10;
                            }
                            class151.field3536[var22.field513[var28]].method341(class77.field1767 + arg1 - 12, class13.field340 + arg3 + -12);
                            class51.field1224.method47(class51.method421((byte) -102, var22.field508[var28]), arg1 + class77.field1767 - 1, arg3 - -class13.field340 + 3, 16777215, 0);
                        }
                    }
                }
            }
        }
        for (int var7 = 0; var7 < class91.field2108; var7++) {
            int var8 = class42.field1011[var7];
            int var9 = class42.field1013[var7];
            boolean var10 = true;
            int var11 = class42.field1022[var7];
            int var12 = class42.field995[var7];
            while (var10) {
                var10 = false;
                for (int var21 = 0; var21 < var7; var21++) {
                    if (var9 + 2 > class42.field1013[var21] + -class42.field995[var21] && var9 - var12 < class42.field1013[var21] + 2 && class42.field1011[var21] + class42.field1022[var21] > var8 - var11 && class42.field1011[var21] - class42.field1022[var21] < var8 + var11 && class42.field1013[var21] - class42.field995[var21] < var9) {
                        var10 = true;
                        var9 = class42.field1013[var21] - class42.field995[var21];
                    }
                }
            }
            class77.field1767 = class42.field1011[var7];
            class13.field340 = class42.field1013[var7] = var9;
            class7 var13 = class42.field1006[var7];
            if (class103.field2500 == 0) {
                int var14 = 16776960;
                if (class42.field1001[var7] < 6) {
                    var14 = class55.field1338[class42.field1001[var7]];
                }
                if (class42.field1001[var7] == 6) {
                    var14 = class144.field3411 % 20 < 10 ? 16711680 : 16776960;
                }
                if (class42.field1001[var7] == 7) {
                    var14 = class144.field3411 % 20 < 10 ? 255 : 65535;
                }
                if (class42.field1001[var7] == 8) {
                    var14 = class144.field3411 % 20 < 10 ? 45056 : 8454016;
                }
                if (class42.field1001[var7] == 9) {
                    int var15 = 150 - class42.field1005[var7];
                    if (var15 < 50) {
                        var14 = var15 * 1280 + 16711680;
                    } else if (var15 < 100) {
                        var14 = 16776960 - (var15 - 50) * 327680;
                    } else if (var15 < 150) {
                        var14 = (var15 - 100) * 5 + 65280;
                    }
                }
                if (class42.field1001[var7] == 10) {
                    int var16 = 150 - class42.field1005[var7];
                    if (var16 < 50) {
                        var14 = var16 * 5 + 16711680;
                    } else if (var16 < 100) {
                        var14 = 16711935 - (var16 - 50) * 327680;
                    } else if (var16 < 150) {
                        var14 = var16 * 327680 + 255 + 500 - var16 * 5 - 32768000;
                    }
                }
                if (class42.field1001[var7] == 11) {
                    int var17 = 150 - class42.field1005[var7];
                    if (var17 < 50) {
                        var14 = 16777215 - var17 * 327685;
                    } else if (var17 < 100) {
                        var14 = (var17 - 50) * 327685 + 65280;
                    } else if (var17 < 150) {
                        var14 = 16777215 + 32768000 - var17 * 327680;
                    }
                }
                if (class42.field1010[var7] == 0) {
                    class25.field660.method47(var13, arg1 + class77.field1767, class13.field340 + arg3, var14, 0);
                }
                if (class42.field1010[var7] == 1) {
                    class25.field660.method38(var13, class77.field1767 + arg1, class13.field340 + arg3, var14, 0, class144.field3411);
                }
                if (class42.field1010[var7] == 2) {
                    class25.field660.method36(var13, class77.field1767 + arg1, arg3 - -class13.field340, var14, 0, class144.field3411);
                }
                if (class42.field1010[var7] == 3) {
                    class25.field660.method41(var13, class77.field1767 + arg1, class13.field340 + arg3, var14, 0, class144.field3411, 150 - class42.field1005[var7]);
                }
                if (class42.field1010[var7] == 4) {
                    int var18 = (150 - class42.field1005[var7]) * (class25.field660.method31(var13) + 100) / 150;
                    class33.method305(arg1 + class77.field1767 - 50, arg3, arg1 + class77.field1767 + 50, arg0 + arg3);
                    class25.field660.method42(var13, class77.field1767 + arg1 + 50 - var18, class13.field340 + arg3, var14, 0);
                    class33.method301(arg1, arg3, arg1 + arg2, arg0 + arg3);
                }
                if (class42.field1010[var7] == 5) {
                    int var19 = 0;
                    int var20 = 150 - class42.field1005[var7];
                    if (var20 < 25) {
                        var19 = var20 - 25;
                    } else if (var20 > 125) {
                        var19 = var20 - 125;
                    }
                    class33.method305(arg1, arg3 + class13.field340 - class25.field660.field76 - 1, arg1 + arg2, class13.field340 + arg3 + 5);
                    class25.field660.method47(var13, class77.field1767 + arg1, arg3 + var19 - -class13.field340, var14, 0);
                    class33.method301(arg1, arg3, arg1 + arg2, arg3 - -arg0);
                }
            } else {
                class25.field660.method47(var13, arg1 + class77.field1767, class13.field340 + arg3, 16776960, 0);
            }
        }
        field2403++;
    }

    @OriginalMember(owner = "client!od", name = "d", descriptor = "(I)Leb;")
    public class31 method190(int arg0) {
        if (arg0 != 1) {
            field2402 = null;
        }
        field2387++;
        return null;
    }
}
