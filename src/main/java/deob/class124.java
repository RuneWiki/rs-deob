package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dt")
public final class class124 implements KeyListener, FocusListener {

    @ObfuscatedName("dt.z")
    public static class124 field1960 = new class124();

    @ObfuscatedName("dt.cj")
    public static boolean[] field1946 = new boolean[112];

    @ObfuscatedName("dt.cv")
    public static int[] field1937 = new int[128];

    @ObfuscatedName("dt.cx")
    public static int field1948 = 0;

    @ObfuscatedName("dt.cd")
    public static int field1959 = 0;

    @ObfuscatedName("dt.cy")
    public static char[] field1931 = new char[128];

    @ObfuscatedName("dt.cf")
    public static int[] field1951 = new int[128];

    @ObfuscatedName("dt.cl")
    public static int[] field1955 = new int[128];

    @ObfuscatedName("dt.ch")
    public static int field1950 = 0;

    @ObfuscatedName("dt.cr")
    public static int field1954 = 0;

    @ObfuscatedName("dt.cu")
    public static int field1961 = 0;

    @ObfuscatedName("dt.cg")
    public static int field1956 = 0;

    @ObfuscatedName("dt.ct")
    public static volatile int field1957 = 0;

    @ObfuscatedName("dt.cb")
    public static int[] field1958 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("b.z(Ljava/awt/Component;S)V")
    public static void method39(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field1960);
        arg0.addFocusListener(field1960);
    }

    @ObfuscatedName("n.j(B)V")
    public static void method498() {
        class124 var0 = field1960;
        synchronized (field1960) {
            field1957++;
            field1954 = field1956;
            field1950 = 0;
            if (field1959 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field1946[var1] = false;
                }
                field1959 = field1948;
            } else {
                while (field1959 != field1948) {
                    int var2 = field1937[field1948];
                    field1948 = field1948 + 1 & 0x7F;
                    if (var2 < 0) {
                        field1946[~var2] = false;
                    } else {
                        if (!field1946[var2] && field1950 < field1955.length - 1) {
                            field1955[++field1950 - 1] = var2;
                        }
                        field1946[var2] = true;
                    }
                }
            }
            field1956 = field1961;
        }
    }

    @ObfuscatedName("p.a(I)Z")
    public static final boolean method90() {
        class124 var0 = field1960;
        synchronized (field1960) {
            if (field1956 == field1954) {
                return false;
            } else {
                Statics.field1425 = field1951[field1954];
                Statics.field1026 = field1931[field1954];
                field1954 = field1954 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("dr.y(B)I")
    public static int method2387() {
        return field1957;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field1960 == null) {
            return;
        }
        field1957 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field1958.length) {
            var3 = field1958[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field1959 >= 0 && var3 >= 0) {
            field1937[field1959] = var3;
            field1959 = field1959 + 1 & 0x7F;
            if (field1959 == field1948) {
                field1959 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field1961 + 1 & 0x7F;
            if (field1954 != var4) {
                field1951[field1961] = var3;
                field1931[field1961] = 0;
                field1961 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field1960 != null) {
            field1957 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field1958.length) {
                var3 = field1958[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field1959 >= 0 && var3 >= 0) {
                field1937[field1959] = ~var3;
                field1959 = field1959 + 1 & 0x7F;
                if (field1959 == field1948) {
                    field1959 = -1;
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
                            char[] var4 = class199.field2958;
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
                    int var7 = field1961 + 1 & 0x7F;
                    if (field1954 != var7) {
                        field1951[field1961] = -1;
                        field1931[field1961] = var2;
                        field1961 = var7;
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
            field1959 = -1;
        }
    }
}
