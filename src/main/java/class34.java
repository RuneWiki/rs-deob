import java.util.Random;
import nativeadvert.browsercontrol;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class34 extends class252 {

    @OriginalMember(owner = "client!vk", name = "V", descriptor = "I")
    private int field504 = 409;

    @OriginalMember(owner = "client!vk", name = "Z", descriptor = "I")
    private int field508 = 0;

    @OriginalMember(owner = "client!vk", name = "X", descriptor = "I")
    private int field506 = 1024;

    @OriginalMember(owner = "client!vk", name = "fb", descriptor = "I")
    private int field514 = 1024;

    @OriginalMember(owner = "client!vk", name = "kb", descriptor = "I")
    private int field519 = 819;

    @OriginalMember(owner = "client!vk", name = "qb", descriptor = "I")
    private int field525 = 0;

    @OriginalMember(owner = "client!vk", name = "sb", descriptor = "I")
    private int field527 = 1024;

    @OriginalMember(owner = "client!vk", name = "Y", descriptor = "I")
    private int field507 = 1024;

    @OriginalMember(owner = "client!vk", name = "vb", descriptor = "I")
    private int field530 = 2048;

    @OriginalMember(owner = "client!vk", name = "W", descriptor = "Ljd;")
    public static class85 field505 = class221.method1499("Abbrechen", (byte) -115);

    @OriginalMember(owner = "client!vk", name = "ab", descriptor = "Ljd;")
    public static class85 field509 = class221.method1499(" )2> <col=ffff00>", (byte) 94);

    @OriginalMember(owner = "client!vk", name = "db", descriptor = "[I")
    public static int[] field512 = new int[4096];

    @OriginalMember(owner = "client!vk", name = "nb", descriptor = "I")
    public static int field522 = 0;

    @OriginalMember(owner = "client!vk", name = "ob", descriptor = "Ljd;")
    public static class85 field523 = class221.method1499("Stufe)2", (byte) 108);

    @OriginalMember(owner = "client!vk", name = "rb", descriptor = "Ljd;")
    public static class85 field526 = class221.method1499(" )2>", (byte) 113);

    @OriginalMember(owner = "client!vk", name = "ub", descriptor = "[Lkc;")
    public static class264[] field529 = new class264[4];

    @OriginalMember(owner = "client!vk", name = "wb", descriptor = "Ljd;")
    public static class85 field531 = class221.method1499(")1", (byte) -84);

    @OriginalMember(owner = "client!vk", name = "U", descriptor = "I")
    public static int field503;

    @OriginalMember(owner = "client!vk", name = "bb", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!vk", name = "eb", descriptor = "I")
    public static int field513;

    @OriginalMember(owner = "client!vk", name = "gb", descriptor = "I")
    public static int field515;

    @OriginalMember(owner = "client!vk", name = "hb", descriptor = "I")
    public static int field516;

    @OriginalMember(owner = "client!vk", name = "ib", descriptor = "I")
    public static int field517;

    @OriginalMember(owner = "client!vk", name = "jb", descriptor = "I")
    public static int field518;

    @OriginalMember(owner = "client!vk", name = "lb", descriptor = "I")
    public static int field520;

    @OriginalMember(owner = "client!vk", name = "mb", descriptor = "I")
    public static int field521;

    @OriginalMember(owner = "client!vk", name = "pb", descriptor = "I")
    public static int field524;

    @OriginalMember(owner = "client!vk", name = "tb", descriptor = "I")
    public static int field528;

    @OriginalMember(owner = "client!vk", name = "cb", descriptor = "[I")
    public static int[] field511;

    @OriginalMember(owner = "client!vk", name = "T", descriptor = "[[S")
    public static short[][] field502;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(Lik;IB)V")
    public final void method88(class247 arg0, int arg1, byte arg2) {
        ++field518;
        if (arg1 != 0) {
            if (arg1 != 1) {
                if (arg1 != 2) {
                    if (~arg1 != -4) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field506 = arg0.method1694((byte) -100);
                                        }
                                    } else {
                                        this.field507 = arg0.method1694((byte) -100);
                                    }
                                } else {
                                    this.field525 = arg0.method1711((byte) -67);
                                }
                            } else {
                                this.field514 = arg0.method1694((byte) -100);
                            }
                        } else {
                            this.field519 = arg0.method1694((byte) -100);
                        }
                    } else {
                        this.field504 = arg0.method1694((byte) -100);
                    }
                } else {
                    this.field530 = arg0.method1694((byte) -100);
                }
            } else {
                this.field527 = arg0.method1694((byte) -100);
            }
        } else {
            this.field508 = arg0.method1711((byte) -67);
        }
        if (arg2 != -99) {
            this.method229(84, -33, (int[][]) null, -93, (Random) null, 73, 55);
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(II[[IILjava/util/Random;II)V")
    private final void method229(int arg0, int arg1, int[][] arg2, int arg3, Random arg4, int arg5, int arg6) {
        int var8 = this.field506 > 0 ? 4096 + -class135.method901(Integer.MIN_VALUE, this.field506, arg4) : 4096;
        if (arg1 != -1) {
            field522 = 97;
        }
        ++field521;
        int var9 = this.field510 * this.field507 >> 12;
        int var10 = this.field510 - (var9 <= 0 ? 0 : class135.method901(Integer.MIN_VALUE, var9, arg4));
        if (arg0 >= class5.field63) {
            arg0 -= class5.field63;
        }
        if (var10 > 0) {
            if (arg3 > 0 && arg5 > 0) {
                int var11 = arg3 / 2;
                int var12 = var11 >= var10 ? var10 : var11;
                int var13 = arg5 / 2;
                int var14 = ~var13 <= ~var10 ? var10 : var13;
                int var15 = arg0 + var14;
                int var16 = -(var14 * 2) + arg5;
                for (int var17 = 0; ~arg3 < ~var17; ++var17) {
                    int[] var18 = arg2[arg6 + var17];
                    if (~var12 < ~var17) {
                        int var19 = var8 * var17 / var12;
                        if (this.field525 != 0) {
                            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class135.method899(arg0 + var20, class67.field1233)] = var18[class135.method899(arg0 + -1 - (-arg5 - -var20), class67.field1233)] = ~var19 >= ~var21 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var14 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class135.method899(arg0 + var22, class67.field1233)] = var18[class135.method899(class67.field1233, arg0 + arg5 + -var22 + -1)] = var19 * var24 >> 12;
                            }
                        }
                        if (~(var15 + var16) < ~class5.field63) {
                            int var23 = -var15 + class5.field63;
                            class248.method1723(var18, var15, var23, var19);
                            class248.method1723(var18, 0, -var23 + var16, var19);
                        } else {
                            class248.method1723(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = arg3 - var17 + -1;
                        if (~var25 > ~var12) {
                            int var26 = var8 * var25 / var12;
                            if (this.field525 == 0) {
                                for (int var27 = 0; ~var27 > ~var14; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class135.method899(arg0 + var27, class67.field1233)] = var18[class135.method899(class67.field1233, -var27 + arg0 + arg5 + -1)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var14 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class135.method899(class67.field1233, arg0 + var29)] = var18[class135.method899(arg0 - -arg5 + (-var29 - 1), class67.field1233)] = var31 < var26 ? var31 : var26;
                                }
                            }
                            if (var15 + var16 > class5.field63) {
                                int var30 = -var15 + class5.field63;
                                class248.method1723(var18, var15, var30, var26);
                                class248.method1723(var18, 0, -var30 + var16, var26);
                            } else {
                                class248.method1723(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var14; ++var32) {
                                var18[class135.method899(arg0 + var32, class67.field1233)] = var18[class135.method899(class67.field1233, -var32 + -1 + arg0 + arg5)] = var8 * var32 / var14;
                            }
                            if (var15 + var16 > class5.field63) {
                                int var33 = -var15 + class5.field63;
                                class248.method1723(var18, var15, var33, var8);
                                class248.method1723(var18, 0, -var33 + var16, var8);
                            } else {
                                class248.method1723(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class5.field63 <= ~(arg0 + arg5)) {
            for (int var34 = 0; ~arg3 < ~var34; ++var34) {
                class248.method1723(arg2[arg6 - -var34], arg0, arg5, var8);
            }
        } else {
            int var35 = class5.field63 - arg0;
            for (int var36 = 0; ~arg3 < ~var36; ++var36) {
                int[] var37 = arg2[arg6 - -var36];
                class248.method1723(var37, arg0, var35, var8);
                class248.method1723(var37, 0, arg5 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "(I)V")
    public final void method230(int arg0) {
        ++field503;
        if (arg0 != 3906) {
            field511 = null;
        }
    }

    @OriginalMember(owner = "client!vk", name = "g", descriptor = "(I)V")
    public static final void method231(int arg0) {
        if (arg0 >= 76) {
            class94.field1715.method1270((byte) 107);
            class178.field3039.method1270((byte) 107);
            class6.field74.method1270((byte) 107);
            ++field524;
        }
    }

    @OriginalMember(owner = "client!vk", name = "h", descriptor = "(I)V")
    public static final void method232(int arg0) {
        class200.method1374(5, 1266345388);
        class88.method655((byte) 50, 5);
        class163.method1069((byte) 41, 5);
        ++field516;
        class269.method1849(false, 5);
        class115.method812(5, (byte) 28);
        class23.method154((byte) 84, 5);
        class219.method1489((byte) -106, 5);
        class186.method1282(5, (byte) -77);
        class227.method1529(5, true);
        class217.method1483(5, (byte) 83);
        if (arg0 <= 95) {
            method234(true);
        }
        class225.method1521((byte) 29, 5);
        class137.method908(50, -101);
        class25.method163(5, true);
        class121.method834(50, 5);
        class198.field3392.method1267(5, (byte) -8);
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(IB)[I")
    public final int[] method149(int arg0, byte arg1) {
        int[] var3 = super.field4356.method868(arg0, (byte) 111);
        ++field517;
        if (super.field4356.field2258) {
            int[][] var4 = super.field4356.method864((byte) -98);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class5.field63 * this.field530 >> 12;
            int var15 = class5.field63 * this.field527 >> 12;
            int var16 = class140.field2422 * this.field519 >> 12;
            int var17 = class140.field2422 * this.field504 >> 12;
            if (var16 <= 1) {
                return var4[arg0];
            }
            this.field510 = class5.field63 / 8 * this.field514 >> 12;
            int var18 = class5.field63 / var15 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field508);
            label127: while (true) {
                while (true) {
                    int var22 = var15 + class135.method901(Integer.MIN_VALUE, -var15 + var14, var21);
                    int var23 = var17 + class135.method901(Integer.MIN_VALUE, -var17 + var16, var21);
                    int var24 = var7 + var22;
                    if (~class5.field63 > ~var24) {
                        var24 = class5.field63;
                        var22 = -var7 + class5.field63;
                    }
                    int var27;
                    if (var11) {
                        var27 = 0;
                    } else {
                        int var25 = var8;
                        int[] var26 = var20[var8];
                        var27 = var26[2];
                        int var28 = 0;
                        int var29 = var5 + var24;
                        if (~var29 > -1) {
                            var29 += class5.field63;
                        }
                        if (~var29 < ~class5.field63) {
                            var29 -= class5.field63;
                        }
                        while (true) {
                            int[] var30 = var20[var25];
                            if (var30[0] <= var29 && ~var29 >= ~var30[1]) {
                                if (var8 != var25) {
                                    int var31 = var5 + var7;
                                    if (~var31 > -1) {
                                        var31 += class5.field63;
                                    }
                                    if (class5.field63 < var31) {
                                        var31 -= class5.field63;
                                    }
                                    for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var8 - -var32) % var12];
                                        var27 = Math.max(var27, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                        int[] var34 = var20[(var8 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var27 != var35) {
                                            int var36 = var34[1];
                                            int var37 = var34[0];
                                            int var38;
                                            int var39;
                                            if (var29 <= var31) {
                                                if (~var37 != -1) {
                                                    var38 = Math.max(var31, var37);
                                                    var39 = class5.field63;
                                                } else {
                                                    var39 = Math.min(var29, var36);
                                                    var38 = 0;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var37);
                                                var39 = Math.min(var29, var36);
                                            }
                                            this.method229(var6 + var38, arg1 ^ 54, var4, -var35 + var27, var21, -var38 + var39, var35);
                                        }
                                    }
                                }
                                var8 = var25;
                                break;
                            }
                            ++var25;
                            if (var12 <= var25) {
                                var25 = 0;
                            }
                            ++var28;
                        }
                    }
                    if (~class140.field2422 <= ~(var27 - -var23)) {
                        var9 = false;
                    } else {
                        var23 = -var27 + class140.field2422;
                    }
                    if (class5.field63 == var24) {
                        this.method229(var7 + var10, arg1 + 54, var4, var23, var21, var22, var27);
                        if (var9) {
                            break label127;
                        }
                        var6 = var10;
                        var8 = 0;
                        var11 = false;
                        var9 = true;
                        int[] var41 = var19[var13++];
                        int[][] var42 = var20;
                        var41[1] = var24;
                        var12 = var13;
                        var41[2] = var23 + var27;
                        var20 = var19;
                        var41[0] = var7;
                        var19 = var42;
                        var13 = 0;
                        var10 = class135.method901(Integer.MIN_VALUE, class5.field63, var21);
                        var5 = -var6 + var10;
                        var7 = 0;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class5.field63 + var5;
                        }
                        if (class5.field63 < var43) {
                            var43 -= class5.field63;
                        }
                        while (true) {
                            int[] var44 = var20[var8];
                            if (~var43 <= ~var44[0] && var44[1] >= var43) {
                                break;
                            }
                            ++var8;
                            if (var12 <= var8) {
                                var8 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[0] = var7;
                        var45[2] = var23 + var27;
                        var45[1] = var24;
                        this.method229(var7 - -var10, -1, var4, var23, var21, var22, var27);
                        var7 = var24;
                    }
                }
            }
        }
        if (arg1 != -55) {
            method233(false);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "(Z)V")
    public static void method233(boolean arg0) {
        field505 = null;
        field502 = null;
        field523 = null;
        field529 = null;
        field512 = null;
        field526 = null;
        field511 = null;
        field531 = null;
        field509 = null;
        if (arg0) {
            method232(34);
        }
    }

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "(Z)V")
    public static final void method234(boolean arg0) {
        ++field515;
        if (browsercontrol.iscreated()) {
            browsercontrol.hide();
        }
        class106.method732((byte) 21, class254.field4389);
        class85.method603((byte) 121, class254.field4389);
        if (class264.field4735 != null) {
            class264.field4735.method961(-22966, class254.field4389);
        }
        class186.method1283(0);
        if (!arg0) {
            method231(-114);
        }
        class156.method1023((byte) 115, class254.field4389);
        class131.method882(class254.field4389, 48);
        if (class264.field4735 != null) {
            class264.field4735.method962(class254.field4389, (byte) -113);
        }
        class97.method688((byte) -114);
        class152.field2599 = 0L;
    }

    @OriginalMember(owner = "client!vk", name = "<init>", descriptor = "()V")
    public class34() {
        super(0, true);
    }
}
