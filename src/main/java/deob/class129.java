package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dt")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dt.t")
    public static class129 field1988 = new class129();

    @ObfuscatedName("dt.cz")
    public static boolean[] field1985 = new boolean[112];

    @ObfuscatedName("dt.cm")
    public static int[] field1990 = new int[128];

    @ObfuscatedName("dt.cx")
    public static int field1991 = 0;

    @ObfuscatedName("dt.ct")
    public static int field1975 = 0;

    @ObfuscatedName("dt.ci")
    public static char[] field1979 = new char[128];

    @ObfuscatedName("dt.cc")
    public static int[] field1994 = new int[128];

    @ObfuscatedName("dt.cg")
    public static int[] field1996 = new int[128];

    @ObfuscatedName("dt.ca")
    public static int field1993 = 0;

    @ObfuscatedName("dt.cn")
    public static int field1997 = 0;

    @ObfuscatedName("dt.cw")
    public static int field1998 = 0;

    @ObfuscatedName("dt.cd")
    public static int field1983 = 0;

    @ObfuscatedName("dt.cs")
    public static volatile int field2000 = 0;

    @ObfuscatedName("dt.cy")
    public static int[] field2001 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("i.t(Ljava/awt/Component;I)V")
    public static void method40(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1988);
        arg0.addFocusListener(field1988);
    }

    @ObfuscatedName("aq.b(B)V")
    public static void method928() {
        if (field1988 != null) {
            class129 var0 = field1988;
            synchronized (field1988) {
                field1988 = null;
            }
        }
    }

    @ObfuscatedName("bx.p(B)Z")
    public static final boolean method1464() {
        class129 var0 = field1988;
        synchronized (field1988) {
            if (field1997 == field1983) {
                return false;
            } else {
                Statics.field2005 = field1994[field1997];
                Statics.field1445 = field1979[field1997];
                field1997 = field1997 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("w.e(I)I")
    public static int method525() {
        return field2000;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1988 == null) {
            return;
        }
        field2000 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2001.length) {
            var3 = field2001[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1975 >= 0 && var3 >= 0) {
            field1990[field1975] = var3;
            field1975 = field1975 + 1 & 0x7F;
            if (field1991 == field1975) {
                field1975 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1998 + 1 & 0x7F;
            if (field1997 != var4) {
                field1994[field1998] = var3;
                field1979[field1998] = 0;
                field1998 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1988 != null) {
            field2000 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2001.length) {
                var3 = field2001[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1975 >= 0 && var3 >= 0) {
                field1990[field1975] = ~var3;
                field1975 = field1975 + 1 & 0x7F;
                if (field1991 == field1975) {
                    field1975 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1988 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class156.field2546;
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
                    int var7 = field1998 + 1 & 0x7F;
                    if (field1997 != var7) {
                        field1994[field1998] = -1;
                        field1979[field1998] = var2;
                        field1998 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1988 != null) {
            field1975 = -1;
        }
    }
}
