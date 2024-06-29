import java.awt.Point;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fr")
public class class681 {

    @OriginalMember(owner = "client!fr", name = "d", descriptor = "Luw;")
    public static class208 field8794 = new class208(87, -2);

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "I")
    public static int field8792;

    @OriginalMember(owner = "client!fr", name = "c", descriptor = "I")
    public static int field8793;

    @OriginalMember(owner = "client!fr", name = "f", descriptor = "I")
    public static int field8796;

    @OriginalMember(owner = "client!fr", name = "e", descriptor = "Lwm;")
    public static class30 field8795;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "[Z")
    public static boolean[] field8791;

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(II)I")
    public static final int method3659(int arg0, int arg1) {
        field8793++;
        int var2 = arg1 >>> 1;
        if (arg0 >= -74) {
            method3662(-112, -32, 41, 104, 72, 11, 75);
        }
        int var3 = var2 | var2 >>> 1;
        int var4 = var3 | var3 >>> 2;
        int var5 = var4 | var4 >>> 4;
        int var6 = var5 | var5 >>> 8;
        int var7 = var6 | var6 >>> 16;
        return ~var7 & arg1;
    }

    @OriginalMember(owner = "client!fr", name = "b", descriptor = "(II)V")
    public static final void method3660(int arg0, int arg1) {
        if (~class485.field6252.field6948.method648(false) == arg1) {
            arg0 = -1;
        }
        field8796++;
        if (class96.field1305 == arg0) {
            return;
        }
        if (arg0 != -1) {
            class483 var2 = class542.field6810.method2195(arg0, 33);
            class388 var3 = var2.method2715(-75);
            if (var3 == null) {
                arg0 = -1;
            } else {
                class740.field10014.method4238((byte) 119, class678.field8763, var3.method2233(), var3.method2230(), var3.method2228(), new Point(var2.field6227, var2.field6228));
                class96.field1305 = arg0;
            }
        }
        if (arg0 == -1 && class96.field1305 != -1) {
            class740.field10014.method4238((byte) 88, class678.field8763, null, -1, -1, new Point());
            class96.field1305 = -1;
        }
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(Z)V")
    public static void method3661(boolean arg0) {
        if (arg0) {
            method3661(false);
        }
        field8794 = null;
        field8791 = null;
        field8795 = null;
    }

    @OriginalMember(owner = "client!fr", name = "a", descriptor = "(IIIIIII)V")
    public static final void method3662(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg1 <= 77) {
            return;
        }
        field8792++;
        if ((arg2 - arg6) >= class498.field6390 && arg2 + arg6 <= class30.field274 && arg0 - arg6 >= class80.field1131 && (arg0 + arg6) <= class405.field5375) {
            class536.method2929(-24464, arg0, arg5, arg4, arg6, arg2, arg3);
        } else {
            class66.method386((byte) -125, arg6, arg3, arg0, arg5, arg2, arg4);
        }
    }
}
