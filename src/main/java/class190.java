import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uf")
public abstract class class190 {

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "Lrf;")
    public static class163 field3776 = class53.method392(-119, " <col=ffff00>");

    @OriginalMember(owner = "client!uf", name = "d", descriptor = "Lrf;")
    public static class163 field3778 = class53.method392(-120, "null");

    @OriginalMember(owner = "client!uf", name = "f", descriptor = "[I")
    public static int[] field3780 = new int[4000];

    @OriginalMember(owner = "client!uf", name = "e", descriptor = "Lrf;")
    public static class163 field3779 = class53.method392(-105, "jlv");

    @OriginalMember(owner = "client!uf", name = "c", descriptor = "I")
    public static int field3777;

    @OriginalMember(owner = "client!uf", name = "g", descriptor = "I")
    public static int field3781;

    @OriginalMember(owner = "client!uf", name = "h", descriptor = "I")
    public static int field3782;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "Lrh;")
    public static class165 field3775;

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(III)I")
    public abstract int method221(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(I)V")
    public abstract void method222(int arg0);

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(Z)V")
    public static void method1282(boolean arg0) {
        field3778 = null;
        field3780 = null;
        field3776 = null;
        field3779 = null;
        if (arg0) {
            method1284(-62);
        }
        field3775 = null;
    }

    @OriginalMember(owner = "client!uf", name = "a", descriptor = "(BLjava/awt/Color;Lrf;I)V")
    public static final void method1283(byte arg0, Color arg1, class163 arg2, int arg3) {
        int var4 = 4 % ((42 - arg0) / 47);
        try {
            Graphics var5 = class25.field445.getGraphics();
            if (class21.field362 == null) {
                class21.field362 = new Font("Helvetica", 1, 13);
                class118.field2493 = class25.field445.getFontMetrics(class21.field362);
            }
            if (class12.field238) {
                class12.field238 = false;
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class170.field3460, class6.field125);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class154.field3202 == null) {
                    class154.field3202 = class25.field445.createImage(304, 34);
                }
                Graphics var6 = class154.field3202.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(class21.field362);
                var6.setColor(Color.white);
                arg2.method1028(22, (304 - arg2.method1046(class118.field2493, (byte) -25)) / 2, var6, -114);
                var5.drawImage(class154.field3202, class170.field3460 / 2 - 152, class6.field125 / 2 + -18, null);
            } catch (Exception var9) {
                int var7 = class170.field3460 / 2 - 152;
                int var8 = class6.field125 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var5.setFont(class21.field362);
                var5.setColor(Color.white);
                arg2.method1028(var8 + 22, var7 + (-arg2.method1046(class118.field2493, (byte) -25) + 304) / 2, var5, -109);
            }
        } catch (Exception var10) {
            class25.field445.repaint();
        }
        field3782++;
    }

    @OriginalMember(owner = "client!uf", name = "b", descriptor = "(I)Ljf;")
    public static final class92 method1284(int arg0) {
        if (class143.field2945 == null) {
            class143.field2945 = new class92();
        }
        field3781++;
        if (arg0 >= -66) {
            field3776 = null;
        }
        return class143.field2945;
    }
}
