import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!m")
public class class196 {

    @OriginalMember(owner = "client!m", name = "p", descriptor = "Z")
    public boolean field2692;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "I")
    public int field2677;

    @OriginalMember(owner = "client!m", name = "n", descriptor = "Lkh;")
    private class75 field2690;

    @OriginalMember(owner = "client!m", name = "r", descriptor = "Luo;")
    private class418 field2694;

    @OriginalMember(owner = "client!m", name = "o", descriptor = "I")
    public int field2691;

    @OriginalMember(owner = "client!m", name = "C", descriptor = "I")
    public int field2705;

    @OriginalMember(owner = "client!m", name = "l", descriptor = "[[[B")
    private byte[][][] field2688;

    @OriginalMember(owner = "client!m", name = "e", descriptor = "[[[B")
    private byte[][][] field2681;

    @OriginalMember(owner = "client!m", name = "t", descriptor = "[[[B")
    private byte[][][] field2696;

    @OriginalMember(owner = "client!m", name = "B", descriptor = "[[[B")
    public byte[][][] field2704;

    @OriginalMember(owner = "client!m", name = "f", descriptor = "[[[B")
    private byte[][][] field2682;

    @OriginalMember(owner = "client!m", name = "E", descriptor = "[[[I")
    public int[][][] field2706;

    @OriginalMember(owner = "client!m", name = "s", descriptor = "I")
    public static int field2695 = -1;

    @OriginalMember(owner = "client!m", name = "k", descriptor = "[I")
    private static int[] field2687 = new int[13];

    @OriginalMember(owner = "client!m", name = "c", descriptor = "I")
    public static int field2679 = 1401;

    @OriginalMember(owner = "client!m", name = "g", descriptor = "Lpn;")
    public static class72 field2683 = new class72(10, -1);

    @OriginalMember(owner = "client!m", name = "F", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field2707 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!m", name = "G", descriptor = "Lec;")
    public static class40 field2708 = new class40("wave2:", "welle2:", "ondulation2:", "onda2:");

    @OriginalMember(owner = "client!m", name = "b", descriptor = "I")
    public static int field2678;

    @OriginalMember(owner = "client!m", name = "d", descriptor = "I")
    public static int field2680;

    @OriginalMember(owner = "client!m", name = "h", descriptor = "I")
    public static int field2684;

    @OriginalMember(owner = "client!m", name = "i", descriptor = "I")
    public static int field2685;

    @OriginalMember(owner = "client!m", name = "j", descriptor = "I")
    public static int field2686;

    @OriginalMember(owner = "client!m", name = "m", descriptor = "I")
    public static int field2689;

    @OriginalMember(owner = "client!m", name = "q", descriptor = "I")
    public static int field2693;

    @OriginalMember(owner = "client!m", name = "u", descriptor = "I")
    public static int field2697;

    @OriginalMember(owner = "client!m", name = "w", descriptor = "I")
    public static int field2699;

    @OriginalMember(owner = "client!m", name = "x", descriptor = "I")
    public static int field2700;

    @OriginalMember(owner = "client!m", name = "y", descriptor = "I")
    public static int field2701;

    @OriginalMember(owner = "client!m", name = "z", descriptor = "I")
    public static int field2702;

    @OriginalMember(owner = "client!m", name = "A", descriptor = "I")
    public static int field2703;

    @OriginalMember(owner = "client!m", name = "v", descriptor = "[[[B")
    public byte[][][] field2698;

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIBI)V", line = 3)
    public final void method1061(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        int var6 = -127 % ((arg3 + 70) / 47);
        for (int var7 = 0; var7 < this.field2691; var7++) {
            this.method1066(arg2, arg4, arg1, arg0, 4, var7);
        }
        field2701++;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB)Ldb;", line = 22)
    public static final class29 method1062(int arg0, byte arg1) {
        if (arg1 != 95) {
            field2687 = null;
        }
        field2686++;
        class29[] var2 = class42.method212(arg1 - 172);
        for (int var3 = 0; var3 < var2.length; var3++) {
            class29 var4 = var2[var3];
            if (var4.field375 == arg0) {
                return var4;
            }
        }
        return null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILoj;[[[I[Lpe;)V", line = 51)
    public final void method1063(int arg0, class280 arg1, int[][][] arg2, class424[] arg3) {
        if (!this.field2692) {
            for (int var5 = 0; var5 < 4; var5++) {
                for (int var6 = 0; var6 < this.field2677; var6++) {
                    for (int var7 = 0; var7 < this.field2705; var7++) {
                        if ((class140.field1686[var5][var6][var7] & 0x1) != 0) {
                            int var8 = var5;
                            if ((class140.field1686[1][var6][var7] & 0x2) != 0) {
                                var8 = var5 - 1;
                            }
                            if (var8 >= 0) {
                                arg3[var8].method2525(var6, 2097152, var7);
                            }
                        }
                    }
                }
            }
        }
        field2678++;
        for (int var9 = arg0; var9 < this.field2691; var9++) {
            int var10 = 0;
            int var11 = 0;
            if (!this.field2692) {
                if (class430.field6225) {
                    var11 |= 0x8;
                }
                if (class392.field5585) {
                    var10 |= 0x2;
                }
                if (class255.field3555 != 0) {
                    var10 |= 0x1;
                    if (var9 == 0 | class173.field2083) {
                        var11 |= 0x10;
                    }
                }
            }
            if (class392.field5585) {
                var11 |= 0x7;
            }
            int[][] var12 = arg2 == null || var9 >= arg2.length ? this.field2706[var9] : arg2[var9];
            class248.method1509(var9, arg1.method1415(this.field2677, this.field2705, this.field2706[var9], var12, 128, var10, var11));
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(BIII[[B[ZLoj;I[[B[[BIILqi;Ltb;)V", line = 142)
    private final void method1064(byte arg0, int arg1, int arg2, int arg3, byte[][] arg4, boolean[] arg5, class280 arg6, int arg7, byte[][] arg8, byte[][] arg9, int arg10, int arg11, class225 arg12, class112 arg13) {
        field2685++;
        if (arg0 != 113) {
            method1075((Object[]) null, 27, 26, -13, (long[]) null);
        }
        if (arg13 != null && arg12 != null || arg12 != null && arg10 == 12 || arg13 != null && arg10 == 0) {
            boolean[] var15 = arg13 != null && arg13.field1381 ? class208.field2880[arg10] : class25.field338[arg10];
            if (arg11 > 0) {
                if (arg3 > 0) {
                    int var16 = arg8[arg3 - 1][arg11 - 1] & 0xFF;
                    if (var16 > 0) {
                        class112 var17 = this.field2690.method383(var16 - 1, (byte) -115);
                        if (var17.field1375 != -1 && var17.field1381) {
                            byte var18 = arg9[arg3 - 1][arg11 - 1];
                            int var19 = arg4[arg3 - 1][arg11 - 1] * 2 + 4 & 0x7;
                            int var20 = class21.method134(var17, arg6, 111);
                            if (class281.field4090[var18][var19]) {
                                field2687[0] = var17.field1375;
                                class218.field3072[0] = var20;
                                class435.field6265[0] = arg6.method1359() ? var17.field1366 : var17.field1378;
                                class206.field2837[0] = var17.field1368;
                                class80.field956[0] = var17.field1362;
                                class52.field685[0] = 256;
                            }
                        }
                    }
                }
                if (arg3 < (arg7 - 1)) {
                    int var21 = arg8[arg3 + 1][arg11 - 1] & 0xFF;
                    if (var21 > 0) {
                        class112 var22 = this.field2690.method383(var21 - 1, (byte) -123);
                        if (var22.field1375 != -1 && var22.field1381) {
                            byte var23 = arg9[arg3 + 1][arg11 - 1];
                            int var24 = (arg4[arg3 + 1][arg11 - 1] * 2) + 6 & 0x7;
                            int var25 = class21.method134(var22, arg6, arg0 ^ 0x1D);
                            if (class281.field4090[var23][var24]) {
                                field2687[2] = var22.field1375;
                                class218.field3072[2] = var25;
                                class435.field6265[2] = arg6.method1359() ? var22.field1366 : var22.field1378;
                                class206.field2837[2] = var22.field1368;
                                class80.field956[2] = var22.field1362;
                                class52.field685[2] = 512;
                            }
                        }
                    }
                }
            }
            if (arg11 < (arg2 - 1)) {
                if (arg3 > 0) {
                    int var26 = arg8[arg3 - 1][arg11 + 1] & 0xFF;
                    if (var26 > 0) {
                        class112 var27 = this.field2690.method383(var26 - 1, (byte) -111);
                        if (var27.field1375 != -1 && var27.field1381) {
                            byte var28 = arg9[arg3 - 1][arg11 + 1];
                            int var29 = arg4[arg3 - 1][arg11 + 1] * 2 + 2 & 0x7;
                            int var30 = class21.method134(var27, arg6, 115);
                            if (class281.field4090[var28][var29]) {
                                field2687[6] = var27.field1375;
                                class218.field3072[6] = var30;
                                class435.field6265[6] = arg6.method1359() ? var27.field1366 : var27.field1378;
                                class206.field2837[6] = var27.field1368;
                                class80.field956[6] = var27.field1362;
                                class52.field685[6] = 64;
                            }
                        }
                    }
                }
                if (arg3 < arg7 - 1) {
                    int var31 = arg8[arg3 + 1][arg11 + 1] & 0xFF;
                    if (var31 > 0) {
                        class112 var32 = this.field2690.method383(var31 - 1, (byte) -116);
                        if (var32.field1375 != -1 && var32.field1381) {
                            byte var33 = arg9[arg3 + 1][arg11 + 1];
                            int var34 = arg4[arg3 + 1][arg11 + 1] * 2 & 0x7;
                            int var35 = class21.method134(var32, arg6, 113);
                            if (class281.field4090[var33][var34]) {
                                field2687[4] = var32.field1375;
                                class218.field3072[4] = var35;
                                class435.field6265[4] = arg6.method1359() ? var32.field1366 : var32.field1378;
                                class206.field2837[4] = var32.field1368;
                                class80.field956[4] = var32.field1362;
                                class52.field685[4] = 128;
                            }
                        }
                    }
                }
            }
            if (arg11 > 0) {
                int var36 = arg8[arg3][arg11 - 1] & 0xFF;
                if (var36 > 0) {
                    class112 var37 = this.field2690.method383(var36 - 1, (byte) -111);
                    if (var37.field1375 != -1) {
                        byte var38 = arg9[arg3][arg11 - 1];
                        byte var39 = arg4[arg3][arg11 - 1];
                        if (var37.field1381) {
                            int var40 = 2;
                            int var41 = var39 * 2 + 4;
                            int var42 = class21.method134(var37, arg6, 122);
                            for (int var43 = 0; var43 < 3; var43++) {
                                var40 &= 0x7;
                                var41 &= 0x7;
                                if (class281.field4090[var38][var41] && var37.field1362 >= class80.field956[var40]) {
                                    field2687[var40] = var37.field1375;
                                    class218.field3072[var40] = var42;
                                    class435.field6265[var40] = arg6.method1359() ? var37.field1366 : var37.field1378;
                                    class206.field2837[var40] = var37.field1368;
                                    if (class80.field956[var40] == var37.field1362) {
                                        class52.field685[var40] = class292.method1841(class52.field685[var40], 32);
                                    } else {
                                        class52.field685[var40] = 32;
                                    }
                                    class80.field956[var40] = var37.field1362;
                                }
                                var40--;
                                var41++;
                            }
                            if (!var15[arg1 & 0x3]) {
                                arg5[0] = class208.field2880[var38][class444.method2618(var39 + 2, 3)];
                            }
                        } else if (!var15[-(-arg1) & 0x3]) {
                            arg5[0] = class25.field338[var38][class444.method2618(var39 + 2, 3)];
                        }
                    }
                }
            }
            if (arg2 - 1 > arg11) {
                int var44 = arg8[arg3][arg11 + 1] & 0xFF;
                if (var44 > 0) {
                    class112 var45 = this.field2690.method383(var44 - 1, (byte) -127);
                    if (var45.field1375 != -1) {
                        byte var46 = arg9[arg3][arg11 + 1];
                        byte var47 = arg4[arg3][arg11 + 1];
                        if (var45.field1381) {
                            int var48 = 4;
                            int var49 = (var47 * 2) + 2;
                            int var50 = class21.method134(var45, arg6, 124);
                            for (int var51 = 0; var51 < 3; var51++) {
                                var48 &= 0x7;
                                var49 &= 0x7;
                                if (class281.field4090[var46][var49] && var45.field1362 >= class80.field956[var48]) {
                                    field2687[var48] = var45.field1375;
                                    class218.field3072[var48] = var50;
                                    class435.field6265[var48] = arg6.method1359() ? var45.field1366 : var45.field1378;
                                    class206.field2837[var48] = var45.field1368;
                                    if (class80.field956[var48] == var45.field1362) {
                                        class52.field685[var48] = class292.method1841(class52.field685[var48], 16);
                                    } else {
                                        class52.field685[var48] = 16;
                                    }
                                    class80.field956[var48] = var45.field1362;
                                }
                                var48++;
                                var49--;
                            }
                            if (!var15[arg1 + 2 & 0x3]) {
                                arg5[2] = class208.field2880[var46][class444.method2618(var47, 3)];
                            }
                        } else if (!var15[arg1 + 2 & 0x3]) {
                            arg5[2] = class25.field338[var46][class444.method2618(3, var47)];
                        }
                    }
                }
            }
            if (arg3 > 0) {
                int var52 = arg8[arg3 - 1][arg11] & 0xFF;
                if (var52 > 0) {
                    class112 var53 = this.field2690.method383(var52 - 1, (byte) -109);
                    if (var53.field1375 != -1) {
                        byte var54 = arg9[arg3 - 1][arg11];
                        byte var55 = arg4[arg3 - 1][arg11];
                        if (var53.field1381) {
                            int var56 = 6;
                            int var57 = var55 * 2 + 4;
                            int var58 = class21.method134(var53, arg6, 109);
                            for (int var59 = 0; var59 < 3; var59++) {
                                var57 &= 0x7;
                                var56 &= 0x7;
                                if (class281.field4090[var54][var57] && var53.field1362 >= class80.field956[var56]) {
                                    field2687[var56] = var53.field1375;
                                    class218.field3072[var56] = var58;
                                    class435.field6265[var56] = arg6.method1359() ? var53.field1366 : var53.field1378;
                                    class206.field2837[var56] = var53.field1368;
                                    if (class80.field956[var56] == var53.field1362) {
                                        class52.field685[var56] = class292.method1841(class52.field685[var56], 8);
                                    } else {
                                        class52.field685[var56] = 8;
                                    }
                                    class80.field956[var56] = var53.field1362;
                                }
                                var57--;
                                var56++;
                            }
                            if (!var15[arg1 + 3 & 0x3]) {
                                arg5[3] = class208.field2880[var54][class444.method2618(var55 + 1, 3)];
                            }
                        } else if (!var15[arg1 + 3 & 0x3]) {
                            arg5[3] = class25.field338[var54][class444.method2618(3, var55 + 1)];
                        }
                    }
                }
            }
            if (arg3 < (arg7 - 1)) {
                int var60 = arg8[arg3 + 1][arg11] & 0xFF;
                if (var60 > 0) {
                    class112 var61 = this.field2690.method383(var60 - 1, (byte) -128);
                    if (var61.field1375 != -1) {
                        byte var62 = arg9[arg3 + 1][arg11];
                        byte var63 = arg4[arg3 + 1][arg11];
                        if (var61.field1381) {
                            int var64 = 4;
                            int var65 = var63 * 2 + 6;
                            int var66 = class21.method134(var61, arg6, 126);
                            for (int var67 = 0; var67 < 3; var67++) {
                                var64 &= 0x7;
                                var65 &= 0x7;
                                if (class281.field4090[var62][var65] && var61.field1362 >= class80.field956[var64]) {
                                    field2687[var64] = var61.field1375;
                                    class218.field3072[var64] = var66;
                                    class435.field6265[var64] = arg6.method1359() ? var61.field1366 : var61.field1378;
                                    class206.field2837[var64] = var61.field1368;
                                    if (class80.field956[var64] == var61.field1362) {
                                        class52.field685[var64] = class292.method1841(class52.field685[var64], 4);
                                    } else {
                                        class52.field685[var64] = 4;
                                    }
                                    class80.field956[var64] = var61.field1362;
                                }
                                var64--;
                                var65++;
                            }
                            if (!var15[arg1 + 1 & 0x3]) {
                                arg5[1] = class208.field2880[var62][class444.method2618(var63 + 3, 3)];
                            }
                        } else if (!var15[arg1 + 1 & 0x3]) {
                            arg5[1] = class25.field338[var62][class444.method2618(3, var63 + 3)];
                        }
                    }
                }
            }
        }
        if (arg13 == null) {
            return;
        }
        int var68 = class21.method134(arg13, arg6, 123);
        if (!arg13.field1381) {
            return;
        }
        for (int var69 = 0; var69 < 8; var69++) {
            int var70 = var69 - (arg1 * 2) & 0x7;
            if (class281.field4090[arg10][var69] && class80.field956[var70] <= arg13.field1362) {
                field2687[var70] = arg13.field1375;
                class218.field3072[var70] = var68;
                class435.field6265[var70] = arg6.method1359() ? arg13.field1366 : arg13.field1378;
                class206.field2837[var70] = arg13.field1368;
                if (class80.field956[var70] == arg13.field1362) {
                    class52.field685[var70] = class292.method1841(class52.field685[var70], 2);
                } else {
                    class52.field685[var70] = 2;
                }
                class80.field956[var70] = arg13.field1362;
            }
        }
        return;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(I)V", line = 610)
    public static void method1065(int arg0) {
        field2708 = null;
        field2687 = null;
        field2707 = null;
        if (arg0 != -2222) {
            field2708 = null;
        }
        field2683 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII)V", line = 624)
    public final void method1066(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        for (int var7 = arg0; var7 < arg0 + arg1; var7++) {
            for (int var10 = arg3; var10 < (arg3 + arg2); var10++) {
                if (var10 >= 0 && var10 < this.field2677 && var7 >= 0 && this.field2705 > var7) {
                    this.field2706[arg5][var10][var7] = arg5 <= 0 ? 0 : this.field2706[arg5 - 1][var10][var7] - 240;
                }
            }
        }
        field2684++;
        if (arg3 > 0 && arg3 < this.field2677) {
            for (int var8 = arg0 + 1; var8 < (arg0 + arg1); var8++) {
                if (var8 >= 0 && this.field2705 > var8) {
                    this.field2706[arg5][arg3][var8] = this.field2706[arg5][arg3 - 1][var8];
                }
            }
        }
        if (arg0 > 0 && this.field2705 > arg0) {
            for (int var9 = arg3 + 1; var9 < (arg2 + arg3); var9++) {
                if (var9 >= 0 && this.field2677 > var9) {
                    this.field2706[arg5][var9][arg0] = this.field2706[arg5][var9][arg0 - 1];
                }
            }
        }
        if (arg4 != 4 || arg3 < 0 || arg0 < 0 || arg3 >= this.field2677 || arg0 >= this.field2705) {
            return;
        }
        if (arg5 == 0) {
            if (arg3 > 0 && this.field2706[arg5][arg3 - 1][arg0] != 0) {
                this.field2706[arg5][arg3][arg0] = this.field2706[arg5][arg3 - 1][arg0];
                return;
            }
            if (arg0 > 0 && this.field2706[arg5][arg3][arg0 - 1] != 0) {
                this.field2706[arg5][arg3][arg0] = this.field2706[arg5][arg3][arg0 - 1];
                return;
            }
            if (arg3 > 0 && arg0 > 0 && this.field2706[arg5][arg3 - 1][arg0 - 1] != 0) {
                this.field2706[arg5][arg3][arg0] = this.field2706[arg5][arg3 - 1][arg0 - 1];
                return;
            }
        } else if (arg3 <= 0 || this.field2706[arg5][arg3 - 1][arg0] == this.field2706[arg5 - 1][arg3 - 1][arg0]) {
            if (arg0 <= 0 || this.field2706[arg5 - 1][arg3][arg0 - 1] == this.field2706[arg5][arg3][arg0 - 1]) {
                if (arg3 > 0 && arg0 > 0 && this.field2706[arg5 - 1][arg3 - 1][arg0 - 1] != this.field2706[arg5][arg3 - 1][arg0 - 1]) {
                    this.field2706[arg5][arg3][arg0] = this.field2706[arg5][arg3 - 1][arg0 - 1];
                    return;
                }
                return;
            }
            this.field2706[arg5][arg3][arg0] = this.field2706[arg5][arg3][arg0 - 1];
        } else {
            this.field2706[arg5][arg3][arg0] = this.field2706[arg5][arg3 - 1][arg0];
            return;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIIII[Lpe;ILvt;I)V", line = 724)
    public final void method1067(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class424[] arg6, int arg7, class179 arg8, int arg9) {
        field2680++;
        int var11 = (arg5 & 0x7) * 8;
        int var12 = (arg3 & 0x7) * 8;
        if (!this.field2692) {
            class424 var13 = arg6[arg0];
            for (int var14 = 0; var14 < 8; var14++) {
                for (int var15 = 0; var15 < 8; var15++) {
                    int var16 = arg7 + class313.method1936(arg9, var15 & 0x7, (byte) -71, var14 & 0x7);
                    int var17 = arg1 + class403.method2404(arg9, var15 & 0x7, var14 & 0x7, (byte) -122);
                    if (var16 > 0 && this.field2677 - 1 > var16 && var17 > 0 && (this.field2705 - 1) > var17) {
                        var13.method2535(-80, var16, var17);
                    }
                }
            }
        }
        int var18 = (arg5 & 0xFFFFFFF8) << 3;
        int var19 = arg3 & 0x1FFFFFF8 << 3;
        byte var20 = 0;
        byte var21 = 0;
        if (arg9 == 1) {
            var21 = 1;
        } else if (arg9 == 2) {
            var21 = 1;
            var20 = 1;
        } else if (arg9 == 3) {
            var20 = 1;
        }
        if (arg2 != -1) {
            field2683 = null;
        }
        for (int var22 = 0; var22 < this.field2691; var22++) {
            for (int var23 = 0; var23 < 64; var23++) {
                for (int var24 = 0; var24 < 64; var24++) {
                    if (arg4 != var22 || var11 > var23 || (var11 + 8) < var23 || var12 > var24 || var24 > var12 + 8) {
                        this.method1073(-1, 0, 0, false, -1, false, 0, 0, arg8, 0, 0);
                    } else if ((var11 + 8) == var23 || var12 + 8 == var24) {
                        int var31;
                        int var32;
                        if (arg9 == 0) {
                            var32 = arg7 + var23 - var11;
                            var31 = var24 + arg1 - var12;
                        } else if (arg9 == 1) {
                            var31 = arg1 + 8 - (-var11 + var23);
                            var32 = var24 + arg7 - var12;
                        } else if (arg9 == 2) {
                            var32 = arg7 + var11 + 8 - var23;
                            var31 = -var24 - (-var12 - arg1 - 8);
                        } else {
                            var32 = var12 - (var24 - arg7 - 8);
                            var31 = arg1 + var23 - var11;
                        }
                        this.method1073(var31, var18 + var23, 0, true, var32, false, 0, arg0, arg8, 0, var19 + var24);
                    } else {
                        int var25 = arg7 + class313.method1936(arg9, var24 & 0x7, (byte) -71, var23 & 0x7);
                        int var26 = arg1 + class403.method2404(arg9, var24 & 0x7, var23 & 0x7, (byte) -122);
                        this.method1073(var26, var18 + var23, arg9, false, var25, false, var20, arg0, arg8, var21, var19 + var24);
                        if (var23 == 63 || var24 == 63) {
                            int var27 = var23 == 63 ? 64 : var23;
                            int var28 = var24 == 63 ? 64 : var24;
                            int var29;
                            int var30;
                            if (arg9 == 0) {
                                var29 = var28 + arg1 - var12;
                                var30 = var27 + arg7 - var11;
                            } else if (arg9 == 1) {
                                var29 = var11 + 8 - (var27 - arg1);
                                var30 = var28 + arg7 - var12;
                            } else if (arg9 == 2) {
                                var29 = arg1 + var12 + 8 - var28;
                                var30 = arg7 + var11 + 8 - var27;
                            } else {
                                var30 = var12 - (var28 - (arg7 + 8));
                                var29 = arg1 + var27 - var11;
                            }
                            if (var30 >= 0 && var30 < this.field2677 && var29 >= 0 && this.field2705 > var29) {
                                this.field2706[arg0][var30][var29] = this.field2706[arg0][var20 + var25][var26 + var21];
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Loj;ILmi;Lmi;)V", line = 909)
    public final void method1068(class280 arg0, int arg1, class443 arg2, class443 arg3) {
        field2693++;
        if (class470.field6629 == null || class470.field6629.length != this.field2705) {
            class470.field6629 = new int[this.field2705];
            class297.field4433 = new int[this.field2705];
            class334.field4780 = new int[this.field2705];
            class372.field5326 = new int[this.field2705];
            class206.field2812 = new int[this.field2705];
        }
        int[][] var5 = new int[this.field2677][this.field2705];
        for (int var6 = 0; var6 < this.field2691; var6++) {
            for (int var8 = 0; var8 < this.field2705; var8++) {
                class470.field6629[var8] = 0;
                class206.field2812[var8] = 0;
                class297.field4433[var8] = 0;
                class372.field5326[var8] = 0;
                class334.field4780[var8] = 0;
            }
            for (int var9 = -5; var9 < this.field2677; var9++) {
                for (int var10 = 0; var10 < this.field2705; var10++) {
                    int var19 = var9 + 5;
                    int var10002;
                    if (this.field2677 > var19) {
                        int var20 = this.field2681[var6][var19][var10] & 0xFF;
                        if (var20 > 0) {
                            class225 var21 = this.field2694.method2488(var20 - 1, 128);
                            class470.field6629[var10] += var21.field3128;
                            class206.field2812[var10] += var21.field3126;
                            class297.field4433[var10] += var21.field3122;
                            class372.field5326[var10] += var21.field3127;
                            var10002 = class334.field4780[var10]++;
                        }
                    }
                    int var22 = var9 - 5;
                    if (var22 >= 0) {
                        int var23 = this.field2681[var6][var22][var10] & 0xFF;
                        if (var23 > 0) {
                            class225 var24 = this.field2694.method2488(var23 - 1, arg1 ^ 0x798A);
                            class470.field6629[var10] -= var24.field3128;
                            class206.field2812[var10] -= var24.field3126;
                            class297.field4433[var10] -= var24.field3122;
                            class372.field5326[var10] -= var24.field3127;
                            var10002 = class334.field4780[var10]--;
                        }
                    }
                }
                if (var9 >= 0) {
                    int var11 = 0;
                    int var12 = 0;
                    int var13 = 0;
                    int var14 = 0;
                    int var15 = 0;
                    for (int var16 = -5; var16 < this.field2705; var16++) {
                        int var17 = var16 + 5;
                        if (this.field2705 > var17) {
                            var11 += class470.field6629[var17];
                            var14 += class372.field5326[var17];
                            var12 += class206.field2812[var17];
                            var13 += class297.field4433[var17];
                            var15 += class334.field4780[var17];
                        }
                        int var18 = var16 - 5;
                        if (var18 >= 0) {
                            var13 -= class297.field4433[var18];
                            var15 -= class334.field4780[var18];
                            var11 -= class470.field6629[var18];
                            var14 -= class372.field5326[var18];
                            var12 -= class206.field2812[var18];
                        }
                        if (var16 >= 0 && var14 > 0 && var15 > 0) {
                            var5[var9][var16] = class178.method874(var13 / var15, var11 * 256 / var14, false, var12 / var15);
                        }
                    }
                }
            }
            if (class288.field4310) {
                this.method1070(var6, arg0, var6 == 0 ? arg2 : null, arg1 ^ 0xFFFF86AC, class398.field5667[var6], var6 == 0 ? arg3 : null, var5);
            } else {
                this.method1071(var6 == 0 ? arg2 : null, arg0, var6, class398.field5667[var6], var5, 0, var6 == 0 ? arg3 : null);
            }
            this.field2681[var6] = null;
            this.field2688[var6] = null;
            this.field2682[var6] = null;
            this.field2696[var6] = null;
        }
        if (!this.field2692) {
            if (class255.field3555 != 0) {
                class218.method1225();
            }
            if (class392.field5585) {
                class403.method2401();
            }
        }
        int var7 = 0;
        if (arg1 != 30986) {
            this.method1061(53, -82, -103, (byte) 103, 10);
        }
        while (this.field2691 > var7) {
            class398.field5667[var7].method1868();
            var7++;
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IB[[I)V", line = 1091)
    public final void method1069(int arg0, byte arg1, int[][] arg2) {
        if (arg1 != 73) {
            this.field2706 = null;
        }
        field2702++;
        int[][] var4 = this.field2706[arg0];
        for (int var5 = 0; var5 < this.field2677 + 1; var5++) {
            for (int var6 = 0; var6 < (this.field2705 + 1); var6++) {
                var4[var5][var6] += arg2[var5][var6];
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(ILoj;Lmi;ILmi;Lmi;[[I)V", line = 1119)
    private final void method1070(int arg0, class280 arg1, class443 arg2, int arg3, class443 arg4, class443 arg5, int[][] arg6) {
        field2697++;
        byte[][] var8 = this.field2682[arg0];
        int var9 = 85 % ((arg3 + 3) / 39);
        byte[][] var10 = this.field2696[arg0];
        byte[][] var11 = this.field2681[arg0];
        byte[][] var12 = this.field2688[arg0];
        for (int var13 = 0; var13 < this.field2677; var13++) {
            int var14 = (this.field2677 - 1) <= var13 ? var13 : var13 + 1;
            for (int var15 = 0; var15 < this.field2705; var15++) {
                int var16 = var15 >= (this.field2705 - 1) ? var15 : var15 + 1;
                if (class110.field1337 == -1 || class216.method1212(var15, var13, arg0, class110.field1337, 0)) {
                    boolean var17 = false;
                    boolean var18 = false;
                    boolean[] var19 = new boolean[4];
                    int var20 = var8[var13][var15];
                    int var21 = var10[var13][var15];
                    int var22 = var12[var13][var15] & 0xFF;
                    int var23 = var11[var13][var15] & 0xFF;
                    int var24 = var11[var13][var16] & 0xFF;
                    int var25 = var11[var14][var16] & 0xFF;
                    int var26 = var11[var14][var15] & 0xFF;
                    if (var22 != 0 || var23 != 0) {
                        class112 var27 = var22 == 0 ? null : this.field2690.method383(var22 - 1, (byte) -107);
                        if (var20 == 0 && var27 == null) {
                            var20 = 12;
                        }
                        class225 var28 = var23 == 0 ? null : this.field2694.method2488(var23 - 1, 128);
                        class112 var29 = var27;
                        if (var27 != null) {
                            if (var27.field1375 == -1 && var27.field1373 == -1) {
                                var29 = var27;
                                var27 = null;
                            } else if (var28 != null && var20 != 0) {
                                var18 = var27.field1381;
                            }
                        }
                        if ((var20 == 0 || var20 == 12) && var13 > 0 && var15 > 0 && this.field2677 > var13 && this.field2705 > var15) {
                            byte var30 = 0;
                            byte var31 = 0;
                            byte var32 = 0;
                            int var33 = var30 + (var11[var13 - 1][var15 - 1] == var23 ? 1 : -1);
                            byte var34 = 0;
                            int var35 = var31 + (var11[var14][var15 - 1] == var23 ? 1 : -1);
                            int var36 = var32 + (var11[var14][var16] == var23 ? 1 : -1);
                            int var37 = var34 + (var11[var13 - 1][var16] == var23 ? 1 : -1);
                            if (var11[var13][var15 - 1] == var23) {
                                var33++;
                                var35++;
                            } else {
                                var35--;
                                var33--;
                            }
                            if (var11[var14][var15] == var23) {
                                var35++;
                                var36++;
                            } else {
                                var35--;
                                var36--;
                            }
                            if (var11[var13][var16] == var23) {
                                var36++;
                                var37++;
                            } else {
                                var36--;
                                var37--;
                            }
                            if (var11[var13 - 1][var15] == var23) {
                                var33++;
                                var37++;
                            } else {
                                var33--;
                                var37--;
                            }
                            int var38 = var33 - var36;
                            if (var38 < 0) {
                                var38 = -var38;
                            }
                            int var39 = var35 - var37;
                            if (var39 < 0) {
                                var39 = -var39;
                            }
                            if (var38 == var39) {
                                var38 = arg4.method1861(var13, var15) - arg4.method1861(var14, var16);
                                var39 = arg4.method1861(var14, var15) - arg4.method1861(var13, var16);
                                if (var38 < 0) {
                                    var38 = -var38;
                                }
                                if (var39 < 0) {
                                    var39 = -var39;
                                }
                            }
                            var21 = var38 < var39 ? 1 : 0;
                        }
                        for (int var40 = 0; var40 < 13; var40++) {
                            class80.field956[var40] = -1;
                            class52.field685[var40] = 1;
                        }
                        boolean[] var41 = var27 != null && var27.field1381 ? class208.field2880[var20] : class25.field338[var20];
                        this.method1064((byte) 113, var21, this.field2705, var13, var10, var19, arg1, this.field2677, var12, var8, var20, var15, var28, var27);
                        boolean var42 = var27 != null && var27.field1375 != var27.field1373;
                        if (!var42) {
                            for (int var43 = 0; var43 < 8; var43++) {
                                if (class80.field956[var43] >= 0 && class218.field3072[var43] != field2687[var43]) {
                                    var42 = true;
                                    break;
                                }
                            }
                        }
                        if (!var41[var21 + 1 & 0x3]) {
                            var19[1] = class479.method2833(var19[1], class444.method2618(class52.field685[4], class52.field685[2]) == 0);
                        }
                        if (!var41[var21 + 3 & 0x3]) {
                            var19[3] = class479.method2833(var19[3], class444.method2618(class52.field685[6], class52.field685[0]) == 0);
                        }
                        if (!var41[var21 & 0x3]) {
                            var19[0] = class479.method2833(var19[0], class444.method2618(class52.field685[0], class52.field685[2]) == 0);
                        }
                        if (!var41[var21 + 2 & 0x3]) {
                            var19[2] = class479.method2833(var19[2], class444.method2618(class52.field685[4], class52.field685[6]) == 0);
                        }
                        if (!var18 && (var20 == 0 || var20 == 12)) {
                            if (var19[0] && !var19[1] && !var19[2] && var19[3]) {
                                var19[0] = var19[3] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 0;
                            } else if (var19[0] && var19[1] && !var19[2] && !var19[3]) {
                                var19[0] = var19[1] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 3;
                            } else if (!var19[0] && var19[1] && var19[2] && !var19[3]) {
                                var19[1] = var19[2] = false;
                                var20 = var20 == 0 ? 13 : 14;
                                var21 = 2;
                            } else if (!var19[0] && !var19[1] && var19[2] && var19[3]) {
                                var19[2] = var19[3] = false;
                                var21 = 1;
                                var20 = var20 == 0 ? 13 : 14;
                            }
                        }
                        boolean var44 = !var18 && !var19[0] && !var19[2] && !var19[1] && !var19[3];
                        int[] var45 = null;
                        int[] var46;
                        int[] var47;
                        int var48;
                        int[] var49;
                        int var50;
                        if (var44) {
                            var50 = var28 == null ? 0 : class20.field274[var20];
                            var46 = class371.field5314[var20];
                            var47 = class169.field2006[var20];
                            var49 = class77.field926[var20];
                            var48 = var27 == null ? 0 : class220.field3079[var20];
                        } else if (var18) {
                            var45 = class413.field5885[var20];
                            var46 = class265.field3816[var20];
                            var48 = var27 == null ? 0 : class471.field6643[var20];
                            var50 = var28 == null ? 0 : class351.field5048[var20];
                            var49 = class140.field1689[var20];
                            var47 = class324.field4674[var20];
                        } else {
                            var46 = class426.field6135[var20];
                            var47 = class270.field3869[var20];
                            var48 = var27 == null ? 0 : class288.field4313[var20];
                            var45 = class453.field6411[var20];
                            var49 = class119.field1488[var20];
                            var50 = var28 == null ? 0 : class42.field510[var20];
                        }
                        int var51 = var48 + var50;
                        if (var51 <= 0) {
                            class31.method159(arg0, var13, var15);
                        } else {
                            if (var19[0]) {
                                var51++;
                            }
                            if (var19[2]) {
                                var51++;
                            }
                            if (var19[1]) {
                                var51++;
                            }
                            if (var19[3]) {
                                var51++;
                            }
                            int var52 = 0;
                            int var53 = 0;
                            int var54 = var51 * 3;
                            int[] var55 = var42 ? new int[var54] : null;
                            int[] var56 = new int[var54];
                            int[] var57 = new int[var54];
                            int[] var58 = new int[var54];
                            int[] var59 = new int[var54];
                            int[] var60 = new int[var54];
                            int[] var61 = arg2 == null ? null : new int[var54];
                            int[] var62 = arg2 == null && arg5 == null ? null : new int[var54];
                            int var63 = -1;
                            int var64 = -1;
                            int var65 = 256;
                            if (var27 != null) {
                                var63 = var27.field1375;
                                var64 = arg1.method1359() ? var27.field1366 : var27.field1378;
                                var65 = var27.field1368;
                                int var66 = class21.method134(var27, arg1, 117);
                                for (int var67 = 0; var67 < var48; var67++) {
                                    boolean var98 = false;
                                    byte var99;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 1;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 1;
                                        class189.field2580[4] = var49[var52];
                                        class189.field2580[5] = var46[var52];
                                        var99 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 5;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 5;
                                        class189.field2580[4] = var49[var52];
                                        class189.field2580[5] = var46[var52];
                                        var99 = 6;
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 3;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 3;
                                        class189.field2580[4] = var49[var52];
                                        var99 = 6;
                                        class189.field2580[5] = var46[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 7;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 7;
                                        class189.field2580[4] = var49[var52];
                                        var99 = 6;
                                        class189.field2580[5] = var46[var52];
                                    } else {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = var49[var52];
                                        class189.field2580[2] = var46[var52];
                                        var99 = 3;
                                    }
                                    for (int var100 = 0; var100 < var99; var100++) {
                                        int var101 = class189.field2580[var100];
                                        int var102 = var101 - (var21 * 2) & 0x7;
                                        int var103 = class319.field4644[var101];
                                        int var104 = class479.field6770[var101];
                                        int var105;
                                        int var106;
                                        if (var21 == 1) {
                                            var105 = 128 - var103;
                                            var106 = var104;
                                        } else if (var21 == 2) {
                                            var105 = 128 - var104;
                                            var106 = 128 - var103;
                                        } else if (var21 == 3) {
                                            var106 = 128 - var104;
                                            var105 = var103;
                                        } else {
                                            var105 = var104;
                                            var106 = var103;
                                        }
                                        var56[var53] = var106;
                                        var57[var53] = var105;
                                        if (var61 != null && class281.field4090[var20][var101]) {
                                            int var107 = (var13 << 7) + var106;
                                            int var108 = (var15 << 7) + var105;
                                            var61[var53] = arg2.method1857(var107, var108) - arg4.method1857(var107, var108);
                                        }
                                        if (var62 != null) {
                                            if (arg2 != null && !class281.field4090[var20][var101]) {
                                                int var109 = (var13 << 7) + var106;
                                                int var110 = (var15 << 7) + var105;
                                                var62[var53] = arg4.method1857(var109, var110) - arg2.method1857(var109, var110);
                                            } else if (arg5 != null && !class84.field1015[var20][var101]) {
                                                int var111 = (var13 << 7) + var106;
                                                int var112 = (var15 << 7) + var105;
                                                var62[var53] = arg5.method1857(var111, var112) - arg4.method1857(var111, var112);
                                            }
                                        }
                                        if (var101 < 8 && class80.field956[var102] > var27.field1362) {
                                            if (var55 != null) {
                                                var55[var53] = class218.field3072[var102];
                                            }
                                            var60[var53] = class206.field2837[var102];
                                            var59[var53] = class435.field6265[var102];
                                            var58[var53] = field2687[var102];
                                        } else {
                                            if (var55 != null) {
                                                var55[var53] = var66;
                                            }
                                            var59[var53] = arg1.method1359() ? var27.field1366 : var27.field1378;
                                            var60[var53] = var27.field1368;
                                            var58[var53] = var63;
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (!this.field2692 && arg0 == 0) {
                                    class463.method2725(var13, var15, var27.field1363, var27.field1364 * 8, var27.field1382);
                                }
                                if (var20 != 12 && var27.field1375 != -1 && var27.field1365) {
                                    var17 = true;
                                }
                            } else if (var44) {
                                var52 += class220.field3079[var20];
                            } else if (var18) {
                                var52 += class471.field6643[var20];
                            } else {
                                var52 += class288.field4313[var20];
                            }
                            if (var28 != null) {
                                if (var26 == 0) {
                                    var26 = var23;
                                }
                                if (var24 == 0) {
                                    var24 = var23;
                                }
                                if (var25 == 0) {
                                    var25 = var23;
                                }
                                class225 var68 = this.field2694.method2488(var23 - 1, 128);
                                class225 var69 = this.field2694.method2488(var24 - 1, 128);
                                class225 var70 = this.field2694.method2488(var25 - 1, 128);
                                class225 var71 = this.field2694.method2488(var26 - 1, 128);
                                for (int var72 = 0; var72 < var50; var72++) {
                                    boolean var73 = false;
                                    byte var74;
                                    if (var19[-var21 & 0x3] && var45[0] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 1;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 1;
                                        class189.field2580[4] = var49[var52];
                                        class189.field2580[5] = var46[var52];
                                        var74 = 6;
                                    } else if (var19[2 - var21 & 0x3] && var45[2] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 5;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 5;
                                        class189.field2580[4] = var49[var52];
                                        var74 = 6;
                                        class189.field2580[5] = var46[var52];
                                    } else if (var19[1 - var21 & 0x3] && var45[1] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 3;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 3;
                                        class189.field2580[4] = var49[var52];
                                        var74 = 6;
                                        class189.field2580[5] = var46[var52];
                                    } else if (var19[3 - var21 & 0x3] && var45[3] == var52) {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = 7;
                                        class189.field2580[2] = var46[var52];
                                        class189.field2580[3] = 7;
                                        class189.field2580[4] = var49[var52];
                                        class189.field2580[5] = var46[var52];
                                        var74 = 6;
                                    } else {
                                        class189.field2580[0] = var47[var52];
                                        class189.field2580[1] = var49[var52];
                                        var74 = 3;
                                        class189.field2580[2] = var46[var52];
                                    }
                                    for (int var75 = 0; var75 < var74; var75++) {
                                        int var76 = class189.field2580[var75];
                                        int var77 = var76 - var21 * 2 & 0x7;
                                        int var78 = class319.field4644[var76];
                                        int var79 = class479.field6770[var76];
                                        int var80;
                                        int var81;
                                        if (var21 == 1) {
                                            var80 = 128 - var78;
                                            var81 = var79;
                                        } else if (var21 == 2) {
                                            var81 = 128 - var78;
                                            var80 = 128 - var79;
                                        } else if (var21 == 3) {
                                            var81 = 128 - var79;
                                            var80 = var78;
                                        } else {
                                            var81 = var78;
                                            var80 = var79;
                                        }
                                        var56[var53] = var81;
                                        var57[var53] = var80;
                                        if (var61 != null && class281.field4090[var20][var76]) {
                                            int var82 = (var13 << 7) + var81;
                                            int var83 = (var15 << 7) + var80;
                                            var61[var53] = arg2.method1857(var82, var83) - arg4.method1857(var82, var83);
                                        }
                                        if (var62 != null) {
                                            if (arg2 != null && !class281.field4090[var20][var76]) {
                                                int var84 = (var13 << 7) + var81;
                                                int var85 = (var15 << 7) + var80;
                                                var62[var53] = arg4.method1857(var84, var85) - arg2.method1857(var84, var85);
                                            } else if (arg5 != null && !class84.field1015[var20][var76]) {
                                                int var86 = (var13 << 7) + var81;
                                                int var87 = (var15 << 7) + var80;
                                                var62[var53] = arg5.method1857(var86, var87) - arg4.method1857(var86, var87);
                                            }
                                        }
                                        if (var76 < 8 && class80.field956[var77] >= 0) {
                                            if (var55 != null) {
                                                var55[var53] = class218.field3072[var77];
                                            }
                                            var60[var53] = class206.field2837[var77];
                                            var59[var53] = class435.field6265[var77];
                                            var58[var53] = field2687[var77];
                                        } else {
                                            if (var18 && class281.field4090[var20][var76]) {
                                                var59[var53] = var64;
                                                var60[var53] = var65;
                                                var58[var53] = var63;
                                            } else if (var81 == 0 && var80 == 0) {
                                                var58[var53] = arg6[var13][var15];
                                                var59[var53] = var68.field3123;
                                                var60[var53] = var68.field3129;
                                            } else if (var81 == 0 && var80 == 128) {
                                                var58[var53] = arg6[var13][var16];
                                                var59[var53] = var69.field3123;
                                                var60[var53] = var69.field3129;
                                            } else if (var81 == 128 && var80 == 128) {
                                                var58[var53] = arg6[var14][var16];
                                                var59[var53] = var70.field3123;
                                                var60[var53] = var70.field3129;
                                            } else if (var81 == 128 && var80 == 0) {
                                                var58[var53] = arg6[var14][var15];
                                                var59[var53] = var71.field3123;
                                                var60[var53] = var71.field3129;
                                            } else {
                                                if (var81 >= 64) {
                                                    if (var80 >= 64) {
                                                        var59[var53] = var70.field3123;
                                                        var60[var53] = var70.field3129;
                                                    } else {
                                                        var59[var53] = var71.field3123;
                                                        var60[var53] = var71.field3129;
                                                    }
                                                } else if (var80 < 64) {
                                                    var59[var53] = var68.field3123;
                                                    var60[var53] = var68.field3129;
                                                } else {
                                                    var59[var53] = var69.field3123;
                                                    var60[var53] = var69.field3129;
                                                }
                                                int var88 = class47.method247(var81 << 7 >> 7, (byte) 114, arg6[var14][var15], arg6[var13][var15]);
                                                int var89 = class47.method247(var81 << 7 >> 7, (byte) 109, arg6[var14][var16], arg6[var13][var16]);
                                                var58[var53] = class47.method247(var80 << 7 >> 7, (byte) 92, var89, var88);
                                            }
                                            if (var55 != null) {
                                                var55[var53] = var58[var53];
                                            }
                                        }
                                        var53++;
                                    }
                                    var52++;
                                }
                                if (var20 != 0 && var28.field3125) {
                                    var17 = true;
                                }
                            }
                            int var90 = arg4.method1861(var13, var15);
                            int var91 = arg4.method1861(var14, var15);
                            int var92 = arg4.method1861(var14, var16);
                            int var93 = arg4.method1861(var13, var16);
                            if (arg0 > 0) {
                                boolean var94 = true;
                                if (var23 == 0 && var20 != 0) {
                                    var94 = false;
                                }
                                if (var22 > 0 && var29 != null && !var29.field1370) {
                                    var94 = false;
                                }
                                if (var94 && var90 == var91 && var90 == var92 && var90 == var93) {
                                    this.field2704[arg0][var13][var15] = (byte) class292.method1841(this.field2704[arg0][var13][var15], 4);
                                }
                            }
                            int var95 = 0;
                            int var96 = 0;
                            int var97 = 0;
                            if (this.field2692) {
                                var95 = class35.method177(var13, var15);
                                var96 = class71.method362(var13, var15);
                                var97 = class483.method2853(var13, var15);
                            }
                            arg4.method1865(var13, var15, var56, var61, var57, var62, var58, var55, var59, var60, var95, var96, var97, var17);
                            class31.method159(arg0, var13, var15);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(Lmi;Loj;ILmi;[[IILmi;)V", line = 1995)
    private final void method1071(class443 arg0, class280 arg1, int arg2, class443 arg3, int[][] arg4, int arg5, class443 arg6) {
        field2703++;
        for (int var8 = arg5; var8 < this.field2677; var8++) {
            for (int var9 = 0; var9 < this.field2705; var9++) {
                if (class110.field1337 == -1 || class216.method1212(var9, var8, arg2, class110.field1337, 0)) {
                    byte var10 = this.field2682[arg2][var8][var9];
                    byte var11 = this.field2696[arg2][var8][var9];
                    int var12 = this.field2688[arg2][var8][var9] & 0xFF;
                    int var13 = this.field2681[arg2][var8][var9] & 0xFF;
                    class112 var14 = var12 == 0 ? null : this.field2690.method383(var12 - 1, (byte) -117);
                    class225 var15 = var13 == 0 ? null : this.field2694.method2488(var13 - 1, 128);
                    int var16 = 0;
                    int var17 = 0;
                    if (var10 != 0) {
                        var17 = var14 == null ? 0 : class220.field3079[var10];
                        var16 = var15 == null ? 0 : class20.field274[var10];
                    } else if (var14 != null) {
                        var17 = class220.field3079[var10];
                    } else if (var15 != null) {
                        var16 = class220.field3079[var10];
                    }
                    int var18 = var16 + var17;
                    int var19 = 0;
                    if (var18 != 0) {
                        int[] var20 = new int[var18];
                        int[] var21 = new int[var18];
                        int[] var22 = new int[var18];
                        int[] var23 = new int[var18];
                        boolean var24 = false;
                        if (var14 == null || var14.field1375 == -1 && var14.field1373 == -1 && var14.field1366 == -1) {
                            for (int var27 = 0; var27 < var17; var27++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var25 = arg1.method1359() ? var14.field1366 : var14.field1378;
                            if (class297.field4438) {
                                var25 = -1;
                            }
                            for (int var26 = 0; var26 < var17; var26++) {
                                var22[var19] = var25;
                                var23[var19] = var14.field1368;
                                if (var14.field1375 == -1) {
                                    var20[var19] = -1;
                                } else {
                                    var20[var19] = var14.field1375;
                                }
                                if (var14.field1373 == -1) {
                                    var21[var19] = -1;
                                } else {
                                    var21[var19] = var14.field1373;
                                    var24 = true;
                                }
                                var19++;
                            }
                            if (!this.field2692 && arg2 == 0) {
                                class463.method2725(var8, var9, var14.field1363, var14.field1364 * 8, var14.field1382);
                            }
                        }
                        if (!var24) {
                            var21 = null;
                        }
                        if (var15 == null) {
                            for (int var30 = 0; var30 < var16; var30++) {
                                var20[var19] = -1;
                                var19++;
                            }
                        } else {
                            int var28 = var15.field3123;
                            if (class297.field4438) {
                                var28 = -1;
                            }
                            for (int var29 = 0; var29 < var16; var29++) {
                                var22[var19] = var28;
                                var23[var19] = var15.field3129;
                                var20[var19] = arg4[var8][var9];
                                if (var21 != null) {
                                    var21[var19] = -1;
                                }
                                var19++;
                            }
                        }
                        int var31 = class319.field4644.length;
                        int[] var32 = new int[var31];
                        int[] var33 = new int[var31];
                        int[] var34 = arg0 == null ? null : new int[var31];
                        int[] var35 = arg0 == null && arg6 == null ? null : new int[var31];
                        for (int var36 = 0; var36 < var31; var36++) {
                            int var45 = class319.field4644[var36];
                            int var46 = class479.field6770[var36];
                            if (var11 == 0) {
                                var32[var36] = var45;
                                var33[var36] = var46;
                            } else if (var11 == 1) {
                                var32[var36] = var46;
                                var33[var36] = 128 - var45;
                            } else if (var11 == 2) {
                                var32[var36] = 128 - var45;
                                var33[var36] = 128 - var46;
                            } else if (var11 == 3) {
                                var32[var36] = 128 - var46;
                                var33[var36] = var45;
                            }
                            if (var34 != null && class281.field4090[var10][var36]) {
                                int var49 = (var8 << 7) + var45;
                                int var50 = (var9 << 7) + var45;
                                var34[var36] = arg0.method1857(var49, var50) - arg3.method1857(var49, var50);
                            }
                            if (var35 != null) {
                                if (arg0 != null && !class281.field4090[var10][var36]) {
                                    int var51 = (var8 << 7) + var45;
                                    int var52 = (var9 << 7) + var45;
                                    var35[var36] = arg3.method1857(var51, var52) - arg0.method1857(var51, var52);
                                } else if (arg6 != null && !class84.field1015[var10][var36]) {
                                    int var53 = (var8 << 7) + var45;
                                    int var54 = (var9 << 7) + var45;
                                    var35[var36] = arg6.method1857(var53, var54) - arg3.method1857(var53, var54);
                                }
                            }
                        }
                        int var37 = arg3.method1861(var8, var9);
                        int var38 = arg3.method1861(var8 + 1, var9);
                        int var39 = arg3.method1861(var8 + 1, var9 + 1);
                        int var40 = arg3.method1861(var8, var9 + 1);
                        if (arg2 > 0) {
                            boolean var41 = true;
                            if (var13 == 0 && var10 != 0) {
                                var41 = false;
                            }
                            if (var12 > 0 && var14 != null && !var14.field1370) {
                                var41 = false;
                            }
                            if (var41 && var37 == var38 && var37 == var39 && var37 == var40) {
                                this.field2704[arg2][var8][var9] = (byte) class292.method1841(this.field2704[arg2][var8][var9], 4);
                            }
                        }
                        int var42 = 0;
                        int var43 = 0;
                        int var44 = 0;
                        if (this.field2692) {
                            var42 = class35.method177(var8, var9);
                            var43 = class71.method362(var8, var9);
                            var44 = class483.method2853(var8, var9);
                        }
                        arg3.method1870(var8, var9, var32, var34, var33, var35, class169.field2006[var10], class77.field926[var10], class371.field5314[var10], var20, var21, var22, var23, var42, var43, var44, false);
                        class31.method159(arg2, var8, var9);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(II[Lpe;IIILvt;)V", line = 2314)
    public final void method1072(int arg0, int arg1, class424[] arg2, int arg3, int arg4, int arg5, class179 arg6) {
        if (!this.field2692) {
            for (int var8 = 0; var8 < 4; var8++) {
                class424 var9 = arg2[var8];
                for (int var10 = 0; var10 < 64; var10++) {
                    for (int var11 = 0; var11 < 64; var11++) {
                        int var12 = arg0 + var10;
                        int var13 = arg4 + var11;
                        if (var12 >= 0 && this.field2677 > var12 && var13 >= 0 && var13 < this.field2705) {
                            var9.method2535(-69, var12, var13);
                        }
                    }
                }
            }
        }
        if (arg5 != -19305) {
            this.field2677 = 109;
        }
        field2700++;
        int var14 = arg0 + arg3;
        int var15 = arg1 + arg4;
        for (int var16 = 0; var16 < this.field2691; var16++) {
            for (int var17 = 0; var17 < 64; var17++) {
                for (int var18 = 0; var18 < 64; var18++) {
                    this.method1073(var18 + arg4, var14 + var17, 0, false, arg0 + var17, false, 0, var16, arg6, 0, var15 + var18);
                }
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "(IIIZIZIILvt;II)V", line = 2390)
    private final void method1073(int arg0, int arg1, int arg2, boolean arg3, int arg4, boolean arg5, int arg6, int arg7, class179 arg8, int arg9, int arg10) {
        if (arg2 == 1) {
            arg9 = 1;
        } else if (arg2 == 2) {
            arg6 = 1;
            arg9 = 1;
        } else if (arg2 == 3) {
            arg6 = 1;
        }
        if (arg5) {
            this.method1061(-56, 96, -66, (byte) -30, 83);
        }
        field2699++;
        if (arg4 < 0 || this.field2677 <= arg4 || arg0 < 0 || this.field2705 <= arg0) {
            while (true) {
                int var14 = arg8.method895((byte) -114);
                if (var14 == 0) {
                    return;
                }
                if (var14 == 1) {
                    arg8.method895((byte) -109);
                    return;
                }
                if (var14 <= 49) {
                    arg8.method895((byte) -115);
                }
            }
        }
        if (!this.field2692 && !arg3) {
            class140.field1686[arg7][arg4][arg0] = 0;
        }
        while (true) {
            int var12 = arg8.method895((byte) -106);
            if (var12 == 0) {
                if (this.field2692) {
                    this.field2706[0][arg4 + arg6][arg0 + arg9] = 0;
                    return;
                } else if (arg7 == 0) {
                    this.field2706[0][arg4 + arg6][arg0 + arg9] = -class485.method2867(arg1 + 932731, -6926, arg10 + 556238) * 8;
                    return;
                } else {
                    this.field2706[arg7][arg4 + arg6][arg0 + arg9] = this.field2706[arg7 - 1][arg4 + arg6][arg0 + arg9] - 240;
                    return;
                }
            }
            if (var12 == 1) {
                int var13 = arg8.method895((byte) -118);
                if (this.field2692) {
                    this.field2706[0][arg4 + arg6][arg0 + arg9] = var13 * 8;
                    return;
                }
                if (var13 == 1) {
                    var13 = 0;
                }
                if (arg7 == 0) {
                    this.field2706[0][arg4 + arg6][arg0 + arg9] = -var13 * 8;
                    return;
                }
                this.field2706[arg7][arg4 + arg6][arg0 + arg9] = this.field2706[arg7 - 1][arg4 + arg6][arg0 + arg9] - (var13 * 8);
                return;
            }
            if (var12 <= 49) {
                if (arg3) {
                    arg8.method895((byte) -111);
                } else {
                    this.field2688[arg7][arg4][arg0] = arg8.method922(32429);
                    this.field2682[arg7][arg4][arg0] = (byte) ((var12 - 2) / 4);
                    this.field2696[arg7][arg4][arg0] = (byte) class444.method2618(var12 + arg2 - 2, 3);
                }
            } else if (var12 <= 81) {
                if (!this.field2692 && !arg3) {
                    class140.field1686[arg7][arg4][arg0] = (byte) (var12 - 49);
                }
            } else if (!arg3) {
                this.field2681[arg7][arg4][arg0] = (byte) (var12 - 81);
            }
        }
    }

    @OriginalMember(owner = "client!m", name = "<init>", descriptor = "(IIIZLkh;Luo;)V", line = 2517)
    public class196(int arg0, int arg1, int arg2, boolean arg3, class75 arg4, class418 arg5) {
        this.field2692 = arg3;
        this.field2677 = arg1;
        this.field2690 = arg4;
        this.field2694 = arg5;
        this.field2691 = arg0;
        this.field2705 = arg2;
        this.field2688 = new byte[this.field2691][this.field2677][this.field2705];
        this.field2681 = new byte[this.field2691][this.field2677][this.field2705];
        this.field2696 = new byte[this.field2691][this.field2677][this.field2705];
        this.field2704 = new byte[this.field2691][this.field2677 + 1][this.field2705 + 1];
        this.field2682 = new byte[this.field2691][this.field2677][this.field2705];
        this.field2706 = new int[this.field2691][this.field2677 + 1][this.field2705 + 1];
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "()V", line = 2536)
    public static final void method1074() {
        if (class105.field1264 != null) {
            for (int var0 = 0; var0 < class105.field1264.length; var0++) {
                for (int var1 = 0; var1 < class176.field2122; var1++) {
                    for (int var2 = 0; var2 < class225.field3116; var2++) {
                        if (class105.field1264[var0][var1][var2] != null) {
                            class105.field1264[var0][var1][var2].method1604((byte) 0);
                        }
                        class105.field1264[var0][var1][var2] = null;
                    }
                }
            }
        }
        class105.field1264 = null;
        class443.field6329 = null;
        if (class159.field1901 != null) {
            for (int var3 = 0; var3 < class159.field1901.length; var3++) {
                for (int var4 = 0; var4 < class176.field2122; var4++) {
                    for (int var5 = 0; var5 < class225.field3116; var5++) {
                        if (class159.field1901[var3][var4][var5] != null) {
                            class159.field1901[var3][var4][var5].method1604((byte) 0);
                        }
                        class159.field1901[var3][var4][var5] = null;
                    }
                }
            }
        }
        class159.field1901 = null;
        class361.field5208 = null;
        class293.field4356 = null;
        class398.field5667 = null;
        class87.field1086 = 0;
        if (class334.field4806 != null) {
            for (int var6 = 0; var6 < class87.field1086; var6++) {
                class334.field4806[var6] = null;
            }
        }
        if (class413.field5880 != null) {
            for (int var7 = 0; var7 < class63.field782; var7++) {
                class413.field5880[var7] = null;
            }
            class63.field782 = 0;
        }
        if (class364.field5236 != null) {
            for (int var8 = 0; var8 < class10.field129; var8++) {
                class364.field5236[var8] = null;
            }
            for (int var9 = 0; var9 < class346.field4937; var9++) {
                for (int var10 = 0; var10 < class176.field2122; var10++) {
                    for (int var11 = 0; var11 < class225.field3116; var11++) {
                        class382.field5424[var9][var10][var11] = 0L;
                    }
                }
            }
            class10.field129 = 0;
        }
        class348.field4960 = null;
        class90.method454((byte) 118);
        class305.field4504.method2343(0);
        class3.field24 = null;
        class275.field3914 = null;
        class419.field6040 = null;
        class96.field1187 = null;
        class83.field1003 = null;
        class415.field5985 = null;
    }

    @OriginalMember(owner = "client!m", name = "a", descriptor = "([Ljava/lang/Object;III[J)V", line = 2678)
    public static final void method1075(Object[] arg0, int arg1, int arg2, int arg3, long[] arg4) {
        if (arg3 < arg2) {
            int var5 = (arg2 + arg3) / 2;
            int var6 = arg3;
            long var7 = arg4[var5];
            arg4[var5] = arg4[arg2];
            arg4[arg2] = var7;
            Object var9 = arg0[var5];
            arg0[var5] = arg0[arg2];
            arg0[arg2] = var9;
            for (int var10 = arg3; var10 < arg2; var10++) {
                if (arg4[var10] < ((long) (var10 & 0x1) + var7)) {
                    long var11 = arg4[var10];
                    arg4[var10] = arg4[var6];
                    arg4[var6] = var11;
                    Object var13 = arg0[var10];
                    arg0[var10] = arg0[var6];
                    arg0[var6++] = var13;
                }
            }
            arg4[arg2] = arg4[var6];
            arg4[var6] = var7;
            arg0[arg2] = arg0[var6];
            arg0[var6] = var9;
            method1075(arg0, 1, var6 - 1, arg3, arg4);
            method1075(arg0, 1, arg2, var6 + 1, arg4);
        }
        if (arg1 != 1) {
            field2695 = 41;
        }
        field2689++;
    }
}
