import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class54 {

    @OriginalMember(owner = "client!he", name = "h", descriptor = "Ltd;")
    private static class136 field1201 = class145.method1172("Loaded input handler", 45);

    @OriginalMember(owner = "client!he", name = "i", descriptor = "Ltd;")
    public static class136 field1202 = field1201;

    @OriginalMember(owner = "client!he", name = "l", descriptor = "I")
    public static volatile int field1205 = 0;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "I")
    public static int field1194 = 0;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "Ltd;")
    private static class136 field1206 = class145.method1172("Could not complete login)3", 45);

    @OriginalMember(owner = "client!he", name = "c", descriptor = "Ltd;")
    public static class136 field1196 = field1206;

    @OriginalMember(owner = "client!he", name = "f", descriptor = "Lcf;")
    public static class21 field1199 = new class21();

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Ltd;")
    private static class136 field1207 = class145.method1172("Checking for updates )2 ", 45);

    @OriginalMember(owner = "client!he", name = "o", descriptor = "Ltd;")
    public static class136 field1208 = field1207;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Ltd;")
    public static class136 field1210 = class145.method1172("oder ung-Ultiges Passwort)3", 45);

    @OriginalMember(owner = "client!he", name = "p", descriptor = "Ltd;")
    public static class136 field1209 = class145.method1172("Unerwartete Antwort vom Anmelde)2Server", 45);

    @OriginalMember(owner = "client!he", name = "b", descriptor = "I")
    public static int field1195;

    @OriginalMember(owner = "client!he", name = "e", descriptor = "I")
    public static int field1198;

    @OriginalMember(owner = "client!he", name = "g", descriptor = "I")
    public static int field1200;

    @OriginalMember(owner = "client!he", name = "j", descriptor = "I")
    public static int field1203;

    @OriginalMember(owner = "client!he", name = "k", descriptor = "I")
    public static int field1204;

    @OriginalMember(owner = "client!he", name = "d", descriptor = "[[B")
    public static byte[][] field1197;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(I)V")
    public static void method434(int arg0) {
        field1206 = null;
        field1201 = null;
        field1196 = null;
        field1210 = null;
        field1208 = null;
        field1202 = null;
        if (arg0 >= 59) {
            field1199 = null;
            field1197 = null;
            field1207 = null;
            field1209 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II)[B")
    public static final synchronized byte[] method435(int arg0, int arg1) {
        field1204++;
        if (arg1 == 100 && class88.field2093 > 0) {
            byte[] var2 = class74.field1600[--class88.field2093];
            class74.field1600[class88.field2093] = null;
            return var2;
        } else if (~arg1 == arg0 && class86.field2012 > 0) {
            byte[] var3 = class74.field1659[--class86.field2012];
            class74.field1659[class86.field2012] = null;
            return var3;
        } else if (arg1 == 30000 && class64.field1365 > 0) {
            byte[] var4 = class61.field1296[--class64.field1365];
            class61.field1296[class64.field1365] = null;
            return var4;
        } else {
            return new byte[arg1];
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(ILtd;ILjava/awt/Color;)V")
    public static final void method436(int arg0, class136 arg1, int arg2, Color arg3) {
        try {
            Graphics var4 = class14.field279.getGraphics();
            if (class101.field2419 == null) {
                class101.field2419 = new Font("Helvetica", 1, 13);
                class141.field3264 = class14.field279.getFontMetrics(class101.field2419);
            }
            if (class12.field224) {
                class12.field224 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class91.field2160, class93.field2184);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            try {
                if (class101.field2429 == null) {
                    class101.field2429 = class14.field279.createImage(304, 34);
                }
                Graphics var5 = class101.field2429.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class101.field2419);
                var5.setColor(Color.white);
                arg1.method1121(22, arg0 ^ 0xFFFFEDF6, var5, (304 - arg1.method1099(class141.field3264, (byte) -100)) / 2);
                var4.drawImage(class101.field2429, class91.field2160 / 2 - 152, class93.field2184 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class91.field2160 / 2 - 152;
                int var7 = class93.field2184 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg2 * 3 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class101.field2419);
                var4.setColor(Color.white);
                arg1.method1121(var7 + 22, -1, var4, (304 - arg1.method1099(class141.field3264, (byte) -103)) / 2 + var6);
            }
        } catch (Exception var9) {
            class14.field279.repaint();
        }
        if (arg0 == 4617) {
            field1198++;
        }
    }
}
