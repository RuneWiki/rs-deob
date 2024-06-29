import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class146 {

    @OriginalMember(owner = "client!am", name = "e", descriptor = "Z")
    public static boolean field2389 = false;

    @OriginalMember(owner = "client!am", name = "i", descriptor = "I")
    public static int field2393 = 0;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "I")
    public int field2385;

    @OriginalMember(owner = "client!am", name = "b", descriptor = "I")
    public static int field2386;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "I")
    public static int field2387;

    @OriginalMember(owner = "client!am", name = "d", descriptor = "I")
    public static int field2388;

    @OriginalMember(owner = "client!am", name = "f", descriptor = "I")
    public static int field2390;

    @OriginalMember(owner = "client!am", name = "g", descriptor = "I")
    public static int field2391;

    @OriginalMember(owner = "client!am", name = "h", descriptor = "I")
    public static int field2392;

    @OriginalMember(owner = "client!am", name = "j", descriptor = "I")
    private int field2394;

    @OriginalMember(owner = "client!am", name = "k", descriptor = "I")
    public int field2395;

    @OriginalMember(owner = "client!am", name = "l", descriptor = "I")
    public static int field2396;

    @OriginalMember(owner = "client!am", name = "m", descriptor = "I")
    public static int field2397;

    @OriginalMember(owner = "client!am", name = "n", descriptor = "I")
    public static int field2398;

    @OriginalMember(owner = "client!am", name = "o", descriptor = "I")
    public static int field2399;

    @OriginalMember(owner = "client!am", name = "p", descriptor = "I")
    public static int field2400;

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(B)V", line = 4)
    public static final void method944(byte arg0) {
        class99.field1736.method1884(arg0 - 22100);
        field2396++;
        if (arg0 != 46) {
            method950(114);
        }
        class180.field2889.method1884(arg0 ^ 0xFFFFA9F4);
        class179.field2881.method1884(-22054);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIBLag;)V", line = 19)
    private final void method945(int arg0, int arg1, byte arg2, class202 arg3) {
        if (arg2 > -100) {
            field2393 = 40;
        }
        if (arg0 == 1) {
            this.field2394 = arg3.method1315(14289);
        } else if (arg0 == 2) {
            this.field2385 = arg3.method1317((byte) -82);
            this.field2395 = arg3.method1317((byte) -122);
        }
        field2387++;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Ljava/lang/String;Lbm;Z)Ltc;", line = 42)
    public static final class234 method946(String arg0, class307 arg1, boolean arg2) {
        field2386++;
        int var3 = arg1.method2052(arg0, arg2);
        if (var3 == -1) {
            return new class234(0);
        }
        int[] var4 = arg1.method2055(var3, 0);
        class234 var5 = new class234(var4.length);
        for (int var6 = 0; var6 < var5.field3672; var6++) {
            class202 var7 = new class202(arg1.method2036(var3, var4[var6], (byte) 42));
            var5.field3673[var6] = var7.method1307((byte) 102);
            var5.field3667[var6] = var7.method1333(-125);
            var5.field3665[var6] = var7.method1346(-120);
            var5.field3676[var6] = var7.method1346(-117);
        }
        return var5;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(III)Lii;", line = 73)
    public static final class289 method947(int arg0, int arg1, int arg2) {
        class47 var3 = class326.field4975[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class289 var4 = var3.field967;
            var3.field967 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lag;IZ)V", line = 89)
    public final void method948(class202 arg0, int arg1, boolean arg2) {
        while (true) {
            int var4 = arg0.method1317((byte) -109);
            if (var4 == 0) {
                if (arg2) {
                    field2393 = 126;
                }
                field2392++;
                return;
            }
            this.method945(var4, arg1, (byte) -111, arg0);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(Lkl;IIII)V", line = 107)
    public static final void method949(class68 arg0, int arg1, int arg2, int arg3, int arg4) {
        field2388++;
        class268.method1782(true);
        if (class249.field3893) {
            class115.method757(arg1, arg4, arg1 + arg0.field1416, arg0.field1414 + arg4);
        } else {
            class270.method1806(arg1, arg4, arg0.field1416 + arg1, arg4 - -arg0.field1414);
        }
        if (arg2 != 32) {
            field2393 = 39;
        }
        if (class313.field4757 != 2 && class313.field4757 != 5 && class204.field3313 != null) {
            int var5 = (int) class95.field1709 + class41.field798 & 0x7FF;
            int var6 = class66.field1265.field1869 / 32 + 48;
            int var7 = 464 - (class66.field1265.field1872 / 32);
            if (class249.field3893) {
                ((class137) class204.field3313).method897(arg1, arg4, arg0.field1416, arg0.field1414, var6, var7, var5, class4.field101 + 256, (class137) arg0.method528((byte) 99, false));
            } else {
                ((class206) class204.field3313).method1389(arg1, arg4, arg0.field1416, arg0.field1414, var6, var7, var5, class4.field101 + 256, arg0.field1403, arg0.field1317);
            }
            if (class218.field3459 != null) {
                for (int var8 = 0; var8 < class218.field3459.field3672; var8++) {
                    if (class218.field3459.method1560(var8, 4)) {
                        int var9 = (((class218.field3459.field3665[var8] & 0xFFFEF9E) >> 14) - class246.field3818) * 4 + 2 - (class66.field1265.field1869 / 32);
                        int var10 = class284.field4398[var5];
                        int var11 = ((class218.field3459.field3665[var8] & 0x3FFF) - class101.field1769) * 4 + 2 - (class66.field1265.field1872 / 32);
                        int var12 = class284.field4395[var5];
                        int var13 = var10 * 256 / (class4.field101 + 256);
                        int var14 = var12 * 256 / (class4.field101 + 256);
                        int var15 = var11 * var14 + (var9 * var13) >> 16;
                        int var16 = var11 * var13 - (var9 * var14) >> 16;
                        class312 var17 = class71.field1494;
                        if (class218.field3459.method1556(-124, var8) == 1) {
                            var17 = class33.field674;
                        }
                        if (class218.field3459.method1556(arg2 ^ 0xFFFFFFA0, var8) == 2) {
                            var17 = class214.field3428;
                        }
                        int var18 = var17.method2129(class218.field3459.field3673[var8], 100);
                        int var19 = var15 - var18 / 2;
                        if (-arg0.field1416 <= var19 && var19 <= arg0.field1416 && var16 >= (-arg0.field1414) && arg0.field1414 >= var16) {
                            int var20 = 16777215;
                            if (class218.field3459.field3676[var8] != -1) {
                                var20 = class218.field3459.field3676[var8];
                            }
                            if (class249.field3893) {
                                class115.method747((class137) arg0.method528((byte) 92, false));
                            } else {
                                class270.method1808(arg0.field1403, arg0.field1317);
                            }
                            var17.method2109(class218.field3459.field3673[var8], var19 + (arg0.field1416 / 2) + arg1, arg0.field1414 / 2 + arg4 + -var16, var18, 50, var20, 0, 256, 1, 0, 0);
                            if (class249.field3893) {
                                class115.method760();
                            } else {
                                class270.method1809();
                            }
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class172.field2773; var21++) {
                int var22 = class337.field5215[var21] * 4 + 2 - (class66.field1265.field1869 / 32);
                int var23 = class331.field5081[var21] * 4 + 2 - class66.field1265.field1872 / 32;
                class31 var24 = class277.method1864(class159.field2604[var21], 0);
                if (var24.field597 != null) {
                    var24 = var24.method250((byte) -81);
                    if (var24 == null || var24.field578 == -1) {
                        continue;
                    }
                }
                class51.method382(arg1, arg0, class12.field240[var24.field578], false, arg4, var22, var23);
            }
            for (int var25 = 0; var25 < 104; var25++) {
                for (int var26 = 0; var26 < 104; var26++) {
                    class55 var27 = class62.field1186[class289.field4438][var25][var26];
                    if (var27 != null) {
                        int var28 = var25 * 4 + 2 - (class66.field1265.field1869 / 32);
                        int var29 = var26 * 4 + 2 - (class66.field1265.field1872 / 32);
                        class51.method382(arg1, arg0, class266.field4112[0], false, arg4, var28, var29);
                    }
                }
            }
            for (int var30 = 0; var30 < class285.field4417; var30++) {
                class255 var31 = class8.field179[class131.field2226[var30]];
                if (var31 != null && var31.method701(-7080)) {
                    class44 var32 = var31.field3991;
                    if (var32 != null && var32.field888 != null) {
                        var32 = var32.method338(arg2 + 17879);
                    }
                    if (var32 != null && var32.field851 && var32.field838) {
                        int var33 = var31.field1872 / 32 - (class66.field1265.field1872 / 32);
                        int var34 = var31.field1869 / 32 - (class66.field1265.field1869 / 32);
                        if (var32.field879 == -1) {
                            class51.method382(arg1, arg0, class266.field4112[1], false, arg4, var34, var33);
                        } else {
                            class51.method382(arg1, arg0, class12.field240[var32.field879], false, arg4, var34, var33);
                        }
                    }
                }
            }
            for (int var35 = 0; var35 < class305.field4623; var35++) {
                class278 var36 = class97.field1715[class283.field4384[var35]];
                if (var36 != null && var36.method701(-7080)) {
                    int var37 = var36.field1869 / 32 - (class66.field1265.field1869 / 32);
                    int var38 = var36.field1872 / 32 - (class66.field1265.field1872 / 32);
                    boolean var39 = false;
                    long var40 = class116.method767(-128, var36.field4269);
                    for (int var42 = 0; var42 < class274.field4197; var42++) {
                        if (class248.field3859[var42] == var40 && class306.field4633[var42] != 0) {
                            var39 = true;
                            break;
                        }
                    }
                    boolean var43 = false;
                    for (int var44 = 0; var44 < class220.field3483; var44++) {
                        if (class327.field5009[var44].field702 == var40) {
                            var43 = true;
                            break;
                        }
                    }
                    boolean var45 = false;
                    if (class66.field1265.field4276 != 0 && var36.field4276 != 0 && class66.field1265.field4276 == var36.field4276) {
                        var45 = true;
                    }
                    if (var39) {
                        class51.method382(arg1, arg0, class266.field4112[3], false, arg4, var37, var38);
                    } else if (var43) {
                        class51.method382(arg1, arg0, class266.field4112[5], false, arg4, var37, var38);
                    } else if (var45) {
                        class51.method382(arg1, arg0, class266.field4112[4], false, arg4, var37, var38);
                    } else {
                        class51.method382(arg1, arg0, class266.field4112[2], false, arg4, var37, var38);
                    }
                }
            }
            int var46 = 0;
            class339[] var47 = class342.field5313;
            while (var46 < var47.length) {
                class339 var48 = var47[var46];
                if (var48 != null && var48.field5260 != 0 && class25.field494 % 20 < 10) {
                    if (var48.field5260 == 1 && var48.field5258 >= 0 && var48.field5258 < class8.field179.length) {
                        class255 var49 = class8.field179[var48.field5258];
                        if (var49 != null) {
                            int var50 = var49.field1872 / 32 - (class66.field1265.field1872 / 32);
                            int var51 = var49.field1869 / 32 - (class66.field1265.field1869 / 32);
                            class84.method591(var50, arg2 - 26227, arg1, arg4, 360000, arg0, var51, var48.field5249);
                        }
                    }
                    if (var48.field5260 == 2) {
                        int var52 = (var48.field5254 - class246.field3818) * 4 + 2 - class66.field1265.field1869 / 32;
                        int var53 = (var48.field5250 - class101.field1769) * 4 + (2 - class66.field1265.field1872 / 32);
                        int var54 = var48.field5259 * 4;
                        int var55 = var54 * var54;
                        class84.method591(var53, -26195, arg1, arg4, var55, arg0, var52, var48.field5249);
                    }
                    if (var48.field5260 == 10 && var48.field5258 >= 0 && var48.field5258 < class97.field1715.length) {
                        class278 var56 = class97.field1715[var48.field5258];
                        if (var56 != null) {
                            int var57 = var56.field1869 / 32 - class66.field1265.field1869 / 32;
                            int var58 = var56.field1872 / 32 - (class66.field1265.field1872 / 32);
                            class84.method591(var58, arg2 - 26227, arg1, arg4, 360000, arg0, var57, var48.field5249);
                        }
                    }
                }
                var46++;
            }
            if (class224.field3532 != 0) {
                int var59 = (class224.field3532 * 4 + 2 - (-(class66.field1265.method710(arg2 + -33) * 2) + 2)) - (class66.field1265.field1869 / 32);
                int var60 = class6.field129 * 4 + 2 - (class66.field1265.field1872 / 32 - (class66.field1265.method710(-1) - 1) * 2);
                class51.method382(arg1, arg0, class256.field4001, false, arg4, var59, var60);
            }
            if (class249.field3893) {
                class115.method755(arg0.field1416 / 2 + arg1 - 1, arg0.field1414 / 2 + arg4 + -1, 3, 3, 16777215);
            } else {
                class270.method1811(arg0.field1416 / 2 + arg1 - 1, arg0.field1414 / 2 + arg4 + -1, 3, 3, 16777215);
            }
        } else if (class249.field3893) {
            class283 var61 = arg0.method528((byte) 73, false);
            if (var61 != null) {
                var61.method901(arg1, arg4);
            }
        } else {
            class270.method1817(arg1, arg4, 0, arg0.field1403, arg0.field1317);
        }
        class220.field3490[arg3] = true;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(I)V", line = 462)
    public static final void method950(int arg0) {
        class227.field3586.method1884(arg0 ^ 0xFFFFA9FA);
        class216.field3453.method1884(arg0 - 22086);
        field2390++;
        if (arg0 != 32) {
            field2398 = -61;
        }
        class114.field2026.method1884(-22054);
        class293.field4478.method1884(-22054);
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILbm;I)Loj;", line = 480)
    public static final class283 method951(int arg0, int arg1, class307 arg2, int arg3) {
        if (arg3 != 32) {
            method954((byte) -95);
        }
        field2400++;
        return class135.method885(arg1, arg2, -10948, arg0) ? class24.method200(arg3 - 32) : null;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(III)I", line = 501)
    public static final int method952(int arg0, int arg1, int arg2) {
        int var3 = -29 / ((arg1 + 60) / 63);
        field2399++;
        int var4 = arg0 - 1 & arg2 >> 31;
        return ((arg2 >>> 31) + arg2) % arg0 + var4;
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(B)Lfd;", line = 514)
    public final class206 method953(byte arg0) {
        class206 var2 = (class206) class341.field5286.method1881(true, (long) this.field2394);
        field2391++;
        if (var2 != null) {
            return var2;
        }
        if (arg0 != -111) {
            this.field2395 = -13;
        }
        class206 var3 = class90.method619(110, class103.field1786, this.field2394, 0);
        if (var3 != null) {
            class341.field5286.method1880(var3, (long) this.field2394, 90);
        }
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(B)V", line = 534)
    public static final void method954(byte arg0) {
        if (class41.field786 != -1) {
            class95.method635(false, -1, -1, class41.field786);
            class41.field786 = -1;
        }
        field2397++;
        if (arg0 != 17) {
            field2393 = 69;
        }
    }
}
