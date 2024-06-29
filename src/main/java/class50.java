import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class50 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!in", name = "a", descriptor = "Ljava/lang/String;")
    public static String field571 = "M";

    @OriginalMember(owner = "client!in", name = "f", descriptor = "[I")
    public static int[] field576 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!in", name = "i", descriptor = "I")
    public static int field579 = 0;

    @OriginalMember(owner = "client!in", name = "m", descriptor = "Ljava/lang/String;")
    public static String field583 = "Allocating memory";

    @OriginalMember(owner = "client!in", name = "b", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!in", name = "c", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!in", name = "d", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!in", name = "e", descriptor = "I")
    public static int field575;

    @OriginalMember(owner = "client!in", name = "g", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!in", name = "h", descriptor = "I")
    public static int field578;

    @OriginalMember(owner = "client!in", name = "j", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!in", name = "k", descriptor = "I")
    public static int field581;

    @OriginalMember(owner = "client!in", name = "l", descriptor = "I")
    public static int field582;

    @OriginalMember(owner = "client!in", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field581++;
        if (class406.field5896 == null) {
            return;
        }
        class96.field1077 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class402.field5836.length > var2) {
            var3 = class402.field5836[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class444.field6490 >= 0 && var3 >= 0) {
            class277.field3902[class444.field6490] = var3;
            class444.field6490 = class444.field6490 + 1 & 0x7F;
            if (class444.field6490 == class437.field6411) {
                class444.field6490 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class382.field5612 + 1 & 0x7F;
            if (class115.field1348 != var4) {
                class384.field5624[class382.field5612] = var3;
                class261.field3607[class382.field5612] = '\u0000';
                class382.field5612 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!in", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field580++;
        if (class406.field5896 != null) {
            class444.field6490 = -1;
        }
    }

    @OriginalMember(owner = "client!in", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field578++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(I)V")
    public static final void method303(int arg0) {
        class300.field4272.method2043(-107);
        if (arg0 == 6791) {
            field577++;
        }
    }

    @OriginalMember(owner = "client!in", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class406.field5896 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class179.method1169(0, var2)) {
                int var3 = class382.field5612 + 1 & 0x7F;
                if (class115.field1348 != var3) {
                    class384.field5624[class382.field5612] = -1;
                    class261.field3607[class382.field5612] = var2;
                    class382.field5612 = var3;
                }
            }
        }
        field573++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!in", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        field572++;
        if (class406.field5896 != null) {
            class96.field1077 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class402.field5836.length) {
                var3 = class402.field5836[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class444.field6490 >= 0 && var3 >= 0) {
                class277.field3902[class444.field6490] = ~var3;
                class444.field6490 = class444.field6490 + 1 & 0x7F;
                if (class444.field6490 == class437.field6411) {
                    class444.field6490 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!in", name = "b", descriptor = "(I)V")
    public static void method304(int arg0) {
        field583 = null;
        if (arg0 <= 35) {
            field579 = 75;
        }
        field571 = null;
        field576 = null;
    }
}
