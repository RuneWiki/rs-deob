import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class156 {

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public static int field2972 = 2301979;

    @OriginalMember(owner = "client!oh", name = "l", descriptor = "Lvd;")
    private static class222 field2976 = class212.method1357("Connection timed out)3", 10731);

    @OriginalMember(owner = "client!oh", name = "n", descriptor = "[J")
    public static long[] field2978 = new long[500];

    @OriginalMember(owner = "client!oh", name = "s", descriptor = "Lvd;")
    public static class222 field2983 = field2976;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public int field2965;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field2966;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "I")
    public int field2969;

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "I")
    public int field2970;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "I")
    public int field2971;

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!oh", name = "j", descriptor = "I")
    public int field2974;

    @OriginalMember(owner = "client!oh", name = "k", descriptor = "I")
    public static int field2975;

    @OriginalMember(owner = "client!oh", name = "m", descriptor = "I")
    public int field2977;

    @OriginalMember(owner = "client!oh", name = "o", descriptor = "I")
    public int field2979;

    @OriginalMember(owner = "client!oh", name = "p", descriptor = "I")
    public int field2980;

    @OriginalMember(owner = "client!oh", name = "r", descriptor = "I")
    public int field2982;

    @OriginalMember(owner = "client!oh", name = "t", descriptor = "I")
    public int field2984;

    @OriginalMember(owner = "client!oh", name = "u", descriptor = "I")
    public int field2985;

    @OriginalMember(owner = "client!oh", name = "v", descriptor = "I")
    public int field2986;

    @OriginalMember(owner = "client!oh", name = "w", descriptor = "I")
    public static int field2987;

    @OriginalMember(owner = "client!oh", name = "x", descriptor = "I")
    public int field2988;

    @OriginalMember(owner = "client!oh", name = "y", descriptor = "I")
    public int field2989;

    @OriginalMember(owner = "client!oh", name = "z", descriptor = "I")
    public int field2990;

    @OriginalMember(owner = "client!oh", name = "q", descriptor = "[[I")
    public static int[][] field2981;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method996(int arg0) {
        field2978 = null;
        field2976 = null;
        field2981 = null;
        field2983 = null;
        if (arg0 != -31821) {
            method997(-78, false, null);
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IZLba;)I")
    public static final int method997(int arg0, boolean arg1, class13 arg2) {
        field2987++;
        if (arg2.field336 == null || arg2.field336.length <= arg0) {
            return -2;
        }
        try {
            int[] var3 = arg2.field336[arg0];
            byte var4 = 0;
            int var5 = 0;
            if (arg1) {
                method998(-81, null);
            }
            int var6 = 0;
            while (true) {
                int var7 = 0;
                int var8 = var3[var6++];
                byte var9 = 0;
                if (var8 == 0) {
                    return var5;
                }
                if (var8 == 15) {
                    var9 = 1;
                }
                if (var8 == 1) {
                    var7 = class42.field899[var3[var6++]];
                }
                if (var8 == 16) {
                    var9 = 2;
                }
                if (var8 == 17) {
                    var9 = 3;
                }
                if (var8 == 2) {
                    var7 = class24.field555[var3[var6++]];
                }
                if (var8 == 3) {
                    var7 = class106.field1964[var3[var6++]];
                }
                if (var8 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class13 var12 = class10.method92(923, var11);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class112.method728(var13, (byte) -117).field3788 || class206.field3835)) {
                        for (int var14 = 0; var14 < var12.field289.length; var14++) {
                            if (var13 + 1 == var12.field289[var14]) {
                                var7 += var12.field226[var14];
                            }
                        }
                    }
                }
                if (var8 == 5) {
                    var7 = class93.field1751[var3[var6++]];
                }
                if (var8 == 6) {
                    var7 = class82.field1579[class24.field555[var3[var6++]] - 1];
                }
                if (var8 == 7) {
                    var7 = class93.field1751[var3[var6++]] * 100 / 46875;
                }
                if (var8 == 8) {
                    var7 = class17.field432.field835;
                }
                if (var8 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class104.field1933[var15]) {
                            var7 += class24.field555[var15];
                        }
                    }
                }
                if (var8 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class13 var18 = class10.method92(923, var17);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class112.method728(var19, (byte) 107).field3788 || class206.field3835)) {
                        for (int var20 = 0; var20 < var18.field289.length; var20++) {
                            if (var19 + 1 == var18.field289[var20]) {
                                var7 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var8 == 11) {
                    var7 = class140.field2700;
                }
                if (var8 == 12) {
                    var7 = class47.field962;
                }
                if (var8 == 13) {
                    int var21 = class93.field1751[var3[var6++]];
                    int var22 = var3[var6++];
                    var7 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var8 == 14) {
                    int var23 = var3[var6++];
                    var7 = class92.method587(var23, -15134);
                }
                if (var8 == 18) {
                    var7 = (class17.field432.field1353 >> 7) + class110.field2064;
                }
                if (var8 == 19) {
                    var7 = (class17.field432.field1360 >> 7) + class151.field2931;
                }
                if (var8 == 20) {
                    var7 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var4 == 0) {
                        var5 += var7;
                    }
                    if (var4 == 1) {
                        var5 -= var7;
                    }
                    if (var4 == 2 && var7 != 0) {
                        var5 /= var7;
                    }
                    if (var4 == 3) {
                        var5 *= var7;
                    }
                    var4 = 0;
                } else {
                    var4 = var9;
                }
            }
        } catch (Exception var24) {
            return -1;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(ILvd;)V")
    public static final void method998(int arg0, class222 arg1) {
        field2973++;
        if (class191.field3509.field730 == null) {
            return;
        }
        try {
            class222 var2 = class111.field2097.method1414(29649, class191.field3509.field730);
            class222 var3 = class22.field510.method1414(29649, class191.field3509.field730);
            class222 var4 = class234.method1531(new class222[] { var2, class118.field2232, arg1, class26.field594, var3 }, -10949);
            class222 var5;
            if (arg1.method1444(-54) == 0) {
                var5 = class234.method1531(new class222[] { var4, class107.field1978 }, -10949);
            } else {
                var5 = class234.method1531(new class222[] { var4, class22.field532, class225.method1472((byte) 82, class135.method849(true) + 94608000000L), class56.field1064, class228.method1503(94608000L, false) }, -10949);
            }
            class234.method1531(new class222[] { class97.field1810, var5, class54.field1015 }, -10949).method1455(0, class191.field3509.field730);
        } catch (Throwable var6) {
        }
        if (arg0 <= 95) {
            field2972 = -70;
        }
    }
}
