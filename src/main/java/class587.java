import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hs")
public class class587 extends class672 {

    @OriginalMember(owner = "client!hs", name = "O", descriptor = "[I")
    public static int[] field8107 = new int[] { 36064, 36065, 36066, 36067, 36068, 36069, 36070, 36071, 36096 };

    @OriginalMember(owner = "client!hs", name = "I", descriptor = "Ltt;")
    public static class338 field8105 = new class338(3, -1);

    @OriginalMember(owner = "client!hs", name = "L", descriptor = "I")
    public static int field8106;

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(II[Lwv;)V")
    public static final void method3251(int arg0, int arg1, class423[] arg2) {
        int var3 = 84 % ((arg1 - 37) / 58);
        for (int var4 = 0; var4 < arg2.length; var4++) {
            class423 var5 = arg2[var4];
            if (var5 != null && var5.field5585 == arg0 && !client.method3855(var5)) {
                if (var5.field5598 == 0) {
                    method3251(var5.field5685, 111, arg2);
                    if (var5.field5647 != null) {
                        method3251(var5.field5685, -96, var5.field5647);
                    }
                    class137 var6 = (class137) class152.field2079.method3057(1, (long) var5.field5685);
                    if (var6 != null) {
                        class327.method1904(var6.field1870, -1);
                    }
                }
                if (var5.field5598 == 6 && var5.field5627 != -1) {
                    class186 var7 = class423.field5620.method1707(var5.field5627, -122);
                    if (var7 != null) {
                        var5.field5680 += class498.field6849;
                        int var8 = var5.field5572;
                        while (var7.field2595[var5.field5572] < var5.field5680) {
                            var5.field5680 -= var7.field2595[var5.field5572];
                            var5.field5572++;
                            if (var7.field2570.length <= var5.field5572) {
                                var5.field5572 -= var7.field2587;
                                if (var5.field5572 < 0 || var5.field5572 >= var7.field2570.length) {
                                    var5.field5572 = 0;
                                }
                            }
                            var5.field5555 = var5.field5572 + 1;
                            if (var5.field5555 >= var7.field2570.length) {
                                var5.field5555 -= var7.field2587;
                                if (var5.field5555 < 0 || var5.field5555 >= var7.field2570.length) {
                                    var5.field5555 = -1;
                                }
                            }
                            class552.method3091(var5, 12618);
                        }
                        if (var5.field5572 != var8) {
                            class407.method2313(var5.field5572, var7, 255);
                        }
                    }
                }
            }
        }
        field8106++;
    }

    @OriginalMember(owner = "client!hs", name = "a", descriptor = "(B)V")
    public static void method3252(byte arg0) {
        field8105 = null;
        if (arg0 >= 107) {
            field8107 = null;
        }
    }
}
