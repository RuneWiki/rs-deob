import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hj")
public class class71 {

    @OriginalMember(owner = "client!hj", name = "d", descriptor = "Z")
    public static boolean field1241 = false;

    @OriginalMember(owner = "client!hj", name = "g", descriptor = "Lid;")
    public static class149 field1244 = class60.method382("l", (byte) 65);

    @OriginalMember(owner = "client!hj", name = "c", descriptor = "Lid;")
    public static class149 field1240 = class60.method382("Memory after cleanup=", (byte) 13);

    @OriginalMember(owner = "client!hj", name = "f", descriptor = "Lve;")
    public static class189 field1243 = new class189(64);

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "I")
    public static int field1238;

    @OriginalMember(owner = "client!hj", name = "b", descriptor = "I")
    public static int field1239;

    @OriginalMember(owner = "client!hj", name = "h", descriptor = "I")
    public static int field1245;

    @OriginalMember(owner = "client!hj", name = "i", descriptor = "I")
    public static int field1246;

    @OriginalMember(owner = "client!hj", name = "j", descriptor = "Leg;")
    public static class225 field1247;

    @OriginalMember(owner = "client!hj", name = "e", descriptor = "Lal;")
    public static class230 field1242;

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(I)V")
    public static void method443(int arg0) {
        field1243 = null;
        if (arg0 != 2) {
            field1243 = null;
        }
        field1247 = null;
        field1242 = null;
        field1244 = null;
        field1240 = null;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method444(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field1239++;
        int var8 = 0;
        int var9 = 0;
        int var10 = 2048 - arg3 & 0x7FF;
        int var11 = arg2;
        int var12 = 2048 - arg5 & 0x7FF;
        if (var12 != 0) {
            int var13 = class235.field4118[var12];
            int var14 = class235.field4123[var12];
            var8 = -arg2 * var14 >> 16;
            var11 = arg2 * var13 >> 16;
        }
        if (var10 != 0) {
            int var15 = class235.field4123[var10];
            int var16 = class235.field4118[var10];
            var9 = var11 * var15 >> 16;
            var11 = var11 * var16 >> 16;
        }
        if (arg1 < 7) {
            field1244 = null;
        }
        class10.field140 = arg0 - var8;
        class147.field2646 = arg3;
        class269.field4853 = arg4 - var9;
        class2.field29 = arg7 - var11;
        class186.field3354 = arg5;
    }

    @OriginalMember(owner = "client!hj", name = "a", descriptor = "(IIIIBZIIIIII)Z")
    public static final boolean method445(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1238++;
        if (arg4 != -6) {
            method445(54, -18, 60, -124, (byte) -12, true, 79, 73, 86, 110, 17, 105);
        }
        if (class77.field1449.method885((byte) -50) == 2) {
            return class79.method598(arg5, arg8, arg4 - 5, arg9, arg2, arg0, arg11, arg1, arg6, arg3, arg10, arg7);
        } else if (class77.field1449.method885((byte) -120) > 2) {
            return class181.method1259(arg1, arg11, arg5, arg9, arg3, class77.field1449.method885((byte) -24), arg7, arg8, arg10, arg0, arg2, arg6, (byte) 123);
        } else {
            return class264.method1840(arg10, arg3, arg1, arg7, arg0, arg5, arg8, arg6, arg2, (byte) 4, arg11, arg9);
        }
    }
}
