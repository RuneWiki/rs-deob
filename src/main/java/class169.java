import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hf")
public class class169 extends class28 {

    @OriginalMember(owner = "client!hf", name = "H", descriptor = "Lvf;")
    public static class265 field3053 = class87.method582(-46, " <col=ffff00>");

    @OriginalMember(owner = "client!hf", name = "I", descriptor = "Lvf;")
    public static class265 field3054 = class87.method582(-46, ")4p=");

    @OriginalMember(owner = "client!hf", name = "O", descriptor = "[I")
    public static int[] field3060 = new int[128];

    @OriginalMember(owner = "client!hf", name = "L", descriptor = "Lvf;")
    public static class265 field3057 = class87.method582(-46, "gleiten:");

    @OriginalMember(owner = "client!hf", name = "J", descriptor = "Ldg;")
    public static class276 field3055 = new class276(30);

    @OriginalMember(owner = "client!hf", name = "W", descriptor = "Lvf;")
    public static class265 field3068 = class87.method582(-46, "<img=1>");

    @OriginalMember(owner = "client!hf", name = "G", descriptor = "I")
    public static int field3052;

    @OriginalMember(owner = "client!hf", name = "K", descriptor = "I")
    public static int field3056;

    @OriginalMember(owner = "client!hf", name = "N", descriptor = "I")
    public static int field3059;

    @OriginalMember(owner = "client!hf", name = "P", descriptor = "I")
    public static int field3061;

    @OriginalMember(owner = "client!hf", name = "Q", descriptor = "I")
    public static int field3062;

    @OriginalMember(owner = "client!hf", name = "R", descriptor = "I")
    public static int field3063;

    @OriginalMember(owner = "client!hf", name = "S", descriptor = "I")
    public static int field3064;

    @OriginalMember(owner = "client!hf", name = "U", descriptor = "I")
    public static int field3066;

    @OriginalMember(owner = "client!hf", name = "V", descriptor = "I")
    public static int field3067;

    @OriginalMember(owner = "client!hf", name = "T", descriptor = "Lte;")
    public static class251 field3065;

