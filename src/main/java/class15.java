import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class15 {

    @OriginalMember(owner = "client!rk", name = "c", descriptor = "Ljava/lang/String;")
    public static String field191 = null;

    @OriginalMember(owner = "client!rk", name = "f", descriptor = "[I")
    public static int[] field194 = new int[32];

    @OriginalMember(owner = "client!rk", name = "h", descriptor = "Lte;")
    public static class244 field196;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "I")
    public static int field189;

    @OriginalMember(owner = "client!rk", name = "b", descriptor = "I")
    public static int field190;

    @OriginalMember(owner = "client!rk", name = "d", descriptor = "I")
    public static int field192;

    @OriginalMember(owner = "client!rk", name = "e", descriptor = "I")
    public static int field193;

    @OriginalMember(owner = "client!rk", name = "g", descriptor = "I")
    public static int field195;

    @OriginalMember(owner = "client!rk", name = "i", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(B)V")
    public static void method77(byte arg0) {
        field191 = null;
        field194 = null;
        if (arg0 == -111) {
            field196 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(IZ)V")
    public static final void method78(int arg0, boolean arg1) {
        field190++;
        class19.field243.method1695(arg0, 0);
        if (!arg1) {
            field194 = null;
        }
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(II)Li;")
    public static final class20 method79(int arg0, int arg1) {
        if (arg0 != 1) {
            method79(-2, -22);
        }
        class20 var2 = (class20) class5.field83.method1469(arg0 ^ 0x2061, (long) arg1);
        field195++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 >= 32768) {
            var3 = class80.field994.method928(0, (byte) 123, arg1 & 0x7FFF);
        } else {
            var3 = class57.field732.method928(0, (byte) 123, arg1);
        }
        class20 var4 = new class20();
        if (var3 != null) {
            var4.method113((byte) -43, new class96(var3));
        }
        if (arg1 >= 32768) {
            var4.method110(true);
        }
        class5.field83.method1467((byte) -119, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!rk", name = "a", descriptor = "(Ljava/lang/String;IZBLjava/awt/Color;)V")
    public static final void method80(String arg0, int arg1, boolean arg2, byte arg3, Color arg4) {
        try {
            Graphics var5 = class221.field3551.getGraphics();
            if (class128.field2059 == null) {
                class128.field2059 = new Font("Helvetica", 1, 13);
                class63.field817 = class221.field3551.getFontMetrics(class128.field2059);
            }
            if (arg2) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class283.field4517, class292.field4640);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            try {
                if (class80.field996 == null) {
                    class80.field996 = class221.field3551.createImage(304, 34);
                }
                Graphics var6 = class80.field996.getGraphics();
                var6.setColor(arg4);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg1 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg1 * 3 + 2, 2, 300 - (arg1 * 3), 30);
                var6.setFont(class128.field2059);
                var6.setColor(Color.white);
                var6.drawString(arg0, (304 - class63.field817.stringWidth(arg0)) / 2, 22);
                if (arg3 < 86) {
                    method80((String) null, 56, false, (byte) -16, (Color) null);
                }
                var5.drawImage(class80.field996, class283.field4517 / 2 - 152, class292.field4640 / 2 + -18, (ImageObserver) null);
            } catch (Exception var9) {
                int var7 = class292.field4640 / 2 - 18;
                int var8 = class283.field4517 / 2 - 152;
                var5.setColor(arg4);
                var5.drawRect(var8, var7, 303, 33);
                var5.fillRect(var8 + 2, var7 + 2, arg1 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var7 + 1, 301, 31);
                var5.fillRect(arg1 * 3 + var8 + 2, var7 + 2, 300 - (arg1 * 3), 30);
                var5.setFont(class128.field2059);
                var5.setColor(Color.white);
                var5.drawString(arg0, var8 + ((304 - class63.field817.stringWidth(arg0)) / 2), var7 + 22);
            }
            if (class124.field1932 != null) {
                var5.setFont(class128.field2059);
                var5.setColor(Color.white);
                var5.drawString(class124.field1932, class283.field4517 / 2 - class63.field817.stringWidth(class124.field1932) / 2, class292.field4640 / 2 - 26);
            }
        } catch (Exception var10) {
            class221.field3551.repaint();
        }
        field193++;
    }

    static {
        int var0 = 2;
        for (int var1 = 0; var1 < 32; var1++) {
            field194[var1] = var0 - 1;
            var0 += var0;
        }
        field196 = new class244(64);
    }
}
