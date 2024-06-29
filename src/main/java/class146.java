import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class146 implements Runnable {

    @OriginalMember(owner = "client!ne", name = "j", descriptor = "[Lpg;")
    public volatile class168[] field2575 = new class168[2];

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "Z")
    public volatile boolean field2569 = false;

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "Z")
    public volatile boolean field2571 = false;

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "I")
    public static volatile int field2568 = 0;

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "Ldj;")
    private static class44 field2570 = class89.method650(255, "flash2:");

    @OriginalMember(owner = "client!ne", name = "b", descriptor = "Ldj;")
    public static class44 field2567 = field2570;

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "Ldj;")
    public static class44 field2572 = field2570;

    @OriginalMember(owner = "client!ne", name = "n", descriptor = "Ldj;")
    public static class44 field2579 = null;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "I")
    public static int field2566;

    @OriginalMember(owner = "client!ne", name = "h", descriptor = "I")
    public static int field2573;

    @OriginalMember(owner = "client!ne", name = "i", descriptor = "I")
    public static int field2574;

    @OriginalMember(owner = "client!ne", name = "l", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!ne", name = "k", descriptor = "Lnf;")
    public static class147 field2576;

    @OriginalMember(owner = "client!ne", name = "m", descriptor = "Lvi;")
    public class229 field2578;

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IIIIIII)V")
    public static final void method954(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field2573++;
        int var7 = class201.method1296(class14.field267, -126, arg0, class57.field1068);
        int var8 = class201.method1296(class14.field267, -126, arg2, class57.field1068);
        int var9 = class201.method1296(class70.field1337, -125, arg3, class70.field1321);
        int var10 = class201.method1296(class70.field1337, -127, arg6, class70.field1321);
        int var11 = class201.method1296(class14.field267, -126, arg0 + arg4, class57.field1068);
        int var12 = class201.method1296(class14.field267, -126, arg2 - arg4, class57.field1068);
        if (arg1 != 0) {
            method955(-35, 31);
        }
        for (int var13 = var7; var13 < var11; var13++) {
            class42.method290(class108.field1979[var13], -7, var9, var10, arg5);
        }
        for (int var14 = var8; var14 > var12; var14--) {
            class42.method290(class108.field1979[var14], arg1 - 7, var9, var10, arg5);
        }
        int var15 = class201.method1296(class70.field1337, -125, arg3 + arg4, class70.field1321);
        int var16 = class201.method1296(class70.field1337, -126, arg6 - arg4, class70.field1321);
        for (int var17 = var11; var17 <= var12; var17++) {
            int[] var18 = class108.field1979[var17];
            class42.method290(var18, -7, var9, var15, arg5);
            class42.method290(var18, -7, var16, var10, arg5);
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)I")
    public static final int method955(int arg0, int arg1) {
        double var2 = (double) (arg0 >> 16 & 0xFF) / 256.0D;
        int var4 = -56 % ((arg1 - 2) / 32);
        field2566++;
        double var5 = (double) (arg0 >> 8 & 0xFF) / 256.0D;
        double var7 = (double) (arg0 & 0xFF) / 256.0D;
        double var9 = var2;
        double var11 = var2;
        if (var5 > var2) {
            var9 = var5;
        }
        if (var9 < var7) {
            var9 = var7;
        }
        double var13 = 0.0D;
        if (var2 > var5) {
            var11 = var5;
        }
        if (var11 > var7) {
            var11 = var7;
        }
        double var15 = 0.0D;
        double var17 = (var9 + var11) / 2.0D;
        if (var9 != var11) {
            if (var17 < 0.5D) {
                var15 = (var9 - var11) / (var9 + var11);
            }
            if (var17 >= 0.5D) {
                var15 = (var9 - var11) / (2.0D - var9 - var11);
            }
            if (var2 == var9) {
                var13 = (var5 - var7) / (-var11 + var9);
            } else if (var5 == var9) {
                var13 = (var7 - var2) / (-var11 + var9) + 2.0D;
            } else if (var7 == var9) {
                var13 = (var2 - var5) / (-var11 + var9) + 4.0D;
            }
        }
        int var19 = (int) (var15 * 256.0D);
        if (var19 < 0) {
            var19 = 0;
        } else if (var19 > 255) {
            var19 = 255;
        }
        int var20 = (int) (var17 * 256.0D);
        if (var20 < 0) {
            var20 = 0;
        } else if (var20 > 255) {
            var20 = 255;
        }
        if (var20 > 243) {
            var19 >>= 0x4;
        } else if (var20 > 217) {
            var19 >>= 0x3;
        } else if (var20 > 192) {
            var19 >>= 0x2;
        } else if (var20 > 179) {
            var19 >>= 0x1;
        }
        double var21 = var13 / 6.0D;
        int var23 = (int) (var21 * 256.0D);
        return (var23 >> 2 << 10) + (var19 >> 5 << 7) + (var20 >> 1);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Ldj;I)Z")
    public static final boolean method956(class44 arg0, int arg1) {
        field2577++;
        if (arg0 == null) {
            return false;
        }
        for (int var2 = arg1; var2 < class117.field2085; var2++) {
            if (arg0.method330(class174.field3026[var2], true)) {
                return true;
            }
        }
        return arg0.method330(class96.field1774.field395, true);
    }

    @OriginalMember(owner = "client!ne", name = "run", descriptor = "()V")
    public final void run() {
        this.field2571 = true;
        try {
            while (!this.field2569) {
                for (int var1 = 0; var1 < 2; var1++) {
                    class168 var2 = this.field2575[var1];
                    if (var2 != null) {
                        var2.method1063(-117);
                    }
                }
                class82.method617((byte) 31, 10L);
                class220.method1425(null, -57, this.field2578);
            }
        } catch (Exception var9) {
            class173.method1099(118, null, var9);
        } finally {
            Object var6 = null;
            this.field2571 = false;
        }
        field2574++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(I)V")
    public static void method957(int arg0) {
        field2579 = null;
        field2570 = null;
        field2572 = null;
        field2567 = null;
        field2576 = null;
        int var1 = -37 / ((arg0 - 47) / 58);
    }
}
