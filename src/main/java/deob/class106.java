package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dt")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dt.d")
    public static class106 field1702 = new class106();

    @ObfuscatedName("dt.ct")
    public static boolean[] field1696 = new boolean[112];

    @ObfuscatedName("dt.cy")
    public static int[] field1697 = new int[128];

    @ObfuscatedName("dt.cl")
    public static int field1698 = 0;

    @ObfuscatedName("dt.cg")
    public static int field1712 = 0;

    @ObfuscatedName("dt.cn")
    public static char[] field1700 = new char[128];

    @ObfuscatedName("dt.ce")
    public static int[] field1703 = new int[128];

    @ObfuscatedName("dt.cr")
    public static int[] field1701 = new int[128];

    @ObfuscatedName("dt.cc")
    public static int field1708 = 0;

    @ObfuscatedName("dt.ci")
    public static int field1704 = 0;

    @ObfuscatedName("dt.co")
    public static int field1705 = 0;

    @ObfuscatedName("dt.cv")
    public static int field1695 = 0;

    @ObfuscatedName("dt.cp")
    public static volatile int field1707 = 0;

    @ObfuscatedName("dt.ca")
    public static int[] field1699 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("aw.d(I)V")
    public static void method758() {
        if (Statics.field1660.toLowerCase().indexOf("microsoft") != -1) {
            field1699[186] = 57;
            field1699[187] = 27;
            field1699[188] = 71;
            field1699[189] = 26;
            field1699[190] = 72;
            field1699[191] = 73;
            field1699[192] = 58;
            field1699[219] = 42;
            field1699[220] = 74;
            field1699[221] = 43;
            field1699[222] = 59;
            field1699[223] = 28;
            return;
        }
        field1699[44] = 71;
        field1699[45] = 26;
        field1699[46] = 72;
        field1699[47] = 73;
        field1699[59] = 57;
        field1699[61] = 27;
        field1699[91] = 42;
        field1699[92] = 74;
        field1699[93] = 43;
        field1699[192] = 28;
        field1699[222] = 58;
        field1699[520] = 59;
    }

    @ObfuscatedName("h.c(Ljava/awt/Component;B)V")
    public static void method215(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1702);
        arg0.addFocusListener(field1702);
    }

    @ObfuscatedName("r.n(Ljava/awt/Component;I)V")
    public static void method170(Component arg0) {
        arg0.removeKeyListener(field1702);
        arg0.removeFocusListener(field1702);
        field1712 = -1;
    }

    @ObfuscatedName("dg.q(I)V")
    public static void method1885() {
        if (field1702 != null) {
            class106 var0 = field1702;
            synchronized (field1702) {
                field1702 = null;
            }
        }
    }

    @ObfuscatedName("l.t(B)V")
    public static void method105() {
        class106 var0 = field1702;
        synchronized (field1702) {
            field1707++;
            field1704 = field1695;
            field1708 = 0;
            if (field1712 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1696[var1] = false;
                }
                field1712 = field1698;
            } else {
                while (field1712 != field1698) {
                    int var2 = field1697[field1698];
                    field1698 = field1698 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1696[~var2] = false;
                    } else {
                        if (!field1696[var2] && field1708 < field1701.length - 1) {
                            field1701[++field1708 - 1] = var2;
                        }
                        field1696[var2] = true;
                    }
                }
            }
            if (field1708 > 0) {
                field1707 = 0;
            }
            field1695 = field1705;
        }
    }

    @ObfuscatedName("ap.p(I)Z")
    public static final boolean method897() {
        class106 var0 = field1702;
        synchronized (field1702) {
            if (field1704 == field1695) {
                return false;
            } else {
                Statics.field2653 = field1703[field1704];
                Statics.field572 = field1700[field1704];
                field1704 = field1704 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("fy.u(I)I")
    public static int method3080() {
        return field1707;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1702 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1699.length) {
            var3 = field1699[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1712 >= 0 && var3 >= 0) {
            field1697[field1712] = var3;
            field1712 = field1712 + 1 & 0x7F;
            if (field1712 == field1698) {
                field1712 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1705 + 1 & 0x7F;
            if (field1704 != var4) {
                field1703[field1705] = var3;
                field1700[field1705] = 0;
                field1705 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1702 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1699.length) {
                var3 = field1699[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1712 >= 0 && var3 >= 0) {
                field1697[field1712] = ~var3;
                field1712 = field1712 + 1 & 0x7F;
                if (field1712 == field1698) {
                    field1712 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1702 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class211.field3135;
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
                    int var7 = field1705 + 1 & 0x7F;
                    if (field1704 != var7) {
                        field1703[field1705] = -1;
                        field1700[field1705] = var2;
                        field1705 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1702 != null) {
            field1712 = -1;
        }
    }
}
