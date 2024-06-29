import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cf")
public class class260 {

    @OriginalMember(owner = "client!cf", name = "o", descriptor = "Z")
    public boolean field4369 = true;

    @OriginalMember(owner = "client!cf", name = "c", descriptor = "I")
    public int field4357;

    @OriginalMember(owner = "client!cf", name = "k", descriptor = "I")
    public int field4365;

    @OriginalMember(owner = "client!cf", name = "f", descriptor = "I")
    public int field4360;

    @OriginalMember(owner = "client!cf", name = "m", descriptor = "I")
    public int field4367;

    @OriginalMember(owner = "client!cf", name = "b", descriptor = "I")
    public int field4356;

    @OriginalMember(owner = "client!cf", name = "j", descriptor = "I")
    public int field4364;

    @OriginalMember(owner = "client!cf", name = "e", descriptor = "Lwd;")
    public static class112 field4359 = null;

    @OriginalMember(owner = "client!cf", name = "p", descriptor = "Z")
    public static boolean field4370 = false;

    @OriginalMember(owner = "client!cf", name = "l", descriptor = "I")
    public static int field4366 = 0;

    @OriginalMember(owner = "client!cf", name = "i", descriptor = "Lce;")
    public static class126 field4363 = class206.method1445(-7923, ")4a=");

    @OriginalMember(owner = "client!cf", name = "q", descriptor = "[I")
    public static int[] field4371 = new int[] { 2, 2, 4, 0, 1, 8, 0, 0, 0, 0, 2, 0 };

    @OriginalMember(owner = "client!cf", name = "d", descriptor = "Lpb;")
    public static class285 field4358 = new class285();

