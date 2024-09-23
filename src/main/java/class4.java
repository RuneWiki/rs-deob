import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("BXTJETAB")
public class class4 extends class10 {

    @OriginalMember(owner = "BXTJETAB", name = "j", descriptor = "I")
    public int field63 = 1000;

    @OriginalMember(owner = "BXTJETAB", name = "k", descriptor = "Z")
    public static boolean field64;

    @OriginalMember(owner = "BXTJETAB", name = "i", descriptor = "[LCKROTWSG;")
    public class7[] field62;

    @OriginalMember(owner = "BXTJETAB", name = "a", descriptor = "(IIIIIIIII)V")
    public void method24(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class32 var10 = this.method25(47492);
        if (var10 != null) {
            this.field63 = var10.field63;
            var10.method24(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "BXTJETAB", name = "a", descriptor = "(I)LIGXVZOHI;")
    public class32 method25(int arg0) {
        if (arg0 != 47492) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
