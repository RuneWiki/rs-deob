import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jr")
public class class132 {

    @OriginalMember(owner = "client!jr", name = "x", descriptor = "I")
    public int field1838 = -1;

    @OriginalMember(owner = "client!jr", name = "m", descriptor = "I")
    public static int field1827 = -1;

    @OriginalMember(owner = "client!jr", name = "t", descriptor = "[I")
    public static int[] field1834 = new int[3];

    @OriginalMember(owner = "client!jr", name = "w", descriptor = "I")
    public static int field1837 = 0;

    @OriginalMember(owner = "client!jr", name = "b", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!jr", name = "c", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!jr", name = "e", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!jr", name = "f", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!jr", name = "g", descriptor = "I")
    public static int field1821;

    @OriginalMember(owner = "client!jr", name = "h", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!jr", name = "j", descriptor = "I")
    private int field1824;

    @OriginalMember(owner = "client!jr", name = "k", descriptor = "I")
    public static int field1825;

    @OriginalMember(owner = "client!jr", name = "l", descriptor = "I")
    public static int field1826;

    @OriginalMember(owner = "client!jr", name = "n", descriptor = "I")
    public static int field1828;

    @OriginalMember(owner = "client!jr", name = "p", descriptor = "I")
    public static int field1830;

    @OriginalMember(owner = "client!jr", name = "q", descriptor = "I")
    public static int field1831;

    @OriginalMember(owner = "client!jr", name = "r", descriptor = "I")
    public static int field1832;

    @OriginalMember(owner = "client!jr", name = "s", descriptor = "I")
    public static int field1833;

    @OriginalMember(owner = "client!jr", name = "u", descriptor = "I")
    public static int field1835;

    @OriginalMember(owner = "client!jr", name = "v", descriptor = "J")
    private long field1836;

    @OriginalMember(owner = "client!jr", name = "y", descriptor = "J")
    private long field1839;

    @OriginalMember(owner = "client!jr", name = "o", descriptor = "Z")
    public boolean field1829;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "[I")
    private int[] field1815;

    @OriginalMember(owner = "client!jr", name = "i", descriptor = "[I")
    public static int[] field1823;

    @OriginalMember(owner = "client!jr", name = "z", descriptor = "[I")
    public int[] field1840;

