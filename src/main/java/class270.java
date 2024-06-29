import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class270 {

    @OriginalMember(owner = "client!hf", name = "d", descriptor = "[I")
    public static int[] field3545 = new int[50];

    @OriginalMember(owner = "client!hf", name = "c", descriptor = "Z")
    public static boolean field3544 = false;

    @OriginalMember(owner = "client!hf", name = "g", descriptor = "I")
    public static int field3548 = -1;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "I")
    public static int field3542;

    @OriginalMember(owner = "client!hf", name = "f", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "Ldf;")
    public static class274 field3543;

    @OriginalMember(owner = "client!hf", name = "e", descriptor = "Lct;")
    public static class97 field3546;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Ljava/lang/String;ZLjava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;B)V", line = 4)
    public static final void method1616(String arg0, boolean arg1, Color arg2, int arg3, Color arg4, Color arg5, byte arg6) {
        try {
            Graphics var7 = class518.field7663.getGraphics();
            if (class250.field3321 == null) {
                class250.field3321 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class149.field2132, class175.field2555);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class324.field4285 == null) {
                    class324.field4285 = class518.field7663.createImage(304, 34);
                }
                Graphics var8 = class324.field4285.getGraphics();
                var8.setColor(arg4);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg5);
                var8.fillRect(2, 2, arg3 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var8.setFont(class250.field3321);
                var8.setColor(arg2);
                if (arg6 != -97) {
                    field3548 = 58;
                }
                var8.drawString(arg0, (304 - arg0.length() * 6) / 2, 22);
                var7.drawImage(class324.field4285, class149.field2132 / 2 - 152, class175.field2555 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class149.field2132 / 2 - 152;
                int var10 = class175.field2555 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var9 + 2, var10 + 2, arg3 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg3 * 3 + var9 + 2, var10 + 2, 300 - (arg3 * 3), 30);
                var7.setFont(class250.field3321);
                var7.setColor(arg2);
                var7.drawString(arg0, var9 + ((304 - (arg0.length() * 6)) / 2), var10 - -22);
            }
            if (class89.field1352 != null) {
                var7.setFont(class250.field3321);
                var7.setColor(arg2);
                var7.drawString(class89.field1352, class149.field2132 / 2 - (class89.field1352.length() * 6 / 2), class175.field2555 / 2 + -26);
            }
        } catch (Exception var12) {
            class518.field7663.repaint();
        }
        field3547++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(I)V", line = 86)
    public static void method1617(int arg0) {
        field3543 = null;
        field3545 = null;
        field3546 = null;
        if (arg0 != 6) {
            method1616(null, true, null, -90, null, null, (byte) -69);
        }
    }
}
