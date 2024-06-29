import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class119 {

    @OriginalMember(owner = "client!l", name = "a", descriptor = "[I")
    private int[] field2248;

    @OriginalMember(owner = "client!l", name = "h", descriptor = "[I")
    private int[] field2255;

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Ldi;")
    private class43 field2260;

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Ldi;")
    private class43 field2256;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[Ldi;")
    private class43[] field2258;

    @OriginalMember(owner = "client!l", name = "e", descriptor = "Lmb;")
    public static class132 field2252 = class166.method1092("Versteckt", 123);

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lmb;")
    private static class132 field2251 = class166.method1092("Enter your username (V password)3", 118);

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lmb;")
    public static class132 field2254 = field2251;

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lkg;")
    public static class115 field2259 = new class115(64);

    @OriginalMember(owner = "client!l", name = "p", descriptor = "Lmb;")
    public static class132 field2263 = class166.method1092("Bitte versuchen Sie es erneut)3", 114);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "I")
    public static int field2249;

    @OriginalMember(owner = "client!l", name = "c", descriptor = "I")
    public static int field2250;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "I")
    public static int field2253;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field2257;

    @OriginalMember(owner = "client!l", name = "n", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!l", name = "o", descriptor = "Lpb;")
    public static class165 field2262;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(B)V")
    public static void method789(byte arg0) {
        field2262 = null;
        field2263 = null;
        field2254 = null;
        int var1 = 94 % ((2 - arg0) / 60);
        field2252 = null;
        field2251 = null;
        field2259 = null;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(I)I")
    public static final int method790(int arg0) {
        field2249++;
        return arg0 == -14175 ? 6 : 118;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IDIZLhb;Lpb;BZ)[I")
    public final int[] method791(int arg0, double arg1, int arg2, boolean arg3, class79 arg4, class165 arg5, byte arg6, boolean arg7) {
        int[] var10 = new int[arg0 * arg2];
        if (arg6 != -9) {
            this.field2258 = null;
        }
        class149.method989(arg6 ^ 0xFFFFFFB5, arg1);
        field2257++;
        class31.field489 = arg5;
        class96.field1745 = arg4;
        class12.method59((byte) 119, arg0, arg2);
        for (int var11 = 0; var11 < this.field2258.length; var11++) {
            this.field2258[var11].method303(arg2, arg0, 255);
        }
        int var12;
        byte var13;
        int var14;
        if (arg7) {
            var12 = arg0 - 1;
            var13 = -1;
            var14 = -1;
        } else {
            var12 = 0;
            var13 = 1;
            var14 = arg0;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg2; var16++) {
            if (arg3) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field2260.field746) {
                int[] var18 = this.field2260.method64(var16, 0);
                var19 = var18;
                var20 = var18;
                var21 = var18;
            } else {
                int[][] var22 = this.field2260.method203(arg6 - 1884, var16);
                var21 = var22[1];
                var19 = var22[2];
                var20 = var22[0];
            }
            for (int var23 = var12; var23 != var14; var23 += var13) {
                int var24 = var20[var23] >> 4;
                int var25 = var21[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                int var26 = var19[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var26 > 255) {
                    var26 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var27 = class34.field562[var25];
                if (var24 < 0) {
                    var24 = 0;
                }
                int var28 = class34.field562[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var29 = class34.field562[var26];
                var10[var15++] = (var27 << 8) + ((var28 << 16) + var29);
                if (arg3) {
                    var15 += arg0 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field2258.length; var17++) {
            this.field2258[var17].method295(85);
        }
        return var10;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Lhb;BLpb;)Z")
    public final boolean method792(class79 arg0, byte arg1, class165 arg2) {
        field2261++;
        int var4 = 0;
        if (arg1 != 62) {
            method794(-90, (byte) -55, 86L, 69);
        }
        while (var4 < this.field2248.length) {
            if (!arg2.method1070(this.field2248[var4], false)) {
                return false;
            }
            var4++;
        }
        for (int var5 = 0; var5 < this.field2255.length; var5++) {
            if (!arg0.method488(this.field2255[var5], (byte) -48)) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "([Lii;IIIZIIII)V")
    public static final void method793(class96[] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8) {
        if (!arg4) {
            return;
        }
        field2253++;
        for (int var9 = 0; var9 < arg0.length; var9++) {
            class96 var10 = arg0[var9];
            if (var10 != null && (!var10.field1766 || var10.field1760 == 0 || var10.field1775 || class170.method1113(var10, (byte) -50) != 0 || class39.field638 == var10 || var10.field1805 == 1338) && var10.field1776 == arg3 && (!var10.field1766 || !class93.method577(var10, -1))) {
                int var11 = var10.field1752 + arg5;
                int var12 = var10.field1834 + arg1;
                if (class15.field217 == var10) {
                    class151.field2767 = var12;
                    class47.field804 = var11;
                    class91.field1608 = true;
                }
                int var13;
                int var14;
                int var17;
                int var18;
                if (var10.field1760 == 2) {
                    var17 = arg7;
                    var13 = arg6;
                    var18 = arg2;
                    var14 = arg8;
                } else {
                    var13 = var12 > arg6 ? var12 : arg6;
                    var14 = arg8 >= var11 ? arg8 : var11;
                    int var15 = var11 + var10.field1830;
                    int var16 = var10.field1740 + var12;
                    if (var10.field1760 == 9) {
                        var15++;
                        var16++;
                    }
                    var17 = arg7 <= var16 ? arg7 : var16;
                    var18 = arg2 > var15 ? var15 : arg2;
                }
                if (!var10.field1766 || var14 < var18 && var13 < var17) {
                    if (var10.field1760 == 0) {
                        if (!var10.field1766 && class93.method577(var10, -1) && class8.field80 != var10) {
                            continue;
                        }
                        if (var10.field1781 && var14 <= class181.field3329 && var13 <= class36.field584 && var18 > class181.field3329 && class36.field584 < var17) {
                            for (class123 var19 = (class123) class22.field311.method119(true); var19 != null; var19 = (class123) class22.field311.method125((byte) -35)) {
                                if (var19.field2306) {
                                    var19.method995((byte) 120);
                                }
                            }
                            for (class123 var20 = (class123) class183.field3375.method119(true); var20 != null; var20 = (class123) class183.field3375.method125((byte) -57)) {
                                if (var20.field2306) {
                                    var20.method995((byte) -79);
                                }
                            }
                            if (class136.field2560 == 0) {
                                class15.field217 = null;
                                class39.field638 = null;
                            }
                            class148.field2730 = false;
                        }
                    }
                    if (var10.field1766) {
                        boolean var21 = false;
                        boolean var22;
                        if (class181.field3329 >= var14 && var13 <= class36.field584 && var18 > class181.field3329 && class36.field584 < var17) {
                            var22 = true;
                        } else {
                            var22 = false;
                        }
                        boolean var23 = false;
                        if (class61.field1030 == 1 && var22) {
                            var23 = true;
                        }
                        if (class49.field827 == 1 && var14 <= class48.field826 && class189.field3501 >= var13 && var18 > class48.field826 && class189.field3501 < var17) {
                            var21 = true;
                        }
                        if (var21) {
                            class90.method561(class48.field826 - var11, (byte) 123, class189.field3501 - var12, var10);
                        }
                        if (class15.field217 != null && class15.field217 != var10 && var22 && class172.method1119(class170.method1113(var10, (byte) -50), (byte) -126)) {
                            class74.field1227 = var10;
                        }
                        if (class39.field638 == var10) {
                            class99.field1869 = true;
                            class134.field2514 = var11;
                            class27.field446 = var12;
                        }
                        if (var10.field1775 || var10.field1805 != 0) {
                            if (var22 && class95.field1667 != 0 && var10.field1707 != null) {
                                class123 var24 = new class123();
                                var24.field2299 = var10;
                                var24.field2306 = true;
                                var24.field2310 = var10.field1707;
                                var24.field2308 = class95.field1667;
                                class22.field311.method120(0, var24);
                            }
                            if (class15.field217 != null || class15.field220 != null || class202.field3721 || var10.field1805 != 1400 && class148.field2730) {
                                var22 = false;
                                var23 = false;
                                var21 = false;
                            }
                            if (var10.field1805 == 1337) {
                                class183.method1174(var10, 16235);
                                continue;
                            }
                            if (var10.field1805 == 1338) {
                                if (var21) {
                                    class102.method635(class48.field826 - var11, var10, -31562, class189.field3501 - var12);
                                }
                                continue;
                            }
                            if (var10.field1805 == 1400) {
                                class218.field3984 = var10;
                                if (var21) {
                                    if (class9.field85[82] && class169.field3148 > 0) {
                                        int var25 = class28.field451 + (int) ((double) (class48.field826 - var11 - var10.field1830 / 2) * 2.0D / class151.field2765) + class157.field2858;
                                        int var26 = class141.field2632 + class113.field2188 - (int) ((double) (class189.field3501 - var12 - var10.field1740 / 2) * 2.0D / class151.field2765) - class56.field953;
                                        class132 var27 = class187.method1197(new class132[] { class191.field3532, class132.method889(var25 >> 6, (byte) 114), class27.field440, class132.method889(var26 >> 6, (byte) 118), class27.field440, class132.method889(var25 & 0x3F, (byte) 115), class27.field440, class132.method889(var26 & 0x3F, (byte) 123) }, -126);
                                        var27.method888((byte) -121);
                                        class85.method533(var27, 64);
                                        class200.method1262(-3727);
                                        continue;
                                    }
                                    class230.field4147 = class36.field584;
                                    class155.field2844 = class56.field953;
                                    class148.field2730 = true;
                                    class62.field1041 = class181.field3329;
                                    class74.field1237 = class157.field2858;
                                    continue;
                                }
                                if (var23 && class148.field2730) {
                                    class111.method706(-14422, (int) ((double) (class62.field1041 - class181.field3329) * 2.0D / class53.field902) + class74.field1237);
                                    class9.method44(true, class155.field2844 + (int) ((double) (class230.field4147 - class36.field584) * 2.0D / class53.field902));
                                    continue;
                                }
                                class148.field2730 = false;
                                continue;
                            }
                            if (var10.field1805 == 1401) {
                                if (var23) {
                                    class235.method1488(class36.field584 - var12, var10.field1740, (byte) -50, class181.field3329 - var11, var10.field1830);
                                }
                                continue;
                            }
                            if (!var10.field1735 && var21) {
                                var10.field1735 = true;
                                if (var10.field1694 != null) {
                                    class123 var28 = new class123();
                                    var28.field2310 = var10.field1694;
                                    var28.field2306 = true;
                                    var28.field2305 = class48.field826 - var11;
                                    var28.field2308 = class189.field3501 - var12;
                                    var28.field2299 = var10;
                                    class22.field311.method120(0, var28);
                                }
                            }
                            if (var10.field1735 && var23 && var10.field1832 != null) {
                                class123 var29 = new class123();
                                var29.field2308 = class36.field584 - var12;
                                var29.field2306 = true;
                                var29.field2310 = var10.field1832;
                                var29.field2305 = class181.field3329 - var11;
                                var29.field2299 = var10;
                                class22.field311.method120(0, var29);
                            }
                            if (var10.field1735 && !var23) {
                                var10.field1735 = false;
                                if (var10.field1714 != null) {
                                    class123 var30 = new class123();
                                    var30.field2299 = var10;
                                    var30.field2310 = var10.field1714;
                                    var30.field2306 = true;
                                    var30.field2305 = class181.field3329 - var11;
                                    var30.field2308 = class36.field584 - var12;
                                    class183.field3375.method120(0, var30);
                                }
                            }
                            if (var23 && var10.field1822 != null) {
                                class123 var31 = new class123();
                                var31.field2310 = var10.field1822;
                                var31.field2305 = class181.field3329 - var11;
                                var31.field2308 = class36.field584 - var12;
                                var31.field2299 = var10;
                                var31.field2306 = true;
                                class22.field311.method120(0, var31);
                            }
                            if (!var10.field1736 && var22) {
                                var10.field1736 = true;
                                if (var10.field1705 != null) {
                                    class123 var32 = new class123();
                                    var32.field2308 = class36.field584 - var12;
                                    var32.field2306 = true;
                                    var32.field2299 = var10;
                                    var32.field2305 = class181.field3329 - var11;
                                    var32.field2310 = var10.field1705;
                                    class22.field311.method120(0, var32);
                                }
                            }
                            if (var10.field1736 && var22 && var10.field1763 != null) {
                                class123 var33 = new class123();
                                var33.field2310 = var10.field1763;
                                var33.field2306 = true;
                                var33.field2305 = class181.field3329 - var11;
                                var33.field2299 = var10;
                                var33.field2308 = class36.field584 - var12;
                                class22.field311.method120(0, var33);
                            }
                            if (var10.field1736 && !var22) {
                                var10.field1736 = false;
                                if (var10.field1769 != null) {
                                    class123 var34 = new class123();
                                    var34.field2308 = class36.field584 - var12;
                                    var34.field2310 = var10.field1769;
                                    var34.field2305 = class181.field3329 - var11;
                                    var34.field2299 = var10;
                                    var34.field2306 = true;
                                    class183.field3375.method120(0, var34);
                                }
                            }
                            if (var10.field1731 != null) {
                                class123 var35 = new class123();
                                var35.field2299 = var10;
                                var35.field2310 = var10.field1731;
                                class234.field4220.method120(0, var35);
                            }
                            if (var10.field1699 != null && var10.field1824 < class52.field884) {
                                if (var10.field1791 == null || class52.field884 - var10.field1824 > 32) {
                                    class123 var40 = new class123();
                                    var40.field2299 = var10;
                                    var40.field2310 = var10.field1699;
                                    class22.field311.method120(0, var40);
                                } else {
                                    label433: for (int var36 = var10.field1824; var36 < class52.field884; var36++) {
                                        int var37 = class112.field2134[var36 & 0x1F];
                                        for (int var38 = 0; var38 < var10.field1791.length; var38++) {
                                            if (var10.field1791[var38] == var37) {
                                                class123 var39 = new class123();
                                                var39.field2310 = var10.field1699;
                                                var39.field2299 = var10;
                                                class22.field311.method120(0, var39);
                                                break label433;
                                            }
                                        }
                                    }
                                }
                                var10.field1824 = class52.field884;
                            }
                            if (var10.field1767 != null && var10.field1729 < class91.field1614) {
                                if (var10.field1732 == null || class91.field1614 - var10.field1729 > 32) {
                                    class123 var45 = new class123();
                                    var45.field2299 = var10;
                                    var45.field2310 = var10.field1767;
                                    class22.field311.method120(0, var45);
                                } else {
                                    label409: for (int var41 = var10.field1729; var41 < class91.field1614; var41++) {
                                        int var42 = class42.field706[var41 & 0x1F];
                                        for (int var43 = 0; var43 < var10.field1732.length; var43++) {
                                            if (var10.field1732[var43] == var42) {
                                                class123 var44 = new class123();
                                                var44.field2299 = var10;
                                                var44.field2310 = var10.field1767;
                                                class22.field311.method120(0, var44);
                                                break label409;
                                            }
                                        }
                                    }
                                }
                                var10.field1729 = class91.field1614;
                            }
                            if (var10.field1831 != null && class95.field1681 > var10.field1826) {
                                if (var10.field1803 == null || class95.field1681 - var10.field1826 > 32) {
                                    class123 var50 = new class123();
                                    var50.field2310 = var10.field1831;
                                    var50.field2299 = var10;
                                    class22.field311.method120(0, var50);
                                } else {
                                    label385: for (int var46 = var10.field1826; var46 < class95.field1681; var46++) {
                                        int var47 = class194.field3606[var46 & 0x1F];
                                        for (int var48 = 0; var48 < var10.field1803.length; var48++) {
                                            if (var10.field1803[var48] == var47) {
                                                class123 var49 = new class123();
                                                var49.field2310 = var10.field1831;
                                                var49.field2299 = var10;
                                                class22.field311.method120(0, var49);
                                                break label385;
                                            }
                                        }
                                    }
                                }
                                var10.field1826 = class95.field1681;
                            }
                            if (class13.field165 > var10.field1727 && var10.field1782 != null) {
                                class123 var51 = new class123();
                                var51.field2310 = var10.field1782;
                                var51.field2299 = var10;
                                class22.field311.method120(0, var51);
                            }
                            if (var10.field1727 < class113.field2183 && var10.field1836 != null) {
                                class123 var52 = new class123();
                                var52.field2310 = var10.field1836;
                                var52.field2299 = var10;
                                class22.field311.method120(0, var52);
                            }
                            if (class102.field1918 > var10.field1727 && var10.field1818 != null) {
                                class123 var53 = new class123();
                                var53.field2299 = var10;
                                var53.field2310 = var10.field1818;
                                class22.field311.method120(0, var53);
                            }
                            if (class102.field1920 > var10.field1727 && var10.field1700 != null) {
                                class123 var54 = new class123();
                                var54.field2299 = var10;
                                var54.field2310 = var10.field1700;
                                class22.field311.method120(0, var54);
                            }
                            if (class49.field835 > var10.field1727 && var10.field1711 != null) {
                                class123 var55 = new class123();
                                var55.field2310 = var10.field1711;
                                var55.field2299 = var10;
                                class22.field311.method120(0, var55);
                            }
                            var10.field1727 = class13.field167;
                            if (var10.field1801 != null) {
                                for (int var56 = 0; var56 < class163.field2950; var56++) {
                                    class123 var57 = new class123();
                                    var57.field2299 = var10;
                                    var57.field2304 = class32.field491[var56];
                                    var57.field2302 = class81.field1366[var56];
                                    var57.field2310 = var10.field1801;
                                    class22.field311.method120(0, var57);
                                }
                            }
                        }
                    }
                    if (!var10.field1766 && class15.field217 == null && class15.field220 == null && !class202.field3721) {
                        if ((var10.field1721 >= 0 || var10.field1703 != 0) && class181.field3329 >= var14 && var13 <= class36.field584 && class181.field3329 < var18 && var17 > class36.field584) {
                            if (var10.field1721 >= 0) {
                                class8.field80 = arg0[var10.field1721];
                            } else {
                                class8.field80 = var10;
                            }
                        }
                        if (var10.field1760 == 8 && var14 <= class181.field3329 && var13 <= class36.field584 && var18 > class181.field3329 && class36.field584 < var17) {
                            class166.field3026 = var10;
                        }
                        if (var10.field1833 > var10.field1740) {
                            class24.method185(29749, var12, class181.field3329, var10, class36.field584, var10.field1740, var10.field1833, var10.field1830 + var11);
                        }
                    }
                    if (var10.field1760 == 0) {
                        method793(arg0, var12 - var10.field1695, var18, var10.field1794, true, var11 - var10.field1800, var13, var17, var14);
                        if (var10.field1770 != null) {
                            method793(var10.field1770, var12 - var10.field1695, var18, var10.field1794, true, var11 - var10.field1800, var13, var17, var14);
                        }
                        class73 var58 = (class73) class55.field927.method806(-1, (long) var10.field1794);
                        if (var58 != null) {
                            class238.method1505(var58.field1216, var13, var18, (byte) 127, var12, var17, var11, var14);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(IBJI)Z")
    public static final boolean method794(int arg0, byte arg1, long arg2, int arg3) {
        int var5 = (int) arg2 >> 14 & 0x1F;
        field2250++;
        int var6 = (int) arg2 >> 20 & 0x3;
        if (arg1 != -24) {
            field2259 = null;
        }
        int var7 = (int) (arg2 >>> 32) & Integer.MAX_VALUE;
        if (var5 == 10 || var5 == 11 || var5 == 22) {
            class84 var8 = class66.method414(0, var7);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var9 = var8.field1440;
                var10 = var8.field1434;
            } else {
                var9 = var8.field1434;
                var10 = var8.field1440;
            }
            int var11 = var8.field1414;
            if (var6 != 0) {
                var11 = (var11 >> 4 - var6) + (var11 << var6 & 0xF);
            }
            class37.method265(var9, var11, class210.field3854.field703[0], true, -111, 0, var10, arg0, 2, arg3, 0, class210.field3854.field676[0]);
        } else {
            class37.method265(0, 0, class210.field3854.field703[0], true, -127, var5 + 1, 0, arg0, 2, arg3, var6, class210.field3854.field676[0]);
        }
        class89.field1565 = class48.field826;
        class149.field2734 = 2;
        class125.field2321 = class189.field3501;
        class194.field3612 = 0;
        return true;
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "()V")
    public class119() {
        this.field2248 = new int[0];
        this.field2255 = new int[0];
        this.field2260 = new class135();
        this.field2260.field744 = 1;
        this.field2256 = new class135();
        this.field2256.field744 = 1;
        this.field2258 = new class43[] { this.field2260, this.field2256 };
    }

    @OriginalMember(owner = "client!l", name = "<init>", descriptor = "(Lkd;)V")
    public class119(class112 arg0) {
        int var2 = arg0.method716(-1308);
        this.field2258 = new class43[var2];
        int var3 = 0;
        int var4 = 0;
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class43 var16 = class35.method252((byte) -116, arg0);
            if (var16.method299(-106) >= 0) {
                var3++;
            }
            if (var16.method297(-1) >= 0) {
                var4++;
            }
            int var17 = var16.field772.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method716(-1308);
            }
            this.field2258[var6] = var16;
        }
        this.field2248 = new int[var3];
        this.field2255 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class43 var11 = this.field2258[var9];
            int var12 = var11.field772.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field772[var13] = this.field2258[var5[var9][var13]];
            }
            int var14 = var11.method299(-56);
            int var15 = var11.method297(-1);
            if (var14 > 0) {
                this.field2248[var8++] = var14;
            }
            if (var15 > 0) {
                this.field2255[var7++] = var15;
            }
            var5[var9] = null;
        }
        this.field2260 = this.field2258[arg0.method716(-1308)];
        this.field2256 = this.field2258[arg0.method716(-1308)];
        Object var10 = null;
    }
}
