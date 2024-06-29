import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!io")
public abstract class class406 {

    @OriginalMember(owner = "client!io", name = "c", descriptor = "I")
    public static int field5861;

    @OriginalMember(owner = "client!io", name = "b", descriptor = "Ldaa;")
    public static class11 field5860;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "[I")
    public static int[] field5859;

    @OriginalMember(owner = "client!io", name = "d", descriptor = "[I")
    public static int[] field5862;

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(III)V")
    public static final void method2471(int arg0, int arg1, int arg2) {
        boolean var3 = class257.field3792[0][arg1][arg2] != null && class257.field3792[0][arg1][arg2].field5492 != null;
        for (int var4 = arg0; var4 >= 0; var4--) {
            if (class257.field3792[var4][arg1][arg2] == null) {
                class370 var5 = class257.field3792[var4][arg1][arg2] = new class370(var4);
                if (var3) {
                    var5.field5506++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(ILvaa;)Lvaa;")
    public abstract class437 method830(int arg0, class437 arg1);

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(B)V")
    public static void method2472(byte arg0) {
        field5859 = null;
        field5862 = null;
        field5860 = null;
        if (arg0 != -92) {
            field5859 = null;
        }
    }

    @OriginalMember(owner = "client!io", name = "a", descriptor = "(IIIILus;I)Ldea;")
    public static final class225 method2473(int arg0, int arg1, int arg2, int arg3, class1 arg4, int arg5) {
        field5861++;
        if (arg1 > -85) {
            method2472((byte) 20);
        }
        if (!arg4.field350 && (!class141.method1144(0, arg0) || !class141.method1144(0, arg3))) {
            return arg4.field259 ? new class225(arg4, 34037, arg2, arg5, arg0, arg3, true) : new class225(arg4, arg2, arg5, arg0, arg3, class455.method2740(-1675135295, arg0), class455.method2740(-1675135295, arg3), true);
        } else {
            return new class225(arg4, 3553, arg2, arg5, arg0, arg3, true);
        }
    }
}
