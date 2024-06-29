import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bi")
public class class68 extends class105 {

    @OriginalMember(owner = "client!bi", name = "P", descriptor = "I")
    private int field1290 = 585;

    @OriginalMember(owner = "client!bi", name = "O", descriptor = "Z")
    public static boolean field1289 = false;

    @OriginalMember(owner = "client!bi", name = "W", descriptor = "Lvf;")
    private static class265 field1297 = class87.method582(-46, " is already on your ignore list)3");

    @OriginalMember(owner = "client!bi", name = "U", descriptor = "Lvf;")
    public static class265 field1295 = class87.method582(-46, "Prendre");

    @OriginalMember(owner = "client!bi", name = "db", descriptor = "Z")
    public static boolean field1304 = true;

    @OriginalMember(owner = "client!bi", name = "cb", descriptor = "Lvf;")
    public static class265 field1303 = class87.method582(-46, "");

    @OriginalMember(owner = "client!bi", name = "Q", descriptor = "Lvf;")
    public static class265 field1291 = field1297;

    @OriginalMember(owner = "client!bi", name = "N", descriptor = "I")
    public static int field1288;

    @OriginalMember(owner = "client!bi", name = "R", descriptor = "I")
    public static int field1292;

    @OriginalMember(owner = "client!bi", name = "S", descriptor = "I")
    public static int field1293;

    @OriginalMember(owner = "client!bi", name = "T", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!bi", name = "V", descriptor = "I")
    public static int field1296;

    @OriginalMember(owner = "client!bi", name = "X", descriptor = "I")
    public static int field1298;

    @OriginalMember(owner = "client!bi", name = "Y", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!bi", name = "Z", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!bi", name = "bb", descriptor = "I")
    public static int field1302;

    @OriginalMember(owner = "client!bi", name = "eb", descriptor = "I")
    public static int field1305;

    @OriginalMember(owner = "client!bi", name = "fb", descriptor = "I")
    public static int field1306;

    @OriginalMember(owner = "client!bi", name = "gb", descriptor = "I")
    public static int field1307;

    @OriginalMember(owner = "client!bi", name = "ab", descriptor = "[I")
    public static int[] field1301;

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ILfl;B)Lvj;")
    public static final class88 method484(int arg0, class192 arg1, byte arg2) {
        int var3 = 49 % ((arg2 - -79) / 32);
        ++field1298;
        return !class53.method415(arg1, 11465, arg0) ? null : class66.method475(-51);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field1288;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = class219.field3951[arg1];
            for (int var5 = 0; var5 < class94.field1668; ++var5) {
                int var6 = class277.field4894[var5];
                if (this.field1290 < var6 && ~var6 > ~(-this.field1290 + 4096) && 2048 - this.field1290 < var4 && this.field1290 + 2048 > var4) {
                    int var7 = -var6 + 2048;
                    int var8 = var7 >= 0 ? var7 : -var7;
                    int var9 = var8 << 12;
                    int var10 = var9 / (2048 - this.field1290);
                    var3[var5] = 4096 - var10;
                } else if (var6 > -this.field1290 + 2048 && ~(this.field1290 + 2048) < ~var6) {
                    int var11 = var4 + -2048;
                    int var12 = ~var11 <= -1 ? var11 : -var11;
                    int var13 = var12 - this.field1290;
                    int var14 = var13 << 12;
                    var3[var5] = var14 / (2048 - this.field1290);
                } else if (this.field1290 <= var4 && ~(4096 - this.field1290) <= ~var4) {
                    if (var6 >= this.field1290 && var6 <= -this.field1290 + 4096) {
                        var3[var5] = 0;
                    } else {
                        int var15 = 2048 - var4;
                        int var16 = var15 >= 0 ? var15 : -var15;
                        int var17 = var16 << 12;
                        int var18 = var17 / (-this.field1290 + 2048);
                        var3[var5] = -var18 + 4096;
                    }
                } else {
                    int var19 = var6 + -2048;
                    int var20 = ~var19 <= -1 ? var19 : -var19;
                    int var21 = var20 - this.field1290;
                    int var22 = var21 << 12;
                    var3[var5] = var22 / (2048 - this.field1290);
                }
            }
        }
        if (arg0 != 8055) {
            this.method12(-123, 49, (class135) null);
        }
        return var3;
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(B)V")
    public static void method485(byte arg0) {
        field1301 = null;
        field1295 = null;
        field1297 = null;
        field1303 = null;
        if (arg0 <= -61) {
            field1291 = null;
        }
    }

