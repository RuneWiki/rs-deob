import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!UCNHLGIK")
public class class58 extends class68 {

    @OriginalMember(owner = "client!UCNHLGIK", name = "i", descriptor = "I")
    private int field1458 = 47998;

    @OriginalMember(owner = "client!UCNHLGIK", name = "k", descriptor = "I")
    public int field1460 = 1000;

    @OriginalMember(owner = "client!UCNHLGIK", name = "l", descriptor = "Z")
    public static boolean field1461;

    @OriginalMember(owner = "client!UCNHLGIK", name = "j", descriptor = "[LGHQPSUCN;")
    public class22[] field1459;

    @OriginalMember(owner = "client!UCNHLGIK", name = "a", descriptor = "(IIIIIIIII)V")
    public void method435(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class41 var10 = this.method1(822);
        if (var10 != null) {
            this.field1460 = var10.field1460;
            var10.method435(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!UCNHLGIK", name = "a", descriptor = "(I)LOJGAHFXC;")
    public class41 method1(int arg0) {
        if (arg0 <= 0) {
            this.field1458 = -217;
        }
        return null;
    }
}
