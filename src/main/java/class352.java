import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class352 {

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "Lpea;")
    public static class722 field4529 = new class722(2);

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "I")
    public static int field4527;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "I")
    public static int field4528;

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "I")
    public static int field4530;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field4531;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljm;Z)I")
    public static final int method2082(class687 arg0, boolean arg1) {
        field4530++;
        if (class687.field9694 == arg0) {
            return 5120;
        } else if (class687.field9695 == arg0) {
            return 5122;
        } else if (class687.field9696 == arg0) {
            return 5124;
        } else if (class687.field9697 == arg0) {
            return 5121;
        } else if (class687.field9698 == arg0) {
            return 5123;
        } else if (class687.field9699 == arg0) {
            return 5125;
        } else if (class687.field9700 == arg0) {
            return 5131;
        } else if (class687.field9701 == arg0) {
            return 5126;
        } else if (arg1) {
            return 23;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)Z")
    public final boolean method2083(int arg0) {
        if (arg0 != 5121) {
            field4528 = -69;
        }
        field4531++;
        return class704.field9923 == this | class503.field7072 == this;
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Z)V")
    public static void method2084(boolean arg0) {
        if (!arg0) {
            field4529 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field4527++;
        throw new IllegalStateException();
    }
}
