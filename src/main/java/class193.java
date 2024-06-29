import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class193 extends class68 {

    @OriginalMember(owner = "client!ul", name = "N", descriptor = "I")
    private int field2654 = 1024;

    @OriginalMember(owner = "client!ul", name = "P", descriptor = "I")
    private int field2656 = 819;

    @OriginalMember(owner = "client!ul", name = "Z", descriptor = "I")
    private int field2666 = 1024;

    @OriginalMember(owner = "client!ul", name = "V", descriptor = "I")
    private int field2662 = 0;

    @OriginalMember(owner = "client!ul", name = "gb", descriptor = "I")
    private int field2673 = 1024;

    @OriginalMember(owner = "client!ul", name = "bb", descriptor = "I")
    private int field2668 = 1024;

    @OriginalMember(owner = "client!ul", name = "ab", descriptor = "I")
    private int field2667 = 0;

    @OriginalMember(owner = "client!ul", name = "S", descriptor = "I")
    private int field2659 = 2048;

    @OriginalMember(owner = "client!ul", name = "jb", descriptor = "I")
    private int field2676 = 409;

    @OriginalMember(owner = "client!ul", name = "R", descriptor = "I")
    public static int field2658 = 1;

    @OriginalMember(owner = "client!ul", name = "cb", descriptor = "I")
    public static int field2669 = 0;

    @OriginalMember(owner = "client!ul", name = "O", descriptor = "S")
    public static short field2655 = 320;

    @OriginalMember(owner = "client!ul", name = "eb", descriptor = "I")
    public static int field2671 = 20;

    @OriginalMember(owner = "client!ul", name = "Q", descriptor = "Llc;")
    public static class86 field2657 = new class86(64);

    @OriginalMember(owner = "client!ul", name = "T", descriptor = "I")
    public static int field2660;

    @OriginalMember(owner = "client!ul", name = "U", descriptor = "I")
    private int field2661;

    @OriginalMember(owner = "client!ul", name = "W", descriptor = "I")
    public static int field2663;

    @OriginalMember(owner = "client!ul", name = "X", descriptor = "I")
    public static int field2664;

    @OriginalMember(owner = "client!ul", name = "Y", descriptor = "I")
    public static int field2665;

    @OriginalMember(owner = "client!ul", name = "db", descriptor = "I")
    public static int field2670;

    @OriginalMember(owner = "client!ul", name = "fb", descriptor = "I")
    public static int field2672;

    @OriginalMember(owner = "client!ul", name = "hb", descriptor = "I")
    public static int field2674;

    @OriginalMember(owner = "client!ul", name = "ib", descriptor = "I")
    public static int field2675;

    @OriginalMember(owner = "client!ul", name = "kb", descriptor = "I")
    public static int field2677;

    @OriginalMember(owner = "client!ul", name = "lb", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!ul", name = "mb", descriptor = "[I")
    public static int[] field2679;

    @OriginalMember(owner = "client!ul", name = "f", descriptor = "(B)V")
    public static void method1230(byte arg0) {
        if (arg0 != 65) {
            method1230((byte) 86);
        }
        field2679 = null;
        field2657 = null;
    }

    @OriginalMember(owner = "client!ul", name = "g", descriptor = "(I)I")
    public static final int method1231(int arg0) {
        ++field2664;
        if ((double) class179.field2513 == 3.0D) {
            return 37;
        } else if ((double) class179.field2513 == 4.0D) {
            return 50;
        } else if ((double) class179.field2513 == 6.0D) {
            return 75;
        } else {
            if (arg0 != 100) {
                method1233(45, 30, 35, 90, -107, 7, -119, 85, (class268) null, -19, true, -66L);
            }
            return (double) class179.field2513 == 8.0D ? 100 : 200;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "([[IIIILjava/util/Random;II)V")
    private final void method1232(int[][] arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int arg6) {
        int var8 = this.field2673 <= 0 ? 4096 : 4096 + -class47.method310(this.field2673, (byte) -107, arg4);
        int var9 = this.field2666 * this.field2661 >> 12;
        if (arg6 == -6) {
            ++field2677;
            int var10 = this.field2661 + -(~var9 >= -1 ? 0 : class47.method310(var9, (byte) -38, arg4));
            if (~arg2 <= ~class89.field1248) {
                arg2 -= class89.field1248;
            }
            if (var10 <= 0) {
                if (~(arg2 + arg5) >= ~class89.field1248) {
                    for (int var11 = 0; arg3 > var11; ++var11) {
                        class115.method779(arg0[arg1 + var11], arg2, arg5, var8);
                    }
                } else {
                    int var12 = -arg2 + class89.field1248;
                    for (int var13 = 0; arg3 > var13; ++var13) {
                        int[] var14 = arg0[arg1 - -var13];
                        class115.method779(var14, arg2, var12, var8);
                        class115.method779(var14, 0, arg5 - var12, var8);
                    }
                }
            } else if (arg3 > 0 && ~arg5 < -1) {
                int var15 = arg5 / 2;
                int var16 = arg3 / 2;
                int var17 = ~var10 < ~var16 ? var16 : var10;
                int var18 = ~var10 < ~var15 ? var15 : var10;
                int var19 = arg2 - -var18;
                int var20 = -(var18 * 2) + arg5;
                for (int var21 = 0; arg3 > var21; ++var21) {
                    int[] var22 = arg0[arg1 + var21];
                    if (~var21 > ~var17) {
                        int var23 = var8 * var21 / var17;
                        if (this.field2667 == 0) {
                            for (int var24 = 0; ~var24 > ~var18; ++var24) {
                                int var25 = var8 * var24 / var18;
                                var22[class235.method1572(arg2 + var24, class173.field2411)] = var22[class235.method1572(class173.field2411, arg2 - -arg5 + -var24 + -1)] = var23 * var25 >> 12;
                            }
                        } else {
                            for (int var26 = 0; var26 < var18; ++var26) {
                                int var28 = var8 * var26 / var18;
                                var22[class235.method1572(class173.field2411, arg2 + var26)] = var22[class235.method1572(class173.field2411, arg2 - -arg5 + -var26 - 1)] = var23 > var28 ? var28 : var23;
                            }
                        }
                        if (~class89.field1248 <= ~(var19 + var20)) {
                            class115.method779(var22, var19, var20, var23);
                        } else {
                            int var27 = -var19 + class89.field1248;
                            class115.method779(var22, var19, var27, var23);
                            class115.method779(var22, 0, -var27 + var20, var23);
                        }
                    } else {
                        int var29 = -var21 + arg3 + -1;
                        if (~var17 < ~var29) {
                            int var30 = var8 * var29 / var17;
                            if (~this.field2667 == -1) {
                                for (int var31 = 0; var18 > var31; ++var31) {
                                    int var32 = var8 * var31 / var18;
                                    var22[class235.method1572(class173.field2411, arg2 - -var31)] = var22[class235.method1572(class173.field2411, arg2 - (var31 - -1 + -arg5))] = var30 * var32 >> 12;
                                }
                            } else {
                                for (int var33 = 0; ~var33 > ~var18; ++var33) {
                                    int var35 = var8 * var33 / var18;
                                    var22[class235.method1572(arg2 - -var33, class173.field2411)] = var22[class235.method1572(class173.field2411, -var33 + -1 + arg2 + arg5)] = ~var35 <= ~var30 ? var30 : var35;
                                }
                            }
                            if (~(var19 + var20) >= ~class89.field1248) {
                                class115.method779(var22, var19, var20, var30);
                            } else {
                                int var34 = -var19 + class89.field1248;
                                class115.method779(var22, var19, var34, var30);
                                class115.method779(var22, 0, -var34 + var20, var30);
                            }
                        } else {
                            for (int var36 = 0; var36 < var18; ++var36) {
                                var22[class235.method1572(arg2 - -var36, class173.field2411)] = var22[class235.method1572(arg2 + arg5 + -1 - var36, class173.field2411)] = var8 * var36 / var18;
                            }
                            if (~(var19 - -var20) >= ~class89.field1248) {
                                class115.method779(var22, var19, var20, var8);
                            } else {
                                int var37 = -var19 + class89.field1248;
                                class115.method779(var22, var19, var37, var8);
                                class115.method779(var22, 0, var20 - var37, var8);
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ul", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (arg0 < -18) {
            ++field2670;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(IIIIIIIILsa;IZJ)Z")
    public static final boolean method1233(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class268 arg8, int arg9, boolean arg10, long arg11) {
        boolean var13 = class95.field1341 == class200.field2788;
        int var14 = 0;
        for (int var15 = arg1; var15 < arg1 + arg3; ++var15) {
            for (int var24 = arg2; var24 < arg2 + arg4; ++var24) {
                if (var15 < 0 || var24 < 0 || var15 >= class127.field1802 || var24 >= class234.field3531) {
                    return false;
                }
                class89 var25 = class194.field2682[arg0][var15][var24];
                if (var25 != null && var25.field1240 >= 5) {
                    return false;
                }
            }
        }
        class198 var16 = new class198();
        var16.field2753 = arg11;
        var16.field2764 = arg0;
        var16.field2760 = arg5;
        var16.field2757 = arg6;
        var16.field2745 = arg7;
        var16.field2752 = arg8;
        var16.field2762 = arg9;
        var16.field2746 = arg1;
        var16.field2748 = arg2;
        var16.field2765 = arg1 + arg3 - 1;
        var16.field2763 = arg2 + arg4 - 1;
        for (int var17 = arg1; var17 < arg1 + arg3; ++var17) {
            for (int var20 = arg2; var20 < arg2 + arg4; ++var20) {
                int var21 = 0;
                if (var17 > arg1) {
                    ++var21;
                }
                if (var17 < arg1 + arg3 - 1) {
                    var21 += 4;
                }
                if (var20 > arg2) {
                    var21 += 8;
                }
                if (var20 < arg2 + arg4 - 1) {
                    var21 += 2;
                }
                for (int var22 = arg0; var22 >= 0; --var22) {
                    if (class194.field2682[var22][var17][var20] == null) {
                        class194.field2682[var22][var17][var20] = new class89(var22, var17, var20);
                    }
                }
                class89 var23 = class194.field2682[arg0][var17][var20];
                var23.field1226[var23.field1240] = var16;
                var23.field1230[var23.field1240] = var21;
                var23.field1245 |= var21;
                ++var23.field1240;
                if (var13 && class119.field1674[var17][var20] != 0) {
                    var14 = class119.field1674[var17][var20];
                }
            }
        }
        if (var13 && var14 != 0) {
            for (int var18 = arg1; var18 < arg1 + arg3; ++var18) {
                for (int var19 = arg2; var19 < arg2 + arg4; ++var19) {
                    if (class119.field1674[var18][var19] == 0) {
                        class119.field1674[var18][var19] = var14;
                    }
                }
            }
        }
        if (arg10) {
            class230.field3484[class140.field1953++] = var16;
        }
        return true;
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        ++field2672;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (~arg1 == -9) {
                                            this.field2673 = arg0.method1445(false);
                                        }
                                    } else {
                                        this.field2666 = arg0.method1445(false);
                                    }
                                } else {
                                    this.field2667 = arg0.method1453((byte) -127);
                                }
                            } else {
                                this.field2654 = arg0.method1445(false);
                            }
                        } else {
                            this.field2656 = arg0.method1445(false);
                        }
                    } else {
                        this.field2676 = arg0.method1445(false);
                    }
                } else {
                    this.field2659 = arg0.method1445(false);
                }
            } else {
                this.field2668 = arg0.method1445(false);
            }
        } else {
            this.field2662 = arg0.method1453((byte) -127);
        }
        if (!arg2) {
            field2655 = 75;
        }
    }

    @OriginalMember(owner = "client!ul", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field2663;
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int[][] var4 = super.field917.method1916(4783);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class89.field1248 * this.field2668 >> 12;
            int var15 = class62.field861 * this.field2676 >> 12;
            int var16 = class89.field1248 * this.field2659 >> 12;
            int var17 = class62.field861 * this.field2656 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            int var18 = class89.field1248 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            this.field2661 = class89.field1248 / 8 * this.field2654 >> 12;
            Random var21 = new Random((long) this.field2662);
            label125: while (true) {
                while (true) {
                    int var22 = class47.method310(-var14 + var16, (byte) -93, var21) + var14;
                    int var23 = class47.method310(-var15 + var17, (byte) -62, var21) + var15;
                    int var24 = var8 + var22;
                    if (var24 > class89.field1248) {
                        var24 = class89.field1248;
                        var22 = -var8 + class89.field1248;
                    }
                    int var28;
                    if (var11) {
                        var28 = 0;
                    } else {
                        int var25 = var9;
                        int var26 = 0;
                        int[] var27 = var19[var9];
                        var28 = var27[2];
                        int var29 = var6 + var24;
                        if (~var29 > -1) {
                            var29 += class89.field1248;
                        }
                        if (class89.field1248 < var29) {
                            var29 -= class89.field1248;
                        }
                        while (true) {
                            int[] var30 = var19[var25];
                            if (var30[0] <= var29 && ~var29 >= ~var30[1]) {
                                if (~var9 != ~var25) {
                                    int var31 = var6 + var8;
                                    if (~var31 > -1) {
                                        var31 += class89.field1248;
                                    }
                                    if (class89.field1248 < var31) {
                                        var31 -= class89.field1248;
                                    }
                                    for (int var32 = 1; var26 >= var32; ++var32) {
                                        int[] var40 = var19[(var9 + var32) % var13];
                                        var28 = Math.max(var28, var40[2]);
                                    }
                                    for (int var33 = 0; ~var26 <= ~var33; ++var33) {
                                        int[] var34 = var19[(var9 - -var33) % var13];
                                        int var35 = var34[2];
                                        if (~var28 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var29 > var31) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (var36 != 0) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class89.field1248;
                                            } else {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method1232(var4, var35, var5 + var38, -var35 + var28, var21, var39 - var38, -6);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var26;
                            ++var25;
                            if (var25 >= var13) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~(var23 + var28) >= ~class62.field861) {
                        var10 = false;
                    } else {
                        var23 = -var28 + class62.field861;
                    }
                    if (~class89.field1248 == ~var24) {
                        this.method1232(var4, var28, var7 + var8, var23, var21, var22, -6);
                        if (var10) {
                            break label125;
                        }
                        var11 = false;
                        var10 = true;
                        var5 = var7;
                        var9 = 0;
                        int[][] var41 = var19;
                        var19 = var20;
                        int[] var42 = var20[var12++];
                        var42[1] = var24;
                        var42[2] = var23 + var28;
                        var13 = var12;
                        var12 = 0;
                        var20 = var41;
                        var42[0] = var8;
                        var7 = class47.method310(class89.field1248, (byte) -106, var21);
                        var8 = 0;
                        var6 = var7 - var5;
                        int var43 = var6;
                        if (var6 < 0) {
                            var43 = class89.field1248 + var6;
                        }
                        if (var43 > class89.field1248) {
                            var43 -= class89.field1248;
                        }
                        while (true) {
                            int[] var44 = var19[var9];
                            if (~var44[0] >= ~var43 && ~var43 >= ~var44[1]) {
                                break;
                            }
                            ++var9;
                            if (~var9 <= ~var13) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var20[var12++];
                        var45[2] = var23 + var28;
                        var45[0] = var8;
                        var45[1] = var24;
                        this.method1232(var4, var28, var7 + var8, var23, var21, var22, -6);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 >= -118) {
            this.method192(91);
        }
        return var3;
    }

    @OriginalMember(owner = "client!ul", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }
}
