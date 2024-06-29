import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!se")
public class class87 {

    @OriginalMember(owner = "client!se", name = "n", descriptor = "I")
    public static int field1534 = 0;

    @OriginalMember(owner = "client!se", name = "h", descriptor = "[I")
    public static int[] field1528 = new int[4096];

    @OriginalMember(owner = "client!se", name = "B", descriptor = "Lsb;")
    private static class98 field1548;

    @OriginalMember(owner = "client!se", name = "D", descriptor = "Lsb;")
    public static class98 field1550;

    @OriginalMember(owner = "client!se", name = "E", descriptor = "I")
    public static int field1551;

    @OriginalMember(owner = "client!se", name = "z", descriptor = "[I")
    public static int[] field1546;

    @OriginalMember(owner = "client!se", name = "b", descriptor = "I")
    public static int field1522;

    @OriginalMember(owner = "client!se", name = "d", descriptor = "I")
    public static int field1524;

    @OriginalMember(owner = "client!se", name = "e", descriptor = "I")
    public static int field1525;

    @OriginalMember(owner = "client!se", name = "f", descriptor = "I")
    public static int field1526;

    @OriginalMember(owner = "client!se", name = "g", descriptor = "I")
    public static int field1527;

    @OriginalMember(owner = "client!se", name = "i", descriptor = "I")
    public static int field1529;

    @OriginalMember(owner = "client!se", name = "j", descriptor = "I")
    public static int field1530;

    @OriginalMember(owner = "client!se", name = "l", descriptor = "I")
    public static int field1532;

    @OriginalMember(owner = "client!se", name = "m", descriptor = "I")
    public static int field1533;

    @OriginalMember(owner = "client!se", name = "o", descriptor = "I")
    public int field1535;

    @OriginalMember(owner = "client!se", name = "p", descriptor = "I")
    public static int field1536;

    @OriginalMember(owner = "client!se", name = "q", descriptor = "I")
    public static int field1537;

    @OriginalMember(owner = "client!se", name = "r", descriptor = "I")
    public static int field1538;

    @OriginalMember(owner = "client!se", name = "u", descriptor = "I")
    public static int field1541;

    @OriginalMember(owner = "client!se", name = "v", descriptor = "I")
    public static int field1542;

    @OriginalMember(owner = "client!se", name = "w", descriptor = "I")
    public static int field1543;

    @OriginalMember(owner = "client!se", name = "y", descriptor = "I")
    public static int field1545;

    @OriginalMember(owner = "client!se", name = "t", descriptor = "J")
    private long field1540;

    @OriginalMember(owner = "client!se", name = "x", descriptor = "J")
    private long field1544;

