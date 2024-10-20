package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("du")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("du.t")
    public static class124 field1957 = new class124();

    @ObfuscatedName("du.co")
    public static boolean[] field1949 = new boolean[112];

    @ObfuscatedName("du.cp")
    public static int[] field1937 = new int[128];

    @ObfuscatedName("du.cs")
    public static int field1951 = 0;

    @ObfuscatedName("du.cj")
    public static int field1948 = 0;

    @ObfuscatedName("du.cd")
    public static char[] field1953 = new char[128];

    @ObfuscatedName("du.cm")
    public static int[] field1954 = new int[128];

    @ObfuscatedName("du.ce")
    public static int[] field1955 = new int[128];

    @ObfuscatedName("du.cb")
    public static int field1956 = 0;

    @ObfuscatedName("du.cy")
    public static int field1950 = 0;

    @ObfuscatedName("du.cx")
    public static int field1958 = 0;

    @ObfuscatedName("du.cz")
    public static int field1959 = 0;

    @ObfuscatedName("du.cg")
    public static volatile int field1960 = 0;

    @ObfuscatedName("du.ck")
    public static int[] field1961 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("client.t(B)V")
    public static void method457() {
        if (Statics.field1757.toLowerCase().indexOf("microsoft") != -1) {
            field1961[186] = 57;
            field1961[187] = 27;
            field1961[188] = 71;
            field1961[189] = 26;
            field1961[190] = 72;
            field1961[191] = 73;
            field1961[192] = 58;
            field1961[219] = 42;
            field1961[220] = 74;
            field1961[221] = 43;
            field1961[222] = 59;
            field1961[223] = 28;
            return;
        }
        field1961[44] = 71;
        field1961[45] = 26;
        field1961[46] = 72;
        field1961[47] = 73;
        field1961[59] = 57;
        field1961[61] = 27;
        field1961[91] = 42;
        field1961[92] = 74;
        field1961[93] = 43;
        field1961[192] = 28;
        field1961[222] = 58;
        field1961[520] = 59;
    }

    @ObfuscatedName("ca.o(Ljava/awt/Component;I)V")
    public static void method1769(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1957);
        arg0.addFocusListener(field1957);
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1957 == null) {
            return;
        }
        field1960 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1961.length) {
            var3 = field1961[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1948 >= 0 && var3 >= 0) {
            field1937[field1948] = var3;
            field1948 = field1948 + 1 & 0x7F;
            if (field1951 == field1948) {
                field1948 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1958 + 1 & 0x7F;
            if (field1950 != var4) {
                field1954[field1958] = var3;
                field1953[field1958] = 0;
                field1958 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1957 != null) {
            field1960 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1961.length) {
                var3 = field1961[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1948 >= 0 && var3 >= 0) {
                field1937[field1948] = ~var3;
                field1948 = field1948 + 1 & 0x7F;
                if (field1951 == field1948) {
                    field1948 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1957 != null) {
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
                    int var7 = field1958 + 1 & 0x7F;
                    if (field1950 != var7) {
                        field1954[field1958] = -1;
                        field1953[field1958] = var2;
                        field1958 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1957 != null) {
            field1948 = -1;
        }
    }
}
