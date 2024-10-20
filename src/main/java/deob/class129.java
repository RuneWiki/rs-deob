package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dt")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dt.o")
    public static class129 field1994 = new class129();

    @ObfuscatedName("dt.cd")
    public static boolean[] field2010 = new boolean[112];

    @ObfuscatedName("dt.cn")
    public static int[] field1996 = new int[128];

    @ObfuscatedName("dt.ca")
    public static int field1987 = 0;

    @ObfuscatedName("dt.ct")
    public static int field2001 = 0;

    @ObfuscatedName("dt.ci")
    public static char[] field2006 = new char[128];

    @ObfuscatedName("dt.cz")
    public static int[] field2007 = new int[128];

    @ObfuscatedName("dt.cl")
    public static int[] field2019 = new int[128];

    @ObfuscatedName("dt.cc")
    public static int field2009 = 0;

    @ObfuscatedName("dt.cx")
    public static int field1999 = 0;

    @ObfuscatedName("dt.cg")
    public static int field1990 = 0;

    @ObfuscatedName("dt.cp")
    public static int field2012 = 0;

    @ObfuscatedName("dt.cq")
    public static volatile int field2013 = 0;

    @ObfuscatedName("dt.cb")
    public static int[] field2014 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("de.o(I)V")
    public static void method2548() {
        if (Statics.field1984.toLowerCase().indexOf("microsoft") != -1) {
            field2014[186] = 57;
            field2014[187] = 27;
            field2014[188] = 71;
            field2014[189] = 26;
            field2014[190] = 72;
            field2014[191] = 73;
            field2014[192] = 58;
            field2014[219] = 42;
            field2014[220] = 74;
            field2014[221] = 43;
            field2014[222] = 59;
            field2014[223] = 28;
            return;
        }
        field2014[44] = 71;
        field2014[45] = 26;
        field2014[46] = 72;
        field2014[47] = 73;
        field2014[59] = 57;
        field2014[61] = 27;
        field2014[91] = 42;
        field2014[92] = 74;
        field2014[93] = 43;
        field2014[192] = 28;
        field2014[222] = 58;
        field2014[520] = 59;
    }

    @ObfuscatedName("q.l(I)V")
    public static void method42() {
        if (field1994 != null) {
            class129 var0 = field1994;
            synchronized (field1994) {
                field1994 = null;
            }
        }
    }

    @ObfuscatedName("l.g(I)V")
    public static void method11() {
        class129 var0 = field1994;
        synchronized (field1994) {
            field2013++;
            field1999 = field2012;
            field2009 = 0;
            if (field2001 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2010[var1] = false;
                }
                field2001 = field1987;
            } else {
                while (field2001 != field1987) {
                    int var2 = field1996[field1987];
                    field1987 = field1987 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2010[~var2] = false;
                    } else {
                        if (!field2010[var2] && field2009 < field2019.length - 1) {
                            field2019[++field2009 - 1] = var2;
                        }
                        field2010[var2] = true;
                    }
                }
            }
            field2012 = field1990;
        }
    }

    @ObfuscatedName("cm.u(B)Z")
    public static final boolean method1843() {
        class129 var0 = field1994;
        synchronized (field1994) {
            if (field2012 == field1999) {
                return false;
            } else {
                Statics.field2002 = field2007[field1999];
                Statics.field1815 = field2006[field1999];
                field1999 = field1999 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1994 == null) {
            return;
        }
        field2013 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2014.length) {
            var3 = field2014[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2001 >= 0 && var3 >= 0) {
            field1996[field2001] = var3;
            field2001 = field2001 + 1 & 0x7F;
            if (field2001 == field1987) {
                field2001 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1990 + 1 & 0x7F;
            if (field1999 != var4) {
                field2007[field1990] = var3;
                field2006[field1990] = 0;
                field1990 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1994 != null) {
            field2013 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2014.length) {
                var3 = field2014[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2001 >= 0 && var3 >= 0) {
                field1996[field2001] = ~var3;
                field2001 = field2001 + 1 & 0x7F;
                if (field2001 == field1987) {
                    field2001 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1994 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class156.method3067(var2)) {
                int var3 = field1990 + 1 & 0x7F;
                if (field1999 != var3) {
                    field2007[field1990] = -1;
                    field2006[field1990] = var2;
                    field1990 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1994 != null) {
            field2001 = -1;
        }
    }
}
