import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rm")
public class class246 {

    @OriginalMember(owner = "client!rm", name = "r", descriptor = "Ljava/lang/String;")
    public static String field3810 = "white:";

    @OriginalMember(owner = "client!rm", name = "u", descriptor = "Lj;")
    public static class285 field3813 = new class285(16);

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "I")
    public static int field3793;

    @OriginalMember(owner = "client!rm", name = "c", descriptor = "I")
    public static int field3795;

    @OriginalMember(owner = "client!rm", name = "d", descriptor = "I")
    public static int field3796;

    @OriginalMember(owner = "client!rm", name = "e", descriptor = "I")
    public static int field3797;

    @OriginalMember(owner = "client!rm", name = "f", descriptor = "I")
    public static int field3798;

    @OriginalMember(owner = "client!rm", name = "h", descriptor = "I")
    public static int field3800;

    @OriginalMember(owner = "client!rm", name = "i", descriptor = "I")
    public static int field3801;

    @OriginalMember(owner = "client!rm", name = "j", descriptor = "I")
    public static int field3802;

    @OriginalMember(owner = "client!rm", name = "n", descriptor = "I")
    private int field3806;

    @OriginalMember(owner = "client!rm", name = "p", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!rm", name = "q", descriptor = "I")
    public int field3809;

    @OriginalMember(owner = "client!rm", name = "t", descriptor = "I")
    public static int field3812;

    @OriginalMember(owner = "client!rm", name = "v", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "J")
    private long field3794;

    @OriginalMember(owner = "client!rm", name = "g", descriptor = "J")
    private long field3799;

    @OriginalMember(owner = "client!rm", name = "o", descriptor = "Z")
    public boolean field3807;

    @OriginalMember(owner = "client!rm", name = "k", descriptor = "[I")
    private int[] field3803;

    @OriginalMember(owner = "client!rm", name = "l", descriptor = "[I")
    private int[] field3804;

    @OriginalMember(owner = "client!rm", name = "s", descriptor = "[I")
    public static int[] field3811;

    @OriginalMember(owner = "client!rm", name = "m", descriptor = "[[I")
    private int[][] field3805;

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(I)I", line = 4)
    public final int method1742(int arg0) {
        field3793++;
        if (arg0 != 18208) {
            method1746(-123, (byte) 118, -41, 61, 17, -110);
        }
        return this.field3809 == -1 ? (this.field3804[11] << 5) + (this.field3804[8] << 10) + (this.field3804[0] << 15) + (this.field3803[0] << 25) + (this.field3803[4] << 20) + this.field3804[1] : class17.method145((byte) -117, this.field3809).field3299 + 305419896;
    }

    @OriginalMember(owner = "client!rm", name = "b", descriptor = "(I)V", line = 19)
    public static void method1743(int arg0) {
        field3810 = null;
        field3811 = null;
        field3813 = null;
        if (arg0 != -16973) {
            method1743(72);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(ZI)V", line = 31)
    public final void method1744(boolean arg0, int arg1) {
        this.field3807 = arg0;
        field3801++;
        if (arg1 != 4) {
            this.field3803 = (int[]) null;
        }
        this.method1749((byte) -49);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBI)V", line = 43)
    public final void method1745(int arg0, byte arg1, int arg2) {
        field3795++;
        if (arg1 != 71) {
            return;
        }
        int var4 = class120.field1929[arg2];
        if (this.field3804[var4] != 0 && class204.method1492(-114, arg0) != null) {
            this.field3804[var4] = class94.method673(Integer.MIN_VALUE, arg0);
            this.method1749((byte) -2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IBIIII)V", line = 63)
    public static final void method1746(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg1 != -37) {
            field3814 = 79;
        }
        class292.field4450 = arg3;
        class11.field187 = arg2;
        class250.field3861 = arg4;
        field3800++;
        class23.field404 = arg0;
        class137.field2176 = arg5;
        if (class11.field187 >= 100) {
            int var6 = class292.field4450 * 128 + 64;
            int var7 = class23.field404 * 128 + 64;
            int var8 = class48.method374(var7, var6, 126, class41.field734) - class137.field2176;
            int var9 = var6 - class140.field2223;
            int var10 = var7 - class312.field4904;
            int var11 = var8 - class48.field801;
            int var12 = (int) Math.sqrt((double) (var9 * var9 + var10 * var10));
            class181.field2891 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 0x7FF;
            class103.field1746 = (int) (-325.949D * Math.atan2((double) var9, (double) var10)) & 0x7FF;
            if (class181.field2891 < 128) {
                class181.field2891 = 128;
            }
            if (class181.field2891 > 383) {
                class181.field2891 = 383;
            }
        }
        class62.field960 = 2;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIILjh;B)Lfa;", line = 114)
    public final class199 method1747(int arg0, int arg1, int arg2, class269 arg3, byte arg4) {
        field3796++;
        if (this.field3809 != -1) {
            return class17.method145((byte) -111, this.field3809).method1512(arg1, arg2, arg3, (byte) -23, arg0);
        }
        class199 var6 = (class199) class205.field3248.method1830(this.field3799, (byte) 52);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field3804[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((var9 & Integer.MIN_VALUE) != 0 && !class204.method1492(-72, var9 & 0x3FFFFFFF).method215(-26448)) {
                        var7 = true;
                    }
                } else if (!class208.method1521(-1361, var9 & 0x3FFFFFFF).method1329(-5889, this.field3807)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            int var10 = 0;
            class130[] var11 = new class130[12];
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field3804[var12];
                if ((var13 & 0x40000000) != 0) {
                    class130 var15 = class208.method1521(-1361, var13 & 0x3FFFFFFF).method1326((byte) -112, this.field3807);
                    if (var15 != null) {
                        var11[var10++] = var15;
                    }
                } else if ((var13 & Integer.MIN_VALUE) != 0) {
                    class130 var14 = class204.method1492(-98, var13 & 0x3FFFFFFF).method217(106);
                    if (var14 != null) {
                        var11[var10++] = var14;
                    }
                }
            }
            class130 var16 = new class130(var11, var10);
            for (int var17 = 0; var17 < 5; var17++) {
                if (this.field3803[var17] < class107.field1781[var17].length) {
                    var16.method971(class143.field2257[var17], class107.field1781[var17][this.field3803[var17]]);
                }
                if (this.field3803[var17] < class211.field3370[var17].length) {
                    var16.method971(class310.field4881[var17], class211.field3370[var17][this.field3803[var17]]);
                }
            }
            var6 = var16.method976(64, 768, -50, -10, -50);
            class205.field3248.method1831(this.field3799, var6, -13897);
        }
        if (arg3 != null) {
            var6 = arg3.method1943(arg0, arg2, true, var6, arg1);
        }
        if (arg4 < 12) {
            this.field3803 = (int[]) null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "([I[IIIIZ)V", line = 235)
    public final void method1748(int[] arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field3806 != arg2) {
            this.field3806 = arg2;
            this.field3805 = (int[][]) null;
        }
        field3798++;
        if (arg0 == null) {
            arg0 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class306.field4807; var8++) {
                    class31 var9 = class204.method1492(-128, var8);
                    if (var9 != null && !var9.field514 && (arg5 ? class264.field4091[var7] : class84.field1251[var7]) == var9.field528) {
                        arg0[class120.field1929[var7]] = class94.method673(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field3803 = arg1;
        this.field3807 = arg5;
        this.field3809 = arg3;
        this.field3804 = arg0;
        this.method1749((byte) 124);
        if (arg4 != -757782704) {
            field3813 = (class285) null;
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(B)V", line = 287)
    private final void method1749(byte arg0) {
        long var2 = this.field3799;
        this.field3799 = -1L;
        field3808++;
        long[] var4 = class60.field944;
        this.field3799 = this.field3799 >>> 8 ^ var4[(int) ((this.field3799 ^ (long) (this.field3806 >> 8)) & 0xFFL)];
        this.field3799 = this.field3799 >>> 8 ^ var4[(int) ((this.field3799 ^ (long) this.field3806) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field3799 = var4[(int) ((this.field3799 ^ (long) (this.field3804[var5] >> 24)) & 0xFFL)] ^ this.field3799 >>> 8;
            this.field3799 = var4[(int) ((this.field3799 ^ (long) (this.field3804[var5] >> 16)) & 0xFFL)] ^ this.field3799 >>> 8;
            this.field3799 = this.field3799 >>> 8 ^ var4[(int) (((long) (this.field3804[var5] >> 8) ^ this.field3799) & 0xFFL)];
            this.field3799 = var4[(int) ((this.field3799 ^ (long) this.field3804[var5]) & 0xFFL)] ^ this.field3799 >>> 8;
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field3799 = this.field3799 >>> 8 ^ var4[(int) (((long) this.field3803[var6] ^ this.field3799) & 0xFFL)];
        }
        int var7 = -22 / ((arg0 - 83) / 40);
        this.field3799 = var4[(int) (((long) (this.field3807 ? 1 : 0) ^ this.field3799) & 0xFFL)] ^ this.field3799 >>> 8;
        if (var2 != 0L && this.field3799 != var2) {
            class68.field1092.method1834((byte) 54, var2);
        }
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IZI)V", line = 335)
    public final void method1750(int arg0, boolean arg1, int arg2) {
        field3797++;
        this.field3803[arg0] = arg2;
        if (arg1) {
            this.field3803 = (int[]) null;
        }
        this.method1749((byte) 124);
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(III[Lrj;IILjh;ZILjh;I)Lfa;", line = 354)
    public final class199 method1751(int arg0, int arg1, int arg2, class18[] arg3, int arg4, int arg5, class269 arg6, boolean arg7, int arg8, class269 arg9, int arg10) {
        field3802++;
        if (this.field3809 != -1) {
            return class17.method145((byte) -115, this.field3809).method1511(arg4, arg10, arg5, arg2, arg0 - 923, arg1, arg9, arg3, arg6, arg8);
        }
        long var12 = this.field3799;
        int[] var14 = this.field3804;
        if (arg9 != null && (arg9.field4186 >= 0 || arg9.field4190 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field3804[var15];
            }
            if (arg9.field4186 >= 0) {
                if (arg9.field4186 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class94.method673(arg9.field4186, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg9.field4190 >= 0) {
                if (arg9.field4190 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class94.method673(1073741824, arg9.field4190);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class199 var16 = (class199) class68.field1092.method1830(var12, (byte) 52);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class204.method1492(arg0 - 17619, var19 & 0x3FFFFFFF).method219(arg0 ^ 0x1227)) {
                        var17 = true;
                    }
                } else if (!class208.method1521(arg0 ^ 0xFFFFBEF4, var19 & 0x3FFFFFFF).method1341(false, this.field3807)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field3794 != -1L) {
                    var16 = (class199) class68.field1092.method1830(this.field3794, (byte) 52);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class130[] var20 = new class130[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class130 var24 = class208.method1521(-1361, var22 & 0x3FFFFFFF).method1334(this.field3807, -114);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class130 var23 = class204.method1492(arg0 ^ 0xFFFFBB9E, var22 & 0x3FFFFFFF).method216(arg0 ^ 0x445B);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    }
                }
                class63 var25 = null;
                if (this.field3806 != -1) {
                    var25 = class65.method497(1886497452, this.field3806);
                }
                if (var25 != null && var25.field1002 != null) {
                    for (int var26 = 0; var26 < var25.field1002.length; var26++) {
                        if (var25.field1002[var26] != null && var20[var26] != null) {
                            int var27 = var25.field1002[var26][0];
                            int var28 = var25.field1002[var26][2];
                            int var29 = var25.field1002[var26][1];
                            int var30 = var25.field1002[var26][3];
                            int var31 = var25.field1002[var26][5];
                            int var32 = var25.field1002[var26][4];
                            if (this.field3805 == null) {
                                this.field3805 = new int[var25.field1002.length][];
                            }
                            if (this.field3805[var26] == null) {
                                int[] var33 = this.field3805[var26] = new int[15];
                                if (var30 == 0 && var32 == 0 && var31 == 0) {
                                    var33[13] = -var29;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[14] = -var28;
                                    var33[12] = -var27;
                                } else {
                                    int var34 = class174.field2732[var30] >> 1;
                                    int var35 = class174.field2731[var30] >> 1;
                                    int var36 = class174.field2732[var32] >> 1;
                                    int var37 = class174.field2732[var31] >> 1;
                                    int var38 = class174.field2731[var31] >> 1;
                                    int var39 = class174.field2731[var32] >> 1;
                                    var33[5] = -var35;
                                    var33[2] = var34 * var39 + 16384 >> 15;
                                    var33[3] = var34 * var38 + 16384 >> 15;
                                    int var40 = var35 * var37 + 16384 >> 15;
                                    var33[8] = var34 * var36 + 16384 >> 15;
                                    var33[7] = -var38 * -var39 + var36 * var40 + 16384 >> 15;
                                    int var41 = var35 * var38 + 16384 >> 15;
                                    var33[4] = var34 * var37 + 16384 >> 15;
                                    var33[6] = -var39 * var37 + var36 * var41 + 16384 >> 15;
                                    var33[1] = var39 * var40 + (-var38 * var36 + 16384) >> 15;
                                    var33[0] = var36 * var37 + var39 * var41 + 16384 >> 15;
                                    var33[13] = var33[1] * -var27 + (var33[4] * -var29 + (var33[7] * -var28)) + 16384 >> 15;
                                    var33[12] = var33[3] * -var29 + var33[0] * -var27 + (var33[6] * -var28 - -16384) >> 15;
                                    var33[14] = var33[8] * -var28 + var33[5] * -var29 + var33[2] * -var27 + 16384 >> 15;
                                }
                                var33[11] = var28;
                                var33[10] = var29;
                                var33[9] = var27;
                            }
                            if (var30 != 0 || var32 != 0 || var31 != 0) {
                                var20[var26].method968(var30, var32, var31);
                            }
                            if (var27 != 0 || var29 != 0 || var28 != 0) {
                                var20[var26].method987(var27, var29, var28);
                            }
                        }
                    }
                }
                class130 var42 = new class130(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (class107.field1781[var43].length > this.field3803[var43]) {
                        var42.method971(class143.field2257[var43], class107.field1781[var43][this.field3803[var43]]);
                    }
                    if (this.field3803[var43] < class211.field3370[var43].length) {
                        var42.method971(class310.field4881[var43], class211.field3370[var43][this.field3803[var43]]);
                    }
                }
                var16 = var42.method976(64, 850, -30, -50, -30);
                if (class265.field4126) {
                    ((class171) var16).method1268(false, false, true, true, false, false, true);
                }
                if (arg7) {
                    class68.field1092.method1831(var12, var16, arg0 ^ 0xFFFF8DEC);
                    this.field3794 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = false;
        int var47 = arg3 == null ? 0 : arg3.length;
        boolean var48 = false;
        for (int var49 = 0; var49 < var47; var49++) {
            if (arg3[var49] != null) {
                class269 var50 = class6.method28(arg3[var49].field347, 2);
                if (var50.field4183 != null) {
                    class48.field803[var49] = var50;
                    int var51 = arg3[var49].field341;
                    var44 = true;
                    int var52 = arg3[var49].field349;
                    int var53 = var50.field4183[var51];
                    class173.field2716[var49] = class240.method1702((byte) -98, var53 >>> 16);
                    int var54 = var53 & 0xFFFF;
                    class220.field3521[var49] = var54;
                    if (class173.field2716[var49] != null) {
                        var48 |= class173.field2716[var49].method2156(var54, arg0 ^ 0xFFFFBBA2);
                        var45 |= class173.field2716[var49].method2154(var54, arg0 ^ 0xFFFFBBD3);
                        var46 |= var50.field4171;
                    }
                    if ((var50.field4177 || class68.field1094) && var52 != -1 && var52 < var50.field4183.length) {
                        class55.field875[var49] = var50.field4165[var51];
                        class33.field550[var49] = arg3[var49].field351;
                        int var55 = var50.field4183[var52];
                        class10.field160[var49] = class240.method1702((byte) -98, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class232.field3678[var49] = var56;
                        if (class10.field160[var49] != null) {
                            var48 |= class10.field160[var49].method2156(var56, 26);
                            var45 |= class10.field160[var49].method2154(var56, -110);
                        }
                    } else {
                        class55.field875[var49] = 0;
                        class33.field550[var49] = 0;
                        class10.field160[var49] = null;
                        class232.field3678[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg9 == null && arg6 == null) {
            return var16;
        }
        int var57 = -1;
        int var58 = 0;
        int var59 = -1;
        class312 var60 = null;
        class312 var61 = null;
        if (arg9 != null) {
            int var62 = arg9.field4183[arg1];
            int var63 = var62 >>> 16;
            var57 = var62 & 0xFFFF;
            var60 = class240.method1702((byte) -98, var63);
            if (var60 != null) {
                var48 |= var60.method2156(var57, arg0 ^ 0xFFFFBBA2);
                var45 |= var60.method2154(var57, -99);
                var46 |= arg9.field4171;
            }
            if ((arg9.field4177 || class68.field1094) && arg10 != -1 && arg9.field4183.length > arg10) {
                var58 = arg9.field4165[arg1];
                int var64 = arg9.field4183[arg10];
                int var65 = var64 >>> 16;
                var59 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var60;
                } else {
                    var61 = class240.method1702((byte) -98, var59 >>> 16);
                }
                if (var61 != null) {
                    var48 |= var61.method2156(var59, 120);
                    var45 |= var61.method2154(var59, -112);
                }
            }
        }
        int var66 = -1;
        int var67 = -1;
        int var68 = 0;
        class312 var69 = null;
        class312 var70 = null;
        if (arg6 != null) {
            int var71 = arg6.field4183[arg2];
            int var72 = var71 >>> 16;
            var69 = class240.method1702((byte) -98, var72);
            var66 = var71 & 0xFFFF;
            if (var69 != null) {
                var48 |= var69.method2156(var66, arg0 - 17584);
                var45 |= var69.method2154(var66, -76);
                var46 |= arg6.field4171;
            }
            if ((arg6.field4177 || class68.field1094) && arg8 != -1 && arg8 < arg6.field4183.length) {
                var68 = arg6.field4165[arg2];
                int var73 = arg6.field4183[arg8];
                int var74 = var73 >>> 16;
                var67 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var70 = var69;
                } else {
                    var70 = class240.method1702((byte) -98, var67 >>> 16);
                }
                if (var70 != null) {
                    var48 |= var70.method2156(var67, arg0 ^ 0x4421);
                    var45 |= var70.method2154(var67, -128);
                }
            }
        }
        class199 var75 = var16.method1133(!var45, !var48, !var46);
        int var76 = 0;
        int var77 = 1;
        while (var76 < var47) {
            if (class173.field2716[var76] != null) {
                var75.method1445(class173.field2716[var76], class220.field3521[var76], class10.field160[var76], class232.field3678[var76], class33.field550[var76] - 1, class55.field875[var76], var77, class48.field803[var76].field4171, this.field3805[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var60 != null && var69 != null) {
            var75.method1447(var60, var57, var61, var59, arg4 - 1, var58, var69, var66, var70, var67, arg5 - 1, var68, arg9.field4162, arg6.field4171 | arg9.field4171);
        } else if (var60 != null) {
            var75.method1444(var60, var57, var61, var59, arg4 - 1, var58, arg9.field4171);
        } else if (var69 != null) {
            var75.method1444(var69, var66, var70, var67, arg5 - 1, var68, arg6.field4171);
        }
        for (int var78 = 0; var78 < var47; var78++) {
            class173.field2716[var78] = null;
            class10.field160[var78] = null;
            class48.field803[var78] = null;
        }
        if (arg0 != 17499) {
            field3814 = -23;
        }
        return var75;
    }

    @OriginalMember(owner = "client!rm", name = "a", descriptor = "(IIIBIIILjh;)Lfa;", line = 838)
    public final class199 method1752(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, class269 arg7) {
        int var9 = 127 / ((arg3 + 65) / 44);
        long var10 = (long) arg6 << 32 | (long) (arg0 << 16) | (long) arg1;
        field3812++;
        class199 var12 = (class199) class205.field3248.method1830(var10, (byte) 52);
        if (var12 == null) {
            class130[] var13 = new class130[3];
            int var14 = 0;
            if (!class204.method1492(-105, arg1).method215(-26448) || !class204.method1492(-73, arg0).method215(-26448) || !class204.method1492(-62, arg6).method215(-26448)) {
                return null;
            }
            class130 var15 = class204.method1492(-121, arg1).method217(86);
            if (var15 != null) {
                var13[var14++] = var15;
            }
            class130 var16 = class204.method1492(-100, arg0).method217(39);
            if (var16 != null) {
                var13[var14++] = var16;
            }
            class130 var17 = class204.method1492(-68, arg6).method217(109);
            if (var17 != null) {
                var13[var14++] = var17;
            }
            class130 var18 = new class130(var13, var14);
            for (int var19 = 0; var19 < 5; var19++) {
                if (this.field3803[var19] < class107.field1781[var19].length) {
                    var18.method971(class143.field2257[var19], class107.field1781[var19][this.field3803[var19]]);
                }
                if (this.field3803[var19] < class211.field3370[var19].length) {
                    var18.method971(class310.field4881[var19], class211.field3370[var19][this.field3803[var19]]);
                }
            }
            var12 = var18.method976(64, 768, -50, -10, -50);
            class205.field3248.method1831(var10, var12, -13897);
        }
        if (arg7 != null) {
            var12 = arg7.method1943(arg2, arg5, true, var12, arg4);
        }
        return var12;
    }
}
