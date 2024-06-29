import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wc")
public class class156 extends class105 {

    @OriginalMember(owner = "client!wc", name = "ob", descriptor = "I")
    private int field3557 = 0;

    @OriginalMember(owner = "client!wc", name = "lb", descriptor = "Z")
    private boolean field3554 = false;

    @OriginalMember(owner = "client!wc", name = "Mb", descriptor = "B")
    private byte field3581 = 0;

    @OriginalMember(owner = "client!wc", name = "Rb", descriptor = "I")
    private int field3586 = 0;

    @OriginalMember(owner = "client!wc", name = "Wb", descriptor = "I")
    private int field3591;

    @OriginalMember(owner = "client!wc", name = "dc", descriptor = "[I")
    private int[] field3598;

    @OriginalMember(owner = "client!wc", name = "Hb", descriptor = "[I")
    private int[] field3576;

    @OriginalMember(owner = "client!wc", name = "Ob", descriptor = "[I")
    private int[] field3583;

    @OriginalMember(owner = "client!wc", name = "tb", descriptor = "[I")
    private int[] field3562;

    @OriginalMember(owner = "client!wc", name = "Eb", descriptor = "[I")
    private int[] field3573;

    @OriginalMember(owner = "client!wc", name = "Yb", descriptor = "[I")
    private int[] field3593;

    @OriginalMember(owner = "client!wc", name = "kb", descriptor = "[I")
    private int[] field3553;

    @OriginalMember(owner = "client!wc", name = "nb", descriptor = "[B")
    private byte[] field3556;

    @OriginalMember(owner = "client!wc", name = "Ib", descriptor = "[B")
    private byte[] field3577;

    @OriginalMember(owner = "client!wc", name = "pb", descriptor = "[B")
    private byte[] field3558;

    @OriginalMember(owner = "client!wc", name = "Lb", descriptor = "[I")
    private int[] field3580;

    @OriginalMember(owner = "client!wc", name = "Zb", descriptor = "[S")
    private short[] field3594;

    @OriginalMember(owner = "client!wc", name = "Sb", descriptor = "[B")
    private byte[] field3587;

    @OriginalMember(owner = "client!wc", name = "Fb", descriptor = "[S")
    private short[] field3574;

    @OriginalMember(owner = "client!wc", name = "Tb", descriptor = "[B")
    private byte[] field3588;

    @OriginalMember(owner = "client!wc", name = "yb", descriptor = "[S")
    private short[] field3567;

    @OriginalMember(owner = "client!wc", name = "sb", descriptor = "[S")
    private short[] field3561;

    @OriginalMember(owner = "client!wc", name = "Kb", descriptor = "[S")
    private short[] field3579;

    @OriginalMember(owner = "client!wc", name = "Ub", descriptor = "[S")
    private short[] field3589;

    @OriginalMember(owner = "client!wc", name = "bc", descriptor = "[S")
    private short[] field3596;

    @OriginalMember(owner = "client!wc", name = "zb", descriptor = "[S")
    private short[] field3568;

    @OriginalMember(owner = "client!wc", name = "Ab", descriptor = "[S")
    private short[] field3569;

    @OriginalMember(owner = "client!wc", name = "Nb", descriptor = "[B")
    private byte[] field3582;

    @OriginalMember(owner = "client!wc", name = "Bb", descriptor = "[S")
    private short[] field3570;

    @OriginalMember(owner = "client!wc", name = "Pb", descriptor = "[S")
    private short[] field3584;

    @OriginalMember(owner = "client!wc", name = "Gb", descriptor = "[[I")
    private int[][] field3575;

    @OriginalMember(owner = "client!wc", name = "cc", descriptor = "[[I")
    private int[][] field3597;

    @OriginalMember(owner = "client!wc", name = "mb", descriptor = "[Lie;")
    private class61[] field3555;

    @OriginalMember(owner = "client!wc", name = "rb", descriptor = "[Lsc;")
    private class128[] field3560;

    @OriginalMember(owner = "client!wc", name = "xb", descriptor = "[Lie;")
    private class61[] field3566;

    @OriginalMember(owner = "client!wc", name = "ec", descriptor = "S")
    public short field3599;

    @OriginalMember(owner = "client!wc", name = "Cb", descriptor = "S")
    public short field3571;

    @OriginalMember(owner = "client!wc", name = "vb", descriptor = "[I")
    private static int[] field3564 = class96.field2143;

    @OriginalMember(owner = "client!wc", name = "Vb", descriptor = "[I")
    private static int[] field3590 = new int[10000];

    @OriginalMember(owner = "client!wc", name = "wb", descriptor = "[I")
    private static int[] field3565 = class96.field2148;

    @OriginalMember(owner = "client!wc", name = "Xb", descriptor = "I")
    private static int field3592 = 0;

    @OriginalMember(owner = "client!wc", name = "ub", descriptor = "[I")
    private static int[] field3563 = new int[10000];

    @OriginalMember(owner = "client!wc", name = "qb", descriptor = "I")
    private int field3559;

    @OriginalMember(owner = "client!wc", name = "Db", descriptor = "I")
    private int field3572;

    @OriginalMember(owner = "client!wc", name = "Jb", descriptor = "I")
    private int field3578;

    @OriginalMember(owner = "client!wc", name = "Qb", descriptor = "I")
    private int field3585;

