import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class53 extends class76 {

    @OriginalMember(owner = "client!dk", name = "ib", descriptor = "I")
    private int field1148 = 4096;

    @OriginalMember(owner = "client!dk", name = "jb", descriptor = "I")
    private int field1149 = 0;

    @OriginalMember(owner = "client!dk", name = "db", descriptor = "I")
    private int field1143 = 0;

    @OriginalMember(owner = "client!dk", name = "fb", descriptor = "I")
    private int field1145 = 2048;

    @OriginalMember(owner = "client!dk", name = "cb", descriptor = "I")
    private int field1142 = 2048;

    @OriginalMember(owner = "client!dk", name = "Y", descriptor = "I")
    private int field1138 = 8192;

    @OriginalMember(owner = "client!dk", name = "ob", descriptor = "I")
    private int field1154 = 12288;

    @OriginalMember(owner = "client!dk", name = "gb", descriptor = "[I")
    public static int[] field1146 = new int[100];

    @OriginalMember(owner = "client!dk", name = "qb", descriptor = "[I")
    public static int[] field1156 = new int[25];

    @OriginalMember(owner = "client!dk", name = "ab", descriptor = "Lia;")
    public static class257 field1140 = class28.method234(-124, "headicons_prayer");

    @OriginalMember(owner = "client!dk", name = "Z", descriptor = "I")
    public static int field1139;

    @OriginalMember(owner = "client!dk", name = "bb", descriptor = "I")
    public static int field1141;

    @OriginalMember(owner = "client!dk", name = "eb", descriptor = "I")
    public static int field1144;

    @OriginalMember(owner = "client!dk", name = "hb", descriptor = "I")
    public static int field1147;

    @OriginalMember(owner = "client!dk", name = "kb", descriptor = "I")
    public static int field1150;

    @OriginalMember(owner = "client!dk", name = "lb", descriptor = "I")
    public static int field1151;

    @OriginalMember(owner = "client!dk", name = "mb", descriptor = "I")
    public static int field1152;

    @OriginalMember(owner = "client!dk", name = "nb", descriptor = "I")
    public static int field1153;

    @OriginalMember(owner = "client!dk", name = "pb", descriptor = "I")
    public static int field1155;

    @OriginalMember(owner = "client!dk", name = "rb", descriptor = "I")
    public static int field1157;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lk;BI)V")
    public final void method158(class152 arg0, byte arg1, int arg2) {
        ++field1139;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1138 = arg0.method1063(-17162);
                                }
                            } else {
                                this.field1148 = arg0.method1063(-17162);
                            }
                        } else {
                            this.field1154 = arg0.method1063(-17162);
                        }
                    } else {
                        this.field1142 = arg0.method1063(-17162);
                    }
                } else {
                    this.field1143 = arg0.method1063(-17162);
                }
            } else {
                this.field1149 = arg0.method1063(-17162);
            }
        } else {
            this.field1145 = arg0.method1063(-17162);
        }
        if (arg1 > -86) {
            this.method405(123, 85, -122);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(III)Z")
    private final boolean method405(int arg0, int arg1, int arg2) {
        ++field1153;
        int var4 = (arg0 + arg2) * this.field1154 >> 12;
        int var5 = class106.field1962[(1048304 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1154;
        int var7 = (var6 << 12) / this.field1138;
        int var8 = this.field1148 * var7 >> 12;
        if (arg1 != -1) {
            this.method405(-17, 53, 89);
        }
        return ~var8 < ~(-arg2 + arg0) && -arg2 + arg0 > -var8;
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(B)Z")
    public static final boolean method406(byte arg0) throws IOException {
        ++field1150;
        if (class151.field2595 == null) {
            return false;
        } else {
            int var1 = class151.field2595.method1423((byte) 56);
            if (var1 == 0) {
                return false;
            } else {
                if (class115.field2066 == -1) {
                    class151.field2595.method1424(class40.field827.field2638, 0, 1, (byte) -90);
                    --var1;
                    class40.field827.field2677 = 0;
                    class115.field2066 = class40.field827.method914(false);
                    class209.field3582 = class143.field2509[class115.field2066];
                }
                if (~class209.field3582 == 0) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    --var1;
                    class151.field2595.method1424(class40.field827.field2638, 0, 1, (byte) -79);
                    class209.field3582 = 255 & class40.field827.field2638[0];
                }
                if (~class209.field3582 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    class151.field2595.method1424(class40.field827.field2638, 0, 2, (byte) -112);
                    class40.field827.field2677 = 0;
                    var1 -= 2;
                    class209.field3582 = class40.field827.method1063(arg0 ^ 17254);
                }
                if (var1 < class209.field3582) {
                    return false;
                } else {
                    class40.field827.field2677 = 0;
                    class151.field2595.method1424(class40.field827.field2638, 0, class209.field3582, (byte) -104);
                    class71.field1400 = class45.field1043;
                    class45.field1043 = class201.field3449;
                    class201.field3449 = class115.field2066;
                    class87.field1694 = 0;
                    if (class115.field2066 == 20) {
                        int var2 = class40.field827.method1063(-17162);
                        int var3 = class40.field827.method1042(arg0 + 230);
                        class120.method849(var2, var3, arg0 + 192);
                        class115.field2066 = -1;
                        return true;
                    } else if (~class115.field2066 == -137) {
                        int var4 = class40.field827.method1027(arg0 ^ -24);
                        class75.field1455 = class72.field1404.method717((byte) -27, var4);
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 79) {
                        class115.field2066 = -1;
                        class132.field2369 = 0;
                        return true;
                    } else if (~class115.field2066 == -90) {
                        int var5 = class40.field827.method1022(arg0 + 111);
                        class44 var6 = class221.method1456(var5, (byte) -80);
                        for (int var7 = 0; ~var6.field929.length < ~var7; ++var7) {
                            var6.field929[var7] = -1;
                            var6.field929[var7] = 0;
                        }
                        class257.method1718(false, var6);
                        class115.field2066 = -1;
                        return true;
                    } else if (~class115.field2066 == -8) {
                        int var8 = class40.field827.method1075(-7903);
                        int var9 = class40.field827.method1062(-1);
                        int var10 = class40.field827.method1075(-7903);
                        class44 var11 = class221.method1456(var9, (byte) -68);
                        var11.field928 = var11.field877 = var8;
                        var11.field918 = 0;
                        var11.field931 = 0;
                        var11.field1025 = var11.field979 = var10;
                        class257.method1718(false, var11);
                        class115.field2066 = -1;
                        return true;
                    } else if (~class115.field2066 == -201) {
                        class177.method1191(124);
                        class255.field4365 = class40.field827.method1075(arg0 + -7791);
                        class115.field2066 = -1;
                        class145.field2541 = class111.field2038;
                        return true;
                    } else if (~class115.field2066 == -173) {
                        int var12 = class40.field827.method1062(-1);
                        int var13 = class40.field827.method1052(false);
                        class44 var14 = class221.method1456(var12, (byte) -28);
                        if (var14 != null && var14.field871 == 0) {
                            if (var14.field947 - var14.field981 < var13) {
                                var13 = var14.field947 - var14.field981;
                            }
                            if (var13 < 0) {
                                var13 = 0;
                            }
                            if (~var14.field873 != ~var13) {
                                var14.field873 = var13;
                                class257.method1718(false, var14);
                            }
                        }
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 44) {
                        int var15 = class209.field3582 + class40.field827.field2677;
                        int var16 = class40.field827.method1063(-17162);
                        int var17 = class40.field827.method1063(arg0 ^ 17254);
                        if (class5.field114 != var16) {
                            class5.field114 = var16;
                            class248.method1626(class5.field114, (byte) 121);
                            class231.method1509(arg0 + 111, false);
                            class30.method250(class5.field114, 0);
                            for (int var18 = 0; var18 < 100; ++var18) {
                                class137.field2456[var18] = true;
                            }
                        }
                        while (var17-- > 0) {
                            int var27 = class40.field827.method1042(116);
                            int var28 = class40.field827.method1063(-17162);
                            int var29 = class40.field827.method1051((byte) 102);
                            class157 var30 = (class157) class136.field2426.method434((byte) -93, (long) var27);
                            if (var30 != null && ~var30.field2746 != ~var28) {
                                class201.method1350(true, 2097151, var30);
                                var30 = null;
                            }
                            if (var30 == null) {
                                var30 = class178.method1206(var29, var27, (byte) 116, var28);
                            }
                            var30.field2754 = true;
                        }
                        for (class157 var19 = (class157) class136.field2426.method427((byte) 58); var19 != null; var19 = (class157) class136.field2426.method428(false)) {
                            if (var19.field2754) {
                                var19.field2754 = false;
                            } else {
                                class201.method1350(true, 2097151, var19);
                            }
                        }
                        class137.field2448.method431(12747);
                        while (~class40.field827.field2677 > ~var15) {
                            int var20 = class40.field827.method1042(127);
                            int var21 = class40.field827.method1063(arg0 + -17050);
                            int var22 = class40.field827.method1063(-17162);
                            int var23 = class40.field827.method1042(126);
                            for (int var24 = var21; var22 >= var24; ++var24) {
                                long var25 = ((long) var20 << 32) + (long) var24;
                                class137.field2448.method424(new class220(var23), (byte) -40, var25);
                            }
                        }
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 174) {
                        long var31 = class40.field827.method1049(127);
                        int var33 = class40.field827.method1063(arg0 ^ 17254);
                        class257 var34 = class38.method307(32768, var33).method1382(0, class40.field827);
                        class115.method823(var33, class199.method1334((byte) -126, var31).method1717(arg0 ^ 5), 19, var34, -111, (class257) null);
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 28) {
                        int var35 = class40.field827.method1041((byte) 127);
                        int var36 = class40.field827.method1041((byte) 125);
                        class243.field4212 = var35;
                        class25.field479 = var36;
                        class71.method534(383);
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 59) {
                        int var37 = class40.field827.method1052(false);
                        int var38 = class40.field827.method1021((byte) 43);
                        int var39 = class40.field827.method1063(-17162);
                        class160.method1115(0, var37);
                        class125.method868(var39, arg0 ^ -63, var38);
                        class115.field2066 = -1;
                        return true;
                    } else if (~class115.field2066 == -146) {
                        class197.field3329 = class40.field827.method1051((byte) 83);
                        class172.field2946 = class40.field827.method1051((byte) 123);
                        class45.field1041 = class40.field827.method1051((byte) 111);
                        class115.field2066 = -1;
                        return true;
                    } else if (~class115.field2066 == -151) {
                        int var40 = class40.field827.method1063(arg0 ^ 17254);
                        int var41 = class40.field827.method1063(-17162);
                        int var42 = class40.field827.method1063(-17162);
                        int var43 = class40.field827.method1042(122);
                        if (var43 >> 30 != 0) {
                            int var44 = 3 & var43 >> 28;
                            int var45 = (var43 & 16383) + -class231.field3878;
                            int var46 = ((var43 & 268431394) >> 14) + -class244.field4232;
                            if (~var46 <= -1 && ~var45 <= -1 && var46 < 104 && ~var45 > -105) {
                                int var47 = var46 * 128 + 64;
                                int var48 = var45 * 128 + 64;
                                class74 var49 = new class74(var41, var44, var47, var48, -var40 + class109.method803(var44, var48, (byte) -55, var47), var42, class7.field153);
                                class245.field4257.method287(new class118(var49), 0);
                            }
                        } else if (var43 >> 29 != 0) {
                            int var50 = 65535 & var43;
                            class197 var51 = class92.field1758[var50];
                            if (var51 != null) {
                                var51.field4150 = 0;
                                var51.field4186 = class7.field153 + var42;
                                var51.field4181 = 0;
                                var51.field4156 = var40;
                                var51.field4172 = var41;
                                if (~var51.field4186 < ~class7.field153) {
                                    var51.field4150 = -1;
                                }
                                if (~var51.field4172 == -65536) {
                                    var51.field4172 = -1;
                                }
                            }
                        } else if (var43 >> 28 != 0) {
                            int var52 = var43 & 65535;
                            class180 var53;
                            if (class173.field2958 == var52) {
                                var53 = class137.field2441;
                            } else {
                                var53 = class55.field1180[var52];
                            }
                            if (var53 != null) {
                                var53.field4186 = class7.field153 + var42;
                                var53.field4156 = var40;
                                var53.field4181 = 0;
                                var53.field4172 = var41;
                                if (var53.field4172 == 65535) {
                                    var53.field4172 = -1;
                                }
                                var53.field4150 = 0;
                                if (var53.field4186 > class7.field153) {
                                    var53.field4150 = -1;
                                }
                            }
                        }
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 39) {
                        class257 var54 = class40.field827.method1039(1995);
                        if (var54.method1685(class219.field3705, 0)) {
                            class257 var55 = var54.method1713(48, 0, var54.method1683(false, class195.field3306));
                            long var56 = var55.method1668(-29);
                            boolean var58 = false;
                            for (int var59 = 0; var59 < class185.field3215; ++var59) {
                                if (class175.field2981[var59] == var56) {
                                    var58 = true;
                                    break;
                                }
                            }
                            if (!var58 && ~class226.field3800 == -1) {
                                class197.method1317(arg0 ^ 117, 4, class89.field1714, var55);
                            }
                        } else if (var54.method1685(class72.field1407, 0)) {
                            class257 var60 = var54.method1713(arg0 + 160, 0, var54.method1683(false, class195.field3306));
                            long var61 = var60.method1668(arg0 ^ 44);
                            boolean var63 = false;
                            for (int var64 = 0; class185.field3215 > var64; ++var64) {
                                if (class175.field2981[var64] == var61) {
                                    var63 = true;
                                    break;
                                }
                            }
                            if (!var63 && ~class226.field3800 == -1) {
                                class257 var65 = var54.method1713(arg0 + 160, 1 + var54.method1683(false, class195.field3306), -9 + var54.method1679((byte) 80));
                                class197.method1317(-102, 8, var65, var60);
                            }
                        } else if (var54.method1685(class99.field1831, arg0 ^ -112)) {
                            class257 var66 = var54.method1713(48, 0, var54.method1683(false, class195.field3306));
                            long var67 = var66.method1668(113);
                            boolean var69 = false;
                            for (int var70 = 0; ~class185.field3215 < ~var70; ++var70) {
                                if (class175.field2981[var70] == var67) {
                                    var69 = true;
                                    break;
                                }
                            }
                            if (!var69 && class226.field3800 == 0) {
                                class197.method1317(-98, 10, class17.field378, var66);
                            }
                        } else if (var54.method1685(class121.field2182, 0)) {
                            class257 var71 = var54.method1713(48, 0, var54.method1683(false, class121.field2182));
                            class197.method1317(arg0 ^ 38, 11, var71, class17.field378);
                        } else if (var54.method1685(class257.field4455, 0)) {
                            class257 var72 = var54.method1713(arg0 + 160, 0, var54.method1683(false, class257.field4455));
                            if (class226.field3800 == 0) {
                                class197.method1317(arg0 + 3, 12, var72, class17.field378);
                            }
                        } else if (var54.method1685(class215.field3659, 0)) {
                            class257 var73 = var54.method1713(arg0 ^ -96, 0, var54.method1683(false, class215.field3659));
                            if (class226.field3800 == 0) {
                                class197.method1317(-68, 13, var73, class17.field378);
                            }
                        } else if (var54.method1685(class224.field3762, 0)) {
                            class257 var74 = var54.method1713(48, 0, var54.method1683(false, class195.field3306));
                            long var75 = var74.method1668(-36);
                            boolean var77 = false;
                            for (int var78 = 0; ~class185.field3215 < ~var78; ++var78) {
                                if (~class175.field2981[var78] == ~var75) {
                                    var77 = true;
                                    break;
                                }
                            }
                            if (!var77 && ~class226.field3800 == -1) {
                                class197.method1317(-92, 14, class17.field378, var74);
                            }
                        } else if (var54.method1685(class38.field763, 0)) {
                            class257 var79 = var54.method1713(48, 0, var54.method1683(false, class195.field3306));
                            boolean var80 = false;
                            long var81 = var79.method1668(arg0 + 56);
                            for (int var83 = 0; class185.field3215 > var83; ++var83) {
                                if (class175.field2981[var83] == var81) {
                                    var80 = true;
                                    break;
                                }
                            }
                            if (!var80 && ~class226.field3800 == -1) {
                                class197.method1317(-28, 15, class17.field378, var79);
                            }
                        } else if (!var54.method1685(class212.field3636, arg0 + 112)) {
                            class197.method1317(-117, 0, var54, class17.field378);
                        } else {
                            boolean var84 = false;
                            class257 var85 = var54.method1713(48, 0, var54.method1683(false, class195.field3306));
                            long var86 = var85.method1668(124);
                            for (int var88 = 0; class185.field3215 > var88; ++var88) {
                                if (class175.field2981[var88] == var86) {
                                    var84 = true;
                                    break;
                                }
                            }
                            if (!var84 && class226.field3800 == 0) {
                                class197.method1317(-70, 16, class17.field378, var85);
                            }
                        }
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 167) {
                        class166.field2900 = 30 * class40.field827.method1067(515473640);
                        class115.field2066 = -1;
                        class145.field2541 = class111.field2038;
                        return true;
                    } else if (class115.field2066 == 228) {
                        class152.method1034(false);
                        class115.field2066 = -1;
                        return true;
                    } else if (class115.field2066 == 127) {
                        long var89 = class40.field827.method1049(arg0 + 238);
                        long var91 = (long) class40.field827.method1063(-17162);
                        boolean var93 = false;
                        long var94 = (long) class40.field827.method1064((byte) -109);
                        int var96 = class40.field827.method1051((byte) -38);
                        long var97 = (var91 << 32) + var94;
                        int var99 = class40.field827.method1063(-17162);
                        int var100 = 0;
                        label1114: while (true) {
                            if (var100 >= 100) {
                                if (~var96 >= -2) {
                                    for (int var101 = 0; ~class185.field3215 < ~var101; ++var101) {
                                        if (~class175.field2981[var101] == ~var89) {
                                            var93 = true;
                                            break label1114;
                                        }
                                    }
                                }
                                break;
                            }
                            if (class206.field3531[var100] == var97) {
                                var93 = true;
                                break;
                            }
                            ++var100;
                        }
                        if (!var93 && ~class226.field3800 == -1) {
                            class206.field3531[class138.field2469] = var97;
                            class138.field2469 = (class138.field2469 + 1) % 100;
                            class257 var102 = class38.method307(32768, var99).method1382(arg0 + 112, class40.field827);
                            if (var96 != 2) {
                                if (~var96 == -2) {
                                    class115.method823(var99, class233.method1528(new class257[] { class173.field2963, class199.method1334((byte) -84, var89).method1717(-99) }, 0), 18, var102, 44, (class257) null);
                                } else {
                                    class115.method823(var99, class199.method1334((byte) -120, var89).method1717(arg0 ^ 28), 18, var102, arg0 + 197, (class257) null);
                                }
                            } else {
                                class115.method823(var99, class233.method1528(new class257[] { class72.field1412, class199.method1334((byte) -126, var89).method1717(-113) }, arg0 + 112), 18, var102, 88, (class257) null);
                            }
                        }
                        class115.field2066 = -1;
                        return true;
                    } else {
                        if (arg0 != -112) {
                            field1146 = null;
                        }
                        if (~class115.field2066 == -105) {
                            int var103 = class40.field827.method1051((byte) -45);
                            if (~class40.field827.method1051((byte) 91) != -1) {
                                --class40.field827.field2677;
                                class34.field674[var103] = new class210(class40.field827);
                            } else {
                                class34.field674[var103] = new class210();
                            }
                            class115.field2066 = -1;
                            class151.field2603 = class111.field2038;
                            return true;
                        } else if (class115.field2066 == 94) {
                            int var104 = class40.field827.method1051((byte) -34);
                            int var105 = class40.field827.method1022(-1);
                            int var106 = class40.field827.method1067(515473640);
                            class157 var107 = (class157) class136.field2426.method434((byte) -93, (long) var105);
                            if (var107 != null) {
                                class201.method1350(var107.field2746 != var106, arg0 ^ -2097041, var107);
                            }
                            class178.method1206(var104, var105, (byte) 115, var106);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -254) {
                            class43.method334(-16777217);
                            class115.field2066 = -1;
                            return false;
                        } else if (class115.field2066 == 62) {
                            byte[] var108 = new byte[class209.field3582];
                            class40.field827.method907(class209.field3582, 831, 0, var108);
                            class78.method574(class55.method422(-29067, class209.field3582, 0, var108), 68, true);
                            class115.field2066 = -1;
                            return true;
                        } else if (class115.field2066 == 240) {
                            class166.field2899 = class111.field2038;
                            long var109 = class40.field827.method1049(126);
                            if (~var109 == -1L) {
                                class96.field1803 = null;
                                class78.field1508 = 0;
                                class133.field2376 = null;
                                class121.field2177 = null;
                                class115.field2066 = -1;
                                return true;
                            } else {
                                long var111 = class40.field827.method1049(127);
                                class96.field1803 = class199.method1334((byte) -124, var111);
                                class133.field2376 = class199.method1334((byte) -114, var109);
                                class1.field5 = class40.field827.method1060((byte) -58);
                                int var113 = class40.field827.method1051((byte) 120);
                                if (~var113 == -256) {
                                    class115.field2066 = -1;
                                    return true;
                                } else {
                                    class78.field1508 = var113;
                                    class185[] var114 = new class185[100];
                                    for (int var115 = 0; ~var115 > ~class78.field1508; ++var115) {
                                        var114[var115] = new class185();
                                        var114[var115].field573 = class40.field827.method1049(127);
                                        var114[var115].field3209 = class199.method1334((byte) -98, var114[var115].field573);
                                        var114[var115].field3208 = class40.field827.method1063(-17162);
                                        var114[var115].field3212 = class40.field827.method1060((byte) -58);
                                        var114[var115].field3207 = class40.field827.method1039(1995);
                                        if (class43.field854 == var114[var115].field573) {
                                            class207.field3550 = var114[var115].field3212;
                                        }
                                    }
                                    boolean var116 = false;
                                    int var117 = class78.field1508;
                                    while (~var117 < -1) {
                                        --var117;
                                        boolean var118 = true;
                                        for (int var119 = 0; var117 > var119; ++var119) {
                                            if (~var114[var119].field3209.method1691(arg0 + -20127, var114[var119 + 1].field3209) < -1) {
                                                class185 var120 = var114[var119];
                                                var118 = false;
                                                var114[var119] = var114[var119 + 1];
                                                var114[var119 + 1] = var120;
                                            }
                                        }
                                        if (var118) {
                                            break;
                                        }
                                    }
                                    class121.field2177 = var114;
                                    class115.field2066 = -1;
                                    return true;
                                }
                            }
                        } else if (~class115.field2066 == -236) {
                            class124.method865(class40.field827.method1039(1995), arg0 ^ 16878);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -154) {
                            int var121 = class40.field827.method1051((byte) -66);
                            int var122 = class40.field827.method1051((byte) -45);
                            int var123 = class40.field827.method1063(-17162);
                            int var124 = class40.field827.method1051((byte) -36);
                            int var125 = class40.field827.method1051((byte) 110);
                            class41.method331((byte) -105, var121, var125, var122, var123, true, var124);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -214) {
                            class9.field177 = class40.field827.method1051((byte) 90);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -89) {
                            int var126 = class40.field827.method1063(arg0 + -17050);
                            if (~var126 == -65536) {
                                var126 = -1;
                            }
                            int var127 = class40.field827.method1062(-1);
                            class44 var128 = class221.method1456(var127, (byte) -39);
                            if (var128.field959 != 1 || var128.field930 != var126) {
                                var128.field930 = var126;
                                var128.field959 = 1;
                                class257.method1718(false, var128);
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (class115.field2066 == 187) {
                            class103.method749((byte) -110, false);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -72) {
                            int var129 = class40.field827.method1051((byte) -81);
                            int var130 = class40.field827.method1051((byte) 108);
                            int var131 = class40.field827.method1063(-17162);
                            int var132 = class40.field827.method1051((byte) 96);
                            int var133 = class40.field827.method1051((byte) -85);
                            class79.method596(var130, var129, var133, var132, var131, (byte) 124);
                            class115.field2066 = -1;
                            return true;
                        } else if (class115.field2066 == 11) {
                            int var134 = class40.field827.method1063(arg0 + -17050);
                            int var135 = class40.field827.method1022(-1);
                            int var136 = class40.field827.method1063(-17162);
                            int var137 = class40.field827.method1052(false);
                            class44 var138 = class221.method1456(var135, (byte) -44);
                            if (var138.field870 != var136 || var138.field966 != var137 || ~var138.field995 != ~var134) {
                                var138.field966 = var137;
                                var138.field995 = var134;
                                var138.field870 = var136;
                                class257.method1718(false, var138);
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (class115.field2066 == 221) {
                            long var139 = class40.field827.method1049(arg0 ^ -17);
                            class40.field827.method1060((byte) -58);
                            long var141 = class40.field827.method1049(127);
                            long var143 = (long) class40.field827.method1063(-17162);
                            boolean var145 = false;
                            long var146 = (long) class40.field827.method1064((byte) -121);
                            int var148 = class40.field827.method1051((byte) 87);
                            long var149 = (var143 << 32) + var146;
                            int var151 = 0;
                            label1176: while (true) {
                                if (~var151 <= -101) {
                                    if (var148 <= 1) {
                                        if (~class87.field1673 != -2 && ~class201.field3444 != -2) {
                                            for (int var152 = 0; var152 < class185.field3215; ++var152) {
                                                if (~class175.field2981[var152] == ~var139) {
                                                    var145 = true;
                                                    break label1176;
                                                }
                                            }
                                        } else {
                                            var145 = true;
                                        }
                                    }
                                    break;
                                }
                                if (~class206.field3531[var151] == ~var149) {
                                    var145 = true;
                                    break;
                                }
                                ++var151;
                            }
                            if (!var145 && ~class226.field3800 == -1) {
                                class206.field3531[class138.field2469] = var149;
                                class138.field2469 = (class138.field2469 + 1) % 100;
                                class257 var153 = class107.method770(class203.method1370(class40.field827, (byte) -68).method1682(-18259));
                                if (var148 != 2 && ~var148 != -4) {
                                    if (var148 != 1) {
                                        class91.method674(true, var153, class199.method1334((byte) -127, var139).method1717(-122), 9, class199.method1334((byte) -80, var141).method1717(-119));
                                    } else {
                                        class91.method674(true, var153, class233.method1528(new class257[] { class173.field2963, class199.method1334((byte) -79, var139).method1717(-114) }, 0), 9, class199.method1334((byte) -105, var141).method1717(arg0 ^ 26));
                                    }
                                } else {
                                    class91.method674(true, var153, class233.method1528(new class257[] { class72.field1412, class199.method1334((byte) -84, var139).method1717(arg0 ^ 7) }, 0), 9, class199.method1334((byte) -92, var141).method1717(-106));
                                }
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (class115.field2066 == 147) {
                            int var154 = class40.field827.method1067(arg0 + 515473752);
                            if (~var154 == -65536) {
                                var154 = -1;
                            }
                            class56.method432(0, var154);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -176) {
                            int var155 = class40.field827.method1041((byte) 111);
                            int var156 = class40.field827.method1020(-104);
                            if (var155 == 65535) {
                                var155 = -1;
                            }
                            class94.method686(var156, arg0 + -20467, var155);
                            class115.field2066 = -1;
                            return true;
                        } else if (class115.field2066 == 97) {
                            int var157 = class40.field827.method1041((byte) 111);
                            class35.method296(34, var157);
                            class43.field857[class30.method252(31, class12.field232++)] = class30.method252(32767, var157);
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -246) {
                            long var158 = class40.field827.method1049(127);
                            class257 var160 = class107.method770(class203.method1370(class40.field827, (byte) -68).method1682(arg0 ^ 18237));
                            class197.method1317(-77, 6, var160, class199.method1334((byte) -76, var158).method1717(-112));
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -3) {
                            int var161 = class40.field827.method1042(112);
                            class157 var162 = (class157) class136.field2426.method434((byte) -93, (long) var161);
                            if (var162 != null) {
                                class201.method1350(true, 2097151, var162);
                            }
                            if (class73.field1421 != null) {
                                class257.method1718(false, class73.field1421);
                                class73.field1421 = null;
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -189) {
                            for (int var163 = 0; class55.field1180.length > var163; ++var163) {
                                if (class55.field1180[var163] != null) {
                                    class55.field1180[var163].field4129 = -1;
                                }
                            }
                            for (int var164 = 0; var164 < class92.field1758.length; ++var164) {
                                if (class92.field1758[var164] != null) {
                                    class92.field1758[var164].field4129 = -1;
                                }
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -110) {
                            long var165 = class40.field827.method1049(127);
                            int var167 = class40.field827.method1063(arg0 + -17050);
                            byte var168 = class40.field827.method1060((byte) -58);
                            boolean var169 = false;
                            if ((Long.MIN_VALUE & var165) != 0L) {
                                var169 = true;
                            }
                            if (var169) {
                                if (class78.field1508 == 0) {
                                    class115.field2066 = -1;
                                    return true;
                                }
                                long var170 = var165 & Long.MAX_VALUE;
                                boolean var172 = false;
                                int var173;
                                for (var173 = 0; ~class78.field1508 < ~var173 && (~class121.field2177[var173].field573 != ~var170 || class121.field2177[var173].field3208 != var167); ++var173) {
                                }
                                if (~class78.field1508 < ~var173) {
                                    while (class78.field1508 + -1 > var173) {
                                        class121.field2177[var173] = class121.field2177[var173 + 1];
                                        ++var173;
                                    }
                                    --class78.field1508;
                                    class121.field2177[class78.field1508] = null;
                                }
                            } else {
                                class257 var174 = class40.field827.method1039(1995);
                                class185 var175 = new class185();
                                var175.field573 = var165;
                                var175.field3209 = class199.method1334((byte) -79, var175.field573);
                                var175.field3207 = var174;
                                var175.field3208 = var167;
                                var175.field3212 = var168;
                                int var176;
                                for (var176 = class78.field1508 + -1; ~var176 <= -1; --var176) {
                                    int var177 = class121.field2177[var176].field3209.method1691(arg0 ^ 20321, var175.field3209);
                                    if (var177 == 0) {
                                        class121.field2177[var176].field3208 = var167;
                                        class121.field2177[var176].field3212 = var168;
                                        class121.field2177[var176].field3207 = var174;
                                        class115.field2066 = -1;
                                        if (~class43.field854 == ~var165) {
                                            class207.field3550 = var168;
                                        }
                                        class166.field2899 = class111.field2038;
                                        return true;
                                    }
                                    if (var177 < 0) {
                                        break;
                                    }
                                }
                                if (~class121.field2177.length >= ~class78.field1508) {
                                    class115.field2066 = -1;
                                    return true;
                                }
                                for (int var178 = class78.field1508 + -1; var178 > var176; --var178) {
                                    class121.field2177[var178 + 1] = class121.field2177[var178];
                                }
                                if (class78.field1508 == 0) {
                                    class121.field2177 = new class185[100];
                                }
                                class121.field2177[var176 + 1] = var175;
                                ++class78.field1508;
                                if (class43.field854 == var165) {
                                    class207.field3550 = var168;
                                }
                            }
                            class115.field2066 = -1;
                            class166.field2899 = class111.field2038;
                            return true;
                        } else if (~class115.field2066 == -153) {
                            int var179 = class40.field827.method1063(-17162);
                            int var180 = class40.field827.method1062(-1);
                            int var181 = class40.field827.method1027(arg0 + 224);
                            class44 var182 = class221.method1456(var181, (byte) -22);
                            if (var179 == 65535) {
                                var179 = -1;
                            }
                            if (!var182.field990) {
                                if (~var179 == 0) {
                                    class115.field2066 = -1;
                                    var182.field959 = 0;
                                    return true;
                                }
                                class14 var183 = class156.method1090(var179, 0);
                                var182.field966 = var183.field292;
                                var182.field995 = var183.field285 * 100 / var180;
                                var182.field959 = 4;
                                var182.field870 = var183.field305;
                                var182.field930 = var179;
                                class257.method1718(false, var182);
                            } else {
                                var182.field933 = var179;
                                var182.field963 = var180;
                                class14 var184 = class156.method1090(var179, arg0 ^ -112);
                                var182.field901 = var184.field299;
                                var182.field966 = var184.field292;
                                var182.field968 = var184.field274;
                                var182.field995 = var184.field285;
                                var182.field870 = var184.field305;
                                var182.field961 = var184.field324;
                                if (var182.field987 > 0) {
                                    var182.field995 = var182.field995 * 32 / var182.field987;
                                } else if (var182.field1019 > 0) {
                                    var182.field995 = var182.field995 * 32 / var182.field1019;
                                }
                                class257.method1718(false, var182);
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 == -248) {
                            int var185 = class40.field827.method1021((byte) -91);
                            int var186 = class40.field827.method1029(25925);
                            class257 var187 = class40.field827.method1039(1995);
                            if (var185 >= 1 && ~var185 >= -9) {
                                if (var187.method1681((byte) -114, class222.field3752)) {
                                    var187 = null;
                                }
                                class111.field2040[var185 + -1] = var187;
                                class124.field2223[var185 + -1] = ~var186 == -1;
                            }
                            class115.field2066 = -1;
                            return true;
                        } else if (~class115.field2066 != -255 && ~class115.field2066 != -30 && class115.field2066 != 80 && class115.field2066 != 203 && class115.field2066 != 170 && ~class115.field2066 != -37 && ~class115.field2066 != -169 && ~class115.field2066 != -56 && class115.field2066 != 34 && ~class115.field2066 != -22 && ~class115.field2066 != -67 && class115.field2066 != 224) {
                            if (class115.field2066 == 208) {
                                int var188 = class40.field827.method1022(arg0 ^ 111);
                                int var189 = class40.field827.method1063(-17162);
                                int var190 = 31 & var189 >> 10;
                                int var191 = (1016 & var189) >> 5;
                                int var192 = var189 & 31;
                                int var193 = (var190 << 19) + (var192 << 3) - -(var191 << 11);
                                class44 var194 = class221.method1456(var188, (byte) -39);
                                if (~var194.field1018 != ~var193) {
                                    var194.field1018 = var193;
                                    class257.method1718(false, var194);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 112) {
                                int var195 = class40.field827.method1051((byte) 117);
                                int var196 = var195 >> 6;
                                class12 var197 = new class12();
                                var197.field224 = 63 & var195;
                                var197.field220 = class40.field827.method1051((byte) -74);
                                if (var197.field220 >= 0 && class241.field4190.length > var197.field220) {
                                    if (var197.field224 != 1 && ~var197.field224 != -11) {
                                        if (~var197.field224 <= -3 && var197.field224 <= 6) {
                                            if (var197.field224 == 2) {
                                                var197.field221 = 64;
                                                var197.field230 = 64;
                                            }
                                            if (var197.field224 == 3) {
                                                var197.field230 = 0;
                                                var197.field221 = 64;
                                            }
                                            if (var197.field224 == 4) {
                                                var197.field221 = 64;
                                                var197.field230 = 128;
                                            }
                                            if (~var197.field224 == -6) {
                                                var197.field221 = 0;
                                                var197.field230 = 64;
                                            }
                                            if (var197.field224 == 6) {
                                                var197.field221 = 128;
                                                var197.field230 = 64;
                                            }
                                            var197.field224 = 2;
                                            var197.field223 = class40.field827.method1063(-17162);
                                            var197.field237 = class40.field827.method1063(-17162);
                                            var197.field233 = class40.field827.method1051((byte) 114);
                                        }
                                    } else {
                                        var197.field222 = class40.field827.method1063(-17162);
                                        class40.field827.field2677 += 3;
                                    }
                                    var197.field239 = class40.field827.method1063(arg0 + -17050);
                                    if (var197.field239 == 65535) {
                                        var197.field239 = -1;
                                    }
                                    class156.field2719[var196] = var197;
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 212) {
                                method408(-22898);
                                class177.method1191(123);
                                class115.field2066 = -1;
                                class114.field2057 += 32;
                                return true;
                            } else if (class115.field2066 == 219) {
                                for (int var198 = 0; class117.field2100.length > var198; ++var198) {
                                    if (~class58.field1233[var198] != ~class117.field2100[var198]) {
                                        class117.field2100[var198] = class58.field1233[var198];
                                        class188.method1268(-10, var198);
                                        class99.field1829[class30.method252(31, class114.field2057++)] = var198;
                                    }
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -140) {
                                int var199 = class40.field827.method1042(121);
                                int var200 = class40.field827.method1042(116);
                                class157 var201 = (class157) class136.field2426.method434((byte) -93, (long) var199);
                                class157 var202 = (class157) class136.field2426.method434((byte) -93, (long) var200);
                                if (var202 != null) {
                                    class201.method1350(var201 == null || var201.field2746 != var202.field2746, arg0 ^ -2097041, var202);
                                }
                                if (var201 != null) {
                                    var201.method254(1);
                                    class136.field2426.method424(var201, (byte) -40, (long) var200);
                                }
                                class44 var203 = class221.method1456(var199, (byte) -78);
                                if (var203 != null) {
                                    class257.method1718(false, var203);
                                }
                                class44 var204 = class221.method1456(var200, (byte) -94);
                                if (var204 != null) {
                                    class257.method1718(false, var204);
                                    class229.method1496(true, (byte) 127, var204);
                                }
                                if (~class5.field114 != 0) {
                                    class253.method1652(arg0 + -15858, class5.field114, 1);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -11) {
                                int var205 = class40.field827.method1045((byte) 124);
                                int var206 = class40.field827.method1029(25925);
                                int var207 = class40.field827.method1051((byte) 114);
                                class189.field3261 = var206 >> 1;
                                class137.field2441.method1586(var207, (var206 & 1) == 1, var205, (byte) 115);
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -41) {
                                class40.method324((byte) 10);
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -83) {
                                int var208 = class40.field827.method1063(-17162);
                                int var209 = class40.field827.method1045((byte) 126);
                                if (~var209 == -3) {
                                    class246.method1618(-104);
                                }
                                class5.field114 = var208;
                                class248.method1626(var208, (byte) 121);
                                class231.method1509(arg0 ^ 111, false);
                                class30.method250(class5.field114, 0);
                                for (int var210 = 0; var210 < 100; ++var210) {
                                    class137.field2456[var210] = true;
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 129) {
                                int var211 = class40.field827.method1063(-17162);
                                if (~var211 == -65536) {
                                    var211 = -1;
                                }
                                int var212 = class40.field827.method1051((byte) 87);
                                int var213 = class40.field827.method1063(-17162);
                                class239.method1572(var213, var212, var211, true);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 17) {
                                int var214 = class40.field827.method1067(515473640);
                                byte var215 = class40.field827.method1043(arg0 ^ 6);
                                class24.method212(-114, var214, var215);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 140) {
                                int var216 = class40.field827.method1042(116);
                                int var217 = class40.field827.method1063(-17162);
                                if (var216 < -70000) {
                                    var217 += 32768;
                                }
                                class44 var218;
                                if (~var216 > -1) {
                                    var218 = null;
                                } else {
                                    var218 = class221.method1456(var216, (byte) -25);
                                }
                                if (var218 != null) {
                                    for (int var219 = 0; var219 < var218.field929.length; ++var219) {
                                        var218.field929[var219] = 0;
                                        var218.field1008[var219] = 0;
                                    }
                                }
                                class70.method529(var217, -20888);
                                int var220 = class40.field827.method1063(-17162);
                                for (int var221 = 0; ~var221 > ~var220; ++var221) {
                                    int var222 = class40.field827.method1067(515473640);
                                    int var223 = class40.field827.method1045((byte) 109);
                                    if (~var223 == -256) {
                                        var223 = class40.field827.method1027(116);
                                    }
                                    if (var218 != null && ~var221 > ~var218.field929.length) {
                                        var218.field929[var221] = var222;
                                        var218.field1008[var221] = var223;
                                    }
                                    class28.method236(var217, var222 + -1, var221, (byte) 18, var223);
                                }
                                if (var218 != null) {
                                    class257.method1718(false, var218);
                                }
                                class177.method1191(125);
                                class43.field857[class30.method252(31, class12.field232++)] = class30.method252(var217, 32767);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 179) {
                                class257 var224 = class40.field827.method1039(1995);
                                Object[] var225 = new Object[var224.method1679((byte) -113) + 1];
                                for (int var226 = -1 + var224.method1679((byte) -31); var226 >= 0; --var226) {
                                    if (var224.method1688(117, var226) == 115) {
                                        var225[var226 - -1] = class40.field827.method1039(arg0 + 2107);
                                    } else {
                                        var225[var226 - -1] = new Integer(class40.field827.method1042(117));
                                    }
                                }
                                var225[0] = new Integer(class40.field827.method1042(120));
                                class164 var227 = new class164();
                                var227.field2867 = var225;
                                class57.method441(var227, -10305);
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -217) {
                                int var228 = class40.field827.method1067(arg0 + 515473752);
                                int var229 = class40.field827.method1062(-1);
                                int var230 = class40.field827.method1041((byte) 116);
                                class44 var231 = class221.method1456(var229, (byte) -92);
                                var231.field1020 = (var228 << 16) + var230;
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -102) {
                                int var232 = class40.field827.method1021((byte) 105);
                                int var233 = class40.field827.method1041((byte) 126);
                                int var234 = class40.field827.method1052(false);
                                class197 var235 = class92.field1758[var233];
                                if (var235 != null) {
                                    class174.method1181(var235, var232, var234, (byte) -63);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -28) {
                                int var236 = class40.field827.method1067(515473640);
                                class257 var237 = class40.field827.method1039(arg0 + 2107);
                                int var238 = class40.field827.method1063(-17162);
                                class160.method1115(0, var236);
                                class201.method1353(var237, var238, false);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 238) {
                                class76.field1492 = class40.field827.method1051((byte) 105);
                                class188.field3252 = class111.field2038;
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 135) {
                                long var239 = class40.field827.method1049(126);
                                class40.field827.method1060((byte) -58);
                                long var241 = class40.field827.method1049(127);
                                long var243 = (long) class40.field827.method1063(-17162);
                                long var245 = (long) class40.field827.method1064((byte) -101);
                                boolean var247 = false;
                                long var248 = (var243 << 32) + var245;
                                int var250 = class40.field827.method1051((byte) -38);
                                int var251 = class40.field827.method1063(-17162);
                                int var252 = 0;
                                label1275: while (true) {
                                    if (~var252 <= -101) {
                                        if (var250 <= 1) {
                                            for (int var253 = 0; class185.field3215 > var253; ++var253) {
                                                if (~class175.field2981[var253] == ~var239) {
                                                    var247 = true;
                                                    break label1275;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                    if (class206.field3531[var252] == var248) {
                                        var247 = true;
                                        break;
                                    }
                                    ++var252;
                                }
                                if (!var247 && class226.field3800 == 0) {
                                    class206.field3531[class138.field2469] = var248;
                                    class138.field2469 = (class138.field2469 + 1) % 100;
                                    class257 var254 = class38.method307(32768, var251).method1382(0, class40.field827);
                                    if (var250 != 2 && ~var250 != -4) {
                                        if (var250 != 1) {
                                            class115.method823(var251, class199.method1334((byte) -110, var239).method1717(-98), 20, var254, arg0 + -16, class199.method1334((byte) -107, var241).method1717(-108));
                                        } else {
                                            class115.method823(var251, class233.method1528(new class257[] { class173.field2963, class199.method1334((byte) -117, var239).method1717(arg0 + -7) }, 0), 20, var254, -106, class199.method1334((byte) -113, var241).method1717(arg0 ^ 9));
                                        }
                                    } else {
                                        class115.method823(var251, class233.method1528(new class257[] { class72.field1412, class199.method1334((byte) -120, var239).method1717(-110) }, arg0 ^ -112), 20, var254, arg0 + 132, class199.method1334((byte) -79, var241).method1717(-97));
                                    }
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 229) {
                                class144.field2523 = class40.field827.method1045((byte) 112);
                                class20.field417 = class40.field827.method1045((byte) 118);
                                while (~class40.field827.field2677 > ~class209.field3582) {
                                    class115.field2066 = class40.field827.method1051((byte) -121);
                                    class87.method651(false);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 242) {
                                int var255 = class40.field827.method1051((byte) 93);
                                int var256 = class40.field827.method1051((byte) 87);
                                int var257 = class40.field827.method1051((byte) 106);
                                int var258 = class40.field827.method1051((byte) 91);
                                int var259 = class40.field827.method1063(-17162);
                                class225.field3777[var255] = true;
                                class243.field4218[var255] = var256;
                                class211.field3605[var255] = var257;
                                class225.field3785[var255] = var258;
                                class69.field1378[var255] = var259;
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 133) {
                                int var260 = class40.field827.method1052(false);
                                int var261 = class40.field827.method1041((byte) 98);
                                class257 var262 = class40.field827.method1039(1995);
                                class160.method1115(0, var260);
                                class201.method1353(var262, var261, false);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 205) {
                                int var263 = class40.field827.method1042(120);
                                class44 var264 = class221.method1456(var263, (byte) -93);
                                var264.field959 = 3;
                                var264.field930 = class137.field2441.field3108.method1605(-18557);
                                class257.method1718(false, var264);
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -177) {
                                class16.method166(24, class40.field827);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 72) {
                                int var265 = class40.field827.method1063(-17162);
                                int var266 = class40.field827.method1021((byte) 94);
                                if (var265 == 65535) {
                                    var265 = -1;
                                }
                                int var267 = var266 >> 2;
                                int var268 = var266 & 3;
                                int var269 = class1.field14[var267];
                                int var270 = class40.field827.method1042(arg0 + 224);
                                int var271 = var270 >> 14 & 16383;
                                int var272 = 16383 & var270;
                                int var273 = var271 - class244.field4232;
                                int var274 = var272 - class231.field3878;
                                int var275 = var270 >> 28 & 3;
                                class55.method421(var268, var269, var267, var265, 0, var273, var275, var274);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 102) {
                                int var276 = class40.field827.method1022(-1);
                                class257 var277 = class40.field827.method1039(arg0 ^ -1957);
                                class44 var278 = class221.method1456(var276, (byte) -26);
                                if (!var277.method1706(var278.field965, -1)) {
                                    var278.field965 = var277;
                                    class257.method1718(false, var278);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 206) {
                                boolean var279 = class40.field827.method1051((byte) -62) == 1;
                                int var280 = class40.field827.method1022(-1);
                                class44 var281 = class221.method1456(var280, (byte) -51);
                                if (var279 == !var281.field970) {
                                    var281.field970 = var279;
                                    class257.method1718(false, var281);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -218) {
                                int var282 = class40.field827.method1062(-1);
                                int var283 = class40.field827.method1042(121);
                                int var284 = class40.field827.method1063(-17162);
                                if (~var284 == -65536) {
                                    var284 = -1;
                                }
                                int var285 = class40.field827.method1052(false);
                                if (var285 == 65535) {
                                    var285 = -1;
                                }
                                for (int var286 = var284; ~var285 <= ~var286; ++var286) {
                                    long var287 = ((long) var282 << 32) + (long) var286;
                                    class30 var289 = class137.field2448.method434((byte) -93, var287);
                                    if (var289 != null) {
                                        var289.method254(1);
                                    }
                                    class137.field2448.method424(new class220(var283), (byte) -40, var287);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -162) {
                                long var290 = class40.field827.method1049(127);
                                long var292 = (long) class40.field827.method1063(-17162);
                                long var294 = (long) class40.field827.method1064((byte) -100);
                                int var296 = class40.field827.method1051((byte) 123);
                                long var297 = (var292 << 32) + var294;
                                boolean var299 = false;
                                int var300 = 0;
                                label1312: while (true) {
                                    if (var300 >= 100) {
                                        if (~var296 >= -2) {
                                            if (~class87.field1673 != -2 && class201.field3444 != 1) {
                                                for (int var301 = 0; ~class185.field3215 < ~var301; ++var301) {
                                                    if (class175.field2981[var301] == var290) {
                                                        var299 = true;
                                                        break label1312;
                                                    }
                                                }
                                            } else {
                                                var299 = true;
                                            }
                                        }
                                        break;
                                    }
                                    if (class206.field3531[var300] == var297) {
                                        var299 = true;
                                        break;
                                    }
                                    ++var300;
                                }
                                if (!var299 && ~class226.field3800 == -1) {
                                    class206.field3531[class138.field2469] = var297;
                                    class138.field2469 = (class138.field2469 - -1) % 100;
                                    class257 var302 = class107.method770(class203.method1370(class40.field827, (byte) -68).method1682(-18259));
                                    if (var296 != 2 && ~var296 != -4) {
                                        if (~var296 == -2) {
                                            class197.method1317(-48, 7, var302, class233.method1528(new class257[] { class173.field2963, class199.method1334((byte) -117, var290).method1717(-122) }, 0));
                                        } else {
                                            class197.method1317(-71, 3, var302, class199.method1334((byte) -120, var290).method1717(-106));
                                        }
                                    } else {
                                        class197.method1317(arg0 ^ 34, 7, var302, class233.method1528(new class257[] { class72.field1412, class199.method1334((byte) -98, var290).method1717(arg0 + 9) }, arg0 ^ -112));
                                    }
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -52) {
                                int var303 = class40.field827.method1029(25925);
                                int var304 = class40.field827.method1041((byte) 123);
                                class120.method849(var304, var303, arg0 + 167);
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -198) {
                                int var305 = class40.field827.method1062(-1);
                                int var306 = class40.field827.method1063(arg0 ^ 17254);
                                class44 var307 = class221.method1456(var305, (byte) -39);
                                if (var306 == 65535) {
                                    var306 = -1;
                                }
                                if (~var307.field959 != -3 || var307.field930 != var306) {
                                    var307.field959 = 2;
                                    var307.field930 = var306;
                                    class257.method1718(false, var307);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -5) {
                                if (class5.field114 != -1) {
                                    class253.method1652(arg0 ^ 15886, class5.field114, 0);
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 233) {
                                class103.method749((byte) -110, true);
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -85) {
                                class185.field3215 = class209.field3582 / 8;
                                for (int var308 = 0; ~var308 > ~class185.field3215; ++var308) {
                                    class175.field2981[var308] = class40.field827.method1049(127);
                                    class221.field3743[var308] = class199.method1334((byte) -71, class175.field2981[var308]);
                                }
                                class115.field2066 = -1;
                                class188.field3252 = class111.field2038;
                                return true;
                            } else if (class115.field2066 == 15) {
                                int var309 = class40.field827.method1042(124);
                                int var310 = class40.field827.method1063(-17162);
                                class44 var311;
                                if (var309 < 0) {
                                    var311 = null;
                                } else {
                                    var311 = class221.method1456(var309, (byte) -79);
                                }
                                if (~var309 > 69999) {
                                    var310 += 32768;
                                }
                                while (~class40.field827.field2677 > ~class209.field3582) {
                                    int var312 = class40.field827.method1055(-32768);
                                    int var313 = class40.field827.method1063(-17162);
                                    int var314 = 0;
                                    if (var313 != 0) {
                                        var314 = class40.field827.method1051((byte) -83);
                                        if (var314 == 255) {
                                            var314 = class40.field827.method1042(121);
                                        }
                                    }
                                    if (var311 != null && var312 >= 0 && var311.field929.length > var312) {
                                        var311.field929[var312] = var313;
                                        var311.field1008[var312] = var314;
                                    }
                                    class28.method236(var310, var313 + -1, var312, (byte) 18, var314);
                                }
                                if (var311 != null) {
                                    class257.method1718(false, var311);
                                }
                                class177.method1191(127);
                                class43.field857[class30.method252(class12.field232++, 31)] = class30.method252(32767, var310);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 146) {
                                class144.field2523 = class40.field827.method1029(25925);
                                class20.field417 = class40.field827.method1021((byte) 30);
                                for (int var315 = class144.field2523; class144.field2523 - -8 > var315; ++var315) {
                                    for (int var317 = class20.field417; var317 < class20.field417 - -8; ++var317) {
                                        if (class78.field1499[class189.field3261][var315][var317] != null) {
                                            class78.field1499[class189.field3261][var315][var317] = null;
                                            class10.method117(var317, var315, 4);
                                        }
                                    }
                                }
                                for (class34 var316 = (class34) class72.field1413.method288(arg0 + 26223); var316 != null; var316 = (class34) class72.field1413.method277(arg0 + 113)) {
                                    if (var316.field661 >= class144.field2523 && var316.field661 < class144.field2523 + 8 && ~class20.field417 >= ~var316.field662 && ~var316.field662 > ~(class20.field417 + 8) && ~class189.field3261 == ~var316.field668) {
                                        var316.field672 = 0;
                                    }
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 == -65) {
                                class59.method447((byte) 34);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 222) {
                                class177.method1191(arg0 ^ -17);
                                class33.field650 = class40.field827.method1051((byte) 112);
                                class115.field2066 = -1;
                                class145.field2541 = class111.field2038;
                                return true;
                            } else if (class115.field2066 == 30) {
                                class36.method298(class40.field827, class72.field1404, class209.field3582, arg0 + 109);
                                class115.field2066 = -1;
                                return true;
                            } else if (class115.field2066 == 209) {
                                long var318 = class40.field827.method1049(arg0 + 238);
                                boolean var320 = true;
                                int var321 = class40.field827.method1063(-17162);
                                int var322 = class40.field827.method1051((byte) -89);
                                class257 var323 = class17.field378;
                                if (var321 > 0) {
                                    var323 = class40.field827.method1039(arg0 ^ -1957);
                                }
                                if (~var318 > -1L) {
                                    var318 &= Long.MAX_VALUE;
                                    var320 = false;
                                }
                                class257 var324 = class199.method1334((byte) -84, var318).method1717(-97);
                                for (int var325 = 0; ~class138.field2462 < ~var325; ++var325) {
                                    if (~class243.field4216[var325] == ~var318) {
                                        if (~class80.field1568[var325] != ~var321) {
                                            class80.field1568[var325] = var321;
                                            if (var321 > 0) {
                                                class197.method1317(-73, 5, class233.method1528(new class257[] { var324, class191.field3270 }, 0), class17.field378);
                                            }
                                            if (var321 == 0) {
                                                class197.method1317(-33, 5, class233.method1528(new class257[] { var324, class239.field4105 }, arg0 ^ -112), class17.field378);
                                            }
                                        }
                                        client.field1536[var325] = var323;
                                        class55.field1182[var325] = var322;
                                        var324 = null;
                                        class91.field1744[var325] = var320;
                                        break;
                                    }
                                }
                                if (var324 != null && class138.field2462 < 200) {
                                    class243.field4216[class138.field2462] = var318;
                                    class185.field3218[class138.field2462] = var324;
                                    class80.field1568[class138.field2462] = var321;
                                    client.field1536[class138.field2462] = var323;
                                    class55.field1182[class138.field2462] = var322;
                                    class91.field1744[class138.field2462] = var320;
                                    ++class138.field2462;
                                }
                                class188.field3252 = class111.field2038;
                                boolean var326 = false;
                                int var327 = class138.field2462;
                                while (var327 > 0) {
                                    boolean var328 = true;
                                    --var327;
                                    for (int var329 = 0; ~var329 > ~var327; ++var329) {
                                        if (~class80.field1568[var329] != ~class151.field2598 && class80.field1568[var329 + 1] == class151.field2598 || ~class80.field1568[var329] == -1 && class80.field1568[var329 + 1] != 0) {
                                            int var330 = class80.field1568[var329];
                                            var328 = false;
                                            class80.field1568[var329] = class80.field1568[var329 + 1];
                                            class80.field1568[var329 + 1] = var330;
                                            class257 var331 = client.field1536[var329];
                                            client.field1536[var329] = client.field1536[var329 + 1];
                                            client.field1536[var329 + 1] = var331;
                                            class257 var332 = class185.field3218[var329];
                                            class185.field3218[var329] = class185.field3218[var329 + 1];
                                            class185.field3218[var329 - -1] = var332;
                                            long var333 = class243.field4216[var329];
                                            class243.field4216[var329] = class243.field4216[var329 + 1];
                                            class243.field4216[var329 + 1] = var333;
                                            int var335 = class55.field1182[var329];
                                            class55.field1182[var329] = class55.field1182[var329 + 1];
                                            class55.field1182[var329 + 1] = var335;
                                            boolean var336 = class91.field1744[var329];
                                            class91.field1744[var329] = class91.field1744[var329 + 1];
                                            class91.field1744[var329 + 1] = var336;
                                        }
                                    }
                                    if (var328) {
                                        break;
                                    }
                                }
                                class115.field2066 = -1;
                                return true;
                            } else if (~class115.field2066 != -235) {
                                if (~class115.field2066 == -231) {
                                    class177.method1191(127);
                                    int var340 = class40.field827.method1051((byte) 124);
                                    int var341 = class40.field827.method1045((byte) 111);
                                    int var342 = class40.field827.method1022(-1);
                                    class248.field4274[var340] = var342;
                                    field1156[var340] = var341;
                                    class239.field4106[var340] = 1;
                                    for (int var343 = 0; var343 < 98; ++var343) {
                                        if (var342 >= class178.field3046[var343]) {
                                            class239.field4106[var340] = var343 + 2;
                                        }
                                    }
                                    class140.field2488[class30.method252(class44.field943++, 31)] = var340;
                                    class115.field2066 = -1;
                                    return true;
                                } else if (~class115.field2066 == -186) {
                                    int var344 = class40.field827.method1022(-1);
                                    int var345 = class40.field827.method1052(false);
                                    int var346 = class40.field827.method1052(false);
                                    class160.method1115(0, var345);
                                    class125.method868(var346, 100, var344);
                                    class115.field2066 = -1;
                                    return true;
                                } else if (~class115.field2066 == -133) {
                                    if (~class209.field3582 == -1) {
                                        class26.field511 = class99.field1823;
                                    } else {
                                        class26.field511 = class40.field827.method1039(arg0 ^ -1957);
                                    }
                                    class115.field2066 = -1;
                                    return true;
                                } else if (class115.field2066 == 218) {
                                    class144.field2523 = class40.field827.method1045((byte) 126);
                                    class20.field417 = class40.field827.method1051((byte) 124);
                                    class115.field2066 = -1;
                                    return true;
                                } else if (~class115.field2066 == -144) {
                                    int var347 = class40.field827.method1063(-17162);
                                    int var348 = class40.field827.method1022(-1);
                                    class24.method212(arg0, var347, var348);
                                    class115.field2066 = -1;
                                    return true;
                                } else {
                                    class198.method1325("T1 - " + class115.field2066 + "," + class45.field1043 + "," + class71.field1400 + " - " + class209.field3582, (Throwable) null, -105);
                                    class43.method334(-16777217);
                                    return true;
                                }
                            } else {
                                int var337 = class40.field827.method1024(-1301968968);
                                int var338 = class40.field827.method1062(-1);
                                class44 var339 = class221.method1456(var338, (byte) -59);
                                if (~var339.field878 != ~var337 || ~var337 == 0) {
                                    var339.field955 = 0;
                                    var339.field878 = var337;
                                    var339.field903 = 0;
                                    class257.method1718(false, var339);
                                }
                                class115.field2066 = -1;
                                return true;
                            }
                        } else {
                            class87.method651(false);
                            class115.field2066 = -1;
                            return true;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)V")
    public final void method209(byte arg0) {
        class251.method1645((byte) 126);
        ++field1144;
        if (arg0 != 111) {
            method412((byte) -82);
        }
    }

    @OriginalMember(owner = "client!dk", name = "d", descriptor = "(B)V")
    public static final void method407(byte arg0) {
        class260.field4508 = null;
        class138.field2463 = null;
        class20.field423 = null;
        ++field1152;
        if (arg0 >= -94) {
            method407((byte) -115);
        }
        class237.field4060 = null;
    }

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "(I)V")
    public static final void method408(int arg0) {
        ++field1157;
        if (arg0 == -22898) {
            for (int var1 = 0; var1 < class251.field4319; ++var1) {
                class21 var2 = class250.method1638(false, var1);
                if (var2 != null && ~var2.field430 == -1) {
                    class58.field1233[var1] = 0;
                    class117.field2100[var1] = 0;
                }
            }
            class75.field1453 = new class56(16);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ILia;)V")
    public static final void method409(int arg0, class257 arg1) {
        ++field1151;
        class209 var2 = class39.method315(true, arg1);
        if (var2 != null) {
            class143.field2516 = -var2.field3567 + class8.field174 - -class181.field3149;
            int var3 = class143.field2516 - (int) ((double) class239.field4114.field981 / class15.field332);
            int var4 = class143.field2516 - -((int) ((double) class239.field4114.field981 / class15.field332));
            class26.field510 = -class182.field3159 + var2.field3581;
            int var5 = class26.field510 - -((int) ((double) class239.field4114.field926 / class15.field332));
            int var6 = class26.field510 - (int) ((double) class239.field4114.field926 / class15.field332);
            if (var6 < 0) {
                class26.field510 = (int) ((double) class239.field4114.field926 / class15.field332);
            }
            if (~var5 < ~class252.field4337) {
                class26.field510 = -((int) ((double) class239.field4114.field926 / class15.field332)) + class252.field4337;
            }
            if (~var3 > arg0) {
                class143.field2516 = (int) ((double) class239.field4114.field981 / class15.field332);
            }
            if (~var4 < ~class181.field3149) {
                class143.field2516 = -((int) ((double) class239.field4114.field981 / class15.field332)) + class181.field3149;
            }
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(BII)Z")
    private final boolean method410(byte arg0, int arg1, int arg2) {
        if (arg0 != 44) {
            field1140 = null;
        }
        int var4 = (-arg2 + arg1) * this.field1154 >> 12;
        ++field1147;
        int var5 = class106.field1962[(var4 * 255 & 1046868) >> 12];
        int var6 = (var5 << 12) / this.field1154;
        int var7 = (var6 << 12) / this.field1138;
        int var8 = this.field1148 * var7 >> 12;
        return ~(arg1 + arg2) > ~var8 && ~(-var8) > ~(arg2 - -arg1);
    }

    @OriginalMember(owner = "client!dk", name = "c", descriptor = "(II)[I")
    public final int[] method169(int arg0, int arg1) {
        int[] var3 = super.field1467.method1182((byte) -48, arg1);
        if (arg0 != -9351) {
            method411(13);
        }
        if (super.field1467.field2980) {
            int var4 = class10.field197[arg1] - 2048;
            for (int var5 = 0; ~class96.field1807 < ~var5; ++var5) {
                int var6 = class137.field2457[var5] + -2048;
                int var7 = this.field1149 + var4;
                int var8 = var7 < -2048 ? var7 - -4096 : var7;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field1143 + var6;
                int var11 = ~var10 <= 2047 ? var10 : var10 + 4096;
                int var12 = var11 > 2048 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field1145;
                int var14 = var13 < -2048 ? var13 - -4096 : var13;
                int var15 = var14 > 2048 ? var14 + -4096 : var14;
                int var16 = this.field1142 + var4;
                int var17 = var16 < -2048 ? var16 + 4096 : var16;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method410((byte) 44, var9, var15) && !this.method405(var18, -1, var12) ? 0 : 4096;
            }
        }
        ++field1141;
        return var3;
    }

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "(I)V")
    public static void method411(int arg0) {
        field1146 = null;
        field1140 = null;
        field1156 = null;
        if (arg0 != -32421) {
            method412((byte) -40);
        }
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "()V")
    public class53() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dk", name = "e", descriptor = "(B)V")
    public static final void method412(byte arg0) {
        ++field1155;
        for (class103 var1 = (class103) class174.field2979.method288(arg0 + 25984); var1 != null; var1 = (class103) class174.field2979.method277(1)) {
            if (var1.field1916) {
                var1.method748((byte) -128);
            }
        }
        for (class103 var2 = (class103) class233.field3974.method288(26111); var2 != null; var2 = (class103) class233.field3974.method277(1)) {
            if (var2.field1916) {
                var2.method748((byte) -127);
            }
        }
        if (arg0 != 127) {
            method407((byte) -30);
        }
    }
}
