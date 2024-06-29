import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sw")
public class class11 {

    @OriginalMember(owner = "client!sw", name = "b", descriptor = "Lwp;")
    public static class453 field192 = null;

    @OriginalMember(owner = "client!sw", name = "e", descriptor = "I")
    public static int field195 = 0;

    @OriginalMember(owner = "client!sw", name = "d", descriptor = "I")
    public int field194;

    @OriginalMember(owner = "client!sw", name = "f", descriptor = "I")
    public static int field196;

    @OriginalMember(owner = "client!sw", name = "g", descriptor = "I")
    public static int field197;

    @OriginalMember(owner = "client!sw", name = "h", descriptor = "I")
    public static int field198;

    @OriginalMember(owner = "client!sw", name = "c", descriptor = "Ljava/lang/String;")
    public String field193;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "[Lqda;")
    public static class172[] field191;

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(I)V")
    public static void method85(int arg0) {
        field191 = null;
        field192 = null;
        if (arg0 != -1) {
            field191 = null;
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(IIIIII)V")
    public static final void method86(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field198++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        if (arg0 != 1641) {
            field195 = -28;
        }
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg1 - 1) * var15;
        class57.method362(arg5 - arg2, class550.field7650[arg4], arg3, arg2 + arg5, 106);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg5 + var6;
            int var24 = arg5 - var6;
            class57.method362(var24, class550.field7650[var21], arg3, var23, 104);
            class57.method362(var24, class550.field7650[var22], arg3, var23, -113);
        }
    }

    @OriginalMember(owner = "client!sw", name = "a", descriptor = "(II)I")
    public static final int method87(int arg0, int arg1) {
        if (arg0 != -21557) {
            method86(98, 81, -64, -49, 24, 30);
        }
        field196++;
        return arg1 >>> 8;
    }
}
