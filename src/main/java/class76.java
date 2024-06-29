import java.io.IOException;
import java.net.Socket;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class76 {

    @OriginalMember(owner = "client!ia", name = "m", descriptor = "I")
    public static int field1413 = 0;

    @OriginalMember(owner = "client!ia", name = "k", descriptor = "Lha;")
    public static class46 field1411 = class271.method1828("sch-Utteln:", -46);

    @OriginalMember(owner = "client!ia", name = "p", descriptor = "Lha;")
    public static class46 field1416 = class271.method1828("T", -46);

    @OriginalMember(owner = "client!ia", name = "f", descriptor = "Lha;")
    public static class46 field1406 = class271.method1828("showingVideoAd", -46);

    @OriginalMember(owner = "client!ia", name = "d", descriptor = "Lha;")
    public static class46 field1404 = class271.method1828("weiss:", -46);

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "I")
    public static int field1426 = 0;

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    public static int field1427 = 0;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "I")
    public static int field1401;

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "I")
    public static int field1402;

    @OriginalMember(owner = "client!ia", name = "e", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!ia", name = "g", descriptor = "I")
    public static int field1407;

    @OriginalMember(owner = "client!ia", name = "h", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!ia", name = "i", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!ia", name = "j", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!ia", name = "l", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!ia", name = "o", descriptor = "I")
    public int field1415;

    @OriginalMember(owner = "client!ia", name = "r", descriptor = "I")
    public static int field1418;

    @OriginalMember(owner = "client!ia", name = "t", descriptor = "I")
    public static int field1420;

    @OriginalMember(owner = "client!ia", name = "u", descriptor = "I")
    public static int field1421;

    @OriginalMember(owner = "client!ia", name = "v", descriptor = "I")
    public static int field1422;

    @OriginalMember(owner = "client!ia", name = "w", descriptor = "I")
    public static int field1423;

    @OriginalMember(owner = "client!ia", name = "y", descriptor = "I")
    public static int field1425;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "J")
    private long field1403;

    @OriginalMember(owner = "client!ia", name = "s", descriptor = "J")
    private long field1419;

    @OriginalMember(owner = "client!ia", name = "q", descriptor = "Z")
    public boolean field1417;

    @OriginalMember(owner = "client!ia", name = "n", descriptor = "[I")
    private int[] field1414;

    @OriginalMember(owner = "client!ia", name = "x", descriptor = "[I")
    private int[] field1424;

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lmi;I)V")
    public static final void method596(class81 arg0, int arg1) {
        field1401++;
        if (arg1 > -15) {
            field1406 = null;
        }
        class269 var2 = (class269) class47.field820.method1601(44, arg0.field1528.method349((byte) 59));
        if (var2 == null) {
            class66.method455((class236) null, arg0, 0, class135.field2450, 0, (class26) null, arg0.field2523[0], arg0.field2517[0]);
        } else {
            var2.method1800(0);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "([BIII)I")
    public static final int method597(byte[] arg0, int arg1, int arg2, int arg3) {
        field1409++;
        int var4 = -1;
        if (arg3 == 3) {
            for (int var5 = arg1; var5 < arg2; var5++) {
                var4 = class73.field1293[(var4 ^ arg0[var5]) & 0xFF] ^ var4 >>> 8;
            }
            return ~var4;
        } else {
            return 21;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(B)V")
    private final void method598(byte arg0) {
        long var2 = this.field1403;
        this.field1403 = -1L;
        long[] var4 = class161.field2846;
        field1418++;
        if (arg0 != -117) {
            field1413 = -62;
        }
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1403 = this.field1403 >>> 8 ^ var4[(int) ((this.field1403 ^ (long) (this.field1414[var5] >> 24)) & 0xFFL)];
            this.field1403 = var4[(int) ((this.field1403 ^ (long) (this.field1414[var5] >> 16)) & 0xFFL)] ^ this.field1403 >>> 8;
            this.field1403 = this.field1403 >>> 8 ^ var4[(int) (((long) (this.field1414[var5] >> 8) ^ this.field1403) & 0xFFL)];
            this.field1403 = this.field1403 >>> 8 ^ var4[(int) ((this.field1403 ^ (long) this.field1414[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1403 = var4[(int) (((long) this.field1424[var6] ^ this.field1403) & 0xFFL)] ^ this.field1403 >>> 8;
        }
        this.field1403 = this.field1403 >>> 8 ^ var4[(int) ((this.field1403 ^ (long) (this.field1417 ? 1 : 0)) & 0xFFL)];
        if (var2 != 0L && this.field1403 != var2) {
            class215.field3815.method85(var2, (byte) -3);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIZLwk;)Lme;")
    public final class36 method599(int arg0, int arg1, int arg2, boolean arg3, class170 arg4) {
        field1425++;
        if (arg3) {
            field1427 = -11;
        }
        long var6 = (long) (arg0 << 16) | (long) arg2 << 32 | (long) arg2;
        class36 var8 = (class36) class17.field250.method86(7961, var6);
        if (var8 == null) {
            class67[] var9 = new class67[2];
            int var10 = 0;
            if (!class6.method23(arg2, -90).method939(-28739) || !class6.method23(arg0, -109).method939(-28739)) {
                return null;
            }
            class67 var11 = class6.method23(arg2, -112).method949((byte) -82);
            if (var11 != null) {
                var9[var10++] = var11;
            }
            class67 var12 = class6.method23(arg0, -113).method949((byte) -112);
            if (var12 != null) {
                var9[var10++] = var12;
            }
            class67 var13 = new class67(var9, var10);
            for (int var14 = 0; var14 < 5; var14++) {
                if (this.field1424[var14] < class8.field122[var14].length) {
                    var13.method480(class171.field3060[var14], class8.field122[var14][this.field1424[var14]]);
                }
                if (this.field1424[var14] < class66.field1121[var14].length) {
                    var13.method480(class108.field2010[var14], class66.field1121[var14][this.field1424[var14]]);
                }
            }
            var8 = var13.method490(64, 768, -50, -10, -50);
            class17.field250.method80(var8, var6, (byte) 67);
        }
        if (arg4 != null) {
            var8 = arg4.method1213(arg1, -65, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(III)V")
    public final void method600(int arg0, int arg1, int arg2) {
        field1420++;
        int var4 = class156.field2789[arg2];
        if (arg1 != 0) {
            field1413 = 82;
        }
        if (this.field1414[var4] != 0 && class6.method23(arg0, -66) != null) {
            this.field1414[var4] = class235.method1595(arg0, Integer.MIN_VALUE);
            this.method598((byte) -117);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(I)V")
    public static void method601(int arg0) {
        field1411 = null;
        field1406 = null;
        field1416 = null;
        int var1 = -91 / ((arg0 + 12) / 51);
        field1404 = null;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BLwg;Z)V")
    public static final void method602(byte arg0, class22 arg1, boolean arg2) {
        field1412++;
        if (arg2) {
            int var3 = class163.field2895;
            int var4 = var3 * 956 / 503;
            class1.field11.method115((class50.field876 - var4) / 2, 0, var4, var3);
            class242.field4292.method1278(class50.field876 / 2 - (class242.field4292.field4628 / 2), 18);
        }
        arg1.method147(class106.field1917, class50.field876 / 2, class163.field2895 / 2 - 26, 16777215, -1);
        int var5 = class163.field2895 / 2 - 18;
        class262.method1769(class50.field876 / 2 - 152, var5, 304, 34, 9179409);
        class262.method1769(class50.field876 / 2 - 151, var5 - -1, 302, 32, 0);
        class262.method1762(class50.field876 / 2 - 150, var5 - -2, class212.field3774 * 3, 30, 9179409);
        class262.method1762(class50.field876 / 2 + (class212.field3774 * 3) - 150, var5 - -2, 300 - class212.field3774 * 3, 30, 0);
        if (arg0 > 107) {
            arg1.method147(class226.field3971, class50.field876 / 2, class163.field2895 / 2 + 4, 16777215, -1);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IILwk;)Lme;")
    public final class36 method603(int arg0, int arg1, class170 arg2) {
        field1405++;
        if (~this.field1415 != arg1) {
            return class156.method1152(this.field1415, (byte) -120).method621((byte) 81, arg0, arg2);
        }
        class36 var4 = (class36) class17.field250.method86(arg1 + 7961, this.field1403);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1414[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((var15 & Integer.MIN_VALUE) != 0 && !class6.method23(var15 & 0x3FFFFFFF, -86).method939(-28739)) {
                        var5 = true;
                    }
                } else if (!class80.method633(var15 & 0x3FFFFFFF, arg1).method509(this.field1417, (byte) 116)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            class67[] var7 = new class67[12];
            int var8 = 0;
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1414[var9];
                if ((var12 & 0x40000000) != 0) {
                    class67 var14 = class80.method633(var12 & 0x3FFFFFFF, 0).method518(1154873067, this.field1417);
                    if (var14 != null) {
                        var7[var8++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class67 var13 = class6.method23(var12 & 0x3FFFFFFF, arg1 - 70).method949((byte) -66);
                    if (var13 != null) {
                        var7[var8++] = var13;
                    }
                }
            }
            class67 var10 = new class67(var7, var8);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class8.field122[var11].length > this.field1424[var11]) {
                    var10.method480(class171.field3060[var11], class8.field122[var11][this.field1424[var11]]);
                }
                if (this.field1424[var11] < class66.field1121[var11].length) {
                    var10.method480(class108.field2010[var11], class66.field1121[var11][this.field1424[var11]]);
                }
            }
            var4 = var10.method490(64, 768, -50, -10, -50);
            class17.field250.method80(var4, this.field1403, (byte) 67);
        }
        if (arg2 != null) {
            var4 = arg2.method1213(arg0, arg1 - 37, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(BZ)V")
    public final void method604(byte arg0, boolean arg1) {
        this.field1417 = arg1;
        field1422++;
        this.method598((byte) -117);
        if (arg0 >= -59) {
            this.method598((byte) 120);
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZI[I[II)V")
    public final void method605(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4) {
        field1421++;
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class265.field4608; var7++) {
                    class118 var8 = class6.method23(var7, 20);
                    if (var8 != null && !var8.field2217 && var8.field2219 == (arg0 ? 7 : 0) + var6) {
                        arg2[class156.field2789[var6]] = class235.method1595(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field1414 = arg2;
        this.field1417 = arg0;
        this.field1424 = arg3;
        this.field1415 = arg1;
        this.method598((byte) -117);
        if (arg4 != 5) {
            field1427 = 39;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIB)V")
    public static final void method606(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        int var5 = -94 / ((arg4 - 75) / 51);
        for (int var6 = 0; var6 < class193.field3473; var6++) {
            if (class175.field3156[var6] + class186.field3336[var6] > arg0 && class175.field3156[var6] < arg0 + arg3 && (class98.field1816[var6] + class51.field894[var6]) > arg1 && class51.field894[var6] < (arg1 + arg2)) {
                class52.field905[var6] = true;
            }
        }
        field1408++;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZII)V")
    public final void method607(boolean arg0, int arg1, int arg2) {
        if (arg0) {
            field1406 = null;
        }
        this.field1424[arg2] = arg1;
        field1410++;
        this.method598((byte) -117);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Z)I")
    public static final int method608(boolean arg0) {
        if (arg0) {
            field1427 = -69;
        }
        field1407++;
        try {
            if ((++class71.field1269) > 1500) {
                throw new IOException();
            }
            if (class75.field1376 == 0) {
                if (class223.method1537(-26619) - 5000L < class275.field4808) {
                    return 0;
                }
                class105.field1880 = class8.field130.method48(class95.field1775, class254.field4457, 0);
                class75.field1376 = 1;
            }
            if (class75.field1376 == 1) {
                if (class105.field1880.field2925 == 2) {
                    throw new IOException();
                }
                if (class105.field1880.field2925 != 1) {
                    return -1;
                }
                class71.field1214 = new class109((Socket) class105.field1880.field2921, class8.field130);
                class58.field967.field1380 = 0;
                class105.field1880 = null;
                int var1 = 0;
                if (class71.field1217) {
                    var1 = class194.field3483;
                }
                class58.field967.method570(226, 15619);
                class58.field967.method581(true, var1);
                class71.field1214.method860(0, class58.field967.field1368, class58.field967.field1380, 87);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 97);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 107);
                }
                int var2 = class71.field1214.method859(-92);
                if (class242.field4293 != null) {
                    class242.field4293.method1141((byte) 103);
                }
                if (class152.field2702 != null) {
                    class152.field2702.method1141((byte) 91);
                }
                if (var2 != 0) {
                    if (class71.field1214 != null) {
                        class71.field1214.method852(5790);
                        class71.field1214 = null;
                    }
                    class66.field1126++;
                    if (class66.field1126 > 4) {
                        class180.method1292(2047);
                        return var2;
                    }
                    class71.field1269 = 0;
                    class75.field1376 = 0;
                    if (class95.field1775 == class263.field4582) {
                        class95.field1775 = class252.field4444;
                    } else {
                        class95.field1775 = class263.field4582;
                    }
                    return -1;
                }
                class75.field1376 = 2;
            }
            if (class75.field1376 == 2) {
                if (class71.field1214.method850((byte) 121) < 2) {
                    return -1;
                }
                class184.field3290 = class71.field1214.method859(33);
                class184.field3290 <<= 0x8;
                class184.field3290 += class71.field1214.method859(119);
                class8.field126 = new byte[class184.field3290];
                class75.field1376 = 3;
            }
            if (class75.field1376 == 3) {
                int var3 = class71.field1214.method850((byte) 121);
                if (var3 < 1) {
                    return -1;
                }
                if ((class184.field3290 - class174.field3120) < var3) {
                    var3 = class184.field3290 - class174.field3120;
                }
                class71.field1214.method854(class8.field126, var3, class174.field3120, 0);
                class174.field3120 += var3;
                if (class184.field3290 > class174.field3120) {
                    return -1;
                }
                int var4 = 0;
                class64.method444(class8.field126, -3372);
                class118.field2213 = new class119[class126.field2314];
                for (int var5 = class122.field2268; var5 <= class161.field2850; var5++) {
                    class119 var6 = class177.method1266(28, var5);
                    if (var6 != null) {
                        class118.field2213[var4++] = var6;
                    }
                }
                class71.field1214.method852(5790);
                class71.field1214 = null;
                class180.method1292(2047);
                class275.field4808 = class223.method1537(-26619);
                return 0;
            }
        } catch (IOException var7) {
            if (class71.field1214 != null) {
                class71.field1214.method852(5790);
                class71.field1214 = null;
            }
            class66.field1126++;
            if (class66.field1126 > 4) {
                class180.method1292(2047);
                return 1000;
            }
            class75.field1376 = 0;
            class71.field1269 = 0;
            if (class95.field1775 == class263.field4582) {
                class95.field1775 = class252.field4444;
            } else {
                class95.field1775 = class263.field4582;
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!ia", name = "b", descriptor = "(I)I")
    public final int method609(int arg0) {
        field1402++;
        int var2 = -8 % ((arg0 - 72) / 54);
        return this.field1415 == -1 ? (this.field1424[4] << 20) + (this.field1424[0] << 25) + ((this.field1414[8] << 10) - -this.field1414[1]) + (this.field1414[11] << 5) + (this.field1414[0] << 15) : class156.method1152(this.field1415, (byte) -121).field1445 + 305419896;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(ZIILwk;Lwk;)Lme;")
    public final class36 method610(boolean arg0, int arg1, int arg2, class170 arg3, class170 arg4) {
        field1423++;
        if (this.field1415 != -1) {
            return class156.method1152(this.field1415, (byte) -122).method616(arg4, arg3, arg2, 0, arg1);
        }
        long var6 = this.field1403;
        int[] var8 = this.field1414;
        if (arg3 != null && (arg3.field3043 >= 0 || arg3.field3034 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1414[var9];
            }
            if (arg3.field3043 >= 0) {
                if (arg3.field3043 == 65535) {
                    var6 ^= 0xFFFFFFFF00000000L;
                    var8[5] = 0;
                } else {
                    var8[5] = class235.method1595(arg3.field3043, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg3.field3034 >= 0) {
                if (arg3.field3034 == 65535) {
                    var8[3] = 0;
                    var6 ^= 0xFFFFFFFFL;
                } else {
                    var8[3] = class235.method1595(1073741824, arg3.field3034);
                    var6 ^= (long) var8[3];
                }
            }
        }
        if (arg0) {
            field1416 = null;
        }
        class36 var10 = (class36) class215.field3815.method86(7961, var6);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class6.method23(var30 & 0x3FFFFFFF, 100).method938((byte) 106)) {
                        var11 = true;
                    }
                } else if (!class80.method633(var30 & 0x3FFFFFFF, 0).method517(this.field1417, 0)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1419 != -1L) {
                    var10 = (class36) class215.field3815.method86(7961, this.field1419);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                class67[] var13 = new class67[12];
                int var14 = 0;
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class67 var28 = class80.method633(var27 & 0x3FFFFFFF, 0).method520(this.field1417, -4070);
                        if (var28 != null) {
                            var13[var14++] = var28;
                        }
                    } else if ((Integer.MIN_VALUE & var27) != 0) {
                        class67 var29 = class6.method23(var27 & 0x3FFFFFFF, 70).method942((byte) 29);
                        if (var29 != null) {
                            var13[var14++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class71 var17 = class80.method633(var16 & 0x3FFFFFFF, 0);
                    if (var17.field1231 != null) {
                        for (int var18 = 0; var18 < var17.field1231.length; var18++) {
                            if (var17.field1231[var18] != null && var13[var18 + 1] != null) {
                                int var19 = var17.field1231[var18][1];
                                int var20 = var17.field1231[var18][0];
                                int var21 = var17.field1231[var18][2];
                                int var22 = var17.field1231[var18][4];
                                int var23 = var17.field1231[var18][3];
                                int var24 = var17.field1231[var18][5];
                                var13[var18 + 1].method462(var20, var19, var21);
                                var13[var18 + 1].method463(var23, var22, var24);
                            }
                        }
                    }
                }
                class67 var25 = new class67(var13, var14);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (this.field1424[var26] < class8.field122[var26].length) {
                        var25.method480(class171.field3060[var26], class8.field122[var26][this.field1424[var26]]);
                    }
                    if (class66.field1121[var26].length > this.field1424[var26]) {
                        var25.method480(class108.field2010[var26], class66.field1121[var26][this.field1424[var26]]);
                    }
                }
                var10 = var25.method490(64, 850, -30, -50, -30);
                class215.field3815.method80(var10, var6, (byte) 67);
                this.field1419 = var6;
            }
        }
        if (arg3 == null && arg4 == null) {
            return var10;
        }
        class36 var31;
        if (arg3 != null && arg4 != null) {
            var31 = arg3.method1207(-7964, arg1, arg4, arg2, var10);
        } else if (arg3 == null) {
            var31 = arg4.method1215(arg2, 1, var10);
        } else {
            var31 = arg3.method1215(arg1, 1, var10);
        }
        return var31;
    }
}
