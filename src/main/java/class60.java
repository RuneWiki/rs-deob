import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ci")
public abstract class class60 {

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "Z")
    public static boolean field1022 = true;

    @OriginalMember(owner = "client!ci", name = "c", descriptor = "[I")
    public static int[] field1024 = new int[4096];

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "I")
    public static int field1023;

    @OriginalMember(owner = "client!ci", name = "d", descriptor = "I")
    public static int field1025;

    @OriginalMember(owner = "client!ci", name = "e", descriptor = "I")
    public static int field1026;

    @OriginalMember(owner = "client!ci", name = "f", descriptor = "I")
    public static int field1027;

    @OriginalMember(owner = "client!ci", name = "h", descriptor = "I")
    public static int field1029;

    @OriginalMember(owner = "client!ci", name = "i", descriptor = "I")
    public static int field1030;

    @OriginalMember(owner = "client!ci", name = "j", descriptor = "I")
    public static int field1031;

    @OriginalMember(owner = "client!ci", name = "k", descriptor = "I")
    public static int field1032;

    @OriginalMember(owner = "client!ci", name = "l", descriptor = "I")
    public static int field1033;

    @OriginalMember(owner = "client!ci", name = "g", descriptor = "[Lbf;")
    public static class102[] field1028;

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIB)V")
    public static final void method461(int arg0, int arg1, byte arg2) {
        int var3 = 0;
        if (arg2 != 12) {
            field1024 = null;
        }
        while (class206.field3318 > var3) {
            class236 var4 = class294.method1973(-1000000, var3);
            if (var4 != null) {
                int var5 = var4.field3738;
                if (var5 >= 0 && !class95.field1483.method1611(104, var5)) {
                    var5 = -1;
                }
                int var6;
                if (var4.field3732 >= 0) {
                    int var10 = var4.field3732;
                    int var11 = (var10 & 0x7F) + arg0;
                    if (var11 < 0) {
                        var11 = 0;
                    } else if (var11 > 127) {
                        var11 = 127;
                    }
                    int var12 = (arg1 + var10 & 0xFC00) + (var10 & 0x380) + var11;
                    var6 = class95.field1477[class35.method302(var12, 96, (byte) -25)];
                } else if (var5 >= 0) {
                    var6 = class95.field1477[class35.method302(class95.field1483.method1612(arg2 - 82, var5), 96, (byte) -25)];
                } else if (var4.field3736 == -1) {
                    var6 = -1;
                } else {
                    int var7 = var4.field3736;
                    int var8 = (var7 & 0x7F) + arg0;
                    if (var8 < 0) {
                        var8 = 0;
                    } else if (var8 > 127) {
                        var8 = 127;
                    }
                    int var9 = (arg1 + var7 & 0xFC00) + (var7 & 0x380) + var8;
                    var6 = class95.field1477[class35.method302(var9, 96, (byte) -25)];
                }
                class292.field4635[var3 + 1] = var6;
            }
            var3++;
        }
        field1031++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(III)Lci;")
    public class60 method462(int arg0, int arg1, int arg2) {
        field1029++;
        return this;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIIIIIIJILpj;)V")
    public abstract void method98(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, long arg8, int arg9, class98 arg10);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lig;B)V")
    public static final void method463(class136 arg0, byte arg1) {
        field1025++;
        int var2 = class244.field3860 >> 2 << 10;
        int var3 = class276.field4399 >> 1;
        byte[][] var4 = new byte[class159.field2574][class31.field524];
        while (arg0.field2231 < arg0.field2263.length) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (arg0.method1012(4) == 1) {
                var34 = true;
                var33 = arg0.method1012(4);
                var35 = arg0.method1012(4);
            }
            int var36 = arg0.method1012(4);
            int var37 = arg0.method1012(4);
            int var38 = var36 * 64 - class285.field4524;
            int var39 = class253.field4030 + (class31.field524 - 1) - var37 * 64;
            if (var38 >= 0 && var39 - 63 >= 0 && class159.field2574 > var38 + 63 && class31.field524 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var34 || var33 * 8 <= var40 && var33 * 8 + 8 > var40 && var42 >= var35 * 8 && var42 < var35 * 8 + 8) {
                            var41[var39 - var42] = arg0.method981(false);
                        }
                    }
                }
            } else if (var34) {
                arg0.field2231 += 64;
            } else {
                arg0.field2231 += 4096;
            }
        }
        int var5 = class159.field2574;
        int var6 = class31.field524;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class259 var29 = class114.method845(var28 - 1, 29565);
                        var7[var13] += var29.field4128;
                        var9[var13] += var29.field4124;
                        var8[var13] += var29.field4127;
                        var11[var13] += var29.field4119;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class259 var32 = class114.method845(var31 - 1, 29565);
                        var7[var13] -= var32.field4128;
                        var9[var13] -= var32.field4124;
                        var8[var13] -= var32.field4127;
                        var11[var13] -= var32.field4119;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class35.field597[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var16 += var8[var21];
                        var15 += var7[var21];
                        var18 += var9[var21];
                        var17 += var11[var21];
                        var19 += var10[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var18 -= var9[var22];
                        var15 -= var7[var22];
                        var17 -= var11[var22];
                        var19 -= var10[var22];
                        var16 -= var8[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class223.method1503(var18 / var19, -107, var15 * 256 / var17, var16 / var19);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 + var2 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class64.method498(var12, 63) + class64.method498(var20 << 6, 4032)] = class95.field1477[class65.method502(1795, 96, var26)];
                        } else if (var23 != null) {
                            var23[class64.method498(var12, 63) + (class64.method498(var20, 63) << 6)] = 0;
                        }
                    }
                }
            }
        }
        if (arg1 <= 69) {
            method464(93);
        }
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(I)V")
    public static void method464(int arg0) {
        int var1 = -108 % ((-arg0 - 15) / 61);
        field1028 = null;
        field1024 = null;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lci;IIIZ)V")
    public void method465(class60 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field1033++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(IIIII)V")
    public static final void method466(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 > -116) {
            return;
        }
        if (class34.field574 == 1) {
            class207.field3326[class180.field3000 / 100].method124(class124.field2075 - 8, class33.field554 - 8);
        }
        field1027++;
        if (class34.field574 == 2) {
            class207.field3326[class180.field3000 / 100 + 4].method124(class124.field2075 - 8, class33.field554 + -8);
        }
        class160.method1162((byte) -39);
    }

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "(IIIII)V")
    public abstract void method100(int arg0, int arg1, int arg2, int arg3, int arg4);

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "(Lsb;Lsb;ILsb;)V")
    public static final void method467(class124 arg0, class124 arg1, int arg2, class124 arg3) {
        class156.field2540 = arg3;
        class220.field3517 = arg1;
        class234.field3709 = arg0;
        if (arg2 != -1) {
            field1026 = 6;
        }
        field1030++;
    }

    @OriginalMember(owner = "client!ci", name = "a", descriptor = "()I")
    public abstract int method99();

    @OriginalMember(owner = "client!ci", name = "b", descriptor = "()Z")
    public boolean method468() {
        field1032++;
        return false;
    }
}
