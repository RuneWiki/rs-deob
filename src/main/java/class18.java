import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("FRPXDCME")
public class class18 extends class17 {

    @OriginalMember(owner = "FRPXDCME", name = "k", descriptor = "I")
    public int field848 = 1000;

    @OriginalMember(owner = "FRPXDCME", name = "l", descriptor = "Z")
    public static boolean field849;

    @OriginalMember(owner = "FRPXDCME", name = "j", descriptor = "[LVSCWMKBW;")
    public class68[] field847;

    @OriginalMember(owner = "FRPXDCME", name = "a", descriptor = "(IIIIIIIII)V")
    public void method293(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class21 var10 = this.method294(519);
        if (var10 != null) {
            this.field848 = var10.field848;
            var10.method293(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "FRPXDCME", name = "a", descriptor = "(I)LGFYXEFQY;")
    public class21 method294(int arg0) {
        int var2 = 46 / arg0;
        return null;
    }
}
