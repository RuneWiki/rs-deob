import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vv")
public class class274 {

    @OriginalMember(owner = "client!vv", name = "e", descriptor = "I")
    public int field3831 = -1;

    @OriginalMember(owner = "client!vv", name = "k", descriptor = "Z")
    public static boolean field3837 = true;

    @OriginalMember(owner = "client!vv", name = "q", descriptor = "Z")
    public static boolean field3843 = false;

    @OriginalMember(owner = "client!vv", name = "t", descriptor = "[I")
    public static int[] field3846 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!vv", name = "m", descriptor = "Lua;")
    public static class581 field3839 = new class581();

    @OriginalMember(owner = "client!vv", name = "u", descriptor = "[I")
    public static int[] field3847 = new int[2];

    @OriginalMember(owner = "client!vv", name = "v", descriptor = "I")
    public static int field3848 = 1;

    @OriginalMember(owner = "client!vv", name = "b", descriptor = "I")
    public static int field3828;

    @OriginalMember(owner = "client!vv", name = "c", descriptor = "I")
    public static int field3829;

    @OriginalMember(owner = "client!vv", name = "d", descriptor = "I")
    public static int field3830;

    @OriginalMember(owner = "client!vv", name = "g", descriptor = "I")
    public static int field3833;

    @OriginalMember(owner = "client!vv", name = "h", descriptor = "I")
    private int field3834;

    @OriginalMember(owner = "client!vv", name = "n", descriptor = "I")
    public static int field3840;

    @OriginalMember(owner = "client!vv", name = "o", descriptor = "I")
    public static int field3841;

    @OriginalMember(owner = "client!vv", name = "p", descriptor = "I")
    public static int field3842;

    @OriginalMember(owner = "client!vv", name = "r", descriptor = "I")
    public static int field3844;

    @OriginalMember(owner = "client!vv", name = "f", descriptor = "J")
    private long field3832;

    @OriginalMember(owner = "client!vv", name = "l", descriptor = "J")
    private long field3838;

