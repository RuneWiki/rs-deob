import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class305 {

    @OriginalMember(owner = "client!cj", name = "d", descriptor = "[I")
    public static int[] field5209 = new int[2000];

    @OriginalMember(owner = "client!cj", name = "h", descriptor = "[Z")
    public static boolean[] field5213 = new boolean[8];

    @OriginalMember(owner = "client!cj", name = "j", descriptor = "Lve;")
    public static class255 field5215 = class87.method607(72, "leuchten2:");

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "Lve;")
    public static class255 field5207 = class87.method607(62, " loggt sich aus)3");

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "I")
    public static int field5206;

    @OriginalMember(owner = "client!cj", name = "e", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!cj", name = "f", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!cj", name = "g", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!cj", name = "k", descriptor = "I")
    public static int field5216;

    @OriginalMember(owner = "client!cj", name = "l", descriptor = "I")
    public static int field5217;

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "Lrj;")
    public static class17 field5208;

    @OriginalMember(owner = "client!cj", name = "i", descriptor = "Lfk;")
    public static class40 field5214;

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(I)V", line = 4)
    public static final void method2116(int arg0) {
        field5211++;
        if (class160.field2702 == 0 || class160.field2702 == 5) {
            return;
        }
        try {
            if ((++class251.field4228) > 2000) {
                if (client.field4041 != null) {
                    client.field4041.method1650((byte) 127);
                    client.field4041 = null;
                }
                if (class145.field2475 >= 1) {
                    class284.field4886 = -5;
                    class160.field2702 = 0;
                    return;
                }
                class145.field2475++;
                if (class294.field5051 == class155.field2650) {
                    class294.field5051 = class232.field3853;
                } else {
                    class294.field5051 = class155.field2650;
                }
                class251.field4228 = 0;
                class160.field2702 = 1;
            }
            if (class160.field2702 == 1) {
                class63.field957 = class221.field3728.method237(0, class294.field5051, class248.field4153);
                class160.field2702 = 2;
            }
            if (class160.field2702 == 2) {
                if (class63.field957.field2833 == 2) {
                    throw new IOException();
                }
                if (class63.field957.field2833 != 1) {
                    return;
                }
                client.field4041 = new class239((Socket) class63.field957.field2832, class221.field3728);
                class63.field957 = null;
                long var1 = class256.field4378 = class49.field731.method1764((byte) -121);
                int var3 = (int) (var1 >> 16 & 0x1FL);
                class255.field4318.field1068 = 0;
                class255.field4318.method463(false, 14);
                class255.field4318.method463(false, var3);
                client.field4041.method1653(0, class255.field4318.field1066, (byte) 101, 2);
                if (class195.field3208 != null) {
                    class195.field3208.method1030((byte) -127);
                }
                if (class250.field4219 != null) {
                    class250.field4219.method1030((byte) -71);
                }
                int var4 = client.field4041.method1655(28982);
                if (class195.field3208 != null) {
                    class195.field3208.method1030((byte) -106);
                }
                if (class250.field4219 != null) {
                    class250.field4219.method1030((byte) -83);
                }
                if (var4 != 0) {
                    class284.field4886 = var4;
                    class160.field2702 = 0;
                    client.field4041.method1650((byte) -97);
                    client.field4041 = null;
                    return;
                }
                class160.field2702 = 3;
            }
            if (class160.field2702 == 3) {
                if (client.field4041.method1652(-13301) < 8) {
                    return;
                }
                client.field4041.method1651(8, class160.field2692.field1066, arg0 + 10757, 0);
                int[] var5 = new int[4];
                class160.field2692.field1068 = 0;
                class125.field2077 = class160.field2692.method485(-380964768);
                var5[2] = (int) (class125.field2077 >> 32);
                class255.field4318.field1068 = 0;
                var5[1] = (int) (Math.random() * 9.9999999E7D);
                var5[0] = (int) (Math.random() * 9.9999999E7D);
                var5[3] = (int) class125.field2077;
                class255.field4318.method463(false, 10);
                class255.field4318.method436(var5[0], arg0 ^ 0x6386);
                class255.field4318.method436(var5[1], -18820);
                class255.field4318.method436(var5[2], -18820);
                class255.field4318.method436(var5[3], -18820);
                class255.field4318.method449(16711680, class49.field731.method1764((byte) 65));
                class255.field4318.method483(-99755000, class49.field730);
                class255.field4318.method452(class206.field3536, true, class54.field852);
                class6.field83.field1068 = 0;
                if (class18.field281 == 40) {
                    class6.field83.method463(false, 18);
                } else {
                    class6.field83.method463(false, 16);
                }
                class6.field83.method462(class255.field4318.field1068 + class271.method1891(class135.field2245, arg0 ^ 0x2A72) + 154, (byte) -61);
                class6.field83.method436(515, arg0 ^ 0x6386);
                class6.field83.method463(false, class79.field1284);
                class6.field83.method463(false, class22.field348 ? 1 : 0);
                class6.field83.method463(false, 1);
                class6.field83.method463(false, class261.method1820((byte) 58));
                class6.field83.method462(class210.field3589, (byte) -61);
                class6.field83.method462(class201.field3479, (byte) -61);
                class297.method2092(class6.field83, -24763);
                class6.field83.method483(-99755000, class135.field2245);
                class6.field83.method436(client.field4022, arg0 ^ 0x6386);
                class6.field83.method436(class121.method896(true), -18820);
                class43.field674 = true;
                class6.field83.method462(class93.field1604, (byte) -61);
                class6.field83.method436(class46.field695.method628(true), -18820);
                class6.field83.method436(class235.field3869.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class144.field2401.method628(true), -18820);
                class6.field83.method436(class183.field2955.method628(true), -18820);
                class6.field83.method436(class87.field1422.method628(true), arg0 - 8062);
                class6.field83.method436(class174.field2883.method628(true), arg0 - 8062);
                class6.field83.method436(class143.field2379.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class97.field1675.method628(true), -18820);
                class6.field83.method436(class220.field3707.method628(true), -18820);
                class6.field83.method436(class115.field1955.method628(true), -18820);
                class6.field83.method436(class74.field1229.method628(true), -18820);
                class6.field83.method436(class285.field4895.method628(true), -18820);
                class6.field83.method436(class315.field5348.method628(true), arg0 - 8062);
                class6.field83.method436(class167.field2814.method628(true), -18820);
                class6.field83.method436(class282.field4856.method628(true), -18820);
                class6.field83.method436(class251.field4230.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class137.field2300.method628(true), -18820);
                class6.field83.method436(class296.field5070.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class116.field1974.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class206.field3546.method628(true), arg0 - 8062);
                class6.field83.method436(class185.field2989.method628(true), -18820);
                class6.field83.method436(class101.field1712.method628(true), -18820);
                class6.field83.method436(class32.field524.method628(true), -18820);
                class6.field83.method436(class159.field2686.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class210.field3586.method628(true), arg0 ^ 0x6386);
                class6.field83.method436(class238.field3965.method628(true), -18820);
                class6.field83.method436(class181.field2921.method628(true), -18820);
                class6.field83.method484((byte) 80, 0, class255.field4318.field1066, class255.field4318.field1068);
                client.field4041.method1653(0, class6.field83.field1066, (byte) 86, class6.field83.field1068);
                class255.field4318.method1520(true, var5);
                for (int var6 = 0; var6 < 4; var6++) {
                    var5[var6] += 50;
                }
                class160.field2692.method1520(true, var5);
                class160.field2702 = 4;
            }
            if (class160.field2702 == 4) {
                if (client.field4041.method1652(-13301) < 1) {
                    return;
                }
                int var7 = client.field4041.method1655(28982);
                if (var7 == 21) {
                    class160.field2702 = 7;
                } else if (var7 == 29) {
                    class160.field2702 = 10;
                } else if (var7 == 1) {
                    class284.field4886 = var7;
                    class160.field2702 = 5;
                    return;
                } else if (var7 == 2) {
                    class160.field2702 = 8;
                } else if (var7 == 15) {
                    class284.field4886 = var7;
                    class160.field2702 = 0;
                    return;
                } else if (var7 == 23 && class145.field2475 < 1) {
                    class251.field4228 = 0;
                    class160.field2702 = 1;
                    class145.field2475++;
                    client.field4041.method1650((byte) 75);
                    client.field4041 = null;
                    return;
                } else {
                    class160.field2702 = 0;
                    class284.field4886 = var7;
                    client.field4041.method1650((byte) 76);
                    client.field4041 = null;
                    return;
                }
            }
            if (class160.field2702 == 6) {
                class255.field4318.field1068 = 0;
                class255.field4318.method1523(22260, 17);
                client.field4041.method1653(0, class255.field4318.field1066, (byte) -118, class255.field4318.field1068);
                class160.field2702 = 4;
                return;
            }
            if (arg0 != -10758) {
                field5208 = (class17) null;
            }
            if (class160.field2702 == 7) {
                if (client.field4041.method1652(-13301) >= 1) {
                    class285.field4896 = client.field4041.method1655(28982) * 60 + 180;
                    class160.field2702 = 0;
                    class284.field4886 = 21;
                    client.field4041.method1650((byte) -123);
                    client.field4041 = null;
                    return;
                }
                return;
            }
            if (class160.field2702 == 10) {
                if (client.field4041.method1652(arg0 - 2543) < 1) {
                    return;
                }
                client.field4040 = client.field4041.method1655(arg0 ^ 0xFFFFA4CC);
                class284.field4886 = 29;
                class160.field2702 = 0;
                client.field4041.method1650((byte) -6);
                client.field4041 = null;
                return;
            }
            if (class160.field2702 == 8) {
                if (client.field4041.method1652(-13301) < 12) {
                    return;
                }
                client.field4041.method1651(12, class160.field2692.field1066, -1, 0);
                class160.field2692.field1068 = 0;
                class201.field3483 = class160.field2692.method481(0);
                class17.field259 = class160.field2692.method481(0);
                class2.field35 = class160.field2692.method481(arg0 ^ 0xFFFFD5FA);
                if (!class22.field348) {
                    if (class2.field35 == 1) {
                        try {
                            class131.field2153.method1773(class221.field3728.field626, arg0 + 10758);
                        } catch (Throwable var11) {
                        }
                    } else {
                        try {
                            class26.field419.method1773(class221.field3728.field626, 0);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class231.field3837 = class160.field2692.method481(0);
                class93.field1593 = class160.field2692.method481(arg0 ^ 0xFFFFD5FA) == 1;
                class14.field210 = class160.field2692.method423(255);
                class11.field161 = class160.field2692.method481(0) == 1;
                class112.field1902 = class160.field2692.method481(arg0 ^ -10758) == 1;
                class194.method1385(class112.field1902, -28352);
                class294.method2075(class112.field1902, (byte) 127);
                class75.field1230 = class160.field2692.method1517(false);
                class125.field2084 = class160.field2692.method423(255);
                class160.field2702 = 9;
            }
            if (class160.field2702 == 9) {
                if (client.field4041.method1652(-13301) >= class125.field2084) {
                    class160.field2692.field1068 = 0;
                    client.field4041.method1651(class125.field2084, class160.field2692.field1066, arg0 + 10757, 0);
                    class160.field2702 = 0;
                    class284.field4886 = 2;
                    class294.method2078((byte) 119);
                    class20.field332 = -1;
                    class42.method261(false, (byte) 53);
                    class75.field1230 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var13) {
            if (client.field4041 != null) {
                client.field4041.method1650((byte) -2);
                client.field4041 = null;
            }
            if (class145.field2475 < 1) {
                if (class294.field5051 == class155.field2650) {
                    class294.field5051 = class232.field3853;
                } else {
                    class294.field5051 = class155.field2650;
                }
                class145.field2475++;
                class251.field4228 = 0;
                class160.field2702 = 1;
            } else {
                class160.field2702 = 0;
                class284.field4886 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(IIIIII)V", line = 379)
    public static final void method2117(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field5210++;
        int var6 = arg5;
        int var7 = arg1 * arg1;
        int var8 = 0;
        int var9 = arg5 * arg5;
        int var10 = arg5 << 1;
        int var11 = var7 << 1;
        int var12 = var9 << 1;
        int var13 = (arg4 - var10) * var7 + var12;
        int var14 = var7 << 2;
        int var15 = var9 - ((var10 - 1) * var11);
        int var16 = var9 << 2;
        int var17 = ((var8 << 1) + 3) * var12;
        int var18 = ((arg5 << 1) - 3) * var11;
        int var19 = (var8 + 1) * var16;
        int var20 = (arg5 - 1) * var14;
        if (class261.field4427 <= arg2 && class11.field156 >= arg2) {
            int var21 = class198.method1425(class30.field473, false, arg1 + arg3, class125.field2082);
            int var22 = class198.method1425(class30.field473, false, arg3 - arg1, class125.field2082);
            class30.method170(var21, class250.field4213[arg2], var22, arg0, -30310);
        }
        while (var6 > 0) {
            var6--;
            if (var13 < 0) {
                while (var13 < 0) {
                    var13 += var17;
                    var17 += var16;
                    var8++;
                    var15 += var19;
                    var19 += var16;
                }
            }
            int var23 = arg2 - var6;
            int var24 = arg2 + var6;
            if (var15 < 0) {
                var8++;
                var13 += var17;
                var15 += var19;
                var19 += var16;
                var17 += var16;
            }
            if (class261.field4427 <= var24 && class11.field156 >= var23) {
                int var25 = class198.method1425(class30.field473, false, arg3 + var8, class125.field2082);
                int var26 = class198.method1425(class30.field473, false, arg3 - var8, class125.field2082);
                if (var23 >= class261.field4427) {
                    class30.method170(var25, class250.field4213[var23], var26, arg0, -30310);
                }
                if (var24 <= class11.field156) {
                    class30.method170(var25, class250.field4213[var24], var26, arg0, -30310);
                }
            }
            var13 += -var20;
            var20 -= var14;
            var15 += -var18;
            var18 -= var14;
        }
    }

    @OriginalMember(owner = "client!cj", name = "b", descriptor = "(I)[F", line = 480)
    public static final float[] method2118(int arg0) {
        field5206++;
        float var1 = class272.method1898() + class272.method1901();
        int var2 = class272.method1902();
        class203.field3510[3] = 1.0F;
        float var3 = (float) ((var2 & 0xFFB5D8) >> 16) / 255.0F;
        float var4 = (float) ((var2 & 0xFFA3) >> 8) / 255.0F;
        int var5 = -115 % ((arg0 - 32) / 48);
        float var6 = (float) (var2 & 0xFF) / 255.0F;
        float var7 = 0.58823526F;
        class203.field3510[2] = class113.field1911[2] * var6 * var7 * var1;
        class203.field3510[0] = class113.field1911[0] * var3 * var7 * var1;
        class203.field3510[1] = class113.field1911[1] * var4 * var7 * var1;
        return class203.field3510;
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(ILrg;I)Z", line = 510)
    public static final boolean method2119(int arg0, class88 arg1, int arg2) {
        byte[] var3 = arg1.method633((byte) -70, arg0);
        field5212++;
        if (var3 == null) {
            return false;
        } else {
            int var4 = 118 / ((-arg2 - 30) / 35);
            class124.method917(var3, false);
            return true;
        }
    }

    @OriginalMember(owner = "client!cj", name = "a", descriptor = "(II)I", line = 542)
    public static final int method2120(int arg0, int arg1) {
        if (arg1 <= 12) {
            method2118(-27);
        }
        field5217++;
        return arg0 & 0xFF;
    }

    @OriginalMember(owner = "client!cj", name = "c", descriptor = "(I)V", line = 553)
    public static void method2121(int arg0) {
        field5208 = null;
        field5214 = null;
        field5215 = null;
        if (arg0 >= -3) {
            field5208 = (class17) null;
        }
        field5213 = null;
        field5207 = null;
        field5209 = null;
    }
}
