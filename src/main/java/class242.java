import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fe")
public class class242 extends class273 {

    @OriginalMember(owner = "client!fe", name = "T", descriptor = "I")
    private int field4335 = 4096;

    @OriginalMember(owner = "client!fe", name = "S", descriptor = "I")
    public static int field4334;

    @OriginalMember(owner = "client!fe", name = "U", descriptor = "I")
    public static int field4336;

    @OriginalMember(owner = "client!fe", name = "V", descriptor = "I")
    public static int field4337;

    @OriginalMember(owner = "client!fe", name = "W", descriptor = "I")
    public static int field4338;

    @OriginalMember(owner = "client!fe", name = "X", descriptor = "I")
    public static int field4339;

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(ILqk;I)V")
    public final void method34(int arg0, class200 arg1, int arg2) {
        ++field4336;
        if (~arg0 == -1) {
            this.field4335 = arg1.method1410(-109);
        }
        if (arg2 > -16) {
            method1656(88, -8, 27, (class151) null);
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(II)[I")
    public final int[] method31(int arg0, int arg1) {
        ++field4338;
        if (arg0 != -7420) {
            return null;
        } else {
            int[] var3 = super.field4800.method1224(arg1, 0);
            if (super.field4800.field3160) {
                int[] var4 = this.method1863(arg0 ^ 7314, 0, arg1 + -1 & class274.field4808);
                int[] var5 = this.method1863(-128, 0, arg1);
                int[] var6 = this.method1863(-118, 0, arg1 + 1 & class274.field4808);
                for (int var7 = 0; ~class176.field3200 < ~var7; ++var7) {
                    int var8 = (var5[var7 + 1 & class90.field1844] - var5[var7 + -1 & class90.field1844]) * this.field4335;
                    int var9 = (var6[var7] - var4[var7]) * this.field4335;
                    int var10 = var8 >> 12;
                    int var11 = var9 >> 12;
                    int var12 = var10 * var10 >> 12;
                    int var13 = var11 * var11 >> 12;
                    int var14 = (int) (Math.sqrt((double) ((float) (var12 + var13 + 4096) / 4096.0F)) * 4096.0D);
                    int var15 = var14 != 0 ? 16777216 / var14 : 0;
                    var3[var7] = -var15 + 4096;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!fe", name = "f", descriptor = "(I)V")
    public static final void method1655(int arg0) {
        ++field4337;
        class195.field3502.method702((byte) -88);
        class165.field3088.method702((byte) -88);
        if (arg0 != 1) {
            field4334 = -122;
        }
    }

    @OriginalMember(owner = "client!fe", name = "a", descriptor = "(IIILbj;)[Lod;")
    public static final class90[] method1656(int arg0, int arg1, int arg2, class151 arg3) {
        ++field4339;
        if (arg2 != -13248) {
            field4334 = 40;
        }
        return !class163.method1181(arg3, arg1, 10475, arg0) ? null : class265.method1794(0);
    }

    @OriginalMember(owner = "client!fe", name = "<init>", descriptor = "()V")
    public class242() {
        super(1, true);
    }
}
