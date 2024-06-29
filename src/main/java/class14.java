import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oh")
public class class14 {

    @OriginalMember(owner = "client!oh", name = "f", descriptor = "[Z")
    public static boolean[] field215 = new boolean[5];

    @OriginalMember(owner = "client!oh", name = "e", descriptor = "Ljava/lang/String;")
    public static String field214 = null;

    @OriginalMember(owner = "client!oh", name = "g", descriptor = "Lag;")
    public static class97 field216 = new class97();

    @OriginalMember(owner = "client!oh", name = "i", descriptor = "F")
    public static float field218;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!oh", name = "b", descriptor = "I")
    public int field211;

    @OriginalMember(owner = "client!oh", name = "c", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!oh", name = "d", descriptor = "I")
    public int field213;

    @OriginalMember(owner = "client!oh", name = "h", descriptor = "I")
    public int field217;

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(I)V")
    public static void method113(int arg0) {
        field214 = null;
        field216 = null;
        if (arg0 < -113) {
            field215 = null;
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IIIIIIBI)V")
    public static final void method114(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7) {
        field210++;
        if (arg0 == arg4) {
            class221.method1424(60, arg1, arg3, arg2, arg0, arg7, arg5);
        } else if (arg6 >= 8) {
            if (arg3 - arg0 >= class93.field1412 && (arg3 + arg0) <= class142.field2061 && class93.field1418 <= arg1 - arg4 && class254.field3857 >= arg1 + arg4) {
                class151.method1018(arg7, arg5, arg3, arg4, -101, arg2, arg1, arg0);
            } else {
                class168.method1111(arg5, 0, arg2, arg7, arg1, arg0, arg4, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!oh", name = "a", descriptor = "(IB)Lbd;")
    public static final class271 method115(int arg0, byte arg1) {
        if (arg1 != -113) {
            field214 = null;
        }
        field212++;
        class271 var2 = (class271) class48.field682.method263((byte) 121, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class87.field1340.method1538(class261.method1743(arg0, -1), class185.method1200((byte) -4, arg0), (byte) 98);
        class271 var4 = new class271();
        var4.field4262 = arg0;
        if (var3 != null) {
            var4.method1813((byte) -71, new class114(var3));
        }
        var4.method1822((byte) 98);
        class48.field682.method255((long) arg0, var4, (byte) -125);
        return var4;
    }
}
