import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class428 extends class425 {

    @OriginalMember(owner = "client!dr", name = "q", descriptor = "I")
    public int field6094;

    @OriginalMember(owner = "client!dr", name = "o", descriptor = "I")
    public int field6092;

    @OriginalMember(owner = "client!dr", name = "r", descriptor = "I")
    public static int field6095 = 1;

    @OriginalMember(owner = "client!dr", name = "s", descriptor = "I")
    public static int field6096;

    @OriginalMember(owner = "client!dr", name = "p", descriptor = "[Lek;")
    public static class296[] field6093;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(Lo;III[Z)V")
    public static final void method2669(class21 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        if (class439.field6280 == class241.field3567) {
            return;
        }
        int var5 = class126.field1734[arg1].method360(arg2, arg3);
        for (int var6 = 0; var6 <= arg1; var6++) {
            if (arg4 == null || arg4[var6]) {
                class92 var7 = class126.field1734[var6];
                if (var7 != null) {
                    var7.method352(arg0, arg2, var5 - var7.method360(arg2, arg3), arg3, 0, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!dr", name = "<init>", descriptor = "(II)V")
    public class428(int arg0, int arg1) {
        this.field6094 = arg0;
        this.field6092 = arg1;
    }

    @OriginalMember(owner = "client!dr", name = "d", descriptor = "(B)V")
    public static void method2670(byte arg0) {
        if (arg0 <= 71) {
            method2669((class21) null, 112, 24, -115, (boolean[]) null);
        }
        field6093 = null;
    }
}
