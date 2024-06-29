import java.awt.Graphics;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sh")
public class class303 {

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "I")
    public static int field4727 = 0;

    @OriginalMember(owner = "client!sh", name = "e", descriptor = "I")
    public static int field4729 = 0;

    @OriginalMember(owner = "client!sh", name = "w", descriptor = "[Lij;")
    private static class90[] field4747 = new class90[14];

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "I")
    public static int field4725;

    @OriginalMember(owner = "client!sh", name = "g", descriptor = "I")
    public static int field4731;

    @OriginalMember(owner = "client!sh", name = "h", descriptor = "I")
    private int field4732;

    @OriginalMember(owner = "client!sh", name = "i", descriptor = "I")
    public int field4733;

    @OriginalMember(owner = "client!sh", name = "j", descriptor = "I")
    public static int field4734;

    @OriginalMember(owner = "client!sh", name = "m", descriptor = "I")
    public static int field4737;

    @OriginalMember(owner = "client!sh", name = "o", descriptor = "I")
    public static int field4739;

    @OriginalMember(owner = "client!sh", name = "p", descriptor = "I")
    public static int field4740;

    @OriginalMember(owner = "client!sh", name = "q", descriptor = "I")
    public static int field4741;

    @OriginalMember(owner = "client!sh", name = "r", descriptor = "I")
    public static int field4742;

    @OriginalMember(owner = "client!sh", name = "s", descriptor = "I")
    public static int field4743;

    @OriginalMember(owner = "client!sh", name = "t", descriptor = "I")
    public static int field4744;

    @OriginalMember(owner = "client!sh", name = "u", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!sh", name = "v", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "J")
    private long field4726;

    @OriginalMember(owner = "client!sh", name = "d", descriptor = "J")
    private long field4728;

    @OriginalMember(owner = "client!sh", name = "l", descriptor = "Z")
    public boolean field4736;

    @OriginalMember(owner = "client!sh", name = "f", descriptor = "[I")
    private int[] field4730;

    @OriginalMember(owner = "client!sh", name = "n", descriptor = "[I")
    public int[] field4738;

    @OriginalMember(owner = "client!sh", name = "k", descriptor = "[[I")
    private int[][] field4735;

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(III)V", line = 7)
    public final void method2116(int arg0, int arg1, int arg2) {
        field4742++;
        int var4 = class200.field3283[arg0];
        if (this.field4730[var4] == 0 || class323.method2251(124, arg2) == null) {
            return;
        }
        this.field4730[var4] = class24.method149(arg2, Integer.MIN_VALUE);
        this.method2124((byte) -109);
        if (arg1 != 16384) {
            this.method2124((byte) -5);
        }
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(III)V", line = 31)
    public final void method2117(int arg0, int arg1, int arg2) {
        this.field4738[arg1] = arg2;
        if (arg0 == 3) {
            field4743++;
            this.method2124((byte) -119);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ILv;IIIIII)Llf;", line = 51)
    public final class134 method2118(int arg0, class80 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field4746++;
        long var9 = (long) arg5 | (long) arg3 << 32 | (long) (arg2 << 16);
        class134 var11 = (class134) class89.field1362.method1619(var9, 100);
        if (var11 == null) {
            int var12 = 0;
            class259[] var13 = new class259[3];
            if (!class323.method2251(122, arg5).method2027(false) || !class323.method2251(118, arg2).method2027(false) || !class323.method2251(106, arg3).method2027(false)) {
                return null;
            }
            class259 var14 = class323.method2251(91, arg5).method2021(-128);
            if (var14 != null) {
                var13[var12++] = var14;
            }
            class259 var15 = class323.method2251(122, arg2).method2021(-128);
            if (var15 != null) {
                var13[var12++] = var15;
            }
            class259 var16 = class323.method2251(108, arg3).method2021(-128);
            if (var16 != null) {
                var13[var12++] = var16;
            }
            class259 var17 = new class259(var13, var12);
            for (int var18 = 0; var18 < 5; var18++) {
                if (this.field4738[var18] < class92.field1426[var18].length) {
                    var17.method1860(class204.field3329[var18], class92.field1426[var18][this.field4738[var18]]);
                }
                if (class299.field4664[var18].length > this.field4738[var18]) {
                    var17.method1860(class20.field305[var18], class299.field4664[var18][this.field4738[var18]]);
                }
            }
            var11 = var17.method1855(64, 768, -50, -10, -50);
            class89.field1362.method1621(var9, -118, var11);
        }
        if (arg0 <= 107) {
            this.method2123(true, -36);
        }
        if (arg1 != null) {
            var11 = arg1.method593(arg4, true, arg7, var11, arg6);
        }
        return var11;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(B)I", line = 120)
    public final int method2119(byte arg0) {
        int var2 = -64 / ((arg0 + 32) / 58);
        field4744++;
        return this.field4733 == -1 ? (this.field4730[8] << 10) + (this.field4738[0] << 25) + (this.field4730[11] << 5) + (this.field4738[4] << 20) + (this.field4730[0] << 15) + this.field4730[1] : class281.method1993(this.field4733, -3).field1801 + 305419896;
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(III)J", line = 133)
    public static final long method2120(int arg0, int arg1, int arg2) {
        class230 var3 = class251.field3996[arg0][arg1][arg2];
        return var3 == null || var3.field3675 == null ? 0L : var3.field3675.field677;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[Lkj;ZLv;IIIIIZLv;)Llf;", line = 142)
    public final class134 method2121(int arg0, class188[] arg1, boolean arg2, class80 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, boolean arg9, class80 arg10) {
        field4725++;
        if (this.field4733 != -1) {
            return class281.method1993(this.field4733, -3).method826(122, arg10, arg6, arg8, arg0, arg1, arg5, arg4, arg7, arg3);
        }
        long var12 = this.field4728;
        int[] var14 = this.field4730;
        if (arg3 != null && (arg3.field1226 >= 0 || arg3.field1193 >= 0)) {
            var14 = new int[12];
            for (int var15 = 0; var15 < 12; var15++) {
                var14[var15] = this.field4730[var15];
            }
            if (arg3.field1226 >= 0) {
                if (arg3.field1226 == 65535) {
                    var14[5] = 0;
                    var12 ^= 0xFFFFFFFF00000000L;
                } else {
                    var14[5] = class24.method149(arg3.field1226, 1073741824);
                    var12 ^= (long) var14[5] << 32;
                }
            }
            if (arg3.field1193 >= 0) {
                if (arg3.field1193 == 65535) {
                    var12 ^= 0xFFFFFFFFL;
                    var14[3] = 0;
                } else {
                    var14[3] = class24.method149(1073741824, arg3.field1193);
                    var12 ^= (long) var14[3];
                }
            }
        }
        class134 var16 = (class134) class80.field1201.method1619(var12, 84);
        if (var16 == null) {
            boolean var17 = false;
            for (int var18 = 0; var18 < 12; var18++) {
                int var19 = var14[var18];
                if ((var19 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var19) != 0 && !class323.method2251(115, var19 & 0x3FFFFFFF).method2028(12110)) {
                        var17 = true;
                    }
                } else if (!class31.method198(false, var19 & 0x3FFFFFFF).method484(!arg2, this.field4736)) {
                    var17 = true;
                }
            }
            if (var17) {
                if (this.field4726 != -1L) {
                    var16 = (class134) class80.field1201.method1619(this.field4726, 81);
                }
                if (var16 == null) {
                    return null;
                }
            }
            if (var16 == null) {
                class259[] var20 = new class259[12];
                for (int var21 = 0; var21 < 12; var21++) {
                    int var22 = var14[var21];
                    if ((var22 & 0x40000000) != 0) {
                        class259 var23 = class31.method198(arg2, var22 & 0x3FFFFFFF).method488(this.field4736, 2);
                        if (var23 != null) {
                            var20[var21] = var23;
                        }
                    } else if ((Integer.MIN_VALUE & var22) != 0) {
                        class259 var24 = class323.method2251(87, var22 & 0x3FFFFFFF).method2023(0);
                        if (var24 != null) {
                            var20[var21] = var24;
                        }
                    }
                }
                class206 var25 = null;
                if (this.field4732 != -1) {
                    var25 = class314.method2185((byte) -54, this.field4732);
                }
                if (var25 != null && var25.field3370 != null) {
                    for (int var26 = 0; var26 < var25.field3370.length; var26++) {
                        if (var25.field3370[var26] != null && var20[var26] != null) {
                            int var27 = var25.field3370[var26][0];
                            int var28 = var25.field3370[var26][3];
                            int var29 = var25.field3370[var26][2];
                            int var30 = var25.field3370[var26][1];
                            int var31 = var25.field3370[var26][4];
                            int var32 = var25.field3370[var26][5];
                            if (this.field4735 == null) {
                                this.field4735 = new int[var25.field3370.length][];
                            }
                            if (this.field4735[var26] == null) {
                                int[] var33 = this.field4735[var26] = new int[15];
                                if (var28 == 0 && var31 == 0 && var32 == 0) {
                                    var33[12] = -var27;
                                    var33[0] = var33[4] = var33[8] = 32768;
                                    var33[13] = -var30;
                                    var33[14] = -var29;
                                } else {
                                    int var34 = class25.field359[var28] >> 1;
                                    int var35 = class25.field355[var31] >> 1;
                                    int var36 = class25.field355[var28] >> 1;
                                    int var37 = class25.field359[var31] >> 1;
                                    int var38 = class25.field359[var32] >> 1;
                                    int var39 = class25.field355[var32] >> 1;
                                    var33[4] = var34 * var38 + 16384 >> 15;
                                    var33[3] = var34 * var39 + 16384 >> 15;
                                    var33[2] = var34 * var35 + 16384 >> 15;
                                    var33[5] = -var36;
                                    var33[8] = var34 * var37 + 16384 >> 15;
                                    int var40 = var36 * var38 + 16384 >> 15;
                                    var33[7] = var37 * var40 + -var35 * -var39 + 16384 >> 15;
                                    var33[1] = -var39 * var37 - (-(var35 * var40) - 16384) >> 15;
                                    var33[13] = var33[7] * -var29 + var33[1] * -var27 + var33[4] * -var30 + 16384 >> 15;
                                    int var41 = var36 * var39 + 16384 >> 15;
                                    var33[6] = -var35 * var38 + var37 * var41 + 16384 >> 15;
                                    var33[14] = var33[8] * -var29 + var33[5] * -var30 + var33[2] * -var27 + 16384 >> 15;
                                    var33[0] = var35 * var41 + var37 * var38 + 16384 >> 15;
                                    var33[12] = var33[0] * -var27 + var33[3] * -var30 + (var33[6] * -var29) + 16384 >> 15;
                                }
                                var33[9] = var27;
                                var33[11] = var29;
                                var33[10] = var30;
                            }
                            if (var28 != 0 || var31 != 0 || var32 != 0) {
                                var20[var26].method1839(var28, var31, var32);
                            }
                            if (var27 != 0 || var30 != 0 || var29 != 0) {
                                var20[var26].method1857(var27, var30, var29);
                            }
                        }
                    }
                }
                class259 var42 = new class259(var20, var20.length);
                for (int var43 = 0; var43 < 5; var43++) {
                    if (this.field4738[var43] < class92.field1426[var43].length) {
                        var42.method1860(class204.field3329[var43], class92.field1426[var43][this.field4738[var43]]);
                    }
                    if (class299.field4664[var43].length > this.field4738[var43]) {
                        var42.method1860(class20.field305[var43], class299.field4664[var43][this.field4738[var43]]);
                    }
                }
                var16 = var42.method1855(64, 850, -30, -50, -30);
                if (class186.field2991) {
                    ((class75) var16).method549(false, false, true, true, false, false, true);
                }
                if (arg9) {
                    class80.field1201.method1621(var12, -109, var16);
                    this.field4726 = var12;
                }
            }
        }
        boolean var44 = false;
        boolean var45 = false;
        boolean var46 = arg2;
        boolean var47 = false;
        int var48 = arg1 == null ? 0 : arg1.length;
        for (int var49 = 0; var49 < var48; var49++) {
            if (arg1[var49] != null) {
                class80 var50 = class37.method236(arg1[var49].field3058, 20254);
                if (var50.field1209 != null) {
                    class231.field3696[var49] = var50;
                    var44 = true;
                    int var51 = arg1[var49].field3059;
                    int var52 = arg1[var49].field3052;
                    int var53 = var50.field1209[var51];
                    field4747[var49] = class7.method50(128, var53 >>> 16);
                    int var54 = var53 & 0xFFFF;
                    class202.field3297[var49] = var54;
                    if (field4747[var49] != null) {
                        var46 |= field4747[var49].method650(1, var54);
                        var45 |= field4747[var49].method649(var54, 15869);
                        var47 |= var50.field1219;
                    }
                    if ((var50.field1203 || class218.field3506) && var52 != -1 && var50.field1209.length > var52) {
                        class340.field5287[var49] = var50.field1223[var51];
                        class147.field2205[var49] = arg1[var49].field3055;
                        int var55 = var50.field1209[var52];
                        class118.field1784[var49] = class7.method50(128, var55 >>> 16);
                        int var56 = var55 & 0xFFFF;
                        class101.field1539[var49] = var56;
                        if (class118.field1784[var49] != null) {
                            var46 |= class118.field1784[var49].method650(1, var56);
                            var45 |= class118.field1784[var49].method649(var56, 15869);
                        }
                    } else {
                        class340.field5287[var49] = 0;
                        class147.field2205[var49] = 0;
                        class118.field1784[var49] = null;
                        class101.field1539[var49] = -1;
                    }
                }
            }
        }
        if (!var44 && arg3 == null && arg10 == null) {
            return var16;
        }
        int var57 = 0;
        class90 var58 = null;
        int var59 = -1;
        int var60 = -1;
        class90 var61 = null;
        if (arg3 != null) {
            int var62 = arg3.field1209[arg6];
            int var63 = var62 >>> 16;
            var59 = var62 & 0xFFFF;
            var58 = class7.method50(128, var63);
            if (var58 != null) {
                var46 |= var58.method650(1, var59);
                var45 |= var58.method649(var59, 15869);
                var47 |= arg3.field1219;
            }
            if ((arg3.field1203 || class218.field3506) && arg4 != -1 && arg3.field1209.length > arg4) {
                var57 = arg3.field1223[arg6];
                int var64 = arg3.field1209[arg4];
                int var65 = var64 >>> 16;
                var60 = var64 & 0xFFFF;
                if (var63 == var65) {
                    var61 = var58;
                } else {
                    var61 = class7.method50(128, var60 >>> 16);
                }
                if (var61 != null) {
                    var46 |= var61.method650(1, var60);
                    var45 |= var61.method649(var60, 15869);
                }
            }
        }
        int var66 = 0;
        int var67 = -1;
        class90 var68 = null;
        class90 var69 = null;
        int var70 = -1;
        if (arg10 != null) {
            int var71 = arg10.field1209[arg8];
            int var72 = var71 >>> 16;
            var68 = class7.method50(128, var72);
            var67 = var71 & 0xFFFF;
            if (var68 != null) {
                var46 |= var68.method650(1, var67);
                var45 |= var68.method649(var67, 15869);
                var47 |= arg10.field1219;
            }
            if ((arg10.field1203 || class218.field3506) && arg0 != -1 && arg0 < arg10.field1209.length) {
                var66 = arg10.field1223[arg8];
                int var73 = arg10.field1209[arg0];
                int var74 = var73 >>> 16;
                var70 = var73 & 0xFFFF;
                if (var72 == var74) {
                    var69 = var68;
                } else {
                    var69 = class7.method50(128, var70 >>> 16);
                }
                if (var69 != null) {
                    var46 |= var69.method650(1, var70);
                    var45 |= var69.method649(var70, 15869);
                }
            }
        }
        class134 var75 = var16.method542(!var45, !var46, !var47);
        int var76 = 0;
        int var77 = 1;
        while (var76 < var48) {
            if (field4747[var76] != null) {
                var75.method918(field4747[var76], class202.field3297[var76], class118.field1784[var76], class101.field1539[var76], class147.field2205[var76] - 1, class340.field5287[var76], var77, class231.field3696[var76].field1219, this.field4735[var76]);
            }
            var76++;
            var77 <<= 0x1;
        }
        if (var58 != null && var68 != null) {
            var75.method914(var58, var59, var61, var60, arg5 - 1, var57, var68, var67, var69, var70, arg7 - 1, var66, arg3.field1194, arg10.field1219 | arg3.field1219);
        } else if (var58 != null) {
            var75.method916(var58, var59, var61, var60, arg5 - 1, var57, arg3.field1219);
        } else if (var68 != null) {
            var75.method916(var68, var67, var69, var70, arg7 - 1, var66, arg10.field1219);
        }
        for (int var78 = 0; var78 < var48; var78++) {
            field4747[var78] = null;
            class118.field1784[var78] = null;
            class231.field3696[var78] = null;
        }
        return var75;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(I[IZ[IIZ)V", line = 614)
    public final void method2122(int arg0, int[] arg1, boolean arg2, int[] arg3, int arg4, boolean arg5) {
        field4740++;
        if (this.field4732 != arg4) {
            this.field4735 = (int[][]) null;
            this.field4732 = arg4;
        }
        if (arg1 == null) {
            arg1 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class152.field2324; var8++) {
                    class288 var9 = class323.method2251(104, var8);
                    if (var9 != null && !var9.field4548 && (arg5 ? class325.field5076[var7] : class35.field466[var7]) == var9.field4543) {
                        arg1[class200.field3283[var7]] = class24.method149(Integer.MIN_VALUE, var8);
                        break;
                    }
                }
            }
        }
        this.field4733 = arg0;
        this.field4736 = arg5;
        this.field4738 = arg3;
        this.field4730 = arg1;
        this.method2124((byte) -75);
        if (arg2) {
            this.field4732 = -79;
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZI)V", line = 665)
    public final void method2123(boolean arg0, int arg1) {
        this.field4736 = arg0;
        field4745++;
        if (arg1 < 96) {
            method2120(-107, 62, -91);
        }
        this.method2124((byte) -57);
    }

    @OriginalMember(owner = "client!sh", name = "b", descriptor = "(B)V", line = 678)
    private final void method2124(byte arg0) {
        field4734++;
        long var2 = this.field4728;
        this.field4728 = -1L;
        long[] var4 = class228.field3611;
        this.field4728 = var4[(int) ((this.field4728 ^ (long) (this.field4732 >> 8)) & 0xFFL)] ^ this.field4728 >>> 8;
        this.field4728 = this.field4728 >>> 8 ^ var4[(int) (((long) this.field4732 ^ this.field4728) & 0xFFL)];
        for (int var5 = 0; var5 < 12; var5++) {
            this.field4728 = this.field4728 >>> 8 ^ var4[(int) ((this.field4728 ^ (long) (this.field4730[var5] >> 24)) & 0xFFL)];
            this.field4728 = var4[(int) ((this.field4728 ^ (long) (this.field4730[var5] >> 16)) & 0xFFL)] ^ this.field4728 >>> 8;
            this.field4728 = this.field4728 >>> 8 ^ var4[(int) ((this.field4728 ^ (long) (this.field4730[var5] >> 8)) & 0xFFL)];
            this.field4728 = this.field4728 >>> 8 ^ var4[(int) ((this.field4728 ^ (long) this.field4730[var5]) & 0xFFL)];
        }
        for (int var6 = 0; var6 < 5; var6++) {
            this.field4728 = this.field4728 >>> 8 ^ var4[(int) (((long) this.field4738[var6] ^ this.field4728) & 0xFFL)];
        }
        this.field4728 = this.field4728 >>> 8 ^ var4[(int) ((this.field4728 ^ (long) (this.field4736 ? 1 : 0)) & 0xFFL)];
        if (arg0 > -44) {
            method2126(false, (String) null, -13);
        }
        if (var2 != 0L && this.field4728 != var2) {
            class80.field1201.method1624((byte) -18, var2);
        }
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(IILv;II)Llf;", line = 721)
    public final class134 method2125(int arg0, int arg1, class80 arg2, int arg3, int arg4) {
        if (arg1 != 18902) {
            method2127((byte) 52);
        }
        field4731++;
        if (this.field4733 != -1) {
            return class281.method1993(this.field4733, -3).method829(120, arg2, arg0, arg4, arg3);
        }
        class134 var6 = (class134) class89.field1362.method1619(this.field4728, arg1 ^ 0x49EE);
        if (var6 == null) {
            boolean var7 = false;
            for (int var8 = 0; var8 < 12; var8++) {
                int var9 = this.field4730[var8];
                if ((var9 & 0x40000000) == 0) {
                    if ((var9 & Integer.MIN_VALUE) != 0 && !class323.method2251(116, var9 & 0x3FFFFFFF).method2027(false)) {
                        var7 = true;
                    }
                } else if (!class31.method198(false, var9 & 0x3FFFFFFF).method480(arg1 ^ 0xFFFFB629, this.field4736)) {
                    var7 = true;
                }
            }
            if (var7) {
                return null;
            }
            class259[] var10 = new class259[12];
            int var11 = 0;
            for (int var12 = 0; var12 < 12; var12++) {
                int var13 = this.field4730[var12];
                if ((var13 & 0x40000000) != 0) {
                    class259 var15 = class31.method198(false, var13 & 0x3FFFFFFF).method478(true, this.field4736);
                    if (var15 != null) {
                        var10[var11++] = var15;
                    }
                } else if ((Integer.MIN_VALUE & var13) != 0) {
                    class259 var14 = class323.method2251(116, var13 & 0x3FFFFFFF).method2021(-128);
                    if (var14 != null) {
                        var10[var11++] = var14;
                    }
                }
            }
            class259 var16 = new class259(var10, var11);
            for (int var17 = 0; var17 < 5; var17++) {
                if (class92.field1426[var17].length > this.field4738[var17]) {
                    var16.method1860(class204.field3329[var17], class92.field1426[var17][this.field4738[var17]]);
                }
                if (this.field4738[var17] < class299.field4664[var17].length) {
                    var16.method1860(class20.field305[var17], class299.field4664[var17][this.field4738[var17]]);
                }
            }
            var6 = var16.method1855(64, 768, -50, -10, -50);
            class89.field1362.method1621(this.field4728, 84, var6);
        }
        if (arg2 != null) {
            var6 = arg2.method593(arg0, true, arg3, var6, arg4);
        }
        return var6;
    }

    @OriginalMember(owner = "client!sh", name = "a", descriptor = "(ZLjava/lang/String;I)V", line = 843)
    public static final void method2126(boolean arg0, String arg1, int arg2) {
        field4739++;
        byte var3 = 4;
        int var4 = var3 + 6;
        int var5 = class295.field4628.method996(arg1, 250);
        if (arg2 >= -5) {
            method2120(62, -110, 102);
        }
        int var6 = var3 + 6;
        int var7 = class295.field4628.method997(arg1, 250) * 13;
        if (class186.field2991) {
            class344.method2375(var4 - var3, -var3 + var6, var3 + var3 + var5, var3 + var7 - -var3, 0);
            class344.method2371(var4 - var3, var6 - var3, var3 + var5 + var3, var7 - -var3 + var3, 16777215);
        } else {
            class216.method1573(var4 - var3, -var3 + var6, var5 - (-var3 - var3), var3 + var7 + var3, 0);
            class216.method1579(var4 - var3, -var3 + var6, var3 + var5 + var3, var7 - -var3 - -var3, 16777215);
        }
        class295.field4628.method993(arg1, var4, var6, var5, var7, 16777215, -1, 1, 1, 0);
        class325.method2260(var3 + var5 + var3, -12886, -var3 + var4, var3 + var7 + var3, var6 - var3);
        if (!arg0) {
            class198.method1446(var4, var6, (byte) -97, var7, var5);
        } else if (class186.field2991) {
            class186.method1277();
        } else {
            try {
                Graphics var8 = class338.field5247.getGraphics();
                class289.field4563.method222(var8, 0, 0, 33);
            } catch (Exception var10) {
                class338.field5247.repaint();
            }
        }
    }

    @OriginalMember(owner = "client!sh", name = "c", descriptor = "(B)V", line = 910)
    public static void method2127(byte arg0) {
        field4747 = null;
        if (arg0 != -11) {
            method2127((byte) 8);
        }
    }
}
