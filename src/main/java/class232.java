import java.awt.datatransfer.Clipboard;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ig")
public class class232 {

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "Lka;")
    public static class473 field3235 = new class473(64);

    @OriginalMember(owner = "client!ig", name = "b", descriptor = "Lvr;")
    public static class187 field3236 = new class187("WTI", 5);

    @OriginalMember(owner = "client!ig", name = "c", descriptor = "Ljava/awt/datatransfer/Clipboard;")
    public static Clipboard field3237;

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(I)V", line = 6)
    public static void method1419(int arg0) {
        field3237 = null;
        field3235 = null;
        field3236 = null;
        if (arg0 != 1) {
            method1421(-92, -85, -25, -81, -93, 102, -121);
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIII)Z", line = 19)
    public static final boolean method1420(int arg0, int arg1, int arg2, int arg3) {
        if (class491.method2908(arg0, arg1, arg2)) {
            int var4 = arg1 << class295.field3991;
            int var5 = arg2 << class295.field3991;
            return class24.method150(var4 + 1, class492.field7122[arg0].method85(arg1, arg2) + arg3, var5 + 1) && class24.method150(class117.field1845 + var4 - 1, class492.field7122[arg0].method85(arg1 + 1, arg2) + arg3, var5 + 1) && class24.method150(class117.field1845 + var4 - 1, class492.field7122[arg0].method85(arg1 + 1, arg2 + 1) + arg3, class117.field1845 + var5 - 1) && class24.method150(var4 + 1, class492.field7122[arg0].method85(arg1, arg2 + 1) + arg3, class117.field1845 + var5 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ig", name = "a", descriptor = "(IIIIIII)V", line = 39)
    public static final void method1421(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class182 var7 = new class182();
        var7.field2700 = arg1 >> class295.field3991;
        var7.field2703 = arg2 >> class295.field3991;
        var7.field2713 = arg3 >> class295.field3991;
        var7.field2705 = arg4 >> class295.field3991;
        var7.field2699 = arg0;
        var7.field2711 = arg1;
        var7.field2714 = arg2;
        var7.field2716 = arg3;
        var7.field2704 = arg4;
        var7.field2709 = arg5;
        var7.field2697 = arg6;
        class280.field3809[class349.field5072++] = var7;
    }
}
