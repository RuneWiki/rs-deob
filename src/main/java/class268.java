import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class268 {

    @OriginalMember(owner = "client!wj", name = "d", descriptor = "I")
    public static int field4419 = 0;

    @OriginalMember(owner = "client!wj", name = "e", descriptor = "I")
    public static int field4420 = 0;

    @OriginalMember(owner = "client!wj", name = "j", descriptor = "Lck;")
    public static class119 field4425 = class298.method1987((byte) 124, "Lade Sprites )2 ");

    @OriginalMember(owner = "client!wj", name = "k", descriptor = "Lck;")
    private static class119 field4426 = class298.method1987((byte) 125, "World");

    @OriginalMember(owner = "client!wj", name = "f", descriptor = "Lck;")
    public static class119 field4421 = field4426;

    @OriginalMember(owner = "client!wj", name = "b", descriptor = "I")
    public static int field4417;

    @OriginalMember(owner = "client!wj", name = "c", descriptor = "I")
    public int field4418;

    @OriginalMember(owner = "client!wj", name = "h", descriptor = "I")
    public static int field4423;

    @OriginalMember(owner = "client!wj", name = "i", descriptor = "I")
    public static int field4424;

    @OriginalMember(owner = "client!wj", name = "l", descriptor = "I")
    public static int field4427;

    @OriginalMember(owner = "client!wj", name = "m", descriptor = "Lie;")
    public class20 field4428;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "[I")
    public static int[] field4416;

    @OriginalMember(owner = "client!wj", name = "g", descriptor = "[I")
    public int[] field4422;

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(ZLck;I)V", line = 5)
    public static final void method1778(boolean arg0, class119 arg1, int arg2) {
        field4417++;
        if (arg0) {
            class179 var3 = class53.method397(arg2, 1000, 2);
            var3.method1151(2000);
            var3.field2859 = arg1;
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(IIIIIII)V", line = 42)
    public static final void method1779(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        class259.method1656(false, arg4);
        int var7 = arg0;
        int var8 = arg4 - arg2;
        int var9 = -arg4;
        field4423++;
        int var10 = -1;
        int var11 = arg4;
        int[] var12 = class256.field4113[arg1];
        int var13 = -1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var14 = arg5 - var8;
        int var15 = -var8;
        int var16 = arg5 + var8;
        int var17 = var8;
        class36.method282(var14, arg5 - arg4, arg3, var12, arg0 + 26175);
        class36.method282(var16, var14, arg6, var12, 26175);
        class36.method282(arg4 + arg5, var16, arg3, var12, 26175);
        while (var7 < var11) {
            var10 += 2;
            var9 += var10;
            var13 += 2;
            var15 += var13;
            if (var15 >= 0 && var17 >= 1) {
                class87.field1320[var17] = var7;
                var17--;
                var15 -= var17 << 1;
            }
            var7++;
            if (var9 >= 0) {
                var11--;
                var9 -= var11 << 1;
                if (var8 > var11) {
                    int var18 = class87.field1320[var11];
                    int[] var19 = class256.field4113[arg1 + var11];
                    int[] var20 = class256.field4113[arg1 - var11];
                    int var21 = arg5 - var7;
                    int var22 = arg5 + var7;
                    int var23 = arg5 + var18;
                    int var24 = arg5 - var18;
                    class36.method282(var24, var21, arg3, var19, 26175);
                    class36.method282(var23, var24, arg6, var19, 26175);
                    class36.method282(var22, var23, arg3, var19, 26175);
                    class36.method282(var24, var21, arg3, var20, arg0 + 26175);
                    class36.method282(var23, var24, arg6, var20, 26175);
                    class36.method282(var22, var23, arg3, var20, arg0 ^ 0x663F);
                } else {
                    int var25 = arg5 - var7;
                    int[] var26 = class256.field4113[arg1 + var11];
                    int var27 = arg5 + var7;
                    int[] var28 = class256.field4113[arg1 - var11];
                    class36.method282(var27, var25, arg3, var26, 26175);
                    class36.method282(var27, var25, arg3, var28, arg0 ^ 0x663F);
                }
            }
            int var29 = arg5 + var11;
            int[] var30 = class256.field4113[arg1 + var7];
            int[] var31 = class256.field4113[arg1 - var7];
            int var32 = arg5 - var11;
            if (var8 <= var7) {
                class36.method282(var29, var32, arg3, var30, 26175);
                class36.method282(var29, var32, arg3, var31, arg0 ^ 0x663F);
            } else {
                int var33 = var17 >= var7 ? var17 : class87.field1320[var7];
                int var34 = arg5 - var33;
                class36.method282(var34, var32, arg3, var30, 26175);
                int var35 = arg5 + var33;
                class36.method282(var35, var34, arg6, var30, 26175);
                class36.method282(var29, var35, arg3, var30, arg0 ^ 0x663F);
                class36.method282(var34, var32, arg3, var31, 26175);
                class36.method282(var35, var34, arg6, var31, 26175);
                class36.method282(var29, var35, arg3, var31, 26175);
            }
        }
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(Lfj;B)V", line = 171)
    public static final void method1780(class3 arg0, byte arg1) {
        if (class9.field175 != null) {
            try {
                class9.field175.method1118(0L, (byte) -1);
                class9.field175.method1119(arg0.field101, arg0.field44, 24, (byte) 47);
            } catch (Exception var4) {
            }
        }
        field4427++;
        int var3 = 94 / ((arg1 + 10) / 43);
        arg0.field44 += 24;
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(III)V", line = 190)
    public static final void method1781(int arg0, int arg1, int arg2) {
        field4424++;
        class295.field4903 = class198.field3165[arg0][arg1].field2813;
        class215.field3440 = class198.field3165[arg0][arg1].field2806;
        class150.field2380 = class198.field3165[arg0][arg1].field2803;
        int var3 = 85 / ((-arg2 - 50) / 50);
        class178.method1144((float) class295.field4903, (float) class215.field3440, (float) class150.field2380);
    }

    @OriginalMember(owner = "client!wj", name = "a", descriptor = "(I)V", line = 215)
    public static void method1782(int arg0) {
        field4426 = null;
        field4416 = null;
        field4421 = null;
        field4425 = null;
        if (arg0 != 24) {
            method1782(-56);
        }
    }
}
