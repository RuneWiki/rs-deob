import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class118 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!ra", name = "f", descriptor = "Lja;")
    public static class62 field2688 = class30.method243(43, "hitmarks");

    @OriginalMember(owner = "client!ra", name = "n", descriptor = "[Lja;")
    public static class62[] field2696 = new class62[100];

    @OriginalMember(owner = "client!ra", name = "j", descriptor = "Lja;")
    private static class62 field2692 = class30.method243(43, "wave2:");

    @OriginalMember(owner = "client!ra", name = "g", descriptor = "Lja;")
    public static class62 field2689 = field2692;

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "Lja;")
    public static class62 field2683 = field2692;

    @OriginalMember(owner = "client!ra", name = "o", descriptor = "Lja;")
    public static class62 field2697 = class30.method243(43, "(U4");

    @OriginalMember(owner = "client!ra", name = "q", descriptor = "Lja;")
    public static class62 field2699 = class30.method243(43, "Der Server wird gerade aktualisiert)3");

    @OriginalMember(owner = "client!ra", name = "b", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!ra", name = "d", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!ra", name = "h", descriptor = "I")
    public static int field2690;

    @OriginalMember(owner = "client!ra", name = "i", descriptor = "I")
    public static int field2691;

    @OriginalMember(owner = "client!ra", name = "k", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!ra", name = "l", descriptor = "I")
    public static int field2694;

    @OriginalMember(owner = "client!ra", name = "m", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!ra", name = "p", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!ra", name = "r", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!ra", name = "c", descriptor = "Lpd;")
    public static class108 field2685;

    @OriginalMember(owner = "client!ra", name = "e", descriptor = "Lhe;")
    public static class54 field2687;

    @OriginalMember(owner = "client!ra", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field2700++;
        int var2 = class90.method706(256, arg0);
        if (var2 >= 0) {
            int var3 = class34.field815 + 1 & 0x7F;
            if (class84.field2031 != var3) {
                class119.field2701[class34.field815] = -1;
                class54.field1252[class34.field815] = var2;
                class34.field815 = var3;
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!ra", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class13.field315 != null) {
            class111.field2530 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class32.field789.length) {
                var3 = class32.field789[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class153.field3570 >= 0 && var3 >= 0) {
                class1.field17[class153.field3570] = ~var3;
                class153.field3570 = class153.field3570 + 1 & 0x7F;
                if (class153.field3570 == class10.field258) {
                    class153.field3570 = -1;
                }
            }
        }
        arg0.consume();
        field2694++;
    }

    @OriginalMember(owner = "client!ra", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class13.field315 != null) {
            class153.field3570 = -1;
        }
        field2691++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(B)V")
    public static final void method945(byte arg0) {
        if (arg0 != 116) {
            field2692 = null;
        }
        field2684++;
        class119.field2706.method127((byte) -113);
    }

    @OriginalMember(owner = "client!ra", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field2690++;
        if (class13.field315 == null) {
            return;
        }
        class111.field2530 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class32.field789.length) {
            var3 = class32.field789[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class153.field3570 >= 0 && var3 >= 0) {
            class1.field17[class153.field3570] = var3;
            class153.field3570 = class153.field3570 + 1 & 0x7F;
            if (class153.field3570 == class10.field258) {
                class153.field3570 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class34.field815 + 1 & 0x7F;
            if (class84.field2031 != var4) {
                class119.field2701[class34.field815] = var3;
                class54.field1252[class34.field815] = -1;
                class34.field815 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(I)V")
    public static void method946(int arg0) {
        field2692 = null;
        field2683 = null;
        field2699 = null;
        field2697 = null;
        field2689 = null;
        field2687 = null;
        field2696 = null;
        field2685 = null;
        field2688 = null;
        if (arg0 != 0) {
            field2697 = null;
        }
    }

    @OriginalMember(owner = "client!ra", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field2695++;
    }

    @OriginalMember(owner = "client!ra", name = "a", descriptor = "(IB)Z")
    public static final boolean method947(int arg0, byte arg1) {
        field2693++;
        if (arg1 >= -67) {
            return false;
        } else {
            return arg0 >= 48 && arg0 <= 57;
        }
    }
}
