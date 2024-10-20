package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dr")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dr.e")
    public static class129 field1970 = new class129();

    @ObfuscatedName("dr.ce")
    public static boolean[] field1969 = new boolean[112];

    @ObfuscatedName("dr.cq")
    public static int[] field1954 = new int[128];

    @ObfuscatedName("dr.ct")
    public static int field1971 = 0;

    @ObfuscatedName("dr.cx")
    public static int field1972 = 0;

    @ObfuscatedName("dr.cu")
    public static char[] field1973 = new char[128];

    @ObfuscatedName("dr.ck")
    public static int[] field1974 = new int[128];

    @ObfuscatedName("dr.cr")
    public static int[] field1977 = new int[128];

    @ObfuscatedName("dr.cw")
    public static int field1952 = 0;

    @ObfuscatedName("dr.cl")
    public static int field1983 = 0;

    @ObfuscatedName("dr.co")
    public static int field1978 = 0;

    @ObfuscatedName("dr.cn")
    public static int field1979 = 0;

    @ObfuscatedName("dr.cy")
    public static volatile int field1980 = 0;

    @ObfuscatedName("dr.cc")
    public static int[] field1981 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dm.e(I)V")
    public static void method2430() {
        if (Statics.field1946.toLowerCase().indexOf("microsoft") != -1) {
            field1981[186] = 57;
            field1981[187] = 27;
            field1981[188] = 71;
            field1981[189] = 26;
            field1981[190] = 72;
            field1981[191] = 73;
            field1981[192] = 58;
            field1981[219] = 42;
            field1981[220] = 74;
            field1981[221] = 43;
            field1981[222] = 59;
            field1981[223] = 28;
            return;
        }
        field1981[44] = 71;
        field1981[45] = 26;
        field1981[46] = 72;
        field1981[47] = 73;
        field1981[59] = 57;
        field1981[61] = 27;
        field1981[91] = 42;
        field1981[92] = 74;
        field1981[93] = 43;
        field1981[192] = 28;
        field1981[222] = 58;
        field1981[520] = 59;
    }

    @ObfuscatedName("ar.a(Ljava/awt/Component;I)V")
    public static void method856(Component arg0) {
        arg0.removeKeyListener(field1970);
        arg0.removeFocusListener(field1970);
        field1972 = -1;
    }

    @ObfuscatedName("c.l(B)V")
    public static void method37() {
        if (field1970 != null) {
            class129 var0 = field1970;
            synchronized (field1970) {
                field1970 = null;
            }
        }
    }

    @ObfuscatedName("cm.c(B)Z")
    public static final boolean method1906() {
        class129 var0 = field1970;
        synchronized (field1970) {
            if (field1983 == field1979) {
                return false;
            } else {
                Statics.field222 = field1974[field1983];
                Statics.field553 = field1973[field1983];
                field1983 = field1983 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1970 == null) {
            return;
        }
        field1980 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1981.length) {
            var3 = field1981[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1972 >= 0 && var3 >= 0) {
            field1954[field1972] = var3;
            field1972 = field1972 + 1 & 0x7F;
            if (field1972 == field1971) {
                field1972 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1978 + 1 & 0x7F;
            if (field1983 != var4) {
                field1974[field1978] = var3;
                field1973[field1978] = 0;
                field1978 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1970 != null) {
            field1980 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1981.length) {
                var3 = field1981[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1972 >= 0 && var3 >= 0) {
                field1954[field1972] = ~var3;
                field1972 = field1972 + 1 & 0x7F;
                if (field1972 == field1971) {
                    field1972 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1970 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class156.method1926(var2)) {
                int var3 = field1978 + 1 & 0x7F;
                if (field1983 != var3) {
                    field1974[field1978] = -1;
                    field1973[field1978] = var2;
                    field1978 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1970 != null) {
            field1972 = -1;
        }
    }
}
