import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ub")
public class class25 extends class306 {

    @OriginalMember(owner = "client!ub", name = "H", descriptor = "Ljava/lang/String;")
    public static String field289 = "scroll:";

    @OriginalMember(owner = "client!ub", name = "M", descriptor = "Ljava/lang/String;")
    public static String field294 = "rating: ";

    @OriginalMember(owner = "client!ub", name = "O", descriptor = "[Z")
    public static boolean[] field296 = new boolean[100];

    @OriginalMember(owner = "client!ub", name = "I", descriptor = "I")
    public static int field290;

    @OriginalMember(owner = "client!ub", name = "J", descriptor = "I")
    public static int field291;

    @OriginalMember(owner = "client!ub", name = "L", descriptor = "I")
    public static int field293;

    @OriginalMember(owner = "client!ub", name = "N", descriptor = "I")
    public static int field295;

    @OriginalMember(owner = "client!ub", name = "K", descriptor = "Lnk;")
    public static class16 field292;

    @OriginalMember(owner = "client!ub", name = "G", descriptor = "[I")
    public static int[] field288;

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(ILnk;II)Lch;", line = 7)
    public static final class158 method182(int arg0, class16 arg1, int arg2, int arg3) {
        field290++;
        if (class102.method648(arg0, -1000000000, arg2, arg1)) {
            if (arg3 > -31) {
                method185(-49);
            }
            return class56.method337(-127);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ub", name = "a", descriptor = "(II)[I", line = 23)
    public final int[] method47(int arg0, int arg1) {
        field295++;
        if (arg1 != -1546337535) {
            field296 = (boolean[]) null;
        }
        return field288;
    }

    @OriginalMember(owner = "client!ub", name = "c", descriptor = "(II)V", line = 35)
    public static final void method183(int arg0, int arg1) {
        field291++;
        class279 var2 = class147.method1085(arg0, -19443, arg1);
        var2.method1996(true);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(B)V", line = 51)
    public static void method184(byte arg0) {
        int var1 = -60 % ((-arg0 - 46) / 35);
        field296 = null;
        field288 = null;
        field294 = null;
        field292 = null;
        field289 = null;
    }

    @OriginalMember(owner = "client!ub", name = "<init>", descriptor = "()V", line = 69)
    public class25() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ub", name = "e", descriptor = "(I)V", line = 80)
    public static final void method185(int arg0) {
        for (int var1 = arg0; var1 < class302.field4704; var1++) {
            int var2;
            if (var1 == -1) {
                var2 = 2047;
            } else {
                var2 = class80.field1067[var1];
            }
            class67 var3 = class105.field1443[var2];
            if (var3 != null) {
                class331.method2297(arg0 ^ 0xFFFFB161, var3, var3.method412((byte) 72));
            }
        }
        field293++;
    }
}
