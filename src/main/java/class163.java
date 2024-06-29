import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ng")
public class class163 {

    @OriginalMember(owner = "client!ng", name = "c", descriptor = "F")
    public static float field2110 = 1024.0F;

    @OriginalMember(owner = "client!ng", name = "f", descriptor = "F")
    public static float field2113 = 0.25F;

    @OriginalMember(owner = "client!ng", name = "h", descriptor = "[Ljava/lang/String;")
    public static String[] field2115 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "I")
    public static int field2109;

    @OriginalMember(owner = "client!ng", name = "d", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!ng", name = "e", descriptor = "I")
    public static int field2112;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "Lv;")
    public static class455 field2108;

    @OriginalMember(owner = "client!ng", name = "g", descriptor = "[[B")
    public static byte[][] field2114;

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(Z)V", line = 5)
    public static final void method1080(boolean arg0) {
        field2112++;
        if (class237.field3088) {
            return;
        }
        if (arg0) {
            field2110 = 0.9502695F;
        }
        class259.method1619(0, class188.field2468);
        if (class354.field4550 != null) {
            class259.method1619(0, class354.field4550);
        }
        class237.field3088 = true;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIILrr;Lrr;)V", line = 30)
    public static final void method1081(int arg0, int arg1, int arg2, class303 arg3, class303 arg4) {
        class510 var5 = class478.method2870(arg0, arg1, arg2);
        if (var5 != null) {
            var5.field7485 = arg3;
            var5.field7497 = arg4;
        }
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(B)V", line = 39)
    public static void method1082(byte arg0) {
        field2115 = null;
        if (arg0 != -74) {
            method1084(true);
        }
        field2108 = null;
        field2114 = null;
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IB)I", line = 53)
    public static final int method1083(int arg0, byte arg1) {
        field2111++;
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            int var2 = 2 % ((arg1 - 43) / 43);
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!ng", name = "b", descriptor = "(Z)V", line = 91)
    public static final void method1084(boolean arg0) {
        field2109++;
        if (class65.field821 == 10 || class65.field821 == 28) {
            class423.method2497(class299.field3885 >> 10, 21035, 5000, class291.field3724 >> 10);
        } else {
            int var1 = class37.field573.field5246[0] >> 3;
            int var2 = class37.field573.field5251[0] >> 3;
            if (var1 >= 0 && class200.field2594 >> 3 > var1 && var2 >= 0 && var2 < (class118.field1647 >> 3)) {
                class423.method2497(var1, 21035, 5000, var2);
            } else {
                class423.method2497(class200.field2594 >> 4, 21035, 0, class118.field1647 >> 4);
            }
        }
        class118.method757((byte) 117);
        class96.method661((byte) -69);
        if (!arg0) {
            field2114 = null;
        }
        class224.method1426(76);
        class499.method2987(110);
    }

    @OriginalMember(owner = "client!ng", name = "a", descriptor = "(IIIIII)Z", line = 123)
    public static final boolean method1085(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class180.field2347[arg0][var8][var14] == -class206.field2685) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class169.field2206) + 1;
            int var10 = (arg3 << class169.field2206) + 2;
            int var11 = class92.field1285[arg0].method1187(arg1, arg3) + arg5;
            if (!class300.method1801(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class169.field2206) - 1;
            if (!class300.method1801(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class169.field2206) - 1;
            if (!class300.method1801(var9, var11, var13)) {
                return false;
            } else if (class300.method1801(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class60.method340(arg0, arg1, arg3)) {
            int var6 = arg1 << class169.field2206;
            int var7 = arg3 << class169.field2206;
            return class300.method1801(var6 + 1, class92.field1285[arg0].method1187(arg1, arg3) + arg5, var7 + 1) && class300.method1801(class286.field3658 + var6 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg3) + arg5, var7 + 1) && class300.method1801(class286.field3658 + var6 - 1, class92.field1285[arg0].method1187(arg1 + 1, arg3 + 1) + arg5, class286.field3658 + var7 - 1) && class300.method1801(var6 + 1, class92.field1285[arg0].method1187(arg1, arg3 + 1) + arg5, class286.field3658 + var7 - 1);
        } else {
            return false;
        }
    }
}
