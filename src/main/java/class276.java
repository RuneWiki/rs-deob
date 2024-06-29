import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class276 {

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "[J")
    public static long[] field4403 = new long[500];

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "[I")
    public static int[] field4406 = new int[] { 8, 11, 4, 6, 9, 7, 10, 0 };

    @OriginalMember(owner = "client!kb", name = "g", descriptor = "I")
    public static int field4408 = 0;

    @OriginalMember(owner = "client!kb", name = "h", descriptor = "I")
    public static int field4409 = 0;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "I")
    public static int field4402;

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "I")
    public static int field4404;

    @OriginalMember(owner = "client!kb", name = "d", descriptor = "I")
    public static int field4405;

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "I")
    public static int field4407;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IIBIIIIIIZ)V")
    public static final void method1845(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9) {
        if (arg2 != 100) {
            method1846(false);
        }
        field4404++;
        int var10 = arg3 - arg6;
        int var11 = (arg7 - arg0 << 16) / var10;
        int var12 = arg4 - arg5;
        int var13 = (arg8 - arg1 << 16) / var12;
        class181.method1263(arg3, arg1, arg4, arg6, arg5, arg9, var13, 0, arg0, false, 0, var11);
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Z)V")
    public static void method1846(boolean arg0) {
        if (!arg0) {
            field4405 = 34;
        }
        field4406 = null;
        field4403 = null;
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B)Z")
    public static final boolean method1847(byte arg0) throws IOException {
        field4402++;
        if (class28.field400 == null) {
            return false;
        }
        int var1 = class28.field400.method1217(-125);
        if (var1 == 0) {
            return false;
        }
        if (class152.field2363 == -1) {
            class28.field400.method1209(arg0 + 108, 1, class96.field1283.field1218, 0);
            class96.field1283.field1228 = 0;
            var1--;
            class152.field2363 = class96.field1283.method1926(255);
            class219.field3508 = class108.field1509[class152.field2363];
        }
        if (class219.field3508 == -1) {
            if (var1 <= 0) {
                return false;
            }
            var1--;
            class28.field400.method1209(90, 1, class96.field1283.field1218, 0);
            class219.field3508 = class96.field1283.field1218[0] & 0xFF;
        }
        if (class219.field3508 == -2) {
            if (var1 <= 1) {
                return false;
            }
            var1 -= 2;
            class28.field400.method1209(arg0 + 49, 2, class96.field1283.field1218, 0);
            class96.field1283.field1228 = 0;
            class219.field3508 = class96.field1283.method549(255);
        }
        if (class219.field3508 > var1) {
            return false;
        }
        class96.field1283.field1228 = 0;
        class28.field400.method1209(108, class219.field3508, class96.field1283.field1218, 0);
        class292.field4641 = 0;
        class285.field4530 = class200.field3167;
        class200.field3167 = class206.field3306;
        class206.field3306 = class152.field2363;
        if (class152.field2363 == 0) {
            int var2 = class96.field1283.method562((byte) -18);
            int var3 = class96.field1283.method552((byte) -96);
            int var4 = class96.field1283.method548(119);
            int var5 = class96.field1283.method562((byte) -18);
            if (var3 >> 30 != 0) {
                int var6 = (var3 & 0x3851CB97) >> 28;
                int var7 = ((var3 & 0xFFFF779) >> 14) - class167.field2683;
                int var8 = (var3 & 0x3FFF) - class181.field2883;
                if (var7 >= 0 && var8 >= 0 && var7 < 104 && var8 < 104) {
                    int var9 = var8 * 128 + 64;
                    int var10 = var7 * 128 + 64;
                    class71 var11 = new class71(var5, var6, var10, var9, class166.method1148(var6, var10, var9, (byte) 124) - var2, var4, class73.field924);
                    class272.field4346.method1803(new class130(var11), -1);
                }
            } else if ((var3 >> 29) != 0) {
                int var12 = var3 & 0xFFFF;
                class200 var13 = class265.field4273[var12];
                if (var13 != null) {
                    boolean var14 = true;
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    if (var5 != -1 && var13.field3757 != -1) {
                        if (var13.field3757 == var5) {
                            class98 var15 = class79.method440(var5, (byte) 14);
                            if (var15.field1311 && var15.field1318 != -1) {
                                class165 var16 = class208.method1458((byte) -58, var15.field1318);
                                int var17 = var16.field2647;
                                if (var17 == 1) {
                                    var13.field3772 = 0;
                                    var13.field3739 = 0;
                                    var13.field3779 = class73.field924 + var4;
                                    var14 = false;
                                    var13.field3761 = 0;
                                    var13.field3832 = 1;
                                    class221.method1562(var13.field3772, var13.field3820, var13.field3818, var16, (byte) 47, false);
                                } else if (var17 == 2) {
                                    var14 = false;
                                    var13.field3759 = 0;
                                }
                            }
                        } else {
                            class98 var18 = class79.method440(var5, (byte) 14);
                            class98 var19 = class79.method440(var13.field3757, (byte) 14);
                            if (var18.field1318 != -1 && var19.field1318 != -1) {
                                class165 var20 = class208.method1458((byte) 86, var18.field1318);
                                class165 var21 = class208.method1458((byte) -57, var19.field1318);
                                if (var21.field2646 > var20.field2646) {
                                    var14 = false;
                                }
                            }
                        }
                    }
                    if (var14) {
                        var13.field3779 = class73.field924 + var4;
                        var13.field3761 = 0;
                        var13.field3757 = var5;
                        var13.field3783 = var2;
                        var13.field3832 = 1;
                        var13.field3772 = 0;
                        if (class73.field924 < var13.field3779) {
                            var13.field3772 = -1;
                        }
                        if (var13.field3757 != -1 && class73.field924 == var13.field3779) {
                            int var22 = class79.method440(var13.field3757, (byte) 14).field1318;
                            if (var22 != -1) {
                                class165 var23 = class208.method1458((byte) 114, var22);
                                if (var23 != null && var23.field2624 != null) {
                                    class221.method1562(0, var13.field3820, var13.field3818, var23, (byte) 47, false);
                                }
                            }
                        }
                    }
                }
            } else if (var3 >> 28 != 0) {
                int var24 = var3 & 0xFFFF;
                class259 var25;
                if (class185.field2958 == var24) {
                    var25 = class286.field4571;
                } else {
                    var25 = class89.field1113[var24];
                }
                if (var25 != null) {
                    if (var5 == 65535) {
                        var5 = -1;
                    }
                    boolean var26 = true;
                    if (var5 != -1 && var25.field3757 != -1) {
                        if (var25.field3757 == var5) {
                            class98 var27 = class79.method440(var5, (byte) 14);
                            if (var27.field1311 && var27.field1318 != -1) {
                                class165 var28 = class208.method1458((byte) -77, var27.field1318);
                                int var29 = var28.field2647;
                                if (var29 == 1) {
                                    var25.field3739 = 0;
                                    var25.field3779 = class73.field924 + var4;
                                    var25.field3832 = 1;
                                    var26 = false;
                                    var25.field3761 = 0;
                                    var25.field3772 = 0;
                                    class221.method1562(var25.field3772, var25.field3820, var25.field3818, var28, (byte) 47, false);
                                } else if (var29 == 2) {
                                    var26 = false;
                                    var25.field3759 = 0;
                                }
                            }
                        } else {
                            class98 var30 = class79.method440(var5, (byte) 14);
                            class98 var31 = class79.method440(var25.field3757, (byte) 14);
                            if (var30.field1318 != -1 && var31.field1318 != -1) {
                                class165 var32 = class208.method1458((byte) -123, var30.field1318);
                                class165 var33 = class208.method1458((byte) 110, var31.field1318);
                                if (var33.field2646 > var32.field2646) {
                                    var26 = false;
                                }
                            }
                        }
                    }
                    if (var26) {
                        var25.field3761 = 0;
                        var25.field3757 = var5;
                        var25.field3783 = var2;
                        var25.field3779 = class73.field924 + var4;
                        if (var25.field3757 == 65535) {
                            var25.field3757 = -1;
                        }
                        var25.field3832 = 1;
                        var25.field3772 = 0;
                        if (var25.field3779 > class73.field924) {
                            var25.field3772 = -1;
                        }
                        if (var25.field3757 != -1 && class73.field924 == var25.field3779) {
                            int var34 = class79.method440(var25.field3757, (byte) 14).field1318;
                            if (var34 != -1) {
                                class165 var35 = class208.method1458((byte) 109, var34);
                                if (var35 != null && var35.field2624 != null) {
                                    class221.method1562(0, var25.field3820, var25.field3818, var35, (byte) 47, class286.field4571 == var25);
                                }
                            }
                        }
                    }
                }
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 185) {
            byte[] var36 = new byte[class219.field3508];
            class96.field1283.method1925(0, var36, class219.field3508, 2512);
            String var37 = class156.method1097(var36, 0, -1, class219.field3508);
            if (class41.field517 == null && class48.field615 == 3 || !class48.field608.startsWith("win") || class22.field291) {
                class46.method259(true, false, var37);
            } else {
                class136.field2156 = var37;
                class90.field1127 = true;
                class23.field302 = class194.field3107.method275(var37, arg0 + 134);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 233) {
            long var38 = class96.field1283.method556(false);
            long var40 = (long) class96.field1283.method549(255);
            long var42 = (long) class96.field1283.method598(-1235752501);
            int var44 = class96.field1283.method584(255);
            int var45 = class96.field1283.method549(arg0 ^ 0xFFFFFF14);
            boolean var46 = false;
            long var47 = (var40 << 32) + var42;
            int var49 = 0;
            label1201: while (true) {
                if (var49 >= 100) {
                    if (var44 <= 1) {
                        for (int var50 = 0; var50 < class198.field3141; var50++) {
                            if (class53.field684[var50] == var38) {
                                var46 = true;
                                break label1201;
                            }
                        }
                    }
                    break;
                }
                if (class70.field867[var49] == var47) {
                    var46 = true;
                    break;
                }
                var49++;
            }
            if (!var46 && class251.field4093 == 0) {
                class70.field867[class264.field4263] = var47;
                class264.field4263 = (class264.field4263 + 1) % 100;
                String var51 = class155.method1065(var45, false).method1830(class96.field1283, (byte) 77);
                if (var44 == 2) {
                    class121.method786(var45, 18, false, (String) null, var51, "<img=1>" + class145.method1013(var38, 101));
                } else if (var44 == 1) {
                    class121.method786(var45, 18, false, (String) null, var51, "<img=0>" + class145.method1013(var38, 120));
                } else {
                    class121.method786(var45, 18, false, (String) null, var51, class145.method1013(var38, 99));
                }
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 60) {
            int var52 = class96.field1283.method562((byte) -18);
            int var53 = class96.field1283.method549(255);
            int var54 = class96.field1283.method586((byte) -81);
            int var55 = class96.field1283.method579(16711680);
            if (class200.method1398((byte) 35, var52)) {
                class139.method964(var55, (var54 << 16) + var53, 1);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 243) {
            int var56 = class96.field1283.method597(-1197332568);
            class123 var57 = class61.method358(var56, -119);
            for (int var58 = 0; var58 < var57.field1757.length; var58++) {
                var57.field1757[var58] = -1;
                var57.field1757[var58] = 0;
            }
            class129.method875((byte) -21, var57);
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 190) {
            int var59 = class96.field1283.method548(123);
            int var60 = class96.field1283.method562((byte) -18);
            int var61 = class96.field1283.method549(255);
            if (var59 == 65535) {
                var59 = -1;
            }
            int var62 = class96.field1283.method548(111);
            if (var60 == 65535) {
                var60 = -1;
            }
            int var63 = class96.field1283.method576(-97);
            if (class200.method1398((byte) 35, var62)) {
                for (int var64 = var60; var64 <= var59; var64++) {
                    long var65 = ((long) var63 << 32) + (long) var64;
                    class171 var67 = (class171) class25.field345.method708(var65, arg0 ^ 0xFFFFFFED);
                    class171 var68;
                    if (var67 != null) {
                        var68 = new class171(var67.field2703, var61);
                        var67.method1673(arg0 + 14531);
                    } else if (var64 == -1) {
                        var68 = new class171(class61.method358(var63, -124).field1828.field2703, var61);
                    } else {
                        var68 = new class171(0, var61);
                    }
                    class25.field345.method707(var65, var68, (byte) 120);
                }
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 209) {
            long var69 = class96.field1283.method556(false);
            long var71 = (long) class96.field1283.method549(arg0 + 276);
            long var73 = (long) class96.field1283.method598(arg0 ^ 0x49A81620);
            int var75 = class96.field1283.method584(255);
            boolean var76 = false;
            long var77 = (var71 << 32) + var73;
            int var79 = 0;
            label1251: while (true) {
                if (var79 >= 100) {
                    if (var75 <= 1) {
                        if ((!class54.field692 || class123.field1777) && !class216.field3471) {
                            for (int var80 = 0; var80 < class198.field3141; var80++) {
                                if (class53.field684[var80] == var69) {
                                    var76 = true;
                                    break label1251;
                                }
                            }
                        } else {
                            var76 = true;
                        }
                    }
                    break;
                }
                if (class70.field867[var79] == var77) {
                    var76 = true;
                    break;
                }
                var79++;
            }
            if (!var76 && class251.field4093 == 0) {
                class70.field867[class264.field4263] = var77;
                class264.field4263 = (class264.field4263 + 1) % 100;
                String var81 = class109.method683(class211.method1482(class118.method764((byte) -124, class96.field1283), -124));
                if (var75 == 2 || var75 == 3) {
                    class211.method1487(var81, "<img=1>" + class145.method1013(var69, 119), 7, (byte) -123);
                } else if (var75 == 1) {
                    class211.method1487(var81, "<img=0>" + class145.method1013(var69, 106), 7, (byte) -121);
                } else {
                    class211.method1487(var81, class145.method1013(var69, 89), 3, (byte) -123);
                }
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 240) {
            int var82 = class96.field1283.method549(255);
            int var83 = class96.field1283.method552((byte) -96);
            int var84 = class96.field1283.method586((byte) -81);
            int var85 = class96.field1283.method548(122);
            int var86 = class96.field1283.method586((byte) -81);
            if (class200.method1398((byte) 35, var85)) {
                class172.method1181(var86, var83, (byte) -27, var82, var84);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 4) {
            long var87 = class96.field1283.method556(false);
            int var89 = class96.field1283.method549(255);
            byte var90 = class96.field1283.method587(arg0 - 47);
            boolean var91 = false;
            if ((var87 & Long.MIN_VALUE) != 0L) {
                var91 = true;
            }
            if (var91) {
                if (class28.field404 == 0) {
                    class152.field2363 = -1;
                    return true;
                }
                long var92 = var87 & Long.MAX_VALUE;
                boolean var94 = false;
                int var95;
                for (var95 = 0; var95 < class28.field404 && (class17.field203[var95].field3923 != var92 || class17.field203[var95].field696 != var89); var95++) {
                }
                if (class28.field404 > var95) {
                    while ((class28.field404 - 1) > var95) {
                        class17.field203[var95] = class17.field203[var95 + 1];
                        var95++;
                    }
                    class28.field404--;
                    class17.field203[class28.field404] = null;
                }
            } else {
                String var96 = class96.field1283.method588(false);
                class55 var97 = new class55();
                var97.field3923 = var87;
                var97.field699 = class124.method815(var97.field3923, (byte) -51);
                var97.field696 = var89;
                var97.field706 = var96;
                var97.field698 = var90;
                int var98;
                for (var98 = class28.field404 - 1; var98 >= 0; var98--) {
                    int var99 = class17.field203[var98].field699.compareTo(var97.field699);
                    if (var99 == 0) {
                        class17.field203[var98].field696 = var89;
                        class17.field203[var98].field698 = var90;
                        class17.field203[var98].field706 = var96;
                        class152.field2363 = -1;
                        class255.field4139 = class162.field2582;
                        if (class121.field1729 == var87) {
                            class262.field4248 = var90;
                        }
                        return true;
                    }
                    if (var99 < 0) {
                        break;
                    }
                }
                if (class28.field404 >= class17.field203.length) {
                    class152.field2363 = -1;
                    return true;
                }
                for (int var100 = class28.field404 - 1; var100 > var98; var100--) {
                    class17.field203[var100 + 1] = class17.field203[var100];
                }
                if (class28.field404 == 0) {
                    class17.field203 = new class55[100];
                }
                class17.field203[var98 + 1] = var97;
                class28.field404++;
                if (class121.field1729 == var87) {
                    class262.field4248 = var90;
                }
            }
            class255.field4139 = class162.field2582;
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 43) {
            int var101 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
            int var102 = class96.field1283.method563(255);
            int var103 = class96.field1283.method563(255);
            class244.field4011 = var102 >> 1;
            class286.field4571.method1768(var103, (var102 & 0x1) == 1, 124, var101);
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 48) {
            class92.method514(0);
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 34) {
            if (class219.field3508 == 0) {
                class139.field2229 = class55.field697;
            } else {
                class139.field2229 = class96.field1283.method588(false);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 156) {
            int var104 = class96.field1283.method584(255);
            int var105 = var104 & 0x1F;
            int var106 = var104 >> 5;
            if (var105 == 0) {
                class134.field2111[var106] = null;
                class152.field2363 = -1;
                return true;
            }
            class262 var107 = new class262();
            var107.field4243 = var105;
            var107.field4243 = var104 & 0x3F;
            var107.field4247 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
            if (var107.field4247 >= 0 && class126.field2026.length > var107.field4247) {
                if (var107.field4243 == 1 || var107.field4243 == 10) {
                    var107.field4237 = class96.field1283.method549(arg0 + 276);
                    class96.field1283.field1228 += 5;
                } else if (var107.field4243 >= 2 && var107.field4243 <= 6) {
                    if (var107.field4243 == 2) {
                        var107.field4236 = 64;
                        var107.field4235 = 64;
                    }
                    if (var107.field4243 == 3) {
                        var107.field4235 = 64;
                        var107.field4236 = 0;
                    }
                    if (var107.field4243 == 4) {
                        var107.field4235 = 64;
                        var107.field4236 = 128;
                    }
                    if (var107.field4243 == 5) {
                        var107.field4235 = 0;
                        var107.field4236 = 64;
                    }
                    if (var107.field4243 == 6) {
                        var107.field4235 = 128;
                        var107.field4236 = 64;
                    }
                    var107.field4243 = 2;
                    var107.field4240 = class96.field1283.method549(255);
                    var107.field4245 = class96.field1283.method549(arg0 + 276);
                    var107.field4242 = class96.field1283.method584(255);
                    var107.field4241 = class96.field1283.method549(255);
                }
                var107.field4239 = class96.field1283.method549(255);
                if (var107.field4239 == 65535) {
                    var107.field4239 = -1;
                }
                class134.field2111[var106] = var107;
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 140) {
            int var108 = class96.field1283.method576(arg0 ^ 0x57);
            class283.field4507 = class194.field3107.method274(false, var108);
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 58) {
            int var109 = class96.field1283.method548(122);
            byte var110 = class96.field1283.method587(-46);
            int var111 = class96.field1283.method548(127);
            if (class200.method1398((byte) 35, var109)) {
                class24.method140(var110, var111, 1);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 21) {
            int var112 = class96.field1283.method549(255);
            if (var112 == 65535) {
                var112 = -1;
            }
            int var113 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
            int var114 = class96.field1283.method549(255);
            int var115 = class96.field1283.method584(255);
            class130.method885(var112, var114, var115, 0, var113);
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 132) {
            if (class164.field2602 != -1) {
                class185.method1294(-98, 0, class164.field2602);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 175) {
            class144.method1008(-8905);
            class152.field2363 = -1;
            return false;
        } else if (class152.field2363 == 107) {
            class127.method865((byte) 97);
            class7.method39(-115);
            class165.field2629 += 32;
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 172) {
            int var116 = class96.field1283.method586((byte) -81);
            int var117 = class96.field1283.method597(-1197332568);
            int var118 = class96.field1283.method563(255);
            if (class200.method1398((byte) 35, var116)) {
                class283.method1899(var118, var117, (byte) -107);
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 201) {
            int var119 = class96.field1283.method548(111);
            if (var119 == 65535) {
                var119 = -1;
            }
            String var120 = class96.field1283.method588(false);
            int var121 = class96.field1283.method585(255);
            int var122 = class96.field1283.method585(255);
            if (var122 >= 1 && var122 <= 8) {
                if (var120.equalsIgnoreCase("null")) {
                    var120 = null;
                }
                class163.field2597[var122 - 1] = var120;
                class27.field390[var122 - 1] = var119;
                class56.field718[var122 - 1] = var121 == 0;
            }
            class152.field2363 = -1;
            return true;
        } else if (class152.field2363 == 77) {
            int var123 = class96.field1283.method563(255);
            int var124 = class96.field1283.method549(255);
            int var125 = class96.field1283.method549(arg0 + 276);
            class200 var126 = class265.field4273[var124];
            if (var126 != null) {
                class167.method1153(var123, var126, (byte) 119, var125);
            }
            class152.field2363 = -1;
            return true;
        } else {
            if (arg0 != -21) {
                field4409 = -19;
            }
            if (class152.field2363 == 211) {
                class7.field87 = class96.field1283.method584(255);
                class152.field2363 = -1;
                class68.field856 = class162.field2582;
                return true;
            } else if (class152.field2363 == 128) {
                int var127 = class96.field1283.method548(125);
                int var128 = class96.field1283.method548(arg0 ^ 0xFFFFFF90);
                int var129 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var129)) {
                    class114.method748(var127, -45, var128);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 83) {
                int var130 = class96.field1283.method548(arg0 + 141);
                int var131 = class96.field1283.method552((byte) -96);
                class52.method298(var131, 0, var130);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 186) {
                String var132 = class96.field1283.method588(false);
                int var133 = class96.field1283.method548(112);
                int var134 = class96.field1283.method576(-92);
                if (class200.method1398((byte) 35, var133)) {
                    class292.method1963(var134, var132, arg0 - 105);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 199) {
                int var135 = class96.field1283.method584(255);
                if (class96.field1283.method584(arg0 ^ 0xFFFFFF14) == 0) {
                    class104.field1405[var135] = new class70();
                } else {
                    class96.field1283.field1228--;
                    class104.field1405[var135] = new class70(class96.field1283);
                }
                class271.field4330 = class162.field2582;
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 97) {
                int var136 = class96.field1283.method584(arg0 + 276);
                int var137 = class96.field1283.method562((byte) -18);
                if (class200.method1398((byte) 35, var137)) {
                    class195.field3115 = var136;
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 100) {
                long var138 = class96.field1283.method556(false);
                class96.field1283.method587(-5);
                long var140 = class96.field1283.method556(false);
                long var142 = (long) class96.field1283.method549(255);
                long var144 = (long) class96.field1283.method598(-1235752501);
                boolean var146 = false;
                int var147 = class96.field1283.method584(255);
                long var148 = (var142 << 32) + var144;
                int var150 = class96.field1283.method549(255);
                int var151 = 0;
                label1320: while (true) {
                    if (var151 >= 100) {
                        if (var147 <= 1) {
                            for (int var152 = 0; var152 < class198.field3141; var152++) {
                                if (class53.field684[var152] == var138) {
                                    var146 = true;
                                    break label1320;
                                }
                            }
                        }
                        break;
                    }
                    if (class70.field867[var151] == var148) {
                        var146 = true;
                        break;
                    }
                    var151++;
                }
                if (!var146 && class251.field4093 == 0) {
                    class70.field867[class264.field4263] = var148;
                    class264.field4263 = (class264.field4263 + 1) % 100;
                    String var153 = class155.method1065(var150, false).method1830(class96.field1283, (byte) 37);
                    if (var147 == 2 || var147 == 3) {
                        class121.method786(var150, 20, false, class145.method1013(var140, 30), var153, "<img=1>" + class145.method1013(var138, 48));
                    } else if (var147 == 1) {
                        class121.method786(var150, 20, false, class145.method1013(var140, 95), var153, "<img=0>" + class145.method1013(var138, arg0 + 80));
                    } else {
                        class121.method786(var150, 20, false, class145.method1013(var140, 78), var153, class145.method1013(var138, 123));
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 63) {
                int var154 = class96.field1283.method583(-1);
                int var155 = class96.field1283.method549(255);
                if (var155 == 65535) {
                    var155 = -1;
                }
                class172.method1179(var154, var155, (byte) -94);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 142) {
                int var156 = class96.field1283.method559(true);
                int var157 = class96.field1283.method585(arg0 ^ 0xFFFFFF14);
                int var158 = class96.field1283.method549(arg0 + 276);
                if (var158 == 65535) {
                    var158 = -1;
                }
                class175.method1212(var156, var158, var157, (byte) 122);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 108) {
                class7.method39(arg0 ^ 0x6D);
                class106.field1422 = class96.field1283.method564(-105);
                class152.field2363 = -1;
                class213.field3417 = class162.field2582;
                return true;
            } else if (class152.field2363 == 197) {
                byte var159 = class96.field1283.method567(23);
                int var160 = class96.field1283.method549(255);
                class52.method298(var159, 0, var160);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 66) {
                int var161 = class96.field1283.method549(255);
                int var162 = class96.field1283.method597(arg0 ^ 0x475DD843);
                if (class200.method1398((byte) 35, var161)) {
                    class86 var163 = (class86) class92.field1139.method708((long) var162, -21);
                    if (var163 != null) {
                        class289.method1943(var163, false, true);
                    }
                    if (class108.field1486 != null) {
                        class129.method875((byte) -21, class108.field1486);
                        class108.field1486 = null;
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 102) {
                int var164 = class96.field1283.method549(255);
                String var165 = class96.field1283.method588(false);
                int var166 = class96.field1283.method586((byte) -81);
                if (class200.method1398((byte) 35, var164)) {
                    class294.method1976(var166, var165, -121);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 200) {
                int var167 = class96.field1283.method549(255);
                int var168 = class96.field1283.method552((byte) -96);
                int var169 = class96.field1283.method562((byte) -18);
                int var170 = class96.field1283.method548(arg0 + 146);
                int var171 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var167)) {
                    class32.method180(var171, 7, var168, true, var169 << 16 | var170);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 10) {
                class96.field1283.field1228 += 28;
                if (class96.field1283.method537(-4)) {
                    class137.method957(-31927, class96.field1283, class96.field1283.field1228 - 28);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 154) {
                int var172 = class96.field1283.method564(arg0 - 89);
                int var173 = class96.field1283.method552((byte) -96);
                int var174 = class96.field1283.method586((byte) -81);
                if (class200.method1398((byte) 35, var174)) {
                    class42.method235(var173, var172, 5);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 253) {
                int var175 = class96.field1283.method586((byte) -81);
                int var176 = class96.field1283.method562((byte) -18);
                int var177 = class96.field1283.method579(16711680);
                int var178 = class96.field1283.method548(116);
                if (var178 == 65535) {
                    var178 = -1;
                }
                int var179 = class96.field1283.method576(-117);
                if (var176 == 65535) {
                    var176 = -1;
                }
                if (class200.method1398((byte) 35, var175)) {
                    for (int var180 = var178; var180 <= var176; var180++) {
                        long var181 = ((long) var177 << 32) + (long) var180;
                        class171 var183 = (class171) class25.field345.method708(var181, 124);
                        class171 var184;
                        if (var183 != null) {
                            var184 = new class171(var179, var183.field2709);
                            var183.method1673(14510);
                        } else if (var180 == -1) {
                            var184 = new class171(var179, class61.method358(var177, arg0 - 107).field1828.field2709);
                        } else {
                            var184 = new class171(var179, -1);
                        }
                        class25.field345.method707(var181, var184, (byte) 120);
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 40) {
                int var185 = class96.field1283.method549(255);
                int var186 = class96.field1283.method576(-115);
                int var187 = class96.field1283.method562((byte) -18);
                if (var187 == 65535) {
                    var187 = -1;
                }
                if (class200.method1398((byte) 35, var185)) {
                    class32.method180(-1, 2, var186, true, var187);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 32) {
                int var188 = class96.field1283.method585(255);
                int var189 = class96.field1283.method562((byte) -18);
                class170.method1162(var189, var188, (byte) -112);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 195 || class152.field2363 == 222 || class152.field2363 == 229 || class152.field2363 == 180 || class152.field2363 == 112 || class152.field2363 == 69 || class152.field2363 == 239 || class152.field2363 == 246 || class152.field2363 == 170 || class152.field2363 == 203 || class152.field2363 == 87 || class152.field2363 == 52 || class152.field2363 == 99 || class152.field2363 == 49) {
                class150.method1037((byte) -94);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 70) {
                class156.field2508 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
                class21.field269 = class96.field1283.method584(255);
                class99.field1325 = class96.field1283.method584(255);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 158) {
                class265.field4266 = class96.field1283.method563(255);
                class9.field106 = class96.field1283.method585(arg0 ^ 0xFFFFFF14);
                for (int var190 = class265.field4266; var190 < class265.field4266 + 8; var190++) {
                    for (int var192 = class9.field106; var192 < (class9.field106 + 8); var192++) {
                        if (class206.field3296[class244.field4011][var190][var192] != null) {
                            class206.field3296[class244.field4011][var190][var192] = null;
                            class40.method221(var192, -118, var190);
                        }
                    }
                }
                for (class220 var191 = (class220) class24.field339.method1802(43); var191 != null; var191 = (class220) class24.field339.method1815(arg0 + 21)) {
                    if (var191.field3517 >= class265.field4266 && var191.field3517 < (class265.field4266 + 8) && var191.field3523 >= class9.field106 && (class9.field106 + 8) > var191.field3523 && class244.field4011 == var191.field3527) {
                        var191.field3520 = 0;
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 167) {
                int var193 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var193)) {
                    class269.method1811(-1886318102);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 86) {
                long var194 = class96.field1283.method556(false);
                String var196 = class109.method683(class211.method1482(class118.method764((byte) -126, class96.field1283), 39));
                class211.method1487(var196, class145.method1013(var194, 119), 6, (byte) -125);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 81) {
                class211.field3399 = class96.field1283.method584(arg0 + 276);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 245) {
                int var197 = class96.field1283.method597(arg0 ^ 0x475DD843);
                int var198 = class96.field1283.method549(255);
                if (var197 < -70000) {
                    var198 += 32768;
                }
                class123 var199;
                if (var197 >= 0) {
                    var199 = class61.method358(var197, arg0 - 103);
                } else {
                    var199 = null;
                }
                if (var199 != null) {
                    for (int var200 = 0; var200 < var199.field1757.length; var200++) {
                        var199.field1757[var200] = 0;
                        var199.field1905[var200] = 0;
                    }
                }
                class66.method384((byte) -115, var198);
                int var201 = class96.field1283.method549(arg0 ^ 0xFFFFFF14);
                for (int var202 = 0; var202 < var201; var202++) {
                    int var203 = class96.field1283.method563(255);
                    if (var203 == 255) {
                        var203 = class96.field1283.method552((byte) -96);
                    }
                    int var204 = class96.field1283.method562((byte) -18);
                    if (var199 != null && var202 < var199.field1757.length) {
                        var199.field1757[var202] = var204;
                        var199.field1905[var202] = var203;
                    }
                    class60.method350(var198, var202, var204 - 1, (byte) -110, var203);
                }
                if (var199 != null) {
                    class129.method875((byte) -21, var199);
                }
                class7.method39(-122);
                class7.field86[class173.method1186(31, class88.field1090++)] = class173.method1186(32767, var198);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 74) {
                long var205 = class96.field1283.method556(false);
                int var207 = class96.field1283.method549(255);
                int var208 = class96.field1283.method584(255);
                String var209 = "";
                if (var207 > 0) {
                    var209 = class96.field1283.method588(false);
                }
                boolean var210 = true;
                if (var205 < 0L) {
                    var205 &= Long.MAX_VALUE;
                    var210 = false;
                }
                String var211 = class145.method1013(var205, 32);
                for (int var212 = 0; var212 < class88.field1091; var212++) {
                    if (class251.field4108[var212] == var205) {
                        if (class188.field3055[var212] != var207) {
                            class188.field3055[var212] = var207;
                            if (var207 > 0) {
                                class211.method1487(var211 + class240.field3950, "", 5, (byte) -121);
                            }
                            if (var207 == 0) {
                                class211.method1487(var211 + class98.field1298, "", 5, (byte) -125);
                            }
                        }
                        class34.field443[var212] = var209;
                        var211 = null;
                        client.field1605[var212] = var208;
                        class219.field3503[var212] = var210;
                        break;
                    }
                }
                if (var211 != null && class88.field1091 < 200) {
                    class251.field4108[class88.field1091] = var205;
                    class143.field2256[class88.field1091] = var211;
                    class188.field3055[class88.field1091] = var207;
                    class34.field443[class88.field1091] = var209;
                    client.field1605[class88.field1091] = var208;
                    class219.field3503[class88.field1091] = var210;
                    class88.field1091++;
                }
                class68.field856 = class162.field2582;
                boolean var213 = false;
                int var214 = class88.field1091;
                while (var214 > 0) {
                    boolean var215 = true;
                    var214--;
                    for (int var216 = 0; var216 < var214; var216++) {
                        if (class188.field3055[var216] != class115.field1638 && class188.field3055[var216 + 1] == class115.field1638 || class188.field3055[var216] == 0 && class188.field3055[var216 + 1] != 0) {
                            var215 = false;
                            int var217 = class188.field3055[var216];
                            class188.field3055[var216] = class188.field3055[var216 + 1];
                            class188.field3055[var216 + 1] = var217;
                            String var218 = class34.field443[var216];
                            class34.field443[var216] = class34.field443[var216 + 1];
                            class34.field443[var216 + 1] = var218;
                            String var219 = class143.field2256[var216];
                            class143.field2256[var216] = class143.field2256[var216 + 1];
                            class143.field2256[var216 + 1] = var219;
                            long var220 = class251.field4108[var216];
                            class251.field4108[var216] = class251.field4108[var216 + 1];
                            class251.field4108[var216 + 1] = var220;
                            int var222 = client.field1605[var216];
                            client.field1605[var216] = client.field1605[var216 + 1];
                            client.field1605[var216 + 1] = var222;
                            boolean var223 = class219.field3503[var216];
                            class219.field3503[var216] = class219.field3503[var216 + 1];
                            class219.field3503[var216 + 1] = var223;
                        }
                    }
                    if (var215) {
                        break;
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 138) {
                for (int var224 = 0; var224 < class135.field2141.length; var224++) {
                    if (class238.field3939[var224] != class135.field2141[var224]) {
                        class135.field2141[var224] = class238.field3939[var224];
                        class25.method145(var224, -51);
                        class105.field1417[class173.method1186(class165.field2629++, 31)] = var224;
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 42) {
                class160.field2557 = class96.field1283.method586((byte) -81) * 30;
                class152.field2363 = -1;
                class213.field3417 = class162.field2582;
                return true;
            } else if (class152.field2363 == 178) {
                class7.method39(91);
                class124.field1930 = class96.field1283.method584(255);
                class213.field3417 = class162.field2582;
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 169) {
                int var225 = class96.field1283.method549(255);
                String var226 = class96.field1283.method588(false);
                Object[] var227 = new Object[var226.length() + 1];
                for (int var228 = var226.length() - 1; var228 >= 0; var228--) {
                    if (var226.charAt(var228) == 's') {
                        var227[var228 + 1] = class96.field1283.method588(false);
                    } else {
                        var227[var228 + 1] = Integer.valueOf(class96.field1283.method597(-1197332568));
                    }
                }
                var227[0] = Integer.valueOf(class96.field1283.method597(-1197332568));
                if (class200.method1398((byte) 35, var225)) {
                    class156 var229 = new class156();
                    var229.field2512 = var227;
                    class296.method1985(var229, 200000);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 177) {
                int var230 = class96.field1283.method548(119);
                int var231 = class96.field1283.method584(255);
                int var232 = class96.field1283.method552((byte) -96);
                int var233 = class96.field1283.method586((byte) -81);
                if (class200.method1398((byte) 35, var230)) {
                    class86 var234 = (class86) class92.field1139.method708((long) var232, -46);
                    if (var234 != null) {
                        class289.method1943(var234, false, var234.field1064 != var233);
                    }
                    class246.method1710(var233, false, var232, var231);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 250) {
                int var235 = class96.field1283.method549(arg0 ^ 0xFFFFFF14);
                if (class200.method1398((byte) 35, var235)) {
                    class279.method1864((byte) -124);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 176) {
                int var236 = class96.field1283.method549(arg0 + 276);
                String var237 = class96.field1283.method588(false);
                int var238 = class96.field1283.method548(118);
                if (class200.method1398((byte) 35, var236)) {
                    class294.method1976(var238, var237, arg0 ^ 0x6D);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 51) {
                long var239 = class96.field1283.method556(false);
                int var241 = class96.field1283.method549(255);
                String var242 = class155.method1065(var241, false).method1830(class96.field1283, (byte) 103);
                class121.method786(var241, 19, false, (String) null, var242, class145.method1013(var239, 61));
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 192) {
                int var243 = class96.field1283.method579(16711680);
                int var244 = (var243 & 0x35276166) >> 28;
                int var245 = (var243 & 0xFFFFABB) >> 14;
                int var246 = var243 & 0x3FFF;
                int var247 = class96.field1283.method583(-1);
                int var248 = var247 >> 2;
                int var249 = var247 & 0x3;
                int var250 = class115.field1645[var248];
                int var251 = class96.field1283.method586((byte) -81);
                int var252 = var246 - class181.field2883;
                int var253 = var245 - class167.field2683;
                if (var251 == 65535) {
                    var251 = -1;
                }
                class266.method1790(var244, var249, var252, Integer.MAX_VALUE, var251, var248, var250, var253);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 220) {
                class186.method1300(true, false);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 164) {
                int var254 = class96.field1283.method549(255);
                int var255 = class96.field1283.method584(255);
                int var256 = class96.field1283.method584(255);
                int var257 = class96.field1283.method549(255);
                int var258 = class96.field1283.method584(255);
                int var259 = class96.field1283.method584(255);
                if (class200.method1398((byte) 35, var254)) {
                    class5.method33(true, var259, var255, var257, var256, 125, var258);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 153) {
                int var260 = class96.field1283.method579(16711680);
                int var261 = class96.field1283.method548(119);
                int var262 = class96.field1283.method549(255);
                if (var262 == 65535) {
                    var262 = -1;
                }
                if (class200.method1398((byte) 35, var261)) {
                    class32.method180(-1, 1, var260, true, var262);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 179) {
                int var263 = class96.field1283.method552((byte) -96);
                int var264 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var264)) {
                    int var265 = 0;
                    if (class286.field4571.field4219 != null) {
                        var265 = class286.field4571.field4219.method904((byte) -112);
                    }
                    class32.method180(-1, 3, var263, true, var265);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 126) {
                int var266 = class96.field1283.method562((byte) -18);
                int var267 = class96.field1283.method579(16711680);
                int var268 = class96.field1283.method586((byte) -81);
                int var269 = class96.field1283.method576(-87);
                if (var268 == 65535) {
                    var268 = -1;
                }
                if (class200.method1398((byte) 35, var266)) {
                    class123 var270 = class61.method358(var267, -120);
                    if (var270.field1796) {
                        class297.method1992(var268, var267, true, var269);
                        class108 var272 = class256.method1753(-2, var268);
                        class172.method1181(var272.field1521, var267, (byte) -27, var272.field1530, var272.field1483);
                        class282.method1887(var267, var272.field1516, var272.field1515, 0, var272.field1479);
                    } else if (var268 == -1) {
                        var270.field1769 = 0;
                        class152.field2363 = -1;
                        return true;
                    } else {
                        class108 var271 = class256.method1753(-2, var268);
                        var270.field1769 = 4;
                        var270.field1907 = var271.field1530;
                        var270.field1878 = var271.field1483 * 100 / var269;
                        var270.field1804 = var271.field1521;
                        var270.field1818 = var268;
                        class129.method875((byte) -21, var270);
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 143) {
                for (int var273 = 0; var273 < class89.field1113.length; var273++) {
                    if (class89.field1113[var273] != null) {
                        class89.field1113[var273].field3827 = -1;
                    }
                }
                for (int var274 = 0; var274 < class265.field4273.length; var274++) {
                    if (class265.field4273[var274] != null) {
                        class265.field4273[var274].field3827 = -1;
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 129) {
                class7.method39(-117);
                int var275 = class96.field1283.method597(-1197332568);
                int var276 = class96.field1283.method585(255);
                int var277 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
                class208.field3327[var277] = var275;
                class187.field2984[var277] = var276;
                class102.field1382[var277] = 1;
                for (int var278 = 0; var278 < 98; var278++) {
                    if (var275 >= class297.field4694[var278]) {
                        class102.field1382[var277] = var278 + 2;
                    }
                }
                class114.field1633[class173.method1186(class202.field3194++, 31)] = var277;
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 160) {
                String var279 = class96.field1283.method588(false);
                if (var279.endsWith(":tradereq:")) {
                    String var280 = var279.substring(0, var279.indexOf(":"));
                    boolean var281 = false;
                    long var282 = class185.method1296((byte) -103, var280);
                    for (int var284 = 0; var284 < class198.field3141; var284++) {
                        if (class53.field684[var284] == var282) {
                            var281 = true;
                            break;
                        }
                    }
                    if (!var281 && class251.field4093 == 0) {
                        class211.method1487(class115.field1646, var280, 4, (byte) -122);
                    }
                } else if (var279.endsWith(":chalreq:")) {
                    String var285 = var279.substring(0, var279.indexOf(":"));
                    long var286 = class185.method1296((byte) -103, var285);
                    boolean var288 = false;
                    for (int var289 = 0; var289 < class198.field3141; var289++) {
                        if (class53.field684[var289] == var286) {
                            var288 = true;
                            break;
                        }
                    }
                    if (!var288 && class251.field4093 == 0) {
                        String var290 = var279.substring(var279.indexOf(":") + 1, var279.length() + -9);
                        class211.method1487(var290, var285, 8, (byte) -122);
                    }
                } else if (var279.endsWith(":assistreq:")) {
                    String var291 = var279.substring(0, var279.indexOf(":"));
                    long var292 = class185.method1296((byte) -103, var291);
                    boolean var294 = false;
                    for (int var295 = 0; var295 < class198.field3141; var295++) {
                        if (class53.field684[var295] == var292) {
                            var294 = true;
                            break;
                        }
                    }
                    if (!var294 && class251.field4093 == 0) {
                        class211.method1487("", var291, 10, (byte) -128);
                    }
                } else if (var279.endsWith(":clan:")) {
                    String var319 = var279.substring(0, var279.indexOf(":clan:"));
                    class211.method1487(var319, "", 11, (byte) -125);
                } else if (var279.endsWith(":trade:")) {
                    String var296 = var279.substring(0, var279.indexOf(":trade:"));
                    if (class251.field4093 == 0) {
                        class211.method1487(var296, "", 12, (byte) -124);
                    }
                } else if (var279.endsWith(":assist:")) {
                    String var318 = var279.substring(0, var279.indexOf(":assist:"));
                    if (class251.field4093 == 0) {
                        class211.method1487(var318, "", 13, (byte) -125);
                    }
                } else if (var279.endsWith(":duelstake:")) {
                    String var313 = var279.substring(0, var279.indexOf(":"));
                    boolean var314 = false;
                    long var315 = class185.method1296((byte) -103, var313);
                    for (int var317 = 0; var317 < class198.field3141; var317++) {
                        if (class53.field684[var317] == var315) {
                            var314 = true;
                            break;
                        }
                    }
                    if (!var314 && class251.field4093 == 0) {
                        class211.method1487("", var313, 14, (byte) -126);
                    }
                } else if (var279.endsWith(":duelfriend:")) {
                    String var297 = var279.substring(0, var279.indexOf(":"));
                    long var298 = class185.method1296((byte) -103, var297);
                    boolean var300 = false;
                    for (int var301 = 0; var301 < class198.field3141; var301++) {
                        if (class53.field684[var301] == var298) {
                            var300 = true;
                            break;
                        }
                    }
                    if (!var300 && class251.field4093 == 0) {
                        class211.method1487("", var297, 15, (byte) -123);
                    }
                } else if (var279.endsWith(":clanreq:")) {
                    String var308 = var279.substring(0, var279.indexOf(":"));
                    long var309 = class185.method1296((byte) -103, var308);
                    boolean var311 = false;
                    for (int var312 = 0; var312 < class198.field3141; var312++) {
                        if (class53.field684[var312] == var309) {
                            var311 = true;
                            break;
                        }
                    }
                    if (!var311 && class251.field4093 == 0) {
                        class211.method1487("", var308, 16, (byte) -122);
                    }
                } else if (var279.endsWith(":allyreq:")) {
                    String var302 = var279.substring(0, var279.indexOf(":"));
                    long var303 = class185.method1296((byte) -103, var302);
                    boolean var305 = false;
                    for (int var306 = 0; var306 < class198.field3141; var306++) {
                        if (class53.field684[var306] == var303) {
                            var305 = true;
                            break;
                        }
                    }
                    if (!var305 && class251.field4093 == 0) {
                        String var307 = var279.substring(var279.indexOf(":") + 1, var279.length() + -9);
                        class211.method1487(var307, var302, 21, (byte) -126);
                    }
                } else {
                    class211.method1487(var279, "", 0, (byte) -122);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 82) {
                int var320 = class96.field1283.method549(255);
                int var321 = class96.field1283.method584(255);
                int var322 = class96.field1283.method584(arg0 + 276);
                int var323 = class96.field1283.method584(255);
                int var324 = class96.field1283.method584(255);
                int var325 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var320)) {
                    class272.field4341[var321] = true;
                    class59.field762[var321] = var322;
                    class9.field109[var321] = var323;
                    class28.field402[var321] = var324;
                    class60.field765[var321] = var325;
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 15) {
                class203.method1411(class96.field1283.method588(false), 125);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 247) {
                int var326 = class96.field1283.method586((byte) -81);
                int var327 = class96.field1283.method597(arg0 ^ 0x475DD843);
                int var328 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var326)) {
                    class74.method416(var328, (byte) 100, var327);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 224) {
                class186.method1300(true, true);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 114) {
                int var329 = class96.field1283.method549(255);
                int var330 = class96.field1283.method576(-74);
                int var331 = class96.field1283.method552((byte) -96);
                if (class200.method1398((byte) 35, var329)) {
                    class86 var332 = (class86) class92.field1139.method708((long) var330, -52);
                    class86 var333 = (class86) class92.field1139.method708((long) var331, 127);
                    if (var333 != null) {
                        class289.method1943(var333, false, var332 == null || var332.field1064 != var333.field1064);
                    }
                    if (var332 != null) {
                        var332.method1673(14510);
                        class92.field1139.method707((long) var331, var332, (byte) 120);
                    }
                    class123 var334 = class61.method358(var330, arg0 ^ 0x6D);
                    if (var334 != null) {
                        class129.method875((byte) -21, var334);
                    }
                    class123 var335 = class61.method358(var331, -128);
                    if (var335 != null) {
                        class129.method875((byte) -21, var335);
                        class21.method118((byte) -2, true, var335);
                    }
                    if (class164.field2602 != -1) {
                        class185.method1294(arg0 - 95, 1, class164.field2602);
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 54) {
                int var336 = class96.field1283.method597(-1197332568);
                int var337 = class96.field1283.method549(255);
                if (var336 < -70000) {
                    var337 += 32768;
                }
                class123 var338;
                if (var336 < 0) {
                    var338 = null;
                } else {
                    var338 = class61.method358(var336, -121);
                }
                while (class96.field1283.field1228 < class219.field3508) {
                    int var339 = 0;
                    int var340 = class96.field1283.method539(-401085592);
                    int var341 = class96.field1283.method549(255);
                    if (var341 != 0) {
                        var339 = class96.field1283.method584(255);
                        if (var339 == 255) {
                            var339 = class96.field1283.method597(-1197332568);
                        }
                    }
                    if (var338 != null && var340 >= 0 && var340 < var338.field1757.length) {
                        var338.field1757[var340] = var341;
                        var338.field1905[var340] = var339;
                    }
                    class60.method350(var337, var340, var341 - 1, (byte) -124, var339);
                }
                if (var338 != null) {
                    class129.method875((byte) -21, var338);
                }
                class7.method39(-122);
                class7.field86[class173.method1186(class88.field1090++, 31)] = class173.method1186(var337, 32767);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 145) {
                int var342 = class96.field1283.method584(arg0 + 276);
                int var343 = class96.field1283.method549(arg0 ^ 0xFFFFFF14);
                int var344 = class96.field1283.method562((byte) -18);
                if (class200.method1398((byte) 35, var343)) {
                    if (var342 == 2) {
                        class189.method1319(25);
                    }
                    class164.field2602 = var344;
                    class291.method1957(20470, var344);
                    class138.method961(arg0 - 102, false);
                    class218.method1542(false, class164.field2602);
                    for (int var345 = 0; var345 < 100; var345++) {
                        class21.field279[var345] = true;
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 61) {
                class233.field3856 = 0;
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 206) {
                class198.field3141 = class219.field3508 / 8;
                for (int var346 = 0; var346 < class198.field3141; var346++) {
                    class53.field684[var346] = class96.field1283.method556(false);
                    class40.field496[var346] = class178.method1242((byte) -23, class53.field684[var346]);
                    class71.field893[var346] = false;
                }
                class68.field856 = class162.field2582;
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 248) {
                int var347 = class96.field1283.method549(255);
                int var348 = class96.field1283.method584(255);
                int var349 = class96.field1283.method584(255);
                int var350 = class96.field1283.method549(255);
                int var351 = class96.field1283.method584(255);
                int var352 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
                if (class200.method1398((byte) 35, var347)) {
                    class274.method1842(var349, var351, var350, var348, 25922, var352);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 80) {
                long var353 = class96.field1283.method556(false);
                class96.field1283.method587(arg0 - 39);
                long var355 = class96.field1283.method556(false);
                long var357 = (long) class96.field1283.method549(255);
                long var359 = (long) class96.field1283.method598(arg0 - 1235752480);
                long var361 = (var357 << 32) + var359;
                int var363 = class96.field1283.method584(255);
                boolean var364 = false;
                int var365 = 0;
                label1506: while (true) {
                    if (var365 >= 100) {
                        if (var363 <= 1) {
                            if ((!class54.field692 || class123.field1777) && !class216.field3471) {
                                for (int var366 = 0; var366 < class198.field3141; var366++) {
                                    if (class53.field684[var366] == var353) {
                                        var364 = true;
                                        break label1506;
                                    }
                                }
                            } else {
                                var364 = true;
                            }
                        }
                        break;
                    }
                    if (class70.field867[var365] == var361) {
                        var364 = true;
                        break;
                    }
                    var365++;
                }
                if (!var364 && class251.field4093 == 0) {
                    class70.field867[class264.field4263] = var361;
                    class264.field4263 = (class264.field4263 + 1) % 100;
                    String var367 = class109.method683(class211.method1482(class118.method764((byte) -126, class96.field1283), -126));
                    if (var363 == 2 || var363 == 3) {
                        class110.method701(9, arg0 ^ 0x14, class145.method1013(var355, 31), "<img=1>" + class145.method1013(var353, 30), var367);
                    } else if (var363 == 1) {
                        class110.method701(9, -1, class145.method1013(var355, 126), "<img=0>" + class145.method1013(var353, 76), var367);
                    } else {
                        class110.method701(9, -1, class145.method1013(var355, 55), class145.method1013(var353, arg0 ^ 0xFFFFFF9D), var367);
                    }
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 189) {
                int var368 = class96.field1283.method548(117);
                int var369 = class96.field1283.method576(arg0 ^ 0x65);
                int var370 = class96.field1283.method586((byte) -81);
                if (class200.method1398((byte) 35, var368)) {
                    class3.method15(var370, -9166, var369);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 150) {
                int var371 = class96.field1283.method549(arg0 + 276);
                int var372 = class96.field1283.method577(arg0 + 18002);
                int var373 = class96.field1283.method597(-1197332568);
                int var374 = class96.field1283.method577(17981);
                if (class200.method1398((byte) 35, var371)) {
                    class296.method1983(var374, var373, 11474, var372);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 55) {
                class9.field106 = class96.field1283.method583(-1);
                class265.field4266 = class96.field1283.method563(arg0 ^ 0xFFFFFF14);
                while (class219.field3508 > class96.field1283.field1228) {
                    class152.field2363 = class96.field1283.method584(arg0 ^ 0xFFFFFF14);
                    class150.method1037((byte) -94);
                }
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 25) {
                int var375 = class96.field1283.method549(arg0 ^ 0xFFFFFF14);
                int var376 = class96.field1283.method552((byte) -96);
                class170.method1162(var375, var376, (byte) -97);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 251) {
                class104.method630((byte) 13);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 28) {
                int var377 = class96.field1283.method548(124);
                class88.method481(var377, 64);
                class7.field86[class173.method1186(class88.field1090++, 31)] = class173.method1186(var377, 32767);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 119) {
                class9.field106 = class96.field1283.method563(255);
                class265.field4266 = class96.field1283.method584(255);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 26) {
                class51.method296(class96.field1283, 116, class219.field3508, class194.field3107);
                class152.field2363 = -1;
                return true;
            } else if (class152.field2363 == 149) {
                class255.field4139 = class162.field2582;
                long var378 = class96.field1283.method556(false);
                if (var378 == 0L) {
                    class152.field2363 = -1;
                    class77.field965 = null;
                    class17.field203 = null;
                    class28.field404 = 0;
                    class15.field191 = null;
                    return true;
                }
                long var380 = class96.field1283.method556(false);
                class15.field191 = class124.method815(var380, (byte) -91);
                class77.field965 = class124.method815(var378, (byte) -49);
                class244.field3999 = class96.field1283.method587(arg0 + 140);
                int var382 = class96.field1283.method584(255);
                if (var382 == 255) {
                    class152.field2363 = -1;
                    return true;
                }
                class55[] var383 = new class55[100];
                class28.field404 = var382;
                for (int var384 = 0; var384 < class28.field404; var384++) {
                    var383[var384] = new class55();
                    var383[var384].field3923 = class96.field1283.method556(false);
                    var383[var384].field699 = class124.method815(var383[var384].field3923, (byte) -53);
                    var383[var384].field696 = class96.field1283.method549(arg0 + 276);
                    var383[var384].field698 = class96.field1283.method587(-10);
                    var383[var384].field706 = class96.field1283.method588(false);
                    if (class121.field1729 == var383[var384].field3923) {
                        class262.field4248 = var383[var384].field698;
                    }
                }
                boolean var385 = false;
                int var386 = class28.field404;
                while (var386 > 0) {
                    var386--;
                    boolean var387 = true;
                    for (int var388 = 0; var388 < var386; var388++) {
                        if (var383[var388].field699.compareTo(var383[var388 + 1].field699) > 0) {
                            var387 = false;
                            class55 var389 = var383[var388];
                            var383[var388] = var383[var388 + 1];
                            var383[var388 + 1] = var389;
                        }
                    }
                    if (var387) {
                        break;
                    }
                }
                class152.field2363 = -1;
                class17.field203 = var383;
                return true;
            } else if (class152.field2363 == 166) {
                int var390 = class96.field1283.method549(255);
                int var391 = class96.field1283.method579(arg0 ^ 0xFF00FFEB);
                int var392 = class96.field1283.method549(255);
                if (class200.method1398((byte) 35, var392)) {
                    class24.method140(var391, var390, 1);
                }
                class152.field2363 = -1;
                return true;
            } else {
                class30.method168((byte) -97, (Throwable) null, "T1 - " + class152.field2363 + "," + class200.field3167 + "," + class285.field4530 + " - " + class219.field3508);
                class144.method1008(arg0 ^ 0x22DC);
                return true;
            }
        }
    }
}
