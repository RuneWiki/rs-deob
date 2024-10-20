package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("do")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("do.y")
    public static class129 field2030 = new class129();

    @ObfuscatedName("do.cs")
    public static boolean[] field2027 = new boolean[112];

    @ObfuscatedName("do.cn")
    public static int[] field2034 = new int[128];

    @ObfuscatedName("do.cb")
    public static int field2044 = 0;

    @ObfuscatedName("do.cl")
    public static int field2019 = 0;

    @ObfuscatedName("do.cw")
    public static char[] field2037 = new char[128];

    @ObfuscatedName("do.cz")
    public static int[] field2028 = new int[128];

    @ObfuscatedName("do.cc")
    public static int[] field2035 = new int[128];

    @ObfuscatedName("do.cq")
    public static int field2040 = 0;

    @ObfuscatedName("do.cx")
    public static int field2041 = 0;

    @ObfuscatedName("do.co")
    public static int field2020 = 0;

    @ObfuscatedName("do.ci")
    public static int field2036 = 0;

    @ObfuscatedName("do.ch")
    public static volatile int field2038 = 0;

    @ObfuscatedName("do.ca")
    public static int[] field2045 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("as.y(I)V")
    public static void method677() {
        if (Statics.field2018.toLowerCase().indexOf("microsoft") != -1) {
            field2045[186] = 57;
            field2045[187] = 27;
            field2045[188] = 71;
            field2045[189] = 26;
            field2045[190] = 72;
            field2045[191] = 73;
            field2045[192] = 58;
            field2045[219] = 42;
            field2045[220] = 74;
            field2045[221] = 43;
            field2045[222] = 59;
            field2045[223] = 28;
            return;
        }
        field2045[44] = 71;
        field2045[45] = 26;
        field2045[46] = 72;
        field2045[47] = 73;
        field2045[59] = 57;
        field2045[61] = 27;
        field2045[91] = 42;
        field2045[92] = 74;
        field2045[93] = 43;
        field2045[192] = 28;
        field2045[222] = 58;
        field2045[520] = 59;
    }

    @ObfuscatedName("i.k(Ljava/awt/Component;I)V")
    public static void method129(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2030);
        arg0.addFocusListener(field2030);
    }

    @ObfuscatedName("dt.g(Ljava/awt/Component;I)V")
    public static void method2456(Component arg0) {
        arg0.removeKeyListener(field2030);
        arg0.removeFocusListener(field2030);
        field2019 = -1;
    }

    @ObfuscatedName("s.n(I)V")
    public static void method145() {
        if (field2030 != null) {
            class129 var0 = field2030;
            synchronized (field2030) {
                field2030 = null;
            }
        }
    }

    @ObfuscatedName("al.t(I)Z")
    public static final boolean method862() {
        class129 var0 = field2030;
        synchronized (field2030) {
            if (field2041 == field2036) {
                return false;
            } else {
                Statics.field1471 = field2028[field2041];
                Statics.field2033 = field2037[field2041];
                field2041 = field2041 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cd.e(I)I")
    public static int method1799() {
        return field2038;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2030 == null) {
            return;
        }
        field2038 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2045.length) {
            var3 = field2045[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2019 >= 0 && var3 >= 0) {
            field2034[field2019] = var3;
            field2019 = field2019 + 1 & 0x7F;
            if (field2044 == field2019) {
                field2019 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2020 + 1 & 0x7F;
            if (field2041 != var4) {
                field2028[field2020] = var3;
                field2037[field2020] = 0;
                field2020 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2030 != null) {
            field2038 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2045.length) {
                var3 = field2045[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2019 >= 0 && var3 >= 0) {
                field2034[field2019] = ~var3;
                field2019 = field2019 + 1 & 0x7F;
                if (field2044 == field2019) {
                    field2019 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2030 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class156.method2865(var2)) {
                int var3 = field2020 + 1 & 0x7F;
                if (field2041 != var3) {
                    field2028[field2020] = -1;
                    field2037[field2020] = var2;
                    field2020 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2030 != null) {
            field2019 = -1;
        }
    }
}