    @OriginalMember(owner = "client!se", name = "k", descriptor = "Z")
    public boolean field1531;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "[I")
    private int[] field1521;

    @OriginalMember(owner = "client!se", name = "c", descriptor = "[I")
    private int[] field1523;

    @OriginalMember(owner = "client!se", name = "C", descriptor = "[I")
    public static int[] field1549;

    @OriginalMember(owner = "client!se", name = "s", descriptor = "[S")
    public static short[] field1539;

    @OriginalMember(owner = "client!se", name = "A", descriptor = "[[[I")
    public static int[][][] field1547;

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lje;IIILje;)Lna;")
    public final class17 method640(class138 arg0, int arg1, int arg2, int arg3, class138 arg4) {
        field1537++;
        if (this.field1535 != -1) {
            return class210.method1414(this.field1535, (byte) 111).method898(true, arg4, arg3, arg0, arg1);
        }
        long var6 = this.field1544;
        int[] var8 = this.field1521;
        if (arg0 != null && (arg0.field2436 >= 0 || arg0.field2453 >= 0)) {
            var8 = new int[12];
            for (int var9 = 0; var9 < 12; var9++) {
                var8[var9] = this.field1521[var9];
            }
            if (arg0.field2436 >= 0) {
                if (arg0.field2436 == 65535) {
                    var8[5] = 0;
                    var6 ^= 0xFFFFFFFF00000000L;
                } else {
                    var8[5] = class67.method471(arg0.field2436, 1073741824);
                    var6 ^= (long) var8[5] << 32;
                }
            }
            if (arg0.field2453 >= 0) {
                if (arg0.field2453 == 65535) {
                    var6 ^= 0xFFFFFFFFL;
                    var8[3] = 0;
                } else {
                    var8[3] = class67.method471(1073741824, arg0.field2453);
                    var6 ^= (long) var8[3];
                }
            }
        }
        class17 var10 = (class17) class144.field2528.method1564(var6, arg2 ^ arg2);
        if (var10 == null) {
            boolean var11 = false;
            for (int var12 = 0; var12 < 12; var12++) {
                int var30 = var8[var12];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class129.method983(3, var30 & 0x3FFFFFFF).method1782(-123)) {
                        var11 = true;
                    }
                } else if (!class235.method1605(arg2 ^ 0xFFFF840E, var30 & 0x3FFFFFFF).method1699((byte) -54, this.field1531)) {
                    var11 = true;
                }
            }
            if (var11) {
                if (this.field1540 != -1L) {
                    var10 = (class17) class144.field2528.method1564(this.field1540, 0);
                }
                if (var10 == null) {
                    return null;
                }
            }
            if (var10 == null) {
                int var13 = 0;
                class240[] var14 = new class240[12];
                for (int var15 = 0; var15 < 12; var15++) {
                    int var27 = var8[var15];
                    if ((var27 & 0x40000000) != 0) {
                        class240 var28 = class235.method1605(arg2 - 31612, var27 & 0x3FFFFFFF).method1705(this.field1531, 11410);
                        if (var28 != null) {
                            var14[var13++] = var28;
                        }
                    } else if ((var27 & Integer.MIN_VALUE) != 0) {
                        class240 var29 = class129.method983(3, var27 & 0x3FFFFFFF).method1781(-73);
                        if (var29 != null) {
                            var14[var13++] = var29;
                        }
                    }
                }
                int var16 = var8[0];
                if ((var16 & 0x40000000) != 0) {
                    class245 var17 = class235.method1605(98, var16 & 0x3FFFFFFF);
                    if (var17.field4284 != null) {
                        for (int var18 = 0; var18 < var17.field4284.length; var18++) {
                            if (var17.field4284[var18] != null && var14[var18 + 1] != null) {
                                int var19 = var17.field4284[var18][0];
                                int var20 = var17.field4284[var18][2];
                                int var21 = var17.field4284[var18][3];
                                int var22 = var17.field4284[var18][4];
                                int var23 = var17.field4284[var18][1];
                                int var24 = var17.field4284[var18][5];
                                var14[var18 + 1].method1645(var19, var23, var20);
                                var14[var18 + 1].method1659(var21, var22, var24);
                            }
                        }
                    }
                }
                class240 var25 = new class240(var14, var13);
                for (int var26 = 0; var26 < 5; var26++) {
                    if (class16.field312[var26].length > this.field1523[var26]) {
                        var25.method1636(class115.field2059[var26], class16.field312[var26][this.field1523[var26]]);
                    }
                    if (this.field1523[var26] < class214.field3646[var26].length) {
                        var25.method1636(class205.field3506[var26], class214.field3646[var26][this.field1523[var26]]);
                    }
                }
                var10 = var25.method1649(64, 850, -30, -50, -30);
                class144.field2528.method1563(var6, arg2 ^ 0x2EB9, var10);
                this.field1540 = var6;
            }
        }
        if (arg0 == null && arg4 == null) {
            return var10;
        }
        class17 var31;
        if (arg0 != null && arg4 != null) {
            var31 = arg0.method1043(arg3, arg1, var10, arg2 - 31554, arg4);
        } else if (arg0 == null) {
            var31 = arg4.method1040(116, arg1, var10);
        } else {
            var31 = arg0.method1040(89, arg3, var10);
        }
        return var31;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Lje;II)Lna;")
    public final class17 method641(class138 arg0, int arg1, int arg2) {
        field1533++;
        if (this.field1535 != -1) {
            return class210.method1414(this.field1535, (byte) 111).method892(0, arg0, arg1);
        }
        class17 var4 = (class17) class224.field3862.method1564(this.field1544, arg2);
        if (var4 == null) {
            boolean var5 = false;
            for (int var6 = 0; var6 < 12; var6++) {
                int var15 = this.field1521[var6];
                if ((var15 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var15) != 0 && !class129.method983(3, var15 & 0x3FFFFFFF).method1784(0)) {
                        var5 = true;
                    }
                } else if (!class235.method1605(110, var15 & 0x3FFFFFFF).method1701(this.field1531, true)) {
                    var5 = true;
                }
            }
            if (var5) {
                return null;
            }
            int var7 = 0;
            class240[] var8 = new class240[12];
            for (int var9 = 0; var9 < 12; var9++) {
                int var12 = this.field1521[var9];
                if ((var12 & 0x40000000) != 0) {
                    class240 var14 = class235.method1605(arg2 ^ 0xFFFFFFA8, var12 & 0x3FFFFFFF).method1692(-22, this.field1531);
                    if (var14 != null) {
                        var8[var7++] = var14;
                    }
                } else if ((var12 & Integer.MIN_VALUE) != 0) {
                    class240 var13 = class129.method983(arg2 + 3, var12 & 0x3FFFFFFF).method1783(107);
                    if (var13 != null) {
                        var8[var7++] = var13;
                    }
                }
            }
            class240 var10 = new class240(var8, var7);
            for (int var11 = 0; var11 < 5; var11++) {
                if (class16.field312[var11].length > this.field1523[var11]) {
                    var10.method1636(class115.field2059[var11], class16.field312[var11][this.field1523[var11]]);
                }
                if (class214.field3646[var11].length > this.field1523[var11]) {
                    var10.method1636(class205.field3506[var11], class214.field3646[var11][this.field1523[var11]]);
                }
            }
            var4 = var10.method1649(64, 768, -50, -10, -50);
            class224.field3862.method1563(this.field1544, arg2 ^ 0x550B, var4);
        }
        if (arg0 != null) {
            var4 = arg0.method1045(arg1, arg2 - 40, var4);
        }
        return var4;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(B)V")
    public static final void method642(byte arg0) {
        int var1 = 9 / ((arg0 - 11) / 50);
        class144.field2528.method1565(-1);
        class224.field3862.method1565(-1);
        field1543++;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIIIIIIZIII)Z")
    public static final boolean method643(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, boolean arg8, int arg9, int arg10, int arg11) {
        field1527++;
        if (arg3 != -2103675568) {
            return true;
        } else if (class163.field2943.field4486 == 2) {
            return class54.method401(arg4, arg7, arg11, arg9, arg5, arg1, arg6, arg8, arg0, arg3 ^ 0x829C7552, arg2, arg10);
        } else if (class163.field2943.field4486 > 2) {
            return class265.method1800(arg5, arg10, arg6, class163.field2943.field4486, arg11, arg4, -15, arg2, arg1, arg8, arg9, arg0, arg7);
        } else {
            return class142.method1061(arg6, arg9, false, arg5, arg7, arg10, arg0, arg2, arg4, arg1, arg11, arg8);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z[I[IIZ)V")
    public final void method644(boolean arg0, int[] arg1, int[] arg2, int arg3, boolean arg4) {
        if (!arg0) {
            return;
        }
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var6 = 0; var6 < 7; var6++) {
                for (int var7 = 0; var7 < class71.field1139; var7++) {
                    class260 var8 = class129.method983(3, var7);
                    if (var8 != null && !var8.field4574 && ((arg4 ? 7 : 0) + var6) == var8.field4576) {
                        arg1[class155.field2827[var6]] = class67.method471(var7, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        field1529++;
        this.field1521 = arg1;
        this.field1523 = arg2;
        this.field1531 = arg4;
        this.field1535 = arg3;
        this.method647((byte) 88);
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIILje;B)Lna;")
    public final class17 method645(int arg0, int arg1, int arg2, class138 arg3, byte arg4) {
        if (arg4 != -111) {
            method653(-123, (class255) null);
        }
        field1524++;
        long var6 = (long) (arg2 << 16) | (long) arg1 << 32 | (long) arg1;
        class17 var8 = (class17) class224.field3862.method1564(var6, 0);
        if (var8 == null) {
            int var9 = 0;
            class240[] var10 = new class240[2];
            if (!class129.method983(3, arg1).method1784(0) || !class129.method983(3, arg2).method1784(arg4 ^ 0xFFFFFF91)) {
                return null;
            }
            class240 var11 = class129.method983(arg4 ^ 0xFFFFFF92, arg1).method1783(72);
            if (var11 != null) {
                var10[var9++] = var11;
            }
            class240 var12 = class129.method983(3, arg2).method1783(89);
            if (var12 != null) {
                var10[var9++] = var12;
            }
            class240 var13 = new class240(var10, var9);
            for (int var14 = 0; var14 < 5; var14++) {
                if (class16.field312[var14].length > this.field1523[var14]) {
                    var13.method1636(class115.field2059[var14], class16.field312[var14][this.field1523[var14]]);
                }
                if (class214.field3646[var14].length > this.field1523[var14]) {
                    var13.method1636(class205.field3506[var14], class214.field3646[var14][this.field1523[var14]]);
                }
            }
            var8 = var13.method1649(64, 768, -50, -10, -50);
            class224.field3862.method1563(var6, 21771, var8);
        }
        if (arg3 != null) {
            var8 = arg3.method1045(arg0, -78, var8);
        }
        return var8;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(IIIII)V")
    public static final void method646(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg1 <= arg3) {
            for (int var5 = arg1; var5 < arg3; var5++) {
                class43.field721[var5][arg0] = arg2;
            }
        } else {
            for (int var6 = arg3; var6 < arg1; var6++) {
                class43.field721[var6][arg0] = arg2;
            }
        }
        if (arg4 >= -6) {
            method648(-26);
        }
        field1538++;
    }

    @OriginalMember(owner = "client!se", name = "b", descriptor = "(B)V")
    private final void method647(byte arg0) {
        field1530++;
        long var2 = this.field1544;
        this.field1544 = -1L;
        long[] var4 = class178.field3085;
        for (int var5 = 0; var5 < 12; var5++) {
            this.field1544 = var4[(int) (((long) (this.field1521[var5] >> 24) ^ this.field1544) & 0xFFL)] ^ this.field1544 >>> 8;
            this.field1544 = this.field1544 >>> 8 ^ var4[(int) ((this.field1544 ^ (long) (this.field1521[var5] >> 16)) & 0xFFL)];
            this.field1544 = this.field1544 >>> 8 ^ var4[(int) ((this.field1544 ^ (long) (this.field1521[var5] >> 8)) & 0xFFL)];
            this.field1544 = this.field1544 >>> 8 ^ var4[(int) ((this.field1544 ^ (long) this.field1521[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field1544 = var4[(int) (((long) this.field1523[var6] ^ this.field1544) & 0xFFL)] ^ this.field1544 >>> 8;
        }
        if (arg0 < 84) {
            this.field1535 = 16;
        }
        this.field1544 = this.field1544 >>> 8 ^ var4[(int) (((long) (this.field1531 ? 1 : 0) ^ this.field1544) & 0xFFL)];
        if (var2 != 0L && this.field1544 != var2) {
            class144.field2528.method1557(var2, 0);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(I)V")
    public static void method648(int arg0) {
        field1528 = null;
        field1539 = null;
        int var1 = 42 / ((21 - arg0) / 58);
        field1546 = null;
        field1550 = null;
        field1549 = null;
        field1547 = null;
        field1548 = null;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(BII)V")
    public final void method649(byte arg0, int arg1, int arg2) {
        if (arg0 > -115) {
            this.method654(true, true);
        }
        field1522++;
        int var4 = class155.field2827[arg2];
        if (this.field1521[var4] != 0 && class129.method983(3, arg1) != null) {
            this.field1521[var4] = class67.method471(arg1, Integer.MIN_VALUE);
            this.method647((byte) 105);
        }
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(III)V")
    public final void method650(int arg0, int arg1, int arg2) {
        this.field1523[arg1] = arg0;
        if (arg2 == 2) {
            this.method647((byte) 89);
            field1545++;
        }
    }

    @OriginalMember(owner = "client!se", name = "c", descriptor = "(B)[Lnj;")
    public static final class82[] method651(byte arg0) {
        if (arg0 != -80) {
            return null;
        }
        class82[] var1 = new class82[class110.field1956];
        for (int var2 = 0; var2 < class110.field1956; var2++) {
            int var3 = class245.field4326[var2] * class164.field2958[var2];
            byte[] var4 = class204.field3491[var2];
            if (class220.field3791[var2]) {
                byte[] var7 = class1.field5[var2];
                int[] var8 = new int[var3];
                for (int var9 = 0; var9 < var3; var9++) {
                    var8[var9] = class67.method471(class214.method1427(255, var7[var9]) << 24, class33.field572[class214.method1427(var4[var9], 255)]);
                }
                var1[var2] = new class179(class144.field2538, class101.field1790, class253.field4422[var2], class9.field207[var2], class245.field4326[var2], class164.field2958[var2], var8);
            } else {
                int[] var5 = new int[var3];
                for (int var6 = 0; var6 < var3; var6++) {
                    var5[var6] = class33.field572[class214.method1427(var4[var6], 255)];
                }
                var1[var2] = new class247(class144.field2538, class101.field1790, class253.field4422[var2], class9.field207[var2], class245.field4326[var2], class164.field2958[var2], var5);
            }
        }
        field1542++;
        class125.method932(true);
        return var1;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(Z)I")
    public final int method652(boolean arg0) {
        field1541++;
        if (!arg0) {
            field1534 = 76;
        }
        return this.field1535 == -1 ? (this.field1523[4] << 20) + (this.field1523[0] << 25) + (this.field1521[0] << 15) + this.field1521[1] - (-(this.field1521[8] << 10) - (this.field1521[11] << 5)) : class210.method1414(this.field1535, (byte) 111).field2151 + 305419896;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ILki;)V")
    public static final void method653(int arg0, class255 arg1) {
        field1526++;
        if (class236.field4071 == arg1.field4515 || arg1.field4503 == -1 || arg1.field4474 != 0 || (arg1.field4483 + 1) > class16.method144(1, arg1.field4503).field2439[arg1.field4502]) {
            int var2 = arg1.field4515 - arg1.field4476;
            int var3 = class236.field4071 - arg1.field4476;
            int var4 = arg1.field4486 * 64 + arg1.field4481 * 128;
            int var5 = arg1.field4500 * 128 + arg1.field4486 * 64;
            int var6 = arg1.field4486 * 64 + arg1.field4473 * 128;
            arg1.field4492 = ((var2 - var3) * var4 + (var3 * var6)) / var2;
            int var7 = arg1.field4493 * 128 + arg1.field4486 * 64;
            arg1.field4466 = ((var2 - var3) * var5 + var3 * var7) / var2;
        }
        arg1.field4459 = 0;
        if (arg1.field4458 == 0) {
            arg1.field4480 = 1024;
        }
        if (arg0 >= -51) {
            field1528 = null;
        }
        if (arg1.field4458 == 1) {
            arg1.field4480 = 1536;
        }
        if (arg1.field4458 == 2) {
            arg1.field4480 = 0;
        }
        if (arg1.field4458 == 3) {
            arg1.field4480 = 512;
        }
        arg1.field4527 = arg1.field4480;
    }

    @OriginalMember(owner = "client!se", name = "a", descriptor = "(ZZ)V")
    public final void method654(boolean arg0, boolean arg1) {
        this.field1531 = arg1;
        field1525++;
        if (!arg0) {
            this.method647((byte) 105);
        }
    }

    static {
        for (int var0 = 0; var0 < 4096; var0++) {
            field1528[var0] = class80.method600((byte) -94, var0);
        }
        field1548 = class47.method368("Checking for updates )2 ", 0);
        field1550 = field1548;
        field1551 = 0;
        field1546 = new int[32768];
    }
}
