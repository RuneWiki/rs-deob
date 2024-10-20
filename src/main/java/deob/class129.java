package deob;

import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

@ObfuscatedName("di")
public final class class129 implements KeyListener, FocusListener {

    @ObfuscatedName("di.p")
    public static class129 field2020 = new class129();

    @ObfuscatedName("di.cy")
    public static boolean[] field2012 = new boolean[112];

    @ObfuscatedName("di.cs")
    public static int[] field2013 = new int[128];

    @ObfuscatedName("di.cg")
    public static int field2014 = 0;

    @ObfuscatedName("di.ce")
    public static int field2015 = 0;

    @ObfuscatedName("di.cq")
    public static char[] field2016 = new char[128];

    @ObfuscatedName("di.cx")
    public static int[] field2017 = new int[128];

    @ObfuscatedName("di.cv")
    public static int[] field2018 = new int[128];

    @ObfuscatedName("di.ch")
    public static int field2025 = 0;

    @ObfuscatedName("di.cb")
    public static int field1999 = 0;

    @ObfuscatedName("di.ck")
    public static int field2021 = 0;

    @ObfuscatedName("di.cw")
    public static int field2022 = 0;

    @ObfuscatedName("di.cm")
    public static volatile int field2023 = 0;

    @ObfuscatedName("di.cr")
    public static int[] field2019 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @ObfuscatedName("n.p(I)V")
    public static void method135() {
        if (Statics.field1990.toLowerCase().indexOf("microsoft") != -1) {
            field2019[186] = 57;
            field2019[187] = 27;
            field2019[188] = 71;
            field2019[189] = 26;
            field2019[190] = 72;
            field2019[191] = 73;
            field2019[192] = 58;
            field2019[219] = 42;
            field2019[220] = 74;
            field2019[221] = 43;
            field2019[222] = 59;
            field2019[223] = 28;
            return;
        }
        field2019[44] = 71;
        field2019[45] = 26;
        field2019[46] = 72;
        field2019[47] = 73;
        field2019[59] = 57;
        field2019[61] = 27;
        field2019[91] = 42;
        field2019[92] = 74;
        field2019[93] = 43;
        field2019[192] = 28;
        field2019[222] = 58;
        field2019[520] = 59;
    }

    @ObfuscatedName("eb.k(Ljava/awt/Component;I)V")
    public static void method2795(Component arg0) {
        arg0.setFocusTraversalKeysEnabled(false);
        arg0.addKeyListener(field2020);
        arg0.addFocusListener(field2020);
    }

    @ObfuscatedName("af.e(Ljava/awt/Component;I)V")
    public static void method659(Component arg0) {
        arg0.removeKeyListener(field2020);
        arg0.removeFocusListener(field2020);
        field2015 = -1;
    }

    @ObfuscatedName("aq.f(B)V")
    public static void method623() {
        if (field2020 != null) {
            class129 var0 = field2020;
            synchronized (field2020) {
                field2020 = null;
            }
        }
    }

    @ObfuscatedName("en.w(I)V")
    public static void method2783() {
        class129 var0 = field2020;
        synchronized (field2020) {
            field2023++;
            field1999 = field2022;
            field2025 = 0;
            if (field2015 < 0) {
                for (int var1 = 0; var1 < 112; var1++) {
                    field2012[var1] = false;
                }
                field2015 = field2014;
            } else {
                while (field2015 != field2014) {
                    int var2 = field2013[field2014];
                    field2014 = field2014 + 1 & 0x7F;
                    if (var2 < 0) {
                        field2012[~var2] = false;
                    } else {
                        if (!field2012[var2] && field2025 < field2018.length - 1) {
                            field2018[++field2025 - 1] = var2;
                        }
                        field2012[var2] = true;
                    }
                }
            }
            field2022 = field2021;
        }
    }

    @ObfuscatedName("ff.t(I)Z")
    public static final boolean method2973() {
        class129 var0 = field2020;
        synchronized (field2020) {
            if (field2022 == field1999) {
                return false;
            } else {
                Statics.field651 = field2017[field1999];
                Statics.field3017 = field2016[field1999];
                field1999 = field1999 + 1 & 0x7F;
                return true;
            }
        }
    }

    @ObfuscatedName("aj.s(I)I")
    public static int method738() {
        return field2023;
    }

    public final synchronized void keyPressed(KeyEvent arg0) {
        if (field2020 == null) {
            return;
        }
        field2023 = 0;
        int var2 = arg0.getKeyCode();
        int var3;
        if (var2 >= 0 && var2 < field2019.length) {
            var3 = field2019[var2];
            if ((var3 & 0x80) != 0) {
                var3 = -1;
            }
        } else {
            var3 = -1;
        }
        if (field2015 >= 0 && var3 >= 0) {
            field2013[field2015] = var3;
            field2015 = field2015 + 1 & 0x7F;
            if (field2015 == field2014) {
                field2015 = -1;
            }
        }
        if (var3 >= 0) {
            int var4 = field2021 + 1 & 0x7F;
            if (field1999 != var4) {
                field2017[field2021] = var3;
                field2016[field2021] = 0;
                field2021 = var4;
            }
        }
        int var5 = arg0.getModifiers();
        if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
            arg0.consume();
        }
    }

    public final synchronized void keyReleased(KeyEvent arg0) {
        if (field2020 != null) {
            field2023 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < field2019.length) {
                var3 = field2019[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (field2015 >= 0 && var3 >= 0) {
                field2013[field2015] = ~var3;
                field2015 = field2015 + 1 & 0x7F;
                if (field2015 == field2014) {
                    field2015 = -1;
                }
            }
        }
        arg0.consume();
    }

    public final void keyTyped(KeyEvent arg0) {
        if (field2020 != null) {
            char var2 = arg0.getKeyChar();
            if (var2 != 0 && var2 != 65535) {
                boolean var3;
                if (var2 > 0 && var2 < 128 || var2 >= 160 && var2 <= 255) {
                    var3 = true;
                } else {
                    label56: {
                        if (var2 != 0) {
                            char[] var4 = class156.field2561;
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
                    int var7 = field2021 + 1 & 0x7F;
                    if (field1999 != var7) {
                        field2017[field2021] = -1;
                        field2016[field2021] = var2;
                        field2021 = var7;
                    }
                }
            }
        }
        arg0.consume();
    }

    public final void focusGained(FocusEvent arg0) {
    }

    public final synchronized void focusLost(FocusEvent arg0) {
        if (field2020 != null) {
            field2015 = -1;
        }
    }
}
