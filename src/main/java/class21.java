import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!l")
public class class21 {

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "Lt;")
    public static class36 field261 = class3.method8(13631, "Sandpit");

    @OriginalMember(owner = "mapview!l", name = "d", descriptor = "Lt;")
    public static class36 field263 = class3.method8(13631, "Transportation");

    @OriginalMember(owner = "mapview!l", name = "f", descriptor = "Lt;")
    public static class36 field265 = class3.method8(13631, "_");

    @OriginalMember(owner = "mapview!l", name = "j", descriptor = "Lt;")
    public static class36 field269 = class3.method8(13631, "Dairy Churn");

    @OriginalMember(owner = "mapview!l", name = "g", descriptor = "Lt;")
    public static class36 field266 = class3.method8(13631, "Loom");

    @OriginalMember(owner = "mapview!l", name = "i", descriptor = "Lt;")
    public static class36 field268 = class3.method8(13631, "POH Portal");

    @OriginalMember(owner = "mapview!l", name = "m", descriptor = "Lt;")
    public static class36 field272 = class3.method8(13631, "(U");

    @OriginalMember(owner = "mapview!l", name = "l", descriptor = "I")
    public static volatile int field271 = 0;

    @OriginalMember(owner = "mapview!l", name = "k", descriptor = "J")
    public long field270;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "Ll;")
    public class21 field260;

    @OriginalMember(owner = "mapview!l", name = "h", descriptor = "Ll;")
    public class21 field267;

    @OriginalMember(owner = "mapview!l", name = "e", descriptor = "Ljava/awt/Frame;")
    public static Frame field264;

    @OriginalMember(owner = "mapview!l", name = "c", descriptor = "[B")
    public static byte[] field262;

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/awt/Color;Lt;BI)V", line = 18)
    public static final void method123(Color arg0, class36 arg1, byte arg2, int arg3) {
        try {
            Graphics var4 = class41.field544.getGraphics();
            if (class34.field477 == null) {
                class34.field477 = new Font("Helvetica", 1, 13);
                class4.field28 = class41.field544.getFontMetrics(class34.field477);
            }
            if (class4.field33) {
                class4.field33 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class20.field250, class20.field254);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class4.field29 == null) {
                    class4.field29 = class41.field544.createImage(304, 34);
                }
                Graphics var5 = class4.field29.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                if (arg2 >= -60) {
                    return;
                }
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class34.field477);
                var5.setColor(Color.white);
                arg1.method204(22, -94, var5, (304 - arg1.method211(class4.field28, true)) / 2);
                var4.drawImage(class4.field29, class20.field250 / 2 - 152, class20.field254 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class20.field250 / 2 - 152;
                int var8 = class20.field254 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class34.field477);
                var4.setColor(Color.white);
                arg1.method204(var8 + 22, -102, var4, (304 - arg1.method211(class4.field28, true)) / 2 + var7);
            }
        } catch (Exception var11) {
            class41.field544.repaint();
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 87)
    public static final void method124(Component arg0, int arg1) {
        arg0.addMouseListener(class6.field63);
        if (arg1 <= -1) {
            arg0.addMouseMotionListener(class6.field63);
            arg0.addFocusListener(class6.field63);
        }
    }

    @OriginalMember(owner = "mapview!l", name = "a", descriptor = "(I)V", line = 125)
    public static void method125(int arg0) {
        field266 = null;
        field268 = null;
        field265 = null;
        if (arg0 > -19) {
            return;
        }
        field263 = null;
        field264 = null;
        field262 = null;
        field261 = null;
        field272 = null;
        field269 = null;
    }

    @OriginalMember(owner = "mapview!l", name = "b", descriptor = "(I)V", line = 143)
    public final void method126(int arg0) {
        if (this.field260 == null) {
            return;
        }
        this.field260.field267 = this.field267;
        if (arg0 == 1) {
            this.field267.field260 = this.field260;
            this.field267 = null;
            this.field260 = null;
        }
    }
}
