import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uj")
public class class440 extends class95 {

    @OriginalMember(owner = "client!uj", name = "S", descriptor = "I")
    public static int field6320 = 0;

    @OriginalMember(owner = "client!uj", name = "N", descriptor = "Llg;")
    public static class20 field6315 = null;

    @OriginalMember(owner = "client!uj", name = "Z", descriptor = "I")
    public static int field6327 = 0;

    @OriginalMember(owner = "client!uj", name = "Y", descriptor = "I")
    public static int field6326 = 0;

    @OriginalMember(owner = "client!uj", name = "T", descriptor = "Ltd;")
    public static class107 field6321 = new class107();

    @OriginalMember(owner = "client!uj", name = "O", descriptor = "B")
    public byte field6316;

    @OriginalMember(owner = "client!uj", name = "X", descriptor = "F")
    public static float field6325;

    @OriginalMember(owner = "client!uj", name = "P", descriptor = "I")
    public int field6317;

    @OriginalMember(owner = "client!uj", name = "Q", descriptor = "I")
    public static int field6318;

    @OriginalMember(owner = "client!uj", name = "U", descriptor = "I")
    public static int field6322;

    @OriginalMember(owner = "client!uj", name = "V", descriptor = "I")
    public static int field6323;

    @OriginalMember(owner = "client!uj", name = "W", descriptor = "I")
    public static int field6324;

    @OriginalMember(owner = "client!uj", name = "ab", descriptor = "I")
    public static int field6328;

    @OriginalMember(owner = "client!uj", name = "bb", descriptor = "I")
    public static int field6329;

    @OriginalMember(owner = "client!uj", name = "cb", descriptor = "I")
    public static int field6330;

