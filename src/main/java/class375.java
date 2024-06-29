import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ns")
public class class375 {

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "Lns;")
    public static class375 field4829 = new class375();

    @OriginalMember(owner = "client!ns", name = "b", descriptor = "I")
    public static int field4830;

    @OriginalMember(owner = "client!ns", name = "c", descriptor = "I")
    public static int field4831;

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(IZBLpp;I)V")
    public static final void method2167(int arg0, boolean arg1, byte arg2, class365 arg3, int arg4) {
        field4831++;
        int var5 = arg3.field508[0];
        int var6 = arg3.field511[0];
        if (var5 < 0 || var5 >= class85.field1090 || var6 < 0 || class656.field8932 <= var6 || arg0 < 0 || arg0 >= class85.field1090 || arg4 < 0 || arg4 >= class656.field8932) {
            return;
        }
        int var7 = class510.method2783(true, var6, class634.field8601[arg3.field8010], -4, 0, 0, var5, arg4, arg0, arg3.method210(arg1), class20.field211, 0, 0, -119, class703.field9846);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < var7 - 1; var8++) {
                arg3.method2124(arg2, class703.field9846[var8], class20.field211[var8], 0);
            }
        }
    }

    @OriginalMember(owner = "client!ns", name = "a", descriptor = "(I)V")
    public static void method2168(int arg0) {
        field4829 = null;
        if (arg0 != -32181) {
            field4830 = 75;
        }
    }
}
