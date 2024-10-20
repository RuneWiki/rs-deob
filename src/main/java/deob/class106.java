package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dc")
public final class class106 implements KeyListener, FocusListener {

    @ObfuscatedName("dc.o")
    public static class106 field1718 = new class106();

    @ObfuscatedName("dc.co")
    public static boolean[] field1729 = new boolean[112];

    @ObfuscatedName("dc.ck")
    public static int[] field1717 = new int[128];

    @ObfuscatedName("dc.cn")
    public static int field1702 = 0;

    @ObfuscatedName("dc.cr")
    public static int field1710 = 0;

    @ObfuscatedName("dc.ci")
    public static char[] field1715 = new char[128];

    @ObfuscatedName("dc.cc")
    public static int[] field1716 = new int[128];

    @ObfuscatedName("dc.cq")
    public static int[] field1722 = new int[128];

    @ObfuscatedName("dc.cg")
    public static int field1723 = 0;

    @ObfuscatedName("dc.cw")
    public static int field1724 = 0;

    @ObfuscatedName("dc.cv")
    public static int field1725 = 0;

    @ObfuscatedName("dc.cs")
    public static int field1697 = 0;

    @ObfuscatedName("dc.cf")
    public static volatile int field1727 = 0;

    @ObfuscatedName("dc.cd")
    public static int[] field1728 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("x.o(S)V")
    public static void method186() {
        if (Statics.field1679.toLowerCase().indexOf("microsoft") != -1) {
            field1728[186] = 57;
            field1728[187] = 27;
            field1728[188] = 71;
            field1728[189] = 26;
            field1728[190] = 72;
            field1728[191] = 73;
            field1728[192] = 58;
            field1728[219] = 42;
            field1728[220] = 74;
            field1728[221] = 43;
            field1728[222] = 59;
            field1728[223] = 28;
            return;
        }
        field1728[44] = 71;
        field1728[45] = 26;
        field1728[46] = 72;
        field1728[47] = 73;
        field1728[59] = 57;
        field1728[61] = 27;
        field1728[91] = 42;
        field1728[92] = 74;
        field1728[93] = 43;
        field1728[192] = 28;
        field1728[222] = 58;
        field1728[520] = 59;
    }

    @ObfuscatedName("au.m(Ljava/awt/Component;S)V")
    public static void method592(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1718);
        arg0.addFocusListener(field1718);
    }

    @ObfuscatedName("cg.b(Ljava/awt/Component;B)V")
    public static void method1776(Component arg0) {
        arg0.removeKeyListener(field1718);
        arg0.removeFocusListener(field1718);
        field1710 = -1;
    }

    @ObfuscatedName("aw.g(I)V")
    public static void method716() {
        if (field1718 != null) {
            class106 var0 = field1718;
            synchronized (field1718) {
                field1718 = null;
            }
        }
    }

    @ObfuscatedName("r.l(I)V")
    public static void method233() {
        class106 var0 = field1718;
        synchronized (field1718) {
            field1727++;
            field1724 = field1697;
            field1723 = 0;
            if (field1710 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1729[var1] = false;
                }
                field1710 = field1702;
            } else {
                while (field1710 != field1702) {
                    int var2 = field1717[field1702];
                    field1702 = field1702 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1729[~var2] = false;
                    } else {
                        if (!field1729[var2] && field1723 < field1722.length - 1) {
                            field1722[++field1723 - 1] = var2;
                        }
                        field1729[var2] = true;
                    }
                }
            }
            field1697 = field1725;
        }
    }

    @ObfuscatedName("y.c(I)Z")
    public static final boolean method148() {
        class106 var0 = field1718;
        synchronized (field1718) {
            if (field1724 == field1697) {
                return false;
            } else {
                Statics.field2671 = field1716[field1724];
                Statics.field1530 = field1715[field1724];
                field1724 = field1724 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1718 == null) {
            return;
        }
        field1727 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1728.length) {
            var3 = field1728[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1710 >= 0 && var3 >= 0) {
            field1717[field1710] = var3;
            field1710 = field1710 + 1 & 0x7F;
            if (field1710 == field1702) {
                field1710 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1725 + 1 & 0x7F;
            if (field1724 != var4) {
                field1716[field1725] = var3;
                field1715[field1725] = 0;
                field1725 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1718 != null) {
            field1727 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1728.length) {
                var3 = field1728[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1710 >= 0 && var3 >= 0) {
                field1717[field1710] = ~var3;
                field1710 = field1710 + 1 & 0x7F;
                if (field1710 == field1702) {
                    field1710 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1718 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class204.method726(var2)) {
                int var3 = field1725 + 1 & 0x7F;
                if (field1724 != var3) {
                    field1716[field1725] = -1;
                    field1715[field1725] = var2;
                    field1725 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1718 != null) {
            field1710 = -1;
        }
    }
}
