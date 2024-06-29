import java.awt.Graphics;
import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class91 extends class140 {

    @OriginalMember(owner = "client!oc", name = "Sb", descriptor = "Ljava/util/Calendar;")
    public static Calendar field2105 = Calendar.getInstance();

    @OriginalMember(owner = "client!oc", name = "Zb", descriptor = "Lkc;")
    private static class67 field2112 = class19.method144("@yel@*V", 84);

    @OriginalMember(owner = "client!oc", name = "Xb", descriptor = "Lkc;")
    private static class67 field2110 = class19.method144("Starting game engine)3)3)3", 118);

    @OriginalMember(owner = "client!oc", name = "bc", descriptor = "Lkc;")
    private static class67 field2114 = class19.method144(" is already on your friend list", 108);

    @OriginalMember(owner = "client!oc", name = "Tb", descriptor = "Lkc;")
    public static class67 field2106 = class19.method144(" )2>", 116);

    @OriginalMember(owner = "client!oc", name = "cc", descriptor = "I")
    public static int field2115 = 0;

    @OriginalMember(owner = "client!oc", name = "dc", descriptor = "[I")
    public static int[] field2116 = new int[50];

    @OriginalMember(owner = "client!oc", name = "Wb", descriptor = "[I")
    public static int[] field2109 = new int[25];

    @OriginalMember(owner = "client!oc", name = "Vb", descriptor = "Lkc;")
    public static class67 field2108 = field2114;

    @OriginalMember(owner = "client!oc", name = "ec", descriptor = "Lkc;")
    public static class67 field2117 = class19.method144(": ", 123);

    @OriginalMember(owner = "client!oc", name = "fc", descriptor = "Lkc;")
    public static class67 field2118 = field2110;

    @OriginalMember(owner = "client!oc", name = "Ub", descriptor = "Lkc;")
    private static class67 field2107 = class19.method144("Your account has been disabled)3", 79);

    @OriginalMember(owner = "client!oc", name = "ac", descriptor = "Lkc;")
    public static class67 field2113 = field2107;

    @OriginalMember(owner = "client!oc", name = "Ab", descriptor = "I")
    public static int field2087;

    @OriginalMember(owner = "client!oc", name = "Bb", descriptor = "I")
    public static int field2088;

    @OriginalMember(owner = "client!oc", name = "Db", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!oc", name = "Eb", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!oc", name = "Fb", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!oc", name = "Gb", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!oc", name = "Hb", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!oc", name = "Ib", descriptor = "I")
    public static int field2095;

    @OriginalMember(owner = "client!oc", name = "Jb", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!oc", name = "Kb", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!oc", name = "Lb", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!oc", name = "Mb", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!oc", name = "Nb", descriptor = "I")
    public static int field2100;

    @OriginalMember(owner = "client!oc", name = "Ob", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!oc", name = "Pb", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!oc", name = "Qb", descriptor = "I")
    private int field2103;

    @OriginalMember(owner = "client!oc", name = "Rb", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!oc", name = "Yb", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!oc", name = "Cb", descriptor = "Lj;")
    private class58 field2089;

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(B)I", line = 4)
    public final int method708(byte arg0) {
        ++field2098;
        if (arg0 >= -10) {
            this.method716((byte) -97);
        }
        return 255 & super.field3325[super.field3347++] + -this.field2089.method453(-26972);
    }

    @OriginalMember(owner = "client!oc", name = "g", descriptor = "(IB)I", line = 37)
    public final int method709(int arg0, byte arg1) {
        ++field2095;
        int var3 = this.field2103 >> 3;
        int var4 = 8 - (7 & this.field2103);
        if (arg1 != 86) {
            field2117 = null;
        }
        this.field2103 += arg0;
        int var5 = 0;
        while (~arg0 < ~var4) {
            var5 += (super.field3325[var3++] & class12.field278[var4]) << arg0 - var4;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field3325[var3] >> -arg0 + var4 & class12.field278[arg0]) + var5;
        } else {
            var6 = (super.field3325[var3] & class12.field278[var4]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(IB)I", line = 71)
    public final int method710(int arg0, byte arg1) {
        if (arg1 < 109) {
            return -78;
        } else {
            ++field2104;
            return arg0 * 8 + -this.field2103;
        }
    }

    @OriginalMember(owner = "client!oc", name = "e", descriptor = "(Z)V", line = 82)
    public static final void method711(boolean arg0) {
        ++field2090;
        for (class122 var1 = (class122) class74.field1769.method83(64); var1 != null; var1 = (class122) class74.field1769.method81(-93)) {
            if (~class112.field2593 == ~var1.field2888 && var1.field2880 >= class135.field3243) {
                if (~class135.field3243 <= ~var1.field2871) {
                    if (var1.field2865 > 0) {
                        class66 var2 = class9.field189[var1.field2865 + -1];
                        if (var2 != null && ~var2.field1260 <= -1 && var2.field1260 < 13312 && ~var2.field1190 <= -1 && var2.field1190 < 13312) {
                            var1.method954(class135.field3243, 1, class70.method575(var2.field1190, 1, var2.field1260, var1.field2888) + -var1.field2868, var2.field1260, var2.field1190);
                        }
                    }
                    if (~var1.field2865 > -1) {
                        int var3 = -var1.field2865 - 1;
                        class103 var4;
                        if (class22.field485 == var3) {
                            var4 = class69.field1640;
                        } else {
                            var4 = class44.field1067[var3];
                        }
                        if (var4 != null && ~var4.field1260 <= -1 && ~var4.field1260 > -13313 && ~var4.field1190 <= -1 && var4.field1190 < 13312) {
                            var1.method954(class135.field3243, 1, class70.method575(var4.field1190, 1, var4.field1260, var1.field2888) - var1.field2868, var4.field1260, var4.field1190);
                        }
                    }
                    var1.method952(class121.field2830, -127);
                    class103.field2332.method857(class112.field2593, (int) var1.field2887, (int) var1.field2884, (int) var1.field2861, 60, var1, var1.field2891, -1, false);
                }
            } else {
                var1.method13(82);
            }
        }
        if (arg0) {
            field2113 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZLed;I)I", line = 136)
    public static final int method712(boolean arg0, class33 arg1, int arg2) {
        ++field2097;
        if (arg1.field749 != null && ~arg2 > ~arg1.field749.length) {
            try {
                int[] var3 = arg1.field749[arg2];
                int var4 = 0;
                if (arg0) {
                    method712(true, (class33) null, -4);
                }
                byte var5 = 0;
                int var6 = 0;
                while (true) {
                    int var7 = 0;
                    int var8 = var3[var6++];
                    byte var9 = 0;
                    if (var8 == 0) {
                        return var4;
                    }
                    if (var8 == 15) {
                        var9 = 1;
                    }
                    if (~var8 == -17) {
                        var9 = 2;
                    }
                    if (~var8 == -2) {
                        var7 = field2109[var3[var6++]];
                    }
                    if (var8 == 17) {
                        var9 = 3;
                    }
                    if (var8 == 2) {
                        var7 = class32.field693[var3[var6++]];
                    }
                    if (var8 == 3) {
                        var7 = class129.field3021[var3[var6++]];
                    }
                    if (~var8 == -5) {
                        int var10 = var3[var6++] << 16;
                        int var11 = var10 + var3[var6++];
                        class33 var12 = class88.method685((byte) -120, var11);
                        int var13 = var3[var6++];
                        if (~var13 != 0 && (!class55.method440(var13, 21467).field3110 || class42.field1043)) {
                            for (int var14 = 0; var14 < var12.field778.length; ++var14) {
                                if (~(var13 - -1) == ~var12.field778[var14]) {
                                    var7 += var12.field738[var14];
                                }
                            }
                        }
                    }
                    if (~var8 == -6) {
                        var7 = class5.field109[var3[var6++]];
                    }
                    if (~var8 == -7) {
                        var7 = class32.field678[-1 + class32.field693[var3[var6++]]];
                    }
                    if (var8 == 7) {
                        var7 = 100 * class5.field109[var3[var6++]] / 46875;
                    }
                    if (~var8 == -9) {
                        var7 = class69.field1640.field2320;
                    }
                    if (var8 == 9) {
                        for (int var15 = 0; var15 < 25; ++var15) {
                            if (class137.field3257[var15]) {
                                var7 += class32.field693[var15];
                            }
                        }
                    }
                    if (~var8 == -11) {
                        int var16 = var3[var6++] << 16;
                        int var17 = var16 + var3[var6++];
                        class33 var18 = class88.method685((byte) -127, var17);
                        int var19 = var3[var6++];
                        if (~var19 != 0 && (!class55.method440(var19, 21467).field3110 || class42.field1043)) {
                            for (int var20 = 0; var20 < var18.field778.length; ++var20) {
                                if (~(var19 + 1) == ~var18.field778[var20]) {
                                    var7 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (~var8 == -12) {
                        var7 = class71.field1694;
                    }
                    if (var8 == 12) {
                        var7 = class1.field12;
                    }
                    if (~var8 == -14) {
                        int var21 = class5.field109[var3[var6++]];
                        int var22 = var3[var6++];
                        var7 = (var21 & 1 << var22) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var23 = var3[var6++];
                        var7 = class5.method56(var23, arg0);
                    }
                    if (~var8 == -19) {
                        var7 = (class69.field1640.field1260 >> 7) + class32.field685;
                    }
                    if (var8 == 19) {
                        var7 = (class69.field1640.field1190 >> 7) + class30.field640;
                    }
                    if (~var8 == -21) {
                        var7 = var3[var6++];
                    }
                    if (var9 != 0) {
                        var5 = var9;
                    } else {
                        if (~var5 == -1) {
                            var4 += var7;
                        }
                        if (~var5 == -2) {
                            var4 -= var7;
                        }
                        if (var5 == 2 && var7 != 0) {
                            var4 /= var7;
                        }
                        if (var5 == 3) {
                            var4 *= var7;
                        }
                        var5 = 0;
                    }
                }
            } catch (Exception var24) {
                return -1;
            }
        } else {
            return -2;
        }
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(II)V", line = 343)
    public final void method713(int arg0, int arg1) {
        if (arg0 == 503) {
            super.field3325[super.field3347++] = (byte) (this.field2089.method453(-26972) + arg1);
            ++field2099;
        }
    }

    @OriginalMember(owner = "client!oc", name = "w", descriptor = "(I)V", line = 354)
    public static final void method714(int arg0) {
        if (arg0 >= 109) {
            ++field2094;
            for (int var1 = -1; ~var1 > ~class81.field1948; ++var1) {
                int var2;
                if (~var1 == 0) {
                    var2 = 2047;
                } else {
                    var2 = class119.field2820[var1];
                }
                class103 var3 = class44.field1067[var2];
                if (var3 != null) {
                    class115.method919(1, var3, 48);
                }
            }
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(B[I)V", line = 387)
    public final void method715(byte arg0, int[] arg1) {
        ++field2102;
        int var3 = -110 / ((-58 - arg0) / 52);
        this.field2089 = new class58(arg1);
    }

    @OriginalMember(owner = "client!oc", name = "h", descriptor = "(B)V", line = 397)
    public final void method716(byte arg0) {
        super.field3347 = (this.field2103 - -7) / 8;
        if (arg0 > 24) {
            ++field2091;
        }
    }

    @OriginalMember(owner = "client!oc", name = "x", descriptor = "(I)Lcc;", line = 410)
    public static final class18 method717(int arg0) {
        ++field2087;
        if (arg0 >= -123) {
            field2117 = null;
        }
        try {
            return (class18) Class.forName("cb").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "y", descriptor = "(I)V", line = 428)
    public final void method718(int arg0) {
        this.field2103 = super.field3347 * 8;
        if (arg0 <= 2) {
            method714(117);
        }
        ++field2092;
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Ldf;ILdf;)V", line = 442)
    public static final void method719(class28 arg0, int arg1, class28 arg2) {
        ++field2111;
        class69.field1654.method939((byte) -53);
        if (~class30.field638 == -1 || class30.field638 == 5) {
            byte var3 = 20;
            arg2.method227(class14.field303, 180, -var3 + 74, 16777215);
            int var4 = -var3 + 82;
            class68.method561(28, var4, 304, 34, 9179409);
            class68.method561(29, var4 + 1, 302, 32, 0);
            class68.method569(30, var4 + 2, class71.field1687 * 3, 30, 9179409);
            class68.method569(class71.field1687 * 3 + 30, var4 + 2, -(class71.field1687 * 3) + 300, 30, 0);
            arg2.method227(class20.field401, 180, -var3 + 105, 16777215);
        }
        if (class30.field638 == 20) {
            class100.field2241.method20(0, 0);
            byte var5 = 40;
            arg2.method230(class20.field418, 180, var5, 16776960, true);
            int var19 = var5 + 15;
            arg2.method230(class20.field397, 180, var19, 16776960, true);
            int var20 = var19 + 15;
            arg2.method230(class20.field417, 180, var20, 16776960, true);
            int var21 = var20 + 15;
            int var22 = var21 + 10;
            arg2.method248(class63.method479(new class67[] { class109.field2479, class20.field415 }, 0), 90, var22, 16777215, true);
            int var23 = var22 + 15;
            arg2.method248(class63.method479(new class67[] { class80.field1877, class20.field419.method526((byte) -72) }, arg1 ^ -15420), 92, var23, 16777215, true);
            int var24 = var23 + 15;
        }
        if (class30.field638 == 10) {
            class100.field2241.method20(0, 0);
            if (~class103.field2311 != -1) {
                if (class103.field2311 != 2) {
                    if (class103.field2311 == 3) {
                        arg2.method230(class74.field1772, 180, 40, 16776960, true);
                        short var6 = 180;
                        byte var7 = 65;
                        arg2.method230(class12.field265, 180, var7, 16777215, true);
                        short var8 = 150;
                        int var25 = var7 + 15;
                        arg2.method230(class121.field2856, 180, var25, 16777215, true);
                        int var26 = var25 + 15;
                        arg2.method230(class116.field2750, 180, var26, 16777215, true);
                        int var27 = var26 + 15;
                        arg2.method230(class117.field2782, 180, var27, 16777215, true);
                        int var28 = var27 + 15;
                        class103.field2317.method20(var6 + -73, var8 + -20);
                        arg2.method230(class94.field2134, var6, var8 - -5, 16777215, true);
                    }
                } else {
                    byte var9 = 40;
                    byte var10 = 100;
                    short var11 = 150;
                    arg2.method230(class20.field418, 180, var9, 16776960, true);
                    int var29 = var9 + 15;
                    arg2.method230(class20.field397, 180, var29, 16776960, true);
                    int var30 = var29 + 15;
                    arg2.method230(class20.field417, 180, var30, 16776960, true);
                    int var31 = var30 + 15;
                    int var32 = var31 + 10;
                    arg2.method248(class63.method479(new class67[] { class109.field2479, class20.field415, class135.field3243 % 40 < 20 & ~class80.field1890 == -1 ? field2112 : class20.field395 }, 0), 90, var32, 16777215, true);
                    int var33 = var32 + 15;
                    arg2.method248(class63.method479(new class67[] { class80.field1877, class20.field419.method526((byte) -112), ~class80.field1890 == -2 & class135.field3243 % 40 < 20 ? field2112 : class20.field395 }, 0), 92, var33, 16777215, true);
                    int var34 = var33 + 15;
                    class103.field2317.method20(var10 + -73, var11 + -20);
                    arg2.method230(class73.field1722, var10, var11 + 5, 16777215, true);
                    short var12 = 260;
                    class103.field2317.method20(var12 + -73, var11 + -20);
                    arg2.method230(class94.field2134, var12, var11 + 5, 16777215, true);
                }
            } else {
                byte var13 = 100;
                byte var14 = 80;
                byte var15 = 120;
                arg2.method230(class97.field2209, 180, var14, 16776960, true);
                class103.field2317.method20(var13 + -73, var15 + -20);
                int var35 = var14 + 30;
                arg2.method238(client.field456, var13 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
                short var16 = 260;
                class103.field2317.method20(var16 - 73, var15 + -20);
                arg2.method238(class100.field2256, var16 - 73, var15 + -20, 144, 40, 16777215, true, 1, 1, 0);
            }
        }
        class126.method985((byte) 115);
        try {
            Graphics var17 = class129.field3020.getGraphics();
            class69.field1654.method162(-1, 202, var17, 171);
            class76.field1817.method162(arg1 + 15419, 0, var17, 0);
            class122.field2878.method162(arg1 + 15419, 637, var17, 0);
            if (class130.field3045) {
                class130.field3045 = false;
                class132.field3128.method162(-1, 128, var17, 0);
                class71.field1696.method162(arg1 + 15419, 202, var17, 371);
                class69.field1639.method162(arg1 ^ 15419, 0, var17, 265);
                class9.field193.method162(arg1 ^ 15419, 562, var17, 265);
                class108.field2437.method162(-1, 128, var17, 171);
                class55.field1343.method162(-1, 562, var17, 171);
            }
        } catch (Exception var18) {
            class129.field3020.repaint();
        }
        if (arg1 != -15420) {
            method717(17);
        }
    }

    @OriginalMember(owner = "client!oc", name = "z", descriptor = "(I)V", line = 582)
    public static void method720(int arg0) {
        field2112 = null;
        field2109 = null;
        field2108 = null;
        if (arg0 == 0) {
            field2107 = null;
            field2105 = null;
            field2110 = null;
            field2118 = null;
            field2113 = null;
            field2106 = null;
            field2116 = null;
            field2117 = null;
            field2114 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "i", descriptor = "(B)V", line = 605)
    public static final void method721(byte arg0) {
        if (class80.field1901 != null) {
            class80.field1901.method299();
            class80.field1901 = null;
        }
        class4.field55 = 0;
        ++field2101;
        if (arg0 != 51) {
            field2112 = null;
        }
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "(I)V", line = 623)
    public class91(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(ZIZ)I", line = 645)
    public static final int method722(boolean arg0, int arg1, boolean arg2) {
        if (arg1 <= 126) {
            field2118 = null;
        }
        int var3 = 0;
        ++field2093;
        if (arg0) {
            var3 += class93.field2132 + class55.field1333;
        }
        if (arg2) {
            var3 += class77.field1836 + class52.field1276;
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "A", descriptor = "(I)V", line = 665)
    public static final void method723(int arg0) {
        ++field2088;
        class81.method637(0, class59.field1387);
        if (~class11.field246 != 0) {
            class81.method637(0, class11.field246);
        }
        class121.field2830 = 0;
        if (arg0 >= 0) {
            class81.field1940.method939((byte) -53);
            class135.field3246 = class105.method799(class135.field3246);
            class68.method565();
            class99.method762(0, 503, 765, 0, 0, false, class59.field1387);
            if (~class11.field246 != 0) {
                class99.method762(0, 503, 765, 0, 0, false, class11.field246);
            }
            if (class90.field2066) {
                class115.method921(-1);
            } else {
                class85.method657(453);
                class70.method579(2);
            }
            try {
                Graphics var1 = class129.field3020.getGraphics();
                class81.field1940.method162(-1, 0, var1, 0);
            } catch (Exception var2) {
                class129.field3020.repaint();
            }
        }
    }
}
