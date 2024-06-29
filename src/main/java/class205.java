import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wf")
public class class205 {

    @OriginalMember(owner = "client!wf", name = "j", descriptor = "Z")
    public boolean field3076 = true;

    @OriginalMember(owner = "client!wf", name = "i", descriptor = "I")
    public int field3075;

    @OriginalMember(owner = "client!wf", name = "d", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!wf", name = "m", descriptor = "I")
    public int field3079;

    @OriginalMember(owner = "client!wf", name = "n", descriptor = "I")
    public int field3080;

    @OriginalMember(owner = "client!wf", name = "f", descriptor = "I")
    public int field3072;

    @OriginalMember(owner = "client!wf", name = "c", descriptor = "I")
    public int field3069;

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "[I")
    public static int[] field3068 = new int[2048];

    @OriginalMember(owner = "client!wf", name = "l", descriptor = "I")
    public static int field3078 = 0;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!wf", name = "e", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!wf", name = "h", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!wf", name = "k", descriptor = "I")
    public static int field3077;

    @OriginalMember(owner = "client!wf", name = "g", descriptor = "Ljava/awt/FontMetrics;")
    public static FontMetrics field3073;

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(I)V")
    public static final void method1357(int arg0) {
        field3071++;
        int var1 = 0;
        if (arg0 != 1) {
            method1359(false, -33, (String) null, 23, (Color) null);
        }
        while (var1 < 100) {
            class17.field315[var1] = true;
            var1++;
        }
    }

    @OriginalMember(owner = "client!wf", name = "b", descriptor = "(I)V")
    public static final void method1358(int arg0) {
        field3077++;
        if (class156.field2281 != null) {
            class156 var1 = class156.field2281;
            synchronized (class156.field2281) {
                class156.field2281 = null;
            }
        }
        if (arg0 != 34) {
            field3078 = 119;
        }
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(ZILjava/lang/String;ILjava/awt/Color;)V")
    public static final void method1359(boolean arg0, int arg1, String arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class297.field4569.getGraphics();
            if (class141.field2032 == null) {
                class141.field2032 = new Font("Helvetica", 1, 13);
                field3073 = class297.field4569.getFontMetrics(class141.field2032);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class126.field1854, class85.field1311);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class189.field2847 == null) {
                    class189.field2847 = class297.field4569.createImage(304, 34);
                }
                Graphics var6 = class189.field2847.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class141.field2032);
                var6.setColor(Color.white);
                var6.drawString(arg2, (304 - field3073.stringWidth(arg2)) / 2, 22);
                var5.drawImage(class189.field2847, class126.field1854 / 2 - 152, class85.field1311 / 2 - 18, (ImageObserver) null);
            } catch (Exception var10) {
                int var7 = class126.field1854 / 2 - 152;
                int var8 = class85.field1311 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var7 + 2, var8 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class141.field2032);
                var5.setColor(Color.white);
                var5.drawString(arg2, var7 + ((304 - field3073.stringWidth(arg2)) / 2), var8 - -22);
            }
            if (class47.field799 != null) {
                var5.setFont(class141.field2032);
                var5.setColor(Color.white);
                var5.drawString(class47.field799, class126.field1854 / 2 - field3073.stringWidth(class47.field799) / 2, class85.field1311 / 2 + -26);
            }
        } catch (Exception var11) {
            class297.field4569.repaint();
        }
        int var9 = -74 % ((27 - arg3) / 33);
        field3067++;
    }

    @OriginalMember(owner = "client!wf", name = "a", descriptor = "(B)V")
    public static void method1360(byte arg0) {
        if (arg0 > -34) {
            method1357(32);
        }
        field3068 = null;
        field3073 = null;
    }

    @OriginalMember(owner = "client!wf", name = "<init>", descriptor = "(IIIIIIZ)V")
    public class205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field3075 = arg0;
        this.field3076 = arg6;
        this.field3070 = arg2;
        this.field3079 = arg3;
        this.field3080 = arg4;
        this.field3072 = arg1;
        this.field3069 = arg5;
    }
}
