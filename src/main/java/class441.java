import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class441 {

    @OriginalMember(owner = "client!go", name = "q", descriptor = "I")
    public int field6526 = -1;

    @OriginalMember(owner = "client!go", name = "f", descriptor = "Lem;")
    public static class150 field6515 = null;

    @OriginalMember(owner = "client!go", name = "g", descriptor = "I")
    public static int field6516 = 0;

    @OriginalMember(owner = "client!go", name = "p", descriptor = "Lar;")
    public static class479 field6525 = new class479();

    @OriginalMember(owner = "client!go", name = "a", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!go", name = "c", descriptor = "I")
    public static int field6512;

    @OriginalMember(owner = "client!go", name = "i", descriptor = "I")
    public static int field6518;

    @OriginalMember(owner = "client!go", name = "j", descriptor = "I")
    public static int field6519;

    @OriginalMember(owner = "client!go", name = "k", descriptor = "I")
    public static int field6520;

    @OriginalMember(owner = "client!go", name = "l", descriptor = "I")
    public static int field6521;

    @OriginalMember(owner = "client!go", name = "m", descriptor = "I")
    public static int field6522;

    @OriginalMember(owner = "client!go", name = "r", descriptor = "I")
    private int field6527;

    @OriginalMember(owner = "client!go", name = "s", descriptor = "I")
    public static int field6528;

    @OriginalMember(owner = "client!go", name = "t", descriptor = "I")
    public static int field6529;

    @OriginalMember(owner = "client!go", name = "u", descriptor = "I")
    public static int field6530;

    @OriginalMember(owner = "client!go", name = "v", descriptor = "I")
    public static int field6531;

    @OriginalMember(owner = "client!go", name = "x", descriptor = "I")
    public static int field6533;

    @OriginalMember(owner = "client!go", name = "y", descriptor = "I")
    public static int field6534;

    @OriginalMember(owner = "client!go", name = "z", descriptor = "I")
    public static int field6535;

    @OriginalMember(owner = "client!go", name = "A", descriptor = "I")
    public static int field6536;

    @OriginalMember(owner = "client!go", name = "d", descriptor = "J")
    private long field6513;

    @OriginalMember(owner = "client!go", name = "n", descriptor = "J")
    private long field6523;

    @OriginalMember(owner = "client!go", name = "e", descriptor = "Z")
    public boolean field6514;

    @OriginalMember(owner = "client!go", name = "b", descriptor = "[I")
    public int[] field6511;

    @OriginalMember(owner = "client!go", name = "o", descriptor = "[I")
    private int[] field6524;

    @OriginalMember(owner = "client!go", name = "w", descriptor = "[Ll;")
    public static class16[] field6532;

    @OriginalMember(owner = "client!go", name = "h", descriptor = "[[I")
    private int[][] field6517;

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lwb;Lan;ZLvf;Lvk;Lya;II[Lpe;ILfd;IILkn;Lvf;Ldb;III)Lt;", line = 5)
    public final class471 method2616(class216 arg0, class20 arg1, boolean arg2, class104 arg3, class248 arg4, class38 arg5, int arg6, int arg7, class431[] arg8, int arg9, class366 arg10, int arg11, int arg12, class519 arg13, class104 arg14, class211 arg15, int arg16, int arg17, int arg18) {
        field6531++;
        if (this.field6526 != -1) {
            return arg10.method2208(this.field6526, -109).method636(arg4, arg17, arg7, arg8, arg15, arg11, arg5, arg16, arg1, arg9, arg18, arg3, (byte) -47, arg6, arg14);
        }
        int var20 = arg16;
        long var21 = this.field6523;
        int[] var23 = this.field6524;
        if (arg14 != null && (arg14.field1578 >= 0 || arg14.field1573 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field6524[var24];
            }
            if (arg14.field1578 >= 0) {
                if (arg14.field1578 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class255.method1532(arg14.field1578, 1073741824);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg14.field1573 >= 0) {
                if (arg14.field1573 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class255.method1532(1073741824, arg14.field1573);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        if (arg12 != 911238472) {
            method2620(-63, 59L);
        }
        boolean var27 = false;
        boolean var28 = arg14 != null || arg3 != null;
        int var29 = arg8 == null ? 0 : arg8.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class147.field2136[var30] = null;
            if (arg8[var30] != null) {
                class104 var31 = arg1.method126(-120, arg8[var30].field6335);
                if (var31.field1551 != null) {
                    class14.field203[var30] = var31;
                    var28 = true;
                    int var32 = arg8[var30].field6331;
                    int var33 = arg8[var30].field6337;
                    int var34 = var31.field1551[var32];
                    class147.field2136[var30] = arg1.method128(var34 >>> 16, -10423);
                    int var35 = var34 & 0xFFFF;
                    class181.field2672[var30] = var35;
                    if (class147.field2136[var30] != null) {
                        var26 |= class147.field2136[var30].method1899(-1, var35);
                        var25 |= class147.field2136[var30].method1900((byte) -87, var35);
                        var27 |= class147.field2136[var30].method1896(var35, (byte) 122);
                    }
                    if ((var31.field1563 || class299.field4102) && var33 != -1 && var33 < var31.field1551.length) {
                        class384.field5600[var30] = var31.field1575[var32];
                        class472.field6890[var30] = arg8[var30].field6330;
                        int var36 = var31.field1551[var33];
                        class463.field6803[var30] = arg1.method128(var36 >>> 16, -10423);
                        int var37 = var36 & 0xFFFF;
                        class197.field2815[var30] = var37;
                        if (class463.field6803[var30] != null) {
                            var26 |= class463.field6803[var30].method1899(arg12 - 911238473, var37);
                            var25 |= class463.field6803[var30].method1900((byte) -87, var37);
                            var27 |= class463.field6803[var30].method1896(var37, (byte) 122);
                        }
                    } else {
                        class384.field5600[var30] = 0;
                        class472.field6890[var30] = 0;
                        class463.field6803[var30] = null;
                        class197.field2815[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class327 var41 = null;
        class327 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class327 var46 = null;
        class327 var47 = null;
        if (var28) {
            var20 = arg16 | 0x20;
            if (arg14 != null) {
                int var48 = arg14.field1551[arg9];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg1.method128(var49, -10423);
                if (var41 != null) {
                    var26 |= var41.method1899(-1, var38);
                    var25 |= var41.method1900((byte) -87, var38);
                    var27 |= var41.method1896(var38, (byte) 122);
                }
                if ((arg14.field1563 || class299.field4102) && arg6 != -1 && arg6 < arg14.field1551.length) {
                    int var50 = arg14.field1551[arg6];
                    var40 = arg14.field1575[arg9];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg1.method128(var51, -10423);
                    if (var42 != null) {
                        var26 |= var42.method1899(-1, var39);
                        var25 |= var42.method1900((byte) -87, var39);
                        var27 |= var42.method1896(var39, (byte) 122);
                    }
                }
            }
            if (arg3 != null) {
                int var52 = arg3.field1551[arg18];
                int var53 = var52 >>> 16;
                var46 = arg1.method128(var53, -10423);
                var43 = var52 & 0xFFFF;
                if (var46 != null) {
                    var26 |= var46.method1899(arg12 ^ 0xC9AF9AB7, var43);
                    var25 |= var46.method1900((byte) -87, var43);
                    var27 |= var46.method1896(var43, (byte) 122);
                }
                if ((arg3.field1563 || class299.field4102) && arg7 != -1 && arg7 < arg3.field1551.length) {
                    var45 = arg3.field1575[arg18];
                    int var54 = arg3.field1551[arg7];
                    int var55 = var54 >>> 16;
                    var47 = var53 == var55 ? var46 : arg1.method128(var55, arg12 ^ 0xC9AFB201);
                    var44 = var54 & 0xFFFF;
                    if (var47 != null) {
                        var26 |= var47.method1899(-1, var44);
                        var25 |= var47.method1900((byte) -87, var44);
                        var27 |= var47.method1896(var44, (byte) 122);
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
        class162 var56 = class528.field7803;
        class471 var57;
        synchronized (class528.field7803) {
            var57 = (class471) class528.field7803.method1073(var21, false);
        }
        class93 var58 = null;
        if (this.field6527 != -1) {
            var58 = arg15.method1305(this.field6527, (byte) -84);
        }
        if (var57 == null || arg5.method257(var57.method372(), var20) != 0 || var58 != null && var58.field1356 != null && this.field6517 == null) {
            if (var57 != null) {
                var20 = arg5.method288(var20, var57.method372());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg0.method1335(94, var62 & 0x3FFFFFFF).method783(-128)) {
                        var60 = true;
                    }
                } else if (!arg13.method3091(101, var62 & 0x3FFFFFFF).method3039(this.field6514, 0)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field6513 != -1L) {
                    class162 var88 = class528.field7803;
                    synchronized (class528.field7803) {
                        var57 = (class471) class528.field7803.method1073(this.field6513, false);
                    }
                }
                if (var57 == null || arg5.method257(var57.method372(), var20) != 0 || var58 != null && var58.field1356 != null && this.field6517 == null) {
                    return null;
                }
            } else {
                class419[] var63 = new class419[12];
                for (int var64 = 0; var64 < 12; var64++) {
                    int var65 = var23[var64];
                    if ((var65 & 0x40000000) != 0) {
                        class419 var66 = arg13.method3091(107, var65 & 0x3FFFFFFF).method3026(this.field6514, 120);
                        if (var66 != null) {
                            var63[var64] = var66;
                        }
                    } else if ((Integer.MIN_VALUE & var65) != 0) {
                        class419 var67 = arg0.method1335(50, var65 & 0x3FFFFFFF).method782(121);
                        if (var67 != null) {
                            var63[var64] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field1356 != null) {
                    for (int var68 = 0; var68 < var58.field1356.length; var68++) {
                        if (var58.field1356[var68] != null && var63[var68] != null) {
                            int var69 = var58.field1356[var68][0];
                            int var70 = var58.field1356[var68][1];
                            int var71 = var58.field1356[var68][2];
                            int var72 = var58.field1356[var68][3] << 3;
                            int var73 = var58.field1356[var68][4] << 3;
                            int var74 = var58.field1356[var68][5] << 3;
                            if (this.field6517 == null) {
                                this.field6517 = new int[var58.field1356.length][];
                            }
                            if (this.field6517[var68] == null) {
                                int[] var75 = this.field6517[var68] = new int[15];
                                if (var72 == 0 && var73 == 0 && var74 == 0) {
                                    var75[13] = -var70;
                                    var75[12] = -var69;
                                    var75[0] = var75[4] = var75[8] = 32768;
                                    var75[14] = -var71;
                                } else {
                                    int var76 = class183.field2678[var72];
                                    int var77 = class183.field2684[var72];
                                    int var78 = class183.field2678[var73];
                                    int var79 = class183.field2684[var73];
                                    int var80 = class183.field2678[var74];
                                    int var81 = class183.field2684[var74];
                                    int var82 = var77 * var80 + 16384 >> 15;
                                    int var83 = var77 * var81 + 16384 >> 15;
                                    var75[2] = var76 * var79 + 16384 >> 15;
                                    var75[7] = -var79 * -var81 + (var78 * var82) + 16384 >> 15;
                                    var75[3] = var76 * var81 + 16384 >> 15;
                                    var75[6] = -var79 * var80 + var78 * var83 + 16384 >> 15;
                                    var75[8] = var76 * var78 + 16384 >> 15;
                                    var75[1] = -var81 * var78 + var79 * var82 + 16384 >> 15;
                                    var75[4] = var76 * var80 + 16384 >> 15;
                                    var75[0] = var78 * var80 + (var79 * var83) + 16384 >> 15;
                                    var75[5] = -var77;
                                    var75[14] = var75[8] * -var71 + var75[5] * -var70 + var75[2] * -var69 + 16384 >> 15;
                                    var75[13] = var75[7] * -var71 + var75[1] * -var69 + var75[4] * -var70 + 16384 >> 15;
                                    var75[12] = var75[6] * -var71 + var75[3] * -var70 + var75[0] * -var69 + 16384 >> 15;
                                }
                                var75[9] = var69;
                                var75[11] = var71;
                                var75[10] = var70;
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var63[var68].method2500(var72, var74, (byte) -71, var73);
                            }
                            if (var69 != 0 || var70 != 0 || var71 != 0) {
                                var63[var68].method2501(var71, 90, var70, var69);
                            }
                        }
                    }
                }
                int var84 = var20 | 0x4000;
                class419 var85 = new class419(var63, var63.length);
                var57 = arg5.method231(var85, var84, class502.field7402, 64, 850);
                for (int var86 = 0; var86 < 5; var86++) {
                    if (this.field6511[var86] < class289.field4010[var86].length) {
                        var57.method408(class21.field288[var86], class289.field4010[var86][this.field6511[var86]]);
                    }
                    if (class484.field7078[var86].length > this.field6511[var86]) {
                        var57.method408(class282.field3865[var86], class484.field7078[var86][this.field6511[var86]]);
                    }
                }
                if (arg2) {
                    var57.method402(var20);
                    class162 var87 = class528.field7803;
                    synchronized (class528.field7803) {
                        class528.field7803.method1072(var21, var57, false);
                    }
                    this.field6513 = var21;
                }
            }
        }
        class471 var89 = var57.method381((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var90 < var29) {
            if (class147.field2136[var90] != null) {
                var89.method2775(class181.field2672[var90], class472.field6890[var90] - 1, class147.field2136[var90], class197.field2815[var90], arg12 ^ 0xC9AFA7E9, class463.field6803[var90], this.field6517 == null ? null : this.field6517[var90], var91, class384.field5600[var90], 0, false);
            }
            var91 <<= 0x1;
            var90++;
        }
        if (var41 != null && var46 != null) {
            var89.method2774(var39, var45, var46, var47, true, var43, var38, arg11 - 1, false, var41, var42, var40, arg17 - 1, arg14.field1558, var44);
        } else if (var41 != null) {
            var89.method2777(var41, var40, false, var38, var42, var39, arg12 ^ 0x36509AB7, arg11 - 1, 0);
        } else if (var46 != null) {
            var89.method2777(var46, var45, false, var43, var47, var44, 65535, arg17 - 1, 0);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class147.field2136[var92] = null;
            class463.field6803[var92] = null;
            class14.field203[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIILwb;)V", line = 514)
    public final void method2617(int arg0, int arg1, int arg2, class216 arg3) {
        field6535++;
        int var5 = class407.field5957[arg1];
        if (this.field6524[var5] == 0) {
            return;
        }
        if (arg0 != 3) {
            this.method2621((byte) 94);
        }
        if (arg3.method1335(108, arg2) != null) {
            this.field6524[var5] = class255.method1532(arg2, Integer.MIN_VALUE);
            this.method2621((byte) 86);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IIIZLvf;II)V", line = 535)
    public static final void method2618(int arg0, int arg1, int arg2, boolean arg3, class104 arg4, int arg5, int arg6) {
        if (arg6 < 64) {
            method2618(32, 30, 62, false, null, -60, -57);
        }
        field6522++;
        if (class228.field3242 >= 50 || arg4 == null || arg4.field1560 == null || arg4.field1560.length <= arg5 || arg4.field1560[arg5] == null) {
            return;
        }
        int var7 = arg4.field1560[arg5][0];
        int var8 = var7 >> 8;
        int var9 = (var7 & 0xF0) >> 5;
        int var10 = var7 & 0x1F;
        if (arg4.field1560[arg5].length > 1) {
            int var11 = (int) (Math.random() * (double) arg4.field1560[arg5].length);
            if (var11 > 0) {
                var8 = arg4.field1560[arg5][var11];
            }
        }
        if (var10 == 0) {
            if (arg3) {
                class506.method3019(-124, var8, var9, 0, 255);
            }
        } else if (class20.field269.field7640 != 0) {
            int var12 = arg0 - 64 >> 7;
            int var13 = arg1 - 64 >> 7;
            class275.field3767[class228.field3242++] = new class233((byte) 1, var8, var9, 0, 255, (arg2 << 24) + (var12 << 16) + ((var13 << 8) - -var10));
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Lvf;Lfd;Lvk;Lya;IILkn;BLwb;ILan;I)Lt;", line = 591)
    public final class471 method2619(class104 arg0, class366 arg1, class248 arg2, class38 arg3, int arg4, int arg5, class519 arg6, byte arg7, class216 arg8, int arg9, class20 arg10, int arg11) {
        field6510++;
        if (this.field6526 != -1) {
            return arg1.method2208(this.field6526, -79).method640(-1, arg11, arg0, arg2, arg3, arg10, arg9, arg4, arg5);
        }
        if (arg7 > -102) {
            this.field6511 = null;
        }
        int var13 = arg11;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field1551[arg9];
            var13 = arg11 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            class327 var24 = arg10.method128(var23, -10423);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method1899(-1, var25);
                var14 |= var24.method1900((byte) -87, var25);
                var17 |= var24.method1896(var25, (byte) 122);
                var16 |= arg0.field1548;
            }
            if ((arg0.field1563 || class299.field4102) && arg5 != -1 && arg0.field1551.length > arg5) {
                int var26 = arg0.field1551[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class327 var29 = var23 == var27 ? var24 : arg10.method128(var27, -10423);
                if (var29 != null) {
                    var15 |= var29.method1899(-1, var28);
                    var14 |= var29.method1900((byte) -87, var28);
                    var17 |= var29.method1896(var28, (byte) 122);
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
        class162 var30 = class345.field4953;
        class471 var31;
        synchronized (class345.field4953) {
            var31 = (class471) class345.field4953.method1073(this.field6523, false);
        }
        if (var31 == null || arg3.method257(var31.method372(), var13) != 0) {
            if (var31 != null) {
                var13 = arg3.method288(var13, var31.method372());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field6524[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((var35 & Integer.MIN_VALUE) != 0 && !arg8.method1335(-105, var35 & 0x3FFFFFFF).method785(true)) {
                        var33 = true;
                    }
                } else if (!arg6.method3091(88, var35 & 0x3FFFFFFF).method3035(this.field6514, (byte) 83)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class419[] var36 = new class419[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field6524[var38];
                if ((var39 & 0x40000000) != 0) {
                    class419 var41 = arg6.method3091(98, var39 & 0x3FFFFFFF).method3036((byte) -66, this.field6514);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class419 var40 = arg8.method1335(105, var39 & 0x3FFFFFFF).method786((byte) -84);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                }
            }
            class419 var42 = new class419(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg3.method231(var42, var43, class502.field7402, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (this.field6511[var44] < class289.field4010[var44].length) {
                    var31.method408(class21.field288[var44], class289.field4010[var44][this.field6511[var44]]);
                }
                if (this.field6511[var44] < class484.field7078[var44].length) {
                    var31.method408(class282.field3865[var44], class484.field7078[var44][this.field6511[var44]]);
                }
            }
            var31.method402(var13);
            class162 var45 = class345.field4953;
            synchronized (class345.field4953) {
                class345.field4953.method1072(this.field6523, var31, false);
            }
        }
        if (arg0 == null) {
            return var31;
        } else {
            var31.method381((byte) 4, var13, true);
            return arg0.method764(var31, arg11, (byte) 32, arg4, arg5, arg9);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IJ)V", line = 786)
    public static final void method2620(int arg0, long arg1) {
        try {
            Thread.sleep(arg1);
            int var3 = 63 / ((arg0 + 41) / 55);
        } catch (InterruptedException var4) {
        }
        field6533++;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(B)V", line = 800)
    private final void method2621(byte arg0) {
        field6530++;
        long[] var2 = class272.field3753;
        this.field6523 = -1L;
        this.field6523 = var2[(int) (((long) (this.field6527 >> 8) ^ this.field6523) & 0xFFL)] ^ this.field6523 >>> 8;
        this.field6523 = var2[(int) ((this.field6523 ^ (long) this.field6527) & 0xFFL)] ^ this.field6523 >>> 8;
        int var3 = 0;
        if (arg0 <= 5) {
            this.field6524 = null;
        }
        while (var3 < 12) {
            this.field6523 = var2[(int) ((this.field6523 ^ (long) (this.field6524[var3] >> 24)) & 0xFFL)] ^ this.field6523 >>> 8;
            this.field6523 = this.field6523 >>> 8 ^ var2[(int) ((this.field6523 ^ (long) (this.field6524[var3] >> 16)) & 0xFFL)];
            this.field6523 = this.field6523 >>> 8 ^ var2[(int) (((long) (this.field6524[var3] >> 8) ^ this.field6523) & 0xFFL)];
            this.field6523 = this.field6523 >>> 8 ^ var2[(int) (((long) this.field6524[var3] ^ this.field6523) & 0xFFL)];
            var3++;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field6523 = this.field6523 >>> 8 ^ var2[(int) (((long) this.field6511[var4] ^ this.field6523) & 0xFFL)];
        }
        this.field6523 = this.field6523 >>> 8 ^ var2[(int) (((long) (this.field6514 ? 1 : 0) ^ this.field6523) & 0xFFL)];
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(II)V", line = 837)
    public static final void method2622(int arg0, int arg1) {
        field6512++;
        if (arg1 != -201) {
            field6532 = null;
        }
        if (class256.method1534(32554, arg0)) {
            class84.method659(false, class495.field7226[arg0], -1);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZLvc;)V", line = 854)
    public static final void method2623(boolean arg0, class207 arg1) {
        field6520++;
        if (!arg0) {
            return;
        }
        arg1.method1278(0);
        int var2 = class152.field2335;
        class438 var3 = class316.field4324 = class12.field182[var2] = new class438();
        var3.field1035 = var2;
        int var4 = arg1.method1282(-26364, 30);
        byte var5 = (byte) (var4 >> 28);
        int var6 = var4 >> 14 & 0x3FFF;
        int var7 = var4 & 0x3FFF;
        var3.field1127[0] = var6 - class510.field7566;
        var3.field1732 = (var3.field1127[0] << 7) + (var3.method626((byte) 120) << 6);
        var3.field1117[0] = var7 - class14.field204;
        var3.field1735 = (var3.field1117[0] << 7) + (var3.method626((byte) 120) << 6);
        class436.field6379 = var3.field1738 = var5;
        if (class149.field2152[var2] != null) {
            var3.method2580(class149.field2152[var2], -1);
        }
        class375.field5498 = 0;
        class397.field5793[class375.field5498++] = var2;
        class320.field4375[var2] = 0;
        class266.field3679 = 0;
        for (int var8 = 1; var8 < 2048; var8++) {
            if (var2 != var8) {
                int var9 = arg1.method1282(-26364, 18);
                int var10 = var9 >> 16;
                int var11 = (var9 & 0xFFE5) >> 8;
                int var12 = var9 & 0xFF;
                class186 var13 = class455.field6688[var8] = new class186();
                var13.field2699 = -1;
                var13.field2705 = 0;
                var13.field2697 = (var11 << 14) + ((var10 << 28) + var12);
                var13.field2701 = false;
                class434.field6364[class266.field3679++] = var8;
                class320.field4375[var8] = 0;
            }
        }
        arg1.method1276(119);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IBZI)I", line = 927)
    public static final int method2624(int arg0, byte arg1, boolean arg2, int arg3) {
        field6519++;
        if (arg1 >= -80) {
            field6515 = null;
        }
        class128 var4 = class507.method3024(arg3, arg2, Integer.MIN_VALUE);
        if (var4 == null) {
            return 0;
        } else if (arg0 >= 0 && arg0 < var4.field1902.length) {
            return var4.field1902[arg0];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(Z)Ltt;", line = 950)
    public static final class61 method2625(boolean arg0) {
        class33.field445 = 0;
        field6521++;
        if (!arg0) {
            method2625(true);
        }
        return class420.method2502(1407);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I[IZI[IZ)V", line = 964)
    public final void method2626(int arg0, int[] arg1, boolean arg2, int arg3, int[] arg4, boolean arg5) {
        if (arg2) {
            this.field6523 = -2L;
        }
        if (this.field6527 != arg3) {
            this.field6527 = arg3;
            this.field6517 = null;
        }
        this.field6526 = arg0;
        this.field6524 = arg4;
        this.field6514 = arg5;
        field6528++;
        this.field6511 = arg1;
        this.method2621((byte) 14);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(IILvf;ILan;ILya;ILwb;III)Lt;", line = 987)
    public final class471 method2627(int arg0, int arg1, class104 arg2, int arg3, class20 arg4, int arg5, class38 arg6, int arg7, class216 arg8, int arg9, int arg10, int arg11) {
        field6529++;
        int var13 = arg0;
        if (arg2 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            var13 = arg0 | 0x20;
            int var21 = arg2.field1551[arg3];
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class327 var25 = arg4.method128(var23, -10423);
            if (var25 != null) {
                var15 |= var25.method1899(-1, var24);
                var14 |= var25.method1900((byte) -87, var24);
                var17 |= var25.method1896(var24, (byte) 122);
                var16 |= arg2.field1548;
            }
            if ((arg2.field1563 || class299.field4102) && arg10 != -1 && arg10 < arg2.field1551.length) {
                int var26 = arg2.field1551[arg10];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class327 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg4.method128(var28 >>> 16, -10423);
                }
                if (var29 != null) {
                    var15 |= var29.method1899(-1, var28);
                    var14 |= var29.method1900((byte) -87, var28);
                    var17 |= var29.method1896(var28, (byte) 122);
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
        long var30 = (long) arg9 | (long) arg5 << 32 | (long) (arg1 << 16);
        if (arg11 != -13267) {
            this.field6524 = null;
        }
        class162 var32 = class345.field4953;
        class471 var33;
        synchronized (class345.field4953) {
            var33 = (class471) class345.field4953.method1073(var30, false);
        }
        if (var33 == null || arg6.method257(var33.method372(), var13) != 0) {
            if (var33 != null) {
                var13 = arg6.method288(var13, var33.method372());
            }
            class419[] var35 = new class419[3];
            int var36 = 0;
            if (!arg8.method1335(119, arg9).method785(true) || !arg8.method1335(64, arg1).method785(true) || !arg8.method1335(arg11 ^ 0xFFFFCC7F, arg5).method785(true)) {
                return null;
            }
            class419 var37 = arg8.method1335(84, arg9).method786((byte) -93);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class419 var38 = arg8.method1335(58, arg1).method786((byte) -96);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class419 var39 = arg8.method1335(-103, arg5).method786((byte) -125);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class419 var40 = new class419(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg6.method231(var40, var41, class502.field7402, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (this.field6511[var42] < class289.field4010[var42].length) {
                    var33.method408(class21.field288[var42], class289.field4010[var42][this.field6511[var42]]);
                }
                if (this.field6511[var42] < class484.field7078[var42].length) {
                    var33.method408(class282.field3865[var42], class484.field7078[var42][this.field6511[var42]]);
                }
            }
            var33.method402(var13);
            class162 var43 = class345.field4953;
            synchronized (class345.field4953) {
                class345.field4953.method1072(var30, var33, false);
            }
        }
        if (arg2 == null) {
            return var33;
        } else {
            class471 var44 = var33.method381((byte) 4, var13, true);
            return arg2.method764(var44, arg0, (byte) 80, arg7, arg10, arg3);
        }
    }

    @OriginalMember(owner = "client!go", name = "b", descriptor = "(B)V", line = 1141)
    public static void method2628(byte arg0) {
        field6525 = null;
        int var1 = 65 / ((52 - arg0) / 53);
        field6515 = null;
        field6532 = null;
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZI)V", line = 1153)
    public final void method2629(boolean arg0, int arg1) {
        field6536++;
        this.field6514 = arg0;
        if (arg1 >= -100) {
            this.field6517 = null;
        }
        this.method2621((byte) 125);
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(ZII)V", line = 1180)
    public final void method2630(boolean arg0, int arg1, int arg2) {
        this.field6511[arg1] = arg2;
        field6534++;
        this.method2621((byte) 117);
        if (arg0) {
            method2624(61, (byte) -11, true, -24);
        }
    }

    @OriginalMember(owner = "client!go", name = "a", descriptor = "(I)Z", line = 1192)
    public static final boolean method2631(int arg0) throws IOException {
        field6518++;
        if (class33.field438 == null) {
            return false;
        }
        int var1 = class33.field438.method2842(0);
        if (var1 == 0) {
            return false;
        }
        if (class469.field6850 == null) {
            if (class133.field1940) {
                var1--;
                class33.field438.method2833(0, class179.field2631.field5678, 1, (byte) -119);
                class133.field1940 = false;
                class397.field5794++;
            }
            class179.field2631.field5719 = 0;
            if (class179.field2631.method1277(-126)) {
                if (var1 == 0) {
                    return false;
                }
                var1--;
                class33.field438.method2833(1, class179.field2631.field5678, 1, (byte) -127);
                class397.field5794++;
            }
            class133.field1940 = true;
            class270[] var2 = class230.method1422((byte) -91);
            int var3 = class179.field2631.method1287((byte) 102);
            if (var3 < 0 || var3 >= var2.length) {
                throw new IOException("invo:" + var3 + " ip:" + class179.field2631.field5719);
            }
            class469.field6850 = var2[var3];
            class422.field6187 = class469.field6850.field3724;
        }
        if (class422.field6187 == -1) {
            if (var1 <= 0) {
                return false;
            }
            class33.field438.method2833(0, class179.field2631.field5678, 1, (byte) -128);
            var1--;
            class422.field6187 = class179.field2631.field5678[0] & 0xFF;
            class397.field5794++;
        }
        if (class422.field6187 == -2) {
            if (var1 <= 1) {
                return false;
            }
            class33.field438.method2833(0, class179.field2631.field5678, 2, (byte) -127);
            class179.field2631.field5719 = 0;
            class422.field6187 = class179.field2631.method2353((byte) 65);
            var1 -= 2;
            class397.field5794 += 2;
        }
        if (var1 < class422.field6187) {
            return false;
        }
        class179.field2631.field5719 = 0;
        if (arg0 < 25) {
            method2623(false, null);
        }
        class33.field438.method2833(0, class179.field2631.field5678, class422.field6187, (byte) -123);
        class521.field7731 = class455.field6681;
        class82.field1239 = 0;
        class397.field5794 += class422.field6187;
        class455.field6681 = class448.field6607;
        class448.field6607 = class469.field6850;
        if (class469.field6850 == class225.field3204) {
            class370.method2223(true, 115);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class461.field6773) {
            class149.method993(class315.field4320, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class446.field6577) {
            int var4 = class179.field2631.method2317(0);
            int var5 = class179.field2631.method2321(false);
            int var6 = class179.field2631.method2345(2);
            int var7 = class179.field2631.method2313(255);
            if (class53.method457(var7, 0)) {
                class295 var8 = (class295) class212.field2960.method1492((long) var5, 6340);
                if (var8 != null) {
                    class51.method447(var8, true, var8.field4055 != var6, false);
                }
                class486.method2859(var4, 17328, false, var6, var5);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class218.field3042) {
            boolean var9 = class179.field2631.method2348(-2) == 1;
            String var10 = class179.field2631.method2347((byte) 118);
            String var11 = var10;
            if (var9) {
                var11 = class179.field2631.method2347((byte) -74);
            }
            int var12 = class179.field2631.method2348(-2);
            int var13 = class179.field2631.method2353((byte) 113);
            boolean var14 = false;
            if (var12 <= 1 && class129.method888(false, var11)) {
                var14 = true;
            }
            if (!var14 && class45.field539 == 0) {
                String var15 = class224.field3195.method1560(var13, -2621).method2175(class179.field2631, (byte) -76);
                if (var12 == 2) {
                    class424.method2519(var13, "<img=1>" + var11, 25, 0, "<img=1>" + var10, 47, null, var15);
                } else if (var12 == 1) {
                    class424.method2519(var13, "<img=0>" + var11, 25, 0, "<img=0>" + var10, 73, null, var15);
                } else {
                    class424.method2519(var13, var11, 25, 0, var10, -15, null, var15);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class236.field3346) {
            int var16 = class179.field2631.method2313(255);
            int var17 = class179.field2631.method2345(2);
            int var18 = class179.field2631.method2325(-127);
            int var19 = class179.field2631.method2345(2);
            if (class53.method457(var16, 0)) {
                class12.method58(10595, (var19 << 16) + var17, var18);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class323.field4398) {
            class422.field6183 = class483.field7062;
            if (class422.field6187 == 0) {
                class290.field4026 = null;
                class346.field4958 = null;
                class469.field6850 = null;
                class509.field7562 = null;
                class465.field6831 = 0;
                return true;
            }
            class509.field7562 = class179.field2631.method2347((byte) -47);
            boolean var20 = class179.field2631.method2348(-2) == 1;
            if (var20) {
                class179.field2631.method2347((byte) 95);
            }
            long var21 = class179.field2631.method2306((byte) -127);
            class346.field4958 = class344.method2043((byte) 72, var21);
            class256.field3556 = class179.field2631.method2337(-1);
            int var23 = class179.field2631.method2348(-2);
            if (var23 == 255) {
                class469.field6850 = null;
                return true;
            }
            class465.field6831 = var23;
            class92[] var24 = new class92[100];
            for (int var25 = 0; var25 < class465.field6831; var25++) {
                var24[var25] = new class92();
                var24[var25].field1324 = class179.field2631.method2347((byte) -62);
                boolean var31 = class179.field2631.method2348(-2) == 1;
                if (var31) {
                    var24[var25].field1323 = class179.field2631.method2347((byte) 102);
                } else {
                    var24[var25].field1323 = var24[var25].field1324;
                }
                var24[var25].field1319 = class525.method3124(false, var24[var25].field1323);
                var24[var25].field1320 = class179.field2631.method2353((byte) 85);
                var24[var25].field1317 = class179.field2631.method2337(-1);
                var24[var25].field1321 = class179.field2631.method2347((byte) 100);
                if (var24[var25].field1323.equals(class316.field4324.field6421)) {
                    class279.field3819 = var24[var25].field1317;
                }
            }
            boolean var26 = false;
            int var27 = class465.field6831;
            while (var27 > 0) {
                var27--;
                boolean var28 = true;
                for (int var29 = 0; var29 < var27; var29++) {
                    if (var24[var29].field1319.compareTo(var24[var29 + 1].field1319) > 0) {
                        class92 var30 = var24[var29];
                        var24[var29] = var24[var29 + 1];
                        var28 = false;
                        var24[var29 + 1] = var30;
                    }
                }
                if (var28) {
                    break;
                }
            }
            class290.field4026 = var24;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class222.field3165) {
            int var32 = class179.field2631.method2305(-125);
            int var33 = class179.field2631.method2321(false);
            int var34 = class179.field2631.method2313(255);
            if (class53.method457(var34, 0)) {
                class341.method2026(var32, var33, false);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class113.field1693) {
            class389.method2296((byte) 92);
            class469.field6850 = null;
            return false;
        } else if (class469.field6850 == class431.field6334) {
            class197.field2813 = class179.field2631.method2348(-2);
            class469.field6850 = null;
            class251.field3469 = class483.field7062;
            return true;
        } else if (class490.field7164 == class469.field6850) {
            class149.method993(class349.field5093, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class434.field6362) {
            int var35 = class179.field2631.method2361((byte) -56);
            class167.field2511 = class202.field2840.method2949((byte) 28, var35);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class446.field6575) {
            class149.method993(class403.field5922, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class204.field2868) {
            class179.field2631.field5719 += 28;
            if (class179.field2631.method2344(65280)) {
                class84.method658(class179.field2631, class179.field2631.field5719 - 28, (byte) -122);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class118.field1756) {
            class149.method993(class53.field646, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class146.field2079) {
            int var36 = class179.field2631.method2346((byte) 43);
            int var37 = class179.field2631.method2317(0);
            class421.field6166.method927(var37, var36, false);
            class469.field6850 = null;
            return true;
        } else if (class59.field714 == class469.field6850) {
            for (int var38 = 0; var38 < class12.field182.length; var38++) {
                if (class12.field182[var38] != null) {
                    class12.field182[var38].field1064 = -1;
                }
            }
            for (int var39 = 0; var39 < class378.field5533.length; var39++) {
                if (class378.field5533[var39] != null) {
                    class378.field5533[var39].field1064 = -1;
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class65.field886 == class469.field6850) {
            int var40 = class179.field2631.method2353((byte) 95);
            String var41 = class179.field2631.method2347((byte) -102);
            Object[] var42 = new Object[var41.length() + 1];
            for (int var43 = var41.length() - 1; var43 >= 0; var43--) {
                if (var41.charAt(var43) == 's') {
                    var42[var43 + 1] = class179.field2631.method2347((byte) -53);
                } else {
                    var42[var43 + 1] = Integer.valueOf(class179.field2631.method2361((byte) -56));
                }
            }
            var42[0] = Integer.valueOf(class179.field2631.method2361((byte) -56));
            if (class53.method457(var40, 0)) {
                class437 var44 = new class437();
                var44.field6389 = var42;
                class429.method2537(var44);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class416.field6050) {
            int var45 = class179.field2631.method2325(-128);
            int var46 = class179.field2631.method2345(2);
            class421.field6166.method927(var45, var46, false);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class314.field4293) {
            int var47 = class179.field2631.method2353((byte) 80);
            if (class53.method457(var47, 0)) {
                class374.method2239((byte) -101);
            }
            class469.field6850 = null;
            return true;
        } else if (class489.field7138 == class469.field6850) {
            int var48 = class179.field2631.method2305(-107);
            int var49 = var48 >> 2;
            int var50 = var48 & 0x3;
            int var51 = class258.field3594[var49];
            int var52 = class179.field2631.method2358(101);
            int var53 = (var52 & 0x371C02F0) >> 28;
            int var54 = var52 >> 14 & 0x3FFF;
            int var55 = var52 & 0x3FFF;
            int var56 = class179.field2631.method2346((byte) 43);
            if (var56 == 65535) {
                var56 = -1;
            }
            int var57 = var55 - class14.field204;
            int var58 = var54 - class510.field7566;
            class227.method1410(var49, var56, var50, true, var58, var57, var51, var53);
            class469.field6850 = null;
            return true;
        } else if (class506.field7458 == class469.field6850) {
            int var59 = class179.field2631.method2353((byte) 102);
            int var60 = class179.field2631.method2361((byte) -56);
            int var61 = class179.field2631.method2340((byte) 0);
            if (class53.method457(var59, 0)) {
                class500.method2935(var61, (byte) 60, var60);
            }
            class469.field6850 = null;
            return true;
        } else if (class61.field761 == class469.field6850) {
            class341.field4919 = class179.field2631.method2317(0);
            class508.field7553 = class179.field2631.method2348(-2);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class240.field3368) {
            int var62 = class179.field2631.method2348(-2);
            int var63 = var62 >> 5;
            int var64 = var62 & 0x1F;
            if (var64 == 0) {
                class218.field3046[var63] = null;
                class469.field6850 = null;
                return true;
            }
            class371 var65 = new class371();
            var65.field5433 = var64;
            var65.field5435 = class179.field2631.method2348(-2);
            if (var65.field5435 >= 0 && class528.field7802.length > var65.field5435) {
                if (var65.field5433 == 1 || var65.field5433 == 10) {
                    var65.field5428 = class179.field2631.method2353((byte) 100);
                    class179.field2631.field5719 += 6;
                } else if (var65.field5433 >= 2 && var65.field5433 <= 6) {
                    if (var65.field5433 == 2) {
                        var65.field5422 = 64;
                        var65.field5423 = 64;
                    }
                    if (var65.field5433 == 3) {
                        var65.field5423 = 0;
                        var65.field5422 = 64;
                    }
                    if (var65.field5433 == 4) {
                        var65.field5423 = 128;
                        var65.field5422 = 64;
                    }
                    if (var65.field5433 == 5) {
                        var65.field5422 = 0;
                        var65.field5423 = 64;
                    }
                    if (var65.field5433 == 6) {
                        var65.field5422 = 128;
                        var65.field5423 = 64;
                    }
                    var65.field5433 = 2;
                    var65.field5425 = class179.field2631.method2348(-2);
                    var65.field5423 += class179.field2631.method2353((byte) 104) - class510.field7566 << 7;
                    var65.field5422 += class179.field2631.method2353((byte) 79) - class14.field204 << 7;
                    var65.field5424 = class179.field2631.method2348(-2);
                    var65.field5430 = class179.field2631.method2353((byte) 67);
                }
                var65.field5431 = class179.field2631.method2353((byte) 122);
                if (var65.field5431 == 65535) {
                    var65.field5431 = -1;
                }
                class218.field3046[var63] = var65;
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class126.field1875) {
            boolean var66 = class179.field2631.method2348(-2) == 1;
            String var67 = class179.field2631.method2347((byte) 84);
            String var68 = var67;
            if (var66) {
                var68 = class179.field2631.method2347((byte) -126);
            }
            long var69 = class179.field2631.method2306((byte) -125);
            long var71 = (long) class179.field2631.method2353((byte) 91);
            long var73 = (long) class179.field2631.method2338(true);
            int var75 = class179.field2631.method2348(-2);
            int var76 = class179.field2631.method2353((byte) 86);
            long var77 = (var71 << 32) + var73;
            boolean var79 = false;
            int var80 = 0;
            while (true) {
                if (var80 >= 100) {
                    if (var75 <= 1 && class129.method888(false, var68)) {
                        var79 = true;
                    }
                    break;
                }
                if (class421.field6164[var80] == var77) {
                    var79 = true;
                    break;
                }
                var80++;
            }
            if (!var79 && class45.field539 == 0) {
                class421.field6164[class185.field2691] = var77;
                class185.field2691 = (class185.field2691 + 1) % 100;
                String var81 = class224.field3195.method1560(var76, -2621).method2175(class179.field2631, (byte) -76);
                if (var75 == 2) {
                    class424.method2519(var76, "<img=1>" + var68, 20, 0, "<img=1>" + var67, -113, class374.method2235(var69, (byte) 112), var81);
                } else if (var75 == 1) {
                    class424.method2519(var76, "<img=0>" + var68, 20, 0, "<img=0>" + var67, -108, class374.method2235(var69, (byte) 112), var81);
                } else {
                    class424.method2519(var76, var68, 20, 0, var67, -106, class374.method2235(var69, (byte) 112), var81);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class323.field4399) {
            class149.method993(class439.field6491, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class6.field110 == class469.field6850) {
            class421.field6166.method929(true);
            class255.field3548 += 32;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class419.field6105) {
            int var82 = class179.field2631.method2353((byte) 104);
            int var83 = class179.field2631.method2348(-2);
            int var84 = class179.field2631.method2348(-2);
            int var85 = class179.field2631.method2353((byte) 122) << 0;
            int var86 = class179.field2631.method2348(-2);
            int var87 = class179.field2631.method2348(-2);
            if (class53.method457(var82, 0)) {
                class268.method1604((byte) 125, var83, var87, var85, var86, var84);
            }
            class469.field6850 = null;
            return true;
        } else if (class473.field6904 == class469.field6850) {
            int var88 = class179.field2631.method2353((byte) 81);
            int var89 = class179.field2631.method2353((byte) 78);
            int var90 = class179.field2631.method2353((byte) 112);
            int var91 = class179.field2631.method2353((byte) 94);
            if (class53.method457(var88, 0) && class495.field7226[var89] != null) {
                for (int var92 = var90; var92 < var91; var92++) {
                    int var93 = class179.field2631.method2338(true);
                    if (class495.field7226[var89].length > var92 && class495.field7226[var89][var92] != null) {
                        class495.field7226[var89][var92].field2269 = var93;
                    }
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class20.field268) {
            int var94 = class179.field2631.method2353((byte) 84);
            int var95 = class179.field2631.method2305(-113);
            int var96 = class179.field2631.method2345(2);
            class502 var97 = class378.field5533[var94];
            if (var97 != null) {
                class110.method799(var97, var95, (byte) -113, var96);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class136.field1957) {
            class393.field5742 = class179.field2631.method2324(13486) << 3;
            class521.field7730 = class179.field2631.method2305(-114);
            class511.field7576 = class179.field2631.method2324(13486) << 3;
            for (class135 var98 = (class135) class36.field457.method1494(0); var98 != null; var98 = (class135) class36.field457.method1493((byte) 117)) {
                int var100 = (int) (var98.field3615 & 0x3FFFL);
                int var101 = (int) (var98.field3615 >> 14 & 0x3FFFL);
                int var102 = (int) (var98.field3615 >> 28 & 0x3L);
                if (class521.field7730 == var102 && class393.field5742 <= var100 && class393.field5742 + 8 > var100 && var101 >= class511.field7576 && var101 < (class511.field7576 + 8)) {
                    var98.method1565(0);
                    class224.method1392((byte) -50, class521.field7730, var101, var100);
                }
            }
            for (class12 var99 = (class12) class438.field6435.method2818((byte) -31); var99 != null; var99 = (class12) class438.field6435.method2820((byte) -58)) {
                if (class393.field5742 <= var99.field190 && (class393.field5742 + 8) > var99.field190 && var99.field191 >= class511.field7576 && var99.field191 < class511.field7576 + 8 && class521.field7730 == var99.field189) {
                    var99.field188 = 0;
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class26.field346) {
            class149.method993(class409.field5972, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class122.field1829) {
            int var103 = class179.field2631.method2313(255);
            int var104 = class179.field2631.method2345(2);
            if (var104 == 65535) {
                var104 = -1;
            }
            int var105 = class179.field2631.method2321(false);
            if (class53.method457(var103, 0)) {
                class200.method1250(var105, -1, var104, true, 2);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class418.field6059) {
            class521.field7730 = class179.field2631.method2352((byte) 8);
            class393.field5742 = class179.field2631.method2350((byte) -73) << 3;
            class511.field7576 = class179.field2631.method2324(13486) << 3;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class397.field5790) {
            String var106 = class179.field2631.method2347((byte) 125);
            boolean var107 = class179.field2631.method2348(-2) == 1;
            String var108;
            if (var107) {
                var108 = class179.field2631.method2347((byte) -49);
            } else {
                var108 = var106;
            }
            int var109 = class179.field2631.method2353((byte) 105);
            byte var110 = class179.field2631.method2337(-1);
            boolean var111 = false;
            if (var110 == -128) {
                var111 = true;
            }
            if (var111) {
                if (class465.field6831 == 0) {
                    class469.field6850 = null;
                    return true;
                }
                boolean var112 = false;
                int var113;
                for (var113 = 0; var113 < class465.field6831 && (!class290.field4026[var113].field1323.equals(var108) || class290.field4026[var113].field1320 != var109); var113++) {
                }
                if (class465.field6831 > var113) {
                    while (class465.field6831 - 1 > var113) {
                        class290.field4026[var113] = class290.field4026[var113 + 1];
                        var113++;
                    }
                    class465.field6831--;
                    class290.field4026[class465.field6831] = null;
                }
            } else {
                String var114 = class179.field2631.method2347((byte) 56);
                class92 var115 = new class92();
                var115.field1323 = var108;
                var115.field1324 = var106;
                var115.field1319 = class525.method3124(false, var115.field1323);
                var115.field1317 = var110;
                var115.field1320 = var109;
                var115.field1321 = var114;
                int var116;
                for (var116 = class465.field6831 - 1; var116 >= 0; var116--) {
                    int var117 = class290.field4026[var116].field1319.compareTo(var115.field1319);
                    if (var117 == 0) {
                        class290.field4026[var116].field1320 = var109;
                        class290.field4026[var116].field1317 = var110;
                        class290.field4026[var116].field1321 = var114;
                        if (var108.equals(class316.field4324.field6421)) {
                            class279.field3819 = var110;
                        }
                        class422.field6183 = class483.field7062;
                        class469.field6850 = null;
                        return true;
                    }
                    if (var117 < 0) {
                        break;
                    }
                }
                if (class290.field4026.length <= class465.field6831) {
                    class469.field6850 = null;
                    return true;
                }
                for (int var118 = class465.field6831 - 1; var118 > var116; var118--) {
                    class290.field4026[var118 + 1] = class290.field4026[var118];
                }
                if (class465.field6831 == 0) {
                    class290.field4026 = new class92[100];
                }
                class290.field4026[var116 + 1] = var115;
                class465.field6831++;
                if (var108.equals(class316.field4324.field6421)) {
                    class279.field3819 = var110;
                }
            }
            class422.field6183 = class483.field7062;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class372.field5442) {
            int var119 = class179.field2631.method2313(255);
            int var120 = class179.field2631.method2345(2);
            int var121 = class179.field2631.method2361((byte) -56);
            if (class53.method457(var119, 0)) {
                class340.method2023(var121, 14, var120);
            }
            class469.field6850 = null;
            return true;
        } else if (class65.field897 == class469.field6850) {
            int var122 = class179.field2631.method2313(255);
            int var123 = class179.field2631.method2353((byte) 80);
            int var124 = class179.field2631.method2317(0);
            if (class53.method457(var123, 0)) {
                if (var124 == 2) {
                    class218.method1354(true);
                }
                class188.field2723 = var122;
                class259.method1563(0, var122);
                class210.method1298(-107, false);
                class429.method2548(class188.field2723);
                for (int var125 = 0; var125 < 100; var125++) {
                    class463.field6801[var125] = true;
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class129.field1910) {
            while (class422.field6187 > class179.field2631.field5719) {
                boolean var136 = class179.field2631.method2348(-2) == 1;
                String var137 = class179.field2631.method2347((byte) 73);
                String var138 = class179.field2631.method2347((byte) 118);
                int var139 = class179.field2631.method2353((byte) 114);
                int var140 = class179.field2631.method2348(-2);
                String var141 = "";
                boolean var142 = false;
                if (var139 > 0) {
                    var141 = class179.field2631.method2347((byte) 46);
                    var142 = class179.field2631.method2348(-2) == 1;
                }
                for (int var143 = 0; var143 < class174.field2588; var143++) {
                    if (var136) {
                        if (var138.equals(class258.field3597[var143])) {
                            class258.field3597[var143] = var137;
                            var137 = null;
                            class473.field6913[var143] = var138;
                            break;
                        }
                    } else if (var137.equals(class258.field3597[var143])) {
                        if (class434.field6365[var143] != var139) {
                            class434.field6365[var143] = var139;
                            if (var139 > 0) {
                                class310.method1795(5, 0, "", "", 12406, var137 + class13.field198.method2731(62, class372.field5455));
                            }
                            if (var139 == 0) {
                                class310.method1795(5, 0, "", "", 12406, var137 + class94.field1413.method2731(62, class372.field5455));
                            }
                        }
                        class473.field6913[var143] = var138;
                        class178.field2628[var143] = var141;
                        class438.field6407[var143] = var140;
                        var137 = null;
                        class489.field7142[var143] = var142;
                        break;
                    }
                }
                if (var137 != null && class174.field2588 < 200) {
                    class258.field3597[class174.field2588] = var137;
                    class473.field6913[class174.field2588] = var138;
                    class434.field6365[class174.field2588] = var139;
                    class178.field2628[class174.field2588] = var141;
                    class438.field6407[class174.field2588] = var140;
                    class489.field7142[class174.field2588] = var142;
                    class174.field2588++;
                }
            }
            class492.field7177 = 2;
            class78.field1138 = class483.field7062;
            boolean var126 = false;
            int var127 = class174.field2588;
            while (var127 > 0) {
                var127--;
                boolean var128 = true;
                for (int var129 = 0; var129 < var127; var129++) {
                    if (class434.field6365[var129] != class316.field4329 && class434.field6365[var129 + 1] == class316.field4329 || class434.field6365[var129] == 0 && class434.field6365[var129 + 1] != 0) {
                        int var130 = class434.field6365[var129];
                        class434.field6365[var129] = class434.field6365[var129 + 1];
                        class434.field6365[var129 + 1] = var130;
                        String var131 = class178.field2628[var129];
                        class178.field2628[var129] = class178.field2628[var129 + 1];
                        class178.field2628[var129 + 1] = var131;
                        String var132 = class258.field3597[var129];
                        class258.field3597[var129] = class258.field3597[var129 + 1];
                        class258.field3597[var129 + 1] = var132;
                        String var133 = class473.field6913[var129];
                        class473.field6913[var129] = class473.field6913[var129 + 1];
                        class473.field6913[var129 + 1] = var133;
                        int var134 = class438.field6407[var129];
                        class438.field6407[var129] = class438.field6407[var129 + 1];
                        class438.field6407[var129 + 1] = var134;
                        boolean var135 = class489.field7142[var129];
                        class489.field7142[var129] = class489.field7142[var129 + 1];
                        var128 = false;
                        class489.field7142[var129 + 1] = var135;
                    }
                }
                if (var128) {
                    break;
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class53.field648 == class469.field6850) {
            class270.method1612((byte) 126);
            class469.field6850 = null;
            return false;
        } else if (class469.field6850 == class287.field3987) {
            int var144 = class179.field2631.method2346((byte) 43);
            int var145 = class179.field2631.method2361((byte) -56);
            if (class53.method457(var144, 0)) {
                class200.method1250(var145, 0, class152.field2335, true, 5);
            }
            class469.field6850 = null;
            return true;
        } else if (class55.field659 == class469.field6850) {
            int var146 = class179.field2631.method2353((byte) 69);
            int var147 = class179.field2631.method2348(-2);
            boolean var148 = (var147 & 0x1) == 1;
            class111.method808(var146, -25422, var148);
            int var149 = class179.field2631.method2353((byte) 116);
            for (int var150 = 0; var150 < var149; var150++) {
                int var151 = class179.field2631.method2352((byte) 8);
                if (var151 == 255) {
                    var151 = class179.field2631.method2325(-128);
                }
                int var152 = class179.field2631.method2353((byte) 75);
                class214.method1324(var148, var150, 11158, var146, var151, var152 - 1);
            }
            class347.field4973[class251.method1501(31, class400.field5879++)] = var146;
            class469.field6850 = null;
            return true;
        } else if (class520.field7703 == class469.field6850) {
            String var153 = class179.field2631.method2347((byte) -60);
            int var154 = class179.field2631.method2345(2);
            int var155 = class179.field2631.method2313(255);
            if (class53.method457(var155, 0)) {
                class444.method2637(var153, 2, var154);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class383.field5594) {
            int var156 = class179.field2631.method2358(109);
            int var157 = class179.field2631.method2361((byte) -56);
            int var158 = class179.field2631.method2313(255);
            if (var158 == 65535) {
                var158 = -1;
            }
            int var159 = class179.field2631.method2345(2);
            if (class53.method457(var159, 0)) {
                class457.method2678(9, var158, var156, var157);
                class508 var160 = class328.field4480.method3091(59, var158);
                class374.method2234(var157, var160.field7517, false, var160.field7546, var160.field7500);
                class428.method2534(10, var157, var160.field7498, var160.field7548, var160.field7508);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class309.field4209) {
            class36.method213((byte) 110, class422.field6187, class179.field2631);
            class469.field6850 = null;
            return true;
        } else if (class486.field7094 == class469.field6850) {
            int var161 = class179.field2631.method2346((byte) 43);
            int var162 = class179.field2631.method2353((byte) 74);
            int var163 = class179.field2631.method2317(0);
            int var164 = class179.field2631.method2321(false);
            int var165 = class179.field2631.method2346((byte) 43);
            boolean var166 = (var163 & 0x80) != 0;
            if (var164 >> 30 != 0) {
                int var197 = var164 >> 28 & 0x3;
                int var198 = (var164 >> 14 & 0x3FFF) - class510.field7566;
                int var199 = (var164 & 0x3FFF) - class14.field204;
                if (var198 >= 0 && var199 >= 0 && var198 < class527.field7799 && var199 < class422.field6182) {
                    int var200 = var198 * 128 + 64;
                    int var201 = var199 * 128 + 64;
                    int var202 = var197;
                    if (var197 < 3 && class360.method2159(var199, false, var198)) {
                        var202 = var197 + 1;
                    }
                    class108 var203 = new class108(var162, 0, field6516, var197, var202, var200, class242.method1465(109, var197, var201, var200) - var165, var201, var198, var198, var199, var199, var163);
                    class511.field7570.method2809(new class258(var203), 2);
                }
            } else if ((var164 >> 29) != 0) {
                int var167 = var164 & 0xFFFF;
                class502 var168 = class378.field5533[var167];
                if (var168 != null) {
                    if (var162 == 65535) {
                        var162 = -1;
                    }
                    boolean var169 = true;
                    int var170 = var166 ? var168.field1023 : var168.field1049;
                    if (var162 != -1 && var170 != -1) {
                        if (var162 == var170) {
                            class398 var171 = class27.field357.method1479(var162, (byte) -124);
                            if (var171.field5820 && var171.field5824 != -1) {
                                class104 var172 = class222.field3168.method126(-119, var171.field5824);
                                int var173 = var172.field1566;
                                if (var173 == 0 || var173 == 2) {
                                    var169 = false;
                                } else if (var173 == 1) {
                                    var169 = true;
                                }
                            }
                        } else {
                            class398 var174 = class27.field357.method1479(var162, (byte) -124);
                            class398 var175 = class27.field357.method1479(var170, (byte) -118);
                            if (var174.field5824 != -1 && var175.field5824 != -1) {
                                class104 var176 = class222.field3168.method126(-78, var174.field5824);
                                class104 var177 = class222.field3168.method126(-77, var175.field5824);
                                if (var176.field1570 < var177.field1570) {
                                    var169 = false;
                                }
                            }
                        }
                    }
                    if (var169) {
                        if (var166) {
                            var168.field1031 = var165;
                            var168.field1034 = 0;
                            var168.field1045 = field6516 + var161;
                            var168.field1052 = var163 & 0x7;
                            var168.field1023 = var162;
                            var168.field1093 = 0;
                            var168.field1067 = 1;
                            if (field6516 < var168.field1045) {
                                var168.field1093 = -1;
                            }
                            if (var168.field1023 != -1 && field6516 == var168.field1045) {
                                int var180 = class27.field357.method1479(var168.field1023, (byte) -124).field5824;
                                if (var180 != -1) {
                                    class104 var181 = class222.field3168.method126(-69, var180);
                                    if (var181 != null && var181.field1551 != null) {
                                        method2618(var168.field1732, var168.field1735, var168.field1738, false, var181, 0, 112);
                                    }
                                }
                            }
                        } else {
                            var168.field1049 = var162;
                            var168.field1094 = field6516 + var161;
                            var168.field1074 = 1;
                            var168.field1065 = 0;
                            var168.field1081 = 0;
                            var168.field1059 = var163 & 0x7;
                            var168.field1111 = var165;
                            if (var168.field1094 > field6516) {
                                var168.field1065 = -1;
                            }
                            if (var168.field1049 != -1 && field6516 == var168.field1094) {
                                int var178 = class27.field357.method1479(var168.field1049, (byte) -124).field5824;
                                if (var178 != -1) {
                                    class104 var179 = class222.field3168.method126(-98, var178);
                                    if (var179 != null && var179.field1551 != null) {
                                        method2618(var168.field1732, var168.field1735, var168.field1738, false, var179, 0, 123);
                                    }
                                }
                            }
                        }
                    }
                }
            } else if (var164 >> 28 != 0) {
                int var182 = var164 & 0xFFFF;
                class438 var183;
                if (class152.field2335 == var182) {
                    var183 = class316.field4324;
                } else {
                    var183 = class12.field182[var182];
                }
                if (var183 != null) {
                    if (var162 == 65535) {
                        var162 = -1;
                    }
                    boolean var184 = true;
                    int var185 = var166 ? var183.field1023 : var183.field1049;
                    if (var162 != -1 && var185 != -1) {
                        if (var162 == var185) {
                            class398 var190 = class27.field357.method1479(var162, (byte) -114);
                            if (var190.field5820 && var190.field5824 != -1) {
                                class104 var191 = class222.field3168.method126(-69, var190.field5824);
                                int var192 = var191.field1566;
                                if (var192 == 0 || var192 == 2) {
                                    var184 = false;
                                } else if (var192 == 1) {
                                    var184 = true;
                                }
                            }
                        } else {
                            class398 var186 = class27.field357.method1479(var162, (byte) -120);
                            class398 var187 = class27.field357.method1479(var185, (byte) -123);
                            if (var186.field5824 != -1 && var187.field5824 != -1) {
                                class104 var188 = class222.field3168.method126(-80, var186.field5824);
                                class104 var189 = class222.field3168.method126(-116, var187.field5824);
                                if (var189.field1570 > var188.field1570) {
                                    var184 = false;
                                }
                            }
                        }
                    }
                    if (var184) {
                        if (var166) {
                            var183.field1093 = 0;
                            var183.field1031 = var165;
                            var183.field1045 = field6516 + var161;
                            var183.field1052 = var163 & 0x7;
                            var183.field1034 = 0;
                            var183.field1023 = var162;
                            var183.field1067 = 1;
                            if (var183.field1023 == 65535) {
                                var183.field1023 = -1;
                            }
                            if (field6516 < var183.field1045) {
                                var183.field1093 = -1;
                            }
                            if (var183.field1023 != -1 && field6516 == var183.field1045) {
                                int var193 = class27.field357.method1479(var183.field1023, (byte) -121).field5824;
                                if (var193 != -1) {
                                    class104 var194 = class222.field3168.method126(-69, var193);
                                    if (var194 != null && var194.field1551 != null) {
                                        method2618(var183.field1732, var183.field1735, var183.field1738, class316.field4324 == var183, var194, 0, 89);
                                    }
                                }
                            }
                        } else {
                            var183.field1074 = 1;
                            var183.field1081 = 0;
                            var183.field1065 = 0;
                            var183.field1094 = field6516 + var161;
                            var183.field1111 = var165;
                            var183.field1059 = var163 & 0x7;
                            var183.field1049 = var162;
                            if (var183.field1094 > field6516) {
                                var183.field1065 = -1;
                            }
                            if (var183.field1049 == 65535) {
                                var183.field1049 = -1;
                            }
                            if (var183.field1049 != -1 && field6516 == var183.field1094) {
                                int var195 = class27.field357.method1479(var183.field1049, (byte) -120).field5824;
                                if (var195 != -1) {
                                    class104 var196 = class222.field3168.method126(-108, var195);
                                    if (var196 != null && var196.field1551 != null) {
                                        method2618(var183.field1732, var183.field1735, var183.field1738, class316.field4324 == var183, var196, 0, 88);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class265.field3664) {
            int var204 = class179.field2631.method2353((byte) 116);
            if (var204 == 65535) {
                var204 = -1;
            }
            int var205 = class179.field2631.method2348(-2);
            int var206 = class179.field2631.method2353((byte) 127);
            int var207 = class179.field2631.method2348(-2);
            class506.method3019(-125, var204, var205, var206, var207);
            class469.field6850 = null;
            return true;
        } else if (class49.field580 == class469.field6850) {
            int var208 = class179.field2631.method2358(76);
            int var209 = class179.field2631.method2305(-123);
            int var210 = class179.field2631.method2348(-2);
            class510.field7567[var209] = var208;
            class87.field1271[var209] = var210;
            class418.field6072[var209] = 1;
            int var211 = class511.field7577[var209] - 1;
            for (int var212 = 0; var212 < var211; var212++) {
                if (class269.field3709[var212] <= var208) {
                    class418.field6072[var209] = var212 + 2;
                }
            }
            class9.field144[class251.method1501(31, class23.field313++)] = var209;
            class469.field6850 = null;
            return true;
        } else if (class526.field7792 == class469.field6850) {
            boolean var213 = class179.field2631.method2348(-2) == 1;
            String var214 = class179.field2631.method2347((byte) -64);
            String var215 = var214;
            if (var213) {
                var215 = class179.field2631.method2347((byte) 50);
            }
            long var216 = (long) class179.field2631.method2353((byte) 69);
            long var218 = (long) class179.field2631.method2338(true);
            int var220 = class179.field2631.method2348(-2);
            int var221 = class179.field2631.method2353((byte) 125);
            long var222 = (var216 << 32) + var218;
            boolean var224 = false;
            int var225 = 0;
            while (true) {
                if (var225 >= 100) {
                    if (var220 <= 1 && class129.method888(false, var215)) {
                        var224 = true;
                    }
                    break;
                }
                if (class421.field6164[var225] == var222) {
                    var224 = true;
                    break;
                }
                var225++;
            }
            if (!var224 && class45.field539 == 0) {
                class421.field6164[class185.field2691] = var222;
                class185.field2691 = (class185.field2691 + 1) % 100;
                String var226 = class224.field3195.method1560(var221, -2621).method2175(class179.field2631, (byte) -76);
                if (var220 == 2) {
                    class424.method2519(var221, "<img=1>" + var215, 18, 0, "<img=1>" + var214, -124, null, var226);
                } else if (var220 == 1) {
                    class424.method2519(var221, "<img=0>" + var215, 18, 0, "<img=0>" + var214, -127, null, var226);
                } else {
                    class424.method2519(var221, var215, 18, 0, var214, -105, null, var226);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class459.field6734) {
            boolean var227 = class179.field2631.method2348(-2) == 1;
            String var228 = class179.field2631.method2347((byte) 69);
            String var229 = var228;
            if (var227) {
                var229 = class179.field2631.method2347((byte) -112);
            }
            int var230 = class179.field2631.method2348(-2);
            boolean var231 = false;
            if (var230 <= 1) {
                if (!(!class58.field691 || class275.field3776) || class414.field6040) {
                    var231 = true;
                } else if (var230 <= 1 && class129.method888(false, var229)) {
                    var231 = true;
                }
            }
            if (!var231 && class45.field539 == 0) {
                String var232 = class427.method2528((byte) -69, class380.method2257(true, class179.field2631));
                if (var230 == 2) {
                    class424.method2519(-1, "<img=1>" + var229, 24, 0, "<img=1>" + var228, -111, null, var232);
                } else if (var230 == 1) {
                    class424.method2519(-1, "<img=0>" + var229, 24, 0, "<img=0>" + var228, -123, null, var232);
                } else {
                    class424.method2519(-1, var229, 24, 0, var228, -127, null, var232);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class214.field2984) {
            int var233 = class179.field2631.method2317(0);
            int var234 = class179.field2631.method2348(-2);
            if (var234 == 255) {
                var233 = -1;
                var234 = -1;
            }
            class317.method1853(var234, var233, false);
            class469.field6850 = null;
            return true;
        } else if (class58.field675 == class469.field6850) {
            int var235 = class179.field2631.method2361((byte) -56);
            int var236 = class179.field2631.method2313(255);
            int var237 = class179.field2631.method2321(false);
            if (class53.method457(var236, 0)) {
                class295 var238 = (class295) class212.field2960.method1492((long) var237, 6340);
                class295 var239 = (class295) class212.field2960.method1492((long) var235, 6340);
                if (var239 != null) {
                    class51.method447(var239, true, var238 == null || var238.field4055 != var239.field4055, false);
                }
                if (var238 != null) {
                    var238.method1565(0);
                    class212.field2960.method1487(-80, (long) var235, var238);
                }
                class150 var240 = class60.method497(var237, (byte) -122);
                if (var240 != null) {
                    class370.method2222(0, var240);
                }
                class150 var241 = class60.method497(var235, (byte) -124);
                if (var241 != null) {
                    class370.method2222(0, var241);
                    class356.method2132(var241, (byte) 65, true);
                }
                if (class188.field2723 != -1) {
                    class467.method2736(class188.field2723, 9380, 1);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class231.field3262) {
            int var242 = class179.field2631.method2309(-127);
            int var243 = class179.field2631.method2311((byte) -22);
            int var244 = class179.field2631.method2358(66);
            int var245 = class179.field2631.method2313(255);
            if (class53.method457(var245, 0)) {
                class382.method2267(var242, var243, var244, 20210);
            }
            class469.field6850 = null;
            return true;
        } else if (class487.field7126 == class469.field6850) {
            int var246 = class179.field2631.method2313(255);
            String var247 = class179.field2631.method2347((byte) -108);
            int var248 = class179.field2631.method2353((byte) 76);
            if (class53.method457(var246, 0)) {
                class444.method2637(var247, 2, var248);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class216.field3003) {
            class122.field1831 = class179.field2631.method2353((byte) 73) * 30;
            class251.field3469 = class483.field7062;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class100.field1496) {
            class149.method993(class404.field5931, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class484.field7077 == class469.field6850) {
            class370.method2223(false, 98);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class317.field4332) {
            int var249 = class179.field2631.method2353((byte) 94);
            if (class53.method457(var249, 0)) {
                class146.method977(114);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class19.field248) {
            class18.field238 = class179.field2631.method2348(-2);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class251.field3471) {
            int var250 = class179.field2631.method2317(0);
            int var251 = class179.field2631.method2317(0);
            int var252 = class179.field2631.method2313(255);
            if (var252 == 65535) {
                var252 = -1;
            }
            class39.method331(var251, var250, (byte) -124, var252);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class217.field3025) {
            int var253 = class179.field2631.method2317(0);
            int var254 = class179.field2631.method2335(124);
            int var255 = class179.field2631.method2346((byte) 43);
            if (var255 == 65535) {
                var255 = -1;
            }
            class258.method1557(var254, var253, var255, -24278);
            class469.field6850 = null;
            return true;
        } else if (class5.field46 == class469.field6850) {
            class37.field463 = class179.field2631.method2311((byte) -95);
            class251.field3469 = class483.field7062;
            class469.field6850 = null;
            return true;
        } else if (class57.field672 == class469.field6850) {
            class408.method2444(0, class202.field2840, class422.field6187, class179.field2631);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class254.field3531) {
            String var256 = class179.field2631.method2347((byte) -91);
            String var257 = class427.method2528((byte) 117, class380.method2257(true, class179.field2631));
            class310.method1795(6, 0, var256, var256, 12406, var257);
            class469.field6850 = null;
            return true;
        } else if (class9.field147 == class469.field6850) {
            class209.field2904 = class264.method1586(class179.field2631.method2348(-2), -118);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class288.field4000) {
            int var258 = class179.field2631.method2353((byte) 69);
            int var259 = class179.field2631.method2348(-2);
            boolean var260 = (var259 & 0x1) == 1;
            while (class179.field2631.field5719 < class422.field6187) {
                int var261 = class179.field2631.method2332(2);
                int var262 = class179.field2631.method2353((byte) 94);
                int var263 = 0;
                if (var262 != 0) {
                    var263 = class179.field2631.method2348(-2);
                    if (var263 == 255) {
                        var263 = class179.field2631.method2361((byte) -56);
                    }
                }
                class214.method1324(var260, var261, 11158, var258, var263, var262 - 1);
            }
            class347.field4973[class251.method1501(31, class400.field5879++)] = var258;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class318.field4370) {
            class409.method2446((byte) 78);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class285.field3939) {
            int var264 = class179.field2631.method2353((byte) 99);
            int var265 = class179.field2631.method2348(-2);
            int var266 = class179.field2631.method2348(-2);
            int var267 = class179.field2631.method2348(-2);
            int var268 = class179.field2631.method2348(-2);
            int var269 = class179.field2631.method2353((byte) 97);
            if (class53.method457(var264, 0)) {
                class80.field1225[var265] = true;
                class110.field1661[var265] = var266;
                class44.field534[var265] = var267;
                class347.field4975[var265] = var268;
                class352.field5166[var265] = var269;
            }
            class469.field6850 = null;
            return true;
        } else if (class487.field7129 == class469.field6850) {
            class259.field3609 = class422.field6187 > 2 ? class179.field2631.method2347((byte) 117) : class464.field6823.method2731(62, class372.field5455);
            class347.field4972 = class422.field6187 > 0 ? class179.field2631.method2353((byte) 104) : -1;
            class469.field6850 = null;
            if (class347.field4972 == 65535) {
                class347.field4972 = -1;
            }
            return true;
        } else if (class469.field6850 == class147.field2117) {
            class149.method993(class30.field398, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class446.field6574) {
            class149.method993(class120.field1774, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class386.field5638) {
            int var270 = class179.field2631.method2332(2);
            int var271 = class179.field2631.method2361((byte) -56);
            int var272 = class179.field2631.method2348(-2);
            String var273 = "";
            String var274 = var273;
            if ((var272 & 0x1) != 0) {
                var273 = class179.field2631.method2347((byte) 39);
                if ((var272 & 0x2) == 0) {
                    var274 = var273;
                } else {
                    var274 = class179.field2631.method2347((byte) 54);
                }
            }
            String var275 = class179.field2631.method2347((byte) 64);
            if (var270 == 99) {
                class156.method1040(-21411, var275);
            } else if (var274.equals("") || !class129.method888(false, var274)) {
                class310.method1795(var270, var271, var273, var274, 12406, var275);
            } else {
                class469.field6850 = null;
                return true;
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class37.field465) {
            class149.method993(class292.field4044, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class51.field618 == class469.field6850) {
            int var276 = class179.field2631.method2353((byte) 69);
            int var277 = class179.field2631.method2313(255);
            if (var277 == 65535) {
                var277 = -1;
            }
            int var278 = class179.field2631.method2345(2);
            int var279 = class179.field2631.method2361((byte) -56);
            int var280 = class179.field2631.method2346((byte) 43);
            if (var280 == 65535) {
                var280 = -1;
            }
            if (class53.method457(var278, 0)) {
                for (int var281 = var277; var281 <= var280; var281++) {
                    long var282 = ((long) var279 << 32) + (long) var281;
                    class188 var284 = (class188) class359.field5235.method1492(var282, 6340);
                    class188 var285;
                    if (var284 != null) {
                        var285 = new class188(var284.field2719, var276);
                        var284.method1565(0);
                    } else if (var281 == -1) {
                        var285 = new class188(class60.method497(var279, (byte) -121).field2218.field2719, var276);
                    } else {
                        var285 = new class188(0, var276);
                    }
                    class359.field5235.method1487(-61, var282, var285);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class408.field5970) {
            int var286 = class179.field2631.method2348(-2);
            int var287 = class179.field2631.method2313(255);
            if (class53.method457(var287, 0)) {
                class343.field4934 = var286;
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class26.field333) {
            int var288 = class179.field2631.method2353((byte) 79);
            int var289 = class179.field2631.method2325(-128);
            int var290 = class179.field2631.method2325(-128);
            int var291 = class179.field2631.method2313(255);
            if (class53.method457(var291, 0)) {
                class200.method1250(var289, var290, var288, true, 5);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class331.field4508) {
            int var292 = class179.field2631.method2345(2);
            int var293 = class179.field2631.method2346((byte) 43);
            int var294 = class179.field2631.method2358(28);
            if (class53.method457(var293, 0)) {
                class226.method1404(var292, var294, 1);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class21.field286) {
            int var295 = class179.field2631.method2345(2);
            byte var296 = class179.field2631.method2324(13486);
            int var297 = class179.field2631.method2313(255);
            if (class53.method457(var297, 0)) {
                class226.method1404(var295, var296, 1);
            }
            class469.field6850 = null;
            return true;
        } else if (class58.field694 == class469.field6850) {
            class149.method993(class128.field1896, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class38.field478) {
            class149.method993(class402.field5894, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class448.field6605) {
            int var298 = class179.field2631.method2352((byte) 8);
            int var299 = class179.field2631.method2353((byte) 79);
            boolean var300 = (var298 & 0x1) == 1;
            class226.method1407((byte) 121, var300, var299);
            class347.field4973[class251.method1501(class400.field5879++, 31)] = var299;
            class469.field6850 = null;
            return true;
        } else if (class85.field1263 == class469.field6850) {
            byte var301 = class179.field2631.method2350((byte) 120);
            int var302 = class179.field2631.method2346((byte) 43);
            class421.field6166.method931(var302, var301, -106);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class410.field5991) {
            class492.field7177 = 1;
            class469.field6850 = null;
            class78.field1138 = class483.field7062;
            return true;
        } else if (class469.field6850 == class140.field1986) {
            int var303 = class179.field2631.method2353((byte) 102);
            int var304 = class179.field2631.method2361((byte) -56);
            if (class53.method457(var303, 0)) {
                class295 var305 = (class295) class212.field2960.method1492((long) var304, 6340);
                if (var305 != null) {
                    class51.method447(var305, true, true, false);
                }
                if (class408.field5971 != null) {
                    class370.method2222(0, class408.field5971);
                    class408.field5971 = null;
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class289.field4003) {
            int var306 = class179.field2631.method2321(false);
            int var307 = class179.field2631.method2353((byte) 70);
            int var308 = class179.field2631.method2346((byte) 43);
            if (var308 == 65535) {
                var308 = -1;
            }
            if (class53.method457(var307, 0)) {
                class341.method2025(2064, var308, var306);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class407.field5949) {
            boolean var309 = class179.field2631.method2348(-2) == 1;
            String var310 = class179.field2631.method2347((byte) -52);
            String var311 = var310;
            if (var309) {
                var311 = class179.field2631.method2347((byte) 102);
            }
            long var312 = (long) class179.field2631.method2353((byte) 119);
            long var314 = (long) class179.field2631.method2338(true);
            int var316 = class179.field2631.method2348(-2);
            long var317 = (var312 << 32) + var314;
            boolean var319 = false;
            int var320 = 0;
            while (true) {
                if (var320 >= 100) {
                    if (var316 <= 1) {
                        if (!(!class58.field691 || class275.field3776) || class414.field6040) {
                            var319 = true;
                        } else if (class129.method888(false, var311)) {
                            var319 = true;
                        }
                    }
                    break;
                }
                if (class421.field6164[var320] == var317) {
                    var319 = true;
                    break;
                }
                var320++;
            }
            if (!var319 && class45.field539 == 0) {
                class421.field6164[class185.field2691] = var317;
                class185.field2691 = (class185.field2691 + 1) % 100;
                String var321 = class427.method2528((byte) -37, class380.method2257(true, class179.field2631));
                if (var316 == 2) {
                    class424.method2519(-1, "<img=1>" + var311, 7, 0, "<img=1>" + var310, -117, null, var321);
                } else if (var316 == 1) {
                    class424.method2519(-1, "<img=0>" + var311, 7, 0, "<img=0>" + var310, 60, null, var321);
                } else {
                    class424.method2519(-1, var311, 3, 0, var310, -11, null, var321);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class388.field5657) {
            int var322 = class179.field2631.method2353((byte) 73);
            int var323 = class179.field2631.method2358(58);
            int var324 = class179.field2631.method2346((byte) 43);
            if (class53.method457(var322, 0)) {
                class176.method1140(var323, false, var324);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class385.field5607) {
            class149.method993(class531.field7816, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class258.field3598) {
            int var325 = class179.field2631.method2353((byte) 78);
            int var326 = class179.field2631.method2321(false);
            int var327 = class179.field2631.method2345(2);
            int var328 = class179.field2631.method2346((byte) 43);
            int var329 = class179.field2631.method2353((byte) 115);
            if (class53.method457(var329, 0)) {
                class374.method2234(var326, var328, false, var327, var325);
            }
            class469.field6850 = null;
            return true;
        } else if (class511.field7574 == class469.field6850) {
            int var330 = class179.field2631.method2353((byte) 86);
            int var331 = class179.field2631.method2348(-2);
            int var332 = class179.field2631.method2348(-2);
            int var333 = class179.field2631.method2353((byte) 80) << 0;
            int var334 = class179.field2631.method2348(-2);
            int var335 = class179.field2631.method2348(-2);
            if (class53.method457(var330, 0)) {
                class474.method2787(var334, (byte) 123, var331, true, var335, var332, var333);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class20.field263) {
            int var336 = class179.field2631.method2313(255);
            int var337 = class179.field2631.method2361((byte) -56);
            class421.field6166.method931(var336, var337, -82);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class359.field5237) {
            int var338 = class179.field2631.method2353((byte) 106);
            if (var338 == 65535) {
                var338 = -1;
            }
            int var339 = class179.field2631.method2348(-2);
            int var340 = class179.field2631.method2353((byte) 124);
            int var341 = class179.field2631.method2348(-2);
            class308.method1786(var340, var338, var341, (byte) -109, var339);
            class469.field6850 = null;
            return true;
        } else if (class64.field858 == class469.field6850) {
            String var342 = class179.field2631.method2347((byte) -78);
            int var343 = class179.field2631.method2313(255);
            int var344 = class179.field2631.method2321(false);
            if (class53.method457(var343, 0)) {
                class164.method1094(43, var344, var342);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class408.field5963) {
            if (class188.field2723 != -1) {
                class467.method2736(class188.field2723, 9380, 0);
            }
            class469.field6850 = null;
            return true;
        } else if (class87.field1270 == class469.field6850) {
            boolean var345 = class179.field2631.method2348(-2) == 1;
            String var346 = class179.field2631.method2347((byte) -51);
            String var347 = var346;
            if (var345) {
                var347 = class179.field2631.method2347((byte) -54);
            }
            long var348 = class179.field2631.method2306((byte) -128);
            long var350 = (long) class179.field2631.method2353((byte) 65);
            long var352 = (long) class179.field2631.method2338(true);
            int var354 = class179.field2631.method2348(-2);
            long var355 = (var350 << 32) + var352;
            boolean var357 = false;
            int var358 = 0;
            while (true) {
                if (var358 >= 100) {
                    if (var354 <= 1) {
                        if (!(!class58.field691 || class275.field3776) || class414.field6040) {
                            var357 = true;
                        } else if (class129.method888(false, var347)) {
                            var357 = true;
                        }
                    }
                    break;
                }
                if (class421.field6164[var358] == var355) {
                    var357 = true;
                    break;
                }
                var358++;
            }
            if (!var357 && class45.field539 == 0) {
                class421.field6164[class185.field2691] = var355;
                class185.field2691 = (class185.field2691 + 1) % 100;
                String var359 = class427.method2528((byte) -114, class380.method2257(true, class179.field2631));
                if (var354 == 2 || var354 == 3) {
                    class424.method2519(-1, "<img=1>" + var347, 9, 0, "<img=1>" + var346, 97, class374.method2235(var348, (byte) 112), var359);
                } else if (var354 == 1) {
                    class424.method2519(-1, "<img=0>" + var347, 9, 0, "<img=0>" + var346, 94, class374.method2235(var348, (byte) 112), var359);
                } else {
                    class424.method2519(-1, var347, 9, 0, var346, -22, class374.method2235(var348, (byte) 112), var359);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class264.field3646) {
            class149.method993(class435.field6368, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class424.field6218) {
            class393.field5742 = class179.field2631.method2364(121) << 3;
            class521.field7730 = class179.field2631.method2305(-111);
            class511.field7576 = class179.field2631.method2364(65) << 3;
            while (class422.field6187 > class179.field2631.field5719) {
                class74 var360 = class432.method2556(14)[class179.field2631.method2348(-2)];
                class149.method993(var360, -1520864244);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class343.field4932) {
            int var361 = class179.field2631.method2358(75);
            int var362 = class179.field2631.method2313(255);
            if (var362 == 65535) {
                var362 = -1;
            }
            int var363 = class179.field2631.method2313(255);
            if (class53.method457(var363, 0)) {
                class200.method1250(var361, -1, var362, true, 1);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class134.field1946) {
            class285.method1701(-24827);
            class469.field6850 = null;
            return false;
        } else if (class469.field6850 == class202.field2845) {
            class157.method1047(class179.field2631.method2347((byte) -107), (byte) -119);
            class469.field6850 = null;
            return true;
        } else if (class96.field1462 == class469.field6850) {
            int var364 = class179.field2631.method2348(-2);
            boolean var365 = (var364 & 0x1) == 1;
            String var366 = class179.field2631.method2347((byte) 82);
            String var367 = class179.field2631.method2347((byte) -98);
            if (var367.equals("")) {
                var367 = var366;
            }
            String var368 = class179.field2631.method2347((byte) -64);
            String var369 = class179.field2631.method2347((byte) 113);
            if (var369.equals("")) {
                var369 = var368;
            }
            if (var365) {
                for (int var370 = 0; var370 < class18.field235; var370++) {
                    if (class267.field3692[var370].equals(var369)) {
                        class165.field2479[var370] = var366;
                        class267.field3692[var370] = var367;
                        class413.field6031[var370] = var368;
                        class353.field5182[var370] = var369;
                        break;
                    }
                }
            } else {
                class165.field2479[class18.field235] = var366;
                class267.field3692[class18.field235] = var367;
                class413.field6031[class18.field235] = var368;
                class353.field5182[class18.field235] = var369;
                class366.field5375[class18.field235] = class251.method1501(2, var364) == 2;
                class18.field235++;
            }
            class469.field6850 = null;
            class78.field1138 = class483.field7062;
            return true;
        } else if (class469.field6850 == class278.field3808) {
            if (class147.field2140 != null) {
                class463.method2721(-1, -1, false, class20.field269.field7643, (byte) 113);
            }
            byte[] var371 = new byte[class422.field6187];
            class179.field2631.method1286(var371, 1030414183, class422.field6187, 0);
            String var372 = class67.method573(var371, 23231, class422.field6187, 0);
            class186.method1173(true, class202.field2840, class152.field2332 == 1, 3, var372);
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class210.field2928) {
            int var373 = class179.field2631.method2353((byte) 72);
            if (var373 == 65535) {
                var373 = -1;
            }
            int var374 = class179.field2631.method2348(-2);
            String var375 = class179.field2631.method2347((byte) -38);
            int var376 = class179.field2631.method2317(0);
            if (var374 >= 1 && var374 <= 8) {
                if (var375.equalsIgnoreCase("null")) {
                    var375 = null;
                }
                class166.field2507[var374 - 1] = var375;
                class97.field1473[var374 - 1] = var373;
                class476.field6945[var374 - 1] = var376 == 0;
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class359.field5231) {
            String var377 = class179.field2631.method2347((byte) 112);
            int var378 = class179.field2631.method2353((byte) 113);
            String var379 = class224.field3195.method1560(var378, -2621).method2175(class179.field2631, (byte) -76);
            class424.method2519(var378, var377, 19, 0, var377, -102, null, var379);
            class469.field6850 = null;
            return true;
        } else if (client.field2802 == class469.field6850) {
            int var380 = class179.field2631.method2313(255);
            if (var380 == 65535) {
                var380 = -1;
            }
            int var381 = class179.field2631.method2358(109);
            int var382 = class179.field2631.method2353((byte) 86);
            if (var382 == 65535) {
                var382 = -1;
            }
            int var383 = class179.field2631.method2345(2);
            int var384 = class179.field2631.method2325(-127);
            if (class53.method457(var383, 0)) {
                for (int var385 = var382; var385 <= var380; var385++) {
                    long var386 = ((long) var381 << 32) + (long) var385;
                    class188 var388 = (class188) class359.field5235.method1492(var386, 6340);
                    class188 var389;
                    if (var388 != null) {
                        var389 = new class188(var384, var388.field2720);
                        var388.method1565(0);
                    } else if (var385 == -1) {
                        var389 = new class188(var384, class60.method497(var381, (byte) -119).field2218.field2720);
                    } else {
                        var389 = new class188(var384, -1);
                    }
                    class359.field5235.method1487(-75, var386, var389);
                }
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class279.field3816) {
            class149.method993(class67.field919, -1520864244);
            class469.field6850 = null;
            return true;
        } else if (class479.field7002 == class469.field6850) {
            int var390 = class179.field2631.method2313(255);
            int var391 = class179.field2631.method2353((byte) 113);
            int var392 = class179.field2631.method2313(255);
            if (class53.method457(var392, 0)) {
                class517.method3076(0, var390, var391, 3);
            }
            class469.field6850 = null;
            return true;
        } else if (class508.field7551 == class469.field6850) {
            int var393 = class179.field2631.method2361((byte) -56);
            int var394 = class179.field2631.method2346((byte) 43);
            int var395 = class179.field2631.method2353((byte) 77);
            if (class53.method457(var394, 0)) {
                class252.method1509(var395, var393, 45);
            }
            class469.field6850 = null;
            return true;
        } else if (class70.field973 == class469.field6850) {
            int var396 = class179.field2631.method2346((byte) 43);
            int var397 = class179.field2631.method2353((byte) 94);
            int var398 = class179.field2631.method2358(121);
            int var399 = class179.field2631.method2346((byte) 43);
            int var400 = class179.field2631.method2313(255);
            if (class53.method457(var399, 0)) {
                class200.method1250(var398, var400, var397 | var396 << 16, true, 7);
            }
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class423.field6202) {
            int var401 = class179.field2631.method2348(-2);
            if (class179.field2631.method2348(-2) == 0) {
                class65.field896[var401] = new class181();
            } else {
                class179.field2631.field5719--;
                class65.field896[var401] = new class181(class179.field2631);
            }
            class3.field14 = class483.field7062;
            class469.field6850 = null;
            return true;
        } else if (class469.field6850 == class100.field1503) {
            class18.field235 = class179.field2631.method2348(-2);
            for (int var402 = 0; var402 < class18.field235; var402++) {
                class165.field2479[var402] = class179.field2631.method2347((byte) -81);
                class267.field3692[var402] = class179.field2631.method2347((byte) -127);
                if (class267.field3692[var402].equals("")) {
                    class267.field3692[var402] = class165.field2479[var402];
                }
                class413.field6031[var402] = class179.field2631.method2347((byte) 63);
                class353.field5182[var402] = class179.field2631.method2347((byte) 123);
                if (class353.field5182[var402].equals("")) {
                    class353.field5182[var402] = class413.field6031[var402];
                }
                class366.field5375[var402] = false;
            }
            class469.field6850 = null;
            class78.field1138 = class483.field7062;
            return true;
        } else if (class469.field6850 == class242.field3390) {
            int var403 = class179.field2631.method2313(255);
            int var404 = class179.field2631.method2321(false);
            if (class53.method457(var403, 0)) {
                class200.method1250(var404, -1, -1, true, 3);
            }
            class469.field6850 = null;
            return true;
        } else {
            class320.method1861(null, (byte) -125, "T1 - " + (class469.field6850 == null ? -1 : class469.field6850.method1615((byte) 51)) + "," + (class455.field6681 == null ? -1 : class455.field6681.method1615((byte) 51)) + "," + (class521.field7731 == null ? -1 : class521.field7731.method1615((byte) 51)) + " - " + class422.field6187);
            class285.method1701(-24827);
            return true;
        }
    }
}
