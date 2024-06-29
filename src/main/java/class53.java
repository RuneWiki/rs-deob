import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!TDBSBQNI")
public class class53 extends class29 {

    @OriginalMember(owner = "client!TDBSBQNI", name = "i", descriptor = "I")
    public int field1436 = 1000;

    @OriginalMember(owner = "client!TDBSBQNI", name = "j", descriptor = "Z")
    public static boolean field1437;

    @OriginalMember(owner = "client!TDBSBQNI", name = "h", descriptor = "[LYIEJRUIB;")
    public class65[] field1435;

    @OriginalMember(owner = "client!TDBSBQNI", name = "a", descriptor = "(IIIIIIIII)V")
    public void method218(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class8 var10 = this.method2((byte) -99);
        if (var10 != null) {
            this.field1436 = var10.field1436;
            var10.method218(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!TDBSBQNI", name = "a", descriptor = "(B)LCYPZUKMB;")
    public class8 method2(byte arg0) {
        if (arg0 != -99) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
