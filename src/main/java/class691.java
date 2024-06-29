import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bca")
public class class691 {

    @OriginalMember(owner = "client!bca", name = "l", descriptor = "I")
    public int field9697 = -1;

    @OriginalMember(owner = "client!bca", name = "o", descriptor = "[[I")
    public static int[][] field9700 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 4, 6 }, { 0, 2, 4 }, { 4, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 4, 7, 6 }, { 4, 7, 6, 0 }, { 0, 8, 6, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 4, 6, 10, 0 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!bca", name = "d", descriptor = "I")
    public static int field9689 = -1;

    @OriginalMember(owner = "client!bca", name = "e", descriptor = "I")
    public static int field9690;

    @OriginalMember(owner = "client!bca", name = "f", descriptor = "I")
    public static int field9691;

    @OriginalMember(owner = "client!bca", name = "g", descriptor = "I")
    public static int field9692;

    @OriginalMember(owner = "client!bca", name = "h", descriptor = "I")
    public static int field9693;

    @OriginalMember(owner = "client!bca", name = "k", descriptor = "I")
    public static int field9696;

    @OriginalMember(owner = "client!bca", name = "n", descriptor = "I")
    public static int field9699;

    @OriginalMember(owner = "client!bca", name = "p", descriptor = "I")
    public static int field9701;

    @OriginalMember(owner = "client!bca", name = "r", descriptor = "I")
    public static int field9703;

    @OriginalMember(owner = "client!bca", name = "t", descriptor = "I")
    private int field9705;

    @OriginalMember(owner = "client!bca", name = "u", descriptor = "I")
    public static int field9706;

    @OriginalMember(owner = "client!bca", name = "v", descriptor = "I")
    public static int field9707;

    @OriginalMember(owner = "client!bca", name = "c", descriptor = "J")
    private long field9688;

    @OriginalMember(owner = "client!bca", name = "s", descriptor = "J")
    private long field9704;

    @OriginalMember(owner = "client!bca", name = "j", descriptor = "Ld;")
    public static class161 field9695;

    @OriginalMember(owner = "client!bca", name = "b", descriptor = "Laj;")
    public static class333 field9687;

    @OriginalMember(owner = "client!bca", name = "m", descriptor = "Lu;")
    public static class80 field9698;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "Z")
    public boolean field9686;

    @OriginalMember(owner = "client!bca", name = "i", descriptor = "[I")
    private int[] field9694;

    @OriginalMember(owner = "client!bca", name = "w", descriptor = "[I")
    public int[] field9708;

    @OriginalMember(owner = "client!bca", name = "q", descriptor = "[Lae;")
    private class265[] field9702;

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lvk;BII)V")
    public final void method3824(class389 arg0, byte arg1, int arg2, int arg3) {
        field9696++;
        if (arg3 == -1) {
            this.field9694[arg2] = 0;
        } else if (arg0.method2467(26, arg3) == null) {
            return;
        } else {
            this.field9694[arg2] = class213.method1409(1073741824, arg3);
            this.method3827((byte) -103);
        }
        if (arg1 != 65) {
            this.field9708 = null;
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lwh;IIIIIBLuaa;IILvq;Lha;)Lka;")
    public final class500 method3825(class158 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, class127 arg7, int arg8, int arg9, class489 arg10, class65 arg11) {
        if (arg6 <= 48) {
            this.field9704 = 56L;
        }
        field9690++;
        int var13 = arg3;
        if (arg10 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            int var22 = arg10.field6775[arg8];
            var13 = arg3 | 0x20;
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class717 var25 = arg7.method1030(-4849, var23);
            if (var25 != null) {
                var15 |= var25.method4006((byte) -114, var24);
                var14 |= var25.method4007(false, var24);
                var17 |= var25.method4005(var24, -1);
                var16 |= arg10.field6795;
            }
            if ((arg10.field6792 || class423.field6046) && arg5 != -1 && arg5 < arg10.field6775.length) {
                int var26 = arg10.field6775[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class717 var29;
                if (var23 == var27) {
                    var29 = var25;
                } else {
                    var29 = arg7.method1030(-4849, var28 >>> 16);
                }
                if (var29 != null) {
                    var15 |= var29.method4006((byte) -114, var28);
                    var14 |= var29.method4007(false, var28);
                    var17 |= var29.method4005(var28, -1);
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
        long var30 = (long) arg9 | (long) (arg4 << 16) | (long) arg2 << 32;
        class239 var32 = class87.field1228;
        class500 var33;
        synchronized (class87.field1228) {
            var33 = (class500) class87.field1228.method1541(-10, var30);
        }
        if (var33 == null || arg11.method517(var33.method325(), var13) != 0) {
            if (var33 != null) {
                var13 = arg11.method498(var13, var33.method325());
            }
            class782[] var35 = new class782[3];
            int var36 = 0;
            if (!arg0.method1162(arg9, 2).method2264(true) || !arg0.method1162(arg4, 2).method2264(true) || !arg0.method1162(arg2, 2).method2264(true)) {
                return null;
            }
            class782 var37 = arg0.method1162(arg9, 2).method2263(-13439);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class782 var38 = arg0.method1162(arg4, 2).method2263(-13439);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class782 var39 = arg0.method1162(arg2, 2).method2263(-13439);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class782 var41 = new class782(var35, var36);
            var33 = arg11.method510(var41, var40, class274.field4062, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class320.field4615.length; var43++) {
                    if (this.field9708[var42] < class320.field4615[var43][var42].length) {
                        var33.method306(class183.field2454[var43][var42], class320.field4615[var43][var42][this.field9708[var42]]);
                    }
                }
            }
            var33.method295(var13);
            class239 var44 = class87.field1228;
            synchronized (class87.field1228) {
                class87.field1228.method1544(true, var33, var30);
            }
        }
        if (arg10 == null) {
            return var33;
        } else {
            class500 var45 = var33.method298((byte) 4, var13, true);
            return arg10.method2846(arg1, var45, false, arg5, arg3, arg8);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZIIB[I[I[Lae;)V")
    public final void method3826(boolean arg0, int arg1, int arg2, byte arg3, int[] arg4, int[] arg5, class265[] arg6) {
        this.field9697 = arg1;
        this.field9686 = arg0;
        this.field9694 = arg4;
        if (this.field9705 != arg2) {
            this.field9705 = arg2;
        }
        this.field9708 = arg5;
        if (arg3 < 115) {
            this.method3824(null, (byte) -68, 32, -26);
        }
        field9692++;
        this.field9702 = arg6;
        this.method3827((byte) -93);
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(B)V")
    private final void method3827(byte arg0) {
        field9706++;
        this.field9704 = -1L;
        long[] var2 = class644.field8937;
        this.field9704 = this.field9704 >>> 8 ^ var2[(int) ((this.field9704 ^ (long) (this.field9705 >> 8)) & 0xFFL)];
        this.field9704 = var2[(int) (((long) this.field9705 ^ this.field9704) & 0xFFL)] ^ this.field9704 >>> 8;
        if (arg0 > -92) {
            this.method3825(null, -6, -94, -3, -59, -95, (byte) 33, null, -103, 97, null, null);
        }
        for (int var3 = 0; var3 < this.field9694.length; var3++) {
            this.field9704 = var2[(int) (((long) (this.field9694[var3] >> 24) ^ this.field9704) & 0xFFL)] ^ this.field9704 >>> 8;
            this.field9704 = this.field9704 >>> 8 ^ var2[(int) ((this.field9704 ^ (long) (this.field9694[var3] >> 16)) & 0xFFL)];
            this.field9704 = var2[(int) ((this.field9704 ^ (long) (this.field9694[var3] >> 8)) & 0xFFL)] ^ this.field9704 >>> 8;
            this.field9704 = var2[(int) (((long) this.field9694[var3] ^ this.field9704) & 0xFFL)] ^ this.field9704 >>> 8;
        }
        if (this.field9702 != null) {
            for (int var4 = 0; var4 < this.field9702.length; var4++) {
                if (this.field9702[var4] != null) {
                    int[] var5;
                    int[] var6;
                    if (this.field9686) {
                        var5 = this.field9702[var4].field3927;
                        var6 = this.field9702[var4].field3928;
                    } else {
                        var5 = this.field9702[var4].field3922;
                        var6 = this.field9702[var4].field3923;
                    }
                    if (var6 != null) {
                        for (int var7 = 0; var7 < var6.length; var7++) {
                            this.field9704 = this.field9704 >>> 8 ^ var2[(int) (((long) (var6[var7] >> 8) ^ this.field9704) & 0xFFL)];
                            this.field9704 = var2[(int) ((this.field9704 ^ (long) var6[var7]) & 0xFFL)] ^ this.field9704 >>> 8;
                        }
                    }
                    if (var5 != null) {
                        for (int var8 = 0; var8 < var5.length; var8++) {
                            this.field9704 = var2[(int) ((this.field9704 ^ (long) (var5[var8] >> 8)) & 0xFFL)] ^ this.field9704 >>> 8;
                            this.field9704 = var2[(int) ((this.field9704 ^ (long) var5[var8]) & 0xFFL)] ^ this.field9704 >>> 8;
                        }
                    }
                    if (this.field9702[var4].field3926 != null) {
                        for (int var9 = 0; var9 < this.field9702[var4].field3926.length; var9++) {
                            this.field9704 = var2[(int) (((long) (this.field9702[var4].field3926[var9] >> 8) ^ this.field9704) & 0xFFL)] ^ this.field9704 >>> 8;
                            this.field9704 = this.field9704 >>> 8 ^ var2[(int) ((this.field9704 ^ (long) this.field9702[var4].field3926[var9]) & 0xFFL)];
                        }
                    }
                    if (this.field9702[var4].field3929 != null) {
                        for (int var10 = 0; var10 < this.field9702[var4].field3929.length; var10++) {
                            this.field9704 = this.field9704 >>> 8 ^ var2[(int) (((long) (this.field9702[var4].field3929[var10] >> 8) ^ this.field9704) & 0xFFL)];
                            this.field9704 = this.field9704 >>> 8 ^ var2[(int) ((this.field9704 ^ (long) this.field9702[var4].field3929[var10]) & 0xFFL)];
                        }
                    }
                }
            }
        }
        for (int var11 = 0; var11 < 5; var11++) {
            this.field9704 = var2[(int) (((long) this.field9708[var11] ^ this.field9704) & 0xFFL)] ^ this.field9704 >>> 8;
        }
        this.field9704 = var2[(int) ((this.field9704 ^ (long) (this.field9686 ? 1 : 0)) & 0xFFL)] ^ this.field9704 >>> 8;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Lvq;Lbha;ILwh;Lha;ILii;ZIILuaa;Lvk;)Lka;")
    public final class500 method3828(class489 arg0, class601 arg1, int arg2, class158 arg3, class65 arg4, int arg5, class580 arg6, boolean arg7, int arg8, int arg9, class127 arg10, class389 arg11) {
        field9701++;
        if (this.field9697 != -1) {
            return arg1.method3338((byte) 117, this.field9697).method1451(arg2, (byte) -32, arg8, arg5, arg6, arg4, null, arg10, arg9, arg0);
        }
        int var13 = arg8;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            int var21 = arg0.field6775[arg9];
            Object var22 = null;
            var13 = arg8 | 0x20;
            int var23 = var21 >>> 16;
            int var24 = var21 & 0xFFFF;
            class717 var25 = arg10.method1030(-4849, var23);
            if (var25 != null) {
                var15 |= var25.method4006((byte) -114, var24);
                var14 |= var25.method4007(false, var24);
                var17 |= var25.method4005(var24, -1);
                var16 |= arg0.field6795;
            }
            if ((arg0.field6792 || class423.field6046) && arg5 != -1 && arg0.field6775.length > arg5) {
                int var26 = arg0.field6775[arg5];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class717 var29 = var23 == var27 ? var25 : arg10.method1030(-4849, var27);
                if (var29 != null) {
                    var15 |= var29.method4006((byte) -114, var28);
                    var14 |= var29.method4007(false, var28);
                    var17 |= var29.method4005(var28, -1);
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
        class239 var30 = class87.field1228;
        class500 var31;
        synchronized (class87.field1228) {
            var31 = (class500) class87.field1228.method1541(-10, this.field9704);
        }
        if (var31 == null || arg4.method517(var31.method325(), var13) != 0) {
            if (var31 != null) {
                var13 = arg4.method498(var13, var31.method325());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < this.field9694.length; var34++) {
                int var35 = this.field9694[var34];
                class265 var36 = null;
                if ((var35 & 0x40000000) != 0) {
                    if (this.field9702 != null && this.field9702[var34] != null) {
                        var36 = this.field9702[var34];
                    }
                    if (!arg11.method2467(122, var35 & 0x3FFFFFFF).method2056(this.field9686, var36, (byte) 118)) {
                        var33 = true;
                    }
                } else if ((Integer.MIN_VALUE & var35) != 0 && !arg3.method1162(var35 & 0x3FFFFFFF, 2).method2264(true)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class782[] var37 = new class782[this.field9694.length];
            int var38 = 0;
            for (int var39 = 0; var39 < this.field9694.length; var39++) {
                int var40 = this.field9694[var39];
                class265 var41 = null;
                if ((var40 & 0x40000000) != 0) {
                    if (this.field9702 != null && this.field9702[var39] != null) {
                        var41 = this.field9702[var39];
                    }
                    class782 var42 = arg11.method2467(122, var40 & 0x3FFFFFFF).method2050(!arg7, this.field9686, var41);
                    if (var42 != null) {
                        var37[var38++] = var42;
                    }
                } else if ((Integer.MIN_VALUE & var40) != 0) {
                    class782 var43 = arg3.method1162(var40 & 0x3FFFFFFF, 2).method2263(-13439);
                    if (var43 != null) {
                        var37[var38++] = var43;
                    }
                }
            }
            int var44 = var13 | 0x4000;
            class782 var45 = new class782(var37, var38);
            var31 = arg4.method510(var45, var44, class274.field4062, 64, 768);
            for (int var46 = 0; var46 < 5; var46++) {
                for (int var47 = 0; var47 < class320.field4615.length; var47++) {
                    if (class320.field4615[var47][var46].length > this.field9708[var46]) {
                        var31.method306(class183.field2454[var47][var46], class320.field4615[var47][var46][this.field9708[var46]]);
                    }
                }
            }
            var31.method295(var13);
            class239 var48 = class87.field1228;
            synchronized (class87.field1228) {
                class87.field1228.method1544(true, var31, this.field9704);
            }
        }
        if (arg0 == null) {
            return var31;
        } else {
            var31.method298((byte) 4, var13, true);
            return arg0.method2846(arg2, var31, arg7, arg5, arg8, arg9);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ILwh;ZI)V")
    public final void method3829(int arg0, class158 arg1, boolean arg2, int arg3) {
        field9707++;
        int var5 = class671.field9449[arg3];
        if (arg1.method1162(arg0, 2) == null) {
            return;
        }
        this.field9694[var5] = class213.method1409(arg0, Integer.MIN_VALUE);
        this.method3827((byte) -112);
        if (arg2) {
            this.method3832(true, (byte) 55);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(IBI)V")
    public final void method3830(int arg0, byte arg1, int arg2) {
        if (arg1 == -41) {
            field9691++;
            this.field9708[arg0] = arg2;
            this.method3827((byte) -120);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Z)V")
    public static void method3831(boolean arg0) {
        field9695 = null;
        field9698 = null;
        field9700 = null;
        if (!arg0) {
            method3831(false);
        }
        field9687 = null;
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(ZB)V")
    public final void method3832(boolean arg0, byte arg1) {
        field9693++;
        if (arg1 == -54) {
            this.field9686 = arg0;
            this.method3827((byte) -125);
        }
    }

    @OriginalMember(owner = "client!bca", name = "a", descriptor = "(Luaa;Lcd;Lii;ILwh;Lbha;Lvk;IIIB[Lfo;ILvq;ILvq;Lha;IZI[I)Lka;")
    public final class500 method3833(class127 arg0, class334 arg1, class580 arg2, int arg3, class158 arg4, class601 arg5, class389 arg6, int arg7, int arg8, int arg9, byte arg10, class545[] arg11, int arg12, class489 arg13, int arg14, class489 arg15, class65 arg16, int arg17, boolean arg18, int arg19, int[] arg20) {
        field9703++;
        if (this.field9697 != -1) {
            return arg5.method3338((byte) 100, this.field9697).method1457(arg13, arg2, arg3, arg16, arg11, arg0, arg9, arg20, arg1, arg7, arg17, null, 82, arg14, arg15, arg12, arg8, arg19);
        }
        int var22 = arg12;
        long var23 = this.field9704;
        int[] var25 = this.field9694;
        boolean var26 = false;
        boolean var27 = false;
        if (arg13 != null && (arg13.field6787 >= 0 || arg13.field6776 >= 0)) {
            var25 = new int[this.field9694.length];
            for (int var28 = 0; var28 < var25.length; var28++) {
                var25[var28] = this.field9694[var28];
            }
            if (arg13.field6787 >= 0) {
                if (arg13.field6787 == 65535) {
                    var26 = true;
                    var23 ^= 0xFFFFFFFF00000000L;
                    var25[5] = 0;
                } else {
                    var25[5] = class213.method1409(arg13.field6787, 1073741824);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg13.field6776 >= 0) {
                if (arg13.field6776 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class213.method1409(1073741824, arg13.field6776);
                    var23 ^= var25[3];
                }
                var27 = true;
            }
        }
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = false;
        boolean var32 = arg13 != null || arg15 != null;
        int var33 = arg11 == null ? 0 : arg11.length;
        for (int var34 = 0; var34 < var33; var34++) {
            class119.field1726[var34] = null;
            if (arg11[var34] != null) {
                class489 var35 = arg0.method1034(arg11[var34].field7394, 0);
                if (var35.field6775 != null) {
                    class145.field2070[var34] = var35;
                    var32 = true;
                    int var36 = arg11[var34].field7385;
                    int var37 = arg11[var34].field7388;
                    int var38 = var35.field6775[var36];
                    class119.field1726[var34] = arg0.method1030(-4849, var38 >>> 16);
                    int var39 = var38 & 0xFFFF;
                    class106.field1469[var34] = var39;
                    if (class119.field1726[var34] != null) {
                        var30 |= class119.field1726[var34].method4006((byte) -114, var39);
                        var29 |= class119.field1726[var34].method4007(false, var39);
                        var31 |= class119.field1726[var34].method4005(var39, -1);
                    }
                    if ((var35.field6792 || class423.field6046) && var37 != -1 && var37 < var35.field6775.length) {
                        class787.field10836[var34] = var35.field6773[var36];
                        class601.field8174[var34] = arg11[var34].field7391;
                        int var40 = var35.field6775[var37];
                        class704.field9862[var34] = arg0.method1030(-4849, var40 >>> 16);
                        int var41 = var40 & 0xFFFF;
                        class10.field167[var34] = var41;
                        if (class704.field9862[var34] != null) {
                            var30 |= class704.field9862[var34].method4006((byte) -114, var41);
                            var29 |= class704.field9862[var34].method4007(false, var41);
                            var31 |= class704.field9862[var34].method4005(var41, -1);
                        }
                    } else {
                        class787.field10836[var34] = 0;
                        class601.field8174[var34] = 0;
                        class704.field9862[var34] = null;
                        class10.field167[var34] = -1;
                    }
                }
            }
        }
        int var42 = -1;
        int var43 = -1;
        int var44 = 0;
        class717 var45 = null;
        class717 var46 = null;
        if (arg10 < 25) {
            field9698 = null;
        }
        int var47 = -1;
        int var48 = -1;
        int var49 = 0;
        class717 var50 = null;
        class717 var51 = null;
        if (var32) {
            if (arg13 != null) {
                int var52 = arg13.field6775[arg3];
                int var53 = var52 >>> 16;
                var42 = var52 & 0xFFFF;
                var45 = arg0.method1030(-4849, var53);
                if (var45 != null) {
                    var30 |= var45.method4006((byte) -114, var42);
                    var29 |= var45.method4007(false, var42);
                    var31 |= var45.method4005(var42, -1);
                }
                if ((arg13.field6792 || class423.field6046) && arg7 != -1 && arg7 < arg13.field6775.length) {
                    int var54 = arg13.field6775[arg7];
                    var44 = arg13.field6773[arg3];
                    int var55 = var54 >>> 16;
                    var46 = var53 == var55 ? var45 : arg0.method1030(-4849, var55);
                    var43 = var54 & 0xFFFF;
                    if (var46 != null) {
                        var30 |= var46.method4006((byte) -114, var43);
                        var29 |= var46.method4007(false, var43);
                        var31 |= var46.method4005(var43, -1);
                    }
                }
            }
            var22 = arg12 | 0x20;
            if (arg15 != null) {
                int var56 = arg15.field6775[arg9];
                int var57 = var56 >>> 16;
                var50 = arg0.method1030(-4849, var57);
                var47 = var56 & 0xFFFF;
                if (var50 != null) {
                    var30 |= var50.method4006((byte) -114, var47);
                    var29 |= var50.method4007(false, var47);
                    var31 |= var50.method4005(var47, -1);
                }
                if ((arg15.field6792 || class423.field6046) && arg8 != -1 && arg8 < arg15.field6775.length) {
                    var49 = arg15.field6773[arg9];
                    int var58 = arg15.field6775[arg8];
                    int var59 = var58 >>> 16;
                    var51 = var57 == var59 ? var50 : arg0.method1030(-4849, var59);
                    var48 = var58 & 0xFFFF;
                    if (var51 != null) {
                        var30 |= var51.method4006((byte) -114, var48);
                        var29 |= var51.method4007(false, var48);
                        var31 |= var51.method4005(var48, -1);
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
        class239 var60 = class332.field4802;
        class500 var61;
        synchronized (class332.field4802) {
            var61 = (class500) class332.field4802.method1541(-10, var23);
        }
        class208 var62 = null;
        if (this.field9705 != -1) {
            var62 = arg1.method2128((byte) -75, this.field9705);
        }
        if (var61 == null || arg16.method517(var61.method325(), var22) != 0) {
            if (var61 != null) {
                var22 = arg16.method498(var22, var61.method325());
            }
            boolean var64 = false;
            int var65 = 0;
            while (true) {
                if (var65 >= var25.length) {
                    if (!var64) {
                        class782[] var69 = new class782[var25.length];
                        for (int var70 = 0; var70 < var25.length; var70++) {
                            int var71 = var25[var70];
                            class265 var72 = null;
                            boolean var73 = var70 == 5 && var26 || var70 == 3 && var27;
                            if ((var71 & 0x40000000) != 0) {
                                if (!var73 && this.field9702 != null && this.field9702[var70] != null) {
                                    var72 = this.field9702[var70];
                                }
                                class782 var75 = arg6.method2467(-3, var71 & 0x3FFFFFFF).method2040(var72, this.field9686, 76);
                                if (var75 != null) {
                                    var69[var70] = var75;
                                }
                            } else if ((Integer.MIN_VALUE & var71) != 0) {
                                class782 var74 = arg4.method1162(var71 & 0x3FFFFFFF, 2).method2265(true);
                                if (var74 != null) {
                                    var69[var70] = var74;
                                }
                            }
                        }
                        if (var62 != null && var62.field2718 != null) {
                            for (int var76 = 0; var76 < var62.field2718.length; var76++) {
                                if (var69[var76] != null) {
                                    int var77 = 0;
                                    int var78 = 0;
                                    int var79 = 0;
                                    int var80 = 0;
                                    int var81 = 0;
                                    int var82 = 0;
                                    if (var62.field2718[var76] != null) {
                                        var77 = var62.field2718[var76][0];
                                        var80 = var62.field2718[var76][3] << 3;
                                        var79 = var62.field2718[var76][2];
                                        var78 = var62.field2718[var76][1];
                                        var82 = var62.field2718[var76][5] << 3;
                                        var81 = var62.field2718[var76][4] << 3;
                                    }
                                    if (var80 != 0 || var81 != 0 || var82 != 0) {
                                        var69[var76].method4322(var81, 1046089902, var80, var82);
                                    }
                                    if (var77 != 0 || var78 != 0 || var79 != 0) {
                                        var69[var76].method4336(var79, var77, var78, -78);
                                    }
                                }
                            }
                        }
                        class782 var83 = new class782(var69, var69.length);
                        int var84 = var22 | 0x4000;
                        var61 = arg16.method510(var83, var84, class274.field4062, 64, 850);
                        for (int var85 = 0; var85 < 5; var85++) {
                            for (int var86 = 0; var86 < class320.field4615.length; var86++) {
                                if (class320.field4615[var86][var85].length > this.field9708[var85]) {
                                    var61.method306(class183.field2454[var86][var85], class320.field4615[var86][var85][this.field9708[var85]]);
                                }
                            }
                        }
                        if (arg18) {
                            var61.method295(var22);
                            class239 var87 = class332.field4802;
                            synchronized (class332.field4802) {
                                class332.field4802.method1544(true, var61, var23);
                            }
                            this.field9688 = var23;
                        }
                        break;
                    }
                    if (this.field9688 != -1L) {
                        class239 var88 = class332.field4802;
                        synchronized (class332.field4802) {
                            var61 = (class500) class332.field4802.method1541(-10, this.field9688);
                        }
                    }
                    if (var61 != null && arg16.method517(var61.method325(), var22) == 0) {
                        break;
                    }
                    return null;
                }
                int var66 = var25[var65];
                class265 var67 = null;
                boolean var68 = var65 == 5 && var26 || var65 == 3 && var27;
                if ((var66 & 0x40000000) != 0) {
                    if (!var68 && this.field9702 != null && this.field9702[var65] != null) {
                        var67 = this.field9702[var65];
                    }
                    if (!arg6.method2467(-66, var66 & 0x3FFFFFFF).method2054(this.field9686, -1, var67)) {
                        var64 = true;
                    }
                } else if ((var66 & Integer.MIN_VALUE) != 0 && !arg4.method1162(var66 & 0x3FFFFFFF, 2).method2259(126)) {
                    var64 = true;
                }
                var65++;
            }
        }
        class500 var89 = var61.method298((byte) 4, var22, true);
        boolean var90 = false;
        if (arg20 != null) {
            for (int var91 = 0; var91 < arg20.length; var91++) {
                if (arg20[var91] != -1) {
                    var90 = true;
                }
            }
        }
        if (!var32 && !var90) {
            return var89;
        }
        class303[] var92 = null;
        if (var62 != null) {
            var92 = var62.method1385(110, arg16);
        }
        if (var90 && var92 != null) {
            for (int var93 = 0; var93 < arg20.length; var93++) {
                if (var92[var93] != null) {
                    var89.method320(var92[var93], 0x1 << var93, true);
                }
            }
        }
        int var94 = 0;
        int var95 = 1;
        while (var33 > var94) {
            if (class119.field1726[var94] != null) {
                var89.method2886(0, false, class601.field8174[var94] - 1, var95, null, class787.field10836[var94], true, class704.field9862[var94], class106.field1469[var94], class10.field167[var94], class119.field1726[var94]);
            }
            var94++;
            var95 <<= 0x1;
        }
        if (var90) {
            for (int var96 = 0; var96 < arg20.length; var96++) {
                if (arg20[var96] != -1) {
                    int var97 = arg20[var96] - arg14;
                    int var98 = var97 & 0x3FFF;
                    class303 var99 = arg16.method472();
                    var99.method985(var98);
                    var89.method320(var99, 0x1 << var96, false);
                }
            }
        }
        if (var90 && var92 != null) {
            for (int var100 = 0; var100 < arg20.length; var100++) {
                if (var92[var100] != null) {
                    var89.method320(var92[var100], 0x1 << var100, false);
                }
            }
        }
        if (var45 != null && var50 != null) {
            var89.method2890(var45, var51, arg13.field6796, (byte) -86, var42, var44, var50, var47, var48, var46, var43, false, arg19 - 1, arg17 + -1, var49);
        } else if (var45 != null) {
            var89.method2889(0, var42, arg19 - 1, false, var45, var43, var44, (byte) -93, var46);
        } else if (var50 != null) {
            var89.method2889(0, var47, arg17 - 1, false, var50, var48, var49, (byte) -51, var51);
        }
        for (int var101 = 0; var101 < var33; var101++) {
            class119.field1726[var101] = null;
            class704.field9862[var101] = null;
            class145.field2070[var101] = null;
        }
        return var89;
    }
}
