import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ge")
public class class454 extends class389 {

    @OriginalMember(owner = "client!ge", name = "t", descriptor = "F")
    public static float field6660;

    @OriginalMember(owner = "client!ge", name = "v", descriptor = "I")
    public static int field6662;

    @OriginalMember(owner = "client!ge", name = "x", descriptor = "I")
    public static int field6664;

    @OriginalMember(owner = "client!ge", name = "y", descriptor = "I")
    public static int field6665;

    @OriginalMember(owner = "client!ge", name = "u", descriptor = "Lqc;")
    public static class257 field6661;

    @OriginalMember(owner = "client!ge", name = "w", descriptor = "Z")
    public static boolean field6663;

    @OriginalMember(owner = "client!ge", name = "d", descriptor = "(I)V", line = 3)
    public static void method2641(int arg0) {
        if (arg0 != 16622) {
            field6663 = true;
        }
        field6661 = null;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(IZ)V", line = 13)
    public static final void method2642(int arg0, boolean arg1) {
        field6662++;
        if (arg0 != -7810) {
            method2643(-126);
        }
        if (class159.field2395.length() == 0) {
            return;
        }
        class407.method2447(-36, "--> " + class159.field2395);
        class149.method1084(class159.field2395, 119, false, arg1);
        class516.field7573 = 0;
        class159.field2395 = "";
        class258.field3706 = 0;
    }

    @OriginalMember(owner = "client!ge", name = "e", descriptor = "(I)V", line = 39)
    public static final void method2643(int arg0) {
        if (arg0 != -1) {
            field6661 = null;
        }
        class403.field6087.method2293(false);
        field6664++;
    }

    @OriginalMember(owner = "client!ge", name = "a", descriptor = "(ILpf;Lsr;BLvi;III)V", line = 53)
    public static final void method2644(int arg0, class486 arg1, class351 arg2, byte arg3, class480 arg4, int arg5, int arg6, int arg7) {
        field6665++;
        if (arg3 != 38) {
            method2642(-95, false);
        }
        class203 var8 = new class203();
        var8.field2954 = arg7 << 7;
        var8.field2963 = arg6 << 7;
        var8.field2952 = arg5;
        if (arg1 != null) {
            var8.field2949 = arg1;
            int var9 = arg1.field7182;
            int var10 = arg1.field7235;
            if (arg0 == 1 || arg0 == 3) {
                var10 = arg1.field7182;
                var9 = arg1.field7235;
            }
            var8.field2953 = arg1.field7233;
            var8.field2958 = arg6 + var9 << 7;
            var8.field2962 = arg1.field7159 << 7;
            var8.field2957 = arg1.field7239;
            var8.field2967 = arg1.field7229;
            var8.field2961 = arg1.field7212;
            var8.field2948 = arg1.field7189;
            var8.field2947 = arg7 + var10 << 7;
            if (arg1.field7219 != null) {
                var8.field2964 = true;
                var8.method1333(-13076);
            }
            if (var8.field2957 != null) {
                var8.field2956 = var8.field2961 + (int) (Math.random() * (double) (var8.field2948 - var8.field2961));
            }
            class184.field2723.method2958(var8, (byte) 61);
        } else if (arg2 != null) {
            var8.field2950 = arg2;
            class277 var11 = arg2.field5409;
            if (var11.field4148 != null) {
                var8.field2964 = true;
                var11 = var11.method1734((byte) -105, class307.field4619);
            }
            if (var11 != null) {
                var8.field2958 = var11.field4128 + arg6 << 7;
                var8.field2947 = arg7 + var11.field4128 << 7;
                var8.field2967 = class275.method1716(true, arg2);
                var8.field2953 = var11.field4166;
                var8.field2962 = var11.field4156 << 7;
            }
            class150.field2286.method2958(var8, (byte) 66);
        } else if (arg4 != null) {
            var8.field2968 = arg4;
            var8.field2958 = arg6 + arg4.method2419((byte) 109) << 7;
            var8.field2947 = arg7 + arg4.method2419((byte) 101) << 7;
            var8.field2967 = class457.method2655(arg4, arg3 - 38);
            var8.field2953 = arg4.field7066;
            var8.field2962 = arg4.field7071 << 7;
            class22.field323.method3055(0, (long) arg4.field6015, var8);
        }
    }
}
