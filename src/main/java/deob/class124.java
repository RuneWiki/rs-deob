package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dl")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dl.g")
    public static class124 field1976 = new class124();

    @ObfuscatedName("dl.cx")
    public static boolean[] field1975 = new boolean[112];

    @ObfuscatedName("dl.cy")
    public static int[] field1961 = new int[128];

    @ObfuscatedName("dl.cp")
    public static int field1956 = 0;

    @ObfuscatedName("dl.ck")
    public static int field1978 = 0;

    @ObfuscatedName("dl.cr")
    public static char[] field1979 = new char[128];

    @ObfuscatedName("dl.cw")
    public static int[] field1980 = new int[128];

    @ObfuscatedName("dl.cb")
    public static int[] field1981 = new int[128];

    @ObfuscatedName("dl.cj")
    public static int field1982 = 0;

    @ObfuscatedName("dl.ch")
    public static int field1953 = 0;

    @ObfuscatedName("dl.ce")
    public static int field1984 = 0;

    @ObfuscatedName("dl.ci")
    public static int field1985 = 0;

    @ObfuscatedName("dl.cq")
    public static volatile int field1986 = 0;

    @ObfuscatedName("dl.cu")
    public static int[] field1987 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ar.g(I)V")
    public static void method517() {
        class124 var0 = field1976;
        synchronized (field1976) {
            field1986++;
            field1953 = field1985;
            field1982 = 0;
            if (field1978 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1975[var1] = false;
                }
                field1978 = field1956;
            } else {
                while (field1978 != field1956) {
                    int var2 = field1961[field1956];
                    field1956 = field1956 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1975[~var2] = false;
                    } else {
                        if (!field1975[var2] && field1982 < field1981.length - 1) {
                            field1981[++field1982 - 1] = var2;
                        }
                        field1975[var2] = true;
                    }
                }
            }
            field1985 = field1984;
        }
    }

    @ObfuscatedName("g.i(B)Z")
    public static final boolean method3() {
        class124 var0 = field1976;
        synchronized (field1976) {
            if (field1985 == field1953) {
                return false;
            } else {
                Statics.field1935 = field1980[field1953];
                Statics.field1808 = field1979[field1953];
                field1953 = field1953 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1976 == null) {
            return;
        }
        field1986 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1987.length) {
            var3 = field1987[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1978 >= 0 && var3 >= 0) {
            field1961[field1978] = var3;
            field1978 = field1978 + 1 & 0x7F;
            if (field1978 == field1956) {
                field1978 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1984 + 1 & 0x7F;
            if (field1953 != var4) {
                field1980[field1984] = var3;
                field1979[field1984] = 0;
                field1984 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1976 != null) {
            field1986 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1987.length) {
                var3 = field1987[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1978 >= 0 && var3 >= 0) {
                field1961[field1978] = ~var3;
                field1978 = field1978 + 1 & 0x7F;
                if (field1978 == field1956) {
                    field1978 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1976 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class202.field2977;
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
                    if (field1953 != var7) {
                        field1980[field1984] = -1;
                        field1979[field1984] = var2;
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
        if (field1976 != null) {
            field1978 = -1;
        }
    }
}
