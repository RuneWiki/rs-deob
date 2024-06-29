import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class173 extends class183 {

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field2174 = -50;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "[I")
    public static int[] field2168 = new int[256];

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public int field2167;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "I")
    public int field2170;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2171;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    public int field2172;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "I")
    public int field2173;

    @OriginalMember(owner = "client!hq", name = "s", descriptor = "I")
    public static int field2175;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "Llo;")
    public class419 field2169;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)Lsn;")
    public static final class449 method906(int arg0, int arg1, int arg2) {
        class96 var3 = class176.field2209[arg0][arg1][arg2];
        return var3 == null ? null : var3.field1128;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILvm;Lwm;IILol;IIZLvm;ZI)Llg;")
    public static final class20 method907(int arg0, class322 arg1, class298 arg2, int arg3, int arg4, class335 arg5, int arg6, int arg7, boolean arg8, class322 arg9, boolean arg10, int arg11) {
        field2171++;
        class20 var12 = class281.method1657(arg9, arg0, arg5, -10094, arg11, arg4, arg3, arg6);
        if (var12 != null) {
            return var12;
        }
        if (arg7 <= 57) {
            method906(-84, 67, -73);
        }
        class123 var13 = class65.method368(arg6, -123);
        if (arg11 > 1 && var13.field1577 != null) {
            int var14 = -1;
            for (int var15 = 0; var15 < 10; var15++) {
                if (var13.field1591[var15] <= arg11 && var13.field1591[var15] != 0) {
                    var14 = var13.field1577[var15];
                }
            }
            if (var14 != -1) {
                var13 = class65.method368(var14, -123);
            }
        }
        class390 var16 = class208.method1122(class216.field2900, 0, -71, var13.field1545);
        if (var16 == null) {
            return null;
        }
        if (var13.field1557 != null) {
            for (int var17 = 0; var17 < var13.field1557.length; var17++) {
                if (var13.field1539 == null || var13.field1539.length <= var17) {
                    var16.method2432(false, var13.field1557[var17], var13.field1521[var17]);
                } else {
                    var16.method2432(false, var13.field1557[var17], class259.field3525[var13.field1539[var17] & 0xFF]);
                }
            }
        }
        if (var13.field1573 != null) {
            for (int var18 = 0; var18 < var13.field1573.length; var18++) {
                var16.method2427(var13.field1573[var18], var13.field1542[var18], -1);
            }
        }
        if (arg5 != null) {
            for (int var19 = 0; var19 < 5; var19++) {
                if (class309.field4178[var19].length > arg5.field4450[var19]) {
                    var16.method2432(false, class392.field5647[var19], class309.field4178[var19][arg5.field4450[var19]]);
                }
                if (class38.field395[var19].length > arg5.field4450[var19]) {
                    var16.method2432(false, class188.field2368[var19], class38.field395[var19][arg5.field4450[var19]]);
                }
            }
        }
        int var20 = 1024;
        boolean var21 = false;
        if (var13.field1586 != 128 || var13.field1571 != 128 || var13.field1553 != 128) {
            var20 |= 0x7;
            var21 = true;
        }
        class396 var22 = arg1.method1651(var16, var20, 0, var13.field1559 + 64, var13.field1520 + 768);
        if (!var22.method2272()) {
            return null;
        }
        if (var21) {
            var22.method2264(var13.field1586, var13.field1571, var13.field1553);
        }
        class20 var23 = null;
        if (var13.field1529 != -1) {
            var23 = method907(0, arg1, arg2, 1, 0, arg5, var13.field1525, 75, true, arg9, true, 10);
            if (var23 == null) {
                return null;
            }
        } else if (var13.field1531 != -1) {
            var23 = method907(arg0, arg1, arg2, arg3, 0, arg5, var13.field1523, 79, true, arg9, false, arg11);
            if (var23 == null) {
                return null;
            }
        }
        int var24 = var13.field1533;
        arg1.method1589(16, 16, 512, 512);
        if (arg10) {
            var24 = (int) ((double) var24 * 1.5D);
        } else if (arg3 == 2) {
            var24 = (int) ((double) var24 * 1.04D);
        }
        class247 var25 = arg1.method1586();
        var25.method746();
        arg1.method1611(var25);
        arg1.method1568(1.0F);
        arg1.method1587(16777215, 1.0F, 1.0F, -50.0F, -10.0F, -50.0F);
        class247 var26 = arg1.method1650();
        var26.method744(-var13.field1555 << 3);
        var26.method749(var13.field1528 << 3);
        var26.method742(var13.field1585, (class356.field5037[var13.field1535 << 3] * var24 >> 15) - (var22.method2299() / 2 - var13.field1564), (class356.field5025[var13.field1535 << 3] * var24 >> 15) - -var13.field1564);
        var26.method743(var13.field1535 << 3);
        int var27 = arg1.method1617();
        int var28 = arg1.method1621();
        arg1.method1600(50, Integer.MAX_VALUE);
        arg1.method1613();
        arg1.method1584();
        arg1.method1614(0, 0, 36, 32, 0, 0);
        var22.method2284(var26, (class447) null, 1);
        arg1.method1600(var27, var28);
        int[] var29 = arg1.method1642(0, 0, 36, 32);
        if (arg3 >= 1) {
            var29 = class153.method812(-16777215, 0, var29);
            if (arg3 >= 2) {
                var29 = class153.method812(-1, 0, var29);
            }
        }
        if (arg0 != 0) {
            class338.method1968((byte) -69, arg0, var29);
        }
        arg1.method1637(var29, 0, 36, 36, 32).method93(0, 0);
        if (var13.field1529 != -1) {
            var23.method93(0, 0);
        } else if (var13.field1531 != -1) {
            var23.method93(0, 0);
        }
        if (arg4 == 1 || arg4 == 2 && (var13.field1517 == 1 || arg11 != 1) && arg11 != -1) {
            arg2.method1746(-256, class303.method1784((byte) 64, arg11), 0, (byte) -118, -16777215, 9);
        }
        int[] var30 = arg1.method1642(0, 0, 36, 32);
        for (int var31 = 0; var31 < var30.length; var31++) {
            if ((var30[var31] & 0xFFFFFF) == 0) {
                var30[var31] = 0;
            } else {
                var30[var31] = class392.method2441(var30[var31], -16777216);
            }
        }
        class20 var32;
        if (arg8) {
            var32 = arg1.method1637(var30, 0, 36, 36, 32);
        } else {
            var32 = arg9.method1637(var30, 0, 36, 36, 32);
        }
        if (!arg8) {
            class51 var33 = new class51();
            var33.field493 = arg5 != null;
            var33.field490 = arg11;
            var33.field502 = arg6;
            var33.field499 = arg4;
            var33.field494 = arg0;
            var33.field501 = arg9.field4307;
            var33.field491 = arg3;
            class119.field1482.method704(-1676, var33, var32);
        }
        return var32;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static void method908(int arg0) {
        field2168 = null;
        if (arg0 != 128) {
            method909((class286) null, (class286) null, false);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lam;Lam;Z)V")
    public static final void method909(class286 arg0, class286 arg1, boolean arg2) {
        if (!arg2) {
            method909((class286) null, (class286) null, true);
        }
        class389.field5571 = arg1;
        class151.field1909 = arg0;
        field2175++;
    }
}
