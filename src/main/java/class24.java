import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!o")
public class class24 extends class337 {

    @OriginalMember(owner = "client!o", name = "J", descriptor = "I")
    private int field293 = 1024;

    @OriginalMember(owner = "client!o", name = "F", descriptor = "I")
    private int field290 = 819;

    @OriginalMember(owner = "client!o", name = "G", descriptor = "I")
    private int field291 = 1024;

    @OriginalMember(owner = "client!o", name = "E", descriptor = "I")
    private int field289 = 1024;

    @OriginalMember(owner = "client!o", name = "P", descriptor = "I")
    private int field299 = 0;

    @OriginalMember(owner = "client!o", name = "N", descriptor = "I")
    private int field297 = 409;

    @OriginalMember(owner = "client!o", name = "T", descriptor = "I")
    private int field303 = 0;

    @OriginalMember(owner = "client!o", name = "C", descriptor = "I")
    private int field287 = 1024;

    @OriginalMember(owner = "client!o", name = "W", descriptor = "I")
    private int field306 = 2048;

    @OriginalMember(owner = "client!o", name = "M", descriptor = "Z")
    public static volatile boolean field296 = false;

    @OriginalMember(owner = "client!o", name = "D", descriptor = "Z")
    public static boolean field288 = false;

    @OriginalMember(owner = "client!o", name = "V", descriptor = "F")
    public static float field305;

    @OriginalMember(owner = "client!o", name = "B", descriptor = "I")
    public static int field286;

    @OriginalMember(owner = "client!o", name = "I", descriptor = "I")
    public static int field292;

    @OriginalMember(owner = "client!o", name = "K", descriptor = "I")
    public static int field294;

