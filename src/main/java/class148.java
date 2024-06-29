import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!in")
public class class148 extends class97 {

    @OriginalMember(owner = "client!in", name = "q", descriptor = "[I")
    public int[] field2045 = new int[] { -1 };

    @OriginalMember(owner = "client!in", name = "u", descriptor = "[I")
    public int[] field2049 = new int[1];

    @OriginalMember(owner = "client!in", name = "r", descriptor = "[I")
    public static int[] field2046 = new int[1000];

    @OriginalMember(owner = "client!in", name = "v", descriptor = "[I")
    public static int[] field2050 = new int[13];

    @OriginalMember(owner = "client!in", name = "n", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!in", name = "o", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!in", name = "s", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!in", name = "t", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!in", name = "p", descriptor = "Lgo;")
    public static class272 field2044;

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IILdr;ZIBLwe;Lgr;II)Lwp;")
    public final class292 method920(int arg0, int arg1, class261 arg2, boolean arg3, int arg4, byte arg5, class128 arg6, class379 arg7, int arg8, int arg9) {
        field2043++;
        class292 var11 = null;
        int var12 = arg1;
        class433 var13 = null;
        if (arg8 != -1) {
            var13 = class180.method1092(false, arg8);
        }
        int[] var14 = this.field2045;
        if (var13 != null && var13.field6371 != null) {
            var14 = new int[var13.field6371.length];
            for (int var15 = 0; var15 < var13.field6371.length; var15++) {
                int var16 = var13.field6371[var15];
                if (var16 >= 0 && var16 < this.field2045.length) {
                    var14[var15] = this.field2045[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        boolean var18 = false;
        boolean var19 = false;
        int var20 = -1;
        int var21 = -1;
        int var22 = 0;
        class265 var23 = null;
        class265 var24 = null;
        if (arg7 != null) {
            int var25 = arg7.field5539[arg9];
            var12 = arg1 | 0x20;
            int var26 = var25 >>> 16;
            var20 = var25 & 0xFFFF;
            var23 = class374.method2243(false, var26);
            if (var23 != null) {
                var18 |= var23.method1640(var20, (byte) 11);
                var17 |= var23.method1639(-1, var20);
                var19 |= arg7.field5522;
            }
            if ((arg7.field5532 || class440.field6479) && arg0 != -1 && arg0 < arg7.field5539.length) {
                var22 = arg7.field5540[arg9];
                int var27 = arg7.field5539[arg0];
                int var28 = var27 >>> 16;
                var21 = var27 & 0xFFFF;
                if (var26 == var28) {
                    var24 = var23;
                } else {
                    var24 = class374.method2243(false, var21 >>> 16);
                }
                if (var24 != null) {
                    var18 |= var24.method1640(var21, (byte) 11);
                    var17 |= var24.method1639(arg5 + 23, var21);
                }
            }
            if (var18) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var19) {
                var12 |= 0x200;
            }
        }
        if (arg5 != -24) {
            return null;
        }
        long var29 = this.method924(arg3, var14, arg8, (byte) -11, arg6 == null ? null : arg6.field1634);
        if (class143.field1913 != null) {
            var11 = (class292) class143.field1913.method1491(var29, 0);
        }
        if (var11 == null || arg2.method372(var11.method1274(), var12) != 0) {
            if (var11 != null) {
                var12 = arg2.method407(var12, var11.method1274());
            }
            int var31 = var12;
            boolean var32 = false;
            for (int var33 = 0; var33 < var14.length; var33++) {
                if (var14[var33] != -1 && !class186.field2796.method1106(50, var14[var33]).method1012((byte) -98, arg3)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class49[] var34 = new class49[var14.length];
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1) {
                    var34[var35] = class186.field2796.method1106(50, var14[var35]).method1008((byte) 123, arg3);
                }
            }
            if (var13 != null && var13.field6370 != null) {
                for (int var36 = 0; var36 < var13.field6370.length; var36++) {
                    if (var13.field6370[var36] != null && var34[var36] != null) {
                        int var37 = var13.field6370[var36][0];
                        int var38 = var13.field6370[var36][1];
                        int var39 = var13.field6370[var36][2];
                        int var40 = var13.field6370[var36][3];
                        int var41 = var13.field6370[var36][4];
                        int var42 = var13.field6370[var36][5];
                        if (var40 != 0 || var41 != 0 || var42 != 0) {
                            var34[var36].method273(var41, var42, var40, -123);
                        }
                        if (var37 != 0 || var38 != 0 || var39 != 0) {
                            var34[var36].method275((byte) 95, var37, var38, var39);
                        }
                    }
                }
            }
            if (arg6 != null) {
                var31 = var12 | 0x2000;
            }
            class49 var43 = new class49(var34, var34.length);
            var11 = arg2.method390(var43, var31, class450.field6620, 64, 850);
            if (arg6 != null) {
                for (int var44 = 0; var44 < 5; var44++) {
                    if (class246.field3685[var44].length > arg6.field1634[var44]) {
                        var11.method1259(class295.field4481[var44], class246.field3685[var44][arg6.field1634[var44]]);
                    }
                    if (class372.field5435[var44].length > arg6.field1634[var44]) {
                        var11.method1259(class201.field3032[var44], class372.field5435[var44][arg6.field1634[var44]]);
                    }
                }
            }
            if (class143.field1913 != null) {
                var11.method1277(var12);
                class143.field1913.method1488(arg5 ^ 0xFFFFFF68, var29, var11);
            }
        }
        if (arg7 == null || var23 == null) {
            return var11;
        } else {
            class292 var45 = var11.method1264((byte) 1, var12, true);
            var45.method1817(var22, var21, 0, (byte) 87, var24, arg4 - 1, var23, arg7.field5522, var20);
            return var45;
        }
    }

    @OriginalMember(owner = "client!in", name = "c", descriptor = "(I)V")
    public static void method921(int arg0) {
        field2050 = null;
        field2044 = null;
        int var1 = 18 % ((57 - arg0) / 37);
        field2046 = null;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IIILrc;)J")
    public static final long method922(int arg0, int arg1, int arg2, class18 arg3) {
        int var4 = 116 % ((36 - arg1) / 52);
        field2042++;
        long var5 = 4194304L;
        long var7 = 2147483648L;
        long var9 = Long.MIN_VALUE;
        class85 var11 = class411.method2575(0, arg3.method7(true));
        long var12 = (long) (arg3.method9(41) | 0x10000 << 14 | arg0 << 7 | arg2 | arg3.method3((byte) -37) << 20);
        if (var11.field1184 == 0) {
            var12 |= var9;
        }
        if (var11.field1181 == 1) {
            var12 |= var5;
        }
        if (var11.field1164) {
            var12 |= var7;
        }
        return var12 | (long) arg3.method7(true) << 32;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(IB[SI[Ljava/lang/String;)V")
    public static final void method923(int arg0, byte arg1, short[] arg2, int arg3, String[] arg4) {
        if (arg3 > arg0) {
            int var5 = (arg0 + arg3) / 2;
            int var6 = arg0;
            String var7 = arg4[var5];
            arg4[var5] = arg4[arg3];
            arg4[arg3] = var7;
            short var8 = arg2[var5];
            arg2[var5] = arg2[arg3];
            arg2[arg3] = var8;
            for (int var9 = arg0; var9 < arg3; var9++) {
                if (var7 == null || arg4[var9] != null && (var9 & 0x1) > arg4[var9].compareTo(var7)) {
                    String var10 = arg4[var9];
                    arg4[var9] = arg4[var6];
                    arg4[var6] = var10;
                    short var11 = arg2[var9];
                    arg2[var9] = arg2[var6];
                    arg2[var6++] = var11;
                }
            }
            arg4[arg3] = arg4[var6];
            arg4[var6] = var7;
            arg2[arg3] = arg2[var6];
            arg2[var6] = var8;
            method923(arg0, (byte) -66, arg2, var6 - 1, arg4);
            method923(var6 + 1, (byte) 127, arg2, arg3, arg4);
        }
        int var12 = -127 / ((arg1 - 11) / 62);
        field2047++;
    }

    @OriginalMember(owner = "client!in", name = "a", descriptor = "(Z[IIB[I)J")
    private final long method924(boolean arg0, int[] arg1, int arg2, byte arg3, int[] arg4) {
        field2048++;
        long[] var6 = class359.field5286;
        long var7 = -1L;
        long var9 = var6[(int) ((var7 ^ (long) (arg2 >> 8)) & 0xFFL)] ^ var7 >>> 8;
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg2 ^ var9) & 0xFFL)];
        if (arg3 != -11) {
            this.method920(122, -121, (class261) null, false, 127, (byte) 113, (class128) null, (class379) null, 74, 45);
        }
        for (int var13 = 0; var13 < arg1.length; var13++) {
            long var17 = var6[(int) (((long) (arg1[var13] >> 24) ^ var11) & 0xFFL)] ^ var11 >>> 8;
            long var19 = var6[(int) ((var17 ^ (long) (arg1[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var6[(int) ((var19 ^ (long) (arg1[var13] >> 8)) & 0xFFL)] ^ var19 >>> 8;
            var11 = var21 >>> 8 ^ var6[(int) ((var21 ^ (long) arg1[var13]) & 0xFFL)];
        }
        if (arg4 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) (((long) arg4[var14] ^ var11) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg0 ? 1 : 0)) & 0xFFL)];
    }
}
