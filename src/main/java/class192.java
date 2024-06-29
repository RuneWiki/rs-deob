import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lg")
public class class192 extends class308 {

    @OriginalMember(owner = "client!lg", name = "H", descriptor = "Luk;")
    public class115 field2976;

    @OriginalMember(owner = "client!lg", name = "G", descriptor = "[[S")
    public static short[][] field2975 = new short[][] { { 6554, 115, 10304, 28, 5702, 7756, 5681, 4510, -31835, 22437, 2859, -11339, 16, 5157, 10446, 3658, -27314, -21965, 472, 580, 784, 21966, 28950, -15697, -14002 }, { 9104, 10275, 7595, 3610, 7975, 8526, 918, -26734, 24466, 10145, -6882, 5027, 1457, 16565, -30545, 25486, 24, 5392, 10429, 3673, -27335, -21957, 192, 687, 412, 21821, 28835, -15460, -14019 }, new short[0], new short[0], new short[0] };

    @OriginalMember(owner = "client!lg", name = "C", descriptor = "I")
    public static int field2972 = 0;

    @OriginalMember(owner = "client!lg", name = "z", descriptor = "I")
    public static int field2970;

    @OriginalMember(owner = "client!lg", name = "A", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!lg", name = "E", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!lg", name = "F", descriptor = "I")
    public static int field2974;

    @OriginalMember(owner = "client!lg", name = "I", descriptor = "I")
    public static int field2977;

    @OriginalMember(owner = "client!lg", name = "J", descriptor = "I")
    public static int field2978;

    @OriginalMember(owner = "client!lg", name = "K", descriptor = "I")
    public static int field2979;

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(BIZLjava/lang/String;Ljava/awt/Color;)V", line = 6)
    public static final void method1322(byte arg0, int arg1, boolean arg2, String arg3, Color arg4) {
        try {
            Graphics var5 = class235.field3731.getGraphics();
            if (class209.field3186 == null) {
                class209.field3186 = new Font("Helvetica", 1, 13);
                class47.field687 = class235.field3731.getFontMetrics(class209.field3186);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class233.field3712, class243.field3838);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class214.field3299 == null) {
                    class214.field3299 = class235.field3731.createImage(304, 34);
                }
                Graphics var6 = class214.field3299.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                if (arg0 != -79) {
                    field2975 = (short[][]) ((short[][]) null);
                }
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg1 * 3) + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class209.field3186);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class47.field687.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class214.field3299, class233.field3712 / 2 - 152, class243.field3838 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class233.field3712 / 2 - 152;
                int var9 = class243.field3838 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class209.field3186);
                var5.setColor(Color.white);
                var5.drawString(arg3, var8 + (304 - class47.field687.stringWidth(arg3)) / 2, var9 + 22);
            }
            if (class138.field2176 != null) {
                var5.setFont(class209.field3186);
                var5.setColor(Color.white);
                var5.drawString(class138.field2176, class233.field3712 / 2 - (class47.field687.stringWidth(class138.field2176) / 2), class243.field3838 / 2 - 26);
            }
        } catch (Exception var12) {
            class235.field3731.repaint();
        }
        field2978++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 77)
    public static final void method1323(boolean arg0, Component arg1) {
        if (!arg0) {
            field2975 = (short[][]) ((short[][]) null);
        }
        field2977++;
        arg1.removeMouseListener(class275.field4544);
        arg1.removeMouseMotionListener(class275.field4544);
        arg1.removeFocusListener(class275.field4544);
        class117.field1711 = 0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(IB)V", line = 96)
    public static final void method1324(int arg0, byte arg1) {
        if (arg1 != 87) {
            method1327((byte) -33);
        }
        if (class58.field873 == arg0 && arg0 != 0) {
            class62 var2 = class207.field3153[arg0];
            var2.method119(class92.field1362);
        }
        field2974++;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(Ljava/lang/String;I)J", line = 115)
    public static final long method1325(String arg0, int arg1) {
        int var2 = arg0.length();
        if (arg1 > -75) {
            return 119L;
        }
        field2970++;
        long var3 = 0L;
        for (int var5 = 0; var5 < var2; var5++) {
            var3 = (long) arg0.charAt(var5) + (var3 << 5) - var3;
        }
        return var3;
    }

    @OriginalMember(owner = "client!lg", name = "a", descriptor = "(II)V", line = 141)
    public static final void method1326(int arg0, int arg1) {
        if (arg0 != 2) {
            field2975 = (short[][]) ((short[][]) null);
        }
        field2971++;
        class211 var2 = class17.method115(4, arg1, 4086);
        var2.method1435((byte) -2);
    }

    @OriginalMember(owner = "client!lg", name = "<init>", descriptor = "(Luk;)V", line = 154)
    public class192(class115 arg0) {
        this.field2976 = arg0;
    }

    @OriginalMember(owner = "client!lg", name = "b", descriptor = "(B)V", line = 170)
    public static void method1327(byte arg0) {
        if (arg0 == 51) {
            field2975 = (short[][]) null;
        }
    }
}
