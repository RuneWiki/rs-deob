import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aha")
public class class403 {

    @OriginalMember(owner = "client!aha", name = "d", descriptor = "Ljava/lang/String;")
    public String field5536;

    @OriginalMember(owner = "client!aha", name = "f", descriptor = "Ljava/lang/String;")
    public String field5538;

    @OriginalMember(owner = "client!aha", name = "e", descriptor = "Ljava/lang/String;")
    public String field5537;

    @OriginalMember(owner = "client!aha", name = "b", descriptor = "Lim;")
    public static class598 field5534 = new class598("stellardawn", 1);

    @OriginalMember(owner = "client!aha", name = "g", descriptor = "F")
    public static float field5539;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "I")
    public static int field5533;

    @OriginalMember(owner = "client!aha", name = "c", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(IBI)Z", line = 8)
    public static final boolean method2408(int arg0, byte arg1, int arg2) {
        if (arg1 != 42) {
            field5534 = null;
        }
        field5535++;
        return (arg2 & 0x400) != 0;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(I)V", line = 21)
    public static void method2409(int arg0) {
        int var1 = 23 / ((41 - arg0) / 58);
        field5534 = null;
    }

    @OriginalMember(owner = "client!aha", name = "a", descriptor = "(B)Lmaa;", line = 34)
    public static final class498 method2410(byte arg0) {
        field5533++;
        if (arg0 != -52) {
            method2409(79);
        }
        try {
            return new class310();
        } catch (Throwable var2) {
            try {
                return (class498) Class.forName("kp").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class182();
            }
        }
    }

    @OriginalMember(owner = "client!aha", name = "<init>", descriptor = "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", line = 58)
    public class403(String arg0, String arg1, String arg2) {
        this.field5536 = arg2;
        this.field5538 = arg1;
        this.field5537 = arg0;
    }
}
