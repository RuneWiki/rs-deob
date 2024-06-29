import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class137 {

    @OriginalMember(owner = "client!pa", name = "i", descriptor = "Lkb;")
    private static class93 field2655 = class76.method390("wave:", 0);

    @OriginalMember(owner = "client!pa", name = "f", descriptor = "Lkb;")
    public static class93 field2652 = field2655;

    @OriginalMember(owner = "client!pa", name = "k", descriptor = "Lkb;")
    private static class93 field2657 = class76.method390("Malformed login packet)3", 0);

    @OriginalMember(owner = "client!pa", name = "j", descriptor = "Lkb;")
    public static class93 field2656 = class76.method390("Keine Antwort vom Anmelde)2Server)3", 0);

    @OriginalMember(owner = "client!pa", name = "d", descriptor = "[Lkb;")
    public static class93[] field2650 = new class93[100];

    @OriginalMember(owner = "client!pa", name = "g", descriptor = "Lkb;")
    public static class93 field2653 = field2657;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "Lkb;")
    public static class93 field2648 = field2655;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field2647;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field2649;

    @OriginalMember(owner = "client!pa", name = "e", descriptor = "I")
    public static int field2651;

    @OriginalMember(owner = "client!pa", name = "l", descriptor = "I")
    public static int field2658;

    @OriginalMember(owner = "client!pa", name = "h", descriptor = "[S")
    public static short[] field2654;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(ZI)V")
    public static final void method860(boolean arg0, int arg1) {
        field2658++;
        int[] var2 = class12.field204.field2450;
        int var3 = var2.length;
        int var4 = 0;
        if (!arg0) {
            method860(false, -119);
        }
        while (var4 < var3) {
            var2[var4] = 1;
            var4++;
        }
        for (int var5 = 1; var5 < 103; var5++) {
            int var20 = (52736 - var5 * 512) * 4 + 24628;
            for (int var21 = 1; var21 < 103; var21++) {
                if ((class136.field2637[arg1][var21][var5] & 0x18) == 0) {
                    class175.field3458.method805(var2, var20, 512, arg1, var21, var5);
                }
                if (arg1 < 3 && (class136.field2637[arg1 + 1][var21][var5] & 0x8) != 0) {
                    class175.field3458.method805(var2, var20, 512, arg1 + 1, var21, var5);
                }
                var20 += 4;
            }
        }
        class12.field204.method736();
        int var6 = ((int) (Math.random() * 20.0D) + 228 << 16) - (-((int) (Math.random() * 20.0D) + 238 - 10 << 8) - 238) + (int) (Math.random() * 20.0D) - 10;
        int var7 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var8 = 1; var8 < 103; var8++) {
            for (int var19 = 1; var19 < 103; var19++) {
                if ((class136.field2637[arg1][var19][var8] & 0x18) == 0) {
                    class93.method522(var8, var7, arg1, 30, var19, var6);
                }
                if (arg1 < 3 && (class136.field2637[arg1 + 1][var19][var8] & 0x8) != 0) {
                    class93.method522(var8, var7, arg1 + 1, 71, var19, var6);
                }
            }
        }
        class182.field3597 = 0;
        for (int var9 = 0; var9 < 104; var9++) {
            for (int var10 = 0; var10 < 104; var10++) {
                int var11 = class175.field3458.method809(class114.field2145, var9, var10);
                if (var11 != 0) {
                    int var12 = var11 >> 14 & 0x7FFF;
                    int var13 = class154.method990(var12, arg0).field1462;
                    if (var13 >= 0) {
                        int var14 = var9;
                        int var15 = var10;
                        if (var13 != 22 && var13 != 29 && var13 != 34 && var13 != 36 && var13 != 46 && var13 != 47 && var13 != 48) {
                            int[][] var16 = class145.field2822[class114.field2145].field2916;
                            for (int var17 = 0; var17 < 10; var17++) {
                                int var18 = (int) (Math.random() * 4.0D);
                                if (var18 == 0 && var14 > 0 && var9 - 3 < var14 && (var16[var14 - 1][var15] & 0x12C0108) == 0) {
                                    var14--;
                                }
                                if (var18 == 1 && var14 < 103 && var14 < var9 + 3 && (var16[var14 + 1][var15] & 0x12C0180) == 0) {
                                    var14++;
                                }
                                if (var18 == 2 && var15 > 0 && var15 > var10 - 3 && (var16[var14][var15 - 1] & 0x12C0102) == 0) {
                                    var15--;
                                }
                                if (var18 == 3 && var15 < 103 && var15 < var10 + 3 && (var16[var14][var15 + 1] & 0x12C0120) == 0) {
                                    var15++;
                                }
                            }
                        }
                        class101.field1857[class182.field3597] = class2.field37[var13];
                        class135.field2628[class182.field3597] = var14;
                        class120.field2220[class182.field3597] = var15;
                        class182.field3597++;
                    }
                }
            }
        }
        class157.field3113.method1222(-27445);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lh;I)Z")
    public static final boolean method861(class65 arg0, int arg1) {
        field2649++;
        if (arg0.field1049 == null) {
            return false;
        }
        int var2 = 0;
        if (arg1 != 17108) {
            field2655 = null;
        }
        while (var2 < arg0.field1049.length) {
            int var3 = class117.method647(arg0, var2, (byte) 41);
            int var4 = arg0.field1149[var2];
            if (arg0.field1049[var2] == 2) {
                if (var4 <= var3) {
                    return false;
                }
            } else if (arg0.field1049[var2] == 3) {
                if (var3 <= var4) {
                    return false;
                }
            } else if (arg0.field1049[var2] == 4) {
                if (var3 == var4) {
                    return false;
                }
            } else if (var3 != var4) {
                return false;
            }
            var2++;
        }
        return true;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static void method862(int arg0) {
        field2655 = null;
        field2648 = null;
        field2654 = null;
        field2657 = null;
        field2656 = null;
        if (arg0 != -25894) {
            field2648 = null;
        }
        field2653 = null;
        field2650 = null;
        field2652 = null;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(Lkb;IIILkb;II)V")
    public static final void method863(class93 arg0, int arg1, int arg2, int arg3, class93 arg4, int arg5, int arg6) {
        field2647++;
        if (class121.field2241) {
            return;
        }
        if (arg1 != 17001) {
            field2650 = null;
        }
        if (class100.field1841 >= 500) {
            return;
        }
        class171.field3391[class100.field1841] = arg0;
        class35.field575[class100.field1841] = arg4;
        class152.field2944[class100.field1841] = arg2;
        class178.field3535[class100.field1841] = arg5;
        class53.field897[class100.field1841] = arg3;
        class112.field2084[class100.field1841] = arg6;
        class100.field1841++;
    }
}
