package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("du")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("du.e")
    public static class124 field1948 = new class124();

    @ObfuscatedName("du.ck")
    public static boolean[] field1958 = new boolean[112];

    @ObfuscatedName("du.ct")
    public static int[] field1959 = new int[128];

    @ObfuscatedName("du.cx")
    public static int field1968 = 0;

    @ObfuscatedName("du.cs")
    public static int field1965 = 0;

    @ObfuscatedName("du.cr")
    public static char[] field1953 = new char[128];

    @ObfuscatedName("du.ca")
    public static int[] field1963 = new int[128];

    @ObfuscatedName("du.ce")
    public static int[] field1964 = new int[128];

    @ObfuscatedName("du.cd")
    public static int field1951 = 0;

    @ObfuscatedName("du.cy")
    public static int field1966 = 0;

    @ObfuscatedName("du.cz")
    public static int field1967 = 0;

    @ObfuscatedName("du.ci")
    public static int field1974 = 0;

    @ObfuscatedName("du.cm")
    public static volatile int field1969 = 0;

    @ObfuscatedName("du.cg")
    public static int[] field1970 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("client.e(B)V")
    public static void method459() {
        if (field1948 != null) {
            class124 var0 = field1948;
            synchronized (field1948) {
                field1948 = null;
            }
        }
    }

    @ObfuscatedName("dx.v(I)Z")
    public static final boolean method2507() {
        class124 var0 = field1948;
        synchronized (field1948) {
            if (field1974 == field1966) {
                return false;
            } else {
                Statics.field1894 = field1963[field1966];
                Statics.field577 = field1953[field1966];
                field1966 = field1966 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1948 == null) {
            return;
        }
        field1969 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1970.length) {
            var3 = field1970[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1965 >= 0 && var3 >= 0) {
            field1959[field1965] = var3;
            field1965 = field1965 + 1 & 0x7F;
            if (field1968 == field1965) {
                field1965 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1967 + 1 & 0x7F;
            if (field1966 != var4) {
                field1963[field1967] = var3;
                field1953[field1967] = 0;
                field1967 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1948 != null) {
            field1969 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1970.length) {
                var3 = field1970[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1965 >= 0 && var3 >= 0) {
                field1959[field1965] = ~var3;
                field1965 = field1965 + 1 & 0x7F;
                if (field1968 == field1965) {
                    field1965 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1948 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class201.method2669(var2)) {
                int var3 = field1967 + 1 & 0x7F;
                if (field1966 != var3) {
                    field1963[field1967] = -1;
                    field1953[field1967] = var2;
                    field1967 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1948 != null) {
            field1965 = -1;
        }
    }
}
