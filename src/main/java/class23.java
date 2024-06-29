import java.awt.Canvas;
import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!la")
public class class23 extends Canvas {

    @OriginalMember(owner = "mapview!la", name = "d", descriptor = "Ljava/awt/Component;")
    private Component field255;

    @OriginalMember(owner = "mapview!la", name = "e", descriptor = "Lta;")
    public static class37 field256 = class20.method87(-89, "Water Source");

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "[J")
    public static long[] field252 = new long[32];

    @OriginalMember(owner = "mapview!la", name = "c", descriptor = "Lta;")
    public static class37 field254 = class20.method87(-107, "Jewellery");

    @OriginalMember(owner = "mapview!la", name = "f", descriptor = "Lta;")
    public static class37 field257 = class20.method87(-126, "Magic Shop");

    @OriginalMember(owner = "mapview!la", name = "b", descriptor = "Lta;")
    public static class37 field253 = class20.method87(-115, "labels)3dat");

    @OriginalMember(owner = "mapview!la", name = "g", descriptor = "I")
    public static int field258 = 0;

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(ILjava/awt/Color;ZLta;)V", line = 7)
    public static final void method115(int arg0, Color arg1, boolean arg2, class37 arg3) {
        try {
            Graphics var4 = mapview.field320.getGraphics();
            if (class2.field15 == null) {
                class2.field15 = new Font("Helvetica", 1, 13);
                class15.field167 = mapview.field320.getFontMetrics(class2.field15);
            }
            if (class14.field155) {
                class14.field155 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class25.field312, class26.field428);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (arg2) {
                    field257 = null;
                }
                if (class25.field315 == null) {
                    class25.field315 = mapview.field320.createImage(304, 34);
                }
                Graphics var5 = class25.field315.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class2.field15);
                var5.setColor(Color.white);
                arg3.method227(22, (304 - arg3.method230(class15.field167, -4607)) / 2, var5, (byte) -121);
                var4.drawImage(class25.field315, class25.field312 / 2 - 152, class26.field428 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class25.field312 / 2 - 152;
                int var8 = class26.field428 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 - -1, 301, 31);
                var4.fillRect(arg0 * 3 + var7 + 2, var8 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class2.field15);
                var4.setColor(Color.white);
                arg3.method227(var8 + 22, (304 - arg3.method230(class15.field167, -4607)) / 2 + var7, var4, (byte) -125);
            }
        } catch (Exception var11) {
            mapview.field320.repaint();
        }
    }

    @OriginalMember(owner = "mapview!la", name = "paint", descriptor = "(Ljava/awt/Graphics;)V", line = 72)
    public final void paint(Graphics arg0) {
        this.field255.paint(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Z)V", line = 82)
    public static void method116(boolean arg0) {
        field256 = null;
        field257 = null;
        field254 = null;
        field253 = null;
        field252 = null;
        if (arg0) {
            field253 = null;
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(II[BI)I", line = 100)
    public static final int method117(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg3 != 8071) {
            return 80;
        }
        int var4 = -1;
        for (int var5 = arg1; var5 < arg0; var5++) {
            var4 = class1.field1[(var4 ^ arg2[var5]) & 0xFF] ^ var4 >>> 8;
        }
        return ~var4;
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 122)
    public static final void method118(Component arg0, int arg1) {
        arg0.addMouseListener(class12.field140);
        arg0.addMouseMotionListener(class12.field140);
        if (arg1 < -61) {
            arg0.addFocusListener(class12.field140);
        }
    }

    @OriginalMember(owner = "mapview!la", name = "a", descriptor = "(I)[Lra;", line = 155)
    public static final class34[] method119(int arg0) {
        class34[] var1 = new class34[class2.field19];
        for (int var2 = 0; var2 < class2.field19; var2++) {
            class34 var3 = new class34();
            var3.field473 = class8.field91;
            var3.field468 = class4.field48;
            var3.field469 = class37.field507[var2];
            var3.field470 = class11.field121[var2];
            var3.field474 = class12.field138[var2];
            var3.field467 = class20.field231[var2];
            var3.field471 = class7.field78;
            var3.field472 = class38.field517[var2];
            var1[var2] = var3;
        }
        if (arg0 != -18) {
            method116(false);
        }
        class33.method193((byte) -121);
        return var1;
    }

    @OriginalMember(owner = "mapview!la", name = "update", descriptor = "(Ljava/awt/Graphics;)V", line = 192)
    public final void update(Graphics arg0) {
        this.field255.update(arg0);
    }

    @OriginalMember(owner = "mapview!la", name = "<init>", descriptor = "(Ljava/awt/Component;)V", line = 197)
    public class23(Component arg0) {
        this.field255 = arg0;
    }
}
