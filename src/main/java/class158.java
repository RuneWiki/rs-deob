import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!td")
public abstract class class158 extends class202 {

    @OriginalMember(owner = "client!td", name = "O", descriptor = "Lsb;")
    private static class98 field2871 = class47.method368("You can(Wt add yourself to your own friend list)3", 0);

    @OriginalMember(owner = "client!td", name = "P", descriptor = "I")
    public static int field2872 = (int) (Math.random() * 17.0D) - 8;

    @OriginalMember(owner = "client!td", name = "Q", descriptor = "Z")
    public static boolean field2873 = true;

    @OriginalMember(owner = "client!td", name = "S", descriptor = "[I")
    public static int[] field2875 = new int[200];

    @OriginalMember(owner = "client!td", name = "V", descriptor = "Lsb;")
    public static class98 field2878 = field2871;

    @OriginalMember(owner = "client!td", name = "Z", descriptor = "Lsb;")
    private static class98 field2882 = class47.method368("level)2", 0);

    @OriginalMember(owner = "client!td", name = "X", descriptor = "Lsb;")
    public static class98 field2880 = class47.method368("Konfig geladen)3", 0);

    @OriginalMember(owner = "client!td", name = "N", descriptor = "Lsb;")
    public static class98 field2870 = field2882;

    @OriginalMember(owner = "client!td", name = "T", descriptor = "I")
    public static int field2876;

    @OriginalMember(owner = "client!td", name = "U", descriptor = "I")
    public static int field2877;

    @OriginalMember(owner = "client!td", name = "W", descriptor = "I")
    public static int field2879;

    @OriginalMember(owner = "client!td", name = "Y", descriptor = "I")
    public static int field2881;

    @OriginalMember(owner = "client!td", name = "ab", descriptor = "I")
    public static int field2883;

    @OriginalMember(owner = "client!td", name = "bb", descriptor = "I")
    public static int field2884;

    @OriginalMember(owner = "client!td", name = "cb", descriptor = "I")
    public static int field2885;

