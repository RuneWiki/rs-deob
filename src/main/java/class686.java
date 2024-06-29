import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class686 {

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field9689;

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "Lla;")
    public static class422 field9693;

    @OriginalMember(owner = "client!nha", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field9689++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V", line = 13)
    public static void method3823(int arg0) {
        if (arg0 != 29949) {
            method3826(-67, 117, -1);
        }
        field9693 = null;
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(IBI)I", line = 23)
    public final int method3824(int arg0, byte arg1, int arg2) {
        if (arg1 >= -41) {
            return 37;
        }
        field9692++;
        int var4 = class660.field9408 > arg0 ? class660.field9408 : arg0;
        if (class256.field4031 == this) {
            return 0;
        } else if (class651.field9248 == this) {
            return var4 - arg2;
        } else if (class665.field9444 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 48)
    public static final String method3825(boolean arg0, String arg1) {
        field9691++;
        if (class616.field8695.startsWith("win")) {
            return arg1 + ".dll";
        } else if (class616.field8695.startsWith("linux")) {
            return "lib" + arg1 + ".so";
        } else if (class616.field8695.startsWith("mac")) {
            return "lib" + arg1 + ".dylib";
        } else {
            if (arg0) {
                field9693 = null;
            }
            return null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)V", line = 71)
    public static final void method3826(int arg0, int arg1, int arg2) {
        field9690++;
        if (arg0 == -21467) {
            class118 var3 = class86.method755(true, 14, arg1);
            var3.method933((byte) 82);
            var3.field1811 = arg2;
        }
    }
}
