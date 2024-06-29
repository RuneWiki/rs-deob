import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class72 {

    @OriginalMember(owner = "client!ph", name = "h", descriptor = "Loe;")
    private class120 field1331 = new class120(256);

    @OriginalMember(owner = "client!ph", name = "s", descriptor = "Loe;")
    private class120 field1342 = new class120(256);

    @OriginalMember(owner = "client!ph", name = "q", descriptor = "Ldj;")
    private class314 field1340;

    @OriginalMember(owner = "client!ph", name = "l", descriptor = "Ldj;")
    private class314 field1335;

    @OriginalMember(owner = "client!ph", name = "c", descriptor = "Lmh;")
    public static class128 field1326 = class22.method156(125, "(U0a )2 via: ");

    @OriginalMember(owner = "client!ph", name = "k", descriptor = "Lmh;")
    public static class128 field1334 = class22.method156(123, "Verbindung mit Update)2Server)3)3)3");

    @OriginalMember(owner = "client!ph", name = "p", descriptor = "Lmh;")
    public static class128 field1339 = class22.method156(122, "null");

    @OriginalMember(owner = "client!ph", name = "u", descriptor = "Lmh;")
    private static class128 field1344 = class22.method156(122, "Loading config )2 ");

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "Lmh;")
    public static class128 field1324 = field1344;

    @OriginalMember(owner = "client!ph", name = "v", descriptor = "I")
    public static int field1345 = 0;

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "I")
    public static int field1325;

    @OriginalMember(owner = "client!ph", name = "d", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!ph", name = "f", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!ph", name = "g", descriptor = "I")
    public static int field1330;

    @OriginalMember(owner = "client!ph", name = "i", descriptor = "I")
    public static int field1332;

    @OriginalMember(owner = "client!ph", name = "j", descriptor = "I")
    public static int field1333;

    @OriginalMember(owner = "client!ph", name = "m", descriptor = "I")
    public static int field1336;

    @OriginalMember(owner = "client!ph", name = "n", descriptor = "I")
    public static int field1337;

    @OriginalMember(owner = "client!ph", name = "o", descriptor = "I")
    public static int field1338;

    @OriginalMember(owner = "client!ph", name = "r", descriptor = "I")
    public static int field1341;

    @OriginalMember(owner = "client!ph", name = "t", descriptor = "I")
    public static int field1343;

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "Z")
    public static boolean field1328;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIIIIIIIII)V", line = 9)
    public static final void method472(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg7 != -2) {
            return;
        }
        field1336++;
        if (class193.field3335 <= arg3 && arg3 <= class43.field875 && class193.field3335 <= arg2 && arg2 <= class43.field875 && arg0 >= class193.field3335 && arg0 <= class43.field875 && class193.field3335 <= arg1 && arg1 <= class43.field875 && arg8 >= class70.field1315 && class181.field3173 >= arg8 && arg4 >= class70.field1315 && arg4 <= class181.field3173 && class70.field1315 <= arg6 && class181.field3173 >= arg6 && arg5 >= class70.field1315 && arg5 <= class181.field3173) {
            class63.method419(arg8, arg0, arg4, arg9, arg5, arg2, true, arg3, arg6, arg1);
        } else {
            class30.method221(arg4, arg2, arg1, arg3, arg9, arg0, arg8, arg6, arg5, 124);
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[III)Lck;", line = 30)
    private final class227 method473(int arg0, int[] arg1, int arg2, int arg3) {
        field1333++;
        int var5 = (arg0 >>> 12 | (arg0 & 0x50000FFF) << 4) ^ arg3;
        int var6 = var5 | arg0 << 16;
        long var7 = (long) var6 ^ 0x100000000L;
        class227 var9 = (class227) this.field1342.method728(false, var7);
        if (var9 != null) {
            return var9;
        } else if (arg1 == null || arg1[0] > 0) {
            class18 var10 = (class18) this.field1331.method728(false, var7);
            if (var10 == null) {
                var10 = class18.method134(this.field1340, arg0, arg3);
                if (var10 == null) {
                    return null;
                }
                this.field1331.method730(var10, var7, (byte) -102);
            }
            class227 var11 = var10.method144(arg1);
            if (var11 == null) {
                return null;
            } else {
                var10.method1978((byte) 25);
                this.field1342.method730(var11, var7, (byte) 125);
                return arg2 == -221430288 ? var11 : (class227) null;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I)V", line = 74)
    public static final void method474(int arg0) {
        int var1 = arg0;
        field1343++;
        for (int var2 = 0; var2 < 104; var2++) {
            for (int var3 = 0; var3 < 104; var3++) {
                if (class226.method1554(-1, class182.field3184, var3, var2, var1, true)) {
                    var1++;
                }
                if (var1 >= 512) {
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ)V", line = 108)
    public static final void method475(int arg0, boolean arg1) {
        field1330++;
        byte var2;
        byte[][] var3;
        if (class247.field4247 && arg1) {
            var2 = 1;
            var3 = class77.field1422;
        } else {
            var2 = 4;
            var3 = class8.field183;
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; var5++) {
            int var6 = (class226.field3949[var5] >> 8) * 64 - class221.field3889;
            int var7 = (class226.field3949[var5] & 0xFF) * 64 - class4.field72;
            byte[] var8 = var3[var5];
            if (var8 != null) {
                class218.method1503(false);
                class52.method359(var8, class180.field3158, arg1, var6, 0, (class164.field2825 - 6) * 8, var7, (class51.field1010 - 6) * 8);
            }
        }
        if (arg0 >= -99) {
            field1345 = -19;
        }
        for (int var9 = 0; var9 < var4; var9++) {
            int var10 = (class226.field3949[var9] >> 8) * 64 - class221.field3889;
            int var11 = (class226.field3949[var9] & 0xFF) * 64 - class4.field72;
            byte[] var12 = var3[var9];
            if (var12 == null && class51.field1010 < 800) {
                class218.method1503(false);
                for (int var13 = 0; var13 < var2; var13++) {
                    class288.method1985(var10, var11, (byte) 117, 64, var13, 64);
                }
            }
        }
    }

    @OriginalMember(owner = "client!ph", name = "b", descriptor = "(I)V", line = 177)
    public static final void method476(int arg0) {
        class293.field5013 = class98.field1708;
        class64.field1219 = class51.field1012;
        class194.field3391 = class56.field1086;
        class116.field1959 = class171.field2997;
        class177.field3109 = class62.field1176;
        class205.field3615 = class142.field2434;
        class62.field1189 = class26.field580;
        class5.field98 = class297.field5069;
        class177.field3114 = class222.field3905;
        class256.field4400 = class54.field1052;
        class283.field4867 = class203.field3597;
        class241.field4123 = class117.field1985;
        class81.field1461 = class9.field199;
        class63.field1190 = class69.field1299;
        class62.field1186 = class287.field4912;
        class238.field4075 = class223.field3913;
        class196.field3439 = class104.field1782;
        class166.field2846 = class128.field2166;
        int var1 = 51 / ((51 - arg0) / 51);
        class203.field3598 = class65.field1260;
        class17.field489 = class268.field4660;
        class32.field709 = class290.field4964;
        class162.field2771 = class15.field408;
        class178.field3134 = class31.field688;
        class31.field695 = class148.field2558;
        class208.field3650 = class26.field574;
        class165.field2829 = class62.field1180;
        class152.field2616 = class200.field3526;
        class278.field4798 = class262.field4553;
        class169.field2951 = class299.field5095;
        field1338++;
        class301.field5119 = class293.field5017;
        class132.field2291 = class191.field3309;
        class293.field5022 = class98.field1708;
        class64.field1240 = class99.field1718;
        class47.field954 = class194.field3407;
        class301.field5112 = class130.field2268;
        class151.field2600 = class225.field3919;
        class242.field4145 = class315.field5344;
        class112.field1872 = class291.field4970;
        class188.field3254 = class278.field4794;
        class1.field25 = class295.field5042;
        class241.field4113 = class308.field5233;
        class103.field1769 = class57.field1088;
        class226.field3956 = class289.field4957;
        class245.field4187 = class222.field3900;
        class264.field4578 = class77.field1412;
        class130.field2275 = class103.field1773;
        class264.field4584 = class89.field1524;
        class53.field1027 = class298.field5085;
        class268.field4654 = class15.field410;
        class5.field87 = class55.field1059;
        class173.field3026 = class162.field2772;
        class62.field1179 = class264.field4582;
        field1324 = class98.field1706;
        class74.field1395 = class253.field4373;
        class137.field2359 = class57.field1091;
        class64.field1243 = class99.field1718;
        class145.field2497 = class50.field988;
        class58.field1118 = class110.field1862;
        class276.field4777 = class268.field4658;
        class246.field4212 = class216.field3795;
        class198.field3462 = class306.field5212;
        class289.field4954 = class171.field2998;
        class81.field1448 = class97.field1684;
        class188.field3267 = class102.field1754;
        class128.field2218 = class171.field2993;
        class128.field2211 = class58.field1111;
        class108.field1830 = class146.field2501;
        class194.field3419 = class313.field5279;
        class196.field3437 = class30.field669;
        class34.field734 = class181.field3169;
        class125.field2104 = class34.field737;
        class225.field3940 = class71.field1323;
        class9.field206 = class252.field4361;
        class69.field1291 = class7.field148;
        class150.field2564 = class169.field2945;
        class169.field2953 = class212.field3763;
        class248.field4270 = class233.field4023;
        class32.field706 = class260.field4513;
        class161.field2745 = class97.field1669;
        class241.field4117 = class308.field5233;
        class255.field4393 = class104.field1791;
        class293.field5019 = class255.field4390;
        class294.field5034 = class299.field5092;
        class218.field3842 = class199.field3470;
        class66.field1268 = class194.field3359;
        class278.field4792 = class297.field5068;
        class177.field3120 = class103.field1768;
        class253.field4364 = class290.field4962;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IBI)Lck;", line = 532)
    private final class227 method477(int arg0, int[] arg1, byte arg2, int arg3) {
        int var5 = arg0 ^ (arg3 << 4 & 0xFFF9 | arg3 >>> 12);
        int var6 = var5 | arg3 << 16;
        long var7 = (long) var6;
        class227 var9 = (class227) this.field1342.method728(false, var7);
        field1341++;
        if (var9 != null) {
            return var9;
        } else if (arg1 != null && arg1[0] <= 0) {
            return null;
        } else if (arg2 == 62) {
            class25 var10 = class25.method164(this.field1335, arg3, arg0);
            if (var10 == null) {
                return null;
            }
            class227 var11 = var10.method162();
            this.field1342.method730(var11, var7, (byte) 119);
            if (arg1 != null) {
                arg1[0] -= var11.field3960.length;
            }
            return var11;
        } else {
            return (class227) null;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IZ[I)Lck;", line = 567)
    public final class227 method478(int arg0, boolean arg1, int[] arg2) {
        field1325++;
        if (this.field1335.method2152((byte) -110) == 1) {
            return this.method477(arg0, arg2, (byte) 62, 0);
        } else if (this.field1335.method2146((byte) 118, arg0) == 1) {
            return this.method477(0, arg2, (byte) 62, arg0);
        } else {
            if (!arg1) {
                method480(82, -93, -53, (class38) null, 43, -97, 23, 88, 114);
            }
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[IB)Lck;", line = 618)
    public final class227 method479(int arg0, int[] arg1, byte arg2) {
        int var4 = 76 / ((-arg2 - 18) / 52);
        field1332++;
        if (this.field1340.method2152((byte) -125) == 1) {
            return this.method473(0, arg1, -221430288, arg0);
        } else if (this.field1340.method2146((byte) 113, arg0) == 1) {
            return this.method473(arg0, arg1, -221430288, 0);
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IIILcg;IIIII)V", line = 641)
    public static final void method480(int arg0, int arg1, int arg2, class38 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field1329++;
        int var9 = arg0 & 0x3;
        int var10;
        int var11;
        if (var9 == 1 || var9 == 3) {
            var11 = arg3.field778;
            var10 = arg3.field758;
        } else {
            var10 = arg3.field778;
            var11 = arg3.field758;
        }
        int var12;
        int var13;
        if (arg5 + var11 > 104) {
            var12 = arg5 + 1;
            var13 = arg5;
        } else {
            var12 = (var11 + 1 >> 1) + arg5;
            var13 = (var11 >> 1) + arg5;
        }
        int var14;
        int var15;
        if (arg1 + var10 > 104) {
            var14 = arg1;
            var15 = arg1 + 1;
        } else {
            var15 = (var10 + 1 >> 1) + arg1;
            var14 = (var10 >> 1) + arg1;
        }
        int var16 = (arg5 << 7) + (var11 << 6);
        int[][] var17 = class250.field4334[arg2];
        int var18 = var17[var13][var15] + var17[var12][var15] + var17[var12][var14] + var17[var13][var14] >> 2;
        int var19 = (arg1 << 7) + (var10 << 6);
        int var20 = 0;
        if (~arg2 != arg7) {
            int[][] var21 = class250.field4334[0];
            var20 = var18 - (var21[var12][var14] + var21[var13][var14] + var21[var13][var15] + var21[var12][var15] >> 2);
        }
        int[][] var22 = (int[][]) null;
        if (arg2 < 3) {
            var22 = class250.field4334[arg2 + 1];
        }
        class285 var23 = arg3.method262(var18, arg0, (class127) null, var17, false, arg8, var19, -127, var22, var16, true);
        class312.method2128(var23.field4892, var16 - arg4, var20, var19 - arg6);
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "(Ldj;Ldj;)V", line = 762)
    public class72(class314 arg0, class314 arg1) {
        this.field1340 = arg1;
        this.field1335 = arg0;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(Z)V", line = 719)
    public static void method481(boolean arg0) {
        if (!arg0) {
            return;
        }
        field1339 = null;
        field1326 = null;
        field1324 = null;
        field1344 = null;
        field1334 = null;
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(I[Ljava/lang/Object;[J)V", line = 737)
    public static final void method482(int arg0, Object[] arg1, long[] arg2) {
        class210.method1444(arg1, 0, arg2, arg2.length - 1, 0);
        field1337++;
        int var3 = 65 % ((arg0 - 83) / 38);
    }
}
