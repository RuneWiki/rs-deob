import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class345 extends RuntimeException {

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "Ljava/lang/Throwable;")
    public Throwable field4666;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Ljava/lang/String;")
    public String field4662;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "Lcp;")
    public static class399 field4667 = new class399();

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field4668 = -1;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "[I")
    public static int[] field4669 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "I")
    public static int field4671 = 0;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "I")
    public static int field4663;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "I")
    public static int field4664;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "I")
    public static int field4665;

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Lij;")
    public static class316 field4670;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2093(int arg0) {
        field4664++;
        class88.field1232.method1151(252, (byte) 93);
        class310.field4198++;
        class88.field1232.method2280(class111.method846(-12334), 1537846408);
        class88.field1232.method2275(122, class373.field5174);
        class88.field1232.method2275(-127, class396.field5493);
        class88.field1232.method2280(class353.field4745, 1537846408);
        if (arg0 >= -38) {
            method2093(51);
        }
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(Lvg;II)I", line = 23)
    public static final int method2094(class108 arg0, int arg1, int arg2) {
        field4663++;
        if (!client.method1634(arg0).method1877(1, arg2) && arg0.field1667 == null) {
            return -1;
        } else if (arg1 == -1) {
            return arg0.field1605 == null || arg0.field1605.length <= arg2 ? -1 : arg0.field1605[arg2];
        } else {
            return 56;
        }
    }

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "(I)V", line = 44)
    public static void method2095(int arg0) {
        field4667 = null;
        if (arg0 != -1) {
            method2093(-24);
        }
        field4669 = null;
        field4670 = null;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)V", line = 61)
    public class345(Throwable arg0, String arg1) {
        this.field4666 = arg0;
        this.field4662 = arg1;
    }
}
