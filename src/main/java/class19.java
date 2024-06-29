import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ug")
public class class19 extends class219 {

    @OriginalMember(owner = "client!ug", name = "K", descriptor = "I")
    public static int field308 = -1;

    @OriginalMember(owner = "client!ug", name = "R", descriptor = "Lbd;")
    public static class162 field315 = class17.method142(0, " steht bereits auf Ihrer Ignorieren)2Liste(Q");

    @OriginalMember(owner = "client!ug", name = "J", descriptor = "I")
    public static int field307;

    @OriginalMember(owner = "client!ug", name = "L", descriptor = "I")
    public static int field309;

    @OriginalMember(owner = "client!ug", name = "M", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!ug", name = "N", descriptor = "I")
    public static int field311;

    @OriginalMember(owner = "client!ug", name = "O", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!ug", name = "P", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!ug", name = "S", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!ug", name = "Q", descriptor = "Lda;")
    public static class143 field314;

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIZ)I", line = 5)
    public static final int method172(int arg0, int arg1, int arg2, boolean arg3) {
        if (arg3) {
            method177(-4, -27, -94);
        }
        field309++;
        return arg1 >= arg0 ? (arg1 > arg2 ? arg2 : arg1) : arg0;
    }

    @OriginalMember(owner = "client!ug", name = "c", descriptor = "(Z)V", line = 18)
    public static void method173(boolean arg0) {
        if (!arg0) {
            field315 = null;
            field314 = null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIII)V", line = 39)
    public static final void method174(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field312++;
        if (arg4 - arg3 >= class112.field2028 && class82.field1426 >= arg4 + arg3 && (arg0 - arg3) >= class303.field5106 && class298.field4989 >= arg0 + arg3) {
            class280.method1935(arg0, arg2, arg4, -63, arg3);
        } else {
            class4.method21(arg0, arg4, arg3, 1, arg2);
        }
        if (arg1 != -1) {
            field314 = (class143) null;
        }
    }

    @OriginalMember(owner = "client!ug", name = "<init>", descriptor = "()V", line = 55)
    public class19() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IIIIII)V", line = 66)
    public static final void method175(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var6 = arg5; var6 <= arg5 + arg1; var6++) {
            for (int var7 = arg4; var7 <= (arg2 + arg4); var7++) {
                if (var7 >= 0 && var7 < 104 && var6 >= 0 && var6 < 104) {
                    class317.field5341[arg3][var7][var6] = 127;
                }
            }
        }
        field313++;
        if (arg0 != 9179409) {
            return;
        }
        for (int var8 = arg5; var8 < (arg1 + arg5); var8++) {
            for (int var9 = arg4; var9 < arg2 + arg4; var9++) {
                if (var9 >= 0 && var9 < 104 && var8 >= 0 && var8 < 104) {
                    class206.field3473[arg3][var9][var8] = arg3 <= 0 ? 0 : class206.field3473[arg3 - 1][var9][var8];
                }
            }
        }
        if (arg4 > 0 && arg4 < 104) {
            for (int var10 = arg5 + 1; var10 < arg5 + arg1; var10++) {
                if (var10 >= 0 && var10 < 104) {
                    class206.field3473[arg3][arg4][var10] = class206.field3473[arg3][arg4 - 1][var10];
                }
            }
        }
        if (arg5 > 0 && arg5 < 104) {
            for (int var11 = arg4 + 1; var11 < (arg2 + arg4); var11++) {
                if (var11 >= 0 && var11 < 104) {
                    class206.field3473[arg3][var11][arg5] = class206.field3473[arg3][var11][arg5 - 1];
                }
            }
        }
        if (arg4 < 0 || arg5 < 0 || arg4 >= 104 || arg5 >= 104) {
            return;
        }
        if (arg3 == 0) {
            if (arg4 > 0 && class206.field3473[arg3][arg4 - 1][arg5] != 0) {
                class206.field3473[arg3][arg4][arg5] = class206.field3473[arg3][arg4 - 1][arg5];
            } else if (arg5 > 0 && class206.field3473[arg3][arg4][arg5 - 1] != 0) {
                class206.field3473[arg3][arg4][arg5] = class206.field3473[arg3][arg4][arg5 - 1];
            } else if (arg4 > 0 && arg5 > 0 && class206.field3473[arg3][arg4 - 1][arg5 - 1] != 0) {
                class206.field3473[arg3][arg4][arg5] = class206.field3473[arg3][arg4 - 1][arg5 - 1];
            }
        } else if (arg4 > 0 && class206.field3473[arg3][arg4 - 1][arg5] != class206.field3473[arg3 - 1][arg4 - 1][arg5]) {
            class206.field3473[arg3][arg4][arg5] = class206.field3473[arg3][arg4 - 1][arg5];
        } else if (arg5 > 0 && class206.field3473[arg3 - 1][arg4][arg5 - 1] != class206.field3473[arg3][arg4][arg5 - 1]) {
            class206.field3473[arg3][arg4][arg5] = class206.field3473[arg3][arg4][arg5 - 1];
        } else if (arg4 > 0 && arg5 > 0 && class206.field3473[arg3 - 1][arg4 - 1][arg5 - 1] != class206.field3473[arg3][arg4 - 1][arg5 - 1]) {
            class206.field3473[arg3][arg4][arg5] = class206.field3473[arg3][arg4 - 1][arg5 - 1];
        }
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(IZIII)V", line = 183)
    public static final void method176(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        field316++;
        if (class123.field2234 < 100) {
            class261.method1800(31407);
        }
        if (class117.field2159) {
            class16.method133(arg2, arg3, arg0 + arg2, arg3 + arg4);
        } else {
            class316.method2168(arg2, arg3, arg0 + arg2, arg3 + arg4);
        }
        if (class123.field2234 < 100) {
            byte var5 = 20;
            int var6 = arg4 / 2 + arg3 - var5 - 18;
            int var7 = arg0 / 2 + arg2;
            if (class117.field2159) {
                class16.method124(arg2, arg3, arg0, arg4, 0);
                class16.method128(var7 - 152, var6, 304, 34, 9179409);
                class16.method128(var7 - 151, var6 + 1, 302, 32, 0);
                class16.method124(var7 - 150, var6 - -2, class123.field2234 * 3, 30, 9179409);
                class16.method124(var7 + (class123.field2234 * 3) - 150, var6 - -2, 300 - (class123.field2234 * 3), 30, 0);
            } else {
                class316.method2174(arg2, arg3, arg0, arg4, 0);
                class316.method2160(var7 - 152, var6, 304, 34, 9179409);
                class316.method2160(var7 - 151, var6 + 1, 302, 32, 0);
                class316.method2174(var7 - 150, var6 - -2, class123.field2234 * 3, 30, 9179409);
                class316.method2174(class123.field2234 * 3 + var7 - 150, var6 - -2, 300 - (class123.field2234 * 3), 30, 0);
            }
            class207.field3507.method1884(class187.field3225, var7, var5 + var6, 16777215, -1);
            return;
        }
        class229.field3805 = (int) ((float) (arg4 * 2) / class149.field2689);
        if (!arg1) {
            method175(-55, 121, -83, 25, -40, -92);
        }
        class151.field2705 = (int) ((float) (arg0 * 2) / class149.field2689);
        int var8 = class136.field2420 + ((int) ((float) arg0 / class149.field2689));
        class291.field4900 = class136.field2420 - ((int) ((float) arg0 / class149.field2689));
        int var9 = class278.field4682 - ((int) ((float) arg4 / class149.field2689));
        int var10 = class278.field4682 + ((int) ((float) arg4 / class149.field2689));
        class119.field2182 = class278.field4682 - ((int) ((float) arg4 / class149.field2689));
        int var11 = class136.field2420 - ((int) ((float) arg0 / class149.field2689));
        if (class117.field2159) {
            if (class261.field4354 == null || class261.field4354.field1131 != arg0 || class261.field4354.field1135 != arg4) {
                class261.field4354 = null;
                class261.field4354 = new class38(arg0, arg4);
            }
            class316.method2154(class261.field4354.field1384, arg0, arg4);
            class258.method1782(var9, 0, var8, arg4, 0, (byte) -122, var11, arg0, var10);
            class109.method885(var11, 0, arg0, -26989, 0, var8, var9, arg4, var10);
            class243.method1720(arg4, var8, (byte) 125, var11, var10, 0, 0, var9, arg0);
            class261.field4354.method286(arg2, arg3);
        } else {
            class258.method1782(var9, arg3, var8, arg3 + arg4, arg2, (byte) -107, var11, arg0 + arg2, var10);
            class109.method885(var11, arg2, arg0 + arg2, -26989, arg3, var8, var9, arg3 + arg4, var10);
            class243.method1720(arg3 + arg4, var8, (byte) -1, var11, var10, arg3, arg2, var9, arg0 + arg2);
        }
        if (class255.field4226 > 0) {
            class255.field4226--;
        }
        if (!class203.field3440) {
            return;
        }
        int var12 = arg0 + arg2 - 5;
        int var13 = arg3 + arg4 - 8;
        int var14 = 16776960;
        class286.field4831.method1873(class135.method1062(new class162[] { class168.field2947, class156.method1212(10, class29.field499) }, arg1), var12, var13, 16776960, -1);
        Runtime var15 = Runtime.getRuntime();
        int var17 = var13 - 15;
        int var16 = (int) ((var15.totalMemory() - var15.freeMemory()) / 1024L);
        if (var16 > 65536) {
            var14 = 16711680;
        }
        class286.field4831.method1873(class135.method1062(new class162[] { class6.field53, class156.method1212(10, var16), class165.field2929 }, arg1), var12, var17, var14, -1);
        var13 = var17 - 15;
    }

    @OriginalMember(owner = "client!ug", name = "b", descriptor = "(III)I", line = 291)
    public static final int method177(int arg0, int arg1, int arg2) {
        field311++;
        if (arg2 != 30) {
            field315 = (class162) null;
        }
        int var3 = 0;
        while (arg1 > 0) {
            arg1--;
            var3 = var3 << 1 | arg0 & 0x1;
            arg0 >>>= 0x1;
        }
        return var3;
    }

    @OriginalMember(owner = "client!ug", name = "a", descriptor = "(ZI)[I", line = 319)
    public final int[] method41(boolean arg0, int arg1) {
        if (arg0) {
            field307++;
            return class280.field4762;
        } else {
            return (int[]) null;
        }
    }
}
