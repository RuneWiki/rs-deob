import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class59 extends class205 {

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    private int field1092 = 1024;

    @OriginalMember(owner = "client!fd", name = "hb", descriptor = "I")
    private int field1101 = 1024;

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    private int field1089 = 2048;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    private int field1095 = 0;

    @OriginalMember(owner = "client!fd", name = "ib", descriptor = "I")
    private int field1102 = 409;

    @OriginalMember(owner = "client!fd", name = "mb", descriptor = "I")
    private int field1106 = 819;

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "I")
    private int field1093 = 1024;

    @OriginalMember(owner = "client!fd", name = "pb", descriptor = "I")
    private int field1109 = 0;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    private int field1094 = 1024;

    @OriginalMember(owner = "client!fd", name = "fb", descriptor = "I")
    public static int field1099 = 0;

    @OriginalMember(owner = "client!fd", name = "eb", descriptor = "I")
    public static int field1098 = 1;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "Lvd;")
    public static class222 field1091 = class212.method1357("(U0a )2 in: ", 10731);

    @OriginalMember(owner = "client!fd", name = "kb", descriptor = "Lvd;")
    private static class222 field1104 = class212.method1357("OFF", 10731);

    @OriginalMember(owner = "client!fd", name = "lb", descriptor = "[I")
    public static int[] field1105 = new int[1000];

    @OriginalMember(owner = "client!fd", name = "qb", descriptor = "Lvd;")
    public static class222 field1110 = field1104;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "I")
    public static int field1090;

    @OriginalMember(owner = "client!fd", name = "db", descriptor = "I")
    public static int field1097;

    @OriginalMember(owner = "client!fd", name = "gb", descriptor = "I")
    public static int field1100;

    @OriginalMember(owner = "client!fd", name = "jb", descriptor = "I")
    public static int field1103;

    @OriginalMember(owner = "client!fd", name = "nb", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!fd", name = "ob", descriptor = "I")
    private int field1108;

    @OriginalMember(owner = "client!fd", name = "sb", descriptor = "I")
    public static int field1112;

    @OriginalMember(owner = "client!fd", name = "tb", descriptor = "I")
    public static int field1113;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "Lle;")
    public static class123 field1096;

    @OriginalMember(owner = "client!fd", name = "rb", descriptor = "[Lbg;")
    public static class19[] field1111;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Lka;BI)V")
    public final void method2(class109 arg0, byte arg1, int arg2) {
        int var4 = -22 / ((arg1 - -47) / 34);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (~arg2 != -8) {
                                        if (~arg2 == -9) {
                                            this.field1101 = arg0.method675(2);
                                        }
                                    } else {
                                        this.field1094 = arg0.method675(2);
                                    }
                                } else {
                                    this.field1095 = arg0.method662((byte) -107);
                                }
                            } else {
                                this.field1092 = arg0.method675(2);
                            }
                        } else {
                            this.field1106 = arg0.method675(2);
                        }
                    } else {
                        this.field1102 = arg0.method675(2);
                    }
                } else {
                    this.field1089 = arg0.method675(2);
                }
            } else {
                this.field1093 = arg0.method675(2);
            }
        } else {
            this.field1109 = arg0.method662((byte) -84);
        }
        ++field1097;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (!arg0) {
            ++field1103;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II[[IIIILjava/util/Random;)V")
    private final void method423(int arg0, int arg1, int[][] arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field1090;
        int var8 = ~this.field1101 < -1 ? -class217.method1384(Integer.MIN_VALUE, this.field1101, arg6) + 4096 : 4096;
        if (arg0 != -1265338036) {
            field1091 = null;
        }
        int var9 = this.field1108 * this.field1094 >> 12;
        int var10 = this.field1108 + -(~var9 >= -1 ? 0 : class217.method1384(Integer.MIN_VALUE, var9, arg6));
        if (arg1 >= class118.field2245) {
            arg1 -= class118.field2245;
        }
        if (~var10 >= -1) {
            if (class118.field2245 < arg1 + arg3) {
                int var11 = class118.field2245 - arg1;
                for (int var12 = 0; arg5 > var12; ++var12) {
                    int[] var13 = arg2[arg4 - -var12];
                    class163.method1027(var13, arg1, var11, var8);
                    class163.method1027(var13, 0, arg3 - var11, var8);
                }
            } else {
                for (int var14 = 0; ~var14 > ~arg5; ++var14) {
                    class163.method1027(arg2[arg4 + var14], arg1, arg3, var8);
                }
            }
        } else if (arg5 > 0 && arg3 > 0) {
            int var15 = arg3 / 2;
            int var16 = var15 >= var10 ? var10 : var15;
            int var17 = arg5 / 2;
            int var18 = arg1 - -var16;
            int var19 = -(var16 * 2) + arg3;
            int var20 = ~var17 > ~var10 ? var17 : var10;
            for (int var21 = 0; ~var21 > ~arg5; ++var21) {
                int[] var22 = arg2[arg4 + var21];
                if (var21 < var20) {
                    int var23 = var8 * var21 / var20;
                    if (~this.field1095 != -1) {
                        for (int var24 = 0; var16 > var24; ++var24) {
                            int var25 = var8 * var24 / var16;
                            var22[class139.method876(arg1 + var24, class159.field3039)] = var22[class139.method876(arg1 - (-arg3 + var24) - 1, class159.field3039)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; ~var16 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var16;
                            var22[class139.method876(class159.field3039, arg1 + var26)] = var22[class139.method876(-var26 + arg3 + arg1 + -1, class159.field3039)] = var23 * var28 >> 12;
                        }
                    }
                    if (var18 + var19 <= class118.field2245) {
                        class163.method1027(var22, var18, var19, var23);
                    } else {
                        int var27 = -var18 + class118.field2245;
                        class163.method1027(var22, var18, var27, var23);
                        class163.method1027(var22, 0, var19 - var27, var23);
                    }
                } else {
                    int var29 = -var21 + arg5 + -1;
                    if (var20 > var29) {
                        int var30 = var8 * var29 / var20;
                        if (this.field1095 != 0) {
                            for (int var31 = 0; var31 < var16; ++var31) {
                                int var32 = var8 * var31 / var16;
                                var22[class139.method876(arg1 + var31, class159.field3039)] = var22[class139.method876(class159.field3039, -var31 + arg3 + -1 + arg1)] = ~var30 >= ~var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var33 < var16; ++var33) {
                                int var35 = var8 * var33 / var16;
                                var22[class139.method876(class159.field3039, arg1 + var33)] = var22[class139.method876(class159.field3039, arg1 - -arg3 - var33 + -1)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class118.field2245 > ~(var18 - -var19)) {
                            int var34 = class118.field2245 - var18;
                            class163.method1027(var22, var18, var34, var30);
                            class163.method1027(var22, 0, var19 - var34, var30);
                        } else {
                            class163.method1027(var22, var18, var19, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var16 < ~var36; ++var36) {
                            var22[class139.method876(arg1 + var36, class159.field3039)] = var22[class139.method876(class159.field3039, -var36 + -1 + arg1 + arg3)] = var8 * var36 / var16;
                        }
                        if (~class118.field2245 <= ~(var18 + var19)) {
                            class163.method1027(var22, var18, var19, var8);
                        } else {
                            int var37 = -var18 + class118.field2245;
                            class163.method1027(var22, var18, var37, var8);
                            class163.method1027(var22, 0, -var37 + var19, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIBIII)V")
    public static final void method424(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6) {
        ++field1112;
        class46.method339(1536, arg6);
        int var7 = 0;
        int var8 = -arg2 + arg6;
        int var9 = -arg6;
        if (var8 < 0) {
            var8 = 0;
        }
        int var10 = arg6;
        int var11 = -var8;
        int var12 = var8;
        int var13 = -1;
        int[] var14 = class156.field2981[arg4];
        int var15 = -1;
        int var16 = arg5 + var8;
        int var17 = -var8 + arg5;
        class81.method532(-arg6 + arg5, arg1, var14, var17, arg3 ^ -110);
        class81.method532(var17, arg0, var14, var16, -7);
        if (arg3 != 107) {
            method425(-24);
        }
        class81.method532(var16, arg1, var14, arg5 + arg6, -7);
        while (~var10 < ~var7) {
            var15 += 2;
            var13 += 2;
            var9 += var15;
            var11 += var13;
            if (~var11 <= -1 && var12 >= 1) {
                class92.field1730[var12] = var7;
                --var12;
                var11 -= var12 << 1;
            }
            ++var7;
            if (~var9 <= -1) {
                --var10;
                if (var8 <= var10) {
                    int[] var18 = class156.field2981[-var10 + arg4];
                    int var19 = arg5 - var7;
                    int var20 = arg5 + var7;
                    int[] var21 = class156.field2981[arg4 + var10];
                    class81.method532(var19, arg1, var21, var20, -7);
                    class81.method532(var19, arg1, var18, var20, arg3 + -114);
                } else {
                    int[] var22 = class156.field2981[arg4 - -var10];
                    int[] var23 = class156.field2981[arg4 - var10];
                    int var24 = class92.field1730[var10];
                    int var25 = arg5 + var7;
                    int var26 = arg5 - var7;
                    int var27 = arg5 - -var24;
                    int var28 = -var24 + arg5;
                    class81.method532(var26, arg1, var22, var28, -7);
                    class81.method532(var28, arg0, var22, var27, arg3 + -114);
                    class81.method532(var27, arg1, var22, var25, -7);
                    class81.method532(var26, arg1, var23, var28, -7);
                    class81.method532(var28, arg0, var23, var27, -7);
                    class81.method532(var27, arg1, var23, var25, -7);
                }
                var9 -= var10 << 1;
            }
            int[] var29 = class156.field2981[arg4 + var7];
            int var30 = arg5 + var10;
            int[] var31 = class156.field2981[-var7 + arg4];
            int var32 = arg5 - var10;
            if (~var8 >= ~var7) {
                class81.method532(var32, arg1, var29, var30, -7);
                class81.method532(var32, arg1, var31, var30, -7);
            } else {
                int var33 = ~var12 <= ~var7 ? var12 : class92.field1730[var7];
                int var34 = -var33 + arg5;
                int var35 = arg5 + var33;
                class81.method532(var32, arg1, var29, var34, -7);
                class81.method532(var34, arg0, var29, var35, -7);
                class81.method532(var35, arg1, var29, var30, -7);
                class81.method532(var32, arg1, var31, var34, -7);
                class81.method532(var34, arg0, var31, var35, -7);
                class81.method532(var35, arg1, var31, var30, arg3 + -114);
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)[I")
    public final int[] method4(int arg0, int arg1) {
        ++field1113;
        int[] var3 = super.field3810.method557(6978, arg1);
        if (arg0 != 0) {
            this.method2((class109) null, (byte) -70, -24);
        }
        if (super.field3810.field1635) {
            int[][] var4 = super.field3810.method554(-5038);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class118.field2245 * this.field1093 >> 12;
            int var15 = class118.field2245 * this.field1089 >> 12;
            int var16 = class134.field2598 * this.field1106 >> 12;
            int var17 = class134.field2598 * this.field1102 >> 12;
            if (var16 <= 1) {
                return var4[arg1];
            } else {
                this.field1108 = class118.field2245 / 8 * this.field1092 >> 12;
                int var18 = class118.field2245 / var14 + 1;
                Random var19 = new Random((long) this.field1109);
                int[][] var20 = new int[var18][3];
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = class217.method1384(Integer.MIN_VALUE, var15 - var14, var19) + var14;
                        int var23 = var17 - -class217.method1384(Integer.MIN_VALUE, -var17 + var16, var19);
                        int var24 = var8 + var22;
                        if (class118.field2245 < var24) {
                            var22 = -var8 + class118.field2245;
                            var24 = class118.field2245;
                        }
                        int var26;
                        if (var10) {
                            var26 = 0;
                        } else {
                            int[] var25 = var20[var9];
                            var26 = var25[2];
                            int var27 = 0;
                            int var28 = var9;
                            int var29 = var5 + var24;
                            if (var29 < 0) {
                                var29 += class118.field2245;
                            }
                            if (var29 > class118.field2245) {
                                var29 -= class118.field2245;
                            }
                            while (true) {
                                int[] var30 = var20[var28];
                                if (~var29 <= ~var30[0] && ~var30[1] <= ~var29) {
                                    if (var9 != var28) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class118.field2245;
                                        }
                                        if (~var31 < ~class118.field2245) {
                                            var31 -= class118.field2245;
                                        }
                                        for (int var32 = 1; var32 <= var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var13];
                                            var26 = Math.max(var26, var40[2]);
                                        }
                                        for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                            int[] var34 = var20[(var9 - -var33) % var13];
                                            int var35 = var34[2];
                                            if (~var26 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var31 > ~var29) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var29, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class118.field2245;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var29, var37);
                                                }
                                                this.method423(-1265338036, var7 + var38, var4, var39 - var38, var35, -var35 + var26, var19);
                                            }
                                        }
                                    }
                                    var9 = var28;
                                    break;
                                }
                                ++var28;
                                if (var28 >= var13) {
                                    var28 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (var23 + var26 > class134.field2598) {
                            var23 = -var26 + class134.field2598;
                        } else {
                            var11 = false;
                        }
                        if (~class118.field2245 == ~var24) {
                            this.method423(-1265338036, var6 + var8, var4, var22, var26, var23, var19);
                            if (var11) {
                                return var3;
                            }
                            var11 = true;
                            var10 = false;
                            int[] var41 = var21[var12++];
                            var41[1] = var24;
                            var7 = var6;
                            var13 = var12;
                            var41[0] = var8;
                            var12 = 0;
                            var8 = 0;
                            var41[2] = var23 + var26;
                            var6 = class217.method1384(Integer.MIN_VALUE, class118.field2245, var19);
                            var9 = 0;
                            var5 = -var7 + var6;
                            int[][] var42 = var20;
                            var20 = var21;
                            int var43 = var5;
                            if (var5 < 0) {
                                var43 = class118.field2245 + var5;
                            }
                            var21 = var42;
                            if (var43 > class118.field2245) {
                                var43 -= class118.field2245;
                            }
                            while (true) {
                                int[] var44 = var20[var9];
                                if (~var44[0] >= ~var43 && var44[1] >= var43) {
                                    break;
                                }
                                int var10000 = ~var13;
                                ++var9;
                                if (var10000 >= ~var9) {
                                    var9 = 0;
                                }
                            }
                        } else {
                            int[] var45 = var21[var12++];
                            var45[0] = var8;
                            var45[2] = var23 + var26;
                            var45[1] = var24;
                            this.method423(-1265338036, var6 + var8, var4, var22, var26, var23, var19);
                            var8 = var24;
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V")
    public class59() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "(I)V")
    public static void method425(int arg0) {
        field1110 = null;
        field1105 = null;
        if (arg0 != 15236) {
            method425(-6);
        }
        field1096 = null;
        field1104 = null;
        field1111 = null;
        field1091 = null;
    }
}
