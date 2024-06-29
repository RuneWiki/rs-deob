import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class188 extends class99 {

    @OriginalMember(owner = "client!vh", name = "Y", descriptor = "I")
    private int field3255 = 1638;

    @OriginalMember(owner = "client!vh", name = "X", descriptor = "I")
    private int field3254 = 4;

    @OriginalMember(owner = "client!vh", name = "S", descriptor = "Z")
    private boolean field3249 = true;

    @OriginalMember(owner = "client!vh", name = "kb", descriptor = "I")
    private int field3267 = 4;

    @OriginalMember(owner = "client!vh", name = "lb", descriptor = "I")
    private int field3268 = 4;

    @OriginalMember(owner = "client!vh", name = "ab", descriptor = "[B")
    private byte[] field3257 = new byte[512];

    @OriginalMember(owner = "client!vh", name = "qb", descriptor = "I")
    private int field3273 = 0;

    @OriginalMember(owner = "client!vh", name = "bb", descriptor = "Lr;")
    public static class66 field3258 = class93.method641(43, "leuchten2:");

    @OriginalMember(owner = "client!vh", name = "gb", descriptor = "[I")
    public static int[] field3263 = new int[4096];

    @OriginalMember(owner = "client!vh", name = "W", descriptor = "[I")
    public static int[] field3253 = new int[] { 1, 0, 0, 0, 1, 0, 2, 1, 1, 1, 0 };

    @OriginalMember(owner = "client!vh", name = "cb", descriptor = "I")
    public static int field3259 = 0;

    @OriginalMember(owner = "client!vh", name = "eb", descriptor = "Lqc;")
    public static class245 field3261 = new class245(50);

    @OriginalMember(owner = "client!vh", name = "mb", descriptor = "Lr;")
    public static class66 field3269 = class93.method641(43, "::rebuild");

    @OriginalMember(owner = "client!vh", name = "pb", descriptor = "[I")
    public static int[] field3272 = new int[500];

    @OriginalMember(owner = "client!vh", name = "nb", descriptor = "I")
    public static int field3270 = -1;

    @OriginalMember(owner = "client!vh", name = "rb", descriptor = "I")
    public static int field3274 = 0;

    @OriginalMember(owner = "client!vh", name = "Q", descriptor = "I")
    public static int field3247;

    @OriginalMember(owner = "client!vh", name = "T", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!vh", name = "U", descriptor = "I")
    public static int field3251;

    @OriginalMember(owner = "client!vh", name = "V", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!vh", name = "Z", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!vh", name = "db", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!vh", name = "hb", descriptor = "I")
    public static int field3264;

    @OriginalMember(owner = "client!vh", name = "ib", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!vh", name = "jb", descriptor = "I")
    public static int field3266;

    @OriginalMember(owner = "client!vh", name = "ob", descriptor = "I")
    public static int field3271;

    @OriginalMember(owner = "client!vh", name = "R", descriptor = "[S")
    private short[] field3248;

    @OriginalMember(owner = "client!vh", name = "fb", descriptor = "[S")
    private short[] field3262;

    @OriginalMember(owner = "client!vh", name = "<init>", descriptor = "()V")
    public class188() {
        super(0, true);
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field3256;
        if (~arg1 != -1) {
            if (~arg1 != -2) {
                if (arg1 != 2) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (~arg1 == -7) {
                                    this.field3267 = arg0.method1677(-6677);
                                }
                            } else {
                                this.field3268 = arg0.method1677(arg2 ^ 6676);
                            }
                        } else {
                            this.field3273 = arg0.method1677(-6677);
                        }
                    } else {
                        this.field3268 = this.field3267 = arg0.method1677(-6677);
                    }
                } else {
                    this.field3255 = arg0.method1684(arg2 ^ 22488);
                    if (~this.field3255 > -1) {
                        this.field3248 = new short[this.field3254];
                        for (int var5 = 0; var5 < this.field3254; ++var5) {
                            this.field3248[var5] = (short) arg0.method1684(arg2 + -22488);
                        }
                    }
                }
            } else {
                this.field3254 = arg0.method1677(arg2 ^ 6676);
            }
        } else {
            this.field3249 = ~arg0.method1677(-6677) == -2;
        }
        if (arg2 != -1) {
            method1239(-85, -47);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "([III)V")
    private final void method1238(int[] arg0, int arg1, int arg2) {
        ++field3271;
        int var4 = class19.field261[arg2] * this.field3267;
        if (arg1 == 0) {
            if (this.field3254 == 1) {
                short var5 = this.field3248[0];
                int var6 = this.field3262[0] << 12;
                int var7 = this.field3268 * var6 >> 12;
                int var8 = this.field3267 * var6 >> 12;
                int var9 = var4 * var6 >> 12;
                int var10 = var9 >> 12;
                int var11 = var10 - -1;
                int var12 = var9 & 4095;
                if (var11 >= var8) {
                    var11 = 0;
                }
                int var13 = 255 & this.field3257[255 & var10];
                int var14 = 255 & this.field3257[255 & var11];
                int var15 = class31.field465[var12];
                if (this.field3249) {
                    for (int var16 = 0; class199.field3432 > var16; ++var16) {
                        int var17 = class10.field120[var16] * this.field3268;
                        int var18 = this.method1242(var12, var13, (byte) 91, var15, var6 * var17 >> 12, var7, var14);
                        int var19 = var5 * var18 >> 12;
                        arg0[var16] = (var19 >> 1) + 2048;
                    }
                } else {
                    for (int var20 = 0; ~class199.field3432 < ~var20; ++var20) {
                        int var21 = class10.field120[var20] * this.field3268;
                        int var22 = this.method1242(var12, var13, (byte) 44, var15, var6 * var21 >> 12, var7, var14);
                        arg0[var20] = var5 * var22 >> 12;
                    }
                }
            } else {
                short var23 = this.field3248[0];
                if (var23 > 8 || var23 < -8) {
                    int var24 = this.field3262[0] << 12;
                    int var25 = var4 * var24 >> 12;
                    int var26 = this.field3268 * var24 >> 12;
                    int var27 = var25 >> 12;
                    int var28 = var27 + 1;
                    int var29 = this.field3257[255 & var27] & 255;
                    int var30 = this.field3267 * var24 >> 12;
                    int var31 = var25 & 4095;
                    int var32 = class31.field465[var31];
                    if (~var28 <= ~var30) {
                        var28 = 0;
                    }
                    int var33 = 255 & this.field3257[var28 & 255];
                    for (int var34 = 0; class199.field3432 > var34; ++var34) {
                        int var54 = class10.field120[var34] * this.field3268;
                        int var55 = this.method1242(var31, var29, (byte) -127, var32, var24 * var54 >> 12, var26, var33);
                        arg0[var34] = var23 * var55 >> 12;
                    }
                }
                for (int var35 = 1; this.field3254 > var35; ++var35) {
                    short var36 = this.field3248[var35];
                    if (var36 > 8 || var36 < -8) {
                        int var37 = this.field3262[var35] << 12;
                        int var38 = this.field3268 * var37 >> 12;
                        int var39 = var4 * var37 >> 12;
                        int var40 = this.field3267 * var37 >> 12;
                        int var41 = var39 >> 12;
                        int var42 = this.field3257[255 & var41] & 255;
                        int var43 = var41 + 1;
                        if (~var40 >= ~var43) {
                            var43 = 0;
                        }
                        int var44 = 255 & this.field3257[255 & var43];
                        int var45 = var39 & 4095;
                        int var46 = class31.field465[var45];
                        if (this.field3249 && ~(this.field3254 - 1) == ~var35) {
                            for (int var47 = 0; class199.field3432 > var47; ++var47) {
                                int var48 = class10.field120[var47] * this.field3268;
                                int var49 = this.method1242(var45, var42, (byte) 36, var46, var37 * var48 >> 12, var38, var44);
                                int var50 = (var36 * var49 >> 12) + arg0[var47];
                                arg0[var47] = (var50 >> 1) + 2048;
                            }
                        } else {
                            for (int var51 = 0; var51 < class199.field3432; ++var51) {
                                int var52 = class10.field120[var51] * this.field3268;
                                int var53 = this.method1242(var45, var42, (byte) 86, var46, var37 * var52 >> 12, var38, var44);
                                arg0[var51] += var36 * var53 >> 12;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(II)Lr;")
    public static final class66 method1239(int arg0, int arg1) {
        ++field3251;
        class66 var2 = class144.method989(arg0, 0);
        for (int var3 = var2.method460((byte) -103) - 3; var3 > 0; var3 -= 3) {
            var2 = class212.method1372(2, new class66[] { var2.method477(0, (byte) -74, var3), class61.field1029, var2.method485(var3, true) });
        }
        if (arg1 != -5344) {
            field3253 = null;
        }
        if (~var2.method460((byte) -126) < -10) {
            return class212.method1372(2, new class66[] { class240.field4166, var2.method477(0, (byte) -74, var2.method460((byte) -100) + -8), class226.field3885, class56.field953, var2, class44.field781 });
        } else {
            return ~var2.method460((byte) -97) < -7 ? class212.method1372(2, new class66[] { class244.field4267, var2.method477(0, (byte) -74, var2.method460((byte) -99) + -4), class96.field1867, class56.field953, var2, class44.field781 }) : class212.method1372(2, new class66[] { class75.field1493, var2, class66.field1320 });
        }
    }

    @OriginalMember(owner = "client!vh", name = "d", descriptor = "(B)V")
    public static void method1240(byte arg0) {
        field3263 = null;
        if (arg0 > -24) {
            method1243(5, -30, -77, -55, -30, 100);
        }
        field3258 = null;
        field3272 = null;
        field3261 = null;
        field3253 = null;
        field3269 = null;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        this.field3257 = method1244((byte) 14, this.field3273);
        if (arg0 >= -22) {
            field3259 = 85;
        }
        this.method1241((byte) 125);
        for (int var2 = this.field3254 + -1; var2 >= 1; --var2) {
            short var3 = this.field3248[var2];
            if (~var3 < -9 || var3 < -8) {
                break;
            }
            --this.field3254;
        }
        ++field3260;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field3247;
        if (arg0 != -61) {
            this.method1238((int[]) null, -11, -125);
        }
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            this.method1238(var3, 0, arg1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!vh", name = "e", descriptor = "(B)V")
    private final void method1241(byte arg0) {
        ++field3265;
        if (this.field3255 <= 0) {
            if (this.field3248 != null && this.field3248.length == this.field3254) {
                this.field3262 = new short[this.field3254];
                for (int var2 = 0; var2 < this.field3254; ++var2) {
                    this.field3262[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            }
        } else {
            this.field3262 = new short[this.field3254];
            this.field3248 = new short[this.field3254];
            for (int var3 = 0; this.field3254 > var3; ++var3) {
                this.field3248[var3] = (short) ((int) (Math.pow((double) ((float) this.field3255 / 4096.0F), (double) var3) * 4096.0D));
                this.field3262[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
        if (arg0 <= 112) {
            this.method11((class249) null, -67, -50);
        }
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIBIIII)I")
    private final int method1242(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3252;
        int var8 = arg0 + -4096;
        int var9 = arg4 >> 12;
        int var10 = var9 - -1;
        if (arg5 <= var10) {
            var10 = 0;
        }
        int var11 = arg4 & 4095;
        int var12 = var11 + -4096;
        int var13 = var9 & 255;
        int var14 = this.field3257[arg1 + var13] & 3;
        int var15 = class31.field465[var11];
        int var16 = var10 & 255;
        int var17;
        if (var14 <= 1) {
            var17 = var14 != 0 ? arg0 - var11 : arg0 + var11;
        } else {
            var17 = ~var14 != -3 ? -arg0 + -var11 : -arg0 + var11;
        }
        int var18 = 3 & this.field3257[arg1 + var16];
        int var19;
        if (~var18 < -2) {
            var19 = var18 != 2 ? -arg0 + -var12 : -arg0 + var12;
        } else {
            var19 = var18 == 0 ? arg0 + var12 : -var12 + arg0;
        }
        int var20 = ((-var17 + var19) * var15 >> 12) + var17;
        int var21 = 3 & this.field3257[arg6 + var13];
        int var22 = 20 / ((-38 - arg2) / 35);
        int var23;
        if (var21 <= 1) {
            var23 = var21 != 0 ? -var11 + var8 : var11 - -var8;
        } else {
            var23 = var21 != 2 ? -var8 + -var11 : var11 - var8;
        }
        int var24 = this.field3257[var16 - -arg6] & 3;
        int var25;
        if (~var24 >= -2) {
            var25 = ~var24 == -1 ? var8 + var12 : -var12 + var8;
        } else {
            var25 = ~var24 == -3 ? var12 - var8 : -var8 + -var12;
        }
        int var26 = ((-var23 + var25) * var15 >> 12) + var23;
        return ((var26 - var20) * arg3 >> 12) + var20;
    }

    @OriginalMember(owner = "client!vh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1243(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3250;
        if (arg1 > -51) {
            field3274 = 102;
        }
        for (int var6 = arg4; arg0 + arg4 >= var6; ++var6) {
            for (int var11 = arg5; var11 <= arg2 + arg5; ++var11) {
                if (~var11 <= -1 && var11 < 104 && ~var6 <= -1 && var6 < 104) {
                    class165.field2971[arg3][var11][var6] = 127;
                }
            }
        }
        for (int var7 = arg4; ~var7 > ~(arg4 - -arg0); ++var7) {
            for (int var10 = arg5; arg2 + arg5 > var10; ++var10) {
                if (~var10 <= -1 && ~var10 > -105 && var7 >= 0 && ~var7 > -105) {
                    class30.field453[arg3][var10][var7] = ~arg3 < -1 ? class30.field453[arg3 + -1][var10][var7] : 0;
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var8 = arg4 + 1; ~var8 > ~(arg0 + arg4); ++var8) {
                if (~var8 <= -1 && var8 < 104) {
                    class30.field453[arg3][arg5][var8] = class30.field453[arg3][arg5 + -1][var8];
                }
            }
        }
        if (arg4 > 0 && ~arg4 > -105) {
            for (int var9 = arg5 + 1; arg2 + arg5 > var9; ++var9) {
                if (var9 >= 0 && ~var9 > -105) {
                    class30.field453[arg3][var9][arg4] = class30.field453[arg3][var9][arg4 + -1];
                }
            }
        }
        if (arg5 >= 0 && arg4 >= 0 && arg5 < 104 && ~arg4 > -105) {
            if (~arg3 == -1) {
                if (arg5 > 0 && class30.field453[arg3][arg5 + -1][arg4] != 0) {
                    class30.field453[arg3][arg5][arg4] = class30.field453[arg3][arg5 + -1][arg4];
                    return;
                }
                if (arg4 > 0 && class30.field453[arg3][arg5][arg4 - 1] != 0) {
                    class30.field453[arg3][arg5][arg4] = class30.field453[arg3][arg5][arg4 + -1];
                    return;
                }
                if (~arg5 < -1 && ~arg4 < -1 && ~class30.field453[arg3][arg5 + -1][arg4 + -1] != -1) {
                    class30.field453[arg3][arg5][arg4] = class30.field453[arg3][arg5 + -1][arg4 + -1];
                    return;
                }
            } else {
                if (~arg5 >= -1 || class30.field453[arg3][arg5 - 1][arg4] == class30.field453[arg3 - 1][arg5 + -1][arg4]) {
                    if (arg4 > 0 && class30.field453[arg3 + -1][arg5][arg4 + -1] != class30.field453[arg3][arg5][arg4 + -1]) {
                        class30.field453[arg3][arg5][arg4] = class30.field453[arg3][arg5][arg4 + -1];
                        return;
                    }
                    if (~arg5 < -1 && arg4 > 0 && class30.field453[arg3][arg5 + -1][arg4 + -1] != class30.field453[arg3 + -1][arg5 - 1][arg4 + -1]) {
                        class30.field453[arg3][arg5][arg4] = class30.field453[arg3][arg5 - 1][arg4 + -1];
                        return;
                    }
                    return;
                }
                class30.field453[arg3][arg5][arg4] = class30.field453[arg3][arg5 + -1][arg4];
            }
        }
    }

    @OriginalMember(owner = "client!vh", name = "b", descriptor = "(BI)[B")
    public static final byte[] method1244(byte arg0, int arg1) {
        ++field3266;
        if (arg0 != 14) {
            field3259 = -127;
        }
        class53 var2 = (class53) class230.field3967.method1505((long) arg1, (byte) -76);
        if (var2 == null) {
            byte[] var3 = new byte[512];
            Random var4 = new Random((long) arg1);
            for (int var5 = 0; ~var5 > -256; ++var5) {
                var3[var5] = (byte) var5;
            }
            for (int var6 = 0; ~var6 > -256; ++var6) {
                int var7 = -var6 + 255;
                int var8 = class256.method1717(var7, (byte) 70, var4);
                byte var9 = var3[var8];
                var3[var8] = var3[var7];
                var3[var7] = var3[-var6 + 511] = var9;
            }
            var2 = new class53(var3);
            class230.field3967.method1497((long) arg1, (byte) 112, var2);
        }
        return var2.field931;
    }
}
