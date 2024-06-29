import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ua")
public class class319 extends class3 {

    @OriginalMember(owner = "client!ua", name = "K", descriptor = "I")
    private int field5250 = 409;

    @OriginalMember(owner = "client!ua", name = "W", descriptor = "I")
    private int field5262 = 2048;

    @OriginalMember(owner = "client!ua", name = "N", descriptor = "I")
    private int field5253 = 0;

    @OriginalMember(owner = "client!ua", name = "R", descriptor = "I")
    private int field5257 = 1024;

    @OriginalMember(owner = "client!ua", name = "L", descriptor = "I")
    private int field5251 = 1024;

    @OriginalMember(owner = "client!ua", name = "U", descriptor = "I")
    private int field5260 = 1024;

    @OriginalMember(owner = "client!ua", name = "V", descriptor = "I")
    private int field5261 = 0;

    @OriginalMember(owner = "client!ua", name = "ab", descriptor = "I")
    private int field5266 = 1024;

    @OriginalMember(owner = "client!ua", name = "db", descriptor = "I")
    private int field5269 = 819;

    @OriginalMember(owner = "client!ua", name = "J", descriptor = "Ljava/lang/String;")
    public static String field5249 = null;

    @OriginalMember(owner = "client!ua", name = "T", descriptor = "I")
    public static volatile int field5259 = -1;

    @OriginalMember(owner = "client!ua", name = "bb", descriptor = "[Z")
    public static boolean[] field5267 = new boolean[100];

    @OriginalMember(owner = "client!ua", name = "F", descriptor = "I")
    public static int field5246;

    @OriginalMember(owner = "client!ua", name = "H", descriptor = "I")
    public static int field5248;

    @OriginalMember(owner = "client!ua", name = "M", descriptor = "I")
    public static int field5252;

    @OriginalMember(owner = "client!ua", name = "O", descriptor = "I")
    public static int field5254;

    @OriginalMember(owner = "client!ua", name = "P", descriptor = "I")
    private int field5255;

    @OriginalMember(owner = "client!ua", name = "Q", descriptor = "I")
    public static int field5256;

    @OriginalMember(owner = "client!ua", name = "S", descriptor = "I")
    public static int field5258;

    @OriginalMember(owner = "client!ua", name = "X", descriptor = "I")
    public static int field5263;

    @OriginalMember(owner = "client!ua", name = "Y", descriptor = "I")
    public static int field5264;

    @OriginalMember(owner = "client!ua", name = "Z", descriptor = "I")
    public static int field5265;

    @OriginalMember(owner = "client!ua", name = "cb", descriptor = "I")
    public static int field5268;

