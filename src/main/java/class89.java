import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oia")
public abstract class class89 {

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "I")
    public static int field1265;

    @OriginalMember(owner = "client!oia", name = "b", descriptor = "I")
    public static int field1266;

    @OriginalMember(owner = "client!oia", name = "c", descriptor = "I")
    public static int field1267;

    @OriginalMember(owner = "client!oia", name = "d", descriptor = "[I")
    public static int[] field1268;

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(I)V")
    public static void method718(int arg0) {
        if (arg0 <= 43) {
            method720(-31, null);
        }
        field1268 = null;
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILha;Ld;)V")
    public static final void method719(int arg0, class60 arg1, class151 arg2) {
        field1267++;
        if (class84.field1177 == null) {
            return;
        }
        if (class735.field10311 < 10) {
            if (!class84.field1169.method204(class84.field1177.field1654, 30)) {
                class735.field10311 = class564.field8027.method225(-68, class84.field1177.field1654) / 10;
                return;
            }
            class685.method3906(114);
            class735.field10311 = 10;
        }
        if (class735.field10311 == 10) {
            class84.field1190 = class84.field1177.field1644 >> 6 << 6;
            class84.field1201 = class84.field1177.field1649 >> 6 << 6;
            class84.field1198 = (class84.field1177.field1640 >> 6 << 6) + 64 - class84.field1190;
            class84.field1204 = (class84.field1177.field1645 >> 6 << 6) + 64 - class84.field1201;
            int[] var3 = new int[3];
            int var4 = -1;
            int var5 = -1;
            if (class84.field1177.method873(class130.field1749.field8429, -80, (class130.field1749.field8428 >> 9) + class582.field8288, (class130.field1749.field8423 >> 9) + class361.field5224, var3)) {
                var4 = var3[1] - class84.field1201;
                var5 = var3[2] - class84.field1190;
            }
            if (!class8.field102 && var4 >= 0 && class84.field1204 > var4 && var5 >= 0 && var5 < class84.field1198) {
                int var6 = var4 + (int) (Math.random() * 10.0D) - 5;
                int var7 = var5 + ((int) (Math.random() * 10.0D) - 5);
                class633.field8862 = var6;
                client.field4272 = var7;
            } else if (class440.field6517 == -1 || class471.field6866 == -1) {
                class84.field1177.method874(class84.field1177.field1652 & 0x3FFF, var3, (byte) -102, class84.field1177.field1652 >> 14 & 0x3FFF);
                client.field4272 = var3[2] - class84.field1190;
                class633.field8862 = var3[1] - class84.field1201;
            } else {
                class84.field1177.method874(class471.field6866, var3, (byte) -115, class440.field6517);
                if (var3 != null) {
                    client.field4272 = var3[2] - class84.field1190;
                    class633.field8862 = var3[1] - class84.field1201;
                }
                class471.field6866 = -1;
                class440.field6517 = -1;
                class8.field102 = false;
            }
            if (class84.field1177.field1646 == 37) {
                class84.field1178 = 3.0F;
                class84.field1179 = 3.0F;
            } else if (class84.field1177.field1646 == 50) {
                class84.field1178 = 4.0F;
                class84.field1179 = 4.0F;
            } else if (class84.field1177.field1646 == 75) {
                class84.field1178 = 6.0F;
                class84.field1179 = 6.0F;
            } else if (class84.field1177.field1646 == 100) {
                class84.field1178 = 8.0F;
                class84.field1179 = 8.0F;
            } else if (class84.field1177.field1646 == 200) {
                class84.field1178 = 16.0F;
                class84.field1179 = 16.0F;
            } else {
                class84.field1178 = 8.0F;
                class84.field1179 = 8.0F;
            }
            class84.field1186 = (int) class84.field1178 >> 1;
            class84.field1185 = class183.method1297((byte) 29, class84.field1186);
            class547.method3199(true);
            class84.method674();
            class603.field8529 = new class164();
            class84.field1182 += (int) (Math.random() * 5.0D) - 2;
            if (class84.field1182 < -8) {
                class84.field1182 = -8;
            }
            if (class84.field1182 > 8) {
                class84.field1182 = 8;
            }
            class84.field1183 += (int) (Math.random() * 5.0D) - 2;
            if (class84.field1183 < -16) {
                class84.field1183 = -16;
            }
            if (class84.field1183 > 16) {
                class84.field1183 = 16;
            }
            class84.method684(arg2, class84.field1182 >> 2 << 10, class84.field1183 >> 1);
            class84.field1175.method863(-257, 1024, 256);
            class84.field1174.method4123(-27393, 256, 256);
            class84.field1172.method397(-8513, 4096);
            class665.field9346.method3010(256, (byte) 90);
            class735.field10311 = 20;
        } else if (class735.field10311 == 20) {
            class459.method2803((byte) -41, true);
            class84.method682(arg1, class84.field1182, class84.field1183);
            class735.field10311 = 60;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -114);
        } else if (class735.field10311 == 60) {
            if (class84.field1169.method221(-125, class84.field1177.field1654 + "_staticelements")) {
                if (!class84.field1169.method204(class84.field1177.field1654 + "_staticelements", 102)) {
                    return;
                }
                class84.field1181 = class405.method2573(class691.field9553, -1, class84.field1169, class84.field1177.field1654 + "_staticelements");
            } else {
                class84.field1181 = new class152(0);
            }
            class84.method668();
            class735.field10311 = 70;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -89);
        } else if (class735.field10311 == 70) {
            class449.field6663 = new class477(arg1, 11, true, class106.field1476);
            class735.field10311 = 73;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -117);
        } else if (class735.field10311 == 73) {
            class284.field4043 = new class477(arg1, 12, true, class106.field1476);
            class735.field10311 = 76;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -91);
        } else if (class735.field10311 == 76) {
            class381.field5751 = new class477(arg1, 14, true, class106.field1476);
            class735.field10311 = 79;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -99);
        } else if (class735.field10311 == 79) {
            class242.field3537 = new class477(arg1, 17, true, class106.field1476);
            class735.field10311 = 82;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -125);
        } else if (class735.field10311 == 82) {
            class462.field6807 = new class477(arg1, 19, true, class106.field1476);
            class735.field10311 = 85;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -97);
        } else if (class735.field10311 == 85) {
            class656.field9196 = new class477(arg1, 22, true, class106.field1476);
            class735.field10311 = 88;
            class459.method2803((byte) -41, true);
            class375.method2430((byte) -122);
        } else {
            if (arg0 > -44) {
                field1268 = null;
            }
            if (class735.field10311 == 88) {
                class228.field3353 = new class477(arg1, 26, true, class106.field1476);
                class735.field10311 = 91;
                class459.method2803((byte) -41, true);
                class375.method2430((byte) -127);
            } else {
                class355.field5168 = new class477(arg1, 30, true, class106.field1476);
                class735.field10311 = 100;
                class459.method2803((byte) -41, true);
                class375.method2430((byte) -99);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method720(int arg0, String arg1) {
        field1266++;
        if (arg1 == null) {
            return false;
        } else if (arg0 == -27006) {
            for (int var2 = 0; var2 < class569.field8065; var2++) {
                if (arg1.equalsIgnoreCase(class458.field6753[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class501.field7120[var2])) {
                    return true;
                }
            }
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(FIF[FIFIIFII)V")
    public abstract void method721(float arg0, int arg1, float arg2, float[] arg3, int arg4, float arg5, int arg6, int arg7, float arg8, int arg9, int arg10);

    @OriginalMember(owner = "client!oia", name = "a", descriptor = "(BLha;)V")
    public static final void method722(byte arg0, class60 arg1) {
        for (class626 var2 = (class626) class493.field7031.method1615((byte) 54); var2 != null; var2 = (class626) class493.field7031.method1625(-55)) {
            if (var2.field8769) {
                var2.method3610(arg1);
            }
        }
        if (arg0 >= -77) {
            method718(29);
        }
        field1265++;
    }
}
