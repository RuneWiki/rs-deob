import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ja")
public class class83 extends class189 {

    @OriginalMember(owner = "client!ja", name = "yb", descriptor = "I")
    private int field1982 = 4096;

    @OriginalMember(owner = "client!ja", name = "jb", descriptor = "Lgg;")
    private static class63 field1967 = class116.method911(43, "button near the top of that page)3");

    @OriginalMember(owner = "client!ja", name = "pb", descriptor = "Lgg;")
    private static class63 field1973 = class116.method911(43, "wave2:");

    @OriginalMember(owner = "client!ja", name = "mb", descriptor = "Lgg;")
    public static class63 field1970 = field1967;

    @OriginalMember(owner = "client!ja", name = "qb", descriptor = "Lgg;")
    public static class63 field1974 = class116.method911(43, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!ja", name = "vb", descriptor = "[[I")
    public static int[][] field1979 = new int[][] { { 1, 1 }, { -1, 1 }, { 1, -1 }, { -1, -1 } };

    @OriginalMember(owner = "client!ja", name = "gb", descriptor = "Lgg;")
    public static class63 field1964 = class116.method911(43, "<col=ffffff>");

    @OriginalMember(owner = "client!ja", name = "sb", descriptor = "Z")
    public static boolean field1976 = false;

    @OriginalMember(owner = "client!ja", name = "nb", descriptor = "J")
    public static long field1971 = 0L;

    @OriginalMember(owner = "client!ja", name = "kb", descriptor = "Z")
    public static boolean field1968 = false;

    @OriginalMember(owner = "client!ja", name = "wb", descriptor = "Lgg;")
    public static class63 field1980 = field1973;

    @OriginalMember(owner = "client!ja", name = "rb", descriptor = "Lgg;")
    public static class63 field1975 = field1973;

    @OriginalMember(owner = "client!ja", name = "hb", descriptor = "[Lgg;")
    public static class63[] field1965 = new class63[100];

    @OriginalMember(owner = "client!ja", name = "lb", descriptor = "I")
    public static int field1969;

    @OriginalMember(owner = "client!ja", name = "ob", descriptor = "I")
    public static int field1972;

    @OriginalMember(owner = "client!ja", name = "ub", descriptor = "I")
    public static int field1978;

    @OriginalMember(owner = "client!ja", name = "xb", descriptor = "I")
    public static int field1981;

    @OriginalMember(owner = "client!ja", name = "zb", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!ja", name = "tb", descriptor = "Lrc;")
    public static class156 field1977;

    @OriginalMember(owner = "client!ja", name = "ib", descriptor = "Ljava/lang/String;")
    public static String field1966;

    @OriginalMember(owner = "client!ja", name = "<init>", descriptor = "()V")
    public class83() {
        super(1, true);
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IBLab;)V")
    public final void method77(int arg0, byte arg1, class3 arg2) {
        ++field1983;
        if (arg1 < 32) {
            field1968 = true;
        }
        if (~arg0 == -1) {
            this.field1982 = arg2.method46((byte) 65);
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(IJ)V")
    public static final void method732(int arg0, long arg1) {
        ++field1981;
        if (arg1 != 0L) {
            for (int var3 = 0; ~class37.field868 < ~var3; ++var3) {
                if (class80.field1938[var3] == arg1) {
                    --class37.field868;
                    ++class133.field2879;
                    for (int var4 = var3; var4 < class37.field868; ++var4) {
                        class140.field3022[var4] = class140.field3022[var4 - -1];
                        class123.field2713[var4] = class123.field2713[var4 - -1];
                        class80.field1938[var4] = class80.field1938[var4 + 1];
                        class198.field3959[var4] = class198.field3959[var4 + 1];
                    }
                    client.field705 = class72.field1807;
                    class141.field3031.method854(90, true);
                    class141.field3031.method32((byte) 72, arg1);
                    break;
                }
            }
            if (arg0 != 6851) {
                field1964 = null;
            }
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(II)[I")
    public final int[] method90(int arg0, int arg1) {
        ++field1969;
        if (arg0 != 0) {
            this.method90(125, -57);
        }
        int[] var3 = super.field3825.method681(arg1, (byte) -65);
        if (super.field3825.field1840) {
            int[] var4 = this.method1245(0, arg1 - 1 & class1.field4, 11433);
            int[] var5 = this.method1245(0, arg1, 11433);
            int[] var6 = this.method1245(0, class1.field4 & arg1 + 1, 11433);
            for (int var7 = 0; var7 < class54.field1430; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field1982;
                int var9 = (var5[var7 + 1 & class75.field1867] + -var5[class75.field1867 & var7 - 1]) * this.field1982;
                int var10 = var8 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var9 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (Math.sqrt((double) ((var13 - -var11 + 4096) / 4096)) * 4096.0D);
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ja", name = "d", descriptor = "(B)V")
    public static void method733(byte arg0) {
        field1964 = null;
        field1975 = null;
        field1977 = null;
        field1966 = null;
        field1967 = null;
        field1980 = null;
        field1974 = null;
        field1973 = null;
        if (arg0 == -103) {
            field1965 = null;
            field1970 = null;
            field1979 = null;
        }
    }

    @OriginalMember(owner = "client!ja", name = "a", descriptor = "(BIII)I")
    public static final int method734(byte arg0, int arg1, int arg2, int arg3) {
        ++field1972;
        if (arg0 < 62) {
            field1968 = true;
        }
        return (-arg1 + 4096) * arg3 + arg1 * arg2 >> 12;
    }

    @OriginalMember(owner = "client!ja", name = "c", descriptor = "(I)Z")
    public static final boolean method735(int arg0) {
        ++field1978;
        if (class171.field3553 == null) {
            return false;
        } else {
            try {
                int var1 = class171.field3553.method510((byte) 89);
                if (~var1 == -1) {
                    return false;
                }
                if (~class124.field2736 == 0) {
                    --var1;
                    class171.field3553.method514(0, 1, arg0 ^ -2048, class167.field3437.field48);
                    class167.field3437.field54 = 0;
                    class124.field2736 = class167.field3437.method863(arg0 + -16662);
                    class112.field2531 = class186.field3757[class124.field2736];
                }
                if (class112.field2531 == -1) {
                    if (~var1 >= -1) {
                        return false;
                    }
                    --var1;
                    class171.field3553.method514(0, 1, -1, class167.field3437.field48);
                    class112.field2531 = class167.field3437.field48[0] & 255;
                }
                if (~class112.field2531 == 1) {
                    if (var1 <= 1) {
                        return false;
                    }
                    var1 -= 2;
                    class171.field3553.method514(0, 2, -1, class167.field3437.field48);
                    class167.field3437.field54 = 0;
                    class112.field2531 = class167.field3437.method46((byte) 65);
                }
                if (~var1 > ~class112.field2531) {
                    return false;
                }
                class167.field3437.field54 = 0;
                class171.field3553.method514(0, class112.field2531, -1, class167.field3437.field48);
                class90.field2117 = 0;
                class136.field2933 = class127.field2810;
                class127.field2810 = class164.field3367;
                class164.field3367 = class124.field2736;
                if (~class124.field2736 == -28) {
                    client.method300(arg0 + -2048, false);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -96) {
                    class155.method1078((byte) 10);
                    class45.field1073 = class167.field3437.method25(0);
                    class48.field1178 = class72.field1807;
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -243) {
                    int var2 = class167.field3437.method46((byte) 65);
                    int var3 = class167.field3437.method64(31790);
                    int var4 = class167.field3437.method46((byte) 65);
                    class101.method845(var3, arg0 + -2047, var4, var2);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 220) {
                    int var5 = class167.field3437.method75(true);
                    int var6 = class167.field3437.method26(-268161579);
                    int var7 = class167.field3437.method37((byte) -3);
                    class54 var8 = class59.method555(var7, 32173);
                    int var9 = var8.field1385 + var6;
                    int var10 = var8.field1340 + var5;
                    if (var8.field1333 != var9 || ~var8.field1304 != ~var10) {
                        var8.field1304 = var10;
                        var8.field1333 = var9;
                        class113.method901(arg0 ^ 2047, var8);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -107) {
                    class63 var11 = class167.field3437.method28(-1);
                    Object[] var12 = new Object[1 + var11.method582(-53)];
                    for (int var13 = var11.method582(-103) + -1; ~var13 <= -1; --var13) {
                        if (var11.method573(arg0 + -1792, var13) == 115) {
                            var12[var13 + 1] = class167.field3437.method28(class180.method1200(arg0, -2048));
                        } else {
                            var12[var13 - -1] = new Integer(class167.field3437.method56(arg0 + -2048));
                        }
                    }
                    var12[0] = new Integer(class167.field3437.method56(-1));
                    class131 var14 = new class131();
                    var14.field2853 = var12;
                    class130.method963(var14, (byte) -113);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -117) {
                    class88.field2073 = class167.field3437.method36((byte) -63) * 30;
                    class124.field2736 = -1;
                    class48.field1178 = class72.field1807;
                    return true;
                }
                if (class124.field2736 == 127) {
                    int var15 = class167.field3437.method37((byte) -3);
                    int var16 = class167.field3437.method36((byte) -55);
                    int var17 = var16 >> 10 & 31;
                    int var18 = 31 & var16;
                    int var19 = 31 & var16 >> 5;
                    int var20 = (var18 << 3) + (var17 << 19) + (var19 << 11);
                    class54 var21 = class59.method555(var15, 32173);
                    if (var21.field1358 != var20) {
                        var21.field1358 = var20;
                        class113.method901(0, var21);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -224) {
                    int var22 = class167.field3437.method31((byte) -127);
                    if (var22 == 65535) {
                        var22 = -1;
                    }
                    int var23 = class167.field3437.method37((byte) -3);
                    int var24 = class167.field3437.method56(-1);
                    int var25 = class167.field3437.method46((byte) 65);
                    if (~var25 == -65536) {
                        var25 = -1;
                    }
                    for (int var26 = var22; var25 >= var26; ++var26) {
                        long var27 = ((long) var23 << 32) - -((long) var26);
                        class176 var29 = class167.field3460.method694(-23979, var27);
                        if (var29 != null) {
                            var29.method1172(arg0 + -2090);
                        }
                        class167.field3460.method702((byte) 122, new class89(var24), var27);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 16) {
                    int var30 = class167.field3437.method34(-857795632);
                    int var31 = class167.field3437.method31((byte) -127);
                    int var32 = class167.field3437.method19(-1);
                    class132 var33 = (class132) class133.field2885.method694(-23979, (long) var32);
                    if (var33 != null) {
                        class121.method929(var33, (byte) 117, ~var33.field2865 != ~var31);
                    }
                    client.method296(var32, var30, 126, var31);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 216) {
                    class63 var34 = class167.field3437.method28(-1);
                    int var35 = class167.field3437.method50((byte) 125);
                    class54 var36 = class59.method555(var35, 32173);
                    if (!var34.method568(var36.field1342, (byte) -127)) {
                        var36.field1342 = var34;
                        class113.method901(arg0 + -2047, var36);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -105) {
                    int var37 = class167.field3437.method40(2);
                    class130.field2836 = var37;
                    class6.method91(114, var37);
                    class50.method491(class130.field2836, (byte) -83);
                    for (int var38 = 0; ~var38 > -101; ++var38) {
                        class135.field2927[var38] = true;
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -5) {
                    int var39 = class112.field2531 + class167.field3437.field54;
                    int var40 = class167.field3437.method46((byte) 65);
                    int var41 = class167.field3437.method46((byte) 65);
                    if (~class130.field2836 != ~var40) {
                        class130.field2836 = var40;
                        class6.method91(72, class130.field2836);
                        class50.method491(class130.field2836, (byte) -83);
                        for (int var42 = 0; var42 < 100; ++var42) {
                            class135.field2927[var42] = true;
                        }
                    }
                    while (~(var41--) < -1) {
                        int var43 = class167.field3437.method56(-1);
                        int var44 = class167.field3437.method46((byte) 65);
                        int var45 = class167.field3437.method64(31790);
                        class132 var46 = (class132) class133.field2885.method694(arg0 ^ -23126, (long) var43);
                        if (var46 != null && var46.field2865 != var44) {
                            class121.method929(var46, (byte) 118, true);
                            var46 = null;
                        }
                        if (var46 == null) {
                            var46 = client.method296(var43, var45, 111, var44);
                        }
                        var46.field2866 = true;
                    }
                    for (class132 var47 = (class132) class133.field2885.method699(-10679); var47 != null; var47 = (class132) class133.field2885.method701(arg0 + -1955)) {
                        if (var47.field2866) {
                            var47.field2866 = false;
                        } else {
                            class121.method929(var47, (byte) 115, true);
                        }
                    }
                    class167.field3460 = new class78(512);
                    while (var39 > class167.field3437.field54) {
                        int var48 = class167.field3437.method56(-1);
                        int var49 = class167.field3437.method46((byte) 65);
                        int var50 = class167.field3437.method46((byte) 65);
                        int var51 = class167.field3437.method56(arg0 + -2048);
                        for (int var52 = var49; ~var52 >= ~var50; ++var52) {
                            long var53 = ((long) var48 << 32) - -((long) var52);
                            class167.field3460.method702((byte) 102, new class89(var51), var53);
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 159) {
                    int var55 = class167.field3437.method34(-857795632);
                    int var56 = class167.field3437.method33(84);
                    int var57 = class167.field3437.method33(arg0 + -1931);
                    class112.field2528 = var56 >> 1;
                    class3.field72.method473(var57, (1 & var56) == 1, var55, -106);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 191) {
                    int var58 = class167.field3437.method56(-1);
                    int var59 = class167.field3437.method46((byte) 65);
                    if (~var58 > 69999) {
                        var59 += 32768;
                    }
                    class54 var60;
                    if (var58 < 0) {
                        var60 = null;
                    } else {
                        var60 = class59.method555(var58, 32173);
                    }
                    if (var60 != null) {
                        for (int var61 = 0; ~var61 > ~var60.field1324.length; ++var61) {
                            var60.field1324[var61] = 0;
                            var60.field1315[var61] = 0;
                        }
                    }
                    class89.method773(var59, -25985);
                    int var62 = class167.field3437.method46((byte) 65);
                    for (int var63 = 0; var63 < var62; ++var63) {
                        int var64 = class167.field3437.method69((byte) 52);
                        if (~var64 == -256) {
                            var64 = class167.field3437.method37((byte) -3);
                        }
                        int var65 = class167.field3437.method40(2);
                        if (var60 != null && var60.field1324.length > var63) {
                            var60.field1324[var63] = var65;
                            var60.field1315[var63] = var64;
                        }
                        class188.method1233(1, var63, var65 + -1, var64, var59);
                    }
                    if (var60 != null) {
                        class113.method901(arg0 ^ 2047, var60);
                    }
                    class155.method1078((byte) 10);
                    class138.field2961[class110.method881(31, class175.field3601++)] = class110.method881(var59, 32767);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -45) {
                    class18.field436 = class167.field3437.method34(arg0 ^ -857795537);
                    class130.field2842 = class167.field3437.method69((byte) 52);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -3) {
                    class109.field2464 = class167.field3437.method64(arg0 + 29743);
                    if (class109.field2464 == 1) {
                        class187.field3772 = class167.field3437.method46((byte) 65);
                    }
                    if (class109.field2464 >= 2 && class109.field2464 <= 6) {
                        if (class109.field2464 == 2) {
                            class188.field3799 = 64;
                            class65.field1649 = 64;
                        }
                        if (class109.field2464 == 3) {
                            class188.field3799 = 64;
                            class65.field1649 = 0;
                        }
                        if (class109.field2464 == 4) {
                            class188.field3799 = 64;
                            class65.field1649 = 128;
                        }
                        if (class109.field2464 == 5) {
                            class188.field3799 = 0;
                            class65.field1649 = 64;
                        }
                        if (class109.field2464 == 6) {
                            class65.field1649 = 64;
                            class188.field3799 = 128;
                        }
                        class109.field2464 = 2;
                        class138.field2952 = class167.field3437.method46((byte) 65);
                        class21.field492 = class167.field3437.method46((byte) 65);
                        class97.field2304 = class167.field3437.method64(31790);
                    }
                    if (class109.field2464 == 10) {
                        class168.field3466 = class167.field3437.method46((byte) 65);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -98) {
                    class16.field396 = class72.field1807;
                    long var66 = class167.field3437.method21(-28356);
                    if (var66 == 0L) {
                        class71.field1779 = null;
                        class151.field3167 = 0;
                        class124.field2736 = -1;
                        class62.field1548 = null;
                        class59.field1512 = null;
                        return true;
                    }
                    long var68 = class167.field3437.method21(-28356);
                    class62.field1548 = class89.method770(var68, false);
                    class71.field1779 = class89.method770(var66, false);
                    class113.field2538 = class167.field3437.method73((byte) 29);
                    int var70 = class167.field3437.method64(31790);
                    if (var70 == 255) {
                        class124.field2736 = -1;
                        return true;
                    }
                    class151.field3167 = var70;
                    class73[] var71 = new class73[100];
                    for (int var72 = 0; ~class151.field3167 < ~var72; ++var72) {
                        var71[var72] = new class73();
                        var71[var72].field3612 = class167.field3437.method21(-28356);
                        var71[var72].field1811 = class89.method770(var71[var72].field3612, false);
                        var71[var72].field1814 = class167.field3437.method46((byte) 65);
                        var71[var72].field1812 = class167.field3437.method73((byte) 29);
                        if (~class112.field2518 == ~var71[var72].field3612) {
                            class195.field3923 = var71[var72].field1812;
                        }
                    }
                    boolean var73 = false;
                    int var74 = class151.field3167;
                    while (~var74 < -1) {
                        --var74;
                        boolean var75 = true;
                        for (int var76 = 0; ~var76 > ~var74; ++var76) {
                            if (~var71[var76].field1811.method605(-11, var71[var76 + 1].field1811) < -1) {
                                class73 var77 = var71[var76];
                                var71[var76] = var71[var76 + 1];
                                var75 = false;
                                var71[var76 + 1] = var77;
                            }
                        }
                        if (var75) {
                            break;
                        }
                    }
                    class59.field1512 = var71;
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -100) {
                    class63 var78 = class167.field3437.method28(-1);
                    if (!var78.method575(arg0 ^ 1950, class143.field3070)) {
                        if (!var78.method575(97, class65.field1647)) {
                            if (var78.method575(97, class193.field3912)) {
                                class63 var79 = var78.method596(0, var78.method585(arg0 + -2098, class116.field2590), -116);
                                boolean var80 = false;
                                long var81 = var79.method590(-98);
                                for (int var83 = 0; ~class99.field2338 < ~var83; ++var83) {
                                    if (~class11.field264[var83] == ~var81) {
                                        var80 = true;
                                        break;
                                    }
                                }
                                if (!var80 && ~class69.field1733 == -1) {
                                    class100.method843((byte) -86, 10, var79, class151.field3175);
                                }
                            } else if (var78.method575(arg0 + -1950, class164.field3375)) {
                                class63 var101 = var78.method596(0, var78.method585(-123, class164.field3375), arg0 + -2129);
                                class100.method843((byte) -102, 11, class151.field3175, var101);
                            } else if (var78.method575(arg0 + -1950, class203.field4011)) {
                                class63 var100 = var78.method596(0, var78.method585(arg0 + -2094, class203.field4011), arg0 ^ -1945);
                                if (~class69.field1733 == -1) {
                                    class100.method843((byte) -127, 12, class151.field3175, var100);
                                }
                            } else if (var78.method575(97, class142.field3041)) {
                                class63 var99 = var78.method596(0, var78.method585(arg0 ^ -2024, class142.field3041), arg0 ^ -1926);
                                if (~class69.field1733 == -1) {
                                    class100.method843((byte) -121, 13, class151.field3175, var99);
                                }
                            } else if (var78.method575(97, class37.field871)) {
                                class63 var84 = var78.method596(0, var78.method585(110, class116.field2590), -79);
                                long var85 = var84.method590(arg0 ^ -1951);
                                boolean var87 = false;
                                for (int var88 = 0; ~var88 > ~class99.field2338; ++var88) {
                                    if (class11.field264[var88] == var85) {
                                        var87 = true;
                                        break;
                                    }
                                }
                                if (!var87 && class69.field1733 == 0) {
                                    class100.method843((byte) -110, 14, var84, class151.field3175);
                                }
                            } else if (var78.method575(97, class143.field3078)) {
                                class63 var89 = var78.method596(0, var78.method585(110, class116.field2590), -56);
                                long var90 = var89.method590(-98);
                                boolean var92 = false;
                                for (int var93 = 0; var93 < class99.field2338; ++var93) {
                                    if (~class11.field264[var93] == ~var90) {
                                        var92 = true;
                                        break;
                                    }
                                }
                                if (!var92 && ~class69.field1733 == -1) {
                                    class100.method843((byte) -90, 15, var89, class151.field3175);
                                }
                            } else if (!var78.method575(97, class142.field3052)) {
                                class100.method843((byte) -116, 0, class151.field3175, var78);
                            } else {
                                class63 var94 = var78.method596(0, var78.method585(109, class116.field2590), -105);
                                boolean var95 = false;
                                long var96 = var94.method590(-98);
                                for (int var98 = 0; ~class99.field2338 < ~var98; ++var98) {
                                    if (~class11.field264[var98] == ~var96) {
                                        var95 = true;
                                        break;
                                    }
                                }
                                if (!var95 && class69.field1733 == 0) {
                                    class100.method843((byte) -122, 16, var94, class151.field3175);
                                }
                            }
                        } else {
                            class63 var102 = var78.method596(0, var78.method585(arg0 ^ -1992, class116.field2590), -109);
                            long var103 = var102.method590(-98);
                            boolean var105 = false;
                            for (int var106 = 0; ~var106 > ~class99.field2338; ++var106) {
                                if (class11.field264[var106] == var103) {
                                    var105 = true;
                                    break;
                                }
                            }
                            if (!var105 && class69.field1733 == 0) {
                                class63 var107 = var78.method596(1 + var78.method585(arg0 + -1925, class116.field2590), -9 + var78.method582(-122), arg0 ^ -1942);
                                class100.method843((byte) -104, 8, var102, var107);
                            }
                        }
                    } else {
                        class63 var108 = var78.method596(0, var78.method585(-99, class116.field2590), arg0 ^ -1957);
                        long var109 = var108.method590(arg0 + -2145);
                        boolean var111 = false;
                        for (int var112 = 0; var112 < class99.field2338; ++var112) {
                            if (~class11.field264[var112] == ~var109) {
                                var111 = true;
                                break;
                            }
                        }
                        if (!var111 && class69.field1733 == 0) {
                            class100.method843((byte) -95, 4, var108, class155.field3237);
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -144) {
                    class106.field2418 = 0;
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -135) {
                    class155.method1078((byte) 10);
                    int var113 = class167.field3437.method69((byte) 52);
                    int var114 = class167.field3437.method56(-1);
                    int var115 = class167.field3437.method69((byte) 52);
                    class62.field1565[var113] = var114;
                    class196.field3934[var113] = var115;
                    class114.field2551[var113] = 1;
                    for (int var116 = 0; ~var116 > -99; ++var116) {
                        if (var114 >= class64.field1638[var116]) {
                            class114.field2551[var113] = var116 + 2;
                        }
                    }
                    class203.field4033[class110.method881(31, class206.field4056++)] = var113;
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 15) {
                    class11.method145(0);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -80) {
                    field1968 = false;
                    for (int var117 = 0; ~var117 > -6; ++var117) {
                        class110.field2488[var117] = false;
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 54) {
                    for (int var118 = 0; class69.field1735 > var118; ++var118) {
                        class138 var119 = class168.method1135((byte) 126, var118);
                        if (var119 != null && ~var119.field2967 == -1) {
                            class175.field3597[var118] = 0;
                            class24.field545[var118] = 0;
                        }
                    }
                    class155.method1078((byte) 10);
                    class124.field2736 = -1;
                    class10.field231 += 32;
                    return true;
                }
                if (~class124.field2736 == -108) {
                    int var120 = class167.field3437.method37((byte) -3);
                    class54 var121 = class59.method555(var120, arg0 + 30126);
                    var121.field1404 = 3;
                    var121.field1443 = class3.field72.field1559.method182((byte) -128);
                    class113.method901(arg0 + -2047, var121);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -231) {
                    long var122 = class167.field3437.method21(-28356);
                    int var124 = class167.field3437.method46((byte) 65);
                    int var125 = class167.field3437.method64(31790);
                    class63 var126 = class89.method770(var122, false).method576((byte) 32);
                    for (int var127 = 0; ~class37.field868 < ~var127; ++var127) {
                        if (~class80.field1938[var127] == ~var122) {
                            if (class123.field2713[var127] != var124) {
                                class123.field2713[var127] = var124;
                                if (var124 > 0) {
                                    class100.method843((byte) -122, 5, class151.field3175, class89.method772((byte) 54, new class63[] { var126, class80.field1942 }));
                                }
                                if (var124 == 0) {
                                    class100.method843((byte) -105, 5, class151.field3175, class89.method772((byte) 62, new class63[] { var126, class14.field339 }));
                                }
                            }
                            var126 = null;
                            class198.field3959[var127] = var125;
                            break;
                        }
                    }
                    boolean var128 = false;
                    if (var126 != null && ~class37.field868 > -201) {
                        class80.field1938[class37.field868] = var122;
                        class140.field3022[class37.field868] = var126;
                        class123.field2713[class37.field868] = var124;
                        class198.field3959[class37.field868] = var125;
                        ++class37.field868;
                    }
                    client.field705 = class72.field1807;
                    int var129 = class37.field868;
                    while (var129 > 0) {
                        boolean var130 = true;
                        --var129;
                        for (int var131 = 0; ~var129 < ~var131; ++var131) {
                            if (~class123.field2713[var131] != ~class105.field2408 && class123.field2713[var131 + 1] == class105.field2408 || class123.field2713[var131] == 0 && class123.field2713[var131 + 1] != 0) {
                                var130 = false;
                                int var132 = class123.field2713[var131];
                                class123.field2713[var131] = class123.field2713[var131 + 1];
                                class123.field2713[var131 + 1] = var132;
                                class63 var133 = class140.field3022[var131];
                                class140.field3022[var131] = class140.field3022[var131 - -1];
                                class140.field3022[var131 - -1] = var133;
                                long var134 = class80.field1938[var131];
                                class80.field1938[var131] = class80.field1938[var131 + 1];
                                class80.field1938[var131 + 1] = var134;
                                int var136 = class198.field3959[var131];
                                class198.field3959[var131] = class198.field3959[var131 + 1];
                                class198.field3959[var131 - -1] = var136;
                            }
                        }
                        if (var130) {
                            break;
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -94) {
                    field1968 = true;
                    class121.field2687 = class167.field3437.method64(31790);
                    class173.field3569 = class167.field3437.method64(31790);
                    class188.field3795 = class167.field3437.method46((byte) 65);
                    class113.field2539 = class167.field3437.method64(31790);
                    class85.field2043 = class167.field3437.method64(31790);
                    if (class85.field2043 >= 100) {
                        int var137 = class121.field2687 * 128 + 64;
                        int var138 = class173.field3569 * 128 - -64;
                        int var139 = class112.method894(-94, class112.field2528, var137, var138) - class188.field3795;
                        int var140 = -class35.field828 + var137;
                        int var141 = -class21.field491 + var138;
                        int var142 = -class39.field924 + var139;
                        int var143 = (int) Math.sqrt((double) (var140 * var140 + var141 * var141));
                        class123.field2719 = 2047 & (int) (Math.atan2((double) var142, (double) var143) * 325.949D);
                        class32.field778 = (int) (-325.949D * Math.atan2((double) var140, (double) var141)) & 2047;
                        if (~class123.field2719 > -129) {
                            class123.field2719 = 128;
                        }
                        if (class123.field2719 > 383) {
                            class123.field2719 = 383;
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 41) {
                    int var144 = class167.field3437.method36((byte) -72);
                    byte var145 = class167.field3437.method18(128);
                    class175.field3597[var144] = var145;
                    if (class24.field545[var144] != var145) {
                        class24.field545[var144] = var145;
                        class10.method131(arg0 ^ 1978, var144);
                    }
                    class50.field1217[class110.method881(31, class10.field231++)] = var144;
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 67) {
                    int var146 = class167.field3437.method56(-1);
                    int var147 = class167.field3437.method46((byte) 65);
                    class54 var148;
                    if (var146 >= 0) {
                        var148 = class59.method555(var146, 32173);
                    } else {
                        var148 = null;
                    }
                    if (~var146 > 69999) {
                        var147 += 32768;
                    }
                    while (class167.field3437.field54 < class112.field2531) {
                        int var149 = class167.field3437.method45(-6498);
                        int var150 = class167.field3437.method46((byte) 65);
                        int var151 = 0;
                        if (~var150 != -1) {
                            var151 = class167.field3437.method64(arg0 + 29743);
                            if (var151 == 255) {
                                var151 = class167.field3437.method56(-1);
                            }
                        }
                        if (var148 != null && ~var149 <= -1 && var148.field1324.length > var149) {
                            var148.field1324[var149] = var150;
                            var148.field1315[var149] = var151;
                        }
                        class188.method1233(1, var149, var150 + -1, var151, var147);
                    }
                    if (var148 != null) {
                        class113.method901(0, var148);
                    }
                    class155.method1078((byte) 10);
                    class138.field2961[class110.method881(class175.field3601++, 31)] = class110.method881(32767, var147);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -145) {
                    long var152 = class167.field3437.method21(arg0 ^ -26941);
                    class167.field3437.method73((byte) 29);
                    long var154 = class167.field3437.method21(-28356);
                    long var156 = (long) class167.field3437.method46((byte) 65);
                    long var158 = (long) class167.field3437.method20((byte) 66);
                    boolean var160 = false;
                    int var161 = class167.field3437.method64(31790);
                    long var162 = (var156 << 32) + var158;
                    for (int var164 = 0; var164 < 100; ++var164) {
                        if (class106.field2412[var164] == var162) {
                            var160 = true;
                            break;
                        }
                    }
                    if (~var161 >= -2) {
                        for (int var165 = 0; ~var165 > ~class99.field2338; ++var165) {
                            if (~class11.field264[var165] == ~var152) {
                                var160 = true;
                                break;
                            }
                        }
                    }
                    if (!var160 && class69.field1733 == 0) {
                        class106.field2412[class11.field262] = var162;
                        class11.field262 = (class11.field262 + 1) % 100;
                        class63 var166 = class70.method660(class173.method1159(false, class167.field3437).method599(arg0 + -1080));
                        if (var161 != 2 && ~var161 != -4) {
                            if (~var161 == -2) {
                                class150.method1056(var166, 9213, 9, class89.method770(var154, false).method576((byte) 32), class89.method772((byte) 26, new class63[] { class71.field1787, class89.method770(var152, false).method576((byte) 32) }));
                            } else {
                                class150.method1056(var166, arg0 ^ 9218, 9, class89.method770(var154, false).method576((byte) 32), class89.method770(var152, false).method576((byte) 32));
                            }
                        } else {
                            class150.method1056(var166, 9213, 9, class89.method770(var154, false).method576((byte) 32), class89.method772((byte) 40, new class63[] { class164.field3382, class89.method770(var152, false).method576((byte) 32) }));
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -181) {
                    int var167 = class167.field3437.method37((byte) -3);
                    int var168 = class167.field3437.method40(2);
                    int var169 = class167.field3437.method31((byte) -127);
                    class54 var170 = class59.method555(var167, 32173);
                    var170.field1322 = (var169 << 16) + var168;
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -93) {
                    class18.field436 = class167.field3437.method33(120);
                    class130.field2842 = class167.field3437.method64(31790);
                    for (int var171 = class130.field2842; ~var171 > ~(class130.field2842 + 8); ++var171) {
                        for (int var172 = class18.field436; class18.field436 + 8 > var172; ++var172) {
                            if (class163.field3365[class112.field2528][var171][var172] != null) {
                                class163.field3365[class112.field2528][var171][var172] = null;
                                class52.method513(var172, var171, (byte) -104);
                            }
                        }
                    }
                    for (class123 var173 = (class123) class29.field671.method1033(0); var173 != null; var173 = (class123) class29.field671.method1035(0)) {
                        if (~var173.field2709 <= ~class130.field2842 && class130.field2842 + 8 > var173.field2709 && class18.field436 <= var173.field2728 && ~(class18.field436 + 8) < ~var173.field2728 && class112.field2528 == var173.field2726) {
                            var173.field2727 = 0;
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -56) {
                    class19.field442 = class167.field3437.method64(31790);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 90) {
                    boolean var174 = false;
                    long var175 = class167.field3437.method21(-28356);
                    int var177 = class167.field3437.method46((byte) 65);
                    if ((Long.MIN_VALUE & var175) != 0L) {
                        var174 = true;
                    }
                    byte var178 = class167.field3437.method73((byte) 29);
                    if (var174) {
                        if (class151.field3167 == 0) {
                            class124.field2736 = -1;
                            return true;
                        }
                        long var179 = var175 & Long.MAX_VALUE;
                        boolean var181 = false;
                        int var182;
                        for (var182 = 0; ~var182 > ~class151.field3167 && (class59.field1512[var182].field3612 != var179 || ~class59.field1512[var182].field1814 != ~var177); ++var182) {
                        }
                        if (class151.field3167 > var182) {
                            while (~(class151.field3167 + -1) < ~var182) {
                                class59.field1512[var182] = class59.field1512[var182 + 1];
                                ++var182;
                            }
                            --class151.field3167;
                            class59.field1512[class151.field3167] = null;
                        }
                    } else {
                        class73 var183 = new class73();
                        var183.field3612 = var175;
                        var183.field1811 = class89.method770(var183.field3612, false);
                        var183.field1812 = var178;
                        var183.field1814 = var177;
                        int var184;
                        for (var184 = class151.field3167 + -1; ~var184 <= -1; --var184) {
                            int var185 = class59.field1512[var184].field1811.method605(arg0 + -2058, var183.field1811);
                            if (~var185 == -1) {
                                class59.field1512[var184].field1814 = var177;
                                class59.field1512[var184].field1812 = var178;
                                class124.field2736 = -1;
                                class16.field396 = class72.field1807;
                                if (class112.field2518 == var175) {
                                    class195.field3923 = var178;
                                }
                                return true;
                            }
                            if (var185 < 0) {
                                break;
                            }
                        }
                        if (~class151.field3167 <= ~class59.field1512.length) {
                            class124.field2736 = -1;
                            return true;
                        }
                        for (int var186 = class151.field3167 - 1; var186 > var184; --var186) {
                            class59.field1512[var186 + 1] = class59.field1512[var186];
                        }
                        if (class151.field3167 == 0) {
                            class59.field1512 = new class73[100];
                        }
                        class59.field1512[var184 + 1] = var183;
                        if (~class112.field2518 == ~var175) {
                            class195.field3923 = var178;
                        }
                        ++class151.field3167;
                    }
                    class124.field2736 = -1;
                    class16.field396 = class72.field1807;
                    return true;
                }
                if (~class124.field2736 == -124) {
                    int var187 = class167.field3437.method64(31790);
                    if (~class167.field3437.method64(31790) == -1) {
                        class173.field3572[var187] = new class143();
                    } else {
                        --class167.field3437.field54;
                        class173.field3572[var187] = new class143(class167.field3437);
                    }
                    class118.field2637 = class72.field1807;
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 163 || ~class124.field2736 == -29 || ~class124.field2736 == -125 || class124.field2736 == 229 || ~class124.field2736 == -121 || ~class124.field2736 == -38 || ~class124.field2736 == -106 || ~class124.field2736 == -233 || class124.field2736 == 102 || class124.field2736 == 165 || class124.field2736 == 26) {
                    class84.method740((byte) -117);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 81) {
                    int var188 = class167.field3437.method37((byte) -3);
                    class109.field2454 = class79.field1924.method1043(var188, 119);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 96) {
                    class196.field3936 = class167.field3437.method64(31790);
                    class151.field3176 = class167.field3437.method64(31790);
                    class62.field1553 = class167.field3437.method64(arg0 ^ 31697);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -188) {
                    int var189 = class167.field3437.method69((byte) 52);
                    int var190 = class167.field3437.method64(31790);
                    class63 var191 = class167.field3437.method28(-1);
                    if (var190 >= 1 && ~var190 >= -9) {
                        if (var191.method601(13117, class111.field2509)) {
                            var191 = null;
                        }
                        class167.field3456[var190 + -1] = var191;
                        class23.field542[var190 + -1] = var189 == 0;
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -146) {
                    int var192 = class167.field3437.method50((byte) 12);
                    class54 var193 = class59.method555(var192, 32173);
                    for (int var194 = 0; ~var193.field1324.length < ~var194; ++var194) {
                        var193.field1324[var194] = -1;
                        var193.field1324[var194] = 0;
                    }
                    class113.method901(0, var193);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -46) {
                    class62.method566(class112.field2531, class167.field3437, arg0 ^ -2045, class79.field1924);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -115) {
                    boolean var195 = class167.field3437.method33(118) == 1;
                    int var196 = class167.field3437.method56(-1);
                    class54 var197 = class59.method555(var196, 32173);
                    if (!var195 != !var197.field1433) {
                        var197.field1433 = var195;
                        class113.method901(0, var197);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -116) {
                    field1968 = true;
                    class123.field2721 = class167.field3437.method64(31790);
                    class167.field3462 = class167.field3437.method64(31790);
                    class101.field2366 = class167.field3437.method46((byte) 65);
                    class4.field128 = class167.field3437.method64(arg0 + 29743);
                    class187.field3771 = class167.field3437.method64(31790);
                    if (~class187.field3771 <= -101) {
                        class35.field828 = class123.field2721 * 128 + 64;
                        class21.field491 = class167.field3462 * 128 + 64;
                        class39.field924 = class112.method894(-102, class112.field2528, class35.field828, class21.field491) - class101.field2366;
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 215) {
                    class124.field2764 = class167.field3437.method64(31790);
                    class124.field2736 = -1;
                    client.field705 = class72.field1807;
                    return true;
                }
                if (~class124.field2736 == -110) {
                    class124.method943(-127);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -253) {
                    int var198 = class167.field3437.method50((byte) 79);
                    int var199 = class167.field3437.method46((byte) 65);
                    class54 var200 = class59.method555(var198, 32173);
                    if (var200.field1404 != 2 || var200.field1443 != var199) {
                        var200.field1443 = var199;
                        var200.field1404 = 2;
                        class113.method901(0, var200);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -99) {
                    long var201 = class167.field3437.method21(-28356);
                    long var203 = (long) class167.field3437.method46((byte) 65);
                    boolean var205 = false;
                    long var206 = (long) class167.field3437.method20((byte) 66);
                    int var208 = class167.field3437.method64(31790);
                    long var209 = (var203 << 32) - -var206;
                    for (int var211 = 0; var211 < 100; ++var211) {
                        if (class106.field2412[var211] == var209) {
                            var205 = true;
                            break;
                        }
                    }
                    if (~var208 >= -2) {
                        for (int var212 = 0; var212 < class99.field2338; ++var212) {
                            if (class11.field264[var212] == var201) {
                                var205 = true;
                                break;
                            }
                        }
                    }
                    if (!var205 && class69.field1733 == 0) {
                        class106.field2412[class11.field262] = var209;
                        class11.field262 = (class11.field262 - -1) % 100;
                        class63 var213 = class70.method660(class173.method1159(false, class167.field3437).method599(967));
                        if (var208 != 2 && var208 != 3) {
                            if (var208 == 1) {
                                class100.method843((byte) -112, 7, class89.method772((byte) 62, new class63[] { class71.field1787, class89.method770(var201, false).method576((byte) 32) }), var213);
                            } else {
                                class100.method843((byte) -92, 3, class89.method770(var201, false).method576((byte) 32), var213);
                            }
                        } else {
                            class100.method843((byte) -101, 7, class89.method772((byte) 47, new class63[] { class164.field3382, class89.method770(var201, false).method576((byte) 32) }), var213);
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 209) {
                    int var214 = class167.field3437.method36((byte) -105);
                    if (var214 == 65535) {
                        var214 = -1;
                    }
                    class127.method954(var214, false);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 239) {
                    int var215 = class167.field3437.method70(117);
                    int var216 = class167.field3437.method36((byte) -65);
                    if (~var216 == -65536) {
                        var216 = -1;
                    }
                    class154.method1075((byte) -39, var215, var216);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -85) {
                    int var217 = class167.field3437.method56(-1);
                    int var218 = class167.field3437.method36((byte) -71);
                    class54 var219 = class59.method555(var217, 32173);
                    if (~var219.field1404 != -2 || ~var219.field1443 != ~var218) {
                        var219.field1443 = var218;
                        var219.field1404 = 1;
                        class113.method901(arg0 + -2047, var219);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 121) {
                    class155.method1078((byte) 10);
                    class132.field2871 = class167.field3437.method64(31790);
                    class48.field1178 = class72.field1807;
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -200) {
                    long var220 = class167.field3437.method21(-28356);
                    class63 var222 = class70.method660(class173.method1159(false, class167.field3437).method599(967));
                    class100.method843((byte) -119, 6, class89.method770(var220, false).method576((byte) 32), var222);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -186) {
                    for (int var223 = 0; class33.field806.length > var223; ++var223) {
                        if (class33.field806[var223] != null) {
                            class33.field806[var223].field1167 = -1;
                        }
                    }
                    for (int var224 = 0; ~var224 > ~class55.field1458.length; ++var224) {
                        if (class55.field1458[var224] != null) {
                            class55.field1458[var224].field1167 = -1;
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -75) {
                    int var225 = class167.field3437.method31((byte) -127);
                    class122.method934(var225, 113152226);
                    class138.field2961[class110.method881(31, class175.field3601++)] = class110.method881(32767, var225);
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 189) {
                    int var226 = class167.field3437.method46((byte) 65);
                    int var227 = class167.field3437.method50((byte) 76);
                    class54 var228 = class59.method555(var227, arg0 + 30126);
                    if (var228 != null && var228.field1432 == 0) {
                        if (var226 > -var228.field1435 + var228.field1369) {
                            var226 = -var228.field1435 + var228.field1369;
                        }
                        if (~var226 > -1) {
                            var226 = 0;
                        }
                        if (~var228.field1405 != ~var226) {
                            var228.field1405 = var226;
                            class113.method901(0, var228);
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -163) {
                    int var229 = class167.field3437.method37((byte) -3);
                    int var230 = class167.field3437.method75(true);
                    class54 var231 = class59.method555(var229, 32173);
                    if (var231.field1361 != var230 || ~var230 == 0) {
                        var231.field1361 = var230;
                        var231.field1429 = 0;
                        var231.field1307 = 0;
                        class113.method901(0, var231);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 233) {
                    client.method300(-1, true);
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -229) {
                    class14.method164((byte) 0);
                    class124.field2736 = -1;
                    return false;
                }
                if (class124.field2736 == 43) {
                    class130.field2842 = class167.field3437.method69((byte) 52);
                    class18.field436 = class167.field3437.method33(76);
                    while (~class167.field3437.field54 > ~class112.field2531) {
                        class124.field2736 = class167.field3437.method64(31790);
                        class84.method740((byte) -117);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -187) {
                    for (int var232 = 0; class24.field545.length > var232; ++var232) {
                        if (~class24.field545[var232] != ~class175.field3597[var232]) {
                            class24.field545[var232] = class175.field3597[var232];
                            class10.method131(85, var232);
                            class50.field1217[class110.method881(class10.field231++, 31)] = var232;
                        }
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 240) {
                    int var233 = class167.field3437.method56(-1);
                    int var234 = class167.field3437.method46((byte) 65);
                    class175.field3597[var234] = var233;
                    if (class24.field545[var234] != var233) {
                        class24.field545[var234] = var233;
                        class10.method131(74, var234);
                    }
                    class50.field1217[class110.method881(class10.field231++, 31)] = var234;
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 118) {
                    int var235 = class167.field3437.method64(31790);
                    int var236 = class167.field3437.method64(31790);
                    int var237 = class167.field3437.method64(31790);
                    int var238 = class167.field3437.method64(31790);
                    int var239 = class167.field3437.method46((byte) 65);
                    class110.field2488[var235] = true;
                    class14.field352[var235] = var236;
                    class143.field3061[var235] = var237;
                    class39.field928[var235] = var238;
                    class28.field657[var235] = var239;
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -195) {
                    class99.field2338 = class112.field2531 / 8;
                    for (int var240 = 0; ~var240 > ~class99.field2338; ++var240) {
                        class11.field264[var240] = class167.field3437.method21(-28356);
                        class140.field3001[var240] = class89.method770(class11.field264[var240], false);
                    }
                    class124.field2736 = -1;
                    client.field705 = class72.field1807;
                    return true;
                }
                if (class124.field2736 == 24) {
                    int var241 = class167.field3437.method56(arg0 + -2048);
                    class132 var242 = (class132) class133.field2885.method694(-23979, (long) var241);
                    if (var242 != null) {
                        class121.method929(var242, (byte) 126, true);
                    }
                    if (class198.field3967 != null) {
                        class113.method901(0, class198.field3967);
                        class198.field3967 = null;
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (class124.field2736 == 94) {
                    int var243 = class167.field3437.method36((byte) -67);
                    int var244 = class167.field3437.method50((byte) 84);
                    int var245 = class167.field3437.method31((byte) -127);
                    int var246 = class167.field3437.method46((byte) 65);
                    class54 var247 = class59.method555(var244, arg0 ^ 31314);
                    if (var247.field1418 != var246 || var247.field1421 != var245 || ~var247.field1320 != ~var243) {
                        var247.field1320 = var243;
                        var247.field1421 = var245;
                        var247.field1418 = var246;
                        class113.method901(0, var247);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -194) {
                    int var248 = class167.field3437.method50((byte) 39);
                    int var249 = class167.field3437.method50((byte) 16);
                    int var250 = class167.field3437.method36((byte) -86);
                    if (~var250 == -65536) {
                        var250 = -1;
                    }
                    class54 var251 = class59.method555(var248, 32173);
                    if (var251.field1336) {
                        var251.field1317 = var249;
                        var251.field1407 = var250;
                        class93 var252 = class59.method554(var250, arg0 + 11272);
                        var251.field1418 = var252.field2235;
                        var251.field1320 = var252.field2205;
                        var251.field1415 = var252.field2200;
                        var251.field1321 = var252.field2206;
                        var251.field1421 = var252.field2211;
                        if (var251.field1302 > 0) {
                            var251.field1320 = var251.field1320 * 32 / var251.field1302;
                        }
                        var251.field1431 = var252.field2237;
                        class113.method901(0, var251);
                    } else {
                        if (var250 == -1) {
                            class124.field2736 = -1;
                            var251.field1404 = 0;
                            return true;
                        }
                        class93 var253 = class59.method554(var250, 13319);
                        var251.field1404 = 4;
                        var251.field1421 = var253.field2211;
                        var251.field1443 = var250;
                        var251.field1320 = var253.field2205 * 100 / var249;
                        var251.field1418 = var253.field2235;
                        class113.method901(0, var251);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -227) {
                    if (class130.field2836 != -1) {
                        class103.method853((byte) -26, class130.field2836, 0);
                    }
                    class124.field2736 = -1;
                    return true;
                }
                if (~class124.field2736 == -86) {
                    class140.method1011(class167.field3437, arg0 + -2047);
                    class124.field2736 = -1;
                    return true;
                }
                class199.method1302("T1 - " + class124.field2736 + "," + class127.field2810 + "," + class136.field2933 + " - " + class112.field2531, (Throwable) null, true);
                class14.method164((byte) 0);
                if (arg0 != 2047) {
                    method733((byte) 101);
                }
            } catch (IOException var257) {
                class13.method154((byte) -76);
            } catch (Exception var258) {
                String var255 = "T2 - " + class124.field2736 + "," + class127.field2810 + "," + class136.field2933 + " - " + class112.field2531 + "," + (class3.field110 - -class3.field72.field1117[0]) + "," + (class3.field72.field1164[0] + class38.field921) + " - ";
                for (int var256 = 0; class112.field2531 > var256 && var256 < 50; ++var256) {
                    var255 = var255 + class167.field3437.field48[var256] + ",";
                }
                class199.method1302(var255, var258, true);
                class14.method164((byte) 0);
            }
            return true;
        }
    }
}