    @OriginalMember(owner = "client!cf", name = "s", descriptor = "Lce;")
    public static class126 field4373 = class206.method1445(-7923, "logo");

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "I")
    public static int field4355;

    @OriginalMember(owner = "client!cf", name = "h", descriptor = "I")
    public static int field4362;

    @OriginalMember(owner = "client!cf", name = "n", descriptor = "I")
    public static int field4368;

    @OriginalMember(owner = "client!cf", name = "r", descriptor = "I")
    public static int field4372;

    @OriginalMember(owner = "client!cf", name = "t", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!cf", name = "g", descriptor = "[[[B")
    public static byte[][][] field4361;

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIB)V", line = 11)
    public static final void method1759(int arg0, int arg1, byte arg2) {
        field4372++;
        if (arg2 >= 73) {
            class245 var3 = class139.method1022(5, (byte) -123, arg1);
            var3.method1683(0);
            var3.field4154 = arg0;
        }
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I)V", line = 25)
    public static void method1760(int arg0) {
        field4359 = null;
        field4373 = null;
        field4371 = null;
        field4358 = null;
        field4361 = (byte[][][]) null;
        field4363 = null;
        int var1 = -20 / ((-arg0 - 14) / 61);
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(BLcj;)I", line = 57)
    public static final int method1761(byte arg0, class301 arg1) {
        field4355++;
        int var2 = arg1.field4988;
        if (arg1.field2501 == arg1.field2441) {
            var2 = arg1.field5002;
        } else if (arg1.field2501 == arg1.field2464) {
            var2 = arg1.field5022;
        }
        return arg0 <= 81 ? 0 : var2;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(IIIBI)V", line = 83)
    public static final void method1762(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != 48) {
            method1763(125, (byte[]) null);
        }
        class52.field795 = arg4;
        class194.field3302 = arg2;
        field4362++;
        class321.field5489 = arg0;
        class197.field3372 = arg1;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "(I[B)[B", line = 116)
    public static final byte[] method1763(int arg0, byte[] arg1) {
        field4368++;
        if (arg1 == null) {
            return null;
        }
        byte[] var2 = new byte[arg1.length];
        class230.method1562(arg1, 0, var2, 0, arg1.length);
        if (arg0 != -32556) {
            method1761((byte) -13, (class301) null);
        }
        return var2;
    }

    @OriginalMember(owner = "client!cf", name = "<init>", descriptor = "(IIIIIIZ)V", line = 137)
    public class260(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        this.field4369 = arg6;
        this.field4357 = arg0;
        this.field4365 = arg2;
        this.field4360 = arg3;
        this.field4367 = arg5;
        this.field4356 = arg1;
        this.field4364 = arg4;
    }

    @OriginalMember(owner = "client!cf", name = "a", descriptor = "([[I[[F[[II[[IB[[B[[I[[B[[B[[I[[F[[[B[[B[[F)[Lbi;", line = 157)
    public static final class201[] method1764(int[][] arg0, float[][] arg1, int[][] arg2, int arg3, int[][] arg4, byte arg5, byte[][] arg6, int[][] arg7, byte[][] arg8, byte[][] arg9, int[][] arg10, float[][] arg11, byte[][][] arg12, byte[][] arg13, float[][] arg14) {
        field4374++;
        int[][] var15 = new int[105][105];
        for (int var16 = 1; var16 <= 103; var16++) {
            for (int var17 = 1; var17 <= 103; var17++) {
                byte var18 = arg13[var16][var17];
                if (var18 == 0) {
                    var18 = arg13[var16 - 1][var17];
                }
                if (var18 == 0) {
                    var18 = arg13[var16][var17 - 1];
                }
                if (var18 == 0) {
                    var18 = arg13[var16 - 1][var17 - 1];
                }
                if (var18 != 0) {
                    class224 var19 = class9.method53((var18 & 0xFF) - 1, 27993);
                    var15[var16][var17] = (var19.field3766 + 1 << 16) + var19.field3771;
                }
            }
        }
        class237 var20 = new class237(128);
        int var21 = 120 / ((arg5 - 47) / 32);
        for (int var22 = 1; var22 <= 102; var22++) {
            for (int var23 = 1; var23 <= 102; var23++) {
                if (arg13[var22][var23] != 0) {
                    int[] var24;
                    if (arg8[var22][var23] == 0) {
                        var24 = class40.field633[0];
                    } else {
                        var24 = class279.field4642[arg6[var22][var23]];
                        if (var24.length == 0) {
                            continue;
                        }
                    }
                    int var25 = 0;
                    if (arg4 != null) {
                        var25 = arg4[var22][var23] & 0xFFFFFF;
                    }
                    int var26 = var15[var22][var23];
                    int var27 = var15[var22 + 1][var23];
                    long var28 = (long) var26 << 32 | (long) var25;
                    int var30 = var15[var22 + 1][var23 + 1];
                    int var31 = var15[var22][var23 + 1];
                    long var32 = (long) var27 << 32 | (long) var25;
                    long var34 = (long) var30 << 32 | (long) var25;
                    long var36 = (long) var25 | (long) var31 << 32;
                    int var38 = var24.length / 2;
                    class201 var39 = (class201) var20.method1631(false, var28);
                    if (var39 == null) {
                        var39 = new class201((var26 >> 16) - 1, (float) (var26 & 0xFFFF), false, arg10 != null, var25);
                        var20.method1636(11311, var39, var28);
                    }
                    var39.field3416 += var38;
                    var39.field3422++;
                    if (var28 != var32) {
                        class201 var40 = (class201) var20.method1631(false, var32);
                        if (var40 == null) {
                            var40 = new class201((var27 >> 16) - 1, (float) (var27 & 0xFFFF), false, arg10 != null, var25);
                            var20.method1636(11311, var40, var32);
                        }
                        var40.field3422++;
                        var40.field3416 += var38;
                    }
                    if (var28 != var34 && var32 != var34) {
                        class201 var41 = (class201) var20.method1631(false, var34);
                        if (var41 == null) {
                            var41 = new class201((var30 >> 16) - 1, (float) (var30 & 0xFFFF), false, arg10 != null, var25);
                            var20.method1636(11311, var41, var34);
                        }
                        var41.field3422++;
                        var41.field3416 += var38;
                    }
                    if (var28 != var36 && var32 != var36 && var34 != var36) {
                        class201 var42 = (class201) var20.method1631(false, var36);
                        if (var42 == null) {
                            var42 = new class201((var31 >> 16) - 1, (float) (var31 & 0xFFFF), false, arg10 != null, var25);
                            var20.method1636(11311, var42, var36);
                        }
                        var42.field3422++;
                        var42.field3416 += var38;
                    }
                }
            }
        }
        for (class201 var43 = (class201) var20.method1630((byte) 56); var43 != null; var43 = (class201) var20.method1632(-76)) {
            var43.method1421();
        }
        for (int var44 = 1; var44 <= 102; var44++) {
            for (int var45 = 1; var45 <= 102; var45++) {
                byte var46 = arg13[var44][var45];
                if (var46 != 0) {
                    int var47;
                    if ((arg12[arg3][var44][var45] & 0x8) != 0) {
                        var47 = 0;
                    } else if ((arg12[1][var44][var45] & 0x2) == 2 && arg3 > 0) {
                        var47 = arg3 - 1;
                    } else {
                        var47 = arg3;
                    }
                    int var48 = 128;
                    int var49 = 0;
                    if (arg4 != null) {
                        var49 = arg4[var44][var45] & 0xFFFFFF;
                        var48 = arg4[var44][var45] >>> 24 << 3;
                    }
                    boolean[] var50 = null;
                    int[] var51;
                    byte var62;
                    if (arg8[var44][var45] == 0) {
                        var51 = class40.field633[0];
                        byte var52 = 0;
                        int var53 = var52 + (arg13[var44 - 1][var45 - 1] == var46 ? 1 : -1);
                        byte var54 = 0;
                        byte var55 = 0;
                        int var56 = var55 + (arg13[var44 - 1][var45 + 1] == var46 ? 1 : -1);
                        int var57 = var54 + (arg13[var44 + 1][var45 + 1] == var46 ? 1 : -1);
                        byte var58 = 0;
                        int var59 = var58 + (arg13[var44 + 1][var45 - 1] == var46 ? 1 : -1);
                        if (arg13[var44][var45 - 1] == var46) {
                            var59++;
                            var53++;
                        } else {
                            var59--;
                            var53--;
                        }
                        if (arg13[var44 + 1][var45] == var46) {
                            var57++;
                            var59++;
                        } else {
                            var57--;
                            var59--;
                        }
                        if (arg13[var44][var45 + 1] == var46) {
                            var57++;
                            var56++;
                        } else {
                            var56--;
                            var57--;
                        }
                        if (arg13[var44 - 1][var45] == var46) {
                            var56++;
                            var53++;
                        } else {
                            var56--;
                            var53--;
                        }
                        int var60 = var59 - var56;
                        int var61 = var53 - var57;
                        if (var61 < 0) {
                            var61 = -var61;
                        }
                        if (var60 < 0) {
                            var60 = -var60;
                        }
                        var62 = (byte) (var61 >= var60 ? 0 : 1);
                        arg9[var44][var45] = var62;
                    } else {
                        var62 = arg9[var44][var45];
                        var51 = class279.field4642[arg6[var44][var45]];
                        var50 = class31.field432[arg6[var44][var45]];
                        if (var51.length == 0) {
                            continue;
                        }
                    }
                    int var63 = var15[var44][var45];
                    int var64 = var15[var44 + 1][var45 + 1];
                    long var65 = (long) var63 << 32 | (long) var49;
                    int var67 = var15[var44][var45 + 1];
                    int var68 = var15[var44 + 1][var45];
                    long var69 = (long) var64 << 32 | (long) var49;
                    long var71 = (long) var68 << 32 | (long) var49;
                    long var73 = (long) var49 | (long) var67 << 32;
                    int var75 = arg2[var44 + 1][var45];
                    int var76 = arg2[var44][var45];
                    int var77 = arg0[var44][var45];
                    int var78 = arg2[var44][var45 + 1];
                    int var79 = arg2[var44 + 1][var45 + 1];
                    int var80 = arg0[var44 + 1][var45];
                    int var81 = arg0[var44 + 1][var45 + 1];
                    int var82 = arg0[var44][var45 + 1];
                    int var83 = (var68 >> 16) - 1;
                    int var84 = (var64 >> 16) - 1;
                    int var85 = (var63 >> 16) - 1;
                    int var86 = (var67 >> 16) - 1;
                    class201 var87 = (class201) var20.method1631(false, var65);
                    class16.method89(class285.method1899(var80, var75, (byte) 123, var85), var45, var51, var44, arg14, var62, var68 >= var63, var63 <= var64, var47, class285.method1899(var77, var76, (byte) 111, var85), arg11, var63 <= var67, var50, class285.method1899(var82, var78, (byte) 108, var85), var87, var48, 127, class285.method1899(var81, var79, (byte) -15, var85), arg1, var63 <= var63, arg7, arg10);
                    if (var65 != var71) {
                        class201 var88 = (class201) var20.method1631(false, var71);
                        class16.method89(class285.method1899(var80, var75, (byte) 125, var83), var45, var51, var44, arg14, var62, var68 >= var68, var64 >= var68, var47, class285.method1899(var77, var76, (byte) 95, var83), arg11, var67 >= var68, var50, class285.method1899(var82, var78, (byte) 6, var83), var88, var48, 123, class285.method1899(var81, var79, (byte) 110, var83), arg1, var68 <= var63, arg7, arg10);
                    }
                    if (var65 != var69 && var69 != var71) {
                        class201 var89 = (class201) var20.method1631(false, var69);
                        class16.method89(class285.method1899(var80, var75, (byte) 99, var84), var45, var51, var44, arg14, var62, var68 >= var64, var64 >= var64, var47, class285.method1899(var77, var76, (byte) 87, var84), arg11, var64 <= var67, var50, class285.method1899(var82, var78, (byte) 4, var84), var89, var48, 97, class285.method1899(var81, var79, (byte) -95, var84), arg1, var63 >= var64, arg7, arg10);
                    }
                    if (var65 != var73 && var71 != var73 && var69 != var73) {
                        class201 var90 = (class201) var20.method1631(false, var73);
                        class16.method89(class285.method1899(var80, var75, (byte) -8, var86), var45, var51, var44, arg14, var62, var67 <= var68, var67 <= var64, var47, class285.method1899(var77, var76, (byte) 1, var86), arg11, var67 <= var67, var50, class285.method1899(var82, var78, (byte) 100, var86), var90, var48, 122, class285.method1899(var81, var79, (byte) 96, var86), arg1, var67 <= var63, arg7, arg10);
                    }
                }
            }
        }
        for (class201 var91 = (class201) var20.method1630((byte) 56); var91 != null; var91 = (class201) var20.method1632(-100)) {
            if (var91.field3438 == 0) {
                var91.method499((byte) 64);
            } else {
                var91.method1417();
            }
        }
        int var92 = var20.method1635((byte) 94);
        long[] var93 = new long[var92];
        class201[] var94 = new class201[var92];
        var20.method1628(var94, 125);
        for (int var95 = 0; var95 < var92; var95++) {
            var93[var95] = var94[var95].field1117;
        }
        class8.method44(var94, false, var93);
        return var94;
    }
}
