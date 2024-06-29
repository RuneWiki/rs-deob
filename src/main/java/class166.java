import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uh")
public class class166 {

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "I")
    public static int field1851 = -1;

    @OriginalMember(owner = "client!uh", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field1853 = new String[100];

    @OriginalMember(owner = "client!uh", name = "b", descriptor = "I")
    public static int field1852;

    @OriginalMember(owner = "client!uh", name = "d", descriptor = "I")
    public static int field1854;

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(Lm;IILha;Laia;I)Z")
    public static final boolean method1038(class191 arg0, int arg1, int arg2, class58 arg3, class228 arg4, int arg5) {
        field1852++;
        int var6 = Integer.MAX_VALUE;
        int var7 = Integer.MIN_VALUE;
        int var8 = Integer.MAX_VALUE;
        int var9 = Integer.MIN_VALUE;
        if (arg4.field2641 != null) {
            var8 = class656.field9385 - (class656.field9385 - class656.field9384) * (arg0.field2256 + arg4.field2615 - class656.field9375) / (class656.field9392 - class656.field9375);
            var7 = (arg0.field2251 + arg4.field2606 - class656.field9381) * (class656.field9389 - class656.field9387) / (class656.field9388 - class656.field9381) + class656.field9387;
            var6 = (arg4.field2608 + arg0.field2251 - class656.field9381) * (class656.field9389 - class656.field9387) / (class656.field9388 - class656.field9381) + class656.field9387;
            var9 = class656.field9385 - ((arg4.field2644 + arg0.field2256 - class656.field9375) * (class656.field9385 - class656.field9384) / (class656.field9392 - class656.field9375));
        }
        class131 var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        if (arg4.field2605 != -1) {
            if (arg0.field2255 && arg4.field2648 != -1) {
                var10 = arg4.method1313(arg3, true, true);
            } else {
                var10 = arg4.method1313(arg3, true, false);
            }
            if (var10 != null) {
                var11 = arg0.field2250 - (var10.method501() + 1 >> 1);
                var12 = arg0.field2250 + (var10.method501() + 1 >> 1);
                if (var6 > var11) {
                    var6 = var11;
                }
                if (var12 > var7) {
                    var7 = var12;
                }
                var13 = arg0.field2253 - (var10.method510() + 1 >> 1);
                var14 = arg0.field2253 + (var10.method510() + 1 >> 1);
                if (var13 < var8) {
                    var8 = var13;
                }
                if (var14 > var9) {
                    var9 = var14;
                }
            }
        }
        class536 var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        if (arg1 <= 85) {
            method1039(-16);
        }
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        if (arg4.field2646 != null) {
            var15 = class280.method1681(-20721, arg4.field2628);
            if (var15 != null) {
                var16 = class47.field511.method3142(class747.field10416, arg4.field2646, null, null, -126);
                var17 = (class656.field9389 - class656.field9387) * arg4.field2625 / (class656.field9388 - class656.field9381) + arg0.field2250;
                int var24 = arg0.field2253 - ((class656.field9385 - class656.field9384) * arg4.field2649 / (class656.field9392 - class656.field9375));
                if (var10 == null) {
                    var18 = var24 - var16 * var15.method3151() / 2;
                } else {
                    var18 = var24 - ((var10.method510() >> 1) + var16 * var15.method3147());
                }
                for (int var25 = 0; var25 < var16; var25++) {
                    String var26 = class747.field10416[var25];
                    if ((var16 - 1) > var25) {
                        var26 = var26.substring(0, var26.length() - 4);
                    }
                    int var27 = var15.method3149(var26);
                    if (var19 < var27) {
                        var19 = var27;
                    }
                }
                var20 = var17 - (var19 / 2 - arg5);
                var21 = var19 / 2 + arg5 + var17;
                if (var6 > var20) {
                    var6 = var20;
                }
                var22 = var18 + arg2;
                if (var21 > var7) {
                    var7 = var21;
                }
                var23 = arg2 + var16 * var15.method3147() + var18;
                if (var22 < var8) {
                    var8 = var22;
                }
                if (var23 > var9) {
                    var9 = var23;
                }
            }
        }
        if (class656.field9387 > var7 || var6 > class656.field9389 || class656.field9384 > var9 || class656.field9385 < var8) {
            return true;
        }
        class656.method3740(arg3, arg0, arg4);
        if (var10 != null) {
            if (class303.field3790 > 0 && (class22.field197 != -1 && class22.field197 == arg0.field2252 || class699.field9857 != -1 && class699.field9857 == arg4.field2640)) {
                int var28;
                if (class233.field2750 > 50) {
                    var28 = 200 - (class233.field2750 * 2);
                } else {
                    var28 = class233.field2750 * 2;
                }
                int var29 = var28 << 24 | 0xFFFF00;
                arg3.method317(-64, var29, var10.method503() / 2 + 7, arg0.field2250, arg0.field2253);
                arg3.method317(-92, var29, var10.method503() / 2 + 5, arg0.field2250, arg0.field2253);
                arg3.method317(-38, var29, var10.method503() / 2 + 3, arg0.field2250, arg0.field2253);
                arg3.method317(-89, var29, var10.method503() / 2 + 1, arg0.field2250, arg0.field2253);
                arg3.method317(-33, var29, var10.method503() / 2, arg0.field2250, arg0.field2253);
            }
            var10.method824(arg0.field2250 - (var10.method501() >> 1), arg0.field2253 - (var10.method510() >> 1));
        }
        if (arg4.field2646 != null && var15 != null) {
            class392.method2411(var16, 12243, var19, var15, arg0, arg3, arg4, var17, var18);
        }
        if (arg4.field2605 != -1 || arg4.field2646 != null) {
            class385 var30 = new class385(arg0);
            var30.field5358 = var12;
            var30.field5364 = var21;
            var30.field5363 = var11;
            var30.field5367 = var20;
            var30.field5356 = var23;
            var30.field5359 = var14;
            var30.field5357 = var22;
            var30.field5360 = var13;
            class685.field9680.method1721((byte) -93, var30);
        }
        return false;
    }

    @OriginalMember(owner = "client!uh", name = "a", descriptor = "(I)V")
    public static void method1039(int arg0) {
        if (arg0 != -26065) {
            method1038(null, -108, 45, null, null, 74);
        }
        field1853 = null;
    }

    @OriginalMember(owner = "client!uh", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field1854++;
        throw new IllegalStateException();
    }
}
