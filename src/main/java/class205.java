import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vb")
public class class205 extends class118 {

    @OriginalMember(owner = "client!vb", name = "K", descriptor = "I")
    private int field3068 = 0;

    @OriginalMember(owner = "client!vb", name = "T", descriptor = "I")
    private int field3077 = 0;

    @OriginalMember(owner = "client!vb", name = "V", descriptor = "I")
    private int field3079 = 0;

    @OriginalMember(owner = "client!vb", name = "Q", descriptor = "I")
    public static int field3074;

    @OriginalMember(owner = "client!vb", name = "O", descriptor = "[Lon;")
    public static class432[] field3072;

    @OriginalMember(owner = "client!vb", name = "G", descriptor = "I")
    private int field3064;

    @OriginalMember(owner = "client!vb", name = "H", descriptor = "I")
    public static int field3065;

    @OriginalMember(owner = "client!vb", name = "I", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!vb", name = "J", descriptor = "I")
    private int field3067;

    @OriginalMember(owner = "client!vb", name = "L", descriptor = "I")
    private int field3069;

    @OriginalMember(owner = "client!vb", name = "M", descriptor = "I")
    private int field3070;

    @OriginalMember(owner = "client!vb", name = "N", descriptor = "I")
    private int field3071;

    @OriginalMember(owner = "client!vb", name = "P", descriptor = "I")
    private int field3073;

    @OriginalMember(owner = "client!vb", name = "R", descriptor = "I")
    public static int field3075;

    @OriginalMember(owner = "client!vb", name = "S", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!vb", name = "U", descriptor = "I")
    public static int field3078;

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(ZI)[[I")
    public final int[][] method195(boolean arg0, int arg1) {
        ++field3078;
        if (arg0) {
            field3074 = -22;
        }
        int[][] var3 = super.field1549.method2013(arg1, true);
        if (super.field1549.field4903) {
            int[][] var4 = this.method708(arg1, (byte) -102, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class440.field6474 < ~var11; ++var11) {
                this.method1208((byte) 28, var5[var11], var7[var11], var6[var11]);
                this.field3073 += this.field3079;
                this.field3069 += this.field3068;
                for (this.field3070 += this.field3077; this.field3070 < 0; this.field3070 += 4096) {
                }
                while (~this.field3070 < -4097) {
                    this.field3070 -= 4096;
                }
                if (~this.field3069 > -1) {
                    this.field3069 = 0;
                }
                if (this.field3069 > 4096) {
                    this.field3069 = 4096;
                }
                if (~this.field3073 > -1) {
                    this.field3073 = 0;
                }
                if (~this.field3073 < -4097) {
                    this.field3073 = 4096;
                }
                this.method1209(this.field3070, this.field3073, this.field3069, 4096);
                var8[var11] = this.field3071;
                var9[var11] = this.field3064;
                var10[var11] = this.field3067;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!vb", name = "<init>", descriptor = "()V")
    public class205() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(BIII)V")
    private final void method1208(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 24) {
            ++field3076;
            int var5 = arg1 > arg3 ? arg1 : arg3;
            int var6 = var5 >= arg2 ? var5 : arg2;
            int var7 = arg1 >= arg3 ? arg3 : arg1;
            int var8 = ~var7 < ~arg2 ? arg2 : var7;
            this.field3073 = (var6 + var8) / 2;
            int var9 = var6 - var8;
            if (~this.field3073 < -1 && this.field3073 < 4096) {
                this.field3069 = (var9 << 12) / (this.field3073 > 2048 ? 8192 - this.field3073 * 2 : this.field3073 * 2);
            } else {
                this.field3069 = 0;
            }
            if (var9 > 0) {
                int var10 = (-arg1 + var6 << 12) / var9;
                int var11 = (-arg3 + var6 << 12) / var9;
                int var12 = (-arg2 + var6 << 12) / var9;
                if (~arg1 == ~var6) {
                    this.field3070 = arg3 == var8 ? var12 + 20480 : -var11 + 4096;
                } else if (~arg3 == ~var6) {
                    this.field3070 = arg2 != var8 ? 12288 - var12 : var10 + 4096;
                } else {
                    this.field3070 = arg1 != var8 ? -var10 + 20480 : 12288 - -var11;
                }
                this.field3070 /= 6;
            } else {
                this.field3070 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IIII)V")
    private final void method1209(int arg0, int arg1, int arg2, int arg3) {
        ++field3066;
        int var5 = ~arg1 >= -2049 ? (arg2 + 4096) * arg1 >> 12 : arg1 - -arg2 - (arg1 * arg2 >> 12);
        if (arg3 == 4096) {
            if (~var5 < -1) {
                int var6 = arg0 * 6;
                int var7 = arg1 + arg1 + -var5;
                int var8 = (-var7 + var5 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = -(var9 << 12) + var6;
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 - -var13;
                int var15 = var5 - var13;
                if (var9 == 0) {
                    this.field3064 = var14;
                    this.field3071 = var5;
                    this.field3067 = var7;
                    return;
                }
                if (var9 == 1) {
                    this.field3071 = var15;
                    this.field3067 = var7;
                    this.field3064 = var5;
                    return;
                }
                if (var9 == 2) {
                    this.field3067 = var14;
                    this.field3064 = var5;
                    this.field3071 = var7;
                    return;
                }
                if (~var9 == -4) {
                    this.field3071 = var7;
                    this.field3064 = var15;
                    this.field3067 = var5;
                    return;
                }
                if (~var9 == -5) {
                    this.field3071 = var14;
                    this.field3067 = var5;
                    this.field3064 = var7;
                    return;
                }
                if (~var9 == -6) {
                    this.field3067 = var15;
                    this.field3064 = var7;
                    this.field3071 = var5;
                    return;
                }
            } else {
                this.field3071 = this.field3064 = this.field3067 = arg1;
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "f", descriptor = "(I)V")
    public static void method1210(int arg0) {
        if (arg0 != 0) {
            field3072 = null;
        }
        field3072 = null;
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILfh;IZ)V")
    public static final void method1211(int arg0, int arg1, class170 arg2, int arg3, boolean arg4) {
        ++field3065;
        int var5 = arg2.field2561;
        if (arg0 > 25) {
            if (arg2.field2475 == 0) {
                arg2.field2561 = arg2.field2491;
            } else if (arg2.field2475 == 1) {
                arg2.field2561 = arg1 - arg2.field2491;
            } else if (arg2.field2475 == 2) {
                arg2.field2561 = arg2.field2491 * arg1 >> 14;
            }
            int var6 = arg2.field2501;
            if (arg2.field2551 == 0) {
                arg2.field2501 = arg2.field2548;
            } else if (arg2.field2551 == 1) {
                arg2.field2501 = -arg2.field2548 + arg3;
            } else if (~arg2.field2551 == -3) {
                arg2.field2501 = arg2.field2548 * arg3 >> 14;
            }
            if (~arg2.field2475 == -5) {
                arg2.field2561 = arg2.field2529 * arg2.field2501 / arg2.field2535;
            }
            if (arg2.field2551 == 4) {
                arg2.field2501 = arg2.field2561 * arg2.field2535 / arg2.field2529;
            }
            if (class120.field1586 && (~client.method2796(arg2).field4689 != -1 || arg2.field2558 == 0)) {
                if (arg2.field2501 < 5 && arg2.field2561 < 5) {
                    arg2.field2501 = 5;
                    arg2.field2561 = 5;
                } else {
                    if (arg2.field2561 <= 0) {
                        arg2.field2561 = 5;
                    }
                    if (~arg2.field2501 >= -1) {
                        arg2.field2501 = 5;
                    }
                }
            }
            if (~class210.field3162 == ~arg2.field2473) {
                client.field6676 = arg2;
            }
            if (arg4 && arg2.field2512 != null) {
                if (~arg2.field2561 != ~var5 || ~arg2.field2501 != ~var6) {
                    class327 var7 = new class327();
                    var7.field4908 = arg2.field2512;
                    var7.field4909 = arg2;
                    class431.field6330.method2504(42, var7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!vb", name = "a", descriptor = "(IILef;)V")
    public final void method24(int arg0, int arg1, class385 arg2) {
        ++field3075;
        if (arg1 == 1) {
            if (arg0 != 0) {
                if (~arg0 != -2) {
                    if (arg0 == 2) {
                        this.field3079 = (arg2.method2341((byte) 54) << 12) / 100;
                    }
                } else {
                    this.field3068 = (arg2.method2341((byte) 54) << 12) / 100;
                }
            } else {
                this.field3077 = arg2.method2327((byte) -116);
            }
        }
    }

    static {
        new class151("Unable to send message - player unavailable.", "Deine Nachricht konnte nicht verschickt werden,", "Impossible d'envoyer un message - joueur indisponible.", "Não foi possível enviar a mensagem. O jogador não está disponível.");
        field3074 = 0;
        field3072 = new class432[0];
    }
}
