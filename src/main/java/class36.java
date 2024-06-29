import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!t")
public class class36 extends class6 {

    @OriginalMember(owner = "mapview!t", name = "r", descriptor = "[J")
    private long[] field497 = new long[10];

    @OriginalMember(owner = "mapview!t", name = "t", descriptor = "I")
    private int field499 = 256;

    @OriginalMember(owner = "mapview!t", name = "l", descriptor = "I")
    private int field491 = 1;

    @OriginalMember(owner = "mapview!t", name = "u", descriptor = "I")
    private int field500 = 0;

    @OriginalMember(owner = "mapview!t", name = "q", descriptor = "J")
    private long field496 = class22.method115((byte) 80);

    @OriginalMember(owner = "mapview!t", name = "m", descriptor = "Ls;")
    public static class34 field492 = class9.method35("Fur Trader", 220);

    @OriginalMember(owner = "mapview!t", name = "n", descriptor = "Ls;")
    public static class34 field493 = class9.method35("labels)3dat", 220);

    @OriginalMember(owner = "mapview!t", name = "o", descriptor = "Ls;")
    public static class34 field494 = class9.method35("Shield Shop", 220);

    @OriginalMember(owner = "mapview!t", name = "s", descriptor = "Ls;")
    public static class34 field498 = class9.method35("Loading", 220);

    @OriginalMember(owner = "mapview!t", name = "w", descriptor = "I")
    public static int field502 = -1;

    @OriginalMember(owner = "mapview!t", name = "v", descriptor = "I")
    public static int field501 = -1;

    @OriginalMember(owner = "mapview!t", name = "p", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "mapview!t", name = "b", descriptor = "(I)V", line = 18)
    public static void method248(int arg0) {
        int var1 = 27 / ((arg0 + 43) / 52);
        field498 = null;
        field493 = null;
        field492 = null;
        field494 = null;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(III)I", line = 35)
    public final int method18(int arg0, int arg1, int arg2) {
        int var4 = this.field499;
        int var5 = this.field491;
        this.field491 = 1;
        this.field499 = 300;
        this.field496 = class22.method115((byte) 127);
        if (this.field497[this.field495] == 0L) {
            this.field491 = var5;
            this.field499 = var4;
        } else if (this.field496 > this.field497[this.field495]) {
            this.field499 = (int) ((long) (arg2 * 2560) / (this.field496 - this.field497[this.field495]));
        }
        if (this.field499 < 25) {
            this.field499 = 25;
        }
        if (this.field499 > 256) {
            this.field499 = 256;
            this.field491 = (int) ((long) arg2 - (this.field496 - this.field497[this.field495]) / 10L);
        }
        if (arg2 < this.field491) {
            this.field491 = arg2;
        }
        this.field497[this.field495] = this.field496;
        this.field495 = (this.field495 + 1) % 10;
        if (this.field491 > 1) {
            for (int var6 = 0; var6 < 10; var6++) {
                if (this.field497[var6] != 0L) {
                    this.field497[var6] += this.field491;
                }
            }
        }
        int var7 = 0;
        if (this.field491 < arg0) {
            this.field491 = arg0;
        }
        class26.method164((long) this.field491, (byte) 2);
        while (this.field500 < 256) {
            var7++;
            this.field500 += this.field499;
        }
        this.field500 &= 0xFF;
        if (arg1 != 1000) {
            method248(-41);
        }
        return var7;
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/Component;I)V", line = 108)
    public static final void method249(Component arg0, int arg1) {
        arg0.removeKeyListener(class6.field39);
        arg0.removeFocusListener(class6.field39);
        class3.field26 = -1;
        if (arg1 >= -79) {
            field493 = null;
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(B)B", line = 126)
    public static final byte method250(byte arg0) {
        if (arg0 >= -122) {
            return -10;
        } else if (class25.field256 == null) {
            return 0;
        } else {
            return class25.field256[class31.field433];
        }
    }

    @OriginalMember(owner = "mapview!t", name = "a", descriptor = "(Ljava/awt/Color;Ls;II)V", line = 147)
    public static final void method251(Color arg0, class34 arg1, int arg2, int arg3) {
        try {
            Graphics var4 = class9.field80.getGraphics();
            if (class34.field480 == null) {
                class34.field480 = new Font("Helvetica", 1, 13);
                class26.field365 = class9.field80.getFontMetrics(class34.field480);
            }
            if (class24.field239) {
                class24.field239 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class38.field510, class25.field261);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class10.field103 == null) {
                    class10.field103 = class9.field80.createImage(304, 34);
                }
                Graphics var5 = class10.field103.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                if (arg2 != 29918) {
                    method249(null, -6);
                }
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class34.field480);
                var5.setColor(Color.white);
                arg1.method232((304 - arg1.method230(class26.field365, 0)) / 2, 22, var5, 48);
                var4.drawImage(class10.field103, class38.field510 / 2 - 152, class25.field261 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class38.field510 / 2 - 152;
                int var8 = class25.field261 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 - -2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class34.field480);
                var4.setColor(Color.white);
                arg1.method232((304 - arg1.method230(class26.field365, 0)) / 2 + var7, var8 + 22, var4, 56);
            }
        } catch (Exception var11) {
            class9.field80.repaint();
        }
    }

    @OriginalMember(owner = "mapview!t", name = "<init>", descriptor = "()V", line = 234)
    public class36() {
        for (int var1 = 0; var1 < 10; var1++) {
            this.field497[var1] = this.field496;
        }
    }
}
