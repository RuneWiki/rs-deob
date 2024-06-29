import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class3 {

    @OriginalMember(owner = "client!qd", name = "e", descriptor = "[I")
    public static int[] field32 = new int[2];

    @OriginalMember(owner = "client!qd", name = "b", descriptor = "Z")
    public static boolean field29 = true;

    @OriginalMember(owner = "client!qd", name = "f", descriptor = "S")
    public static short field33 = 1;

    @OriginalMember(owner = "client!qd", name = "d", descriptor = "Lcc;")
    public static class216 field31 = new class216(50);

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qd", name = "c", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qd", name = "g", descriptor = "Llc;")
    public static class86 field34;

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(II)V")
    public static final void method11(int arg0, int arg1) {
        field30++;
        int var2 = class121.field1772;
        if (arg0 == 0) {
            var2 = 1;
        }
        if (arg1 != -3905) {
            method13(95, (byte) -26);
        }
        int var10002;
        for (int var3 = 0; var3 < var2; var3++) {
            class29 var20;
            if (arg0 == 0) {
                var20 = class186.field2993;
            } else {
                var20 = class92.field1374[class207.field3326[var3]];
            }
            if (var20 != null && var20.method123((byte) 85)) {
                int var21 = var20.method205(-59);
                if (arg0 == 0 || arg0 == var21) {
                    if (var21 == 1) {
                        if ((var20.field1979 & 0x7F) == 64 && (var20.field1910 & 0x7F) == 64) {
                            int var22 = var20.field1979 >> 7;
                            int var23 = var20.field1910 >> 7;
                            if (var22 >= 0 && var22 < 104 && var23 >= 0 && var23 < 104) {
                                var10002 = class267.field4316[var22][var23]++;
                            }
                        }
                    } else if (((var21 & 0x1) != 0 || (var20.field1979 & 0x7F) == 0 && (var20.field1910 & 0x7F) == 0) && ((var21 & 0x1) != 1 || (var20.field1979 & 0x7F) == 64 && (var20.field1910 & 0x7F) == 64)) {
                        int var24 = var20.field1979 - var21 * 64 >> 7;
                        int var25 = var20.field1910 - (var21 * 64) >> 7;
                        int var26 = var20.method205(113) + var24;
                        int var27 = var25 + var20.method205(-124);
                        if (var26 > 104) {
                            var26 = 104;
                        }
                        if (var25 < 0) {
                            var25 = 0;
                        }
                        if (var24 < 0) {
                            var24 = 0;
                        }
                        if (var27 > 104) {
                            var27 = 104;
                        }
                        for (int var28 = var24; var28 < var26; var28++) {
                            for (int var29 = var25; var29 < var27; var29++) {
                                var10002 = class267.field4316[var28][var29]++;
                            }
                        }
                    }
                }
            }
        }
        label216: for (int var4 = 0; var4 < var2; var4++) {
            long var5;
            class29 var7;
            if (arg0 == 0) {
                var5 = 8791798054912L;
                var7 = class186.field2993;
            } else {
                var5 = (long) class207.field3326[var4] << 32;
                var7 = class92.field1374[class207.field3326[var4]];
            }
            if (var7 != null && var7.method123((byte) 85)) {
                int var8 = var7.method205(arg1 ^ 0xF3E);
                if (arg0 == 0 || arg0 == var8) {
                    var7.field338 = false;
                    var7.field1976 = true;
                    if ((class144.field2328 && class121.field1772 > 200 || class121.field1772 > 50) && arg0 != 0 && var7.field1966 == var7.method917((byte) 121).field3760) {
                        var7.field338 = true;
                    }
                    if (var8 == 1) {
                        if ((var7.field1979 & 0x7F) == 64 && (var7.field1910 & 0x7F) == 64) {
                            int var18 = var7.field1979 >> 7;
                            int var19 = var7.field1910 >> 7;
                            if (var18 < 0 || var18 >= 104 || var19 < 0 || var19 >= 104) {
                                continue;
                            }
                            if (class267.field4316[var18][var19] > 1) {
                                var10002 = class267.field4316[var18][var19]--;
                                continue;
                            }
                        }
                    } else if ((var8 & 0x1) == 0 && (var7.field1979 & 0x7F) == 0 && (var7.field1910 & 0x7F) == 0 || (var8 & 0x1) == 1 && (var7.field1979 & 0x7F) == 64 && (var7.field1910 & 0x7F) == 0) {
                        int var9 = var7.field1979 - (var8 * 64) >> 7;
                        int var10 = var9 + var8;
                        int var11 = var7.field1910 - var8 * 64 >> 7;
                        if (var9 < 0) {
                            var9 = 0;
                        }
                        if (var10 > 104) {
                            var10 = 104;
                        }
                        boolean var12 = true;
                        int var13 = var8 + var11;
                        if (var13 > 104) {
                            var13 = 104;
                        }
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        for (int var14 = var9; var14 < var10; var14++) {
                            for (int var17 = var11; var17 < var13; var17++) {
                                if (class267.field4316[var14][var17] <= 1) {
                                    var12 = false;
                                    break;
                                }
                            }
                        }
                        if (var12) {
                            int var15 = var9;
                            while (true) {
                                if (var15 >= var10) {
                                    continue label216;
                                }
                                for (int var16 = var11; var16 < var13; var16++) {
                                    var10002 = class267.field4316[var15][var16]--;
                                }
                                var15++;
                            }
                        }
                    }
                    if (var7.field1931 == null || var7.field1945 > class264.field4290 || class264.field4290 >= var7.field1946) {
                        var7.field1976 = false;
                        var7.field1950 = class129.method930(var7.field1910, var7.field1979, 102, class58.field826);
                        class254.method1798(class58.field826, var7.field1979, var7.field1910, var7.field1950, var8 * 64 - 4, var7, var7.field1893, var5, var7.field1907);
                    } else {
                        var7.field338 = false;
                        var7.field1976 = false;
                        var7.field1950 = class129.method930(var7.field1910, var7.field1979, 100, class58.field826);
                        class92.method721(class58.field826, var7.field1979, var7.field1910, var7.field1950, var7, var7.field1893, var5, var7.field1880, var7.field1876, var7.field1967, var7.field1939);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(B)V")
    public static void method12(byte arg0) {
        field34 = null;
        field31 = null;
        if (arg0 != 106) {
            method11(92, 88);
        }
        field32 = null;
    }

    @OriginalMember(owner = "client!qd", name = "a", descriptor = "(IB)Luj;")
    public static final class287 method13(int arg0, byte arg1) {
        field28++;
        int var2 = -125 / ((arg1 + 9) / 58);
        class287 var3 = (class287) class229.field3685.method1553((long) arg0, (byte) -81);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class60.field842.method643(arg0, 29, false);
        class287 var5 = new class287();
        if (var4 != null) {
            var5.method1955(new class152(var4), 26355, arg0);
        }
        class229.field3685.method1551(var5, 0, (long) arg0);
        return var5;
    }
}
