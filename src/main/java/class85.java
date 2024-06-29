import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mb")
public class class85 {

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "I")
    public static int field1980 = 0;

    @OriginalMember(owner = "client!mb", name = "g", descriptor = "Lec;")
    public static class32 field1985 = class73.method594(")2", true);

    @OriginalMember(owner = "client!mb", name = "c", descriptor = "Lec;")
    private static class32 field1981 = class73.method594("Loaded interfaces", true);

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "Lec;")
    private static class32 field1979 = class73.method594("Loaded wordpack", true);

    @OriginalMember(owner = "client!mb", name = "k", descriptor = "Lec;")
    public static class32 field1989 = field1979;

    @OriginalMember(owner = "client!mb", name = "p", descriptor = "I")
    private static int field1994 = 0;

    @OriginalMember(owner = "client!mb", name = "l", descriptor = "Lec;")
    public static class32 field1990 = field1981;

    @OriginalMember(owner = "client!mb", name = "r", descriptor = "Lec;")
    public static class32 field1996 = class73.method594("blaugr-Un:", true);

    @OriginalMember(owner = "client!mb", name = "q", descriptor = "Lec;")
    private static class32 field1995 = class73.method594("Loading title screen )2 ", true);

    @OriginalMember(owner = "client!mb", name = "i", descriptor = "Lec;")
    public static class32 field1987 = field1995;

    @OriginalMember(owner = "client!mb", name = "s", descriptor = "I")
    public static int field1997 = 0;

    @OriginalMember(owner = "client!mb", name = "j", descriptor = "Lja;")
    public static class63 field1988 = new class63(200);

    @OriginalMember(owner = "client!mb", name = "v", descriptor = "Lec;")
    private static class32 field2000 = class73.method594("Account locked as we suspect it has been stolen)3", true);

    @OriginalMember(owner = "client!mb", name = "u", descriptor = "Lec;")
    public static class32 field1999 = field2000;

    @OriginalMember(owner = "client!mb", name = "e", descriptor = "I")
    public static int field1983;

    @OriginalMember(owner = "client!mb", name = "f", descriptor = "I")
    public static int field1984;

    @OriginalMember(owner = "client!mb", name = "m", descriptor = "I")
    public static int field1991;

    @OriginalMember(owner = "client!mb", name = "o", descriptor = "I")
    public static int field1993;

    @OriginalMember(owner = "client!mb", name = "t", descriptor = "I")
    public static int field1998;

    @OriginalMember(owner = "client!mb", name = "n", descriptor = "Lea;")
    public static class30 field1992;

    @OriginalMember(owner = "client!mb", name = "d", descriptor = "Lba;")
    public static class9 field1982;

    @OriginalMember(owner = "client!mb", name = "h", descriptor = "[[[B")
    public static byte[][][] field1986;

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(IIBI)I")
    public static final int method659(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 35) {
            method660(null, false, null, null, null);
        }
        field1983++;
        int var4 = 256 - arg1;
        return ((arg0 & 0xFF00FF) * arg1 + (arg3 & 0xFF00FF) * var4 & 0xFF00FF00) + ((arg0 & 0xFF00) * arg1 + (arg3 & 0xFF00) * var4 & 0xFF0000) >> 8;
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(Lea;ZLea;Lea;Lea;)V")
    public static final void method660(class30 arg0, boolean arg1, class30 arg2, class30 arg3, class30 arg4) {
        class4.field57 = arg3;
        field1992 = arg4;
        class158.field3637 = arg2;
        if (!arg1) {
            field1987 = null;
        }
        class12.field198 = arg0;
        field1998++;
        class79.field1826 = new class36[field1992.method204(-51)][];
        class92.field2121 = new boolean[field1992.method204(-84)];
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "([Lf;IIIIIIII)V")
    public static final void method661(class36[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1984++;
        for (int var9 = arg7; var9 < arg0.length; var9++) {
            class36 var10 = arg0[var9];
            if (var10 != null && (!var10.field849 || var10.field756 == 0 || var10.field848 || class147.method1102(-119, var10) != 0 || class117.field2809 == var10) && var10.field865 == arg8 && (!var10.field849 || !class118.method934(true, var10))) {
                int var11 = var10.field830 + arg1;
                int var12 = var10.field856 + arg5;
                if (class158.field3631 == var10) {
                    class112.field2624 = true;
                    class126.field2932 = var11;
                    class63.field1466 = var12;
                }
                int var13;
                int var14;
                int var15;
                int var16;
                if (var10.field756 == 2) {
                    var13 = arg2;
                    var14 = arg4;
                    var15 = arg6;
                    var16 = arg3;
                } else if (var10.field756 == 9) {
                    int var17 = var10.field811 + var11;
                    int var18 = var11;
                    if (var17 < var11) {
                        var18 = var17;
                        var17 = var11;
                    }
                    var13 = arg2 >= var18 ? arg2 : var18;
                    int var20 = var10.field774 + var12;
                    int var21 = var12;
                    var17++;
                    var14 = arg4 > var17 ? var17 : arg4;
                    if (var12 > var20) {
                        var21 = var20;
                        var20 = var12;
                    }
                    var20++;
                    var15 = var20 >= arg6 ? arg6 : var20;
                    var16 = arg3 >= var21 ? arg3 : var21;
                } else {
                    var16 = arg3 >= var12 ? arg3 : var12;
                    var13 = arg2 < var11 ? var11 : arg2;
                    int var23 = var10.field811 + var11;
                    var14 = var23 >= arg4 ? arg4 : var23;
                    int var24 = var10.field774 + var12;
                    var15 = var24 >= arg6 ? arg6 : var24;
                }
                if (!var10.field849 || var14 > var13 && var15 > var16) {
                    if (var10.field846 == 1337) {
                        class132.method1010(var10, (byte) -102);
                    } else if (var10.field846 == 1338) {
                        class1.method2(var11, var12, -1);
                    } else {
                        if (var10.field756 == 0) {
                            if (!var10.field849 && class118.method934(true, var10) && class50.field1164 != var10) {
                                continue;
                            }
                            method661(arg0, var11 - var10.field844, var13, var16, var14, var12 - var10.field873, var15, arg7, var10.field744);
                            if (var10.field755 != null) {
                                method661(var10.field755, var11 - var10.field844, var13, var16, var14, var12 - var10.field873, var15, 0, var10.field744);
                            }
                            class144 var25 = (class144) class109.field2573.method1198((long) var10.field744, (byte) -106);
                            if (var25 != null) {
                                class128.method994(var25.field3282, var13, var16, var15, var12, var14, var11, 0);
                            }
                        }
                        if (var10.field849) {
                            boolean var26 = false;
                            boolean var27;
                            if (var13 <= class86.field2002 && var16 <= class140.field3218 && class86.field2002 < var14 && class140.field3218 < var15) {
                                var27 = true;
                            } else {
                                var27 = false;
                            }
                            if (class86.field2017 == 1 && var27) {
                                var26 = true;
                            }
                            boolean var28 = false;
                            if (class79.field1827 == 1 && var13 <= class9.field166 && var16 <= class66.field1590 && class9.field166 < var14 && class66.field1590 < var15) {
                                var28 = true;
                            }
                            if (var28) {
                                class17.method127((byte) -80, var10, class66.field1590 - var12, -var11 + class9.field166);
                            }
                            if (class158.field3631 != null && class158.field3631 != var10 && var27 && class117.method926(-4124, class147.method1102(-108, var10))) {
                                class124.field2888 = var10;
                            }
                            if (class117.field2809 == var10) {
                                class111.field2608 = var11;
                                class27.field500 = true;
                                class137.field3182 = var12;
                            }
                            if (var10.field848) {
                                if (var27 && class72.field1696 != 0 && var10.field867 != null) {
                                    class12 var29 = new class12();
                                    var29.field208 = var10.field867;
                                    var29.field210 = class72.field1696;
                                    var29.field209 = var10;
                                    class11.field176.method1216(var29, (byte) 111);
                                }
                                if (class158.field3631 != null || class34.field724 != null || class26.field476) {
                                    var27 = false;
                                    var28 = false;
                                    var26 = false;
                                }
                                if (!var10.field807 && var28) {
                                    var10.field807 = true;
                                    if (var10.field866 != null) {
                                        class12 var30 = new class12();
                                        var30.field204 = class9.field166 - var11;
                                        var30.field209 = var10;
                                        var30.field208 = var10.field866;
                                        var30.field210 = class66.field1590 - var12;
                                        class11.field176.method1216(var30, (byte) 88);
                                    }
                                }
                                if (var10.field807 && var26 && var10.field847 != null) {
                                    class12 var31 = new class12();
                                    var31.field209 = var10;
                                    var31.field208 = var10.field847;
                                    var31.field210 = class140.field3218 - var12;
                                    var31.field204 = class86.field2002 - var11;
                                    class11.field176.method1216(var31, (byte) 100);
                                }
                                if (var10.field807 && !var26) {
                                    var10.field807 = false;
                                    if (var10.field836 != null) {
                                        class12 var32 = new class12();
                                        var32.field204 = class86.field2002 - var11;
                                        var32.field210 = class140.field3218 - var12;
                                        var32.field209 = var10;
                                        var32.field208 = var10.field836;
                                        class80.field1839.method1216(var32, (byte) 90);
                                    }
                                }
                                if (var26 && var10.field780 != null) {
                                    class12 var33 = new class12();
                                    var33.field204 = class86.field2002 - var11;
                                    var33.field208 = var10.field780;
                                    var33.field209 = var10;
                                    var33.field210 = class140.field3218 - var12;
                                    class11.field176.method1216(var33, (byte) 73);
                                }
                                if (!var10.field832 && var27) {
                                    var10.field832 = true;
                                    if (var10.field851 != null) {
                                        class12 var34 = new class12();
                                        var34.field208 = var10.field851;
                                        var34.field209 = var10;
                                        var34.field204 = class86.field2002 - var11;
                                        var34.field210 = class140.field3218 - var12;
                                        class11.field176.method1216(var34, (byte) 46);
                                    }
                                }
                                if (var10.field832 && var27 && var10.field837 != null) {
                                    class12 var35 = new class12();
                                    var35.field208 = var10.field837;
                                    var35.field210 = class140.field3218 - var12;
                                    var35.field204 = class86.field2002 - var11;
                                    var35.field209 = var10;
                                    class11.field176.method1216(var35, (byte) 78);
                                }
                                if (var10.field832 && !var27) {
                                    var10.field832 = false;
                                    if (var10.field776 != null) {
                                        class12 var36 = new class12();
                                        var36.field208 = var10.field776;
                                        var36.field209 = var10;
                                        var36.field204 = class86.field2002 - var11;
                                        var36.field210 = class140.field3218 - var12;
                                        class80.field1839.method1216(var36, (byte) 67);
                                    }
                                }
                                if (var10.field767 != null) {
                                    class12 var37 = new class12();
                                    var37.field209 = var10;
                                    var37.field208 = var10.field767;
                                    class111.field2600.method1216(var37, (byte) 69);
                                }
                                if (var10.field801 != null && field1994 > var10.field793) {
                                    if (var10.field822 == null || field1994 - var10.field793 > 32) {
                                        class12 var42 = new class12();
                                        var42.field208 = var10.field801;
                                        var42.field209 = var10;
                                        class11.field176.method1216(var42, (byte) 48);
                                    } else {
                                        label374: for (int var38 = var10.field793; var38 < field1994; var38++) {
                                            int var39 = class118.field2823[var38 & 0x1F];
                                            for (int var40 = 0; var40 < var10.field822.length; var40++) {
                                                if (var10.field822[var40] == var39) {
                                                    class12 var41 = new class12();
                                                    var41.field209 = var10;
                                                    var41.field208 = var10.field801;
                                                    class11.field176.method1216(var41, (byte) 120);
                                                    break label374;
                                                }
                                            }
                                        }
                                    }
                                    var10.field793 = field1994;
                                }
                                if (var10.field752 != null && var10.field738 < class73.field1719) {
                                    if (var10.field748 == null || class73.field1719 - var10.field738 > 32) {
                                        class12 var47 = new class12();
                                        var47.field209 = var10;
                                        var47.field208 = var10.field752;
                                        class11.field176.method1216(var47, (byte) 39);
                                    } else {
                                        label354: for (int var43 = var10.field738; var43 < class73.field1719; var43++) {
                                            int var44 = class11.field191[var43 & 0x1F];
                                            for (int var45 = 0; var45 < var10.field748.length; var45++) {
                                                if (var10.field748[var45] == var44) {
                                                    class12 var46 = new class12();
                                                    var46.field208 = var10.field752;
                                                    var46.field209 = var10;
                                                    class11.field176.method1216(var46, (byte) 86);
                                                    break label354;
                                                }
                                            }
                                        }
                                    }
                                    var10.field738 = class73.field1719;
                                }
                                if (var10.field772 != null && class86.field2012 > var10.field816) {
                                    if (var10.field876 == null || class86.field2012 - var10.field816 > 32) {
                                        class12 var52 = new class12();
                                        var52.field209 = var10;
                                        var52.field208 = var10.field772;
                                        class11.field176.method1216(var52, (byte) 76);
                                    } else {
                                        label334: for (int var48 = var10.field816; var48 < class86.field2012; var48++) {
                                            int var49 = class74.field1742[var48 & 0x1F];
                                            for (int var50 = 0; var50 < var10.field876.length; var50++) {
                                                if (var10.field876[var50] == var49) {
                                                    class12 var51 = new class12();
                                                    var51.field208 = var10.field772;
                                                    var51.field209 = var10;
                                                    class11.field176.method1216(var51, (byte) 85);
                                                    break label334;
                                                }
                                            }
                                        }
                                    }
                                    var10.field816 = class86.field2012;
                                }
                                if (class15.field319 > var10.field874 && var10.field783 != null) {
                                    class12 var53 = new class12();
                                    var53.field209 = var10;
                                    var53.field208 = var10.field783;
                                    class11.field176.method1216(var53, (byte) 46);
                                }
                                if (var10.field874 < class2.field26 && var10.field781 != null) {
                                    class12 var54 = new class12();
                                    var54.field209 = var10;
                                    var54.field208 = var10.field781;
                                    class11.field176.method1216(var54, (byte) 40);
                                }
                                if (class1.field11 > var10.field874 && var10.field794 != null) {
                                    class12 var55 = new class12();
                                    var55.field208 = var10.field794;
                                    var55.field209 = var10;
                                    class11.field176.method1216(var55, (byte) 69);
                                }
                                if (var10.field874 < class106.field2516 && var10.field823 != null) {
                                    class12 var56 = new class12();
                                    var56.field208 = var10.field823;
                                    var56.field209 = var10;
                                    class11.field176.method1216(var56, (byte) 82);
                                }
                                var10.field874 = class115.field2769;
                                if (var10.field742 != null) {
                                    for (int var57 = 0; var57 < class53.field1250; var57++) {
                                        class12 var58 = new class12();
                                        var58.field209 = var10;
                                        var58.field199 = class73.field1734[var57];
                                        var58.field207 = class11.field188[var57];
                                        var58.field208 = var10.field742;
                                        class11.field176.method1216(var58, (byte) 68);
                                    }
                                }
                            }
                        }
                        if (!var10.field849) {
                            if (class158.field3631 != null || class34.field724 != null || class26.field476) {
                                return;
                            }
                            if ((var10.field753 >= 0 || var10.field831 != 0) && class86.field2002 >= var13 && var16 <= class140.field3218 && var14 > class86.field2002 && class140.field3218 < var15) {
                                if (var10.field753 < 0) {
                                    class50.field1164 = var10;
                                } else {
                                    class50.field1164 = arg0[var10.field753];
                                }
                            }
                            if (var10.field756 == 8 && class86.field2002 >= var13 && var16 <= class140.field3218 && class86.field2002 < var14 && var15 > class140.field3218) {
                                class71.field1666 = var10;
                            }
                            if (var10.field821 > var10.field774) {
                                class86.method665(var12, var10, class140.field3218, var10.field811 + var11, 114, var10.field774, class86.field2002, var10.field821);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mb", name = "a", descriptor = "(I)Z")
    public static final boolean method662(int arg0) {
        field1991++;
        if (class143.field3275 == null) {
            return false;
        }
        try {
            int var1 = class143.field3275.method51((byte) 122);
            if (var1 == 0) {
                return false;
            }
            if (class86.field2005 == -1) {
                class143.field3275.method50(124, 0, class158.field3614.field1587, 1);
                class158.field3614.field1569 = 0;
                class86.field2005 = class158.field3614.method351(arg0 ^ 0xFFFFF20E);
                class115.field2702 = class45.field1073[class86.field2005];
                var1--;
            }
            if (class115.field2702 == -1) {
                if (var1 <= 0) {
                    return false;
                }
                var1--;
                class143.field3275.method50(116, 0, class158.field3614.field1587, 1);
                class115.field2702 = class158.field3614.field1587[0] & 0xFF;
            }
            if (class115.field2702 == -2) {
                if (var1 <= 1) {
                    return false;
                }
                var1 -= 2;
                class143.field3275.method50(arg0 ^ 0x7794, 0, class158.field3614.field1587, 2);
                class158.field3614.field1569 = 0;
                class115.field2702 = class158.field3614.method532(arg0 ^ 0x77EF);
            }
            if (var1 < class115.field2702) {
                return false;
            }
            class158.field3614.field1569 = 0;
            class143.field3275.method50(117, 0, class158.field3614.field1587, class115.field2702);
            class34.field704 = 0;
            class34.field711 = class158.field3618;
            class158.field3618 = class12.field201;
            class12.field201 = class86.field2005;
            if (arg0 != 30703) {
                method660(null, false, null, null, null);
            }
            if (class86.field2005 == 27) {
                int var2 = class158.field3614.method519(false);
                class13.field220 = var2;
                client.method156(0, var2);
                class64.method494(class13.field220, 31);
                for (int var3 = 0; var3 < 100; var3++) {
                    class145.field3299[var3] = true;
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 106) {
                int var4 = class158.field3614.method539(true);
                int var5 = class158.field3614.method532(0);
                class36 var6;
                if (var4 >= 0) {
                    var6 = class128.method993(var4, 111);
                } else {
                    var6 = null;
                }
                if (var4 < -70000) {
                    var5 += 32768;
                }
                if (var6 != null) {
                    for (int var7 = 0; var7 < var6.field835.length; var7++) {
                        var6.field835[var7] = 0;
                        var6.field754[var7] = 0;
                    }
                }
                class102.method824(var5, 88);
                int var8 = class158.field3614.method532(0);
                for (int var9 = 0; var9 < var8; var9++) {
                    int var10 = class158.field3614.method530((byte) 95);
                    if (var10 == 255) {
                        var10 = class158.field3614.method510(arg0 ^ 0x779D);
                    }
                    int var11 = class158.field3614.method525((byte) 116);
                    if (var6 != null && var6.field835.length > var9) {
                        var6.field835[var9] = var11;
                        var6.field754[var9] = var10;
                    }
                    class36.method305(var5, var9, -31820, var10, var11 - 1);
                }
                if (var6 != null) {
                    class132.method1010(var6, (byte) -127);
                }
                class82.method645((byte) -70);
                class11.field191[class41.method326(class73.field1719++, 31)] = class41.method326(32767, var5);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 42) {
                class106.field2506 = class115.field2702 / 8;
                for (int var12 = 0; var12 < class106.field2506; var12++) {
                    class103.field2409[var12] = class158.field3614.method528(-118);
                    class71.field1686[var12] = class9.method59(class103.field2409[var12], 1);
                }
                class86.field2005 = -1;
                class2.field26 = class115.field2769;
                return true;
            }
            if (class86.field2005 == 210) {
                int var13 = class158.field3614.method510(53);
                int var14 = class158.field3614.method525((byte) 116);
                class36 var15 = class128.method993(var13, 75);
                if (var15.field771 != 2 || var15.field850 != var14) {
                    var15.field771 = 2;
                    var15.field850 = var14;
                    class132.method1010(var15, (byte) -103);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 92) {
                int var16 = class158.field3614.method532(0);
                if (var16 == 65535) {
                    var16 = -1;
                }
                int var17 = class158.field3614.method539(true);
                int var18 = class158.field3614.method526(arg0 - 30806);
                class36 var19 = class128.method993(var17, 97);
                if (var19.field849) {
                    var19.field787 = var18;
                    var19.field805 = var16;
                    class62 var21 = class146.method1094(var16, 35);
                    var19.field875 = var21.field1417;
                    var19.field809 = var21.field1392;
                    var19.field817 = var21.field1385;
                    var19.field751 = var21.field1375;
                    var19.field813 = var21.field1427;
                    if (var19.field811 > 0) {
                        var19.field809 = var19.field809 * 32 / var19.field811;
                    }
                    var19.field852 = var21.field1377;
                    class132.method1010(var19, (byte) -115);
                } else if (var16 == -1) {
                    class86.field2005 = -1;
                    var19.field771 = 0;
                    return true;
                } else {
                    class62 var20 = class146.method1094(var16, 57);
                    var19.field809 = var20.field1392 * 100 / var18;
                    var19.field875 = var20.field1417;
                    var19.field771 = 4;
                    var19.field813 = var20.field1427;
                    var19.field850 = var16;
                    class132.method1010(var19, (byte) -122);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 175) {
                for (int var22 = 0; var22 < class52.field1176.length; var22++) {
                    if (class52.field1176[var22] != null) {
                        class52.field1176[var22].field2714 = -1;
                    }
                }
                for (int var23 = 0; var23 < class14.field230.length; var23++) {
                    if (class14.field230[var23] != null) {
                        class14.field230[var23].field2714 = -1;
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 89) {
                class32 var24 = class158.field3614.method556(1347418632);
                Object[] var25 = new Object[var24.method240((byte) 74) + 1];
                for (int var26 = var24.method240((byte) 81) - 1; var26 >= 0; var26--) {
                    if (var24.method260(114, var26) == 115) {
                        var25[var26 + 1] = class158.field3614.method556(1347418632);
                    } else {
                        var25[var26 + 1] = Integer.valueOf(class158.field3614.method539(true));
                    }
                }
                var25[0] = Integer.valueOf(class158.field3614.method539(true));
                class12 var27 = new class12();
                var27.field208 = var25;
                class158.method1224(var27, (byte) -83);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 238) {
                class32 var28 = class158.field3614.method556(arg0 + 1347387929);
                if (var28.method266(0, class114.field2651)) {
                    class32 var29 = var28.method241((byte) 52, 0, var28.method267(1, class152.field3510));
                    boolean var30 = false;
                    long var31 = var29.method259(arg0 - 30703);
                    for (int var33 = 0; var33 < class106.field2506; var33++) {
                        if (class103.field2409[var33] == var31) {
                            var30 = true;
                            break;
                        }
                    }
                    if (!var30 && class97.field2232 == 0) {
                        class79.method629((byte) 98, class80.field1854, 4, var29);
                    }
                } else if (var28.method266(arg0 - 30703, class105.field2498)) {
                    boolean var34 = false;
                    class32 var35 = var28.method241((byte) 88, 0, var28.method267(1, class152.field3510));
                    long var36 = var35.method259(0);
                    for (int var38 = 0; var38 < class106.field2506; var38++) {
                        if (class103.field2409[var38] == var36) {
                            var34 = true;
                            break;
                        }
                    }
                    if (!var34 && class97.field2232 == 0) {
                        class79.method629((byte) 98, class119.field2854, 8, var35);
                    }
                } else if (var28.method266(0, class17.field350)) {
                    class32 var47 = var28.method241((byte) 34, 0, var28.method267(1, class152.field3510));
                    boolean var48 = false;
                    long var49 = var47.method259(0);
                    for (int var51 = 0; var51 < class106.field2506; var51++) {
                        if (class103.field2409[var51] == var49) {
                            var48 = true;
                            break;
                        }
                    }
                    if (!var48 && class97.field2232 == 0) {
                        class32 var52 = var28.method241((byte) -124, var28.method267(1, class152.field3510) + 1, var28.method240((byte) 48) + -9);
                        class79.method629((byte) 98, var52, 8, var47);
                    }
                } else if (var28.method266(0, class94.field2185)) {
                    class32 var42 = var28.method241((byte) 72, 0, var28.method267(1, class152.field3510));
                    long var43 = var42.method259(0);
                    boolean var45 = false;
                    for (int var46 = 0; var46 < class106.field2506; var46++) {
                        if (class103.field2409[var46] == var43) {
                            var45 = true;
                            break;
                        }
                    }
                    if (!var45 && class97.field2232 == 0) {
                        class79.method629((byte) 98, class77.field1787, 10, var42);
                    }
                } else if (var28.method266(0, class27.field502)) {
                    class32 var41 = var28.method241((byte) -114, 0, var28.method267(arg0 - 30702, class27.field502));
                    class79.method629((byte) 98, var41, 11, class77.field1787);
                } else if (var28.method266(0, class65.field1521)) {
                    class32 var39 = var28.method241((byte) -8, 0, var28.method267(arg0 - 30702, class65.field1521));
                    if (class97.field2232 == 0) {
                        class79.method629((byte) 98, var39, 12, class77.field1787);
                    }
                } else if (var28.method266(0, class145.field3309)) {
                    class32 var40 = var28.method241((byte) -113, 0, var28.method267(arg0 ^ 0x77EE, class145.field3309));
                    if (class97.field2232 == 0) {
                        class79.method629((byte) 98, var40, 13, class77.field1787);
                    }
                } else {
                    class79.method629((byte) 98, var28, 0, class77.field1787);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 188) {
                class91.method725(arg0 - 40718);
                class86.field2005 = -1;
                return false;
            }
            if (class86.field2005 == 184) {
                long var53 = class158.field3614.method528(-109);
                int var55 = class158.field3614.method532(0);
                int var56 = class158.field3614.method533(255);
                class32 var57 = class9.method59(var53, 1).method264((byte) 52);
                for (int var58 = 0; var58 < class2.field20; var58++) {
                    if (class33.field695[var58] == var53) {
                        if (class91.field2096[var58] != var55) {
                            class91.field2096[var58] = var55;
                            if (var55 > 0) {
                                class79.method629((byte) 98, class52.method403(new class32[] { var57, class41.field964 }, (byte) -20), 5, class77.field1787);
                            }
                            if (var55 == 0) {
                                class79.method629((byte) 98, class52.method403(new class32[] { var57, class97.field2228 }, (byte) -20), 5, class77.field1787);
                            }
                        }
                        class5.field103[var58] = var56;
                        var57 = null;
                        break;
                    }
                }
                if (var57 != null && class2.field20 < 200) {
                    class33.field695[class2.field20] = var53;
                    class14.field239[class2.field20] = var57;
                    class91.field2096[class2.field20] = var55;
                    class5.field103[class2.field20] = var56;
                    class2.field20++;
                }
                boolean var59 = false;
                class2.field26 = class115.field2769;
                int var60 = class2.field20;
                while (var60 > 0) {
                    var60--;
                    boolean var61 = true;
                    for (int var62 = 0; var62 < var60; var62++) {
                        if (class91.field2096[var62] != class86.field2015 && class91.field2096[var62 + 1] == class86.field2015 || class91.field2096[var62] == 0 && class91.field2096[var62 + 1] != 0) {
                            var61 = false;
                            int var63 = class91.field2096[var62];
                            class91.field2096[var62] = class91.field2096[var62 + 1];
                            class91.field2096[var62 + 1] = var63;
                            class32 var64 = class14.field239[var62];
                            class14.field239[var62] = class14.field239[var62 + 1];
                            class14.field239[var62 + 1] = var64;
                            long var65 = class33.field695[var62];
                            class33.field695[var62] = class33.field695[var62 + 1];
                            class33.field695[var62 + 1] = var65;
                            int var67 = class5.field103[var62];
                            class5.field103[var62] = class5.field103[var62 + 1];
                            class5.field103[var62 + 1] = var67;
                        }
                    }
                    if (var61) {
                        break;
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 212) {
                int var68 = class158.field3614.method510(72);
                class92.field2124 = class154.field3518.method180(var68, -117);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 68) {
                long var69 = class158.field3614.method528(-119);
                class158.field3614.method545((byte) 120);
                long var71 = class158.field3614.method528(-119);
                boolean var73 = false;
                long var74 = (long) class158.field3614.method532(0);
                long var76 = (long) class158.field3614.method518((byte) 119);
                int var78 = class158.field3614.method533(255);
                long var79 = (var74 << 32) + var76;
                for (int var81 = 0; var81 < 100; var81++) {
                    if (class74.field1740[var81] == var79) {
                        var73 = true;
                        break;
                    }
                }
                if (var78 <= 1) {
                    for (int var82 = 0; var82 < class106.field2506; var82++) {
                        if (class103.field2409[var82] == var69) {
                            var73 = true;
                            break;
                        }
                    }
                }
                if (!var73 && class97.field2232 == 0) {
                    class74.field1740[class47.field1119] = var79;
                    class47.field1119 = (class47.field1119 + 1) % 100;
                    class32 var83 = class99.method773(class129.method998((byte) 33, class158.field3614).method258(97));
                    if (var78 == 2 || var78 == 3) {
                        class97.method758(class52.method403(new class32[] { class145.field3306, class9.method59(var69, 1).method264((byte) 52) }, (byte) -20), true, 9, var83, class9.method59(var71, 1).method264((byte) 52));
                    } else if (var78 == 1) {
                        class97.method758(class52.method403(new class32[] { class143.field3280, class9.method59(var69, 1).method264((byte) 52) }, (byte) -20), true, 9, var83, class9.method59(var71, arg0 ^ 0x77EE).method264((byte) 52));
                    } else {
                        class97.method758(class9.method59(var69, arg0 - 30702).method264((byte) 52), true, 9, var83, class9.method59(var71, 1).method264((byte) 52));
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 111) {
                int var84 = class158.field3614.method521(123);
                int var85 = class158.field3614.method519(false);
                int var86 = class158.field3614.method550((byte) -121);
                class144 var87 = (class144) class109.field2573.method1198((long) var86, (byte) -106);
                if (var87 != null) {
                    class134.method1023(var87.field3282 != var85, (byte) -14, var87);
                }
                class80.method634(var84, var85, var86, 22878);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 38) {
                int var88 = class158.field3614.method552(false);
                int var89 = class158.field3614.method539(true);
                int var90 = class158.field3614.method552(false);
                class36 var91 = class128.method993(var89, arg0 - 30628);
                int var92 = var91.field798 + var88;
                int var93 = var91.field770 + var90;
                if (var91.field830 != var92 || var91.field856 != var93) {
                    var91.field856 = var93;
                    var91.field830 = var92;
                    class132.method1010(var91, (byte) -105);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 73) {
                class2.field21 = class158.field3614.method533(255);
                class2.field23 = class158.field3614.method533(arg0 ^ 0x7710);
                class43.field991 = class158.field3614.method533(255);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 41) {
                int var94 = class158.field3614.method539(true);
                class32 var95 = class158.field3614.method556(1347418632);
                class36 var96 = class128.method993(var94, arg0 - 30812);
                if (!var95.method272(true, var96.field764)) {
                    var96.field764 = var95;
                    class132.method1010(var96, (byte) -108);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 59) {
                int var97 = class158.field3614.method539(true);
                class36 var98 = class128.method993(var97, -98);
                var98.field771 = 3;
                var98.field850 = class20.field373.field1632.method234(-126);
                class132.method1010(var98, (byte) -117);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 195 || class86.field2005 == 138 || class86.field2005 == 164 || class86.field2005 == 103 || class86.field2005 == 120 || class86.field2005 == 82 || class86.field2005 == 32 || class86.field2005 == 26 || class86.field2005 == 147 || class86.field2005 == 150 || class86.field2005 == 105) {
                class80.method632(7);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 77) {
                long var99 = class158.field3614.method528(-120);
                class32 var101 = class99.method773(class129.method998((byte) 33, class158.field3614).method258(97));
                class79.method629((byte) 98, var101, 6, class9.method59(var99, 1).method264((byte) 52));
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 142) {
                int var102 = class158.field3614.method529(-126);
                int var103 = class158.field3614.method510(97);
                class36 var104 = class128.method993(var103, -121);
                if (var104.field766 != var102 || var102 == -1) {
                    var104.field840 = 0;
                    var104.field766 = var102;
                    var104.field763 = 0;
                    class132.method1010(var104, (byte) -105);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 108) {
                class82.method645((byte) -106);
                class3.field49 = class158.field3614.method552(false);
                class86.field2005 = -1;
                class106.field2516 = class115.field2769;
                return true;
            }
            if (class86.field2005 == 137) {
                class56.field1295 = class158.field3614.method525((byte) 116) * 30;
                class106.field2516 = class115.field2769;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 110) {
                class61.field1357 = class158.field3614.method533(255);
                class86.field2005 = -1;
                class2.field26 = class115.field2769;
                return true;
            }
            if (class86.field2005 == 36) {
                class41.method324(-3072);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 119) {
                class14.method74(-127, class158.field3614);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 254) {
                int var105 = class158.field3614.method510(72);
                class36 var106 = class128.method993(var105, -100);
                for (int var107 = 0; var107 < var106.field835.length; var107++) {
                    var106.field835[var107] = -1;
                    var106.field835[var107] = 0;
                }
                class132.method1010(var106, (byte) -111);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 122) {
                class4.field72 = class158.field3614.method533(arg0 - 30448);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 134) {
                class45.field1067 = 0;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 171) {
                int var108 = class158.field3614.method532(arg0 - 30703);
                int var109 = class158.field3614.method519(false);
                int var110 = class158.field3614.method519(false);
                int var111 = class158.field3614.method539(true);
                class36 var112 = class128.method993(var111, -95);
                if (var112.field813 != var109 || var112.field875 != var108 || var112.field809 != var110) {
                    var112.field875 = var108;
                    var112.field809 = var110;
                    var112.field813 = var109;
                    class132.method1010(var112, (byte) -122);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 169) {
                class4.method16(true, (byte) 92);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 213) {
                for (int var113 = 0; var113 < class61.field1362; var113++) {
                    class61 var114 = class56.method441(16, var113);
                    if (var114 != null && var114.field1352 == 0) {
                        class14.field238[var113] = 0;
                        class27.field504[var113] = 0;
                    }
                }
                class82.method645((byte) -65);
                field1994 += 32;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 208) {
                class82.method645((byte) -63);
                int var115 = class158.field3614.method536(arg0 - 17418);
                int var116 = class158.field3614.method539(true);
                int var117 = class158.field3614.method536(13285);
                class17.field343[var115] = var116;
                class137.field3175[var115] = var117;
                class50.field1160[var115] = 1;
                for (int var118 = 0; var118 < 98; var118++) {
                    if (var116 >= class135.field3144[var118]) {
                        class50.field1160[var115] = var118 + 2;
                    }
                }
                class74.field1742[class41.method326(31, class86.field2012++)] = var115;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 55) {
                class23.field418 = true;
                class83.field1923 = class158.field3614.method533(255);
                class106.field2530 = class158.field3614.method533(arg0 - 30448);
                class142.field3255 = class158.field3614.method532(0);
                class80.field1837 = class158.field3614.method533(arg0 - 30448);
                class89.field2060 = class158.field3614.method533(arg0 - 30448);
                if (class89.field2060 >= 100) {
                    class48.field1127 = class106.field2530 * 128 + 64;
                    class105.field2496 = class83.field1923 * 128 + 64;
                    class73.field1720 = class83.method654(-5736, class43.field990, class105.field2496, class48.field1127) - class142.field3255;
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 190) {
                for (int var119 = 0; var119 < class27.field504.length; var119++) {
                    if (class27.field504[var119] != class14.field238[var119]) {
                        class27.field504[var119] = class14.field238[var119];
                        class112.method884(var119, -2);
                        class118.field2823[class41.method326(31, field1994++)] = var119;
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 161) {
                int var120 = class158.field3614.method510(arg0 ^ 0x77DC);
                int var121 = class158.field3614.method532(0);
                if (var121 == 65535) {
                    var121 = -1;
                }
                int var122 = class158.field3614.method526(arg0 ^ 0xFFFF8851);
                int var123 = class158.field3614.method532(0);
                if (var123 == 65535) {
                    var123 = -1;
                }
                for (int var124 = var121; var124 <= var123; var124++) {
                    long var125 = ((long) var120 << 32) + ((long) var124);
                    class146 var127 = class115.field2770.method1198(var125, (byte) -106);
                    if (var127 != null) {
                        var127.method1093(0);
                    }
                    class115.field2770.method1203(true, var125, new class38(var122));
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 124) {
                if (class13.field220 != -1) {
                    class154.method1194(class13.field220, 0, (byte) 39);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 39) {
                class20.field368 = class158.field3614.method530((byte) 95);
                class43.field998 = class158.field3614.method533(255);
                for (int var128 = class43.field998; var128 < class43.field998 + 8; var128++) {
                    for (int var129 = class20.field368; var129 < class20.field368 + 8; var129++) {
                        if (class23.field397[class43.field990][var128][var129] != null) {
                            class23.field397[class43.field990][var128][var129] = null;
                            class157.method1207(-1, var129, var128);
                        }
                    }
                }
                for (class23 var130 = (class23) class45.field1077.method1213(103); var130 != null; var130 = (class23) class45.field1077.method1211(-3)) {
                    if (var130.field405 >= class43.field998 && class43.field998 + 8 > var130.field405 && class20.field368 <= var130.field420 && var130.field420 < class20.field368 + 8 && class43.field990 == var130.field401) {
                        var130.field411 = 0;
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 222) {
                long var131 = class158.field3614.method528(-102);
                long var133 = (long) class158.field3614.method532(0);
                long var135 = (long) class158.field3614.method518((byte) 90);
                long var137 = (var133 << 32) + var135;
                boolean var139 = false;
                int var140 = class158.field3614.method533(arg0 ^ 0x7710);
                for (int var141 = 0; var141 < 100; var141++) {
                    if (class74.field1740[var141] == var137) {
                        var139 = true;
                        break;
                    }
                }
                if (var140 <= 1) {
                    for (int var142 = 0; var142 < class106.field2506; var142++) {
                        if (class103.field2409[var142] == var131) {
                            var139 = true;
                            break;
                        }
                    }
                }
                if (!var139 && class97.field2232 == 0) {
                    class74.field1740[class47.field1119] = var137;
                    class47.field1119 = (class47.field1119 + 1) % 100;
                    class32 var143 = class99.method773(class129.method998((byte) 33, class158.field3614).method258(97));
                    if (var140 == 2 || var140 == 3) {
                        class79.method629((byte) 98, var143, 7, class52.method403(new class32[] { class145.field3306, class9.method59(var131, arg0 ^ 0x77EE).method264((byte) 52) }, (byte) -20));
                    } else if (var140 == 1) {
                        class79.method629((byte) 98, var143, 7, class52.method403(new class32[] { class143.field3280, class9.method59(var131, 1).method264((byte) 52) }, (byte) -20));
                    } else {
                        class79.method629((byte) 98, var143, 3, class9.method59(var131, arg0 ^ 0x77EE).method264((byte) 52));
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 207) {
                int var144 = class158.field3614.method519(false);
                class45.method345((byte) 68, var144);
                class11.field191[class41.method326(31, class73.field1719++)] = class41.method326(var144, 32767);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 99) {
                int var145 = class158.field3614.method532(arg0 ^ 0x77EF);
                int var146 = class158.field3614.method533(255);
                int var147 = class158.field3614.method532(0);
                class4.method17(var145, (byte) -61, var147, var146);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 244) {
                int var148 = class158.field3614.method525((byte) 116);
                int var149 = class158.field3614.method539(true);
                class14.field238[var148] = var149;
                if (class27.field504[var148] != var149) {
                    class27.field504[var148] = var149;
                    class112.method884(var148, -2);
                }
                class118.field2823[class41.method326(31, field1994++)] = var148;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 209) {
                int var150 = class158.field3614.method519(false);
                int var151 = class158.field3614.method539(true);
                class36 var152 = class128.method993(var151, -106);
                if (var152 != null && var152.field756 == 0) {
                    if (var150 > var152.field821 - var152.field774) {
                        var150 = var152.field821 - var152.field774;
                    }
                    if (var150 < 0) {
                        var150 = 0;
                    }
                    if (var152.field873 != var150) {
                        var152.field873 = var150;
                        class132.method1010(var152, (byte) -101);
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 201) {
                int var153 = class158.field3614.method519(false);
                byte var154 = class158.field3614.method545((byte) 112);
                class14.field238[var153] = var154;
                if (class27.field504[var153] != var154) {
                    class27.field504[var153] = var154;
                    class112.method884(var153, -2);
                }
                class118.field2823[class41.method326(31, field1994++)] = var153;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 232) {
                class125.field2913 = class158.field3614.method533(255);
                if (class125.field2913 == 1) {
                    class80.field1855 = class158.field3614.method532(0);
                }
                if (class125.field2913 >= 2 && class125.field2913 <= 6) {
                    if (class125.field2913 == 2) {
                        client.field377 = 64;
                        class137.field3196 = 64;
                    }
                    if (class125.field2913 == 3) {
                        class137.field3196 = 0;
                        client.field377 = 64;
                    }
                    if (class125.field2913 == 4) {
                        class137.field3196 = 128;
                        client.field377 = 64;
                    }
                    if (class125.field2913 == 5) {
                        class137.field3196 = 64;
                        client.field377 = 0;
                    }
                    if (class125.field2913 == 6) {
                        client.field377 = 128;
                        class137.field3196 = 64;
                    }
                    class125.field2913 = 2;
                    class145.field3301 = class158.field3614.method532(arg0 - 30703);
                    class103.field2405 = class158.field3614.method532(0);
                    class110.field2582 = class158.field3614.method533(255);
                }
                if (class125.field2913 == 10) {
                    class79.field1831 = class158.field3614.method532(0);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 160) {
                class23.field418 = false;
                for (int var155 = 0; var155 < 5; var155++) {
                    class33.field700[var155] = false;
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 2) {
                int var156 = class158.field3614.method539(true);
                int var157 = class158.field3614.method532(arg0 ^ 0x77EF);
                class36 var158;
                if (var156 >= 0) {
                    var158 = class128.method993(var156, arg0 - 30825);
                } else {
                    var158 = null;
                }
                if (var156 < -70000) {
                    var157 += 32768;
                }
                while (class158.field3614.field1569 < class115.field2702) {
                    int var159 = class158.field3614.method506(true);
                    int var160 = class158.field3614.method532(0);
                    int var161 = 0;
                    if (var160 != 0) {
                        var161 = class158.field3614.method533(255);
                        if (var161 == 255) {
                            var161 = class158.field3614.method539(true);
                        }
                    }
                    if (var158 != null && var159 >= 0 && var158.field835.length > var159) {
                        var158.field835[var159] = var160;
                        var158.field754[var159] = var161;
                    }
                    class36.method305(var157, var159, -31820, var161, var160 - 1);
                }
                if (var158 != null) {
                    class132.method1010(var158, (byte) -102);
                }
                class82.method645((byte) -105);
                class11.field191[class41.method326(31, class73.field1719++)] = class41.method326(var157, 32767);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 239) {
                int var162 = class158.field3614.method526(-65);
                int var163 = class158.field3614.method520((byte) 115);
                int var164 = class158.field3614.method532(0);
                class36 var165 = class128.method993(var162, -114);
                class86.field2005 = -1;
                var165.field750 = (var164 << 16) + var163;
                return true;
            }
            if (class86.field2005 == 74) {
                class91.method728((byte) 126);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 51) {
                class111.method876(class115.field2702, class158.field3614, arg0 - 30604, class154.field3518);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 10) {
                int var166 = class158.field3614.method520((byte) -49);
                if (var166 == 65535) {
                    var166 = -1;
                }
                class102.method827(var166, arg0 ^ 0xFFFFA280);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 112) {
                int var167 = class158.field3614.method519(false);
                if (var167 == 65535) {
                    var167 = -1;
                }
                int var168 = class158.field3614.method518((byte) 74);
                class38.method316(-112, var167, var168);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 94) {
                int var169 = class158.field3614.method536(arg0 - 17418);
                int var170 = class158.field3614.method536(13285);
                class32 var171 = class158.field3614.method556(1347418632);
                if (var169 >= 1 && var169 <= 8) {
                    if (var171.method271((byte) 102, class91.field2103)) {
                        var171 = null;
                    }
                    class38.field915[var169 - 1] = var171;
                    class44.field1043[var169 - 1] = var170 == 0;
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 25) {
                int var172 = class158.field3614.method532(0);
                int var173 = class158.field3614.method539(true);
                class36 var174 = class128.method993(var173, arg0 ^ 0x77C0);
                if (var174.field771 != 1 || var174.field850 != var172) {
                    var174.field850 = var172;
                    var174.field771 = 1;
                    class132.method1010(var174, (byte) -105);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 224) {
                int var175 = class115.field2702 + class158.field3614.field1569;
                int var176 = class158.field3614.method532(0);
                int var177 = class158.field3614.method532(0);
                if (class13.field220 != var176) {
                    class13.field220 = var176;
                    client.method156(arg0 - 30703, class13.field220);
                    class64.method494(class13.field220, 60);
                    for (int var178 = 0; var178 < 100; var178++) {
                        class145.field3299[var178] = true;
                    }
                }
                while (var177-- > 0) {
                    int var179 = class158.field3614.method539(true);
                    int var180 = class158.field3614.method532(0);
                    int var181 = class158.field3614.method533(255);
                    class144 var182 = (class144) class109.field2573.method1198((long) var179, (byte) -106);
                    if (var182 != null && var182.field3282 != var180) {
                        class134.method1023(true, (byte) -62, var182);
                        var182 = null;
                    }
                    if (var182 == null) {
                        var182 = class80.method634(var181, var180, var179, 22878);
                    }
                    var182.field3286 = true;
                }
                for (class144 var183 = (class144) class109.field2573.method1205((byte) 112); var183 != null; var183 = (class144) class109.field2573.method1201(59)) {
                    if (var183.field3286) {
                        var183.field3286 = false;
                    } else {
                        class134.method1023(true, (byte) -112, var183);
                    }
                }
                class115.field2770 = new class156(512);
                while (var175 > class158.field3614.field1569) {
                    int var184 = class158.field3614.method539(true);
                    int var185 = class158.field3614.method532(0);
                    int var186 = class158.field3614.method532(0);
                    int var187 = class158.field3614.method539(true);
                    for (int var188 = var185; var188 <= var186; var188++) {
                        long var189 = ((long) var184 << 32) + (long) var188;
                        class115.field2770.method1203(true, var189, new class38(var187));
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 4) {
                class1.field11 = class115.field2769;
                long var191 = class158.field3614.method528(-122);
                if (var191 == 0L) {
                    class126.field2926 = null;
                    class111.field2611 = null;
                    class86.field2005 = -1;
                    class131.field3012 = null;
                    class158.field3638 = 0;
                    return true;
                }
                long var193 = class158.field3614.method528(arg0 - 30810);
                class131.field3012 = class9.method59(var193, 1);
                class126.field2926 = class9.method59(var191, 1);
                class102.field2391 = class158.field3614.method545((byte) 115);
                int var195 = class158.field3614.method533(arg0 - 30448);
                if (var195 == 255) {
                    class86.field2005 = -1;
                    return true;
                }
                class37[] var196 = new class37[100];
                class158.field3638 = var195;
                for (int var197 = 0; var197 < class158.field3638; var197++) {
                    var196[var197] = new class37();
                    var196[var197].field3326 = class158.field3614.method528(-126);
                    var196[var197].field886 = class9.method59(var196[var197].field3326, 1);
                    var196[var197].field888 = class158.field3614.method532(0);
                    var196[var197].field881 = class158.field3614.method545((byte) 117);
                    if (class98.field2261 == var196[var197].field3326) {
                        class149.field3385 = var196[var197].field881;
                    }
                }
                boolean var198 = false;
                int var199 = class158.field3638;
                while (var199 > 0) {
                    var199--;
                    boolean var200 = true;
                    for (int var201 = 0; var201 < var199; var201++) {
                        if (var196[var201].field886.method238(-39, var196[var201 + 1].field886) > 0) {
                            var200 = false;
                            class37 var202 = var196[var201];
                            var196[var201] = var196[var201 + 1];
                            var196[var201 + 1] = var202;
                        }
                    }
                    if (var200) {
                        break;
                    }
                }
                class111.field2611 = var196;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 247) {
                int var203 = class158.field3614.method533(255);
                int var204 = class158.field3614.method533(255);
                int var205 = class158.field3614.method533(255);
                int var206 = class158.field3614.method533(255);
                class33.field700[var203] = true;
                class114.field2655[var203] = var204;
                class124.field2885[var203] = var205;
                class145.field3296[var203] = var206;
                class17.field351[var203] = 0;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 33) {
                class43.field998 = class158.field3614.method521(68);
                class20.field368 = class158.field3614.method530((byte) 95);
                while (class158.field3614.field1569 < class115.field2702) {
                    class86.field2005 = class158.field3614.method533(arg0 - 30448);
                    class80.method632(7);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 197) {
                class82.method645((byte) -119);
                class136.field3155 = class158.field3614.method533(255);
                class86.field2005 = -1;
                class106.field2516 = class115.field2769;
                return true;
            }
            if (class86.field2005 == 76) {
                class23.field418 = true;
                class86.field2022 = class158.field3614.method533(255);
                class37.field897 = class158.field3614.method533(arg0 - 30448);
                class61.field1360 = class158.field3614.method532(0);
                class94.field2176 = class158.field3614.method533(255);
                class79.field1825 = class158.field3614.method533(255);
                if (class79.field1825 >= 100) {
                    int var207 = class86.field2022 * 128 + 64;
                    int var208 = class37.field897 * 128 + 64;
                    int var209 = class83.method654(-5736, class43.field990, var207, var208) - class61.field1360;
                    int var210 = var209 - class73.field1720;
                    int var211 = var208 - class48.field1127;
                    int var212 = var207 - class105.field2496;
                    int var213 = (int) Math.sqrt((double) (var211 * var211 + var212 * var212));
                    class45.field1050 = (int) (Math.atan2((double) var210, (double) var213) * 325.949D) & 0x7FF;
                    class115.field2720 = (int) (-325.949D * Math.atan2((double) var212, (double) var211)) & 0x7FF;
                    if (class45.field1050 < 128) {
                        class45.field1050 = 128;
                    }
                    if (class45.field1050 > 383) {
                        class45.field1050 = 383;
                    }
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 237) {
                int var214 = class158.field3614.method539(true);
                class144 var215 = (class144) class109.field2573.method1198((long) var214, (byte) -106);
                if (var215 != null) {
                    class134.method1023(true, (byte) -19, var215);
                }
                if (class50.field1159 != null) {
                    class132.method1010(class50.field1159, (byte) -108);
                    class50.field1159 = null;
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 130) {
                boolean var216 = class158.field3614.method533(255) == 1;
                int var217 = class158.field3614.method550((byte) -96);
                class36 var218 = class128.method993(var217, arg0 ^ 0x77C6);
                if (var218.field741 != var216) {
                    var218.field741 = var216;
                    class132.method1010(var218, (byte) -124);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 46) {
                long var219 = class158.field3614.method528(-114);
                int var221 = class158.field3614.method532(arg0 ^ 0x77EF);
                byte var222 = class158.field3614.method545((byte) 89);
                boolean var223 = false;
                if ((var219 & Long.MIN_VALUE) != 0L) {
                    var223 = true;
                }
                if (var223) {
                    if (class158.field3638 == 0) {
                        class86.field2005 = -1;
                        return true;
                    }
                    boolean var228 = false;
                    long var229 = var219 & Long.MAX_VALUE;
                    int var231;
                    for (var231 = 0; class158.field3638 > var231 && (class111.field2611[var231].field3326 != var229 || class111.field2611[var231].field888 != var221); var231++) {
                    }
                    if (class158.field3638 > var231) {
                        while (var231 < class158.field3638 - 1) {
                            class111.field2611[var231] = class111.field2611[var231 + 1];
                            var231++;
                        }
                        class158.field3638--;
                        class111.field2611[class158.field3638] = null;
                    }
                } else {
                    class37 var224 = new class37();
                    var224.field3326 = var219;
                    var224.field886 = class9.method59(var224.field3326, 1);
                    var224.field888 = var221;
                    var224.field881 = var222;
                    int var225;
                    for (var225 = class158.field3638 - 1; var225 >= 0; var225--) {
                        int var226 = class111.field2611[var225].field886.method238(-39, var224.field886);
                        if (var226 == 0) {
                            class111.field2611[var225].field888 = var221;
                            class111.field2611[var225].field881 = var222;
                            if (class98.field2261 == var219) {
                                class149.field3385 = var222;
                            }
                            class1.field11 = class115.field2769;
                            class86.field2005 = -1;
                            return true;
                        }
                        if (var226 < 0) {
                            break;
                        }
                    }
                    if (class158.field3638 >= class111.field2611.length) {
                        class86.field2005 = -1;
                        return true;
                    }
                    for (int var227 = class158.field3638 - 1; var227 > var225; var227--) {
                        class111.field2611[var227 + 1] = class111.field2611[var227];
                    }
                    if (class158.field3638 == 0) {
                        class111.field2611 = new class37[100];
                    }
                    class111.field2611[var225 + 1] = var224;
                    if (class98.field2261 == var219) {
                        class149.field3385 = var222;
                    }
                    class158.field3638++;
                }
                class1.field11 = class115.field2769;
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 45) {
                int var232 = class158.field3614.method536(13285);
                int var233 = class158.field3614.method530((byte) 95);
                int var234 = class158.field3614.method521(107);
                class43.field990 = var232 >> 1;
                class20.field373.method904(var234, 19403, (var232 & 0x1) == 1, var233);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 5) {
                int var235 = class158.field3614.method532(0);
                int var236 = var235 >> 10 & 0x1F;
                int var237 = class158.field3614.method510(arg0 ^ 0x77BF);
                int var238 = var235 & 0x1F;
                int var239 = var235 >> 5 & 0x1F;
                class36 var240 = class128.method993(var237, -114);
                int var241 = (var236 << 19) + (var239 << 11) + (var238 << 3);
                if (var240.field777 != var241) {
                    var240.field777 = var241;
                    class132.method1010(var240, (byte) -116);
                }
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 231) {
                class4.method16(false, (byte) 112);
                class86.field2005 = -1;
                return true;
            }
            if (class86.field2005 == 115) {
                class20.field368 = class158.field3614.method530((byte) 95);
                class43.field998 = class158.field3614.method521(105);
                class86.field2005 = -1;
                return true;
            }
            class110.method872(null, "T1 - " + class86.field2005 + "," + class158.field3618 + "," + class34.field711 + " - " + class115.field2702, 95);
            class91.method725(-10015);
        } catch (IOException var245) {
            class65.method504(-128);
        } catch (Exception var246) {
            String var243 = "T2 - " + class86.field2005 + "," + class158.field3618 + "," + class34.field711 + " - " + class115.field2702 + "," + (class72.field1701 + class20.field373.field2761[0]) + "," + (class20.field373.field2738[0] + class118.field2838) + " - ";
            for (int var244 = 0; class115.field2702 > var244 && var244 < 50; var244++) {
                var243 = var243 + class158.field3614.field1587[var244] + ",";
            }
            class110.method872(var246, var243, 95);
            class91.method725(-10015);
        }
        return true;
    }

    @OriginalMember(owner = "client!mb", name = "b", descriptor = "(I)V")
    public static void method663(int arg0) {
        field1988 = null;
        field1992 = null;
        if (arg0 != 20629) {
            method660(null, false, null, null, null);
        }
        field1981 = null;
        field1985 = null;
        field1982 = null;
        field1996 = null;
        field1999 = null;
        field1986 = null;
        field1995 = null;
        field1979 = null;
        field1987 = null;
        field2000 = null;
        field1990 = null;
        field1989 = null;
    }
}
