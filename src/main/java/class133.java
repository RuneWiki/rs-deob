import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ac")
public class class133 extends class175 {

    @OriginalMember(owner = "client!ac", name = "N", descriptor = "I")
    private int field2316 = 1024;

    @OriginalMember(owner = "client!ac", name = "M", descriptor = "I")
    private int field2315 = 1024;

    @OriginalMember(owner = "client!ac", name = "R", descriptor = "I")
    private int field2320 = 1024;

    @OriginalMember(owner = "client!ac", name = "T", descriptor = "I")
    private int field2322 = 2048;

    @OriginalMember(owner = "client!ac", name = "U", descriptor = "I")
    private int field2323 = 409;

    @OriginalMember(owner = "client!ac", name = "Z", descriptor = "I")
    private int field2328 = 819;

    @OriginalMember(owner = "client!ac", name = "X", descriptor = "I")
    private int field2326 = 1024;

    @OriginalMember(owner = "client!ac", name = "db", descriptor = "I")
    private int field2332 = 0;

    @OriginalMember(owner = "client!ac", name = "fb", descriptor = "I")
    private int field2334 = 0;

    @OriginalMember(owner = "client!ac", name = "Q", descriptor = "I")
    public static int field2319 = 0;

    @OriginalMember(owner = "client!ac", name = "P", descriptor = "Lij;")
    public static class50 field2318 = class78.method578(122, "<col=ffb000>");

    @OriginalMember(owner = "client!ac", name = "Y", descriptor = "Lij;")
    public static class50 field2327 = class78.method578(126, "Spieler kann nicht gefunden werden: ");

    @OriginalMember(owner = "client!ac", name = "K", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!ac", name = "L", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!ac", name = "O", descriptor = "I")
    public static int field2317;

    @OriginalMember(owner = "client!ac", name = "S", descriptor = "I")
    public static int field2321;

    @OriginalMember(owner = "client!ac", name = "V", descriptor = "I")
    public static int field2324;

    @OriginalMember(owner = "client!ac", name = "W", descriptor = "I")
    private int field2325;

    @OriginalMember(owner = "client!ac", name = "ab", descriptor = "I")
    public static int field2329;

    @OriginalMember(owner = "client!ac", name = "eb", descriptor = "I")
    public static int field2333;

    @OriginalMember(owner = "client!ac", name = "gb", descriptor = "I")
    public static int field2335;

    @OriginalMember(owner = "client!ac", name = "cb", descriptor = "Lda;")
    public static class22 field2331;

    @OriginalMember(owner = "client!ac", name = "bb", descriptor = "Lf;")
    public static class82 field2330;

    @OriginalMember(owner = "client!ac", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (arg0 != 0) {
            this.field2323 = -106;
        }
        ++field2313;
    }

