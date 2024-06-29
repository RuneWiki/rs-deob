import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class42 {

    @OriginalMember(owner = "client!ji", name = "h", descriptor = "Lcf;")
    private static class93 field664 = class147.method1066("Attack", -48);

    @OriginalMember(owner = "client!ji", name = "f", descriptor = "Lcf;")
    public static class93 field662 = field664;

    @OriginalMember(owner = "client!ji", name = "e", descriptor = "I")
    public static int field661 = 0;

    @OriginalMember(owner = "client!ji", name = "k", descriptor = "Z")
    public static boolean field667 = true;

    @OriginalMember(owner = "client!ji", name = "j", descriptor = "I")
    public static int field666 = 0;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "I")
    public static int field657;

    @OriginalMember(owner = "client!ji", name = "b", descriptor = "I")
    public static int field658;

    @OriginalMember(owner = "client!ji", name = "d", descriptor = "I")
    public static int field660;

    @OriginalMember(owner = "client!ji", name = "i", descriptor = "I")
    public static int field665;

    @OriginalMember(owner = "client!ji", name = "l", descriptor = "I")
    public static int field668;

    @OriginalMember(owner = "client!ji", name = "n", descriptor = "I")
    public static int field670;

    @OriginalMember(owner = "client!ji", name = "m", descriptor = "J")
    public static long field669;

    @OriginalMember(owner = "client!ji", name = "g", descriptor = "[I")
    public static int[] field663;

    @OriginalMember(owner = "client!ji", name = "c", descriptor = "[[[B")
    public static byte[][][] field659;

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(I)V")
    public static void method236(int arg0) {
        field664 = null;
        field662 = null;
        field659 = null;
        if (arg0 == 0) {
            field663 = null;
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Lf;I)V")
    public static final void method237(class36 arg0, int arg1) {
        if (arg0.field552 != null) {
            arg0.field552.field3651 = 0;
        }
        field660++;
        arg0.field553 = false;
        int var2 = 30 % ((arg1 + 41) / 55);
        for (class36 var3 = arg0.method211(); var3 != null; var3 = arg0.method215()) {
            method237(var3, 104);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(Ljava/util/Random;ZI)I")
    public static final int method238(Random arg0, boolean arg1, int arg2) {
        field670++;
        if (arg2 <= 0) {
            throw new IllegalArgumentException();
        } else if (class162.method1172(1, arg2)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg2 >> 32);
        } else {
            if (arg1) {
                method238((Random) null, true, 84);
            }
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg2));
            int var4;
            do {
                var4 = arg0.nextInt();
            } while (var4 >= var3);
            return class156.method1119(-105, var4, arg2);
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IIIIII)V")
    public static final void method239(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var6 = arg0;
        field668++;
        int var7 = arg3;
        int var8 = arg1 * arg1;
        int var9 = arg3 * arg3;
        int var10 = var9 << 1;
        int var11 = var8 << 1;
        int var12 = arg3 << 1;
        int var13 = (1 - var12) * var8 + var10;
        int var14 = var8 << 2;
        int var15 = var9 - ((var12 - 1) * var11);
        int var16 = var9 << 2;
        int var17 = ((arg3 << 1) - 3) * var11;
        int var18 = ((arg0 << 1) + 3) * var10;
        int var19 = (arg0 + 1) * var16;
        int var20 = (arg3 - 1) * var14;
        if (class26.field342 <= arg4 && arg4 <= class271.field4820) {
            int var21 = class141.method1027(class277.field4967, arg1 + arg5, false, class147.field2593);
            int var22 = class141.method1027(class277.field4967, arg5 - arg1, false, class147.field2593);
            class58.method337(var22, class76.field1406[arg4], arg2, var21, false);
        }
        while (var7 > 0) {
            if (var13 < 0) {
                while (var13 < 0) {
                    var6++;
                    var13 += var18;
                    var18 += var16;
                    var15 += var19;
                    var19 += var16;
                }
            }
            if (var15 < 0) {
                var15 += var19;
                var6++;
                var19 += var16;
                var13 += var18;
                var18 += var16;
            }
            var13 += -var20;
            var15 += -var17;
            var20 -= var14;
            var7--;
            int var23 = arg4 - var7;
            var17 -= var14;
            int var24 = arg4 + var7;
            if (class26.field342 <= var24 && class271.field4820 >= var23) {
                int var25 = class141.method1027(class277.field4967, arg5 + var6, false, class147.field2593);
                int var26 = class141.method1027(class277.field4967, arg5 - var6, false, class147.field2593);
                if (var23 >= class26.field342) {
                    class58.method337(var26, class76.field1406[var23], arg2, var25, false);
                }
                if (class271.field4820 >= var24) {
                    class58.method337(var26, class76.field1406[var24], arg2, var25, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ji", name = "a", descriptor = "(IJZI)Z")
    public static final boolean method240(int arg0, long arg1, boolean arg2, int arg3) {
        int var5 = (int) (arg1 >>> 32) & Integer.MAX_VALUE;
        int var6 = (int) arg1 >> 20 & 0x3;
        field657++;
        int var7 = ((int) arg1 & 0x7F4FD) >> 14;
        if (var7 == 10 || var7 == 11 || var7 == 22) {
            class240 var8 = class34.method197(-125, var5);
            int var9;
            int var10;
            if (var6 == 0 || var6 == 2) {
                var10 = var8.field4285;
                var9 = var8.field4288;
            } else {
                var9 = var8.field4285;
                var10 = var8.field4288;
            }
            int var11 = var8.field4282;
            if (var6 != 0) {
                var11 = (var11 << var6 & 0xF) + (var11 >> 4 - var6);
            }
            class171.method1228(2, true, 117, 0, var10, arg3, class166.field2927.field3805[0], var9, 0, var11, class166.field2927.field3820[0], arg0);
        } else {
            class171.method1228(2, true, -55, var7 + 1, 0, arg3, class166.field2927.field3805[0], 0, var6, 0, class166.field2927.field3820[0], arg0);
        }
        class31.field497 = class58.field992;
        class129.field2270 = 2;
        if (arg2) {
            class60.field1022 = class193.field3527;
            class149.field2618 = 0;
            return true;
        } else {
            return true;
        }
    }
}
