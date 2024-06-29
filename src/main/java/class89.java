import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qf")
public class class89 {

    @OriginalMember(owner = "client!qf", name = "j", descriptor = "I")
    private int field1455 = 0;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "Lhb;")
    private class155 field1446;

    @OriginalMember(owner = "client!qf", name = "i", descriptor = "I")
    public static int field1454 = 0;

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "I")
    public static int field1447;

    @OriginalMember(owner = "client!qf", name = "c", descriptor = "I")
    public static int field1448;

    @OriginalMember(owner = "client!qf", name = "e", descriptor = "I")
    public static int field1450;

    @OriginalMember(owner = "client!qf", name = "f", descriptor = "I")
    public static int field1451;

    @OriginalMember(owner = "client!qf", name = "g", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!qf", name = "h", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!qf", name = "d", descriptor = "Lhd;")
    private class128 field1449;

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(I)Lhd;")
    public final class128 method604(int arg0) {
        if (arg0 == 1) {
            field1448++;
            this.field1455 = 0;
            return this.method605(arg0 - 36);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qf", name = "b", descriptor = "(I)Lhd;")
    public final class128 method605(int arg0) {
        field1450++;
        if (this.field1455 > 0 && this.field1446.field2431[this.field1455 - 1] != this.field1449) {
            class128 var2 = this.field1449;
            this.field1449 = var2.field2022;
            return var2;
        }
        while (this.field1455 < this.field1446.field2423) {
            class128 var4 = this.field1446.field2431[this.field1455++].field2022;
            if (this.field1446.field2431[this.field1455 - 1] != var4) {
                this.field1449 = var4.field2022;
                return var4;
            }
        }
        int var3 = 15 % ((72 - arg0) / 53);
        return null;
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(ZILjava/awt/Color;ILjava/lang/String;)V")
    public static final void method606(boolean arg0, int arg1, Color arg2, int arg3, String arg4) {
        field1453++;
        try {
            Graphics var5 = class131.field2064.getGraphics();
            if (class220.field3598 == null) {
                class220.field3598 = new Font("Helvetica", 1, 13);
                class167.field2725 = class131.field2064.getFontMetrics(class220.field3598);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class294.field4709, class310.field4964);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class278.field4463 == null) {
                    class278.field4463 = class131.field2064.createImage(304, 34);
                }
                Graphics var6 = class278.field4463.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                if (arg1 < 90) {
                    return;
                }
                var6.setFont(class220.field3598);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class167.field2725.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class278.field4463, class294.field4709 / 2 - 152, class310.field4964 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class294.field4709 / 2 - 152;
                int var8 = class310.field4964 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 - -2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - (arg3 * 3), 30);
                var5.setFont(class220.field3598);
                var5.setColor(Color.white);
                var5.drawString(arg4, var7 + ((304 - class167.field2725.stringWidth(arg4)) / 2), var8 + 22);
            }
            if (class177.field2901 != null) {
                var5.setFont(class220.field3598);
                var5.setColor(Color.white);
                var5.drawString(class177.field2901, class294.field4709 / 2 - (class167.field2725.stringWidth(class177.field2901) / 2), class310.field4964 / 2 + -26);
            }
        } catch (Exception var10) {
            class131.field2064.repaint();
        }
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Z)Lsk;")
    public static final class203 method607(boolean arg0) {
        if (arg0) {
            field1454 = 110;
        }
        field1452++;
        class179.field2919 = 0;
        return class223.method1528((byte) 124);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(IIII)V")
    public static final void method608(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 == 0) {
            class30.field372++;
            class314.field5061.method828(114, 57);
        }
        if (arg2 == 1) {
            class133.field2115++;
            class314.field5061.method828(arg0 + 278, 131);
        }
        if (arg0 != -152) {
            method607(true);
        }
        class314.field5061.method1135(arg1 + class276.field4438, (byte) -53);
        class314.field5061.method1161(4, ++class53.field883);
        field1451++;
        class314.field5061.method1161(arg0 ^ 0xFFFFFF6C, class100.field1627[82] ? 1 : 0);
        class314.field5061.method1135(class108.field1732 + arg3, (byte) -53);
    }

    @OriginalMember(owner = "client!qf", name = "a", descriptor = "(Ljava/lang/String;B)V")
    public static final void method609(String arg0, byte arg1) {
        class160.field2545 = arg0;
        field1447++;
        if (class268.field4323.field751 == null) {
            return;
        }
        try {
            if (arg1 >= 33) {
                String var2 = class268.field4323.field751.getParameter("cookieprefix");
                String var3 = class268.field4323.field751.getParameter("cookiehost");
                String var4 = var2 + "settings=" + arg0 + "; version=1; path=/; domain=" + var3;
                String var5;
                if (arg0.length() == 0) {
                    var5 = var4 + "; Expires=Thu, 01-Jan-1970 00:00:00 GMT; Max-Age=0";
                } else {
                    var5 = var4 + "; Expires=" + class177.method1295(class191.method1350((byte) 3) + 94608000000L, (byte) -122) + "; Max-Age=" + 94608000L;
                }
                class297.method1968("document.cookie=\"" + var5 + "\"", class268.field4323.field751, -24971);
            }
        } catch (Throwable var6) {
        }
    }

    @OriginalMember(owner = "client!qf", name = "<init>", descriptor = "(Lhb;)V")
    public class89(class155 arg0) {
        this.field1446 = arg0;
    }
}
