import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class493 extends class175 {

    @OriginalMember(owner = "client!qe", name = "M", descriptor = "I")
    private int field6939 = 1024;

    @OriginalMember(owner = "client!qe", name = "E", descriptor = "I")
    private int field6932 = 1024;

    @OriginalMember(owner = "client!qe", name = "L", descriptor = "I")
    private int field6938 = 0;

    @OriginalMember(owner = "client!qe", name = "N", descriptor = "I")
    private int field6940 = 409;

    @OriginalMember(owner = "client!qe", name = "T", descriptor = "I")
    private int field6946 = 1024;

    @OriginalMember(owner = "client!qe", name = "R", descriptor = "I")
    private int field6944 = 819;

    @OriginalMember(owner = "client!qe", name = "F", descriptor = "I")
    private int field6933 = 0;

    @OriginalMember(owner = "client!qe", name = "Q", descriptor = "I")
    private int field6943 = 2048;

    @OriginalMember(owner = "client!qe", name = "X", descriptor = "I")
    private int field6950 = 1024;

    @OriginalMember(owner = "client!qe", name = "I", descriptor = "[[I")
    public static int[][] field6935 = new int[][] { { 12, 12, 12, 12 }, { 12, 12, 12, 12 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 5, 5, 5 }, { 12, 12, 12, 12, 12, 12 }, { 1, 1, 1, 7 }, { 1, 1, 7, 1 }, { 8, 9, 9, 8, 8, 9 }, { 8, 8, 9, 8, 9, 9 }, { 10, 10, 11, 11, 11, 10 }, { 12, 12, 12, 12 } };

    @OriginalMember(owner = "client!qe", name = "P", descriptor = "I")
    public static int field6942 = 1407;

    @OriginalMember(owner = "client!qe", name = "H", descriptor = "I")
    public static int field6934 = -1;

    @OriginalMember(owner = "client!qe", name = "U", descriptor = "I")
    public static int field6947 = 0;

    @OriginalMember(owner = "client!qe", name = "J", descriptor = "I")
    public static int field6936;

    @OriginalMember(owner = "client!qe", name = "K", descriptor = "I")
    public static int field6937;

    @OriginalMember(owner = "client!qe", name = "O", descriptor = "I")
    public static int field6941;

    @OriginalMember(owner = "client!qe", name = "S", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!qe", name = "V", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!qe", name = "W", descriptor = "I")
    private int field6949;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ILdt;Z)V")
    public final void method44(int arg0, class254 arg1, boolean arg2) {
        ++field6948;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (~arg0 == -9) {
                                            this.field6950 = arg1.method1728((byte) 92);
                                        }
                                    } else {
                                        this.field6939 = arg1.method1728((byte) 50);
                                    }
                                } else {
                                    this.field6933 = arg1.method1731((byte) 64);
                                }
                            } else {
                                this.field6932 = arg1.method1728((byte) 15);
                            }
                        } else {
                            this.field6944 = arg1.method1728((byte) 124);
                        }
                    } else {
                        this.field6940 = arg1.method1728((byte) 6);
                    }
                } else {
                    this.field6943 = arg1.method1728((byte) 101);
                }
            } else {
                this.field6946 = arg1.method1728((byte) 103);
            }
        } else {
            this.field6938 = arg1.method1731((byte) 64);
        }
        if (arg2) {
            this.field6933 = -118;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(ZI)[I")
    public final int[] method47(boolean arg0, int arg1) {
        ++field6941;
        if (!arg0) {
            this.field6946 = 106;
        }
        int[] var3 = super.field2310.method91(0, arg1);
        if (super.field2310.field169) {
            int[][] var4 = super.field2310.method93(22563);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class598.field8136 * this.field6946 >> 12;
            int var15 = class598.field8136 * this.field6943 >> 12;
            int var16 = class561.field7687 * this.field6940 >> 12;
            int var17 = class561.field7687 * this.field6944 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field6949 = class598.field8136 / 8 * this.field6932 >> 12;
                int var18 = class598.field8136 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field6938);
                while (true) {
                    while (true) {
                        int var22 = class594.method3335(-var14 + var15, !arg0, var21) + var14;
                        int var23 = class594.method3335(-var16 + var17, false, var21) + var16;
                        int var24 = var8 - -var22;
                        if (class598.field8136 < var24) {
                            var24 = class598.field8136;
                            var22 = -var8 + class598.field8136;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = 0;
                            int var28 = var5 + var24;
                            if (var28 < 0) {
                                var28 += class598.field8136;
                            }
                            if (~var28 < ~class598.field8136) {
                                var28 -= class598.field8136;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (var28 >= var29[0] && ~var28 >= ~var29[1]) {
                                    var30 = var26[2];
                                    if (var9 != var25) {
                                        int var31 = var5 + var8;
                                        if (~var31 > -1) {
                                            var31 += class598.field8136;
                                        }
                                        if (class598.field8136 < var31) {
                                            var31 -= class598.field8136;
                                        }
                                        for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var30 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var28 > var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (~var36 == -1) {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                } else {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class598.field8136;
                                                }
                                                this.method2905(-var35 + var30, (byte) -90, var35, var4, var39 - var38, var21, var7 + var38);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (var25 >= var12) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var30 - -var23 <= class561.field7687) {
                            var10 = false;
                        } else {
                            var23 = -var30 + class561.field7687;
                        }
                        if (~class598.field8136 == ~var24) {
                            this.method2905(var23, (byte) -107, var30, var4, var22, var21, var8 - -var6);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var41 = var19[var13++];
                            var41[1] = var24;
                            var41[0] = var8;
                            var41[2] = var23 + var30;
                            int[][] var42 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var42;
                            var7 = var6;
                            var13 = 0;
                            var6 = class594.method3335(class598.field8136, false, var21);
                            var8 = 0;
                            var5 = -var7 + var6;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class598.field8136 + var5;
                            }
                            if (~class598.field8136 > ~var43) {
                                var43 -= class598.field8136;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var43 <= ~var44[0] && var43 <= var44[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (var12 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[0] = var8;
                            var45[1] = var24;
                            var45[2] = var23 + var30;
                            this.method2905(var23, (byte) -34, var30, var4, var22, var21, var8 - -var6);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IBI[[IILjava/util/Random;I)V")
    private final void method2905(int arg0, byte arg1, int arg2, int[][] arg3, int arg4, Random arg5, int arg6) {
        ++field6936;
        int var8 = this.field6950 > 0 ? 4096 - class594.method3335(this.field6950, false, arg5) : 4096;
        if (arg1 > -22) {
            this.field6938 = 31;
        }
        int var9 = this.field6949 * this.field6939 >> 12;
        int var10 = this.field6949 + -(~var9 < -1 ? class594.method3335(var9, false, arg5) : 0);
        if (arg6 >= class598.field8136) {
            arg6 -= class598.field8136;
        }
        if (~var10 >= -1) {
            if (~class598.field8136 > ~(arg4 + arg6)) {
                int var11 = -arg6 + class598.field8136;
                for (int var12 = 0; arg0 > var12; ++var12) {
                    int[] var13 = arg3[arg2 - -var12];
                    class421.method2532(var13, arg6, var11, var8);
                    class421.method2532(var13, 0, -var11 + arg4, var8);
                }
            } else {
                for (int var14 = 0; ~arg0 < ~var14; ++var14) {
                    class421.method2532(arg3[arg2 + var14], arg6, arg4, var8);
                }
            }
        } else if (~arg0 < -1 && ~arg4 < -1) {
            int var15 = arg4 / 2;
            int var16 = arg0 / 2;
            int var17 = ~var15 <= ~var10 ? var10 : var15;
            int var18 = ~var16 > ~var10 ? var16 : var10;
            int var19 = arg6 + var17;
            int var20 = -(var17 * 2) + arg4;
            for (int var21 = 0; ~var21 > ~arg0; ++var21) {
                int[] var22 = arg3[var21 - -arg2];
                if (~var18 < ~var21) {
                    int var23 = var8 * var21 / var18;
                    if (this.field6933 == 0) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class519.method3018(arg6 - -var24, class412.field5896)] = var22[class519.method3018(arg4 + arg6 - (var24 - -1), class412.field5896)] = var23 * var25 >> 12;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class519.method3018(arg6 + var26, class412.field5896)] = var22[class519.method3018(class412.field5896, arg4 + arg6 + -1 + -var26)] = var28 < var23 ? var28 : var23;
                        }
                    }
                    if (~(var19 + var20) < ~class598.field8136) {
                        int var27 = -var19 + class598.field8136;
                        class421.method2532(var22, var19, var27, var23);
                        class421.method2532(var22, 0, -var27 + var20, var23);
                    } else {
                        class421.method2532(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = -var21 + -1 + arg0;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (this.field6933 == 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class519.method3018(class412.field5896, arg6 + var31)] = var22[class519.method3018(class412.field5896, -var31 + -1 + arg6 + arg4)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class519.method3018(class412.field5896, arg6 + var33)] = var22[class519.method3018(arg6 - -arg4 - (var33 + 1), class412.field5896)] = var30 <= var35 ? var30 : var35;
                            }
                        }
                        if (~(var19 + var20) >= ~class598.field8136) {
                            class421.method2532(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class598.field8136;
                            class421.method2532(var22, var19, var34, var30);
                            class421.method2532(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class519.method3018(arg6 + var36, class412.field5896)] = var22[class519.method3018(arg4 + arg6 - var36 + -1, class412.field5896)] = var8 * var36 / var17;
                        }
                        if (~(var19 + var20) >= ~class598.field8136) {
                            class421.method2532(var22, var19, var20, var8);
                        } else {
                            int var37 = class598.field8136 - var19;
                            class421.method2532(var22, var19, var37, var8);
                            class421.method2532(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!qe", name = "<init>", descriptor = "()V")
    public class493() {
        super(0, true);
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(I)V")
    public final void method46(int arg0) {
        if (arg0 == -8) {
            ++field6937;
        }
    }

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "(Z)V")
    public static void method2906(boolean arg0) {
        if (!arg0) {
            field6947 = 104;
        }
        field6935 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B[I)Ljava/lang/String;")
    public static final String method2907(byte arg0, int[] arg1) {
        if (arg0 <= 87) {
            field6947 = 74;
        }
        ++field6945;
        StringBuffer var2 = new StringBuffer();
        int var3 = class494.field6964;
        for (int var4 = 0; ~arg1.length < ~var4; ++var4) {
            class41 var5 = class222.field2875.method3216(arg1[var4], (byte) 73);
            if (~var5.field433 != 0) {
                class140 var6 = (class140) class377.field5511.method3109((byte) 107, (long) var5.field433);
                if (var6 == null) {
                    class162 var7 = class162.method1115(class490.field6826, var5.field433, 0);
                    if (var7 != null) {
                        var6 = class375.field5490.method466(var7, true);
                        class377.field5511.method3108((long) var5.field433, 16337, var6);
                    }
                }
                if (var6 != null) {
                    class584.field7966[var3] = var6;
                    var2.append(" <img=").append(var3).append(">");
                    ++var3;
                }
            }
        }
        return var2.toString();
    }
}
