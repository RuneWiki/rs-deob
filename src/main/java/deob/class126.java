package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("di")
public final class class126 implements KeyListener, FocusListener {

    @ObfuscatedName("di.e")
    public static class126 field1978 = new class126();

    @ObfuscatedName("di.cq")
    public static boolean[] field1971 = new boolean[112];

    @ObfuscatedName("di.cl")
    public static int[] field1972 = new int[128];

    @ObfuscatedName("di.ci")
    public static int field1973 = 0;

    @ObfuscatedName("di.cy")
    public static int field1960 = 0;

    @ObfuscatedName("di.cm")
    public static char[] field1975 = new char[128];

    @ObfuscatedName("di.cd")
    public static int[] field1970 = new int[128];

    @ObfuscatedName("di.cr")
    public static int[] field1977 = new int[128];

    @ObfuscatedName("di.cz")
    public static int field1961 = 0;

    @ObfuscatedName("di.ch")
    public static int field1979 = 0;

    @ObfuscatedName("di.cn")
    public static int field1980 = 0;

    @ObfuscatedName("di.cu")
    public static int field1969 = 0;

    @ObfuscatedName("di.cx")
    public static volatile int field1982 = 0;

    @ObfuscatedName("di.cg")
    public static int[] field1957 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cm.e(Ljava/awt/Component;I)V")
    public static void method1888(Component arg0) {
        arg0.removeKeyListener(field1978);
        arg0.removeFocusListener(field1978);
        field1960 = -1;
    }

    @ObfuscatedName("o.v(B)Z")
    public static final boolean method475() {
        class126 var0 = field1978;
        synchronized (field1978) {
            if (field1979 == field1969) {
                return false;
            } else {
                Statics.field15 = field1970[field1979];
                Statics.field2164 = field1975[field1979];
                field1979 = field1979 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("ae.k(S)I")
    public static int method594() {
        return field1982;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1978 == null) {
            return;
        }
        field1982 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1957.length) {
            var3 = field1957[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1960 >= 0 && var3 >= 0) {
            field1972[field1960] = var3;
            field1960 = field1960 + 1 & 0x7F;
            if (field1973 == field1960) {
                field1960 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1980 + 1 & 0x7F;
            if (field1979 != var4) {
                field1970[field1980] = var3;
                field1975[field1980] = 0;
                field1980 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1978 != null) {
            field1982 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1957.length) {
                var3 = field1957[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1960 >= 0 && var3 >= 0) {
                field1972[field1960] = ~var3;
                field1960 = field1960 + 1 & 0x7F;
                if (field1973 == field1960) {
                    field1960 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1978 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class213.method3595(var2)) {
                int var3 = field1980 + 1 & 0x7F;
                if (field1979 != var3) {
                    field1970[field1980] = -1;
                    field1975[field1980] = var2;
                    field1980 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1978 != null) {
            field1960 = -1;
        }
    }
}
