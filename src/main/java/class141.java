import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!n")
public class class141 {

    @OriginalMember(owner = "client!n", name = "c", descriptor = "[Lo;")
    public static class152[] field2579 = new class152[24];

    @OriginalMember(owner = "client!n", name = "b", descriptor = "[I")
    public static int[] field2578 = new int[32];

    @OriginalMember(owner = "client!n", name = "i", descriptor = "I")
    public static int field2585 = 1;

    @OriginalMember(owner = "client!n", name = "h", descriptor = "Lqe;")
    public static class179 field2584 = class206.method1380(":clan:", (byte) 19);

    @OriginalMember(owner = "client!n", name = "g", descriptor = "I")
    public static int field2583 = -1;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "I")
    public static int field2577;

    @OriginalMember(owner = "client!n", name = "d", descriptor = "I")
    public static int field2580;

    @OriginalMember(owner = "client!n", name = "e", descriptor = "I")
    public static int field2581;

    @OriginalMember(owner = "client!n", name = "f", descriptor = "I")
    public static int field2582;

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIIII)Z")
    public static final boolean method894(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != arg2 || arg3 != arg4) {
            for (int var8 = arg1; var8 <= arg2; var8++) {
                for (int var14 = arg3; var14 <= arg4; var14++) {
                    if (class177.field3224[arg0][var8][var14] == -class18.field483) {
                        return false;
                    }
                }
            }
            int var9 = (arg1 << 7) + 1;
            int var10 = (arg3 << 7) + 2;
            int var11 = class30.field665[arg0][arg1][arg3] + arg5;
            if (!class190.method1279(var9, var11, var10)) {
                return false;
            }
            int var12 = (arg2 << 7) - 1;
            if (!class190.method1279(var12, var11, var10)) {
                return false;
            }
            int var13 = (arg4 << 7) - 1;
            if (!class190.method1279(var9, var11, var13)) {
                return false;
            } else if (class190.method1279(var12, var11, var13)) {
                return true;
            } else {
                return false;
            }
        } else if (class116.method747(arg0, arg1, arg3)) {
            int var6 = arg1 << 7;
            int var7 = arg3 << 7;
            return class190.method1279(var6 + 1, class30.field665[arg0][arg1][arg3] + arg5, var7 + 1) && class190.method1279(var6 + 128 - 1, class30.field665[arg0][arg1 + 1][arg3] + arg5, var7 + 1) && class190.method1279(var6 + 128 - 1, class30.field665[arg0][arg1 + 1][arg3 + 1] + arg5, var7 + 128 - 1) && class190.method1279(var6 + 1, class30.field665[arg0][arg1][arg3 + 1] + arg5, var7 + 128 - 1);
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "([BIZ)Ljava/lang/Object;")
    public static final Object method895(byte[] arg0, int arg1, boolean arg2) {
        field2580++;
        if (arg0 == null) {
            return null;
        }
        if (arg0.length > 136 && !class208.field3880) {
            try {
                class16 var3 = (class16) Class.forName("lc").getDeclaredConstructor().newInstance();
                var3.method122((byte) 117, arg0);
                return var3;
            } catch (Throwable var5) {
                class208.field3880 = true;
            }
        }
        int var4 = 126 % ((arg1 + 36) / 44);
        return arg2 ? class226.method1484(arg0, (byte) 125) : arg0;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(B)[Lnb;")
    public static final class143[] method896(byte arg0) {
        field2577++;
        int var1 = -22 / ((arg0 + 54) / 57);
        class143[] var2 = new class143[class226.field4186];
        for (int var3 = 0; var3 < class226.field4186; var3++) {
            int var4 = class187.field3493[var3] * class150.field2703[var3];
            byte[] var5 = class173.field3102[var3];
            int[] var6 = new int[var4];
            for (int var7 = 0; var7 < var4; var7++) {
                var6[var7] = class175.field3185[class107.method696(255, var5[var7])];
            }
            var2[var3] = new class126(class22.field544, class9.field257, class31.field674[var3], class143.field2611[var3], class187.field3493[var3], class150.field2703[var3], var6);
        }
        class17.method129((byte) -121);
        return var2;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IIIILrb;JLrb;Lrb;)V")
    public static final void method897(int arg0, int arg1, int arg2, int arg3, class186 arg4, long arg5, class186 arg6, class186 arg7) {
        class232 var9 = new class232();
        var9.field4272 = arg4;
        var9.field4264 = arg1 * 128 + 64;
        var9.field4265 = arg2 * 128 + 64;
        var9.field4268 = arg3;
        var9.field4284 = arg5;
        var9.field4267 = arg6;
        var9.field4274 = arg7;
        int var10 = 0;
        class197 var11 = class229.field4232[arg0][arg1][arg2];
        if (var11 != null) {
            for (int var12 = 0; var12 < var11.field3662; var12++) {
                class167 var13 = var11.field3672[var12];
                if ((var13.field3014 & 0x400000L) == 4194304L) {
                    int var14 = var13.field3010.method295();
                    if (var14 != -32768 && var14 < var10) {
                        var10 = var14;
                    }
                }
            }
        }
        var9.field4271 = -var10;
        if (class229.field4232[arg0][arg1][arg2] == null) {
            class229.field4232[arg0][arg1][arg2] = new class197(arg0, arg1, arg2);
        }
        class229.field4232[arg0][arg1][arg2].field3668 = var9;
    }

    @OriginalMember(owner = "client!n", name = "a", descriptor = "(IB)V")
    public static final void method898(int arg0, byte arg1) {
        field2581++;
        class19.field494 = -1;
        class159.field2894 = null;
        class157.field2848 = arg0;
        class237.field4361 = 0;
        if (arg1 != -119) {
            field2579 = null;
        }
        class107.field2000 = 1;
        class178.field3235 = -1;
        class233.field4303 = false;
    }

    @OriginalMember(owner = "client!n", name = "b", descriptor = "(B)V")
    public static void method899(byte arg0) {
        field2579 = null;
        int var1 = 16 / ((-arg0 - 57) / 43);
        field2578 = null;
        field2584 = null;
    }
}
