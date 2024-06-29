import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!df")
public class class166 {

    @OriginalMember(owner = "client!df", name = "f", descriptor = "I")
    public static int field2962 = 0;

    @OriginalMember(owner = "client!df", name = "g", descriptor = "Lce;")
    public static class126 field2963 = class206.method1445(-7923, "Clientscript error in: ");

    @OriginalMember(owner = "client!df", name = "a", descriptor = "Lce;")
    private static class126 field2957 = class206.method1445(-7923, "Prepared sound engine");

    @OriginalMember(owner = "client!df", name = "b", descriptor = "[I")
    public static int[] field2958 = new int[2048];

    @OriginalMember(owner = "client!df", name = "h", descriptor = "Lce;")
    public static class126 field2964 = field2957;

    @OriginalMember(owner = "client!df", name = "i", descriptor = "Lce;")
    private static class126 field2965 = class206.method1445(-7923, "Choose Option");

    @OriginalMember(owner = "client!df", name = "e", descriptor = "Lce;")
    public static class126 field2961 = field2965;

    @OriginalMember(owner = "client!df", name = "d", descriptor = "I")
    public static int field2960;

    @OriginalMember(owner = "client!df", name = "c", descriptor = "[[I")
    public static int[][] field2959;

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(B)V", line = 12)
    public static void method1218(byte arg0) {
        field2958 = null;
        field2964 = null;
        field2961 = null;
        field2959 = (int[][]) null;
        if (arg0 == -31) {
            field2957 = null;
            field2963 = null;
            field2965 = null;
        }
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(BLcc;)V", line = 28)
    public static final void method1219(byte arg0, class313 arg1) {
        field2960++;
        int var2 = 28 / ((arg0 + 40) / 58);
        class313.field5366 = arg1;
    }

    @OriginalMember(owner = "client!df", name = "a", descriptor = "(III)Lk;", line = 51)
    public static final class240 method1220(int arg0, int arg1, int arg2) {
        class5 var3 = class297.field4940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        }
        for (int var4 = 0; var4 < var3.field61; var4++) {
            class240 var5 = var3.field54[var4];
            if ((var5.field4045 >> 29 & 0x3L) == 2L && var5.field4041 == arg1 && var5.field4046 == arg2) {
                return var5;
            }
        }
        return null;
    }
}
