import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pa")
public class class389 {

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "I")
    public static int field5371;

    @OriginalMember(owner = "client!pa", name = "b", descriptor = "I")
    public static int field5372;

    @OriginalMember(owner = "client!pa", name = "c", descriptor = "I")
    public static int field5373;

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(I)V")
    public static final void method2417(int arg0) {
        field5371++;
        boolean var1 = class110.field1640.method2940((byte) -74) == 1;
        int var2 = class110.field1640.method2982(-1);
        int var3 = class110.field1640.method2940((byte) -126);
        int var4 = class110.field1640.method2998(true);
        class472.field6621 = class110.field1640.method2940((byte) -84);
        class489.method2915((byte) -64);
        class766.method4236(arg0 ^ 0xFB, var3);
        class110.field1640.method2212(arg0 ^ 0x455BC23C);
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var20 = 0; var20 < class768.field10571 >> 3; var20++) {
                for (int var21 = 0; var21 < (class350.field4898 >> 3); var21++) {
                    int var22 = class110.field1640.method2216(-127, 1);
                    if (var22 == 1) {
                        class650.field9080[var5][var20][var21] = class110.field1640.method2216(-100, 26);
                    } else {
                        class650.field9080[var5][var20][var21] = -1;
                    }
                }
            }
        }
        class110.field1640.method2217(arg0 ^ 0xFFFFFF06);
        int var6 = (class15.field293 - class110.field1640.field7042) / 16;
        class779.field10692 = new int[var6][4];
        for (int var7 = 0; var7 < var6; var7++) {
            for (int var19 = 0; var19 < 4; var19++) {
                class779.field10692[var7][var19] = class110.field1640.method2976(-125);
            }
        }
        client.field4492 = new byte[var6][];
        class314.field4472 = null;
        class148.field2139 = new int[var6];
        class300.field4333 = new byte[var6][];
        class325.field4552 = new int[var6];
        class8.field79 = new byte[var6][];
        class490.field6955 = new int[var6];
        if (arg0 != 255) {
            method2417(123);
        }
        class551.field7919 = new int[var6];
        client.field4500 = new byte[var6][];
        class459.field6422 = new int[var6];
        class506.field7191 = null;
        int var8 = 0;
        for (int var9 = 0; var9 < 4; var9++) {
            for (int var10 = 0; var10 < (class768.field10571 >> 3); var10++) {
                for (int var11 = 0; var11 < (class350.field4898 >> 3); var11++) {
                    int var12 = class650.field9080[var9][var10][var11];
                    if (var12 != -1) {
                        int var13 = (var12 & 0xFFD8B8) >> 14;
                        int var14 = var12 >> 3 & 0x7FF;
                        int var15 = (var13 / 8 << 8) + (var14 / 8);
                        for (int var16 = 0; var16 < var8; var16++) {
                            if (class551.field7919[var16] == var15) {
                                var15 = -1;
                                break;
                            }
                        }
                        if (var15 != -1) {
                            class551.field7919[var8] = var15;
                            int var17 = var15 >> 8 & 0xFF;
                            int var18 = var15 & 0xFF;
                            class325.field4552[var8] = class168.field2640.method4356(class587.method3425(arg0, 191), "m" + var17 + "_" + var18);
                            class459.field6422[var8] = class168.field2640.method4356(85, "l" + var17 + "_" + var18);
                            class148.field2139[var8] = class168.field2640.method4356(35, "um" + var17 + "_" + var18);
                            class490.field6955[var8] = class168.field2640.method4356(65, "ul" + var17 + "_" + var18);
                            var8++;
                        }
                    }
                }
            }
        }
        class417.method2537(var1, var4, 11, false, var2);
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIII)V")
    public static final void method2418(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field5372++;
        int var8 = -67 % ((arg3 + 48) / 62);
        int var9 = arg4 - 334;
        if (var9 < 0) {
            var9 = 0;
        } else if (var9 > 100) {
            var9 = 100;
        }
        int var10 = (class313.field4458 - class768.field10572) * var9 / 100 + class768.field10572;
        class740.field10205 = class740.field10197 * var10 >> 8;
        int var11 = arg0 * var10 >> 8;
        int var12 = 16384 - arg5 & 0x3FFF;
        int var13 = 16384 - arg2 & 0x3FFF;
        int var14 = 0;
        int var15 = 0;
        int var16 = var11;
        if (var12 != 0) {
            var15 = class376.field5186[var12] * -var11 >> 14;
            var16 = class376.field5188[var12] * var11 >> 14;
        }
        if (var13 != 0) {
            var14 = class376.field5186[var13] * var16 >> 14;
            var16 = class376.field5188[var13] * var16 >> 14;
        }
        class544.field7813 = arg2;
        class614.field8619 = arg7 - var14;
        class546.field7862 = arg6 - var15;
        class589.field8310 = arg5;
        class565.field8018 = 0;
        class472.field6622 = arg1 - var16;
    }

    @OriginalMember(owner = "client!pa", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method2419(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field5373++;
        if (class217.method1490(arg3, -1)) {
            int var10 = 0;
            if (arg7 >= -14) {
                method2419(-28, 49, -105, 92, 126, -86, 72, -92, 70);
            }
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            if (class195.field2997) {
                var10 = class211.field3267;
                var12 = class274.field3962;
                var14 = class254.field3736;
                var13 = class365.field5093;
                var11 = class81.field904;
                class254.field3736 = 1;
            }
            if (class254.field3741[arg3] == null) {
                class471.method2800(arg1, arg2, arg4, arg8, arg0, -1, (byte) -120, class787.field10812[arg3], arg0 < 0, arg6, arg5);
            } else {
                class471.method2800(arg1, arg2, arg4, arg8, arg0, -1, (byte) -120, class254.field3741[arg3], arg0 < 0, arg6, arg5);
            }
            if (class195.field2997) {
                if (arg0 >= 0 && class254.field3736 == 2) {
                    class33.method272(class211.field3267, class81.field904, class365.field5093, false, class274.field3962);
                }
                class254.field3736 = var14;
                class274.field3962 = var12;
                class211.field3267 = var10;
                class365.field5093 = var13;
                class81.field904 = var11;
            }
        } else if (arg0 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class698.field9719[var9] = true;
            }
        } else {
            class698.field9719[arg0] = true;
        }
    }
}