    @OriginalMember(owner = "client!o", name = "L", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!o", name = "O", descriptor = "I")
    public static int field298;

    @OriginalMember(owner = "client!o", name = "Q", descriptor = "I")
    public static int field300;

    @OriginalMember(owner = "client!o", name = "R", descriptor = "I")
    public static int field301;

    @OriginalMember(owner = "client!o", name = "S", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!o", name = "U", descriptor = "I")
    public static int field304;

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(B)V", line = 4)
    public final void method174(byte arg0) {
        ++field294;
        if (arg0 <= 1) {
            this.field290 = -26;
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IILjava/util/Random;III[[I)V", line = 14)
    private final void method175(int arg0, int arg1, Random arg2, int arg3, int arg4, int arg5, int[][] arg6) {
        ++field295;
        int var8 = ~this.field289 < -1 ? -class477.method2873(arg2, -117, this.field289) + 4096 : 4096;
        if (arg4 <= 83) {
            this.method179(7, (byte) -116);
        }
        int var9 = this.field302 * this.field291 >> 12;
        int var10 = this.field302 - (var9 > 0 ? class477.method2873(arg2, -105, var9) : 0);
        if (~arg0 <= ~class402.field5977) {
            arg0 -= class402.field5977;
        }
        if (~var10 >= -1) {
            if (~class402.field5977 <= ~(arg0 - -arg3)) {
                for (int var11 = 0; ~arg1 < ~var11; ++var11) {
                    class414.method2602(arg6[arg5 + var11], arg0, arg3, var8);
                }
            } else {
                int var12 = -arg0 + class402.field5977;
                for (int var13 = 0; ~var13 > ~arg1; ++var13) {
                    int[] var14 = arg6[arg5 + var13];
                    class414.method2602(var14, arg0, var12, var8);
                    class414.method2602(var14, 0, -var12 + arg3, var8);
                }
            }
        } else if (~arg1 < -1 && ~arg3 < -1) {
            int var15 = arg3 / 2;
            int var16 = arg1 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = ~var16 > ~var10 ? var16 : var10;
            int var19 = arg0 - -var17;
            int var20 = -(var17 * 2) + arg3;
            for (int var21 = 0; ~arg1 < ~var21; ++var21) {
                int[] var22 = arg6[var21 - -arg5];
                if (var21 < var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field299 == -1) {
                        for (int var24 = 0; var24 < var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class74.method644(class446.field6541, arg0 + var24)] = var22[class74.method644(class446.field6541, arg0 + arg3 + -var24 + -1)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class74.method644(class446.field6541, arg0 + var26)] = var22[class74.method644(-var26 + arg0 - -arg3 + -1, class446.field6541)] = var23 > var28 ? var28 : var23;
                        }
                    }
                    if (class402.field5977 >= var19 - -var20) {
                        class414.method2602(var22, var19, var20, var23);
                    } else {
                        int var27 = -var19 + class402.field5977;
                        class414.method2602(var22, var19, var27, var23);
                        class414.method2602(var22, 0, -var27 + var20, var23);
                    }
                } else {
                    int var29 = -var21 - 1 + arg1;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field299 == 0) {
                            for (int var31 = 0; var31 < var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class74.method644(arg0 + var31, class446.field6541)] = var22[class74.method644(class446.field6541, arg0 - -arg3 - var31 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class74.method644(arg0 + var33, class446.field6541)] = var22[class74.method644(-var33 + arg0 + -1 + arg3, class446.field6541)] = ~var30 < ~var35 ? var35 : var30;
                            }
                        }
                        if (class402.field5977 >= var19 - -var20) {
                            class414.method2602(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class402.field5977;
                            class414.method2602(var22, var19, var34, var30);
                            class414.method2602(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class74.method644(class446.field6541, arg0 + var36)] = var22[class74.method644(class446.field6541, arg3 - var36 + arg0 - 1)] = var8 * var36 / var17;
                        }
                        if (var19 + var20 > class402.field5977) {
                            int var37 = -var19 + class402.field5977;
                            class414.method2602(var22, var19, var37, var8);
                            class414.method2602(var22, 0, -var37 + var20, var8);
                        } else {
                            class414.method2602(var22, var19, var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(Lul;II)Ldb;", line = 213)
    public static final class213 method176(class406 arg0, int arg1, int arg2) {
        if (arg2 >= -71) {
            return null;
        } else {
            ++field286;
            byte[] var3 = arg0.method2558(arg1, 97);
            return var3 == null ? null : new class213(var3);
        }
    }

    @OriginalMember(owner = "client!o", name = "<init>", descriptor = "()V", line = 234)
    public class24() {
        super(0, true);
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(BILhp;)V", line = 257)
    public final void method177(byte arg0, int arg1, class217 arg2) {
        ++field304;
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (arg1 == 8) {
                                            this.field289 = arg2.method1511(-29);
                                        }
                                    } else {
                                        this.field291 = arg2.method1511(-55);
                                    }
                                } else {
                                    this.field299 = arg2.method1515((byte) 122);
                                }
                            } else {
                                this.field287 = arg2.method1511(-39);
                            }
                        } else {
                            this.field290 = arg2.method1511(-105);
                        }
                    } else {
                        this.field297 = arg2.method1511(105);
                    }
                } else {
                    this.field306 = arg2.method1511(123);
                }
            } else {
                this.field293 = arg2.method1511(111);
            }
        } else {
            this.field303 = arg2.method1515((byte) 124);
        }
        int var5 = 2 % ((arg0 - 82) / 40);
    }

    @OriginalMember(owner = "client!o", name = "b", descriptor = "(II)V", line = 368)
    public static final void method178(int arg0, int arg1) {
        if (arg1 <= 94) {
            field288 = false;
        }
        if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
        }
        ++field301;
        class213.field3474 = arg0;
    }

    @OriginalMember(owner = "client!o", name = "a", descriptor = "(IB)[I", line = 383)
    public final int[] method179(int arg0, byte arg1) {
        if (arg1 != -11) {
            this.field306 = 23;
        }
        ++field298;
        int[] var3 = super.field5007.method512(arg0, 0);
        if (super.field5007.field687) {
            int[][] var4 = super.field5007.method511(0);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class402.field5977 * this.field293 >> 12;
            int var15 = class402.field5977 * this.field306 >> 12;
            int var16 = class329.field4952 * this.field297 >> 12;
            int var17 = class329.field4952 * this.field290 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field302 = class402.field5977 / 8 * this.field287 >> 12;
                int var18 = class402.field5977 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field303);
                while (true) {
                    while (true) {
                        int var22 = var14 + class477.method2873(var21, arg1 ^ -32, -var14 + var15);
                        int var23 = class477.method2873(var21, arg1 ^ -52, -var16 + var17) + var16;
                        int var24 = var8 + var22;
                        if (class402.field5977 < var24) {
                            var24 = class402.field5977;
                            var22 = -var8 + class402.field5977;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class402.field5977;
                            }
                            if (~var29 < ~class402.field5977) {
                                var29 -= class402.field5977;
                            }
                            var25 = var27[2];
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                    if (~var9 != ~var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class402.field5977;
                                        }
                                        if (var31 > class402.field5977) {
                                            var31 -= class402.field5977;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (~var36 != -1) {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = class402.field5977;
                                                    } else {
                                                        var38 = 0;
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method175(var7 + var38, -var35 + var25, var21, -var38 + var39, 125, var35, var4);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~class329.field4952 <= ~(var23 + var25)) {
                            var10 = false;
                        } else {
                            var23 = -var25 + class329.field4952;
                        }
                        if (~class402.field5977 == ~var24) {
                            this.method175(var8 - -var6, var23, var21, var22, 103, var25, var4);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var25;
                            var41[0] = var8;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var20 = var19;
                            var19 = var42;
                            var12 = var13;
                            var13 = 0;
                            var7 = var6;
                            var6 = class477.method2873(var21, 31, class402.field5977);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (~var5 > -1) {
                                var43 = class402.field5977 + var5;
                            }
                            var9 = 0;
                            if (class402.field5977 < var43) {
                                var43 -= class402.field5977;
                            }
                            var11 = false;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var44[1] >= var43) {
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[0] = var8;
                            var45[2] = var23 + var25;
                            this.method175(var8 - -var6, var23, var21, var22, arg1 + 136, var25, var4);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }
}
