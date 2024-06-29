import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kr")
public class class776 {

    @OriginalMember(owner = "client!kr", name = "d", descriptor = "I")
    public static int field10672 = 0;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "Ljb;")
    public static class519 field10669 = new class519(132, 12);

    @OriginalMember(owner = "client!kr", name = "b", descriptor = "I")
    public static int field10670;

    @OriginalMember(owner = "client!kr", name = "c", descriptor = "I")
    public static int field10671;

    @OriginalMember(owner = "client!kr", name = "e", descriptor = "I")
    public static int field10673;

    @OriginalMember(owner = "client!kr", name = "f", descriptor = "I")
    public static int field10674;

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IB)Lnba;")
    public static final class315 method4267(int arg0, byte arg1) {
        field10673++;
        class315 var2 = (class315) class751.field10147.method76(106, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class235.field3135.method1188(arg0, arg1 - 17963, 0);
        if (var3 == null || var3.length <= 1) {
            return null;
        } else if (arg1 == -84) {
            class315 var4;
            try {
                var4 = class668.method3687(21, var3);
            } catch (Exception var6) {
                throw new RuntimeException(var6.getMessage() + " S: " + arg0);
            }
            class751.field10147.method79(var4, (long) arg0, false);
            return var4;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(B)V")
    public static void method4268(byte arg0) {
        field10669 = null;
        int var1 = 32 / ((6 - arg0) / 57);
    }

    @OriginalMember(owner = "client!kr", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method4269(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field10670++;
        int var7 = arg4 + arg6;
        int var8 = arg2 + arg1;
        int var9 = arg0 + arg3;
        if (arg5 != 132) {
            return true;
        } else if (!class254.method1684(arg4, var8, var8, arg4, arg0, var7, var9, var8, false, var9)) {
            return false;
        } else if (class254.method1684(arg4, var8, var8, var7, arg0, var7, var9, var8, false, arg0)) {
            if (arg4 >= class194.field2524) {
                if (!class254.method1684(var7, arg2, var8, var7, var9, var7, var9, var8, false, arg0)) {
                    return false;
                }
                if (!class254.method1684(var7, arg2, var8, var7, var9, var7, arg0, arg2, false, arg0)) {
                    return false;
                }
            } else if (!class254.method1684(arg4, arg2, var8, arg4, var9, arg4, var9, var8, false, arg0)) {
                return false;
            } else if (!class254.method1684(arg4, arg2, var8, arg4, var9, arg4, arg0, arg2, false, arg0)) {
                return false;
            }
            if (class511.field7121 > arg0) {
                if (!class254.method1684(arg4, arg2, var8, arg4, arg0, var7, arg0, var8, false, arg0)) {
                    return false;
                }
                if (!class254.method1684(arg4, arg2, var8, var7, arg0, var7, arg0, arg2, false, arg0)) {
                    return false;
                }
            } else if (!class254.method1684(arg4, arg2, var8, arg4, var9, var7, var9, var8, false, var9)) {
                return false;
            } else if (!class254.method1684(arg4, arg2, var8, var7, var9, var7, var9, arg2, false, var9)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
