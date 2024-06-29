import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ffa")
public class class628 {

    @OriginalMember(owner = "client!ffa", name = "e", descriptor = "Low;")
    public static class665 field8911 = new class665();

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "I")
    public static int field8907;

    @OriginalMember(owner = "client!ffa", name = "b", descriptor = "I")
    public static int field8908;

    @OriginalMember(owner = "client!ffa", name = "d", descriptor = "I")
    public static int field8910;

    @OriginalMember(owner = "client!ffa", name = "c", descriptor = "Lcda;")
    public static class595 field8909;

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/lang/String;IIII)V", line = 4)
    public static final void method3589(String arg0, int arg1, int arg2, int arg3, int arg4) {
        field8910++;
        class519 var5 = class153.method1203(0, arg4, arg3);
        if (var5 == null) {
            return;
        }
        if (var5.field7139 != null) {
            class511 var6 = new class511();
            var6.field7023 = var5;
            var6.field7024 = arg0;
            var6.field7021 = var5.field7139;
            var6.field7025 = arg1;
            class46.method357(var6);
        }
        if (class141.field2306 != 10 || !client.method885(var5).method1248(arg1 - 1, true) || arg2 != -25984) {
            return;
        }
        if (arg1 == 1) {
            class461.field6292++;
            class302 var7 = class582.method3419(class98.field1391, (byte) 125, class626.field8901);
            class80.method711(arg3, -112, var5.field7129, arg4, var7);
            class501.method2928(0, var7);
        }
        if (arg1 == 2) {
            class406.field5586++;
            class302 var8 = class582.method3419(class599.field8542, (byte) 125, class626.field8901);
            class80.method711(arg3, -116, var5.field7129, arg4, var8);
            class501.method2928(0, var8);
        }
        if (arg1 == 3) {
            class555.field7707++;
            class302 var9 = class582.method3419(class92.field1325, (byte) 125, class626.field8901);
            class80.method711(arg3, arg2 ^ 0x650F, var5.field7129, arg4, var9);
            class501.method2928(0, var9);
        }
        if (arg1 == 4) {
            class182.field2770++;
            class302 var10 = class582.method3419(class410.field5614, (byte) 127, class626.field8901);
            class80.method711(arg3, 53, var5.field7129, arg4, var10);
            class501.method2928(0, var10);
        }
        if (arg1 == 5) {
            class51.field730++;
            class302 var11 = class582.method3419(class97.field1385, (byte) 125, class626.field8901);
            class80.method711(arg3, 86, var5.field7129, arg4, var11);
            class501.method2928(0, var11);
        }
        if (arg1 == 6) {
            class579.field8347++;
            class302 var12 = class582.method3419(class216.field3153, (byte) 126, class626.field8901);
            class80.method711(arg3, 119, var5.field7129, arg4, var12);
            class501.method2928(arg2 ^ 0xFFFF9A80, var12);
        }
        if (arg1 == 7) {
            class597.field8523++;
            class302 var13 = class582.method3419(class493.field6763, (byte) 127, class626.field8901);
            class80.method711(arg3, -87, var5.field7129, arg4, var13);
            class501.method2928(0, var13);
        }
        if (arg1 == 8) {
            class556.field7721++;
            class302 var14 = class582.method3419(class406.field5583, (byte) 125, class626.field8901);
            class80.method711(arg3, -72, var5.field7129, arg4, var14);
            class501.method2928(arg2 ^ 0xFFFF9A80, var14);
        }
        if (arg1 == 9) {
            class308.field4396++;
            class302 var15 = class582.method3419(class760.field10524, (byte) 127, class626.field8901);
            class80.method711(arg3, 68, var5.field7129, arg4, var15);
            class501.method2928(0, var15);
        }
        if (arg1 == 10) {
            class496.field6810++;
            class302 var16 = class582.method3419(class358.field5077, (byte) 126, class626.field8901);
            class80.method711(arg3, 113, var5.field7129, arg4, var16);
            class501.method2928(0, var16);
        }
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;ILjava/awt/Color;Ljava/lang/String;)V", line = 137)
    public static final void method3590(Color arg0, int arg1, Color arg2, int arg3, Color arg4, String arg5) {
        try {
            Graphics var6 = class213.field3128.getGraphics();
            if (class457.field6237 == null) {
                class457.field6237 = new Font("Helvetica", 1, 13);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class174.field2619 == null) {
                    class174.field2619 = class213.field3128.createImage(class709.field9923, class448.field6174);
                }
                Graphics var7 = class174.field2619.getGraphics();
                if (arg3 != -23902) {
                    method3590(null, -37, null, 120, null, null);
                }
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class709.field9923, class448.field6174);
                int var8 = class709.field9923 / 2 - 152;
                int var9 = class448.field6174 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg0);
                var7.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(var8 + (arg1 * 3) + 2, var9 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class457.field6237);
                var7.setColor(arg4);
                var7.drawString(arg5, (304 - (arg5.length() * 6)) / 2 + var8, var9 + 22);
                if (class281.field4113 != null) {
                    var7.setFont(class457.field6237);
                    var7.setColor(arg4);
                    var7.drawString(class281.field4113, class709.field9923 / 2 - class281.field4113.length() * 6 / 2, class448.field6174 / 2 + -26);
                }
                var6.drawImage(class174.field2619, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class709.field9923, class448.field6174);
                int var10 = class709.field9923 / 2 - 152;
                int var11 = class448.field6174 / 2 - 18;
                var6.setColor(arg2);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg0);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg1 * 3 + var10 + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class457.field6237);
                var6.setColor(arg4);
                if (class281.field4113 != null) {
                    var6.setFont(class457.field6237);
                    var6.setColor(arg4);
                    var6.drawString(class281.field4113, class709.field9923 / 2 - (class281.field4113.length() * 6 / 2), class448.field6174 / 2 + -26);
                }
                var6.drawString(arg5, (304 - (arg5.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class213.field3128.repaint();
        }
        field8907++;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(I)V", line = 231)
    public static void method3591(int arg0) {
        if (arg0 != 97) {
            field8909 = null;
        }
        field8909 = null;
        field8911 = null;
    }

    @OriginalMember(owner = "client!ffa", name = "a", descriptor = "(IC)C", line = 242)
    public static final char method3592(int arg0, char arg1) {
        field8908++;
        if (arg0 != 6075) {
            field8909 = null;
        }
        if (arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-') {
            return '_';
        } else if (arg1 == '[' || arg1 == ']' || arg1 == '#') {
            return arg1;
        } else if (arg1 == 'à' || arg1 == 'á' || arg1 == 'â' || arg1 == 'ä' || arg1 == 'ã' || arg1 == 'À' || arg1 == 'Á' || arg1 == 'Â' || arg1 == 'Ä' || arg1 == 'Ã') {
            return 'a';
        } else if (arg1 == 'è' || arg1 == 'é' || arg1 == 'ê' || arg1 == 'ë' || arg1 == 'È' || arg1 == 'É' || arg1 == 'Ê' || arg1 == 'Ë') {
            return 'e';
        } else if (arg1 == 'í' || arg1 == 'î' || arg1 == 'ï' || arg1 == 'Í' || arg1 == 'Î' || arg1 == 'Ï') {
            return 'i';
        } else if (arg1 == 'ò' || arg1 == 'ó' || arg1 == 'ô' || arg1 == 'ö' || arg1 == 'õ' || arg1 == 'Ò' || arg1 == 'Ó' || arg1 == 'Ô' || arg1 == 'Ö' || arg1 == 'Õ') {
            return 'o';
        } else if (arg1 == 'ù' || arg1 == 'ú' || arg1 == 'û' || arg1 == 'ü' || arg1 == 'Ù' || arg1 == 'Ú' || arg1 == 'Û' || arg1 == 'Ü') {
            return 'u';
        } else if (arg1 == 'ç' || arg1 == 'Ç') {
            return 'c';
        } else if (arg1 == 'ÿ' || arg1 == 'Ÿ') {
            return 'y';
        } else if (arg1 == 'ñ' || arg1 == 'Ñ') {
            return 'n';
        } else if (arg1 == 'ß') {
            return 'b';
        } else {
            return Character.toLowerCase(arg1);
        }
    }
}
