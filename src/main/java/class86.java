import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class86 {

    @OriginalMember(owner = "client!n", name = "u", descriptor = "Z")
    public static volatile boolean field2058 = true;

    @OriginalMember(owner = "client!n", name = "o", descriptor = "Lvc;")
    public static class137 field2052 = class45.method325("Cabbage", -46);

    @OriginalMember(owner = "client!n", name = "l", descriptor = "Lvc;")
    public static class137 field2049 = class45.method325("", -46);

    @OriginalMember(owner = "client!n", name = "p", descriptor = "I")
    public static int field2053 = -1;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2042 = -1;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "Lvc;")
    private static class137 field2044 = class45.method325("No response from server)3", -46);

    @OriginalMember(owner = "client!n", name = "i", descriptor = "Lvc;")
    private static class137 field2046 = class45.method325("Examine", -46);

    @OriginalMember(owner = "client!n", name = "y", descriptor = "Lvc;")
    private static class137 field2062 = class45.method325("Your profile will be transferred in:", -46);

    @OriginalMember(owner = "client!n", name = "r", descriptor = "Lvc;")
    public static class137 field2055 = field2044;

    @OriginalMember(owner = "client!n", name = "q", descriptor = "Lvc;")
    public static class137 field2054 = field2046;

    @OriginalMember(owner = "client!n", name = "m", descriptor = "Lvc;")
    public static class137 field2050 = field2062;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!n", name = "c", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!n", name = "k", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!n", name = "s", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!n", name = "t", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!n", name = "v", descriptor = "I")
    public static int field2059;

    @OriginalMember(owner = "client!n", name = "w", descriptor = "I")
    public static int field2060;

    @OriginalMember(owner = "client!n", name = "x", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!n", name = "n", descriptor = "[I")
    public static int[] field2051;

    @OriginalMember(owner = "client!n", name = "j", descriptor = "[Lia;")
    public static class57[] field2047;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BILcf;B)V")
    public static final void method629(byte[] arg0, int arg1, class21 arg2, byte arg3) {
        if (arg3 != -31) {
            method631(-29, -46);
        }
        class98 var4 = new class98();
        var4.field2295 = arg2;
        field2059++;
        var4.field2490 = arg1;
        var4.field2276 = arg0;
        var4.field2280 = 0;
        class100 var5 = class106.field2471;
        synchronized (class106.field2471) {
            class106.field2471.method730(467, var4);
        }
        class7.method48((byte) 94);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lla;I)V")
    public static final void method630(class75 arg0, int arg1) {
        arg0.field1668 = arg0.field1688;
        field2043++;
        if (arg0.field1631 == 0) {
            arg0.field1650 = 0;
            return;
        }
        if (arg0.field1654 != -1 && arg0.field1669 == 0) {
            class143 var2 = class68.method481(0, arg0.field1654);
            if (arg0.field1623 > 0 && var2.field3380 == 0) {
                arg0.field1650++;
                return;
            }
            if (arg0.field1623 <= 0 && var2.field3388 == 0) {
                arg0.field1650++;
                return;
            }
        }
        int var3 = arg0.field1672;
        int var4 = arg0.field1646;
        int var5 = arg0.field1624[arg0.field1631 - 1] * 128 + arg0.field1673 * 64;
        int var6 = arg0.field1647[arg0.field1631 - 1] * 128 + arg0.field1673 * 64;
        if (var6 - var3 > 256 || var6 - var3 < -256 || var5 - var4 > 256 || var5 - var4 < -256) {
            arg0.field1672 = var6;
            arg0.field1646 = var5;
            return;
        }
        if (var3 < var6) {
            if (var5 > var4) {
                arg0.field1632 = 1280;
            } else if (var5 < var4) {
                arg0.field1632 = 1792;
            } else {
                arg0.field1632 = 1536;
            }
        } else if (var3 > var6) {
            if (var5 > var4) {
                arg0.field1632 = 768;
            } else if (var5 >= var4) {
                arg0.field1632 = 512;
            } else {
                arg0.field1632 = 256;
            }
        } else if (var5 > var4) {
            arg0.field1632 = 1024;
        } else if (var5 < var4) {
            arg0.field1632 = 0;
        }
        int var7 = arg0.field1685;
        int var8 = arg0.field1632 - arg0.field1652 & 0x7FF;
        int var9 = 54 / ((arg1 + 54) / 48);
        boolean var10 = true;
        if (var8 > 1024) {
            var8 -= 2048;
        }
        if (var8 >= -256 && var8 <= 256) {
            var7 = arg0.field1649;
        } else if (var8 >= 256 && var8 < 768) {
            var7 = arg0.field1630;
        } else if (var8 >= -768 && var8 <= -256) {
            var7 = arg0.field1677;
        }
        if (var7 == -1) {
            var7 = arg0.field1649;
        }
        arg0.field1668 = var7;
        int var11 = 4;
        if (arg0 instanceof class56) {
            var10 = ((class56) arg0).field1203.field3224;
        }
        if (var10) {
            if (arg0.field1652 != arg0.field1632 && arg0.field1625 == -1 && arg0.field1634 != 0) {
                var11 = 2;
            }
            if (arg0.field1631 > 2) {
                var11 = 6;
            }
            if (arg0.field1631 > 3) {
                var11 = 8;
            }
            if (arg0.field1650 > 0 && arg0.field1631 > 1) {
                var11 = 8;
                arg0.field1650--;
            }
        } else {
            if (arg0.field1631 > 1) {
                var11 = 6;
            }
            if (arg0.field1631 > 2) {
                var11 = 8;
            }
            if (arg0.field1650 > 0 && arg0.field1631 > 1) {
                var11 = 8;
                arg0.field1650--;
            }
        }
        if (arg0.field1662[arg0.field1631 - 1]) {
            var11 <<= 0x1;
        }
        if (var11 >= 8 && arg0.field1668 == arg0.field1649 && arg0.field1622 != -1) {
            arg0.field1668 = arg0.field1622;
        }
        if (var6 > var3) {
            arg0.field1672 += var11;
            if (var6 < arg0.field1672) {
                arg0.field1672 = var6;
            }
        } else if (var6 < var3) {
            arg0.field1672 -= var11;
            if (var6 > arg0.field1672) {
                arg0.field1672 = var6;
            }
        }
        if (var5 > var4) {
            arg0.field1646 += var11;
            if (var5 < arg0.field1646) {
                arg0.field1646 = var5;
            }
        } else if (var4 > var5) {
            arg0.field1646 -= var11;
            if (var5 > arg0.field1646) {
                arg0.field1646 = var5;
            }
        }
        if (arg0.field1672 == var6 && arg0.field1646 == var5) {
            if (arg0.field1623 > 0) {
                arg0.field1623--;
            }
            arg0.field1631--;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(J)V")
    public void method370(long arg0) {
        field2045++;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method631(int arg0, int arg1) {
        if (arg0 != 17537) {
            method633(62);
        }
        field2048++;
        if (arg1 == -1 && class91.field2152 == 0) {
            class13.method84(-6027);
        } else if (arg1 != -1 && class114.field2711 != arg1 && class10.field218 != 0 && class91.field2152 == 0) {
            class13.method86(false, class23.field553, arg0 - 17526, class10.field218, arg1, 10, 0, 0);
        }
        class114.field2711 = arg1;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lwe;BLwe;)V")
    public static final void method632(class145 arg0, byte arg1, class145 arg2) {
        field2061++;
        class106.field2476.method680(-93);
        if (class107.field2493 == 0 || class107.field2493 == 5) {
            byte var3 = 20;
            arg0.method1146(class116.field2770, 180, 74 - var3, 16777215);
            int var4 = 82 - var3;
            class62.method457(28, var4, 304, 34, 9179409);
            class62.method457(29, var4 + 1, 302, 32, 0);
            class62.method454(30, var4 + 2, class67.field1389 * 3, 30, 9179409);
            class62.method454(class67.field1389 * 3 + 30, var4 + 2, 300 - class67.field1389 * 3, 30, 0);
            arg0.method1146(class115.field2733, 180, 105 - var3, 16777215);
        }
        if (class107.field2493 == 20) {
            byte var5 = 40;
            class58.field1240.method394(0, 0);
            arg0.method1138(class115.field2734, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg0.method1138(class115.field2740, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg0.method1138(class115.field2739, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg0.method1147(class88.method666(-32, new class137[] { class102.field2370, class115.field2732 }), 90, var22, 16777215, true);
            int var24 = var22 + 15;
            arg0.method1147(class88.method666(114, new class137[] { class109.field2543, class115.field2735.method1000(43) }), 92, var24, 16777215, true);
            int var26 = var24 + 15;
        }
        if (class107.field2493 == 10) {
            class58.field1240.method394(0, 0);
            if (class10.field211 == 0) {
                byte var13 = 80;
                arg0.method1138(class34.field723, 180, var13, 16776960, true);
                int var35 = var13 + 30;
                byte var14 = 100;
                byte var15 = 120;
                class59.field1273.method394(var14 - 73, var15 + -20);
                arg0.method1134(class100.field2336, var14 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class59.field1273.method394(var16 - 73, var15 - 20);
                arg0.method1134(class131.field3044, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            } else if (class10.field211 == 2) {
                byte var6 = 40;
                byte var7 = 100;
                short var8 = 150;
                arg0.method1138(class115.field2734, 180, var6, 16776960, true);
                int var23 = var6 + 15;
                arg0.method1138(class115.field2740, 180, var23, 16776960, true);
                int var25 = var23 + 15;
                arg0.method1138(class115.field2739, 180, var25, 16776960, true);
                int var27 = var25 + 15;
                int var28 = var27 + 10;
                arg0.method1147(class88.method666(1, new class137[] { class102.field2370, class115.field2732, class112.field2667 % 40 < 20 & class125.field2912 == 0 ? class49.field1108 : class115.field2737 }), 90, var28, 16777215, true);
                int var29 = var28 + 15;
                arg0.method1147(class88.method666(-61, new class137[] { class109.field2543, class115.field2735.method1000(25), class125.field2912 == 1 & class112.field2667 % 40 < 20 ? class49.field1108 : class115.field2737 }), 92, var29, 16777215, true);
                int var30 = var29 + 15;
                class59.field1273.method394(var7 - 73, var8 + -20);
                arg0.method1138(class137.field3160, var7, var8 + 5, 16777215, true);
                short var9 = 260;
                class59.field1273.method394(var9 - 73, var8 + -20);
                arg0.method1138(class48.field1063, var9, var8 + 5, 16777215, true);
            } else if (class10.field211 == 3) {
                arg0.method1138(class122.field2842, 180, 40, 16776960, true);
                byte var10 = 65;
                short var11 = 180;
                arg0.method1138(class48.field1080, 180, var10, 16777215, true);
                int var31 = var10 + 15;
                arg0.method1138(class132.field3078, 180, var31, 16777215, true);
                short var12 = 150;
                int var32 = var31 + 15;
                arg0.method1138(class12.field257, 180, var32, 16777215, true);
                int var33 = var32 + 15;
                arg0.method1138(class141.field3330, 180, var33, 16777215, true);
                int var34 = var33 + 15;
                class59.field1273.method394(var11 - 73, var12 + -20);
                arg0.method1138(class48.field1063, var11, var12 + 5, 16777215, true);
            }
        }
        class80.method584(6);
        try {
            Graphics var17 = class124.field2871.getGraphics();
            class106.field2476.method61(202, var17, 171, (byte) -79);
            if (arg1 > 37) {
                class8.field193.method61(0, var17, 0, (byte) -128);
                class99.field2322.method61(637, var17, 0, (byte) -56);
                if (field2058) {
                    field2058 = false;
                    class32.field695.method61(128, var17, 0, (byte) -117);
                    class73.field1547.method61(202, var17, 371, (byte) -89);
                    class134.field3109.method61(0, var17, 265, (byte) -68);
                    class1.field4.method61(562, var17, 265, (byte) -55);
                    class30.field668.method61(128, var17, 171, (byte) -79);
                    class29.field642.method61(562, var17, 171, (byte) -60);
                }
            }
        } catch (Exception var18) {
            class124.field2871.repaint();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(I)V")
    public static void method633(int arg0) {
        field2047 = null;
        field2062 = null;
        field2055 = null;
        field2051 = null;
        field2049 = null;
        if (arg0 != 2047) {
            return;
        }
        field2046 = null;
        field2054 = null;
        field2052 = null;
        field2044 = null;
        field2050 = null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(ILeb;)V")
    public static final synchronized void method634(int arg0, class31 arg1) {
        field2040++;
        class143.field3357 = arg1;
        if (arg0 != 4775) {
            method631(-100, 68);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([II)V")
    public static final synchronized void method635(int[] arg0, int arg1) {
        int var2 = arg1;
        if (class121.field2826) {
            var2 = arg1 << 1;
        }
        int var3 = 0;
        var2 -= 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
            arg0[var3++] = 0;
        }
        var2 += 7;
        while (var3 < var2) {
            arg0[var3++] = 0;
        }
        class40.field895 -= arg1;
        if (class143.field3357 != null && class40.field895 <= 0) {
            class40.field895 += class85.field2025 >> 4;
            class103.method752((byte) 82, class143.field3357);
            class105.method762(-15506, class143.field3357, class143.field3357.method127());
            int var4 = 0;
            int var5 = 255;
            int var6 = 7;
            label114: while (var5 != 0) {
                int var7;
                int var8;
                if (var6 < 0) {
                    var7 = var6 & 0x3;
                    var8 = -(var6 >> 2);
                } else {
                    var7 = var6;
                    var8 = 0;
                }
                for (int var9 = var5 >>> var7 & 0x11111111; var9 != 0; var9 >>>= 0x4) {
                    if ((var9 & 0x1) != 0) {
                        var5 &= ~(0x1 << var7);
                        class31 var10 = null;
                        class31 var11 = class128.field3013[var7];
                        label108: while (true) {
                            while (true) {
                                if (var11 == null) {
                                    break label108;
                                }
                                class135 var12 = var11.field678;
                                if (var12 == null || var12.field3127 <= var8) {
                                    var11.field675 = true;
                                    int var13 = var11.method135();
                                    var4 += var13;
                                    if (var12 != null) {
                                        var12.field3127 += var13;
                                    }
                                    if (var4 >= class29.field636) {
                                        break label114;
                                    }
                                    class31 var14 = var11.method116();
                                    if (var14 != null) {
                                        int var15 = var11.field677;
                                        while (var14 != null) {
                                            class105.method762(-15506, var14, var15 * var14.method127() >> 8);
                                            var14 = var11.method120();
                                        }
                                    }
                                    class31 var16 = var11.field676;
                                    var11.field676 = null;
                                    if (var10 == null) {
                                        class128.field3013[var7] = var16;
                                    } else {
                                        var10.field676 = var16;
                                    }
                                    if (var16 == null) {
                                        class106.field2475[var7] = var10;
                                    }
                                    var11 = var16;
                                } else {
                                    var5 |= 0x1 << var7;
                                    var10 = var11;
                                    var11 = var11.field676;
                                }
                            }
                        }
                    }
                    var7 += 4;
                    var8++;
                }
                var6--;
            }
            for (int var17 = 0; var17 < 8; var17++) {
                class31 var18 = class128.field3013[var17];
                class128.field3013[var17] = class106.field2475[var17] = null;
                while (var18 != null) {
                    class31 var19 = var18.field676;
                    var18.field676 = null;
                    var18 = var19;
                }
            }
        }
        if (class40.field895 < 0) {
            class40.field895 = 0;
        }
        if (class143.field3357 != null) {
            class143.field3357.method140(arg0, 0, arg1);
        }
        class19.method172(arg1, true);
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(II)V")
    public static final void method636(int arg0, int arg1) {
        field2038++;
        if (arg0 <= 0) {
            method636(-59, 126);
        }
        if (class143.field3362 == null) {
            return;
        }
        if (class47.field1055 != 0) {
            if (class12.field273 == null) {
                return;
            }
            class121.field2816 = arg1;
        } else if (class142.field3352 >= 0) {
            class142.field3352 = arg1;
            class143.field3362.method156(-110, arg1, 0);
            return;
        }
    }

    @OriginalMember(owner = "client!n", name = "c", descriptor = "(II)V")
    public static final synchronized void method637(int arg0, int arg1) {
        field2039++;
        class40.field895 -= arg1;
        if (arg0 > -120) {
            return;
        }
        if (class40.field895 < 0) {
            class40.field895 = 0;
        }
        if (class143.field3357 != null) {
            class143.field3357.method117(arg1);
        }
        class19.method172(arg1, true);
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(Lme;I)Lme;")
    public static final class85 method638(class85 arg0, int arg1) {
        class85 var2 = class111.method858(arg0, (byte) -105);
        field2041++;
        if (var2 == null) {
            var2 = arg0.field1984;
        }
        return arg1 == 255 ? var2 : null;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIII)V")
    public static final void method639(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 == 1) {
            class75.field1664++;
            class72.field1527.method845(226, 100);
            class72.field1527.method817(arg2 + 29008, arg0);
            class72.field1527.method793(arg1, (byte) 46);
        }
        if (arg3 == 2) {
            class72.field1527.method845(219, 100);
            class141.field3294++;
            class72.field1527.method817(-2770, arg0);
            class72.field1527.method793(arg1, (byte) 90);
        }
        if (arg2 != -31778) {
            return;
        }
        if (arg3 == 3) {
            class72.field1527.method845(71, 100);
            class72.field1527.method817(-2770, arg0);
            class12.field265++;
            class72.field1527.method793(arg1, (byte) 37);
        }
        field2056++;
        if (arg3 == 4) {
            class109.field2539++;
            class72.field1527.method845(156, 100);
            class72.field1527.method817(-2770, arg0);
            class72.field1527.method793(arg1, (byte) 36);
        }
        if (arg3 == 5) {
            class100.field2342++;
            class72.field1527.method845(192, arg2 ^ 0xFFFF83BA);
            class72.field1527.method817(arg2 + 29008, arg0);
            class72.field1527.method793(arg1, (byte) 69);
        }
        if (arg3 == 6) {
            class72.field1527.method845(163, 100);
            class72.field1527.method817(-2770, arg0);
            class72.field1527.method793(arg1, (byte) 39);
            class67.field1382++;
        }
        if (arg3 == 7) {
            class38.field844++;
            class72.field1527.method845(213, 100);
            class72.field1527.method817(-2770, arg0);
            class72.field1527.method793(arg1, (byte) 107);
        }
        if (arg3 == 8) {
            class72.field1527.method845(190, arg2 ^ 0xFFFF83BA);
            class43.field938++;
            class72.field1527.method817(arg2 + 29008, arg0);
            class72.field1527.method793(arg1, (byte) 55);
        }
        if (arg3 == 9) {
            class80.field1779++;
            class72.field1527.method845(137, 100);
            class72.field1527.method817(-2770, arg0);
            class72.field1527.method793(arg1, (byte) 37);
        }
        if (arg3 == 10) {
            class67.field1373++;
            class72.field1527.method845(200, 100);
            class72.field1527.method817(arg2 + 29008, arg0);
            class72.field1527.method793(arg1, (byte) 120);
        }
        class85 var4 = class28.method223(arg1, 31229, arg0);
        if (var4 != null && var4.field1940 != null) {
            class63.method461(0, null, var4.field1940, arg3, (byte) 93, 0, var4);
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "()V")
    public void method21() {
        field2057++;
    }
}
