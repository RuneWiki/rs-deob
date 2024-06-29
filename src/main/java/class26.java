import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qaa")
public class class26 {

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "[Ltda;")
    public static class638[] field421 = new class638[128];

    @OriginalMember(owner = "client!qaa", name = "d", descriptor = "I")
    public static int field424 = 0;

    @OriginalMember(owner = "client!qaa", name = "g", descriptor = "[[Z")
    public static boolean[][] field427 = new boolean[][] { { true, true, true, true, true, true, true, true, true, true, true, true, true }, { true, true, true, false, false, false, true, true, false, false, false, false, true }, { true, false, false, false, false, true, true, true, false, false, false, false, false }, { false, false, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, true, true, true, false, false, false, false, false, false, false }, { true, true, true, false, false, true, true, true, false, false, false, false, false }, { true, true, false, false, false, true, true, true, false, false, false, false, true }, { true, true, false, false, false, false, false, true, false, false, false, false, false }, { false, true, true, true, true, true, true, true, false, false, false, false, false }, { true, false, false, false, true, true, true, true, true, true, false, false, false }, { true, true, true, true, true, false, false, false, true, true, false, false, false }, { true, true, true, false, false, false, false, false, false, false, true, true, false }, new boolean[13], { true, true, true, true, true, true, true, true, true, true, true, true, true }, new boolean[13] };

    @OriginalMember(owner = "client!qaa", name = "b", descriptor = "I")
    public static int field422;

    @OriginalMember(owner = "client!qaa", name = "c", descriptor = "I")
    public static int field423;

    @OriginalMember(owner = "client!qaa", name = "e", descriptor = "I")
    public static int field425;

    @OriginalMember(owner = "client!qaa", name = "f", descriptor = "I")
    public static int field426;

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(III)V", line = 4)
    public static final void method246(int arg0, int arg1, int arg2) {
        if (class320.field4576 != 0) {
            if (arg1 >= 0) {
                class453.field6189[arg1] = arg0;
            } else {
                for (int var3 = 0; var3 < 16; var3++) {
                    class453.field6189[var3] = arg0;
                }
            }
        }
        if (arg2 != 2) {
            field421 = null;
        }
        field422++;
        class566.field7445.method43((byte) -119, arg1, arg0);
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(I)V", line = 43)
    public static void method247(int arg0) {
        field427 = null;
        field421 = null;
        if (arg0 != 3) {
            method249(true, (byte) -47);
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ILjava/awt/Color;BLjava/awt/Color;Ljava/lang/String;Ljava/awt/Color;)V", line = 58)
    public static final void method248(int arg0, Color arg1, byte arg2, Color arg3, String arg4, Color arg5) {
        field423++;
        try {
            Graphics var6 = class295.field4217.getGraphics();
            if (class369.field5149 == null) {
                class369.field5149 = new Font("Helvetica", 1, 13);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                int var7 = -25 / ((arg2 - 32) / 53);
                if (class281.field3984 == null) {
                    class281.field3984 = class295.field4217.createImage(class228.field3251, class199.field2993);
                }
                Graphics var8 = class281.field3984.getGraphics();
                var8.setColor(Color.black);
                var8.fillRect(0, 0, class228.field3251, class199.field2993);
                int var9 = class228.field3251 / 2 - 152;
                int var10 = class199.field2993 / 2 - 18;
                var8.setColor(arg1);
                var8.drawRect(var9, var10, 303, 33);
                var8.setColor(arg5);
                var8.fillRect(var9 + 2, var10 + 2, arg0 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(var9 + 1, var10 + 1, 301, 31);
                var8.fillRect(arg0 * 3 + (var9 + 2), var10 + 2, 300 - (arg0 * 3), 30);
                var8.setFont(class369.field5149);
                var8.setColor(arg3);
                var8.drawString(arg4, var9 + (304 - arg4.length() * 6) / 2, var10 - -22);
                if (class314.field4489 != null) {
                    var8.setFont(class369.field5149);
                    var8.setColor(arg3);
                    var8.drawString(class314.field4489, class228.field3251 / 2 - (class314.field4489.length() * 6 / 2), class199.field2993 / 2 + -26);
                }
                var6.drawImage(class281.field3984, 0, 0, null);
            } catch (Exception var13) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class228.field3251, class199.field2993);
                int var11 = class228.field3251 / 2 - 152;
                int var12 = class199.field2993 / 2 - 18;
                var6.setColor(arg1);
                var6.drawRect(var11, var12, 303, 33);
                var6.setColor(arg5);
                var6.fillRect(var11 + 2, var12 + 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var11 + 1, var12 - -1, 301, 31);
                var6.fillRect(arg0 * 3 + var11 + 2, var12 - -2, 300 - (arg0 * 3), 30);
                var6.setFont(class369.field5149);
                var6.setColor(arg3);
                if (class314.field4489 != null) {
                    var6.setFont(class369.field5149);
                    var6.setColor(arg3);
                    var6.drawString(class314.field4489, class228.field3251 / 2 - class314.field4489.length() * 6 / 2, class199.field2993 / 2 + -26);
                }
                var6.drawString(arg4, var11 + (304 - (arg4.length() * 6)) / 2, var12 + 22);
            }
        } catch (Exception var14) {
            class295.field4217.repaint();
        }
    }

    @OriginalMember(owner = "client!qaa", name = "a", descriptor = "(ZB)V", line = 148)
    public static final void method249(boolean arg0, byte arg1) {
        if (arg0 && class744.field10336 != null) {
            class95.field1159 = class744.field10336.field8490;
        } else {
            class95.field1159 = -1;
        }
        field425++;
        class557.field7340 = null;
        class668.field9127 = null;
        class178.field2687 = 0;
        if (arg1 > -122) {
            return;
        }
        class744.field10336 = null;
        class744.method4152();
        class744.field10345.method23(10);
        class410.field5685 = null;
        class363.field5115 = null;
        class607.field7987 = null;
        class127.field2094 = null;
        class565.field7435 = null;
        class663.field8853 = -1;
        class288.field4082 = null;
        class668.field9129 = null;
        class141.field2264 = null;
        class308.field4428 = null;
        class347.field4871 = -1;
        class744.field10346 = null;
        if (class744.field10338 != null) {
            class744.field10338.method3197(0);
            class744.field10338.method3193(128, (byte) -90, 64);
        }
        if (class744.field10337 != null) {
            class744.field10337.method1620(1, 64, 64);
        }
        if (class744.field10339 != null) {
            class744.field10339.method2012(64, true);
        }
        class224.field3172.method2590(64, -886);
    }
}
