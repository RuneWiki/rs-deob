import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!JNFESWRD")
public class class21 extends class2 {

    @OriginalMember(owner = "client!JNFESWRD", name = "i", descriptor = "I")
    public int field884 = 1000;

    @OriginalMember(owner = "client!JNFESWRD", name = "j", descriptor = "Z")
    public static boolean field885;

    @OriginalMember(owner = "client!JNFESWRD", name = "h", descriptor = "[LIFUVAINH;")
    public class15[] field883;

    @OriginalMember(owner = "client!JNFESWRD", name = "a", descriptor = "(IIIIIIIII)V")
    public void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class19 var10 = this.method2(true);
        if (var10 != null) {
            this.field884 = var10.field884;
            var10.method295(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!JNFESWRD", name = "a", descriptor = "(Z)LIYSWJGDE;")
    public class19 method2(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
