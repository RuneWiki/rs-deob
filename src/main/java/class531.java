import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ue")
public abstract class class531 {

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "I")
    public static int field7339;

    @OriginalMember(owner = "client!ue", name = "c", descriptor = "I")
    public static int field7341;

    @OriginalMember(owner = "client!ue", name = "b", descriptor = "Lxa;")
    public static class424 field7340;

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IILrq;)V")
    public static final void method3014(int arg0, int arg1, class39 arg2) {
        field7341++;
        if (arg1 != -28385) {
            field7340 = null;
        }
        int var3 = -1;
        int var4 = 0;
        if (arg2.field424 > class430.field5984) {
            class374.method2282((byte) -119, arg2);
        } else if (arg2.field496 >= class430.field5984) {
            class509.method2878(arg2, (byte) 125);
        } else {
            class506.method2865(false, 0, arg2);
            var3 = class660.field9342;
            var4 = class224.field2917;
        }
        if (arg2.field3929 < 512 || arg2.field3917 < 512 || arg2.field3929 >= class588.field8082 * 512 - 512 || arg2.field3917 >= (class12.field113 * 512 - 512)) {
            var4 = 0;
            arg2.field424 = 0;
            arg2.field444 = -1;
            var3 = -1;
            arg2.field496 = 0;
            arg2.field453 = -1;
            arg2.field459 = -1;
            arg2.field3929 = arg2.field526[0] * 512 + (arg2.method241(-25747) * 256);
            arg2.field3917 = arg2.field516[0] * 512 + (arg2.method241(-25747) * 256);
            arg2.method228((byte) 4);
        }
        if (class596.field8164 == arg2 && (arg2.field3929 < 6144 || arg2.field3917 < 6144 || (class588.field8082 - 12) * 512 <= arg2.field3929 || arg2.field3917 >= (class12.field113 - 12) * 512)) {
            arg2.field453 = -1;
            var3 = -1;
            var4 = 0;
            arg2.field444 = -1;
            arg2.field424 = 0;
            arg2.field496 = 0;
            arg2.field459 = -1;
            arg2.field3929 = arg2.field526[0] * 512 + (arg2.method241(-25747) * 256);
            arg2.field3917 = arg2.field516[0] * 512 + (arg2.method241(arg1 ^ 0xA72) * 256);
            arg2.method228((byte) 4);
        }
        int var5 = class594.method3299(256, arg2);
        class691.method3827(var5, var3, var4, arg2, true);
        class287.method1718((byte) -75, arg2);
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(Ldga;I)Lns;")
    public static final class225 method3015(class138 arg0, int arg1) {
        if (arg1 != 12) {
            method3017(0);
        }
        field7339++;
        return new class225(arg0.method924(2), arg0.method924(2), arg0.method924(2), arg0.method924(arg1 ^ 0xE), arg0.method904(127), arg0.method904(126), arg0.method957((byte) -83));
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IFI[FIFIFIIF)V")
    public abstract void method1168(int arg0, float arg1, int arg2, float[] arg3, int arg4, float arg5, int arg6, float arg7, int arg8, int arg9, float arg10);

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method3016(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class236.field3074[arg0][var8][var14] == -class675.field9559) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << class428.field5949) + 1;
            int var10 = (arg3 << class428.field5949) + 2;
            int var11 = class397.field5666[arg0].method150(arg1, arg3) + arg5;
            if (!class38.method223(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << class428.field5949) - 1;
            if (!class38.method223(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << class428.field5949) - 1;
            if (!class38.method223(var9, var11, var13)) {
                return false;
            } else if (class38.method223(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class388.method2325(arg0, arg1, arg3)) {
            int var6 = arg1 << class428.field5949;
            int var7 = arg3 << class428.field5949;
            return class38.method223(var6 + 1, class397.field5666[arg0].method150(arg1, arg3) + arg5, var7 + 1) && class38.method223(class33.field327 + var6 - 1, class397.field5666[arg0].method150(arg1 + 1, arg3) + arg5, var7 + 1) && class38.method223(class33.field327 + var6 - 1, class397.field5666[arg0].method150(arg1 + 1, arg3 + 1) + arg5, class33.field327 + var7 - 1) && class38.method223(var6 + 1, class397.field5666[arg0].method150(arg1, arg3 + 1) + arg5, class33.field327 + var7 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!ue", name = "a", descriptor = "(I)V")
    public static void method3017(int arg0) {
        field7340 = null;
        if (arg0 != 0) {
            method3016(114, 45, 11, 93, 54, -98);
        }
    }
}
