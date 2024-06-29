import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oe")
public class class136 {

    @OriginalMember(owner = "client!oe", name = "r", descriptor = "I")
    public int field1813 = -1;

    @OriginalMember(owner = "client!oe", name = "t", descriptor = "Lho;")
    public static class103 field1815 = new class103(64, -1);

    @OriginalMember(owner = "client!oe", name = "x", descriptor = "[I")
    public static int[] field1819 = new int[] { 0, 2, 2, 2, 1, 1, 3, 3, 1, 3, 3, 4, 4 };

    @OriginalMember(owner = "client!oe", name = "v", descriptor = "[I")
    public static int[] field1817 = new int[] { 2047, 16383, 65535 };

    @OriginalMember(owner = "client!oe", name = "u", descriptor = "Lhn;")
    public static class509 field1816 = new class509(10);

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "I")
    public static int field1796;

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "I")
    public static int field1797;

    @OriginalMember(owner = "client!oe", name = "c", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!oe", name = "d", descriptor = "I")
    public static int field1799;

    @OriginalMember(owner = "client!oe", name = "e", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!oe", name = "g", descriptor = "I")
    public static int field1802;

    @OriginalMember(owner = "client!oe", name = "h", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!oe", name = "i", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!oe", name = "j", descriptor = "I")
    private int field1805;

    @OriginalMember(owner = "client!oe", name = "m", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!oe", name = "p", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!oe", name = "q", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!oe", name = "w", descriptor = "I")
    public static int field1818;

    @OriginalMember(owner = "client!oe", name = "k", descriptor = "J")
    private long field1806;

    @OriginalMember(owner = "client!oe", name = "l", descriptor = "J")
    private long field1807;

    @OriginalMember(owner = "client!oe", name = "s", descriptor = "Z")
    public boolean field1814;

    @OriginalMember(owner = "client!oe", name = "f", descriptor = "[I")
    private int[] field1801;

    @OriginalMember(owner = "client!oe", name = "n", descriptor = "[I")
    public int[] field1809;

    @OriginalMember(owner = "client!oe", name = "o", descriptor = "[[I")
    private int[][] field1810;

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILoj;ILza;IIILvm;Lrq;IIB)Le;")
    public final class373 method816(int arg0, class260 arg1, int arg2, class287 arg3, int arg4, int arg5, int arg6, class485 arg7, class235 arg8, int arg9, int arg10, byte arg11) {
        field1798++;
        int var13 = arg9;
        if (arg1 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg1.field3474[arg5];
            Object var22 = null;
            var13 = arg9 | 0x20;
            int var23 = var21 >>> 16;
            class516 var24 = arg7.method2953(15, var23);
            int var25 = var21 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3077(var25, (byte) 53);
                var14 |= var24.method3073(var25, true);
                var17 |= var24.method3072(var25, 2693);
                var16 |= arg1.field3493;
            }
            if ((arg1.field3470 || class134.field1761) && arg4 != -1 && arg4 < arg1.field3474.length) {
                int var26 = arg1.field3474[arg4];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class516 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg7.method2953(15, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method3077(var28, (byte) 53);
                    var14 |= var29.method3073(var28, true);
                    var17 |= var29.method3072(var28, 2693);
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
        long var30 = (long) arg0 | (long) (arg2 << 16) | (long) arg6 << 32;
        class509 var32 = class415.field5946;
        class373 var33;
        synchronized (class415.field5946) {
            var33 = (class373) class415.field5946.method3032(3589, var30);
        }
        if (var33 == null || arg3.method1191(var33.method2025(), var13) != 0) {
            if (var33 != null) {
                var13 = arg3.method1211(var13, var33.method2025());
            }
            class131[] var35 = new class131[3];
            int var36 = 0;
            if (!arg8.method1483(false, arg0).method3009(true) || !arg8.method1483(false, arg2).method3009(true) || !arg8.method1483(false, arg6).method3009(true)) {
                return null;
            }
            class131 var37 = arg8.method1483(false, arg0).method3007(-24906);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class131 var38 = arg8.method1483(false, arg2).method3007(-24906);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class131 var39 = arg8.method1483(false, arg6).method3007(-24906);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            class131 var40 = new class131(var35, var36);
            int var41 = var13 | 0x4000;
            var33 = arg3.method1213(var40, var41, class247.field3258, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                if (class115.field1509[var42].length > this.field1809[var42]) {
                    var33.method2032(class109.field1463[var42], class115.field1509[var42][this.field1809[var42]]);
                }
                if (class29.field280[var42].length > this.field1809[var42]) {
                    var33.method2032(class495.field7232[var42], class29.field280[var42][this.field1809[var42]]);
                }
            }
            var33.method2034(var13);
            class509 var43 = class415.field5946;
            synchronized (class415.field5946) {
                class415.field5946.method3046(var30, var33, 1);
            }
        }
        if (arg1 == null) {
            return var33;
        }
        if (arg11 >= -9) {
            method825(79, 23, -125, (byte) 81, -76);
        }
        class373 var44 = var33.method2027((byte) 4, var13, true);
        return arg1.method1599(var44, arg9, arg4, (byte) -54, arg5, arg10);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lrq;BII)V")
    public final void method817(class235 arg0, byte arg1, int arg2, int arg3) {
        field1800++;
        int var5 = class122.field1575[arg2];
        if (this.field1801[var5] == 0) {
            return;
        }
        if (arg1 != -41) {
            this.field1813 = 46;
        }
        if (arg0.method1483(false, arg3) != null) {
            this.field1801[var5] = class219.method1381(Integer.MIN_VALUE, arg3);
            this.method824(6366);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lvm;ILtb;Loj;Lro;Lrq;ILza;ILmk;IZ)Le;")
    public final class373 method818(class485 arg0, int arg1, class275 arg2, class260 arg3, class2 arg4, class235 arg5, int arg6, class287 arg7, int arg8, class40 arg9, int arg10, boolean arg11) {
        field1799++;
        if (this.field1813 != -1) {
            return arg2.method1670((byte) -74, this.field1813).method1349(arg0, (byte) -102, arg10, arg8, arg6, arg7, arg4, arg1, arg3);
        }
        int var13 = arg10;
        if (arg3 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg3.field3474[arg8];
            var13 = arg10 | 0x20;
            int var23 = var22 >>> 16;
            class516 var24 = arg0.method2953(15, var23);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3077(var25, (byte) 53);
                var14 |= var24.method3073(var25, true);
                var17 |= var24.method3072(var25, 2693);
                var16 |= arg3.field3493;
            }
            if ((arg3.field3470 || class134.field1761) && arg6 != -1 && arg6 < arg3.field3474.length) {
                int var26 = arg3.field3474[arg6];
                int var27 = var26 >>> 16;
                class516 var28 = var23 == var27 ? var24 : arg0.method2953(15, var27);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3077(var29, (byte) 53);
                    var14 |= var28.method3073(var29, !arg11);
                    var17 |= var28.method3072(var29, 2693);
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
        class509 var30 = class415.field5946;
        class373 var31;
        synchronized (class415.field5946) {
            var31 = (class373) class415.field5946.method3032(3589, this.field1806);
        }
        if (var31 == null || arg7.method1191(var31.method2025(), var13) != 0) {
            if (var31 != null) {
                var13 = arg7.method1211(var13, var31.method2025());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field1801[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg5.method1483(false, var35 & 0x3FFFFFFF).method3009(!arg11)) {
                        var33 = true;
                    }
                } else if (!arg9.method236(-18315, var35 & 0x3FFFFFFF).method1273(this.field1814, 25586)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class131[] var36 = new class131[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field1801[var38];
                if ((var39 & 0x40000000) != 0) {
                    class131 var40 = arg9.method236(-18315, var39 & 0x3FFFFFFF).method1276(0, this.field1814);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((Integer.MIN_VALUE & var39) != 0) {
                    class131 var41 = arg5.method1483(false, var39 & 0x3FFFFFFF).method3007(-24906);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            int var42 = var13 | 0x4000;
            class131 var43 = new class131(var36, var37);
            var31 = arg7.method1213(var43, var42, class247.field3258, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                if (class115.field1509[var44].length > this.field1809[var44]) {
                    var31.method2032(class109.field1463[var44], class115.field1509[var44][this.field1809[var44]]);
                }
                if (this.field1809[var44] < class29.field280[var44].length) {
                    var31.method2032(class495.field7232[var44], class29.field280[var44][this.field1809[var44]]);
                }
            }
            var31.method2034(var13);
            class509 var45 = class415.field5946;
            synchronized (class415.field5946) {
                class415.field5946.method3046(this.field1806, var31, 1);
            }
        }
        if (arg3 == null) {
            return var31;
        }
        if (arg11) {
            this.method817(null, (byte) 100, -52, 124);
        }
        var31.method2027((byte) 4, var13, true);
        return arg3.method1599(var31, arg10, arg6, (byte) -54, arg8, arg1);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(ILza;IIIII)Le;")
    public static final class373 method819(int arg0, class287 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field1812++;
        long var7 = (long) arg2;
        class373 var9 = (class373) class220.field2973.method3032(3589, var7);
        short var10 = 2055;
        if (var9 == null) {
            class131 var11 = class490.method2960(0, arg2, class95.field1136, -114);
            if (var11 == null) {
                return null;
            }
            if (var11.field1693 < 13) {
                var11.method787(0, 0);
            }
            var9 = arg1.method1213(var11, var10, class57.field679, 64, 768);
            class220.field2973.method3046(var7, var9, 1);
        }
        class373 var12 = var9.method2027((byte) 2, var10, true);
        if (arg6 != 0) {
            var12.method2014(arg6);
        }
        if (arg5 != 0) {
            var12.method2022(arg5);
        }
        if (arg4 != 0) {
            var12.method2039(arg4);
        }
        int var13 = -115 / ((arg0 + 79) / 36);
        if (arg3 != 0) {
            var12.method2044(0, arg3, 0);
        }
        return var12;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IZ[II[II)V")
    public final void method820(int arg0, boolean arg1, int[] arg2, int arg3, int[] arg4, int arg5) {
        this.field1814 = arg1;
        this.field1809 = arg2;
        field1803++;
        this.field1813 = arg5;
        if (arg0 != -13124) {
            this.field1809 = null;
        }
        this.field1801 = arg4;
        if (this.field1805 != arg3) {
            this.field1805 = arg3;
            this.field1810 = null;
        }
        this.method824(6366);
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(III)V")
    public final void method821(int arg0, int arg1, int arg2) {
        field1796++;
        this.field1809[arg0] = arg1;
        if (arg2 > 9) {
            this.method824(6366);
        }
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(I)V")
    public static void method822(int arg0) {
        field1819 = null;
        field1817 = null;
        field1816 = null;
        if (arg0 != 3984) {
            method827(null, null, -122, null, null);
        }
        field1815 = null;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(BZ)V")
    public final void method823(byte arg0, boolean arg1) {
        field1808++;
        this.field1814 = arg1;
        int var3 = -46 % ((4 - arg0) / 35);
        this.method824(6366);
    }

    @OriginalMember(owner = "client!oe", name = "b", descriptor = "(I)V")
    private final void method824(int arg0) {
        field1797++;
        long[] var2 = class6.field77;
        this.field1806 = -1L;
        this.field1806 = var2[(int) (((long) (this.field1805 >> 8) ^ this.field1806) & 0xFFL)] ^ this.field1806 >>> 8;
        this.field1806 = var2[(int) (((long) this.field1805 ^ this.field1806) & 0xFFL)] ^ this.field1806 >>> 8;
        if (arg0 != 6366) {
            return;
        }
        for (int var3 = 0; var3 < 12; var3++) {
            this.field1806 = var2[(int) ((this.field1806 ^ (long) (this.field1801[var3] >> 24)) & 0xFFL)] ^ this.field1806 >>> 8;
            this.field1806 = var2[(int) (((long) (this.field1801[var3] >> 16) ^ this.field1806) & 0xFFL)] ^ this.field1806 >>> 8;
            this.field1806 = this.field1806 >>> 8 ^ var2[(int) ((this.field1806 ^ (long) (this.field1801[var3] >> 8)) & 0xFFL)];
            this.field1806 = var2[(int) ((this.field1806 ^ (long) this.field1801[var3]) & 0xFFL)] ^ this.field1806 >>> 8;
        }
        for (int var4 = 0; var4 < 5; var4++) {
            this.field1806 = this.field1806 >>> 8 ^ var2[(int) (((long) this.field1809[var4] ^ this.field1806) & 0xFFL)];
        }
        this.field1806 = var2[(int) ((this.field1806 ^ (long) (this.field1814 ? 1 : 0)) & 0xFFL)] ^ this.field1806 >>> 8;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(IIIBI)V")
    public static final void method825(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        field1804++;
        if (arg3 != -120) {
            field1815 = null;
        }
        class184 var5 = class277.method1682(arg2, 4, -71);
        var5.method1069(true);
        var5.field2393 = arg0;
        var5.field2392 = arg1;
        var5.field2388 = arg4;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "([Lf;Lro;IILoj;Lza;ILvm;Lmk;IIILbg;ILrq;Loj;ILtb;Z)Le;")
    public final class373 method826(class533[] arg0, class2 arg1, int arg2, int arg3, class260 arg4, class287 arg5, int arg6, class485 arg7, class40 arg8, int arg9, int arg10, int arg11, class326 arg12, int arg13, class235 arg14, class260 arg15, int arg16, class275 arg17, boolean arg18) {
        if (arg13 != 65535) {
            this.method823((byte) 93, false);
        }
        field1802++;
        if (this.field1813 != -1) {
            return arg17.method1670((byte) -66, this.field1813).method1358(arg11, arg15, arg16, arg0, arg10, arg3, arg12, arg5, -113, arg2, arg4, arg7, arg9, arg1, arg6);
        }
        int var20 = arg16;
        long var21 = this.field1806;
        int[] var23 = this.field1801;
        if (arg4 != null && (arg4.field3469 >= 0 || arg4.field3488 >= 0)) {
            var23 = new int[12];
            for (int var24 = 0; var24 < 12; var24++) {
                var23[var24] = this.field1801[var24];
            }
            if (arg4.field3469 >= 0) {
                if (arg4.field3469 == 65535) {
                    var23[5] = 0;
                    var21 ^= 0xFFFFFFFF00000000L;
                } else {
                    var23[5] = class219.method1381(1073741824, arg4.field3469);
                    var21 ^= (long) var23[5] << 32;
                }
            }
            if (arg4.field3488 >= 0) {
                if (arg4.field3488 == 65535) {
                    var21 ^= 0xFFFFFFFFL;
                    var23[3] = 0;
                } else {
                    var23[3] = class219.method1381(arg4.field3488, 1073741824);
                    var21 ^= var23[3];
                }
            }
        }
        boolean var25 = false;
        boolean var26 = false;
        boolean var27 = false;
        boolean var28 = arg4 != null || arg15 != null;
        int var29 = arg0 == null ? 0 : arg0.length;
        for (int var30 = 0; var30 < var29; var30++) {
            class267.field3577[var30] = null;
            if (arg0[var30] != null) {
                class260 var31 = arg7.method2951(arg0[var30].field7847, arg13 - 79300);
                if (var31.field3474 != null) {
                    class38.field398[var30] = var31;
                    var28 = true;
                    int var32 = arg0[var30].field7841;
                    int var33 = arg0[var30].field7845;
                    int var34 = var31.field3474[var32];
                    class267.field3577[var30] = arg7.method2953(arg13 - 65520, var34 >>> 16);
                    int var35 = var34 & 0xFFFF;
                    class235.field3135[var30] = var35;
                    if (class267.field3577[var30] != null) {
                        var26 |= class267.field3577[var30].method3077(var35, (byte) 53);
                        var25 |= class267.field3577[var30].method3073(var35, true);
                        var27 |= class267.field3577[var30].method3072(var35, 2693);
                    }
                    if ((var31.field3470 || class134.field1761) && var33 != -1 && var31.field3474.length > var33) {
                        class414.field5919[var30] = var31.field3489[var32];
                        class450.field6690[var30] = arg0[var30].field7842;
                        int var36 = var31.field3474[var33];
                        class444.field6466[var30] = arg7.method2953(15, var36 >>> 16);
                        int var37 = var36 & 0xFFFF;
                        class263.field3524[var30] = var37;
                        if (class444.field6466[var30] != null) {
                            var26 |= class444.field6466[var30].method3077(var37, (byte) 53);
                            var25 |= class444.field6466[var30].method3073(var37, true);
                            var27 |= class444.field6466[var30].method3072(var37, 2693);
                        }
                    } else {
                        class414.field5919[var30] = 0;
                        class450.field6690[var30] = 0;
                        class444.field6466[var30] = null;
                        class263.field3524[var30] = -1;
                    }
                }
            }
        }
        int var38 = -1;
        int var39 = -1;
        int var40 = 0;
        class516 var41 = null;
        class516 var42 = null;
        int var43 = -1;
        int var44 = -1;
        int var45 = 0;
        class516 var46 = null;
        class516 var47 = null;
        if (var28) {
            if (arg4 != null) {
                int var48 = arg4.field3474[arg9];
                int var49 = var48 >>> 16;
                var38 = var48 & 0xFFFF;
                var41 = arg7.method2953(arg13 ^ 0xFFF0, var49);
                if (var41 != null) {
                    var26 |= var41.method3077(var38, (byte) 53);
                    var25 |= var41.method3073(var38, true);
                    var27 |= var41.method3072(var38, 2693);
                }
                if ((arg4.field3470 || class134.field1761) && arg2 != -1 && arg4.field3474.length > arg2) {
                    int var50 = arg4.field3474[arg2];
                    var40 = arg4.field3489[arg9];
                    int var51 = var50 >>> 16;
                    var39 = var50 & 0xFFFF;
                    var42 = var49 == var51 ? var41 : arg7.method2953(15, var51);
                    if (var42 != null) {
                        var26 |= var42.method3077(var39, (byte) 53);
                        var25 |= var42.method3073(var39, true);
                        var27 |= var42.method3072(var39, 2693);
                    }
                }
            }
            var20 = arg16 | 0x20;
            if (arg15 != null) {
                int var52 = arg15.field3474[arg11];
                int var53 = var52 >>> 16;
                var43 = var52 & 0xFFFF;
                var46 = arg7.method2953(arg13 - 65520, var53);
                if (var46 != null) {
                    var26 |= var46.method3077(var43, (byte) 53);
                    var25 |= var46.method3073(var43, true);
                    var27 |= var46.method3072(var43, 2693);
                }
                if ((arg15.field3470 || class134.field1761) && arg3 != -1 && arg3 < arg15.field3474.length) {
                    var45 = arg15.field3489[arg11];
                    int var54 = arg15.field3474[arg3];
                    int var55 = var54 >>> 16;
                    var44 = var54 & 0xFFFF;
                    var47 = var53 == var55 ? var46 : arg7.method2953(arg13 - 65520, var55);
                    if (var47 != null) {
                        var26 |= var47.method3077(var44, (byte) 53);
                        var25 |= var47.method3073(var44, true);
                        var27 |= var47.method3072(var44, 2693);
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
        class509 var56 = class528.field7748;
        class373 var57;
        synchronized (class528.field7748) {
            var57 = (class373) class528.field7748.method3032(3589, var21);
        }
        class306 var58 = null;
        if (this.field1805 != -1) {
            var58 = arg12.method1921(this.field1805, (byte) 35);
        }
        if (var57 == null || arg5.method1191(var57.method2025(), var20) != 0 || var58 != null && var58.field4069 != null && this.field1810 == null) {
            if (var57 != null) {
                var20 = arg5.method1211(var20, var57.method2025());
            }
            boolean var60 = false;
            for (int var61 = 0; var61 < 12; var61++) {
                int var62 = var23[var61];
                if ((var62 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var62) != 0 && !arg14.method1483(false, var62 & 0x3FFFFFFF).method3006(0)) {
                        var60 = true;
                    }
                } else if (!arg8.method236(-18315, var62 & 0x3FFFFFFF).method1268(30591, this.field1814)) {
                    var60 = true;
                }
            }
            if (var60) {
                if (this.field1807 != -1L) {
                    class509 var63 = class528.field7748;
                    synchronized (class528.field7748) {
                        var57 = (class373) class528.field7748.method3032(3589, this.field1807);
                    }
                }
                if (var57 == null || arg5.method1191(var57.method2025(), var20) != 0 || var58 != null && var58.field4069 != null && this.field1810 == null) {
                    return null;
                }
            } else {
                class131[] var64 = new class131[12];
                for (int var65 = 0; var65 < 12; var65++) {
                    int var66 = var23[var65];
                    if ((var66 & 0x40000000) != 0) {
                        class131 var68 = arg8.method236(-18315, var66 & 0x3FFFFFFF).method1286(67, this.field1814);
                        if (var68 != null) {
                            var64[var65] = var68;
                        }
                    } else if ((var66 & Integer.MIN_VALUE) != 0) {
                        class131 var67 = arg14.method1483(false, var66 & 0x3FFFFFFF).method3016(arg13 ^ 0xFFFF0024);
                        if (var67 != null) {
                            var64[var65] = var67;
                        }
                    }
                }
                if (var58 != null && var58.field4069 != null) {
                    for (int var69 = 0; var69 < var58.field4069.length; var69++) {
                        if (var58.field4069[var69] != null && var64[var69] != null) {
                            int var70 = var58.field4069[var69][0];
                            int var71 = var58.field4069[var69][1];
                            int var72 = var58.field4069[var69][2];
                            int var73 = var58.field4069[var69][3] << 3;
                            int var74 = var58.field4069[var69][4] << 3;
                            int var75 = var58.field4069[var69][5] << 3;
                            if (this.field1810 == null) {
                                this.field1810 = new int[var58.field4069.length][];
                            }
                            if (this.field1810[var69] == null) {
                                int[] var76 = this.field1810[var69] = new int[15];
                                if (var73 == 0 && var74 == 0 && var75 == 0) {
                                    var76[14] = -var72;
                                    var76[0] = var76[4] = var76[8] = 32768;
                                    var76[12] = -var70;
                                    var76[13] = -var71;
                                } else {
                                    int var77 = class456.field6811[var73];
                                    int var78 = class456.field6812[var73];
                                    int var79 = class456.field6811[var74];
                                    int var80 = class456.field6812[var74];
                                    int var81 = class456.field6811[var75];
                                    int var82 = class456.field6812[var75];
                                    int var83 = var78 * var81 + 16384 >> 15;
                                    int var84 = var78 * var82 + 16384 >> 15;
                                    var76[4] = var77 * var81 + 16384 >> 15;
                                    var76[2] = var77 * var80 + 16384 >> 15;
                                    var76[5] = -var78;
                                    var76[1] = -var82 * var79 - (-(var80 * var83) - 16384) >> 15;
                                    var76[7] = -var80 * -var82 + var79 * var83 + 16384 >> 15;
                                    var76[8] = var77 * var79 + 16384 >> 15;
                                    var76[3] = var77 * var82 + 16384 >> 15;
                                    var76[6] = -var80 * var81 + var79 * var84 + 16384 >> 15;
                                    var76[0] = var79 * var81 + var80 * var84 + 16384 >> 15;
                                    var76[14] = var76[2] * -var70 + 16384 - (-(var76[5] * -var71) + -(var76[8] * -var72)) >> 15;
                                    var76[12] = var76[6] * -var72 + var76[0] * -var70 - (-(var76[3] * -var71) - 16384) >> 15;
                                    var76[13] = var76[7] * -var72 + (var76[1] * -var70 + (var76[4] * -var71)) + 16384 >> 15;
                                }
                                var76[9] = var70;
                                var76[11] = var72;
                                var76[10] = var71;
                            }
                            if (var73 != 0 || var74 != 0 || var75 != 0) {
                                var64[var69].method786(var73, false, var74, var75);
                            }
                            if (var70 != 0 || var71 != 0 || var72 != 0) {
                                var64[var69].method795(var70, var72, true, var71);
                            }
                        }
                    }
                }
                class131 var85 = new class131(var64, var64.length);
                int var86 = var20 | 0x4000;
                var57 = arg5.method1213(var85, var86, class247.field3258, 64, 850);
                for (int var87 = 0; var87 < 5; var87++) {
                    if (class115.field1509[var87].length > this.field1809[var87]) {
                        var57.method2032(class109.field1463[var87], class115.field1509[var87][this.field1809[var87]]);
                    }
                    if (this.field1809[var87] < class29.field280[var87].length) {
                        var57.method2032(class495.field7232[var87], class29.field280[var87][this.field1809[var87]]);
                    }
                }
                if (arg18) {
                    var57.method2034(var20);
                    class509 var88 = class528.field7748;
                    synchronized (class528.field7748) {
                        class528.field7748.method3046(var21, var57, arg13 - 65534);
                    }
                    this.field1807 = var21;
                }
            }
        }
        class373 var89 = var57.method2027((byte) 4, var20, true);
        if (!var28) {
            return var89;
        }
        int var90 = 0;
        int var91 = 1;
        while (var29 > var90) {
            if (class267.field3577[var90] != null) {
                var89.method2207(-23551, class263.field3524[var90], var91, false, 0, class450.field6690[var90] - 1, class235.field3135[var90], class414.field5919[var90], this.field1810 == null ? null : this.field1810[var90], class444.field6466[var90], class267.field3577[var90]);
            }
            var90++;
            var91 <<= 0x1;
        }
        if (var41 != null && var46 != null) {
            var89.method2202(var43, var47, false, var41, arg10 - 1, var42, var46, var39, var44, var38, var40, arg6 - 1, var45, (byte) -38, arg4.field3464);
        } else if (var41 != null) {
            var89.method2208(var41, 0, var40, arg10 - 1, var39, var38, 1, false, var42);
        } else if (var46 != null) {
            var89.method2208(var46, 0, var45, arg6 - 1, var44, var43, 1, false, var47);
        }
        for (int var92 = 0; var92 < var29; var92++) {
            class267.field3577[var92] = null;
            class444.field6466[var92] = null;
            class38.field398[var92] = null;
        }
        return var89;
    }

    @OriginalMember(owner = "client!oe", name = "a", descriptor = "(Lfo;Lqm;ILfo;Lfo;)Z")
    public static final boolean method827(class361 arg0, class98 arg1, int arg2, class361 arg3, class361 arg4) {
        class246.field3235 = arg1;
        class287.field3777 = arg3;
        field1811++;
        class68.field781 = arg4;
        if (arg2 != 8) {
            method825(74, -53, 121, (byte) 56, -108);
        }
        class456.field6814 = arg0;
        return true;
    }
}
