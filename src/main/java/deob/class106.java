package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dk")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dk.u")
    public static class106 field1690 = new class106();

    @ObfuscatedName("dk.cj")
    public static boolean[] field1701 = new boolean[112];

    @ObfuscatedName("dk.cm")
    public static int[] field1702 = new int[128];

    @ObfuscatedName("dk.cq")
    public static int field1703 = 0;

    @ObfuscatedName("dk.cu")
    public static int field1704 = 0;

    @ObfuscatedName("dk.ce")
    public static char[] field1705 = new char[128];

    @ObfuscatedName("dk.cg")
    public static int[] field1706 = new int[128];

    @ObfuscatedName("dk.ch")
    public static int[] field1707 = new int[128];

    @ObfuscatedName("dk.cn")
    public static int field1711 = 0;

    @ObfuscatedName("dk.cz")
    public static int field1710 = 0;

    @ObfuscatedName("dk.cw")
    public static int field1714 = 0;

    @ObfuscatedName("dk.ca")
    public static int field1684 = 0;

    @ObfuscatedName("dk.ck")
    public static volatile int field1712 = 0;

    @ObfuscatedName("dk.cf")
    public static int[] field1709 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("al.u(B)V")
    public static void method615() {
        if (Statics.field1662.toLowerCase().indexOf("microsoft") != -1) {
            field1709[186] = 57;
            field1709[187] = 27;
            field1709[188] = 71;
            field1709[189] = 26;
            field1709[190] = 72;
            field1709[191] = 73;
            field1709[192] = 58;
            field1709[219] = 42;
            field1709[220] = 74;
            field1709[221] = 43;
            field1709[222] = 59;
            field1709[223] = 28;
            return;
        }
        field1709[44] = 71;
        field1709[45] = 26;
        field1709[46] = 72;
        field1709[47] = 73;
        field1709[59] = 57;
        field1709[61] = 27;
        field1709[91] = 42;
        field1709[92] = 74;
        field1709[93] = 43;
        field1709[192] = 28;
        field1709[222] = 58;
        field1709[520] = 59;
    }

    @ObfuscatedName("ea.x(Ljava/awt/Component;B)V")
    public static void method2520(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1690);
        arg0.addFocusListener(field1690);
    }

    @ObfuscatedName("dk.i(I)V")
    public static void method1881() {
        if (field1690 != null) {
            class106 var0 = field1690;
            synchronized (field1690) {
                field1690 = null;
            }
        }
    }

    @ObfuscatedName("ch.a(I)V")
    public static void method1781() {
        class106 var0 = field1690;
        synchronized (field1690) {
            field1712++;
            field1710 = field1684;
            field1711 = 0;
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
                        if (!field1701[var2] && field1711 < field1707.length - 1) {
                            field1707[++field1711 - 1] = var2;
                        }
                        field1701[var2] = true;
                    }
                }
            }
            field1684 = field1714;
        }
    }

    @ObfuscatedName("gz.c(I)Z")
    public static final boolean method3347() {
        class106 var0 = field1690;
        synchronized (field1690) {
            if (field1710 == field1684) {
                return false;
            } else {
                Statics.field2135 = field1706[field1710];
                Statics.field2632 = field1705[field1710];
                field1710 = field1710 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1690 == null) {
            return;
        }
        field1712 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1709.length) {
            var3 = field1709[var2];
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
            int var4 = field1714 + 1 & 0x7F;
            if (field1710 != var4) {
                field1706[field1714] = var3;
                field1705[field1714] = 0;
                field1714 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1690 != null) {
            field1712 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1709.length) {
                var3 = field1709[var2] & 0xFFFFFF7F;
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
        if (field1690 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class204.field3062;
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
                    if (field1710 != var7) {
                        field1706[field1714] = -1;
                        field1705[field1714] = var2;
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
        if (field1690 != null) {
            field1704 = -1;
        }
    }
}
