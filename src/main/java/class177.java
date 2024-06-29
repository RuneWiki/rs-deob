import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class177 extends class107 {

    @OriginalMember(owner = "client!tg", name = "V", descriptor = "I")
    private int field3097 = 1024;

    @OriginalMember(owner = "client!tg", name = "cb", descriptor = "I")
    private int field3104 = 409;

    @OriginalMember(owner = "client!tg", name = "nb", descriptor = "I")
    private int field3115 = 1024;

    @OriginalMember(owner = "client!tg", name = "pb", descriptor = "I")
    private int field3117 = 819;

    @OriginalMember(owner = "client!tg", name = "mb", descriptor = "I")
    private int field3114 = 0;

    @OriginalMember(owner = "client!tg", name = "fb", descriptor = "I")
    private int field3107 = 0;

    @OriginalMember(owner = "client!tg", name = "rb", descriptor = "I")
    private int field3119 = 1024;

    @OriginalMember(owner = "client!tg", name = "tb", descriptor = "I")
    private int field3121 = 2048;

    @OriginalMember(owner = "client!tg", name = "sb", descriptor = "I")
    private int field3120 = 1024;

    @OriginalMember(owner = "client!tg", name = "Q", descriptor = "Lpj;")
    private static class237 field3092 = class33.method353("skill:", 18);

    @OriginalMember(owner = "client!tg", name = "U", descriptor = "I")
    public static int field3096 = 0;

    @OriginalMember(owner = "client!tg", name = "db", descriptor = "[I")
    public static int[] field3105 = new int[25];

    @OriginalMember(owner = "client!tg", name = "bb", descriptor = "I")
    public static int field3103 = 20;

    @OriginalMember(owner = "client!tg", name = "lb", descriptor = "Lpj;")
    public static class237 field3113 = field3092;

    @OriginalMember(owner = "client!tg", name = "kb", descriptor = "[S")
    public static short[] field3112 = new short[256];

    @OriginalMember(owner = "client!tg", name = "qb", descriptor = "Lpj;")
    public static class237 field3118 = class33.method353("titlebg", 123);

    @OriginalMember(owner = "client!tg", name = "ob", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3116 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client!tg", name = "ub", descriptor = "Lpj;")
    public static class237 field3122 = class33.method353("Abbrechen", 18);

    @OriginalMember(owner = "client!tg", name = "wb", descriptor = "[I")
    public static int[] field3124 = new int[] { 2, 0, 0, 2, 0, 0, 0, 4, 4 };

    @OriginalMember(owner = "client!tg", name = "P", descriptor = "I")
    public static int field3091;

    @OriginalMember(owner = "client!tg", name = "R", descriptor = "I")
    public static int field3093;

    @OriginalMember(owner = "client!tg", name = "S", descriptor = "I")
    public static int field3094;

    @OriginalMember(owner = "client!tg", name = "T", descriptor = "I")
    public static int field3095;

    @OriginalMember(owner = "client!tg", name = "W", descriptor = "I")
    public static int field3098;

    @OriginalMember(owner = "client!tg", name = "X", descriptor = "I")
    public static int field3099;

    @OriginalMember(owner = "client!tg", name = "Y", descriptor = "I")
    public static int field3100;

    @OriginalMember(owner = "client!tg", name = "Z", descriptor = "I")
    public static int field3101;

    @OriginalMember(owner = "client!tg", name = "ab", descriptor = "I")
    public static int field3102;

    @OriginalMember(owner = "client!tg", name = "eb", descriptor = "I")
    public static int field3106;

    @OriginalMember(owner = "client!tg", name = "gb", descriptor = "I")
    private int field3108;

    @OriginalMember(owner = "client!tg", name = "hb", descriptor = "I")
    public static int field3109;

    @OriginalMember(owner = "client!tg", name = "ib", descriptor = "I")
    public static int field3110;

    @OriginalMember(owner = "client!tg", name = "vb", descriptor = "Lfa;")
    public static class239 field3123;

    @OriginalMember(owner = "client!tg", name = "jb", descriptor = "Lka;")
    public static class246 field3111;

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1219(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        ++field3095;
        if (~arg4 <= ~class89.field1637 && ~class94.field1676 <= ~arg4 && arg9 >= class89.field1637 && class94.field1676 >= arg9 && ~class89.field1637 >= ~arg8 && ~class94.field1676 <= ~arg8 && ~arg5 <= ~class89.field1637 && ~class94.field1676 <= ~arg5 && ~class13.field215 >= ~arg6 && ~class34.field727 <= ~arg6 && ~arg7 <= ~class13.field215 && arg7 <= class34.field727 && arg2 >= class13.field215 && ~arg2 >= ~class34.field727 && ~class13.field215 >= ~arg1 && ~arg1 >= ~class34.field727) {
            class170.method1179(arg8, true, arg2, arg1, arg6, arg0, arg4, arg5, arg9, arg7);
        } else {
            class37.method377(arg7, arg8, arg9, arg5, arg4, arg0, arg2, arg1, arg3, arg6);
        }
        if (arg3 != 0) {
            field3122 = null;
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIZ)V")
    public static final void method1220(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        ++field3106;
        if (class47.method434(0, arg3)) {
            class214.method1436(arg4, arg2, arg0, class22.field406[arg3], arg1, (byte) -121);
        }
    }

    @OriginalMember(owner = "client!tg", name = "h", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3122 = null;
        field3112 = null;
        field3105 = null;
        field3124 = null;
        field3092 = null;
        field3113 = null;
        field3123 = null;
        field3116 = null;
        field3111 = null;
        field3118 = null;
        if (arg0 != 26999) {
            method1228(85);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BI)[I")
    public final int[] method123(byte arg0, int arg1) {
        if (arg0 != -17) {
            field3111 = null;
        }
        ++field3098;
        int[] var3 = super.field1921.method1388(arg1, (byte) -26);
        if (super.field1921.field3539) {
            int var4 = 0;
            int[][] var5 = super.field1921.method1389(21082);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class106.field1862 * this.field3121 >> 12;
            int var15 = class106.field1862 * this.field3097 >> 12;
            int var16 = class193.field3342 * this.field3104 >> 12;
            int var17 = class193.field3342 * this.field3117 >> 12;
            if (var17 <= 1) {
                return var5[arg1];
            } else {
                int var18 = class106.field1862 / var15 + 1;
                this.field3108 = class106.field1862 / 8 * this.field3115 >> 12;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field3114);
                while (true) {
                    while (true) {
                        int var22 = class211.method1413(-var15 + var14, -1, var21) + var15;
                        int var23 = var16 + class211.method1413(var17 - var16, -1, var21);
                        int var24 = var8 + var22;
                        if (~var24 < ~class106.field1862) {
                            var24 = class106.field1862;
                            var22 = -var8 + class106.field1862;
                        }
                        int var27;
                        if (var12) {
                            var27 = 0;
                        } else {
                            int var25 = var9;
                            int[] var26 = var20[var9];
                            var27 = var26[2];
                            int var28 = 0;
                            int var29 = var24 - -var4;
                            if (~var29 > -1) {
                                var29 += class106.field1862;
                            }
                            if (~var29 < ~class106.field1862) {
                                var29 -= class106.field1862;
                            }
                            while (true) {
                                int[] var30 = var20[var25];
                                if (var29 >= var30[0] && ~var29 >= ~var30[1]) {
                                    if (var9 != var25) {
                                        int var31 = var4 + var8;
                                        if (~var31 > -1) {
                                            var31 += class106.field1862;
                                        }
                                        if (class106.field1862 < var31) {
                                            var31 -= class106.field1862;
                                        }
                                        for (int var32 = 1; var32 <= var28; ++var32) {
                                            int[] var40 = var20[(var9 - -var32) % var11];
                                            var27 = Math.max(var27, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var28; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var11];
                                            int var35 = var34[2];
                                            if (var27 != var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (var31 < var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class106.field1862;
                                                } else {
                                                    var39 = Math.min(var29, var37);
                                                    var38 = 0;
                                                }
                                                this.method1224(var21, -var38 + var39, var35, (byte) -6, var5, var6 + var38, var27 - var35);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var28;
                                int var10000 = ~var11;
                                ++var25;
                                if (var10000 >= ~var25) {
                                    var25 = 0;
                                }
                            }
                        }
                        if (~class193.field3342 <= ~(var27 - -var23)) {
                            var10 = false;
                        } else {
                            var23 = class193.field3342 - var27;
                        }
                        if (class106.field1862 == var24) {
                            this.method1224(var21, var22, var27, (byte) -6, var5, var8 - -var7, var23);
                            if (var10) {
                                return var3;
                            }
                            var12 = false;
                            var10 = true;
                            var6 = var7;
                            var9 = 0;
                            int[] var41 = var19[var13++];
                            var41[2] = var23 + var27;
                            var41[0] = var8;
                            var41[1] = var24;
                            var11 = var13;
                            var7 = class211.method1413(class106.field1862, -1, var21);
                            int[][] var42 = var20;
                            var13 = 0;
                            var4 = -var6 + var7;
                            var20 = var19;
                            var19 = var42;
                            var8 = 0;
                            int var43 = var4;
                            if (~var4 > -1) {
                                var43 = class106.field1862 + var4;
                            }
                            if (~var43 < ~class106.field1862) {
                                var43 -= class106.field1862;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (var44[0] <= var43 && ~var43 >= ~var44[1]) {
                                    break;
                                }
                                ++var9;
                                if (var11 <= var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var19[var13++];
                            var45[1] = var24;
                            var45[0] = var8;
                            var45[2] = var23 + var27;
                            this.method1224(var21, var22, var27, (byte) -6, var5, var8 - -var7, var23);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "()V")
    public class177() {
        super(0, true);
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(B)V")
    public static final void method1222(byte arg0) {
        class271.field4664 = 0;
        class22.field407 = -1;
        class8.field120 = 0;
        class204.field3493 = -1;
        class209.field3571 = -1;
        class36.field815 = 0;
        class238.field4157 = 0;
        class223.field3830.field647 = 0;
        class120.field2130 = 0;
        class167.field2946 = -1;
        class65.field1288.field647 = 0;
        class247.field4306 = false;
        ++field3102;
        class111.field1952 = 0;
        for (int var1 = 0; class232.field4025.length > var1; ++var1) {
            if (class232.field4025[var1] != null) {
                class232.field4025[var1].field3719 = -1;
            }
        }
        for (int var2 = 0; var2 < class232.field4022.length; ++var2) {
            if (class232.field4022[var2] != null) {
                class232.field4022[var2].field3719 = -1;
            }
        }
        class28.method247(75);
        class163.field2899 = 1;
        class79.method610(30, (byte) 107);
        if (arg0 == 0) {
            for (int var3 = 0; var3 < 100; ++var3) {
                class166.field2941[var3] = true;
            }
            class208.method1394(100);
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(IIIIILqk;IZIILjb;BII)Lqk;")
    public static final class201 method1223(int arg0, int arg1, int arg2, int arg3, int arg4, class201 arg5, int arg6, boolean arg7, int arg8, int arg9, class256 arg10, byte arg11, int arg12, int arg13) {
        ++field3101;
        long var14 = ((long) arg1 << 48) + ((long) ((arg12 << 24) + (arg9 << 16) + arg4) - -((long) arg3 << 32));
        class201 var16 = (class201) class199.field3448.method940(var14, 108);
        if (var16 == null) {
            int[] var17 = new int[] { 64, 96, 128 };
            byte var18;
            if (arg4 != 1) {
                if (arg4 == 2) {
                    var18 = 12;
                } else if (arg4 != 3) {
                    if (arg4 != 4) {
                        var18 = 21;
                    } else {
                        var18 = 18;
                    }
                } else {
                    var18 = 15;
                }
            } else {
                var18 = 9;
            }
            byte var19 = 3;
            int[][] var20 = new int[var19][var18];
            class157 var21 = new class157(var18 * var19 + 1, var18 * var19 * 2 + -var18, 0);
            int var22 = var21.method1100(0, 0, 0);
            for (int var23 = 0; var23 < var19; ++var23) {
                int var30 = var17[var23];
                int var31 = var17[var23];
                for (int var32 = 0; var32 < var18; ++var32) {
                    int var33 = (var32 << 11) / var18;
                    int var34 = class150.field2670[var33] * var31 + arg0 >> 16;
                    int var35 = class150.field2676[var33] * var30 + arg13 >> 16;
                    var20[var23][var32] = var21.method1100(var34, 0, var35);
                }
            }
            for (int var24 = 0; var19 > var24; ++var24) {
                int var25 = (var24 * 256 - -128) / var19;
                int var26 = -var25 + 256;
                short var27 = (short) (((arg1 & 127) * var25 + (127 & arg3) * var26 & 32512) + ((64512 & arg1) * var25 + (arg3 & 64512) * var26 & 16515072) + (229376 & (arg1 & 896) * var25 + (896 & arg3) * var26) >> 8);
                byte var28 = (byte) (arg9 * var26 + arg12 * var25 >> 8);
                for (int var29 = 0; var29 < var18; ++var29) {
                    if (var24 == 0) {
                        var21.method1093(var22, var20[0][(var29 - -1) % var18], var20[0][var29], (byte) 1, var27, var28);
                    } else {
                        var21.method1093(var20[var24 + -1][var29], var20[var24 + -1][(var29 - -1) % var18], var20[var24][(var29 + 1) % var18], (byte) 1, var27, var28);
                        var21.method1093(var20[var24 + -1][var29], var20[var24][(var29 + 1) % var18], var20[var24][var29], (byte) 1, var27, var28);
                    }
                }
            }
            var16 = var21.method1110(64, 768, -50, -10, -50);
            class199.field3448.method937(-39, var16, var14);
        }
        int var36 = arg4 * 64 - 1;
        int var37 = -var36;
        if (arg11 != 1) {
            field3092 = null;
        }
        int var38 = var36;
        int var39 = -var36;
        int var40 = arg5.method160();
        int var41 = arg5.method159();
        int var42 = var36;
        class160 var43 = null;
        int var44 = arg5.method191();
        int var45 = arg5.method167();
        if (arg7) {
            if (~arg8 < -1153 && arg8 < 1920) {
                var42 = var36 + 128;
            }
            if (~arg8 < -641 && arg8 < 1408) {
                var38 = var36 + 128;
            }
            if (~arg8 < -1665 || ~arg8 > -385) {
                var37 -= 128;
            }
            if (~arg8 < -129 && ~arg8 > -897) {
                var39 -= 128;
            }
        }
        if (~var44 > ~var37) {
            var44 = var37;
        }
        if (~var41 < ~var42) {
            var41 = var42;
        }
        if (~var38 > ~var45) {
            var45 = var38;
        }
        if (arg10 != null) {
            int var46 = arg10.field4416[arg6];
            var43 = class209.method1398(var46 >> 16, -32);
            arg6 = var46 & 65535;
        }
        if (var39 > var40) {
            var40 = var39;
        }
        class201 var47;
        if (var43 != null) {
            var47 = var16.method182(!var43.method1131(0, arg6), true);
            var47.method164((-var40 + var41) / 2, 128, (-var44 + var45) / 2);
            var47.method190((var40 + var41) / 2, 0, (var44 - -var45) / 2);
            var47.method172(var43, arg6);
        } else {
            var47 = var16.method182(true, true);
            var47.method164((-var40 + var41) / 2, 128, (-var44 + var45) / 2);
            var47.method190((var40 + var41) / 2, 0, (var44 + var45) / 2);
        }
        if (arg8 != 0) {
            var47.method158(arg8);
        }
        class18 var48 = (class18) var47;
        if (arg2 != class23.method216(-37, arg13 + var44, arg0 + var40, class274.field4798) || class23.method216(-86, arg13 + var45, arg0 + var41, class274.field4798) != arg2) {
            for (int var49 = 0; ~var49 > ~var48.field304; ++var49) {
                var48.field325[var49] += class23.method216(class38.method384(arg11, -90), var48.field321[var49] + arg13, var48.field336[var49] - -arg0, class274.field4798) - arg2;
            }
            var48.field326 = false;
        }
        return var47;
    }

    @OriginalMember(owner = "client!tg", name = "g", descriptor = "(I)V")
    public final void method124(int arg0) {
        if (arg0 != 31) {
            method1227((byte) -119, false);
        }
        ++field3091;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Ljava/util/Random;IIB[[III)V")
    private final void method1224(Random arg0, int arg1, int arg2, byte arg3, int[][] arg4, int arg5, int arg6) {
        ++field3093;
        if (arg3 != -6) {
            field3124 = null;
        }
        int var8 = this.field3119 <= 0 ? 4096 : -class211.method1413(this.field3119, arg3 ^ 5, arg0) + 4096;
        int var9 = this.field3120 * this.field3108 >> 12;
        int var10 = this.field3108 + -(var9 <= 0 ? 0 : class211.method1413(var9, -1, arg0));
        if (~class106.field1862 >= ~arg5) {
            arg5 -= class106.field1862;
        }
        if (~var10 >= -1) {
            if (class106.field1862 < arg1 + arg5) {
                int var11 = -arg5 + class106.field1862;
                for (int var12 = 0; ~var12 > ~arg6; ++var12) {
                    int[] var13 = arg4[arg2 + var12];
                    class171.method1186(var13, arg5, var11, var8);
                    class171.method1186(var13, 0, arg1 - var11, var8);
                }
            } else {
                for (int var14 = 0; ~arg6 < ~var14; ++var14) {
                    class171.method1186(arg4[arg2 + var14], arg5, arg1, var8);
                }
            }
        } else if (arg6 > 0 && ~arg1 < -1) {
            int var15 = arg1 / 2;
            int var16 = arg6 / 2;
            int var17 = var15 >= var10 ? var10 : var15;
            int var18 = arg5 + var17;
            int var19 = arg1 - var17 * 2;
            int var20 = var16 >= var10 ? var10 : var16;
            for (int var21 = 0; ~arg6 < ~var21; ++var21) {
                int[] var22 = arg4[var21 - -arg2];
                if (~var20 < ~var21) {
                    int var23 = var8 * var21 / var20;
                    if (~this.field3107 != -1) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class272.method1817(arg5 + var24, class110.field1937)] = var22[class272.method1817(class110.field1937, arg5 - -arg1 - var24 + -1)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var26 > ~var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class272.method1817(arg5 + var26, class110.field1937)] = var22[class272.method1817(class110.field1937, arg5 - (-arg1 + var26) + -1)] = var23 * var28 >> 12;
                        }
                    }
                    if (class106.field1862 < var18 + var19) {
                        int var27 = class106.field1862 - var18;
                        class171.method1186(var22, var18, var27, var23);
                        class171.method1186(var22, 0, -var27 + var19, var23);
                    } else {
                        class171.method1186(var22, var18, var19, var23);
                    }
                } else {
                    int var29 = -var21 + arg6 + -1;
                    if (~var29 > ~var20) {
                        int var30 = var8 * var29 / var20;
                        if (this.field3107 == 0) {
                            for (int var31 = 0; var17 > var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class272.method1817(arg5 + var31, class110.field1937)] = var22[class272.method1817(class110.field1937, arg5 - -arg1 + -var31 + -1)] = var30 * var32 >> 12;
                            }
                        } else {
                            for (int var33 = 0; var17 > var33; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class272.method1817(arg5 - -var33, class110.field1937)] = var22[class272.method1817(class110.field1937, -var33 + -1 + arg1 + arg5)] = var35 < var30 ? var35 : var30;
                            }
                        }
                        if (class106.field1862 >= var18 + var19) {
                            class171.method1186(var22, var18, var19, var30);
                        } else {
                            int var34 = -var18 + class106.field1862;
                            class171.method1186(var22, var18, var34, var30);
                            class171.method1186(var22, 0, var19 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var17 < ~var36; ++var36) {
                            var22[class272.method1817(arg5 + var36, class110.field1937)] = var22[class272.method1817(arg5 - (-arg1 + var36) + -1, class110.field1937)] = var8 * var36 / var17;
                        }
                        if (class106.field1862 < var18 + var19) {
                            int var37 = -var18 + class106.field1862;
                            class171.method1186(var22, var18, var37, var8);
                            class171.method1186(var22, 0, -var37 + var19, var8);
                        } else {
                            class171.method1186(var22, var18, var19, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(Lie;II)V")
    public final void method122(class32 arg0, int arg1, int arg2) {
        ++field3100;
        if (arg2 != -32513) {
            this.field3117 = 111;
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (~arg1 != -7) {
                                    if (~arg1 != -8) {
                                        if (~arg1 == -9) {
                                            this.field3119 = arg0.method339(-16777216);
                                        }
                                    } else {
                                        this.field3120 = arg0.method339(-16777216);
                                    }
                                } else {
                                    this.field3107 = arg0.method316((byte) -35);
                                }
                            } else {
                                this.field3115 = arg0.method339(arg2 + -16744703);
                            }
                        } else {
                            this.field3117 = arg0.method339(-16777216);
                        }
                    } else {
                        this.field3104 = arg0.method339(-16777216);
                    }
                } else {
                    this.field3121 = arg0.method339(arg2 ^ 16744703);
                }
            } else {
                this.field3097 = arg0.method339(-16777216);
            }
        } else {
            this.field3114 = arg0.method316((byte) -102);
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(Z)V")
    public static final void method1225(boolean arg0) {
        if (!arg0) {
            field3124 = null;
        }
        ++field3110;
        class34.field735.method942(0);
        class232.field4023.method942(0);
        class127.field2215.method942(0);
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(ZZ)V")
    public static final void method1226(boolean arg0, boolean arg1) {
        if (arg0) {
            class271.field4649 = arg1;
            class127.field2225 = !class151.method1033((byte) -112);
            ++field3094;
        }
    }

    @OriginalMember(owner = "client!tg", name = "b", descriptor = "(BZ)V")
    public static final void method1227(byte arg0, boolean arg1) {
        ++field3109;
        if (arg0 != 31) {
            field3116 = null;
        }
        if (class229.field3911.field3710 >> 7 == class36.field815 && ~(class229.field3911.field3700 >> 7) == ~class135.field2345) {
            class36.field815 = 0;
        }
        int var2 = class258.field4439;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            long var4;
            class271 var6;
            if (arg1) {
                var4 = 8791798054912L;
                var6 = class229.field3911;
            } else {
                var4 = (long) class126.field2202[var3] << 32;
                var6 = class232.field4025[class126.field2202[var3]];
            }
            if (var6 != null && var6.method1403((byte) 58)) {
                var6.field4653 = false;
                if ((class13.field227 && class258.field4439 > 200 || class258.field4439 > 50) && !arg1 && ~var6.field3723 == ~var6.field3696) {
                    var6.field4653 = true;
                }
                int var7 = var6.field3700 >> 7;
                int var8 = var6.field3710 >> 7;
                if (var8 >= 0 && var8 < 104 && ~var7 <= -1 && ~var7 > -105) {
                    if (var6.field4659 != null && ~class241.field4246 <= ~var6.field4636 && var6.field4638 > class241.field4246) {
                        var6.field4653 = false;
                        var6.field3695 = class23.method216(-88, var6.field3700, var6.field3710, class274.field4798);
                        class233.method1546(class274.field4798, var6.field3710, var6.field3700, var6.field3695, var6, var6.field3697, var4, var6.field4656, var6.field4672, var6.field4670, var6.field4674);
                    } else {
                        if (var6.method1441((byte) 120) == 1 && (127 & var6.field3710) == 64 && (var6.field3700 & 127) == 64) {
                            if (class241.field4232[var8][var7] == class152.field2698) {
                                continue;
                            }
                            class241.field4232[var8][var7] = class152.field2698;
                        }
                        var6.field3695 = class23.method216(-12, var6.field3700, var6.field3710, class274.field4798);
                        class185.method1269(class274.field4798, var6.field3710, var6.field3700, var6.field3695, var6.method1441((byte) 82) * 64 - 4, var6, var6.field3697, var4, var6.field3675);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!tg", name = "i", descriptor = "(I)V")
    public static final void method1228(int arg0) {
        for (int var1 = arg0; var1 < class258.field4439; ++var1) {
            int var5;
            if (var1 != -1) {
                var5 = class126.field2202[var1];
            } else {
                var5 = 2047;
            }
            class271 var6 = class232.field4025[var5];
            if (var6 != null && var6.field3694 > 0) {
                --var6.field3694;
                if (~var6.field3694 == -1) {
                    var6.field3713 = null;
                }
            }
        }
        ++field3099;
        for (int var2 = 0; class89.field1636 > var2; ++var2) {
            int var3 = class263.field4498[var2];
            class210 var4 = class232.field4022[var3];
            if (var4 != null && ~var4.field3694 < -1) {
                --var4.field3694;
                if (~var4.field3694 == -1) {
                    var4.field3713 = null;
                }
            }
        }
    }
}
