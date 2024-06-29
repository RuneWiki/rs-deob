import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jg")
public class class94 {

    @OriginalMember(owner = "client!jg", name = "e", descriptor = "I")
    public static int field1714 = 0;

    @OriginalMember(owner = "client!jg", name = "h", descriptor = "Lrh;")
    public static class167 field1717 = null;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "[I")
    public static int[] field1710 = new int[2000];

    @OriginalMember(owner = "client!jg", name = "k", descriptor = "Ltg;")
    private static class184 field1720 = class135.method812("Unable to connect)3", 3);

    @OriginalMember(owner = "client!jg", name = "b", descriptor = "Ltg;")
    public static class184 field1711 = field1720;

    @OriginalMember(owner = "client!jg", name = "d", descriptor = "Ltg;")
    public static class184 field1713 = field1720;

    @OriginalMember(owner = "client!jg", name = "c", descriptor = "I")
    public static int field1712;

    @OriginalMember(owner = "client!jg", name = "f", descriptor = "I")
    public static int field1715;

    @OriginalMember(owner = "client!jg", name = "g", descriptor = "I")
    public static int field1716;

    @OriginalMember(owner = "client!jg", name = "i", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!jg", name = "j", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(IILtg;Ljava/awt/Color;)V")
    public static final void method540(int arg0, int arg1, class184 arg2, Color arg3) {
        field1716++;
        try {
            Graphics var4 = class129.field2344.getGraphics();
            if (class60.field1112 == null) {
                class60.field1112 = new Font("Helvetica", 1, 13);
                class170.field3238 = class129.field2344.getFontMetrics(class60.field1112);
            }
            if (class157.field2809) {
                class157.field2809 = false;
                var4.setColor(Color.black);
                var4.fillRect(0, 0, class185.field3577, class3.field67);
            }
            if (arg3 == null) {
                arg3 = new Color(140, 17, 17);
            }
            if (arg1 != -1729) {
                field1714 = -65;
            }
            try {
                if (class12.field222 == null) {
                    class12.field222 = class129.field2344.createImage(304, 34);
                }
                Graphics var5 = class12.field222.getGraphics();
                var5.setColor(arg3);
                var5.drawRect(0, 0, 303, 33);
                var5.fillRect(2, 2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(1, 1, 301, 31);
                var5.fillRect(arg0 * 3 + 2, 2, 300 - arg0 * 3, 30);
                var5.setFont(class60.field1112);
                var5.setColor(Color.white);
                arg2.method1158(116, var5, 22, (304 - arg2.method1143((byte) -126, class170.field3238)) / 2);
                var4.drawImage(class12.field222, class185.field3577 / 2 - 152, class3.field67 / 2 + -18, null);
            } catch (Exception var8) {
                int var6 = class185.field3577 / 2 - 152;
                int var7 = class3.field67 / 2 - 18;
                var4.setColor(arg3);
                var4.drawRect(var6, var7, 303, 33);
                var4.fillRect(var6 + 2, var7 + 2, arg0 * 3, 30);
                var4.setColor(Color.black);
                var4.drawRect(var6 + 1, var7 + 1, 301, 31);
                var4.fillRect(arg0 * 3 + var6 + 2, var7 + 2, 300 - arg0 * 3, 30);
                var4.setFont(class60.field1112);
                var4.setColor(Color.white);
                arg2.method1158(75, var4, var7 + 22, var6 + (304 - arg2.method1143((byte) -127, class170.field3238)) / 2);
            }
        } catch (Exception var9) {
            class129.field2344.repaint();
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(II)Z")
    public static final boolean method541(int arg0, int arg1) {
        field1712++;
        if (arg0 != -1) {
            field1710 = null;
        }
        return (arg1 >> 31 & 0x1) != 0;
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(Lvb;III)Z")
    public static final boolean method542(class197 arg0, int arg1, int arg2, int arg3) {
        byte[] var4 = arg0.method1249((byte) -87, arg2, arg3);
        field1715++;
        if (var4 == null) {
            return false;
        } else {
            int var5 = -78 / ((arg1 + 28) / 39);
            class74.method437(1, var4);
            return true;
        }
    }

    @OriginalMember(owner = "client!jg", name = "a", descriptor = "(I)V")
    public static void method543(int arg0) {
        field1711 = null;
        field1720 = null;
        field1717 = null;
        if (arg0 == 30) {
            field1713 = null;
            field1710 = null;
        }
    }
}
