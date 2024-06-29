import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class196 extends class155 {

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "Ljava/lang/Object;")
    private Object field2378;

    @OriginalMember(owner = "client!gb", name = "z", descriptor = "Lhf;")
    public static class363 field2369 = new class363();

    @OriginalMember(owner = "client!gb", name = "y", descriptor = "I")
    public static int field2368;

    @OriginalMember(owner = "client!gb", name = "B", descriptor = "I")
    public static int field2371;

    @OriginalMember(owner = "client!gb", name = "C", descriptor = "I")
    public static int field2372;

    @OriginalMember(owner = "client!gb", name = "D", descriptor = "I")
    public static int field2373;

    @OriginalMember(owner = "client!gb", name = "E", descriptor = "I")
    public static int field2374;

    @OriginalMember(owner = "client!gb", name = "F", descriptor = "I")
    public static int field2375;

    @OriginalMember(owner = "client!gb", name = "G", descriptor = "I")
    public static int field2376;

    @OriginalMember(owner = "client!gb", name = "A", descriptor = "[I")
    public static int[] field2370;

    @OriginalMember(owner = "client!gb", name = "H", descriptor = "[Lf;")
    public static class701[] field2377;

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "(Ljava/lang/Object;I)V")
    public class196(Object arg0, int arg1) {
        super(arg1);
        this.field2378 = arg0;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(II)V")
    public static final void method1197(int arg0, int arg1) {
        field2371++;
        class233 var2 = class7.method44(arg1, arg0, -1);
        var2.method1423(0);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(Z)Z")
    public final boolean method985(boolean arg0) {
        field2374++;
        if (arg0) {
            this.method987(54);
        }
        return false;
    }

    @OriginalMember(owner = "client!gb", name = "f", descriptor = "(I)Ljava/lang/Object;")
    public final Object method987(int arg0) {
        if (arg0 >= -63) {
            return null;
        } else {
            field2376++;
            return this.field2378;
        }
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)V")
    public static final void method1198(byte arg0, int arg1) {
        field2373++;
        if (arg0 > 115) {
            class233 var2 = class7.method44(arg1, 4, -1);
            var2.method1423(0);
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method1199(int arg0) {
        field2370 = null;
        field2369 = null;
        if (arg0 != 4) {
            field2377 = null;
        }
        field2377 = null;
    }
}
