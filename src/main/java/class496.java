import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class496 {

    @OriginalMember(owner = "client!ed", name = "c", descriptor = "[Ljava/lang/String;")
    public static String[] field6880 = new String[100];

    @OriginalMember(owner = "client!ed", name = "d", descriptor = "I")
    public static int field6881 = 0;

    @OriginalMember(owner = "client!ed", name = "e", descriptor = "Ljp;")
    public static class236 field6882 = new class236(32);

    @OriginalMember(owner = "client!ed", name = "b", descriptor = "I")
    public static int field6879;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "Lpc;")
    public static class473 field6878;

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(I)V")
    public static void method2847(int arg0) {
        if (arg0 != -21457) {
            field6881 = 1;
        }
        field6880 = null;
        field6882 = null;
        field6878 = null;
    }

    @OriginalMember(owner = "client!ed", name = "a", descriptor = "(BLql;II)V")
    public static final void method2848(byte arg0, class515 arg1, int arg2, int arg3) {
        field6879++;
        if (arg0 != 2) {
            field6881 = 123;
        }
        if (arg1.field6185 == arg2 && arg2 != -1) {
            class5 var4 = class423.field5791.method1601(arg2, (byte) -122);
            int var5 = var4.field126;
            if (var5 == 1) {
                arg1.field6226 = 1;
                arg1.field6248 = arg3;
                arg1.field6175 = 0;
                arg1.field6244 = 0;
                arg1.field6204 = 0;
                class291.method1711(var4, arg1.field6204, arg1.field574, arg0 ^ 0xFFFFFFB9, arg1.field573, arg1.field584, class385.field5232 == arg1);
            }
            if (var5 == 2) {
                arg1.field6244 = 0;
                return;
            }
        } else if (arg2 == -1 || arg1.field6185 == -1 || class423.field5791.method1601(arg2, (byte) -127).field135 >= class423.field5791.method1601(arg1.field6185, (byte) -123).field135) {
            arg1.field6259 = arg1.field6257;
            arg1.field6244 = 0;
            arg1.field6175 = 0;
            arg1.field6204 = 0;
            arg1.field6226 = 1;
            arg1.field6248 = arg3;
            arg1.field6185 = arg2;
            if (arg1.field6185 == -1) {
                return;
            }
            class291.method1711(class423.field5791.method1601(arg1.field6185, (byte) -119), arg1.field6204, arg1.field574, arg0 - 105, arg1.field573, arg1.field584, class385.field5232 == arg1);
        }
    }
}
