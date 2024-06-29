import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ij")
public class class68 extends class240 {

    @OriginalMember(owner = "client!ij", name = "l", descriptor = "I")
    private int field924;

    @OriginalMember(owner = "client!ij", name = "r", descriptor = "I")
    private int field930;

    @OriginalMember(owner = "client!ij", name = "y", descriptor = "I")
    private int field937;

    @OriginalMember(owner = "client!ij", name = "s", descriptor = "I")
    private int field931;

    @OriginalMember(owner = "client!ij", name = "w", descriptor = "Lqc;")
    public static class99 field935 = new class99(20);

    @OriginalMember(owner = "client!ij", name = "A", descriptor = "I")
    public static int field939 = -2;

    @OriginalMember(owner = "client!ij", name = "C", descriptor = "I")
    public static volatile int field941 = 0;

    @OriginalMember(owner = "client!ij", name = "m", descriptor = "I")
    public static int field925;

    @OriginalMember(owner = "client!ij", name = "n", descriptor = "I")
    public static int field926;

    @OriginalMember(owner = "client!ij", name = "o", descriptor = "I")
    public static int field927;

    @OriginalMember(owner = "client!ij", name = "p", descriptor = "I")
    public static int field928;

    @OriginalMember(owner = "client!ij", name = "q", descriptor = "I")
    public static int field929;

    @OriginalMember(owner = "client!ij", name = "t", descriptor = "I")
    public static int field932;

    @OriginalMember(owner = "client!ij", name = "u", descriptor = "I")
    public static int field933;

    @OriginalMember(owner = "client!ij", name = "v", descriptor = "I")
    public static int field934;

    @OriginalMember(owner = "client!ij", name = "x", descriptor = "I")
    public static int field936;

    @OriginalMember(owner = "client!ij", name = "z", descriptor = "I")
    public static int field938;

    @OriginalMember(owner = "client!ij", name = "B", descriptor = "I")
    public static int field940;

    @OriginalMember(owner = "client!ij", name = "c", descriptor = "(III)V", line = 6)
    public final void method495(int arg0, int arg1, int arg2) {
        if (arg2 != 24998) {
            this.field924 = -14;
        }
        field925++;
        int var4 = this.field924 * arg1 >> 12;
        int var5 = this.field937 * arg0 >> 12;
        int var6 = this.field930 * arg1 >> 12;
        int var7 = this.field931 * arg0 >> 12;
        class108.method792(var7, var4, (byte) -118, var5, this.field3400, var6);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(B)V", line = 32)
    public static final void method496(byte arg0) {
        class26.field330.method724(0);
        field932++;
        int var1 = -25 / ((arg0 - 6) / 43);
        class269.field3998.method724(0);
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(I)V", line = 44)
    public static void method497(int arg0) {
        if (arg0 == 18) {
            field935 = null;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZBILjava/lang/String;Ljava/awt/Color;)V", line = 56)
    public static final void method498(boolean arg0, byte arg1, int arg2, String arg3, Color arg4) {
        try {
            Graphics var5 = class150.field2079.getGraphics();
            if (class266.field3875 == null) {
                class266.field3875 = new Font("Helvetica", 1, 13);
                class163.field2243 = class150.field2079.getFontMetrics(class266.field3875);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class187.field2592, class64.field836);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class175.field2384 == null) {
                    class175.field2384 = class150.field2079.createImage(304, 34);
                }
                Graphics var6 = class175.field2384.getGraphics();
                var6.setColor(arg4);
                if (arg1 != -51) {
                    return;
                }
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg2 * 3 + 2, 2, 300 - (arg2 * 3), 30);
                var6.setFont(class266.field3875);
                var6.setColor(Color.white);
                var6.drawString(arg3, (304 - class163.field2243.stringWidth(arg3)) / 2, 22);
                var5.drawImage(class175.field2384, class187.field2592 / 2 - 152, class64.field836 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class187.field2592 / 2 - 152;
                int var9 = class64.field836 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(var8 + (arg2 * 3) + 2, var9 + 2, 300 - (arg2 * 3), 30);
                var5.setFont(class266.field3875);
                var5.setColor(Color.white);
                var5.drawString(arg3, (304 - class163.field2243.stringWidth(arg3)) / 2 + var8, var9 - -22);
            }
            if (class30.field371 != null) {
                var5.setFont(class266.field3875);
                var5.setColor(Color.white);
                var5.drawString(class30.field371, class187.field2592 / 2 - (class163.field2243.stringWidth(class30.field371) / 2), class64.field836 / 2 + -26);
            }
        } catch (Exception var12) {
            class150.field2079.repaint();
        }
        field934++;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(III)V", line = 126)
    public final void method499(int arg0, int arg1, int arg2) {
        field938++;
        if (arg1 != 6893) {
            method504(-76, -76);
        }
        int var4 = this.field930 * arg2 >> 12;
        int var5 = this.field924 * arg2 >> 12;
        int var6 = this.field931 * arg0 >> 12;
        int var7 = this.field937 * arg0 >> 12;
        class206.method1456(var7, var6, var5, arg1 ^ 0xFFFFE570, this.field3401, var4, this.field3400, this.field3402);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IZ)I", line = 146)
    public static final int method500(int arg0, boolean arg1) {
        if (arg1) {
            field929++;
            return arg0 & 0x7F;
        } else {
            return 81;
        }
    }

    @OriginalMember(owner = "client!ij", name = "<init>", descriptor = "(IIIIIII)V", line = 156)
    public class68(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        super(arg4, arg5, arg6);
        this.field924 = arg2;
        this.field930 = arg0;
        this.field937 = arg3;
        this.field931 = arg1;
    }

    @OriginalMember(owner = "client!ij", name = "b", descriptor = "(III)V", line = 170)
    public final void method501(int arg0, int arg1, int arg2) {
        if (arg0 == -4621) {
            field928++;
        }
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "([IBJI)Ljava/lang/String;", line = 180)
    public static final String method502(int[] arg0, byte arg1, long arg2, int arg3) {
        if (arg1 >= -49) {
            method500(75, false);
        }
        field927++;
        if (class315.field4748 != null) {
            String var5 = class315.field4748.method702(arg3, arg2, arg0, 123);
            if (var5 != null) {
                return var5;
            }
        }
        return Long.toString(arg2);
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(IBZIIILkm;)V", line = 202)
    public static final void method503(int arg0, byte arg1, boolean arg2, int arg3, int arg4, int arg5, class133 arg6) {
        class278.field4179 = 1;
        class106.field1437 = arg3;
        class119.field1618 = arg5;
        if (arg1 >= -64) {
            method503(-94, (byte) 103, false, 16, 60, -7, (class133) null);
        }
        class100.field1383 = arg6;
        field933++;
        class329.field4963 = arg4;
        class290.field4320 = arg0;
        class188.field2599 = arg2;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(II)Lrh;", line = 222)
    public static final class295 method504(int arg0, int arg1) {
        class295 var2 = (class295) class336.field5061.method716((long) arg1, false);
        field936++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class192.field2640.method955(arg0, arg1, -21853);
        class295 var4 = new class295();
        if (var3 != null) {
            var4.method2013(true, arg1, new class316(var3));
        }
        class336.field5061.method721((long) arg1, var4, 0);
        return var4;
    }

    @OriginalMember(owner = "client!ij", name = "a", descriptor = "(ZI)I", line = 243)
    public static final int method505(boolean arg0, int arg1) {
        field926++;
        return arg0 ? arg1 & 0x7F : 90;
    }
}
