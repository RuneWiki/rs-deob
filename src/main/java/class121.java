import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wb")
public class class121 {

    @OriginalMember(owner = "client!wb", name = "e", descriptor = "Lnn;")
    public static class151 field1591 = new class151("Loading...", "Lade...", "Chargement en cours...", "Carregando...");

    @OriginalMember(owner = "client!wb", name = "i", descriptor = "I")
    public static int field1595 = 0;

    @OriginalMember(owner = "client!wb", name = "l", descriptor = "I")
    public static int field1598 = 0;

    @OriginalMember(owner = "client!wb", name = "k", descriptor = "Z")
    public static boolean field1597 = false;

    @OriginalMember(owner = "client!wb", name = "g", descriptor = "I")
    public static int field1593 = 0;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "I")
    public static int field1587;

    @OriginalMember(owner = "client!wb", name = "b", descriptor = "I")
    public static int field1588;

    @OriginalMember(owner = "client!wb", name = "c", descriptor = "I")
    public static int field1589;

    @OriginalMember(owner = "client!wb", name = "d", descriptor = "I")
    public static int field1590;

    @OriginalMember(owner = "client!wb", name = "f", descriptor = "I")
    public static int field1592;

    @OriginalMember(owner = "client!wb", name = "j", descriptor = "I")
    public static int field1596;

    @OriginalMember(owner = "client!wb", name = "h", descriptor = "Liq;")
    public static class134 field1594;

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(B)V")
    public static final void method726(byte arg0) {
        class45.field562 = null;
        class221.field3372 = null;
        class269.field4087 = null;
        field1588++;
        class354.field5235 = null;
        class289.field4390 = null;
        class212.field3196 = null;
        class355.field5243 = null;
        class145.field1943 = null;
        class449.field6614 = null;
        class137.field1861 = null;
        if (arg0 >= 105) {
            class14.field172 = null;
            class68.field874 = null;
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Ljk;I)V")
    public static final void method727(class119 arg0, int arg1) {
        field1592++;
        arg0.method710(255);
        int var2 = 0;
        for (int var3 = 0; var3 < class307.field4634; var3++) {
            int var15 = class201.field3038[var3];
            if ((class335.field4987[var15] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class335.field4987[var15] = (byte) class276.method1712(class335.field4987[var15], 2);
                } else {
                    int var16 = arg0.method717(1, false);
                    if (var16 == 0) {
                        var2 = class407.method2553(1, arg0);
                        class335.field4987[var15] = (byte) class276.method1712(class335.field4987[var15], 2);
                    } else {
                        class82.method529(arg0, (byte) 97, var15);
                    }
                }
            }
        }
        arg0.method709(-17701);
        if (var2 != 0) {
            throw new RuntimeException("nsn0");
        }
        arg0.method710(255);
        for (int var4 = 0; var4 < class307.field4634; var4++) {
            int var13 = class201.field3038[var4];
            if ((class335.field4987[var13] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class335.field4987[var13] = (byte) class276.method1712(class335.field4987[var13], 2);
                } else {
                    int var14 = arg0.method717(1, false);
                    if (var14 == 0) {
                        var2 = class407.method2553(1, arg0);
                        class335.field4987[var13] = (byte) class276.method1712(class335.field4987[var13], 2);
                    } else {
                        class82.method529(arg0, (byte) 116, var13);
                    }
                }
            }
        }
        arg0.method709(-17701);
        if (var2 != 0) {
            throw new RuntimeException("nsn1");
        }
        arg0.method710(255);
        for (int var5 = 0; var5 < class402.field6004; var5++) {
            int var11 = class411.field6115[var5];
            if ((class335.field4987[var11] & 0x1) != 0) {
                if (var2 > 0) {
                    var2--;
                    class335.field4987[var11] = (byte) class276.method1712(class335.field4987[var11], 2);
                } else {
                    int var12 = arg0.method717(1, false);
                    if (var12 == 0) {
                        var2 = class407.method2553(1, arg0);
                        class335.field4987[var11] = (byte) class276.method1712(class335.field4987[var11], 2);
                    } else if (class37.method210((byte) -86, var11, arg0)) {
                        class335.field4987[var11] = (byte) class276.method1712(class335.field4987[var11], 2);
                    }
                }
            }
        }
        arg0.method709(-17701);
        if (var2 != 0) {
            throw new RuntimeException("nsn2");
        }
        arg0.method710(255);
        if (arg1 >= -2) {
            method731(true, (class134) null, false, -28, (class134) null);
        }
        for (int var6 = 0; var6 < class402.field6004; var6++) {
            int var9 = class411.field6115[var6];
            if ((class335.field4987[var9] & 0x1) == 0) {
                if (var2 > 0) {
                    var2--;
                    class335.field4987[var9] = (byte) class276.method1712(class335.field4987[var9], 2);
                } else {
                    int var10 = arg0.method717(1, false);
                    if (var10 == 0) {
                        var2 = class407.method2553(1, arg0);
                        class335.field4987[var9] = (byte) class276.method1712(class335.field4987[var9], 2);
                    } else if (class37.method210((byte) -86, var9, arg0)) {
                        class335.field4987[var9] = (byte) class276.method1712(class335.field4987[var9], 2);
                    }
                }
            }
        }
        arg0.method709(-17701);
        if (var2 != 0) {
            throw new RuntimeException("nsn3");
        }
        class402.field6004 = 0;
        class307.field4634 = 0;
        for (int var7 = 1; var7 < 2048; var7++) {
            class335.field4987[var7] = (byte) (class335.field4987[var7] >> 1);
            class169 var8 = class140.field1883[var7];
            if (var8 == null) {
                class411.field6115[class402.field6004++] = var7;
            } else {
                class201.field3038[class307.field4634++] = var7;
            }
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Lmr;Z)V")
    public static final void method728(class145 arg0, boolean arg1) {
        field1590++;
        boolean var2 = arg1;
        if (class26.field332 == arg0.field1978 || arg0.field1955 == -1 || arg0.field1935 != 0) {
            var2 = true;
        } else {
            class379 var3 = class98.method629(arg0.field1955, (byte) -115);
            if (var3.field5532 || var3.field5540[arg0.field1928] < (arg0.field1962 + 1)) {
                var2 = true;
            }
        }
        if (var2) {
            int var4 = arg0.field1978 - arg0.field2004;
            int var5 = class26.field332 - arg0.field2004;
            int var6 = arg0.field1950 * 128 + (arg0.method911(0) * 64);
            int var7 = arg0.field1958 * 128 + arg0.method911(0) * 64;
            int var8 = arg0.field1951 * 128 + arg0.method911(0) * 64;
            int var9 = arg0.field1966 * 128 + arg0.method911(0) * 64;
            arg0.field1900 = ((var4 - var5) * var6 + (var5 * var8)) / var4;
            arg0.field1892 = ((var4 - var5) * var7 + var5 * var9) / var4;
        }
        arg0.field2015 = 0;
        if (arg0.field1998 == 0) {
            arg0.method909(8192, 16383);
        }
        if (arg0.field1998 == 1) {
            arg0.method909(12288, 16383);
        }
        if (arg0.field1998 == 2) {
            arg0.method909(0, 16383);
        }
        if (arg0.field1998 == 3) {
            arg0.method909(4096, 16383);
        }
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(Z)V")
    public static void method729(boolean arg0) {
        field1591 = null;
        if (arg0) {
            field1591 = null;
        }
        field1594 = null;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(IIILfh;ILor;IILdr;)V")
    public static final void method730(int arg0, int arg1, int arg2, class170 arg3, int arg4, class153 arg5, int arg6, int arg7, class261 arg8) {
        field1589++;
        class228 var9 = class20.method125(arg2, 36);
        if (arg0 < 42) {
            method730(-5, -16, 64, (class170) null, -84, (class153) null, 95, -31, (class261) null);
        }
        if (var9 == null || !var9.field3478 || !var9.method1387(91)) {
            return;
        }
        if (var9.field3474 != null) {
            int[] var10 = new int[var9.field3474.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class80.field1054 == 4) {
                    var13 = (int) class462.field6810 & 0x3FFF;
                } else {
                    var13 = (int) class462.field6810 + class3.field39 & 0x3FFF;
                }
                int var14 = class110.field1450[var13];
                int var15 = class110.field1452[var13];
                if (class80.field1054 != 4) {
                    var14 = var14 * 256 / (class343.field5138 + 256);
                    var15 = var15 * 256 / (class343.field5138 + 256);
                }
                var10[var11 * 2] = arg6 - (-((arg7 + (var9.field3474[var11 * 2] * 4)) * var15 + (var9.field3474[var11 * 2 + 1] * 4 + arg1) * var14 >> 15) - (arg3.field2561 / 2));
                var10[var11 * 2 + 1] = arg4 + (arg3.field2501 / 2) - ((var9.field3474[var11 * 2 + 1] * 4 + arg1) * var15 - ((arg7 + (var9.field3474[var11 * 2] * 4)) * var14) >> 15);
            }
            class182.method1097(arg8, var10, var9.field3486, arg3.field2536, arg3.field2628);
            for (int var12 = 0; var12 < (var10.length / 2 - 1); var12++) {
                arg8.method385(var10[var12 * 2], var10[var12 * 2 + 1], var10[(var12 + 1) * 2], var10[(var12 + 1) * 2 + 1], var9.field3458, 1, arg5, arg6, arg4);
            }
            arg8.method385(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3458, 1, arg5, arg6, arg4);
        }
        class234 var16 = null;
        if (var9.field3454 != -1) {
            var16 = var9.method1381(arg8, false, 6234);
            if (var16 != null) {
                class171.method1055(var16, 0, arg5, arg3, arg4, arg6, arg7, arg1);
            }
        }
        if (var9.field3489 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method1229();
        }
        class137 var18 = class284.field4334;
        class272 var19 = class148.field2044;
        if (var9.field3463 == 1) {
            var19 = class458.field6795;
            var18 = class380.field5552;
        }
        if (var9.field3463 == 2) {
            var18 = class161.field2244;
            var19 = class188.field2828;
        }
        class335.method2047(var17, var19, arg3, 9349, arg1, arg6, arg4, arg7, var18, arg5, var9.field3489, var9.field3464);
        return;
    }

    @OriginalMember(owner = "client!wb", name = "a", descriptor = "(ZLiq;ZILiq;)V")
    public static final void method731(boolean arg0, class134 arg1, boolean arg2, int arg3, class134 arg4) {
        class217.field3306 = arg1;
        class164.field2291 = arg4;
        field1587++;
        class245.field3668 = arg0;
        if (arg2) {
            class212.field3195 = arg3;
        }
    }
}
