import java.io.IOException;
import java.io.OutputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class158 extends OutputStream {

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "Loa;")
    private static class99 field2818 = class221.method1463(2844, "Discard");

    @OriginalMember(owner = "client!nf", name = "b", descriptor = "Loa;")
    public static class99 field2819 = field2818;

    @OriginalMember(owner = "client!nf", name = "g", descriptor = "I")
    public static int field2824 = 0;

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "[Loa;")
    public static class99[] field2822 = new class99[100];

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "I")
    public static int field2820;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "I")
    public static int field2821;

    @OriginalMember(owner = "client!nf", name = "f", descriptor = "I")
    public static int field2823;

    @OriginalMember(owner = "client!nf", name = "write", descriptor = "(I)V")
    public final void write(int arg0) throws IOException {
        field2823++;
        throw new IOException();
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(B)V")
    public static void method1081(byte arg0) {
        field2822 = null;
        if (arg0 <= -60) {
            field2818 = null;
            field2819 = null;
        }
    }

    @OriginalMember(owner = "client!nf", name = "a", descriptor = "(IIIIII[Ltf;III)V")
    public static final void method1082(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class107[] arg6, int arg7, int arg8, int arg9) {
        class68.method453(arg0, arg1, arg8, arg7);
        if (arg9 != -1338) {
            return;
        }
        class134.method900();
        field2820++;
        for (int var10 = 0; var10 < arg6.length; var10++) {
            class107 var11 = arg6[var10];
            if (var11 != null && (var11.field1801 == arg4 || arg4 == -1412584499 && class42.field717 == var11)) {
                int var12;
                if (arg3 == -1) {
                    class112.field2029[class227.field3928] = var11.field1921 + arg2;
                    class51.field848[class227.field3928] = var11.field1856 + arg5;
                    class94.field1584[class227.field3928] = var11.field1933;
                    class33.field581[class227.field3928] = var11.field1793;
                    var12 = class227.field3928++;
                } else {
                    var12 = arg3;
                }
                var11.field1913 = var12;
                var11.field1834 = class56.field926;
                if (!var11.field1915 || !client.method1058(var11)) {
                    if (var11.field1937 > 0) {
                        class119.method797(var11, -16960);
                    }
                    int var13 = var11.field1919;
                    int var14 = var11.field1856 + arg5;
                    int var15 = var11.field1921 + arg2;
                    if (class278.field4881 && (client.method1066(var11) != 0 || var11.field1814 == 0) && var13 > 127) {
                        var13 = 127;
                    }
                    if (class42.field717 == var11) {
                        if (arg4 != -1412584499 && !var11.field1822) {
                            class268.field4720 = arg5;
                            class270.field4761 = arg2;
                            class287.field5020 = arg6;
                            continue;
                        }
                        if (class220.field3823 && class260.field4537) {
                            int var16 = class172.field3054;
                            int var17 = var16 - class139.field2466;
                            int var18 = class38.field656;
                            int var19 = var18 - class90.field1537;
                            if (var17 < class76.field1354) {
                                var17 = class76.field1354;
                            }
                            if (class103.field1748 > var19) {
                                var19 = class103.field1748;
                            }
                            if (var11.field1933 + var17 > class76.field1354 - -class149.field2616.field1933) {
                                var17 = class76.field1354 + class149.field2616.field1933 - var11.field1933;
                            }
                            var15 = var17;
                            if ((var11.field1793 + var19) > (class103.field1748 + class149.field2616.field1793)) {
                                var19 = class103.field1748 + class149.field2616.field1793 - var11.field1793;
                            }
                            var14 = var19;
                        }
                        if (!var11.field1822) {
                            var13 = 128;
                        }
                    }
                    int var20;
                    int var22;
                    int var24;
                    int var25;
                    if (var11.field1814 == 2) {
                        var22 = arg0;
                        var24 = arg8;
                        var20 = arg1;
                        var25 = arg7;
                    } else {
                        var20 = var14 > arg1 ? var14 : arg1;
                        int var21 = var11.field1933 + var15;
                        var22 = var15 <= arg0 ? arg0 : var15;
                        int var23 = var11.field1793 + var14;
                        if (var11.field1814 == 9) {
                            var21++;
                            var23++;
                        }
                        var24 = var21 < arg8 ? var21 : arg8;
                        var25 = var23 < arg7 ? var23 : arg7;
                    }
                    if (!var11.field1915 || var22 < var24 && var20 < var25) {
                        if (var11.field1937 != 0) {
                            if (var11.field1937 == 1337) {
                                class269.field4724 = var15;
                                class30.field553 = var14;
                                class28.field532 = var11;
                                class280.method1843(var11.field1793, var15, var11.field1937 == 1403, (byte) -31, var11.field1933, var14);
                                class68.method453(arg0, arg1, arg8, arg7);
                                continue;
                            }
                            if (var11.field1937 == 1338) {
                                if (!var11.method740(0)) {
                                    continue;
                                }
                                class216.method1445(arg9 ^ 0x564C, var15, var11, var12, var14);
                                class68.method453(arg0, arg1, arg8, arg7);
                                if (class105.field1761 != 0 && class105.field1761 != 3 || class244.field4209 || var22 > class1.field10 || var20 > class20.field237 || var24 <= class1.field10 || var25 <= class20.field237) {
                                    continue;
                                }
                                int var26 = class1.field10 - var15;
                                int var27 = class20.field237 - var14;
                                int var28 = var11.field1930[var27];
                                if (var28 > var26 || (var11.field1858[var27] + var28) < var26) {
                                    continue;
                                }
                                int var29 = var26 - var11.field1933 / 2;
                                int var30 = var27 - var11.field1793 / 2;
                                int var31 = class239.field4129 + class124.field2178 & 0x7FF;
                                int var32 = class134.field2344[var31];
                                int var33 = (class260.field4542 + 256) * var32 >> 8;
                                int var34 = class134.field2339[var31];
                                int var35 = (class260.field4542 + 256) * var34 >> 8;
                                int var36 = var29 * var33 + var30 * var35 >> 11;
                                int var37 = var30 * var33 - var29 * var35 >> 11;
                                int var38 = class168.field3006.field1301 - var37 >> 7;
                                int var39 = class168.field3006.field1325 + var36 >> 7;
                                if (class54.field896 && (class33.field592 & 0x40) != 0) {
                                    class107 var40 = class127.method842((byte) -48, class239.field4132, class103.field1750);
                                    if (var40 == null) {
                                        class166.method1115(-50);
                                    } else {
                                        class173.method1163(class169.field3018, class63.field1061, var38, (short) 18, arg9 ^ 0xFFFFFA96, var39, 1L);
                                    }
                                    continue;
                                }
                                if (class34.field613 == 1) {
                                    class173.method1163(class119.field2107, class20.field234, var38, (short) 47, 95, var39, 1L);
                                }
                                class173.method1163(class44.field776, class20.field234, var38, (short) 33, 70, var39, 1L);
                                continue;
                            }
                            if (var11.field1937 == 1339) {
                                if (var11.method740(0)) {
                                    class53.method367(var15, (byte) -107, var12, var11, var14);
                                    class68.method453(arg0, arg1, arg8, arg7);
                                }
                                continue;
                            }
                            if (var11.field1937 == 1400) {
                                class38.method293((byte) -60, var15, var11.field1933, var11.field1793, var14);
                                class173.field3057[var12] = true;
                                class101.field1720[var12] = true;
                                class68.method453(arg0, arg1, arg8, arg7);
                                continue;
                            }
                            if (var11.field1937 == 1401) {
                                class106.method726((byte) -104, var11.field1793, var15, var14, var11.field1933);
                                class173.field3057[var12] = true;
                                class101.field1720[var12] = true;
                                class68.method453(arg0, arg1, arg8, arg7);
                                continue;
                            }
                            if (var11.field1937 == 1402) {
                                class77.method540(var14, 0, var15);
                                class173.field3057[var12] = true;
                                class101.field1720[var12] = true;
                                continue;
                            }
                            if (var11.field1937 == 1405) {
                                if (!class170.field3022) {
                                    continue;
                                }
                                int var41 = var11.field1933 + var15;
                                int var42 = var14 + 15;
                                class44.field768.method492(class198.method1332(123, new class99[] { class169.field3014, class198.method1333(arg9 ^ 0x56E, class194.field3409) }), var41, var42, 16776960, -1);
                                int var130 = var42 + 15;
                                Runtime var43 = Runtime.getRuntime();
                                int var44 = (int) ((var43.totalMemory() - var43.freeMemory()) / 1024L);
                                int var45 = 0;
                                int var46 = 0;
                                int var47 = 0;
                                int var48 = 16776960;
                                if (var44 > 65536) {
                                    var48 = 16711680;
                                }
                                class44.field768.method492(class198.method1332(arg9 + 1449, new class99[] { class111.field1991, class198.method1333(arg9 ^ 0x560, var44), class120.field2125 }), var41, var130, var48, -1);
                                var42 = var130 + 15;
                                int var49 = 16776960;
                                for (int var50 = 0; var50 < 28; var50++) {
                                    var46 += class127.field2216[var50].method1539(arg9 + 28953);
                                    var45 += class127.field2216[var50].method1534(-112);
                                    var47 += class127.field2216[var50].method1536(false);
                                }
                                int var51 = var47 * 100 / var46;
                                int var52 = var45 * 10000 / var46;
                                class99 var53 = class198.method1332(69, new class99[] { class108.field1959, class76.method537((long) var52, 2, true, (byte) -103, 0), class129.field2249, class198.method1333(arg9 + 1248, var51), class57.field941 });
                                class244.field4208.method492(var53, var41, var42, var49, -1);
                                var42 += 12;
                                if (class136.field2368 > 0) {
                                    class244.field4208.method492(class198.method1332(85, new class99[] { class151.field2654, class198.method1333(-93, class136.field2375), class28.field515, class198.method1333(-118, class136.field2368) }), var41, var42, var49, -1);
                                }
                                var42 += 12;
                                class173.field3057[var12] = true;
                                class101.field1720[var12] = true;
                                continue;
                            }
                            if (var11.field1937 == 1406) {
                                class128.field2241 = var15;
                                class226.field3916 = var11;
                                class54.field889 = var14;
                                continue;
                            }
                        }
                        if (!class244.field4209) {
                            if (var11.field1814 == 0 && var11.field1859 && var22 <= class1.field10 && class20.field237 >= var20 && class1.field10 < var24 && var25 > class20.field237 && !class278.field4881) {
                                class258.field4502[0] = 1006;
                                class219.field3812[0] = class59.field988;
                                class258.field4497 = 1;
                                class122.field2147[0] = class20.field234;
                            }
                            if (class1.field10 >= var22 && var20 <= class20.field237 && var24 > class1.field10 && var25 > class20.field237) {
                                class169.method1144(class20.field237 - var14, var11, class1.field10 - var15, false);
                            }
                        }
                        if (var11.field1814 == 0) {
                            if (!var11.field1915 && client.method1058(var11) && class192.field3382 != var11) {
                                continue;
                            }
                            if (!var11.field1915) {
                                if (var11.field1832 > var11.field1803 - var11.field1793) {
                                    var11.field1832 = var11.field1803 - var11.field1793;
                                }
                                if (var11.field1832 < 0) {
                                    var11.field1832 = 0;
                                }
                            }
                            method1082(var22, var20, var15 - var11.field1871, var12, var11.field1873, var14 - var11.field1832, arg6, var25, var24, -1338);
                            if (var11.field1837 != null) {
                                method1082(var22, var20, var15 - var11.field1871, var12, var11.field1873, var14 - var11.field1832, var11.field1837, var25, var24, -1338);
                            }
                            class2 var54 = (class2) class57.field959.method1550(true, (long) var11.field1873);
                            if (var54 != null) {
                                if (var54.field15 == 0 && !class244.field4209 && var22 <= class1.field10 && class20.field237 >= var20 && var24 > class1.field10 && class20.field237 < var25 && !class278.field4881) {
                                    class258.field4502[0] = 1006;
                                    class258.field4497 = 1;
                                    class219.field3812[0] = class59.field988;
                                    class122.field2147[0] = class20.field234;
                                }
                                class115.method776(var25, arg9 + 1227, var15, var20, var22, var54.field12, var14, var24, var12);
                            }
                            class68.method453(arg0, arg1, arg8, arg7);
                            class134.method900();
                        }
                        if (class182.field3177[var12] || class164.field2881 > 1) {
                            if (var11.field1814 == 0 && !var11.field1915 && var11.field1793 < var11.field1803) {
                                class181.method1217(var11.field1793, var11.field1832, var15 + var11.field1933, var11.field1803, var14, 20990);
                            }
                            if (var11.field1814 != 1) {
                                if (var11.field1814 == 2) {
                                    int var55 = 0;
                                    for (int var56 = 0; var56 < var11.field1936; var56++) {
                                        for (int var57 = 0; var57 < var11.field1825; var57++) {
                                            int var58 = var15 + ((var11.field1899 + 32) * var57);
                                            int var59 = (var11.field1836 + 32) * var56 + var14;
                                            if (var55 < 20) {
                                                var59 += var11.field1891[var55];
                                                var58 += var11.field1828[var55];
                                            }
                                            if (var11.field1805[var55] > 0) {
                                                boolean var60 = false;
                                                boolean var61 = false;
                                                int var62 = var11.field1805[var55] - 1;
                                                if ((var58 + 32) > arg0 && var58 < arg8 && arg1 < (var59 + 32) && arg7 > var59 || class289.field5058 == var11 && class204.field3545 == var55) {
                                                    class139 var63;
                                                    if (class150.field2647 == 1 && class19.field214 == var55 && class67.field1127 == var11.field1873) {
                                                        var63 = class197.method1328(var11.field1866, true, var62, var11.field1923[var55], 2, 0);
                                                    } else {
                                                        var63 = class197.method1328(var11.field1866, true, var62, var11.field1923[var55], 1, 3153952);
                                                    }
                                                    if (class134.field2351) {
                                                        class173.field3057[var12] = true;
                                                    }
                                                    if (var63 == null) {
                                                        class238.method1555(var11, 10555);
                                                    } else if (class289.field5058 == var11 && class204.field3545 == var55) {
                                                        int var64 = class172.field3054 - class218.field3798;
                                                        if (var64 < 5 && var64 > -5) {
                                                            var64 = 0;
                                                        }
                                                        int var65 = class38.field656 - class276.field4864;
                                                        if (var65 < 5 && var65 > -5) {
                                                            var65 = 0;
                                                        }
                                                        if (class95.field1601 < 5) {
                                                            var65 = 0;
                                                            var64 = 0;
                                                        }
                                                        var63.method29(var58 + var64, var59 + var65, 128);
                                                        if (arg4 != -1) {
                                                            class107 var66 = arg6[arg4 & 0xFFFF];
                                                            int var67 = class68.field1136;
                                                            int var68 = class68.field1138;
                                                            if (var67 > (var59 + var65) && var66.field1832 > 0) {
                                                                int var69 = (var67 - var65 - var59) * class224.field3889 / 3;
                                                                if ((class224.field3889 * 10) < var69) {
                                                                    var69 = class224.field3889 * 10;
                                                                }
                                                                if (var69 > var66.field1832) {
                                                                    var69 = var66.field1832;
                                                                }
                                                                class276.field4864 += var69;
                                                                var66.field1832 -= var69;
                                                                class238.method1555(var66, 10555);
                                                            }
                                                            if (var59 + var65 + 32 > var68 && var66.field1832 < var66.field1803 - var66.field1793) {
                                                                int var70 = (var59 + var65 + 32 - var68) * class224.field3889 / 3;
                                                                if (class224.field3889 * 10 < var70) {
                                                                    var70 = class224.field3889 * 10;
                                                                }
                                                                if ((var66.field1803 - var66.field1793 - var66.field1832) < var70) {
                                                                    var70 = var66.field1803 - var66.field1793 - var66.field1832;
                                                                }
                                                                class276.field4864 -= var70;
                                                                var66.field1832 += var70;
                                                                class238.method1555(var66, 10555);
                                                            }
                                                        }
                                                    } else if (class238.field4116 == var11 && class138.field2432 == var55) {
                                                        var63.method29(var58, var59, 128);
                                                    } else {
                                                        var63.method38(var58, var59);
                                                    }
                                                }
                                            } else if (var11.field1926 != null && var55 < 20) {
                                                class139 var71 = var11.method734(var55, 116);
                                                if (var71 != null) {
                                                    var71.method38(var58, var59);
                                                } else if (class257.field4458) {
                                                    class238.method1555(var11, 10555);
                                                }
                                            }
                                            var55++;
                                        }
                                    }
                                } else if (var11.field1814 == 3) {
                                    int var72;
                                    if (class156.method1068(var11, (byte) 15)) {
                                        var72 = var11.field1850;
                                        if (class192.field3382 == var11 && var11.field1872 != 0) {
                                            var72 = var11.field1872;
                                        }
                                    } else {
                                        var72 = var11.field1881;
                                        if (class192.field3382 == var11 && var11.field1831 != 0) {
                                            var72 = var11.field1831;
                                        }
                                    }
                                    if (var13 == 0) {
                                        if (var11.field1833) {
                                            class68.method465(var15, var14, var11.field1933, var11.field1793, var72);
                                        } else {
                                            class68.method447(var15, var14, var11.field1933, var11.field1793, var72);
                                        }
                                    } else if (var11.field1833) {
                                        class68.method455(var15, var14, var11.field1933, var11.field1793, var72, 256 - (var13 & 0xFF));
                                    } else {
                                        class68.method466(var15, var14, var11.field1933, var11.field1793, var72, 256 - (var13 & 0xFF));
                                    }
                                } else if (var11.field1814 == 4) {
                                    class70 var73 = var11.method735((byte) 29, class95.field1607);
                                    if (var73 != null) {
                                        class99 var74 = var11.field1847;
                                        int var75;
                                        if (class156.method1068(var11, (byte) 15)) {
                                            var75 = var11.field1850;
                                            if (class192.field3382 == var11 && var11.field1872 != 0) {
                                                var75 = var11.field1872;
                                            }
                                            if (var11.field1797.method659(-105) > 0) {
                                                var74 = var11.field1797;
                                            }
                                        } else {
                                            var75 = var11.field1881;
                                            if (class192.field3382 == var11 && var11.field1831 != 0) {
                                                var75 = var11.field1831;
                                            }
                                        }
                                        if (var11.field1915 && var11.field1789 != -1) {
                                            class166 var76 = class222.method1468(1, var11.field1789);
                                            var74 = var76.field2963;
                                            if (var74 == null) {
                                                var74 = class36.field629;
                                            }
                                            if ((var76.field2920 == 1 || var11.field1877 != 1) && var11.field1877 != -1) {
                                                var74 = class198.method1332(arg9 ^ 0xFFFFFAF0, new class99[] { class257.field4454, var74, class23.field318, class106.method727(var11.field1877, -30468) });
                                            }
                                        }
                                        if (class137.field2411 == var11) {
                                            var74 = class232.field4017;
                                            var75 = var11.field1881;
                                        }
                                        if (!var11.field1915) {
                                            var74 = class25.method187(var74, var11, 0);
                                        }
                                        var73.method473(var74, var15, var14, var11.field1933, var11.field1793, var75, var11.field1898 ? 0 : -1, var11.field1794, var11.field1845, var11.field1829);
                                    } else if (class257.field4458) {
                                        class238.method1555(var11, 10555);
                                    }
                                } else if (var11.field1814 == 5) {
                                    if (var11.field1915) {
                                        class139 var78;
                                        if (var11.field1789 == -1) {
                                            var78 = var11.method741(false, true);
                                        } else {
                                            var78 = class197.method1328(var11.field1866, true, var11.field1789, var11.field1877, var11.field1908, var11.field1815);
                                        }
                                        if (var78 != null) {
                                            int var79 = var78.field2456;
                                            int var80 = var78.field2459;
                                            if (var11.field1895) {
                                                int var81 = (var79 + var11.field1933 - 1) / var79;
                                                int var82 = (var80 + var11.field1793 - 1) / var80;
                                                class68.method463(var15, var14, var11.field1933 + var15, var11.field1793 + var14);
                                                for (int var83 = 0; var83 < var81; var83++) {
                                                    for (int var84 = 0; var84 < var82; var84++) {
                                                        if (var11.field1935 != 0) {
                                                            var78.method947(var11.field1935, arg9 + 1353, var79 / 2 + var79 * var83 + var15, 4096, var80 * var84 + (var14 + (var80 / 2)));
                                                        } else if (var13 == 0) {
                                                            var78.method38(var79 * var83 + var15, var80 * var84 + var14);
                                                        } else {
                                                            var78.method29(var15 + (var79 * var83), var14 - -(var80 * var84), 256 - (var13 & 0xFF));
                                                        }
                                                    }
                                                }
                                                class68.method453(arg0, arg1, arg8, arg7);
                                            } else {
                                                int var85 = var11.field1933 * 4096 / var79;
                                                if (var11.field1935 != 0) {
                                                    var78.method947(var11.field1935, 15, var11.field1933 / 2 + var15, var85, var11.field1793 / 2 + var14);
                                                } else if (var13 != 0) {
                                                    var78.method26(var15, var14, var11.field1933, var11.field1793, 256 - (var13 & 0xFF));
                                                } else if (var11.field1933 == var79 && var11.field1793 == var80) {
                                                    var78.method38(var15, var14);
                                                } else {
                                                    var78.method30(var15, var14, var11.field1933, var11.field1793);
                                                }
                                            }
                                        } else if (class257.field4458) {
                                            class238.method1555(var11, 10555);
                                        }
                                    } else {
                                        class139 var77 = var11.method741(class156.method1068(var11, (byte) 15), true);
                                        if (var77 != null) {
                                            var77.method38(var15, var14);
                                        } else if (class257.field4458) {
                                            class238.method1555(var11, 10555);
                                        }
                                    }
                                } else if (var11.field1814 == 6) {
                                    boolean var86 = class156.method1068(var11, (byte) 15);
                                    int var87;
                                    if (var86) {
                                        var87 = var11.field1843;
                                    } else {
                                        var87 = var11.field1928;
                                    }
                                    int var88 = 0;
                                    class195 var89 = null;
                                    if (var11.field1789 != -1) {
                                        class166 var90 = class222.method1468(1, var11.field1789);
                                        if (var90 != null) {
                                            class166 var91 = var90.method1126(var11.field1877, -127);
                                            class270 var92 = var87 == -1 ? null : class38.method297(132, var87);
                                            var89 = var91.method1117(-30191, 1, var92, var11.field1911);
                                            if (var89 == null) {
                                                class238.method1555(var11, 10555);
                                            } else {
                                                var88 = -var89.method226() / 2;
                                            }
                                        }
                                    } else if (var11.field1851 == 5) {
                                        if (var11.field1939 == -1) {
                                            var89 = class18.field186.method239(114, (class270) null, -1, true, -1, (class270) null);
                                        } else {
                                            int var94 = var11.field1939 & 0x7FF;
                                            if (class167.field2980 == var94) {
                                                var94 = 2047;
                                            }
                                            class183 var95 = class259.field4515[var94];
                                            class270 var96 = var87 == -1 ? null : class38.method297(arg9 + 1470, var87);
                                            if (var95 != null && ((int) var95.field3224.method697(-23666) << 11) == (var11.field1939 & 0xFFFFF800)) {
                                                var89 = var95.field3250.method239(62, var96, 0, true, var11.field1911, (class270) null);
                                            }
                                        }
                                    } else if (var87 == -1) {
                                        var89 = var11.method744((byte) 58, -1, (class270) null, class168.field3006.field3250, var86);
                                        if (var89 == null && class257.field4458) {
                                            class238.method1555(var11, 10555);
                                        }
                                    } else {
                                        class270 var93 = class38.method297(132, var87);
                                        var89 = var11.method744((byte) 54, var11.field1911, var93, class168.field3006.field3250, var86);
                                        if (var89 == null && class257.field4458) {
                                            class238.method1555(var11, 10555);
                                        }
                                    }
                                    if (var89 != null) {
                                        int var97;
                                        if (var11.field1880 > 0) {
                                            var97 = (var11.field1793 << 8) / var11.field1880;
                                        } else {
                                            var97 = 256;
                                        }
                                        int var98;
                                        if (var11.field1816 > 0) {
                                            var98 = (var11.field1933 << 8) / var11.field1816;
                                        } else {
                                            var98 = 256;
                                        }
                                        int var99 = (var11.field1862 * var98 >> 8) + var11.field1933 / 2 + var15;
                                        int var100 = (var11.field1941 * var97 >> 8) + var11.field1793 / 2 + var14;
                                        class134.method909(var99, var100);
                                        int var101 = class134.field2339[var11.field1788] * var11.field1867 >> 16;
                                        int var102 = class134.field2344[var11.field1788] * var11.field1867 >> 16;
                                        if (!var11.field1915) {
                                            var89.method223(0, var11.field1781, 0, var11.field1788, 0, var101, var102, -1L);
                                        } else if (var11.field1838) {
                                            ((class27) var89).method206(0, var11.field1781, var11.field1917, var11.field1788, var11.field1804, var88 + var101 + var11.field1942, var102 - -var11.field1942, var11.field1867);
                                        } else {
                                            var89.method223(0, var11.field1781, var11.field1917, var11.field1788, var11.field1804, var11.field1942 + var101 + var88, var102 - -var11.field1942, -1L);
                                        }
                                        class134.method903();
                                    }
                                } else {
                                    if (var11.field1814 == 7) {
                                        class70 var103 = var11.method735((byte) 29, class95.field1607);
                                        if (var103 == null) {
                                            if (class257.field4458) {
                                                class238.method1555(var11, 10555);
                                            }
                                            continue;
                                        }
                                        int var104 = 0;
                                        for (int var105 = 0; var105 < var11.field1936; var105++) {
                                            for (int var106 = 0; var106 < var11.field1825; var106++) {
                                                if (var11.field1805[var104] > 0) {
                                                    class166 var107 = class222.method1468(1, var11.field1805[var104] - 1);
                                                    class99 var108;
                                                    if (var107.field2920 != 1 && var11.field1923[var104] == 1) {
                                                        var108 = class198.method1332(arg9 ^ 0xFFFFFA8D, new class99[] { class257.field4454, var107.field2963, class69.field1145 });
                                                    } else {
                                                        var108 = class198.method1332(126, new class99[] { class257.field4454, var107.field2963, class23.field318, class106.method727(var11.field1923[var104], -30468) });
                                                    }
                                                    int var109 = (var11.field1836 + 12) * var105 + var14;
                                                    int var110 = (var11.field1899 + 115) * var106 + var15;
                                                    if (var11.field1794 == 0) {
                                                        var103.method487(var108, var110, var109, var11.field1881, var11.field1898 ? 0 : -1);
                                                    } else if (var11.field1794 == 1) {
                                                        var103.method481(var108, var110 + 57, var109, var11.field1881, var11.field1898 ? 0 : -1);
                                                    } else {
                                                        var103.method492(var108, var110 + 115 - 1, var109, var11.field1881, var11.field1898 ? 0 : -1);
                                                    }
                                                }
                                                var104++;
                                            }
                                        }
                                    }
                                    if (var11.field1814 == 8 && class277.field4870 == var11 && class9.field70 == class202.field3522) {
                                        int var111 = 0;
                                        int var112 = 0;
                                        class70 var113 = class44.field768;
                                        class99 var114 = var11.field1847;
                                        class99 var115 = class25.method187(var114, var11, 0);
                                        while (var115.method659(arg9 ^ 0x575) > 0) {
                                            int var123 = var115.method702(9596, class271.field4785);
                                            class99 var124;
                                            if (var123 == -1) {
                                                var124 = var115;
                                                var115 = class20.field234;
                                            } else {
                                                var124 = var115.method693(var123, arg9 ^ 0xFFFFFA39, 0);
                                                var115 = var115.method680((byte) 89, var123 + 4);
                                            }
                                            int var125 = var113.method480(var124);
                                            var112 += var113.field1173 + 1;
                                            if (var125 > var111) {
                                                var111 = var125;
                                            }
                                        }
                                        var112 += 7;
                                        int var116 = var11.field1793 + var14 + 5;
                                        if (arg7 < (var112 + var116)) {
                                            var116 = arg7 - var112;
                                        }
                                        var111 += 6;
                                        int var117 = var11.field1933 + var15 - var111 - 5;
                                        if (var117 < var15 + 5) {
                                            var117 = var15 + 5;
                                        }
                                        if (var111 + var117 > arg8) {
                                            var117 = arg8 - var111;
                                        }
                                        class68.method465(var117, var116, var111, var112, 16777120);
                                        class68.method447(var117, var116, var111, var112, 0);
                                        int var118 = var116 + var113.field1173 + 2;
                                        class99 var119 = var11.field1847;
                                        class99 var120 = class25.method187(var119, var11, arg9 + 1338);
                                        while (var120.method659(103) > 0) {
                                            int var121 = var120.method702(9596, class271.field4785);
                                            class99 var122;
                                            if (var121 == -1) {
                                                var122 = var120;
                                                var120 = class20.field234;
                                            } else {
                                                var122 = var120.method693(var121, 255, 0);
                                                var120 = var120.method680((byte) 121, var121 + 4);
                                            }
                                            var113.method487(var122, var117 + 3, var118, 0, -1);
                                            var118 += var113.field1173 + 1;
                                        }
                                    }
                                    if (var11.field1814 == 9) {
                                        int var126;
                                        int var127;
                                        int var128;
                                        int var129;
                                        if (var11.field1848) {
                                            var126 = var11.field1793 + var14;
                                            var127 = var15;
                                            var128 = var11.field1933 + var15;
                                            var129 = var14;
                                        } else {
                                            var126 = var14;
                                            var127 = var15;
                                            var128 = var15 + var11.field1933;
                                            var129 = var11.field1793 + var14;
                                        }
                                        if (var11.field1844 == 1) {
                                            class68.method452(var127, var126, var128, var129, var11.field1881);
                                        } else {
                                            class68.method461(var127, var126, var128, var129, var11.field1881, var11.field1844);
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
}
