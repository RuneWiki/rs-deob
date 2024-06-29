import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!de")
public class class247 {

    @OriginalMember(owner = "client!de", name = "a", descriptor = "[I")
    private int[] field4274;

    @OriginalMember(owner = "client!de", name = "e", descriptor = "J")
    public static long field4278 = 0L;

    @OriginalMember(owner = "client!de", name = "f", descriptor = "I")
    public static int field4279 = (int) (Math.random() * 33.0D) - 16;

    @OriginalMember(owner = "client!de", name = "k", descriptor = "Z")
    public static boolean field4284 = true;

    @OriginalMember(owner = "client!de", name = "c", descriptor = "I")
    public static int field4276;

    @OriginalMember(owner = "client!de", name = "h", descriptor = "I")
    public static int field4281;

    @OriginalMember(owner = "client!de", name = "i", descriptor = "I")
    public static int field4282;

    @OriginalMember(owner = "client!de", name = "j", descriptor = "I")
    public static int field4283;

    @OriginalMember(owner = "client!de", name = "d", descriptor = "Loe;")
    public static class256 field4277;

    @OriginalMember(owner = "client!de", name = "g", descriptor = "Z")
    public static boolean field4280;

    @OriginalMember(owner = "client!de", name = "b", descriptor = "[Lmj;")
    public static class129[] field4275;

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(I)I")
    public static final int method1617(int arg0) {
        field4281++;
        return arg0 == 16 ? 16 : 58;
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(Z[B)V")
    public static final void method1618(boolean arg0, byte[] arg1) {
        field4276++;
        class112 var2 = new class112(arg1);
        int var3 = var2.method731(!arg0);
        if (!arg0) {
            method1617(-60);
        }
        for (int var4 = 0; var4 < var3; var4++) {
            class4 var5 = new class4();
            class168 var6 = var2.method751((byte) -78);
            var5.field51 = var2.method731(false);
            var5.field47 = var2.method731(false);
            var5.field54 = var2.method758(arg0);
            var5.field52 = var6.method1100(47, (byte) -72, 32);
            var5.field49 = var6.method1091(-77, 47);
            class161.field2759.method311((byte) 16, var5);
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IIIIII)V")
    public static final void method1619(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field4283++;
        int var6 = 0;
        int var7 = arg5;
        int var8 = arg0 * arg0;
        int var9 = arg5 * arg5;
        int var10 = var8 << 1;
        int var11 = var9 << 1;
        int var12 = 53 / ((-arg1 - 21) / 40);
        int var13 = arg5 << 1;
        int var14 = var8 << 2;
        int var15 = (1 - var13) * var8 + var11;
        int var16 = var9 << 2;
        int var17 = ((var6 << 1) + 3) * var11;
        int var18 = var9 - (var13 - 1) * var10;
        int var19 = (arg5 - 1) * var14;
        int var20 = ((arg5 << 1) - 3) * var10;
        int var21 = (var6 + 1) * var16;
        if (class222.field3811 <= arg3 && class196.field3402 >= arg3) {
            int var22 = class97.method639(arg0 + arg2, (byte) 12, class174.field3055, class249.field4314);
            int var23 = class97.method639(arg2 - arg0, (byte) 12, class174.field3055, class249.field4314);
            class232.method1501(arg4, var23, (byte) -108, class241.field4117[arg3], var22);
        }
        while (var7 > 0) {
            if (var15 < 0) {
                while (var15 < 0) {
                    var18 += var21;
                    var6++;
                    var15 += var17;
                    var21 += var16;
                    var17 += var16;
                }
            }
            var7--;
            if (var18 < 0) {
                var18 += var21;
                var6++;
                var15 += var17;
                var21 += var16;
                var17 += var16;
            }
            int var24 = arg3 - var7;
            var18 += -var20;
            int var25 = arg3 + var7;
            var15 += -var19;
            var20 -= var14;
            var19 -= var14;
            if (var25 >= class222.field3811 && class196.field3402 >= var24) {
                int var26 = class97.method639(arg2 + var6, (byte) 12, class174.field3055, class249.field4314);
                int var27 = class97.method639(arg2 - var6, (byte) 12, class174.field3055, class249.field4314);
                if (class222.field3811 <= var24) {
                    class232.method1501(arg4, var27, (byte) -108, class241.field4117[var24], var26);
                }
                if (var25 <= class196.field3402) {
                    class232.method1501(arg4, var27, (byte) -108, class241.field4117[var25], var26);
                }
            }
        }
    }

    @OriginalMember(owner = "client!de", name = "b", descriptor = "(I)V")
    public static void method1620(int arg0) {
        if (arg0 == -25096) {
            field4277 = null;
            field4275 = null;
        }
    }

    @OriginalMember(owner = "client!de", name = "a", descriptor = "(IB)I")
    public final int method1621(int arg0, byte arg1) {
        field4282++;
        if (arg1 != -3) {
            method1620(-42);
        }
        int var3 = (this.field4274.length >> 1) - 1;
        int var4 = var3 & arg0;
        while (true) {
            int var5 = this.field4274[var4 + var4 + 1];
            if (var5 == -1) {
                return -1;
            }
            if (this.field4274[var4 + var4] == arg0) {
                return var5;
            }
            var4 = var3 & var4 + 1;
        }
    }

    @OriginalMember(owner = "client!de", name = "<init>", descriptor = "([I)V")
    public class247(int[] arg0) {
        int var2;
        for (var2 = 1; var2 <= (arg0.length >> 1) + arg0.length; var2 <<= 0x1) {
        }
        this.field4274 = new int[var2 + var2];
        for (int var3 = 0; var3 < var2 + var2; var3++) {
            this.field4274[var3] = -1;
        }
        int var4 = 0;
        while (arg0.length > var4) {
            int var5;
            for (var5 = arg0[var4] & var2 - 1; this.field4274[var5 + var5 + 1] != -1; var5 = var5 + 1 & var2 + -1) {
            }
            this.field4274[var5 + var5] = arg0[var4];
            this.field4274[var5 + var5 + 1] = var4++;
        }
    }
}
