import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class372 {

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "I")
    public static int field5237;

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "I")
    public static int field5238;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "I")
    public static int field5239;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(II)Lpd;")
    public static final class646 method2217(int arg0, int arg1) {
        field5239++;
        class646[] var2 = class583.method3421(false);
        for (int var3 = arg0; var3 < var2.length; var3++) {
            class646 var4 = var2[var3];
            if (var4.field9180 == arg1) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(II)V")
    public static final void method2218(int arg0, int arg1) {
        field5238++;
        class371 var2 = class490.method2867((byte) -120, arg1, (long) arg0);
        var2.method2215(arg1 + 3);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIII)Z")
    public static final boolean method2219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5237++;
        if (arg0 != 0) {
            return false;
        }
        int var7 = arg6 + arg4;
        int var8 = arg1 + arg3;
        int var9 = arg2 + arg5;
        if (!class486.method2855(var9, var8, arg6, var8, arg6, var9, arg5, false, var8, var7)) {
            return false;
        } else if (class486.method2855(arg5, var8, var7, var8, arg6, var9, arg5, false, var8, var7)) {
            if (arg6 >= class556.field7718) {
                if (!class486.method2855(arg5, arg1, var7, var8, var7, var9, var9, false, var8, var7)) {
                    return false;
                }
                if (!class486.method2855(arg5, arg1, var7, var8, var7, arg5, var9, false, arg1, var7)) {
                    return false;
                }
            } else if (!class486.method2855(arg5, arg1, arg6, var8, arg6, var9, var9, false, var8, arg6)) {
                return false;
            } else if (!class486.method2855(arg5, arg1, arg6, var8, arg6, arg5, var9, false, arg1, arg6)) {
                return false;
            }
            if (class355.field5021 <= arg5) {
                if (!class486.method2855(var9, arg1, arg6, var8, arg6, var9, var9, false, var8, var7)) {
                    return false;
                }
                if (!class486.method2855(var9, arg1, var7, var8, arg6, var9, var9, false, arg1, var7)) {
                    return false;
                }
            } else if (!class486.method2855(arg5, arg1, arg6, var8, arg6, arg5, arg5, false, var8, var7)) {
                return false;
            } else if (!class486.method2855(arg5, arg1, var7, var8, arg6, arg5, arg5, false, arg1, var7)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }
}
