package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dp")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dp.n")
    public static class129 field2037 = new class129();

    @ObfuscatedName("dp.cn")
    public static boolean[] field2020 = new boolean[112];

    @ObfuscatedName("dp.cc")
    public static int[] field2033 = new int[128];

    @ObfuscatedName("dp.ca")
    public static int field2031 = 0;

    @ObfuscatedName("dp.cv")
    public static int field2030 = 0;

    @ObfuscatedName("dp.ch")
    public static char[] field2036 = new char[128];

    @ObfuscatedName("dp.cx")
    public static int[] field2034 = new int[128];

    @ObfuscatedName("dp.cy")
    public static int[] field2039 = new int[128];

    @ObfuscatedName("dp.cm")
    public static int field2032 = 0;

    @ObfuscatedName("dp.cd")
    public static int field2035 = 0;

    @ObfuscatedName("dp.ci")
    public static int field2024 = 0;

    @ObfuscatedName("dp.cp")
    public static int field2021 = 0;

    @ObfuscatedName("dp.cg")
    public static volatile int field2038 = 0;

    @ObfuscatedName("dp.cr")
    public static int[] field2027 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("ds.n(Ljava/awt/Component;I)V")
    public static void method2570(Component arg0) {
        arg0.removeKeyListener(field2037);
        arg0.removeFocusListener(field2037);
        field2030 = -1;
    }

    @ObfuscatedName("d.d(I)V")
    public static void method14() {
        if (field2037 != null) {
            class129 var0 = field2037;
            synchronized (field2037) {
                field2037 = null;
            }
        }
    }

    @ObfuscatedName("dd.z(I)Z")
    public static final boolean method2556() {
        class129 var0 = field2037;
        synchronized (field2037) {
            if (field2035 == field2021) {
                return false;
            } else {
                Statics.field700 = field2034[field2035];
                Statics.field1972 = field2036[field2035];
                field2035 = field2035 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2037 == null) {
            return;
        }
        field2038 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2027.length) {
            var3 = field2027[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2030 >= 0 && var3 >= 0) {
            field2033[field2030] = var3;
            field2030 = field2030 + 1 & 0x7F;
            if (field2031 == field2030) {
                field2030 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2024 + 1 & 0x7F;
            if (field2035 != var4) {
                field2034[field2024] = var3;
                field2036[field2024] = 0;
                field2024 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2037 != null) {
            field2038 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2027.length) {
                var3 = field2027[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2030 >= 0 && var3 >= 0) {
                field2033[field2030] = ~var3;
                field2030 = field2030 + 1 & 0x7F;
                if (field2031 == field2030) {
                    field2030 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2037 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class156.field2560;
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
                    int var7 = field2024 + 1 & 0x7F;
                    if (field2035 != var7) {
                        field2034[field2024] = -1;
                        field2036[field2024] = var2;
                        field2024 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2037 != null) {
            field2030 = -1;
        }
    }
}
