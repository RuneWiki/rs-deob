import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uk")
public class class155 {

    @OriginalMember(owner = "client!uk", name = "c", descriptor = "[Lpk;")
    public class157[] field2083 = new class157[8];

    @OriginalMember(owner = "client!uk", name = "d", descriptor = "[I")
    public int[] field2084 = new int[3];

    @OriginalMember(owner = "client!uk", name = "h", descriptor = "[I")
    public int[] field2088 = new int[100];

    @OriginalMember(owner = "client!uk", name = "f", descriptor = "[Lbf;")
    public class336[] field2086 = new class336[100];

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "I")
    public static int field2082 = 0;

    @OriginalMember(owner = "client!uk", name = "k", descriptor = "[I")
    public static int[] field2091 = new int[] { 4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0 };

    @OriginalMember(owner = "client!uk", name = "l", descriptor = "I")
    public static int field2092 = -1;

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!uk", name = "i", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!uk", name = "j", descriptor = "I")
    public static int field2090;

    @OriginalMember(owner = "client!uk", name = "e", descriptor = "Ljava/lang/Object;")
    public Object field2085;

    @OriginalMember(owner = "client!uk", name = "g", descriptor = "Ljava/lang/String;")
    public static String field2087;

    static {
        new class409((String) null, "Dieses System darf nicht missbraucht werden!", (String) null, (String) null);
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(I)V", line = 3)
    public static void method1055(int arg0) {
        field2087 = null;
        if (arg0 == 8) {
            field2091 = null;
        }
    }

    @OriginalMember(owner = "client!uk", name = "a", descriptor = "(II)V", line = 38)
    public static final void method1056(int arg0, int arg1) {
        class151.field2052 = 3;
        field2090++;
        class267.field3966 = 100;
        class178.field2538 = arg1;
        if (arg0 >= 73) {
            class166.field2196 = -1;
        }
    }

    @OriginalMember(owner = "client!uk", name = "b", descriptor = "(I)[Lji;", line = 52)
    public static final class67[] method1057(int arg0) {
        if (arg0 > -70) {
            field2082 = 50;
        }
        field2089++;
        return new class67[] { class33.field456, class33.field461, class33.field462, class33.field463, class33.field464, class33.field465, class33.field466, class33.field467, class33.field468, class33.field469 };
    }
}
