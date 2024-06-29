import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class170 {

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public int field2309 = -1;

    @OriginalMember(owner = "client!jk", name = "q", descriptor = "Lnj;")
    public static class487 field2313 = new class487("Please remove ", "Bitte entferne ", "Veuillez commencer par supprimer ", "Remova ");

    @OriginalMember(owner = "client!jk", name = "s", descriptor = "Lqc;")
    public static class325 field2315 = new class325(64);

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "I")
    public static int field2297;

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "I")
    public static int field2298;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field2301;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field2303;

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "I")
    public static int field2304;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field2306;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field2308;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field2310;

    @OriginalMember(owner = "client!jk", name = "o", descriptor = "I")
    public static int field2311;

    @OriginalMember(owner = "client!jk", name = "p", descriptor = "I")
    private int field2312;

    @OriginalMember(owner = "client!jk", name = "r", descriptor = "I")
    public static int field2314;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "J")
    private long field2302;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "J")
    private long field2305;

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "Z")
    public boolean field2299;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "[I")
    private int[] field2307;

    @OriginalMember(owner = "client!jk", name = "t", descriptor = "[I")
    public int[] field2316;

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "[[I")
    private int[][] field2300;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Z)V")
    private final void method1078(boolean arg0) {
        field2298++;
        long[] var2 = class498.field7478;
        this.field2302 = -1L;
        this.field2302 = this.field2302 >>> 8 ^ var2[(int) (((long) (this.field2312 >> 8) ^ this.field2302) & 0xFFL)];
        this.field2302 = var2[(int) ((this.field2302 ^ (long) this.field2312) & 0xFFL)] ^ this.field2302 >>> 8;
        if (!arg0) {
            this.method1083(true, true);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field2302 = var2[(int) ((this.field2302 ^ (long) (this.field2307[var3] >> 24)) & 0xFFL)] ^ this.field2302 >>> 8;
            this.field2302 = this.field2302 >>> 8 ^ var2[(int) ((this.field2302 ^ (long) (this.field2307[var3] >> 16)) & 0xFFL)];
            this.field2302 = var2[(int) ((this.field2302 ^ (long) (this.field2307[var3] >> 8)) & 0xFFL)] ^ this.field2302 >>> 8;
            this.field2302 = var2[(int) (((long) this.field2307[var3] ^ this.field2302) & 0xFFL)] ^ this.field2302 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field2302 = this.field2302 >>> 8 ^ var2[(int) (((long) this.field2316[var4] ^ this.field2302) & 0xFFL)];
        }
        this.field2302 = this.field2302 >>> 8 ^ var2[(int) (((long) (this.field2299 ? 1 : 0) ^ this.field2302) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIIILib;Laba;Lqa;IILkca;I)Lr;")
    public final class520 method1079(int arg0, int arg1, int arg2, int arg3, int arg4, class14 arg5, class224 arg6, class167 arg7, int arg8, int arg9, class601 arg10, int arg11) {
        int var13 = -96 % ((-arg1 - 68) / 51);
        field2314++;
        int var14 = arg0;
        if (arg6 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var14 = arg0 | 0x20;
            Object var22 = null;
            int var23 = arg6.field3296[arg2];
            int var24 = var23 >>> 16;
            int var25 = var23 & 0xFFFF;
            class433 var26 = arg10.method3500(var24, -80);
            if (var26 != null) {
                var16 |= var26.method2646(true, var25);
                var15 |= var26.method2644((byte) -73, var25);
                var18 |= var26.method2643(var25, -239);
                var17 |= arg6.field3311;
            }
            if ((arg6.field3309 || class516.field7637) && arg8 != -1 && arg8 < arg6.field3296.length) {
                int var27 = arg6.field3296[arg8];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class433 var30;
                if (var24 == var28) {
                    var30 = var26;
                } else {
                    var30 = arg10.method3500(var29 >>> 16, -118);
                }
                if (var30 != null) {
                    var16 |= var30.method2646(true, var29);
                    var15 |= var30.method2644((byte) 126, var29);
                    var18 |= var30.method2643(var29, -239);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        long var31 = (long) arg3 | (long) (arg11 << 16) | (long) arg9 << 32;
        class325 var33 = class19.field173;
        class520 var34;
        synchronized (class19.field173) {
            var34 = (class520) class19.field173.method2025(var31, 2);
        }
        if (var34 == null || arg7.method1026(var34.method1950(), var14) != 0) {
            if (var34 != null) {
                var14 = arg7.method978(var14, var34.method1950());
            }
            class114[] var36 = new class114[3];
            int var37 = 0;
            if (!arg5.method63(0, arg3).method13((byte) -102) || !arg5.method63(0, arg11).method13((byte) -102) || !arg5.method63(0, arg9).method13((byte) -102)) {
                return null;
            }
            class114 var38 = arg5.method63(0, arg3).method9(-14009);
            if (var38 != null) {
                var36[var37++] = var38;
            }
            class114 var39 = arg5.method63(0, arg11).method9(-14009);
            if (var39 != null) {
                var36[var37++] = var39;
            }
            class114 var40 = arg5.method63(0, arg9).method9(-14009);
            if (var40 != null) {
                var36[var37++] = var40;
            }
            class114 var41 = new class114(var36, var37);
            int var42 = var14 | 0x4000;
            var34 = arg7.method954(var41, var42, class634.field9256, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (this.field2316[var43] < class317.field4743[var43].length) {
                    var34.method1957(class264.field3922[var43], class317.field4743[var43][this.field2316[var43]]);
                }
                if (class601.field8869[var43].length > this.field2316[var43]) {
                    var34.method1957(class224.field3318[var43], class601.field8869[var43][this.field2316[var43]]);
                }
            }
            var34.method1973(var14);
            class325 var44 = class19.field173;
            synchronized (class19.field173) {
                class19.field173.method2029(false, var34, var31);
            }
        }
        if (arg6 == null) {
            return var34;
        } else {
            class520 var45 = var34.method369((byte) 4, var14, true);
            return arg6.method1471(arg0, arg8, arg4, arg2, var45, true);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lib;BII)V")
    public final void method1080(class14 arg0, byte arg1, int arg2, int arg3) {
        if (arg1 != -50) {
            this.field2312 = 25;
        }
        field2306++;
        int var5 = class545.field8132[arg2];
        if (this.field2307[var5] != 0 && arg0.method63(0, arg3) != null) {
            this.field2307[var5] = class313.method1926(Integer.MIN_VALUE, arg3);
            this.method1078(true);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static void method1081(byte arg0) {
        if (arg0 >= -64) {
            field2315 = null;
        }
        field2313 = null;
        field2315 = null;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(Lrv;Lbc;ILhf;Lqa;IIILib;Laba;ILkca;)Lr;")
    public final class520 method1082(class287 arg0, class612 arg1, int arg2, class574 arg3, class167 arg4, int arg5, int arg6, int arg7, class14 arg8, class224 arg9, int arg10, class601 arg11) {
        int var13 = -35 % ((-arg6 - 61) / 38);
        field2310++;
        if (this.field2309 != -1) {
            return arg0.method1783(-1, this.field2309).method2630(arg7, arg9, arg5, arg11, arg10, arg4, arg2, arg1, 53);
        }
        int var14 = arg2;
        if (arg9 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var14 = arg2 | 0x20;
            int var22 = arg9.field3296[arg7];
            Object var23 = null;
            int var24 = var22 >>> 16;
            class433 var25 = arg11.method3500(var24, -96);
            int var26 = var22 & 0xFFFF;
            if (var25 != null) {
                var16 |= var25.method2646(true, var26);
                var15 |= var25.method2644((byte) 127, var26);
                var18 |= var25.method2643(var26, -239);
                var17 |= arg9.field3311;
            }
            if ((arg9.field3309 || class516.field7637) && arg5 != -1 && arg5 < arg9.field3296.length) {
                int var27 = arg9.field3296[arg5];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class433 var30 = var24 == var28 ? var25 : arg11.method3500(var28, -79);
                if (var30 != null) {
                    var16 |= var30.method2646(true, var29);
                    var15 |= var30.method2644((byte) 0, var29);
                    var18 |= var30.method2643(var29, -239);
                }
            }
            if (var16) {
                var14 |= 0x80;
            }
            if (var15) {
                var14 |= 0x100;
            }
            if (var17) {
                var14 |= 0x200;
            }
            if (var18) {
                var14 |= 0x400;
            }
        }
        class325 var31 = class19.field173;
        class520 var32;
        synchronized (class19.field173) {
            var32 = (class520) class19.field173.method2025(this.field2302, 2);
        }
        if (var32 == null || arg4.method1026(var32.method1950(), var14) != 0) {
            if (var32 != null) {
                var14 = arg4.method978(var14, var32.method1950());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field2307[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((var36 & Integer.MIN_VALUE) != 0 && !arg8.method63(0, var36 & 0x3FFFFFFF).method13((byte) -102)) {
                        var34 = true;
                    }
                } else if (!arg3.method3357(var36 & 0x3FFFFFFF, (byte) -113).method2468((byte) 120, this.field2299)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class114[] var37 = new class114[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field2307[var39];
                if ((var40 & 0x40000000) != 0) {
                    class114 var42 = arg3.method3357(var40 & 0x3FFFFFFF, (byte) -81).method2462(-126, this.field2299);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class114 var41 = arg8.method63(0, var40 & 0x3FFFFFFF).method9(-14009);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            int var43 = var14 | 0x4000;
            class114 var44 = new class114(var37, var38);
            var32 = arg4.method954(var44, var43, class634.field9256, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                if (this.field2316[var45] < class317.field4743[var45].length) {
                    var32.method1957(class264.field3922[var45], class317.field4743[var45][this.field2316[var45]]);
                }
                if (this.field2316[var45] < class601.field8869[var45].length) {
                    var32.method1957(class224.field3318[var45], class601.field8869[var45][this.field2316[var45]]);
                }
            }
            var32.method1973(var14);
            class325 var46 = class19.field173;
            synchronized (class19.field173) {
                class19.field173.method2029(false, var32, this.field2302);
            }
        }
        if (arg9 == null) {
            return var32;
        } else {
            var32.method369((byte) 4, var14, true);
            return arg9.method1471(arg2, arg5, arg10, arg7, var32, true);
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(ZZ)V")
    public final void method1083(boolean arg0, boolean arg1) {
        this.field2299 = arg0;
        field2304++;
        if (!arg1) {
            this.field2300 = null;
        }
        this.method1078(arg1);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IBZ[I[II)V")
    public final void method1084(int arg0, byte arg1, boolean arg2, int[] arg3, int[] arg4, int arg5) {
        this.field2307 = arg3;
        this.field2316 = arg4;
        field2301++;
        this.field2309 = arg0;
        if (this.field2312 != arg5) {
            this.field2312 = arg5;
            this.field2300 = null;
        }
        if (arg1 <= 119) {
            method1087(50, 70, 69, -122, null, 89, 95, 76, -18, 125, -20, 40);
        }
        this.field2299 = arg2;
        this.method1078(true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(III)V")
    public final void method1085(int arg0, int arg1, int arg2) {
        field2297++;
        if (arg0 != 1) {
            this.method1080(null, (byte) -91, 49, -122);
        }
        this.field2316[arg2] = arg1;
        this.method1078(true);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I[Ljs;ILaba;ILkca;Lbc;Lhf;ILow;ZLib;ZLaba;ILqa;IILrv;)Lr;")
    public final class520 method1086(int arg0, class251[] arg1, int arg2, class224 arg3, int arg4, class601 arg5, class612 arg6, class574 arg7, int arg8, class89 arg9, boolean arg10, class14 arg11, boolean arg12, class224 arg13, int arg14, class167 arg15, int arg16, int arg17, class287 arg18) {
        field2303++;
        if (this.field2309 != -1) {
            return arg18.method1783(-1, this.field2309).method2632(arg4, arg0, arg2, arg15, arg13, arg5, arg14, arg6, arg1, (byte) -42, arg3, arg9, arg8, arg16, arg17);
        }
        int var20 = arg16;
        long var21 = this.field2302;
        int[] var23 = this.field2307;
        if (arg3 != null && (arg3.field3293 >= 0 || arg3.field3294 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field2307[var24];
            }
            if (arg3.field3293 >= 0) {
                if (arg3.field3293 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class313.method1926(1073741824, arg3.field3293);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg3.field3294 >= 0) {
                if (arg3.field3294 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class313.method1926(arg3.field3294, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg3 != null || arg13 != null;
        int var29 = arg1 == null ? 0 : arg1.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class202.field3018[var30] = null;
            if (arg1[var30] != null) {
                class224 var31 = arg5.method3498(false, arg1[var30].field3649);
                if (var31.field3296 != null) {
                    class467.field6736[var30] = var31;
                    var28 = true;
                    int var32 = arg1[var30].field3654;
                    int var33 = arg1[var30].field3644;
                    int var34 = var31.field3296[var32];
                    class202.field3018[var30] = arg5.method3500(var34 >>> 16, -75);
                    int var35 = var34 & 0xFFFF;
                    class154.field1980[var30] = var35;
                    if (class202.field3018[var30] != null) {
                        var26 |= class202.field3018[var30].method2646(arg12, var35);
                        var25 |= class202.field3018[var30].method2644((byte) 13, var35);
                        var27 |= class202.field3018[var30].method2643(var35, -239);
                    }
                    if ((var31.field3309 || class516.field7637) && var33 != -1 && var33 < var31.field3296.length) {
                        class104.field1310[var30] = var31.field3307[var32];
                        class238.field3486[var30] = arg1[var30].field3651;
                        int var36 = var31.field3296[var33];
                        class603.field8889[var30] = arg5.method3500(var36 >>> 16, -79);
                        int var37 = var36 & 0xFFFF;
                        class100.field1277[var30] = var37;
                        if (class603.field8889[var30] != null) {
                            var26 |= class603.field8889[var30].method2646(true, var37);
                            var25 |= class603.field8889[var30].method2644((byte) -99, var37);
                            var27 |= class603.field8889[var30].method2643(var37, -239);
                        }
                    } else {
                        class104.field1310[var30] = 0;
                        class238.field3486[var30] = 0;
                        class603.field8889[var30] = null;
                        class100.field1277[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class433 var41 = null;
        class433 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class433 var46 = null;
        class433 var47 = null;
        if (var28) {
            var20 = arg16 | 0x20;
            if (arg3 != null) {
                int var48 = arg3.field3296[arg14];
                int var49 = var48 >>> 16;
                var41 = arg5.method3500(var49, -80);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method2646(arg12, var38);
                    var25 |= var41.method2644((byte) 127, var38);
                    var27 |= var41.method2643(var38, -239);
                }
                if ((arg3.field3309 || class516.field7637) && arg2 != -1 && arg3.field3296.length > arg2) {
                    int var50 = arg3.field3296[arg2];
                    var40 = arg3.field3307[arg14];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg5.method3500(var51, -128);
                    if (var42 != null) {
                        var26 |= var42.method2646(arg12, var39);
                        var25 |= var42.method2644((byte) -89, var39);
                        var27 |= var42.method2643(var39, -239);
                    }
                }
            }
            if (arg13 != null) {
                int var52 = arg13.field3296[arg8];
                int var53 = var52 >>> 16;
                var46 = arg5.method3500(var53, -88);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method2646(true, var43);
                    var25 |= var46.method2644((byte) 127, var43);
                    var27 |= var46.method2643(var43, -239);
                }
                if ((arg13.field3309 || class516.field7637) && arg4 != -1 && arg4 < arg13.field3296.length) {
                    var45 = arg13.field3307[arg8];
                    int var54 = arg13.field3296[arg4];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg5.method3500(var55, -84);
                    if (var47 != null) {
                        var26 |= var47.method2646(true, var44);
                        var25 |= var47.method2644((byte) 127, var44);
                        var27 |= var47.method2643(var44, -239);
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
        class325 var56 = class161.field2155;
        class520 var57;
        synchronized (class161.field2155) {
            var57 = (class520) class161.field2155.method2025(var21, 2);
        }
        class229 var58 = null;
        if (this.field2312 != -1) {
            var58 = arg9.method526(-440, this.field2312);
        }
        if (var57 == null || arg15.method1026(var57.method1950(), var20) != 0 || var58 != null && var58.field3381 != null && this.field2300 == null) {
            if (var57 != null) {
                var20 = arg15.method978(var20, var57.method1950());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg11.method63(0, var62 & 0x3FFFFFFF).method12(0)) {
                        var60 = true;
                    }
                } else if (!arg7.method3357(var62 & 0x3FFFFFFF, (byte) -49).method2454(this.field2299, 64)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field2305 != -1L) {
                    class325 var63 = class161.field2155;
                    synchronized (class161.field2155) {
                        var57 = (class520) class161.field2155.method2025(this.field2305, 2);
                    }
                }
                if (var57 == null || arg15.method1026(var57.method1950(), var20) != 0 || var58 != null && var58.field3381 != null && this.field2300 == null) {
                    return null;
                }
            } else {
                class114[] var64 = new class114[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class114 var67 = arg7.method3357(var66 & 0x3FFFFFFF, (byte) -103).method2467(this.field2299, false);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var66) != 0) {
                        class114 var68 = arg11.method63(0, var66 & 0x3FFFFFFF).method11(-3);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    }
                }
                if (var58 != null && var58.field3381 != null) {
                    for (int var69 = 0; var69 < var58.field3381.length; var69++) {
                        if (var58.field3381[var69] != null && var64[var69] != null) {
                            int var70 = var58.field3381[var69][0];
                            int var71 = var58.field3381[var69][1];
                            int var72 = var58.field3381[var69][2];
                            int var73 = var58.field3381[var69][3] << 3;
                            int var74 = var58.field3381[var69][4] << 3;
                            int var75 = var58.field3381[var69][5] << 3;
                            if (this.field2300 == null) {
                                this.field2300 = new int[var58.field3381.length][];
                            }
                            if (this.field2300[var69] == null) {
                                int[] var76 = this.field2300[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[13] = -var71;
                                    var76[12] = -var70;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[14] = -var72;
                                } else {
                                    int var77 = class14.field130[var73];
                                    int var78 = class14.field129[var73];
                                    int var79 = class14.field130[var74];
                                    int var80 = class14.field129[var74];
                                    int var81 = class14.field130[var75];
                                    int var82 = class14.field129[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[1] = -var82 * var79 + var80 * var83 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[7] = -var80 * -var82 + (var79 * var83) + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[12] = var76[6] * -var72 + var76[3] * -var71 + var76[0] * -var70 + 16384 >> 15;
                                    var76[14] = var76[2] * -var70 + (var76[5] * -var71) + (var76[8] * -var72) + 16384 >> 15;
                                    var76[13] = var76[1] * -var70 + (var76[4] * -var71 + (var76[7] * -var72) + 16384) >> 15;
                                }
                                var76[9] = var70;
                                var76[11] = var72;
                                var76[10] = var71;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method694(var73, var75, var74, -107);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method689(var72, (byte) -28, var71, var70);
                            }
                        }
                    }
                }
                int var85 = var20 | 0x4000;
                class114 var86 = new class114(var64, var64.length);
                var57 = arg15.method954(var86, var85, class634.field9256, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (this.field2316[var87] < class317.field4743[var87].length) {
                        var57.method1957(class264.field3922[var87], class317.field4743[var87][this.field2316[var87]]);
                    }
                    if (class601.field8869[var87].length > this.field2316[var87]) {
                        var57.method1957(class224.field3318[var87], class601.field8869[var87][this.field2316[var87]]);
                    }
                }
                if (arg10) {
                    var57.method1973(var20);
                    class325 var88 = class161.field2155;
                    synchronized (class161.field2155) {
                        class161.field2155.method2029(!arg12, var57, var21);
                    }
                    this.field2305 = var21;
                }
            }
        }
        class520 var89 = var57.method369((byte) 4, var20, arg12);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class202.field3018[var90] != null) {
                var89.method3085(class154.field1980[var90], (byte) -117, this.field2300 == null ? null : this.field2300[var90], class104.field1310[var90], class603.field8889[var90], false, var91, 0, class100.field1277[var90], class202.field3018[var90], class238.field3486[var90] - 1);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method3081(var47, var44, var40, var43, false, var46, arg3.field3297, false, var42, var45, var39, arg17 - 1, arg0 + -1, var41, var38);
        } else if (var41 != null) {
            var89.method3084(var41, -110, false, var38, 0, var42, var40, arg17 - 1, var39);
        } else if (var46 != null) {
            var89.method3084(var46, 120, false, var43, 0, var47, var45, arg0 - 1, var44);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class202.field3018[var92] = null;
            class603.field8889[var92] = null;
            class467.field6736[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIIILgea;IIIIIII)Z")
    public static final boolean method1087(int arg0, int arg1, int arg2, int arg3, class82 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field2311++;
        int var12 = arg1;
        int var13 = arg5;
        byte var14 = 64;
        byte var15 = 64;
        int var16 = arg1 - var14;
        class341.field4995[var14][var15] = 99;
        int var17 = arg5 - var15;
        class223.field3289[var14][var15] = 0;
        byte var18 = 0;
        class412.field5867[var18] = arg1;
        int var19 = 0;
        if (arg11 != 1336147968) {
            field2315 = null;
        }
        int var35 = var18 + 1;
        class640.field9301[var18] = arg5;
        int[][] var20 = arg4.field948;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class32.field322 = var13;
                                    class297.field4347 = var12;
                                    return false;
                                }
                                var12 = class412.field5867[var19];
                                var13 = class640.field9301[var19];
                                var21 = var13 - var17;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var12 - var16;
                                var23 = var12 - arg4.field943;
                                var24 = var13 - arg4.field957;
                                if (arg0 == -4) {
                                    if (arg7 == var12 && arg2 == var13) {
                                        class32.field322 = var13;
                                        class297.field4347 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -3) {
                                    if (class516.method3068(arg9, arg8, var13, -32360, arg7, arg2, var12, arg9, arg10)) {
                                        class32.field322 = var13;
                                        class297.field4347 = var12;
                                        return true;
                                    }
                                } else if (arg0 == -2) {
                                    if (arg4.method473(arg7, arg9, var12, arg10, arg9, -107, arg6, var13, arg8, arg2)) {
                                        class297.field4347 = var12;
                                        class32.field322 = var13;
                                        return true;
                                    }
                                } else if (arg0 == -1) {
                                    if (arg4.method480(arg9, arg10, var13, arg7, false, var12, arg6, arg8, arg2)) {
                                        class297.field4347 = var12;
                                        class32.field322 = var13;
                                        return true;
                                    }
                                } else if (arg0 == 0 || arg0 == 1 || arg0 == 2 || arg0 == 3 || arg0 == 9) {
                                    if (arg4.method468(var13, arg3, arg7, var12, arg9, arg2, (byte) -75, arg0)) {
                                        class32.field322 = var13;
                                        class297.field4347 = var12;
                                        return true;
                                    }
                                } else if (arg4.method482(arg0, arg7, arg3, var12, -1, arg2, arg9, var13)) {
                                    class32.field322 = var13;
                                    class297.field4347 = var12;
                                    return true;
                                }
                                var26 = class223.field3289[var22][var21] + 1;
                                if (var22 > 0 && class341.field4995[var22 - 1][var21] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg9 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (var27 >= arg9 - 1) {
                                            class412.field5867[var35] = var12 - 1;
                                            class640.field9301[var35] = var13;
                                            class341.field4995[var22 - 1][var21] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class223.field3289[var22 - 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (var22 < 128 - arg9 && class341.field4995[var22 + 1][var21] == 0 && (var20[arg9 + var23][var24] & 0x60E40000) == 0 && (var20[arg9 + var23][arg9 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var28) {
                                            class412.field5867[var35] = var12 + 1;
                                            class640.field9301[var35] = var13;
                                            class341.field4995[var22 + 1][var21] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class223.field3289[var22 + 1][var21] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var21 > 0 && class341.field4995[var22][var21 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[var23 + arg9 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var29) {
                                            class412.field5867[var35] = var12;
                                            class640.field9301[var35] = var13 - 1;
                                            class341.field4995[var22][var21 - 1] = 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class223.field3289[var22][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if ((128 - arg9) > var21 && class341.field4995[var22][var21 + 1] == 0 && (var20[var23][arg9 + var24] & 0x4E240000) == 0 && (var20[var23 - (1 - arg9)][arg9 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if ((arg9 - 1) <= var30) {
                                            class412.field5867[var35] = var12;
                                            class640.field9301[var35] = var13 + 1;
                                            class341.field4995[var22][var21 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class223.field3289[var22][var21 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg9] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var22 > 0 && var21 > 0 && class341.field4995[var22 - 1][var21 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (var31 >= arg9) {
                                            class412.field5867[var35] = var12 - 1;
                                            class640.field9301[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class341.field4995[var22 - 1][var21 - 1] = 3;
                                            class223.field3289[var22 - 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if (var22 < 128 - arg9 && var21 > 0 && class341.field4995[var22 + 1][var21 - 1] == 0 && (var20[arg9 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class412.field5867[var35] = var12 + 1;
                                            class640.field9301[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class341.field4995[var22 + 1][var21 - 1] = 9;
                                            class223.field3289[var22 + 1][var21 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var22 > 0 && var21 < (128 - arg9) && class341.field4995[var22 - 1][var21 + 1] == 0 && (var20[var23 - 1][var24 + arg9] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg9; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var33 + var23 - 1][arg9 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class412.field5867[var35] = var12 - 1;
                                    class640.field9301[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class341.field4995[var22 - 1][var21 + 1] = 6;
                                    class223.field3289[var22 - 1][var21 + 1] = var26;
                                }
                            } while (128 - arg9 <= var22);
                        } while (var21 >= (128 - arg9));
                    } while (class341.field4995[var22 + 1][var21 + 1] != 0);
                } while ((var20[var23 + arg9][arg9 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg9; var34++) {
                    if ((var20[var23 + var34][arg9 + var24] & 0x7E240000) != 0 || (var20[var23 + arg9][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class412.field5867[var35] = var12 + 1;
                class640.field9301[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class341.field4995[var22 + 1][var21 + 1] = 12;
                class223.field3289[var22 + 1][var21 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)Z")
    public static final boolean method1088(int arg0) {
        field2308++;
        if (class606.field8951) {
            try {
                class222.method1460(false, "showVideoAd", class328.field4850.field5129);
                return true;
            } catch (Throwable var1) {
            }
        }
        if (arg0 != -21793) {
            field2315 = null;
        }
        return false;
    }
}
