import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fg")
public class class63 {

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "Lmb;")
    public static class132 field1048 = class166.method1092("Diese Welt ist voll)3", 117);

    @OriginalMember(owner = "client!fg", name = "c", descriptor = "Ljh;")
    public static class106 field1049 = new class106(5000);

    @OriginalMember(owner = "client!fg", name = "g", descriptor = "Lmb;")
    public static class132 field1053 = class166.method1092(":assistreq:", 119);

    @OriginalMember(owner = "client!fg", name = "d", descriptor = "I")
    public static int field1050;

    @OriginalMember(owner = "client!fg", name = "e", descriptor = "I")
    public static int field1051;

    @OriginalMember(owner = "client!fg", name = "f", descriptor = "I")
    public static int field1052;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "[I")
    public static int[] field1047;

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(I)V")
    public static void method400(int arg0) {
        field1053 = null;
        field1048 = null;
        field1047 = null;
        field1049 = null;
        if (arg0 != 5000) {
            method402(49, (byte) -99, 71);
        }
    }

    @OriginalMember(owner = "client!fg", name = "b", descriptor = "(I)V")
    public static final void method401(int arg0) {
        class100.field1876.method778((byte) 104);
        field1050++;
        class180.field3301.method1137(6902);
        class92.field1627.method1137(6902);
        if (arg0 != 0) {
            field1049 = null;
        }
    }

    @OriginalMember(owner = "client!fg", name = "a", descriptor = "(IBI)Z")
    public static final boolean method402(int arg0, byte arg1, int arg2) {
        if (arg2 == 11) {
            arg2 = 10;
        }
        field1052++;
        if (arg2 >= 5 && arg2 <= 8) {
            arg2 = 4;
        }
        class84 var3 = class66.method414(0, arg0);
        if (arg1 != 110) {
            field1049 = null;
        }
        return var3.method516(arg2, -70);
    }
}
