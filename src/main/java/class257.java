import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mj")
public class class257 extends class154 {

    @OriginalMember(owner = "client!mj", name = "ab", descriptor = "I")
    private int field4558 = 1024;

    @OriginalMember(owner = "client!mj", name = "X", descriptor = "I")
    private int field4555 = 2048;

    @OriginalMember(owner = "client!mj", name = "lb", descriptor = "I")
    private int field4569 = 1024;

    @OriginalMember(owner = "client!mj", name = "db", descriptor = "I")
    private int field4561 = 0;

    @OriginalMember(owner = "client!mj", name = "ib", descriptor = "I")
    private int field4566 = 409;

    @OriginalMember(owner = "client!mj", name = "hb", descriptor = "I")
    private int field4565 = 819;

    @OriginalMember(owner = "client!mj", name = "nb", descriptor = "I")
    private int field4571 = 1024;

    @OriginalMember(owner = "client!mj", name = "ob", descriptor = "I")
    private int field4572 = 0;

    @OriginalMember(owner = "client!mj", name = "pb", descriptor = "I")
    private int field4573 = 1024;

    @OriginalMember(owner = "client!mj", name = "Z", descriptor = "Leg;")
    public static class37 field4557 = class174.method1167(" weitere Optionen", -79);

    @OriginalMember(owner = "client!mj", name = "qb", descriptor = "Leg;")
    public static class37 field4574 = class174.method1167("<img=1>", -53);

    @OriginalMember(owner = "client!mj", name = "Y", descriptor = "I")
    public static int field4556;

    @OriginalMember(owner = "client!mj", name = "bb", descriptor = "I")
    public static int field4559;

    @OriginalMember(owner = "client!mj", name = "cb", descriptor = "I")
    public static int field4560;

    @OriginalMember(owner = "client!mj", name = "eb", descriptor = "I")
    public static int field4562;

    @OriginalMember(owner = "client!mj", name = "fb", descriptor = "I")
    private int field4563;

    @OriginalMember(owner = "client!mj", name = "gb", descriptor = "I")
    public static int field4564;

    @OriginalMember(owner = "client!mj", name = "jb", descriptor = "I")
    public static int field4567;

    @OriginalMember(owner = "client!mj", name = "kb", descriptor = "I")
    public static int field4568;

    @OriginalMember(owner = "client!mj", name = "mb", descriptor = "I")
    public static int field4570;

