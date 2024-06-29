import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ad")
public class class243 {

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "I")
    public static int field4016 = 1;

    @OriginalMember(owner = "client!ad", name = "e", descriptor = "I")
    public static int field4020 = 0;

    @OriginalMember(owner = "client!ad", name = "b", descriptor = "I")
    public static int field4017;

    @OriginalMember(owner = "client!ad", name = "d", descriptor = "I")
    public static int field4019;

    @OriginalMember(owner = "client!ad", name = "c", descriptor = "Lgl;")
    public static class356 field4018;

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Lne;I)Z")
    public static final boolean method1703(class172 arg0, int arg1) {
        if (arg1 != 9443) {
            method1705((byte) -17);
        }
        field4017++;
        if (arg0.field2831 == 205) {
            class407.field6044 = 250;
            return true;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(Ljava/lang/Throwable;Ljava/lang/String;)Log;")
    public static final class386 method1704(Throwable arg0, String arg1) {
        field4019++;
        class386 var2;
        if (arg0 instanceof class386) {
            var2 = (class386) arg0;
            var2.field5834 = var2.field5834 + ' ' + arg1;
        } else {
            var2 = new class386(arg0, arg1);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ad", name = "a", descriptor = "(B)V")
    public static void method1705(byte arg0) {
        if (arg0 > -67) {
            method1704((Throwable) null, (String) null);
        }
        field4018 = null;
    }
}
