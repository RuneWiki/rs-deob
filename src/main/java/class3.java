import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!BSABUCFC")
public class class3 extends class36 {

    @OriginalMember(owner = "client!BSABUCFC", name = "i", descriptor = "I")
    public int field55 = 1000;

    @OriginalMember(owner = "client!BSABUCFC", name = "j", descriptor = "Z")
    public static boolean field56;

    @OriginalMember(owner = "client!BSABUCFC", name = "h", descriptor = "[LQSEAWQCE;")
    public class45[] field54;

    @OriginalMember(owner = "client!BSABUCFC", name = "a", descriptor = "(IIIIIIIII)V")
    public void method9(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class56 var10 = this.method10((byte) 93);
        if (var10 != null) {
            this.field55 = var10.field55;
            var10.method9(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!BSABUCFC", name = "a", descriptor = "(B)LUNLYQRUD;")
    public class56 method10(byte arg0) {
        if (arg0 != 93) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
