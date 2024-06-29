import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class193 extends class32 {

    @OriginalMember(owner = "client!rh", name = "rb", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!rh", name = "qb", descriptor = "I")
    public static int field3365 = -8 + (int) (17.0D * Math.random());

    @OriginalMember(owner = "client!rh", name = "pb", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!rh", name = "tb", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!rh", name = "ub", descriptor = "I")
    public static int field3369;

    @OriginalMember(owner = "client!rh", name = "vb", descriptor = "I")
    public static int field3370;

    @OriginalMember(owner = "client!rh", name = "wb", descriptor = "I")
    public static int field3371;

    @OriginalMember(owner = "client!rh", name = "sb", descriptor = "[I")
    public static int[] field3367;

    @OriginalMember(owner = "client!rh", name = "k", descriptor = "(I)V")
    public static void method1250(int arg0) {
        if (arg0 == 1758258692) {
            field3367 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method1251(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field3370;
        if (class97.method636(arg1, -126)) {
            client.method263(class108.field1741[arg1], -1, arg7, arg6, arg0, arg2, arg5, arg3);
            int var8 = -51 % ((arg4 - -7) / 62);
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(II)[[I")
    public final int[][] method1(int arg0, int arg1) {
        if (arg1 <= 11) {
            field3365 = -68;
        }
        ++field3364;
        int[][] var3 = super.field1882.method1242(arg0, 63);
        if (super.field1882.field3344 && this.method209(16711680)) {
            int[] var4 = var3[1];
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field384 * super.field384;
            for (int var8 = 0; ~var8 > ~class130.field2297; ++var8) {
                int var9 = super.field390[var7 - -(var8 % super.field400)];
                var6[var8] = class86.method571(4080, var9 << 4);
                var4[var8] = class86.method571(var9, 65280) >> 4;
                var5[var8] = class86.method571(16711680, var9) >> 12;
            }
        }
        return var3;
    }
}
