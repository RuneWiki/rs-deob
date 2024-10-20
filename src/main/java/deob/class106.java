package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dn")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dn.b")
    public static class106 field1691 = new class106();

    @ObfuscatedName("dn.cb")
    public static boolean[] field1711 = new boolean[112];

    @ObfuscatedName("dn.cq")
    public static int[] field1704 = new int[128];

    @ObfuscatedName("dn.cx")
    public static int field1685 = 0;

    @ObfuscatedName("dn.ck")
    public static int field1701 = 0;

    @ObfuscatedName("dn.cm")
    public static char[] field1700 = new char[128];

    @ObfuscatedName("dn.ce")
    public static int[] field1696 = new int[128];

    @ObfuscatedName("dn.cz")
    public static int[] field1703 = new int[128];

    @ObfuscatedName("dn.cu")
    public static int field1705 = 0;

    @ObfuscatedName("dn.cs")
    public static int field1706 = 0;

    @ObfuscatedName("dn.cr")
    public static int field1707 = 0;

    @ObfuscatedName("dn.cd")
    public static int field1708 = 0;

    @ObfuscatedName("dn.cw")
    public static volatile int field1709 = 0;

    @ObfuscatedName("dn.cy")
    public static int[] field1687 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dw.b(I)V")
    public static void method2206() {
        if (Statics.field1660.toLowerCase().indexOf("microsoft") != -1) {
            field1687[186] = 57;
            field1687[187] = 27;
            field1687[188] = 71;
            field1687[189] = 26;
            field1687[190] = 72;
            field1687[191] = 73;
            field1687[192] = 58;
            field1687[219] = 42;
            field1687[220] = 74;
            field1687[221] = 43;
            field1687[222] = 59;
            field1687[223] = 28;
            return;
        }
        field1687[44] = 71;
        field1687[45] = 26;
        field1687[46] = 72;
        field1687[47] = 73;
        field1687[59] = 57;
        field1687[61] = 27;
        field1687[91] = 42;
        field1687[92] = 74;
        field1687[93] = 43;
        field1687[192] = 28;
        field1687[222] = 58;
        field1687[520] = 59;
    }

    @ObfuscatedName("u.e(Ljava/awt/Component;I)V")
    public static void method255(Component arg0) {
        arg0.removeKeyListener(field1691);
        arg0.removeFocusListener(field1691);
        field1701 = -1;
    }

    @ObfuscatedName("client.c(I)V")
    public static void method570() {
        if (field1691 != null) {
            class106 var0 = field1691;
            synchronized (field1691) {
                field1691 = null;
            }
        }
    }

    @ObfuscatedName("av.l(B)V")
    public static void method811() {
        class106 var0 = field1691;
        synchronized (field1691) {
            field1709++;
            field1706 = field1708;
            field1705 = 0;
            if (field1701 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1711[var1] = false;
                }
                field1701 = field1685;
            } else {
                while (field1701 != field1685) {
                    int var2 = field1704[field1685];
                    field1685 = field1685 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1711[~var2] = false;
                    } else {
                        if (!field1711[var2] && field1705 < field1703.length - 1) {
                            field1703[++field1705 - 1] = var2;
                        }
                        field1711[var2] = true;
                    }
                }
            }
            field1708 = field1707;
        }
    }

    @ObfuscatedName("bv.y(I)Z")
    public static final boolean method1136() {
        class106 var0 = field1691;
        synchronized (field1691) {
            if (field1708 == field1706) {
                return false;
            } else {
                Statics.field1101 = field1696[field1706];
                Statics.field1359 = field1700[field1706];
                field1706 = field1706 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1691 == null) {
            return;
        }
        field1709 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1687.length) {
            var3 = field1687[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1701 >= 0 && var3 >= 0) {
            field1704[field1701] = var3;
            field1701 = field1701 + 1 & 0x7F;
            if (field1701 == field1685) {
                field1701 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1707 + 1 & 0x7F;
            if (field1706 != var4) {
                field1696[field1707] = var3;
                field1700[field1707] = 0;
                field1707 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1691 != null) {
            field1709 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1687.length) {
                var3 = field1687[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1701 >= 0 && var3 >= 0) {
                field1704[field1701] = ~var3;
                field1701 = field1701 + 1 & 0x7F;
                if (field1701 == field1685) {
                    field1701 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1691 != null) {
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
                    int var7 = field1707 + 1 & 0x7F;
                    if (field1706 != var7) {
                        field1696[field1707] = -1;
                        field1700[field1707] = var2;
                        field1707 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1691 != null) {
            field1701 = -1;
        }
    }
}
