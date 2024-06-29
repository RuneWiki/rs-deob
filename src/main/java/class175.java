import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ru")
public class class175 extends class154 {

    @OriginalMember(owner = "client!ru", name = "O", descriptor = "Lnd;")
    public static class500 field2614 = new class500();

    @OriginalMember(owner = "client!ru", name = "P", descriptor = "Luc;")
    public static class27 field2615 = new class27(72, 11);

    @OriginalMember(owner = "client!ru", name = "Q", descriptor = "Luc;")
    public static class27 field2616 = new class27(82, 8);

    @OriginalMember(owner = "client!ru", name = "J", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ru", name = "K", descriptor = "I")
    public static int field2610;

    @OriginalMember(owner = "client!ru", name = "L", descriptor = "I")
    public static int field2611;

    @OriginalMember(owner = "client!ru", name = "M", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ru", name = "N", descriptor = "I")
    public static int field2613;

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(FB)V", line = 3)
    public final void method1082(float arg0, byte arg1) {
        ++field2613;
        super.field2314 = arg0;
        if (arg1 != 87) {
            field2614 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "<init>", descriptor = "(IIIIIF)V", line = 16)
    public class175(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4, arg5);
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(IIII)V", line = 20)
    public final void method1078(int arg0, int arg1, int arg2, int arg3) {
        super.field2318 = arg0;
        if (arg1 != 4671) {
            method1199(105);
        }
        ++field2612;
        super.field2320 = arg2;
        super.field2321 = arg3;
    }

    @OriginalMember(owner = "client!ru", name = "h", descriptor = "(I)V", line = 34)
    public static void method1199(int arg0) {
        field2615 = null;
        field2614 = null;
        field2616 = null;
        if (arg0 >= -85) {
            field2615 = null;
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;Ljava/awt/Color;ILjava/awt/Color;I)V", line = 46)
    public static final void method1200(String arg0, Color arg1, Color arg2, int arg3, Color arg4, int arg5) {
        ++field2611;
        try {
            Graphics var6 = class105.field1413.getGraphics();
            if (class580.field7940 == null) {
                class580.field7940 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            int var7 = -35 / ((61 - arg3) / 39);
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class328.field4851 == null) {
                    class328.field4851 = class105.field1413.createImage(class547.field7412, class124.field1711);
                }
                Graphics var8 = class328.field4851.getGraphics();
                var8.setColor(Color.black);
                var8.fillRect(0, 0, class547.field7412, class124.field1711);
                int var9 = class547.field7412 / 2 + -152;
                int var10 = class124.field1711 / 2 + -18;
                var8.setColor(arg1);
                var8.drawRect(var9, var10, 303, 33);
                var8.setColor(arg2);
                var8.fillRect(var9 + 2, var10 + 2, arg5 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(var9 + 1, var10 + 1, 301, 31);
                var8.fillRect(arg5 * 3 + 2 + var9, var10 + 2, 300 - arg5 * 3, 30);
                var8.setFont(class580.field7940);
                var8.setColor(arg4);
                var8.drawString(arg0, (-(arg0.length() * 6) + 304) / 2 + var9, var10 + 22);
                if (class571.field7672 != null) {
                    var8.setFont(class580.field7940);
                    var8.setColor(arg4);
                    var8.drawString(class571.field7672, class547.field7412 / 2 - class571.field7672.length() * 6 / 2, class124.field1711 / 2 + -26);
                }
                var6.drawImage(class328.field4851, 0, 0, (ImageObserver) null);
            } catch (Exception var13) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class547.field7412, class124.field1711);
                int var11 = class547.field7412 / 2 - 152;
                int var12 = class124.field1711 / 2 + -18;
                var6.setColor(arg1);
                var6.drawRect(var11, var12, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var11 + 2, var12 + 2, arg5 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var11 + 1, var12 + 1, 301, 31);
                var6.fillRect(arg5 * 3 + var11 + 2, var12 + 2, -(arg5 * 3) + 300, 30);
                var6.setFont(class580.field7940);
                var6.setColor(arg4);
                if (class571.field7672 != null) {
                    var6.setFont(class580.field7940);
                    var6.setColor(arg4);
                    var6.drawString(class571.field7672, class547.field7412 / 2 + -(6 * class571.field7672.length() / 2), class124.field1711 / 2 + -26);
                }
                var6.drawString(arg0, var11 - -((304 + -(arg0.length() * 6)) / 2), var12 + 22);
            }
        } catch (Exception var14) {
            class105.field1413.repaint();
        }
    }

    @OriginalMember(owner = "client!ru", name = "a", descriptor = "(Ljava/lang/String;IZLpj;)Lkea;", line = 134)
    public static final class216 method1201(String arg0, int arg1, boolean arg2, class132 arg3) {
        ++field2610;
        int var4 = arg3.method920(arg1, arg0);
        if (~var4 == 0) {
            return new class216(0);
        } else {
            int[] var5 = arg3.method939((byte) 23, var4);
            class216 var6 = new class216(var5.length);
            int var7 = 0;
            int var8 = 0;
            while (true) {
                while (~var6.field3141 < ~var7) {
                    class96 var9 = new class96(arg3.method940(var4, var5[var8++], 0));
                    int var10 = var9.method714(false);
                    int var11 = var9.method743((byte) -54);
                    int var12 = var9.method718(107);
                    if (!arg2 && ~var12 == -2) {
                        --var6.field3141;
                    } else {
                        var6.field3140[var7] = var10;
                        var6.field3135[var7] = var11;
                        ++var7;
                    }
                }
                return var6;
            }
        }
    }
}
