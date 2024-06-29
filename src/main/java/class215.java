import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class215 {

    @OriginalMember(owner = "client!ug", name = "k", descriptor = "I")
    public int field3402 = -1;

    @OriginalMember(owner = "client!ug", name = "f", descriptor = "I")
    public int field3397 = -1;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "[J")
    public static long[] field3392 = new long[500];

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "I")
    public static int field3393 = -1;

    @OriginalMember(owner = "client!ug", name = "d", descriptor = "I")
    public static int field3395 = 0;

    @OriginalMember(owner = "client!ug", name = "e", descriptor = "I")
    public static int field3396 = 0;

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "I")
    public static int field3394;

    @OriginalMember(owner = "client!ug", name = "g", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!ug", name = "i", descriptor = "I")
    public static int field3400;

    @OriginalMember(owner = "client!ug", name = "j", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!ug", name = "l", descriptor = "I")
    public static int field3403;

    @OriginalMember(owner = "client!ug", name = "m", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!ug", name = "n", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!ug", name = "h", descriptor = "[I")
    public int[] field3399;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)I")
    public static final int method1474(boolean arg0, int arg1) {
        if (arg0) {
            return 78;
        } else {
            field3398++;
            return arg1 >>> 7;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(B)V")
    public static void method1475(byte arg0) {
        if (arg0 == -39) {
            field3392 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(BI)Lwk;")
    public static final class294 method1476(byte arg0, int arg1) {
        field3401++;
        class294 var2 = (class294) class312.field5034.method1879(8887, (long) arg1);
        int var3 = -20 / ((-arg0 - 69) / 43);
        if (var2 != null) {
            return var2;
        }
        class294 var4 = class78.method566(class127.field2040, class60.field873, arg1, false, -119);
        if (var4 != null) {
            class312.field5034.method1883((long) arg1, -77, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIILfj;)V")
    private final void method1477(int arg0, int arg1, int arg2, class274 arg3) {
        if (arg0 == 1) {
            this.field3402 = arg3.method1837(252);
        } else if (arg0 == 2) {
            this.field3399 = new int[arg3.method1849(255)];
            for (int var5 = 0; var5 < this.field3399.length; var5++) {
                this.field3399[var5] = arg3.method1837(252);
            }
        } else if (arg0 == 3) {
            this.field3397 = arg3.method1849(255);
        }
        field3403++;
        if (arg1 != 0) {
            method1475((byte) -42);
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfj;B)V")
    public static final void method1478(class274 arg0, byte arg1) {
        field3405++;
        int var2 = class262.field4274 >> 2 << 10;
        byte[][] var3 = new byte[class262.field4277][class262.field4278];
        int var4 = class262.field4271 >> 1;
        if (arg1 <= 70) {
            field3395 = 34;
        }
        while (arg0.field4458 < arg0.field4441.length) {
            boolean var33 = false;
            int var34 = 0;
            int var35 = 0;
            if (arg0.method1849(255) == 1) {
                var35 = arg0.method1849(255);
                var33 = true;
                var34 = arg0.method1849(255);
            }
            int var36 = arg0.method1849(255);
            int var37 = arg0.method1849(255);
            int var38 = var36 * 64 - class262.field4275;
            int var39 = class262.field4278 + class262.field4276 - (var37 * 64) - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && (var38 + 63) < class262.field4277 && var39 < class262.field4278) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var33 || (var35 * 8) <= var40 && var40 < var35 * 8 + 8 && var34 * 8 <= var42 && var42 < var34 * 8 + 8) {
                            var41[var39 - var42] = arg0.method1830((byte) -91);
                        }
                    }
                }
            } else if (var33) {
                arg0.field4458 += 64;
            } else {
                arg0.field4458 += 4096;
            }
        }
        int var5 = class262.field4277;
        int var6 = class262.field4278;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            if ((var12 & 0x1FF) == 0) {
                class21.method165(true, 117);
            }
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class97 var29 = class152.method1028((byte) -114, var28 - 1);
                        var7[var13] += var29.field1531;
                        var8[var13] += var29.field1529;
                        var9[var13] += var29.field1522;
                        var11[var13] += var29.field1536;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class97 var32 = class152.method1028((byte) -116, var31 - 1);
                        var7[var13] -= var32.field1531;
                        var8[var13] -= var32.field1529;
                        var9[var13] -= var32.field1522;
                        var11[var13] -= var32.field1536;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int[][] var14 = class262.field4286[var12 >> 6];
                int var15 = 0;
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    int var22 = var20 - 5;
                    if (var21 < var6) {
                        var18 += var8[var21];
                        var15 += var7[var21];
                        var16 += var9[var21];
                        var17 += var10[var21];
                        var19 += var11[var21];
                    }
                    if (var22 >= 0) {
                        var16 -= var9[var22];
                        var17 -= var10[var22];
                        var15 -= var7[var22];
                        var18 -= var8[var22];
                        var19 -= var11[var22];
                    }
                    if (var20 >= 0 && var17 > 0) {
                        int[] var23 = var14[var20 >> 6];
                        int var24 = var19 == 0 ? 0 : class65.method430(var16 / var17, var15 * 256 / var19, true, var18 / var17);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var14[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var4;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class233.method1609(var20 << 6, 4032) + class233.method1609(var12, 63)] = class136.field2192[class41.method286(var26, 96, 32)];
                        } else if (var23 != null) {
                            var23[class233.method1609(var12, 63) + class233.method1609(4032, var20 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(I[BZI)I")
    public static final int method1479(int arg0, byte[] arg1, boolean arg2, int arg3) {
        field3404++;
        if (!arg2) {
            field3392 = null;
        }
        int var4 = -1;
        for (int var5 = arg0; var5 < arg3; var5++) {
            var4 = var4 >>> 8 ^ class46.field684[(arg1[var5] ^ var4) & 0xFF];
        }
        return ~var4;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(Lfj;IZ)V")
    public final void method1480(class274 arg0, int arg1, boolean arg2) {
        field3394++;
        while (true) {
            int var4 = arg0.method1849(255);
            if (var4 == 0) {
                if (arg2) {
                    method1475((byte) 108);
                    return;
                } else {
                    return;
                }
            }
            this.method1477(var4, 0, arg1, arg0);
        }
    }
}
