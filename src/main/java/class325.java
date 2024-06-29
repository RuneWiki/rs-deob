import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class325 {

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!cn", name = "b", descriptor = "I")
    public static int field4005;

    @OriginalMember(owner = "client!cn", name = "d", descriptor = "I")
    public static int field4007;

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "Lwm;")
    public static class30 field4006;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(III)Z", line = 3)
    public static final boolean method1880(int arg0, int arg1, int arg2) {
        field4007++;
        if (arg2 != -2) {
            field4006 = null;
        }
        return (arg0 & 0x100100) != 0;
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(B)V", line = 14)
    public static void method1881(byte arg0) {
        field4006 = null;
        int var1 = 46 % ((arg0 - 16) / 59);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IILmea;IIB)V", line = 33)
    public static final void method1882(int arg0, int arg1, class702 arg2, int arg3, int arg4, byte arg5) {
        field4005++;
        if (arg3 >= 1 && arg4 >= 1 && (class240.field3280 - 2) >= arg3 && class276.field3602 - 2 >= arg4) {
            if (class28.field252 == null) {
                return;
            }
            class274 var6 = class731.field9578.method4073(-109, arg0, arg3, arg1, arg4);
            if (var6 != null) {
                if ((var6 instanceof class396)) {
                    ((class396) var6).method2294(arg2, 1);
                } else if ((var6 instanceof class158)) {
                    ((class158) var6).method1009(-1993, arg2);
                } else if ((var6 instanceof class219)) {
                    ((class219) var6).method1435(arg2, (byte) 6);
                } else if (var6 instanceof class572) {
                    ((class572) var6).method3085(arg2, (byte) -45);
                }
            }
        }
        if (arg5 >= -38) {
            field4006 = null;
        }
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IFIFIFFILfc;IF)[B", line = 75)
    public static final byte[] method1883(int arg0, float arg1, int arg2, float arg3, int arg4, float arg5, float arg6, int arg7, class762 arg8, int arg9, float arg10) {
        if (arg2 != -18369) {
            method1882(101, -80, null, -123, 14, (byte) -128);
        }
        field4004++;
        byte[] var11 = new byte[arg0 * arg9 * arg7];
        class415.method2397(var11, arg9, arg5, arg8, arg6, arg10, arg4, 0, false, arg7, arg0, arg3, arg1);
        return var11;
    }
}
