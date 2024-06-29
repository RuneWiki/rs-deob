import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lo")
public class class528 {

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "I")
    public static int field7807;

    @OriginalMember(owner = "client!lo", name = "b", descriptor = "I")
    public static int field7808;

    @OriginalMember(owner = "client!lo", name = "a", descriptor = "(ZIBIII)V", line = 3)
    public static final void method3108(boolean arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg1 < 1) {
            arg1 = 1;
        }
        if (arg5 < 1) {
            arg5 = 1;
        }
        field7807++;
        int var6 = arg1 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class204.field2827 - class209.field2869) * var6 / 100 + class209.field2869;
        if (var7 < class522.field7723) {
            var7 = class522.field7723;
        } else if (var7 > class261.field3448) {
            var7 = class261.field3448;
        }
        int var8 = var7 * 512 * arg1 / (arg5 * 334);
        if (var8 < class214.field2894) {
            short var12 = class214.field2894;
            var7 = arg5 * var12 * 334 / (arg1 * 512);
            if (var7 > class261.field3448) {
                var7 = class261.field3448;
                int var13 = arg1 * 512 * var7 / (var12 * 334);
                int var14 = (arg5 - var13) / 2;
                if (arg0) {
                    class370.field4984.method539();
                    class370.field4984.method1093(arg1, arg4, arg3, arg2 + 59, var14, -16777216);
                    class370.field4984.method1093(arg1, arg4 + arg5 - var14, arg3, arg2 + 59, var14, -16777216);
                }
                arg5 -= var14 * 2;
                arg4 += var14;
            }
        } else if (class217.field2937 < var8) {
            short var9 = class217.field2937;
            var7 = var9 * 334 * arg5 / (arg1 * 512);
            if (class522.field7723 > var7) {
                var7 = class522.field7723;
                int var10 = arg5 * var9 * 334 / (var7 * 512);
                int var11 = (arg1 - var10) / 2;
                if (arg0) {
                    class370.field4984.method539();
                    class370.field4984.method1093(var11, arg4, arg3, 3, arg5, -16777216);
                    class370.field4984.method1093(var11, arg4, arg3 + arg1 - var11, arg2 ^ 0xFFFFFFCB, arg5, -16777216);
                }
                arg1 -= var11 * 2;
                arg3 += var11;
            }
        }
        class381.field5208 = arg3;
        class484.field6733 = (short) arg1;
        class258.field3418 = (short) arg5;
        class427.field5834 = arg1 * var7 / 334;
        class438.field6010 = arg4;
        if (arg2 != -56) {
            method3108(true, 96, (byte) 55, -21, -61, -66);
        }
    }
}
