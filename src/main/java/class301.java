import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class301 {

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "Lvj;")
    public static class373 field3855 = new class373(63, 2);

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "I")
    public static int field3854;

    @OriginalMember(owner = "client!vh", name = "c", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(I)Z")
    public static final boolean method1664(int arg0) {
        field3856++;
        if (class136.method757(0, "jaclib")) {
            if (arg0 != 63) {
                method1664(-118);
            }
            return class136.method757(0, "hw3d");
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method1665(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -12) {
            field3855 = null;
        }
        class458[] var7 = class225.field2765;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class458 var9 = var7[var8];
            if (var9 != null && var9.field6309 == 2) {
                class274.method1558(var9.field6300, var9.field6297, (byte) -38, arg1, arg0, arg2 >> 1, var9.field6298, arg5 >> 1, var9.field6307 * 2);
                if (class34.field271[0] > -1 && (class335.field4358 % 20) < 10) {
                    class286.field3726[var9.field6308].method299(class34.field271[0] + arg3 - 12, arg6 + -28 - -class34.field271[1]);
                }
            }
        }
        field3854++;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Z)V")
    public static void method1666(boolean arg0) {
        if (!arg0) {
            field3855 = null;
        }
    }
}
