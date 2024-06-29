import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vq")
public class class269 {

    @OriginalMember(owner = "client!vq", name = "c", descriptor = "I")
    public static int field3745 = 13156520;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "I")
    public static int field3743;

    @OriginalMember(owner = "client!vq", name = "b", descriptor = "I")
    public int field3744;

    @OriginalMember(owner = "client!vq", name = "d", descriptor = "I")
    public int field3746;

    @OriginalMember(owner = "client!vq", name = "e", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!vq", name = "f", descriptor = "I")
    public static int field3748;

    @OriginalMember(owner = "client!vq", name = "g", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!vq", name = "h", descriptor = "I")
    public int field3750;

    @OriginalMember(owner = "client!vq", name = "i", descriptor = "I")
    public static int field3751;

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lkh;I)V", line = 4)
    public final void method1770(class11 arg0, int arg1) {
        field3748++;
        if (arg1 <= 13) {
            method1772(-27, 118, 40, -123, 62, -99);
        }
        while (true) {
            int var3 = arg0.method172((byte) 52);
            if (var3 == 0) {
                return;
            }
            this.method1771(arg0, 93, var3);
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(Lkh;II)V", line = 28)
    private final void method1771(class11 arg0, int arg1, int arg2) {
        field3743++;
        if (arg2 == 1) {
            this.field3744 = arg0.method174(255);
            this.field3746 = arg0.method172((byte) 52);
            this.field3750 = arg0.method172((byte) 52);
        }
        if (arg1 < 92) {
            field3749 = -100;
        }
    }

    @OriginalMember(owner = "client!vq", name = "a", descriptor = "(IIIIII)V", line = 59)
    public static final void method1772(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field3747++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg5 * arg5;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        if (arg0 != -907270302) {
            return;
        }
        int var20 = (arg1 - 1) * var15;
        class295.method1924(3289650, class296.field4138[arg4], arg2 + arg5, arg3, arg2 - arg5);
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var14 += var19;
                    var13 += var17;
                    var17 += var16;
                    var6++;
                    var19 += var16;
                }
            }
            if (var14 < 0) {
                var14 += var19;
                var13 += var17;
                var6++;
                var17 += var16;
                var19 += var16;
            }
            var14 += -var18;
            var13 += -var20;
            var18 -= var15;
            var20 -= var15;
            var7--;
            int var21 = arg4 - var7;
            int var22 = arg4 + var7;
            int var23 = arg2 + var6;
            int var24 = arg2 - var6;
            class295.method1924(3289650, class296.field4138[var21], var23, arg3, var24);
            class295.method1924(3289650, class296.field4138[var22], var23, arg3, var24);
        }
    }
}
