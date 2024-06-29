import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class234 extends class23 {

    @OriginalMember(owner = "client!jh", name = "L", descriptor = "I")
    private int field4248 = 409;

    @OriginalMember(owner = "client!jh", name = "P", descriptor = "I")
    private int field4252 = 0;

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "I")
    private int field4254 = 1024;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "I")
    private int field4266 = 1024;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    private int field4259 = 0;

    @OriginalMember(owner = "client!jh", name = "O", descriptor = "I")
    private int field4251 = 819;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    private int field4269 = 1024;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "I")
    private int field4262 = 2048;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    private int field4272 = 1024;

    @OriginalMember(owner = "client!jh", name = "M", descriptor = "Llc;")
    public static class143 field4249 = class66.method374("::fps ", -1);

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "Llc;")
    public static class143 field4258 = class66.method374("Votre liste noire est pleine (X100 noms maximum(Y)3", -1);

    @OriginalMember(owner = "client!jh", name = "K", descriptor = "Llc;")
    private static class143 field4247 = class66.method374("Cancel", -1);

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "Llc;")
    public static class143 field4261 = class66.method374("Mem:", -1);

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "Llc;")
    public static class143 field4264 = field4247;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field4267 = 0;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "Llc;")
    public static class143 field4255 = class66.method374("event_opbase", -1);

    @OriginalMember(owner = "client!jh", name = "N", descriptor = "S")
    public static short field4250 = 1;

    @OriginalMember(owner = "client!jh", name = "J", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "I")
    public static int field4253;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field4256;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    private int field4257;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "I")
    public static int field4265;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field4268;

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    public static int field4270;

    @OriginalMember(owner = "client!jh", name = "I", descriptor = "Lgf;")
    public static class7 field4245;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "[[[I")
    public static int[][][] field4271;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(I[[IIIIILjava/util/Random;)V")
    private final void method1581(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        int var8 = ~this.field4269 < -1 ? 4096 + -class139.method834((byte) -54, this.field4269, arg6) : 4096;
        if (arg2 != 3180) {
            field4258 = null;
        }
        int var9 = this.field4257 * this.field4254 >> 12;
        ++field4270;
        int var10 = this.field4257 + -(~var9 < -1 ? class139.method834((byte) -54, var9, arg6) : 0);
        if (arg3 >= class72.field1359) {
            arg3 -= class72.field1359;
        }
        if (~var10 < -1) {
            if (arg5 > 0 && arg4 > 0) {
                int var11 = arg4 / 2;
                int var12 = arg5 / 2;
                int var13 = ~var10 < ~var11 ? var11 : var10;
                int var14 = ~var12 > ~var10 ? var12 : var10;
                int var15 = arg3 + var13;
                int var16 = -(var13 * 2) + arg4;
                for (int var17 = 0; arg5 > var17; ++var17) {
                    int[] var18 = arg1[arg0 + var17];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field4259 != -1) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class129.method777(arg3 - -var20, class172.field3077)] = var18[class129.method777(-var20 + arg3 + arg4 + -1, class172.field3077)] = var19 <= var21 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; var13 > var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class129.method777(class172.field3077, arg3 + var22)] = var18[class129.method777(class172.field3077, -var22 + -1 + arg3 + arg4)] = var19 * var24 >> 12;
                            }
                        }
                        if (var15 + var16 <= class72.field1359) {
                            class275.method1812(var18, var15, var16, var19);
                        } else {
                            int var23 = -var15 + class72.field1359;
                            class275.method1812(var18, var15, var23, var19);
                            class275.method1812(var18, 0, -var23 + var16, var19);
                        }
                    } else {
                        int var25 = arg5 + -1 + -var17;
                        if (var25 < var14) {
                            int var26 = var8 * var25 / var14;
                            if (this.field4259 == 0) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class129.method777(class172.field3077, arg3 - -var27)] = var18[class129.method777(class172.field3077, -var27 + arg4 + -1 + arg3)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class129.method777(class172.field3077, arg3 + var29)] = var18[class129.method777(class172.field3077, arg4 - 1 + arg3 + -var29)] = var26 > var31 ? var31 : var26;
                                }
                            }
                            if (~(var15 + var16) >= ~class72.field1359) {
                                class275.method1812(var18, var15, var16, var26);
                            } else {
                                int var30 = class72.field1359 - var15;
                                class275.method1812(var18, var15, var30, var26);
                                class275.method1812(var18, 0, -var30 + var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var13 < ~var32; ++var32) {
                                var18[class129.method777(class172.field3077, arg3 + var32)] = var18[class129.method777(-var32 - 1 + arg3 + arg4, class172.field3077)] = var8 * var32 / var13;
                            }
                            if (~class72.field1359 <= ~(var15 - -var16)) {
                                class275.method1812(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class72.field1359;
                                class275.method1812(var18, var15, var33, var8);
                                class275.method1812(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (arg3 + arg4 <= class72.field1359) {
            for (int var34 = 0; var34 < arg5; ++var34) {
                class275.method1812(arg1[arg0 + var34], arg3, arg4, var8);
            }
        } else {
            int var35 = -arg3 + class72.field1359;
            for (int var36 = 0; ~var36 > ~arg5; ++var36) {
                int[] var37 = arg1[arg0 - -var36];
                class275.method1812(var37, arg3, var35, var8);
                class275.method1812(var37, 0, -var35 + arg4, var8);
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class234() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ZILgf;I)[Lbc;")
    public static final class100[] method1582(boolean arg0, int arg1, class7 arg2, int arg3) {
        ++field4263;
        if (!arg0) {
            method1584((byte) 52);
        }
        return !class189.method1223(arg2, arg1, 101, arg3) ? null : class240.method1611(-13652);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILgf;Lgf;)V")
    public static final void method1583(int arg0, class7 arg1, class7 arg2) {
        if (arg0 < 58) {
            field4261 = null;
        }
        ++field4260;
        class134.field2349 = arg1;
        class211.field3925 = arg2;
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(B)V")
    public final void method85(byte arg0) {
        int var2 = 122 % ((22 - arg0) / 60);
        ++field4253;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(II)[I")
    public final int[] method86(int arg0, int arg1) {
        if (arg0 > -13) {
            field4249 = null;
        }
        ++field4256;
        int[] var3 = super.field369.method306(arg1, -23179);
        if (super.field369.field1005) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int[][] var8 = super.field369.method301(-93);
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class72.field1359 * this.field4272 >> 12;
            int var14 = 0;
            int var15 = class9.field179 * this.field4248 >> 12;
            int var16 = class72.field1359 * this.field4262 >> 12;
            int var17 = class9.field179 * this.field4251 >> 12;
            if (var17 <= 1) {
                return var8[arg1];
            } else {
                int var18 = 1 - -(class72.field1359 / var13);
                this.field4257 = class72.field1359 / 8 * this.field4266 >> 12;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field4252);
                while (true) {
                    while (true) {
                        int var22 = class139.method834((byte) -54, -var13 + var16, var21) + var13;
                        int var23 = var15 - -class139.method834((byte) -54, -var15 + var17, var21);
                        int var24 = var7 + var22;
                        if (class72.field1359 < var24) {
                            var22 = -var7 + class72.field1359;
                            var24 = class72.field1359;
                        }
                        int var29;
                        if (var11) {
                            var29 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            int var27 = var4 + var24;
                            int var28 = 0;
                            if (var27 < 0) {
                                var27 += class72.field1359;
                            }
                            var29 = var26[2];
                            if (var27 > class72.field1359) {
                                var27 -= class72.field1359;
                            }
                            while (true) {
                                int[] var30 = var20[var25];
                                if (~var30[0] >= ~var27 && var30[1] >= var27) {
                                    if (var9 != var25) {
                                        int var31 = var4 + var7;
                                        if (var31 < 0) {
                                            var31 += class72.field1359;
                                        }
                                        if (class72.field1359 < var31) {
                                            var31 -= class72.field1359;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var29 = Math.max(var29, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var29 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var27) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var27, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class72.field1359;
                                                } else {
                                                    var39 = Math.min(var27, var37);
                                                    var38 = 0;
                                                }
                                                this.method1581(var35, var8, 3180, var6 + var38, -var38 + var39, -var35 + var29, var21);
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
                                ++var28;
                            }
                        }
                        if (~(var23 + var29) >= ~class9.field179) {
                            var10 = false;
                        } else {
                            var23 = class9.field179 - var29;
                        }
                        if (~class72.field1359 == ~var24) {
                            this.method1581(var29, var8, 3180, var5 + var7, var22, var23, var21);
                            if (var10) {
                                return var3;
                            }
                            var6 = var5;
                            var11 = false;
                            int[] var41 = var19[var14++];
                            var9 = 0;
                            var41[2] = var29 - -var23;
                            var41[1] = var24;
                            int[][] var42 = var20;
                            var41[0] = var7;
                            var20 = var19;
                            var12 = var14;
                            var14 = 0;
                            var19 = var42;
                            var10 = true;
                            var5 = class139.method834((byte) -54, class72.field1359, var21);
                            var4 = var5 - var6;
                            int var43 = var4;
                            if (var4 < 0) {
                                var43 = class72.field1359 + var4;
                            }
                            var7 = 0;
                            if (~var43 < ~class72.field1359) {
                                var43 -= class72.field1359;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && var43 <= var44[1]) {
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var14++];
                            var45[2] = var23 + var29;
                            var45[0] = var7;
                            var45[1] = var24;
                            this.method1581(var29, var8, 3180, var5 + var7, var22, var23, var21);
                            var7 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!jh", name = "d", descriptor = "(B)V")
    public static void method1584(byte arg0) {
        field4247 = null;
        int var1 = 118 % ((-9 - arg0) / 40);
        field4258 = null;
        field4245 = null;
        field4261 = null;
        field4271 = null;
        field4249 = null;
        field4264 = null;
        field4255 = null;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Lh;IZ)V")
    public final void method83(class190 arg0, int arg1, boolean arg2) {
        if (arg2) {
            if (~arg1 != -1) {
                if (arg1 != 1) {
                    if (~arg1 != -3) {
                        if (~arg1 != -4) {
                            if (arg1 != 4) {
                                if (~arg1 != -6) {
                                    if (arg1 != 6) {
                                        if (~arg1 != -8) {
                                            if (arg1 == 8) {
                                                this.field4269 = arg0.method1275(128);
                                            }
                                        } else {
                                            this.field4254 = arg0.method1275(128);
                                        }
                                    } else {
                                        this.field4259 = arg0.method1265(120);
                                    }
                                } else {
                                    this.field4266 = arg0.method1275(128);
                                }
                            } else {
                                this.field4251 = arg0.method1275(128);
                            }
                        } else {
                            this.field4248 = arg0.method1275(128);
                        }
                    } else {
                        this.field4262 = arg0.method1275(128);
                    }
                } else {
                    this.field4272 = arg0.method1275(128);
                }
            } else {
                this.field4252 = arg0.method1265(116);
            }
            ++field4265;
        }
    }
}
