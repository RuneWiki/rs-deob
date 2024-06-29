import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hga")
public class class172 {

    @OriginalMember(owner = "client!hga", name = "e", descriptor = "I")
    public static int field2784 = 0;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "Ltw;")
    public static class233 field2780 = new class233();

    @OriginalMember(owner = "client!hga", name = "f", descriptor = "Ldc;")
    public static class303 field2785 = new class303(12, 0, 1, 0);

    @OriginalMember(owner = "client!hga", name = "b", descriptor = "I")
    public static int field2781;

    @OriginalMember(owner = "client!hga", name = "c", descriptor = "I")
    public static int field2782;

    @OriginalMember(owner = "client!hga", name = "d", descriptor = "I")
    public static int field2783;

    @OriginalMember(owner = "client!hga", name = "g", descriptor = "I")
    public static int field2786;

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(B)V", line = 7)
    public static void method1270(byte arg0) {
        field2780 = null;
        field2785 = null;
        int var1 = 82 % ((arg0 + 7) / 38);
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(IBI)Z", line = 21)
    public static final boolean method1271(int arg0, byte arg1, int arg2) {
        field2783++;
        if (arg1 != 60) {
            field2785 = null;
        }
        return (arg2 & 0x10) != 0;
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(BI)V", line = 32)
    public static final void method1272(byte arg0, int arg1) {
        field2781++;
        class449 var2 = class611.method3463(arg1, (byte) -112, 1);
        var2.method2614(arg0 + 206);
        if (arg0 != -92) {
            method1272((byte) 83, -63);
        }
    }

    @OriginalMember(owner = "client!hga", name = "a", descriptor = "(ILis;I)Ljava/lang/String;", line = 48)
    public static final String method1273(int arg0, class101 arg1, int arg2) {
        field2782++;
        if (!client.method707(arg1).method1954(arg0, true) && arg1.field1648 == null) {
            return null;
        }
        if (arg2 >= -41) {
            field2785 = null;
        }
        if (arg1.field1642 == null || arg1.field1642.length <= arg0 || arg1.field1642[arg0] == null || arg1.field1642[arg0].trim().length() == 0) {
            return class88.field1324 ? "Hidden-" + arg0 : null;
        } else {
            return arg1.field1642[arg0];
        }
    }
}
