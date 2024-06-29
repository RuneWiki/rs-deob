import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dr")
public class class395 {

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "I")
    public static int field5350;

    @OriginalMember(owner = "client!dr", name = "c", descriptor = "I")
    public static int field5352;

    @OriginalMember(owner = "client!dr", name = "b", descriptor = "Lcn;")
    public class21 field5351;

    @OriginalMember(owner = "client!dr", name = "a", descriptor = "(IIZI)I", line = 5)
    public static final int method2237(int arg0, int arg1, boolean arg2, int arg3) {
        field5350++;
        class628 var4 = class555.method3150(arg3, 0, arg2);
        if (var4 == null) {
            return 0;
        } else if (arg0 == -1) {
            return 0;
        } else {
            int var5 = 0;
            for (int var6 = arg1; var6 < var4.field8850.length; var6++) {
                if (var4.field8858[var6] == arg0) {
                    var5 += var4.field8850[var6];
                }
            }
            return var5;
        }
    }
}
