import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class38 extends class35 {

    @OriginalMember(owner = "client!fb", name = "Bc", descriptor = "Lv;")
    public static class146 field841 = class159.method1226((byte) -37, "Fertigkeit)2");

    @OriginalMember(owner = "client!fb", name = "Cc", descriptor = "Z")
    public static boolean field842 = false;

    @OriginalMember(owner = "client!fb", name = "Ac", descriptor = "[Lie;")
    public static class61[] field840 = new class61[1000];

    @OriginalMember(owner = "client!fb", name = "Mc", descriptor = "I")
    public static int field852 = 255;

    @OriginalMember(owner = "client!fb", name = "Fc", descriptor = "[[I")
    public static int[][] field845 = new int[104][104];

    @OriginalMember(owner = "client!fb", name = "Oc", descriptor = "Lv;")
    private static class146 field854 = class159.method1226((byte) -37, "Close");

    @OriginalMember(owner = "client!fb", name = "Hc", descriptor = "Lv;")
    public static class146 field847 = field854;

    @OriginalMember(owner = "client!fb", name = "Ec", descriptor = "Lua;")
    public static class140 field844 = new class140(64);

    @OriginalMember(owner = "client!fb", name = "Sc", descriptor = "Lv;")
    public static class146 field858 = class159.method1226((byte) -37, "Registrierter Benutzer");

    @OriginalMember(owner = "client!fb", name = "Uc", descriptor = "I")
    public static int field860 = 0;

    @OriginalMember(owner = "client!fb", name = "Rc", descriptor = "[Ldc;")
    public static class25[] field857 = new class25[256];

    @OriginalMember(owner = "client!fb", name = "Qc", descriptor = "Lv;")
    private static class146 field856 = class159.method1226((byte) -37, "You need a members account to login to this world)3");

    @OriginalMember(owner = "client!fb", name = "Tc", descriptor = "Lv;")
    public static class146 field859 = field856;

    @OriginalMember(owner = "client!fb", name = "Xc", descriptor = "I")
    public static int field863 = 0;

    @OriginalMember(owner = "client!fb", name = "Wc", descriptor = "Lua;")
    public static class140 field862 = new class140(64);

    @OriginalMember(owner = "client!fb", name = "Yc", descriptor = "I")
    public static int field864 = -1;

    @OriginalMember(owner = "client!fb", name = "Dc", descriptor = "I")
    public static int field843;

    @OriginalMember(owner = "client!fb", name = "Gc", descriptor = "I")
    public static int field846;

    @OriginalMember(owner = "client!fb", name = "Ic", descriptor = "I")
    public static int field848;

    @OriginalMember(owner = "client!fb", name = "Kc", descriptor = "I")
    public static int field850;

    @OriginalMember(owner = "client!fb", name = "Lc", descriptor = "I")
    public static int field851;

    @OriginalMember(owner = "client!fb", name = "Nc", descriptor = "I")
    public static int field853;

    @OriginalMember(owner = "client!fb", name = "Pc", descriptor = "I")
    public static int field855;

    @OriginalMember(owner = "client!fb", name = "Vc", descriptor = "Lla;")
    public static class77 field861;

    @OriginalMember(owner = "client!fb", name = "Jc", descriptor = "Llc;")
    public class79 field849;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "(B)V")
    public static void method254(byte arg0) {
        field859 = null;
        field847 = null;
        field840 = null;
        field856 = null;
        field845 = null;
        field857 = null;
        field854 = null;
        field862 = null;
        field858 = null;
        field844 = null;
        field861 = null;
        if (arg0 < 8) {
            field841 = null;
        }
        field841 = null;
    }

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "(B)Lu;")
    public final class139 method255(byte arg0) {
        ++field846;
        if (arg0 > -90) {
            return null;
        } else if (this.field849 == null) {
            return null;
        } else {
            class72 var2 = super.field753 != -1 && ~super.field791 == -1 ? class141.method1052(true, super.field753) : null;
            class72 var3 = ~super.field809 == 0 || ~super.field809 == ~super.field752 && var2 != null ? null : class141.method1052(true, super.field809);
            class139 var4 = this.field849.method611(super.field793, super.field747, var3, var2, 56);
            if (var4 == null) {
                return null;
            } else {
                var4.method1031();
                super.field769 = var4.field1488;
                if (~super.field817 != 0 && super.field804 != -1) {
                    class139 var5 = class100.method830(super.field817, -18626).method891(19631, super.field804);
                    if (var5 != null) {
                        class139[] var6 = new class139[] { var4, var5 };
                        var5.method1037(0, -super.field770, 0);
                        var4 = new class139(var6, 2);
                    }
                }
                if (this.field849.field1922 == 1) {
                    var4.field3145 = true;
                }
                return var4;
            }
        }
    }

    @OriginalMember(owner = "client!fb", name = "h", descriptor = "(I)Z")
    public static final boolean method256(int arg0) {
        ++field855;
        if (class58.field1298 == null) {
            return false;
        } else {
            try {
                int var1 = class58.field1298.method1073(arg0 ^ arg0);
                if (var1 == 0) {
                    return false;
                }
                if (~class58.field1301 == 0) {
                    class58.field1298.method1072(0, class29.field597.field2320, 1, (byte) -52);
                    class29.field597.field2304 = 0;
                    class58.field1301 = class29.field597.method268((byte) 127);
                    class35.field815 = class3.field85[class58.field1301];
                    --var1;
                }
                if (~class35.field815 == 0) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    class58.field1298.method1072(0, class29.field597.field2320, 1, (byte) -52);
                    class35.field815 = class29.field597.field2320[0] & 255;
                    --var1;
                }
                if (~class35.field815 == 1) {
                    if (~var1 >= -2) {
                        return false;
                    }
                    class58.field1298.method1072(0, class29.field597.field2320, 2, (byte) -52);
                    class29.field597.field2304 = 0;
                    class35.field815 = class29.field597.method795(1);
                    var1 -= 2;
                }
                if (~class35.field815 < ~var1) {
                    return false;
                }
                class29.field597.field2304 = 0;
                class58.field1298.method1072(0, class29.field597.field2320, class35.field815, (byte) -52);
                class79.field1951 = 0;
                class87.field2073 = class5.field122;
                class5.field122 = class150.field3465;
                class150.field3465 = class58.field1301;
                if (class58.field1301 == 80) {
                    int var2 = class29.field597.method740((byte) 125);
                    int var3 = class29.field597.method795(1);
                    class26 var4;
                    if (var2 >= 0) {
                        var4 = class64.method466(arg0 ^ 1922528753, var2);
                    } else {
                        var4 = null;
                    }
                    if (var4 != null) {
                        for (int var5 = 0; var4.field519.length > var5; ++var5) {
                            var4.field519[var5] = 0;
                            var4.field440[var5] = 0;
                        }
                    }
                    if (var2 < -70000) {
                        var3 += 32768;
                    }
                    class89.method706(var3, 3);
                    int var6 = class29.field597.method795(1);
                    for (int var7 = 0; var7 < var6; ++var7) {
                        int var8 = class29.field597.method784(false);
                        int var9 = class29.field597.method785((byte) 126);
                        if (~var9 == -256) {
                            var9 = class29.field597.method740((byte) -115);
                        }
                        if (var4 != null && var7 < var4.field519.length) {
                            var4.field519[var7] = var8;
                            var4.field440[var7] = var9;
                        }
                        class72.method520(var9, var7, var8 + -1, var3, false);
                    }
                    if (var4 != null) {
                        class75.method567((byte) 121, var4);
                    }
                    class152.method1140(true);
                    class78.field1892[class90.method711(class70.field1633++, 31)] = class90.method711(var3, 32767);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -38) {
                    int var10 = class29.field597.method790((byte) 73);
                    int var11 = class29.field597.method790((byte) 73);
                    int var12 = class29.field597.method790((byte) 73);
                    int var13 = class29.field597.method790((byte) 73);
                    class12.field187[var10] = true;
                    class101.field2449[var10] = var11;
                    class105.field2522[var10] = var12;
                    class158.field3640[var10] = var13;
                    class15.field243[var10] = 0;
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 203) {
                    for (int var14 = 0; class148.field3454.length > var14; ++var14) {
                        if (class8.field160[var14] != class148.field3454[var14]) {
                            class148.field3454[var14] = class8.field160[var14];
                            class118.method905(var14, -4);
                            class107.field2551[class90.method711(31, class69.field1573++)] = var14;
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 165) {
                    int var15 = class29.field597.method748(arg0 ^ 13771);
                    int var16 = class29.field597.method743(arg0 ^ 13734);
                    class26 var17 = class64.method466(-1922515024, var15);
                    if (~var17.field530 != ~var16 || ~var16 == 0) {
                        var17.field573 = 0;
                        var17.field556 = 0;
                        var17.field530 = var16;
                        class75.method567((byte) 126, var17);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 9) {
                    class150.field3477 = false;
                    for (int var18 = 0; var18 < 5; ++var18) {
                        class12.field187[var18] = false;
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 198) {
                    class63.field1421 = 0;
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -162) {
                    int var19 = class29.field597.method780(7335);
                    class6.field136 = var19;
                    class95.method750(false, var19);
                    class116.method889((byte) -112, class6.field136);
                    for (int var20 = 0; var20 < 100; ++var20) {
                        class83.field2013[var20] = true;
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -18) {
                    class28.method195(false, 15942);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 86) {
                    field863 = 30 * class29.field597.method780(arg0 ^ -10522);
                    class142.field3246 = class44.field1016;
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -77) {
                    long var21 = class29.field597.method796((byte) -126);
                    int var23 = class29.field597.method795(1);
                    int var24 = class29.field597.method790((byte) 73);
                    class146 var25 = class68.method483(arg0 ^ -13724, var21).method1087(false);
                    for (int var26 = 0; var26 < class124.field2892; ++var26) {
                        if (class120.field2776[var26] == var21) {
                            if (~class100.field2433[var26] != ~var23) {
                                class100.field2433[var26] = var23;
                                if (~var23 < -1) {
                                    class26.method174(5, class158.field3633, (byte) -76, class71.method509(new class146[] { var25, class115.field2680 }, (byte) -77));
                                }
                                if (~var23 == -1) {
                                    class26.method174(5, class158.field3633, (byte) -76, class71.method509(new class146[] { var25, class18.field295 }, (byte) 80));
                                }
                            }
                            class111.field2627[var26] = var24;
                            var25 = null;
                            break;
                        }
                    }
                    if (var25 != null && ~class124.field2892 > -201) {
                        class120.field2776[class124.field2892] = var21;
                        class63.field1423[class124.field2892] = var25;
                        class100.field2433[class124.field2892] = var23;
                        class111.field2627[class124.field2892] = var24;
                        ++class124.field2892;
                    }
                    class87.field2071 = class44.field1016;
                    int var27 = class124.field2892;
                    boolean var28 = false;
                    while (var27 > 0) {
                        boolean var29 = true;
                        --var27;
                        for (int var30 = 0; ~var27 < ~var30; ++var30) {
                            if (class100.field2433[var30] != class33.field713 && ~class100.field2433[var30 + 1] == ~class33.field713 || ~class100.field2433[var30] == -1 && class100.field2433[var30 + 1] != 0) {
                                var29 = false;
                                int var31 = class100.field2433[var30];
                                class100.field2433[var30] = class100.field2433[var30 - -1];
                                class100.field2433[var30 + 1] = var31;
                                class146 var32 = class63.field1423[var30];
                                class63.field1423[var30] = class63.field1423[var30 + 1];
                                class63.field1423[var30 - -1] = var32;
                                long var33 = class120.field2776[var30];
                                class120.field2776[var30] = class120.field2776[var30 + 1];
                                class120.field2776[var30 + 1] = var33;
                                int var35 = class111.field2627[var30];
                                class111.field2627[var30] = class111.field2627[var30 + 1];
                                class111.field2627[var30 + 1] = var35;
                            }
                        }
                        if (var29) {
                            break;
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 121) {
                    int var36 = class29.field597.method740((byte) 86);
                    class146 var37 = class29.field597.method772(-110);
                    class26 var38 = class64.method466(arg0 ^ 1922528753, var36);
                    if (!var37.method1107((byte) -86, var38.field441)) {
                        var38.field441 = var37;
                        class75.method567((byte) 120, var38);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -35) {
                    class152.method1140(true);
                    int var39 = class29.field597.method748(-85);
                    int var40 = class29.field597.method785((byte) 13);
                    int var41 = class29.field597.method789(-32769);
                    class64.field1443[var41] = var39;
                    class94.field2218[var41] = var40;
                    class9.field167[var41] = 1;
                    for (int var42 = 0; var42 < 98; ++var42) {
                        if (~var39 <= ~class77.field1858[var42]) {
                            class9.field167[var41] = var42 + 2;
                        }
                    }
                    class58.field1308[class90.method711(31, class145.field3301++)] = var41;
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 97) {
                    class152.method1140(true);
                    class103.field2505 = class29.field597.method790((byte) 73);
                    class142.field3246 = class44.field1016;
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -163) {
                    class42.method280((byte) -127, class29.field597);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -215) {
                    int var43 = class29.field597.method787((byte) -76);
                    int var44 = class29.field597.method789(-32769);
                    int var45 = class29.field597.method787((byte) -74);
                    class148.field3428 = var45 >> 1;
                    class116.field2696.method233((1 & var45) == 1, 0, var44, var43);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -5) {
                    class41.field934 = class29.field597.method790((byte) 73);
                    if (class41.field934 == 1) {
                        class157.field3615 = class29.field597.method795(1);
                    }
                    if (class41.field934 >= 2 && class41.field934 <= 6) {
                        if (~class41.field934 == -3) {
                            class148.field3432 = 64;
                            class64.field1448 = 64;
                        }
                        if (class41.field934 == 3) {
                            class64.field1448 = 64;
                            class148.field3432 = 0;
                        }
                        if (class41.field934 == 4) {
                            class64.field1448 = 64;
                            class148.field3432 = 128;
                        }
                        if (class41.field934 == 5) {
                            class148.field3432 = 64;
                            class64.field1448 = 0;
                        }
                        if (~class41.field934 == -7) {
                            class148.field3432 = 64;
                            class64.field1448 = 128;
                        }
                        class41.field934 = 2;
                        class82.field2006 = class29.field597.method795(1);
                        class82.field2002 = class29.field597.method795(1);
                        class159.field3656 = class29.field597.method790((byte) 73);
                    }
                    if (~class41.field934 == -11) {
                        class78.field1895 = class29.field597.method795(1);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -75) {
                    class28.method195(true, 15942);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -167) {
                    if (class6.field136 != -1) {
                        class6.method52((byte) -11, 0, class6.field136);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 178) {
                    class74.field1747 = class29.field597.method790((byte) 73);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -41) {
                    int var46 = class29.field597.method747((byte) 85);
                    int var47 = class29.field597.method780(7335);
                    class26 var48 = class64.method466(arg0 + -1922501265, var46);
                    if (var48 != null && var48.field479 == 0) {
                        if (~var47 < ~(-var48.field513 + var48.field491)) {
                            var47 = -var48.field513 + var48.field491;
                        }
                        if (var47 < 0) {
                            var47 = 0;
                        }
                        if (var48.field505 != var47) {
                            var48.field505 = var47;
                            class75.method567((byte) 115, var48);
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -242) {
                    int var49 = class29.field597.method784(false);
                    if (var49 == 65535) {
                        var49 = -1;
                    }
                    class152.method1144(var49, 115);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 149) {
                    int var50 = class29.field597.method786((byte) 127);
                    int var51 = class29.field597.method784(false);
                    if (var51 == 65535) {
                        var51 = -1;
                    }
                    class3.method18(0, var51, var50);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -59) {
                    long var52 = class29.field597.method796((byte) -117);
                    long var54 = (long) class29.field597.method795(arg0 + 13760);
                    long var56 = (long) class29.field597.method763(true);
                    int var58 = class29.field597.method790((byte) 73);
                    long var59 = (var54 << 32) + var56;
                    boolean var61 = false;
                    for (int var62 = 0; var62 < 100; ++var62) {
                        if (class32.field678[var62] == var59) {
                            var61 = true;
                            break;
                        }
                    }
                    if (var58 <= 1) {
                        for (int var63 = 0; class54.field1233 > var63; ++var63) {
                            if (~class37.field838[var63] == ~var52) {
                                var61 = true;
                                break;
                            }
                        }
                    }
                    if (!var61 && ~field860 == -1) {
                        class32.field678[class76.field1821] = var59;
                        class76.field1821 = (class76.field1821 + 1) % 100;
                        class146 var64 = class99.method821(class124.method929(class29.field597, 32767).method1100(-52));
                        if (~var58 != -3 && var58 != 3) {
                            if (~var58 != -2) {
                                class26.method174(3, class68.method483(37, var52).method1087(false), (byte) -76, var64);
                            } else {
                                class26.method174(7, class71.method509(new class146[] { class77.field1840, class68.method483(37, var52).method1087(false) }, (byte) 79), (byte) -76, var64);
                            }
                        } else {
                            class26.method174(7, class71.method509(new class146[] { class134.field3059, class68.method483(37, var52).method1087(false) }, (byte) 98), (byte) -76, var64);
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 152) {
                    class146 var65 = class29.field597.method772(105);
                    Object[] var66 = new Object[var65.method1080(-1) - -1];
                    for (int var67 = var65.method1080(arg0 + 13758) + -1; var67 >= 0; --var67) {
                        if (~var65.method1089(126, var67) != -116) {
                            var66[var67 + 1] = new Integer(class29.field597.method740((byte) -99));
                        } else {
                            var66[var67 + 1] = class29.field597.method772(119);
                        }
                    }
                    var66[0] = new Integer(class29.field597.method740((byte) -87));
                    class120 var68 = new class120();
                    var68.field2790 = var66;
                    class25.method157(var68, arg0 ^ -13756);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -96) {
                    class152.method1140(true);
                    class47.field1088 = class29.field597.method765(65280);
                    class58.field1301 = -1;
                    class142.field3246 = class44.field1016;
                    return true;
                }
                if (class58.field1301 == 48) {
                    class137.method1015((byte) -98);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -149) {
                    class60.method419((byte) -124, class35.field815, class145.field3293, class29.field597);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 211) {
                    int var69 = class29.field597.method740((byte) -102);
                    class94 var70 = (class94) class51.field1159.method332((byte) -79, (long) var69);
                    if (var70 != null) {
                        class151.method1131(-113, true, var70);
                    }
                    if (class77.field1874 != null) {
                        class75.method567((byte) 120, class77.field1874);
                        class77.field1874 = null;
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 31) {
                    int var71 = class29.field597.method780(7335);
                    int var72 = class29.field597.method785((byte) 126);
                    int var73 = class29.field597.method745(arg0 + -786);
                    class94 var74 = (class94) class51.field1159.method332((byte) -79, (long) var73);
                    if (var74 != null) {
                        class151.method1131(arg0 + 13801, ~var74.field2225 != ~var71, var74);
                    }
                    class142.method1059(var72, var73, arg0 ^ -51903, var71);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 227) {
                    class146 var75 = class29.field597.method772(123);
                    int var76 = class29.field597.method787((byte) -33);
                    int var77 = class29.field597.method787((byte) -83);
                    if (var77 >= 1 && var77 <= 8) {
                        if (var75.method1111(class127.field2930, -41)) {
                            var75 = null;
                        }
                        class95.field2261[var77 + -1] = var75;
                        class136.field3083[var77 + -1] = var76 == 0;
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -219) {
                    class153.field3522 = class29.field597.method790((byte) 73);
                    class58.field1301 = -1;
                    class87.field2071 = class44.field1016;
                    return true;
                }
                if (~class58.field1301 == -3) {
                    int var78 = class29.field597.method784(false);
                    int var79 = class29.field597.method745(-14545);
                    int var80 = class29.field597.method784(false);
                    class26 var81 = class64.method466(-1922515024, var79);
                    var81.field444 = (var78 << 16) + var80;
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 156) {
                    boolean var82 = class29.field597.method790((byte) 73) == 1;
                    int var83 = class29.field597.method747((byte) 85);
                    class26 var84 = class64.method466(-1922515024, var83);
                    if (!var84.field522 == var82) {
                        var84.field522 = var82;
                        class75.method567((byte) 118, var84);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -125) {
                    class150.field3477 = true;
                    class148.field3458 = class29.field597.method790((byte) 73);
                    class140.field3211 = class29.field597.method790((byte) 73);
                    class120.field2793 = class29.field597.method795(1);
                    class123.field2857 = class29.field597.method790((byte) 73);
                    class148.field3453 = class29.field597.method790((byte) 73);
                    if (~class148.field3453 <= -101) {
                        int var85 = class140.field3211 * 128 + 64;
                        int var86 = class148.field3458 * 128 + 64;
                        int var87 = class79.method612(class148.field3428, var86, var85, false) - class120.field2793;
                        int var88 = -class116.field2698 + var87;
                        int var89 = -class126.field2920 + var86;
                        int var90 = -class143.field3266 + var85;
                        int var91 = (int) Math.sqrt((double) (var89 * var89 + var90 * var90));
                        class89.field2109 = 2047 & (int) (Math.atan2((double) var88, (double) var91) * 325.949D);
                        class123.field2854 = 2047 & (int) (Math.atan2((double) var89, (double) var90) * -325.949D);
                        if (~class89.field2109 > -129) {
                            class89.field2109 = 128;
                        }
                        if (class89.field2109 > 383) {
                            class89.field2109 = 383;
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -223) {
                    int var92 = class29.field597.method784(false);
                    if (var92 == 65535) {
                        var92 = -1;
                    }
                    int var93 = class29.field597.method747((byte) 85);
                    int var94 = class29.field597.method740((byte) -101);
                    int var95 = class29.field597.method754((byte) -49);
                    if (var95 == 65535) {
                        var95 = -1;
                    }
                    for (int var96 = var95; var96 <= var92; ++var96) {
                        long var97 = ((long) var93 << 32) - -((long) var96);
                        class32 var99 = class137.field3105.method332((byte) -79, var97);
                        if (var99 != null) {
                            var99.method217(arg0 ^ 12625);
                        }
                        class137.field3105.method336(var97, new class9(var94), arg0 ^ 6012);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -94) {
                    for (int var100 = 0; ~var100 > ~class125.field2902.length; ++var100) {
                        if (class125.field2902[var100] != null) {
                            class125.field2902[var100].field753 = -1;
                        }
                    }
                    for (int var101 = 0; ~class34.field735.length < ~var101; ++var101) {
                        if (class34.field735[var101] != null) {
                            class34.field735[var101].field753 = -1;
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -106) {
                    class146 var102 = class29.field597.method772(-52);
                    if (var102.method1097((byte) 103, class3.field91)) {
                        class146 var103 = var102.method1105(var102.method1090(class77.field1875, 0), -81, 0);
                        long var104 = var103.method1101(-59);
                        boolean var106 = false;
                        for (int var107 = 0; ~class54.field1233 < ~var107; ++var107) {
                            if (class37.field838[var107] == var104) {
                                var106 = true;
                                break;
                            }
                        }
                        if (!var106 && ~field860 == -1) {
                            class26.method174(4, var103, (byte) -76, class95.field2259);
                        }
                    } else if (var102.method1097((byte) 103, class37.field834)) {
                        class146 var108 = var102.method1105(var102.method1090(class77.field1875, arg0 ^ -13759), arg0 + 13664, 0);
                        long var109 = var108.method1101(111);
                        boolean var111 = false;
                        for (int var112 = 0; var112 < class54.field1233; ++var112) {
                            if (~class37.field838[var112] == ~var109) {
                                var111 = true;
                                break;
                            }
                        }
                        if (!var111 && field860 == 0) {
                            class26.method174(8, var108, (byte) -76, class121.field2813);
                        }
                    } else if (!var102.method1097((byte) 103, class100.field2427)) {
                        if (!var102.method1097((byte) 103, class113.field2647)) {
                            if (!var102.method1097((byte) 103, class5.field126)) {
                                if (!var102.method1097((byte) 103, class92.field2200)) {
                                    if (!var102.method1097((byte) 103, class59.field1328)) {
                                        class26.method174(0, class158.field3633, (byte) -76, var102);
                                    } else {
                                        class146 var118 = var102.method1105(var102.method1090(class59.field1328, 0), 95, 0);
                                        if (field860 == 0) {
                                            class26.method174(13, class158.field3633, (byte) -76, var118);
                                        }
                                    }
                                } else {
                                    class146 var119 = var102.method1105(var102.method1090(class92.field2200, 0), arg0 ^ 13706, 0);
                                    if (~field860 == -1) {
                                        class26.method174(12, class158.field3633, (byte) -76, var119);
                                    }
                                }
                            } else {
                                class146 var120 = var102.method1105(var102.method1090(class5.field126, 0), arg0 + 13885, 0);
                                class26.method174(11, class158.field3633, (byte) -76, var120);
                            }
                        } else {
                            class146 var113 = var102.method1105(var102.method1090(class77.field1875, 0), arg0 + 13868, 0);
                            boolean var114 = false;
                            long var115 = var113.method1101(-32);
                            for (int var117 = 0; var117 < class54.field1233; ++var117) {
                                if (~class37.field838[var117] == ~var115) {
                                    var114 = true;
                                    break;
                                }
                            }
                            if (!var114 && field860 == 0) {
                                class26.method174(10, var113, (byte) -76, class158.field3633);
                            }
                        }
                    } else {
                        class146 var121 = var102.method1105(var102.method1090(class77.field1875, arg0 + 13759), 114, 0);
                        long var122 = var121.method1101(-59);
                        boolean var124 = false;
                        for (int var125 = 0; class54.field1233 > var125; ++var125) {
                            if (~class37.field838[var125] == ~var122) {
                                var124 = true;
                                break;
                            }
                        }
                        if (!var124 && ~field860 == -1) {
                            class146 var126 = var102.method1105(-9 + var102.method1080(arg0 ^ 13758), arg0 ^ -13801, 1 + var102.method1090(class77.field1875, 0));
                            class26.method174(8, var121, (byte) -76, var126);
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 78) {
                    int var127 = class29.field597.method747((byte) 85);
                    class26 var128 = class64.method466(arg0 + -1922501265, var127);
                    var128.field577 = 3;
                    var128.field551 = class116.field2696.field1537.method288((byte) 79);
                    class75.method567((byte) 126, var128);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -211) {
                    int var129 = class35.field815 + class29.field597.field2304;
                    int var130 = class29.field597.method795(1);
                    int var131 = class29.field597.method795(arg0 + 13760);
                    if (~class6.field136 != ~var130) {
                        class6.field136 = var130;
                        class95.method750(false, class6.field136);
                        class116.method889((byte) -115, class6.field136);
                        for (int var132 = 0; ~var132 > -101; ++var132) {
                            class83.field2013[var132] = true;
                        }
                    }
                    while (~(var131--) < -1) {
                        int var133 = class29.field597.method740((byte) -115);
                        int var134 = class29.field597.method795(1);
                        int var135 = class29.field597.method790((byte) 73);
                        class94 var136 = (class94) class51.field1159.method332((byte) -79, (long) var133);
                        if (var136 != null && ~var136.field2225 != ~var134) {
                            class151.method1131(77, true, var136);
                            var136 = null;
                        }
                        if (var136 == null) {
                            var136 = class142.method1059(var135, var133, arg0 ^ -51903, var134);
                        }
                        var136.field2219 = true;
                    }
                    for (class94 var137 = (class94) class51.field1159.method337(-122); var137 != null; var137 = (class94) class51.field1159.method333(0)) {
                        if (var137.field2219) {
                            var137.field2219 = false;
                        } else {
                            class151.method1131(-87, true, var137);
                        }
                    }
                    class137.field3105 = new class48(512);
                    while (~var129 < ~class29.field597.field2304) {
                        int var138 = class29.field597.method740((byte) -99);
                        int var139 = class29.field597.method795(1);
                        int var140 = class29.field597.method795(1);
                        int var141 = class29.field597.method740((byte) -89);
                        for (int var142 = var139; var140 >= var142; ++var142) {
                            long var143 = ((long) var138 << 32) + (long) var142;
                            class137.field3105.method336(var143, new class9(var141), -8899);
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 23) {
                    int var145 = class29.field597.method740((byte) 36);
                    int var146 = class29.field597.method795(arg0 ^ -13760);
                    if (~var145 > 69999) {
                        var146 += 32768;
                    }
                    class26 var147;
                    if (~var145 > -1) {
                        var147 = null;
                    } else {
                        var147 = class64.method466(-1922515024, var145);
                    }
                    while (~class29.field597.field2304 > ~class35.field815) {
                        int var148 = 0;
                        int var149 = class29.field597.method759((byte) 124);
                        int var150 = class29.field597.method795(1);
                        if (var150 != 0) {
                            var148 = class29.field597.method790((byte) 73);
                            if (var148 == 255) {
                                var148 = class29.field597.method740((byte) 114);
                            }
                        }
                        if (var147 != null && var149 >= 0 && var147.field519.length > var149) {
                            var147.field519[var149] = var150;
                            var147.field440[var149] = var148;
                        }
                        class72.method520(var148, var149, var150 + -1, var146, false);
                    }
                    if (var147 != null) {
                        class75.method567((byte) 120, var147);
                    }
                    class152.method1140(true);
                    class78.field1892[class90.method711(class70.field1633++, 31)] = class90.method711(32767, var146);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 0) {
                    class49.field1133 = class29.field597.method790((byte) 73);
                    class98.field2372 = class29.field597.method790((byte) 73);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -227) {
                    int var151 = class29.field597.method795(1);
                    int var152 = class29.field597.method747((byte) 85);
                    if (~var151 == -65536) {
                        var151 = -1;
                    }
                    int var153 = class29.field597.method748(-107);
                    class26 var154 = class64.method466(-1922515024, var152);
                    if (var154.field510) {
                        var154.field485 = var151;
                        var154.field450 = var153;
                        class59 var155 = class73.method524((byte) 93, var151);
                        var154.field534 = var155.field1319;
                        var154.field523 = var155.field1339;
                        var154.field571 = var155.field1325;
                        var154.field470 = var155.field1313;
                        if (~var154.field543 < -1) {
                            var154.field523 = var154.field523 * 32 / var154.field543;
                        }
                        var154.field536 = var155.field1315;
                        var154.field486 = var155.field1312;
                        class75.method567((byte) 123, var154);
                    } else {
                        if (var151 == -1) {
                            var154.field577 = 0;
                            class58.field1301 = -1;
                            return true;
                        }
                        class59 var156 = class73.method524((byte) 117, var151);
                        var154.field534 = var156.field1319;
                        var154.field523 = var156.field1339 * 100 / var153;
                        var154.field470 = var156.field1313;
                        var154.field577 = 4;
                        var154.field551 = var151;
                        class75.method567((byte) 123, var154);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 153) {
                    long var157 = class29.field597.method796((byte) -128);
                    int var159 = class29.field597.method795(1);
                    byte var160 = class29.field597.method770((byte) -108);
                    boolean var161 = false;
                    if ((Long.MIN_VALUE & var157) != 0L) {
                        var161 = true;
                    }
                    if (var161) {
                        if (~client.field350 == -1) {
                            class58.field1301 = -1;
                            return true;
                        }
                        long var162 = var157 & Long.MAX_VALUE;
                        boolean var164 = false;
                        int var165;
                        for (var165 = 0; var165 < client.field350 && (class32.field672[var165].field679 != var162 || class32.field672[var165].field3046 != var159); ++var165) {
                        }
                        if (var165 < client.field350) {
                            while (client.field350 + -1 > var165) {
                                class32.field672[var165] = class32.field672[var165 + 1];
                                ++var165;
                            }
                            --client.field350;
                            class32.field672[client.field350] = null;
                        }
                    } else {
                        class134 var166 = new class134();
                        var166.field679 = var157;
                        var166.field3044 = class68.method483(37, var166.field679);
                        var166.field3046 = var159;
                        var166.field3053 = var160;
                        int var167;
                        for (var167 = client.field350 + -1; var167 >= 0; --var167) {
                            int var168 = class32.field672[var167].field3044.method1106(false, var166.field3044);
                            if (var168 == 0) {
                                class32.field672[var167].field3046 = var159;
                                class32.field672[var167].field3053 = var160;
                                if (class6.field133 == var157) {
                                    class59.field1367 = var160;
                                }
                                class58.field1301 = -1;
                                class88.field2085 = class44.field1016;
                                return true;
                            }
                            if (~var168 > -1) {
                                break;
                            }
                        }
                        if (client.field350 >= class32.field672.length) {
                            class58.field1301 = -1;
                            return true;
                        }
                        for (int var169 = client.field350 - 1; var167 < var169; --var169) {
                            class32.field672[var169 + 1] = class32.field672[var169];
                        }
                        if (client.field350 == 0) {
                            class32.field672 = new class134[100];
                        }
                        class32.field672[var167 + 1] = var166;
                        if (~class6.field133 == ~var157) {
                            class59.field1367 = var160;
                        }
                        ++client.field350;
                    }
                    class58.field1301 = -1;
                    class88.field2085 = class44.field1016;
                    return true;
                }
                if (class58.field1301 == 103) {
                    int var170 = class29.field597.method795(1);
                    int var171 = class29.field597.method790((byte) 73);
                    int var172 = class29.field597.method795(1);
                    class110.method870(var170, var172, var171, (byte) 110);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 143) {
                    int var173 = class29.field597.method747((byte) 85);
                    class159.field3661 = class145.field3293.method116(var173, 3);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 245) {
                    class54.field1233 = class35.field815 / 8;
                    for (int var174 = 0; var174 < class54.field1233; ++var174) {
                        class37.field838[var174] = class29.field597.method796((byte) -103);
                        class90.field2138[var174] = class68.method483(37, class37.field838[var174]);
                    }
                    class58.field1301 = -1;
                    class87.field2071 = class44.field1016;
                    return true;
                }
                if (~class58.field1301 == -187) {
                    int var175 = class29.field597.method784(false);
                    int var176 = class29.field597.method740((byte) -121);
                    class8.field160[var175] = var176;
                    if (class148.field3454[var175] != var176) {
                        class148.field3454[var175] = var176;
                        class118.method905(var175, arg0 + 13755);
                    }
                    class107.field2551[class90.method711(class69.field1573++, 31)] = var175;
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 189) {
                    long var177 = class29.field597.method796((byte) -104);
                    class29.field597.method770((byte) -112);
                    long var179 = class29.field597.method796((byte) -110);
                    long var181 = (long) class29.field597.method795(1);
                    long var183 = (long) class29.field597.method763(true);
                    long var185 = (var181 << 32) + var183;
                    int var187 = class29.field597.method790((byte) 73);
                    boolean var188 = false;
                    for (int var189 = 0; var189 < 100; ++var189) {
                        if (~class32.field678[var189] == ~var185) {
                            var188 = true;
                            break;
                        }
                    }
                    if (var187 <= 1) {
                        for (int var190 = 0; var190 < class54.field1233; ++var190) {
                            if (~class37.field838[var190] == ~var177) {
                                var188 = true;
                                break;
                            }
                        }
                    }
                    if (!var188 && field860 == 0) {
                        class32.field678[class76.field1821] = var185;
                        class76.field1821 = (class76.field1821 + 1) % 100;
                        class146 var191 = class99.method821(class124.method929(class29.field597, 32767).method1100(arg0 + 13708));
                        if (var187 != 2 && ~var187 != -4) {
                            if (~var187 == -2) {
                                class41.method272(var191, (byte) -78, 9, class68.method483(37, var179).method1087(false), class71.method509(new class146[] { class77.field1840, class68.method483(37, var177).method1087(false) }, (byte) -118));
                            } else {
                                class41.method272(var191, (byte) -125, 9, class68.method483(37, var179).method1087(false), class68.method483(37, var177).method1087(false));
                            }
                        } else {
                            class41.method272(var191, (byte) -85, 9, class68.method483(37, var179).method1087(false), class71.method509(new class146[] { class134.field3059, class68.method483(37, var177).method1087(false) }, (byte) -124));
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 43) {
                    int var192 = class29.field597.method795(arg0 ^ -13760);
                    class125.method936(76, var192);
                    class78.field1892[class90.method711(31, class70.field1633++)] = class90.method711(32767, var192);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 221) {
                    int var193 = class29.field597.method782((byte) -112);
                    int var194 = class29.field597.method765(65280);
                    int var195 = class29.field597.method745(-14545);
                    class26 var196 = class64.method466(-1922515024, var195);
                    int var197 = var196.field481 + var194;
                    int var198 = var196.field509 - -var193;
                    if (~var196.field438 != ~var197 || ~var196.field501 != ~var198) {
                        var196.field438 = var197;
                        var196.field501 = var198;
                        class75.method567((byte) 124, var196);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -114) {
                    class88.field2085 = class44.field1016;
                    long var199 = class29.field597.method796((byte) -124);
                    if (var199 == 0L) {
                        class58.field1301 = -1;
                        class71.field1645 = null;
                        class32.field672 = null;
                        class125.field2895 = null;
                        client.field350 = 0;
                        return true;
                    }
                    long var201 = class29.field597.method796((byte) -116);
                    class71.field1645 = class68.method483(arg0 + 13796, var201);
                    class125.field2895 = class68.method483(37, var199);
                    class72.field1694 = class29.field597.method770((byte) -125);
                    int var203 = class29.field597.method790((byte) 73);
                    if (~var203 == -256) {
                        class58.field1301 = -1;
                        return true;
                    }
                    client.field350 = var203;
                    class134[] var204 = new class134[100];
                    for (int var205 = 0; ~var205 > ~client.field350; ++var205) {
                        var204[var205] = new class134();
                        var204[var205].field679 = class29.field597.method796((byte) -106);
                        var204[var205].field3044 = class68.method483(37, var204[var205].field679);
                        var204[var205].field3046 = class29.field597.method795(1);
                        var204[var205].field3053 = class29.field597.method770((byte) 110);
                        if (~class6.field133 == ~var204[var205].field679) {
                            class59.field1367 = var204[var205].field3053;
                        }
                    }
                    boolean var206 = false;
                    int var207 = client.field350;
                    while (~var207 < -1) {
                        boolean var208 = true;
                        --var207;
                        for (int var209 = 0; ~var209 > ~var207; ++var209) {
                            if (~var204[var209].field3044.method1106(false, var204[var209 + 1].field3044) < -1) {
                                class134 var210 = var204[var209];
                                var208 = false;
                                var204[var209] = var204[var209 + 1];
                                var204[var209 - -1] = var210;
                            }
                        }
                        if (var208) {
                            break;
                        }
                    }
                    class32.field672 = var204;
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 158) {
                    for (int var211 = 0; var211 < class71.field1647; ++var211) {
                        class37 var212 = class46.method316(true, var211);
                        if (var212 != null && var212.field824 == 0) {
                            class8.field160[var211] = 0;
                            class148.field3454[var211] = 0;
                        }
                    }
                    class152.method1140(true);
                    class58.field1301 = -1;
                    class69.field1573 += 32;
                    return true;
                }
                if (~class58.field1301 == -174) {
                    class78.method597(20987);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -195) {
                    int var213 = class29.field597.method754((byte) -49);
                    int var214 = class29.field597.method745(-14545);
                    class26 var215 = class64.method466(-1922515024, var214);
                    if (var215.field577 != 2 || var215.field551 != var213) {
                        var215.field577 = 2;
                        var215.field551 = var213;
                        class75.method567((byte) 126, var215);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 108 || class58.field1301 == 234 || class58.field1301 == 92 || ~class58.field1301 == -188 || ~class58.field1301 == -110 || class58.field1301 == 70 || class58.field1301 == 107 || class58.field1301 == 138 || class58.field1301 == 21 || class58.field1301 == 46 || class58.field1301 == 114) {
                    class126.method940(false);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -231) {
                    class98.field2372 = class29.field597.method787((byte) -84);
                    class49.field1133 = class29.field597.method789(-32769);
                    for (int var216 = class98.field2372; class98.field2372 + 8 > var216; ++var216) {
                        for (int var217 = class49.field1133; class49.field1133 + 8 > var217; ++var217) {
                            if (class148.field3434[class148.field3428][var216][var217] != null) {
                                class148.field3434[class148.field3428][var216][var217] = null;
                                class118.method900((byte) 73, var216, var217);
                            }
                        }
                    }
                    for (class101 var218 = (class101) class12.field183.method1138(arg0 + 39611); var218 != null; var218 = (class101) class12.field183.method1142(1)) {
                        if (var218.field2447 >= class98.field2372 && ~var218.field2447 > ~(class98.field2372 + 8) && ~class49.field1133 >= ~var218.field2453 && var218.field2453 < class49.field1133 + 8 && class148.field3428 == var218.field2446) {
                            var218.field2444 = 0;
                        }
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 219) {
                    class49.field1133 = class29.field597.method785((byte) 12);
                    class98.field2372 = class29.field597.method787((byte) -123);
                    while (class35.field815 > class29.field597.field2304) {
                        class58.field1301 = class29.field597.method790((byte) 73);
                        class126.method940(false);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -200) {
                    int var219 = class29.field597.method747((byte) 85);
                    class26 var220 = class64.method466(-1922515024, var219);
                    for (int var221 = 0; var220.field519.length > var221; ++var221) {
                        var220.field519[var221] = -1;
                        var220.field519[var221] = 0;
                    }
                    class75.method567((byte) 118, var220);
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -237) {
                    int var222 = class29.field597.method748(arg0 ^ 13711);
                    int var223 = class29.field597.method754((byte) -49);
                    int var224 = (32391 & var223) >> 10;
                    int var225 = (var223 & 1009) >> 5;
                    int var226 = var223 & 31;
                    int var227 = (var224 << 19) + (var226 << 3) - -(var225 << 11);
                    class26 var228 = class64.method466(-1922515024, var222);
                    if (var228.field580 != var227) {
                        var228.field580 = var227;
                        class75.method567((byte) 120, var228);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 131) {
                    class26.field520 = class29.field597.method790((byte) 73);
                    class54.field1238 = class29.field597.method790((byte) 73);
                    class31.field655 = class29.field597.method790((byte) 73);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 154) {
                    int var229 = class29.field597.method740((byte) -110);
                    int var230 = class29.field597.method780(7335);
                    int var231 = class29.field597.method754((byte) -49);
                    int var232 = class29.field597.method780(7335);
                    class26 var233 = class64.method466(-1922515024, var229);
                    if (~var233.field534 != ~var230 || ~var233.field470 != ~var231 || var233.field523 != var232) {
                        var233.field523 = var232;
                        var233.field470 = var231;
                        var233.field534 = var230;
                        class75.method567((byte) 114, var233);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -118) {
                    long var234 = class29.field597.method796((byte) -127);
                    class146 var236 = class99.method821(class124.method929(class29.field597, 32767).method1100(-115));
                    class26.method174(6, class68.method483(37, var234).method1087(false), (byte) -76, var236);
                    class58.field1301 = -1;
                    return true;
                }
                if (class58.field1301 == 125) {
                    class25.method152(86);
                    class58.field1301 = -1;
                    return false;
                }
                if (~class58.field1301 == -127) {
                    class150.field3477 = true;
                    class92.field2208 = class29.field597.method790((byte) 73);
                    class115.field2667 = class29.field597.method790((byte) 73);
                    class127.field2931 = class29.field597.method795(arg0 + 13760);
                    class122.field2848 = class29.field597.method790((byte) 73);
                    class3.field84 = class29.field597.method790((byte) 73);
                    if (class3.field84 >= 100) {
                        class143.field3266 = class115.field2667 * 128 + 64;
                        class126.field2920 = class92.field2208 * 128 + 64;
                        class116.field2698 = class79.method612(class148.field3428, class126.field2920, class143.field3266, false) - class127.field2931;
                    }
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -151) {
                    int var237 = class29.field597.method784(false);
                    byte var238 = class29.field597.method767(-1);
                    class8.field160[var237] = var238;
                    if (class148.field3454[var237] != var238) {
                        class148.field3454[var237] = var238;
                        class118.method905(var237, -4);
                    }
                    class107.field2551[class90.method711(31, class69.field1573++)] = var237;
                    class58.field1301 = -1;
                    return true;
                }
                if (~class58.field1301 == -13) {
                    int var239 = class29.field597.method784(false);
                    int var240 = class29.field597.method745(-14545);
                    class26 var241 = class64.method466(-1922515024, var240);
                    if (~var241.field577 != -2 || var241.field551 != var239) {
                        var241.field577 = 1;
                        var241.field551 = var239;
                        class75.method567((byte) 124, var241);
                    }
                    class58.field1301 = -1;
                    return true;
                }
                class122.method921((byte) 90, "T1 - " + class58.field1301 + "," + class5.field122 + "," + class87.field2073 + " - " + class35.field815, (Throwable) null);
                class25.method152(81);
            } catch (IOException var245) {
                class111.method873((byte) 55);
            } catch (Exception var246) {
                String var243 = "T2 - " + class58.field1301 + "," + class5.field122 + "," + class87.field2073 + " - " + class35.field815 + "," + (class116.field2696.field788[0] + class63.field1429) + "," + (class116.field2696.field738[0] + class76.field1814) + " - ";
                for (int var244 = 0; ~var244 > ~class35.field815 && var244 < 50; ++var244) {
                    var243 = var243 + class29.field597.field2320[var244] + ",";
                }
                class122.method921((byte) 90, var243, var246);
                class25.method152(41);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!fb", name = "g", descriptor = "(I)Z")
    public final boolean method235(int arg0) {
        if (arg0 > -77) {
            method254((byte) 92);
        }
        ++field853;
        return this.field849 != null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ILk;IIII)V")
    public static final void method257(int arg0, class69 arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field848;
        class5 var6 = new class5();
        var6.field117 = arg1.field1603;
        var6.field95 = arg1.field1615;
        var6.field121 = arg1.field1563;
        var6.field120 = arg5 * 128;
        if (arg0 != 2064) {
            method259(false);
        }
        var6.field112 = arg2 * 128;
        var6.field98 = arg4;
        int var7 = arg1.field1584;
        var6.field127 = arg1.field1564;
        int var8 = arg1.field1597;
        if (~arg3 == -2 || ~arg3 == -4) {
            var7 = arg1.field1597;
            var8 = arg1.field1584;
        }
        var6.field108 = arg1.field1588 * 128;
        var6.field101 = (arg5 + var8) * 128;
        var6.field99 = (arg2 + var7) * 128;
        if (arg1.field1598 != null) {
            var6.field100 = arg1;
            var6.method41((byte) 80);
        }
        class68.field1548.method1136(var6, false);
        if (var6.field121 != null) {
            var6.field102 = var6.field95 + (int) (Math.random() * (double) (var6.field127 - var6.field95));
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(ZLdd;I)I")
    public static final int method258(boolean arg0, class26 arg1, int arg2) {
        ++field850;
        if (arg0) {
            return 105;
        } else if (arg1.field531 != null && ~arg1.field531.length < ~arg2) {
            try {
                int[] var3 = arg1.field531[arg2];
                int var4 = 0;
                int var5 = 0;
                byte var6 = 0;
                while (true) {
                    int var7 = var3[var5++];
                    int var8 = 0;
                    byte var9 = 0;
                    if (~var7 == -1) {
                        return var4;
                    }
                    if (~var7 == -2) {
                        var8 = class94.field2218[var3[var5++]];
                    }
                    if (~var7 == -16) {
                        var9 = 1;
                    }
                    if (~var7 == -17) {
                        var9 = 2;
                    }
                    if (var7 == 17) {
                        var9 = 3;
                    }
                    if (var7 == 2) {
                        var8 = class9.field167[var3[var5++]];
                    }
                    if (var7 == 3) {
                        var8 = class64.field1443[var3[var5++]];
                    }
                    if (var7 == 4) {
                        int var10 = var3[var5++] << 16;
                        int var11 = var10 + var3[var5++];
                        class26 var12 = class64.method466(-1922515024, var11);
                        int var13 = var3[var5++];
                        if (var13 != -1 && (!class73.method524((byte) 123, var13).field1320 || class81.field1961)) {
                            for (int var14 = 0; ~var12.field519.length < ~var14; ++var14) {
                                if (~(var13 - -1) == ~var12.field519[var14]) {
                                    var8 += var12.field440[var14];
                                }
                            }
                        }
                    }
                    if (~var7 == -6) {
                        var8 = class148.field3454[var3[var5++]];
                    }
                    if (~var7 == -7) {
                        var8 = class77.field1858[-1 + class9.field167[var3[var5++]]];
                    }
                    if (~var7 == -8) {
                        var8 = 100 * class148.field3454[var3[var5++]] / 46875;
                    }
                    if (~var7 == -9) {
                        var8 = class116.field2696.field1532;
                    }
                    if (var7 == 9) {
                        for (int var15 = 0; ~var15 > -26; ++var15) {
                            if (class123.field2865[var15]) {
                                var8 += class9.field167[var15];
                            }
                        }
                    }
                    if (~var7 == -11) {
                        int var16 = var3[var5++] << 16;
                        int var17 = var16 + var3[var5++];
                        class26 var18 = class64.method466(-1922515024, var17);
                        int var19 = var3[var5++];
                        if (~var19 != 0 && (!class73.method524((byte) 79, var19).field1320 || class81.field1961)) {
                            for (int var20 = 0; ~var18.field519.length < ~var20; ++var20) {
                                if (var19 + 1 == var18.field519[var20]) {
                                    var8 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var7 == -12) {
                        var8 = class103.field2505;
                    }
                    if (~var7 == -13) {
                        var8 = class47.field1088;
                    }
                    if (~var7 == -14) {
                        int var21 = class148.field3454[var3[var5++]];
                        int var22 = var3[var5++];
                        var8 = ~(var21 & 1 << var22) != -1 ? 1 : 0;
                    }
                    if (var7 == 14) {
                        int var23 = var3[var5++];
                        var8 = class79.method604(var23, true);
                    }
                    if (var7 == 18) {
                        var8 = (class116.field2696.field757 >> 7) + class63.field1429;
                    }
                    if (~var7 == -20) {
                        var8 = (class116.field2696.field790 >> 7) + class76.field1814;
                    }
                    if (var7 == 20) {
                        var8 = var3[var5++];
                    }
                    if (~var9 == -1) {
                        if (var6 == 0) {
                            var4 += var8;
                        }
                        if (var6 == 1) {
                            var4 -= var8;
                        }
                        if (var6 == 2 && ~var8 != -1) {
                            var4 /= var8;
                        }
                        if (~var6 == -4) {
                            var4 *= var8;
                        }
                        var6 = 0;
                    } else {
                        var6 = var9;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "(Z)V")
    public static final void method259(boolean arg0) {
        if (class110.field2601 != null) {
            class107 var1 = class110.field2601;
            synchronized (class110.field2601) {
                class110.field2601 = null;
            }
        }
        if (arg0) {
            field847 = null;
        }
        ++field851;
    }
}
