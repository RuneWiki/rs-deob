package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dd")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dd.e")
    public static class124 field1978 = new class124();

    @ObfuscatedName("dd.cz")
    public static boolean[] field1968 = new boolean[112];

    @ObfuscatedName("dd.ct")
    public static int[] field1970 = new int[128];

    @ObfuscatedName("dd.ci")
    public static int field1977 = 0;

    @ObfuscatedName("dd.cy")
    public static int field1971 = 0;

    @ObfuscatedName("dd.cw")
    public static char[] field1972 = new char[128];

    @ObfuscatedName("dd.cm")
    public static int[] field1973 = new int[128];

    @ObfuscatedName("dd.ce")
    public static int[] field1981 = new int[128];

    @ObfuscatedName("dd.cp")
    public static int field1957 = 0;

    @ObfuscatedName("dd.cb")
    public static int field1976 = 0;

    @ObfuscatedName("dd.cs")
    public static int field1979 = 0;

    @ObfuscatedName("dd.cv")
    public static int field1983 = 0;

    @ObfuscatedName("dd.cd")
    public static volatile int field1958 = 0;

    @ObfuscatedName("dd.cu")
    public static int[] field1980 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("cz.e(I)Z")
    public static final boolean method1872() {
        class124 var0 = field1978;
        synchronized (field1978) {
            if (field1983 == field1976) {
                return false;
            } else {
                Statics.field1752 = field1973[field1976];
                Statics.field2383 = field1972[field1976];
                field1976 = field1976 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("bq.p(I)I")
    public static int method1432() {
        return field1958;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1978 == null) {
            return;
        }
        field1958 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1980.length) {
            var3 = field1980[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1971 >= 0 && var3 >= 0) {
            field1970[field1971] = var3;
            field1971 = field1971 + 1 & 0x7F;
            if (field1977 == field1971) {
                field1971 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1979 + 1 & 0x7F;
            if (field1976 != var4) {
                field1973[field1979] = var3;
                field1972[field1979] = 0;
                field1979 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1978 != null) {
            field1958 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1980.length) {
                var3 = field1980[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1971 >= 0 && var3 >= 0) {
                field1970[field1971] = ~var3;
                field1971 = field1971 + 1 & 0x7F;
                if (field1977 == field1971) {
                    field1971 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1978 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class198.field2932;
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
                    if (field1976 != var7) {
                        field1973[field1979] = -1;
                        field1972[field1979] = var2;
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
        if (field1978 != null) {
            field1971 = -1;
        }
    }
}
