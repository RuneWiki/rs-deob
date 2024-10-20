package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("du")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("du.j")
    public static class124 field1989 = new class124();

    @ObfuscatedName("du.cb")
    public static boolean[] field1977 = new boolean[112];

    @ObfuscatedName("du.cg")
    public static int[] field1978 = new int[128];

    @ObfuscatedName("du.cz")
    public static int field1960 = 0;

    @ObfuscatedName("du.ct")
    public static int field1980 = 0;

    @ObfuscatedName("du.cx")
    public static char[] field1981 = new char[128];

    @ObfuscatedName("du.ca")
    public static int[] field1988 = new int[128];

    @ObfuscatedName("du.ci")
    public static int[] field1979 = new int[128];

    @ObfuscatedName("du.ck")
    public static int field1984 = 0;

    @ObfuscatedName("du.cw")
    public static int field1985 = 0;

    @ObfuscatedName("du.cl")
    public static int field1975 = 0;

    @ObfuscatedName("du.ce")
    public static int field1982 = 0;

    @ObfuscatedName("du.cu")
    public static volatile int field1971 = 0;

    @ObfuscatedName("du.cf")
    public static int[] field1990 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("aj.j(Ljava/awt/Component;B)V")
    public static void method501(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1989);
        arg0.addFocusListener(field1989);
    }

    @ObfuscatedName("ae.z(I)V")
    public static void method568() {
        if (field1989 != null) {
            class124 var0 = field1989;
            synchronized (field1989) {
                field1989 = null;
            }
        }
    }

    @ObfuscatedName("df.y(I)V")
    public static void method2616() {
        class124 var0 = field1989;
        synchronized (field1989) {
            field1971++;
            field1985 = field1982;
            field1984 = 0;
            if (field1980 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1977[var1] = false;
                }
                field1980 = field1960;
            } else {
                while (field1980 != field1960) {
                    int var2 = field1978[field1960];
                    field1960 = field1960 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1977[~var2] = false;
                    } else {
                        if (!field1977[var2] && field1984 < field1979.length - 1) {
                            field1979[++field1984 - 1] = var2;
                        }
                        field1977[var2] = true;
                    }
                }
            }
            field1982 = field1975;
        }
    }

    @ObfuscatedName("client.h(I)Z")
    public static final boolean method299() {
        class124 var0 = field1989;
        synchronized (field1989) {
            if (field1985 == field1982) {
                return false;
            } else {
                Statics.field530 = field1988[field1985];
                Statics.field198 = field1981[field1985];
                field1985 = field1985 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1989 == null) {
            return;
        }
        field1971 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1990.length) {
            var3 = field1990[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1980 >= 0 && var3 >= 0) {
            field1978[field1980] = var3;
            field1980 = field1980 + 1 & 0x7F;
            if (field1980 == field1960) {
                field1980 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1975 + 1 & 0x7F;
            if (field1985 != var4) {
                field1988[field1975] = var3;
                field1981[field1975] = 0;
                field1975 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1989 != null) {
            field1971 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1990.length) {
                var3 = field1990[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1980 >= 0 && var3 >= 0) {
                field1978[field1980] = ~var3;
                field1980 = field1980 + 1 & 0x7F;
                if (field1980 == field1960) {
                    field1980 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field1989 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class199.field2959;
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
                    int var7 = field1975 + 1 & 0x7F;
                    if (field1985 != var7) {
                        field1988[field1975] = -1;
                        field1981[field1975] = var2;
                        field1975 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field1989 != null) {
            field1980 = -1;
        }
    }
}
