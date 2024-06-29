import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qe")
public class class80 {

    @OriginalMember(owner = "client!qe", name = "c", descriptor = "Liba;")
    public static class211 field1293 = new class211(50, -1);

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!qe", name = "b", descriptor = "[Lpaa;")
    public static class580[] field1292;

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(B)V")
    public static void method463(byte arg0) {
        field1292 = null;
        if (arg0 != 106) {
            method463((byte) 91);
        }
        field1293 = null;
    }

    @OriginalMember(owner = "client!qe", name = "a", descriptor = "(IIZIILjava/lang/String;II)V")
    public static final void method464(int arg0, int arg1, boolean arg2, int arg3, int arg4, String arg5, int arg6, int arg7) {
        if (!arg2) {
            method464(-28, -66, true, -103, -53, null, -54, -20);
        }
        field1291++;
        class699 var8 = new class699();
        var8.field9833 = class45.field685 + arg4;
        var8.field9831 = arg1;
        var8.field9838 = arg6;
        var8.field9832 = arg3;
        var8.field9830 = arg7;
        var8.field9835 = arg0;
        var8.field9839 = arg5;
        class597.field8638.method2368(0, var8);
    }
}
