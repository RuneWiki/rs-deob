package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dh")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dh.q")
    public static class106 field1718 = new class106();

    @ObfuscatedName("dh.cj")
    public static boolean[] field1714 = new boolean[112];

    @ObfuscatedName("dh.cg")
    public static int[] field1715 = new int[128];

    @ObfuscatedName("dh.cb")
    public static int field1716 = 0;

    @ObfuscatedName("dh.cp")
    public static int field1727 = 0;

    @ObfuscatedName("dh.cu")
    public static char[] field1728 = new char[128];

    @ObfuscatedName("dh.cm")
    public static int[] field1707 = new int[128];

    @ObfuscatedName("dh.ci")
    public static int[] field1720 = new int[128];

    @ObfuscatedName("dh.cr")
    public static int field1721 = 0;

    @ObfuscatedName("dh.ck")
    public static int field1711 = 0;

    @ObfuscatedName("dh.cd")
    public static int field1723 = 0;

    @ObfuscatedName("dh.cv")
    public static int field1724 = 0;

    @ObfuscatedName("dh.co")
    public static volatile int field1725 = 0;

    @ObfuscatedName("dh.cl")
    public static int[] field1719 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("s.q(I)V")
    public static void method151() {
        if (Statics.field1686.toLowerCase().indexOf("microsoft") != -1) {
            field1719[186] = 57;
            field1719[187] = 27;
            field1719[188] = 71;
            field1719[189] = 26;
            field1719[190] = 72;
            field1719[191] = 73;
            field1719[192] = 58;
            field1719[219] = 42;
            field1719[220] = 74;
            field1719[221] = 43;
            field1719[222] = 59;
            field1719[223] = 28;
            return;
        }
        field1719[44] = 71;
        field1719[45] = 26;
        field1719[46] = 72;
        field1719[47] = 73;
        field1719[59] = 57;
        field1719[61] = 27;
        field1719[91] = 42;
        field1719[92] = 74;
        field1719[93] = 43;
        field1719[192] = 28;
        field1719[222] = 58;
        field1719[520] = 59;
    }

    @ObfuscatedName("fu.d(Ljava/awt/Component;I)V")
    public static void method3040(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1718);
        arg0.addFocusListener(field1718);
    }

    @ObfuscatedName("j.h(I)V")
    public static void method58() {
        if (field1718 != null) {
            class106 var0 = field1718;
            synchronized (field1718) {
                field1718 = null;
            }
        }
    }

    @ObfuscatedName("x.p(I)V")
    public static void method243() {
        class106 var0 = field1718;
        synchronized (field1718) {
            field1725++;
            field1711 = field1724;
            field1721 = 0;
            if (field1727 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1714[var1] = false;
                }
                field1727 = field1716;
            } else {
                while (field1727 != field1716) {
                    int var2 = field1715[field1716];
                    field1716 = field1716 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1714[~var2] = false;
                    } else {
                        if (!field1714[var2] && field1721 < field1720.length - 1) {
                            field1720[++field1721 - 1] = var2;
                        }
                        field1714[var2] = true;
                    }
                }
            }
            field1724 = field1723;
        }
    }

    @ObfuscatedName("fd.j(B)Z")
    public static final boolean method2941() {
        class106 var0 = field1718;
        synchronized (field1718) {
            if (field1724 == field1711) {
                return false;
            } else {
                Statics.field73 = field1707[field1711];
                Statics.field773 = field1728[field1711];
                field1711 = field1711 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("am.n(I)I")
    public static int method691() {
        return field1725;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1718 == null) {
            return;
        }
        field1725 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1719.length) {
            var3 = field1719[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1727 >= 0 && var3 >= 0) {
            field1715[field1727] = var3;
            field1727 = field1727 + 1 & 0x7F;
            if (field1727 == field1716) {
                field1727 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1723 + 1 & 0x7F;
            if (field1711 != var4) {
                field1707[field1723] = var3;
                field1728[field1723] = 0;
                field1723 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1718 != null) {
            field1725 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1719.length) {
                var3 = field1719[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1727 >= 0 && var3 >= 0) {
                field1715[field1727] = ~var3;
                field1727 = field1727 + 1 & 0x7F;
                if (field1727 == field1716) {
                    field1727 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1718 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class204.field3078;
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
                    int var7 = field1723 + 1 & 0x7F;
                    if (field1711 != var7) {
                        field1707[field1723] = -1;
                        field1728[field1723] = var2;
                        field1723 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1718 != null) {
            field1727 = -1;
        }
    }
}
