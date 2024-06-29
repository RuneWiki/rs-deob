import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class331 extends class188 {

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lph;")
    public static class229 field5630 = class266.method1858("Module texte charg-B", 0);

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "Lph;")
    public static class229 field5631 = class266.method1858("sch-Utteln:", 0);

    @OriginalMember(owner = "client!tf", name = "q", descriptor = "I")
    public static int field5637 = 0;

    @OriginalMember(owner = "client!tf", name = "n", descriptor = "Lph;")
    public static class229 field5634 = class266.method1858("hint_mapmarkers", 0);

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "[I")
    public static int[] field5632 = new int[2];

    @OriginalMember(owner = "client!tf", name = "o", descriptor = "Lph;")
    private static class229 field5635 = class266.method1858("Your ignore list is full)3 Max of 100 users)3", 0);

    @OriginalMember(owner = "client!tf", name = "r", descriptor = "Lph;")
    public static class229 field5638 = field5635;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field5628;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field5629;

    @OriginalMember(owner = "client!tf", name = "m", descriptor = "I")
    public static int field5633;

    @OriginalMember(owner = "client!tf", name = "p", descriptor = "I")
    public static int field5636;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(I)V", line = 22)
    public static void method2265(int arg0) {
        field5638 = null;
        field5632 = null;
        field5631 = null;
        field5635 = null;
        int var1 = -32 / ((arg0 - 69) / 41);
        field5634 = null;
        field5630 = null;
    }

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "(B)V", line = 39)
    public static final void method2266(byte arg0) {
        class228.field3744 = null;
        class259.field4312 = null;
        if (arg0 > 104) {
            class115.field1955 = null;
            field5633++;
        }
    }

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "(B)V", line = 54)
    public static final void method2267(byte arg0) {
        if (arg0 != -85) {
            field5631 = (class229) null;
        }
        class208.field3428.method1415(-18218);
        class70.field1112.method1415(arg0 ^ 0x477D);
        field5636++;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)V", line = 68)
    public static final void method2268(int arg0, int arg1) {
        field5628++;
        if (arg1 == -1) {
            class117.method880(class117.field1974, ((float) arg0 * 0.1F + 0.7F) * 1.1523438F, 0.69921875F, 0.69921875F);
            class117.method884(-50.0F, -60.0F, -50.0F);
            class117.method889(class117.field1970, 0);
            class117.method883();
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(BI)V", line = 89)
    public static final void method2269(byte arg0, int arg1) {
        class262.field4372 = 1000 / arg1;
        int var2 = -68 / ((3 - arg0) / 38);
        field5629++;
    }
}
