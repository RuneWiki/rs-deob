import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("SMAWMDZY")
public class class53 extends class70 {

    @OriginalMember(owner = "SMAWMDZY", name = "j", descriptor = "I")
    public int field1340 = 1000;

    @OriginalMember(owner = "SMAWMDZY", name = "k", descriptor = "Z")
    public static boolean field1341;

    @OriginalMember(owner = "SMAWMDZY", name = "i", descriptor = "[LDATOXFLB;")
    public class10[] field1339;

    @OriginalMember(owner = "SMAWMDZY", name = "a", descriptor = "(IIIIIIIII)V")
    public void method259(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class27 var10 = this.method2(true);
        if (var10 != null) {
            this.field1340 = var10.field1340;
            var10.method259(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "SMAWMDZY", name = "a", descriptor = "(Z)LITSMSHJO;")
    public class27 method2(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
