import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cga")
public class class479 {

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "I")
    public static int field6829;

    @OriginalMember(owner = "client!cga", name = "b", descriptor = "I")
    public static int field6830;

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(IZ)Z", line = 3)
    public static final boolean method2877(int arg0, boolean arg1) {
        if (arg1) {
            return true;
        } else {
            field6829++;
            return arg0 >= 4 && arg0 <= 8;
        }
    }

    @OriginalMember(owner = "client!cga", name = "a", descriptor = "(ZLak;IIB)V", line = 14)
    public static final void method2878(boolean arg0, class349 arg1, int arg2, int arg3, byte arg4) {
        field6830++;
        int var5 = arg1.field991[0];
        int var6 = arg1.field995[0];
        if (var5 < 0 || class174.field2540 <= var5 || var6 < 0 || var6 >= class716.field9999 || arg3 < 0 || class174.field2540 <= arg3 || arg2 < 0 || arg2 >= class716.field9999) {
            return;
        }
        int var7 = class60.method666(0, -4, 0, var6, class595.field8703, true, arg1.method482(arg0), arg3, 0, arg2, class630.field9041[arg1.field649], true, class63.field1148, 0, var5);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg1.method2202(class63.field1148[var8], arg4, 7429, class595.field8703[var8]);
            }
        }
    }
}
