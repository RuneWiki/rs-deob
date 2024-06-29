import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!MODNYPGG")
public class class35 extends class48 {

    @OriginalMember(owner = "client!MODNYPGG", name = "j", descriptor = "Z")
    private boolean field970 = false;

    @OriginalMember(owner = "client!MODNYPGG", name = "l", descriptor = "I")
    public int field972 = 1000;

    @OriginalMember(owner = "client!MODNYPGG", name = "m", descriptor = "Z")
    public static boolean field973;

    @OriginalMember(owner = "client!MODNYPGG", name = "k", descriptor = "[LJSRLGUEA;")
    public class25[] field971;

    @OriginalMember(owner = "client!MODNYPGG", name = "a", descriptor = "(IIIIIIIII)V")
    public void method286(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class37 var10 = this.method206(-12617);
        if (var10 != null) {
            this.field972 = var10.field972;
            var10.method286(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "client!MODNYPGG", name = "a", descriptor = "(I)LNGYJLUVS;")
    public class37 method206(int arg0) {
        if (arg0 != -12617) {
            this.field970 = !this.field970;
        }
        return null;
    }
}
