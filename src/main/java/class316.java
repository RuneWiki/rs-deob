import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nba")
public class class316 {

    @OriginalMember(owner = "client!nba", name = "l", descriptor = "I")
    public int field3879 = -1;

    @OriginalMember(owner = "client!nba", name = "u", descriptor = "[I")
    public static int[] field3888 = new int[2];

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "I")
    public static int field3869;

    @OriginalMember(owner = "client!nba", name = "c", descriptor = "I")
    public static int field3870;

    @OriginalMember(owner = "client!nba", name = "d", descriptor = "I")
    public static int field3871;

    @OriginalMember(owner = "client!nba", name = "e", descriptor = "I")
    public static int field3872;

    @OriginalMember(owner = "client!nba", name = "f", descriptor = "I")
    public static int field3873;

    @OriginalMember(owner = "client!nba", name = "g", descriptor = "I")
    public static int field3874;

    @OriginalMember(owner = "client!nba", name = "h", descriptor = "I")
    public static int field3875;

    @OriginalMember(owner = "client!nba", name = "n", descriptor = "I")
    private int field3881;

    @OriginalMember(owner = "client!nba", name = "o", descriptor = "I")
    public static int field3882;

    @OriginalMember(owner = "client!nba", name = "p", descriptor = "I")
    public static int field3883;

    @OriginalMember(owner = "client!nba", name = "q", descriptor = "I")
    public static int field3884;

    @OriginalMember(owner = "client!nba", name = "r", descriptor = "I")
    public static int field3885;

    @OriginalMember(owner = "client!nba", name = "v", descriptor = "I")
    public static int field3889;

    @OriginalMember(owner = "client!nba", name = "j", descriptor = "J")
    private long field3877;

    @OriginalMember(owner = "client!nba", name = "s", descriptor = "J")
    private long field3886;

    @OriginalMember(owner = "client!nba", name = "t", descriptor = "Z")
    public boolean field3887;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "[I")
    private int[] field3868;

    @OriginalMember(owner = "client!nba", name = "w", descriptor = "[I")
    public int[] field3890;

    @OriginalMember(owner = "client!nba", name = "k", descriptor = "[Lca;")
    private class323[] field3878;

    @OriginalMember(owner = "client!nba", name = "m", descriptor = "[[Lkq;")
    public static class620[][] field3880;

    @OriginalMember(owner = "client!nba", name = "i", descriptor = "[[S")
    public static short[][] field3876;

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IILnp;I)V", line = 3)
    public final void method1855(int arg0, int arg1, class517 arg2, int arg3) {
        field3875++;
        int var5 = class249.field2934[arg1];
        if (arg2.method3095((byte) -82, arg0) != null) {
            this.field3868[var5] = class5.method105(arg0, Integer.MIN_VALUE);
            if (arg3 > 108) {
                this.method1866((byte) -86);
            }
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(Lha;IILvr;ZLaaa;Lfs;Lnp;ILbh;Lnq;I)Lka;", line = 21)
    public final class498 method1856(class66 arg0, int arg1, int arg2, class148 arg3, boolean arg4, class644 arg5, class582 arg6, class517 arg7, int arg8, class40 arg9, class486 arg10, int arg11) {
        field3874++;
        if (this.field3879 != -1) {
            return arg3.method1070(this.field3879, true).method2851(arg9, null, arg2, arg5, arg1, arg0, arg6, 100, arg11, arg8);
        }
        int var13 = arg11;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg6.field7955[arg2];
            Object var22 = null;
            var13 = arg11 | 0x20;
            int var23 = var21 >>> 16;
            class338 var24 = arg5.method3602(var23, (byte) -125);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1998(var25, (byte) 17);
                var14 |= var24.method2001(var25, 7402);
                var17 |= var24.method1997(var25, true);
                var16 |= arg6.field7940;
            }
            if ((arg6.field7932 || class688.field9381) && arg1 != -1 && arg6.field7955.length > arg1) {
                int var26 = arg6.field7955[arg1];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class338 var29 = var23 == var27 ? var24 : arg5.method3602(var27, (byte) -108);
                if (var29 != null) {
                    var15 |= var29.method1998(var28, (byte) 17);
                    var14 |= var29.method2001(var28, 7402);
                    var17 |= var29.method1997(var28, true);
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
        class288 var30 = class462.field6485;
        class498 var31;
        synchronized (class462.field6485) {
            var31 = (class498) class462.field6485.method1684(this.field3877, -359);
        }
        if (var31 == null || arg0.method620(var31.method396(), var13) != 0) {
            if (var31 != null) {
                var13 = arg0.method632(var13, var31.method396());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field3868.length; var34++) {
                int var35 = this.field3868[var34];
                class323 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field3878 != null && this.field3878[var34] != null) {
                        var36 = this.field3878[var34];
                    }
                    if (!arg10.method2882(var35 & 0x3FFFFFFF, -22087).method2017(-1, this.field3887, var36)) {
                        var33 = true;
                    }
                } else if ((Integer.MIN_VALUE & var35) != 0 && !arg7.method3095((byte) -112, var35 & 0x3FFFFFFF).method1381((byte) -61)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class496[] var37 = new class496[this.field3868.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field3868.length; var39++) {
                int var40 = this.field3868[var39];
                class323 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field3878 != null && this.field3878[var39] != null) {
                        var41 = this.field3878[var39];
                    }
                    class496 var42 = arg10.method2882(var40 & 0x3FFFFFFF, -22087).method2016(var41, this.field3887, -1);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class496 var43 = arg7.method3095((byte) -90, var40 & 0x3FFFFFFF).method1383(113);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            int var44 = var13 | 0x4000;
            class496 var45 = new class496(var37, var38);
            var31 = arg0.method567(var45, var44, class137.field1715, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class400.field5239.length; var47++) {
                    if (class400.field5239[var47][var46].length > this.field3890[var46]) {
                        var31.method402(class677.field9293[var47][var46], class400.field5239[var47][var46][this.field3890[var46]]);
                    }
                }
            }
            var31.method378(var13);
            class288 var48 = class462.field6485;
            synchronized (class462.field6485) {
                class462.field6485.method1686(-25638, this.field3877, var31);
            }
        }
        if (arg6 == null) {
            return var31;
        }
        var31.method364((byte) 4, var13, true);
        class498 var50 = arg6.method3351(arg11, arg2, arg8, var31, arg1, (byte) 114);
        if (arg4) {
            this.method1864(-24, -51, null, 84);
        }
        return var50;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILnp;ILfs;Laaa;IIIILha;II)Lka;", line = 231)
    public final class498 method1857(int arg0, class517 arg1, int arg2, class582 arg3, class644 arg4, int arg5, int arg6, int arg7, int arg8, class66 arg9, int arg10, int arg11) {
        field3870++;
        int var13 = arg11;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg11 | 0x20;
            int var21 = arg3.field7955[arg8];
            Object var22 = null;
            int var23 = var21 >>> 16;
            class338 var24 = arg4.method3602(var23, (byte) -85);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1998(var25, (byte) 17);
                var14 |= var24.method2001(var25, 7402);
                var17 |= var24.method1997(var25, true);
                var16 |= arg3.field7940;
            }
            if ((arg3.field7932 || class688.field9381) && arg6 != -1 && arg6 < arg3.field7955.length) {
                int var26 = arg3.field7955[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class338 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg4.method3602(var28 >>> 16, (byte) -126);
                }
                if (var29 != null) {
                    var15 |= var29.method1998(var28, (byte) 17);
                    var14 |= var29.method2001(var28, 7402);
                    var17 |= var29.method1997(var28, true);
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
        long var30 = (long) arg5 | (long) arg0 << 32 | (long) (arg7 << 16);
        if (arg10 >= -28) {
            this.method1866((byte) -16);
        }
        class288 var32 = class462.field6485;
        class498 var33;
        synchronized (class462.field6485) {
            var33 = (class498) class462.field6485.method1684(var30, -359);
        }
        if (var33 == null || arg9.method620(var33.method396(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method632(var13, var33.method396());
            }
            class496[] var35 = new class496[3];
            int var36 = 0;
            if (!arg1.method3095((byte) -121, arg5).method1381((byte) -54) || !arg1.method3095((byte) -72, arg7).method1381((byte) -45) || !arg1.method3095((byte) -101, arg0).method1381((byte) -114)) {
                return null;
            }
            class496 var37 = arg1.method3095((byte) -62, arg5).method1383(97);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class496 var38 = arg1.method3095((byte) -117, arg7).method1383(-114);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class496 var39 = arg1.method3095((byte) -80, arg0).method1383(97);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class496 var41 = new class496(var35, var36);
            var33 = arg9.method567(var41, var40, class137.field1715, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class400.field5239.length; var43++) {
                    if (class400.field5239[var43][var42].length > this.field3890[var42]) {
                        var33.method402(class677.field9293[var43][var42], class400.field5239[var43][var42][this.field3890[var42]]);
                    }
                }
            }
            var33.method378(var13);
            class288 var44 = class462.field6485;
            synchronized (class462.field6485) {
                class462.field6485.method1686(-25638, var30, var33);
            }
        }
        if (arg3 == null) {
            return var33;
        } else {
            class498 var45 = var33.method364((byte) 4, var13, true);
            return arg3.method3351(arg11, arg8, arg2, var45, arg6, (byte) 105);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(I[II[IZI[Lca;)V", line = 389)
    public final void method1858(int arg0, int[] arg1, int arg2, int[] arg3, boolean arg4, int arg5, class323[] arg6) {
        if (this.field3881 != arg2) {
            this.field3881 = arg2;
        }
        this.field3887 = arg4;
        field3884++;
        this.field3878 = arg6;
        this.field3879 = arg0;
        this.field3868 = arg3;
        this.field3890 = arg1;
        this.method1866((byte) -86);
        if (arg5 != -15912) {
            method1862(78, null, 24);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(III)V", line = 411)
    public final void method1859(int arg0, int arg1, int arg2) {
        field3869++;
        this.field3890[arg0] = arg2;
        this.method1866((byte) -111);
        if (arg1 < 26) {
            this.field3887 = true;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(BZ)V", line = 423)
    public final void method1860(byte arg0, boolean arg1) {
        this.field3887 = arg1;
        field3871++;
        if (arg0 < -7) {
            this.method1866((byte) -118);
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IIIII)I", line = 436)
    public static final int method1861(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field3883++;
        int var5 = 65536 - class789.field10864[arg1 * 8192 / arg0] >> 1;
        if (arg4 != 1073741824) {
            field3888 = null;
        }
        return ((65536 - var5) * arg3 >> 16) + (arg2 * var5 >> 16);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILfg;I)V", line = 451)
    public static final void method1862(int arg0, class140 arg1, int arg2) {
        if (class112.field1410) {
            arg0 = 0;
            class112.field1410 = false;
        }
        if (arg2 < 33) {
            return;
        }
        field3872++;
        if (class725.field10167 != null && class725.field10167.method1019(8, arg1)) {
            return;
        }
        class725.field10167 = arg1;
        class228.field2706 = class349.method2069(true);
        class47.field629 = arg0;
        class297.field3539 = arg0;
        if (class297.field3539 != 0) {
            class188.field2270 = class228.field2708;
            class622.field8542 = class591.field8034;
            class777.field10738 = class731.field10241;
            class741.field10311 = class112.field1415;
            class272.field3203 = class349.field4351;
            class611.field8199 = class93.field1226;
            class225.field2632 = class173.field2066;
            class77.field1047 = class394.field5103;
            class593.field8048 = class361.field4490;
            class417.field5442 = class369.field4592;
            return;
        }
        class730.method4123(16711935);
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(B)V", line = 494)
    public static void method1863(byte arg0) {
        field3880 = null;
        field3876 = null;
        int var1 = -126 % ((18 - arg0) / 63);
        field3888 = null;
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(IILnq;I)V", line = 506)
    public final void method1864(int arg0, int arg1, class486 arg2, int arg3) {
        field3882++;
        if (arg3 == -1) {
            this.field3868[arg1] = 0;
        } else if (arg2.method2882(arg3, -22087) == null) {
            return;
        } else {
            this.field3868[arg1] = class5.method105(1073741824, arg3);
            this.method1866((byte) -121);
        }
        if (arg0 != 1073741824) {
            this.field3887 = false;
        }
    }

    @OriginalMember(owner = "client!nba", name = "a", descriptor = "(ILha;Laaa;ILvr;IILfs;I[ILbh;ILnq;BILfs;[Lhb;Lnp;ILjf;Z)Lka;", line = 530)
    public final class498 method1865(int arg0, class66 arg1, class644 arg2, int arg3, class148 arg4, int arg5, int arg6, class582 arg7, int arg8, int[] arg9, class40 arg10, int arg11, class486 arg12, byte arg13, int arg14, class582 arg15, class756[] arg16, class517 arg17, int arg18, class229 arg19, boolean arg20) {
        field3873++;
        if (this.field3879 != -1) {
            return arg4.method1070(this.field3879, true).method2850(arg2, arg5, arg6, arg3, arg14, (byte) 34, arg18, arg1, null, arg9, arg19, arg8, arg10, arg0, arg15, arg11, arg16, arg7);
        }
        int var22 = arg0;
        long var23 = this.field3877;
        int[] var25 = this.field3868;
        boolean var26 = false;
        boolean var27 = false;
        if (arg15 != null && (arg15.field7934 >= 0 || arg15.field7942 >= 0)) {
            var25 = new int[this.field3868.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field3868[var28];
            }
            if (arg15.field7934 >= 0) {
                if (arg15.field7934 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                    var26 = true;
                } else {
                    var25[5] = class5.method105(arg15.field7934, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg15.field7942 >= 0) {
                if (arg15.field7942 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class5.method105(1073741824, arg15.field7942);
                    var23 ^= var25[3];
                }
                var27 = true;
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg15 != null || arg7 != null;
        int var33 = arg16 == null ? 0 : arg16.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class611.field8198[var34] = null;
            if (arg16[var34] != null) {
                class582 var35 = arg2.method3600(-59, arg16[var34].field10471);
                if (var35.field7955 != null) {
                    var32 = true;
                    class325.field4027[var34] = var35;
                    int var36 = arg16[var34].field10473;
                    int var37 = arg16[var34].field10467;
                    int var38 = var35.field7955[var36];
                    class611.field8198[var34] = arg2.method3602(var38 >>> 16, (byte) -78);
                    int var39 = var38 & 0xFFFF;
                    class287.field3402[var34] = var39;
                    if (class611.field8198[var34] != null) {
                        var30 |= class611.field8198[var34].method1998(var39, (byte) 17);
                        var29 |= class611.field8198[var34].method2001(var39, 7402);
                        var31 |= class611.field8198[var34].method1997(var39, true);
                    }
                    if ((var35.field7932 || class688.field9381) && var37 != -1 && var37 < var35.field7955.length) {
                        class426.field5645[var34] = var35.field7936[var36];
                        class212.field2500[var34] = arg16[var34].field10470;
                        int var40 = var35.field7955[var37];
                        class456.field6430[var34] = arg2.method3602(var40 >>> 16, (byte) -79);
                        int var41 = var40 & 0xFFFF;
                        class68.field981[var34] = var41;
                        if (class456.field6430[var34] != null) {
                            var30 |= class456.field6430[var34].method1998(var41, (byte) 17);
                            var29 |= class456.field6430[var34].method2001(var41, 7402);
                            var31 |= class456.field6430[var34].method1997(var41, true);
                        }
                    } else {
                        class426.field5645[var34] = 0;
                        class212.field2500[var34] = 0;
                        class456.field6430[var34] = null;
                        class68.field981[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        if (arg13 != -14) {
            this.field3886 = 23L;
        }
        int var44 = 0;
        class338 var45 = null;
        class338 var46 = null;
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class338 var50 = null;
        class338 var51 = null;
        if (var32) {
            if (arg15 != null) {
                int var52 = arg15.field7955[arg3];
                int var53 = var52 >>> 16;
                var45 = arg2.method3602(var53, (byte) -124);
                var42 = var52 & 0xFFFF;
                if (var45 != null) {
                    var30 |= var45.method1998(var42, (byte) 17);
                    var29 |= var45.method2001(var42, 7402);
                    var31 |= var45.method1997(var42, true);
                }
                if ((arg15.field7932 || class688.field9381) && arg6 != -1 && arg6 < arg15.field7955.length) {
                    int var54 = arg15.field7955[arg6];
                    var44 = arg15.field7936[arg3];
                    int var55 = var54 >>> 16;
                    var46 = var53 == var55 ? var45 : arg2.method3602(var55, (byte) -41);
                    var43 = var54 & 0xFFFF;
                    if (var46 != null) {
                        var30 |= var46.method1998(var43, (byte) 17);
                        var29 |= var46.method2001(var43, 7402);
                        var31 |= var46.method1997(var43, true);
                    }
                }
            }
            var22 = arg0 | 0x20;
            if (arg7 != null) {
                int var56 = arg7.field7955[arg11];
                int var57 = var56 >>> 16;
                var47 = var56 & 0xFFFF;
                var50 = arg2.method3602(var57, (byte) -60);
                if (var50 != null) {
                    var30 |= var50.method1998(var47, (byte) 17);
                    var29 |= var50.method2001(var47, arg13 ^ 0xFFFFE318);
                    var31 |= var50.method1997(var47, true);
                }
                if ((arg7.field7932 || class688.field9381) && arg5 != -1 && arg5 < arg7.field7955.length) {
                    int var58 = arg7.field7955[arg5];
                    var49 = arg7.field7936[arg11];
                    int var59 = var58 >>> 16;
                    var51 = var57 == var59 ? var50 : arg2.method3602(var59, (byte) -62);
                    var48 = var58 & 0xFFFF;
                    if (var51 != null) {
                        var30 |= var51.method1998(var48, (byte) 17);
                        var29 |= var51.method2001(var48, arg13 ^ 0xFFFFE318);
                        var31 |= var51.method1997(var48, true);
                    }
                }
            }
            if (var30) {
                var22 |= 0x80;
            }
            if (var29) {
                var22 |= 0x100;
            }
            if (var31) {
                var22 |= 0x400;
            }
        }
        class288 var60 = class692.field9424;
        class498 var61;
        synchronized (class692.field9424) {
            var61 = (class498) class692.field9424.method1684(var23, arg13 ^ 0x16B);
        }
        class15 var62 = null;
        if (this.field3881 != -1) {
            var62 = arg19.method1415((byte) -125, this.field3881);
        }
        if (var61 == null || arg1.method620(var61.method396(), var22) != 0) {
            if (var61 != null) {
                var22 = arg1.method632(var22, var61.method396());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var65 >= var25.length) {
                    if (!var64) {
                        class496[] var69 = new class496[var25.length];
                        for (int var70 = 0; var70 < var25.length; var70++) {
                            int var71 = var25[var70];
                            class323 var72 = null;
                            boolean var73 = var70 == 5 && var26 || var70 == 3 && var27;
                            if ((var71 & 0x40000000) != 0) {
                                if (!var73 && this.field3878 != null && this.field3878[var70] != null) {
                                    var72 = this.field3878[var70];
                                }
                                class496 var74 = arg12.method2882(var71 & 0x3FFFFFFF, -22087).method2010(var72, this.field3887, (byte) -100);
                                if (var74 != null) {
                                    var69[var70] = var74;
                                }
                            } else if ((Integer.MIN_VALUE & var71) != 0) {
                                class496 var75 = arg17.method3095((byte) -113, var71 & 0x3FFFFFFF).method1376(0);
                                if (var75 != null) {
                                    var69[var70] = var75;
                                }
                            }
                        }
                        if (var62 != null && var62.field279 != null) {
                            for (int var76 = 0; var76 < var62.field279.length; var76++) {
                                if (var69[var76] != null) {
                                    int var77 = 0;
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    if (var62.field279[var76] != null) {
                                        var78 = var62.field279[var76][1];
                                        var80 = var62.field279[var76][3] << 3;
                                        var79 = var62.field279[var76][2];
                                        var82 = var62.field279[var76][5] << 3;
                                        var77 = var62.field279[var76][0];
                                        var81 = var62.field279[var76][4] << 3;
                                    }
                                    if (var80 != 0 || var81 != 0 || var82 != 0) {
                                        var69[var76].method2918(0, var82, var81, var80);
                                    }
                                    if (var77 != 0 || var78 != 0 || var79 != 0) {
                                        var69[var76].method2926(var77, (byte) -39, var79, var78);
                                    }
                                }
                            }
                        }
                        int var83 = var22 | 0x4000;
                        class496 var84 = new class496(var69, var69.length);
                        var61 = arg1.method567(var84, var83, class137.field1715, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            for (int var86 = 0; var86 < class400.field5239.length; var86++) {
                                if (class400.field5239[var86][var85].length > this.field3890[var85]) {
                                    var61.method402(class677.field9293[var86][var85], class400.field5239[var86][var85][this.field3890[var85]]);
                                }
                            }
                        }
                        if (arg20) {
                            var61.method378(var22);
                            class288 var87 = class692.field9424;
                            synchronized (class692.field9424) {
                                class692.field9424.method1686(arg13 ^ 0x6428, var23, var61);
                            }
                            this.field3886 = var23;
                        }
                        break;
                    }
                    if (this.field3886 != -1L) {
                        class288 var88 = class692.field9424;
                        synchronized (class692.field9424) {
                            var61 = (class498) class692.field9424.method1684(this.field3886, -359);
                        }
                    }
                    if (var61 != null && arg1.method620(var61.method396(), var22) == 0) {
                        break;
                    }
                    return null;
                }
                int var66 = var25[var65];
                class323 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field3878 != null && this.field3878[var65] != null) {
                        var67 = this.field3878[var65];
                    }
                    if (!arg12.method2882(var66 & 0x3FFFFFFF, -22087).method2022((byte) -118, var67, this.field3887)) {
                        var64 = true;
                    }
                } else if ((var66 & Integer.MIN_VALUE) != 0 && !arg17.method3095((byte) -100, var66 & 0x3FFFFFFF).method1380(-3)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class498 var89 = var61.method364((byte) 4, var22, true);
        boolean var90 = false;
        if (arg9 != null) {
            for (int var91 = 0; var91 < arg9.length; var91++) {
                if (arg9[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class778[] var92 = null;
        if (var62 != null) {
            var92 = var62.method198(arg1, -32);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg9.length; var93++) {
                if (var92[var93] != null) {
                    var89.method390(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var33 > var94) {
            if (class611.field8198[var94] != null) {
                var89.method2946(class287.field3402[var94], class68.field981[var94], class426.field5645[var94], 0, var95, class212.field2500[var94] - 1, false, class456.field6430[var94], null, 0, class611.field8198[var94]);
            }
            var95 <<= 0x1;
            var94++;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg9.length; var96++) {
                if (arg9[var96] != -1) {
                    int var97 = arg9[var96] - arg8;
                    int var98 = var97 & 0x3FFF;
                    class778 var99 = arg1.method614();
                    var99.method139(var98);
                    var89.method390(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg9.length; var100++) {
                if (var92[var100] != null) {
                    var89.method390(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method2945(var44, var48, var49, var45, arg18 - 1, var47, arg14 - 1, false, var50, var42, var51, var46, var43, 0, arg15.field7951);
        } else if (var45 != null) {
            var89.method2944(var42, var44, var46, false, arg13 + 10, arg18 + -1, var45, 0, var43);
        } else if (var50 != null) {
            var89.method2944(var47, var49, var51, false, -127, arg14 - 1, var50, 0, var48);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class611.field8198[var101] = null;
            class456.field6430[var101] = null;
            class325.field4027[var101] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!nba", name = "b", descriptor = "(B)V", line = 1108)
    private final void method1866(byte arg0) {
        field3885++;
        long[] var2 = class784.field10825;
        this.field3877 = -1L;
        this.field3877 = this.field3877 >>> 8 ^ var2[(int) (((long) (this.field3881 >> 8) ^ this.field3877) & 0xFFL)];
        this.field3877 = this.field3877 >>> 8 ^ var2[(int) (((long) this.field3881 ^ this.field3877) & 0xFFL)];
        for (int var3 = 0; var3 < this.field3868.length; var3++) {
            this.field3877 = var2[(int) (((long) (this.field3868[var3] >> 24) ^ this.field3877) & 0xFFL)] ^ this.field3877 >>> 8;
            this.field3877 = var2[(int) ((this.field3877 ^ (long) (this.field3868[var3] >> 16)) & 0xFFL)] ^ this.field3877 >>> 8;
            this.field3877 = var2[(int) (((long) (this.field3868[var3] >> 8) ^ this.field3877) & 0xFFL)] ^ this.field3877 >>> 8;
            this.field3877 = var2[(int) (((long) this.field3868[var3] ^ this.field3877) & 0xFFL)] ^ this.field3877 >>> 8;
        }
        if (this.field3878 != null) {
            for (int var4 = 0; var4 < this.field3878.length; var4++) {
                if (this.field3878[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field3887) {
                        var5 = this.field3878[var4].field4017;
                        var6 = this.field3878[var4].field4009;
                    } else {
                        var5 = this.field3878[var4].field4008;
                        var6 = this.field3878[var4].field4013;
                    }
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.length; var7++) {
                            this.field3877 = var2[(int) ((this.field3877 ^ (long) (var6[var7] >> 8)) & 0xFFL)] ^ this.field3877 >>> 8;
                            this.field3877 = var2[(int) ((this.field3877 ^ (long) var6[var7]) & 0xFFL)] ^ this.field3877 >>> 8;
                        }
                    }
                    if (var5 != null) {
                        for (int var8 = 0; var8 < var5.length; var8++) {
                            this.field3877 = this.field3877 >>> 8 ^ var2[(int) (((long) (var5[var8] >> 8) ^ this.field3877) & 0xFFL)];
                            this.field3877 = this.field3877 >>> 8 ^ var2[(int) (((long) var5[var8] ^ this.field3877) & 0xFFL)];
                        }
                    }
                    if (this.field3878[var4].field4010 != null) {
                        for (int var9 = 0; var9 < this.field3878[var4].field4010.length; var9++) {
                            this.field3877 = var2[(int) (((long) (this.field3878[var4].field4010[var9] >> 8) ^ this.field3877) & 0xFFL)] ^ this.field3877 >>> 8;
                            this.field3877 = var2[(int) ((this.field3877 ^ (long) this.field3878[var4].field4010[var9]) & 0xFFL)] ^ this.field3877 >>> 8;
                        }
                    }
                    if (this.field3878[var4].field4012 != null) {
                        for (int var10 = 0; var10 < this.field3878[var4].field4012.length; var10++) {
                            this.field3877 = var2[(int) (((long) (this.field3878[var4].field4012[var10] >> 8) ^ this.field3877) & 0xFFL)] ^ this.field3877 >>> 8;
                            this.field3877 = var2[(int) ((this.field3877 ^ (long) this.field3878[var4].field4012[var10]) & 0xFFL)] ^ this.field3877 >>> 8;
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field3877 = var2[(int) (((long) this.field3890[var11] ^ this.field3877) & 0xFFL)] ^ this.field3877 >>> 8;
        }
        this.field3877 = this.field3877 >>> 8 ^ var2[(int) (((long) (this.field3887 ? 1 : 0) ^ this.field3877) & 0xFFL)];
        if (arg0 >= -68) {
            this.method1865(-83, null, null, -4, null, 119, -77, null, -54, null, null, 105, null, (byte) 3, -63, null, null, null, -51, null, false);
        }
    }
}
