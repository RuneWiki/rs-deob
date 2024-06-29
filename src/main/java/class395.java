import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pt")
public class class395 {

    @OriginalMember(owner = "client!pt", name = "u", descriptor = "I")
    public int field6012 = -1;

    @OriginalMember(owner = "client!pt", name = "f", descriptor = "[I")
    public static int[] field5997 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!pt", name = "m", descriptor = "[I")
    public static int[] field6004 = new int[5];

    @OriginalMember(owner = "client!pt", name = "s", descriptor = "Z")
    public static boolean field6010;

    @OriginalMember(owner = "client!pt", name = "v", descriptor = "Lui;")
    public static class375 field6013;

    @OriginalMember(owner = "client!pt", name = "x", descriptor = "Lwi;")
    public static class340 field6015;

    @OriginalMember(owner = "client!pt", name = "b", descriptor = "I")
    public static int field5993;

    @OriginalMember(owner = "client!pt", name = "c", descriptor = "I")
    public static int field5994;

    @OriginalMember(owner = "client!pt", name = "d", descriptor = "I")
    public static int field5995;

    @OriginalMember(owner = "client!pt", name = "g", descriptor = "I")
    public static int field5998;

    @OriginalMember(owner = "client!pt", name = "i", descriptor = "I")
    public static int field6000;

    @OriginalMember(owner = "client!pt", name = "j", descriptor = "I")
    public static int field6001;

    @OriginalMember(owner = "client!pt", name = "k", descriptor = "I")
    private int field6002;

    @OriginalMember(owner = "client!pt", name = "n", descriptor = "I")
    public static int field6005;

    @OriginalMember(owner = "client!pt", name = "o", descriptor = "I")
    public static int field6006;

    @OriginalMember(owner = "client!pt", name = "p", descriptor = "I")
    public static int field6007;

    @OriginalMember(owner = "client!pt", name = "r", descriptor = "I")
    public static int field6009;

    @OriginalMember(owner = "client!pt", name = "h", descriptor = "J")
    private long field5999;

    @OriginalMember(owner = "client!pt", name = "l", descriptor = "J")
    private long field6003;

    @OriginalMember(owner = "client!pt", name = "t", descriptor = "Z")
    public boolean field6011;

    @OriginalMember(owner = "client!pt", name = "w", descriptor = "[B")
    public static byte[] field6014;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "[I")
    private int[] field5992;

    @OriginalMember(owner = "client!pt", name = "e", descriptor = "[I")
    public int[] field5996;

