import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nf")
public class class168 extends class261 {

    @OriginalMember(owner = "client!nf", name = "J", descriptor = "Ljava/lang/Object;")
    private Object field2572;

    @OriginalMember(owner = "client!nf", name = "C", descriptor = "I")
    public static int field2565 = 0;

    @OriginalMember(owner = "client!nf", name = "H", descriptor = "I")
    public static int field2570 = 0;

    @OriginalMember(owner = "client!nf", name = "I", descriptor = "I")
    public static int field2571 = -1;

    @OriginalMember(owner = "client!nf", name = "K", descriptor = "Ljava/lang/String;")
    public static String field2573 = null;

    @OriginalMember(owner = "client!nf", name = "B", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!nf", name = "D", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!nf", name = "E", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!nf", name = "F", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!nf", name = "L", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!nf", name = "G", descriptor = "Lee;")
    public static class137 field2569;

    @OriginalMember(owner = "client!nf", name = "M", descriptor = "Ljh;")
    public static class207 field2575;

    @OriginalMember(owner = "client!nf", name = "d", descriptor = "(I)Z", line = 12)
    public final boolean method1142(int arg0) {
        field2564++;
        if (arg0 != 10054) {
            this.method1142(20);
        }
        return false;
    }

    @OriginalMember(owner = "client!nf", name = "e", descriptor = "(I)V", line = 33)
    public static void method1143(int arg0) {
        if (arg0 < 50) {
            method1143(93);
        }
        field2575 = null;
        field2569 = null;
        field2573 = null;
    }

    @OriginalMember(owner = "client!nf", name = "c", descriptor = "(I)Ljava/lang/Object;", line = 59)
    public final Object method1144(int arg0) {
        if (arg0 != -12903) {
            field2565 = 122;
        }
        field2566++;
        return this.field2572;
    }

    @OriginalMember(owner = "client!nf", name = "<init>", descriptor = "(Ljava/lang/Object;)V", line = 68)
    public class168(Object arg0) {
        this.field2572 = arg0;
    }
}
