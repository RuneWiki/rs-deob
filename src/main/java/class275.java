import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!js")
public class class275 {

    @OriginalMember(owner = "client!js", name = "b", descriptor = "I")
    public int field3621;

    @OriginalMember(owner = "client!js", name = "e", descriptor = "I")
    public int field3624;

    @OriginalMember(owner = "client!js", name = "h", descriptor = "I")
    public int field3627;

    @OriginalMember(owner = "client!js", name = "d", descriptor = "I")
    public int field3623;

    @OriginalMember(owner = "client!js", name = "f", descriptor = "I")
    public static int field3625 = 0;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "I")
    public static int field3620;

    @OriginalMember(owner = "client!js", name = "c", descriptor = "I")
    public static int field3622;

    @OriginalMember(owner = "client!js", name = "g", descriptor = "I")
    public static int field3626;

    @OriginalMember(owner = "client!js", name = "a", descriptor = "([J[Ljava/lang/Object;III)V")
    public static final void method1564(long[] arg0, Object[] arg1, int arg2, int arg3, int arg4) {
        field3626++;
        if (arg4 > arg3) {
            int var5 = (arg3 + arg4) / 2;
            int var6 = arg3;
            long var7 = arg0[var5];
            arg0[var5] = arg0[arg4];
            arg0[arg4] = var7;
            Object var9 = arg1[var5];
            arg1[var5] = arg1[arg4];
            arg1[arg4] = var9;
            int var10 = var7 == Long.MAX_VALUE ? 0 : 1;
            for (int var11 = arg3; var11 < arg4; var11++) {
                if (arg0[var11] < ((long) (var10 & var11) + var7)) {
                    long var12 = arg0[var11];
                    arg0[var11] = arg0[var6];
                    arg0[var6] = var12;
                    Object var14 = arg1[var11];
                    arg1[var11] = arg1[var6];
                    arg1[var6++] = var14;
                }
            }
            arg0[arg4] = arg0[var6];
            arg0[var6] = var7;
            arg1[arg4] = arg1[var6];
            arg1[var6] = var9;
            method1564(arg0, arg1, 1, arg3, var6 - 1);
            method1564(arg0, arg1, arg2, var6 + 1, arg4);
        }
        if (arg2 != 1) {
            method1564(null, null, -53, 60, -7);
        }
    }

    @OriginalMember(owner = "client!js", name = "toString", descriptor = "()Ljava/lang/String;")
    public final String toString() {
        field3620++;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!js", name = "a", descriptor = "(IIIIII)V")
    public static final void method1565(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3622++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg1 * arg1;
        int var9 = arg5 * arg5;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg5 << 1;
        int var13 = (1 - var12) * var8 + var10;
        if (arg0 != 26250) {
            field3625 = -18;
        }
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg5 - 1) * var15;
        if (class563.field8282 <= arg4 && arg4 <= class271.field3513) {
            int var21 = class536.method3056(class592.field8588, arg0 ^ 0x66F2, arg1 + arg2, class470.field6589);
            int var22 = class536.method3056(class592.field8588, arg0 - 26137, arg2 - arg1, class470.field6589);
            class62.method363(var21, arg0 ^ 0xFFFF990B, arg3, class328.field4287[arg4], var22);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var6++;
                    var17 += var16;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var19 += var16;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var23 = arg4 - var7;
            int var24 = arg4 + var7;
            if (var24 >= class563.field8282 && var23 <= class271.field3513) {
                int var25 = class536.method3056(class592.field8588, 114, arg2 + var6, class470.field6589);
                int var26 = class536.method3056(class592.field8588, 117, arg2 - var6, class470.field6589);
                if (var23 >= class563.field8282) {
                    class62.method363(var25, -128, arg3, class328.field4287[var23], var26);
                }
                if (var24 <= class271.field3513) {
                    class62.method363(var25, -128, arg3, class328.field4287[var24], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!js", name = "<init>", descriptor = "(IIII)V")
    public class275(int arg0, int arg1, int arg2, int arg3) {
        this.field3621 = arg2;
        this.field3624 = arg3;
        this.field3627 = arg1;
        this.field3623 = arg0;
    }
}
