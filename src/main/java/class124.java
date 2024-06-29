import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uaa")
public class class124 {

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "I")
    public int field1805 = -1;

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "[Ljava/lang/String;")
    private static final String[] field1815 = new String[] { method1212(method1211(",1\u0005Hzq")), method1212(method1211(",1\u0005Hvq")), method1212(method1211(",1\u0005Huq")), method1212(method1211("\"~JH@")), method1212(method1211(",1\u0005Hxq")), method1212(method1211("7%\b\n")), method1212(method1211(",1\u0005H\u007fq")), method1212(method1211(",1\u0005Hwq")), method1212(method1211("31\u0003\u000bT*3")), method1212(method1211("31\u0003\u0012U<?\u0016\u0007")), method1212(method1211("31\u0003\u0002E")), method1212(method1211("=5\u0010\u0007T5#")), method1212(method1211("31\u0003\u0001Q")), method1212(method1211("1'W\u0002")), method1212(method1211("1%\u0002\u0000P8>")), method1212(method1211(",1\u0005H~q")), method1212(method1211("31\u0007\nT;")), method1212(method1211("*'W\u0002")), method1212(method1211(",1\u0005Htq")), method1212(method1211(",1\u0005Hyq")), method1212(method1211(",1\u0005H|q")), method1212(method1211(",1\u0005H{q")) };

    @OriginalMember(owner = "client!uaa", name = "h", descriptor = "Lhl;")
    public static class556 field1797 = new class556(64, 6);

    @OriginalMember(owner = "client!uaa", name = "j", descriptor = "I")
    public static int field1794;

    @OriginalMember(owner = "client!uaa", name = "e", descriptor = "I")
    public static int field1795;

    @OriginalMember(owner = "client!uaa", name = "d", descriptor = "I")
    public static int field1798;

    @OriginalMember(owner = "client!uaa", name = "l", descriptor = "I")
    public static int field1800;

    @OriginalMember(owner = "client!uaa", name = "m", descriptor = "I")
    public static int field1803;

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "I")
    public static int field1804;

    @OriginalMember(owner = "client!uaa", name = "t", descriptor = "I")
    public static int field1806;

    @OriginalMember(owner = "client!uaa", name = "p", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!uaa", name = "r", descriptor = "I")
    public static int field1809;

    @OriginalMember(owner = "client!uaa", name = "u", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!uaa", name = "f", descriptor = "I")
    private int field1811;

    @OriginalMember(owner = "client!uaa", name = "o", descriptor = "I")
    public static int field1812;

    @OriginalMember(owner = "client!uaa", name = "k", descriptor = "J")
    private long field1796;

    @OriginalMember(owner = "client!uaa", name = "s", descriptor = "J")
    private long field1799;

    @OriginalMember(owner = "client!uaa", name = "g", descriptor = "Lgda;")
    public static class58 field1807;

    @OriginalMember(owner = "client!uaa", name = "i", descriptor = "Z")
    public boolean field1813;

    @OriginalMember(owner = "client!uaa", name = "n", descriptor = "[I")
    public int[] field1801;

    @OriginalMember(owner = "client!uaa", name = "q", descriptor = "[I")
    private int[] field1802;

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "[Ljo;")
    private class353[] field1814;

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZI[Ljo;[II[II)V", line = 5)
    public final void method1200(boolean arg0, int arg1, class353[] arg2, int[] arg3, int arg4, int[] arg5, int arg6) {
        try {
            this.field1802 = arg5;
            if (this.field1811 != arg6) {
                this.field1811 = arg6;
            }
            field1804++;
            if (arg1 == 65535) {
                class227.method1991((byte) -112, this.field1802.length);
                this.field1801 = arg3;
                this.field1814 = arg2;
                this.field1813 = arg0;
                this.field1805 = arg4;
                this.method1206((byte) 124);
            }
        } catch (RuntimeException var9) {
            throw class590.method4333(var9, field1815[7] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1815[5] : field1815[3]) + ',' + (arg3 == null ? field1815[5] : field1815[3]) + ',' + arg4 + ',' + (arg5 == null ? field1815[5] : field1815[3]) + ',' + arg6 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(BZ)V", line = 35)
    public final void method1201(byte arg0, boolean arg1) {
        try {
            this.field1813 = arg1;
            field1794++;
            int var3 = -75 % ((arg0 - 27) / 53);
            this.method1206((byte) 116);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1815[1] + arg0 + ',' + arg1 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIILps;)V", line = 46)
    public final void method1202(int arg0, int arg1, int arg2, class101 arg3) {
        try {
            field1808++;
            int var5 = class351.field5673[arg1];
            if (arg3.method961((byte) -110, arg2) != null) {
                if (arg0 != -32452) {
                    this.method1207(false, -38, 74);
                }
                this.field1802[var5] = class553.method4099(arg2, Integer.MIN_VALUE);
                this.method1206((byte) 127);
            }
        } catch (RuntimeException var7) {
            throw class590.method4333(var7, field1815[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1815[5] : field1815[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IIILgja;)V", line = 66)
    public final void method1203(int arg0, int arg1, int arg2, class51 arg3) {
        try {
            field1806++;
            if (arg0 == arg1) {
                this.field1802[arg2] = 0;
            } else if (arg3.method531(arg1, (byte) 107) != null) {
                this.field1802[arg2] = class553.method4099(1073741824, arg1);
                this.method1206((byte) 118);
            }
        } catch (RuntimeException var6) {
            throw class590.method4333(var6, field1815[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 == null ? field1815[5] : field1815[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "c", descriptor = "(B)V", line = 87)
    public static void method1204(byte arg0) {
        try {
            field1807 = null;
            field1797 = null;
            if (arg0 <= 24) {
                method1210((byte) 4);
            }
        } catch (RuntimeException var2) {
            throw class590.method4333(var2, field1815[0] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(Loe;ILha;IIIIIILaia;ILps;)Lka;", line = 102)
    public final class499 method1205(class210 arg0, int arg1, class63 arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class238 arg9, int arg10, class101 arg11) {
        try {
            field1812++;
            int var13 = arg4;
            if (arg6 != -311099216) {
                field1797 = null;
            }
            if (arg0 != null) {
                boolean var14 = false;
                boolean var15 = false;
                boolean var16 = false;
                boolean var17 = false;
                boolean var18 = true;
                boolean var19 = true;
                Object var20 = null;
                var13 = arg4 | 0x20;
                Object var21 = null;
                int var22 = arg0.field3327[arg7];
                int var23 = var22 >>> 16;
                class356 var24 = arg9.method2052(80, var23);
                int var25 = var22 & 0xFFFF;
                if (var24 != null) {
                    var15 |= var24.method2947(var25, -1);
                    var14 |= var24.method2954(var25, -19459);
                    var17 |= var24.method2951(var25, (byte) 93);
                    var16 |= arg0.field3320;
                }
                if ((arg0.field3312 || class321.field5219) && arg5 != -1 && arg5 < arg0.field3327.length) {
                    int var26 = arg0.field3327[arg5];
                    int var27 = var26 >>> 16;
                    int var28 = var26 & 0xFFFF;
                    class356 var29;
                    if (var23 == var27) {
                        var29 = var24;
                    } else {
                        var29 = arg9.method2052(49, var28 >>> 16);
                    }
                    if (var29 != null) {
                        var15 |= var29.method2947(var28, -1);
                        var14 |= var29.method2954(var28, -19459);
                        var17 |= var29.method2951(var28, (byte) 93);
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
            long var30 = (long) (arg8 << 16) | (long) arg10 << 32 | (long) arg1;
            class29 var32 = class12.field137;
            class499 var33;
            synchronized (class12.field137) {
                var33 = (class499) class12.field137.method302(-120, var30);
            }
            if (var33 == null || arg2.method151(var33.method433(), var13) != 0) {
                if (var33 != null) {
                    var13 = arg2.method169(var13, var33.method433());
                }
                class141[] var35 = new class141[3];
                int var36 = 0;
                if (!arg11.method961((byte) -104, arg1).method3349((byte) -113) || !arg11.method961((byte) -104, arg8).method3349((byte) -113) || !arg11.method961((byte) -123, arg10).method3349((byte) -113)) {
                    return null;
                }
                class141 var37 = arg11.method961((byte) -113, arg1).method3352(arg6 ^ 0xED7500B0);
                if (var37 != null) {
                    var35[var36++] = var37;
                }
                class141 var38 = arg11.method961((byte) -127, arg8).method3352(0);
                if (var38 != null) {
                    var35[var36++] = var38;
                }
                class141 var39 = arg11.method961((byte) -125, arg10).method3352(0);
                if (var39 != null) {
                    var35[var36++] = var39;
                }
                class141 var40 = new class141(var35, var36);
                int var41 = var13 | 0x4000;
                var33 = arg2.method192(var40, var41, class420.field6638, 64, 768);
                for (int var42 = 0; var42 < 5; var42++) {
                    for (int var43 = 0; var43 < class101.field1485.length; var43++) {
                        if (class101.field1485[var43][var42].length > this.field1801[var42]) {
                            var33.method420(class350.field5667[var43][var42], class101.field1485[var43][var42][this.field1801[var42]]);
                        }
                    }
                }
                var33.method411(var13);
                class29 var44 = class12.field137;
                synchronized (class12.field137) {
                    class12.field137.method295(false, var30, var33);
                }
            }
            if (arg0 == null) {
                return var33;
            } else {
                class499 var45 = var33.method394((byte) 4, var13, true);
                return arg0.method1901(arg5, arg7, var45, arg3, arg4, (byte) -113);
            }
        } catch (RuntimeException var50) {
            throw class590.method4333(var50, field1815[21] + (arg0 == null ? field1815[5] : field1815[3]) + ',' + arg1 + ',' + (arg2 == null ? field1815[5] : field1815[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 == null ? field1815[5] : field1815[3]) + ',' + arg10 + ',' + (arg11 == null ? field1815[5] : field1815[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "b", descriptor = "(B)V", line = 258)
    private final void method1206(byte arg0) {
        try {
            field1800++;
            long[] var2 = class53.field658;
            this.field1796 = -1L;
            this.field1796 = var2[(int) ((this.field1796 ^ (long) (this.field1811 >> 8)) & 0xFFL)] ^ this.field1796 >>> 8;
            this.field1796 = this.field1796 >>> 8 ^ var2[(int) ((this.field1796 ^ (long) this.field1811) & 0xFFL)];
            for (int var3 = 0; var3 < this.field1802.length; var3++) {
                this.field1796 = this.field1796 >>> 8 ^ var2[(int) (((long) (this.field1802[var3] >> 24) ^ this.field1796) & 0xFFL)];
                this.field1796 = var2[(int) (((long) (this.field1802[var3] >> 16) ^ this.field1796) & 0xFFL)] ^ this.field1796 >>> 8;
                this.field1796 = var2[(int) ((this.field1796 ^ (long) (this.field1802[var3] >> 8)) & 0xFFL)] ^ this.field1796 >>> 8;
                this.field1796 = this.field1796 >>> 8 ^ var2[(int) ((this.field1796 ^ (long) this.field1802[var3]) & 0xFFL)];
            }
            if (this.field1814 != null) {
                for (int var4 = 0; var4 < this.field1814.length; var4++) {
                    if (this.field1814[var4] != null) {
                        int[] var5;
                        int[] var6;
                        if (this.field1813) {
                            var5 = this.field1814[var4].field5697;
                            var6 = this.field1814[var4].field5699;
                        } else {
                            var6 = this.field1814[var4].field5696;
                            var5 = this.field1814[var4].field5698;
                        }
                        if (var6 != null) {
                            for (int var7 = 0; var7 < var6.length; var7++) {
                                this.field1796 = this.field1796 >>> 8 ^ var2[(int) ((this.field1796 ^ (long) (var6[var7] >> 8)) & 0xFFL)];
                                this.field1796 = var2[(int) (((long) var6[var7] ^ this.field1796) & 0xFFL)] ^ this.field1796 >>> 8;
                            }
                        }
                        if (var5 != null) {
                            for (int var8 = 0; var8 < var5.length; var8++) {
                                this.field1796 = this.field1796 >>> 8 ^ var2[(int) ((this.field1796 ^ (long) (var5[var8] >> 8)) & 0xFFL)];
                                this.field1796 = var2[(int) ((this.field1796 ^ (long) var5[var8]) & 0xFFL)] ^ this.field1796 >>> 8;
                            }
                        }
                        if (this.field1814[var4].field5700 != null) {
                            for (int var9 = 0; var9 < this.field1814[var4].field5700.length; var9++) {
                                this.field1796 = this.field1796 >>> 8 ^ var2[(int) (((long) (this.field1814[var4].field5700[var9] >> 8) ^ this.field1796) & 0xFFL)];
                                this.field1796 = this.field1796 >>> 8 ^ var2[(int) ((this.field1796 ^ (long) this.field1814[var4].field5700[var9]) & 0xFFL)];
                            }
                        }
                        if (this.field1814[var4].field5695 != null) {
                            for (int var10 = 0; var10 < this.field1814[var4].field5695.length; var10++) {
                                this.field1796 = var2[(int) (((long) (this.field1814[var4].field5695[var10] >> 8) ^ this.field1796) & 0xFFL)] ^ this.field1796 >>> 8;
                                this.field1796 = this.field1796 >>> 8 ^ var2[(int) (((long) this.field1814[var4].field5695[var10] ^ this.field1796) & 0xFFL)];
                            }
                        }
                    }
                }
            }
            if (arg0 <= 114) {
                this.method1201((byte) -106, true);
            }
            for (int var11 = 0; var11 < 5; var11++) {
                this.field1796 = var2[(int) ((this.field1796 ^ (long) this.field1801[var11]) & 0xFFL)] ^ this.field1796 >>> 8;
            }
            this.field1796 = var2[(int) ((this.field1796 ^ (long) (this.field1813 ? 1 : 0)) & 0xFFL)] ^ this.field1796 >>> 8;
        } catch (RuntimeException var13) {
            throw class590.method4333(var13, field1815[2] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ZII)V", line = 382)
    public final void method1207(boolean arg0, int arg1, int arg2) {
        try {
            this.field1801[arg1] = arg2;
            field1798++;
            if (arg0) {
                this.method1203(39, -118, 125, null);
            }
            this.method1206((byte) 118);
        } catch (RuntimeException var5) {
            throw class590.method4333(var5, field1815[20] + arg0 + ',' + arg1 + ',' + arg2 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(ILuv;IIILps;Laia;Lgja;Lha;ILada;Loe;)Lka;", line = 395)
    public final class499 method1208(int arg0, class384 arg1, int arg2, int arg3, int arg4, class101 arg5, class238 arg6, class51 arg7, class63 arg8, int arg9, class171 arg10, class210 arg11) {
        try {
            if (arg4 != 16384) {
                this.field1799 = 120L;
            }
            field1803++;
            if (this.field1805 != -1) {
                return arg1.method3142(this.field1805, (byte) 80).method1524(arg0, arg2, null, arg11, arg6, arg10, arg8, arg3, (byte) 114, arg9);
            }
            int var13 = arg2;
            if (arg11 != null) {
                boolean var14 = false;
                boolean var15 = false;
                boolean var16 = false;
                boolean var17 = false;
                boolean var18 = true;
                boolean var19 = true;
                Object var20 = null;
                var13 = arg2 | 0x20;
                Object var21 = null;
                int var22 = arg11.field3327[arg9];
                int var23 = var22 >>> 16;
                int var24 = var22 & 0xFFFF;
                class356 var25 = arg6.method2052(90, var23);
                if (var25 != null) {
                    var15 |= var25.method2947(var24, -1);
                    var14 |= var25.method2954(var24, -19459);
                    var17 |= var25.method2951(var24, (byte) 93);
                    var16 |= arg11.field3320;
                }
                if ((arg11.field3312 || class321.field5219) && arg3 != -1 && arg11.field3327.length > arg3) {
                    int var26 = arg11.field3327[arg3];
                    int var27 = var26 >>> 16;
                    int var28 = var26 & 0xFFFF;
                    class356 var29 = var23 == var27 ? var25 : arg6.method2052(91, var27);
                    if (var29 != null) {
                        var15 |= var29.method2947(var28, -1);
                        var14 |= var29.method2954(var28, -19459);
                        var17 |= var29.method2951(var28, (byte) 93);
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
            class29 var30 = class12.field137;
            class499 var31;
            synchronized (class12.field137) {
                var31 = (class499) class12.field137.method302(-92, this.field1796);
            }
            if (var31 == null || arg8.method151(var31.method433(), var13) != 0) {
                if (var31 != null) {
                    var13 = arg8.method169(var13, var31.method433());
                }
                boolean var33 = false;
                for (int var34 = 0; var34 < this.field1802.length; var34++) {
                    int var35 = this.field1802[var34];
                    class353 var36 = null;
                    if ((var35 & 0x40000000) != 0) {
                        if (this.field1814 != null && this.field1814[var34] != null) {
                            var36 = this.field1814[var34];
                        }
                        if (!arg7.method531(var35 & 0x3FFFFFFF, (byte) 50).method4277((byte) -107, this.field1813, var36)) {
                            var33 = true;
                        }
                    } else if ((var35 & Integer.MIN_VALUE) != 0 && !arg5.method961((byte) -110, var35 & 0x3FFFFFFF).method3349((byte) -113)) {
                        var33 = true;
                    }
                }
                if (var33) {
                    return null;
                }
                class141[] var37 = new class141[this.field1802.length];
                int var38 = 0;
                for (int var39 = 0; var39 < this.field1802.length; var39++) {
                    int var40 = this.field1802[var39];
                    class353 var41 = null;
                    if ((var40 & 0x40000000) != 0) {
                        if (this.field1814 != null && this.field1814[var39] != null) {
                            var41 = this.field1814[var39];
                        }
                        class141 var43 = arg7.method531(var40 & 0x3FFFFFFF, (byte) 99).method4285(this.field1813, var41, (byte) 91);
                        if (var43 != null) {
                            var37[var38++] = var43;
                        }
                    } else if ((Integer.MIN_VALUE & var40) != 0) {
                        class141 var42 = arg5.method961((byte) -114, var40 & 0x3FFFFFFF).method3352(0);
                        if (var42 != null) {
                            var37[var38++] = var42;
                        }
                    }
                }
                class141 var44 = new class141(var37, var38);
                int var45 = var13 | 0x4000;
                var31 = arg8.method192(var44, var45, class420.field6638, 64, 768);
                for (int var46 = 0; var46 < 5; var46++) {
                    for (int var47 = 0; var47 < class101.field1485.length; var47++) {
                        if (this.field1801[var46] < class101.field1485[var47][var46].length) {
                            var31.method420(class350.field5667[var47][var46], class101.field1485[var47][var46][this.field1801[var46]]);
                        }
                    }
                }
                var31.method411(var13);
                class29 var48 = class12.field137;
                synchronized (class12.field137) {
                    class12.field137.method295(false, this.field1796, var31);
                }
            }
            if (arg11 == null) {
                return var31;
            } else {
                var31.method394((byte) 4, var13, true);
                return arg11.method1901(arg3, arg9, var31, arg0, arg2, (byte) -30);
            }
        } catch (RuntimeException var54) {
            throw class590.method4333(var54, field1815[4] + arg0 + ',' + (arg1 == null ? field1815[5] : field1815[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 == null ? field1815[5] : field1815[3]) + ',' + (arg6 == null ? field1815[5] : field1815[3]) + ',' + (arg7 == null ? field1815[5] : field1815[3]) + ',' + (arg8 == null ? field1815[5] : field1815[3]) + ',' + arg9 + ',' + (arg10 == null ? field1815[5] : field1815[3]) + ',' + (arg11 == null ? field1815[5] : field1815[3]) + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(IILhe;ILps;Laia;Lgja;Loe;Lada;B[Lcq;IILuv;ILoe;Z[ILha;Lgj;II)Lka;", line = 609)
    public final class499 method1209(int arg0, int arg1, class391 arg2, int arg3, class101 arg4, class238 arg5, class51 arg6, class210 arg7, class171 arg8, byte arg9, class494[] arg10, int arg11, int arg12, class384 arg13, int arg14, class210 arg15, boolean arg16, int[] arg17, class63 arg18, class663 arg19, int arg20, int arg21) {
        try {
            field1809++;
            if (this.field1805 != -1) {
                return arg13.method3142(this.field1805, (byte) 80).method1529(arg8, arg20, arg0, arg17, arg7, arg11, arg14, arg10, null, 65535, arg2, arg21, arg5, arg1, arg12, arg3, arg15, arg18);
            }
            int var23 = arg12;
            long var24 = this.field1796;
            int[] var26 = this.field1802;
            boolean var27 = false;
            boolean var28 = false;
            if (arg15 != null && (arg15.field3316 >= 0 || arg15.field3336 >= 0)) {
                var26 = new int[this.field1802.length];
                for (int var29 = 0; var29 < var26.length; var29++) {
                    var26[var29] = this.field1802[var29];
                }
                if (arg15.field3316 >= 0 && arg19.field9449 != -1) {
                    var27 = true;
                    if (arg15.field3316 == 65535) {
                        var26[arg19.field9449] = 0;
                        for (int var31 = 0; var31 < arg19.field9446.length; var31++) {
                            var26[arg19.field9446[var31]] = 0;
                        }
                        var24 ^= 0xFFFFFFFF00000000L;
                    } else {
                        var26[arg19.field9449] = class553.method4099(arg15.field3316, 1073741824);
                        for (int var30 = 0; var30 < arg19.field9446.length; var30++) {
                            var26[arg19.field9446[var30]] = 0;
                        }
                        var24 ^= (long) var26[arg19.field9449] << 32;
                    }
                }
                if (arg15.field3336 >= 0 && arg19.field9445 != -1) {
                    var28 = true;
                    if (arg15.field3336 == 65535) {
                        var26[arg19.field9445] = 0;
                        for (int var33 = 0; var33 < arg19.field9451.length; var33++) {
                            var26[arg19.field9451[var33]] = 0;
                        }
                        var24 ^= 0xFFFFFFFFL;
                    } else {
                        var26[arg19.field9445] = class553.method4099(arg15.field3336, 1073741824);
                        for (int var32 = 0; var32 < arg19.field9451.length; var32++) {
                            var26[arg19.field9451[var32]] = 0;
                        }
                        var24 ^= var26[arg19.field9445];
                    }
                }
            }
            boolean var34 = false;
            boolean var35 = false;
            boolean var36 = false;
            boolean var37 = arg15 != null || arg7 != null;
            int var38 = arg10 == null ? 0 : arg10.length;
            for (int var39 = 0; var39 < var38; var39++) {
                class690.field9953[var39] = null;
                if (arg10[var39] != null) {
                    class210 var40 = arg5.method2058(arg10[var39].field7422, (byte) -69);
                    if (var40.field3327 != null) {
                        var37 = true;
                        class154.field2141[var39] = var40;
                        int var41 = arg10[var39].field7434;
                        int var42 = arg10[var39].field7423;
                        int var43 = var40.field3327[var41];
                        class690.field9953[var39] = arg5.method2052(68, var43 >>> 16);
                        int var44 = var43 & 0xFFFF;
                        class395.field6275[var39] = var44;
                        if (class690.field9953[var39] != null) {
                            var35 |= class690.field9953[var39].method2947(var44, -1);
                            var34 |= class690.field9953[var39].method2954(var44, -19459);
                            var36 |= class690.field9953[var39].method2951(var44, (byte) 93);
                        }
                        if ((var40.field3312 || class321.field5219) && var42 != -1 && var40.field3327.length > var42) {
                            class152.field2130[var39] = var40.field3334[var41];
                            class734.field10758[var39] = arg10[var39].field7424;
                            int var45 = var40.field3327[var42];
                            class15.field165[var39] = arg5.method2052(26, var45 >>> 16);
                            int var46 = var45 & 0xFFFF;
                            class231.field3583[var39] = var46;
                            if (class15.field165[var39] != null) {
                                var35 |= class15.field165[var39].method2947(var46, -1);
                                var34 |= class15.field165[var39].method2954(var46, -19459);
                                var36 |= class15.field165[var39].method2951(var46, (byte) 93);
                            }
                        } else {
                            class152.field2130[var39] = 0;
                            class734.field10758[var39] = 0;
                            class15.field165[var39] = null;
                            class231.field3583[var39] = -1;
                        }
                    }
                }
            }
            int var47 = -1;
            int var48 = -1;
            int var49 = 0;
            class356 var50 = null;
            class356 var51 = null;
            int var52 = -1;
            int var53 = -1;
            int var54 = 0;
            class356 var55 = null;
            int var56 = 67 % ((arg9 + 53) / 41);
            class356 var57 = null;
            if (var37) {
                var23 = arg12 | 0x20;
                if (arg15 != null) {
                    int var58 = arg15.field3327[arg21];
                    int var59 = var58 >>> 16;
                    var50 = arg5.method2052(57, var59);
                    var47 = var58 & 0xFFFF;
                    if (var50 != null) {
                        var35 |= var50.method2947(var47, -1);
                        var34 |= var50.method2954(var47, -19459);
                        var36 |= var50.method2951(var47, (byte) 93);
                    }
                    if ((arg15.field3312 || class321.field5219) && arg14 != -1 && arg14 < arg15.field3327.length) {
                        var49 = arg15.field3334[arg21];
                        int var60 = arg15.field3327[arg14];
                        int var61 = var60 >>> 16;
                        var51 = var59 == var61 ? var50 : arg5.method2052(84, var61);
                        var48 = var60 & 0xFFFF;
                        if (var51 != null) {
                            var35 |= var51.method2947(var48, -1);
                            var34 |= var51.method2954(var48, -19459);
                            var36 |= var51.method2951(var48, (byte) 93);
                        }
                    }
                }
                if (arg7 != null) {
                    int var62 = arg7.field3327[arg3];
                    int var63 = var62 >>> 16;
                    var52 = var62 & 0xFFFF;
                    var55 = arg5.method2052(110, var63);
                    if (var55 != null) {
                        var35 |= var55.method2947(var52, -1);
                        var34 |= var55.method2954(var52, -19459);
                        var36 |= var55.method2951(var52, (byte) 93);
                    }
                    if ((arg7.field3312 || class321.field5219) && arg11 != -1 && arg11 < arg7.field3327.length) {
                        int var64 = arg7.field3327[arg11];
                        var54 = arg7.field3334[arg3];
                        int var65 = var64 >>> 16;
                        var57 = var63 == var65 ? var55 : arg5.method2052(35, var65);
                        var53 = var64 & 0xFFFF;
                        if (var57 != null) {
                            var35 |= var57.method2947(var53, -1);
                            var34 |= var57.method2954(var53, -19459);
                            var36 |= var57.method2951(var53, (byte) 93);
                        }
                    }
                }
                if (var35) {
                    var23 |= 0x80;
                }
                if (var34) {
                    var23 |= 0x100;
                }
                if (var36) {
                    var23 |= 0x400;
                }
            }
            class29 var66 = class223.field3499;
            class499 var67;
            synchronized (class223.field3499) {
                var67 = (class499) class223.field3499.method302(-103, var24);
            }
            class707 var68 = null;
            if (this.field1811 != -1) {
                var68 = arg2.method3182(this.field1811, -117);
            }
            if (var67 == null || arg18.method151(var67.method433(), var23) != 0) {
                if (var67 != null) {
                    var23 = arg18.method169(var23, var67.method433());
                }
                boolean var70 = false;
                int var71 = 0;
                while (true) {
                    if (var26.length <= var71) {
                        if (var70) {
                            if (this.field1799 != -1L) {
                                class29 var77 = class223.field3499;
                                synchronized (class223.field3499) {
                                    var67 = (class499) class223.field3499.method302(-83, this.field1799);
                                }
                            }
                            if (var67 == null || arg18.method151(var67.method433(), var23) != 0) {
                                return null;
                            }
                        } else {
                            class141[] var78 = new class141[var26.length];
                            for (int var79 = 0; var79 < var26.length; var79++) {
                                int var80 = var26[var79];
                                class353 var81 = null;
                                boolean var82 = var79 == 5 && var27 || var79 == 3 && var28;
                                if ((var80 & 0x40000000) != 0) {
                                    if (!var82 && this.field1814 != null && this.field1814[var79] != null) {
                                        var81 = this.field1814[var79];
                                    }
                                    class141 var83 = arg6.method531(var80 & 0x3FFFFFFF, (byte) 121).method4288(this.field1813, var81, (byte) 123);
                                    if (var83 != null) {
                                        var78[var79] = var83;
                                    }
                                } else if ((var80 & Integer.MIN_VALUE) != 0) {
                                    class141 var84 = arg4.method961((byte) -108, var80 & 0x3FFFFFFF).method3347(-17847);
                                    if (var84 != null) {
                                        var78[var79] = var84;
                                    }
                                }
                            }
                            if (var68 != null && var68.field10147 != null) {
                                for (int var85 = 0; var85 < var68.field10147.length; var85++) {
                                    if (var78[var85] != null) {
                                        int var86 = 0;
                                        int var87 = 0;
                                        int var88 = 0;
                                        int var89 = 0;
                                        int var90 = 0;
                                        int var91 = 0;
                                        if (var68.field10147[var85] != null) {
                                            var90 = var68.field10147[var85][4] << 3;
                                            var87 = var68.field10147[var85][1];
                                            var89 = var68.field10147[var85][3] << 3;
                                            var91 = var68.field10147[var85][5] << 3;
                                            var86 = var68.field10147[var85][0];
                                            var88 = var68.field10147[var85][2];
                                        }
                                        if (var89 != 0 || var90 != 0 || var91 != 0) {
                                            var78[var85].method1302(-14911, var90, var91, var89);
                                        }
                                        if (var86 != 0 || var87 != 0 || var88 != 0) {
                                            var78[var85].method1308(-1449, var87, var86, var88);
                                        }
                                    }
                                }
                            }
                            int var92 = var23 | 0x4000;
                            class141 var93 = new class141(var78, var78.length);
                            var67 = arg18.method192(var93, var92, class420.field6638, 64, 850);
                            for (int var94 = 0; var94 < 5; var94++) {
                                for (int var95 = 0; var95 < class101.field1485.length; var95++) {
                                    if (this.field1801[var94] < class101.field1485[var95][var94].length) {
                                        var67.method420(class350.field5667[var95][var94], class101.field1485[var95][var94][this.field1801[var94]]);
                                    }
                                }
                            }
                            if (arg16) {
                                var67.method411(var23);
                                class29 var96 = class223.field3499;
                                synchronized (class223.field3499) {
                                    class223.field3499.method295(false, var24, var67);
                                }
                                this.field1799 = var24;
                            }
                        }
                        break;
                    }
                    int var72 = var26[var71];
                    class353 var73 = null;
                    boolean var74 = false;
                    if (var27) {
                        if (arg19.field9449 == var71) {
                            var74 = true;
                        } else {
                            for (int var75 = 0; var75 < arg19.field9446.length; var75++) {
                                if (arg19.field9446[var75] == var71) {
                                    var74 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if (var28) {
                        if (arg19.field9445 == var71) {
                            var74 = true;
                        } else {
                            for (int var76 = 0; var76 < arg19.field9451.length; var76++) {
                                if (arg19.field9451[var76] == var71) {
                                    var74 = true;
                                    break;
                                }
                            }
                        }
                    }
                    if ((var72 & 0x40000000) != 0) {
                        if (!var74 && this.field1814 != null && this.field1814[var71] != null) {
                            var73 = this.field1814[var71];
                        }
                        if (!arg6.method531(var72 & 0x3FFFFFFF, (byte) 43).method4289(this.field1813, 0, var73)) {
                            var70 = true;
                        }
                    } else if ((var72 & Integer.MIN_VALUE) != 0 && !arg4.method961((byte) -121, var72 & 0x3FFFFFFF).method3351(0)) {
                        var70 = true;
                    }
                    var71++;
                }
            }
            class499 var97 = var67.method394((byte) 4, var23, true);
            boolean var98 = false;
            if (arg17 != null) {
                for (int var99 = 0; var99 < arg17.length; var99++) {
                    if (arg17[var99] != -1) {
                        var98 = true;
                    }
                }
            }
            if (!var37 && !var98) {
                return var97;
            }
            class486[] var100 = null;
            if (var68 != null) {
                var100 = var68.method5135(true, arg18);
            }
            if (var98 && var100 != null) {
                for (int var101 = 0; var101 < arg17.length; var101++) {
                    if (var100[var101] != null) {
                        var97.method427(var100[var101], 0x1 << var101, true);
                    }
                }
            }
            int var102 = 0;
            int var103 = 1;
            while (var38 > var102) {
                if (class690.field9953[var102] != null) {
                    var97.method3771(null, false, -26592, class690.field9953[var102], class152.field2130[var102], class231.field3583[var102], class15.field165[var102], class734.field10758[var102] - 1, class395.field6275[var102], 0, var103);
                }
                var103 <<= 0x1;
                var102++;
            }
            if (var98) {
                for (int var104 = 0; var104 < arg17.length; var104++) {
                    if (arg17[var104] != -1) {
                        int var105 = arg17[var104] - arg0;
                        int var106 = var105 & 0x3FFF;
                        class486 var107 = arg18.method257();
                        var107.method2458(var106);
                        var97.method427(var107, 0x1 << var104, false);
                    }
                }
            }
            if (var98 && var100 != null) {
                for (int var108 = 0; var108 < arg17.length; var108++) {
                    if (var100[var108] != null) {
                        var97.method427(var100[var108], 0x1 << var108, false);
                    }
                }
            }
            if (var50 != null && var55 != null) {
                var97.method3773(var50, var49, var47, arg15.field3330, var51, var53, 16383, var57, arg1 - 1, false, var48, var54, var52, arg20 - 1, var55);
            } else if (var50 != null) {
                var97.method3767(var51, var49, var50, false, true, var47, 0, arg1 - 1, var48);
            } else if (var55 != null) {
                var97.method3767(var57, var54, var55, false, true, var52, 0, arg20 - 1, var53);
            }
            for (int var109 = 0; var109 < var38; var109++) {
                class690.field9953[var109] = null;
                class15.field165[var109] = null;
                class154.field2141[var109] = null;
            }
            return var97;
        } catch (RuntimeException var114) {
            throw class590.method4333(var114, field1815[19] + arg0 + ',' + arg1 + ',' + (arg2 == null ? field1815[5] : field1815[3]) + ',' + arg3 + ',' + (arg4 == null ? field1815[5] : field1815[3]) + ',' + (arg5 == null ? field1815[5] : field1815[3]) + ',' + (arg6 == null ? field1815[5] : field1815[3]) + ',' + (arg7 == null ? field1815[5] : field1815[3]) + ',' + (arg8 == null ? field1815[5] : field1815[3]) + ',' + arg9 + ',' + (arg10 == null ? field1815[5] : field1815[3]) + ',' + arg11 + ',' + arg12 + ',' + (arg13 == null ? field1815[5] : field1815[3]) + ',' + arg14 + ',' + (arg15 == null ? field1815[5] : field1815[3]) + ',' + arg16 + ',' + (arg17 == null ? field1815[5] : field1815[3]) + ',' + (arg18 == null ? field1815[5] : field1815[3]) + ',' + (arg19 == null ? field1815[5] : field1815[3]) + ',' + arg20 + ',' + arg21 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "a", descriptor = "(B)I", line = 1256)
    public static final int method1210(byte arg0) {
        try {
            field1795++;
            if (class388.field6192 == 0) {
                class74.field1038.method772(-128, new class597(field1815[16]));
                if (class74.field1038.method773(true).method346((byte) 41) != 100) {
                    return 1;
                }
                if (!((class597) class74.field1038.method773(true)).method4371(-112)) {
                    class392.field6245.method2961(-4);
                }
                class388.field6192 = 1;
            }
            if (class388.field6192 == 1) {
                class624.field9000 = class74.method775(-119);
                class74.field1027.method772(-127, new class726(class362.field5846));
                class74.field1039.method772(-126, new class597(field1815[12]));
                class74.field1040.method772(-127, new class597(field1815[10]));
                class74.field1041.method772(-124, new class597(field1815[8]));
                class74.field1042.method772(-127, new class597(field1815[17]));
                class74.field1043.method772(-125, new class597(field1815[13]));
                class74.field1044.method772(-128, new class597(field1815[9]));
                class74.field1045.method772(-124, new class726(class177.field2861));
                class74.field1046.method772(-126, new class726(class200.field3160));
                class74.field1047.method772(-124, new class726(class672.field9530));
                class74.field1048.method772(-128, new class726(class423.field6671));
                class74.field1049.method772(-124, new class726(class618.field8924));
                class74.field1050.method772(-128, new class726(class42.field473));
                class74.field1051.method772(-127, new class726(class659.field9417));
                class74.field1052.method772(-124, new class726(class374.field6062));
                class74.field1053.method772(-127, new class726(class719.field10519));
                class74.field1054.method772(-124, new class726(class58.field744));
                class74.field1055.method772(-127, new class726(class793.field11598));
                class74.field1056.method772(-125, new class726(class104.field1526));
                class74.field1057.method772(-124, new class726(class233.field3609));
                class74.field1058.method772(-126, new class726(class440.field6872));
                class74.field1059.method772(-124, new class612(class432.field6787, field1815[14]));
                class74.field1060.method772(-125, new class726(class424.field6685));
                class74.field1061.method772(-125, new class726(class546.field8029));
                class74.field1062.method772(-128, new class726(class242.field3745));
                class74.field1063.method772(-124, new class697(class40.field467, field1815[11]));
                for (int var1 = 0; var1 < class624.field9000.length; var1++) {
                    if (class624.field9000[var1].method773(true) == null) {
                        throw new RuntimeException();
                    }
                }
                int var2 = 0;
                class74[] var3 = class624.field9000;
                for (int var4 = 0; var4 < var3.length; var4++) {
                    class74 var5 = var3[var4];
                    int var6 = var5.method774(-44);
                    int var7 = var5.method773(true).method346((byte) 62);
                    var2 += var6 * var7 / 100;
                }
                class721.field10588 = var2;
                class388.field6192 = 2;
            }
            if (class624.field9000 == null) {
                return 100;
            }
            int var8 = 0;
            if (arg0 > -32) {
                return -8;
            }
            int var9 = 0;
            boolean var10 = true;
            class74[] var11 = class624.field9000;
            for (int var12 = 0; var12 < var11.length; var12++) {
                class74 var13 = var11[var12];
                int var14 = var13.method774(-99);
                int var15 = var13.method773(true).method346((byte) 109);
                var8 += var14;
                if (var15 < 100) {
                    var10 = false;
                }
                var9 += var14 * var15 / 100;
            }
            if (var10) {
                if (!((class597) class74.field1041.method773(true)).method4371(-122)) {
                    class392.field6245.method2962(0);
                }
                if (!((class597) class74.field1044.method773(true)).method4371(-86)) {
                    class519.field7688 = class392.field6245.method2965(0);
                }
                class624.field9000 = null;
            }
            int var16 = var8 - class721.field10588;
            int var17 = var9 - class721.field10588;
            int var18 = var16 > 0 ? var17 * 100 / var16 : 100;
            if (!var10 && var18 > 99) {
                var18 = 99;
            }
            return var18;
        } catch (RuntimeException var20) {
            throw class590.method4333(var20, field1815[15] + arg0 + ')');
        }
    }

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "(Ljava/lang/String;)[C")
    private static char[] method1211(String arg0) {
        char[] var10000 = arg0.toCharArray();
        if (var10000.length < 2) {
            var10000[0] = (char) (var10000[0] ^ 0x3D);
        }
        return var10000;
    }

    @OriginalMember(owner = "client!uaa", name = "z", descriptor = "([C)Ljava/lang/String;")
    private static String method1212(char[] arg0) {
        int var10002 = arg0.length;
        char[] var10001 = arg0;
        int var10000 = var10002;
        for (int var1 = 0; var1 < var10000; var1++) {
            char var10004 = var10001[var1];
            byte var10005;
            switch(var1 % 5) {
                case 0:
                    var10005 = 89;
                    break;
                case 1:
                    var10005 = 80;
                    break;
                case 2:
                    var10005 = 100;
                    break;
                case 3:
                    var10005 = 102;
                    break;
                default:
                    var10005 = 61;
            }
            var10001[var1] = (char) (var10004 ^ var10005);
        }
        return (new String(var10001)).intern();
    }
}
