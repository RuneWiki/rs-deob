import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wga")
public class class506 {

    @OriginalMember(owner = "client!wga", name = "d", descriptor = "I")
    public static int field7142 = 0;

    @OriginalMember(owner = "client!wga", name = "b", descriptor = "Lsga;")
    public static class583 field7140 = new class583(16);

    @OriginalMember(owner = "client!wga", name = "e", descriptor = "Z")
    public static boolean field7143 = true;

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "I")
    public static int field7139;

    @OriginalMember(owner = "client!wga", name = "c", descriptor = "I")
    public static int field7141;

    @OriginalMember(owner = "client!wga", name = "toString", descriptor = "()Ljava/lang/String;", line = 7)
    public final String toString() {
        field7139++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(B)V", line = 16)
    public static void method2927(byte arg0) {
        if (arg0 != -2) {
            field7142 = -92;
        }
        field7140 = null;
    }

    @OriginalMember(owner = "client!wga", name = "a", descriptor = "(III)Z", line = 34)
    public static final boolean method2928(int arg0, int arg1, int arg2) {
        field7141++;
        if (arg2 != 16) {
            field7140 = null;
        }
        return (class177.method1088(arg0, arg2 ^ 0xFFFFFFEF, arg1) | class414.method2453(arg1, 116, arg0) | class441.method2599(arg1, arg0, (byte) 125)) & class606.method3326(arg1, (byte) 44, arg0);
    }
}
