import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pf")
public class class415 {

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "[I")
    public static int[] field6266 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pf", name = "b", descriptor = "I")
    public static int field6267;

    @OriginalMember(owner = "client!pf", name = "c", descriptor = "I")
    public static int field6268;

    @OriginalMember(owner = "client!pf", name = "e", descriptor = "I")
    public static int field6270;

    @OriginalMember(owner = "client!pf", name = "d", descriptor = "[Lo;")
    public static class24[] field6269;

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(I)V")
    public static void method2547(int arg0) {
        if (arg0 >= -79) {
            method2550(117, 94);
        }
        field6269 = null;
        field6266 = null;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method2548(byte arg0, String arg1) {
        field6270++;
        int var2 = arg1.length();
        int var3 = 0;
        if (arg0 != -108) {
            field6266 = null;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            var3 = arg1.charAt(var4) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method2549(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 4) {
            return;
        }
        field6267++;
        if (!class1.method16(arg6, arg2 ^ 0x575C55F4)) {
            return;
        }
        if (class329.field4994[arg6] == null) {
            client.method1360(class419.field6326[arg6], -1, arg4, arg7, arg9, arg3, arg1, arg5, arg8, arg0);
        } else {
            client.method1360(class329.field4994[arg6], -1, arg4, arg7, arg9, arg3, arg1, arg5, arg8, arg0);
        }
    }

    @OriginalMember(owner = "client!pf", name = "a", descriptor = "(II)Log;")
    public static final class462 method2550(int arg0, int arg1) {
        field6268++;
        if (arg1 > -76) {
            return null;
        }
        class462[] var2 = class51.method481((byte) -84);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class462 var4 = var2[var3];
            if (var4.field6866 == arg0) {
                return var4;
            }
        }
        return null;
    }
}
