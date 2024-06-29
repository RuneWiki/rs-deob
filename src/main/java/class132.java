import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cu")
public class class132 {

    @OriginalMember(owner = "client!cu", name = "w", descriptor = "I")
    public int field1740 = -1;

    @OriginalMember(owner = "client!cu", name = "o", descriptor = "Z")
    public static boolean field1732 = true;

    @OriginalMember(owner = "client!cu", name = "m", descriptor = "Ldk;")
    public static class326 field1730 = new class326("Discard", "Ablegen", "Jeter", "Descartar");

    @OriginalMember(owner = "client!cu", name = "r", descriptor = "Z")
    public static boolean field1735 = false;

    @OriginalMember(owner = "client!cu", name = "t", descriptor = "Lus;")
    public static class1 field1737 = new class1(16, -2);

    @OriginalMember(owner = "client!cu", name = "y", descriptor = "Lus;")
    public static class1 field1742 = new class1(54, 2);

    @OriginalMember(owner = "client!cu", name = "B", descriptor = "I")
    public static int field1745 = 0;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "I")
    public static int field1718;

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "I")
    public static int field1719;

    @OriginalMember(owner = "client!cu", name = "d", descriptor = "I")
    public static int field1721;

    @OriginalMember(owner = "client!cu", name = "f", descriptor = "I")
    public static int field1723;

    @OriginalMember(owner = "client!cu", name = "g", descriptor = "I")
    public static int field1724;

    @OriginalMember(owner = "client!cu", name = "h", descriptor = "I")
    public static int field1725;

    @OriginalMember(owner = "client!cu", name = "i", descriptor = "I")
    public static int field1726;

    @OriginalMember(owner = "client!cu", name = "k", descriptor = "I")
    public static int field1728;

    @OriginalMember(owner = "client!cu", name = "l", descriptor = "I")
    public static int field1729;

    @OriginalMember(owner = "client!cu", name = "p", descriptor = "I")
    public static int field1733;

    @OriginalMember(owner = "client!cu", name = "s", descriptor = "I")
    public static int field1736;

    @OriginalMember(owner = "client!cu", name = "u", descriptor = "I")
    private int field1738;

    @OriginalMember(owner = "client!cu", name = "v", descriptor = "I")
    public static int field1739;

    @OriginalMember(owner = "client!cu", name = "z", descriptor = "I")
    public static int field1743;

    @OriginalMember(owner = "client!cu", name = "c", descriptor = "J")
    private long field1720;

    @OriginalMember(owner = "client!cu", name = "q", descriptor = "J")
    private long field1734;

    @OriginalMember(owner = "client!cu", name = "A", descriptor = "Lui;")
    public static class138 field1744;

    @OriginalMember(owner = "client!cu", name = "j", descriptor = "Z")
    public boolean field1727;

    @OriginalMember(owner = "client!cu", name = "n", descriptor = "[I")
    public int[] field1731;

    @OriginalMember(owner = "client!cu", name = "x", descriptor = "[I")
    private int[] field1741;

    @OriginalMember(owner = "client!cu", name = "e", descriptor = "[[I")
    private int[][] field1722;

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(B)V")
    public static void method824(byte arg0) {
        field1730 = null;
        field1742 = null;
        field1737 = null;
        field1744 = null;
        if (arg0 != 33) {
            method826(108);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Z)V")
    private final void method825(boolean arg0) {
        field1723++;
        long[] var2 = class427.field5983;
        if (arg0) {
            this.field1722 = null;
        }
        this.field1720 = -1L;
        this.field1720 = var2[(int) ((this.field1720 ^ (long) (this.field1738 >> 8)) & 0xFFL)] ^ this.field1720 >>> 8;
        this.field1720 = var2[(int) (((long) this.field1738 ^ this.field1720) & 0xFFL)] ^ this.field1720 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1720 = this.field1720 >>> 8 ^ var2[(int) ((this.field1720 ^ (long) (this.field1741[var3] >> 24)) & 0xFFL)];
            this.field1720 = this.field1720 >>> 8 ^ var2[(int) (((long) (this.field1741[var3] >> 16) ^ this.field1720) & 0xFFL)];
            this.field1720 = var2[(int) ((this.field1720 ^ (long) (this.field1741[var3] >> 8)) & 0xFFL)] ^ this.field1720 >>> 8;
            this.field1720 = this.field1720 >>> 8 ^ var2[(int) ((this.field1720 ^ (long) this.field1741[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1720 = var2[(int) ((this.field1720 ^ (long) this.field1731[var4]) & 0xFFL)] ^ this.field1720 >>> 8;
        }
        this.field1720 = var2[(int) (((long) (this.field1727 ? 1 : 0) ^ this.field1720) & 0xFFL)] ^ this.field1720 >>> 8;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(I)V")
    public static final void method826(int arg0) {
        field1725++;
        class479.field6716 = 0;
        int var1 = (class492.field6935.field4331 >> 7) + class240.field3602;
        if (arg0 <= 36) {
            method824((byte) -68);
        }
        int var2 = (class492.field6935.field4317 >> 7) + class360.field5180;
        if (var1 >= 3053 && var1 <= 3156 && var2 >= 3056 && var2 <= 3136) {
            class479.field6716 = 1;
        }
        if (var1 >= 3072 && var1 <= 3118 && var2 >= 9492 && var2 <= 9535) {
            class479.field6716 = 1;
        }
        if (class479.field6716 == 1 && var1 >= 3139 && var1 <= 3199 && var2 >= 3008 && var2 <= 3062) {
            class479.field6716 = 0;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZI[II[I)V")
    public final void method827(int arg0, boolean arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        this.field1727 = arg1;
        field1728++;
        this.field1740 = arg2;
        this.field1741 = arg3;
        if (arg0 != 2) {
            return;
        }
        this.field1731 = arg5;
        if (this.field1738 != arg4) {
            this.field1722 = null;
            this.field1738 = arg4;
        }
        this.method825(false);
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IZILjj;ILok;Lqt;IBLti;[Lfi;Lfd;Lfl;Lok;IILnp;ILcn;)Lf;")
    public final class491 method828(int arg0, boolean arg1, int arg2, class67 arg3, int arg4, class153 arg5, class417 arg6, int arg7, byte arg8, class280 arg9, class360[] arg10, class338 arg11, class480 arg12, class153 arg13, int arg14, int arg15, class313 arg16, int arg17, class329 arg18) {
        field1729++;
        if (this.field1740 != -1) {
            return arg12.method2800(this.field1740, (byte) 32).method2737(arg4, (byte) -106, arg2, arg10, arg17, arg0, arg14, arg15, arg18, arg16, arg6, arg7, arg3, arg5, arg13);
        }
        int var20 = arg14;
        long var21 = this.field1720;
        int[] var23 = this.field1741;
        if (arg13 != null && (arg13.field2267 >= 0 || arg13.field2268 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1741[var24];
            }
            if (arg13.field2267 >= 0) {
                if (arg13.field2267 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class248.method1549(arg13.field2267, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg13.field2268 >= 0) {
                if (arg13.field2268 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class248.method1549(1073741824, arg13.field2268);
                    var21 ^= (long) var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = arg13 != null || arg5 != null;
        int var28 = arg10 == null ? 0 : arg10.length;
        for (int var29 = 0; var29 < var28; var29++) {
            class44.field640[var29] = null;
            if (arg10[var29] != null) {
                class153 var30 = arg18.method2081(arg10[var29].field5177, 0);
                if (var30.field2254 != null) {
                    class278.field4093[var29] = var30;
                    var27 = true;
                    int var31 = arg10[var29].field5181;
                    int var32 = arg10[var29].field5182;
                    int var33 = var30.field2254[var31];
                    class44.field640[var29] = arg18.method2082(-23748, var33 >>> 16);
                    int var34 = var33 & 0xFFFF;
                    class360.field5184[var29] = var34;
                    if (class44.field640[var29] != null) {
                        var26 |= class44.field640[var29].method218(14, var34);
                        var25 |= class44.field640[var29].method217(65280, var34);
                    }
                    if ((var30.field2264 || class70.field884) && var32 != -1 && var32 < var30.field2254.length) {
                        class442.field6130[var29] = var30.field2275[var31];
                        class356.field5141[var29] = arg10[var29].field5176;
                        int var35 = var30.field2254[var32];
                        client.field2621[var29] = arg18.method2082(-23748, var35 >>> 16);
                        int var36 = var35 & 0xFFFF;
                        class388.field5512[var29] = var36;
                        if (client.field2621[var29] != null) {
                            var26 |= client.field2621[var29].method218(14, var36);
                            var25 |= client.field2621[var29].method217(arg8 + 65285, var36);
                        }
                    } else {
                        class442.field6130[var29] = 0;
                        class356.field5141[var29] = 0;
                        client.field2621[var29] = null;
                        class388.field5512[var29] = -1;
                    }
                }
            }
        }
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class31 var40 = null;
        class31 var41 = null;
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class31 var45 = null;
        class31 var46 = null;
        if (var27) {
            if (arg13 != null) {
                int var47 = arg13.field2254[arg17];
                int var48 = var47 >>> 16;
                var40 = arg18.method2082(-23748, var48);
                var37 = var47 & 0xFFFF;
                if (var40 != null) {
                    var26 |= var40.method218(14, var37);
                    var25 |= var40.method217(65280, var37);
                }
                if ((arg13.field2264 || class70.field884) && arg4 != -1 && arg4 < arg13.field2254.length) {
                    var39 = arg13.field2275[arg17];
                    int var49 = arg13.field2254[arg4];
                    int var50 = var49 >>> 16;
                    var38 = var49 & 0xFFFF;
                    var41 = var48 == var50 ? var40 : arg18.method2082(-23748, var50);
                    if (var41 != null) {
                        var26 |= var41.method218(14, var38);
                        var25 |= var41.method217(arg8 ^ 0xFFFF00FB, var38);
                    }
                }
            }
            var20 = arg14 | 0x20;
            if (arg5 != null) {
                int var51 = arg5.field2254[arg7];
                int var52 = var51 >>> 16;
                var42 = var51 & 0xFFFF;
                var45 = arg18.method2082(-23748, var52);
                if (var45 != null) {
                    var26 |= var45.method218(arg8 ^ 0xFFFFFFF5, var42);
                    var25 |= var45.method217(65280, var42);
                }
                if ((arg5.field2264 || class70.field884) && arg2 != -1 && arg2 < arg5.field2254.length) {
                    var44 = arg5.field2275[arg7];
                    int var53 = arg5.field2254[arg2];
                    int var54 = var53 >>> 16;
                    var43 = var53 & 0xFFFF;
                    var46 = var52 == var54 ? var45 : arg18.method2082(-23748, var54);
                    if (var46 != null) {
                        var26 |= var46.method218(14, var43);
                        var25 |= var46.method217(arg8 + 65285, var43);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
        }
        class232 var55 = class143.field1895;
        class491 var56;
        synchronized (class143.field1895) {
            var56 = (class491) class143.field1895.method1479(0, var21);
        }
        if (arg8 != -5) {
            return null;
        }
        class332 var57 = null;
        if (this.field1738 != -1) {
            var57 = arg3.method404(false, this.field1738);
        }
        if (var56 == null || arg16.method653(var56.method1319(), var20) != 0 || var57 != null && var57.field4805 != null && this.field1722 == null) {
            if (var56 != null) {
                var20 = arg16.method647(var20, var56.method1319());
            }
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 12) {
                    if (var59) {
                        if (this.field1734 != -1L) {
                            class232 var62 = class143.field1895;
                            synchronized (class143.field1895) {
                                var56 = (class491) class143.field1895.method1479(0, this.field1734);
                            }
                        }
                        if (var56 == null || arg16.method653(var56.method1319(), var20) != 0 || var57 != null && var57.field4805 != null && this.field1722 == null) {
                            return null;
                        }
                    } else {
                        class187[] var63 = new class187[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class187 var66 = arg11.method2129(var65 & 0x3FFFFFFF, false).method275(this.field1727, (byte) 115);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            } else if ((var65 & Integer.MIN_VALUE) != 0) {
                                class187 var67 = arg9.method1776((byte) 110, var65 & 0x3FFFFFFF).method2872(true);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            }
                        }
                        if (var57 != null && var57.field4805 != null) {
                            for (int var68 = 0; var68 < var57.field4805.length; var68++) {
                                if (var57.field4805[var68] != null && var63[var68] != null) {
                                    int var69 = var57.field4805[var68][0];
                                    int var70 = var57.field4805[var68][1];
                                    int var71 = var57.field4805[var68][2];
                                    int var72 = var57.field4805[var68][3] << 3;
                                    int var73 = var57.field4805[var68][4] << 3;
                                    int var74 = var57.field4805[var68][5] << 3;
                                    if (this.field1722 == null) {
                                        this.field1722 = new int[var57.field4805.length][];
                                    }
                                    if (this.field1722[var68] == null) {
                                        int[] var75 = this.field1722[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[12] = -var69;
                                            var75[13] = -var70;
                                            var75[14] = -var71;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                        } else {
                                            int var76 = class53.field726[var72];
                                            int var77 = class53.field727[var72];
                                            int var78 = class53.field726[var73];
                                            int var79 = class53.field727[var73];
                                            int var80 = class53.field726[var74];
                                            int var81 = class53.field727[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[1] = var79 * var82 + (-var81 * var78 + 16384) >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[7] = var78 * var82 + -var79 * -var81 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                            var75[13] = var75[1] * -var69 + var75[4] * -var70 + (var75[7] * -var71) + 16384 >> 15;
                                            var75[12] = var75[3] * -var70 + var75[0] * -var69 + var75[6] * -var71 + 16384 >> 15;
                                            var75[14] = var75[2] * -var69 + var75[5] * -var70 + var75[8] * -var71 + 16384 >> 15;
                                        }
                                        var75[11] = var71;
                                        var75[9] = var69;
                                        var75[10] = var70;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method1153(var72, var73, var74, (byte) 17);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method1158(var70, var69, 15124, var71);
                                    }
                                }
                            }
                        }
                        class187 var84 = new class187(var63, var63.length);
                        int var85 = var20 | 0x2000;
                        var56 = arg16.method696(var84, var85, class92.field1165, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (class332.field4835[var86].length > this.field1731[var86]) {
                                var56.method1309(class9.field84[var86], class332.field4835[var86][this.field1731[var86]]);
                            }
                            if (this.field1731[var86] < class163.field2413[var86].length) {
                                var56.method1309(class386.field5488[var86], class163.field2413[var86][this.field1731[var86]]);
                            }
                        }
                        if (arg1) {
                            var56.method1344(var20);
                            class232 var87 = class143.field1895;
                            synchronized (class143.field1895) {
                                class143.field1895.method1473(var56, var21, -16);
                            }
                            this.field1734 = var21;
                        }
                    }
                    break;
                }
                int var61 = var23[var60];
                if ((var61 & 0x40000000) == 0) {
                    if ((var61 & Integer.MIN_VALUE) != 0 && !arg9.method1776((byte) 99, var61 & 0x3FFFFFFF).method2871((byte) 98)) {
                        var59 = true;
                    }
                } else if (!arg11.method2129(var61 & 0x3FFFFFFF, false).method272(this.field1727, -123)) {
                    var59 = true;
                }
                var60++;
            }
        }
        class491 var88 = var56.method1292((byte) 4, var20, true);
        if (!var27) {
            return var88;
        }
        int var89 = 0;
        int var90 = 1;
        while (var28 > var89) {
            if (class44.field640[var89] != null) {
                var88.method2882(0, var90, this.field1722 == null ? null : this.field1722[var89], class388.field5512[var89], client.field2621[var89], false, class44.field640[var89], class356.field5141[var89] - 1, class442.field6130[var89], class360.field5184[var89], arg8 ^ 0x4);
            }
            var90 <<= 0x1;
            var89++;
        }
        if (var40 != null && var45 != null) {
            var88.method2876(var44, var43, var38, var40, arg15 - 1, false, arg13.field2281, 16383, var37, var45, var46, arg0 - 1, var42, var39, var41);
        } else if (var40 != null) {
            var88.method2885(var37, var40, var39, 0, arg0 - 1, (byte) -59, false, var38, var41);
        } else if (var45 != null) {
            var88.method2885(var42, var45, var44, 0, arg15 - 1, (byte) -59, false, var43, var46);
        }
        for (int var91 = 0; var91 < var28; var91++) {
            class44.field640[var91] = null;
            client.field2621[var91] = null;
            class278.field4093[var91] = null;
        }
        return var88;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ZB)V")
    public final void method829(boolean arg0, byte arg1) {
        this.field1727 = arg0;
        field1718++;
        this.method825(false);
        if (arg1 < 93) {
            method835(-117, 30, -108, -31);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IILcn;ILnp;Lti;ILok;IIII)Lf;")
    public final class491 method830(int arg0, int arg1, class329 arg2, int arg3, class313 arg4, class280 arg5, int arg6, class153 arg7, int arg8, int arg9, int arg10, int arg11) {
        field1726++;
        int var13 = arg0;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            var13 = arg0 | 0x20;
            int var20 = arg7.field2254[arg9];
            Object var21 = null;
            int var22 = var20 >>> 16;
            int var23 = var20 & 0xFFFF;
            class31 var24 = arg2.method2082(-23748, var22);
            if (var24 != null) {
                var15 |= var24.method218(14, var23);
                var14 |= var24.method217(65280, var23);
                var16 |= arg7.field2271;
            }
            if ((arg7.field2264 || class70.field884) && arg1 != -1 && arg7.field2254.length > arg1) {
                int var25 = arg7.field2254[arg1];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class31 var28;
                if (var22 == var26) {
                    var28 = var24;
                } else {
                    var28 = arg2.method2082(-23748, var27 >>> 16);
                }
                if (var28 != null) {
                    var15 |= var28.method218(arg3 + 12572, var27);
                    var14 |= var28.method217(65280, var27);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
        }
        long var29 = (long) arg6 | (long) (arg11 << 16) | (long) arg8 << 32;
        class232 var31 = class368.field5316;
        class491 var32;
        synchronized (class368.field5316) {
            var32 = (class491) class368.field5316.method1479(0, var29);
            if (arg3 != -12558) {
                this.field1740 = 56;
            }
        }
        if (var32 == null || arg4.method653(var32.method1319(), var13) != 0) {
            if (var32 != null) {
                var13 = arg4.method647(var13, var32.method1319());
            }
            class187[] var34 = new class187[3];
            int var35 = 0;
            if (!arg5.method1776((byte) 120, arg6).method2867(false) || !arg5.method1776((byte) 115, arg11).method2867(false) || !arg5.method1776((byte) 113, arg8).method2867(false)) {
                return null;
            }
            class187 var36 = arg5.method1776((byte) 94, arg6).method2874(0);
            if (var36 != null) {
                var34[var35++] = var36;
            }
            class187 var37 = arg5.method1776((byte) 100, arg11).method2874(0);
            if (var37 != null) {
                var34[var35++] = var37;
            }
            class187 var38 = arg5.method1776((byte) 110, arg8).method2874(0);
            if (var38 != null) {
                var34[var35++] = var38;
            }
            int var39 = var13 | 0x2000;
            class187 var40 = new class187(var34, var35);
            var32 = arg4.method696(var40, var39, class92.field1165, 64, 768);
            for (int var41 = 0; var41 < 5; var41++) {
                if (this.field1731[var41] < class332.field4835[var41].length) {
                    var32.method1309(class9.field84[var41], class332.field4835[var41][this.field1731[var41]]);
                }
                if (class163.field2413[var41].length > this.field1731[var41]) {
                    var32.method1309(class386.field5488[var41], class163.field2413[var41][this.field1731[var41]]);
                }
            }
            var32.method1344(var13);
            class232 var42 = class368.field5316;
            synchronized (class368.field5316) {
                class368.field5316.method1473(var32, var29, arg3 ^ 0xFFFFCE82);
            }
        }
        if (arg7 == null) {
            return var32;
        } else {
            class491 var43 = var32.method1292((byte) 4, var13, true);
            return arg7.method959(arg1, 256, var43, arg10, arg0, arg9);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILdt;II)V")
    public static final void method831(int arg0, class145 arg1, int arg2, int arg3) {
        if (arg2 == 1073741824) {
            field1721++;
            class360.field5185 = arg3;
            class243.field3626 = arg0;
            class168.field2462 = arg1;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(Lfl;Lcn;IILti;Lfd;ILok;IILqt;Lnp;)Lf;")
    public final class491 method832(class480 arg0, class329 arg1, int arg2, int arg3, class280 arg4, class338 arg5, int arg6, class153 arg7, int arg8, int arg9, class417 arg10, class313 arg11) {
        field1733++;
        if (this.field1740 != -1) {
            return arg0.method2800(this.field1740, (byte) 32).method2736(arg1, arg10, -117, arg8, arg9, arg3, arg7, arg11, arg2);
        }
        int var13 = arg3;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            int var20 = arg7.field2254[arg9];
            var13 = arg3 | 0x20;
            Object var21 = null;
            int var22 = var20 >>> 16;
            class31 var23 = arg1.method2082(-23748, var22);
            int var24 = var20 & 0xFFFF;
            if (var23 != null) {
                var15 |= var23.method218(14, var24);
                var14 |= var23.method217(65280, var24);
                var16 |= arg7.field2271;
            }
            if ((arg7.field2264 || class70.field884) && arg2 != -1 && arg2 < arg7.field2254.length) {
                int var25 = arg7.field2254[arg2];
                int var26 = var25 >>> 16;
                class31 var27 = var22 == var26 ? var23 : arg1.method2082(-23748, var26);
                int var28 = var25 & 0xFFFF;
                if (var27 != null) {
                    var15 |= var27.method218(14, var28);
                    var14 |= var27.method217(65280, var28);
                }
            }
            if (var15) {
                var13 |= 0x80;
            }
            if (var14) {
                var13 |= 0x100;
            }
            if (var16) {
                var13 |= 0x200;
            }
        }
        class232 var29 = class368.field5316;
        class491 var30;
        synchronized (class368.field5316) {
            if (arg6 != 128) {
                method834(-111);
            }
            var30 = (class491) class368.field5316.method1479(0, this.field1720);
        }
        if (var30 == null || arg11.method653(var30.method1319(), var13) != 0) {
            if (var30 != null) {
                var13 = arg11.method647(var13, var30.method1319());
            }
            boolean var32 = false;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field1741[var33];
                if ((var34 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var34) != 0 && !arg4.method1776((byte) 116, var34 & 0x3FFFFFFF).method2867(false)) {
                        var32 = true;
                    }
                } else if (!arg5.method2129(var34 & 0x3FFFFFFF, false).method274(0, this.field1727)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class187[] var35 = new class187[12];
            int var36 = 0;
            for (int var37 = 0; var37 < 12; var37++) {
                int var38 = this.field1741[var37];
                if ((var38 & 0x40000000) != 0) {
                    class187 var40 = arg5.method2129(var38 & 0x3FFFFFFF, false).method264(arg6 ^ 0xFFFFFF7F, this.field1727);
                    if (var40 != null) {
                        var35[var36++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var38) != 0) {
                    class187 var39 = arg4.method1776((byte) 121, var38 & 0x3FFFFFFF).method2874(arg6 ^ 0x80);
                    if (var39 != null) {
                        var35[var36++] = var39;
                    }
                }
            }
            class187 var41 = new class187(var35, var36);
            int var42 = var13 | 0x2000;
            var30 = arg11.method696(var41, var42, class92.field1165, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (class332.field4835[var43].length > this.field1731[var43]) {
                    var30.method1309(class9.field84[var43], class332.field4835[var43][this.field1731[var43]]);
                }
                if (class163.field2413[var43].length > this.field1731[var43]) {
                    var30.method1309(class386.field5488[var43], class163.field2413[var43][this.field1731[var43]]);
                }
            }
            var30.method1344(var13);
            class232 var44 = class368.field5316;
            synchronized (class368.field5316) {
                class368.field5316.method1473(var30, this.field1720, arg6 - 7);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            var30.method1292((byte) 4, var13, true);
            return arg7.method959(arg2, 256, var30, arg8, arg3, arg9);
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(ILti;II)V")
    public final void method833(int arg0, class280 arg1, int arg2, int arg3) {
        if (arg0 < 77) {
            method834(10);
        }
        field1739++;
        int var5 = class93.field1180[arg3];
        if (this.field1741[var5] != 0 && arg1.method1776((byte) 98, arg2) != null) {
            this.field1741[var5] = class248.method1549(Integer.MIN_VALUE, arg2);
            this.method825(false);
        }
    }

    @OriginalMember(owner = "client!cu", name = "b", descriptor = "(I)Lpc;")
    public static final class438 method834(int arg0) {
        field1724++;
        try {
            return arg0 == -3164 ? (class438) Class.forName("db").getDeclaredConstructor().newInstance() : null;
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IIII)I")
    public static final int method835(int arg0, int arg1, int arg2, int arg3) {
        field1736++;
        if (class53.field725 == null) {
            return 0;
        }
        int var4 = arg2 >> 7;
        int var5 = arg0 >> 7;
        if (var4 < 0 || var5 < 0 || var4 > (class58.field758 - 1) || class287.field4181 - 1 < var5) {
            return 0;
        }
        int var6 = arg1;
        if (arg1 < 3 && (class413.field5813[1][var4][var5] & 0x2) != 0) {
            var6 = arg1 + 1;
        }
        return arg3 == 2002 ? class53.field725[var6].method1209(arg2, arg0) : 49;
    }

    @OriginalMember(owner = "client!cu", name = "a", descriptor = "(IBI)V")
    public final void method836(int arg0, byte arg1, int arg2) {
        this.field1731[arg0] = arg2;
        if (arg1 != -120) {
            method835(49, -123, -95, 35);
        }
        field1719++;
        this.method825(false);
    }
}
