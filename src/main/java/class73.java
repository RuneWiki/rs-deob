import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class73 {

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "Lsg;")
    private static class30 field1642 = class167.method1221((byte) 33, "Loaded input handler");

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "Lsg;")
    public static class30 field1645 = field1642;

    @OriginalMember(owner = "client!bb", name = "i", descriptor = "[Lvk;")
    public static class141[] field1648 = new class141[6];

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field1640;

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field1641;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field1643;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "I")
    public static int field1644;

    @OriginalMember(owner = "client!bb", name = "g", descriptor = "I")
    public static int field1646;

    @OriginalMember(owner = "client!bb", name = "k", descriptor = "I")
    public static int field1650;

    @OriginalMember(owner = "client!bb", name = "l", descriptor = "I")
    public static int field1651;

    @OriginalMember(owner = "client!bb", name = "j", descriptor = "Lni;")
    public class20 field1649;

    @OriginalMember(owner = "client!bb", name = "h", descriptor = "[Lbj;")
    public static class44[] field1647;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static void method669(int arg0) {
        field1645 = null;
        field1648 = null;
        field1642 = null;
        field1647 = null;
        if (arg0 != -23249) {
            method669(62);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIBI)I")
    public static final int method670(int arg0, int arg1, byte arg2, int arg3) {
        if (arg2 != 94) {
            return 37;
        }
        field1640++;
        int var4 = arg3 & 0x3;
        if (var4 == 0) {
            return arg0;
        } else if (var4 == 1) {
            return arg1;
        } else if (var4 == 2) {
            return 7 - arg0;
        } else {
            return 7 - arg1;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IZ)V")
    public static final void method671(int arg0, boolean arg1) {
        class76.method682(class238.field4238, class15.field324, (byte) -7, arg1, class196.field3548);
        field1650++;
        if (arg0 != 73) {
            method674(false);
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Ljava/lang/String;Z)Ljava/lang/Class;")
    public static final Class method672(String arg0, boolean arg1) throws ClassNotFoundException {
        field1651++;
        if (arg0.equals("B")) {
            return Byte.TYPE;
        } else if (arg0.equals("I")) {
            return Integer.TYPE;
        } else if (arg0.equals("S")) {
            return Short.TYPE;
        } else if (arg0.equals("J")) {
            return Long.TYPE;
        } else if (arg0.equals("Z")) {
            return Boolean.TYPE;
        } else if (arg0.equals("F")) {
            return Float.TYPE;
        } else if (arg0.equals("D")) {
            return Double.TYPE;
        } else if (arg1) {
            return arg0.equals("C") ? Character.TYPE : Class.forName(arg0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(ILmc;II)Lbj;")
    public static final class44 method673(int arg0, class151 arg1, int arg2, int arg3) {
        if (arg0 != 60) {
            method669(-108);
        }
        field1644++;
        return class224.method1608(arg3, arg2, arg1, 0) ? class129.method981(false) : null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(Z)V")
    public static final void method674(boolean arg0) {
        field1641++;
        if (class101.field2061 == null) {
            return;
        }
        if (class230.field4095 < 10) {
            if (!class167.field3072.method1110(class101.field2061.field3306, arg0)) {
                class230.field4095 = class58.field1268.method1125(class101.field2061.field3306, -82) / 10;
                return;
            }
            class57.method540(-31713);
            class230.field4095 = 10;
        }
        if (class230.field4095 == 10) {
            class208.field3749 = 8.0F;
            class29.field562 = 8.0F;
            class170.field3205 = class101.field2061.field3328 >> 6 << 6;
            class53.field1179 = (class101.field2061.field3315 >> 6 << 6) + 64 - class170.field3205;
            class61.field1323 = class101.field2061.field3310 >> 6 << 6;
            int var1 = (class247.field4394.field1360 >> 7) + class22.field421 - class61.field1323;
            class98.field1979 = (class101.field2061.field3317 >> 6 << 6) + 64 - class61.field1323;
            int var2 = class170.field3205 + class53.field1179 - (class247.field4394.field1336 >> 7) - class196.field3547 - 1;
            int var3 = var1 + (int) (Math.random() * 10.0D) - 5;
            int var4 = var2 + (int) (Math.random() * 10.0D) - 5;
            if (var3 >= 0 && var3 < class98.field1979 && var4 >= 0 && var4 < class53.field1179) {
                class242.field4331 = var3;
                class241.field4304 = var4;
            } else {
                class242.field4331 = class101.field2061.field3327 * 64 - class61.field1323;
                class241.field4304 = class170.field3205 + class53.field1179 - (class101.field2061.field3316 * 64) - 1;
            }
            class154.method1151((byte) -100);
            int var5 = class53.field1179 >> 6;
            int var6 = class98.field1979 >> 6;
            class223.field3996 = new short[var6][var5][];
            class262.field4630 = new byte[var6][var5][];
            class246.field4386 = new byte[var6][var5][];
            class97.field1974 = new int[class200.field3574 + 1];
            class14.field272 = new byte[var6][var5][];
            class252.field4444 = new int[var6][var5][];
            class148.field2833 = new byte[var6][var5][];
            int var7 = class59.field1275 >> 2 << 10;
            class138.field2708 = new byte[var6][var5][];
            class47.field1076 = new int[var6][var5][];
            int var8 = class215.field3936 >> 1;
            class153.method1150(var7, (byte) -94, var8);
            class230.field4095 = 20;
        } else if (class230.field4095 == 20) {
            class69.method630((byte) -37, new class8(class167.field3072.method1129(-256, class223.field4005, class101.field2061.field3306)));
            class230.field4095 = 30;
            class47.method465((byte) -61, true);
            class36.method348(-8);
        } else if (class230.field4095 == 30) {
            class31.method308((byte) 54, new class8(class167.field3072.method1129(-256, class117.field2300, class101.field2061.field3306)));
            class230.field4095 = 40;
            class36.method348(-8);
        } else if (class230.field4095 == 40) {
            class234.method1661(-121, new class8(class167.field3072.method1129(-256, class147.field2823, class101.field2061.field3306)));
            class230.field4095 = 50;
            class36.method348(-8);
        } else if (class230.field4095 == 50) {
            class203.method1438(new class8(class167.field3072.method1129(-256, class35.field849, class101.field2061.field3306)), 4);
            class230.field4095 = 60;
            class47.method465((byte) -108, true);
            class36.method348(-8);
        } else if (class230.field4095 == 60) {
            if (class167.field3072.method1114(class160.method1188(new class30[] { class101.field2061.field3306, class232.field4144 }, 0), 32)) {
                if (!class167.field3072.method1110(class160.method1188(new class30[] { class101.field2061.field3306, class232.field4144 }, 0), arg0)) {
                    return;
                }
                class29.field556 = class180.method1311(class167.field3072, 71, class160.method1188(new class30[] { class101.field2061.field3306, class232.field4144 }, 0));
            } else {
                class29.field556 = new class190(0);
            }
            class230.field4095 = 70;
            class36.method348(-8);
        } else if (class230.field4095 == 70) {
            class197.field3561 = new class34(11, true, class224.field4021);
            class230.field4095 = 73;
            class47.method465((byte) -128, true);
            class36.method348(-8);
        } else if (class230.field4095 == 73) {
            class197.field3562 = new class34(12, true, class224.field4021);
            class230.field4095 = 76;
            class47.method465((byte) -73, true);
            class36.method348(-8);
        } else if (class230.field4095 == 76) {
            class222.field3989 = new class34(14, true, class224.field4021);
            class230.field4095 = 79;
            class47.method465((byte) -89, true);
            class36.method348(-8);
        } else if (class230.field4095 == 79) {
            class149.field2836 = new class34(17, true, class224.field4021);
            class230.field4095 = 82;
            class47.method465((byte) -118, true);
            class36.method348(-8);
        } else if (class230.field4095 == 82) {
            class257.field4527 = new class34(19, true, class224.field4021);
            class230.field4095 = 85;
            class47.method465((byte) -126, true);
            class36.method348(-8);
        } else if (class230.field4095 == 85) {
            class196.field3555 = new class34(22, true, class224.field4021);
            class230.field4095 = 88;
            class47.method465((byte) -70, true);
            class36.method348(-8);
        } else if (class230.field4095 == 88) {
            class2.field26 = new class34(26, true, class224.field4021);
            class230.field4095 = 91;
            class47.method465((byte) -82, true);
            class36.method348(-8);
        } else {
            class87.field1784 = new class34(30, true, class224.field4021);
            if (!arg0) {
                class230.field4095 = 100;
                class47.method465((byte) -98, true);
                class36.method348(-8);
                class32.field811 = -1;
                class41.field1014 = -1;
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(II)Lsg;")
    public static final class30 method675(int arg0, int arg1) {
        field1643++;
        int var2 = -47 % ((55 - arg0) / 43);
        return class119.method909(-121, arg1, false, 10);
    }
}
