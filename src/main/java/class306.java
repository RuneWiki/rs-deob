import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nd")
public class class306 {

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "Lmh;")
    private static class62 field5244 = class201.method1405(true, "Tue");

    @OriginalMember(owner = "client!nd", name = "f", descriptor = "Lmh;")
    private static class62 field5248 = class201.method1405(true, "Thu");

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "Lmh;")
    private static class62 field5243 = class201.method1405(true, "Sat");

    @OriginalMember(owner = "client!nd", name = "g", descriptor = "Lmh;")
    private static class62 field5249 = class201.method1405(true, "Mon");

    @OriginalMember(owner = "client!nd", name = "k", descriptor = "Lmh;")
    private static class62 field5253 = class201.method1405(true, "Sun");

    @OriginalMember(owner = "client!nd", name = "l", descriptor = "[I")
    public static int[] field5254 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2 };

    @OriginalMember(owner = "client!nd", name = "j", descriptor = "Lmh;")
    private static class62 field5252 = class201.method1405(true, "Fri");

    @OriginalMember(owner = "client!nd", name = "o", descriptor = "Lmh;")
    private static class62 field5257 = class201.method1405(true, "Wed");

    @OriginalMember(owner = "client!nd", name = "n", descriptor = "[Lmh;")
    public static class62[] field5256 = new class62[] { field5253, field5249, field5244, field5257, field5248, field5252, field5243 };

    @OriginalMember(owner = "client!nd", name = "d", descriptor = "[I")
    public static int[] field5246 = new int[4096];

    @OriginalMember(owner = "client!nd", name = "q", descriptor = "Lmh;")
    public static class62 field5259;

    @OriginalMember(owner = "client!nd", name = "r", descriptor = "I")
    public static int field5260;

    @OriginalMember(owner = "client!nd", name = "s", descriptor = "Lmh;")
    public static class62 field5261;

    @OriginalMember(owner = "client!nd", name = "t", descriptor = "Z")
    public static boolean field5262;

    @OriginalMember(owner = "client!nd", name = "c", descriptor = "I")
    public static int field5245;

    @OriginalMember(owner = "client!nd", name = "e", descriptor = "I")
    public static int field5247;

    @OriginalMember(owner = "client!nd", name = "h", descriptor = "I")
    public static int field5250;

    @OriginalMember(owner = "client!nd", name = "i", descriptor = "I")
    public static int field5251;

    @OriginalMember(owner = "client!nd", name = "m", descriptor = "I")
    public static int field5255;

    @OriginalMember(owner = "client!nd", name = "p", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!nd", name = "u", descriptor = "Lte;")
    public static class217 field5263;

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(I)V", line = 8)
    public static void method2087(int arg0) {
        field5252 = null;
        field5259 = null;
        field5261 = null;
        if (arg0 != 2) {
            field5262 = true;
        }
        field5249 = null;
        field5243 = null;
        field5248 = null;
        field5263 = null;
        field5254 = null;
        field5257 = null;
        field5244 = null;
        field5246 = null;
        field5256 = null;
        field5253 = null;
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field5246[var0] = class189.method1324(-26, var0);
        }
        field5259 = class201.method1405(true, "Schlie-8en");
        field5260 = 0;
        field5261 = class201.method1405(true, "null");
        field5262 = true;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "([[II)V", line = 44)
    public static final void method2088(int[][] arg0, int arg1) {
        if (arg1 != -2147) {
            field5254 = (int[]) null;
        }
        field5250++;
        class282.field4817 = arg0;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(ILm;)V", line = 55)
    public static final void method2089(int arg0, class45 arg1) {
        field5255++;
        int var2 = -18 / ((5 - arg0) / 56);
        class261.field4390 = arg1;
    }

    @OriginalMember(owner = "client!nd", name = "a", descriptor = "(Z)V", line = 74)
    public static final void method2090(boolean arg0) {
        field5245++;
        class236.field4051.method1395((byte) -43);
        if (arg0) {
            method2088((int[][]) ((int[][]) null), 55);
        }
    }

    @OriginalMember(owner = "client!nd", name = "b", descriptor = "(I)[Lwg;", line = 102)
    public static final class24[] method2091(int arg0) {
        field5247++;
        class24[] var1 = new class24[class12.field100];
        for (int var2 = 0; var2 < class12.field100; var2++) {
            var1[var2] = new class178(class41.field626, class189.field3005, class183.field2931[var2], class113.field1878[var2], class15.field132[var2], class184.field2940[var2], class42.field645[var2], class235.field4048);
        }
        if (arg0 != 4096) {
            field5246 = (int[]) null;
        }
        class135.method1020(-82);
        return var1;
    }
}
