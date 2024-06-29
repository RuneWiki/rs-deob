import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public abstract class class670 extends class333 {

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "I")
    public int field9338;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "F")
    public float field9332;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "I")
    public int field9327;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    private int field9333;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public int field9336;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "I")
    private int field9335;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "Lcq;")
    public static class110 field9328 = new class110(114, -2);

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "Lcq;")
    public static class110 field9342 = new class110(19, -2);

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field9329;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    public static int field9330;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field9331;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "I")
    public static int field9334;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field9337;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field9339;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field9340;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field9341;

    @OriginalMember(owner = "client!eq", name = "A", descriptor = "I")
    public static int field9343;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)I")
    public final int method3703(byte arg0) {
        if (arg0 != -29) {
            this.method3708((byte) 9);
        }
        field9339++;
        return this.field9336;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(FI)V")
    public abstract void method258(float arg0, int arg1);

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(B)F")
    public final float method3704(byte arg0) {
        if (arg0 == -94) {
            field9334++;
            return this.field9332;
        } else {
            return -1.3096899F;
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIZI)V")
    public static final void method3705(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5) {
        field9340++;
        int var6 = 0;
        int var7 = arg3;
        int var8 = arg2 * arg2;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        if (!arg4) {
            return;
        }
        int var14 = var9 - ((var12 - 1) * var11);
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg3 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = (arg3 - 1) * var15;
        if (class93.field949 <= arg5 && class360.field4834 >= arg5) {
            int var21 = class266.method1567(class412.field5526, true, class72.field740, arg0 + arg2);
            int var22 = class266.method1567(class412.field5526, arg4, class72.field740, arg0 - arg2);
            class315.method1809(class557.field7954[arg5], arg1, -128, var22, var21);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var14 += var19;
                    var17 += var16;
                    var19 += var16;
                    var6++;
                }
            }
            if (var14 < 0) {
                var13 += var17;
                var14 += var19;
                var19 += var16;
                var17 += var16;
                var6++;
            }
            var13 += -var20;
            var14 += -var18;
            var20 -= var15;
            var18 -= var15;
            var7--;
            int var23 = arg5 - var7;
            int var24 = arg5 + var7;
            if (var24 >= class93.field949 && var23 <= class360.field4834) {
                int var25 = class266.method1567(class412.field5526, true, class72.field740, arg0 + var6);
                int var26 = class266.method1567(class412.field5526, true, class72.field740, arg0 - var6);
                if (var23 >= class93.field949) {
                    class315.method1809(class557.field7954[var23], arg1, -128, var26, var25);
                }
                if (class360.field4834 >= var24) {
                    class315.method1809(class557.field7954[var24], arg1, -128, var26, var25);
                }
            }
        }
    }

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "(B)I")
    public final int method3706(byte arg0) {
        int var2 = -81 % ((arg0 - 61) / 57);
        field9341++;
        return this.field9338;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIB)V")
    public abstract void method257(int arg0, int arg1, int arg2, byte arg3);

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "(B)Z")
    public static final boolean method3707(byte arg0) {
        field9331++;
        if (arg0 != -76) {
            field9342 = null;
        }
        return class661.field9266 > 0;
    }

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "(B)I")
    public final int method3708(byte arg0) {
        if (arg0 != 83) {
            method3709(62);
        }
        field9329++;
        return this.field9333;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    public static void method3709(int arg0) {
        if (arg0 != -1) {
            method3709(69);
        }
        field9328 = null;
        field9342 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Z)I")
    public final int method3710(boolean arg0) {
        field9337++;
        return arg0 ? 26 : this.field9335;
    }

    @OriginalMember(owner = "client!eq", name = "<init>", descriptor = "(IIIIIF)V")
    public class670(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        this.field9338 = arg2;
        this.field9332 = arg5;
        this.field9327 = arg0;
        this.field9333 = arg3;
        this.field9336 = arg1;
        this.field9335 = arg4;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(I)I")
    public final int method3711(int arg0) {
        if (arg0 != 1795643394) {
            this.field9335 = -105;
        }
        field9330++;
        return this.field9327;
    }
}
