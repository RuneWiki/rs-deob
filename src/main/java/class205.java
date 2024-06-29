import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class205 extends class154 {

    @OriginalMember(owner = "client!rd", name = "p", descriptor = "[I")
    public int[] field3061 = new int[1];

    @OriginalMember(owner = "client!rd", name = "x", descriptor = "[I")
    public int[] field3069 = new int[] { -1 };

    @OriginalMember(owner = "client!rd", name = "o", descriptor = "Ljava/lang/String;")
    public static String field3060 = "Take";

    @OriginalMember(owner = "client!rd", name = "t", descriptor = "I")
    public static int field3065 = 0;

    @OriginalMember(owner = "client!rd", name = "q", descriptor = "[Ljava/lang/String;")
    public static String[] field3062 = new String[500];

    @OriginalMember(owner = "client!rd", name = "r", descriptor = "I")
    public static int field3063 = 0;

    @OriginalMember(owner = "client!rd", name = "D", descriptor = "I")
    public static int field3074 = 0;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "Ljava/lang/String;")
    public static String field3075 = "Checking for updates - ";

    @OriginalMember(owner = "client!rd", name = "s", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!rd", name = "u", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!rd", name = "v", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!rd", name = "w", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!rd", name = "y", descriptor = "I")
    public static int field3070;

    @OriginalMember(owner = "client!rd", name = "z", descriptor = "I")
    public static int field3071;

    @OriginalMember(owner = "client!rd", name = "C", descriptor = "I")
    public static int field3073;

    @OriginalMember(owner = "client!rd", name = "A", descriptor = "Lui;")
    public static class286 field3072;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZIBIILnh;)V")
    public static final void method1280(int arg0, boolean arg1, int arg2, byte arg3, int arg4, int arg5, class305 arg6) {
        class209.field3112 = arg5;
        class235.field3666 = arg0;
        int var7 = 116 % ((arg3 + 32) / 61);
        class186.field2825 = arg4;
        class251.field3915 = arg2;
        class4.field31 = arg1;
        class159.field2208 = 1;
        class145.field2006 = arg6;
        field3071++;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(Ljava/lang/String;ILjava/awt/Color;IZ)V")
    public static final void method1281(String arg0, int arg1, Color arg2, int arg3, boolean arg4) {
        try {
            Graphics var5 = class291.field4645.getGraphics();
            if (class116.field1672 == null) {
                class116.field1672 = new Font("Helvetica", 1, 13);
                class157.field2164 = class291.field4645.getFontMetrics(class116.field1672);
            }
            if (arg4) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class218.field3386, class174.field2460);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class282.field4525 == null) {
                    class282.field4525 = class291.field4645.createImage(304, 34);
                }
                Graphics var6 = class282.field4525.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, arg1, 303, 33);
                var6.fillRect(2, 2, arg3 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg3 * 3 + 2, 2, 300 - (arg3 * 3), 30);
                var6.setFont(class116.field1672);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class157.field2164.stringWidth(arg0)) / 2, 22);
                var5.drawImage(class282.field4525, class218.field3386 / 2 - 152, class174.field2460 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class218.field3386 / 2 - 152;
                int var8 = class174.field2460 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var7, var8, 303, 33);
                var5.fillRect(var7 + 2, var8 + 2, arg3 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var7 + 1, var8 + 1, 301, 31);
                var5.fillRect(var7 + (arg3 * 3) + 2, var8 + 2, 300 - (arg3 * 3), 30);
                var5.setFont(class116.field1672);
                var5.setColor(Color.white);
                var5.drawString(arg0, (304 - class157.field2164.stringWidth(arg0)) / 2 + var7, var8 + 22);
            }
            if (class290.field4630 != null) {
                var5.setFont(class116.field1672);
                var5.setColor(Color.white);
                var5.drawString(class290.field4630, class218.field3386 / 2 - (class157.field2164.stringWidth(class290.field4630) / 2), class174.field2460 / 2 + -26);
            }
        } catch (Exception var10) {
            class291.field4645.repaint();
        }
        field3073++;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(II)V")
    public static final void method1282(int arg0, int arg1) {
        field3066++;
        class190.field2880.method943(arg0, true);
        if (arg1 < 64) {
            field3065 = -33;
        }
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        field3070++;
        if (arg0 >= -98) {
            field3065 = 22;
        }
        class98.field1425.method944(-49);
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(B)V")
    public static void method1284(byte arg0) {
        field3072 = null;
        field3062 = null;
        if (arg0 != -56) {
            method1282(-95, 89);
        }
        field3075 = null;
        field3060 = null;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(I[BBLjava/lang/String;II)I")
    public static final int method1285(int arg0, byte[] arg1, byte arg2, String arg3, int arg4, int arg5) {
        field3067++;
        int var6 = arg4 - arg0;
        for (int var7 = 0; var7 < var6; var7++) {
            char var8 = arg3.charAt(arg0 + var7);
            if (var8 > '\u0000' && var8 < '\u0080' || var8 >= ' ' && var8 <= 'ÿ') {
                arg1[arg5 + var7] = (byte) var8;
            } else if (var8 == '€') {
                arg1[arg5 + var7] = -128;
            } else if (var8 == '‚') {
                arg1[arg5 + var7] = -126;
            } else if (var8 == 'ƒ') {
                arg1[arg5 + var7] = -125;
            } else if (var8 == '„') {
                arg1[arg5 + var7] = -124;
            } else if (var8 == '…') {
                arg1[arg5 + var7] = -123;
            } else if (var8 == '†') {
                arg1[arg5 + var7] = -122;
            } else if (var8 == '‡') {
                arg1[arg5 + var7] = -121;
            } else if (var8 == 'ˆ') {
                arg1[arg5 + var7] = -120;
            } else if (var8 == '‰') {
                arg1[arg5 + var7] = -119;
            } else if (var8 == 'Š') {
                arg1[arg5 + var7] = -118;
            } else if (var8 == '‹') {
                arg1[arg5 + var7] = -117;
            } else if (var8 == 'Œ') {
                arg1[arg5 + var7] = -116;
            } else if (var8 == 'Ž') {
                arg1[arg5 + var7] = -114;
            } else if (var8 == '‘') {
                arg1[arg5 + var7] = -111;
            } else if (var8 == '’') {
                arg1[arg5 + var7] = -110;
            } else if (var8 == '“') {
                arg1[arg5 + var7] = -109;
            } else if (var8 == '”') {
                arg1[arg5 + var7] = -108;
            } else if (var8 == '•') {
                arg1[arg5 + var7] = -107;
            } else if (var8 == '–') {
                arg1[arg5 + var7] = -106;
            } else if (var8 == '—') {
                arg1[arg5 + var7] = -105;
            } else if (var8 == '˜') {
                arg1[arg5 + var7] = -104;
            } else if (var8 == '™') {
                arg1[arg5 + var7] = -103;
            } else if (var8 == 'š') {
                arg1[arg5 + var7] = -102;
            } else if (var8 == '›') {
                arg1[arg5 + var7] = -101;
            } else if (var8 == 'œ') {
                arg1[arg5 + var7] = -100;
            } else if (var8 == 'ž') {
                arg1[arg5 + var7] = -98;
            } else if (var8 == 'Ÿ') {
                arg1[arg5 + var7] = -97;
            } else {
                arg1[arg5 + var7] = 63;
            }
        }
        if (arg2 != -122) {
            field3065 = 101;
        }
        return var6;
    }
}
