import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sia")
public class class732 {

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "I")
    public static int field9885;

    @OriginalMember(owner = "client!sia", name = "b", descriptor = "I")
    public static int field9886;

    @OriginalMember(owner = "client!sia", name = "e", descriptor = "I")
    public static int field9889;

    @OriginalMember(owner = "client!sia", name = "d", descriptor = "Lcb;")
    public static class521 field9888;

    @OriginalMember(owner = "client!sia", name = "f", descriptor = "Lqs;")
    public static class603 field9890;

    @OriginalMember(owner = "client!sia", name = "c", descriptor = "Lin;")
    public static class91 field9887;

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(Z)Ltb;")
    public static final class401 method4043(boolean arg0) {
        field9889++;
        if (arg0) {
            field9890 = null;
        }
        try {
            return new class543();
        } catch (Throwable var2) {
            try {
                return (class401) Class.forName("oq").getDeclaredConstructor().newInstance();
            } catch (Throwable var1) {
                return new class249();
            }
        }
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(I)V")
    public static void method4044(int arg0) {
        field9887 = null;
        int var1 = -20 / ((-arg0 - 87) / 34);
        field9890 = null;
        field9888 = null;
    }

    @OriginalMember(owner = "client!sia", name = "a", descriptor = "(ZII)Z")
    public static final boolean method4045(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            method4045(false, 85, -80);
        }
        field9886++;
        return (arg1 & 0x400) != 0;
    }
}
