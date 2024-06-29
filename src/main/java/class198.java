import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wi")
public abstract class class198 {

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "[I")
    public static int[] field2969 = new int[8];

    @OriginalMember(owner = "client!wi", name = "d", descriptor = "I")
    public static int field2972 = -1;

    @OriginalMember(owner = "client!wi", name = "f", descriptor = "I")
    public static int field2974 = 0;

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "Lma;")
    public static class5 field2970 = class273.method1927((byte) 114);

    @OriginalMember(owner = "client!wi", name = "g", descriptor = "[I")
    public static int[] field2975 = new int[14];

    @OriginalMember(owner = "client!wi", name = "k", descriptor = "J")
    public static long field2979 = 0L;

    @OriginalMember(owner = "client!wi", name = "j", descriptor = "[Ljava/lang/String;")
    public static String[] field2978 = new String[1000];

    @OriginalMember(owner = "client!wi", name = "i", descriptor = "I")
    public static int field2977 = -1;

    @OriginalMember(owner = "client!wi", name = "c", descriptor = "I")
    public static int field2971;

    @OriginalMember(owner = "client!wi", name = "e", descriptor = "I")
    public static int field2973;

    @OriginalMember(owner = "client!wi", name = "h", descriptor = "I")
    public static int field2976;

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(Ltd;Lhm;B)Ljf;", line = 12)
    public static final class86 method1361(class192 arg0, class88 arg1, byte arg2) {
        field2971++;
        if (arg2 != 90) {
            return (class86) null;
        }
        long var3 = ((long) arg1.field1308 << 32) + (((long) arg1.field1298 << 56) - (long) (-(arg1.field1300 + 1 << 16) - arg1.field1303));
        class86 var5 = (class86) arg0.method1320(var3, 13002);
        if (var5 == null) {
            var5 = new class86(arg1.field1300, (float) arg1.field1303, true, false, arg1.field1308);
            arg0.method1319(-79, var3, var5);
        }
        return var5;
    }

    @OriginalMember(owner = "client!wi", name = "b", descriptor = "(I)V", line = 39)
    public static void method1362(int arg0) {
        field2978 = null;
        field2969 = null;
        field2970 = null;
        field2975 = null;
        if (arg0 != 15429536) {
            method1362(0);
        }
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(IZ)V", line = 58)
    public static final void method1363(int arg0, boolean arg1) {
        client.field1952 = (byte[][][]) null;
        class123.field1930 = (byte[][][]) null;
        class221.field3369 = 0;
        class255.field3854 = (int[][][]) null;
        class203.field3034 = (int[][][]) null;
        class135.field2058 = (int[][][]) null;
        class94.field1430 = null;
        field2973++;
        class241.field3595 = null;
        class142.field2157 = (byte[][][]) null;
        if (arg1 && class9.field71 != null) {
            class246.field3670 = class9.field71.field814;
        } else {
            class246.field3670 = null;
        }
        class9.field71 = null;
        class317.field4780 = (byte[][][]) null;
        class205.field3099 = (byte[][][]) null;
        class113.field1737.method1113((byte) 79);
        class320.field4846 = null;
        class155.field2325 = null;
        class176.field2601 = null;
        class184.field2758 = null;
        class258.field3899 = null;
        class305.field4644 = null;
        class284.field4294 = null;
        class205.field3101 = null;
        class169.field2529 = null;
        class259.field3942 = null;
        class204.field3070 = -1;
        class293.field4492 = null;
        class154.field2321 = arg0;
    }

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(III)I")
    public abstract int method1359(int arg0, int arg1, int arg2);

    @OriginalMember(owner = "client!wi", name = "a", descriptor = "(I)V")
    public abstract void method1360(int arg0);
}
