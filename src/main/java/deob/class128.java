package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dq")
public final class class128 implements KeyListener, FocusListener {

    @ObfuscatedName("dq.b")
    public static class128 field2007 = new class128();

    @ObfuscatedName("dq.cn")
    public static boolean[] field1992 = new boolean[112];

    @ObfuscatedName("dq.cl")
    public static int[] field1993 = new int[128];

    @ObfuscatedName("dq.cz")
    public static int field1990 = 0;

    @ObfuscatedName("dq.cv")
    public static int field1995 = 0;

    @ObfuscatedName("dq.cb")
    public static char[] field1996 = new char[128];

    @ObfuscatedName("dq.cs")
    public static int[] field1997 = new int[128];

    @ObfuscatedName("dq.cc")
    public static int[] field1998 = new int[128];

    @ObfuscatedName("dq.cw")
    public static int field1999 = 0;

    @ObfuscatedName("dq.ca")
    public static int field2001 = 0;

    @ObfuscatedName("dq.cu")
    public static int field1979 = 0;

    @ObfuscatedName("dq.cr")
    public static int field2002 = 0;

    @ObfuscatedName("dq.co")
    public static volatile int field2003 = 0;

    @ObfuscatedName("dq.cx")
    public static int[] field2004 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("p.e(Ljava/awt/Component;I)V")
    public static void method66(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2007);
        arg0.addFocusListener(field2007);
    }

    @ObfuscatedName("aw.i(I)V")
    public static void method749() {
        if (field2007 != null) {
            class128 var0 = field2007;
            synchronized (field2007) {
                field2007 = null;
            }
        }
    }

    @ObfuscatedName("cl.k(B)Z")
    public static final boolean method1862() {
        class128 var0 = field2007;
        synchronized (field2007) {
            if (field2002 == field2001) {
                return false;
            } else {
                Statics.field1005 = field1997[field2001];
                Statics.field2858 = field1996[field2001];
                field2001 = field2001 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("p.h(I)I")
    public static int method68() {
        return field2003;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2007 == null) {
            return;
        }
        field2003 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2004.length) {
            var3 = field2004[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1995 >= 0 && var3 >= 0) {
            field1993[field1995] = var3;
            field1995 = field1995 + 1 & 0x7F;
            if (field1995 == field1990) {
                field1995 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1979 + 1 & 0x7F;
            if (field2001 != var4) {
                field1997[field1979] = var3;
                field1996[field1979] = 0;
                field1979 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2007 != null) {
            field2003 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2004.length) {
                var3 = field2004[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1995 >= 0 && var3 >= 0) {
                field1993[field1995] = ~var3;
                field1995 = field1995 + 1 & 0x7F;
                if (field1995 == field1990) {
                    field1995 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2007 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class215.field3035;
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
                    int var7 = field1979 + 1 & 0x7F;
                    if (field2001 != var7) {
                        field1997[field1979] = -1;
                        field1996[field1979] = var2;
                        field1979 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2007 != null) {
            field1995 = -1;
        }
    }
}
