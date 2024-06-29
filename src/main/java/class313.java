import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rc")
public class class313 {

    @OriginalMember(owner = "client!rc", name = "c", descriptor = "[I")
    public static int[] field5281 = new int[100];

    @OriginalMember(owner = "client!rc", name = "e", descriptor = "[Lig;")
    public static class168[] field5283 = new class168[4];

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "Lmh;")
    public static class128 field5279 = class22.method156(126, "Loaded titlescreen)3");

    @OriginalMember(owner = "client!rc", name = "f", descriptor = "[Lmh;")
    public static class128[] field5284 = new class128[200];

    @OriginalMember(owner = "client!rc", name = "g", descriptor = "[[I")
    public static int[][] field5285 = new int[][] { { 0, 128, 0, 0, 128, 0, 128, 128 }, { 0, 128, 0, 0, 128, 0 }, { 0, 0, 64, 128, 0, 128 }, { 128, 128, 64, 128, 128, 0 }, { 0, 0, 128, 0, 128, 128, 64, 128 }, { 0, 128, 0, 0, 128, 0, 64, 128 }, { 64, 128, 0, 128, 0, 0, 64, 0 }, { 0, 0, 64, 0, 0, 64 }, { 128, 0, 128, 128, 0, 128, 0, 64, 64, 0 }, { 0, 128, 0, 0, 32, 64, 64, 96, 128, 128 }, { 0, 0, 128, 0, 128, 128, 64, 96, 32, 64 }, { 0, 0, 128, 0, 96, 32, 32, 32 } };

    @OriginalMember(owner = "client!rc", name = "i", descriptor = "Lmh;")
    public static class128 field5287 = class22.method156(127, "Fertigkeit: ");

    @OriginalMember(owner = "client!rc", name = "d", descriptor = "I")
    public static int field5282;

    @OriginalMember(owner = "client!rc", name = "h", descriptor = "I")
    public static int field5286;

    @OriginalMember(owner = "client!rc", name = "j", descriptor = "I")
    public static int field5288;

    @OriginalMember(owner = "client!rc", name = "l", descriptor = "I")
    public static int field5290;

    @OriginalMember(owner = "client!rc", name = "m", descriptor = "I")
    public static int field5291;

    @OriginalMember(owner = "client!rc", name = "n", descriptor = "I")
    public static int field5292;

    @OriginalMember(owner = "client!rc", name = "k", descriptor = "Lpj;")
    public static class173 field5289;

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "Lbj;")
    public static class51 field5280;

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(I)V", line = 22)
    public static final void method2133(int arg0) {
        class82.field1468 = -1;
        class132.field2290 = 0;
        class77.field1413 = -3;
        class254.field4382 = 1;
        int var1 = -108 % ((arg0 - 56) / 43);
        field5291++;
        class74.field1400 = false;
        class268.field4641 = 0;
        class261.field4532 = 0;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(IZ[Lem;)V", line = 48)
    public static final void method2134(int arg0, boolean arg1, class10[] arg2) {
        for (int var3 = 0; var3 < arg2.length; var3++) {
            class10 var4 = arg2[var3];
            if (var4 != null) {
                if (var4.field288 == 0) {
                    if (var4.field348 != null) {
                        method2134(arg0, true, var4.field348);
                    }
                    class88 var5 = (class88) class182.field3198.method728(false, (long) var4.field230);
                    if (var5 != null) {
                        class309.method2105(var5.field1510, (byte) 117, arg0);
                    }
                }
                if (arg0 == 0 && var4.field326 != null) {
                    class102 var6 = new class102();
                    var6.field1743 = var4.field326;
                    var6.field1738 = var4;
                    class249.method1739(var6, -71);
                }
                if (arg0 == 1 && var4.field319 != null) {
                    if (var4.field259 >= 0) {
                        class10 var7 = class233.method1606(true, var4.field230);
                        if (var7 == null || var7.field348 == null || var7.field348.length <= var4.field259 || var7.field348[var4.field259] != var4) {
                            continue;
                        }
                    }
                    class102 var8 = new class102();
                    var8.field1738 = var4;
                    var8.field1743 = var4.field319;
                    class249.method1739(var8, -71);
                }
            }
        }
        if (!arg1) {
            field5284 = (class128[]) null;
        }
        field5282++;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(B)V", line = 122)
    public static void method2135(byte arg0) {
        field5285 = (int[][]) null;
        field5279 = null;
        field5281 = null;
        field5284 = null;
        field5287 = null;
        field5283 = null;
        int var1 = 77 / ((-arg0 - 43) / 43);
        field5280 = null;
        field5289 = null;
    }

    @OriginalMember(owner = "client!rc", name = "a", descriptor = "(BIIIIII)V", line = 146)
    public static final void method2136(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5290++;
        if (class28.field591 == 0) {
            class295.field5041++;
            int var7 = class170.field2965;
            int var8 = class98.field1704;
            int var9 = class8.field189;
            int var10 = class262.field4550;
            int var11 = (arg5 - arg2) * (var8 - var7) / arg6 + var7;
            int var12 = (var9 - var10) * (arg4 - arg1) / arg3 + var10;
            if (class31.field685 && (class284.field4879 & 0x40) == 64) {
                class10 var13 = class271.method1908(class88.field1514, class65.field1257, false);
                if (var13 == null) {
                    class250.method1747(29354);
                } else {
                    class89.method559(var11, class140.field2398, (short) 23, var12, class16.field441, 1, 0L);
                }
            } else {
                class89.method559(var11, class220.field3879, (short) 51, var12, class273.field4733, 1, 0L);
            }
        }
        long var14 = -1L;
        int var16 = 0;
        int var17 = -96 / ((arg0 + 20) / 39);
        while (var16 < class281.field4853) {
            long var18 = class235.field4044[var16];
            int var20 = (int) var18 & 0x7F;
            int var21 = Integer.MAX_VALUE & (int) (var18 >>> 32);
            int var22 = ((int) var18 & 0x77804435) >> 29;
            int var23 = ((int) var18 & 0x3FD7) >> 7;
            if (var14 != var18) {
                label294: {
                    var14 = var18;
                    if (var22 == 2 && class133.method882(class133.field2315, var20, var23, var18)) {
                        class38 var24 = class239.method1629((byte) -12, var21);
                        if (var24.field817 != null) {
                            var24 = var24.method258(-110);
                        }
                        if (var24 == null) {
                            break label294;
                        }
                        if (class28.field591 == 1) {
                            class89.method559(var20, class245.field4187, (short) 43, var23, class28.method177((byte) -93, new class128[] { class194.field3381, class204.field3609, var24.field768 }), 1, var18);
                            class42.field853++;
                        } else if (!class31.field685) {
                            class137.field2355++;
                            class128[] var25 = var24.field798;
                            if (class161.field2738) {
                                var25 = class253.method1795(var25, 5);
                            }
                            if (var25 != null) {
                                for (int var26 = 4; var26 >= 0; var26--) {
                                    if (var25[var26] != null) {
                                        class176.field3100++;
                                        short var27 = 0;
                                        if (var26 == 0) {
                                            var27 = 42;
                                        }
                                        if (var26 == 1) {
                                            var27 = 19;
                                        }
                                        if (var26 == 2) {
                                            var27 = 7;
                                        }
                                        if (var26 == 3) {
                                            var27 = 13;
                                        }
                                        if (var26 == 4) {
                                            var27 = 1004;
                                        }
                                        class89.method559(var20, var25[var26], var27, var23, class28.method177((byte) -92, new class128[] { class165.field2838, var24.field768 }), 1, var18);
                                    }
                                }
                            }
                            class89.method559(var20, class74.field1395, (short) 1001, var23, class28.method177((byte) -82, new class128[] { class165.field2838, var24.field768 }), 1, (long) var24.field819);
                        } else if ((class284.field4879 & 0x4) == 4) {
                            class133.field2304++;
                            class89.method559(var20, class140.field2398, (short) 26, var23, class28.method177((byte) -73, new class128[] { class120.field2024, class204.field3609, var24.field768 }), 1, var18);
                        }
                    }
                    if (var22 == 1) {
                        class115 var28 = class201.field3560[var21];
                        if (var28.field1934.field3706 == 1 && (var28.field478 & 0x7F) == 64 && (var28.field418 & 0x7F) == 64) {
                            for (int var29 = 0; var29 < class37.field749; var29++) {
                                class115 var30 = class201.field3560[class39.field839[var29]];
                                if (var30 != null && var28 != var30 && var30.field1934.field3706 == 1 && var28.field478 == var30.field478 && var28.field418 == var30.field418) {
                                    class22.method158(var30.field1934, var20, class39.field839[var29], var23, 119);
                                }
                            }
                            for (int var31 = 0; var31 < class75.field1404; var31++) {
                                class123 var32 = class140.field2405[class203.field3593[var31]];
                                if (var32 != null && var28.field478 == var32.field478 && var28.field418 == var32.field418) {
                                    class114.method692(-1, class203.field3593[var31], var32, var20, var23);
                                }
                            }
                        }
                        class22.method158(var28.field1934, var20, var21, var23, 117);
                    }
                    if (var22 == 0) {
                        class123 var33 = class140.field2405[var21];
                        if ((var33.field478 & 0x7F) == 64 && (var33.field418 & 0x7F) == 64) {
                            for (int var34 = 0; var34 < class37.field749; var34++) {
                                class115 var35 = class201.field3560[class39.field839[var34]];
                                if (var35 != null && var35.field1934.field3706 == 1 && var33.field478 == var35.field478 && var33.field418 == var35.field418) {
                                    class22.method158(var35.field1934, var20, class39.field839[var34], var23, 91);
                                }
                            }
                            for (int var36 = 0; var36 < class75.field1404; var36++) {
                                class123 var37 = class140.field2405[class203.field3593[var36]];
                                if (var37 != null && var33 != var37 && var33.field478 == var37.field478 && var33.field418 == var37.field418) {
                                    class114.method692(-1, class203.field3593[var36], var37, var20, var23);
                                }
                            }
                        }
                        class114.method692(-1, var21, var33, var20, var23);
                    }
                    if (var22 == 3) {
                        class296 var38 = class221.field3888[class133.field2315][var20][var23];
                        if (var38 != null) {
                            for (class89 var39 = (class89) var38.method2031(1211754408); var39 != null; var39 = (class89) var38.method2023((byte) -112)) {
                                int var40 = var39.field1520.field3586;
                                class200 var41 = class180.method1226(false, var40);
                                if (class28.field591 == 1) {
                                    class218.field3838++;
                                    class89.method559(var20, class245.field4187, (short) 18, var23, class28.method177((byte) -75, new class128[] { class194.field3381, class92.field1571, var41.field3506 }), 1, (long) var40);
                                } else if (!class31.field685) {
                                    class45.field906++;
                                    class128[] var42 = var41.field3517;
                                    if (class161.field2738) {
                                        var42 = class253.method1795(var42, 5);
                                    }
                                    for (int var43 = 4; var43 >= 0; var43--) {
                                        if (var42 != null && var42[var43] != null) {
                                            class39.field827++;
                                            byte var44 = 0;
                                            if (var43 == 0) {
                                                var44 = 41;
                                            }
                                            if (var43 == 1) {
                                                var44 = 29;
                                            }
                                            if (var43 == 2) {
                                                var44 = 20;
                                            }
                                            if (var43 == 3) {
                                                var44 = 58;
                                            }
                                            if (var43 == 4) {
                                                var44 = 37;
                                            }
                                            class89.method559(var20, var42[var43], var44, var23, class28.method177((byte) -70, new class128[] { class102.field1751, var41.field3506 }), 1, (long) var40);
                                        } else if (var43 == 2) {
                                            class217.field3830++;
                                            class89.method559(var20, class151.field2600, (short) 20, var23, class28.method177((byte) -111, new class128[] { class102.field1751, var41.field3506 }), 1, (long) var40);
                                        }
                                    }
                                    class89.method559(var20, class74.field1395, (short) 1002, var23, class28.method177((byte) -90, new class128[] { class102.field1751, var41.field3506 }), 1, (long) var40);
                                } else if ((class284.field4879 & 0x1) == 1) {
                                    class99.field1715++;
                                    class89.method559(var20, class140.field2398, (short) 14, var23, class28.method177((byte) -74, new class128[] { class120.field2024, class92.field1571, var41.field3506 }), 1, (long) var40);
                                }
                            }
                        }
                    }
                }
            }
            var16++;
        }
    }

    @OriginalMember(owner = "client!rc", name = "b", descriptor = "(I)V", line = 469)
    public static final void method2137(int arg0) {
        if (arg0 > -107) {
            method2137(55);
        }
        field5286++;
        class175.field3091.method1834(17);
    }
}
