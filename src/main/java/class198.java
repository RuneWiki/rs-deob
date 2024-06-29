import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sa")
public class class198 extends class167 {

    @OriginalMember(owner = "client!sa", name = "U", descriptor = "I")
    private int field3544 = 0;

    @OriginalMember(owner = "client!sa", name = "jb", descriptor = "I")
    private int field3559 = 0;

    @OriginalMember(owner = "client!sa", name = "mb", descriptor = "I")
    private int field3562 = 0;

    @OriginalMember(owner = "client!sa", name = "fb", descriptor = "Lkh;")
    public static class117 field3555 = class224.method1450((byte) 122, "<)4col>");

    @OriginalMember(owner = "client!sa", name = "cb", descriptor = "Lkh;")
    public static class117 field3552 = class224.method1450((byte) 4, "Bitte geben Sie Ihr Passwort ein)3");

    @OriginalMember(owner = "client!sa", name = "ab", descriptor = "Lkh;")
    public static class117 field3550 = class224.method1450((byte) -21, "sl_back");

    @OriginalMember(owner = "client!sa", name = "Y", descriptor = "I")
    public static int field3548 = 0;

    @OriginalMember(owner = "client!sa", name = "T", descriptor = "I")
    private int field3543;

    @OriginalMember(owner = "client!sa", name = "V", descriptor = "I")
    public static int field3545;

    @OriginalMember(owner = "client!sa", name = "W", descriptor = "I")
    public static int field3546;

