import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class496 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "Lki;")
    public static class498 field7331 = new class498(48, 11);

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field7332;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(III)Z", line = 11)
    public static final boolean method2974(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            method2974(-64, 107, 66);
        }
        field7332++;
        return (arg1 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLea;IIIILvg;Lf;)V", line = 22)
    public static final void method2975(byte arg0, class381 arg1, int arg2, int arg3, int arg4, int arg5, class38 arg6, class529 arg7) {
        field7329++;
        if (arg7 == null) {
            return;
        }
        int var8;
        if (class140.field2103 == 4) {
            var8 = (int) class382.field5792 & 0x3FFF;
        } else {
            var8 = (int) class382.field5792 + class289.field4132 & 0x3FFF;
        }
        if (arg0 != -26) {
            method2976(false, 76, 48L, null, 62, true, null, 36, 118, -53, 63);
        }
        int var9 = Math.max(arg6.field553 / 2, arg6.field472 / 2) + 10;
        int var10 = arg2 * arg2 + arg4 * arg4;
        if (var10 > (var9 * var9)) {
            return;
        }
        int var11 = class457.field6760[var8];
        int var12 = class457.field6759[var8];
        if (class140.field2103 != 4) {
            var12 = var12 * 256 / (class410.field6171 + 256);
            var11 = var11 * 256 / (class410.field6171 + 256);
        }
        int var13 = arg2 * var12 + arg4 * var11 >> 15;
        int var14 = arg4 * var12 - arg2 * var11 >> 15;
        arg7.method98(arg5 + (arg6.field553 / 2) + var13 - arg7.method105() / 2, arg3 - -(arg6.field472 / 2) + -var14 + -(arg7.method100() / 2), arg1, arg5, arg3);
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(ZIJLjava/lang/String;IZLjava/lang/String;IIII)V", line = 69)
    public static final void method2976(boolean arg0, int arg1, long arg2, String arg3, int arg4, boolean arg5, String arg6, int arg7, int arg8, int arg9, int arg10) {
        if (arg8 > -110) {
            return;
        }
        field7330++;
        if (!class207.field2963 && class450.field6706 < 500) {
            int var12 = arg4 == -1 ? class195.field2839 : arg4;
            class118 var13 = new class118(arg6, arg3, var12, arg10, arg7, arg2, arg1, arg9, arg5, arg0);
            class312.field4467.method809(var13, false);
            class450.field6706++;
        }
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(Z)V", line = 88)
    public static void method2977(boolean arg0) {
        field7331 = null;
        if (arg0) {
            method2977(false);
        }
    }
}
