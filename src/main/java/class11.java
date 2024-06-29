import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class11 {

    @OriginalMember(owner = "client!ea", name = "c", descriptor = "Ljava/lang/String;")
    public static String field166 = " is already on your ignore list.";

    @OriginalMember(owner = "client!ea", name = "l", descriptor = "F")
    public static float field175;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "I")
    public static int field164;

    @OriginalMember(owner = "client!ea", name = "d", descriptor = "I")
    public static int field167;

    @OriginalMember(owner = "client!ea", name = "e", descriptor = "I")
    public static int field168;

    @OriginalMember(owner = "client!ea", name = "f", descriptor = "I")
    public static int field169;

    @OriginalMember(owner = "client!ea", name = "g", descriptor = "I")
    public static int field170;

    @OriginalMember(owner = "client!ea", name = "i", descriptor = "I")
    public static int field172;

    @OriginalMember(owner = "client!ea", name = "j", descriptor = "I")
    public static int field173;

    @OriginalMember(owner = "client!ea", name = "k", descriptor = "I")
    public static int field174;

    @OriginalMember(owner = "client!ea", name = "m", descriptor = "I")
    public static int field176;

    @OriginalMember(owner = "client!ea", name = "o", descriptor = "I")
    public static int field178;

    @OriginalMember(owner = "client!ea", name = "p", descriptor = "I")
    public static int field179;

    @OriginalMember(owner = "client!ea", name = "h", descriptor = "Ll;")
    public static class133 field171;

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "Lja;")
    public static class289 field165;

    @OriginalMember(owner = "client!ea", name = "n", descriptor = "[Lhb;")
    public static class246[] field177;

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILl;I)Lfk;", line = 7)
    public static final class156 method80(int arg0, class133 arg1, int arg2) {
        field178++;
        byte[] var3 = arg1.method969(true, arg2);
        if (arg0 <= 12) {
            method88(-20);
        }
        return var3 == null ? null : new class156(var3);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIIIB)V", line = 27)
    public static final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        int var9 = arg2 + 1;
        class272.method1876(class34.field525[arg2], arg1, arg4, arg3, (byte) -92);
        if (arg5 > -35) {
            return;
        }
        field167++;
        int var8 = arg0 - 1;
        class272.method1876(class34.field525[arg0], arg1, arg4, arg3, (byte) -51);
        for (int var6 = var9; var6 <= var8; var6++) {
            int[] var7 = class34.field525[var6];
            var7[arg4] = var7[arg1] = arg3;
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(ILan;ILib;Lqh;III)V", line = 51)
    public static final void method82(int arg0, class85 arg1, int arg2, class313 arg3, class33 arg4, int arg5, int arg6, int arg7) {
        field174++;
        class239 var8 = new class239();
        var8.field3809 = arg0;
        var8.field3812 = arg5 * 128;
        var8.field3804 = arg2 * arg6;
        if (arg1 != null) {
            var8.field3803 = arg1.field1319;
            var8.field3797 = arg1.field1383 * 128;
            var8.field3795 = arg1.field1364;
            var8.field3802 = arg1.field1378;
            var8.field3794 = arg1;
            var8.field3799 = arg1.field1338;
            int var10 = arg1.field1390;
            int var11 = arg1.field1385;
            var8.field3815 = arg1.field1387;
            if (arg7 == 1 || arg7 == 3) {
                var11 = arg1.field1390;
                var10 = arg1.field1385;
            }
            var8.field3818 = (arg2 + var11) * 128;
            var8.field3814 = (arg5 + var10) * 128;
            if (arg1.field1375 != null) {
                var8.field3819 = true;
                var8.method1664(arg6 - 8315);
            }
            if (var8.field3799 != null) {
                var8.field3800 = var8.field3815 + (int) ((double) (var8.field3795 - var8.field3815) * Math.random());
            }
            class304.field4739.method632(arg6 - 179, var8);
        } else if (arg3 != null) {
            class206 var9 = arg3.field4859;
            var8.field3811 = arg3;
            if (var9.field3120 != null) {
                var8.field3819 = true;
                var9 = var9.method1465(60);
            }
            if (var9 != null) {
                var8.field3818 = (var9.field3118 + arg2) * 128;
                var8.field3814 = (var9.field3118 + arg5) * 128;
                var8.field3803 = class30.method254((byte) 74, arg3);
                var8.field3797 = var9.field3122 * 128;
                var8.field3802 = var9.field3148;
            }
            class272.field4223.method632(-95, var8);
        } else if (arg4 != null) {
            var8.field3796 = arg4;
            var8.field3814 = (arg5 + arg4.method280(false)) * 128;
            var8.field3818 = (arg4.method280(false) + arg2) * 128;
            var8.field3803 = class206.method1471(arg4, -1);
            var8.field3797 = arg4.field494 * 128;
            var8.field3802 = arg4.field500;
            class55.field917.method1227(var8, arg6 ^ 0x80, class128.method926(arg4.field477, (byte) -50));
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(IIIII)V", line = 141)
    public static final void method83(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = 91 % ((32 - arg3) / 35);
        field179++;
        if (class94.field1516) {
            class167.method1187(arg4, arg1, arg2 + arg4, arg1 - -arg0);
            class167.method1186(arg4, arg1, arg2, arg0, 0);
        } else {
            class109.method806(arg4, arg1, arg2 + arg4, arg0 + arg1);
            class109.method812(arg4, arg1, arg2, arg0, 0);
        }
        if (class35.field536 < 100) {
            return;
        }
        if (class327.field5088 == null || class327.field5088.field4202 != arg2 || class327.field5088.field4207 != arg0) {
            class249 var6 = new class249(arg2, arg0);
            class109.method800(var6.field3942, arg2, arg0);
            class263.method1795(0, class233.field3706, 0, arg0, class313.field4863, 0, true, arg2, 0);
            if (class94.field1516) {
                class327.field5088 = new class86(var6);
            } else {
                class327.field5088 = var6;
            }
            if (class94.field1516) {
                class109.field1704 = null;
            } else {
                class175.field2644.method1475(true);
            }
        }
        class327.field5088.method625(arg4, arg1);
        int var7 = class320.field5008 * arg2 / class313.field4863 + arg4;
        int var8 = class241.field3862 * arg0 / class233.field3706 + arg1;
        int var9 = class309.field4805 * arg0 / class233.field3706;
        int var10 = class312.field4840 * arg2 / class313.field4863;
        int var11 = 16711680;
        if (class288.field4491 == 1) {
            var11 = 16777215;
        }
        if (class94.field1516) {
            class167.method1193(var7, var8, var10, var9, var11, 128);
            class167.method1189(var7, var8, var10, var9, var11);
        } else {
            class109.method799(var7, var8, var10, var9, var11, 128);
            class109.method801(var7, var8, var10, var9, var11);
        }
        if (class32.field464 <= 0) {
            return;
        }
        int var12;
        if (class60.field979 > 10) {
            var12 = (20 - class60.field979) * 25;
        } else {
            var12 = class60.field979 * 25;
        }
        for (class119 var13 = (class119) class44.field705.method636(-1); var13 != null; var13 = (class119) class44.field705.method638(120)) {
            if (class254.field3996 == var13.field1818) {
                int var14 = var13.field1819 * arg2 / class313.field4863 + arg4;
                int var15 = var13.field1820 * arg0 / class233.field3706 + arg1;
                if (class94.field1516) {
                    class167.method1193(var14 - 2, var15 + -2, 4, 4, 16776960, var12);
                } else {
                    class109.method799(var14 - 2, var15 - 2, 4, 4, 16776960, var12);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(B)V", line = 243)
    public static final void method84(byte arg0) {
        if (arg0 >= -58) {
            return;
        }
        while (class10.field132.method756(class186.field2778, 255) >= 11) {
            int var1 = class10.field132.method759(false, 11);
            if (var1 == 2047) {
                break;
            }
            boolean var2 = false;
            if (class254.field3992[var1] == null) {
                var2 = true;
                class254.field3992[var1] = new class33();
                if (class254.field3998[var1] != null) {
                    class254.field3992[var1].method277(128, class254.field3998[var1]);
                }
            }
            class103.field1606[class310.field4816++] = var1;
            class33 var3 = class254.field3992[var1];
            var3.field1857 = class227.field3618;
            int var4 = class10.field132.method759(false, 1);
            if (var4 == 1) {
                class260.field4065[class98.field1562++] = var1;
            }
            int var5 = class10.field132.method759(false, 5);
            if (var5 > 15) {
                var5 -= 32;
            }
            int var6 = class10.field132.method759(false, 5);
            int var7 = class134.field2138[class10.field132.method759(false, 3)];
            if (var2) {
                var3.field1858 = var3.field1939 = var7;
            }
            int var8 = class10.field132.method759(false, 1);
            if (var6 > 15) {
                var6 -= 32;
            }
            var3.method276(var8 == 1, class98.field1566.field1938[0] + var6, -9749, class98.field1566.field1910[0] + var5);
        }
        class10.field132.method758((byte) -124);
        field169++;
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(I)I", line = 309)
    public static final int method85(int arg0) {
        field164++;
        class342.field5327 = 0;
        if (arg0 != -9896) {
            method80(10, (class133) null, 12);
        }
        return class213.method1497(true);
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(B)V", line = 325)
    public static final void method86(byte arg0) {
        field176++;
        class43.field689.method2174(-10385);
        class276.field4260.method2174(arg0 ^ 0xFFFFD73E);
        if (arg0 != 81) {
            field165 = (class289) null;
        }
        class165.field2477.method2174(-10385);
    }

    @OriginalMember(owner = "client!ea", name = "a", descriptor = "(II)Ljm;", line = 338)
    public static final class194 method87(int arg0, int arg1) {
        field168++;
        class194 var2 = (class194) class30.field441.method2179(false, (long) arg0);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class189.field2836.method980(31, arg0, 5);
        class194 var4 = new class194();
        if (var3 != null) {
            var4.method1379(0, new class166(var3), arg0);
        }
        if (arg1 <= 46) {
            field165 = (class289) null;
        }
        class30.field441.method2173(var4, true, (long) arg0);
        return var4;
    }

    @OriginalMember(owner = "client!ea", name = "b", descriptor = "(I)V", line = 367)
    public static void method88(int arg0) {
        field171 = null;
        field166 = null;
        if (arg0 == -11082) {
            field177 = null;
            field165 = null;
        }
    }
}
