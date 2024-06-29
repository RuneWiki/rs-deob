import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class130 extends class134 {

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "Z")
    public static boolean field2149 = true;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "[J")
    public static long[] field2147 = new long[100];

    @OriginalMember(owner = "client!ta", name = "B", descriptor = "B")
    public static byte field2157;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field2146;

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "I")
    public int field2148;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field2151;

    @OriginalMember(owner = "client!ta", name = "x", descriptor = "I")
    public static int field2153;

    @OriginalMember(owner = "client!ta", name = "C", descriptor = "I")
    public int field2158;

    @OriginalMember(owner = "client!ta", name = "D", descriptor = "I")
    public static int field2159;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "Laj;")
    public static class151 field2150;

    @OriginalMember(owner = "client!ta", name = "y", descriptor = "Lbj;")
    public static class92 field2154;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "[I")
    public int[] field2145;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "[I")
    public int[] field2152;

    @OriginalMember(owner = "client!ta", name = "E", descriptor = "[I")
    public int[] field2160;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "[Lnd;")
    public class191[] field2144;

    @OriginalMember(owner = "client!ta", name = "z", descriptor = "[Lnd;")
    public class191[] field2155;

    @OriginalMember(owner = "client!ta", name = "A", descriptor = "[[[B")
    public byte[][][] field2156;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLaj;)V")
    public static final void method969(byte arg0, class151 arg1) {
        class274.field4581 = arg1;
        field2151++;
        if (arg0 != -14) {
            method971(-40, 45, (class206) null, (class195) null, -12);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Z)V")
    public static void method970(boolean arg0) {
        field2150 = null;
        field2147 = null;
        if (arg0) {
            field2154 = null;
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILnj;Lei;I)V")
    public static final void method971(int arg0, int arg1, class206 arg2, class195 arg3, int arg4) {
        field2153++;
        if (arg3.field3140 != null) {
            int[] var5 = new int[arg3.field3140.length];
            boolean var6 = false;
            for (int var7 = 0; var7 < (var5.length / 2); var7++) {
                int var9 = arg3.field3140[var7 * 2] + arg2.field3324;
                int var10 = arg2.field3313 - arg3.field3140[var7 * 2 + 1];
                int var11 = var5[var7 * 2] = (class148.field2460 - class148.field2450) * (var9 - class148.field2449) / (class148.field2451 - class148.field2449) + class148.field2450;
                int var12 = var5[var7 * 2 + 1] = (var10 - class148.field2459) * (class148.field2457 - class148.field2452) / (class148.field2453 - class148.field2459) + class148.field2452;
                if (var11 > class148.field2450 && var11 < class148.field2460 && var12 > class148.field2452 && var12 < class148.field2457) {
                    var6 = true;
                }
            }
            if (!var6) {
                return;
            }
            class235.method1688(var5, arg3.field3133, arg3.field3133 >>> 24);
            for (int var8 = 0; var8 < (var5.length / 2 - 1); var8++) {
                class211.method1478(var5[var8 * 2], var5[var8 * 2 + 1], var5[(var8 + 1) * 2], var5[var8 * 2 + 2 + 1], arg3.field3121, arg3.field3121 >>> 24);
            }
            class211.method1478(var5[var5.length - 2], var5[var5.length - 1], var5[0], var5[1], arg3.field3121, arg3.field3121 >>> 24);
        } else if (arg2.field3322) {
            return;
        }
        if (arg1 != -431) {
            return;
        }
        class254 var13 = new class254(arg2);
        class230 var14 = null;
        if (arg3.field3150 != -1) {
            if (arg2.field3320 && arg3.field3142 != -1) {
                var14 = (class230) arg3.method1388(true, true, false);
            } else {
                var14 = (class230) arg3.method1388(false, true, false);
            }
            if (var14 != null) {
                if (class118.field1984 > 0 && (class271.field4507 != -1 && class271.field4507 == arg2.field3327 || class84.field1401 != -1 && class84.field1401 == arg3.field3139)) {
                    int var15;
                    if (class146.field2401 <= 50) {
                        var15 = class146.field2401 * 3;
                    } else {
                        var15 = (100 - class146.field2401) * 3;
                    }
                    class211.method1482(arg2.field3315, arg2.field3318, var14.field4225 / 2 + 7, 16776960, var15);
                    class211.method1482(arg2.field3315, arg2.field3318, var14.field4225 / 2 + 5, 16776960, var15);
                    class211.method1482(arg2.field3315, arg2.field3318, var14.field4225 / 2 + 3, 16776960, var15);
                    class211.method1482(arg2.field3315, arg2.field3318, var14.field4225 / 2 + 1, 16776960, var15);
                    class211.method1482(arg2.field3315, arg2.field3318, var14.field4225 / 2, 16776960, var15);
                }
                var14.method1650(arg2.field3315 - (var14.field4225 >> 1), -(var14.field4235 >> 1) + arg2.field3318);
                var13.field4308 = arg2.field3315 + arg0 - (var14.field4225 >> 1);
                var13.field4307 = arg4 + arg2.field3318 - (var14.field4235 >> 1);
                var13.field4306 = (var14.field4235 >> 1) + arg2.field3318 + arg4;
                var13.field4313 = arg0 - (-arg2.field3315 - (var14.field4225 >> 1));
            }
        }
        if (arg3.field3125 != null) {
            if (var14 == null) {
                class150.method1116(arg4, var13, true, 0, arg0, arg3, (byte) -81, arg2);
            } else {
                class150.method1116(arg4, var13, false, (var14.field4235 >> 1) + 5, arg0, arg3, (byte) -81, arg2);
            }
        }
        if (var13.method1838((byte) -97, class87.field1448, class96.field1558) && arg3.field3134 != null) {
            if (arg3.field3134[4] != null) {
                class289.method2009(arg3.field3139, arg3.field3122, true, (long) arg2.field3327, 0, -1, arg3.field3134[4], (short) 1004);
            }
            if (arg3.field3134[3] != null) {
                class289.method2009(arg3.field3139, arg3.field3122, true, (long) arg2.field3327, 0, -1, arg3.field3134[3], (short) 1011);
            }
            if (arg3.field3134[2] != null) {
                class289.method2009(arg3.field3139, arg3.field3122, true, (long) arg2.field3327, 0, -1, arg3.field3134[2], (short) 1012);
            }
            if (arg3.field3134[1] != null) {
                class289.method2009(arg3.field3139, arg3.field3122, true, (long) arg2.field3327, 0, -1, arg3.field3134[1], (short) 1007);
            }
            if (arg3.field3134[0] != null) {
                class289.method2009(arg3.field3139, arg3.field3122, true, (long) arg2.field3327, 0, -1, arg3.field3134[0], (short) 1002);
            }
        }
        class294.field4831.method311(arg1 ^ 0xFFFFFE32, var13);
    }
}
