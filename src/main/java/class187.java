import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bs")
public abstract class class187 {

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "Lop;")
    public static class353 field2542 = new class353(16);

    @OriginalMember(owner = "client!bs", name = "c", descriptor = "Ljava/lang/String;")
    public static String field2543 = "red:";

    @OriginalMember(owner = "client!bs", name = "e", descriptor = "I")
    public static int field2545 = -1;

    @OriginalMember(owner = "client!bs", name = "d", descriptor = "I")
    public static int field2544 = 0;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "I")
    public static int field2541;

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(I)Lwo;")
    public abstract class52 method1163(int arg0);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(II)V")
    public abstract void method1164(int arg0, int arg1);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(BI)[B")
    public abstract byte[] method1165(byte arg0, int arg1);

    @OriginalMember(owner = "client!bs", name = "b", descriptor = "(BI)I")
    public abstract int method1166(byte arg0, int arg1);

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(Ljava/lang/String;B)Ljava/lang/String;")
    public static final String method1167(String arg0, byte arg1) {
        field2541++;
        if (arg1 != -39) {
            return null;
        }
        String var2 = class57.method384(126, class249.method1535(arg0, 65535));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!bs", name = "a", descriptor = "(B)V")
    public static void method1168(byte arg0) {
        if (arg0 > 28) {
            field2542 = null;
            field2543 = null;
        }
    }
}
