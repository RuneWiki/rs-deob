import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fm")
public class class201 {

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "I")
    public static int field2712;

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(Lha;III[Z)Z", line = 4)
    public static final boolean method1287(class117 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class446.field5914 != class246.field3214) {
            int var6 = class454.field5981[arg1].method1609(arg2, arg3, 124);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class270 var8 = class454.field5981[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1609(arg2, arg3, 55);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1355(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1352(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fm", name = "a", descriptor = "(IIIILto;)V", line = 42)
    public static final void method1288(int arg0, int arg1, int arg2, int arg3, class229 arg4) {
        if (arg1 > -125) {
            method1288(32, -90, -113, -52, null);
        }
        arg4.field2971.method958(0, arg2);
        field2712++;
        arg4.field2971.method946((byte) -77, arg3);
        arg4.field2971.method946((byte) -77, arg0);
    }
}
