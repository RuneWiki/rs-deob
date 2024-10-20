package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("da")
public final class class126 implements KeyListener, FocusListener {

    @ObfuscatedName("da.l")
    public static class126 field1970 = new class126();

    @ObfuscatedName("da.cv")
    public static boolean[] field1958 = new boolean[112];

    @ObfuscatedName("da.ch")
    public static int[] field1959 = new int[128];

    @ObfuscatedName("da.ce")
    public static int field1960 = 0;

    @ObfuscatedName("da.ct")
    public static int field1961 = 0;

    @ObfuscatedName("da.co")
    public static char[] field1962 = new char[128];

    @ObfuscatedName("da.cm")
    public static int[] field1969 = new int[128];

    @ObfuscatedName("da.cq")
    public static int[] field1964 = new int[128];

    @ObfuscatedName("da.cr")
    public static int field1965 = 0;

    @ObfuscatedName("da.cz")
    public static int field1966 = 0;

    @ObfuscatedName("da.cx")
    public static int field1963 = 0;

    @ObfuscatedName("da.ck")
    public static int field1968 = 0;

    @ObfuscatedName("da.ca")
    public static volatile int field1954 = 0;

    @ObfuscatedName("da.cl")
    public static int[] field1957 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ah.l(I)V")
    public static void method535() {
        if (Statics.field1944.toLowerCase().indexOf("microsoft") != -1) {
            field1957[186] = 57;
            field1957[187] = 27;
            field1957[188] = 71;
            field1957[189] = 26;
            field1957[190] = 72;
            field1957[191] = 73;
            field1957[192] = 58;
            field1957[219] = 42;
            field1957[220] = 74;
            field1957[221] = 43;
            field1957[222] = 59;
            field1957[223] = 28;
            return;
        }
        field1957[44] = 71;
        field1957[45] = 26;
        field1957[46] = 72;
        field1957[47] = 73;
        field1957[59] = 57;
        field1957[61] = 27;
        field1957[91] = 42;
        field1957[92] = 74;
        field1957[93] = 43;
        field1957[192] = 28;
        field1957[222] = 58;
        field1957[520] = 59;
    }

    @ObfuscatedName("dh.y(Ljava/awt/Component;I)V")
    public static void method2550(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1970);
        arg0.addFocusListener(field1970);
    }

    @ObfuscatedName("ae.g(Ljava/awt/Component;B)V")
    public static void method829(Component arg0) {
        arg0.removeKeyListener(field1970);
        arg0.removeFocusListener(field1970);
        field1961 = -1;
    }

    @ObfuscatedName("j.j(B)V")
    public static void method34() {
        if (field1970 != null) {
            class126 var0 = field1970;
            synchronized (field1970) {
                field1970 = null;
            }
        }
    }

    @ObfuscatedName("au.w(B)Z")
    public static final boolean method619() {
        class126 var0 = field1970;
        synchronized (field1970) {
            if (field1968 == field1966) {
                return false;
            } else {
                Statics.field2083 = field1969[field1966];
                Statics.field999 = field1962[field1966];
                field1966 = field1966 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1970 == null) {
            return;
        }
        field1954 = 0;
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
        if (field1961 >= 0 && var3 >= 0) {
            field1959[field1961] = var3;
            field1961 = field1961 + 1 & 0x7F;
            if (field1961 == field1960) {
                field1961 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1963 + 1 & 0x7F;
            if (field1966 != var4) {
                field1969[field1963] = var3;
                field1962[field1963] = 0;
                field1963 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1970 != null) {
            field1954 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1957.length) {
                var3 = field1957[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1961 >= 0 && var3 >= 0) {
                field1959[field1961] = ~var3;
                field1961 = field1961 + 1 & 0x7F;
                if (field1961 == field1960) {
                    field1961 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1970 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class213.field3020;
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
                    int var7 = field1963 + 1 & 0x7F;
                    if (field1966 != var7) {
                        field1969[field1963] = -1;
                        field1962[field1963] = var2;
                        field1963 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1970 != null) {
            field1961 = -1;
        }
    }
}
