import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jm")
public class class646 {

    @OriginalMember(owner = "client!jm", name = "c", descriptor = "Ltga;")
    public static class54 field8662 = new class54("WTRC", 1);

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "I")
    public static int field8660;

    @OriginalMember(owner = "client!jm", name = "b", descriptor = "I")
    public static int field8661;

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(IIIIIZ)V")
    public static final void method3542(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        field8660++;
        if (arg0 < 1) {
            arg0 = 1;
        }
        if (arg4 < 1) {
            arg4 = 1;
        }
        int var6 = arg4 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        if (arg1 < 124) {
            field8661 = 72;
        }
        int var7 = (class373.field5047 - class526.field7008) * var6 / 100 + class526.field7008;
        if (var7 < class471.field6299) {
            var7 = class471.field6299;
        } else if (class326.field4509 < var7) {
            var7 = class326.field4509;
        }
        int var8 = arg4 * var7 * 512 / (arg0 * 334);
        if (class510.field6809 > var8) {
            short var12 = class510.field6809;
            var7 = arg0 * var12 * 334 / (arg4 * 512);
            if (class326.field4509 < var7) {
                var7 = class326.field4509;
                int var13 = var7 * 512 * arg4 / (var12 * 334);
                int var14 = (arg0 - var13) / 2;
                if (arg5) {
                    class10.field197.method435();
                    class10.field197.method3567(var14, arg3, arg4, arg2, -16777216, (byte) 103);
                    class10.field197.method3567(var14, arg0 + arg3 - var14, arg4, arg2, -16777216, (byte) 118);
                }
                arg0 -= var14 * 2;
                arg3 += var14;
            }
        } else if (var8 > class256.field3550) {
            short var9 = class256.field3550;
            var7 = var9 * 334 * arg0 / (arg4 * 512);
            if (var7 < class471.field6299) {
                var7 = class471.field6299;
                int var10 = arg0 * var9 * 334 / (var7 * 512);
                int var11 = (arg4 - var10) / 2;
                if (arg5) {
                    class10.field197.method435();
                    class10.field197.method3567(arg0, arg3, var11, arg2, -16777216, (byte) 125);
                    class10.field197.method3567(arg0, arg3, var11, arg2 + arg4 - var11, -16777216, (byte) 124);
                }
                arg4 -= var11 * 2;
                arg2 += var11;
            }
        }
        class178.field2732 = arg2;
        class355.field4830 = arg4 * var7 / 334;
        class688.field9670 = arg3;
        class39.field581 = (short) arg0;
        class672.field9516 = (short) arg4;
    }

    @OriginalMember(owner = "client!jm", name = "a", descriptor = "(I)V")
    public static void method3543(int arg0) {
        field8662 = null;
        if (arg0 != -11251) {
            method3542(51, 78, 80, -60, -120, false);
        }
    }
}
