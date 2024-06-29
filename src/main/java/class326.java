import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bu")
public class class326 extends class214 {

    @OriginalMember(owner = "client!bu", name = "N", descriptor = "I")
    private int field4483 = 2048;

    @OriginalMember(owner = "client!bu", name = "O", descriptor = "I")
    private int field4484 = 1024;

    @OriginalMember(owner = "client!bu", name = "K", descriptor = "I")
    private int field4481 = 409;

    @OriginalMember(owner = "client!bu", name = "R", descriptor = "I")
    private int field4487 = 819;

    @OriginalMember(owner = "client!bu", name = "L", descriptor = "I")
    private int field4482 = 1024;

    @OriginalMember(owner = "client!bu", name = "Y", descriptor = "I")
    private int field4494 = 0;

    @OriginalMember(owner = "client!bu", name = "W", descriptor = "I")
    private int field4492 = 0;

    @OriginalMember(owner = "client!bu", name = "Q", descriptor = "I")
    private int field4486 = 1024;

    @OriginalMember(owner = "client!bu", name = "db", descriptor = "I")
    private int field4499 = 1024;

    @OriginalMember(owner = "client!bu", name = "cb", descriptor = "Lfn;")
    public static class52 field4498 = new class52(64, 3);

    @OriginalMember(owner = "client!bu", name = "eb", descriptor = "I")
    public static int field4500 = -1;

    @OriginalMember(owner = "client!bu", name = "J", descriptor = "I")
    public static int field4480;

    @OriginalMember(owner = "client!bu", name = "P", descriptor = "I")
    public static int field4485;

    @OriginalMember(owner = "client!bu", name = "S", descriptor = "I")
    public static int field4488;

    @OriginalMember(owner = "client!bu", name = "T", descriptor = "I")
    public static int field4489;

