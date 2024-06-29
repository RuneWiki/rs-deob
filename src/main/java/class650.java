import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nq")
public class class650 {

    @OriginalMember(owner = "client!nq", name = "f", descriptor = "Ljava/lang/String;")
    public String field8978;

    @OriginalMember(owner = "client!nq", name = "d", descriptor = "I")
    public int field8976;

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "Z")
    public static boolean field8973 = false;

    @OriginalMember(owner = "client!nq", name = "b", descriptor = "I")
    public static int field8974;

    @OriginalMember(owner = "client!nq", name = "c", descriptor = "I")
    public static int field8975;

    @OriginalMember(owner = "client!nq", name = "e", descriptor = "I")
    public static int field8977;

    @OriginalMember(owner = "client!nq", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field8975++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nq", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class650(String arg0, int arg1) {
        this.field8978 = arg0;
        this.field8976 = arg1;
    }

    @OriginalMember(owner = "client!nq", name = "a", descriptor = "(III)I")
    public static final int method3608(int arg0, int arg1, int arg2) {
        field8977++;
        if (arg0 == -2) {
            return 12345678;
        } else if (arg0 == -1) {
            if (arg1 < 2) {
                arg1 = 2;
            } else if (arg1 > 126) {
                arg1 = 126;
            }
            return arg1;
        } else {
            int var3 = (arg0 & 0x7F) * arg1 >> 7;
            if (var3 < 2) {
                var3 = 2;
            } else if (var3 > 126) {
                var3 = 126;
            }
            int var4 = 66 / ((arg2 + 49) / 53);
            return (arg0 & 0xFF80) + var3;
        }
    }
}
