import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uw")
public class class378 {

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "I")
    public static int field4915 = -1;

    @OriginalMember(owner = "client!uw", name = "b", descriptor = "I")
    public static int field4916;

    @OriginalMember(owner = "client!uw", name = "a", descriptor = "(IIBII)V", line = 8)
    public static final void method2073(int arg0, int arg1, byte arg2, int arg3, int arg4) {
        field4916++;
        int var5 = 11 % ((arg2 - 54) / 59);
        int var6 = 0;
        int var7 = arg4;
        int var8 = -arg4;
        class445.method2463(arg1 - arg4, 117, arg1 + arg4, arg0, class156.field1755[arg3]);
        int var9 = -1;
        while (var6 < var7) {
            var9 += 2;
            var8 += var9;
            var6++;
            if (var8 >= 0) {
                var7--;
                var8 -= var7 << 1;
                int[] var10 = class156.field1755[arg3 + var7];
                int[] var11 = class156.field1755[arg3 - var7];
                int var12 = arg1 + var6;
                int var13 = arg1 - var6;
                class445.method2463(var13, 105, var12, arg0, var10);
                class445.method2463(var13, 118, var12, arg0, var11);
            }
            int var14 = arg1 + var7;
            int var15 = arg1 - var7;
            int[] var16 = class156.field1755[arg3 + var6];
            int[] var17 = class156.field1755[arg3 - var6];
            class445.method2463(var15, 111, var14, arg0, var16);
            class445.method2463(var15, 127, var14, arg0, var17);
        }
    }
}
