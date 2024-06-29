import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tc")
public class class138 {

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!tc", name = "b", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!tc", name = "c", descriptor = "I")
    public int field2044;

    @OriginalMember(owner = "client!tc", name = "d", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!tc", name = "e", descriptor = "I")
    public int field2046;

    @OriginalMember(owner = "client!tc", name = "f", descriptor = "I")
    public static int field2047;

    @OriginalMember(owner = "client!tc", name = "g", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!tc", name = "h", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!tc", name = "i", descriptor = "I")
    public int field2050;

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(B)V", line = 6)
    public static final void method896(byte arg0) {
        field2048++;
        if (class236.field3896 == 0 || class236.field3896 == 5) {
            return;
        }
        try {
            if (++class146.field2119 > 2000) {
                if (class47.field725 != null) {
                    class47.field725.method1184(false);
                    class47.field725 = null;
                }
                if (class106.field1577 >= 1) {
                    class85.field1291 = -5;
                    class236.field3896 = 0;
                    return;
                }
                if (class219.field3543 == class14.field266) {
                    class219.field3543 = class145.field2103;
                } else {
                    class219.field3543 = class14.field266;
                }
                class106.field1577++;
                class236.field3896 = 1;
                class146.field2119 = 0;
            }
            if (class236.field3896 == 1) {
                class50.field795 = class267.field4597.method978(class176.field2687, true, class219.field3543);
                class236.field3896 = 2;
            }
            if (class236.field3896 == 2) {
                if (class50.field795.field497 == 2) {
                    throw new IOException();
                }
                if (class50.field795.field497 != 1) {
                    return;
                }
                class47.field725 = new class181((Socket) class50.field795.field496, class267.field4597);
                class50.field795 = null;
                long var1 = class47.field729 = class250.field4144.method69(-49);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class147.field2127.field3610 = 0;
                class147.field2127.method1542(-60, 14);
                class147.field2127.method1542(-78, var3);
                class47.field725.method1185(-22036, 2, class147.field2127.field3617, 0);
                if (class1.field11 != null) {
                    class1.field11.method1124(0);
                }
                if (class49.field766 != null) {
                    class49.field766.method1124(0);
                }
                int var4 = class47.field725.method1179(0);
                if (class1.field11 != null) {
                    class1.field11.method1124(0);
                }
                if (class49.field766 != null) {
                    class49.field766.method1124(0);
                }
                if (var4 != 0) {
                    class85.field1291 = var4;
                    class236.field3896 = 0;
                    class47.field725.method1184(false);
                    class47.field725 = null;
                    return;
                }
                class236.field3896 = 3;
            }
            if (class236.field3896 == 3) {
                if (class47.field725.method1180(false) < 8) {
                    return;
                }
                class47.field725.method1183(8, 0, -14925, class200.field3184.field3617);
                int[] var5 = new int[4];
                class200.field3184.field3610 = 0;
                class208.field3309 = class200.field3184.method1510(20396);
                class147.field2127.field3610 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class208.field3309;
                var5[2] = (int) (class208.field3309 >> 32);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                class147.field2127.method1542(-127, 10);
                class147.field2127.method1513(var5[0], false);
                class147.field2127.method1513(var5[1], false);
                class147.field2127.method1513(var5[2], false);
                class147.field2127.method1513(var5[3], false);
                class147.field2127.method1548(false, class250.field4144.method69(-49));
                class147.field2127.method1522(class250.field4148, (byte) 40);
                class147.field2127.method1523(39, class235.field3881, class275.field4688);
                class239.field3971.field3610 = 0;
                if (class5.field58 == 40) {
                    class239.field3971.method1542(-106, 18);
                } else {
                    class239.field3971.method1542(-121, 16);
                }
                class239.field3971.method1539(class147.field2127.field3610 + class190.method1246(false, class24.field413) + 151, false);
                class239.field3971.method1513(509, false);
                class239.field3971.method1542(-125, class65.field1023);
                class239.field3971.method1542(-126, 1);
                class239.field3971.method1542(-126, class262.method1812(-127));
                class239.field3971.method1539(class255.field4362, false);
                class239.field3971.method1539(class156.field2314, false);
                class223.method1573(class239.field3971, (byte) -98);
                class239.field3971.method1522(class24.field413, (byte) 115);
                class239.field3971.method1513(class249.field4119, false);
                class239.field3971.method1513(class219.method1488(17029), false);
                class37.field587 = true;
                class239.field3971.method1513(class172.field2647.field3198, false);
                class239.field3971.method1513(class146.field2112.field3198, false);
                class239.field3971.method1513(class150.field2174.field3198, false);
                class239.field3971.method1513(class237.field3910.field3198, false);
                class239.field3971.method1513(class13.field244.field3198, false);
                class239.field3971.method1513(class86.field1302.field3198, false);
                class239.field3971.method1513(class182.field2775.field3198, false);
                class239.field3971.method1513(class151.field2201.field3198, false);
                class239.field3971.method1513(class206.field3285.field3198, false);
                class239.field3971.method1513(class61.field953.field3198, false);
                class239.field3971.method1513(class267.field4599.field3198, false);
                class239.field3971.method1513(class172.field2652.field3198, false);
                class239.field3971.method1513(class93.field1424.field3198, false);
                class239.field3971.method1513(class286.field4830.field3198, false);
                class239.field3971.method1513(class188.field2944.field3198, false);
                class239.field3971.method1513(class168.field2558.field3198, false);
                class239.field3971.method1513(class52.field826.field3198, false);
                class239.field3971.method1513(class245.field4073.field3198, false);
                class239.field3971.method1513(class174.field2658.field3198, false);
                class239.field3971.method1513(class62.field970.field3198, false);
                class239.field3971.method1513(class31.field491.field3198, false);
                class239.field3971.method1513(class27.field447.field3198, false);
                class239.field3971.method1513(class294.field4959.field3198, false);
                class239.field3971.method1513(class93.field1420.field3198, false);
                class239.field3971.method1513(class61.field956.field3198, false);
                class239.field3971.method1513(class149.field2150.field3198, false);
                class239.field3971.method1513(class248.field4114.field3198, false);
                class239.field3971.method1531(0, -60, class147.field2127.field3610, class147.field2127.field3617);
                class47.field725.method1185(-22036, class239.field3971.field3610, class239.field3971.field3617, 0);
                class147.field2127.method1390(var5, 48);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class200.field3184.method1390(var5, 48);
                class236.field3896 = 4;
            }
            if (class236.field3896 == 4) {
                if (class47.field725.method1180(false) < 1) {
                    return;
                }
                int var7 = class47.field725.method1179(0);
                if (var7 == 21) {
                    class236.field3896 = 7;
                } else if (var7 == 1) {
                    class236.field3896 = 5;
                    class85.field1291 = var7;
                    return;
                } else if (var7 == 2) {
                    class236.field3896 = 8;
                } else if (var7 == 15) {
                    class236.field3896 = 0;
                    class85.field1291 = var7;
                    return;
                } else if (var7 == 23 && class106.field1577 < 1) {
                    class236.field3896 = 1;
                    class106.field1577++;
                    class146.field2119 = 0;
                    class47.field725.method1184(false);
                    class47.field725 = null;
                    return;
                } else {
                    class85.field1291 = var7;
                    class236.field3896 = 0;
                    class47.field725.method1184(false);
                    class47.field725 = null;
                    return;
                }
            }
            int var8 = 20 / ((51 - arg0) / 49);
            if (class236.field3896 == 6) {
                class147.field2127.field3610 = 0;
                class147.field2127.method1389((byte) -25, 17);
                class47.field725.method1185(-22036, class147.field2127.field3610, class147.field2127.field3617, 0);
                class236.field3896 = 4;
                return;
            }
            if (class236.field3896 == 7) {
                if (class47.field725.method1180(false) < 1) {
                    return;
                }
                class141.field2075 = class47.field725.method1179(0) * 60 + 180;
                class236.field3896 = 0;
                class85.field1291 = 21;
                class47.field725.method1184(false);
                class47.field725 = null;
                return;
            }
            if (class236.field3896 == 8) {
                if (class47.field725.method1180(false) < 11) {
                    return;
                }
                class47.field725.method1183(11, 0, -14925, class200.field3184.field3617);
                class200.field3184.field3610 = 0;
                class1.field3 = class200.field3184.method1509(true);
                class137.field2038 = class200.field3184.method1509(true);
                class57.field902 = class200.field3184.method1509(true);
                if (class57.field902 == 1) {
                    try {
                        class226.field3715.method31(class267.field4597.field2262, 0);
                    } catch (Throwable var13) {
                    }
                } else {
                    try {
                        class172.field2651.method31(class267.field4597.field2262, 0);
                    } catch (Throwable var12) {
                    }
                }
                class123.field1865 = class200.field3184.method1509(true);
                class168.field2571 = class200.field3184.method1509(true) == 1;
                class161.field2460 = class200.field3184.method1524((byte) 96);
                class84.field1287 = class200.field3184.method1509(true);
                class167.field2549 = class200.field3184.method1394(255);
                class171.field2625 = class200.field3184.method1524((byte) 84);
                class236.field3896 = 9;
            }
            if (class236.field3896 == 9) {
                if (class47.field725.method1180(false) >= class171.field2625) {
                    class200.field3184.field3610 = 0;
                    class47.field725.method1183(class171.field2625, 0, -14925, class200.field3184.field3617);
                    class236.field3896 = 0;
                    class85.field1291 = 2;
                    class101.method643(false);
                    class280.field4741 = -1;
                    class33.method220(116, false);
                    class167.field2549 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var14) {
            if (class47.field725 != null) {
                class47.field725.method1184(false);
                class47.field725 = null;
            }
            if (class106.field1577 < 1) {
                class106.field1577++;
                class236.field3896 = 1;
                if (class219.field3543 == class14.field266) {
                    class219.field3543 = class145.field2103;
                } else {
                    class219.field3543 = class14.field266;
                }
                class146.field2119 = 0;
            } else {
                class85.field1291 = -4;
                class236.field3896 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(BLci;)V", line = 351)
    public static final void method897(byte arg0, class177 arg1) {
        field2045++;
        if (arg0 <= 13) {
            return;
        }
        for (class150 var2 = (class150) class239.field3953.method1475(14); var2 != null; var2 = (class150) class239.field3953.method1486(38)) {
            if (var2.field2154 == arg1) {
                if (var2.field2163 != null) {
                    class235.field3889.method277(var2.field2163);
                    var2.field2163 = null;
                }
                var2.method1997(-27381);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(III)V", line = 392)
    public static final void method898(int arg0, int arg1, int arg2) {
        if (class226.field3716 != arg2) {
            class251.field4159 = new int[arg2];
            for (int var3 = 0; var3 < arg2; var3++) {
                class251.field4159[var3] = (var3 << 12) / arg2;
            }
            class226.field3716 = arg2;
            class234.field3871 = arg2 == 64 ? 2048 : 4096;
            class256.field4370 = arg2 - 1;
        }
        field2047++;
        if (class119.field1807 != arg1) {
            if (class226.field3716 == arg1) {
                class116.field1726 = class251.field4159;
            } else {
                class116.field1726 = new int[arg1];
                for (int var4 = 0; var4 < arg1; var4++) {
                    class116.field1726[var4] = (var4 << 12) / arg1;
                }
            }
            class119.field1807 = arg1;
            class68.field1082 = arg1 - 1;
        }
        if (arg0 != 16828) {
            field2049 = 44;
        }
    }

    @OriginalMember(owner = "client!tc", name = "a", descriptor = "(IIIIIIIIII)V", line = 442)
    public static final void method899(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg0 != 2) {
            return;
        }
        field2043++;
        if (arg1 == arg9 && arg4 == arg8 && arg3 == arg5 && arg2 == arg6) {
            class52.method394(arg5, arg7, arg4, arg1, (byte) 84, arg6);
            return;
        }
        int var10 = arg1;
        int var11 = arg4;
        int var12 = arg1 * 3;
        int var13 = arg4 * 3;
        int var14 = arg9 * 3;
        int var15 = arg8 * 3;
        int var16 = arg3 * 3;
        int var17 = arg2 * 3;
        int var18 = arg5 + var14 - arg1 - var16;
        int var19 = var16 + var12 - var14 - var14;
        int var20 = arg6 + var15 - var17 - arg4;
        int var21 = var14 - var12;
        int var22 = var15 - var13;
        int var23 = var17 + var13 - var15 - var15;
        for (int var24 = 128; var24 <= 4096; var24 += 128) {
            int var25 = var24 * var24 >> 12;
            int var26 = var24 * var25 >> 12;
            int var27 = var20 * var26;
            int var28 = var23 * var25;
            int var29 = var18 * var26;
            int var30 = var19 * var25;
            int var31 = var22 * var24;
            int var32 = var21 * var24;
            int var33 = (var29 + var30 + var32 >> 12) + arg1;
            int var34 = (var28 + var31 + var27 >> 12) + arg4;
            class52.method394(var33, arg7, var11, var10, (byte) 84, var34);
            var11 = var34;
            var10 = var33;
        }
    }
}
