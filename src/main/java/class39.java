import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("NSRXNXHB")
public class class39 extends class30 {

    @OriginalMember(owner = "NSRXNXHB", name = "i", descriptor = "I")
    private int field1114 = -39282;

    @OriginalMember(owner = "NSRXNXHB", name = "k", descriptor = "I")
    public int field1116 = 1000;

    @OriginalMember(owner = "NSRXNXHB", name = "l", descriptor = "Z")
    public static boolean field1117;

    @OriginalMember(owner = "NSRXNXHB", name = "j", descriptor = "[LNONLGXRN;")
    public class38[] field1115;

    @OriginalMember(owner = "NSRXNXHB", name = "a", descriptor = "(IIIIIIIII)V")
    public void method271(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class19 var10 = this.method2(-39282);
        if (var10 != null) {
            this.field1116 = var10.field1116;
            var10.method271(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "NSRXNXHB", name = "a", descriptor = "(I)LFUTAQMCE;")
    public class19 method2(int arg0) {
        if (this.field1114 != arg0) {
            for (int var2 = 1; var2 > 0; var2++) {
            }
        }
        return null;
    }
}
