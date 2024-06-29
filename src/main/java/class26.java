import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class26 {

    @OriginalMember(owner = "client!cd", name = "b", descriptor = "Lvd;")
    public static class222 field591 = class212.method1357("sind fehlgeschlagen)3 Bitte warten Sie 5 Minuten)1", 10731);

    @OriginalMember(owner = "client!cd", name = "h", descriptor = "I")
    public static int field597 = -1;

    @OriginalMember(owner = "client!cd", name = "e", descriptor = "Lvd;")
    public static class222 field594 = class212.method1357("; version=1; path=)4; domain=", 10731);

    @OriginalMember(owner = "client!cd", name = "g", descriptor = "D")
    public static double field596 = -1.0D;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "I")
    public static int field590;

    @OriginalMember(owner = "client!cd", name = "c", descriptor = "I")
    public static int field592;

    @OriginalMember(owner = "client!cd", name = "d", descriptor = "I")
    public static int field593;

    @OriginalMember(owner = "client!cd", name = "f", descriptor = "I")
    public static int field595;

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(I)V")
    public static final void method224(int arg0) {
        field590++;
        for (int var1 = arg0; var1 < class162.field3088; var1++) {
            int var2 = class122.field2341[var1];
            class193 var3 = class202.field3696[var2];
            int var4 = class21.field505.method662((byte) -101);
            if ((var4 & 0x8) != 0) {
                var3.field1309 = class21.field505.method675(2);
                int var5 = class21.field505.method704(-1405);
                var3.field1340 = var5 >> 16;
                var3.field1327 = class175.field3280 + (var5 & 0xFFFF);
                var3.field1362 = 0;
                if (class175.field3280 < var3.field1327) {
                    var3.field1362 = -1;
                }
                var3.field1373 = 0;
                if (var3.field1309 == 65535) {
                    var3.field1309 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                int var6 = class21.field505.method675(2);
                int var7 = class21.field505.method662((byte) -87);
                if (var6 == 65535) {
                    var6 = -1;
                }
                if (var3.field1323 == var6 && var6 != -1) {
                    class183 var8 = class93.method599((byte) -21, var6);
                    int var9 = var8.field3407;
                    if (var9 == 1) {
                        var3.field1359 = 0;
                        var3.field1318 = 0;
                        var3.field1375 = 0;
                        var3.field1338 = var7;
                        class120.method770(var8, arg0 + 117, var3.field1318, false, var3.field1353, var3.field1360);
                    }
                    if (var9 == 2) {
                        var3.field1375 = 0;
                    }
                } else if (var6 == -1 || var3.field1323 == -1 || class93.method599((byte) -87, var6).field3380 >= class93.method599((byte) -80, var3.field1323).field3380) {
                    var3.field1375 = 0;
                    var3.field1359 = 0;
                    var3.field1338 = var7;
                    var3.field1363 = var3.field1326;
                    var3.field1323 = var6;
                    var3.field1318 = 0;
                    if (var3.field1323 != -1) {
                        class120.method770(class93.method599((byte) -101, var3.field1323), 127, var3.field1318, false, var3.field1353, var3.field1360);
                    }
                }
            }
            if ((var4 & 0x80) != 0) {
                var3.field1330 = class21.field505.method686(arg0 - 107);
                if (var3.field1330 == 65535) {
                    var3.field1330 = -1;
                }
            }
            if ((var4 & 0x10) != 0) {
                int var10 = class21.field505.method688((byte) -53);
                int var11 = class21.field505.method680(-20040);
                var3.method481(false, class175.field3280, var10, var11);
            }
            if ((var4 & 0x4) != 0) {
                var3.field1336 = class21.field505.method686(-121);
                var3.field1356 = class21.field505.method675(2);
            }
            if ((var4 & 0x40) != 0) {
                var3.field3558 = class31.method254((byte) -107, class21.field505.method675(2));
                var3.field1350 = var3.field3558.field2138;
                var3.field1354 = var3.field3558.field2141;
                var3.field1364 = var3.field3558.field2155;
                var3.field1319 = var3.field3558.field2147;
                var3.field1331 = var3.field3558.field2151;
                var3.field1324 = var3.field3558.field2164;
                var3.field1311 = var3.field3558.field2142;
                var3.field1322 = var3.field3558.field2168;
                var3.field1355 = var3.field3558.field2167;
            }
            if ((var4 & 0x1) != 0) {
                var3.field1374 = class21.field505.method674(-37);
                var3.field1376 = 100;
            }
            if ((var4 & 0x2) != 0) {
                int var12 = class21.field505.method688((byte) -119);
                int var13 = class21.field505.method680(arg0 ^ 0xFFFFB1B8);
                var3.method481(false, class175.field3280, var12, var13);
                var3.field1352 = class175.field3280 + 300;
                var3.field1366 = class21.field505.method688((byte) -28);
            }
        }
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(III)I")
    public static final int method225(int arg0, int arg1, int arg2) {
        field595++;
        int var3 = class216.method1372(-25979, 4, arg0 - arg2, arg1 + 45365) + (class216.method1372(arg2 ^ 0x10268, 2, arg0 + 37821, arg1 + 10294) - 128 >> 1) + (class216.method1372(-25979, 1, arg0, arg1) + -128 >> 2) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(B)V")
    public static void method226(byte arg0) {
        field591 = null;
        int var1 = 45 % ((22 - arg0) / 63);
        field594 = null;
    }

    @OriginalMember(owner = "client!cd", name = "a", descriptor = "(IIIILe;IJIIII)Z")
    public static final boolean method227(int arg0, int arg1, int arg2, int arg3, class44 arg4, int arg5, long arg6, int arg7, int arg8, int arg9, int arg10) {
        return arg4 == null ? true : class121.method774(arg0, arg7, arg8, arg9 + 1 - arg7, arg10 - arg8 + 1, arg1, arg2, arg3, arg4, arg5, true, arg6);
    }
}
