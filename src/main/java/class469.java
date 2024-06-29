import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sj")
public class class469 extends class456 {

    @OriginalMember(owner = "client!sj", name = "M", descriptor = "I")
    private int field6595 = 0;

    @OriginalMember(owner = "client!sj", name = "R", descriptor = "I")
    private int field6600 = 0;

    @OriginalMember(owner = "client!sj", name = "J", descriptor = "I")
    private int field6592 = 0;

    @OriginalMember(owner = "client!sj", name = "V", descriptor = "I")
    public static int field6604 = 1;

    @OriginalMember(owner = "client!sj", name = "H", descriptor = "Lsh;")
    public static class472 field6590 = new class472(73, -2);

    @OriginalMember(owner = "client!sj", name = "Y", descriptor = "I")
    public static int field6607 = 0;

    @OriginalMember(owner = "client!sj", name = "Z", descriptor = "I")
    public static int field6608;

    @OriginalMember(owner = "client!sj", name = "ab", descriptor = "Lct;")
    public static class285 field6609;

    @OriginalMember(owner = "client!sj", name = "I", descriptor = "I")
    public static int field6591;

    @OriginalMember(owner = "client!sj", name = "K", descriptor = "I")
    private int field6593;

    @OriginalMember(owner = "client!sj", name = "L", descriptor = "I")
    public static int field6594;

    @OriginalMember(owner = "client!sj", name = "N", descriptor = "I")
    public static int field6596;

    @OriginalMember(owner = "client!sj", name = "O", descriptor = "I")
    public static int field6597;

    @OriginalMember(owner = "client!sj", name = "P", descriptor = "I")
    public static int field6598;

    @OriginalMember(owner = "client!sj", name = "Q", descriptor = "I")
    public static int field6599;

    @OriginalMember(owner = "client!sj", name = "S", descriptor = "I")
    private int field6601;

    @OriginalMember(owner = "client!sj", name = "T", descriptor = "I")
    private int field6602;

    @OriginalMember(owner = "client!sj", name = "U", descriptor = "I")
    private int field6603;

    @OriginalMember(owner = "client!sj", name = "W", descriptor = "I")
    private int field6605;

    @OriginalMember(owner = "client!sj", name = "X", descriptor = "I")
    private int field6606;

