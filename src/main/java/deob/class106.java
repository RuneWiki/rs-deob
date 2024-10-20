package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dv")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dv.k")
    public static class106 field1701 = new class106();

    @ObfuscatedName("dv.co")
    public static boolean[] field1713 = new boolean[112];

    @ObfuscatedName("dv.cg")
    public static int[] field1711 = new int[128];

    @ObfuscatedName("dv.cz")
    public static int field1712 = 0;

    @ObfuscatedName("dv.cv")
    public static int field1720 = 0;

    @ObfuscatedName("dv.cp")
    public static char[] field1702 = new char[128];

    @ObfuscatedName("dv.cx")
    public static int[] field1715 = new int[128];

    @ObfuscatedName("dv.cl")
    public static int[] field1716 = new int[128];

    @ObfuscatedName("dv.cm")
    public static int field1717 = 0;

    @ObfuscatedName("dv.cr")
    public static int field1719 = 0;

    @ObfuscatedName("dv.cs")
    public static int field1714 = 0;

    @ObfuscatedName("dv.cj")
    public static int field1718 = 0;

    @ObfuscatedName("dv.ce")
    public static volatile int field1721 = 0;

    @ObfuscatedName("dv.cq")
    public static int[] field1722 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cl.k(I)V")
    public static void method1796() {
        class106 var0 = field1701;
        synchronized (field1701) {
            field1721++;
            field1719 = field1718;
            field1717 = 0;
            if (field1720 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1713[var1] = false;
                }
                field1720 = field1712;
            } else {
                while (field1720 != field1712) {
                    int var2 = field1711[field1712];
                    field1712 = field1712 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1713[~var2] = false;
                    } else {
                        if (!field1713[var2] && field1717 < field1716.length - 1) {
                            field1716[++field1717 - 1] = var2;
                        }
                        field1713[var2] = true;
                    }
                }
            }
            field1718 = field1714;
        }
    }

    @ObfuscatedName("gu.y(B)Z")
    public static final boolean method3605() {
        class106 var0 = field1701;
        synchronized (field1701) {
            if (field1719 == field1718) {
                return false;
            } else {
                Statics.field894 = field1715[field1719];
                Statics.field274 = field1702[field1719];
                field1719 = field1719 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1701 == null) {
            return;
        }
        field1721 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1722.length) {
            var3 = field1722[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1720 >= 0 && var3 >= 0) {
            field1711[field1720] = var3;
            field1720 = field1720 + 1 & 0x7F;
            if (field1720 == field1712) {
                field1720 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1714 + 1 & 0x7F;
            if (field1719 != var4) {
                field1715[field1714] = var3;
                field1702[field1714] = 0;
                field1714 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1701 != null) {
            field1721 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1722.length) {
                var3 = field1722[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1720 >= 0 && var3 >= 0) {
                field1711[field1720] = ~var3;
                field1720 = field1720 + 1 & 0x7F;
                if (field1720 == field1712) {
                    field1720 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1701 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class204.field3064;
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
                    int var7 = field1714 + 1 & 0x7F;
                    if (field1719 != var7) {
                        field1715[field1714] = -1;
                        field1702[field1714] = var2;
                        field1714 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1701 != null) {
            field1720 = -1;
        }
    }
}
