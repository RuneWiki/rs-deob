import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class297 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!af", name = "j", descriptor = "I")
    public static int field4862 = 0;

    @OriginalMember(owner = "client!af", name = "i", descriptor = "I")
    public static int field4861 = 0;

    @OriginalMember(owner = "client!af", name = "h", descriptor = "I")
    public static int field4860 = -1;

    @OriginalMember(owner = "client!af", name = "a", descriptor = "I")
    public static int field4853;

    @OriginalMember(owner = "client!af", name = "b", descriptor = "I")
    public static int field4854;

    @OriginalMember(owner = "client!af", name = "c", descriptor = "I")
    public static int field4855;

    @OriginalMember(owner = "client!af", name = "d", descriptor = "I")
    public static int field4856;

    @OriginalMember(owner = "client!af", name = "e", descriptor = "I")
    public static int field4857;

    @OriginalMember(owner = "client!af", name = "f", descriptor = "I")
    public static int field4858;

    @OriginalMember(owner = "client!af", name = "g", descriptor = "[I")
    public static int[] field4859;

    @OriginalMember(owner = "client!af", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field4853++;
        if (class32.field523 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class101.method719(-124, var2)) {
                int var3 = class228.field3852 + 1 & 0x7F;
                if (class36.field561 != var3) {
                    class36.field575[class228.field3852] = -1;
                    class293.field4810[class228.field3852] = var2;
                    class228.field3852 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!af", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class32.field523 != null) {
            class90.field1488 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class249.field4224.length) {
                var3 = class249.field4224[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class23.field424 >= 0 && var3 >= 0) {
                class240.field4052[class23.field424] = var3;
                class23.field424 = class23.field424 + 1 & 0x7F;
                if (class32.field529 == class23.field424) {
                    class23.field424 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class228.field3852 + 1 & 0x7F;
                if (class36.field561 != var4) {
                    class36.field575[class228.field3852] = var3;
                    class293.field4810[class228.field3852] = '\u0000';
                    class228.field3852 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4855++;
    }

    @OriginalMember(owner = "client!af", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field4856++;
        if (class32.field523 != null) {
            class23.field424 = -1;
        }
    }

    @OriginalMember(owner = "client!af", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field4857++;
    }

    @OriginalMember(owner = "client!af", name = "a", descriptor = "(I)V")
    public static void method2042(int arg0) {
        field4859 = null;
        if (arg0 > -21) {
            method2042(-100);
        }
    }

    @OriginalMember(owner = "client!af", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class32.field523 != null) {
            class90.field1488 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class249.field4224.length > var2) {
                var3 = class249.field4224[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class23.field424 >= 0 && var3 >= 0) {
                class240.field4052[class23.field424] = ~var3;
                class23.field424 = class23.field424 + 1 & 0x7F;
                if (class32.field529 == class23.field424) {
                    class23.field424 = -1;
                }
            }
        }
        field4858++;
        arg0.consume();
    }
}
