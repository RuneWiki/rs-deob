import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ol")
public class class172 {

    @OriginalMember(owner = "client!ol", name = "g", descriptor = "I")
    public int field2360 = -1;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!ol", name = "b", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!ol", name = "e", descriptor = "Lr;")
    public static class110 field2358;

    @OriginalMember(owner = "client!ol", name = "f", descriptor = "Ljs;")
    public class199 field2359;

    @OriginalMember(owner = "client!ol", name = "d", descriptor = "[I")
    public int[] field2357;

    @OriginalMember(owner = "client!ol", name = "c", descriptor = "[Ljava/lang/String;")
    public String[] field2356;

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(B)V", line = 5)
    public static void method1000(byte arg0) {
        field2358 = null;
        int var1 = -77 % ((-arg0 - 28) / 51);
    }

    @OriginalMember(owner = "client!ol", name = "a", descriptor = "(IIBII)I", line = 14)
    public static final int method1001(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field2354++;
        if (arg2 != 41) {
            field2358 = null;
        }
        int var5 = 65536 - class364.field4992[arg0 * 8192 / arg3] >> 1;
        return ((65536 - var5) * arg1 >> 16) + (arg4 * var5 >> 16);
    }
}
