import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class508 extends class148 {

    @OriginalMember(owner = "client!cp", name = "N", descriptor = "I")
    private int field7412 = 0;

    @OriginalMember(owner = "client!cp", name = "R", descriptor = "I")
    private int field7416 = 0;

    @OriginalMember(owner = "client!cp", name = "X", descriptor = "I")
    private int field7422 = 0;

    @OriginalMember(owner = "client!cp", name = "J", descriptor = "I")
    public static int field7408;

    @OriginalMember(owner = "client!cp", name = "K", descriptor = "I")
    public static int field7409;

    @OriginalMember(owner = "client!cp", name = "M", descriptor = "I")
    private int field7411;

    @OriginalMember(owner = "client!cp", name = "O", descriptor = "I")
    public static int field7413;

    @OriginalMember(owner = "client!cp", name = "P", descriptor = "I")
    public static int field7414;

    @OriginalMember(owner = "client!cp", name = "Q", descriptor = "I")
    private int field7415;

    @OriginalMember(owner = "client!cp", name = "S", descriptor = "I")
    private int field7417;

    @OriginalMember(owner = "client!cp", name = "T", descriptor = "I")
    public static int field7418;

    @OriginalMember(owner = "client!cp", name = "U", descriptor = "I")
    private int field7419;

    @OriginalMember(owner = "client!cp", name = "V", descriptor = "I")
    private int field7420;

    @OriginalMember(owner = "client!cp", name = "W", descriptor = "I")
    private int field7421;

    @OriginalMember(owner = "client!cp", name = "Z", descriptor = "I")
    public static int field7424;

    @OriginalMember(owner = "client!cp", name = "ab", descriptor = "I")
    public static int field7425;

    @OriginalMember(owner = "client!cp", name = "L", descriptor = "[I")
    public static int[] field7410;

    @OriginalMember(owner = "client!cp", name = "Y", descriptor = "[[[Lfl;")
    public static class518[][][] field7423;

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIZI)V")
    private final void method3006(int arg0, int arg1, boolean arg2, int arg3) {
        ++field7424;
        int var5 = ~arg0 > ~arg3 ? arg3 : arg0;
        int var6 = arg1 <= var5 ? var5 : arg1;
        int var7 = arg3 < arg0 ? arg3 : arg0;
        int var8 = arg1 >= var7 ? var7 : arg1;
        this.field7415 = (var6 + var8) / 2;
        int var9 = var6 - var8;
        if (arg2) {
            if (~var9 < -1) {
                int var10 = (-arg3 + var6 << 12) / var9;
                int var11 = (-arg0 + var6 << 12) / var9;
                int var12 = (var6 - arg1 << 12) / var9;
                if (arg3 != var6) {
                    if (arg0 == var6) {
                        this.field7417 = ~arg1 == ~var8 ? var10 + 4096 : -var12 + 12288;
                    } else {
                        this.field7417 = ~arg3 != ~var8 ? 20480 - var10 : var11 + 12288;
                    }
                } else {
                    this.field7417 = ~arg0 == ~var8 ? var12 + 20480 : -var11 + 4096;
                }
                this.field7417 /= 6;
            } else {
                this.field7417 = 0;
            }
            if (~this.field7415 < -1 && ~this.field7415 > -4097) {
                this.field7411 = (var9 << 12) / (this.field7415 <= 2048 ? this.field7415 * 2 : -(this.field7415 * 2) + 8192);
            } else {
                this.field7411 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!cp", name = "<init>", descriptor = "()V")
    public class508() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIFIF[FIIFIIII)V")
    public static final void method3007(int arg0, int arg1, float arg2, int arg3, float arg4, float[] arg5, int arg6, int arg7, float arg8, int arg9, int arg10, int arg11, int arg12) {
        int var13 = arg3 - arg0;
        int var14 = arg12 - arg11;
        int var15 = arg1 - arg6;
        ++field7418;
        float var16 = arg5[2] * (float) var15 + arg5[1] * (float) var13 + arg5[0] * (float) var14;
        float var17 = arg5[5] * (float) var15 + arg5[4] * (float) var13 + arg5[3] * (float) var14;
        float var18 = arg5[8] * (float) var15 + arg5[6] * (float) var14 + arg5[7] * (float) var13;
        float var19;
        float var20;
        if (arg7 != 0) {
            if (~arg7 != -2) {
                if (arg7 == 2) {
                    var19 = -var17 + arg4 + 0.5F;
                    var20 = -var16 + arg2 + 0.5F;
                } else if (~arg7 != -4) {
                    if (~arg7 == -5) {
                        var19 = -var17 + arg4 + 0.5F;
                        var20 = arg8 + var18 + 0.5F;
                    } else {
                        var19 = -var17 + arg4 + 0.5F;
                        var20 = -var18 + arg8 + 0.5F;
                    }
                } else {
                    var19 = -var17 + arg4 + 0.5F;
                    var20 = arg2 + var16 + 0.5F;
                }
            } else {
                var20 = arg2 + var16 + 0.5F;
                var19 = arg8 + var18 + 0.5F;
            }
        } else {
            var19 = -var18 + arg8 + 0.5F;
            var20 = arg2 + var16 + 0.5F;
        }
        if (arg9 != 1) {
            if (~arg9 == -3) {
                var19 = -var19;
                var20 = -var20;
            } else if (~arg9 == -4) {
                float var21 = var20;
                var20 = var19;
                var19 = -var21;
            }
        } else {
            float var22 = var20;
            var20 = -var19;
            var19 = var22;
        }
        class2.field34 = var20;
        if (arg10 <= 48) {
            method3009(120, -120, 96, (byte) -6);
        }
        class227.field3362 = var19;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method27(boolean arg0, int arg1) {
        ++field7409;
        int[][] var3 = super.field2189.method2422(-2, arg1);
        if (super.field2189.field6033) {
            int[][] var4 = this.method974(true, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; var11 < class320.field4579; ++var11) {
                this.method3006(var6[var11], var7[var11], true, var5[var11]);
                this.field7417 += this.field7412;
                this.field7415 += this.field7416;
                this.field7411 += this.field7422;
                while (~this.field7417 > -1) {
                    this.field7417 += 4096;
                }
                if (~this.field7411 > -1) {
                    this.field7411 = 0;
                }
                while (~this.field7417 < -4097) {
                    this.field7417 -= 4096;
                }
                if (this.field7415 < 0) {
                    this.field7415 = 0;
                }
                if (this.field7411 > 4096) {
                    this.field7411 = 4096;
                }
                if (~this.field7415 < -4097) {
                    this.field7415 = 4096;
                }
                this.method3011(this.field7417, this.field7415, 4, this.field7411);
                var8[var11] = this.field7419;
                var9[var11] = this.field7421;
                var10[var11] = this.field7420;
            }
        }
        if (!arg0) {
            field7410 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(ILdh;I)V")
    public final void method23(int arg0, class209 arg1, int arg2) {
        int var4 = 63 % ((arg2 - -88) / 33);
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field7416 = (arg1.method1417(false) << 12) / 100;
                }
            } else {
                this.field7422 = (arg1.method1417(false) << 12) / 100;
            }
        } else {
            this.field7412 = arg1.method1447(29480);
        }
        ++field7414;
    }

    @OriginalMember(owner = "client!cp", name = "e", descriptor = "(I)V")
    public static void method3008(int arg0) {
        field7410 = null;
        field7423 = null;
        if (arg0 >= -72) {
            field7410 = null;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIIB)V")
    public static final void method3009(int arg0, int arg1, int arg2, byte arg3) {
        if (arg3 == -66) {
            ++field7408;
            class338 var4 = class230.method1580(11, arg3 ^ 1332166390, arg0);
            var4.method2053(-78);
            var4.field4756 = arg1;
            var4.field4751 = arg2;
        }
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(BII)Z")
    public static final boolean method3010(byte arg0, int arg1, int arg2) {
        int var3 = 119 / (arg0 / 39);
        ++field7425;
        return class163.method1131(arg1, arg2, false) & class397.method2402((byte) -82, arg1, arg2);
    }

    @OriginalMember(owner = "client!cp", name = "a", descriptor = "(IIII)V")
    private final void method3011(int arg0, int arg1, int arg2, int arg3) {
        ++field7413;
        int var5 = arg1 > 2048 ? arg1 + arg3 + -(arg1 * arg3 >> 12) : (arg3 + 4096) * arg1 >> 12;
        if (arg2 == 4) {
            if (~var5 >= -1) {
                this.field7419 = this.field7421 = this.field7420 = arg1;
            } else {
                int var6 = arg0 * 6;
                int var7 = -var5 + arg1 + arg1;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (var9 != 0) {
                    if (~var9 != -2) {
                        if (var9 != 2) {
                            if (~var9 != -4) {
                                if (var9 != 4) {
                                    if (var9 == 5) {
                                        this.field7420 = var15;
                                        this.field7419 = var5;
                                        this.field7421 = var7;
                                    }
                                } else {
                                    this.field7420 = var5;
                                    this.field7419 = var14;
                                    this.field7421 = var7;
                                }
                            } else {
                                this.field7419 = var7;
                                this.field7420 = var5;
                                this.field7421 = var15;
                            }
                        } else {
                            this.field7420 = var14;
                            this.field7421 = var5;
                            this.field7419 = var7;
                        }
                    } else {
                        this.field7421 = var5;
                        this.field7419 = var15;
                        this.field7420 = var7;
                    }
                } else {
                    this.field7421 = var14;
                    this.field7419 = var5;
                    this.field7420 = var7;
                }
            }
        }
    }

    static {
        new class475("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }
}
