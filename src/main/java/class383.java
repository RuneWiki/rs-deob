import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class383 extends class377 {

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    private int field4921 = 16;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    private int field4919 = 0;

    @OriginalMember(owner = "client!dg", name = "z", descriptor = "I")
    private int field4915 = 4096;

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    private int field4927 = 2000;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    private int field4923 = 0;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "I")
    public static int field4924 = 0;

    @OriginalMember(owner = "client!dg", name = "A", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!dg", name = "B", descriptor = "I")
    public static int field4917;

    @OriginalMember(owner = "client!dg", name = "C", descriptor = "I")
    public static int field4918;

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field4920;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field4922;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field4925;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    public static int field4926;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z[BZIIIILjaa;)Lhq;", line = 3)
    public static final class148 method2204(boolean arg0, byte[] arg1, boolean arg2, int arg3, int arg4, int arg5, int arg6, class576 arg7) {
        if (arg0) {
            return null;
        } else {
            ++field4922;
            if (!arg7.field7709 && (!class182.method1084((byte) 122, arg3) || !class182.method1084((byte) 88, arg6))) {
                return arg7.field7651 ? new class148(arg7, 34037, arg5, arg3, arg6, arg2, arg1, arg4) : new class148(arg7, arg5, arg3, arg6, class560.method2979(arg3, (byte) 65), class560.method2979(arg6, (byte) 11), arg1, arg4);
            } else {
                return new class148(arg7, 3553, arg5, arg3, arg6, arg2, arg1, arg4);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(B)V", line = 25)
    public final void method91(byte arg0) {
        if (arg0 < 52) {
            this.field4927 = -17;
        }
        class430.method2367(-10177);
        ++field4920;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IILji;)V", line = 38)
    public final void method27(int arg0, int arg1, class572 arg2) {
        ++field4925;
        int var4 = -21 / ((arg1 - 13) / 55);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 == 4) {
                            this.field4915 = arg2.method3031(-1);
                        }
                    } else {
                        this.field4919 = arg2.method3031(-1);
                    }
                } else {
                    this.field4921 = arg2.method3097((byte) 12);
                }
            } else {
                this.field4927 = arg2.method3031(-1);
            }
        } else {
            this.field4923 = arg2.method3097((byte) 12);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(II)[I", line = 100)
    public final int[] method88(int arg0, int arg1) {
        ++field4918;
        int var3 = 82 / ((arg1 - 5) / 53);
        int[] var4 = super.field4842.method2772(arg0, (byte) -121);
        if (super.field4842.field6354) {
            int var5 = this.field4915 >> 1;
            int[][] var6 = super.field4842.method2771(0);
            Random var7 = new Random((long) this.field4923);
            for (int var8 = 0; ~this.field4927 < ~var8; ++var8) {
                int var9 = ~this.field4915 >= -1 ? this.field4919 : this.field4919 - var5 - -class396.method2241(0, this.field4915, var7);
                int var10 = var9 >> 4 & 255;
                int var11 = class396.method2241(0, class528.field6661, var7);
                int var12 = class396.method2241(0, field4916, var7);
                int var13 = (class618.field8383[var10] * this.field4921 >> 12) + var11;
                int var14 = (class595.field7986[var10] * this.field4921 >> 12) + var12;
                int var15 = -var12 + var14;
                int var16 = -var11 + var13;
                if (var16 != 0 || var15 != 0) {
                    if (var15 < 0) {
                        var15 = -var15;
                    }
                    if (~var16 > -1) {
                        var16 = -var16;
                    }
                    boolean var17 = ~var15 < ~var16;
                    if (var17) {
                        int var18 = var11;
                        int var19 = var13;
                        var11 = var12;
                        var12 = var18;
                        var13 = var14;
                        var14 = var19;
                    }
                    if (~var11 < ~var13) {
                        int var20 = var11;
                        int var21 = var12;
                        var11 = var13;
                        var12 = var14;
                        var13 = var20;
                        var14 = var21;
                    }
                    int var22 = var12;
                    int var23 = -var11 + var13;
                    int var24 = -var12 + var14;
                    int var25 = -var23 / 2;
                    int var26 = 2048 / var23;
                    int var27 = 1024 - (class396.method2241(0, 4096, var7) >> 2);
                    if (~var24 > -1) {
                        var24 = -var24;
                    }
                    int var28 = var14 > var12 ? 1 : -1;
                    for (int var29 = var11; var29 < var13; ++var29) {
                        int var30 = (-var11 + var29) * var26 + 1024 + var27;
                        int var31 = class376.field4836 & var29;
                        int var32 = class251.field3236 & var22;
                        var25 += var24;
                        if (!var17) {
                            var6[var31][var32] = var30;
                        } else {
                            var6[var32][var31] = var30;
                        }
                        if (var25 > 0) {
                            var25 += -var23;
                            var22 += var28;
                        }
                    }
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V", line = 235)
    public class383() {
        super(0, true);
    }
}
