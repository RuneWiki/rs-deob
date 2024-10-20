package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("db")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("db.x")
    public static class106 field1719 = new class106();

    @ObfuscatedName("db.ck")
    public static boolean[] field1726 = new boolean[112];

    @ObfuscatedName("db.cx")
    public static int[] field1727 = new int[128];

    @ObfuscatedName("db.cn")
    public static int field1721 = 0;

    @ObfuscatedName("db.cl")
    public static int field1722 = 0;

    @ObfuscatedName("db.cy")
    public static char[] field1723 = new char[128];

    @ObfuscatedName("db.cz")
    public static int[] field1724 = new int[128];

    @ObfuscatedName("db.cm")
    public static int[] field1736 = new int[128];

    @ObfuscatedName("db.cq")
    public static int field1717 = 0;

    @ObfuscatedName("db.cp")
    public static int field1725 = 0;

    @ObfuscatedName("db.ch")
    public static int field1728 = 0;

    @ObfuscatedName("db.cu")
    public static int field1729 = 0;

    @ObfuscatedName("db.co")
    public static volatile int field1730 = 0;

    @ObfuscatedName("db.cr")
    public static int[] field1731 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cx.x(B)V")
    public static void method1855() {
        if (Statics.field1679.toLowerCase().indexOf("microsoft") != -1) {
            field1731[186] = 57;
            field1731[187] = 27;
            field1731[188] = 71;
            field1731[189] = 26;
            field1731[190] = 72;
            field1731[191] = 73;
            field1731[192] = 58;
            field1731[219] = 42;
            field1731[220] = 74;
            field1731[221] = 43;
            field1731[222] = 59;
            field1731[223] = 28;
            return;
        }
        field1731[44] = 71;
        field1731[45] = 26;
        field1731[46] = 72;
        field1731[47] = 73;
        field1731[59] = 57;
        field1731[61] = 27;
        field1731[91] = 42;
        field1731[92] = 74;
        field1731[93] = 43;
        field1731[192] = 28;
        field1731[222] = 58;
        field1731[520] = 59;
    }

    @ObfuscatedName("v.j(Ljava/awt/Component;B)V")
    public static void method189(Component arg0) {
        arg0.removeKeyListener(field1719);
        arg0.removeFocusListener(field1719);
        field1722 = -1;
    }

    @ObfuscatedName("bh.c(I)V")
    public static void method1432() {
        if (field1719 != null) {
            class106 var0 = field1719;
            synchronized (field1719) {
                field1719 = null;
            }
        }
    }

    @ObfuscatedName("cd.d(I)V")
    public static void method1853() {
        class106 var0 = field1719;
        synchronized (field1719) {
            field1730++;
            field1725 = field1729;
            field1717 = 0;
            if (field1722 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1726[var1] = false;
                }
                field1722 = field1721;
            } else {
                while (field1722 != field1721) {
                    int var2 = field1727[field1721];
                    field1721 = field1721 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1726[~var2] = false;
                    } else {
                        if (!field1726[var2] && field1717 < field1736.length - 1) {
                            field1736[++field1717 - 1] = var2;
                        }
                        field1726[var2] = true;
                    }
                }
            }
            if (field1717 > 0) {
                field1730 = 0;
            }
            field1729 = field1728;
        }
    }

    @ObfuscatedName("cw.w(I)Z")
    public static final boolean method1508() {
        class106 var0 = field1719;
        synchronized (field1719) {
            if (field1729 == field1725) {
                return false;
            } else {
                Statics.field1203 = field1724[field1725];
                Statics.field2109 = field1723[field1725];
                field1725 = field1725 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cp.u(I)I")
    public static int method1877() {
        return field1730;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1719 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1731.length) {
            var3 = field1731[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1722 >= 0 && var3 >= 0) {
            field1727[field1722] = var3;
            field1722 = field1722 + 1 & 0x7F;
            if (field1722 == field1721) {
                field1722 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1728 + 1 & 0x7F;
            if (field1725 != var4) {
                field1724[field1728] = var3;
                field1723[field1728] = 0;
                field1728 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1719 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1731.length) {
                var3 = field1731[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1722 >= 0 && var3 >= 0) {
                field1727[field1722] = ~var3;
                field1722 = field1722 + 1 & 0x7F;
                if (field1722 == field1721) {
                    field1722 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1719 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class204.method2869(var2)) {
                int var3 = field1728 + 1 & 0x7F;
                if (field1725 != var3) {
                    field1724[field1728] = -1;
                    field1723[field1728] = var2;
                    field1728 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1719 != null) {
            field1722 = -1;
        }
    }
}
