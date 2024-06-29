import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kj")
public class class203 {

    @OriginalMember(owner = "client!kj", name = "c", descriptor = "I")
    public int field3137 = 0;

    @OriginalMember(owner = "client!kj", name = "f", descriptor = "I")
    public int field3140 = 2048;

    @OriginalMember(owner = "client!kj", name = "k", descriptor = "I")
    public int field3145 = 2048;

    @OriginalMember(owner = "client!kj", name = "i", descriptor = "I")
    public int field3143 = 0;

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "I")
    public static int field3136 = 0;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "I")
    public static int field3135;

    @OriginalMember(owner = "client!kj", name = "e", descriptor = "I")
    public static int field3139;

    @OriginalMember(owner = "client!kj", name = "h", descriptor = "I")
    public static int field3142;

    @OriginalMember(owner = "client!kj", name = "j", descriptor = "I")
    public static int field3144;

    @OriginalMember(owner = "client!kj", name = "g", descriptor = "[I")
    public static int[] field3141;

    @OriginalMember(owner = "client!kj", name = "d", descriptor = "[Lo;")
    public static class363[] field3138;

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(B)V", line = 8)
    public static void method1426(byte arg0) {
        field3141 = null;
        if (arg0 == -12) {
            field3138 = null;
        }
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILfh;)V", line = 19)
    public final void method1427(int arg0, class194 arg1) {
        field3144++;
        int var3 = 65 % ((-arg0 - 8) / 44);
        while (true) {
            int var4 = arg1.method1337((byte) 19);
            if (var4 == 0) {
                return;
            }
            this.method1429(241082660, arg1, var4);
        }
    }

    @OriginalMember(owner = "client!kj", name = "b", descriptor = "(B)V", line = 41)
    public static final void method1428(byte arg0) {
        field3142++;
        class80.method714(-1570, false);
        class200.field3101 = 0;
        boolean var1 = true;
        for (int var2 = 0; var2 < class347.field5175.length; var2++) {
            if (class254.field4107[var2] != -1 && class347.field5175[var2] == null) {
                class347.field5175[var2] = class130.field1931.method731(0, 0, class254.field4107[var2]);
                if (class347.field5175[var2] == null) {
                    class200.field3101++;
                    var1 = false;
                }
            }
            if (class406.field6003[var2] != -1 && class83.field1372[var2] == null) {
                class83.field1372[var2] = class130.field1931.method752(class406.field6003[var2], class258.field4150[var2], 92, 0);
                if (class83.field1372[var2] == null) {
                    class200.field3101++;
                    var1 = false;
                }
            }
            if (class247.field3692[var2] != -1 && class489.field7139[var2] == null) {
                class489.field7139[var2] = class130.field1931.method731(0, 0, class247.field3692[var2]);
                if (class489.field7139[var2] == null) {
                    var1 = false;
                    class200.field3101++;
                }
            }
            if (class455.field6766[var2] != -1 && class285.field4436[var2] == null) {
                class285.field4436[var2] = class130.field1931.method731(0, 0, class455.field6766[var2]);
                if (class285.field4436[var2] == null) {
                    var1 = false;
                    class200.field3101++;
                }
            }
            if (class348.field5193 != null && class83.field1371[var2] == null && class348.field5193[var2] != -1) {
                class83.field1371[var2] = class130.field1931.method752(class348.field5193[var2], class258.field4150[var2], -121, 0);
                if (class83.field1371[var2] == null) {
                    class200.field3101++;
                    var1 = false;
                }
            }
        }
        if (class293.field4530 == null) {
            if (class449.field6685 == null || !class531.field7764.method732(-9794, class449.field6685.field7870 + "_staticelements")) {
                class293.field4530 = new class6(0);
            } else if (class531.field7764.method750(0, class449.field6685.field7870 + "_staticelements")) {
                class293.field4530 = class154.method1120(class324.field4918, class449.field6685.field7870 + "_staticelements", 2, class531.field7764);
            } else {
                var1 = false;
                class200.field3101++;
            }
        }
        if (!var1) {
            class416.field6116 = 1;
            return;
        }
        class47.field739 = 0;
        boolean var3 = true;
        for (int var4 = 0; var4 < class347.field5175.length; var4++) {
            byte[] var19 = class83.field1372[var4];
            if (var19 != null) {
                int var20 = (class277.field4348[var4] >> 8) * 64 - class422.field6201;
                int var21 = (class277.field4348[var4] & 0xFF) * 64 - class23.field273;
                if (class91.field1475 != 0) {
                    var20 = 10;
                    var21 = 10;
                }
                var3 &= class14.method81(var21, var20, class250.field4077, class338.field5076, true, var19);
            }
            byte[] var22 = class285.field4436[var4];
            if (var22 != null) {
                int var23 = (class277.field4348[var4] >> 8) * 64 - class422.field6201;
                int var24 = (class277.field4348[var4] & 0xFF) * 64 - class23.field273;
                if (class91.field1475 != 0) {
                    var24 = 10;
                    var23 = 10;
                }
                var3 &= class14.method81(var24, var23, class250.field4077, class338.field5076, true, var22);
            }
        }
        if (!var3) {
            class416.field6116 = 2;
            return;
        }
        if (class416.field6116 != 0) {
            class51.method334(class54.field833, class185.field2838.method1265(class345.field5141, -57) + "<br>(100%)", 6, true);
        }
        class425.method2644(27576);
        class64.method433(-76);
        if (arg0 <= 88) {
            field3135 = 91;
        }
        boolean var5 = false;
        if (class376.field5542.method553() && class40.field667.field4205) {
            for (int var6 = 0; var6 < class347.field5175.length; var6++) {
                if (class285.field4436[var6] != null || class489.field7139[var6] != null) {
                    var5 = true;
                    break;
                }
            }
        }
        int var7;
        if (class40.field667.field4218) {
            var7 = class265.field4233[class164.field2484];
        } else {
            var7 = class276.field4336[class164.field2484];
        }
        if (class376.field5542.method521()) {
            var7++;
        }
        class38.method254(7, 4, class338.field5076, class250.field4077, var7, var5, class376.field5542.method572() > 0);
        for (int var8 = 0; var8 < 4; var8++) {
            class463.field6857[var8].method2568((byte) -123);
        }
        class417.method2608(0);
        class297.method1977(false, false);
        class78.method702(17354);
        class114.field1751 = null;
        class425.method2644(27576);
        System.gc();
        class80.method714(-1570, true);
        class247.method1664((byte) 50);
        class456.field6779 = class40.field667.method1836(127, class108.field1631);
        class164.field2480 = class360.field5314 >= 96;
        class261.field4170 = class40.field667.field4205;
        class18.field205 = class40.field667.method1835(class108.field1631, true);
        class64.field1015 = !class40.field667.field4216;
        class498.field7257 = class40.field667.method416(109, class108.field1631) ? -1 : class213.field3236;
        class97.field1523 = class40.field667.field4217;
        class330.field4978 = class108.field1631 == 1 || class40.field667.field4198;
        class185.field2846 = new class23(4, class338.field5076, class250.field4077, false);
        if (class91.field1475 == 0) {
            class227.method1550(class347.field5175, false, class185.field2846);
        } else {
            class97.method810(class347.field5175, class185.field2846, -14617);
        }
        class518.method3059(class250.field4077 >> 4, class338.field5076 >> 4, 5);
        class346.method2224(false);
        if (var5) {
            class2.method6(true);
            class430.field6374 = new class23(1, class338.field5076, class250.field4077, true);
            if (class91.field1475 == 0) {
                class227.method1550(class489.field7139, false, class430.field6374);
                class80.method714(-1570, true);
            } else {
                class97.method810(class489.field7139, class430.field6374, -14617);
                class80.method714(-1570, true);
            }
            class430.field6374.method1590((byte) -74, 0, class185.field2846.field3527[0]);
            class430.field6374.method1599((byte) -118, class376.field5542, null, null);
            class2.method6(false);
        }
        class185.field2846.method1599((byte) 56, class376.field5542, class463.field6857, var5 ? class430.field6374.field3527 : null);
        if (class91.field1475 == 0) {
            class80.method714(-1570, true);
            class486.method2938(class83.field1372, class185.field2846, -14804);
            if (class83.field1371 != null) {
                class129.method942(103);
            }
        } else {
            class80.method714(-1570, true);
            class166.method1181(class185.field2846, false, class83.field1372);
        }
        class64.method433(-104);
        class80.method714(-1570, true);
        class185.field2846.method1593(null, (byte) 110, var5 ? class288.field4475[0] : null, class376.field5542);
        class185.field2846.method144(class376.field5542, (byte) 10);
        class80.method714(-1570, true);
        if (var5) {
            class2.method6(true);
            class80.method714(-1570, true);
            if (class91.field1475 == 0) {
                class486.method2938(class285.field4436, class430.field6374, -14804);
            } else {
                class166.method1181(class430.field6374, false, class285.field4436);
            }
            class64.method433(-88);
            class80.method714(-1570, true);
            class430.field6374.method1593(class274.field4306[0], (byte) 117, null, class376.field5542);
            class430.field6374.method144(class376.field5542, (byte) 10);
            class80.method714(-1570, true);
            class2.method6(false);
        }
        class98.method811(69);
        int var9 = class185.field2846.field263;
        if (var9 > class30.field370) {
            var9 = class30.field370;
        }
        if (var9 < class30.field370 - 1) {
            var9 = class30.field370 - 1;
        }
        if (class40.field667.method416(117, class108.field1631)) {
            class169.method1205(0);
        } else {
            class169.method1205(var9);
        }
        for (int var10 = 0; var10 < 4; var10++) {
            for (int var17 = 0; var17 < class338.field5076; var17++) {
                for (int var18 = 0; var18 < class250.field4077; var18++) {
                    class25.method153(var18, var10, 31755, var17);
                }
            }
        }
        class486.method2936(8137);
        class425.method2644(27576);
        class253.method1797(-1);
        class64.method433(-106);
        class164.field2482 = false;
        class32.method195(-1);
        if (class237.field3564 != null && class541.field7922 != null && class460.field6813 == 10) {
            class469.field6893++;
            class110.method857(4095, class258.field4136);
            class312.field4752.method1348((byte) -65, 1057001181);
        }
        if (class91.field1475 == 0) {
            int var11 = (class50.field769 - (class338.field5076 >> 4)) / 8;
            int var12 = ((class338.field5076 >> 4) + class50.field769) / 8;
            int var13 = (class339.field5086 - (class250.field4077 >> 4)) / 8;
            int var14 = ((class250.field4077 >> 4) + class339.field5086) / 8;
            for (int var15 = var11 - 1; var15 <= (var12 + 1); var15++) {
                for (int var16 = var13 - 1; var16 <= (var14 + 1); var16++) {
                    if (var15 < var11 || var12 < var15 || var16 < var13 || var16 > var14) {
                        class130.field1931.method749("m" + var15 + "_" + var16, 0);
                        class130.field1931.method749("l" + var15 + "_" + var16, 0);
                    }
                }
            }
        }
        if (class460.field6813 == 3) {
            class376.method2400(2, (byte) 107);
        } else if (class460.field6813 == 7) {
            class376.method2400(6, (byte) 107);
        } else {
            class376.method2400(9, (byte) 107);
            if (class541.field7922 != null) {
                class110.method857(4095, class504.field7321);
            }
        }
        class449.method2760(true);
        class425.method2644(27576);
        class43.method282(0);
    }

    @OriginalMember(owner = "client!kj", name = "a", descriptor = "(ILfh;I)V", line = 500)
    private final void method1429(int arg0, class194 arg1, int arg2) {
        field3139++;
        if (arg2 == 1) {
            this.field3143 = arg1.method1337((byte) -126);
        } else if (arg2 == 2) {
            this.field3140 = arg1.method1396(-84);
        } else if (arg2 == 3) {
            this.field3145 = arg1.method1396(101);
        } else if (arg2 == 4) {
            this.field3137 = arg1.method1384(true);
        }
        if (arg0 != 241082660) {
            this.field3145 = -98;
        }
    }
}
