import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lf")
public class class247 {

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "[S")
    public static short[] field3914 = new short[256];

    @OriginalMember(owner = "client!lf", name = "b", descriptor = "I")
    public static int field3915 = 0;

    @OriginalMember(owner = "client!lf", name = "f", descriptor = "I")
    public static int field3919 = 0;

    @OriginalMember(owner = "client!lf", name = "e", descriptor = "Lpg;")
    public static class320 field3918 = new class320(4);

    @OriginalMember(owner = "client!lf", name = "c", descriptor = "I")
    public static int field3916;

    @OriginalMember(owner = "client!lf", name = "d", descriptor = "I")
    public static int field3917;

    @OriginalMember(owner = "client!lf", name = "h", descriptor = "I")
    public static int field3921;

    @OriginalMember(owner = "client!lf", name = "i", descriptor = "I")
    public static int field3922;

    @OriginalMember(owner = "client!lf", name = "j", descriptor = "I")
    public static int field3923;

    @OriginalMember(owner = "client!lf", name = "g", descriptor = "[I")
    public static int[] field3920;

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I[B)Lte;", line = 15)
    public static final class124 method1696(int arg0, byte[] arg1) {
        field3916++;
        if (arg1 == null) {
            return null;
        }
        if (arg0 != -29242) {
            field3920 = (int[]) null;
        }
        class124 var2 = new class124(arg1, class97.field1546, class320.field5001, class75.field1215, class73.field1201, class306.field4757);
        class7.method56((byte) 59);
        return var2;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(B)V", line = 33)
    public static void method1697(byte arg0) {
        field3920 = null;
        field3918 = null;
        if (arg0 == -66) {
            field3914 = null;
        }
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(Ll;Ll;Ll;ILl;)V", line = 49)
    public static final void method1698(class133 arg0, class133 arg1, class133 arg2, int arg3, class133 arg4) {
        if (arg3 != 18161) {
            field3920 = (int[]) null;
        }
        field3921++;
        class132.field2090 = arg2;
        class60.field980 = arg4;
        class252.field3976 = arg0;
        class120.field1831 = arg1;
        class163.field2463 = new class220[class132.field2090.method981((byte) -80)][];
        class71.field1175 = new boolean[class132.field2090.method981((byte) -93)];
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(IIIII)V", line = 76)
    public static final void method1699(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (class35.field536 < 100) {
            class146.method1026(false);
        }
        if (class94.field1516) {
            class167.method1187(arg0, arg2, arg0 + arg4, arg1 + arg2);
        } else {
            class109.method806(arg0, arg2, arg0 + arg4, arg1 + arg2);
        }
        field3917++;
        if (class35.field536 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg0;
            int var7 = arg2 + (arg1 / 2) - var5 - 18;
            if (class94.field1516) {
                class167.method1186(arg0, arg2, arg4, arg1, 0);
                class167.method1189(var6 - 152, var7, 304, 34, 9179409);
                class167.method1189(var6 - 151, var7 + 1, 302, 32, 0);
                class167.method1186(var6 - 150, var7 + 2, class35.field536 * 3, 30, 9179409);
                class167.method1186(class35.field536 * 3 + (var6 - 150), var7 + 2, 300 - (class35.field536 * 3), 30, 0);
            } else {
                class109.method812(arg0, arg2, arg4, arg1, 0);
                class109.method801(var6 - 152, var7, 304, 34, 9179409);
                class109.method801(var6 - 151, var7 + 1, 302, 32, 0);
                class109.method812(var6 - 150, var7 + 2, class35.field536 * 3, 30, 9179409);
                class109.method812((class35.field536 * 3) + var6 - 150, var7 - -2, 300 - (class35.field536 * 3), 30, 0);
            }
            class344.field5343.method2237(class203.field3042, var6, var5 + var7, 16777215, -1);
            return;
        }
        class309.field4805 = (int) ((float) (arg1 * 2) / class165.field2472);
        class312.field4840 = (int) ((float) (arg4 * 2) / class165.field2472);
        int var8 = class128.field2024 - (int) ((float) arg1 / class165.field2472);
        class241.field3862 = class128.field2024 - ((int) ((float) arg1 / class165.field2472));
        int var9 = (int) ((float) arg4 / class165.field2472) + class265.field4119;
        int var10 = (int) ((float) arg1 / class165.field2472) + class128.field2024;
        int var11 = class265.field4119 - ((int) ((float) arg4 / class165.field2472));
        class320.field5008 = class265.field4119 - ((int) ((float) arg4 / class165.field2472));
        if (arg3 != 17736) {
            field3918 = (class320) null;
        }
        if (class94.field1516) {
            if (class299.field4622 == null || class299.field4622.field4202 != arg4 || class299.field4622.field4207 != arg1) {
                class299.field4622 = null;
                class299.field4622 = new class249(arg4, arg1);
            }
            class109.method800(class299.field4622.field3942, arg4, arg1);
            class263.method1795(var8, var10, 0, arg1, var9, 0, true, arg4, var11);
            class321.method2187(arg4, var8, var11, 0, arg1, 0, var9, class166.field2527, var10, arg3 - 17736);
            class288.method1984(var8, 0, (byte) 70, arg1, arg4, 0, var10, var9, var11);
            class299.field4622.method1713();
            class167.method1192(class299.field4622.field3942, arg0, arg2, arg4, arg1);
            class109.field1704 = null;
        } else {
            class263.method1795(var8, var10, arg0, arg2 + arg1, var9, arg2, true, arg0 + arg4, var11);
            class321.method2187(arg0 + arg4, var8, var11, arg0, arg1 + arg2, arg2, var9, class166.field2527, var10, arg3 ^ 0x4548);
            class288.method1984(var8, arg2, (byte) -128, arg1 + arg2, arg0 - -arg4, arg0, var10, var9, var11);
        }
        if (class32.field464 > 0) {
            class60.field979--;
            if (class60.field979 == 0) {
                class32.field464--;
                class60.field979 = 20;
            }
        }
        if (!class306.field4758) {
            return;
        }
        int var12 = arg1 + arg2 - 8;
        int var13 = arg4 + arg0 - 5;
        class233.field3723.method2240("Fps:" + class292.field4541, var13, var12, 16776960, -1);
        int var17 = var12 - 15;
        int var14 = 16776960;
        Runtime var15 = Runtime.getRuntime();
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class233.field3723.method2240("Mem:" + var16 + "k", var13, var17, var14, -1);
        var12 = var17 - 15;
    }

    @OriginalMember(owner = "client!lf", name = "a", descriptor = "(I)V", line = 195)
    public static final void method1700(int arg0) {
        field3923++;
        class280.method1917((byte) -71, class331.field5144);
        int var1 = (class337.field5278 >> 10) + (class213.field3249 >> 3);
        byte var2 = 8;
        byte var3 = 8;
        byte var4 = 0;
        byte var5 = 18;
        class199.field2973 = new int[var5];
        class29.field430 = new byte[var5][];
        class153.field2308 = new int[var5];
        class300.field4689 = new int[var5];
        class170.field2566 = new byte[var5][];
        class331.field5158 = new int[var5];
        class270.field4197 = new byte[var5][];
        class206.field3171 = new int[var5];
        class128.field2027 = new byte[var5][];
        class241.field3865 = new int[var5];
        if (arg0 != -11814) {
            field3915 = -13;
        }
        class150.field2269 = new int[var5][4];
        int var6 = (class342.field5328 >> 3) + (class265.field4116 >> 10);
        class303.field4723 = new byte[var5][];
        int var7 = 0;
        for (int var8 = (var1 - 6) / 8; var8 <= ((var1 + 6) / 8); var8++) {
            for (int var9 = (var6 - 6) / 8; var9 <= (var6 + 6) / 8; var9++) {
                int var10 = (var8 << 8) + var9;
                class331.field5158[var7] = var10;
                class199.field2973[var7] = class225.field3575.method970("m" + var8 + "_" + var9, (byte) -10);
                class241.field3865[var7] = class225.field3575.method970("l" + var8 + "_" + var9, (byte) -10);
                class206.field3171[var7] = class225.field3575.method970("n" + var8 + "_" + var9, (byte) -10);
                class153.field2308[var7] = class225.field3575.method970("um" + var8 + "_" + var9, (byte) -10);
                class300.field4689[var7] = class225.field3575.method970("ul" + var8 + "_" + var9, (byte) -10);
                if (class206.field3171[var7] == -1) {
                    class199.field2973[var7] = -1;
                    class241.field3865[var7] = -1;
                    class153.field2308[var7] = -1;
                    class300.field4689[var7] = -1;
                }
                var7++;
            }
        }
        for (int var11 = var7; var11 < class206.field3171.length; var11++) {
            class206.field3171[var11] = -1;
            class199.field2973[var11] = -1;
            class241.field3865[var11] = -1;
            class153.field2308[var11] = -1;
            class300.field4689[var11] = -1;
        }
        class205.method1457(var6, 103, var2, true, false, var3, var4, var1);
    }
}
