import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class15 {

    @OriginalMember(owner = "client!c", name = "i", descriptor = "Loa;")
    public static class98 field309 = class38.method349(255, "(U");

    @OriginalMember(owner = "client!c", name = "o", descriptor = "I")
    public static int field315 = 0;

    @OriginalMember(owner = "client!c", name = "c", descriptor = "Loa;")
    public static class98 field303 = class38.method349(255, "sl_back");

    @OriginalMember(owner = "client!c", name = "h", descriptor = "I")
    public static int field308 = -1;

    @OriginalMember(owner = "client!c", name = "p", descriptor = "Loa;")
    public static class98 field316 = class38.method349(255, "Mitteilung");

    @OriginalMember(owner = "client!c", name = "m", descriptor = "Loa;")
    public static class98 field313 = class38.method349(255, ")4l");

    @OriginalMember(owner = "client!c", name = "r", descriptor = "[I")
    public static int[] field318 = new int[50];

    @OriginalMember(owner = "client!c", name = "q", descriptor = "I")
    public static int field317 = -1;

    @OriginalMember(owner = "client!c", name = "s", descriptor = "I")
    public static int field319 = 0;

    @OriginalMember(owner = "client!c", name = "f", descriptor = "Z")
    public static boolean field306 = false;

    @OriginalMember(owner = "client!c", name = "u", descriptor = "Loa;")
    private static class98 field321 = class38.method349(255, "Too many incorrect logins from your address)3");

    @OriginalMember(owner = "client!c", name = "d", descriptor = "Loa;")
    public static class98 field304 = field321;

    @OriginalMember(owner = "client!c", name = "b", descriptor = "I")
    public static int field302;

    @OriginalMember(owner = "client!c", name = "g", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!c", name = "k", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!c", name = "l", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!c", name = "n", descriptor = "I")
    public static int field314;

    @OriginalMember(owner = "client!c", name = "t", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "Loc;")
    public static class100 field301;

    @OriginalMember(owner = "client!c", name = "e", descriptor = "Lkd;")
    public static class73 field305;

    @OriginalMember(owner = "client!c", name = "j", descriptor = "Lkd;")
    public static class73 field310;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(II)Lke;")
    public static final class74 method152(int arg0, int arg1) {
        class74 var2 = (class74) class97.field2236.method730((byte) 35, (long) arg1);
        field312++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class108.field2445.method1058(10, -90, arg1);
        class74 var4 = new class74();
        if (arg0 != 30) {
            return null;
        }
        var4.field1548 = arg1;
        if (var3 != null) {
            var4.method603(-9483, new class8(var3));
        }
        var4.method611((byte) -19);
        if (var4.field1588 != -1) {
            var4.method606(method152(30, var4.field1601), method152(arg0, var4.field1588), arg0 ^ 0x7C);
        }
        if (!class129.field2964 && var4.field1565) {
            var4.field1570 = null;
            var4.field1567 = class134.field3255;
            var4.field1583 = 0;
            var4.field1575 = null;
        }
        class97.field2236.method732(-1, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(III)Loa;")
    public static final class98 method153(int arg0, int arg1, int arg2) {
        int var3 = arg2 - arg1;
        field302++;
        if (var3 < -9) {
            return class48.field1088;
        } else if (arg0 < ~var3) {
            return class32.field783;
        } else if (var3 < -3) {
            return class149.field3686;
        } else if (var3 < 0) {
            return class141.field3446;
        } else if (var3 > 9) {
            return class58.field1296;
        } else if (var3 > 6) {
            return class79.field1731;
        } else if (var3 > 3) {
            return class84.field1958;
        } else if (var3 > 0) {
            return class119.field2678;
        } else {
            return class58.field1288;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Z)V")
    public static void method154(boolean arg0) {
        field316 = null;
        field310 = null;
        field309 = null;
        field313 = null;
        field301 = null;
        field321 = null;
        if (!arg0) {
            field301 = null;
        }
        field305 = null;
        field303 = null;
        field318 = null;
        field304 = null;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILjava/awt/Color;Loa;I)V")
    public static final void method155(int arg0, Color arg1, class98 arg2, int arg3) {
        field307++;
        try {
            Graphics var4 = class73.field1506.getGraphics();
            if (class36.field898 == null) {
                class36.field898 = new Font("Helvetica", 1, 13);
                class123.field2730 = class73.field1506.getFontMetrics(class36.field898);
            }
            if (class97.field2220) {
                class97.field2220 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class36.field891, class30.field700);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class90.field2069 == null) {
                    class90.field2069 = class73.field1506.createImage(304, 34);
                }
                Graphics var5 = class90.field2069.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg0 * arg3, 30);
                var5.setFont(class36.field898);
                var5.setColor(Color.white);
                arg2.method796(22, (byte) 38, (304 - arg2.method819(45, class123.field2730)) / 2, var5);
                var4.drawImage(class90.field2069, class36.field891 / 2 - 152, class30.field700 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class36.field891 / 2 - 152;
                int var7 = class30.field700 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg3 * 3 + var6 + 2, var7 - -2, 300 - arg3 * 3, 30);
                var4.setFont(class36.field898);
                var4.setColor(Color.white);
                arg2.method796(var7 + 22, (byte) 38, (304 - arg2.method819(71, class123.field2730)) / 2 + var6, var4);
            }
        } catch (Exception var9) {
            class73.field1506.repaint();
        }
    }
}
