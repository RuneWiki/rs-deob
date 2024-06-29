import java.awt.Component;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public abstract class class102 {

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "Lid;")
    public static class60 field2473 = class11.method72("huffman", (byte) 9);

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "Lid;")
    public static class60 field2475 = class11.method72(" <col=00ff80>", (byte) -104);

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "Lid;")
    public static class60 field2478 = class11.method72("Cabbage", (byte) 100);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field2471 = 7759444;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "Lid;")
    public static class60 field2477 = class11.method72("Bitte wenden Sie sich an den Kundendienst)3", (byte) -57);

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field2474 = 0;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field2472;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "I")
    public static int field2476;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "Lof;")
    public static class103 field2479;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(B)V")
    public static void method796(byte arg0) {
        if (arg0 < 34) {
            return;
        }
        field2475 = null;
        field2479 = null;
        field2477 = null;
        field2473 = null;
        field2478 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;I)V")
    public static final void method797(Component arg0, int arg1) {
        field2472++;
        Method var2 = class26.field622;
        if (var2 != null) {
            try {
                var2.invoke(arg0, Boolean.FALSE);
            } catch (Throwable var3) {
            }
        }
        if (arg1 != 15129) {
            field2476 = 109;
        }
        arg0.addKeyListener(class133.field3041);
        arg0.addFocusListener(class133.field3041);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)I")
    public abstract int method697(int arg0);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BLjava/awt/Component;)V")
    public abstract void method695(byte arg0, Component arg1);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Ljava/awt/Component;B)V")
    public abstract void method696(Component arg0, byte arg1);
}
