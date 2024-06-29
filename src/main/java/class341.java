import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rd")
public class class341 extends class263 {

    @OriginalMember(owner = "client!rd", name = "K", descriptor = "I")
    private int field5248 = 4096;

    @OriginalMember(owner = "client!rd", name = "M", descriptor = "I")
    private int field5250 = 0;

    @OriginalMember(owner = "client!rd", name = "J", descriptor = "I")
    public static int field5247 = 0;

    @OriginalMember(owner = "client!rd", name = "E", descriptor = "I")
    public static int field5242;

    @OriginalMember(owner = "client!rd", name = "F", descriptor = "I")
    public static int field5243;

    @OriginalMember(owner = "client!rd", name = "G", descriptor = "I")
    public static int field5244;

    @OriginalMember(owner = "client!rd", name = "H", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!rd", name = "I", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!rd", name = "L", descriptor = "I")
    public static int field5249;

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IZLgk;)V")
    public final void method32(int arg0, boolean arg1, class468 arg2) {
        if (arg1) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        super.field3927 = arg2.method2765(55) == 1;
                    }
                } else {
                    this.field5248 = arg2.method2727((byte) 43);
                }
            } else {
                this.field5250 = arg2.method2727((byte) 43);
            }
            ++field5246;
        }
    }

    @OriginalMember(owner = "client!rd", name = "b", descriptor = "(IB)[[I")
    public final int[][] method34(int arg0, byte arg1) {
        if (arg1 >= -45) {
            this.method34(108, (byte) -56);
        }
        ++field5249;
        int[][] var3 = super.field3912.method2649(arg0, false);
        if (super.field3912.field6681) {
            int[][] var4 = this.method1646(0, 2, arg0);
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int[] var8 = var3[0];
            int[] var9 = var3[1];
            int[] var10 = var3[2];
            for (int var11 = 0; ~var11 > ~class367.field5597; ++var11) {
                int var12 = var5[var11];
                int var13 = var6[var11];
                int var14 = var7[var11];
                if (var12 < this.field5250) {
                    var8[var11] = this.field5250;
                } else if (this.field5248 >= var12) {
                    var8[var11] = var12;
                } else {
                    var8[var11] = this.field5248;
                }
                if (~var13 > ~this.field5250) {
                    var9[var11] = this.field5250;
                } else if (this.field5248 >= var13) {
                    var9[var11] = var13;
                } else {
                    var9[var11] = this.field5248;
                }
                if (var14 >= this.field5250) {
                    if (this.field5248 < var14) {
                        var10[var11] = this.field5248;
                    } else {
                        var10[var11] = var14;
                    }
                } else {
                    var10[var11] = this.field5250;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "a", descriptor = "(IB)[I")
    public final int[] method33(int arg0, byte arg1) {
        ++field5245;
        int[] var3 = super.field3917.method41(arg0, 1);
        if (super.field3917.field91) {
            int[] var4 = this.method1644(0, 0, arg0);
            for (int var5 = 0; ~class367.field5597 < ~var5; ++var5) {
                int var6 = var4[var5];
                if (this.field5250 <= var6) {
                    if (~var6 >= ~this.field5248) {
                        var3[var5] = var6;
                    } else {
                        var3[var5] = this.field5248;
                    }
                } else {
                    var3[var5] = this.field5250;
                }
            }
        }
        if (arg1 <= 40) {
            field5244 = -92;
        }
        return var3;
    }

    @OriginalMember(owner = "client!rd", name = "c", descriptor = "(III)Lnu;")
    public static final class259 method2081(int arg0, int arg1, int arg2) {
        class306 var3 = class236.field3305[arg0][arg1][arg2];
        return var3 != null && var3.field4577 != null ? var3.field4577 : null;
    }

    @OriginalMember(owner = "client!rd", name = "d", descriptor = "(III)Z")
    public static final boolean method2082(int arg0, int arg1, int arg2) {
        int var3 = -39 / ((-6 - arg2) / 53);
        ++field5243;
        return class506.method2989(arg1, 101, arg0) & class87.method687(arg1, 2048, arg0);
    }

    @OriginalMember(owner = "client!rd", name = "<init>", descriptor = "()V")
    public class341() {
        super(1, false);
    }
}
