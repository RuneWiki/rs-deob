import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class231 extends class42 {

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "Ljava/lang/Object;")
    private Object field3601;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "[Ljava/lang/String;")
    public static String[] field3597 = new String[500];

    @OriginalMember(owner = "client!ia", name = "S", descriptor = "I")
    public static int field3602 = 0;

    @OriginalMember(owner = "client!ia", name = "T", descriptor = "[J")
    public static long[] field3603 = new long[200];

    @OriginalMember(owner = "client!ia", name = "U", descriptor = "J")
    public static long field3604 = 0L;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    public static int field3598;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "I")
    public static int field3599;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "I")
    public static int field3600;

    @OriginalMember(owner = "client!ia", name = "V", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!ia", name = "W", descriptor = "I")
    public static int field3606;

    @OriginalMember(owner = "client!ia", name = "X", descriptor = "I")
    public static int field3607;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(III)Lei;")
    public static final class175 method1523(int arg0, int arg1, int arg2) {
        class23 var3 = class255.field3907[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class175 var4 = var3.field345;
            var3.field345 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ILf;)V")
    public static final void method1524(int arg0, class37 arg1) {
        field3598++;
        int var2 = class62.field1004 >> 2 << 10;
        byte[][] var3 = new byte[class188.field3010][class221.field3453];
        int var4 = class64.field1023 >> 1;
        while (arg1.field588 < arg1.field583.length) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (arg1.method333((byte) -59) == 1) {
                var35 = arg1.method333((byte) -59);
                var33 = arg1.method333((byte) -59);
                var34 = true;
            }
            int var36 = arg1.method333((byte) -59);
            int var37 = arg1.method333((byte) -59);
            int var38 = class221.field3453 - (var37 * 64 - class197.field3093) - 1;
            int var39 = var36 * 64 - class76.field1275;
            if (var39 >= 0 && (var38 - 63) >= 0 && var39 + 63 < class188.field3010 && class221.field3453 > var38) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var3[var39 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var34 || var35 * 8 <= var40 && (var35 * 8 + 8) > var40 && (var33 * 8) <= var42 && var42 < (var33 * 8 + 8)) {
                            var41[var38 - var42] = arg1.method322((byte) 82);
                        }
                    }
                }
            } else if (var34) {
                arg1.field588 += 64;
            } else {
                arg1.field588 += 4096;
            }
        }
        int var5 = class188.field3010;
        int var6 = class221.field3453;
        int[] var7 = new int[var6];
        if (arg0 != 200) {
            field3599 = 47;
        }
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var27 < var5) {
                    int var28 = var3[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class216 var29 = class286.method1922(255, var28 - 1);
                        var10[var13] += var29.field3336;
                        var8[var13] += var29.field3340;
                        var11[var13] += var29.field3338;
                        var9[var13] += var29.field3329;
                        var10002 = var7[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var3[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class216 var32 = class286.method1922(255, var31 - 1);
                        var10[var13] -= var32.field3336;
                        var8[var13] -= var32.field3340;
                        var11[var13] -= var32.field3338;
                        var9[var13] -= var32.field3329;
                        var10002 = var7[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int[][] var15 = class18.field285[var12 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var6 > var21) {
                        var19 += var7[var21];
                        var18 += var9[var21];
                        var14 += var10[var21];
                        var17 += var8[var21];
                        var16 += var11[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var17 -= var8[var22];
                        var14 -= var10[var22];
                        var16 -= var11[var22];
                        var18 -= var9[var22];
                        var19 -= var7[var22];
                    }
                    if (var20 >= 0 && var19 > 0) {
                        int[] var23 = var15[var20 >> 6];
                        int var24 = var18 == 0 ? 0 : class118.method851(var14 * 256 / var18, -23456, var16 / var19, var17 / var19);
                        if (var3[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var15[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var4;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var2 + var24 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class3.method48(var12, 63) + (class3.method48(var20, 63) << 6)] = class97.field1561[class1.method4(1, var26, 96)];
                        } else if (var23 != null) {
                            var23[class3.method48(var12, 63) + class3.method48(4032, var20 << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Ljava/lang/Object;)V")
    public class231(Object arg0) {
        this.field3601 = arg0;
    }

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "(I)Z")
    public final boolean method360(int arg0) {
        field3607++;
        if (arg0 != 0) {
            this.method360(-43);
        }
        return false;
    }

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "(I)Ljava/lang/Object;")
    public final Object method356(int arg0) {
        field3605++;
        if (arg0 != 0) {
            this.field3601 = null;
        }
        return this.field3601;
    }

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "(I)V")
    public static final void method1525(int arg0) {
        class245.field3797.method1782(103);
        field3606++;
        if (arg0 != 896) {
            method1525(80);
        }
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(B)V")
    public static void method1526(byte arg0) {
        field3603 = null;
        field3597 = null;
        if (arg0 <= 90) {
            method1524(-14, (class37) null);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IZ)V")
    public static final void method1527(int arg0, boolean arg1) {
        int var2 = 97 / ((arg0 + 6) / 44);
        class273.field4308 = 99;
        field3600++;
        class228.field3560 = new int[104];
        class109.field1728 = new int[5];
        class154.field2354 = new int[104];
        class141.field2177 = new int[104];
        class204.field3181 = new int[104];
        class203.field3170 = new int[104];
        byte var3;
        if (arg1) {
            var3 = 1;
        } else {
            var3 = 4;
        }
        class105.field1684 = new byte[var3][104][104];
        class72.field1139 = new byte[var3][104][104];
        class245.field3799 = new int[var3][105][105];
        class35.field575 = new byte[var3][104][104];
        class154.field2356 = new byte[var3][104][104];
        class113.field1782 = new byte[var3][105][105];
    }
}
