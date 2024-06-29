import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public abstract class class183 {

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "Lhc;")
    public static class368 field2566 = new class368("Loaded input handler", "Eingabeprozedur geladen.", "Gestionnaire de saisie chargé", "Gerenciador de entradas carregado");

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
    public static int[] field2569 = new int[256];

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "Lhc;")
    public static class368 field2571 = new class368("flash2:", "blinken2:", "clignotant2:", "flash2:");

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "I")
    public static int field2567;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "I")
    public static int field2568;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field2572;

    // $FF: synthetic field
    @OriginalMember(owner = "client!cj", name = "h", descriptor = "Ljava/lang/Class;")
    public static Class field2573;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "[I")
    public static int[] field2570;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BLnh;)Lnh;")
    public abstract class81 method1273(byte arg0, class81 arg1);

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Z)V")
    public static final void method1274(boolean arg0) {
        while (true) {
            class255 var1 = (class255) class350.field4715.method1160((byte) 88);
            if (var1 == null) {
                if (!arg0) {
                    field2569 = null;
                }
                field2572++;
                return;
            }
            if (class341.field4617 != null) {
                class185 var3;
                if (var1.field3561 >= 0) {
                    int var2 = var1.field3561 - 1;
                    var3 = class428.field5951[var2];
                } else {
                    int var4 = -var1.field3561 - 1;
                    if (class217.field3030 == var4) {
                        var3 = class359.field4970;
                    } else {
                        var3 = class87.field1227[var4];
                    }
                }
                if (var3 != null) {
                    class447 var5 = class133.method996((byte) -19, var1.field3550);
                    int var6;
                    int var7;
                    if (var1.field3555 == 1 || var1.field3555 == 3) {
                        var7 = var5.field6322;
                        var6 = var5.field6330;
                    } else {
                        var6 = var5.field6322;
                        var7 = var5.field6330;
                    }
                    int var8 = (var7 >> 1) + var1.field3545;
                    int var9 = (var7 + 1 >> 1) + var1.field3545;
                    int var10 = (var6 >> 1) + var1.field3558;
                    int var11 = (var6 + 1 >> 1) + var1.field3558;
                    class323 var12 = class436.field6160[var3.field42];
                    int var13 = var12.method329(var8, var10) - (-var12.method329(var9, var10) - var12.method329(var8, var11) - var12.method329(var9, var11)) >> 2;
                    class223 var14 = null;
                    int var15 = class160.field2279[var1.field3552];
                    if (var15 == 0) {
                        var14 = (class223) class243.method1587(var3.field42, var1.field3545, var1.field3558);
                    } else if (var15 == 1) {
                        var14 = (class223) class85.method680(var3.field42, var1.field3545, var1.field3558);
                    } else if (var15 == 2) {
                        var14 = (class223) class95.method734(var3.field42, var1.field3545, var1.field3558, field2573 == null ? (field2573 = method1278("iq")) : field2573);
                    } else if (var15 == 3) {
                        var14 = (class223) class111.method852(var3.field42, var1.field3545, var1.field3558);
                    }
                    if (var14 != null) {
                        class229.method1495(var1.field3558, var15, (byte) -53, var3.field42, var1.field3545, var1.field3541, var1.field3543 + 1, 0, -1, 0);
                        var3.field2656 = var14;
                        var3.field2672 = var13;
                        var3.field2667 = class246.field3467 + var1.field3541;
                        var3.field2665 = var1.field3545 * 128 + (var7 * 64);
                        var3.field2673 = class246.field3467 + var1.field3543;
                        var3.field2660 = var1.field3558 * 128 + var6 * 64;
                        int var16 = var1.field3544;
                        int var17 = var1.field3547;
                        int var18 = var1.field3551;
                        int var19 = var1.field3542;
                        if (var17 < var16) {
                            int var20 = var16;
                            var16 = var17;
                            var17 = var20;
                        }
                        var3.field2655 = var1.field3545 + var16;
                        var3.field2671 = var1.field3545 + var17;
                        if (var18 > var19) {
                            int var21 = var18;
                            var18 = var19;
                            var19 = var21;
                        }
                        var3.field2669 = var1.field3558 + var19;
                        var3.field2668 = var1.field3558 + var18;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V")
    public static void method1275(int arg0) {
        field2569 = null;
        field2570 = null;
        if (arg0 == 7795) {
            field2566 = null;
            field2571 = null;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Lea;Lwk;ILqg;)V")
    public static final void method1276(class58 arg0, class430 arg1, int arg2, class157 arg3) {
        field2568++;
        class77 var4 = arg1.method2652(-92, arg0);
        if (var4 == null) {
            return;
        }
        int var5 = var4.method628();
        if (var5 < var4.method631()) {
            var5 = var4.method631();
        }
        byte var6 = 10;
        if (arg2 < 73) {
            return;
        }
        int var7 = arg3.field2227;
        int var8 = arg3.field2232;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        if (arg1.field6018 != null) {
            var9 = class254.field3521.method2423((class77[]) null, class274.field3751, (byte) 120, arg1.field6018, (int[]) null);
            for (int var12 = 0; var12 < var9; var12++) {
                String var13 = class274.field3751[var12];
                if (var9 - 1 > var12) {
                    var13 = var13.substring(0, var13.length() - 4);
                }
                int var14 = class309.field4195.method138(var13);
                if (var14 > var10) {
                    var10 = var14;
                }
            }
            var11 = class309.field4195.method142() * var9 + (class309.field4195.method137() / 2);
        }
        int var15 = arg3.field2227 + (var5 / 2);
        int var16 = arg3.field2232;
        if ((class333.field4504 + var5) > var7) {
            var15 = var10 / 2 + var5 / 2 + var6 + class333.field4504 + 5;
            var7 = class333.field4504;
        } else if (var7 > class333.field4506 - var5) {
            var7 = class333.field4506 - var5;
            var15 = class333.field4506 - (var10 / 2 + 5) - (var5 / 2) - var6;
        }
        if (var8 < (class333.field4515 + var5)) {
            var8 = class333.field4515;
            var16 = var5 / 2 + var6 + class333.field4515;
        } else if (var8 > (class333.field4516 - var5)) {
            var8 = class333.field4516 - var5;
            var16 = class333.field4516 - (var5 / 2) - var6 - var11;
        }
        int var17 = (int) (Math.atan2((double) (var7 - arg3.field2227), (double) (var8 - arg3.field2232)) / 3.141592653589793D * 32767.0D) & 0xFFFF;
        var4.method630((float) var5 / 2.0F + (float) var7, (float) var5 / 2.0F + (float) var8, 4096, var17);
        int var18 = -2;
        int var19 = -2;
        int var20 = -2;
        int var21 = -2;
        if (arg1.field6018 != null) {
            var18 = var15 - (var10 / 2) - 5;
            var19 = var16;
            var21 = var16 + (class309.field4195.method142() * var9) + 3;
            var20 = var18 + var10 + 10;
            if (arg1.field6002 != 0) {
                arg0.method461(var20 - var18, arg1.field6002, var21 - var16, -91, var18, var16);
            }
            if (arg1.field6008 != 0) {
                arg0.method460((byte) 48, var18, arg1.field6008, var20 - var18, -var16 + var21, var16);
            }
            for (int var22 = 0; var22 < var9; var22++) {
                String var23 = class274.field3751[var22];
                if ((var9 - 1) > var22) {
                    var23 = var23.substring(0, var23.length() - 4);
                }
                class309.field4195.method141(arg0, var23, var15, var16, arg1.field6000, true);
                var16 += class309.field4195.method142();
            }
        }
        if (arg1.field5990 == -1 && arg1.field6018 == null) {
            return;
        }
        int var24 = var5 >> 1;
        class336 var25 = new class336(arg3);
        var25.field4541 = var20;
        var25.field4551 = var7 - var24;
        var25.field4542 = var8 + var24;
        var25.field4546 = var18;
        var25.field4549 = var8 - var24;
        var25.field4543 = var19;
        var25.field4538 = var21;
        var25.field4550 = var7 + var24;
        class343.field4621.method1162(119, var25);
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(BZ)V")
    public static final void method1277(byte arg0, boolean arg1) {
        field2567++;
        class210.method1413((byte) -30, class396.field5493, class350.field4712, arg1, class373.field5174);
        if (arg0 < 64) {
            field2571 = null;
        }
    }

    // $FF: synthetic method
    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;")
    public static Class method1278(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }
}
