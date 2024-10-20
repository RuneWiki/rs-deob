package deob;

import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("r")
public final class class11 implements KeyListener, FocusListener {

    @ObfuscatedName("r.s")
    public static class11 field59 = new class11();

    @ObfuscatedName("r.cd")
    public static boolean[] field46 = new boolean[112];

    @ObfuscatedName("r.co")
    public static boolean[] field47 = new boolean[112];

    @ObfuscatedName("r.cm")
    public static boolean[] field39 = new boolean[112];

    @ObfuscatedName("r.cy")
    public static int[] field49 = new int[128];

    @ObfuscatedName("r.cp")
    public static int field50 = 0;

    @ObfuscatedName("r.cs")
    public static int field51 = 0;

    @ObfuscatedName("r.cv")
    public static char[] field52 = new char[128];

    @ObfuscatedName("r.cg")
    public static int[] field55 = new int[128];

    @ObfuscatedName("r.cu")
    public static int[] field54 = new int[128];

    @ObfuscatedName("r.ck")
    public static int field36 = 0;

    @ObfuscatedName("r.cz")
    public static int[] field56 = new int[128];

    @ObfuscatedName("r.ca")
    public static int field65 = 0;

    @ObfuscatedName("r.cx")
    public static int field58 = 0;

    @ObfuscatedName("r.cr")
    public static int field53 = 0;

    @ObfuscatedName("r.cc")
    public static int field60 = 0;

    @ObfuscatedName("r.dk")
    public static volatile int field61 = 0;

    @ObfuscatedName("r.df")
    public static int[] field40 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, 87, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("hx.s(I)V")
    public static void method3939() {
        if (field59 != null) {
            class11 var0 = field59;
            synchronized (field59) {
                field59 = null;
            }
        }
    }

    @ObfuscatedName("lu.t(I)Z")
    public static final boolean method5125() {
        class11 var0 = field59;
        synchronized (field59) {
            if (field60 == field58) {
                return false;
            } else {
                Statics.field1418 = field55[field58];
                Statics.field1450 = field52[field58];
                field58 = field58 + 1 & 0x7F;
                return true;
            }
        }
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field59 == null) {
            return;
        }
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field40.length) {
            var3 = field40[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field51 >= 0 && var3 >= 0) {
            field49[field51] = var3;
            field51 = field51 + 1 & 0x7F;
            if (field51 == field50) {
                field51 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field53 + 1 & 0x7F;
            if (field58 != var4) {
                field55[field53] = var3;
                field52[field53] = 0;
                field53 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field59 != null) {
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field40.length) {
                var3 = field40[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field51 >= 0 && var3 >= 0) {
                field49[field51] = ~var3;
                field51 = field51 + 1 & 0x7F;
                if (field51 == field50) {
                    field51 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field59 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535 && class304.method3887(var2)) {
                int var3 = field53 + 1 & 0x7F;
                if (field58 != var3) {
                    field55[field53] = -1;
                    field52[field53] = var2;
                    field53 = var3;
                }
            }
        }
        arg0.consume();
    }

    @ObfuscatedName("jw.v(II)Z")
    public static boolean method4394(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field47[arg0] : false;
    }

    @ObfuscatedName("dj.j(II)Z")
    public static boolean method2211(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field46[arg0] : false;
    }

    @ObfuscatedName("di.l(II)Z")
    public static boolean method2236(int arg0) {
        return arg0 >= 0 && arg0 < 112 ? field39[arg0] : false;
    }

    @ObfuscatedName("ee.n(I)[I")
    public static int[] method2374() {
        int[] var0 = new int[field36];
        for (int var1 = 0; var1 < field36; var1++) {
            var0[var1] = field54[var1];
        }
        return var0;
    }

    @ObfuscatedName("bp.w(I)[I")
    public static int[] method1843() {
        int[] var0 = new int[field65];
        for (int var1 = 0; var1 < field65; var1++) {
            var0[var1] = field56[var1];
        }
        return var0;
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field59 != null) {
            field51 = -1;
        }
    }
}
