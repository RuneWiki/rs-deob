import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class110 extends class714 {

    @OriginalMember(owner = "client!lca", name = "u", descriptor = "I")
    public int field1560;

    @OriginalMember(owner = "client!lca", name = "p", descriptor = "I")
    public int field1555;

    @OriginalMember(owner = "client!lca", name = "n", descriptor = "Lmaa;")
    public static class461 field1553 = new class461();

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "Ljava/lang/String;")
    public static String field1563 = "";

    @OriginalMember(owner = "client!lca", name = "o", descriptor = "I")
    public static int field1554;

    @OriginalMember(owner = "client!lca", name = "q", descriptor = "I")
    public static int field1556;

    @OriginalMember(owner = "client!lca", name = "r", descriptor = "I")
    public static int field1557;

    @OriginalMember(owner = "client!lca", name = "s", descriptor = "I")
    public static int field1558;

    @OriginalMember(owner = "client!lca", name = "t", descriptor = "I")
    public static int field1559;

    @OriginalMember(owner = "client!lca", name = "v", descriptor = "I")
    public static int field1561;

    @OriginalMember(owner = "client!lca", name = "w", descriptor = "I")
    public static int field1562;

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(Lmp;Lfe;IIIIIIIIII)V", line = 5)
    public class110(class565 arg0, class345 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        super(arg0, arg1, arg2, arg3, arg4, arg5, arg6, arg7, arg8);
        this.field1560 = arg11;
        this.field1555 = arg10;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)V", line = 23)
    public static final void method874(int arg0) {
        field1557++;
        int var1 = class469.field6382;
        int[] var2 = class464.field6311;
        for (int var3 = 0; var3 < var1; var3++) {
            class21 var10 = class588.field8451[var2[var3]];
            if (var10 != null && var10.field4102 > 0) {
                var10.field4102--;
                if (var10.field4102 == 0) {
                    var10.field4069 = null;
                }
            }
        }
        int var4 = 86 / ((-arg0 - 65) / 39);
        for (int var5 = 0; var5 < class657.field9270; var5++) {
            long var6 = (long) class350.field4963[var5];
            class647 var8 = (class647) class486.field6697.method4253(var6, -1);
            if (var8 != null) {
                class506 var9 = var8.field9191;
                if (var9.field4102 > 0) {
                    var9.field4102--;
                    if (var9.field4102 == 0) {
                        var9.field4069 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Lbn;I)Z", line = 81)
    public static final boolean method875(class517 arg0, int arg1) {
        if (arg1 != -1) {
            field1563 = null;
        }
        field1562++;
        return class547.field7574 == arg0 || class210.field3079 == arg0 || class121.field2060 == arg0 || class583.field8378 == arg0;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V", line = 93)
    public static void method876(byte arg0) {
        if (arg0 != -114) {
            field1553 = null;
        }
        field1563 = null;
        field1553 = null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(B)Lhl;", line = 105)
    public final class353 method327(byte arg0) {
        field1559++;
        return arg0 <= 51 ? null : class104.field1515;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V", line = 120)
    public static final void method877(int arg0) {
        if (arg0 <= 32) {
            field1563 = null;
        }
        field1556++;
        for (class551 var1 = (class551) class496.field6807.method249(18371); var1 != null; var1 = (class551) class496.field6807.method254((byte) -64)) {
            if (var1.field7643 > 1) {
                var1.field7643 = 0;
                class359.field5083.method2890(-7307, ((class554) var1.field7645.field332.field6213).field7680, var1);
                var1.field7645.method253((byte) -18);
            }
        }
        class624.field8863 = 0;
        class81.field1197 = 0;
        class521.field7310.method3735(-4676);
        class6.field76.method4249((byte) 79);
        class496.field6807.method253((byte) -18);
        class780.method4284(class122.field2072, 2);
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIZII)V", line = 154)
    public static final void method878(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5) {
        int var8 = arg2 + 1;
        class379.method2284(arg4, arg1, class74.field1144[arg2], arg0, 2);
        field1561++;
        int var9 = arg5 - 1;
        class379.method2284(arg4, arg1, class74.field1144[arg5], arg0, 2);
        int var6 = var8;
        if (!arg3) {
            field1553 = null;
        }
        while (var6 <= var9) {
            int[] var7 = class74.field1144[var6];
            var7[arg4] = var7[arg1] = arg0;
            var6++;
        }
    }
}
