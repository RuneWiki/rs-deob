import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!GHXFOOXU")
public class class20 extends class65 {

    @OriginalMember(owner = "client!GHXFOOXU", name = "h", descriptor = "Z")
    private boolean field862 = false;

    @OriginalMember(owner = "client!GHXFOOXU", name = "i", descriptor = "B")
    private byte field863 = 2;

    @OriginalMember(owner = "client!GHXFOOXU", name = "k", descriptor = "I")
    public int field865 = 1000;

    @OriginalMember(owner = "client!GHXFOOXU", name = "l", descriptor = "Z")
    public static boolean field866;

    @OriginalMember(owner = "client!GHXFOOXU", name = "j", descriptor = "[LCEAXDMTD;")
    public class5[] field864;

    @OriginalMember(owner = "client!GHXFOOXU", name = "a", descriptor = "(IIIIIIIII)V")
    public void method240(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class16 var10 = this.method190((byte) 2);
        if (var10 != null) {
            this.field865 = var10.field865;
            var10.method240(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!GHXFOOXU", name = "a", descriptor = "(B)LFLXAIVEA;")
    public class16 method190(byte arg0) {
        if (this.field863 != arg0) {
            this.field862 = !this.field862;
        }
        return null;
    }
}
