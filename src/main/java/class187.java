import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bd")
public class class187 {

    @OriginalMember(owner = "client!bd", name = "b", descriptor = "Loa;")
    private static class99 field3303 = class221.method1463(2844, "Wed");

    @OriginalMember(owner = "client!bd", name = "i", descriptor = "Loa;")
    private static class99 field3310 = class221.method1463(2844, "K");

    @OriginalMember(owner = "client!bd", name = "j", descriptor = "Loa;")
    private static class99 field3311 = class221.method1463(2844, "Thu");

    @OriginalMember(owner = "client!bd", name = "m", descriptor = "Loa;")
    public static class99 field3314 = field3310;

    @OriginalMember(owner = "client!bd", name = "h", descriptor = "Loa;")
    private static class99 field3309 = class221.method1463(2844, "Mon");

    @OriginalMember(owner = "client!bd", name = "o", descriptor = "Loa;")
    private static class99 field3316 = class221.method1463(2844, "Tue");

    @OriginalMember(owner = "client!bd", name = "q", descriptor = "Loa;")
    public static class99 field3318 = field3310;

    @OriginalMember(owner = "client!bd", name = "e", descriptor = "Loa;")
    private static class99 field3306 = class221.method1463(2844, "Sun");

    @OriginalMember(owner = "client!bd", name = "r", descriptor = "Loa;")
    private static class99 field3319 = class221.method1463(2844, "Sat");

    @OriginalMember(owner = "client!bd", name = "l", descriptor = "I")
    public static int field3313 = 0;

    @OriginalMember(owner = "client!bd", name = "u", descriptor = "Loa;")
    private static class99 field3322 = class221.method1463(2844, "Fri");

