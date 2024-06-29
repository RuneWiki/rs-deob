import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!aa")
public class class2 {

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "Ld;")
    public static class7 field10 = class37.method242("Prev page", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "d", descriptor = "[[[[B")
    public static byte[][][][] field12 = new byte[5][][][];

    @OriginalMember(owner = "mapview!aa", name = "c", descriptor = "Ld;")
    public static class7 field11 = class37.method242("mapscene", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "h", descriptor = "I")
    public static int field16 = 1;

    @OriginalMember(owner = "mapview!aa", name = "i", descriptor = "Ld;")
    public static class7 field17 = class37.method242("Find", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "e", descriptor = "Ld;")
    public static class7 field13 = class37.method242("Bank", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "k", descriptor = "Ld;")
    public static class7 field19 = class37.method242("Axe Shop", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "l", descriptor = "Ld;")
    public static class7 field20 = class37.method242("Short)2cut", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "n", descriptor = "Ld;")
    public static class7 field22 = class37.method242(" )2 ", 1333943984);

    @OriginalMember(owner = "mapview!aa", name = "f", descriptor = "I")
    public static int field14;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "I")
    public static int field9;

    @OriginalMember(owner = "mapview!aa", name = "g", descriptor = "Lna;")
    public static class27 field15;

    @OriginalMember(owner = "mapview!aa", name = "j", descriptor = "Ljava/awt/Image;")
    private static Image field18;

    @OriginalMember(owner = "mapview!aa", name = "m", descriptor = "[B")
    public static byte[] field21;

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(Ld;ZLjava/awt/Color;I)V", line = 35)
    public static final void method17(class7 arg0, boolean arg1, Color arg2, int arg3) {
        try {
            Graphics var4 = class20.field190.getGraphics();
            if (class25.field239 == null) {
                class25.field239 = new Font("Helvetica", 1, 13);
                class28.field418 = class20.field190.getFontMetrics(class25.field239);
            }
            if (class28.field397) {
                class28.field397 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class15.field157, class29.field427);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (field18 == null) {
                    field18 = class20.field190.createImage(304, 34);
                }
                Graphics var5 = field18.getGraphics();
                var5.setColor(arg2);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                if (!arg1) {
                    field11 = null;
                }
                var5.fillRect(arg3 * 3 + 2, 2, 300 - arg3 * 3, 30);
                var5.setFont(class25.field239);
                var5.setColor(Color.white);
                arg0.method71((304 - arg0.method77(-121, class28.field418)) / 2, var5, 22, 0);
                var4.drawImage(field18, class15.field157 / 2 - 152, class29.field427 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = class15.field157 / 2 - 152;
                int var8 = class29.field427 / 2 - 18;
                var4.setColor(arg2);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 - -1, 301, 31);
                var4.fillRect(arg3 * 3 + var7 + 2, var8 + 2, 300 - arg3 * 3, 30);
                var4.setFont(class25.field239);
                var4.setColor(Color.white);
                arg0.method71((304 - arg0.method77(-115, class28.field418)) / 2 + var7, var4, var8 + 22, 0);
            }
        } catch (Exception var11) {
            class20.field190.repaint();
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(IB)[B", line = 104)
    public static final synchronized byte[] method18(int arg0, byte arg1) {
        if (arg0 == 100 && class3.field30 > 0) {
            byte[] var2 = class34.field484[--class3.field30];
            class34.field484[class3.field30] = null;
            return var2;
        } else if (arg1 >= -35) {
            return (byte[]) null;
        } else if (arg0 == 5000 && class7.field84 > 0) {
            byte[] var3 = class14.field134[--class7.field84];
            class14.field134[class7.field84] = null;
            return var3;
        } else if (arg0 == 30000 && class28.field411 > 0) {
            byte[] var4 = class11.field118[--class28.field411];
            class11.field118[class28.field411] = null;
            return var4;
        } else {
            return new byte[arg0];
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(BLba;Ld;Ld;)Ln;", line = 145)
    public static final class26 method19(byte arg0, class4 arg1, class7 arg2, class7 arg3) {
        if (arg0 > -8) {
            return (class26) null;
        } else {
            int var4 = arg1.method27(false, arg2);
            int var5 = arg1.method25((byte) -30, var4, arg3);
            return class21.method141(var5, arg1, -23610, var4);
        }
    }

    @OriginalMember(owner = "mapview!aa", name = "a", descriptor = "(B)V", line = 161)
    public static void method20(byte arg0) {
        field18 = null;
        int var1 = 22 / ((arg0 + 15) / 61);
        field22 = null;
        field17 = null;
        field13 = null;
        field20 = null;
        field10 = null;
        field21 = null;
        field15 = null;
        field12 = null;
        field19 = null;
        field11 = null;
    }

    @OriginalMember(owner = "mapview!aa", name = "b", descriptor = "(B)Ln;", line = 204)
    public static final class26 method21(byte arg0) {
        if (arg0 < 56) {
            field14 = 36;
        }
        class26 var1 = new class26(class7.field81, class32.field467, class14.field139, class25.field242, class4.field56);
        class31.method216(71);
        return var1;
    }
}
