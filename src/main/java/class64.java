import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gb")
public class class64 extends class144 {

    @OriginalMember(owner = "client!gb", name = "O", descriptor = "I")
    private int field752 = 409;

    @OriginalMember(owner = "client!gb", name = "R", descriptor = "I")
    private int field755 = 4096;

    @OriginalMember(owner = "client!gb", name = "M", descriptor = "I")
    private int field750 = 4096;

    @OriginalMember(owner = "client!gb", name = "J", descriptor = "I")
    private int field747 = 4096;

    @OriginalMember(owner = "client!gb", name = "P", descriptor = "[I")
    private int[] field753 = new int[3];

    @OriginalMember(owner = "client!gb", name = "I", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!gb", name = "K", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!gb", name = "L", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!gb", name = "Q", descriptor = "I")
    public static int field754;

    @OriginalMember(owner = "client!gb", name = "S", descriptor = "I")
    public static int field756;

    @OriginalMember(owner = "client!gb", name = "N", descriptor = "[[[I")
    public static int[][][] field751;

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(BI)[[I")
    public final int[][] method8(byte arg0, int arg1) {
        ++field748;
        if (arg0 != 5) {
            this.field752 = 98;
        }
        int[][] var3 = super.field2053.method1542(115, arg1);
        if (super.field2053.field3408) {
            int[][] var4 = this.method927(arg1, true, 0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var3[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var4[2];
            for (int var11 = 0; ~class104.field1411 < ~var11; ++var11) {
                int var12 = var5[var11];
                int var13 = -this.field753[0] + var12;
                if (var13 < 0) {
                    var13 = -var13;
                }
                if (this.field752 < var13) {
                    var8[var11] = var12;
                    var9[var11] = var6[var11];
                    var7[var11] = var10[var11];
                } else {
                    int var14 = var6[var11];
                    int var15 = -this.field753[1] + var14;
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (this.field752 < var15) {
                        var8[var11] = var12;
                        var9[var11] = var14;
                        var7[var11] = var10[var11];
                    } else {
                        int var16 = var10[var11];
                        int var17 = -this.field753[2] + var16;
                        if (var17 < 0) {
                            var17 = -var17;
                        }
                        if (this.field752 < var17) {
                            var8[var11] = var12;
                            var9[var11] = var14;
                            var7[var11] = var16;
                        } else {
                            var8[var11] = this.field755 * var12 >> 12;
                            var9[var11] = this.field750 * var14 >> 12;
                            var7[var11] = this.field747 * var16 >> 12;
                        }
                    }
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(ILqi;I)V")
    public final void method9(int arg0, class216 arg1, int arg2) {
        ++field756;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (arg0 == 4) {
                            int var5 = arg1.method1382(arg2 + -20687);
                            this.field753[1] = class5.method26(var5, 65280) >> 4;
                            this.field753[0] = class5.method26(var5, 16711680) << 4;
                            this.field753[2] = class5.method26(255, var5) >> 12;
                        }
                    } else {
                        this.field755 = arg1.method1380(true);
                    }
                } else {
                    this.field750 = arg1.method1380(true);
                }
            } else {
                this.field747 = arg1.method1380(true);
            }
        } else {
            this.field752 = arg1.method1380(true);
        }
        if (arg2 != 20630) {
            field751 = null;
        }
    }

    @OriginalMember(owner = "client!gb", name = "g", descriptor = "(I)V")
    public static void method388(int arg0) {
        field751 = null;
        if (arg0 != 5293) {
            field746 = 69;
        }
    }

    @OriginalMember(owner = "client!gb", name = "<init>", descriptor = "()V")
    public class64() {
        super(1, false);
    }

    @OriginalMember(owner = "client!gb", name = "a", descriptor = "(I[BI)I")
    public static final int method389(int arg0, byte[] arg1, int arg2) {
        ++field754;
        if (arg2 != -32344) {
            method389(-119, (byte[]) null, -62);
        }
        return class122.method802(arg1, 0, arg0, -124);
    }
}
