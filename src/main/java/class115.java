import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class115 extends class273 {

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "Leg;")
    public static class188 field1790 = new class188(64);

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "[J")
    public static long[] field1792 = new long[100];

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "I")
    public static int field1784;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "I")
    public static int field1785;

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    public static int field1786;

    @OriginalMember(owner = "client!ok", name = "M", descriptor = "I")
    public static int field1787;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    public static int field1788;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "I")
    public static int field1789;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "I")
    public static int field1791;

    @OriginalMember(owner = "client!ok", name = "e", descriptor = "(I)V", line = 5)
    public static final void method791(int arg0) {
        class265.field4095.method2064(arg0 + 127, 163);
        if (arg0 != 128) {
            field1792 = (long[]) null;
        }
        field1787++;
        for (class45 var1 = (class45) class166.field2557.method1549((byte) 102); var1 != null; var1 = (class45) class166.field2557.method1546(-1)) {
            if (var1.field638 == 0) {
                class157.method1095(var1, true, -18772);
            }
        }
        class172.field2618++;
        if (class108.field1674 != null) {
            class277.method1822(4096, class108.field1674);
            class108.field1674 = null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "f", descriptor = "(I)V", line = 35)
    public static void method792(int arg0) {
        if (arg0 >= -87) {
            field1791 = 49;
        }
        field1792 = null;
        field1790 = null;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(II)[I", line = 46)
    public final int[] method331(int arg0, int arg1) {
        if (arg1 != -14650) {
            field1790 = (class188) null;
        }
        field1789++;
        int[] var3 = this.field4204.method365(arg0, 0);
        if (this.field4204.field792) {
            int var4 = class96.field1473[arg0];
            for (int var5 = 0; var5 < class27.field346; var5++) {
                var3[var5] = this.method795(var4, (byte) 68, class151.field2384[var5]) % 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(ZI)V", line = 78)
    public static final void method793(boolean arg0, int arg1) {
        field1788++;
        if (arg1 != 0) {
            return;
        }
        class133.field2098 = arg0;
        if (!class133.field2098) {
            int var2 = class230.field3713.method2030((byte) -70);
            int var3 = class230.field3713.method2053(-21097);
            int var4 = class230.field3713.method2030((byte) -70);
            boolean var5 = class257.method1725(104, class230.field3713.method2053(-21097));
            int var6 = class230.field3713.method2016(2);
            int var7 = class230.field3713.method2030((byte) -70);
            int var8 = (class85.field1284 - class230.field3713.field4679) / 16;
            class142.field2255 = new int[var8][4];
            for (int var9 = 0; var9 < var8; var9++) {
                for (int var10 = 0; var10 < 4; var10++) {
                    class142.field2255[var9][var10] = class230.field3713.method1996(71);
                }
            }
            class188.field2857 = null;
            class121.field1865 = new int[var8];
            class129.field2022 = new int[var8];
            class334.field5191 = new int[var8];
            class305.field4775 = new byte[var8][];
            class204.field3079 = new byte[var8][];
            class151.field2380 = new byte[var8][];
            class184.field2827 = new byte[var8][];
            class314.field4953 = new int[var8];
            class40.field576 = new int[var8];
            int var11 = 0;
            class183.field2811 = (byte[][]) null;
            boolean var12 = false;
            if ((var2 / 8 == 48 || var2 / 8 == 49) && (var4 / 8) == 48) {
                var12 = true;
            }
            if ((var2 / 8) == 48 && var4 / 8 == 148) {
                var12 = true;
            }
            for (int var13 = (var2 - 6) / 8; var13 <= ((var2 + 6) / 8); var13++) {
                for (int var14 = (var4 - 6) / 8; var14 <= (var4 + 6) / 8; var14++) {
                    int var15 = (var13 << 8) + var14;
                    if (var12 && var14 == 49 || var14 == 149 || var14 == 147 || var13 == 50 || !(var13 != 49 || var14 != 47)) {
                        class121.field1865[var11] = var15;
                        class129.field2022[var11] = -1;
                        class334.field5191[var11] = -1;
                        class40.field576[var11] = -1;
                        class314.field4953[var11] = -1;
                    } else {
                        class121.field1865[var11] = var15;
                        class129.field2022[var11] = class297.field4554.method2107("m" + var13 + "_" + var14, (byte) 116);
                        class334.field5191[var11] = class297.field4554.method2107("l" + var13 + "_" + var14, (byte) 125);
                        class40.field576[var11] = class297.field4554.method2107("um" + var13 + "_" + var14, (byte) 119);
                        class314.field4953[var11] = class297.field4554.method2107("ul" + var13 + "_" + var14, (byte) 121);
                    }
                    var11++;
                }
            }
            class227.method1556(var5, var4, -2732, false, var6, var3, var7, var2);
            return;
        }
        int var16 = class230.field3713.method2030((byte) -70);
        boolean var17 = class257.method1725(104, class230.field3713.method2038((byte) -92));
        int var18 = class230.field3713.method2030((byte) -70);
        class230.field3713.method2068((byte) 107);
        for (int var19 = 0; var19 < 4; var19++) {
            for (int var20 = 0; var20 < 13; var20++) {
                for (int var21 = 0; var21 < 13; var21++) {
                    int var22 = class230.field3713.method2072(1, false);
                    if (var22 == 1) {
                        class212.field3362[var19][var20][var21] = class230.field3713.method2072(26, false);
                    } else {
                        class212.field3362[var19][var20][var21] = -1;
                    }
                }
            }
        }
        class230.field3713.method2062(8);
        int var23 = (class85.field1284 - class230.field3713.field4679) / 16;
        class142.field2255 = new int[var23][4];
        for (int var24 = 0; var24 < var23; var24++) {
            for (int var25 = 0; var25 < 4; var25++) {
                class142.field2255[var24][var25] = class230.field3713.method2037((byte) 58);
            }
        }
        int var26 = class230.field3713.method1992(true);
        int var27 = class230.field3713.method2030((byte) -70);
        int var28 = class230.field3713.method2038((byte) -92);
        class151.field2380 = new byte[var23][];
        class40.field576 = new int[var23];
        class314.field4953 = new int[var23];
        class183.field2811 = (byte[][]) null;
        class334.field5191 = new int[var23];
        class129.field2022 = new int[var23];
        class188.field2857 = null;
        class121.field1865 = new int[var23];
        class204.field3079 = new byte[var23][];
        class184.field2827 = new byte[var23][];
        class305.field4775 = new byte[var23][];
        int var29 = 0;
        for (int var30 = 0; var30 < 4; var30++) {
            for (int var31 = 0; var31 < 13; var31++) {
                for (int var32 = 0; var32 < 13; var32++) {
                    int var33 = class212.field3362[var30][var31][var32];
                    if (var33 != -1) {
                        int var34 = var33 >> 14 & 0x3FF;
                        int var35 = (var33 & 0x3FFA) >> 3;
                        int var36 = (var34 / 8 << 8) + var35 / 8;
                        for (int var37 = 0; var37 < var29; var37++) {
                            if (class121.field1865[var37] == var36) {
                                var36 = -1;
                                break;
                            }
                        }
                        if (var36 != -1) {
                            int var38 = var36 >> 8 & 0xFF;
                            class121.field1865[var29] = var36;
                            int var39 = var36 & 0xFF;
                            class129.field2022[var29] = class297.field4554.method2107("m" + var38 + "_" + var39, (byte) 118);
                            class334.field5191[var29] = class297.field4554.method2107("l" + var38 + "_" + var39, (byte) 124);
                            class40.field576[var29] = class297.field4554.method2107("um" + var38 + "_" + var39, (byte) 116);
                            class314.field4953[var29] = class297.field4554.method2107("ul" + var38 + "_" + var39, (byte) 124);
                            var29++;
                        }
                    }
                }
            }
        }
        class227.method1556(var17, var26, -2732, false, var27, var28, var16, var18);
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "()V", line = 330)
    public class115() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIII)Z", line = 334)
    public static final boolean method794(int arg0, int arg1, int arg2, int arg3) {
        if (!class187.method1286(arg0, arg1, arg2)) {
            return false;
        }
        int var4 = arg1 << 7;
        int var5 = arg2 << 7;
        int var6 = client.field2034[arg0][arg1][arg2] - 1;
        int var7 = var6 - 120;
        int var8 = var6 - 230;
        int var9 = var6 - 238;
        if (arg3 < 16) {
            if (arg3 == 1) {
                if (var4 > class343.field5342) {
                    if (!class89.method610(var4, var6, var5)) {
                        return false;
                    }
                    if (!class89.method610(var4, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method610(var4, var7, var5)) {
                        return false;
                    }
                    if (!class89.method610(var4, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class89.method610(var4, var8, var5)) {
                    return false;
                }
                if (!class89.method610(var4, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 2) {
                if (var5 < class246.field3859) {
                    if (!class89.method610(var4, var6, var5 + 128)) {
                        return false;
                    }
                    if (!class89.method610(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method610(var4, var7, var5 + 128)) {
                        return false;
                    }
                    if (!class89.method610(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class89.method610(var4, var8, var5 + 128)) {
                    return false;
                }
                if (!class89.method610(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 4) {
                if (var4 < class343.field5342) {
                    if (!class89.method610(var4 + 128, var6, var5)) {
                        return false;
                    }
                    if (!class89.method610(var4 + 128, var6, var5 + 128)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method610(var4 + 128, var7, var5)) {
                        return false;
                    }
                    if (!class89.method610(var4 + 128, var7, var5 + 128)) {
                        return false;
                    }
                }
                if (!class89.method610(var4 + 128, var8, var5)) {
                    return false;
                }
                if (!class89.method610(var4 + 128, var8, var5 + 128)) {
                    return false;
                }
                return true;
            }
            if (arg3 == 8) {
                if (var5 > class246.field3859) {
                    if (!class89.method610(var4, var6, var5)) {
                        return false;
                    }
                    if (!class89.method610(var4 + 128, var6, var5)) {
                        return false;
                    }
                }
                if (arg0 > 0) {
                    if (!class89.method610(var4, var7, var5)) {
                        return false;
                    }
                    if (!class89.method610(var4 + 128, var7, var5)) {
                        return false;
                    }
                }
                if (!class89.method610(var4, var8, var5)) {
                    return false;
                }
                if (!class89.method610(var4 + 128, var8, var5)) {
                    return false;
                }
                return true;
            }
        }
        if (!class89.method610(var4 + 64, var9, var5 + 64)) {
            return false;
        } else if (arg3 == 16) {
            return class89.method610(var4, var8, var5 + 128);
        } else if (arg3 == 32) {
            return class89.method610(var4 + 128, var8, var5 + 128);
        } else if (arg3 == 64) {
            return class89.method610(var4 + 128, var8, var5);
        } else if (arg3 == 128) {
            return class89.method610(var4, var8, var5);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBI)I", line = 518)
    private final int method795(int arg0, byte arg1, int arg2) {
        field1786++;
        int var4 = arg0 * 57 + arg2;
        if (arg1 != 68) {
            field1791 = 60;
        }
        int var5 = var4 << 1 ^ var4;
        return 4096 - ((Integer.MAX_VALUE & (var5 * 15731 * var5 + 789221) * var5 + 1376312589) / 262144);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IILwf;)Lla;", line = 536)
    public static final class165 method796(int arg0, int arg1, class306 arg2) {
        if (arg0 <= 76) {
            return (class165) null;
        } else {
            field1784++;
            byte[] var3 = arg2.method2102(arg1, 1);
            return var3 == null ? null : new class165(var3);
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IBLjh;)I", line = 552)
    public static final int method797(int arg0, byte arg1, class207 arg2) {
        if (arg1 >= -35) {
            method792(-77);
        }
        field1785++;
        if (arg2.field3222 == null || arg0 >= arg2.field3222.length) {
            return -2;
        }
        try {
            int[] var3 = arg2.field3222[arg0];
            int var4 = 0;
            byte var5 = 0;
            int var6 = 0;
            while (true) {
                int var7 = var3[var6++];
                int var8 = 0;
                byte var9 = 0;
                if (var7 == 0) {
                    return var4;
                }
                if (var7 == 1) {
                    var8 = class314.field4951[var3[var6++]];
                }
                if (var7 == 15) {
                    var9 = 1;
                }
                if (var7 == 2) {
                    var8 = class139.field2156[var3[var6++]];
                }
                if (var7 == 3) {
                    var8 = class205.field3106[var3[var6++]];
                }
                if (var7 == 16) {
                    var9 = 2;
                }
                if (var7 == 17) {
                    var9 = 3;
                }
                if (var7 == 4) {
                    int var10 = var3[var6++] << 16;
                    int var11 = var10 + var3[var6++];
                    class207 var12 = class78.method547(var11, 104);
                    int var13 = var3[var6++];
                    if (var13 != -1 && (!class160.method1106(var13, 120).field4467 || class219.field3484)) {
                        for (int var14 = 0; var14 < var12.field3301.length; var14++) {
                            if ((var13 + 1) == var12.field3301[var14]) {
                                var8 += var12.field3227[var14];
                            }
                        }
                    }
                }
                if (var7 == 5) {
                    var8 = class156.field2442[var3[var6++]];
                }
                if (var7 == 6) {
                    var8 = class79.field1172[class139.field2156[var3[var6++]] - 1];
                }
                if (var7 == 7) {
                    var8 = class156.field2442[var3[var6++]] * 100 / 46875;
                }
                if (var7 == 8) {
                    var8 = class79.field1173.field1236;
                }
                if (var7 == 9) {
                    for (int var15 = 0; var15 < 25; var15++) {
                        if (class33.field413[var15]) {
                            var8 += class139.field2156[var15];
                        }
                    }
                }
                if (var7 == 10) {
                    int var16 = var3[var6++] << 16;
                    int var17 = var16 + var3[var6++];
                    class207 var18 = class78.method547(var17, 116);
                    int var19 = var3[var6++];
                    if (var19 != -1 && (!class160.method1106(var19, 20).field4467 || class219.field3484)) {
                        for (int var20 = 0; var20 < var18.field3301.length; var20++) {
                            if ((var19 + 1) == var18.field3301[var20]) {
                                var8 = 999999999;
                                break;
                            }
                        }
                    }
                }
                if (var7 == 11) {
                    var8 = class158.field2469;
                }
                if (var7 == 12) {
                    var8 = class271.field4167;
                }
                if (var7 == 13) {
                    int var21 = class156.field2442[var3[var6++]];
                    int var22 = var3[var6++];
                    var8 = (0x1 << var22 & var21) == 0 ? 0 : 1;
                }
                if (var7 == 14) {
                    int var23 = var3[var6++];
                    var8 = class165.method1129(-19650, var23);
                }
                if (var7 == 18) {
                    var8 = (class79.field1173.field537 >> 7) + class30.field374;
                }
                if (var7 == 19) {
                    var8 = (class79.field1173.field519 >> 7) + class294.field4535;
                }
                if (var7 == 20) {
                    var8 = var3[var6++];
                }
                if (var9 == 0) {
                    if (var5 == 0) {
                        var4 += var8;
                    }
                    if (var5 == 1) {
                        var4 -= var8;
                    }
                    if (var5 == 2 && var8 != 0) {
                        var4 /= var8;
                    }
                    if (var5 == 3) {
                        var4 *= var8;
                    }
                    var5 = 0;
                } else {
                    var5 = var9;
                }
            }
        } catch (Exception var25) {
            return -1;
        }
    }
}
