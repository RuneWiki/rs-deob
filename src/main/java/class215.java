import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ida")
public class class215 {

    @OriginalMember(owner = "client!ida", name = "d", descriptor = "I")
    public static int field2610 = 1338;

    @OriginalMember(owner = "client!ida", name = "e", descriptor = "Lkfa;")
    public static class549 field2611 = new class549(51, 2);

    @OriginalMember(owner = "client!ida", name = "i", descriptor = "Z")
    public static boolean field2615 = false;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "I")
    public static int field2607;

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "I")
    public static int field2608;

    @OriginalMember(owner = "client!ida", name = "c", descriptor = "I")
    public static int field2609;

    @OriginalMember(owner = "client!ida", name = "f", descriptor = "I")
    public static int field2612;

    @OriginalMember(owner = "client!ida", name = "h", descriptor = "I")
    public static int field2614;

    @OriginalMember(owner = "client!ida", name = "g", descriptor = "Llp;")
    public static class355 field2613;

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(BII)I")
    public final int method1281(byte arg0, int arg1, int arg2) {
        field2612++;
        if (arg0 != -109) {
            method1284(67);
        }
        int var4 = class399.field5336 > arg1 ? class399.field5336 : arg1;
        if (class427.field5671 == this) {
            return 0;
        } else if (class260.field3304 == this) {
            return var4 - arg2;
        } else if (class224.field2836 == this) {
            return (var4 - arg2) / 2;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(B)V")
    public static void method1282(byte arg0) {
        if (arg0 >= -91) {
            field2613 = null;
        }
        field2611 = null;
        field2613 = null;
    }

    @OriginalMember(owner = "client!ida", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field2607++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!ida", name = "a", descriptor = "(I)V")
    public static final void method1283(int arg0) {
        field2608++;
        if (arg0 != 10208) {
            field2611 = null;
        }
        for (class248 var1 = (class248) class582.field8274.method3174((byte) 49); var1 != null; var1 = (class248) class582.field8274.method3168(false)) {
            class178 var2 = var1.field3192;
            if (var2.field2187 < class469.field6549) {
                var1.method1519((byte) 121);
                var2.method1048(108);
            } else if (class469.field6549 >= var2.field2184) {
                if (var2.field2185 > 0) {
                    class443 var3 = (class443) class392.field5223.method3234((byte) -70, (long) (var2.field2185 - 1));
                    if (var3 != null) {
                        class625 var4 = var3.field6107;
                        if (var4.field4641 >= 0 && var4.field4641 < (class399.field5338 * 512) && var4.field4647 >= 0 && class349.field4567 * 512 > var4.field4647) {
                            var2.method1054(var4.field4641, class469.field6549, class363.method1995(var2.field4638, var4.field4647, -1327568407, var4.field4641) - var2.field2204, arg0 ^ 0xFFFFD875, var4.field4647);
                        }
                    }
                }
                if (var2.field2185 < 0) {
                    int var5 = -var2.field2185 - 1;
                    class455 var6;
                    if (class90.field1038 == var5) {
                        var6 = class377.field4914;
                    } else {
                        var6 = class362.field4726[var5];
                    }
                    if (var6 != null && var6.field4641 >= 0 && class399.field5338 * 512 > var6.field4641 && var6.field4647 >= 0 && var6.field4647 < class349.field4567 * 512) {
                        var2.method1054(var6.field4641, class469.field6549, class363.method1995(var2.field4638, var6.field4647, -1327568407, var6.field4641) - var2.field2204, -90, var6.field4647);
                    }
                }
                var2.method1050(class233.field2978, 0);
                class223.method1309(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!ida", name = "b", descriptor = "(I)V")
    public static final void method1284(int arg0) {
        field2609++;
        int var1 = 87 % ((arg0 - 71) / 48);
        class530 var2 = class242.method1402(-28, 15, 0);
        var2.method3027((byte) -88);
    }
}
