import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!QLYZESGB")
public class class44 extends class23 {

    @OriginalMember(owner = "client!QLYZESGB", name = "i", descriptor = "Z")
    private boolean field1238 = true;

    @OriginalMember(owner = "client!QLYZESGB", name = "l", descriptor = "I")
    public int field1241 = 1000;

    @OriginalMember(owner = "client!QLYZESGB", name = "j", descriptor = "B")
    private static byte field1239 = 3;

    @OriginalMember(owner = "client!QLYZESGB", name = "m", descriptor = "Z")
    public static boolean field1242;

    @OriginalMember(owner = "client!QLYZESGB", name = "k", descriptor = "[LAMFCSYQM;")
    public class3[] field1240;

    @OriginalMember(owner = "client!QLYZESGB", name = "a", descriptor = "(IIIIIIIII)V")
    public void method446(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class47 var10 = this.method344(field1239);
        if (var10 != null) {
            this.field1241 = var10.field1241;
            var10.method446(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!QLYZESGB", name = "a", descriptor = "(B)LRMLAXPMV;")
    public class47 method344(byte arg0) {
        if (arg0 != 3) {
            this.field1238 = !this.field1238;
        }
        return null;
    }
}
