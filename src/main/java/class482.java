import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hv")
public class class482 extends class616 {

    @OriginalMember(owner = "client!hv", name = "g", descriptor = "Lco;")
    public class103 field6738;

    @OriginalMember(owner = "client!hv", name = "e", descriptor = "I")
    public static int field6736;

    @OriginalMember(owner = "client!hv", name = "f", descriptor = "I")
    public static int field6737;

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Ljn;Ljn;Ljn;Ljn;I)V")
    public static final void method2814(class668 arg0, class668 arg1, class668 arg2, class668 arg3, int arg4) {
        field6736++;
        class256.field3472 = arg2;
        class279.field3798 = arg0;
        class568.field8304 = arg1;
        class516.field7555 = new class17[class568.field8304.method3779(5)][];
        class299.field4032 = new boolean[class568.field8304.method3779(5)];
        int var5 = -8 / ((arg4 - 47) / 52);
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lifa;II[B)V")
    public class482(class393 arg0, int arg1, int arg2, byte[] arg3) {
        this.field6738 = arg0.method2363(arg1, false, arg3, arg2, class384.field5117, (byte) 66);
        this.field6738.method757(false, false, -88);
    }

    @OriginalMember(owner = "client!hv", name = "a", descriptor = "(Z)I")
    public static final int method2815(boolean arg0) {
        field6737++;
        if (arg0) {
            method2815(false);
        }
        return class288.field3879;
    }

    @OriginalMember(owner = "client!hv", name = "<init>", descriptor = "(Lifa;II[I)V")
    public class482(class393 arg0, int arg1, int arg2, int[] arg3) {
        this.field6738 = arg0.method2307(arg2, false, arg3, arg1, 0);
        this.field6738.method757(false, false, -67);
    }
}
