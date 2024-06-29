import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pg")
public class class762 {

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "[I")
    public static int[] field10497 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!pg", name = "c", descriptor = "[I")
    public static int[] field10498 = new int[2048];

    @OriginalMember(owner = "client!pg", name = "d", descriptor = "[I")
    public static int[] field10499 = new int[1];

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "I")
    public static int field10496;

    @OriginalMember(owner = "client!pg", name = "e", descriptor = "I")
    public static int field10500;

    @OriginalMember(owner = "client!pg", name = "a", descriptor = "(B)V", line = 6)
    public static void method4196(byte arg0) {
        field10497 = null;
        field10499 = null;
        field10498 = null;
        if (arg0 <= 122) {
            field10499 = null;
        }
    }

    @OriginalMember(owner = "client!pg", name = "toString", descriptor = "()Ljava/lang/String;", line = 25)
    public final String toString() {
        field10500++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pg", name = "b", descriptor = "(B)V", line = 33)
    public static final void method4197(byte arg0) {
        field10496++;
        if (class569.field8059 == null) {
            return;
        }
        if (arg0 >= -87) {
            field10499 = null;
        }
        class569.field8059 = null;
        class223.method1546(class126.field1652, class209.field3041, (byte) 122, class204.field2992, class149.field1906);
    }
}
