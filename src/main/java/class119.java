import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class119 extends class35 {

    @OriginalMember(owner = "client!jj", name = "u", descriptor = "[I")
    public static int[] field2075 = new int[2];

    @OriginalMember(owner = "client!jj", name = "x", descriptor = "Lmg;")
    public static class113 field2078 = null;

    @OriginalMember(owner = "client!jj", name = "w", descriptor = "Ljava/lang/String;")
    public static String field2077 = "K";

    @OriginalMember(owner = "client!jj", name = "t", descriptor = "I")
    public static int field2074 = 0;

    @OriginalMember(owner = "client!jj", name = "z", descriptor = "I")
    public static int field2080 = -1;

    @OriginalMember(owner = "client!jj", name = "o", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!jj", name = "p", descriptor = "I")
    public int field2070;

    @OriginalMember(owner = "client!jj", name = "r", descriptor = "I")
    public static int field2072;

    @OriginalMember(owner = "client!jj", name = "s", descriptor = "I")
    public static int field2073;

    @OriginalMember(owner = "client!jj", name = "v", descriptor = "I")
    public int field2076;

    @OriginalMember(owner = "client!jj", name = "y", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!jj", name = "A", descriptor = "I")
    public int field2081;

    @OriginalMember(owner = "client!jj", name = "q", descriptor = "Z")
    public static boolean field2071;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZBIII)V", line = 14)
    public static final void method777(boolean arg0, byte arg1, int arg2, int arg3, int arg4) {
        class274.field4205 = 0L;
        field2079++;
        if (arg1 <= 5) {
            return;
        }
        int var5 = class241.method1595(2);
        if (arg3 == 3 || var5 == 3) {
            arg0 = true;
        }
        if (class124.field2140.startsWith("mac") && arg3 > 0) {
            arg0 = true;
        }
        boolean var6 = false;
        if (var5 <= 0 != arg3 <= 0) {
            var6 = true;
        }
        if (arg0 && arg3 > 0) {
            var6 = true;
        }
        class318.method2189(arg4, var6, var5, 9977, arg3, arg0, arg2);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(ZI)V", line = 44)
    public static final void method778(boolean arg0, int arg1) {
        field2072++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            class305.method2022(2);
        } else if (arg1 == 2) {
            class263.method1754(-22223);
        } else if (arg1 == 3) {
            class328.method2276(241);
        } else {
            throw new RuntimeException();
        }
        if (!arg0) {
            method778(false, 8);
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIIIIII)V", line = 85)
    public static final void method779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2073++;
        class68 var7 = class233.method1548((byte) 49, arg0, arg2);
        if (var7 != null && var7.field1443 != null) {
            class106 var8 = new class106();
            var8.field1841 = var7.field1443;
            var8.field1823 = var7;
            class156.method1008(true, var8);
        }
        class183.field2934 = arg3;
        class86.field1617 = true;
        if (arg4 != 0) {
            field2080 = 35;
        }
        class6.field135 = arg2;
        class333.field5113 = arg0;
        class268.field4140 = arg5;
        class18.field331 = arg1;
        class81.field1581 = arg6;
        class317.method2183((byte) -7, var7);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(I)V", line = 117)
    public static void method780(int arg0) {
        field2078 = null;
        if (arg0 == 2) {
            field2075 = null;
            field2077 = null;
        }
    }
}
