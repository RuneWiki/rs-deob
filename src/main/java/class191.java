import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tb")
public class class191 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!tb", name = "h", descriptor = "B")
    public static byte field3689 = 0;

    @OriginalMember(owner = "client!tb", name = "j", descriptor = "Lob;")
    private static class141 field3691 = class175.method1195(40, "Please remove ");

    @OriginalMember(owner = "client!tb", name = "f", descriptor = "Lob;")
    public static class141 field3687 = field3691;

    @OriginalMember(owner = "client!tb", name = "k", descriptor = "I")
    public static int field3692 = 0;

    @OriginalMember(owner = "client!tb", name = "c", descriptor = "Lob;")
    public static class141 field3684 = field3691;

    @OriginalMember(owner = "client!tb", name = "i", descriptor = "Lob;")
    public static class141 field3690 = class175.method1195(40, "::errortest");

    @OriginalMember(owner = "client!tb", name = "p", descriptor = "Lob;")
    public static class141 field3697 = class175.method1195(40, "b12_full");

    @OriginalMember(owner = "client!tb", name = "q", descriptor = "Lob;")
    public static class141 field3698 = class175.method1195(40, "http:)4)4");

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "I")
    public static int field3682;

    @OriginalMember(owner = "client!tb", name = "b", descriptor = "I")
    public static int field3683;

    @OriginalMember(owner = "client!tb", name = "e", descriptor = "I")
    public static int field3686;

    @OriginalMember(owner = "client!tb", name = "g", descriptor = "I")
    public static int field3688;

    @OriginalMember(owner = "client!tb", name = "n", descriptor = "I")
    public static int field3695;

    @OriginalMember(owner = "client!tb", name = "o", descriptor = "I")
    public static int field3696;

    @OriginalMember(owner = "client!tb", name = "l", descriptor = "Lra;")
    public static class170 field3693;

    @OriginalMember(owner = "client!tb", name = "d", descriptor = "Z")
    public static boolean field3685;

    @OriginalMember(owner = "client!tb", name = "m", descriptor = "[[[B")
    public static byte[][][] field3694;

    @OriginalMember(owner = "client!tb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field3682++;
        if (class150.field2889 != null) {
            class165.field3204 = -1;
        }
    }

    @OriginalMember(owner = "client!tb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field3695++;
    }

    @OriginalMember(owner = "client!tb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class150.field2889 != null) {
            class70.field1407 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class119.field2317.length > var2) {
                var3 = class119.field2317[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class165.field3204 >= 0 && var3 >= 0) {
                class181.field3572[class165.field3204] = ~var3;
                class165.field3204 = class165.field3204 + 1 & 0x7F;
                if (class165.field3204 == class106.field2034) {
                    class165.field3204 = -1;
                }
            }
        }
        field3686++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!tb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class150.field2889 != null) {
            class70.field1407 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class119.field2317.length > var2) {
                var3 = class119.field2317[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class165.field3204 >= 0 && var3 >= 0) {
                class181.field3572[class165.field3204] = var3;
                class165.field3204 = class165.field3204 + 1 & 0x7F;
                if (class165.field3204 == class106.field2034) {
                    class165.field3204 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class150.field2896 + 1 & 0x7F;
                if (class132.field2513 != var4) {
                    class46.field887[class150.field2896] = var3;
                    class17.field309[class150.field2896] = -1;
                    class150.field2896 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field3688++;
    }

    @OriginalMember(owner = "client!tb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field3696++;
        if (class150.field2889 != null) {
            int var2 = class215.method1402(110, arg0);
            if (var2 >= 0) {
                int var3 = class150.field2896 + 1 & 0x7F;
                if (class132.field2513 != var3) {
                    class46.field887[class150.field2896] = -1;
                    class17.field309[class150.field2896] = var2;
                    class150.field2896 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!tb", name = "a", descriptor = "(B)V")
    public static void method1265(byte arg0) {
        field3691 = null;
        if (arg0 <= 2) {
            field3698 = null;
        }
        field3690 = null;
        field3694 = null;
        field3687 = null;
        field3697 = null;
        field3693 = null;
        field3698 = null;
        field3684 = null;
    }
}
