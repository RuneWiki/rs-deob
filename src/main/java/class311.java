import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!on")
public class class311 extends class217 {

    @OriginalMember(owner = "client!on", name = "e", descriptor = "Lmn;")
    public class340 field4283;

    @OriginalMember(owner = "client!on", name = "d", descriptor = "[I")
    public static int[] field4282 = new int[32];

    @OriginalMember(owner = "client!on", name = "f", descriptor = "I")
    public static int field4284 = 0;

    @OriginalMember(owner = "client!on", name = "<init>", descriptor = "(Lno;II[B)V")
    public class311(class658 arg0, int arg1, int arg2, byte[] arg3) {
        this.field4283 = class595.method3281((byte) 82, 6406, 6406, arg2, false, arg1, arg0, arg3);
        this.field4283.method1664(false, false, (byte) 18);
    }

    @OriginalMember(owner = "client!on", name = "b", descriptor = "(I)V")
    public static void method1859(int arg0) {
        int var1 = -42 % ((46 - arg0) / 37);
        field4282 = null;
    }
}
