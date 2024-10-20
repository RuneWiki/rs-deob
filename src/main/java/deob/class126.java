package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dj")
public final class class126 implements KeyListener, FocusListener {

    @ObfuscatedName("dj.c")
    public static class126 field1967 = new class126();

    @ObfuscatedName("dj.cs")
    public static boolean[] field1957 = new boolean[112];

    @ObfuscatedName("dj.cq")
    public static int[] field1958 = new int[128];

    @ObfuscatedName("dj.co")
    public static int field1959 = 0;

    @ObfuscatedName("dj.cw")
    public static int field1952 = 0;

    @ObfuscatedName("dj.cf")
    public static char[] field1948 = new char[128];

    @ObfuscatedName("dj.ce")
    public static int[] field1969 = new int[128];

    @ObfuscatedName("dj.ch")
    public static int[] field1950 = new int[128];

    @ObfuscatedName("dj.cy")
    public static int field1964 = 0;

    @ObfuscatedName("dj.cr")
    public static int field1965 = 0;

    @ObfuscatedName("dj.cc")
    public static int field1961 = 0;

    @ObfuscatedName("dj.cl")
    public static int field1966 = 0;

    @ObfuscatedName("dj.cp")
    public static volatile int field1968 = 0;

    @ObfuscatedName("dj.cn")
    public static int[] field1954 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ad.c(Ljava/awt/Component;I)V")
    public static void method698(Component arg0) {
        arg0.removeKeyListener(field1967);
        arg0.removeFocusListener(field1967);
        field1952 = -1;
    }

    @ObfuscatedName("dn.j(I)V")
    public static void method2450() {
        class126 var0 = field1967;
        synchronized (field1967) {
            field1968++;
            field1965 = field1966;
            field1964 = 0;
            if (field1952 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1957[var1] = false;
                }
                field1952 = field1959;
            } else {
                while (field1959 != field1952) {
                    int var2 = field1958[field1959];
                    field1959 = field1959 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1957[~var2] = false;
                    } else {
                        if (!field1957[var2] && field1964 < field1950.length - 1) {
                            field1950[++field1964 - 1] = var2;
                        }
                        field1957[var2] = true;
                    }
                }
            }
            field1966 = field1961;
        }
    }

    @ObfuscatedName("dm.y(I)Z")
    public static final boolean method2412() {
        class126 var0 = field1967;
        synchronized (field1967) {
            if (field1966 == field1965) {
                return false;
            } else {
                Statics.field1266 = field1969[field1965];
                Statics.field75 = field1948[field1965];
                field1965 = field1965 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("k.r(I)I")
    public static int method82() {
        return field1968;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1967 == null) {
            return;
        }
        field1968 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1954.length) {
            var3 = field1954[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1952 >= 0 && var3 >= 0) {
            field1958[field1952] = var3;
            field1952 = field1952 + 1 & 0x7F;
            if (field1959 == field1952) {
                field1952 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1961 + 1 & 0x7F;
            if (field1965 != var4) {
                field1969[field1961] = var3;
                field1948[field1961] = 0;
                field1961 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1967 != null) {
            field1968 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1954.length) {
                var3 = field1954[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1952 >= 0 && var3 >= 0) {
                field1958[field1952] = ~var3;
                field1952 = field1952 + 1 & 0x7F;
                if (field1959 == field1952) {
                    field1952 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1967 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class213.method2991(var2)) {
                int var3 = field1961 + 1 & 0x7F;
                if (field1965 != var3) {
                    field1969[field1961] = -1;
                    field1948[field1961] = var2;
                    field1961 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1967 != null) {
            field1952 = -1;
        }
    }
}
