import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class116 extends class228 {

    @OriginalMember(owner = "client!m", name = "T", descriptor = "I")
    private int field2047 = 1024;

    @OriginalMember(owner = "client!m", name = "V", descriptor = "I")
    private int field2049 = 0;

    @OriginalMember(owner = "client!m", name = "U", descriptor = "I")
    private int field2048 = 1024;

    @OriginalMember(owner = "client!m", name = "Y", descriptor = "I")
    private int field2052 = 409;

    @OriginalMember(owner = "client!m", name = "S", descriptor = "I")
    private int field2046 = 2048;

    @OriginalMember(owner = "client!m", name = "ab", descriptor = "I")
    private int field2054 = 1024;

    @OriginalMember(owner = "client!m", name = "jb", descriptor = "I")
    private int field2063 = 1024;

    @OriginalMember(owner = "client!m", name = "W", descriptor = "I")
    private int field2050 = 0;

    @OriginalMember(owner = "client!m", name = "kb", descriptor = "I")
    private int field2064 = 819;

    @OriginalMember(owner = "client!m", name = "Z", descriptor = "Lwk;")
    public static class273 field2053 = new class273(5);

    @OriginalMember(owner = "client!m", name = "fb", descriptor = "[J")
    public static long[] field2059 = new long[1000];

    @OriginalMember(owner = "client!m", name = "gb", descriptor = "Lgd;")
    public static class74 field2060 = new class74(64);

    @OriginalMember(owner = "client!m", name = "X", descriptor = "I")
    public static int field2051;

    @OriginalMember(owner = "client!m", name = "bb", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!m", name = "cb", descriptor = "I")
    public static int field2056;

    @OriginalMember(owner = "client!m", name = "db", descriptor = "I")
    public static int field2057;

    @OriginalMember(owner = "client!m", name = "eb", descriptor = "I")
    private int field2058;

    @OriginalMember(owner = "client!m", name = "hb", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!m", name = "ib", descriptor = "I")
    public static int field2062;

    @OriginalMember(owner = "client!m", name = "mb", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!m", name = "lb", descriptor = "Lec;")
    public static class23 field2065;

    @OriginalMember(owner = "client!m", name = "c", descriptor = "(I)V")
    public final void method278(int arg0) {
        ++field2051;
        if (arg0 != -8) {
            this.field2049 = -35;
        }
    }

    @OriginalMember(owner = "client!m", name = "d", descriptor = "(I)V")
    public static final void method782(int arg0) {
        if (arg0 != 0) {
            field2059 = null;
        }
        if (class205.field3552 != null) {
            class24 var1 = class205.field3552;
            synchronized (class205.field3552) {
                class205.field3552 = null;
            }
        }
        ++field2057;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II)[I")
    public final int[] method106(int arg0, int arg1) {
        ++field2066;
        int[] var3 = super.field3952.method1262(arg0, 7492);
        if (arg1 != -3) {
            return null;
        } else if (super.field3952.field3276) {
            int[][] var4 = super.field3952.method1261(-112);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            int var12 = 0;
            int var13 = class234.field4046 * this.field2054 >> 12;
            int var14 = class234.field4046 * this.field2046 >> 12;
            boolean var15 = true;
            int var16 = class179.field3122 * this.field2052 >> 12;
            int var17 = class179.field3122 * this.field2064 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field2058 = class234.field4046 / 8 * this.field2063 >> 12;
                int var18 = class234.field4046 / var13 + 1;
                Random var19 = new Random((long) this.field2049);
                int[][] var20 = new int[var18][3];
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = var13 - -class88.method606(var19, -var13 + var14, false);
                        int var23 = var16 - -class88.method606(var19, -var16 + var17, false);
                        int var24 = var10 + var22;
                        if (var24 > class234.field4046) {
                            var24 = class234.field4046;
                            var22 = -var10 + class234.field4046;
                        }
                        int var25;
                        if (var15) {
                            var25 = 0;
                        } else {
                            int var26 = var8;
                            int[] var27 = var20[var8];
                            int var28 = 0;
                            var25 = var27[2];
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class234.field4046;
                            }
                            if (class234.field4046 < var29) {
                                var29 -= class234.field4046;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (var29 >= var30[0] && var29 <= var30[1]) {
                                    if (var8 != var26) {
                                        int var31 = var10 - -var5;
                                        if (~var31 > -1) {
                                            var31 += class234.field4046;
                                        }
                                        if (var31 > class234.field4046) {
                                            var31 -= class234.field4046;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var8 + var32) % var11];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var8 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 == 0) {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class234.field4046;
                                                }
                                                this.method783(var19, -var35 + var25, var38 - -var7, var35, -var38 + var39, var4, arg1 ^ -17336);
                                            }
                                        }
                                    }
                                    var8 = var26;
                                    break;
                                }
                                int var10000 = ~var11;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (var25 - -var23 > class179.field3122) {
                            var23 = -var25 + class179.field3122;
                        } else {
                            var9 = false;
                        }
                        if (~class234.field4046 == ~var24) {
                            this.method783(var19, var23, var6 + var10, var25, var22, var4, 17333);
                            if (var9) {
                                return var3;
                            }
                            var9 = true;
                            var15 = false;
                            var7 = var6;
                            var8 = 0;
                            int[] var41 = var21[var12++];
                            var41[0] = var10;
                            var11 = var12;
                            var12 = 0;
                            var10 = 0;
                            int[][] var42 = var20;
                            var41[1] = var24;
                            var41[2] = var23 + var25;
                            var6 = class88.method606(var19, class234.field4046, false);
                            var5 = -var7 + var6;
                            var20 = var21;
                            var21 = var42;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class234.field4046 + var5;
                            }
                            if (class234.field4046 < var43) {
                                var43 -= class234.field4046;
                            }
                            while (true) {
                                int[] var44 = var20[var8];
                                if (var44[0] <= var43 && var44[1] >= var43) {
                                    break;
                                }
                                ++var8;
                                if (var8 >= var11) {
                                    var8 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var21[var12++];
                            var45[0] = var10;
                            var45[1] = var24;
                            var45[2] = var23 + var25;
                            this.method783(var19, var23, var6 + var10, var25, var22, var4, 17333);
                            var10 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Ljava/util/Random;IIII[[II)V")
    private final void method783(Random arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int arg6) {
        ++field2062;
        int var8 = ~this.field2047 >= -1 ? 4096 : 4096 + -class88.method606(arg0, this.field2047, false);
        int var9 = this.field2058 * this.field2048 >> 12;
        int var10 = this.field2058 + -(var9 <= 0 ? 0 : class88.method606(arg0, var9, false));
        if (arg2 >= class234.field4046) {
            arg2 -= class234.field4046;
        }
        if (~var10 >= -1) {
            if (~class234.field4046 <= ~(arg2 + arg4)) {
                for (int var11 = 0; arg1 > var11; ++var11) {
                    class241.method1569(arg5[arg3 + var11], arg2, arg4, var8);
                }
            } else {
                int var12 = class234.field4046 - arg2;
                for (int var13 = 0; arg1 > var13; ++var13) {
                    int[] var14 = arg5[arg3 - -var13];
                    class241.method1569(var14, arg2, var12, var8);
                    class241.method1569(var14, 0, -var12 + arg4, var8);
                }
            }
        } else {
            if (arg1 <= 0 || ~arg4 >= -1) {
                return;
            }
            int var15 = arg4 / 2;
            int var16 = arg1 / 2;
            int var17 = ~var10 >= ~var15 ? var10 : var15;
            int var18 = var16 >= var10 ? var10 : var16;
            int var19 = arg2 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; var21 < arg1; ++var21) {
                int[] var22 = arg5[var21 - -arg3];
                if (var18 > var21) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field2050 != -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class71.method502(class190.field3345, arg2 + var24)] = var22[class71.method502(arg2 + arg4 + -var24 + -1, class190.field3345)] = ~var23 < ~var25 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class71.method502(class190.field3345, arg2 + var26)] = var22[class71.method502(-var26 + arg2 - -arg4 + -1, class190.field3345)] = var23 * var28 >> 12;
                        }
                    }
                    if (~(var19 + var20) >= ~class234.field4046) {
                        class241.method1569(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class234.field4046;
                        class241.method1569(var22, var19, var27, var23);
                        class241.method1569(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 + arg1 + -1;
                    if (~var18 < ~var29) {
                        int var30 = var8 * var29 / var18;
                        if (this.field2050 != 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class71.method502(class190.field3345, arg2 + var31)] = var22[class71.method502(-var31 + -1 + arg2 + arg4, class190.field3345)] = var30 > var32 ? var32 : var30;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class71.method502(arg2 + var33, class190.field3345)] = var22[class71.method502(arg2 - -arg4 - (var33 - -1), class190.field3345)] = var30 * var35 >> 12;
                            }
                        }
                        if (class234.field4046 >= var19 - -var20) {
                            class241.method1569(var22, var19, var20, var30);
                        } else {
                            int var34 = class234.field4046 - var19;
                            class241.method1569(var22, var19, var34, var30);
                            class241.method1569(var22, 0, var20 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; var17 > var36; ++var36) {
                            var22[class71.method502(arg2 - -var36, class190.field3345)] = var22[class71.method502(class190.field3345, arg4 - var36 + arg2 + -1)] = var8 * var36 / var17;
                        }
                        if (var19 + var20 > class234.field4046) {
                            int var37 = class234.field4046 - var19;
                            class241.method1569(var22, var19, var37, var8);
                            class241.method1569(var22, 0, -var37 + var20, var8);
                        } else {
                            class241.method1569(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
        if (arg6 != 17333) {
            field2059 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "g", descriptor = "(B)V")
    public static final void method784(byte arg0) {
        if (class133.field2322 != null) {
            class133.field2322.method54((byte) -85);
            class133.field2322 = null;
        }
        class13.method87(arg0 + -25743);
        ++field2061;
        class169.method1147();
        for (int var1 = 0; ~var1 > -5; ++var1) {
            class177.field3091[var1].method864((byte) -52);
        }
        class79.method552(false, 113);
        System.gc();
        class272.method1803(2, (byte) 126);
        class62.field1037 = -1;
        class127.field2222 = false;
        class284.method1859(true, false);
        if (arg0 == 12) {
            class206.field3565 = 0;
            class215.field3731 = 0;
            class209.field3628 = 0;
            class280.field4910 = 0;
            class192.field3375 = false;
            for (int var2 = 0; var2 < class284.field4935.length; ++var2) {
                class284.field4935[var2] = null;
            }
            class102.field1735 = 0;
            class190.field3342 = 0;
            for (int var3 = 0; ~var3 > -2049; ++var3) {
                class259.field4515[var3] = null;
                class145.field2565[var3] = null;
            }
            for (int var4 = 0; var4 < 32768; ++var4) {
                class248.field4287[var4] = null;
            }
            for (int var5 = 0; ~var5 > -5; ++var5) {
                for (int var6 = 0; ~var6 > -105; ++var6) {
                    for (int var7 = 0; var7 < 104; ++var7) {
                        class32.field579[var5][var6][var7] = null;
                    }
                }
            }
            class199.method1336(false);
            class145.field2571 = 0;
            class218.method1452(-7434);
            class223.method1476(true, -114);
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "()V")
    public class116() {
        super(0, true);
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILik;I)V")
    public final void method18(int arg0, class261 arg1, int arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (~arg0 != -7) {
                                    if (arg0 != 7) {
                                        if (~arg0 == -9) {
                                            this.field2047 = arg1.method1740((byte) 95);
                                        }
                                    } else {
                                        this.field2048 = arg1.method1740((byte) 112);
                                    }
                                } else {
                                    this.field2050 = arg1.method1693((byte) -114);
                                }
                            } else {
                                this.field2063 = arg1.method1740((byte) 116);
                            }
                        } else {
                            this.field2064 = arg1.method1740((byte) 101);
                        }
                    } else {
                        this.field2052 = arg1.method1740((byte) 73);
                    }
                } else {
                    this.field2046 = arg1.method1740((byte) 52);
                }
            } else {
                this.field2054 = arg1.method1740((byte) 72);
            }
        } else {
            this.field2049 = arg1.method1693((byte) -100);
        }
        ++field2055;
        if (arg2 != -7618) {
            field2065 = null;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(JI)V")
    public static final void method785(long arg0, int arg1) {
        ++field2056;
        class131.field2277.field4587 = 0;
        class131.field2277.method1691(75, (byte) 53);
        class131.field2277.method1699(arg0, -1);
        class98.field1643 = 0;
        class236.field4073 = 1;
        class118.field2099 = -3;
        class234.field4031 = arg1;
    }

    @OriginalMember(owner = "client!m", name = "h", descriptor = "(B)V")
    public static void method786(byte arg0) {
        field2060 = null;
        field2065 = null;
        int var1 = -40 % ((arg0 - 38) / 60);
        field2059 = null;
        field2053 = null;
    }
}
