import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!te")
public class class119 extends class82 {

    @OriginalMember(owner = "client!te", name = "cb", descriptor = "[La;")
    public static class1[] field2954 = new class1[200];

    @OriginalMember(owner = "client!te", name = "ib", descriptor = "[La;")
    public static class1[] field2960 = new class1[1000];

    @OriginalMember(owner = "client!te", name = "nb", descriptor = "I")
    public static int field2965 = 0;

    @OriginalMember(owner = "client!te", name = "qb", descriptor = "La;")
    public static class1 field2968 = class113.method934(-11538, "headicons_pk");

    @OriginalMember(owner = "client!te", name = "sb", descriptor = "I")
    public static int field2970 = 0;

    @OriginalMember(owner = "client!te", name = "tb", descriptor = "La;")
    public static class1 field2971 = class113.method934(-11538, "::fpsoff");

    @OriginalMember(owner = "client!te", name = "db", descriptor = "I")
    public static int field2955;

    @OriginalMember(owner = "client!te", name = "eb", descriptor = "I")
    public static int field2956;

    @OriginalMember(owner = "client!te", name = "fb", descriptor = "I")
    public static int field2957;

    @OriginalMember(owner = "client!te", name = "gb", descriptor = "I")
    public static int field2958;

    @OriginalMember(owner = "client!te", name = "hb", descriptor = "I")
    public static int field2959;

    @OriginalMember(owner = "client!te", name = "pb", descriptor = "I")
    public int field2967;

    @OriginalMember(owner = "client!te", name = "vb", descriptor = "I")
    public int field2973;

    @OriginalMember(owner = "client!te", name = "rb", descriptor = "Lbd;")
    public static class11 field2969;

    @OriginalMember(owner = "client!te", name = "jb", descriptor = "[I")
    public int[] field2961;

    @OriginalMember(owner = "client!te", name = "kb", descriptor = "[I")
    public int[] field2962;

    @OriginalMember(owner = "client!te", name = "ub", descriptor = "[I")
    public int[] field2972;

    @OriginalMember(owner = "client!te", name = "lb", descriptor = "[Led;")
    public class29[] field2963;

    @OriginalMember(owner = "client!te", name = "mb", descriptor = "[Led;")
    public class29[] field2964;

    @OriginalMember(owner = "client!te", name = "ob", descriptor = "[[[B")
    public byte[][][] field2966;

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(II)La;", line = 25)
    public static final class1 method976(int arg0, int arg1) {
        field2956++;
        return arg0 > arg1 ? class48.method504(arg1, -1) : class37.field990;
    }

    @OriginalMember(owner = "client!te", name = "a", descriptor = "(III)V", line = 46)
    public static final void method977(int arg0, int arg1, int arg2) {
        field2958++;
        if (arg2 != 45) {
            field2965 = 53;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < 100; var4++) {
            if (class80.field2037[var4] != null) {
                int var5 = class132.field3239[var4];
                int var6 = class49.field1342 + 4 + 70 - var3 * 14;
                if (var6 < -20) {
                    break;
                }
                if (var5 == 0) {
                    var3++;
                }
                class1 var7 = class128.field3133[var4];
                if (var7 != null && var7.method26((byte) 116, class103.field2615)) {
                    var7 = var7.method1((byte) 95, 5);
                }
                if (var7 != null && var7.method26((byte) 116, class100.field2538)) {
                    var7 = var7.method1((byte) 95, 5);
                }
                if ((var5 == 1 || var5 == 2) && (var5 == 1 || class75.field1867 == 0 || class75.field1867 == 1 && class12.method243(var7, -32624))) {
                    if (arg1 > var6 - 14 && arg1 <= var6 && !var7.method5(class104.field2624.field87, 122)) {
                        class46.field1212++;
                        if (class37.field1005 >= 1) {
                            class34.method399(0, class38.field1039, 0, -501, 0, 28, class116.method959(arg2 ^ 0xFFFFFFE7, new class1[] { class53.field1396, var7 }));
                            class5.field210++;
                        }
                        class34.method399(0, class79.field1936, 0, -501, 0, 51, class116.method959(-82, new class1[] { class53.field1396, var7 }));
                        class34.method399(0, class52.field1367, 0, -501, 0, 45, class116.method959(-40, new class1[] { class53.field1396, var7 }));
                        class118.field2935++;
                    }
                    var3++;
                }
                if ((var5 == 3 || var5 == 7) && class5.field217 == 0 && (var5 == 7 || class6.field237 == 0 || class6.field237 == 1 && class12.method243(var7, -32624))) {
                    var3++;
                    if (arg1 > var6 - 14 && arg1 <= var6) {
                        class46.field1212++;
                        if (class37.field1005 >= 1) {
                            class5.field210++;
                            class34.method399(0, class38.field1039, 0, -501, 0, 28, class116.method959(arg2 + 60, new class1[] { class53.field1396, var7 }));
                        }
                        class34.method399(0, class79.field1936, 0, -501, 0, 51, class116.method959(arg2 ^ 0xFFFFFFB3, new class1[] { class53.field1396, var7 }));
                        class34.method399(0, class52.field1367, 0, -501, 0, 45, class116.method959(arg2 ^ 0xFFFFFFB7, new class1[] { class53.field1396, var7 }));
                        class118.field2935++;
                    }
                }
                if (var5 == 4 && (class115.field2831 == 0 || class115.field2831 == 1 && class12.method243(var7, -32624))) {
                    if (arg1 > var6 - 14 && arg1 <= var6) {
                        class128.field3144++;
                        class34.method399(0, class103.field2613, 0, arg2 ^ 0xFFFFFE26, 0, 26, class116.method959(-41, new class1[] { class53.field1396, var7 }));
                    }
                    var3++;
                }
                if ((var5 == 5 || var5 == 6) && class5.field217 == 0 && class6.field237 < 2) {
                    var3++;
                }
                if (var5 == 8 && (class115.field2831 == 0 || class115.field2831 == 1 && class12.method243(var7, -32624))) {
                    if (var6 - 14 < arg1 && arg1 <= var6) {
                        class34.method399(0, class54.field1435, 0, -501, 0, 46, class116.method959(arg2 - 108, new class1[] { class53.field1396, var7 }));
                        class80.field2010++;
                    }
                    var3++;
                }
            }
        }
    }

    @OriginalMember(owner = "client!te", name = "b", descriptor = "(B)V", line = 221)
    public static void method978(byte arg0) {
        field2960 = null;
        field2969 = null;
        field2971 = null;
        if (arg0 != 101) {
            method977(-62, -35, -55);
        }
        field2968 = null;
        field2954 = null;
    }
}
