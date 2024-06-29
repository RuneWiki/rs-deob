import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bt")
public abstract class class466 {

    @OriginalMember(owner = "client!bt", name = "c", descriptor = "Lri;")
    public static class412 field6717 = new class412(0, 0);

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "I")
    public static int field6716;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "Lmv;")
    public static class295 field6715;

    @OriginalMember(owner = "client!bt", name = "d", descriptor = "[Lgq;")
    public static class706[] field6718;

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(I)V", line = 10)
    public static final void method2695(int arg0) {
        field6716++;
        if (arg0 > -82 || !class577.field8378) {
            return;
        }
        while (true) {
            while (class196.field2692 < class568.field8284.length) {
                class116 var1 = class568.field8284[class196.field2692];
                if (var1 != null && var1.field1734 == -1) {
                    if (class200.field2717 == null) {
                        class200.field2717 = class23.field434.method2118(var1.field1742, true);
                    }
                    int var2 = class200.field2717.field2321;
                    if (var2 == -1) {
                        return;
                    }
                    class200.field2717 = null;
                    var1.field1734 = var2;
                    class196.field2692++;
                } else {
                    class196.field2692++;
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!bt", name = "b", descriptor = "(I)V", line = 52)
    public static void method2696(int arg0) {
        field6718 = null;
        field6715 = null;
        field6717 = null;
        if (arg0 != 7006) {
            method2695(-10);
        }
    }

    @OriginalMember(owner = "client!bt", name = "a", descriptor = "(IZFFIIIF[FFI)V")
    public abstract void method1681(int arg0, boolean arg1, float arg2, float arg3, int arg4, int arg5, int arg6, float arg7, float[] arg8, float arg9, int arg10);
}
