import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class323 extends class45 {

    @OriginalMember(owner = "client!wi", name = "J", descriptor = "I")
    private int field4926 = 0;

    @OriginalMember(owner = "client!wi", name = "N", descriptor = "I")
    private int field4929 = 0;

    @OriginalMember(owner = "client!wi", name = "U", descriptor = "I")
    private int field4936 = 0;

    @OriginalMember(owner = "client!wi", name = "H", descriptor = "I")
    private int field4924;

    @OriginalMember(owner = "client!wi", name = "I", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!wi", name = "L", descriptor = "I")
    private int field4927;

    @OriginalMember(owner = "client!wi", name = "M", descriptor = "I")
    public static int field4928;

    @OriginalMember(owner = "client!wi", name = "O", descriptor = "I")
    private int field4930;

    @OriginalMember(owner = "client!wi", name = "P", descriptor = "I")
    public static int field4931;

    @OriginalMember(owner = "client!wi", name = "Q", descriptor = "I")
    public static int field4932;

    @OriginalMember(owner = "client!wi", name = "R", descriptor = "I")
    private int field4933;

    @OriginalMember(owner = "client!wi", name = "S", descriptor = "I")
    public static int field4934;

    @OriginalMember(owner = "client!wi", name = "T", descriptor = "I")
    public static int field4935;

    @OriginalMember(owner = "client!wi", name = "V", descriptor = "I")
    private int field4937;

    @OriginalMember(owner = "client!wi", name = "W", descriptor = "I")
    private int field4938;

    static {
        new class342("Invalid player name.", "Unzulässiger Charaktername!", "Nom de joueur incorrect.", "Nome de jogador inválido.");
        new class342("You will be un-muted within 24 hours.", "Du wirst innerhalb der nächsten 24 Stunden wieder sprechen können.", "Vous aurez à nouveau accès à la messagerie instantanée dans 24 heures.", "O veto será retirado dentro de 24 horas.");
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lqa;I)V", line = 11)
    public static final void method2098(class162 arg0, int arg1) {
        ++field4925;
        if (~class369.field5593 != ~class139.field2224.field6232) {
            if (arg1 == -14494) {
                if (class380.field5761 != null) {
                    if (class368.method2306(731103630, arg0, class139.field2224.field6232)) {
                        class369.field5593 = class139.field2224.field6232;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lcu;II)V", line = 33)
    public final void method37(class145 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    this.field4936 = (arg0.method1093(15) << 12) / 100;
                }
            } else {
                this.field4929 = (arg0.method1093(15) << 12) / 100;
            }
        } else {
            this.field4926 = arg0.method1122(65280);
        }
        ++field4935;
        if (arg1 != -26471) {
            this.method2100(false, -119, 69, -77);
        }
    }

    @OriginalMember(owner = "client!wi", name = "<init>", descriptor = "()V", line = 199)
    public class323() {
        super(1, false);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIBI)V", line = 92)
    private final void method2099(int arg0, int arg1, byte arg2, int arg3) {
        ++field4931;
        int var5 = ~arg0 < -2049 ? arg0 - ((arg0 * arg3 >> 12) + -arg3) : (arg3 + 4096) * arg0 >> 12;
        if (~var5 >= -1) {
            this.field4927 = this.field4938 = this.field4930 = arg0;
        } else {
            int var6 = arg1 * 6;
            int var7 = arg0 - -arg0 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (var9 != 4) {
                                if (var9 == 5) {
                                    this.field4938 = var7;
                                    this.field4927 = var5;
                                    this.field4930 = var15;
                                }
                            } else {
                                this.field4938 = var7;
                                this.field4930 = var5;
                                this.field4927 = var14;
                            }
                        } else {
                            this.field4930 = var5;
                            this.field4927 = var7;
                            this.field4938 = var15;
                        }
                    } else {
                        this.field4938 = var5;
                        this.field4930 = var14;
                        this.field4927 = var7;
                    }
                } else {
                    this.field4938 = var5;
                    this.field4927 = var15;
                    this.field4930 = var7;
                }
            } else {
                this.field4930 = var7;
                this.field4927 = var5;
                this.field4938 = var14;
            }
        }
        int var17 = 31 / ((-69 - arg2) / 47);
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(ZIII)V", line = 206)
    private final void method2100(boolean arg0, int arg1, int arg2, int arg3) {
        ++field4928;
        int var5 = ~arg2 > ~arg3 ? arg3 : arg2;
        int var6 = arg1 <= var5 ? var5 : arg1;
        int var7 = arg2 <= arg3 ? arg2 : arg3;
        int var8 = ~arg1 <= ~var7 ? var7 : arg1;
        int var9 = -var8 + var6;
        this.field4924 = (var6 + var8) / 2;
        if (this.field4924 > 0 && this.field4924 < 4096) {
            this.field4937 = (var9 << 12) / (~this.field4924 >= -2049 ? this.field4924 * 2 : 8192 - this.field4924 * 2);
        } else {
            this.field4937 = 0;
        }
        if (!arg0) {
            this.field4929 = -75;
        }
        if (var9 <= 0) {
            this.field4933 = 0;
        } else {
            int var10 = (-arg3 + var6 << 12) / var9;
            int var11 = (-arg2 + var6 << 12) / var9;
            int var12 = (-arg1 + var6 << 12) / var9;
            if (~arg3 != ~var6) {
                if (~arg2 == ~var6) {
                    this.field4933 = arg1 != var8 ? -var12 + 12288 : 4096 - -var10;
                } else {
                    this.field4933 = arg3 == var8 ? var11 + 12288 : -var10 + 20480;
                }
            } else {
                this.field4933 = ~arg2 == ~var8 ? var12 + 20480 : 4096 - var11;
            }
            this.field4933 /= 6;
        }
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(II)[[I", line = 266)
    public final int[][] method49(int arg0, int arg1) {
        ++field4934;
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (arg0 != 8) {
            method2098((class162) null, -87);
        }
        if (super.field833.field1888) {
            int[][] var4 = this.method437(0, arg1, -117);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class259.field3768; ++var11) {
                this.method2100(true, var7[var11], var6[var11], var5[var11]);
                this.field4933 += this.field4926;
                this.field4924 += this.field4936;
                this.field4937 += this.field4929;
                while (~this.field4933 > -1) {
                    this.field4933 += 4096;
                }
                while (this.field4933 > 4096) {
                    this.field4933 -= 4096;
                }
                if (~this.field4937 > -1) {
                    this.field4937 = 0;
                }
                if (~this.field4924 > -1) {
                    this.field4924 = 0;
                }
                if (this.field4937 > 4096) {
                    this.field4937 = 4096;
                }
                if (this.field4924 > 4096) {
                    this.field4924 = 4096;
                }
                this.method2099(this.field4924, this.field4933, (byte) -126, this.field4937);
                var8[var11] = this.field4927;
                var9[var11] = this.field4938;
                var10[var11] = this.field4930;
            }
        }
        return var3;
    }
}
