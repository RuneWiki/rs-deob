import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jga")
public class class163 {

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "Low;")
    public static class665 field2502 = new class665();

    @OriginalMember(owner = "client!jga", name = "c", descriptor = "Lin;")
    public static class380 field2504 = new class380(60, 1);

    @OriginalMember(owner = "client!jga", name = "g", descriptor = "I")
    public static int field2508 = -1;

    @OriginalMember(owner = "client!jga", name = "b", descriptor = "I")
    public static int field2503;

    @OriginalMember(owner = "client!jga", name = "d", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!jga", name = "f", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!jga", name = "e", descriptor = "Lvr;")
    public static class458 field2506;

    @OriginalMember(owner = "client!jga", name = "h", descriptor = "[I")
    public static int[] field2509;

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIB)I")
    public static final int method1233(int arg0, int arg1, byte arg2) {
        field2507++;
        if (arg2 <= 70) {
            return -15;
        } else {
            int var3 = arg0 >>> 24;
            int var4 = 255 - var3;
            int var5 = ((arg0 & 0xFF00) * var3 & 0xFF0000 | (arg0 & 0xFF00FF) * var3 & 0xFF00FF00) >>> 8;
            return (((arg1 & 0xFF00) * var4 & 0xFF0000 | (arg1 & 0xFF00FF) * var4 & 0xFF00FF00) >>> 8) + var5;
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(IIIII)V")
    public static final void method1234(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field2505++;
        int var5 = arg1;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        class379.method2284(arg0 - arg2, arg0 + arg2, class74.field1144[arg4], arg3, 2);
        while (var6 > var5) {
            var8 += 2;
            var5++;
            var7 += var8;
            if (var7 >= 0) {
                var6--;
                var7 -= var6 << 1;
                int[] var9 = class74.field1144[arg4 + var6];
                int[] var10 = class74.field1144[arg4 - var6];
                int var11 = arg0 + var5;
                int var12 = arg0 - var5;
                class379.method2284(var12, var11, var9, arg3, 2);
                class379.method2284(var12, var11, var10, arg3, 2);
            }
            int var13 = arg0 + var6;
            int var14 = arg0 - var6;
            int[] var15 = class74.field1144[arg4 + var5];
            int[] var16 = class74.field1144[arg4 - var5];
            class379.method2284(var14, var13, var15, arg3, 2);
            class379.method2284(var14, var13, var16, arg3, 2);
        }
    }

    @OriginalMember(owner = "client!jga", name = "a", descriptor = "(I)V")
    public static void method1235(int arg0) {
        field2509 = null;
        if (arg0 != 16711935) {
            method1235(122);
        }
        field2506 = null;
        field2504 = null;
        field2502 = null;
    }
}
