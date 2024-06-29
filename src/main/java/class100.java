import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class100 extends class144 {

    @OriginalMember(owner = "client!id", name = "N", descriptor = "I")
    private int field1355 = 819;

    @OriginalMember(owner = "client!id", name = "O", descriptor = "I")
    private int field1356 = 0;

    @OriginalMember(owner = "client!id", name = "R", descriptor = "I")
    private int field1359 = 409;

    @OriginalMember(owner = "client!id", name = "I", descriptor = "I")
    private int field1351 = 1024;

    @OriginalMember(owner = "client!id", name = "M", descriptor = "I")
    private int field1354 = 1024;

    @OriginalMember(owner = "client!id", name = "L", descriptor = "I")
    private int field1353 = 2048;

    @OriginalMember(owner = "client!id", name = "Q", descriptor = "I")
    private int field1358 = 1024;

    @OriginalMember(owner = "client!id", name = "bb", descriptor = "I")
    private int field1368 = 0;

    @OriginalMember(owner = "client!id", name = "eb", descriptor = "I")
    private int field1371 = 1024;

    @OriginalMember(owner = "client!id", name = "T", descriptor = "I")
    private int field1360;

    @OriginalMember(owner = "client!id", name = "U", descriptor = "I")
    public static int field1361;

    @OriginalMember(owner = "client!id", name = "V", descriptor = "I")
    public static int field1362;

    @OriginalMember(owner = "client!id", name = "W", descriptor = "I")
    public static int field1363;

    @OriginalMember(owner = "client!id", name = "X", descriptor = "I")
    public static int field1364;

    @OriginalMember(owner = "client!id", name = "Y", descriptor = "I")
    public static int field1365;

    @OriginalMember(owner = "client!id", name = "Z", descriptor = "I")
    public static int field1366;

    @OriginalMember(owner = "client!id", name = "ab", descriptor = "I")
    public static int field1367;

    @OriginalMember(owner = "client!id", name = "cb", descriptor = "I")
    public static int field1369;

    @OriginalMember(owner = "client!id", name = "db", descriptor = "I")
    public static int field1370;

    @OriginalMember(owner = "client!id", name = "fb", descriptor = "I")
    public static int field1372;

    @OriginalMember(owner = "client!id", name = "K", descriptor = "Lbc;")
    public static class282 field1352;

    @OriginalMember(owner = "client!id", name = "P", descriptor = "Lbc;")
    public static class282 field1357;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIII)V")
    public static final void method608(int arg0, int arg1, int arg2, int arg3) {
        ++field1367;
        class66 var4 = class6.method34(11, true, arg2);
        var4.method408(0);
        var4.field784 = arg3;
        if (arg1 != 256) {
            field1369 = -85;
        }
        var4.field786 = arg0;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(II)[I")
    public final int[] method12(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method613((int[][]) null, 29, (Random) null, -125, (byte) 85, 60, -106);
        }
        ++field1365;
        int[] var3 = super.field2069.method425(true, arg0);
        if (super.field2069.field820) {
            int[][] var4 = super.field2069.method424(13793);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class104.field1411 * this.field1351 >> 12;
            int var15 = class257.field3727 * this.field1359 >> 12;
            int var16 = class257.field3727 * this.field1355 >> 12;
            int var17 = class104.field1411 * this.field1353 >> 12;
            if (var16 <= 1) {
                return var4[arg0];
            } else {
                int var18 = class104.field1411 / var14 + 1;
                this.field1360 = class104.field1411 / 8 * this.field1354 >> 12;
                Random var19 = new Random((long) this.field1356);
                int[][] var20 = new int[var18][3];
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var14 + class198.method1277((byte) 37, var17 - var14, var19);
                        int var23 = var15 + class198.method1277((byte) 37, var16 - var15, var19);
                        int var24 = var6 + var22;
                        if (class104.field1411 < var24) {
                            var24 = class104.field1411;
                            var22 = -var6 + class104.field1411;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var24 - -var5;
                            int var26 = var7;
                            if (~var25 > -1) {
                                var25 += class104.field1411;
                            }
                            int var27 = 0;
                            int[] var28 = var21[var7];
                            if (~class104.field1411 > ~var25) {
                                var25 -= class104.field1411;
                            }
                            while (true) {
                                int[] var29 = var21[var26];
                                if (~var29[0] >= ~var25 && var29[1] >= var25) {
                                    var30 = var28[2];
                                    if (var7 != var26) {
                                        int var31 = var6 - -var5;
                                        if (~var31 > -1) {
                                            var31 += class104.field1411;
                                        }
                                        if (~var31 < ~class104.field1411) {
                                            var31 -= class104.field1411;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var21[(var7 + var32) % var13];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                            int[] var34 = var21[(var7 + var33) % var13];
                                            int var35 = var34[2];
                                            if (var30 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var25) {
                                                    if (~var36 == -1) {
                                                        var38 = 0;
                                                        var39 = Math.min(var25, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class104.field1411;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var25, var37);
                                                }
                                                this.method613(var4, var8 + var38, var19, -var35 + var30, (byte) 44, var35, -var38 + var39);
                                            }
                                        }
                                    }
                                    var7 = var26;
                                    break;
                                }
                                int var10000 = ~var13;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (class257.field3727 >= var30 - -var23) {
                            var10 = false;
                        } else {
                            var23 = class257.field3727 - var30;
                        }
                        if (~class104.field1411 != ~var24) {
                            int[] var41 = var20[var12++];
                            var41[0] = var6;
                            var41[1] = var24;
                            var41[2] = var23 + var30;
                            this.method613(var4, var6 - -var9, var19, var23, (byte) 64, var30, var22);
                            var6 = var24;
                        } else {
                            this.method613(var4, var6 - -var9, var19, var23, (byte) 74, var30, var22);
                            if (var10) {
                                return var3;
                            }
                            var7 = 0;
                            var10 = true;
                            var8 = var9;
                            var11 = false;
                            int[][] var42 = var21;
                            var21 = var20;
                            int[] var43 = var20[var12++];
                            var20 = var42;
                            var43[2] = var30 - -var23;
                            var43[0] = var6;
                            var6 = 0;
                            var43[1] = var24;
                            var9 = class198.method1277((byte) 37, class104.field1411, var19);
                            var13 = var12;
                            var12 = 0;
                            var5 = -var8 + var9;
                            int var44 = var5;
                            if (var5 < 0) {
                                var44 = class104.field1411 + var5;
                            }
                            if (class104.field1411 < var44) {
                                var44 -= class104.field1411;
                            }
                            while (true) {
                                int[] var45 = var21[var7];
                                if (var45[0] <= var44 && var44 <= var45[1]) {
                                    break;
                                }
                                ++var7;
                                if (var13 <= var7) {
                                    var7 = 0;
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

    @OriginalMember(owner = "client!id", name = "g", descriptor = "(I)V")
    public static void method609(int arg0) {
        field1352 = null;
        if (arg0 == 0) {
            field1357 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "h", descriptor = "(I)I")
    public static final int method610(int arg0) {
        if (arg0 <= 35) {
            method610(35);
        }
        ++field1363;
        return class32.field380 && class260.field3784[81] && class112.field1496 > 2 ? class209.field2944[class112.field1496 + -2] : class209.field2944[class112.field1496 - 1];
    }

    @OriginalMember(owner = "client!id", name = "i", descriptor = "(I)V")
    public static final void method611(int arg0) {
        if (arg0 == 31982) {
            ++field1364;
            if (~class240.field3484 == -6) {
                class240.field3484 = 6;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(Lwe;B)V")
    public static final void method612(class82 arg0, byte arg1) {
        ++field1361;
        int var2 = 113 % ((arg1 - 25) / 43);
        int var3 = arg0.field1136;
        if (var3 == 324) {
            if (~class131.field1887 == 0) {
                class131.field1887 = arg0.field1078;
                class228.field3208 = arg0.field1045;
            }
            if (class181.field2567.field1964) {
                arg0.field1078 = class131.field1887;
            } else {
                arg0.field1078 = class228.field3208;
            }
        } else if (var3 == 325) {
            if (~class131.field1887 == 0) {
                class228.field3208 = arg0.field1045;
                class131.field1887 = arg0.field1078;
            }
            if (class181.field2567.field1964) {
                arg0.field1078 = class228.field3208;
            } else {
                arg0.field1078 = class131.field1887;
            }
        } else if (~var3 == -328) {
            arg0.field964 = 150;
            arg0.field1141 = 2047 & (int) (256.0D * Math.sin((double) class198.field2819 / 40.0D));
            arg0.field1098 = 5;
            arg0.field974 = -1;
        } else if (~var3 == -329) {
            if (class177.field2507.field3466 == null) {
                arg0.field974 = 0;
            } else {
                arg0.field964 = 150;
                arg0.field1141 = 2047 & (int) (Math.sin((double) class198.field2819 / 40.0D) * 256.0D);
                arg0.field1098 = 5;
                arg0.field974 = ((int) class60.method370((byte) -8, class177.field2507.field3466) << 11) + 2047;
                arg0.field1043 = 0;
                arg0.field1092 = class177.field2507.field4520;
                arg0.field969 = class177.field2507.field4579;
                arg0.field1088 = class177.field2507.field4568;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "([[IILjava/util/Random;IBII)V")
    private final void method613(int[][] arg0, int arg1, Random arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field1366;
        int var8 = this.field1371 > 0 ? 4096 - class198.method1277((byte) 37, this.field1371, arg2) : 4096;
        if (arg4 > 43) {
            int var9 = this.field1360 * this.field1358 >> 12;
            int var10 = this.field1360 + -(~var9 < -1 ? class198.method1277((byte) 37, var9, arg2) : 0);
            if (arg1 >= class104.field1411) {
                arg1 -= class104.field1411;
            }
            if (~var10 < -1) {
                if (arg3 > 0 && ~arg6 < -1) {
                    int var11 = arg6 / 2;
                    int var12 = var10 <= var11 ? var10 : var11;
                    int var13 = arg3 / 2;
                    int var14 = ~var10 < ~var13 ? var13 : var10;
                    int var15 = arg1 + var12;
                    int var16 = -(var12 * 2) + arg6;
                    for (int var17 = 0; ~arg3 < ~var17; ++var17) {
                        int[] var18 = arg0[arg5 + var17];
                        if (~var14 < ~var17) {
                            int var19 = var8 * var17 / var14;
                            if (this.field1368 == 0) {
                                for (int var20 = 0; ~var20 > ~var12; ++var20) {
                                    int var21 = var8 * var20 / var12;
                                    var18[class5.method26(class112.field1487, arg1 - -var20)] = var18[class5.method26(arg1 + arg6 - (var20 - -1), class112.field1487)] = var19 * var21 >> 12;
                                }
                            } else {
                                for (int var22 = 0; var12 > var22; ++var22) {
                                    int var24 = var8 * var22 / var12;
                                    var18[class5.method26(class112.field1487, arg1 + var22)] = var18[class5.method26(class112.field1487, -var22 + arg1 + arg6 - 1)] = var24 >= var19 ? var19 : var24;
                                }
                            }
                            if (class104.field1411 >= var15 + var16) {
                                class194.method1261(var18, var15, var16, var19);
                            } else {
                                int var23 = -var15 + class104.field1411;
                                class194.method1261(var18, var15, var23, var19);
                                class194.method1261(var18, 0, -var23 + var16, var19);
                            }
                        } else {
                            int var25 = arg3 - var17 - 1;
                            if (var25 < var14) {
                                int var26 = var8 * var25 / var14;
                                if (~this.field1368 != -1) {
                                    for (int var27 = 0; ~var12 < ~var27; ++var27) {
                                        int var28 = var8 * var27 / var12;
                                        var18[class5.method26(arg1 + var27, class112.field1487)] = var18[class5.method26(arg1 + arg6 + -var27 + -1, class112.field1487)] = ~var26 < ~var28 ? var28 : var26;
                                    }
                                } else {
                                    for (int var29 = 0; ~var29 > ~var12; ++var29) {
                                        int var31 = var8 * var29 / var12;
                                        var18[class5.method26(arg1 + var29, class112.field1487)] = var18[class5.method26(class112.field1487, arg1 + arg6 - (var29 + 1))] = var26 * var31 >> 12;
                                    }
                                }
                                if (~(var15 + var16) >= ~class104.field1411) {
                                    class194.method1261(var18, var15, var16, var26);
                                } else {
                                    int var30 = class104.field1411 - var15;
                                    class194.method1261(var18, var15, var30, var26);
                                    class194.method1261(var18, 0, var16 - var30, var26);
                                }
                            } else {
                                for (int var32 = 0; var32 < var12; ++var32) {
                                    var18[class5.method26(arg1 + var32, class112.field1487)] = var18[class5.method26(-var32 + arg1 + arg6 + -1, class112.field1487)] = var8 * var32 / var12;
                                }
                                if (class104.field1411 >= var15 - -var16) {
                                    class194.method1261(var18, var15, var16, var8);
                                } else {
                                    int var33 = class104.field1411 - var15;
                                    class194.method1261(var18, var15, var33, var8);
                                    class194.method1261(var18, 0, -var33 + var16, var8);
                                }
                            }
                        }
                    }
                }
            } else if (~class104.field1411 <= ~(arg1 + arg6)) {
                for (int var34 = 0; var34 < arg3; ++var34) {
                    class194.method1261(arg0[arg5 + var34], arg1, arg6, var8);
                }
            } else {
                int var35 = -arg1 + class104.field1411;
                for (int var36 = 0; ~arg3 < ~var36; ++var36) {
                    int[] var37 = arg0[arg5 + var36];
                    class194.method1261(var37, arg1, var35, var8);
                    class194.method1261(var37, 0, -var35 + arg6, var8);
                }
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "j", descriptor = "(I)V")
    public static final void method614(int arg0) {
        ++field1370;
        if (arg0 < -91) {
            ;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        if (arg2 != 20630) {
            this.field1354 = -126;
        }
        ++field1372;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 != -7) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field1371 = arg1.method1380(true);
                                        }
                                    } else {
                                        this.field1358 = arg1.method1380(true);
                                    }
                                } else {
                                    this.field1368 = arg1.method1407(107);
                                }
                            } else {
                                this.field1354 = arg1.method1380(true);
                            }
                        } else {
                            this.field1355 = arg1.method1380(true);
                        }
                    } else {
                        this.field1359 = arg1.method1380(true);
                    }
                } else {
                    this.field1353 = arg1.method1380(true);
                }
            } else {
                this.field1351 = arg1.method1380(true);
            }
        } else {
            this.field1356 = arg1.method1407(120);
        }
    }

    @OriginalMember(owner = "client!id", name = "e", descriptor = "(B)V")
    public final void method31(byte arg0) {
        ++field1362;
        if (arg0 > -109) {
            this.field1368 = -57;
        }
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "()V")
    public class100() {
        super(0, true);
    }
}
