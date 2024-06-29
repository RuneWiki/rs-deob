import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sl")
public class class110 extends class182 {

    @OriginalMember(owner = "client!sl", name = "Q", descriptor = "I")
    private int field1806 = 12288;

    @OriginalMember(owner = "client!sl", name = "T", descriptor = "I")
    private int field1809 = 8192;

    @OriginalMember(owner = "client!sl", name = "db", descriptor = "I")
    private int field1818 = 0;

    @OriginalMember(owner = "client!sl", name = "gb", descriptor = "I")
    private int field1821 = 2048;

    @OriginalMember(owner = "client!sl", name = "R", descriptor = "I")
    private int field1807 = 2048;

    @OriginalMember(owner = "client!sl", name = "X", descriptor = "I")
    private int field1812 = 4096;

    @OriginalMember(owner = "client!sl", name = "Y", descriptor = "I")
    private int field1813 = 0;

    @OriginalMember(owner = "client!sl", name = "ib", descriptor = "Lpf;")
    public static class17 field1823 = new class17(64);

    @OriginalMember(owner = "client!sl", name = "lb", descriptor = "Ljava/lang/String;")
    public static String field1826 = "glow1:";

    @OriginalMember(owner = "client!sl", name = "nb", descriptor = "Ljava/lang/String;")
    public static String field1828 = " more options";

    @OriginalMember(owner = "client!sl", name = "P", descriptor = "I")
    public static int field1805;

    @OriginalMember(owner = "client!sl", name = "S", descriptor = "I")
    public static int field1808;

    @OriginalMember(owner = "client!sl", name = "V", descriptor = "I")
    public static int field1810;

    @OriginalMember(owner = "client!sl", name = "W", descriptor = "I")
    public static int field1811;

    @OriginalMember(owner = "client!sl", name = "Z", descriptor = "I")
    public static int field1814;

    @OriginalMember(owner = "client!sl", name = "ab", descriptor = "I")
    public static int field1815;

    @OriginalMember(owner = "client!sl", name = "bb", descriptor = "I")
    public static int field1816;

    @OriginalMember(owner = "client!sl", name = "cb", descriptor = "I")
    public static int field1817;

    @OriginalMember(owner = "client!sl", name = "eb", descriptor = "I")
    public static int field1819;

    @OriginalMember(owner = "client!sl", name = "fb", descriptor = "I")
    public static int field1820;

    @OriginalMember(owner = "client!sl", name = "hb", descriptor = "I")
    public static int field1822;

    @OriginalMember(owner = "client!sl", name = "mb", descriptor = "Lek;")
    public static class250 field1827;

    @OriginalMember(owner = "client!sl", name = "jb", descriptor = "[I")
    public static int[] field1824;

