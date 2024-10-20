package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("do")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("do.e")
    public static class124 field1980 = new class124();

    @ObfuscatedName("do.cq")
    public static boolean[] field1970 = new boolean[112];

    @ObfuscatedName("do.cj")
    public static int[] field1965 = new int[128];

    @ObfuscatedName("do.cx")
    public static int field1977 = 0;

    @ObfuscatedName("do.cc")
    public static int field1952 = 0;

    @ObfuscatedName("do.ck")
    public static char[] field1968 = new char[128];

    @ObfuscatedName("do.cl")
    public static int[] field1969 = new int[128];

    @ObfuscatedName("do.cs")
    public static int[] field1955 = new int[128];

    @ObfuscatedName("do.cg")
    public static int field1971 = 0;

    @ObfuscatedName("do.cn")
    public static int field1972 = 0;

    @ObfuscatedName("do.cd")
    public static int field1973 = 0;

    @ObfuscatedName("do.cb")
    public static int field1974 = 0;

    @ObfuscatedName("do.cz")
    public static volatile int field1975 = 0;

    @ObfuscatedName("do.cp")
    public static int[] field1967 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("er.e(Ljava/awt/Component;S)V")
    public static void method2813(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1980);
        arg0.addFocusListener(field1980);
    }

    @ObfuscatedName("dp.o(Ljava/awt/Component;I)V")
    public static void method2495(Component arg0) {
        arg0.removeKeyListener(field1980);
        arg0.removeFocusListener(field1980);
        field1952 = -1;
    }

    @ObfuscatedName("dm.y(I)V")
    public static void method2354() {
        class124 var0 = field1980;
        synchronized (field1980) {
            field1975++;
            field1972 = field1974;
            field1971 = 0;
            if (field1952 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1970[var1] = false;
                }
                field1952 = field1977;
            } else {
                while (field1977 != field1952) {
                    int var2 = field1965[field1977];
                    field1977 = field1977 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1970[~var2] = false;
                    } else {
                        if (!field1970[var2] && field1971 < field1955.length - 1) {
                            field1955[++field1971 - 1] = var2;
                        }
                        field1970[var2] = true;
                    }
                }
            }
            field1974 = field1973;
        }
    }

    @ObfuscatedName("dg.b(B)Z")
    public static final boolean method2339() {
        class124 var0 = field1980;
        synchronized (field1980) {
            if (field1974 == field1972) {
                return false;
            } else {
                Statics.field1812 = field1969[field1972];
                Statics.field2393 = field1968[field1972];
                field1972 = field1972 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1980 == null) {
            return;
        }
        field1975 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1967.length) {
            var3 = field1967[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1952 >= 0 && var3 >= 0) {
            field1965[field1952] = var3;
            field1952 = field1952 + 1 & 0x7F;
            if (field1977 == field1952) {
                field1952 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1973 + 1 & 0x7F;
            if (field1972 != var4) {
                field1969[field1973] = var3;
                field1968[field1973] = 0;
                field1973 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1980 != null) {
            field1975 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1967.length) {
                var3 = field1967[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1952 >= 0 && var3 >= 0) {
                field1965[field1952] = ~var3;
                field1952 = field1952 + 1 & 0x7F;
                if (field1977 == field1952) {
                    field1952 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1980 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class201.method487(var2)) {
                int var3 = field1973 + 1 & 0x7F;
                if (field1972 != var3) {
                    field1969[field1973] = -1;
                    field1968[field1973] = var2;
                    field1973 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1980 != null) {
            field1952 = -1;
        }
    }
}
