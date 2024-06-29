import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mg")
public class class105 {

    @OriginalMember(owner = "client!mg", name = "e", descriptor = "[I")
    public static int[] field1888 = new int[200];

    @OriginalMember(owner = "client!mg", name = "b", descriptor = "[[I")
    public static int[][] field1885 = new int[104][104];

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "I")
    public static int field1884;

    @OriginalMember(owner = "client!mg", name = "c", descriptor = "I")
    public static int field1886;

    @OriginalMember(owner = "client!mg", name = "d", descriptor = "I")
    public int field1887;

    @OriginalMember(owner = "client!mg", name = "f", descriptor = "I")
    public static int field1889;

    @OriginalMember(owner = "client!mg", name = "g", descriptor = "I")
    public static int field1890;

    @OriginalMember(owner = "client!mg", name = "h", descriptor = "I")
    public static int field1891;

    @OriginalMember(owner = "client!mg", name = "j", descriptor = "Lkk;")
    public static class112 field1893;

    @OriginalMember(owner = "client!mg", name = "i", descriptor = "Loh;")
    public class258 field1892;

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(I)V", line = 6)
    public static void method786(int arg0) {
        field1888 = null;
        field1885 = (int[][]) null;
        if (arg0 != -20569) {
            method788(-47, -87);
        }
        field1893 = null;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(IB)I", line = 22)
    public static final int method787(int arg0, byte arg1) {
        field1889++;
        if (arg0 == 16711935) {
            return -1;
        } else {
            if (arg1 != -62) {
                method786(-47);
            }
            return class27.method208(arg0, -3);
        }
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(II)Lve;", line = 46)
    public static final class256 method788(int arg0, int arg1) {
        int var2 = -29 / ((65 - arg0) / 35);
        field1884++;
        class256 var3 = (class256) class225.field3852.method701((long) arg1, 1);
        if (var3 != null) {
            return var3;
        }
        byte[] var4 = class293.field5031.method1453(5, (byte) -31, arg1);
        class256 var5 = new class256();
        if (var4 != null) {
            var5.method1724(new class235(var4), (byte) -94);
        }
        class225.field3852.method698((long) arg1, (byte) 86, var5);
        return var5;
    }

    @OriginalMember(owner = "client!mg", name = "a", descriptor = "(ILoh;)I", line = 95)
    public static final int method789(int arg0, class258 arg1) {
        if (arg0 < 69) {
            return 18;
        }
        field1886++;
        for (int var2 = 0; var2 < class61.field1013.length; var2++) {
            if (class61.field1013[var2].method1778(-11925, arg1)) {
                return var2;
            }
        }
        return -1;
    }
}
