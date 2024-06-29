import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class102 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!jj", name = "l", descriptor = "Ljd;")
    public static class85 field1819 = class221.method1499("Schlie-8en", (byte) -95);

    @OriginalMember(owner = "client!jj", name = "h", descriptor = "I")
    public static volatile int field1815 = 0;

    @OriginalMember(owner = "client!jj", name = "j", descriptor = "[I")
    public static int[] field1817 = new int[128];

    @OriginalMember(owner = "client!jj", name = "m", descriptor = "Ljd;")
    private static class85 field1820 = class221.method1499("glow3:", (byte) -109);

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "Ljd;")
    public static class85 field1809 = field1820;

    @OriginalMember(owner = "client!jj", name = "k", descriptor = "Ljd;")
    private static class85 field1818 = class221.method1499("wishes to trade with you)3", (byte) -58);

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Ljd;")
    public static class85 field1824 = class221.method1499("", (byte) 114);

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "Ljd;")
    public static class85 field1822 = class221.method1499("null", (byte) 101);

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "Ljd;")
    public static class85 field1808 = field1818;

    @OriginalMember(owner = "client!jj", name = "i", descriptor = "Ljd;")
    public static class85 field1816 = field1820;

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "Ljd;")
    public static class85 field1828 = class221.method1499("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", (byte) 90);

    @OriginalMember(owner = "client!jj", name = "c", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "I")
    public static int field1813;

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!jj", name = "n", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public static int field1823;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field1827;

    @OriginalMember(owner = "client!jj", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1827++;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII)V")
    public static final void method705(int arg0, int arg1, int arg2, int arg3) {
        field1814++;
        if (class85.field1565 == arg0 || arg3 == 0 || class127.field2229 >= 50 || arg1 == -1) {
            return;
        }
        class108.field1917[class127.field2229] = arg1;
        class59.field1071[class127.field2229] = arg3;
        class193.field3304[class127.field2229] = arg2;
        class40.field638[class127.field2229] = null;
        class167.field2871[class127.field2229] = 0;
        class127.field2229++;
    }

    @OriginalMember(owner = "client!jj", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        if (class79.field1450 != null) {
            class214.field3765 = -1;
        }
        field1813++;
    }

    @OriginalMember(owner = "client!jj", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        field1810++;
        if (class79.field1450 == null) {
            return;
        }
        class131.field2293 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < class203.field3533.length) {
            var3 = class203.field3533[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (class214.field3765 >= 0 && var3 >= 0) {
            field1817[class214.field3765] = var3;
            class214.field3765 = class214.field3765 + 1 & 0x7F;
            if (class214.field3765 == class181.field3097) {
                class214.field3765 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = class205.field3579 + 1 & 0x7F;
            if (class18.field263 != var4) {
                class153.field2656[class205.field3579] = var3;
                class117.field2100[class205.field3579] = -1;
                class205.field3579 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!jj", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        if (class79.field1450 != null) {
            int var2 = class124.method849(116, arg0);
            if (var2 >= 0) {
                int var3 = class205.field3579 + 1 & 0x7F;
                if (class18.field263 != var3) {
                    class153.field2656[class205.field3579] = -1;
                    class117.field2100[class205.field3579] = var2;
                    class205.field3579 = var3;
                }
            }
        }
        field1825++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(II)V")
    public static final void method706(int arg0, int arg1) {
        class150.field2537 = -1;
        class6.field75 = arg1;
        class147.field2496 = arg0;
        field1811++;
        class201.method1381(~arg0);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(I)V")
    public static void method707(int arg0) {
        field1822 = null;
        field1824 = null;
        field1820 = null;
        field1808 = null;
        field1817 = null;
        field1819 = null;
        field1809 = null;
        field1828 = null;
        field1818 = null;
        if (arg0 != -1) {
            field1824 = null;
        }
        field1816 = null;
    }

    @OriginalMember(owner = "client!jj", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class79.field1450 != null) {
            class131.field2293 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class203.field3533.length) {
                var3 = class203.field3533[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class214.field3765 >= 0 && var3 >= 0) {
                field1817[class214.field3765] = ~var3;
                class214.field3765 = class214.field3765 + 1 & 0x7F;
                if (class214.field3765 == class181.field3097) {
                    class214.field3765 = -1;
                }
            }
        }
        arg0.consume();
        field1821++;
    }
}
