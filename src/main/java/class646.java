import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class646 extends class623 {

    @OriginalMember(owner = "client!og", name = "E", descriptor = "[I")
    private int[] field9234;

    @OriginalMember(owner = "client!og", name = "v", descriptor = "[I")
    private int[] field9225;

    @OriginalMember(owner = "client!og", name = "B", descriptor = "Lqt;")
    private class634 field9231;

    @OriginalMember(owner = "client!og", name = "L", descriptor = "Lqt;")
    private class634 field9241;

    @OriginalMember(owner = "client!og", name = "w", descriptor = "Lqt;")
    private class634 field9226;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "[Lqt;")
    private class634[] field9242;

    @OriginalMember(owner = "client!og", name = "x", descriptor = "I")
    public static int field9227;

    @OriginalMember(owner = "client!og", name = "y", descriptor = "I")
    public static int field9228;

    @OriginalMember(owner = "client!og", name = "A", descriptor = "I")
    public static int field9230;

    @OriginalMember(owner = "client!og", name = "F", descriptor = "I")
    public static int field9235;

    @OriginalMember(owner = "client!og", name = "G", descriptor = "I")
    public static int field9236;

    @OriginalMember(owner = "client!og", name = "H", descriptor = "I")
    public static int field9237;

    @OriginalMember(owner = "client!og", name = "I", descriptor = "I")
    public static int field9238;

    @OriginalMember(owner = "client!og", name = "J", descriptor = "I")
    public static int field9239;

    @OriginalMember(owner = "client!og", name = "K", descriptor = "I")
    public static int field9240;

    @OriginalMember(owner = "client!og", name = "D", descriptor = "Loh;")
    public static class404 field9233;

    @OriginalMember(owner = "client!og", name = "C", descriptor = "Lfh;")
    public static class649 field9232;

    @OriginalMember(owner = "client!og", name = "z", descriptor = "Z")
    public static boolean field9229;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(I)V")
    public static void method3674(int arg0) {
        int var1 = -76 % ((arg0 + 71) / 55);
        field9233 = null;
        field9232 = null;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ld;ZLoh;III)[F")
    public final float[] method3675(class150 arg0, boolean arg1, class404 arg2, int arg3, int arg4, int arg5) {
        class567.field8073 = arg2;
        field9236++;
        class151.field1662 = arg0;
        for (int var7 = arg3; var7 < this.field9242.length; var7++) {
            this.field9242[var7].method1487(arg5, arg4, (byte) 107);
        }
        class341.method2025(arg4, arg5, (byte) 105);
        float[] var8 = new float[arg5 * 4 * arg4];
        int var9 = 0;
        for (int var10 = 0; var10 < arg5; var10++) {
            int[] var13;
            int[] var14;
            int[] var15;
            if (this.field9241.field9121) {
                int[] var12 = this.field9241.method13((byte) -114, var10);
                var13 = var12;
                var14 = var12;
                var15 = var12;
            } else {
                int[][] var16 = this.field9241.method7((byte) -112, var10);
                var14 = var16[0];
                var13 = var16[1];
                var15 = var16[2];
            }
            int[] var17;
            if (this.field9226.field9121) {
                var17 = this.field9226.method13((byte) -125, var10);
            } else {
                var17 = this.field9226.method7((byte) 37, var10)[0];
            }
            if (arg1) {
                var9 = var10 << 2;
            }
            int[] var18;
            if (this.field9231.field9121) {
                var18 = this.field9231.method13((byte) -75, var10);
            } else {
                var18 = this.field9231.method7((byte) 72, var10)[0];
            }
            for (int var19 = arg4 - 1; var19 >= 0; var19--) {
                float var20 = (float) var17[var19] / 4096.0F;
                float var21 = ((float) var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                if (var20 < 0.0F) {
                    var20 = 0.0F;
                } else if (var20 > 1.0F) {
                    var20 = 1.0F;
                }
                var8[var9++] = (float) var14[var19] * var21;
                var8[var9++] = (float) var13[var19] * var21;
                var8[var9++] = (float) var15[var19] * var21;
                var8[var9++] = var20;
                if (arg1) {
                    var9 += (arg4 << 2) - 4;
                }
            }
        }
        for (int var11 = 0; var11 < this.field9242.length; var11++) {
            this.field9242[var11].method1483((byte) 120);
        }
        return var8;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lmfa;)V")
    public static final void method3676(class614 arg0) {
        if (class275.field3367 >= 65535) {
            return;
        }
        class163 var1 = arg0.field8785;
        class745.field10409[class275.field3367] = arg0;
        class284.field3450[class275.field3367] = false;
        class275.field3367++;
        int var2 = arg0.field8793;
        if (arg0.field8791) {
            var2 = 0;
        }
        int var3 = arg0.field8793;
        if (arg0.field8786) {
            var3 = class723.field10134 - 1;
        }
        for (int var4 = var2; var4 <= var3; var4++) {
            int var5 = 0;
            int var6 = var1.method1013(9179409) + class598.field8523 - var1.method1007(-114) >> class748.field10430;
            if (var6 < 0) {
                var5 -= var6;
                var6 = 0;
            }
            int var7 = var1.method1013(9179409) + var1.method1007(-124) - class598.field8523 >> class748.field10430;
            if (var7 >= class151.field1664) {
                var7 = class151.field1664 - 1;
            }
            for (int var8 = var6; var8 <= var7; var8++) {
                short var9 = arg0.field8795[var5++];
                int var10 = (var1.method1012((byte) 127) + class598.field8523 - var1.method1007(125) >> class748.field10430) + (var9 >>> 8);
                int var11 = (var9 & 0xFF) + var10 - 1;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var11 >= class284.field3473) {
                    var11 = class284.field3473 - 1;
                }
                for (int var12 = var10; var12 <= var11; var12++) {
                    long var13 = class210.field2482[var4][var12][var8];
                    if ((var13 & 0xFFFFL) == 0L) {
                        class210.field2482[var4][var12][var8] = var13 | (long) class275.field3367;
                    } else if ((var13 & 0xFFFF0000L) == 0L) {
                        class210.field2482[var4][var12][var8] = var13 | (long) class275.field3367 << 16;
                    } else if ((var13 & 0xFFFF00000000L) == 0L) {
                        class210.field2482[var4][var12][var8] = var13 | (long) class275.field3367 << 32;
                    } else if ((var13 & 0xFFFF000000000000L) == 0L) {
                        class210.field2482[var4][var12][var8] = var13 | (long) class275.field3367 << 48;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Ld;Loh;B)Z")
    public final boolean method3677(class150 arg0, class404 arg1, byte arg2) {
        field9240++;
        if (class204.field2407 < 0) {
            for (int var4 = 0; var4 < this.field9225.length; var4++) {
                if (!arg1.method2463((byte) 105, this.field9225[var4])) {
                    return false;
                }
            }
        } else {
            for (int var5 = 0; var5 < this.field9225.length; var5++) {
                if (!arg1.method2493(class204.field2407, this.field9225[var5], (byte) -95)) {
                    return false;
                }
            }
        }
        if (arg2 > -52) {
            method3685(-9, false, null);
        }
        for (int var6 = 0; var6 < this.field9234.length; var6++) {
            if (!arg0.method929(15715, this.field9234[var6])) {
                return false;
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIDLoh;BLd;Z)[I")
    public final int[] method3678(int arg0, int arg1, double arg2, class404 arg3, byte arg4, class150 arg5, boolean arg6) {
        class567.field8073 = arg3;
        class151.field1662 = arg5;
        field9227++;
        if (arg4 >= -16) {
            field9232 = null;
        }
        for (int var9 = 0; var9 < this.field9242.length; var9++) {
            this.field9242[var9].method1487(arg1, arg0, (byte) 100);
        }
        class76.method544((byte) -112, arg2);
        class341.method2025(arg0, arg1, (byte) 98);
        int[] var10 = new int[arg0 * arg1];
        int var11 = 0;
        for (int var12 = 0; var12 < arg1; var12++) {
            int[] var15;
            int[] var16;
            int[] var17;
            if (this.field9241.field9121) {
                int[] var18 = this.field9241.method13((byte) -56, var12);
                var17 = var18;
                var16 = var18;
                var15 = var18;
            } else {
                int[][] var14 = this.field9241.method7((byte) -1, var12);
                var15 = var14[0];
                var16 = var14[2];
                var17 = var14[1];
            }
            if (arg6) {
                var11 = var12;
            }
            int[] var19;
            if (this.field9226.field9121) {
                var19 = this.field9226.method13((byte) -81, var12);
            } else {
                var19 = this.field9226.method7((byte) -121, var12)[0];
            }
            for (int var20 = arg0 - 1; var20 >= 0; var20--) {
                int var21 = var15[var20] >> 4;
                if (var21 > 255) {
                    var21 = 255;
                }
                if (var21 < 0) {
                    var21 = 0;
                }
                int var22 = var17[var20] >> 4;
                if (var22 > 255) {
                    var22 = 255;
                }
                if (var22 < 0) {
                    var22 = 0;
                }
                int var23 = var16[var20] >> 4;
                if (var23 > 255) {
                    var23 = 255;
                }
                int var24 = class59.field617[var22];
                if (var23 < 0) {
                    var23 = 0;
                }
                int var25 = class59.field617[var21];
                int var26 = class59.field617[var23];
                int var27;
                if (var25 == 0 && var24 == 0 && var26 == 0) {
                    var27 = 0;
                } else {
                    var27 = var19[var20] >> 4;
                    if (var27 > 255) {
                        var27 = 255;
                    }
                    if (var27 < 0) {
                        var27 = 0;
                    }
                }
                var10[var11++] = (var27 << 24) + (var25 << 16) - (-(var24 << 8) - var26);
                if (arg6) {
                    var11 += arg0 - 1;
                }
            }
        }
        for (int var13 = 0; var13 < this.field9242.length; var13++) {
            this.field9242[var13].method1483((byte) -21);
        }
        return var10;
    }

    @OriginalMember(owner = "client!og", name = "f", descriptor = "(I)V")
    public static final void method3679(int arg0) {
        class682.field9652 = arg0;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static final void method3680(byte arg0) {
        class15.field140 = new String[500];
        class217.field2522 = class740.field10344.field7741 + class740.field10344.field7728 + 2;
        field9237++;
        class529.field7534 = class96.field1014.field7741 + class96.field1014.field7728 + 2;
        for (int var1 = 0; var1 < class15.field140.length; var1++) {
            class15.field140[var1] = "";
        }
        if (arg0 >= 63) {
            class599.method3408(class486.field6899.method2936(class489.field6978, 105), (byte) -36);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(II[BIII[BII)V")
    public static final void method3681(int arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
        if (arg0 <= 83) {
            field9232 = null;
        }
        field9239++;
        int var9 = -(arg1 >> 2);
        int var10 = -(arg1 & 0x3);
        for (int var11 = -arg3; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg8++;
                arg6[var10001] += arg2[arg5++];
                int var14 = arg8++;
                arg6[var14] += arg2[arg5++];
                int var15 = arg8++;
                arg6[var15] += arg2[arg5++];
                int var16 = arg8++;
                arg6[var16] += arg2[arg5++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg8++;
                arg6[var10001] += arg2[arg5++];
            }
            arg5 += arg4;
            arg8 += arg7;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IBIII[BI)V")
    public static final void method3682(int arg0, byte arg1, int arg2, int arg3, int arg4, byte[] arg5, int arg6) {
        field9228++;
        if (arg4 > 0 && !class560.method3273(-3469, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class560.method3273(-3469, arg2)) {
            if (arg1 > -80) {
                method3684(-23);
            }
            int var7 = class99.method688((byte) -52, arg6);
            int var8 = 0;
            int var9 = arg2 > arg4 ? arg4 : arg2;
            int var10 = arg4 >> 1;
            int var11 = arg2 >> 1;
            byte[] var12 = arg5;
            byte[] var13 = new byte[var7 * var10 * var11];
            while (true) {
                OpenGL.glTexImage2Dub(arg3, var8, arg0, arg4, arg2, 0, arg6, 5121, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg4 * var7;
                byte[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            byte var22 = var12[var18];
                            int var23 = var7 + var18;
                            int var24 = var12[var23] + var22;
                            int var25 = var12[var19] + var24;
                            var18 = var7 + var23;
                            int var26 = var7 + var19;
                            int var27 = var12[var26] + var25;
                            var13[var17] = (byte) (var27 >> 2);
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var18 += var14;
                        var19 += var14;
                    }
                }
                var13 = var12;
                arg2 = var11;
                arg4 = var10;
                var12 = var15;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var8++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(DIBZILd;ZLoh;)[I")
    public final int[] method3683(double arg0, int arg1, byte arg2, boolean arg3, int arg4, class150 arg5, boolean arg6, class404 arg7) {
        class151.field1662 = arg5;
        field9230++;
        class567.field8073 = arg7;
        for (int var10 = 0; var10 < this.field9242.length; var10++) {
            this.field9242[var10].method1487(arg1, arg4, (byte) 99);
        }
        if (arg2 != -92) {
            field9232 = null;
        }
        class76.method544((byte) -122, arg0);
        class341.method2025(arg4, arg1, (byte) -97);
        int[] var11 = new int[arg1 * arg4];
        int var12;
        int var13;
        byte var14;
        if (arg3) {
            var12 = -1;
            var13 = arg4 - 1;
            var14 = -1;
        } else {
            var13 = 0;
            var12 = arg4;
            var14 = 1;
        }
        int var15 = 0;
        for (int var16 = 0; var16 < arg1; var16++) {
            if (arg6) {
                var15 = var16;
            }
            int[] var19;
            int[] var20;
            int[] var21;
            if (this.field9241.field9121) {
                int[] var22 = this.field9241.method13((byte) -68, var16);
                var19 = var22;
                var21 = var22;
                var20 = var22;
            } else {
                int[][] var18 = this.field9241.method7((byte) -124, var16);
                var19 = var18[2];
                var20 = var18[1];
                var21 = var18[0];
            }
            for (int var23 = var13; var23 != var12; var23 += var14) {
                int var24 = var21[var23] >> 4;
                if (var24 > 255) {
                    var24 = 255;
                }
                if (var24 < 0) {
                    var24 = 0;
                }
                int var25 = var20[var23] >> 4;
                if (var25 > 255) {
                    var25 = 255;
                }
                if (var25 < 0) {
                    var25 = 0;
                }
                int var26 = var19[var23] >> 4;
                if (var26 > 255) {
                    var26 = 255;
                }
                int var27 = class59.field617[var24];
                if (var26 < 0) {
                    var26 = 0;
                }
                int var28 = class59.field617[var25];
                int var29 = class59.field617[var26];
                int var30 = (var27 << 16) + (var28 << 8) + var29;
                if (var30 != 0) {
                    var30 |= 0xFF000000;
                }
                var11[var15++] = var30;
                if (arg6) {
                    var15 += arg4 - 1;
                }
            }
        }
        for (int var17 = 0; var17 < this.field9242.length; var17++) {
            this.field9242[var17].method1483((byte) -70);
        }
        return var11;
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public static final void method3684(int arg0) {
        if (class287.method1708(2)) {
            if (class15.field140 == null) {
                method3680((byte) 107);
            }
            class687.field9704 = 0;
            class396.field5430 = true;
        }
        field9235++;
        if (arg0 >= -55) {
            field9233 = null;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IZLefa;)V")
    public static final void method3685(int arg0, boolean arg1, class183 arg2) {
        field9238++;
        if (class343.field4449 >= 400) {
            return;
        }
        if (class90.field937 != arg2) {
            String var3;
            if (arg2.field2188 == arg0) {
                boolean var4 = true;
                if (class90.field937.field2152 != -1 && arg2.field2152 != -1) {
                    int var5 = class90.field937.field2174 > arg2.field2174 ? class90.field937.field2174 : arg2.field2174;
                    int var6 = arg2.field2152 > class90.field937.field2152 ? class90.field937.field2152 : arg2.field2152;
                    int var7 = var5 * 10 / 100 + var6 + 5;
                    int var8 = class90.field937.field2174 - arg2.field2174;
                    if (var8 < 0) {
                        var8 = -var8;
                    }
                    if (var8 > var7) {
                        var4 = false;
                    }
                }
                String var9 = class99.field1034 == class15.field130 ? class486.field6934.method2936(class489.field6978, 72) : class486.field6932.method2936(class489.field6978, -101);
                if (arg2.field2189 > arg2.field2174) {
                    var3 = arg2.method1129(true, -2) + (var4 ? class123.method787(class90.field937.field2174, arg2.field2174, (byte) -107) : "<col=ffffff>") + " (" + var9 + arg2.field2174 + "+" + (arg2.field2189 - arg2.field2174) + ")";
                } else {
                    var3 = arg2.method1129(true, -2) + (var4 ? class123.method787(class90.field937.field2174, arg2.field2174, (byte) -105) : "<col=ffffff>") + " (" + var9 + arg2.field2174 + ")";
                }
            } else if (arg2.field2188 == -1) {
                var3 = arg2.method1129(true, -2);
            } else {
                var3 = arg2.method1129(true, -2) + " (" + class486.field6933.method2936(class489.field6978, -110) + arg2.field2188 + ")";
            }
            if (class568.field8075 && !arg1 && (class12.field96 & 0x8) != 0) {
                class723.method4030((long) arg2.field7107, false, -1, false, (long) arg2.field7107, false, 18, class52.field548, 0, 0, true, class192.field2266, class175.field2063 + " -> <col=ffffff>" + var3);
                class205.field2424++;
            }
            if (arg1) {
                class723.method4030((long) arg2.field7107, false, 0, true, 0L, false, -1, "<col=cccccc>" + var3, 0, 0, false, -1, "");
            } else {
                for (int var10 = 7; var10 >= 0; var10--) {
                    if (class471.field6724[var10] != null) {
                        short var11 = 0;
                        if (class99.field1034 == class101.field1048 && class471.field6724[var10].equalsIgnoreCase(class486.field6927.method2936(class489.field6978, arg0 - 96))) {
                            if (arg2.field2174 > class90.field937.field2174) {
                                var11 = 2000;
                            }
                            if (class90.field937.field2167 != 0 && arg2.field2167 != 0) {
                                if (class90.field937.field2167 == arg2.field2167) {
                                    var11 = 2000;
                                } else {
                                    var11 = 0;
                                }
                            }
                        } else if (class663.field9440[var10]) {
                            var11 = 2000;
                        }
                        short var12 = (short) (class201.field2374[var10] + var11);
                        int var13 = class178.field2094[var10] == -1 ? class472.field6761 : class178.field2094[var10];
                        class723.method4030((long) arg2.field7107, false, -1, false, (long) arg2.field7107, false, var12, class471.field6724[var10], 0, 0, true, var13, "<col=ffffff>" + var3);
                        class229.field2669++;
                    }
                }
            }
            if (!arg1) {
                for (class649 var14 = (class649) class265.field3289.method1719(65280); var14 != null; var14 = (class649) class265.field3289.method1723(-20665)) {
                    if (var14.field9270 == 15) {
                        var14.field9280 = "<col=ffffff>" + var3;
                        return;
                    }
                }
            }
        } else if (class568.field8075 && (class12.field96 & 0x10) != 0) {
            class294.field3615++;
            class723.method4030((long) arg2.field7107, false, -1, false, 0L, false, 11, class52.field548, 0, 0, true, class192.field2266, class175.field2063 + " -> <col=ffffff>" + class486.field6941.method2936(class489.field6978, -59));
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lrr;IIIII)V")
    public static final void method3686(class361 arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        boolean var6 = true;
        int var7 = arg2;
        int var8 = arg2 + arg4;
        int var9 = arg3 - 1;
        int var10 = arg3 + arg5;
        for (int var11 = arg1; var11 <= arg1 + 1; var11++) {
            if (class723.field10134 != var11) {
                for (int var12 = var7; var12 <= var8; var12++) {
                    if (var12 >= 0 && var12 < class284.field3473) {
                        for (int var13 = var9; var13 <= var10; var13++) {
                            if (var13 >= 0 && var13 < class151.field1664 && (!var6 || var12 >= var8 || var13 >= var10 || var13 < arg3 && arg2 != var12)) {
                                class691 var14 = class638.field9170[var11][var12][var13];
                                if (var14 != null) {
                                    int var15 = (class504.field7120[var11].method1671(var13, var12, (byte) 108) + class504.field7120[var11].method1671(var13, var12 + 1, (byte) -79) + class504.field7120[var11].method1671(var13 + 1, var12, (byte) 58) + class504.field7120[var11].method1671(var13 + 1, var12 + 1, (byte) 123)) / 4 - (class504.field7120[arg1].method1671(arg3, arg2, (byte) 71) + class504.field7120[arg1].method1671(arg3, arg2 + 1, (byte) -78) + class504.field7120[arg1].method1671(arg3 + 1, arg2, (byte) 54) + class504.field7120[arg1].method1671(arg3 + 1, arg2 + 1, (byte) 90)) / 4;
                                    class492 var16 = var14.field9728;
                                    class492 var17 = var14.field9725;
                                    if (var16 != null && var16.method991(123)) {
                                        arg0.method987(var6, class563.field8026, var16, 0, (var12 - arg2) * class559.field7987 + (1 - arg4) * class598.field8523, (var13 - arg3) * class559.field7987 + (1 - arg5) * class598.field8523, var15);
                                    }
                                    if (var17 != null && var17.method991(-98)) {
                                        arg0.method987(var6, class563.field8026, var17, 0, (var12 - arg2) * class559.field7987 + (1 - arg4) * class598.field8523, (var13 - arg3) * class559.field7987 + (1 - arg5) * class598.field8523, var15);
                                    }
                                    for (class398 var18 = var14.field9739; var18 != null; var18 = var18.field5451) {
                                        class340 var19 = var18.field5449;
                                        if (var19 != null && var19.method991(126) && (var19.field4395 == var12 || var7 == var12) && (var19.field4387 == var13 || var9 == var13)) {
                                            int var20 = var19.field4390 + 1 - var19.field4395;
                                            int var21 = var19.field4402 + 1 - var19.field4387;
                                            arg0.method987(var6, class563.field8026, var19, 0, (var19.field4395 - arg2) * class559.field7987 + (var20 - arg4) * class598.field8523, (var19.field4387 - arg3) * class559.field7987 + (var21 - arg5) * class598.field8523, var15);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
                var7--;
                var6 = false;
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "()V")
    public class646() {
        this.field9234 = new int[0];
        this.field9225 = new int[0];
        this.field9231 = new class519(0);
        this.field9231.field9113 = 1;
        this.field9241 = new class519();
        this.field9241.field9113 = 1;
        this.field9226 = new class519();
        this.field9226.field9113 = 1;
        this.field9242 = new class634[] { this.field9241, this.field9226, this.field9231 };
    }

    @OriginalMember(owner = "client!og", name = "<init>", descriptor = "(Lig;)V")
    public class646(class244 arg0) {
        int var2 = arg0.method1423(-40);
        int var3 = 0;
        int var4 = 0;
        this.field9242 = new class634[var2];
        int[][] var5 = new int[var2][];
        for (int var6 = 0; var6 < var2; var6++) {
            class634 var16 = class631.method3625(arg0, (byte) 102);
            if (var16.method3643(-1) >= 0) {
                var3++;
            }
            if (var16.method1484(119) >= 0) {
                var4++;
            }
            int var17 = var16.field9129.length;
            var5[var6] = new int[var17];
            for (int var18 = 0; var18 < var17; var18++) {
                var5[var6][var18] = arg0.method1423(-13);
            }
            this.field9242[var6] = var16;
        }
        this.field9225 = new int[var3];
        this.field9234 = new int[var4];
        int var7 = 0;
        int var8 = 0;
        for (int var9 = 0; var9 < var2; var9++) {
            class634 var11 = this.field9242[var9];
            int var12 = var11.field9129.length;
            for (int var13 = 0; var13 < var12; var13++) {
                var11.field9129[var13] = this.field9242[var5[var9][var13]];
            }
            int var14 = var11.method3643(-1);
            int var15 = var11.method1484(-76);
            if (var14 > 0) {
                this.field9225[var7++] = var14;
            }
            if (var15 > 0) {
                this.field9234[var8++] = var15;
            }
            var5[var9] = null;
        }
        this.field9241 = this.field9242[arg0.method1423(-124)];
        this.field9226 = this.field9242[arg0.method1423(-100)];
        Object var10 = null;
        this.field9231 = this.field9242[arg0.method1423(-110)];
    }
}
