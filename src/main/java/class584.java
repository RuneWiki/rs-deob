import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ap")
public class class584 extends class214 {

    @OriginalMember(owner = "client!ap", name = "E", descriptor = "I")
    private int field8244 = 2000;

    @OriginalMember(owner = "client!ap", name = "G", descriptor = "I")
    private int field8246 = 16;

    @OriginalMember(owner = "client!ap", name = "J", descriptor = "I")
    private int field8249 = 4096;

    @OriginalMember(owner = "client!ap", name = "D", descriptor = "I")
    private int field8243 = 0;

    @OriginalMember(owner = "client!ap", name = "O", descriptor = "I")
    private int field8254 = 0;

    @OriginalMember(owner = "client!ap", name = "F", descriptor = "Z")
    public static boolean field8245 = false;

    @OriginalMember(owner = "client!ap", name = "M", descriptor = "[S")
    public static short[] field8252 = new short[] { 12, 17, 49, 19, 9, 4, 22, 60 };

    @OriginalMember(owner = "client!ap", name = "H", descriptor = "Lcb;")
    public static class631 field8247 = new class631(33, 3);

    @OriginalMember(owner = "client!ap", name = "I", descriptor = "I")
    public static int field8248;

    @OriginalMember(owner = "client!ap", name = "K", descriptor = "I")
    public static int field8250;

    @OriginalMember(owner = "client!ap", name = "L", descriptor = "I")
    public static int field8251;

    @OriginalMember(owner = "client!ap", name = "N", descriptor = "I")
    public static int field8253;

    @OriginalMember(owner = "client!ap", name = "b", descriptor = "(ZII)Z")
    public static final boolean method3365(boolean arg0, int arg1, int arg2) {
        ++field8248;
        if (~arg1 <= -1 && ~arg2 <= -1 && class434.field6341[1].length > arg1 && ~class434.field6341[1][arg1].length < ~arg2) {
            if (arg0) {
                method3366(-124);
            }
            return (class434.field6341[1][arg1][arg2] & 2) != 0;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ap", name = "f", descriptor = "(I)V")
    public static void method3366(int arg0) {
        field8252 = null;
        field8247 = null;
        if (arg0 > -64) {
            field8252 = null;
        }
    }

    @OriginalMember(owner = "client!ap", name = "c", descriptor = "(I)V")
    public final void method65(int arg0) {
        ++field8250;
        class465.method2853(256);
        if (arg0 <= 48) {
            method3365(true, 50, 58);
        }
    }

    @OriginalMember(owner = "client!ap", name = "d", descriptor = "(II)I")
    public static int method3367(int arg0, int arg1) {
        return arg0 ^ arg1;
    }

    @OriginalMember(owner = "client!ap", name = "<init>", descriptor = "()V")
    public class584() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(ILofa;I)V")
    public final void method59(int arg0, class301 arg1, int arg2) {
        ++field8251;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (~arg2 != -4) {
                        if (~arg2 == -5) {
                            this.field8249 = arg1.method1989((byte) -73);
                        }
                    } else {
                        this.field8254 = arg1.method1989((byte) -31);
                    }
                } else {
                    this.field8246 = arg1.method1987(-29);
                }
            } else {
                this.field8244 = arg1.method1989((byte) -42);
            }
        } else {
            this.field8243 = arg1.method1987(-22);
        }
        if (arg0 <= 92) {
            method3365(true, 75, -13);
        }
    }

    @OriginalMember(owner = "client!ap", name = "a", descriptor = "(IB)[I")
    public final int[] method64(int arg0, byte arg1) {
        ++field8253;
        if (arg1 != 5) {
            field8247 = null;
        }
        int[] var3 = super.field3544.method3869(arg0, arg1 + -128);
        if (super.field3544.field9836) {
            int var4 = this.field8249 >> 1;
            int[][] var5 = super.field3544.method3866((byte) -114);
            Random var6 = new Random((long) this.field8243);
            for (int var7 = 0; this.field8244 > var7; ++var7) {
                int var8 = ~this.field8249 >= -1 ? this.field8254 : this.field8254 + (class721.method3975(this.field8249, var6, false) - var4);
                int var9 = 255 & var8 >> 4;
                int var10 = class721.method3975(class626.field8787, var6, false);
                int var11 = class721.method3975(class259.field4054, var6, false);
                int var12 = var10 - -(class3.field18[var9] * this.field8246 >> 12);
                int var13 = (class55.field885[var9] * this.field8246 >> 12) + var11;
                int var14 = var13 - var11;
                int var15 = -var10 + var12;
                if (var15 != 0 || ~var14 != -1) {
                    if (~var15 > -1) {
                        var15 = -var15;
                    }
                    if (var14 < 0) {
                        var14 = -var14;
                    }
                    boolean var16 = var14 > var15;
                    if (var16) {
                        int var17 = var10;
                        var10 = var11;
                        int var18 = var12;
                        var11 = var17;
                        var12 = var13;
                        var13 = var18;
                    }
                    if (var10 > var12) {
                        int var19 = var10;
                        int var20 = var11;
                        var10 = var12;
                        var11 = var13;
                        var12 = var19;
                        var13 = var20;
                    }
                    int var21 = var11;
                    int var22 = -var10 + var12;
                    int var23 = -var11 + var13;
                    int var24 = -var22 / 2;
                    int var25 = 2048 / var22;
                    int var26 = -(class721.method3975(4096, var6, false) >> 2) + 1024;
                    if (~var23 > -1) {
                        var23 = -var23;
                    }
                    int var27 = ~var13 >= ~var11 ? -1 : 1;
                    for (int var28 = var10; ~var12 < ~var28; ++var28) {
                        int var29 = (-var10 + var28) * var25 + var26 + 1024;
                        int var30 = class245.field3948 & var28;
                        int var31 = class580.field8203 & var21;
                        var24 += var23;
                        if (!var16) {
                            var5[var30][var31] = var29;
                        } else {
                            var5[var31][var30] = var29;
                        }
                        if (var24 > 0) {
                            var24 += -var22;
                            var21 -= -var27;
                        }
                    }
                }
            }
        }
        return var3;
    }
}
