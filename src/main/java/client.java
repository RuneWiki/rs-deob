import java.awt.Color;
import java.awt.Container;
import java.awt.Graphics;
import java.awt.Insets;
import java.io.IOException;
import java.net.Socket;
import java.util.GregorianCalendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!client")
public class client extends class132 {

    @OriginalMember(owner = "client!client", name = "W", descriptor = "Lwm;")
    public static class152 field4361 = class157.method1048("welle:", 119);

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    public static int field4352 = 0;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "Z")
    public static boolean field4364 = false;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    public static int field4351;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    public static int field4354;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "I")
    public static int field4358;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "I")
    public static int field4359;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "I")
    public static int field4363;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "I")
    public static int field4366;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "I")
    public static int field4367;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "I")
    public static int field4370;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "Z")
    public static boolean field4372;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "[I")
    public static int[] field4360;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "[S")
    public static short[] field4356;

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Loe;)Loe;", line = 8)
    public static final class127 method1748(class127 arg0) {
        int var1 = method1759(arg0).method548((byte) 41);
        if (var1 == 0) {
            return null;
        }
        for (int var2 = 0; var2 < var1; var2++) {
            arg0 = class11.method54(false, arg0.field1836);
            if (arg0 == null) {
                return null;
            }
        }
        return arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([Loe;IIIIIII)V", line = 57)
    public static final void method1749(class127[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        for (int var8 = 0; var8 < arg0.length; var8++) {
            class127 var9 = arg0[var8];
            if (var9 != null && var9.field1836 == arg1 && (!var9.field1794 || var9.field1902 == 0 || var9.field1806 || method1759(var9).field1171 != 0 || class15.field207 == var9 || var9.field1887 == 1338) && (!var9.field1794 || !method1758(var9))) {
                int var10 = var9.field1924 + arg6;
                int var11 = var9.field1828 + arg7;
                int var12;
                int var13;
                int var14;
                int var15;
                if (var9.field1902 == 2) {
                    var12 = arg2;
                    var13 = arg3;
                    var14 = arg4;
                    var15 = arg5;
                } else {
                    int var16 = var9.field1876 + var10;
                    int var17 = var9.field1921 + var11;
                    if (var9.field1902 == 9) {
                        var16++;
                        var17++;
                    }
                    var12 = var10 > arg2 ? var10 : arg2;
                    var13 = var11 > arg3 ? var11 : arg3;
                    var14 = var16 < arg4 ? var16 : arg4;
                    var15 = var17 < arg5 ? var17 : arg5;
                }
                if (class33.field537 == var9) {
                    field4364 = true;
                    class312.field5367 = var10;
                    class72.field1053 = var11;
                }
                if (!var9.field1794 || var12 < var14 && var13 < var15) {
                    if (var9.field1902 == 0) {
                        if (!var9.field1794 && method1758(var9) && class120.field1694 != var9) {
                            continue;
                        }
                        if (var9.field1816 && class278.field4763 >= var12 && class254.field4397 >= var13 && class278.field4763 < var14 && class254.field4397 < var15) {
                            for (class320 var18 = (class320) class66.field989.method1221((byte) 56); var18 != null; var18 = (class320) class66.field989.method1223(117)) {
                                if (var18.field5579) {
                                    var18.method1880(-25368);
                                    var18.field5569.field1941 = false;
                                }
                            }
                            if (class323.field5645 == 0) {
                                class33.field537 = null;
                                class15.field207 = null;
                            }
                            class26.field435 = 0;
                        }
                    }
                    if (var9.field1794) {
                        boolean var19;
                        if (class278.field4763 >= var12 && class254.field4397 >= var13 && class278.field4763 < var14 && class254.field4397 < var15) {
                            var19 = true;
                        } else {
                            var19 = false;
                        }
                        boolean var20 = false;
                        if (class93.field1330 == 1 && var19) {
                            var20 = true;
                        }
                        boolean var21 = false;
                        if (class61.field921 == 1 && class193.field3066 >= var12 && class62.field944 >= var13 && class193.field3066 < var14 && class62.field944 < var15) {
                            var21 = true;
                        }
                        if (var9.field1787 != null) {
                            for (int var22 = 0; var22 < var9.field1787.length; var22++) {
                                if (class216.field3515[var9.field1787[var22]]) {
                                    if (var9.field1873 == null || class142.field2187 >= var9.field1873[var22]) {
                                        byte var23 = var9.field1917[var22];
                                        if (var23 == 0 || ((var23 & 0x2) == 0 || class216.field3515[86]) && ((var23 & 0x1) == 0 || class216.field3515[82]) && ((var23 & 0x4) == 0 || class216.field3515[81])) {
                                            class282.method1912(class201.field3252, var9.field1868, -1, (byte) -50, var22 + 1);
                                            int var24 = var9.field1814[var22];
                                            if (var9.field1873 == null) {
                                                var9.field1873 = new int[var9.field1787.length];
                                            }
                                            if (var24 == 0) {
                                                var9.field1873[var22] = Integer.MAX_VALUE;
                                            } else {
                                                var9.field1873[var22] = class142.field2187 + var24;
                                            }
                                        }
                                    }
                                } else if (var9.field1873 != null) {
                                    var9.field1873[var22] = 0;
                                }
                            }
                        }
                        if (var21) {
                            class173.method1157(var9, class193.field3066 - var10, (byte) 127, class62.field944 - var11);
                        }
                        if (class33.field537 != null && class33.field537 != var9 && var19 && method1759(var9).method543((byte) -68)) {
                            class16.field225 = var9;
                        }
                        if (class15.field207 == var9) {
                            class40.field646 = true;
                            class31.field524 = var10;
                            class37.field625 = var11;
                        }
                        if (var9.field1806 || var9.field1887 != 0) {
                            if (var19 && class155.field2459 != 0 && var9.field1843 != null) {
                                class320 var25 = new class320();
                                var25.field5579 = true;
                                var25.field5569 = var9;
                                var25.field5582 = class155.field2459;
                                var25.field5581 = var9.field1843;
                                class66.field989.method1214(false, var25);
                            }
                            if (class33.field537 != null || class77.field1091 != null || class70.field1016 || var9.field1887 != 1400 && class26.field435 > 0) {
                                var21 = false;
                                var20 = false;
                                var19 = false;
                            }
                            if (var9.field1887 != 0) {
                                if (var9.field1887 == 1337) {
                                    class85.field1178 = var9;
                                    class272.method1868(22889, var9);
                                    continue;
                                }
                                if (var9.field1887 == 1338) {
                                    if (var21) {
                                        class164.field2599 = class193.field3066 - var10;
                                        class268.field4529 = class62.field944 - var11;
                                    }
                                    continue;
                                }
                                if (var9.field1887 == 1400) {
                                    class252.field4341 = var9;
                                    if (var21) {
                                        if (class216.field3515[82] && class148.field2263 > 0) {
                                            int var26 = (int) ((double) (class193.field3066 - var10 - var9.field1876 / 2) * 2.0D / (double) class41.field660);
                                            int var27 = (int) ((double) (class62.field944 - var11 - var9.field1921 / 2) * 2.0D / (double) class41.field660);
                                            int var28 = class146.field2244 + var26;
                                            int var29 = class84.field1158 + var27;
                                            int var30 = class252.field4335 + var28;
                                            int var31 = class26.field446 + class197.field3160 - var29 - 1;
                                            class269.method1842(var31, var30, 0, -6810);
                                            class311.method2154(8);
                                            continue;
                                        }
                                        class26.field435 = 1;
                                        class305.field5245 = class278.field4763;
                                        class253.field4377 = class254.field4397;
                                        continue;
                                    }
                                    if (var20 && class26.field435 > 0) {
                                        if (class26.field435 == 1 && (class305.field5245 != class278.field4763 || class254.field4397 != class253.field4377)) {
                                            class211.field3428 = class146.field2244;
                                            class183.field2916 = class84.field1158;
                                            class26.field435 = 2;
                                        }
                                        if (class26.field435 == 2) {
                                            class90.method590(-1, (int) ((double) (class305.field5245 - class278.field4763) * 2.0D / (double) class213.field3484) + class211.field3428);
                                            class64.method413((int) ((double) (class253.field4377 - class254.field4397) * 2.0D / (double) class213.field3484) + class183.field2916, (byte) -107);
                                        }
                                        continue;
                                    }
                                    class26.field435 = 0;
                                    continue;
                                }
                                if (var9.field1887 == 1401) {
                                    if (var20) {
                                        class278.method1895(var9.field1876, class278.field4763 - var10, (byte) 73, class254.field4397 - var11, var9.field1921);
                                    }
                                    continue;
                                }
                                if (var9.field1887 == 1402) {
                                    if (!class217.field3516) {
                                        class272.method1868(22889, var9);
                                    }
                                    continue;
                                }
                            }
                            if (!var9.field1812 && var21) {
                                var9.field1812 = true;
                                if (var9.field1771 != null) {
                                    class320 var32 = new class320();
                                    var32.field5579 = true;
                                    var32.field5569 = var9;
                                    var32.field5586 = class193.field3066 - var10;
                                    var32.field5582 = class62.field944 - var11;
                                    var32.field5581 = var9.field1771;
                                    class66.field989.method1214(false, var32);
                                }
                            }
                            if (var9.field1812 && var20 && var9.field1775 != null) {
                                class320 var33 = new class320();
                                var33.field5579 = true;
                                var33.field5569 = var9;
                                var33.field5586 = class278.field4763 - var10;
                                var33.field5582 = class254.field4397 - var11;
                                var33.field5581 = var9.field1775;
                                class66.field989.method1214(false, var33);
                            }
                            if (var9.field1812 && !var20) {
                                var9.field1812 = false;
                                if (var9.field1883 != null) {
                                    class320 var34 = new class320();
                                    var34.field5579 = true;
                                    var34.field5569 = var9;
                                    var34.field5586 = class278.field4763 - var10;
                                    var34.field5582 = class254.field4397 - var11;
                                    var34.field5581 = var9.field1883;
                                    class203.field3285.method1214(false, var34);
                                }
                            }
                            if (var20 && var9.field1774 != null) {
                                class320 var35 = new class320();
                                var35.field5579 = true;
                                var35.field5569 = var9;
                                var35.field5586 = class278.field4763 - var10;
                                var35.field5582 = class254.field4397 - var11;
                                var35.field5581 = var9.field1774;
                                class66.field989.method1214(false, var35);
                            }
                            if (!var9.field1941 && var19) {
                                var9.field1941 = true;
                                if (var9.field1936 != null) {
                                    class320 var36 = new class320();
                                    var36.field5579 = true;
                                    var36.field5569 = var9;
                                    var36.field5586 = class278.field4763 - var10;
                                    var36.field5582 = class254.field4397 - var11;
                                    var36.field5581 = var9.field1936;
                                    class66.field989.method1214(false, var36);
                                }
                            }
                            if (var9.field1941 && var19 && var9.field1777 != null) {
                                class320 var37 = new class320();
                                var37.field5579 = true;
                                var37.field5569 = var9;
                                var37.field5586 = class278.field4763 - var10;
                                var37.field5582 = class254.field4397 - var11;
                                var37.field5581 = var9.field1777;
                                class66.field989.method1214(false, var37);
                            }
                            if (var9.field1941 && !var19) {
                                var9.field1941 = false;
                                if (var9.field1906 != null) {
                                    class320 var38 = new class320();
                                    var38.field5579 = true;
                                    var38.field5569 = var9;
                                    var38.field5586 = class278.field4763 - var10;
                                    var38.field5582 = class254.field4397 - var11;
                                    var38.field5581 = var9.field1906;
                                    class203.field3285.method1214(false, var38);
                                }
                            }
                            if (var9.field1908 != null) {
                                class320 var39 = new class320();
                                var39.field5569 = var9;
                                var39.field5581 = var9.field1908;
                                class39.field637.method1214(false, var39);
                            }
                            if (var9.field1817 != null && class141.field2144 > var9.field1783) {
                                if (var9.field1922 == null || class141.field2144 - var9.field1783 > 32) {
                                    class320 var44 = new class320();
                                    var44.field5569 = var9;
                                    var44.field5581 = var9.field1817;
                                    class66.field989.method1214(false, var44);
                                } else {
                                    label568: for (int var40 = var9.field1783; var40 < class141.field2144; var40++) {
                                        int var41 = class247.field4136[var40 & 0x1F];
                                        for (int var42 = 0; var42 < var9.field1922.length; var42++) {
                                            if (var9.field1922[var42] == var41) {
                                                class320 var43 = new class320();
                                                var43.field5569 = var9;
                                                var43.field5581 = var9.field1817;
                                                class66.field989.method1214(false, var43);
                                                break label568;
                                            }
                                        }
                                    }
                                }
                                var9.field1783 = class141.field2144;
                            }
                            if (var9.field1821 != null && class325.field5662 > var9.field1809) {
                                if (var9.field1940 == null || class325.field5662 - var9.field1809 > 32) {
                                    class320 var49 = new class320();
                                    var49.field5569 = var9;
                                    var49.field5581 = var9.field1821;
                                    class66.field989.method1214(false, var49);
                                } else {
                                    label544: for (int var45 = var9.field1809; var45 < class325.field5662; var45++) {
                                        int var46 = class31.field526[var45 & 0x1F];
                                        for (int var47 = 0; var47 < var9.field1940.length; var47++) {
                                            if (var9.field1940[var47] == var46) {
                                                class320 var48 = new class320();
                                                var48.field5569 = var9;
                                                var48.field5581 = var9.field1821;
                                                class66.field989.method1214(false, var48);
                                                break label544;
                                            }
                                        }
                                    }
                                }
                                var9.field1809 = class325.field5662;
                            }
                            if (var9.field1930 != null && class266.field4489 > var9.field1810) {
                                if (var9.field1886 == null || class266.field4489 - var9.field1810 > 32) {
                                    class320 var54 = new class320();
                                    var54.field5569 = var9;
                                    var54.field5581 = var9.field1930;
                                    class66.field989.method1214(false, var54);
                                } else {
                                    label520: for (int var50 = var9.field1810; var50 < class266.field4489; var50++) {
                                        int var51 = class194.field3100[var50 & 0x1F];
                                        for (int var52 = 0; var52 < var9.field1886.length; var52++) {
                                            if (var9.field1886[var52] == var51) {
                                                class320 var53 = new class320();
                                                var53.field5569 = var9;
                                                var53.field5581 = var9.field1930;
                                                class66.field989.method1214(false, var53);
                                                break label520;
                                            }
                                        }
                                    }
                                }
                                var9.field1810 = class266.field4489;
                            }
                            if (var9.field1916 != null && class267.field4495 > var9.field1877) {
                                if (var9.field1901 == null || class267.field4495 - var9.field1877 > 32) {
                                    class320 var59 = new class320();
                                    var59.field5569 = var9;
                                    var59.field5581 = var9.field1916;
                                    class66.field989.method1214(false, var59);
                                } else {
                                    label496: for (int var55 = var9.field1877; var55 < class267.field4495; var55++) {
                                        int var56 = class223.field3629[var55 & 0x1F];
                                        for (int var57 = 0; var57 < var9.field1901.length; var57++) {
                                            if (var9.field1901[var57] == var56) {
                                                class320 var58 = new class320();
                                                var58.field5569 = var9;
                                                var58.field5581 = var9.field1916;
                                                class66.field989.method1214(false, var58);
                                                break label496;
                                            }
                                        }
                                    }
                                }
                                var9.field1877 = class267.field4495;
                            }
                            if (var9.field1835 != null && class272.field4653 > var9.field1854) {
                                if (var9.field1864 == null || class272.field4653 - var9.field1854 > 32) {
                                    class320 var64 = new class320();
                                    var64.field5569 = var9;
                                    var64.field5581 = var9.field1835;
                                    class66.field989.method1214(false, var64);
                                } else {
                                    label472: for (int var60 = var9.field1854; var60 < class272.field4653; var60++) {
                                        int var61 = class231.field3780[var60 & 0x1F];
                                        for (int var62 = 0; var62 < var9.field1864.length; var62++) {
                                            if (var9.field1864[var62] == var61) {
                                                class320 var63 = new class320();
                                                var63.field5569 = var9;
                                                var63.field5581 = var9.field1835;
                                                class66.field989.method1214(false, var63);
                                                break label472;
                                            }
                                        }
                                    }
                                }
                                var9.field1854 = class272.field4653;
                            }
                            if (class16.field223 > var9.field1863 && var9.field1871 != null) {
                                class320 var65 = new class320();
                                var65.field5569 = var9;
                                var65.field5581 = var9.field1871;
                                class66.field989.method1214(false, var65);
                            }
                            if (class276.field4730 > var9.field1863 && var9.field1849 != null) {
                                class320 var66 = new class320();
                                var66.field5569 = var9;
                                var66.field5581 = var9.field1849;
                                class66.field989.method1214(false, var66);
                            }
                            if (class45.field718 > var9.field1863 && var9.field1853 != null) {
                                class320 var67 = new class320();
                                var67.field5569 = var9;
                                var67.field5581 = var9.field1853;
                                class66.field989.method1214(false, var67);
                            }
                            if (class131.field1990 > var9.field1863 && var9.field1841 != null) {
                                class320 var68 = new class320();
                                var68.field5569 = var9;
                                var68.field5581 = var9.field1841;
                                class66.field989.method1214(false, var68);
                            }
                            if (class65.field980 > var9.field1863 && var9.field1855 != null) {
                                class320 var69 = new class320();
                                var69.field5569 = var9;
                                var69.field5581 = var9.field1855;
                                class66.field989.method1214(false, var69);
                            }
                            var9.field1863 = class86.field1212;
                            if (var9.field1807 != null) {
                                for (int var70 = 0; var70 < class195.field3127; var70++) {
                                    class320 var71 = new class320();
                                    var71.field5569 = var9;
                                    var71.field5575 = class247.field4135[var70];
                                    var71.field5570 = class320.field5585[var70];
                                    var71.field5581 = var9.field1807;
                                    class66.field989.method1214(false, var71);
                                }
                            }
                            if (class46.field737 && var9.field1781 != null) {
                                class320 var72 = new class320();
                                var72.field5569 = var9;
                                var72.field5581 = var9.field1781;
                                class66.field989.method1214(false, var72);
                            }
                        }
                    }
                    if (!var9.field1794 && class33.field537 == null && class77.field1091 == null && !class70.field1016) {
                        if ((var9.field1925 >= 0 || var9.field1898 != 0) && class278.field4763 >= var12 && class254.field4397 >= var13 && class278.field4763 < var14 && class254.field4397 < var15) {
                            if (var9.field1925 >= 0) {
                                class120.field1694 = arg0[var9.field1925];
                            } else {
                                class120.field1694 = var9;
                            }
                        }
                        if (var9.field1902 == 8 && class278.field4763 >= var12 && class254.field4397 >= var13 && class278.field4763 < var14 && class254.field4397 < var15) {
                            class108.field1542 = var9;
                        }
                        if (var9.field1915 > var9.field1921) {
                            class31.method235(var9.field1876 + var10, class278.field4763, var9.field1915, var9.field1921, var11, var9, class254.field4397, 3951);
                        }
                    }
                    if (var9.field1902 == 0) {
                        method1749(arg0, var9.field1868, var12, var13, var14, var15, var10 - var9.field1891, var11 - var9.field1852);
                        if (var9.field1937 != null) {
                            method1749(var9.field1937, var9.field1868, var12, var13, var14, var15, var10 - var9.field1891, var11 - var9.field1852);
                        }
                        class122 var73 = (class122) class107.field1519.method1586((long) var9.field1868, -115);
                        if (var73 != null) {
                            class169.method1112(var15, var14, var10, var11, 42, var12, var73.field1724, var13);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V", line = 828)
    public static final void main(String[] arg0) {
        field4358++;
        try {
            if (arg0.length != 4) {
                class324.method2278(-6, "argument count");
            }
            class304.field5230 = Integer.parseInt(arg0[0]);
            int var1 = -1;
            class39.field638 = 2;
            if (arg0[1].equals("live")) {
                class128.field1960 = 0;
            } else if (arg0[1].equals("rc")) {
                class128.field1960 = 1;
            } else if (arg0[1].equals("wip")) {
                class128.field1960 = 2;
            } else {
                class324.method2278(-6, "modewhat");
            }
            class86.field1207 = false;
            try {
                byte[] var2 = arg0[2].getBytes("ISO-8859-1");
                var1 = class302.method2110(0, class117.method775(var2, var2.length, (byte) 69, 0));
            } catch (Exception var6) {
            }
            if (var1 != -1) {
                class222.field3622 = var1;
            } else if (arg0[2].equals("english")) {
                class222.field3622 = 0;
            } else if (arg0[2].equals("german")) {
                class222.field3622 = 1;
            } else {
                class324.method2278(-6, "language");
            }
            class267.method1827(class222.field3622, -2);
            class223.field3630 = false;
            class49.field764 = false;
            if (arg0[3].equals("game0")) {
                class256.field4410 = 0;
            } else if (arg0[3].equals("game1")) {
                class256.field4410 = 1;
            } else {
                class324.method2278(-6, "game");
            }
            class106.field1514 = class201.field3252;
            class211.field3431 = false;
            class93.field1321 = 0;
            class45.field726 = 0;
            client var4 = new client();
            class44.field707 = var4;
            var4.method843("runescape", 531, false, 768, (byte) 103, 28, 1024, class128.field1960 + 32);
            class85.field1201.setLocation(40, 40);
        } catch (Exception var7) {
            class169.method1109(var7, (byte) 116, (String) null);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V", line = 910)
    public final void method846(int arg0) {
        method1750((byte) -124);
        class152.method991(-1);
        field4369++;
        class69.method441(-19908);
        class311.method2159(-1);
        class279.method1898(-125);
        class132.method832((byte) -127);
        class217.method1462();
        class38.method275(-24860);
        class140.method882(arg0 ^ 0xFFFFF430);
        class142.method899(-99);
        class268.method1832(arg0 ^ 0xFFFF9C4A);
        class291.method1959(-2);
        class186.method1234(true);
        class192.method1274(19859);
        class206.method1388((byte) -125);
        class98.method660(73);
        class212.method1432(109);
        class205.method1376(-126);
        class322.method2269(false);
        class27.method220(-105);
        class235.method1612(false);
        class4.method17(arg0 - 3000);
        class159.method1063((byte) -128);
        class22.method181(0);
        class127.method814(1);
        class210.method1415(arg0 - 2987);
        class12.method64((byte) 119);
        class183.method1218(true);
        class203.method1342((byte) 4);
        class231.method1587(32768);
        class86.method564(80);
        class266.method1822(arg0 - 3003);
        class276.method1888(false);
        class297.method2066((byte) -64);
        class244.method1683(0);
        class79.method524((byte) -75);
        class227.method1558((byte) 57);
        class141.method886((byte) -121);
        class249.method1708(true);
        class34.method254(21);
        class270.method1846(-11992);
        class85.method554(false);
        class242.method1655(arg0 ^ 0x3C88);
        class122.method787((byte) -5);
        class84.method542(116);
        class273.method1877(0);
        class48.method338(0);
        class191.method1265(-7);
        class55.method368(-92);
        class93.method612((byte) -119);
        class111.method743((byte) 75);
        class147.method928(97);
        class81.method534(arg0 + 17177);
        class308.method2143(arg0 - 2994);
        class269.method1837(arg0 - 2875);
        class323.method2276((byte) -71);
        class247.method1697(false);
        class302.method2112(true);
        class106.method705(0);
        class180.method1182(30);
        class213.method1441((byte) 35);
        class77.method511(arg0 - 3000);
        class201.method1335(-8);
        class121.method784(false);
        class223.method1541(-58);
        class14.method84();
        class220.method1522();
        class189.method1252((byte) -19);
        class319.method2240();
        class312.method2166(0);
        class21.method136();
        class253.method1765(-108);
        class195.method1306(false);
        class72.method492(0);
        class42.method291((byte) 88);
        class207.method1397();
        class277.method1892(arg0 ^ 0xBDF);
        class108.method722((byte) -82);
        class58.method386(0);
        class171.method1127();
        class316.method2213(false);
        class92.method601(false);
        class250.method1718();
        class130.method827(false);
        class143.method904((byte) -124);
        class260.method1801(1);
        class209.method1411();
        class24.method211();
        class54.method362((byte) 40);
        class59.method397(0);
        class37.method269((byte) 59);
        class284.method1925(-121);
        class83.method540(arg0 ^ 0xFFFFF41A);
        class96.method639();
        class8.method38((byte) -65);
        class23.method192(arg0 - 2930);
        class45.method313(-101);
        class61.method400(arg0 - 3000);
        class243.method1659(true);
        class137.method866(5);
        class63.method409((byte) 75);
        class16.method103((byte) 114);
        class313.method2188(-1);
        class325.method2287((byte) -74);
        class46.method321((byte) 97);
        class66.method419((byte) 95);
        class251.method1730((byte) 111);
        class299.method2096(-1);
        class49.method341(1);
        class107.method712(true);
        class179.method1180(arg0 ^ 0xFFFF8634);
        class193.method1293((byte) -126);
        class157.method1055(29893);
        class6.method26(121);
        class256.method1794((byte) 123);
        class234.method1604(0);
        class87.method574(false);
        class169.method1114(1);
        class272.method1873(-31041);
        class198.method1322(arg0 - 3025);
        class2.method9(false);
        class181.method1204();
        class9.method48(-108);
        class162.method1084((byte) 46);
        class28.method225((byte) 126);
        class241.method1643((byte) 97);
        class295.method2033((byte) -16);
        class281.method1909(arg0 ^ 0xBB2);
        class293.method2025();
        class15.method99(false);
        class160.method1079((byte) 27);
        class225.method1550((byte) -84);
        class320.method2256((byte) -125);
        class73.method500(arg0 - 2933);
        class174.method1162((byte) -39);
        class1.method3();
        class248.method1701(-1);
        class30.method231(arg0 - 3117);
        class294.method2029(-77);
        class275.method1887((byte) -98);
        class120.method781(arg0 - 29081);
        class51.method352(arg0 - 2936);
        class215.method1445(0);
        class95.method627();
        class307.method2141(-64);
        class41.method287(0);
        class286.method1929(false);
        class53.method357();
        class104.method704((byte) 93);
        class161.method1083();
        class258.method1798((byte) -103);
        class102.method694();
        class190.method1260();
        class82.method537((byte) -65);
        class262.method1807((byte) -10);
        class139.method878(27);
        class303.method2115(-127);
        class123.method789(-18815);
        class172.method1147((byte) -52);
        class40.method285(121);
        class150.method950(arg0 ^ 0xFFFFF447);
        class99.method671();
        class236.method1622(75);
        class200.method1332(arg0 ^ 0xB86);
        class13.method70();
        class136.method861((byte) -107);
        class245.method1693((byte) 38);
        class289.method1944((byte) -65);
        class211.method1420((byte) 95);
        class135.method859(arg0 ^ 0xFFFFF40F);
        class167.method1103(-24);
        class175.method1165(-126);
        class44.method303(-102);
        class90.method591(-127);
        class74.method501(true);
        class10.method51(-1);
        class114.method762(-124);
        class31.method240(true);
        class240.method1640(15544);
        class91.method596((byte) 122);
        class298.method2084((byte) 113);
        class117.method767(-21434);
        class25.method215(true);
        class156.method1042(103);
        class287.method1932(-193052368);
        class18.method117(arg0 ^ 0xBAC);
        class264.method1813();
        class148.method932(arg0 ^ 0xBB8);
        class133.method852((byte) -64);
        class280.method1908((byte) 48);
        class94.method625(arg0 ^ 0xBBA);
        class226.method1552((byte) -122);
        class301.method2109();
        class145.method910();
        class65.method414(arg0 - 3124);
        class39.method282((byte) -121);
        class274.method1883();
        class103.method697();
        class118.method777(0);
        class3.method14(2);
        class315.method2202();
        class35.method264();
        class252.method1738((byte) -88);
        class305.method2126(arg0 ^ arg0);
        class112.method755(36);
        class88.method582((byte) 86);
        class97.method654((byte) 83);
        class290.method1951(-55);
        class50.method345(127);
        class204.method1345((byte) -93);
        class163.method1091(-1007775216);
        class154.method1029(-13143);
        class176.method1173(-128);
        class233.method1599(arg0 ^ 0xFFFFD9C9);
        class282.method1914(arg0 - 2988);
        class52.method355((byte) 5);
        class57.method377(-124);
        class199.method1328((byte) 95);
        class26.method217(-109);
        class283.method1923((byte) 90);
        class232.method1594(1);
        class155.method1036(20);
        class278.method1896((byte) 49);
        class101.method677(-2049);
        class237.method1627(8469);
        class128.method820(true);
        class202.method1340(1);
        class164.method1097(-69);
        class321.method2260(83);
        class267.method1829(-30378);
        class219.method1499(arg0 - 2906);
        class134.method857(true);
        class239.method1638(23);
        class306.method2135(890804268);
        class216.method1449(arg0 - 2966);
        class170.method1119((byte) -122);
        class310.method2150((byte) -23);
        class11.method58(15018);
        class70.method443(arg0 ^ 0xBA2);
        class224.method1548(110);
        class60.method399(-17760);
        class17.method110(-102);
        class125.method797(false);
        class324.method2282(true);
        class100.method674(-4096);
        class194.method1301(127);
        class196.method1308(-26);
        class173.method1158(0);
        class228.method1571(0);
        class288.method1939((byte) -97);
        class146.method918(14);
        class131.method831((byte) -98);
        class113.method757(-103);
        class185.method1233(31422);
        class116.method765(-12864);
        class64.method410(true);
        class317.method2216(-31598);
        class254.method1770(-5);
        class110.method739(arg0 ^ 0x3CC8);
        class304.method2125(-3);
        class149.method937(0);
        class230.method1576(0);
        class208.method1402(114);
        class314.method2195(15731);
        class89.method585(0);
        class62.method407((byte) 64);
        class184.method1228((byte) 4);
        class20.method125((byte) 70);
        class124.method793(arg0 ^ 0x59A4);
        class5.method23((byte) -113);
        class265.method1819(0);
        class296.method2046(8792);
        class197.method1312((byte) 55);
        class33.method245((byte) 49);
        class238.method1631(9087);
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V", line = 1196)
    public static void method1750(byte arg0) {
        if (arg0 != -124) {
            field4352 = -92;
        }
        field4356 = null;
        field4360 = null;
        field4361 = null;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V", line = 1210)
    public static final void method1751(boolean arg0) {
        field4363++;
        class23.field393.method1619(11300);
        class72.field1047.method1619(11300);
        if (!arg0) {
            method1750((byte) 48);
        }
        class120.field1700.method1619(11300);
        class245.field4128.method1619(11300);
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V", line = 1237)
    private final void method1752(boolean arg0) {
        field4362++;
        if (arg0) {
            return;
        }
        if (class314.field5446 < class130.field1979.field3051) {
            if (class86.field1205 == class203.field3289) {
                class86.field1205 = class100.field1461;
            } else {
                class86.field1205 = class203.field3289;
            }
            class28.field483 = (class130.field1979.field3051 - 1) * 50 * 5;
            if (class28.field483 > 3000) {
                class28.field483 = 3000;
            }
            if (class130.field1979.field3051 >= 2 && class130.field1979.field3050 == 6) {
                this.method842(-94, "js5connect_outofdate");
                class232.field3814 = 1000;
                return;
            }
            if (class130.field1979.field3051 >= 4 && class130.field1979.field3050 == -1) {
                this.method842(-106, "js5crc");
                class232.field3814 = 1000;
                return;
            }
            if (class130.field1979.field3051 >= 4 && (class232.field3814 == 0 || class232.field3814 == 5)) {
                if (class130.field1979.field3050 == 7 || class130.field1979.field3050 == 9) {
                    this.method842(-92, "js5connect_full");
                } else if (class130.field1979.field3050 > 0) {
                    this.method842(-107, "js5connect");
                } else {
                    this.method842(-109, "js5io");
                }
                class232.field3814 = 1000;
                return;
            }
        }
        class314.field5446 = class130.field1979.field3051;
        if (class28.field483 > 0) {
            class28.field483--;
            return;
        }
        try {
            if (class321.field5602 == 0) {
                class58.field884 = class34.field572.method962(class86.field1205, class25.field425, (byte) -71);
                class321.field5602++;
            }
            if (class321.field5602 == 1) {
                if (class58.field884.field2980 == 2) {
                    this.method1756(1000, true);
                    return;
                }
                if (class58.field884.field2980 == 1) {
                    class321.field5602++;
                }
            }
            if (class321.field5602 == 2) {
                class247.field4139 = new class186((Socket) class58.field884.field2977, class34.field572);
                class291 var2 = new class291(5);
                var2.method1980(false, 15);
                var2.method1967(531, -1303690792);
                class247.field4139.method1237(true, 0, 5, var2.field4950);
                class321.field5602++;
                class206.field3377 = class76.method507(-30994);
            }
            if (class321.field5602 == 3) {
                if (class232.field3814 == 0 || class232.field3814 == 5 || class247.field4139.method1238(1) > 0) {
                    int var3 = class247.field4139.method1235(-120);
                    if (var3 != 0) {
                        this.method1756(var3, !arg0);
                        return;
                    }
                    class321.field5602++;
                } else if (class76.method507(-30994) - class206.field3377 > 30000L) {
                    this.method1756(1001, true);
                    return;
                }
            }
            if (class321.field5602 == 4) {
                boolean var4 = class232.field3814 == 5 || class232.field3814 == 10 || class232.field3814 == 28;
                class130.field1979.method1281((byte) 93, class247.field4139, !var4);
                class58.field884 = null;
                class247.field4139 = null;
                class321.field5602 = 0;
            }
        } catch (IOException var6) {
            this.method1756(1002, true);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V", line = 1381)
    private final void method1753(int arg0) {
        field4354++;
        if (!class20.field270) {
            label232: while (true) {
                do {
                    if (!class266.method1823((byte) -128)) {
                        break label232;
                    }
                } while (class197.field3167 != 115 && class197.field3167 != 83);
                class20.field270 = true;
            }
        }
        if (class238.field3903 == 0) {
            Runtime var2 = Runtime.getRuntime();
            int var3 = (int) ((var2.totalMemory() - var2.freeMemory()) / 1024L);
            long var4 = class76.method507(-30994);
            if (class108.field1539 == 0L) {
                class108.field1539 = var4;
            }
            if (var3 > 16384 && (var4 - class108.field1539) < 5000L) {
                if ((var4 - class98.field1409) > 1000L) {
                    System.gc();
                    class98.field1409 = var4;
                }
                class139.field2119 = 5;
                class20.field262 = class247.field4131;
            } else {
                class139.field2119 = 5;
                class238.field3903 = 10;
                class20.field262 = class180.field2872;
            }
        } else if (class238.field3903 == arg0) {
            class24.method208(4, 104, 104);
            for (int var29 = 0; var29 < 4; var29++) {
                class135.field2076[var29] = new class22(104, 104);
            }
            class139.field2119 = 10;
            class20.field262 = class208.field3396;
            class238.field3903 = 30;
        } else if (class238.field3903 == 30) {
            if (class2.field39 == null) {
                class2.field39 = new class98(class130.field1979, class38.field636);
            }
            if (class2.field39.method665((byte) -15)) {
                class61.field922 = class149.method942(true, false, 0, true, (byte) -97);
                class205.field3351 = class149.method942(true, false, 1, true, (byte) 97);
                class122.field1721 = class149.method942(true, true, 2, false, (byte) 38);
                class3.field55 = class149.method942(true, false, 3, true, (byte) 14);
                class256.field4407 = class149.method942(true, false, 4, true, (byte) 109);
                class73.field1063 = class149.method942(true, true, 5, true, (byte) 7);
                class280.field4783 = class149.method942(false, true, 6, true, (byte) -96);
                class201.field3236 = class149.method942(true, false, 7, true, (byte) -117);
                class224.field3650 = class149.method942(true, false, 8, true, (byte) 95);
                class251.field4298 = class149.method942(true, false, 9, true, (byte) 101);
                class206.field3380 = class149.method942(true, false, 10, true, (byte) -86);
                class112.field1589 = class149.method942(true, false, 11, true, (byte) -120);
                class94.field1343 = class149.method942(true, false, 12, true, (byte) -88);
                class164.field2600 = class149.method942(true, false, 13, true, (byte) 110);
                class88.field1236 = class149.method942(false, false, 14, true, (byte) 89);
                class132.field2022 = class149.method942(true, false, 15, true, (byte) 30);
                class140.field2132 = class149.method942(true, false, 16, true, (byte) 95);
                class172.field2732 = class149.method942(true, false, 17, true, (byte) 51);
                class164.field2602 = class149.method942(true, false, 18, true, (byte) -104);
                class130.field1986 = class149.method942(true, false, 19, true, (byte) 84);
                class142.field2179 = class149.method942(true, false, 20, true, (byte) -5);
                class154.field2454 = class149.method942(true, false, 21, true, (byte) -111);
                class200.field3229 = class149.method942(true, false, 22, true, (byte) -97);
                class141.field2172 = class149.method942(true, true, 23, true, (byte) 4);
                class157.field2500 = class149.method942(true, false, 24, true, (byte) -111);
                class89.field1251 = class149.method942(true, false, 25, true, (byte) -122);
                class245.field4124 = class149.method942(true, true, 26, true, (byte) 77);
                class72.field1049 = class149.method942(true, false, 27, true, (byte) 110);
                class238.field3903 = 40;
                class20.field262 = class156.field2478;
                class139.field2119 = 15;
            } else {
                class139.field2119 = 12;
                class20.field262 = class26.field439;
            }
        } else if (class238.field3903 == 40) {
            int var27 = 0;
            for (int var28 = 0; var28 < 28; var28++) {
                var27 += class45.field711[var28].method1431(63) * class249.field4197[var28] / 100;
            }
            if (var27 == 100) {
                class20.field262 = class198.field3180;
                class139.field2119 = 20;
                class317.method2218(class224.field3650, (byte) 126);
                class62.method405(arg0 ^ 0x543F, class224.field3650);
                class73.method498(arg0 - 103, class224.field3650);
                class238.field3903 = 45;
            } else {
                if (var27 != 0) {
                    class20.field262 = class195.method1307(new class152[] { class216.field3511, class38.method280(arg0 ^ 0x7C, var27), class272.field4680 }, (byte) 29);
                }
                class139.field2119 = 20;
            }
        } else if (class238.field3903 == 45) {
            class313.method2179(class28.field484, 2, 22050, (byte) 119);
            class239.field3914 = new class297();
            class239.field3914.method2048(128, 29542, 9);
            class270.field4629 = class152.method1011(class34.field572, 0, 256, 22050, class224.field3648);
            class270.field4629.method1674(class239.field3914, arg0 ^ 0x4029);
            class17.method111(class132.field2022, class256.field4407, true, class239.field3914, class88.field1236);
            class224.field3646 = class152.method1011(class34.field572, 1, 256, 2048, class224.field3648);
            class290.field4916 = new class218();
            class224.field3646.method1674(class290.field4916, arg0 + 16409);
            class93.field1326 = new class79(22050, class252.field4337);
            class147.field2256 = class280.field4783.method1374(class291.field4960, (byte) -52);
            class238.field3903 = 50;
            class20.field262 = class81.field1130;
            class139.field2119 = 30;
        } else if (class238.field3903 == 50) {
            int var25 = class252.method1741(class224.field3650, (byte) 96, class164.field2600);
            int var26 = class20.method126(true);
            if (var26 > var25) {
                class20.field262 = class195.method1307(new class152[] { class140.field2136, class38.method280(122, var25 * 100 / var26), class272.field4680 }, (byte) 29);
                class139.field2119 = 35;
            } else {
                class238.field3903 = 60;
                class139.field2119 = 35;
                class20.field262 = class107.field1518;
            }
        } else if (class238.field3903 == 60) {
            int var6 = class28.method227(512, class224.field3650);
            int var7 = class198.method1316(arg0 ^ 0x8);
            if (var7 <= var6) {
                class20.field262 = class143.field2213;
                class238.field3903 = 65;
                class139.field2119 = 40;
            } else {
                class20.field262 = class195.method1307(new class152[] { class91.field1275, class38.method280(79, var6 * 100 / var7), class272.field4680 }, (byte) 29);
                class139.field2119 = 40;
            }
        } else if (class238.field3903 == 65) {
            class323.method2275(class224.field3650, class164.field2600, -128);
            class20.field262 = class26.field434;
            class139.field2119 = 45;
            class232.method1597((byte) 127, 5);
            class238.field3903 = 70;
        } else if (class238.field3903 == 70) {
            class122.field1721.method1368(2);
            byte var8 = 0;
            int var9 = var8 + class122.field1721.method1358(-119);
            class140.field2132.method1368(2);
            int var10 = var9 + class140.field2132.method1358(-115);
            class172.field2732.method1368(2);
            int var11 = var10 + class172.field2732.method1358(12);
            class164.field2602.method1368(2);
            int var12 = var11 + class164.field2602.method1358(-126);
            class130.field1986.method1368(arg0 - 8);
            int var13 = var12 + class130.field1986.method1358(9);
            class142.field2179.method1368(arg0 ^ 0x8);
            int var14 = var13 + class142.field2179.method1358(arg0 - 131);
            class154.field2454.method1368(2);
            int var15 = var14 + class154.field2454.method1358(arg0 + 82);
            class200.field3229.method1368(arg0 - 8);
            int var16 = var15 + class200.field3229.method1358(arg0 ^ 0x4C);
            class157.field2500.method1368(2);
            int var17 = var16 + class157.field2500.method1358(20);
            class89.field1251.method1368(2);
            int var18 = var17 + class89.field1251.method1358(arg0 ^ 0x44);
            class72.field1049.method1368(2);
            int var19 = var18 + class72.field1049.method1358(-113);
            if (var19 >= 1100) {
                class256.method1792(class122.field1721, -125);
                class258.method1795(class122.field1721, arg0 - 15990);
                class174.method1161(30671, class122.field1721);
                class307.method2140(arg0 ^ 0xFFFFFFCA, class201.field3236, class122.field1721);
                class245.method1688(arg0 - 6860, class140.field2132, true, class201.field3236);
                class170.method1120(class201.field3236, class164.field2602, arg0 - 10);
                class291.method1973(class201.field3236, class149.field2316, class130.field1986, -14759, true);
                class128.method823(-3, class122.field1721);
                class256.method1788(class142.field2179, class61.field922, true, class205.field3351);
                class28.method224(51, class122.field1721);
                class311.method2161(class201.field3236, class154.field2454, (byte) 96);
                class44.method305((byte) -128, class200.field3229);
                class46.method318(-4274, class122.field1721);
                class20.method127(6, class224.field3650, class3.field55, class201.field3236, class164.field2600);
                class286.method1927(class122.field1721, (byte) -82);
                class34.method250((byte) 5, class172.field2732);
                class31.method238((byte) 127, class157.field2500, class89.field1251, new class6());
                class239.method1636(-108, class157.field2500, class89.field1251);
                class268.method1835((byte) 59, class122.field1721);
                class74.method502(124, class122.field1721, class224.field3650);
                class253.method1763((byte) -90, class224.field3650, class122.field1721);
                class20.field262 = class269.field4535;
                class139.field2119 = 50;
                class308.method2145(arg0 - 10);
                class238.field3903 = 80;
            } else {
                class20.field262 = class195.method1307(new class152[] { class248.field4143, class38.method280(arg0 ^ 0x63, var19 / 11), class272.field4680 }, (byte) 29);
                class139.field2119 = 50;
            }
        } else if (class238.field3903 == 80) {
            int var20 = class269.method1838(class224.field3650, 26016);
            int var21 = class37.method271(false);
            if (var20 >= var21) {
                class125.method798(-20, class224.field3650);
                class20.field262 = class40.field650;
                class139.field2119 = 60;
                class238.field3903 = 90;
            } else {
                class20.field262 = class195.method1307(new class152[] { class277.field4749, class38.method280(arg0 ^ 0x56, var20 * 100 / var21), class272.field4680 }, (byte) 29);
                class139.field2119 = 60;
            }
        } else if (class238.field3903 == 90) {
            if (class245.field4124.method1368(2)) {
                class272 var22 = new class272(class251.field4298, class245.field4124, class224.field3650, 20, !class205.field3352);
                class181.method1195(var22);
                if (class87.field1228 == 1) {
                    class181.method1206(0.9F);
                }
                if (class87.field1228 == 2) {
                    class181.method1206(0.8F);
                }
                if (class87.field1228 == 3) {
                    class181.method1206(0.7F);
                }
                if (class87.field1228 == 4) {
                    class181.method1206(0.6F);
                }
                class238.field3903 = 100;
                class20.field262 = class128.field1963;
                class139.field2119 = 70;
            } else {
                class20.field262 = class195.method1307(new class152[] { class272.field4682, class38.method280(89, class245.field4124.method1358(-116)), class272.field4680 }, (byte) 29);
                class139.field2119 = 70;
            }
        } else if (class238.field3903 == 100) {
            if (class49.method340(class224.field3650, 124)) {
                class238.field3903 = 110;
            }
        } else if (class238.field3903 == 110) {
            class140.field2131 = new class142();
            class34.field572.method956(10, 0, class140.field2131);
            class238.field3903 = 120;
            class20.field262 = class179.field2853;
            class139.field2119 = 75;
        } else if (class238.field3903 == 120) {
            if (class206.field3380.method1370(class201.field3252, class237.field3892, false)) {
                class9 var23 = new class9(class206.field3380.method1355(78, class237.field3892, class201.field3252));
                class268.method1834(var23, true);
                class139.field2119 = 80;
                class238.field3903 = 130;
                class20.field262 = class3.field56;
            } else {
                class20.field262 = class195.method1307(new class152[] { class51.field797, class122.field1719 }, (byte) 29);
                class139.field2119 = 80;
            }
        } else if (class238.field3903 == 130) {
            if (!class3.field55.method1368(2)) {
                class20.field262 = class195.method1307(new class152[] { class65.field978, class38.method280(arg0 ^ 0x57, class3.field55.method1358(arg0 - 129) * 3 / 4), class272.field4680 }, (byte) 29);
                class139.field2119 = 85;
            } else if (!class94.field1343.method1368(2)) {
                class20.field262 = class195.method1307(new class152[] { class65.field978, class38.method280(75, (class94.field1343.method1358(32) / 10) + 75), class272.field4680 }, (byte) 29);
                class139.field2119 = 85;
            } else if (!class164.field2600.method1368(2)) {
                class20.field262 = class195.method1307(new class152[] { class65.field978, class38.method280(96, class164.field2600.method1358(115) / 20 + 85), class272.field4680 }, (byte) 29);
                class139.field2119 = 85;
            } else if (class141.field2172.method1359(-2, class288.field4871)) {
                class252.method1742(class141.field2172, false, class113.field1611);
                class20.field262 = class73.field1068;
                class238.field3903 = 135;
                class139.field2119 = 95;
            } else {
                class20.field262 = class195.method1307(new class152[] { class65.field978, class38.method280(106, class141.field2172.method1362((byte) 84, class288.field4871) / 10 + 90), class272.field4680 }, (byte) 29);
                class139.field2119 = 85;
            }
        } else if (class238.field3903 == 135) {
            int var24 = class225.method1551(true);
            if (var24 == -1) {
                class20.field262 = class296.field5054;
                class139.field2119 = 95;
            } else if (var24 == 7 || var24 == 9) {
                this.method842(-128, "worldlistfull");
                class232.method1597((byte) 127, 1000);
            } else if (class205.field3340) {
                class139.field2119 = 96;
                class20.field262 = class55.field869;
                class238.field3903 = 140;
            } else {
                this.method842(-115, "worldlistio_" + var24);
                class232.method1597((byte) 127, 1000);
            }
        } else if (class238.field3903 == 140) {
            class248.field4149 = class3.field55.method1374(class27.field467, (byte) -52);
            class73.field1063.method1378(true, false, (byte) 123);
            class280.field4783.method1378(true, true, (byte) 126);
            class224.field3650.method1378(true, true, (byte) 125);
            class164.field2600.method1378(true, true, (byte) 127);
            class206.field3380.method1378(true, true, (byte) 123);
            class3.field55.method1378(true, true, (byte) 123);
            class107.field1525 = true;
            class20.field262 = class311.field5320;
            class238.field3903 = 150;
            class139.field2119 = 97;
        } else if (class238.field3903 == 150) {
            class293.method2026();
            if (class20.field270) {
                class253.field4386 = 0;
                class140.field2135 = 0;
                class167.field2632 = 0;
                class225.field3657 = 0;
            }
            class20.field270 = true;
            class134.method854((byte) 47, class34.field572);
            class179.method1178(true, -1, false, class167.field2632, -1);
            class238.field3903 = 160;
            class139.field2119 = 100;
            class20.field262 = class245.field4111;
        } else if (class238.field3903 == 160) {
            class48.method328(true, 103);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V", line = 1886)
    public final void method838(int arg0) {
        field4355++;
        if (class232.field3814 == 1000) {
            return;
        }
        class142.field2187++;
        if ((class142.field2187 % 1000) == 1) {
            GregorianCalendar var2 = new GregorianCalendar();
            class125.field1747 = var2.get(11) * 600 + (var2.get(12) * 10 + (var2.get(13) / 6));
            class268.field4514.setSeed((long) class125.field1747);
        }
        this.method1760(127);
        if (arg0 != -23797) {
            return;
        }
        if (class2.field39 != null) {
            class2.field39.method667(true);
        }
        class66.method418((byte) -126);
        class234.method1609(-128);
        class22.method173((byte) 102);
        class108.method721(0);
        if (class217.field3516) {
            class207.method1395();
        }
        if (class206.field3359 != null) {
            int var3 = class206.field3359.method563(1424);
            class155.field2459 = var3;
        }
        if (class232.field3814 == 0) {
            this.method1753(arg0 + 23807);
            class204.method1346(-4863);
        } else if (class232.field3814 == 5) {
            this.method1753(10);
            class204.method1346(-4863);
        } else if (class232.field3814 == 25 || class232.field3814 == 28) {
            class298.method2086((byte) -101);
        }
        if (class232.field3814 == 10) {
            this.method1754(true);
            class86.method562(-88);
            class3.method12((byte) 8);
            class135.method860(1);
        } else if (class232.field3814 == 30) {
            class324.method2277(false);
        } else if (class232.field3814 == 40) {
            class135.method860(arg0 + 23798);
            if (class184.field2930 != -3) {
                if (class184.field2930 == 15) {
                    class140.method881(0);
                } else if (class184.field2930 != 2) {
                    class211.method1418(2130);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V", line = 2003)
    private final void method1754(boolean arg0) {
        class195.field3127 = 0;
        field4357++;
        if (!arg0) {
            field4364 = true;
        }
        while (class266.method1823((byte) -124) && class195.field3127 < 128) {
            class247.field4135[class195.field3127] = class42.field667;
            class320.field5585[class195.field3127] = class197.field3167;
            class195.field3127++;
        }
        class277.field4740++;
        if (class253.field4387 != -1) {
            class169.method1112(class227.field3709, class172.field2757, 0, 0, 41, 0, class253.field4387, 0);
        }
        class86.field1212++;
        if (class217.field3516) {
            int var2 = 19137023;
            label207: for (int var3 = 0; var3 < 32768; var3++) {
                class4 var4 = class40.field649[var3];
                if (var4 != null) {
                    byte var5 = var4.field72.field3969;
                    if ((var5 & 0x2) > 0 && var4.field4180 == 0 && Math.random() * 1000.0D < 10.0D) {
                        int var6 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        int var7 = (int) Math.round(Math.random() * 2.0D - 1.0D);
                        if (var6 != 0 || var7 != 0) {
                            var4.field4213[0] = 1;
                            var4.field4188[0] = (var4.field4162 >> 7) + var6;
                            var4.field4245[0] = (var4.field4231 >> 7) + var7;
                            class135.field2076[class23.field400].method172(var4.field4231 >> 7, var4.method67(-4391), var4.method67(-4391), (byte) 75, var4.field4162 >> 7, false, 0);
                            if (var4.field4188[0] >= 0 && var4.field4188[0] <= 104 - var4.method67(-4391) && var4.field4245[0] >= 0 && var4.field4245[0] <= 104 - var4.method67(-4391) && class135.field2076[class23.field400].method178(var4.field4245[0], var4.field4188[0], var4.field4231 >> 7, var4.field4162 >> 7, 19136768)) {
                                if (var4.method67(-4391) > 1) {
                                    for (int var8 = var4.field4188[0]; var8 < (var4.field4188[0] + var4.method67(-4391)); var8++) {
                                        for (int var9 = var4.field4245[0]; (var4.field4245[0] + var4.method67(-4391)) > var9; var9++) {
                                            if ((var2 & class135.field2076[class23.field400].field384[var8][var9]) != 0) {
                                                continue label207;
                                            }
                                        }
                                    }
                                }
                                var4.field4180 = 1;
                            }
                        }
                    }
                    class58.method385(var4, 0);
                    class243.method1665(var4, 0);
                    class199.method1331(var4, -80);
                    class135.field2076[class23.field400].method187(false, var4.method67(-4391), var4.method67(-4391), var4.field4162 >> 7, true, var4.field4231 >> 7);
                }
            }
        }
        if (!class217.field3516) {
            class73.method499((byte) 51);
        } else if (class37.field618 == 0 && class141.field2156 == 0) {
            if (class28.field485 == 2) {
                class130.method826(14155);
            } else {
                class280.method1905(true);
            }
            if (class224.field3639 >> 7 < 14 || (class224.field3639 >> 7) >= 90 || (class80.field1129 >> 7) < 14 || class80.field1129 >> 7 >= 90) {
                class22.method188(103);
            }
        }
        while (true) {
            class320 var10;
            class127 var11;
            class127 var12;
            do {
                var10 = (class320) class39.field637.method1215((byte) -126);
                if (var10 == null) {
                    while (true) {
                        class320 var13;
                        class127 var17;
                        class127 var18;
                        do {
                            var13 = (class320) class203.field3285.method1215((byte) -99);
                            if (var13 == null) {
                                while (true) {
                                    class320 var14;
                                    class127 var15;
                                    class127 var16;
                                    do {
                                        var14 = (class320) class66.field989.method1215((byte) -122);
                                        if (var14 == null) {
                                            if (class33.field537 != null) {
                                                class230.method1577(1);
                                            }
                                            if (class314.field5438 != null && class314.field5438.field2980 == 1) {
                                                if (class314.field5438.field2977 != null) {
                                                    class108.method720(class100.field1462, class241.field3942, 79);
                                                }
                                                class100.field1462 = false;
                                                class314.field5438 = null;
                                                class241.field3942 = null;
                                            }
                                            if (class142.field2187 % 1500 == 0) {
                                                class311.method2162(false);
                                            }
                                            return;
                                        }
                                        var15 = var14.field5569;
                                        if (var15.field1934 < 0) {
                                            break;
                                        }
                                        var16 = class11.method54(!arg0, var15.field1836);
                                    } while (var16 == null || var16.field1937 == null || var16.field1937.length <= var15.field1934 || var16.field1937[var15.field1934] != var15);
                                    class64.method412(var14, (byte) -95);
                                }
                            }
                            var17 = var13.field5569;
                            if (var17.field1934 < 0) {
                                break;
                            }
                            var18 = class11.method54(!arg0, var17.field1836);
                        } while (var18 == null || var18.field1937 == null || var18.field1937.length <= var17.field1934 || var18.field1937[var17.field1934] != var17);
                        class64.method412(var13, (byte) -90);
                    }
                }
                var11 = var10.field5569;
                if (var11.field1934 < 0) {
                    break;
                }
                var12 = class11.method54(!arg0, var11.field1836);
            } while (var12 == null || var12.field1937 == null || var11.field1934 >= var12.field1937.length || var12.field1937[var11.field1934] != var11);
            class64.method412(var10, (byte) -110);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V", line = 2218)
    public final void method839(byte arg0) {
        field4368++;
        class108.method719(107);
        class38.field636 = new class206();
        class130.field1979 = new class192();
        if (class128.field1960 != 0) {
            class211.field3430 = new byte[50][];
        }
        class200.method1333(-127, class34.field572);
        if (class39.field638 == 0) {
            class223.field3628 = this.getCodeBase().getHost();
            class127.field1811 = 43594;
            class210.field3420 = 443;
        } else if (class39.field638 == 1) {
            class223.field3628 = this.getCodeBase().getHost();
            class210.field3420 = class304.field5230 + 50000;
            class127.field1811 = class304.field5230 + 40000;
        } else if (class39.field638 == 2) {
            class223.field3628 = "127.0.0.1";
            class127.field1811 = class304.field5230 + 40000;
            class210.field3420 = class304.field5230 + 50000;
        }
        class100.field1461 = class210.field3420;
        class25.field425 = class223.field3628;
        class143.field2209 = class3.field57 = class124.field1745 = class219.field3561 = new short[256];
        if (class256.field4410 == 1) {
            class104.field1493 = class15.field205;
            class306.field5255 = true;
            class72.field1044 = class149.field2312;
            class14.field198 = 16777215;
            class14.field186 = 0;
            class247.field4138 = class17.field236;
            class92.field1312 = class179.field2849;
        } else {
            class104.field1493 = class73.field1066;
            class72.field1044 = class104.field1491;
            class92.field1312 = class6.field90;
            class247.field4138 = class149.field2318;
        }
        class80.field1120 = class127.field1811;
        class86.field1205 = class80.field1120;
        class203.field3289 = class127.field1811;
        if (class151.field2361 == 3 && class39.field638 != 2) {
            class314.field5443 = class304.field5230;
        }
        class189.method1251(124);
        class157.method1051(class224.field3648, 1);
        class245.method1689(class224.field3648, 0);
        class206.field3359 = class311.method2153((byte) 126);
        if (class206.field3359 != null) {
            class206.field3359.method565(class224.field3648, false);
        }
        class230.field3751 = class151.field2361;
        try {
            if (class34.field572.field2365 != null) {
                class297.field5072 = new class322(class34.field572.field2365, 5200, 0);
                for (int var2 = 0; var2 < 28; var2++) {
                    class111.field1563[var2] = new class322(class34.field572.field2364[var2], 6000, 0);
                }
                class170.field2660 = new class322(class34.field572.field2354, 6000, 0);
                class268.field4528 = new class27(255, class297.field5072, class170.field2660, 500000);
                class156.field2474 = new class322(class34.field572.field2356, 24, 0);
                class34.field572.field2354 = null;
                class34.field572.field2365 = null;
                class34.field572.field2356 = null;
                class34.field572.field2364 = null;
            }
        } catch (IOException var5) {
            class170.field2660 = null;
            class156.field2474 = null;
            class268.field4528 = null;
            class297.field5072 = null;
        }
        int var4 = 42 / ((22 - arg0) / 54);
        if (class39.field638 != 0) {
            class50.field776 = true;
        }
        class241.field3951 = class124.field1735;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)Z", line = 2333)
    public static final boolean method1755(boolean arg0, int arg1) {
        class63.field946 = true;
        if (arg0) {
            method1755(false, -105);
        }
        class270.field4628 = arg1 + 1 & 0xFFFF;
        field4351++;
        return true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V", line = 2358)
    private final void method1756(int arg0, boolean arg1) {
        class247.field4139 = null;
        class130.field1979.field3051++;
        class130.field1979.field3050 = arg0;
        if (!arg1) {
            field4352 = 76;
        }
        class321.field5602 = 0;
        class58.field884 = null;
        field4366++;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(II)I", line = 2382)
    public static final int method1757(int arg0, int arg1) {
        if (arg0 != -1800) {
            field4356 = (short[]) null;
        }
        field4371++;
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Loe;)Z", line = 2397)
    public static final boolean method1758(class127 arg0) {
        if (class317.field5495) {
            if (method1759(arg0).field1171 != 0) {
                return false;
            }
            if (arg0.field1902 == 0) {
                return false;
            }
        }
        return arg0.field1870;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Loe;)Lbi;", line = 2417)
    public static final class84 method1759(class127 arg0) {
        class84 var1 = (class84) class27.field456.method1586(((long) arg0.field1868 << 32) + (long) arg0.field1934, -89);
        return var1 == null ? arg0.field1805 : var1;
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V", line = 2422)
    public final void init() {
        field4370++;
        if (!this.method844(4000)) {
            return;
        }
        class304.field5230 = Integer.parseInt(this.getParameter("worldid"));
        class39.field638 = Integer.parseInt(this.getParameter("modewhere"));
        if (class39.field638 < 0 || class39.field638 > 1) {
            class39.field638 = 0;
        }
        class128.field1960 = Integer.parseInt(this.getParameter("modewhat"));
        if (class128.field1960 < 0 || class128.field1960 > 2) {
            class128.field1960 = 0;
        }
        String var1 = this.getParameter("advertsuppressed");
        if (var1 != null && var1.equals("1")) {
            class86.field1207 = true;
        } else {
            class86.field1207 = false;
        }
        try {
            class222.field3622 = Integer.parseInt(this.getParameter("lang"));
        } catch (Exception var12) {
            class222.field3622 = 0;
        }
        class267.method1827(class222.field3622, -2);
        String var3 = this.getParameter("objecttag");
        if (var3 != null && var3.equals("1")) {
            class49.field764 = true;
        } else {
            class49.field764 = false;
        }
        String var4 = this.getParameter("js");
        if (var4 != null && var4.equals("1")) {
            class223.field3630 = true;
        } else {
            class223.field3630 = false;
        }
        String var5 = this.getParameter("game");
        if (var5 != null && var5.equals("1")) {
            class256.field4410 = 1;
        } else {
            class256.field4410 = 0;
        }
        try {
            class45.field726 = Integer.parseInt(this.getParameter("affid"));
        } catch (Exception var11) {
            class45.field726 = 0;
        }
        class106.field1514 = class31.field529.method976((byte) -42, this);
        if (class106.field1514 == null) {
            class106.field1514 = class201.field3252;
        }
        String var7 = this.getParameter("country");
        if (var7 != null) {
            try {
                class93.field1321 = Integer.parseInt(var7);
            } catch (Exception var10) {
                class93.field1321 = 0;
            }
        }
        String var9 = this.getParameter("haveie6");
        if (var9 != null && var9.equals("1")) {
            class211.field3431 = true;
        } else {
            class211.field3431 = false;
        }
        class44.field707 = this;
        this.method836(119, 765, class128.field1960 + 32, 1531, 503);
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V", line = 2512)
    private final void method1760(int arg0) {
        field4367++;
        boolean var2 = class130.field1979.method1271((byte) -49);
        if (arg0 >= 126 && !var2) {
            this.method1752(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I)V", line = 2531)
    public final void method834(int arg0) {
        field4353++;
        if (class232.field3814 == 1000) {
            return;
        }
        boolean var2 = class294.method2032(-1);
        if (var2 && class111.field1571 && class270.field4629 != null) {
            class270.field4629.method1681((byte) -128);
        }
        if ((class232.field3814 == 30 || class232.field3814 == 10) && (class137.field2102 || class316.field5484 != 0L && class76.method507(-30994) > class316.field5484)) {
            class179.method1178(true, class179.field2848, class137.field2102, class89.method586(1), class15.field211);
        }
        if (class23.field397 == null) {
            Container var3;
            if (class23.field397 != null) {
                var3 = class23.field397;
            } else if (class85.field1201 == null) {
                var3 = class34.field572.field2359;
            } else {
                var3 = class85.field1201;
            }
            int var4 = var3.getSize().width;
            int var5 = var3.getSize().height;
            if (class85.field1201 == var3) {
                Insets var6 = class85.field1201.getInsets();
                var4 -= var6.right + var6.left;
                var5 -= var6.top + var6.bottom;
            }
            if (class205.field3350 != var4 || class81.field1137 != var5) {
                if (class151.field2350.startsWith("mac")) {
                    class81.field1137 = var5;
                    class205.field3350 = var4;
                } else {
                    class108.method719(126);
                }
                class316.field5484 = class76.method507(-30994) + 500L;
            }
        }
        if (class23.field397 != null && !class290.field4932 && (class232.field3814 == 30 || class232.field3814 == 10)) {
            class179.method1178(true, -1, false, class167.field2632, -1);
        }
        boolean var7 = false;
        if (class49.field770) {
            var7 = true;
            class49.field770 = false;
        }
        if (var7) {
            class304.method2124(false);
        }
        if (class217.field3516) {
            for (int var8 = 0; var8 < 100; var8++) {
                class249.field4170[var8] = true;
            }
        }
        if (class232.field3814 == 0) {
            class93.method617((Color) null, class139.field2119, var7, class20.field262, arg0 ^ 0x3A57);
        } else if (class232.field3814 == 5) {
            class222.method1535(63, false, class316.field5485);
        } else if (class232.field3814 == 10) {
            class204.method1347(0);
        } else if (class232.field3814 == 25 || class232.field3814 == 28) {
            if (class254.field4399 == 1) {
                if (class205.field3354 > class64.field969) {
                    class64.field969 = class205.field3354;
                }
                int var10 = (class64.field969 - class205.field3354) * 50 / class64.field969;
                class6.method32(class195.method1307(new class152[] { class154.field2457, class116.field1643, class38.method280(arg0 ^ 0x3A2D, var10), class189.field2988 }, (byte) 29), false, 66);
            } else if (class254.field4399 == 2) {
                if (class243.field4032 < class180.field2868) {
                    class243.field4032 = class180.field2868;
                }
                int var9 = ((class243.field4032 - class180.field2868) * 50 / class243.field4032) + 50;
                class6.method32(class195.method1307(new class152[] { class154.field2457, class116.field1643, class38.method280(79, var9), class189.field2988 }, (byte) 29), false, 66);
            } else {
                class6.method32(class154.field2457, false, arg0 ^ 0x3A14);
            }
        } else if (class232.field3814 == 30) {
            class268.method1831(-1);
        } else if (class232.field3814 == 40) {
            class6.method32(class195.method1307(new class152[] { class199.field3223, class198.field3182, class48.field744 }, (byte) 29), false, 66);
        }
        if (class217.field3516 && class232.field3814 != 0) {
            class217.method1464();
            for (int var11 = 0; var11 < class121.field1709; var11++) {
                class206.field3360[var11] = false;
            }
        } else if ((class232.field3814 == 30 || class232.field3814 == 10) && class288.field4868 == 0 && !var7) {
            try {
                Graphics var15 = class224.field3648.getGraphics();
                for (int var16 = 0; var16 < class121.field1709; var16++) {
                    if (class206.field3360[var16]) {
                        class311.field5322.method120(var15, (byte) 100, class227.field3695[var16], class286.field4847[var16], class174.field2788[var16], class288.field4874[var16]);
                        class206.field3360[var16] = false;
                    }
                }
            } catch (Exception var18) {
                class224.field3648.repaint();
            }
        } else if (class232.field3814 != 0) {
            try {
                Graphics var12 = class224.field3648.getGraphics();
                class311.field5322.method121(arg0 ^ 0xFFFFC529, var12, 0, 0);
                for (int var13 = 0; var13 < class121.field1709; var13++) {
                    class206.field3360[var13] = false;
                }
            } catch (Exception var19) {
                class224.field3648.repaint();
            }
        }
        if (class107.field1525) {
            class5.method24(15090);
        }
        if (arg0 == 14934 && class20.field270 && class232.field3814 == 10 && class253.field4387 != -1) {
            class20.field270 = false;
            class134.method854((byte) 106, class34.field572);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V", line = 2767)
    public final void method833(byte arg0) {
        field4365++;
        if (class217.field3516) {
            class217.method1468();
        }
        if (class23.field397 != null) {
            class117.method773(false, class34.field572, class23.field397);
            class23.field397 = null;
        }
        if (class34.field572 != null) {
            class34.field572.method969(this.getClass(), -17159);
        }
        if (class140.field2131 != null) {
            class140.field2131.field2186 = false;
        }
        class140.field2131 = null;
        if (class265.field4477 != null) {
            class265.field4477.method1239((byte) -63);
            class265.field4477 = null;
        }
        class243.method1666(class224.field3648, -4294);
        class308.method2144(class224.field3648, 12988);
        int var2 = -117 % ((arg0 - 72) / 36);
        if (class206.field3359 != null) {
            class206.field3359.method561(class224.field3648, false);
        }
        class176.method1174(0);
        class38.method277((byte) 118);
        class206.field3359 = null;
        if (class270.field4629 != null) {
            class270.field4629.method1671(83);
        }
        if (class224.field3646 != null) {
            class224.field3646.method1671(85);
        }
        class130.field1979.method1279(1);
        class38.field636.method1387(3);
        try {
            if (class297.field5072 != null) {
                class297.field5072.method2270((byte) -120);
            }
            if (class111.field1563 != null) {
                for (int var3 = 0; var3 < class111.field1563.length; var3++) {
                    if (class111.field1563[var3] != null) {
                        class111.field1563[var3].method2270((byte) 95);
                    }
                }
            }
            if (class170.field2660 != null) {
                class170.field2660.method2270((byte) -128);
            }
            if (class156.field2474 != null) {
                class156.field2474.method2270((byte) -123);
            }
        } catch (IOException var5) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V", line = 2853)
    public static final void method1761(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 >= -53) {
            field4356 = (short[]) null;
        }
        class268[] var7 = class194.field3094;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class268 var9 = var7[var8];
            if (var9 != null && var9.field4508 == 2) {
                class232.method1595(arg4, (var9.field4506 - class199.field3226 << 7) + var9.field4515, arg3 >> 1, var9.field4525 * 2, (var9.field4510 - class272.field4670 << 7) + var9.field4517, (byte) 74, arg0, arg2 >> 1);
                if (class201.field3245 > -1 && class142.field2187 % 20 < 10) {
                    class66.field996[var9.field4511].method429(class201.field3245 + arg6 - 12, arg5 + -28 + class287.field4861);
                }
            }
        }
        field4359++;
    }
}
