import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oc")
public class class38 extends class346 {

    @OriginalMember(owner = "client!oc", name = "M", descriptor = "I")
    private int field567 = 0;

    @OriginalMember(owner = "client!oc", name = "R", descriptor = "I")
    private int field572 = 0;

    @OriginalMember(owner = "client!oc", name = "W", descriptor = "I")
    private int field577 = 0;

    @OriginalMember(owner = "client!oc", name = "K", descriptor = "Luc;")
    public static class51 field565 = new class51(32);

    @OriginalMember(owner = "client!oc", name = "Q", descriptor = "I")
    public static int field571 = -1;

    @OriginalMember(owner = "client!oc", name = "U", descriptor = "Z")
    public static boolean field575 = false;

    @OriginalMember(owner = "client!oc", name = "H", descriptor = "I")
    private int field563;

    @OriginalMember(owner = "client!oc", name = "I", descriptor = "I")
    public static int field564;

    @OriginalMember(owner = "client!oc", name = "L", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client!oc", name = "N", descriptor = "I")
    public static int field568;

    @OriginalMember(owner = "client!oc", name = "O", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!oc", name = "P", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!oc", name = "S", descriptor = "I")
    private int field573;

    @OriginalMember(owner = "client!oc", name = "T", descriptor = "I")
    public static int field574;

    @OriginalMember(owner = "client!oc", name = "V", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!oc", name = "X", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!oc", name = "Y", descriptor = "I")
    public static int field579;

    @OriginalMember(owner = "client!oc", name = "Z", descriptor = "I")
    public static int field580;

    @OriginalMember(owner = "client!oc", name = "d", descriptor = "(B)V")
    public static void method285(byte arg0) {
        field565 = null;
        if (arg0 != 109) {
            field575 = false;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IIII)V")
    private final void method286(int arg0, int arg1, int arg2, int arg3) {
        ++field568;
        int var5 = arg3 >= arg0 ? arg3 : arg0;
        int var6 = arg0 >= arg3 ? arg3 : arg0;
        int var7 = ~arg1 >= ~var5 ? var5 : arg1;
        int var8 = ~var6 >= ~arg1 ? var6 : arg1;
        int var9 = -var8 + var7;
        this.field578 = (var7 + var8) / 2;
        if (arg2 >= var9) {
            this.field566 = 0;
        } else {
            int var10 = (var7 - arg0 << 12) / var9;
            int var11 = (-arg3 + var7 << 12) / var9;
            int var12 = (var7 - arg1 << 12) / var9;
            if (~arg0 == ~var7) {
                this.field566 = arg3 != var8 ? -var11 + 4096 : 20480 - -var12;
            } else if (arg3 == var7) {
                this.field566 = arg1 != var8 ? -var12 + 12288 : var10 + 4096;
            } else {
                this.field566 = arg0 != var8 ? -var10 + 20480 : var11 + 12288;
            }
            this.field566 /= 6;
        }
        if (~this.field578 < -1 && ~this.field578 > -4097) {
            this.field576 = (var9 << 12) / (this.field578 <= 2048 ? this.field578 * 2 : -(this.field578 * 2) + 8192);
        } else {
            this.field576 = 0;
        }
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(Lfb;ZI)V")
    public final void method38(class341 arg0, boolean arg1, int arg2) {
        ++field564;
        if (arg2 != 0) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field567 = (arg0.method2211(255) << 12) / 100;
                }
            } else {
                this.field572 = (arg0.method2211(255) << 12) / 100;
            }
        } else {
            this.field577 = arg0.method2212(-2);
        }
        if (arg1) {
            method285((byte) 89);
        }
    }

    @OriginalMember(owner = "client!oc", name = "c", descriptor = "(II)[[I")
    public final int[][] method287(int arg0, int arg1) {
        ++field580;
        int[][] var3 = super.field5170.method2701(0, arg0);
        if (arg1 > -3) {
            this.method288(40, false, -44, 125);
        }
        if (super.field5170.field6288) {
            int[][] var4 = this.method2293(0, 0, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class134.field1753; ++var11) {
                this.method286(var5[var11], var7[var11], 0, var6[var11]);
                this.field576 += this.field572;
                this.field578 += this.field567;
                for (this.field566 += this.field577; this.field566 < 0; this.field566 += 4096) {
                }
                while (~this.field566 < -4097) {
                    this.field566 -= 4096;
                }
                if (~this.field576 > -1) {
                    this.field576 = 0;
                }
                if (~this.field578 > -1) {
                    this.field578 = 0;
                }
                if (~this.field576 < -4097) {
                    this.field576 = 4096;
                }
                if (~this.field578 < -4097) {
                    this.field578 = 4096;
                }
                this.method288(this.field578, true, this.field576, this.field566);
                var8[var11] = this.field569;
                var9[var11] = this.field563;
                var10[var11] = this.field573;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oc", name = "<init>", descriptor = "()V")
    public class38() {
        super(1, false);
    }

    @OriginalMember(owner = "client!oc", name = "a", descriptor = "(IZII)V")
    private final void method288(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg1) {
            ++field579;
            int var5 = arg0 <= 2048 ? (arg2 + 4096) * arg0 >> 12 : -(arg0 * arg2 >> 12) + arg2 + arg0;
            if (~var5 >= -1) {
                this.field569 = this.field563 = this.field573 = arg0;
            } else {
                int var6 = arg3 * 6;
                int var7 = arg0 + arg0 - var5;
                int var8 = (var5 - var7 << 12) / var5;
                int var9 = var6 >> 12;
                int var10 = var6 - (var9 << 12);
                int var12 = var8 * var5 >> 12;
                int var13 = var10 * var12 >> 12;
                int var14 = var7 + var13;
                int var15 = -var13 + var5;
                if (~var9 != -1) {
                    if (var9 != 1) {
                        if (var9 != 2) {
                            if (var9 != 3) {
                                if (~var9 != -5) {
                                    if (var9 == 5) {
                                        this.field573 = var15;
                                        this.field563 = var7;
                                        this.field569 = var5;
                                    }
                                } else {
                                    this.field569 = var14;
                                    this.field573 = var5;
                                    this.field563 = var7;
                                }
                            } else {
                                this.field563 = var15;
                                this.field569 = var7;
                                this.field573 = var5;
                            }
                        } else {
                            this.field563 = var5;
                            this.field573 = var14;
                            this.field569 = var7;
                        }
                    } else {
                        this.field573 = var7;
                        this.field569 = var15;
                        this.field563 = var5;
                    }
                } else {
                    this.field563 = var14;
                    this.field573 = var7;
                    this.field569 = var5;
                }
            }
        }
    }
}
