import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jj")
public class class48 extends class86 {

    @OriginalMember(owner = "client!jj", name = "N", descriptor = "I")
    private int field743 = 6;

    @OriginalMember(owner = "client!jj", name = "V", descriptor = "[S")
    public static short[] field751 = new short[256];

    @OriginalMember(owner = "client!jj", name = "W", descriptor = "I")
    public static int field752 = 0;

    @OriginalMember(owner = "client!jj", name = "K", descriptor = "I")
    public static int field741;

    @OriginalMember(owner = "client!jj", name = "M", descriptor = "I")
    public static int field742;

    @OriginalMember(owner = "client!jj", name = "O", descriptor = "I")
    public static int field744;

    @OriginalMember(owner = "client!jj", name = "Q", descriptor = "I")
    public static int field746;

    @OriginalMember(owner = "client!jj", name = "R", descriptor = "I")
    public static int field747;

    @OriginalMember(owner = "client!jj", name = "S", descriptor = "I")
    public static int field748;

    @OriginalMember(owner = "client!jj", name = "T", descriptor = "I")
    public static int field749;

    @OriginalMember(owner = "client!jj", name = "U", descriptor = "I")
    public static int field750;

    @OriginalMember(owner = "client!jj", name = "X", descriptor = "I")
    public static int field753;

