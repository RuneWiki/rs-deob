import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!l")
public class class109 {

    @OriginalMember(owner = "client!l", name = "e", descriptor = "[I")
    public static int[] field2030 = new int[1000];

    @OriginalMember(owner = "client!l", name = "c", descriptor = "Lrd;")
    private static class173 field2028 = class133.method843("Loading config )2 ", -116);

    @OriginalMember(owner = "client!l", name = "h", descriptor = "Lrd;")
    public static class173 field2033 = class133.method843("hel", -125);

    @OriginalMember(owner = "client!l", name = "l", descriptor = "Lrd;")
    public static class173 field2037 = field2028;

    @OriginalMember(owner = "client!l", name = "g", descriptor = "Lrd;")
    public static class173 field2032 = class133.method843("sich mit einer anderen Welt zu verbinden)3", -87);

    @OriginalMember(owner = "client!l", name = "b", descriptor = "Lrd;")
    private static class173 field2027 = class133.method843("shake:", 34);

    @OriginalMember(owner = "client!l", name = "i", descriptor = "Lrd;")
    public static class173 field2034 = field2027;

    @OriginalMember(owner = "client!l", name = "f", descriptor = "Lrd;")
    public static class173 field2031 = class133.method843("<col=ffffff> )4 ", -88);

    @OriginalMember(owner = "client!l", name = "m", descriptor = "Lrd;")
    public static class173 field2038 = field2027;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!l", name = "j", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!l", name = "d", descriptor = "Lbc;")
    public static class14 field2029;

    @OriginalMember(owner = "client!l", name = "k", descriptor = "[Ldh;")
    public static class39[] field2036;

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(ZLjava/awt/Component;)V")
    public static final void method665(boolean arg0, Component arg1) {
        arg1.removeKeyListener(class15.field343);
        field2026++;
        arg1.removeFocusListener(class15.field343);
        class212.field4103 = -1;
        if (arg0) {
            method665(true, null);
        }
    }

    @OriginalMember(owner = "client!l", name = "a", descriptor = "(Z)V")
    public static void method666(boolean arg0) {
        field2027 = null;
        field2028 = null;
        field2029 = null;
        field2037 = null;
        field2038 = null;
        field2034 = null;
        field2036 = null;
        if (arg0) {
            field2036 = null;
        }
        field2031 = null;
        field2033 = null;
        field2030 = null;
        field2032 = null;
    }
}
