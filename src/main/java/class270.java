import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ce")
public class class270 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "Ljava/lang/String;")
    public static String field4493 = "Your ignore list is full. Max of 100 users.";

    @OriginalMember(owner = "client!ce", name = "f", descriptor = "[Z")
    public static boolean[] field4498 = new boolean[100];

    @OriginalMember(owner = "client!ce", name = "b", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!ce", name = "c", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!ce", name = "d", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!ce", name = "e", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!ce", name = "g", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!ce", name = "h", descriptor = "I")
    public static int field4500;

    @OriginalMember(owner = "client!ce", name = "i", descriptor = "[Laj;")
    public static class209[] field4501;

    @OriginalMember(owner = "client!ce", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 5)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class52.field832 != null) {
            class208.field3263 = -1;
        }
        field4500++;
    }

    @OriginalMember(owner = "client!ce", name = "a", descriptor = "(B)V", line = 17)
    public static void method2033(byte arg0) {
        if (arg0 <= 123) {
            field4501 = (class209[]) null;
        }
        field4501 = null;
        field4498 = null;
        field4493 = null;
    }

    @OriginalMember(owner = "client!ce", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 30)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4497++;
        if (class52.field832 != null) {
            class210.field3341 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class342.field5459.length) {
                var3 = class342.field5459[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class208.field3263 >= 0 && var3 >= 0) {
                class156.field2472[class208.field3263] = ~var3;
                class208.field3263 = class208.field3263 + 1 & 0x7F;
                if (class98.field1622 == class208.field3263) {
                    class208.field3263 = -1;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ce", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 60)
    public final void keyTyped(KeyEvent arg0) {
        field4499++;
        if (class52.field832 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class257.method1969(-161, var2)) {
                int var3 = class223.field3701 + 1 & 0x7F;
                if (class101.field1660 != var3) {
                    class65.field1158[class223.field3701] = -1;
                    class344.field5471[class223.field3701] = var2;
                    class223.field3701 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ce", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 90)
    public final synchronized void keyPressed(KeyEvent arg0) {
        field4496++;
        if (class52.field832 == null) {
            return;
        }
        class210.field3341 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class342.field5459.length) {
            var3 = class342.field5459[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class208.field3263 >= 0 && var3 >= 0) {
            class156.field2472[class208.field3263] = var3;
            class208.field3263 = class208.field3263 + 1 & 0x7F;
            if (class98.field1622 == class208.field3263) {
                class208.field3263 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class223.field3701 + 1 & 0x7F;
            if (class101.field1660 != var4) {
                class65.field1158[class223.field3701] = var3;
                class344.field5471[class223.field3701] = '\u0000';
                class223.field3701 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ce", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 163)
    public final void focusGained(FocusEvent arg0) {
        field4494++;
    }
}
