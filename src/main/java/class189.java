import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ta")
public class class189 {

    @OriginalMember(owner = "client!ta", name = "h", descriptor = "I")
    public int field3066 = -1;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "I")
    public static int field3059 = 0;

    @OriginalMember(owner = "client!ta", name = "k", descriptor = "I")
    public static int field3069 = -2;

    @OriginalMember(owner = "client!ta", name = "e", descriptor = "Lqd;")
    private static class40 field3063 = class147.method1106("Attack", (byte) -116);

    @OriginalMember(owner = "client!ta", name = "s", descriptor = "[S")
    public static short[] field3077 = new short[] { 6798, 8741, 25238, 4626, 4550 };

    @OriginalMember(owner = "client!ta", name = "d", descriptor = "Lqd;")
    public static class40 field3062 = field3063;

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "I")
    public static int field3060;

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!ta", name = "f", descriptor = "I")
    public int field3064;

    @OriginalMember(owner = "client!ta", name = "g", descriptor = "I")
    public int field3065;

    @OriginalMember(owner = "client!ta", name = "i", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!ta", name = "j", descriptor = "I")
    public static int field3068;

    @OriginalMember(owner = "client!ta", name = "l", descriptor = "I")
    public int field3070;

    @OriginalMember(owner = "client!ta", name = "m", descriptor = "I")
    public int field3071;

    @OriginalMember(owner = "client!ta", name = "o", descriptor = "I")
    public int field3073;

    @OriginalMember(owner = "client!ta", name = "p", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!ta", name = "q", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!ta", name = "r", descriptor = "I")
    public int field3076;

    @OriginalMember(owner = "client!ta", name = "t", descriptor = "I")
    public int field3078;

    @OriginalMember(owner = "client!ta", name = "u", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!ta", name = "v", descriptor = "I")
    public static int field3080;

    @OriginalMember(owner = "client!ta", name = "w", descriptor = "I")
    public int field3081;

    @OriginalMember(owner = "client!ta", name = "n", descriptor = "Lce;")
    public static class239 field3072;

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(I)V", line = 18)
    public static final void method1360(int arg0) {
        field3067++;
        class2.field16.method1347(arg0 ^ arg0);
        class83.field1437.method1347(0);
        class158.field2642.method1347(0);
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(B)V", line = 30)
    public static void method1361(byte arg0) {
        field3063 = null;
        if (arg0 < 29) {
            field3072 = (class239) null;
        }
        field3077 = null;
        field3062 = null;
        field3072 = null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(Lqd;Lqd;ILqd;I)V", line = 48)
    public static final void method1362(class40 arg0, class40 arg1, int arg2, class40 arg3, int arg4) {
        class171.method1265(-1, (byte) -81, arg1, arg3, arg2, arg0);
        if (arg4 <= 55) {
            field3063 = (class40) null;
        }
        field3080++;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IILbb;)V", line = 69)
    public static final void method1363(int arg0, int arg1, class86 arg2) {
        if (class256.field4266 < arg2.field1505) {
            class233.method1618(-48, arg2);
        } else if (class256.field4266 <= arg2.field1488) {
            class207.method1461(arg2, (byte) 83);
        } else {
            class172.method1267(arg2, true);
        }
        if (arg2.field1531 < 128 || arg2.field1497 < 128 || arg2.field1531 >= 13184 || arg2.field1497 >= 13184) {
            arg2.field1505 = 0;
            arg2.field1519 = -1;
            arg2.field1502 = -1;
            arg2.field1488 = 0;
            arg2.field1531 = arg2.field1489[0] * 128 + arg2.method666(24207) * 64;
            arg2.field1497 = arg2.field1532[0] * 128 + (arg2.method666(24207) * 64);
            arg2.method667(-27407);
        }
        if (class255.field4233 == arg2 && (arg2.field1531 < 1536 || arg2.field1497 < 1536 || arg2.field1531 >= 11776 || arg2.field1497 >= 11776)) {
            arg2.field1519 = -1;
            arg2.field1502 = -1;
            arg2.field1505 = 0;
            arg2.field1488 = 0;
            arg2.field1531 = arg2.field1489[0] * 128 + (arg2.method666(24207) * 64);
            arg2.field1497 = arg2.field1532[0] * 128 + (arg2.method666(24207) * 64);
            arg2.method667(-27407);
        }
        field3061++;
        class91.method698(32768, arg2);
        class221.method1551((byte) 10, arg2);
        if (arg1 >= -7) {
            method1366(-66, 104, -119, -25, -15);
        }
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIILbg;JZ)V", line = 116)
    public static final void method1364(int arg0, int arg1, int arg2, int arg3, class196 arg4, long arg5, boolean arg6) {
        if (arg4 == null) {
            return;
        }
        class102 var8 = new class102();
        var8.field1790 = arg4;
        var8.field1788 = arg1 * 128 + 64;
        var8.field1795 = arg2 * 128 + 64;
        var8.field1792 = arg3;
        var8.field1804 = arg5;
        var8.field1794 = arg6;
        if (class93.field1690[arg0][arg1][arg2] == null) {
            class93.field1690[arg0][arg1][arg2] = new class14(arg0, arg1, arg2);
        }
        class93.field1690[arg0][arg1][arg2].field222 = var8;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(BLqd;)Lgi;", line = 143)
    public static final class208 method1365(byte arg0, class40 arg1) {
        field3079++;
        if (arg0 >= -27) {
            return (class208) null;
        }
        for (class208 var2 = (class208) class80.field1386.method1971(100); var2 != null; var2 = (class208) class80.field1386.method1967(100)) {
            if (var2.field3319.method345(arg1, false)) {
                return var2;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ta", name = "a", descriptor = "(IIIII)V", line = 183)
    public static final void method1366(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3068++;
        if (arg2 != -1) {
            return;
        }
        class164 var5 = (class164) class48.field934.method1405((byte) 115, (long) arg0);
        if (var5 == null) {
            var5 = new class164();
            class48.field934.method1396(-19928, (long) arg0, var5);
        }
        if (arg1 >= var5.field2717.length) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field2717.length; var8++) {
                var7[var8] = var5.field2717[var8];
                var6[var8] = var5.field2725[var8];
            }
            for (int var9 = var5.field2717.length; var9 < arg1; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field2717 = var7;
            var5.field2725 = var6;
        }
        var5.field2717[arg1] = arg4;
        var5.field2725[arg1] = arg3;
    }

    @OriginalMember(owner = "client!ta", name = "b", descriptor = "(B)V", line = 240)
    public static final void method1367(byte arg0) {
        field3060++;
        class194.field3121 = 0;
        int var1 = (class255.field4233.field1531 >> 7) + class196.field3152;
        int var2 = (class255.field4233.field1497 >> 7) + class263.field4407;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class194.field3121 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class194.field3121 = 1;
        }
        int var3 = 13 / ((arg0 + 39) / 56);
        if (class194.field3121 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class194.field3121 = 0;
        }
    }

    @OriginalMember(owner = "client!ta", name = "c", descriptor = "(B)V", line = 265)
    public static final void method1368(byte arg0) {
        field3074++;
        if (!class27.field518) {
            class255.field4252 = 1;
            if (class140.field2370 != 0) {
                class159.field2664 = class85.field1471;
                class294.field4937 = class291.field4865;
            } else if (class288.field4833 == 0) {
                class294.field4937 = class46.field893;
                class159.field2664 = class48.field936;
            } else {
                class294.field4937 = class62.field1171;
                class159.field2664 = class128.field2208;
            }
            class246.field4079[0] = class129.field2221;
            class288.field4832[0] = 1006;
            class3.field37[0] = class264.field4421;
        }
        if (class148.field2499 != -1) {
            class51.method443(class148.field2499, true);
        }
        if (arg0 != 114) {
            field3062 = (class40) null;
        }
        for (int var1 = 0; var1 < class83.field1438; var1++) {
            if (class229.field3778[var1]) {
                class309.field5192[var1] = true;
            }
            class289.field4840[var1] = class229.field3778[var1];
            class229.field3778[var1] = false;
        }
        class261.field4382 = null;
        class23.field410 = -1;
        class72.field1283 = -1;
        class263.field4393 = class256.field4266;
        if (class21.field350) {
            class156.field2619 = true;
        }
        if (class148.field2499 != -1) {
            class83.field1438 = 0;
            class255.method1798(class148.field2499, 0, 0, class112.field1945, -1, class73.field1287, 0, 0, false);
        }
        if (class21.field350) {
            class111.method834();
        } else {
            class115.method865();
        }
        class123.method932(true);
        if (class27.field518) {
            class223.method1559(false);
        } else if (class72.field1283 != -1) {
            class271.method1878(class72.field1283, class23.field410, true);
        }
        if (class48.field938 == 3) {
            for (int var2 = 0; var2 < class83.field1438; var2++) {
                if (class289.field4840[var2]) {
                    if (class21.field350) {
                        class111.method842(class197.field3166[var2], class181.field2947[var2], class280.field4728[var2], class53.field1036[var2], 16711935, 128);
                    } else {
                        class115.method874(class197.field3166[var2], class181.field2947[var2], class280.field4728[var2], class53.field1036[var2], 16711935, 128);
                    }
                } else if (class309.field5192[var2]) {
                    if (class21.field350) {
                        class111.method842(class197.field3166[var2], class181.field2947[var2], class280.field4728[var2], class53.field1036[var2], 16711680, 128);
                    } else {
                        class115.method874(class197.field3166[var2], class181.field2947[var2], class280.field4728[var2], class53.field1036[var2], 16711680, 128);
                    }
                }
            }
        }
        class101.method762(class255.field4233.field1531, field3059, class255.field4233.field1497, 64, class160.field2671);
        field3059 = 0;
    }
}
