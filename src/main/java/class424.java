import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tj")
public class class424 {

    @OriginalMember(owner = "client!tj", name = "f", descriptor = "I")
    public int field5863 = -1;

    @OriginalMember(owner = "client!tj", name = "n", descriptor = "Z")
    public static boolean field5871 = true;

    @OriginalMember(owner = "client!tj", name = "l", descriptor = "Lmo;")
    public static class336 field5869 = new class336(8);

    @OriginalMember(owner = "client!tj", name = "t", descriptor = "Z")
    public static boolean field5877 = true;

    @OriginalMember(owner = "client!tj", name = "v", descriptor = "[Z")
    public static boolean[] field5879 = new boolean[100];

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "I")
    public static int field5858;

    @OriginalMember(owner = "client!tj", name = "b", descriptor = "I")
    public static int field5859;

    @OriginalMember(owner = "client!tj", name = "c", descriptor = "I")
    public static int field5860;

    @OriginalMember(owner = "client!tj", name = "e", descriptor = "I")
    public static int field5862;

    @OriginalMember(owner = "client!tj", name = "h", descriptor = "I")
    public static int field5865;

    @OriginalMember(owner = "client!tj", name = "k", descriptor = "I")
    public static int field5868;

    @OriginalMember(owner = "client!tj", name = "m", descriptor = "I")
    public static int field5870;

    @OriginalMember(owner = "client!tj", name = "o", descriptor = "I")
    public static int field5872;

    @OriginalMember(owner = "client!tj", name = "q", descriptor = "I")
    private int field5874;

    @OriginalMember(owner = "client!tj", name = "r", descriptor = "I")
    public static int field5875;

    @OriginalMember(owner = "client!tj", name = "w", descriptor = "I")
    public static int field5880;

    @OriginalMember(owner = "client!tj", name = "i", descriptor = "J")
    private long field5866;

    @OriginalMember(owner = "client!tj", name = "j", descriptor = "J")
    private long field5867;

    @OriginalMember(owner = "client!tj", name = "u", descriptor = "Lnl;")
    public static class435 field5878;

    @OriginalMember(owner = "client!tj", name = "s", descriptor = "Z")
    public boolean field5876;

    @OriginalMember(owner = "client!tj", name = "g", descriptor = "[I")
    public int[] field5864;

    @OriginalMember(owner = "client!tj", name = "p", descriptor = "[I")
    private int[] field5873;

    @OriginalMember(owner = "client!tj", name = "d", descriptor = "[[I")
    private int[][] field5861;

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lqr;Lqp;I[Laq;ILvc;Lgd;IIIILvk;ZLpt;ILqp;Lkp;Ldj;B)Ln;")
    public final class468 method2520(class456 arg0, class303 arg1, int arg2, class305[] arg3, int arg4, class89 arg5, class237 arg6, int arg7, int arg8, int arg9, int arg10, class276 arg11, boolean arg12, class362 arg13, int arg14, class303 arg15, class263 arg16, class314 arg17, byte arg18) {
        field5859++;
        if (this.field5863 != -1) {
            return arg17.method1997(this.field5863, 24749).method221(arg0, arg9, arg16, arg3, (byte) 86, arg4, arg15, arg5, arg8, arg2, arg14, arg11, arg1, arg10, arg7);
        }
        int var20 = arg9;
        long var21 = this.field5866;
        int[] var23 = this.field5873;
        if (arg1 != null && (arg1.field4294 >= 0 || arg1.field4306 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field5873[var24];
            }
            if (arg1.field4294 >= 0) {
                if (arg1.field4294 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class142.method1024(arg1.field4294, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg1.field4306 >= 0) {
                if (arg1.field4306 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class142.method1024(arg1.field4306, 1073741824);
                    var21 ^= (long) var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = arg1 != null || arg15 != null;
        int var28 = arg3 == null ? 0 : arg3.length;
        if (arg18 > -36) {
            return null;
        }
        for (int var29 = 0; var29 < var28; var29++) {
            class349.field4803[var29] = null;
            if (arg3[var29] != null) {
                class303 var30 = arg11.method1856(126, arg3[var29].field4333);
                if (var30.field4286 != null) {
                    class398.field5462[var29] = var30;
                    var27 = true;
                    int var31 = arg3[var29].field4332;
                    int var32 = arg3[var29].field4334;
                    int var33 = var30.field4286[var31];
                    class349.field4803[var29] = arg11.method1855(-110, var33 >>> 16);
                    int var34 = var33 & 0xFFFF;
                    class47.field720[var29] = var34;
                    if (class349.field4803[var29] != null) {
                        var26 |= class349.field4803[var29].method998(var34, (byte) 112);
                        var25 |= class349.field4803[var29].method999(0, var34);
                    }
                    if ((var30.field4300 || class439.field6230) && var32 != -1 && var30.field4286.length > var32) {
                        class18.field168[var29] = var30.field4283[var31];
                        class108.field1516[var29] = arg3[var29].field4335;
                        int var35 = var30.field4286[var32];
                        class38.field469[var29] = arg11.method1855(-118, var35 >>> 16);
                        int var36 = var35 & 0xFFFF;
                        class108.field1518[var29] = var36;
                        if (class38.field469[var29] != null) {
                            var26 |= class38.field469[var29].method998(var36, (byte) -32);
                            var25 |= class38.field469[var29].method999(0, var36);
                        }
                    } else {
                        class18.field168[var29] = 0;
                        class108.field1516[var29] = 0;
                        class38.field469[var29] = null;
                        class108.field1518[var29] = -1;
                    }
                }
            }
        }
        int var37 = -1;
        int var38 = -1;
        int var39 = 0;
        class135 var40 = null;
        class135 var41 = null;
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class135 var45 = null;
        class135 var46 = null;
        if (var27) {
            if (arg1 != null) {
                int var47 = arg1.field4286[arg10];
                int var48 = var47 >>> 16;
                var40 = arg11.method1855(53, var48);
                var37 = var47 & 0xFFFF;
                if (var40 != null) {
                    var26 |= var40.method998(var37, (byte) -126);
                    var25 |= var40.method999(0, var37);
                }
                if ((arg1.field4300 || class439.field6230) && arg14 != -1 && arg1.field4286.length > arg14) {
                    var39 = arg1.field4283[arg10];
                    int var49 = arg1.field4286[arg14];
                    int var50 = var49 >>> 16;
                    var38 = var49 & 0xFFFF;
                    var41 = var48 == var50 ? var40 : arg11.method1855(-11, var50);
                    if (var41 != null) {
                        var26 |= var41.method998(var38, (byte) -128);
                        var25 |= var41.method999(0, var38);
                    }
                }
            }
            var20 = arg9 | 0x20;
            if (arg15 != null) {
                int var51 = arg15.field4286[arg7];
                int var52 = var51 >>> 16;
                var42 = var51 & 0xFFFF;
                var45 = arg11.method1855(-120, var52);
                if (var45 != null) {
                    var26 |= var45.method998(var42, (byte) -125);
                    var25 |= var45.method999(0, var42);
                }
                if ((arg15.field4300 || class439.field6230) && arg8 != -1 && arg8 < arg15.field4286.length) {
                    int var53 = arg15.field4286[arg8];
                    var44 = arg15.field4283[arg7];
                    int var54 = var53 >>> 16;
                    var46 = var52 == var54 ? var45 : arg11.method1855(8, var54);
                    var43 = var53 & 0xFFFF;
                    if (var46 != null) {
                        var26 |= var46.method998(var43, (byte) 127);
                        var25 |= var46.method999(0, var43);
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
        class336 var55 = class282.field4052;
        class468 var56;
        synchronized (class282.field4052) {
            var56 = (class468) class282.field4052.method2113(0, var21);
        }
        class389 var57 = null;
        if (this.field5874 != -1) {
            var57 = arg16.method1773(this.field5874, -24562);
        }
        if (var56 == null || arg5.method362(var56.method1574(), var20) != 0 || var57 != null && var57.field5354 != null && this.field5861 == null) {
            if (var56 != null) {
                var20 = arg5.method355(var20, var56.method1574());
            }
            boolean var59 = false;
            int var60 = 0;
            while (true) {
                if (var60 >= 12) {
                    if (var59) {
                        if (this.field5867 != -1L) {
                            class336 var87 = class282.field4052;
                            synchronized (class282.field4052) {
                                var56 = (class468) class282.field4052.method2113(0, this.field5867);
                            }
                        }
                        if (var56 == null || arg5.method362(var56.method1574(), var20) != 0 || var57 != null && var57.field5354 != null && this.field5861 == null) {
                            return null;
                        }
                    } else {
                        class430[] var62 = new class430[12];
                        for (int var63 = 0; var63 < 12; var63++) {
                            int var64 = var23[var63];
                            if ((var64 & 0x40000000) != 0) {
                                class430 var66 = arg6.method1644(var64 & 0x3FFFFFFF, 112).method1119(false, this.field5876);
                                if (var66 != null) {
                                    var62[var63] = var66;
                                }
                            } else if ((Integer.MIN_VALUE & var64) != 0) {
                                class430 var65 = arg13.method2227(var64 & 0x3FFFFFFF, 3).method515(-1);
                                if (var65 != null) {
                                    var62[var63] = var65;
                                }
                            }
                        }
                        if (var57 != null && var57.field5354 != null) {
                            for (int var67 = 0; var67 < var57.field5354.length; var67++) {
                                if (var57.field5354[var67] != null && var62[var67] != null) {
                                    int var68 = var57.field5354[var67][0];
                                    int var69 = var57.field5354[var67][1];
                                    int var70 = var57.field5354[var67][2];
                                    int var71 = var57.field5354[var67][3] << 3;
                                    int var72 = var57.field5354[var67][4] << 3;
                                    int var73 = var57.field5354[var67][5] << 3;
                                    if (this.field5861 == null) {
                                        this.field5861 = new int[var57.field5354.length][];
                                    }
                                    if (this.field5861[var67] == null) {
                                        int[] var74 = this.field5861[var67] = new int[15];
                                        if (var71 == 0 && var72 == 0 && var73 == 0) {
                                            var74[0] = var74[4] = var74[8] = 32768;
                                            var74[13] = -var69;
                                            var74[12] = -var68;
                                            var74[14] = -var70;
                                        } else {
                                            int var75 = class319.field4504[var71];
                                            int var76 = class319.field4501[var71];
                                            int var77 = class319.field4504[var72];
                                            int var78 = class319.field4501[var72];
                                            int var79 = class319.field4504[var73];
                                            int var80 = class319.field4501[var73];
                                            int var81 = var76 * var79 + 16384 >> 15;
                                            int var82 = var76 * var80 + 16384 >> 15;
                                            var74[8] = var75 * var77 + 16384 >> 15;
                                            var74[6] = var77 * var82 + -var78 * var79 + 16384 >> 15;
                                            var74[5] = -var76;
                                            var74[3] = var75 * var80 + 16384 >> 15;
                                            var74[0] = var77 * var79 + var78 * var82 + 16384 >> 15;
                                            var74[2] = var75 * var78 + 16384 >> 15;
                                            var74[7] = -var78 * -var80 + var77 * var81 + 16384 >> 15;
                                            var74[4] = var75 * var79 + 16384 >> 15;
                                            var74[1] = -var80 * var77 + var78 * var81 + 16384 >> 15;
                                            var74[12] = var74[0] * -var68 + var74[3] * -var69 + (var74[6] * -var70) + 16384 >> 15;
                                            var74[13] = var74[4] * -var69 + var74[1] * -var68 - (-(var74[7] * -var70) + -16384) >> 15;
                                            var74[14] = var74[8] * -var70 + var74[5] * -var69 + var74[2] * -var68 + 16384 >> 15;
                                        }
                                        var74[11] = var70;
                                        var74[10] = var69;
                                        var74[9] = var68;
                                    }
                                    if (var71 != 0 || var72 != 0 || var73 != 0) {
                                        var62[var67].method2580(var73, 0, var72, var71);
                                    }
                                    if (var68 != 0 || var69 != 0 || var70 != 0) {
                                        var62[var67].method2579(var69, var70, (byte) -21, var68);
                                    }
                                }
                            }
                        }
                        class430 var83 = new class430(var62, var62.length);
                        int var84 = var20 | 0x2000;
                        var56 = arg5.method327(var83, var84, class261.field3755, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            if (this.field5864[var85] < class53.field785[var85].length) {
                                var56.method1615(class336.field4675[var85], class53.field785[var85][this.field5864[var85]]);
                            }
                            if (class301.field4258[var85].length > this.field5864[var85]) {
                                var56.method1615(class343.field4740[var85], class301.field4258[var85][this.field5864[var85]]);
                            }
                        }
                        if (arg12) {
                            var56.method1588(var20);
                            class336 var86 = class282.field4052;
                            synchronized (class282.field4052) {
                                class282.field4052.method2116(var21, (byte) -40, var56);
                            }
                            this.field5867 = var21;
                        }
                    }
                    break;
                }
                int var61 = var23[var60];
                if ((var61 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var61) != 0 && !arg13.method2227(var61 & 0x3FFFFFFF, 3).method511(-20590)) {
                        var59 = true;
                    }
                } else if (!arg6.method1644(var61 & 0x3FFFFFFF, 88).method1113(false, this.field5876)) {
                    var59 = true;
                }
                var60++;
            }
        }
        class468 var88 = var56.method1600((byte) 4, var20, true);
        if (!var27) {
            return var88;
        }
        int var89 = 0;
        int var90 = 1;
        while (var28 > var89) {
            if (class349.field4803[var89] != null) {
                var88.method2784(class349.field4803[var89], class18.field168[var89], 0, 0, class108.field1518[var89], class47.field720[var89], class108.field1516[var89] - 1, var90, false, this.field5861 == null ? null : this.field5861[var89], class38.field469[var89]);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var40 != null && var45 != null) {
            var88.method2788(var38, var39, var40, var41, var44, false, arg2 - 1, arg4 + -1, var37, (byte) 81, var46, var42, var45, arg1.field4277, var43);
        } else if (var40 != null) {
            var88.method2790(var38, false, var37, var41, var39, -1, var40, 0, arg4 - 1);
        } else if (var45 != null) {
            var88.method2790(var43, false, var42, var46, var44, -1, var45, 0, arg2 - 1);
        }
        for (int var91 = 0; var91 < var28; var91++) {
            class349.field4803[var91] = null;
            class38.field469[var91] = null;
            class398.field5462[var91] = null;
        }
        return var88;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Lnl;IBI)Lqi;")
    public static final class430 method2521(class435 arg0, int arg1, byte arg2, int arg3) {
        field5875++;
        byte[] var4 = arg0.method2633(arg1, arg3, -49);
        if (var4 == null) {
            return null;
        } else {
            int var5 = -113 / ((-arg2 - 26) / 46);
            return new class430(var4);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(I)V")
    private final void method2522(int arg0) {
        field5858++;
        long[] var2 = class481.field6808;
        this.field5866 = -1L;
        this.field5866 = var2[(int) (((long) (this.field5874 >> 8) ^ this.field5866) & 0xFFL)] ^ this.field5866 >>> 8;
        this.field5866 = this.field5866 >>> 8 ^ var2[(int) (((long) this.field5874 ^ this.field5866) & 0xFFL)];
        if (arg0 != 64) {
            this.method2526(-20, (class456) null, (class276) null, (byte) 72, 23, -108, (class362) null, (class303) null, (class314) null, (class237) null, (class89) null, -128);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field5866 = this.field5866 >>> 8 ^ var2[(int) ((this.field5866 ^ (long) (this.field5873[var3] >> 24)) & 0xFFL)];
            this.field5866 = this.field5866 >>> 8 ^ var2[(int) ((this.field5866 ^ (long) (this.field5873[var3] >> 16)) & 0xFFL)];
            this.field5866 = this.field5866 >>> 8 ^ var2[(int) (((long) (this.field5873[var3] >> 8) ^ this.field5866) & 0xFFL)];
            this.field5866 = var2[(int) ((this.field5866 ^ (long) this.field5873[var3]) & 0xFFL)] ^ this.field5866 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field5866 = var2[(int) ((this.field5866 ^ (long) this.field5864[var4]) & 0xFFL)] ^ this.field5866 >>> 8;
        }
        this.field5866 = var2[(int) ((this.field5866 ^ (long) (this.field5876 ? 1 : 0)) & 0xFFL)] ^ this.field5866 >>> 8;
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ZZ)V")
    public final void method2523(boolean arg0, boolean arg1) {
        this.field5876 = arg1;
        field5860++;
        if (arg0) {
            this.method2522(64);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(Ljava/util/Random;IB)I")
    public static final int method2524(Random arg0, int arg1, byte arg2) {
        field5862++;
        if (arg1 <= 0) {
            throw new IllegalArgumentException();
        }
        if (arg2 > -63) {
            field5869 = null;
        }
        if (class7.method41(0, arg1)) {
            return (int) (((long) arg0.nextInt() & 0xFFFFFFFFL) * (long) arg1 >> 32);
        }
        int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg1));
        int var4;
        do {
            var4 = arg0.nextInt();
        } while (var4 >= var3);
        return class142.method1023(var4, arg1, 1359681988);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(III)V")
    public final void method2525(int arg0, int arg1, int arg2) {
        field5865++;
        this.field5864[arg0] = arg1;
        if (arg2 >= -54) {
            this.field5864 = null;
        }
        this.method2522(64);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILqr;Lvk;BIILpt;Lqp;Ldj;Lgd;Lvc;I)Ln;")
    public final class468 method2526(int arg0, class456 arg1, class276 arg2, byte arg3, int arg4, int arg5, class362 arg6, class303 arg7, class314 arg8, class237 arg9, class89 arg10, int arg11) {
        field5872++;
        if (this.field5863 != -1) {
            return arg8.method1997(this.field5863, arg3 ^ 0xFFFF9F68).method226(arg10, 25169, arg1, arg2, arg4, arg7, arg5, arg11, arg0);
        }
        int var13 = arg5;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            var13 = arg5 | 0x20;
            Object var20 = null;
            int var21 = arg7.field4286[arg11];
            int var22 = var21 >>> 16;
            int var23 = var21 & 0xFFFF;
            class135 var24 = arg2.method1855(-116, var22);
            if (var24 != null) {
                var15 |= var24.method998(var23, (byte) -39);
                var14 |= var24.method999(0, var23);
                var16 |= arg7.field4281;
            }
            if ((arg7.field4300 || class439.field6230) && arg0 != -1 && arg0 < arg7.field4286.length) {
                int var25 = arg7.field4286[arg0];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class135 var28 = var22 == var26 ? var24 : arg2.method1855(-124, var26);
                if (var28 != null) {
                    var15 |= var28.method998(var27, (byte) 88);
                    var14 |= var28.method999(0, var27);
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
        if (arg3 != -59) {
            field5871 = false;
        }
        class336 var29 = class402.field5517;
        class468 var30;
        synchronized (class402.field5517) {
            var30 = (class468) class402.field5517.method2113(arg3 ^ 0xFFFFFFC5, this.field5866);
        }
        if (var30 == null || arg10.method362(var30.method1574(), var13) != 0) {
            if (var30 != null) {
                var13 = arg10.method355(var13, var30.method1574());
            }
            boolean var32 = false;
            for (int var33 = 0; var33 < 12; var33++) {
                int var34 = this.field5873[var33];
                if ((var34 & 0x40000000) == 0) {
                    if ((var34 & Integer.MIN_VALUE) != 0 && !arg6.method2227(var34 & 0x3FFFFFFF, 3).method514((byte) 87)) {
                        var32 = true;
                    }
                } else if (!arg9.method1644(var34 & 0x3FFFFFFF, 111).method1122((byte) 99, this.field5876)) {
                    var32 = true;
                }
            }
            if (var32) {
                return null;
            }
            class430[] var35 = new class430[12];
            int var36 = 0;
            for (int var37 = 0; var37 < 12; var37++) {
                int var38 = this.field5873[var37];
                if ((var38 & 0x40000000) != 0) {
                    class430 var40 = arg9.method1644(var38 & 0x3FFFFFFF, 98).method1108(this.field5876, 0);
                    if (var40 != null) {
                        var35[var36++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var38) != 0) {
                    class430 var39 = arg6.method2227(var38 & 0x3FFFFFFF, 3).method512((byte) 89);
                    if (var39 != null) {
                        var35[var36++] = var39;
                    }
                }
            }
            int var41 = var13 | 0x2000;
            class430 var42 = new class430(var35, var36);
            var30 = arg10.method327(var42, var41, class261.field3755, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                if (class53.field785[var43].length > this.field5864[var43]) {
                    var30.method1615(class336.field4675[var43], class53.field785[var43][this.field5864[var43]]);
                }
                if (class301.field4258[var43].length > this.field5864[var43]) {
                    var30.method1615(class343.field4740[var43], class301.field4258[var43][this.field5864[var43]]);
                }
            }
            var30.method1588(var13);
            class336 var44 = class402.field5517;
            synchronized (class402.field5517) {
                class402.field5517.method2116(this.field5866, (byte) -103, var30);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            var30.method1600((byte) 4, var13, true);
            return arg7.method1949(arg0, arg4, var30, arg5, arg3 ^ 0xFFFF8502, arg11);
        }
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(B)V")
    public static void method2527(byte arg0) {
        field5879 = null;
        field5878 = null;
        field5869 = null;
        int var1 = 32 / ((77 - arg0) / 41);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(IILpt;I)V")
    public final void method2528(int arg0, int arg1, class362 arg2, int arg3) {
        field5870++;
        int var5 = class143.field1999[arg0];
        if (this.field5873[var5] == 0 || arg2.method2227(arg1, 3) == null) {
            return;
        }
        this.field5873[var5] = class142.method1024(Integer.MIN_VALUE, arg1);
        if (arg3 != -9181) {
            this.field5867 = -22L;
        }
        this.method2522(arg3 + 9245);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "(ILvc;Lpt;IILqp;ILvk;IIII)Ln;")
    public final class468 method2529(int arg0, class89 arg1, class362 arg2, int arg3, int arg4, class303 arg5, int arg6, class276 arg7, int arg8, int arg9, int arg10, int arg11) {
        field5880++;
        int var13 = arg4;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = true;
            boolean var18 = true;
            Object var19 = null;
            int var20 = arg5.field4286[arg11];
            Object var21 = null;
            var13 = arg4 | 0x20;
            int var22 = var20 >>> 16;
            int var23 = var20 & 0xFFFF;
            class135 var24 = arg7.method1855(-120, var22);
            if (var24 != null) {
                var15 |= var24.method998(var23, (byte) 32);
                var14 |= var24.method999(0, var23);
                var16 |= arg5.field4281;
            }
            if ((arg5.field4300 || class439.field6230) && arg9 != -1 && arg5.field4286.length > arg9) {
                int var25 = arg5.field4286[arg9];
                int var26 = var25 >>> 16;
                int var27 = var25 & 0xFFFF;
                class135 var28;
                if (var22 == var26) {
                    var28 = var24;
                } else {
                    var28 = arg7.method1855(-122, var27 >>> 16);
                }
                if (var28 != null) {
                    var15 |= var28.method998(var27, (byte) 89);
                    var14 |= var28.method999(0, var27);
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
        long var29 = (long) arg0 | (long) (arg3 << 16) | (long) arg10 << 32;
        class336 var31 = class402.field5517;
        class468 var32;
        synchronized (class402.field5517) {
            var32 = (class468) class402.field5517.method2113(0, var29);
        }
        if (var32 == null || arg1.method362(var32.method1574(), var13) != 0) {
            if (var32 != null) {
                var13 = arg1.method355(var13, var32.method1574());
            }
            class430[] var34 = new class430[3];
            int var35 = 0;
            if (!arg2.method2227(arg0, 3).method514((byte) 123) || !arg2.method2227(arg3, 3).method514((byte) 103) || !arg2.method2227(arg10, 3).method514((byte) -25)) {
                return null;
            }
            class430 var36 = arg2.method2227(arg0, 3).method512((byte) 89);
            if (var36 != null) {
                var34[var35++] = var36;
            }
            class430 var37 = arg2.method2227(arg3, 3).method512((byte) 89);
            if (var37 != null) {
                var34[var35++] = var37;
            }
            class430 var38 = arg2.method2227(arg10, 3).method512((byte) 89);
            if (var38 != null) {
                var34[var35++] = var38;
            }
            int var39 = var13 | 0x2000;
            class430 var40 = new class430(var34, var35);
            var32 = arg1.method327(var40, var39, class261.field3755, 64, 768);
            for (int var41 = 0; var41 < 5; var41++) {
                if (class53.field785[var41].length > this.field5864[var41]) {
                    var32.method1615(class336.field4675[var41], class53.field785[var41][this.field5864[var41]]);
                }
                if (this.field5864[var41] < class301.field4258[var41].length) {
                    var32.method1615(class343.field4740[var41], class301.field4258[var41][this.field5864[var41]]);
                }
            }
            var32.method1588(var13);
            class336 var42 = class402.field5517;
            synchronized (class402.field5517) {
                class402.field5517.method2116(var29, (byte) -51, var32);
            }
        }
        if (arg5 == null) {
            return var32;
        }
        class468 var43 = var32.method1600((byte) 4, var13, true);
        if (arg6 != 17856) {
            this.method2529(60, (class89) null, (class362) null, 64, 31, (class303) null, 66, (class276) null, -69, -115, -36, -105);
        }
        return arg5.method1949(arg9, arg8, var43, arg4, arg6 + 13575, arg11);
    }

    @OriginalMember(owner = "client!tj", name = "a", descriptor = "([III[IZI)V")
    public final void method2530(int[] arg0, int arg1, int arg2, int[] arg3, boolean arg4, int arg5) {
        this.field5863 = arg1;
        this.field5864 = arg3;
        this.field5873 = arg0;
        this.field5876 = arg4;
        if (this.field5874 != arg2) {
            this.field5861 = null;
            this.field5874 = arg2;
        }
        field5868++;
        this.method2522(64);
        if (arg5 != -256328113) {
            method2527((byte) 95);
        }
    }
}
