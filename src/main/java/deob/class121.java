package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dr")
public final class class121 implements KeyListener, FocusListener {

    @ObfuscatedName("dr.z")
    public static class121 field1933 = new class121();

    @ObfuscatedName("dr.ch")
    public static boolean[] field1947 = new boolean[112];

    @ObfuscatedName("dr.cv")
    public static int[] field1949 = new int[128];

    @ObfuscatedName("dr.cb")
    public static int field1942 = 0;

    @ObfuscatedName("dr.cw")
    public static int field1950 = 0;

    @ObfuscatedName("dr.cr")
    public static char[] field1951 = new char[128];

    @ObfuscatedName("dr.cx")
    public static int[] field1952 = new int[128];

    @ObfuscatedName("dr.cp")
    public static int[] field1943 = new int[128];

    @ObfuscatedName("dr.cn")
    public static int field1954 = 0;

    @ObfuscatedName("dr.cy")
    public static int field1955 = 0;

    @ObfuscatedName("dr.cq")
    public static int field1956 = 0;

    @ObfuscatedName("dr.cg")
    public static int field1957 = 0;

    @ObfuscatedName("dr.ct")
    public static volatile int field1934 = 0;

    @ObfuscatedName("dr.cu")
    public static int[] field1948 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("n.z(S)V")
    public static void method14() {
        if (Statics.field1925.toLowerCase().indexOf("microsoft") != -1) {
            field1948[186] = 57;
            field1948[187] = 27;
            field1948[188] = 71;
            field1948[189] = 26;
            field1948[190] = 72;
            field1948[191] = 73;
            field1948[192] = 58;
            field1948[219] = 42;
            field1948[220] = 74;
            field1948[221] = 43;
            field1948[222] = 59;
            field1948[223] = 28;
            return;
        }
        field1948[44] = 71;
        field1948[45] = 26;
        field1948[46] = 72;
        field1948[47] = 73;
        field1948[59] = 57;
        field1948[61] = 27;
        field1948[91] = 42;
        field1948[92] = 74;
        field1948[93] = 43;
        field1948[192] = 28;
        field1948[222] = 58;
        field1948[520] = 59;
    }

    @ObfuscatedName("az.n(Ljava/awt/Component;B)V")
    public static void method892(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1933);
        arg0.addFocusListener(field1933);
    }

    @ObfuscatedName("q.u(Ljava/awt/Component;B)V")
    public static void method520(Component arg0) {
        arg0.removeKeyListener(field1933);
        arg0.removeFocusListener(field1933);
        field1950 = -1;
    }

    @ObfuscatedName("z.t(B)V")
    public static void method3() {
        class121 var0 = field1933;
        synchronized (field1933) {
            field1934++;
            field1955 = field1957;
            field1954 = 0;
            if (field1950 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1947[var1] = false;
                }
                field1950 = field1942;
            } else {
                while (field1950 != field1942) {
                    int var2 = field1949[field1942];
                    field1942 = field1942 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1947[~var2] = false;
                    } else {
                        if (!field1947[var2] && field1954 < field1943.length - 1) {
                            field1943[++field1954 - 1] = var2;
                        }
                        field1947[var2] = true;
                    }
                }
            }
            field1957 = field1956;
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1933 == null) {
            return;
        }
        field1934 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1948.length) {
            var3 = field1948[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1950 >= 0 && var3 >= 0) {
            field1949[field1950] = var3;
            field1950 = field1950 + 1 & 0x7F;
            if (field1950 == field1942) {
                field1950 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1956 + 1 & 0x7F;
            if (field1955 != var4) {
                field1952[field1956] = var3;
                field1951[field1956] = 0;
                field1956 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1933 != null) {
            field1934 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1948.length) {
                var3 = field1948[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1950 >= 0 && var3 >= 0) {
                field1949[field1950] = ~var3;
                field1950 = field1950 + 1 & 0x7F;
                if (field1950 == field1942) {
                    field1950 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1933 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class191.method523(var2)) {
                int var3 = field1956 + 1 & 0x7F;
                if (field1955 != var3) {
                    field1952[field1956] = -1;
                    field1951[field1956] = var2;
                    field1956 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1933 != null) {
            field1950 = -1;
        }
    }
}
