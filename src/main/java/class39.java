import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vo")
public class class39 {

    @OriginalMember(owner = "client!vo", name = "c", descriptor = "Lsb;")
    public static class266 field1060 = new class266(68, 8);

    @OriginalMember(owner = "client!vo", name = "e", descriptor = "I")
    public static int field1062 = 0;

    @OriginalMember(owner = "client!vo", name = "d", descriptor = "Lqfa;")
    public static class85 field1061 = new class85(96, -2);

    @OriginalMember(owner = "client!vo", name = "g", descriptor = "[I")
    public static int[] field1064 = new int[1];

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "I")
    public static int field1058;

    @OriginalMember(owner = "client!vo", name = "b", descriptor = "I")
    public static int field1059;

    @OriginalMember(owner = "client!vo", name = "f", descriptor = "Lit;")
    public static class600 field1063;

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(BII)V")
    public static final void method555(byte arg0, int arg1, int arg2) {
        field1059++;
        class19 var3 = class373.method2355(125, arg1, 1);
        int var4 = 107 / ((-arg0 - 41) / 57);
        var3.method432(49);
        var3.field829 = arg2;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(Z)V")
    public static void method556(boolean arg0) {
        field1064 = null;
        field1061 = null;
        field1063 = null;
        if (!arg0) {
            field1060 = null;
        }
        field1060 = null;
    }

    @OriginalMember(owner = "client!vo", name = "a", descriptor = "(II)V")
    public static final void method557(int arg0, int arg1) {
        class419.field6038.method1908(arg0, (byte) -11);
        field1058++;
        class22.field867.method1908(arg0, (byte) -11);
        class366.field5424.method1908(arg0, (byte) -11);
        class341.field5071.method1908(arg0, (byte) -11);
        if (arg1 != 0) {
            method555((byte) -16, -103, 92);
        }
    }
}
