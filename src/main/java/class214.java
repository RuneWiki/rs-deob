import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hp")
public class class214 {

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "I")
    public int field3043;

    @OriginalMember(owner = "client!hp", name = "b", descriptor = "[I")
    public static int[] field3044 = new int[1];

    @OriginalMember(owner = "client!hp", name = "c", descriptor = "I")
    public static int field3045 = 0;

    @OriginalMember(owner = "client!hp", name = "e", descriptor = "Lff;")
    public static class9 field3047 = new class9(20);

    @OriginalMember(owner = "client!hp", name = "g", descriptor = "I")
    public static int field3049 = 0;

    @OriginalMember(owner = "client!hp", name = "d", descriptor = "I")
    public static int field3046;

    @OriginalMember(owner = "client!hp", name = "f", descriptor = "Lep;")
    public static class288 field3048;

    @OriginalMember(owner = "client!hp", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3046++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hp", name = "a", descriptor = "(I)V")
    public static void method1282(int arg0) {
        if (arg0 == 31348) {
            field3044 = null;
            field3047 = null;
            field3048 = null;
        }
    }

    @OriginalMember(owner = "client!hp", name = "<init>", descriptor = "(II)V")
    public class214(int arg0, int arg1) {
        this.field3043 = arg0;
    }
}
