import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tca")
public abstract class class185 extends class339 {

    @OriginalMember(owner = "client!tca", name = "e", descriptor = "I")
    public static int field2872;

    @OriginalMember(owner = "client!tca", name = "f", descriptor = "I")
    public static int field2873;

    @OriginalMember(owner = "client!tca", name = "g", descriptor = "I")
    public static int field2874;

    @OriginalMember(owner = "client!tca", name = "i", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!tca", name = "h", descriptor = "Lgj;")
    public static class662 field2875;

    @OriginalMember(owner = "client!tca", name = "b", descriptor = "(I)V", line = 6)
    public static final void method1374(int arg0) {
        field2874++;
        class289.method1845(0);
        if (arg0 <= 58) {
            field2876 = -13;
        }
        int var1 = class111.field1911.field6741.method4322((byte) 119);
        if (var1 == 2) {
            class356.method2197(class732.field10098, 100, true, class95.field1472, class108.field1697, 100);
        } else if (var1 == 3) {
            class689.method3865(class163.field2593, class95.field1472, class108.field1697, 104, 2, 2, class732.field10098, class484.field6552);
        }
        if (class111.field1911.field6741.method4321((byte) -126)) {
            class146.method1180(class558.field7896, 21047);
        }
        if (class95.field1472 != null) {
            class741.method4102(false);
        }
        class507.field6967 = class111.field1911.field6741.method4322((byte) 73) != 0;
        class618.field8597 = class111.field1911.field6741.method4321((byte) -123);
    }

    @OriginalMember(owner = "client!tca", name = "c", descriptor = "(I)V", line = 52)
    public static final void method1375(int arg0) {
        field2873++;
        try {
            if (class469.field6348 == 1) {
                int var1 = class500.field6844.method3237((byte) -68);
                if (var1 > 0 && class500.field6844.method3213(25542)) {
                    int var2 = var1 - class171.field2733;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class500.field6844.method3207(var2, -1);
                    return;
                }
                class500.field6844.method3234(-7);
                class500.field6844.method3205(2050635303);
                class217.field3199 = null;
                if (class11.field180 == null) {
                    class469.field6348 = 0;
                } else {
                    class469.field6348 = 2;
                }
                class736.field10168 = null;
            }
            if (class469.field6348 == 3) {
                int var3 = class500.field6844.method3237((byte) -68);
                if (var3 < class752.field10377 && class500.field6844.method3213(25542)) {
                    int var4 = class1.field6 + var3;
                    if (class752.field10377 < var4) {
                        var4 = class752.field10377;
                    }
                    class500.field6844.method3207(var4, -1);
                    return;
                }
                class469.field6348 = 0;
                class1.field6 = 0;
            }
        } catch (Exception var6) {
            var6.printStackTrace();
            class500.field6844.method3234(-7);
            class217.field3199 = null;
            class736.field10168 = null;
            class469.field6348 = 0;
            class676.field9431 = null;
            class11.field180 = null;
        }
        if (arg0 > -19) {
            field2876 = -112;
        }
    }

    @OriginalMember(owner = "client!tca", name = "d", descriptor = "(I)V", line = 118)
    public static void method1376(int arg0) {
        int var1 = 15 % ((-arg0 - 51) / 56);
        field2875 = null;
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(IIZII)V", line = 127)
    public static final void method1377(int arg0, int arg1, boolean arg2, int arg3, int arg4) {
        field2872++;
        int var5 = class152.field2495;
        if (var5 == 0) {
            return;
        }
        if (var5 == 1) {
            class739.field10196 = arg0;
            class521.field7069 = arg1;
            class152.field2495 = 2;
            class297.field4076 = arg3;
            class204.field3077 = arg4;
        } else if (var5 == 2) {
            if (arg3 > class297.field4076) {
                class297.field4076 = arg3;
            }
            if (class739.field10196 > arg0) {
                class739.field10196 = arg0;
            }
            if (arg1 > class521.field7069) {
                class521.field7069 = arg1;
            }
            if (class204.field3077 > arg4) {
                class204.field3077 = arg4;
            }
        } else if (!arg2) {
            field2875 = null;
        }
    }

    @OriginalMember(owner = "client!tca", name = "a", descriptor = "(B)Lbja;")
    public abstract class34 method1378(byte arg0);
}
