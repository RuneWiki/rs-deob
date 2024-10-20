package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("be")
public final class class132 implements KeyListener, FocusListener {

    @ObfuscatedName("be.v")
    public static class132 field1964 = new class132();

    @ObfuscatedName("be.ca")
    public static int[] field1960 = new int[128];

    @ObfuscatedName("be.cy")
    public static int field1974 = 0;

    @ObfuscatedName("be.cx")
    public static int field1975 = 0;

    @ObfuscatedName("be.cw")
    public static int[] field1971 = new int[128];

    @ObfuscatedName("be.cq")
    public static int field1967 = 0;

    @ObfuscatedName("be.cr")
    public static char[] field1969 = new char[128];

    @ObfuscatedName("be.cp")
    public static int field1977 = 0;

    @ObfuscatedName("be.cm")
    public static int field1972 = 0;

    @ObfuscatedName("be.cn")
    public static boolean[] field1965 = new boolean[112];

    @ObfuscatedName("be.cl")
    public static int[] field1973 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("be.ci")
    public static int field1968 = 0;

    @ObfuscatedName("be.ce")
    public static volatile int field1976 = 0;

    @ObfuscatedName("be.cc")
    public static int[] field1966 = new int[128];

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1964 == null) {
            return;
        }
        field1976 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1973.length) {
            var3 = field1973[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1968 >= 0 && var3 >= 0) {
            field1966[field1968] = var3;
            field1968 = field1968 + 1 & 0x7F;
            if (field1968 == field1967) {
                field1968 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1974 + 1 & 0x7F;
            if (field1977 != var4) {
                field1960[field1974] = var3;
                field1969[field1974] = 0;
                field1974 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1964 != null) {
            field1976 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1973.length) {
                var3 = field1973[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1968 >= 0 && var3 >= 0) {
                field1966[field1968] = ~var3;
                field1968 = field1968 + 1 & 0x7F;
                if (field1968 == field1967) {
                    field1968 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1964 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class98.method1957(var2)) {
                int var3 = field1974 + 1 & 0x7F;
                if (field1977 != var3) {
                    field1960[field1974] = -1;
                    field1969[field1974] = var2;
                    field1974 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1964 != null) {
            field1968 = -1;
        }
    }

    @ObfuscatedName("be.i(I)I")
    public static int method2272() {
        return field1976;
    }

    @ObfuscatedName("p.b(I)Z")
    public static final boolean method1398() {
        class132 var0 = field1964;
        synchronized (field1964) {
            if (field1977 == field1975) {
                return false;
            } else {
                Statics.field2655 = field1960[field1977];
                Statics.field2557 = field1969[field1977];
                field1977 = field1977 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("aw.c(I)V")
    public static void method3037() {
        class132 var0 = field1964;
        synchronized (field1964) {
            field1976++;
            field1977 = field1975;
            field1972 = 0;
            if (field1968 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1965[var1] = false;
                }
                field1968 = field1967;
            } else {
                while (field1968 != field1967) {
                    int var2 = field1966[field1967];
                    field1967 = field1967 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1965[~var2] = false;
                    } else {
                        if (!field1965[var2] && field1972 < field1971.length - 1) {
                            field1971[++field1972 - 1] = var2;
                        }
                        field1965[var2] = true;
                    }
                }
            }
            field1975 = field1974;
        }
    }
}
