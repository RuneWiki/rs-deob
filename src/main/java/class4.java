import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class4 extends class276 {

    @OriginalMember(owner = "client!de", name = "P", descriptor = "I")
    private int field40 = 0;

    @OriginalMember(owner = "client!de", name = "Y", descriptor = "I")
    private int field49 = 409;

    @OriginalMember(owner = "client!de", name = "U", descriptor = "I")
    private int field45 = 1024;

    @OriginalMember(owner = "client!de", name = "cb", descriptor = "I")
    private int field53 = 2048;

    @OriginalMember(owner = "client!de", name = "X", descriptor = "I")
    private int field48 = 1024;

    @OriginalMember(owner = "client!de", name = "eb", descriptor = "I")
    private int field55 = 819;

    @OriginalMember(owner = "client!de", name = "bb", descriptor = "I")
    private int field52 = 0;

    @OriginalMember(owner = "client!de", name = "hb", descriptor = "I")
    private int field58 = 1024;

    @OriginalMember(owner = "client!de", name = "S", descriptor = "I")
    private int field43 = 1024;

    @OriginalMember(owner = "client!de", name = "V", descriptor = "[I")
    public static int[] field46 = new int[2];

    @OriginalMember(owner = "client!de", name = "db", descriptor = "I")
    public static int field54 = (int) (17.0D * Math.random()) + -8;

    @OriginalMember(owner = "client!de", name = "M", descriptor = "I")
    public static int field38;

    @OriginalMember(owner = "client!de", name = "O", descriptor = "I")
    private int field39;

    @OriginalMember(owner = "client!de", name = "Q", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!de", name = "R", descriptor = "I")
    public static int field42;

    @OriginalMember(owner = "client!de", name = "T", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!de", name = "W", descriptor = "I")
    public static int field47;

    @OriginalMember(owner = "client!de", name = "Z", descriptor = "I")
    public static int field50;

    @OriginalMember(owner = "client!de", name = "ab", descriptor = "I")
    public static int field51;

    @OriginalMember(owner = "client!de", name = "gb", descriptor = "I")
    public static int field57;

    @OriginalMember(owner = "client!de", name = "ib", descriptor = "Z")
    public static boolean field59;

    @OriginalMember(owner = "client!de", name = "fb", descriptor = "[[[Lhj;")
    public static class109[][][] field56;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field45 = arg1.method677(false);
                                        }
                                    } else {
                                        this.field48 = arg1.method677(false);
                                    }
                                } else {
                                    this.field52 = arg1.method669((byte) 36);
                                }
                            } else {
                                this.field58 = arg1.method677(false);
                            }
                        } else {
                            this.field55 = arg1.method677(false);
                        }
                    } else {
                        this.field49 = arg1.method677(false);
                    }
                } else {
                    this.field53 = arg1.method677(false);
                }
            } else {
                this.field43 = arg1.method677(false);
            }
        } else {
            this.field40 = arg1.method669((byte) 36);
        }
        if (arg2 != -1) {
            this.field39 = -41;
        }
        ++field41;
    }

    @OriginalMember(owner = "client!de", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 < 66) {
            field46 = null;
        }
        ++field44;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        ++field51;
        if (arg0 < 39) {
            return null;
        } else {
            int[] var3 = super.field4425.method992(17118, arg1);
            if (super.field4425.field2448) {
                int[][] var4 = super.field4425.method990(true);
                int var5 = 0;
                int var6 = 0;
                int var7 = 0;
                int var8 = 0;
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = true;
                int var12 = 0;
                int var13 = 0;
                int var14 = class53.field929 * this.field53 >> 12;
                int var15 = class53.field929 * this.field43 >> 12;
                int var16 = class209.field3540 * this.field55 >> 12;
                int var17 = class209.field3540 * this.field49 >> 12;
                if (var16 <= 1) {
                    return var4[arg1];
                } else {
                    this.field39 = class53.field929 / 8 * this.field58 >> 12;
                    int var18 = 1 - -(class53.field929 / var15);
                    int[][] var19 = new int[var18][3];
                    int[][] var20 = new int[var18][3];
                    Random var21 = new Random((long) this.field40);
                    while (true) {
                        while (true) {
                            int var22 = var15 - -class37.method246(-var15 + var14, (byte) -59, var21);
                            int var23 = var17 - -class37.method246(-var17 + var16, (byte) -59, var21);
                            int var24 = var9 + var22;
                            if (class53.field929 < var24) {
                                var22 = class53.field929 - var9;
                                var24 = class53.field929;
                            }
                            int var28;
                            if (var10) {
                                var28 = 0;
                            } else {
                                int var25 = var8;
                                int[] var26 = var19[var8];
                                int var27 = 0;
                                var28 = var26[2];
                                int var29 = var24 - -var5;
                                if (var29 < 0) {
                                    var29 += class53.field929;
                                }
                                if (class53.field929 < var29) {
                                    var29 -= class53.field929;
                                }
                                while (true) {
                                    int[] var30 = var19[var25];
                                    if (var30[0] <= var29 && var30[1] >= var29) {
                                        if (var8 != var25) {
                                            int var31 = var5 + var9;
                                            if (var31 < 0) {
                                                var31 += class53.field929;
                                            }
                                            if (~var31 < ~class53.field929) {
                                                var31 -= class53.field929;
                                            }
                                            for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                                int[] var40 = var19[(var8 - -var32) % var13];
                                                var28 = Math.max(var28, var40[2]);
                                            }
                                            for (int var33 = 0; ~var27 <= ~var33; ++var33) {
                                                int[] var34 = var19[(var8 + var33) % var13];
                                                int var35 = var34[2];
                                                if (var28 != var35) {
                                                    int var36 = var34[0];
                                                    int var37 = var34[1];
                                                    int var38;
                                                    int var39;
                                                    if (var29 <= var31) {
                                                        if (var36 == 0) {
                                                            var38 = 0;
                                                            var39 = Math.min(var29, var37);
                                                        } else {
                                                            var38 = Math.max(var31, var36);
                                                            var39 = class53.field929;
                                                        }
                                                    } else {
                                                        var38 = Math.max(var31, var36);
                                                        var39 = Math.min(var29, var37);
                                                    }
                                                    this.method25(var21, -var35 + var28, var35, var4, -var38 + var39, var7 + var38, -28051);
                                                }
                                            }
                                        }
                                        var8 = var25;
                                        break;
                                    }
                                    ++var27;
                                    ++var25;
                                    if (var13 <= var25) {
                                        var25 = 0;
                                    }
                                }
                            }
                            if (var23 + var28 > class209.field3540) {
                                var23 = -var28 + class209.field3540;
                            } else {
                                var11 = false;
                            }
                            if (~class53.field929 != ~var24) {
                                int[] var41 = var20[var12++];
                                var41[1] = var24;
                                var41[0] = var9;
                                var41[2] = var28 - -var23;
                                this.method25(var21, var23, var28, var4, var22, var6 + var9, -28051);
                                var9 = var24;
                            } else {
                                this.method25(var21, var23, var28, var4, var22, var6 + var9, -28051);
                                if (var11) {
                                    return var3;
                                }
                                var8 = 0;
                                var10 = false;
                                var7 = var6;
                                int[] var42 = var20[var12++];
                                var11 = true;
                                var42[0] = var9;
                                var13 = var12;
                                var12 = 0;
                                var9 = 0;
                                var42[2] = var23 + var28;
                                int[][] var43 = var19;
                                var42[1] = var24;
                                var6 = class37.method246(class53.field929, (byte) -59, var21);
                                var19 = var20;
                                var5 = -var7 + var6;
                                var20 = var43;
                                int var44 = var5;
                                if (~var5 > -1) {
                                    var44 = class53.field929 + var5;
                                }
                                if (~class53.field929 > ~var44) {
                                    var44 -= class53.field929;
                                }
                                while (true) {
                                    int[] var45 = var19[var8];
                                    if (var45[0] <= var44 && var45[1] >= var44) {
                                        break;
                                    }
                                    ++var8;
                                    if (~var8 <= ~var13) {
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
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "()V")
    public class4() {
        super(0, true);
    }

    @OriginalMember(owner = "client!de", name = "c", descriptor = "(B)V")
    public static void method24(byte arg0) {
        field56 = null;
        field46 = null;
        if (arg0 != 11) {
            method26(87);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Ljava/util/Random;II[[IIII)V")
    private final void method25(Random arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        if (arg6 != -28051) {
            this.method21(-128, (class101) null, (byte) 51);
        }
        ++field42;
        int var8 = this.field45 <= 0 ? 4096 : 4096 + -class37.method246(this.field45, (byte) -59, arg0);
        int var9 = this.field48 * this.field39 >> 12;
        int var10 = this.field39 - (~var9 < -1 ? class37.method246(var9, (byte) -59, arg0) : 0);
        if (arg5 >= class53.field929) {
            arg5 -= class53.field929;
        }
        if (~var10 < -1) {
            if (arg1 > 0 && arg4 > 0) {
                int var11 = arg4 / 2;
                int var12 = arg1 / 2;
                int var13 = var10 > var12 ? var12 : var10;
                int var14 = ~var10 >= ~var11 ? var10 : var11;
                int var15 = arg5 - -var14;
                int var16 = arg4 - var14 * 2;
                for (int var17 = 0; var17 < arg1; ++var17) {
                    int[] var18 = arg3[arg2 + var17];
                    if (var17 < var13) {
                        int var19 = var8 * var17 / var13;
                        if (this.field52 == 0) {
                            for (int var20 = 0; ~var14 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var14;
                                var18[class113.method791(class35.field504, arg5 - -var20)] = var18[class113.method791(-var20 + arg5 - (-arg4 + 1), class35.field504)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var14 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var14;
                                var18[class113.method791(class35.field504, arg5 + var22)] = var18[class113.method791(class35.field504, arg5 + -1 + arg4 - var22)] = ~var19 >= ~var24 ? var19 : var24;
                            }
                        }
                        if (~(var15 - -var16) >= ~class53.field929) {
                            class235.method1560(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class53.field929;
                            class235.method1560(var18, var15, var23, var19);
                            class235.method1560(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = -var17 + -1 + arg1;
                        if (~var25 > ~var13) {
                            int var26 = var8 * var25 / var13;
                            if (this.field52 == 0) {
                                for (int var27 = 0; var27 < var14; ++var27) {
                                    int var28 = var8 * var27 / var14;
                                    var18[class113.method791(arg5 + var27, class35.field504)] = var18[class113.method791(class35.field504, arg4 + -1 + arg5 + -var27)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; var14 > var29; ++var29) {
                                    int var31 = var8 * var29 / var14;
                                    var18[class113.method791(class35.field504, arg5 + var29)] = var18[class113.method791(-var29 + arg5 - (-arg4 + 1), class35.field504)] = var26 <= var31 ? var26 : var31;
                                }
                            }
                            if (class53.field929 < var15 - -var16) {
                                int var30 = -var15 + class53.field929;
                                class235.method1560(var18, var15, var30, var26);
                                class235.method1560(var18, 0, -var30 + var16, var26);
                            } else {
                                class235.method1560(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var14 < ~var32; ++var32) {
                                var18[class113.method791(class35.field504, arg5 + var32)] = var18[class113.method791(class35.field504, arg5 + -1 + arg4 - var32)] = var8 * var32 / var14;
                            }
                            if (class53.field929 >= var15 + var16) {
                                class235.method1560(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class53.field929;
                                class235.method1560(var18, var15, var33, var8);
                                class235.method1560(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class53.field929 > ~(arg5 - -arg4)) {
            int var34 = class53.field929 - arg5;
            for (int var35 = 0; ~arg1 < ~var35; ++var35) {
                int[] var36 = arg3[arg2 + var35];
                class235.method1560(var36, arg5, var34, var8);
                class235.method1560(var36, 0, -var34 + arg4, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg1; ++var37) {
                class235.method1560(arg3[arg2 - -var37], arg5, arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "g", descriptor = "(I)V")
    public static final void method26(int arg0) {
        if (arg0 != 2) {
            method24((byte) 58);
        }
        ++field50;
        if (~class59.field1026 == -31) {
            class217.method1441(25, -31239);
        }
    }
}
