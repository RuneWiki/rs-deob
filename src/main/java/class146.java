import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ec")
public class class146 {

    @OriginalMember(owner = "client!ec", name = "d", descriptor = "I")
    public int field1885;

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "I")
    public static int field1882;

    @OriginalMember(owner = "client!ec", name = "b", descriptor = "I")
    public static int field1883;

    @OriginalMember(owner = "client!ec", name = "c", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!ec", name = "toString", descriptor = "()Ljava/lang/String;", line = 5)
    public final String toString() {
        field1883++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(I)Z", line = 13)
    public static final boolean method844(int arg0) {
        field1884++;
        if (arg0 < 101) {
            return false;
        }
        if (class453.field5814) {
            try {
                if ((Boolean) class371.method2028(true, "showingVideoAd", class422.field5308)) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ec", name = "a", descriptor = "(III)Z", line = 33)
    public static final boolean method845(int arg0, int arg1, int arg2) {
        field1882++;
        if (((arg1 & 0x10000) != arg0 | class491.method2644(arg2, 116, arg1)) || class670.method3761(arg1, arg2, -109)) {
            return true;
        } else {
            return (arg2 & 0x37) == 0 && class512.method2762(arg1, arg0 ^ 0x37, arg2);
        }
    }

    @OriginalMember(owner = "client!ec", name = "<init>", descriptor = "(I)V", line = 51)
    public class146(int arg0) {
        this.field1885 = arg0;
    }
}
