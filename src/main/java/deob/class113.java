package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("bs")
public final class class113 implements KeyListener, FocusListener {

    @ObfuscatedName("bs.b")
    public static class113 field1865 = new class113();

    @ObfuscatedName("bs.ca")
    public static int[] field1882 = new int[128];

    @ObfuscatedName("bs.cx")
    public static volatile int field1887 = 0;

    @ObfuscatedName("bs.cu")
    public static int field1884 = 0;

    @ObfuscatedName("bs.ct")
    public static int field1885 = 0;

    @ObfuscatedName("bs.cs")
    public static int field1879 = 0;

    @ObfuscatedName("bs.cq")
    public static int field1883 = 0;

    @ObfuscatedName("bs.cr")
    public static int[] field1881 = new int[128];

    @ObfuscatedName("bs.cp")
    public static char[] field1880 = new char[128];

    @ObfuscatedName("bs.cm")
    public static boolean[] field1876 = new boolean[112];

    @ObfuscatedName("bs.cl")
    public static int field1878 = 0;

    @ObfuscatedName("bs.cg")
    public static int field1868 = 0;

    @ObfuscatedName("bs.cf")
    public static int[] field1888 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("bs.cc")
    public static int[] field1893 = new int[128];

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1865 != null) {
            field1879 = -1;
        }
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1865 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class101.field1396;
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
                    int var7 = field1885 + 1 & 0x7F;
                    if (field1884 != var7) {
                        field1881[field1885] = -1;
                        field1880[field1885] = var2;
                        field1885 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1865 != null) {
            field1887 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1888.length) {
                var3 = field1888[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1879 >= 0 && var3 >= 0) {
                field1893[field1879] = ~var3;
                field1879 = field1879 + 1 & 0x7F;
                if (field1879 == field1878) {
                    field1879 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1865 == null) {
            return;
        }
        field1887 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1888.length) {
            var3 = field1888[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1879 >= 0 && var3 >= 0) {
            field1893[field1879] = var3;
            field1879 = field1879 + 1 & 0x7F;
            if (field1879 == field1878) {
                field1879 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1885 + 1 & 0x7F;
            if (field1884 != var4) {
                field1881[field1885] = var3;
                field1880[field1885] = 0;
                field1885 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    @ObfuscatedName("df.h(B)V")
    public static void method552() {
        if (field1865 != null) {
            class113 var0 = field1865;
            synchronized (field1865) {
                field1865 = null;
            }
        }
    }

    @ObfuscatedName("h.b(Ljava/awt/Component;B)V")
    public static void method1180(Component arg0) {
        arg0.removeKeyListener(field1865);
        arg0.removeFocusListener(field1865);
        field1879 = -1;
    }

    @ObfuscatedName("ax.k(I)I")
    public static int method2907() {
        return field1887;
    }
}
