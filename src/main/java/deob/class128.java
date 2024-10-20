package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("db")
public final class class128 implements KeyListener, FocusListener {

    @ObfuscatedName("db.p")
    public static class128 field1983 = new class128();

    @ObfuscatedName("db.cg")
    public static boolean[] field1978 = new boolean[112];

    @ObfuscatedName("db.cf")
    public static int[] field1971 = new int[128];

    @ObfuscatedName("db.ck")
    public static int field1972 = 0;

    @ObfuscatedName("db.cp")
    public static int field1973 = 0;

    @ObfuscatedName("db.cj")
    public static char[] field1965 = new char[128];

    @ObfuscatedName("db.ch")
    public static int[] field1960 = new int[128];

    @ObfuscatedName("db.cs")
    public static int[] field1976 = new int[128];

    @ObfuscatedName("db.cr")
    public static int field1977 = 0;

    @ObfuscatedName("db.cz")
    public static int field1961 = 0;

    @ObfuscatedName("db.cw")
    public static int field1979 = 0;

    @ObfuscatedName("db.cy")
    public static int field1980 = 0;

    @ObfuscatedName("db.cn")
    public static volatile int field1981 = 0;

    @ObfuscatedName("db.ce")
    public static int[] field1982 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dp.p(B)V")
    public static void method2394() {
        if (Statics.field1756.toLowerCase().indexOf("microsoft") != -1) {
            field1982[186] = 57;
            field1982[187] = 27;
            field1982[188] = 71;
            field1982[189] = 26;
            field1982[190] = 72;
            field1982[191] = 73;
            field1982[192] = 58;
            field1982[219] = 42;
            field1982[220] = 74;
            field1982[221] = 43;
            field1982[222] = 59;
            field1982[223] = 28;
            return;
        }
        field1982[44] = 71;
        field1982[45] = 26;
        field1982[46] = 72;
        field1982[47] = 73;
        field1982[59] = 57;
        field1982[61] = 27;
        field1982[91] = 42;
        field1982[92] = 74;
        field1982[93] = 43;
        field1982[192] = 28;
        field1982[222] = 58;
        field1982[520] = 59;
    }

    @ObfuscatedName("ce.y(Ljava/awt/Component;I)V")
    public static void method2054(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1983);
        arg0.addFocusListener(field1983);
    }

    @ObfuscatedName("bx.d(Ljava/awt/Component;I)V")
    public static void method1410(Component arg0) {
        arg0.removeKeyListener(field1983);
        arg0.removeFocusListener(field1983);
        field1973 = -1;
    }

    @ObfuscatedName("dg.c(B)Z")
    public static final boolean method2205() {
        class128 var0 = field1983;
        synchronized (field1983) {
            if (field1980 == field1961) {
                return false;
            } else {
                Statics.field1812 = field1960[field1961];
                Statics.field129 = field1965[field1961];
                field1961 = field1961 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1983 == null) {
            return;
        }
        field1981 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1982.length) {
            var3 = field1982[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1973 >= 0 && var3 >= 0) {
            field1971[field1973] = var3;
            field1973 = field1973 + 1 & 0x7F;
            if (field1973 == field1972) {
                field1973 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1979 + 1 & 0x7F;
            if (field1961 != var4) {
                field1960[field1979] = var3;
                field1965[field1979] = 0;
                field1979 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1983 != null) {
            field1981 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1982.length) {
                var3 = field1982[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1973 >= 0 && var3 >= 0) {
                field1971[field1973] = ~var3;
                field1973 = field1973 + 1 & 0x7F;
                if (field1973 == field1972) {
                    field1973 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1983 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class215.method1801(var2)) {
                int var3 = field1979 + 1 & 0x7F;
                if (field1961 != var3) {
                    field1960[field1979] = -1;
                    field1965[field1979] = var2;
                    field1979 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1983 != null) {
            field1973 = -1;
        }
    }
}