    @OriginalMember(owner = "client!uj", name = "R", descriptor = "Lap;")
    public class289 field6319;

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IIIIB)V", line = 9)
    public static final void method2727(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        ++field6329;
        int var5 = 0;
        int var6 = arg3;
        int var7 = -arg3;
        int var8 = -1;
        if (arg4 > -125) {
            method2728(-92, (class391) null, (class112) null);
        }
        int var9 = class359.method2251(class69.field1047, arg1 + arg3, -60, class433.field6144);
        int var10 = class359.method2251(class69.field1047, -arg3 + arg1, -72, class433.field6144);
        class396.method2436(-1070, arg2, var10, class186.field2697[arg0], var9);
        while (var6 > var5) {
            var8 += 2;
            var7 += var8;
            if (~var7 < -1) {
                --var6;
                var7 -= var6 << 1;
                int var11 = -var6 + arg0;
                int var12 = arg0 + var6;
                if (~class39.field595 >= ~var12 && ~var11 >= ~class134.field1917) {
                    int var13 = class359.method2251(class69.field1047, arg1 + var5, 109, class433.field6144);
                    int var14 = class359.method2251(class69.field1047, arg1 - var5, 118, class433.field6144);
                    if (~class134.field1917 <= ~var12) {
                        class396.method2436(-1070, arg2, var14, class186.field2697[var12], var13);
                    }
                    if (var11 >= class39.field595) {
                        class396.method2436(-1070, arg2, var14, class186.field2697[var11], var13);
                    }
                }
            }
            ++var5;
            int var15 = arg0 - var5;
            int var16 = arg0 - -var5;
            if (class39.field595 <= var16 && ~class134.field1917 <= ~var15) {
                int var17 = class359.method2251(class69.field1047, arg1 + var6, 54, class433.field6144);
                int var18 = class359.method2251(class69.field1047, -var6 + arg1, 95, class433.field6144);
                if (var16 <= class134.field1917) {
                    class396.method2436(-1070, arg2, var18, class186.field2697[var16], var17);
                }
                if (~class39.field595 >= ~var15) {
                    class396.method2436(-1070, arg2, var18, class186.field2697[var15], var17);
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "e", descriptor = "(I)I", line = 88)
    public final int method646(int arg0) {
        if (arg0 != 0) {
            method2730(-115, -87L);
        }
        ++field6322;
        return this.field6319 == null ? 0 : this.field6319.field3938 * 100 / (this.field6319.field3882.length + -this.field6316);
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(ILpe;Lpg;)V", line = 107)
    public static final void method2728(int arg0, class391 arg1, class112 arg2) {
        ++field6323;
        if (class99.field1409 != null) {
            if (class199.field2831 < 10) {
                if (!class99.field1410.method2632(class99.field1409.field618, (byte) 84)) {
                    class199.field2831 = class23.field420.method2627((byte) -108, class99.field1409.field618) / 10;
                    return;
                }
                class10.method55(8);
                class199.field2831 = 10;
            }
            if (class199.field2831 == 10) {
                class99.field1436 = class99.field1409.field620 >> 6 << 6;
                class99.field1438 = class99.field1409.field610 >> 6 << 6;
                class99.field1434 = (class99.field1409.field622 >> 6 << 6) + 64 + -class99.field1436;
                class99.field1435 = (class99.field1409.field615 >> 6 << 6) + -class99.field1438 + 64;
                int[] var3 = new int[3];
                int var4 = -1;
                int var5 = -1;
                if (class99.field1409.method390(var3, 63, class69.field1046, (class95.field1379.field3167 >> 7) + class296.field3988, (class95.field1379.field3176 >> 7) + class283.field3794)) {
                    var4 = var3[1] - class99.field1436;
                    var5 = var3[2] - class99.field1438;
                }
                if (!class67.field1012 && ~var4 <= -1 && var4 < class99.field1434 && var5 >= 0 && var5 < class99.field1435) {
                    int var6 = var5 + (int) (Math.random() * 10.0D) + -5;
                    int var7 = var4 + -5 + (int) (Math.random() * 10.0D);
                    class447.field6475 = var7;
                    class172.field2519 = var6;
                } else if (class128.field1815 != -1 && class83.field1219 != -1) {
                    class99.field1409.method393(class83.field1219, 255, var3, class128.field1815);
                    class67.field1012 = false;
                    if (var3 != null) {
                        class172.field2519 = var3[2] + -class99.field1438;
                        class447.field6475 = var3[1] - class99.field1436;
                    }
                    class83.field1219 = -1;
                    class128.field1815 = -1;
                } else {
                    class99.field1409.method393(class99.field1409.field621 & 16383, 255, var3, (268424879 & class99.field1409.field621) >> 14);
                    class447.field6475 = var3[1] + -class99.field1436;
                    class172.field2519 = var3[2] + -class99.field1438;
                }
                if (class99.field1409.field627 != 37) {
                    if (~class99.field1409.field627 == -51) {
                        class99.field1419 = 4.0F;
                        class99.field1420 = 4.0F;
                    } else if (class99.field1409.field627 != 75) {
                        if (class99.field1409.field627 != 100) {
                            if (class99.field1409.field627 != 200) {
                                class99.field1419 = 8.0F;
                                class99.field1420 = 8.0F;
                            } else {
                                class99.field1419 = 16.0F;
                                class99.field1420 = 16.0F;
                            }
                        } else {
                            class99.field1419 = 8.0F;
                            class99.field1420 = 8.0F;
                        }
                    } else {
                        class99.field1419 = 6.0F;
                        class99.field1420 = 6.0F;
                    }
                } else {
                    class99.field1419 = 3.0F;
                    class99.field1420 = 3.0F;
                }
                class99.field1418 = (int) class99.field1419 >> 1;
                class99.field1413 = class74.method640((byte) 77, class99.field1418);
                class156.method1196(true);
                class99.method849();
                class71.field1081 = new class166();
                class383.field5373 = new class204();
                class99.field1417 += -2 + (int) (5.0D * Math.random());
                if (class99.field1417 < -8) {
                    class99.field1417 = -8;
                }
                if (~class99.field1417 < -9) {
                    class99.field1417 = 8;
                }
                class99.field1414 += (int) (Math.random() * 5.0D) - 2;
                if (~class99.field1414 > 15) {
                    class99.field1414 = -16;
                }
                if (~class99.field1414 < -17) {
                    class99.field1414 = 16;
                }
                class99.method844(arg2, class99.field1417 >> 2 << 10, class99.field1414 >> 1);
                class97.method818((byte) 124, 1024, 256);
                class305.method1967(256, 3, 256);
                class21.method274(false, 4096);
                class105.method884(0, 256);
                class199.field2831 = 20;
            } else if (class199.field2831 == 20) {
                class161.method1210(true, (byte) -114);
                class99.method830(arg1, class99.field1417, class99.field1414);
                class199.field2831 = 60;
                class161.method1210(true, (byte) -122);
                class224.method1526(arg0 ^ -125);
            } else if (class199.field2831 == 60) {
                if (class99.field1410.method2647((byte) -114, class99.field1409.field618 + "_staticelements")) {
                    if (!class99.field1410.method2632(class99.field1409.field618 + "_staticelements", (byte) 84)) {
                        return;
                    }
                    class99.field1411 = class151.method1162(arg0 ^ 9, class99.field1409.field618 + "_staticelements", class78.field1178, class99.field1410);
                } else {
                    class99.field1411 = new class75(0);
                }
                class99.method829();
                class199.field2831 = 70;
                class161.method1210(true, (byte) -114);
                class224.method1526(-111);
            } else if (class199.field2831 == 70) {
                class411.field5753 = new class216(arg1, 11, true, class418.field5867);
                class199.field2831 = 73;
                class161.method1210(true, (byte) -111);
                class224.method1526(-103);
            } else if (class199.field2831 == 73) {
                class126.field1759 = new class216(arg1, 12, true, class418.field5867);
                class199.field2831 = 76;
                class161.method1210(true, (byte) -128);
                class224.method1526(-127);
            } else if (class199.field2831 == 76) {
                class370.field5087 = new class216(arg1, 14, true, class418.field5867);
                class199.field2831 = 79;
                class161.method1210(true, (byte) -115);
                class224.method1526(-103);
            } else if (class199.field2831 == 79) {
                class424.field5963 = new class216(arg1, 17, true, class418.field5867);
                class199.field2831 = 82;
                class161.method1210(true, (byte) -116);
                class224.method1526(arg0 ^ -117);
            } else if (~class199.field2831 == -83) {
                class263.field3537 = new class216(arg1, 19, true, class418.field5867);
                class199.field2831 = 85;
                class161.method1210(true, (byte) -120);
                class224.method1526(-128);
            } else if (~class199.field2831 == -86) {
                class154.field2340 = new class216(arg1, 22, true, class418.field5867);
                class199.field2831 = 88;
                class161.method1210(true, (byte) -113);
                class224.method1526(-83);
            } else if (class199.field2831 == 88) {
                class52.field855 = new class216(arg1, 26, true, class418.field5867);
                class199.field2831 = 91;
                class161.method1210(true, (byte) -112);
                class224.method1526(-94);
            } else {
                class278.field3743 = new class216(arg1, 30, true, class418.field5867);
                class199.field2831 = 100;
                if (arg0 != 8) {
                    method2729(-106);
                }
                class161.method1210(true, (byte) -108);
                class224.method1526(-91);
                System.gc();
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "b", descriptor = "(Z)[B", line = 343)
    public final byte[] method643(boolean arg0) {
        if (arg0) {
            this.method643(true);
        }
        ++field6324;
        if (!super.field1384 && ~(this.field6319.field3882.length + -this.field6316) >= ~this.field6319.field3938) {
            return this.field6319.field3882;
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!uj", name = "f", descriptor = "(I)V", line = 364)
    public static final void method2729(int arg0) {
        ++field6328;
        if (~class199.field2841 != -1) {
            int var1 = 127 / ((arg0 - -61) / 59);
            try {
                if (~(++class124.field1727) < -2001) {
                    if (class105.field1540 != null) {
                        class105.field1540.method2736(5000);
                        class105.field1540 = null;
                    }
                    if (~class193.field2778 <= -2) {
                        class199.field2841 = 0;
                        class77.field1159 = -5;
                        return;
                    }
                    class124.field1727 = 0;
                    class199.field2841 = 1;
                    ++class193.field2778;
                    if (~class87.field1298 == ~class31.field518) {
                        class31.field518 = class416.field5816;
                    } else {
                        class31.field518 = class87.field1298;
                    }
                }
                if (~class199.field2841 == -2) {
                    class128.field1821 = class30.field502.method1955(class31.field518, class295.field3985, -27);
                    class199.field2841 = 2;
                }
                if (class199.field2841 == 2) {
                    if (~class128.field1821.field3345 == -3) {
                        throw new IOException();
                    }
                    if (~class128.field1821.field3345 != -2) {
                        return;
                    }
                    class105.field1540 = new class441((Socket) class128.field1821.field3341, class30.field502);
                    class128.field1821 = null;
                    class105.field1540.method2737(class355.field4828.field3882, 0, class355.field4828.field3938, -128);
                    if (class76.field1136 != null) {
                        class76.field1136.method1563(123);
                    }
                    if (class365.field5037 != null) {
                        class365.field5037.method1563(124);
                    }
                    int var2 = class105.field1540.method2742(5000);
                    if (class76.field1136 != null) {
                        class76.field1136.method1563(121);
                    }
                    if (class365.field5037 != null) {
                        class365.field5037.method1563(124);
                    }
                    if (var2 != 21) {
                        class77.field1159 = var2;
                        class199.field2841 = 0;
                        class105.field1540.method2736(5000);
                        class105.field1540 = null;
                        return;
                    }
                    class199.field2841 = 3;
                }
                if (class199.field2841 == 3) {
                    if (class105.field1540.method2732(0) < 1) {
                        return;
                    }
                    class190.field2728 = new String[class105.field1540.method2742(5000)];
                    class199.field2841 = 4;
                }
                if (~class199.field2841 == -5) {
                    if (~class105.field1540.method2732(0) <= ~(class190.field2728.length * 8)) {
                        class417.field5851.field3938 = 0;
                        class105.field1540.method2733(0, class417.field5851.field3882, 58, class190.field2728.length * 8);
                        for (int var3 = 0; ~class190.field2728.length < ~var3; ++var3) {
                            class190.field2728[var3] = class262.method1685(true, class417.field5851.method1879((byte) 122));
                        }
                        class199.field2841 = 0;
                        class77.field1159 = 21;
                        class105.field1540.method2736(5000);
                        class105.field1540 = null;
                    }
                }
            } catch (IOException var4) {
                if (class105.field1540 != null) {
                    class105.field1540.method2736(5000);
                    class105.field1540 = null;
                }
                if (class193.field2778 < 1) {
                    class124.field1727 = 0;
                    if (class87.field1298 != class31.field518) {
                        class31.field518 = class87.field1298;
                    } else {
                        class31.field518 = class416.field5816;
                    }
                    class199.field2841 = 1;
                    ++class193.field2778;
                } else {
                    class199.field2841 = 0;
                    class77.field1159 = -4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!uj", name = "a", descriptor = "(IJ)V", line = 517)
    public static final void method2730(int arg0, long arg1) {
        class355.field4828.field3938 = 0;
        ++field6318;
        class355.field4828.method1824(arg0 ^ 77, arg0);
        class355.field4828.method1866(arg0 + -19090, arg1);
        class124.field1727 = 0;
        class193.field2778 = 0;
        class77.field1159 = -3;
        class199.field2841 = 1;
    }

    @OriginalMember(owner = "client!uj", name = "d", descriptor = "(Z)V", line = 532)
    public static void method2731(boolean arg0) {
        if (arg0) {
            field6326 = -62;
        }
        field6315 = null;
        field6321 = null;
    }
}
