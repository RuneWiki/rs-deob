import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class384 extends class83 {

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "I")
    public static int field5481 = 0;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field5479;

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "I")
    public static int field5480;

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "I")
    public static int field5482;

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "I")
    public static int field5483;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field5484;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "I")
    public static int field5485;

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V")
    public class384() {
        super(0, true);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)V")
    public static final void method2383(int arg0, byte arg1) {
        ++field5483;
        if (arg1 == -114) {
            class114 var2 = class414.field5971;
            synchronized (class414.field5971) {
                class414.field5971.method614(arg1 ^ 11, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(II)[I")
    public final int[] method37(int arg0, int arg1) {
        ++field5485;
        int[] var3 = super.field916.method1813(arg1, (byte) -105);
        if (arg0 != 2) {
            method2383(-9, (byte) -108);
        }
        if (super.field916.field4174) {
            int var4 = class225.field3036[arg1];
            for (int var5 = 0; class420.field6139 > var5; ++var5) {
                var3[var5] = this.method2385(4096, var4, class402.field5863[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BLfd;)V")
    public static final void method2384(byte arg0, class194 arg1) {
        ++field5480;
        if (arg0 > -104) {
            field5482 = 118;
        }
        class194 var2 = class130.method699(arg1, 91);
        int var3;
        int var4;
        if (var2 != null) {
            var3 = var2.field2501;
            var4 = var2.field2460;
        } else {
            var4 = class337.field4496;
            var3 = class333.field4423;
        }
        class32.method148(arg1, false, 5, var3, var4);
        class451.method2801(var4, var3, arg1, 126);
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(III)I")
    private final int method2385(int arg0, int arg1, int arg2) {
        ++field5479;
        int var4 = arg1 * 57 + arg2;
        int var5 = var4 << 1 ^ var4;
        if (arg0 != 4096) {
            method2383(-72, (byte) -84);
        }
        return -(((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144) + 4096;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BIII)I")
    public static final int method2386(byte arg0, int arg1, int arg2, int arg3) {
        if (arg0 != -113) {
            return 109;
        } else {
            if (~arg3 >= -244) {
                if (~arg3 < -218) {
                    arg1 >>= 3;
                } else if (arg3 <= 192) {
                    if (~arg3 < -180) {
                        arg1 >>= 1;
                    }
                } else {
                    arg1 >>= 2;
                }
            } else {
                arg1 >>= 4;
            }
            ++field5484;
            return (arg3 >> 1) + (arg1 >> 5 << 7) + (arg2 >> 2 << 10);
        }
    }
}