    @OriginalMember(owner = "client!bu", name = "U", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!bu", name = "V", descriptor = "I")
    private int field4491;

    @OriginalMember(owner = "client!bu", name = "X", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!bu", name = "Z", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!bu", name = "ab", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!bu", name = "bb", descriptor = "I")
    public static int field4497;

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "([[ILjava/util/Random;IIIII)V", line = 7)
    private final void method1957(int[][] arg0, Random arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4489;
        int var8 = this.field4486 > arg2 ? 4096 - class10.method100((byte) -125, this.field4486, arg1) : 4096;
        int var9 = this.field4491 * this.field4482 >> 12;
        int var10 = this.field4491 - (var9 > 0 ? class10.method100((byte) -92, var9, arg1) : 0);
        if (~arg3 <= ~class399.field5585) {
            arg3 -= class399.field5585;
        }
        if (~var10 >= -1) {
            if (~class399.field5585 <= ~(arg3 - -arg6)) {
                for (int var11 = 0; ~arg5 < ~var11; ++var11) {
                    class415.method2422(arg0[arg4 - -var11], arg3, arg6, var8);
                }
            } else {
                int var12 = -arg3 + class399.field5585;
                for (int var13 = 0; ~arg5 < ~var13; ++var13) {
                    int[] var14 = arg0[arg4 - -var13];
                    class415.method2422(var14, arg3, var12, var8);
                    class415.method2422(var14, 0, arg6 - var12, var8);
                }
            }
        } else if (~arg5 < -1 && ~arg6 < -1) {
            int var15 = arg6 / 2;
            int var16 = arg5 / 2;
            int var17 = var10 <= var15 ? var10 : var15;
            int var18 = ~var10 < ~var16 ? var16 : var10;
            int var19 = arg3 + var17;
            int var20 = arg6 - var17 * 2;
            for (int var21 = 0; arg5 > var21; ++var21) {
                int[] var22 = arg0[arg4 + var21];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field4492 != -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class347.method2074(arg3 + var24, class467.field6551)] = var22[class347.method2074(class467.field6551, -var24 + arg6 + arg3 - 1)] = var25 < var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class347.method2074(arg3 + var26, class467.field6551)] = var22[class347.method2074(class467.field6551, -var26 - 1 + arg3 + arg6)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class399.field5585 <= ~(var19 + var20)) {
                        class415.method2422(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class399.field5585;
                        class415.method2422(var22, var19, var27, var23);
                        class415.method2422(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 - 1;
                    if (var18 > var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field4492 != 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class347.method2074(arg3 + var31, class467.field6551)] = var22[class347.method2074(-var31 + -1 + arg6 + arg3, class467.field6551)] = var32 < var30 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class347.method2074(arg3 + var33, class467.field6551)] = var22[class347.method2074(class467.field6551, -var33 + arg6 + arg3 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (var19 - -var20 > class399.field5585) {
                            int var34 = -var19 + class399.field5585;
                            class415.method2422(var22, var19, var34, var30);
                            class415.method2422(var22, 0, -var34 + var20, var30);
                        } else {
                            class415.method2422(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class347.method2074(arg3 + var36, class467.field6551)] = var22[class347.method2074(arg3 - var36 + arg6 + -1, class467.field6551)] = var8 * var36 / var17;
                        }
                        if (var19 - -var20 > class399.field5585) {
                            int var37 = class399.field5585 - var19;
                            class415.method2422(var22, var19, var37, var8);
                            class415.method2422(var22, 0, -var37 + var20, var8);
                        } else {
                            class415.method2422(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BLjava/lang/String;C)[Ljava/lang/String;", line = 199)
    public static final String[] method1958(byte arg0, String arg1, char arg2) {
        ++field4497;
        int var3 = class139.method849(arg2, (byte) 66, arg1);
        String[] var4 = new String[var3 + 1];
        int var5 = 0;
        if (arg0 < 125) {
            method1960((byte) -31);
        }
        int var6 = 0;
        for (int var7 = 0; var7 < var3; ++var7) {
            int var8;
            for (var8 = var6; arg2 != arg1.charAt(var8); ++var8) {
            }
            var4[var5++] = arg1.substring(var6, var8);
            var6 = var8 + 1;
        }
        var4[var3] = arg1.substring(var6);
        return var4;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIILvk;III)Z", line = 234)
    public static final boolean method1959(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class272 arg7, int arg8, int arg9, int arg10) {
        ++field4485;
        int var11 = arg3;
        int var12 = arg10;
        byte var13 = 64;
        byte var14 = 64;
        int var15 = arg3 - var13;
        int var16 = -var14 + arg10;
        class159.field2286[var13][var14] = 99;
        if (arg4 != 19757) {
            field4500 = -41;
        }
        class84.field1267[var13][var14] = 0;
        byte var17 = 0;
        class180.field2615[var17] = arg3;
        int var18 = 0;
        byte var10001 = var17;
        int var26 = var17 + 1;
        class7.field130[var10001] = arg10;
        int[][] var19 = arg7.field3756;
        while (var26 != var18) {
            var12 = class7.field130[var18];
            var11 = class180.field2615[var18];
            int var20 = -var16 + var12;
            int var21 = var11 - var15;
            var18 = var18 + 1 & 4095;
            int var22 = -arg7.field3751 + var11;
            int var23 = var12 - arg7.field3761;
            if (arg8 != -4) {
                if (~arg8 != 2) {
                    if (arg8 != -2) {
                        if (~arg8 != 0) {
                            if (~arg8 != -1 && ~arg8 != -2 && arg8 != 2 && arg8 != 3 && ~arg8 != -10) {
                                if (arg7.method1691(arg1, arg5, var11, arg8, var12, false, arg2, 2)) {
                                    class239.field3376 = var11;
                                    class163.field2335 = var12;
                                    return true;
                                }
                            } else if (arg7.method1707(var12, (byte) 120, arg2, 2, arg1, arg8, arg5, var11)) {
                                class239.field3376 = var11;
                                class163.field2335 = var12;
                                return true;
                            }
                        } else if (arg7.method1693(arg5, arg0, var11, arg6, var12, arg9, arg1, 2, -81)) {
                            class163.field2335 = var12;
                            class239.field3376 = var11;
                            return true;
                        }
                    } else if (arg7.method1699(-3, 2, 2, arg0, arg1, arg6, arg9, arg5, var12, var11)) {
                        class163.field2335 = var12;
                        class239.field3376 = var11;
                        return true;
                    }
                } else if (class236.method1483(2, 2, arg6, arg1, var11, true, arg5, var12, arg0)) {
                    class163.field2335 = var12;
                    class239.field3376 = var11;
                    return true;
                }
            } else if (arg5 == var11 && ~arg1 == ~var12) {
                class163.field2335 = var12;
                class239.field3376 = var11;
                return true;
            }
            int var25 = class84.field1267[var21][var20] - -1;
            if (var21 > 0 && class159.field2286[var21 + -1][var20] == 0 && ~(1134821376 & var19[var22 + -1][var23]) == -1 && ~(1310982144 & var19[var22 + -1][var23 + 1]) == -1) {
                class180.field2615[var26] = var11 + -1;
                class7.field130[var26] = var12;
                class159.field2286[var21 + -1][var20] = 2;
                var26 = var26 + 1 & 4095;
                class84.field1267[var21 + -1][var20] = var25;
            }
            if (var21 < 126 && class159.field2286[var21 + 1][var20] == 0 && ~(var19[var22 - -2][var23] & 1625554944) == -1 && ~(var19[var22 + 2][var23 - -1] & 2015625216) == -1) {
                class180.field2615[var26] = var11 + 1;
                class7.field130[var26] = var12;
                var26 = var26 + 1 & 4095;
                class159.field2286[var21 + 1][var20] = 8;
                class84.field1267[var21 + 1][var20] = var25;
            }
            if (~var20 < -1 && class159.field2286[var21][var20 + -1] == 0 && (var19[var22][var23 + -1] & 1134821376) == 0 && (var19[var22 + 1][var23 + -1] & 1625554944) == 0) {
                class180.field2615[var26] = var11;
                class7.field130[var26] = var12 - 1;
                class159.field2286[var21][var20 + -1] = 1;
                var26 = 4095 & var26 - -1;
                class84.field1267[var21][var20 - 1] = var25;
            }
            if (var20 < 126 && ~class159.field2286[var21][var20 + 1] == -1 && (1310982144 & var19[var22][var23 + 2]) == 0 && (2015625216 & var19[var22 + 1][var23 + 2]) == 0) {
                class180.field2615[var26] = var11;
                class7.field130[var26] = var12 - -1;
                class159.field2286[var21][var20 + 1] = 4;
                var26 = 4095 & var26 + 1;
                class84.field1267[var21][var20 + 1] = var25;
            }
            if (~var21 < -1 && var20 > 0 && ~class159.field2286[var21 + -1][var20 - 1] == -1 && ~(var19[var22 - 1][var23] & 1336147968) == -1 && ~(var19[var22 - 1][var23 + -1] & 1134821376) == -1 && (var19[var22][var23 + -1] & 1675886592) == 0) {
                class180.field2615[var26] = var11 + -1;
                class7.field130[var26] = var12 - 1;
                class159.field2286[var21 + -1][var20 - 1] = 3;
                var26 = var26 - -1 & 4095;
                class84.field1267[var21 + -1][var20 - 1] = var25;
            }
            if (var21 < 126 && ~var20 < -1 && ~class159.field2286[var21 - -1][var20 + -1] == -1 && (1675886592 & var19[var22 + 1][var23 + -1]) == 0 && ~(1625554944 & var19[var22 - -2][var23 + -1]) == -1 && ~(2028208128 & var19[var22 + 2][var23]) == -1) {
                class180.field2615[var26] = var11 + 1;
                class7.field130[var26] = var12 - 1;
                var26 = 4095 & var26 - -1;
                class159.field2286[var21 + 1][var20 + -1] = 9;
                class84.field1267[var21 - -1][var20 + -1] = var25;
            }
            if (~var21 < -1 && var20 < 126 && ~class159.field2286[var21 + -1][var20 - -1] == -1 && (1336147968 & var19[var22 + -1][var23 + 1]) == 0 && ~(1310982144 & var19[var22 + -1][var23 - -2]) == -1 && (2116288512 & var19[var22][var23 + 2]) == 0) {
                class180.field2615[var26] = var11 + -1;
                class7.field130[var26] = var12 + 1;
                class159.field2286[var21 + -1][var20 - -1] = 6;
                var26 = var26 - -1 & 4095;
                class84.field1267[var21 - 1][var20 + 1] = var25;
            }
            if (var21 < 126 && ~var20 > -127 && ~class159.field2286[var21 - -1][var20 + 1] == -1 && ~(var19[var22 + 1][var23 + 2] & 2116288512) == -1 && ~(var19[var22 + 2][var23 + 2] & 2015625216) == -1 && (var19[var22 - -2][var23 - -1] & 2028208128) == 0) {
                class180.field2615[var26] = var11 + 1;
                class7.field130[var26] = var12 + 1;
                class159.field2286[var21 + 1][var20 + 1] = 12;
                var26 = var26 + 1 & 4095;
                class84.field1267[var21 + 1][var20 + 1] = var25;
            }
        }
        class163.field2335 = var12;
        class239.field3376 = var11;
        return false;
    }

    @OriginalMember(owner = "client!bu", name = "b", descriptor = "(B)V", line = 583)
    public static void method1960(byte arg0) {
        if (arg0 != -77) {
            method1960((byte) 81);
        }
        field4498 = null;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(Llk;II)V", line = 593)
    public final void method15(class425 arg0, int arg1, int arg2) {
        if (arg1 <= -114) {
            ++field4490;
            if (arg2 != 0) {
                if (arg2 != 1) {
                    if (arg2 != 2) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (arg2 != 5) {
                                    if (~arg2 != -7) {
                                        if (arg2 != 7) {
                                            if (arg2 == 8) {
                                                this.field4486 = arg0.method2508(true);
                                            }
                                        } else {
                                            this.field4482 = arg0.method2508(true);
                                        }
                                    } else {
                                        this.field4492 = arg0.method2503(true);
                                    }
                                } else {
                                    this.field4499 = arg0.method2508(true);
                                }
                            } else {
                                this.field4487 = arg0.method2508(true);
                            }
                        } else {
                            this.field4481 = arg0.method2508(true);
                        }
                    } else {
                        this.field4483 = arg0.method2508(true);
                    }
                } else {
                    this.field4484 = arg0.method2508(true);
                }
            } else {
                this.field4494 = arg0.method2503(true);
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "<init>", descriptor = "()V", line = 1113)
    public class326() {
        super(0, true);
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(BI)[I", line = 693)
    public final int[] method14(byte arg0, int arg1) {
        ++field4496;
        int[] var3 = super.field3024.method2585(arg1, 0);
        if (arg0 != 123) {
            this.method1957((int[][]) null, (Random) null, 122, 71, -128, 109, -32);
        }
        if (super.field3024.field6135) {
            int[][] var4 = super.field3024.method2582(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class399.field5585 * this.field4484 >> 12;
            int var15 = class399.field5585 * this.field4483 >> 12;
            int var16 = class490.field6924 * this.field4481 >> 12;
            int var17 = class490.field6924 * this.field4487 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field4491 = class399.field5585 / 8 * this.field4499 >> 12;
                int var18 = class399.field5585 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4494);
                while (true) {
                    while (true) {
                        int var22 = var14 + class10.method100((byte) -73, -var14 + var15, var21);
                        int var23 = var16 - -class10.method100((byte) -116, -var16 + var17, var21);
                        int var24 = var8 + var22;
                        if (~class399.field5585 > ~var24) {
                            var22 = class399.field5585 - var8;
                            var24 = class399.field5585;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var24 - -var5;
                            if (var28 < 0) {
                                var28 += class399.field5585;
                            }
                            if (var28 > class399.field5585) {
                                var28 -= class399.field5585;
                            }
                            var29 = var26[2];
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var30[0] <= var28 && ~var28 >= ~var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var8 - -var5;
                                        if (var31 < 0) {
                                            var31 += class399.field5585;
                                        }
                                        if (class399.field5585 < var31) {
                                            var31 -= class399.field5585;
                                        }
                                        for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var28) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class399.field5585;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method1957(var4, var21, arg0 ^ 123, var7 + var38, var35, -var35 + var29, var39 - var38);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var25 >= var12) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (~(var23 + var29) < ~class490.field6924) {
                            var23 = -var29 + class490.field6924;
                        } else {
                            var10 = false;
                        }
                        if (class399.field5585 != var24) {
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var29;
                            var41[1] = var24;
                            var41[0] = var8;
                            this.method1957(var4, var21, 0, var8 - -var6, var29, var23, var22);
                            var8 = var24;
                        } else {
                            this.method1957(var4, var21, 0, var8 - -var6, var29, var23, var22);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[2] = var23 + var29;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class10.method100((byte) -52, class399.field5585, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class399.field5585 + var5;
                            }
                            var9 = 0;
                            if (var44 > class399.field5585) {
                                var44 -= class399.field5585;
                            }
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && var45[1] >= var44) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIIII)V", line = 944)
    public static final void method1961(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field4480;
        int var8 = 0;
        int var9 = arg0;
        int var10 = 0;
        int var11 = -arg2 + arg7;
        int var12 = -arg2 + arg0;
        int var13 = arg7 * arg7;
        int var14 = arg0 * arg0;
        if (arg3 != -10472) {
            method1961(3, 64, 110, 64, -53, 121, 98, 56);
        }
        int var15 = var11 * var11;
        int var16 = var12 * var12;
        int var17 = var14 << 1;
        int var18 = var13 << 1;
        int var19 = var16 << 1;
        int var20 = var15 << 1;
        int var21 = arg0 << 1;
        int var22 = var12 << 1;
        int var23 = (-var21 + 1) * var13 + var17;
        int var24 = -((var21 + -1) * var18) + var14;
        int var25 = (1 - var22) * var15 - -var19;
        int var26 = -((var22 + -1) * var20) + var16;
        int var27 = var13 << 2;
        int var28 = var14 << 2;
        int var29 = var15 << 2;
        int var30 = var16 << 2;
        int var31 = var17 * 3;
        int var32 = (var21 + -3) * var18;
        int var33 = var19 * 3;
        int var34 = (var22 - 3) * var20;
        int var35 = var28;
        int var36 = (arg0 - 1) * var27;
        int var37 = var30;
        int var38 = (var12 + -1) * var29;
        int[] var39 = class2.field16[arg4];
        class80.method554(var39, 125, arg1, -var11 + arg6, -arg7 + arg6);
        class80.method554(var39, 105, arg5, arg6 + var11, -var11 + arg6);
        class80.method554(var39, 115, arg1, arg6 - -arg7, arg6 + var11);
        while (~var9 < -1) {
            boolean var40 = ~var9 >= ~var12;
            if (var23 < 0) {
                while (~var23 > -1) {
                    var23 += var31;
                    var24 += var35;
                    ++var8;
                    var35 += var28;
                    var31 += var28;
                }
            }
            if (var40) {
                if (var25 < 0) {
                    while (~var25 > -1) {
                        var26 += var37;
                        var25 += var33;
                        ++var10;
                        var37 += var30;
                        var33 += var30;
                    }
                }
                if (~var26 > -1) {
                    var26 += var37;
                    var25 += var33;
                    var37 += var30;
                    ++var10;
                    var33 += var30;
                }
                var26 += -var34;
                var25 += -var38;
                var34 -= var29;
                var38 -= var29;
            }
            if (var24 < 0) {
                var23 += var31;
                var24 += var35;
                var31 += var28;
                ++var8;
                var35 += var28;
            }
            var24 += -var32;
            var23 += -var36;
            --var9;
            var36 -= var27;
            var32 -= var27;
            int var41 = arg4 - var9;
            int var42 = arg4 + var9;
            int var43 = arg6 + var8;
            int var44 = arg6 - var8;
            if (!var40) {
                class80.method554(class2.field16[var41], 100, arg1, var43, var44);
                class80.method554(class2.field16[var42], 127, arg1, var43, var44);
            } else {
                int var45 = arg6 + var10;
                int var46 = -var10 + arg6;
                class80.method554(class2.field16[var41], arg3 ^ -10376, arg1, var46, var44);
                class80.method554(class2.field16[var41], arg3 + 10569, arg5, var45, var46);
                class80.method554(class2.field16[var41], 116, arg1, var43, var45);
                class80.method554(class2.field16[var42], 114, arg1, var46, var44);
                class80.method554(class2.field16[var42], arg3 + 10592, arg5, var45, var46);
                class80.method554(class2.field16[var42], arg3 ^ -10372, arg1, var43, var45);
            }
        }
    }

    @OriginalMember(owner = "client!bu", name = "e", descriptor = "(I)V", line = 1122)
    public final void method12(int arg0) {
        if (arg0 != 27108) {
            field4500 = -63;
        }
        ++field4488;
    }

    @OriginalMember(owner = "client!bu", name = "a", descriptor = "(IIIIIBI)V", line = 1136)
    public static final void method1962(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        if (~class299.field4121 >= ~arg2 && arg3 <= class248.field3487 && class53.field874 <= arg4 && ~arg6 >= ~class8.field174) {
            if (~arg0 == -2) {
                class248.method1539(arg4, arg2, arg6, arg3, arg1, (byte) -101);
            } else {
                class272.method1700(arg4, arg3, 1, arg1, arg6, arg0, arg2);
            }
        } else if (arg0 != 1) {
            class289.method1778(114, arg1, arg6, arg3, arg0, arg4, arg2);
        } else {
            class200.method1268(114, arg2, arg1, arg4, arg6, arg3);
        }
        if (arg5 < 10) {
            method1961(4, -77, 19, -109, 109, -30, -104, 91);
        }
        ++field4495;
    }
}
