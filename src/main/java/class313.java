import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tf")
public class class313 {

    @OriginalMember(owner = "client!tf", name = "d", descriptor = "I")
    public static int field4986 = 0;

    @OriginalMember(owner = "client!tf", name = "i", descriptor = "I")
    public static int field4991 = 64;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "I")
    public int field4983;

    @OriginalMember(owner = "client!tf", name = "b", descriptor = "I")
    public int field4984;

    @OriginalMember(owner = "client!tf", name = "e", descriptor = "I")
    public int field4987;

    @OriginalMember(owner = "client!tf", name = "f", descriptor = "I")
    public int field4988;

    @OriginalMember(owner = "client!tf", name = "g", descriptor = "I")
    public static int field4989;

    @OriginalMember(owner = "client!tf", name = "h", descriptor = "I")
    public static int field4990;

    @OriginalMember(owner = "client!tf", name = "k", descriptor = "I")
    public int field4993;

    @OriginalMember(owner = "client!tf", name = "l", descriptor = "I")
    public int field4994;

    @OriginalMember(owner = "client!tf", name = "c", descriptor = "Llb;")
    public static class111 field4985;

    @OriginalMember(owner = "client!tf", name = "j", descriptor = "Lwk;")
    public static class196 field4992;

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(Z)V")
    public static void method2087(boolean arg0) {
        if (arg0) {
            field4986 = 28;
        }
        field4992 = null;
        field4985 = null;
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(I)V")
    public static final void method2088(int arg0) {
        class196.field3174.method1255(-105);
        field4989++;
        if (arg0 == 17970) {
            class57.field954.method1255(arg0 - 18087);
            class308.field4923.method1255(-67);
        }
    }

    @OriginalMember(owner = "client!tf", name = "a", descriptor = "(II)I")
    public static final int method2089(int arg0, int arg1) {
        if (arg0 != -1) {
            method2087(true);
        }
        field4990++;
        return arg1 == 16711935 ? -1 : class66.method464(-22, arg1);
    }
}
