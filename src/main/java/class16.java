import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class16 {

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field214 = 0;

    @OriginalMember(owner = "client!n", name = "b", descriptor = "Lhj;")
    private static class69 field211 = class181.method1318("red:", (byte) -128);

    @OriginalMember(owner = "client!n", name = "c", descriptor = "Lhj;")
    public static class69 field212 = field211;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "Lhj;")
    public static class69 field213 = field211;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field215 = -1;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field210;

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(II)V")
    public static final void method100(int arg0, int arg1) {
        field216++;
        if (arg1 == -1 || !class223.field4066[arg1]) {
            return;
        }
        class210.field3819.method610(arg1, -1);
        if (class116.field2222[arg1] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class116.field2222[arg1].length; var3++) {
            if (class116.field2222[arg1][var3] != null) {
                if (class116.field2222[arg1][var3].field884 == 2) {
                    var2 = false;
                } else {
                    class116.field2222[arg1][var3] = null;
                }
            }
        }
        if (arg0 != 2893) {
            field211 = null;
        }
        if (var2) {
            class116.field2222[arg1] = null;
        }
        class223.field4066[arg1] = false;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(BLjava/awt/Color;ZILhj;)V")
    public static final void method101(byte arg0, Color arg1, boolean arg2, int arg3, class69 arg4) {
        field210++;
        try {
            Graphics var5 = class212.field3862.getGraphics();
            if (class132.field2451 == null) {
                class132.field2451 = new Font("Helvetica", 1, 13);
                class209.field3798 = class212.field3862.getFontMetrics(class132.field2451);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class66.field1278, class20.field287);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class20.field289 == null) {
                    class20.field289 = class212.field3862.createImage(304, 34);
                }
                if (arg0 >= -60) {
                    method102((byte) -96);
                }
                Graphics var6 = class20.field289.getGraphics();
                var6.setColor(arg1);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect((arg3 * 3) + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class132.field2451);
                var6.setColor(Color.white);
                arg4.method496(var6, 22, 0, (304 - arg4.method458(-39, class209.field3798)) / 2);
                var5.drawImage(class20.field289, class66.field1278 / 2 - 152, class20.field287 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class66.field1278 / 2 - 152;
                int var8 = class20.field287 / 2 - 18;
                var5.setColor(arg1);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var7 + 2, var8 - -2, 300 - (arg3 * 3), 30);
                var5.setFont(class132.field2451);
                var5.setColor(Color.white);
                arg4.method496(var5, var8 + 22, 0, (304 - arg4.method458(-39, class209.field3798)) / 2 + var7);
            }
            if (class242.field4446 != null) {
                var5.setFont(class132.field2451);
                var5.setColor(Color.white);
                class242.field4446.method496(var5, class20.field287 / 2 - 26, 0, class66.field1278 / 2 - class242.field4446.method458(-39, class209.field3798) / 2);
            }
        } catch (Exception var10) {
            class212.field3862.repaint();
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)V")
    public static void method102(byte arg0) {
        field212 = null;
        if (arg0 != -93) {
            method100(54, 27);
        }
        field211 = null;
        field213 = null;
    }
}
