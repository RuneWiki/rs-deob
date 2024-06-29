import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class613 {

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "Z")
    public static boolean field8533 = true;

    @OriginalMember(owner = "client!nw", name = "b", descriptor = "I")
    public static int field8534;

    @OriginalMember(owner = "client!nw", name = "c", descriptor = "I")
    private int field8535;

    @OriginalMember(owner = "client!nw", name = "d", descriptor = "I")
    public static int field8536;

    @OriginalMember(owner = "client!nw", name = "e", descriptor = "I")
    public int field8537;

    @OriginalMember(owner = "client!nw", name = "f", descriptor = "I")
    public int field8538;

    @OriginalMember(owner = "client!nw", name = "g", descriptor = "I")
    public static int field8539;

    @OriginalMember(owner = "client!nw", name = "i", descriptor = "I")
    public static int field8541;

    @OriginalMember(owner = "client!nw", name = "j", descriptor = "I")
    public static int field8542;

    @OriginalMember(owner = "client!nw", name = "k", descriptor = "I")
    public static int field8543;

    @OriginalMember(owner = "client!nw", name = "h", descriptor = "Lgr;")
    public class460 field8540;

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(I)V", line = 4)
    public static final void method3469(int arg0) {
        class290.field4000.method338((byte) -101);
        field8543++;
        class307.field4201.method338((byte) -89);
        if (arg0 != -474) {
            method3470(102, 79, 119, (byte) -61, -49, 21);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(IIIBII)V", line = 21)
    public static final void method3470(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field8536++;
        int var6 = 0;
        int var7 = arg0;
        int var8 = arg5 * arg5;
        int var9 = arg0 * arg0;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg0 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = -68 % ((arg3 - 47) / 55);
        int var19 = ((arg0 << 1) - 3) * var11;
        int var20 = (var6 + 1) * var16;
        int var21 = (arg0 - 1) * var15;
        if (arg2 >= class223.field3260 && class706.field9700 >= arg2) {
            int var22 = class748.method4155(class268.field3766, 16, arg4 + arg5, class236.field3392);
            int var23 = class748.method4155(class268.field3766, 16, arg4 - arg5, class236.field3392);
            class679.method3826(class298.field4105[arg2], var22, 11, var23, arg1);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var20;
                    var17 += var16;
                    var20 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var20;
                var6++;
                var20 += var16;
                var17 += var16;
            }
            var13 += -var21;
            var14 += -var19;
            var21 -= var15;
            var7--;
            var19 -= var15;
            int var24 = arg2 - var7;
            int var25 = arg2 + var7;
            if (var25 >= class223.field3260 && class706.field9700 >= var24) {
                int var26 = class748.method4155(class268.field3766, 16, arg4 + var6, class236.field3392);
                int var27 = class748.method4155(class268.field3766, 16, arg4 - var6, class236.field3392);
                if (class223.field3260 <= var24) {
                    class679.method3826(class298.field4105[var24], var26, 11, var27, arg1);
                }
                if (var25 <= class706.field9700) {
                    class679.method3826(class298.field4105[var25], var26, 11, var27, arg1);
                }
            }
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Z)Lgs;", line = 123)
    public final synchronized class49 method3471(boolean arg0) {
        field8539++;
        class49 var2 = (class49) this.field8540.field6255.method266((byte) -111, (long) this.field8535);
        if (var2 != null) {
            return var2;
        }
        class49 var3 = class49.method366(this.field8540.field6245, this.field8535, 0);
        if (var3 != null) {
            this.field8540.field6255.method270(var3, (long) this.field8535, -126);
        }
        if (!arg0) {
            this.method3472(null, -106);
        }
        return var3;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(Lfca;I)V", line = 146)
    public final void method3472(class93 arg0, int arg1) {
        while (true) {
            int var3 = arg0.method793((byte) 116);
            if (var3 == 0) {
                field8541++;
                if (arg1 > -54) {
                    this.method3474((byte) 34, null, -65);
                    return;
                }
                return;
            }
            this.method3474((byte) -108, arg0, var3);
        }
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(ILfca;)Luo;", line = 167)
    public static final class603 method3473(int arg0, class93 arg1) {
        field8542++;
        int var2 = arg1.method773(3);
        return arg0 == 0 ? new class603(var2) : null;
    }

    @OriginalMember(owner = "client!nw", name = "a", descriptor = "(BLfca;I)V", line = 186)
    private final void method3474(byte arg0, class93 arg1, int arg2) {
        if (arg0 > -20) {
            this.field8535 = 52;
        }
        if (arg2 == 1) {
            this.field8535 = arg1.method763(-25);
        } else if (arg2 == 2) {
            this.field8538 = arg1.method793((byte) 36);
            this.field8537 = arg1.method793((byte) 56);
        }
        field8534++;
    }
}
