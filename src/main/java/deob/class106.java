package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dd")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dd.p")
    public static class106 field1699 = new class106();

    @ObfuscatedName("dd.cd")
    public static boolean[] field1709 = new boolean[112];

    @ObfuscatedName("dd.ch")
    public static int[] field1720 = new int[128];

    @ObfuscatedName("dd.cy")
    public static int field1711 = 0;

    @ObfuscatedName("dd.cs")
    public static int field1712 = 0;

    @ObfuscatedName("dd.cv")
    public static char[] field1707 = new char[128];

    @ObfuscatedName("dd.cj")
    public static int[] field1714 = new int[128];

    @ObfuscatedName("dd.ce")
    public static int[] field1715 = new int[128];

    @ObfuscatedName("dd.cp")
    public static int field1716 = 0;

    @ObfuscatedName("dd.cz")
    public static int field1702 = 0;

    @ObfuscatedName("dd.ck")
    public static int field1718 = 0;

    @ObfuscatedName("dd.ca")
    public static int field1719 = 0;

    @ObfuscatedName("dd.cu")
    public static volatile int field1721 = 0;

    @ObfuscatedName("dd.cx")
    public static int[] field1713 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("j.p(I)V")
    public static void method96() {
        if (field1699 != null) {
            class106 var0 = field1699;
            synchronized (field1699) {
                field1699 = null;
            }
        }
    }

    @ObfuscatedName("ay.g(I)V")
    public static void method701() {
        class106 var0 = field1699;
        synchronized (field1699) {
            field1721++;
            field1702 = field1719;
            field1716 = 0;
            if (field1712 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1709[var1] = false;
                }
                field1712 = field1711;
            } else {
                while (field1712 != field1711) {
                    int var2 = field1720[field1711];
                    field1711 = field1711 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1709[~var2] = false;
                    } else {
                        if (!field1709[var2] && field1716 < field1715.length - 1) {
                            field1715[++field1716 - 1] = var2;
                        }
                        field1709[var2] = true;
                    }
                }
            }
            field1719 = field1718;
        }
    }

    @ObfuscatedName("ba.x(I)Z")
    public static final boolean method1094() {
        class106 var0 = field1699;
        synchronized (field1699) {
            if (field1719 == field1702) {
                return false;
            } else {
                Statics.field1745 = field1714[field1702];
                Statics.field1425 = field1707[field1702];
                field1702 = field1702 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("e.q(B)I")
    public static int method573() {
        return field1721;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1699 == null) {
            return;
        }
        field1721 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1713.length) {
            var3 = field1713[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1712 >= 0 && var3 >= 0) {
            field1720[field1712] = var3;
            field1712 = field1712 + 1 & 0x7F;
            if (field1712 == field1711) {
                field1712 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1718 + 1 & 0x7F;
            if (field1702 != var4) {
                field1714[field1718] = var3;
                field1707[field1718] = 0;
                field1718 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1699 != null) {
            field1721 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1713.length) {
                var3 = field1713[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1712 >= 0 && var3 >= 0) {
                field1720[field1712] = ~var3;
                field1712 = field1712 + 1 & 0x7F;
                if (field1712 == field1711) {
                    field1712 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1699 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && Statics.method2438(var2)) {
                int var3 = field1718 + 1 & 0x7F;
                if (field1702 != var3) {
                    field1714[field1718] = -1;
                    field1707[field1718] = var2;
                    field1718 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1699 != null) {
            field1712 = -1;
        }
    }
}
