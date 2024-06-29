import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class296 {

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "I")
    public int field4241 = -1;

    @OriginalMember(owner = "client!ls", name = "d", descriptor = "I")
    public static int field4244 = 0;

    @OriginalMember(owner = "client!ls", name = "l", descriptor = "Ljava/lang/String;")
    public static String field4252 = "Opened title screen";

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "I")
    public static int field4242;

    @OriginalMember(owner = "client!ls", name = "e", descriptor = "I")
    public static int field4245;

    @OriginalMember(owner = "client!ls", name = "f", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!ls", name = "g", descriptor = "I")
    public static int field4247;

    @OriginalMember(owner = "client!ls", name = "h", descriptor = "I")
    public static int field4248;

    @OriginalMember(owner = "client!ls", name = "j", descriptor = "I")
    public static int field4250;

    @OriginalMember(owner = "client!ls", name = "m", descriptor = "I")
    private int field4253;

    @OriginalMember(owner = "client!ls", name = "n", descriptor = "I")
    public static int field4254;

    @OriginalMember(owner = "client!ls", name = "o", descriptor = "I")
    public static int field4255;

    @OriginalMember(owner = "client!ls", name = "t", descriptor = "I")
    public static int field4260;

    @OriginalMember(owner = "client!ls", name = "u", descriptor = "I")
    public static int field4261;

    @OriginalMember(owner = "client!ls", name = "v", descriptor = "I")
    public static int field4262;

    @OriginalMember(owner = "client!ls", name = "w", descriptor = "I")
    public static int field4263;

    @OriginalMember(owner = "client!ls", name = "i", descriptor = "J")
    private long field4249;

    @OriginalMember(owner = "client!ls", name = "k", descriptor = "J")
    private long field4251;

    @OriginalMember(owner = "client!ls", name = "q", descriptor = "Lii;")
    public static class405 field4257;

    @OriginalMember(owner = "client!ls", name = "p", descriptor = "Z")
    public boolean field4256;

    @OriginalMember(owner = "client!ls", name = "r", descriptor = "[I")
    public int[] field4258;

    @OriginalMember(owner = "client!ls", name = "s", descriptor = "[I")
    private int[] field4259;

    @OriginalMember(owner = "client!ls", name = "c", descriptor = "[[I")
    private int[][] field4243;

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lii;IILrj;IIZ[Lmc;ILrj;III)Ldc;", line = 5)
    public final class375 method2021(class405 arg0, int arg1, int arg2, class12 arg3, int arg4, int arg5, boolean arg6, class316[] arg7, int arg8, class12 arg9, int arg10, int arg11, int arg12) {
        field4247++;
        if (this.field4241 != -1) {
            return class119.method771((byte) 113, this.field4241).method1507(arg3, arg1, arg0, (byte) -107, arg4, arg10, arg7, arg8, arg11, arg5, arg12, arg9);
        }
        int var14 = arg5;
        long var15 = this.field4249;
        int[] var17 = this.field4259;
        if (arg9 != null && (arg9.field188 >= 0 || arg9.field192 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field4259[var18];
            }
            if (arg9.field188 >= 0) {
                if (arg9.field188 == 65535) {
                    var15 ^= 0xFFFFFFFF00000000L;
                    var17[5] = 0;
                } else {
                    var17[5] = class351.method2313(arg9.field188, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg9.field192 >= 0) {
                if (arg9.field192 == 65535) {
                    var15 ^= 0xFFFFFFFFL;
                    var17[3] = 0;
                } else {
                    var17[3] = class351.method2313(arg9.field192, 1073741824);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg9 != null || arg3 != null;
        int var22 = arg7 == null ? 0 : arg7.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class213.field2855[var23] = null;
            if (arg7[var23] != null) {
                class12 var24 = class33.method221((byte) 102, arg7[var23].field4621);
                if (var24.field182 != null) {
                    var21 = true;
                    class229.field3068[var23] = var24;
                    int var25 = arg7[var23].field4619;
                    int var26 = arg7[var23].field4618;
                    int var27 = var24.field182[var25];
                    class213.field2855[var23] = class307.method2093(3, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class134.field1872[var23] = var28;
                    if (class213.field2855[var23] != null) {
                        var20 |= class213.field2855[var23].method2782((byte) 87, var28);
                        var19 |= class213.field2855[var23].method2783(var28, (byte) -83);
                    }
                    if ((var24.field196 || class120.field1676) && var26 != -1 && var24.field182.length > var26) {
                        class272.field3942[var23] = var24.field176[var25];
                        class200.field2664[var23] = arg7[var23].field4612;
                        int var29 = var24.field182[var26];
                        class93.field1338[var23] = class307.method2093(3, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class164.field2215[var23] = var30;
                        if (class93.field1338[var23] != null) {
                            var20 |= class93.field1338[var23].method2782((byte) 87, var30);
                            var19 |= class93.field1338[var23].method2783(var30, (byte) -83);
                        }
                    } else {
                        class272.field3942[var23] = 0;
                        class200.field2664[var23] = 0;
                        class93.field1338[var23] = null;
                        class164.field2215[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class442 var34 = null;
        if (arg2 >= -17) {
            method2022(93, -38, 33, -28);
        }
        class442 var35 = null;
        int var36 = -1;
        int var37 = -1;
        int var38 = 0;
        class442 var39 = null;
        class442 var40 = null;
        if (var21) {
            if (arg9 != null) {
                int var41 = arg9.field182[arg4];
                int var42 = var41 >>> 16;
                var34 = class307.method2093(3, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method2782((byte) 87, var31);
                    var19 |= var34.method2783(var31, (byte) -83);
                }
                if ((arg9.field196 || class120.field1676) && arg12 != -1 && arg12 < arg9.field182.length) {
                    int var43 = arg9.field182[arg12];
                    var33 = arg9.field176[arg4];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    if (var42 == var44) {
                        var35 = var34;
                    } else {
                        var35 = class307.method2093(3, var32 >>> 16);
                    }
                    if (var35 != null) {
                        var20 |= var35.method2782((byte) 87, var32);
                        var19 |= var35.method2783(var32, (byte) -83);
                    }
                }
            }
            var14 = arg5 | 0x20;
            if (arg3 != null) {
                int var45 = arg3.field182[arg11];
                int var46 = var45 >>> 16;
                var39 = class307.method2093(3, var46);
                var36 = var45 & 0xFFFF;
                if (var39 != null) {
                    var20 |= var39.method2782((byte) 87, var36);
                    var19 |= var39.method2783(var36, (byte) -83);
                }
                if ((arg3.field196 || class120.field1676) && arg10 != -1 && arg10 < arg3.field182.length) {
                    int var47 = arg3.field182[arg10];
                    var38 = arg3.field176[arg11];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    if (var46 == var48) {
                        var40 = var39;
                    } else {
                        var40 = class307.method2093(3, var37 >>> 16);
                    }
                    if (var40 != null) {
                        var20 |= var40.method2782((byte) 87, var37);
                        var19 |= var40.method2783(var37, (byte) -83);
                    }
                }
            }
            if (var20) {
                var14 |= 0x80;
            }
            if (var19) {
                var14 |= 0x100;
            }
        }
        class189 var49 = class211.field2822;
        class375 var50;
        synchronized (class211.field2822) {
            var50 = (class375) class211.field2822.method1137(var15, 2108653711);
        }
        class396 var51 = null;
        if (this.field4253 != -1) {
            var51 = class354.method2329(this.field4253, -115);
        }
        if (var50 == null || arg0.method1643(var50.method1608(), var14) != 0 || var51 != null && var51.field5888 != null && this.field4243 == null) {
            if (var50 != null) {
                var14 = arg0.method1620(var14, var50.method1608());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field4251 != -1L) {
                            class189 var56 = class211.field2822;
                            synchronized (class211.field2822) {
                                var50 = (class375) class211.field2822.method1137(this.field4251, 2108653711);
                            }
                        }
                        if (var50 == null || arg0.method1643(var50.method1608(), var14) != 0 || var51 != null && var51.field5888 != null && this.field4243 == null) {
                            return null;
                        }
                    } else {
                        class245[] var57 = new class245[12];
                        for (int var58 = 0; var58 < 12; var58++) {
                            int var59 = var17[var58];
                            if ((var59 & 0x40000000) != 0) {
                                class245 var60 = class9.method74(var59 & 0x3FFFFFFF, (byte) 96).method585(-125, this.field4256);
                                if (var60 != null) {
                                    var57[var58] = var60;
                                }
                            } else if ((Integer.MIN_VALUE & var59) != 0) {
                                class245 var61 = class84.method606(var59 & 0x3FFFFFFF, 87).method282(0);
                                if (var61 != null) {
                                    var57[var58] = var61;
                                }
                            }
                        }
                        if (var51 != null && var51.field5888 != null) {
                            for (int var62 = 0; var62 < var51.field5888.length; var62++) {
                                if (var51.field5888[var62] != null && var57[var62] != null) {
                                    int var63 = var51.field5888[var62][0];
                                    int var64 = var51.field5888[var62][1];
                                    int var65 = var51.field5888[var62][2];
                                    int var66 = var51.field5888[var62][3] << 3;
                                    int var67 = var51.field5888[var62][4] << 3;
                                    int var68 = var51.field5888[var62][5] << 3;
                                    if (this.field4243 == null) {
                                        this.field4243 = new int[var51.field5888.length][];
                                    }
                                    if (this.field4243[var62] == null) {
                                        int[] var69 = this.field4243[var62] = new int[15];
                                        if (var66 == 0 && var67 == 0 && var68 == 0) {
                                            var69[12] = -var63;
                                            var69[0] = var69[4] = var69[8] = 32768;
                                            var69[14] = -var65;
                                            var69[13] = -var64;
                                        } else {
                                            int var70 = class117.field1636[var66];
                                            int var71 = class117.field1644[var66];
                                            int var72 = class117.field1636[var67];
                                            int var73 = class117.field1644[var67];
                                            int var74 = class117.field1636[var68];
                                            int var75 = class117.field1644[var68];
                                            int var76 = var71 * var74 + 16384 >> 15;
                                            int var77 = var71 * var75 + 16384 >> 15;
                                            var69[4] = var70 * var74 + 16384 >> 15;
                                            var69[7] = -var73 * -var75 + (var72 * var76) + 16384 >> 15;
                                            var69[8] = var70 * var72 + 16384 >> 15;
                                            var69[0] = var72 * var74 + var73 * var77 + 16384 >> 15;
                                            var69[3] = var70 * var75 + 16384 >> 15;
                                            var69[5] = -var71;
                                            var69[1] = -var75 * var72 + var73 * var76 + 16384 >> 15;
                                            var69[2] = var70 * var73 + 16384 >> 15;
                                            var69[6] = -var73 * var74 + var72 * var77 + 16384 >> 15;
                                            var69[13] = var69[4] * -var64 + (var69[1] * -var63 + var69[7] * -var65 + 16384) >> 15;
                                            var69[14] = var69[2] * -var63 + (var69[5] * -var64) + (var69[8] * -var65 - -16384) >> 15;
                                            var69[12] = var69[0] * -var63 + (var69[3] * -var64) + var69[6] * -var65 + 16384 >> 15;
                                        }
                                        var69[9] = var63;
                                        var69[11] = var65;
                                        var69[10] = var64;
                                    }
                                    if (var66 != 0 || var67 != 0 || var68 != 0) {
                                        var57[var62].method1474((byte) -126, var68, var67, var66);
                                    }
                                    if (var63 != 0 || var64 != 0 || var65 != 0) {
                                        var57[var62].method1483(var65, var63, var64, (byte) 97);
                                    }
                                }
                            }
                        }
                        class245 var78 = new class245(var57, var57.length);
                        int var79 = var14 | 0x2000;
                        var50 = arg0.method1715(var78, var79, class167.field2249, 64, 850);
                        for (int var80 = 0; var80 < 5; var80++) {
                            if (this.field4258[var80] < class442.field6478[var80].length) {
                                var50.method1569(class308.field4539[var80], class442.field6478[var80][this.field4258[var80]]);
                            }
                            if (class98.field1371[var80].length > this.field4258[var80]) {
                                var50.method1569(class394.field5729[var80], class98.field1371[var80][this.field4258[var80]]);
                            }
                        }
                        if (arg6) {
                            var50.method1593(var14);
                            class189 var81 = class211.field2822;
                            synchronized (class211.field2822) {
                                class211.field2822.method1144(var15, var50, -3480);
                            }
                            this.field4251 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var55) != 0 && !class84.method606(var55 & 0x3FFFFFFF, 125).method288(104)) {
                        var53 = true;
                    }
                } else if (!class9.method74(var55 & 0x3FFFFFFF, (byte) -52).method596(this.field4256, 91)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class375 var82 = var50.method1568((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var83 < var22) {
            if (class213.field2855[var83] != null) {
                var82.method2422(true, this.field4243 == null ? null : this.field4243[var83], class213.field2855[var83], var84, class164.field2215[var83], class272.field3942[var83], class134.field1872[var83], class200.field2664[var83] - 1, class93.field1338[var83], false, 0);
            }
            var84 <<= 0x1;
            var83++;
        }
        if (var34 != null && var39 != null) {
            var82.method2425(arg9.field187, arg8 - 1, 0, var40, var37, arg1 - 1, var34, var31, var36, var33, var32, var39, var38, var35, false);
        } else if (var34 != null) {
            var82.method2429(var31, var33, var35, arg8 - 1, 2, var32, 0, var34, false);
        } else if (var39 != null) {
            var82.method2429(var36, var38, var40, arg1 - 1, 2, var37, 0, var39, false);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class213.field2855[var85] = null;
            class93.field1338[var85] = null;
            class229.field3068[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIII)V", line = 510)
    public static final void method2022(int arg0, int arg1, int arg2, int arg3) {
        field4245++;
        class263 var4 = class47.method337(arg3, 0, arg2);
        var4.method1807((byte) -125);
        var4.field3820 = arg1;
        var4.field3813 = arg0;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(ZLjava/lang/String;)Ljava/lang/String;", line = 527)
    public static final String method2023(boolean arg0, String arg1) {
        if (!arg0) {
            return null;
        }
        field4261++;
        String var2 = class198.method1177(3, class126.method802((byte) 107, arg1));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Lrj;IIIIIIILii;I)Ldc;", line = 550)
    public final class375 method2024(class12 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class405 arg8, int arg9) {
        field4250++;
        int var11 = arg6;
        if (arg0 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            Object var18 = null;
            var11 = arg6 | 0x20;
            int var19 = arg0.field182[arg3];
            int var20 = var19 >>> 16;
            class442 var21 = class307.method2093(arg7 + 4, var20);
            int var22 = var19 & 0xFFFF;
            if (var21 != null) {
                var13 |= var21.method2782((byte) 87, var22);
                var12 |= var21.method2783(var22, (byte) -83);
                var14 |= arg0.field201;
            }
            if ((arg0.field196 || class120.field1676) && arg9 != -1 && arg9 < arg0.field182.length) {
                int var23 = arg0.field182[arg9];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class442 var26;
                if (var20 == var24) {
                    var26 = var21;
                } else {
                    var26 = class307.method2093(arg7 + 4, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method2782((byte) 87, var25);
                    var12 |= var26.method2783(var25, (byte) -83);
                }
            }
            if (var13) {
                var11 |= 0x80;
            }
            if (var12) {
                var11 |= 0x100;
            }
            if (var14) {
                var11 |= 0x200;
            }
        }
        long var27 = (long) arg5 << 32 | (long) (arg1 << 16) | (long) arg4;
        class189 var29 = class143.field1939;
        class375 var30;
        synchronized (class143.field1939) {
            var30 = (class375) class143.field1939.method1137(var27, 2108653711);
        }
        if (arg7 != -1) {
            this.field4259 = null;
        }
        if (var30 == null || arg8.method1643(var30.method1608(), var11) != 0) {
            if (var30 != null) {
                var11 = arg8.method1620(var11, var30.method1608());
            }
            class245[] var32 = new class245[3];
            int var33 = 0;
            if (!class84.method606(arg4, arg7 + 107).method283((byte) 125) || !class84.method606(arg1, -107).method283((byte) 97) || !class84.method606(arg5, 35).method283((byte) 106)) {
                return null;
            }
            class245 var34 = class84.method606(arg4, -116).method291(5);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class245 var35 = class84.method606(arg1, 9).method291(arg7 ^ 0xFFFFFFFA);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class245 var36 = class84.method606(arg5, 88).method291(5);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class245 var38 = new class245(var32, var33);
            var30 = arg8.method1715(var38, var37, class167.field2249, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (this.field4258[var39] < class442.field6478[var39].length) {
                    var30.method1569(class308.field4539[var39], class442.field6478[var39][this.field4258[var39]]);
                }
                if (this.field4258[var39] < class98.field1371[var39].length) {
                    var30.method1569(class394.field5729[var39], class98.field1371[var39][this.field4258[var39]]);
                }
            }
            var30.method1593(var11);
            class189 var40 = class143.field1939;
            synchronized (class143.field1939) {
                class143.field1939.method1144(var27, var30, -3480);
            }
        }
        if (arg0 == null) {
            return var30;
        } else {
            class375 var41 = var30.method1568((byte) 1, var11, true);
            return arg0.method90((byte) 81, var41, arg6, arg3, arg2, arg9);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(B)V", line = 694)
    public static final void method2025(byte arg0) {
        if (arg0 != 56) {
            return;
        }
        field4246++;
        if (class11.method79((byte) 63) || class227.field2981 == class200.field2661) {
            class349.method2302(arg0 ^ 0xC, class61.field807);
            if (class310.field4562 != class227.field2981) {
                class43.method313(123);
            }
        } else {
            class419.method2683(false, class179.field2373, class227.field2981, class220.field2905, false, class227.field2988.field4360[0], class227.field2988.field4362[0], 128);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(I)V", line = 714)
    public static void method2026(int arg0) {
        int var1 = -52 % ((arg0 + 17) / 39);
        field4257 = null;
        field4252 = null;
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(Z[I[IIII)V", line = 727)
    public final void method2027(boolean arg0, int[] arg1, int[] arg2, int arg3, int arg4, int arg5) {
        if (arg4 != -9) {
            method2022(73, 52, 76, 15);
        }
        field4262++;
        if (this.field4253 != arg3) {
            this.field4243 = null;
            this.field4253 = arg3;
        }
        if (arg2 == null) {
            arg2 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class162.field2172; var8++) {
                    class40 var9 = class84.method606(var8, -108);
                    if (var9 != null && !var9.field558 && var9.field552 == (arg0 ? class45.field638[var7] : class395.field5838[var7])) {
                        arg2[class40.field550[var7]] = class351.method2313(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field4241 = arg5;
        this.field4259 = arg2;
        this.field4256 = arg0;
        this.field4258 = arg1;
        this.method2029((byte) 17);
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IZ)V", line = 781)
    public final void method2028(int arg0, boolean arg1) {
        if (arg0 == 512) {
            this.field4256 = arg1;
            field4255++;
            this.method2029((byte) 99);
        }
    }

    @OriginalMember(owner = "client!ls", name = "b", descriptor = "(B)V", line = 794)
    private final void method2029(byte arg0) {
        field4260++;
        long[] var2 = class397.field5895;
        this.field4249 = -1L;
        this.field4249 = var2[(int) ((this.field4249 ^ (long) (this.field4253 >> 8)) & 0xFFL)] ^ this.field4249 >>> 8;
        this.field4249 = var2[(int) (((long) this.field4253 ^ this.field4249) & 0xFFL)] ^ this.field4249 >>> 8;
        if (arg0 < 4) {
            this.method2021((class405) null, 54, 13, (class12) null, -55, -13, true, (class316[]) null, 107, (class12) null, -94, 71, 119);
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field4249 = var2[(int) ((this.field4249 ^ (long) (this.field4259[var3] >> 24)) & 0xFFL)] ^ this.field4249 >>> 8;
            this.field4249 = this.field4249 >>> 8 ^ var2[(int) (((long) (this.field4259[var3] >> 16) ^ this.field4249) & 0xFFL)];
            this.field4249 = this.field4249 >>> 8 ^ var2[(int) ((this.field4249 ^ (long) (this.field4259[var3] >> 8)) & 0xFFL)];
            this.field4249 = this.field4249 >>> 8 ^ var2[(int) (((long) this.field4259[var3] ^ this.field4249) & 0xFFL)];
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field4249 = this.field4249 >>> 8 ^ var2[(int) (((long) this.field4258[var4] ^ this.field4249) & 0xFFL)];
        }
        this.field4249 = this.field4249 >>> 8 ^ var2[(int) ((this.field4249 ^ (long) (this.field4256 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(III)V", line = 838)
    public final void method2030(int arg0, int arg1, int arg2) {
        field4248++;
        int var4 = class40.field550[arg2];
        int var5 = 99 % ((arg0 - 50) / 40);
        if (this.field4259[var4] != 0 && class84.method606(arg1, -119) != null) {
            this.field4259[var4] = class351.method2313(Integer.MIN_VALUE, arg1);
            this.method2029((byte) 109);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIILii;ILrj;I)Ldc;", line = 862)
    public final class375 method2031(int arg0, int arg1, int arg2, class405 arg3, int arg4, class12 arg5, int arg6) {
        field4263++;
        if (this.field4241 != -1) {
            return class119.method771((byte) 127, this.field4241).method1505(arg4, arg0, arg6, arg3, arg2, -1, arg5);
        }
        int var8 = arg6;
        if (arg5 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            Object var15 = null;
            var8 = arg6 | 0x20;
            int var16 = arg5.field182[arg4];
            int var17 = var16 >>> 16;
            class442 var18 = class307.method2093(3, var17);
            int var19 = var16 & 0xFFFF;
            if (var18 != null) {
                var10 |= var18.method2782((byte) 87, var19);
                var9 |= var18.method2783(var19, (byte) -83);
                var11 |= arg5.field201;
            }
            if ((arg5.field196 || class120.field1676) && arg0 != -1 && arg5.field182.length > arg0) {
                int var20 = arg5.field182[arg0];
                int var21 = var20 >>> 16;
                int var22 = var20 & 0xFFFF;
                class442 var23;
                if (var17 == var21) {
                    var23 = var18;
                } else {
                    var23 = class307.method2093(3, var22 >>> 16);
                }
                if (var23 != null) {
                    var10 |= var23.method2782((byte) 87, var22);
                    var9 |= var23.method2783(var22, (byte) -83);
                }
            }
            if (var10) {
                var8 |= 0x80;
            }
            if (var9) {
                var8 |= 0x100;
            }
            if (var11) {
                var8 |= 0x200;
            }
        }
        class189 var24 = class143.field1939;
        class375 var25;
        synchronized (class143.field1939) {
            var25 = (class375) class143.field1939.method1137(this.field4249, 2108653711);
            if (arg1 != 18520) {
                this.method2031(40, -82, 13, (class405) null, -125, (class12) null, 124);
            }
        }
        if (var25 == null || arg3.method1643(var25.method1608(), var8) != 0) {
            if (var25 != null) {
                var8 = arg3.method1620(var8, var25.method1608());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field4259[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class84.method606(var29 & 0x3FFFFFFF, arg1 - 18632).method283((byte) 99)) {
                        var27 = true;
                    }
                } else if (!class9.method74(var29 & 0x3FFFFFFF, (byte) 121).method582(arg1 - 18520, this.field4256)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class245[] var30 = new class245[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field4259[var32];
                if ((var33 & 0x40000000) != 0) {
                    class245 var34 = class9.method74(var33 & 0x3FFFFFFF, (byte) 111).method583((byte) -95, this.field4256);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((Integer.MIN_VALUE & var33) != 0) {
                    class245 var35 = class84.method606(var33 & 0x3FFFFFFF, -118).method291(arg1 - 18515);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            class245 var36 = new class245(var30, var31);
            int var37 = var8 | 0x2000;
            var25 = arg3.method1715(var36, var37, class167.field2249, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (class442.field6478[var38].length > this.field4258[var38]) {
                    var25.method1569(class308.field4539[var38], class442.field6478[var38][this.field4258[var38]]);
                }
                if (this.field4258[var38] < class98.field1371[var38].length) {
                    var25.method1569(class394.field5729[var38], class98.field1371[var38][this.field4258[var38]]);
                }
            }
            var25.method1593(var8);
            class189 var39 = class143.field1939;
            synchronized (class143.field1939) {
                class143.field1939.method1144(this.field4249, var25, -3480);
            }
        }
        if (arg5 == null) {
            return var25;
        } else {
            var25.method1568((byte) 1, var8, true);
            return arg5.method90((byte) -118, var25, arg6, arg4, arg2, arg0);
        }
    }

    @OriginalMember(owner = "client!ls", name = "a", descriptor = "(IIB)V", line = 1049)
    public final void method2032(int arg0, int arg1, byte arg2) {
        field4254++;
        this.field4258[arg0] = arg1;
        this.method2029((byte) 82);
        if (arg2 != -74) {
            this.field4253 = 92;
        }
    }
}
