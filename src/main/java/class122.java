import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pq")
public class class122 {

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "Lgn;")
    public static class475 field1592 = new class475(36, 7);

    @OriginalMember(owner = "client!pq", name = "e", descriptor = "I")
    public static int field1596 = 0;

    @OriginalMember(owner = "client!pq", name = "h", descriptor = "I")
    public static int field1599 = 0;

    @OriginalMember(owner = "client!pq", name = "g", descriptor = "I")
    public static int field1598 = -1;

    @OriginalMember(owner = "client!pq", name = "f", descriptor = "F")
    public static float field1597;

    @OriginalMember(owner = "client!pq", name = "c", descriptor = "I")
    public static int field1594;

    @OriginalMember(owner = "client!pq", name = "d", descriptor = "I")
    public static int field1595;

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "[Lqg;")
    public static class307[] field1593;

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(B)V")
    public static void method693(byte arg0) {
        field1593 = null;
        if (arg0 != -24) {
            field1596 = 49;
        }
        field1592 = null;
    }

    @OriginalMember(owner = "client!pq", name = "b", descriptor = "(B)V")
    public static final void method694(byte arg0) {
        field1594++;
        class386.method2321(true, class447.field6522);
        int var1 = 98 % ((32 - arg0) / 32);
        class277.field3954++;
        class79.field1108.method947(-98, class262.method1618(-29489));
        class79.field1108.method961(class223.field3156, 1608339368);
        class79.field1108.method961(class207.field2874, 1608339368);
        class79.field1108.method947(-41, class118.field1533.field6905);
    }

    @OriginalMember(owner = "client!pq", name = "a", descriptor = "(ZILeq;ILfs;Lts;III)V")
    public static final void method695(boolean arg0, int arg1, class134 arg2, int arg3, class372 arg4, class356 arg5, int arg6, int arg7, int arg8) {
        field1595++;
        if (arg0) {
            field1592 = null;
        }
        class170 var9 = class96.field1295.method282(arg7, 64);
        if (var9 == null || !var9.field2275 || !var9.method1076(0, class453.field6591)) {
            return;
        }
        if (var9.field2253 != null) {
            int[] var10 = new int[var9.field2253.length];
            for (int var11 = 0; var11 < var10.length / 2; var11++) {
                int var13;
                if (class306.field4454 == 4) {
                    var13 = (int) class506.field7722 & 0x3FFF;
                } else {
                    var13 = (int) class506.field7722 + class280.field4003 & 0x3FFF;
                }
                int var14 = class323.field4731[var13];
                int var15 = class323.field4733[var13];
                if (class306.field4454 != 4) {
                    var15 = var15 * 256 / (class498.field7587 + 256);
                    var14 = var14 * 256 / (class498.field7587 + 256);
                }
                var10[var11 * 2] = ((var9.field2253[var11 * 2] * 4 + arg1) * var15 + (var9.field2253[var11 * 2 + 1] * 4 + arg6) * var14 >> 15) + arg5.field5168 / 2 + arg3;
                var10[var11 * 2 + 1] = arg5.field5169 / 2 + arg8 - ((var9.field2253[var11 * 2 - -1] * 4 + arg6) * var15 + -((var9.field2253[var11 * 2] * 4 + arg1) * var14) >> 15);
            }
            class10.method78(arg2, var10, var9.field2260, arg5.field5259, arg5.field5275);
            for (int var12 = 0; var12 < var10.length / 2 - 1; var12++) {
                arg2.method834(var10[var12 * 2], var10[var12 * 2 + 1], var10[var12 * 2 + 2], var10[var12 * 2 + 1 + 2], var9.field2251, 1, arg4, arg3, arg8);
            }
            arg2.method834(var10[var10.length - 2], var10[var10.length - 1], var10[0], var10[1], var9.field2251, 1, arg4, arg3, arg8);
        }
        class307 var16 = null;
        if (var9.field2258 != -1) {
            var16 = var9.method1075(0, arg2, false);
            if (var16 != null) {
                class397.method2373(arg8, arg1, arg4, arg6, var16, arg3, 256, arg5);
            }
        }
        if (var9.field2273 == null) {
            return;
        }
        int var17 = 0;
        if (var16 != null) {
            var17 = var16.method85();
        }
        class348 var18 = class95.field1282;
        class507 var19 = class407.field5974;
        if (var9.field2266 == 1) {
            var18 = class181.field2587;
            var19 = class93.field1260;
        }
        if (var9.field2266 == 2) {
            var19 = class482.field6989;
            var18 = class458.field6676;
        }
        class171.method1080(arg4, var18, arg6, var17, arg3, var9.field2237, arg5, var19, arg8, arg1, (byte) 49, var9.field2273);
        return;
    }
}
