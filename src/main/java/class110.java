import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class110 extends class146 {

    @OriginalMember(owner = "client!hj", name = "A", descriptor = "I")
    public int field1698 = -1;

    @OriginalMember(owner = "client!hj", name = "J", descriptor = "I")
    public int field1706 = 0;

    @OriginalMember(owner = "client!hj", name = "t", descriptor = "Lic;")
    public static class160 field1691 = new class160(30);

    @OriginalMember(owner = "client!hj", name = "F", descriptor = "[J")
    public static long[] field1703 = new long[500];

    @OriginalMember(owner = "client!hj", name = "G", descriptor = "I")
    public static int field1704 = 7759444;

    @OriginalMember(owner = "client!hj", name = "o", descriptor = "I")
    public int field1686;

    @OriginalMember(owner = "client!hj", name = "p", descriptor = "I")
    public static int field1687;

    @OriginalMember(owner = "client!hj", name = "q", descriptor = "I")
    public int field1688;

    @OriginalMember(owner = "client!hj", name = "r", descriptor = "I")
    public static int field1689;

    @OriginalMember(owner = "client!hj", name = "s", descriptor = "I")
    public int field1690;

    @OriginalMember(owner = "client!hj", name = "u", descriptor = "I")
    public int field1692;

    @OriginalMember(owner = "client!hj", name = "v", descriptor = "I")
    public int field1693;

    @OriginalMember(owner = "client!hj", name = "w", descriptor = "I")
    public static int field1694;

    @OriginalMember(owner = "client!hj", name = "x", descriptor = "I")
    public int field1695;

    @OriginalMember(owner = "client!hj", name = "y", descriptor = "I")
    public static int field1696;

    @OriginalMember(owner = "client!hj", name = "B", descriptor = "I")
    public int field1699;

    @OriginalMember(owner = "client!hj", name = "C", descriptor = "I")
    public int field1700;

    @OriginalMember(owner = "client!hj", name = "D", descriptor = "I")
    public int field1701;

    @OriginalMember(owner = "client!hj", name = "E", descriptor = "I")
    public static int field1702;

    @OriginalMember(owner = "client!hj", name = "I", descriptor = "I")
    public int field1705;

    @OriginalMember(owner = "client!hj", name = "z", descriptor = "[S")
    public static short[] field1697;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(ILkj;IIB)V")
    public static final void method819(int arg0, class114 arg1, int arg2, int arg3, byte arg4) {
        if (arg4 != 37) {
            method822(122, 55);
        }
        field1694++;
        class260.method1738(true);
        class63.method477(arg0, arg2, arg1.field1790 + arg0, arg1.field1919 + arg2);
        if (class151.field2474 == 2 || class151.field2474 == 5 || class196.field3200 == null) {
            class63.method479(arg0, arg2, 0, arg1.field1782, arg1.field1872);
        } else {
            int var5 = (int) class1.field1 + class183.field3022 & 0x7FF;
            int var6 = class48.field878.field2849 / 32 + 48;
            int var7 = 464 - (class48.field878.field2887 / 32);
            ((class17) class196.field3200).method131(arg0, arg2, arg1.field1790, arg1.field1919, var6, var7, var5, class131.field2184 + 256, arg1.field1782, arg1.field1872);
            if (class13.field172 != null) {
                for (int var8 = 0; var8 < class13.field172.field4048; var8++) {
                    if (class13.field172.method1695(-3797, var8)) {
                        int var9 = ((class13.field172.field4042[var8] >> 14 & 0x3FFF) - class256.field4082) * 4 + 2 - (class48.field878.field2849 / 32);
                        int var10 = ((class13.field172.field4042[var8] & 0x3FFF) - class170.field2787) * 4 + 2 - (class48.field878.field2887 / 32);
                        int var11 = class95.field1482[var5];
                        int var12 = class95.field1475[var5];
                        int var13 = var12 * 256 / (class131.field2184 + 256);
                        int var14 = var11 * 256 / (class131.field2184 + 256);
                        int var15 = var10 * var13 - (var9 * var14) >> 16;
                        class73 var16 = class198.field3231;
                        if (class13.field172.method1697(false, var8) == 1) {
                            var16 = class106.field1617;
                        }
                        if (class13.field172.method1697(false, var8) == 2) {
                            var16 = class23.field362;
                        }
                        int var17 = var9 * var13 + var10 * var14 >> 16;
                        int var18 = var16.method574(class13.field172.field4057[var8], 100);
                        int var19 = var17 - var18 / 2;
                        if (var19 >= -arg1.field1790 && var19 <= arg1.field1790 && -arg1.field1919 <= var15 && arg1.field1919 >= var15) {
                            int var20 = 16777215;
                            if (class13.field172.field4045[var8] != -1) {
                                var20 = class13.field172.field4045[var8];
                            }
                            class63.method490(arg1.field1782, arg1.field1872);
                            var16.method561(class13.field172.field4057[var8], arg1.field1790 / 2 + arg0 + var19, arg1.field1919 / 2 + -var15 + arg2, var18, 50, var20, 0, 256, 1, 0, 0);
                            class63.method483();
                        }
                    }
                }
            }
            for (int var21 = 0; var21 < class276.field4394; var21++) {
                int var58 = class137.field2303[var21] * 4 + 2 - (class48.field878.field2849 / 32);
                int var59 = class205.field3295[var21] * 4 + 2 - (class48.field878.field2887 / 32);
                class248 var60 = class46.method396(class247.field3885[var21], (byte) 63);
                if (var60.field3897 != null) {
                    var60 = var60.method1656(arg4 - 37);
                    if (var60 == null || var60.field3907 == -1) {
                        continue;
                    }
                }
                class165.method1189(class49.field890[var60.field3907], arg0, var58, arg4 ^ 0x1583, arg2, var59, arg1);
            }
            for (int var22 = 0; var22 < 104; var22++) {
                for (int var54 = 0; var54 < 104; var54++) {
                    class266 var55 = class2.field23[class92.field1448][var22][var54];
                    if (var55 != null) {
                        int var56 = var22 * 4 + 2 - (class48.field878.field2849 / 32);
                        int var57 = var54 * 4 + 2 - (class48.field878.field2887 / 32);
                        class165.method1189(class38.field656[0], arg0, var56, arg4 + 5505, arg2, var57, arg1);
                    }
                }
            }
            for (int var23 = 0; var23 < class7.field88; var23++) {
                class139 var50 = class3.field45[class287.field4587[var23]];
                if (var50 != null && var50.method1041((byte) 13)) {
                    class165 var51 = var50.field2321;
                    if (var51 != null && var51.field2741 != null) {
                        var51 = var51.method1188((byte) -84);
                    }
                    if (var51 != null && var51.field2672 && var51.field2737) {
                        int var52 = var50.field2849 / 32 - class48.field878.field2849 / 32;
                        int var53 = var50.field2887 / 32 - (class48.field878.field2887 / 32);
                        if (var51.field2723 == -1) {
                            class165.method1189(class38.field656[1], arg0, var52, 5542, arg2, var53, arg1);
                        } else {
                            class165.method1189(class49.field890[var51.field2723], arg0, var52, 5542, arg2, var53, arg1);
                        }
                    }
                }
            }
            for (int var24 = 0; var24 < class144.field2386; var24++) {
                class213 var40 = class191.field3129[class279.field4431[var24]];
                if (var40 != null && var40.method1041((byte) -122)) {
                    int var41 = var40.field2887 / 32 - (class48.field878.field2887 / 32);
                    int var42 = var40.field2849 / 32 - (class48.field878.field2849 / 32);
                    long var43 = class260.method1739(false, var40.field3445);
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class45.field820; var46++) {
                        if (class159.field2570[var46] == var43 && class200.field3263[var46] != 0) {
                            var45 = true;
                            break;
                        }
                    }
                    boolean var47 = false;
                    for (int var48 = 0; var48 < class32.field541; var48++) {
                        if (class290.field4618[var48].field2406 == var43) {
                            var47 = true;
                            break;
                        }
                    }
                    boolean var49 = false;
                    if (class48.field878.field3441 != 0 && var40.field3441 != 0 && class48.field878.field3441 == var40.field3441) {
                        var49 = true;
                    }
                    if (var45) {
                        class165.method1189(class38.field656[3], arg0, var42, 5542, arg2, var41, arg1);
                    } else if (var47) {
                        class165.method1189(class38.field656[5], arg0, var42, 5542, arg2, var41, arg1);
                    } else if (var49) {
                        class165.method1189(class38.field656[4], arg0, var42, arg4 + 5505, arg2, var41, arg1);
                    } else {
                        class165.method1189(class38.field656[2], arg0, var42, arg4 ^ 0x1583, arg2, var41, arg1);
                    }
                }
            }
            int var25 = 0;
            class179[] var26 = class288.field4608;
            while (var26.length > var25) {
                class179 var29 = var26[var25];
                if (var29 != null && var29.field2981 != 0 && class207.field3336 % 20 < 10) {
                    if (var29.field2981 == 1 && var29.field2982 >= 0 && class3.field45.length > var29.field2982) {
                        class139 var30 = class3.field45[var29.field2982];
                        if (var30 != null) {
                            int var31 = var30.field2849 / 32 - (class48.field878.field2849 / 32);
                            int var32 = var30.field2887 / 32 - (class48.field878.field2887 / 32);
                            class282.method1894(var32, arg2, var31, arg4 ^ 0x55, arg1, 360000, arg0, var29.field2969);
                        }
                    }
                    if (var29.field2981 == 2) {
                        int var33 = (var29.field2983 - class256.field4082) * 4 + 2 - (class48.field878.field2849 / 32);
                        int var34 = (var29.field2986 - class170.field2787) * 4 + 2 - (class48.field878.field2887 / 32);
                        int var35 = var29.field2987 * 4;
                        int var36 = var35 * var35;
                        class282.method1894(var34, arg2, var33, 121, arg1, var36, arg0, var29.field2969);
                    }
                    if (var29.field2981 == 10 && var29.field2982 >= 0 && class191.field3129.length > var29.field2982) {
                        class213 var37 = class191.field3129[var29.field2982];
                        if (var37 != null) {
                            int var38 = var37.field2849 / 32 - (class48.field878.field2849 / 32);
                            int var39 = var37.field2887 / 32 - (class48.field878.field2887 / 32);
                            class282.method1894(var39, arg2, var38, 125, arg1, 360000, arg0, var29.field2969);
                        }
                    }
                }
                var25++;
            }
            if (class71.field1191 != 0) {
                int var27 = class71.field1191 * 4 + class48.field878.method1226((byte) -116) * 2 + 2 - class48.field878.field2849 / 32 - 2;
                int var28 = class146.field2404 * 4 + class48.field878.method1226((byte) -95) * 2 + 2 - (class48.field878.field2887 / 32) - 2;
                class165.method1189(class157.field2558, arg0, var27, arg4 + 5505, arg2, var28, arg1);
            }
            class63.method493(arg1.field1790 / 2 + arg0 - 1, arg1.field1919 / 2 + arg2 + -1, 3, 3, 16777215);
        }
        class229.field3659[arg3] = true;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method820(int arg0) {
        field1691 = null;
        field1697 = null;
        field1703 = null;
        if (arg0 != 2) {
            method821(false, (class124) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "(ZLsb;)V")
    public static final void method821(boolean arg0, class124 arg1) {
        class52.field942 = arg1;
        field1696++;
        class205.field3292 = class52.field942.method891(0, 16);
        if (arg0) {
            method821(false, (class124) null);
        }
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(II)V")
    public static final void method822(int arg0, int arg1) {
        class23 var2 = class91.method694(arg1, 11, 118);
        field1687++;
        var2.method183(-113);
        if (arg0 != 1967) {
            field1703 = null;
        }
    }
}
