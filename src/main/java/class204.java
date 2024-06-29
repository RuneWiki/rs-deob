import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bea")
public class class204 {

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "Z")
    public static boolean field2493 = false;

    @OriginalMember(owner = "client!bea", name = "b", descriptor = "I")
    public static int field2494 = 1;

    @OriginalMember(owner = "client!bea", name = "a", descriptor = "(Loa;Lfl;III)V", line = 11)
    public static final void method1247(class635 arg0, class673 arg1, int arg2, int arg3, int arg4) {
        if (arg3 < class181.field2222) {
            class287 var5 = class97.field1074[arg2][arg3 + 1][arg4];
            if (var5 != null && var5.field3686 != null && var5.field3686.method449((byte) -126)) {
                arg1.method453(true, 0, false, 0, class463.field6445, var5.field3686, arg0);
            }
        }
        if (arg4 < class181.field2222) {
            class287 var6 = class97.field1074[arg2][arg3][arg4 + 1];
            if (var6 != null && var6.field3686 != null && var6.field3686.method449((byte) -126)) {
                arg1.method453(true, 0, false, class463.field6445, 0, var6.field3686, arg0);
            }
        }
        if (arg3 < class181.field2222 && arg4 < class272.field3451) {
            class287 var7 = class97.field1074[arg2][arg3 + 1][arg4 + 1];
            if (var7 != null && var7.field3686 != null && var7.field3686.method449((byte) -126)) {
                arg1.method453(true, 0, false, class463.field6445, class463.field6445, var7.field3686, arg0);
            }
        }
        if (arg3 < class181.field2222 && arg4 > 0) {
            class287 var8 = class97.field1074[arg2][arg3 + 1][arg4 - 1];
            if (var8 != null && var8.field3686 != null && var8.field3686.method449((byte) -126)) {
                arg1.method453(true, 0, false, -class463.field6445, class463.field6445, var8.field3686, arg0);
            }
        }
    }
}
