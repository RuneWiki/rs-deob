import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ll")
public class class159 {

    @OriginalMember(owner = "client!ll", name = "d", descriptor = "I")
    public static int field2414 = 0;

    @OriginalMember(owner = "client!ll", name = "f", descriptor = "I")
    public static int field2416 = 0;

    @OriginalMember(owner = "client!ll", name = "g", descriptor = "[J")
    public static long[] field2417 = new long[1000];

    @OriginalMember(owner = "client!ll", name = "e", descriptor = "F")
    public static float field2415;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!ll", name = "b", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!ll", name = "c", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(ZZ)V", line = 7)
    public static final void method1190(boolean arg0, boolean arg1) {
        for (class239 var2 = (class239) class108.field1590.method1954(-66); var2 != null; var2 = (class239) class108.field1590.method1950((byte) 95)) {
            if (var2.field3632 != null) {
                class322.field4961.method147(var2.field3632);
                var2.field3632 = null;
            }
            if (var2.field3633 != null) {
                class322.field4961.method147(var2.field3633);
                var2.field3633 = null;
            }
            var2.method39(10717);
        }
        if (arg1) {
            for (class239 var3 = (class239) class294.field4534.method1954(-66); var3 != null; var3 = (class239) class294.field4534.method1950((byte) 92)) {
                if (var3.field3632 != null) {
                    class322.field4961.method147(var3.field3632);
                    var3.field3632 = null;
                }
                var3.method39(10717);
            }
            for (class239 var4 = (class239) class173.field2788.method1706(0); var4 != null; var4 = (class239) class173.field2788.method1705((byte) 53)) {
                if (var4.field3632 != null) {
                    class322.field4961.method147(var4.field3632);
                    var4.field3632 = null;
                }
                var4.method39(10717);
            }
        }
        if (arg0) {
            field2411++;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(I)V", line = 81)
    public static void method1191(int arg0) {
        field2417 = null;
        if (arg0 < 59) {
            field2415 = -1.649627F;
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(B)V", line = 93)
    public static final void method1192(byte arg0) {
        field2412++;
        class100.field1448.method752(false);
        if (arg0 <= 58) {
            method1192((byte) 108);
        }
    }

    @OriginalMember(owner = "client!ll", name = "a", descriptor = "(BILjava/awt/Color;ZLjava/lang/String;)V", line = 115)
    public static final void method1193(byte arg0, int arg1, Color arg2, boolean arg3, String arg4) {
        try {
            Graphics var5 = class102.field1480.getGraphics();
            if (class308.field4805 == null) {
                class308.field4805 = new Font("Helvetica", 1, 13);
                class103.field1513 = class102.field1480.getFontMetrics(class308.field4805);
            }
            if (arg0 != -97) {
                field2414 = 50;
            }
            if (arg3) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class151.field2281, class215.field3300);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class307.field4788 == null) {
                    class307.field4788 = class102.field1480.createImage(304, 34);
                }
                Graphics var6 = class307.field4788.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - arg1 * 3, 30);
                var6.setFont(class308.field4805);
                var6.setColor(Color.white);
                var6.drawString(arg4, (304 - class103.field1513.stringWidth(arg4)) / 2, 22);
                var5.drawImage(class307.field4788, class151.field2281 / 2 - 152, class215.field3300 / 2 - 18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class151.field2281 / 2 - 152;
                int var9 = class215.field3300 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var9 - -2, 300 - arg1 * 3, 30);
                var5.setFont(class308.field4805);
                var5.setColor(Color.white);
                var5.drawString(arg4, (304 - class103.field1513.stringWidth(arg4)) / 2 + var8, var9 + 22);
            }
            if (class214.field3294 != null) {
                var5.setFont(class308.field4805);
                var5.setColor(Color.white);
                var5.drawString(class214.field3294, class151.field2281 / 2 - class103.field1513.stringWidth(class214.field3294) / 2, class215.field3300 / 2 + -26);
            }
        } catch (Exception var12) {
            class102.field1480.repaint();
        }
        field2413++;
    }
}
