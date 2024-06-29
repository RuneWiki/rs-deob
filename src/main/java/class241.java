import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!na")
public class class241 {

    @OriginalMember(owner = "client!na", name = "h", descriptor = "I")
    public static int field3874 = 0;

    @OriginalMember(owner = "client!na", name = "i", descriptor = "Lck;")
    public static class119 field3875 = null;

    @OriginalMember(owner = "client!na", name = "e", descriptor = "B")
    public static byte field3871 = 0;

    @OriginalMember(owner = "client!na", name = "f", descriptor = "[I")
    public static int[] field3872 = new int[5];

    @OriginalMember(owner = "client!na", name = "b", descriptor = "I")
    public static int field3868;

    @OriginalMember(owner = "client!na", name = "c", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!na", name = "g", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!na", name = "j", descriptor = "I")
    public static int field3876;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "[I")
    public static int[] field3867;

    @OriginalMember(owner = "client!na", name = "d", descriptor = "[I")
    public static int[] field3870;

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IZII)I", line = 11)
    public static final int method1567(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method1567(-5, true, 123, 62);
        }
        int var4 = class284.field4687[class48.method365(arg0, arg3)];
        field3876++;
        if (arg2 > 0) {
            int var5 = class284.field4692.method124(arg2 & 0xFFFF, (byte) 75);
            if (var5 != 0) {
                int var6;
                if (arg3 < 0) {
                    var6 = 0;
                } else if (arg3 <= 127) {
                    var6 = arg3 * 131586;
                } else {
                    var6 = 16777215;
                }
                if (var5 == 256) {
                    var4 = var6;
                } else {
                    int var8 = 256 - var5;
                    var4 = ((var6 & 0xFF00FF) * var5 + ((var4 & 0xFF00FF) * var8) & 0xFF00FF00) + ((var4 & 0xFF00) * var8 + (var6 & 0xFF00) * var5 & 0xFF0000) >> 8;
                }
            }
            int var9 = class284.field4692.method128(arg2 & 0xFFFF, (byte) 73);
            if (var9 != 0) {
                var9 += 256;
                int var10 = (var4 & 0xFF) * var9;
                int var11 = (var4 >> 8 & 0xFF) * var9;
                if (var11 > 65535) {
                    var11 = 65535;
                }
                int var12 = (var4 >> 16 & 0xFF) * var9;
                if (var10 > 65535) {
                    var10 = 65535;
                }
                if (var12 > 65535) {
                    var12 = 65535;
                }
                var4 = (var11 & 0xFF00) + (((var12 & 0x8100FF00) << 8) + (var10 >> 8));
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(B)V", line = 86)
    public static final void method1568(byte arg0) {
        class252.field4057 = null;
        class166.field2619 = null;
        class217.field3498 = null;
        field3869++;
        if (arg0 < 111) {
            field3871 = 1;
        }
        class247.field4002 = null;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(IIIZII)Lmd;", line = 108)
    public static final class88 method1569(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        field3873++;
        long var6 = ((long) arg4 << 40) + ((long) arg2 << 38) + ((long) arg5 << 16) + (long) arg1 + (arg3 ? 137438953472L : 0L);
        class88 var8 = (class88) class285.field4708.method487(false, var6);
        if (var8 != null) {
            return var8;
        }
        int var9 = -20 % ((-arg0 - 36) / 33);
        class284.field4694 = false;
        class88 var10 = class1.method4(arg2, arg3, (byte) -101, arg5, false, arg1, arg4, false);
        if (var10 != null && !class284.field4694) {
            class285.field4708.method488(var10, (byte) 105, var6);
        }
        return var10;
    }

    @OriginalMember(owner = "client!na", name = "a", descriptor = "(I)V", line = 136)
    public static void method1570(int arg0) {
        int var1 = -99 / ((arg0 - 14) / 46);
        field3867 = null;
        field3870 = null;
        field3872 = null;
        field3875 = null;
    }
}
