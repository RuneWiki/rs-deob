import java.awt.Component;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public class class232 extends class207 {

    @OriginalMember(owner = "client!ci", name = "v", descriptor = "Ljd;")
    public class86 field4205;

    @OriginalMember(owner = "client!ci", name = "s", descriptor = "Ljd;")
    public static class86 field4202 = class122.method868("3D)2Softwarebibliothek gestartet)3", true);

    @OriginalMember(owner = "client!ci", name = "r", descriptor = "Ljd;")
    private static class86 field4201 = class122.method868("glow3:", true);

    @OriginalMember(owner = "client!ci", name = "p", descriptor = "Ljd;")
    public static class86 field4199 = field4201;

    @OriginalMember(owner = "client!ci", name = "o", descriptor = "Ljd;")
    public static class86 field4198 = class122.method868(":allyreq:", true);

    @OriginalMember(owner = "client!ci", name = "q", descriptor = "Ljd;")
    public static class86 field4200 = field4201;

    @OriginalMember(owner = "client!ci", name = "n", descriptor = "I")
    public static int field4197;

    @OriginalMember(owner = "client!ci", name = "w", descriptor = "I")
    public static int field4206;

    @OriginalMember(owner = "client!ci", name = "u", descriptor = "Lbj;")
    public static class151 field4204;

    @OriginalMember(owner = "client!ci", name = "t", descriptor = "[Lfj;")
    public static class239[] field4203;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Ljava/awt/Component;Z)V")
    public static final void method1609(Component arg0, boolean arg1) {
        field4197++;
        if (!arg1) {
            arg0.removeKeyListener(class108.field2079);
            arg0.removeFocusListener(class108.field2079);
            class6.field97 = -1;
        }
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "()V")
    public class232() {
    }

    @OriginalMember(owner = "client!ci", name = "<init>", descriptor = "(Ljd;)V")
    public class232(class86 arg0) {
        this.field4205 = arg0;
    }

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "(I)V")
    public static void method1610(int arg0) {
        field4199 = null;
        if (arg0 != 27418) {
            return;
        }
        field4198 = null;
        field4200 = null;
        field4203 = null;
        field4201 = null;
        field4202 = null;
        field4204 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(B)V")
    public static final void method1611(byte arg0) {
        if (arg0 < 33) {
            method1609((Component) null, false);
        }
        field4206++;
        class88.field1739.method703((byte) 122);
    }
}
