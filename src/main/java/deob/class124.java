package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("da")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("da.k")
    public static class124 field1971 = new class124();

    @ObfuscatedName("da.ca")
    public static boolean[] field1976 = new boolean[112];

    @ObfuscatedName("da.cx")
    public static int[] field1977 = new int[128];

    @ObfuscatedName("da.ck")
    public static int field1978 = 0;

    @ObfuscatedName("da.ci")
    public static int field1969 = 0;

    @ObfuscatedName("da.cl")
    public static char[] field1980 = new char[128];

    @ObfuscatedName("da.cb")
    public static int[] field1981 = new int[128];

    @ObfuscatedName("da.ct")
    public static int[] field1982 = new int[128];

    @ObfuscatedName("da.cv")
    public static int field1983 = 0;

    @ObfuscatedName("da.cm")
    public static int field1990 = 0;

    @ObfuscatedName("da.cp")
    public static int field1967 = 0;

    @ObfuscatedName("da.cw")
    public static int field1986 = 0;

    @ObfuscatedName("da.cu")
    public static volatile int field1987 = 0;

    @ObfuscatedName("da.cq")
    public static int[] field1988 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("dm.k(Ljava/awt/Component;B)V")
    public static void method2457(Component arg0) {
        arg0.removeKeyListener(field1971);
        arg0.removeFocusListener(field1971);
        field1969 = -1;
    }

    @ObfuscatedName("av.r(I)V")
    public static void method579() {
        class124 var0 = field1971;
        synchronized (field1971) {
            field1987++;
            field1990 = field1986;
            field1983 = 0;
            if (field1969 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1976[var1] = false;
                }
                field1969 = field1978;
            } else {
                while (field1978 != field1969) {
                    int var2 = field1977[field1978];
                    field1978 = field1978 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1976[~var2] = false;
                    } else {
                        if (!field1976[var2] && field1983 < field1982.length - 1) {
                            field1982[++field1983 - 1] = var2;
                        }
                        field1976[var2] = true;
                    }
                }
            }
            field1986 = field1967;
        }
    }

    @ObfuscatedName("client.y(I)Z")
    public static final boolean method438() {
        class124 var0 = field1971;
        synchronized (field1971) {
            if (field1990 == field1986) {
                return false;
            } else {
                Statics.field578 = field1981[field1990];
                Statics.field1536 = field1980[field1990];
                field1990 = field1990 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("dj.w(I)I")
    public static int method2550() {
        return field1987;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1971 == null) {
            return;
        }
        field1987 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1988.length) {
            var3 = field1988[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1969 >= 0 && var3 >= 0) {
            field1977[field1969] = var3;
            field1969 = field1969 + 1 & 0x7F;
            if (field1978 == field1969) {
                field1969 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1967 + 1 & 0x7F;
            if (field1990 != var4) {
                field1981[field1967] = var3;
                field1980[field1967] = 0;
                field1967 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1971 != null) {
            field1987 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1988.length) {
                var3 = field1988[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1969 >= 0 && var3 >= 0) {
                field1977[field1969] = ~var3;
                field1969 = field1969 + 1 & 0x7F;
                if (field1978 == field1969) {
                    field1969 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1971 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class201.method34(var2)) {
                int var3 = field1967 + 1 & 0x7F;
                if (field1990 != var3) {
                    field1981[field1967] = -1;
                    field1980[field1967] = var2;
                    field1967 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1971 != null) {
            field1969 = -1;
        }
    }
}
