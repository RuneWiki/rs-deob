import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("MQTIFFLX")
public class class34 extends class13 {

    @OriginalMember(owner = "MQTIFFLX", name = "j", descriptor = "I")
    public int field1085 = 1000;

    @OriginalMember(owner = "MQTIFFLX", name = "k", descriptor = "Z")
    public static boolean field1086;

    @OriginalMember(owner = "MQTIFFLX", name = "i", descriptor = "[LVCPFYTXG;")
    public class60[] field1084;

    @OriginalMember(owner = "MQTIFFLX", name = "a", descriptor = "(IIIIIIIII)V")
    public void method332(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        class66 var10 = this.method225(true);
        if (var10 != null) {
            this.field1085 = var10.field1085;
            var10.method332(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        }
    }

    @OriginalMember(owner = "MQTIFFLX", name = "a", descriptor = "(Z)LWEVRTBOZ;")
    public class66 method225(boolean arg0) {
        if (!arg0) {
            throw new NullPointerException();
        }
        return null;
    }
}
