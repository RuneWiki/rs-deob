import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bb")
public class class14 {

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "I")
    public static int field263 = 0;

    @OriginalMember(owner = "client!bb", name = "c", descriptor = "[Ldj;")
    public static class44[] field264 = new class44[8];

    @OriginalMember(owner = "client!bb", name = "f", descriptor = "I")
    public static int field267 = 0;

    @OriginalMember(owner = "client!bb", name = "e", descriptor = "Ldj;")
    public static class44 field266 = class89.method650(255, "und loggen sich dann erneut ein)3");

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "I")
    public static int field262;

    @OriginalMember(owner = "client!bb", name = "d", descriptor = "I")
    public static int field265;

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(I)V")
    public static final void method122(int arg0) {
        class210.field3757.method1015(0, arg0);
        class62.field1166.method1015(382, 0);
        class71.field1351.method863(382 - class71.field1351.field2271 / 2, 18);
        field262++;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIIIIIII)Z")
    public static final boolean method123(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 < arg2 && arg1 < arg3 && arg1 < arg4) {
            return false;
        } else if (arg1 > arg2 && arg1 > arg3 && arg1 > arg4) {
            return false;
        } else if (arg0 < arg5 && arg0 < arg6 && arg0 < arg7) {
            return false;
        } else if (arg0 > arg5 && arg0 > arg6 && arg0 > arg7) {
            return false;
        } else {
            int var8 = (arg1 - arg2) * (arg6 - arg5) - (arg0 - arg5) * (arg3 - arg2);
            int var9 = (arg1 - arg4) * (arg5 - arg7) - (arg0 - arg7) * (arg2 - arg4);
            int var10 = (arg1 - arg3) * (arg7 - arg6) - (arg0 - arg6) * (arg4 - arg3);
            return var8 * var10 > 0 && var9 * var10 > 0;
        }
    }

    @OriginalMember(owner = "client!bb", name = "b", descriptor = "(I)V")
    public static void method124(int arg0) {
        field266 = null;
        if (arg0 > -82) {
            method123(-15, -85, 118, -37, 6, 120, 125, 0);
        }
        field264 = null;
    }

    @OriginalMember(owner = "client!bb", name = "a", descriptor = "(IIII)V")
    public static final void method125(int arg0, int arg1, int arg2, int arg3) {
        class68 var4 = class32.field567[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class98 var5 = var4.field1318;
        if (var5 != null) {
            var5.field1809 = var5.field1809 * arg3 / 16;
            var5.field1805 = var5.field1805 * arg3 / 16;
        }
    }
}
