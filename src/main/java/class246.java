import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class246 extends class183 {

    @OriginalMember(owner = "client!fd", name = "Z", descriptor = "Ljf;")
    public static class229 field4370 = class212.method1457((byte) 75, "Fallen lassen");

    @OriginalMember(owner = "client!fd", name = "V", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!fd", name = "W", descriptor = "[I")
    public static int[] field4367 = new int[4096];

    @OriginalMember(owner = "client!fd", name = "T", descriptor = "I")
    public static int field4364;

    @OriginalMember(owner = "client!fd", name = "U", descriptor = "I")
    public static int field4365;

    @OriginalMember(owner = "client!fd", name = "X", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!fd", name = "Y", descriptor = "I")
    public static int field4369;

    @OriginalMember(owner = "client!fd", name = "ab", descriptor = "I")
    public static int field4371;

    @OriginalMember(owner = "client!fd", name = "bb", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!fd", name = "cb", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(I)V", line = 5)
    public static void method1779(int arg0) {
        int var1 = -73 / ((arg0 + 30) / 63);
        field4370 = null;
        field4367 = null;
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(II)[I", line = 25)
    public final int[] method10(int arg0, int arg1) {
        field4369++;
        if (arg1 != -1) {
            method1779(-105);
        }
        int[] var3 = this.field3161.method664(arg0, 0);
        if (this.field3161.field1736) {
            int var4 = class42.field746[arg0];
            for (int var5 = 0; var5 < class22.field393; var5++) {
                var3[var5] = this.method1782(11480, class97.field1737[var5], var4) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "(I)[Lkb;", line = 58)
    public static final class35[] method1780(int arg0) {
        field4365++;
        class35[] var1 = new class35[class315.field5348];
        if (arg0 != 22804) {
            return (class35[]) null;
        }
        for (int var2 = 0; var2 < class315.field5348; var2++) {
            byte[] var3 = class21.field357[var2];
            int var4 = class6.field71[var2] * class232.field4025[var2];
            if (class122.field2148[var2]) {
                byte[] var5 = class315.field5336[var2];
                int[] var6 = new int[var4];
                for (int var7 = 0; var7 < var4; var7++) {
                    var6[var7] = class97.method665(class64.field1115[class305.method2086(var3[var7], 255)], class305.method2086(var5[var7] << 24, -16777216));
                }
                if (class108.field1900) {
                    var1[var2] = new class133(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var6);
                } else {
                    var1[var2] = new class121(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var6);
                }
            } else {
                int[] var8 = new int[var4];
                for (int var9 = 0; var9 < var4; var9++) {
                    var8[var9] = class64.field1115[class305.method2086(var3[var9], 255)];
                }
                if (class108.field1900) {
                    var1[var2] = new class326(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var8);
                } else {
                    var1[var2] = new class159(class97.field1722, class307.field5192, class272.field4659[var2], class256.field4473[var2], class232.field4025[var2], class6.field71[var2], var8);
                }
            }
        }
        class62.method466((byte) 83);
        return var1;
    }

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "(B)V", line = 121)
    public static final void method1781(byte arg0) {
        field4373++;
        if (class16.field253 == 0 || class16.field253 == 5) {
            return;
        }
        try {
            int var1 = 16 % ((30 - arg0) / 42);
            if ((++class288.field4927) > 2000) {
                if (class160.field2720 != null) {
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                }
                if (class110.field1940 >= 1) {
                    class4.field27 = -5;
                    class16.field253 = 0;
                    return;
                }
                class16.field253 = 1;
                if (class6.field67 == class192.field3337) {
                    class192.field3337 = class84.field1614;
                } else {
                    class192.field3337 = class6.field67;
                }
                class110.field1940++;
                class288.field4927 = 0;
            }
            if (class16.field253 == 1) {
                class193.field3354 = class215.field3689.method1376(class152.field2631, 0, class192.field3337);
                class16.field253 = 2;
            }
            if (class16.field253 == 2) {
                if (class193.field3354.field4011 == 2) {
                    throw new IOException();
                }
                if (class193.field3354.field4011 != 1) {
                    return;
                }
                class160.field2720 = new class205((Socket) class193.field3354.field4009, class215.field3689);
                class193.field3354 = null;
                long var2 = class328.field5556 = class331.field5629.method1617(99);
                class84.field1608.field195 = 0;
                class84.field1608.method140(14, (byte) 75);
                int var4 = (int) (var2 >> 16 & 0x1FL);
                class84.field1608.method140(var4, (byte) 75);
                class160.field2720.method1428(22974, 2, class84.field1608.field174, 0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                int var5 = class160.field2720.method1435(0);
                if (class244.field4353 != null) {
                    class244.field4353.method401((byte) -83);
                }
                if (class180.field3124 != null) {
                    class180.field3124.method401((byte) -83);
                }
                if (var5 != 0) {
                    class4.field27 = var5;
                    class16.field253 = 0;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                }
                class16.field253 = 3;
            }
            if (class16.field253 == 3) {
                if (class160.field2720.method1436(-3616) < 8) {
                    return;
                }
                class160.field2720.method1431(8, class171.field2972.field174, 0, (byte) -92);
                class171.field2972.field195 = 0;
                class90.field1646 = class171.field2972.method132(-1);
                class84.field1608.field195 = 0;
                int[] var6 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (class90.field1646 >> 32), (int) class90.field1646 };
                class84.field1608.method140(10, (byte) 75);
                class84.field1608.method100(var6[0], 65280);
                class84.field1608.method100(var6[1], 65280);
                class84.field1608.method100(var6[2], 65280);
                class84.field1608.method100(var6[3], 65280);
                class84.field1608.method118(class331.field5629.method1617(115), (byte) -125);
                class84.field1608.method107((byte) -21, class331.field5641);
                class84.field1608.method115((byte) 23, class168.field2879, class137.field2379);
                class195.field3391.field195 = 0;
                if (class325.field5482 == 40) {
                    class195.field3391.method140(18, (byte) 75);
                } else {
                    class195.field3391.method140(16, (byte) 75);
                }
                class195.field3391.method125(-25369, class84.field1608.field195 + class226.method1561((byte) 100, class174.field3033) + 159);
                class195.field3391.method100(523, 65280);
                class195.field3391.method140(class71.field1369, (byte) 75);
                class195.field3391.method140(class111.field1956 ? 1 : 0, (byte) 75);
                class195.field3391.method140(1, (byte) 75);
                class195.field3391.method140(class165.method1132((byte) 97), (byte) 75);
                class195.field3391.method125(-25369, class175.field3046);
                class195.field3391.method125(-25369, class78.field1429);
                class195.field3391.method140(class252.field4406, (byte) 75);
                class228.method1600(class195.field3391, (byte) -75);
                class195.field3391.method107((byte) -21, class174.field3033);
                class195.field3391.method100(class23.field432, 65280);
                class195.field3391.method100(class91.method642((byte) 78), 65280);
                class16.field241 = true;
                class195.field3391.method125(-25369, class308.field5208);
                class195.field3391.method100(class306.field5184.method1270((byte) -23), 65280);
                class195.field3391.method100(class42.field747.method1270((byte) -23), 65280);
                class195.field3391.method100(class200.field3491.method1270((byte) -23), 65280);
                class195.field3391.method100(class50.field886.method1270((byte) -23), 65280);
                class195.field3391.method100(class289.field4945.method1270((byte) -23), 65280);
                class195.field3391.method100(class20.field332.method1270((byte) -23), 65280);
                class195.field3391.method100(class259.field4506.method1270((byte) -23), 65280);
                class195.field3391.method100(class180.field3123.method1270((byte) -23), 65280);
                class195.field3391.method100(class269.field4616.method1270((byte) -23), 65280);
                class195.field3391.method100(class151.field2615.method1270((byte) -23), 65280);
                class195.field3391.method100(class33.field644.method1270((byte) -23), 65280);
                class195.field3391.method100(class29.field505.method1270((byte) -23), 65280);
                class195.field3391.method100(class293.field5023.method1270((byte) -23), 65280);
                class195.field3391.method100(class106.field1840.method1270((byte) -23), 65280);
                class195.field3391.method100(class279.field4781.method1270((byte) -23), 65280);
                class195.field3391.method100(class320.field5409.method1270((byte) -23), 65280);
                class195.field3391.method100(class46.field852.method1270((byte) -23), 65280);
                class195.field3391.method100(class131.field2312.method1270((byte) -23), 65280);
                class195.field3391.method100(class67.field1290.method1270((byte) -23), 65280);
                class195.field3391.method100(class271.field4653.method1270((byte) -23), 65280);
                class195.field3391.method100(class214.field3687.method1270((byte) -23), 65280);
                class195.field3391.method100(class118.field2102.method1270((byte) -23), 65280);
                class195.field3391.method100(class296.field5068.method1270((byte) -23), 65280);
                class195.field3391.method100(class143.field2490.method1270((byte) -23), 65280);
                class195.field3391.method100(class212.field3641.method1270((byte) -23), 65280);
                class195.field3391.method100(class243.field4285.method1270((byte) -23), 65280);
                class195.field3391.method100(class273.field4679.method1270((byte) -23), 65280);
                class195.field3391.method100(class109.field1928.method1270((byte) -23), 65280);
                class195.field3391.method90(false, class84.field1608.field195, class84.field1608.field174, 0);
                class160.field2720.method1428(22974, class195.field3391.field195, class195.field3391.field174, 0);
                class84.field1608.method1404((byte) -44, var6);
                for (int var7 = 0; var7 < 4; var7++) {
                    var6[var7] += 50;
                }
                class171.field2972.method1404((byte) -43, var6);
                class16.field253 = 4;
            }
            if (class16.field253 == 4) {
                if (class160.field2720.method1436(-3616) < 1) {
                    return;
                }
                int var8 = class160.field2720.method1435(0);
                if (var8 == 21) {
                    class16.field253 = 7;
                } else if (var8 == 29) {
                    class16.field253 = 10;
                } else if (var8 == 1) {
                    class16.field253 = 5;
                    class4.field27 = var8;
                    return;
                } else if (var8 == 2) {
                    class16.field253 = 8;
                } else if (var8 == 15) {
                    class16.field253 = 0;
                    class4.field27 = var8;
                    return;
                } else if (var8 == 23 && class110.field1940 < 1) {
                    class16.field253 = 1;
                    class288.field4927 = 0;
                    class110.field1940++;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                } else {
                    class4.field27 = var8;
                    class16.field253 = 0;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                }
            }
            if (class16.field253 == 6) {
                class84.field1608.field195 = 0;
                class84.field1608.method1397(17, 0);
                class160.field2720.method1428(22974, class84.field1608.field195, class84.field1608.field174, 0);
                class16.field253 = 4;
                return;
            }
            if (class16.field253 == 7) {
                if (class160.field2720.method1436(-3616) >= 1) {
                    class47.field865 = class160.field2720.method1435(0) * 60 + 180;
                    class16.field253 = 0;
                    class4.field27 = 21;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                }
                return;
            }
            if (class16.field253 == 10) {
                if (class160.field2720.method1436(-3616) >= 1) {
                    class243.field4299 = class160.field2720.method1435(0);
                    class16.field253 = 0;
                    class4.field27 = 29;
                    class160.field2720.method1433((byte) -115);
                    class160.field2720 = null;
                    return;
                }
                return;
            }
            if (class16.field253 == 8) {
                if (class160.field2720.method1436(-3616) < 14) {
                    return;
                }
                class160.field2720.method1431(14, class171.field2972.field174, 0, (byte) -92);
                class171.field2972.field195 = 0;
                class200.field3500 = class171.field2972.method93(false);
                class187.field3283 = class171.field2972.method93(false);
                class283.field4852 = class171.field2972.method93(false) == 1;
                class281.field4808 = class171.field2972.method93(false) == 1;
                class320.field5408 = class171.field2972.method93(false) == 1;
                class252.field4402 = class171.field2972.method93(false) == 1;
                class315.field5347 = class171.field2972.method93(false) == 1;
                class112.field1963 = class171.field2972.method116(-1);
                class24.field450 = class171.field2972.method93(false) == 1;
                class323.field5456 = class171.field2972.method93(false) == 1;
                class213.method1464((byte) -25, class323.field5456);
                class330.method2251(3, class323.field5456);
                if (!class111.field1956) {
                    if ((!class283.field4852 || class320.field5408) && !class24.field450) {
                        try {
                            class124.field2179.method1634((byte) -2, class215.field3689.field3461);
                        } catch (Throwable var13) {
                        }
                    } else {
                        try {
                            class312.field5248.method1634((byte) -2, class215.field3689.field3461);
                        } catch (Throwable var12) {
                        }
                    }
                }
                class107.field1879 = class171.field2972.method1394(255);
                class51.field902 = class171.field2972.method116(-1);
                class16.field253 = 9;
            }
            if (class16.field253 == 9) {
                if (class160.field2720.method1436(-3616) >= class51.field902) {
                    class171.field2972.field195 = 0;
                    class160.field2720.method1431(class51.field902, class171.field2972.field174, 0, (byte) -92);
                    class16.field253 = 0;
                    class4.field27 = 2;
                    class173.method1179(0);
                    class184.field3188 = -1;
                    class169.method1147(false, 68);
                    class107.field1879 = -1;
                    return;
                }
                return;
            }
        } catch (IOException var14) {
            if (class160.field2720 != null) {
                class160.field2720.method1433((byte) -115);
                class160.field2720 = null;
            }
            if (class110.field1940 < 1) {
                class288.field4927 = 0;
                if (class6.field67 == class192.field3337) {
                    class192.field3337 = class84.field1614;
                } else {
                    class192.field3337 = class6.field67;
                }
                class16.field253 = 1;
                class110.field1940++;
            } else {
                class16.field253 = 0;
                class4.field27 = -4;
            }
        }
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "()V", line = 499)
    public class246() {
        super(0, true);
    }

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "(III)I", line = 518)
    private final int method1782(int arg0, int arg1, int arg2) {
        field4364++;
        if (arg0 != 11480) {
            field4370 = (class229) null;
        }
        int var4 = arg2 * 57 + arg1;
        int var5 = var4 ^ var4 << 1;
        return 4096 - (((var5 * var5 * 15731 + 789221) * var5 + 1376312589 & Integer.MAX_VALUE) / 262144);
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field4367[var0] = class91.method647(var0, (byte) 127);
        }
    }
}
