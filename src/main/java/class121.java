import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class121 {

    @OriginalMember(owner = "client!qa", name = "n", descriptor = "Lwa;")
    public static class75 field2042 = class66.method560("Lade Sprites )2 ", false);

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "Lwa;")
    public static class75 field2035 = class66.method560("Null", false);

    @OriginalMember(owner = "client!qa", name = "q", descriptor = "I")
    public static int field2045 = 20;

    @OriginalMember(owner = "client!qa", name = "s", descriptor = "Lwa;")
    public static class75 field2047 = class66.method560("", false);

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "I")
    public static int field2031 = 0;

    @OriginalMember(owner = "client!qa", name = "i", descriptor = "Lwa;")
    public static class75 field2037 = class66.method560("", false);

    @OriginalMember(owner = "client!qa", name = "p", descriptor = "Lwa;")
    public static class75 field2044 = field2037;

    @OriginalMember(owner = "client!qa", name = "o", descriptor = "Lwa;")
    public static class75 field2043 = class66.method560("Fallen lassen", false);

    @OriginalMember(owner = "client!qa", name = "r", descriptor = "Lwa;")
    public static class75 field2046 = field2037;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "I")
    public static int field2029;

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "I")
    public static int field2030;

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "I")
    public static int field2036;

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!qa", name = "l", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!qa", name = "m", descriptor = "I")
    public static int field2041;

    @OriginalMember(owner = "client!qa", name = "t", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "Lpj;")
    public class171 field2033;

    @OriginalMember(owner = "client!qa", name = "k", descriptor = "Lcb;")
    public static class267 field2039;

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "Lje;")
    public class68 field2032;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BI)V", line = 8)
    public static final void method917(byte arg0, int arg1) {
        if (arg0 <= -93) {
            field2040++;
            class156 var2 = class206.method1525(1, -32701, arg1);
            var2.method1184((byte) 87);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(II[[IIII)I", line = 23)
    public static final int method918(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5) {
        if (arg4 == 22056) {
            int var6 = (128 - arg3) * arg2[arg5][arg1] + arg2[arg5 + 1][arg1] * arg3 >> 7;
            field2038++;
            int var7 = (128 - arg3) * arg2[arg5][arg1 + 1] + (arg2[arg5 + 1][arg1 + 1] * arg3) >> 7;
            return (128 - arg0) * var6 + arg0 * var7 >> 7;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILcb;II)Lbh;", line = 42)
    public static final class258 method919(int arg0, class267 arg1, int arg2, int arg3) {
        field2030++;
        if (arg0 != 23044) {
            field2047 = (class75) null;
        }
        return class281.method1994(arg3, (byte) -7, arg2, arg1) ? class37.method248(-82) : null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lcb;IIILcb;)Ldc;", line = 67)
    public static final class101 method920(class267 arg0, int arg1, int arg2, int arg3, class267 arg4) {
        if (arg3 != -5) {
            method921((byte) -79, (class60) null);
        }
        field2048++;
        return class281.method1994(arg2, (byte) -7, arg1, arg4) ? class228.method1666(arg0.method1911(arg2, arg1, arg3 - 72), (byte) 0) : null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLja;)V", line = 92)
    public static final void method921(byte arg0, class60 arg1) {
        field2041++;
        if (arg0 < 65) {
            return;
        }
        int var2 = class99.field1640 >> 2 << 10;
        int var3 = class283.field4889 >> 1;
        byte[][] var4 = new byte[class39.field589][class215.field3668];
        while (arg1.field1012 < arg1.field997.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg1.method501(0) == 1) {
                var5 = true;
                var6 = arg1.method501(0);
                var7 = arg1.method501(0);
            }
            int var8 = arg1.method501(0);
            int var9 = arg1.method501(0);
            int var10 = var8 * 64 - class82.field1374;
            int var11 = class215.field3668 + class130.field2252 - (var9 * 64) - 1;
            if (var10 >= 0 && (var11 - 63) >= 0 && class39.field589 > (var10 + 63) && var11 < class215.field3668) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var10 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || (var6 * 8) <= var12 && (var6 * 8 + 8) > var12 && var14 >= (var7 * 8) && var14 < (var7 * 8 + 8)) {
                            var13[var11 - var14] = arg1.method511(-114);
                        }
                    }
                }
            } else if (var5) {
                arg1.field1012 += 64;
            } else {
                arg1.field1012 += 4096;
            }
        }
        int var15 = class215.field3668;
        int[] var16 = new int[var15];
        int[] var17 = new int[var15];
        int var18 = class39.field589;
        int[] var19 = new int[var15];
        int[] var20 = new int[var15];
        int[] var21 = new int[var15];
        for (int var22 = -5; var22 < var18; var22++) {
            for (int var23 = 0; var23 < var15; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var18) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class215 var26 = class266.method1891((byte) -96, var25 - 1);
                        var16[var23] += var26.field3679;
                        var17[var23] += var26.field3670;
                        var21[var23] += var26.field3667;
                        var20[var23] += var26.field3680;
                        var10002 = var19[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class215 var29 = class266.method1891((byte) -96, var28 - 1);
                        var16[var23] -= var29.field3679;
                        var17[var23] -= var29.field3670;
                        var21[var23] -= var29.field3667;
                        var20[var23] -= var29.field3680;
                        var10002 = var19[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int var30 = 0;
                int[][] var31 = class153.field2631[var22 >> 6];
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var15; var36++) {
                    int var37 = var36 - 5;
                    int var38 = var36 + 5;
                    if (var15 > var38) {
                        var34 += var17[var38];
                        var33 += var20[var38];
                        var32 += var21[var38];
                        var35 += var19[var38];
                        var30 += var16[var38];
                    }
                    if (var37 >= 0) {
                        var35 -= var19[var37];
                        var30 -= var16[var37];
                        var34 -= var17[var37];
                        var33 -= var20[var37];
                        var32 -= var21[var37];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var31[var36 >> 6];
                        int var40 = var33 == 0 ? 0 : class145.method1112(var32 / var35, 24001, var34 / var35, var30 * 256 / var33);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var31[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var3;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var2 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class235.method1710(var22, 63) + class235.method1710(4032, var36 << 6)] = class21.field290[class189.method1427(-65537, 96, var42)];
                        } else if (var39 != null) {
                            var39[class235.method1710(var36 << 6, 4032) + class235.method1710(var22, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Z)V", line = 340)
    public static void method922(boolean arg0) {
        field2043 = null;
        field2035 = null;
        field2039 = null;
        field2042 = null;
        field2037 = null;
        field2044 = null;
        field2047 = null;
        if (!arg0) {
            field2029 = 89;
        }
        field2046 = null;
    }
}
