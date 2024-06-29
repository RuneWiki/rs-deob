import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qha")
public class class112 {

    @OriginalMember(owner = "client!qha", name = "o", descriptor = "I")
    public int field2102 = -1;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "Lvl;")
    public static class15 field2088 = new class15(30, 5);

    @OriginalMember(owner = "client!qha", name = "r", descriptor = "[I")
    public static int[] field2105 = new int[] { 1, 2, 4, 8 };

    @OriginalMember(owner = "client!qha", name = "p", descriptor = "Lfja;")
    public static class783 field2103 = new class783(95, 0);

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "I")
    public static int field2089;

    @OriginalMember(owner = "client!qha", name = "d", descriptor = "I")
    public static int field2091;

    @OriginalMember(owner = "client!qha", name = "e", descriptor = "I")
    public static int field2092;

    @OriginalMember(owner = "client!qha", name = "f", descriptor = "I")
    public static int field2093;

    @OriginalMember(owner = "client!qha", name = "g", descriptor = "I")
    public static int field2094;

    @OriginalMember(owner = "client!qha", name = "j", descriptor = "I")
    public static int field2097;

    @OriginalMember(owner = "client!qha", name = "k", descriptor = "I")
    public static int field2098;

    @OriginalMember(owner = "client!qha", name = "l", descriptor = "I")
    public static int field2099;

    @OriginalMember(owner = "client!qha", name = "q", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!qha", name = "s", descriptor = "I")
    private int field2106;

    @OriginalMember(owner = "client!qha", name = "u", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!qha", name = "w", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!qha", name = "x", descriptor = "I")
    public static int field2111;

    @OriginalMember(owner = "client!qha", name = "c", descriptor = "J")
    private long field2090;

    @OriginalMember(owner = "client!qha", name = "m", descriptor = "J")
    private long field2100;

    @OriginalMember(owner = "client!qha", name = "t", descriptor = "Lha;")
    public static class66 field2107;

    @OriginalMember(owner = "client!qha", name = "h", descriptor = "Z")
    public boolean field2095;

    @OriginalMember(owner = "client!qha", name = "n", descriptor = "[I")
    private int[] field2101;

    @OriginalMember(owner = "client!qha", name = "v", descriptor = "[I")
    public int[] field2109;

    @OriginalMember(owner = "client!qha", name = "i", descriptor = "[Luga;")
    private class222[] field2096;

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILc;IILbn;IIILvf;Lha;IZ)Lka;")
    public final class499 method1015(int arg0, class200 arg1, int arg2, int arg3, class469 arg4, int arg5, int arg6, int arg7, class163 arg8, class66 arg9, int arg10, boolean arg11) {
        field2104++;
        int var13 = arg5;
        if (arg11) {
            this.method1025(null, 95, (byte) -5, -98);
        }
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg5 | 0x20;
            int var22 = arg1.field3040[arg7];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class366 var25 = arg8.method1277(var23, -1);
            if (var25 != null) {
                var15 |= var25.method2236(var24, (byte) -112);
                var14 |= var25.method2238(var24, 0);
                var17 |= var25.method2231(77, var24);
                var16 |= arg1.field3034;
            }
            if ((arg1.field3048 || class499.field6821) && arg6 != -1 && arg6 < arg1.field3040.length) {
                int var26 = arg1.field3040[arg6];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class366 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg8.method1277(var28 >>> 16, -1);
                }
                if (var29 != null) {
                    var15 |= var29.method2236(var28, (byte) 122);
                    var14 |= var29.method2238(var28, 0);
                    var17 |= var29.method2231(83, var28);
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
        long var30 = (long) (arg3 << 16) | (long) arg0 << 32 | (long) arg2;
        class43 var32 = class23.field479;
        class499 var33;
        synchronized (class23.field479) {
            var33 = (class499) class23.field479.method266((byte) -124, var30);
        }
        if (var33 == null || arg9.method482(var33.method300(), var13) != 0) {
            if (var33 != null) {
                var13 = arg9.method593(var13, var33.method300());
            }
            class5[] var35 = new class5[3];
            int var36 = 0;
            if (!arg4.method2697(arg2, 9505).method3944(-103) || !arg4.method2697(arg3, 9505).method3944(-108) || !arg4.method2697(arg0, 9505).method3944(-93)) {
                return null;
            }
            class5 var37 = arg4.method2697(arg2, 9505).method3941(96);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class5 var38 = arg4.method2697(arg3, 9505).method3941(107);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class5 var39 = arg4.method2697(arg0, 9505).method3941(105);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class5 var41 = new class5(var35, var36);
            var33 = arg9.method505(var41, var40, class651.field9025, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class647.field8943.length; var43++) {
                    if (this.field2109[var42] < class647.field8943[var43][var42].length) {
                        var33.method308(class260.field3651[var43][var42], class647.field8943[var43][var42][this.field2109[var42]]);
                    }
                }
            }
            var33.method303(var13);
            class43 var44 = class23.field479;
            synchronized (class23.field479) {
                class23.field479.method270(var33, var30, -126);
            }
        }
        if (arg1 == null) {
            return var33;
        } else {
            class499 var45 = var33.method324((byte) 4, var13, true);
            return arg1.method1436(arg7, arg6, arg10, arg5, (byte) -78, var45);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Ldg;B)Z")
    public static final boolean method1016(class435 arg0, byte arg1) {
        field2098++;
        if (arg1 == -19) {
            return arg0 == null ? false : class307.method1955(arg0.field5919 - arg0.field5923, -arg0.field5926 + arg0.field5924, arg0.field5914 - arg0.field5922, -1, arg0.field5923, arg0.field5922, arg0.field5926);
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(ZI)V")
    public final void method1017(boolean arg0, int arg1) {
        if (arg1 < 101) {
            this.method1024(18);
        }
        this.field2095 = arg0;
        field2108++;
        this.method1024(80);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Z[Luga;I[III[I)V")
    public final void method1018(boolean arg0, class222[] arg1, int arg2, int[] arg3, int arg4, int arg5, int[] arg6) {
        this.field2096 = arg1;
        field2097++;
        if (this.field2106 != arg2) {
            this.field2106 = arg2;
        }
        this.field2101 = arg6;
        this.field2109 = arg3;
        this.field2102 = arg5;
        this.field2095 = arg0;
        if (arg4 > 56) {
            this.method1024(75);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IBI)V")
    public final void method1019(int arg0, byte arg1, int arg2) {
        field2092++;
        this.field2109[arg0] = arg2;
        if (arg1 > -114) {
            this.field2100 = -107L;
        }
        this.method1024(100);
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(ILvf;II[IIZILc;ILc;Llw;Lmu;Lvda;IB[Lgea;Lbn;Lha;Lds;I)Lka;")
    public final class499 method1020(int arg0, class163 arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7, class200 arg8, int arg9, class200 arg10, class688 arg11, class318 arg12, class195 arg13, int arg14, byte arg15, class82[] arg16, class469 arg17, class66 arg18, class16 arg19, int arg20) {
        field2091++;
        if (this.field2102 != -1) {
            return arg12.method2005(6, this.field2102).method3290(arg10, arg20, null, arg8, 850, arg16, arg2, arg18, arg9, arg7, arg0, arg4, arg11, arg19, arg5, arg3, arg14, arg1);
        }
        int var22 = arg7;
        long var23 = this.field2100;
        int[] var25 = this.field2101;
        boolean var26 = false;
        boolean var27 = false;
        if (arg8 != null && (arg8.field3046 >= 0 || arg8.field3021 >= 0)) {
            var25 = new int[this.field2101.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field2101[var28];
            }
            if (arg8.field3046 >= 0) {
                if (arg8.field3046 == 65535) {
                    var26 = true;
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class530.method3011(1073741824, arg8.field3046);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg8.field3021 >= 0) {
                var27 = true;
                if (arg8.field3021 == 65535) {
                    var23 ^= 0xFFFFFFFFL;
                    var25[3] = 0;
                } else {
                    var25[3] = class530.method3011(arg8.field3021, 1073741824);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg8 != null || arg10 != null;
        int var33 = arg16 == null ? 0 : arg16.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class461.field6275[var34] = null;
            if (arg16[var34] != null) {
                class200 var35 = arg1.method1279((byte) 92, arg16[var34].field1133);
                if (var35.field3040 != null) {
                    class554.field7827[var34] = var35;
                    var32 = true;
                    int var36 = arg16[var34].field1131;
                    int var37 = arg16[var34].field1139;
                    int var38 = var35.field3040[var36];
                    class461.field6275[var34] = arg1.method1277(var38 >>> 16, -1);
                    int var39 = var38 & 0xFFFF;
                    class204.field3076[var34] = var39;
                    if (class461.field6275[var34] != null) {
                        var30 |= class461.field6275[var34].method2236(var39, (byte) -58);
                        var29 |= class461.field6275[var34].method2238(var39, 0);
                        var31 |= class461.field6275[var34].method2231(115, var39);
                    }
                    if ((var35.field3048 || class499.field6821) && var37 != -1 && var37 < var35.field3040.length) {
                        class745.field10291[var34] = var35.field3024[var36];
                        class259.field3633[var34] = arg16[var34].field1134;
                        int var40 = var35.field3040[var37];
                        class711.field9799[var34] = arg1.method1277(var40 >>> 16, -1);
                        int var41 = var40 & 0xFFFF;
                        class666.field9272[var34] = var41;
                        if (class711.field9799[var34] != null) {
                            var30 |= class711.field9799[var34].method2236(var41, (byte) 88);
                            var29 |= class711.field9799[var34].method2238(var41, 0);
                            var31 |= class711.field9799[var34].method2231(107, var41);
                        }
                    } else {
                        class745.field10291[var34] = 0;
                        class259.field3633[var34] = 0;
                        class711.field9799[var34] = null;
                        class666.field9272[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class366 var45 = null;
        class366 var46 = null;
        int var47 = -1;
        int var48 = 97 % ((-arg15 - 20) / 55);
        int var49 = -1;
        int var50 = 0;
        class366 var51 = null;
        class366 var52 = null;
        if (var32) {
            var22 = arg7 | 0x20;
            if (arg8 != null) {
                int var53 = arg8.field3040[arg20];
                int var54 = var53 >>> 16;
                var42 = var53 & 0xFFFF;
                var45 = arg1.method1277(var54, -1);
                if (var45 != null) {
                    var30 |= var45.method2236(var42, (byte) 120);
                    var29 |= var45.method2238(var42, 0);
                    var31 |= var45.method2231(126, var42);
                }
                if ((arg8.field3048 || class499.field6821) && arg2 != -1 && arg8.field3040.length > arg2) {
                    var44 = arg8.field3024[arg20];
                    int var55 = arg8.field3040[arg2];
                    int var56 = var55 >>> 16;
                    var43 = var55 & 0xFFFF;
                    var46 = var54 == var56 ? var45 : arg1.method1277(var56, -1);
                    if (var46 != null) {
                        var30 |= var46.method2236(var43, (byte) 100);
                        var29 |= var46.method2238(var43, 0);
                        var31 |= var46.method2231(120, var43);
                    }
                }
            }
            if (arg10 != null) {
                int var57 = arg10.field3040[arg14];
                int var58 = var57 >>> 16;
                var47 = var57 & 0xFFFF;
                var51 = arg1.method1277(var58, -1);
                if (var51 != null) {
                    var30 |= var51.method2236(var47, (byte) 73);
                    var29 |= var51.method2238(var47, 0);
                    var31 |= var51.method2231(72, var47);
                }
                if ((arg10.field3048 || class499.field6821) && arg3 != -1 && arg10.field3040.length > arg3) {
                    int var59 = arg10.field3040[arg3];
                    var50 = arg10.field3024[arg14];
                    int var60 = var59 >>> 16;
                    var49 = var59 & 0xFFFF;
                    var52 = var58 == var60 ? var51 : arg1.method1277(var60, -1);
                    if (var52 != null) {
                        var30 |= var52.method2236(var49, (byte) -103);
                        var29 |= var52.method2238(var49, 0);
                        var31 |= var52.method2231(102, var49);
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
        class43 var61 = class220.field3227;
        class499 var62;
        synchronized (class220.field3227) {
            var62 = (class499) class220.field3227.method266((byte) -98, var23);
        }
        class540 var63 = null;
        if (this.field2106 != -1) {
            var63 = arg19.method92(this.field2106, (byte) 6);
        }
        if (var62 == null || arg18.method482(var62.method300(), var22) != 0) {
            if (var62 != null) {
                var22 = arg18.method593(var22, var62.method300());
            }
            boolean var65 = false;
            int var66 = 0;
            while (true) {
                if (var66 >= var25.length) {
                    if (var65) {
                        if (this.field2090 != -1L) {
                            class43 var89 = class220.field3227;
                            synchronized (class220.field3227) {
                                var62 = (class499) class220.field3227.method266((byte) -118, this.field2090);
                            }
                        }
                        if (var62 == null || arg18.method482(var62.method300(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class5[] var70 = new class5[var25.length];
                        for (int var71 = 0; var71 < var25.length; var71++) {
                            int var72 = var25[var71];
                            class222 var73 = null;
                            boolean var74 = var71 == 5 && var26 || var71 == 3 && var27;
                            if ((var72 & 0x40000000) != 0) {
                                if (!var74 && this.field2096 != null && this.field2096[var71] != null) {
                                    var73 = this.field2096[var71];
                                }
                                class5 var75 = arg13.method1410((byte) 89, var72 & 0x3FFFFFFF).method4050(this.field2095, -103, var73);
                                if (var75 != null) {
                                    var70[var71] = var75;
                                }
                            } else if ((Integer.MIN_VALUE & var72) != 0) {
                                class5 var76 = arg17.method2697(var72 & 0x3FFFFFFF, 9505).method3947(119);
                                if (var76 != null) {
                                    var70[var71] = var76;
                                }
                            }
                        }
                        if (var63 != null && var63.field7374 != null) {
                            for (int var77 = 0; var77 < var63.field7374.length; var77++) {
                                if (var70[var77] != null) {
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    int var83 = 0;
                                    if (var63.field7374[var77] != null) {
                                        var78 = var63.field7374[var77][0];
                                        var79 = var63.field7374[var77][1];
                                        var83 = var63.field7374[var77][5] << 3;
                                        var80 = var63.field7374[var77][2];
                                        var82 = var63.field7374[var77][4] << 3;
                                        var81 = var63.field7374[var77][3] << 3;
                                    }
                                    if (var81 != 0 || var82 != 0 || var83 != 0) {
                                        var70[var77].method42(var83, var82, -83, var81);
                                    }
                                    if (var78 != 0 || var79 != 0 || var80 != 0) {
                                        var70[var77].method38(var79, var80, false, var78);
                                    }
                                }
                            }
                        }
                        int var84 = var22 | 0x4000;
                        class5 var85 = new class5(var70, var70.length);
                        var62 = arg18.method505(var85, var84, class651.field9025, 64, 850);
                        for (int var86 = 0; var86 < 5; var86++) {
                            for (int var87 = 0; var87 < class647.field8943.length; var87++) {
                                if (this.field2109[var86] < class647.field8943[var87][var86].length) {
                                    var62.method308(class260.field3651[var87][var86], class647.field8943[var87][var86][this.field2109[var86]]);
                                }
                            }
                        }
                        if (arg6) {
                            var62.method303(var22);
                            class43 var88 = class220.field3227;
                            synchronized (class220.field3227) {
                                class220.field3227.method270(var62, var23, -124);
                            }
                            this.field2090 = var23;
                        }
                    }
                    break;
                }
                int var67 = var25[var66];
                class222 var68 = null;
                boolean var69 = var66 == 5 && var26 || var66 == 3 && var27;
                if ((var67 & 0x40000000) != 0) {
                    if (!var69 && this.field2096 != null && this.field2096[var66] != null) {
                        var68 = this.field2096[var66];
                    }
                    if (!arg13.method1410((byte) 121, var67 & 0x3FFFFFFF).method4056(-121, var68, this.field2095)) {
                        var65 = true;
                    }
                } else if ((var67 & Integer.MIN_VALUE) != 0 && !arg17.method2697(var67 & 0x3FFFFFFF, 9505).method3946((byte) -67)) {
                    var65 = true;
                }
                var66++;
            }
        }
        class499 var90 = var62.method324((byte) 4, var22, true);
        boolean var91 = false;
        if (arg4 != null) {
            for (int var92 = 0; var92 < arg4.length; var92++) {
                if (arg4[var92] != -1) {
                    var91 = true;
                }
            }
        }
        if (!var32 && !var91) {
            return var90;
        }
        class650[] var93 = null;
        if (var63 != null) {
            var93 = var63.method3054(arg18, 4);
        }
        if (var91 && var93 != null) {
            for (int var94 = 0; var94 < arg4.length; var94++) {
                if (var93[var94] != null) {
                    var90.method293(var93[var94], 0x1 << var94, true);
                }
            }
        }
        int var95 = 0;
        int var96 = 1;
        while (var95 < var33) {
            if (class461.field6275[var95] != null) {
                var90.method2860(class745.field10291[var95], class461.field6275[var95], class259.field3633[var95] - 1, 0, null, class666.field9272[var95], var96, false, class711.field9799[var95], class204.field3076[var95], (byte) -52);
            }
            var95++;
            var96 <<= 0x1;
        }
        if (var91) {
            for (int var97 = 0; var97 < arg4.length; var97++) {
                if (arg4[var97] != -1) {
                    int var98 = arg4[var97] - arg9;
                    int var99 = var98 & 0x3FFF;
                    class650 var100 = arg18.method565();
                    var100.method1879(var99);
                    var90.method293(var100, 0x1 << var97, false);
                }
            }
        }
        if (var91 && var93 != null) {
            for (int var101 = 0; var101 < arg4.length; var101++) {
                if (var93[var101] != null) {
                    var90.method293(var93[var101], 0x1 << var101, false);
                }
            }
        }
        if (var45 != null && var51 != null) {
            var90.method2853(106, var44, var47, arg8.field3037, var52, var43, false, var49, var50, var42, arg5 - 1, var45, arg0 - 1, var46, var51);
        } else if (var45 != null) {
            var90.method2854(0, false, var44, arg5 - 1, var43, -100, var45, var46, var42);
        } else if (var51 != null) {
            var90.method2854(0, false, var50, arg0 - 1, var49, -125, var51, var52, var47);
        }
        for (int var102 = 0; var102 < var33; var102++) {
            class461.field6275[var102] = null;
            class711.field9799[var102] = null;
            class554.field7827[var102] = null;
        }
        return var90;
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(IIILvda;)V")
    public final void method1021(int arg0, int arg1, int arg2, class195 arg3) {
        field2093++;
        if (~arg1 == arg2) {
            this.field2101[arg0] = 0;
        } else if (arg3.method1410((byte) 120, arg1) != null) {
            this.field2101[arg0] = class530.method3011(1073741824, arg1);
            this.method1024(112);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lmu;Lvda;Lbn;ILha;Llw;IBLvf;IILc;)Lka;")
    public final class499 method1022(class318 arg0, class195 arg1, class469 arg2, int arg3, class66 arg4, class688 arg5, int arg6, byte arg7, class163 arg8, int arg9, int arg10, class200 arg11) {
        field2089++;
        if (this.field2102 != -1) {
            return arg0.method2005(6, this.field2102).method3287(arg11, arg8, arg4, null, arg3, 0, arg9, arg6, arg5, arg10);
        }
        int var13 = arg3;
        if (arg11 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg11.field3040[arg10];
            var13 = arg3 | 0x20;
            Object var22 = null;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class366 var25 = arg8.method1277(var23, -1);
            if (var25 != null) {
                var15 |= var25.method2236(var24, (byte) -77);
                var14 |= var25.method2238(var24, 0);
                var17 |= var25.method2231(104, var24);
                var16 |= arg11.field3034;
            }
            if ((arg11.field3048 || class499.field6821) && arg6 != -1 && arg6 < arg11.field3040.length) {
                int var26 = arg11.field3040[arg6];
                int var27 = var26 >>> 16;
                class366 var28 = var23 == var27 ? var25 : arg8.method1277(var27, -1);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method2236(var29, (byte) -87);
                    var14 |= var28.method2238(var29, 0);
                    var17 |= var28.method2231(103, var29);
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
        class43 var30 = class23.field479;
        class499 var31;
        synchronized (class23.field479) {
            var31 = (class499) class23.field479.method266((byte) -123, this.field2100);
        }
        if (var31 == null || arg4.method482(var31.method300(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method593(var13, var31.method300());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field2101.length; var34++) {
                int var35 = this.field2101[var34];
                class222 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field2096 != null && this.field2096[var34] != null) {
                        var36 = this.field2096[var34];
                    }
                    if (!arg1.method1410((byte) 115, var35 & 0x3FFFFFFF).method4051((byte) -87, var36, this.field2095)) {
                        var33 = true;
                    }
                } else if ((var35 & Integer.MIN_VALUE) != 0 && !arg2.method2697(var35 & 0x3FFFFFFF, 9505).method3944(-71)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class5[] var37 = new class5[this.field2101.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field2101.length; var39++) {
                int var40 = this.field2101[var39];
                class222 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field2096 != null && this.field2096[var39] != null) {
                        var41 = this.field2096[var39];
                    }
                    class5 var42 = arg1.method1410((byte) 95, var40 & 0x3FFFFFFF).method4049(this.field2095, var41, (byte) 114);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((var40 & Integer.MIN_VALUE) != 0) {
                    class5 var43 = arg2.method2697(var40 & 0x3FFFFFFF, 9505).method3941(89);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            class5 var44 = new class5(var37, var38);
            int var45 = var13 | 0x4000;
            var31 = arg4.method505(var44, var45, class651.field9025, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class647.field8943.length; var47++) {
                    if (this.field2109[var46] < class647.field8943[var47][var46].length) {
                        var31.method308(class260.field3651[var47][var46], class647.field8943[var47][var46][this.field2109[var46]]);
                    }
                }
            }
            var31.method303(var13);
            class43 var48 = class23.field479;
            synchronized (class23.field479) {
                class23.field479.method270(var31, this.field2100, -124);
            }
        }
        if (arg7 < 43) {
            this.field2109 = null;
        }
        if (arg11 == null) {
            return var31;
        } else {
            var31.method324((byte) 4, var13, true);
            return arg11.method1436(arg10, arg6, arg9, arg3, (byte) -78, var31);
        }
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(I)V")
    public static void method1023(int arg0) {
        field2103 = null;
        field2105 = null;
        field2107 = null;
        if (arg0 == -1) {
            field2088 = null;
        }
    }

    @OriginalMember(owner = "client!qha", name = "b", descriptor = "(I)V")
    private final void method1024(int arg0) {
        field2099++;
        long[] var2 = class126.field2227;
        this.field2100 = -1L;
        this.field2100 = var2[(int) (((long) (this.field2106 >> 8) ^ this.field2100) & 0xFFL)] ^ this.field2100 >>> 8;
        this.field2100 = var2[(int) (((long) this.field2106 ^ this.field2100) & 0xFFL)] ^ this.field2100 >>> 8;
        for (int var3 = 0; var3 < this.field2101.length; var3++) {
            this.field2100 = var2[(int) (((long) (this.field2101[var3] >> 24) ^ this.field2100) & 0xFFL)] ^ this.field2100 >>> 8;
            this.field2100 = this.field2100 >>> 8 ^ var2[(int) ((this.field2100 ^ (long) (this.field2101[var3] >> 16)) & 0xFFL)];
            this.field2100 = this.field2100 >>> 8 ^ var2[(int) (((long) (this.field2101[var3] >> 8) ^ this.field2100) & 0xFFL)];
            this.field2100 = this.field2100 >>> 8 ^ var2[(int) (((long) this.field2101[var3] ^ this.field2100) & 0xFFL)];
        }
        if (this.field2096 != null) {
            for (int var4 = 0; var4 < this.field2096.length; var4++) {
                if (this.field2096[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field2095) {
                        var5 = this.field2096[var4].field3244;
                        var6 = this.field2096[var4].field3242;
                    } else {
                        var5 = this.field2096[var4].field3240;
                        var6 = this.field2096[var4].field3243;
                    }
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.length; var7++) {
                            this.field2100 = var2[(int) ((this.field2100 ^ (long) (var6[var7] >> 8)) & 0xFFL)] ^ this.field2100 >>> 8;
                            this.field2100 = this.field2100 >>> 8 ^ var2[(int) ((this.field2100 ^ (long) var6[var7]) & 0xFFL)];
                        }
                    }
                    if (var5 != null) {
                        for (int var8 = 0; var8 < var5.length; var8++) {
                            this.field2100 = var2[(int) ((this.field2100 ^ (long) (var5[var8] >> 8)) & 0xFFL)] ^ this.field2100 >>> 8;
                            this.field2100 = var2[(int) (((long) var5[var8] ^ this.field2100) & 0xFFL)] ^ this.field2100 >>> 8;
                        }
                    }
                    if (this.field2096[var4].field3241 != null) {
                        for (int var9 = 0; var9 < this.field2096[var4].field3241.length; var9++) {
                            this.field2100 = this.field2100 >>> 8 ^ var2[(int) ((this.field2100 ^ (long) (this.field2096[var4].field3241[var9] >> 8)) & 0xFFL)];
                            this.field2100 = this.field2100 >>> 8 ^ var2[(int) ((this.field2100 ^ (long) this.field2096[var4].field3241[var9]) & 0xFFL)];
                        }
                    }
                    if (this.field2096[var4].field3245 != null) {
                        for (int var10 = 0; var10 < this.field2096[var4].field3245.length; var10++) {
                            this.field2100 = var2[(int) ((this.field2100 ^ (long) (this.field2096[var4].field3245[var10] >> 8)) & 0xFFL)] ^ this.field2100 >>> 8;
                            this.field2100 = var2[(int) (((long) this.field2096[var4].field3245[var10] ^ this.field2100) & 0xFFL)] ^ this.field2100 >>> 8;
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field2100 = var2[(int) ((this.field2100 ^ (long) this.field2109[var11]) & 0xFFL)] ^ this.field2100 >>> 8;
        }
        if (arg0 < 51) {
            this.method1015(-10, null, -62, 87, null, 34, -114, 40, null, null, -62, true);
        }
        this.field2100 = this.field2100 >>> 8 ^ var2[(int) ((this.field2100 ^ (long) (this.field2095 ? 1 : 0)) & 0xFFL)];
    }

    @OriginalMember(owner = "client!qha", name = "a", descriptor = "(Lbn;IBI)V")
    public final void method1025(class469 arg0, int arg1, byte arg2, int arg3) {
        field2094++;
        if (arg2 != 110) {
            field2103 = null;
        }
        int var5 = class578.field8189[arg1];
        if (arg0.method2697(arg3, arg2 + 9395) != null) {
            this.field2101[var5] = class530.method3011(Integer.MIN_VALUE, arg3);
            this.method1024(114);
        }
    }
}
