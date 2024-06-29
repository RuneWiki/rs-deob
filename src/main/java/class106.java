import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class106 extends class377 {

    @OriginalMember(owner = "client!uaa", name = "A", descriptor = "I")
    private int field1326 = 1024;

    @OriginalMember(owner = "client!uaa", name = "F", descriptor = "I")
    private int field1331 = 819;

    @OriginalMember(owner = "client!uaa", name = "C", descriptor = "I")
    private int field1328 = 1024;

    @OriginalMember(owner = "client!uaa", name = "H", descriptor = "I")
    private int field1333 = 409;

    @OriginalMember(owner = "client!uaa", name = "J", descriptor = "I")
    private int field1335 = 2048;

    @OriginalMember(owner = "client!uaa", name = "K", descriptor = "I")
    private int field1336 = 1024;

    @OriginalMember(owner = "client!uaa", name = "M", descriptor = "I")
    private int field1338 = 0;

    @OriginalMember(owner = "client!uaa", name = "N", descriptor = "I")
    private int field1339 = 0;

    @OriginalMember(owner = "client!uaa", name = "E", descriptor = "I")
    private int field1330 = 1024;

    @OriginalMember(owner = "client!uaa", name = "I", descriptor = "Lhm;")
    public static class208 field1334 = new class208(4);

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!uaa", name = "B", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!uaa", name = "D", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!uaa", name = "G", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!uaa", name = "L", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!uaa", name = "O", descriptor = "I")
    public static int field1340;

    @OriginalMember(owner = "client!uaa", name = "P", descriptor = "I")
    private int field1341;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIIII[[ILjava/util/Random;)V")
    private final void method745(int arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, Random arg6) {
        ++field1340;
        int var8 = ~this.field1336 >= -1 ? 4096 : -class396.method2241(0, this.field1336, arg6) + 4096;
        if (arg1 != -24134) {
            method748((byte) 4);
        }
        int var9 = this.field1341 * this.field1330 >> 12;
        int var10 = this.field1341 - (var9 > 0 ? class396.method2241(0, var9, arg6) : 0);
        if (~arg0 <= ~class528.field6661) {
            arg0 -= class528.field6661;
        }
        if (var10 > 0) {
            if (~arg2 < -1 && ~arg3 < -1) {
                int var11 = arg3 / 2;
                int var12 = arg2 / 2;
                int var13 = ~var10 >= ~var11 ? var10 : var11;
                int var14 = ~var10 >= ~var12 ? var10 : var12;
                int var15 = arg0 + var13;
                int var16 = arg3 - var13 * 2;
                for (int var17 = 0; ~var17 > ~arg2; ++var17) {
                    int[] var18 = arg5[arg4 + var17];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (this.field1338 == 0) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class109.method762(class376.field4836, arg0 + var20)] = var18[class109.method762(class376.field4836, arg0 - -arg3 + -1 + -var20)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var22 > ~var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class109.method762(class376.field4836, arg0 - -var22)] = var18[class109.method762(arg0 + -1 - (-arg3 - -var22), class376.field4836)] = var19 <= var24 ? var19 : var24;
                            }
                        }
                        if (~class528.field6661 > ~(var15 + var16)) {
                            int var23 = -var15 + class528.field6661;
                            class70.method558(var18, var15, var23, var19);
                            class70.method558(var18, 0, -var23 + var16, var19);
                        } else {
                            class70.method558(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg2 + -1;
                        if (~var14 < ~var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field1338 != -1) {
                                for (int var27 = 0; ~var27 > ~var13; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class109.method762(arg0 - -var27, class376.field4836)] = var18[class109.method762(class376.field4836, arg0 - 1 + -var27 + arg3)] = var28 < var26 ? var28 : var26;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class109.method762(arg0 + var29, class376.field4836)] = var18[class109.method762(arg0 - var29 - 1 + arg3, class376.field4836)] = var26 * var31 >> 12;
                                }
                            }
                            if (var15 + var16 > class528.field6661) {
                                int var30 = -var15 + class528.field6661;
                                class70.method558(var18, var15, var30, var26);
                                class70.method558(var18, 0, -var30 + var16, var26);
                            } else {
                                class70.method558(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class109.method762(arg0 + var32, class376.field4836)] = var18[class109.method762(class376.field4836, -var32 + -1 + arg0 - -arg3)] = var8 * var32 / var13;
                            }
                            if (~class528.field6661 <= ~(var15 + var16)) {
                                class70.method558(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class528.field6661;
                                class70.method558(var18, var15, var33, var8);
                                class70.method558(var18, 0, -var33 + var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (class528.field6661 < arg0 - -arg3) {
            int var34 = -arg0 + class528.field6661;
            for (int var35 = 0; ~var35 > ~arg2; ++var35) {
                int[] var36 = arg5[arg4 - -var35];
                class70.method558(var36, arg0, var34, var8);
                class70.method558(var36, 0, -var34 + arg3, var8);
            }
        } else {
            for (int var37 = 0; var37 < arg2; ++var37) {
                class70.method558(arg5[arg4 - -var37], arg0, arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(II)I")
    public static final int method746(int arg0, int arg1) {
        return class612.field8321 != null ? class612.field8321[arg0][arg1] & 16777215 : 0;
    }

    @OriginalMember(owner = "client!uaa", name = "<init>", descriptor = "()V")
    public class106() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V")
    public final void method91(byte arg0) {
        if (arg0 < 52) {
            this.field1335 = 53;
        }
        ++field1325;
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IILji;)V")
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field1337;
        int var4 = -54 / ((arg1 - 13) / 55);
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field1336 = arg2.method3031(-1);
                                        }
                                    } else {
                                        this.field1330 = arg2.method3031(-1);
                                    }
                                } else {
                                    this.field1338 = arg2.method3097((byte) 12);
                                }
                            } else {
                                this.field1328 = arg2.method3031(-1);
                            }
                        } else {
                            this.field1331 = arg2.method3031(-1);
                        }
                    } else {
                        this.field1333 = arg2.method3031(-1);
                    }
                } else {
                    this.field1335 = arg2.method3031(-1);
                }
            } else {
                this.field1326 = arg2.method3031(-1);
            }
        } else {
            this.field1339 = arg2.method3097((byte) 12);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "(I)V")
    public static void method747(int arg0) {
        if (arg0 != -1) {
            field1334 = null;
        }
        field1334 = null;
    }

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "(B)V")
    public static final void method748(byte arg0) {
        class531.field6705.method1218(100);
        ++field1327;
        if (arg0 != 5) {
            method747(-53);
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(II)[I")
    public final int[] method88(int arg0, int arg1) {
        int var3 = -84 % ((5 - arg1) / 53);
        ++field1329;
        int[] var4 = super.field4842.method2772(arg0, (byte) -114);
        if (super.field4842.field6354) {
            int[][] var5 = super.field4842.method2771(0);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            int var10 = 0;
            boolean var11 = true;
            boolean var12 = true;
            int var13 = 0;
            int var14 = 0;
            int var15 = class528.field6661 * this.field1326 >> 12;
            int var16 = class528.field6661 * this.field1335 >> 12;
            int var17 = class383.field4916 * this.field1333 >> 12;
            int var18 = class383.field4916 * this.field1331 >> 12;
            if (~var18 >= -2) {
                return var5[arg0];
            } else {
                this.field1341 = class528.field6661 / 8 * this.field1328 >> 12;
                int var19 = class528.field6661 / var15 + 1;
                int[][] var20 = new int[var19][3];
                int[][] var21 = new int[var19][3];
                Random var22 = new Random((long) this.field1339);
                while (true) {
                    while (true) {
                        int var23 = class396.method2241(0, -var15 + var16, var22) + var15;
                        int var24 = var17 - -class396.method2241(0, var18 - var17, var22);
                        int var25 = var9 + var23;
                        if (var25 > class528.field6661) {
                            var23 = class528.field6661 - var9;
                            var25 = class528.field6661;
                        }
                        int var10000;
                        int var30;
                        if (var12) {
                            var30 = 0;
                        } else {
                            int var26 = var10;
                            int[] var27 = var21[var10];
                            int var28 = 0;
                            int var29 = var6 + var25;
                            if (var29 < 0) {
                                var29 += class528.field6661;
                            }
                            if (~class528.field6661 > ~var29) {
                                var29 -= class528.field6661;
                            }
                            var30 = var27[2];
                            while (true) {
                                int[] var31 = var21[var26];
                                if (var31[0] <= var29 && var29 <= var31[1]) {
                                    if (var10 != var26) {
                                        int var32 = var6 + var9;
                                        if (var32 < 0) {
                                            var32 += class528.field6661;
                                        }
                                        if (~class528.field6661 > ~var32) {
                                            var32 -= class528.field6661;
                                        }
                                        for (int var33 = 1; var28 >= var33; ++var33) {
                                            int[] var41 = var21[(var10 + var33) % var13];
                                            var30 = Math.max(var30, var41[2]);
                                        }
                                        for (int var34 = 0; ~var28 <= ~var34; ++var34) {
                                            int[] var35 = var21[(var10 + var34) % var13];
                                            int var36 = var35[2];
                                            if (~var30 != ~var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (~var32 > ~var29) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var29, var38);
                                                } else if (var37 != 0) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class528.field6661;
                                                } else {
                                                    var39 = 0;
                                                    var40 = Math.min(var29, var38);
                                                }
                                                this.method745(var39 - -var8, -24134, var30 - var36, -var39 + var40, var36, var5, var22);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                ++var28;
                                var10000 = ~var13;
                                ++var26;
                                if (var10000 >= ~var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (class383.field4916 >= var24 + var30) {
                            var11 = false;
                        } else {
                            var24 = -var30 + class383.field4916;
                        }
                        if (~class528.field6661 != ~var25) {
                            int[] var42 = var20[var14++];
                            var42[1] = var25;
                            var42[0] = var9;
                            var42[2] = var24 + var30;
                            this.method745(var9 - -var7, -24134, var24, var23, var30, var5, var22);
                            var9 = var25;
                        } else {
                            this.method745(var7 + var9, -24134, var24, var23, var30, var5, var22);
                            if (var11) {
                                return var4;
                            }
                            var11 = true;
                            int[] var43 = var20[var14++];
                            var43[0] = var9;
                            var43[1] = var25;
                            var43[2] = var24 + var30;
                            int[][] var44 = var21;
                            var21 = var20;
                            var20 = var44;
                            var13 = var14;
                            var14 = 0;
                            var8 = var7;
                            var7 = class396.method2241(0, class528.field6661, var22);
                            var9 = 0;
                            var6 = -var8 + var7;
                            int var45 = var6;
                            if (var6 < 0) {
                                var45 = class528.field6661 + var6;
                            }
                            if (~class528.field6661 > ~var45) {
                                var45 -= class528.field6661;
                            }
                            var10 = 0;
                            var12 = false;
                            while (true) {
                                int[] var46 = var21[var10];
                                if (var45 >= var46[0] && ~var46[1] <= ~var45) {
                                    break;
                                }
                                var10000 = ~var13;
                                ++var10;
                                if (var10000 >= ~var10) {
                                    var10 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var4;
        }
    }
}
