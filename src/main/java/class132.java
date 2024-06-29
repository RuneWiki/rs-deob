import java.awt.Container;
import java.awt.Insets;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bc")
public class class132 extends class320 {

    @OriginalMember(owner = "client!bc", name = "s", descriptor = "J")
    public long field2266;

    @OriginalMember(owner = "client!bc", name = "l", descriptor = "I")
    public static int field2259;

    @OriginalMember(owner = "client!bc", name = "n", descriptor = "I")
    public static int field2261;

    @OriginalMember(owner = "client!bc", name = "o", descriptor = "I")
    public static int field2262;

    @OriginalMember(owner = "client!bc", name = "p", descriptor = "I")
    public static int field2263;

    @OriginalMember(owner = "client!bc", name = "q", descriptor = "I")
    public static int field2264;

    @OriginalMember(owner = "client!bc", name = "m", descriptor = "[I")
    public static int[] field2260;

    @OriginalMember(owner = "client!bc", name = "r", descriptor = "[Lrn;")
    public static class37[] field2265;

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIC)I", line = 6)
    public static final int method1082(int arg0, int arg1, char arg2) {
        if (arg0 < 22) {
            method1085(59, 57, 55);
        }
        field2261++;
        int var3 = arg2 << 4;
        if (Character.isUpperCase(arg2) || Character.isTitleCase(arg2)) {
            arg2 = Character.toLowerCase(arg2);
            var3 = (arg2 << 4) + 1;
        }
        if (arg2 == 'ñ' && arg1 == 0) {
            var3 = 1762;
        }
        return var3;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(IIBII)I", line = 30)
    public static final int method1083(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2259++;
        if (class329.field5247) {
            arg0 = 1000000;
            class329.field5247 = false;
        }
        if (arg2 < 103) {
            return 60;
        }
        class36 var5 = client.field4377[arg4][arg3];
        int var6 = var5.field518;
        float var7 = ((float) arg1 * 0.1F + 0.7F) * var5.field521;
        float var8 = var5.field512;
        float var9 = var5.field519;
        class326 var10 = var5.field524;
        float var11 = var5.field513;
        int var12 = var5.field520;
        int var13 = var5.field528;
        float var14 = var5.field523;
        float var15 = var5.field517;
        if (!class181.field3043) {
            var12 = 0;
        }
        if (class230.field3841 != var6 || class214.field3598 != var7 || class342.field5450 != var9 || class170.field2950 != var8 || class32.field457 != var13 || class224.field3736 != var12 || class219.field3657 != var10 || class177.field3002 != var15 || class218.field3640 != var14 || class159.field2816 != var11) {
            class330.field5248 = class166.field2905;
            class320.field5072 = class344.field5475;
            class207.field3518 = class152.field2686;
            class180.field3040 = class166.field2901;
            class41.field611 = class88.field1388;
            class329.field5236 = class148.field2657;
            class24.field343 = class18.field290;
            class68.field1111 = class12.field172;
            class184.field3133 = class36.field532;
            class332.field5290 = class194.field3242;
            if (class113.field1889 == null || class329.field5236 == class113.field1889) {
                class113.field1889 = new class326();
            }
            class342.field5450 = var9;
            class218.field3640 = var14;
            class219.field3657 = var10;
            class26.field368 = 0;
            class214.field3598 = var7;
            class224.field3736 = var12;
            class177.field3002 = var15;
            class159.field2816 = var11;
            class170.field2950 = var8;
            class32.field457 = var13;
            class230.field3841 = var6;
        }
        if (class26.field368 < 65536) {
            class26.field368 += arg0 * 250;
            if (class26.field368 >= 65536) {
                class166.field2901 = class32.field457;
                class329.field5236 = null;
                class152.field2686 = class230.field3841;
                class88.field1388 = class159.field2816;
                class12.field172 = class177.field3002;
                class166.field2905 = class170.field2950;
                class194.field3242 = class218.field3640;
                class36.field532 = class224.field3736;
                class18.field290 = class214.field3598;
                class26.field368 = 65536;
                class344.field5475 = class342.field5450;
                class148.field2657 = class219.field3657;
            } else {
                int var16 = class26.field368 >> 8;
                float var17 = (float) (65536 - class26.field368) / 65536.0F;
                int var18 = 65536 - class26.field368 >> 8;
                float var19 = (float) class26.field368 / 65536.0F;
                class88.field1388 = class41.field611 * var17 + class159.field2816 * var19;
                class36.field532 = class224.field3736 * var16 + class184.field3133 * var18 >> 8;
                class166.field2905 = class330.field5248 * var17 + class170.field2950 * var19;
                class18.field290 = class24.field343 * var17 + class214.field3598 * var19;
                class194.field3242 = class332.field5290 * var17 + class218.field3640 * var19;
                class152.field2686 = ((class230.field3841 & 0xFF00) * var16 + (class207.field3518 & 0xFF00) * var18 & 0xFF0000) + ((class230.field3841 & 0xFF00FF) * var16 + (class207.field3518 & 0xFF00FF) * var18 & 0xFF00FF00) >> 8;
                class344.field5475 = class342.field5450 * var19 + class320.field5072 * var17;
                class166.field2901 = ((class180.field3040 & 0xFF00FF) * var18 + ((class32.field457 & 0xFF00FF) * var16) & 0xFF00FF00) + ((class32.field457 & 0xFF00) * var16 + (class180.field3040 & 0xFF00) * var18 & 0xFF0000) >> 8;
                class12.field172 = class68.field1111 * var17 + class177.field3002 * var19;
                if (class329.field5236 != class219.field3657) {
                    if (class329.field5236 == null || class219.field3657 == null) {
                        class148.field2657 = null;
                    } else {
                        class148.field2657 = class113.field1889.method2268(class329.field5236, class219.field3657, (float) class26.field368 / 65536.0F);
                    }
                }
            }
        }
        return class166.field2901;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(B)V", line = 159)
    public static void method1084(byte arg0) {
        if (arg0 < 100) {
            method1085(99, 107, -86);
        }
        field2260 = null;
        field2265 = null;
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(III)Lhk;", line = 173)
    public static final class330 method1085(int arg0, int arg1, int arg2) {
        class257 var3 = class279.field4430[arg0][arg1][arg2];
        return var3 == null || var3.field4140 == null ? null : var3.field4140;
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "()V", line = 183)
    public class132() {
    }

    @OriginalMember(owner = "client!bc", name = "a", descriptor = "(ILjava/lang/String;)Ljava/lang/String;", line = 188)
    public static final String method1086(int arg0, String arg1) {
        field2264++;
        if (arg0 != -31109) {
            method1086(-61, (String) null);
        }
        String var2 = class195.method1467(class142.method1151(arg1, -53), -11026);
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bc", name = "c", descriptor = "(I)V", line = 204)
    public static final void method1087(int arg0) {
        field2263++;
        Container var1;
        if (class120.field2076 != null) {
            var1 = class120.field2076;
        } else if (class271.field4321 == null) {
            var1 = class85.field1369.field910;
        } else {
            var1 = class271.field4321;
        }
        class56.field864 = var1.getSize().width;
        class213.field3589 = var1.getSize().height;
        if (class271.field4321 == var1) {
            Insets var2 = class271.field4321.getInsets();
            class213.field3589 -= var2.top + var2.bottom;
            class56.field864 -= var2.left + var2.right;
        }
        if (class209.method1554(-121) < 2) {
            class313.field4973 = 765;
            class12.field146 = 0;
            class101.field1628 = (class56.field864 - 765) / 2;
            class188.field3152 = 503;
        } else {
            class313.field4973 = class56.field864;
            class101.field1628 = 0;
            class12.field146 = 0;
            class188.field3152 = class213.field3589;
        }
        if (arg0 > -69) {
            field2260 = (int[]) null;
        }
        if (class43.field680) {
            class43.method355(class313.field4973, class188.field3152);
        }
        class42.field616.setSize(class313.field4973, class188.field3152);
        if (class271.field4321 == var1) {
            Insets var3 = class271.field4321.getInsets();
            class42.field616.setLocation(class101.field1628 + var3.left, class12.field146 + var3.top);
        } else {
            class42.field616.setLocation(class101.field1628, class12.field146);
        }
        if (class311.field4933 != -1) {
            class84.method762(true, 28406);
        }
        class324.method2250(114);
    }

    @OriginalMember(owner = "client!bc", name = "<init>", descriptor = "(J)V", line = 266)
    public class132(long arg0) {
        this.field2266 = arg0;
    }
}
