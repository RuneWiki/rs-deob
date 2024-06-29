import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qo")
public class class19 {

    @OriginalMember(owner = "client!qo", name = "r", descriptor = "I")
    public int field327 = -1;

    @OriginalMember(owner = "client!qo", name = "h", descriptor = "Lno;")
    public static class494 field317 = new class494("", 10);

    @OriginalMember(owner = "client!qo", name = "t", descriptor = "Lrn;")
    public static class174 field329 = new class174(13, 8);

    @OriginalMember(owner = "client!qo", name = "v", descriptor = "Liv;")
    public static class64 field331 = new class64(79, -1);

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "I")
    public static int field310;

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "I")
    public static int field312;

    @OriginalMember(owner = "client!qo", name = "d", descriptor = "I")
    public static int field313;

    @OriginalMember(owner = "client!qo", name = "f", descriptor = "I")
    private int field315;

    @OriginalMember(owner = "client!qo", name = "g", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!qo", name = "i", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!qo", name = "l", descriptor = "I")
    public static int field321;

    @OriginalMember(owner = "client!qo", name = "n", descriptor = "I")
    public static int field323;

    @OriginalMember(owner = "client!qo", name = "o", descriptor = "I")
    public static int field324;

    @OriginalMember(owner = "client!qo", name = "q", descriptor = "I")
    public static int field326;

    @OriginalMember(owner = "client!qo", name = "u", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!qo", name = "w", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "J")
    private long field311;

    @OriginalMember(owner = "client!qo", name = "e", descriptor = "J")
    private long field314;

    @OriginalMember(owner = "client!qo", name = "m", descriptor = "Lclient;")
    public static client field322;

    @OriginalMember(owner = "client!qo", name = "p", descriptor = "Z")
    public boolean field325;

    @OriginalMember(owner = "client!qo", name = "j", descriptor = "[I")
    private int[] field319;

    @OriginalMember(owner = "client!qo", name = "s", descriptor = "[I")
    public int[] field328;

    @OriginalMember(owner = "client!qo", name = "k", descriptor = "[[I")
    private int[][] field320;

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(I)V")
    private final void method148(int arg0) {
        field326++;
        long[] var2 = class108.field1791;
        this.field314 = -1L;
        this.field314 = var2[(int) (((long) (this.field315 >> 8) ^ this.field314) & 0xFFL)] ^ this.field314 >>> 8;
        this.field314 = var2[(int) (((long) this.field315 ^ this.field314) & 0xFFL)] ^ this.field314 >>> 8;
        for (int var3 = 0; var3 < 12; var3++) {
            this.field314 = var2[(int) (((long) (this.field319[var3] >> 24) ^ this.field314) & 0xFFL)] ^ this.field314 >>> 8;
            this.field314 = var2[(int) (((long) (this.field319[var3] >> 16) ^ this.field314) & 0xFFL)] ^ this.field314 >>> 8;
            this.field314 = this.field314 >>> 8 ^ var2[(int) ((this.field314 ^ (long) (this.field319[var3] >> 8)) & 0xFFL)];
            this.field314 = var2[(int) ((this.field314 ^ (long) this.field319[var3]) & 0xFFL)] ^ this.field314 >>> 8;
        }
        if (arg0 > -44) {
            field322 = null;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field314 = var2[(int) (((long) this.field328[var4] ^ this.field314) & 0xFFL)] ^ this.field314 >>> 8;
        }
        this.field314 = this.field314 >>> 8 ^ var2[(int) ((this.field314 ^ (long) (this.field325 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILqa;ILnt;IIBIILer;ILkf;)Lc;")
    public final class121 method149(int arg0, class162 arg1, int arg2, class147 arg3, int arg4, int arg5, byte arg6, int arg7, int arg8, class68 arg9, int arg10, class165 arg11) {
        if (arg6 > -55) {
            return null;
        }
        field310++;
        int var13 = arg8;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg8 | 0x20;
            int var22 = arg11.field2539[arg2];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class291 var25 = arg3.method1129(var23, (byte) 107);
            if (var25 != null) {
                var15 |= var25.method1839(-106, var24);
                var14 |= var25.method1841(var24, 0);
                var17 |= var25.method1837(var24, (byte) 84);
                var16 |= arg11.field2550;
            }
            if ((arg11.field2546 || class21.field428) && arg7 != -1 && arg7 < arg11.field2539.length) {
                int var26 = arg11.field2539[arg7];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class291 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg3.method1129(var28 >>> 16, (byte) 57);
                }
                if (var29 != null) {
                    var15 |= var29.method1839(-106, var28);
                    var14 |= var29.method1841(var28, 0);
                    var17 |= var29.method1837(var28, (byte) 84);
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
        long var30 = (long) arg10 | (long) arg0 << 32 | (long) (arg5 << 16);
        class55 var32 = class345.field5180;
        class121 var33;
        synchronized (class345.field5180) {
            var33 = (class121) class345.field5180.method494(0, var30);
        }
        if (var33 == null || arg1.method255(var33.method889(), var13) != 0) {
            if (var33 != null) {
                var13 = arg1.method280(var13, var33.method889());
            }
            class380[] var35 = new class380[3];
            int var36 = 0;
            if (!arg9.method560(arg10, 3).method2770(0) || !arg9.method560(arg5, 3).method2770(0) || !arg9.method560(arg0, 3).method2770(0)) {
                return null;
            }
            class380 var37 = arg9.method560(arg10, 3).method2764((byte) 123);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class380 var38 = arg9.method560(arg5, 3).method2764((byte) 106);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class380 var39 = arg9.method560(arg0, 3).method2764((byte) 111);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class380 var40 = new class380(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg1.method265(var40, var41, class64.field1101, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field328[var42] < class83.field1436[var42].length) {
                    var33.method890(class124.field2008[var42], class83.field1436[var42][this.field328[var42]]);
                }
                if (this.field328[var42] < class246.field3537[var42].length) {
                    var33.method890(class45.field834[var42], class246.field3537[var42][this.field328[var42]]);
                }
            }
            var33.method906(var13);
            class55 var43 = class345.field5180;
            synchronized (class345.field5180) {
                class345.field5180.method485(var30, (byte) -125, var33);
            }
        }
        if (arg11 == null) {
            return var33;
        } else {
            class121 var44 = var33.method938((byte) 4, var13, true);
            return arg11.method1222(arg8, arg2, arg4, -75, var44, arg7);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ZII[II[I)V")
    public final void method150(boolean arg0, int arg1, int arg2, int[] arg3, int arg4, int[] arg5) {
        if (arg1 <= 43) {
            this.field319 = null;
        }
        this.field328 = arg3;
        this.field327 = arg4;
        this.field325 = arg0;
        this.field319 = arg5;
        if (this.field315 != arg2) {
            this.field315 = arg2;
            this.field320 = null;
        }
        field316++;
        this.method148(-102);
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(I)V")
    public static void method151(int arg0) {
        if (arg0 >= -31) {
            method151(-39);
        }
        field331 = null;
        field317 = null;
        field322 = null;
        field329 = null;
    }

    @OriginalMember(owner = "client!qo", name = "c", descriptor = "(I)I")
    public static final int method152(int arg0) {
        if (arg0 != 6) {
            method153(88, 44, -104);
        }
        field318++;
        return 6;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(III)Z")
    public static final boolean method153(int arg0, int arg1, int arg2) {
        if (arg2 != -1) {
            field322 = null;
        }
        field323++;
        return (arg0 & 0x800) != 0 && (arg1 & 0x37) != 0;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IILtj;IILao;Lkf;Lgv;ILer;Lnt;Lqa;)Lc;")
    public final class121 method154(int arg0, int arg1, class131 arg2, int arg3, int arg4, class188 arg5, class165 arg6, class56 arg7, int arg8, class68 arg9, class147 arg10, class162 arg11) {
        field332++;
        if (this.field327 != -1) {
            return arg7.method502(this.field327, -70).method418(arg0, arg8, arg10, arg11, arg6, arg4, arg1, (byte) -4, arg2);
        }
        if (arg3 != -18532) {
            method152(-20);
        }
        int var13 = arg0;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg6.field2539[arg1];
            var13 = arg0 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class291 var25 = arg10.method1129(var23, (byte) 55);
            if (var25 != null) {
                var15 |= var25.method1839(-112, var24);
                var14 |= var25.method1841(var24, arg3 ^ 0xFFFFB79C);
                var17 |= var25.method1837(var24, (byte) 84);
                var16 |= arg6.field2550;
            }
            if ((arg6.field2546 || class21.field428) && arg4 != -1 && arg4 < arg6.field2539.length) {
                int var26 = arg6.field2539[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class291 var29 = var23 == var27 ? var25 : arg10.method1129(var27, (byte) 110);
                if (var29 != null) {
                    var15 |= var29.method1839(-123, var28);
                    var14 |= var29.method1841(var28, 0);
                    var17 |= var29.method1837(var28, (byte) 84);
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
        class55 var30 = class345.field5180;
        class121 var31;
        synchronized (class345.field5180) {
            var31 = (class121) class345.field5180.method494(0, this.field314);
        }
        if (var31 == null || arg11.method255(var31.method889(), var13) != 0) {
            if (var31 != null) {
                var13 = arg11.method280(var13, var31.method889());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field319[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg9.method560(var35 & 0x3FFFFFFF, 3).method2770(arg3 + 18532)) {
                        var33 = true;
                    }
                } else if (!arg5.method1312((byte) 91, var35 & 0x3FFFFFFF).method1009(arg3 + 11087, this.field325)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class380[] var36 = new class380[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field319[var38];
                if ((var39 & 0x40000000) != 0) {
                    class380 var41 = arg5.method1312((byte) 91, var39 & 0x3FFFFFFF).method1005(this.field325, (byte) -123);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class380 var40 = arg9.method560(var39 & 0x3FFFFFFF, 3).method2764((byte) 113);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class380 var42 = new class380(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg11.method265(var42, var43, class64.field1101, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class83.field1436[var44].length > this.field328[var44]) {
                    var31.method890(class124.field2008[var44], class83.field1436[var44][this.field328[var44]]);
                }
                if (class246.field3537[var44].length > this.field328[var44]) {
                    var31.method890(class45.field834[var44], class246.field3537[var44][this.field328[var44]]);
                }
            }
            var31.method906(var13);
            class55 var45 = class345.field5180;
            synchronized (class345.field5180) {
                class345.field5180.method485(this.field314, (byte) -125, var31);
            }
        }
        if (arg6 == null) {
            return var31;
        } else {
            var31.method938((byte) 4, var13, true);
            return arg6.method1222(arg0, arg1, arg8, -84, var31, arg4);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(Lao;IIZLtj;ZLkf;[Law;ILer;ILfc;Lqa;Lnt;ILkf;IILgv;)Lc;")
    public final class121 method155(class188 arg0, int arg1, int arg2, boolean arg3, class131 arg4, boolean arg5, class165 arg6, class53[] arg7, int arg8, class68 arg9, int arg10, class169 arg11, class162 arg12, class147 arg13, int arg14, class165 arg15, int arg16, int arg17, class56 arg18) {
        field313++;
        if (this.field327 != -1) {
            return arg18.method502(this.field327, -3).method425(arg11, arg7, arg4, arg12, (byte) 89, arg17, arg2, arg6, arg14, arg13, arg1, arg15, arg8, arg16, arg10);
        }
        int var20 = arg14;
        long var21 = this.field314;
        int[] var23 = this.field319;
        if (arg6 != null && (arg6.field2551 >= 0 || arg6.field2569 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field319[var24];
            }
            if (arg6.field2551 >= 0) {
                if (arg6.field2551 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class121.method909(arg6.field2551, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg6.field2569 >= 0) {
                if (arg6.field2569 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class121.method909(1073741824, arg6.field2569);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = arg3;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg6 != null || arg15 != null;
        int var29 = arg7 == null ? 0 : arg7.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class440.field6581[var30] = null;
            if (arg7[var30] != null) {
                class165 var31 = arg13.method1137(-120, arg7[var30].field926);
                if (var31.field2539 != null) {
                    var28 = true;
                    class169.field2628[var30] = var31;
                    int var32 = arg7[var30].field923;
                    int var33 = arg7[var30].field925;
                    int var34 = var31.field2539[var32];
                    class440.field6581[var30] = arg13.method1129(var34 >>> 16, (byte) 48);
                    int var35 = var34 & 0xFFFF;
                    class498.field7360[var30] = var35;
                    if (class440.field6581[var30] != null) {
                        var26 |= class440.field6581[var30].method1839(-107, var35);
                        var25 |= class440.field6581[var30].method1841(var35, 0);
                        var27 |= class440.field6581[var30].method1837(var35, (byte) 84);
                    }
                    if ((var31.field2546 || class21.field428) && var33 != -1 && var31.field2539.length > var33) {
                        class108.field1793[var30] = var31.field2564[var32];
                        class29.field622[var30] = arg7[var30].field927;
                        int var36 = var31.field2539[var33];
                        class37.field707[var30] = arg13.method1129(var36 >>> 16, (byte) 107);
                        int var37 = var36 & 0xFFFF;
                        class36.field692[var30] = var37;
                        if (class37.field707[var30] != null) {
                            var26 |= class37.field707[var30].method1839(-124, var37);
                            var25 |= class37.field707[var30].method1841(var37, 0);
                            var27 |= class37.field707[var30].method1837(var37, (byte) 84);
                        }
                    } else {
                        class108.field1793[var30] = 0;
                        class29.field622[var30] = 0;
                        class37.field707[var30] = null;
                        class36.field692[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class291 var41 = null;
        class291 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class291 var46 = null;
        class291 var47 = null;
        if (var28) {
            var20 = arg14 | 0x20;
            if (arg6 != null) {
                int var48 = arg6.field2539[arg2];
                int var49 = var48 >>> 16;
                var41 = arg13.method1129(var49, (byte) 119);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method1839(-105, var38);
                    var25 |= var41.method1841(var38, 0);
                    var27 |= var41.method1837(var38, (byte) 84);
                }
                if ((arg6.field2546 || class21.field428) && arg10 != -1 && arg6.field2539.length > arg10) {
                    var40 = arg6.field2564[arg2];
                    int var50 = arg6.field2539[arg10];
                    int var51 = var50 >>> 16;
                    var42 = var49 == var51 ? var41 : arg13.method1129(var51, (byte) 81);
                    var39 = var50 & 0xFFFF;
                    if (var42 != null) {
                        var26 |= var42.method1839(-120, var39);
                        var25 |= var42.method1841(var39, 0);
                        var27 |= var42.method1837(var39, (byte) 84);
                    }
                }
            }
            if (arg15 != null) {
                int var52 = arg15.field2539[arg17];
                int var53 = var52 >>> 16;
                var46 = arg13.method1129(var53, (byte) 80);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method1839(-105, var43);
                    var25 |= var46.method1841(var43, 0);
                    var27 |= var46.method1837(var43, (byte) 84);
                }
                if ((arg15.field2546 || class21.field428) && arg1 != -1 && arg15.field2539.length > arg1) {
                    var45 = arg15.field2564[arg17];
                    int var54 = arg15.field2539[arg1];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg13.method1129(var55, (byte) 87);
                    if (var47 != null) {
                        var26 |= var47.method1839(-104, var44);
                        var25 |= var47.method1841(var44, 0);
                        var27 |= var47.method1837(var44, (byte) 84);
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
        class55 var56 = class175.field2676;
        class121 var57;
        synchronized (class175.field2676) {
            var57 = (class121) class175.field2676.method494(0, var21);
        }
        class435 var58 = null;
        if (this.field315 != -1) {
            var58 = arg11.method1239(32, this.field315);
        }
        if (var57 == null || arg12.method255(var57.method889(), var20) != 0 || var58 != null && var58.field6486 != null && this.field320 == null) {
            if (var57 != null) {
                var20 = arg12.method280(var20, var57.method889());
            }
            boolean var60 = false;
            int var61 = 0;
            while (true) {
                if (var61 >= 12) {
                    if (var60) {
                        if (this.field311 != -1L) {
                            class55 var88 = class175.field2676;
                            synchronized (class175.field2676) {
                                var57 = (class121) class175.field2676.method494(0, this.field311);
                            }
                        }
                        if (var57 == null || arg12.method255(var57.method889(), var20) != 0 || var58 != null && var58.field6486 != null && this.field320 == null) {
                            return null;
                        }
                    } else {
                        class380[] var63 = new class380[12];
                        for (int var64 = 0; var64 < 12; var64++) {
                            int var65 = var23[var64];
                            if ((var65 & 0x40000000) != 0) {
                                class380 var67 = arg0.method1312((byte) 91, var65 & 0x3FFFFFFF).method992(true, this.field325);
                                if (var67 != null) {
                                    var63[var64] = var67;
                                }
                            } else if ((var65 & Integer.MIN_VALUE) != 0) {
                                class380 var66 = arg9.method560(var65 & 0x3FFFFFFF, 3).method2768(false);
                                if (var66 != null) {
                                    var63[var64] = var66;
                                }
                            }
                        }
                        if (var58 != null && var58.field6486 != null) {
                            for (int var68 = 0; var68 < var58.field6486.length; var68++) {
                                if (var58.field6486[var68] != null && var63[var68] != null) {
                                    int var69 = var58.field6486[var68][0];
                                    int var70 = var58.field6486[var68][1];
                                    int var71 = var58.field6486[var68][2];
                                    int var72 = var58.field6486[var68][3] << 3;
                                    int var73 = var58.field6486[var68][4] << 3;
                                    int var74 = var58.field6486[var68][5] << 3;
                                    if (this.field320 == null) {
                                        this.field320 = new int[var58.field6486.length][];
                                    }
                                    if (this.field320[var68] == null) {
                                        int[] var75 = this.field320[var68] = new int[15];
                                        if (var72 == 0 && var73 == 0 && var74 == 0) {
                                            var75[12] = -var69;
                                            var75[0] = var75[4] = var75[8] = 32768;
                                            var75[13] = -var70;
                                            var75[14] = -var71;
                                        } else {
                                            int var76 = class528.field7786[var72];
                                            int var77 = class528.field7783[var72];
                                            int var78 = class528.field7786[var73];
                                            int var79 = class528.field7783[var73];
                                            int var80 = class528.field7786[var74];
                                            int var81 = class528.field7783[var74];
                                            int var82 = var77 * var80 + 16384 >> 15;
                                            int var83 = var77 * var81 + 16384 >> 15;
                                            var75[0] = var78 * var80 + var79 * var83 + 16384 >> 15;
                                            var75[8] = var76 * var78 + 16384 >> 15;
                                            var75[7] = var78 * var82 + (-var79 * -var81 + 16384) >> 15;
                                            var75[1] = var79 * var82 + -var81 * var78 + 16384 >> 15;
                                            var75[5] = -var77;
                                            var75[2] = var76 * var79 + 16384 >> 15;
                                            var75[3] = var76 * var81 + 16384 >> 15;
                                            var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                            var75[4] = var76 * var80 + 16384 >> 15;
                                            var75[12] = var75[6] * -var71 + var75[0] * -var69 + (var75[3] * -var70) + 16384 >> 15;
                                            var75[14] = var75[2] * -var69 + var75[8] * -var71 + var75[5] * -var70 + 16384 >> 15;
                                            var75[13] = var75[1] * -var69 + var75[4] * -var70 - (-(var75[7] * -var71) - 16384) >> 15;
                                        }
                                        var75[9] = var69;
                                        var75[10] = var70;
                                        var75[11] = var71;
                                    }
                                    if (var72 != 0 || var73 != 0 || var74 != 0) {
                                        var63[var68].method2357(var72, var73, 319311823, var74);
                                    }
                                    if (var69 != 0 || var70 != 0 || var71 != 0) {
                                        var63[var68].method2366(var69, var71, var70, 7807);
                                    }
                                }
                            }
                        }
                        class380 var84 = new class380(var63, var63.length);
                        int var85 = var20 | 0x4000;
                        var57 = arg12.method265(var84, var85, class64.field1101, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            if (class83.field1436[var86].length > this.field328[var86]) {
                                var57.method890(class124.field2008[var86], class83.field1436[var86][this.field328[var86]]);
                            }
                            if (this.field328[var86] < class246.field3537[var86].length) {
                                var57.method890(class45.field834[var86], class246.field3537[var86][this.field328[var86]]);
                            }
                        }
                        if (arg5) {
                            var57.method906(var20);
                            class55 var87 = class175.field2676;
                            synchronized (class175.field2676) {
                                class175.field2676.method485(var21, (byte) -125, var57);
                            }
                            this.field311 = var21;
                        }
                    }
                    break;
                }
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg9.method560(var62 & 0x3FFFFFFF, 3).method2771(0)) {
                        var60 = true;
                    }
                } else if (!arg0.method1312((byte) 91, var62 & 0x3FFFFFFF).method999((byte) 55, this.field325)) {
                    var60 = true;
                }
                var61++;
            }
        }
        class121 var89 = var57.method938((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class440.field6581[var90] != null) {
                var89.method901(class37.field707[var90], var91, false, class498.field7360[var90], class440.field6581[var90], class108.field1793[var90], this.field320 == null ? null : this.field320[var90], (byte) -8, class36.field692[var90], 0, class29.field622[var90] - 1);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method932(var42, var45, var44, false, var39, var46, 0, arg6.field2560, var47, var43, var38, arg8 - 1, arg16 + -1, var40, var41);
        } else if (var41 != null) {
            var89.method916(var41, false, var42, var40, var38, arg8 - 1, 0, -105, var39);
        } else if (var46 != null) {
            var89.method916(var46, false, var47, var45, var43, arg16 - 1, 0, -77, var44);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class440.field6581[var92] = null;
            class37.field707[var92] = null;
            class169.field2628[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(IZ)V")
    public final void method156(int arg0, boolean arg1) {
        this.field325 = arg1;
        field312++;
        this.method148(-107);
        if (arg0 != -8981) {
            method151(-77);
        }
    }

    @OriginalMember(owner = "client!qo", name = "b", descriptor = "(III)V")
    public final void method157(int arg0, int arg1, int arg2) {
        this.field328[arg1] = arg0;
        field321++;
        if (arg2 == 7733) {
            this.method148(arg2 ^ 0xFFFFE1F2);
        }
    }

    @OriginalMember(owner = "client!qo", name = "a", descriptor = "(ILer;II)V")
    public final void method158(int arg0, class68 arg1, int arg2, int arg3) {
        if (arg3 != 2011) {
            this.method155(null, -107, -22, true, null, true, null, null, -47, null, 6, null, null, null, -1, null, 55, 74, null);
        }
        field324++;
        int var5 = class13.field209[arg2];
        if (this.field319[var5] != 0 && arg1.method560(arg0, arg3 - 2008) != null) {
            this.field319[var5] = class121.method909(arg0, Integer.MIN_VALUE);
            this.method148(-118);
        }
    }
}
