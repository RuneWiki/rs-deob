package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dd")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dd.p")
    public static class124 field1965 = new class124();

    @ObfuscatedName("dd.cd")
    public static boolean[] field1946 = new boolean[112];

    @ObfuscatedName("dd.cc")
    public static int[] field1960 = new int[128];

    @ObfuscatedName("dd.cj")
    public static int field1961 = 0;

    @ObfuscatedName("dd.cx")
    public static int field1962 = 0;

    @ObfuscatedName("dd.cq")
    public static char[] field1963 = new char[128];

    @ObfuscatedName("dd.co")
    public static int[] field1964 = new int[128];

    @ObfuscatedName("dd.ca")
    public static int[] field1943 = new int[128];

    @ObfuscatedName("dd.cz")
    public static int field1972 = 0;

    @ObfuscatedName("dd.ce")
    public static int field1970 = 0;

    @ObfuscatedName("dd.cn")
    public static int field1968 = 0;

    @ObfuscatedName("dd.cy")
    public static int field1969 = 0;

    @ObfuscatedName("dd.cv")
    public static volatile int field1973 = 0;

    @ObfuscatedName("dd.cw")
    public static int[] field1971 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("m.p(I)V")
    public static void method537() {
        if (Statics.field1934.toLowerCase().indexOf("microsoft") != -1) {
            field1971[186] = 57;
            field1971[187] = 27;
            field1971[188] = 71;
            field1971[189] = 26;
            field1971[190] = 72;
            field1971[191] = 73;
            field1971[192] = 58;
            field1971[219] = 42;
            field1971[220] = 74;
            field1971[221] = 43;
            field1971[222] = 59;
            field1971[223] = 28;
            return;
        }
        field1971[44] = 71;
        field1971[45] = 26;
        field1971[46] = 72;
        field1971[47] = 73;
        field1971[59] = 57;
        field1971[61] = 27;
        field1971[91] = 42;
        field1971[92] = 74;
        field1971[93] = 43;
        field1971[192] = 28;
        field1971[222] = 58;
        field1971[520] = 59;
    }

    @ObfuscatedName("ce.g(I)V")
    public static void method2026() {
        class124 var0 = field1965;
        synchronized (field1965) {
            field1973++;
            field1970 = field1969;
            field1972 = 0;
            if (field1962 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1946[var1] = false;
                }
                field1962 = field1961;
            } else {
                while (field1962 != field1961) {
                    int var2 = field1960[field1961];
                    field1961 = field1961 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1946[~var2] = false;
                    } else {
                        if (!field1946[var2] && field1972 < field1943.length - 1) {
                            field1943[++field1972 - 1] = var2;
                        }
                        field1946[var2] = true;
                    }
                }
            }
            field1969 = field1968;
        }
    }

    @ObfuscatedName("dj.x(I)Z")
    public static final boolean method2476() {
        class124 var0 = field1965;
        synchronized (field1965) {
            if (field1970 == field1969) {
                return false;
            } else {
                Statics.field49 = field1964[field1970];
                Statics.field2496 = field1963[field1970];
                field1970 = field1970 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1965 == null) {
            return;
        }
        field1973 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1971.length) {
            var3 = field1971[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1962 >= 0 && var3 >= 0) {
            field1960[field1962] = var3;
            field1962 = field1962 + 1 & 0x7F;
            if (field1962 == field1961) {
                field1962 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1968 + 1 & 0x7F;
            if (field1970 != var4) {
                field1964[field1968] = var3;
                field1963[field1968] = 0;
                field1968 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1965 != null) {
            field1973 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1971.length) {
                var3 = field1971[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1962 >= 0 && var3 >= 0) {
                field1960[field1962] = ~var3;
                field1962 = field1962 + 1 & 0x7F;
                if (field1962 == field1961) {
                    field1962 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1965 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class202.method495(var2)) {
                int var3 = field1968 + 1 & 0x7F;
                if (field1970 != var3) {
                    field1964[field1968] = -1;
                    field1963[field1968] = var2;
                    field1968 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1965 != null) {
            field1962 = -1;
        }
    }
}
