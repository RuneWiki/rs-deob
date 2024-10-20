package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("ds")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("ds.g")
    public static class124 field1969 = new class124();

    @ObfuscatedName("ds.cm")
    public static boolean[] field1957 = new boolean[112];

    @ObfuscatedName("ds.cn")
    public static int[] field1958 = new int[128];

    @ObfuscatedName("ds.ce")
    public static int field1959 = 0;

    @ObfuscatedName("ds.ca")
    public static int field1960 = 0;

    @ObfuscatedName("ds.cv")
    public static char[] field1961 = new char[128];

    @ObfuscatedName("ds.cw")
    public static int[] field1953 = new int[128];

    @ObfuscatedName("ds.ci")
    public static int[] field1963 = new int[128];

    @ObfuscatedName("ds.cu")
    public static int field1950 = 0;

    @ObfuscatedName("ds.cs")
    public static int field1945 = 0;

    @ObfuscatedName("ds.cl")
    public static int field1966 = 0;

    @ObfuscatedName("ds.ck")
    public static int field1967 = 0;

    @ObfuscatedName("ds.co")
    public static volatile int field1968 = 0;

    @ObfuscatedName("ds.cf")
    public static int[] field1946 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cx.g(I)V")
    public static void method1845() {
        if (Statics.field1942.toLowerCase().indexOf("microsoft") != -1) {
            field1946[186] = 57;
            field1946[187] = 27;
            field1946[188] = 71;
            field1946[189] = 26;
            field1946[190] = 72;
            field1946[191] = 73;
            field1946[192] = 58;
            field1946[219] = 42;
            field1946[220] = 74;
            field1946[221] = 43;
            field1946[222] = 59;
            field1946[223] = 28;
            return;
        }
        field1946[44] = 71;
        field1946[45] = 26;
        field1946[46] = 72;
        field1946[47] = 73;
        field1946[59] = 57;
        field1946[61] = 27;
        field1946[91] = 42;
        field1946[92] = 74;
        field1946[93] = 43;
        field1946[192] = 28;
        field1946[222] = 58;
        field1946[520] = 59;
    }

    @ObfuscatedName("t.s(B)V")
    public static void method490() {
        if (field1969 != null) {
            class124 var0 = field1969;
            synchronized (field1969) {
                field1969 = null;
            }
        }
    }

    @ObfuscatedName("dr.h(I)Z")
    public static final boolean method2379() {
        class124 var0 = field1969;
        synchronized (field1969) {
            if (field1967 == field1945) {
                return false;
            } else {
                Statics.field691 = field1953[field1945];
                Statics.field514 = field1961[field1945];
                field1945 = field1945 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1969 == null) {
            return;
        }
        field1968 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1946.length) {
            var3 = field1946[var2];
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
            int var4 = field1966 + 1 & 0x7F;
            if (field1945 != var4) {
                field1953[field1966] = var3;
                field1961[field1966] = 0;
                field1966 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1969 != null) {
            field1968 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1946.length) {
                var3 = field1946[var2] & 0xFFFFFF7F;
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
        if (field1969 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class202.method2991(var2)) {
                int var3 = field1966 + 1 & 0x7F;
                if (field1945 != var3) {
                    field1953[field1966] = -1;
                    field1961[field1966] = var2;
                    field1966 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1969 != null) {
            field1960 = -1;
        }
    }
}
