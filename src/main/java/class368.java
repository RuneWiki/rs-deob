import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!el")
public class class368 {

    @OriginalMember(owner = "client!el", name = "c", descriptor = "Z")
    public static boolean field5404 = false;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "I")
    public static int field5402;

    @OriginalMember(owner = "client!el", name = "d", descriptor = "I")
    public static int field5405;

    @OriginalMember(owner = "client!el", name = "e", descriptor = "I")
    public static int field5406;

    @OriginalMember(owner = "client!el", name = "g", descriptor = "I")
    public static int field5408;

    @OriginalMember(owner = "client!el", name = "f", descriptor = "Lcl;")
    public static class167 field5407;

    @OriginalMember(owner = "client!el", name = "b", descriptor = "[[I")
    public static int[][] field5403;

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(B)V")
    public static void method2231(byte arg0) {
        if (arg0 != -81) {
            method2232(26, -126, -78);
        }
        field5403 = null;
        field5407 = null;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(III)Lsi;")
    public static final class376 method2232(int arg0, int arg1, int arg2) {
        class268 var3 = class321.field4830[arg0][arg1][arg2];
        return var3 == null || var3.field4042 == null ? null : var3.field4042;
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(IIIZI)V")
    public static final void method2233(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        field5405++;
        if (class463.field7116.field2941 != 0 && arg2 != 0 && class255.field3888 < 50 && arg0 != -1) {
            class432.field6354[class255.field3888++] = new class456((byte) 2, arg0, arg2, arg1, arg4, 0);
        }
        if (arg3) {
            method2231((byte) 122);
        }
    }

    @OriginalMember(owner = "client!el", name = "a", descriptor = "(Z)V")
    public static final void method2234(boolean arg0) {
        field5408++;
        class288 var1 = class475.field7250;
        synchronized (class475.field7250) {
            if (!arg0) {
                field5406 = -66;
            }
            class475.field7250.method1761(-115);
        }
    }
}
