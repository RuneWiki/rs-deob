package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dj")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dj.n")
    public static class129 field2028 = new class129();

    @ObfuscatedName("dj.cp")
    public static boolean[] field2025 = new boolean[112];

    @ObfuscatedName("dj.cg")
    public static int[] field2026 = new int[128];

    @ObfuscatedName("dj.cr")
    public static int field2017 = 0;

    @ObfuscatedName("dj.cm")
    public static int field2010 = 0;

    @ObfuscatedName("dj.cu")
    public static char[] field2029 = new char[128];

    @ObfuscatedName("dj.cf")
    public static int[] field2030 = new int[128];

    @ObfuscatedName("dj.ci")
    public static int[] field2031 = new int[128];

    @ObfuscatedName("dj.ca")
    public static int field2032 = 0;

    @ObfuscatedName("dj.cc")
    public static int field2033 = 0;

    @ObfuscatedName("dj.cw")
    public static int field2038 = 0;

    @ObfuscatedName("dj.cl")
    public static int field2035 = 0;

    @ObfuscatedName("dj.cs")
    public static volatile int field2036 = 0;

    @ObfuscatedName("dj.cb")
    public static int[] field2037 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dp.n(I)V")
    public static void method2399() {
        if (Statics.field2001.toLowerCase().indexOf("microsoft") != -1) {
            field2037[186] = 57;
            field2037[187] = 27;
            field2037[188] = 71;
            field2037[189] = 26;
            field2037[190] = 72;
            field2037[191] = 73;
            field2037[192] = 58;
            field2037[219] = 42;
            field2037[220] = 74;
            field2037[221] = 43;
            field2037[222] = 59;
            field2037[223] = 28;
            return;
        }
        field2037[44] = 71;
        field2037[45] = 26;
        field2037[46] = 72;
        field2037[47] = 73;
        field2037[59] = 57;
        field2037[61] = 27;
        field2037[91] = 42;
        field2037[92] = 74;
        field2037[93] = 43;
        field2037[192] = 28;
        field2037[222] = 58;
        field2037[520] = 59;
    }

    @ObfuscatedName("dr.g(Ljava/awt/Component;I)V")
    public static void method2488(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2028);
        arg0.addFocusListener(field2028);
    }

    @ObfuscatedName("ay.a(Ljava/awt/Component;I)V")
    public static void method944(Component arg0) {
        arg0.removeKeyListener(field2028);
        arg0.removeFocusListener(field2028);
        field2010 = -1;
    }

    @ObfuscatedName("fd.m(I)V")
    public static void method3025() {
        if (field2028 != null) {
            class129 var0 = field2028;
            synchronized (field2028) {
                field2028 = null;
            }
        }
    }

    @ObfuscatedName("ce.s(I)V")
    public static void method1683() {
        class129 var0 = field2028;
        synchronized (field2028) {
            field2036++;
            field2033 = field2035;
            field2032 = 0;
            if (field2010 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2025[var1] = false;
                }
                field2010 = field2017;
            } else {
                while (field2017 != field2010) {
                    int var2 = field2026[field2017];
                    field2017 = field2017 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2025[~var2] = false;
                    } else {
                        if (!field2025[var2] && field2032 < field2031.length - 1) {
                            field2031[++field2032 - 1] = var2;
                        }
                        field2025[var2] = true;
                    }
                }
            }
            field2035 = field2038;
        }
    }

    @ObfuscatedName("bz.j(I)Z")
    public static final boolean method1499() {
        class129 var0 = field2028;
        synchronized (field2028) {
            if (field2035 == field2033) {
                return false;
            } else {
                Statics.field1306 = field2030[field2033];
                Statics.field175 = field2029[field2033];
                field2033 = field2033 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("cy.f(I)I")
    public static int method1857() {
        return field2036;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2028 == null) {
            return;
        }
        field2036 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2037.length) {
            var3 = field2037[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2010 >= 0 && var3 >= 0) {
            field2026[field2010] = var3;
            field2010 = field2010 + 1 & 0x7F;
            if (field2017 == field2010) {
                field2010 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2038 + 1 & 0x7F;
            if (field2033 != var4) {
                field2030[field2038] = var3;
                field2029[field2038] = 0;
                field2038 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2028 != null) {
            field2036 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2037.length) {
                var3 = field2037[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2010 >= 0 && var3 >= 0) {
                field2026[field2010] = ~var3;
                field2010 = field2010 + 1 & 0x7F;
                if (field2017 == field2010) {
                    field2010 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2028 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class156.field2553;
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
                    int var7 = field2038 + 1 & 0x7F;
                    if (field2033 != var7) {
                        field2030[field2038] = -1;
                        field2029[field2038] = var2;
                        field2038 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2028 != null) {
            field2010 = -1;
        }
    }
}
