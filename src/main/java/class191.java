import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class191 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[Lmk;")
    public static class213[] field3129 = new class213[2048];

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "Lbl;")
    public static class138 field3132 = new class138();

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field3124;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field3125;

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "I")
    public static int field3126;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field3128;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field3130;

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "I")
    public static int field3131;

    @OriginalMember(owner = "client!rk", name = "j", descriptor = "I")
    public static int field3133;

    @OriginalMember(owner = "client!rk", name = "k", descriptor = "I")
    public static int field3134;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "[I")
    public static int[] field3127;

    @OriginalMember(owner = "client!rk", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3125++;
        if (class229.field3651 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class232.method1535((byte) -30, var2)) {
                int var3 = class249.field3972 + 1 & 0x7F;
                if (class77.field1286 != var3) {
                    class178.field2962[class249.field3972] = -1;
                    class150.field2465[class249.field3972] = var2;
                    class249.field3972 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Z)V")
    public static void method1315(boolean arg0) {
        if (!arg0) {
            field3132 = null;
        }
        field3127 = null;
        field3132 = null;
        field3129 = null;
    }

    @OriginalMember(owner = "client!rk", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field3128++;
        if (class229.field3651 == null) {
            return;
        }
        class6.field73 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && class91.field1442.length > var2) {
            var3 = class91.field1442[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class104.field1593 >= 0 && var3 >= 0) {
            class152.field2480[class104.field1593] = var3;
            class104.field1593 = class104.field1593 + 1 & 0x7F;
            if (class189.field3080 == class104.field1593) {
                class104.field1593 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class249.field3972 + 1 & 0x7F;
            if (class77.field1286 != var4) {
                class178.field2962[class249.field3972] = var3;
                class150.field2465[class249.field3972] = '\u0000';
                class249.field3972 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!rk", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class229.field3651 != null) {
            class6.field73 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class91.field1442.length > var2) {
                var3 = class91.field1442[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class104.field1593 >= 0 && var3 >= 0) {
                class152.field2480[class104.field1593] = ~var3;
                class104.field1593 = class104.field1593 + 1 & 0x7F;
                if (class189.field3080 == class104.field1593) {
                    class104.field1593 = -1;
                }
            }
        }
        field3134++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!rk", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3130++;
    }

    @OriginalMember(owner = "client!rk", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class229.field3651 != null) {
            class104.field1593 = -1;
        }
        field3126++;
    }
}
