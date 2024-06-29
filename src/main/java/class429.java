import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uba")
public class class429 {

    @OriginalMember(owner = "client!uba", name = "d", descriptor = "I")
    public int field6229 = -1;

    @OriginalMember(owner = "client!uba", name = "n", descriptor = "I")
    public static int field6239 = 0;

    @OriginalMember(owner = "client!uba", name = "o", descriptor = "I")
    public static int field6240 = 0;

    @OriginalMember(owner = "client!uba", name = "f", descriptor = "Ldh;")
    public static class320 field6231 = new class320(30, -1);

    @OriginalMember(owner = "client!uba", name = "t", descriptor = "Lpia;")
    public static class94 field6245 = new class94(23, -1);

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "I")
    public static int field6227;

    @OriginalMember(owner = "client!uba", name = "e", descriptor = "I")
    public static int field6230;

    @OriginalMember(owner = "client!uba", name = "g", descriptor = "I")
    public static int field6232;

    @OriginalMember(owner = "client!uba", name = "h", descriptor = "I")
    public static int field6233;

    @OriginalMember(owner = "client!uba", name = "i", descriptor = "I")
    private int field6234;

    @OriginalMember(owner = "client!uba", name = "l", descriptor = "I")
    public static int field6237;

    @OriginalMember(owner = "client!uba", name = "m", descriptor = "I")
    public static int field6238;

    @OriginalMember(owner = "client!uba", name = "p", descriptor = "I")
    public static int field6241;

    @OriginalMember(owner = "client!uba", name = "q", descriptor = "I")
    public static int field6242;

    @OriginalMember(owner = "client!uba", name = "r", descriptor = "I")
    public static int field6243;

    @OriginalMember(owner = "client!uba", name = "c", descriptor = "J")
    private long field6228;

    @OriginalMember(owner = "client!uba", name = "k", descriptor = "J")
    private long field6236;

    @OriginalMember(owner = "client!uba", name = "j", descriptor = "Z")
    public boolean field6235;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "[I")
    private int[] field6226;

    @OriginalMember(owner = "client!uba", name = "s", descriptor = "[I")
    public int[] field6244;

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(II)I")
    public static final int method2681(int arg0, int arg1) {
        return class648.field9262 == null ? 0 : class648.field9262[arg0][arg1] & 0xFFFF;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lne;IIIILnf;Lpj;Luc;Lfba;Lha;ILea;)Lka;")
    public final class470 method2682(class317 arg0, int arg1, int arg2, int arg3, int arg4, class575 arg5, class146 arg6, class28 arg7, class25 arg8, class58 arg9, int arg10, class544 arg11) {
        field6243++;
        if (this.field6229 != -1) {
            return arg7.method136(245, this.field6229).method1950(arg4, arg2, arg5, arg1, arg0, arg3, arg9, (byte) 44, arg8);
        }
        int var13 = arg4;
        if (arg8 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg4 | 0x20;
            int var21 = arg8.field256[arg3];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class66 var24 = arg0.method1903((byte) -109, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method494(0, var25);
                var14 |= var24.method492(var25, false);
                var17 |= var24.method489(var25, 1);
                var16 |= arg8.field259;
            }
            if ((arg8.field251 || class16.field153) && arg2 != -1 && arg2 < arg8.field256.length) {
                int var26 = arg8.field256[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class66 var29 = var23 == var27 ? var24 : arg0.method1903((byte) -96, var27);
                if (var29 != null) {
                    var15 |= var29.method494(0, var28);
                    var14 |= var29.method492(var28, false);
                    var17 |= var29.method489(var28, 1);
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
            if (var17) {
                var13 |= 0x400;
            }
        }
        class620 var30 = class132.field1443;
        class470 var31;
        synchronized (class132.field1443) {
            var31 = (class470) class132.field1443.method3538(this.field6228, 0);
        }
        if (var31 == null || arg9.method418(var31.method213(), var13) != 0) {
            if (var31 != null) {
                var13 = arg9.method404(var13, var31.method213());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6226[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg11.method3195(3, var35 & 0x3FFFFFFF).method2171(-84)) {
                        var33 = true;
                    }
                } else if (!arg6.method912((byte) 1, var35 & 0x3FFFFFFF).method2706(this.field6235, 64)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class260[] var36 = new class260[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6226[var38];
                if ((var39 & 0x40000000) != 0) {
                    class260 var41 = arg6.method912((byte) 1, var39 & 0x3FFFFFFF).method2694(false, this.field6235);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class260 var40 = arg11.method3195(3, var39 & 0x3FFFFFFF).method2168(12838);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class260 var42 = new class260(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg9.method383(var42, var43, class387.field5371, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class127.field1332.length; var45++) {
                    if (this.field6244[var44] < class127.field1332[var45][var44].length) {
                        var31.method187(class291.field3581[var45][var44], class127.field1332[var45][var44][this.field6244[var44]]);
                    }
                }
            }
            var31.method207(var13);
            class620 var46 = class132.field1443;
            synchronized (class132.field1443) {
                class132.field1443.method3537(-60, this.field6228, var31);
            }
        }
        if (arg8 == null) {
            return var31;
        }
        var31.method237((byte) 4, var13, true);
        class470 var48 = arg8.method127(arg1, arg2, var31, false, arg3, arg4);
        if (arg10 <= 68) {
            field6239 = 120;
        }
        return var48;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BLea;II)V")
    public final void method2683(byte arg0, class544 arg1, int arg2, int arg3) {
        if (arg0 != 26) {
            method2689(36);
        }
        field6238++;
        int var5 = class372.field4753[arg2];
        if (arg1.method3195(arg0 - 23, arg3) != null) {
            this.field6226[var5] = class695.method3919(arg3, Integer.MIN_VALUE);
            this.method2688(1917795120);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(Lpj;III)V")
    public final void method2684(class146 arg0, int arg1, int arg2, int arg3) {
        field6237++;
        if (arg1 == arg3) {
            this.field6226[arg2] = 0;
        } else if (arg0.method912((byte) 1, arg3) != null) {
            this.field6226[arg2] = class695.method3919(arg3, 1073741824);
            this.method2688(arg1 ^ 0x8DB0C4CF);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ILfba;Lea;Lha;ILpj;Lnf;ILne;Luc;ILfba;ILmea;ZIIB[Lfaa;[II)Lka;")
    public final class470 method2685(int arg0, class25 arg1, class544 arg2, class58 arg3, int arg4, class146 arg5, class575 arg6, int arg7, class317 arg8, class28 arg9, int arg10, class25 arg11, int arg12, class428 arg13, boolean arg14, int arg15, int arg16, byte arg17, class154[] arg18, int[] arg19, int arg20) {
        field6233++;
        if (this.field6229 != -1) {
            return arg9.method136(245, this.field6229).method1948(arg1, arg8, arg6, arg16, arg13, arg19, 0, arg0, arg15, arg20, arg7, arg12, arg3, arg11, arg18, arg10, arg4);
        }
        int var22 = arg12;
        long var23 = this.field6228;
        int[] var25 = this.field6226;
        if (arg1 != null && (arg1.field257 >= 0 || arg1.field265 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field6226[var26];
            }
            if (arg1.field257 >= 0) {
                if (arg1.field257 == 65535) {
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class695.method3919(1073741824, arg1.field257);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg1.field265 >= 0) {
                if (arg1.field265 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class695.method3919(arg1.field265, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg1 != null || arg11 != null;
        int var31 = arg18 == null ? 0 : arg18.length;
        for (int var32 = 0; var32 < var31; var32++) {
            class240.field2860[var32] = null;
            if (arg18[var32] != null) {
                class25 var33 = arg8.method1905(65, arg18[var32].field1690);
                if (var33.field256 != null) {
                    class503.field7070[var32] = var33;
                    var30 = true;
                    int var34 = arg18[var32].field1694;
                    int var35 = arg18[var32].field1697;
                    int var36 = var33.field256[var34];
                    class240.field2860[var32] = arg8.method1903((byte) 93, var36 >>> 16);
                    int var37 = var36 & 0xFFFF;
                    class757.field10548[var32] = var37;
                    if (class240.field2860[var32] != null) {
                        var28 |= class240.field2860[var32].method494(0, var37);
                        var27 |= class240.field2860[var32].method492(var37, false);
                        var29 |= class240.field2860[var32].method489(var37, 1);
                    }
                    if ((var33.field251 || class16.field153) && var35 != -1 && var35 < var33.field256.length) {
                        class263.field3282[var32] = var33.field253[var34];
                        class680.field9621[var32] = arg18[var32].field1699;
                        int var38 = var33.field256[var35];
                        class721.field10118[var32] = arg8.method1903((byte) -61, var38 >>> 16);
                        int var39 = var38 & 0xFFFF;
                        class341.field4409[var32] = var39;
                        if (class721.field10118[var32] != null) {
                            var28 |= class721.field10118[var32].method494(0, var39);
                            var27 |= class721.field10118[var32].method492(var39, false);
                            var29 |= class721.field10118[var32].method489(var39, 1);
                        }
                    } else {
                        class263.field3282[var32] = 0;
                        class680.field9621[var32] = 0;
                        class721.field10118[var32] = null;
                        class341.field4409[var32] = -1;
                    }
                }
            }
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class66 var43 = null;
        class66 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class66 var48 = null;
        class66 var49 = null;
        if (var30) {
            var22 = arg12 | 0x20;
            if (arg1 != null) {
                int var50 = arg1.field256[arg20];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg8.method1903((byte) 74, var51);
                if (var43 != null) {
                    var28 |= var43.method494(0, var40);
                    var27 |= var43.method492(var40, false);
                    var29 |= var43.method489(var40, 1);
                }
                if ((arg1.field251 || class16.field153) && arg10 != -1 && arg10 < arg1.field256.length) {
                    var42 = arg1.field253[arg20];
                    int var52 = arg1.field256[arg10];
                    int var53 = var52 >>> 16;
                    var44 = var51 == var53 ? var43 : arg8.method1903((byte) 105, var53);
                    var41 = var52 & 0xFFFF;
                    if (var44 != null) {
                        var28 |= var44.method494(0, var41);
                        var27 |= var44.method492(var41, false);
                        var29 |= var44.method489(var41, 1);
                    }
                }
            }
            if (arg11 != null) {
                int var54 = arg11.field256[arg7];
                int var55 = var54 >>> 16;
                var45 = var54 & 0xFFFF;
                var48 = arg8.method1903((byte) 111, var55);
                if (var48 != null) {
                    var28 |= var48.method494(0, var45);
                    var27 |= var48.method492(var45, false);
                    var29 |= var48.method489(var45, 1);
                }
                if ((arg11.field251 || class16.field153) && arg0 != -1 && arg11.field256.length > arg0) {
                    var47 = arg11.field253[arg7];
                    int var56 = arg11.field256[arg0];
                    int var57 = var56 >>> 16;
                    var46 = var56 & 0xFFFF;
                    var49 = var55 == var57 ? var48 : arg8.method1903((byte) 95, var57);
                    if (var49 != null) {
                        var28 |= var49.method494(0, var46);
                        var27 |= var49.method492(var46, false);
                        var29 |= var49.method489(var46, 1);
                    }
                }
            }
            if (var28) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var29) {
                var22 |= 0x400;
            }
        }
        if (arg17 <= 54) {
            field6245 = null;
        }
        class620 var58 = class529.field7530;
        class470 var59;
        synchronized (class529.field7530) {
            var59 = (class470) class529.field7530.method3538(var23, 0);
        }
        class255 var60 = null;
        if (this.field6234 != -1) {
            var60 = arg13.method2676(this.field6234, 120);
        }
        if (var59 == null || arg3.method418(var59.method213(), var22) != 0) {
            if (var59 != null) {
                var22 = arg3.method404(var22, var59.method213());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((var64 & Integer.MIN_VALUE) != 0 && !arg2.method3195(3, var64 & 0x3FFFFFFF).method2166(-90)) {
                        var62 = true;
                    }
                } else if (!arg5.method912((byte) 1, var64 & 0x3FFFFFFF).method2697(this.field6235, 0)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field6236 != -1L) {
                    class620 var82 = class529.field7530;
                    synchronized (class529.field7530) {
                        var59 = (class470) class529.field7530.method3538(this.field6236, 0);
                    }
                }
                if (var59 == null || arg3.method418(var59.method213(), var22) != 0) {
                    return null;
                }
            } else {
                class260[] var65 = new class260[12];
                for (int var66 = 0; var66 < 12; var66++) {
                    int var67 = var25[var66];
                    if ((var67 & 0x40000000) != 0) {
                        class260 var68 = arg5.method912((byte) 1, var67 & 0x3FFFFFFF).method2707(this.field6235, -19118);
                        if (var68 != null) {
                            var65[var66] = var68;
                        }
                    } else if ((Integer.MIN_VALUE & var67) != 0) {
                        class260 var69 = arg2.method3195(3, var67 & 0x3FFFFFFF).method2172(103);
                        if (var69 != null) {
                            var65[var66] = var69;
                        }
                    }
                }
                if (var60 != null && var60.field3070 != null) {
                    for (int var70 = 0; var70 < var60.field3070.length; var70++) {
                        if (var65[var70] != null) {
                            int var71 = 0;
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            if (var60.field3070[var70] != null) {
                                var73 = var60.field3070[var70][2];
                                var72 = var60.field3070[var70][1];
                                var76 = var60.field3070[var70][5] << 3;
                                var75 = var60.field3070[var70][4] << 3;
                                var71 = var60.field3070[var70][0];
                                var74 = var60.field3070[var70][3] << 3;
                            }
                            if (var74 != 0 || var75 != 0 || var76 != 0) {
                                var65[var70].method1564(var75, var74, (byte) -119, var76);
                            }
                            if (var71 != 0 || var72 != 0 || var73 != 0) {
                                var65[var70].method1558(var71, -85, var73, var72);
                            }
                        }
                    }
                }
                class260 var77 = new class260(var65, var65.length);
                int var78 = var22 | 0x4000;
                var59 = arg3.method383(var77, var78, class387.field5371, 64, 850);
                for (int var79 = 0; var79 < 5; var79++) {
                    for (int var80 = 0; var80 < class127.field1332.length; var80++) {
                        if (class127.field1332[var80][var79].length > this.field6244[var79]) {
                            var59.method187(class291.field3581[var80][var79], class127.field1332[var80][var79][this.field6244[var79]]);
                        }
                    }
                }
                if (arg14) {
                    var59.method207(var22);
                    class620 var81 = class529.field7530;
                    synchronized (class529.field7530) {
                        class529.field7530.method3537(122, var23, var59);
                    }
                    this.field6236 = var23;
                }
            }
        }
        class470 var83 = var59.method237((byte) 4, var22, true);
        boolean var84 = false;
        if (arg19 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg19[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class165[] var86 = null;
        if (var60 != null) {
            var86 = var60.method1520(0, arg3);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method210(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var31 > var88) {
            if (class240.field2860[var88] != null) {
                var83.method2843(false, class680.field9621[var88] - 1, (byte) 121, 0, class721.field10118[var88], class757.field10548[var88], class341.field4409[var88], class263.field3282[var88], var89, class240.field2860[var88], null);
            }
            var89 <<= 0x1;
            var88++;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg19[var90] != -1) {
                    int var91 = arg19[var90] - arg16;
                    int var92 = var91 & 0x3FFF;
                    class165 var93 = arg3.method352();
                    var93.method1035(var92);
                    var83.method210(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method210(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method2845(var40, false, var49, arg15 - 1, var48, var46, var44, var47, var43, var41, -1, var42, arg1.field267, var45, arg4 - 1);
        } else if (var43 != null) {
            var83.method2838(false, var41, var40, var44, var42, var43, -3369, arg4 - 1, 0);
        } else if (var48 != null) {
            var83.method2838(false, var46, var45, var49, var47, var48, -3369, arg15 - 1, 0);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class240.field2860[var95] = null;
            class721.field10118[var95] = null;
            class503.field7070[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(III)V")
    public final void method2686(int arg0, int arg1, int arg2) {
        this.field6244[arg0] = arg1;
        field6230++;
        this.method2688(arg2 ^ 0x8DB09EC9);
        if (arg2 != -23047) {
            method2689(34);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "([I[IZIII)V")
    public final void method2687(int[] arg0, int[] arg1, boolean arg2, int arg3, int arg4, int arg5) {
        field6232++;
        this.field6235 = arg2;
        this.field6226 = arg0;
        this.field6229 = arg5;
        if (this.field6234 != arg4) {
            this.field6234 = arg4;
        }
        this.field6244 = arg1;
        this.method2688(1917795120);
        if (arg3 != 1024) {
            this.method2687(null, null, false, 117, 38, 110);
        }
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(I)V")
    private final void method2688(int arg0) {
        field6241++;
        long[] var2 = class471.field6753;
        this.field6228 = -1L;
        this.field6228 = var2[(int) (((long) (this.field6234 >> 8) ^ this.field6228) & 0xFFL)] ^ this.field6228 >>> 8;
        this.field6228 = var2[(int) (((long) this.field6234 ^ this.field6228) & 0xFFL)] ^ this.field6228 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6228 = var2[(int) ((this.field6228 ^ (long) (this.field6226[var3] >> 24)) & 0xFFL)] ^ this.field6228 >>> 8;
            this.field6228 = var2[(int) (((long) (this.field6226[var3] >> 16) ^ this.field6228) & 0xFFL)] ^ this.field6228 >>> 8;
            this.field6228 = var2[(int) (((long) (this.field6226[var3] >> 8) ^ this.field6228) & 0xFFL)] ^ this.field6228 >>> 8;
            this.field6228 = this.field6228 >>> 8 ^ var2[(int) ((this.field6228 ^ (long) this.field6226[var3]) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6228 = this.field6228 >>> 8 ^ var2[(int) ((this.field6228 ^ (long) this.field6244[var4]) & 0xFFL)];
        }
        if (arg0 != 1917795120) {
            method2681(5, -114);
        }
        this.field6228 = var2[(int) ((this.field6228 ^ (long) (this.field6235 ? 1 : 0)) & 0xFFL)] ^ this.field6228 >>> 8;
    }

    @OriginalMember(owner = "client!uba", name = "b", descriptor = "(I)V")
    public static void method2689(int arg0) {
        field6245 = null;
        if (arg0 != 1) {
            method2689(20);
        }
        field6231 = null;
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(ZI)V")
    public final void method2690(boolean arg0, int arg1) {
        field6242++;
        this.field6235 = arg0;
        if (arg1 != 12134) {
            this.field6235 = true;
        }
        this.method2688(1917795120);
    }

    @OriginalMember(owner = "client!uba", name = "a", descriptor = "(BIILfba;IILne;IIILea;Lha;)Lka;")
    public final class470 method2691(byte arg0, int arg1, int arg2, class25 arg3, int arg4, int arg5, class317 arg6, int arg7, int arg8, int arg9, class544 arg10, class58 arg11) {
        field6227++;
        int var13 = arg7;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg3.field256[arg4];
            Object var22 = null;
            var13 = arg7 | 0x20;
            int var23 = var21 >>> 16;
            class66 var24 = arg6.method1903((byte) -102, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method494(0, var25);
                var14 |= var24.method492(var25, false);
                var17 |= var24.method489(var25, 1);
                var16 |= arg3.field259;
            }
            if ((arg3.field251 || class16.field153) && arg8 != -1 && arg3.field256.length > arg8) {
                int var26 = arg3.field256[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class66 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg6.method1903((byte) 113, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method494(0, var28);
                    var14 |= var29.method492(var28, false);
                    var17 |= var29.method489(var28, 1);
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
            if (var17) {
                var13 |= 0x400;
            }
        }
        long var30 = (long) arg1 | (long) arg9 << 32 | (long) (arg5 << 16);
        class620 var32 = class132.field1443;
        class470 var33;
        synchronized (class132.field1443) {
            var33 = (class470) class132.field1443.method3538(var30, 0);
        }
        if (var33 == null || arg11.method418(var33.method213(), var13) != 0) {
            if (var33 != null) {
                var13 = arg11.method404(var13, var33.method213());
            }
            class260[] var35 = new class260[3];
            int var36 = 0;
            if (!arg10.method3195(3, arg1).method2171(-80) || !arg10.method3195(3, arg5).method2171(-104) || !arg10.method3195(3, arg9).method2171(-107)) {
                return null;
            }
            class260 var37 = arg10.method3195(3, arg1).method2168(12838);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class260 var38 = arg10.method3195(3, arg5).method2168(12838);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class260 var39 = arg10.method3195(3, arg9).method2168(12838);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class260 var41 = new class260(var35, var36);
            var33 = arg11.method383(var41, var40, class387.field5371, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class127.field1332.length; var43++) {
                    if (this.field6244[var42] < class127.field1332[var43][var42].length) {
                        var33.method187(class291.field3581[var43][var42], class127.field1332[var43][var42][this.field6244[var42]]);
                    }
                }
            }
            var33.method207(var13);
            class620 var44 = class132.field1443;
            synchronized (class132.field1443) {
                class132.field1443.method3537(-79, var30, var33);
            }
        }
        if (arg3 == null) {
            return var33;
        } else {
            class470 var45 = var33.method237((byte) 4, var13, true);
            int var46 = -34 / ((13 - arg0) / 56);
            return arg3.method127(arg2, arg8, var45, false, arg4, arg7);
        }
    }
}
