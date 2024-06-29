import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class30 extends class338 {

    @OriginalMember(owner = "client!he", name = "n", descriptor = "Z")
    public boolean field289;

    @OriginalMember(owner = "client!he", name = "x", descriptor = "I")
    public int field299;

    @OriginalMember(owner = "client!he", name = "m", descriptor = "I")
    public int field288;

    @OriginalMember(owner = "client!he", name = "s", descriptor = "I")
    public int field294;

    @OriginalMember(owner = "client!he", name = "v", descriptor = "I")
    public int field297;

    @OriginalMember(owner = "client!he", name = "o", descriptor = "I")
    public int field290;

    @OriginalMember(owner = "client!he", name = "p", descriptor = "I")
    public static int field291 = -1;

    @OriginalMember(owner = "client!he", name = "t", descriptor = "[I")
    public static int[] field295 = new int[14];

    @OriginalMember(owner = "client!he", name = "r", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!he", name = "u", descriptor = "I")
    public static int field296;

    @OriginalMember(owner = "client!he", name = "w", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!he", name = "q", descriptor = "Lam;")
    public static class286 field292;

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(BIILgo;Lfd;IIILvm;)V")
    public static final void method144(byte arg0, int arg1, int arg2, class175 arg3, class194 arg4, int arg5, int arg6, int arg7, class322 arg8) {
        field296++;
        class228 var9 = class283.method1668(-62, arg6);
        if (var9 != null && var9.field3119 && var9.method1239((byte) -123)) {
            if (var9.field3120 != null) {
                int[] var10 = new int[var9.field3120.length];
                for (int var11 = 0; var11 < var10.length / 2; var11++) {
                    int var13;
                    if (class294.field3993 == 4) {
                        var13 = (int) class425.field6241 & 0x3FFF;
                    } else {
                        var13 = (int) class425.field6241 + class136.field1731 & 0x3FFF;
                    }
                    int var14 = class356.field5037[var13];
                    int var15 = class356.field5025[var13];
                    if (class294.field3993 != 4) {
                        var14 = var14 * 256 / (class411.field5937 + 256);
                        var15 = var15 * 256 / (class411.field5937 + 256);
                    }
                    var10[var11 * 2] = ((arg5 + (var9.field3120[var11 * 2 + 1] * 4)) * var14 + ((var9.field3120[var11 * 2] * 4 + arg7) * var15) >> 15) + (arg1 + (arg4.field2501 / 2));
                    var10[var11 * 2 + 1] = arg4.field2460 / 2 + arg2 - ((arg5 + (var9.field3120[var11 * 2 + 1] * 4)) * var15 - ((var9.field3120[var11 * 2] * 4 + arg7) * var14) >> 15);
                }
                class251.method1395(arg8, var10, var9.field3130, arg4.field2500, arg4.field2525);
                for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                    arg8.method1615(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 2 + 1], var9.field3137, 1, arg3, arg1, arg2);
                }
                arg8.method1615(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field3137, 1, arg3, arg1, arg2);
            }
            class20 var16 = null;
            if (var9.field3116 != -1) {
                var16 = var9.method1242(false, arg8, 2233);
                if (var16 != null) {
                    class274.method1512(arg4, arg5, var16, false, arg1, arg2, arg3, arg7);
                }
            }
            if (var9.field3123 != null) {
                int var17 = 0;
                if (var16 != null) {
                    var17 = var16.method105();
                }
                class298 var18 = class115.field1436;
                class402 var19 = class207.field2798;
                if (var9.field3115 == 1) {
                    var19 = class383.field5461;
                    var18 = class105.field1296;
                }
                if (var9.field3115 == 2) {
                    var19 = class111.field1385;
                    var18 = class291.field3957;
                }
                class340.method1983(arg5, var19, arg1, arg3, arg4, arg2, var9.field3123, var9.field3141, var18, arg7, (byte) 21, var17);
            }
        }
        if (arg0 != -92) {
            method144((byte) -120, -113, -86, (class175) null, (class194) null, -21, -28, 96, (class322) null);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IIIILqs;IIIIIB)Z")
    public static final boolean method145(int arg0, int arg1, int arg2, int arg3, class438 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, byte arg10) {
        field298++;
        int var11 = arg2;
        int var12 = arg7;
        int var13 = -116 % ((-arg10 - 87) / 34);
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg2 - var14;
        int var17 = arg7 - var15;
        class414.field5972[var14][var15] = 99;
        class392.field5642[var14][var15] = 0;
        byte var18 = 0;
        class167.field2121[var18] = arg2;
        int var19 = 0;
        byte var10001 = var18;
        int var27 = var18 + 1;
        class307.field4155[var10001] = arg7;
        int[][] var20 = arg4.field6422;
        while (var27 != var19) {
            var11 = class167.field2121[var19];
            var12 = class307.field4155[var19];
            int var21 = var11 - var16;
            int var22 = var11 - arg4.field6415;
            int var23 = var12 - arg4.field6423;
            var19 = var19 + 1 & 0xFFF;
            int var24 = var12 - var17;
            if (arg5 == -4) {
                if (arg9 == var11 && arg1 == var12) {
                    class233.field3213 = var12;
                    class310.field4182 = var11;
                    return true;
                }
            } else if (arg5 == -3) {
                if (class278.method1533(arg9, arg1, var11, var12, 1, 1, (byte) -52, arg8, arg6)) {
                    class310.field4182 = var11;
                    class233.field3213 = var12;
                    return true;
                }
            } else if (arg5 == -2) {
                if (arg4.method2717(1, (byte) -118, arg1, 1, var11, arg6, arg0, arg8, arg9, var12)) {
                    class310.field4182 = var11;
                    class233.field3213 = var12;
                    return true;
                }
            } else if (arg5 == -1) {
                if (arg4.method2703(arg1, arg6, -1, arg9, var12, 1, arg0, var11, arg8)) {
                    class310.field4182 = var11;
                    class233.field3213 = var12;
                    return true;
                }
            } else if (arg5 == 0 || arg5 == 1 || arg5 == 2 || arg5 == 3 || arg5 == 9) {
                if (arg4.method2707(1, arg3, 64, var11, arg5, var12, arg9, arg1)) {
                    class310.field4182 = var11;
                    class233.field3213 = var12;
                    return true;
                }
            } else if (arg4.method2708(-1, arg5, arg1, var11, arg9, 1, arg3, var12)) {
                class233.field3213 = var12;
                class310.field4182 = var11;
                return true;
            }
            int var26 = class392.field5642[var21][var24] + 1;
            if (var21 > 0 && class414.field5972[var21 - 1][var24] == 0 && (var20[var22 - 1][var23] & 0x42240000) == 0) {
                class167.field2121[var27] = var11 - 1;
                class307.field4155[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class414.field5972[var21 - 1][var24] = 2;
                class392.field5642[var21 - 1][var24] = var26;
            }
            if (var21 < 127 && class414.field5972[var21 + 1][var24] == 0 && (var20[var22 + 1][var23] & 0x60240000) == 0) {
                class167.field2121[var27] = var11 + 1;
                class307.field4155[var27] = var12;
                var27 = var27 + 1 & 0xFFF;
                class414.field5972[var21 + 1][var24] = 8;
                class392.field5642[var21 + 1][var24] = var26;
            }
            if (var24 > 0 && class414.field5972[var21][var24 - 1] == 0 && (var20[var22][var23 - 1] & 0x40A40000) == 0) {
                class167.field2121[var27] = var11;
                class307.field4155[var27] = var12 - 1;
                class414.field5972[var21][var24 - 1] = 1;
                var27 = var27 + 1 & 0xFFF;
                class392.field5642[var21][var24 - 1] = var26;
            }
            if (var24 < 127 && class414.field5972[var21][var24 + 1] == 0 && (var20[var22][var23 + 1] & 0x48240000) == 0) {
                class167.field2121[var27] = var11;
                class307.field4155[var27] = var12 + 1;
                class414.field5972[var21][var24 + 1] = 4;
                var27 = var27 + 1 & 0xFFF;
                class392.field5642[var21][var24 + 1] = var26;
            }
            if (var21 > 0 && var24 > 0 && class414.field5972[var21 - 1][var24 - 1] == 0 && (var20[var22 - 1][var23 - 1] & 0x43A40000) == 0 && (var20[var22 - 1][var23] & 0x42240000) == 0 && (var20[var22][var23 - 1] & 0x40A40000) == 0) {
                class167.field2121[var27] = var11 - 1;
                class307.field4155[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class414.field5972[var21 - 1][var24 - 1] = 3;
                class392.field5642[var21 - 1][var24 - 1] = var26;
            }
            if (var21 < 127 && var24 > 0 && class414.field5972[var21 + 1][var24 - 1] == 0 && (var20[var22 + 1][var23 - 1] & 0x60E40000) == 0 && (var20[var22 + 1][var23] & 0x60240000) == 0 && (var20[var22][var23 - 1] & 0x40A40000) == 0) {
                class167.field2121[var27] = var11 + 1;
                class307.field4155[var27] = var12 - 1;
                var27 = var27 + 1 & 0xFFF;
                class414.field5972[var21 + 1][var24 - 1] = 9;
                class392.field5642[var21 + 1][var24 - 1] = var26;
            }
            if (var21 > 0 && var24 < 127 && class414.field5972[var21 - 1][var24 + 1] == 0 && (var20[var22 - 1][var23 + 1] & 0x4E240000) == 0 && (var20[var22 - 1][var23] & 0x42240000) == 0 && (var20[var22][var23 + 1] & 0x48240000) == 0) {
                class167.field2121[var27] = var11 - 1;
                class307.field4155[var27] = var12 + 1;
                class414.field5972[var21 - 1][var24 + 1] = 6;
                var27 = var27 + 1 & 0xFFF;
                class392.field5642[var21 - 1][var24 + 1] = var26;
            }
            if (var21 < 127 && var24 < 127 && class414.field5972[var21 + 1][var24 + 1] == 0 && (var20[var22 + 1][var23 + 1] & 0x78240000) == 0 && (var20[var22 + 1][var23] & 0x60240000) == 0 && (var20[var22][var23 + 1] & 0x48240000) == 0) {
                class167.field2121[var27] = var11 + 1;
                class307.field4155[var27] = var12 + 1;
                var27 = var27 + 1 & 0xFFF;
                class414.field5972[var21 + 1][var24 + 1] = 12;
                class392.field5642[var21 + 1][var24 + 1] = var26;
            }
        }
        class233.field3213 = var12;
        class310.field4182 = var11;
        return false;
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public static void method146(int arg0) {
        if (arg0 < -70) {
            field292 = null;
            field295 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "(IIIIIZ)V")
    public class30(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        this.field289 = arg5;
        this.field299 = arg4;
        this.field288 = arg2;
        this.field294 = arg3;
        this.field297 = arg0;
        this.field290 = arg1;
    }
}
