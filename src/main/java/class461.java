import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fa")
public class class461 extends class467 {

    @OriginalMember(owner = "client!fa", name = "p", descriptor = "I")
    public int field6757;

    @OriginalMember(owner = "client!fa", name = "s", descriptor = "I")
    public int field6760;

    @OriginalMember(owner = "client!fa", name = "n", descriptor = "I")
    public static int field6755 = 0;

    @OriginalMember(owner = "client!fa", name = "t", descriptor = "Lpg;")
    public static class492 field6761 = new class492(95, 6);

    @OriginalMember(owner = "client!fa", name = "o", descriptor = "I")
    public static int field6756;

    @OriginalMember(owner = "client!fa", name = "q", descriptor = "I")
    public static int field6758;

    @OriginalMember(owner = "client!fa", name = "r", descriptor = "I")
    public static int field6759;

    @OriginalMember(owner = "client!fa", name = "u", descriptor = "I")
    public static int field6762;

    @OriginalMember(owner = "client!fa", name = "v", descriptor = "I")
    public static int field6763;

    @OriginalMember(owner = "client!fa", name = "w", descriptor = "I")
    public static int field6764;

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIIIIII)V", line = 4)
    public static final void method2763(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field6756++;
        class192.method1353(arg2, arg1, arg4, arg0, 0, 14631, arg7, arg6, arg8, arg5);
        if (arg3 != -161) {
            method2765(-96, -66, -92, 36, 57, -78);
        }
    }

    @OriginalMember(owner = "client!fa", name = "b", descriptor = "(I)V", line = 19)
    public static void method2764(int arg0) {
        if (arg0 == -161) {
            field6761 = null;
        }
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IIIIII)V", line = 29)
    public static final void method2765(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field6762++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg3 * arg3;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (arg0 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        if (class410.field6176 <= arg5 && arg5 <= class158.field2302) {
            int var21 = class278.method1758(class443.field6591, class396.field6021, arg1 + arg3, arg0 + -77);
            int var22 = class278.method1758(class443.field6591, class396.field6021, arg1 - arg3, -70);
            class271.method1736(var21, arg2, var22, -11, class23.field356[arg5]);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var19 += var16;
                    var6++;
                    var17 += var16;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var17 += var16;
                var19 += var16;
                var6++;
            }
            var14 += -var18;
            var13 += -var20;
            var7--;
            var18 -= var15;
            var20 -= var15;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class410.field6176 && var23 <= class158.field2302) {
                int var25 = class278.method1758(class443.field6591, class396.field6021, arg1 + var6, -71);
                int var26 = class278.method1758(class443.field6591, class396.field6021, arg1 - var6, -83);
                if (class410.field6176 <= var23) {
                    class271.method1736(var25, arg2, var26, -11, class23.field356[var23]);
                }
                if (var24 <= class158.field2302) {
                    class271.method1736(var25, arg2, var26, arg0 - 12, class23.field356[var24]);
                }
            }
        }
    }

    @OriginalMember(owner = "client!fa", name = "<init>", descriptor = "(II)V", line = 127)
    public class461(int arg0, int arg1) {
        this.field6757 = arg0;
        this.field6760 = arg1;
    }

    @OriginalMember(owner = "client!fa", name = "a", descriptor = "(IC)Z", line = 136)
    public static final boolean method2766(int arg0, char arg1) {
        field6758++;
        if (arg0 == 95) {
            return arg1 == ' ' || arg1 == ' ' || arg1 == '_' || arg1 == '-';
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!fa", name = "c", descriptor = "(I)V", line = 150)
    public static final void method2767(int arg0) {
        class12.field201 = 0;
        field6763++;
        if (arg0 != 21492) {
            field6764 = 119;
        }
        class96.field1395.method1959((byte) 113);
        class455.field6680 = false;
    }
}
