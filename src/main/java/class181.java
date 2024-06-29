import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.io.File;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class181 {

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "[I")
    public static int[] field2220 = new int[8];

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "Lvj;")
    public static class402 field2225 = new class402(3);

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "I")
    public static int field2219;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "I")
    public static int field2222;

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!pk", name = "f", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(III)I", line = 5)
    public static final int method1056(int arg0, int arg1, int arg2) {
        field2224++;
        if (arg0 != -127) {
            return -99;
        }
        int var3 = (arg2 & 0x7F) * arg1 >> 7;
        if (var3 < 2) {
            var3 = 2;
        } else if (var3 > 126) {
            var3 = 126;
        }
        return (arg2 & 0xFF80) + var3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BLjava/io/File;)[B", line = 26)
    public static final byte[] method1057(byte arg0, File arg1) {
        field2219++;
        return arg0 == -29 ? class120.method712((int) arg1.length(), false, arg1) : null;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(I)V", line = 37)
    public static void method1058(int arg0) {
        if (arg0 <= -23) {
            field2220 = null;
            field2225 = null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIZ)Z", line = 48)
    public static final boolean method1059(int arg0, int arg1, boolean arg2) {
        field2223++;
        if (!arg2) {
            field2222 = 15;
        }
        return (arg1 & 0x220) == 544 | (arg1 & 0x18) != 0;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;)V", line = 72)
    public static final void method1060(String arg0, int arg1, Color arg2, int arg3, Color arg4, Color arg5) {
        try {
            Graphics var6 = class220.field2664.getGraphics();
            if (class683.field9690 == null) {
                class683.field9690 = new Font("Helvetica", 1, 13);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(255, 255, 255);
            }
            try {
                if (class436.field6076 == null) {
                    class436.field6076 = class220.field2664.createImage(class399.field5336, class416.field5524);
                }
                Graphics var7 = class436.field6076.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class399.field5336, class416.field5524);
                int var8 = class399.field5336 / 2 - 152;
                int var9 = class416.field5524 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg4);
                var7.fillRect(var8 + 2, var9 - -2, arg1 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg1 * 3 + (var8 + 2), var9 + 2, 300 - (arg1 * 3), 30);
                var7.setFont(class683.field9690);
                var7.setColor(arg2);
                var7.drawString(arg0, (arg3 - (arg0.length() * 6)) / 2 + var8, var9 - -22);
                if (class537.field7671 != null) {
                    var7.setFont(class683.field9690);
                    var7.setColor(arg2);
                    var7.drawString(class537.field7671, class399.field5336 / 2 - class537.field7671.length() * 6 / 2, class416.field5524 / 2 + -26);
                }
                var6.drawImage(class436.field6076, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class399.field5336, class416.field5524);
                int var10 = class399.field5336 / 2 - 152;
                int var11 = class416.field5524 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg4);
                var6.fillRect(var10 + 2, var11 + 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg1 * 3) + 2, var11 + 2, 300 - (arg1 * 3), 30);
                var6.setFont(class683.field9690);
                var6.setColor(arg2);
                if (class537.field7671 != null) {
                    var6.setFont(class683.field9690);
                    var6.setColor(arg2);
                    var6.drawString(class537.field7671, class399.field5336 / 2 - class537.field7671.length() * 6 / 2, class416.field5524 / 2 + -26);
                }
                var6.drawString(arg0, (304 - (arg0.length() * 6)) / 2 + var10, var11 + 22);
            }
        } catch (Exception var13) {
            class220.field2664.repaint();
        }
        field2221++;
    }
}
