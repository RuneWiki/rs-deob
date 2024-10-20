package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dw")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dw.k")
    public static class124 field1961 = new class124();

    @ObfuscatedName("dw.cg")
    public static boolean[] field1976 = new boolean[112];

    @ObfuscatedName("dw.cx")
    public static int[] field1992 = new int[128];

    @ObfuscatedName("dw.cc")
    public static int field1978 = 0;

    @ObfuscatedName("dw.cq")
    public static int field1979 = 0;

    @ObfuscatedName("dw.cv")
    public static char[] field1980 = new char[128];

    @ObfuscatedName("dw.cf")
    public static int[] field1981 = new int[128];

    @ObfuscatedName("dw.ce")
    public static int[] field1983 = new int[128];

    @ObfuscatedName("dw.cm")
    public static int field1960 = 0;

    @ObfuscatedName("dw.cr")
    public static int field1977 = 0;

    @ObfuscatedName("dw.ck")
    public static int field1984 = 0;

    @ObfuscatedName("dw.ca")
    public static int field1986 = 0;

    @ObfuscatedName("dw.cp")
    public static volatile int field1987 = 0;

    @ObfuscatedName("dw.cw")
    public static int[] field1982 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dj.k(B)V")
    public static void method2562() {
        if (field1961 != null) {
            class124 var0 = field1961;
            synchronized (field1961) {
                field1961 = null;
            }
        }
    }

    @ObfuscatedName("t.b(B)V")
    public static void method31() {
        class124 var0 = field1961;
        synchronized (field1961) {
            field1987++;
            field1977 = field1986;
            field1960 = 0;
            if (field1979 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1976[var1] = false;
                }
                field1979 = field1978;
            } else {
                while (field1979 != field1978) {
                    int var2 = field1992[field1978];
                    field1978 = field1978 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1976[~var2] = false;
                    } else {
                        if (!field1976[var2] && field1960 < field1983.length - 1) {
                            field1983[++field1960 - 1] = var2;
                        }
                        field1976[var2] = true;
                    }
                }
            }
            field1986 = field1984;
        }
    }

    @ObfuscatedName("cl.e(I)Z")
    public static final boolean method2056() {
        class124 var0 = field1961;
        synchronized (field1961) {
            if (field1986 == field1977) {
                return false;
            } else {
                Statics.field2035 = field1981[field1977];
                Statics.field1536 = field1980[field1977];
                field1977 = field1977 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("w.i(I)I")
    public static int method132() {
        return field1987;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1961 == null) {
            return;
        }
        field1987 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1982.length) {
            var3 = field1982[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1979 >= 0 && var3 >= 0) {
            field1992[field1979] = var3;
            field1979 = field1979 + 1 & 0x7F;
            if (field1979 == field1978) {
                field1979 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1984 + 1 & 0x7F;
            if (field1977 != var4) {
                field1981[field1984] = var3;
                field1980[field1984] = 0;
                field1984 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1961 != null) {
            field1987 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1982.length) {
                var3 = field1982[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1979 >= 0 && var3 >= 0) {
                field1992[field1979] = ~var3;
                field1979 = field1979 + 1 & 0x7F;
                if (field1979 == field1978) {
                    field1979 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1961 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class201.field2966;
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
                    int var7 = field1984 + 1 & 0x7F;
                    if (field1977 != var7) {
                        field1981[field1984] = -1;
                        field1980[field1984] = var2;
                        field1984 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1961 != null) {
            field1979 = -1;
        }
    }
}
