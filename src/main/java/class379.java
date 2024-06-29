import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!os")
public class class379 {

    @OriginalMember(owner = "client!os", name = "d", descriptor = "[I")
    public static int[] field5762 = new int[13];

    @OriginalMember(owner = "client!os", name = "a", descriptor = "Lkca;")
    public static class73 field5759 = new class73(59, 15);

    @OriginalMember(owner = "client!os", name = "b", descriptor = "I")
    public static int field5760;

    @OriginalMember(owner = "client!os", name = "f", descriptor = "I")
    public static int field5764;

    @OriginalMember(owner = "client!os", name = "e", descriptor = "Lig;")
    public static class206 field5763;

    @OriginalMember(owner = "client!os", name = "c", descriptor = "Lxa;")
    public static class433 field5761;

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(B)V", line = 8)
    public static void method2442(byte arg0) {
        field5762 = null;
        field5763 = null;
        if (arg0 >= -80) {
            field5763 = null;
        }
        field5761 = null;
        field5759 = null;
    }

    @OriginalMember(owner = "client!os", name = "toString", descriptor = "()Ljava/lang/String;", line = 23)
    public final String toString() {
        field5760++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!os", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;BLjava/awt/Color;I)V", line = 34)
    public static final void method2443(String arg0, Color arg1, Color arg2, byte arg3, Color arg4, int arg5) {
        try {
            Graphics var6 = class30.field348.getGraphics();
            if (class495.field7237 == null) {
                class495.field7237 = new Font("Helvetica", 1, 13);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (arg3 >= -35) {
                    field5761 = null;
                }
                if (class356.field5061 == null) {
                    class356.field5061 = class30.field348.createImage(class581.field8366, class298.field4407);
                }
                Graphics var7 = class356.field5061.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class581.field8366, class298.field4407);
                int var8 = class581.field8366 / 2 - 152;
                int var9 = class298.field4407 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var8 + 2, var9 + 2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg5 * 3 + var8 + 2, var9 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class495.field7237);
                var7.setColor(arg2);
                var7.drawString(arg0, (304 - (arg0.length() * 6)) / 2 + var8, var9 - -22);
                if (class339.field4848 != null) {
                    var7.setFont(class495.field7237);
                    var7.setColor(arg2);
                    var7.drawString(class339.field4848, class581.field8366 / 2 - (class339.field4848.length() * 6 / 2), class298.field4407 / 2 - 26);
                }
                var6.drawImage(class356.field5061, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class581.field8366, class298.field4407);
                int var10 = class581.field8366 / 2 - 152;
                int var11 = class298.field4407 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg1);
                var6.fillRect(var10 + 2, var11 + 2, arg5 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg5 * 3) + 2, var11 + 2, 300 - (arg5 * 3), 30);
                var6.setFont(class495.field7237);
                var6.setColor(arg2);
                if (class339.field4848 != null) {
                    var6.setFont(class495.field7237);
                    var6.setColor(arg2);
                    var6.drawString(class339.field4848, class581.field8366 / 2 - class339.field4848.length() * 6 / 2, class298.field4407 / 2 + -26);
                }
                var6.drawString(arg0, var10 + (304 - (arg0.length() * 6)) / 2, var11 + 22);
            }
        } catch (Exception var13) {
            class30.field348.repaint();
        }
        field5764++;
    }
}
