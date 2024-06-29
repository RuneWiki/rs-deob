import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class60 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!vb", name = "m", descriptor = "Lid;")
    public static class149 field1090 = method382(" )2> <col=ff9040>", (byte) 22);

    @OriginalMember(owner = "client!vb", name = "e", descriptor = "Lvj;")
    public static class115 field1082 = new class115(16);

    @OriginalMember(owner = "client!vb", name = "o", descriptor = "I")
    public static int field1092 = 0;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "I")
    public static int field1078;

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "I")
    public static int field1079;

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "I")
    public static int field1083;

    @OriginalMember(owner = "client!vb", name = "g", descriptor = "I")
    public static int field1084;

    @OriginalMember(owner = "client!vb", name = "h", descriptor = "I")
    public static int field1085;

    @OriginalMember(owner = "client!vb", name = "i", descriptor = "I")
    public static int field1086;

    @OriginalMember(owner = "client!vb", name = "j", descriptor = "I")
    public static int field1087;

    @OriginalMember(owner = "client!vb", name = "k", descriptor = "I")
    public static int field1088;

    @OriginalMember(owner = "client!vb", name = "l", descriptor = "I")
    public static int field1089;

    @OriginalMember(owner = "client!vb", name = "n", descriptor = "I")
    public static int field1091;

    @OriginalMember(owner = "client!vb", name = "d", descriptor = "[Lrh;")
    public static class46[] field1081;

    @OriginalMember(owner = "client!vb", name = "c", descriptor = "[[[B")
    public static byte[][][] field1080;

    @OriginalMember(owner = "client!vb", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyReleased(KeyEvent arg0) {
        if (class288.field5139 != null) {
            class258.field4516 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && class93.field1649.length > var2) {
                var3 = class93.field1649[var2] & 0xFFFFFF7F;
            } else {
                var3 = -1;
            }
            if (class110.field1903 >= 0 && var3 >= 0) {
                class149.field2690[class110.field1903] = ~var3;
                class110.field1903 = class110.field1903 + 1 & 0x7F;
                if (class181.field3262 == class110.field1903) {
                    class110.field1903 = -1;
                }
            }
        }
        field1089++;
        arg0.consume();
    }

    @OriginalMember(owner = "client!vb", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final void focusGained(FocusEvent arg0) {
        field1084++;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(III)I")
    public static final int method378(int arg0, int arg1, int arg2) {
        field1085++;
        int var3 = arg0 * 57 + arg2;
        int var4 = var3 ^ var3 << 13;
        int var5 = Integer.MAX_VALUE & (var4 * 15731 * var4 + 789221) * var4 + 1376312589;
        if (arg1 != -1) {
            method379(false);
        }
        return (var5 & 0x7FA4C23) >> 19;
    }

    @OriginalMember(owner = "client!vb", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final synchronized void keyPressed(KeyEvent arg0) {
        if (class288.field5139 != null) {
            class258.field4516 = 0;
            int var2 = arg0.getKeyCode();
            int var3;
            if (var2 >= 0 && var2 < class93.field1649.length) {
                var3 = class93.field1649[var2];
                if ((var3 & 0x80) != 0) {
                    var3 = -1;
                }
            } else {
                var3 = -1;
            }
            if (class110.field1903 >= 0 && var3 >= 0) {
                class149.field2690[class110.field1903] = var3;
                class110.field1903 = class110.field1903 + 1 & 0x7F;
                if (class181.field3262 == class110.field1903) {
                    class110.field1903 = -1;
                }
            }
            if (var3 >= 0) {
                int var4 = class256.field4481 + 1 & 0x7F;
                if (class276.field4942 != var4) {
                    class5.field50[class256.field4481] = var3;
                    class138.field2522[class256.field4481] = -1;
                    class256.field4481 = var4;
                }
            }
            int var5 = arg0.getModifiers();
            if ((var5 & 0xA) != 0 || var3 == 85 || var3 == 10) {
                arg0.consume();
            }
        }
        field1091++;
    }

    @OriginalMember(owner = "client!vb", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V")
    public final synchronized void focusLost(FocusEvent arg0) {
        field1086++;
        if (class288.field5139 != null) {
            class110.field1903 = -1;
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Z)V")
    public static void method379(boolean arg0) {
        field1090 = null;
        field1080 = null;
        field1081 = null;
        if (arg0) {
            field1082 = null;
        }
    }

    @OriginalMember(owner = "client!vb", name = "b", descriptor = "(III)V")
    public static final void method380(int arg0, int arg1, int arg2) {
        if (class14.field204 > 0) {
            class95.method691(class14.field204, 12);
            class14.field204 = 0;
        }
        field1088++;
        short var3 = 256;
        int var4 = 0;
        int var5 = class72.field1250 * arg2;
        int var6 = 0;
        int var7 = 5 % ((38 - arg1) / 61);
        for (int var8 = 1; var8 < var3 - 1; var8++) {
            int var9 = (var3 - var8) * class182.field3290[var8] / var3;
            if (var9 < 0) {
                var9 = 0;
            }
            var4 += var9;
            for (int var10 = var9; var10 < 128; var10++) {
                int var12 = class72.field1254[arg0 + var5++];
                int var13 = class37.field553[var4++];
                if (var13 == 0) {
                    class173.field3185.field693[var6++] = var12;
                } else {
                    int var14 = var13 + 18;
                    if (var14 > 255) {
                        var14 = 255;
                    }
                    int var15 = 256 - var13 - 18;
                    int var16 = class197.field3566[var13];
                    if (var15 > 255) {
                        var15 = 255;
                    }
                    class173.field3185.field693[var6++] = class136.method953(16711680, var15 * class136.method953(var12, 65280) + var14 * class136.method953(var16, 65280)) + class136.method953(class136.method953(var16, 16711935) * var14 + (var15 * class136.method953(16711935, var12)), -16711936) >> 8;
                }
            }
            for (int var11 = 0; var11 < var9; var11++) {
                class173.field3185.field693[var6++] = class72.field1254[arg0 + var5++];
            }
            var5 += class72.field1250 - 128;
        }
        class173.field3185.method276(arg0, arg2);
    }

    @OriginalMember(owner = "client!vb", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V")
    public final void keyTyped(KeyEvent arg0) {
        field1087++;
        if (class288.field5139 != null) {
            int var2 = class41.method241(arg0, -25442);
            if (var2 >= 0) {
                int var3 = class256.field4481 + 1 & 0x7F;
                if (class276.field4942 != var3) {
                    class5.field50[class256.field4481] = -1;
                    class138.field2522[class256.field4481] = var2;
                    class256.field4481 = var3;
                }
            }
        }
        arg0.consume();
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IZ)V")
    public static final void method381(int arg0, boolean arg1) {
        if (arg1) {
            if (class11.field161 != -1) {
                class231.method1565(class11.field161, arg0 - 564);
            }
            for (class3 var2 = (class3) class34.field499.method633((byte) 32); var2 != null; var2 = (class3) class34.field499.method630(11)) {
                class40.method239(var2, true, arg0 + 15353);
            }
            class11.field161 = -1;
            class34.field499 = new class85(8);
            class62.method390(12860);
            class11.field161 = class277.field4956;
            class259.method1783(false, false);
            class247.method1716(arg0 ^ 0x58);
            class74.method501(class11.field161, (byte) -89);
        }
        class169.field3134 = -1;
        field1079++;
        class248.method1724(class9.field124, true);
        class77.field1449 = new class127();
        class77.field1449.field2347 = 3000;
        class77.field1449.field2340 = 3000;
        if (arg0 == 8) {
            class91.method666(class270.field4864, arg0 - 8);
            class50.method329(-11461, 10);
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(Ljava/lang/String;B)Lid;")
    public static final class149 method382(String arg0, byte arg1) {
        field1078++;
        int var2 = 0;
        byte[] var3 = arg0.getBytes();
        int var4 = var3.length;
        class149 var5 = new class149();
        var5.field2694 = new byte[var4];
        if (arg1 <= 1) {
            method378(71, 36, 104);
        }
        while (var2 < var4) {
            int var6 = var3[var2++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var2 >= var4) {
                    break;
                }
                int var7 = var3[var2++] & 0xFF;
                var5.field2694[var5.field2670++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var5.field2694[var5.field2670++] = (byte) var6;
            }
        }
        var5.method1042((byte) -128);
        return var5.method1029(-71);
    }
}
