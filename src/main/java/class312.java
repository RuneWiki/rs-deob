import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class312 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "Lcc;")
    public static class327 field4584 = new class327(64);

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field4586 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "I")
    public static int field4589 = 0;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field4580;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field4581;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "I")
    public static int field4583;

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "I")
    public static int field4585;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "I")
    public static int field4588;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "Luj;")
    public static class158 field4590;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "[I")
    public static int[] field4582;

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "[I")
    public static int[] field4587;

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(I)V", line = 7)
    public static void method2166(int arg0) {
        int var1 = 100 % ((arg0 + 66) / 44);
        field4582 = null;
        field4587 = null;
        field4586 = null;
        field4590 = null;
        field4584 = null;
    }

    @OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 19)
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class35.field427 != null) {
            class291.field4234 = -1;
        }
        field4585++;
    }

    @OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 36)
    public final void keyTyped(KeyEvent arg0) {
        field4580++;
        if (class35.field427 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != '\u0000' && var2 != '\uFFFF' && class222.method1620(var2, -1)) {
                int var3 = class242.field3513 + 1 & 0x7F;
                if (class104.field1359 != var3) {
                    class198.field2770[class242.field3513] = -1;
                    class48.field648[class242.field3513] = var2;
                    class242.field3513 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 67)
    public final void focusGained(FocusEvent arg0) {
        field4581++;
    }

    @OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 75)
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class35.field427 != null) {
            class137.field1871 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class296.field4295.length) {
                var3 = class296.field4295[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class291.field4234 >= 0 && var3 >= 0) {
                class305.field4456[class291.field4234] = var3;
                class291.field4234 = class291.field4234 + 1 & 0x7F;
                if (class75.field990 == class291.field4234) {
                    class291.field4234 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class242.field3513 + 1 & 0x7F;
                if (class104.field1359 != var4) {
                    class198.field2770[class242.field3513] = var3;
                    class48.field648[class242.field3513] = '\u0000';
                    class242.field3513 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field4583++;
    }

    @OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 133)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field4588++;
        if (class35.field427 != null) {
            class137.field1871 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class296.field4295.length) {
                var3 = class296.field4295[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class291.field4234 >= 0 && var3 >= 0) {
                class305.field4456[class291.field4234] = ~var3;
                class291.field4234 = class291.field4234 + 1 & 0x7F;
                if (class75.field990 == class291.field4234) {
                    class291.field4234 = -1;
                }
            }
        }
        arg0.consume();
    }
}
