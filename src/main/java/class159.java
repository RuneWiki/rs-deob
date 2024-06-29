import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wh")
public class class159 {

    @OriginalMember(owner = "client!wh", name = "e", descriptor = "I")
    public static int field1974 = -1;

    @OriginalMember(owner = "client!wh", name = "c", descriptor = "Llja;")
    public static class744 field1972 = new class744(58, 7);

    @OriginalMember(owner = "client!wh", name = "f", descriptor = "[B")
    public static byte[] field1975 = new byte[2048];

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "I")
    public static int field1970;

    @OriginalMember(owner = "client!wh", name = "b", descriptor = "I")
    public static int field1971;

    @OriginalMember(owner = "client!wh", name = "d", descriptor = "I")
    public static int field1973;

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(B)V")
    public static void method1115(byte arg0) {
        field1975 = null;
        field1972 = null;
        if (arg0 < 126) {
            method1118(false);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(IIIIBZ)V")
    public static final void method1116(int arg0, int arg1, int arg2, int arg3, byte arg4, boolean arg5) {
        field1971++;
        if (class107.field1351 == null) {
            class363.field4526.method600(arg0, arg1, 785580130, -16777216, arg2, arg3);
        } else if (class300.field3596.field823 >= 0 && class300.field3596.field823 < class596.field8090 * 512 && class300.field3596.field813 >= 0 && class300.field3596.field813 < (class107.field1350 * 512)) {
            class471.field6571++;
            if (class300.field3596 != null && class300.field3596.field823 - (class300.field3596.method1665(1720746760) * 256 - 256) >> 9 == class754.field10460 && class300.field3596.field813 - ((class300.field3596.method1665(1720746760) - 1) * 256) >> 9 == class687.field9376) {
                class687.field9376 = -1;
                class754.field10460 = -1;
                class123.method955((byte) 118);
            }
            class634.method3576(1);
            if (!arg5) {
                class485.method2874((byte) 36);
            }
            class689.method3846((byte) 110);
            class121.method944(arg2, arg1, false, arg0, arg3, true);
            int var6 = class691.field9421;
            int var7 = class133.field1674;
            class621.field8528 = class621.field8527;
            int var8 = class152.field1895;
            int var9 = class480.field6713;
            if (class7.field100 == 1) {
                int var10 = (int) class229.field2718;
                if (var10 < class459.field6467 >> 8) {
                    var10 = class459.field6467 >> 8;
                }
                if (class461.field6476[4] && var10 < (class534.field7526[4] + 128)) {
                    var10 = class534.field7526[4] + 128;
                }
                int var11 = (int) class47.field626 + class136.field1711 & 0x3FFF;
                class481.method2857(class483.method2867(class581.field7921, (byte) -37, class300.field3596.field813, class300.field3596.field823) - 200, -5586, class353.field4390, (var10 >> 3) * 3 + 600 << 2, var9, class713.field10000, var10, var11);
            } else if (class7.field100 == 4) {
                int var12 = (int) class229.field2718;
                if (var12 < class459.field6467 >> 8) {
                    var12 = class459.field6467 >> 8;
                }
                if (class461.field6476[4] && (class534.field7526[4] + 128) > var12) {
                    var12 = class534.field7526[4] + 128;
                }
                int var13 = (int) class47.field626 & 0x3FFF;
                class481.method2857(class483.method2867(class581.field7921, (byte) -39, class93.field1229, class467.field6528) - 200, -5586, class353.field4390, (var12 >> 3) * 3 + 600 << 2, var9, class713.field10000, var12, var13);
            } else if (class7.field100 == 5) {
                class284.method1630(var9, 97);
            }
            int var14 = class599.field8107;
            int var15 = class303.field3622;
            int var16 = class350.field4366;
            int var17 = class793.field10893;
            int var18 = class111.field1405;
            for (int var19 = 0; var19 < 5; var19++) {
                if (class461.field6476[var19]) {
                    int var23 = (int) ((double) (class53.field718[var19] * 2 + 1) * Math.random() + Math.sin((double) class348.field4349[var19] / 100.0D * (double) class571.field7841[var19]) * (double) class534.field7526[var19] - (double) class53.field718[var19]);
                    if (var19 == 0) {
                        class599.field8107 += var23 << 2;
                    }
                    if (var19 == 3) {
                        class111.field1405 = class111.field1405 + var23 & 0x3FFF;
                    }
                    if (var19 == 2) {
                        class350.field4366 += var23 << 2;
                    }
                    if (var19 == 1) {
                        class303.field3622 += var23 << 2;
                    }
                    if (var19 == 4) {
                        class793.field10893 += var23;
                        if (class793.field10893 < 1024) {
                            class793.field10893 = 1024;
                        } else if (class793.field10893 > 3072) {
                            class793.field10893 = 3072;
                        }
                    }
                }
            }
            if (class599.field8107 < 0) {
                class599.field8107 = 0;
            }
            if (class350.field4366 < 0) {
                class350.field4366 = 0;
            }
            if (((class307.field3799 << 9) - 1) < class599.field8107) {
                class599.field8107 = (class307.field3799 << 9) - 1;
            }
            if (class350.field4366 > ((class250.field2938 << 9) - 1)) {
                class350.field4366 = (class250.field2938 << 9) - 1;
            }
            class58.method510(-24062);
            class425.method2538((byte) 102);
            int var20 = 81 / ((arg4 + 43) / 47);
            class363.field4526.method556(var7, var6, var7 + var8, var6 + var9);
            class435.method2574(true, true);
            if (class769.field10572) {
                class302.method1758(class361.field4490, (byte) -41);
                if (class621.field8528 != class566.field7796) {
                    class257.field3034 = true;
                }
                class566.field7796 = class621.field8528;
            } else {
                class363.field4526.method6();
                int var21 = class361.field4490;
                if (class454.field6403 == null) {
                    class363.field4526.method13(var21);
                } else {
                    class454.field6403.method2875(var8, var21, class111.field1405, var7, class793.field10893, var9, var6, class363.field4526, -1, class691.field9401 << 3);
                }
            }
            class580.method3339((byte) -58);
            class93.field1234.method133(class599.field8107, class303.field3622, class350.field4366, -class793.field10893 & 0x3FFF, -class111.field1405 & 0x3FFF, -class641.field8758 & 0x3FFF);
            class363.field4526.method628(class93.field1234);
            class363.field4526.method565(var8 / 2 + var7, var9 / 2 + var6, class782.field10786 << 1, class782.field10786 << 1);
            class664.method3729(class782.field10786 << 1, var8 / 2 + var7, (byte) 27, class782.field10786 << 1, var9 / 2 + var6);
            class624.method3546(-class793.field10893 & 0x3FFF, -class641.field8758 & 0x3FFF, class599.field8107, -1, -class111.field1405 & 0x3FFF, class303.field3622, class350.field4366);
            byte var22 = class118.field1503.field10650.method1600(0) == 2 ? (byte) class471.field6571 : 1;
            if (class769.field10572) {
                class783.method4334(-class641.field8758 & 0x3FFF, -class793.field10893 & 0x3FFF, -class111.field1405 & 0x3FFF, true);
                class705.method4009(class375.field4709, class118.field1503.field10660.method479(0) == 0, class303.field3622, class300.field3596.field813 >> 9, class353.field4383, class789.field10869, class228.field2707, class267.field3162, class350.field4366, class300.field3596.field808 + 1, class621.field8528, class300.field3596.field823 >> 9, var22, class473.field6599, class450.field6371, -39, true, class599.field8107);
            } else {
                class523.method3140(class228.field2707, class599.field8107, class303.field3622, class350.field4366, class267.field3162, class353.field4383, class789.field10869, class450.field6371, class375.field4709, class473.field6599, class300.field3596.field808 + 1, var22, class300.field3596.field823 >> 9, class300.field3596.field813 >> 9, class118.field1503.field10660.method479(0) == 0, true, class502.field7084 ? class621.field8528 : -1, 0, false);
            }
            class580.method3339((byte) -58);
            if (class289.field3493 == 10) {
                class384.method2257(var9, (byte) -75, 256, var7, 256, var6, var8);
                class392.method2297(256, var6, var9, 61, 256, var8, var7);
                class298.method1743(var8, false, var7, var6, 256, 256, var9);
                class672.method3780(8, var7, var6, var9, var8);
            }
            class629.method3561();
            class111.field1405 = var18;
            class599.field8107 = var14;
            class793.field10893 = var17;
            class303.field3622 = var15;
            class350.field4366 = var16;
            if (class330.field4075 && class182.field2224.method4269(1104) == 0) {
                class330.field4075 = false;
            }
            if (class330.field4075) {
                class363.field4526.method600(var7, var6, 785580130, -16777216, var9, var8);
                class671.method3764(-69, class637.field8687.method3584(class770.field10592, true), class466.field6523, class363.field4526, false, class708.field9946);
            }
            class435.method2574(false, true);
        } else {
            class363.field4526.method600(arg0, arg1, 785580130, -16777216, arg2, arg3);
        }
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(BLhc;Lhc;)V")
    public static final void method1117(byte arg0, class152 arg1, class152 arg2) {
        if (arg2.field1893 != null) {
            arg2.method1088(4);
        }
        field1973++;
        arg2.field1893 = arg1.field1893;
        arg2.field1903 = arg1;
        arg2.field1893.field1903 = arg2;
        arg2.field1903.field1893 = arg2;
        int var3 = -112 % ((50 - arg0) / 51);
    }

    @OriginalMember(owner = "client!wh", name = "a", descriptor = "(Z)V")
    public static final void method1118(boolean arg0) {
        field1970++;
        if (arg0) {
            method1118(false);
        }
        if (class303.field3619 == 10) {
            class303.field3619 = 11;
        }
    }
}
