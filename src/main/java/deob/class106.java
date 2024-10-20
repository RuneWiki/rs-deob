package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dq")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dq.b")
    public static class106 field1720 = new class106();

    @ObfuscatedName("dq.ce")
    public static boolean[] field1701 = new boolean[112];

    @ObfuscatedName("dq.cb")
    public static int[] field1702 = new int[128];

    @ObfuscatedName("dq.ct")
    public static int field1703 = 0;

    @ObfuscatedName("dq.cf")
    public static int field1704 = 0;

    @ObfuscatedName("dq.cd")
    public static char[] field1705 = new char[128];

    @ObfuscatedName("dq.cq")
    public static int[] field1706 = new int[128];

    @ObfuscatedName("dq.ca")
    public static int[] field1710 = new int[128];

    @ObfuscatedName("dq.cc")
    public static int field1708 = 0;

    @ObfuscatedName("dq.cg")
    public static int field1709 = 0;

    @ObfuscatedName("dq.cv")
    public static int field1719 = 0;

    @ObfuscatedName("dq.cj")
    public static int field1694 = 0;

    @ObfuscatedName("dq.co")
    public static volatile int field1696 = 0;

    @ObfuscatedName("dq.cy")
    public static int[] field1721 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fw.b(Ljava/awt/Component;I)V")
    public static void method2984(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1720);
        arg0.addFocusListener(field1720);
    }

    @ObfuscatedName("h.l(I)V")
    public static void method82() {
        if (field1720 != null) {
            class106 var0 = field1720;
            synchronized (field1720) {
                field1720 = null;
            }
        }
    }

    @ObfuscatedName("eg.i(I)V")
    public static void method2894() {
        class106 var0 = field1720;
        synchronized (field1720) {
            field1696++;
            field1709 = field1694;
            field1708 = 0;
            if (field1704 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1701[var1] = false;
                }
                field1704 = field1703;
            } else {
                while (field1704 != field1703) {
                    int var2 = field1702[field1703];
                    field1703 = field1703 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1701[~var2] = false;
                    } else {
                        if (!field1701[var2] && field1708 < field1710.length - 1) {
                            field1710[++field1708 - 1] = var2;
                        }
                        field1701[var2] = true;
                    }
                }
            }
            field1694 = field1719;
        }
    }

    @ObfuscatedName("z.k(I)I")
    public static int method166() {
        return field1696;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1720 == null) {
            return;
        }
        field1696 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1721.length) {
            var3 = field1721[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1704 >= 0 && var3 >= 0) {
            field1702[field1704] = var3;
            field1704 = field1704 + 1 & 0x7F;
            if (field1704 == field1703) {
                field1704 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1719 + 1 & 0x7F;
            if (field1709 != var4) {
                field1706[field1719] = var3;
                field1705[field1719] = 0;
                field1719 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1720 != null) {
            field1696 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1721.length) {
                var3 = field1721[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1704 >= 0 && var3 >= 0) {
                field1702[field1704] = ~var3;
                field1704 = field1704 + 1 & 0x7F;
                if (field1704 == field1703) {
                    field1704 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1720 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class204.field3082;
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
                    int var7 = field1719 + 1 & 0x7F;
                    if (field1709 != var7) {
                        field1706[field1719] = -1;
                        field1705[field1719] = var2;
                        field1719 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1720 != null) {
            field1704 = -1;
        }
    }
}