    @OriginalMember(owner = "client!wc", name = "ac", descriptor = "I")
    private int field3595;

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "(I)I")
    private static final int method1183(int arg0) {
        if (arg0 < 2) {
            arg0 = 2;
        } else if (arg0 > 126) {
            arg0 = 126;
        }
        return arg0;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([[IIIIZI)Lwc;")
    public final class156 method1184(int[][] arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        this.method1188();
        int var7 = this.field3585 + arg1;
        int var8 = this.field3572 + arg1;
        int var9 = this.field3578 + arg3;
        int var10 = this.field3595 + arg3;
        if (var7 >= 0 && var8 + 128 >> 7 < arg0.length && var9 >= 0 && var10 + 128 >> 7 < arg0[0].length) {
            int var11 = var7 >> 7;
            int var12 = var8 + 127 >> 7;
            int var13 = var9 >> 7;
            int var14 = var10 + 127 >> 7;
            if (arg0[var11][var13] == arg2 && arg0[var12][var13] == arg2 && arg0[var11][var14] == arg2 && arg0[var12][var14] == arg2) {
                return this;
            } else {
                class156 var15;
                if (arg4) {
                    var15 = new class156();
                    var15.field3586 = this.field3586;
                    var15.field3557 = this.field3557;
                    var15.field3591 = this.field3591;
                    var15.field3598 = this.field3598;
                    var15.field3583 = this.field3583;
                    var15.field3573 = this.field3573;
                    var15.field3593 = this.field3593;
                    var15.field3553 = this.field3553;
                    var15.field3556 = this.field3556;
                    var15.field3577 = this.field3577;
                    var15.field3558 = this.field3558;
                    var15.field3587 = this.field3587;
                    var15.field3574 = this.field3574;
                    var15.field3594 = this.field3594;
                    var15.field3581 = this.field3581;
                    var15.field3588 = this.field3588;
                    var15.field3567 = this.field3567;
                    var15.field3561 = this.field3561;
                    var15.field3579 = this.field3579;
                    var15.field3589 = this.field3589;
                    var15.field3596 = this.field3596;
                    var15.field3568 = this.field3568;
                    var15.field3569 = this.field3569;
                    var15.field3582 = this.field3582;
                    var15.field3570 = this.field3570;
                    var15.field3584 = this.field3584;
                    var15.field3562 = this.field3562;
                    var15.field3580 = this.field3580;
                    var15.field3575 = this.field3575;
                    var15.field3597 = this.field3597;
                    var15.field3599 = this.field3599;
                    var15.field3571 = this.field3571;
                    var15.field3576 = new int[var15.field3586];
                } else {
                    var15 = this;
                }
                if (arg5 == 0) {
                    for (int var16 = 0; var16 < var15.field3586; ++var16) {
                        int var17 = this.field3598[var16] + arg1;
                        int var18 = this.field3583[var16] + arg3;
                        int var19 = var17 & 127;
                        int var20 = var18 & 127;
                        int var21 = var17 >> 7;
                        int var22 = var18 >> 7;
                        int var23 = (128 - var19) * arg0[var21][var22] + arg0[var21 + 1][var22] * var19 >> 7;
                        int var24 = (128 - var19) * arg0[var21][var22 + 1] + arg0[var21 + 1][var22 + 1] * var19 >> 7;
                        int var25 = (128 - var20) * var23 + var20 * var24 >> 7;
                        var15.field3576[var16] = this.field3576[var16] + var25 - arg2;
                    }
                } else {
                    for (int var26 = 0; var26 < var15.field3586; ++var26) {
                        int var27 = (-this.field3576[var26] << 16) / super.field2394;
                        if (var27 < arg5) {
                            int var28 = this.field3598[var26] + arg1;
                            int var29 = this.field3583[var26] + arg3;
                            int var30 = var28 & 127;
                            int var31 = var29 & 127;
                            int var32 = var28 >> 7;
                            int var33 = var29 >> 7;
                            int var34 = (128 - var30) * arg0[var32][var33] + arg0[var32 + 1][var33] * var30 >> 7;
                            int var35 = (128 - var30) * arg0[var32][var33 + 1] + arg0[var32 + 1][var33 + 1] * var30 >> 7;
                            int var36 = (128 - var31) * var34 + var31 * var35 >> 7;
                            var15.field3576[var26] = (var36 - arg2) * (arg5 - var27) / arg5 + this.field3576[var26];
                        }
                    }
                }
                var15.method1185();
                return var15;
            }
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "()V")
    private final void method1185() {
        this.field3555 = null;
        this.field3566 = null;
        this.field3560 = null;
        this.field3554 = false;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lfd;II)Lwc;")
    public static final class156 method1186(class40 arg0, int arg1, int arg2) {
        byte[] var3 = arg0.method267((byte) -124, arg2, arg1);
        return var3 == null ? null : new class156(var3);
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(IIIII)Lad;")
    public final class5 method1187(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.method1197();
        int var6 = (int) Math.sqrt((double) (arg4 * arg4 + arg2 * arg2 + arg3 * arg3));
        int var7 = arg1 * var6 >> 8;
        class5 var8 = new class5();
        var8.field101 = new int[this.field3557];
        var8.field98 = new int[this.field3557];
        var8.field80 = new int[this.field3557];
        if (this.field3591 > 0 && this.field3587 != null) {
            int[] var9 = new int[this.field3591];
            for (int var10 = 0; var10 < this.field3557; ++var10) {
                if (this.field3587[var10] != -1) {
                    ++var9[this.field3587[var10] & 255];
                }
            }
            var8.field90 = 0;
            for (int var11 = 0; var11 < this.field3591; ++var11) {
                if (var9[var11] > 0 && this.field3588[var11] == 0) {
                    ++var8.field90;
                }
            }
            var8.field77 = new int[var8.field90];
            var8.field92 = new int[var8.field90];
            var8.field75 = new int[var8.field90];
            int var12 = 0;
            for (int var13 = 0; var13 < this.field3591; ++var13) {
                if (var9[var13] > 0 && this.field3588[var13] == 0) {
                    var8.field77[var12] = this.field3567[var13] & 65535;
                    var8.field92[var12] = this.field3561[var13] & 65535;
                    var8.field75[var12] = this.field3579[var13] & 65535;
                    var9[var13] = var12++;
                } else {
                    var9[var13] = -1;
                }
            }
            var8.field103 = new byte[this.field3557];
            for (int var14 = 0; var14 < this.field3557; ++var14) {
                if (this.field3587[var14] != -1) {
                    var8.field103[var14] = (byte) var9[this.field3587[var14] & 255];
                } else {
                    var8.field103[var14] = -1;
                }
            }
        }
        for (int var15 = 0; var15 < this.field3557; ++var15) {
            byte var16;
            if (this.field3556 == null) {
                var16 = 0;
            } else {
                var16 = this.field3556[var15];
            }
            byte var17;
            if (this.field3558 == null) {
                var17 = 0;
            } else {
                var17 = this.field3558[var15];
            }
            short var18;
            if (this.field3594 == null) {
                var18 = -1;
            } else {
                var18 = this.field3594[var15];
            }
            if (var17 == -2) {
                var16 = 3;
            }
            if (var17 == -1) {
                var16 = 2;
            }
            if (var18 == -1) {
                if (var16 != 0) {
                    if (var16 == 1) {
                        class128 var26 = this.field3560[var15];
                        int var27 = (var26.field2812 * arg4 + var26.field2816 * arg2 + var26.field2810 * arg3) / (var7 / 2 + var7) + arg0;
                        var8.field101[var15] = method1200(this.field3574[var15] & 65535, var27);
                        var8.field80[var15] = -1;
                    } else if (var16 == 3) {
                        var8.field101[var15] = 128;
                        var8.field80[var15] = -1;
                    } else {
                        var8.field80[var15] = -2;
                    }
                } else {
                    int var19 = this.field3574[var15] & 65535;
                    class61 var20;
                    if (this.field3566 != null && this.field3566[this.field3573[var15]] != null) {
                        var20 = this.field3566[this.field3573[var15]];
                    } else {
                        var20 = this.field3555[this.field3573[var15]];
                    }
                    int var21 = (var20.field1210 * arg4 + var20.field1217 * arg2 + var20.field1216 * arg3) / (var20.field1225 * var7) + arg0;
                    var8.field101[var15] = method1200(var19, var21);
                    class61 var22;
                    if (this.field3566 != null && this.field3566[this.field3593[var15]] != null) {
                        var22 = this.field3566[this.field3593[var15]];
                    } else {
                        var22 = this.field3555[this.field3593[var15]];
                    }
                    int var23 = (var22.field1210 * arg4 + var22.field1217 * arg2 + var22.field1216 * arg3) / (var22.field1225 * var7) + arg0;
                    var8.field98[var15] = method1200(var19, var23);
                    class61 var24;
                    if (this.field3566 != null && this.field3566[this.field3553[var15]] != null) {
                        var24 = this.field3566[this.field3553[var15]];
                    } else {
                        var24 = this.field3555[this.field3553[var15]];
                    }
                    int var25 = (var24.field1210 * arg4 + var24.field1217 * arg2 + var24.field1216 * arg3) / (var24.field1225 * var7) + arg0;
                    var8.field80[var15] = method1200(var19, var25);
                }
            } else if (var16 != 0) {
                if (var16 == 1) {
                    class128 var34 = this.field3560[var15];
                    int var35 = (var34.field2812 * arg4 + var34.field2816 * arg2 + var34.field2810 * arg3) / (var7 / 2 + var7) + arg0;
                    var8.field101[var15] = method1183(var35);
                    var8.field80[var15] = -1;
                } else {
                    var8.field80[var15] = -2;
                }
            } else {
                class61 var28;
                if (this.field3566 != null && this.field3566[this.field3573[var15]] != null) {
                    var28 = this.field3566[this.field3573[var15]];
                } else {
                    var28 = this.field3555[this.field3573[var15]];
                }
                int var29 = (var28.field1210 * arg4 + var28.field1217 * arg2 + var28.field1216 * arg3) / (var28.field1225 * var7) + arg0;
                var8.field101[var15] = method1183(var29);
                class61 var30;
                if (this.field3566 != null && this.field3566[this.field3593[var15]] != null) {
                    var30 = this.field3566[this.field3593[var15]];
                } else {
                    var30 = this.field3555[this.field3593[var15]];
                }
                int var31 = (var30.field1210 * arg4 + var30.field1217 * arg2 + var30.field1216 * arg3) / (var30.field1225 * var7) + arg0;
                var8.field98[var15] = method1183(var31);
                class61 var32;
                if (this.field3566 != null && this.field3566[this.field3553[var15]] != null) {
                    var32 = this.field3566[this.field3553[var15]];
                } else {
                    var32 = this.field3555[this.field3553[var15]];
                }
                int var33 = (var32.field1210 * arg4 + var32.field1217 * arg2 + var32.field1216 * arg3) / (var32.field1225 * var7) + arg0;
                var8.field80[var15] = method1183(var33);
            }
        }
        this.method1205();
        var8.field87 = this.field3586;
        var8.field97 = this.field3598;
        var8.field88 = this.field3576;
        var8.field81 = this.field3583;
        var8.field95 = this.field3557;
        var8.field89 = this.field3573;
        var8.field78 = this.field3593;
        var8.field108 = this.field3553;
        var8.field96 = this.field3577;
        var8.field91 = this.field3558;
        var8.field85 = this.field3581;
        var8.field84 = this.field3575;
        var8.field82 = this.field3597;
        var8.field83 = this.field3594;
        return var8;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "()V")
    private final void method1188() {
        if (!this.field3554) {
            super.field2394 = 0;
            this.field3559 = 0;
            this.field3585 = 999999;
            this.field3572 = -999999;
            this.field3595 = -99999;
            this.field3578 = 99999;
            for (int var1 = 0; var1 < this.field3586; ++var1) {
                int var2 = this.field3598[var1];
                int var3 = this.field3576[var1];
                int var4 = this.field3583[var1];
                if (var2 < this.field3585) {
                    this.field3585 = var2;
                }
                if (var2 > this.field3572) {
                    this.field3572 = var2;
                }
                if (var4 < this.field3578) {
                    this.field3578 = var4;
                }
                if (var4 > this.field3595) {
                    this.field3595 = var4;
                }
                if (-var3 > super.field2394) {
                    super.field2394 = -var3;
                }
                if (var3 > this.field3559) {
                    this.field3559 = var3;
                }
            }
            this.field3554 = true;
        }
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "()V")
    public final void method1189() {
        for (int var1 = 0; var1 < this.field3586; ++var1) {
            this.field3583[var1] = -this.field3583[var1];
        }
        for (int var2 = 0; var2 < this.field3557; ++var2) {
            int var3 = this.field3573[var2];
            this.field3573[var2] = this.field3553[var2];
            this.field3553[var2] = var3;
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "()V")
    public static void method1190() {
        field3590 = null;
        field3563 = null;
        field3564 = null;
        field3565 = null;
    }

    @OriginalMember(owner = "client!wc", name = "e", descriptor = "()V")
    public final void method1191() {
        for (int var1 = 0; var1 < this.field3586; ++var1) {
            int var2 = this.field3583[var1];
            this.field3583[var1] = this.field3598[var1];
            this.field3598[var1] = -var2;
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "c", descriptor = "(III)V")
    public final void method1192(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3586; ++var4) {
            this.field3598[var4] = this.field3598[var4] * arg0 / 128;
            this.field3576[var4] = this.field3576[var4] * arg1 / 128;
            this.field3583[var4] = this.field3583[var4] * arg2 / 128;
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "f", descriptor = "()V")
    public final void method1193() {
        for (int var1 = 0; var1 < this.field3586; ++var1) {
            this.field3598[var1] = -this.field3598[var1];
            this.field3583[var1] = -this.field3583[var1];
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "(I)V")
    public final void method1194(int arg0) {
        int var2 = field3564[arg0];
        int var3 = field3565[arg0];
        for (int var4 = 0; var4 < this.field3586; ++var4) {
            int var5 = this.field3598[var4] * var3 + this.field3583[var4] * var2 >> 16;
            this.field3583[var4] = this.field3583[var4] * var3 - this.field3598[var4] * var2 >> 16;
            this.field3598[var4] = var5;
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(SS)V")
    public final void method1195(short arg0, short arg1) {
        for (int var3 = 0; var3 < this.field3557; ++var3) {
            if (this.field3574[var3] == arg0) {
                this.field3574[var3] = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwc;Lwc;IIIZ)V")
    public static final void method1196(class156 arg0, class156 arg1, int arg2, int arg3, int arg4, boolean arg5) {
        arg0.method1188();
        arg0.method1197();
        arg1.method1188();
        arg1.method1197();
        ++field3592;
        int var6 = 0;
        int[] var7 = arg1.field3598;
        int var8 = arg1.field3586;
        for (int var9 = 0; var9 < arg0.field3586; ++var9) {
            class61 var12 = arg0.field3555[var9];
            if (var12.field1225 != 0) {
                int var13 = arg0.field3576[var9] - arg3;
                if (var13 <= arg1.field3559) {
                    int var14 = arg0.field3598[var9] - arg2;
                    if (var14 >= arg1.field3585 && var14 <= arg1.field3572) {
                        int var15 = arg0.field3583[var9] - arg4;
                        if (var15 >= arg1.field3578 && var15 <= arg1.field3595) {
                            for (int var16 = 0; var16 < var8; ++var16) {
                                class61 var17 = arg1.field3555[var16];
                                if (var7[var16] == var14 && arg1.field3583[var16] == var15 && arg1.field3576[var16] == var13 && var17.field1225 != 0) {
                                    if (arg0.field3566 == null) {
                                        arg0.field3566 = new class61[arg0.field3586];
                                    }
                                    if (arg1.field3566 == null) {
                                        arg1.field3566 = new class61[var8];
                                    }
                                    class61 var18 = arg0.field3566[var9];
                                    if (var18 == null) {
                                        var18 = arg0.field3566[var9] = new class61(var12);
                                    }
                                    class61 var19 = arg1.field3566[var16];
                                    if (var19 == null) {
                                        var19 = arg1.field3566[var16] = new class61(var17);
                                    }
                                    var18.field1217 += var17.field1217;
                                    var18.field1216 += var17.field1216;
                                    var18.field1210 += var17.field1210;
                                    var18.field1225 += var17.field1225;
                                    var19.field1217 += var12.field1217;
                                    var19.field1216 += var12.field1216;
                                    var19.field1210 += var12.field1210;
                                    var19.field1225 += var12.field1225;
                                    ++var6;
                                    field3590[var9] = field3592;
                                    field3563[var16] = field3592;
                                }
                            }
                        }
                    }
                }
            }
        }
        if (var6 >= 3 && arg5) {
            for (int var10 = 0; var10 < arg0.field3557; ++var10) {
                if (field3590[arg0.field3573[var10]] == field3592 && field3590[arg0.field3593[var10]] == field3592 && field3590[arg0.field3553[var10]] == field3592) {
                    if (arg0.field3556 == null) {
                        arg0.field3556 = new byte[arg0.field3557];
                    }
                    arg0.field3556[var10] = 2;
                }
            }
            for (int var11 = 0; var11 < arg1.field3557; ++var11) {
                if (field3563[arg1.field3573[var11]] == field3592 && field3563[arg1.field3593[var11]] == field3592 && field3563[arg1.field3553[var11]] == field3592) {
                    if (arg1.field3556 == null) {
                        arg1.field3556 = new byte[arg1.field3557];
                    }
                    arg1.field3556[var11] = 2;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "g", descriptor = "()V")
    public final void method1197() {
        if (this.field3555 == null) {
            this.field3555 = new class61[this.field3586];
            for (int var1 = 0; var1 < this.field3586; ++var1) {
                this.field3555[var1] = new class61();
            }
            for (int var2 = 0; var2 < this.field3557; ++var2) {
                int var3 = this.field3573[var2];
                int var4 = this.field3593[var2];
                int var5 = this.field3553[var2];
                int var6 = this.field3598[var4] - this.field3598[var3];
                int var7 = this.field3576[var4] - this.field3576[var3];
                int var8 = this.field3583[var4] - this.field3583[var3];
                int var9 = this.field3598[var5] - this.field3598[var3];
                int var10 = this.field3576[var5] - this.field3576[var3];
                int var11 = this.field3583[var5] - this.field3583[var3];
                int var12 = var7 * var11 - var8 * var10;
                int var13 = var8 * var9 - var6 * var11;
                int var14;
                for (var14 = var6 * var10 - var7 * var9; var12 > 8192 || var13 > 8192 || var14 > 8192 || var12 < -8192 || var13 < -8192 || var14 < -8192; var14 >>= 1) {
                    var12 >>= 1;
                    var13 >>= 1;
                }
                int var15 = (int) Math.sqrt((double) (var14 * var14 + var12 * var12 + var13 * var13));
                if (var15 <= 0) {
                    var15 = 1;
                }
                int var16 = var12 * 256 / var15;
                int var17 = var13 * 256 / var15;
                int var18 = var14 * 256 / var15;
                byte var19;
                if (this.field3556 == null) {
                    var19 = 0;
                } else {
                    var19 = this.field3556[var2];
                }
                if (var19 == 0) {
                    class61 var20 = this.field3555[var3];
                    var20.field1217 += var16;
                    var20.field1216 += var17;
                    var20.field1210 += var18;
                    ++var20.field1225;
                    class61 var21 = this.field3555[var4];
                    var21.field1217 += var16;
                    var21.field1216 += var17;
                    var21.field1210 += var18;
                    ++var21.field1225;
                    class61 var22 = this.field3555[var5];
                    var22.field1217 += var16;
                    var22.field1216 += var17;
                    var22.field1210 += var18;
                    ++var22.field1225;
                } else if (var19 == 1) {
                    if (this.field3560 == null) {
                        this.field3560 = new class128[this.field3557];
                    }
                    class128 var23 = this.field3560[var2] = new class128();
                    var23.field2816 = var16;
                    var23.field2810 = var17;
                    var23.field2812 = var18;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(Lwc;I)I")
    private final int method1198(class156 arg0, int arg1) {
        int var3 = -1;
        int var4 = arg0.field3598[arg1];
        int var5 = arg0.field3576[arg1];
        int var6 = arg0.field3583[arg1];
        for (int var7 = 0; var7 < this.field3586; ++var7) {
            if (this.field3598[var7] == var4 && this.field3576[var7] == var5 && this.field3583[var7] == var6) {
                var3 = var7;
                break;
            }
        }
        if (var3 == -1) {
            this.field3598[this.field3586] = var4;
            this.field3576[this.field3586] = var5;
            this.field3583[this.field3586] = var6;
            if (arg0.field3562 != null) {
                this.field3562[this.field3586] = arg0.field3562[arg1];
            }
            var3 = this.field3586++;
        }
        return var3;
    }

    @OriginalMember(owner = "client!wc", name = "h", descriptor = "()V")
    public final void method1199() {
        for (int var1 = 0; var1 < this.field3586; ++var1) {
            int var2 = this.field3598[var1];
            this.field3598[var1] = this.field3583[var1];
            this.field3583[var1] = -var2;
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "(II)I")
    private static final int method1200(int arg0, int arg1) {
        int var2 = (arg0 & 127) * arg1 >> 7;
        if (var2 < 2) {
            var2 = 2;
        } else if (var2 > 126) {
            var2 = 126;
        }
        return (arg0 & 65408) + var2;
    }

    @OriginalMember(owner = "client!wc", name = "a", descriptor = "([B)V")
    private final void method1201(byte[] arg0) {
        boolean var2 = false;
        boolean var3 = false;
        class91 var4 = new class91(arg0);
        class91 var5 = new class91(arg0);
        class91 var6 = new class91(arg0);
        class91 var7 = new class91(arg0);
        class91 var8 = new class91(arg0);
        var4.field2043 = arg0.length - 18;
        int var9 = var4.method641(255);
        int var10 = var4.method641(255);
        int var11 = var4.method649(false);
        int var12 = var4.method649(false);
        int var13 = var4.method649(false);
        int var14 = var4.method649(false);
        int var15 = var4.method649(false);
        int var16 = var4.method649(false);
        int var17 = var4.method641(255);
        int var18 = var4.method641(255);
        int var19 = var4.method641(255);
        int var20 = var4.method641(255);
        byte var21 = 0;
        int var23 = var9 + var21;
        int var25 = var10 + var23;
        int var26 = var25;
        if (var13 == 255) {
            var25 += var10;
        }
        int var27 = var25;
        if (var15 == 1) {
            var25 += var10;
        }
        int var28 = var25;
        if (var12 == 1) {
            var25 += var10;
        }
        int var29 = var25;
        if (var16 == 1) {
            var25 += var9;
        }
        int var30 = var25;
        if (var14 == 1) {
            var25 += var10;
        }
        int var32 = var20 + var25;
        int var34 = var10 * 2 + var32;
        int var36 = var11 * 6 + var34;
        int var38 = var17 + var36;
        int var40 = var18 + var38;
        int var10000 = var19 + var40;
        this.field3586 = var9;
        this.field3557 = var10;
        this.field3591 = var11;
        this.field3598 = new int[var9];
        this.field3576 = new int[var9];
        this.field3583 = new int[var9];
        this.field3573 = new int[var10];
        this.field3593 = new int[var10];
        this.field3553 = new int[var10];
        if (var11 > 0) {
            this.field3588 = new byte[var11];
            this.field3567 = new short[var11];
            this.field3561 = new short[var11];
            this.field3579 = new short[var11];
        }
        if (var16 == 1) {
            this.field3562 = new int[var9];
        }
        if (var12 == 1) {
            this.field3556 = new byte[var10];
            this.field3587 = new byte[var10];
            this.field3594 = new short[var10];
        }
        if (var13 == 255) {
            this.field3577 = new byte[var10];
        } else {
            this.field3581 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3558 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3580 = new int[var10];
        }
        this.field3574 = new short[var10];
        var4.field2043 = var21;
        var5.field2043 = var36;
        var6.field2043 = var38;
        var7.field2043 = var40;
        var8.field2043 = var29;
        int var43 = 0;
        int var44 = 0;
        int var45 = 0;
        for (int var46 = 0; var46 < var9; ++var46) {
            int var62 = var4.method649(false);
            int var63 = 0;
            if ((var62 & 1) != 0) {
                var63 = var5.method650(-64);
            }
            int var64 = 0;
            if ((var62 & 2) != 0) {
                var64 = var6.method650(-64);
            }
            int var65 = 0;
            if ((var62 & 4) != 0) {
                var65 = var7.method650(-64);
            }
            this.field3598[var46] = var43 + var63;
            this.field3576[var46] = var44 + var64;
            this.field3583[var46] = var45 + var65;
            var43 = this.field3598[var46];
            var44 = this.field3576[var46];
            var45 = this.field3583[var46];
            if (var16 == 1) {
                this.field3562[var46] = var8.method649(false);
            }
        }
        var4.field2043 = var32;
        var5.field2043 = var28;
        var6.field2043 = var26;
        var7.field2043 = var30;
        var8.field2043 = var27;
        for (int var47 = 0; var47 < var10; ++var47) {
            this.field3574[var47] = (short) var4.method641(255);
            if (var12 == 1) {
                int var61 = var5.method649(false);
                if ((var61 & 1) == 1) {
                    this.field3556[var47] = 1;
                    var2 = true;
                } else {
                    this.field3556[var47] = 0;
                }
                if ((var61 & 2) == 2) {
                    this.field3587[var47] = (byte) (var61 >> 2);
                    this.field3594[var47] = this.field3574[var47];
                    this.field3574[var47] = 127;
                    if (this.field3594[var47] != -1) {
                        var3 = true;
                    }
                } else {
                    this.field3587[var47] = -1;
                    this.field3594[var47] = -1;
                }
            }
            if (var13 == 255) {
                this.field3577[var47] = var6.method667((byte) -37);
            }
            if (var14 == 1) {
                this.field3558[var47] = var7.method667((byte) -37);
            }
            if (var15 == 1) {
                this.field3580[var47] = var8.method649(false);
            }
        }
        var4.field2043 = var25;
        var5.field2043 = var23;
        int var48 = 0;
        int var49 = 0;
        int var50 = 0;
        int var51 = 0;
        for (int var52 = 0; var52 < var10; ++var52) {
            int var57 = var5.method649(false);
            if (var57 == 1) {
                var48 = var4.method650(-64) + var51;
                var49 = var4.method650(-64) + var48;
                var50 = var4.method650(-64) + var49;
                var51 = var50;
                this.field3573[var52] = var48;
                this.field3593[var52] = var49;
                this.field3553[var52] = var50;
            }
            if (var57 == 2) {
                var49 = var50;
                var50 = var4.method650(-64) + var51;
                var51 = var50;
                this.field3573[var52] = var48;
                this.field3593[var52] = var49;
                this.field3553[var52] = var50;
            }
            if (var57 == 3) {
                var48 = var50;
                var50 = var4.method650(-64) + var51;
                var51 = var50;
                this.field3573[var52] = var48;
                this.field3593[var52] = var49;
                this.field3553[var52] = var50;
            }
            if (var57 == 4) {
                int var60 = var48;
                var48 = var49;
                var49 = var60;
                var50 = var4.method650(-64) + var51;
                var51 = var50;
                this.field3573[var52] = var48;
                this.field3593[var52] = var60;
                this.field3553[var52] = var50;
            }
        }
        var4.field2043 = var34;
        for (int var53 = 0; var53 < var11; ++var53) {
            this.field3588[var53] = 0;
            this.field3567[var53] = (short) var4.method641(255);
            this.field3561[var53] = (short) var4.method641(255);
            this.field3579[var53] = (short) var4.method641(255);
        }
        if (this.field3587 != null) {
            boolean var54 = false;
            for (int var55 = 0; var55 < var10; ++var55) {
                int var56 = this.field3587[var55] & 255;
                if (var56 != 255) {
                    if ((this.field3567[var56] & 65535) == this.field3573[var55] && (this.field3561[var56] & 65535) == this.field3593[var55] && (this.field3579[var56] & 65535) == this.field3553[var55]) {
                        this.field3587[var55] = -1;
                    } else {
                        var54 = true;
                    }
                }
            }
            if (!var54) {
                this.field3587 = null;
            }
        }
        if (!var3) {
            this.field3594 = null;
        }
        if (!var2) {
            this.field3556 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "(SS)V")
    public final void method1202(short arg0, short arg1) {
        if (this.field3594 != null) {
            for (int var3 = 0; var3 < this.field3557; ++var3) {
                if (this.field3594[var3] == arg0) {
                    this.field3594[var3] = arg1;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "i", descriptor = "()Lwc;")
    public final class156 method1203() {
        class156 var1 = new class156();
        if (this.field3556 != null) {
            var1.field3556 = new byte[this.field3557];
            for (int var2 = 0; var2 < this.field3557; ++var2) {
                var1.field3556[var2] = this.field3556[var2];
            }
        }
        var1.field3586 = this.field3586;
        var1.field3557 = this.field3557;
        var1.field3591 = this.field3591;
        var1.field3598 = this.field3598;
        var1.field3576 = this.field3576;
        var1.field3583 = this.field3583;
        var1.field3573 = this.field3573;
        var1.field3593 = this.field3593;
        var1.field3553 = this.field3553;
        var1.field3577 = this.field3577;
        var1.field3558 = this.field3558;
        var1.field3587 = this.field3587;
        var1.field3574 = this.field3574;
        var1.field3594 = this.field3594;
        var1.field3581 = this.field3581;
        var1.field3588 = this.field3588;
        var1.field3567 = this.field3567;
        var1.field3561 = this.field3561;
        var1.field3579 = this.field3579;
        var1.field3589 = this.field3589;
        var1.field3596 = this.field3596;
        var1.field3568 = this.field3568;
        var1.field3569 = this.field3569;
        var1.field3582 = this.field3582;
        var1.field3570 = this.field3570;
        var1.field3584 = this.field3584;
        var1.field3562 = this.field3562;
        var1.field3580 = this.field3580;
        var1.field3575 = this.field3575;
        var1.field3597 = this.field3597;
        var1.field3555 = this.field3555;
        var1.field3560 = this.field3560;
        var1.field3599 = this.field3599;
        var1.field3571 = this.field3571;
        return var1;
    }

    @OriginalMember(owner = "client!wc", name = "b", descriptor = "([B)V")
    private final void method1204(byte[] arg0) {
        class91 var2 = new class91(arg0);
        class91 var3 = new class91(arg0);
        class91 var4 = new class91(arg0);
        class91 var5 = new class91(arg0);
        class91 var6 = new class91(arg0);
        class91 var7 = new class91(arg0);
        class91 var8 = new class91(arg0);
        var2.field2043 = arg0.length - 23;
        int var9 = var2.method641(255);
        int var10 = var2.method641(255);
        int var11 = var2.method649(false);
        int var12 = var2.method649(false);
        int var13 = var2.method649(false);
        int var14 = var2.method649(false);
        int var15 = var2.method649(false);
        int var16 = var2.method649(false);
        int var17 = var2.method649(false);
        int var18 = var2.method641(255);
        int var19 = var2.method641(255);
        int var20 = var2.method641(255);
        int var21 = var2.method641(255);
        int var22 = var2.method641(255);
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        if (var11 > 0) {
            this.field3588 = new byte[var11];
            var2.field2043 = 0;
            for (int var26 = 0; var26 < var11; ++var26) {
                byte var27 = this.field3588[var26] = var2.method667((byte) -37);
                if (var27 == 0) {
                    ++var23;
                }
                if (var27 >= 1 && var27 <= 3) {
                    ++var24;
                }
                if (var27 == 2) {
                    ++var25;
                }
            }
        }
        int var30 = var9 + var11;
        int var31 = var30;
        if (var12 == 1) {
            var30 += var10;
        }
        int var33 = var10 + var30;
        int var34 = var33;
        if (var13 == 255) {
            var33 += var10;
        }
        int var35 = var33;
        if (var15 == 1) {
            var33 += var10;
        }
        int var36 = var33;
        if (var17 == 1) {
            var33 += var9;
        }
        int var37 = var33;
        if (var14 == 1) {
            var33 += var10;
        }
        int var39 = var21 + var33;
        int var40 = var39;
        if (var16 == 1) {
            var39 += var10 * 2;
        }
        int var42 = var22 + var39;
        int var44 = var10 * 2 + var42;
        int var46 = var18 + var44;
        int var48 = var19 + var46;
        int var50 = var20 + var48;
        int var52 = var23 * 6 + var50;
        int var54 = var24 * 6 + var52;
        int var56 = var24 * 6 + var54;
        int var58 = var24 * 2 + var56;
        int var60 = var24 + var58;
        int var62 = var24 * 2 + var25 * 2 + var60;
        this.field3586 = var9;
        this.field3557 = var10;
        this.field3591 = var11;
        this.field3598 = new int[var9];
        this.field3576 = new int[var9];
        this.field3583 = new int[var9];
        this.field3573 = new int[var10];
        this.field3593 = new int[var10];
        this.field3553 = new int[var10];
        if (var17 == 1) {
            this.field3562 = new int[var9];
        }
        if (var12 == 1) {
            this.field3556 = new byte[var10];
        }
        if (var13 == 255) {
            this.field3577 = new byte[var10];
        } else {
            this.field3581 = (byte) var13;
        }
        if (var14 == 1) {
            this.field3558 = new byte[var10];
        }
        if (var15 == 1) {
            this.field3580 = new int[var10];
        }
        if (var16 == 1) {
            this.field3594 = new short[var10];
        }
        if (var16 == 1 && var11 > 0) {
            this.field3587 = new byte[var10];
        }
        this.field3574 = new short[var10];
        if (var11 > 0) {
            this.field3567 = new short[var11];
            this.field3561 = new short[var11];
            this.field3579 = new short[var11];
            if (var24 > 0) {
                this.field3589 = new short[var24];
                this.field3596 = new short[var24];
                this.field3568 = new short[var24];
                this.field3569 = new short[var24];
                this.field3582 = new byte[var24];
                this.field3570 = new short[var24];
            }
            if (var25 > 0) {
                this.field3584 = new short[var25];
            }
        }
        var2.field2043 = var11;
        var3.field2043 = var44;
        var4.field2043 = var46;
        var5.field2043 = var48;
        var6.field2043 = var36;
        int var64 = 0;
        int var65 = 0;
        int var66 = 0;
        for (int var67 = 0; var67 < var9; ++var67) {
            int var81 = var2.method649(false);
            int var82 = 0;
            if ((var81 & 1) != 0) {
                var82 = var3.method650(-64);
            }
            int var83 = 0;
            if ((var81 & 2) != 0) {
                var83 = var4.method650(-64);
            }
            int var84 = 0;
            if ((var81 & 4) != 0) {
                var84 = var5.method650(-64);
            }
            this.field3598[var67] = var64 + var82;
            this.field3576[var67] = var65 + var83;
            this.field3583[var67] = var66 + var84;
            var64 = this.field3598[var67];
            var65 = this.field3576[var67];
            var66 = this.field3583[var67];
            if (var17 == 1) {
                this.field3562[var67] = var6.method649(false);
            }
        }
        var2.field2043 = var42;
        var3.field2043 = var31;
        var4.field2043 = var34;
        var5.field2043 = var37;
        var6.field2043 = var35;
        var7.field2043 = var40;
        var8.field2043 = var39;
        for (int var68 = 0; var68 < var10; ++var68) {
            this.field3574[var68] = (short) var2.method641(255);
            if (var12 == 1) {
                this.field3556[var68] = var3.method667((byte) -37);
            }
            if (var13 == 255) {
                this.field3577[var68] = var4.method667((byte) -37);
            }
            if (var14 == 1) {
                this.field3558[var68] = var5.method667((byte) -37);
            }
            if (var15 == 1) {
                this.field3580[var68] = var6.method649(false);
            }
            if (var16 == 1) {
                this.field3594[var68] = (short) (var7.method641(255) - 1);
            }
            if (this.field3587 != null && this.field3594[var68] != -1) {
                this.field3587[var68] = (byte) (var8.method649(false) - 1);
            }
        }
        var2.field2043 = var33;
        var3.field2043 = var30;
        int var69 = 0;
        int var70 = 0;
        int var71 = 0;
        int var72 = 0;
        for (int var73 = 0; var73 < var10; ++var73) {
            int var77 = var3.method649(false);
            if (var77 == 1) {
                var69 = var2.method650(-64) + var72;
                var70 = var2.method650(-64) + var69;
                var71 = var2.method650(-64) + var70;
                var72 = var71;
                this.field3573[var73] = var69;
                this.field3593[var73] = var70;
                this.field3553[var73] = var71;
            }
            if (var77 == 2) {
                var70 = var71;
                var71 = var2.method650(-64) + var72;
                var72 = var71;
                this.field3573[var73] = var69;
                this.field3593[var73] = var70;
                this.field3553[var73] = var71;
            }
            if (var77 == 3) {
                var69 = var71;
                var71 = var2.method650(-64) + var72;
                var72 = var71;
                this.field3573[var73] = var69;
                this.field3593[var73] = var70;
                this.field3553[var73] = var71;
            }
            if (var77 == 4) {
                int var80 = var69;
                var69 = var70;
                var70 = var80;
                var71 = var2.method650(-64) + var72;
                var72 = var71;
                this.field3573[var73] = var69;
                this.field3593[var73] = var80;
                this.field3553[var73] = var71;
            }
        }
        var2.field2043 = var50;
        var3.field2043 = var52;
        var4.field2043 = var54;
        var5.field2043 = var56;
        var6.field2043 = var58;
        var7.field2043 = var60;
        for (int var74 = 0; var74 < var11; ++var74) {
            int var76 = this.field3588[var74] & 255;
            if (var76 == 0) {
                this.field3567[var74] = (short) var2.method641(255);
                this.field3561[var74] = (short) var2.method641(255);
                this.field3579[var74] = (short) var2.method641(255);
            }
            if (var76 == 1) {
                this.field3567[var74] = (short) var3.method641(255);
                this.field3561[var74] = (short) var3.method641(255);
                this.field3579[var74] = (short) var3.method641(255);
                this.field3589[var74] = (short) var4.method641(255);
                this.field3596[var74] = (short) var4.method641(255);
                this.field3568[var74] = (short) var4.method641(255);
                this.field3569[var74] = (short) var5.method641(255);
                this.field3582[var74] = var6.method667((byte) -37);
                this.field3570[var74] = (short) var7.method641(255);
            }
            if (var76 == 2) {
                this.field3567[var74] = (short) var3.method641(255);
                this.field3561[var74] = (short) var3.method641(255);
                this.field3579[var74] = (short) var3.method641(255);
                this.field3589[var74] = (short) var4.method641(255);
                this.field3596[var74] = (short) var4.method641(255);
                this.field3568[var74] = (short) var4.method641(255);
                this.field3569[var74] = (short) var5.method641(255);
                this.field3582[var74] = var6.method667((byte) -37);
                this.field3570[var74] = (short) var7.method641(255);
                this.field3584[var74] = (short) var7.method641(255);
            }
            if (var76 == 3) {
                this.field3567[var74] = (short) var3.method641(255);
                this.field3561[var74] = (short) var3.method641(255);
                this.field3579[var74] = (short) var3.method641(255);
                this.field3589[var74] = (short) var4.method641(255);
                this.field3596[var74] = (short) var4.method641(255);
                this.field3568[var74] = (short) var4.method641(255);
                this.field3569[var74] = (short) var5.method641(255);
                this.field3582[var74] = var6.method667((byte) -37);
                this.field3570[var74] = (short) var7.method641(255);
            }
        }
        var2.field2043 = var62;
        int var75 = var2.method649(false);
        if (var75 != 0) {
            new class76();
            var2.method641(255);
            var2.method641(255);
            var2.method641(255);
            var2.method631(-69);
        }
    }

    @OriginalMember(owner = "client!wc", name = "j", descriptor = "()V")
    private final void method1205() {
        int var10002;
        if (this.field3562 != null) {
            int[] var1 = new int[256];
            int var2 = 0;
            for (int var3 = 0; var3 < this.field3586; ++var3) {
                int var7 = this.field3562[var3];
                var10002 = var1[var7]++;
                if (var7 > var2) {
                    var2 = var7;
                }
            }
            this.field3575 = new int[var2 + 1][];
            for (int var4 = 0; var4 <= var2; ++var4) {
                this.field3575[var4] = new int[var1[var4]];
                var1[var4] = 0;
            }
            int var5 = 0;
            while (var5 < this.field3586) {
                int var6 = this.field3562[var5];
                this.field3575[var6][var1[var6]++] = var5++;
            }
            this.field3562 = null;
        }
        if (this.field3580 != null) {
            int[] var8 = new int[256];
            int var9 = 0;
            for (int var10 = 0; var10 < this.field3557; ++var10) {
                int var14 = this.field3580[var10];
                var10002 = var8[var14]++;
                if (var14 > var9) {
                    var9 = var14;
                }
            }
            this.field3597 = new int[var9 + 1][];
            for (int var11 = 0; var11 <= var9; ++var11) {
                this.field3597[var11] = new int[var8[var11]];
                var8[var11] = 0;
            }
            int var12 = 0;
            while (var12 < this.field3557) {
                int var13 = this.field3580[var12];
                this.field3597[var13][var8[var13]++] = var12++;
            }
            this.field3580 = null;
        }
    }

    @OriginalMember(owner = "client!wc", name = "d", descriptor = "(III)V")
    public final void method1206(int arg0, int arg1, int arg2) {
        for (int var4 = 0; var4 < this.field3586; ++var4) {
            this.field3598[var4] += arg0;
            this.field3576[var4] += arg1;
            this.field3583[var4] += arg2;
        }
        this.method1185();
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "()V")
    private class156() {
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([B)V")
    private class156(byte[] arg0) {
        if (arg0[arg0.length - 1] == -1 && arg0[arg0.length - 2] == -1) {
            this.method1204(arg0);
        } else {
            this.method1201(arg0);
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "([Lwc;I)V")
    public class156(class156[] arg0, int arg1) {
        boolean var3 = false;
        boolean var4 = false;
        boolean var5 = false;
        boolean var6 = false;
        boolean var7 = false;
        boolean var8 = false;
        this.field3586 = 0;
        this.field3557 = 0;
        this.field3591 = 0;
        this.field3581 = -1;
        for (int var9 = 0; var9 < arg1; ++var9) {
            class156 var15 = arg0[var9];
            if (var15 != null) {
                this.field3586 += var15.field3586;
                this.field3557 += var15.field3557;
                this.field3591 += var15.field3591;
                if (var15.field3577 != null) {
                    var4 = true;
                } else {
                    if (this.field3581 == -1) {
                        this.field3581 = var15.field3581;
                    }
                    if (this.field3581 != var15.field3581) {
                        var4 = true;
                    }
                }
                var3 |= var15.field3556 != null;
                var5 |= var15.field3558 != null;
                var6 |= var15.field3580 != null;
                var7 |= var15.field3594 != null;
                var8 |= var15.field3587 != null;
            }
        }
        this.field3598 = new int[this.field3586];
        this.field3576 = new int[this.field3586];
        this.field3583 = new int[this.field3586];
        this.field3562 = new int[this.field3586];
        this.field3573 = new int[this.field3557];
        this.field3593 = new int[this.field3557];
        this.field3553 = new int[this.field3557];
        if (var3) {
            this.field3556 = new byte[this.field3557];
        }
        if (var4) {
            this.field3577 = new byte[this.field3557];
        }
        if (var5) {
            this.field3558 = new byte[this.field3557];
        }
        if (var6) {
            this.field3580 = new int[this.field3557];
        }
        if (var7) {
            this.field3594 = new short[this.field3557];
        }
        if (var8) {
            this.field3587 = new byte[this.field3557];
        }
        this.field3574 = new short[this.field3557];
        if (this.field3591 > 0) {
            this.field3588 = new byte[this.field3591];
            this.field3567 = new short[this.field3591];
            this.field3561 = new short[this.field3591];
            this.field3579 = new short[this.field3591];
            this.field3589 = new short[this.field3591];
            this.field3596 = new short[this.field3591];
            this.field3568 = new short[this.field3591];
            this.field3569 = new short[this.field3591];
            this.field3582 = new byte[this.field3591];
            this.field3570 = new short[this.field3591];
            this.field3584 = new short[this.field3591];
        }
        this.field3586 = 0;
        this.field3557 = 0;
        this.field3591 = 0;
        for (int var10 = 0; var10 < arg1; ++var10) {
            class156 var11 = arg0[var10];
            if (var11 != null) {
                for (int var12 = 0; var12 < var11.field3557; ++var12) {
                    if (var3 && var11.field3556 != null) {
                        this.field3556[this.field3557] = var11.field3556[var12];
                    }
                    if (var4) {
                        if (var11.field3577 != null) {
                            this.field3577[this.field3557] = var11.field3577[var12];
                        } else {
                            this.field3577[this.field3557] = var11.field3581;
                        }
                    }
                    if (var5 && var11.field3558 != null) {
                        this.field3558[this.field3557] = var11.field3558[var12];
                    }
                    if (var6 && var11.field3580 != null) {
                        this.field3580[this.field3557] = var11.field3580[var12];
                    }
                    if (var7) {
                        if (var11.field3594 != null) {
                            this.field3594[this.field3557] = var11.field3594[var12];
                        } else {
                            this.field3594[this.field3557] = -1;
                        }
                    }
                    if (var8) {
                        if (var11.field3587 != null && var11.field3587[var12] != -1) {
                            this.field3587[this.field3557] = (byte) (var11.field3587[var12] + this.field3591);
                        } else {
                            this.field3587[this.field3557] = -1;
                        }
                    }
                    this.field3574[this.field3557] = var11.field3574[var12];
                    this.field3573[this.field3557] = this.method1198(var11, var11.field3573[var12]);
                    this.field3593[this.field3557] = this.method1198(var11, var11.field3593[var12]);
                    this.field3553[this.field3557] = this.method1198(var11, var11.field3553[var12]);
                    ++this.field3557;
                }
                for (int var13 = 0; var13 < var11.field3591; ++var13) {
                    byte var14 = this.field3588[this.field3591] = var11.field3588[var13];
                    if (var14 == 0) {
                        this.field3567[this.field3591] = (short) this.method1198(var11, var11.field3567[var13]);
                        this.field3561[this.field3591] = (short) this.method1198(var11, var11.field3561[var13]);
                        this.field3579[this.field3591] = (short) this.method1198(var11, var11.field3579[var13]);
                    }
                    if (var14 >= 1 && var14 <= 3) {
                        this.field3567[this.field3591] = var11.field3567[var13];
                        this.field3561[this.field3591] = var11.field3561[var13];
                        this.field3579[this.field3591] = var11.field3579[var13];
                        this.field3589[this.field3591] = var11.field3589[var13];
                        this.field3596[this.field3591] = var11.field3596[var13];
                        this.field3568[this.field3591] = var11.field3568[var13];
                        this.field3569[this.field3591] = var11.field3569[var13];
                        this.field3582[this.field3591] = var11.field3582[var13];
                        this.field3570[this.field3591] = var11.field3570[var13];
                    }
                    if (var14 == 2) {
                        this.field3584[this.field3591] = var11.field3584[var13];
                    }
                    ++this.field3591;
                }
            }
        }
    }

    @OriginalMember(owner = "client!wc", name = "<init>", descriptor = "(Lwc;ZZZZ)V")
    public class156(class156 arg0, boolean arg1, boolean arg2, boolean arg3, boolean arg4) {
        this.field3586 = arg0.field3586;
        this.field3557 = arg0.field3557;
        this.field3591 = arg0.field3591;
        if (arg1) {
            this.field3598 = arg0.field3598;
            this.field3576 = arg0.field3576;
            this.field3583 = arg0.field3583;
        } else {
            this.field3598 = new int[this.field3586];
            this.field3576 = new int[this.field3586];
            this.field3583 = new int[this.field3586];
            for (int var6 = 0; var6 < this.field3586; ++var6) {
                this.field3598[var6] = arg0.field3598[var6];
                this.field3576[var6] = arg0.field3576[var6];
                this.field3583[var6] = arg0.field3583[var6];
            }
        }
        if (arg2) {
            this.field3574 = arg0.field3574;
        } else {
            this.field3574 = new short[this.field3557];
            for (int var7 = 0; var7 < this.field3557; ++var7) {
                this.field3574[var7] = arg0.field3574[var7];
            }
        }
        if (!arg3 && arg0.field3594 != null) {
            this.field3594 = new short[this.field3557];
            for (int var8 = 0; var8 < this.field3557; ++var8) {
                this.field3594[var8] = arg0.field3594[var8];
            }
        } else {
            this.field3594 = arg0.field3594;
        }
        if (arg4) {
            this.field3558 = arg0.field3558;
        } else {
            this.field3558 = new byte[this.field3557];
            if (arg0.field3558 == null) {
                for (int var9 = 0; var9 < this.field3557; ++var9) {
                    this.field3558[var9] = 0;
                }
            } else {
                for (int var10 = 0; var10 < this.field3557; ++var10) {
                    this.field3558[var10] = arg0.field3558[var10];
                }
            }
        }
        this.field3573 = arg0.field3573;
        this.field3593 = arg0.field3593;
        this.field3553 = arg0.field3553;
        this.field3556 = arg0.field3556;
        this.field3577 = arg0.field3577;
        this.field3587 = arg0.field3587;
        this.field3581 = arg0.field3581;
        this.field3588 = arg0.field3588;
        this.field3567 = arg0.field3567;
        this.field3561 = arg0.field3561;
        this.field3579 = arg0.field3579;
        this.field3589 = arg0.field3589;
        this.field3596 = arg0.field3596;
        this.field3568 = arg0.field3568;
        this.field3569 = arg0.field3569;
        this.field3582 = arg0.field3582;
        this.field3570 = arg0.field3570;
        this.field3584 = arg0.field3584;
        this.field3562 = arg0.field3562;
        this.field3580 = arg0.field3580;
        this.field3575 = arg0.field3575;
        this.field3597 = arg0.field3597;
        this.field3555 = arg0.field3555;
        this.field3560 = arg0.field3560;
        this.field3566 = arg0.field3566;
        this.field3599 = arg0.field3599;
        this.field3571 = arg0.field3571;
    }
}
