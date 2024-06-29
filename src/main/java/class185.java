import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pj")
public class class185 extends class17 {

    @OriginalMember(owner = "client!pj", name = "jb", descriptor = "I")
    private int field3400 = 6;

    @OriginalMember(owner = "client!pj", name = "bb", descriptor = "Lsf;")
    private static class108 field3392 = class140.method973(255, "Your friend list is full)3 Max of 100 for free users)1 and 200 for members)3");

    @OriginalMember(owner = "client!pj", name = "db", descriptor = "Lsf;")
    public static class108 field3394 = class140.method973(255, "Benutzeroberfl-=che geladen)3");

    @OriginalMember(owner = "client!pj", name = "eb", descriptor = "Lsf;")
    private static class108 field3395 = class140.method973(255, "slide:");

    @OriginalMember(owner = "client!pj", name = "ab", descriptor = "Lsf;")
    public static class108 field3391 = field3395;

    @OriginalMember(owner = "client!pj", name = "lb", descriptor = "[I")
    public static int[] field3402 = new int[2];

    @OriginalMember(owner = "client!pj", name = "ib", descriptor = "[J")
    public static long[] field3399 = new long[256];

    @OriginalMember(owner = "client!pj", name = "mb", descriptor = "Lsf;")
    public static class108 field3403 = class140.method973(255, "<col=ffb000>");

    @OriginalMember(owner = "client!pj", name = "pb", descriptor = "Lsf;")
    public static class108 field3406 = field3392;

    @OriginalMember(owner = "client!pj", name = "rb", descriptor = "Lsf;")
    public static class108 field3408 = field3395;

    @OriginalMember(owner = "client!pj", name = "sb", descriptor = "I")
    public static int field3409;

    @OriginalMember(owner = "client!pj", name = "cb", descriptor = "I")
    public static int field3393;

    @OriginalMember(owner = "client!pj", name = "fb", descriptor = "I")
    public static int field3396;

    @OriginalMember(owner = "client!pj", name = "gb", descriptor = "I")
    public static int field3397;

    @OriginalMember(owner = "client!pj", name = "hb", descriptor = "I")
    public static int field3398;

    @OriginalMember(owner = "client!pj", name = "kb", descriptor = "I")
    public static int field3401;

    @OriginalMember(owner = "client!pj", name = "nb", descriptor = "I")
    public static int field3404;

    @OriginalMember(owner = "client!pj", name = "ob", descriptor = "I")
    public static int field3405;

    @OriginalMember(owner = "client!pj", name = "qb", descriptor = "I")
    public static int field3407;

