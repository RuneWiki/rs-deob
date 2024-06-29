import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wa")
public class class433 extends class425 {

    @OriginalMember(owner = "client!wa", name = "Y", descriptor = "Lan;")
    public static class20 field6430 = new class20(64);

    @OriginalMember(owner = "client!wa", name = "H", descriptor = "I")
    public static int field6427;

    @OriginalMember(owner = "client!wa", name = "K", descriptor = "I")
    public static int field6428;

    @OriginalMember(owner = "client!wa", name = "Z", descriptor = "I")
    public static int field6431;

    @OriginalMember(owner = "client!wa", name = "ab", descriptor = "I")
    public static int field6432;

    @OriginalMember(owner = "client!wa", name = "X", descriptor = "[I")
    public static int[] field6429;

    @OriginalMember(owner = "client!wa", name = "b", descriptor = "(II)[[I", line = 7)
    public final int[][] method49(int arg0, int arg1) {
        ++field6427;
        if (arg0 != 8) {
            method2589(-23);
        }
        int[][] var3 = super.field833.method835(arg1, (byte) 23);
        if (super.field833.field1888 && this.method2559((byte) 104)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field6334 * super.field6334;
            for (int var8 = 0; ~var8 > ~class259.field3768; ++var8) {
                int var9 = super.field6335[var8 % super.field6337 + var7];
                var6[var8] = class207.method1405(var9, 255) << 4;
                var5[var8] = class207.method1405(65280, var9) >> 4;
                var4[var8] = class207.method1405(16711680, var9) >> 12;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!wa", name = "c", descriptor = "(II)V", line = 53)
    public static final void method2588(int arg0, int arg1) {
        ++field6431;
        class54 var2 = class442.method2651(arg0, arg1, -13208);
        var2.method476((byte) -44);
    }

    @OriginalMember(owner = "client!wa", name = "e", descriptor = "(I)V", line = 72)
    public static void method2589(int arg0) {
        field6429 = null;
        if (arg0 < -8) {
            field6430 = null;
        }
    }
}
