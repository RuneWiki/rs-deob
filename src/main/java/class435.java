import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class435 extends class250 {

    @OriginalMember(owner = "client!ua", name = "w", descriptor = "[B")
    public static byte[] field6060;

    @OriginalMember(owner = "client!ua", name = "u", descriptor = "I")
    public static int field6058;

    @OriginalMember(owner = "client!ua", name = "v", descriptor = "Lwf;")
    public static class79 field6059;

    @OriginalMember(owner = "client!ua", name = "t", descriptor = "I")
    public static int field6057;

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Z)V")
    public static void method2567(boolean arg0) {
        if (arg0) {
            method2567(true);
        }
        field6060 = null;
        field6059 = null;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(IIIIZI)V")
    public static final void method2568(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        if (arg0 < 1) {
            arg0 = 1;
        }
        field6057++;
        if (arg5 < 1) {
            arg5 = 1;
        }
        int var6 = arg0 - 334;
        if (var6 < 0) {
            var6 = 0;
        } else if (var6 > 100) {
            var6 = 100;
        }
        int var7 = (class55.field744 - class146.field2097) * var6 / 100 + class146.field2097;
        if (class413.field5815 > var7) {
            var7 = class413.field5815;
        } else if (var7 > class213.field3216) {
            var7 = class213.field3216;
        }
        int var8 = arg0 * var7 * 512 / (arg5 * 334);
        if (class441.field6124 > var8) {
            short var12 = class441.field6124;
            var7 = arg5 * var12 * 334 / (arg0 * 512);
            if (var7 > class213.field3216) {
                var7 = class213.field3216;
                int var13 = arg0 * var7 * 512 / (var12 * 334);
                int var14 = (arg5 - var13) / 2;
                if (arg4) {
                    class141.field1878.method691();
                    class141.field1878.method1941(arg0, arg1, arg2 ^ 0x14F, var14, arg3, -16777216);
                    class141.field1878.method1941(arg0, arg1, arg2 - 333, var14, arg3 + arg5 - var14, -16777216);
                }
                arg5 -= var14 * 2;
                arg3 += var14;
            }
        } else if (class488.field6874 < var8) {
            short var9 = class488.field6874;
            var7 = arg5 * var9 * 334 / (arg0 * 512);
            if (class413.field5815 > var7) {
                var7 = class413.field5815;
                int var10 = arg5 * var9 * 334 / (var7 * 512);
                int var11 = (arg0 - var10) / 2;
                if (arg4) {
                    class141.field1878.method691();
                    class141.field1878.method1941(var11, arg1, 1, arg5, arg3, -16777216);
                    class141.field1878.method1941(var11, arg0 + arg1 - var11, 1, arg5, arg3, -16777216);
                }
                arg1 += var11;
                arg0 -= var11 * 2;
            }
        }
        class102.field1297 = arg1;
        class218.field3268 = (short) arg5;
        class230.field3479 = arg0 * var7 / arg2;
        class334.field4859 = arg3;
        class280.field4134 = (short) arg0;
    }

    static {
        new class326("Attempting to join channel...", "Chatraum wird betreten...", "Tentative de connexion au canal...", "Tentando acessar canal...");
        field6060 = new byte[520];
        field6058 = 1400;
        field6059 = new class79(6, 3);
    }
}
