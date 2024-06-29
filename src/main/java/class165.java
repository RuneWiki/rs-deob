import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nb")
public class class165 extends class447 {

    @OriginalMember(owner = "client!nb", name = "w", descriptor = "Lfl;")
    public class439 field2353;

    @OriginalMember(owner = "client!nb", name = "u", descriptor = "I")
    public static volatile int field2351 = -1;

    @OriginalMember(owner = "client!nb", name = "z", descriptor = "Ljava/lang/String;")
    public static String field2356 = "scroll:";

    @OriginalMember(owner = "client!nb", name = "C", descriptor = "I")
    public static int field2359 = -1;

    @OriginalMember(owner = "client!nb", name = "v", descriptor = "I")
    public static int field2352 = -2;

    @OriginalMember(owner = "client!nb", name = "x", descriptor = "I")
    public static int field2354;

    @OriginalMember(owner = "client!nb", name = "y", descriptor = "I")
    public static int field2355;

    @OriginalMember(owner = "client!nb", name = "D", descriptor = "I")
    public static int field2360;

    @OriginalMember(owner = "client!nb", name = "A", descriptor = "Lcd;")
    public static class171 field2357;

    @OriginalMember(owner = "client!nb", name = "B", descriptor = "Lmq;")
    public static class295 field2358;

    @OriginalMember(owner = "client!nb", name = "e", descriptor = "(B)V", line = 3)
    public static void method1121(byte arg0) {
        if (arg0 < 93) {
            field2356 = null;
        }
        field2356 = null;
        field2358 = null;
        field2357 = null;
    }

    @OriginalMember(owner = "client!nb", name = "<init>", descriptor = "(Lfl;)V", line = 34)
    public class165(class439 arg0) {
        this.field2353 = arg0;
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(IIIIII)V", line = 43)
    public static final void method1122(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2360++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg0 * arg0;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        if (arg2 < 68) {
            return;
        }
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (class300.field4164 <= arg5 && arg5 <= class398.field5827) {
            int var20 = class231.method1452(91, class43.field659, arg0 + arg3, class379.field5397);
            int var21 = class231.method1452(100, class43.field659, arg3 - arg0, class379.field5397);
            class73.method486(var21, class84.field1286[arg5], arg1, -114, var20);
        }
        int var22 = (arg4 - 1) * var15;
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var17 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var13 += -var22;
            var14 += -var18;
            var22 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (class300.field4164 <= var24 && class398.field5827 >= var23) {
                int var25 = class231.method1452(119, class43.field659, arg3 + var6, class379.field5397);
                int var26 = class231.method1452(93, class43.field659, arg3 - var6, class379.field5397);
                if (class300.field4164 <= var23) {
                    class73.method486(var26, class84.field1286[var23], arg1, 116, var25);
                }
                if (class398.field5827 >= var24) {
                    class73.method486(var26, class84.field1286[var24], arg1, 115, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nb", name = "a", descriptor = "(Lqj;IZLqj;)V", line = 145)
    public static final void method1123(class296 arg0, int arg1, boolean arg2, class296 arg3) {
        class434.field6231 = arg3;
        field2355++;
        class436.field6253 = arg2;
        class309.field4240 = arg0;
        if (arg1 != -229100319) {
            field2354 = 52;
        }
    }
}
