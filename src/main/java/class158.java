import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class158 extends class184 {

    @OriginalMember(owner = "client!ll", name = "y", descriptor = "Lsf;")
    public static class108 field2847 = class140.method973(255, "Titelbild ge-Offnet)3");

    @OriginalMember(owner = "client!ll", name = "v", descriptor = "Lsf;")
    public static class108 field2844 = class140.method973(255, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ll", name = "D", descriptor = "I")
    public static int field2852 = 0;

    @OriginalMember(owner = "client!ll", name = "A", descriptor = "[I")
    public static int[] field2849 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!ll", name = "w", descriptor = "I")
    public int field2845;

    @OriginalMember(owner = "client!ll", name = "x", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!ll", name = "z", descriptor = "I")
    public int field2848;

    @OriginalMember(owner = "client!ll", name = "C", descriptor = "I")
    public static int field2851;

    @OriginalMember(owner = "client!ll", name = "E", descriptor = "Lpg;")
    public static class205 field2853;

    @OriginalMember(owner = "client!ll", name = "B", descriptor = "Lvl;")
    public static class80 field2850;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(Lsf;IZBLjava/awt/Color;)V", line = 7)
    public static final void method1099(class108 arg0, int arg1, boolean arg2, byte arg3, Color arg4) {
        field2846++;
        try {
            Graphics var5 = class13.field158.getGraphics();
            if (class151.field2731 == null) {
                class151.field2731 = new Font("Helvetica", 1, 13);
                class325.field5537 = class13.field158.getFontMetrics(class151.field2731);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class73.field1110, class21.field331);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class294.field5134 == null) {
                    class294.field5134 = class13.field158.createImage(304, 34);
                }
                Graphics var6 = class294.field5134.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class151.field2731);
                var6.setColor(Color.white);
                arg0.method767((304 - arg0.method777(class325.field5537, 101)) / 2, (byte) 107, 22, var6);
                if (arg3 > -81) {
                    return;
                }
                var5.drawImage(class294.field5134, class73.field1110 / 2 - 152, class21.field331 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class21.field331 / 2 - 18;
                int var9 = class73.field1110 / 2 - 152;
                var5.setColor(arg4);
                var5.drawRect(var9, var8, 303, 33);
                var5.fillRect(var9 + 2, var8 - -2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var9 + 1, var8 + 1, 301, 31);
                var5.fillRect(var9 + (arg1 * 3) + 2, var8 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class151.field2731);
                var5.setColor(Color.white);
                arg0.method767((304 - arg0.method777(class325.field5537, 106)) / 2 + var9, (byte) 102, var8 + 22, var5);
            }
            if (class183.field3369 != null) {
                var5.setFont(class151.field2731);
                var5.setColor(Color.white);
                class183.field3369.method767(class73.field1110 / 2 - (class183.field3369.method777(class325.field5537, 105) / 2), (byte) 98, class21.field331 / 2 - 26, var5);
            }
        } catch (Exception var12) {
            class13.field158.repaint();
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(IIIII)V", line = 78)
    public static final void method1100(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2851++;
        if (arg0 != 24636) {
            field2852 = 80;
        }
        if (class260.field4593 <= (arg4 - arg1) && arg1 + arg4 <= class79.field1202 && arg3 - arg1 >= class266.field4677 && arg3 + arg1 <= class166.field2984) {
            class73.method486(16711680, arg4, arg2, arg1, arg3);
        } else {
            class248.method1703(arg3, arg4, arg2, arg1, 0);
        }
    }

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "(I)V", line = 104)
    public static void method1101(int arg0) {
        if (arg0 != 30) {
            return;
        }
        field2847 = null;
        field2853 = null;
        field2850 = null;
        field2849 = null;
        field2844 = null;
    }
}
