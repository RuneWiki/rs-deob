import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class248 extends class12 {

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "[I")
    public int[] field4552 = new int[] { -1 };

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "[I")
    public int[] field4553 = new int[1];

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public static int field4551;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "I")
    public static int field4554;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Lah;IIZLch;II)V")
    public static final void method1621(class9 arg0, int arg1, int arg2, boolean arg3, class31 arg4, int arg5, int arg6) {
        field4551++;
        if (arg4 == null) {
            return;
        }
        int var7 = client.field776 + class13.field427 & 0x7FF;
        int var8 = Math.max(arg0.field256 / 2, arg0.field207 / 2) + 10;
        int var9 = arg2 * arg2 + arg5 * arg5;
        if (var9 > var8 * var8) {
            return;
        }
        int var10 = class89.field1650[var7];
        int var11 = class89.field1646[var7];
        int var12 = var11 * 256 / (class174.field3151 + 256);
        int var13 = var10 * 256 / (class174.field3151 + 256);
        if (!arg3) {
            int var14 = arg2 * var12 - arg5 * var13 >> 16;
            int var15 = arg2 * var13 + arg5 * var12 >> 16;
            ((class144) arg4).method975(arg0.field256 / 2 + var15 + arg6 - arg4.field736 / 2, arg0.field207 / 2 + -(arg4.field727 / 2) + -var14 + arg1, arg0.field292, arg0.field280);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Z)V")
    public static final void method1622(boolean arg0) {
        field4554++;
        class39.field897.method1545((byte) 116);
        class209.field3751 = 1;
        if (!arg0) {
            method1621(null, 68, 95, false, null, 83, -29);
        }
        class213.field3879 = null;
    }
}
