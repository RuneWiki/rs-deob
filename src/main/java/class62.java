import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ao")
public class class62 {

    @OriginalMember(owner = "client!ao", name = "f", descriptor = "Lcc;")
    public static class327 field777 = new class327(50);

    @OriginalMember(owner = "client!ao", name = "g", descriptor = "Ljava/lang/String;")
    public static String field778 = "Examine";

    @OriginalMember(owner = "client!ao", name = "h", descriptor = "Ljava/lang/String;")
    public static String field779 = "Connected to update server";

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ao", name = "c", descriptor = "I")
    public static int field774;

    @OriginalMember(owner = "client!ao", name = "d", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ao", name = "e", descriptor = "I")
    public static int field776;

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(DB)V", line = 5)
    public static final void method453(double arg0, byte arg1) {
        if (arg1 != -78) {
            field777 = (class327) null;
        }
        if (class160.field2289 != arg0) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg0) * 255.0D);
                class340.field5314[var3] = var4 > 255 ? 255 : var4;
            }
            class160.field2289 = arg0;
        }
        field772++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(B)V", line = 32)
    public static final void method454(byte arg0) {
        field776++;
        if (arg0 != 113) {
            field779 = (String) null;
        }
        class237.field3428.method2258((byte) 86);
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(Ljava/awt/Color;ZZILjava/lang/String;)V", line = 45)
    public static final void method455(Color arg0, boolean arg1, boolean arg2, int arg3, String arg4) {
        try {
            Graphics var5 = class26.field307.getGraphics();
            if (class154.field2142 == null) {
                class154.field2142 = new Font("Helvetica", 1, 13);
                class336.field5255 = class26.field307.getFontMetrics(class154.field2142);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class163.field2314, class192.field2660);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class292.field4250 == null) {
                    class292.field4250 = class26.field307.createImage(304, 34);
                }
                Graphics var6 = class292.field4250.getGraphics();
                var6.setColor(arg0);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                if (arg2) {
                    method454((byte) -20);
                }
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class154.field2142);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class336.field5255.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class292.field4250, class163.field2314 / 2 - 152, class192.field2660 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class163.field2314 / 2 - 152;
                int var9 = class192.field2660 / 2 - 18;
                var5.setColor(arg0);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var8 + 2, var9 - -2, 300 - (arg3 * 3), 30);
                var5.setFont(class154.field2142);
                var5.setColor(Color.white);
                var5.drawString(arg4, var8 + ((304 - class336.field5255.stringWidth(arg4)) / 2), var9 + 22);
            }
            if (class137.field1876 != null) {
                var5.setFont(class154.field2142);
                var5.setColor(Color.white);
                var5.drawString(class137.field1876, class163.field2314 / 2 - class336.field5255.stringWidth(class137.field1876) / 2, class192.field2660 / 2 + -26);
            }
        } catch (Exception var12) {
            class26.field307.repaint();
        }
        field775++;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(IIIILvc;Lvc;IIIIJ)V", line = 114)
    public static final void method456(int arg0, int arg1, int arg2, int arg3, class260 arg4, class260 arg5, int arg6, int arg7, int arg8, int arg9, long arg10) {
        if (arg4 == null) {
            return;
        }
        class66 var12 = new class66();
        var12.field851 = arg10;
        var12.field838 = arg1 * 128 + 64;
        var12.field836 = arg2 * 128 + 64;
        var12.field839 = arg3;
        var12.field848 = arg4;
        var12.field845 = arg5;
        var12.field841 = arg6;
        var12.field843 = arg7;
        var12.field852 = arg8;
        var12.field837 = arg9;
        for (int var13 = arg0; var13 >= 0; var13--) {
            if (class345.field5367[var13][arg1][arg2] == null) {
                class345.field5367[var13][arg1][arg2] = new class119(var13, arg1, arg2);
            }
        }
        class345.field5367[arg0][arg1][arg2].field1566 = var12;
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(I)Lma;", line = 147)
    public static final class145 method457(int arg0) {
        field773++;
        if (arg0 != 0) {
            method454((byte) -81);
        }
        class145 var1;
        if (class47.field623) {
            var1 = new class127(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], class338.field5276[0], class292.field4253);
        } else {
            var1 = new class153(class16.field201, class133.field1805, class348.field5418[0], class119.field1578[0], class251.field3673[0], class184.field2508[0], class338.field5276[0], class292.field4253);
        }
        class236.method1685(false);
        return var1;
    }

    @OriginalMember(owner = "client!ao", name = "b", descriptor = "(I)V", line = 164)
    public static void method458(int arg0) {
        field778 = null;
        field777 = null;
        field779 = null;
        if (arg0 != 34) {
            field779 = (String) null;
        }
    }

    @OriginalMember(owner = "client!ao", name = "a", descriptor = "(III[[III)I", line = 182)
    public static final int method459(int arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5) {
        field774++;
        if (arg5 != 13) {
            field779 = (String) null;
        }
        int var6 = (128 - arg0) * arg3[arg1][arg4] + arg3[arg1 + 1][arg4] * arg0 >> 7;
        int var7 = (128 - arg0) * arg3[arg1][arg4 + 1] + arg3[arg1 + 1][arg4 + 1] * arg0 >> 7;
        return (128 - arg2) * var6 + arg2 * var7 >> 7;
    }
}
