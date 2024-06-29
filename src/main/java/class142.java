import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class142 extends class551 {

    @OriginalMember(owner = "client!jga", name = "j", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!jga", name = "q", descriptor = "I")
    private int field2059;

    @OriginalMember(owner = "client!jga", name = "k", descriptor = "I")
    private int field2053;

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "Lum;")
    private class528 field2049;

    @OriginalMember(owner = "client!jga", name = "l", descriptor = "I")
    private int field2054;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    private int field2048;

    @OriginalMember(owner = "client!jga", name = "o", descriptor = "I")
    private int field2057;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "Lpb;")
    public static class2 field2047 = new class2(8, 16);

    @OriginalMember(owner = "client!jga", name = "p", descriptor = "Lcq;")
    public static class273 field2058 = new class273(15, 0, 1, 0);

    @OriginalMember(owner = "client!jga", name = "r", descriptor = "Z")
    public static boolean field2060 = false;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field2046;

    @OriginalMember(owner = "client!jga", name = "i", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!jga", name = "m", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!jga", name = "n", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!jga", name = "s", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "Lap;")
    private class447 field2050;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(Ljava/lang/String;Ljava/awt/Color;BLjava/awt/Color;ILjava/awt/Color;)V", line = 7)
    public static final void method994(String arg0, Color arg1, byte arg2, Color arg3, int arg4, Color arg5) {
        if (arg2 != -105) {
            field2047 = null;
        }
        try {
            Graphics var6 = class410.field6110.getGraphics();
            if (class332.field4829 == null) {
                class332.field4829 = new Font("Helvetica", 1, 13);
            }
            if (arg1 == null) {
                arg1 = new Color(140, 17, 17);
            }
            if (arg5 == null) {
                arg5 = new Color(140, 17, 17);
            }
            if (arg3 == null) {
                arg3 = new Color(255, 255, 255);
            }
            try {
                if (class79.field1284 == null) {
                    class79.field1284 = class410.field6110.createImage(class454.field6538, class425.field6218);
                }
                Graphics var7 = class79.field1284.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class454.field6538, class425.field6218);
                int var8 = class454.field6538 / 2 - 152;
                int var9 = class425.field6218 / 2 - 18;
                var7.setColor(arg5);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg1);
                var7.fillRect(var8 + 2, var9 + 2, arg4 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, 301, 31);
                var7.fillRect(arg4 * 3 + (var8 + 2), var9 + 2, 300 - (arg4 * 3), 30);
                var7.setFont(class332.field4829);
                var7.setColor(arg3);
                var7.drawString(arg0, (304 - (arg0.length() * 6)) / 2 + var8, var9 + 22);
                if (class288.field4179 != null) {
                    var7.setFont(class332.field4829);
                    var7.setColor(arg3);
                    var7.drawString(class288.field4179, class454.field6538 / 2 - (class288.field4179.length() * 6 / 2), class425.field6218 / 2 - 26);
                }
                var6.drawImage(class79.field1284, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class454.field6538, class425.field6218);
                int var10 = class454.field6538 / 2 - 152;
                int var11 = class425.field6218 / 2 - 18;
                var6.setColor(arg5);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg1);
                var6.fillRect(var10 + 2, var11 + 2, arg4 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 + 1, 301, 31);
                var6.fillRect(var10 + (arg4 * 3) + 2, var11 + 2, 300 - (arg4 * 3), 30);
                var6.setFont(class332.field4829);
                var6.setColor(arg3);
                if (class288.field4179 != null) {
                    var6.setFont(class332.field4829);
                    var6.setColor(arg3);
                    var6.drawString(class288.field4179, class454.field6538 / 2 - class288.field4179.length() * 6 / 2, class425.field6218 / 2 + -26);
                }
                var6.drawString(arg0, var10 + ((304 - (arg0.length() * 6)) / 2), var11 - -22);
            }
        } catch (Exception var13) {
            class410.field6110.repaint();
        }
        field2055++;
    }

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "(I)V", line = 95)
    public static void method995(int arg0) {
        field2058 = null;
        field2047 = null;
        if (arg0 != 31) {
            field2060 = false;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)Lap;", line = 108)
    public final class447 method996(int arg0) {
        if (arg0 <= 89) {
            this.field2059 = -62;
        }
        field2051++;
        if (this.field2050 == null) {
            class144.field2072[0] = this.field2053;
            class144.field2072[2] = this.field2057;
            class615 var2 = this.field2049.field1491;
            class144.field2072[5] = this.field2059;
            class144.field2072[4] = this.field2052;
            class144.field2072[3] = this.field2048;
            class144.field2072[1] = this.field2054;
            boolean var3 = false;
            int var4 = 0;
            for (int var5 = 0; var5 < 6; var5++) {
                if (!var2.method956(class144.field2072[var5], 15925)) {
                    return null;
                }
                class457 var7 = var2.method955(-1330, class144.field2072[var5]);
                int var8 = var7.field6610 ? 64 : 128;
                if (var4 < var8) {
                    var4 = var8;
                }
                if (var7.field6605 > 0) {
                    var3 = true;
                }
            }
            for (int var6 = 0; var6 < 6; var6++) {
                class72.field1146[var6] = var2.method958(1.0F, var4, -17786, false, var4, class144.field2072[var6]);
            }
            this.field2050 = this.field2049.method812(1, var3, class72.field1146, var4);
        }
        return this.field2050;
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IB)Z", line = 181)
    public static final boolean method997(int arg0, byte arg1) {
        field2046++;
        if (arg1 > -102) {
            method997(86, (byte) 26);
        }
        return arg0 == 3 || arg0 == 5 || arg0 == 6;
    }

    @OriginalMember(owner = "client!jga", name = "<init>", descriptor = "(Lum;IIIIII)V", line = 197)
    public class142(class528 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        this.field2052 = arg5;
        this.field2059 = arg6;
        this.field2053 = arg1;
        this.field2049 = arg0;
        this.field2054 = arg2;
        this.field2048 = arg4;
        this.field2057 = arg3;
    }
}
