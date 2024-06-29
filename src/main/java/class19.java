import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class19 {

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "[I")
    public static int[] field284 = new int[50];

    @OriginalMember(owner = "client!mm", name = "b", descriptor = "I")
    public static int field285;

    @OriginalMember(owner = "client!mm", name = "c", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!mm", name = "d", descriptor = "I")
    public static int field287;

    @OriginalMember(owner = "client!mm", name = "e", descriptor = "I")
    public static int field288;

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(II)V")
    public static final void method128(int arg0, int arg1) {
        field285++;
        if (arg0 <= -89) {
            class314 var2 = class177.method1213(false, 7, arg1);
            var2.method1811((byte) 86);
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(Ljava/awt/Color;ZLjava/awt/Color;Ljava/lang/String;ILjava/awt/Color;I)V")
    public static final void method129(Color arg0, boolean arg1, Color arg2, String arg3, int arg4, Color arg5, int arg6) {
        try {
            Graphics var7 = class415.field6025.getGraphics();
            if (class271.field3670 == null) {
                class271.field3670 = new Font("Helvetica", 1, 13);
            }
            if (arg1) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class66.field953, class348.field5033);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class473.field6842 == null) {
                    class473.field6842 = class415.field6025.createImage(304, 34);
                }
                Graphics var8 = class473.field6842.getGraphics();
                var8.setColor(arg2);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg5);
                var8.fillRect(2, 2, arg6 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg6 * 3) + 2, 2, 300 - (arg6 * 3), 30);
                var8.setFont(class271.field3670);
                var8.setColor(arg0);
                var8.drawString(arg3, (304 - (arg3.length() * 6)) / 2, 22);
                var7.drawImage(class473.field6842, class66.field953 / arg4 - 152, class348.field5033 / 2 - 18, null);
            } catch (Exception var11) {
                int var9 = class66.field953 / 2 - 152;
                int var10 = class348.field5033 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg5);
                var7.fillRect(var9 + 2, var10 + 2, arg6 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg6 * 3 + var9 + 2, var10 - -2, 300 - arg6 * 3, 30);
                var7.setFont(class271.field3670);
                var7.setColor(arg0);
                var7.drawString(arg3, var9 + (304 - arg3.length() * 6) / 2, var10 + 22);
            }
            if (class285.field3870 != null) {
                var7.setFont(class271.field3670);
                var7.setColor(arg0);
                var7.drawString(class285.field3870, class66.field953 / 2 - (class285.field3870.length() * 6 / 2), class348.field5033 / 2 + -26);
            }
        } catch (Exception var12) {
            class415.field6025.repaint();
        }
        field288++;
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(IILjava/lang/String;)V")
    public static final void method130(int arg0, int arg1, String arg2) {
        field286++;
        if (arg1 == -26980) {
            class314 var3 = class177.method1213(false, 2, arg0);
            var3.method1808(arg1 + 19568);
            var3.field4244 = arg2;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(ILja;)V")
    public static final void method131(int arg0, class221 arg1) {
        field287++;
        if (arg0 != 7) {
            method131(-88, null);
        }
        arg1.field3120 = null;
        if (class365.field5240 < 20) {
            class33.field509.method2599(arg0 ^ 0x4EF, arg1);
            class365.field5240++;
        }
    }

    @OriginalMember(owner = "client!mm", name = "a", descriptor = "(B)V")
    public static void method132(byte arg0) {
        field284 = null;
        if (arg0 != 31) {
            method129(null, true, null, null, -76, null, 10);
        }
    }
}
