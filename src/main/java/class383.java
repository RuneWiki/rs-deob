import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class383 extends class5 {

    @OriginalMember(owner = "client!ac", name = "n", descriptor = "Ljava/lang/String;")
    public String field5828;

    @OriginalMember(owner = "client!ac", name = "j", descriptor = "Lni;")
    public static class367 field5824 = new class367(46, -1);

    @OriginalMember(owner = "client!ac", name = "l", descriptor = "Lof;")
    public static class446 field5826 = new class446("glow3:", "leuchten3:", "brillant3:", "brilho3:");

    @OriginalMember(owner = "client!ac", name = "k", descriptor = "I")
    public static int field5825;

    @OriginalMember(owner = "client!ac", name = "m", descriptor = "[Laa;")
    public static class341[] field5827;

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(I)V")
    public static void method2401(int arg0) {
        field5826 = null;
        field5824 = null;
        int var1 = -7 % ((arg0 - 55) / 60);
        field5827 = null;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZLjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;II)V")
    public static final void method2402(boolean arg0, Color arg1, Color arg2, String arg3, Color arg4, int arg5, int arg6) {
        field5825++;
        try {
            Graphics var7 = class85.field1245.getGraphics();
            if (class453.field6819 == null) {
                class453.field6819 = new Font("Helvetica", 1, 13);
            }
            if (arg0) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class147.field1961, class107.field1525);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (client.field2676 == null) {
                    client.field2676 = class85.field1245.createImage(304, 34);
                }
                Graphics var8 = client.field2676.getGraphics();
                var8.setColor(arg1);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                if (arg6 != 17) {
                    field5827 = null;
                }
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class453.field6819);
                var8.setColor(arg4);
                var8.drawString(arg3, (304 - arg3.length() * 6) / 2, 22);
                var7.drawImage(client.field2676, class147.field1961 / 2 - 152, class107.field1525 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class147.field1961 / 2 - 152;
                int var10 = class107.field1525 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 - -2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(arg5 * 3 + var9 + 2, var10 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class453.field6819);
                var7.setColor(arg4);
                var7.drawString(arg3, (304 - arg3.length() * 6) / 2 + var9, var10 + 22);
            }
            if (class303.field4435 != null) {
                var7.setFont(class453.field6819);
                var7.setColor(arg4);
                var7.drawString(class303.field4435, class147.field1961 / 2 - class303.field4435.length() * 6 / 2, class107.field1525 / 2 + -26);
            }
        } catch (Exception var12) {
            class85.field1245.repaint();
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class383() {
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "(Ljava/lang/String;I)V")
    public class383(String arg0, int arg1) {
        this.field5828 = arg0;
    }
}
