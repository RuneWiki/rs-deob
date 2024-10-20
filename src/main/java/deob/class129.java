package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dr")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dr.n")
    public static class129 field1991 = new class129();

    @ObfuscatedName("dr.cy")
    public static boolean[] field2010 = new boolean[112];

    @ObfuscatedName("dr.cz")
    public static int[] field2004 = new int[128];

    @ObfuscatedName("dr.ch")
    public static int field2005 = 0;

    @ObfuscatedName("dr.cl")
    public static int field1988 = 0;

    @ObfuscatedName("dr.ci")
    public static char[] field2007 = new char[128];

    @ObfuscatedName("dr.cg")
    public static int[] field2008 = new int[128];

    @ObfuscatedName("dr.ce")
    public static int[] field1993 = new int[128];

    @ObfuscatedName("dr.ct")
    public static int field2002 = 0;

    @ObfuscatedName("dr.cr")
    public static int field2006 = 0;

    @ObfuscatedName("dr.cc")
    public static int field2012 = 0;

    @ObfuscatedName("dr.cx")
    public static int field2013 = 0;

    @ObfuscatedName("dr.cw")
    public static volatile int field2014 = 0;

    @ObfuscatedName("dr.ca")
    public static int[] field2015 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dj.n(I)V")
    public static void method2473() {
        if (Statics.field1931.toLowerCase().indexOf("microsoft") != -1) {
            field2015[186] = 57;
            field2015[187] = 27;
            field2015[188] = 71;
            field2015[189] = 26;
            field2015[190] = 72;
            field2015[191] = 73;
            field2015[192] = 58;
            field2015[219] = 42;
            field2015[220] = 74;
            field2015[221] = 43;
            field2015[222] = 59;
            field2015[223] = 28;
            return;
        }
        field2015[44] = 71;
        field2015[45] = 26;
        field2015[46] = 72;
        field2015[47] = 73;
        field2015[59] = 57;
        field2015[61] = 27;
        field2015[91] = 42;
        field2015[92] = 74;
        field2015[93] = 43;
        field2015[192] = 28;
        field2015[222] = 58;
        field2015[520] = 59;
    }

    @ObfuscatedName("dq.w(Ljava/awt/Component;I)V")
    public static void method2493(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1991);
        arg0.addFocusListener(field1991);
    }

    @ObfuscatedName("ez.i(Ljava/awt/Component;I)V")
    public static void method2775(Component arg0) {
        arg0.removeKeyListener(field1991);
        arg0.removeFocusListener(field1991);
        field1988 = -1;
    }

    @ObfuscatedName("ai.e(B)Z")
    public static final boolean method841() {
        class129 var0 = field1991;
        synchronized (field1991) {
            if (field2013 == field2006) {
                return false;
            } else {
                Statics.field204 = field2008[field2006];
                Statics.field1860 = field2007[field2006];
                field2006 = field2006 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ci.h(I)I")
    public static int method1900() {
        return field2014;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1991 == null) {
            return;
        }
        field2014 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2015.length) {
            var3 = field2015[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1988 >= 0 && var3 >= 0) {
            field2004[field1988] = var3;
            field1988 = field1988 + 1 & 0x7F;
            if (field2005 == field1988) {
                field1988 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2012 + 1 & 0x7F;
            if (field2006 != var4) {
                field2008[field2012] = var3;
                field2007[field2012] = 0;
                field2012 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1991 != null) {
            field2014 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2015.length) {
                var3 = field2015[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1988 >= 0 && var3 >= 0) {
                field2004[field1988] = ~var3;
                field1988 = field1988 + 1 & 0x7F;
                if (field2005 == field1988) {
                    field1988 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1991 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class156.field2565;
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
                    int var7 = field2012 + 1 & 0x7F;
                    if (field2006 != var7) {
                        field2008[field2012] = -1;
                        field2007[field2012] = var2;
                        field2012 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1991 != null) {
            field1988 = -1;
        }
    }
}
