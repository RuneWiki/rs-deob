import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class147 {

    @OriginalMember(owner = "client!bm", name = "j", descriptor = "I")
    public int field2203 = 0;

    @OriginalMember(owner = "client!bm", name = "c", descriptor = "I")
    public static int field2196 = 0;

    @OriginalMember(owner = "client!bm", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field2199 = new String[500];

    @OriginalMember(owner = "client!bm", name = "h", descriptor = "Z")
    public static boolean field2201 = false;

    @OriginalMember(owner = "client!bm", name = "m", descriptor = "[I")
    public static int[] field2206 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!bm", name = "l", descriptor = "[I")
    public static int[] field2205 = new int[14];

    @OriginalMember(owner = "client!bm", name = "k", descriptor = "Ljava/lang/String;")
    public static String field2204 = null;

    @OriginalMember(owner = "client!bm", name = "n", descriptor = "I")
    public static int field2207 = -1;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "I")
    public static int field2194;

    @OriginalMember(owner = "client!bm", name = "b", descriptor = "I")
    public static int field2195;

    @OriginalMember(owner = "client!bm", name = "g", descriptor = "I")
    public static int field2200;

    @OriginalMember(owner = "client!bm", name = "i", descriptor = "I")
    public static int field2202;

    @OriginalMember(owner = "client!bm", name = "e", descriptor = "Llm;")
    public static class55 field2198;

    @OriginalMember(owner = "client!bm", name = "d", descriptor = "[Ltd;")
    public static class255[] field2197;

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(I)V", line = 7)
    public static void method1029(int arg0) {
        field2199 = null;
        field2197 = null;
        field2198 = null;
        field2206 = null;
        field2204 = null;
        field2205 = null;
        if (arg0 != -8770) {
            field2197 = (class255[]) null;
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(ID)V", line = 24)
    public static final void method1030(int arg0, double arg1) {
        if (class302.field4720 != arg1) {
            for (int var3 = 0; var3 < 256; var3++) {
                int var4 = (int) (Math.pow((double) var3 / 255.0D, arg1) * 255.0D);
                class19.field271[var3] = var4 <= 255 ? var4 : 255;
            }
            class302.field4720 = arg1;
        }
        field2202++;
        if (arg0 != 255) {
            method1030(41, -1.4906240611968495D);
        }
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lim;II)V", line = 54)
    private final void method1031(class192 arg0, int arg1, int arg2) {
        if (arg2 == 5) {
            this.field2203 = arg0.method1396(-56);
        }
        if (arg1 != -19364) {
            field2197 = (class255[]) null;
        }
        field2194++;
    }

    @OriginalMember(owner = "client!bm", name = "a", descriptor = "(Lim;B)V", line = 75)
    public final void method1032(class192 arg0, byte arg1) {
        field2200++;
        while (true) {
            int var3 = arg0.method1399(-1172389784);
            if (var3 == 0) {
                if (arg1 < 74) {
                    field2198 = (class55) null;
                }
                return;
            }
            this.method1031(arg0, -19364, var3);
        }
    }
}
