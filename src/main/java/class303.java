import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class303 extends class114 {

    @OriginalMember(owner = "client!gr", name = "v", descriptor = "[B")
    public byte[] field4430;

    @OriginalMember(owner = "client!gr", name = "t", descriptor = "Lfg;")
    public static class84 field4428 = new class84(1, 2, 2, 0);

    @OriginalMember(owner = "client!gr", name = "y", descriptor = "I")
    public static int field4433;

    @OriginalMember(owner = "client!gr", name = "A", descriptor = "Ljava/lang/String;")
    public static String field4435;

    @OriginalMember(owner = "client!gr", name = "z", descriptor = "I")
    public static int field4434;

    @OriginalMember(owner = "client!gr", name = "u", descriptor = "I")
    public static int field4429;

    @OriginalMember(owner = "client!gr", name = "w", descriptor = "I")
    public static int field4431;

    @OriginalMember(owner = "client!gr", name = "x", descriptor = "I")
    public static int field4432;

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(II)Z")
    public static final boolean method1914(int arg0, int arg1) {
        field4431++;
        if (arg0 >= -27) {
            method1914(-127, -14);
        }
        return arg1 == 45 || arg1 == 58 || arg1 == 1006 || arg1 == 10 || arg1 == 60;
    }

    @OriginalMember(owner = "client!gr", name = "<init>", descriptor = "([B)V")
    public class303(byte[] arg0) {
        this.field4430 = arg0;
    }

    @OriginalMember(owner = "client!gr", name = "a", descriptor = "(ILuu;)V")
    public static final void method1915(int arg0, class191 arg1) {
        if (arg0 != 2) {
            method1915(109, null);
        }
        class384.field5830 = arg1;
        field4429++;
    }

    @OriginalMember(owner = "client!gr", name = "f", descriptor = "(I)V")
    public static void method1916(int arg0) {
        field4435 = null;
        field4428 = null;
        if (arg0 <= 90) {
            method1916(67);
        }
    }

    static {
        new class446("This mute will remain for a further ", "Diese Stummschaltung gilt für weitere ", "Votre accès restera bloqué encore ", "Este veto permanecerá por mais ");
        field4433 = 0;
        field4435 = null;
        field4434 = 0;
    }
}
