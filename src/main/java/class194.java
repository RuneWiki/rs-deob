import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gk")
public class class194 {

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "Ljava/lang/String;")
    public static String field2856 = "rating: ";

    @OriginalMember(owner = "client!gk", name = "c", descriptor = "Z")
    public static boolean field2858 = false;

    @OriginalMember(owner = "client!gk", name = "f", descriptor = "[I")
    public static int[] field2861 = new int[14];

    @OriginalMember(owner = "client!gk", name = "g", descriptor = "I")
    public static int field2862 = 0;

    @OriginalMember(owner = "client!gk", name = "h", descriptor = "I")
    public static int field2863 = 10;

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "I")
    public static int field2857;

    @OriginalMember(owner = "client!gk", name = "d", descriptor = "I")
    public static int field2859;

    @OriginalMember(owner = "client!gk", name = "e", descriptor = "I")
    public static int field2860;

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(I)V")
    public static final void method1374(int arg0) {
        field2860++;
        class135.field2209.method1422((byte) 98);
        if (arg0 < 45) {
            method1375(18);
        }
    }

    @OriginalMember(owner = "client!gk", name = "b", descriptor = "(I)V")
    public static void method1375(int arg0) {
        field2856 = null;
        field2861 = null;
        if (arg0 > -31) {
            method1374(-84);
        }
    }

    @OriginalMember(owner = "client!gk", name = "a", descriptor = "(Ljava/lang/String;IBLjava/lang/String;ILjava/lang/String;)V")
    public static final void method1376(String arg0, int arg1, byte arg2, String arg3, int arg4, String arg5) {
        for (int var6 = 99; var6 > 0; var6--) {
            class202.field2977[var6] = class202.field2977[var6 - 1];
            class65.field983[var6] = class65.field983[var6 - 1];
            class267.field4267[var6] = class267.field4267[var6 - 1];
            class188.field2793[var6] = class188.field2793[var6 - 1];
            class208.field3087[var6] = class208.field3087[var6 - 1];
        }
        class202.field2977[0] = arg1;
        class208.field3087[0] = arg4;
        class65.field983[0] = arg0;
        class237.field3466++;
        class267.field4267[0] = arg5;
        field2857++;
        if (arg2 == 38) {
            class188.field2793[0] = arg3;
            class124.field2061 = class248.field3705;
        }
    }
}
