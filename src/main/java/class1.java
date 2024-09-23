import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("AVUWZCYT")
public class class1 extends class68 {

    @OriginalMember(owner = "AVUWZCYT", name = "i", descriptor = "I")
    public int field2 = 1000;

    @OriginalMember(owner = "AVUWZCYT", name = "j", descriptor = "Z")
    public static boolean field3;

    @OriginalMember(owner = "AVUWZCYT", name = "h", descriptor = "[LOPJQDGMI;")
    public class35[] field1;

    @OriginalMember(owner = "AVUWZCYT", name = "a", descriptor = "(IIIIIIIII)V")
    public void method1(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class70 var10 = this.method2(true);
        if (var10 != null) {
            this.field2 = var10.field2;
            var10.method1(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "AVUWZCYT", name = "a", descriptor = "(Z)LYYHPBDED;")
    public class70 method2(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
