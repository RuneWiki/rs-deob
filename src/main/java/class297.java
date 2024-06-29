import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public abstract class class297 extends class86 {

    @OriginalMember(owner = "client!qd", name = "o", descriptor = "I")
    public static int field4326 = -1;

    @OriginalMember(owner = "client!qd", name = "q", descriptor = "I")
    public static int field4328 = -1;

    @OriginalMember(owner = "client!qd", name = "p", descriptor = "I")
    public static int field4327 = 0;

    @OriginalMember(owner = "client!qd", name = "s", descriptor = "[I")
    public static int[] field4330 = new int[] { 28, 35, 40, 44 };

    @OriginalMember(owner = "client!qd", name = "r", descriptor = "I")
    public static int field4329;

    @OriginalMember(owner = "client!qd", name = "t", descriptor = "I")
    public static int field4331;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "(B)I")
    public static final int method1802(byte arg0) {
        field4329++;
        if ((double) class249.field3576 == 3.0D) {
            return 37;
        }
        if (arg0 >= -39) {
            field4328 = -107;
        }
        if ((double) class249.field3576 == 4.0D) {
            return 50;
        } else if ((double) class249.field3576 == 6.0D) {
            return 75;
        } else if ((double) class249.field3576 == 8.0D) {
            return 100;
        } else {
            return 200;
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(ILqs;Leq;Lwd;)V")
    public static final void method1803(int arg0, class410 arg1, class134 arg2, class170 arg3) {
        field4331++;
        class307 var4 = arg3.method1073(-94, arg2);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method93();
        if (var5 < var4.method85()) {
            var5 = var4.method85();
        }
        byte var6 = 10;
        int var7 = arg1.field6011;
        int var8 = arg1.field6012;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg3.field2273 != null) {
            var9 = class407.field5974.method3046(null, arg0 ^ 0xFFFFEC08, arg3.field2273, class161.field2098, null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class161.field2098[var12];
                if ((var9 - 1) > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class411.field6035.method2772(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = var9 * class411.field6035.method2774() + class411.field6035.method2775() / 2;
        }
        int var15 = arg1.field6011 + (var5 / 2);
        if (class249.field3594 + var5 > var7) {
            var15 = var5 / 2 + class249.field3594 + (var10 / 2) + var6 + 5;
            var7 = class249.field3594;
        } else if (class249.field3589 - var5 < var7) {
            var7 = class249.field3589 - var5;
            var15 = class249.field3589 - (var5 / 2) - (var10 / 2 + var6) - 5;
        }
        int var16 = arg1.field6012;
        if ((class249.field3591 + var5) > var8) {
            var8 = class249.field3591;
            var16 = class249.field3591 + (var5 / 2) + var6;
        } else if (class249.field3598 - var5 < var8) {
            var8 = class249.field3598 - var5;
            var16 = class249.field3598 - var6 - (var5 / 2) - var11;
        }
        if (arg0 != 1) {
            return;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg1.field6011), (double) (var8 - arg1.field6012)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method1846((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg3.field2273 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = class411.field6035.method2774() * var9 + var16 + 3;
            var20 = var10 + var18 + 10;
            if (arg3.field2265 != 0) {
                arg2.method801(arg0 - 6626, -var18 + var20, var16, arg3.field2265, var18, var21 - var16);
            }
            if (arg3.field2279 != 0) {
                arg2.method806(arg3.field2279, var20 - var18, var16, var18, (byte) 45, var21 - var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class161.field2098[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class411.field6035.method2777(arg2, var23, var15, var16, arg3.field2237, true);
                var16 += class411.field6035.method2774();
            }
        }
        if (arg3.field2258 == -1 && arg3.field2273 == null) {
            return;
        }
        class45 var24 = new class45(arg1);
        int var25 = var5 >> 1;
        var24.field683 = var20;
        var24.field680 = var8 - var25;
        var24.field690 = var8 + var25;
        var24.field687 = var7 - var25;
        var24.field679 = var18;
        var24.field684 = var21;
        var24.field691 = var7 + var25;
        var24.field682 = var19;
        class56.field883.method2086((byte) -127, var24);
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(I)V")
    public static void method1804(int arg0) {
        if (arg0 == -22861) {
            field4330 = null;
        }
    }
}
