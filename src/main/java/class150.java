import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class150 {

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "[I")
    public static int[] field2477 = new int[14];

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "Lpf;")
    public static class17 field2478 = new class17(64);

    @OriginalMember(owner = "client!wa", name = "d", descriptor = "I")
    public static int field2480 = 0;

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "I")
    public static int field2479;

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(ILkk;ZIILei;BLnj;)V")
    public static final void method1116(int arg0, class254 arg1, boolean arg2, int arg3, int arg4, class195 arg5, byte arg6, class206 arg7) {
        class74 var8 = null;
        if (arg5.field3124 == 0) {
            if ((double) class148.field2442 == 3.0D) {
                var8 = class166.field2694;
            }
            if ((double) class148.field2442 == 4.0D) {
                var8 = class72.field1259;
            }
            if ((double) class148.field2442 == 6.0D) {
                var8 = class249.field4186;
            }
            if ((double) class148.field2442 >= 8.0D) {
                var8 = class307.field4972;
            }
        } else if (arg5.field3124 == 1) {
            if ((double) class148.field2442 == 3.0D) {
                var8 = class249.field4186;
            }
            if ((double) class148.field2442 == 4.0D) {
                var8 = class307.field4972;
            }
            if ((double) class148.field2442 == 6.0D) {
                var8 = class5.field130;
            }
            if ((double) class148.field2442 >= 8.0D) {
                var8 = class303.field4941;
            }
        } else if (arg5.field3124 == 2) {
            if ((double) class148.field2442 == 3.0D) {
                var8 = class5.field130;
            }
            if ((double) class148.field2442 == 4.0D) {
                var8 = class303.field4941;
            }
            if ((double) class148.field2442 == 6.0D) {
                var8 = class203.field3251;
            }
            if ((double) class148.field2442 >= 8.0D) {
                var8 = class302.field4921;
            }
        }
        if (arg6 != -81) {
            field2478 = null;
        }
        field2479++;
        if (var8 == null) {
            return;
        }
        int var9 = arg5.field3149;
        if (arg7.field3320 && arg5.field3123 != -1) {
            var9 = arg5.field3123;
        }
        int var10 = class25.field450.method1230(arg5.field3125, (int[]) null, class232.field3932);
        int var11 = arg7.field3318;
        int var12;
        if (arg2) {
            var12 = var11 - var8.method526() * var10 / 2;
        } else {
            var12 = var11 - (arg3 + ((var10 - 1) * var8.method522()) + var8.method526() / 2);
        }
        int var13 = var12 - var8.method526();
        int var14 = var12 + var8.method526() / 2;
        int var15 = 0;
        for (int var16 = 0; var16 < var10; var16++) {
            String var22 = class232.field3932[var16];
            if (var16 < (var10 - 1)) {
                var22 = var22.substring(0, var22.length() - 4);
            }
            int var23 = var8.method529(var22);
            if (var23 > var15) {
                var15 = var23;
            }
        }
        arg1.field4305 = var15 / 2 + arg4 + arg7.field3315;
        arg1.field4311 = arg0 + var13;
        arg1.field4312 = arg7.field3315 + arg4 - (var15 / 2);
        arg1.field4310 = var13 + (var8.method522() * var10 + arg0);
        int var17 = arg7.field3315 - (var15 / 2 + 5);
        int var18 = var13 + 2;
        if (arg5.field3143 != 0) {
            class211.method1480(var17, var18, var15 + 10, var10 * var8.method522() + (var13 - var18 - -1), arg5.field3143, arg5.field3143 >>> 24);
        }
        if (arg5.field3129 != 0) {
            class211.method1484(var17, var18, var15 + 10, -var18 + var10 * var8.method522() + var13 + 1, arg5.field3129, arg5.field3129 >>> 24);
        }
        for (int var19 = 0; var19 < var10; var19++) {
            String var20 = class232.field3932[var19];
            if ((var10 - 1) > var19) {
                var20 = var20.substring(0, var20.length() - 4);
            }
            int var21 = var8.method529(var20);
            var8.method523(var20, arg7.field3315, var14, var9, true);
            var14 += var8.method522();
            if (var21 > var15) {
                var15 = var21;
            }
        }
    }

    @OriginalMember(owner = "client!wa", name = "a", descriptor = "(I)V")
    public static void method1117(int arg0) {
        if (arg0 <= -57) {
            field2477 = null;
            field2478 = null;
        }
    }
}
