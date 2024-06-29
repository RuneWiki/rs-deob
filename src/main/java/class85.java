import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ef")
public class class85 {

    @OriginalMember(owner = "client!ef", name = "u", descriptor = "[I")
    private int[] field1450;

    @OriginalMember(owner = "client!ef", name = "o", descriptor = "[B")
    private byte[] field1444;

    @OriginalMember(owner = "client!ef", name = "r", descriptor = "[I")
    private int[] field1447;

    @OriginalMember(owner = "client!ef", name = "f", descriptor = "I")
    public static int field1435 = 0;

    @OriginalMember(owner = "client!ef", name = "j", descriptor = "Loh;")
    private static class258 field1439 = class153.method1046("You can(Wt add yourself to your own ignore list)3", 115);

    @OriginalMember(owner = "client!ef", name = "i", descriptor = "Loh;")
    public static class258 field1438 = field1439;

    @OriginalMember(owner = "client!ef", name = "d", descriptor = "Loh;")
    private static class258 field1433 = class153.method1046(" ", 89);

    @OriginalMember(owner = "client!ef", name = "t", descriptor = "[I")
    public static int[] field1449 = new int[32];

    @OriginalMember(owner = "client!ef", name = "l", descriptor = "Loh;")
    public static class258 field1441 = class153.method1046("p11_full", 117);

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "Loh;")
    public static class258 field1430 = field1433;

    @OriginalMember(owner = "client!ef", name = "e", descriptor = "I")
    public static int field1434;

    @OriginalMember(owner = "client!ef", name = "g", descriptor = "I")
    public static int field1436;

    @OriginalMember(owner = "client!ef", name = "h", descriptor = "I")
    public static int field1437;

    @OriginalMember(owner = "client!ef", name = "m", descriptor = "I")
    public static int field1442;

    @OriginalMember(owner = "client!ef", name = "n", descriptor = "I")
    public static int field1443;

    @OriginalMember(owner = "client!ef", name = "p", descriptor = "I")
    public static int field1445;

    @OriginalMember(owner = "client!ef", name = "q", descriptor = "I")
    public static int field1446;

    @OriginalMember(owner = "client!ef", name = "c", descriptor = "Loh;")
    public static class258 field1432;

    @OriginalMember(owner = "client!ef", name = "s", descriptor = "Lfa;")
    public static class274 field1448;

    @OriginalMember(owner = "client!ef", name = "k", descriptor = "[Lvi;")
    public static class129[] field1440;

    @OriginalMember(owner = "client!ef", name = "b", descriptor = "[[B")
    public static byte[][] field1431;

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(ILi;IIZIIIIIIILpb;I)Li;", line = 6)
    public static final class305 method611(int arg0, class305 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, class2 arg12, int arg13) {
        long var14 = ((long) arg0 << 48) + ((long) arg2 << 32) + (long) ((arg9 << 16) + (arg11 << 24) + arg3);
        class305 var16 = (class305) class91.field1596.method1159((byte) 123, var14);
        field1446++;
        if (var16 == null) {
            byte var17;
            if (arg3 == 1) {
                var17 = 9;
            } else if (arg3 == 2) {
                var17 = 12;
            } else if (arg3 == 3) {
                var17 = 15;
            } else if (arg3 == 4) {
                var17 = 18;
            } else {
                var17 = 21;
            }
            byte var18 = 3;
            int[] var19 = new int[] { 64, 96, 128 };
            int[][] var20 = new int[var18][var17];
            class97 var21 = new class97(var17 * var18 + 1, var17 * var18 * 2 + -var17, 0);
            int var22 = var21.method720(0, 0, 0);
            for (int var23 = 0; var23 < var18; var23++) {
                int var24 = var19[var23];
                int var25 = var19[var23];
                for (int var26 = 0; var26 < var17; var26++) {
                    int var27 = (var26 << 11) / var17;
                    int var28 = class266.field4642[var27] * var24 + arg5 >> 16;
                    int var29 = class266.field4636[var27] * var25 + arg8 >> 16;
                    var20[var23][var26] = var21.method720(var28, 0, var29);
                }
            }
            for (int var30 = 0; var30 < var18; var30++) {
                int var31 = (var30 * 256 + 128) / var18;
                int var32 = 256 - var31;
                byte var33 = (byte) (arg9 * var32 + arg11 * var31 >> 8);
                short var34 = (short) (((arg0 & 0x7F) * var31 + (arg2 & 0x7F) * var32 & 0x7F00) + ((arg0 & 0xFC00) * var31 + (arg2 & 0xFC00) * var32 & 0xFC0000) + ((arg0 & 0x380) * var31 + (arg2 & 0x380) * var32 & 0x38000) >> 8);
                for (int var35 = 0; var35 < var17; var35++) {
                    if (var30 == 0) {
                        var21.method716(var22, var20[0][(var35 + 1) % var17], var20[0][var35], (byte) 1, var34, var33);
                    } else {
                        var21.method716(var20[var30 - 1][var35], var20[var30 - 1][(var35 + 1) % var17], var20[var30][(var35 + 1) % var17], (byte) 1, var34, var33);
                        var21.method716(var20[var30 - 1][var35], var20[var30][(var35 + 1) % var17], var20[var30][var35], (byte) 1, var34, var33);
                    }
                }
            }
            var16 = var21.method713(64, 768, -50, -10, -50);
            class91.field1596.method1163(var16, -1, var14);
        }
        int var36 = arg3 * 64 - 1;
        int var37 = -var36;
        int var38 = var36;
        int var39 = arg1.method644();
        int var40 = var36;
        if (arg6 != 14691) {
            method613((byte) -61);
        }
        int var41 = -var36;
        int var42 = arg1.method647();
        int var43 = arg1.method651();
        int var44 = arg1.method658();
        if (arg4) {
            if (arg13 > 128 && arg13 < 896) {
                var41 -= 128;
            }
            if (arg13 > 1664 || arg13 < 384) {
                var37 -= 128;
            }
            if (arg13 > 1152 && arg13 < 1920) {
                var38 = var36 + 128;
            }
            if (arg13 > 640 && arg13 < 1408) {
                var40 = var36 + 128;
            }
        }
        class255 var45 = null;
        if (var41 > var39) {
            var39 = var41;
        }
        if (var38 < var42) {
            var42 = var38;
        }
        if (arg12 != null) {
            int var46 = arg12.field41[arg7];
            var45 = class3.method22(120, var46 >> 16);
            arg7 = var46 & 0xFFFF;
        }
        if (var40 < var44) {
            var44 = var40;
        }
        if (var43 < var37) {
            var43 = var37;
        }
        class305 var47;
        if (var45 == null) {
            var47 = var16.method648(true, true);
            var47.method656((var42 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method637((var39 + var42) / 2, 0, (var43 + var44) / 2);
        } else {
            var47 = var16.method648(!var45.method1720(-23945, arg7), true);
            var47.method656((var42 - var39) / 2, 128, (var44 - var43) / 2);
            var47.method637((var39 + var42) / 2, 0, (var43 + var44) / 2);
            var47.method643(var45, arg7);
        }
        if (arg13 != 0) {
            var47.method640(arg13);
        }
        if (class257.field4390) {
            class175 var50 = (class175) var47;
            if (arg10 != class228.method1525(true, class272.field4704, arg8 + var43, arg5 + var39) || arg10 != class228.method1525(true, class272.field4704, arg8 + var44, arg5 + var42)) {
                for (int var51 = 0; var51 < var50.field3133; var51++) {
                    var50.field3138[var51] += class228.method1525(true, class272.field4704, var50.field3123[var51] + arg8, var50.field3120[var51] + arg5) - arg10;
                }
                var50.field3128.field3270 = false;
                var50.field3140.field2087 = false;
            }
        } else {
            class89 var48 = (class89) var47;
            if (arg10 != class228.method1525(true, class272.field4704, arg8 + var43, arg5 - -var39) || arg10 != class228.method1525(true, class272.field4704, arg8 + var44, arg5 - -var42)) {
                for (int var49 = 0; var49 < var48.field1513; var49++) {
                    var48.field1517[var49] += class228.method1525(true, class272.field4704, var48.field1527[var49] + arg8, var48.field1555[var49] + arg5) - arg10;
                }
                var48.field1537 = false;
            }
        }
        return var47;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I)V", line = 230)
    public static void method612(int arg0) {
        field1431 = (byte[][]) null;
        field1433 = null;
        field1438 = null;
        if (arg0 < 33) {
            return;
        }
        field1448 = null;
        field1441 = null;
        field1449 = null;
        field1439 = null;
        field1440 = null;
        field1432 = null;
        field1430 = null;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(B)V", line = 267)
    public static final void method613(byte arg0) {
        class253.field4350.method1157(4);
        field1436++;
        int var1 = 18 / ((arg0 + 25) / 56);
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "(I[BI[BII)I", line = 290)
    public final int method614(int arg0, byte[] arg1, int arg2, byte[] arg3, int arg4, int arg5) {
        int var7 = arg4 << 3;
        int var8 = 0;
        if (arg5 != 255) {
            field1431 = (byte[][]) ((byte[][]) null);
        }
        field1434++;
        int var9 = arg0 + arg2;
        while (var9 > arg2) {
            int var10 = arg1[arg2] & 0xFF;
            int var11 = this.field1450[var10];
            byte var12 = this.field1444[var10];
            if (var12 == 0) {
                throw new RuntimeException("No codeword for data value " + var10);
            }
            int var13 = var7 & 0x7;
            int var14 = var8 & -var13 >> 31;
            int var15 = var7 >> 3;
            var7 += var12;
            int var16 = var15 + (var12 + var13 - 1 >> 3);
            int var17 = var13 + 24;
            arg3[var15] = (byte) (var8 = class307.method2139(var14, var11 >>> var17));
            if (var16 > var15) {
                var13 = var17 - 8;
                var15++;
                arg3[var15] = (byte) (var8 = var11 >>> var13);
                if (var16 > var15) {
                    var15++;
                    var13 -= 8;
                    arg3[var15] = (byte) (var8 = var11 >>> var13);
                    if (var16 > var15) {
                        var15++;
                        var13 -= 8;
                        arg3[var15] = (byte) (var8 = var11 >>> var13);
                        if (var16 > var15) {
                            var15++;
                            var13 -= 8;
                            arg3[var15] = (byte) (var8 = var11 << -var13);
                        }
                    }
                }
            }
            arg2++;
        }
        return (var7 + 7 >> 3) - arg4;
    }

    @OriginalMember(owner = "client!ef", name = "a", descriptor = "([BI[BIII)I", line = 358)
    public final int method615(byte[] arg0, int arg1, byte[] arg2, int arg3, int arg4, int arg5) {
        field1437++;
        if (arg4 == 0) {
            return 0;
        }
        int var7 = arg1 + arg4;
        if (arg3 != -20399) {
            field1440 = (class129[]) null;
        }
        int var8 = 0;
        int var9 = arg5;
        while (true) {
            byte var10 = arg2[var9];
            if (var10 >= 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var11;
            if ((var11 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var11);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x40) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var12;
            if ((var12 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var12);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x20) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var13;
            if ((var13 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var13);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x10) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var14;
            if ((var14 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var14);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x8) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var15;
            if ((var15 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var15);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x4) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var16;
            if ((var16 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var16);
                if (var7 <= arg1) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x2) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var17;
            if ((var17 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var17);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            if ((var10 & 0x1) == 0) {
                var8++;
            } else {
                var8 = this.field1447[var8];
            }
            int var18;
            if ((var18 = this.field1447[var8]) < 0) {
                arg0[arg1++] = (byte) (~var18);
                if (arg1 >= var7) {
                    break;
                }
                var8 = 0;
            }
            var9++;
        }
        return var9 + 1 - arg5;
    }

    @OriginalMember(owner = "client!ef", name = "<init>", descriptor = "([B)V", line = 530)
    public class85(byte[] arg0) {
        int var2 = arg0.length;
        int[] var3 = new int[33];
        this.field1450 = new int[var2];
        this.field1444 = arg0;
        this.field1447 = new int[8];
        int var4 = 0;
        for (int var5 = 0; var5 < var2; var5++) {
            byte var6 = arg0[var5];
            if (var6 != 0) {
                int var7 = 0x1 << 32 - var6;
                int var8 = var3[var6];
                this.field1450[var5] = var8;
                int var12;
                if ((var7 & var8) == 0) {
                    for (int var9 = var6 - 1; var9 >= 1; var9--) {
                        int var10 = var3[var9];
                        if (var8 != var10) {
                            break;
                        }
                        int var11 = 0x1 << 32 - var9;
                        if ((var11 & var10) != 0) {
                            var3[var9] = var3[var9 - 1];
                            break;
                        }
                        var3[var9] = class307.method2139(var10, var11);
                    }
                    var12 = var7 | var8;
                } else {
                    var12 = var3[var6 - 1];
                }
                var3[var6] = var12;
                for (int var13 = var6 + 1; var13 <= 32; var13++) {
                    if (var3[var13] == var8) {
                        var3[var13] = var12;
                    }
                }
                int var14 = 0;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = Integer.MIN_VALUE >>> var15;
                    if ((var16 & var8) == 0) {
                        var14++;
                    } else {
                        if (this.field1447[var14] == 0) {
                            this.field1447[var14] = var4;
                        }
                        var14 = this.field1447[var14];
                    }
                    int var17 = var16 >>> 1;
                    if (this.field1447.length <= var14) {
                        int[] var18 = new int[this.field1447.length * 2];
                        for (int var19 = 0; var19 < this.field1447.length; var19++) {
                            var18[var19] = this.field1447[var19];
                        }
                        this.field1447 = var18;
                    }
                }
                this.field1447[var14] = ~var5;
                if (var4 <= var14) {
                    var4 = var14 + 1;
                }
            }
        }
    }
}
