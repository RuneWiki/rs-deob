import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!ra")
public class class35 {

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "Lua;")
    public static class41 field438 = class16.method86("Skirt Shop", true);

    @OriginalMember(owner = "mapview!ra", name = "g", descriptor = "Lua;")
    public static class41 field442 = class16.method86("Dairy Churn", true);

    @OriginalMember(owner = "mapview!ra", name = "h", descriptor = "Lua;")
    public static class41 field443 = class16.method86("Guide", true);

    @OriginalMember(owner = "mapview!ra", name = "i", descriptor = "Lua;")
    public static class41 field444 = class16.method86("Altar", true);

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "J")
    public static long field437;

    @OriginalMember(owner = "mapview!ra", name = "f", descriptor = "J")
    public long field441;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "Lra;")
    public class35 field436;

    @OriginalMember(owner = "mapview!ra", name = "d", descriptor = "Lra;")
    public class35 field439;

    @OriginalMember(owner = "mapview!ra", name = "e", descriptor = "[B")
    public static byte[] field440;

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(ILjava/awt/event/KeyEvent;)I", line = 7)
    public static final int method199(int arg0, KeyEvent arg1) {
        if (arg0 != -21050) {
            field438 = null;
        }
        int var2 = arg1.getKeyChar();
        if (var2 == 8364) {
            return 128;
        } else {
            if (var2 <= 0 || var2 >= 256) {
                var2 = -1;
            }
            return var2;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(I)V", line = 29)
    public final void method200(int arg0) {
        int var2 = 95 % ((arg0 - 54) / 59);
        if (this.field439 != null) {
            this.field439.field436 = this.field436;
            this.field436.field439 = this.field439;
            this.field436 = null;
            this.field439 = null;
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "b", descriptor = "(I)V", line = 70)
    public static final void method201(int arg0) {
        if (class16.field141[0][class8.field91][class16.field143] == null) {
            mapview.field358 = null;
        } else {
            mapview.field358 = class16.field141[0][class8.field91][class16.field143];
        }
        if (class16.field141[1][class8.field91][class16.field143] == null) {
            class17.field146 = null;
        } else {
            class17.field146 = class16.field141[1][class8.field91][class16.field143];
        }
        if (class16.field141[2][class8.field91][class16.field143] == null) {
            class23.field247 = null;
        } else {
            class23.field247 = class16.field141[2][class8.field91][class16.field143];
        }
        int var1 = 25 / ((-arg0 - 21) / 35);
        if (class16.field141[3][class8.field91][class16.field143] == null) {
            field440 = null;
        } else {
            field440 = class16.field141[3][class8.field91][class16.field143];
        }
        if (class16.field141[4][class8.field91][class16.field143] == null) {
            class40.field493 = null;
        } else {
            class40.field493 = class16.field141[4][class8.field91][class16.field143];
        }
        if (class36.field452[class8.field91][class16.field143] == null) {
            class39.field490 = null;
        } else {
            class39.field490 = class36.field452[class8.field91][class16.field143];
        }
        if (class39.field491[class8.field91][class16.field143] == null) {
            class7.field83 = null;
        } else {
            class7.field83 = class39.field491[class8.field91][class16.field143];
        }
        if (class7.field80[class8.field91][class16.field143] == null) {
            class20.field177 = null;
        } else {
            class20.field177 = class7.field80[class8.field91][class16.field143];
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "a", descriptor = "(ZILua;ILjava/awt/Color;)V", line = 138)
    public static final void method202(boolean arg0, int arg1, class41 arg2, int arg3, Color arg4) {
        try {
            Graphics var5 = class40.field497.getGraphics();
            if (class39.field483 == null) {
                class39.field483 = new Font("Helvetica", 1, 13);
                class34.field435 = class40.field497.getFontMetrics(class39.field483);
            }
            if (arg0) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class34.field430, class3.field54);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class21.field205 == null) {
                    class21.field205 = class40.field497.createImage(304, 34);
                }
                Graphics var6 = class21.field205.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var6.setFont(class39.field483);
                var6.setColor(Color.white);
                arg2.method235(var6, (304 - arg2.method227(class34.field435, 0)) / 2, arg1 + 31160, 22);
                var5.drawImage(class21.field205, class34.field430 / 2 - 152, class3.field54 / 2 - 18, null);
                if (arg1 != -10128) {
                    field442 = null;
                }
            } catch (Exception var11) {
                int var8 = class34.field430 / 2 - 152;
                int var9 = class3.field54 / 2 - 18;
                var5.setColor(arg4);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var8 + 2, var9 + 2, 300 - arg3 * 3, 30);
                var5.setFont(class39.field483);
                var5.setColor(Color.white);
                arg2.method235(var5, (304 - arg2.method227(class34.field435, arg1 + 10128)) / 2 + var8, 21032, var9 + 22);
            }
            if (class40.field495 != null) {
                var5.setFont(class39.field483);
                var5.setColor(Color.white);
                class40.field495.method235(var5, class34.field430 / 2 - class40.field495.method227(class34.field435, 0) / 2, arg1 + 31160, class3.field54 / 2 - 26);
            }
        } catch (Exception var12) {
            class40.field497.repaint();
        }
    }

    @OriginalMember(owner = "mapview!ra", name = "c", descriptor = "(I)V", line = 206)
    public static void method203(int arg0) {
        field438 = null;
        field440 = null;
        field443 = null;
        field444 = null;
        if (arg0 <= 41) {
            field444 = null;
        }
        field442 = null;
    }
}