    @OriginalMember(owner = "client!bi", name = "<init>", descriptor = "()V")
    public class68() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bi", name = "b", descriptor = "(IZ)V")
    public static final void method486(int arg0, boolean arg1) {
        class75.field1442 = new int[104];
        if (arg0 != 1212553190) {
            method490((byte) -119, (class135) null);
        }
        class268.field4721 = 99;
        class276.field4879 = new int[104];
        class43.field963 = new int[104];
        ++field1300;
        class177.field3160 = new int[104];
        byte var2;
        if (arg1) {
            var2 = 1;
        } else {
            var2 = 4;
        }
        class81.field1528 = new byte[var2][104][104];
        class283.field4984 = new byte[var2][104][104];
        class282.field4966 = new byte[var2][104][104];
        class70.field1345 = new int[var2][105][105];
        class11.field385 = new byte[var2][105][105];
        class14.field423 = new byte[var2][104][104];
        class16.field461 = new int[104];
    }

    @OriginalMember(owner = "client!bi", name = "g", descriptor = "(I)Lr;")
    public static final class229 method487(int arg0) {
        if (arg0 >= -109) {
            field1291 = null;
        }
        ++field1292;
        class18.field486 = 0;
        return class210.method1438(125);
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (~arg0 == -1) {
            this.field1290 = arg2.method927(127);
        }
        if (arg1 != 255) {
            this.field1290 = 82;
        }
        ++field1306;
    }

