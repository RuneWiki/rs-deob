import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rb")
public class class253 {

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "Z")
    public static boolean field3861 = true;

    @OriginalMember(owner = "client!rb", name = "f", descriptor = "[I")
    public static int[] field3866 = new int[] { 0, 0, 0, 0, 0, 0, 0, 0, 85, 80, 84, 0, 91, 0, 0, 0, 81, 82, 86, 0, 0, 0, 0, 0, 0, 0, 0, 13, 0, 0, 0, 0, 83, 104, 105, 103, 102, 96, 98, 97, 99, 0, 0, 0, 0, 0, 0, 0, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, 0, 0, 0, 0, 0, 0, 0, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, 0, 0, 0, 0, 0, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, 0, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 0, 0, 0, 101, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0 };

    @OriginalMember(owner = "client!rb", name = "d", descriptor = "[Ljava/awt/Color;")
    public static Color[] field3864 = new Color[] { new Color(9179409), new Color(3289650) };

    @OriginalMember(owner = "client!rb", name = "c", descriptor = "I")
    public static int field3863;

    @OriginalMember(owner = "client!rb", name = "e", descriptor = "I")
    public static int field3865;

    @OriginalMember(owner = "client!rb", name = "g", descriptor = "I")
    public static int field3867;

    @OriginalMember(owner = "client!rb", name = "b", descriptor = "Liq;")
    public static class134 field3862;

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(Ljava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;Ljava/lang/String;ZZ)V")
    public static final void method1558(Color arg0, Color arg1, int arg2, Color arg3, String arg4, boolean arg5, boolean arg6) {
        field3865++;
        try {
            Graphics var7 = class170.field2631.getGraphics();
            if (class451.field6647 == null) {
                class451.field6647 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class221.field3368, class161.field2232);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (!arg6) {
                field3862 = null;
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class440.field6477 == null) {
                    class440.field6477 = class170.field2631.createImage(304, 34);
                }
                Graphics var8 = class440.field6477.getGraphics();
                var8.setColor(arg3);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg0);
                var8.fillRect(2, 2, arg2 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg2 * 3) + 2, 2, 300 - (arg2 * 3), 30);
                var8.setFont(class451.field6647);
                var8.setColor(arg1);
                var8.drawString(arg4, (304 - (arg4.length() * 6)) / 2, 22);
                var7.drawImage(class440.field6477, class221.field3368 / 2 - 152, class161.field2232 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var9 = class221.field3368 / 2 - 152;
                int var10 = class161.field2232 / 2 - 18;
                var7.setColor(arg3);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var9 + 2, var10 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg2 * 3 + var9 + 2, var10 + 2, 300 - (arg2 * 3), 30);
                var7.setFont(class451.field6647);
                var7.setColor(arg1);
                var7.drawString(arg4, (304 - arg4.length() * 6) / 2 + var9, var10 + 22);
            }
            if (class107.field1427 != null) {
                var7.setFont(class451.field6647);
                var7.setColor(arg1);
                var7.drawString(class107.field1427, class221.field3368 / 2 - class107.field1427.length() * 6 / 2, class161.field2232 / 2 + -26);
            }
        } catch (Exception var12) {
            class170.field2631.repaint();
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(ILiq;)V")
    public static final void method1559(int arg0, class134 arg1) {
        class275.field4207 = arg1.method836(-1, "p11_full");
        field3867++;
        class458.field6782 = arg1.method836(-1, "p12_full");
        class376.field5485 = arg1.method836(-1, "b12_full");
        class57.field766 = arg1.method836(-1, "hitmarks");
        class316.field4779 = arg1.method836(-1, "hitbar_default");
        class318.field4809 = arg1.method836(-1, "timerbar_default");
        class44.field551 = arg1.method836(-1, "headicons_pk");
        class192.field2898 = arg1.method836(-1, "headicons_prayer");
        class326.field4902 = arg1.method836(-1, "hint_headicons");
        class307.field4637 = arg1.method836(-1, "hint_mapmarkers");
        class385.field5669 = arg1.method836(-1, "mapflag");
        class399.field5957 = arg1.method836(-1, "cross");
        if (arg0 < 126) {
            field3864 = null;
        }
        class154.field2106 = arg1.method836(-1, "mapdots");
        class85.field1172 = arg1.method836(-1, "scrollbar");
        class176.field2675 = arg1.method836(-1, "name_icons");
        class81.field1085 = arg1.method836(-1, "floorshadows");
        class177.field2681 = arg1.method836(-1, "compass");
        class60.field778 = arg1.method836(-1, "otherlevel");
        class429.field6305 = arg1.method836(-1, "hint_mapedge");
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(I)V")
    public static void method1560(int arg0) {
        field3862 = null;
        field3866 = null;
        if (arg0 == -18) {
            field3864 = null;
        }
    }

    @OriginalMember(owner = "client!rb", name = "a", descriptor = "(IB)V")
    public static final void method1561(int arg0, byte arg1) {
        field3863++;
        class131.field1670.method1481(3, arg0);
        if (arg1 <= 114) {
            field3864 = null;
        }
    }
}
