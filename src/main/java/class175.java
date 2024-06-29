import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class175 {

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "Z")
    public static boolean field2944 = false;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "Lqj;")
    public static class196 field2946 = class80.method502(" )2> <col=00ffff>", -48);

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public int field2939;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "I")
    public int field2940;

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "I")
    public static int field2941;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public int field2942;

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "I")
    public static int field2943;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public int field2945;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field2947;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "I")
    public int field2948;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field2949;

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public int field2950;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "I")
    public static int field2951;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field2952;

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "I")
    public int field2953;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "I")
    public int field2954;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public int field2955;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "I")
    public int field2956;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public int field2957;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public int field2958;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public int field2959;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public int field2960;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "I")
    public int field2961;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public int field2962;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public int field2963;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIZ)V")
    public static final void method1140(int arg0, int arg1, boolean arg2) {
        class243 var3 = class178.field3040[class27.field335][arg0][arg1];
        field2941++;
        if (var3 == null) {
            class34.method180(class27.field335, arg0, arg1);
            return;
        }
        int var4 = -99999999;
        class143 var5 = (class143) var3.method1651((byte) -43);
        class143 var6 = null;
        while (var5 != null) {
            class202 var13 = class178.method1154(false, var5.field2206.field1298);
            int var14 = var13.field3581;
            if (var13.field3637 == 1) {
                var14 = (var5.field2206.field1301 + 1) * var14;
            }
            if (var4 < var14) {
                var6 = var5;
                var4 = var14;
            }
            var5 = (class143) var3.method1656(-128);
        }
        if (var6 == null) {
            class34.method180(class27.field335, arg0, arg1);
            return;
        }
        var3.method1663((byte) 62, var6);
        if (!arg2) {
            return;
        }
        class143 var7 = (class143) var3.method1651((byte) -64);
        class88 var8 = null;
        class88 var9 = null;
        while (var7 != null) {
            class88 var12 = var7.field2206;
            if (var6.field2206.field1298 != var12.field1298) {
                if (var9 == null) {
                    var9 = var12;
                }
                if (var9.field1298 != var12.field1298 && var8 == null) {
                    var8 = var12;
                }
            }
            var7 = (class143) var3.method1656(-48);
        }
        long var10 = (long) ((arg1 << 7) + arg0 + 1610612736);
        class161.method1010(class27.field335, arg0, arg1, class74.method470(arg1 * 128 + 64, class27.field335, 103, arg0 * 128 + 64), var6.field2206, var10, var9, var8);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method1141(int arg0) {
        field2946 = null;
        if (arg0 != 2047) {
            method1140(71, 5, true);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLdj;)V")
    public static final void method1142(byte arg0, class137 arg1) {
        field2949++;
        if (arg1.field2062 == 0) {
            return;
        }
        if (arg1.field2075 != -1 && arg1.field2075 < 32768) {
            class164 var2 = class153.field2482[arg1.field2075];
            if (var2 != null) {
                int var3 = arg1.field2081 - var2.field2081;
                int var4 = arg1.field2085 - var2.field2085;
                if (var3 != 0 || var4 != 0) {
                    arg1.field2077 = (int) (Math.atan2((double) var3, (double) var4) * 325.949D) & 0x7FF;
                }
            }
        }
        if (arg1.field2075 >= 32768) {
            int var5 = arg1.field2075 - 32768;
            if (class31.field395 == var5) {
                var5 = 2047;
            }
            class134 var6 = class247.field4397[var5];
            if (var6 != null) {
                int var7 = arg1.field2081 - var6.field2081;
                int var8 = arg1.field2085 - var6.field2085;
                if (var7 != 0 || var8 != 0) {
                    arg1.field2077 = (int) (Math.atan2((double) var7, (double) var8) * 325.949D) & 0x7FF;
                }
            }
        }
        if ((arg1.field2111 != 0 || arg1.field2050 != 0) && (arg1.field2071 == 0 || arg1.field2076 > 0)) {
            int var9 = (arg1.field2049 - 1) * 64 + arg1.field2081 - (-class106.field1523 + -class106.field1523 + arg1.field2111) * 64;
            int var10 = (arg1.field2049 - 1) * 64 + arg1.field2085 - (arg1.field2050 - class178.field3011 - class178.field3011) * 64;
            if (var9 != 0 || var10 != 0) {
                arg1.field2077 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 0x7FF;
            }
            arg1.field2111 = 0;
            arg1.field2050 = 0;
        }
        if (arg0 < 70) {
            method1142((byte) 11, null);
        }
        int var11 = arg1.field2077 - arg1.field2096 & 0x7FF;
        if (var11 == 0) {
            arg1.field2103 = 0;
            return;
        }
        arg1.field2103++;
        if (var11 > 1024) {
            boolean var12 = true;
            arg1.field2096 -= arg1.field2062;
            if (var11 < arg1.field2062 || var11 > 2048 - arg1.field2062) {
                arg1.field2096 = arg1.field2077;
                var12 = false;
            }
            if (arg1.field2091 == arg1.field2063 && (arg1.field2103 > 25 || var12)) {
                if (arg1.field2108 == -1) {
                    arg1.field2063 = arg1.field2082;
                } else {
                    arg1.field2063 = arg1.field2108;
                }
            }
        } else {
            arg1.field2096 += arg1.field2062;
            boolean var13 = true;
            if (arg1.field2062 > var11 || 2048 - arg1.field2062 < var11) {
                arg1.field2096 = arg1.field2077;
                var13 = false;
            }
            if (arg1.field2091 == arg1.field2063 && (arg1.field2103 > 25 || var13)) {
                if (arg1.field2107 == -1) {
                    arg1.field2063 = arg1.field2082;
                } else {
                    arg1.field2063 = arg1.field2107;
                }
            }
        }
        arg1.field2096 &= 0x7FF;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lbk;I)V")
    public static final void method1143(class136 arg0, int arg1) {
        field2951++;
        class244.field4350 = arg0.method833((byte) -71, class256.field4506);
        if (arg1 != 0) {
            field2946 = null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    public static final void method1144(byte arg0) {
        field2947++;
        class132.field1891.method149(16);
        if (arg0 <= 24) {
            field2944 = false;
        }
        for (int var1 = 0; var1 < 32; var1++) {
            class160.field2579[var1] = 0L;
        }
        for (int var2 = 0; var2 < 32; var2++) {
            class240.field4267[var2] = 0L;
        }
        class21.field267 = 0;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(II)V")
    public static final void method1145(int arg0, int arg1) {
        class21.field251.method1535(arg1, 30704);
        class28.field348.method1535(arg1, 30704);
        if (arg0 > 101) {
            field2943++;
        }
    }
}
