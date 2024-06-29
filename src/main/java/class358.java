import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gl")
public class class358 {

    @OriginalMember(owner = "client!gl", name = "b", descriptor = "B")
    public static byte field5088;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "Lts;")
    public static class315 field5087;

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(III)V", line = 4)
    public static final void method2294(int arg0, int arg1, int arg2) {
        class193 var3 = class250.field3570[arg0][arg1][arg2];
        if (var3 != null && var3.field2790 != null) {
            var3.field2790 = null;
        }
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(B)V", line = 17)
    public static void method2295(byte arg0) {
        if (arg0 > -38) {
            field5088 = -38;
        }
        field5087 = null;
    }

    @OriginalMember(owner = "client!gl", name = "a", descriptor = "(IIIIIII)V", line = 29)
    public static final void method2296(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class265 var7 = new class265();
        var7.field3768 = arg1 >> 7;
        var7.field3780 = arg2 >> 7;
        var7.field3765 = arg3 >> 7;
        var7.field3760 = arg4 >> 7;
        var7.field3759 = arg0;
        var7.field3772 = arg1;
        var7.field3771 = arg2;
        var7.field3767 = arg3;
        var7.field3764 = arg4;
        var7.field3766 = arg5;
        var7.field3763 = arg6;
        class374.field5252[class422.field6022++] = var7;
    }
}
