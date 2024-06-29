import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.FocusListener;
import java.awt.image.ImageObserver;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class308 extends Canvas implements FocusListener {

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Ljf;")
    public static class229 field5199 = class212.method1457((byte) 57, "Bitte entfernen Sie ");

    @OriginalMember(owner = "client!c", name = "m", descriptor = "I")
    public static int field5208 = 0;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "Ljf;")
    public static class229 field5202 = class212.method1457((byte) 104, ")4p=");

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Lni;")
    public static class24 field5196 = new class24(64);

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field5210 = 1;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "I")
    public static int field5211 = -1;

    @OriginalMember(owner = "client!c", name = "q", descriptor = "Z")
    public static boolean field5212 = true;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field5209 = 0;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field5197;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "I")
    public static int field5198;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "I")
    public static int field5200;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!c", name = "i", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!c", name = "h", descriptor = "Lbj;")
    public static class55 field5203;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZILjava/awt/Color;Ljf;I)V", line = 27)
    public static final void method2095(boolean arg0, int arg1, Color arg2, class229 arg3, int arg4) {
        try {
            Graphics var5 = class299.field5100.getGraphics();
            if (class321.field5433 == null) {
                class321.field5433 = new Font("Helvetica", 1, 13);
                class8.field86 = class299.field5100.getFontMetrics(class321.field5433);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class175.field3046, class78.field1429);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class27.field481 == null) {
                    class27.field481 = class299.field5100.createImage(304, 34);
                }
                Graphics var6 = class27.field481.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(arg1, 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg4 * 3 + 2, 2, 300 - (arg4 * 3), 30);
                var6.setFont(class321.field5433);
                var6.setColor(Color.white);
                arg3.method1618(22, false, (304 - arg3.method1640((byte) -22, class8.field86)) / 2, var6);
                var5.drawImage(class27.field481, class175.field3046 / 2 - 152, class78.field1429 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class175.field3046 / 2 - 152;
                int var9 = class78.field1429 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg4 * 3 + var8 + 2, var9 + 2, 300 - (arg4 * 3), 30);
                var5.setFont(class321.field5433);
                var5.setColor(Color.white);
                arg3.method1618(var9 + 22, false, var8 + ((304 - arg3.method1640((byte) -26, class8.field86)) / 2), var5);
            }
            if (class303.field5143 != null) {
                var5.setFont(class321.field5433);
                var5.setColor(Color.white);
                class303.field5143.method1618(class78.field1429 / 2 - 26, false, class175.field3046 / 2 - (class303.field5143.method1640((byte) 71, class8.field86) / 2), var5);
            }
        } catch (Exception var12) {
            class299.field5100.repaint();
        }
        field5206++;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIIIIII)V", line = 99)
    public static final void method2096(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (arg5 < 103) {
            method2096(-67, 19, -49, 49, -40, 24, 67);
        }
        field5198++;
        if (class149.field2578 <= (arg4 - arg3) && class327.field5490 >= arg3 + arg4 && arg1 - arg3 >= class56.field991 && (arg1 + arg3) <= class142.field2458) {
            class95.method656(-28771, arg0, arg4, arg3, arg6, arg2, arg1);
        } else {
            class14.method126(arg4, arg3, arg2, true, arg6, arg1, arg0);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(I)V", line = 139)
    public static void method2097(int arg0) {
        field5203 = null;
        if (arg0 != 304) {
            method2096(-55, -112, 43, -93, -17, 100, -94);
        }
        field5202 = null;
        field5199 = null;
        field5196 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)[B", line = 156)
    public static final byte[] method2098(int arg0, int arg1) {
        class261 var2 = (class261) class149.field2575.method643((long) arg1, 1649232044);
        if (arg0 != 2) {
            field5202 = (class229) null;
        }
        field5200++;
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; var5 < 255; var5++) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; var6 < 255; var6++) {
                int var7 = 255 - var6;
                int var8 = class50.method413(var7, false, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[511 - var6] = var9;
            }
            var2 = new class261(var3);
            class149.field2575.method640(var2, (long) arg1, 24179);
        }
        return var2.field4526;
    }
}
