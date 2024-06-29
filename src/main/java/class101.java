import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class101 extends class112 {

    @OriginalMember(owner = "client!eh", name = "H", descriptor = "Lte;")
    public class207 field1553;

    @OriginalMember(owner = "client!eh", name = "z", descriptor = "Ljava/lang/String;")
    public static String field1547 = "skill: ";

    @OriginalMember(owner = "client!eh", name = "A", descriptor = "[Lub;")
    public static class169[] field1548 = new class169[14];

    @OriginalMember(owner = "client!eh", name = "E", descriptor = "[I")
    public static int[] field1551 = new int[] { 1, 1, 0, 0, 0, 8, 0, 0, 8 };

    @OriginalMember(owner = "client!eh", name = "G", descriptor = "I")
    public static int field1552;

    @OriginalMember(owner = "client!eh", name = "C", descriptor = "Lbf;")
    public static class102 field1549;

    @OriginalMember(owner = "client!eh", name = "D", descriptor = "[Lfc;")
    public static class149[] field1550;

    @OriginalMember(owner = "client!eh", name = "e", descriptor = "(B)V")
    public static void method753(byte arg0) {
        field1551 = null;
        int var1 = 40 / ((51 - arg0) / 45);
        field1547 = null;
        field1548 = null;
        field1549 = null;
        field1550 = null;
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I)V")
    public static final void method754(int arg0) {
        class288.field4610 = arg0;
        for (int var1 = 0; var1 < class129.field2127; var1++) {
            for (int var2 = 0; var2 < class130.field2161; var2++) {
                if (class26.field455[arg0][var1][var2] == null) {
                    class26.field455[arg0][var1][var2] = new class129(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "(Lte;)V")
    public class101(class207 arg0) {
        this.field1553 = arg0;
    }
}
