import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pn")
public class class692 {

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "I")
    public int field9861;

    @OriginalMember(owner = "client!pn", name = "b", descriptor = "I")
    public static int field9862;

    @OriginalMember(owner = "client!pn", name = "c", descriptor = "I")
    public static int field9863;

    @OriginalMember(owner = "client!pn", name = "d", descriptor = "I")
    public static int field9864;

    @OriginalMember(owner = "client!pn", name = "toString", descriptor = "()Ljava/lang/String;", line = 3)
    public final String toString() {
        field9863++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!pn", name = "<init>", descriptor = "(I)V", line = 14)
    public class692(int arg0) {
        this.field9861 = arg0;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(B)Z", line = 23)
    public static final boolean method3895(byte arg0) {
        field9864++;
        if (class123.field1686) {
            try {
                if ((Boolean) class204.method1329((byte) -57, class59.field668, "showingVideoAd")) {
                    return false;
                }
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != 74) {
            method3895((byte) -12);
        }
        return true;
    }

    @OriginalMember(owner = "client!pn", name = "a", descriptor = "(IIIZIIII)V", line = 44)
    public static final void method3896(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7) {
        field9862++;
        if (arg1 == arg4) {
            class5.method15(arg2, arg1, arg0, arg5, (byte) 3, arg7, arg6);
            return;
        }
        if (class128.field1831 <= arg2 - arg1 && class529.field7169 >= (arg1 + arg2) && (arg7 - arg4) >= class469.field6466 && arg7 + arg4 <= class533.field7200) {
            class281.method1728(arg0, arg4, arg5, arg7, arg1, (byte) -126, arg2, arg6);
        } else {
            class133.method941(arg7, arg2, arg0, arg5, true, arg1, arg6, arg4);
        }
        if (arg3) {
            method3895((byte) -71);
        }
    }
}
