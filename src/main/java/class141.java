import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public class class141 {

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "I")
    public int field2102;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "Z")
    public static boolean field2101 = false;

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "I")
    public static int field2104 = -1;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "Lrb;")
    public static class283 field2105 = new class283(68, 2);

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public static int field2103;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(IIILin;)V", line = 5)
    public static final void method987(int arg0, int arg1, int arg2, class167 arg3) {
        class532 var4 = class307.method1778(arg0, arg1, arg2);
        if (var4 != null) {
            var4.field7838 = arg3;
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)V", line = 13)
    public static void method988(int arg0) {
        if (arg0 < 105) {
            method987(-39, -19, 0, null);
        }
        field2105 = null;
    }

    @OriginalMember(owner = "client!tp", name = "toString", descriptor = "()Ljava/lang/String;", line = 24)
    public final String toString() {
        field2103++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(II)V", line = 39)
    public class141(int arg0, int arg1) {
        this.field2102 = arg0;
    }
}
