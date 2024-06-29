import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class333 {

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "Lsh;")
    public static class472 field4976 = new class472(12, 12);

    @OriginalMember(owner = "client!bj", name = "b", descriptor = "I")
    public static int field4977;

    @OriginalMember(owner = "client!bj", name = "c", descriptor = "I")
    public static int field4978;

    @OriginalMember(owner = "client!bj", name = "d", descriptor = "I")
    public static int field4979;

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IIIBI)V")
    public static final void method2039(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field4977++;
        if (arg3 != -62) {
            method2042(65);
        }
        int var5 = 0;
        int var6 = arg2;
        int var7 = -arg2;
        int var8 = -1;
        int var9 = class352.method2172(arg1 + arg2, class119.field1643, class293.field4420, 0);
        int var10 = class352.method2172(arg1 - arg2, class119.field1643, class293.field4420, 0);
        class345.method2125(false, class49.field723[arg0], var10, var9, arg4);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (var7 > 0) {
                var6--;
                var7 -= var6 << 1;
                int var11 = arg0 - var6;
                int var12 = arg0 + var6;
                if (var12 >= class176.field2503 && class296.field4443 >= var11) {
                    int var13 = class352.method2172(arg1 + var5, class119.field1643, class293.field4420, 0);
                    int var14 = class352.method2172(arg1 - var5, class119.field1643, class293.field4420, 0);
                    if (var12 <= class296.field4443) {
                        class345.method2125(false, class49.field723[var12], var14, var13, arg4);
                    }
                    if (var11 >= class176.field2503) {
                        class345.method2125(false, class49.field723[var11], var14, var13, arg4);
                    }
                }
            }
            var5++;
            int var15 = arg0 - var5;
            int var16 = arg0 + var5;
            if (var16 >= class176.field2503 && var15 <= class296.field4443) {
                int var17 = class352.method2172(arg1 + var6, class119.field1643, class293.field4420, 0);
                int var18 = class352.method2172(arg1 - var6, class119.field1643, class293.field4420, 0);
                if (var16 <= class296.field4443) {
                    class345.method2125(false, class49.field723[var16], var18, var17, arg4);
                }
                if (var15 >= class176.field2503) {
                    class345.method2125(false, class49.field723[var15], var18, var17, arg4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(IILje;ZIILus;II)V")
    public static final void method2040(int arg0, int arg1, class178 arg2, boolean arg3, int arg4, int arg5, class401 arg6, int arg7, int arg8) {
        field4978++;
        int var9 = arg1 * arg1 + arg8 * arg8;
        if (arg0 < var9) {
            return;
        }
        int var10 = Math.min(arg2.field2595 / 2, arg2.field2589 / 2);
        if (arg3) {
            method2041((class451) null, (byte) 99);
        }
        if (var10 * var10 >= var9) {
            class109.method801(arg2, arg1, class362.field5484[arg7], arg6, arg5, arg4, arg8, 1);
            return;
        }
        var10 -= 10;
        int var11;
        if (class469.field6596 == 4) {
            var11 = (int) class384.field5682 & 0x3FFF;
        } else {
            var11 = (int) class384.field5682 + class347.field5291 & 0x3FFF;
        }
        int var12 = class172.field2450[var11];
        int var13 = class172.field2456[var11];
        if (class469.field6596 != 4) {
            var12 = var12 * 256 / (class358.field5437 + 256);
            var13 = var13 * 256 / (class358.field5437 + 256);
        }
        int var14 = arg8 * var12 + (arg1 * var13) >> 15;
        int var15 = arg8 * var13 - (arg1 * var12) >> 15;
        double var16 = Math.atan2((double) var14, (double) var15);
        int var18 = (int) ((double) var10 * Math.sin(var16));
        int var19 = (int) (Math.cos(var16) * (double) var10);
        class8.field129[arg7].method1961((float) arg2.field2595 / 2.0F + (float) arg4 + (float) var18, (float) arg2.field2589 / 2.0F + (float) arg5 - (float) var19, 4096, (int) (-var16 / 6.283185307179586D * 65535.0D));
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(Lui;B)V")
    public static final void method2041(class451 arg0, byte arg1) {
        if (arg1 == 39) {
            class384.field5691 = arg0.method2676("titlebg", (byte) -40);
            field4979++;
            class380.field5649 = arg0.method2676("logo", (byte) -103);
        }
    }

    @OriginalMember(owner = "client!bj", name = "a", descriptor = "(I)V")
    public static void method2042(int arg0) {
        if (arg0 <= 25) {
            method2042(-116);
        }
        field4976 = null;
    }
}
