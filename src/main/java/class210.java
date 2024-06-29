import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class210 extends class89 {

    @OriginalMember(owner = "client!jh", name = "R", descriptor = "Z")
    private boolean field3542 = true;

    @OriginalMember(owner = "client!jh", name = "W", descriptor = "I")
    private int field3547 = 4;

    @OriginalMember(owner = "client!jh", name = "S", descriptor = "I")
    private int field3543 = 4;

    @OriginalMember(owner = "client!jh", name = "bb", descriptor = "[B")
    private byte[] field3552 = new byte[512];

    @OriginalMember(owner = "client!jh", name = "nb", descriptor = "I")
    private int field3564 = 4;

    @OriginalMember(owner = "client!jh", name = "mb", descriptor = "I")
    private int field3563 = 0;

    @OriginalMember(owner = "client!jh", name = "pb", descriptor = "I")
    private int field3566 = 1638;

    @OriginalMember(owner = "client!jh", name = "Q", descriptor = "Lda;")
    public static class275 field3541 = class255.method1672(101, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!jh", name = "ab", descriptor = "Lda;")
    public static class275 field3551 = class255.method1672(98, "Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3");

    @OriginalMember(owner = "client!jh", name = "hb", descriptor = "I")
    public static int field3558 = 0;

    @OriginalMember(owner = "client!jh", name = "Z", descriptor = "Lda;")
    public static class275 field3550 = null;

    @OriginalMember(owner = "client!jh", name = "T", descriptor = "I")
    public static int field3544;

    @OriginalMember(owner = "client!jh", name = "U", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!jh", name = "V", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!jh", name = "X", descriptor = "I")
    public static int field3548;

    @OriginalMember(owner = "client!jh", name = "eb", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!jh", name = "fb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!jh", name = "gb", descriptor = "I")
    public static int field3557;

    @OriginalMember(owner = "client!jh", name = "ib", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!jh", name = "jb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!jh", name = "lb", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!jh", name = "ob", descriptor = "I")
    public static int field3565;

    @OriginalMember(owner = "client!jh", name = "qb", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!jh", name = "rb", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!jh", name = "cb", descriptor = "Lma;")
    public static class105 field3553;

    @OriginalMember(owner = "client!jh", name = "kb", descriptor = "[I")
    public static int[] field3561;

    @OriginalMember(owner = "client!jh", name = "Y", descriptor = "[S")
    private short[] field3549;

    @OriginalMember(owner = "client!jh", name = "db", descriptor = "[S")
    private short[] field3554;

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIII)I")
    public static final int method1347(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        ++field3548;
        if ((1 & arg6) == 1) {
            int var7 = arg5;
            arg5 = arg2;
            arg2 = var7;
        }
        if (arg4 > -105) {
            method1352(-20, -30);
        }
        int var8 = arg3 & 3;
        if (var8 == 0) {
            return arg0;
        } else if (var8 == 1) {
            return arg1;
        } else {
            return ~var8 == -3 ? -arg5 - (-1 - -arg0 - 7) : -arg2 + 8 + -arg1;
        }
    }

    @OriginalMember(owner = "client!jh", name = "<init>", descriptor = "()V")
    public class210() {
        super(0, true);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(Z)V")
    private final void method1348(boolean arg0) {
        ++field3544;
        if (!arg0) {
            method1347(-58, 18, -82, -50, -2, -59, -106);
        }
        if (this.field3566 <= 0) {
            if (this.field3554 != null && ~this.field3554.length == ~this.field3564) {
                this.field3549 = new short[this.field3564];
                for (int var2 = 0; var2 < this.field3564; ++var2) {
                    this.field3549[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
                return;
            }
        } else {
            this.field3549 = new short[this.field3564];
            this.field3554 = new short[this.field3564];
            for (int var3 = 0; ~var3 > ~this.field3564; ++var3) {
                this.field3554[var3] = (short) ((int) (Math.pow((double) ((float) this.field3566 / 4096.0F), (double) var3) * 4096.0D));
                this.field3549[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
            }
        }
    }

    @OriginalMember(owner = "client!jh", name = "i", descriptor = "(I)V")
    public static void method1349(int arg0) {
        field3561 = null;
        if (arg0 == 25089) {
            field3550 = null;
            field3553 = null;
            field3541 = null;
            field3551 = null;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IZ)[I")
    public final int[] method239(int arg0, boolean arg1) {
        ++field3545;
        int[] var3 = super.field1503.method229(arg0, (byte) -71);
        if (super.field1503.field664) {
            this.method1356(var3, arg0, 18361);
        }
        if (arg1) {
            this.method1356((int[]) null, -51, 101);
        }
        return var3;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIIBI)I")
    private final int method1350(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5, int arg6) {
        ++field3568;
        int var8 = arg0 - 4096;
        int var9 = arg1 >> 12;
        int var10 = var9 - -1;
        int var11 = var9 & 255;
        int var12 = arg1 & 4095;
        int var13 = var12 + -4096;
        if (var10 >= arg2) {
            var10 = 0;
        }
        int var14 = var10 & 255;
        int var15 = 3 & this.field3552[arg3 + var11];
        int var16;
        if (~var15 >= -2) {
            var16 = var15 == 0 ? arg0 + var12 : -var12 + arg0;
        } else {
            var16 = ~var15 != -3 ? -var12 - arg0 : var12 - arg0;
        }
        int var17 = class129.field2274[var12];
        int var18 = this.field3552[arg3 + var14] & 3;
        int var19;
        if (var18 > 1) {
            var19 = ~var18 != -3 ? -var13 - arg0 : -arg0 + var13;
        } else {
            var19 = var18 == 0 ? var13 - -arg0 : -var13 + arg0;
        }
        int var20 = var16 - -((var19 - var16) * var17 >> 12);
        int var21 = 3 & this.field3552[arg6 + var11];
        int var22;
        if (var21 <= 1) {
            var22 = var21 != 0 ? var8 - var12 : var12 - -var8;
        } else {
            var22 = ~var21 != -3 ? -var8 + -var12 : -var8 + var12;
        }
        int var23 = this.field3552[arg6 + var14] & 3;
        int var24;
        if (~var23 >= -2) {
            var24 = var23 != 0 ? -var13 + var8 : var8 + var13;
        } else {
            var24 = ~var23 != -3 ? -var8 + -var13 : -var8 + var13;
        }
        int var25 = var22 - -((var24 - var22) * var17 >> 12);
        return arg5 <= 66 ? 110 : var20 - -((-var20 + var25) * arg4 >> 12);
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(IIIIII)V")
    public static final void method1351(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3546;
        if (arg5 != 13193) {
            method1354(73, -65);
        }
        if (arg1 == arg4) {
            class249.method1633(arg3, arg0, arg2, (byte) 77, arg1);
        } else if (class246.field4355 <= -arg1 + arg2 && arg1 + arg2 <= class96.field1632 && class149.field2603 <= -arg4 + arg0 && class141.field2493 >= arg0 + arg4) {
            class160.method1117(-1063810718, arg1, arg0, arg4, arg2, arg3);
        } else {
            class265.method1747(arg1, arg5 + 1785773976, arg4, arg3, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!jh", name = "b", descriptor = "(II)Lwh;")
    public static final class245 method1352(int arg0, int arg1) {
        ++field3555;
        class245 var2 = (class245) class9.field146.method990((long) arg1, (byte) -126);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class51.field841.method775(class197.method1285(arg1, 12848), class258.method1683(false, arg1), -24799);
            if (arg0 <= 23) {
                method1347(25, -120, -66, -120, 102, 48, -107);
            }
            class245 var4 = new class245();
            var4.field4320 = arg1;
            if (var3 != null) {
                var4.method1594((byte) 86, new class85(var3));
            }
            var4.method1600(1);
            if (var4.field4311 != -1) {
                var4.method1598((byte) -85, method1352(26, var4.field4297), method1352(49, var4.field4311));
            }
            if (var4.field4329 != -1) {
                var4.method1601(method1352(115, var4.field4265), true, method1352(116, var4.field4329));
            }
            if (!class4.field59 && var4.field4268) {
                var4.field4287 = null;
                var4.field4322 = class197.field3368;
                var4.field4279 = 0;
                var4.field4305 = false;
                var4.field4312 = null;
            }
            class9.field146.method986(0, (long) arg1, var4);
            return var4;
        }
    }

    @OriginalMember(owner = "client!jh", name = "e", descriptor = "(I)V")
    public final void method234(int arg0) {
        ++field3567;
        this.field3552 = class160.method1120(this.field3563, -15246);
        this.method1348(true);
        if (arg0 != 1) {
            field3553 = null;
        }
        for (int var2 = this.field3564 + -1; var2 >= 1; --var2) {
            short var3 = this.field3554[var2];
            if (var3 > 8) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field3564;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILij;I)V")
    public final void method49(int arg0, class85 arg1, int arg2) {
        if (arg0 != -20503) {
            field3551 = null;
        }
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 == 6) {
                                    this.field3547 = arg1.method564((byte) 94);
                                }
                            } else {
                                this.field3543 = arg1.method564((byte) 111);
                            }
                        } else {
                            this.field3563 = arg1.method564((byte) 95);
                        }
                    } else {
                        this.field3543 = this.field3547 = arg1.method564((byte) 106);
                    }
                } else {
                    this.field3566 = arg1.method570(255);
                    if (~this.field3566 > -1) {
                        this.field3554 = new short[this.field3564];
                        for (int var5 = 0; var5 < this.field3564; ++var5) {
                            this.field3554[var5] = (short) arg1.method570(255);
                        }
                    }
                }
            } else {
                this.field3564 = arg1.method564((byte) 81);
            }
        } else {
            this.field3542 = ~arg1.method564((byte) 86) == -2;
        }
        ++field3560;
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILma;IB)Z")
    public static final boolean method1353(int arg0, class105 arg1, int arg2, byte arg3) {
        ++field3562;
        byte[] var4 = arg1.method775(arg2, arg0, -24799);
        if (arg3 > -3) {
            field3541 = null;
        }
        if (var4 == null) {
            return false;
        } else {
            class93.method672(var4, (byte) -39);
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "c", descriptor = "(II)Z")
    public static final boolean method1354(int arg0, int arg1) {
        ++field3557;
        if (~arg1 > -33) {
            return false;
        } else if (arg1 == 127) {
            return false;
        } else if (~arg1 <= -130 && arg1 <= 159) {
            return false;
        } else {
            if (arg0 <= 57) {
                field3561 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "(ILij;)Lvj;")
    public static final class87 method1355(int arg0, class85 arg1) {
        if (arg0 != -4113) {
            method1349(-50);
        }
        ++field3556;
        return new class87(arg1.method570(arg0 ^ -4336), arg1.method570(255), arg1.method570(arg0 + 4368), arg1.method570(255), arg1.method598(97), arg1.method564((byte) 118));
    }

    @OriginalMember(owner = "client!jh", name = "a", descriptor = "([III)V")
    private final void method1356(int[] arg0, int arg1, int arg2) {
        ++field3559;
        int var4 = class91.field1552[arg1] * this.field3547;
        if (arg2 == 18361) {
            if (~this.field3564 != -2) {
                short var5 = this.field3554[0];
                if (var5 > 8 || ~var5 > 7) {
                    int var6 = this.field3549[0] << 12;
                    int var7 = this.field3547 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = var8 >> 12;
                    int var10 = this.field3543 * var6 >> 12;
                    int var11 = var8 & 4095;
                    int var12 = var9 - -1;
                    int var13 = this.field3552[var9 & 255] & 255;
                    if (var7 <= var12) {
                        var12 = 0;
                    }
                    int var14 = class129.field2274[var11];
                    int var15 = 255 & this.field3552[var12 & 255];
                    for (int var16 = 0; var16 < class65.field1070; ++var16) {
                        int var36 = class185.field3172[var16] * this.field3543;
                        int var37 = this.method1350(var11, var6 * var36 >> 12, var10, var13, var14, (byte) 107, var15);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; ~var17 > ~this.field3564; ++var17) {
                    short var18 = this.field3554[var17];
                    if (var18 > 8 || var18 < -8) {
                        int var19 = this.field3549[var17] << 12;
                        int var20 = this.field3547 * var19 >> 12;
                        int var21 = this.field3543 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var23 - -1;
                        int var25 = var22 & 4095;
                        int var26 = class129.field2274[var25];
                        int var27 = 255 & this.field3552[var23 & 255];
                        if (var20 <= var24) {
                            var24 = 0;
                        }
                        int var28 = this.field3552[var24 & 255] & 255;
                        if (this.field3542 && ~(this.field3564 + -1) == ~var17) {
                            for (int var29 = 0; ~class65.field1070 < ~var29; ++var29) {
                                int var30 = class185.field3172[var29] * this.field3543;
                                int var31 = this.method1350(var25, var19 * var30 >> 12, var21, var27, var26, (byte) 111, var28);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = 2048 - -(var32 >> 1);
                            }
                        } else {
                            for (int var33 = 0; var33 < class65.field1070; ++var33) {
                                int var34 = class185.field3172[var33] * this.field3543;
                                int var35 = this.method1350(var25, var19 * var34 >> 12, var21, var27, var26, (byte) 120, var28);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                int var38 = this.field3549[0] << 12;
                short var39 = this.field3554[0];
                int var40 = this.field3547 * var38 >> 12;
                int var41 = this.field3543 * var38 >> 12;
                int var42 = var4 * var38 >> 12;
                int var43 = var42 >> 12;
                int var44 = var43 + 1;
                if (~var40 >= ~var44) {
                    var44 = 0;
                }
                int var45 = var42 & 4095;
                int var46 = 255 & this.field3552[255 & var44];
                int var47 = this.field3552[var43 & 255] & 255;
                int var48 = class129.field2274[var45];
                if (this.field3542) {
                    for (int var49 = 0; ~var49 > ~class65.field1070; ++var49) {
                        int var50 = class185.field3172[var49] * this.field3543;
                        int var51 = this.method1350(var45, var38 * var50 >> 12, var41, var47, var48, (byte) 88, var46);
                        int var52 = var39 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; ~class65.field1070 < ~var53; ++var53) {
                        int var54 = class185.field3172[var53] * this.field3543;
                        int var55 = this.method1350(var45, var38 * var54 >> 12, var41, var47, var48, (byte) 92, var46);
                        arg0[var53] = var39 * var55 >> 12;
                    }
                }
            }
        }
    }
}
