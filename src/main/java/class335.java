import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vk")
public class class335 {

    @OriginalMember(owner = "client!vk", name = "b", descriptor = "Laa;")
    public static class76 field5174 = new class76(36, 7);

    @OriginalMember(owner = "client!vk", name = "c", descriptor = "Z")
    public static boolean field5175 = true;

    @OriginalMember(owner = "client!vk", name = "f", descriptor = "[[I")
    public static int[][] field5178 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!vk", name = "d", descriptor = "I")
    public static int field5176 = 0;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "I")
    public static int field5173;

    @OriginalMember(owner = "client!vk", name = "e", descriptor = "Lok;")
    public static class74 field5177;

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(ILya;)V", line = 4)
    public static final void method2061(int arg0, class11 arg1) {
        field5173++;
        if (arg0 != Integer.MAX_VALUE) {
            method2061(81, null);
        }
        if (!(class448.field6610 >= 2 || class302.field4504) || class251.field3435 != null) {
            return;
        }
        String var2;
        if (class302.field4504 && class448.field6610 < 2) {
            var2 = class310.field4810 + class145.field2180.method2103(class30.field430, (byte) 34) + class203.field2970 + " ->";
        } else if (class80.field1107 && class49.field630.method1879(81, true) && class448.field6610 > 2) {
            var2 = class73.method513(arg0 - 2147483647, (class477) class154.field2334.field7365.field1736.field1736);
        } else {
            class477 var3 = (class477) class154.field2334.field7365.field1736;
            var2 = class73.method513(arg0 ^ Integer.MAX_VALUE, var3);
            int[] var4 = null;
            if (class219.method1383(var3.field7034, 37)) {
                var4 = class164.field2437.method1749((int) var3.field7030, -20230).field1147;
            } else if (var3.field7038 != -1) {
                var4 = class164.field2437.method1749(var3.field7038, arg0 ^ 0x80004F05).field1147;
            } else if (class26.method255(var3.field7034, arg0 + 2147483523)) {
                class351 var7 = class88.field1375[(int) var3.field7030];
                if (var7 != null) {
                    class277 var8 = var7.field5409;
                    if (var8.field4148 != null) {
                        var8 = var8.method1734((byte) -125, class307.field4619);
                    }
                    if (var8 != null) {
                        var4 = var8.field4195;
                    }
                }
            } else if (class310.method1943(var3.field7034, 1)) {
                Object var5 = null;
                class486 var6;
                if (var3.field7034 == 1011) {
                    var6 = class119.field1824.method248((int) var3.field7030, arg0 - 2147483617);
                } else {
                    var6 = class119.field1824.method248((int) (var3.field7030 >>> 32 & 0x7FFFFFFFL), 30);
                }
                if (var6.field7219 != null) {
                    var6 = var6.method2909((byte) 103, class307.field4619);
                }
                if (var6 != null) {
                    var4 = var6.field7227;
                }
            }
            if (var4 != null) {
                var2 = var2 + class428.method2538(-1, var4);
            }
        }
        if (class448.field6610 > 2) {
            var2 = var2 + "<col=ffffff> / " + (class448.field6610 - 2) + class226.field3196.method2103(class30.field430, (byte) 34);
        }
        if (class107.field1599 != null) {
            class307 var10 = class107.field1599.method1933(arg1, (byte) -60);
            if (var10 == null) {
                var10 = class345.field5325;
            }
            var10.method1909(class107.field1599.field4764, class280.field4231, class19.field292, class169.field2478, client.field7531, class107.field1599.field4662, class107.field1599.field4736, 31, class184.field2715, class107.field1599.field4661, var2, class179.field2652, class107.field1599.field4722, class107.field1599.field4663, class385.field5800);
            class490.method2924(client.field7531[3], client.field7531[1], client.field7531[2], client.field7531[0], 104);
        } else if (class84.field1339 != null && class488.field7276 == class251.field3433) {
            int var9 = class345.field5325.method1919(class385.field5800, 0, 16777215, var2, 1, class487.field7252 + 4, class179.field2652, class184.field2715, class300.field4450 + 16, class19.field292);
            class490.method2924(16, class300.field4450, var9 + class342.field5252.method2599(var2, (byte) 118), class487.field7252 + 4, 111);
            return;
        }
    }

    @OriginalMember(owner = "client!vk", name = "a", descriptor = "(I)V", line = 113)
    public static void method2062(int arg0) {
        field5178 = null;
        if (arg0 < 114) {
            method2061(115, null);
        }
        field5174 = null;
        field5177 = null;
    }
}
