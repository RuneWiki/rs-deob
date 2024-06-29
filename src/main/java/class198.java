import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.ImageObserver;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!u")
public class class198 extends class254 {

    @OriginalMember(owner = "client!u", name = "q", descriptor = "Luf;")
    public static class168 field3265 = class148.method1019(-1720, ":");

    @OriginalMember(owner = "client!u", name = "v", descriptor = "Luf;")
    public static class168 field3270 = class148.method1019(-1720, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!u", name = "z", descriptor = "[I")
    public static int[] field3274 = new int[32];

    @OriginalMember(owner = "client!u", name = "C", descriptor = "I")
    public static int field3277 = -1;

    @OriginalMember(owner = "client!u", name = "D", descriptor = "Luf;")
    public static class168 field3278 = class148.method1019(-1720, "<col=ff0000>");

    @OriginalMember(owner = "client!u", name = "r", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!u", name = "s", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!u", name = "t", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!u", name = "u", descriptor = "I")
    public static int field3269;

    @OriginalMember(owner = "client!u", name = "y", descriptor = "I")
    public static int field3273;

    @OriginalMember(owner = "client!u", name = "A", descriptor = "I")
    public static int field3275;

    @OriginalMember(owner = "client!u", name = "B", descriptor = "I")
    public static int field3276;

    @OriginalMember(owner = "client!u", name = "w", descriptor = "J")
    public static long field3271;

    @OriginalMember(owner = "client!u", name = "x", descriptor = "Lfj;")
    public static class283 field3272;

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZII)I", line = 5)
    public static final int method1392(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            method1398(-89, true, (Color) null, (byte) -43, (class168) null);
        }
        field3266++;
        if ((class159.field2520[arg0][arg2][arg3] & 0x8) == 0) {
            return arg0 <= 0 || (class159.field2520[1][arg2][arg3] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(ZI)Lgm;", line = 26)
    public static final class56 method1393(boolean arg0, int arg1) {
        field3269++;
        class56 var2 = (class56) class256.field4354.method185(-1, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class287.field4839.method1647(0, (byte) 122, arg1);
        } else {
            var3 = class110.field1722.method1647(0, (byte) 127, arg1 & 0x7FFF);
        }
        class56 var4 = new class56();
        if (var3 != null) {
            var4.method318(0, new class153(var3));
        }
        if (arg0) {
            method1393(true, 27);
        }
        if (arg1 >= 32768) {
            var4.method317((byte) -116);
        }
        class256.field4354.method187(var4, (long) arg1, (byte) 10);
        return var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(II)Ldd;", line = 66)
    public static final class73 method1394(int arg0, int arg1) {
        field3275++;
        class73 var2 = (class73) class194.field3147.method1424((long) arg1, (byte) 121);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class281.field4727.method1647(class118.method849(arg1, (byte) 109), (byte) 120, class248.method1705(arg1, (byte) -57));
        class73 var4 = new class73();
        if (var3 != null) {
            var4.method414(new class153(var3), -1);
        }
        class194.field3147.method1430(var4, (long) arg1, 13487);
        return arg0 <= 62 ? (class73) null : var4;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(I)V", line = 109)
    public static void method1395(int arg0) {
        field3274 = null;
        field3272 = null;
        if (arg0 == -10750) {
            field3265 = null;
            field3278 = null;
            field3270 = null;
        }
    }

    @OriginalMember(owner = "client!u", name = "b", descriptor = "(I)V", line = 123)
    public static final void method1396(int arg0) {
        class184.method1307();
        class155.field2456 = new class13[7];
        field3267++;
        class155.field2456[1] = new class89();
        class155.field2456[2] = new class181();
        class155.field2456[3] = new class88();
        if (arg0 <= 32) {
            field3276 = -90;
        }
        class155.field2456[4] = new class129();
        class155.field2456[5] = new class171();
        class155.field2456[6] = new class29();
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(BI)I", line = 142)
    public static final int method1397(byte arg0, int arg1) {
        field3273++;
        if (arg0 != 85) {
            field3271 = -24L;
        }
        int var2 = arg1 * 6 - 61440;
        int var3 = (arg1 * arg1 >> 12) * arg1 >> 12;
        int var4 = (arg1 * var2 >> 12) + 40960;
        return var3 * var4 >> 12;
    }

    @OriginalMember(owner = "client!u", name = "a", descriptor = "(IZLjava/awt/Color;BLuf;)V", line = 170)
    public static final void method1398(int arg0, boolean arg1, Color arg2, byte arg3, class168 arg4) {
        try {
            Graphics var5 = class189.field3023.getGraphics();
            if (class44.field535 == null) {
                class44.field535 = new Font("Helvetica", 1, 13);
                class38.field472 = class189.field3023.getFontMetrics(class44.field535);
            }
            if (arg1) {
                var5.setColor(Color.black);
                var5.fillRect(0, 0, class14.field142, class299.field5069);
            }
            if (arg2 == null) {
                arg2 = new Color(140, 17, 17);
            }
            try {
                if (class121.field1883 == null) {
                    class121.field1883 = class189.field3023.createImage(304, 34);
                }
                Graphics var6 = class121.field1883.getGraphics();
                var6.setColor(arg2);
                var6.drawRect(0, 0, 303, 33);
                var6.fillRect(2, 2, arg0 * 3, 30);
                var6.setColor(Color.black);
                var6.drawRect(1, 1, 301, 31);
                var6.fillRect(arg0 * 3 + 2, 2, 300 - (arg0 * 3), 30);
                var6.setFont(class44.field535);
                var6.setColor(Color.white);
                arg4.method1221(var6, 0, (304 - arg4.method1173((byte) -100, class38.field472)) / 2, 22);
                if (arg3 > -20) {
                    field3274 = (int[]) null;
                }
                var5.drawImage(class121.field1883, class14.field142 / 2 - 152, class299.field5069 / 2 + -18, (ImageObserver) null);
            } catch (Exception var11) {
                int var8 = class14.field142 / 2 - 152;
                int var9 = class299.field5069 / 2 - 18;
                var5.setColor(arg2);
                var5.drawRect(var8, var9, 303, 33);
                var5.fillRect(var8 + 2, var9 - -2, arg0 * 3, 30);
                var5.setColor(Color.black);
                var5.drawRect(var8 + 1, var9 - -1, 301, 31);
                var5.fillRect(arg0 * 3 + var8 + 2, var9 + 2, 300 - (arg0 * 3), 30);
                var5.setFont(class44.field535);
                var5.setColor(Color.white);
                arg4.method1221(var5, 0, (304 - arg4.method1173((byte) -100, class38.field472)) / 2 + var8, var9 - -22);
            }
            if (class96.field1541 != null) {
                var5.setFont(class44.field535);
                var5.setColor(Color.white);
                class96.field1541.method1221(var5, 0, class14.field142 / 2 - (class96.field1541.method1173((byte) -100, class38.field472) / 2), class299.field5069 / 2 - 26);
            }
        } catch (Exception var12) {
            class189.field3023.repaint();
        }
        field3268++;
    }
}
