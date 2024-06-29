import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class29 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "I")
    public static int field392 = 0;

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "Lsc;")
    public static class249 field393 = new class249();

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "I")
    public static int field395 = 0;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Ljava/lang/String;")
    public static String field394 = " from your ignore list first.";

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "I")
    public static int field391;

    @OriginalMember(owner = "client!fb", name = "f", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(III)Lce;")
    public static final class216 method238(int arg0, int arg1, int arg2) {
        field396++;
        class216 var3 = new class216();
        for (class162 var4 = (class162) class4.field63.method350(8240); var4 != null; var4 = (class162) class4.field63.method353((byte) -118)) {
            if (var4.field2511 && var4.method1113(-92, arg2, arg0)) {
                var3.method1466(var4, -25);
            }
        }
        if (arg1 > -11) {
            field395 = 88;
        }
        return var3;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Z)V")
    public static final void method239(boolean arg0) {
        field391++;
        class105.field1612 = new class46();
        if (!arg0) {
            method240(-32);
        }
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V")
    public static void method240(int arg0) {
        field394 = null;
        field393 = null;
        if (arg0 < 51) {
            method240(-11);
        }
    }
}
