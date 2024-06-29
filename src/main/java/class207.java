import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qh")
public class class207 extends class84 {

    @OriginalMember(owner = "client!qh", name = "I", descriptor = "Lba;")
    public class170 field2893;

    @OriginalMember(owner = "client!qh", name = "C", descriptor = "I")
    public static int field2887 = 0;

    @OriginalMember(owner = "client!qh", name = "K", descriptor = "[C")
    public static char[] field2894 = new char[128];

    @OriginalMember(owner = "client!qh", name = "L", descriptor = "Ljava/lang/String;")
    public static String field2895 = "white:";

    @OriginalMember(owner = "client!qh", name = "B", descriptor = "I")
    public static int field2886;

    @OriginalMember(owner = "client!qh", name = "D", descriptor = "I")
    public static int field2888;

    @OriginalMember(owner = "client!qh", name = "F", descriptor = "I")
    public static int field2890;

    @OriginalMember(owner = "client!qh", name = "G", descriptor = "I")
    public static int field2891;

    @OriginalMember(owner = "client!qh", name = "H", descriptor = "I")
    public static int field2892;

    @OriginalMember(owner = "client!qh", name = "E", descriptor = "Lml;")
    public static class296 field2889;

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIIZB)V")
    public static final void method1314(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5) {
        if (arg5 != -123) {
            method1318(-55, -122);
        }
        if (arg3 < 1) {
            arg3 = 1;
        }
        class16.field172 = (short) arg3;
        if (arg2 < 1) {
            arg2 = 1;
        }
        class165.field2283 = (short) arg2;
        field2888++;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(Ljava/lang/String;IZBLjava/awt/Color;)V")
    public static final void method1315(String arg0, int arg1, boolean arg2, byte arg3, Color arg4) {
        try {
            Graphics var5 = class156.field2177.getGraphics();
            if (class177.field2484 == null) {
                class177.field2484 = new Font("Helvetica", 1, 13);
                class41.field615 = class156.field2177.getFontMetrics(class177.field2484);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class275.field4263, class197.field2739);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class165.field2281 == null) {
                    class165.field2281 = class156.field2177.createImage(304, 34);
                }
                if (arg3 <= 100) {
                    field2889 = null;
                }
                Graphics var6 = class165.field2281.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class177.field2484);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class41.field615.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class165.field2281, class275.field4263 / 2 - 152, class197.field2739 / 2 - 18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class275.field4263 / 2 - 152;
                int var8 = class197.field2739 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 - -1, 301, 31);
                var5.fillRect((arg1 * 3) + var7 + 2, var8 + 2, 300 - arg1 * 3, 30);
                var5.setFont(class177.field2484);
                var5.setColor(Color.white);
                var5.drawString(arg0, var7 + ((304 - class41.field615.stringWidth(arg0)) / 2), var8 + 22);
            }
            if (class245.field3750 != null) {
                var5.setFont(class177.field2484);
                var5.setColor(Color.white);
                var5.drawString(class245.field3750, class275.field4263 / 2 - class41.field615.stringWidth(class245.field3750) / 2, class197.field2739 / 2 + -26);
            }
        } catch (Exception var10) {
            class156.field2177.repaint();
        }
        field2891++;
    }

    @OriginalMember(owner = "client!qh", name = "d", descriptor = "(B)V")
    public static void method1316(byte arg0) {
        field2894 = null;
        if (arg0 == -50) {
            field2895 = null;
            field2889 = null;
        }
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(IIIII)V")
    public static final void method1317(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -121 / ((arg2 - 17) / 56);
        class69 var6 = (class69) class75.field1051.method23(216, (long) arg4);
        if (var6 == null) {
            var6 = new class69();
            class75.field1051.method20(var6, (long) arg4, 0);
        }
        field2886++;
        if (var6.field941.length <= arg0) {
            int[] var7 = new int[arg0 + 1];
            int[] var8 = new int[arg0 + 1];
            for (int var9 = 0; var9 < var6.field941.length; var9++) {
                var7[var9] = var6.field941[var9];
                var8[var9] = var6.field942[var9];
            }
            for (int var10 = var6.field941.length; var10 < arg0; var10++) {
                var7[var10] = -1;
                var8[var10] = 0;
            }
            var6.field942 = var8;
            var6.field941 = var7;
        }
        var6.field941[arg0] = arg3;
        var6.field942[arg0] = arg1;
    }

    @OriginalMember(owner = "client!qh", name = "a", descriptor = "(II)V")
    public static final void method1318(int arg0, int arg1) {
        field2890++;
        class280 var2 = class181.method1180(arg0, arg1 ^ arg1, 1);
        var2.method1871((byte) 26);
    }

    @OriginalMember(owner = "client!qh", name = "<init>", descriptor = "(Lba;)V")
    public class207(class170 arg0) {
        this.field2893 = arg0;
    }
}
