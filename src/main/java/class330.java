import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class330 extends class426 {

    @OriginalMember(owner = "client!kn", name = "P", descriptor = "I")
    public int field4945 = 0;

    @OriginalMember(owner = "client!kn", name = "K", descriptor = "I")
    public static int field4940 = 0;

    @OriginalMember(owner = "client!kn", name = "L", descriptor = "I")
    public static int field4941;

    @OriginalMember(owner = "client!kn", name = "M", descriptor = "I")
    public static int field4942;

    @OriginalMember(owner = "client!kn", name = "N", descriptor = "I")
    public static int field4943;

    @OriginalMember(owner = "client!kn", name = "O", descriptor = "I")
    public static int field4944;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IIIBII)V")
    public static final void method2027(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5) {
        field4944++;
        int var6 = 0;
        int var7 = arg1;
        int var8 = arg2 * arg2;
        int var9 = arg1 * arg1;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg1 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var9 - (var12 - 1) * var11;
        int var15 = var8 << 2;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var10;
        int var18 = ((arg1 << 1) - 3) * var11;
        int var19 = (var6 + 1) * var16;
        int var20 = 24 % ((63 - arg3) / 55);
        int var21 = (arg1 - 1) * var15;
        if (arg4 >= class189.field2831 && class204.field3060 >= arg4) {
            int var22 = class198.method1192(class192.field2917, class39.field497, arg2 + arg5, -3);
            int var23 = class198.method1192(class192.field2917, class39.field497, arg5 - arg2, -3);
            class379.method2285(127, class292.field4448[arg4], var22, arg0, var23);
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
                var17 += var16;
                var19 += var16;
            }
            var13 += -var21;
            var14 += -var18;
            var7--;
            var21 -= var15;
            var18 -= var15;
            int var24 = arg4 - var7;
            int var25 = arg4 + var7;
            if (var25 >= class189.field2831 && var24 <= class204.field3060) {
                int var26 = class198.method1192(class192.field2917, class39.field497, arg5 + var6, -3);
                int var27 = class198.method1192(class192.field2917, class39.field497, arg5 - var6, -3);
                if (var24 >= class189.field2831) {
                    class379.method2285(125, class292.field4448[var24], var26, arg0, var27);
                }
                if (class204.field3060 >= var25) {
                    class379.method2285(127, class292.field4448[var25], var26, arg0, var27);
                }
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILjava/util/Random;)I")
    public static final int method2028(int arg0, int arg1, Random arg2) {
        field4941++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        } else if (class146.method914((byte) -91, arg1)) {
            return (int) (((long) arg2.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        } else {
            int var3 = -126 / ((arg0 + 18) / 36);
            int var4 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
            int var5;
            do {
                var5 = arg2.nextInt();
            } while (var4 <= var5);
            return class49.method270(var5, true, arg1);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILef;I)V")
    private final void method2029(int arg0, class385 arg1, int arg2) {
        field4942++;
        if (arg2 == 2) {
            this.field4945 = arg1.method2323(-103);
        }
        if (arg0 != 0) {
            field4940 = -35;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZLef;)V")
    public final void method2030(boolean arg0, class385 arg1) {
        while (true) {
            int var3 = arg1.method2343(255);
            if (var3 == 0) {
                if (!arg0) {
                    this.method2030(true, (class385) null);
                }
                field4943++;
                return;
            }
            this.method2029(0, arg1, var3);
        }
    }
}