    @OriginalMember(owner = "client!bd", name = "v", descriptor = "[Loa;")
    public static class99[] field3323 = new class99[] { field3306, field3309, field3316, field3303, field3311, field3322, field3319 };

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "I")
    public static int field3302;

    @OriginalMember(owner = "client!bd", name = "c", descriptor = "I")
    public static int field3304;

    @OriginalMember(owner = "client!bd", name = "f", descriptor = "I")
    public static int field3307;

    @OriginalMember(owner = "client!bd", name = "g", descriptor = "I")
    public static int field3308;

    @OriginalMember(owner = "client!bd", name = "k", descriptor = "I")
    public static int field3312;

    @OriginalMember(owner = "client!bd", name = "n", descriptor = "I")
    public static int field3315;

    @OriginalMember(owner = "client!bd", name = "p", descriptor = "I")
    public static int field3317;

    @OriginalMember(owner = "client!bd", name = "s", descriptor = "I")
    public static int field3320;

    @OriginalMember(owner = "client!bd", name = "d", descriptor = "Ltg;")
    public static class182 field3305;

    @OriginalMember(owner = "client!bd", name = "t", descriptor = "Ltg;")
    public static class182 field3321;

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BLtg;)V")
    public static final void method1278(byte arg0, class182 arg1) {
        class115.field2044 = arg1;
        field3320++;
        if (arg0 != -74) {
            field3314 = null;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(II)V")
    public static final void method1279(int arg0, int arg1) {
        field3312++;
        if (class53.field873 == arg0) {
            class116.field2065.method146(122, arg1);
        } else {
            class48.field797 = arg1;
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IIIII)V")
    public static final void method1280(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3317++;
        for (class80 var5 = (class80) class93.field1568.method529(10); var5 != null; var5 = (class80) class93.field1568.method533(-74)) {
            class130.method859(arg3, arg4, var5, arg1, (byte) -70, arg2);
        }
        if (arg0 != 0) {
            field3314 = null;
        }
        for (class80 var6 = (class80) class111.field2002.method529(arg0 + 10); var6 != null; var6 = (class80) class111.field2002.method533(106)) {
            byte var10 = 1;
            if (var6.field1420.field1308 == var6.field1420.field1282) {
                var10 = 0;
            } else if (var6.field1420.field1333 == var6.field1420.field1282) {
                var10 = 2;
            }
            if (var6.field1405 != var10) {
                int var11 = class30.method255(31, var6.field1420);
                if (var6.field1426 != var11) {
                    if (var6.field1425 != null) {
                        class165.field2899.method1076(var6.field1425);
                        var6.field1425 = null;
                    }
                    var6.field1426 = var11;
                }
                var6.field1405 = var10;
            }
            var6.field1424 = var6.field1420.field1325;
            var6.field1408 = var6.field1420.field1325 + var6.field1420.method516((byte) -65) * 64;
            var6.field1415 = var6.field1420.field1301;
            var6.field1423 = var6.field1420.field1301 + (var6.field1420.method516((byte) -65) * 64);
            class130.method859(arg3, arg4, var6, arg1, (byte) 98, arg2);
        }
        for (class80 var7 = (class80) class220.field3831.method1552(94); var7 != null; var7 = (class80) class220.field3831.method1549(arg0 + 74)) {
            byte var8 = 1;
            if (var7.field1403.field1308 == var7.field1403.field1282) {
                var8 = 0;
            } else if (var7.field1403.field1333 == var7.field1403.field1282) {
                var8 = 2;
            }
            if (var7.field1405 != var8) {
                int var9 = class281.method1852(true, var7.field1403);
                if (var7.field1426 != var9) {
                    if (var7.field1425 != null) {
                        class165.field2899.method1076(var7.field1425);
                        var7.field1425 = null;
                    }
                    var7.field1426 = var9;
                }
                var7.field1405 = var8;
            }
            var7.field1424 = var7.field1403.field1325;
            var7.field1408 = var7.field1403.field1325 + (var7.field1403.method516((byte) -65) * 64);
            var7.field1415 = var7.field1403.field1301;
            var7.field1423 = var7.field1403.field1301 + var7.field1403.method516((byte) -65) * 64;
            class130.method859(arg3, arg4, var7, arg1, (byte) 94, arg2);
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(III)Z")
    public static final boolean method1281(int arg0, int arg1, int arg2) {
        int var3 = class94.field1585[arg0][arg1][arg2];
        if (-class112.field2022 == var3) {
            return false;
        } else if (class112.field2022 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class181.method1208(var4 + 1, class189.field3337[arg0][arg1][arg2], var5 + 1) && class181.method1208(var4 + 128 - 1, class189.field3337[arg0][arg1 + 1][arg2], var5 + 1) && class181.method1208(var4 + 128 - 1, class189.field3337[arg0][arg1 + 1][arg2 + 1], var5 + 128 - 1) && class181.method1208(var4 + 1, class189.field3337[arg0][arg1][arg2 + 1], var5 + 128 - 1)) {
                class94.field1585[arg0][arg1][arg2] = class112.field2022;
                return true;
            } else {
                class94.field1585[arg0][arg1][arg2] = -class112.field2022;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IZBI)V")
    public static final void method1282(int arg0, boolean arg1, byte arg2, int arg3) {
        field3302++;
        if (arg3 < 8000 || arg3 > 48000) {
            throw new IllegalArgumentException();
        }
        class85.field1468 = arg1;
        int var4 = -3 / ((arg2 - 3) / 33);
        class225.field3905 = arg3;
        class108.field1955 = arg0;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(BJ)Loa;")
    public static final class99 method1283(byte arg0, long arg1) {
        field3308++;
        return arg0 >= -92 ? null : class182.method1227((byte) 103, false, 10, arg1);
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(IB)Lrb;")
    public static final class269 method1284(int arg0, byte arg1) {
        class269 var2 = (class269) class82.field1438.method512((byte) 73, (long) arg0);
        field3315++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class111.field2014.method1242(0, arg0, 6801);
        if (var3 == null) {
            return null;
        }
        class269 var4 = new class269();
        class261 var5 = new class261(var3);
        var5.field4587 = var5.field4619.length - 2;
        int var6 = var5.method1740((byte) 119);
        int var7 = var5.field4619.length - var6 - 12 - 2;
        var5.field4587 = var7;
        int var8 = var5.method1712(-4);
        var4.field4721 = var5.method1740((byte) 126);
        var4.field4737 = var5.method1740((byte) 69);
        var4.field4725 = var5.method1740((byte) 96);
        var4.field4728 = var5.method1740((byte) 68);
        int var9 = var5.method1693((byte) -105);
        if (var9 > 0) {
            var4.field4739 = new class237[var9];
            for (int var10 = 0; var10 < var9; var10++) {
                int var11 = var5.method1740((byte) 92);
                class237 var12 = new class237(class48.method342(1049852161, var11));
                var4.field4739[var10] = var12;
                while ((var11--) > 0) {
                    int var13 = var5.method1712(-4);
                    int var14 = var5.method1712(-4);
                    var12.method1544((byte) -97, (long) var13, new class208(var14));
                }
            }
        }
        var5.field4587 = 0;
        var4.field4730 = var5.method1738(-30056);
        int var15 = 0;
        var4.field4738 = new int[var8];
        int var16 = 48 / ((arg1 - 16) / 47);
        var4.field4723 = new int[var8];
        var4.field4734 = new class99[var8];
        while (var7 > var5.field4587) {
            int var17 = var5.method1740((byte) 92);
            if (var17 == 3) {
                var4.field4734[var15] = var5.method1705(-21);
            } else if (var17 >= 100 || var17 == 21 || var17 == 38 || var17 == 39) {
                var4.field4738[var15] = var5.method1693((byte) -91);
            } else {
                var4.field4738[var15] = var5.method1712(-4);
            }
            var4.field4723[var15++] = var17;
        }
        class82.field1438.method511(88, var4, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(I)V")
    public static void method1285(int arg0) {
        field3323 = null;
        field3306 = null;
        field3314 = null;
        field3311 = null;
        field3305 = null;
        field3309 = null;
        field3310 = null;
        field3316 = null;
        field3321 = null;
        field3303 = null;
        if (arg0 != 1) {
            field3309 = null;
        }
        field3318 = null;
        field3322 = null;
        field3319 = null;
    }

    @OriginalMember(owner = "client!bd", name = "a", descriptor = "(Z)V")
    public static final void method1286(boolean arg0) {
        if (arg0) {
            method1280(2, -108, -10, 98, -100);
        }
        field3307++;
        int var1 = class94.method635(126);
        if (var1 == 0) {
            class228.field3951 = null;
            class193.method1310(46, 0);
        } else if (var1 == 1) {
            class117.method790((byte) 0, arg0);
            class193.method1310(-110, 512);
            class247.method1599(0);
        } else {
            class117.method790((byte) (class55.field904 - 4 & 0xFF), false);
            class193.method1310(-108, 2);
        }
    }
}
