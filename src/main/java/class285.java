import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!co")
public class class285 {

    @OriginalMember(owner = "client!co", name = "a", descriptor = "[I")
    public static int[] field4461 = new int[2500];

    @OriginalMember(owner = "client!co", name = "e", descriptor = "[I")
    public static int[] field4465 = new int[256];

    @OriginalMember(owner = "client!co", name = "f", descriptor = "I")
    public static int field4466;

    @OriginalMember(owner = "client!co", name = "b", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!co", name = "c", descriptor = "I")
    public static int field4463;

    @OriginalMember(owner = "client!co", name = "d", descriptor = "I")
    public static int field4464;

    @OriginalMember(owner = "client!co", name = "h", descriptor = "I")
    public static int field4468;

    @OriginalMember(owner = "client!co", name = "i", descriptor = "I")
    public static int field4469;

    @OriginalMember(owner = "client!co", name = "g", descriptor = "Ll;")
    public static class133 field4467;

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(Lkh;B)V", line = 9)
    public static final void method1975(class166 arg0, byte arg1) {
        field4463++;
        int var2 = class123.field1855 >> 1;
        int var3 = class41.field612 >> 2 << 10;
        byte[][] var4 = new byte[class313.field4863][class233.field3706];
        while (arg0.field2532 < arg0.field2500.length) {
            boolean var5 = false;
            int var6 = 0;
            int var7 = 0;
            if (arg0.method1178(0) == 1) {
                var5 = true;
                var6 = arg0.method1178(0);
                var7 = arg0.method1178(arg1 ^ 0x22);
            }
            int var8 = arg0.method1178(0);
            int var9 = arg0.method1178(0);
            int var10 = class333.field5202 + class233.field3706 - (var9 * 64) - 1;
            int var11 = var8 * 64 - class84.field1311;
            if (var11 >= 0 && var10 - 63 >= 0 && class313.field4863 > var11 + 63 && class233.field3706 > var10) {
                for (int var12 = 0; var12 < 64; var12++) {
                    byte[] var13 = var4[var11 + var12];
                    for (int var14 = 0; var14 < 64; var14++) {
                        if (!var5 || (var6 * 8) <= var12 && var12 < var6 * 8 + 8 && var14 >= (var7 * 8) && var7 * 8 + 8 > var14) {
                            var13[var10 - var14] = arg0.method1143(-97);
                        }
                    }
                }
            } else if (var5) {
                arg0.field2532 += 64;
            } else {
                arg0.field2532 += 4096;
            }
        }
        int var15 = class313.field4863;
        int var16 = class233.field3706;
        int[] var17 = new int[var16];
        int[] var18 = new int[var16];
        int[] var19 = new int[var16];
        int[] var20 = new int[var16];
        int[] var21 = new int[var16];
        int var22 = -5;
        if (arg1 != 34) {
            return;
        }
        while (var22 < var15) {
            for (int var23 = 0; var23 < var16; var23++) {
                int var24 = var22 + 5;
                int var10002;
                if (var24 < var15) {
                    int var25 = var4[var24][var23] & 0xFF;
                    if (var25 > 0) {
                        class50 var26 = class223.method1581(var25 - 1, -28950);
                        var17[var23] += var26.field809;
                        var18[var23] += var26.field805;
                        var20[var23] += var26.field799;
                        var21[var23] += var26.field800;
                        var10002 = var19[var23]++;
                    }
                }
                int var27 = var22 - 5;
                if (var27 >= 0) {
                    int var28 = var4[var27][var23] & 0xFF;
                    if (var28 > 0) {
                        class50 var29 = class223.method1581(var28 - 1, arg1 ^ 0xFFFF8EC8);
                        var17[var23] -= var29.field809;
                        var18[var23] -= var29.field805;
                        var20[var23] -= var29.field799;
                        var21[var23] -= var29.field800;
                        var10002 = var19[var23]--;
                    }
                }
            }
            if (var22 >= 0) {
                int[][] var30 = class223.field3545[var22 >> 6];
                int var31 = 0;
                int var32 = 0;
                int var33 = 0;
                int var34 = 0;
                int var35 = 0;
                for (int var36 = -5; var36 < var16; var36++) {
                    int var37 = var36 + 5;
                    if (var37 < var16) {
                        var35 += var19[var37];
                        var32 += var20[var37];
                        var33 += var18[var37];
                        var31 += var17[var37];
                        var34 += var21[var37];
                    }
                    int var38 = var36 - 5;
                    if (var38 >= 0) {
                        var32 -= var20[var38];
                        var34 -= var21[var38];
                        var35 -= var19[var38];
                        var33 -= var18[var38];
                        var31 -= var17[var38];
                    }
                    if (var36 >= 0 && var35 > 0) {
                        int[] var39 = var30[var36 >> 6];
                        int var40 = var34 == 0 ? 0 : class121.method884((byte) -55, var31 * 256 / var34, var33 / var35, var32 / var35);
                        if (var4[var22][var36] != 0) {
                            if (var39 == null) {
                                var39 = var30[var36 >> 6] = new int[4096];
                            }
                            int var41 = (var40 & 0x7F) + var2;
                            if (var41 < 0) {
                                var41 = 0;
                            } else if (var41 > 127) {
                                var41 = 127;
                            }
                            int var42 = (var3 + var40 & 0xFC00) + (var40 & 0x380) + var41;
                            var39[class270.method1860(63, var22) + class270.method1860(var36 << 6, 4032)] = class15.field215[class149.method1033(-7044, 96, var42)];
                        } else if (var39 != null) {
                            var39[class270.method1860(var36 << 6, 4032) + class270.method1860(var22, 63)] = 0;
                        }
                    }
                }
            }
            var22++;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            int var1 = var0;
            for (int var2 = 0; var2 < 8; var2++) {
                if ((var1 & 0x1) == 1) {
                    var1 = var1 >>> 1 ^ 0xEDB88320;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field4465[var0] = var1;
        }
        field4466 = 0;
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIIII)V", line = 247)
    public static final void method1976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4468++;
        int var6 = arg3 - arg0;
        int var7 = arg2 - arg1;
        if (var6 == 0) {
            if (var7 != 0) {
                class112.method834(arg2, arg4, arg0, 4, arg1);
            }
        } else if (var7 == 0) {
            class288.method1983(arg1, arg3, arg0, (byte) -101, arg4);
        } else {
            if (arg5 <= 21) {
                method1977(117);
            }
            int var8 = (var7 << 12) / var6;
            int var9 = arg1 - (arg0 * var8 >> 12);
            int var10;
            int var11;
            if (arg0 < class206.field3170) {
                var11 = (class206.field3170 * var8 >> 12) + var9;
                var10 = class206.field3170;
            } else if (class12.field184 < arg0) {
                var10 = class12.field184;
                var11 = (class12.field184 * var8 >> 12) + var9;
            } else {
                var10 = arg0;
                var11 = arg1;
            }
            if (class119.field1817 > var11) {
                var10 = (class119.field1817 - var9 << 12) / var8;
                var11 = class119.field1817;
            } else if (var11 > class141.field2187) {
                var10 = (class141.field2187 - var9 << 12) / var8;
                var11 = class141.field2187;
            }
            int var12;
            int var13;
            if (arg3 < class206.field3170) {
                var12 = class206.field3170;
                var13 = (class206.field3170 * var8 >> 12) + var9;
            } else if (class12.field184 < arg3) {
                var13 = (class12.field184 * var8 >> 12) + var9;
                var12 = class12.field184;
            } else {
                var13 = arg2;
                var12 = arg3;
            }
            if (var13 < class119.field1817) {
                var13 = class119.field1817;
                var12 = (class119.field1817 - var9 << 12) / var8;
            } else if (class141.field2187 < var13) {
                var12 = (class141.field2187 - var9 << 12) / var8;
                var13 = class141.field2187;
            }
            class12.method91(arg4, var10, -109, var13, var11, var12);
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(I)V", line = 395)
    public static void method1977(int arg0) {
        field4465 = null;
        if (arg0 == 8) {
            field4461 = null;
            field4467 = null;
        }
    }

    @OriginalMember(owner = "client!co", name = "a", descriptor = "(IIIII)V", line = 409)
    public static final void method1978(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4462++;
        for (int var5 = arg2; var5 < class169.field2560; var5++) {
            if (arg3 < (class80.field1270[var5] + class342.field5326[var5]) && (arg3 + arg4) > class342.field5326[var5] && (class43.field693[var5] + class116.field1780[var5]) > arg1 && (arg0 + arg1) > class43.field693[var5]) {
                class240.field3831[var5] = true;
            }
        }
    }
}
