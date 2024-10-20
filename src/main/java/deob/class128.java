package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dx")
public final class class128 implements KeyListener, FocusListener {

    @ObfuscatedName("dx.a")
    public static class128 field1992 = new class128();

    @ObfuscatedName("dx.cd")
    public static boolean[] field1991 = new boolean[112];

    @ObfuscatedName("dx.cn")
    public static int[] field2003 = new int[128];

    @ObfuscatedName("dx.cp")
    public static int field1997 = 0;

    @ObfuscatedName("dx.ck")
    public static int field1994 = 0;

    @ObfuscatedName("dx.cg")
    public static char[] field1995 = new char[128];

    @ObfuscatedName("dx.cy")
    public static int[] field1996 = new int[128];

    @ObfuscatedName("dx.cv")
    public static int[] field1981 = new int[128];

    @ObfuscatedName("dx.cc")
    public static int field1998 = 0;

    @ObfuscatedName("dx.cx")
    public static int field2002 = 0;

    @ObfuscatedName("dx.ce")
    public static int field2006 = 0;

    @ObfuscatedName("dx.cl")
    public static int field2001 = 0;

    @ObfuscatedName("dx.cz")
    public static volatile int field1976 = 0;

    @ObfuscatedName("dx.cm")
    public static int[] field1999 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("fv.a(Ljava/awt/Component;I)V")
    public static void method2899(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1992);
        arg0.addFocusListener(field1992);
    }

    @ObfuscatedName("dg.v(Ljava/awt/Component;I)V")
    public static void method2073(Component arg0) {
        arg0.removeKeyListener(field1992);
        arg0.removeFocusListener(field1992);
        field1994 = -1;
    }

    @ObfuscatedName("am.i(I)V")
    public static void method628() {
        if (field1992 != null) {
            class128 var0 = field1992;
            synchronized (field1992) {
                field1992 = null;
            }
        }
    }

    @ObfuscatedName("ai.b(I)V")
    public static void method730() {
        class128 var0 = field1992;
        synchronized (field1992) {
            field1976++;
            field2002 = field2001;
            field1998 = 0;
            if (field1994 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1991[var1] = false;
                }
                field1994 = field1997;
            } else {
                while (field1997 != field1994) {
                    int var2 = field2003[field1997];
                    field1997 = field1997 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1991[~var2] = false;
                    } else {
                        if (!field1991[var2] && field1998 < field1981.length - 1) {
                            field1981[++field1998 - 1] = var2;
                        }
                        field1991[var2] = true;
                    }
                }
            }
            field2001 = field2006;
        }
    }

    @ObfuscatedName("u.m(I)I")
    public static int method496() {
        return field1976;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1992 == null) {
            return;
        }
        field1976 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1999.length) {
            var3 = field1999[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1994 >= 0 && var3 >= 0) {
            field2003[field1994] = var3;
            field1994 = field1994 + 1 & 0x7F;
            if (field1997 == field1994) {
                field1994 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2006 + 1 & 0x7F;
            if (field2002 != var4) {
                field1996[field2006] = var3;
                field1995[field2006] = 0;
                field2006 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1992 != null) {
            field1976 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1999.length) {
                var3 = field1999[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1994 >= 0 && var3 >= 0) {
                field2003[field1994] = ~var3;
                field1994 = field1994 + 1 & 0x7F;
                if (field1997 == field1994) {
                    field1994 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1992 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class215.method2507(var2)) {
                int var3 = field2006 + 1 & 0x7F;
                if (field2002 != var3) {
                    field1996[field2006] = -1;
                    field1995[field2006] = var2;
                    field2006 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1992 != null) {
            field1994 = -1;
        }
    }
}
