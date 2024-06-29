import java.awt.Component;
import java.awt.event.FocusEvent;
import java.awt.event.FocusListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.lang.reflect.Method;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class22 extends class259 implements KeyListener, FocusListener {

    @OriginalMember(owner = "client!cw", name = "q", descriptor = "Lmba;")
    private class646 field261 = new class646();

    @OriginalMember(owner = "client!cw", name = "C", descriptor = "Lmba;")
    private class646 field273 = new class646();

    @OriginalMember(owner = "client!cw", name = "E", descriptor = "[Z")
    private boolean[] field275 = new boolean[112];

    @OriginalMember(owner = "client!cw", name = "r", descriptor = "[I")
    public static int[] field262 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!cw", name = "y", descriptor = "Z")
    public static boolean field269 = false;

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    public static int field252;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "I")
    public static int field253;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "I")
    public static int field254;

    @OriginalMember(owner = "client!cw", name = "k", descriptor = "I")
    public static int field255;

    @OriginalMember(owner = "client!cw", name = "l", descriptor = "I")
    public static int field256;

    @OriginalMember(owner = "client!cw", name = "m", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!cw", name = "n", descriptor = "I")
    public static int field258;

    @OriginalMember(owner = "client!cw", name = "o", descriptor = "I")
    public static int field259;

    @OriginalMember(owner = "client!cw", name = "p", descriptor = "I")
    public static int field260;

    @OriginalMember(owner = "client!cw", name = "s", descriptor = "I")
    public static int field263;

    @OriginalMember(owner = "client!cw", name = "t", descriptor = "I")
    public static int field264;

    @OriginalMember(owner = "client!cw", name = "u", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!cw", name = "v", descriptor = "I")
    public static int field266;

    @OriginalMember(owner = "client!cw", name = "w", descriptor = "I")
    public static int field267;

    @OriginalMember(owner = "client!cw", name = "x", descriptor = "I")
    public static int field268;

    @OriginalMember(owner = "client!cw", name = "z", descriptor = "I")
    public static int field270;

    @OriginalMember(owner = "client!cw", name = "A", descriptor = "I")
    public static int field271;

    @OriginalMember(owner = "client!cw", name = "B", descriptor = "I")
    public static int field272;

    @OriginalMember(owner = "client!cw", name = "D", descriptor = "I")
    public static int field274;

    @OriginalMember(owner = "client!cw", name = "F", descriptor = "Ljava/awt/Component;")
    private Component field276;

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IBLjava/awt/event/KeyEvent;)V", line = 3)
    private final void method117(int arg0, byte arg1, KeyEvent arg2) {
        field257++;
        int var4 = arg2.getKeyCode();
        if (arg1 > -126) {
            method127((byte) 88);
        }
        int var5;
        if (var4 == 0) {
            var5 = 0;
        } else if (var4 >= 0 && class601.field8133.length > var4) {
            int var6 = class601.field8133[var4];
            if (arg0 == 0 && (var6 & 0x80) != 0) {
                var5 = 0;
            } else {
                var5 = var6 & 0xFFFFFF7F;
            }
        } else {
            var5 = 0;
        }
        if (var5 != 0) {
            this.method123(arg0, '\u0000', (byte) 106, var5);
            arg2.consume();
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)V", line = 39)
    public final synchronized void method118(byte arg0) {
        this.field261.method3615((byte) -109);
        if (arg0 != 1) {
            this.keyTyped(null);
        }
        field264++;
        for (class240 var2 = (class240) this.field273.method3623(0); var2 != null; var2 = (class240) this.field273.method3623(0)) {
            var2.field3586 = this.method122(true);
            if (var2.field3596 == 0) {
                if (!this.field275[var2.field3588]) {
                    class240 var5 = new class240();
                    var5.field3583 = var2.field3583;
                    var5.field3588 = var2.field3588;
                    var5.field3598 = '\u0000';
                    var5.field3586 = var2.field3586;
                    var5.field3596 = 0;
                    this.field261.method3610(9289, var5);
                    this.field275[var2.field3588] = true;
                }
                var2.field3596 = 2;
                this.field261.method3610(arg0 + 9288, var2);
            } else if (var2.field3596 == 1) {
                if (this.field275[var2.field3588]) {
                    this.field261.method3610(arg0 + 9288, var2);
                    this.field275[var2.field3588] = false;
                }
            } else if (var2.field3596 == -1) {
                for (int var3 = 0; var3 < 112; var3++) {
                    if (this.field275[var3]) {
                        class240 var4 = new class240();
                        var4.field3588 = var3;
                        var4.field3596 = 1;
                        var4.field3583 = var2.field3583;
                        var4.field3586 = var2.field3586;
                        var4.field3598 = '\u0000';
                        this.field261.method3610(9289, var4);
                        this.field275[var3] = false;
                    }
                }
            } else if (var2.field3596 == 3) {
                this.field261.method3610(9289, var2);
            }
        }
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(I)[Lkr;", line = 129)
    public static final class602[] method119(int arg0) {
        if (arg0 != 16864) {
            method119(-66);
        }
        field266++;
        return new class602[] { class425.field5958, class757.field10562, class594.field8072, class65.field1011, class697.field9740, class179.field2460, class375.field5273, class345.field4908, class539.field7486, class473.field6557, class184.field2526, class587.field7996, class601.field8134, class478.field6646, class583.field7962, class748.field10295, class209.field2728, class291.field4176, class429.field6010, class446.field6190, class233.field3468, class339.field4804, class339.field4805, class602.field8146, class472.field6540, class121.field1598, class236.field3495, class627.field8432, class35.field452, class713.field9958, class38.field477, class337.field4730, class319.field4429, class84.field1201, class542.field7534, class360.field5157, class665.field9170, class171.field2374, class349.field4959, class129.field1787, class476.field6631, class548.field7628, class133.field1877, class711.field9928, class25.field319, class540.field7507, class332.field4705, class182.field2496, class144.field2028, class436.field6090, class275.field3983, class490.field6892, class347.field4930, class173.field2397, class51.field752, class105.field1432, class667.field9214, class220.field2974, class179.field2456, class390.field5618, client.field6221, class505.field7026, class487.field6810, class662.field8786, class65.field1020, class610.field8216, class193.field2624, class697.field9737, class748.field10297, class178.field2433, class606.field8179, class535.field7423, class750.field10310, class180.field2477, class656.field8760, class210.field2747, class175.field2403, class376.field5282, class61.field882, class561.field7804, class318.field4407, class571.field7895, class605.field8171, class473.field6559, class463.field6433, class601.field8140, class206.field2700, class571.field7880, class152.field2095, class367.field5204, class15.field146, class746.field10263, class675.field9368, class384.field5506, class601.field8139, class545.field7558, class54.field782, class677.field9385, class388.field5582, class553.field7712, class545.field7566, class99.field1377, class623.field8401, class30.field357, class360.field5155, class652.field8735, class156.field2188, class457.field6329, class101.field1389, class455.field6306, class465.field6467, class374.field5271, class216.field2813, class139.field1980, class720.field10019, class460.field6378, class747.field10284, class292.field4189, class395.field5681, class619.field8308, class312.field4330, class749.field10307, class691.field9616, class171.field2376 };
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 142)
    private final void method120(boolean arg0, Component arg1) {
        field265++;
        this.method125((byte) 53);
        this.field276 = arg1;
        Method var3 = class135.field1928;
        if (var3 != null) {
            try {
                var3.invoke(this.field276, Boolean.FALSE);
            } catch (Throwable var4) {
            }
        }
        this.field276.addKeyListener(this);
        this.field276.addFocusListener(this);
        if (!arg0) {
            field262 = null;
        }
    }

    @OriginalMember(owner = "client!cw", name = "keyTyped", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 169)
    public final synchronized void keyTyped(KeyEvent arg0) {
        field253++;
        char var2 = arg0.getKeyChar();
        if (var2 != '\u0000' && class493.method2985(var2, 160)) {
            this.method123(3, var2, (byte) 99, -1);
            arg0.consume();
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)Lup;", line = 183)
    public final class241 method121(int arg0) {
        field259++;
        if (arg0 >= -100) {
            this.focusGained(null);
        }
        return (class241) this.field261.method3623(0);
    }

    @OriginalMember(owner = "client!cw", name = "focusGained", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 194)
    public final void focusGained(FocusEvent arg0) {
        field260++;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(Z)I", line = 204)
    private final int method122(boolean arg0) {
        field258++;
        int var2 = 0;
        if (!arg0) {
            method119(-113);
        }
        if (this.field275[81]) {
            var2 |= 0x1;
        }
        if (this.field275[82]) {
            var2 |= 0x4;
        }
        if (this.field275[86]) {
            var2 |= 0x2;
        }
        return var2;
    }

    @OriginalMember(owner = "client!cw", name = "keyReleased", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 239)
    public final synchronized void keyReleased(KeyEvent arg0) {
        field256++;
        this.method117(1, (byte) -127, arg0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ICBI)V", line = 247)
    private final void method123(int arg0, char arg1, byte arg2, int arg3) {
        field252++;
        class240 var5 = new class240();
        var5.field3598 = arg1;
        var5.field3596 = arg0;
        var5.field3588 = arg3;
        int var6 = 45 % ((49 - arg2) / 43);
        var5.field3583 = class97.method664((byte) -50);
        this.field273.method3610(9289, var5);
    }

    @OriginalMember(owner = "client!cw", name = "keyPressed", descriptor = "(Ljava/awt/event/KeyEvent;)V", line = 263)
    public final synchronized void keyPressed(KeyEvent arg0) {
        this.method117(0, (byte) -127, arg0);
        field274++;
    }

    @OriginalMember(owner = "client!cw", name = "focusLost", descriptor = "(Ljava/awt/event/FocusEvent;)V", line = 272)
    public final synchronized void focusLost(FocusEvent arg0) {
        this.method123(-1, '\u0000', (byte) 104, 0);
        field270++;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FBFFI)F", line = 280)
    public static final float method124(float arg0, byte arg1, float arg2, float arg3, int arg4) {
        field263++;
        float[] var5 = class362.field5170[arg4];
        if (arg1 != -5) {
            method126(38, null, (byte) -17);
        }
        return var5[2] * arg0 + var5[1] * arg3 + var5[0] * arg2;
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)V", line = 294)
    private final void method125(byte arg0) {
        field268++;
        if (this.field276 == null) {
            return;
        }
        this.field276.removeKeyListener(this);
        this.field276.removeFocusListener(this);
        this.field276 = null;
        for (int var2 = 0; var2 < 112; var2++) {
            this.field275[var2] = false;
        }
        if (arg0 != 53) {
            this.field276 = null;
        }
        this.field261.method3615((byte) 92);
        this.field273.method3615((byte) 103);
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 394)
    public class22(Component arg0) {
        class400.method2490(-15227);
        this.method120(true, arg0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILjava/lang/String;B)V", line = 327)
    public static final void method126(int arg0, String arg1, byte arg2) {
        field255++;
        class346 var3 = class299.method1976(0, 3, arg0);
        var3.method2209(255);
        if (arg2 < 22) {
            method124(2.5641298F, (byte) -6, 0.07119577F, -0.68766403F, -12);
        }
        var3.field4923 = arg1;
    }

    @OriginalMember(owner = "client!cw", name = "d", descriptor = "(B)V", line = 344)
    public static void method127(byte arg0) {
        field262 = null;
        if (arg0 != 117) {
            field269 = false;
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)V", line = 356)
    public final void method128(byte arg0) {
        if (arg0 == -123) {
            this.method125((byte) 53);
            field271++;
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II)Z", line = 368)
    public final boolean method129(int arg0, int arg1) {
        field272++;
        if (arg1 < 72) {
            this.method128((byte) -65);
        }
        return arg0 >= 0 && arg0 < 112 ? this.field275[arg0] : false;
    }
}
