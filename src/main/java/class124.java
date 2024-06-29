import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fn")
public class class124 {

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2047 = null;

    @OriginalMember(owner = "client!fn", name = "b", descriptor = "[Ljava/lang/String;")
    public static String[] field2048 = new String[200];

    @OriginalMember(owner = "client!fn", name = "c", descriptor = "Lhga;")
    public static class158 field2049 = new class158(38, 6);

    @OriginalMember(owner = "client!fn", name = "d", descriptor = "I")
    public static int field2050;

    @OriginalMember(owner = "client!fn", name = "e", descriptor = "Llga;")
    public class662 field2051;

    @OriginalMember(owner = "client!fn", name = "g", descriptor = "Ljava/lang/Object;")
    public static Object field2053;

    @OriginalMember(owner = "client!fn", name = "f", descriptor = "[I")
    public static int[] field2052;

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Z)V")
    public static void method1099(boolean arg0) {
        field2053 = null;
        field2048 = null;
        if (!arg0) {
            method1099(false);
        }
        field2047 = null;
        field2049 = null;
        field2052 = null;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(Lr;B)V")
    public static final void method1100(class167 arg0, byte arg1) {
        if (class374.field5844) {
            class614.method3574(arg0, (byte) -115);
        } else {
            class181.method1478(arg0, true);
        }
        if (arg1 <= 28) {
            field2052 = null;
        }
        field2050++;
    }

    @OriginalMember(owner = "client!fn", name = "a", descriptor = "(I)V")
    public static final void method1101(int arg0) {
        class689.field9665 = arg0;
    }
}
