import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lu")
public class class57 extends class272 {

    @OriginalMember(owner = "client!lu", name = "n", descriptor = "I")
    public int field881;

    @OriginalMember(owner = "client!lu", name = "q", descriptor = "I")
    public static int field884 = 0;

    @OriginalMember(owner = "client!lu", name = "p", descriptor = "Ljava/lang/String;")
    public static String field883 = "";

    @OriginalMember(owner = "client!lu", name = "m", descriptor = "I")
    public static int field880;

    @OriginalMember(owner = "client!lu", name = "o", descriptor = "I")
    public static int field882;

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(IIIIIZII)V", line = 9)
    public static final void method612(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        field882++;
        class160 var8 = null;
        for (class160 var9 = (class160) class218.field3198.method3731((byte) -109); var9 != null; var9 = (class160) class218.field3198.method3729((byte) -122)) {
            if (var9.field2489 == arg1 && var9.field2479 == arg2 && var9.field2488 == arg6 && var9.field2484 == arg0) {
                var8 = var9;
                break;
            }
        }
        if (var8 == null) {
            var8 = new class160();
            var8.field2479 = arg2;
            var8.field2484 = arg0;
            var8.field2488 = arg6;
            var8.field2489 = arg1;
            if (arg2 >= 0 && arg6 >= 0 && class192.field2891 > arg2 && class456.field6225 > arg6) {
                class657.method3685(var8, -9488);
            }
            class218.field3198.method3728((byte) 99, var8);
        }
        var8.field2485 = false;
        var8.field2483 = arg5;
        var8.field2475 = arg7;
        var8.field2490 = arg3;
        var8.field2477 = arg4;
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(B)Lhl;", line = 51)
    public final class353 method327(byte arg0) {
        if (arg0 < 51) {
            return null;
        } else {
            field880++;
            return class458.field6261;
        }
    }

    @OriginalMember(owner = "client!lu", name = "a", descriptor = "(I)V", line = 62)
    public static void method613(int arg0) {
        field883 = null;
        if (arg0 != -1) {
            field884 = 65;
        }
    }

    @OriginalMember(owner = "client!lu", name = "<init>", descriptor = "(ILmp;Lfe;III)V", line = 73)
    public class57(int arg0, class565 arg1, class345 arg2, int arg3, int arg4, int arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        this.field881 = arg5;
    }
}
