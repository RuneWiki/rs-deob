package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dh")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dh.g")
    public static class124 field1985 = new class124();

    @ObfuscatedName("dh.cu")
    public static boolean[] field1994 = new boolean[112];

    @ObfuscatedName("dh.cr")
    public static int[] field1990 = new int[128];

    @ObfuscatedName("dh.cl")
    public static int field1991 = 0;

    @ObfuscatedName("dh.cy")
    public static int field1992 = 0;

    @ObfuscatedName("dh.cn")
    public static char[] field1989 = new char[128];

    @ObfuscatedName("dh.cq")
    public static int[] field1974 = new int[128];

    @ObfuscatedName("dh.cc")
    public static int[] field1975 = new int[128];

    @ObfuscatedName("dh.ca")
    public static int field1996 = 0;

    @ObfuscatedName("dh.ch")
    public static int field1997 = 0;

    @ObfuscatedName("dh.cg")
    public static int field1998 = 0;

    @ObfuscatedName("dh.ck")
    public static int field1977 = 0;

    @ObfuscatedName("dh.ct")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dh.cv")
    public static int[] field1980 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("a.g(Ljava/awt/Component;I)V")
    public static void method496(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1985);
        arg0.addFocusListener(field1985);
    }

    @ObfuscatedName("j.s(I)V")
    public static void method131() {
        if (field1985 != null) {
            class124 var0 = field1985;
            synchronized (field1985) {
                field1985 = null;
            }
        }
    }

    @ObfuscatedName("eq.v(I)Z")
    public static final boolean method2556() {
        class124 var0 = field1985;
        synchronized (field1985) {
            if (field1997 == field1977) {
                return false;
            } else {
                Statics.field1884 = field1974[field1997];
                Statics.field1891 = field1989[field1997];
                field1997 = field1997 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1985 == null) {
            return;
        }
        field2000 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1980.length) {
            var3 = field1980[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1992 >= 0 && var3 >= 0) {
            field1990[field1992] = var3;
            field1992 = field1992 + 1 & 0x7F;
            if (field1992 == field1991) {
                field1992 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1998 + 1 & 0x7F;
            if (field1997 != var4) {
                field1974[field1998] = var3;
                field1989[field1998] = 0;
                field1998 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1985 != null) {
            field2000 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1980.length) {
                var3 = field1980[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1992 >= 0 && var3 >= 0) {
                field1990[field1992] = ~var3;
                field1992 = field1992 + 1 & 0x7F;
                if (field1992 == field1991) {
                    field1992 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1985 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class202.method3499(var2)) {
                int var3 = field1998 + 1 & 0x7F;
                if (field1997 != var3) {
                    field1974[field1998] = -1;
                    field1989[field1998] = var2;
                    field1998 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1985 != null) {
            field1992 = -1;
        }
    }
}
