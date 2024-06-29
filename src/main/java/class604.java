import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class604 implements class296 {

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public int field8552;

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "Z")
    public static boolean field8551 = false;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "I")
    public static int field8548;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "I")
    public static int field8549;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "I")
    public static int field8550;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(III)Z")
    public static final boolean method3369(int arg0, int arg1, int arg2) {
        if (arg1 != -10683) {
            field8551 = true;
        }
        field8548++;
        return class196.method1138(arg0, arg2, 21056) | (arg2 & 0x60000) != 0 || class407.method2209(arg0, 45056, arg2) || class692.method3831(arg2, 2, arg0);
    }

    @OriginalMember(owner = "client!bca", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8550++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(I)I")
    public static final int method3370(int arg0) {
        if (arg0 >= -24) {
            method3369(-111, 62, 58);
        }
        field8549++;
        return class289.field3719 == null ? 0 : class289.field3719.length * 2;
    }

    @OriginalMember(owner = "client!bca", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class604(String arg0, int arg1) {
        this.field8552 = arg1;
    }
}
