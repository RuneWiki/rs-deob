import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class268 extends class148 {

    @OriginalMember(owner = "client!cl", name = "L", descriptor = "I")
    public static int field3786;

    @OriginalMember(owner = "client!cl", name = "W", descriptor = "I")
    public static int field3788;

    @OriginalMember(owner = "client!cl", name = "V", descriptor = "Lin;")
    public static class91 field3787;

    @OriginalMember(owner = "client!cl", name = "d", descriptor = "(II)[[I")
    public final int[][] method18(int arg0, int arg1) {
        if (arg1 != -1564599039) {
            method1785(54);
        }
        ++field3786;
        int[][] var3 = super.field4166.method2180(-93, arg0);
        if (super.field4166.field4849 && this.method1168(true)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg0 % super.field2473 * super.field2473;
            for (int var8 = 0; var8 < class525.field7275; ++var8) {
                int var9 = super.field2464[var8 % super.field2469 + var7];
                var6[var8] = class263.method1762(4080, var9 << 4);
                var5[var8] = class263.method1762(65280, var9) >> 4;
                var4[var8] = class263.method1762(4080, var9 >> 12);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "(I)V")
    public static void method1784(int arg0) {
        if (arg0 != -1) {
            field3787 = null;
        }
        field3787 = null;
    }

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "(I)V")
    public static final void method1785(int arg0) {
        if (arg0 > 85) {
            ++field3788;
            class25.method382(-1, 255, -1);
        }
    }
}
