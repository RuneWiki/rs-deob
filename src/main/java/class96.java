import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pia")
public class class96 extends class601 {

    @OriginalMember(owner = "client!pia", name = "D", descriptor = "I")
    private int field1178 = 1024;

    @OriginalMember(owner = "client!pia", name = "E", descriptor = "I")
    private int field1179 = 1024;

    @OriginalMember(owner = "client!pia", name = "K", descriptor = "I")
    private int field1183 = 1024;

    @OriginalMember(owner = "client!pia", name = "P", descriptor = "I")
    private int field1187 = 1024;

    @OriginalMember(owner = "client!pia", name = "J", descriptor = "I")
    private int field1182 = 2048;

    @OriginalMember(owner = "client!pia", name = "G", descriptor = "I")
    private int field1180 = 409;

    @OriginalMember(owner = "client!pia", name = "Q", descriptor = "I")
    private int field1188 = 819;

    @OriginalMember(owner = "client!pia", name = "R", descriptor = "I")
    private int field1189 = 0;

    @OriginalMember(owner = "client!pia", name = "L", descriptor = "I")
    private int field1184 = 0;

    @OriginalMember(owner = "client!pia", name = "C", descriptor = "[[I")
    public static int[][] field1177 = new int[6][];

    @OriginalMember(owner = "client!pia", name = "S", descriptor = "Lqr;")
    public static class65 field1190 = new class65(50);

