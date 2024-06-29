import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jl")
public class class176 {

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "Z")
    public static boolean field2503 = false;

    @OriginalMember(owner = "client!jl", name = "b", descriptor = "[I")
    public static int[] field2504 = new int[4096];

    @OriginalMember(owner = "client!jl", name = "c", descriptor = "Loa;")
    public static class490 field2505;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2504[var0] = class320.method1809((byte) 95, var0);
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(B)V", line = 10)
    public static void method1081(byte arg0) {
        field2505 = null;
        if (arg0 == 7) {
            field2504 = null;
        }
    }

    @OriginalMember(owner = "client!jl", name = "a", descriptor = "(III)Lsd;", line = 29)
    public static final class61 method1082(int arg0, int arg1, int arg2) {
        if (class385.field5410[arg0][arg1][arg2] == null) {
            boolean var3 = class385.field5410[0][arg1][arg2] != null && class385.field5410[0][arg1][arg2].field834 != null;
            if (var3 && arg0 >= class401.field5574 - 1) {
                return null;
            }
            class239.method1385(arg0, arg1, arg2);
        }
        return class385.field5410[arg0][arg1][arg2];
    }
}
