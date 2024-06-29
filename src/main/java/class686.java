import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nha")
public class class686 {

    @OriginalMember(owner = "client!nha", name = "b", descriptor = "Ljava/lang/String;")
    public static String field9626 = null;

    @OriginalMember(owner = "client!nha", name = "c", descriptor = "I")
    public static int field9627 = -1;

    @OriginalMember(owner = "client!nha", name = "d", descriptor = "Z")
    public static volatile boolean field9628 = true;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "I")
    public static int field9625;

    @OriginalMember(owner = "client!nha", name = "e", descriptor = "I")
    public static int field9629;

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(I)V")
    public static void method3912(int arg0) {
        field9626 = null;
        if (arg0 != -10) {
            field9626 = null;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(III)B")
    public static final byte method3913(int arg0, int arg1, int arg2) {
        field9625++;
        if (arg2 >= -31) {
            method3913(60, -81, 27);
        }
        if (arg0 == 9) {
            return (byte) ((arg1 & 0x1) == 0 ? 1 : 2);
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!nha", name = "a", descriptor = "(B)Z")
    public static final boolean method3914(byte arg0) {
        if (arg0 != 119) {
            field9628 = true;
        }
        field9629++;
        if (class668.field9408) {
            try {
                class208.method1378("showVideoAd", class622.field8847, -9875);
                return true;
            } catch (Throwable var1) {
            }
        }
        return false;
    }
}
