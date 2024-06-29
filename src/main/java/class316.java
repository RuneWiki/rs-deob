import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ql")
public class class316 extends class163 {

    @OriginalMember(owner = "client!ql", name = "y", descriptor = "Z")
    public static boolean field5454 = false;

    @OriginalMember(owner = "client!ql", name = "r", descriptor = "I")
    public static int field5447;

    @OriginalMember(owner = "client!ql", name = "t", descriptor = "I")
    public static int field5449;

    @OriginalMember(owner = "client!ql", name = "w", descriptor = "I")
    public static int field5452;

    @OriginalMember(owner = "client!ql", name = "x", descriptor = "I")
    public int field5453;

    @OriginalMember(owner = "client!ql", name = "z", descriptor = "I")
    public static int field5455;

    @OriginalMember(owner = "client!ql", name = "A", descriptor = "I")
    public int field5456;

    @OriginalMember(owner = "client!ql", name = "v", descriptor = "Lla;")
    public static class188 field5451;

    @OriginalMember(owner = "client!ql", name = "u", descriptor = "Z")
    public static boolean field5450;

    @OriginalMember(owner = "client!ql", name = "s", descriptor = "[Lti;")
    public static class182[] field5448;

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lsk;)V", line = 12)
    public static final void method2199(class269 arg0) {
        for (int var1 = arg0.field4594; var1 <= arg0.field4597; var1++) {
            for (int var2 = arg0.field4587; var2 <= arg0.field4599; var2++) {
                class271 var3 = class41.field790[arg0.field4581][var1][var2];
                if (var3 != null) {
                    for (int var4 = 0; var4 < var3.field4641; var4++) {
                        if (var3.field4624[var4] == arg0) {
                            var3.field4641--;
                            for (int var5 = var4; var5 < var3.field4641; var5++) {
                                var3.field4624[var5] = var3.field4624[var5 + 1];
                                var3.field4627[var5] = var3.field4627[var5 + 1];
                            }
                            var3.field4624[var3.field4641] = null;
                            break;
                        }
                    }
                    var3.field4634 = 0;
                    for (int var6 = 0; var6 < var3.field4641; var6++) {
                        var3.field4634 |= var3.field4627[var6];
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(B)V", line = 80)
    public static void method2200(byte arg0) {
        field5448 = null;
        if (arg0 >= -33) {
            method2199((class269) null);
        }
        field5451 = null;
    }

    @OriginalMember(owner = "client!ql", name = "b", descriptor = "(III)I", line = 105)
    public static final int method2201(int arg0, int arg1, int arg2) {
        field5455++;
        int var3 = class141.method1036(arg1 + 91923, arg0, 1, arg2 + 45365) - (-(class141.method1036(arg1 + 37821, 2, 1, arg2 - -10294) + -128 >> 1) + -(class141.method1036(arg1, 1, arg0 + -3, arg2) + -128 >> 2)) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Ljava/lang/String;I)Lke;", line = 125)
    public static final class256 method2202(String arg0, int arg1) {
        field5452++;
        byte[] var2 = arg0.getBytes();
        if (arg1 != 27626) {
            field5451 = (class188) null;
        }
        int var3 = var2.length;
        class256 var4 = new class256();
        var4.field4380 = new byte[var3];
        int var5 = 0;
        while (var5 < var3) {
            int var6 = var2[var5++] & 0xFF;
            if (var6 <= 45 && var6 >= 40) {
                if (var3 <= var5) {
                    break;
                }
                int var7 = var2[var5++] & 0xFF;
                var4.field4380[var4.field4384++] = (byte) ((var6 - 40) * 43 + var7 - 48);
            } else if (var6 != 0) {
                var4.field4380[var4.field4384++] = (byte) var6;
            }
        }
        var4.method1763((byte) -123);
        return var4.method1787(-1);
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(Lke;I)V", line = 167)
    public static final void method2203(class256 arg0, int arg1) {
        field5449++;
        class281.field4882 = arg0;
        if (class272.field4658.field52 == null) {
            return;
        }
        try {
            class256 var2 = class273.field4729.method1798(122, class272.field4658.field52);
            int var3 = 123 / ((86 - arg1) / 39);
            class256 var4 = class97.field1736.method1798(99, class272.field4658.field52);
            class256 var5 = class30.method214(new class256[] { var2, class105.field1878, arg0, class122.field2136, var4 }, 29784);
            class256 var6;
            if (arg0.method1799(127) == 0) {
                var6 = class30.method214(new class256[] { var5, class264.field4541 }, 29784);
            } else {
                var6 = class30.method214(new class256[] { var5, class200.field3653, class236.method1586(32343, class224.method1536(false) + 94608000000L), class229.field3922, class41.method348(94608000L, true) }, 29784);
            }
            class30.method214(new class256[] { class96.field1717, var6, class23.field309 }, 29784).method1762(117, class272.field4658.field52);
        } catch (Throwable var8) {
        }
    }

    @OriginalMember(owner = "client!ql", name = "a", descriptor = "(IIIII)V", line = 201)
    public static final void method2204(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field5447++;
        class77 var5 = class156.method1158(8, false, arg1);
        var5.method584(22992);
        int var6 = -108 / ((56 - arg4) / 52);
        var5.field1453 = arg2;
        var5.field1455 = arg0;
        var5.field1459 = arg3;
    }
}
