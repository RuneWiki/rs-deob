import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import java.util.zip.Inflater;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class114 {

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "Lqf;")
    public static class117 field2694 = class72.method514(99, "::fpson");

    @OriginalMember(owner = "client!qc", name = "p", descriptor = "I")
    public static int field2706 = 0;

    @OriginalMember(owner = "client!qc", name = "o", descriptor = "Lqf;")
    private static class117 field2705 = class72.method514(125, "Please wait 5 minutes before trying again)3");

    @OriginalMember(owner = "client!qc", name = "q", descriptor = "Lqf;")
    public static class117 field2707 = class72.method514(109, "backbase2");

    @OriginalMember(owner = "client!qc", name = "k", descriptor = "Lqf;")
    public static class117 field2701 = class72.method514(101, "m-Ochte sich mit Ihnen duellieren)3");

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "Lqf;")
    public static class117 field2691 = field2705;

    @OriginalMember(owner = "client!qc", name = "j", descriptor = "Lqf;")
    private static class117 field2700 = class72.method514(109, "Enter your username (V password)3");

    @OriginalMember(owner = "client!qc", name = "n", descriptor = "Lqf;")
    public static class117 field2704 = field2700;

    @OriginalMember(owner = "client!qc", name = "r", descriptor = "Lqf;")
    public static class117 field2708 = class72.method514(98, "null");

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "I")
    public static int field2695;

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "I")
    public static int field2696;

    @OriginalMember(owner = "client!qc", name = "g", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!qc", name = "h", descriptor = "I")
    public static int field2698;

    @OriginalMember(owner = "client!qc", name = "i", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!qc", name = "l", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!qc", name = "m", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!qc", name = "s", descriptor = "I")
    public static int field2709;

    @OriginalMember(owner = "client!qc", name = "t", descriptor = "I")
    public static int field2710;

    @OriginalMember(owner = "client!qc", name = "u", descriptor = "I")
    public static int field2711;

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "Ljava/util/zip/Inflater;")
    private Inflater field2692;

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(BII)I")
    public static final int method884(byte arg0, int arg1, int arg2) {
        field2699++;
        if (arg0 != -93) {
            field2701 = null;
        }
        class78 var3 = (class78) client.field395.method1221(35, (long) arg1);
        if (var3 == null) {
            return 0;
        } else if (arg2 == -1) {
            return 0;
        } else {
            int var4 = 0;
            for (int var5 = 0; var5 < var3.field1757.length; var5++) {
                if (var3.field1762[var5] == arg2) {
                    var4 += var3.field1757[var5];
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V")
    public class114() {
        this(-1, 1000000, 1000000);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z)V")
    public static void method885(boolean arg0) {
        field2691 = null;
        field2707 = null;
        field2708 = null;
        field2694 = null;
        field2704 = null;
        if (arg0) {
            method891(66, 65, -90, 106);
        }
        field2705 = null;
        field2700 = null;
        field2701 = null;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lla;Z[B)V")
    public final void method886(class77 arg0, boolean arg1, byte[] arg2) {
        field2703++;
        if (arg0.field1748[arg0.field1691] != 31 || arg0.field1748[arg0.field1691 + 1] != -117) {
            throw new RuntimeException("Invalid GZIP header!");
        }
        if (this.field2692 == null) {
            this.field2692 = new Inflater(true);
        }
        try {
            this.field2692.setInput(arg0.field1748, arg0.field1691 + 10, -arg0.field1691 - 8 + arg0.field1748.length + -10);
            this.field2692.inflate(arg2);
            if (arg1) {
                this.method886(null, true, null);
            }
        } catch (Exception var4) {
            this.field2692.reset();
            throw new RuntimeException("Invalid GZIP compressed data!");
        }
        this.field2692.reset();
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IBII)I")
    public static final int method887(int arg0, byte arg1, int arg2, int arg3) {
        field2697++;
        int var4 = -109 / ((arg1 + 31) / 51);
        if ((class73.field1606[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class73.field1606[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "([Lqf;III)Lqf;")
    public static final class117 method888(class117[] arg0, int arg1, int arg2, int arg3) {
        field2698++;
        int var4 = 0;
        for (int var5 = 0; var5 < arg3; var5++) {
            if (arg0[arg1 + var5] == null) {
                arg0[arg1 + var5] = class143.field3500;
            }
            var4 += arg0[arg1 + var5].field2799;
        }
        if (arg2 != 1) {
            field2705 = null;
        }
        byte[] var6 = new byte[var4];
        int var7 = 0;
        for (int var8 = 0; var8 < arg3; var8++) {
            class117 var10 = arg0[arg1 + var8];
            class109.method822(var10.field2800, 0, var6, var7, var10.field2799);
            var7 += var10.field2799;
        }
        class117 var9 = new class117();
        var9.field2799 = var4;
        var9.field2800 = var6;
        return var9;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(II)Lqf;")
    public static final class117 method889(int arg0, int arg1) {
        field2693++;
        if (arg1 < 100000) {
            return class73.method530((byte) -83, new class117[] { class149.field3712, class79.method614(15591, arg1), class96.field2341 });
        } else if (arg0 > -88) {
            return null;
        } else if (arg1 < 10000000) {
            return class73.method530((byte) -83, new class117[] { class47.field952, class79.method614(15591, arg1 / 1000), class22.field406, class96.field2341 });
        } else {
            return class73.method530((byte) -83, new class117[] { class22.field409, class79.method614(15591, arg1 / 1000000), class117.field2814, class96.field2341 });
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZIZZZ)Lha;")
    public static final class50 method890(boolean arg0, int arg1, boolean arg2, boolean arg3, boolean arg4) {
        field2695++;
        class16 var5 = null;
        if (class70.field1490 != null) {
            var5 = new class16(arg1, class70.field1490, class135.field3233[arg1], 1000000);
        }
        return arg0 ? null : new class50(var5, class15.field215, arg1, arg2, arg3, arg4);
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(IIII)V")
    public static final void method891(int arg0, int arg1, int arg2, int arg3) {
        field2710++;
        int var4 = 0;
        if (arg0 > -31) {
            method888(null, 74, 95, 7);
        }
        while (var4 < 8) {
            for (int var7 = 0; var7 < 8; var7++) {
                class64.field1306[arg3][arg2 + var4][arg1 + var7] = 0;
            }
            var4++;
        }
        if (arg2 > 0) {
            for (int var5 = 1; var5 < 8; var5++) {
                class64.field1306[arg3][arg2][arg1 + var5] = class64.field1306[arg3][arg2 - 1][arg1 + var5];
            }
        }
        if (arg1 > 0) {
            for (int var6 = 1; var6 < 8; var6++) {
                class64.field1306[arg3][arg2 + var6][arg1] = class64.field1306[arg3][arg2 + var6][arg1 - 1];
            }
        }
        if (arg2 > 0 && class64.field1306[arg3][arg2 - 1][arg1] != 0) {
            class64.field1306[arg3][arg2][arg1] = class64.field1306[arg3][arg2 - 1][arg1];
        } else if (arg1 > 0 && class64.field1306[arg3][arg2][arg1 - 1] != 0) {
            class64.field1306[arg3][arg2][arg1] = class64.field1306[arg3][arg2][arg1 - 1];
        } else if (arg2 > 0 && arg1 > 0 && class64.field1306[arg3][arg2 - 1][arg1 - 1] != 0) {
            class64.field1306[arg3][arg2][arg1] = class64.field1306[arg3][arg2 - 1][arg1 - 1];
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Ljava/awt/Color;IILqf;)V")
    public static final void method892(Color arg0, int arg1, int arg2, class117 arg3) {
        try {
            Graphics var4 = class3.field64.getGraphics();
            if (class69.field1459 == null) {
                class69.field1459 = new Font("Helvetica", 1, 13);
                class45.field880 = class3.field64.getFontMetrics(class69.field1459);
            }
            if (class42.field823) {
                class42.field823 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class141.field3348, class28.field562);
            }
            if (arg0 == null) {
                arg0 = new Color(140, 17, 17);
            }
            try {
                if (class55.field1138 == null) {
                    class55.field1138 = class3.field64.createImage(304, 34);
                }
                Graphics var5 = class55.field1138.getGraphics();
                var5.setColor(arg0);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg2 * 3, 30);
                if (arg1 != -11736) {
                    method891(-7, 35, 80, 8);
                }
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class69.field1459);
                var5.setColor(Color.white);
                arg3.method944(-90, (304 - arg3.method936(class45.field880, true)) / 2, 22, var5);
                var4.drawImage(class55.field1138, class141.field3348 / 2 - 152, class28.field562 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class141.field3348 / 2 - 152;
                int var7 = class28.field562 / 2 - 18;
                var4.setColor(arg0);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 - -2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(var6 + arg2 * 3 + 2, var7 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class69.field1459);
                var4.setColor(Color.white);
                arg3.method944(-118, (304 - arg3.method936(class45.field880, true)) / 2 + var6, var7 + 22, var4);
            }
        } catch (Exception var9) {
            class3.field64.repaint();
        }
        field2702++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "(III)V")
    private class114(int arg0, int arg1, int arg2) {
    }
}