    @OriginalMember(owner = "client!sl", name = "kb", descriptor = "[I")
    public static int[] field1825;

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (arg0) {
            this.method826(120, (byte) -31, 48);
        }
        ++field1816;
        if (~arg2 != -1) {
            if (~arg2 != -2) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field1809 = arg1.method1821((byte) 51);
                                }
                            } else {
                                this.field1812 = arg1.method1821((byte) 51);
                            }
                        } else {
                            this.field1806 = arg1.method1821((byte) 51);
                        }
                    } else {
                        this.field1821 = arg1.method1821((byte) 51);
                    }
                } else {
                    this.field1818 = arg1.method1821((byte) 51);
                }
            } else {
                this.field1813 = arg1.method1821((byte) 51);
            }
        } else {
            this.field1807 = arg1.method1821((byte) 51);
        }
    }

    @OriginalMember(owner = "client!sl", name = "j", descriptor = "(I)V")
    public static void method820(int arg0) {
        field1827 = null;
        field1823 = null;
        if (arg0 == -31687) {
            field1825 = null;
            field1826 = null;
            field1824 = null;
            field1828 = null;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IJ)V")
    public static final void method821(int arg0, long arg1) {
        try {
            if (arg0 != -21304) {
                return;
            }
            Thread.sleep(arg1);
        } catch (InterruptedException var3) {
        }
        ++field1811;
    }

    @OriginalMember(owner = "client!sl", name = "<init>", descriptor = "()V")
    public class110() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(B)V")
    public static final void method822(byte arg0) {
        if (arg0 > -97) {
            field1824 = null;
        }
        ++field1815;
        class17.field339 = null;
        class68.field1144 = -1;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(II)Z")
    public static final boolean method823(int arg0, int arg1) {
        ++field1822;
        if (class213.field3593 == arg1) {
            return false;
        } else {
            class294.field4829 = new int[104][104];
            class173.field2778 = new int[4][13][13];
            class77.field1308 = new int[104][104];
            class95.field1541 = new int[104][104];
            class228.field3857 = new int[104][104];
            for (int var2 = arg0; ~var2 > -5; ++var2) {
                class225.field3790[var2] = new class311(104, 104);
            }
            class125.field2101 = new class49[4][104][104];
            class161.field2621 = new byte[4][104][104];
            class213.field3593 = arg1;
            class67.field1132 = new byte[4][104][104];
            return true;
        }
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method824(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class21.field379 * 128) {
            arg0 = class21.field379 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class28.field479 * 128) {
            arg2 = class28.field479 * 128 - 1;
        }
        class310.field4992 = class128.field2133[arg3];
        class236.field3984 = class128.field2130[arg3];
        class273.field4570 = class128.field2133[arg4];
        class4.field118 = class128.field2130[arg4];
        class118.field1987 = arg0;
        class28.field481 = arg1;
        class84.field1398 = arg2;
        class286.field4742 = arg0 / 128;
        class303.field4929 = arg2 / 128;
        class146.field2413 = class286.field4742 - class6.field139;
        if (class146.field2413 < 0) {
            class146.field2413 = 0;
        }
        class64.field1081 = class303.field4929 - class6.field139;
        if (class64.field1081 < 0) {
            class64.field1081 = 0;
        }
        class16.field316 = class6.field139 + class286.field4742;
        if (class16.field316 > class21.field379) {
            class16.field316 = class21.field379;
        }
        class26.field456 = class6.field139 + class303.field4929;
        if (class26.field456 > class28.field479) {
            class26.field456 = class28.field479;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class6.field139 + class6.field139 + 2; ++var16) {
            for (int var19 = 0; var19 < class6.field139 + class6.field139 + 2; ++var19) {
                int var20 = (var16 - class6.field139 << 7) - (class118.field1987 & 127);
                int var21 = (var19 - class6.field139 << 7) - (class84.field1398 & 127);
                int var22 = class286.field4742 - class6.field139 + var16;
                int var23 = class303.field4929 - class6.field139 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class21.field379 && var23 < class28.field479) {
                    int var24;
                    if (class183.field2929 != null) {
                        var24 = class183.field2929[0][var22][var23] - class28.field481 + 128;
                    } else {
                        var24 = class207.field3401[0][var22][var23] - class28.field481 + 128;
                    }
                    int var25 = class207.field3401[3][var22][var23] - class28.field481 - 1000;
                    class108.field1781[var16][var19] = class312.method2114(var20, var25, var24, var21, var15);
                } else {
                    class108.field1781[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class6.field139 + class6.field139 + 1; ++var17) {
            for (int var18 = 0; var18 < class6.field139 + class6.field139 + 1; ++var18) {
                class36.field584[var17][var18] = class108.field1781[var17][var18] || class108.field1781[var17 + 1][var18] || class108.field1781[var17][var18 + 1] || class108.field1781[var17 + 1][var18 + 1];
            }
        }
        class101.field1605 = arg6;
        class54.field902 = arg7;
        class3.field104 = arg8;
        class16.field319 = arg9;
        class292.field4783 = arg10;
        class23.method149();
        if (class184.field2943 != null) {
            class65.method446(true);
            class167.method1244(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class65.method446(false);
        }
        class167.method1244(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        if (arg0) {
            method821(86, 45L);
        }
        ++field1810;
        int[] var3 = super.field2911.method77(arg1, -119);
        if (super.field2911.field287) {
            int var4 = class66.field1112[arg1] + -2048;
            for (int var5 = 0; ~var5 > ~class4.field116; ++var5) {
                int var6 = class207.field3415[var5] - 2048;
                int var7 = var6 - -this.field1807;
                int var8 = var7 >= -2048 ? var7 : var7 + 4096;
                int var9 = ~var8 >= -2049 ? var8 : var8 + -4096;
                int var10 = this.field1813 + var4;
                int var11 = var10 < -2048 ? var10 - -4096 : var10;
                int var12 = ~var11 < -2049 ? var11 + -4096 : var11;
                int var13 = this.field1818 + var6;
                int var14 = this.field1821 + var4;
                int var15 = var14 < -2048 ? var14 + 4096 : var14;
                int var16 = var15 <= 2048 ? var15 : var15 + -4096;
                int var17 = ~var13 > 2047 ? var13 - -4096 : var13;
                int var18 = var17 > 2048 ? var17 + -4096 : var17;
                var3[var5] = !this.method825(var9, (byte) 123, var12) && !this.method826(var16, (byte) 80, var18) ? 0 : 4096;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IBI)Z")
    private final boolean method825(int arg0, byte arg1, int arg2) {
        if (arg1 <= 76) {
            field1826 = null;
        }
        int var4 = (-arg0 + arg2) * this.field1806 >> 12;
        ++field1819;
        int var5 = class289.field4765[(var4 * 255 & 1047769) >> 12];
        int var6 = (var5 << 12) / this.field1806;
        int var7 = (var6 << 12) / this.field1809;
        int var8 = this.field1812 * var7 >> 12;
        return arg0 + arg2 < var8 && ~(arg0 + arg2) < ~(-var8);
    }

    @OriginalMember(owner = "client!sl", name = "b", descriptor = "(IBI)Z")
    private final boolean method826(int arg0, byte arg1, int arg2) {
        ++field1817;
        int var4 = (arg0 - -arg2) * this.field1806 >> 12;
        if (arg1 != 80) {
            this.field1806 = 52;
        }
        int var5 = class289.field4765[(1048156 & var4 * 255) >> 12];
        int var6 = (var5 << 12) / this.field1806;
        int var7 = (var6 << 12) / this.field1809;
        int var8 = this.field1812 * var7 >> 12;
        return var8 > -arg2 + arg0 && -var8 < -arg2 + arg0;
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IB)Lah;")
    public static final class1 method827(int arg0, byte arg1) {
        class1 var2 = (class1) class185.field2958.method99((long) arg0, true);
        ++field1820;
        if (var2 != null) {
            return var2;
        } else {
            if (arg1 >= -21) {
                field1805 = -73;
            }
            byte[] var3 = class160.field2615.method1149(class251.method1831((byte) 90, arg0), (byte) 31, class103.method743(arg0, (byte) -87));
            class1 var4 = new class1();
            var4.field50 = arg0;
            if (var3 != null) {
                var4.method8(new class249(var3), 101);
            }
            var4.method2(false);
            if (var4.field35) {
                var4.field36 = 0;
                var4.field17 = false;
            }
            if (!class96.field1554 && var4.field45) {
                var4.field67 = null;
            }
            class185.field2958.method100((long) arg0, var4, 103);
            return var4;
        }
    }

    @OriginalMember(owner = "client!sl", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        ++field1808;
        if (arg0 != -1) {
            field1826 = null;
        }
        class186.method1346((byte) 28);
    }

    @OriginalMember(owner = "client!sl", name = "a", descriptor = "(IZ[Llb;IBII[B)[I")
    public static final int[] method828(int arg0, boolean arg1, class311[] arg2, int arg3, byte arg4, int arg5, int arg6, byte[] arg7) {
        ++field1814;
        byte var8;
        if (!arg1) {
            var8 = 4;
        } else {
            var8 = 1;
        }
        if (!arg1) {
            for (int var9 = 0; var9 < 4; ++var9) {
                for (int var10 = 0; ~var10 > -65; ++var10) {
                    for (int var11 = 0; ~var11 > -65; ++var11) {
                        if (~(arg0 + var10) < -1 && arg0 + var10 < 103 && ~(arg6 + var11) < -1 && arg6 - -var11 < 103) {
                            arg2[var9].field5006[arg0 + var10][arg6 - -var11] = class15.method84(arg2[var9].field5006[arg0 + var10][arg6 - -var11], -2097153);
                        }
                    }
                }
            }
        }
        if (arg4 != 63) {
            return null;
        } else {
            class249 var12 = new class249(arg7);
            int var13 = arg5 - -arg0;
            int var14 = arg3 - -arg6;
            for (int var15 = 0; ~var15 > ~var8; ++var15) {
                for (int var39 = 0; var39 < 64; ++var39) {
                    for (int var40 = 0; ~var40 > -65; ++var40) {
                        class88.method616(arg6 + var40, var15, var12, 0, (byte) -110, arg0 + var39, var14 + var40, 0, 0, var13 + var39, false, arg1);
                    }
                }
            }
            boolean var16 = false;
            boolean var17 = false;
            while (~var12.field4182.length < ~var12.field4160) {
                int var18 = var12.method1802((byte) 104);
                if (~var18 == -129) {
                    var16 = true;
                    class209.field3537[0] = var12.method1821((byte) 51);
                    class209.field3537[1] = var12.method1762(-1);
                    class209.field3537[2] = var12.method1762(-1);
                    class209.field3537[3] = var12.method1762(class284.method1990(arg4, -64));
                    class209.field3537[4] = var12.method1821((byte) 51);
                } else {
                    if (var18 != 129) {
                        --var12.field4160;
                        break;
                    }
                    for (int var19 = 0; var19 < 4; ++var19) {
                        byte var20 = var12.method1768(arg4 + 29);
                        if (~var20 != -1) {
                            if (var20 == 1) {
                                for (int var21 = 0; ~var21 > -65; var21 += 4) {
                                    for (int var22 = 0; ~var22 > -65; var22 += 4) {
                                        byte var23 = var12.method1768(arg4 ^ 116);
                                        for (int var24 = arg0 + var21; var21 - (-arg0 - 4) > var24; ++var24) {
                                            for (int var25 = arg6 + var22; var25 < var22 - -4 + arg6; ++var25) {
                                                if (~var24 <= -1 && ~var24 > -105 && var25 >= 0 && var25 < 104) {
                                                    class12.field255[var19][var24][var25] = var23;
                                                }
                                            }
                                        }
                                    }
                                }
                            } else if (~var20 == -3 && ~var19 < -1) {
                                int var26 = arg0 + 64;
                                int var27 = arg0;
                                if (~var26 > -1) {
                                    var26 = 0;
                                } else if (~var26 <= -105) {
                                    var26 = 104;
                                }
                                if (arg0 >= 0) {
                                    if (arg0 >= 104) {
                                        var27 = 104;
                                    }
                                } else {
                                    var27 = 0;
                                }
                                int var28 = arg6 + 64;
                                int var29 = arg6;
                                if (~arg6 > -1) {
                                    var29 = 0;
                                } else if (~arg6 <= -105) {
                                    var29 = 104;
                                }
                                if (~var28 <= -1) {
                                    if (~var28 <= -105) {
                                        var28 = 104;
                                    }
                                } else {
                                    var28 = 0;
                                }
                                while (~var27 > ~var26) {
                                    while (~var28 < ~var29) {
                                        class12.field255[var19][var27][var29] = class12.field255[var19 + -1][var27][var29];
                                        ++var29;
                                    }
                                    ++var27;
                                }
                            }
                        } else {
                            int var30 = arg0;
                            if (~arg0 <= -1) {
                                if (arg0 >= 104) {
                                    var30 = 104;
                                }
                            } else {
                                var30 = 0;
                            }
                            int var31 = arg6;
                            if (arg6 < 0) {
                                var31 = 0;
                            } else if (~arg6 <= -105) {
                                var31 = 104;
                            }
                            int var32 = arg6 + 64;
                            if (var32 < 0) {
                                var32 = 0;
                            } else if (var32 >= 104) {
                                var32 = 104;
                            }
                            int var33 = arg0 + 64;
                            if (~var33 > -1) {
                                var33 = 0;
                            } else if (~var33 <= -105) {
                                var33 = 104;
                            }
                            while (~var33 < ~var30) {
                                while (var31 < var32) {
                                    class12.field255[var19][var30][var31] = 0;
                                    ++var31;
                                }
                                ++var30;
                            }
                        }
                    }
                    var17 = true;
                }
            }
            if (!var17) {
                for (int var34 = 0; ~var34 > -5; ++var34) {
                    for (int var35 = 0; var35 < 16; ++var35) {
                        for (int var36 = 0; var36 < 16; ++var36) {
                            int var37 = (arg0 >> 2) + var35;
                            int var38 = (arg6 >> 2) + var36;
                            if (~var37 <= -1 && ~var37 > -27 && ~var38 <= -1 && var38 < 26) {
                                class12.field255[var34][var37][var38] = 0;
                            }
                        }
                    }
                }
            }
            if (var16) {
                return class209.field3537;
            } else {
                return null;
            }
        }
    }
}
