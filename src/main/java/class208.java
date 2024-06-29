import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ss")
public class class208 {

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "I")
    public int field2934;

    @OriginalMember(owner = "client!ss", name = "e", descriptor = "Lui;")
    public static class375 field2937 = new class375("purple:", "lila:", "violet:", "roxo:");

    @OriginalMember(owner = "client!ss", name = "g", descriptor = "[I")
    public static int[] field2939 = new int[] { 2, 1, 1, 1, 2, 2, 2, 1, 3, 3, 3, 2, 0, 4, 0 };

    @OriginalMember(owner = "client!ss", name = "h", descriptor = "S")
    public static short field2940 = 320;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "I")
    public static int field2933;

    @OriginalMember(owner = "client!ss", name = "c", descriptor = "I")
    public static int field2935;

    @OriginalMember(owner = "client!ss", name = "d", descriptor = "I")
    public static int field2936;

    @OriginalMember(owner = "client!ss", name = "f", descriptor = "I")
    public static int field2938;

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(I)V", line = 3)
    public static void method1440(int arg0) {
        field2937 = null;
        field2939 = null;
        if (arg0 != 22145) {
            method1443((byte) -23, null);
        }
    }

    @OriginalMember(owner = "client!ss", name = "toString", descriptor = "()Ljava/lang/String;", line = 15)
    public final String toString() {
        field2933++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(II)V", line = 29)
    public static final void method1441(int arg0, int arg1) {
        class229 var2 = null;
        for (int var3 = arg0; var3 < arg1; var3++) {
            class206 var4 = class204.field2871[var3];
            if (var4 != null) {
                for (int var5 = 0; var5 < class285.field4248; var5++) {
                    for (int var6 = 0; var6 < class492.field7186; var6++) {
                        var2 = var4.method857(var6, var5, var2);
                        if (var2 != null) {
                            int var7 = var6 << class386.field5882;
                            int var8 = var5 << class386.field5882;
                            for (int var9 = var3 - 1; var9 >= 0; var9--) {
                                class206 var10 = class204.field2871[var9];
                                if (var10 != null) {
                                    int var11 = var4.method849(var6, var5) - var10.method849(var6, var5);
                                    int var12 = var4.method849(var6 + 1, var5) - var10.method849(var6 + 1, var5);
                                    int var13 = var4.method849(var6 + 1, var5 + 1) - var10.method849(var6 + 1, var5 + 1);
                                    int var14 = var4.method849(var6, var5 + 1) - var10.method849(var6, var5 + 1);
                                    var10.method844(var2, var7, (var11 + var12 + var13 + var14) / 4, var8, 0, false);
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(IZ)Ldl;", line = 94)
    public static final class48 method1442(int arg0, boolean arg1) {
        field2935++;
        if (arg1) {
            return null;
        }
        class48[] var2 = class220.method1488(arg1);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class48 var4 = var2[var3];
            if (var4.field671 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!ss", name = "a", descriptor = "(BLjava/lang/String;)V", line = 122)
    public static final void method1443(byte arg0, String arg1) {
        if (arg0 <= 104) {
            return;
        }
        field2938++;
        if (arg1 == null) {
            return;
        }
        if (arg1.startsWith("*")) {
            arg1 = arg1.substring(1);
        }
        String var2 = class414.method2512(arg1, (byte) -107);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < class189.field2653; var3++) {
            String var4 = class397.field6033[var3];
            if (var4.startsWith("*")) {
                var4 = var4.substring(1);
            }
            String var5 = class414.method2512(var4, (byte) 67);
            if (var5 != null && var5.equals(var2)) {
                class189.field2653--;
                for (int var6 = var3; var6 < class189.field2653; var6++) {
                    class397.field6033[var6] = class397.field6033[var6 + 1];
                    class442.field6573[var6] = class442.field6573[var6 + 1];
                    class323.field4985[var6] = class323.field4985[var6 + 1];
                    class300.field4435[var6] = class300.field4435[var6 + 1];
                    class344.field5391[var6] = class344.field5391[var6 + 1];
                    class26.field433[var6] = class26.field433[var6 + 1];
                }
                class370.field5673++;
                class475.field6921 = class485.field7086;
                class179.method1287(false, class501.field7480);
                class75.field1006.method625(class142.method951(-8, arg1), false);
                class75.field1006.method603(83, arg1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!ss", name = "<init>", descriptor = "(II)V", line = 188)
    public class208(int arg0, int arg1) {
        this.field2934 = arg0;
    }

    @OriginalMember(owner = "client!ss", name = "b", descriptor = "(I)V", line = 207)
    public static final void method1444(int arg0) {
        field2936++;
        int var1 = 0;
        for (int var2 = 0; var2 < class96.field1403; var2++) {
            for (int var3 = 0; var3 < class485.field7122; var3++) {
                if (class217.method1472((byte) -119, true, var1, var2, class380.field5802, var3)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
        if (arg0 != 28307) {
            method1441(-62, -119);
        }
    }
}
