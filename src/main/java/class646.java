import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sfa")
public class class646 extends class665 {

    @OriginalMember(owner = "client!sfa", name = "x", descriptor = "Lvfa;")
    private class623 field9077;

    @OriginalMember(owner = "client!sfa", name = "q", descriptor = "Lok;")
    private class228 field9070;

    @OriginalMember(owner = "client!sfa", name = "n", descriptor = "Lrc;")
    private class498 field9067;

    @OriginalMember(owner = "client!sfa", name = "E", descriptor = "I")
    private int field9084;

    @OriginalMember(owner = "client!sfa", name = "s", descriptor = "I")
    private int field9072;

    @OriginalMember(owner = "client!sfa", name = "D", descriptor = "I")
    private int field9083;

    @OriginalMember(owner = "client!sfa", name = "A", descriptor = "I")
    private int field9080;

    @OriginalMember(owner = "client!sfa", name = "u", descriptor = "[[F")
    private float[][] field9074;

    @OriginalMember(owner = "client!sfa", name = "y", descriptor = "[[F")
    private float[][] field9078;

    @OriginalMember(owner = "client!sfa", name = "o", descriptor = "[[F")
    private float[][] field9068;

    @OriginalMember(owner = "client!sfa", name = "z", descriptor = "I")
    private int field9079;

    @OriginalMember(owner = "client!sfa", name = "r", descriptor = "Lmo;")
    private class695 field9071;

    @OriginalMember(owner = "client!sfa", name = "t", descriptor = "Lpd;")
    private class231 field9073;

    @OriginalMember(owner = "client!sfa", name = "G", descriptor = "Lkea;")
    private class213 field9086;

    @OriginalMember(owner = "client!sfa", name = "w", descriptor = "Lvu;")
    private class306 field9076;

    @OriginalMember(owner = "client!sfa", name = "C", descriptor = "Lcd;")
    private class283 field9082;

    @OriginalMember(owner = "client!sfa", name = "l", descriptor = "Llq;")
    private class512 field9065;

    @OriginalMember(owner = "client!sfa", name = "v", descriptor = "Llq;")
    private class512 field9075;

    @OriginalMember(owner = "client!sfa", name = "k", descriptor = "I")
    private int field9064;

    @OriginalMember(owner = "client!sfa", name = "m", descriptor = "I")
    public static int field9066;

    @OriginalMember(owner = "client!sfa", name = "p", descriptor = "I")
    public static int field9069;

    @OriginalMember(owner = "client!sfa", name = "B", descriptor = "I")
    public static int field9081;

