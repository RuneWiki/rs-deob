import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class154 {

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Ljava/lang/String;")
    public static String field2312 = "Choose Option";

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "Z")
    public static boolean field2311 = false;

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lhb;")
    public static class318 field2317 = new class318(64);

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "I")
    public static int field2321 = -1;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2313;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2315;

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "I")
    public static int field2316;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "I")
    public static int field2318;

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "I")
    public static int field2319;

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "I")
    public static int field2320;

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lbm;")
    public static class44[] field2314;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIZI)Lea;", line = 7)
    public static final class235 method1100(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field2313++;
        int var6 = (arg2 << 17) + ((arg4 ? 65536 : 0) + arg0 + (arg3 << 19));
        long var8 = (long) var6 * 3849834839L + (long) arg5 * 3147483667L;
        class235 var10 = (class235) class177.field2626.method2180(var8, (byte) 31);
        if (var10 != null) {
            return var10;
        }
        class148.field2230 = false;
        class235 var11 = class41.method274(arg3, arg0, arg5, false, (byte) -117, arg4, false, arg2);
        if (arg1 >= -99) {
            field2311 = false;
        }
        if (var11 != null && !class148.field2230) {
            class177.field2626.method2175(var8, var11, -24);
        }
        return var11;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V", line = 42)
    public static final void method1101(int arg0) {
        field2315++;
        if (class172.field2584 <= arg0) {
            class157.field2355 = class168.field2517;
            class168.field2517 = null;
            class163.method1155(40, 10);
        } else {
            class11.method57(0);
        }
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(III)I", line = 63)
    public static final int method1102(int arg0, int arg1, int arg2) {
        field2319++;
        int var3 = (class66.method433(arg2 + 91923, arg0 + arg1, (byte) 22, 4) - (-(class66.method433(arg2 + 37821, arg0 - -10294, (byte) 22, 2) - 128 >> 1) - (class66.method433(arg2, arg0, (byte) 22, 1) - 128 >> 2))) - 128;
        int var4 = (int) ((double) var3 * 0.3D) + 35;
        if (var4 < 10) {
            var4 = 10;
        } else if (var4 > 60) {
            var4 = 60;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIII)V", line = 85)
    public static final void method1103(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= -2) {
            method1103(50, 38, 120, -77);
        }
        field2316++;
        if (class287.field4341 == 0 || arg0 == 0 || class168.field2522 >= 50 || arg1 == -1) {
            return;
        }
        class116.field1783[class168.field2522] = arg1;
        class81.field1145[class168.field2522] = arg0;
        class201.field3003[class168.field2522] = arg3;
        class48.field608[class168.field2522] = null;
        class309.field4693[class168.field2522] = 0;
        class168.field2522++;
    }

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "(I)V", line = 128)
    public static void method1104(int arg0) {
        if (arg0 != 5668) {
            method1101(3);
        }
        field2317 = null;
        field2314 = null;
        field2312 = null;
    }
}
