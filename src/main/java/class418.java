import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ht")
public abstract class class418 {

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "[I")
    public static int[] field5942 = new int[200];

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(I)Lss;")
    public abstract class303 method1000(int arg0);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(ZI)V")
    public abstract void method1002(boolean arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(II)[B")
    public abstract byte[] method1005(int arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(I)V")
    public static void method2493(int arg0) {
        if (arg0 > -92) {
            method2494(-67, 39, (byte) -82, -53, 18, 23);
        }
        field5942 = null;
    }

    @OriginalMember(owner = "client!ht", name = "b", descriptor = "(II)I")
    public abstract int method1009(int arg0, int arg1);

    @OriginalMember(owner = "client!ht", name = "a", descriptor = "(IIBIII)V")
    public static final void method2494(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        field5943++;
        int var6 = 0;
        int var7 = arg4;
        int var8 = arg5 * arg5;
        int var9 = arg4 * arg4;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg4 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg4 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg4 - 1) * var15;
        int var21 = -94 / ((6 - arg2) / 63);
        class479.method2839(arg0 + arg5, -arg5 + arg0, class271.field4078[arg3], 67, arg1);
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
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var7--;
            var20 -= var15;
            int var22 = arg3 - var7;
            int var23 = arg3 + var7;
            int var24 = arg0 + var6;
            int var25 = arg0 - var6;
            class479.method2839(var24, var25, class271.field4078[var22], 115, arg1);
            class479.method2839(var24, var25, class271.field4078[var23], 84, arg1);
        }
    }
}
