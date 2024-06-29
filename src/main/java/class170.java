import java.io.InputStream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class170 extends InputStream {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lhj;")
    public static class266 field2424 = new class266();

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "[I")
    public static int[] field2426 = new int[4096];

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "I")
    public static int field2423;

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field2427;

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field2426[var0] = class307.method1807(true, var0);
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(B)V", line = 4)
    public static void method1158(byte arg0) {
        int var1 = 1 / ((-arg0 - 3) / 33);
        field2424 = null;
        field2426 = null;
    }

    @OriginalMember(owner = "client!fg", name = "read", descriptor = "()I", line = 14)
    public final int read() {
        class588.method3253(0, 30000L);
        field2425++;
        return -1;
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IIIIIZIII)V", line = 26)
    public static final void method1159(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (!arg5) {
            field2426 = null;
        }
        field2423++;
        class642.field8877[class408.field5370++] = new class152(arg8, arg7, arg3, arg2, arg2, arg3, arg1, arg0, arg0, arg1, arg4, arg4, arg6, arg6);
    }
}
