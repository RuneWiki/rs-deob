import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rf")
public class class78 {

    @OriginalMember(owner = "client!rf", name = "e", descriptor = "Lcga;")
    public static class449 field1010 = new class449(72, 16);

    @OriginalMember(owner = "client!rf", name = "l", descriptor = "Ldr;")
    public static class675 field1017 = new class675(46, 6);

    @OriginalMember(owner = "client!rf", name = "m", descriptor = "F")
    public static float field1018 = 1.0F;

    @OriginalMember(owner = "client!rf", name = "n", descriptor = "I")
    public static int field1019 = 0;

    @OriginalMember(owner = "client!rf", name = "o", descriptor = "Z")
    public static boolean field1020 = false;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!rf", name = "b", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!rf", name = "c", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!rf", name = "d", descriptor = "I")
    public int field1009;

    @OriginalMember(owner = "client!rf", name = "f", descriptor = "I")
    public int field1011;

    @OriginalMember(owner = "client!rf", name = "g", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!rf", name = "h", descriptor = "I")
    public int field1013;

    @OriginalMember(owner = "client!rf", name = "i", descriptor = "I")
    public int field1014;

    @OriginalMember(owner = "client!rf", name = "j", descriptor = "I")
    public int field1015;

    @OriginalMember(owner = "client!rf", name = "k", descriptor = "I")
    public int field1016;

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqj;BLjava/awt/Frame;)V", line = 11)
    public static final void method606(class476 arg0, byte arg1, Frame arg2) {
        while (true) {
            class218 var3 = arg0.method2603(0, arg2);
            while (var3.field2546 == 0) {
                class700.method3867(29279, 10L);
            }
            if (var3.field2546 == 1) {
                field1006++;
                arg2.setVisible(false);
                arg2.dispose();
                if (arg1 > -100) {
                    method608((byte) 66);
                    return;
                }
                return;
            }
            class700.method3867(29279, 100L);
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lqf;II)Z", line = 39)
    public static final boolean method607(class638 arg0, int arg1, int arg2) {
        field1008++;
        int var3 = arg0.method3578(arg1 ^ 0xF7, 2);
        if (var3 == 0) {
            if (arg0.method3578(8, 1) != 0) {
                method607(arg0, 255, arg2);
            }
            int var4 = arg0.method3578(8, 6);
            int var5 = arg0.method3578(arg1 - 247, 6);
            boolean var6 = arg0.method3578(arg1 ^ 0xF7, 1) == 1;
            if (var6) {
                class311.field3919[class262.field3314++] = arg2;
            }
            if (class132.field1601[arg2] != null) {
                throw new RuntimeException("hr:lr");
            }
            class240 var7 = class232.field3014[arg2];
            class365 var8 = class132.field1601[arg2] = new class365();
            var8.field495 = arg2;
            if (class171.field2000[arg2] != null) {
                var8.method2122(-1, class171.field2000[arg2]);
            }
            var8.method221(true, var7.field3107, 2);
            var8.field491 = var7.field3113;
            int var9 = var7.field3106;
            int var10 = var9 >> 28;
            int var11 = (var9 & 0x3FD6A1) >> 14;
            int var12 = var9 & 0xFF;
            var8.field4697 = var7.field3110;
            var8.field505[0] = class183.field2154[arg2];
            var8.field8010 = (byte) var10;
            var8.method2120(arg1 - 283, (var11 << 6) - -var4 - class227.field2938, (var12 << 6) + var5 - class522.field6612);
            var8.field4718 = false;
            class232.field3014[arg2] = null;
            return true;
        } else if (var3 == 1) {
            int var13 = arg0.method3578(8, 2);
            int var14 = class232.field3014[arg2].field3106;
            class232.field3014[arg2].field3106 = (((var14 >> 28) + var13 & 0x3) << 28) + (var14 & 0xFFFFFFF);
            return false;
        } else if (var3 == 2) {
            int var15 = arg0.method3578(8, 5);
            int var16 = var15 >> 3;
            int var17 = var15 & 0x7;
            int var18 = class232.field3014[arg2].field3106;
            int var19 = (var18 >> 28) + var16 & 0x3;
            int var20 = (var18 & 0x3FFA96) >> 14;
            int var21 = var18 & 0xFF;
            if (var17 == 0) {
                var20--;
                var21--;
            }
            if (var17 == 1) {
                var21--;
            }
            if (var17 == 2) {
                var21--;
                var20++;
            }
            if (var17 == 3) {
                var20--;
            }
            if (var17 == 4) {
                var20++;
            }
            if (var17 == 5) {
                var20--;
                var21++;
            }
            if (var17 == 6) {
                var21++;
            }
            if (var17 == 7) {
                var21++;
                var20++;
            }
            class232.field3014[arg2].field3106 = (var20 << 14) + (var19 << 28) + var21;
            return false;
        } else {
            int var22 = arg0.method3578(8, 18);
            int var23 = var22 >> 16;
            int var24 = (var22 & 0xFF65) >> 8;
            int var25 = var22 & arg1;
            int var26 = class232.field3014[arg2].field3106;
            int var27 = (var26 >> 28) + var23 & 0x3;
            int var28 = (var26 >> 14) + var24 & 0xFF;
            int var29 = var25 + var26 & 0xFF;
            class232.field3014[arg2].field3106 = (var27 << 28) + (var28 << 14) + var29;
            return false;
        }
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(B)V", line = 194)
    public static void method608(byte arg0) {
        field1017 = null;
        if (arg0 < 83) {
            method610(null, 0);
        }
        field1010 = null;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(II)V", line = 206)
    public static final void method609(int arg0, int arg1) {
        field1007++;
        if (class470.field5804 == arg1) {
            return;
        }
        if (arg1 == 13) {
            if (class109.field1356 == null) {
                class704.method3885(class33.field515, class469.field5798, (byte) -71, class139.field1674);
            } else {
                class242.method1450(class139.field1674, 24643);
            }
        }
        if (arg0 != 10503) {
            field1018 = -0.07806617F;
        }
        if (arg1 != 13 && class215.field2513 != null) {
            class215.field2513.method2511((byte) 85);
            class215.field2513 = null;
        }
        if (arg1 == 3) {
            class164.method1008(class637.field8625 != class305.field3866, -29249);
        }
        if (arg1 == 7) {
            class95.method707(class97.field1251 != class305.field3866, (byte) 112);
        }
        if (arg1 == 5) {
            if (class109.field1356 == null) {
                class366.method2131(true, class33.field515, class469.field5798);
            } else {
                class540.method2902(false);
            }
        } else if (arg1 == 6) {
            if (class109.field1356 == null) {
                class704.method3885(class33.field515, class469.field5798, (byte) -82, class139.field1674);
            } else {
                class242.method1450(class139.field1674, arg0 ^ 0x4944);
            }
        } else if (arg1 == 9) {
            if (class109.field1356 == null) {
                class704.method3885(class33.field515, class469.field5798, (byte) -40, class139.field1674);
            } else {
                class242.method1450(class139.field1674, arg0 + 14140);
            }
        } else if (arg1 == 12) {
            if (class109.field1356 == null) {
                class366.method2131(true, class33.field515, class469.field5798);
            } else {
                class540.method2902(false);
            }
        }
        if (class291.method1749(class470.field5804, (byte) 21)) {
            class634.field8594.field3500 = 2;
            class72.field939.field3500 = 2;
            class487.field6090.field3500 = 2;
            class19.field203.field3500 = 2;
            class336.field4147.field3500 = 2;
            class563.field7035.field3500 = 2;
            class405.field5224.field3500 = 2;
        }
        if (class291.method1749(arg1, (byte) 98)) {
            class343.field4370 = 0;
            class40.field577 = 0;
            class313.field3931 = 1;
            class596.field7993 = 1;
            class592.field7948 = 0;
            class569.method3016(true, (byte) 65);
            class634.field8594.field3500 = 1;
            class72.field939.field3500 = 1;
            class487.field6090.field3500 = 1;
            class19.field203.field3500 = 1;
            class336.field4147.field3500 = 1;
            class563.field7035.field3500 = 1;
            class405.field5224.field3500 = 1;
        }
        if (arg1 == 11 || arg1 == 3) {
            class618.method3445(-5942);
        }
        boolean var2 = arg1 == 2 || class35.method233((byte) -77, arg1) || class411.method2307(arg1, arg0 ^ 0x290F);
        boolean var3 = class470.field5804 == 2 || class35.method233((byte) -77, class470.field5804) || class411.method2307(class470.field5804, 8);
        if (var3 != var2) {
            if (var2) {
                class640.field8675 = class583.field7837;
                if (class611.field8310.field8702 == 0) {
                    class201.method1172(2, (byte) 115);
                } else {
                    class327.method1879(class611.field8310.field8702, class583.field7837, 0, -5322, false, 2, class353.field4567);
                }
                class167.field1965.method696(-25888, false);
            } else {
                class201.method1172(2, (byte) 70);
                class167.field1965.method696(-25888, true);
            }
        }
        if (class291.method1749(arg1, (byte) 104) || arg1 == 13) {
            class309.field3898.method325();
        }
        class470.field5804 = arg1;
    }

    @OriginalMember(owner = "client!rf", name = "a", descriptor = "(Lpp;I)I", line = 357)
    public static final int method610(class365 arg0, int arg1) {
        if (arg1 != -959874180) {
            method607(null, -45, -3);
        }
        field1012++;
        int var2 = arg0.field4691;
        class403 var3 = arg0.method209(arg1 ^ 0xC6C97B7E);
        if (arg0.field488) {
            var2 = arg0.field4679;
        } else if (arg0.field465 == var3.field5205 || arg0.field465 == var3.field5202 || arg0.field465 == var3.field5189 || arg0.field465 == var3.field5168) {
            var2 = arg0.field4682;
        } else if (arg0.field465 == var3.field5186 || arg0.field465 == var3.field5204 || arg0.field465 == var3.field5165 || arg0.field465 == var3.field5209) {
            var2 = arg0.field4704;
        }
        return var2;
    }
}
