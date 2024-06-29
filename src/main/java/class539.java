import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class539 {

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "Ljq;")
    public static class539 field7327 = new class539();

    @OriginalMember(owner = "client!jq", name = "e", descriptor = "Ljq;")
    public static class539 field7331 = new class539();

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "Ljq;")
    public static class539 field7332 = new class539();

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "Ljq;")
    public static class539 field7333 = new class539();

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "Z")
    public static boolean field7334 = false;

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "I")
    public static int field7328;

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "I")
    public static int field7329;

    @OriginalMember(owner = "client!jq", name = "d", descriptor = "I")
    public static int field7330;

    @OriginalMember(owner = "client!jq", name = "i", descriptor = "[[Z")
    public static boolean[][] field7335;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Ljp;Ljava/lang/String;B)I", line = 4)
    public static final int method3077(class376 arg0, String arg1, byte arg2) {
        field7329++;
        int var3 = arg0.field5459;
        byte[] var4 = class196.method1344((byte) 126, arg1);
        arg0.method2393(var4.length, true);
        if (arg2 != 17) {
            method3077(null, null, (byte) -68);
        }
        arg0.field5459 += class673.field9465.method3402(0, arg0.field5518, var4, var4.length, 0, arg0.field5459);
        return arg0.field5459 - var3;
    }

    @OriginalMember(owner = "client!jq", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field7330++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 36)
    public static final void method3078(int arg0) {
        field7328++;
        class684.method3803(-5);
        class526.field7216 = false;
        if (arg0 != 0) {
            field7327 = null;
        }
        class38.method270(-2409, class245.field3317, class337.field4890, class356.field5213, class442.field6220);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 58)
    public static void method3079(int arg0) {
        field7333 = null;
        field7331 = null;
        field7335 = null;
        field7327 = null;
        if (arg0 != 26911) {
            method3079(-8);
        }
        field7332 = null;
    }
}