    @OriginalMember(owner = "client!td", name = "R", descriptor = "[I")
    public static int[] field2874;

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(I)V")
    public static final void method1140(int arg0) {
        field2883++;
        class90.field1586 = 0;
        int var1 = (class163.field2943.field4466 >> 7) + class182.field3143;
        int var2 = (class163.field2943.field4492 >> 7) + class189.field3277;
        if (arg0 != 21332) {
            method1142((byte) -46);
        }
        if (var2 >= 3053 && var2 <= 3156 && var1 >= 3056 && var1 <= 3136) {
            class90.field1586 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var1 >= 9492 && var1 <= 9535) {
            class90.field1586 = 1;
        }
        if (class90.field1586 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class90.field1586 = 0;
        }
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(I)V")
    public static final void method1141(int arg0) {
        field2879++;
        if (class90.method661(26483) != 2) {
            return;
        }
        byte var1 = (byte) (class202.field3444 - 4 & 0xFF);
        int var2 = class202.field3444 % 104;
        for (int var3 = 0; var3 < 4; var3++) {
            for (int var16 = 0; var16 < 104; var16++) {
                class205.field3493[var3][var2][var16] = var1;
            }
        }
        if (class265.field4640 == 3) {
            return;
        }
        int var4 = 0;
        if (arg0 != 16) {
            field2881 = -90;
        }
        while (var4 < 2) {
            class237.field4092[var4] = -1000000;
            class23.field472[var4] = 1000000;
            class194.field3371[var4] = 0;
            class103.field1824[var4] = 1000000;
            class166.field2967[var4] = 0;
            var4++;
        }
        if (class207.field3549 != 1) {
            int var5 = class70.method480(class265.field4640, (byte) 126, class6.field86, class20.field361);
            if (var5 - class122.field2239 < 800 && (class138.field2461[class265.field4640][class6.field86 >> 7][class20.field361 >> 7] & 0x4) != 0) {
                class253.method1753(1, class31.field553, (byte) -116, class20.field361 >> 7, class6.field86 >> 7, false);
                return;
            }
            return;
        }
        if ((class138.field2461[class265.field4640][class163.field2943.field4492 >> 7][class163.field2943.field4466 >> 7] & 0x4) != 0) {
            class253.method1753(0, class31.field553, (byte) 54, class163.field2943.field4466 >> 7, class163.field2943.field4492 >> 7, false);
        }
        if (class224.field3864 >= 310) {
            return;
        }
        int var6 = class6.field86 >> 7;
        int var7 = class20.field361 >> 7;
        int var8 = class163.field2943.field4492 >> 7;
        int var9;
        if (var6 < var8) {
            var9 = var8 - var6;
        } else {
            var9 = var6 - var8;
        }
        int var10 = class163.field2943.field4466 >> 7;
        int var11;
        if (var10 <= var7) {
            var11 = var7 - var10;
        } else {
            var11 = var10 - var7;
        }
        if (var9 > var11) {
            int var12 = 32768;
            int var13 = var11 * 65536 / var9;
            while (var6 != var8) {
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class138.field2461[class265.field4640][var6][var7] & 0x4) != 0) {
                    class253.method1753(1, class31.field553, (byte) -93, var7, var6, false);
                    return;
                }
                var12 += var13;
                if (var12 >= 65536) {
                    var12 -= 65536;
                    if (var10 > var7) {
                        var7++;
                    } else if (var7 > var10) {
                        var7--;
                    }
                    if ((class138.field2461[class265.field4640][var6][var7] & 0x4) != 0) {
                        class253.method1753(1, class31.field553, (byte) -128, var7, var6, false);
                        return;
                    }
                }
            }
            return;
        }
        int var14 = var9 * 65536 / var11;
        int var15 = 32768;
        while (var7 != var10) {
            if (var7 < var10) {
                var7++;
            } else if (var7 > var10) {
                var7--;
            }
            if ((class138.field2461[class265.field4640][var6][var7] & 0x4) != 0) {
                class253.method1753(1, class31.field553, (byte) -120, var7, var6, false);
                return;
            }
            var15 += var14;
            if (var15 >= 65536) {
                var15 -= 65536;
                if (var6 < var8) {
                    var6++;
                } else if (var6 > var8) {
                    var6--;
                }
                if ((class138.field2461[class265.field4640][var6][var7] & 0x4) != 0) {
                    class253.method1753(1, class31.field553, (byte) -121, var7, var6, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!td", name = "g", descriptor = "(B)V")
    public static void method1142(byte arg0) {
        field2878 = null;
        field2870 = null;
        field2871 = null;
        field2875 = null;
        field2880 = null;
        field2882 = null;
        field2874 = null;
        int var1 = -76 % ((-arg0 - 29) / 43);
    }

    @OriginalMember(owner = "client!td", name = "h", descriptor = "(B)Z")
    public abstract boolean method349(byte arg0);

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(Z)V")
    public static final void method1143(boolean arg0) {
        if (arg0) {
            field2878 = null;
        }
        field2884++;
        if (class252.field4416 == null) {
            return;
        }
        try {
            byte[] var1 = class252.field4416.method1419(arg0);
            if (var1 != null) {
                class216 var2 = new class216(var1);
                class155.field2842 = var2.method1487(106);
                class229.field3947 = new class189[class155.field2842];
                for (int var3 = 0; var3 < class155.field2842; var3++) {
                    class189 var4 = class229.field3947[var3] = new class189();
                    int var5 = var2.method1487(114);
                    var4.field3276 = var5 & 0x7FFF;
                    var4.field3269 = (var5 & 0x8000) != 0;
                    var4.field3273 = var2.method1445(-3);
                    var4.field3265 = var2.method1483(-81);
                    var4.field3266 = var3;
                    int var6 = var2.method1487(40);
                    var4.field3262 = class62.method454(14, var6);
                }
                class71.method493((byte) -61, class229.field3947.length - 1, class229.field3947, 0);
                class252.field4416 = null;
            }
        } catch (Exception var8) {
            var8.printStackTrace();
            class252.field4416 = null;
        }
    }

    @OriginalMember(owner = "client!td", name = "a", descriptor = "(BI)Z")
    public static final boolean method1144(byte arg0, int arg1) {
        if (arg0 <= 69) {
            method1143(true);
        }
        field2885++;
        return arg1 >= 97 && arg1 <= 122 || arg1 >= 65 && arg1 <= 90;
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(Z)Ljava/lang/Object;")
    public abstract Object method351(boolean arg0);

    @OriginalMember(owner = "client!td", name = "i", descriptor = "(B)V")
    public static final void method1145(byte arg0) {
        if (class107.field1915[98]) {
            class45.field758 += (12 - class45.field758) / 2;
        } else if (class107.field1915[99]) {
            class45.field758 += (-class45.field758 - 12) / 2;
        } else {
            class45.field758 /= 2;
        }
        int var1 = class49.field820 + class163.field2943.field4466;
        class113.field2002 += class45.field758 / 2;
        if (class107.field1915[96]) {
            class246.field4337 += (-class246.field4337 - 24) / 2;
        } else if (class107.field1915[97]) {
            class246.field4337 += (24 - class246.field4337) / 2;
        } else {
            class246.field4337 /= 2;
        }
        int var2 = class26.field503 + class163.field2943.field4492;
        if (class83.field1464 - var2 < -500 || (class83.field1464 - var2) > 500 || class114.field2043 - var1 < -500 || (class114.field2043 - var1) > 500) {
            class114.field2043 = var1;
            class83.field1464 = var2;
        }
        if (class114.field2043 != var1) {
            class114.field2043 += (var1 - class114.field2043) / 16;
        }
        class243.field4219 += class246.field4337 / 2;
        field2876++;
        if (class83.field1464 != var2) {
            class83.field1464 += (var2 - class83.field1464) / 16;
        }
        if (arg0 != 79) {
            field2872 = -100;
        }
        class245.method1690(1098064519);
    }

    @OriginalMember(owner = "client!td", name = "b", descriptor = "(III)V")
    public static final void method1146(int arg0, int arg1, int arg2) {
        field2877++;
        if (class13.field253 != arg0) {
            class261.field4577 = new int[arg0];
            for (int var3 = 0; var3 < arg0; var3++) {
                class261.field4577[var3] = (var3 << 12) / arg0;
            }
            class13.field253 = arg0;
            class191.field3309 = arg0 == 64 ? 2048 : 4096;
            class162.field2924 = arg0 - 1;
        }
        if (arg1 > -121 || class20.field373 == arg2) {
            return;
        }
        if (class13.field253 == arg2) {
            class214.field3639 = class261.field4577;
        } else {
            class214.field3639 = new int[arg2];
            for (int var4 = 0; var4 < arg2; var4++) {
                class214.field3639[var4] = (var4 << 12) / arg2;
            }
        }
        class191.field3299 = arg2 - 1;
        class20.field373 = arg2;
    }
}
