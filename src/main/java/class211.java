import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class211 extends class163 {

    @OriginalMember(owner = "client!qj", name = "s", descriptor = "I")
    public int field3797;

    @OriginalMember(owner = "client!qj", name = "t", descriptor = "I")
    public int field3798;

    @OriginalMember(owner = "client!qj", name = "v", descriptor = "Lke;")
    public static class256 field3800 = class316.method2202("Sie k-Onnen sich selbst nicht auf Ihre Freunde)2Liste setzen(Q", 27626);

    @OriginalMember(owner = "client!qj", name = "r", descriptor = "Z")
    public static boolean field3796 = false;

    @OriginalMember(owner = "client!qj", name = "y", descriptor = "I")
    public static int field3803 = -1;

    @OriginalMember(owner = "client!qj", name = "x", descriptor = "Lke;")
    public static class256 field3802 = class316.method2202(" <col=ffffff>", 27626);

    @OriginalMember(owner = "client!qj", name = "u", descriptor = "I")
    public static int field3799;

    @OriginalMember(owner = "client!qj", name = "w", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!qj", name = "d", descriptor = "(I)V", line = 5)
    public static void method1484(int arg0) {
        field3802 = null;
        field3800 = null;
        if (arg0 != 15466) {
            field3803 = 125;
        }
    }

    @OriginalMember(owner = "client!qj", name = "a", descriptor = "(BLjava/awt/Color;Lke;IZ)V", line = 27)
    public static final void method1485(byte arg0, Color arg1, class256 arg2, int arg3, boolean arg4) {
        int var5 = -70 % ((-arg0 - 24) / 39);
        try {
            Graphics var6 = class186.field3271.getGraphics();
            if (class242.field4118 == null) {
                class242.field4118 = new Font("Helvetica", 1, 13);
                class155.field2769 = class186.field3271.getFontMetrics(class242.field4118);
            }
            if (arg4) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class112.field1969, class124.field2200);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class70.field1289 == null) {
                    class70.field1289 = class186.field3271.createImage(304, 34);
                }
                Graphics var7 = class70.field1289.getGraphics();
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.fillRect(2, 2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(1, 1, 301, 31);
                var7.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var7.setFont(class242.field4118);
                var7.setColor(Color.white);
                arg2.method1774(var7, (byte) 66, 22, (304 - arg2.method1807(255, class155.field2769)) / 2);
                var6.drawImage(class70.field1289, class112.field1969 / 2 - 152, class124.field2200 / 2 + -18, (ImageObserver) null);
            } catch (Exception var12) {
                int var9 = class124.field2200 / 2 - 18;
                int var10 = class112.field1969 / 2 - 152;
                var6.setColor(arg1);
                var6.drawRect(var10, var9, 303, 33);
                var6.fillRect(var10 + 2, var9 + 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var9 + 1, 301, 31);
                var6.fillRect(arg3 * 3 + var10 + 2, var9 - -2, 300 - (arg3 * 3), 30);
                var6.setFont(class242.field4118);
                var6.setColor(Color.white);
                arg2.method1774(var6, (byte) 66, var9 + 22, var10 + (-arg2.method1807(255, class155.field2769) + 304) / 2);
            }
            if (class6.field95 != null) {
                var6.setFont(class242.field4118);
                var6.setColor(Color.white);
                class6.field95.method1774(var6, (byte) 66, class124.field2200 / 2 - 26, class112.field1969 / 2 + -(class6.field95.method1807(255, class155.field2769) / 2));
            }
        } catch (Exception var13) {
            class186.field3271.repaint();
        }
        field3799++;
    }

    @OriginalMember(owner = "client!qj", name = "<init>", descriptor = "(II)V", line = 117)
    public class211(int arg0, int arg1) {
        this.field3797 = arg1;
        this.field3798 = arg0;
    }
}
