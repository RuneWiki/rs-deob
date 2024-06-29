import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hw")
public class class116 extends class3 {

    @OriginalMember(owner = "client!hw", name = "I", descriptor = "I")
    public static int field1546;

    @OriginalMember(owner = "client!hw", name = "U", descriptor = "I")
    public static int field1547;

    @OriginalMember(owner = "client!hw", name = "V", descriptor = "I")
    public static int field1548;

    @OriginalMember(owner = "client!hw", name = "W", descriptor = "I")
    public static int field1549;

    @OriginalMember(owner = "client!hw", name = "a", descriptor = "(Ljava/lang/Object;ZZ)[B")
    public static final byte[] method852(Object arg0, boolean arg1, boolean arg2) {
        ++field1546;
        if (arg0 == null) {
            return null;
        } else if (arg0 instanceof byte[]) {
            byte[] var3 = (byte[]) arg0;
            return !arg1 ? var3 : class606.method3355(var3, 0);
        } else if (arg0 instanceof class317) {
            class317 var4 = (class317) arg0;
            return var4.method1938(25);
        } else {
            if (arg2) {
                field1549 = -55;
            }
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!hw", name = "c", descriptor = "(II)[[I")
    public final int[][] method15(int arg0, int arg1) {
        ++field1548;
        int[][] var3 = super.field9740.method3483(arg1, true);
        if (super.field9740.field8738 && this.method17(0)) {
            int[] var4 = var3[0];
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int var7 = arg1 % super.field22 * super.field22;
            for (int var8 = 0; class465.field6544 > var8; ++var8) {
                int var9 = super.field19[var8 % super.field12 + var7];
                var6[var8] = class249.method1537(var9 << 4, 4080);
                var5[var8] = class249.method1537(4080, var9 >> 4);
                var4[var8] = class249.method1537(4080, var9 >> 12);
            }
        }
        if (arg0 != -22151) {
            field1549 = 122;
        }
        return var3;
    }
}