    @OriginalMember(owner = "client!jr", name = "d", descriptor = "[[Ljw;")
    public static class280[][] field1818;

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(B)V")
    private final void method925(byte arg0) {
        field1825++;
        long[] var2 = class434.field6216;
        this.field1836 = -1L;
        this.field1836 = this.field1836 >>> 8 ^ var2[(int) ((this.field1836 ^ (long) (this.field1824 >> 8)) & 0xFFL)];
        this.field1836 = var2[(int) (((long) this.field1824 ^ this.field1836) & 0xFFL)] ^ this.field1836 >>> 8;
        int var3 = -126 / ((arg0 + 64) / 51);
        for (int var4 = 0; var4 < 12; var4++) {
            this.field1836 = this.field1836 >>> 8 ^ var2[(int) (((long) (this.field1815[var4] >> 24) ^ this.field1836) & 0xFFL)];
            this.field1836 = this.field1836 >>> 8 ^ var2[(int) (((long) (this.field1815[var4] >> 16) ^ this.field1836) & 0xFFL)];
            this.field1836 = this.field1836 >>> 8 ^ var2[(int) (((long) (this.field1815[var4] >> 8) ^ this.field1836) & 0xFFL)];
            this.field1836 = var2[(int) ((this.field1836 ^ (long) this.field1815[var4]) & 0xFFL)] ^ this.field1836 >>> 8;
        }
        for (int var5 = 0; var5 < 5; var5++) {
            this.field1836 = this.field1836 >>> 8 ^ var2[(int) ((this.field1836 ^ (long) this.field1840[var5]) & 0xFFL)];
        }
        this.field1836 = this.field1836 >>> 8 ^ var2[(int) (((long) (this.field1829 ? 1 : 0) ^ this.field1836) & 0xFFL)];
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIILraa;)V")
    public final void method926(int arg0, int arg1, int arg2, class353 arg3) {
        field1832++;
        int var5 = class143.field1948[arg0];
        if (arg3.method2252(Integer.MIN_VALUE, arg1) != null) {
            this.field1815[var5] = class430.method2658(arg2, arg1);
            this.method925((byte) 65);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IIIIZ)V")
    public static final void method927(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
        if (!arg4) {
            method935(16, -26, null, null);
        }
        field1822++;
        if (arg1 >= class200.field2976 && arg1 <= class204.field3061) {
            int var5 = class183.method1292(class377.field5458, -1, class362.field5291, arg0);
            int var6 = class183.method1292(class377.field5458, -1, class362.field5291, arg3);
            class493.method3003(var6, arg1, var5, (byte) 11, arg2);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILs;)V")
    public static final void method928(int arg0, class339 arg1) {
        class95.field1372[arg0] = arg1;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILcl;I)V")
    public final void method929(int arg0, int arg1, class744 arg2, int arg3) {
        int var5 = 95 / ((37 - arg0) / 56);
        field1828++;
        if (arg3 == -1) {
            this.field1815[arg1] = 0;
        } else if (arg2.method4144(arg3, 126) != null) {
            this.field1815[arg1] = class430.method2658(1073741824, arg3);
            this.method925((byte) -122);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III[IZ[I)V")
    public final void method930(int arg0, int arg1, int arg2, int[] arg3, boolean arg4, int[] arg5) {
        this.field1840 = arg3;
        this.field1829 = arg4;
        if (this.field1824 != arg2) {
            this.field1824 = arg2;
        }
        field1816++;
        this.field1838 = arg0;
        this.field1815 = arg5;
        if (arg1 <= -60) {
            this.method925((byte) -119);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(I)V")
    public static final void method931(int arg0) {
        field1830++;
        int var1 = 0;
        if (class243.field3580 != null) {
            var1 = class243.field3580.field7983.method619(false);
        }
        if (arg0 >= -94) {
            field1827 = 99;
        }
        if (var1 == 2) {
            int var2 = class291.field4016 <= 800 ? class291.field4016 : 800;
            class68.field1042 = var2;
            int var3 = class443.field6318 > 600 ? 600 : class443.field6318;
            class658.field9423 = (class291.field4016 - var2) / 2;
            class26.field232 = 0;
            class565.field8187 = var3;
        } else if (var1 == 1) {
            int var4 = class291.field4016 <= 1024 ? class291.field4016 : 1024;
            int var5 = class443.field6318 > 768 ? 768 : class443.field6318;
            class68.field1042 = var4;
            class658.field9423 = (class291.field4016 - var4) / 2;
            class26.field232 = 0;
            class565.field8187 = var5;
        } else {
            class565.field8187 = class443.field6318;
            class658.field9423 = 0;
            class26.field232 = 0;
            class68.field1042 = class291.field4016;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Z)V")
    public static void method932(boolean arg0) {
        field1823 = null;
        field1818 = null;
        field1834 = null;
        if (!arg0) {
            field1834 = null;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILnc;ILraa;Lvo;Lha;IIIII)Lka;")
    public final class282 method933(int arg0, int arg1, class493 arg2, int arg3, class353 arg4, class131 arg5, class543 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        field1817++;
        int var13 = arg10;
        if (arg5 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg10 | 0x20;
            int var22 = arg5.field1792[arg3];
            int var23 = var22 >>> 16;
            class700 var24 = arg2.method3005(var23, 14344);
            int var25 = var22 & 0xFFFF;
            if (var24 != null) {
                var15 |= var24.method3931(var25, (byte) -78);
                var14 |= var24.method3930((byte) 63, var25);
                var17 |= var24.method3934(var25, (byte) -108);
                var16 |= arg5.field1794;
            }
            if ((arg5.field1783 || class316.field4266) && arg8 != -1 && arg8 < arg5.field1792.length) {
                int var26 = arg5.field1792[arg8];
                int var27 = var26 >>> 16;
                int var28 = var26 & 0xFFFF;
                class700 var29;
                if (var23 == var27) {
                    var29 = var24;
                } else {
                    var29 = arg2.method3005(var28 >>> 16, 14344);
                }
                if (var29 != null) {
                    var15 |= var29.method3931(var28, (byte) -78);
                    var14 |= var29.method3930((byte) 63, var28);
                    var17 |= var29.method3934(var28, (byte) -120);
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
        long var30 = (long) (arg9 << 16) | (long) arg11 << 32 | (long) arg1;
        class348 var32 = class201.field2992;
        class282 var33;
        synchronized (class201.field2992) {
            var33 = (class282) class201.field2992.method2216(arg7, var30);
        }
        if (var33 == null || arg6.method300(var33.method528(), var13) != 0) {
            if (var33 != null) {
                var13 = arg6.method374(var13, var33.method528());
            }
            class637[] var35 = new class637[3];
            int var36 = 0;
            if (!arg4.method2252(Integer.MIN_VALUE, arg1).method2013(0) || !arg4.method2252(Integer.MIN_VALUE, arg9).method2013(arg7) || !arg4.method2252(Integer.MIN_VALUE, arg11).method2013(0)) {
                return null;
            }
            class637 var37 = arg4.method2252(Integer.MIN_VALUE, arg1).method2006(0);
            if (var37 != null) {
                var35[var36++] = var37;
            }
            class637 var38 = arg4.method2252(Integer.MIN_VALUE, arg9).method2006(0);
            if (var38 != null) {
                var35[var36++] = var38;
            }
            class637 var39 = arg4.method2252(Integer.MIN_VALUE, arg11).method2006(0);
            if (var39 != null) {
                var35[var36++] = var39;
            }
            int var40 = var13 | 0x4000;
            class637 var41 = new class637(var35, var36);
            var33 = arg6.method404(var41, var40, class666.field9522, 64, 768);
            for (int var42 = 0; var42 < 5; var42++) {
                for (int var43 = 0; var43 < class349.field5157.length; var43++) {
                    if (this.field1840[var42] < class349.field5157[var43][var42].length) {
                        var33.method486(class587.field8366[var43][var42], class349.field5157[var43][var42][this.field1840[var42]]);
                    }
                }
            }
            var33.method487(var13);
            class348 var44 = class201.field2992;
            synchronized (class201.field2992) {
                class201.field2992.method2213((byte) -16, var30, var33);
            }
        }
        if (arg5 == null) {
            return var33;
        } else {
            class282 var45 = var33.method509((byte) 4, var13, true);
            return arg5.method920(arg10, arg8, (byte) -51, arg3, arg0, var45);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ILab;Lvo;ILvo;ZLjp;Lnc;IILraa;Lha;IILpi;Lcl;[III[Lpba;I)Lka;")
    public final class282 method934(int arg0, class649 arg1, class131 arg2, int arg3, class131 arg4, boolean arg5, class468 arg6, class493 arg7, int arg8, int arg9, class353 arg10, class543 arg11, int arg12, int arg13, class250 arg14, class744 arg15, int[] arg16, int arg17, int arg18, class196[] arg19, int arg20) {
        field1833++;
        if (this.field1838 != -1) {
            return arg6.method2822(this.field1838, 50).method3169(arg18, arg2, arg7, arg4, arg12, arg13, arg14, arg3, arg17, arg16, arg9, arg19, -1, arg1, arg11, arg8, arg0);
        }
        int var22 = arg17;
        long var23 = this.field1836;
        int[] var25 = this.field1815;
        if (arg4 != null && (arg4.field1789 >= 0 || arg4.field1813 >= 0)) {
            var25 = new int[12];
            for (int var26 = 0; var26 < 12; var26++) {
                var25[var26] = this.field1815[var26];
            }
            if (arg4.field1789 >= 0) {
                if (arg4.field1789 == 65535) {
                    var25[5] = 0;
                    var23 ^= 0xFFFFFFFF00000000L;
                } else {
                    var25[5] = class430.method2658(1073741824, arg4.field1789);
                    var23 ^= (long) var25[5] << 32;
                }
            }
            if (arg4.field1813 >= 0) {
                if (arg4.field1813 == 65535) {
                    var25[3] = 0;
                    var23 ^= 0xFFFFFFFFL;
                } else {
                    var25[3] = class430.method2658(1073741824, arg4.field1813);
                    var23 ^= var25[3];
                }
            }
        }
        boolean var27 = false;
        int var28 = -52 / ((arg20 + 31) / 40);
        boolean var29 = false;
        boolean var30 = false;
        boolean var31 = arg4 != null || arg2 != null;
        int var32 = arg19 == null ? 0 : arg19.length;
        for (int var33 = 0; var33 < var32; var33++) {
            class34.field313[var33] = null;
            if (arg19[var33] != null) {
                class131 var34 = arg7.method2999(arg19[var33].field2873, false);
                if (var34.field1792 != null) {
                    class437.field6234[var33] = var34;
                    var31 = true;
                    int var35 = arg19[var33].field2862;
                    int var36 = arg19[var33].field2871;
                    int var37 = var34.field1792[var35];
                    class34.field313[var33] = arg7.method3005(var37 >>> 16, 14344);
                    int var38 = var37 & 0xFFFF;
                    class591.field8408[var33] = var38;
                    if (class34.field313[var33] != null) {
                        var29 |= class34.field313[var33].method3931(var38, (byte) -78);
                        var27 |= class34.field313[var33].method3930((byte) 63, var38);
                        var30 |= class34.field313[var33].method3934(var38, (byte) -109);
                    }
                    if ((var34.field1783 || class316.field4266) && var36 != -1 && var34.field1792.length > var36) {
                        class347.field5128[var33] = var34.field1812[var35];
                        class45.field750[var33] = arg19[var33].field2858;
                        int var39 = var34.field1792[var36];
                        class505.field7343[var33] = arg7.method3005(var39 >>> 16, 14344);
                        int var40 = var39 & 0xFFFF;
                        class670.field9545[var33] = var40;
                        if (class505.field7343[var33] != null) {
                            var29 |= class505.field7343[var33].method3931(var40, (byte) -78);
                            var27 |= class505.field7343[var33].method3930((byte) 63, var40);
                            var30 |= class505.field7343[var33].method3934(var40, (byte) -122);
                        }
                    } else {
                        class347.field5128[var33] = 0;
                        class45.field750[var33] = 0;
                        class505.field7343[var33] = null;
                        class670.field9545[var33] = -1;
                    }
                }
            }
        }
        int var41 = -1;
        int var42 = -1;
        int var43 = 0;
        class700 var44 = null;
        class700 var45 = null;
        int var46 = -1;
        int var47 = -1;
        int var48 = 0;
        class700 var49 = null;
        class700 var50 = null;
        if (var31) {
            var22 = arg17 | 0x20;
            if (arg4 != null) {
                int var51 = arg4.field1792[arg12];
                int var52 = var51 >>> 16;
                var41 = var51 & 0xFFFF;
                var44 = arg7.method3005(var52, 14344);
                if (var44 != null) {
                    var29 |= var44.method3931(var41, (byte) -78);
                    var27 |= var44.method3930((byte) 63, var41);
                    var30 |= var44.method3934(var41, (byte) -14);
                }
                if ((arg4.field1783 || class316.field4266) && arg9 != -1 && arg9 < arg4.field1792.length) {
                    int var53 = arg4.field1792[arg9];
                    var43 = arg4.field1812[arg12];
                    int var54 = var53 >>> 16;
                    var42 = var53 & 0xFFFF;
                    var45 = var52 == var54 ? var44 : arg7.method3005(var54, 14344);
                    if (var45 != null) {
                        var29 |= var45.method3931(var42, (byte) -78);
                        var27 |= var45.method3930((byte) 63, var42);
                        var30 |= var45.method3934(var42, (byte) 86);
                    }
                }
            }
            if (arg2 != null) {
                int var55 = arg2.field1792[arg18];
                int var56 = var55 >>> 16;
                var46 = var55 & 0xFFFF;
                var49 = arg7.method3005(var56, 14344);
                if (var49 != null) {
                    var29 |= var49.method3931(var46, (byte) -78);
                    var27 |= var49.method3930((byte) 63, var46);
                    var30 |= var49.method3934(var46, (byte) 66);
                }
                if ((arg2.field1783 || class316.field4266) && arg0 != -1 && arg0 < arg2.field1792.length) {
                    var48 = arg2.field1812[arg18];
                    int var57 = arg2.field1792[arg0];
                    int var58 = var57 >>> 16;
                    var47 = var57 & 0xFFFF;
                    var50 = var56 == var58 ? var49 : arg7.method3005(var58, 14344);
                    if (var50 != null) {
                        var29 |= var50.method3931(var47, (byte) -78);
                        var27 |= var50.method3930((byte) 63, var47);
                        var30 |= var50.method3934(var47, (byte) -123);
                    }
                }
            }
            if (var29) {
                var22 |= 0x80;
            }
            if (var27) {
                var22 |= 0x100;
            }
            if (var30) {
                var22 |= 0x400;
            }
        }
        class348 var59 = class675.field9603;
        class282 var60;
        synchronized (class675.field9603) {
            var60 = (class282) class675.field9603.method2216(0, var23);
        }
        class83 var61 = null;
        if (this.field1824 != -1) {
            var61 = arg14.method1688(-101, this.field1824);
        }
        if (var60 == null || arg11.method300(var60.method528(), var22) != 0) {
            if (var60 != null) {
                var22 = arg11.method374(var22, var60.method528());
            }
            boolean var63 = false;
            int var64 = 0;
            while (true) {
                if (var64 >= 12) {
                    if (var63) {
                        if (this.field1839 != -1L) {
                            class348 var66 = class675.field9603;
                            synchronized (class675.field9603) {
                                var60 = (class282) class675.field9603.method2216(0, this.field1839);
                            }
                        }
                        if (var60 == null || arg11.method300(var60.method528(), var22) != 0) {
                            return null;
                        }
                    } else {
                        class637[] var67 = new class637[12];
                        for (int var68 = 0; var68 < 12; var68++) {
                            int var69 = var25[var68];
                            if ((var69 & 0x40000000) != 0) {
                                class637 var71 = arg15.method4144(var69 & 0x3FFFFFFF, 126).method2628(0, this.field1829);
                                if (var71 != null) {
                                    var67[var68] = var71;
                                }
                            } else if ((Integer.MIN_VALUE & var69) != 0) {
                                class637 var70 = arg10.method2252(Integer.MIN_VALUE, var69 & 0x3FFFFFFF).method2008(true);
                                if (var70 != null) {
                                    var67[var68] = var70;
                                }
                            }
                        }
                        if (var61 != null && var61.field1237 != null) {
                            for (int var72 = 0; var72 < var61.field1237.length; var72++) {
                                if (var67[var72] != null) {
                                    int var73 = 0;
                                    int var74 = 0;
                                    int var75 = 0;
                                    int var76 = 0;
                                    int var77 = 0;
                                    int var78 = 0;
                                    if (var61.field1237[var72] != null) {
                                        var74 = var61.field1237[var72][1];
                                        var76 = var61.field1237[var72][3] << 3;
                                        var75 = var61.field1237[var72][2];
                                        var73 = var61.field1237[var72][0];
                                        var77 = var61.field1237[var72][4] << 3;
                                        var78 = var61.field1237[var72][5] << 3;
                                    }
                                    if (var76 != 0 || var77 != 0 || var78 != 0) {
                                        var67[var72].method3664(var77, 0, var76, var78);
                                    }
                                    if (var73 != 0 || var74 != 0 || var75 != 0) {
                                        var67[var72].method3674(var73, var74, var75, 126);
                                    }
                                }
                            }
                        }
                        class637 var79 = new class637(var67, var67.length);
                        int var80 = var22 | 0x4000;
                        var60 = arg11.method404(var79, var80, class666.field9522, 64, 850);
                        for (int var81 = 0; var81 < 5; var81++) {
                            for (int var82 = 0; var82 < class349.field5157.length; var82++) {
                                if (this.field1840[var81] < class349.field5157[var82][var81].length) {
                                    var60.method486(class587.field8366[var82][var81], class349.field5157[var82][var81][this.field1840[var81]]);
                                }
                            }
                        }
                        if (arg5) {
                            var60.method487(var22);
                            class348 var83 = class675.field9603;
                            synchronized (class675.field9603) {
                                class675.field9603.method2213((byte) -16, var23, var60);
                            }
                            this.field1839 = var23;
                        }
                    }
                    break;
                }
                int var65 = var25[var64];
                if ((var65 & 0x40000000) == 0) {
                    if ((var65 & Integer.MIN_VALUE) != 0 && !arg10.method2252(Integer.MIN_VALUE, var65 & 0x3FFFFFFF).method2010(0)) {
                        var63 = true;
                    }
                } else if (!arg15.method4144(var65 & 0x3FFFFFFF, 125).method2626(this.field1829, (byte) 91)) {
                    var63 = true;
                }
                var64++;
            }
        }
        class282 var84 = var60.method509((byte) 4, var22, true);
        boolean var85 = false;
        if (arg16 != null) {
            for (int var86 = 0; var86 < 12; var86++) {
                if (arg16[var86] != -1) {
                    var85 = true;
                }
            }
        }
        if (!var31 && !var85) {
            return var84;
        }
        class121[] var87 = null;
        if (var61 != null) {
            var87 = var61.method666(19580, arg11);
        }
        if (var85 && var87 != null) {
            for (int var88 = 0; var88 < 12; var88++) {
                if (var87[var88] != null) {
                    var84.method523(var87[var88], 0x1 << var88, true);
                }
            }
        }
        int var89 = 0;
        int var90 = 1;
        while (var32 > var89) {
            if (class34.field313[var89] != null) {
                var84.method1807(class45.field750[var89] - 1, class670.field9545[var89], class505.field7343[var89], var90, class591.field8408[var89], class347.field5128[var89], 0, null, class34.field313[var89], 26922, false);
            }
            var89++;
            var90 <<= 0x1;
        }
        if (var85) {
            for (int var91 = 0; var91 < 12; var91++) {
                if (arg16[var91] != -1) {
                    int var92 = arg16[var91] - arg8;
                    int var93 = var92 & 0x3FFF;
                    class121 var94 = arg11.method348();
                    var94.method844(var93);
                    var84.method523(var94, 0x1 << var91, false);
                }
            }
        }
        if (var85 && var87 != null) {
            for (int var95 = 0; var95 < 12; var95++) {
                if (var87[var95] != null) {
                    var84.method523(var87[var95], 0x1 << var95, false);
                }
            }
        }
        if (var44 != null && var49 != null) {
            var84.method1809(arg3 - 1, var45, var50, var48, arg4.field1803, (byte) -53, var44, var42, arg13 - 1, var41, var47, var46, var49, var43, false);
        } else if (var44 != null) {
            var84.method1808(0, false, var44, 0, var41, var45, arg13 - 1, var43, var42);
        } else if (var49 != null) {
            var84.method1808(0, false, var49, 0, var46, var50, arg3 - 1, var48, var47);
        }
        for (int var96 = 0; var96 < var32; var96++) {
            class34.field313[var96] = null;
            class505.field7343[var96] = null;
            class437.field6234[var96] = null;
        }
        return var84;
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(IILgt;[I)V")
    public static final void method935(int arg0, int arg1, class571 arg2, int[] arg3) {
        if (arg2.field4564 != null) {
            boolean var4 = true;
            for (int var5 = 0; var5 < arg2.field4564.length; var5++) {
                if (arg2.field4564[var5] != arg3[var5]) {
                    var4 = false;
                    break;
                }
            }
            if (var4 && arg2.field4545 != -1) {
                class131 var6 = class610.field8698.method2999(arg2.field4545, false);
                int var7 = var6.field1806;
                if (var7 == 1) {
                    arg2.field4616 = 1;
                    arg2.field4535 = arg1;
                    arg2.field4597 = 0;
                    arg2.field4605 = 0;
                    arg2.field4551 = 0;
                    if (!arg2.field4612) {
                        class701.method3941(arg2.field4605, var6, (byte) 101, arg2);
                    }
                }
                if (var7 == 2) {
                    arg2.field4597 = 0;
                }
            }
        }
        field1835++;
        boolean var8 = true;
        for (int var9 = arg0; var9 < arg3.length; var9++) {
            if (arg3[var9] != -1) {
                var8 = false;
            }
            if (arg2.field4564 == null || arg2.field4564[var9] == -1 || class610.field8698.method2999(arg3[var9], false).field1784 >= class610.field8698.method2999(arg2.field4564[var9], false).field1784) {
                arg2.field4535 = arg1;
                arg2.field4564 = arg3;
                arg2.field4641 = arg2.field4637;
            }
        }
        if (var8) {
            arg2.field4564 = arg3;
            arg2.field4535 = arg1;
            arg2.field4641 = arg2.field4637;
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(III)V")
    public final void method936(int arg0, int arg1, int arg2) {
        if (arg0 != 0) {
            this.field1836 = 83L;
        }
        field1826++;
        this.field1840[arg1] = arg2;
        this.method925((byte) 84);
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(Lvo;Lab;Ljp;BIIILnc;Lcl;ILha;Lraa;)Lka;")
    public final class282 method937(class131 arg0, class649 arg1, class468 arg2, byte arg3, int arg4, int arg5, int arg6, class493 arg7, class744 arg8, int arg9, class543 arg10, class353 arg11) {
        field1831++;
        if (this.field1838 != -1) {
            return arg2.method2822(this.field1838, 50).method3167(arg0, arg7, arg10, arg6, arg9, arg5, false, arg1, arg4);
        }
        int var13 = arg9;
        if (arg0 != null) {
            boolean var14 = false;
            boolean var15 = false;
            boolean var16 = false;
            boolean var17 = false;
            boolean var18 = true;
            boolean var19 = true;
            Object var20 = null;
            Object var21 = null;
            var13 = arg9 | 0x20;
            int var22 = arg0.field1792[arg5];
            int var23 = var22 >>> 16;
            int var24 = var22 & 0xFFFF;
            class700 var25 = arg7.method3005(var23, 14344);
            if (var25 != null) {
                var15 |= var25.method3931(var24, (byte) -78);
                var14 |= var25.method3930((byte) 63, var24);
                var17 |= var25.method3934(var24, (byte) -106);
                var16 |= arg0.field1794;
            }
            if ((arg0.field1783 || class316.field4266) && arg4 != -1 && arg4 < arg0.field1792.length) {
                int var26 = arg0.field1792[arg4];
                int var27 = var26 >>> 16;
                class700 var28 = var23 == var27 ? var25 : arg7.method3005(var27, 14344);
                int var29 = var26 & 0xFFFF;
                if (var28 != null) {
                    var15 |= var28.method3931(var29, (byte) -78);
                    var14 |= var28.method3930((byte) 63, var29);
                    var17 |= var28.method3934(var29, (byte) 11);
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
        class348 var30 = class201.field2992;
        class282 var31;
        synchronized (class201.field2992) {
            var31 = (class282) class201.field2992.method2216(0, this.field1836);
        }
        if (arg3 >= -119) {
            return null;
        }
        if (var31 == null || arg10.method300(var31.method528(), var13) != 0) {
            if (var31 != null) {
                var13 = arg10.method374(var13, var31.method528());
            }
            boolean var33 = false;
            for (int var34 = 0; var34 < 12; var34++) {
                int var35 = this.field1815[var34];
                if ((var35 & 0x40000000) == 0) {
                    if ((Integer.MIN_VALUE & var35) != 0 && !arg11.method2252(Integer.MIN_VALUE, var35 & 0x3FFFFFFF).method2013(0)) {
                        var33 = true;
                    }
                } else if (!arg8.method4144(var35 & 0x3FFFFFFF, 124).method2643((byte) 42, this.field1829)) {
                    var33 = true;
                }
            }
            if (var33) {
                return null;
            }
            class637[] var36 = new class637[12];
            int var37 = 0;
            for (int var38 = 0; var38 < 12; var38++) {
                int var39 = this.field1815[var38];
                if ((var39 & 0x40000000) != 0) {
                    class637 var40 = arg8.method4144(var39 & 0x3FFFFFFF, 124).method2637(-128, this.field1829);
                    if (var40 != null) {
                        var36[var37++] = var40;
                    }
                } else if ((var39 & Integer.MIN_VALUE) != 0) {
                    class637 var41 = arg11.method2252(Integer.MIN_VALUE, var39 & 0x3FFFFFFF).method2006(0);
                    if (var41 != null) {
                        var36[var37++] = var41;
                    }
                }
            }
            class637 var42 = new class637(var36, var37);
            int var43 = var13 | 0x4000;
            var31 = arg10.method404(var42, var43, class666.field9522, 64, 768);
            for (int var44 = 0; var44 < 5; var44++) {
                for (int var45 = 0; var45 < class349.field5157.length; var45++) {
                    if (this.field1840[var44] < class349.field5157[var45][var44].length) {
                        var31.method486(class587.field8366[var45][var44], class349.field5157[var45][var44][this.field1840[var44]]);
                    }
                }
            }
            var31.method487(var13);
            class348 var46 = class201.field2992;
            synchronized (class201.field2992) {
                class201.field2992.method2213((byte) -16, this.field1836, var31);
            }
        }
        if (arg0 == null) {
            return var31;
        } else {
            var31.method509((byte) 4, var13, true);
            return arg0.method920(arg9, arg4, (byte) -51, arg5, arg6, var31);
        }
    }

    @OriginalMember(owner = "client!jr", name = "a", descriptor = "(ZB)V")
    public final void method938(boolean arg0, byte arg1) {
        field1819++;
        this.field1829 = arg0;
        this.method925((byte) -124);
        if (arg1 < 103) {
            this.method937(null, null, null, (byte) 53, 34, 75, -31, null, null, 74, null, null);
        }
    }
}
