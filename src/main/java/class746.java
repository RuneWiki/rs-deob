import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mo")
public class class746 {

    @OriginalMember(owner = "client!mo", name = "b", descriptor = "Ldh;")
    public static class320 field10411 = new class320(43, 4);

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "I")
    public static int field10410;

    @OriginalMember(owner = "client!mo", name = "c", descriptor = "I")
    public static int field10412;

    @OriginalMember(owner = "client!mo", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field10410++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(I)V")
    public static void method4148(int arg0) {
        field10411 = null;
        if (arg0 != -127) {
            field10411 = null;
        }
    }

    @OriginalMember(owner = "client!mo", name = "a", descriptor = "(III)I")
    public static final int method4149(int arg0, int arg1, int arg2) {
        field10412++;
        if (arg0 == -1) {
            return 12345678;
        }
        int var3 = (arg0 & 0x7F) * arg2 >> 7;
        if (arg1 != 2) {
            field10411 = null;
        }
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg0 & 0xFF80) + var3;
    }
}
