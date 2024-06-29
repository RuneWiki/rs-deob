import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jc")
public class class302 extends class80 {

    @OriginalMember(owner = "client!jc", name = "n", descriptor = "Lph;")
    public class229 field5052;

    @OriginalMember(owner = "client!jc", name = "p", descriptor = "Lph;")
    public static class229 field5054 = class266.method1858("Lade Liste der Welten", 0);

    @OriginalMember(owner = "client!jc", name = "o", descriptor = "Lph;")
    private static class229 field5053 = class266.method1858("Ok", 0);

    @OriginalMember(owner = "client!jc", name = "m", descriptor = "Lph;")
    public static class229 field5051 = field5053;

    @OriginalMember(owner = "client!jc", name = "u", descriptor = "[I")
    public static int[] field5059 = new int[] { 0, 0, 2, 0, 0, 2, 1, 1, 0 };

    @OriginalMember(owner = "client!jc", name = "l", descriptor = "I")
    public static int field5050;

    @OriginalMember(owner = "client!jc", name = "q", descriptor = "I")
    public static int field5055;

    @OriginalMember(owner = "client!jc", name = "r", descriptor = "I")
    public static int field5056;

    @OriginalMember(owner = "client!jc", name = "s", descriptor = "I")
    public static int field5057;

    @OriginalMember(owner = "client!jc", name = "t", descriptor = "I")
    public static int field5058;

    @OriginalMember(owner = "client!jc", name = "e", descriptor = "(I)V", line = 4)
    public static void method2037(int arg0) {
        field5054 = null;
        field5051 = null;
        if (arg0 == 5088) {
            field5053 = null;
            field5059 = null;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "()V", line = 26)
    public class302() {
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(ZJ)V", line = 32)
    public static final void method2038(boolean arg0, long arg1) {
        field5057++;
        if (arg1 != 0L && !arg0) {
            class121.field2033.method37(110, 237);
            class252.field4216++;
            class121.field2033.method1208((byte) -6, arg1);
        }
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(B)V", line = 52)
    public static final void method2039(byte arg0) {
        field5055++;
        if (arg0 < 118) {
            method2039((byte) 126);
        }
        class254.field4238.method1415(-18218);
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(Z)V", line = 70)
    public static final void method2040(boolean arg0) {
        field5056++;
        class234.field3856.method1415(-18218);
        if (!arg0) {
            field5058 = -84;
        }
    }

    @OriginalMember(owner = "client!jc", name = "<init>", descriptor = "(Lph;)V", line = 83)
    public class302(class229 arg0) {
        this.field5052 = arg0;
    }

    @OriginalMember(owner = "client!jc", name = "a", descriptor = "(BZ)V", line = 104)
    public static final void method2041(byte arg0, boolean arg1) {
        class85.field1467 = arg1;
        if (arg0 <= 12) {
            field5059 = (int[]) null;
        }
        field5050++;
        class268.field4491 = !class61.method415((byte) 68);
    }
}
