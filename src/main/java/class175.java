import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class175 extends class5 {

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "Lil;")
    public static class68 field2268 = new class68(8);

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "F")
    public static float field2269;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field2267;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field2270;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field2271;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(II)[I")
    public final int[] method39(int arg0, int arg1) {
        field2267++;
        int var3 = 84 / ((81 - arg0) / 36);
        return class269.field3405;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(ZIIIIII)Z")
    public static final boolean method1100(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2270++;
        if (arg0) {
            return false;
        }
        int var7 = arg5 + arg6;
        int var8 = arg4 + arg2;
        int var9 = arg1 + arg3;
        if (!class430.method2271(var8, var8, var9, 26403, arg3, var9, var7, var8, arg5, arg5)) {
            return false;
        } else if (class430.method2271(var8, var8, var9, 26403, arg3, arg3, var7, var8, var7, arg5)) {
            if (class115.field1488 <= arg5) {
                if (!class430.method2271(var8, var8, var9, 26403, var9, arg3, var7, arg4, var7, var7)) {
                    return false;
                }
                if (!class430.method2271(var8, arg4, arg3, 26403, var9, arg3, var7, arg4, var7, var7)) {
                    return false;
                }
            } else if (!class430.method2271(var8, var8, var9, 26403, var9, arg3, arg5, arg4, arg5, arg5)) {
                return false;
            } else if (!class430.method2271(var8, arg4, arg3, 26403, var9, arg3, arg5, arg4, arg5, arg5)) {
                return false;
            }
            if (class11.field197 > arg3) {
                if (!class430.method2271(var8, var8, arg3, 26403, arg3, arg3, var7, arg4, arg5, arg5)) {
                    return false;
                }
                if (!class430.method2271(var8, arg4, arg3, 26403, arg3, arg3, var7, arg4, var7, arg5)) {
                    return false;
                }
            } else if (!class430.method2271(var8, var8, var9, 26403, var9, var9, var7, arg4, arg5, arg5)) {
                return false;
            } else if (!class430.method2271(var8, arg4, var9, 26403, var9, var9, var7, arg4, var7, arg5)) {
                return false;
            }
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V")
    public class175() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dd", name = "i", descriptor = "(I)V")
    public static final void method1101(int arg0) {
        class36.field497 = arg0;
        class271.field3430 = arg0;
        class145.field1878 = arg0;
        class188.field2361 = arg0;
        field2271++;
    }

    @OriginalMember(owner = "client!dd", name = "c", descriptor = "(B)V")
    public static void method1102(byte arg0) {
        field2268 = null;
        if (arg0 <= 18) {
            field2269 = 0.5022329F;
        }
    }
}
