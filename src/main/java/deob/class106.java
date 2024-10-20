package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("df")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("df.n")
    public static class106 field1723 = new class106();

    @ObfuscatedName("df.cp")
    public static boolean[] field1710 = new boolean[112];

    @ObfuscatedName("df.cz")
    public static int[] field1711 = new int[128];

    @ObfuscatedName("df.cb")
    public static int field1712 = 0;

    @ObfuscatedName("df.ch")
    public static int field1719 = 0;

    @ObfuscatedName("df.cj")
    public static char[] field1714 = new char[128];

    @ObfuscatedName("df.cq")
    public static int[] field1713 = new int[128];

    @ObfuscatedName("df.cr")
    public static int[] field1716 = new int[128];

    @ObfuscatedName("df.cv")
    public static int field1717 = 0;

    @ObfuscatedName("df.cm")
    public static int field1700 = 0;

    @ObfuscatedName("df.cl")
    public static int field1715 = 0;

    @ObfuscatedName("df.co")
    public static int field1697 = 0;

    @ObfuscatedName("df.ct")
    public static volatile int field1721 = 0;

    @ObfuscatedName("df.cf")
    public static int[] field1722 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bl.n(Ljava/awt/Component;I)V")
    public static void method1058(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1723);
        arg0.addFocusListener(field1723);
    }

    @ObfuscatedName("ag.d(I)V")
    public static void method719() {
        if (field1723 != null) {
            class106 var0 = field1723;
            synchronized (field1723) {
                field1723 = null;
            }
        }
    }

    @ObfuscatedName("am.h(B)Z")
    public static final boolean method731() {
        class106 var0 = field1723;
        synchronized (field1723) {
            if (field1700 == field1697) {
                return false;
            } else {
                Statics.field26 = field1713[field1700];
                Statics.field2318 = field1714[field1700];
                field1700 = field1700 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1723 == null) {
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
        if (field1719 >= 0 && var3 >= 0) {
            field1711[field1719] = var3;
            field1719 = field1719 + 1 & 0x7F;
            if (field1719 == field1712) {
                field1719 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1715 + 1 & 0x7F;
            if (field1700 != var4) {
                field1713[field1715] = var3;
                field1714[field1715] = 0;
                field1715 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1723 != null) {
            field1721 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1722.length) {
                var3 = field1722[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1719 >= 0 && var3 >= 0) {
                field1711[field1719] = ~var3;
                field1719 = field1719 + 1 & 0x7F;
                if (field1719 == field1712) {
                    field1719 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1723 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class204.field3068;
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
                    int var7 = field1715 + 1 & 0x7F;
                    if (field1700 != var7) {
                        field1713[field1715] = -1;
                        field1714[field1715] = var2;
                        field1715 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1723 != null) {
            field1719 = -1;
        }
    }
}
