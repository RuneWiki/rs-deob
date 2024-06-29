import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!og")
public class class252 extends class291 {

    @OriginalMember(owner = "client!og", name = "ab", descriptor = "Ljava/util/Random;")
    public static Random field4502 = new Random();

    @OriginalMember(owner = "client!og", name = "fb", descriptor = "I")
    public static int field4507 = 255;

    @OriginalMember(owner = "client!og", name = "eb", descriptor = "Leg;")
    public static class37 field4506 = class174.method1167("<img=1>", -22);

    @OriginalMember(owner = "client!og", name = "O", descriptor = "I")
    public static int field4490;

    @OriginalMember(owner = "client!og", name = "P", descriptor = "I")
    public static int field4491;

    @OriginalMember(owner = "client!og", name = "Q", descriptor = "I")
    public static int field4492;

    @OriginalMember(owner = "client!og", name = "R", descriptor = "I")
    public static int field4493;

    @OriginalMember(owner = "client!og", name = "S", descriptor = "I")
    public static int field4494;

    @OriginalMember(owner = "client!og", name = "T", descriptor = "I")
    public static int field4495;

    @OriginalMember(owner = "client!og", name = "U", descriptor = "I")
    public static int field4496;

    @OriginalMember(owner = "client!og", name = "W", descriptor = "I")
    public static int field4498;

    @OriginalMember(owner = "client!og", name = "X", descriptor = "I")
    public static int field4499;

    @OriginalMember(owner = "client!og", name = "Z", descriptor = "I")
    public static int field4501;

    @OriginalMember(owner = "client!og", name = "bb", descriptor = "I")
    public static int field4503;

    @OriginalMember(owner = "client!og", name = "db", descriptor = "I")
    public static int field4505;

    @OriginalMember(owner = "client!og", name = "gb", descriptor = "I")
    public static int field4508;

    @OriginalMember(owner = "client!og", name = "ib", descriptor = "I")
    public static int field4510;

    @OriginalMember(owner = "client!og", name = "cb", descriptor = "Leg;")
    public class37 field4504;

    @OriginalMember(owner = "client!og", name = "M", descriptor = "[I")
    public int[] field4489;

    @OriginalMember(owner = "client!og", name = "V", descriptor = "[I")
    public int[] field4497;

    @OriginalMember(owner = "client!og", name = "Y", descriptor = "[I")
    public int[] field4500;

