import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class183 {

    @OriginalMember(owner = "client!sba", name = "g", descriptor = "[I")
    public static int[] field2587 = new int[] { 0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4 };

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!sba", name = "c", descriptor = "I")
    public static int field2583;

    @OriginalMember(owner = "client!sba", name = "d", descriptor = "I")
    public int field2584;

    @OriginalMember(owner = "client!sba", name = "h", descriptor = "Lao;")
    public static class240 field2588;

    @OriginalMember(owner = "client!sba", name = "b", descriptor = "Lsf;")
    public class446 field2582;

    @OriginalMember(owner = "client!sba", name = "e", descriptor = "[I")
    public static int[] field2585;

    @OriginalMember(owner = "client!sba", name = "f", descriptor = "[I")
    public int[] field2586;

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(I)V")
    public static void method1143(int arg0) {
        field2585 = null;
        field2587 = null;
        if (arg0 != 4) {
            field2588 = null;
        }
        field2588 = null;
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(IIII)I")
    public static final int method1144(int arg0, int arg1, int arg2, int arg3) {
        field2581++;
        if (class590.field8430 == null) {
            return 0;
        }
        int var4 = arg1 >> 7;
        int var5 = arg2 >> 7;
        if (var4 < 0 || var5 < 0 || (class32.field513 - 1) < var4 || var5 > class611.field8786 - 1) {
            return 0;
        }
        int var6 = arg3;
        if (arg3 < 3 && (class80.field1299[1][var4][var5] & 0x2) != 0) {
            var6 = arg3 + 1;
        }
        if (arg0 <= 75) {
            field2587 = null;
        }
        return class590.field8430[var6].method1105(arg1, arg2);
    }

    @OriginalMember(owner = "client!sba", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public static final void method1145(String arg0, int arg1) {
        field2583++;
        if (arg0 == null) {
            return;
        }
        if (!(class367.field4989 < 100 || class310.field4179) || class367.field4989 >= 200) {
            class176.method1116(class430.field6126.method739(class173.field2491, 89), true);
            return;
        }
        String var2 = class366.method2198(arg0, -126);
        if (var2 == null) {
            return;
        }
        for (int var3 = arg1; var3 < class367.field4989; var3++) {
            String var7 = class366.method2198(class474.field6677[var3], arg1 - 127);
            if (var7 != null && var7.equals(var2)) {
                class176.method1116(arg0 + class388.field5230.method739(class173.field2491, -55), true);
                return;
            }
            if (class326.field4381[var3] != null) {
                String var8 = class366.method2198(class326.field4381[var3], arg1 ^ 0xFFFFFF82);
                if (var8 != null && var8.equals(var2)) {
                    class176.method1116(arg0 + class388.field5230.method739(class173.field2491, arg1 + 79), true);
                    return;
                }
            }
        }
        for (int var4 = 0; var4 < class536.field7488; var4++) {
            String var5 = class366.method2198(class645.field9370[var4], -128);
            if (var5 != null && var5.equals(var2)) {
                class176.method1116(class556.field7670.method739(class173.field2491, -73) + arg0 + class181.field2572.method739(class173.field2491, 81), true);
                return;
            }
            if (class634.field9272[var4] != null) {
                String var6 = class366.method2198(class634.field9272[var4], -126);
                if (var6 != null && var6.equals(var2)) {
                    class176.method1116(class556.field7670.method739(class173.field2491, -87) + arg0 + class181.field2572.method739(class173.field2491, -49), true);
                    return;
                }
            }
        }
        if (class366.method2198(class645.field9372.field2630, -126).equals(var2)) {
            class176.method1116(class442.field6290.method739(class173.field2491, 120), true);
        } else {
            class351.method2108(class48.field926, -10511);
            class425.field6044++;
            class479.field6754.method108((byte) -128, class452.method2655(-77, arg0));
            class479.field6754.method74(arg0, 0);
        }
    }
}
