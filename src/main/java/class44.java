import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("PJUTMHMD")
public class class44 extends class31 {

    @OriginalMember(owner = "PJUTMHMD", name = "j", descriptor = "I")
    public int field1124 = 1000;

    @OriginalMember(owner = "PJUTMHMD", name = "k", descriptor = "Z")
    public static boolean field1125;

    @OriginalMember(owner = "PJUTMHMD", name = "i", descriptor = "[LDOBBTZYO;")
    public class12[] field1123;

    @OriginalMember(owner = "PJUTMHMD", name = "a", descriptor = "(IIIIIIIII)V")
    public void method408(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class53 var10 = this.method217(-650);
        if (var10 != null) {
            this.field1124 = var10.field1124;
            var10.method408(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "PJUTMHMD", name = "a", descriptor = "(I)LVHYCWIPJ;")
    public class53 method217(int arg0) {
        if (arg0 >= 0) {
            throw new NullPointerException();
        }
        return null;
    }
}
