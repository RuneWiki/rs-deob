import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rg")
public class class263 {

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "I")
    public static int field4455 = 0;

    @OriginalMember(owner = "client!rg", name = "b", descriptor = "[I")
    public static int[] field4456 = new int[4096];

    @OriginalMember(owner = "client!rg", name = "f", descriptor = "Z")
    public static boolean field4460 = true;

    @OriginalMember(owner = "client!rg", name = "c", descriptor = "F")
    public static float field4457;

    @OriginalMember(owner = "client!rg", name = "d", descriptor = "I")
    public static int field4458;

    @OriginalMember(owner = "client!rg", name = "e", descriptor = "I")
    public static int field4459;

    @OriginalMember(owner = "client!rg", name = "g", descriptor = "I")
    public static int field4461;

    @OriginalMember(owner = "client!rg", name = "h", descriptor = "I")
    public static int field4462;

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(Z)I", line = 21)
    public static final int method1831(boolean arg0) {
        field4461++;
        if ((double) class175.field2836 == 3.0D) {
            return 37;
        } else if ((double) class175.field2836 == 4.0D) {
            return 50;
        } else if (arg0) {
            return -46;
        } else if ((double) class175.field2836 == 6.0D) {
            return 75;
        } else {
            return 100;
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(IIIII)V", line = 44)
    public static final void method1832(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field4459++;
        if (class127.field1978 < 100) {
            class92.method652(418181130);
        }
        class228.method1563(arg2, arg4, arg1 + arg2, arg4 - -arg3);
        if (class127.field1978 < 100) {
            byte var5 = 20;
            int var6 = arg1 / 2 + arg2;
            int var7 = arg3 / 2 + arg4 - var5 - 18;
            class228.method1560(arg2, arg4, arg1, arg3, 0);
            class228.method1558(var6 - 152, var7, 304, 34, 9179409);
            class228.method1558(var6 - 151, var7 - -1, 302, 32, 0);
            class228.method1560(var6 - 150, var7 + 2, class127.field1978 * 3, 30, 9179409);
            class228.method1560(class127.field1978 * 3 + var6 - 150, var7 + 2, 300 - class127.field1978 * 3, 30, 0);
            class102.field1588.method192(class187.field2954, var6, var5 + var7, 16777215, -1);
            return;
        }
        class64.field861 = class291.field4895 - ((int) ((float) arg1 / class15.field149));
        class21.field261 = (int) ((float) (arg1 * 2) / class15.field149);
        class6.field79 = class274.field4602 - (int) ((float) arg3 / class15.field149);
        class281.field4717 = (int) ((float) (arg3 * 2) / class15.field149);
        int var8 = class291.field4895 - ((int) ((float) arg1 / class15.field149));
        int var9 = class274.field4602 - (int) ((float) arg3 / class15.field149);
        int var10 = (int) ((float) arg3 / class15.field149) + class274.field4602;
        int var11 = (int) ((float) arg1 / class15.field149) + class291.field4895;
        if (arg0 != 2167) {
            return;
        }
        if (class96.field1530 == null || class96.field1530.field4801 != arg1 || class96.field1530.field4808 != arg3) {
            class96.field1530 = null;
            class96.field1530 = new class30(arg1, arg3);
        }
        class277.method1914(class96.field1530.field598, arg1, arg3);
        class99.method743(var8, var11, var9, (byte) 44, var10, 0, arg3, arg1, 0);
        class301.method2055(0, arg1, var9, var10, var11, arg3, 0, -1312002864, var8);
        class295.method2024(arg1, arg3, var9, var8, 0, var11, var10, arg0 ^ 0x5002, 0);
        class96.field1530.method152(arg2, arg4);
        if (class270.field4538 > 0) {
            class270.field4538--;
        }
        if (!class294.field4982) {
            return;
        }
        int var12 = arg1 + arg2 - 5;
        int var13 = arg4 + arg3 - 8;
        class283.field4781.method213(class134.method938((byte) -128, new class168[] { class22.field273, class169.method1228(class99.field1553, 0) }), var12, var13, 16776960, -1);
        int var17 = var13 - 15;
        Runtime var14 = Runtime.getRuntime();
        int var15 = (int) ((var14.totalMemory() - var14.freeMemory()) / 1024L);
        int var16 = 16776960;
        if (var15 > 65536) {
            var16 = 16711680;
        }
        class283.field4781.method213(class134.method938((byte) -128, new class168[] { class242.field4071, class169.method1228(var15, 0), class39.field483 }), var12, var17, var16, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(I)V", line = 154)
    public static void method1833(int arg0) {
        field4456 = null;
        if (arg0 != 2) {
            method1831(true);
        }
    }

    @OriginalMember(owner = "client!rg", name = "a", descriptor = "(III)Lg;", line = 175)
    public static final class242 method1834(int arg0, int arg1, int arg2) {
        class242 var3 = class130.method910((byte) -85, arg2);
        field4462++;
        if (arg1 != 2) {
            return (class242) null;
        } else if (arg0 == -1) {
            return var3;
        } else if (var3 == null || var3.field4004 == null || arg0 >= var3.field4004.length) {
            return null;
        } else {
            return var3.field4004[arg0];
        }
    }
}
