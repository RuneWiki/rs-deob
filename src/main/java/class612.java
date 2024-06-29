import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lw")
public class class612 extends class311 {

    @OriginalMember(owner = "client!lw", name = "F", descriptor = "[I")
    public static int[] field8571 = new int[] { -1, -1, 1, 1 };

    @OriginalMember(owner = "client!lw", name = "E", descriptor = "I")
    public static int field8570;

    @OriginalMember(owner = "client!lw", name = "H", descriptor = "I")
    public static int field8572;

    @OriginalMember(owner = "client!lw", name = "I", descriptor = "I")
    public static int field8573;

    @OriginalMember(owner = "client!lw", name = "K", descriptor = "I")
    public static int field8575;

    @OriginalMember(owner = "client!lw", name = "L", descriptor = "I")
    public static int field8576;

    @OriginalMember(owner = "client!lw", name = "M", descriptor = "I")
    public static int field8577;

    @OriginalMember(owner = "client!lw", name = "J", descriptor = "[Lvh;")
    public static class327[] field8574;

    @OriginalMember(owner = "client!lw", name = "c", descriptor = "(B)V")
    public static void method3416(byte arg0) {
        field8574 = null;
        field8571 = null;
        if (arg0 > -4) {
            field8574 = null;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(III)I")
    public static final int method3417(int arg0, int arg1, int arg2) {
        ++field8572;
        if (arg1 == -1) {
            return 12345678;
        } else {
            int var3 = (127 & arg1) * arg0 >> 7;
            int var4 = -99 % ((arg2 - 64) / 41);
            if (~var3 > -3) {
                var3 = 2;
            } else if (~var3 < -127) {
                var3 = 126;
            }
            return (arg1 & 65408) + var3;
        }
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(BII)Z")
    public static final boolean method3418(byte arg0, int arg1, int arg2) {
        if (arg0 >= -124) {
            method3419(118, (class695) null);
        }
        ++field8576;
        return (~(arg1 & 8192) != -1 | class334.method2106(95, arg2, arg1) | class678.method3762(arg2, 89, arg1)) & class30.method345(arg2, arg1, (byte) -21);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(IIIII)V")
    public final void method1977(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field8570;
        if (arg2 != 64) {
            field8575 = -32;
        }
        int var6 = super.field4605.method931();
        int var7 = ((class125) super.field8179).field1875 * class372.method2246(-25) / 10 % var6;
        super.field4605.method3911(-var6 + arg3 + var7, arg0, arg1 + var6 - var7, arg4);
    }

    @OriginalMember(owner = "client!lw", name = "a", descriptor = "(ILmo;)Lcl;")
    public static final class240 method3419(int arg0, class695 arg1) {
        if (arg0 <= 41) {
            return null;
        } else {
            ++field8573;
            int var2 = arg1.method3880(8);
            return new class240(var2);
        }
    }

    @OriginalMember(owner = "client!lw", name = "<init>", descriptor = "(Lpu;Lpu;Lhc;)V")
    public class612(class522 arg0, class522 arg1, class125 arg2) {
        super(arg0, arg1, arg2);
    }
}
