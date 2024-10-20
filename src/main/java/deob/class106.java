package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dq")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dq.i")
    public static class106 field1701 = new class106();

    @ObfuscatedName("dq.cy")
    public static boolean[] field1694 = new boolean[112];

    @ObfuscatedName("dq.ct")
    public static int[] field1695 = new int[128];

    @ObfuscatedName("dq.cq")
    public static int field1696 = 0;

    @ObfuscatedName("dq.cb")
    public static int field1704 = 0;

    @ObfuscatedName("dq.cx")
    public static char[] field1698 = new char[128];

    @ObfuscatedName("dq.cs")
    public static int[] field1699 = new int[128];

    @ObfuscatedName("dq.cf")
    public static int[] field1700 = new int[128];

    @ObfuscatedName("dq.cv")
    public static int field1693 = 0;

    @ObfuscatedName("dq.cc")
    public static int field1702 = 0;

    @ObfuscatedName("dq.cg")
    public static int field1703 = 0;

    @ObfuscatedName("dq.cl")
    public static int field1697 = 0;

    @ObfuscatedName("dq.cu")
    public static volatile int field1691 = 0;

    @ObfuscatedName("dq.cp")
    public static int[] field1688 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("client.i(Ljava/awt/Component;I)V")
    public static void method308(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1701);
        arg0.addFocusListener(field1701);
    }

    @ObfuscatedName("a.e(Ljava/awt/Component;I)V")
    public static void method85(Component arg0) {
        arg0.removeKeyListener(field1701);
        arg0.removeFocusListener(field1701);
        field1704 = -1;
    }

    @ObfuscatedName("bp.f(I)V")
    public static void method1098() {
        class106 var0 = field1701;
        synchronized (field1701) {
            field1691++;
            field1702 = field1697;
            field1693 = 0;
            if (field1704 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1694[var1] = false;
                }
                field1704 = field1696;
            } else {
                while (field1704 != field1696) {
                    int var2 = field1695[field1696];
                    field1696 = field1696 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1694[~var2] = false;
                    } else {
                        if (!field1694[var2] && field1693 < field1700.length - 1) {
                            field1700[++field1693 - 1] = var2;
                        }
                        field1694[var2] = true;
                    }
                }
            }
            field1697 = field1703;
        }
    }

    @ObfuscatedName("at.k(I)Z")
    public static final boolean method767() {
        class106 var0 = field1701;
        synchronized (field1701) {
            if (field1702 == field1697) {
                return false;
            } else {
                Statics.field1353 = field1699[field1702];
                Statics.field276 = field1698[field1702];
                field1702 = field1702 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1701 == null) {
            return;
        }
        field1691 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1688.length) {
            var3 = field1688[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1704 >= 0 && var3 >= 0) {
            field1695[field1704] = var3;
            field1704 = field1704 + 1 & 0x7F;
            if (field1704 == field1696) {
                field1704 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1703 + 1 & 0x7F;
            if (field1702 != var4) {
                field1699[field1703] = var3;
                field1698[field1703] = 0;
                field1703 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1701 != null) {
            field1691 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1688.length) {
                var3 = field1688[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1704 >= 0 && var3 >= 0) {
                field1695[field1704] = ~var3;
                field1704 = field1704 + 1 & 0x7F;
                if (field1704 == field1696) {
                    field1704 = -1;
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
                            char[] var4 = class204.field3074;
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
                    int var7 = field1703 + 1 & 0x7F;
                    if (field1702 != var7) {
                        field1699[field1703] = -1;
                        field1698[field1703] = var2;
                        field1703 = var7;
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
            field1704 = -1;
        }
    }
}
