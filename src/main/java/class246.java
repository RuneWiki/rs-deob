import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mn")
public class class246 extends class278 {

    @OriginalMember(owner = "client!mn", name = "K", descriptor = "[I")
    private int[] field3422 = new int[3];

    @OriginalMember(owner = "client!mn", name = "N", descriptor = "I")
    private int field3425 = 4096;

    @OriginalMember(owner = "client!mn", name = "R", descriptor = "I")
    private int field3429 = 409;

    @OriginalMember(owner = "client!mn", name = "M", descriptor = "I")
    private int field3424 = 4096;

    @OriginalMember(owner = "client!mn", name = "I", descriptor = "I")
    private int field3421 = 4096;

    @OriginalMember(owner = "client!mn", name = "O", descriptor = "I")
    public static int field3426 = 0;

    @OriginalMember(owner = "client!mn", name = "L", descriptor = "Ljm;")
    public static class485 field3423 = new class485(80, 5);

    @OriginalMember(owner = "client!mn", name = "U", descriptor = "I")
    public static int field3432 = 1400;

    @OriginalMember(owner = "client!mn", name = "V", descriptor = "[I")
    public static int[] field3433 = new int[13];

    @OriginalMember(owner = "client!mn", name = "Q", descriptor = "I")
    public static int field3428;

    @OriginalMember(owner = "client!mn", name = "S", descriptor = "I")
    public static int field3430;

    @OriginalMember(owner = "client!mn", name = "T", descriptor = "I")
    public static int field3431;

    @OriginalMember(owner = "client!mn", name = "P", descriptor = "Lia;")
    public static class415 field3427;

    @OriginalMember(owner = "client!mn", name = "W", descriptor = "[Ljava/lang/String;")
    public static String[] field3434;

    @OriginalMember(owner = "client!mn", name = "<init>", descriptor = "()V", line = 3)
    public class246() {
        super(1, false);
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(II)[[I", line = 12)
    public final int[][] method324(int arg0, int arg1) {
        if (arg0 <= 75) {
            this.method210((class365) null, -99, -22);
        }
        ++field3431;
        int[][] var3 = super.field3757.method1450(arg1, -1);
        if (super.field3757.field3420) {
            int[][] var4 = this.method1568(5426, 0, arg1);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class507.field7456; ++var11) {
                int var12 = var5[var11];
                int var13 = var12 - this.field3422[0];
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (~this.field3429 > ~var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var10[var11] = var7[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field3422[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~this.field3429 > ~var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var10[var11] = var7[var11];
                    } else {
                        int var16 = var7[var11];
                        int var17 = -this.field3422[2] + var16;
                        if (~var17 > -1) {
                            var17 = -var17;
                        }
                        if (var17 > this.field3429) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var10[var11] = var16;
                        } else {
                            var8[var11] = this.field3424 * var12 >> 12;
                            var9[var11] = this.field3421 * var14 >> 12;
                            var10[var11] = this.field3425 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!mn", name = "g", descriptor = "(I)V", line = 116)
    public static void method1453(int arg0) {
        field3433 = null;
        if (arg0 == -28029) {
            field3427 = null;
            field3423 = null;
            field3434 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "a", descriptor = "(Llh;II)V", line = 132)
    public final void method210(class365 arg0, int arg1, int arg2) {
        ++field3428;
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (~arg2 != -3) {
                    if (arg2 != 3) {
                        if (arg2 == 4) {
                            int var5 = arg0.method2111(arg1 + 30444);
                            this.field3422[0] = class118.method750(var5, 16711680) << 4;
                            this.field3422[2] = class118.method750(var5, 255) >> 12;
                            this.field3422[1] = class118.method750(4080, var5 >> 4);
                        }
                    } else {
                        this.field3424 = arg0.method2062((byte) 14);
                    }
                } else {
                    this.field3421 = arg0.method2062((byte) 14);
                }
            } else {
                this.field3425 = arg0.method2062((byte) 14);
            }
        } else {
            this.field3429 = arg0.method2062((byte) 14);
        }
        if (arg1 != -30446) {
            this.field3422 = null;
        }
    }

    @OriginalMember(owner = "client!mn", name = "c", descriptor = "(III)I", line = 202)
    public static final int method1454(int arg0, int arg1, int arg2) {
        ++field3430;
        return ~arg0 != arg1 && ~arg0 != -4 ? class274.field3726[3 & arg2] : class106.field1447[arg2 & 3];
    }
}
