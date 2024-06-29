import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class98 {

    @OriginalMember(owner = "client!s", name = "b", descriptor = "Llm;")
    public static class150 field1425 = new class150(64);

    @OriginalMember(owner = "client!s", name = "d", descriptor = "Ljava/lang/String;")
    public static String field1427 = "red:";

    @OriginalMember(owner = "client!s", name = "f", descriptor = "I")
    public static int field1429 = -1;

    @OriginalMember(owner = "client!s", name = "e", descriptor = "I")
    public int field1428;

    @OriginalMember(owner = "client!s", name = "g", descriptor = "I")
    public static int field1430;

    @OriginalMember(owner = "client!s", name = "h", descriptor = "I")
    public static int field1431;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "Ldg;")
    public class6 field1424;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "[I")
    public int[] field1426;

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZIBI)V")
    public static final void method636(boolean arg0, int arg1, byte arg2, int arg3) {
        field1431++;
        if (arg1 < 8000 || arg1 > 48000) {
            throw new IllegalArgumentException();
        }
        if (arg2 != -41) {
            method636(true, -26, (byte) -5, 96);
        }
        class53.field760 = arg0;
        class175.field2476 = arg1;
        class84.field1181 = arg3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(I)V")
    public static void method637(int arg0) {
        if (arg0 <= 83) {
            method636(true, 1, (byte) 86, 65);
        }
        field1427 = null;
        field1425 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(BLjava/lang/String;)I")
    public static final int method638(byte arg0, String arg1) {
        field1430++;
        if (arg1 == null) {
            return -1;
        }
        for (int var2 = 0; var2 < class43.field643; var2++) {
            if (arg1.equalsIgnoreCase(class206.field3081[var2])) {
                return var2;
            }
        }
        if (arg0 != -43) {
            field1427 = null;
        }
        return -1;
    }
}