    @OriginalMember(owner = "client!jj", name = "P", descriptor = "Lrn;")
    public static class18 field745;

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IIII)I", line = 5)
    public static final int method465(int arg0, int arg1, int arg2, int arg3) {
        field749++;
        if ((class146.field2386[arg0][arg3][arg2] & 0x8) == 0) {
            if (arg1 != -25542) {
                method469(-57, -28);
            }
            return arg0 <= 0 || (class146.field2386[1][arg3][arg2] & 0x2) == 0 ? arg0 : arg0 - 1;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(IZLug;)V", line = 24)
    public final void method157(int arg0, boolean arg1, class25 arg2) {
        field747++;
        if (arg0 == 0) {
            this.field743 = arg2.method281(-126);
        } else if (arg0 == 1) {
            this.field1228 = arg2.method281(60) == 1;
        }
        if (arg1) {
            field752 = -105;
        }
    }

    @OriginalMember(owner = "client!jj", name = "d", descriptor = "(II)V", line = 61)
    public static final void method466(int arg0, int arg1) {
        field750++;
        if (arg0 == arg1 || !class151.field2468[arg0]) {
            return;
        }
        class228.field3561.method216(arg0, false);
        if (class334.field5108[arg0] == null) {
            return;
        }
        boolean var2 = true;
        for (int var3 = 0; var3 < class334.field5108[arg0].length; var3++) {
            if (class334.field5108[arg0][var3] != null) {
                if (class334.field5108[arg0][var3].field5279 == 2) {
                    var2 = false;
                } else {
                    class334.field5108[arg0][var3] = null;
                }
            }
        }
        if (var2) {
            class334.field5108[arg0] = null;
        }
        class151.field2468[arg0] = false;
    }

    @OriginalMember(owner = "client!jj", name = "<init>", descriptor = "()V", line = 102)
    public class48() {
        super(2, false);
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(IB)[[I", line = 110)
    public final int[][] method156(int arg0, byte arg1) {
        if (arg1 > -126) {
            this.field743 = 90;
        }
        int[][] var3 = this.field1227.method2025(false, arg0);
        field748++;
        if (this.field1227.field4277) {
            int[][] var4 = this.method782(arg0, 0, 1);
            int[][] var5 = this.method782(arg0, 1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var3[2];
            int[] var9 = var4[1];
            int[] var10 = var4[0];
            int[] var11 = var5[0];
            int[] var12 = var5[1];
            int[] var13 = var4[2];
            int[] var14 = var5[2];
            int var15 = this.field743;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class93.field1424; var16++) {
                    var6[var16] = var10[var16] + var11[var16];
                    var7[var16] = var9[var16] + var12[var16];
                    var8[var16] = var13[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var63 = 0; var63 < class93.field1424; var63++) {
                    var6[var63] = var10[var63] - var11[var63];
                    var7[var63] = var9[var63] - var12[var63];
                    var8[var63] = var13[var63] - var14[var63];
                }
            } else if (var15 == 3) {
                for (int var17 = 0; var17 < class93.field1424; var17++) {
                    var6[var17] = var10[var17] * var11[var17] >> 12;
                    var7[var17] = var9[var17] * var12[var17] >> 12;
                    var8[var17] = var13[var17] * var14[var17] >> 12;
                }
            } else if (var15 == 4) {
                for (int var59 = 0; var59 < class93.field1424; var59++) {
                    int var60 = var11[var59];
                    int var61 = var12[var59];
                    int var62 = var14[var59];
                    var6[var59] = var60 == 0 ? 4096 : (var10[var59] << 12) / var60;
                    var7[var59] = var61 == 0 ? 4096 : (var9[var59] << 12) / var61;
                    var8[var59] = var62 == 0 ? 4096 : (var13[var59] << 12) / var62;
                }
            } else if (var15 == 5) {
                for (int var18 = 0; var18 < class93.field1424; var18++) {
                    var6[var18] = 4096 - ((4096 - var10[var18]) * (4096 - var11[var18]) >> 12);
                    var7[var18] = 4096 - ((4096 - var9[var18]) * (4096 - var12[var18]) >> 12);
                    var8[var18] = 4096 - ((4096 - var13[var18]) * (4096 - var14[var18]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var19 = 0; var19 < class93.field1424; var19++) {
                    int var20 = var12[var19];
                    int var21 = var14[var19];
                    int var22 = var11[var19];
                    var6[var19] = var22 < 2048 ? var10[var19] * var22 >> 11 : 4096 - ((4096 - var10[var19]) * (4096 - var22) >> 11);
                    var7[var19] = var20 >= 2048 ? 4096 - ((4096 - var9[var19]) * (4096 - var20) >> 11) : var9[var19] * var20 >> 11;
                    var8[var19] = var21 >= 2048 ? 4096 - ((4096 - var13[var19]) * (4096 - var21) >> 11) : var13[var19] * var21 >> 11;
                }
            } else if (var15 == 7) {
                for (int var23 = 0; var23 < class93.field1424; var23++) {
                    int var24 = var10[var23];
                    int var25 = var9[var23];
                    int var26 = var13[var23];
                    var6[var23] = var24 == 4096 ? 4096 : (var11[var23] << 12) / (4096 - var24);
                    var7[var23] = var25 == 4096 ? 4096 : (var12[var23] << 12) / (4096 - var25);
                    var8[var23] = var26 == 4096 ? 4096 : (var14[var23] << 12) / (4096 - var26);
                }
            } else if (var15 == 8) {
                for (int var27 = 0; var27 < class93.field1424; var27++) {
                    int var28 = var13[var27];
                    int var29 = var9[var27];
                    int var30 = var10[var27];
                    var6[var27] = var30 == 0 ? 0 : 4096 - ((4096 - var11[var27] << 12) / var30);
                    var7[var27] = var29 == 0 ? 0 : 4096 - ((4096 - var12[var27] << 12) / var29);
                    var8[var27] = var28 == 0 ? 0 : 4096 - ((4096 - var14[var27] << 12) / var28);
                }
            } else if (var15 == 9) {
                for (int var31 = 0; var31 < class93.field1424; var31++) {
                    int var32 = var13[var31];
                    int var33 = var10[var31];
                    int var34 = var9[var31];
                    int var35 = var11[var31];
                    int var36 = var14[var31];
                    int var37 = var12[var31];
                    var6[var31] = var33 >= var35 ? var35 : var33;
                    var7[var31] = var34 < var37 ? var34 : var37;
                    var8[var31] = var36 <= var32 ? var36 : var32;
                }
            } else if (var15 == 10) {
                for (int var52 = 0; var52 < class93.field1424; var52++) {
                    int var53 = var9[var52];
                    int var54 = var12[var52];
                    int var55 = var14[var52];
                    int var56 = var11[var52];
                    int var57 = var10[var52];
                    int var58 = var13[var52];
                    var6[var52] = var57 <= var56 ? var56 : var57;
                    var7[var52] = var54 < var53 ? var53 : var54;
                    var8[var52] = var58 <= var55 ? var55 : var58;
                }
            } else if (var15 == 11) {
                for (int var45 = 0; var45 < class93.field1424; var45++) {
                    int var46 = var9[var45];
                    int var47 = var13[var45];
                    int var48 = var10[var45];
                    int var49 = var14[var45];
                    int var50 = var12[var45];
                    int var51 = var11[var45];
                    var6[var45] = var48 > var51 ? var48 - var51 : -var48 + var51;
                    var7[var45] = var46 > var50 ? var46 - var50 : -var46 + var50;
                    var8[var45] = var49 >= var47 ? var49 - var47 : -var49 + var47;
                }
            } else if (var15 == 12) {
                for (int var38 = 0; var38 < class93.field1424; var38++) {
                    int var39 = var9[var38];
                    int var40 = var11[var38];
                    int var41 = var12[var38];
                    int var42 = var10[var38];
                    int var43 = var13[var38];
                    int var44 = var14[var38];
                    var6[var38] = var42 + var40 - (var40 * var42 >> 11);
                    var7[var38] = var39 + var41 - (var39 * var41 >> 11);
                    var8[var38] = var43 + var44 - (var43 * var44 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "e", descriptor = "(II)V", line = 423)
    public static final void method467(int arg0, int arg1) {
        class186.field2905.method656(0);
        if (arg0 != 4096) {
            method469(49, 51);
        }
        field742++;
        class186.field2905 = new class66(arg1);
    }

    @OriginalMember(owner = "client!jj", name = "g", descriptor = "(I)V", line = 439)
    public static void method468(int arg0) {
        field745 = null;
        field751 = null;
        if (arg0 > -9) {
            method470(true, 25);
        }
    }

    @OriginalMember(owner = "client!jj", name = "f", descriptor = "(II)Lc;", line = 451)
    public static final class263 method469(int arg0, int arg1) {
        field744++;
        class263 var2 = (class263) class264.field4101.method654(114, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class10.field137.method187(class339.method2382(arg1, 4), class36.method363(arg1, arg0 - 9), -1);
        class263 var4 = new class263();
        if (arg0 != 10) {
            return (class263) null;
        }
        var4.field4075 = arg1;
        if (var3 != null) {
            var4.method1940(-117, new class25(var3));
        }
        var4.method1942(-1);
        if (var4.field4062 != -1) {
            var4.method1944(method469(10, var4.field4062), method469(10, var4.field4023), 0);
        }
        if (var4.field4094 != -1) {
            var4.method1943(method469(arg0, var4.field4048), method469(10, var4.field4094), (byte) -77);
        }
        if (!class192.field3031 && var4.field4095) {
            var4.field4058 = class15.field249;
            var4.field4026 = false;
            var4.field4050 = 0;
            var4.field4066 = class201.field3102;
            var4.field4034 = class363.field5749;
        }
        class264.field4101.method652(48, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!jj", name = "b", descriptor = "(II)[I", line = 502)
    public final int[] method158(int arg0, int arg1) {
        if (arg1 < 7) {
            this.field743 = 30;
        }
        field753++;
        int[] var3 = this.field1225.method1914(arg0, -128);
        if (this.field1225.field3995) {
            int[] var4 = this.method774(0, arg0, 0);
            int[] var5 = this.method774(0, arg0, 1);
            int var6 = this.field743;
            if (var6 == 1) {
                for (int var7 = 0; var7 < class93.field1424; var7++) {
                    var3[var7] = var4[var7] + var5[var7];
                }
            } else if (var6 == 2) {
                for (int var8 = 0; var8 < class93.field1424; var8++) {
                    var3[var8] = var4[var8] - var5[var8];
                }
            } else if (var6 == 3) {
                for (int var30 = 0; var30 < class93.field1424; var30++) {
                    var3[var30] = var4[var30] * var5[var30] >> 12;
                }
            } else if (var6 == 4) {
                for (int var9 = 0; var9 < class93.field1424; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 == 0 ? 4096 : (var4[var9] << 12) / var10;
                }
            } else if (var6 == 5) {
                for (int var29 = 0; var29 < class93.field1424; var29++) {
                    var3[var29] = 4096 - ((4096 - var4[var29]) * (4096 - var5[var29]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var11 = 0; var11 < class93.field1424; var11++) {
                    int var12 = var5[var11];
                    var3[var11] = var12 >= 2048 ? 4096 - ((4096 - var12) * (4096 - var4[var11]) >> 11) : var4[var11] * var12 >> 11;
                }
            } else if (var6 == 7) {
                for (int var13 = 0; var13 < class93.field1424; var13++) {
                    int var14 = var4[var13];
                    var3[var13] = var14 == 4096 ? 4096 : (var5[var13] << 12) / (4096 - var14);
                }
            } else if (var6 == 8) {
                for (int var15 = 0; var15 < class93.field1424; var15++) {
                    int var16 = var4[var15];
                    var3[var15] = var16 == 0 ? 0 : 4096 - ((4096 - var5[var15] << 12) / var16);
                }
            } else if (var6 == 9) {
                for (int var17 = 0; var17 < class93.field1424; var17++) {
                    int var18 = var5[var17];
                    int var19 = var4[var17];
                    var3[var17] = var19 < var18 ? var19 : var18;
                }
            } else if (var6 == 10) {
                for (int var26 = 0; var26 < class93.field1424; var26++) {
                    int var27 = var5[var26];
                    int var28 = var4[var26];
                    var3[var26] = var28 > var27 ? var28 : var27;
                }
            } else if (var6 == 11) {
                for (int var20 = 0; var20 < class93.field1424; var20++) {
                    int var21 = var4[var20];
                    int var22 = var5[var20];
                    var3[var20] = var22 >= var21 ? var22 - var21 : -var22 + var21;
                }
            } else if (var6 == 12) {
                for (int var23 = 0; var23 < class93.field1424; var23++) {
                    int var24 = var4[var23];
                    int var25 = var5[var23];
                    var3[var23] = var25 + var24 - (var24 * var25 >> 11);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(ZI)V", line = 755)
    public static final void method470(boolean arg0, int arg1) {
        field746++;
        if (arg0) {
            if (class164.field2604 != -1) {
                method466(class164.field2604, -1);
            }
            for (class36 var2 = (class36) class135.field2251.method371(-19139); var2 != null; var2 = (class36) class135.field2251.method378((byte) -72)) {
                class81.method732(22, true, var2);
            }
            class164.field2604 = -1;
            class135.field2251 = new class37(8);
            class247.method1857((byte) 125);
            class164.field2604 = class104.field1573;
            class108.method942(true, false);
            class101.method880(0);
            class49.method472(class164.field2604, (byte) 122);
        }
        class174.field2761 = -1;
        class293.method2122(class155.field2502, arg1);
        class173.field2746 = new class171();
        class173.field2746.field1359 = 3000;
        class173.field2746.field1286 = 3000;
        if (!class240.field3737 && class165.field2629 == 0) {
            class247.method1855(class303.field4725, (byte) 62);
            class175.method1370(10, (byte) -83);
            return;
        }
        if (class314.field4858 == 2) {
            class10.field143 = class300.field4650 << 7;
            class151.field2465 = class187.field2934 << 7;
        } else {
            class303.method2185(96);
        }
        if (class240.field3737) {
            class168.method1334(true);
        }
        class109.method947(8);
        class175.method1370(28, (byte) -83);
    }

    @OriginalMember(owner = "client!jj", name = "a", descriptor = "(BI)Lqk;", line = 812)
    public static final class70 method471(byte arg0, int arg1) {
        field741++;
        class70 var2 = (class70) class277.field4288.method654(arg0 + 68, (long) arg1);
        if (var2 != null) {
            return var2;
        }
        byte[] var3 = class271.field4184.method187(arg1, 0, -1);
        if (arg0 != 42) {
            field752 = -85;
        }
        class70 var4 = new class70(var3);
        var4.method1191(class334.field5114, (int[]) null);
        class277.field4288.method652(arg0 - 119, var4, (long) arg1);
        return var4;
    }
}
