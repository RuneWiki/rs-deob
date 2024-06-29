import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ka")
public class class441 implements class113 {

    @OriginalMember(owner = "client!ka", name = "h", descriptor = "Lbi;")
    private class449 field6054;

    @OriginalMember(owner = "client!ka", name = "e", descriptor = "Llr;")
    private class703 field6051;

    @OriginalMember(owner = "client!ka", name = "i", descriptor = "F")
    public static float field6055;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "I")
    public static int field6047;

    @OriginalMember(owner = "client!ka", name = "b", descriptor = "I")
    public static int field6048;

    @OriginalMember(owner = "client!ka", name = "c", descriptor = "I")
    public static int field6049;

    @OriginalMember(owner = "client!ka", name = "f", descriptor = "I")
    public static int field6052;

    @OriginalMember(owner = "client!ka", name = "g", descriptor = "I")
    public static int field6053;

    @OriginalMember(owner = "client!ka", name = "j", descriptor = "I")
    public static int field6056;

    @OriginalMember(owner = "client!ka", name = "d", descriptor = "Lxa;")
    private class468 field6050;

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(I)Z", line = 4)
    public final boolean method913(int arg0) {
        field6048++;
        if (arg0 <= 13) {
            field6052 = 87;
        }
        return this.field6054.method2549(this.field6051.field9903, 3015);
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ZI)V", line = 20)
    public final void method912(boolean arg0, int arg1) {
        if (arg0) {
            int var3 = class641.field8619 >= class627.field8461 ? class641.field8619 : class627.field8461;
            int var4 = class149.field2387 <= class305.field4229 ? class305.field4229 : class149.field2387;
            int var5 = this.field6050.method1025();
            int var6 = this.field6050.method1030();
            int var7 = 0;
            int var8 = var3;
            int var9 = var3 * var6 / var5;
            int var10 = (var4 - var9) / 2;
            if (var9 > var4) {
                var10 = 0;
                var8 = var4 * var5 / var6;
                var9 = var4;
                var7 = (var3 - var8) / 2;
            }
            this.field6050.method2641(var7, var10, var8, var9);
        }
        if (arg1 != -20667) {
            field6055 = -0.23831801F;
        }
        field6056++;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(ILjava/lang/String;ILjava/awt/Color;Ljava/awt/Color;Ljava/awt/Color;)V", line = 62)
    public static final void method2497(int arg0, String arg1, int arg2, Color arg3, Color arg4, Color arg5) {
        field6049++;
        if (arg0 != -26) {
            method2498(117, -74, -13);
        }
        try {
            Graphics var6 = class443.field6072.getGraphics();
            if (class36.field552 == null) {
                class36.field552 = new Font("Helvetica", 1, 13);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(255, 255, 255);
            }
            try {
                if (class618.field8200 == null) {
                    class618.field8200 = class443.field6072.createImage(class627.field8461, class149.field2387);
                }
                Graphics var7 = class618.field8200.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class627.field8461, class149.field2387);
                int var8 = class627.field8461 / 2 - 152;
                int var9 = class149.field2387 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg3);
                var7.fillRect(var8 + 2, var9 + 2, arg2 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg2 * 3 + var8 + 2, var9 + 2, 300 - (arg2 * 3), 30);
                var7.setFont(class36.field552);
                var7.setColor(arg4);
                var7.drawString(arg1, (304 - (arg1.length() * 6)) / 2 + var8, var9 + 22);
                if (class335.field4594 != null) {
                    var7.setFont(class36.field552);
                    var7.setColor(arg4);
                    var7.drawString(class335.field4594, class627.field8461 / 2 - (class335.field4594.length() * 6 / 2), class149.field2387 / 2 + -26);
                }
                var6.drawImage(class618.field8200, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class627.field8461, class149.field2387);
                int var10 = class627.field8461 / 2 - 152;
                int var11 = class149.field2387 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg3);
                var6.fillRect(var10 + 2, var11 + 2, arg2 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg2 * 3) + 2, var11 - -2, 300 - (arg2 * 3), 30);
                var6.setFont(class36.field552);
                var6.setColor(arg4);
                if (class335.field4594 != null) {
                    var6.setFont(class36.field552);
                    var6.setColor(arg4);
                    var6.drawString(class335.field4594, class627.field8461 / 2 - class335.field4594.length() * 6 / 2, class149.field2387 / 2 + -26);
                }
                var6.drawString(arg1, var10 + ((304 - (arg1.length() * 6)) / 2), var11 - -22);
            }
        } catch (Exception var13) {
            class443.field6072.repaint();
        }
    }

    @OriginalMember(owner = "client!ka", name = "<init>", descriptor = "(Lbi;Llr;)V", line = 147)
    public class441(class449 arg0, class703 arg1) {
        this.field6054 = arg0;
        this.field6051 = arg1;
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(B)V", line = 156)
    public final void method911(byte arg0) {
        this.field6050 = class429.method2448(this.field6054, 18638, this.field6051.field9903);
        field6053++;
        if (arg0 != -13) {
            field6052 = 109;
        }
    }

    @OriginalMember(owner = "client!ka", name = "a", descriptor = "(III)Z", line = 169)
    public static final boolean method2498(int arg0, int arg1, int arg2) {
        if (arg1 != 17) {
            method2497(-16, null, 112, null, null, null);
        }
        field6047++;
        return (arg2 & 0x18) != 0 | (arg2 & 0x220) == 544;
    }
}
