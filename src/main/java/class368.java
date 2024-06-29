import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bfa")
public class class368 {

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!bfa", name = "b", descriptor = "I")
    public static int field5208;

    @OriginalMember(owner = "client!bfa", name = "c", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(I[BI)[B", line = 5)
    public static final byte[] method2343(int arg0, byte[] arg1, int arg2) {
        field5209++;
        byte[] var3 = new byte[arg2];
        if (arg0 != 27773) {
            method2344(-99, -66, 83, (byte) -69, -110);
        }
        class255.method1690(arg1, 0, var3, 0, arg2);
        return var3;
    }

    @OriginalMember(owner = "client!bfa", name = "a", descriptor = "(IIIBI)V", line = 19)
    public static final void method2344(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -81) {
            method2343(122, null, -36);
        }
        field5207++;
        class592 var5 = class682.method3825(-652872096, 8, arg1);
        var5.method3351(arg3 + 81);
        var5.field8341 = arg2;
        var5.field8337 = arg4;
        var5.field8343 = arg0;
    }
}
