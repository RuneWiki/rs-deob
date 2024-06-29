import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public class class216 extends class166 {

    @OriginalMember(owner = "client!td", name = "w", descriptor = "[I")
    public static int[] field3568 = new int[2];

    @OriginalMember(owner = "client!td", name = "u", descriptor = "I")
    public static int field3566 = 7759444;

    @OriginalMember(owner = "client!td", name = "v", descriptor = "[I")
    public static int[] field3567 = new int[200];

    @OriginalMember(owner = "client!td", name = "C", descriptor = "Lij;")
    private static class50 field3574 = class78.method578(124, "Select a world");

    @OriginalMember(owner = "client!td", name = "B", descriptor = "Lij;")
    public static class50 field3573 = field3574;

    @OriginalMember(owner = "client!td", name = "A", descriptor = "I")
    public static int field3572 = 0;

    @OriginalMember(owner = "client!td", name = "D", descriptor = "Lij;")
    public static class50 field3575 = class78.method578(122, "event_opbase");

    @OriginalMember(owner = "client!td", name = "y", descriptor = "I")
    public static int field3570;

    @OriginalMember(owner = "client!td", name = "z", descriptor = "I")
    public static int field3571;

    @OriginalMember(owner = "client!td", name = "x", descriptor = "[Lij;")
    public static class50[] field3569;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(B)V")
    public static void method1432(byte arg0) {
        field3567 = null;
        field3574 = null;
        field3573 = null;
        field3568 = null;
        field3569 = null;
        if (arg0 == 92) {
            field3575 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(II)V")
    public static final void method1433(int arg0, int arg1) {
        class194.field3228 = arg1;
        class46.field841 = null;
        class56.field995 = -1;
        class52.field951 = arg0;
        class127.field2229 = 0;
        class139.field2411 = 1;
        field3571++;
        class245.field4254 = false;
    }
}
