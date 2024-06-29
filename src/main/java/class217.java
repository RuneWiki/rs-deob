import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nj")
public class class217 extends class117 {

    @OriginalMember(owner = "client!nj", name = "m", descriptor = "I")
    public int field3190 = 0;

    @OriginalMember(owner = "client!nj", name = "y", descriptor = "I")
    public int field3202 = -1;

    @OriginalMember(owner = "client!nj", name = "v", descriptor = "Lbo;")
    public static class16 field3199 = new class16();

    @OriginalMember(owner = "client!nj", name = "B", descriptor = "I")
    public static int field3205 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!nj", name = "l", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!nj", name = "n", descriptor = "I")
    public int field3191;

    @OriginalMember(owner = "client!nj", name = "o", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!nj", name = "p", descriptor = "I")
    public int field3193;

    @OriginalMember(owner = "client!nj", name = "q", descriptor = "I")
    public int field3194;

    @OriginalMember(owner = "client!nj", name = "r", descriptor = "I")
    public static int field3195;

    @OriginalMember(owner = "client!nj", name = "s", descriptor = "I")
    public int field3196;

    @OriginalMember(owner = "client!nj", name = "t", descriptor = "I")
    public int field3197;

    @OriginalMember(owner = "client!nj", name = "u", descriptor = "I")
    public int field3198;

    @OriginalMember(owner = "client!nj", name = "w", descriptor = "I")
    public int field3200;

    @OriginalMember(owner = "client!nj", name = "x", descriptor = "I")
    public int field3201;

    @OriginalMember(owner = "client!nj", name = "z", descriptor = "I")
    public static int field3203;

    @OriginalMember(owner = "client!nj", name = "A", descriptor = "I")
    public int field3204;

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IILjava/awt/Color;Ljava/lang/String;Z)V", line = 10)
    public static final void method1565(int arg0, int arg1, Color arg2, String arg3, boolean arg4) {
        try {
            Graphics var5 = class306.field4585.getGraphics();
            if (class50.field741 == null) {
                class50.field741 = new Font("Helvetica", 1, 13);
                class4.field111 = class306.field4585.getFontMetrics(class50.field741);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class286.field4312, class19.field301);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class186.field2671 == null) {
                    class186.field2671 = class306.field4585.createImage(304, 34);
                }
                Graphics var6 = class186.field2671.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class50.field741);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class4.field111.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class186.field2671, class286.field4312 / 2 - 152, class19.field301 / arg1 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class286.field4312 / 2 - 152;
                int var9 = class19.field301 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg0 * 3) + 2, var9 - -2, 300 - (arg0 * 3), 30);
                var5.setFont(class50.field741);
                var5.setColor(Color.white);
                var5.drawString(arg3, var8 + (304 - class4.field111.stringWidth(arg3)) / 2, var9 + 22);
            }
            if (class166.field2380 != null) {
                var5.setFont(class50.field741);
                var5.setColor(Color.white);
                var5.drawString(class166.field2380, class286.field4312 / 2 - (class4.field111.stringWidth(class166.field2380) / 2), class19.field301 / 2 + -26);
            }
        } catch (Exception var12) {
            class306.field4585.repaint();
        }
        field3189++;
    }

    @OriginalMember(owner = "client!nj", name = "d", descriptor = "(I)V", line = 86)
    public static void method1566(int arg0) {
        field3199 = null;
        if (arg0 != 140) {
            method1565(38, -19, (Color) null, (String) null, false);
        }
    }

    @OriginalMember(owner = "client!nj", name = "a", descriptor = "(IIB)I", line = 97)
    public static final int method1567(int arg0, int arg1, byte arg2) {
        field3203++;
        int var3 = class157.method1132(arg1 + 91923, arg0 + 45365, true, 4) + (class157.method1132(arg1 + 37821, arg0 + 10294, true, 2) - 128 >> 1) + (class157.method1132(arg1, arg0, true, 1) - 128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        int var5 = 12 % ((2 - arg2) / 58);
        return var4;
    }
}
