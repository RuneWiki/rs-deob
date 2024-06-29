import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mr")
public class class145 {

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "I")
    public static int field2003;

    @OriginalMember(owner = "client!mr", name = "b", descriptor = "I")
    public static int field2004;

    @OriginalMember(owner = "client!mr", name = "d", descriptor = "I")
    public static int field2006;

    @OriginalMember(owner = "client!mr", name = "c", descriptor = "Lir;")
    public static class226 field2005;

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IILnl;B)Lfl;")
    public static final class67 method1035(int arg0, int arg1, class435 arg2, byte arg3) {
        field2003++;
        class161 var4 = new class161(arg2.method2633(arg1, arg0, -82));
        class67 var5 = new class67(arg0, var4.method1186(-1), var4.method1186(arg3 - 89), var4.method1168(255), var4.method1168(arg3 + 167), var4.method1172((byte) -112) == 1, var4.method1172((byte) 67), var4.method1172((byte) 117));
        int var6 = var4.method1172((byte) -111);
        if (arg3 != 88) {
            field2005 = null;
        }
        for (int var7 = 0; var7 < var6; var7++) {
            var5.field990.method766(new class103(var4.method1172((byte) 10), var4.method1134(-16848), var4.method1134(-16848), var4.method1134(-16848), var4.method1134(-16848), var4.method1134(-16848), var4.method1134(-16848), var4.method1134(-16848), var4.method1134(-16848)), -1);
        }
        var5.method632((byte) -49);
        return var5;
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "([Ljava/lang/Object;[IB)V")
    public static final void method1036(Object[] arg0, int[] arg1, byte arg2) {
        class21.method151(107, arg1.length - 1, 0, arg0, arg1);
        field2006++;
        int var3 = 87 / ((arg2 - 16) / 53);
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(B)V")
    public static void method1037(byte arg0) {
        field2005 = null;
        if (arg0 < 68) {
            method1036((Object[]) null, (int[]) null, (byte) 60);
        }
    }

    @OriginalMember(owner = "client!mr", name = "a", descriptor = "(IZIIII)V")
    public static final void method1038(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        class227.field3279 = arg4;
        class481.field6810 = arg3;
        class194.field2894 = arg0;
        class374.field5179 = arg5;
        if (!arg1) {
            return;
        }
        class27.field282 = arg2;
        field2004++;
        if (class227.field3279 >= 100) {
            int var6 = class27.field282 * 128 + 64;
            int var7 = class481.field6810 * 128 + 64;
            int var8 = class407.method2440(var6, -16490, var7, class387.field5306) - class194.field2894;
            int var9 = var6 - class135.field1884;
            int var10 = var8 - class303.field4302;
            int var11 = var7 - class184.field2784;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var11 * var11));
            class366.field5028 = (int) (Math.atan2((double) var10, (double) var12) * 2607.5945876176133D) & 0x3FFF;
            class103.field1455 = (int) (-2607.5945876176133D * Math.atan2((double) var9, (double) var11)) & 0x3FFF;
            if (class366.field5028 < 1024) {
                class366.field5028 = 1024;
            }
            class158.field2258 = 0;
            if (class366.field5028 > 3072) {
                class366.field5028 = 3072;
            }
        }
        class390.field5393 = 2;
    }
}
