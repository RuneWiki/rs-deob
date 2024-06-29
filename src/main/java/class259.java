import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class259 {

    @OriginalMember(owner = "client!tq", name = "b", descriptor = "I")
    public int field3816 = -1;

    @OriginalMember(owner = "client!tq", name = "c", descriptor = "I")
    public static int field3817 = 0;

    @OriginalMember(owner = "client!tq", name = "h", descriptor = "Lbn;")
    public static class160 field3822 = new class160(50, 8);

    @OriginalMember(owner = "client!tq", name = "v", descriptor = "Ljn;")
    public static class409 field3836 = new class409("Loaded update list", "Update-Liste geladen.", "Liste des mises à jour chargée", "Lista de atualizações carregada");

    @OriginalMember(owner = "client!tq", name = "w", descriptor = "[I")
    public static int[] field3837 = new int[32];

    @OriginalMember(owner = "client!tq", name = "j", descriptor = "I")
    public static int field3824;

    @OriginalMember(owner = "client!tq", name = "k", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!tq", name = "l", descriptor = "I")
    public static int field3826;

    @OriginalMember(owner = "client!tq", name = "m", descriptor = "I")
    public static int field3827;

    @OriginalMember(owner = "client!tq", name = "n", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!tq", name = "p", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!tq", name = "r", descriptor = "I")
    public static int field3832;

    @OriginalMember(owner = "client!tq", name = "s", descriptor = "I")
    private int field3833;

    @OriginalMember(owner = "client!tq", name = "t", descriptor = "I")
    public static int field3834;

    @OriginalMember(owner = "client!tq", name = "u", descriptor = "I")
    public static int field3835;

    @OriginalMember(owner = "client!tq", name = "d", descriptor = "J")
    private long field3818;

    @OriginalMember(owner = "client!tq", name = "f", descriptor = "J")
    private long field3820;

    @OriginalMember(owner = "client!tq", name = "e", descriptor = "Lic;")
    public static class235 field3819;

    @OriginalMember(owner = "client!tq", name = "g", descriptor = "Z")
    public boolean field3821;

    @OriginalMember(owner = "client!tq", name = "i", descriptor = "Z")
    public static boolean field3823;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "[I")
    private int[] field3815;

    @OriginalMember(owner = "client!tq", name = "q", descriptor = "[I")
    public int[] field3831;

    @OriginalMember(owner = "client!tq", name = "o", descriptor = "[[I")
    private int[][] field3829;

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZLtp;Ltp;IILfp;II[Lpn;ILwj;III)Lbi;", line = 3)
    public final class143 method1775(boolean arg0, class196 arg1, class196 arg2, int arg3, int arg4, class9 arg5, int arg6, int arg7, class69[] arg8, int arg9, class11 arg10, int arg11, int arg12, int arg13) {
        field3824++;
        if (this.field3816 != -1) {
            return class295.method1963(115, this.field3816).method2143(0, arg1, arg7, arg8, arg12, arg5, arg9, arg4, arg2, arg13, arg6, arg3);
        }
        int var15 = arg12;
        long var16 = this.field3818;
        int[] var18 = this.field3815;
        if (arg2 != null && (arg2.field2765 >= 0 || arg2.field2759 >= 0)) {
            var18 = new int[12];
            for (int var19 = 0; var19 < 12; var19++) {
                var18[var19] = this.field3815[var19];
            }
            if (arg2.field2765 >= 0) {
                if (arg2.field2765 == 65535) {
                    var18[5] = 0;
                    var16 ^= 0xFFFFFFFF00000000L;
                } else {
                    var18[5] = method1785(1073741824, arg2.field2765);
                    var16 ^= (long) var18[5] << 32;
                }
            }
            if (arg2.field2759 >= 0) {
                if (arg2.field2759 == 65535) {
                    var18[3] = 0;
                    var16 ^= 0xFFFFFFFFL;
                } else {
                    var18[3] = method1785(1073741824, arg2.field2759);
                    var16 ^= (long) var18[3];
                }
            }
        }
        boolean var20 = false;
        boolean var21 = false;
        boolean var22 = arg2 != null || arg1 != null;
        int var23 = arg8 == null ? 0 : arg8.length;
        for (int var24 = 0; var24 < var23; var24++) {
            class44.field587[var24] = null;
            if (arg8[var24] != null) {
                class196 var25 = class83.method556(arg8[var24].field908, 117);
                if (var25.field2784 != null) {
                    class307.field4539[var24] = var25;
                    var22 = true;
                    int var26 = arg8[var24].field913;
                    int var27 = arg8[var24].field910;
                    int var28 = var25.field2784[var26];
                    class44.field587[var24] = class191.method1335(35, var28 >>> 16);
                    int var29 = var28 & 0xFFFF;
                    class310.field4567[var24] = var29;
                    if (class44.field587[var24] != null) {
                        var21 |= class44.field587[var24].method1458(var29, arg11 ^ 0xDD8E1D49);
                        var20 |= class44.field587[var24].method1461(3, var29);
                    }
                    if ((var25.field2758 || class47.field616) && var27 != -1 && var27 < var25.field2784.length) {
                        class367.field5312[var24] = var25.field2763[var26];
                        class191.field2672[var24] = arg8[var24].field911;
                        int var30 = var25.field2784[var27];
                        class11.field155[var24] = class191.method1335(118, var30 >>> 16);
                        int var31 = var30 & 0xFFFF;
                        class206.field2889[var24] = var31;
                        if (class11.field155[var24] != null) {
                            var21 |= class11.field155[var24].method1458(var31, 61);
                            var20 |= class11.field155[var24].method1461(arg11 + 577888992, var31);
                        }
                    } else {
                        class367.field5312[var24] = 0;
                        class191.field2672[var24] = 0;
                        class11.field155[var24] = null;
                        class206.field2889[var24] = -1;
                    }
                }
            }
        }
        int var32 = -1;
        int var33 = -1;
        int var34 = 0;
        class213 var35 = null;
        class213 var36 = null;
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class213 var40 = null;
        class213 var41 = null;
        if (arg11 != -577888989) {
            return null;
        }
        if (var22) {
            if (arg2 != null) {
                int var42 = arg2.field2784[arg7];
                int var43 = var42 >>> 16;
                var32 = var42 & 0xFFFF;
                var35 = class191.method1335(107, var43);
                if (var35 != null) {
                    var21 |= var35.method1458(var32, 82);
                    var20 |= var35.method1461(3, var32);
                }
                if ((arg2.field2758 || class47.field616) && arg3 != -1 && arg3 < arg2.field2784.length) {
                    var34 = arg2.field2763[arg7];
                    int var44 = arg2.field2784[arg3];
                    int var45 = var44 >>> 16;
                    var33 = var44 & 0xFFFF;
                    var36 = var43 == var45 ? var35 : class191.method1335(92, var45);
                    if (var36 != null) {
                        var21 |= var36.method1458(var33, 65);
                        var20 |= var36.method1461(3, var33);
                    }
                }
            }
            var15 = arg12 | 0x20;
            if (arg1 != null) {
                int var46 = arg1.field2784[arg13];
                int var47 = var46 >>> 16;
                var37 = var46 & 0xFFFF;
                var40 = class191.method1335(31, var47);
                if (var40 != null) {
                    var21 |= var40.method1458(var37, 97);
                    var20 |= var40.method1461(arg11 + 577888992, var37);
                }
                if ((arg1.field2758 || class47.field616) && arg6 != -1 && arg6 < arg1.field2784.length) {
                    var39 = arg1.field2763[arg13];
                    int var48 = arg1.field2784[arg6];
                    int var49 = var48 >>> 16;
                    var41 = var47 == var49 ? var40 : class191.method1335(arg11 + 577889099, var49);
                    var38 = var48 & 0xFFFF;
                    if (var41 != null) {
                        var21 |= var41.method1458(var38, 110);
                        var20 |= var41.method1461(3, var38);
                    }
                }
            }
            if (var21) {
                var15 |= 0x80;
            }
            if (var20) {
                var15 |= 0x100;
            }
        }
        class363 var50 = class283.field4166;
        class143 var51;
        synchronized (class283.field4166) {
            var51 = (class143) class283.field4166.method2310((byte) -124, var16);
        }
        class446 var52 = null;
        if (this.field3833 != -1) {
            var52 = class286.method1923((byte) 59, this.field3833);
        }
        if (var51 == null || arg5.method85(var51.method961(), var15) != 0 || var52 != null && var52.field6534 != null && this.field3829 == null) {
            if (var51 != null) {
                var15 = arg5.method139(var15, var51.method961());
            }
            boolean var54 = false;
            int var55 = 0;
            while (true) {
                if (var55 >= 12) {
                    if (var54) {
                        if (this.field3820 != -1L) {
                            class363 var57 = class283.field4166;
                            synchronized (class283.field4166) {
                                var51 = (class143) class283.field4166.method2310((byte) -125, this.field3820);
                            }
                        }
                        if (var51 == null || arg5.method85(var51.method961(), var15) != 0 || var52 != null && var52.field6534 != null && this.field3829 == null) {
                            return null;
                        }
                    } else {
                        class100[] var58 = new class100[12];
                        for (int var59 = 0; var59 < 12; var59++) {
                            int var60 = var18[var59];
                            if ((var60 & 0x40000000) != 0) {
                                class100 var62 = arg10.method176((byte) -37, var60 & 0x3FFFFFFF).method2634(this.field3821, -5398);
                                if (var62 != null) {
                                    var58[var59] = var62;
                                }
                            } else if ((var60 & Integer.MIN_VALUE) != 0) {
                                class100 var61 = class404.method2522(true, var60 & 0x3FFFFFFF).method1912(0);
                                if (var61 != null) {
                                    var58[var59] = var61;
                                }
                            }
                        }
                        if (var52 != null && var52.field6534 != null) {
                            for (int var63 = 0; var63 < var52.field6534.length; var63++) {
                                if (var52.field6534[var63] != null && var58[var63] != null) {
                                    int var64 = var52.field6534[var63][0];
                                    int var65 = var52.field6534[var63][1];
                                    int var66 = var52.field6534[var63][2];
                                    int var67 = var52.field6534[var63][3] << 3;
                                    int var68 = var52.field6534[var63][4] << 3;
                                    int var69 = var52.field6534[var63][5] << 3;
                                    if (this.field3829 == null) {
                                        this.field3829 = new int[var52.field6534.length][];
                                    }
                                    if (this.field3829[var63] == null) {
                                        int[] var70 = this.field3829[var63] = new int[15];
                                        if (var67 == 0 && var68 == 0 && var69 == 0) {
                                            var70[14] = -var66;
                                            var70[12] = -var64;
                                            var70[0] = var70[4] = var70[8] = 32768;
                                            var70[13] = -var65;
                                        } else {
                                            int var71 = class327.field4862[var67];
                                            int var72 = class327.field4863[var67];
                                            int var73 = class327.field4862[var68];
                                            int var74 = class327.field4863[var68];
                                            int var75 = class327.field4862[var69];
                                            int var76 = class327.field4863[var69];
                                            int var77 = var72 * var75 + 16384 >> 15;
                                            int var78 = var72 * var76 + 16384 >> 15;
                                            var70[0] = var73 * var75 + (var74 * var78) + 16384 >> 15;
                                            var70[4] = var71 * var75 + 16384 >> 15;
                                            var70[2] = var71 * var74 + 16384 >> 15;
                                            var70[3] = var71 * var76 + 16384 >> 15;
                                            var70[5] = -var72;
                                            var70[6] = -var74 * var75 + var73 * var78 + 16384 >> 15;
                                            var70[1] = -var76 * var73 + var74 * var77 + 16384 >> 15;
                                            var70[7] = -var74 * -var76 + var73 * var77 + 16384 >> 15;
                                            var70[8] = var71 * var73 + 16384 >> 15;
                                            var70[12] = var70[6] * -var66 + var70[3] * -var65 + var70[0] * -var64 + 16384 >> 15;
                                            var70[14] = var70[2] * -var64 + 16384 - (-(var70[5] * -var65) - var70[8] * -var66) >> 15;
                                            var70[13] = var70[4] * -var65 + (var70[1] * -var64 + (var70[7] * -var66) + 16384) >> 15;
                                        }
                                        var70[10] = var65;
                                        var70[11] = var66;
                                        var70[9] = var64;
                                    }
                                    if (var67 != 0 || var68 != 0 || var69 != 0) {
                                        var58[var63].method671(-1, var69, var68, var67);
                                    }
                                    if (var64 != 0 || var65 != 0 || var66 != 0) {
                                        var58[var63].method668(var66, var65, 0, var64);
                                    }
                                }
                            }
                        }
                        int var79 = var15 | 0x2000;
                        class100 var80 = new class100(var58, var58.length);
                        var51 = arg5.method163(var80, var79, class84.field1030, 64, 850);
                        for (int var81 = 0; var81 < 5; var81++) {
                            if (class286.field4203[var81].length > this.field3831[var81]) {
                                var51.method965(class265.field3925[var81], class286.field4203[var81][this.field3831[var81]]);
                            }
                            if (class180.field2550[var81].length > this.field3831[var81]) {
                                var51.method965(class52.field658[var81], class180.field2550[var81][this.field3831[var81]]);
                            }
                        }
                        if (arg0) {
                            var51.method975(var15);
                            class363 var82 = class283.field4166;
                            synchronized (class283.field4166) {
                                class283.field4166.method2299(true, var51, var16);
                            }
                            this.field3820 = var16;
                        }
                    }
                    break;
                }
                int var56 = var18[var55];
                if ((var56 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var56) != 0 && !class404.method2522(true, var56 & 0x3FFFFFFF).method1911(true)) {
                        var54 = true;
                    }
                } else if (!arg10.method176((byte) -76, var56 & 0x3FFFFFFF).method2621(0, this.field3821)) {
                    var54 = true;
                }
                var55++;
            }
        }
        class143 var83 = var51.method966((byte) 4, var15, true);
        if (!var22) {
            return var83;
        }
        int var84 = 0;
        int var85 = 1;
        while (var23 > var84) {
            if (class44.field587[var84] != null) {
                var83.method952(var85, class191.field2672[var84] - 1, class206.field2889[var84], class310.field4567[var84], class367.field5312[var84], class44.field587[var84], false, 0, class11.field155[var84], (byte) 98, this.field3829 == null ? null : this.field3829[var84]);
            }
            var85 <<= 0x1;
            var84++;
        }
        if (var35 != null && var40 != null) {
            var83.method983(false, var38, var33, arg9 - 1, var36, arg2.field2774, arg11 + 577889109, var41, var40, var35, var39, var37, arg4 - 1, var32, var34);
        } else if (var35 != null) {
            var83.method984(var32, var35, var33, arg11 + 577916856, arg4 + -1, false, 0, var34, var36);
        } else if (var40 != null) {
            var83.method984(var37, var40, var38, arg11 ^ 0xDD8E71F8, arg9 - 1, false, 0, var39, var41);
        }
        for (int var86 = 0; var86 < var23; var86++) {
            class44.field587[var86] = null;
            class11.field155[var86] = null;
            class307.field4539[var86] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(BZ)V", line = 498)
    public final void method1776(byte arg0, boolean arg1) {
        this.field3821 = arg1;
        field3830++;
        this.method1777(-22455);
        int var3 = -4 / ((19 - arg0) / 63);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(I)V", line = 511)
    private final void method1777(int arg0) {
        field3834++;
        long[] var2 = class186.field2606;
        this.field3818 = -1L;
        this.field3818 = var2[(int) (((long) (this.field3833 >> 8) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
        this.field3818 = this.field3818 >>> 8 ^ var2[(int) ((this.field3818 ^ (long) this.field3833) & 0xFFL)];
        if (arg0 != -22455) {
            method1781(true, 120, 26, -6);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field3818 = this.field3818 >>> 8 ^ var2[(int) ((this.field3818 ^ (long) (this.field3815[var3] >> 24)) & 0xFFL)];
            this.field3818 = this.field3818 >>> 8 ^ var2[(int) ((this.field3818 ^ (long) (this.field3815[var3] >> 16)) & 0xFFL)];
            this.field3818 = var2[(int) (((long) (this.field3815[var3] >> 8) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
            this.field3818 = this.field3818 >>> 8 ^ var2[(int) ((this.field3818 ^ (long) this.field3815[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field3818 = this.field3818 >>> 8 ^ var2[(int) (((long) this.field3831[var4] ^ this.field3818) & 0xFFL)];
        }
        this.field3818 = var2[(int) (((long) (this.field3821 ? 1 : 0) ^ this.field3818) & 0xFFL)] ^ this.field3818 >>> 8;
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILwj;IILtp;IILfp;)Lbi;", line = 550)
    public final class143 method1778(int arg0, class11 arg1, int arg2, int arg3, class196 arg4, int arg5, int arg6, class9 arg7) {
        field3826++;
        if (this.field3816 != -1) {
            return class295.method1963(114, this.field3816).method2144(arg4, arg7, arg3, arg2, -1, arg6, arg0);
        }
        int var9 = arg3;
        if (arg4 != null) {
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = false;
            boolean var13 = true;
            boolean var14 = true;
            Object var15 = null;
            var9 = arg3 | 0x20;
            Object var16 = null;
            int var17 = arg4.field2784[arg0];
            int var18 = var17 >>> 16;
            int var19 = var17 & 0xFFFF;
            class213 var20 = class191.method1335(124, var18);
            if (var20 != null) {
                var11 |= var20.method1458(var19, 90);
                var10 |= var20.method1461(3, var19);
                var12 |= arg4.field2779;
            }
            if ((arg4.field2758 || class47.field616) && arg2 != -1 && arg2 < arg4.field2784.length) {
                int var21 = arg4.field2784[arg2];
                int var22 = var21 >>> 16;
                class213 var23 = var18 == var22 ? var20 : class191.method1335(125, var22);
                int var24 = var21 & 0xFFFF;
                if (var23 != null) {
                    var11 |= var23.method1458(var24, 98);
                    var10 |= var23.method1461(3, var24);
                }
            }
            if (var11) {
                var9 |= 0x80;
            }
            if (var10) {
                var9 |= 0x100;
            }
            if (var12) {
                var9 |= 0x200;
            }
        }
        class363 var25 = class272.field4022;
        class143 var26;
        synchronized (class272.field4022) {
            var26 = (class143) class272.field4022.method2310((byte) -126, this.field3818);
        }
        if (var26 == null || arg7.method85(var26.method961(), var9) != 0) {
            if (var26 != null) {
                var9 = arg7.method139(var9, var26.method961());
            }
            boolean var28 = false;
            for (int var29 = 0; var29 < 12; var29++) {
                int var30 = this.field3815[var29];
                if ((var30 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var30) != 0 && !class404.method2522(true, var30 & 0x3FFFFFFF).method1910(true)) {
                        var28 = true;
                    }
                } else if (!arg1.method176((byte) -125, var30 & 0x3FFFFFFF).method2619(this.field3821, (byte) 93)) {
                    var28 = true;
                }
            }
            if (var28) {
                return null;
            }
            class100[] var31 = new class100[12];
            int var32 = 0;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field3815[var33];
                if ((var34 & 0x40000000) != 0) {
                    class100 var36 = arg1.method176((byte) -41, var34 & 0x3FFFFFFF).method2629(this.field3821, 93);
                    if (var36 != null) {
                        var31[var32++] = var36;
                    }
                } else if ((var34 & Integer.MIN_VALUE) != 0) {
                    class100 var35 = class404.method2522(true, var34 & 0x3FFFFFFF).method1905((byte) 40);
                    if (var35 != null) {
                        var31[var32++] = var35;
                    }
                }
            }
            int var37 = var9 | 0x2000;
            class100 var38 = new class100(var31, var32);
            var26 = arg7.method163(var38, var37, class84.field1030, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class286.field4203[var39].length > this.field3831[var39]) {
                    var26.method965(class265.field3925[var39], class286.field4203[var39][this.field3831[var39]]);
                }
                if (class180.field2550[var39].length > this.field3831[var39]) {
                    var26.method965(class52.field658[var39], class180.field2550[var39][this.field3831[var39]]);
                }
            }
            var26.method975(var9);
            class363 var40 = class272.field4022;
            synchronized (class272.field4022) {
                class272.field4022.method2299(true, var26, this.field3818);
            }
        }
        if (arg4 == null) {
            return var26;
        }
        if (arg5 < 85) {
            this.method1784(10, -68, 67);
        }
        var26.method966((byte) 4, var9, true);
        return arg4.method1360(arg6, arg2, 1, var26, arg0, arg3);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZII[I[II)V", line = 737)
    public final void method1779(boolean arg0, int arg1, int arg2, int[] arg3, int[] arg4, int arg5) {
        this.field3821 = arg0;
        int var7 = 90 % ((arg2 + 67) / 42);
        field3828++;
        if (this.field3833 != arg5) {
            this.field3833 = arg5;
            this.field3829 = null;
        }
        this.field3831 = arg4;
        this.field3815 = arg3;
        this.field3816 = arg1;
        this.method1777(-22455);
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ILfp;IIIILtp;III)Lbi;", line = 757)
    public final class143 method1780(int arg0, class9 arg1, int arg2, int arg3, int arg4, int arg5, class196 arg6, int arg7, int arg8, int arg9) {
        field3835++;
        int var11 = arg4;
        if (arg6 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            var11 = arg4 | 0x20;
            Object var18 = null;
            int var19 = arg6.field2784[arg2];
            int var20 = var19 >>> 16;
            int var21 = var19 & 0xFFFF;
            class213 var22 = class191.method1335(14, var20);
            if (var22 != null) {
                var13 |= var22.method1458(var21, 95);
                var12 |= var22.method1461(3, var21);
                var14 |= arg6.field2779;
            }
            if ((arg6.field2758 || class47.field616) && arg8 != -1 && arg8 < arg6.field2784.length) {
                int var23 = arg6.field2784[arg8];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class213 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class191.method1335(107, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method1458(var25, 54);
                    var12 |= var26.method1461(3, var25);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg3 | (long) arg7 << 32 | (long) (arg9 << 16);
        class363 var29 = class272.field4022;
        class143 var30;
        synchronized (class272.field4022) {
            var30 = (class143) class272.field4022.method2310((byte) -128, var27);
        }
        if (var30 == null || arg1.method85(var30.method961(), var11) != 0) {
            if (var30 != null) {
                var11 = arg1.method139(var11, var30.method961());
            }
            class100[] var32 = new class100[3];
            int var33 = 0;
            if (!class404.method2522(true, arg3).method1910(true) || !class404.method2522(true, arg9).method1910(true) || !class404.method2522(true, arg7).method1910(true)) {
                return null;
            }
            class100 var34 = class404.method2522(true, arg3).method1905((byte) 40);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class100 var35 = class404.method2522(true, arg9).method1905((byte) 40);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class100 var36 = class404.method2522(true, arg7).method1905((byte) 40);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            class100 var37 = new class100(var32, var33);
            int var38 = var11 | 0x2000;
            var30 = arg1.method163(var37, var38, class84.field1030, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field3831[var39] < class286.field4203[var39].length) {
                    var30.method965(class265.field3925[var39], class286.field4203[var39][this.field3831[var39]]);
                }
                if (class180.field2550[var39].length > this.field3831[var39]) {
                    var30.method965(class52.field658[var39], class180.field2550[var39][this.field3831[var39]]);
                }
            }
            var30.method975(var11);
            class363 var40 = class272.field4022;
            synchronized (class272.field4022) {
                class272.field4022.method2299(true, var30, var27);
            }
        }
        if (arg6 == null) {
            return var30;
        } else {
            class143 var41 = var30.method966((byte) 4, var11, true);
            int var42 = -42 % ((32 - arg0) / 57);
            return arg6.method1360(arg5, arg8, 1, var41, arg2, arg4);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(ZIII)I", line = 899)
    public static final int method1781(boolean arg0, int arg1, int arg2, int arg3) {
        if (arg1 != 14807) {
            return -110;
        }
        field3832++;
        class243 var4 = class46.method378(arg3, arg0, false);
        if (var4 == null) {
            return -1;
        } else if (arg2 >= 0 && var4.field3599.length > arg2) {
            return var4.field3599[arg2];
        } else {
            return -1;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(B)V", line = 920)
    public static void method1782(byte arg0) {
        if (arg0 <= -23) {
            field3819 = null;
            field3822 = null;
            field3836 = null;
            field3837 = null;
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(IIB)V", line = 937)
    public final void method1783(int arg0, int arg1, byte arg2) {
        if (arg2 != -12) {
            field3817 = 123;
        }
        field3827++;
        int var4 = class295.field4290[arg1];
        if (this.field3815[var4] != 0 && class404.method2522(true, arg0) != null) {
            this.field3815[var4] = method1785(arg0, Integer.MIN_VALUE);
            this.method1777(arg2 ^ 0x57BD);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(III)V", line = 958)
    public final void method1784(int arg0, int arg1, int arg2) {
        this.field3831[arg1] = arg0;
        field3825++;
        if (arg2 == -1) {
            this.method1777(-22455);
        }
    }

    @OriginalMember(owner = "client!tq", name = "a", descriptor = "(II)I", line = 974)
    public static int method1785(int arg0, int arg1) {
        return arg0 | arg1;
    }
}
