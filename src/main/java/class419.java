import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ot")
public class class419 extends class467 {

    @OriginalMember(owner = "client!ot", name = "Z", descriptor = "I")
    public static int field6264 = 0;

    @OriginalMember(owner = "client!ot", name = "U", descriptor = "Lhn;")
    public static class509 field6259 = new class509(18, -2);

    @OriginalMember(owner = "client!ot", name = "V", descriptor = "I")
    public static int field6260;

    @OriginalMember(owner = "client!ot", name = "W", descriptor = "I")
    public static int field6261;

    @OriginalMember(owner = "client!ot", name = "X", descriptor = "I")
    public static int field6262;

    @OriginalMember(owner = "client!ot", name = "Y", descriptor = "I")
    public static int field6263;

    @OriginalMember(owner = "client!ot", name = "L", descriptor = "[S")
    public static short[] field6258;

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(Lul;Lul;Lmf;Lul;I)Z")
    public static final boolean method2621(class406 arg0, class406 arg1, class291 arg2, class406 arg3, int arg4) {
        ++field6262;
        class497.field7149 = arg0;
        class470.field6786 = arg3;
        class404.field5991 = arg1;
        if (arg4 != 1) {
            method2622(-9, 2);
        }
        class448.field6563 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!ot", name = "b", descriptor = "(II)V")
    public static final void method2622(int arg0, int arg1) {
        ++field6261;
        class211 var2 = class452.method2749(1, -105, arg0);
        if (arg1 != -10037) {
            field6258 = null;
        }
        var2.method1460(true);
    }

    @OriginalMember(owner = "client!ot", name = "m", descriptor = "(I)V")
    public static void method2623(int arg0) {
        field6259 = null;
        if (arg0 != -20039) {
            method2622(-55, -58);
        }
        field6258 = null;
    }

    @OriginalMember(owner = "client!ot", name = "a", descriptor = "(II)[[I")
    public final int[][] method673(int arg0, int arg1) {
        ++field6260;
        int[][] var3 = super.field5011.method1410(arg0, 31649);
        if (super.field5011.field3346 && this.method2819(103)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field6752 * super.field6752;
            for (int var8 = 0; ~class402.field5977 < ~var8; ++var8) {
                int var9 = super.field6746[var7 - -(var8 % super.field6743)];
                var6[var8] = class74.method644(var9, 255) << 4;
                var5[var8] = class74.method644(65280, var9) >> 4;
                var4[var8] = class74.method644(4080, var9 >> 12);
            }
        }
        int var10 = -82 / ((-41 - arg1) / 49);
        return var3;
    }
}
