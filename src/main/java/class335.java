import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class335 {

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "Laga;")
    public static class696 field4869 = new class696();

    @OriginalMember(owner = "client!iw", name = "b", descriptor = "I")
    public static int field4870;

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(Lpc;)V", line = 5)
    public static final void method2129(class700 arg0) {
        if (class490.field6806 >= 65535) {
            return;
        }
        class540 var1 = arg0.field9828;
        class369.field5356[class490.field6806] = arg0;
        class321.field4618[class490.field6806] = false;
        class490.field6806++;
        int var2 = arg0.field9827;
        if (arg0.field9829) {
            var2 = 0;
        }
        int var3 = arg0.field9827;
        if (arg0.field9808) {
            var3 = class315.field4541 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method3084((byte) -16) + class30.field464 - var1.method3081(7036) >> class26.field388;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method3084((byte) -16) + var1.method3081(7036) - class30.field464 >> class26.field388;
            if (var7 >= class710.field9947) {
                var7 = class710.field9947 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field9813[var5++];
                int var10 = (var1.method3085(24859) + class30.field464 - var1.method3081(7036) >> class26.field388) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class405.field5875) {
                    var11 = class405.field5875 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class608.field8264[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class608.field8264[var4][var12][var8] = var13 | (long) class490.field6806;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class608.field8264[var4][var12][var8] = var13 | (long) class490.field6806 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class608.field8264[var4][var12][var8] = var13 | (long) class490.field6806 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class608.field8264[var4][var12][var8] = var13 | (long) class490.field6806 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(I)V", line = 97)
    public static void method2130(int arg0) {
        if (arg0 < -93) {
            field4869 = null;
        }
    }

    @OriginalMember(owner = "client!iw", name = "a", descriptor = "(IZJ)Ljava/lang/String;", line = 107)
    public static final String method2131(int arg0, boolean arg1, long arg2) {
        if (!arg1) {
            return null;
        }
        class109.method822((byte) -106, arg2);
        field4870++;
        int var4 = class295.field4285.get(5);
        int var5 = class295.field4285.get(2);
        int var6 = class295.field4285.get(1);
        return arg0 == 3 ? class633.method3548((byte) -110, arg2, arg0) : Integer.toString(var4 / 10) + var4 % 10 + "-" + class339.field4916[arg0][var5] + "-" + var6;
    }
}
