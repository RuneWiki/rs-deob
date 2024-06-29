import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class173 extends class486 {

    @OriginalMember(owner = "client!aba", name = "e", descriptor = "Ldh;")
    public class320 field2352;

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lsr;II[B)V", line = 9)
    public class173(class251 arg0, int arg1, int arg2, byte[] arg3) {
        this.field2352 = arg0.method1612(false, class233.field3143, arg3, 120, arg1, arg2);
        this.field2352.method1317(28970, false, false);
    }

    @OriginalMember(owner = "client!aba", name = "<init>", descriptor = "(Lsr;II[I)V", line = 21)
    public class173(class251 arg0, int arg1, int arg2, int[] arg3) {
        this.field2352 = arg0.method1650(arg2, arg3, false, arg1, false);
        this.field2352.method1317(28970, false, false);
    }
}
