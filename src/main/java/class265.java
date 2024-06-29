import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class265 {

    @OriginalMember(owner = "client!pj", name = "i", descriptor = "I")
    public static int field4194 = -1;

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "Ljava/lang/String;")
    public static String field4189 = "glow1:";

    @OriginalMember(owner = "client!pj", name = "b", descriptor = "Ljava/lang/String;")
    public static String field4187 = "Loaded wordpack";

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!pj", name = "g", descriptor = "I")
    public int field4192;

    @OriginalMember(owner = "client!pj", name = "h", descriptor = "I")
    public static int field4193;

    @OriginalMember(owner = "client!pj", name = "j", descriptor = "I")
    public static int field4195;

    @OriginalMember(owner = "client!pj", name = "f", descriptor = "Lub;")
    public static class92 field4191;

    @OriginalMember(owner = "client!pj", name = "k", descriptor = "Lub;")
    public static class92 field4196;

    @OriginalMember(owner = "client!pj", name = "e", descriptor = "Ljava/lang/String;")
    public String field4190;

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Ljava/lang/String;I)V")
    public static final void method1777(String arg0, int arg1, String arg2, String arg3, int arg4) {
        if (arg1 != 6705) {
            field4191 = null;
        }
        field4188++;
        class296.method1972(arg2, -1, arg0, -128, arg4, arg3);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(I)V")
    public static void method1778(int arg0) {
        field4191 = null;
        if (arg0 != -740574905) {
            method1779((byte) -119, -116);
        }
        field4189 = null;
        field4196 = null;
        field4187 = null;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BI)I")
    public static final int method1779(byte arg0, int arg1) {
        field4186++;
        if (arg1 < 0) {
            return 0;
        }
        class198 var2 = (class198) class94.field1480.method2043((long) arg1, -1);
        if (var2 == null) {
            return class266.method1782(arg1, 118).field3742;
        }
        int var3 = 0;
        for (int var4 = 0; var4 < var2.field3086.length; var4++) {
            if (var2.field3086[var4] == -1) {
                var3++;
            }
        }
        int var5 = -68 / ((arg0 - 43) / 43);
        return var3 + (class266.method1782(arg1, 101).field3742 - var2.field3086.length);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BIIIIII)V")
    public static final void method1780(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field4195++;
        if (arg0 >= -35) {
            method1778(-5);
        }
        class173[] var7 = class136.field2053;
        for (int var8 = 0; var8 < var7.length; var8++) {
            class173 var9 = var7[var8];
            if (var9 != null && var9.field2670 == 2) {
                class284.method1914((var9.field2667 - class159.field2379 << 7) + var9.field2672, arg1, arg6, (var9.field2661 - class138.field2072 << 7) + var9.field2656, arg2 >> 1, 0, arg4 >> 1, var9.field2675 * 2);
                if (class106.field1663 > -1 && (class41.field686 % 20) < 10) {
                    class15.field198[var9.field2662].method425(arg3 + class106.field1663 - 12, arg5 + -28 + class182.field2869);
                }
            }
        }
    }
}
