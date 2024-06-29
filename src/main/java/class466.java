import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fk")
public class class466 extends class416 {

    @OriginalMember(owner = "client!fk", name = "P", descriptor = "Ljc;")
    public static class305 field6930 = new class305(" from your ignore list first.", " zuerst von deiner Ignorieren-Liste!", " de votre liste noire.", " da sua lista de ignorados primeiro.");

    @OriginalMember(owner = "client!fk", name = "Q", descriptor = "I")
    public static int field6931;

    @OriginalMember(owner = "client!fk", name = "R", descriptor = "I")
    public static int field6932;

    @OriginalMember(owner = "client!fk", name = "S", descriptor = "I")
    public static int field6933;

    @OriginalMember(owner = "client!fk", name = "T", descriptor = "I")
    public static int field6934;

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(Z)V")
    public static final void method2847(boolean arg0) {
        field6931++;
        if (class235.field3146 != null) {
            class235.field3146.method1040((byte) 63);
        }
        if (arg0) {
            field6933 = 127;
        }
        if (class153.field2005 != null) {
            class153.field2005.method1040((byte) -125);
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(ILjava/lang/String;B)V")
    public static final void method2848(int arg0, String arg1, byte arg2) {
        field6932++;
        if (arg2 == 118) {
            class184 var3 = class277.method1682(arg0, 3, -100);
            var3.method1069(true);
            var3.field2394 = arg1;
        }
    }

    @OriginalMember(owner = "client!fk", name = "a", descriptor = "(B)V")
    public static void method2849(byte arg0) {
        if (arg0 <= -105) {
            field6930 = null;
        }
    }
}
