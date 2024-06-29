import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oea")
public class class543 extends class748 {

    @OriginalMember(owner = "client!oea", name = "O", descriptor = "I")
    private int field7594 = 0;

    @OriginalMember(owner = "client!oea", name = "J", descriptor = "I")
    private int field7589 = 2048;

    @OriginalMember(owner = "client!oea", name = "K", descriptor = "I")
    private int field7590 = 4096;

    @OriginalMember(owner = "client!oea", name = "L", descriptor = "I")
    private int field7591 = 0;

    @OriginalMember(owner = "client!oea", name = "M", descriptor = "I")
    private int field7592 = 12288;

    @OriginalMember(owner = "client!oea", name = "T", descriptor = "I")
    private int field7599 = 2048;

    @OriginalMember(owner = "client!oea", name = "V", descriptor = "I")
    private int field7601 = 8192;

    @OriginalMember(owner = "client!oea", name = "I", descriptor = "[F")
    public static float[] field7588 = new float[16384];

    @OriginalMember(owner = "client!oea", name = "S", descriptor = "[F")
    public static float[] field7598 = new float[16384];

    @OriginalMember(owner = "client!oea", name = "H", descriptor = "I")
    public static int field7587;

    @OriginalMember(owner = "client!oea", name = "N", descriptor = "I")
    public static int field7593;

    @OriginalMember(owner = "client!oea", name = "P", descriptor = "I")
    public static int field7595;

    @OriginalMember(owner = "client!oea", name = "Q", descriptor = "I")
    public static int field7596;

    @OriginalMember(owner = "client!oea", name = "R", descriptor = "I")
    public static int field7597;

    @OriginalMember(owner = "client!oea", name = "U", descriptor = "I")
    public static int field7600;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; ++var2) {
            field7588[var2] = (float) Math.sin((double) var2 * var0);
            field7598[var2] = (float) Math.cos((double) var2 * var0);
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(II)[I", line = 6)
    public final int[] method25(int arg0, int arg1) {
        if (arg1 != 255) {
            this.method23((byte) 25);
        }
        ++field7597;
        int[] var3 = super.field10407.method3873(arg1 + -255, arg0);
        if (super.field10407.field9527) {
            int var4 = class370.field4727[arg0] - 2048;
            for (int var5 = 0; class424.field5889 > var5; ++var5) {
                int var6 = class237.field3298[var5] + -2048;
                int var7 = this.field7599 + var6;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 < -2049 ? var8 + -4096 : var8;
                int var10 = this.field7591 + var4;
                int var11 = ~var10 > 2047 ? var10 + 4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = var6 - -this.field7594;
                int var14 = var13 >= -2048 ? var13 : var13 + 4096;
                int var15 = ~var14 >= -2049 ? var14 : var14 + -4096;
                int var16 = this.field7589 + var4;
                int var17 = ~var16 <= 2047 ? var16 : var16 + 4096;
                int var18 = var17 <= 2048 ? var17 : var17 - 4096;
                var3[var5] = !this.method3231(var9, var12, class450.method2703(arg1, 191)) && !this.method3230(var18, var15, 41) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(B)V", line = 60)
    public static void method3228(byte arg0) {
        if (arg0 == -71) {
            field7598 = null;
            field7588 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IZLvj;)V", line = 72)
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (~arg0 == -7) {
                                    this.field7601 = arg2.method193(2);
                                }
                            } else {
                                this.field7590 = arg2.method193(2);
                            }
                        } else {
                            this.field7592 = arg2.method193(2);
                        }
                    } else {
                        this.field7589 = arg2.method193(2);
                    }
                } else {
                    this.field7594 = arg2.method193(2);
                }
            } else {
                this.field7591 = arg2.method193(2);
            }
        } else {
            this.field7599 = arg2.method193(2);
        }
        if (arg1) {
            this.method25(-85, 89);
        }
        ++field7587;
    }

    @OriginalMember(owner = "client!oea", name = "<init>", descriptor = "()V", line = 231)
    public class543() {
        super(0, true);
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(IIB)V", line = 159)
    public static final void method3229(int arg0, int arg1, byte arg2) {
        class422.method2575(arg1, arg0, (byte) 117);
        ++field7593;
        if (arg2 >= -62) {
            field7598 = null;
        }
    }

    @OriginalMember(owner = "client!oea", name = "d", descriptor = "(III)Z", line = 170)
    private final boolean method3230(int arg0, int arg1, int arg2) {
        ++field7595;
        int var4 = (arg0 + arg1) * this.field7592 >> 12;
        int var5 = class666.field9382[(1047822 & var4 * 255) >> 12];
        if (arg2 < 27) {
            method3229(-53, 30, (byte) 1);
        }
        int var6 = (var5 << 12) / this.field7592;
        int var7 = (var6 << 12) / this.field7601;
        int var8 = this.field7590 * var7 >> 12;
        return var8 > -arg1 + arg0 && arg0 - arg1 > -var8;
    }

    @OriginalMember(owner = "client!oea", name = "e", descriptor = "(III)Z", line = 198)
    private final boolean method3231(int arg0, int arg1, int arg2) {
        ++field7600;
        if (arg2 < 50) {
            return true;
        } else {
            int var4 = (-arg0 + arg1) * this.field7592 >> 12;
            int var5 = class666.field9382[(1047041 & var4 * 255) >> 12];
            int var6 = (var5 << 12) / this.field7592;
            int var7 = (var6 << 12) / this.field7601;
            int var8 = this.field7590 * var7 >> 12;
            return ~var8 < ~(arg0 + arg1) && arg0 + arg1 > -var8;
        }
    }

    @OriginalMember(owner = "client!oea", name = "a", descriptor = "(B)V", line = 220)
    public final void method23(byte arg0) {
        if (arg0 != 67) {
            this.method3231(73, 87, -7);
        }
        class503.method3003((byte) 116);
        ++field7596;
    }
}
