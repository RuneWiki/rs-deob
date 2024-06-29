import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jba")
public class class156 {

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "[I")
    public static int[] field2029 = new int[] { 1, 4, 1, 2 };

    @OriginalMember(owner = "client!jba", name = "c", descriptor = "Ljn;")
    public static class134 field2031 = new class134(85, 20);

    @OriginalMember(owner = "client!jba", name = "f", descriptor = "I")
    public static int field2034 = 0;

    @OriginalMember(owner = "client!jba", name = "d", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!jba", name = "e", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!jba", name = "b", descriptor = "J")
    public static long field2030;

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIIIII)V", line = 3)
    public static final void method1009(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field2033++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        if (arg2 < 23) {
            return;
        }
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg0 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg0 - 1) * var15;
        if (arg3 >= class727.field10060 && arg3 <= class474.field6576) {
            int var21 = class436.method2621(arg4 + arg5, class627.field8783, class177.field2236, 512);
            int var22 = class436.method2621(arg4 - arg5, class627.field8783, class177.field2236, 512);
            class128.method883(arg1, var22, var21, class705.field9804[arg3], 7);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var23 = arg3 - var7;
            int var24 = arg3 + var7;
            if (var24 >= class727.field10060 && class474.field6576 >= var23) {
                int var25 = class436.method2621(arg4 + var6, class627.field8783, class177.field2236, 512);
                int var26 = class436.method2621(arg4 - var6, class627.field8783, class177.field2236, 512);
                if (var23 >= class727.field10060) {
                    class128.method883(arg1, var26, var25, class705.field9804[var23], 7);
                }
                if (var24 <= class474.field6576) {
                    class128.method883(arg1, var26, var25, class705.field9804[var24], 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(IIII)V", line = 105)
    public static final void method1010(int arg0, int arg1, int arg2, int arg3) {
        int var4 = arg3 << 3;
        field2032++;
        int var5 = arg1 << 3;
        int var6 = arg2 << 3;
        if (arg0 != 30512) {
            method1010(-79, 112, -83, 84);
        }
        class514.field7053 = var6;
        class702.field9790 = var4;
        if (class695.field9691 == 2) {
            class326.field4589 = var4;
            class480.field6657 = var5;
            class472.field6537 = var6;
        }
        class731.method4068(-4);
        class109.field1314 = true;
    }

    @OriginalMember(owner = "client!jba", name = "a", descriptor = "(B)V", line = 140)
    public static void method1011(byte arg0) {
        field2029 = null;
        field2031 = null;
        if (arg0 != -110) {
            field2029 = null;
        }
    }
}
