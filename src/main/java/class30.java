import java.awt.Color;
import java.awt.Component;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("mapview!r")
public abstract class class30 {

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "Lk;")
    public static class21 field363 = class14.method92((byte) 57, "codeversion");

    @OriginalMember(owner = "mapview!r", name = "g", descriptor = "Lk;")
    public static class21 field368 = class14.method92((byte) 57, "Herbalist");

    @OriginalMember(owner = "mapview!r", name = "c", descriptor = "Lk;")
    public static class21 field364 = class14.method92((byte) 57, "Agility Training");

    @OriginalMember(owner = "mapview!r", name = "i", descriptor = "Lk;")
    public static class21 field370 = class14.method92((byte) 57, "null");

    @OriginalMember(owner = "mapview!r", name = "h", descriptor = "Z")
    public static boolean field369 = true;

    @OriginalMember(owner = "mapview!r", name = "f", descriptor = "Lk;")
    public static class21 field367 = class14.method92((byte) 57, "Candle Shop");

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "I")
    public static int field362 = 0;

    @OriginalMember(owner = "mapview!r", name = "e", descriptor = "Lk;")
    public static class21 field366 = class14.method92((byte) 57, "mapscene");

    @OriginalMember(owner = "mapview!r", name = "k", descriptor = "Lk;")
    public static class21 field372 = class14.method92((byte) 57, "Cooking Range");

    @OriginalMember(owner = "mapview!r", name = "m", descriptor = "Lk;")
    public static class21 field374 = class14.method92((byte) 57, "world");

    @OriginalMember(owner = "mapview!r", name = "d", descriptor = "Lk;")
    public static class21 field365 = class14.method92((byte) 57, "Farming shop");

    @OriginalMember(owner = "mapview!r", name = "l", descriptor = "I")
    public static int field373;

    @OriginalMember(owner = "mapview!r", name = "j", descriptor = "Lia;")
    public static class18 field371;

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(II)I", line = 10)
    public static int method181(int arg0, int arg1) {
        return arg0 & arg1;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(BLjava/awt/Component;)V", line = 17)
    public static final void method182(byte arg0, Component arg1) {
        arg1.removeKeyListener(class15.field195);
        if (arg0 <= 83) {
            field369 = true;
        }
        arg1.removeFocusListener(class15.field195);
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(B)V", line = 64)
    public static void method183(byte arg0) {
        field370 = null;
        field366 = null;
        field363 = null;
        field367 = null;
        field371 = null;
        field365 = null;
        field372 = null;
        field364 = null;
        if (arg0 >= -49) {
            method183((byte) 109);
        }
        field374 = null;
        field368 = null;
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(Lk;Ljava/awt/Color;IB)V", line = 140)
    public static final void method184(class21 arg0, Color arg1, int arg2, byte arg3) {
        try {
            Graphics var4 = class28.field348.getGraphics();
            if (class21.field262 == null) {
                class21.field262 = new Font("Helvetica", 1, 13);
                class32.field382 = class28.field348.getFontMetrics(class21.field262);
            }
            if (class10.field156) {
                class10.field156 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, mapview.field14, class33.field396);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            try {
                if (class2.field76 == null) {
                    class2.field76 = class28.field348.createImage(304, 34);
                }
                Graphics var5 = class2.field76.getGraphics();
                var5.setColor(arg1);
                var5.drawRect(0, 0, 303, 33);
                if (arg3 > -43) {
                    return;
                }
                var5.fillRect(2, 2, arg2 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg2 * 3 + 2, 2, 300 - arg2 * 3, 30);
                var5.setFont(class21.field262);
                var5.setColor(Color.white);
                arg0.method130(22, var5, -103, (304 - arg0.method144(class32.field382, 122)) / 2);
                var4.drawImage(class2.field76, mapview.field14 / 2 - 152, class33.field396 / 2 + -18, null);
            } catch (Exception var10) {
                int var7 = mapview.field14 / 2 - 152;
                int var8 = class33.field396 / 2 - 18;
                var4.setColor(arg1);
                var4.drawRect(var7, var8, 303, 33);
                var4.fillRect(var7 + 2, var8 + 2, arg2 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var7 + 1, var8 + 1, 301, 31);
                var4.fillRect(arg2 * 3 + var7 + 2, var8 + 2, 300 - arg2 * 3, 30);
                var4.setFont(class21.field262);
                var4.setColor(Color.white);
                arg0.method130(var8 + 22, var4, -103, var7 + (304 - arg0.method144(class32.field382, -35)) / 2);
            }
        } catch (Exception var11) {
            class28.field348.repaint();
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(IBLm;I)[Lc;", line = 203)
    public static final class5[] method185(int arg0, byte arg1, class25 arg2, int arg3) {
        if (arg1 <= 58) {
            return (class5[]) null;
        } else if (class23.method153(arg3, arg0, 5000, arg2)) {
            return class23.method152((byte) 98);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "mapview!r", name = "a", descriptor = "(III)I")
    public abstract int method68(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "mapview!r", name = "b", descriptor = "(B)V")
    public abstract void method69(byte arg0);
}
