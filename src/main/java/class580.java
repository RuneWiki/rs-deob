import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class580 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "Ljk;")
    public static class585 field8459 = new class585(68, 2);

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "Z")
    public static boolean field8460 = true;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Z")
    public static boolean field8462 = false;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "Lwo;")
    public static class690 field8463 = new class690(110, -2);

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "I")
    public static int field8458;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "[I")
    public static int[] field8461;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IBIII)V", line = 5)
    public static final void method3381(int arg0, byte arg1, int arg2, int arg3, int arg4) {
        field8458++;
        int var5 = -124 % ((-arg1 - 57) / 58);
        int var6 = 0;
        int var7 = arg3;
        int var8 = -arg3;
        int var9 = -1;
        int var10 = class396.method2393(class587.field8513, class221.field2866, 5890, arg0 + arg3);
        int var11 = class396.method2393(class587.field8513, class221.field2866, 5890, arg0 - arg3);
        class359.method2018(class678.field9722[arg2], var10, 72, arg4, var11);
        while (var7 > var6) {
            var9 += 2;
            var8 += var9;
            if (var8 > 0) {
                var7--;
                var8 -= var7 << 1;
                int var12 = arg2 - var7;
                int var13 = arg2 + var7;
                if (var13 >= class598.field8632 && var12 <= class288.field3883) {
                    int var14 = class396.method2393(class587.field8513, class221.field2866, 5890, arg0 + var6);
                    int var15 = class396.method2393(class587.field8513, class221.field2866, 5890, arg0 - var6);
                    if (class288.field3883 >= var13) {
                        class359.method2018(class678.field9722[var13], var14, 98, arg4, var15);
                    }
                    if (class598.field8632 <= var12) {
                        class359.method2018(class678.field9722[var12], var14, 72, arg4, var15);
                    }
                }
            }
            var6++;
            int var16 = arg2 - var6;
            int var17 = arg2 + var6;
            if (class598.field8632 <= var17 && var16 <= class288.field3883) {
                int var18 = class396.method2393(class587.field8513, class221.field2866, 5890, arg0 + var7);
                int var19 = class396.method2393(class587.field8513, class221.field2866, 5890, arg0 - var7);
                if (var17 <= class288.field3883) {
                    class359.method2018(class678.field9722[var17], var18, 73, arg4, var19);
                }
                if (class598.field8632 <= var16) {
                    class359.method2018(class678.field9722[var16], var18, 70, arg4, var19);
                }
            }
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 87)
    public static void method3382(int arg0) {
        int var1 = -56 % ((32 - arg0) / 53);
        field8461 = null;
        field8463 = null;
        field8459 = null;
    }
}
