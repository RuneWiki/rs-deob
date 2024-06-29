import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!su")
public class class592 extends class4 {

    @OriginalMember(owner = "client!su", name = "r", descriptor = "I")
    public int field8034 = 0;

    @OriginalMember(owner = "client!su", name = "s", descriptor = "[Lpia;")
    public static class57[] field8035 = new class57[14];

    @OriginalMember(owner = "client!su", name = "t", descriptor = "I")
    public static int field8036;

    @OriginalMember(owner = "client!su", name = "u", descriptor = "I")
    public static int field8037;

    @OriginalMember(owner = "client!su", name = "v", descriptor = "I")
    public static int field8038;

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ldc;II)V", line = 3)
    private final void method3403(class63 arg0, int arg1, int arg2) {
        field8038++;
        if (arg1 == 2) {
            this.field8034 = arg0.method482(-772591672);
        }
        if (arg2 >= -79) {
            method3404(52, -60, -73, -40, -92, 83, 90, -77, 86, 112, 40, 120);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(IIIIIIIIIIII)V", line = 19)
    public static final void method3404(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field8037++;
        if (arg3 != -1) {
            method3406(-69);
        }
        if (!class424.method2641(arg2, arg3 ^ 0x2D8F)) {
            return;
        }
        if (class39.field483[arg2] == null) {
            client.method2749(class266.field3900[arg2], -1, arg9, arg6, arg0, arg11, arg7, arg5, arg10, arg4, arg1, arg8);
        } else {
            client.method2749(class39.field483[arg2], -1, arg9, arg6, arg0, arg11, arg7, arg5, arg10, arg4, arg1, arg8);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(Ldc;I)V", line = 38)
    public final void method3405(class63 arg0, int arg1) {
        field8036++;
        if (arg1 != 14) {
            method3404(-72, 68, -102, 86, -67, 24, 29, 26, 67, 75, -7, 45);
        }
        while (true) {
            int var3 = arg0.method505((byte) -119);
            if (var3 == 0) {
                return;
            }
            this.method3403(arg0, var3, -126);
        }
    }

    @OriginalMember(owner = "client!su", name = "a", descriptor = "(I)V", line = 64)
    public static void method3406(int arg0) {
        if (arg0 != 2) {
            field8035 = null;
        }
        field8035 = null;
    }
}
