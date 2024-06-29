import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class599 {

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "Z")
    public static boolean field8344 = false;

    @OriginalMember(owner = "client!oea", name = "b", descriptor = "Ltba;")
    public static class165 field8345 = new class165(16);

    @OriginalMember(owner = "client!oea", name = "c", descriptor = "I")
    public static int field8346;

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "I")
    public static int field8347;

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "I")
    public static int field8348;

    @OriginalMember(owner = "client!oea", name = "f", descriptor = "I")
    public static int field8349;

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 4)
    public static void method3396(byte arg0) {
        field8345 = null;
        if (arg0 >= -36) {
            field8346 = -79;
        }
    }

    @OriginalMember(owner = "client!oea", name = "toString", descriptor = "()Ljava/lang/String;", line = 19)
    public final String toString() {
        field8348++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(III)I", line = 33)
    public final int method3397(int arg0, int arg1, int arg2) {
        field8347++;
        int var4 = class466.field6263 <= arg1 ? arg1 : class466.field6263;
        if (class108.field1545 == this) {
            return 0;
        }
        if (arg2 > -77) {
            method3396((byte) 50);
        }
        if (class346.field4369 == this) {
            return var4 - arg0;
        } else if (class35.field555 == this) {
            return (var4 - arg0) / 2;
        } else {
            return 0;
        }
    }
}
