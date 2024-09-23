import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("ZHYAQRMA")
public class class71 extends class33 {

    @OriginalMember(owner = "ZHYAQRMA", name = "j", descriptor = "I")
    public int field1710 = 1000;

    @OriginalMember(owner = "ZHYAQRMA", name = "k", descriptor = "Z")
    public static boolean field1711;

    @OriginalMember(owner = "ZHYAQRMA", name = "i", descriptor = "[LCSJSQCOH;")
    public class5[] field1709;

    @OriginalMember(owner = "ZHYAQRMA", name = "a", descriptor = "(IIIIIIIII)V")
    public void method412(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class35 var10 = this.method171(false);
        if (var10 != null) {
            this.field1710 = var10.field1710;
            var10.method412(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "ZHYAQRMA", name = "a", descriptor = "(Z)LOQIGXOFQ;")
    public class35 method171(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
