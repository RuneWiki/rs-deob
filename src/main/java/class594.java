import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class594 extends class339 {

    @OriginalMember(owner = "client!sp", name = "m", descriptor = "[Ljava/lang/String;")
    public static String[] field7963 = new String[100];

    @OriginalMember(owner = "client!sp", name = "o", descriptor = "J")
    public static long field7965 = -1L;

    @OriginalMember(owner = "client!sp", name = "k", descriptor = "I")
    public static int field7961 = 0;

    @OriginalMember(owner = "client!sp", name = "s", descriptor = "I")
    public static int field7969 = 0;

    @OriginalMember(owner = "client!sp", name = "l", descriptor = "I")
    public static int field7962;

    @OriginalMember(owner = "client!sp", name = "p", descriptor = "I")
    public static int field7966;

    @OriginalMember(owner = "client!sp", name = "q", descriptor = "I")
    public static int field7967;

    @OriginalMember(owner = "client!sp", name = "r", descriptor = "I")
    public static int field7968;

    @OriginalMember(owner = "client!sp", name = "n", descriptor = "Le;")
    public static class498 field7964;

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(I)V", line = 4)
    public static final void method3283(int arg0) {
        field7966++;
        if (arg0 > -44) {
            return;
        }
        int var1 = class257.field3289.length;
        for (int var2 = 0; var2 < var1; var2++) {
            if (class257.field3289[var2] != null) {
                int var3 = -1;
                for (int var4 = 0; var4 < class611.field8311; var4++) {
                    if (class76.field998[var4] == class307.field3888[var2]) {
                        var3 = var4;
                        break;
                    }
                }
                if (var3 == -1) {
                    class76.field998[class611.field8311] = class307.field3888[var2];
                    var3 = class611.field8311++;
                }
                class572 var5 = new class572(class257.field3289[var2]);
                int var6 = 0;
                while (var5.field7313 < class257.field3289[var2].length && var6 < 511 && class99.field1276 < 1023) {
                    int var7 = var3 | var6++ << 6;
                    int var8 = var5.method3031(-1);
                    int var9 = var8 >> 14;
                    int var10 = var8 >> 7 & 0x3F;
                    int var11 = var8 & 0x3F;
                    int var12 = (class307.field3888[var2] >> 8) * 64 + var10 - class227.field2938;
                    int var13 = (class307.field3888[var2] & 0xFF) * 64 + var11 - class522.field6612;
                    class689 var14 = class46.field620.method3763(var5.method3031(-1), -2);
                    class704 var15 = (class704) class168.field1973.method3828((long) var7, (byte) -91);
                    if (var15 == null && (var14.field9490 & 0x1) > 0 && class518.field6552 == var9 && var12 >= 0 && class85.field1090 > (var14.field9495 + var12) && var13 >= 0 && class656.field8932 > var14.field9495 + var13) {
                        class506 var16 = new class506();
                        var16.field495 = var7;
                        class704 var17 = new class704(var16);
                        class168.field1973.method3832(var17, (long) var7, 59);
                        class140.field1687[class215.field2516++] = var17;
                        class352.field4562[class99.field1276++] = var7;
                        var16.field441 = class665.field9027;
                        var16.method2759(0, var14);
                        var16.method223(21969, var16.field6326.field9495);
                        var16.field480 = var16.field6326.field9518 << 3;
                        var16.method221(true, (var16.field6326.field9489 + 4 & 0xFEA00007) << 11, 2);
                        var16.method2761(30, var13, var9, var12, true, var16.method210(false));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(ILjava/awt/Color;Ljava/awt/Color;Ljava/lang/String;Ljava/awt/Color;I)V", line = 102)
    public static final void method3284(int arg0, Color arg1, Color arg2, String arg3, Color arg4, int arg5) {
        try {
            Graphics var6 = class472.field5828.getGraphics();
            if (class125.field1528 == null) {
                class125.field1528 = new Font("Helvetica", 1, 13);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            if (arg4 == null) {
                arg4 = new Color(140, 17, 17);
            }
            if (arg1 == null) {
                arg1 = new Color(255, 255, 255);
            }
            try {
                if (class210.field2486 == null) {
                    class210.field2486 = class472.field5828.createImage(class309.field3890, class491.field6129);
                }
                Graphics var7 = class210.field2486.getGraphics();
                var7.setColor(Color.black);
                var7.fillRect(0, 0, class309.field3890, class491.field6129);
                int var8 = class309.field3890 / 2 - 152;
                int var9 = class491.field6129 / 2 - 18;
                var7.setColor(arg4);
                var7.drawRect(var8, var9, 303, 33);
                var7.setColor(arg2);
                var7.fillRect(var8 + 2, var9 + 2, arg0 * 3, 30);
                var7.setColor(Color.black);
                var7.drawRect(var8 + 1, var9 + 1, arg5, 31);
                var7.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                var7.setFont(class125.field1528);
                var7.setColor(arg1);
                var7.drawString(arg3, var8 + ((304 - (arg3.length() * 6)) / 2), var9 + 22);
                if (class85.field1085 != null) {
                    var7.setFont(class125.field1528);
                    var7.setColor(arg1);
                    var7.drawString(class85.field1085, class309.field3890 / 2 - (class85.field1085.length() * 6 / 2), class491.field6129 / 2 + -26);
                }
                var6.drawImage(class210.field2486, 0, 0, null);
            } catch (Exception var12) {
                var6.setColor(Color.black);
                var6.fillRect(0, 0, class309.field3890, class491.field6129);
                int var10 = class309.field3890 / 2 - 152;
                int var11 = class491.field6129 / 2 - 18;
                var6.setColor(arg4);
                var6.drawRect(var10, var11, 303, 33);
                var6.setColor(arg2);
                var6.fillRect(var10 + 2, var11 - -2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(var10 + 1, var11 - -1, 301, 31);
                var6.fillRect(arg0 * 3 + var10 + 2, var11 + 2, 300 - (arg0 * 3), 30);
                var6.setFont(class125.field1528);
                var6.setColor(arg1);
                if (class85.field1085 != null) {
                    var6.setFont(class125.field1528);
                    var6.setColor(arg1);
                    var6.drawString(class85.field1085, class309.field3890 / 2 - (class85.field1085.length() * 6 / 2), class491.field6129 / 2 + -26);
                }
                var6.drawString(arg3, var10 + ((304 - (arg3.length() * 6)) / 2), var11 + 22);
            }
        } catch (Exception var13) {
            class472.field5828.repaint();
        }
        field7962++;
    }

    @OriginalMember(owner = "client!sp", name = "b", descriptor = "(B)V", line = 198)
    public static void method3285(byte arg0) {
        field7963 = null;
        field7964 = null;
        int var1 = -52 % ((32 - arg0) / 50);
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "(Lqj;Lpfa;Z)V", line = 220)
    public static final void method3286(class476 arg0, class275 arg1, boolean arg2) {
        class413.field5287 = "";
        if (!arg2) {
            return;
        }
        class340.field4339 = arg1;
        class72.field941 = arg0;
        field7968++;
        if (class607.field8279.startsWith("win")) {
            class413.field5287 = class413.field5287 + "windows/";
        } else if (class607.field8279.startsWith("linux")) {
            class413.field5287 = class413.field5287 + "linux/";
        } else if (class607.field8279.startsWith("mac")) {
            class413.field5287 = class413.field5287 + "macos/";
        }
        if (class72.field941.field5925) {
            class413.field5287 = class413.field5287 + "msjava/";
        } else if (class607.field8281.startsWith("amd64") || class607.field8281.startsWith("x86_64")) {
            class413.field5287 = class413.field5287 + "x86_64/";
        } else if (class607.field8281.startsWith("i386") || class607.field8281.startsWith("i486") || class607.field8281.startsWith("i586") || class607.field8281.startsWith("x86")) {
            class413.field5287 = class413.field5287 + "x86/";
        } else if (class607.field8281.startsWith("ppc")) {
            class413.field5287 = class413.field5287 + "ppc/";
        } else {
            class413.field5287 = class413.field5287 + "universal/";
        }
    }

    @OriginalMember(owner = "client!sp", name = "a", descriptor = "([[[Lqs;B)V", line = 267)
    public static final void method3287(class565[][][] arg0, byte arg1) {
        for (int var2 = 0; var2 < arg0.length; var2++) {
            class565[][] var3 = arg0[var2];
            for (int var4 = 0; var4 < var3.length; var4++) {
                for (int var5 = 0; var5 < var3[var4].length; var5++) {
                    class565 var6 = var3[var4][var5];
                    if (var6 != null) {
                        if (var6.field7085 instanceof class310) {
                            ((class310) var6.field7085).method132(-13968);
                        }
                        if (var6.field7082 instanceof class310) {
                            ((class310) var6.field7082).method132(-13968);
                        }
                        if (var6.field7073 instanceof class310) {
                            ((class310) var6.field7073).method132(-13968);
                        }
                        if (var6.field7079 instanceof class310) {
                            ((class310) var6.field7079).method132(-13968);
                        }
                        if (var6.field7087 instanceof class310) {
                            ((class310) var6.field7087).method132(-13968);
                        }
                        for (class436 var7 = var6.field7074; var7 != null; var7 = var7.field5485) {
                            class597 var8 = var7.field5486;
                            if (var8 instanceof class310) {
                                ((class310) var8).method132(-13968);
                            }
                        }
                    }
                }
            }
        }
        if (arg1 >= -88) {
            field7964 = null;
        }
        field7967++;
    }
}
