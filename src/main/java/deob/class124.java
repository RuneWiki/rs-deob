package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dc")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dc.i")
    public static class124 field1951 = new class124();

    @ObfuscatedName("dc.ch")
    public static boolean[] field1947 = new boolean[112];

    @ObfuscatedName("dc.cu")
    public static int[] field1958 = new int[128];

    @ObfuscatedName("dc.cf")
    public static int field1959 = 0;

    @ObfuscatedName("dc.cj")
    public static int field1960 = 0;

    @ObfuscatedName("dc.cx")
    public static char[] field1961 = new char[128];

    @ObfuscatedName("dc.cz")
    public static int[] field1962 = new int[128];

    @ObfuscatedName("dc.cs")
    public static int[] field1970 = new int[128];

    @ObfuscatedName("dc.ci")
    public static int field1964 = 0;

    @ObfuscatedName("dc.cy")
    public static int field1941 = 0;

    @ObfuscatedName("dc.cc")
    public static int field1948 = 0;

    @ObfuscatedName("dc.cm")
    public static int field1967 = 0;

    @ObfuscatedName("dc.ce")
    public static volatile int field1965 = 0;

    @ObfuscatedName("dc.cn")
    public static int[] field1969 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("du.i(Ljava/awt/Component;I)V")
    public static void method2381(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1951);
        arg0.addFocusListener(field1951);
    }

    @ObfuscatedName("aq.c(I)V")
    public static void method794() {
        if (field1951 != null) {
            class124 var0 = field1951;
            synchronized (field1951) {
                field1951 = null;
            }
        }
    }

    @ObfuscatedName("cb.h(B)V")
    public static void method1793() {
        class124 var0 = field1951;
        synchronized (field1951) {
            field1965++;
            field1941 = field1967;
            field1964 = 0;
            if (field1960 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1947[var1] = false;
                }
                field1960 = field1959;
            } else {
                while (field1960 != field1959) {
                    int var2 = field1958[field1959];
                    field1959 = field1959 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1947[~var2] = false;
                    } else {
                        if (!field1947[var2] && field1964 < field1970.length - 1) {
                            field1970[++field1964 - 1] = var2;
                        }
                        field1947[var2] = true;
                    }
                }
            }
            field1967 = field1948;
        }
    }

    @ObfuscatedName("ak.v(B)Z")
    public static final boolean method708() {
        class124 var0 = field1951;
        synchronized (field1951) {
            if (field1967 == field1941) {
                return false;
            } else {
                Statics.field2409 = field1962[field1941];
                Statics.field1059 = field1961[field1941];
                field1941 = field1941 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1951 == null) {
            return;
        }
        field1965 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1969.length) {
            var3 = field1969[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1960 >= 0 && var3 >= 0) {
            field1958[field1960] = var3;
            field1960 = field1960 + 1 & 0x7F;
            if (field1960 == field1959) {
                field1960 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1948 + 1 & 0x7F;
            if (field1941 != var4) {
                field1962[field1948] = var3;
                field1961[field1948] = 0;
                field1948 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1951 != null) {
            field1965 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1969.length) {
                var3 = field1969[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1960 >= 0 && var3 >= 0) {
                field1958[field1960] = ~var3;
                field1960 = field1960 + 1 & 0x7F;
                if (field1960 == field1959) {
                    field1960 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1951 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class201.method2689(var2)) {
                int var3 = field1948 + 1 & 0x7F;
                if (field1941 != var3) {
                    field1962[field1948] = -1;
                    field1961[field1948] = var2;
                    field1948 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1951 != null) {
            field1960 = -1;
        }
    }
}
