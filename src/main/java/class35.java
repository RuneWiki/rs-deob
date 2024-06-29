import java.awt.Color;
import java.awt.Font;
import java.awt.FontMetrics;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!s")
public class class35 {

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "Lr;")
    public static class33 field479 = class29.method192("Shield Shop", (byte) 126);

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "Lr;")
    public static class33 field478 = class29.method192("Suchen", (byte) 126);

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "I")
    public static int field476 = 0;

    @OriginalMember(owner = "mapview!s", name = "g", descriptor = "I")
    public static int field482 = -1;

    @OriginalMember(owner = "mapview!s", name = "j", descriptor = "Lr;")
    public static class33 field485 = class29.method192("Sandpit", (byte) 126);

    @OriginalMember(owner = "mapview!s", name = "i", descriptor = "I")
    public static volatile int field484 = 0;

    @OriginalMember(owner = "mapview!s", name = "h", descriptor = "Lma;")
    public static class25 field483 = new class25();

    @OriginalMember(owner = "mapview!s", name = "e", descriptor = "B")
    public byte field480;

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "I")
    public static int field477;

    @OriginalMember(owner = "mapview!s", name = "k", descriptor = "Ljava/awt/FontMetrics;")
    private static FontMetrics field486;

    @OriginalMember(owner = "mapview!s", name = "f", descriptor = "[B")
    public byte[] field481;

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/awt/Color;IBLr;)V", line = 6)
    public static final void method235(Color arg0, int arg1, byte arg2, class33 arg3) {
        try {
            Graphics var4 = class31.field443.getGraphics();
            if (class25.field270 == null) {
                class25.field270 = new Font("Helvetica", 1, 13);
                field486 = class31.field443.getFontMetrics(class25.field270);
            }
            if (class11.field147) {
                class11.field147 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class23.field253, class23.field255);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class29.field424 == null) {
                    class29.field424 = class31.field443.createImage(304, 34);
                }
                Graphics var5 = class29.field424.getGraphics();
                int var6 = 27 / ((arg2 + 46) / 63);
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var5.setFont(class25.field270);
                var5.setColor(Color.white);
                arg3.method232(var5, 22, 0, (304 - arg3.method218(field486, false)) / 2);
                var4.drawImage(class29.field424, class23.field253 / 2 - 152, class23.field255 / 2 - 18, null);
            } catch (Exception var11) {
                int var8 = class23.field253 / 2 - 152;
                int var9 = class23.field255 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var8, var9, 303, 33);
                var4.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var8 + 1, var9 - -1, 301, 31);
                var4.fillRect(var8 + arg1 * 3 + 2, var9 + 2, 300 - arg1 * 3, 30);
                var4.setFont(class25.field270);
                var4.setColor(Color.white);
                arg3.method232(var4, var9 + 22, 0, (304 - arg3.method218(field486, false)) / 2 + var8);
            }
        } catch (Exception var12) {
            class31.field443.repaint();
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(B)V", line = 70)
    public static final void method236(byte arg0) {
        if (class3.field19.toLowerCase().indexOf("microsoft") == -1) {
            class12.field151[92] = 74;
            class12.field151[93] = 43;
            class12.field151[61] = 27;
            class12.field151[45] = 26;
            if (class3.field23 == null) {
                class12.field151[192] = 58;
                class12.field151[222] = 59;
            } else {
                class12.field151[222] = 58;
                class12.field151[192] = 28;
                class12.field151[520] = 59;
            }
            class12.field151[91] = 42;
            class12.field151[59] = 57;
            class12.field151[46] = 72;
            class12.field151[44] = 71;
            class12.field151[47] = 73;
        } else {
            class12.field151[190] = 72;
            class12.field151[191] = 73;
            class12.field151[219] = 42;
            class12.field151[192] = 58;
            class12.field151[223] = 28;
            class12.field151[220] = 74;
            class12.field151[186] = 57;
            class12.field151[221] = 43;
            class12.field151[188] = 71;
            class12.field151[187] = 27;
            class12.field151[222] = 59;
            class12.field151[189] = 26;
        }
        int var1 = -54 / ((-arg0 - 40) / 51);
    }

    @OriginalMember(owner = "mapview!s", name = "b", descriptor = "(B)B", line = 124)
    public static final byte method237(byte arg0) {
        if (arg0 != 10) {
            method242(null, -64, 36);
        }
        return class8.field106 == null ? 0 : class8.field106[class26.field396];
    }

    @OriginalMember(owner = "mapview!s", name = "c", descriptor = "(B)V", line = 150)
    public final void method238(byte arg0) {
        boolean var2 = true;
        if (this.field481 != null) {
            this.field480 = this.field481[0];
            for (int var3 = 0; var3 < 4096; var3++) {
                if (this.field481[var3] != this.field480) {
                    var2 = false;
                    break;
                }
            }
            if (var2) {
                this.field481 = null;
            }
        }
        if (arg0 != 108) {
            method243(40);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Ljava/awt/event/KeyEvent;B)I", line = 189)
    public static final int method239(KeyEvent arg0, byte arg1) {
        if (arg1 != 41) {
            method244(null, null, null, (byte) 5);
        }
        int var2 = arg0.getKeyChar();
        if (var2 <= 0 || var2 >= 256) {
            var2 = -1;
        }
        return var2;
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(ZJ)V", line = 210)
    public static final void method240(boolean arg0, long arg1) {
        if (arg0 || arg1 <= 0L) {
            return;
        }
        if (arg1 % 10L == 0L) {
            class14.method99(arg1 - 1L, 1);
            class14.method99(1L, 1);
        } else {
            class14.method99(arg1, 1);
        }
    }

    @OriginalMember(owner = "mapview!s", name = "d", descriptor = "(B)B", line = 231)
    public static final byte method241(byte arg0) {
        if (arg0 <= 5) {
            field485 = null;
        }
        return class36.field491 == null ? 0 : class36.field491[class26.field396];
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "([BII)I", line = 247)
    public static final int method242(byte[] arg0, int arg1, int arg2) {
        if (arg1 != 0) {
            field486 = null;
        }
        return class14.method95(arg2, arg0, 0, 1);
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(I)V", line = 268)
    public static void method243(int arg0) {
        field486 = null;
        field478 = null;
        field483 = null;
        field479 = null;
        if (arg0 == 0) {
            field485 = null;
        }
    }

    @OriginalMember(owner = "mapview!s", name = "a", descriptor = "(Lr;Lr;Lc;B)Ld;", line = 291)
    public static final class7 method244(class33 arg0, class33 arg1, class5 arg2, byte arg3) {
        int var4 = arg2.method35(false, arg1);
        if (arg3 == 11) {
            int var5 = arg2.method31(arg0, var4, -2);
            return class17.method106(arg2, var5, -116, var4);
        } else {
            return (class7) null;
        }
    }
}
