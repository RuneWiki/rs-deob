import java.awt.event.ActionEvent;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uu")
public class class513 extends class371 {

    @OriginalMember(owner = "client!uu", name = "L", descriptor = "I")
    private int field7600 = 0;

    @OriginalMember(owner = "client!uu", name = "K", descriptor = "I")
    private int field7599 = 0;

    @OriginalMember(owner = "client!uu", name = "M", descriptor = "I")
    private int field7601 = 0;

    @OriginalMember(owner = "client!uu", name = "I", descriptor = "I")
    public static int field7597 = 1339;

    @OriginalMember(owner = "client!uu", name = "J", descriptor = "I")
    public static int field7598;

    @OriginalMember(owner = "client!uu", name = "N", descriptor = "I")
    private int field7602;

    @OriginalMember(owner = "client!uu", name = "O", descriptor = "I")
    public static int field7603;

    @OriginalMember(owner = "client!uu", name = "P", descriptor = "I")
    private int field7604;

    @OriginalMember(owner = "client!uu", name = "Q", descriptor = "I")
    private int field7605;

    @OriginalMember(owner = "client!uu", name = "S", descriptor = "I")
    public static int field7607;

    @OriginalMember(owner = "client!uu", name = "T", descriptor = "I")
    private int field7608;

    @OriginalMember(owner = "client!uu", name = "U", descriptor = "I")
    private int field7609;

    @OriginalMember(owner = "client!uu", name = "V", descriptor = "I")
    private int field7610;

    @OriginalMember(owner = "client!uu", name = "W", descriptor = "I")
    public static int field7611;

    @OriginalMember(owner = "client!uu", name = "X", descriptor = "I")
    public static int field7612;

    @OriginalMember(owner = "client!uu", name = "R", descriptor = "Llda;")
    public static class192 field7606;

    @OriginalMember(owner = "client!uu", name = "<init>", descriptor = "()V")
    public class513() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(BI)[[I")
    public final int[][] method78(byte arg0, int arg1) {
        if (arg0 != 36) {
            this.method3056(-108, 34, -124, -106);
        }
        ++field7598;
        int[][] var3 = super.field5364.method3064(arg0 ^ 37, arg1);
        if (super.field5364.field7632) {
            int[][] var4 = this.method2263((byte) -68, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~class41.field455 < ~var11; ++var11) {
                this.method3055(var7[var11], var6[var11], var5[var11], -93);
                this.field7609 += this.field7600;
                this.field7604 += this.field7601;
                for (this.field7602 += this.field7599; this.field7602 < 0; this.field7602 += 4096) {
                }
                if (this.field7609 < 0) {
                    this.field7609 = 0;
                }
                while (this.field7602 > 4096) {
                    this.field7602 -= 4096;
                }
                if (~this.field7604 > -1) {
                    this.field7604 = 0;
                }
                if (this.field7609 > 4096) {
                    this.field7609 = 4096;
                }
                if (~this.field7604 < -4097) {
                    this.field7604 = 4096;
                }
                this.method3056(120, this.field7609, this.field7602, this.field7604);
                var8[var11] = this.field7605;
                var9[var11] = this.field7610;
                var10[var11] = this.field7608;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IIII)V")
    private final void method3055(int arg0, int arg1, int arg2, int arg3) {
        ++field7612;
        int var5 = arg2 > arg1 ? arg2 : arg1;
        if (arg3 < -36) {
            int var6 = ~arg1 < ~arg2 ? arg2 : arg1;
            int var7 = arg0 <= var5 ? var5 : arg0;
            int var8 = ~var6 < ~arg0 ? arg0 : var6;
            this.field7604 = (var7 + var8) / 2;
            int var9 = -var8 + var7;
            if (this.field7604 > 0 && ~this.field7604 > -4097) {
                this.field7609 = (var9 << 12) / (~this.field7604 < -2049 ? -(this.field7604 * 2) + 8192 : this.field7604 * 2);
            } else {
                this.field7609 = 0;
            }
            if (~var9 < -1) {
                int var10 = (-arg2 + var7 << 12) / var9;
                int var11 = (-arg1 + var7 << 12) / var9;
                int var12 = (-arg0 + var7 << 12) / var9;
                if (arg2 == var7) {
                    this.field7602 = ~arg1 != ~var8 ? -var11 + 4096 : 20480 - -var12;
                } else if (~arg1 == ~var7) {
                    this.field7602 = ~arg0 != ~var8 ? -var12 + 12288 : var10 + 4096;
                } else {
                    this.field7602 = ~arg2 != ~var8 ? -var10 + 20480 : var11 + 12288;
                }
                this.field7602 /= 6;
            } else {
                this.field7602 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "b", descriptor = "(IIII)V")
    private final void method3056(int arg0, int arg1, int arg2, int arg3) {
        ++field7603;
        int var5 = ~arg3 < -2049 ? arg1 + arg3 + -(arg1 * arg3 >> 12) : (arg1 + 4096) * arg3 >> 12;
        if (var5 > 0) {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg3 + arg3;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = var5 - var13;
            if (var9 != 0) {
                if (var9 != 1) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field7608 = var15;
                                    this.field7605 = var5;
                                    this.field7610 = var7;
                                }
                            } else {
                                this.field7610 = var7;
                                this.field7608 = var5;
                                this.field7605 = var14;
                            }
                        } else {
                            this.field7605 = var7;
                            this.field7610 = var15;
                            this.field7608 = var5;
                        }
                    } else {
                        this.field7605 = var7;
                        this.field7608 = var14;
                        this.field7610 = var5;
                    }
                } else {
                    this.field7610 = var5;
                    this.field7605 = var15;
                    this.field7608 = var7;
                }
            } else {
                this.field7605 = var5;
                this.field7610 = var14;
                this.field7608 = var7;
            }
        } else {
            this.field7605 = this.field7610 = this.field7608 = arg3;
        }
        if (arg0 <= 19) {
            this.method3056(35, -55, -76, -12);
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(Luf;BLjava/lang/Object;)V")
    public static final void method3057(class353 arg0, byte arg1, Object arg2) {
        if (arg1 == -42) {
            ++field7607;
            if (arg0.field5137 != null) {
                for (int var3 = 0; ~var3 > -51 && arg0.field5137.peekEvent() != null; ++var3) {
                    class428.method2624(1, 1L);
                }
                if (arg2 != null) {
                    arg0.field5137.postEvent(new ActionEvent(arg2, 1001, "dummy"));
                }
            }
        }
    }

    @OriginalMember(owner = "client!uu", name = "g", descriptor = "(I)V")
    public static void method3058(int arg0) {
        if (arg0 == -1) {
            field7606 = null;
        }
    }

    @OriginalMember(owner = "client!uu", name = "a", descriptor = "(IBLps;)V")
    public final void method81(int arg0, byte arg1, class428 arg2) {
        ++field7611;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 == 2) {
                    this.field7601 = (arg2.method2570((byte) 57) << 12) / 100;
                }
            } else {
                this.field7600 = (arg2.method2570((byte) 57) << 12) / 100;
            }
        } else {
            this.field7599 = arg2.method2622((byte) 127);
        }
        int var5 = -88 / ((arg1 - -15) / 39);
    }
}
