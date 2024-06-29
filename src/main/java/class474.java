import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pb")
public class class474 {

    @OriginalMember(owner = "client!pb", name = "c", descriptor = "Ltn;")
    public static class60 field6596 = new class60(1, -1);

    @OriginalMember(owner = "client!pb", name = "g", descriptor = "[Ljava/lang/String;")
    public static String[] field6600 = new String[200];

    @OriginalMember(owner = "client!pb", name = "e", descriptor = "Lmt;")
    public static class276 field6598 = new class276(8, 0, 4, 1);

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!pb", name = "b", descriptor = "I")
    public static int field6595;

    @OriginalMember(owner = "client!pb", name = "d", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!pb", name = "h", descriptor = "I")
    public static int field6601;

    @OriginalMember(owner = "client!pb", name = "i", descriptor = "Loi;")
    public static class53 field6602;

    @OriginalMember(owner = "client!pb", name = "f", descriptor = "[Lhb;")
    public static class520[] field6599;

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Lhm;Lhm;B)V", line = 3)
    public static final void method2738(class150 arg0, class150 arg1, byte arg2) {
        class468.field6531++;
        class61.method498(class14.field186, 1);
        int var3 = -59 % ((arg2 - 13) / 51);
        field6595++;
        class30.field357.method2354(arg0.field2134, false);
        class30.field357.method2331(32196, arg0.field2105);
        class30.field357.method2368(arg1.field2105, -31442);
        class30.field357.method2331(32196, arg1.field2089);
        class30.field357.method2368(arg0.field2089, -31442);
        class30.field357.method2354(arg1.field2134, false);
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(B)V", line = 24)
    public static void method2739(byte arg0) {
        field6598 = null;
        field6599 = null;
        field6600 = null;
        if (arg0 > 55) {
            field6596 = null;
            field6602 = null;
        }
    }

    @OriginalMember(owner = "client!pb", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;Ljava/lang/String;ZLjava/awt/Color;IB)V", line = 38)
    public static final void method2740(Color arg0, Color arg1, String arg2, boolean arg3, Color arg4, int arg5, byte arg6) {
        field6594++;
        try {
            Graphics var7 = class487.field6799.getGraphics();
            if (class172.field2490 == null) {
                class172.field2490 = new Font("Helvetica", 1, 13);
            }
            if (arg3) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class147.field1956, class273.field4048);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class306.field4451 == null) {
                    class306.field4451 = class487.field6799.createImage(304, 34);
                }
                Graphics var8 = class306.field4451.getGraphics();
                var8.setColor(arg1);
                int var9 = 47 % ((27 - arg6) / 40);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg4);
                var8.fillRect(2, 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2, 2, 300 - (arg5 * 3), 30);
                var8.setFont(class172.field2490);
                var8.setColor(arg0);
                var8.drawString(arg2, (304 - (arg2.length() * 6)) / 2, 22);
                var7.drawImage(class306.field4451, class147.field1956 / 2 - 152, class273.field4048 / 2 - 18, null);
            } catch (Exception var12) {
                int var10 = class147.field1956 / 2 - 152;
                int var11 = class273.field4048 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var10 + 2, var11 - -2, arg5 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var10 + 1, var11 - -1, 301, 31);
                var7.fillRect(arg5 * 3 + var10 + 2, var11 + 2, 300 - (arg5 * 3), 30);
                var7.setFont(class172.field2490);
                var7.setColor(arg0);
                var7.drawString(arg2, (304 - (arg2.length() * 6)) / 2 + var10, var11 - -22);
            }
            if (class221.field3181 != null) {
                var7.setFont(class172.field2490);
                var7.setColor(arg0);
                var7.drawString(class221.field3181, class147.field1956 / 2 - (class221.field3181.length() * 6 / 2), class273.field4048 / 2 + -26);
            }
        } catch (Exception var13) {
            class487.field6799.repaint();
        }
    }
}
