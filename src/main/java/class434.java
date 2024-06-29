import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eq")
public class class434 {

    @OriginalMember(owner = "client!eq", name = "j", descriptor = "I")
    public int field5928 = -1;

    @OriginalMember(owner = "client!eq", name = "k", descriptor = "F")
    public static float field5929 = 0.0F;

    @OriginalMember(owner = "client!eq", name = "l", descriptor = "I")
    public static int field5930 = 0;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "I")
    public static int field5919;

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "I")
    public static int field5921;

    @OriginalMember(owner = "client!eq", name = "g", descriptor = "I")
    public static int field5925;

    @OriginalMember(owner = "client!eq", name = "h", descriptor = "I")
    public static int field5926;

    @OriginalMember(owner = "client!eq", name = "i", descriptor = "I")
    public static int field5927;

    @OriginalMember(owner = "client!eq", name = "m", descriptor = "I")
    public static int field5931;

    @OriginalMember(owner = "client!eq", name = "n", descriptor = "I")
    private int field5932;

    @OriginalMember(owner = "client!eq", name = "o", descriptor = "I")
    public static int field5933;

    @OriginalMember(owner = "client!eq", name = "q", descriptor = "I")
    public static int field5935;

    @OriginalMember(owner = "client!eq", name = "t", descriptor = "I")
    public static int field5938;

    @OriginalMember(owner = "client!eq", name = "u", descriptor = "I")
    public static int field5939;

    @OriginalMember(owner = "client!eq", name = "w", descriptor = "I")
    public static int field5941;

    @OriginalMember(owner = "client!eq", name = "x", descriptor = "I")
    public static int field5942;

    @OriginalMember(owner = "client!eq", name = "y", descriptor = "I")
    public static int field5943;

    @OriginalMember(owner = "client!eq", name = "e", descriptor = "J")
    private long field5923;

    @OriginalMember(owner = "client!eq", name = "s", descriptor = "J")
    private long field5937;

    @OriginalMember(owner = "client!eq", name = "r", descriptor = "Lwo;")
    public static class285 field5936;

    @OriginalMember(owner = "client!eq", name = "d", descriptor = "Lwr;")
    public static class450 field5922;

    @OriginalMember(owner = "client!eq", name = "v", descriptor = "Z")
    public boolean field5940;

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "[I")
    private int[] field5920;

    @OriginalMember(owner = "client!eq", name = "f", descriptor = "[I")
    public int[] field5924;

    @OriginalMember(owner = "client!eq", name = "p", descriptor = "[I")
    public static int[] field5934;

    @OriginalMember(owner = "client!eq", name = "z", descriptor = "[[I")
    private int[][] field5944;

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIIIILuo;ILbo;II)Lge;")
    public final class386 method2643(int arg0, int arg1, int arg2, int arg3, int arg4, class118 arg5, int arg6, class156 arg7, int arg8, int arg9) {
        field5938++;
        int var11 = arg3;
        if (arg7 != null) {
            boolean var12 = false;
            boolean var13 = false;
            boolean var14 = false;
            boolean var15 = true;
            boolean var16 = true;
            Object var17 = null;
            int var18 = arg7.field1821[arg4];
            var11 = arg3 | 0x20;
            Object var19 = null;
            int var20 = var18 >>> 16;
            int var21 = var18 & 0xFFFF;
            class140 var22 = class57.method320(-16, var20);
            if (var22 != null) {
                var13 |= var22.method894(var21, ~arg0);
                var12 |= var22.method900((byte) -122, var21);
                var14 |= arg7.field1807;
            }
            if ((arg7.field1816 || class338.field4610) && arg1 != -1 && arg1 < arg7.field1821.length) {
                int var23 = arg7.field1821[arg1];
                int var24 = var23 >>> 16;
                int var25 = var23 & 0xFFFF;
                class140 var26;
                if (var20 == var24) {
                    var26 = var22;
                } else {
                    var26 = class57.method320(-16, var25 >>> 16);
                }
                if (var26 != null) {
                    var13 |= var26.method894(var25, 0);
                    var12 |= var26.method900((byte) -125, var25);
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
        long var27 = (long) arg8 | (long) arg2 << 32 | (long) (arg6 << 16);
        class365 var29 = class20.field219;
        class386 var30;
        synchronized (class20.field219) {
            if (arg0 != -1) {
                method2649((class416) null, 21, 36, 73, (boolean[]) null);
            }
            var30 = (class386) class20.field219.method2295(var27, (byte) 74);
        }
        if (var30 == null || arg5.method721(var30.method1465(), var11) != 0) {
            if (var30 != null) {
                var11 = arg5.method707(var11, var30.method1465());
            }
            class402[] var32 = new class402[3];
            int var33 = 0;
            if (!class6.method28(arg8, 115).method556((byte) -114) || !class6.method28(arg6, 102).method556((byte) -62) || !class6.method28(arg2, 127).method556((byte) -105)) {
                return null;
            }
            class402 var34 = class6.method28(arg8, 119).method552(-30898);
            if (var34 != null) {
                var32[var33++] = var34;
            }
            class402 var35 = class6.method28(arg6, 120).method552(-30898);
            if (var35 != null) {
                var32[var33++] = var35;
            }
            class402 var36 = class6.method28(arg2, arg0 ^ 0xFFFFFF83).method552(-30898);
            if (var36 != null) {
                var32[var33++] = var36;
            }
            int var37 = var11 | 0x2000;
            class402 var38 = new class402(var32, var33);
            var30 = arg5.method701(var38, var37, class161.field1867, 64, 768);
            for (int var39 = 0; var39 < 5; var39++) {
                if (class50.field579[var39].length > this.field5924[var39]) {
                    var30.method1463(class184.field2127[var39], class50.field579[var39][this.field5924[var39]]);
                }
                if (class345.field4684[var39].length > this.field5924[var39]) {
                    var30.method1463(class423.field5793[var39], class345.field4684[var39][this.field5924[var39]]);
                }
            }
            var30.method1460(var11);
            class365 var40 = class20.field219;
            synchronized (class20.field219) {
                class20.field219.method2294(var30, (byte) 60, var27);
            }
        }
        if (arg7 == null) {
            return var30;
        } else {
            class386 var41 = var30.method1459((byte) 1, var11, true);
            return arg7.method997(arg9, arg3, (byte) -120, arg4, arg1, var41);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(III)V")
    public static final void method2644(int arg0, int arg1, int arg2) {
        field5942++;
        if (arg2 != -23764) {
            field5929 = -0.47493613F;
        }
        class12 var3 = class390.method2422(341555040, 0, 15);
        var3.method66(-97);
        var3.field144 = arg1;
        var3.field152 = arg0;
    }

    @OriginalMember(owner = "client!eq", name = "b", descriptor = "(III)V")
    public final void method2645(int arg0, int arg1, int arg2) {
        field5926++;
        int var4 = class416.field5699[arg0];
        if (this.field5920[var4] != 0 && arg1 == -26193 && class6.method28(arg2, 108) != null) {
            this.field5920[var4] = class213.method1307(arg2, Integer.MIN_VALUE);
            this.method2648(-120);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BIIILuo;Lbo;Lbo;ZII[Lrr;II)Lge;")
    public final class386 method2646(byte arg0, int arg1, int arg2, int arg3, class118 arg4, class156 arg5, class156 arg6, boolean arg7, int arg8, int arg9, class265[] arg10, int arg11, int arg12) {
        field5939++;
        if (this.field5928 != -1) {
            return class225.method1387(this.field5928, (byte) 106).method1950(arg2, arg6, arg11, arg1, arg5, arg3, arg9, -40, arg4, arg8, arg12, arg10);
        }
        int var14 = arg3;
        long var15 = this.field5937;
        int[] var17 = this.field5920;
        if (arg5 != null && (arg5.field1822 >= 0 || arg5.field1813 >= 0)) {
            var17 = new int[12];
            for (int var18 = 0; var18 < 12; var18++) {
                var17[var18] = this.field5920[var18];
            }
            if (arg5.field1822 >= 0) {
                if (arg5.field1822 == 65535) {
                    var15 ^= 0xFFFFFFFF00000000L;
                    var17[5] = 0;
                } else {
                    var17[5] = class213.method1307(arg5.field1822, 1073741824);
                    var15 ^= (long) var17[5] << 32;
                }
            }
            if (arg5.field1813 >= 0) {
                if (arg5.field1813 == 65535) {
                    var17[3] = 0;
                    var15 ^= 0xFFFFFFFFL;
                } else {
                    var17[3] = class213.method1307(1073741824, arg5.field1813);
                    var15 ^= (long) var17[3];
                }
            }
        }
        boolean var19 = false;
        boolean var20 = false;
        boolean var21 = arg5 != null || arg6 != null;
        int var22 = arg10 == null ? 0 : arg10.length;
        for (int var23 = 0; var23 < var22; var23++) {
            class386.field5277[var23] = null;
            if (arg10[var23] != null) {
                class156 var24 = class430.method2621((byte) -104, arg10[var23].field3407);
                if (var24.field1821 != null) {
                    class59.field750[var23] = var24;
                    var21 = true;
                    int var25 = arg10[var23].field3411;
                    int var26 = arg10[var23].field3409;
                    int var27 = var24.field1821[var25];
                    class386.field5277[var23] = class57.method320(-16, var27 >>> 16);
                    int var28 = var27 & 0xFFFF;
                    class54.field635[var23] = var28;
                    if (class386.field5277[var23] != null) {
                        var20 |= class386.field5277[var23].method894(var28, 0);
                        var19 |= class386.field5277[var23].method900((byte) -119, var28);
                    }
                    if ((var24.field1816 || class338.field4610) && var26 != -1 && var26 < var24.field1821.length) {
                        class104.field1228[var23] = var24.field1817[var25];
                        class118.field1359[var23] = arg10[var23].field3412;
                        int var29 = var24.field1821[var26];
                        class321.field4305[var23] = class57.method320(-16, var29 >>> 16);
                        int var30 = var29 & 0xFFFF;
                        class394.field5370[var23] = var30;
                        if (class321.field4305[var23] != null) {
                            var20 |= class321.field4305[var23].method894(var30, 0);
                            var19 |= class321.field4305[var23].method900((byte) -40, var30);
                        }
                    } else {
                        class104.field1228[var23] = 0;
                        class118.field1359[var23] = 0;
                        class321.field4305[var23] = null;
                        class394.field5370[var23] = -1;
                    }
                }
            }
        }
        int var31 = -1;
        int var32 = -1;
        int var33 = 0;
        class140 var34 = null;
        class140 var35 = null;
        int var36 = -1;
        int var37 = -1;
        if (arg0 >= -14) {
            method2647(123, (class285) null);
        }
        int var38 = 0;
        class140 var39 = null;
        class140 var40 = null;
        if (var21) {
            var14 = arg3 | 0x20;
            if (arg5 != null) {
                int var41 = arg5.field1821[arg11];
                int var42 = var41 >>> 16;
                var34 = class57.method320(-16, var42);
                var31 = var41 & 0xFFFF;
                if (var34 != null) {
                    var20 |= var34.method894(var31, 0);
                    var19 |= var34.method900((byte) -125, var31);
                }
                if ((arg5.field1816 || class338.field4610) && arg12 != -1 && arg12 < arg5.field1821.length) {
                    int var43 = arg5.field1821[arg12];
                    var33 = arg5.field1817[arg11];
                    int var44 = var43 >>> 16;
                    var32 = var43 & 0xFFFF;
                    var35 = var42 == var44 ? var34 : class57.method320(-16, var44);
                    if (var35 != null) {
                        var20 |= var35.method894(var32, 0);
                        var19 |= var35.method900((byte) -125, var32);
                    }
                }
            }
            if (arg6 != null) {
                int var45 = arg6.field1821[arg2];
                int var46 = var45 >>> 16;
                var36 = var45 & 0xFFFF;
                var39 = class57.method320(-16, var46);
                if (var39 != null) {
                    var20 |= var39.method894(var36, 0);
                    var19 |= var39.method900((byte) -15, var36);
                }
                if ((arg6.field1816 || class338.field4610) && arg8 != -1 && arg8 < arg6.field1821.length) {
                    int var47 = arg6.field1821[arg8];
                    var38 = arg6.field1817[arg2];
                    int var48 = var47 >>> 16;
                    var37 = var47 & 0xFFFF;
                    var40 = var46 == var48 ? var39 : class57.method320(-16, var48);
                    if (var40 != null) {
                        var20 |= var40.method894(var37, 0);
                        var19 |= var40.method900((byte) -122, var37);
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
        class365 var49 = class263.field3379;
        class386 var50;
        synchronized (class263.field3379) {
            var50 = (class386) class263.field3379.method2295(var15, (byte) 74);
        }
        class437 var51 = null;
        if (this.field5932 != -1) {
            var51 = class207.method1267(this.field5932, (byte) -114);
        }
        if (var50 == null || arg4.method721(var50.method1465(), var14) != 0 || var51 != null && var51.field6004 != null && this.field5944 == null) {
            if (var50 != null) {
                var14 = arg4.method707(var14, var50.method1465());
            }
            boolean var53 = false;
            int var54 = 0;
            while (true) {
                if (var54 >= 12) {
                    if (var53) {
                        if (this.field5923 != -1L) {
                            class365 var81 = class263.field3379;
                            synchronized (class263.field3379) {
                                var50 = (class386) class263.field3379.method2295(this.field5923, (byte) 74);
                            }
                        }
                        if (var50 == null || arg4.method721(var50.method1465(), var14) != 0 || var51 != null && var51.field6004 != null && this.field5944 == null) {
                            return null;
                        }
                    } else {
                        class402[] var56 = new class402[12];
                        for (int var57 = 0; var57 < 12; var57++) {
                            int var58 = var17[var57];
                            if ((var58 & 0x40000000) != 0) {
                                class402 var59 = class131.method843((byte) 5, var58 & 0x3FFFFFFF).method347((byte) -95, this.field5940);
                                if (var59 != null) {
                                    var56[var57] = var59;
                                }
                            } else if ((Integer.MIN_VALUE & var58) != 0) {
                                class402 var60 = class6.method28(var58 & 0x3FFFFFFF, 106).method555(125);
                                if (var60 != null) {
                                    var56[var57] = var60;
                                }
                            }
                        }
                        if (var51 != null && var51.field6004 != null) {
                            for (int var61 = 0; var61 < var51.field6004.length; var61++) {
                                if (var51.field6004[var61] != null && var56[var61] != null) {
                                    int var62 = var51.field6004[var61][0];
                                    int var63 = var51.field6004[var61][1];
                                    int var64 = var51.field6004[var61][2];
                                    int var65 = var51.field6004[var61][3] << 3;
                                    int var66 = var51.field6004[var61][4] << 3;
                                    int var67 = var51.field6004[var61][5] << 3;
                                    if (this.field5944 == null) {
                                        this.field5944 = new int[var51.field6004.length][];
                                    }
                                    if (this.field5944[var61] == null) {
                                        int[] var68 = this.field5944[var61] = new int[15];
                                        if (var65 == 0 && var66 == 0 && var67 == 0) {
                                            var68[14] = -var64;
                                            var68[13] = -var63;
                                            var68[0] = var68[4] = var68[8] = 32768;
                                            var68[12] = -var62;
                                        } else {
                                            int var69 = class363.field4917[var65];
                                            int var70 = class363.field4927[var65];
                                            int var71 = class363.field4917[var66];
                                            int var72 = class363.field4927[var66];
                                            int var73 = class363.field4917[var67];
                                            int var74 = class363.field4927[var67];
                                            int var75 = var70 * var73 + 16384 >> 15;
                                            int var76 = var70 * var74 + 16384 >> 15;
                                            var68[1] = -var74 * var71 + var72 * var75 + 16384 >> 15;
                                            var68[0] = var72 * var76 + var71 * var73 + 16384 >> 15;
                                            var68[2] = var69 * var72 + 16384 >> 15;
                                            var68[7] = -var72 * -var74 + var71 * var75 + 16384 >> 15;
                                            var68[5] = -var70;
                                            var68[6] = -var72 * var73 + var71 * var76 + 16384 >> 15;
                                            var68[3] = var69 * var74 + 16384 >> 15;
                                            var68[4] = var69 * var73 + 16384 >> 15;
                                            var68[8] = var69 * var71 + 16384 >> 15;
                                            var68[13] = var68[7] * -var64 + var68[4] * -var63 + var68[1] * -var62 + 16384 >> 15;
                                            var68[12] = var68[0] * -var62 + (var68[6] * -var64) + var68[3] * -var63 + 16384 >> 15;
                                            var68[14] = var68[8] * -var64 + var68[2] * -var62 + (var68[5] * -var63) + 16384 >> 15;
                                        }
                                        var68[10] = var63;
                                        var68[9] = var62;
                                        var68[11] = var64;
                                    }
                                    if (var65 != 0 || var66 != 0 || var67 != 0) {
                                        var56[var61].method2501(var66, var67, var65, 20863);
                                    }
                                    if (var62 != 0 || var63 != 0 || var64 != 0) {
                                        var56[var61].method2516(0, var62, var63, var64);
                                    }
                                }
                            }
                        }
                        class402 var77 = new class402(var56, var56.length);
                        int var78 = var14 | 0x2000;
                        var50 = arg4.method701(var77, var78, class161.field1867, 64, 850);
                        for (int var79 = 0; var79 < 5; var79++) {
                            if (this.field5924[var79] < class50.field579[var79].length) {
                                var50.method1463(class184.field2127[var79], class50.field579[var79][this.field5924[var79]]);
                            }
                            if (this.field5924[var79] < class345.field4684[var79].length) {
                                var50.method1463(class423.field5793[var79], class345.field4684[var79][this.field5924[var79]]);
                            }
                        }
                        if (arg7) {
                            var50.method1460(var14);
                            class365 var80 = class263.field3379;
                            synchronized (class263.field3379) {
                                class263.field3379.method2294(var50, (byte) 45, var15);
                            }
                            this.field5923 = var15;
                        }
                    }
                    break;
                }
                int var55 = var17[var54];
                if ((var55 & 0x40000000) == 0) {
                    if ((var55 & Integer.MIN_VALUE) != 0 && !class6.method28(var55 & 0x3FFFFFFF, 123).method551(-1)) {
                        var53 = true;
                    }
                } else if (!class131.method843((byte) 5, var55 & 0x3FFFFFFF).method337(this.field5940, 128)) {
                    var53 = true;
                }
                var54++;
            }
        }
        class386 var82 = var50.method1459((byte) 1, var14, true);
        if (!var21) {
            return var82;
        }
        int var83 = 0;
        int var84 = 1;
        while (var22 > var83) {
            if (class386.field5277[var83] != null) {
                var82.method2402(class386.field5277[var83], class104.field1228[var83], this.field5944 == null ? null : this.field5944[var83], class394.field5370[var83], -111, class54.field635[var83], var84, class321.field4305[var83], class118.field1359[var83] - 1, false, 0);
            }
            var83++;
            var84 <<= 0x1;
        }
        if (var34 != null && var39 != null) {
            var82.method2404(var37, var35, var33, 11491, arg5.field1824, var40, var38, var31, var36, var39, var34, false, arg9 - 1, arg1 + -1, var32);
        } else if (var34 != null) {
            var82.method2405(var33, false, var34, 0, var35, var32, 65535, var31, arg1 - 1);
        } else if (var39 != null) {
            var82.method2405(var38, false, var39, 0, var40, var37, 65535, var36, arg9 - 1);
        }
        for (int var85 = 0; var85 < var22; var85++) {
            class386.field5277[var85] = null;
            class321.field4305[var85] = null;
            class59.field750[var85] = null;
        }
        return var82;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ILwo;)V")
    public static final void method2647(int arg0, class285 arg1) {
        field5921++;
        if (arg0 != -1) {
            field5934 = null;
        }
        class146.field1716 = arg1;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(I)V")
    private final void method2648(int arg0) {
        field5931++;
        this.field5937 = -1L;
        long[] var2 = class116.field1341;
        this.field5937 = var2[(int) ((this.field5937 ^ (long) (this.field5932 >> 8)) & 0xFFL)] ^ this.field5937 >>> 8;
        this.field5937 = this.field5937 >>> 8 ^ var2[(int) ((this.field5937 ^ (long) this.field5932) & 0xFFL)];
        int var3 = 0;
        int var4 = -63 / ((arg0 + 55) / 52);
        while (var3 < 12) {
            this.field5937 = this.field5937 >>> 8 ^ var2[(int) ((this.field5937 ^ (long) (this.field5920[var3] >> 24)) & 0xFFL)];
            this.field5937 = this.field5937 >>> 8 ^ var2[(int) ((this.field5937 ^ (long) (this.field5920[var3] >> 16)) & 0xFFL)];
            this.field5937 = var2[(int) (((long) (this.field5920[var3] >> 8) ^ this.field5937) & 0xFFL)] ^ this.field5937 >>> 8;
            this.field5937 = var2[(int) ((this.field5937 ^ (long) this.field5920[var3]) & 0xFFL)] ^ this.field5937 >>> 8;
            var3++;
        }
        for (int var5 = 0; var5 < 5; var5++) {
            this.field5937 = var2[(int) (((long) this.field5924[var5] ^ this.field5937) & 0xFFL)] ^ this.field5937 >>> 8;
        }
        this.field5937 = this.field5937 >>> 8 ^ var2[(int) ((this.field5937 ^ (long) (this.field5940 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Lgi;III[Z)Z")
    public static final boolean method2649(class416 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
        boolean var5 = false;
        if (class75.field915 != class304.field4096) {
            int var6 = class219.field2709[arg1].method1054(arg2, arg3);
            for (int var7 = 0; var7 <= arg1; var7++) {
                class279 var8 = class219.field2709[var7];
                if (var8 != null) {
                    int var9 = var6 - var8.method1054(arg2, arg3);
                    if (arg4 != null) {
                        arg4[var7] = var8.method1059(arg0, arg2, var9, arg3, 0, false);
                        if (!arg4[var7]) {
                            continue;
                        }
                    }
                    var8.method1051(arg0, arg2, var9, arg3, 0, false);
                    var5 = true;
                }
            }
        }
        return var5;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZI[I[III)V")
    public final void method2650(boolean arg0, int arg1, int[] arg2, int[] arg3, int arg4, int arg5) {
        field5935++;
        if (this.field5932 != arg5) {
            this.field5944 = null;
            this.field5932 = arg5;
        }
        if (arg3 == null) {
            arg3 = new int[12];
            for (int var7 = 0; var7 < 8; var7++) {
                for (int var8 = 0; var8 < class304.field4081; var8++) {
                    class89 var9 = class6.method28(var8, 121);
                    if (var9 != null && !var9.field1037 && (arg0 ? class372.field5041[var7] : class12.field157[var7]) == var9.field1039) {
                        arg3[class416.field5699[var7]] = class213.method1307(var8, Integer.MIN_VALUE);
                        break;
                    }
                }
            }
        }
        this.field5924 = arg2;
        this.field5928 = arg4;
        this.field5920 = arg3;
        this.field5940 = arg0;
        this.method2648(-108);
        if (arg1 > -73) {
            method2653((String) null, -109, (class441) null, 95);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BII)V")
    public static final void method2651(byte arg0, int arg1, int arg2) {
        if (arg0 != 28) {
            return;
        }
        field5943++;
        class342 var3 = class284.field3715[arg1][arg2];
        if (var3 != null) {
            class163.field1899 = var3.field4653;
            class66.field798 = var3.field4656;
            class20.field218 = var3.field4666;
        }
        class284.method1786(arg0 - 27);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(IIILuo;Lbo;II)Lge;")
    public final class386 method2652(int arg0, int arg1, int arg2, class118 arg3, class156 arg4, int arg5, int arg6) {
        field5927++;
        if (this.field5928 != -1) {
            return class225.method1387(this.field5928, (byte) 113).method1958(false, arg3, arg1, arg6, arg4, arg5, arg2);
        }
        if (arg0 != -11258) {
            method2655((byte) 78);
        }
        int var8 = arg2;
        if (arg4 != null) {
            boolean var9 = false;
            boolean var10 = false;
            boolean var11 = false;
            boolean var12 = true;
            boolean var13 = true;
            Object var14 = null;
            var8 = arg2 | 0x20;
            Object var15 = null;
            int var16 = arg4.field1821[arg1];
            int var17 = var16 >>> 16;
            int var18 = var16 & 0xFFFF;
            class140 var19 = class57.method320(-16, var17);
            if (var19 != null) {
                var10 |= var19.method894(var18, 0);
                var9 |= var19.method900((byte) 52, var18);
                var11 |= arg4.field1807;
            }
            if ((arg4.field1816 || class338.field4610) && arg5 != -1 && arg5 < arg4.field1821.length) {
                int var20 = arg4.field1821[arg5];
                int var21 = var20 >>> 16;
                class140 var22 = var17 == var21 ? var19 : class57.method320(arg0 + 11242, var21);
                int var23 = var20 & 0xFFFF;
                if (var22 != null) {
                    var10 |= var22.method894(var23, 0);
                    var9 |= var22.method900((byte) -15, var23);
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
        class365 var24 = class20.field219;
        class386 var25;
        synchronized (class20.field219) {
            var25 = (class386) class20.field219.method2295(this.field5937, (byte) 74);
        }
        if (var25 == null || arg3.method721(var25.method1465(), var8) != 0) {
            if (var25 != null) {
                var8 = arg3.method707(var8, var25.method1465());
            }
            boolean var27 = false;
            for (int var28 = 0; var28 < 12; var28++) {
                int var29 = this.field5920[var28];
                if ((var29 & 0x40000000) == 0) {
                    if ((var29 & Integer.MIN_VALUE) != 0 && !class6.method28(var29 & 0x3FFFFFFF, 118).method556((byte) -97)) {
                        var27 = true;
                    }
                } else if (!class131.method843((byte) 5, var29 & 0x3FFFFFFF).method333(this.field5940, (byte) 90)) {
                    var27 = true;
                }
            }
            if (var27) {
                return null;
            }
            class402[] var30 = new class402[12];
            int var31 = 0;
            for (int var32 = 0; var32 < 12; var32++) {
                int var33 = this.field5920[var32];
                if ((var33 & 0x40000000) != 0) {
                    class402 var34 = class131.method843((byte) 5, var33 & 0x3FFFFFFF).method336(this.field5940, arg0 ^ 0x2BF9);
                    if (var34 != null) {
                        var30[var31++] = var34;
                    }
                } else if ((Integer.MIN_VALUE & var33) != 0) {
                    class402 var35 = class6.method28(var33 & 0x3FFFFFFF, 119).method552(-30898);
                    if (var35 != null) {
                        var30[var31++] = var35;
                    }
                }
            }
            class402 var36 = new class402(var30, var31);
            int var37 = var8 | 0x2000;
            var25 = arg3.method701(var36, var37, class161.field1867, 64, 768);
            for (int var38 = 0; var38 < 5; var38++) {
                if (class50.field579[var38].length > this.field5924[var38]) {
                    var25.method1463(class184.field2127[var38], class50.field579[var38][this.field5924[var38]]);
                }
                if (class345.field4684[var38].length > this.field5924[var38]) {
                    var25.method1463(class423.field5793[var38], class345.field4684[var38][this.field5924[var38]]);
                }
            }
            var25.method1460(var8);
            class365 var39 = class20.field219;
            synchronized (class20.field219) {
                class20.field219.method2294(var25, (byte) 125, this.field5937);
            }
        }
        if (arg4 == null) {
            return var25;
        } else {
            var25.method1459((byte) 1, var8, true);
            return arg4.method997(arg6, arg2, (byte) -120, arg1, arg5, var25);
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(Ljava/lang/String;ILnh;I)Lph;")
    public static final class315 method2653(String arg0, int arg1, class441 arg2, int arg3) {
        field5941++;
        if (~arg1 == arg3) {
            return arg2.method2736(arg0, (byte) -120);
        } else if (arg1 == 1) {
            try {
                class443.method2742(new Object[] { (new URL(arg2.field6077.getCodeBase(), arg0)).toString() }, 19210, "openjs", arg2.field6077);
                class315 var4 = new class315();
                var4.field4244 = 1;
                return var4;
            } catch (Throwable var10) {
                class315 var5 = new class315();
                var5.field4244 = 2;
                return var5;
            }
        } else if (arg1 == 2) {
            try {
                arg2.field6077.getAppletContext().showDocument(new URL(arg2.field6077.getCodeBase(), arg0), "_blank");
                class315 var6 = new class315();
                var6.field4244 = 1;
                return var6;
            } catch (Exception var11) {
                class315 var7 = new class315();
                var7.field4244 = 2;
                return var7;
            }
        } else if (arg1 == 3) {
            try {
                class443.method2743(arg2.field6077, -24425, "loggedout");
            } catch (Throwable var13) {
            }
            try {
                arg2.field6077.getAppletContext().showDocument(new URL(arg2.field6077.getCodeBase(), arg0), "_top");
                class315 var8 = new class315();
                var8.field4244 = 1;
                return var8;
            } catch (Exception var12) {
                class315 var9 = new class315();
                var9.field4244 = 2;
                return var9;
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(ZB)V")
    public final void method2654(boolean arg0, byte arg1) {
        this.field5940 = arg0;
        if (arg1 != 47) {
            field5930 = -63;
        }
        field5925++;
        this.method2648(-123);
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(B)V")
    public static void method2655(byte arg0) {
        field5922 = null;
        if (arg0 < 92) {
            field5936 = null;
        }
        field5936 = null;
        field5934 = null;
    }

    @OriginalMember(owner = "client!eq", name = "a", descriptor = "(BI)V")
    public static final void method2656(byte arg0, int arg1) {
        field5933++;
        class12 var2 = class390.method2422(341555040, arg1, 14);
        if (arg0 != 104) {
            method2653((String) null, -128, (class441) null, 94);
        }
        var2.method65(arg0 - 183);
    }

    @OriginalMember(owner = "client!eq", name = "c", descriptor = "(III)V")
    public final void method2657(int arg0, int arg1, int arg2) {
        this.field5924[arg0] = arg2;
        field5919++;
        if (arg1 == -1) {
            this.method2648(-116);
        }
    }
}
