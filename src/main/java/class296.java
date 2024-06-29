import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class296 extends class311 {

    @OriginalMember(owner = "client!tg", name = "t", descriptor = "I")
    public volatile int field4070 = -1;

    @OriginalMember(owner = "client!tg", name = "w", descriptor = "Ljava/lang/String;")
    public volatile String field4073;

    @OriginalMember(owner = "client!tg", name = "v", descriptor = "[I")
    public static int[] field4072 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!tg", name = "u", descriptor = "I")
    public static int field4071 = 0;

    @OriginalMember(owner = "client!tg", name = "q", descriptor = "Lka;")
    public static class408 field4067 = new class408(20);

    @OriginalMember(owner = "client!tg", name = "p", descriptor = "I")
    public static int field4066;

    @OriginalMember(owner = "client!tg", name = "r", descriptor = "I")
    public static int field4068;

    @OriginalMember(owner = "client!tg", name = "s", descriptor = "[[[I")
    public static int[][][] field4069;

    @OriginalMember(owner = "client!tg", name = "c", descriptor = "(I)Z", line = 10)
    public static final boolean method1815(int arg0) {
        if (arg0 != -7084) {
            method1816((byte) 16, (long[]) null, (Object[]) null);
        }
        field4066++;
        return class149.field2171 > 0;
    }

    @OriginalMember(owner = "client!tg", name = "a", descriptor = "(B[J[Ljava/lang/Object;)V", line = 22)
    public static final void method1816(byte arg0, long[] arg1, Object[] arg2) {
        field4068++;
        if (arg0 < 41) {
            field4072 = null;
        }
        class37.method322(false, arg1, arg2, 0, arg1.length - 1);
    }

    @OriginalMember(owner = "client!tg", name = "d", descriptor = "(I)V", line = 33)
    public static void method1817(int arg0) {
        field4069 = null;
        field4067 = null;
        int var1 = -27 / ((arg0 - 89) / 32);
        field4072 = null;
    }

    @OriginalMember(owner = "client!tg", name = "<init>", descriptor = "(Ljava/lang/String;)V", line = 62)
    public class296(String arg0) {
        this.field4073 = arg0;
    }
}
