import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lq")
public class class5 {

    @OriginalMember(owner = "client!lq", name = "c", descriptor = "I")
    public static int field90 = 2;

    @OriginalMember(owner = "client!lq", name = "d", descriptor = "Z")
    public static boolean field91 = false;

    @OriginalMember(owner = "client!lq", name = "b", descriptor = "I")
    public static int field89;

    @OriginalMember(owner = "client!lq", name = "f", descriptor = "I")
    public static int field93;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "Lfc;")
    public static class239 field88;

    @OriginalMember(owner = "client!lq", name = "e", descriptor = "Ljava/lang/String;")
    public static String field92;

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(I)V")
    public static void method36(int arg0) {
        field92 = null;
        field88 = null;
        if (arg0 != 4) {
            method37(-22, (byte) 101, 51, -99, -5);
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(IBIII)V")
    public static final void method37(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field93++;
        class186 var5 = class275.method1789(arg2, (byte) 123, 4);
        var5.method1285(0);
        if (arg1 == -127) {
            var5.field2829 = arg3;
            var5.field2819 = arg4;
            var5.field2813 = arg0;
        }
    }

    @OriginalMember(owner = "client!lq", name = "a", descriptor = "(II)V")
    public static final void method38(int arg0, int arg1) {
        field89++;
        class180.field2688 = new int[arg0];
        if (arg1 < 82) {
            method37(35, (byte) 11, -95, -26, 29);
        }
        class145.field2050 = new int[arg0];
        class356.field5405 = new int[arg0];
        class31.field412 = new int[arg0];
        class225.field3262 = new int[arg0];
    }
}
