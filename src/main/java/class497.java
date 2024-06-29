import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!au")
public class class497 extends class404 {

    @OriginalMember(owner = "client!au", name = "J", descriptor = "I")
    private int field7542 = 0;

    @OriginalMember(owner = "client!au", name = "F", descriptor = "I")
    private int field7538 = 0;

    @OriginalMember(owner = "client!au", name = "L", descriptor = "I")
    private int field7544 = 0;

    @OriginalMember(owner = "client!au", name = "C", descriptor = "Lsk;")
    public static class423 field7535 = new class423("Loading world map - ", "Lade Weltkarte - ", "Chargement de la mappemonde - ", "Carregando mapa-múndi - ");

    @OriginalMember(owner = "client!au", name = "z", descriptor = "I")
    public static int field7532;

    @OriginalMember(owner = "client!au", name = "A", descriptor = "I")
    public static int field7533;

    @OriginalMember(owner = "client!au", name = "B", descriptor = "I")
    private int field7534;

    @OriginalMember(owner = "client!au", name = "D", descriptor = "I")
    private int field7536;

    @OriginalMember(owner = "client!au", name = "E", descriptor = "I")
    public static int field7537;

    @OriginalMember(owner = "client!au", name = "G", descriptor = "I")
    private int field7539;

    @OriginalMember(owner = "client!au", name = "H", descriptor = "I")
    private int field7540;

    @OriginalMember(owner = "client!au", name = "I", descriptor = "I")
    private int field7541;

    @OriginalMember(owner = "client!au", name = "K", descriptor = "I")
    public static int field7543;

    @OriginalMember(owner = "client!au", name = "M", descriptor = "I")
    private int field7545;

    @OriginalMember(owner = "client!au", name = "N", descriptor = "[S")
    public static short[] field7546;

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(ILha;I)V")
    public final void method87(int arg0, class40 arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field7538 = (arg1.method262(-2) << 12) / 100;
                }
            } else {
                this.field7544 = (arg1.method262(-2) << 12) / 100;
            }
        } else {
            this.field7542 = arg1.method249(false);
        }
        ++field7537;
        if (arg0 != 0) {
            this.field7541 = 40;
        }
    }

    @OriginalMember(owner = "client!au", name = "<init>", descriptor = "()V")
    public class497() {
        super(1, false);
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIII)V")
    private final void method2987(int arg0, int arg1, int arg2, int arg3) {
        ++field7533;
        int var5 = ~arg2 < -2049 ? -(arg0 * arg2 >> 12) + arg2 - -arg0 : (arg0 + 4096) * arg2 >> 12;
        int var6 = -97 / ((-68 - arg3) / 48);
        if (~var5 >= -1) {
            this.field7536 = this.field7534 = this.field7540 = arg2;
        } else {
            int var7 = arg1 * 6;
            int var8 = arg2 - -arg2 - var5;
            int var9 = (-var8 + var5 << 12) / var5;
            int var10 = var7 >> 12;
            int var11 = var7 - (var10 << 12);
            int var13 = var9 * var5 >> 12;
            int var14 = var11 * var13 >> 12;
            int var15 = var8 + var14;
            int var16 = -var14 + var5;
            if (~var10 != -1) {
                if (var10 != 1) {
                    if (var10 != 2) {
                        if (~var10 != -4) {
                            if (var10 != 4) {
                                if (~var10 == -6) {
                                    this.field7536 = var5;
                                    this.field7540 = var16;
                                    this.field7534 = var8;
                                }
                            } else {
                                this.field7540 = var5;
                                this.field7536 = var15;
                                this.field7534 = var8;
                            }
                        } else {
                            this.field7536 = var8;
                            this.field7534 = var16;
                            this.field7540 = var5;
                        }
                    } else {
                        this.field7536 = var8;
                        this.field7540 = var15;
                        this.field7534 = var5;
                    }
                } else {
                    this.field7540 = var8;
                    this.field7534 = var5;
                    this.field7536 = var16;
                }
            } else {
                this.field7540 = var8;
                this.field7534 = var15;
                this.field7536 = var5;
            }
        }
    }

    @OriginalMember(owner = "client!au", name = "a", descriptor = "(IIIB)V")
    private final void method2988(int arg0, int arg1, int arg2, byte arg3) {
        ++field7532;
        int var5 = arg1 <= arg2 ? arg2 : arg1;
        if (arg3 >= -51) {
            this.field7539 = 82;
        }
        int var6 = arg0 <= var5 ? var5 : arg0;
        int var7 = ~arg2 >= ~arg1 ? arg2 : arg1;
        int var8 = var7 > arg0 ? arg0 : var7;
        this.field7541 = (var6 + var8) / 2;
        int var9 = -var8 + var6;
        if (~var9 < -1) {
            int var10 = (-arg1 + var6 << 12) / var9;
            int var11 = (var6 - arg2 << 12) / var9;
            int var12 = (var6 - arg0 << 12) / var9;
            if (arg1 == var6) {
                this.field7539 = ~arg2 == ~var8 ? var12 + 20480 : 4096 - var11;
            } else if (~arg2 != ~var6) {
                this.field7539 = ~arg1 != ~var8 ? -var10 + 20480 : var11 + 12288;
            } else {
                this.field7539 = ~arg0 == ~var8 ? 4096 - -var10 : -var12 + 12288;
            }
            this.field7539 /= 6;
        } else {
            this.field7539 = 0;
        }
        if (~this.field7541 < -1 && ~this.field7541 > -4097) {
            this.field7545 = (var9 << 12) / (~this.field7541 < -2049 ? -(this.field7541 * 2) + 8192 : this.field7541 * 2);
        } else {
            this.field7545 = 0;
        }
    }

    @OriginalMember(owner = "client!au", name = "h", descriptor = "(I)V")
    public static void method2989(int arg0) {
        field7535 = null;
        if (arg0 != 0) {
            field7546 = null;
        }
        field7546 = null;
    }

    @OriginalMember(owner = "client!au", name = "b", descriptor = "(II)[[I")
    public final int[][] method89(int arg0, int arg1) {
        if (arg0 != -1) {
            this.method2987(125, -33, -72, 24);
        }
        ++field7543;
        int[][] var3 = super.field5869.method2819(arg1, arg0 ^ -2);
        if (super.field5869.field7156) {
            int[][] var4 = this.method2400(-11872, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; class431.field6348 > var11; ++var11) {
                this.method2988(var7[var11], var5[var11], var6[var11], (byte) -53);
                this.field7541 += this.field7538;
                this.field7539 += this.field7542;
                this.field7545 += this.field7544;
                while (~this.field7539 > -1) {
                    this.field7539 += 4096;
                }
                if (this.field7545 < 0) {
                    this.field7545 = 0;
                }
                while (~this.field7539 < -4097) {
                    this.field7539 -= 4096;
                }
                if (this.field7545 > 4096) {
                    this.field7545 = 4096;
                }
                if (this.field7541 < 0) {
                    this.field7541 = 0;
                }
                if (this.field7541 > 4096) {
                    this.field7541 = 4096;
                }
                this.method2987(this.field7545, this.field7539, this.field7541, 117);
                var8[var11] = this.field7536;
                var9[var11] = this.field7534;
                var10[var11] = this.field7540;
            }
        }
        return var3;
    }
}
