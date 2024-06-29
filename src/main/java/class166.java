import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pc")
public class class166 {

    @OriginalMember(owner = "client!pc", name = "c", descriptor = "Li;")
    public static class88 field3191 = class208.method1425(105, "(U2");

    @OriginalMember(owner = "client!pc", name = "n", descriptor = "[Lia;")
    public static class89[] field3202 = new class89[4];

    @OriginalMember(owner = "client!pc", name = "l", descriptor = "Li;")
    private static class88 field3200 = class208.method1425(105, "The server is being updated)3");

    @OriginalMember(owner = "client!pc", name = "e", descriptor = "Li;")
    public static class88 field3193 = field3200;

    @OriginalMember(owner = "client!pc", name = "f", descriptor = "I")
    public static int field3194 = -1;

    @OriginalMember(owner = "client!pc", name = "o", descriptor = "Li;")
    public static class88 field3203 = class208.method1425(105, "<img=0>");

    @OriginalMember(owner = "client!pc", name = "b", descriptor = "Leh;")
    public static class53 field3190 = new class53();

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "I")
    public static int field3189;

    @OriginalMember(owner = "client!pc", name = "d", descriptor = "I")
    public int field3192;

    @OriginalMember(owner = "client!pc", name = "g", descriptor = "I")
    public int field3195;

    @OriginalMember(owner = "client!pc", name = "i", descriptor = "I")
    public static int field3197;

    @OriginalMember(owner = "client!pc", name = "j", descriptor = "I")
    public static int field3198;

    @OriginalMember(owner = "client!pc", name = "k", descriptor = "I")
    public int field3199;

    @OriginalMember(owner = "client!pc", name = "p", descriptor = "J")
    public long field3204;

    @OriginalMember(owner = "client!pc", name = "h", descriptor = "Lnc;")
    public class145 field3196;

    @OriginalMember(owner = "client!pc", name = "m", descriptor = "Lgi;")
    public static class75 field3201;

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "([Li;I)Li;")
    public static final class88 method1142(class88[] arg0, int arg1) {
        field3198++;
        if (arg1 < ~arg0.length) {
            throw new IllegalArgumentException();
        }
        return class165.method1135(arg0.length, arg0, -124, 0);
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field3191 = null;
        field3201 = null;
        field3202 = null;
        field3200 = null;
        field3193 = null;
        field3190 = null;
        field3203 = null;
        if (arg0 != 34) {
            field3200 = null;
        }
    }

    @OriginalMember(owner = "client!pc", name = "a", descriptor = "(ILjava/awt/Color;Li;ZI)V")
    public static final void method1144(int arg0, Color arg1, class88 arg2, boolean arg3, int arg4) {
        try {
            Graphics var5 = class154.field2977.getGraphics();
            if (class15.field228 == null) {
                class15.field228 = new Font("Helvetica", 1, 13);
                class201.field3842 = class154.field2977.getFontMetrics(class15.field228);
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class222.field4194, class145.field2727);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class143.field2645 == null) {
                    class143.field2645 = class154.field2977.createImage(304, 34);
                }
                Graphics var6 = class143.field2645.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                if (arg0 != -484) {
                    return;
                }
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - arg4 * 3, 30);
                var6.setFont(class15.field228);
                var6.setColor(Color.white);
                arg2.method620((304 - arg2.method609(false, class201.field3842)) / 2, 22, var6, 1003);
                var5.drawImage(class143.field2645, class222.field4194 / 2 - 152, class145.field2727 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class222.field4194 / 2 - 152;
                int var8 = class145.field2727 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var7 + 2, var8 + 2, 300 - arg4 * 3, 30);
                var5.setFont(class15.field228);
                var5.setColor(Color.white);
                arg2.method620(var7 + (304 - arg2.method609(false, class201.field3842)) / 2, var8 + 22, var5, 1003);
            }
            if (class147.field2754 != null) {
                var5.setFont(class15.field228);
                var5.setColor(Color.white);
                class147.field2754.method620(class222.field4194 / 2 - class147.field2754.method609(false, class201.field3842) / 2, class145.field2727 / 2 + -26, var5, 1003);
            }
        } catch (Exception var10) {
            class154.field2977.repaint();
        }
        field3197++;
    }
}
