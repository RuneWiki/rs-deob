import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wg")
public class class261 {

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "[Ljava/lang/String;")
    public static String[] field4144 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };

    @OriginalMember(owner = "client!wg", name = "d", descriptor = "I")
    public static int field4147 = 0;

    @OriginalMember(owner = "client!wg", name = "f", descriptor = "[Ljava/lang/String;")
    public static String[] field4149 = null;

    @OriginalMember(owner = "client!wg", name = "b", descriptor = "I")
    public static int field4145;

    @OriginalMember(owner = "client!wg", name = "c", descriptor = "I")
    public static int field4146;

    @OriginalMember(owner = "client!wg", name = "e", descriptor = "I")
    public static int field4148;

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(I)V")
    public static void method1712(int arg0) {
        field4144 = null;
        field4149 = null;
        if (arg0 <= 104) {
            field4149 = null;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IZ)V")
    public static final void method1713(int arg0, boolean arg1) {
        field4148++;
        if (!arg1) {
            class200.field3222 = 1000 / arg0;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(IIII)V")
    public static final void method1714(int arg0, int arg1, int arg2, int arg3) {
        class99 var4 = class273.field4415[arg0][arg1][arg2];
        if (var4 == null) {
            return;
        }
        class195 var5 = var4.field1494;
        if (var5 != null) {
            var5.field3147 = var5.field3147 * arg3 / 16;
            var5.field3151 = var5.field3151 * arg3 / 16;
        }
    }

    @OriginalMember(owner = "client!wg", name = "a", descriptor = "(BIIII)Ldk;")
    public static final class190 method1715(byte arg0, int arg1, int arg2, int arg3, int arg4) {
        field4145++;
        long var5 = (long) arg1 & 0xFFFFL | (long) arg3 << 16 & 0xFFFFL << 16 | 0xFFFFL << 48 & (long) arg4 << 48 | ((long) arg2 & 0xFFFFL) << 32;
        class190 var7 = (class190) class147.field2366.method1839((byte) 107, var5);
        if (var7 != null) {
            return var7;
        }
        int var8 = 17 / ((arg0 - 4) / 33);
        class32[] var9 = null;
        class229 var10 = class150.method1016(arg1, true);
        if (var10.field3646 != null) {
            var9 = new class32[var10.field3646.length];
            for (int var11 = 0; var11 < var9.length; var11++) {
                class207 var12 = class57.method440(var10.field3646[var11], -353);
                var9[var11] = new class32(var12.field3346, var12.field3349, var12.field3333, var12.field3344, var12.field3345, var12.field3352, var12.field3343, var12.field3341);
            }
        }
        class190 var13 = new class190(var10.field3635, var9, var10.field3643, arg4, arg2, arg3);
        class147.field2366.method1830(var5, -123, var13);
        return var13;
    }
}
