package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dc")
public final class class126 implements KeyListener, FocusListener {

    @ObfuscatedName("dc.x")
    public static class126 field1972 = new class126();

    @ObfuscatedName("dc.cw")
    public static boolean[] field1966 = new boolean[112];

    @ObfuscatedName("dc.cc")
    public static int[] field1982 = new int[128];

    @ObfuscatedName("dc.cg")
    public static int field1968 = 0;

    @ObfuscatedName("dc.ce")
    public static int field1970 = 0;

    @ObfuscatedName("dc.cv")
    public static char[] field1975 = new char[128];

    @ObfuscatedName("dc.cs")
    public static int[] field1967 = new int[128];

    @ObfuscatedName("dc.cb")
    public static int[] field1971 = new int[128];

    @ObfuscatedName("dc.cu")
    public static int field1973 = 0;

    @ObfuscatedName("dc.cz")
    public static int field1974 = 0;

    @ObfuscatedName("dc.ca")
    public static int field1980 = 0;

    @ObfuscatedName("dc.ck")
    public static int field1976 = 0;

    @ObfuscatedName("dc.cx")
    public static volatile int field1977 = 0;

    @ObfuscatedName("dc.cy")
    public static int[] field1978 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("k.x(B)V")
    public static void method122() {
        if (Statics.field1948.toLowerCase().indexOf("microsoft") != -1) {
            field1978[186] = 57;
            field1978[187] = 27;
            field1978[188] = 71;
            field1978[189] = 26;
            field1978[190] = 72;
            field1978[191] = 73;
            field1978[192] = 58;
            field1978[219] = 42;
            field1978[220] = 74;
            field1978[221] = 43;
            field1978[222] = 59;
            field1978[223] = 28;
            return;
        }
        field1978[44] = 71;
        field1978[45] = 26;
        field1978[46] = 72;
        field1978[47] = 73;
        field1978[59] = 57;
        field1978[61] = 27;
        field1978[91] = 42;
        field1978[92] = 74;
        field1978[93] = 43;
        field1978[192] = 28;
        field1978[222] = 58;
        field1978[520] = 59;
    }

    @ObfuscatedName("gn.v(I)Z")
    public static final boolean method3399() {
        class126 var0 = field1972;
        synchronized (field1972) {
            if (field1976 == field1974) {
                return false;
            } else {
                Statics.field2838 = field1967[field1974];
                Statics.field2006 = field1975[field1974];
                field1974 = field1974 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("y.m(I)I")
    public static int method514() {
        return field1977;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1972 == null) {
            return;
        }
        field1977 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1978.length) {
            var3 = field1978[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1970 >= 0 && var3 >= 0) {
            field1982[field1970] = var3;
            field1970 = field1970 + 1 & 0x7F;
            if (field1970 == field1968) {
                field1970 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1980 + 1 & 0x7F;
            if (field1974 != var4) {
                field1967[field1980] = var3;
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
        if (field1972 != null) {
            field1977 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1978.length) {
                var3 = field1978[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1970 >= 0 && var3 >= 0) {
                field1982[field1970] = ~var3;
                field1970 = field1970 + 1 & 0x7F;
                if (field1970 == field1968) {
                    field1970 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1972 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class213.field3021;
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
                    int var7 = field1980 + 1 & 0x7F;
                    if (field1974 != var7) {
                        field1967[field1980] = -1;
                        field1975[field1980] = var2;
                        field1980 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1972 != null) {
            field1970 = -1;
        }
    }
}
