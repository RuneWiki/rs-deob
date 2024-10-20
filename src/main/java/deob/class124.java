package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("du")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("du.g")
    public static class124 field1985 = new class124();

    @ObfuscatedName("du.cd")
    public static boolean[] field1994 = new boolean[112];

    @ObfuscatedName("du.cq")
    public static int[] field1984 = new int[128];

    @ObfuscatedName("du.cr")
    public static int field1976 = 0;

    @ObfuscatedName("du.cn")
    public static int field1986 = 0;

    @ObfuscatedName("du.cv")
    public static char[] field1987 = new char[128];

    @ObfuscatedName("du.ch")
    public static int[] field1988 = new int[128];

    @ObfuscatedName("du.ci")
    public static int[] field1989 = new int[128];

    @ObfuscatedName("du.cl")
    public static int field1996 = 0;

    @ObfuscatedName("du.cx")
    public static int field1991 = 0;

    @ObfuscatedName("du.ce")
    public static int field1970 = 0;

    @ObfuscatedName("du.cp")
    public static int field1993 = 0;

    @ObfuscatedName("du.ca")
    public static volatile int field1974 = 0;

    @ObfuscatedName("du.cu")
    public static int[] field1975 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ck.g(I)V")
    public static void method1887() {
        if (Statics.field1962.toLowerCase().indexOf("microsoft") != -1) {
            field1975[186] = 57;
            field1975[187] = 27;
            field1975[188] = 71;
            field1975[189] = 26;
            field1975[190] = 72;
            field1975[191] = 73;
            field1975[192] = 58;
            field1975[219] = 42;
            field1975[220] = 74;
            field1975[221] = 43;
            field1975[222] = 59;
            field1975[223] = 28;
            return;
        }
        field1975[44] = 71;
        field1975[45] = 26;
        field1975[46] = 72;
        field1975[47] = 73;
        field1975[59] = 57;
        field1975[61] = 27;
        field1975[91] = 42;
        field1975[92] = 74;
        field1975[93] = 43;
        field1975[192] = 28;
        field1975[222] = 58;
        field1975[520] = 59;
    }

    @ObfuscatedName("bp.v(I)Z")
    public static final boolean method1441() {
        class124 var0 = field1985;
        synchronized (field1985) {
            if (field1993 == field1991) {
                return false;
            } else {
                Statics.field1276 = field1988[field1991];
                Statics.field1848 = field1987[field1991];
                field1991 = field1991 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1985 == null) {
            return;
        }
        field1974 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1975.length) {
            var3 = field1975[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1986 >= 0 && var3 >= 0) {
            field1984[field1986] = var3;
            field1986 = field1986 + 1 & 0x7F;
            if (field1986 == field1976) {
                field1986 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1970 + 1 & 0x7F;
            if (field1991 != var4) {
                field1988[field1970] = var3;
                field1987[field1970] = 0;
                field1970 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1985 != null) {
            field1974 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1975.length) {
                var3 = field1975[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1986 >= 0 && var3 >= 0) {
                field1984[field1986] = ~var3;
                field1986 = field1986 + 1 & 0x7F;
                if (field1986 == field1976) {
                    field1986 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1985 != null) {
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
                    int var7 = field1970 + 1 & 0x7F;
                    if (field1991 != var7) {
                        field1988[field1970] = -1;
                        field1987[field1970] = var2;
                        field1970 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1985 != null) {
            field1986 = -1;
        }
    }
}
