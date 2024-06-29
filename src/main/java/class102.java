import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pw")
public class class102 extends class49 {

    @OriginalMember(owner = "client!pw", name = "w", descriptor = "Llga;")
    public class20 field1179;

    @OriginalMember(owner = "client!pw", name = "A", descriptor = "Ljn;")
    public static class134 field1183 = new class134(55, 6);

    @OriginalMember(owner = "client!pw", name = "x", descriptor = "I")
    public static int field1180;

    @OriginalMember(owner = "client!pw", name = "y", descriptor = "I")
    public static int field1181;

    @OriginalMember(owner = "client!pw", name = "z", descriptor = "I")
    public static int field1182;

    @OriginalMember(owner = "client!pw", name = "B", descriptor = "Lae;")
    public static class283 field1184;

    @OriginalMember(owner = "client!pw", name = "D", descriptor = "Lae;")
    public static class283 field1185;

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "(ZILae;IIII)V", line = 4)
    public static final void method719(boolean arg0, int arg1, class283 arg2, int arg3, int arg4, int arg5, int arg6) {
        class164.field2097 = arg2;
        class20.field171 = 1;
        class574.field8079 = null;
        class748.field10330 = arg6;
        class565.field7982 = arg4;
        field1180++;
        class793.field10868 = arg5;
        class354.field5120 = arg3;
        if (arg1 <= 115) {
            field1184 = null;
        }
        class194.field2599 = arg0;
    }

    @OriginalMember(owner = "client!pw", name = "b", descriptor = "(B)V", line = 24)
    public static final void method720(byte arg0) {
        field1181++;
        class186.method1159();
        if (arg0 != -64) {
            field1184 = null;
        }
    }

    @OriginalMember(owner = "client!pw", name = "<init>", descriptor = "(Llga;)V", line = 37)
    public class102(class20 arg0) {
        this.field1179 = arg0;
    }

    @OriginalMember(owner = "client!pw", name = "a", descriptor = "([ILae;Lae;I)V", line = 46)
    public static final void method721(int[] arg0, class283 arg1, class283 arg2, int arg3) {
        class83.field1001 = arg2;
        class92.field1077 = arg1;
        if (arg0 != null) {
            class75.field842 = arg0;
        }
        if (arg3 == 55) {
            field1182++;
        }
    }

    @OriginalMember(owner = "client!pw", name = "d", descriptor = "(B)V", line = 62)
    public static void method722(byte arg0) {
        field1185 = null;
        field1183 = null;
        field1184 = null;
        if (arg0 < 8) {
            field1184 = null;
        }
    }
}
