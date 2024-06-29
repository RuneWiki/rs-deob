import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class528 {

    @OriginalMember(owner = "client!jaa", name = "c", descriptor = "Llf;")
    public static class200 field7406 = new class200();

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "I")
    public static int field7404;

    @OriginalMember(owner = "client!jaa", name = "b", descriptor = "Lan;")
    public static class21 field7405;

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(B)V")
    public static void method3032(byte arg0) {
        if (arg0 != 113) {
            field7405 = null;
        }
        field7406 = null;
        field7405 = null;
    }

    @OriginalMember(owner = "client!jaa", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method3033(int arg0, int arg1, String arg2) {
        if (arg1 != -10670) {
            method3033(-82, -34, null);
        }
        field7404++;
        class314 var3 = class483.method2819(3, arg0, 21303);
        var3.method1959(19793);
        var3.field4228 = arg2;
    }

    static {
        new class104("You are not currently in a clan channel.", "Du befindest dich derzeit nicht in einem Chatraum.", "Vous n'êtes pas dans un canal de clan.", "No momento você não está em um canal de clã.");
    }
}
