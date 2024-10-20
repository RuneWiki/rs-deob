package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("dq")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("dq.n")
    public static class129 field2014 = new class129();

    @ObfuscatedName("dq.ch")
    public static boolean[] field2015 = new boolean[112];

    @ObfuscatedName("dq.cw")
    public static int[] field2019 = new int[128];

    @ObfuscatedName("dq.ct")
    public static int field2017 = 0;

    @ObfuscatedName("dq.cc")
    public static int field2018 = 0;

    @ObfuscatedName("dq.ck")
    public static char[] field2007 = new char[128];

    @ObfuscatedName("dq.ca")
    public static int[] field2020 = new int[128];

    @ObfuscatedName("dq.cz")
    public static int[] field2021 = new int[128];

    @ObfuscatedName("dq.cu")
    public static int field2022 = 0;

    @ObfuscatedName("dq.co")
    public static int field2023 = 0;

    @ObfuscatedName("dq.cb")
    public static int field2028 = 0;

    @ObfuscatedName("dq.ce")
    public static int field2024 = 0;

    @ObfuscatedName("dq.cp")
    public static volatile int field2026 = 0;

    @ObfuscatedName("dq.cx")
    public static int[] field2027 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("co.n(Ljava/awt/Component;B)V")
    public static void method2064(Component arg0) {
        arg0.removeKeyListener(field2014);
        arg0.removeFocusListener(field2014);
        field2018 = -1;
    }

    @ObfuscatedName("bb.o(B)Z")
    public static final boolean method1146() {
        class129 var0 = field2014;
        synchronized (field2014) {
            if (field2024 == field2023) {
                return false;
            } else {
                Statics.field1794 = field2020[field2023];
                Statics.field130 = field2007[field2023];
                field2023 = field2023 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2014 == null) {
            return;
        }
        field2026 = 0;
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
        if (field2018 >= 0 && var3 >= 0) {
            field2019[field2018] = var3;
            field2018 = field2018 + 1 & 0x7F;
            if (field2018 == field2017) {
                field2018 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2028 + 1 & 0x7F;
            if (field2023 != var4) {
                field2020[field2028] = var3;
                field2007[field2028] = 0;
                field2028 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2014 != null) {
            field2026 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2027.length) {
                var3 = field2027[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2018 >= 0 && var3 >= 0) {
                field2019[field2018] = ~var3;
                field2018 = field2018 + 1 & 0x7F;
                if (field2018 == field2017) {
                    field2018 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2014 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class156.method1876(var2)) {
                int var3 = field2028 + 1 & 0x7F;
                if (field2023 != var3) {
                    field2020[field2028] = -1;
                    field2007[field2028] = var2;
                    field2028 = var3;
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2014 != null) {
            field2018 = -1;
        }
    }
}
