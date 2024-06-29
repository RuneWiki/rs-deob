import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!db")
public class class141 {

    @OriginalMember(owner = "client!db", name = "j", descriptor = "[I")
    private int[] field2238;

    @OriginalMember(owner = "client!db", name = "u", descriptor = "[I")
    private int[] field2249;

    @OriginalMember(owner = "client!db", name = "o", descriptor = "Ljava/lang/String;")
    public static String field2243 = "Connected to update server";

    @OriginalMember(owner = "client!db", name = "l", descriptor = "I")
    public static int field2240 = 0;

    @OriginalMember(owner = "client!db", name = "v", descriptor = "[[I")
    public static int[][] field2250 = new int[][] { { 0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15 }, { 12, 8, 4, 0, 13, 9, 5, 1, 14, 10, 6, 2, 15, 11, 7, 3 }, { 15, 14, 13, 12, 11, 10, 9, 8, 7, 6, 5, 4, 3, 2, 1, 0 }, { 3, 7, 11, 15, 2, 6, 10, 14, 1, 5, 9, 13, 0, 4, 8, 12 } };

    @OriginalMember(owner = "client!db", name = "a", descriptor = "I")
    public static int field2229;

    @OriginalMember(owner = "client!db", name = "b", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!db", name = "c", descriptor = "I")
    public static int field2231;

    @OriginalMember(owner = "client!db", name = "d", descriptor = "I")
    public static int field2232;

    @OriginalMember(owner = "client!db", name = "e", descriptor = "I")
    private int field2233;

    @OriginalMember(owner = "client!db", name = "f", descriptor = "I")
    private int field2234;

    @OriginalMember(owner = "client!db", name = "g", descriptor = "I")
    public static int field2235;

    @OriginalMember(owner = "client!db", name = "h", descriptor = "I")
    private int field2236;

    @OriginalMember(owner = "client!db", name = "i", descriptor = "I")
    public static int field2237;

    @OriginalMember(owner = "client!db", name = "k", descriptor = "I")
    private int field2239;

    @OriginalMember(owner = "client!db", name = "m", descriptor = "I")
    public static int field2241;

    @OriginalMember(owner = "client!db", name = "n", descriptor = "I")
    public static int field2242;

    @OriginalMember(owner = "client!db", name = "p", descriptor = "I")
    public static int field2244;

    @OriginalMember(owner = "client!db", name = "q", descriptor = "I")
    public static int field2245;

    @OriginalMember(owner = "client!db", name = "r", descriptor = "I")
    public static int field2246;

    @OriginalMember(owner = "client!db", name = "s", descriptor = "I")
    public static int field2247;

    @OriginalMember(owner = "client!db", name = "t", descriptor = "I")
    public static int field2248;

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIZ)I", line = 9)
    public static final int method1046(int arg0, int arg1, boolean arg2) {
        field2232++;
        class111 var3 = (class111) class267.field4161.method2168((long) arg0, (byte) -82);
        if (arg2) {
            field2246 = 0;
        }
        if (var3 == null) {
            return 0;
        } else if (arg1 >= 0 && var3.field1552.length > arg1) {
            return var3.field1552[arg1];
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(I)V", line = 38)
    private final void method1047(int arg0) {
        if (arg0 != -9) {
            this.method1047(64);
        }
        this.field2233 += ++this.field2236;
        field2229++;
        for (int var2 = 0; var2 < 256; var2++) {
            int var3 = this.field2249[var2];
            if ((var2 & 0x2) == 0) {
                if ((var2 & 0x1) == 0) {
                    this.field2234 ^= this.field2234 << 13;
                } else {
                    this.field2234 ^= this.field2234 >>> 6;
                }
            } else if ((var2 & 0x1) == 0) {
                this.field2234 ^= this.field2234 << 2;
            } else {
                this.field2234 ^= this.field2234 >>> 16;
            }
            this.field2234 += this.field2249[var2 + 128 & 0xFF];
            int var4;
            this.field2249[var2] = var4 = this.field2234 + this.field2233 + this.field2249[class333.method2319(1020, var3) >> 2];
            this.field2238[var2] = this.field2233 = this.field2249[class333.method2319(var4 >> 8 >> 2, 255)] + var3;
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(ZI)Lnd;", line = 82)
    public static final class245 method1048(boolean arg0, int arg1) {
        class245 var2 = (class245) class223.field3522.method1628(arg0, (long) arg1);
        field2235++;
        if (var2 != null) {
            return var2;
        }
        byte[] var3;
        if (arg1 < 32768) {
            var3 = class174.field2859.method1813(arg1, 0, true);
        } else {
            var3 = class255.field4030.method1813(arg1 & 0x7FFF, 0, true);
        }
        class245 var4 = new class245();
        if (var3 != null) {
            var4.method1760(-20255, new class6(var3));
        }
        if (arg1 >= 32768) {
            var4.method1756((byte) 77);
        }
        class223.field3522.method1627((byte) 97, var4, (long) arg1);
        return var4;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIII[IZIIIII)V", line = 111)
    public static final void method1049(int arg0, int arg1, int arg2, int arg3, int[] arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9, int arg10) {
        int var11 = arg8;
        field2230++;
        if (arg8 >= class280.field4308) {
            return;
        }
        if (arg8 < class280.field4305) {
            var11 = class280.field4305;
        }
        int var12 = arg8 + arg6;
        if (class280.field4305 >= var12) {
            return;
        }
        int var13 = arg9;
        if (class280.field4308 < var12) {
            var12 = class280.field4308;
        }
        if (arg9 >= class280.field4306) {
            return;
        }
        if (class280.field4311 > arg9) {
            var13 = class280.field4311;
        }
        int var14 = arg3 + arg9;
        if (class280.field4311 >= var14) {
            return;
        }
        if (arg1 == 9) {
            arg1 = 1;
            arg0 = arg0 + 1 & 0x3;
        }
        if (var14 > class280.field4306) {
            var14 = class280.field4306;
        }
        int var15 = var14 - arg9;
        if (arg1 == 10) {
            arg0 = arg0 + 3 & 0x3;
            arg1 = 1;
        }
        if (arg1 == 11) {
            arg0 = arg0 + 3 & 0x3;
            arg1 = 8;
        }
        int var16 = class280.field4303 + var11 - var12;
        int var17 = var12 - arg8;
        int var18 = class280.field4303 * var13 + var11;
        int var19 = var13 - arg9;
        int var20 = var11 - arg8;
        int var21 = arg3 - var19;
        int var22 = arg3 - var15;
        int var23 = arg6 - var17;
        int var24 = arg6 - var20;
        if (arg1 == 1) {
            if (arg0 == 0) {
                for (int var87 = var19; var87 < var15; var87++) {
                    for (int var88 = var20; var88 < var17; var88++) {
                        if (var88 <= var87) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 1) {
                for (int var85 = var21 - 1; var85 >= var22; var85--) {
                    for (int var86 = var20; var86 < var17; var86++) {
                        if (var85 >= var86) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 2) {
                for (int var81 = var19; var81 < var15; var81++) {
                    for (int var82 = var20; var82 < var17; var82++) {
                        if (var81 <= var82) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 3) {
                for (int var83 = var21 - 1; var83 >= var22; var83--) {
                    for (int var84 = var20; var84 < var17; var84++) {
                        if (var84 >= var83) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg1 == 2) {
            if (arg0 == 0) {
                for (int var25 = var21 - 1; var25 >= var22; var25--) {
                    for (int var26 = var20; var26 < var17; var26++) {
                        if (var26 <= (var25 >> 1)) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 1) {
                for (int var27 = var19; var27 < var15; var27++) {
                    for (int var28 = var20; var28 < var17; var28++) {
                        if (var18 >= 0 && var18 < arg4.length) {
                            if (var27 << 1 <= var28) {
                                arg4[var18] = arg7;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        } else {
                            var18++;
                        }
                    }
                    var18 += var16;
                }
            } else if (arg0 == 2) {
                for (int var29 = var19; var29 < var15; var29++) {
                    for (int var30 = var24 - 1; var30 >= var23; var30--) {
                        if (var29 >> 1 >= var30) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 3) {
                for (int var31 = var21 - 1; var31 >= var22; var31--) {
                    for (int var32 = var24 - 1; var32 >= var23; var32--) {
                        if (var31 << 1 <= var32) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg1 != 3) {
            if (arg2 > -114) {
                field2243 = (String) null;
            }
            if (arg1 == 4) {
                if (arg0 == 0) {
                    for (int var71 = var21 - 1; var71 >= var22; var71--) {
                        for (int var72 = var20; var72 < var17; var72++) {
                            if (var71 >> 1 <= var72) {
                                arg4[var18] = arg7;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                } else if (arg0 == 1) {
                    for (int var69 = var19; var69 < var15; var69++) {
                        for (int var70 = var20; var70 < var17; var70++) {
                            if ((var69 << 1) >= var70) {
                                arg4[var18] = arg7;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                } else if (arg0 == 2) {
                    for (int var67 = var19; var67 < var15; var67++) {
                        for (int var68 = var24 - 1; var68 >= var23; var68--) {
                            if (var67 >> 1 <= var68) {
                                arg4[var18] = arg7;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                } else if (arg0 == 3) {
                    for (int var65 = var21 - 1; var65 >= var22; var65--) {
                        for (int var66 = var24 - 1; var66 >= var23; var66--) {
                            if (var66 <= var65 << 1) {
                                arg4[var18] = arg7;
                            } else if (arg5) {
                                arg4[var18] = arg10;
                            }
                            var18++;
                        }
                        var18 += var16;
                    }
                }
            } else if (arg1 != 5) {
                if (arg1 == 6) {
                    if (arg0 == 0) {
                        for (int var63 = var19; var63 < var15; var63++) {
                            for (int var64 = var20; var64 < var17; var64++) {
                                if (var64 <= (arg6 / 2)) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 1) {
                        for (int var41 = var19; var41 < var15; var41++) {
                            for (int var42 = var20; var42 < var17; var42++) {
                                if ((arg3 / 2) >= var41) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 2) {
                        for (int var43 = var19; var43 < var15; var43++) {
                            for (int var44 = var20; var44 < var17; var44++) {
                                if (var44 >= arg6 / 2) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        for (int var45 = var19; var45 < var15; var45++) {
                            for (int var46 = var20; var46 < var17; var46++) {
                                if (var45 >= arg3 / 2) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                }
                if (arg1 == 7) {
                    if (arg0 == 0) {
                        for (int var61 = var19; var61 < var15; var61++) {
                            for (int var62 = var20; var62 < var17; var62++) {
                                if (var62 <= var61 - arg3 / 2) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 1) {
                        for (int var47 = var21 - 1; var47 >= var22; var47--) {
                            for (int var48 = var20; var48 < var17; var48++) {
                                if (var48 <= (var47 - (arg3 / 2))) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 2) {
                        for (int var59 = var21 - 1; var59 >= var22; var59--) {
                            for (int var60 = var24 - 1; var60 >= var23; var60--) {
                                if (var60 <= (var59 - (arg3 / 2))) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        for (int var49 = var19; var49 < var15; var49++) {
                            for (int var50 = var24 - 1; var50 >= var23; var50--) {
                                if ((var49 - (arg3 / 2)) >= var50) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                }
                if (arg1 == 8) {
                    if (arg0 == 0) {
                        for (int var57 = var19; var57 < var15; var57++) {
                            for (int var58 = var20; var58 < var17; var58++) {
                                if (var58 >= (var57 - (arg3 / 2))) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 1) {
                        for (int var51 = var21 - 1; var51 >= var22; var51--) {
                            for (int var52 = var20; var52 < var17; var52++) {
                                if (var52 >= var51 - (arg3 / 2)) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 2) {
                        for (int var53 = var21 - 1; var53 >= var22; var53--) {
                            for (int var54 = var24 - 1; var54 >= var23; var54--) {
                                if (var54 >= var53 - arg3 / 2) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                    if (arg0 == 3) {
                        for (int var55 = var19; var55 < var15; var55++) {
                            for (int var56 = var24 - 1; var56 >= var23; var56--) {
                                if (var55 - arg3 / 2 <= var56) {
                                    arg4[var18] = arg7;
                                } else if (arg5) {
                                    arg4[var18] = arg10;
                                }
                                var18++;
                            }
                            var18 += var16;
                        }
                        return;
                    }
                }
            } else if (arg0 == 0) {
                for (int var33 = var21 - 1; var33 >= var22; var33--) {
                    for (int var34 = var24 - 1; var34 >= var23; var34--) {
                        if ((var33 >> 1) <= var34) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 1) {
                for (int var35 = var21 - 1; var35 >= var22; var35--) {
                    for (int var36 = var20; var36 < var17; var36++) {
                        if ((var35 << 1) >= var36) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 2) {
                for (int var39 = var19; var39 < var15; var39++) {
                    for (int var40 = var20; var40 < var17; var40++) {
                        if ((var39 >> 1) <= var40) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            } else if (arg0 == 3) {
                for (int var37 = var19; var37 < var15; var37++) {
                    for (int var38 = var24 - 1; var38 >= var23; var38--) {
                        if ((var37 << 1) >= var38) {
                            arg4[var18] = arg7;
                        } else if (arg5) {
                            arg4[var18] = arg10;
                        }
                        var18++;
                    }
                    var18 += var16;
                }
            }
        } else if (arg0 == 0) {
            for (int var79 = var21 - 1; var79 >= var22; var79--) {
                for (int var80 = var24 - 1; var80 >= var23; var80--) {
                    if (var80 <= var79 >> 1) {
                        arg4[var18] = arg7;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg0 == 1) {
            for (int var73 = var21 - 1; var73 >= var22; var73--) {
                for (int var74 = var20; var74 < var17; var74++) {
                    if (var74 >= var73 << 1) {
                        arg4[var18] = arg7;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg0 == 2) {
            for (int var75 = var19; var75 < var15; var75++) {
                for (int var76 = var20; var76 < var17; var76++) {
                    if ((var75 >> 1) >= var76) {
                        arg4[var18] = arg7;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        } else if (arg0 == 3) {
            for (int var77 = var19; var77 < var15; var77++) {
                for (int var78 = var24 - 1; var78 >= var23; var78--) {
                    if (var77 << 1 <= var78) {
                        arg4[var18] = arg7;
                    } else if (arg5) {
                        arg4[var18] = arg10;
                    }
                    var18++;
                }
                var18 += var16;
            }
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IB)I", line = 1292)
    public static final int method1050(int arg0, byte arg1) {
        field2242++;
        int var2 = 0;
        if (arg0 < 0 || arg0 >= 65536) {
            arg0 >>>= 0x10;
            var2 += 16;
        }
        if (arg0 >= 256) {
            var2 += 8;
            arg0 >>>= 0x8;
        }
        if (arg1 != -41) {
            return -114;
        }
        if (arg0 >= 16) {
            arg0 >>>= 0x4;
            var2 += 4;
        }
        if (arg0 >= 4) {
            var2 += 2;
            arg0 >>>= 0x2;
        }
        if (arg0 >= 1) {
            arg0 >>>= 0x1;
            var2++;
        }
        return arg0 + var2;
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(IIIII)V", line = 1335)
    public static final void method1051(int arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0 != -4209) {
            field2243 = (String) null;
        }
        field2248++;
        if (arg3 - arg2 >= class291.field4490 && arg2 + arg3 <= class210.field3309 && (arg1 - arg2) >= class42.field579 && class334.field5205 >= arg1 + arg2) {
            class204.method1504(arg2, arg3, arg4, arg1, (byte) -98);
        } else {
            class328.method2301(arg0 + 4106, arg2, arg1, arg4, arg3);
        }
    }

    @OriginalMember(owner = "client!db", name = "a", descriptor = "(B)V", line = 1357)
    private final void method1052(byte arg0) {
        field2247++;
        if (arg0 != 58) {
            this.field2249 = (int[]) null;
        }
        int var2 = -1640531527;
        int var3 = -1640531527;
        int var4 = -1640531527;
        int var5 = -1640531527;
        int var6 = -1640531527;
        int var7 = -1640531527;
        int var8 = -1640531527;
        int var9 = -1640531527;
        for (int var10 = 0; var10 < 4; var10++) {
            int var11 = var9 ^ var8 << 11;
            int var12 = var6 + var11;
            int var13 = var7 + var8;
            int var14 = var13 ^ var7 >>> 2;
            int var15 = var7 + var12;
            int var16 = var15 ^ var12 << 8;
            int var17 = var5 + var14;
            int var18 = var4 + var16;
            int var19 = var12 + var17;
            var6 = var19 ^ var17 >>> 16;
            int var20 = var17 + var18;
            var5 = var20 ^ var18 << 10;
            int var21 = var2 + var5;
            int var22 = var3 + var6;
            int var23 = var18 + var22;
            var4 = var23 ^ var22 >>> 4;
            int var24 = var21 + var22;
            int var25 = var4 + var11;
            var3 = var24 ^ var21 << 8;
            int var26 = var21 + var25;
            var8 = var3 + var14;
            var2 = var26 ^ var25 >>> 9;
            var9 = var8 + var25;
            var7 = var2 + var16;
        }
        for (int var27 = 0; var27 < 256; var27 += 8) {
            int var28 = this.field2238[var27 + 3] + var6;
            int var29 = this.field2238[var27 + 6] + var3;
            int var30 = this.field2238[var27 + 4] + var5;
            int var31 = this.field2238[var27 + 1] + var8;
            int var32 = this.field2238[var27 + 2] + var7;
            int var33 = this.field2238[var27 + 7] + var2;
            int var34 = this.field2238[var27 + 5] + var4;
            int var35 = this.field2238[var27] + var9;
            int var36 = var35 ^ var31 << 11;
            int var37 = var31 + var32;
            int var38 = var37 ^ var32 >>> 2;
            int var39 = var28 + var36;
            int var40 = var30 + var38;
            int var41 = var32 + var39;
            int var42 = var41 ^ var39 << 8;
            int var43 = var34 + var42;
            int var44 = var39 + var40;
            var6 = var44 ^ var40 >>> 16;
            int var45 = var6 + var29;
            int var46 = var40 + var43;
            var5 = var46 ^ var43 << 10;
            int var47 = var43 + var45;
            int var48 = var5 + var33;
            var4 = var47 ^ var45 >>> 4;
            int var49 = var4 + var36;
            int var50 = var45 + var48;
            var3 = var50 ^ var48 << 8;
            var8 = var3 + var38;
            int var51 = var48 + var49;
            var2 = var51 ^ var49 >>> 9;
            var9 = var8 + var49;
            this.field2249[var27] = var9;
            var7 = var2 + var42;
            this.field2249[var27 + 1] = var8;
            this.field2249[var27 + 2] = var7;
            this.field2249[var27 + 3] = var6;
            this.field2249[var27 + 4] = var5;
            this.field2249[var27 + 5] = var4;
            this.field2249[var27 + 6] = var3;
            this.field2249[var27 + 7] = var2;
        }
        for (int var52 = 0; var52 < 256; var52 += 8) {
            int var53 = this.field2249[var52 + 2] + var7;
            int var54 = this.field2249[var52 + 6] + var3;
            int var55 = this.field2249[var52 + 3] + var6;
            int var56 = this.field2249[var52 + 1] + var8;
            int var57 = this.field2249[var52 + 4] + var5;
            int var58 = this.field2249[var52 + 7] + var2;
            int var59 = this.field2249[var52 + 5] + var4;
            int var60 = this.field2249[var52] + var9;
            int var61 = var60 ^ var56 << 11;
            int var62 = var55 + var61;
            int var63 = var53 + var56;
            int var64 = var63 ^ var53 >>> 2;
            int var65 = var53 + var62;
            int var66 = var65 ^ var62 << 8;
            int var67 = var57 + var64;
            int var68 = var59 + var66;
            int var69 = var62 + var67;
            var6 = var69 ^ var67 >>> 16;
            int var70 = var6 + var54;
            int var71 = var67 + var68;
            var5 = var71 ^ var68 << 10;
            int var72 = var68 + var70;
            int var73 = var5 + var58;
            var4 = var72 ^ var70 >>> 4;
            int var74 = var70 + var73;
            int var75 = var4 + var61;
            var3 = var74 ^ var73 << 8;
            var8 = var3 + var64;
            int var76 = var73 + var75;
            var2 = var76 ^ var75 >>> 9;
            var7 = var2 + var66;
            var9 = var8 + var75;
            this.field2249[var52] = var9;
            this.field2249[var52 + 1] = var8;
            this.field2249[var52 + 2] = var7;
            this.field2249[var52 + 3] = var6;
            this.field2249[var52 + 4] = var5;
            this.field2249[var52 + 5] = var4;
            this.field2249[var52 + 6] = var3;
            this.field2249[var52 + 7] = var2;
        }
        this.method1047(-9);
        this.field2239 = 256;
    }

    @OriginalMember(owner = "client!db", name = "b", descriptor = "(B)I", line = 1509)
    public final int method1053(byte arg0) {
        int var2 = -40 % ((arg0 + 50) / 51);
        if (this.field2239-- == 0) {
            this.method1047(-9);
            this.field2239 = 255;
        }
        field2244++;
        return this.field2238[this.field2239];
    }

    @OriginalMember(owner = "client!db", name = "c", descriptor = "(B)V", line = 1526)
    public static void method1054(byte arg0) {
        field2243 = null;
        field2250 = (int[][]) null;
        if (arg0 >= -95) {
            field2243 = (String) null;
        }
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "()V", line = 1542)
    private class141() {
    }

    @OriginalMember(owner = "client!db", name = "<init>", descriptor = "([I)V", line = 1547)
    public class141(int[] arg0) {
        this.field2238 = new int[256];
        this.field2249 = new int[256];
        for (int var2 = 0; var2 < arg0.length; var2++) {
            this.field2238[var2] = arg0[var2];
        }
        this.method1052((byte) 58);
    }
}
