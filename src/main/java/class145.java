import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class145 {

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    private int field2066;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field2063 = -1;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "F")
    public static float field2060;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "I")
    public static int field2064;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2065++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)I")
    public final int method1004(int arg0) {
        field2064++;
        if (arg0 != -32624) {
            this.field2066 = 77;
        }
        return this.field2066;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIZILqa;Loa;I)V")
    public static final void method1005(int arg0, int arg1, boolean arg2, int arg3, class162 arg4, class489 arg5, int arg6) {
        if (arg2) {
            class487.field6761.method3109((class149.field2132 - class487.field6761.method151()) / 2, (class175.field2555 - class487.field6761.method149()) / 2);
            class411.field5655.method3109((class149.field2132 - class411.field5655.method151()) / 2, 18);
        }
        field2061++;
        if (arg0 <= 36) {
            return;
        }
        arg5.method2812(-1, class175.field2555 / 2 - 26, (byte) 107, arg6, class149.field2132 / 2, (class362.field4883 == class155.field2265 ? class57.field896 : class23.field407).method1764(class489.field6789, false));
        int var7 = class175.field2555 / 2 - 18;
        arg4.method614(class149.field2132 / 2 - 152, var7, 304, 34, arg1, 0);
        arg4.method614(class149.field2132 / 2 - 151, var7 - -1, 302, 32, 0, 0);
        arg4.method585(class149.field2132 / 2 - 150, var7 - -2, class159.field2359 * 3, 30, arg3, 0);
        arg4.method585(class149.field2132 / 2 + ((class159.field2359 * 3) - 150), var7 - -2, 300 - (class159.field2359 * 3), 30, 0, 0);
        arg5.method2812(-1, class175.field2555 / 2 + 4, (byte) 70, arg6, class149.field2132 / 2, class371.field5006);
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V")
    public class145(int arg0, int arg1) {
        this.field2066 = arg0;
    }
}
