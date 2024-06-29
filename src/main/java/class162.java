import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pd")
public class class162 {

    @OriginalMember(owner = "client!pd", name = "b", descriptor = "F")
    public static float field2533;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "[Leh;")
    public static class233[] field2532;

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(I)V", line = 3)
    public static void method1035(int arg0) {
        field2532 = null;
        if (arg0 != 39) {
            method1035(-19);
        }
    }

    @OriginalMember(owner = "client!pd", name = "a", descriptor = "(III)V", line = 22)
    public static final void method1036(int arg0, int arg1, int arg2) {
        boolean var3 = class321.field4830[0][arg1][arg2] != null && class321.field4830[0][arg1][arg2].field4049 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class321.field4830[var4][arg1][arg2] == null) {
                class268 var5 = class321.field4830[var4][arg1][arg2] = new class268(var4, arg1, arg2);
                if (var3) {
                    var5.field4062++;
                }
            }
        }
    }
}
