import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("YDNCHMHU")
public class class64 extends class30 {

    @OriginalMember(owner = "YDNCHMHU", name = "j", descriptor = "I")
    public int field1528 = 1000;

    @OriginalMember(owner = "YDNCHMHU", name = "k", descriptor = "Z")
    public static boolean field1529;

    @OriginalMember(owner = "YDNCHMHU", name = "i", descriptor = "[LWEADLANG;")
    public class58[] field1527;

    @OriginalMember(owner = "YDNCHMHU", name = "a", descriptor = "(IIIIIIIII)V")
    public void method367(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class39 var10 = this.method2(false);
        if (var10 != null) {
            this.field1528 = var10.field1528;
            var10.method367(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "YDNCHMHU", name = "a", descriptor = "(Z)LOIBEFFXI;")
    public class39 method2(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