    @OriginalMember(owner = "client!ac", name = "c", descriptor = "(II)I")
    public static final int method933(int arg0, int arg1) {
        ++field2324;
        if (arg0 <= 47) {
            field2319 = -62;
        }
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(ZILwd;)V")
    public final void method39(boolean arg0, int arg1, class217 arg2) {
        if (!arg0) {
            this.method934(56, 29, (Random) null, (int[][]) null, -22, 29, -123);
        }
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (~arg1 == -9) {
                                            this.field2326 = arg2.method1441(-109);
                                        }
                                    } else {
                                        this.field2320 = arg2.method1441(-83);
                                    }
                                } else {
                                    this.field2334 = arg2.method1487(255);
                                }
                            } else {
                                this.field2315 = arg2.method1441(-127);
                            }
                        } else {
                            this.field2328 = arg2.method1441(101);
                        }
                    } else {
                        this.field2323 = arg2.method1441(-107);
                    }
                } else {
                    this.field2322 = arg2.method1441(124);
                }
            } else {
                this.field2316 = arg2.method1441(103);
            }
        } else {
            this.field2332 = arg2.method1487(255);
        }
        ++field2329;
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "(IILjava/util/Random;[[IIII)V")
    private final void method934(int arg0, int arg1, Random arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field2317;
        int var8 = ~this.field2326 >= -1 ? 4096 : 4096 - class63.method494(arg2, -32752, this.field2326);
        int var9 = this.field2325 * this.field2320 >> 12;
        int var10 = this.field2325 + -(var9 <= 0 ? 0 : class63.method494(arg2, -32752, var9));
        if (~arg6 <= ~class211.field3514) {
            arg6 -= class211.field3514;
        }
        if (arg4 <= 8) {
            this.field2320 = 122;
        }
        if (~var10 < -1) {
            if (arg1 > 0 && arg0 > 0) {
                int var11 = arg0 / 2;
                int var12 = arg1 / 2;
                int var13 = var10 > var12 ? var12 : var10;
                int var14 = ~var11 <= ~var10 ? var10 : var11;
                int var15 = arg6 + var14;
                int var16 = -(var14 * 2) + arg0;
                for (int var17 = 0; ~var17 > ~arg1; ++var17) {
                    int[] var18 = arg3[arg5 + var17];
                    if (var17 < var13) {
                        int var19 = var8 * var17 / var13;
                        if (~this.field2334 != -1) {
                            for (int var20 = 0; var20 < var14; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class51.method413(arg6 + var20, class161.field2765)] = var18[class51.method413(-var20 + arg0 + arg6 + -1, class161.field2765)] = var19 > var21 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; var22 < var14; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class51.method413(class161.field2765, arg6 - -var22)] = var18[class51.method413(-var22 + arg0 + arg6 - 1, class161.field2765)] = var19 * var24 >> 12;
                            }
                        }
                        if (class211.field3514 >= var15 + var16) {
                            class105.method794(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class211.field3514;
                            class105.method794(var18, var15, var23, var19);
                            class105.method794(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg1 - var17 + -1;
                        if (var25 < var13) {
                            int var26 = var8 * var25 / var13;
                            if (this.field2334 != 0) {
                                for (int var27 = 0; ~var27 > ~var14; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class51.method413(class161.field2765, arg6 + var27)] = var18[class51.method413(class161.field2765, -var27 - 1 + arg6 + arg0)] = var28 >= var26 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; var29 < var14; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class51.method413(arg6 + var29, class161.field2765)] = var18[class51.method413(class161.field2765, arg6 - -arg0 - var29 + -1)] = var26 * var31 >> 12;
                                }
                            }
                            if (class211.field3514 >= var15 + var16) {
                                class105.method794(var18, var15, var16, var26);
                            } else {
                                int var30 = -var15 + class211.field3514;
                                class105.method794(var18, var15, var30, var26);
                                class105.method794(var18, 0, var16 - var30, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var14; ++var32) {
                                var18[class51.method413(arg6 + var32, class161.field2765)] = var18[class51.method413(class161.field2765, -var32 + arg0 + arg6 + -1)] = var8 * var32 / var14;
                            }
                            if (class211.field3514 < var15 + var16) {
                                int var33 = -var15 + class211.field3514;
                                class105.method794(var18, var15, var33, var8);
                                class105.method794(var18, 0, -var33 + var16, var8);
                            } else {
                                class105.method794(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class211.field3514 <= ~(arg0 + arg6)) {
            for (int var34 = 0; var34 < arg1; ++var34) {
                class105.method794(arg3[arg5 + var34], arg6, arg0, var8);
            }
        } else {
            int var35 = -arg6 + class211.field3514;
            for (int var36 = 0; var36 < arg1; ++var36) {
                int[] var37 = arg3[arg5 + var36];
                class105.method794(var37, arg6, var35, var8);
                class105.method794(var37, 0, -var35 + arg0, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "<init>", descriptor = "()V")
    public class133() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ac", name = "a", descriptor = "([[II)V")
    public static final void method935(int[][] arg0, int arg1) {
        class177.field2963 = arg0;
        ++field2314;
        if (arg1 != 18972) {
            method937(-51);
        }
    }

    @OriginalMember(owner = "client!ac", name = "b", descriptor = "(II)[I")
    public final int[] method29(int arg0, int arg1) {
        ++field2321;
        if (arg1 != -27746) {
            method933(-66, 101);
        }
        int[] var3 = super.field2941.method1427(-21281, arg0);
        if (super.field2941.field3565) {
            int[][] var4 = super.field2941.method1428(128);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            boolean var10 = true;
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = class211.field3514 * this.field2316 >> 12;
            int var15 = class211.field3514 * this.field2322 >> 12;
            int var16 = class220.field3690 * this.field2323 >> 12;
            int var17 = class220.field3690 * this.field2328 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            } else {
                this.field2325 = class211.field3514 / 8 * this.field2315 >> 12;
                int var18 = 1 - -(class211.field3514 / var14);
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field2332);
                while (true) {
                    while (true) {
                        int var22 = var14 - -class63.method494(var21, -32752, -var14 + var15);
                        int var23 = var16 + class63.method494(var21, -32752, -var16 + var17);
                        int var24 = var7 + var22;
                        if (~var24 < ~class211.field3514) {
                            var22 = -var7 + class211.field3514;
                            var24 = class211.field3514;
                        }
                        int var25;
                        if (var10) {
                            var25 = 0;
                        } else {
                            int var26 = var8;
                            int[] var27 = var20[var8];
                            var25 = var27[2];
                            int var28 = 0;
                            int var29 = var24 - -var5;
                            if (var29 < 0) {
                                var29 += class211.field3514;
                            }
                            if (~var29 < ~class211.field3514) {
                                var29 -= class211.field3514;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                    if (var8 != var26) {
                                        int var31 = var5 + var7;
                                        if (var31 < 0) {
                                            var31 += class211.field3514;
                                        }
                                        if (var31 > class211.field3514) {
                                            var31 -= class211.field3514;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var8 + var32) % var13];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var8 + var33) % var13];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (var36 == 0) {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class211.field3514;
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method934(-var38 + var39, var25 - var35, var21, var4, 40, var35, var38 - -var11);
                                            }
                                        }
                                    }
                                    var8 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var13 <= var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (~class220.field3690 > ~(var25 - -var23)) {
                            var23 = -var25 + class220.field3690;
                        } else {
                            var9 = false;
                        }
                        if (~class211.field3514 != ~var24) {
                            int[] var41 = var19[var12++];
                            var41[0] = var7;
                            var41[2] = var23 + var25;
                            var41[1] = var24;
                            this.method934(var22, var23, var21, var4, 81, var25, var6 + var7);
                            var7 = var24;
                        } else {
                            this.method934(var22, var23, var21, var4, 85, var25, var7 - -var6);
                            if (var9) {
                                return var3;
                            }
                            var8 = 0;
                            var9 = true;
                            var11 = var6;
                            int[] var42 = var19[var12++];
                            var42[0] = var7;
                            var10 = false;
                            int[][] var43 = var20;
                            var42[1] = var24;
                            var13 = var12;
                            var20 = var19;
                            var19 = var43;
                            var42[2] = var23 + var25;
                            var12 = 0;
                            var7 = 0;
                            var6 = class63.method494(var21, -32752, class211.field3514);
                            var5 = -var11 + var6;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class211.field3514 + var5;
                            }
                            if (~var44 < ~class211.field3514) {
                                var44 -= class211.field3514;
                            }
                            while (true) {
                                int[] var45 = var20[var8];
                                if (var45[0] <= var44 && var44 <= var45[1]) {
                                    break;
                                }
                                ++var8;
                                if (var13 <= var8) {
                                    var8 = 0;
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

    @OriginalMember(owner = "client!ac", name = "d", descriptor = "(B)V")
    public static final void method936(byte arg0) {
        ++field2335;
        int var1 = 123 % ((arg0 - 6) / 49);
        for (class203 var2 = (class203) class227.field3824.method689(1001); var2 != null; var2 = (class203) class227.field3824.method688(-97)) {
            if (~var2.field3385 != 0) {
                var2.method267(1);
            } else {
                var2.field3371 = 0;
                class154.method1084(var2, 2);
            }
        }
    }

    @OriginalMember(owner = "client!ac", name = "g", descriptor = "(I)V")
    public static void method937(int arg0) {
        field2318 = null;
        field2331 = null;
        if (arg0 <= 24) {
            method937(-39);
        }
        field2330 = null;
        field2327 = null;
    }
}
