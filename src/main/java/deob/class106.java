package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dc")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dc.x")
    public static class106 field1703 = new class106();

    @ObfuscatedName("dc.cp")
    public static boolean[] field1719 = new boolean[112];

    @ObfuscatedName("dc.cl")
    public static int[] field1720 = new int[128];

    @ObfuscatedName("dc.cb")
    public static int field1721 = 0;

    @ObfuscatedName("dc.cz")
    public static int field1707 = 0;

    @ObfuscatedName("dc.cs")
    public static char[] field1723 = new char[128];

    @ObfuscatedName("dc.ch")
    public static int[] field1705 = new int[128];

    @ObfuscatedName("dc.cg")
    public static int[] field1725 = new int[128];

    @ObfuscatedName("dc.ct")
    public static int field1728 = 0;

    @ObfuscatedName("dc.ce")
    public static int field1701 = 0;

    @ObfuscatedName("dc.cv")
    public static int field1727 = 0;

    @ObfuscatedName("dc.cx")
    public static int field1729 = 0;

    @ObfuscatedName("dc.cy")
    public static volatile int field1730 = 0;

    @ObfuscatedName("dc.cf")
    public static int[] field1731 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("gf.x(B)V")
    public static void method3589() {
        if (field1703 != null) {
            class106 var0 = field1703;
            synchronized (field1703) {
                field1703 = null;
            }
        }
    }

    @ObfuscatedName("b.n(I)Z")
    public static final boolean method197() {
        class106 var0 = field1703;
        synchronized (field1703) {
            if (field1729 == field1701) {
                return false;
            } else {
                Statics.field132 = field1705[field1701];
                Statics.field9 = field1723[field1701];
                field1701 = field1701 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("fv.g(I)I")
    public static int method3042() {
        return field1730;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1703 == null) {
            return;
        }
        field1730 = 0;
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
        if (field1707 >= 0 && var3 >= 0) {
            field1720[field1707] = var3;
            field1707 = field1707 + 1 & 0x7F;
            if (field1721 == field1707) {
                field1707 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1727 + 1 & 0x7F;
            if (field1701 != var4) {
                field1705[field1727] = var3;
                field1723[field1727] = 0;
                field1727 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1703 != null) {
            field1730 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1731.length) {
                var3 = field1731[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1707 >= 0 && var3 >= 0) {
                field1720[field1707] = ~var3;
                field1707 = field1707 + 1 & 0x7F;
                if (field1721 == field1707) {
                    field1707 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1703 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class204.field3085;
                            for (int var5 = 0; var5 < var4.length; var5++) {
                                char var6 = var4[var5];
                                if (var2 == var6) {
                                    var3 = true;
                                    break label56;
                                }
                            }
                        }
                        var3 = false;
                    }
                }
                if (var3) {
                    int var7 = field1727 + 1 & 0x7F;
                    if (field1701 != var7) {
                        field1705[field1727] = -1;
                        field1723[field1727] = var2;
                        field1727 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1703 != null) {
            field1707 = -1;
        }
    }
}
