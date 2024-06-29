import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ofa")
public class class349 {

    @OriginalMember(owner = "client!ofa", name = "h", descriptor = "I")
    public static int field4358 = 0;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "F")
    public static float field4351;

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "I")
    public static int field4352;

    @OriginalMember(owner = "client!ofa", name = "c", descriptor = "I")
    public static int field4353;

    @OriginalMember(owner = "client!ofa", name = "e", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!ofa", name = "f", descriptor = "I")
    public static int field4356;

    @OriginalMember(owner = "client!ofa", name = "g", descriptor = "I")
    public static int field4357;

    @OriginalMember(owner = "client!ofa", name = "d", descriptor = "[I")
    public static int[] field4354;

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(B)Ljca;", line = 6)
    public static final class714 method2066(byte arg0) {
        field4356++;
        if (arg0 < 36) {
            method2068(25, -53, 66, 70, -71, -18, 64, -63);
        }
        class714 var1 = (class714) class90.field1205.method1003((byte) 53);
        if (var1 != null) {
            var1.method2219(13630);
            var1.method1088(4);
            return var1;
        }
        class714 var2;
        do {
            var2 = (class714) class656.field9034.method1003((byte) 53);
            if (var2 == null) {
                return null;
            }
            if (var2.method4041((byte) -76) > method2069(true)) {
                return null;
            }
            var2.method2219(13630);
            var2.method1088(4);
        } while ((Long.MIN_VALUE & var2.field1894) == 0L);
        return var2;
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(CI)Z", line = 50)
    public static final boolean method2067(char arg0, int arg1) {
        if (arg1 == -123) {
            field4353++;
            return arg0 >= 'A' && arg0 <= 'Z' || arg0 >= 'a' && arg0 <= 'z';
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(IIIIIIII)V", line = 62)
    public static final void method2068(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4352++;
        if (arg6 != 10238) {
            field4358 = -19;
        }
        if (arg3 == arg5) {
            class398.method2335(arg2, arg4, arg0, arg7, (byte) 89, arg1, arg5);
        } else if ((arg0 - arg5) >= class471.field6572 && arg0 + arg5 <= class223.field2604 && (arg7 - arg3) >= class187.field2268 && class461.field6480 >= arg3 + arg7) {
            class101.method849(arg2, arg5, arg1, arg7, 40000, arg0, arg3, arg4);
        } else {
            class505.method3029(arg7, arg2, arg1, arg5, arg0, arg3, arg4, -1682589791);
        }
    }

    @OriginalMember(owner = "client!ofa", name = "a", descriptor = "(Z)J", line = 86)
    public static final synchronized long method2069(boolean arg0) {
        field4355++;
        if (!arg0) {
            field4358 = -53;
        }
        long var1 = System.currentTimeMillis();
        if (var1 < class337.field4175) {
            class384.field4904 += class337.field4175 - var1;
        }
        class337.field4175 = var1;
        return class384.field4904 + var1;
    }

    @OriginalMember(owner = "client!ofa", name = "b", descriptor = "(B)V", line = 109)
    public static void method2070(byte arg0) {
        field4354 = null;
        if (arg0 > -100) {
            method2067('S', 4);
        }
    }
}
