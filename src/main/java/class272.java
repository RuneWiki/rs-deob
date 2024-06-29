import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public class class272 extends class406 {

    @OriginalMember(owner = "client!wi", name = "A", descriptor = "I")
    public static int field3855 = 1;

    @OriginalMember(owner = "client!wi", name = "B", descriptor = "Lfk;")
    public static class393 field3856 = new class393();

    @OriginalMember(owner = "client!wi", name = "p", descriptor = "I")
    public int field3844;

    @OriginalMember(owner = "client!wi", name = "q", descriptor = "I")
    public static int field3845;

    @OriginalMember(owner = "client!wi", name = "r", descriptor = "I")
    public static int field3846;

    @OriginalMember(owner = "client!wi", name = "s", descriptor = "I")
    public int field3847;

    @OriginalMember(owner = "client!wi", name = "u", descriptor = "I")
    public int field3849;

    @OriginalMember(owner = "client!wi", name = "v", descriptor = "I")
    public int field3850;

    @OriginalMember(owner = "client!wi", name = "D", descriptor = "I")
    public int field3858;

    @OriginalMember(owner = "client!wi", name = "w", descriptor = "Lon;")
    public class184 field3851;

    @OriginalMember(owner = "client!wi", name = "y", descriptor = "Lon;")
    public class184 field3853;

    @OriginalMember(owner = "client!wi", name = "C", descriptor = "Ljava/awt/Frame;")
    public static Frame field3857;

    @OriginalMember(owner = "client!wi", name = "z", descriptor = "Ljava/lang/String;")
    public String field3854;

    @OriginalMember(owner = "client!wi", name = "x", descriptor = "Z")
    public boolean field3852;

    @OriginalMember(owner = "client!wi", name = "E", descriptor = "Z")
    public static boolean field3859;

    @OriginalMember(owner = "client!wi", name = "t", descriptor = "[Ljava/lang/Object;")
    public Object[] field3848;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
    public static final int method1795(int arg0, int arg1, int arg2) {
        field3846++;
        if (arg1 != -28849) {
            method1795(77, 76, 120);
        }
        return arg2 == 1 || arg2 == 3 ? class236.field3326[arg0 & 0x3] : class164.field2317[arg0 & 0x3];
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V")
    public static void method1796(int arg0) {
        field3857 = null;
        if (arg0 >= 42) {
            field3856 = null;
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIILjava/lang/Class;)V")
    public static final void method1797(int arg0, int arg1, int arg2, Class arg3) {
        class193 var4 = class250.field3570[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        for (class250 var5 = var4.field2779; var5 != null; var5 = var5.field3568) {
            class233 var6 = var5.field3571;
            if (arg3.isAssignableFrom(var6.getClass()) && var6.field3268 == arg1 && var6.field3267 == arg2) {
                class257.method1727(var6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IIIIIIIIIBIII)V")
    public static final void method1798(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, byte arg9, int arg10, int arg11, int arg12) {
        field3845++;
        class241 var13 = new class241();
        var13.field3434 = arg4;
        var13.field3424 = arg0;
        var13.field3426 = arg10;
        var13.field3433 = arg3;
        var13.field3436 = arg11;
        var13.field3421 = arg12;
        var13.field3428 = arg8;
        if (arg9 >= -3) {
            field3857 = null;
        }
        var13.field3437 = arg5;
        var13.field3420 = arg2;
        var13.field3425 = arg7;
        var13.field3430 = arg6;
        var13.field3432 = arg1;
        class87.field991.method509((byte) 114, var13);
    }
}
