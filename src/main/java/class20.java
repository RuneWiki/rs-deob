import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ui")
public class class20 extends class137 {

    @OriginalMember(owner = "client!ui", name = "p", descriptor = "Ltb;")
    public static class21 field312 = new class21(0, 0);

    @OriginalMember(owner = "client!ui", name = "r", descriptor = "Lvb;")
    public static class67 field314 = new class67();

    @OriginalMember(owner = "client!ui", name = "x", descriptor = "Lhh;")
    public static class163 field320 = class137.method1065(":", 17);

    @OriginalMember(owner = "client!ui", name = "y", descriptor = "Lhh;")
    public static class163 field321 = class137.method1065("titlebg", 17);

    @OriginalMember(owner = "client!ui", name = "v", descriptor = "I")
    public static int field318 = 0;

    @OriginalMember(owner = "client!ui", name = "B", descriptor = "J")
    public static long field324 = 0L;

    @OriginalMember(owner = "client!ui", name = "K", descriptor = "Lhh;")
    public static class163 field332 = class137.method1065("; Expires=", 17);

    @OriginalMember(owner = "client!ui", name = "s", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!ui", name = "t", descriptor = "I")
    public int field316;

    @OriginalMember(owner = "client!ui", name = "A", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!ui", name = "I", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!ui", name = "J", descriptor = "I")
    public int field331;

    @OriginalMember(owner = "client!ui", name = "E", descriptor = "Lpa;")
    public static class123 field326;

    @OriginalMember(owner = "client!ui", name = "F", descriptor = "Lv;")
    public static class22 field327;

    @OriginalMember(owner = "client!ui", name = "z", descriptor = "Led;")
    public static class255 field322;

    @OriginalMember(owner = "client!ui", name = "o", descriptor = "[I")
    public int[] field311;

    @OriginalMember(owner = "client!ui", name = "u", descriptor = "[I")
    public int[] field317;

    @OriginalMember(owner = "client!ui", name = "C", descriptor = "[I")
    public int[] field325;

    @OriginalMember(owner = "client!ui", name = "q", descriptor = "[Lud;")
    public class198[] field313;

    @OriginalMember(owner = "client!ui", name = "w", descriptor = "[Lud;")
    public class198[] field319;

    @OriginalMember(owner = "client!ui", name = "G", descriptor = "[Ldi;")
    public static class27[] field328;

    @OriginalMember(owner = "client!ui", name = "H", descriptor = "[Lne;")
    public static class94[] field329;

    @OriginalMember(owner = "client!ui", name = "n", descriptor = "[[[B")
    public byte[][][] field310;

    @OriginalMember(owner = "client!ui", name = "a", descriptor = "(ILjava/awt/Color;ZILhh;)V")
    public static final void method137(int arg0, Color arg1, boolean arg2, int arg3, class163 arg4) {
        field315++;
        try {
            Graphics var5 = class202.field3675.getGraphics();
            if (class5.field97 == null) {
                class5.field97 = new Font("Helvetica", 1, 13);
                class116.field2201 = class202.field3675.getFontMetrics(class5.field97);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class233.field4160, class205.field3706);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class196.field3530 == null) {
                    class196.field3530 = class202.field3675.createImage(304, 34);
                }
                if (arg3 != -152) {
                    method138((byte) 46);
                }
                Graphics var6 = class196.field3530.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var6.setFont(class5.field97);
                var6.setColor(Color.white);
                arg4.method1203(22, var6, (byte) 93, (304 - arg4.method1214(122, class116.field2201)) / 2);
                var5.drawImage(class196.field3530, class233.field4160 / 2 - 152, class205.field3706 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class233.field4160 / 2 - 152;
                int var8 = class205.field3706 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var5.setFont(class5.field97);
                var5.setColor(Color.white);
                arg4.method1203(var8 + 22, var5, (byte) 107, (304 - arg4.method1214(arg3 + 274, class116.field2201)) / 2 + var7);
            }
            if (class220.field4001 != null) {
                var5.setFont(class5.field97);
                var5.setColor(Color.white);
                class220.field4001.method1203(class205.field3706 / 2 - 26, var5, (byte) 56, class233.field4160 / 2 - class220.field4001.method1214(122, class116.field2201) / 2);
            }
        } catch (Exception var10) {
            class202.field3675.repaint();
        }
    }

    @OriginalMember(owner = "client!ui", name = "c", descriptor = "(B)V")
    public static void method138(byte arg0) {
        if (arg0 > -126) {
            field329 = null;
        }
        field321 = null;
        field320 = null;
        field332 = null;
        field314 = null;
        field329 = null;
        field326 = null;
        field312 = null;
        field322 = null;
        field327 = null;
        field328 = null;
    }
}
