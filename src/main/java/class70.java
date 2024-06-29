import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class70 {

    @OriginalMember(owner = "client!jv", name = "m", descriptor = "J")
    public static long field1076 = -1L;

    @OriginalMember(owner = "client!jv", name = "d", descriptor = "Ljk;")
    public static class585 field1067 = new class585(50, 7);

    @OriginalMember(owner = "client!jv", name = "j", descriptor = "B")
    public byte field1073;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "I")
    public static int field1064;

    @OriginalMember(owner = "client!jv", name = "f", descriptor = "I")
    public static int field1069;

    @OriginalMember(owner = "client!jv", name = "g", descriptor = "I")
    public int field1070;

    @OriginalMember(owner = "client!jv", name = "e", descriptor = "Ljn;")
    public static class668 field1068;

    @OriginalMember(owner = "client!jv", name = "b", descriptor = "Ljava/lang/String;")
    public String field1065;

    @OriginalMember(owner = "client!jv", name = "i", descriptor = "Ljava/lang/String;")
    public String field1072;

    @OriginalMember(owner = "client!jv", name = "k", descriptor = "Ljava/lang/String;")
    public String field1074;

    @OriginalMember(owner = "client!jv", name = "l", descriptor = "Ljava/lang/String;")
    public String field1075;

    @OriginalMember(owner = "client!jv", name = "c", descriptor = "[Lfc;")
    public static class236[] field1066;

    @OriginalMember(owner = "client!jv", name = "h", descriptor = "[S")
    public static short[] field1071;

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(B)V")
    public static final void method627(byte arg0) {
        class504.field7035 = null;
        class406.field5747 = null;
        class562.field8119 = null;
        class568.field8314 = null;
        class186.field2282 = null;
        class420.field5955 = null;
        class496.field6934 = null;
        field1064++;
        class215.field2735 = null;
        class205.field2454 = null;
        if (arg0 != -68) {
            field1071 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(I)V")
    public static void method628(int arg0) {
        field1071 = null;
        if (arg0 == -1) {
            field1066 = null;
            field1068 = null;
            field1067 = null;
        }
    }

    @OriginalMember(owner = "client!jv", name = "a", descriptor = "(IZ)V")
    public static final void method629(int arg0, boolean arg1) {
        class231.field3009.method2777(arg0, 91);
        field1069++;
        if (arg1) {
            field1067 = null;
        }
    }
}
