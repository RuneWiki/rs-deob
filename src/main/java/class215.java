import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sg")
public class class215 {

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "Lwf;")
    public static class333 field3038 = null;

    @OriginalMember(owner = "client!sg", name = "e", descriptor = "Ljava/lang/String;")
    public static String field3041 = "glow2:";

    @OriginalMember(owner = "client!sg", name = "c", descriptor = "I")
    public static int field3039 = 0;

    @OriginalMember(owner = "client!sg", name = "g", descriptor = "[I")
    public static int[] field3043 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "I")
    public static int field3037;

    @OriginalMember(owner = "client!sg", name = "f", descriptor = "I")
    public static int field3042;

    @OriginalMember(owner = "client!sg", name = "d", descriptor = "Lfh;")
    public static class140 field3040;

    @OriginalMember(owner = "client!sg", name = "a", descriptor = "(I)V", line = 17)
    public static final void method1567(int arg0) {
        class135.field1842.method2258((byte) 86);
        field3042++;
        int var1 = 3 % ((arg0 + 38) / 32);
    }

    @OriginalMember(owner = "client!sg", name = "b", descriptor = "(I)V", line = 36)
    public static void method1568(int arg0) {
        field3041 = null;
        field3040 = null;
        field3043 = null;
        if (arg0 != -2366) {
            field3039 = -83;
        }
        field3038 = null;
    }
}
