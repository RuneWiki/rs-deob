import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rh")
public class class193 extends class23 {

    @OriginalMember(owner = "client!rh", name = "P", descriptor = "Z")
    public static boolean field3603 = false;

    @OriginalMember(owner = "client!rh", name = "O", descriptor = "[[[B")
    public static byte[][][] field3602 = new byte[4][104][104];

    @OriginalMember(owner = "client!rh", name = "S", descriptor = "[J")
    public static long[] field3606 = new long[100];

    @OriginalMember(owner = "client!rh", name = "L", descriptor = "Ldc;")
    private static class37 field3599 = class185.method1233((byte) 86, "Ok");

    @OriginalMember(owner = "client!rh", name = "N", descriptor = "Ldc;")
    public static class37 field3601 = class185.method1233((byte) 86, "null");

    @OriginalMember(owner = "client!rh", name = "M", descriptor = "Ldc;")
    public static class37 field3600 = field3599;

    @OriginalMember(owner = "client!rh", name = "Q", descriptor = "I")
    public static int field3604;

    @OriginalMember(owner = "client!rh", name = "R", descriptor = "I")
    public static int field3605;

    @OriginalMember(owner = "client!rh", name = "V", descriptor = "I")
    public static int field3609;

    @OriginalMember(owner = "client!rh", name = "T", descriptor = "Lrb;")
    public static class187 field3607;

    @OriginalMember(owner = "client!rh", name = "U", descriptor = "[[[B")
    public static byte[][][] field3608;

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(II)[I")
    public final int[] method57(int arg0, int arg1) {
        if (arg0 != 0) {
            method1284(null, 76, -55, 62, -57, -95);
        }
        field3604++;
        return class133.field2477;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(Lia;IIIII)V")
    public static final void method1284(class88 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class95.field1674 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class238.field4372) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < client.field682 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class18 var14 = class180.field3354[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class39.field808[var11][var12 + 1][var13] + class39.field808[var11][var12][var13] + class39.field808[var11][var12][var13 + 1] + class39.field808[var11][var12 + 1][var13 + 1]) / 4 - (class39.field808[arg1][arg2 + 1][arg3] + class39.field808[arg1][arg2][arg3] + class39.field808[arg1][arg2][arg3 + 1] + class39.field808[arg1][arg2 + 1][arg3 + 1]) / 4;
                                    class184 var16 = var14.field292;
                                    if (var16 != null) {
                                        if (var16.field3399.method590()) {
                                            arg0.method585(var16.field3399, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                        if (var16.field3404 != null && var16.field3404.method590()) {
                                            arg0.method585(var16.field3404, (var12 - arg2) * 128 + (1 - arg4) * 64, var15, (var13 - arg3) * 128 + (1 - arg5) * 64, var6);
                                        }
                                    }
                                    for (int var17 = 0; var17 < var14.field290; var17++) {
                                        class94 var18 = var14.field289[var17];
                                        if (var18 != null && var18.field1653.method590() && (var18.field1639 == var12 || var7 == var12) && (var18.field1645 == var13 || var9 == var13)) {
                                            int var19 = var18.field1651 + 1 - var18.field1639;
                                            int var20 = var18.field1637 + 1 - var18.field1645;
                                            arg0.method585(var18.field1653, (var18.field1639 - arg2) * 128 + (var19 - arg4) * 64, var15, (var18.field1645 - arg3) * 128 + (var20 - arg5) * 64, var6);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!rh", name = "b", descriptor = "(Z)V")
    public static void method1285(boolean arg0) {
        field3607 = null;
        field3606 = null;
        field3601 = null;
        if (!arg0) {
            method1286(91, -23, 22, -123, -28);
        }
        field3608 = null;
        field3600 = null;
        field3602 = null;
        field3599 = null;
    }

    @OriginalMember(owner = "client!rh", name = "a", descriptor = "(IIIII)V")
    public static final void method1286(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg2 >= class198.field3697 && arg2 <= class199.field3712) {
            int var5 = class196.method1308(49, class29.field536, arg1, class82.field1458);
            int var6 = class196.method1308(75, class29.field536, arg3, class82.field1458);
            class121.method831(false, arg4, var6, var5, arg2);
        }
        field3605++;
        if (arg0 != 1) {
            field3601 = null;
        }
    }

    @OriginalMember(owner = "client!rh", name = "<init>", descriptor = "()V")
    public class193() {
        super(0, true);
    }
}
