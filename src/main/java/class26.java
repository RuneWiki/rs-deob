import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sd")
public class class26 extends class287 {

    @OriginalMember(owner = "client!sd", name = "w", descriptor = "Lmh;")
    public static class128 field574 = class22.method156(123, "Gegenstand f-Ur Mitglieder");

    @OriginalMember(owner = "client!sd", name = "D", descriptor = "Lmh;")
    public static class128 field580 = class22.method156(123, "Musik)2Engine vorbereitet)3");

    @OriginalMember(owner = "client!sd", name = "E", descriptor = "[Z")
    public static boolean[] field581 = new boolean[100];

    @OriginalMember(owner = "client!sd", name = "x", descriptor = "Ltb;")
    public static class210 field575 = new class210(64);

    @OriginalMember(owner = "client!sd", name = "G", descriptor = "[J")
    public static long[] field583 = new long[256];

    @OriginalMember(owner = "client!sd", name = "B", descriptor = "B")
    public byte field578;

    @OriginalMember(owner = "client!sd", name = "s", descriptor = "I")
    public static int field570;

    @OriginalMember(owner = "client!sd", name = "t", descriptor = "I")
    public static int field571;

    @OriginalMember(owner = "client!sd", name = "u", descriptor = "I")
    public static int field572;

    @OriginalMember(owner = "client!sd", name = "v", descriptor = "I")
    public static int field573;

    @OriginalMember(owner = "client!sd", name = "y", descriptor = "I")
    public static int field576;

    @OriginalMember(owner = "client!sd", name = "z", descriptor = "I")
    public static int field577;

    @OriginalMember(owner = "client!sd", name = "C", descriptor = "I")
    public int field579;

    @OriginalMember(owner = "client!sd", name = "r", descriptor = "Lmh;")
    public class128 field569;

