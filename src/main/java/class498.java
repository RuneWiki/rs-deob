import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kn")
public class class498 {

    @OriginalMember(owner = "client!kn", name = "d", descriptor = "I")
    public int field6559 = -1;

    @OriginalMember(owner = "client!kn", name = "i", descriptor = "Lrga;")
    public static class280 field6564 = new class280(29, 7);

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "I")
    public static int field6556;

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "I")
    public static int field6557;

    @OriginalMember(owner = "client!kn", name = "c", descriptor = "I")
    private int field6558;

    @OriginalMember(owner = "client!kn", name = "e", descriptor = "I")
    public static int field6560;

    @OriginalMember(owner = "client!kn", name = "f", descriptor = "I")
    public static int field6561;

    @OriginalMember(owner = "client!kn", name = "g", descriptor = "I")
    public static int field6562;

    @OriginalMember(owner = "client!kn", name = "h", descriptor = "I")
    public static int field6563;

    @OriginalMember(owner = "client!kn", name = "l", descriptor = "I")
    public static int field6567;

    @OriginalMember(owner = "client!kn", name = "o", descriptor = "I")
    public static int field6570;

    @OriginalMember(owner = "client!kn", name = "p", descriptor = "I")
    public static int field6571;

    @OriginalMember(owner = "client!kn", name = "r", descriptor = "I")
    public static int field6573;

    @OriginalMember(owner = "client!kn", name = "s", descriptor = "I")
    public static int field6574;

    @OriginalMember(owner = "client!kn", name = "m", descriptor = "J")
    private long field6568;

    @OriginalMember(owner = "client!kn", name = "t", descriptor = "J")
    private long field6575;

    @OriginalMember(owner = "client!kn", name = "q", descriptor = "Z")
    public boolean field6572;

    @OriginalMember(owner = "client!kn", name = "j", descriptor = "[I")
    private int[] field6565;

    @OriginalMember(owner = "client!kn", name = "k", descriptor = "[I")
    public int[] field6566;

    @OriginalMember(owner = "client!kn", name = "n", descriptor = "[[I")
    private int[][] field6569;

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "([IZIIB[I)V")
    public final void method2676(int[] arg0, boolean arg1, int arg2, int arg3, byte arg4, int[] arg5) {
        if (this.field6558 != arg2) {
            this.field6569 = null;
            this.field6558 = arg2;
        }
        this.field6565 = arg0;
        this.field6566 = arg5;
        this.field6572 = arg1;
        this.field6559 = arg3;
        field6556++;
        this.method2677((byte) -122);
        if (arg4 != 23) {
            this.field6566 = null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(B)V")
    private final void method2677(byte arg0) {
        field6567++;
        this.field6568 = -1L;
        long[] var2 = class36.field488;
        this.field6568 = var2[(int) (((long) (this.field6558 >> 8) ^ this.field6568) & 0xFFL)] ^ this.field6568 >>> 8;
        this.field6568 = this.field6568 >>> 8 ^ var2[(int) (((long) this.field6558 ^ this.field6568) & 0xFFL)];
        for (int var3 = 0; var3 < 12; var3++) {
            this.field6568 = var2[(int) (((long) (this.field6565[var3] >> 24) ^ this.field6568) & 0xFFL)] ^ this.field6568 >>> 8;
            this.field6568 = this.field6568 >>> 8 ^ var2[(int) ((this.field6568 ^ (long) (this.field6565[var3] >> 16)) & 0xFFL)];
            this.field6568 = var2[(int) (((long) (this.field6565[var3] >> 8) ^ this.field6568) & 0xFFL)] ^ this.field6568 >>> 8;
            this.field6568 = this.field6568 >>> 8 ^ var2[(int) (((long) this.field6565[var3] ^ this.field6568) & 0xFFL)];
        }
        if (arg0 <= -93) {
            for (int var4 = 0; var4 < 5; var4++) {
                this.field6568 = this.field6568 >>> 8 ^ var2[(int) (((long) this.field6566[var4] ^ this.field6568) & 0xFFL)];
            }
            this.field6568 = this.field6568 >>> 8 ^ var2[(int) ((this.field6568 ^ (long) (this.field6572 ? 1 : 0)) & 0xFFL)];
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(III)V")
    public final void method2678(int arg0, int arg1, int arg2) {
        this.field6566[arg1] = arg0;
        field6573++;
        this.method2677((byte) -108);
        if (arg2 != 31622) {
            this.method2681(29, null, -67, -76, 21, (byte) 126, null, 6, null, -78, 111, null);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(I)V")
    public static void method2679(int arg0) {
        field6564 = null;
        if (arg0 != 0) {
            method2687(-32, 89, -12);
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(I)[Lwl;")
    public static final class679[] method2680(int arg0) {
        field6563++;
        return arg0 == 20565 ? new class679[] { class559.field7750, class280.field3517, class356.field4534 } : null;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ILhl;IIIBLdr;ILr;IILcn;)Lda;")
    public final class474 method2681(int arg0, class322 arg1, int arg2, int arg3, int arg4, byte arg5, class395 arg6, int arg7, class566 arg8, int arg9, int arg10, class21 arg11) {
        field6560++;
        int var13 = arg10;
        if (arg6 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg6.field4979[arg9];
            Object var22 = null;
            var13 = arg10 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class662 var25 = arg1.method1843(var23, -108);
            if (var25 != null) {
                var15 |= var25.method3731(var24, 0);
                var14 |= var25.method3729(var24, (byte) -57);
                var17 |= var25.method3732((byte) -101, var24);
                var16 |= arg6.field4977;
            }
            if ((arg6.field4989 || class426.field5349) && arg3 != -1 && arg3 < arg6.field4979.length) {
                int var26 = arg6.field4979[arg3];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class662 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg1.method1843(var28 >>> 16, -126);
                }
                if (var29 != null) {
                    var15 |= var29.method3731(var28, 0);
                    var14 |= var29.method3729(var28, (byte) -99);
                    var17 |= var29.method3732((byte) -101, var28);
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
        long var30 = (long) (arg4 << 16) | (long) arg7 << 32 | (long) arg0;
        class450 var32 = class19.field290;
        class474 var33;
        synchronized (class19.field290) {
            var33 = (class474) class19.field290.method2418(var30, (byte) 100);
        }
        if (var33 == null || arg8.method998(var33.method764(), var13) != 0) {
            if (var33 != null) {
                var13 = arg8.method1018(var13, var33.method764());
            }
            class47[] var35 = new class47[3];
            int var36 = 0;
            if (!arg11.method150((byte) 81, arg0).method1584((byte) -95) || !arg11.method150((byte) 89, arg4).method1584((byte) -69) || !arg11.method150((byte) 42, arg7).method1584((byte) -111)) {
                return null;
            }
            class47 var37 = arg11.method150((byte) 86, arg0).method1582(false);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class47 var38 = arg11.method150((byte) 94, arg4).method1582(false);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class47 var39 = arg11.method150((byte) 47, arg7).method1582(false);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class47 var40 = new class47(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg8.method1019(var40, var41, class565.field7888, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class8.field161.length; var43++) {
                    if (class8.field161[var43][var42].length > this.field6566[var42]) {
                        var33.method694(class205.field2615[var43][var42], class8.field161[var43][var42][this.field6566[var42]]);
                    }
                }
            }
            var33.method761(var13);
            class450 var44 = class19.field290;
            synchronized (class19.field290) {
                class19.field290.method2409(var30, var33, 1);
            }
        }
        if (arg6 == null) {
            return var33;
        } else {
            class474 var45 = var33.method711((byte) 4, var13, true);
            return arg5 == -42 ? arg6.method2122(arg9, arg10, (byte) 93, arg2, arg3, var45) : null;
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(Lcn;Lhl;ILmf;Ldr;Llb;[Lan;Lhaa;IILdr;IIILwca;Lr;IZB)Lda;")
    public final class474 method2682(class21 arg0, class322 arg1, int arg2, class72 arg3, class395 arg4, class255 arg5, class248[] arg6, class79 arg7, int arg8, int arg9, class395 arg10, int arg11, int arg12, int arg13, class338 arg14, class566 arg15, int arg16, boolean arg17, byte arg18) {
        field6557++;
        if (this.field6559 != -1) {
            return arg5.method1490(this.field6559, (byte) -103).method3227(arg11, arg16, arg12, arg14, arg9, arg8, arg10, arg18 + 13645, arg13, arg4, arg1, arg2, arg6, arg15, arg7);
        }
        int var20 = arg2;
        long var21 = this.field6568;
        int[] var23 = this.field6565;
        if (arg4 != null && (arg4.field4971 >= 0 || arg4.field4993 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6565[var24];
            }
            if (arg4.field4971 >= 0) {
                if (arg4.field4971 == 65535) {
                    var21 ^= 0xFFFFFFFF00000000L;
                    var23[5] = 0;
                } else {
                    var23[5] = class444.method2376(1073741824, arg4.field4971);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg4.field4993 >= 0) {
                if (arg4.field4993 == 65535) {
                    var23[3] = 0;
                    var21 ^= 0xFFFFFFFFL;
                } else {
                    var23[3] = class444.method2376(1073741824, arg4.field4993);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg4 != null || arg10 != null;
        int var29 = arg6 == null ? 0 : arg6.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class642.field9042[var30] = null;
            if (arg6[var30] != null) {
                class395 var31 = arg1.method1844(arg18 ^ 0x3D, arg6[var30].field3060);
                if (var31.field4979 != null) {
                    var28 = true;
                    class25.field380[var30] = var31;
                    int var32 = arg6[var30].field3061;
                    int var33 = arg6[var30].field3064;
                    int var34 = var31.field4979[var32];
                    class642.field9042[var30] = arg1.method1843(var34 >>> 16, 60);
                    int var35 = var34 & 0xFFFF;
                    class214.field2652[var30] = var35;
                    if (class642.field9042[var30] != null) {
                        var26 |= class642.field9042[var30].method3731(var35, 0);
                        var25 |= class642.field9042[var30].method3729(var35, (byte) -105);
                        var27 |= class642.field9042[var30].method3732((byte) -101, var35);
                    }
                    if ((var31.field4989 || class426.field5349) && var33 != -1 && var33 < var31.field4979.length) {
                        class199.field2528[var30] = var31.field4991[var32];
                        class122.field1541[var30] = arg6[var30].field3059;
                        int var36 = var31.field4979[var33];
                        class587.field8255[var30] = arg1.method1843(var36 >>> 16, 101);
                        int var37 = var36 & 0xFFFF;
                        class286.field3561[var30] = var37;
                        if (class587.field8255[var30] != null) {
                            var26 |= class587.field8255[var30].method3731(var37, 0);
                            var25 |= class587.field8255[var30].method3729(var37, (byte) -100);
                            var27 |= class587.field8255[var30].method3732((byte) -101, var37);
                        }
                    } else {
                        class199.field2528[var30] = 0;
                        class122.field1541[var30] = 0;
                        class587.field8255[var30] = null;
                        class286.field3561[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class662 var41 = null;
        class662 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class662 var46 = null;
        if (arg18 != 125) {
            return null;
        }
        class662 var47 = null;
        if (var28) {
            if (arg4 != null) {
                int var48 = arg4.field4979[arg11];
                int var49 = var48 >>> 16;
                var41 = arg1.method1843(var49, arg18 - 21);
                var38 = var48 & 0xFFFF;
                if (var41 != null) {
                    var26 |= var41.method3731(var38, 0);
                    var25 |= var41.method3729(var38, (byte) -35);
                    var27 |= var41.method3732((byte) -101, var38);
                }
                if ((arg4.field4989 || class426.field5349) && arg12 != -1 && arg12 < arg4.field4979.length) {
                    int var50 = arg4.field4979[arg12];
                    var40 = arg4.field4991[arg11];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg1.method1843(var51, -106);
                    if (var42 != null) {
                        var26 |= var42.method3731(var39, 0);
                        var25 |= var42.method3729(var39, (byte) -82);
                        var27 |= var42.method3732((byte) -101, var39);
                    }
                }
            }
            var20 = arg2 | 0x20;
            if (arg10 != null) {
                int var52 = arg10.field4979[arg13];
                int var53 = var52 >>> 16;
                var46 = arg1.method1843(var53, 63);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method3731(var43, 0);
                    var25 |= var46.method3729(var43, (byte) -30);
                    var27 |= var46.method3732((byte) -101, var43);
                }
                if ((arg10.field4989 || class426.field5349) && arg9 != -1 && arg9 < arg10.field4979.length) {
                    int var54 = arg10.field4979[arg9];
                    var45 = arg10.field4991[arg13];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg1.method1843(var55, -96);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method3731(var44, 0);
                        var25 |= var47.method3729(var44, (byte) -109);
                        var27 |= var47.method3732((byte) -101, var44);
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
        class450 var56 = class190.field2377;
        class474 var57;
        synchronized (class190.field2377) {
            var57 = (class474) class190.field2377.method2418(var21, (byte) 100);
        }
        class601 var58 = null;
        if (this.field6558 != -1) {
            var58 = arg14.method1900(this.field6558, (byte) 68);
        }
        if (var57 == null || arg15.method998(var57.method764(), var20) != 0 || var58 != null && var58.field8443 != null && this.field6569 == null) {
            if (var57 != null) {
                var20 = arg15.method1018(var20, var57.method764());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((var62 & Integer.MIN_VALUE) != 0 && !arg0.method150((byte) 52, var62 & 0x3FFFFFFF).method1581(true)) {
                        var60 = true;
                    }
                } else if (!arg3.method434(12388, var62 & 0x3FFFFFFF).method30((byte) 85, this.field6572)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field6575 != -1L) {
                    class450 var89 = class190.field2377;
                    synchronized (class190.field2377) {
                        var57 = (class474) class190.field2377.method2418(this.field6575, (byte) 100);
                    }
                }
                if (var57 == null || arg15.method998(var57.method764(), var20) != 0 || var58 != null && var58.field8443 != null && this.field6569 == null) {
                    return null;
                }
            } else {
                class47[] var63 = new class47[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class47 var67 = arg3.method434(12388, var65 & 0x3FFFFFFF).method15(this.field6572, -1);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    } else if ((Integer.MIN_VALUE & var65) != 0) {
                        class47 var66 = arg0.method150((byte) 103, var65 & 0x3FFFFFFF).method1578(-86);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    }
                }
                if (var58 != null && var58.field8443 != null) {
                    for (int var68 = 0; var68 < var58.field8443.length; var68++) {
                        if (var58.field8443[var68] != null && var63[var68] != null) {
                            int var69 = var58.field8443[var68][0];
                            int var70 = var58.field8443[var68][1];
                            int var71 = var58.field8443[var68][2];
                            int var72 = var58.field8443[var68][3] << 3;
                            int var73 = var58.field8443[var68][4] << 3;
                            int var74 = var58.field8443[var68][5] << 3;
                            if (this.field6569 == null) {
                                this.field6569 = new int[var58.field8443.length][];
                            }
                            if (this.field6569[var68] == null) {
                                int[] var75 = this.field6569[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[13] = -var70;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[14] = -var71;
                                    var75[12] = -var69;
                                } else {
                                    int var76 = class453.field5811[var72];
                                    int var77 = class453.field5810[var72];
                                    int var78 = class453.field5811[var73];
                                    int var79 = class453.field5810[var73];
                                    int var80 = class453.field5811[var74];
                                    int var81 = class453.field5810[var74];
                                    int var82 = var77 * var80 + 8192 >> 14;
                                    int var83 = var77 * var81 + 8192 >> 14;
                                    var75[4] = var76 * var80 + 8192 >> 14;
                                    var75[1] = -var81 * var78 + var79 * var82 + 8192 >> 14;
                                    var75[7] = -var79 * -var81 - (-(var78 * var82) - 8192) >> 14;
                                    var75[6] = var78 * var83 + -var79 * var80 + 8192 >> 14;
                                    var75[8] = var76 * var78 + 8192 >> 14;
                                    var75[2] = var76 * var79 + 8192 >> 14;
                                    var75[5] = -var77;
                                    var75[0] = var78 * var80 - (-(var79 * var83) - 8192) >> 14;
                                    var75[3] = var76 * var81 + 8192 >> 14;
                                    var75[13] = var75[7] * -var71 + var75[1] * -var69 - (-(var75[4] * -var70) - 8192) >> 14;
                                    var75[12] = var75[6] * -var71 + var75[3] * -var70 + (var75[0] * -var69 - -8192) >> 14;
                                    var75[14] = var75[8] * -var71 + (var75[2] * -var69 + (var75[5] * -var70)) + 8192 >> 14;
                                }
                                var75[11] = var71;
                                var75[10] = var70;
                                var75[9] = var69;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method295(var72, 19068, var74, var73);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method285(var71, (byte) 113, var69, var70);
                            }
                        }
                    }
                }
                int var84 = var20 | 0x4000;
                class47 var85 = new class47(var63, var63.length);
                var57 = arg15.method1019(var85, var84, class565.field7888, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    for (int var87 = 0; var87 < class8.field161.length; var87++) {
                        if (this.field6566[var86] < class8.field161[var87][var86].length) {
                            var57.method694(class205.field2615[var87][var86], class8.field161[var87][var86][this.field6566[var86]]);
                        }
                    }
                }
                if (arg17) {
                    var57.method761(var20);
                    class450 var88 = class190.field2377;
                    synchronized (class190.field2377) {
                        class190.field2377.method2409(var21, var57, 1);
                    }
                    this.field6575 = var21;
                }
            }
        }
        class474 var90 = var57.method711((byte) 4, var20, true);
        if (!var28) {
            return var90;
        }
        int var91 = 0;
        int var92 = 1;
        while (var29 > var91) {
            if (class642.field9042[var91] != null) {
                var90.method2507((byte) -121, class587.field8255[var91], class122.field1541[var91] - 1, 0, class214.field2652[var91], this.field6569 == null ? null : this.field6569[var91], var92, class286.field3561[var91], false, class199.field2528[var91], class642.field9042[var91]);
            }
            var92 <<= 0x1;
            var91++;
        }
        if (var41 != null && var46 != null) {
            var90.method2509(var42, var38, var47, arg8 - 1, var39, var46, var45, arg4.field4964, arg16 - 1, var40, false, var43, var41, arg18 ^ 0xFFFFFFC5, var44);
        } else if (var41 != null) {
            var90.method2506(false, (byte) -11, var41, var39, var38, var42, arg8 - 1, 0, var40);
        } else if (var46 != null) {
            var90.method2506(false, (byte) -11, var46, var44, var43, var47, arg16 - 1, 0, var45);
        }
        for (int var93 = 0; var93 < var29; var93++) {
            class642.field9042[var93] = null;
            class587.field8255[var93] = null;
            class25.field380[var93] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILhaa;Ldr;ILmf;ILhl;ILlb;Lcn;Lr;)Lda;")
    public final class474 method2683(int arg0, int arg1, class79 arg2, class395 arg3, int arg4, class72 arg5, int arg6, class322 arg7, int arg8, class255 arg9, class21 arg10, class566 arg11) {
        if (arg6 != 768) {
            this.method2677((byte) -68);
        }
        field6571++;
        if (this.field6559 != -1) {
            return arg9.method1490(this.field6559, (byte) -125).method3228(arg2, arg1, (byte) 71, arg3, arg8, arg7, arg0, arg11, arg4);
        }
        int var13 = arg1;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg3.field4979[arg4];
            var13 = arg1 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class662 var25 = arg7.method1843(var23, arg6 - 877);
            if (var25 != null) {
                var15 |= var25.method3731(var24, 0);
                var14 |= var25.method3729(var24, (byte) -84);
                var17 |= var25.method3732((byte) -101, var24);
                var16 |= arg3.field4977;
            }
            if ((arg3.field4989 || class426.field5349) && arg8 != -1 && arg3.field4979.length > arg8) {
                int var26 = arg3.field4979[arg8];
                int var27 = var26 >>> 16;
                class662 var28 = var23 == var27 ? var25 : arg7.method1843(var27, -128);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3731(var29, arg6 - 768);
                    var14 |= var28.method3729(var29, (byte) -90);
                    var17 |= var28.method3732((byte) -101, var29);
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
        class450 var30 = class19.field290;
        class474 var31;
        synchronized (class19.field290) {
            var31 = (class474) class19.field290.method2418(this.field6568, (byte) 100);
        }
        if (var31 == null || arg11.method998(var31.method764(), var13) != 0) {
            if (var31 != null) {
                var13 = arg11.method1018(var13, var31.method764());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6565[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg10.method150((byte) 28, var35 & 0x3FFFFFFF).method1584((byte) -125)) {
                        var33 = true;
                    }
                } else if (!arg5.method434(12388, var35 & 0x3FFFFFFF).method17(this.field6572, (byte) -118)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class47[] var36 = new class47[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6565[var38];
                if ((var39 & 0x40000000) != 0) {
                    class47 var40 = arg5.method434(12388, var39 & 0x3FFFFFFF).method27((byte) -84, this.field6572);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class47 var41 = arg10.method150((byte) 115, var39 & 0x3FFFFFFF).method1582(false);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class47 var43 = new class47(var36, var37);
            var31 = arg11.method1019(var43, var42, class565.field7888, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class8.field161.length; var45++) {
                    if (class8.field161[var45][var44].length > this.field6566[var44]) {
                        var31.method694(class205.field2615[var45][var44], class8.field161[var45][var44][this.field6566[var44]]);
                    }
                }
            }
            var31.method761(var13);
            class450 var46 = class19.field290;
            synchronized (class19.field290) {
                class19.field290.method2409(this.field6568, var31, 1);
            }
        }
        if (arg3 == null) {
            return var31;
        } else {
            var31.method711((byte) 4, var13, true);
            return arg3.method2122(arg4, arg1, (byte) 100, arg0, arg8, var31);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILmf;Z)V")
    public final void method2684(int arg0, int arg1, class72 arg2, boolean arg3) {
        field6562++;
        if (!arg3) {
            this.method2686(-37, -12, null, 63);
        }
        if (arg0 == -1) {
            this.field6565[arg1] = 0;
        } else if (arg2.method434(12388, arg0) != null) {
            this.field6565[arg1] = class444.method2376(arg0, 1073741824);
            this.method2677((byte) -118);
        }
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(ZI)V")
    public final void method2685(boolean arg0, int arg1) {
        field6570++;
        if (arg1 != -23851) {
            this.field6558 = 11;
        }
        this.field6572 = arg0;
        this.method2677((byte) -123);
    }

    @OriginalMember(owner = "client!kn", name = "a", descriptor = "(IILcn;I)V")
    public final void method2686(int arg0, int arg1, class21 arg2, int arg3) {
        field6561++;
        int var5 = class55.field790[arg0];
        if (arg2.method150((byte) 105, arg1) != null) {
            this.field6565[var5] = class444.method2376(arg1, Integer.MIN_VALUE);
            if (arg3 < -11) {
                this.method2677((byte) -109);
            }
        }
    }

    @OriginalMember(owner = "client!kn", name = "b", descriptor = "(III)I")
    public static final int method2687(int arg0, int arg1, int arg2) {
        if (arg1 > arg0) {
            int var3 = arg0;
            arg0 = arg1;
            arg1 = var3;
        }
        int var4 = -44 / ((25 - arg2) / 58);
        field6574++;
        while (arg1 != 0) {
            int var5 = arg0 % arg1;
            arg0 = arg1;
            arg1 = var5;
        }
        return arg0;
    }
}
