import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gg")
public class class206 {

    @OriginalMember(owner = "client!gg", name = "c", descriptor = "[I")
    public static int[] field3307 = new int[14];

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "I")
    public static int field3305;

    @OriginalMember(owner = "client!gg", name = "b", descriptor = "I")
    public static int field3306;

    @OriginalMember(owner = "client!gg", name = "d", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!gg", name = "e", descriptor = "I")
    public static int field3309;

    @OriginalMember(owner = "client!gg", name = "f", descriptor = "I")
    public static int field3310;

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(IB)Lmd;")
    public static final class242 method1422(int arg0, byte arg1) {
        class242 var2 = (class242) class170.field2791.method1879(8887, (long) arg0);
        field3306++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class265.field4319.method1156(class215.method1474(false, arg0), class295.method2025(109, arg0), (byte) -16);
        class242 var4 = new class242();
        var4.field3835 = arg0;
        if (var3 != null) {
            var4.method1642(new class274(var3), -15435);
        }
        var4.method1646(-100);
        if (arg1 < 30) {
            return null;
        } else {
            class170.field2791.method1883((long) arg0, -82, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(Ljava/awt/Color;Ljava/lang/String;ZBI)V")
    public static final void method1423(Color arg0, String arg1, boolean arg2, byte arg3, int arg4) {
        try {
            Graphics var5 = class122.field1926.getGraphics();
            if (class236.field3706 == null) {
                class236.field3706 = new Font("Helvetica", 1, 13);
                class101.field1592 = class122.field1926.getFontMetrics(class236.field3706);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class154.field2463, class195.field3161);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class230.field3606 == null) {
                    class230.field3606 = class122.field1926.createImage(304, 34);
                }
                Graphics var6 = class230.field3606.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                if (arg3 < 70) {
                    return;
                }
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class236.field3706);
                var6.setColor(Color.white);
                var6.drawString(arg1, (304 - class101.field1592.stringWidth(arg1)) / 2, 22);
                var5.drawImage(class230.field3606, class154.field2463 / 2 - 152, class195.field3161 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class195.field3161 / 2 - 18;
                int var8 = class154.field2463 / 2 - 152;
                var5.setColor(arg0);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 - -1, 301, 31);
                var5.fillRect(arg4 * 3 + (var8 + 2), var7 + 2, 300 - arg4 * 3, 30);
                var5.setFont(class236.field3706);
                var5.setColor(Color.white);
                var5.drawString(arg1, (304 - class101.field1592.stringWidth(arg1)) / 2 + var8, var7 + 22);
            }
            if (class92.field1470 != null) {
                var5.setFont(class236.field3706);
                var5.setColor(Color.white);
                var5.drawString(class92.field1470, class154.field2463 / 2 - (class101.field1592.stringWidth(class92.field1470) / 2), class195.field3161 / 2 + -26);
            }
        } catch (Exception var10) {
            class122.field1926.repaint();
        }
        field3309++;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(BI)Z")
    public static final boolean method1424(byte arg0, int arg1) {
        field3305++;
        if (arg1 < 0) {
            return false;
        }
        if (arg0 != 74) {
            field3307 = null;
        }
        int var2 = class26.field478[arg1];
        if (var2 >= 2000) {
            var2 -= 2000;
        }
        return var2 == 1005;
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(B)I")
    public static final int method1425(byte arg0) {
        field3308++;
        if ((double) class262.field4269 == 3.0D) {
            return 37;
        } else if ((double) class262.field4269 == 4.0D) {
            return 50;
        } else if ((double) class262.field4269 == 6.0D) {
            return 75;
        } else if ((double) class262.field4269 == 8.0D) {
            return 100;
        } else {
            if (arg0 != -100) {
                method1426(52);
            }
            return 200;
        }
    }

    @OriginalMember(owner = "client!gg", name = "a", descriptor = "(I)V")
    public static void method1426(int arg0) {
        field3307 = null;
        if (arg0 != 301) {
            method1422(76, (byte) 47);
        }
    }
}
