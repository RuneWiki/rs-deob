import java.awt.Color;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dq")
public class class725 extends class751 {

    @OriginalMember(owner = "client!dq", name = "O", descriptor = "I")
    private int field10174 = 0;

    @OriginalMember(owner = "client!dq", name = "C", descriptor = "I")
    private int field10163 = 1024;

    @OriginalMember(owner = "client!dq", name = "S", descriptor = "I")
    private int field10178 = 819;

    @OriginalMember(owner = "client!dq", name = "N", descriptor = "I")
    private int field10173 = 1024;

    @OriginalMember(owner = "client!dq", name = "M", descriptor = "I")
    private int field10172 = 0;

    @OriginalMember(owner = "client!dq", name = "H", descriptor = "I")
    private int field10167 = 1024;

    @OriginalMember(owner = "client!dq", name = "L", descriptor = "I")
    private int field10171 = 409;

    @OriginalMember(owner = "client!dq", name = "W", descriptor = "I")
    private int field10182 = 2048;

    @OriginalMember(owner = "client!dq", name = "J", descriptor = "I")
    private int field10169 = 1024;

    @OriginalMember(owner = "client!dq", name = "F", descriptor = "[I")
    public static int[] field10166 = new int[8];

    @OriginalMember(owner = "client!dq", name = "A", descriptor = "I")
    public static int field10161 = -60;

    @OriginalMember(owner = "client!dq", name = "K", descriptor = "Lke;")
    public static class622 field10170 = new class622(65, 10);

    @OriginalMember(owner = "client!dq", name = "B", descriptor = "I")
    public static int field10162;

    @OriginalMember(owner = "client!dq", name = "D", descriptor = "I")
    public static int field10164;

    @OriginalMember(owner = "client!dq", name = "E", descriptor = "I")
    public static int field10165;

    @OriginalMember(owner = "client!dq", name = "I", descriptor = "I")
    public static int field10168;

    @OriginalMember(owner = "client!dq", name = "Q", descriptor = "I")
    public static int field10176;

    @OriginalMember(owner = "client!dq", name = "T", descriptor = "I")
    public static int field10179;

    @OriginalMember(owner = "client!dq", name = "U", descriptor = "I")
    private int field10180;

    @OriginalMember(owner = "client!dq", name = "V", descriptor = "I")
    public static int field10181;

    @OriginalMember(owner = "client!dq", name = "R", descriptor = "Lqda;")
    public static class112 field10177;

