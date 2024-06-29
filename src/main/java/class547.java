import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public abstract class class547 {

    @OriginalMember(owner = "client!qca", name = "c", descriptor = "[I")
    public static int[] field7486 = new int[2048];

    @OriginalMember(owner = "client!qca", name = "b", descriptor = "Lcb;")
    public static class318 field7485 = new class318(17, 8);

    @OriginalMember(owner = "client!qca", name = "d", descriptor = "I")
    public static int field7487;

    @OriginalMember(owner = "client!qca", name = "e", descriptor = "I")
    public static int field7488;

    @OriginalMember(owner = "client!qca", name = "f", descriptor = "I")
    public static int field7489;

    @OriginalMember(owner = "client!qca", name = "g", descriptor = "Lpq;")
    public static class159 field7490;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "[I")
    public static int[] field7484;

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(III)I", line = 4)
    public static final int method3076(int arg0, int arg1, int arg2) {
        if (arg1 <= 37) {
            return 97;
        } else {
            field7487++;
            int var3 = arg0 - 1 & arg2 >> 31;
            return ((arg2 >>> 31) + arg2) % arg0 + var3;
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(ZIIIII)V", line = 17)
    public static final void method3077(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field7488++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        if (arg0) {
            field7485 = null;
        }
        int var19 = (var6 + 1) * var16;
        class653.method3620(arg1 + arg2, -arg2 + arg1, arg0, arg5, class319.field4673[arg4]);
        int var20 = (arg3 - 1) * var15;
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
                var6++;
                var17 += var16;
            }
            var13 += -var20;
            var14 += -var18;
            var7--;
            var20 -= var15;
            var18 -= var15;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg1 + var6;
            int var24 = arg1 - var6;
            class653.method3620(var23, var24, false, arg5, class319.field4673[var21]);
            class653.method3620(var23, var24, false, arg5, class319.field4673[var22]);
        }
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(B)Z", line = 101)
    public static final boolean method3078(byte arg0) {
        if (arg0 > -103) {
            field7490 = null;
        }
        field7489++;
        return class426.field5921;
    }

    @OriginalMember(owner = "client!qca", name = "a", descriptor = "(I)V", line = 117)
    public static void method3079(int arg0) {
        field7490 = null;
        field7486 = null;
        field7485 = null;
        if (arg0 != 3) {
            field7486 = null;
        }
        field7484 = null;
    }
}