    @OriginalMember(owner = "client!pt", name = "q", descriptor = "[[I")
    private int[][] field6008;

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(B)V")
    private final void method2425(byte arg0) {
        field5998++;
        long[] var2 = class94.field1364;
        this.field5999 = -1L;
        this.field5999 = this.field5999 >>> 8 ^ var2[(int) ((this.field5999 ^ (long) (this.field6002 >> 8)) & 0xFFL)];
        this.field5999 = var2[(int) ((this.field5999 ^ (long) this.field6002) & 0xFFL)] ^ this.field5999 >>> 8;
        if (arg0 > -16) {
            this.method2432(-46, false, null, 116);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5999 = this.field5999 >>> 8 ^ var2[(int) ((this.field5999 ^ (long) (this.field5992[var3] >> 24)) & 0xFFL)];
            this.field5999 = this.field5999 >>> 8 ^ var2[(int) ((this.field5999 ^ (long) (this.field5992[var3] >> 16)) & 0xFFL)];
            this.field5999 = this.field5999 >>> 8 ^ var2[(int) ((this.field5999 ^ (long) (this.field5992[var3] >> 8)) & 0xFFL)];
            this.field5999 = var2[(int) (((long) this.field5992[var3] ^ this.field5999) & 0xFFL)] ^ this.field5999 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field5999 = var2[(int) (((long) this.field5996[var4] ^ this.field5999) & 0xFFL)] ^ this.field5999 >>> 8;
        }
        this.field5999 = this.field5999 >>> 8 ^ var2[(int) (((long) (this.field6011 ? 1 : 0) ^ this.field5999) & 0xFFL)];
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIIB[BI)V")
    public static final void method2426(int arg0, int arg1, int arg2, byte arg3, byte[] arg4, int arg5) {
        field6001++;
        if (arg2 >= arg5) {
            return;
        }
        int var6 = arg1 + arg2;
        int var7 = arg5 - arg2 >> 2;
        while (true) {
            var7--;
            if (var7 < 0) {
                if (arg3 >= -1) {
                    field5997 = null;
                }
                int var8 = arg5 - arg2 & 0x3;
                while (true) {
                    var8--;
                    if (var8 < 0) {
                        return;
                    }
                    arg4[var6++] = 1;
                }
            }
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
            arg4[var6++] = 1;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IIILaj;Lru;Lfb;Ltq;Ldm;Lrg;Lqa;IB)Lc;")
    public final class201 method2427(int arg0, int arg1, int arg2, class300 arg3, class174 arg4, class365 arg5, class270 arg6, class508 arg7, class398 arg8, class496 arg9, int arg10, byte arg11) {
        field6005++;
        if (this.field6012 != -1) {
            return arg4.method1216(this.field6012, false).method2128(arg9, arg3, arg1, (byte) 88, arg0, arg2, arg10, arg5, arg6);
        }
        int var13 = arg2;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg6.field3765[arg10];
            Object var22 = null;
            var13 = arg2 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class472 var25 = arg3.method1936(var23, 213);
            if (var25 != null) {
                var15 |= var25.method2837(var24, 26582);
                var14 |= var25.method2834((byte) 63, var24);
                var17 |= var25.method2836(var24, (byte) 11);
                var16 |= arg6.field3760;
            }
            if ((arg6.field3744 || class58.field786) && arg1 != -1 && arg1 < arg6.field3765.length) {
                int var26 = arg6.field3765[arg1];
                int var27 = var26 >>> 16;
                class472 var28 = var23 == var27 ? var25 : arg3.method1936(var27, 213);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2837(var29, arg11 + 26683);
                    var14 |= var28.method2834((byte) 104, var29);
                    var17 |= var28.method2836(var29, (byte) 11);
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
        if (arg11 != -101) {
            return null;
        }
        class157 var30 = class166.field2417;
        class201 var31;
        synchronized (class166.field2417) {
            var31 = (class201) class166.field2417.method1013(this.field5999, (byte) -106);
        }
        if (var31 == null || arg9.method1141(var31.method279(), var13) != 0) {
            if (var31 != null) {
                var13 = arg9.method1130(var13, var31.method279());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field5992[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg7.method3029(17801, var35 & 0x3FFFFFFF).method229(false)) {
                        var33 = true;
                    }
                } else if (!arg8.method2451(-1, var35 & 0x3FFFFFFF).method412(this.field6011, 0)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class192[] var36 = new class192[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field5992[var38];
                if ((var39 & 0x40000000) != 0) {
                    class192 var41 = arg8.method2451(-1, var39 & 0x3FFFFFFF).method411(this.field6011, (byte) 59);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class192 var40 = arg7.method3029(arg11 ^ 0xFFFFBA12, var39 & 0x3FFFFFFF).method226(-116);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class192 var43 = new class192(var36, var37);
            var31 = arg9.method1076(var43, var42, class310.field4640, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field5996[var44] < class19.field287[var44].length) {
                    var31.method276(class336.field5218[var44], class19.field287[var44][this.field5996[var44]]);
                }
                if (this.field5996[var44] < class301.field4446[var44].length) {
                    var31.method276(class102.field1461[var44], class301.field4446[var44][this.field5996[var44]]);
                }
            }
            var31.method297(var13);
            class157 var45 = class166.field2417;
            synchronized (class166.field2417) {
                class166.field2417.method1012(-70, this.field5999, var31);
            }
        }
        if (arg6 == null) {
            return var31;
        } else {
            var31.method292((byte) 4, var13, true);
            return arg6.method1721(arg1, arg2, (byte) -69, arg0, var31, arg10);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ZI)V")
    public final void method2428(boolean arg0, int arg1) {
        if (arg1 <= 29) {
            this.field6011 = true;
        }
        this.field6011 = arg0;
        field6007++;
        this.method2425((byte) -68);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(ILta;Lfb;IZIZLdm;ILqa;IILrg;[Lhj;Ltq;Lru;Laj;Ltq;I)Lc;")
    public final class201 method2429(int arg0, class445 arg1, class365 arg2, int arg3, boolean arg4, int arg5, boolean arg6, class508 arg7, int arg8, class496 arg9, int arg10, int arg11, class398 arg12, class113[] arg13, class270 arg14, class174 arg15, class300 arg16, class270 arg17, int arg18) {
        field6000++;
        if (this.field6012 != -1) {
            return arg15.method1216(this.field6012, !arg6).method2123(arg1, arg10, arg18, arg8, arg5, arg17, arg0, arg3, arg16, -11601, arg13, arg14, arg2, arg9, arg11);
        }
        int var20 = arg8;
        long var21 = this.field5999;
        int[] var23 = this.field5992;
        if (arg17 != null && (arg17.field3743 >= 0 || arg17.field3762 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field5992[var24];
            }
            if (arg17.field3743 >= 0) {
                if (arg17.field3743 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class286.method1860(arg17.field3743, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg17.field3762 >= 0) {
                if (arg17.field3762 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class286.method1860(1073741824, arg17.field3762);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg17 != null || arg14 != null;
        int var29 = arg13 == null ? 0 : arg13.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class351.field5448[var30] = null;
            if (arg13[var30] != null) {
                class270 var31 = arg16.method1934(118, arg13[var30].field1587);
                if (var31.field3765 != null) {
                    var28 = true;
                    class261.field3637[var30] = var31;
                    int var32 = arg13[var30].field1579;
                    int var33 = arg13[var30].field1586;
                    int var34 = var31.field3765[var32];
                    class351.field5448[var30] = arg16.method1936(var34 >>> 16, 213);
                    int var35 = var34 & 0xFFFF;
                    class77.field1054[var30] = var35;
                    if (class351.field5448[var30] != null) {
                        var26 |= class351.field5448[var30].method2837(var35, 26582);
                        var25 |= class351.field5448[var30].method2834((byte) 109, var35);
                        var27 |= class351.field5448[var30].method2836(var35, (byte) 11);
                    }
                    if ((var31.field3744 || class58.field786) && var33 != -1 && var33 < var31.field3765.length) {
                        class119.field1686[var30] = var31.field3746[var32];
                        client.field943[var30] = arg13[var30].field1585;
                        int var36 = var31.field3765[var33];
                        class314.field4808[var30] = arg16.method1936(var36 >>> 16, 213);
                        int var37 = var36 & 0xFFFF;
                        class70.field969[var30] = var37;
                        if (class314.field4808[var30] != null) {
                            var26 |= class314.field4808[var30].method2837(var37, 26582);
                            var25 |= class314.field4808[var30].method2834((byte) 74, var37);
                            var27 |= class314.field4808[var30].method2836(var37, (byte) 11);
                        }
                    } else {
                        class119.field1686[var30] = 0;
                        client.field943[var30] = 0;
                        class314.field4808[var30] = null;
                        class70.field969[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class472 var41 = null;
        class472 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class472 var46 = null;
        class472 var47 = null;
        if (var28) {
            if (arg17 != null) {
                int var48 = arg17.field3765[arg18];
                int var49 = var48 >>> 16;
                var41 = arg16.method1936(var49, 213);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method2837(var38, 26582);
                    var25 |= var41.method2834((byte) 79, var38);
                    var27 |= var41.method2836(var38, (byte) 11);
                }
                if ((arg17.field3744 || class58.field786) && arg10 != -1 && arg17.field3765.length > arg10) {
                    var40 = arg17.field3746[arg18];
                    int var50 = arg17.field3765[arg10];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg16.method1936(var51, 213);
                    if (var42 != null) {
                        var26 |= var42.method2837(var39, 26582);
                        var25 |= var42.method2834((byte) 95, var39);
                        var27 |= var42.method2836(var39, (byte) 11);
                    }
                }
            }
            var20 = arg8 | 0x20;
            if (arg14 != null) {
                int var52 = arg14.field3765[arg0];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg16.method1936(var53, 213);
                if (var46 != null) {
                    var26 |= var46.method2837(var43, 26582);
                    var25 |= var46.method2834((byte) 122, var43);
                    var27 |= var46.method2836(var43, (byte) 11);
                }
                if ((arg14.field3744 || class58.field786) && arg11 != -1 && arg14.field3765.length > arg11) {
                    var45 = arg14.field3746[arg0];
                    int var54 = arg14.field3765[arg11];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg16.method1936(var55, 213);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method2837(var44, 26582);
                        var25 |= var47.method2834((byte) 65, var44);
                        var27 |= var47.method2836(var44, (byte) 11);
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
        class157 var56 = class295.field4360;
        class201 var57;
        synchronized (class295.field4360) {
            var57 = (class201) class295.field4360.method1013(var21, (byte) -106);
        }
        class219 var58 = null;
        if (this.field6002 != -1) {
            var58 = arg1.method2681(-102, this.field6002);
        }
        if (var57 == null || arg9.method1141(var57.method279(), var20) != 0 || var58 != null && var58.field3057 != null && this.field6008 == null) {
            if (var57 != null) {
                var20 = arg9.method1130(var20, var57.method279());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg7.method3029(17801, var62 & 0x3FFFFFFF).method231((byte) -100)) {
                        var60 = true;
                    }
                } else if (!arg12.method2451(-1, var62 & 0x3FFFFFFF).method407((byte) 104, this.field6011)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field6003 != -1L) {
                    class157 var63 = class295.field4360;
                    synchronized (class295.field4360) {
                        var57 = (class201) class295.field4360.method1013(this.field6003, (byte) -106);
                    }
                }
                if (var57 == null || arg9.method1141(var57.method279(), var20) != 0 || var58 != null && var58.field3057 != null && this.field6008 == null) {
                    return null;
                }
            } else {
                class192[] var64 = new class192[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class192 var67 = arg12.method2451(-1, var66 & 0x3FFFFFFF).method414(this.field6011, (byte) -128);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class192 var68 = arg7.method3029(17801, var66 & 0x3FFFFFFF).method227(0);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field3057 != null) {
                    for (int var69 = 0; var69 < var58.field3057.length; var69++) {
                        if (var58.field3057[var69] != null && var64[var69] != null) {
                            int var70 = var58.field3057[var69][0];
                            int var71 = var58.field3057[var69][1];
                            int var72 = var58.field3057[var69][2];
                            int var73 = var58.field3057[var69][3] << 3;
                            int var74 = var58.field3057[var69][4] << 3;
                            int var75 = var58.field3057[var69][5] << 3;
                            if (this.field6008 == null) {
                                this.field6008 = new int[var58.field3057.length][];
                            }
                            if (this.field6008[var69] == null) {
                                int[] var76 = this.field6008[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[12] = -var70;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[13] = -var71;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class525.field7763[var73];
                                    int var78 = class525.field7760[var73];
                                    int var79 = class525.field7763[var74];
                                    int var80 = class525.field7760[var74];
                                    int var81 = class525.field7763[var75];
                                    int var82 = class525.field7760[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + (var80 * var83 + 16384) >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[6] = var79 * var84 + -var80 * var81 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + (var79 * var83) + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[14] = var76[8] * -var72 + var76[5] * -var71 + var76[2] * -var70 + 16384 >> 15;
                                    var76[13] = var76[7] * -var72 + var76[1] * -var70 + var76[4] * -var71 + 16384 >> 15;
                                    var76[12] = var76[3] * -var71 + var76[6] * -var72 + var76[0] * -var70 + 16384 >> 15;
                                }
                                var76[9] = var70;
                                var76[10] = var71;
                                var76[11] = var72;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method1351(var75, var74, var73, (byte) -97);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method1340(false, var72, var70, var71);
                            }
                        }
                    }
                }
                class192 var85 = new class192(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg9.method1076(var85, var86, class310.field4640, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class19.field287[var87].length > this.field5996[var87]) {
                        var57.method276(class336.field5218[var87], class19.field287[var87][this.field5996[var87]]);
                    }
                    if (class301.field4446[var87].length > this.field5996[var87]) {
                        var57.method276(class102.field1461[var87], class301.field4446[var87][this.field5996[var87]]);
                    }
                }
                if (arg4) {
                    var57.method297(var20);
                    class157 var88 = class295.field4360;
                    synchronized (class295.field4360) {
                        class295.field4360.method1012(-93, var21, var57);
                    }
                    this.field6003 = var21;
                }
            }
        }
        class201 var89 = var57.method292((byte) 4, var20, arg6);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class351.field5448[var90] != null) {
                var89.method1403(class70.field969[var90], class119.field1686[var90], false, class351.field5448[var90], class77.field1054[var90], 0, var91, class314.field4808[var90], client.field943[var90] - 1, 16383, this.field6008 == null ? null : this.field6008[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method1402(arg17.field3759, var43, 0, var45, var42, arg3 - 1, var46, var39, var41, var44, false, arg5 - 1, var47, var38, var40);
        } else if (var41 != null) {
            var89.method1398(var40, 0, var39, 0, var38, false, var41, arg5 - 1, var42);
        } else if (var46 != null) {
            var89.method1398(var45, 0, var44, 0, var43, false, var46, arg3 - 1, var47);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class351.field5448[var92] = null;
            class314.field4808[var92] = null;
            class261.field3637[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(III)V")
    public final void method2430(int arg0, int arg1, int arg2) {
        this.field5996[arg0] = arg2;
        field6009++;
        if (arg1 == 31145) {
            this.method2425((byte) -36);
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(I)V")
    public static void method2431(int arg0) {
        field6013 = null;
        field5997 = null;
        field6015 = null;
        field6014 = null;
        field6004 = null;
        if (arg0 >= -113) {
            field6013 = null;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(IZLdm;I)V")
    public final void method2432(int arg0, boolean arg1, class508 arg2, int arg3) {
        field5995++;
        int var5 = class235.field3338[arg3];
        if (this.field5992[var5] == 0 || arg2.method3029(17801, arg0) == null) {
            return;
        }
        this.field5992[var5] = class286.method1860(arg0, Integer.MIN_VALUE);
        if (arg1) {
            this.field5996 = null;
        }
        this.method2425((byte) -19);
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;Ljava/lang/String;Ljava/lang/String;BI)V")
    public static final void method2433(String arg0, int arg1, int arg2, String arg3, String arg4, String arg5, byte arg6, int arg7) {
        for (int var8 = 99; var8 > 0; var8--) {
            class424.field6321[var8] = class424.field6321[var8 - 1];
            class217.field3019[var8] = class217.field3019[var8 - 1];
            class491.field7176[var8] = class491.field7176[var8 - 1];
            class332.field5131[var8] = class332.field5131[var8 - 1];
            class243.field3412[var8] = class243.field3412[var8 - 1];
            class213.field2981[var8] = class213.field2981[var8 - 1];
            class38.field613[var8] = class38.field613[var8 - 1];
        }
        if (arg6 != 67) {
            method2426(-34, 91, -9, (byte) 18, null, -122);
        }
        field5994++;
        class424.field6321[0] = arg7;
        class217.field3019[0] = arg2;
        class491.field7176[0] = arg4;
        class332.field5131[0] = arg3;
        class243.field3412[0] = arg0;
        class38.field613[0] = arg1;
        class213.field2981[0] = arg5;
        class274.field3818 = class485.field7086;
        class326.field5003++;
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(II[IIZ[I)V")
    public final void method2434(int arg0, int arg1, int[] arg2, int arg3, boolean arg4, int[] arg5) {
        this.field5992 = arg2;
        this.field6012 = arg3;
        this.field5996 = arg5;
        this.field6011 = arg4;
        field6006++;
        if (this.field6002 != arg1) {
            this.field6002 = arg1;
            this.field6008 = null;
        }
        this.method2425((byte) -106);
        if (arg0 != 6) {
            field6010 = false;
        }
    }

    @OriginalMember(owner = "client!pt", name = "a", descriptor = "(Ltq;ILdm;ILaj;Lqa;IIIIII)Lc;")
    public final class201 method2435(class270 arg0, int arg1, class508 arg2, int arg3, class300 arg4, class496 arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field5993++;
        int var13 = arg3;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field3765[arg1];
            var13 = arg3 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class472 var24 = arg4.method1936(var23, 213);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method2837(var25, arg11 ^ 0xFFFFFFAE);
                var14 |= var24.method2834((byte) 96, var25);
                var17 |= var24.method2836(var25, (byte) 11);
                var16 |= arg0.field3760;
            }
            if ((arg0.field3744 || class58.field786) && arg8 != -1 && arg8 < arg0.field3765.length) {
                int var26 = arg0.field3765[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class472 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg4.method1936(var28 >>> 16, 213);
                }
                if (var29 != null) {
                    var15 |= var29.method2837(var28, 26582);
                    var14 |= var29.method2834((byte) 70, var28);
                    var17 |= var29.method2836(var28, (byte) 11);
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
        long var30 = (long) (arg10 << 16) | (long) arg9 << 32 | (long) arg6;
        class157 var32 = class166.field2417;
        class201 var33;
        synchronized (class166.field2417) {
            var33 = (class201) class166.field2417.method1013(var30, (byte) -106);
        }
        if (var33 == null || arg5.method1141(var33.method279(), var13) != 0) {
            if (var33 != null) {
                var13 = arg5.method1130(var13, var33.method279());
            }
            class192[] var35 = new class192[3];
            int var36 = 0;
            if (!arg2.method3029(17801, arg6).method229(false) || !arg2.method3029(17801, arg10).method229(false) || !arg2.method3029(17801, arg9).method229(false)) {
                return null;
            }
            class192 var37 = arg2.method3029(17801, arg6).method226(arg11 + 26384);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class192 var38 = arg2.method3029(17801, arg10).method226(-128);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class192 var39 = arg2.method3029(17801, arg9).method226(-113);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class192 var40 = new class192(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg5.method1076(var40, var41, class310.field4640, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field5996[var42] < class19.field287[var42].length) {
                    var33.method276(class336.field5218[var42], class19.field287[var42][this.field5996[var42]]);
                }
                if (class301.field4446[var42].length > this.field5996[var42]) {
                    var33.method276(class102.field1461[var42], class301.field4446[var42][this.field5996[var42]]);
                }
            }
            var33.method297(var13);
            class157 var43 = class166.field2417;
            synchronized (class166.field2417) {
                class166.field2417.method1012(arg11 ^ 0x67E5, var30, var33);
            }
        }
        if (arg0 == null) {
            return var33;
        } else {
            class201 var44 = var33.method292((byte) 4, var13, true);
            class201 var45 = arg0.method1721(arg8, arg3, (byte) -69, arg7, var44, arg1);
            return arg11 == -26504 ? var45 : null;
        }
    }

    static {
        new class375("You can report that person under a different rule.", "Diese Person kann bezüglich einer anderen Regel gemeldet werden.", "Vous pouvez signaler cette personne pour une autre infraction aux règles.", "Você não pode denunciar essa pessoa de acordo com uma regra diferente.");
        field6010 = false;
        new class375("To use this item please login to a members' server.", "Du musst auf einer Mitglieder-Welt sein, um diesen Gegenstand zu benutzen.", "Veuillez vous connecter à un serveur d'abonnés pour utiliser cet objet.", "Acesse um servidor para membros para usar este objeto.");
        field6013 = new class375("Started 3d Library", "3D-Softwarebibliothek gestartet.", "Librairie 3D démarrée", "Biblioteca 3D iniciada");
        field6015 = new class340(15, 0, 1, 0);
    }
}
