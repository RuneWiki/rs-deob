import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class243 extends class646 {

    @OriginalMember(owner = "client!rm", name = "I", descriptor = "I")
    private int field3553 = 5;

    @OriginalMember(owner = "client!rm", name = "J", descriptor = "[B")
    private byte[] field3554 = new byte[512];

    @OriginalMember(owner = "client!rm", name = "M", descriptor = "I")
    private int field3557 = 0;

    @OriginalMember(owner = "client!rm", name = "P", descriptor = "I")
    private int field3560 = 2048;

    @OriginalMember(owner = "client!rm", name = "N", descriptor = "I")
    private int field3558 = 5;

    @OriginalMember(owner = "client!rm", name = "L", descriptor = "I")
    private int field3556 = 1;

    @OriginalMember(owner = "client!rm", name = "S", descriptor = "I")
    private int field3563 = 2;

    @OriginalMember(owner = "client!rm", name = "T", descriptor = "[S")
    private short[] field3564 = new short[512];

    @OriginalMember(owner = "client!rm", name = "O", descriptor = "Leda;")
    public static class116 field3559 = new class116(115, 0);

    @OriginalMember(owner = "client!rm", name = "U", descriptor = "[I")
    public static int[] field3565 = new int[25];

    @OriginalMember(owner = "client!rm", name = "K", descriptor = "I")
    public static int field3555;

    @OriginalMember(owner = "client!rm", name = "Q", descriptor = "I")
    public static int field3561;

    @OriginalMember(owner = "client!rm", name = "R", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!rm", name = "V", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!rm", name = "X", descriptor = "I")
    public static int field3568;

    @OriginalMember(owner = "client!rm", name = "W", descriptor = "[Lf;")
    public static class257[] field3567;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(Z)V", line = 6)
    public static void method1567(boolean arg0) {
        if (arg0) {
            field3567 = null;
            field3565 = null;
            field3559 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "<init>", descriptor = "()V", line = 23)
    public class243() {
        super(0, true);
    }

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "(I)V", line = 26)
    private final void method1568(int arg0) {
        ++field3566;
        Random var2 = new Random((long) this.field3557);
        this.field3564 = new short[512];
        if (arg0 != 2048) {
            this.field3556 = -93;
        }
        if (~this.field3560 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3564[var3] = (short) class357.method2154(var2, this.field3560, Integer.MIN_VALUE);
            }
        }
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(IB)[I", line = 61)
    public final int[] method424(int arg0, byte arg1) {
        ++field3555;
        int[] var3 = super.field9156.method2193(1269, arg0);
        if (super.field9156.field5075) {
            int var4 = class78.field1195[arg0] * this.field3553 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 - -1;
            for (int var7 = 0; ~class89.field1330 < ~var7; ++var7) {
                class587.field8580 = Integer.MAX_VALUE;
                class699.field9912 = Integer.MAX_VALUE;
                class190.field2978 = Integer.MAX_VALUE;
                class99.field1483 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class518.field7652[var7] * this.field3558);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field3554[255 & (var11 < this.field3553 ? var11 : -this.field3553 + var11)] & 255;
                    for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                        int var15 = (this.field3554[255 & (this.field3558 > var14 ? var14 : -this.field3558 + var14) + var13] & 255) * 2;
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field3564[var15] + var8;
                        int var17 = -this.field3564[var27] - ((var11 << 12) - var4);
                        int var18 = this.field3556;
                        int var19;
                        if (var18 != 1) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var17 < 0 ? -var17 : var17) + (~var16 <= -1 ? var16 : -var16);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 < 0 ? -var16 : var16) / 4096.0F)));
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = ~var17 <= -1 ? var17 : -var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class99.field1483 < ~var19) {
                            class587.field8580 = class699.field9912;
                            class699.field9912 = class190.field2978;
                            class190.field2978 = class99.field1483;
                            class99.field1483 = var19;
                        } else if (~var19 <= ~class190.field2978) {
                            if (class699.field9912 > var19) {
                                class587.field8580 = class699.field9912;
                                class699.field9912 = var19;
                            } else if (~class587.field8580 < ~var19) {
                                class587.field8580 = var19;
                            }
                        } else {
                            class587.field8580 = class699.field9912;
                            class699.field9912 = class190.field2978;
                            class190.field2978 = var19;
                        }
                    }
                }
                int var12 = this.field3563;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = class190.field2978 - class99.field1483;
                                }
                            } else {
                                var3[var7] = class587.field8580;
                            }
                        } else {
                            var3[var7] = class699.field9912;
                        }
                    } else {
                        var3[var7] = class190.field2978;
                    }
                } else {
                    var3[var7] = class99.field1483;
                }
            }
        }
        return arg1 != -120 ? null : var3;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(Lek;IB)V", line = 272)
    public final void method295(class465 arg0, int arg1, byte arg2) {
        ++field3562;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (~arg1 != -6) {
                                if (arg1 == 6) {
                                    this.field3553 = arg0.method2705(-96);
                                }
                            } else {
                                this.field3558 = arg0.method2705(-61);
                            }
                        } else {
                            this.field3556 = arg0.method2705(-82);
                        }
                    } else {
                        this.field3563 = arg0.method2705(-117);
                    }
                } else {
                    this.field3560 = arg0.method2755((byte) -67);
                }
            } else {
                this.field3557 = arg0.method2705(-124);
            }
        } else {
            this.field3558 = this.field3553 = arg0.method2705(-128);
        }
        if (arg2 < 7) {
            field3559 = null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "(I)V", line = 358)
    public final void method422(int arg0) {
        if (arg0 != -1) {
            this.method1568(26);
        }
        ++field3568;
        this.field3554 = class153.method1157(47, this.field3557);
        this.method1568(arg0 + 2049);
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(II)V", line = 374)
    public static final void method1569(int arg0, int arg1) {
        ++field3561;
        if (arg0 >= -26) {
            method1569(41, -107);
        }
        class189.field2957 = arg1;
        class681.field9691.method936(-59);
    }
}
