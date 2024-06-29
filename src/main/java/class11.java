import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class11 extends class105 {

    @OriginalMember(owner = "client!nk", name = "M", descriptor = "I")
    private int field363 = 2048;

    @OriginalMember(owner = "client!nk", name = "U", descriptor = "I")
    private int field371 = 0;

    @OriginalMember(owner = "client!nk", name = "X", descriptor = "I")
    private int field374 = 1024;

    @OriginalMember(owner = "client!nk", name = "Q", descriptor = "I")
    private int field367 = 1024;

    @OriginalMember(owner = "client!nk", name = "cb", descriptor = "I")
    private int field379 = 1024;

    @OriginalMember(owner = "client!nk", name = "gb", descriptor = "I")
    private int field383 = 0;

    @OriginalMember(owner = "client!nk", name = "Y", descriptor = "I")
    private int field375 = 409;

    @OriginalMember(owner = "client!nk", name = "eb", descriptor = "I")
    private int field381 = 819;

    @OriginalMember(owner = "client!nk", name = "hb", descriptor = "I")
    private int field384 = 1024;

    @OriginalMember(owner = "client!nk", name = "T", descriptor = "[J")
    public static long[] field370 = new long[32];

    @OriginalMember(owner = "client!nk", name = "bb", descriptor = "Z")
    public static boolean field378 = false;

    @OriginalMember(owner = "client!nk", name = "S", descriptor = "Lvf;")
    public static class265 field369 = class87.method582(-46, "Verbindung abgebrochen)3");

    @OriginalMember(owner = "client!nk", name = "N", descriptor = "I")
    public static int field364;

    @OriginalMember(owner = "client!nk", name = "O", descriptor = "I")
    public static int field365;

    @OriginalMember(owner = "client!nk", name = "P", descriptor = "I")
    public static int field366;

    @OriginalMember(owner = "client!nk", name = "R", descriptor = "I")
    public static int field368;

    @OriginalMember(owner = "client!nk", name = "V", descriptor = "I")
    public static int field372;

    @OriginalMember(owner = "client!nk", name = "W", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!nk", name = "ab", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!nk", name = "fb", descriptor = "I")
    public static int field382;

    @OriginalMember(owner = "client!nk", name = "Z", descriptor = "Lla;")
    public static class116 field376;

    @OriginalMember(owner = "client!nk", name = "db", descriptor = "Lfl;")
    public static class192 field380;

    @OriginalMember(owner = "client!nk", name = "ib", descriptor = "[[[B")
    public static byte[][][] field385;

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(IILng;)V")
    public final void method12(int arg0, int arg1, class135 arg2) {
        if (arg1 != 255) {
            method91(false);
        }
        ++field382;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field367 = arg2.method927(125);
                                        }
                                    } else {
                                        this.field374 = arg2.method927(127);
                                    }
                                } else {
                                    this.field383 = arg2.method920((byte) 46);
                                }
                            } else {
                                this.field379 = arg2.method927(arg1 ^ 129);
                            }
                        } else {
                            this.field381 = arg2.method927(127);
                        }
                    } else {
                        this.field375 = arg2.method927(126);
                    }
                } else {
                    this.field363 = arg2.method927(125);
                }
            } else {
                this.field384 = arg2.method927(arg1 ^ 130);
            }
        } else {
            this.field371 = arg2.method920((byte) 124);
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([BI[Ljg;IIZ)V")
    public static final void method90(byte[] arg0, int arg1, class257[] arg2, int arg3, int arg4, boolean arg5) {
        ++field372;
        class135 var6 = new class135(arg0);
        int var7 = -1;
        while (true) {
            int var8 = var6.method895(32767);
            if (var8 == 0) {
                if (arg4 < 115) {
                    method92(74, 127, (class6[]) null);
                    return;
                }
                return;
            }
            var7 += var8;
            int var9 = 0;
            while (true) {
                int var10 = var6.method947(27126);
                if (var10 == 0) {
                    break;
                }
                var9 += var10 + -1;
                int var11 = 63 & var9;
                int var12 = var6.method920((byte) 101);
                int var13 = var9 >> 12;
                int var14 = var12 >> 2;
                int var15 = (4057 & var9) >> 6;
                int var16 = 3 & var12;
                int var17 = arg1 + var11;
                int var18 = arg3 + var15;
                if (var18 > 0 && ~var17 < -1 && var18 < 103 && var17 < 103) {
                    class257 var19 = null;
                    if (!arg5) {
                        int var20 = var13;
                        if (~(2 & class230.field4064[1][var18][var17]) == -3) {
                            var20 = var13 - 1;
                        }
                        if (var20 >= 0) {
                            var19 = arg2[var20];
                        }
                    }
                    class164.method1083(!arg5, var7, arg5, 98, var13, var14, var18, var19, var13, var16, var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "c", descriptor = "(Z)V")
    public static void method91(boolean arg0) {
        field369 = null;
        field380 = null;
        field385 = null;
        if (arg0) {
            field370 = null;
            field376 = null;
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II[Lgk;)V")
    public static final void method92(int arg0, int arg1, class6[] arg2) {
        ++field366;
        if (arg1 != 8) {
            method92(72, 62, (class6[]) null);
        }
        for (int var3 = 0; arg2.length > var3; ++var3) {
            class6 var4 = arg2[var3];
            if (var4 != null) {
                if (~var4.field187 == -1) {
                    if (var4.field160 != null) {
                        method92(arg0, 8, var4.field160);
                    }
                    class181 var5 = (class181) class49.field1042.method1842(-1, (long) var4.field219);
                    if (var5 != null) {
                        class93.method637(arg0, var5.field3217, 104);
                    }
                }
                if (~arg0 == -1 && var4.field201 != null) {
                    class277 var6 = new class277();
                    var6.field4901 = var4;
                    var6.field4883 = var4.field201;
                    class192.method1318(var6, 200000);
                }
                if (~arg0 == -2 && var4.field155 != null) {
                    if (~var4.field233 <= -1) {
                        class6 var7 = class21.method204(var4.field219, -16257);
                        if (var7 == null || var7.field160 == null || var4.field233 >= var7.field160.length || var7.field160[var4.field233] != var4) {
                            continue;
                        }
                    }
                    class277 var8 = new class277();
                    var8.field4901 = var4;
                    var8.field4883 = var4.field155;
                    class192.method1318(var8, arg1 ^ 200008);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "([[IIILjava/util/Random;III)V")
    private final void method93(int[][] arg0, int arg1, int arg2, Random arg3, int arg4, int arg5, int arg6) {
        ++field364;
        int var8 = this.field367 > 0 ? -class100.method664((byte) -86, arg3, this.field367) + 4096 : 4096;
        int var9 = this.field374 * this.field373 >> 12;
        int var10 = this.field373 + -(var9 > 0 ? class100.method664((byte) -86, arg3, var9) : 0);
        if (~class94.field1668 >= ~arg4) {
            arg4 -= class94.field1668;
        }
        if (arg2 != 790) {
            this.field375 = 95;
        }
        if (var10 > 0) {
            if (arg6 > 0 && arg5 > 0) {
                int var11 = arg5 / 2;
                int var12 = arg6 / 2;
                int var13 = var10 > var11 ? var11 : var10;
                int var14 = arg4 + var13;
                int var15 = -(var13 * 2) + arg5;
                int var16 = ~var12 <= ~var10 ? var10 : var12;
                for (int var17 = 0; arg6 > var17; ++var17) {
                    int[] var18 = arg0[arg1 + var17];
                    if (~var17 > ~var16) {
                        int var19 = var8 * var17 / var16;
                        if (this.field383 == 0) {
                            for (int var20 = 0; ~var20 > ~var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class203.method1395(class1.field20, arg4 - -var20)] = var18[class203.method1395(class1.field20, arg4 + arg5 + -1 + -var20)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class203.method1395(class1.field20, arg4 + var22)] = var18[class203.method1395(class1.field20, arg4 - -arg5 + -var22 + -1)] = ~var19 < ~var24 ? var24 : var19;
                            }
                        }
                        if (~class94.field1668 <= ~(var14 - -var15)) {
                            class194.method1346(var18, var14, var15, var19);
                        } else {
                            int var23 = -var14 + class94.field1668;
                            class194.method1346(var18, var14, var23, var19);
                            class194.method1346(var18, 0, -var23 + var15, var19);
                        }
                    } else {
                        int var25 = -var17 + arg6 + -1;
                        if (var16 > var25) {
                            int var26 = var8 * var25 / var16;
                            if (this.field383 != 0) {
                                for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class203.method1395(class1.field20, arg4 + var27)] = var18[class203.method1395(class1.field20, arg4 - -arg5 - 1 + -var27)] = ~var26 >= ~var28 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; ~var29 > ~var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class203.method1395(arg4 + var29, class1.field20)] = var18[class203.method1395(arg5 - var29 + -1 + arg4, class1.field20)] = var26 * var31 >> 12;
                                }
                            }
                            if (~(var14 + var15) >= ~class94.field1668) {
                                class194.method1346(var18, var14, var15, var26);
                            } else {
                                int var30 = -var14 + class94.field1668;
                                class194.method1346(var18, var14, var30, var26);
                                class194.method1346(var18, 0, -var30 + var15, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class203.method1395(arg4 + var32, class1.field20)] = var18[class203.method1395(class1.field20, arg5 - var32 + arg4 + -1)] = var8 * var32 / var13;
                            }
                            if (~(var14 - -var15) >= ~class94.field1668) {
                                class194.method1346(var18, var14, var15, var8);
                            } else {
                                int var33 = -var14 + class94.field1668;
                                class194.method1346(var18, var14, var33, var8);
                                class194.method1346(var18, 0, -var33 + var15, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg4 + arg5 > class94.field1668) {
            int var34 = -arg4 + class94.field1668;
            for (int var35 = 0; var35 < arg6; ++var35) {
                int[] var36 = arg0[arg1 + var35];
                class194.method1346(var36, arg4, var34, var8);
                class194.method1346(var36, 0, -var34 + arg5, var8);
            }
        } else {
            for (int var37 = 0; ~arg6 < ~var37; ++var37) {
                class194.method1346(arg0[arg1 + var37], arg4, arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!nk", name = "<init>", descriptor = "()V")
    public class11() {
        super(0, true);
    }

    @OriginalMember(owner = "client!nk", name = "a", descriptor = "(II)[I")
    public final int[] method16(int arg0, int arg1) {
        ++field368;
        int[] var3 = super.field1862.method458(arg1, false);
        if (super.field1862.field1236) {
            int var4 = 0;
            int[][] var5 = super.field1862.method459(0);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            boolean var13 = true;
            int var14 = class94.field1668 * this.field363 >> 12;
            int var15 = class94.field1668 * this.field384 >> 12;
            int var16 = class102.field1804 * this.field375 >> 12;
            int var17 = class102.field1804 * this.field381 >> 12;
            if (~var17 >= -2) {
                return var5[arg1];
            }
            int var18 = class94.field1668 / var15 + 1;
            this.field373 = class94.field1668 / 8 * this.field379 >> 12;
            Random var19 = new Random((long) this.field371);
            int[][] var20 = new int[var18][3];
            int[][] var21 = new int[var18][3];
            label126: while (true) {
                while (true) {
                    int var22 = var15 + class100.method664((byte) -86, var19, -var15 + var14);
                    int var23 = var8 + var22;
                    int var24 = var16 + class100.method664((byte) -86, var19, -var16 + var17);
                    if (var23 > class94.field1668) {
                        var22 = -var8 + class94.field1668;
                        var23 = class94.field1668;
                    }
                    int var25;
                    if (var13) {
                        var25 = 0;
                    } else {
                        int var26 = var11;
                        int var27 = 0;
                        int var28 = var23 - -var4;
                        if (~var28 > -1) {
                            var28 += class94.field1668;
                        }
                        int[] var29 = var20[var11];
                        if (~class94.field1668 > ~var28) {
                            var28 -= class94.field1668;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (var28 >= var30[0] && var30[1] >= var28) {
                                var25 = var29[2];
                                if (var11 != var26) {
                                    int var31 = var4 + var8;
                                    if (var31 < 0) {
                                        var31 += class94.field1668;
                                    }
                                    if (~var31 < ~class94.field1668) {
                                        var31 -= class94.field1668;
                                    }
                                    for (int var32 = 1; var32 <= var27; ++var32) {
                                        int[] var40 = var20[(var11 + var32) % var10];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; var27 >= var33; ++var33) {
                                        int[] var34 = var20[(var11 + var33) % var10];
                                        int var35 = var34[2];
                                        if (~var25 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var28 >= ~var31) {
                                                if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class94.field1668;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method93(var5, var35, arg0 ^ 7265, var19, var38 - -var7, -var38 + var39, -var35 + var25);
                                        }
                                    }
                                }
                                var11 = var26;
                                break;
                            }
                            ++var26;
                            if (var10 <= var26) {
                                var26 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (~class102.field1804 > ~(var24 + var25)) {
                        var24 = -var25 + class102.field1804;
                    } else {
                        var9 = false;
                    }
                    if (~class94.field1668 != ~var23) {
                        int[] var41 = var21[var12++];
                        var41[2] = var24 + var25;
                        var41[1] = var23;
                        var41[0] = var8;
                        this.method93(var5, var25, arg0 + -7265, var19, var6 + var8, var22, var24);
                        var8 = var23;
                    } else {
                        this.method93(var5, var25, 790, var19, var6 + var8, var22, var24);
                        if (var9) {
                            break label126;
                        }
                        var7 = var6;
                        var9 = true;
                        int[][] var42 = var20;
                        var13 = false;
                        var11 = 0;
                        int[] var43 = var21[var12++];
                        var43[2] = var24 + var25;
                        var20 = var21;
                        var43[1] = var23;
                        var21 = var42;
                        var10 = var12;
                        var12 = 0;
                        var43[0] = var8;
                        var6 = class100.method664((byte) -86, var19, class94.field1668);
                        var8 = 0;
                        var4 = -var7 + var6;
                        int var44 = var4;
                        if (~var4 > -1) {
                            var44 = class94.field1668 + var4;
                        }
                        if (~var44 < ~class94.field1668) {
                            var44 -= class94.field1668;
                        }
                        while (true) {
                            int[] var45 = var20[var11];
                            if (~var44 <= ~var45[0] && ~var44 >= ~var45[1]) {
                                break;
                            }
                            ++var11;
                            if (var11 >= var10) {
                                var11 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg0 != 8055) {
            field370 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!nk", name = "b", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        if (arg0) {
            field370 = null;
        }
        ++field365;
    }
}
