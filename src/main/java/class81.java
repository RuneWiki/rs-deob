import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ld")
public class class81 {

    @OriginalMember(owner = "client!ld", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1109 = "Loaded defaults";

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "Ljava/lang/String;")
    public static String field1106 = "K";

    @OriginalMember(owner = "client!ld", name = "f", descriptor = "[I")
    public static int[] field1111 = new int[14];

    @OriginalMember(owner = "client!ld", name = "g", descriptor = "I")
    public static int field1112 = 0;

    @OriginalMember(owner = "client!ld", name = "b", descriptor = "I")
    public static int field1107;

    @OriginalMember(owner = "client!ld", name = "c", descriptor = "I")
    public static int field1108;

    @OriginalMember(owner = "client!ld", name = "e", descriptor = "[Ljava/lang/String;")
    public static String[] field1110;

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(IIIIIII)V")
    public static final void method509(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if ((arg1 - arg0) >= class93.field1294 && class296.field4668 >= arg1 + arg0 && arg6 - arg0 >= class273.field4228 && class127.field1782 >= (arg0 + arg6)) {
            class136.method925(arg1, arg3, 29387, arg0, arg5, arg2, arg6);
        } else {
            class135.method917(arg3, arg2, 28, arg6, arg1, arg0, arg5);
        }
        if (arg4 == -1484) {
            field1107++;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Z)V")
    public static void method510(boolean arg0) {
        if (arg0) {
            field1109 = null;
            field1106 = null;
            field1111 = null;
            field1110 = null;
        }
    }

    @OriginalMember(owner = "client!ld", name = "a", descriptor = "(Lql;Z)Ltl;")
    public static final class68 method511(class224 arg0, boolean arg1) {
        if (!arg1) {
            return null;
        }
        arg0.method1453((byte) -127);
        field1108++;
        int var2 = arg0.method1453((byte) -128);
        class68 var3 = class42.method278(var2, 7635);
        var3.field922 = arg0.method1453((byte) -128);
        int var4 = arg0.method1453((byte) -128);
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = arg0.method1453((byte) -128);
            var3.method28(arg0, var6, arg1);
        }
        var3.method192(-30);
        return var3;
    }
}
