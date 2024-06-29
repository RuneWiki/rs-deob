import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class208 {

    @OriginalMember(owner = "client!uw", name = "g", descriptor = "I")
    public int field2874;

    @OriginalMember(owner = "client!uw", name = "e", descriptor = "I")
    private int field2872;

    @OriginalMember(owner = "client!uw", name = "d", descriptor = "Luw;")
    public static class208 field2871 = new class208(39, 1);

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field2868;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field2869;

    @OriginalMember(owner = "client!uw", name = "c", descriptor = "I")
    public static int field2870;

    @OriginalMember(owner = "client!uw", name = "f", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(III)Z", line = 5)
    public static final boolean method1400(int arg0, int arg1, int arg2) {
        field2873++;
        if (arg2 == 3938) {
            return (arg0 & 0x800) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(B)V", line = 21)
    public static void method1401(byte arg0) {
        field2871 = null;
        int var1 = -92 / ((-arg0 - 43) / 51);
    }

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(I)I", line = 31)
    public final int method1402(int arg0) {
        field2870++;
        int var2 = 81 % ((23 - arg0) / 49);
        return this.field2872;
    }

    @OriginalMember(owner = "client!uw", name = "toString", descriptor = "()Ljava/lang/String;", line = 45)
    public final String toString() {
        field2868++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!uw", name = "<init>", descriptor = "(II)V", line = 52)
    public class208(int arg0, int arg1) {
        this.field2874 = arg1;
        this.field2872 = arg0;
    }
}
