import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class145 extends class314 {

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    private int field2431 = 1024;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    private int field2433 = 819;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    private int field2434 = 1024;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    private int field2443 = 1024;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    private int field2437 = 409;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    private int field2438 = 0;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    private int field2448 = 2048;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
    private int field2449 = 0;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    private int field2444 = 1024;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field2442 = null;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "Z")
    public static boolean field2450 = false;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "[I")
    public static int[] field2440 = new int[1];

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "Z")
    public static boolean field2447 = false;

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    public static int field2429;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "I")
    public static int field2430;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field2432;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field2435;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field2436;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field2441;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(B)V", line = 3)
    public static void method1229(byte arg0) {
        if (arg0 == -8) {
            field2442 = null;
            field2440 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V", line = 284)
    public class145() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IILr;)Lufa;", line = 22)
    public static final class632 method1230(int arg0, int arg1, class167 arg2) {
        ++field2436;
        class13 var3 = class570.method3364(arg2, true, arg1, arg0 + -14129);
        if (arg0 != 14129) {
            return null;
        } else {
            return var3 == null ? null : var3.field196;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lie;I)Lpda;", line = 39)
    public static final class583 method1231(class6 arg0, int arg1) {
        if (arg1 != 1024) {
            field2447 = true;
        }
        ++field2435;
        return new class583(arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(-8652), arg0.method45(arg1 + -9676), arg0.method86(-91), arg0.method70(-9059));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(B)V", line = 51)
    public final void method3(byte arg0) {
        ++field2430;
        if (arg0 != -15) {
            this.field2432 = 65;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Ljava/lang/String;Z)V", line = 66)
    public static final void method1232(String arg0, boolean arg1) {
        if (arg1) {
            method1232((String) null, false);
        }
        ++field2441;
        if (class92.field1171 != null) {
            ++class98.field1589;
            class165 var2 = class271.method1917(class420.field6424, (byte) -91, class312.field4909);
            var2.field2776.method65(class516.method3125(118, arg0), -77);
            var2.field2776.method28(arg0, 0);
            class642.method3726(-684096285, var2);
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V", line = 90)
    private final void method1233(int arg0, int[][] arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field2445;
        int var8 = ~this.field2434 < -1 ? 4096 - class93.method902(arg0 + 8047, arg5, this.field2434) : 4096;
        int var9 = this.field2432 * this.field2431 >> 12;
        int var10 = this.field2432 + -(~var9 >= -1 ? 0 : class93.method902(8047, arg5, var9));
        if (~class81.field1009 >= ~arg3) {
            arg3 -= class81.field1009;
        }
        if (var10 > arg0) {
            if (~arg6 < -1 && arg2 > 0) {
                int var11 = arg2 / 2;
                int var12 = arg6 / 2;
                int var13 = ~var11 <= ~var10 ? var10 : var11;
                int var14 = var10 > var12 ? var12 : var10;
                int var15 = arg3 + var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; var17 < arg6; ++var17) {
                    int[] var18 = arg1[arg4 + var17];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (this.field2438 != 0) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class453.method2846(arg3 + var20, class504.field7373)] = var18[class453.method2846(class504.field7373, arg3 - var20 + arg2 + -1)] = ~var21 > ~var19 ? var21 : var19;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class453.method2846(class504.field7373, arg3 + var22)] = var18[class453.method2846(class504.field7373, arg2 + arg3 + -1 - var22)] = var19 * var24 >> 12;
                            }
                        }
                        if (class81.field1009 >= var15 + var16) {
                            class398.method2562(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class81.field1009;
                            class398.method2562(var18, var15, var23, var19);
                            class398.method2562(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg6 + -1 - var17;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field2438 != -1) {
                                for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class453.method2846(class504.field7373, arg3 + var27)] = var18[class453.method2846(arg3 - -arg2 + -var27 + -1, class504.field7373)] = var26 <= var28 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; var13 > var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class453.method2846(arg3 + var29, class504.field7373)] = var18[class453.method2846(arg2 - var29 - 1 + arg3, class504.field7373)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class81.field1009 > ~(var15 + var16)) {
                                int var30 = -var15 + class81.field1009;
                                class398.method2562(var18, var15, var30, var26);
                                class398.method2562(var18, 0, -var30 + var16, var26);
                            } else {
                                class398.method2562(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class453.method2846(class504.field7373, arg3 + var32)] = var18[class453.method2846(class504.field7373, arg3 - -arg2 + -var32 - 1)] = var8 * var32 / var13;
                            }
                            if (var15 - -var16 > class81.field1009) {
                                int var33 = class81.field1009 - var15;
                                class398.method2562(var18, var15, var33, var8);
                                class398.method2562(var18, 0, -var33 + var16, var8);
                            } else {
                                class398.method2562(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg3 - -arg2 > class81.field1009) {
            int var34 = -arg3 + class81.field1009;
            for (int var35 = 0; ~arg6 < ~var35; ++var35) {
                int[] var36 = arg1[arg4 + var35];
                class398.method2562(var36, arg3, var34, var8);
                class398.method2562(var36, 0, -var34 + arg2, var8);
            }
        } else {
            for (int var37 = 0; arg6 > var37; ++var37) {
                class398.method2562(arg1[arg4 + var37], arg3, arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "h", descriptor = "(I)V", line = 290)
    public static final void method1234(int arg0) {
        if (arg0 != -24329) {
            field2440 = null;
        }
        class416.field6365 = -1;
        class532.field7752 = null;
        ++field2446;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I", line = 308)
    public final int[] method6(int arg0, int arg1) {
        ++field2429;
        int[] var3 = super.field4928.method534((byte) -97, arg0);
        if (super.field4928.field618) {
            int[][] var4 = super.field4928.method531((byte) -111);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class81.field1009 * this.field2444 >> 12;
            int var15 = class81.field1009 * this.field2448 >> 12;
            int var16 = class246.field3926 * this.field2437 >> 12;
            int var17 = class246.field3926 * this.field2433 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            }
            this.field2432 = class81.field1009 / 8 * this.field2443 >> 12;
            int var18 = class81.field1009 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2449);
            label130: while (true) {
                while (true) {
                    int var22 = class93.method902(8047, var21, -var14 + var15) + var14;
                    int var23 = class93.method902(8047, var21, -var16 + var17) + var16;
                    int var24 = var8 - -var22;
                    if (class81.field1009 < var24) {
                        var22 = class81.field1009 - var8;
                        var24 = class81.field1009;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (var28 < 0) {
                            var28 += class81.field1009;
                        }
                        if (class81.field1009 < var28) {
                            var28 -= class81.field1009;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var30[0] >= ~var28 && ~var30[1] <= ~var28) {
                                if (~var9 != ~var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class81.field1009;
                                    }
                                    if (~class81.field1009 > ~var31) {
                                        var31 -= class81.field1009;
                                    }
                                    for (int var32 = 1; var27 >= var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (var29 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 <= ~var28) {
                                                if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class81.field1009;
                                                }
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var28, var37);
                                            }
                                            this.method1233(0, var4, -var38 + var39, var7 + var38, var35, var21, var29 - var35);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var27;
                            ++var25;
                            if (var12 <= var25) {
                                var25 = 0;
                            }
                        }
                    }
                    if (~(var29 - -var23) >= ~class246.field3926) {
                        var10 = false;
                    } else {
                        var23 = -var29 + class246.field3926;
                    }
                    if (~class81.field1009 == ~var24) {
                        this.method1233(0, var4, var22, var8 - -var6, var29, var21, var23);
                        if (var10) {
                            break label130;
                        }
                        var10 = true;
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var8;
                        var41[2] = var23 + var29;
                        int[][] var42 = var20;
                        var20 = var19;
                        var19 = var42;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class93.method902(8047, var21, class81.field1009);
                        var8 = 0;
                        var5 = -var7 + var6;
                        int var43 = var5;
                        if (~var5 > -1) {
                            var43 = class81.field1009 + var5;
                        }
                        if (~class81.field1009 > ~var43) {
                            var43 -= class81.field1009;
                        }
                        var9 = 0;
                        while (true) {
                            int[] var44 = var20[var9];
                            if (var44[0] <= var43 && var43 <= var44[1]) {
                                var11 = false;
                                break;
                            }
                            ++var9;
                            if (~var9 <= ~var12) {
                                var9 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var24;
                        var45[0] = var8;
                        var45[2] = var23 + var29;
                        this.method1233(0, var4, var22, var6 + var8, var29, var21, var23);
                        var8 = var24;
                    }
                }
            }
        }
        if (arg1 < 109) {
            this.field2438 = 48;
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(BLie;I)V", line = 581)
    public final void method5(byte arg0, class6 arg1, int arg2) {
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field2434 = arg1.method67(12021);
                                        }
                                    } else {
                                        this.field2431 = arg1.method67(12021);
                                    }
                                } else {
                                    this.field2438 = arg1.method70(-9059);
                                }
                            } else {
                                this.field2443 = arg1.method67(12021);
                            }
                        } else {
                            this.field2433 = arg1.method67(12021);
                        }
                    } else {
                        this.field2437 = arg1.method67(12021);
                    }
                } else {
                    this.field2448 = arg1.method67(12021);
                }
            } else {
                this.field2444 = arg1.method67(12021);
            }
        } else {
            this.field2449 = arg1.method70(-9059);
        }
        ++field2439;
        if (arg0 > -1) {
            this.field2431 = -111;
        }
    }
}
