import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class43 {

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "Lsg;")
    public static class30 field1026 = class167.method1221((byte) 33, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "[J")
    public static long[] field1031 = new long[500];

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "I")
    public static int field1028;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "Lmc;")
    public static class151 field1027;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method441(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        field1029++;
        if (class48.field1096 <= arg0 && arg0 <= class252.field4458 && class48.field1096 <= arg7 && class252.field4458 >= arg7 && arg5 >= class48.field1096 && class252.field4458 >= arg5 && class48.field1096 <= arg1 && class252.field4458 >= arg1 && arg6 >= class275.field4804 && arg6 <= class167.field3064 && class275.field4804 <= arg8 && arg8 <= class167.field3064 && class275.field4804 <= arg2 && arg2 <= class167.field3064 && class275.field4804 <= arg9 && arg9 <= class167.field3064) {
            class125.method942(arg6, arg0, arg7, (byte) -74, arg9, arg5, arg8, arg3, arg2, arg1);
        } else {
            class241.method1699(arg9, arg6, arg5, arg3, arg2, arg0, arg7, arg4 ^ 0x2E5A, arg1, arg8);
        }
        if (arg4 != 224) {
            field1027 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(I)V")
    public static void method442(int arg0) {
        field1027 = null;
        field1026 = null;
        field1031 = null;
        if (arg0 != 127) {
            field1027 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(B)V")
    public static final void method443(byte arg0) {
        if (class202.field3607 > 1) {
            class202.field3607--;
            class134.field2622 = class14.field308;
        }
        field1028++;
        if (class107.field2152 > 0) {
            class107.field2152--;
        }
        if (class247.field4392) {
            class247.field4392 = false;
            class261.method1805(arg0 - 46);
            return;
        }
        for (int var1 = 0; var1 < 100 && class246.method1727((byte) -119); var1++) {
        }
        if (class193.field3485 != 30) {
            return;
        }
        class142.method1057(27, class196.field3553, 113);
        Object var2 = class170.field3204.field387;
        synchronized (class170.field3204.field387) {
            if (!class80.field1722) {
                class170.field3204.field391 = 0;
            } else if (class63.field1344 != 0 || class170.field3204.field391 >= 40) {
                class196.field3553.method1267(162, -9);
                class99.field2003++;
                int var3 = 0;
                class196.field3553.method76(5305, 0);
                int var4 = class196.field3553.field146;
                for (int var5 = 0; class170.field3204.field391 > var5 && class196.field3553.field146 - var4 < 240; var5++) {
                    var3++;
                    int var6 = class170.field3204.field394[var5];
                    if (var6 < 0) {
                        var6 = 0;
                    } else if (var6 > 65534) {
                        var6 = 65534;
                    }
                    int var7 = class170.field3204.field392[var5];
                    boolean var8 = false;
                    if (var7 < 0) {
                        var7 = 0;
                    } else if (var7 > 65534) {
                        var7 = 65534;
                    }
                    if (class170.field3204.field394[var5] == -1 && class170.field3204.field392[var5] == -1) {
                        var8 = true;
                        var6 = -1;
                        var7 = -1;
                    }
                    if (class233.field4148 != var7 || class113.field2251 != var6) {
                        int var9 = var7 - class233.field4148;
                        int var10 = var6 - class113.field2251;
                        class113.field2251 = var6;
                        class233.field4148 = var7;
                        if (class125.field2442 < 8 && var9 >= -32 && var9 <= 31 && var10 >= -32 && var10 <= 31) {
                            var10 += 32;
                            var9 += 32;
                            class196.field3553.method97((class125.field2442 << 12) + (var9 << 6) + var10, (byte) -2);
                            class125.field2442 = 0;
                        } else if (class125.field2442 < 32 && var9 >= -128 && var9 <= 127 && var10 >= -128 && var10 <= 127) {
                            class196.field3553.method76(arg0 + 5219, class125.field2442 + 128);
                            var10 += 128;
                            var9 += 128;
                            class196.field3553.method97((var9 << 8) + var10, (byte) -2);
                            class125.field2442 = 0;
                        } else if (class125.field2442 < 32) {
                            class196.field3553.method76(5305, class125.field2442 + 192);
                            if (var8) {
                                class196.field3553.method57(Integer.MIN_VALUE, 112);
                            } else {
                                class196.field3553.method57(var7 | var6 << 16, 103);
                            }
                            class125.field2442 = 0;
                        } else {
                            class196.field3553.method97(class125.field2442 + 57344, (byte) -2);
                            if (var8) {
                                class196.field3553.method57(Integer.MIN_VALUE, 109);
                            } else {
                                class196.field3553.method57(var6 << 16 | var7, arg0 ^ 0x32);
                            }
                            class125.field2442 = 0;
                        }
                    } else if (class125.field2442 < 2047) {
                        class125.field2442++;
                    }
                }
                class196.field3553.method66(class196.field3553.field146 - var4, -5012);
                if (class170.field3204.field391 <= var3) {
                    class170.field3204.field391 = 0;
                } else {
                    class170.field3204.field391 -= var3;
                    for (int var11 = 0; var11 < class170.field3204.field391; var11++) {
                        class170.field3204.field392[var11] = class170.field3204.field392[var3 + var11];
                        class170.field3204.field394[var11] = class170.field3204.field394[var11 + var3];
                    }
                }
            }
        }
        if (class63.field1344 != 0) {
            class186.field3420++;
            int var12 = class183.field3365;
            if (var12 < 0) {
                var12 = 0;
            } else if (var12 > 65535) {
                var12 = 65535;
            }
            int var13 = class32.field817;
            long var14 = (class270.field4753 - class223.field4001) / 50L;
            byte var16 = 0;
            if (var13 < 0) {
                var13 = 0;
            } else if (var13 > 65535) {
                var13 = 65535;
            }
            class223.field4001 = class270.field4753;
            if (var14 > 32767L) {
                var14 = 32767L;
            }
            int var17 = (int) var14;
            if (class63.field1344 == 2) {
                var16 = 1;
            }
            class196.field3553.method1267(224, -9);
            class196.field3553.method57(var12 << 16 | var13, 65);
            class196.field3553.method87(-55174520, var16 << 15 | var17);
        }
        if (class41.field1016[96] || class41.field1016[97] || class41.field1016[98] || class41.field1016[99]) {
            class222.field3995 = true;
        }
        if (class205.field3667 > 0) {
            class205.field3667--;
        }
        if (class222.field3995 && class205.field3667 <= 0) {
            class222.field3995 = false;
            class173.field3231++;
            class205.field3667 = 20;
            class196.field3553.method1267(227, -9);
            class196.field3553.method48(class110.field2202, 75);
            class196.field3553.method48(class91.field1851, arg0 - 40);
        }
        if (class116.field2286 && !class173.field3235) {
            class225.field4036++;
            class173.field3235 = true;
            class196.field3553.method1267(85, -9);
            class196.field3553.method76(arg0 + 5219, 1);
        }
        if (!class116.field2286 && class173.field3235) {
            class173.field3235 = false;
            class196.field3553.method1267(85, arg0 ^ 0xFFFFFFA1);
            class225.field4036++;
            class196.field3553.method76(5305, 0);
        }
        if (!class35.field865) {
            class224.field4014++;
            class196.field3553.method1267(191, -9);
            class196.field3553.method94(class16.method164(-101), arg0 - 153);
            class35.field865 = true;
        }
        class244.method1721(104);
        if (class193.field3485 != 30) {
            return;
        }
        class64.method577((byte) 122);
        class193.method1400((byte) 44);
        class179.field3314++;
        if (class179.field3314 > 750) {
            class261.method1805(arg0 - 46);
            return;
        }
        class211.method1502(-66);
        class87.method729((byte) 102);
        class228.method1623(-1);
        if (class139.field2714 != null) {
            class55.method525(92);
        }
        int var18 = class150.method1093(true, 1237);
        if (arg0 != 86) {
            field1027 = null;
        }
        while (var18 != -1) {
            class253.method1761(var18, (byte) 121);
            class80.field1727[class68.method612(31, class204.field3656++)] = var18;
            var18 = class150.method1093(false, 1237);
        }
        for (class68 var19 = class112.method879(-39); var19 != null; var19 = class112.method879(-31)) {
            int var20 = var19.method607(13);
            int var21 = var19.method611(arg0 + 1962);
            if (var20 == 1) {
                class228.field4076[var21] = var19.field1484;
                class202.field3601[class68.method612(class117.field2318++, 31)] = var21;
            } else if (var20 == 2) {
                class144.field2772[var21] = var19.field1483;
                class62.field1330[class68.method612(31, class48.field1094++)] = var21;
            } else if (var20 == 3) {
                class31 var41 = class272.method1858(var21, 65535);
                if (!var19.field1483.method267(-52, var41.field799)) {
                    var41.field799 = var19.field1483;
                    class254.method1771(var41, arg0 - 78);
                }
            } else if (var20 == 4) {
                class31 var22 = class272.method1858(var21, arg0 ^ 0xFFA9);
                int var23 = var19.field1484;
                int var24 = var19.field1490;
                if (var22.field792 != var23 || var22.field715 != var24) {
                    var22.field715 = var24;
                    var22.field792 = var23;
                    class254.method1771(var22, arg0 ^ 0x5E);
                }
            } else if (var20 == 5) {
                class31 var25 = class272.method1858(var21, 65535);
                if (var19.field1484 != var25.field778 || var19.field1484 == -1) {
                    var25.field778 = var19.field1484;
                    var25.field738 = 0;
                    var25.field769 = 0;
                    class254.method1771(var25, arg0 ^ 0x5E);
                }
            } else if (var20 == 6) {
                int var26 = var19.field1484;
                int var27 = var26 & 0x1F;
                int var28 = var26 >> 10 & 0x1F;
                int var29 = var26 >> 5 & 0x1F;
                class31 var30 = class272.method1858(var21, arg0 + 65449);
                int var31 = (var27 << 3) + (var28 << 19) + (var29 << 11);
                if (var30.field703 != var31) {
                    var30.field703 = var31;
                    class254.method1771(var30, arg0 ^ 0x5E);
                }
            } else if (var20 == 7) {
                class31 var39 = class272.method1858(var21, arg0 ^ 0xFFA9);
                boolean var40 = var19.field1484 == 1;
                if (var40 != var39.field654) {
                    var39.field654 = var40;
                    class254.method1771(var39, arg0 - 78);
                }
            } else if (var20 == 8) {
                class31 var32 = class272.method1858(var21, 65535);
                if (var19.field1484 != var32.field685 || var19.field1490 != var32.field639 || var19.field1486 != var32.field652) {
                    var32.field652 = var19.field1486;
                    var32.field685 = var19.field1484;
                    var32.field639 = var19.field1490;
                    if (var32.field651 != -1) {
                        if (var32.field693 > 0) {
                            var32.field652 = var32.field652 * 32 / var32.field693;
                        } else if (var32.field660 > 0) {
                            var32.field652 = var32.field652 * 32 / var32.field660;
                        }
                    }
                    class254.method1771(var32, 8);
                }
            } else if (var20 == 9) {
                class31 var38 = class272.method1858(var21, 65535);
                if (var19.field1484 != var38.field651 || var19.field1490 != var38.field683) {
                    var38.field683 = var19.field1490;
                    var38.field651 = var19.field1484;
                    class254.method1771(var38, 8);
                }
            } else if (var20 == 10) {
                class31 var33 = class272.method1858(var21, 65535);
                if (var19.field1484 != var33.field633 || var19.field1490 != var33.field794 || var19.field1486 != var33.field776) {
                    var33.field776 = var19.field1486;
                    var33.field633 = var19.field1484;
                    var33.field794 = var19.field1490;
                    class254.method1771(var33, 8);
                }
            } else if (var20 == 11) {
                class31 var34 = class272.method1858(var21, arg0 ^ 0xFFA9);
                var34.field755 = var34.field804 = var19.field1484;
                var34.field720 = 0;
                var34.field665 = var34.field749 = var19.field1490;
                var34.field689 = 0;
                class254.method1771(var34, 8);
            } else if (var20 == 12) {
                class31 var36 = class272.method1858(var21, 65535);
                int var37 = var19.field1484;
                if (var36 != null && var36.field655 == 0) {
                    if (var36.field743 - var36.field670 < var37) {
                        var37 = var36.field743 - var36.field670;
                    }
                    if (var37 < 0) {
                        var37 = 0;
                    }
                    if (var36.field736 != var37) {
                        var36.field736 = var37;
                        class254.method1771(var36, 8);
                    }
                }
            } else if (var20 == 13) {
                class31 var35 = class272.method1858(var21, arg0 ^ 0xFFA9);
                var35.field719 = var19.field1484;
            }
        }
        class195.field3517++;
        if (class36.field868 != 0) {
            class108.field2179 += 20;
            if (class108.field2179 >= 400) {
                class36.field868 = 0;
            }
        }
        if (class168.field3106 != null) {
            class86.field1770++;
            if (class86.field1770 >= 15) {
                class254.method1771(class168.field3106, arg0 ^ 0x5E);
                class168.field3106 = null;
            }
        }
        if (class157.field2967 != null) {
            class254.method1771(class157.field2967, arg0 - 78);
            if ((class222.field3991 + 5) < class23.field440 || class23.field440 < (class222.field3991 - 5) || class104.field2095 > (class141.field2722 + 5) || (class141.field2722 - 5) > class104.field2095) {
                class17.field341 = true;
            }
            class205.field3676++;
            if (class122.field2413 == 0) {
                if (class17.field341 && class205.field3676 >= 5) {
                    if (class78.field1695 == class157.field2967 && class21.field383 != class123.field2418) {
                        class30.field601++;
                        class31 var42 = class157.field2967;
                        byte var43 = 0;
                        if (class125.field2448 == 1 && var42.field664 == 206) {
                            var43 = 1;
                        }
                        if (var42.field806[class21.field383] <= 0) {
                            var43 = 0;
                        }
                        if (class91.method743(client.method1498(var42), 128)) {
                            int var44 = class123.field2418;
                            int var45 = class21.field383;
                            var42.field806[var45] = var42.field806[var44];
                            var42.field708[var45] = var42.field708[var44];
                            var42.field806[var44] = -1;
                            var42.field708[var44] = 0;
                        } else if (var43 == 1) {
                            int var46 = class123.field2418;
                            int var47 = class21.field383;
                            while (var46 != var47) {
                                if (var47 < var46) {
                                    var42.method319((byte) -5, var46 - 1, var46);
                                    var46--;
                                } else if (var46 < var47) {
                                    var42.method319((byte) -5, var46 + 1, var46);
                                    var46++;
                                }
                            }
                        } else {
                            var42.method319((byte) -5, class21.field383, class123.field2418);
                        }
                        class196.field3553.method1267(123, -9);
                        class196.field3553.method48(class123.field2418, 84);
                        class196.field3553.method68(arg0 ^ 0xFFFFFFA9, var43);
                        class196.field3553.method48(class21.field383, 65);
                        class196.field3553.method64(class157.field2967.field638, 1738089264);
                    }
                } else if ((class154.field2913 == 1 || class101.method822(0, class52.field1165 - 1)) && class52.field1165 > 2) {
                    class154.method1153(false);
                } else if (class52.field1165 > 0) {
                    class143.method1064(-257);
                }
                class157.field2967 = null;
                class63.field1344 = 0;
                class86.field1770 = 10;
            }
        }
        class256.field4516 = null;
        class49.field1114 = false;
        class179.field3311 = 0;
        class124.field2434 = false;
        class31 var48 = class259.field4592;
        class259.field4592 = null;
        class31 var49 = class256.field4523;
        class256.field4523 = null;
        while (class69.method631((byte) 54) && class179.field3311 < 128) {
            class191.field3472[class179.field3311] = class196.field3554;
            class46.field1066[class179.field3311] = class229.field4088;
            class179.field3311++;
        }
        class68.field1492 = null;
        class139.field2714 = null;
        if (class196.field3548 != -1) {
            class224.method1609(class196.field3548, class15.field324, class238.field4238, 0, 0, 0, 0, 0);
        }
        class14.field308++;
        if (class68.field1492 != null) {
            class126.method946((byte) -115, class62.field1327, class68.field1492, class93.field1884);
            class68.field1492 = null;
        }
        while (true) {
            class183 var50;
            class31 var51;
            class31 var52;
            do {
                var50 = (class183) class170.field3195.method481(1);
                if (var50 == null) {
                    while (true) {
                        class183 var53;
                        class31 var54;
                        class31 var55;
                        do {
                            var53 = (class183) client.field3798.method481(1);
                            if (var53 == null) {
                                while (true) {
                                    class183 var56;
                                    class31 var57;
                                    class31 var58;
                                    do {
                                        var56 = (class183) class52.field1163.method481(-125);
                                        if (var56 == null) {
                                            if (class251.field4433 && class139.field2714 == null) {
                                                class251.field4433 = false;
                                            }
                                            if (class166.field3053 != null) {
                                                class220.method1594(arg0 ^ 0x197C);
                                            }
                                            if (class133.field2610 > 0 && class41.field1016[82] && class41.field1016[81] && class190.field3469 != 0) {
                                                int var59 = class159.field2998 - class190.field3469;
                                                if (var59 < 0) {
                                                    var59 = 0;
                                                } else if (var59 > 3) {
                                                    var59 = 3;
                                                }
                                                class172.method1264(var59, class247.field4394.field1349[0] + class22.field421, class196.field3547 - -class247.field4394.field1372[0], 109);
                                            }
                                            if (class275.field4808 != -1) {
                                                int var60 = class275.field4808;
                                                int var61 = class252.field4448;
                                                if (class133.field2610 > 0 && class41.field1016[82] && class41.field1016[81]) {
                                                    class172.method1264(class159.field2998, class22.field421 + var60, class196.field3547 + var61, arg0 ^ 0xFFFFFFD4);
                                                } else if (class210.field3767) {
                                                    class271.field4761++;
                                                    class196.field3553.method1267(55, -9);
                                                    class196.field3553.method71(class196.field3547 + var61, 255);
                                                    class196.field3553.method71(class125.field2445, arg0 + 169);
                                                    class196.field3553.method97(class22.field421 + var60, (byte) -2);
                                                    class196.field3553.method89(class210.field3772, (byte) 119);
                                                    class150.field2847 = class32.field817;
                                                    class108.field2179 = 0;
                                                    class44.field1035 = class183.field3365;
                                                    class36.field868 = 1;
                                                } else {
                                                    boolean var62 = class96.method786(var60, 0, 0, 0, 0, 0, 0, true, class247.field4394.field1349[0], class247.field4394.field1372[0], false, var61);
                                                    if (var62) {
                                                        class150.field2847 = class32.field817;
                                                        class44.field1035 = class183.field3365;
                                                        class36.field868 = 1;
                                                        class108.field2179 = 0;
                                                    }
                                                }
                                                class275.field4808 = -1;
                                                class210.field3767 = false;
                                            }
                                            class104.method834((byte) 68);
                                            if (class259.field4592 != var48) {
                                                if (var48 != null) {
                                                    class254.method1771(var48, 8);
                                                }
                                                if (class259.field4592 != null) {
                                                    class254.method1771(class259.field4592, 8);
                                                }
                                            }
                                            if (class256.field4523 != var49 && class55.field1222 == class255.field4503) {
                                                if (var49 != null) {
                                                    class254.method1771(var49, 8);
                                                }
                                                if (class256.field4523 != null) {
                                                    class254.method1771(class256.field4523, 8);
                                                }
                                            }
                                            if (class256.field4523 == null) {
                                                if (class255.field4503 > 0) {
                                                    class255.field4503--;
                                                }
                                            } else if (class55.field1222 > class255.field4503) {
                                                class255.field4503++;
                                                if (class55.field1222 == class255.field4503) {
                                                    class254.method1771(class256.field4523, arg0 ^ 0x5E);
                                                }
                                            }
                                            if (class215.field3931 == 1) {
                                                class149.method1085((byte) -128);
                                            } else if (class215.field3931 == 2) {
                                                class272.method1861(20332);
                                            } else {
                                                class259.method1798(117);
                                            }
                                            for (int var63 = 0; var63 < 5; var63++) {
                                                int var10002 = class236.field4227[var63]++;
                                            }
                                            int var64 = class35.method344(-117);
                                            int var65 = class1.method1(1619113060);
                                            if (var64 > 4500 && var65 > 4500) {
                                                class23.field436++;
                                                class107.field2152 = 250;
                                                class194.method1404(arg0 - 165, 4000);
                                                class196.field3553.method1267(133, -9);
                                            }
                                            if (class244.field4356 != null && class244.field4356.field493 == 1) {
                                                if (class244.field4356.field492 != null) {
                                                    class223.method1601(class270.field4760, 12651, class265.field4669);
                                                }
                                                class270.field4760 = null;
                                                class265.field4669 = false;
                                                class244.field4356 = null;
                                            }
                                            class261.field4613++;
                                            class124.field2438++;
                                            class53.field1189++;
                                            if (class124.field2438 > 500) {
                                                class124.field2438 = 0;
                                                int var66 = (int) (Math.random() * 8.0D);
                                                if ((var66 & 0x1) == 1) {
                                                    class139.field2719 += class229.field4089;
                                                }
                                                if ((var66 & 0x4) == 4) {
                                                    class236.field4222 += class139.field2712;
                                                }
                                                if ((var66 & 0x2) == 2) {
                                                    class132.field2602 += class229.field4082;
                                                }
                                            }
                                            if (class139.field2719 < -50) {
                                                class229.field4089 = 2;
                                            }
                                            if (class132.field2602 < -55) {
                                                class229.field4082 = 2;
                                            }
                                            if (class53.field1189 > 500) {
                                                int var67 = (int) (Math.random() * 8.0D);
                                                class53.field1189 = 0;
                                                if ((var67 & 0x1) == 1) {
                                                    class147.field2811 += class28.field513;
                                                }
                                                if ((var67 & 0x2) == 2) {
                                                    class50.field1139 += class238.field4239;
                                                }
                                            }
                                            if (class236.field4222 < -40) {
                                                class139.field2712 = 1;
                                            }
                                            if (class132.field2602 > 55) {
                                                class229.field4082 = -2;
                                            }
                                            if (class147.field2811 < -60) {
                                                class28.field513 = 2;
                                            }
                                            if (class50.field1139 < -20) {
                                                class238.field4239 = 1;
                                            }
                                            if (class147.field2811 > 60) {
                                                class28.field513 = -2;
                                            }
                                            if (class139.field2719 > 50) {
                                                class229.field4089 = -2;
                                            }
                                            if (class50.field1139 > 10) {
                                                class238.field4239 = -1;
                                            }
                                            if (class236.field4222 > 40) {
                                                class139.field2712 = -1;
                                            }
                                            if (class261.field4613 > 50) {
                                                class196.field3553.method1267(78, -9);
                                                class254.field4484++;
                                            }
                                            if (class15.field326) {
                                                class15.method160(-8);
                                                class15.field326 = false;
                                            }
                                            try {
                                                if (class175.field3261 != null && class196.field3553.field146 > 0) {
                                                    class175.field3261.method1509(class196.field3553.field124, 0, class196.field3553.field146, true);
                                                    class196.field3553.field146 = 0;
                                                    class261.field4613 = 0;
                                                    return;
                                                }
                                                return;
                                            } catch (IOException var68) {
                                                class261.method1805(40);
                                                return;
                                            }
                                        }
                                        var57 = var56.field3369;
                                        if (var57.field716 < 0) {
                                            break;
                                        }
                                        var58 = class272.method1858(var57.field798, 65535);
                                    } while (var58 == null || var58.field732 == null || var57.field716 >= var58.field732.length || var58.field732[var57.field716] != var57);
                                    class104.method835(var56, (byte) 41);
                                }
                            }
                            var54 = var53.field3369;
                            if (var54.field716 < 0) {
                                break;
                            }
                            var55 = class272.method1858(var54.field798, 65535);
                        } while (var55 == null || var55.field732 == null || var55.field732.length <= var54.field716 || var55.field732[var54.field716] != var54);
                        class104.method835(var53, (byte) 41);
                    }
                }
                var51 = var50.field3369;
                if (var51.field716 < 0) {
                    break;
                }
                var52 = class272.method1858(var51.field798, 65535);
            } while (var52 == null || var52.field732 == null || var51.field716 >= var52.field732.length || var52.field732[var51.field716] != var51);
            class104.method835(var50, (byte) 41);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(II)V")
    public static final void method444(int arg0, int arg1) {
        field1032++;
        if (~arg1 == arg0 || !class82.field1750[arg1]) {
            return;
        }
        class236.field4213.method1120(11575, arg1);
        if (class259.field4572[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class259.field4572[arg1].length; var3++) {
            if (class259.field4572[arg1][var3] != null) {
                if (class259.field4572[arg1][var3].field655 == 2) {
                    var2 = false;
                } else {
                    class259.field4572[arg1][var3] = null;
                }
            }
        }
        if (var2) {
            class259.field4572[arg1] = null;
        }
        class82.field1750[arg1] = false;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method445(byte[] arg0, boolean arg1) {
        if (!arg1) {
            method443((byte) 70);
        }
        class8 var2 = new class8(arg0);
        int var3 = var2.method63((byte) 112);
        field1030++;
        int var4 = var2.method70(65280);
        if (var4 < 0 || !(class14.field270 == 0 || var4 <= class14.field270)) {
            throw new RuntimeException();
        } else if (var3 == 0) {
            byte[] var7 = new byte[var4];
            var2.method51(0, var4, (byte) -105, var7);
            return var7;
        } else {
            int var5 = var2.method70(65280);
            if (var5 < 0 || !(class14.field270 == 0 || class14.field270 >= var5)) {
                throw new RuntimeException();
            }
            byte[] var6 = new byte[var5];
            if (var3 == 1) {
                class85.method722(var6, var5, arg0, var4, 9);
            } else {
                class130.field2562.method902(var6, 8, var2);
            }
            return var6;
        }
    }
}
