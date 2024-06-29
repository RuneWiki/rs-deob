import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class236 {

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "Ljava/lang/String;")
    public static String field3705 = "Loading wordpack - ";

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Ljava/lang/String;")
    public static String field3711 = "flash1:";

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "[I")
    public static int[] field3708 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Ljava/lang/String;")
    public static String field3715 = "Prepared sound engine";

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "J")
    public static long field3713 = 0L;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "F")
    public static float field3709;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "I")
    public static int field3710;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "I")
    public static int field3717;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "Z")
    public static boolean field3707;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "[Lhe;")
    public static class94[] field3716;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field3712;

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field3714;

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "[[Ldb;")
    public static class186[][] field3706;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V", line = 49)
    public static void method1686(int arg0) {
        field3716 = null;
        field3715 = null;
        field3705 = null;
        field3711 = null;
        field3708 = null;
        field3712 = null;
        if (arg0 == -18113) {
            field3714 = null;
            field3706 = (class186[][]) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(BLpe;)V", line = 95)
    public static final void method1687(byte arg0, class101 arg1) {
        field3710++;
        for (int var2 = 0; var2 < class239.field3724; var2++) {
            int var3 = arg1.method738(-957401312);
            int var4 = arg1.method731(false);
            if (var4 == 65535) {
                var4 = -1;
            }
            if (class147.field2367[var3] != null) {
                class147.field2367[var3].field4912 = var4;
            }
        }
        int var5 = -126 % ((-arg0 - 30) / 47);
    }
}
