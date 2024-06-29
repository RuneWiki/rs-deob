import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oj")
public class class318 extends class101 {

    @OriginalMember(owner = "client!oj", name = "k", descriptor = "[B")
    public static byte[] field4054 = new byte[] { 0, 4, 4, 8, 0, 0, 8, 0, 0 };

    @OriginalMember(owner = "client!oj", name = "l", descriptor = "I")
    public static int field4055 = 0;

    @OriginalMember(owner = "client!oj", name = "j", descriptor = "[I")
    public static int[] field4053 = new int[2];

    @OriginalMember(owner = "client!oj", name = "m", descriptor = "Lih;")
    public static class597 field4056 = new class597();

    @OriginalMember(owner = "client!oj", name = "r", descriptor = "Lvj;")
    public static class373 field4061 = new class373(98, 8);

    @OriginalMember(owner = "client!oj", name = "g", descriptor = "I")
    public int field4050;

    @OriginalMember(owner = "client!oj", name = "h", descriptor = "I")
    public static int field4051;

    @OriginalMember(owner = "client!oj", name = "i", descriptor = "I")
    public int field4052;

    @OriginalMember(owner = "client!oj", name = "o", descriptor = "I")
    public static int field4058;

    @OriginalMember(owner = "client!oj", name = "q", descriptor = "I")
    public int field4060;

    @OriginalMember(owner = "client!oj", name = "n", descriptor = "Loe;")
    public class170 field4057;

    @OriginalMember(owner = "client!oj", name = "p", descriptor = "[Lcf;")
    public class517[] field4059;

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(IZILqa;)Z", line = 8)
    public final boolean method1760(int arg0, boolean arg1, int arg2, class206 arg3) {
        field4058++;
        if (arg1) {
            this.method1760(100, false, 58, null);
        }
        if (this.field4059 != null) {
            for (int var5 = 0; var5 < this.field4059.length; var5++) {
                if (this.field4059[var5].method2960(arg0, arg2) && this.field4057.method318(-21851, arg3, arg0, arg2)) {
                    return true;
                }
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!oj", name = "c", descriptor = "(B)V", line = 56)
    public static void method1761(byte arg0) {
        if (arg0 != 8) {
            field4061 = null;
        }
        field4056 = null;
        field4054 = null;
        field4053 = null;
        field4061 = null;
    }

    @OriginalMember(owner = "client!oj", name = "a", descriptor = "(ZIIII)V", line = 72)
    public static final void method1762(boolean arg0, int arg1, int arg2, int arg3, int arg4) {
        field4051++;
        if (class529.field7429 == arg1) {
            class390.method2238((byte) -51, false);
        } else {
            class51.field433 = class529.field7429;
            class24.method144(arg1 - 2, 0);
        }
        class105.field1276 = arg0;
        class224.field2761 = arg4;
        class60.field584 = arg3;
        class353.method1982(arg2);
    }
}
