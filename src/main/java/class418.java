import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tm")
public class class418 {

    @OriginalMember(owner = "client!tm", name = "e", descriptor = "[I")
    public static int[] field6330 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "I")
    public int field6326;

    @OriginalMember(owner = "client!tm", name = "b", descriptor = "I")
    public int field6327;

    @OriginalMember(owner = "client!tm", name = "c", descriptor = "I")
    public int field6328;

    @OriginalMember(owner = "client!tm", name = "d", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!tm", name = "f", descriptor = "I")
    public int field6331;

    static {
        new class306("Unable to add name - system busy.", "Der Name konnte nicht hinzugefügt werden, das System ist derzeit ausgelastet.", "Impossible d'ajouter un nom - système occupé.", "Não foi possível adicionar o nome. O sistema está ocupado.");
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(IILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Z)V", line = 7)
    public static final void method2571(int arg0, int arg1, Color arg2, Color arg3, Color arg4, String arg5, boolean arg6) {
        field6329++;
        try {
            Graphics var7 = class270.field4495.getGraphics();
            if (class339.field5323 == null) {
                class339.field5323 = new Font("Helvetica", 1, 13);
            }
            if (arg6) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class358.field5581, class49.field825);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class38.field566 == null) {
                    class38.field566 = class270.field4495.createImage(304, 34);
                }
                Graphics var8 = class38.field566.getGraphics();
                var8.setColor(arg4);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg0 * 3) + 2, 2, 300 - (arg0 * 3), 30);
                var8.setFont(class339.field5323);
                var8.setColor(arg3);
                var8.drawString(arg5, (304 - (arg5.length() * arg1)) / 2, 22);
                var7.drawImage(class38.field566, class358.field5581 / 2 - 152, class49.field825 / 2 - 18, null);
            } catch (Exception var11) {
                int var9 = class358.field5581 / 2 - 152;
                int var10 = class49.field825 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg0 * 3 + var9 + 2, var10 + 2, 300 - (arg0 * 3), 30);
                var7.setFont(class339.field5323);
                var7.setColor(arg3);
                var7.drawString(arg5, (304 - (arg5.length() * 6)) / 2 + var9, var10 + 22);
            }
            if (class413.field6291 != null) {
                var7.setFont(class339.field5323);
                var7.setColor(arg3);
                var7.drawString(class413.field6291, class358.field5581 / 2 - (class413.field6291.length() * 6 / 2), class49.field825 / 2 - 26);
            }
        } catch (Exception var12) {
            class270.field4495.repaint();
        }
    }

    @OriginalMember(owner = "client!tm", name = "a", descriptor = "(I)V", line = 84)
    public static void method2572(int arg0) {
        if (arg0 != 11159) {
            method2572(22);
        }
        field6330 = null;
    }
}
