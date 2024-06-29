import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class263 {

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field3854 = 0;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "D")
    public static double field3858;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "I")
    public static int field3853;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field3855;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field3856;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field3857;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field3859;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(IIIBI)V")
    public static final void method1801(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        class61.field881 = arg0;
        field3853++;
        class409.field5842 = arg1;
        class638.field8565 = arg2;
        if (arg3 != -3) {
            method1801(24, 74, -58, (byte) -22, 38);
        }
        class588.field8015 = arg4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V")
    public static final void method1802(int arg0) {
        field3859++;
        class216 var1 = null;
        try {
            class246 var2 = class159.field2227.method873("", true, (byte) -21);
            while (var2.field3633 == 0) {
                class688.method3874(1L, -7375);
            }
            if (~var2.field3633 == arg0) {
                var1 = (class216) var2.field3638;
                class63 var3 = class332.field4707.method2155(13302);
                var1.method1275(var3.field954, arg0 - 13052, 0, var3.field956);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method1273(arg0 + 120);
            }
        } catch (Exception var4) {
        }
    }
}