    @OriginalMember(owner = "client!hf", name = "M", descriptor = "Lak;")
    private class269 field3058;

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BI)I")
    public static final int method1114(byte arg0, int arg1) {
        field3063++;
        return arg0 == 79 ? arg1 >>> 7 : -52;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(II)V")
    public static final void method1115(int arg0, int arg1) {
        field3059++;
        class88 var2;
        if (class75.field1438 == null) {
            var2 = new class88(512, 512);
        } else {
            var2 = (class88) class75.field1438;
        }
        int[] var3 = var2.field1592;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            var3[var5] = 1;
        }
        if (arg0 != -27952) {
            return;
        }
        for (int var6 = 1; var6 < 103; var6++) {
            int var24 = (103 - var6) * 512 * 4 + 24628;
            for (int var25 = 1; var25 < 103; var25++) {
                if ((class230.field4064[arg1][var25][var6] & 0x18) == 0) {
                    class273.method1873(var3, var24, 512, arg1, var25, var6);
                }
                if (arg1 < 3 && (class230.field4064[arg1 + 1][var25][var6] & 0x8) != 0) {
                    class273.method1873(var3, var24, 512, arg1 + 1, var25, var6);
                }
                var24 += 4;
            }
        }
        int var7 = ((int) (Math.random() * 20.0D)) + 238 - (10 - (((int) (Math.random() * 20.0D) + 238 + -10 << 16) + ((int) (Math.random() * 20.0D) + -10 + 238 << 8)));
        var2.method596();
        int var8 = (int) (Math.random() * 20.0D) + 238 - 10 << 16;
        for (int var9 = 1; var9 < 103; var9++) {
            for (int var23 = 1; var23 < 103; var23++) {
                if ((class230.field4064[arg1][var23][var9] & 0x18) == 0) {
                    class119.method799(arg1, arg0 + 27949, var7, var8, var23, var9);
                }
                if (arg1 < 3 && (class230.field4064[arg1 + 1][var23][var9] & 0x8) != 0) {
                    class119.method799(arg1 + 1, -3, var7, var8, var23, var9);
                }
            }
        }
        class225.field3995 = 0;
        for (int var10 = 0; var10 < 104; var10++) {
            for (int var11 = 0; var11 < 104; var11++) {
                long var12 = class23.method221(class216.field3902, var10, var11);
                if (var12 != 0L) {
                    class130 var14 = class84.method574(-128, (int) (var12 >>> 32) & Integer.MAX_VALUE);
                    int var15 = var14.field2317;
                    if (var14.field2365 != null) {
                        for (int var16 = 0; var16 < var14.field2365.length; var16++) {
                            if (var14.field2365[var16] != -1) {
                                class130 var17 = class84.method574(-127, var14.field2365[var16]);
                                if (var17.field2317 >= 0) {
                                    var15 = var17.field2317;
                                    break;
                                }
                            }
                        }
                    }
                    if (var15 >= 0) {
                        int var18 = var11;
                        int var19 = var10;
                        if (var15 != 22 && var15 != 29 && var15 != 34 && var15 != 36 && var15 != 46 && var15 != 47 && var15 != 48) {
                            int[][] var20 = class130.field2279[class216.field3902].field4422;
                            for (int var21 = 0; var21 < 10; var21++) {
                                int var22 = (int) (Math.random() * 4.0D);
                                if (var22 == 0 && var19 > 0 && var10 - 3 < var19 && (var20[var19 - 1][var18] & 0x12C0108) == 0) {
                                    var19--;
                                }
                                if (var22 == 1 && var19 < 103 && var19 < (var10 + 3) && (var20[var19 + 1][var18] & 0x12C0180) == 0) {
                                    var19++;
                                }
                                if (var22 == 2 && var18 > 0 && var11 - 3 < var18 && (var20[var19][var18 - 1] & 0x12C0102) == 0) {
                                    var18--;
                                }
                                if (var22 == 3 && var18 < 103 && (var11 + 3) > var18 && (var20[var19][var18 + 1] & 0x12C0120) == 0) {
                                    var18++;
                                }
                            }
                        }
                        class36.field832[class225.field3995] = var14.field2357;
                        class162.field2949[class225.field3995] = var19;
                        class89.field1594[class225.field3995] = var18;
                        class225.field3995++;
                    }
                }
            }
        }
        class75.field1438 = var2;
        class252.field4334.method846((byte) 2);
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Z)V")
    public static void method1116(boolean arg0) {
        field3065 = null;
        field3060 = null;
        field3057 = null;
        field3055 = null;
        field3054 = null;
        field3068 = null;
        field3053 = null;
        if (arg0) {
            field3057 = null;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(IIIII)V")
    public static final void method1117(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 >= -6) {
            field3068 = null;
        }
        for (int var5 = 0; var5 < class119.field2104; var5++) {
            if (arg3 < client.field3858[var5] + class124.field2229[var5] && client.field3858[var5] < arg3 + arg4 && (class72.field1390[var5] + class102.field1811[var5]) > arg2 && (arg1 + arg2) > class72.field1390[var5]) {
                class135.field2481[var5] = true;
            }
        }
        field3061++;
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lng;II)V")
    private final void method1118(class135 arg0, int arg1, int arg2) {
        if (arg2 != -2) {
            return;
        }
        field3052++;
        if (arg1 != 249) {
            return;
        }
        int var4 = arg0.method920((byte) 28);
        if (this.field3058 == null) {
            int var5 = class98.method651(var4, (byte) -116);
            this.field3058 = new class269(var5);
        }
        for (int var6 = 0; var6 < var4; var6++) {
            boolean var7 = arg0.method920((byte) 63) == 1;
            int var8 = arg0.method909(arg2 - 917770350);
            class12 var9;
            if (var7) {
                var9 = new class93(arg0.method942(false));
            } else {
                var9 = new class203(arg0.method949(3933));
            }
            this.field3058.method1838((long) var8, var9, (byte) 8);
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(BLvf;I)Lvf;")
    public final class265 method1119(byte arg0, class265 arg1, int arg2) {
        if (arg0 != 51) {
            field3060 = null;
        }
        field3056++;
        if (this.field3058 == null) {
            return arg1;
        } else {
            class93 var4 = (class93) this.field3058.method1842(-1, (long) arg2);
            return var4 == null ? arg1 : var4.field1654;
        }
    }

    @OriginalMember(owner = "client!hf", name = "a", descriptor = "(Lng;B)V")
    public final void method1120(class135 arg0, byte arg1) {
        if (arg1 != -79) {
            this.method1118((class135) null, 66, 32);
        }
        field3066++;
        while (true) {
            int var3 = arg0.method920((byte) 69);
            if (var3 == 0) {
                return;
            }
            this.method1118(arg0, var3, -2);
        }
    }

    @OriginalMember(owner = "client!hf", name = "b", descriptor = "(III)I")
    public final int method1121(int arg0, int arg1, int arg2) {
        if (arg1 != 20) {
            return 6;
        }
        field3064++;
        if (this.field3058 == null) {
            return arg2;
        } else {
            class203 var4 = (class203) this.field3058.method1842(-1, (long) arg0);
            return var4 == null ? arg2 : var4.field3640;
        }
    }
}
