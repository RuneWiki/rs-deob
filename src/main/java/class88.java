import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!j")
public class class88 {

    @OriginalMember(owner = "client!j", name = "f", descriptor = "Ljava/lang/String;")
    public static String field1457 = " has logged in.";

    @OriginalMember(owner = "client!j", name = "d", descriptor = "[Z")
    public static boolean[] field1455 = new boolean[100];

    @OriginalMember(owner = "client!j", name = "c", descriptor = "Lpf;")
    public static class17 field1454 = new class17(64);

    @OriginalMember(owner = "client!j", name = "h", descriptor = "I")
    public static int field1459 = 0;

    @OriginalMember(owner = "client!j", name = "g", descriptor = "[I")
    public static int[] field1458 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!j", name = "a", descriptor = "I")
    public static int field1452;

    @OriginalMember(owner = "client!j", name = "b", descriptor = "I")
    public static int field1453;

    @OriginalMember(owner = "client!j", name = "e", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(BLaj;)V")
    public static final void method614(byte arg0, class151 arg1) {
        class7.field142 = arg1;
        field1453++;
        if (arg0 != 18) {
            method617(true);
        }
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(Z)V")
    public static final void method615(boolean arg0) {
        int var1 = class58.field1020;
        int var2 = class213.field3596;
        field1456++;
        int var3 = class263.field4398 - 3;
        int var4 = class275.field4604;
        byte var5 = 20;
        if (class250.field4236 == null || class3.field107 == null) {
            if (class25.field445.method1118((byte) 43, class254.field4303) && class25.field445.method1118((byte) 115, class302.field4923)) {
                class250.field4236 = class104.method765(0, class254.field4303, (byte) 59, class25.field445);
                class3.field107 = class104.method765(0, class302.field4923, (byte) 94, class25.field445);
            } else {
                class211.method1480(var2, var1, var4, var5, class103.field1651, 256 - class186.field2980);
            }
        }
        if (class250.field4236 != null && class3.field107 != null) {
            int var6 = (var4 - (class3.field107.field4564 * 2)) / class250.field4236.field4564;
            for (int var7 = 0; var7 < var6; var7++) {
                class250.field4236.method652(class3.field107.field4564 + (class250.field4236.field4564 * var7) + var2, var1);
            }
            class3.field107.method652(var2, var1);
            class3.field107.method647(var2 + var4 - class3.field107.field4564, var1);
        }
        class183.field2930.method1234(class90.field1497, var2 + 3, var1 + 14, class118.field1985, -1);
        class211.method1480(var2, var1 + var5, var4, var3 - var5, class103.field1651, 256 - class186.field2980);
        int var8 = class96.field1558;
        int var9 = class87.field1448;
        for (int var10 = 0; var10 < class287.field4747; var10++) {
            int var18 = var5 + (class287.field4747 - var10 - 1) * 15 + var1 + 13;
            if (var2 < var8 && var8 < var2 + var4 && var18 - 13 < var9 && var18 + 3 > var9) {
                class211.method1480(var2, var18 - 12, var4, 15, class37.field588, 256 - class272.field4531);
            }
        }
        if ((class1.field13 == null || class54.field936 == null || class54.field971 == null) && class25.field445.method1118((byte) 112, class187.field2994) && class25.field445.method1118((byte) 43, class234.field3968) && class25.field445.method1118((byte) 38, class263.field4397)) {
            class1.field13 = class104.method765(0, class187.field2994, (byte) 65, class25.field445);
            class54.field936 = class104.method765(0, class234.field3968, (byte) 112, class25.field445);
            class54.field971 = class104.method765(0, class263.field4397, (byte) 94, class25.field445);
        }
        if (class1.field13 != null && class54.field936 != null && class54.field971 != null) {
            int var11 = (var4 - (class54.field971.field4564 * 2)) / class1.field13.field4564;
            for (int var12 = 0; var12 < var11; var12++) {
                class1.field13.method652(class1.field13.field4564 * var12 + class54.field971.field4564 + var2, -class1.field13.field4574 + var1 - -var3);
            }
            int var13 = (var3 - var5 - class54.field971.field4574) / class54.field936.field4574;
            for (int var14 = 0; var14 < var13; var14++) {
                class54.field936.method652(var2, class54.field936.field4574 * var14 + var1 + var5);
                class54.field936.method647(var2 - (class54.field936.field4564 - var4), class54.field936.field4574 * var14 + var1 + var5);
            }
            class54.field971.method652(var2, var1 + var3 - class54.field971.field4574);
            class54.field971.method647(var2 + var4 - class54.field971.field4564, -class54.field971.field4574 + var1 - -var3);
        }
        if (arg0) {
            field1457 = null;
        }
        for (int var15 = 0; var15 < class287.field4747; var15++) {
            int var16 = class118.field1985;
            int var17 = var1 + var5 - (-((class287.field4747 + -1 + -var15) * 15) + -13);
            if (var2 < var8 && var2 + var4 > var8 && var9 > (var17 - 13) && var17 + 3 > var9) {
                var16 = class25.field443;
            }
            class183.field2930.method1234(class123.method933(var15, true), var2 + 3, var17, var16, 0);
        }
        class158.method1183(class213.field3596, 106, class263.field4398, class58.field1020, class275.field4604);
    }

    @OriginalMember(owner = "client!j", name = "a", descriptor = "(IILab;IBIIIIIZZ)V")
    public static final void method616(int arg0, int arg1, class249 arg2, int arg3, byte arg4, int arg5, int arg6, int arg7, int arg8, int arg9, boolean arg10, boolean arg11) {
        if (arg5 >= 0 && arg5 < 104 && arg0 >= 0 && arg0 < 104) {
            if (!arg11 && !arg10) {
                class67.field1132[arg1][arg5][arg0] = 0;
            }
            while (true) {
                int var12 = arg2.method1802((byte) 107);
                if (var12 == 0) {
                    if (arg11) {
                        class245.field4123[0][arg5 + arg8][arg0 + arg3] = class207.field3401[0][arg5 + arg8][arg0 + arg3];
                    } else if (arg1 == 0) {
                        class245.field4123[0][arg5 + arg8][arg0 + arg3] = -class223.method1580(arg6 + 556238, arg9 + 932731, -121) * 8;
                    } else {
                        class245.field4123[arg1][arg5 + arg8][arg0 + arg3] = class245.field4123[arg1 - 1][arg5 + arg8][arg0 + arg3] - 240;
                    }
                    break;
                }
                if (var12 == 1) {
                    int var13 = arg2.method1802((byte) 118);
                    if (arg11) {
                        class245.field4123[0][arg5 + arg8][arg0 + arg3] = var13 * 8 + class207.field3401[0][arg5 + arg8][arg0 + arg3];
                    } else {
                        if (var13 == 1) {
                            var13 = 0;
                        }
                        if (arg1 == 0) {
                            class245.field4123[0][arg5 + arg8][arg0 + arg3] = -var13 * 8;
                        } else {
                            class245.field4123[arg1][arg5 + arg8][arg0 + arg3] = class245.field4123[arg1 - 1][arg5 + arg8][arg0 + arg3] - (var13 * 8);
                        }
                    }
                    break;
                }
                if (var12 <= 49) {
                    if (arg10) {
                        arg2.method1802((byte) -96);
                    } else {
                        class240.field4056[arg1][arg5][arg0] = arg2.method1768(119);
                        class46.field811[arg1][arg5][arg0] = (byte) ((var12 - 2) / 4);
                        class119.field2002[arg1][arg5][arg0] = (byte) class15.method84(3, var12 + arg7 - 2);
                    }
                } else if (var12 <= 81) {
                    if (!arg11 && !arg10) {
                        class67.field1132[arg1][arg5][arg0] = (byte) (var12 - 49);
                    }
                } else if (!arg10) {
                    class151.field2519[arg1][arg5][arg0] = (byte) (var12 - 81);
                }
            }
        } else {
            while (true) {
                int var14 = arg2.method1802((byte) 102);
                if (var14 == 0) {
                    break;
                }
                if (var14 == 1) {
                    arg2.method1802((byte) 50);
                    break;
                }
                if (var14 <= 49) {
                    arg2.method1802((byte) 110);
                }
            }
        }
        if (arg4 != -110) {
            field1454 = null;
        }
        field1452++;
    }

    @OriginalMember(owner = "client!j", name = "b", descriptor = "(Z)V")
    public static void method617(boolean arg0) {
        field1454 = null;
        field1458 = null;
        field1457 = null;
        if (arg0) {
            field1455 = null;
        }
    }
}
