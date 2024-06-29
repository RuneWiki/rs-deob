import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class32 extends class42 {

    @OriginalMember(owner = "client!vo", name = "o", descriptor = "[I")
    public int[] field524 = new int[1];

    @OriginalMember(owner = "client!vo", name = "r", descriptor = "[I")
    public int[] field527 = new int[] { -1 };

    @OriginalMember(owner = "client!vo", name = "q", descriptor = "Z")
    public static boolean field526 = false;

    @OriginalMember(owner = "client!vo", name = "t", descriptor = "Z")
    public static boolean field529 = false;

    @OriginalMember(owner = "client!vo", name = "s", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!vo", name = "u", descriptor = "I")
    public static int field530;

    @OriginalMember(owner = "client!vo", name = "n", descriptor = "Lln;")
    public static class256 field523;

    @OriginalMember(owner = "client!vo", name = "p", descriptor = "[Ldm;")
    public static class37[] field525;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "(Z)V", line = 14)
    public static void method252(boolean arg0) {
        field525 = null;
        if (!arg0) {
            method252(false);
        }
        field523 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(ZII[I[I)J", line = 29)
    private final long method253(boolean arg0, int arg1, int arg2, int[] arg3, int[] arg4) {
        field530++;
        if (arg1 != 65535) {
            return -96L;
        }
        long[] var6 = class172.field2502;
        long var7 = -1L;
        long var9 = var7 >>> 8 ^ var6[(int) ((var7 ^ (long) (arg2 >> 8)) & 0xFFL)];
        long var11 = var9 >>> 8 ^ var6[(int) (((long) arg2 ^ var9) & 0xFFL)];
        for (int var13 = 0; var13 < arg4.length; var13++) {
            long var17 = var11 >>> 8 ^ var6[(int) ((var11 ^ (long) (arg4[var13] >> 24)) & 0xFFL)];
            long var19 = var6[(int) ((var17 ^ (long) (arg4[var13] >> 16)) & 0xFFL)] ^ var17 >>> 8;
            long var21 = var19 >>> 8 ^ var6[(int) ((var19 ^ (long) (arg4[var13] >> 8)) & 0xFFL)];
            var11 = var6[(int) ((var21 ^ (long) arg4[var13]) & 0xFFL)] ^ var21 >>> 8;
        }
        if (arg3 != null) {
            for (int var14 = 0; var14 < 5; var14++) {
                var11 = var6[(int) ((var11 ^ (long) arg3[var14]) & 0xFFL)] ^ var11 >>> 8;
            }
        }
        return var11 >>> 8 ^ var6[(int) (((long) (arg0 ? 1 : 0) ^ var11) & 0xFFL)];
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(IZIIILag;ILdc;ILqa;)Lc;", line = 80)
    public final class121 method254(int arg0, boolean arg1, int arg2, int arg3, int arg4, class480 arg5, int arg6, class5 arg7, int arg8, class162 arg9) {
        field528++;
        class121 var11 = null;
        int var12 = arg3;
        class20 var13 = null;
        if (arg4 != -1) {
            var13 = class291.field3825.method131(arg4, (byte) 104);
        }
        int[] var14 = this.field527;
        if (var13 != null && var13.field338 != null) {
            var14 = new int[var13.field338.length];
            for (int var15 = 0; var15 < var13.field338.length; var15++) {
                int var16 = var13.field338[var15];
                if (var16 >= 0 && this.field527.length > var16) {
                    var14[var15] = this.field527[var16];
                } else {
                    var14[var15] = -1;
                }
            }
        }
        boolean var17 = false;
        int var18 = -60 % ((-arg0 - 50) / 48);
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = false;
        int var22 = -1;
        int var23 = -1;
        int var24 = 0;
        class504 var25 = null;
        class504 var26 = null;
        if (arg7 != null) {
            int var27 = arg7.field129[arg6];
            var12 = arg3 | 0x20;
            int var28 = var27 >>> 16;
            var25 = class423.field5791.method1606(var28, 113);
            var22 = var27 & 0xFFFF;
            if (var25 != null) {
                var19 |= var25.method2876((byte) -120, var22);
                var17 |= var25.method2880((byte) 69, var22);
                var21 |= var25.method2878(20411, var22);
                var20 |= arg7.field142;
            }
            if ((arg7.field149 || class89.field1364) && arg2 != -1 && arg7.field129.length > arg2) {
                int var29 = arg7.field129[arg2];
                var24 = arg7.field127[arg6];
                int var30 = var29 >>> 16;
                var23 = var29 & 0xFFFF;
                if (var28 == var30) {
                    var26 = var25;
                } else {
                    var26 = class423.field5791.method1606(var23 >>> 16, -69);
                }
                if (var26 != null) {
                    var19 |= var26.method2876((byte) -120, var23);
                    var17 |= var26.method2880((byte) 69, var23);
                    var21 |= var26.method2878(20411, var23);
                }
            }
            if (var19) {
                var12 |= 0x80;
            }
            if (var17) {
                var12 |= 0x100;
            }
            if (var20) {
                var12 |= 0x200;
            }
            if (var21) {
                var12 |= 0x400;
            }
        }
        long var31 = this.method253(arg1, 65535, arg4, arg5 == null ? null : arg5.field6627, var14);
        if (class112.field1609 != null) {
            var11 = (class121) class112.field1609.method1456(var31, 112);
        }
        if (var11 == null || arg9.method564(var11.method854(), var12) != 0) {
            if (var11 != null) {
                var12 = arg9.method565(var12, var11.method854());
            }
            int var33 = var12;
            boolean var34 = false;
            for (int var35 = 0; var35 < var14.length; var35++) {
                if (var14[var35] != -1 && !class127.field1852.method2390(61, var14[var35]).method2770(arg1, (byte) 117)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class118[] var36 = new class118[var14.length];
            for (int var37 = 0; var37 < var14.length; var37++) {
                if (var14[var37] != -1) {
                    var36[var37] = class127.field1852.method2390(72, var14[var37]).method2783(arg1, false);
                }
            }
            if (var13 != null && var13.field349 != null) {
                for (int var38 = 0; var38 < var13.field349.length; var38++) {
                    if (var13.field349[var38] != null && var36[var38] != null) {
                        int var39 = var13.field349[var38][0];
                        int var40 = var13.field349[var38][1];
                        int var41 = var13.field349[var38][2];
                        int var42 = var13.field349[var38][3];
                        int var43 = var13.field349[var38][4];
                        int var44 = var13.field349[var38][5];
                        if (var42 != 0 || var43 != 0 || var44 != 0) {
                            var36[var38].method823(var43, var42, var44, -113);
                        }
                        if (var39 != 0 || var40 != 0 || var41 != 0) {
                            var36[var38].method826(var41, var39, (byte) 107, var40);
                        }
                    }
                }
            }
            if (arg5 != null) {
                var33 = var12 | 0x4000;
            }
            class118 var45 = new class118(var36, var36.length);
            var11 = arg9.method531(var45, var33, class479.field6612, 64, 850);
            if (arg5 != null) {
                for (int var46 = 0; var46 < 5; var46++) {
                    if (class59.field929[var46].length > arg5.field6627[var46]) {
                        var11.method865(class514.field7588[var46], class59.field929[var46][arg5.field6627[var46]]);
                    }
                    if (arg5.field6627[var46] < class73.field1105[var46].length) {
                        var11.method865(class253.field3351[var46], class73.field1105[var46][arg5.field6627[var46]]);
                    }
                }
            }
            if (class112.field1609 != null) {
                var11.method860(var12);
                class112.field1609.method1462(var11, var31, -124);
            }
        }
        if (arg7 == null || var25 == null) {
            return var11;
        } else {
            class121 var47 = var11.method863((byte) 1, var12, true);
            var47.method841(0, arg7.field142, (byte) 95, var25, var22, var26, var23, var24, arg8 - 1);
            return var47;
        }
    }
}
