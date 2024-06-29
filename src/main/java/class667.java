import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fb")
public class class667 {

    @OriginalMember(owner = "client!fb", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field9525 = new String[100];

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "Llc;")
    public static class435 field9524 = new class435(25, 1);

    @OriginalMember(owner = "client!fb", name = "c", descriptor = "I")
    public static int field9526;

    @OriginalMember(owner = "client!fb", name = "d", descriptor = "Lmda;")
    public static class349 field9527;

    @OriginalMember(owner = "client!fb", name = "e", descriptor = "[[B")
    public static byte[][] field9528;

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(I)V", line = 5)
    public static void method3807(int arg0) {
        field9527 = null;
        if (arg0 != 0) {
            field9528 = null;
        }
        field9525 = null;
        field9524 = null;
        field9528 = null;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(Lr;III[Z)Z", line = 19)
    public static final boolean method3808(class704 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class95.field1372 != class25.field221) {
            int var6 = class491.field7079[arg1].method2089(26448, arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class339 var8 = class491.field7079[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method2089(26448, arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method38(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method51(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!fb", name = "a", descriptor = "(II)Z", line = 55)
    public static final boolean method3809(int arg0, int arg1) {
        if (arg0 != 100) {
            field9525 = null;
        }
        field9526++;
        return arg1 >= 12 && arg1 <= 17;
    }
}
