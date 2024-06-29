import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class269 {

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "I")
    public static int field3930 = -1;

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "Lcp;")
    public static class470 field3928 = new class470(64);

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "I")
    public static int field3925;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field3926;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field3927;

    @OriginalMember(owner = "client!wg", name = "g", descriptor = "I")
    public static int field3931;

    @OriginalMember(owner = "client!wg", name = "h", descriptor = "I")
    public static int field3932;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "Lnr;")
    public static class39 field3929;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;B)V")
    public static final void method1649(Color arg0, boolean arg1, Color arg2, String arg3, int arg4, Color arg5, byte arg6) {
        field3926++;
        try {
            Graphics var7 = class465.field6503.getGraphics();
            if (class451.field6249 == null) {
                class451.field6249 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class144.field1900, class244.field3634);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg6 > 47) {
                if (arg5 == null) {
                    arg5 = new Color(255, 255, 255);
                }
                try {
                    if (class197.field2877 == null) {
                        class197.field2877 = class465.field6503.createImage(304, 34);
                    }
                    Graphics var8 = class197.field2877.getGraphics();
                    var8.setColor(arg2);
                    var8.drawRect(0, 0, 303, 33);
                    var8.setColor(arg0);
                    var8.fillRect(2, 2, arg4 * 3, 30);
                    var8.setColor(Color.black);
                    var8.drawRect(1, 1, 301, 31);
                    var8.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                    var8.setFont(class451.field6249);
                    var8.setColor(arg5);
                    var8.drawString(arg3, (304 - (arg3.length() * 6)) / 2, 22);
                    var7.drawImage(class197.field2877, class144.field1900 / 2 - 152, class244.field3634 / 2 + -18, (ImageObserver) null);
                } catch (Exception var11) {
                    int var9 = class144.field1900 / 2 - 152;
                    int var10 = class244.field3634 / 2 - 18;
                    var7.setColor(arg2);
                    var7.drawRect(0, 0, 303, 33);
                    var7.setColor(arg0);
                    var7.fillRect(var9 + 2, var10 + 2, arg4 * 3, 30);
                    var7.setColor(Color.black);
                    var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                    var7.fillRect(arg4 * 3 + var9 + 2, var10 + 2, 300 - (arg4 * 3), 30);
                    var7.setFont(class451.field6249);
                    var7.setColor(arg5);
                    var7.drawString(arg3, (304 - (arg3.length() * 6)) / 2 + var9, var10 + 22);
                }
                if (class77.field947 != null) {
                    var7.setFont(class451.field6249);
                    var7.setColor(arg5);
                    var7.drawString(class77.field947, class144.field1900 / 2 - (class77.field947.length() * 6 / 2), class244.field3634 / 2 - 26);
                }
            }
        } catch (Exception var12) {
            class465.field6503.repaint();
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static final void method1650(int arg0) {
        if (arg0 != 20340) {
            method1651(8, -16, 63, 126, 123);
        }
        field3927++;
        class204.field3031.method1478((byte) -101);
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIIII)I")
    public static final int method1651(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3931++;
        int var5 = 65536 - class53.field726[arg0 * arg2 / arg4] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg3 * var5 >> 16);
    }

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "(I)V")
    public static void method1652(int arg0) {
        if (arg0 == 255) {
            field3929 = null;
            field3928 = null;
        }
    }
}
