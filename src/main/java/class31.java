import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!qa")
public class class31 extends class10 {

    @OriginalMember(owner = "mapview!qa", name = "p", descriptor = "I")
    public static int field430 = -1;

    @OriginalMember(owner = "mapview!qa", name = "r", descriptor = "Lia;")
    public static class15 field432 = class28.method196("Fishing Shop", false);

    @OriginalMember(owner = "mapview!qa", name = "s", descriptor = "[I")
    public static int[] field433 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 0, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "mapview!qa", name = "u", descriptor = "Lia;")
    public static class15 field435 = class28.method196("mapfunction", false);

    @OriginalMember(owner = "mapview!qa", name = "v", descriptor = "I")
    public static int field436;

    @OriginalMember(owner = "mapview!qa", name = "t", descriptor = "Lha;")
    public static class13 field434;

    @OriginalMember(owner = "mapview!qa", name = "q", descriptor = "Z")
    public static boolean field431;

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(ZLjava/awt/Component;)V", line = 16)
    public static final void method207(boolean arg0, Component arg1) {
        arg1.removeMouseListener(class27.field384);
        arg1.removeMouseMotionListener(class27.field384);
        arg1.removeFocusListener(class27.field384);
        class5.field45 = 0;
        if (arg0) {
            method207(false, null);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(IILjava/awt/Color;Lia;)V", line = 31)
    public static final void method208(int arg0, int arg1, Color arg2, class15 arg3) {
        try {
            Graphics var4 = class3.field32.getGraphics();
            if (class10.field91 == null) {
                class10.field91 = new Font("Helvetica", 1, 13);
                class39.field510 = class3.field32.getFontMetrics(class10.field91);
            }
            if (class21.field238) {
                class21.field238 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class25.field362, class25.field361);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class35.field490 == null) {
                    class35.field490 = class3.field32.createImage(304, 34);
                }
                Graphics var5 = class35.field490.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class10.field91);
                if (arg1 != -1) {
                    method210((byte) -3, 127);
                }
                var5.setColor(Color.white);
                arg3.method115(22, (byte) -123, (304 - arg3.method119((byte) 117, class39.field510)) / 2, var5);
                var4.drawImage(class35.field490, class25.field362 / 2 - 152, class25.field361 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class25.field362 / 2 - 152;
                int var8 = class25.field361 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class10.field91);
                var4.setColor(Color.white);
                arg3.method115(var8 + 22, (byte) -127, (304 - arg3.method119((byte) 59, class39.field510)) / 2 + var7, var4);
            }
        } catch (Exception var11) {
            class3.field32.repaint();
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "d", descriptor = "(I)V", line = 104)
    public static void method209(int arg0) {
        field435 = null;
        field432 = null;
        field434 = null;
        field433 = null;
        if (arg0 != -1) {
            method207(false, null);
        }
    }

    @OriginalMember(owner = "mapview!qa", name = "a", descriptor = "(BI)I", line = 124)
    public static final int method210(byte arg0, int arg1) {
        int var2 = -59 % ((-arg0 - 66) / 36);
        if (arg1 >= 65 && arg1 <= 90) {
            arg1 += 32;
        }
        return arg1;
    }

    @OriginalMember(owner = "mapview!qa", name = "b", descriptor = "(B)B", line = 160)
    public static final byte method211(byte arg0) {
        if (arg0 >= -36) {
            return -92;
        } else if (class15.field152 == null) {
            return 0;
        } else {
            return class15.field152[class13.field111];
        }
    }
}
