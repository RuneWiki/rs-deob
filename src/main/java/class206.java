import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class206 {

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public int field2968;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    private int field2971;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "[I")
    public static int[] field2972 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field2969;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!cu", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2969++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static void method1336(int arg0) {
        field2972 = null;
        int var1 = -102 % ((-arg0 - 78) / 46);
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)I")
    public final int method1337(int arg0) {
        if (arg0 >= -23) {
            field2972 = null;
        }
        field2970++;
        return this.field2971;
    }

    @OriginalMember(owner = "client!cu", name = "<init>", descriptor = "(II)V")
    public class206(int arg0, int arg1) {
        this.field2968 = arg1;
        this.field2971 = arg0;
    }
}