    @OriginalMember(owner = "client!sa", name = "X", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!sa", name = "Z", descriptor = "I")
    private int field3549;

    @OriginalMember(owner = "client!sa", name = "bb", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!sa", name = "db", descriptor = "I")
    private int field3553;

    @OriginalMember(owner = "client!sa", name = "eb", descriptor = "I")
    private int field3554;

    @OriginalMember(owner = "client!sa", name = "gb", descriptor = "I")
    public static int field3556;

    @OriginalMember(owner = "client!sa", name = "hb", descriptor = "I")
    private int field3557;

    @OriginalMember(owner = "client!sa", name = "ib", descriptor = "I")
    public static int field3558;

    @OriginalMember(owner = "client!sa", name = "kb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!sa", name = "lb", descriptor = "I")
    private int field3561;

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IIII)V")
    private final void method1313(int arg0, int arg1, int arg2, int arg3) {
        ++field3558;
        if (arg0 < 14) {
            this.method51((class145) null, true, 119);
        }
        int var5 = ~arg1 < -2049 ? -(arg1 * arg3 >> 12) + arg1 + arg3 : (4096 - -arg3) * arg1 >> 12;
        if (~var5 >= -1) {
            this.field3561 = this.field3554 = this.field3557 = arg1;
        } else {
            int var6 = arg2 * 6;
            int var7 = -var5 + arg1 - -arg1;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = -(var9 << 12) + var6;
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (var9 != 2) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field3561 = var5;
                                    this.field3557 = var15;
                                    this.field3554 = var7;
                                }
                            } else {
                                this.field3561 = var14;
                                this.field3554 = var7;
                                this.field3557 = var5;
                            }
                        } else {
                            this.field3557 = var5;
                            this.field3554 = var15;
                            this.field3561 = var7;
                        }
                    } else {
                        this.field3554 = var5;
                        this.field3557 = var14;
                        this.field3561 = var7;
                    }
                } else {
                    this.field3561 = var15;
                    this.field3557 = var7;
                    this.field3554 = var5;
                }
            } else {
                this.field3557 = var7;
                this.field3561 = var5;
                this.field3554 = var14;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lah;III)V")
    public static final void method1314(class9 arg0, int arg1, int arg2, int arg3) {
        int var4 = -25 % ((arg3 - 57) / 60);
        ++field3556;
        if (class67.field1290 == null && !class182.field3289) {
            if (arg0 != null && class177.method1233(arg0, 0) != null) {
                class67.field1290 = arg0;
                class93.field1700 = class177.method1233(arg0, 0);
                class207.field3710 = arg1;
                class39.field893 = false;
                class32.field757 = arg2;
                class61.field1227 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(ILnc;)Lhi;")
    public static final class86 method1315(int arg0, class145 arg1) {
        if (arg0 != 5) {
            return null;
        } else {
            ++field3560;
            return new class86(arg1.method1035(-107), arg1.method1035(arg0 ^ -115), arg1.method1035(-105), arg1.method1035(-92), arg1.method1023(arg0 + -1002749), arg1.method998(91));
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(IBII)V")
    private final void method1316(int arg0, byte arg1, int arg2, int arg3) {
        ++field3546;
        int var5 = arg0 <= arg3 ? arg0 : arg3;
        int var6 = arg3 > arg0 ? arg3 : arg0;
        int var7 = var5 <= arg2 ? var5 : arg2;
        int var8 = ~var6 <= ~arg2 ? var6 : arg2;
        int var9 = 109 / ((arg1 - -44) / 60);
        int var10 = -var7 + var8;
        if (~var10 >= -1) {
            this.field3549 = 0;
        } else {
            int var11 = (-arg2 + var8 << 12) / var10;
            int var12 = (-arg0 + var8 << 12) / var10;
            int var13 = (-arg3 + var8 << 12) / var10;
            if (~arg3 == ~var8) {
                this.field3549 = arg0 == var7 ? 20480 - -var11 : -var12 + 4096;
            } else if (~arg0 != ~var8) {
                this.field3549 = arg3 != var7 ? -var13 + 20480 : var12 + 12288;
            } else {
                this.field3549 = arg2 == var7 ? var13 + 4096 : -var11 + 12288;
            }
            this.field3549 /= 6;
        }
        this.field3553 = (var7 + var8) / 2;
        if (this.field3553 > 0 && ~this.field3553 > -4097) {
            this.field3543 = (var10 << 12) / (this.field3553 <= 2048 ? this.field3553 * 2 : -(this.field3553 * 2) + 8192);
        } else {
            this.field3543 = 0;
        }
    }

    @OriginalMember(owner = "client!sa", name = "<init>", descriptor = "()V")
    public class198() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(II)[[I")
    public final int[][] method116(int arg0, int arg1) {
        ++field3547;
        if (arg1 != -9179) {
            return null;
        } else {
            int[][] var3 = super.field3022.method1148(arg0, 8708);
            if (super.field3022.field2957) {
                int[][] var4 = this.method1180(arg0, 26851, 0);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var3[0];
                int[] var8 = var4[2];
                int[] var9 = var3[2];
                int[] var10 = var3[1];
                for (int var11 = 0; class115.field2146 > var11; ++var11) {
                    this.method1316(var6[var11], (byte) -105, var8[var11], var5[var11]);
                    for (this.field3549 += this.field3544; ~this.field3549 > -1; this.field3549 += 4096) {
                    }
                    while (~this.field3549 < -4097) {
                        this.field3549 -= 4096;
                    }
                    this.field3553 += this.field3562;
                    if (this.field3553 < 0) {
                        this.field3553 = 0;
                    }
                    this.field3543 += this.field3559;
                    if (~this.field3553 < -4097) {
                        this.field3553 = 4096;
                    }
                    if (~this.field3543 > -1) {
                        this.field3543 = 0;
                    }
                    if (this.field3543 > 4096) {
                        this.field3543 = 4096;
                    }
                    this.method1313(42, this.field3553, this.field3549, this.field3543);
                    var7[var11] = this.field3561;
                    var10[var11] = this.field3554;
                    var9[var11] = this.field3557;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Lnc;ZI)V")
    public final void method51(class145 arg0, boolean arg1, int arg2) {
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 == 2) {
                    this.field3562 = (arg0.method994((byte) 105) << 12) / 100;
                }
            } else {
                this.field3559 = (arg0.method994((byte) 56) << 12) / 100;
            }
        } else {
            this.field3544 = arg0.method1035(-110);
        }
        if (arg1) {
            this.method51((class145) null, true, -81);
        }
        ++field3545;
    }

    @OriginalMember(owner = "client!sa", name = "a", descriptor = "(Z)V")
    public static void method1317(boolean arg0) {
        field3550 = null;
        field3555 = null;
        field3552 = null;
        if (!arg0) {
            field3548 = 54;
        }
    }
}