    @OriginalMember(owner = "client!pj", name = "c", descriptor = "(Z)V", line = 5)
    public static void method1330(boolean arg0) {
        field3391 = null;
        field3402 = null;
        field3403 = null;
        field3392 = null;
        field3399 = null;
        if (arg0) {
            method1332(122, -14, -26, 43, -34);
        }
        field3395 = null;
        field3408 = null;
        field3406 = null;
        field3394 = null;
    }

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            long var1 = (long) var0;
            for (int var3 = 0; var3 < 8; var3++) {
                if ((var1 & 0x1L) == 1L) {
                    var1 = var1 >>> 1 ^ 0xC96C5795D7870F42L;
                } else {
                    var1 >>>= 0x1;
                }
            }
            field3399[var0] = var1;
        }
        field3409 = -1;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIII)V", line = 28)
    public static final void method1331(int arg0, int arg1, int arg2, int arg3) {
        class120 var4 = class248.method1704(11, arg3 ^ 0x6C, arg0);
        field3398++;
        if (arg3 == 0) {
            var4.method844((byte) -28);
            var4.field2067 = arg2;
            var4.field2066 = arg1;
        }
    }

    @OriginalMember(owner = "client!pj", name = "<init>", descriptor = "()V", line = 47)
    public class185() {
        super(2, false);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(IIIII)V", line = 52)
    public static final void method1332(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = -124 % ((61 - arg3) / 52);
        field3405++;
        if (class318.field5466 == 1) {
            class223.field3948[class259.field4578 / 100].method81(class54.field792 - 8, class307.field5344 - 8);
        }
        if (class318.field5466 == 2) {
            class223.field3948[class259.field4578 / 100 + 4].method81(class54.field792 - 8, class307.field5344 - 8);
        }
        class274.method1977((byte) 92);
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(ZI)[[I", line = 77)
    public final int[][] method122(boolean arg0, int arg1) {
        if (arg0) {
            field3409 = -127;
        }
        field3407++;
        int[][] var3 = this.field224.method2081(arg1, -63);
        if (this.field224.field5106) {
            int[][] var4 = this.method111(3, arg1, 0);
            int[][] var5 = this.method111(3, arg1, 1);
            int[] var6 = var3[0];
            int[] var7 = var3[1];
            int[] var8 = var4[0];
            int[] var9 = var4[1];
            int[] var10 = var3[2];
            int[] var11 = var5[0];
            int[] var12 = var4[2];
            int[] var13 = var5[1];
            int[] var14 = var5[2];
            int var15 = this.field3400;
            if (var15 == 1) {
                for (int var16 = 0; var16 < class116.field2008; var16++) {
                    var6[var16] = var8[var16] + var11[var16];
                    var7[var16] = var9[var16] + var13[var16];
                    var10[var16] = var12[var16] + var14[var16];
                }
            } else if (var15 == 2) {
                for (int var17 = 0; var17 < class116.field2008; var17++) {
                    var6[var17] = var8[var17] - var11[var17];
                    var7[var17] = var9[var17] - var13[var17];
                    var10[var17] = var12[var17] - var14[var17];
                }
            } else if (var15 == 3) {
                for (int var18 = 0; var18 < class116.field2008; var18++) {
                    var6[var18] = var8[var18] * var11[var18] >> 12;
                    var7[var18] = var9[var18] * var13[var18] >> 12;
                    var10[var18] = var12[var18] * var14[var18] >> 12;
                }
            } else if (var15 == 4) {
                for (int var60 = 0; var60 < class116.field2008; var60++) {
                    int var61 = var11[var60];
                    int var62 = var14[var60];
                    int var63 = var13[var60];
                    var6[var60] = var61 == 0 ? 4096 : (var8[var60] << 12) / var61;
                    var7[var60] = var63 == 0 ? 4096 : (var9[var60] << 12) / var63;
                    var10[var60] = var62 == 0 ? 4096 : (var12[var60] << 12) / var62;
                }
            } else if (var15 == 5) {
                for (int var19 = 0; var19 < class116.field2008; var19++) {
                    var6[var19] = 4096 - ((4096 - var8[var19]) * (4096 - var11[var19]) >> 12);
                    var7[var19] = 4096 - ((4096 - var13[var19]) * (4096 - var9[var19]) >> 12);
                    var10[var19] = 4096 - ((4096 - var12[var19]) * (4096 - var14[var19]) >> 12);
                }
            } else if (var15 == 6) {
                for (int var20 = 0; var20 < class116.field2008; var20++) {
                    int var21 = var11[var20];
                    int var22 = var13[var20];
                    int var23 = var14[var20];
                    var6[var20] = var21 < 2048 ? var8[var20] * var21 >> 11 : 4096 - ((4096 - var8[var20]) * (4096 - var21) >> 11);
                    var7[var20] = var22 >= 2048 ? 4096 - ((4096 - var9[var20]) * (4096 - var22) >> 11) : var9[var20] * var22 >> 11;
                    var10[var20] = var23 >= 2048 ? 4096 - ((4096 - var12[var20]) * (4096 - var23) >> 11) : var12[var20] * var23 >> 11;
                }
            } else if (var15 == 7) {
                for (int var56 = 0; var56 < class116.field2008; var56++) {
                    int var57 = var12[var56];
                    int var58 = var8[var56];
                    int var59 = var9[var56];
                    var6[var56] = var58 == 4096 ? 4096 : (var11[var56] << 12) / (4096 - var58);
                    var7[var56] = var59 == 4096 ? 4096 : (var13[var56] << 12) / (4096 - var59);
                    var10[var56] = var57 == 4096 ? 4096 : (var14[var56] << 12) / (4096 - var57);
                }
            } else if (var15 == 8) {
                for (int var24 = 0; var24 < class116.field2008; var24++) {
                    int var25 = var9[var24];
                    int var26 = var8[var24];
                    int var27 = var12[var24];
                    var6[var24] = var26 == 0 ? 0 : 4096 - ((4096 - var11[var24] << 12) / var26);
                    var7[var24] = var25 == 0 ? 0 : 4096 - ((4096 - var13[var24] << 12) / var25);
                    var10[var24] = var27 == 0 ? 0 : 4096 - ((4096 - var14[var24] << 12) / var27);
                }
            } else if (var15 == 9) {
                for (int var49 = 0; var49 < class116.field2008; var49++) {
                    int var50 = var13[var49];
                    int var51 = var11[var49];
                    int var52 = var14[var49];
                    int var53 = var8[var49];
                    int var54 = var12[var49];
                    int var55 = var9[var49];
                    var6[var49] = var51 <= var53 ? var51 : var53;
                    var7[var49] = var55 < var50 ? var55 : var50;
                    var10[var49] = var52 > var54 ? var54 : var52;
                }
            } else if (var15 == 10) {
                for (int var28 = 0; var28 < class116.field2008; var28++) {
                    int var29 = var13[var28];
                    int var30 = var8[var28];
                    int var31 = var9[var28];
                    int var32 = var11[var28];
                    int var33 = var12[var28];
                    int var34 = var14[var28];
                    var6[var28] = var32 < var30 ? var30 : var32;
                    var7[var28] = var31 > var29 ? var31 : var29;
                    var10[var28] = var34 < var33 ? var33 : var34;
                }
            } else if (var15 == 11) {
                for (int var35 = 0; var35 < class116.field2008; var35++) {
                    int var36 = var14[var35];
                    int var37 = var12[var35];
                    int var38 = var9[var35];
                    int var39 = var11[var35];
                    int var40 = var13[var35];
                    int var41 = var8[var35];
                    var6[var35] = var39 >= var41 ? var39 - var41 : -var39 + var41;
                    var7[var35] = var40 < var38 ? var38 - var40 : -var38 + var40;
                    var10[var35] = var37 > var36 ? var37 - var36 : -var37 + var36;
                }
            } else if (var15 == 12) {
                for (int var42 = 0; var42 < class116.field2008; var42++) {
                    int var43 = var9[var42];
                    int var44 = var11[var42];
                    int var45 = var14[var42];
                    int var46 = var12[var42];
                    int var47 = var8[var42];
                    int var48 = var13[var42];
                    var6[var42] = var44 + var47 - (var44 * var47 >> 11);
                    var7[var42] = var48 + var43 - (var43 * var48 >> 11);
                    var10[var42] = var46 - ((var45 * var46 >> 11) - var45);
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(Lmc;BLmc;)V", line = 389)
    public static final void method1333(class184 arg0, byte arg1, class184 arg2) {
        field3401++;
        if (arg0.field3376 != null) {
            arg0.method1325(0);
        }
        arg0.field3376 = arg2.field3376;
        arg0.field3373 = arg2;
        arg0.field3376.field3373 = arg0;
        int var3 = -19 / ((arg1 + 10) / 49);
        arg0.field3373.field3376 = arg0;
    }

    @OriginalMember(owner = "client!pj", name = "a", descriptor = "(BLrm;I)V", line = 407)
    public final void method114(byte arg0, class249 arg1, int arg2) {
        field3404++;
        if (arg2 == 0) {
            this.field3400 = arg1.method1731(true);
        } else if (arg2 == 1) {
            this.field225 = arg1.method1731(true) == 1;
        }
        if (arg0 != -114) {
            method1330(false);
        }
    }

    @OriginalMember(owner = "client!pj", name = "d", descriptor = "(II)[I", line = 457)
    public final int[] method120(int arg0, int arg1) {
        field3397++;
        int[] var3 = this.field217.method1698(115, arg1);
        if (this.field217.field4295) {
            int[] var4 = this.method124(68, 0, arg1);
            int[] var5 = this.method124(74, 1, arg1);
            int var6 = this.field3400;
            if (var6 == 1) {
                for (int var30 = 0; var30 < class116.field2008; var30++) {
                    var3[var30] = var4[var30] + var5[var30];
                }
            } else if (var6 == 2) {
                for (int var29 = 0; var29 < class116.field2008; var29++) {
                    var3[var29] = var4[var29] - var5[var29];
                }
            } else if (var6 == 3) {
                for (int var28 = 0; var28 < class116.field2008; var28++) {
                    var3[var28] = var4[var28] * var5[var28] >> 12;
                }
            } else if (var6 == 4) {
                for (int var7 = 0; var7 < class116.field2008; var7++) {
                    int var8 = var5[var7];
                    var3[var7] = var8 == 0 ? 4096 : (var4[var7] << 12) / var8;
                }
            } else if (var6 == 5) {
                for (int var27 = 0; var27 < class116.field2008; var27++) {
                    var3[var27] = 4096 - ((4096 - var4[var27]) * (4096 - var5[var27]) >> 12);
                }
            } else if (var6 == 6) {
                for (int var9 = 0; var9 < class116.field2008; var9++) {
                    int var10 = var5[var9];
                    var3[var9] = var10 < 2048 ? var4[var9] * var10 >> 11 : 4096 - ((4096 - var4[var9]) * (4096 - var10) >> 11);
                }
            } else if (var6 == 7) {
                for (int var25 = 0; var25 < class116.field2008; var25++) {
                    int var26 = var4[var25];
                    var3[var25] = var26 == 4096 ? 4096 : (var5[var25] << 12) / (4096 - var26);
                }
            } else if (var6 == 8) {
                for (int var11 = 0; var11 < class116.field2008; var11++) {
                    int var12 = var4[var11];
                    var3[var11] = var12 == 0 ? 0 : 4096 - ((4096 - var5[var11] << 12) / var12);
                }
            } else if (var6 == 9) {
                for (int var13 = 0; var13 < class116.field2008; var13++) {
                    int var14 = var4[var13];
                    int var15 = var5[var13];
                    var3[var13] = var15 <= var14 ? var15 : var14;
                }
            } else if (var6 == 10) {
                for (int var22 = 0; var22 < class116.field2008; var22++) {
                    int var23 = var4[var22];
                    int var24 = var5[var22];
                    var3[var22] = var24 >= var23 ? var24 : var23;
                }
            } else if (var6 == 11) {
                for (int var16 = 0; var16 < class116.field2008; var16++) {
                    int var17 = var4[var16];
                    int var18 = var5[var16];
                    var3[var16] = var17 > var18 ? var17 - var18 : var18 - var17;
                }
            } else if (var6 == 12) {
                for (int var19 = 0; var19 < class116.field2008; var19++) {
                    int var20 = var4[var19];
                    int var21 = var5[var19];
                    var3[var19] = var21 + var20 - (var20 * var21 >> 11);
                }
            }
        }
        return arg0 > -95 ? (int[]) null : var3;
    }
}