    @OriginalMember(owner = "client!bi", name = "h", descriptor = "(I)V")
    public static final void method488(int arg0) {
        ++field1293;
        int var1 = -23 % ((-51 - arg0) / 61);
        if (!class231.method1561(25088) && class58.field1181 != class216.field3902) {
            class200.method1379(class45.field1006, class216.field3902, class105.field1850, class214.field3827.field2575[0], false, class214.field3827.field2536[0], 128);
        } else if (class232.field4098 != class216.field3902) {
            class232.field4098 = class216.field3902;
            class169.method1115(-27952, class216.field3902);
            client.method1469((byte) 0);
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(ZIIIIII)I")
    public static final int method489(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (~(arg3 & 1) == -2) {
            int var7 = arg2;
            arg2 = arg6;
            arg6 = var7;
        }
        ++field1294;
        if (arg0) {
            method489(true, 48, -54, 68, -40, -114, -66);
        }
        int var8 = arg4 & 3;
        if (~var8 == -1) {
            return arg1;
        } else if (~var8 == -2) {
            return arg5;
        } else {
            return ~var8 == -3 ? -arg2 - (-8 - -arg1) : -arg5 + 7 + 1 + -arg6;
        }
    }

    @OriginalMember(owner = "client!bi", name = "a", descriptor = "(BLng;)V")
    public static final void method490(byte arg0, class135 arg1) {
        ++field1299;
        if (arg0 == -48) {
            int var2 = class147.field2754 >> 1;
            byte[][] var3 = new byte[class213.field3824][class155.field2871];
            int var4 = class100.field1784 >> 2 << 10;
            while (~arg1.field2449 > ~arg1.field2483.length) {
                boolean var33 = false;
                int var34 = 0;
                int var35 = 0;
                if (arg1.method920((byte) 93) == 1) {
                    var33 = true;
                    var35 = arg1.method920((byte) 35);
                    var34 = arg1.method920((byte) 28);
                }
                int var36 = arg1.method920((byte) 126);
                int var37 = arg1.method920((byte) 118);
                int var38 = var36 * 64 - class269.field4796;
                int var39 = class176.field3141 + class155.field2871 + -1 + -(var37 * 64);
                if (~var38 <= -1 && ~(var39 + -63) <= -1 && ~class213.field3824 < ~(var38 - -63) && var39 < class155.field2871) {
                    for (int var40 = 0; var40 < 64; ++var40) {
                        byte[] var41 = var3[var38 + var40];
                        for (int var42 = 0; ~var42 > -65; ++var42) {
                            if (!var33 || var40 >= var35 * 8 && ~var40 > ~(var35 * 8 - -8) && ~(var34 * 8) >= ~var42 && ~(var34 * 8 - -8) < ~var42) {
                                var41[-var42 + var39] = arg1.method929((byte) -3);
                            }
                        }
                    }
                } else if (!var33) {
                    arg1.field2449 += 4096;
                } else {
                    arg1.field2449 += 64;
                }
            }
            int var5 = class213.field3824;
            int var6 = class155.field2871;
            int[] var7 = new int[var6];
            int[] var8 = new int[var6];
            int[] var9 = new int[var6];
            int[] var10 = new int[var6];
            int[] var11 = new int[var6];
            for (int var12 = -5; var5 > var12; ++var12) {
                for (int var13 = 0; var6 > var13; ++var13) {
                    int var27 = var12 + 5;
                    int var10002;
                    if (var27 < var5) {
                        int var28 = 255 & var3[var27][var13];
                        if (var28 > 0) {
                            class65 var29 = class17.method120(-8, var28 + -1);
                            var9[var13] += var29.field1250;
                            var8[var13] += var29.field1252;
                            var7[var13] += var29.field1249;
                            var10[var13] += var29.field1255;
                            var10002 = var11[var13]++;
                        }
                    }
                    int var30 = var12 + -5;
                    if (~var30 <= -1) {
                        int var31 = 255 & var3[var30][var13];
                        if (var31 > 0) {
                            class65 var32 = class17.method120(arg0 ^ 40, var31 - 1);
                            var9[var13] -= var32.field1250;
                            var8[var13] -= var32.field1252;
                            var7[var13] -= var32.field1249;
                            var10[var13] -= var32.field1255;
                            var10002 = var11[var13]--;
                        }
                    }
                }
                if (~var12 <= -1) {
                    int[][] var14 = class172.field3112[var12 >> 6];
                    int var15 = 0;
                    int var16 = 0;
                    int var17 = 0;
                    int var18 = 0;
                    int var19 = 0;
                    for (int var20 = -5; var6 > var20; ++var20) {
                        int var21 = var20 + 5;
                        int var22 = var20 + -5;
                        if (var6 > var21) {
                            var16 += var10[var21];
                            var15 += var8[var21];
                            var18 += var7[var21];
                            var17 += var9[var21];
                            var19 += var11[var21];
                        }
                        if (var22 >= 0) {
                            var17 -= var9[var22];
                            var19 -= var11[var22];
                            var18 -= var7[var22];
                            var15 -= var8[var22];
                            var16 -= var10[var22];
                        }
                        if (var20 >= 0 && var19 > 0) {
                            int[] var23 = var14[var20 >> 6];
                            int var24 = var16 == 0 ? 0 : class79.method547(var15 / var19, var17 * 256 / var16, var18 / var19, 0);
                            if (~var3[var12][var20] == -1) {
                                if (var23 != null) {
                                    var23[class203.method1395(var12, 63) + (class203.method1395(var20, 63) << 6)] = 0;
                                }
                            } else {
                                if (var23 == null) {
                                    var23 = var14[var20 >> 6] = new int[4096];
                                }
                                int var25 = (127 & var24) - -var2;
                                if (var25 >= 0) {
                                    if (~var25 < -128) {
                                        var25 = 127;
                                    }
                                } else {
                                    var25 = 0;
                                }
                                int var26 = (64512 & var4 + var24) + (var24 & 896) + var25;
                                var23[class203.method1395(var12, 63) + (class203.method1395(var20, 63) << 6)] = class247.field4286[class137.method952(var26, (byte) 96, 96)];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bi", name = "c", descriptor = "(IZ)V")
    public static final void method491(int arg0, boolean arg1) {
        byte var2 = 4;
        byte[][] var3 = class254.field4372;
        ++field1302;
        int var4 = 0;
        if (arg0 == 27440) {
            while (~var4 > ~var2) {
                class44.method369(true);
                for (int var5 = 0; var5 < 13; ++var5) {
                    for (int var6 = 0; ~var6 > -14; ++var6) {
                        boolean var7 = false;
                        int var8 = class197.field3516[var4][var5][var6];
                        if (~var8 != 0) {
                            int var9 = 3 & var8 >> 24;
                            if (!arg1 || ~var9 == -1) {
                                int var10 = (7 & var8) >> 1;
                                int var11 = (var8 & 16775537) >> 14;
                                int var12 = 2047 & var8 >> 3;
                                int var13 = (var11 / 8 << 8) + var12 / 8;
                                for (int var14 = 0; class111.field1953.length > var14; ++var14) {
                                    if (class111.field1953[var14] == var13 && var3[var14] != null) {
                                        var7 = true;
                                        class143.method991(arg0 ^ 27448, var6 * 8, var10, var5 * 8, arg1, (var11 & 7) * 8, (var12 & 7) * 8, var9, class130.field2279, var4, var3[var14]);
                                        break;
                                    }
                                }
                            }
                        }
                        if (!var7) {
                            class252.method1669(var4, var5 * 8, -17939, var6 * 8, 8, 8);
                        }
                    }
                }
                ++var4;
            }
        }
    }
}