    @OriginalMember(owner = "client!ua", name = "G", descriptor = "Lnm;")
    public static class221 field5247;

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(I)Loh;", line = 11)
    public static final class187 method2297(int arg0) {
        if (arg0 != 0) {
            field5259 = -40;
        }
        field5264++;
        class187 var1;
        if (class245.field3886) {
            var1 = new class87(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], class105.field1522[0], class201.field3085);
        } else {
            var1 = new class239(class300.field4961, class96.field1400, class18.field228[0], class28.field419[0], class322.field5289[0], class94.field1379[0], class105.field1522[0], class201.field3085);
        }
        class167.method1164(false);
        return var1;
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(BI)[I", line = 35)
    public final int[] method25(byte arg0, int arg1) {
        int[] var3 = this.field21.method1258(arg1, 0);
        field5246++;
        if (arg0 < 57) {
            this.method2298(10, (int[][]) ((int[][]) null), (byte) -24, (Random) null, 19, -49, -36);
        }
        if (!this.field21.field2808) {
            return var3;
        }
        int[][] var4 = this.field21.method1259(-74);
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        boolean var10 = true;
        int var11 = 0;
        int var12 = 0;
        boolean var13 = true;
        int var14 = class326.field5342 * this.field5262 >> 12;
        int var15 = class308.field5010 * this.field5250 >> 12;
        int var16 = class326.field5342 * this.field5266 >> 12;
        int var17 = class308.field5010 * this.field5269 >> 12;
        if (var17 <= 1) {
            return var4[arg1];
        }
        int var18 = class326.field5342 / var16 + 1;
        int[][] var19 = new int[var18][3];
        this.field5255 = class326.field5342 / 8 * this.field5260 >> 12;
        Random var20 = new Random((long) this.field5261);
        int[][] var21 = new int[var18][3];
        while (true) {
            while (true) {
                int var22 = class4.method33(false, var20, var14 - var16) + var16;
                int var23 = class4.method33(false, var20, var17 - var15) + var15;
                int var24 = var8 + var22;
                if (var24 > class326.field5342) {
                    var24 = class326.field5342;
                    var22 = class326.field5342 - var8;
                }
                int var27;
                if (var13) {
                    var27 = 0;
                } else {
                    int var25 = var9;
                    int[] var26 = var21[var9];
                    var27 = var26[2];
                    int var28 = 0;
                    int var29 = var5 + var24;
                    if (var29 < 0) {
                        var29 += class326.field5342;
                    }
                    if (class326.field5342 < var29) {
                        var29 -= class326.field5342;
                    }
                    while (true) {
                        int[] var30 = var21[var25];
                        if (var30[0] <= var29 && var30[1] >= var29) {
                            if (var9 != var25) {
                                int var31 = var8 + var5;
                                if (var31 < 0) {
                                    var31 += class326.field5342;
                                }
                                if (var31 > class326.field5342) {
                                    var31 -= class326.field5342;
                                }
                                for (int var32 = 1; var32 <= var28; var32++) {
                                    int[] var33 = var21[(var9 + var32) % var12];
                                    var27 = Math.max(var27, var33[2]);
                                }
                                for (int var34 = 0; var34 <= var28; var34++) {
                                    int[] var35 = var21[(var9 + var34) % var12];
                                    int var36 = var35[2];
                                    if (var27 != var36) {
                                        int var37 = var35[0];
                                        int var38 = var35[1];
                                        int var39;
                                        int var40;
                                        if (var31 < var29) {
                                            var40 = Math.max(var31, var37);
                                            var39 = Math.min(var29, var38);
                                        } else if (var37 == 0) {
                                            var39 = Math.min(var29, var38);
                                            var40 = 0;
                                        } else {
                                            var40 = Math.max(var31, var37);
                                            var39 = class326.field5342;
                                        }
                                        this.method2298(var27 - var36, var4, (byte) 81, var20, var7 + var40, var36, var39 - var40);
                                    }
                                }
                            }
                            var9 = var25;
                            break;
                        }
                        var25++;
                        if (var12 <= var25) {
                            var25 = 0;
                        }
                        var28++;
                    }
                }
                if ((var27 + var23) <= class308.field5010) {
                    var10 = false;
                } else {
                    var23 = class308.field5010 - var27;
                }
                if (class326.field5342 == var24) {
                    this.method2298(var23, var4, (byte) 81, var20, var6 + var8, var27, var22);
                    if (var10) {
                        return var3;
                    }
                    var9 = 0;
                    var10 = true;
                    int[] var41 = var19[var11++];
                    var7 = var6;
                    var41[1] = var24;
                    var13 = false;
                    var41[0] = var8;
                    int[][] var42 = var21;
                    var41[2] = var23 + var27;
                    var12 = var11;
                    var6 = class4.method33(false, var20, class326.field5342);
                    var11 = 0;
                    var21 = var19;
                    var5 = var6 - var7;
                    var19 = var42;
                    var8 = 0;
                    int var43 = var5;
                    if (var5 < 0) {
                        var43 = class326.field5342 + var5;
                    }
                    if (var43 > class326.field5342) {
                        var43 -= class326.field5342;
                    }
                    while (true) {
                        int[] var44 = var21[var9];
                        if (var43 >= var44[0] && var43 <= var44[1]) {
                            break;
                        }
                        int var10000 = ~var12;
                        var9++;
                        if (var10000 >= ~var9) {
                            var9 = 0;
                        }
                    }
                } else {
                    int[] var45 = var19[var11++];
                    var45[1] = var24;
                    var45[2] = var23 + var27;
                    var45[0] = var8;
                    this.method2298(var23, var4, (byte) 55, var20, var8 + var6, var27, var22);
                    var8 = var24;
                }
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(I[[IBLjava/util/Random;III)V", line = 289)
    private final void method2298(int arg0, int[][] arg1, byte arg2, Random arg3, int arg4, int arg5, int arg6) {
        field5258++;
        int var8 = this.field5257 <= 0 ? 4096 : 4096 - class4.method33(false, arg3, this.field5257);
        int var9 = this.field5255 * this.field5251 >> 12;
        int var10 = this.field5255 - (var9 > 0 ? class4.method33(false, arg3, var9) : 0);
        if (arg2 < 34) {
            return;
        }
        if (class326.field5342 <= arg4) {
            arg4 -= class326.field5342;
        }
        if (var10 > 0) {
            if (arg0 <= 0 || arg6 <= 0) {
                return;
            }
            int var11 = arg6 / 2;
            int var12 = arg0 / 2;
            int var13 = var10 <= var12 ? var10 : var12;
            int var14 = var10 > var11 ? var11 : var10;
            int var15 = arg4 + var14;
            int var16 = arg6 - (var14 * 2);
            for (int var17 = 0; var17 < arg0; var17++) {
                int[] var18 = arg1[var17 + arg5];
                if (var13 <= var17) {
                    int var19 = arg0 - var17 - 1;
                    if (var13 <= var19) {
                        for (int var20 = 0; var20 < var14; var20++) {
                            var18[class235.method1623(class5.field70, arg4 + var20)] = var18[class235.method1623(arg4 + arg6 - var20 - 1, class5.field70)] = var8 * var20 / var14;
                        }
                        if ((var15 + var16) <= class326.field5342) {
                            class298.method2106(var18, var15, var16, var8);
                        } else {
                            int var21 = class326.field5342 - var15;
                            class298.method2106(var18, var15, var21, var8);
                            class298.method2106(var18, 0, var16 - var21, var8);
                        }
                    } else {
                        int var22 = var8 * var19 / var13;
                        if (this.field5253 == 0) {
                            for (int var23 = 0; var23 < var14; var23++) {
                                int var24 = var8 * var23 / var14;
                                var18[class235.method1623(arg4 + var23, class5.field70)] = var18[class235.method1623(arg4 - var23 - (-arg6 - -1), class5.field70)] = var22 * var24 >> 12;
                            }
                        } else {
                            for (int var25 = 0; var25 < var14; var25++) {
                                int var26 = var8 * var25 / var14;
                                var18[class235.method1623(arg4 + var25, class5.field70)] = var18[class235.method1623(class5.field70, arg4 + arg6 - var25 - 1)] = var22 > var26 ? var26 : var22;
                            }
                        }
                        if ((var15 + var16) <= class326.field5342) {
                            class298.method2106(var18, var15, var16, var22);
                        } else {
                            int var27 = class326.field5342 - var15;
                            class298.method2106(var18, var15, var27, var22);
                            class298.method2106(var18, 0, var16 - var27, var22);
                        }
                    }
                } else {
                    int var28 = var8 * var17 / var13;
                    if (this.field5253 == 0) {
                        for (int var29 = 0; var29 < var14; var29++) {
                            int var30 = var8 * var29 / var14;
                            var18[class235.method1623(arg4 + var29, class5.field70)] = var18[class235.method1623(class5.field70, arg4 + arg6 - var29 - 1)] = var28 * var30 >> 12;
                        }
                    } else {
                        for (int var31 = 0; var31 < var14; var31++) {
                            int var32 = var8 * var31 / var14;
                            var18[class235.method1623(arg4 + var31, class5.field70)] = var18[class235.method1623(arg4 + arg6 - var31 - 1, class5.field70)] = var28 > var32 ? var32 : var28;
                        }
                    }
                    if (class326.field5342 >= var15 + var16) {
                        class298.method2106(var18, var15, var16, var28);
                    } else {
                        int var33 = class326.field5342 - var15;
                        class298.method2106(var18, var15, var33, var28);
                        class298.method2106(var18, 0, var16 - var33, var28);
                    }
                }
            }
        } else if (arg4 + arg6 <= class326.field5342) {
            for (int var34 = 0; var34 < arg0; var34++) {
                class298.method2106(arg1[arg5 + var34], arg4, arg6, var8);
            }
        } else {
            int var35 = class326.field5342 - arg4;
            for (int var36 = 0; var36 < arg0; var36++) {
                int[] var37 = arg1[arg5 + var36];
                class298.method2106(var37, arg4, var35, var8);
                class298.method2106(var37, 0, arg6 - var35, var8);
            }
        }
    }

    @OriginalMember(owner = "client!ua", name = "e", descriptor = "(B)V", line = 487)
    public static void method2299(byte arg0) {
        field5267 = null;
        field5247 = null;
        field5249 = null;
        if (arg0 < 126) {
            method2303((class313) null, (byte) 36);
        }
    }

    @OriginalMember(owner = "client!ua", name = "<init>", descriptor = "()V", line = 499)
    public class319() {
        super(0, true);
    }

    @OriginalMember(owner = "client!ua", name = "b", descriptor = "(II)V", line = 504)
    public static final void method2300(int arg0, int arg1) {
        field5268++;
        class211 var2 = class17.method115(1, arg0, 4086);
        var2.method1435((byte) -2);
        if (arg1 > -65) {
            field5259 = 81;
        }
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lfh;IZ)V", line = 539)
    public final void method14(class313 arg0, int arg1, boolean arg2) {
        if (arg1 == 0) {
            this.field5261 = arg0.method2224(-128);
        } else if (arg1 == 1) {
            this.field5266 = arg0.method2250(-1613178296);
        } else if (arg1 == 2) {
            this.field5262 = arg0.method2250(-1613178296);
        } else if (arg1 == 3) {
            this.field5250 = arg0.method2250(-1613178296);
        } else if (arg1 == 4) {
            this.field5269 = arg0.method2250(-1613178296);
        } else if (arg1 == 5) {
            this.field5260 = arg0.method2250(-1613178296);
        } else if (arg1 == 6) {
            this.field5253 = arg0.method2224(-125);
        } else if (arg1 == 7) {
            this.field5251 = arg0.method2250(-1613178296);
        } else if (arg1 == 8) {
            this.field5257 = arg0.method2250(-1613178296);
        }
        field5256++;
        if (arg2) {
            field5259 = -52;
        }
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(B)V", line = 611)
    public static final void method2301(byte arg0) {
        class171.method1179();
        int var1 = -74 / ((arg0 - 33) / 44);
        field5263++;
        for (int var2 = 0; var2 < 4; var2++) {
            class124.field1860[var2].method1119(-16746);
        }
        System.gc();
    }

    @OriginalMember(owner = "client!ua", name = "d", descriptor = "(B)V", line = 639)
    public final void method20(byte arg0) {
        field5265++;
        int var2 = 33 % ((arg0 + 20) / 58);
    }

    @OriginalMember(owner = "client!ua", name = "f", descriptor = "(I)V", line = 665)
    public static final void method2302(int arg0) {
        if (arg0 != -8846) {
            method2301((byte) -44);
        }
        field5252++;
        class41.field627.method651(0);
    }

    @OriginalMember(owner = "client!ua", name = "a", descriptor = "(Lfh;B)V", line = 690)
    public static final void method2303(class313 arg0, byte arg1) {
        field5248++;
        int var2 = arg0.method2201(arg1 + 244);
        class178.field2782 = new class307[var2];
        if (arg1 != -116) {
            return;
        }
        for (int var3 = 0; var3 < var2; var3++) {
            class178.field2782[var3] = new class307();
            class178.field2782[var3].field5003 = arg0.method2201(128);
            class178.field2782[var3].field5004 = arg0.method2230(arg1 - 5733);
        }
        class198.field3043 = arg0.method2201(arg1 ^ 0xFFFFFF0C);
        class270.field4451 = arg0.method2201(128);
        class249.field3967 = arg0.method2201(arg1 + 244);
        class266.field4377 = new class201[class270.field4451 + 1 - class198.field3043];
        for (int var4 = 0; var4 < class249.field3967; var4++) {
            int var5 = arg0.method2201(128);
            class201 var6 = class266.field4377[var5] = new class201();
            var6.field3150 = arg0.method2224(-123);
            var6.field3147 = arg0.method2231((byte) -124);
            var6.field3097 = class198.field3043 + var5;
            var6.field3092 = arg0.method2230(arg1 ^ 0x16AB);
            var6.field3087 = arg0.method2230(-5849);
        }
        class101.field1460 = arg0.method2231((byte) -126);
        class25.field379 = true;
    }
}