    @OriginalMember(owner = "client!og", name = "hb", descriptor = "[I")
    public int[] field4509;

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(BLva;)V")
    public static final void method1717(byte arg0, class187 arg1) {
        int var2 = class30.field433 >> 2 << 10;
        field4501++;
        int var3 = class24.field349 >> 1;
        byte[][] var4 = new byte[class243.field4368][class118.field2004];
        while (arg1.field3169 < arg1.field3175.length) {
            int var33 = 0;
            boolean var34 = false;
            int var35 = 0;
            if (arg1.method1268(255) == 1) {
                var33 = arg1.method1268(255);
                var35 = arg1.method1268(255);
                var34 = true;
            }
            int var36 = arg1.method1268(255);
            int var37 = arg1.method1268(arg0 ^ 0xFFFFFF26);
            int var38 = var36 * 64 - class13.field205;
            int var39 = class228.field3921 + class118.field2004 - (var37 * 64) - 1;
            if (var38 >= 0 && var39 - 63 >= 0 && var38 + 63 < class243.field4368 && var39 < class118.field2004) {
                for (int var40 = 0; var40 < 64; var40++) {
                    byte[] var41 = var4[var38 + var40];
                    for (int var42 = 0; var42 < 64; var42++) {
                        if (!var34 || var40 >= (var33 * 8) && var40 < var33 * 8 + 8 && var42 >= (var35 * 8) && var35 * 8 + 8 > var42) {
                            var41[var39 - var42] = arg1.method1269(255);
                        }
                    }
                }
            } else if (var34) {
                arg1.field3169 += 64;
            } else {
                arg1.field3169 += 4096;
            }
        }
        int var5 = class243.field4368;
        if (arg0 != -39) {
            field4507 = 38;
        }
        int var6 = class118.field2004;
        int[] var7 = new int[var6];
        int[] var8 = new int[var6];
        int[] var9 = new int[var6];
        int[] var10 = new int[var6];
        int[] var11 = new int[var6];
        for (int var12 = -5; var12 < var5; var12++) {
            for (int var13 = 0; var13 < var6; var13++) {
                int var27 = var12 + 5;
                int var10002;
                if (var5 > var27) {
                    int var28 = var4[var27][var13] & 0xFF;
                    if (var28 > 0) {
                        class185 var29 = class289.method1942(var28 - 1, arg0 + 43);
                        var7[var13] += var29.field3109;
                        var8[var13] += var29.field3104;
                        var9[var13] += var29.field3101;
                        var11[var13] += var29.field3103;
                        var10002 = var10[var13]++;
                    }
                }
                int var30 = var12 - 5;
                if (var30 >= 0) {
                    int var31 = var4[var30][var13] & 0xFF;
                    if (var31 > 0) {
                        class185 var32 = class289.method1942(var31 - 1, arg0 + 43);
                        var7[var13] -= var32.field3109;
                        var8[var13] -= var32.field3104;
                        var9[var13] -= var32.field3101;
                        var11[var13] -= var32.field3103;
                        var10002 = var10[var13]--;
                    }
                }
            }
            if (var12 >= 0) {
                int var14 = 0;
                int var15 = 0;
                int[][] var16 = class265.field4649[var12 >> 6];
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                for (int var20 = -5; var20 < var6; var20++) {
                    int var21 = var20 + 5;
                    if (var21 < var6) {
                        var18 += var10[var21];
                        var17 += var11[var21];
                        var14 += var7[var21];
                        var15 += var8[var21];
                        var19 += var9[var21];
                    }
                    int var22 = var20 - 5;
                    if (var22 >= 0) {
                        var15 -= var8[var22];
                        var19 -= var9[var22];
                        var18 -= var10[var22];
                        var17 -= var11[var22];
                        var14 -= var7[var22];
                    }
                    if (var20 >= 0 && var18 > 0) {
                        int[] var23 = var16[var20 >> 6];
                        int var24 = var17 == 0 ? 0 : class171.method1149(var14 * 256 / var17, 192, var19 / var18, var15 / var18);
                        if (var4[var12][var20] != 0) {
                            if (var23 == null) {
                                var23 = var16[var20 >> 6] = new int[4096];
                            }
                            int var25 = (var24 & 0x7F) + var3;
                            if (var25 < 0) {
                                var25 = 0;
                            } else if (var25 > 127) {
                                var25 = 127;
                            }
                            int var26 = (var24 + var2 & 0xFC00) + (var24 & 0x380) + var25;
                            var23[class96.method626(63, var12) + (class96.method626(63, var20) << 6)] = class76.field1183[class7.method43(var26, 96, (byte) -103)];
                        } else if (var23 != null) {
                            var23[class96.method626(var12, 63) + (class96.method626(63, var20) << 6)] = 0;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(II)I")
    public final int method1718(int arg0, int arg1) {
        field4499++;
        if (this.field4500 == null) {
            return -1;
        }
        if (arg0 != 2134030310) {
            this.field4509 = null;
        }
        for (int var3 = 0; var3 < this.field4500.length; var3++) {
            if (this.field4497[var3] == arg1) {
                return this.field4500[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lva;BI)V")
    private final void method1719(class187 arg0, byte arg1, int arg2) {
        if (arg1 != 120) {
            this.method1719((class187) null, (byte) -96, -47);
        }
        if (arg2 == 1) {
            this.field4504 = arg0.method1253(arg1 ^ 0xFFFFFFF1);
        } else if (arg2 == 2) {
            int var7 = arg0.method1268(arg1 ^ 0x87);
            this.field4500 = new int[var7];
            this.field4497 = new int[var7];
            for (int var8 = 0; var8 < var7; var8++) {
                this.field4500[var8] = arg0.method1244(false);
                int var9 = arg0.method1268(255);
                if (var9 == 0) {
                    this.field4497[var8] = -1;
                } else {
                    this.field4497[var8] = var9;
                }
            }
        } else if (arg2 == 3) {
            int var4 = arg0.method1268(255);
            this.field4509 = new int[var4];
            this.field4489 = new int[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field4509[var5] = arg0.method1244(false);
                int var6 = arg0.method1268(255);
                if (var6 == 0) {
                    this.field4489[var5] = -1;
                } else {
                    this.field4489[var5] = var6;
                }
            }
        }
        field4496++;
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(B)V")
    public static final void method1720(byte arg0) {
        class89.field1422.method1403(45);
        field4493++;
        if (arg0 < 122) {
            method1726(-102, 32, (byte) 115, -110, 69, 61, 91);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Leg;ILeg;ILeg;)V")
    public static final void method1721(class37 arg0, int arg1, class37 arg2, int arg3, class37 arg4) {
        class102.method686(-1, arg4, (byte) 51, arg0, arg1, arg2);
        field4508++;
        if (arg3 < 65) {
            field4507 = -98;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(ILva;)V")
    public static final void method1722(int arg0, class187 arg1) {
        field4505++;
        if (arg0 != 63) {
            field4507 = -124;
        }
        while (true) {
            while (arg1.field3169 < arg1.field3175.length) {
                boolean var2 = false;
                int var3 = 0;
                int var4 = 0;
                if (arg1.method1268(255) == 1) {
                    var3 = arg1.method1268(255);
                    var2 = true;
                    var4 = arg1.method1268(255);
                }
                int var5 = arg1.method1268(255);
                int var6 = arg1.method1268(arg0 ^ 0xC0);
                int var7 = -(var6 * 64) - (-class228.field3921 - (class118.field2004 - 1));
                int var8 = var5 * 64 - class13.field205;
                if (var8 >= 0 && var7 - 63 >= 0 && var8 + 63 < class243.field4368 && class118.field2004 > var7) {
                    int var9 = var7 >> 6;
                    int var10 = var8 >> 6;
                    for (int var11 = 0; var11 < 64; var11++) {
                        for (int var12 = 0; var12 < 64; var12++) {
                            if (!var2 || var11 >= (var3 * 8) && var3 * 8 + 8 > var11 && (var4 * 8) <= var12 && (var4 * 8 + 8) > var12) {
                                int var13 = arg1.method1268(255);
                                if (var13 != 0) {
                                    if ((var13 & 0x1) == 1) {
                                        int var14 = arg1.method1268(255);
                                        if (class186.field3120[var10][var9] == null) {
                                            class186.field3120[var10][var9] = new byte[4096];
                                        }
                                        class186.field3120[var10][var9][(63 - var12 << 6) + var11] = (byte) var14;
                                    }
                                    if ((var13 & 0x2) == 2) {
                                        int var15 = arg1.method1244(false);
                                        if (class107.field1676[var10][var9] == null) {
                                            class107.field1676[var10][var9] = new short[4096];
                                        }
                                        class107.field1676[var10][var9][(63 - var12 << 6) + var11] = (short) var15;
                                    }
                                    if ((var13 & 0x4) == 4) {
                                        int var16 = (arg1.method1268(255) & 0xFF << 16) + ((arg1.method1268(255) & 0xFF) << 8) + (arg1.method1268(arg0 + 192) & 0xFF);
                                        if (class74.field1163[var10][var9] == null) {
                                            class74.field1163[var10][var9] = new int[4096];
                                        }
                                        var16--;
                                        class133 var17 = class178.method1186(var16, 0);
                                        if (var17.field2303 != null) {
                                            var17 = var17.method962(94);
                                            if (var17 == null || var17.field2235 == -1) {
                                                continue;
                                            }
                                        }
                                        class74.field1163[var10][var9][(63 - var12 << 6) + var11] = var17.field2304 + 1;
                                        class83 var18 = new class83();
                                        var18.field1311 = var7;
                                        var18.field1307 = var8;
                                        var18.field1310 = var17.field2235;
                                        class64.field1045.method1574(var18, arg0 ^ 0x3F);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    for (int var19 = 0; var19 < (var2 ? 64 : 4096); var19++) {
                        int var20 = arg1.method1268(255);
                        if (var20 != 0) {
                            if ((var20 & 0x1) == 1) {
                                arg1.field3169++;
                            }
                            if ((var20 & 0x2) == 2) {
                                arg1.field3169 += 2;
                            }
                            if ((var20 & 0x4) == 4) {
                                arg1.field3169 += 3;
                            }
                        }
                    }
                }
            }
            return;
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIIIIIIII)V")
    public static final void method1723(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        field4510++;
        if (class262.method1772(0, arg5)) {
            class223.field3836 = null;
            class274.method1832(arg3, class232.field4000[arg5], arg2, arg8, 4096, arg0, arg1, -1, arg7, arg4);
            if (arg6 >= -7) {
                method1717((byte) 14, (class187) null);
            }
            if (class223.field3836 != null) {
                class274.method1832(class84.field1321, class223.field3836, class190.field3262, arg8, 4096, arg0, arg1, -1412584499, arg7, arg4);
                class223.field3836 = null;
            }
        } else if (arg4 == -1) {
            for (int var9 = 0; var9 < 100; var9++) {
                class154.field2597[var9] = true;
            }
        } else {
            class154.field2597[arg4] = true;
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(BI)V")
    public static final void method1724(byte arg0, int arg1) {
        if (arg0 == 31) {
            field4495++;
            class274 var2 = class166.method1116(3, arg1, true);
            var2.method1840(10000);
        }
    }

    @OriginalMember(owner = "client!og", name = "g", descriptor = "(I)V")
    public static void method1725(int arg0) {
        field4502 = null;
        field4506 = null;
        if (arg0 != 0) {
            method1717((byte) -88, (class187) null);
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(IIBIIII)V")
    public static final void method1726(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, int arg6) {
        field4491++;
        class239.method1638((byte) 82, arg0);
        int var7 = arg0 - arg3;
        int var8 = 0;
        if (var7 < 0) {
            var7 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        int var11 = var7;
        int var12 = -var7;
        int var13 = -1;
        if (arg2 >= -48) {
            return;
        }
        int[] var14 = class210.field3617[arg5];
        int var15 = -1;
        int var16 = arg4 - var7;
        class145.method1010(var16, arg4 - arg0, -25086, arg6, var14);
        int var17 = arg4 + var7;
        class145.method1010(var17, var16, -25086, arg1, var14);
        class145.method1010(arg0 + arg4, var17, -25086, arg6, var14);
        while (var9 > var8) {
            var15 += 2;
            var13 += 2;
            var12 += var15;
            if (var12 >= 0 && var11 >= 1) {
                class270.field4716[var11] = var8;
                var11--;
                var12 -= var11 << 1;
            }
            var10 += var13;
            var8++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                if (var9 < var7) {
                    int[] var18 = class210.field3617[arg5 + var9];
                    int[] var19 = class210.field3617[arg5 - var9];
                    int var20 = class270.field4716[var9];
                    int var21 = arg4 - var8;
                    int var22 = arg4 + var8;
                    int var23 = arg4 - var20;
                    class145.method1010(var23, var21, -25086, arg6, var18);
                    int var24 = arg4 + var20;
                    class145.method1010(var24, var23, -25086, arg1, var18);
                    class145.method1010(var22, var24, -25086, arg6, var18);
                    class145.method1010(var23, var21, -25086, arg6, var19);
                    class145.method1010(var24, var23, -25086, arg1, var19);
                    class145.method1010(var22, var24, -25086, arg6, var19);
                } else {
                    int var25 = arg4 + var8;
                    int[] var26 = class210.field3617[arg5 - var9];
                    int[] var27 = class210.field3617[arg5 + var9];
                    int var28 = arg4 - var8;
                    class145.method1010(var25, var28, -25086, arg6, var27);
                    class145.method1010(var25, var28, -25086, arg6, var26);
                }
            }
            int[] var29 = class210.field3617[arg5 - var8];
            int[] var30 = class210.field3617[arg5 + var8];
            int var31 = arg4 - var9;
            int var32 = arg4 + var9;
            if (var8 < var7) {
                int var33 = var8 <= var11 ? var11 : class270.field4716[var8];
                int var34 = arg4 + var33;
                int var35 = arg4 - var33;
                class145.method1010(var35, var31, -25086, arg6, var30);
                class145.method1010(var34, var35, -25086, arg1, var30);
                class145.method1010(var32, var34, -25086, arg6, var30);
                class145.method1010(var35, var31, -25086, arg6, var29);
                class145.method1010(var34, var35, -25086, arg1, var29);
                class145.method1010(var32, var34, -25086, arg6, var29);
            } else {
                class145.method1010(var32, var31, -25086, arg6, var30);
                class145.method1010(var32, var31, -25086, arg6, var29);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "h", descriptor = "(I)Lni;")
    public static final class195 method1727(int arg0) {
        field4494++;
        int var1 = class224.field3852[0] * class125.field2101[0];
        byte[] var2 = class170.field2848[0];
        int[] var3 = new int[var1];
        if (arg0 >= -84) {
            field4506 = null;
        }
        for (int var4 = 0; var4 < var1; var4++) {
            var3[var4] = class262.field4617[class96.method626(var2[var4], 255)];
        }
        class195 var5 = new class195(class257.field4567, class126.field2118, class249.field4476[0], class158.field2636[0], class224.field3852[0], class125.field2101[0], var3);
        class5.method33(24094);
        return var5;
    }

    @OriginalMember(owner = "client!og", name = "c", descriptor = "(II)I")
    public final int method1728(int arg0, int arg1) {
        field4498++;
        if (this.field4509 == null) {
            return -1;
        }
        if (arg0 != -7028) {
            this.method1718(-24, 78);
        }
        for (int var3 = 0; var3 < this.field4509.length; var3++) {
            if (this.field4489[var3] == arg1) {
                return this.field4509[var3];
            }
        }
        return -1;
    }

    @OriginalMember(owner = "client!og", name = "i", descriptor = "(I)V")
    public final void method1729(int arg0) {
        if (this.field4509 != null) {
            for (int var2 = 0; var2 < this.field4509.length; var2++) {
                this.field4509[var2] = class94.method617(this.field4509[var2], 32768);
            }
        }
        field4490++;
        if (arg0 == 0 && this.field4500 != null) {
            for (int var3 = 0; var3 < this.field4500.length; var3++) {
                this.field4500[var3] = class94.method617(this.field4500[var3], 32768);
            }
        }
    }

    @OriginalMember(owner = "client!og", name = "a", descriptor = "(Lva;B)V")
    public final void method1730(class187 arg0, byte arg1) {
        while (true) {
            int var3 = arg0.method1268(255);
            if (var3 == 0) {
                field4503++;
                int var4 = -113 % ((-arg1 - 17) / 38);
                return;
            }
            this.method1719(arg0, (byte) 120, var3);
        }
    }

    @OriginalMember(owner = "client!og", name = "b", descriptor = "(Z)Lni;")
    public static final class195 method1731(boolean arg0) {
        field4492++;
        int var1 = class224.field3852[0] * class125.field2101[0];
        if (!arg0) {
            field4506 = null;
        }
        byte[] var2 = class170.field2848[0];
        class195 var5;
        if (class242.field4362[0]) {
            int[] var6 = new int[var1];
            byte[] var7 = class99.field1536[0];
            for (int var8 = 0; var8 < var1; var8++) {
                var6[var8] = class94.method617(class96.method626(255, var7[var8]) << 24, class262.field4617[class96.method626(var2[var8], 255)]);
            }
            var5 = new class157(class257.field4567, class126.field2118, class249.field4476[0], class158.field2636[0], class224.field3852[0], class125.field2101[0], var6);
        } else {
            int[] var3 = new int[var1];
            for (int var4 = 0; var4 < var1; var4++) {
                var3[var4] = class262.field4617[class96.method626(var2[var4], 255)];
            }
            var5 = new class195(class257.field4567, class126.field2118, class249.field4476[0], class158.field2636[0], class224.field3852[0], class125.field2101[0], var3);
        }
        class5.method33(24094);
        return var5;
    }
}