    static {
        new class332("Error joining clan channel - please try again later!", "Fehler beim Betreten des Chatraums - bitte versuch es später erneut.", "Erreur lors de la connexion au canal de clan - veuillez réessayer ultérieurement.", "Erro ao entrar no canal do clã. Tente de novo depois!");
        field6608 = 0;
        field6609 = new class285(17, 3);
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(B)V", line = 9)
    public static void method2748(byte arg0) {
        field6590 = null;
        if (arg0 < 118) {
            method2749(-102, 57, -63, 62);
        }
        field6609 = null;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(II)[[I", line = 22)
    public final int[][] method212(int arg0, int arg1) {
        ++field6591;
        if (arg0 != 0) {
            this.method210(-24, (byte) 26, (class446) null);
        }
        int[][] var3 = super.field6468.method1090(-2, arg1);
        if (super.field6468.field2227) {
            int[][] var4 = this.method2709(false, arg1, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class156.field2169 < ~var11; ++var11) {
                this.method2751(var6[var11], 4096, var5[var11], var7[var11]);
                this.field6603 += this.field6595;
                this.field6606 += this.field6600;
                this.field6602 += this.field6592;
                while (~this.field6603 > -1) {
                    this.field6603 += 4096;
                }
                if (this.field6606 < 0) {
                    this.field6606 = 0;
                }
                while (~this.field6603 < -4097) {
                    this.field6603 -= 4096;
                }
                if (~this.field6606 < -4097) {
                    this.field6606 = 4096;
                }
                if (~this.field6602 > -1) {
                    this.field6602 = 0;
                }
                if (~this.field6602 < -4097) {
                    this.field6602 = 4096;
                }
                this.method2750(this.field6602, this.field6603, this.field6606, true);
                var8[var11] = this.field6605;
                var9[var11] = this.field6601;
                var10[var11] = this.field6593;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sj", name = "<init>", descriptor = "()V", line = 117)
    public class469() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIII)V", line = 105)
    public static final void method2749(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 <= -90) {
            class246.field3532 = new byte[arg2][arg0][arg1];
            ++field6599;
        }
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IBLre;)V", line = 121)
    public final void method210(int arg0, byte arg1, class446 arg2) {
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 == -3) {
                    this.field6592 = (arg2.method2642(true) << 12) / 100;
                }
            } else {
                this.field6600 = (arg2.method2642(true) << 12) / 100;
            }
        } else {
            this.field6595 = arg2.method2634(118);
        }
        if (arg1 != 55) {
            field6608 = -28;
        }
        ++field6597;
    }

    @OriginalMember(owner = "client!sj", name = "a", descriptor = "(IIIZ)V", line = 163)
    private final void method2750(int arg0, int arg1, int arg2, boolean arg3) {
        if (!arg3) {
            field6596 = 11;
        }
        ++field6594;
        int var5 = ~arg0 < -2049 ? -(arg0 * arg2 >> 12) + arg0 + arg2 : (arg2 + 4096) * arg0 >> 12;
        if (var5 > 0) {
            int var6 = arg1 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = (var5 - var7 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (var9 == 0) {
                this.field6593 = var7;
                this.field6601 = var14;
                this.field6605 = var5;
                return;
            }
            if (var9 == 1) {
                this.field6601 = var5;
                this.field6605 = var15;
                this.field6593 = var7;
                return;
            }
            if (var9 == 2) {
                this.field6605 = var7;
                this.field6593 = var14;
                this.field6601 = var5;
                return;
            }
            if (var9 == 3) {
                this.field6601 = var15;
                this.field6605 = var7;
                this.field6593 = var5;
                return;
            }
            if (~var9 == -5) {
                this.field6605 = var14;
                this.field6601 = var7;
                this.field6593 = var5;
                return;
            }
            if (var9 == 5) {
                this.field6601 = var7;
                this.field6605 = var5;
                this.field6593 = var15;
                return;
            }
        } else {
            this.field6605 = this.field6601 = this.field6593 = arg0;
        }
    }

    @OriginalMember(owner = "client!sj", name = "b", descriptor = "(IIII)V", line = 293)
    private final void method2751(int arg0, int arg1, int arg2, int arg3) {
        ++field6598;
        int var5 = arg0 < arg2 ? arg2 : arg0;
        int var6 = ~arg0 >= ~arg2 ? arg0 : arg2;
        int var7 = var5 >= arg3 ? var5 : arg3;
        if (arg1 != 4096) {
            this.method2750(43, -93, 74, true);
        }
        int var8 = ~arg3 <= ~var6 ? var6 : arg3;
        int var9 = -var8 + var7;
        this.field6602 = (var7 + var8) / 2;
        if (var9 > 0) {
            int var10 = (var7 - arg2 << 12) / var9;
            int var11 = (-arg0 + var7 << 12) / var9;
            int var12 = (-arg3 + var7 << 12) / var9;
            if (arg2 != var7) {
                if (~arg0 == ~var7) {
                    this.field6603 = ~arg3 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field6603 = ~arg2 != ~var8 ? 20480 - var10 : var11 + 12288;
                }
            } else {
                this.field6603 = ~arg0 != ~var8 ? -var11 + 4096 : var12 + 20480;
            }
            this.field6603 /= 6;
        } else {
            this.field6603 = 0;
        }
        if (this.field6602 > 0 && this.field6602 < 4096) {
            this.field6606 = (var9 << 12) / (~this.field6602 < -2049 ? -(this.field6602 * 2) + 8192 : this.field6602 * 2);
        } else {
            this.field6606 = 0;
        }
    }
}