    @OriginalMember(owner = "client!vv", name = "j", descriptor = "Z")
    public boolean field3836;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "[I")
    public int[] field3827;

    @OriginalMember(owner = "client!vv", name = "s", descriptor = "[I")
    private int[] field3845;

    @OriginalMember(owner = "client!vv", name = "i", descriptor = "[[I")
    private int[][] field3835;

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lqi;IIIBILoa;ILed;Lhi;II)Lba;")
    public final class327 method1784(class494 arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, class605 arg6, int arg7, class613 arg8, class177 arg9, int arg10, int arg11) {
        field3829++;
        int var13 = arg7;
        if (arg9 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg7 | 0x20;
            Object var21 = null;
            int var22 = arg9.field2181[arg1];
            int var23 = var22 >>> 16;
            class66 var24 = arg0.method2964(var23, 58);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method454(var25, 91);
                var14 |= var24.method453(0, var25);
                var17 |= var24.method455(91, var25);
                var16 |= arg9.field2180;
            }
            if ((arg9.field2153 || class233.field3267) && arg3 != -1 && arg3 < arg9.field2181.length) {
                int var26 = arg9.field2181[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class66 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg0.method2964(var28 >>> 16, 90);
                }
                if (var29 != null) {
                    var15 |= var29.method454(var28, 91);
                    var14 |= var29.method453(0, var28);
                    var17 |= var29.method455(91, var28);
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
        long var30 = (long) arg11 << 32 | (long) (arg10 << 16) | (long) arg5;
        class277 var32 = class191.field2508;
        class327 var33;
        synchronized (class191.field2508) {
            var33 = (class327) class191.field2508.method1801(0, var30);
        }
        if (var33 == null || arg6.method293(var33.method1375(), var13) != 0) {
            if (var33 != null) {
                var13 = arg6.method300(var13, var33.method1375());
            }
            class557[] var35 = new class557[3];
            int var36 = 0;
            if (!arg8.method3546(arg5, (byte) -70).method1860(11040) || !arg8.method3546(arg10, (byte) -94).method1860(11040) || !arg8.method3546(arg11, (byte) -72).method1860(11040)) {
                return null;
            }
            class557 var37 = arg8.method3546(arg5, (byte) -46).method1859(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class557 var38 = arg8.method3546(arg10, (byte) -114).method1859(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class557 var39 = arg8.method3546(arg11, (byte) -47).method1859(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class557 var40 = new class557(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg6.method326(var40, var41, class194.field2637, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class118.field1467[var42].length > this.field3827[var42]) {
                    var33.method1351(class132.field1658[var42], class118.field1467[var42][this.field3827[var42]]);
                }
                if (class13.field116[var42].length > this.field3827[var42]) {
                    var33.method1351(class204.field2746[var42], class13.field116[var42][this.field3827[var42]]);
                }
            }
            var33.method1376(var13);
            class277 var43 = class191.field2508;
            synchronized (class191.field2508) {
                class191.field2508.method1808(var30, var33, (byte) -79);
            }
        }
        if (arg9 == null) {
            return var33;
        } else {
            class327 var44 = var33.method1382((byte) 4, var13, true);
            class327 var45 = arg9.method1008(arg2, var44, arg1, true, arg3, arg7);
            return arg4 >= -85 ? null : var45;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZ)V")
    public final void method1785(int arg0, boolean arg1) {
        field3841++;
        this.field3836 = arg1;
        this.method1789((byte) 93);
        if (arg0 != 2527) {
            this.field3827 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(I)V")
    public static void method1786(int arg0) {
        field3839 = null;
        field3846 = null;
        if (arg0 >= 104) {
            field3847 = null;
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lhi;Lqi;ILjs;Loa;IILsp;IILft;Led;)Lba;")
    public final class327 method1787(class177 arg0, class494 arg1, int arg2, class279 arg3, class605 arg4, int arg5, int arg6, class552 arg7, int arg8, int arg9, class4 arg10, class613 arg11) {
        field3844++;
        if (this.field3831 != -1) {
            return arg3.method1817(120, this.field3831).method3275(arg2, true, arg4, arg0, arg7, arg8, arg1, arg6, arg5);
        }
        int var13 = arg6;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field2181[arg8];
            var13 = arg6 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class66 var25 = arg1.method2964(var23, 96);
            if (var25 != null) {
                var15 |= var25.method454(var24, 91);
                var14 |= var25.method453(0, var24);
                var17 |= var25.method455(91, var24);
                var16 |= arg0.field2180;
            }
            if ((arg0.field2153 || class233.field3267) && arg5 != -1 && arg0.field2181.length > arg5) {
                int var26 = arg0.field2181[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class66 var29 = var23 == var27 ? var25 : arg1.method2964(var27, 115);
                if (var29 != null) {
                    var15 |= var29.method454(var28, 91);
                    var14 |= var29.method453(0, var28);
                    var17 |= var29.method455(91, var28);
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
        class277 var30 = class191.field2508;
        class327 var31;
        synchronized (class191.field2508) {
            var31 = (class327) class191.field2508.method1801(0, this.field3838);
            if (arg9 < 65) {
                this.method1784(null, 6, 72, 82, (byte) 60, 104, null, -96, null, null, 106, 47);
            }
        }
        if (var31 == null || arg4.method293(var31.method1375(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method300(var13, var31.method1375());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field3845[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg11.method3546(var35 & 0x3FFFFFFF, (byte) -79).method1860(11040)) {
                        var33 = true;
                    }
                } else if (!arg10.method25(var35 & 0x3FFFFFFF, -41).method1141(this.field3836, 86)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class557[] var36 = new class557[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field3845[var38];
                if ((var39 & 0x40000000) != 0) {
                    class557 var40 = arg10.method25(var39 & 0x3FFFFFFF, -106).method1134(this.field3836, (byte) 30);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class557 var41 = arg11.method3546(var39 & 0x3FFFFFFF, (byte) -54).method1859(0);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class557 var42 = new class557(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg4.method326(var42, var43, class194.field2637, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class118.field1467[var44].length > this.field3827[var44]) {
                    var31.method1351(class132.field1658[var44], class118.field1467[var44][this.field3827[var44]]);
                }
                if (class13.field116[var44].length > this.field3827[var44]) {
                    var31.method1351(class204.field2746[var44], class13.field116[var44][this.field3827[var44]]);
                }
            }
            var31.method1376(var13);
            class277 var45 = class191.field2508;
            synchronized (class191.field2508) {
                class191.field2508.method1808(this.field3838, var31, (byte) -100);
            }
        }
        if (arg0 == null) {
            return var31;
        } else {
            var31.method1382((byte) 4, var13, true);
            return arg0.method1008(arg2, var31, arg8, true, arg5, arg6);
        }
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(Lft;Lhi;Lhi;[Ljo;Lie;Ljs;IIILoa;Lqi;Lsp;IIILed;IIZ)Lba;")
    public final class327 method1788(class4 arg0, class177 arg1, class177 arg2, class283[] arg3, class6 arg4, class279 arg5, int arg6, int arg7, int arg8, class605 arg9, class494 arg10, class552 arg11, int arg12, int arg13, int arg14, class613 arg15, int arg16, int arg17, boolean arg18) {
        field3830++;
        if (this.field3831 != -1) {
            return arg5.method1817(118, this.field3831).method3279(arg12, arg17, arg2, arg3, 118, arg4, arg11, arg14, arg1, arg8, arg9, arg13, arg7, arg10, arg16);
        }
        int var20 = arg8;
        long var21 = this.field3838;
        int[] var23 = this.field3845;
        if (arg2 != null && (arg2.field2167 >= 0 || arg2.field2170 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field3845[var24];
            }
            if (arg2.field2167 >= 0) {
                if (arg2.field2167 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class283.method1834(1073741824, arg2.field2167);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg2.field2170 >= 0) {
                if (arg2.field2170 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class283.method1834(arg2.field2170, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg2 != null || arg1 != null;
        int var29 = arg3 == null ? 0 : arg3.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class453.field6773[var30] = null;
            if (arg3[var30] != null) {
                class177 var31 = arg10.method2961(arg3[var30].field3928, 8);
                if (var31.field2181 != null) {
                    class471.field6984[var30] = var31;
                    var28 = true;
                    int var32 = arg3[var30].field3929;
                    int var33 = arg3[var30].field3926;
                    int var34 = var31.field2181[var32];
                    class453.field6773[var30] = arg10.method2964(var34 >>> 16, class92.method583(arg6, 326));
                    int var35 = var34 & 0xFFFF;
                    class434.field6437[var30] = var35;
                    if (class453.field6773[var30] != null) {
                        var26 |= class453.field6773[var30].method454(var35, 91);
                        var25 |= class453.field6773[var30].method453(0, var35);
                        var27 |= class453.field6773[var30].method455(91, var35);
                    }
                    if ((var31.field2153 || class233.field3267) && var33 != -1 && var31.field2181.length > var33) {
                        class656.field9491[var30] = var31.field2150[var32];
                        class647.field9371[var30] = arg3[var30].field3930;
                        int var36 = var31.field2181[var33];
                        class655.field9458[var30] = arg10.method2964(var36 >>> 16, class92.method583(arg6, 361));
                        int var37 = var36 & 0xFFFF;
                        class413.field6272[var30] = var37;
                        if (class655.field9458[var30] != null) {
                            var26 |= class655.field9458[var30].method454(var37, 91);
                            var25 |= class655.field9458[var30].method453(0, var37);
                            var27 |= class655.field9458[var30].method455(91, var37);
                        }
                    } else {
                        class656.field9491[var30] = 0;
                        class647.field9371[var30] = 0;
                        class655.field9458[var30] = null;
                        class413.field6272[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class66 var41 = null;
        class66 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class66 var46 = null;
        class66 var47 = null;
        if (var28) {
            var20 = arg8 | 0x20;
            if (arg2 != null) {
                int var48 = arg2.field2181[arg13];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg10.method2964(var49, 91);
                if (var41 != null) {
                    var26 |= var41.method454(var38, 91);
                    var25 |= var41.method453(0, var38);
                    var27 |= var41.method455(91, var38);
                }
                if ((arg2.field2153 || class233.field3267) && arg14 != -1 && arg2.field2181.length > arg14) {
                    int var50 = arg2.field2181[arg14];
                    var40 = arg2.field2150[arg13];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg10.method2964(var51, 110);
                    if (var42 != null) {
                        var26 |= var42.method454(var39, 91);
                        var25 |= var42.method453(arg6 ^ 0x100, var39);
                        var27 |= var42.method455(91, var39);
                    }
                }
            }
            if (arg1 != null) {
                int var52 = arg1.field2181[arg7];
                int var53 = var52 >>> 16;
                var46 = arg10.method2964(var53, arg6 - 231);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method454(var43, 91);
                    var25 |= var46.method453(arg6 ^ 0x100, var43);
                    var27 |= var46.method455(91, var43);
                }
                if ((arg1.field2153 || class233.field3267) && arg12 != -1 && arg1.field2181.length > arg12) {
                    int var54 = arg1.field2181[arg12];
                    var45 = arg1.field2150[arg7];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg10.method2964(var55, 122);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method454(var44, 91);
                        var25 |= var47.method453(0, var44);
                        var27 |= var47.method455(91, var44);
                    }
                }
            }
            if (var26) {
                var20 |= 0x80;
            }
            if (var25) {
                var20 |= 0x100;
            }
            if (var27) {
                var20 |= 0x400;
            }
        }
        class277 var56 = class4.field33;
        class327 var57;
        synchronized (class4.field33) {
            var57 = (class327) class4.field33.method1801(0, var21);
        }
        class154 var58 = null;
        if (this.field3834 != -1) {
            var58 = arg4.method35(-71, this.field3834);
        }
        if (var57 == null || arg9.method293(var57.method1375(), var20) != 0 || var58 != null && var58.field1892 != null && this.field3835 == null) {
            if (var57 != null) {
                var20 = arg9.method300(var20, var57.method1375());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg15.method3546(var62 & 0x3FFFFFFF, (byte) -70).method1858((byte) -126)) {
                        var60 = true;
                    }
                } else if (!arg0.method25(var62 & 0x3FFFFFFF, -5).method1125(this.field3836, arg6 - 166)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field3832 != -1L) {
                    class277 var63 = class4.field33;
                    synchronized (class4.field33) {
                        var57 = (class327) class4.field33.method1801(0, this.field3832);
                    }
                }
                if (var57 == null || arg9.method293(var57.method1375(), var20) != 0 || var58 != null && var58.field1892 != null && this.field3835 == null) {
                    return null;
                }
            } else {
                class557[] var64 = new class557[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class557 var67 = arg0.method25(var66 & 0x3FFFFFFF, arg6 - 303).method1144((byte) 71, this.field3836);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class557 var68 = arg15.method3546(var66 & 0x3FFFFFFF, (byte) -100).method1861(125);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field1892 != null) {
                    for (int var69 = 0; var69 < var58.field1892.length; var69++) {
                        if (var58.field1892[var69] != null && var64[var69] != null) {
                            int var70 = var58.field1892[var69][0];
                            int var71 = var58.field1892[var69][1];
                            int var72 = var58.field1892[var69][2];
                            int var73 = var58.field1892[var69][3] << 3;
                            int var74 = var58.field1892[var69][4] << 3;
                            int var75 = var58.field1892[var69][5] << 3;
                            if (this.field3835 == null) {
                                this.field3835 = new int[var58.field1892.length][];
                            }
                            if (this.field3835[var69] == null) {
                                int[] var76 = this.field3835[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[14] = -var72;
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                } else {
                                    int var77 = class605.field8858[var73];
                                    int var78 = class605.field8859[var73];
                                    int var79 = class605.field8858[var74];
                                    int var80 = class605.field8859[var74];
                                    int var81 = class605.field8858[var75];
                                    int var82 = class605.field8859[var75];
                                    int var83 = var78 * var81 + 8192 >> 14;
                                    int var84 = var78 * var82 + 8192 >> 14;
                                    var76[3] = var77 * var82 + 8192 >> 14;
                                    var76[6] = var79 * var84 + -var80 * var81 + 8192 >> 14;
                                    var76[8] = var77 * var79 + 8192 >> 14;
                                    var76[4] = var77 * var81 + 8192 >> 14;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 8192 >> 14;
                                    var76[5] = -var78;
                                    var76[1] = -var82 * var79 + var80 * var83 + 8192 >> 14;
                                    var76[2] = var77 * var80 + 8192 >> 14;
                                    var76[0] = var79 * var81 + (var80 * var84) + 8192 >> 14;
                                    var76[12] = var76[0] * -var70 + (var76[3] * -var71) + (var76[6] * -var72 - -8192) >> 14;
                                    var76[13] = var76[1] * -var70 + var76[4] * -var71 - (-(var76[7] * -var72) + -8192) >> 14;
                                    var76[14] = var76[8] * -var72 + var76[2] * -var70 + (var76[5] * -var71) + 8192 >> 14;
                                }
                                var76[9] = var70;
                                var76[11] = var72;
                                var76[10] = var71;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method3219(var75, -114, var73, var74);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method3223(var70, var72, var71, false);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class557 var86 = new class557(var64, var64.length);
                var57 = arg9.method326(var86, var85, class194.field2637, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class118.field1467[var87].length > this.field3827[var87]) {
                        var57.method1351(class132.field1658[var87], class118.field1467[var87][this.field3827[var87]]);
                    }
                    if (class13.field116[var87].length > this.field3827[var87]) {
                        var57.method1351(class204.field2746[var87], class13.field116[var87][this.field3827[var87]]);
                    }
                }
                if (arg18) {
                    var57.method1376(var20);
                    class277 var88 = class4.field33;
                    synchronized (class4.field33) {
                        class4.field33.method1808(var21, var57, (byte) -46);
                    }
                    this.field3832 = var21;
                }
            }
        }
        class327 var89 = var57.method1382((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class453.field6773[var90] != null) {
                var89.method2119(class655.field9458[var90], class656.field9491[var90], false, 0, class453.field6773[var90], class434.field6437[var90], var91, this.field3835 == null ? null : this.field3835[var90], class413.field6272[var90], class647.field9371[var90] - 1, false);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (arg6 != 256) {
            field3847 = null;
        }
        if (var41 != null && var46 != null) {
            var89.method2124(var42, var38, arg17 - 1, var44, var46, var40, arg16 - 1, var43, true, arg2.field2157, var47, var39, var45, var41, false);
        } else if (var41 != null) {
            var89.method2116(var38, false, 0, var41, true, arg17 - 1, var39, var40, var42);
        } else if (var46 != null) {
            var89.method2116(var43, false, 0, var46, true, arg16 - 1, var44, var45, var47);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class453.field6773[var92] = null;
            class655.field9458[var92] = null;
            class471.field6984[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(B)V")
    private final void method1789(byte arg0) {
        field3842++;
        long[] var2 = class144.field1771;
        this.field3838 = -1L;
        this.field3838 = this.field3838 >>> 8 ^ var2[(int) (((long) (this.field3834 >> 8) ^ this.field3838) & 0xFFL)];
        this.field3838 = this.field3838 >>> 8 ^ var2[(int) ((this.field3838 ^ (long) this.field3834) & 0xFFL)];
        int var3 = -68 / ((19 - arg0) / 49);
        for (int var4 = 0; var4 < 12; var4++) {
            this.field3838 = var2[(int) (((long) (this.field3845[var4] >> 24) ^ this.field3838) & 0xFFL)] ^ this.field3838 >>> 8;
            this.field3838 = this.field3838 >>> 8 ^ var2[(int) ((this.field3838 ^ (long) (this.field3845[var4] >> 16)) & 0xFFL)];
            this.field3838 = this.field3838 >>> 8 ^ var2[(int) ((this.field3838 ^ (long) (this.field3845[var4] >> 8)) & 0xFFL)];
            this.field3838 = var2[(int) (((long) this.field3845[var4] ^ this.field3838) & 0xFFL)] ^ this.field3838 >>> 8;
        }
        for (int var5 = 0; var5 < 5; var5++) {
            this.field3838 = var2[(int) ((this.field3838 ^ (long) this.field3827[var5]) & 0xFFL)] ^ this.field3838 >>> 8;
        }
        this.field3838 = var2[(int) (((long) (this.field3836 ? 1 : 0) ^ this.field3838) & 0xFFL)] ^ this.field3838 >>> 8;
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IZI)V")
    public final void method1790(int arg0, boolean arg1, int arg2) {
        field3840++;
        if (!arg1) {
            this.field3836 = false;
        }
        this.field3827[arg0] = arg2;
        this.method1789((byte) 79);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(III[IZ[I)V")
    public final void method1791(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        if (this.field3834 != arg2) {
            this.field3835 = null;
            this.field3834 = arg2;
        }
        if (arg0 != 0) {
            return;
        }
        this.field3831 = arg1;
        this.field3845 = arg5;
        this.field3827 = arg3;
        field3828++;
        this.field3836 = arg4;
        this.method1789((byte) 92);
    }

    @OriginalMember(owner = "client!vv", name = "a", descriptor = "(IIILed;)V")
    public final void method1792(int arg0, int arg1, int arg2, class613 arg3) {
        field3833++;
        int var5 = class455.field6816[arg2];
        if (this.field3845[var5] != arg1 && arg3.method3546(arg0, (byte) -110) != null) {
            this.field3845[var5] = class283.method1834(Integer.MIN_VALUE, arg0);
            this.method1789((byte) 101);
        }
    }
}