    @OriginalMember(owner = "client!sd", name = "F", descriptor = "Lmh;")
    public class128 field582;

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(B)V", line = 4)
    public static void method166(byte arg0) {
        field580 = null;
        field575 = null;
        if (arg0 >= -1) {
            field574 = (class128) null;
        }
        field581 = null;
        field574 = null;
        field583 = null;
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IZ)V", line = 21)
    public static final void method167(int arg0, boolean arg1) {
        field570++;
        byte var2;
        byte[][] var3;
        if (class247.field4247 && arg1) {
            var2 = 1;
            var3 = class77.field1422;
        } else {
            var3 = class8.field183;
            var2 = 4;
        }
        for (int var4 = 0; var4 < var2; var4++) {
            class218.method1503(false);
            for (int var5 = 0; var5 < 13; var5++) {
                for (int var6 = 0; var6 < 13; var6++) {
                    int var7 = class175.field3095[var4][var5][var6];
                    boolean var8 = false;
                    if (var7 != -1) {
                        int var9 = var7 >> 24 & 0x3;
                        if (!arg1 || var9 == 0) {
                            int var10 = var7 >> 1 & 0x3;
                            int var11 = (var7 & 0xFFF31E) >> 14;
                            int var12 = (var7 & 0x3FFF) >> 3;
                            int var13 = (var11 / 8 << 8) + var12 / 8;
                            for (int var14 = 0; var14 < class226.field3949.length; var14++) {
                                if (class226.field3949[var14] == var13 && var3[var14] != null) {
                                    class275.method1932(var9, var5 * 8, var4, var10, arg1, (var12 & 0x7) * 8, (byte) 21, (var11 & 0x7) * 8, var3[var14], var6 * 8, class180.field3158);
                                    var8 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (!var8) {
                        class288.method1985(var5 * 8, var6 * 8, (byte) 76, 8, var4, 8);
                    }
                }
            }
        }
        if (arg0 != 7) {
            method171(66);
        }
    }

    @OriginalMember(owner = "client!sd", name = "b", descriptor = "(I)V", line = 121)
    public static final void method168(int arg0) {
        class79.field1432.method1834(17);
        class163.field2798.method1834(17);
        field576++;
        if (arg0 == 60) {
            class115.field1926.method1834(17);
            class275.field4765.method1834(17);
        }
    }

    @OriginalMember(owner = "client!sd", name = "a", descriptor = "(IIB)I", line = 139)
    public static final int method169(int arg0, int arg1, byte arg2) {
        int var3 = 1;
        field571++;
        while (arg0 > 1) {
            if ((arg0 & 0x1) != 0) {
                var3 = arg1 * var3;
            }
            arg0 >>= 0x1;
            arg1 *= arg1;
        }
        if (arg2 >= -72) {
            field581 = (boolean[]) null;
        }
        if (arg0 == 1) {
            return arg1 * var3;
        } else {
            return var3;
        }
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field583[var0] = var1;
        }
    }

    @OriginalMember(owner = "client!sd", name = "c", descriptor = "(I)V", line = 175)
    public static final void method170(int arg0) {
        if (class121.field2041 != null) {
            class121.field2041.method1229(false);
            class121.field2041 = null;
        }
        field573++;
        class248.method1726(16);
        class288.method1989();
        for (int var1 = 0; var1 < 4; var1++) {
            class180.field3158[var1].method1727((byte) 59);
        }
        class88.method547(-1741557305);
        System.gc();
        class268.method1869(17714, 2);
        class64.field1205 = false;
        class152.field2612 = -1;
        class30.method218(true, (byte) -42);
        class303.field5129 = false;
        class221.field3889 = 0;
        class4.field72 = 0;
        for (int var2 = 0; var2 < class260.field4489.length; var2++) {
            class260.field4489[var2] = null;
        }
        class37.field749 = 0;
        class75.field1404 = 0;
        for (int var3 = 0; var3 < 2048; var3++) {
            class140.field2405[var3] = null;
            class303.field5137[var3] = null;
        }
        if (arg0 != -18794) {
            field575 = (class210) null;
        }
        for (int var4 = 0; var4 < 32768; var4++) {
            class201.field3560[var4] = null;
        }
        for (int var5 = 0; var5 < 4; var5++) {
            for (int var6 = 0; var6 < 104; var6++) {
                for (int var7 = 0; var7 < 104; var7++) {
                    class221.field3888[var5][var6][var7] = null;
                }
            }
        }
        class17.method133((byte) 115);
        class298.field5082 = 0;
        class192.method1288((byte) 86, true);
    }

    @OriginalMember(owner = "client!sd", name = "d", descriptor = "(I)Z", line = 276)
    public static final boolean method171(int arg0) {
        field572++;
        try {
            return arg0 == 11752 ? class228.method1561(92) : false;
        } catch (IOException var5) {
            class263.method1848((byte) 88);
            return true;
        } catch (Exception var6) {
            String var3 = "T2 - " + class298.field5086 + "," + class206.field3622 + "," + client.field4158 + " - " + class102.field1749 + "," + (class163.field2796.field450[0] + class221.field3889) + "," + (class163.field2796.field422[0] + class4.field72) + " - ";
            for (int var4 = 0; class102.field1749 > var4 && var4 < 50; var4++) {
                var3 = var3 + class54.field1051.field3417[var4] + ",";
            }
            class79.method506((byte) -51, var3, var6);
            method170(-18794);
            return true;
        }
    }

    @OriginalMember(owner = "client!sd", name = "e", descriptor = "(I)V", line = 306)
    public static final void method172(int arg0) {
        field577++;
        class238 var1 = (class238) class132.field2284.method2024(0);
        if (arg0 != -29059) {
            method166((byte) 85);
        }
        while (var1 != null) {
            class74 var2 = var1.field4079;
            if (class133.field2315 != var2.field1370 || class293.field5011 > var2.field1363) {
                var1.method1978((byte) 28);
            } else if (class293.field5011 >= var2.field1391) {
                if (var2.field1365 > 0) {
                    class115 var3 = class201.field3560[var2.field1365 - 1];
                    if (var3 != null && var3.field478 >= 0 && var3.field478 < 13312 && var3.field418 >= 0 && var3.field418 < 13312) {
                        var2.method484(class64.method427(var3.field478, var3.field418, var2.field1370, (byte) 97) - var2.field1390, var3.field478, var3.field418, 1, class293.field5011);
                    }
                }
                if (var2.field1365 < 0) {
                    int var4 = -var2.field1365 - 1;
                    class123 var5;
                    if (class104.field1780 == var4) {
                        var5 = class163.field2796;
                    } else {
                        var5 = class140.field2405[var4];
                    }
                    if (var5 != null && var5.field478 >= 0 && var5.field478 < 13312 && var5.field418 >= 0 && var5.field418 < 13312) {
                        var2.method484(class64.method427(var5.field478, var5.field418, var2.field1370, (byte) 118) - var2.field1390, var5.field478, var5.field418, 1, class293.field5011);
                    }
                }
                var2.method490(class50.field992, -5983);
                class252.method1791(class133.field2315, (int) var2.field1385, (int) var2.field1373, (int) var2.field1396, 60, var2, var2.field1383, -1L, false);
            }
            var1 = (class238) class132.field2284.method2027(1211754408);
        }
    }
}
