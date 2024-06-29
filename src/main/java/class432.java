import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mea")
public class class432 {

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "I")
    public static int field6087;

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(Lr;III[Z)Z")
    public static final boolean method2467(class184 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class25.field188 != class143.field1850) {
            int var6 = class86.field1182[arg1].method1683(arg2, arg3, true);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class281 var8 = class86.field1182[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1683(arg2, arg3, true);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1534(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1535(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!mea", name = "a", descriptor = "(IC)Z")
    public static final boolean method2468(int arg0, char arg1) {
        field6087++;
        if (arg1 >= ' ' && arg1 <= '~') {
            return true;
        } else if (arg1 >= ' ' && arg1 <= 'ÿ') {
            return true;
        } else if (arg0 == 376) {
            return arg1 == '€' || arg1 == 'Œ' || arg1 == '—' || arg1 == 'œ' || arg1 == 'Ÿ';
        } else {
            return false;
        }
    }
}
