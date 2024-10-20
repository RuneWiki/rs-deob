package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dw")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dw.t")
    public static class124 field1960 = new class124();

    @ObfuscatedName("dw.cn")
    public static boolean[] field1957 = new boolean[112];

    @ObfuscatedName("dw.ci")
    public static int[] field1958 = new int[128];

    @ObfuscatedName("dw.cm")
    public static int field1959 = 0;

    @ObfuscatedName("dw.cs")
    public static int field1965 = 0;

    @ObfuscatedName("dw.ca")
    public static char[] field1948 = new char[128];

    @ObfuscatedName("dw.cw")
    public static int[] field1962 = new int[128];

    @ObfuscatedName("dw.ct")
    public static int[] field1963 = new int[128];

    @ObfuscatedName("dw.cf")
    public static int field1961 = 0;

    @ObfuscatedName("dw.cg")
    public static int field1942 = 0;

    @ObfuscatedName("dw.cc")
    public static int field1955 = 0;

    @ObfuscatedName("dw.cd")
    public static int field1967 = 0;

    @ObfuscatedName("dw.cy")
    public static volatile int field1968 = 0;

    @ObfuscatedName("dw.ce")
    public static int[] field1969 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("du.t(I)V")
    public static void method2403() {
        if (Statics.field1936.toLowerCase().indexOf("microsoft") != -1) {
            field1969[186] = 57;
            field1969[187] = 27;
            field1969[188] = 71;
            field1969[189] = 26;
            field1969[190] = 72;
            field1969[191] = 73;
            field1969[192] = 58;
            field1969[219] = 42;
            field1969[220] = 74;
            field1969[221] = 43;
            field1969[222] = 59;
            field1969[223] = 28;
            return;
        }
        field1969[44] = 71;
        field1969[45] = 26;
        field1969[46] = 72;
        field1969[47] = 73;
        field1969[59] = 57;
        field1969[61] = 27;
        field1969[91] = 42;
        field1969[92] = 74;
        field1969[93] = 43;
        field1969[192] = 28;
        field1969[222] = 58;
        field1969[520] = 59;
    }

    @ObfuscatedName("av.s(Ljava/awt/Component;I)V")
    public static void method787(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1960);
        arg0.addFocusListener(field1960);
    }

    @ObfuscatedName("ar.f(Ljava/awt/Component;I)V")
    public static void method619(Component arg0) {
        arg0.removeKeyListener(field1960);
        arg0.removeFocusListener(field1960);
        field1965 = -1;
    }

    @ObfuscatedName("t.e(B)V")
    public static void method3() {
        class124 var0 = field1960;
        synchronized (field1960) {
            field1968++;
            field1942 = field1967;
            field1961 = 0;
            if (field1965 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1957[var1] = false;
                }
                field1965 = field1959;
            } else {
                while (field1965 != field1959) {
                    int var2 = field1958[field1959];
                    field1959 = field1959 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1957[~var2] = false;
                    } else {
                        if (!field1957[var2] && field1961 < field1963.length - 1) {
                            field1963[++field1961 - 1] = var2;
                        }
                        field1957[var2] = true;
                    }
                }
            }
            field1967 = field1955;
        }
    }

    @ObfuscatedName("p.d(I)Z")
    public static final boolean method458() {
        class124 var0 = field1960;
        synchronized (field1960) {
            if (field1967 == field1942) {
                return false;
            } else {
                Statics.field2017 = field1962[field1942];
                Statics.field1334 = field1948[field1942];
                field1942 = field1942 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("h.n(S)I")
    public static int method485() {
        return field1968;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1960 == null) {
            return;
        }
        field1968 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1969.length) {
            var3 = field1969[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1965 >= 0 && var3 >= 0) {
            field1958[field1965] = var3;
            field1965 = field1965 + 1 & 0x7F;
            if (field1965 == field1959) {
                field1965 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1955 + 1 & 0x7F;
            if (field1942 != var4) {
                field1962[field1955] = var3;
                field1948[field1955] = 0;
                field1955 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1960 != null) {
            field1968 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1969.length) {
                var3 = field1969[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1965 >= 0 && var3 >= 0) {
                field1958[field1965] = ~var3;
                field1965 = field1965 + 1 & 0x7F;
                if (field1965 == field1959) {
                    field1965 = -1;
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
                            char[] var4 = class201.field2965;
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
                    int var7 = field1955 + 1 & 0x7F;
                    if (field1942 != var7) {
                        field1962[field1955] = -1;
                        field1948[field1955] = var2;
                        field1955 = var7;
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
            field1965 = -1;
        }
    }
}
