import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mv")
public class class328 {

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "[I")
    public static int[] field4605 = new int[8];

    @OriginalMember(owner = "client!mv", name = "b", descriptor = "I")
    public static int field4606;

    @OriginalMember(owner = "client!mv", name = "c", descriptor = "I")
    public static int field4607;

    @OriginalMember(owner = "client!mv", name = "d", descriptor = "I")
    public static int field4608;

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(CLjava/lang/String;Z)I")
    public static final int method2068(char arg0, String arg1, boolean arg2) {
        field4608++;
        int var3 = 0;
        int var4 = arg1.length();
        for (int var5 = 0; var5 < var4; var5++) {
            if (arg0 == arg1.charAt(var5)) {
                var3++;
            }
        }
        if (!arg2) {
            field4605 = null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IZII)V")
    public static final void method2069(int arg0, boolean arg1, int arg2, int arg3) {
        if (class297.field4327.method3669(false, (long) arg0) == null) {
            if (class514.field7056) {
                class469 var4 = new class469(arg0, new class240(4096, class278.field4003, arg0), arg3, arg1);
                var4.field6502.method2964(10777, class187.field2336[class553.field7667]);
                class297.field4327.method3666((byte) 65, (long) arg0, var4);
            } else {
                class536.method3182(arg0, -1, arg1);
            }
        }
        if (arg2 >= -42) {
            field4605 = null;
        }
        field4607++;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(I)V")
    public static void method2070(int arg0) {
        if (arg0 >= -95) {
            method2069(-21, true, 35, -109);
        }
        field4605 = null;
    }

    @OriginalMember(owner = "client!mv", name = "a", descriptor = "(IIIIB)V")
    public static final void method2071(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        field4606++;
        int var5 = 0;
        int var6 = arg1;
        int var7 = -arg1;
        int var8 = -1;
        int var9 = class436.method2621(arg1 + arg2, class627.field8783, class177.field2236, 512);
        int var10 = 15 / ((arg4 - 72) / 48);
        int var11 = class436.method2621(arg2 - arg1, class627.field8783, class177.field2236, 512);
        class128.method883(arg3, var11, var9, class705.field9804[arg0], 7);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var12 = arg0 - var6;
                int var13 = arg0 + var6;
                if (class727.field10060 <= var13 && var12 <= class474.field6576) {
                    int var14 = class436.method2621(arg2 + var5, class627.field8783, class177.field2236, 512);
                    int var15 = class436.method2621(arg2 - var5, class627.field8783, class177.field2236, 512);
                    if (class474.field6576 >= var13) {
                        class128.method883(arg3, var15, var14, class705.field9804[var13], 7);
                    }
                    if (var12 >= class727.field10060) {
                        class128.method883(arg3, var15, var14, class705.field9804[var12], 7);
                    }
                }
            }
            var5++;
            int var16 = arg0 - var5;
            int var17 = arg0 + var5;
            if (var17 >= class727.field10060 && var16 <= class474.field6576) {
                int var18 = class436.method2621(arg2 + var6, class627.field8783, class177.field2236, 512);
                int var19 = class436.method2621(arg2 - var6, class627.field8783, class177.field2236, 512);
                if (var17 <= class474.field6576) {
                    class128.method883(arg3, var19, var18, class705.field9804[var17], 7);
                }
                if (var16 >= class727.field10060) {
                    class128.method883(arg3, var19, var18, class705.field9804[var16], 7);
                }
            }
        }
    }
}
