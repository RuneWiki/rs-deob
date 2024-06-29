import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ke")
public class class106 {

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "Ljd;")
    public static class86 field2019 = class122.method868("Musik)2Engine vorbereitet)3", true);

    @OriginalMember(owner = "client!ke", name = "c", descriptor = "Ljd;")
    private static class86 field2021 = class122.method868("You can(Wt add yourself to your own friend list)3", true);

    @OriginalMember(owner = "client!ke", name = "j", descriptor = "Ljd;")
    public static class86 field2028 = field2021;

    @OriginalMember(owner = "client!ke", name = "k", descriptor = "Ljd;")
    public static class86 field2029 = class122.method868("Verbindung mit Update)2Server)3)3)3", true);

    @OriginalMember(owner = "client!ke", name = "v", descriptor = "I")
    public static int field2040 = 0;

    @OriginalMember(owner = "client!ke", name = "e", descriptor = "Ljd;")
    public static class86 field2023 = class122.method868("unzap", true);

    @OriginalMember(owner = "client!ke", name = "G", descriptor = "Ljd;")
    public static class86 field2050 = class122.method868("Lade Sprites )2 ", true);

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "I")
    public int field2020;

    @OriginalMember(owner = "client!ke", name = "d", descriptor = "I")
    public int field2022;

    @OriginalMember(owner = "client!ke", name = "f", descriptor = "I")
    public int field2024;

    @OriginalMember(owner = "client!ke", name = "g", descriptor = "I")
    public int field2025;

    @OriginalMember(owner = "client!ke", name = "h", descriptor = "I")
    public int field2026;

    @OriginalMember(owner = "client!ke", name = "i", descriptor = "I")
    public int field2027;

    @OriginalMember(owner = "client!ke", name = "m", descriptor = "I")
    public int field2031;

    @OriginalMember(owner = "client!ke", name = "n", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!ke", name = "o", descriptor = "I")
    public int field2033;

    @OriginalMember(owner = "client!ke", name = "p", descriptor = "I")
    public int field2034;

    @OriginalMember(owner = "client!ke", name = "q", descriptor = "I")
    public int field2035;

    @OriginalMember(owner = "client!ke", name = "r", descriptor = "I")
    public int field2036;

    @OriginalMember(owner = "client!ke", name = "s", descriptor = "I")
    public int field2037;

    @OriginalMember(owner = "client!ke", name = "t", descriptor = "I")
    public int field2038;

    @OriginalMember(owner = "client!ke", name = "u", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!ke", name = "w", descriptor = "I")
    public int field2041;

    @OriginalMember(owner = "client!ke", name = "x", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!ke", name = "y", descriptor = "I")
    public int field2043;

    @OriginalMember(owner = "client!ke", name = "z", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!ke", name = "B", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!ke", name = "C", descriptor = "I")
    public int field2047;

    @OriginalMember(owner = "client!ke", name = "E", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!ke", name = "F", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!ke", name = "l", descriptor = "Lja;")
    public static class58 field2030;

    @OriginalMember(owner = "client!ke", name = "A", descriptor = "Z")
    public static boolean field2045;

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(I)V")
    public static void method756(int arg0) {
        field2021 = null;
        if (arg0 != 2) {
            field2021 = null;
        }
        field2019 = null;
        field2050 = null;
        field2030 = null;
        field2028 = null;
        field2023 = null;
        field2029 = null;
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(Ljd;ZLjava/awt/Color;II)V")
    public static final void method757(class86 arg0, boolean arg1, Color arg2, int arg3, int arg4) {
        field2048++;
        try {
            Graphics var5 = class50.field1057.getGraphics();
            if (class51.field1068 == null) {
                class51.field1068 = new Font("Helvetica", 1, 13);
                class24.field593 = class50.field1057.getFontMetrics(class51.field1068);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class4.field53, class248.field4414);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class79.field1547 == null) {
                    class79.field1547 = class50.field1057.createImage(304, 34);
                }
                Graphics var6 = class79.field1547.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class51.field1068);
                var6.setColor(Color.white);
                arg0.method624(22, (byte) -116, (304 - arg0.method591(true, class24.field593)) / 2, var6);
                var5.drawImage(class79.field1547, class4.field53 / arg4 - 152, class248.field4414 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class248.field4414 / 2 - 18;
                int var8 = class4.field53 / 2 - 152;
                var5.setColor(arg2);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg3 * 3 + var8 + 2, var7 - -2, 300 - (arg3 * 3), 30);
                var5.setFont(class51.field1068);
                var5.setColor(Color.white);
                arg0.method624(var7 + 22, (byte) -79, var8 + ((304 - arg0.method591(true, class24.field593)) / 2), var5);
            }
            if (class98.field1947 != null) {
                var5.setFont(class51.field1068);
                var5.setColor(Color.white);
                class98.field1947.method624(class248.field4414 / 2 - 26, (byte) -87, class4.field53 / 2 - (class98.field1947.method591(true, class24.field593) / 2), var5);
            }
        } catch (Exception var10) {
            class50.field1057.repaint();
        }
    }

    @OriginalMember(owner = "client!ke", name = "a", descriptor = "(II)Ljd;")
    public static final class86 method758(int arg0, int arg1) {
        field2049++;
        class86 var2 = new class86();
        var2.field1670 = new byte[arg0];
        var2.field1704 = arg1;
        return var2;
    }

    @OriginalMember(owner = "client!ke", name = "b", descriptor = "(I)V")
    public static final void method759(int arg0) {
        if (arg0 < 44) {
            method758(33, 53);
        }
        field2042++;
        class14.field411.method703((byte) 122);
    }
}
