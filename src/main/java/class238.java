import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class238 {

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "I")
    public int field4005;

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "[I")
    public int[] field4001;

    @OriginalMember(owner = "client!jh", name = "k", descriptor = "[Lnj;")
    public class206[] field4008;

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "[S")
    public static short[] field4000 = new short[] { 960, 957, -21568, -21571, 22464 };

    @OriginalMember(owner = "client!jh", name = "n", descriptor = "Ljava/lang/String;")
    public static String field4011 = null;

    @OriginalMember(owner = "client!jh", name = "o", descriptor = "S")
    public static short field4012 = 320;

    @OriginalMember(owner = "client!jh", name = "j", descriptor = "Lpf;")
    public static class17 field4007 = new class17(64);

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "I")
    public static int field3998;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "I")
    public static int field3999;

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "I")
    public static int field4002;

    @OriginalMember(owner = "client!jh", name = "f", descriptor = "I")
    public static int field4003;

    @OriginalMember(owner = "client!jh", name = "g", descriptor = "I")
    public static int field4004;

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "I")
    public static int field4006;

    @OriginalMember(owner = "client!jh", name = "m", descriptor = "I")
    public static int field4010;

    @OriginalMember(owner = "client!jh", name = "p", descriptor = "I")
    public static int field4013;

    @OriginalMember(owner = "client!jh", name = "q", descriptor = "I")
    public static int field4014;

    @OriginalMember(owner = "client!jh", name = "l", descriptor = "[I")
    public static int[] field4009;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIZII)V")
    public static final void method1702(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field4003++;
        class302 var5 = (class302) class21.field381.method987(-117, (long) arg0);
        if (var5 == null) {
            var5 = new class302();
            class21.field381.method986((long) arg0, true, var5);
        }
        if (arg2) {
            field4012 = -121;
        }
        if (var5.field4922.length <= arg1) {
            int[] var6 = new int[arg1 + 1];
            int[] var7 = new int[arg1 + 1];
            for (int var8 = 0; var8 < var5.field4922.length; var8++) {
                var7[var8] = var5.field4922[var8];
                var6[var8] = var5.field4927[var8];
            }
            for (int var9 = var5.field4922.length; var9 < arg1; var9++) {
                var7[var9] = -1;
                var6[var9] = 0;
            }
            var5.field4927 = var6;
            var5.field4922 = var7;
        }
        var5.field4922[arg1] = arg4;
        var5.field4927[arg1] = arg3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I)V")
    public static void method1703(int arg0) {
        if (arg0 != -14308) {
            field4013 = -55;
        }
        field4007 = null;
        field4009 = null;
        field4011 = null;
        field4000 = null;
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(I)V")
    public static final void method1704(int arg0) {
        field4006++;
        if (class298.field4864 > arg0) {
            class80.method556(arg0 ^ 0x68);
        } else {
            class293.field4798 = class159.field2609;
            class159.field2609 = null;
            class240.method1719(40, 31136);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)V")
    public static final void method1705(int arg0, int arg1) {
        field3999++;
        class36 var2 = class136.method1013(11, arg0, (byte) -90);
        var2.method221(1);
        if (arg1 != -14617) {
            method1702(-9, -122, true, 117, 126);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lab;Z)V")
    public static final void method1706(class249 arg0, boolean arg1) {
        field4004++;
        int var2 = class148.field2440 >> 1;
        byte[][] var3 = new byte[class148.field2436][class148.field2434];
        int var4 = class148.field2443 >> 2 << 10;
        while (arg0.field4160 < arg0.field4182.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1802((byte) -92) == 1) {
                var34 = arg0.method1802((byte) 80);
                var33 = true;
                var35 = arg0.method1802((byte) -97);
            }
            int var36 = arg0.method1802((byte) 58);
            int var37 = arg0.method1802((byte) 107);
            int var38 = var36 * 64 - class148.field2438;
            int var39 = class148.field2434 - (var37 * 64 - class148.field2437) - 1;
            if (var38 >= 0 && (var39 - 63) >= 0 && class148.field2436 > var38 + 63 && class148.field2434 > var39) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || var40 >= (var34 * 8) && var34 * 8 + 8 > var40 && var35 * 8 <= var42 && var35 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg0.method1768(98);
                        }
                    }
                }
            } else if (var33) {
                arg0.field4160 += 64;
            } else {
                arg0.field4160 += 4096;
            }
        }
        if (!arg1) {
            return;
        }
        int var5 = class148.field2436;
        int var6 = class148.field2434;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            if ((var12 & 0x1FF) == 0) {
                class287.method2002(true, (byte) 75);
            }
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class199 var29 = class144.method1061(var28 - 1, (byte) 43);
                        var7[var13] += var29.field3213;
                        var8[var13] += var29.field3220;
                        var9[var13] += var29.field3208;
                        var11[var13] += var29.field3216;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class199 var32 = class144.method1061(var31 - 1, (byte) 43);
                        var7[var13] -= var32.field3213;
                        var8[var13] -= var32.field3220;
                        var9[var13] -= var32.field3208;
                        var11[var13] -= var32.field3216;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class148.field2447[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 - 5;
                    int var22 = var20 + 5;
                    if (var22 < var6) {
                        var18 += var11[var22];
                        var19 += var10[var22];
                        var16 += var7[var22];
                        var15 += var8[var22];
                        var17 += var9[var22];
                    }
                    if (var21 >= 0) {
                        var15 -= var8[var21];
                        var17 -= var9[var21];
                        var18 -= var11[var21];
                        var19 -= var10[var21];
                        var16 -= var7[var21];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class22.method143(var17 / var19, var16 * 256 / var18, var15 / var19, (byte) -78);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var2;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var4 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class15.method84(63, var12) + class15.method84(var20 << 6, 4032)] = class128.field2139[class174.method1286((byte) -38, var26, 96)];
                        } else if (var23 != null) {
                            var23[class15.method84(4032, var20 << 6) + class15.method84(var12, 63)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(I)V")
    public static final void method1707(int arg0) {
        class237.field3992.method97(123);
        field4002++;
        class54.field947.method97(112);
        if (arg0 != -31074) {
            field4009 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "(I)V")
    public class238(int arg0) {
        this.field4005 = arg0;
        this.field4001 = new int[this.field4005];
        this.field4008 = new class206[this.field4005];
    }
}