    @OriginalMember(owner = "client!mj", name = "rb", descriptor = "I")
    public static int field4575;

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(B[[ILjava/util/Random;IIII)V")
    private final void method1747(byte arg0, int[][] arg1, Random arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field4556;
        int var8 = ~this.field4573 < -1 ? 4096 - class46.method304(arg2, this.field4573, -7486) : 4096;
        int var9 = this.field4563 * this.field4558 >> 12;
        int var10 = -105 % ((arg0 - 34) / 56);
        int var11 = this.field4563 + -(~var9 >= -1 ? 0 : class46.method304(arg2, var9, -7486));
        if (~class227.field3898 >= ~arg6) {
            arg6 -= class227.field3898;
        }
        if (var11 > 0) {
            if (~arg3 < -1 && arg4 > 0) {
                int var12 = arg4 / 2;
                int var13 = var12 < var11 ? var12 : var11;
                int var14 = arg3 / 2;
                int var15 = ~var14 > ~var11 ? var14 : var11;
                int var16 = arg6 + var13;
                int var17 = arg4 - var13 * 2;
                for (int var18 = 0; var18 < arg3; ++var18) {
                    int[] var19 = arg1[var18 - -arg5];
                    if (var15 > var18) {
                        int var20 = var8 * var18 / var15;
                        if (~this.field4561 != -1) {
                            for (int var21 = 0; ~var13 < ~var21; ++var21) {
                                int var22 = var8 * var21 / var13;
                                var19[class96.method626(class109.field1786, arg6 - -var21)] = var19[class96.method626(-var21 + arg6 + arg4 + -1, class109.field1786)] = ~var22 <= ~var20 ? var20 : var22;
                            }
                        } else {
                            for (int var23 = 0; var13 > var23; ++var23) {
                                int var25 = var8 * var23 / var13;
                                var19[class96.method626(arg6 - -var23, class109.field1786)] = var19[class96.method626(arg4 + arg6 + -var23 + -1, class109.field1786)] = var20 * var25 >> 12;
                            }
                        }
                        if (~(var16 + var17) >= ~class227.field3898) {
                            class54.method350(var19, var16, var17, var20);
                        } else {
                            int var24 = -var16 + class227.field3898;
                            class54.method350(var19, var16, var24, var20);
                            class54.method350(var19, 0, var17 - var24, var20);
                        }
                    } else {
                        int var26 = -var18 + -1 + arg3;
                        if (var26 < var15) {
                            int var27 = var8 * var26 / var15;
                            if (this.field4561 != 0) {
                                for (int var28 = 0; var28 < var13; ++var28) {
                                    int var29 = var8 * var28 / var13;
                                    var19[class96.method626(class109.field1786, arg6 + var28)] = var19[class96.method626(class109.field1786, arg4 + arg6 - var28 + -1)] = var29 < var27 ? var29 : var27;
                                }
                            } else {
                                for (int var30 = 0; var30 < var13; ++var30) {
                                    int var32 = var8 * var30 / var13;
                                    var19[class96.method626(arg6 - -var30, class109.field1786)] = var19[class96.method626(arg6 - -arg4 - 1 + -var30, class109.field1786)] = var27 * var32 >> 12;
                                }
                            }
                            if (var16 + var17 <= class227.field3898) {
                                class54.method350(var19, var16, var17, var27);
                            } else {
                                int var31 = -var16 + class227.field3898;
                                class54.method350(var19, var16, var31, var27);
                                class54.method350(var19, 0, var17 - var31, var27);
                            }
                        } else {
                            for (int var33 = 0; var33 < var13; ++var33) {
                                var19[class96.method626(class109.field1786, arg6 + var33)] = var19[class96.method626(class109.field1786, arg4 + arg6 + -var33 + -1)] = var8 * var33 / var13;
                            }
                            if (~class227.field3898 > ~(var16 + var17)) {
                                int var34 = -var16 + class227.field3898;
                                class54.method350(var19, var16, var34, var8);
                                class54.method350(var19, 0, -var34 + var17, var8);
                            } else {
                                class54.method350(var19, var16, var17, var8);
                            }
                        }
                    }
                }
            }
        } else if (class227.field3898 >= arg4 + arg6) {
            for (int var35 = 0; ~var35 > ~arg3; ++var35) {
                class54.method350(arg1[arg5 + var35], arg6, arg4, var8);
            }
        } else {
            int var36 = -arg6 + class227.field3898;
            for (int var37 = 0; var37 < arg3; ++var37) {
                int[] var38 = arg1[arg5 + var37];
                class54.method350(var38, arg6, var36, var8);
                class54.method350(var38, 0, -var36 + arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "<init>", descriptor = "()V")
    public class257() {
        super(0, true);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(Lva;II)V")
    public final void method142(class187 arg0, int arg1, int arg2) {
        if (arg1 == -14015) {
            ++field4564;
            if (~arg2 != -1) {
                if (~arg2 != -2) {
                    if (~arg2 != -3) {
                        if (arg2 != 3) {
                            if (~arg2 != -5) {
                                if (~arg2 != -6) {
                                    if (arg2 != 6) {
                                        if (~arg2 != -8) {
                                            if (~arg2 == -9) {
                                                this.field4573 = arg0.method1244(false);
                                            }
                                        } else {
                                            this.field4558 = arg0.method1244(false);
                                        }
                                    } else {
                                        this.field4561 = arg0.method1268(arg1 + 14270);
                                    }
                                } else {
                                    this.field4571 = arg0.method1244(false);
                                }
                            } else {
                                this.field4565 = arg0.method1244(false);
                            }
                        } else {
                            this.field4566 = arg0.method1244(false);
                        }
                    } else {
                        this.field4555 = arg0.method1244(false);
                    }
                } else {
                    this.field4569 = arg0.method1244(false);
                }
            } else {
                this.field4572 = arg0.method1268(arg1 + 14270);
            }
        }
    }

    @OriginalMember(owner = "client!mj", name = "e", descriptor = "(I)V")
    public final void method144(int arg0) {
        if (arg0 == -9) {
            ++field4568;
        }
    }

    @OriginalMember(owner = "client!mj", name = "b", descriptor = "(II)[I")
    public final int[] method143(int arg0, int arg1) {
        int[] var3 = super.field2574.method206(arg0, 10232);
        ++field4560;
        if (super.field2574.field536) {
            int[][] var4 = super.field2574.method208(arg1 ^ 1075962732);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class227.field3898 * this.field4569 >> 12;
            int var14 = 0;
            int var15 = class110.field1847 * this.field4566 >> 12;
            int var16 = class227.field3898 * this.field4555 >> 12;
            int var17 = class110.field1847 * this.field4565 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            int var18 = class227.field3898 / var13 + 1;
            int[][] var19 = new int[var18][3];
            this.field4563 = class227.field3898 / 8 * this.field4571 >> 12;
            Random var20 = new Random((long) this.field4572);
            int[][] var21 = new int[var18][3];
            label126: while (true) {
                while (true) {
                    int var22 = var13 + class46.method304(var20, var16 - var13, arg1 + -1075970218);
                    int var23 = var9 - -var22;
                    int var24 = var15 - -class46.method304(var20, -var15 + var17, -7486);
                    if (~class227.field3898 > ~var23) {
                        var23 = class227.field3898;
                        var22 = class227.field3898 - var9;
                    }
                    int var29;
                    if (var10) {
                        var29 = 0;
                    } else {
                        int var25 = var8;
                        int[] var26 = var21[var8];
                        int var27 = var6 + var23;
                        int var28 = 0;
                        var29 = var26[2];
                        if (~var27 > -1) {
                            var27 += class227.field3898;
                        }
                        if (~var27 < ~class227.field3898) {
                            var27 -= class227.field3898;
                        }
                        while (true) {
                            int[] var30 = var21[var25];
                            if (var30[0] <= var27 && ~var30[1] <= ~var27) {
                                if (var8 != var25) {
                                    int var31 = var6 + var9;
                                    if (~var31 > -1) {
                                        var31 += class227.field3898;
                                    }
                                    if (var31 > class227.field3898) {
                                        var31 -= class227.field3898;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var21[(var8 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var21[(var8 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[1];
                                            int var37 = var34[0];
                                            int var38;
                                            int var39;
                                            if (var27 > var31) {
                                                var38 = Math.max(var31, var37);
                                                var39 = Math.min(var27, var36);
                                            } else if (~var37 != -1) {
                                                var38 = Math.max(var31, var37);
                                                var39 = class227.field3898;
                                            } else {
                                                var39 = Math.min(var27, var36);
                                                var38 = 0;
                                            }
                                            this.method1747((byte) -67, var4, var20, -var35 + var29, -var38 + var39, var35, var38 - -var7);
                                        }
                                    }
                                }
                                var8 = var25;
                                break;
                            }
                            ++var25;
                            if (var25 >= var12) {
                                var25 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~class110.field1847 <= ~(var24 + var29)) {
                        var11 = false;
                    } else {
                        var24 = -var29 + class110.field1847;
                    }
                    if (~class227.field3898 != ~var23) {
                        int[] var41 = var19[var14++];
                        var41[2] = var24 + var29;
                        var41[1] = var23;
                        var41[0] = var9;
                        this.method1747((byte) -33, var4, var20, var24, var22, var29, var5 + var9);
                        var9 = var23;
                    } else {
                        this.method1747((byte) 93, var4, var20, var24, var22, var29, var9 - -var5);
                        if (var11) {
                            break label126;
                        }
                        var8 = 0;
                        int[] var42 = var19[var14++];
                        var7 = var5;
                        var42[1] = var23;
                        var12 = var14;
                        var11 = true;
                        var42[2] = var24 + var29;
                        int[][] var43 = var21;
                        var10 = false;
                        var42[0] = var9;
                        var14 = 0;
                        var5 = class46.method304(var20, class227.field3898, -7486);
                        var21 = var19;
                        var19 = var43;
                        var6 = var5 - var7;
                        int var44 = var6;
                        if (~var6 > -1) {
                            var44 = class227.field3898 + var6;
                        }
                        var9 = 0;
                        if (class227.field3898 < var44) {
                            var44 -= class227.field3898;
                        }
                        while (true) {
                            int[] var45 = var21[var8];
                            if (var45[0] <= var44 && ~var44 >= ~var45[1]) {
                                break;
                            }
                            ++var8;
                            if (var8 >= var12) {
                                var8 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 1075962732) {
            this.method142((class187) null, 79, -37);
        }
        return var3;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ZZZII)Ljl;")
    public static final class101 method1748(boolean arg0, boolean arg1, boolean arg2, int arg3, int arg4) {
        if (arg3 != 192) {
            field4562 = -106;
        }
        ++field4570;
        class87 var5 = null;
        if (class267.field4671 != null) {
            var5 = new class87(arg4, class267.field4671, class147.field2492[arg4], 1000000);
        }
        class227.field3902[arg4] = class8.field135.method1373(arg4, -86, class47.field741, var5);
        if (arg2) {
            class227.field3902[arg4].method1805((byte) -50);
        }
        return new class101(class227.field3902[arg4], arg1, arg0);
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(ILjl;Ljl;Ljl;)V")
    public static final void method1749(int arg0, class101 arg1, class101 arg2, class101 arg3) {
        class93.field1459 = arg1;
        class45.field708 = arg3;
        class85.field1331 = arg2;
        ++field4559;
        if (arg0 != 0) {
            field4562 = 52;
        }
    }

    @OriginalMember(owner = "client!mj", name = "d", descriptor = "(B)V")
    public static void method1750(byte arg0) {
        field4557 = null;
        if (arg0 <= 44) {
            method1748(false, true, true, -12, 57);
        }
        field4574 = null;
    }

    @OriginalMember(owner = "client!mj", name = "a", descriptor = "(IB)I")
    public static final int method1751(int arg0, byte arg1) {
        if (arg1 != -122) {
            field4574 = null;
        }
        ++field4575;
        if (~arg0 <= -66 && ~arg0 >= -91 || arg0 >= 192 && ~arg0 >= -223 && arg0 != 215) {
            return arg0 - -32;
        } else if (arg0 == 159) {
            return 255;
        } else {
            return arg0 == 140 ? 156 : arg0;
        }
    }
}
