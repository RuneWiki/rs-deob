import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class290 {

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "F")
    public static float field4306 = 1.0F;

    @OriginalMember(owner = "client!nm", name = "g", descriptor = "I")
    public static int field4312 = 0;

    @OriginalMember(owner = "client!nm", name = "f", descriptor = "Lwi;")
    public static class340 field4311 = new class340(14, 0, 4, 1);

    @OriginalMember(owner = "client!nm", name = "h", descriptor = "[B")
    public static byte[] field4313 = new byte[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!nm", name = "c", descriptor = "I")
    public static int field4308;

    @OriginalMember(owner = "client!nm", name = "d", descriptor = "I")
    public static int field4309;

    @OriginalMember(owner = "client!nm", name = "e", descriptor = "I")
    public static int field4310;

    @OriginalMember(owner = "client!nm", name = "b", descriptor = "Lns;")
    public static class438 field4307;

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(ILjava/awt/Color;ZLjava/awt/Color;Ljava/awt/Color;ILjava/lang/String;)V", line = 5)
    public static final void method1871(int arg0, Color arg1, boolean arg2, Color arg3, Color arg4, int arg5, String arg6) {
        try {
            Graphics var7 = class245.field3430.getGraphics();
            if (class17.field278 == null) {
                class17.field278 = new Font("Helvetica", 1, 13);
            }
            if (arg2) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class7.field112, class486.field7136);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class435.field6467 == null) {
                    class435.field6467 = class245.field3430.createImage(304, 34);
                }
                Graphics var8 = class435.field6467.getGraphics();
                var8.setColor(arg1);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg4);
                var8.fillRect(2, 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                if (arg5 != 7674) {
                    method1874(96, 82, -113);
                }
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var8.setFont(class17.field278);
                var8.setColor(arg3);
                var8.drawString(arg6, (304 - arg6.length() * 6) / 2, 22);
                var7.drawImage(class435.field6467, class7.field112 / 2 - 152, class486.field7136 / 2 - 18, null);
            } catch (Exception var11) {
                int var9 = class7.field112 / 2 - 152;
                int var10 = class486.field7136 / 2 - 18;
                var7.setColor(arg1);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 - -1, 301, 31);
                var7.fillRect(var9 + (arg0 * 3) + 2, var10 + 2, 300 - (arg0 * 3), 30);
                var7.setFont(class17.field278);
                var7.setColor(arg3);
                var7.drawString(arg6, var9 + (304 - (arg6.length() * 6)) / 2, var10 + 22);
            }
            if (class180.field2572 != null) {
                var7.setFont(class17.field278);
                var7.setColor(arg3);
                var7.drawString(class180.field2572, class7.field112 / 2 - (class180.field2572.length() * 6 / 2), class486.field7136 / 2 + -26);
            }
        } catch (Exception var12) {
            class245.field3430.repaint();
        }
        field4309++;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(Ljava/lang/String;B)V", line = 92)
    public static final void method1872(String arg0, byte arg1) {
        int var2 = -119 % ((39 - arg1) / 52);
        field4310++;
        if (class341.field5382 == null) {
            class407.method2483((byte) 104);
        }
        String[] var3 = class14.method125(64, '\n', arg0);
        for (int var4 = 0; var4 < var3.length; var4++) {
            for (int var5 = class74.field993; var5 > 0; var5--) {
                class341.field5382[var5] = class341.field5382[var5 - 1];
            }
            class341.field5382[0] = var3[var4];
            if (class74.field993 < class341.field5382.length - 1) {
                if (class52.field703 > 0) {
                    class52.field703++;
                }
                class74.field993++;
            }
        }
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(I)V", line = 138)
    public static void method1873(int arg0) {
        field4313 = null;
        if (arg0 != 255) {
            field4311 = null;
        }
        field4307 = null;
        field4311 = null;
    }

    @OriginalMember(owner = "client!nm", name = "a", descriptor = "(III)Z", line = 150)
    public static final boolean method1874(int arg0, int arg1, int arg2) {
        if (arg0 != -18) {
            method1872(null, (byte) -15);
        }
        field4308++;
        return (arg1 & 0x800) != 0;
    }
}
