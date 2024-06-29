import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kd")
public abstract class class185 extends class223 {

    @OriginalMember(owner = "client!kd", name = "t", descriptor = "[I")
    public static int[] field2596 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!kd", name = "p", descriptor = "Lbg;")
    public static class324 field2592 = new class324(42, -1);

    @OriginalMember(owner = "client!kd", name = "m", descriptor = "I")
    public int field2589;

    @OriginalMember(owner = "client!kd", name = "n", descriptor = "I")
    public int field2590;

    @OriginalMember(owner = "client!kd", name = "o", descriptor = "I")
    public static int field2591;

    @OriginalMember(owner = "client!kd", name = "q", descriptor = "I")
    public static int field2593;

    @OriginalMember(owner = "client!kd", name = "r", descriptor = "I")
    public static int field2594;

    @OriginalMember(owner = "client!kd", name = "s", descriptor = "I")
    public static int field2595;

    @OriginalMember(owner = "client!kd", name = "l", descriptor = "[I")
    public int[] field2588;

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(II)V", line = 5)
    public static final void method1295(int arg0, int arg1) {
        field2595++;
        if (~arg1 != arg0 && class251.field3693[arg1]) {
            class230.field3365.method2374(-1, arg1);
            class123.field1803[arg1] = null;
            class335.field4671[arg1] = null;
            class251.field3693[arg1] = false;
        }
    }

    @OriginalMember(owner = "client!kd", name = "c", descriptor = "(B)V", line = 24)
    public static void method1296(byte arg0) {
        field2596 = null;
        field2592 = null;
        if (arg0 > -40) {
            method1298(false);
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Ljava/awt/Color;ILjava/awt/Color;Ljava/awt/Color;IZLjava/lang/String;)V", line = 35)
    public static final void method1297(Color arg0, int arg1, Color arg2, Color arg3, int arg4, boolean arg5, String arg6) {
        field2593++;
        try {
            Graphics var7 = class148.field2081.getGraphics();
            if (class193.field2814 == null) {
                class193.field2814 = new Font("Helvetica", 1, 13);
            }
            if (arg5) {
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class94.field1278, class410.field6100);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg0 == null) {
                arg0 = new Color(255, 255, 255);
            }
            try {
                if (class96.field1296 == null) {
                    class96.field1296 = class148.field2081.createImage(304, 34);
                }
                Graphics var8 = class96.field1296.getGraphics();
                var8.setColor(arg2);
                var8.drawRect(0, 0, 303, 33);
                var8.setColor(arg3);
                var8.fillRect(2, 2, arg4 * 3, 30);
                var8.setColor(Color.black);
                var8.drawRect(1, 1, 301, 31);
                var8.fillRect((arg4 * 3) + 2, 2, 300 - (arg4 * 3), 30);
                var8.setFont(class193.field2814);
                if (arg1 < 98) {
                    method1295(-100, -110);
                }
                var8.setColor(arg0);
                var8.drawString(arg6, (304 - arg6.length() * 6) / 2, 22);
                var7.drawImage(class96.field1296, class94.field1278 / 2 - 152, class410.field6100 / 2 + -18, null);
            } catch (Exception var11) {
                int var9 = class94.field1278 / 2 - 152;
                int var10 = class410.field6100 / 2 - 18;
                var7.setColor(arg2);
                var7.drawRect(0, 0, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var9 + 2, var10 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var9 + 1, var10 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + var9 + 2, var10 - -2, 300 - (arg4 * 3), 30);
                var7.setFont(class193.field2814);
                var7.setColor(arg0);
                var7.drawString(arg6, (304 - (arg6.length() * 6)) / 2 + var9, var10 - -22);
            }
            if (class424.field6253 != null) {
                var7.setFont(class193.field2814);
                var7.setColor(arg0);
                var7.drawString(class424.field6253, class94.field1278 / 2 - class424.field6253.length() * 6 / 2, class410.field6100 / 2 + -26);
            }
        } catch (Exception var12) {
            class148.field2081.repaint();
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(Z)V", line = 117)
    public static final void method1298(boolean arg0) {
        if (!arg0) {
            method1297(null, -122, null, null, 2, true, null);
        }
        field2591++;
        if (class520.field7647 == null) {
            return;
        }
        if (class520.field7647.field6617 == 1) {
            class520.field7647 = null;
            return;
        }
        if (class520.field7647.field6617 == 2) {
            class82.method739(class183.field2584, 2, class47.field518, 117);
            class520.field7647 = null;
            return;
        }
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(I)V", line = 153)
    public static final void method1300(int arg0) {
        field2594++;
        int var1 = (int) ((double) class397.field5828 * 34.46D);
        if (arg0 != 17569) {
            method1300(-36);
        }
        int var2 = var1 << 0;
        if (class225.field3300.method356()) {
            var2 += 128;
        }
        class225.field3300.method346(50, var2);
    }

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;BI)V")
    public abstract void method1294(int arg0, int arg1, int arg2, Graphics arg3, byte arg4, int arg5);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(BLjava/awt/Canvas;)V")
    public abstract void method1299(byte arg0, Canvas arg1);

    @OriginalMember(owner = "client!kd", name = "a", descriptor = "(IIILjava/awt/Graphics;)V")
    public abstract void method1301(int arg0, int arg1, int arg2, Graphics arg3);
}
