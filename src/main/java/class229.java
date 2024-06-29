import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kf")
public class class229 {

    @OriginalMember(owner = "client!kf", name = "d", descriptor = "I")
    public int field3277;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "Luc;")
    public static class27 field3274 = new class27(13, 8);

    @OriginalMember(owner = "client!kf", name = "e", descriptor = "Z")
    public static boolean field3278 = false;

    @OriginalMember(owner = "client!kf", name = "b", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!kf", name = "c", descriptor = "Lta;")
    public static class194 field3276;

    @OriginalMember(owner = "client!kf", name = "a", descriptor = "(B)V", line = 4)
    public static void method1458(byte arg0) {
        field3276 = null;
        field3274 = null;
        if (arg0 >= -121) {
            method1458((byte) 124);
        }
    }

    @OriginalMember(owner = "client!kf", name = "toString", descriptor = "()Ljava/lang/String;", line = 18)
    public final String toString() {
        field3275++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kf", name = "<init>", descriptor = "(I)V", line = 33)
    public class229(int arg0) {
        this.field3277 = arg0;
    }
}
