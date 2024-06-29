import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eu")
public class class450 {

    @OriginalMember(owner = "client!eu", name = "b", descriptor = "Lst;")
    public static class335 field6243 = new class335(61, -1);

    @OriginalMember(owner = "client!eu", name = "f", descriptor = "I")
    public static int field6247 = 52;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!eu", name = "c", descriptor = "I")
    public static int field6244;

    @OriginalMember(owner = "client!eu", name = "d", descriptor = "I")
    public static int field6245;

    @OriginalMember(owner = "client!eu", name = "e", descriptor = "I")
    public static int field6246;

    @OriginalMember(owner = "client!eu", name = "g", descriptor = "I")
    public static int field6248;

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(IIIIIII)Z", line = 6)
    public static final boolean method2756(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field6245++;
        int var7 = arg1 + arg6;
        int var8 = arg2 + arg5;
        int var9 = arg3 + arg4;
        if (!class220.method1302(var8, var7, var9, arg6, -124, var8, arg3, arg6, var8, var9)) {
            return false;
        }
        if (arg0 != 1820) {
            method2758((byte) -54, null, null);
        }
        if (!class220.method1302(var8, var7, var9, arg6, 80, var8, arg3, var7, var8, arg3)) {
            return false;
        }
        if (class49.field730 > arg6) {
            if (!class220.method1302(var8, arg6, var9, arg6, arg0 - 1942, arg5, var9, arg6, var8, arg3)) {
                return false;
            }
            if (!class220.method1302(var8, arg6, arg3, arg6, arg0 - 1936, arg5, var9, arg6, arg5, arg3)) {
                return false;
            }
        } else if (!class220.method1302(var8, var7, var9, var7, -119, arg5, var9, var7, var8, arg3)) {
            return false;
        } else if (!class220.method1302(var8, var7, arg3, var7, -113, arg5, var9, var7, arg5, arg3)) {
            return false;
        }
        if (arg3 >= class76.field1113) {
            if (!class220.method1302(var8, var7, var9, arg6, -109, arg5, var9, arg6, var8, var9)) {
                return false;
            }
            if (!class220.method1302(var8, var7, var9, arg6, 36, arg5, var9, var7, arg5, var9)) {
                return false;
            }
        } else if (!class220.method1302(var8, var7, arg3, arg6, 126, arg5, arg3, arg6, var8, arg3)) {
            return false;
        } else if (!class220.method1302(var8, var7, arg3, arg6, -112, arg5, arg3, var7, arg5, arg3)) {
            return false;
        }
        return true;
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(I)V", line = 72)
    public static void method2757(int arg0) {
        field6243 = null;
        if (arg0 != -1) {
            method2756(-60, -114, -117, -45, 54, 89, -104);
        }
    }

    @OriginalMember(owner = "client!eu", name = "a", descriptor = "(B[S[Ljava/lang/String;)V", line = 85)
    public static final void method2758(byte arg0, short[] arg1, String[] arg2) {
        field6244++;
        class572.method3355(0, arg2, -29023, arg1, arg2.length - 1);
        if (arg0 != -98) {
            method2757(103);
        }
    }
}
