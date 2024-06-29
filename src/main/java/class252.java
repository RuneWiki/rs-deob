import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class252 extends class275 {

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "[I")
    public static int[] field3798 = new int[50];

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "B")
    public static byte field3799 = 0;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "Ljava/lang/String;")
    public static String field3801 = " has logged out.";

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "I")
    public static int field3803;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "[[[I")
    public static int[][][] field3802;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IZLjava/lang/String;Ljava/awt/Color;I)V")
    public static final void method1736(int arg0, boolean arg1, String arg2, Color arg3, int arg4) {
        try {
            Graphics var5 = class12.field136.getGraphics();
            if (class166.field2544 == null) {
                class166.field2544 = new Font("Helvetica", 1, 13);
                class312.field4992 = class12.field136.getFontMetrics(class166.field2544);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class179.field2677, class137.field2230);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class288.field4607 == null) {
                    class288.field4607 = class12.field136.createImage(304, 34);
                }
                Graphics var6 = class288.field4607.getGraphics();
                var6.setColor(arg3);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, arg4 - (arg0 * 3), 30);
                var6.setFont(class166.field2544);
                var6.setColor(Color.white);
                var6.drawString(arg2, (304 - class312.field4992.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class288.field4607, class179.field2677 / 2 - 152, class137.field2230 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class179.field2677 / 2 - 152;
                int var8 = class137.field2230 / 2 - 18;
                var5.setColor(arg3);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class166.field2544);
                var5.setColor(Color.white);
                var5.drawString(arg2, (304 - class312.field4992.stringWidth(arg2)) / 2 + var7, var8 + 22);
            }
            if (class236.field3453 != null) {
                var5.setFont(class166.field2544);
                var5.setColor(Color.white);
                var5.drawString(class236.field3453, class179.field2677 / 2 - class312.field4992.stringWidth(class236.field3453) / 2, class137.field2230 / 2 - 26);
            }
        } catch (Exception var10) {
            class12.field136.repaint();
        }
        field3803++;
    }

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "(B)V")
    public static void method1737(byte arg0) {
        field3801 = null;
        field3798 = null;
        field3802 = null;
        int var1 = -62 / ((arg0 + 32) / 38);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(Llc;BLlc;)V")
    public static final void method1738(class270 arg0, byte arg1, class270 arg2) {
        field3800++;
        class72.field1138 = arg2;
        class165.field2541 = arg0;
        if (arg1 != -88) {
            method1738((class270) null, (byte) -4, (class270) null);
        }
    }
}