    @OriginalMember(owner = "client!dq", name = "P", descriptor = "[Lqda;")
    public static class112[] field10175;

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(B)V")
    public final void method1454(byte arg0) {
        if (arg0 < 123) {
            field10181 = 34;
        }
        ++field10164;
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(II)[I")
    public final int[] method365(int arg0, int arg1) {
        ++field10162;
        int[] var3 = super.field10405.method3601(true, arg0);
        if (super.field10405.field8923) {
            int[][] var4 = super.field10405.method3606(true);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class673.field9452 * this.field10169 >> 12;
            int var15 = class673.field9452 * this.field10182 >> 12;
            int var16 = class152.field2253 * this.field10171 >> 12;
            int var17 = class152.field2253 * this.field10178 >> 12;
            if (~var17 >= -2) {
                return var4[arg0];
            } else {
                this.field10180 = class673.field9452 / 8 * this.field10163 >> 12;
                int var18 = class673.field9452 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field10172);
                while (true) {
                    while (true) {
                        int var22 = var14 + class425.method2530(-96, -var14 + var15, var21);
                        int var23 = class425.method2530(-102, -var16 + var17, var21) + var16;
                        int var24 = var8 - -var22;
                        if (var24 > class673.field9452) {
                            var24 = class673.field9452;
                            var22 = -var8 + class673.field9452;
                        }
                        int var25;
                        if (var11) {
                            var25 = 0;
                        } else {
                            int var26 = var9;
                            int[] var27 = var20[var9];
                            int var28 = 0;
                            int var29 = var5 + var24;
                            if (~var29 > -1) {
                                var29 += class673.field9452;
                            }
                            if (~var29 < ~class673.field9452) {
                                var29 -= class673.field9452;
                            }
                            while (true) {
                                int[] var30 = var20[var26];
                                if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                    var25 = var27[2];
                                    if (var9 != var26) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class673.field9452;
                                        }
                                        if (~class673.field9452 > ~var31) {
                                            var31 -= class673.field9452;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var25 = Math.max(var25, var40[2]);
                                        }
                                        for (int var33 = 0; var33 <= var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (var25 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 >= var29) {
                                                    if (var36 == 0) {
                                                        var38 = Math.min(var29, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class673.field9452;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var29, var37);
                                                }
                                                this.method4078((byte) -127, var21, var4, var35, var25 - var35, -var39 + var38, var7 + var39);
                                            }
                                        }
                                    }
                                    var9 = var26;
                                    break;
                                }
                                ++var28;
                                ++var26;
                                if (var12 <= var26) {
                                    var26 = 0;
                                }
                            }
                        }
                        if (class152.field2253 < var23 + var25) {
                            var23 = -var25 + class152.field2253;
                        } else {
                            var10 = false;
                        }
                        if (~class673.field9452 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var25;
                            this.method4078((byte) -124, var21, var4, var25, var23, var22, var6 + var8);
                            var8 = var24;
                        } else {
                            this.method4078((byte) -125, var21, var4, var25, var23, var22, var6 + var8);
                            if (var10) {
                                return arg1 != 4095 ? null : var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[1] = var24;
                            var42[0] = var8;
                            var42[2] = var23 + var25;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class425.method2530(70, class673.field9452, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class673.field9452 + var5;
                            }
                            var9 = 0;
                            if (var44 > class673.field9452) {
                                var44 -= class673.field9452;
                            }
                            var11 = false;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var45[0] <= var44 && var44 <= var45[1]) {
                                    break;
                                }
                                int var10000 = ~var12;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return arg1 != 4095 ? null : var3;
        }
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(BLjava/util/Random;[[IIIII)V")
    private final void method4078(byte arg0, Random arg1, int[][] arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field10176;
        if (arg0 >= -123) {
            this.field10178 = 33;
        }
        int var8 = this.field10173 <= 0 ? 4096 : 4096 - class425.method2530(94, this.field10173, arg1);
        int var9 = this.field10180 * this.field10167 >> 12;
        int var10 = this.field10180 - (~var9 >= -1 ? 0 : class425.method2530(-77, var9, arg1));
        if (~arg6 <= ~class673.field9452) {
            arg6 -= class673.field9452;
        }
        if (~var10 < -1) {
            if (arg4 > 0 && arg5 > 0) {
                int var11 = arg5 / 2;
                int var12 = arg4 / 2;
                int var13 = var10 <= var11 ? var10 : var11;
                int var14 = ~var10 < ~var12 ? var12 : var10;
                int var15 = arg6 + var13;
                int var16 = -(var13 * 2) + arg5;
                for (int var17 = 0; ~var17 > ~arg4; ++var17) {
                    int[] var18 = arg2[var17 - -arg3];
                    if (~var14 < ~var17) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field10174 == -1) {
                            for (int var20 = 0; var20 < var13; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class111.method773(arg6 + var20, class407.field5754)] = var18[class111.method773(class407.field5754, arg6 - -arg5 - (var20 - -1))] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class111.method773(class407.field5754, arg6 + var22)] = var18[class111.method773(arg6 + -1 - (-arg5 + var22), class407.field5754)] = ~var19 >= ~var24 ? var19 : var24;
                            }
                        }
                        if (~class673.field9452 <= ~(var15 + var16)) {
                            class42.method293(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class673.field9452;
                            class42.method293(var18, var15, var23, var19);
                            class42.method293(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg4 + -1 + -var17;
                        if (~var25 > ~var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field10174 != 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class111.method773(arg6 + var27, class407.field5754)] = var18[class111.method773(arg6 - -arg5 - (var27 + 1), class407.field5754)] = ~var26 >= ~var28 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; var29 < var13; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class111.method773(class407.field5754, arg6 - -var29)] = var18[class111.method773(arg6 + -1 - (-arg5 + var29), class407.field5754)] = var26 * var31 >> 12;
                                }
                            }
                            if (class673.field9452 >= var15 - -var16) {
                                class42.method293(var18, var15, var16, var26);
                            } else {
                                int var30 = class673.field9452 - var15;
                                class42.method293(var18, var15, var30, var26);
                                class42.method293(var18, 0, var16 - var30, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class111.method773(class407.field5754, arg6 + var32)] = var18[class111.method773(arg6 - -arg5 - var32 + -1, class407.field5754)] = var8 * var32 / var13;
                            }
                            if (~class673.field9452 > ~(var15 + var16)) {
                                int var33 = -var15 + class673.field9452;
                                class42.method293(var18, var15, var33, var8);
                                class42.method293(var18, 0, -var33 + var16, var8);
                            } else {
                                class42.method293(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (class673.field9452 >= arg6 - -arg5) {
            for (int var34 = 0; arg4 > var34; ++var34) {
                class42.method293(arg2[arg3 + var34], arg6, arg5, var8);
            }
        } else {
            int var35 = -arg6 + class673.field9452;
            for (int var36 = 0; ~var36 > ~arg4; ++var36) {
                int[] var37 = arg2[arg3 + var36];
                class42.method293(var37, arg6, var35, var8);
                class42.method293(var37, 0, -var35 + arg5, var8);
            }
        }
    }

    @OriginalMember(owner = "client!dq", name = "c", descriptor = "(I)V")
    public static final void method4079(int arg0) {
        ++field10165;
        class311.field4630.method2734(-125);
        class694.field9812.method3196(19939);
        class364.field5270.method2052(6532);
        class359.field5219.setBackground(Color.black);
        class776.field10708 = arg0;
        class311.field4630 = class457.method2727(class359.field5219, (byte) -41);
        class694.field9812 = class689.method3881(17, true, class359.field5219);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(IIIZI)V")
    public static final void method4080(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
        ++field10168;
        class190.method1401((byte) 111);
        class746.field10379 = (long) arg4;
        int var5 = class100.method704(arg4);
        if (arg1 == 3 || ~var5 == -4) {
            arg3 = true;
        }
        if (!class638.field8979.method436()) {
            arg3 = true;
        }
        class276.method1791(arg2, var5, -9211, arg1, arg0, arg3);
    }

    @OriginalMember(owner = "client!dq", name = "a", descriptor = "(ILrv;I)V")
    public final void method309(int arg0, class120 arg1, int arg2) {
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field10173 = arg1.method898((byte) -115);
                                        }
                                    } else {
                                        this.field10167 = arg1.method898((byte) -105);
                                    }
                                } else {
                                    this.field10174 = arg1.method842(2384);
                                }
                            } else {
                                this.field10163 = arg1.method898((byte) -106);
                            }
                        } else {
                            this.field10178 = arg1.method898((byte) -90);
                        }
                    } else {
                        this.field10171 = arg1.method898((byte) -127);
                    }
                } else {
                    this.field10182 = arg1.method898((byte) -95);
                }
            } else {
                this.field10169 = arg1.method898((byte) -118);
            }
        } else {
            this.field10172 = arg1.method842(2384);
        }
        ++field10179;
        int var5 = 2 / ((arg0 - 25) / 63);
    }

    @OriginalMember(owner = "client!dq", name = "g", descriptor = "(I)V")
    public static void method4081(int arg0) {
        if (arg0 != -8) {
            field10181 = -28;
        }
        field10170 = null;
        field10177 = null;
        field10166 = null;
        field10175 = null;
    }

    @OriginalMember(owner = "client!dq", name = "<init>", descriptor = "()V")
    public class725() {
        super(0, true);
    }
}
