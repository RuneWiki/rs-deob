package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dh")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dh.f")
    public static class106 field1742 = new class106();

    @ObfuscatedName("dh.cr")
    public static boolean[] field1735 = new boolean[112];

    @ObfuscatedName("dh.cp")
    public static int[] field1736 = new int[128];

    @ObfuscatedName("dh.ch")
    public static int field1737 = 0;

    @ObfuscatedName("dh.ca")
    public static int field1744 = 0;

    @ObfuscatedName("dh.cc")
    public static char[] field1739 = new char[128];

    @ObfuscatedName("dh.cq")
    public static int[] field1740 = new int[128];

    @ObfuscatedName("dh.cm")
    public static int[] field1741 = new int[128];

    @ObfuscatedName("dh.ct")
    public static int field1746 = 0;

    @ObfuscatedName("dh.cb")
    public static int field1743 = 0;

    @ObfuscatedName("dh.cz")
    public static int field1738 = 0;

    @ObfuscatedName("dh.cu")
    public static int field1727 = 0;

    @ObfuscatedName("dh.cy")
    public static volatile int field1747 = 0;

    @ObfuscatedName("dh.cj")
    public static int[] field1725 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("j.f(S)V")
    public static void method140() {
        if (Statics.field1701.toLowerCase().indexOf("microsoft") != -1) {
            field1725[186] = 57;
            field1725[187] = 27;
            field1725[188] = 71;
            field1725[189] = 26;
            field1725[190] = 72;
            field1725[191] = 73;
            field1725[192] = 58;
            field1725[219] = 42;
            field1725[220] = 74;
            field1725[221] = 43;
            field1725[222] = 59;
            field1725[223] = 28;
            return;
        }
        field1725[44] = 71;
        field1725[45] = 26;
        field1725[46] = 72;
        field1725[47] = 73;
        field1725[59] = 57;
        field1725[61] = 27;
        field1725[91] = 42;
        field1725[92] = 74;
        field1725[93] = 43;
        field1725[192] = 28;
        field1725[222] = 58;
        field1725[520] = 59;
    }

    @ObfuscatedName("ax.i(Ljava/awt/Component;B)V")
    public static void method711(Component arg0) {
        arg0.removeKeyListener(field1742);
        arg0.removeFocusListener(field1742);
        field1744 = -1;
    }

    @ObfuscatedName("bt.u(B)Z")
    public static final boolean method1404() {
        class106 var0 = field1742;
        synchronized (field1742) {
            if (field1743 == field1727) {
                return false;
            } else {
                Statics.field3085 = field1740[field1743];
                Statics.field811 = field1739[field1743];
                field1743 = field1743 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("z.r(B)I")
    public static int method176() {
        return field1747;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1742 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1725.length) {
            var3 = field1725[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1744 >= 0 && var3 >= 0) {
            field1736[field1744] = var3;
            field1744 = field1744 + 1 & 0x7F;
            if (field1744 == field1737) {
                field1744 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1738 + 1 & 0x7F;
            if (field1743 != var4) {
                field1740[field1738] = var3;
                field1739[field1738] = 0;
                field1738 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1742 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1725.length) {
                var3 = field1725[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1744 >= 0 && var3 >= 0) {
                field1736[field1744] = ~var3;
                field1744 = field1744 + 1 & 0x7F;
                if (field1744 == field1737) {
                    field1744 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1742 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class204.method744(var2)) {
                int var3 = field1738 + 1 & 0x7F;
                if (field1743 != var3) {
                    field1740[field1738] = -1;
                    field1739[field1738] = var2;
                    field1738 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1742 != null) {
            field1744 = -1;
        }
    }
}