    @OriginalMember(owner = "client!pia", name = "H", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!pia", name = "N", descriptor = "I")
    public static int field1185;

    @OriginalMember(owner = "client!pia", name = "O", descriptor = "I")
    public static int field1186;

    @OriginalMember(owner = "client!pia", name = "T", descriptor = "I")
    private int field1191;

    @OriginalMember(owner = "client!pia", name = "U", descriptor = "I")
    public static int field1192;

    @OriginalMember(owner = "client!pia", name = "V", descriptor = "I")
    public static int field1193;

    @OriginalMember(owner = "client!pia", name = "e", descriptor = "(I)V")
    public static void method720(int arg0) {
        field1190 = null;
        field1177 = null;
        if (arg0 != 2) {
            method721((byte) -50);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(B)V")
    public static final void method721(byte arg0) {
        if (arg0 >= 27) {
            ++field1193;
            class731.field10136.method23(10);
            class18.field243 = 0;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(Lee;BI)V")
    public final void method6(class677 arg0, byte arg1, int arg2) {
        ++field1192;
        if (arg1 != -61) {
            this.field1189 = -85;
        }
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 != 4) {
                            if (arg2 != 5) {
                                if (~arg2 != -7) {
                                    if (arg2 != 7) {
                                        if (~arg2 == -9) {
                                            this.field1179 = arg0.method3807(-1);
                                        }
                                    } else {
                                        this.field1183 = arg0.method3807(arg1 ^ 60);
                                    }
                                } else {
                                    this.field1184 = arg0.method3821((byte) 79);
                                }
                            } else {
                                this.field1187 = arg0.method3807(-1);
                            }
                        } else {
                            this.field1188 = arg0.method3807(-1);
                        }
                    } else {
                        this.field1180 = arg0.method3807(arg1 ^ 60);
                    }
                } else {
                    this.field1182 = arg0.method3807(-1);
                }
            } else {
                this.field1178 = arg0.method3807(-1);
            }
        } else {
            this.field1189 = arg0.method3821((byte) 90);
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(BI)[I")
    public final int[] method5(byte arg0, int arg1) {
        ++field1185;
        int[] var3 = super.field7902.method382(arg1, true);
        if (arg0 != -40) {
            return null;
        } else if (super.field7902.field704) {
            int[][] var4 = super.field7902.method383((byte) -64);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class171.field2624 * this.field1178 >> 12;
            int var15 = class171.field2624 * this.field1182 >> 12;
            int var16 = class671.field9149 * this.field1180 >> 12;
            int var17 = class671.field9149 * this.field1188 >> 12;
            if (~var17 >= -2) {
                return var4[arg1];
            } else {
                this.field1191 = class171.field2624 / 8 * this.field1187 >> 12;
                int var18 = class171.field2624 / var14 + 1;
                int[][] var19 = new int[var18][3];
                int[][] var20 = new int[var18][3];
                Random var21 = new Random((long) this.field1189);
                while (true) {
                    while (true) {
                        int var22 = var14 + class309.method1906(var15 - var14, arg0 + 39, var21);
                        int var23 = var16 - -class309.method1906(-var16 + var17, -1, var21);
                        int var24 = var8 + var22;
                        if (~var24 < ~class171.field2624) {
                            var22 = -var8 + class171.field2624;
                            var24 = class171.field2624;
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
                                var28 += class171.field2624;
                            }
                            if (~var28 < ~class171.field2624) {
                                var28 -= class171.field2624;
                            }
                            while (true) {
                                int[] var29 = var20[var25];
                                if (var28 >= var29[0] && ~var28 >= ~var29[1]) {
                                    var30 = var26[2];
                                    if (~var9 != ~var25) {
                                        int var31 = var5 + var8;
                                        if (var31 < 0) {
                                            var31 += class171.field2624;
                                        }
                                        if (~class171.field2624 > ~var31) {
                                            var31 -= class171.field2624;
                                        }
                                        for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                            int[] var40 = var20[(var9 + var32) % var12];
                                            var30 = Math.max(var30, var40[2]);
                                        }
                                        for (int var33 = 0; var27 >= var33; ++var33) {
                                            int[] var34 = var20[(var9 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var30 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var28 < ~var31) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = Math.min(var28, var37);
                                                } else if (var36 != 0) {
                                                    var38 = Math.max(var31, var36);
                                                    var39 = class171.field2624;
                                                } else {
                                                    var38 = 0;
                                                    var39 = Math.min(var28, var37);
                                                }
                                                this.method722(var4, var7 + var38, var35, -var38 + var39, var21, -var35 + var30, 7239);
                                            }
                                        }
                                    }
                                    var9 = var25;
                                    break;
                                }
                                ++var25;
                                if (~var25 <= ~var12) {
                                    var25 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (~class671.field9149 > ~(var23 + var30)) {
                            var23 = -var30 + class671.field9149;
                        } else {
                            var10 = false;
                        }
                        if (~class171.field2624 != ~var24) {
                            int[] var41 = var19[var13++];
                            var41[0] = var8;
                            var41[1] = var24;
                            var41[2] = var23 + var30;
                            this.method722(var4, var8 - -var6, var30, var22, var21, var23, 7239);
                            var8 = var24;
                        } else {
                            this.method722(var4, var8 - -var6, var30, var22, var21, var23, 7239);
                            if (var10) {
                                return var3;
                            }
                            var10 = true;
                            int[] var42 = var19[var13++];
                            var42[2] = var30 - -var23;
                            var42[1] = var24;
                            var42[0] = var8;
                            int[][] var43 = var20;
                            var20 = var19;
                            var12 = var13;
                            var19 = var43;
                            var13 = 0;
                            var7 = var6;
                            var6 = class309.method1906(class171.field2624, -1, var21);
                            var5 = -var7 + var6;
                            var8 = 0;
                            int var44 = var5;
                            if (~var5 > -1) {
                                var44 = class171.field2624 + var5;
                            }
                            if (~var44 < ~class171.field2624) {
                                var44 -= class171.field2624;
                            }
                            var9 = 0;
                            while (true) {
                                int[] var45 = var20[var9];
                                if (var44 >= var45[0] && ~var44 >= ~var45[1]) {
                                    var11 = false;
                                    break;
                                }
                                ++var9;
                                if (~var9 <= ~var12) {
                                    var9 = 0;
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

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "(I)V")
    public final void method108(int arg0) {
        ++field1186;
        if (arg0 != 8351) {
            this.field1188 = -34;
        }
    }

    @OriginalMember(owner = "client!pia", name = "a", descriptor = "([[IIIILjava/util/Random;II)V")
    private final void method722(int[][] arg0, int arg1, int arg2, int arg3, Random arg4, int arg5, int arg6) {
        ++field1181;
        int var8 = this.field1179 <= 0 ? 4096 : -class309.method1906(this.field1179, -1, arg4) + 4096;
        int var9 = this.field1191 * this.field1183 >> 12;
        if (arg6 != 7239) {
            field1177 = null;
        }
        int var10 = this.field1191 + -(~var9 < -1 ? class309.method1906(var9, -1, arg4) : 0);
        if (~arg1 <= ~class171.field2624) {
            arg1 -= class171.field2624;
        }
        if (~var10 < -1) {
            if (arg5 > 0 && arg3 > 0) {
                int var11 = arg3 / 2;
                int var12 = arg5 / 2;
                int var13 = ~var11 > ~var10 ? var11 : var10;
                int var14 = ~var10 < ~var12 ? var12 : var10;
                int var15 = arg1 - -var13;
                int var16 = -(var13 * 2) + arg3;
                for (int var17 = 0; ~arg5 < ~var17; ++var17) {
                    int[] var18 = arg0[arg2 + var17];
                    if (~var17 > ~var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field1184 != -1) {
                            for (int var20 = 0; var13 > var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class48.method346(class445.field6116, arg1 + var20)] = var18[class48.method346(class445.field6116, -var20 + arg1 + arg3 + -1)] = ~var21 <= ~var19 ? var19 : var21;
                            }
                        } else {
                            for (int var22 = 0; ~var13 < ~var22; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class48.method346(arg1 + var22, class445.field6116)] = var18[class48.method346(arg1 + -1 + arg3 + -var22, class445.field6116)] = var19 * var24 >> 12;
                            }
                        }
                        if (~class171.field2624 > ~(var15 + var16)) {
                            int var23 = -var15 + class171.field2624;
                            class335.method2021(var18, var15, var23, var19);
                            class335.method2021(var18, 0, -var23 + var16, var19);
                        } else {
                            class335.method2021(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg5 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (~this.field1184 == -1) {
                                for (int var27 = 0; var13 > var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class48.method346(arg1 + var27, class445.field6116)] = var18[class48.method346(class445.field6116, -var27 - 1 + arg1 + arg3)] = var26 * var28 >> 12;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class48.method346(arg1 + var29, class445.field6116)] = var18[class48.method346(class445.field6116, -var29 - 1 + arg1 + arg3)] = var31 < var26 ? var31 : var26;
                                }
                            }
                            if (~class171.field2624 > ~(var15 + var16)) {
                                int var30 = -var15 + class171.field2624;
                                class335.method2021(var18, var15, var30, var26);
                                class335.method2021(var18, 0, -var30 + var16, var26);
                            } else {
                                class335.method2021(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; ~var32 > ~var13; ++var32) {
                                var18[class48.method346(class445.field6116, arg1 + var32)] = var18[class48.method346(class445.field6116, -var32 + arg3 + arg1 + -1)] = var8 * var32 / var13;
                            }
                            if (class171.field2624 < var15 + var16) {
                                int var33 = -var15 + class171.field2624;
                                class335.method2021(var18, var15, var33, var8);
                                class335.method2021(var18, 0, -var33 + var16, var8);
                            } else {
                                class335.method2021(var18, var15, var16, var8);
                            }
                        }
                    }
                }
            }
        } else if (~class171.field2624 <= ~(arg1 + arg3)) {
            for (int var34 = 0; var34 < arg5; ++var34) {
                class335.method2021(arg0[arg2 + var34], arg1, arg3, var8);
            }
        } else {
            int var35 = class171.field2624 - arg1;
            for (int var36 = 0; ~var36 > ~arg5; ++var36) {
                int[] var37 = arg0[arg2 + var36];
                class335.method2021(var37, arg1, var35, var8);
                class335.method2021(var37, 0, -var35 + arg3, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pia", name = "<init>", descriptor = "()V")
    public class96() {
        super(0, true);
    }
}