    @OriginalMember(owner = "client!sfa", name = "F", descriptor = "I")
    public static int field9085;

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIII[[Z)V")
    public final void method3584(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field9066++;
        if (this.field9076 == null || (arg1 + arg2) < this.field9084) {
            return;
        }
        if (arg0 != 0) {
            this.method3584(95, -67, 58, -74, null);
        }
        if (arg1 - arg2 > this.field9072 || (arg2 + arg3) < this.field9083 || (arg3 - arg2) > this.field9080) {
            return;
        }
        for (int var6 = this.field9083; var6 <= this.field9080; var6++) {
            for (int var7 = this.field9084; var7 <= this.field9072; var7++) {
                int var8 = var7 - arg1;
                int var9 = var6 - arg3;
                if (var8 > -arg2 && var8 < arg2 && var9 > -arg2 && arg2 > var9 && arg4[var8 + arg2][var9 + arg2]) {
                    this.field9070.method1520((byte) -71, (int) (this.field9067.method2876(1) * 255.0F) << 24);
                    this.field9070.method1562((byte) -12, null, null, this.field9075, this.field9065);
                    this.field9070.method1522((byte) 31, 0, 4, this.field9076, this.field9079);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IS)V")
    private final void method3585(int arg0, short arg1) {
        if (this.field9070.field3514) {
            this.field9071.method3852(false, arg1);
        } else {
            this.field9071.method3843(arg1, true);
        }
        field9085++;
        int var3 = -111 % ((arg0 + 52) / 47);
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(IIIIIII)V")
    private final void method3586(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field9069++;
        long var8 = -1L;
        int var10 = (arg3 << this.field9077.field625) + arg5;
        int var11 = (arg1 << this.field9077.field625) + arg6;
        int var12 = this.field9077.method442(var10, true, var11);
        if ((arg5 & 0x7F) == 0 || (arg6 & 0x7F) == 0) {
            var8 = (long) var10 & 0xFFFFL | 0xFFFFL << 16 & (long) var11 << 16;
            class665 var13 = this.field9086.method1405(var8, (byte) -117);
            if (var13 != null) {
                this.method3585(-118, ((class134) var13).field1974);
                return;
            }
        }
        short var14 = (short) (this.field9064++);
        if (var8 != -1L) {
            this.field9086.method1403((byte) -18, new class134(var14), var8);
        }
        float var15;
        float var16;
        float var17;
        if (arg5 == 0 && arg6 == 0) {
            var15 = this.field9074[arg2][arg4];
            var16 = this.field9068[arg2][arg4];
            var17 = this.field9078[arg2][arg4];
        } else if (this.field9077.field629 == arg5 && arg6 == 0) {
            var16 = this.field9068[arg2 + 1][arg4];
            var17 = this.field9078[arg2 + 1][arg4];
            var15 = this.field9074[arg2 + 1][arg4];
        } else if (this.field9077.field629 == arg5 && this.field9077.field629 == arg6) {
            var15 = this.field9074[arg2 + 1][arg4 + 1];
            var16 = this.field9068[arg2 + 1][arg4 + 1];
            var17 = this.field9078[arg2 + 1][arg4 + 1];
        } else if (arg5 == 0 && this.field9077.field629 == arg6) {
            var17 = this.field9078[arg2][arg4 + 1];
            var15 = this.field9074[arg2][arg4 + 1];
            var16 = this.field9068[arg2][arg4 + 1];
        } else {
            float var18 = (float) arg5 / (float) this.field9077.field629;
            float var19 = (float) arg6 / (float) this.field9077.field629;
            float var20 = this.field9078[arg2][arg4];
            float var21 = this.field9074[arg2][arg4];
            float var22 = this.field9068[arg2][arg4];
            float var23 = this.field9078[arg2 + 1][arg4];
            float var24 = this.field9074[arg2 + 1][arg4];
            float var25 = (this.field9074[arg2 + 1][arg4 + 1] - var24) * var18 + var24;
            float var26 = (this.field9078[arg2][arg4 + 1] - var20) * var18 + var20;
            float var27 = this.field9068[arg2 + 1][arg4];
            float var28 = (this.field9068[arg2][arg4 + 1] - var22) * var18 + var22;
            float var29 = (this.field9078[arg2 + 1][arg4 + 1] - var23) * var18 + var23;
            float var30 = (this.field9074[arg2][arg4 + 1] - var21) * var18 + var21;
            var17 = (var29 - var26) * var19 + var26;
            var15 = (var25 - var30) * var19 + var30;
            float var31 = (this.field9068[arg2 + 1][arg4 + 1] - var27) * var18 + var27;
            var16 = (var31 - var28) * var19 + var28;
        }
        float var32 = (float) (this.field9067.method2883(126) - var10);
        float var33 = (float) (this.field9067.method2877(-1) - var12);
        float var34 = (float) (this.field9067.method2875(true) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field9067.method2880(-15);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var16 * var39 + var15 * var38 + var17 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field9067.method2878((byte) -111);
        int var45 = (int) ((float) (var44 >> 16 & 0xFF) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) ((var44 & 0xFF0E) >> 8) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field9070.field3514) {
            this.field9073.method1592(false, (float) var10);
            this.field9073.method1592(false, (float) var12);
            this.field9073.method1592(false, (float) var11);
        } else {
            this.field9073.method1593((byte) 38, (float) var10);
            this.field9073.method1593((byte) 27, (float) var12);
            this.field9073.method1593((byte) 72, (float) var11);
        }
        this.field9073.method3853((byte) 51, var45);
        if (arg0 > 80) {
            this.field9073.method3853((byte) 51, var46);
            this.field9073.method3853((byte) 51, var47);
            this.field9073.method3853((byte) 51, 255);
            this.method3585(-105, var14);
        }
    }

    @OriginalMember(owner = "client!sfa", name = "a", descriptor = "(B)V")
    public static final void method3587(byte arg0) {
        if (arg0 <= -113) {
            class367.field5244 = true;
            field9081++;
        }
    }

    @OriginalMember(owner = "client!sfa", name = "<init>", descriptor = "(Lok;Lvfa;Lrc;[I)V")
    public class646(class228 arg0, class623 arg1, class498 arg2, int[] arg3) {
        this.field9077 = arg1;
        this.field9070 = arg0;
        this.field9067 = arg2;
        int var5 = this.field9067.method2880(-15) - (arg1.field629 >> 1);
        this.field9084 = this.field9067.method2883(127) - var5 >> arg1.field625;
        this.field9072 = this.field9067.method2883(126) + var5 >> arg1.field625;
        this.field9083 = this.field9067.method2875(true) - var5 >> arg1.field625;
        this.field9080 = var5 + this.field9067.method2875(true) >> arg1.field625;
        int var6 = this.field9072 + 1 - this.field9084;
        int var7 = this.field9080 + 1 - this.field9083;
        this.field9074 = new float[var6 + 1][var7 + 1];
        this.field9078 = new float[var6 + 1][var7 + 1];
        this.field9068 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var25 = var8 + this.field9083;
            if (var25 > 0 && var25 < this.field9077.field632 - 1) {
                for (int var26 = 0; var26 <= var6; var26++) {
                    int var27 = this.field9084 + var26;
                    if (var27 > 0 && var27 < this.field9077.field631 - 1) {
                        int var28 = arg1.method432(var27 + 1, false, var25) - arg1.method432(var27 - 1, false, var25);
                        int var29 = arg1.method432(var27, false, var25 + 1) - arg1.method432(var27, false, var25 - 1);
                        float var30 = (float) (1.0D / Math.sqrt((double) (var29 * var29 + var28 * var28 + 65536)));
                        this.field9078[var26][var8] = (float) var28 * var30;
                        this.field9074[var26][var8] = var30 * -256.0F;
                        this.field9068[var26][var8] = (float) var29 * var30;
                    }
                }
            }
        }
        int var9 = 0;
        for (int var10 = this.field9083; var10 <= this.field9080; var10++) {
            if (var10 >= 0 && arg1.field632 > var10) {
                for (int var21 = this.field9084; var21 <= this.field9072; var21++) {
                    if (var21 >= 0 && arg1.field631 > var21) {
                        int var22 = arg3[var9];
                        int[] var23 = arg1.field8729[var21][var10];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                int var24 = 0;
                                while (var24 < var23.length) {
                                    if (var23[var24++] != -1 && var23[var24++] != -1 && var23[var24++] != -1) {
                                        this.field9079 += 3;
                                    }
                                }
                            } else {
                                this.field9079 += 3;
                            }
                        }
                    }
                    var9++;
                }
            } else {
                var9 += this.field9072 - this.field9084;
            }
        }
        if (this.field9079 > 0) {
            this.field9071 = new class695(this.field9079 * 2);
            this.field9073 = new class231(this.field9079 * 16);
            this.field9086 = new class213(class2.method9(this.field9079, -59));
            int var11 = 0;
            int var12 = 0;
            for (int var13 = this.field9083; var13 <= this.field9080; var13++) {
                if (var13 >= 0 && arg1.field632 > var13) {
                    int var14 = 0;
                    for (int var15 = this.field9084; var15 <= this.field9072; var15++) {
                        if (var15 >= 0 && var15 < arg1.field631) {
                            int var16 = arg3[var11];
                            int[] var17 = arg1.field8729[var15][var13];
                            if (var17 != null && var16 != 0) {
                                if (var16 == 1) {
                                    int[] var18 = arg1.field8725[var15][var13];
                                    int[] var19 = arg1.field8718[var15][var13];
                                    int var20 = 0;
                                    label110: while (true) {
                                        while (true) {
                                            if (var17.length <= var20) {
                                                break label110;
                                            }
                                            if (var17[var20] == -1 || var17[var20 + 1] == -1 || var17[var20 + 2] == -1) {
                                                var20 += 3;
                                            } else {
                                                this.method3586(96, var13, var14, var15, var12, var18[var20], var19[var20]);
                                                var20++;
                                                this.method3586(112, var13, var14, var15, var12, var18[var20], var19[var20]);
                                                var20++;
                                                this.method3586(84, var13, var14, var15, var12, var18[var20], var19[var20]);
                                                var20++;
                                            }
                                        }
                                    }
                                } else if (var16 == 3) {
                                    this.method3586(96, var13, var14, var15, var12, 0, 0);
                                    this.method3586(123, var13, var14, var15, var12, arg1.field629, 0);
                                    this.method3586(102, var13, var14, var15, var12, 0, arg1.field629);
                                } else if (var16 == 2) {
                                    this.method3586(121, var13, var14, var15, var12, arg1.field629, 0);
                                    this.method3586(112, var13, var14, var15, var12, arg1.field629, arg1.field629);
                                    this.method3586(95, var13, var14, var15, var12, 0, 0);
                                } else if (var16 == 5) {
                                    this.method3586(84, var13, var14, var15, var12, arg1.field629, arg1.field629);
                                    this.method3586(86, var13, var14, var15, var12, 0, arg1.field629);
                                    this.method3586(116, var13, var14, var15, var12, arg1.field629, 0);
                                } else if (var16 == 4) {
                                    this.method3586(119, var13, var14, var15, var12, 0, arg1.field629);
                                    this.method3586(82, var13, var14, var15, var12, 0, 0);
                                    this.method3586(115, var13, var14, var15, var12, arg1.field629, arg1.field629);
                                }
                            }
                        }
                        var11++;
                        var14++;
                    }
                } else {
                    var11 += this.field9072 - this.field9084;
                }
                var12++;
            }
            this.field9076 = this.field9070.method1526(false, this.field9071.field9796, 5123, false, this.field9071.field9761);
            this.field9082 = this.field9070.method1573(false, this.field9073.field9761, 16, false, this.field9073.field9796);
            this.field9065 = new class512(this.field9082, 5126, 3, 0);
            this.field9075 = new class512(this.field9082, 5121, 4, 12);
        } else {
            this.field9076 = null;
            this.field9075 = null;
            this.field9065 = null;
            this.field9082 = null;
        }
        this.field9073 = null;
        this.field9086 = null;
        this.field9078 = this.field9074 = this.field9068 = null;
        this.field9071 = null;
    }
}
