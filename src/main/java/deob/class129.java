package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("di")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("di.q")
    public static class129 field1960 = new class129();

    @ObfuscatedName("di.cv")
    public static boolean[] field1956 = new boolean[112];

    @ObfuscatedName("di.cm")
    public static int[] field1973 = new int[128];

    @ObfuscatedName("di.cn")
    public static int field1974 = 0;

    @ObfuscatedName("di.ci")
    public static int field1975 = 0;

    @ObfuscatedName("di.cz")
    public static char[] field1976 = new char[128];

    @ObfuscatedName("di.ca")
    public static int[] field1986 = new int[128];

    @ObfuscatedName("di.cl")
    public static int[] field1978 = new int[128];

    @ObfuscatedName("di.cr")
    public static int field1979 = 0;

    @ObfuscatedName("di.cj")
    public static int field1980 = 0;

    @ObfuscatedName("di.cc")
    public static int field1965 = 0;

    @ObfuscatedName("di.cf")
    public static int field1982 = 0;

    @ObfuscatedName("di.ch")
    public static volatile int field1983 = 0;

    @ObfuscatedName("di.cd")
    public static int[] field1984 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("do.q(I)V")
    public static void method2418() {
        if (Statics.field1947.toLowerCase().indexOf("microsoft") != -1) {
            field1984[186] = 57;
            field1984[187] = 27;
            field1984[188] = 71;
            field1984[189] = 26;
            field1984[190] = 72;
            field1984[191] = 73;
            field1984[192] = 58;
            field1984[219] = 42;
            field1984[220] = 74;
            field1984[221] = 43;
            field1984[222] = 59;
            field1984[223] = 28;
            return;
        }
        field1984[44] = 71;
        field1984[45] = 26;
        field1984[46] = 72;
        field1984[47] = 73;
        field1984[59] = 57;
        field1984[61] = 27;
        field1984[91] = 42;
        field1984[92] = 74;
        field1984[93] = 43;
        field1984[192] = 28;
        field1984[222] = 58;
        field1984[520] = 59;
    }

    @ObfuscatedName("f.s(Ljava/awt/Component;B)V")
    public static void method473(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1960);
        arg0.addFocusListener(field1960);
    }

    @ObfuscatedName("dc.h(Ljava/awt/Component;I)V")
    public static void method2444(Component arg0) {
        arg0.removeKeyListener(field1960);
        arg0.removeFocusListener(field1960);
        field1975 = -1;
    }

    @ObfuscatedName("ck.e(S)V")
    public static void method1606() {
        class129 var0 = field1960;
        synchronized (field1960) {
            field1983++;
            field1980 = field1982;
            field1979 = 0;
            if (field1975 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1956[var1] = false;
                }
                field1975 = field1974;
            } else {
                while (field1975 != field1974) {
                    int var2 = field1973[field1974];
                    field1974 = field1974 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1956[~var2] = false;
                    } else {
                        if (!field1956[var2] && field1979 < field1978.length - 1) {
                            field1978[++field1979 - 1] = var2;
                        }
                        field1956[var2] = true;
                    }
                }
            }
            field1982 = field1965;
        }
    }

    @ObfuscatedName("b.n(I)Z")
    public static final boolean method161() {
        class129 var0 = field1960;
        synchronized (field1960) {
            if (field1982 == field1980) {
                return false;
            } else {
                Statics.field2751 = field1986[field1980];
                Statics.field666 = field1976[field1980];
                field1980 = field1980 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1960 == null) {
            return;
        }
        field1983 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1984.length) {
            var3 = field1984[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1975 >= 0 && var3 >= 0) {
            field1973[field1975] = var3;
            field1975 = field1975 + 1 & 0x7F;
            if (field1975 == field1974) {
                field1975 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1965 + 1 & 0x7F;
            if (field1980 != var4) {
                field1986[field1965] = var3;
                field1976[field1965] = 0;
                field1965 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1960 != null) {
            field1983 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1984.length) {
                var3 = field1984[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1975 >= 0 && var3 >= 0) {
                field1973[field1975] = ~var3;
                field1975 = field1975 + 1 & 0x7F;
                if (field1975 == field1974) {
                    field1975 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1960 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class156.field2511;
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
                    int var7 = field1965 + 1 & 0x7F;
                    if (field1980 != var7) {
                        field1986[field1965] = -1;
                        field1976[field1965] = var2;
                        field1965 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1960 != null) {
            field1975 = -1;
        }
    }
}
