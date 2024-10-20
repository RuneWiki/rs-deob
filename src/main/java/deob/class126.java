package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("db")
public final class class126 implements KeyListener, FocusListener {

    @ObfuscatedName("db.g")
    public static class126 field1947 = new class126();

    @ObfuscatedName("db.ct")
    public static boolean[] field1969 = new boolean[112];

    @ObfuscatedName("db.cg")
    public static int[] field1954 = new int[128];

    @ObfuscatedName("db.cp")
    public static int field1968 = 0;

    @ObfuscatedName("db.cz")
    public static int field1956 = 0;

    @ObfuscatedName("db.cm")
    public static char[] field1949 = new char[128];

    @ObfuscatedName("db.ci")
    public static int[] field1958 = new int[128];

    @ObfuscatedName("db.cy")
    public static int[] field1959 = new int[128];

    @ObfuscatedName("db.ch")
    public static int field1955 = 0;

    @ObfuscatedName("db.cf")
    public static int field1961 = 0;

    @ObfuscatedName("db.cj")
    public static int field1945 = 0;

    @ObfuscatedName("db.cx")
    public static int field1963 = 0;

    @ObfuscatedName("db.cr")
    public static volatile int field1957 = 0;

    @ObfuscatedName("db.cl")
    public static int[] field1965 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("el.g(B)V")
    public static void method2623() {
        if (Statics.field1937.toLowerCase().indexOf("microsoft") != -1) {
            field1965[186] = 57;
            field1965[187] = 27;
            field1965[188] = 71;
            field1965[189] = 26;
            field1965[190] = 72;
            field1965[191] = 73;
            field1965[192] = 58;
            field1965[219] = 42;
            field1965[220] = 74;
            field1965[221] = 43;
            field1965[222] = 59;
            field1965[223] = 28;
            return;
        }
        field1965[44] = 71;
        field1965[45] = 26;
        field1965[46] = 72;
        field1965[47] = 73;
        field1965[59] = 57;
        field1965[61] = 27;
        field1965[91] = 42;
        field1965[92] = 74;
        field1965[93] = 43;
        field1965[192] = 28;
        field1965[222] = 58;
        field1965[520] = 59;
    }

    @ObfuscatedName("dj.j(B)Z")
    public static final boolean method2460() {
        class126 var0 = field1947;
        synchronized (field1947) {
            if (field1963 == field1961) {
                return false;
            } else {
                Statics.field693 = field1958[field1961];
                Statics.field2118 = field1949[field1961];
                field1961 = field1961 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1947 == null) {
            return;
        }
        field1957 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1965.length) {
            var3 = field1965[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1956 >= 0 && var3 >= 0) {
            field1954[field1956] = var3;
            field1956 = field1956 + 1 & 0x7F;
            if (field1968 == field1956) {
                field1956 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1945 + 1 & 0x7F;
            if (field1961 != var4) {
                field1958[field1945] = var3;
                field1949[field1945] = 0;
                field1945 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1947 != null) {
            field1957 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1965.length) {
                var3 = field1965[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1956 >= 0 && var3 >= 0) {
                field1954[field1956] = ~var3;
                field1956 = field1956 + 1 & 0x7F;
                if (field1968 == field1956) {
                    field1956 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1947 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class213.method258(var2)) {
                int var3 = field1945 + 1 & 0x7F;
                if (field1961 != var3) {
                    field1958[field1945] = -1;
                    field1949[field1945] = var2;
                    field1945 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1947 != null) {
            field1956 = -1;
        }
    }
}
