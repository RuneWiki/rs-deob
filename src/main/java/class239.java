import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public abstract class class239 {

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public int field4102;

    @OriginalMember(owner = "client!vh", name = "n", descriptor = "I")
    public int field4115;

    @OriginalMember(owner = "client!vh", name = "j", descriptor = "I")
    public int field4111;

    @OriginalMember(owner = "client!vh", name = "h", descriptor = "Lia;")
    private static class257 field4109 = class28.method234(127, " has logged out)3");

    @OriginalMember(owner = "client!vh", name = "i", descriptor = "Lme;")
    public static class44 field4110 = null;

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "Lia;")
    public static class257 field4105 = field4109;

    @OriginalMember(owner = "client!vh", name = "l", descriptor = "Lof;")
    public static class203 field4113 = null;

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "[I")
    public static int[] field4106 = new int[25];

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "Lie;")
    public static class117 field4104 = new class117(64);

    @OriginalMember(owner = "client!vh", name = "p", descriptor = "Lia;")
    public static class257 field4117 = class28.method234(-59, "(U3");

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!vh", name = "f", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!vh", name = "g", descriptor = "I")
    public static int field4108;

    @OriginalMember(owner = "client!vh", name = "k", descriptor = "I")
    public static int field4112;

    @OriginalMember(owner = "client!vh", name = "o", descriptor = "I")
    public static int field4116;

    @OriginalMember(owner = "client!vh", name = "m", descriptor = "Lme;")
    public static class44 field4114;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(III)V")
    public abstract void method241(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIZ)V")
    public static final void method1572(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            method1574(37, false);
        }
        field4103++;
        if (class38.field747 == 0 || arg1 == 0 || class238.field4063 >= 50 || arg2 == -1) {
            return;
        }
        class40.field832[class238.field4063] = arg2;
        class108.field2023[class238.field4063] = arg1;
        class99.field1822[class238.field4063] = arg0;
        class9.field181[class238.field4063] = null;
        class35.field709[class238.field4063] = 0;
        class238.field4063++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)Z")
    public static final boolean method1573(byte arg0) {
        field4107++;
        int var1 = 111 / ((arg0 - 40) / 36);
        return class244.field4242 == 0 ? class40.field835.method32(4096) : true;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IBI)V")
    public abstract void method242(int arg0, byte arg1, int arg2);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IZ)I")
    public static final int method1574(int arg0, boolean arg1) {
        field4116++;
        if (!(arg0 < 97 || arg0 > 122) || !(arg0 < 224 || arg0 > 254 || arg0 == 247)) {
            return arg0 - 32;
        } else if (arg0 == 255) {
            return 159;
        } else if (arg0 == 156) {
            return 140;
        } else {
            if (!arg1) {
                method1572(29, -5, -29, true);
            }
            return arg0;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII[Lme;II)V")
    public static final void method1575(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class44[] arg7, int arg8, int arg9) {
        field4112++;
        class23.method187(arg3, arg8, arg4, arg2);
        class101.method739();
        if (arg9 != 1338) {
            method1576((byte) 94);
        }
        for (int var10 = 0; var10 < arg7.length; var10++) {
            class44 var11 = arg7[var10];
            if (var11 != null && (var11.field885 == arg5 || arg5 == -1412584499 && class78.field1516 == var11)) {
                int var12;
                if (arg6 == -1) {
                    client.field1519[class44.field1030] = var11.field1025 + arg1;
                    class11.field215[class44.field1030] = var11.field928 + arg0;
                    class13.field242[class44.field1030] = var11.field926;
                    class197.field3327[class44.field1030] = var11.field981;
                    var12 = class44.field1030++;
                } else {
                    var12 = arg6;
                }
                var11.field975 = var12;
                var11.field953 = class7.field153;
                if (!var11.field990 || !client.method584(var11)) {
                    if (var11.field949 > 0) {
                        class89.method663(-66, var11);
                    }
                    int var13 = var11.field928 + arg0;
                    int var14 = var11.field940;
                    int var15 = var11.field1025 + arg1;
                    if (class87.field1695 && (client.method590(var11) != 0 || var11.field871 == 0) && var14 > 127) {
                        var14 = 127;
                    }
                    if (class78.field1516 == var11) {
                        if (arg5 != -1412584499 && !var11.field1006) {
                            class129.field2310 = arg1;
                            class8.field160 = arg7;
                            class32.field613 = arg0;
                            continue;
                        }
                        if (!var11.field1006) {
                            var14 = 128;
                        }
                        if (client.field1541 && class186.field3229) {
                            int var16 = class245.field4253;
                            int var17 = class102.field1904;
                            int var18 = var17 - class205.field3515;
                            int var19 = var16 - class161.field2823;
                            if (var19 < class231.field3883) {
                                var19 = class231.field3883;
                            }
                            if (class231.field3883 + field4110.field926 < var11.field926 + var19) {
                                var19 = field4110.field926 + class231.field3883 - var11.field926;
                            }
                            if (var18 < class92.field1747) {
                                var18 = class92.field1747;
                            }
                            var15 = var19;
                            if ((var18 + var11.field981) > (class92.field1747 + field4110.field981)) {
                                var18 = class92.field1747 + field4110.field981 - var11.field981;
                            }
                            var13 = var18;
                        }
                    }
                    int var20;
                    int var21;
                    int var24;
                    int var25;
                    if (var11.field871 == 2) {
                        var21 = arg8;
                        var24 = arg2;
                        var25 = arg4;
                        var20 = arg3;
                    } else {
                        var20 = var15 > arg3 ? var15 : arg3;
                        var21 = arg8 >= var13 ? arg8 : var13;
                        int var22 = var11.field926 + var15;
                        int var23 = var13 + var11.field981;
                        if (var11.field871 == 9) {
                            var23++;
                            var22++;
                        }
                        var24 = var23 < arg2 ? var23 : arg2;
                        var25 = arg4 <= var22 ? arg4 : var22;
                    }
                    if (!var11.field990 || var25 > var20 && var21 < var24) {
                        if (var11.field949 != 0) {
                            if (var11.field949 == 1337) {
                                class243.field4206 = var11;
                                class41.field840 = var13;
                                class197.field3332 = var15;
                                class246.method1619(-106, var13, var15, var11.field981, var11.field949 == 1403, var11.field926);
                                class23.method187(arg3, arg8, arg4, arg2);
                                continue;
                            }
                            if (var11.field949 == 1338) {
                                if (var11.method338((byte) 52)) {
                                    class143.method974(true, var12, var13, var15, var11);
                                    class23.method187(arg3, arg8, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field949 == 1339) {
                                if (var11.method338((byte) 125)) {
                                    class57.method436(var13, var15, arg9 + 26686, var12, var11);
                                    class23.method187(arg3, arg8, arg4, arg2);
                                }
                                continue;
                            }
                            if (var11.field949 == 1400) {
                                class251.method1639(var11.field981, var15, (byte) 99, var13, var11.field926);
                                class137.field2456[var12] = true;
                                class75.field1464[var12] = true;
                                class23.method187(arg3, arg8, arg4, arg2);
                                continue;
                            }
                            if (var11.field949 == 1401) {
                                class114.method816(var11.field981, var13, var15, var11.field926, arg9 - 1253);
                                class137.field2456[var12] = true;
                                class75.field1464[var12] = true;
                                class23.method187(arg3, arg8, arg4, arg2);
                                continue;
                            }
                            if (var11.field949 == 1402) {
                                class209.method1406(var13, var15, -80);
                                class137.field2456[var12] = true;
                                class75.field1464[var12] = true;
                                continue;
                            }
                            if (var11.field949 == 1404) {
                                class131.method906(class71.field1399, arg9 ^ 0x500, var11, class14.field310, var11.field926, var15, var11.field981, var13);
                                class137.field2456[var12] = true;
                                class75.field1464[var12] = true;
                                continue;
                            }
                            if (var11.field949 == 1405) {
                                if (class171.field2937) {
                                    int var26 = var11.field926 + var15;
                                    int var27 = var13 + 15;
                                    class3.field93.method773(class233.method1528(new class257[] { class128.field2296, class111.method808(arg9 - 1328, class70.field1387) }, arg9 - 1338), var26, var27, 16776960, -1);
                                    int var109 = var27 + 15;
                                    Runtime var28 = Runtime.getRuntime();
                                    int var29 = (int) ((var28.totalMemory() - var28.freeMemory()) / 1024L);
                                    int var30 = 16776960;
                                    if (var29 > 65536) {
                                        var30 = 16711680;
                                    }
                                    class3.field93.method773(class233.method1528(new class257[] { class103.field1933, class111.method808(10, var29), class58.field1230 }, arg9 ^ 0x53A), var26, var109, var30, -1);
                                    var27 = var109 + 15;
                                    class137.field2456[var12] = true;
                                    class75.field1464[var12] = true;
                                }
                                continue;
                            }
                        }
                        int var31 = class245.field4253;
                        if (var11.field871 == 0 && var11.field938 && class245.field4253 >= var20 && var21 <= class102.field1904 && class245.field4253 < var25 && class102.field1904 < var24 && !class216.field3663 && !class87.field1695) {
                            class199.field3407 = 1;
                            class32.field616[0] = 1001;
                            class19.field397[0] = class89.field1710;
                            class92.field1757[0] = class17.field378;
                        }
                        int var32 = class102.field1904;
                        if (!class216.field3663 && var31 >= var20 && var32 >= var21 && var31 < var25 && var24 > var32) {
                            class129.method901(var32 - var13, var11, (byte) -119, var31 - var15);
                        }
                        if (var11.field871 == 0) {
                            if (!var11.field990 && client.method584(var11) && class117.field2095 != var11) {
                                continue;
                            }
                            if (!var11.field990) {
                                if ((var11.field947 - var11.field981) < var11.field873) {
                                    var11.field873 = var11.field947 - var11.field981;
                                }
                                if (var11.field873 < 0) {
                                    var11.field873 = 0;
                                }
                            }
                            method1575(var13 - var11.field873, var15 - var11.field992, var24, var20, var25, var11.field935, var12, arg7, var21, 1338);
                            if (var11.field1015 != null) {
                                method1575(var13 - var11.field873, var15 - var11.field992, var24, var20, var25, var11.field935, var12, var11.field1015, var21, 1338);
                            }
                            class157 var33 = (class157) class136.field2426.method434((byte) -93, (long) var11.field935);
                            if (var33 != null) {
                                if (var33.field2744 == 0 && class245.field4253 >= var20 && class102.field1904 >= var21 && var25 > class245.field4253 && class102.field1904 < var24 && !class216.field3663 && !class87.field1695) {
                                    class199.field3407 = 1;
                                    class32.field616[0] = 1001;
                                    class19.field397[0] = class89.field1710;
                                    class92.field1757[0] = class17.field378;
                                }
                                class114.method818(var15, var33.field2746, var25, var12, var21, arg9 ^ 0xFFFFFAAF, var24, var13, var20);
                            }
                            class23.method187(arg3, arg8, arg4, arg2);
                            class101.method739();
                        }
                        if (class157.field2747[var12] || class156.field2738 > 1) {
                            if (var11.field871 == 0 && !var11.field990 && var11.field981 < var11.field947) {
                                class123.method862(var11.field947, true, var11.field873, var11.field981, var13, var15 + var11.field926);
                            }
                            if (var11.field871 != 1) {
                                if (var11.field871 == 2) {
                                    int var34 = 0;
                                    for (int var35 = 0; var35 < var11.field912; var35++) {
                                        for (int var36 = 0; var36 < var11.field1019; var36++) {
                                            int var37 = (var11.field967 + 32) * var35 + var13;
                                            int var38 = (var11.field927 + 32) * var36 + var15;
                                            if (var34 < 20) {
                                                var37 += var11.field954[var34];
                                                var38 += var11.field896[var34];
                                            }
                                            if (var11.field929[var34] > 0) {
                                                boolean var39 = false;
                                                boolean var40 = false;
                                                int var41 = var11.field929[var34] - 1;
                                                if ((var38 + 32) > arg3 && var38 < arg4 && arg8 < var37 + 32 && var37 < arg2 || class131.field2347 == var11 && class177.field3029 == var34) {
                                                    class184 var42;
                                                    if (class31.field611 == 1 && class3.field91 == var34 && class119.field2152 == var11.field935) {
                                                        var42 = class13.method133(var11.field919, var11.field1008[var34], 2, 0, (byte) -122, var41);
                                                    } else {
                                                        var42 = class13.method133(var11.field919, var11.field1008[var34], 1, 3153952, (byte) -125, var41);
                                                    }
                                                    if (class101.field1862) {
                                                        class137.field2456[var12] = true;
                                                    }
                                                    if (var42 == null) {
                                                        class257.method1718(false, var11);
                                                    } else if (class131.field2347 == var11 && class177.field3029 == var34) {
                                                        int var43 = class102.field1904 - class156.field2729;
                                                        int var44 = class245.field4253 - class24.field464;
                                                        if (var44 < 5 && var44 > -5) {
                                                            var44 = 0;
                                                        }
                                                        if (var43 < 5 && var43 > -5) {
                                                            var43 = 0;
                                                        }
                                                        if (class95.field1790 < 5) {
                                                            var44 = 0;
                                                            var43 = 0;
                                                        }
                                                        var42.method480(var38 + var44, var37 + var43, 128);
                                                        if (arg5 != -1) {
                                                            class44 var45 = arg7[arg5 & 0xFFFF];
                                                            int var46 = class23.field449;
                                                            int var47 = class23.field450;
                                                            if (var46 > var37 + var43 && var45.field873 > 0) {
                                                                int var48 = (var46 - var37 - var43) * class171.field2935 / 3;
                                                                if (class171.field2935 * 10 < var48) {
                                                                    var48 = class171.field2935 * 10;
                                                                }
                                                                if (var45.field873 < var48) {
                                                                    var48 = var45.field873;
                                                                }
                                                                class156.field2729 += var48;
                                                                var45.field873 -= var48;
                                                                class257.method1718(false, var45);
                                                            }
                                                            if (var37 + var43 + 32 > var47 && var45.field873 < var45.field947 - var45.field981) {
                                                                int var49 = (var37 + var43 + 32 - var47) * class171.field2935 / 3;
                                                                if (class171.field2935 * 10 < var49) {
                                                                    var49 = class171.field2935 * 10;
                                                                }
                                                                if (var45.field947 - var45.field981 - var45.field873 < var49) {
                                                                    var49 = var45.field947 - var45.field981 - var45.field873;
                                                                }
                                                                var45.field873 += var49;
                                                                class156.field2729 -= var49;
                                                                class257.method1718(false, var45);
                                                            }
                                                        }
                                                    } else if (class125.field2244 == var11 && class199.field3404 == var34) {
                                                        var42.method480(var38, var37, 128);
                                                    } else {
                                                        var42.method486(var38, var37);
                                                    }
                                                }
                                            } else if (var11.field946 != null && var34 < 20) {
                                                class184 var50 = var11.method348(-119, var34);
                                                if (var50 != null) {
                                                    var50.method486(var38, var37);
                                                } else if (class198.field3336) {
                                                    class257.method1718(false, var11);
                                                }
                                            }
                                            var34++;
                                        }
                                    }
                                } else if (var11.field871 == 3) {
                                    int var51;
                                    if (class64.method473(var11, 7070)) {
                                        var51 = var11.field917;
                                        if (class117.field2095 == var11 && var11.field906 != 0) {
                                            var51 = var11.field906;
                                        }
                                    } else {
                                        var51 = var11.field1018;
                                        if (class117.field2095 == var11 && var11.field971 != 0) {
                                            var51 = var11.field971;
                                        }
                                    }
                                    if (var14 == 0) {
                                        if (var11.field941) {
                                            class23.method198(var15, var13, var11.field926, var11.field981, var51);
                                        } else {
                                            class23.method208(var15, var13, var11.field926, var11.field981, var51);
                                        }
                                    } else if (var11.field941) {
                                        class23.method196(var15, var13, var11.field926, var11.field981, var51, 256 - (var14 & 0xFF));
                                    } else {
                                        class23.method204(var15, var13, var11.field926, var11.field981, var51, 256 - (var14 & 0xFF));
                                    }
                                } else if (var11.field871 == 4) {
                                    class107 var52 = var11.method340((byte) 112, class9.field179);
                                    if (var52 != null) {
                                        class257 var53 = var11.field965;
                                        int var54;
                                        if (class64.method473(var11, 7070)) {
                                            var54 = var11.field917;
                                            if (class117.field2095 == var11 && var11.field906 != 0) {
                                                var54 = var11.field906;
                                            }
                                            if (var11.field1024.method1679((byte) 109) > 0) {
                                                var53 = var11.field1024;
                                            }
                                        } else {
                                            var54 = var11.field1018;
                                            if (class117.field2095 == var11 && var11.field971 != 0) {
                                                var54 = var11.field971;
                                            }
                                        }
                                        if (var11.field990 && var11.field933 != -1) {
                                            class14 var55 = class156.method1090(var11.field933, 0);
                                            var53 = var55.field295;
                                            if (var53 == null) {
                                                var53 = class222.field3752;
                                            }
                                            if ((var55.field255 == 1 || var11.field963 != 1) && var11.field963 != -1) {
                                                var53 = class233.method1528(new class257[] { class126.field2251, var53, class7.field143, class173.method1176(var11.field963, -10581) }, arg9 - 1338);
                                            }
                                        }
                                        if (class73.field1421 == var11) {
                                            var53 = class132.field2368;
                                            var54 = var11.field1018;
                                        }
                                        if (!var11.field990) {
                                            var53 = class87.method648(var11, var53, (byte) -57);
                                        }
                                        var52.method775(var53, var15, var13, var11.field926, var11.field981, var54, var11.field916 ? 0 : -1, var11.field876, var11.field983, var11.field866);
                                    } else if (class198.field3336) {
                                        class257.method1718(false, var11);
                                    }
                                } else if (var11.field871 == 5) {
                                    if (var11.field990) {
                                        class184 var57;
                                        if (var11.field933 == -1) {
                                            var57 = var11.method343(true, false);
                                        } else {
                                            var57 = class13.method133(var11.field919, var11.field963, var11.field1028, var11.field964, (byte) -126, var11.field933);
                                        }
                                        if (var57 != null) {
                                            int var58 = var57.field3194;
                                            int var59 = var57.field3198;
                                            if (var11.field920) {
                                                int var61 = (var11.field926 - (1 - var58)) / var58;
                                                int var62 = (var59 + var11.field981 - 1) / var59;
                                                class23.method189(var15, var13, var15 + var11.field926, var11.field981 + var13);
                                                for (int var63 = 0; var63 < var61; var63++) {
                                                    for (int var64 = 0; var64 < var62; var64++) {
                                                        if (var11.field1007 != 0) {
                                                            var57.method1255((byte) 85, var11.field1007, 4096, var58 / 2 + (var15 + (var58 * var63)), var59 / 2 + var59 * var64 + var13);
                                                        } else if (var14 == 0) {
                                                            var57.method486(var58 * var63 + var15, var13 - -(var59 * var64));
                                                        } else {
                                                            var57.method480(var58 * var63 + var15, var59 * var64 + var13, 256 - (var14 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class23.method187(arg3, arg8, arg4, arg2);
                                            } else {
                                                int var60 = var11.field926 * 4096 / var58;
                                                if (var11.field1007 != 0) {
                                                    var57.method1255((byte) -97, var11.field1007, var60, var11.field926 / 2 + var15, var11.field981 / 2 + var13);
                                                } else if (var14 != 0) {
                                                    var57.method479(var15, var13, var11.field926, var11.field981, 256 - (var14 & 0xFF));
                                                } else if (var11.field926 == var58 && var11.field981 == var59) {
                                                    var57.method486(var15, var13);
                                                } else {
                                                    var57.method1254(var15, var13, var11.field926, var11.field981);
                                                }
                                            }
                                        } else if (class198.field3336) {
                                            class257.method1718(false, var11);
                                        }
                                    } else {
                                        class184 var56 = var11.method343(true, class64.method473(var11, 7070));
                                        if (var56 != null) {
                                            var56.method486(var15, var13);
                                        } else if (class198.field3336) {
                                            class257.method1718(false, var11);
                                        }
                                    }
                                } else if (var11.field871 == 6) {
                                    boolean var65 = class64.method473(var11, arg9 ^ 0x1EA4);
                                    int var66;
                                    if (var65) {
                                        var66 = var11.field907;
                                    } else {
                                        var66 = var11.field878;
                                    }
                                    int var67 = 0;
                                    class168 var68 = null;
                                    if (var11.field933 != -1) {
                                        class14 var69 = class156.method1090(var11.field933, 0);
                                        if (var69 != null) {
                                            class14 var70 = var69.method140(var11.field963, 10);
                                            class31 var71 = var66 == -1 ? null : class186.method1263(0, var66);
                                            var68 = var70.method144((byte) -127, 1, var11.field903, var71);
                                            if (var68 == null) {
                                                class257.method1718(false, var11);
                                            } else {
                                                var67 = -var68.method2() / 2;
                                            }
                                        }
                                    } else if (var11.field959 == 5) {
                                        if (var11.field930 == -1) {
                                            var68 = class120.field2171.method1602(-1, (class31) null, -1, arg9 ^ 0x529, (class31) null);
                                        } else {
                                            int var72 = var11.field930 & 0x7FF;
                                            if (class173.field2958 == var72) {
                                                var72 = 2047;
                                            }
                                            class180 var73 = class55.field1180[var72];
                                            class31 var74 = var66 == -1 ? null : class186.method1263(0, var66);
                                            if (var73 != null && (int) var73.field3140.method1668(arg9 - 1397) << 11 == (var11.field930 & 0xFFFFF800)) {
                                                var68 = var73.field3108.method1602(var11.field903, (class31) null, 0, -128, var74);
                                            }
                                        }
                                    } else if (var66 == -1) {
                                        var68 = var11.method347(arg9 + 28782, var65, class137.field2441.field3108, (class31) null, -1);
                                        if (var68 == null && class198.field3336) {
                                            class257.method1718(false, var11);
                                        }
                                    } else {
                                        class31 var75 = class186.method1263(0, var66);
                                        var68 = var11.method347(30120, var65, class137.field2441.field3108, var75, var11.field903);
                                        if (var68 == null && class198.field3336) {
                                            class257.method1718(false, var11);
                                        }
                                    }
                                    if (var68 != null) {
                                        int var76;
                                        if (var11.field987 <= 0) {
                                            var76 = 256;
                                        } else {
                                            var76 = (var11.field926 << 8) / var11.field987;
                                        }
                                        int var77;
                                        if (var11.field884 > 0) {
                                            var77 = (var11.field981 << 8) / var11.field884;
                                        } else {
                                            var77 = 256;
                                        }
                                        int var78 = var11.field926 / 2 + (var11.field951 * var76 >> 8) + var15;
                                        int var79 = (var11.field1027 * var77 >> 8) + var11.field981 / 2 + var13;
                                        class101.method732(var78, var79);
                                        int var80 = class101.field1872[var11.field870] * var11.field995 >> 16;
                                        int var81 = class101.field1871[var11.field870] * var11.field995 >> 16;
                                        if (!var11.field990) {
                                            var68.method1141(0, var11.field966, 0, var11.field870, 0, var80, var81);
                                        } else if (var11.field1016) {
                                            ((class232) var68).method1517(0, var11.field966, var11.field968, var11.field870, var11.field901, var67 + var80 + var11.field961, var11.field961 + var81, var11.field995);
                                        } else {
                                            var68.method1141(0, var11.field966, var11.field968, var11.field870, var11.field901, var11.field961 + var67 + var80, var11.field961 + var81);
                                        }
                                        class101.method730();
                                    }
                                } else {
                                    if (var11.field871 == 7) {
                                        class107 var82 = var11.method340((byte) 28, class9.field179);
                                        if (var82 == null) {
                                            if (class198.field3336) {
                                                class257.method1718(false, var11);
                                            }
                                            continue;
                                        }
                                        int var83 = 0;
                                        for (int var84 = 0; var84 < var11.field912; var84++) {
                                            for (int var85 = 0; var85 < var11.field1019; var85++) {
                                                if (var11.field929[var83] > 0) {
                                                    class14 var86 = class156.method1090(var11.field929[var83] - 1, 0);
                                                    class257 var87;
                                                    if (var86.field255 != 1 && var11.field1008[var83] == 1) {
                                                        var87 = class233.method1528(new class257[] { class126.field2251, var86.field295, class225.field3776 }, arg9 - 1338);
                                                    } else {
                                                        var87 = class233.method1528(new class257[] { class126.field2251, var86.field295, class7.field143, class173.method1176(var11.field1008[var83], -10581) }, 0);
                                                    }
                                                    int var88 = (var11.field927 + 115) * var85 + var15;
                                                    int var89 = (var11.field967 + 12) * var84 + var13;
                                                    if (var11.field876 == 0) {
                                                        var82.method790(var87, var88, var89, var11.field1018, var11.field916 ? 0 : -1);
                                                    } else if (var11.field876 == 1) {
                                                        var82.method794(var87, var88 + 57, var89, var11.field1018, var11.field916 ? 0 : -1);
                                                    } else {
                                                        var82.method773(var87, var88 + 115 - 1, var89, var11.field1018, var11.field916 ? 0 : -1);
                                                    }
                                                }
                                                var83++;
                                            }
                                        }
                                    }
                                    if (var11.field871 == 8 && class89.field1712 == var11 && class54.field1160 == class177.field3014) {
                                        int var90 = 0;
                                        class257 var91 = var11.field965;
                                        class107 var92 = class3.field93;
                                        class257 var93 = class87.method648(var11, var91, (byte) -57);
                                        int var94 = 0;
                                        while (var93.method1679((byte) 93) > 0) {
                                            int var102 = var93.method1683(false, class165.field2873);
                                            class257 var103;
                                            if (var102 == -1) {
                                                var103 = var93;
                                                var93 = class17.field378;
                                            } else {
                                                var103 = var93.method1713(arg9 - 1290, 0, var102);
                                                var93 = var93.method1674(var102 + 4, 255);
                                            }
                                            int var104 = var92.method792(var103);
                                            var90 += var92.field1996 + 1;
                                            if (var94 < var104) {
                                                var94 = var104;
                                            }
                                        }
                                        var94 += 6;
                                        int var95 = var11.field981 + var13 + 5;
                                        int var96 = var11.field926 + var15 - var94 - 5;
                                        var90 += 7;
                                        if (var15 + 5 > var96) {
                                            var96 = var15 + 5;
                                        }
                                        if (arg2 < var90 + var95) {
                                            var95 = arg2 - var90;
                                        }
                                        if (var94 + var96 > arg4) {
                                            var96 = arg4 - var94;
                                        }
                                        class23.method198(var96, var95, var94, var90, 16777120);
                                        class23.method208(var96, var95, var94, var90, 0);
                                        class257 var97 = var11.field965;
                                        int var98 = var92.field1996 + var95 + 2;
                                        class257 var99 = class87.method648(var11, var97, (byte) -57);
                                        while (var99.method1679((byte) 59) > 0) {
                                            int var100 = var99.method1683(false, class165.field2873);
                                            class257 var101;
                                            if (var100 == -1) {
                                                var101 = var99;
                                                var99 = class17.field378;
                                            } else {
                                                var101 = var99.method1713(arg9 ^ 0x50A, 0, var100);
                                                var99 = var99.method1674(var100 + 4, arg9 ^ 0x5C5);
                                            }
                                            var92.method790(var101, var96 + 3, var98, 0, -1);
                                            var98 += var92.field1996 + 1;
                                        }
                                    }
                                    if (var11.field871 == 9) {
                                        int var105;
                                        int var106;
                                        int var107;
                                        int var108;
                                        if (var11.field863) {
                                            var105 = var11.field981 + var13;
                                            var106 = var15;
                                            var107 = var13;
                                            var108 = var15 + var11.field926;
                                        } else {
                                            var107 = var11.field981 + var13;
                                            var108 = var11.field926 + var15;
                                            var105 = var13;
                                            var106 = var15;
                                        }
                                        if (var11.field937 == 1) {
                                            class23.method190(var106, var105, var108, var107, var11.field1018);
                                        } else {
                                            class23.method188(var106, var105, var108, var107, var11.field1018, var11.field937);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(B)V")
    public static void method1576(byte arg0) {
        field4104 = null;
        field4114 = null;
        field4117 = null;
        field4109 = null;
        field4110 = null;
        field4105 = null;
        if (arg0 < 29) {
            method1576((byte) 25);
        }
        field4106 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1577(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg5 < 112) {
            field4104 = null;
        }
        for (int var6 = arg0; var6 <= arg4; var6++) {
            class94.method692(class185.field3220[var6], (byte) 84, arg3, arg2, arg1);
        }
        field4108++;
    }

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "(III)V")
    public class239(int arg0, int arg1, int arg2) {
        this.field4102 = arg1;
        this.field4115 = arg2;
        this.field4111 = arg0;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BII)V")
    public abstract void method240(byte arg0, int arg1, int arg2);
}
