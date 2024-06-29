import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lh")
public class class320 extends class135 {

    @OriginalMember(owner = "client!lh", name = "x", descriptor = "Z")
    public static boolean field4962 = false;

    @OriginalMember(owner = "client!lh", name = "y", descriptor = "I")
    public static int field4963 = 0;

    @OriginalMember(owner = "client!lh", name = "D", descriptor = "I")
    public static volatile int field4967 = 0;

    @OriginalMember(owner = "client!lh", name = "v", descriptor = "I")
    public static int field4960;

    @OriginalMember(owner = "client!lh", name = "w", descriptor = "I")
    public static int field4961;

    @OriginalMember(owner = "client!lh", name = "z", descriptor = "I")
    public static int field4964;

    @OriginalMember(owner = "client!lh", name = "A", descriptor = "I")
    public static int field4965;

    @OriginalMember(owner = "client!lh", name = "E", descriptor = "I")
    public static int field4968;

    @OriginalMember(owner = "client!lh", name = "F", descriptor = "I")
    public static int field4969;

    @OriginalMember(owner = "client!lh", name = "H", descriptor = "I")
    public static int field4971;

    @OriginalMember(owner = "client!lh", name = "I", descriptor = "I")
    public static int field4972;

    @OriginalMember(owner = "client!lh", name = "J", descriptor = "I")
    public static int field4973;

    @OriginalMember(owner = "client!lh", name = "B", descriptor = "Li;")
    public static class15 field4966;

    @OriginalMember(owner = "client!lh", name = "G", descriptor = "[Lbf;")
    public static class58[] field4970;

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(B)V", line = 6)
    public static void method2247(byte arg0) {
        field4970 = null;
        field4966 = null;
        if (arg0 <= 32) {
            field4963 = 17;
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BI)V", line = 18)
    public static final void method2248(byte arg0, int arg1) {
        field4964++;
        class111 var2 = (class111) class76.field1064.method451((long) arg1, (byte) 100);
        if (var2 == null) {
            return;
        }
        for (int var3 = 0; var3 < var2.field1644.length; var3++) {
            var2.field1644[var3] = -1;
            var2.field1643[var3] = 0;
        }
        if (arg0 != 93) {
            method2250((byte) 0, (String) null);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BIIII)V", line = 43)
    public static final void method2249(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4971++;
        if (arg0 != 49) {
            field4966 = (class15) null;
        }
        if (arg4 <= arg1) {
            class80.method545(arg2, arg0 ^ 0xFFFFFF81, arg1, arg4, class281.field4523[arg3]);
        } else {
            class80.method545(arg2, arg0 ^ 0xFFFFFFF3, arg4, arg1, class281.field4523[arg3]);
        }
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(BLjava/lang/String;)Ljava/lang/String;", line = 65)
    public static final String method2250(byte arg0, String arg1) {
        if (arg0 != -76) {
            return (String) null;
        }
        String var2 = class13.method74(61, class204.method1491(-26916, arg1));
        field4965++;
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(BI)V", line = 81)
    public static final void method2251(byte arg0, int arg1) {
        field4973++;
        class202.field3307.method708(arg1, true);
        int var2 = 55 / ((arg0 - 74) / 43);
    }

    @OriginalMember(owner = "client!lh", name = "a", descriptor = "(Log;I)V", line = 92)
    public static final void method2252(class157 arg0, int arg1) {
        if (arg1 != 0) {
            field4967 = -99;
        }
        if (class42.field539 == arg0.field2450) {
            class174.field2884[arg0.field2512] = true;
        }
        field4961++;
    }

    @OriginalMember(owner = "client!lh", name = "c", descriptor = "(B)V", line = 112)
    public static final void method2253(byte arg0) {
        field4968++;
        if (class64.field930 || class122.field1909 == 2) {
            return;
        }
        try {
            class308.method2181("tbrefresh", 32627, class341.field5296);
        } catch (Throwable var2) {
        }
        if (arg0 < 64) {
            method2254(87, -77);
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(II)V", line = 139)
    public static final void method2254(int arg0, int arg1) {
        field4972++;
        class25.field337.method708(arg1, true);
        if (arg0 != 0) {
            field4963 = -24;
        }
    }

    @OriginalMember(owner = "client!lh", name = "b", descriptor = "(Z)V", line = 159)
    public static final void method2255(boolean arg0) {
        field4969++;
        for (int var1 = 0; var1 < 100; var1++) {
            class174.field2884[var1] = true;
        }
        if (!arg0) {
            method2254(67, -105);
        }
    }
}
