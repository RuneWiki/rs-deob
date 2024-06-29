import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hq")
public class class144 {

    @OriginalMember(owner = "client!hq", name = "i", descriptor = "I")
    public int field2419 = -1;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "I")
    public static int field2411;

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "I")
    public static int field2412;

    @OriginalMember(owner = "client!hq", name = "c", descriptor = "I")
    public static int field2413;

    @OriginalMember(owner = "client!hq", name = "e", descriptor = "I")
    public static int field2415;

    @OriginalMember(owner = "client!hq", name = "g", descriptor = "I")
    public static int field2417;

    @OriginalMember(owner = "client!hq", name = "j", descriptor = "I")
    public static int field2420;

    @OriginalMember(owner = "client!hq", name = "k", descriptor = "I")
    public static int field2421;

    @OriginalMember(owner = "client!hq", name = "l", descriptor = "I")
    public static int field2422;

    @OriginalMember(owner = "client!hq", name = "o", descriptor = "I")
    public static int field2425;

    @OriginalMember(owner = "client!hq", name = "p", descriptor = "I")
    private int field2426;

    @OriginalMember(owner = "client!hq", name = "r", descriptor = "I")
    public static int field2428;

    @OriginalMember(owner = "client!hq", name = "d", descriptor = "J")
    private long field2414;

    @OriginalMember(owner = "client!hq", name = "q", descriptor = "J")
    private long field2427;

    @OriginalMember(owner = "client!hq", name = "f", descriptor = "Lwt;")
    public static class284 field2416;

    @OriginalMember(owner = "client!hq", name = "h", descriptor = "Z")
    public boolean field2418;

    @OriginalMember(owner = "client!hq", name = "m", descriptor = "[I")
    private int[] field2423;

    @OriginalMember(owner = "client!hq", name = "n", descriptor = "[I")
    public int[] field2424;

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lhca;IBI)V")
    public final void method1218(class454 arg0, int arg1, byte arg2, int arg3) {
        field2413++;
        if (arg2 != 52) {
            field2416 = null;
        }
        if (arg1 == -1) {
            this.field2423[arg3] = 0;
        } else if (arg0.method2859(arg1, (byte) 125) != null) {
            this.field2423[arg3] = class81.method769(1073741824, arg1);
            this.method1227((byte) -49);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILwe;ILqg;IILhfa;II[ILr;Lcr;Lqg;Ltd;IB[Lql;ZLhca;Ljb;)Lda;")
    public final class55 method1219(int arg0, int arg1, class374 arg2, int arg3, class428 arg4, int arg5, int arg6, class285 arg7, int arg8, int arg9, int[] arg10, class167 arg11, class533 arg12, class428 arg13, class419 arg14, int arg15, byte arg16, class684[] arg17, boolean arg18, class454 arg19, class458 arg20) {
        field2428++;
        if (this.field2419 != -1) {
            return arg12.method3224(this.field2419, 50).method3977(arg0, arg13, arg4, arg10, arg5, arg14, arg1, arg6, arg9, arg3, arg8, arg17, arg15, arg7, arg11, -144, arg20);
        }
        int var22 = arg8;
        long var23 = this.field2414;
        int[] var25 = this.field2423;
        if (arg13 != null && (arg13.field6518 >= 0 || arg13.field6516 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field2423[var26];
            }
            if (arg13.field6518 >= 0) {
                if (arg13.field6518 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class81.method769(1073741824, arg13.field6518);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg13.field6516 >= 0) {
                if (arg13.field6516 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class81.method769(1073741824, arg13.field6516);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        boolean var28 = false;
        boolean var29 = false;
        boolean var30 = arg13 != null || arg4 != null;
        int var31 = arg17 == null ? 0 : arg17.length;
        int var32 = 0;
        if (arg16 != -78) {
            this.method1228(null, -70, null, 122, true, 23);
        }
        while (var31 > var32) {
            class499.field7331[var32] = null;
            if (arg17[var32] != null) {
                class428 var33 = arg20.method2872((byte) 11, arg17[var32].field9590);
                if (var33.field6521 != null) {
                    class28.field433[var32] = var33;
                    var30 = true;
                    int var34 = arg17[var32].field9588;
                    int var35 = arg17[var32].field9595;
                    int var36 = var33.field6521[var34];
                    class499.field7331[var32] = arg20.method2870(var36 >>> 16, 28133);
                    int var37 = var36 & 0xFFFF;
                    class514.field7472[var32] = var37;
                    if (class499.field7331[var32] != null) {
                        var28 |= class499.field7331[var32].method3865((byte) 59, var37);
                        var27 |= class499.field7331[var32].method3863(var37, (byte) -80);
                        var29 |= class499.field7331[var32].method3861(-3425, var37);
                    }
                    if ((var33.field6531 || class436.field6656) && var35 != -1 && var33.field6521.length > var35) {
                        class466.field6937[var32] = var33.field6532[var34];
                        class362.field5721[var32] = arg17[var32].field9596;
                        int var38 = var33.field6521[var35];
                        class356.field5682[var32] = arg20.method2870(var38 >>> 16, 28133);
                        int var39 = var38 & 0xFFFF;
                        class632.field8895[var32] = var39;
                        if (class356.field5682[var32] != null) {
                            var28 |= class356.field5682[var32].method3865((byte) 59, var39);
                            var27 |= class356.field5682[var32].method3863(var39, (byte) 59);
                            var29 |= class356.field5682[var32].method3861(arg16 - 3347, var39);
                        }
                    } else {
                        class466.field6937[var32] = 0;
                        class362.field5721[var32] = 0;
                        class356.field5682[var32] = null;
                        class632.field8895[var32] = -1;
                    }
                }
            }
            var32++;
        }
        int var40 = -1;
        int var41 = -1;
        int var42 = 0;
        class675 var43 = null;
        class675 var44 = null;
        int var45 = -1;
        int var46 = -1;
        int var47 = 0;
        class675 var48 = null;
        class675 var49 = null;
        if (var30) {
            var22 = arg8 | 0x20;
            if (arg13 != null) {
                int var50 = arg13.field6521[arg15];
                int var51 = var50 >>> 16;
                var40 = var50 & 0xFFFF;
                var43 = arg20.method2870(var51, 28133);
                if (var43 != null) {
                    var28 |= var43.method3865((byte) 59, var40);
                    var27 |= var43.method3863(var40, (byte) 91);
                    var29 |= var43.method3861(-3425, var40);
                }
                if ((arg13.field6531 || class436.field6656) && arg5 != -1 && arg5 < arg13.field6521.length) {
                    var42 = arg13.field6532[arg15];
                    int var52 = arg13.field6521[arg5];
                    int var53 = var52 >>> 16;
                    var41 = var52 & 0xFFFF;
                    var44 = var51 == var53 ? var43 : arg20.method2870(var53, arg16 ^ 0xFFFF9257);
                    if (var44 != null) {
                        var28 |= var44.method3865((byte) 59, var41);
                        var27 |= var44.method3863(var41, (byte) 110);
                        var29 |= var44.method3861(-3425, var41);
                    }
                }
            }
            if (arg4 != null) {
                int var54 = arg4.field6521[arg1];
                int var55 = var54 >>> 16;
                var48 = arg20.method2870(var55, 28133);
                var45 = var54 & 0xFFFF;
                if (var48 != null) {
                    var28 |= var48.method3865((byte) 59, var45);
                    var27 |= var48.method3863(var45, (byte) -67);
                    var29 |= var48.method3861(arg16 ^ 0xD2D, var45);
                }
                if ((arg4.field6531 || class436.field6656) && arg6 != -1 && arg4.field6521.length > arg6) {
                    var47 = arg4.field6532[arg1];
                    int var56 = arg4.field6521[arg6];
                    int var57 = var56 >>> 16;
                    var49 = var55 == var57 ? var48 : arg20.method2870(var57, 28133);
                    var46 = var56 & 0xFFFF;
                    if (var49 != null) {
                        var28 |= var49.method3865((byte) 59, var46);
                        var27 |= var49.method3863(var46, (byte) -115);
                        var29 |= var49.method3861(arg16 ^ 0xD2D, var46);
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
        class49 var58 = class567.field8140;
        class55 var59;
        synchronized (class567.field8140) {
            var59 = (class55) class567.field8140.method560(false, var23);
        }
        class642 var60 = null;
        if (this.field2426 != -1) {
            var60 = arg14.method2674(arg16 - 50, this.field2426);
        }
        if (var59 == null || arg11.method323(var59.method651(), var22) != 0) {
            if (var59 != null) {
                var22 = arg11.method286(var22, var59.method651());
            }
            boolean var62 = false;
            for (int var63 = 0; var63 < 12; var63++) {
                int var64 = var25[var63];
                if ((var64 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var64) != 0 && !arg2.method2465((byte) -92, var64 & 0x3FFFFFFF).method686(0)) {
                        var62 = true;
                    }
                } else if (!arg19.method2859(var64 & 0x3FFFFFFF, (byte) 124).method1047(this.field2418, -118)) {
                    var62 = true;
                }
            }
            if (var62) {
                if (this.field2427 != -1L) {
                    class49 var65 = class567.field8140;
                    synchronized (class567.field8140) {
                        var59 = (class55) class567.field8140.method560(false, this.field2427);
                    }
                }
                if (var59 == null || arg11.method323(var59.method651(), var22) != 0) {
                    return null;
                }
            } else {
                class534[] var66 = new class534[12];
                for (int var67 = 0; var67 < 12; var67++) {
                    int var68 = var25[var67];
                    if ((var68 & 0x40000000) != 0) {
                        class534 var69 = arg19.method2859(var68 & 0x3FFFFFFF, (byte) 122).method1046(this.field2418, (byte) 72);
                        if (var69 != null) {
                            var66[var67] = var69;
                        }
                    } else if ((Integer.MIN_VALUE & var68) != 0) {
                        class534 var70 = arg2.method2465((byte) -61, var68 & 0x3FFFFFFF).method687(arg16 ^ 0xFFFFFFB2);
                        if (var70 != null) {
                            var66[var67] = var70;
                        }
                    }
                }
                if (var60 != null && var60.field9047 != null) {
                    for (int var71 = 0; var71 < var60.field9047.length; var71++) {
                        if (var66[var71] != null) {
                            int var72 = 0;
                            int var73 = 0;
                            int var74 = 0;
                            int var75 = 0;
                            int var76 = 0;
                            int var77 = 0;
                            if (var60.field9047[var71] != null) {
                                var77 = var60.field9047[var71][5] << 3;
                                var73 = var60.field9047[var71][1];
                                var72 = var60.field9047[var71][0];
                                var76 = var60.field9047[var71][4] << 3;
                                var74 = var60.field9047[var71][2];
                                var75 = var60.field9047[var71][3] << 3;
                            }
                            if (var75 != 0 || var76 != 0 || var77 != 0) {
                                var66[var71].method3245(var76, 67, var77, var75);
                            }
                            if (var72 != 0 || var73 != 0 || var74 != 0) {
                                var66[var71].method3234(0, var73, var72, var74);
                            }
                        }
                    }
                }
                int var78 = var22 | 0x4000;
                class534 var79 = new class534(var66, var66.length);
                var59 = arg11.method287(var79, var78, class674.field9510, 64, 850);
                for (int var80 = 0; var80 < 5; var80++) {
                    for (int var81 = 0; var81 < class356.field5686.length; var81++) {
                        if (class356.field5686[var81][var80].length > this.field2424[var80]) {
                            var59.method608(class376.field5859[var81][var80], class356.field5686[var81][var80][this.field2424[var80]]);
                        }
                    }
                }
                if (arg18) {
                    var59.method629(var22);
                    class49 var82 = class567.field8140;
                    synchronized (class567.field8140) {
                        class567.field8140.method559(var59, var23, 0);
                    }
                    this.field2427 = var23;
                }
            }
        }
        class55 var83 = var59.method609((byte) 4, var22, true);
        boolean var84 = false;
        if (arg10 != null) {
            for (int var85 = 0; var85 < 12; var85++) {
                if (arg10[var85] != -1) {
                    var84 = true;
                }
            }
        }
        if (!var30 && !var84) {
            return var83;
        }
        class393[] var86 = null;
        if (var60 != null) {
            var86 = var60.method3720(-1, arg11);
        }
        if (var84 && var86 != null) {
            for (int var87 = 0; var87 < 12; var87++) {
                if (var86[var87] != null) {
                    var83.method634(var86[var87], 0x1 << var87, true);
                }
            }
        }
        int var88 = 0;
        int var89 = 1;
        while (var31 > var88) {
            if (class499.field7331[var88] != null) {
                var83.method630(var89, class362.field5721[var88] - 1, (byte) -58, class632.field8895[var88], class466.field6937[var88], null, 0, false, class499.field7331[var88], class514.field7472[var88], class356.field5682[var88]);
            }
            var88++;
            var89 <<= 0x1;
        }
        if (var84) {
            for (int var90 = 0; var90 < 12; var90++) {
                if (arg10[var90] != -1) {
                    int var91 = arg10[var90] - arg0;
                    int var92 = var91 & 0x3FFF;
                    class393 var93 = arg11.method272();
                    var93.method506(var92);
                    var83.method634(var93, 0x1 << var90, false);
                }
            }
        }
        if (var84 && var86 != null) {
            for (int var94 = 0; var94 < 12; var94++) {
                if (var86[var94] != null) {
                    var83.method634(var86[var94], 0x1 << var94, false);
                }
            }
        }
        if (var43 != null && var48 != null) {
            var83.method621(var43, var46, arg3 - 1, arg9 + -1, var40, var49, var48, var42, var44, var47, arg13.field6535, -9349, var45, false, var41);
        } else if (var43 != null) {
            var83.method635(false, var41, (byte) -127, var44, var42, var40, arg3 - 1, 0, var43);
        } else if (var48 != null) {
            var83.method635(false, var46, (byte) -105, var49, var47, var45, arg9 - 1, 0, var48);
        }
        for (int var95 = 0; var95 < var31; var95++) {
            class499.field7331[var95] = null;
            class356.field5682[var95] = null;
            class28.field433[var95] = null;
        }
        return var83;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(III)V")
    public final void method1220(int arg0, int arg1, int arg2) {
        field2415++;
        if (arg2 == -1) {
            this.field2424[arg0] = arg1;
            this.method1227((byte) -74);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(ILjb;IIILwe;Lhfa;Lqg;Lcr;Lhca;Lr;I)Lda;")
    public final class55 method1221(int arg0, class458 arg1, int arg2, int arg3, int arg4, class374 arg5, class285 arg6, class428 arg7, class533 arg8, class454 arg9, class167 arg10, int arg11) {
        field2422++;
        if (this.field2419 != -1) {
            return arg8.method3224(this.field2419, 50).method3984(arg1, arg11, arg10, arg2, arg3, arg6, arg7, arg0, false);
        }
        int var13 = arg0;
        if (arg7 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg7.field6521[arg3];
            Object var22 = null;
            var13 = arg0 | 0x20;
            int var23 = var21 >>> 16;
            class675 var24 = arg1.method2870(var23, 28133);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3865((byte) 59, var25);
                var14 |= var24.method3863(var25, (byte) 123);
                var17 |= var24.method3861(-3425, var25);
                var16 |= arg7.field6530;
            }
            if ((arg7.field6531 || class436.field6656) && arg2 != -1 && arg2 < arg7.field6521.length) {
                int var26 = arg7.field6521[arg2];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class675 var29 = var23 == var27 ? var24 : arg1.method2870(var27, 28133);
                if (var29 != null) {
                    var15 |= var29.method3865((byte) 59, var28);
                    var14 |= var29.method3863(var28, (byte) 97);
                    var17 |= var29.method3861(-3425, var28);
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
        class49 var30 = class393.field6137;
        class55 var32;
        synchronized (class393.field6137) {
            if (arg4 < 89) {
                return null;
            }
            var32 = (class55) class393.field6137.method560(false, this.field2414);
        }
        if (var32 == null || arg10.method323(var32.method651(), var13) != 0) {
            if (var32 != null) {
                var13 = arg10.method286(var13, var32.method651());
            }
            boolean var34 = false;
            for (int var35 = 0; var35 < 12; var35++) {
                int var36 = this.field2423[var35];
                if ((var36 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var36) != 0 && !arg5.method2465((byte) -64, var36 & 0x3FFFFFFF).method684((byte) 70)) {
                        var34 = true;
                    }
                } else if (!arg9.method2859(var36 & 0x3FFFFFFF, (byte) 124).method1045(this.field2418, (byte) -38)) {
                    var34 = true;
                }
            }
            if (var34) {
                return null;
            }
            class534[] var37 = new class534[12];
            int var38 = 0;
            for (int var39 = 0; var39 < 12; var39++) {
                int var40 = this.field2423[var39];
                if ((var40 & 0x40000000) != 0) {
                    class534 var42 = arg9.method2859(var40 & 0x3FFFFFFF, (byte) 121).method1056((byte) -125, this.field2418);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class534 var41 = arg5.method2465((byte) -80, var40 & 0x3FFFFFFF).method681((byte) -21);
                    if (var41 != null) {
                        var37[var38++] = var41;
                    }
                }
            }
            class534 var43 = new class534(var37, var38);
            int var44 = var13 | 0x4000;
            var32 = arg10.method287(var43, var44, class674.field9510, 64, 768);
            for (int var45 = 0; var45 < 5; var45++) {
                for (int var46 = 0; var46 < class356.field5686.length; var46++) {
                    if (this.field2424[var45] < class356.field5686[var46][var45].length) {
                        var32.method608(class376.field5859[var46][var45], class356.field5686[var46][var45][this.field2424[var45]]);
                    }
                }
            }
            var32.method629(var13);
            class49 var47 = class393.field6137;
            synchronized (class393.field6137) {
                class393.field6137.method559(var32, this.field2414, 0);
            }
        }
        if (arg7 == null) {
            return var32;
        } else {
            var32.method609((byte) 4, var13, true);
            return arg7.method2709((byte) -107, arg3, var32, arg2, arg11, arg0);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(Lqg;IILjb;Lwe;IIIIILr;B)Lda;")
    public final class55 method1222(class428 arg0, int arg1, int arg2, class458 arg3, class374 arg4, int arg5, int arg6, int arg7, int arg8, int arg9, class167 arg10, byte arg11) {
        field2411++;
        int var13 = -53 % ((arg11 - 60) / 57);
        int var14 = arg5;
        if (arg0 != null) {
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = false;
            boolean var19 = true;
            boolean var20 = true;
            Object var21 = null;
            var14 = arg5 | 0x20;
            int var22 = arg0.field6521[arg2];
            Object var23 = null;
            int var24 = var22 >>> 16;
            int var25 = var22 & 0xFFFF;
            class675 var26 = arg3.method2870(var24, 28133);
            if (var26 != null) {
                var16 |= var26.method3865((byte) 59, var25);
                var15 |= var26.method3863(var25, (byte) -67);
                var18 |= var26.method3861(-3425, var25);
                var17 |= arg0.field6530;
            }
            if ((arg0.field6531 || class436.field6656) && arg7 != -1 && arg0.field6521.length > arg7) {
                int var27 = arg0.field6521[arg7];
                int var28 = var27 >>> 16;
                int var29 = var27 & 0xFFFF;
                class675 var30;
                if (var24 == var28) {
                    var30 = var26;
                } else {
                    var30 = arg3.method2870(var29 >>> 16, 28133);
                }
                if (var30 != null) {
                    var16 |= var30.method3865((byte) 59, var29);
                    var15 |= var30.method3863(var29, (byte) -66);
                    var18 |= var30.method3861(-3425, var29);
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
        long var31 = (long) arg8 << 32 | (long) (arg6 << 16) | (long) arg1;
        class49 var33 = class393.field6137;
        class55 var34;
        synchronized (class393.field6137) {
            var34 = (class55) class393.field6137.method560(false, var31);
        }
        if (var34 == null || arg10.method323(var34.method651(), var14) != 0) {
            if (var34 != null) {
                var14 = arg10.method286(var14, var34.method651());
            }
            class534[] var36 = new class534[3];
            int var37 = 0;
            if (!arg4.method2465((byte) -110, arg1).method684((byte) 70) || !arg4.method2465((byte) -122, arg6).method684((byte) 70) || !arg4.method2465((byte) -82, arg8).method684((byte) 70)) {
                return null;
            }
            class534 var38 = arg4.method2465((byte) -79, arg1).method681((byte) -21);
            if (var38 != null) {
                var36[var37++] = var38;
            }
            class534 var39 = arg4.method2465((byte) -67, arg6).method681((byte) -21);
            if (var39 != null) {
                var36[var37++] = var39;
            }
            class534 var40 = arg4.method2465((byte) -71, arg8).method681((byte) -21);
            if (var40 != null) {
                var36[var37++] = var40;
            }
            int var41 = var14 | 0x4000;
            class534 var42 = new class534(var36, var37);
            var34 = arg10.method287(var42, var41, class674.field9510, 64, 768);
            for (int var43 = 0; var43 < 5; var43++) {
                for (int var44 = 0; var44 < class356.field5686.length; var44++) {
                    if (this.field2424[var43] < class356.field5686[var44][var43].length) {
                        var34.method608(class376.field5859[var44][var43], class356.field5686[var44][var43][this.field2424[var43]]);
                    }
                }
            }
            var34.method629(var14);
            class49 var45 = class393.field6137;
            synchronized (class393.field6137) {
                class393.field6137.method559(var34, var31, 0);
            }
        }
        if (arg0 == null) {
            return var34;
        } else {
            class55 var46 = var34.method609((byte) 4, var14, true);
            return arg0.method2709((byte) -109, arg2, var46, arg7, arg9, arg5);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(BZ)V")
    public final void method1223(byte arg0, boolean arg1) {
        int var3 = 73 / ((arg0 - 67) / 46);
        field2417++;
        this.field2418 = arg1;
        this.method1227((byte) 88);
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(IILwe;B)V")
    public final void method1224(int arg0, int arg1, class374 arg2, byte arg3) {
        int var5 = -68 / ((-arg3 - 72) / 44);
        field2425++;
        int var6 = class435.field6623[arg0];
        if (arg2.method2465((byte) -96, arg1) != null) {
            this.field2423[var6] = class81.method769(Integer.MIN_VALUE, arg1);
            this.method1227((byte) -62);
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(I)V")
    public static final void method1225(int arg0) {
        if (class265.field4319 == arg0 || class265.field4319 == 3 || class438.field6673 != class265.field4319 && (class265.field4319 == 0 || class438.field6673 == 0)) {
            class283.field4523 = 0;
            class289.field4581 = 0;
            class592.field8395.method1562((byte) -14);
        }
        field2420++;
        class438.field6673 = class265.field4319;
    }

    @OriginalMember(owner = "client!hq", name = "b", descriptor = "(I)V")
    public static void method1226(int arg0) {
        field2416 = null;
        if (arg0 != 12) {
            field2416 = null;
        }
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "(B)V")
    private final void method1227(byte arg0) {
        int var2 = 112 % ((arg0 - 5) / 36);
        field2421++;
        long[] var3 = class114.field1792;
        this.field2414 = -1L;
        this.field2414 = var3[(int) (((long) (this.field2426 >> 8) ^ this.field2414) & 0xFFL)] ^ this.field2414 >>> 8;
        this.field2414 = this.field2414 >>> 8 ^ var3[(int) ((this.field2414 ^ (long) this.field2426) & 0xFFL)];
        for (int var4 = 0; var4 < 12; var4++) {
            this.field2414 = this.field2414 >>> 8 ^ var3[(int) ((this.field2414 ^ (long) (this.field2423[var4] >> 24)) & 0xFFL)];
            this.field2414 = this.field2414 >>> 8 ^ var3[(int) ((this.field2414 ^ (long) (this.field2423[var4] >> 16)) & 0xFFL)];
            this.field2414 = var3[(int) (((long) (this.field2423[var4] >> 8) ^ this.field2414) & 0xFFL)] ^ this.field2414 >>> 8;
            this.field2414 = var3[(int) ((this.field2414 ^ (long) this.field2423[var4]) & 0xFFL)] ^ this.field2414 >>> 8;
        }
        for (int var5 = 0; var5 < 5; var5++) {
            this.field2414 = var3[(int) (((long) this.field2424[var5] ^ this.field2414) & 0xFFL)] ^ this.field2414 >>> 8;
        }
        this.field2414 = var3[(int) (((long) (this.field2418 ? 1 : 0) ^ this.field2414) & 0xFFL)] ^ this.field2414 >>> 8;
    }

    @OriginalMember(owner = "client!hq", name = "a", descriptor = "([II[IIZI)V")
    public final void method1228(int[] arg0, int arg1, int[] arg2, int arg3, boolean arg4, int arg5) {
        this.field2424 = arg2;
        field2412++;
        this.field2419 = arg1;
        if (this.field2426 != arg3) {
            this.field2426 = arg3;
        }
        this.field2423 = arg0;
        this.field2418 = arg4;
        this.method1227((byte) -74);
        if (arg5 >= -53) {
            this.field2427 = 1L;
        }
    }
}
