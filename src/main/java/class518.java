import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ii")
public class class518 {

    @OriginalMember(owner = "client!ii", name = "e", descriptor = "[Lmi;")
    public static class206[] field7076 = new class206[1024];

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "I")
    public static int field7072;

    @OriginalMember(owner = "client!ii", name = "c", descriptor = "I")
    public static int field7074;

    @OriginalMember(owner = "client!ii", name = "d", descriptor = "I")
    public static int field7075;

    @OriginalMember(owner = "client!ii", name = "b", descriptor = "Lpl;")
    public static class612 field7073;

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;I)V")
    public static final void method2803(String arg0, int arg1, Color arg2, Color arg3, Color arg4, int arg5) {
        field7072++;
        try {
            Graphics var6 = class500.field6585.getGraphics();
            if (class627.field8740 == null) {
                class627.field8740 = new Font("Helvetica", 1, 13);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class23.field362 == null) {
                    class23.field362 = class500.field6585.createImage(class523.field7111, class244.field3022);
                }
                Graphics var7 = class23.field362.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class523.field7111, class244.field3022);
                int var8 = class523.field7111 / 2 - 152;
                int var9 = class244.field3022 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * arg5, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(var8 - (-(arg1 * 3) - 2), var9 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class627.field8740);
                var7.setColor(arg2);
                var7.drawString(arg0, var8 + ((304 - arg0.length() * 6) / 2), var9 + 22);
                if (class530.field7164 != null) {
                    var7.setFont(class627.field8740);
                    var7.setColor(arg2);
                    var7.drawString(class530.field7164, class523.field7111 / 2 - (class530.field7164.length() * 6 / 2), class244.field3022 / 2 - 26);
                }
                var6.drawImage(class23.field362, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class523.field7111, class244.field3022);
                int var10 = class523.field7111 / 2 - 152;
                int var11 = class244.field3022 / 2 - 18;
                var6.setColor(arg3);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg4);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(arg1 * 3 + var10 + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class627.field8740);
                var6.setColor(arg2);
                if (class530.field7164 != null) {
                    var6.setFont(class627.field8740);
                    var6.setColor(arg2);
                    var6.drawString(class530.field7164, class523.field7111 / 2 - (class530.field7164.length() * 6 / 2), class244.field3022 / 2 + -26);
                }
                var6.drawString(arg0, (304 - (arg0.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class500.field6585.repaint();
        }
    }

    @OriginalMember(owner = "client!ii", name = "a", descriptor = "(Z)V")
    public static void method2804(boolean arg0) {
        field7073 = null;
        if (!arg0) {
            method2804(false);
        }
        field7076 = null;
    }
}
