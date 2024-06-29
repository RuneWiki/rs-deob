import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mh")
public class class377 {

    @OriginalMember(owner = "client!mh", name = "e", descriptor = "Z")
    public boolean field5522 = false;

    @OriginalMember(owner = "client!mh", name = "f", descriptor = "I")
    private int field5523 = 0;

    @OriginalMember(owner = "client!mh", name = "o", descriptor = "I")
    private int field5532 = 0;

    @OriginalMember(owner = "client!mh", name = "l", descriptor = "I")
    private int field5529 = 0;

    @OriginalMember(owner = "client!mh", name = "n", descriptor = "I")
    private int field5531 = 128;

    @OriginalMember(owner = "client!mh", name = "w", descriptor = "I")
    private int field5540 = 128;

    @OriginalMember(owner = "client!mh", name = "s", descriptor = "I")
    public int field5536 = -1;

    @OriginalMember(owner = "client!mh", name = "d", descriptor = "Z")
    public boolean field5521 = false;

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "I")
    public int field5519;

    @OriginalMember(owner = "client!mh", name = "c", descriptor = "I")
    public static int field5520;

    @OriginalMember(owner = "client!mh", name = "g", descriptor = "I")
    public static int field5524;

    @OriginalMember(owner = "client!mh", name = "i", descriptor = "I")
    public static int field5526;

    @OriginalMember(owner = "client!mh", name = "j", descriptor = "I")
    public static int field5527;

    @OriginalMember(owner = "client!mh", name = "k", descriptor = "I")
    private int field5528;

    @OriginalMember(owner = "client!mh", name = "m", descriptor = "I")
    public static int field5530;

    @OriginalMember(owner = "client!mh", name = "r", descriptor = "I")
    public static int field5535;

    @OriginalMember(owner = "client!mh", name = "t", descriptor = "I")
    public static int field5537;

    @OriginalMember(owner = "client!mh", name = "v", descriptor = "I")
    public static int field5539;

    @OriginalMember(owner = "client!mh", name = "x", descriptor = "I")
    public static int field5541;

    @OriginalMember(owner = "client!mh", name = "y", descriptor = "I")
    public static int field5542;

    @OriginalMember(owner = "client!mh", name = "h", descriptor = "Lra;")
    public static class57 field5525;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "[S")
    private short[] field5518;

    @OriginalMember(owner = "client!mh", name = "p", descriptor = "[S")
    private short[] field5533;

    @OriginalMember(owner = "client!mh", name = "q", descriptor = "[S")
    private short[] field5534;

    @OriginalMember(owner = "client!mh", name = "u", descriptor = "[S")
    private short[] field5538;

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lbk;IB)V")
    private final void method2368(class211 arg0, int arg1, byte arg2) {
        if (arg2 != -109) {
            this.field5531 = 27;
        }
        if (arg1 == 1) {
            this.field5528 = arg0.method1355(32136);
        } else if (arg1 == 2) {
            this.field5536 = arg0.method1355(32136);
        } else if (arg1 == 4) {
            this.field5540 = arg0.method1355(32136);
        } else if (arg1 == 5) {
            this.field5531 = arg0.method1355(32136);
        } else if (arg1 == 6) {
            this.field5529 = arg0.method1355(arg2 + 32245);
        } else if (arg1 == 7) {
            this.field5523 = arg0.method1342((byte) -128);
        } else if (arg1 == 8) {
            this.field5532 = arg0.method1342((byte) -128);
        } else if (arg1 == 9) {
            this.field5522 = true;
        } else if (arg1 == 10) {
            this.field5521 = true;
        } else if (arg1 == 40) {
            int var4 = arg0.method1342((byte) -127);
            this.field5533 = new short[var4];
            this.field5538 = new short[var4];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field5538[var5] = (short) arg0.method1355(class97.method519(arg2, -32229));
                this.field5533[var5] = (short) arg0.method1355(32136);
            }
        } else if (arg1 == 41) {
            int var6 = arg0.method1342((byte) -126);
            this.field5534 = new short[var6];
            this.field5518 = new short[var6];
            for (int var7 = 0; var7 < var6; var7++) {
                this.field5534[var7] = (short) arg0.method1355(32136);
                this.field5518[var7] = (short) arg0.method1355(32136);
            }
        }
        field5537++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(II)V")
    public static final void method2369(int arg0, int arg1) {
        field5520++;
        class218.field2990 = arg1;
        class331 var2 = class171.field2392;
        synchronized (class171.field2392) {
            class171.field2392.method2043(-21);
        }
        if (arg0 >= -101) {
            method2374((byte) -126, -36);
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(III)Z")
    public static final boolean method2370(int arg0, int arg1, int arg2) {
        int var3 = class30.field275[arg0][arg1][arg2];
        if (-class281.field3953 == var3) {
            return false;
        } else if (class281.field3953 == var3) {
            return true;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            if (class37.method223(var4 + 1, class132.field1814[arg0].method1990(arg1, arg2), var5 + 1) && class37.method223(var4 + 128 - 1, class132.field1814[arg0].method1990(arg1 + 1, arg2), var5 + 1) && class37.method223(var4 + 128 - 1, class132.field1814[arg0].method1990(arg1 + 1, arg2 + 1), var5 + 128 - 1) && class37.method223(var4 + 1, class132.field1814[arg0].method1990(arg1, arg2 + 1), var5 + 128 - 1)) {
                class30.field275[arg0][arg1][arg2] = class281.field3953;
                return true;
            } else {
                class30.field275[arg0][arg1][arg2] = -class281.field3953;
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIB)V")
    public static final void method2371(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        class302.field4301 = arg1;
        class216.field2946 = arg2;
        class1.field9 = arg3;
        field5541++;
        class111.field1284 = arg0;
        if (arg4 != 120) {
            field5525 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(B)J")
    public static final long method2372(byte arg0) {
        field5524++;
        if (arg0 > -20) {
            field5525 = null;
        }
        return class40.field428.method299((byte) -95);
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(BI)V")
    public static final void method2373(byte arg0, int arg1) {
        if (arg0 >= -15) {
            field5525 = null;
        }
        field5535++;
        class348 var2 = class385.method2464(9, 1302, arg1);
        var2.method2214((byte) 121);
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(BI)V")
    public static final void method2374(byte arg0, int arg1) {
        class264.field3708.method2054(114, arg1);
        if (arg0 != -52) {
            field5525 = null;
        }
        field5542++;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(ILen;IIBI)Lmj;")
    public final class393 method2375(int arg0, class174 arg1, int arg2, int arg3, byte arg4, int arg5) {
        field5530++;
        int var7 = arg0;
        class182 var8 = this.field5536 == -1 || arg5 == -1 ? null : class437.method2717(this.field5536, (byte) -103);
        if (var8 != null) {
            var7 = arg0 | var8.method1182(arg5, arg3, false, 128);
        }
        if (this.field5531 != 128) {
            var7 |= 0x2;
        }
        if (arg4 <= 61) {
            this.field5529 = -77;
        }
        if (this.field5540 != 128 || this.field5529 != 0) {
            var7 |= 0x5;
        }
        class331 var9 = class171.field2392;
        class393 var10;
        synchronized (class171.field2392) {
            var10 = (class393) class171.field2392.method2049(-85, (long) (this.field5519 |= arg1.field2424 << 29));
        }
        if (var10 == null || arg1.method1016(var10.method720(), var7) != 0) {
            if (var10 != null) {
                var7 = arg1.method1013(var7, var10.method720());
            }
            int var11 = var7;
            if (this.field5538 != null) {
                var11 = var7 | 0x2000;
            }
            if (this.field5534 != null) {
                var11 |= 0x4000;
            }
            class200 var12 = class38.method227(this.field5528, class6.field64, 0, false);
            if (var12 == null) {
                return null;
            }
            var10 = arg1.method991(var12, var11, class218.field2990, this.field5523 + 64, this.field5532 + 850);
            if (this.field5538 != null) {
                for (int var13 = 0; var13 < this.field5538.length; var13++) {
                    var10.method751(this.field5538[var13], this.field5533[var13]);
                }
            }
            if (this.field5534 != null) {
                for (int var14 = 0; var14 < this.field5534.length; var14++) {
                    var10.method721(this.field5534[var14], this.field5518[var14]);
                }
            }
            var10.method774(var7);
            class331 var15 = class171.field2392;
            synchronized (class171.field2392) {
                class171.field2392.method2046((long) (this.field5519 |= arg1.field2424 << 29), 0, var10);
            }
        }
        class393 var16 = var10.method717((byte) 2, var7, true);
        if (var8 != null) {
            var16 = var8.method1181(arg3, var16, arg2, (byte) 2, 103, 0, var7, arg5);
        }
        if (this.field5540 != 128 || this.field5531 != 128) {
            var16.method736(this.field5540, this.field5531, this.field5540);
        }
        if (this.field5529 != 0) {
            if (this.field5529 == 90) {
                var16.method723(4096);
            }
            if (this.field5529 == 180) {
                var16.method723(8192);
            }
            if (this.field5529 == 270) {
                var16.method723(12288);
            }
        }
        var16.method774(arg0);
        return var16;
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(IIIIIII)V")
    public static final void method2376(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field5539++;
        class420.method2609(arg5, (byte) -74);
        int var7 = arg4;
        int var8 = arg5 - arg1;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg5;
        int var10 = -arg5;
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        if (arg2 >= class20.field209 && class407.field5914 >= arg2) {
            int[] var14 = class318.field4522[arg2];
            int var15 = class115.method640((byte) -98, class128.field1785, arg6 - arg5, class143.field2029);
            int var16 = class115.method640((byte) -98, class128.field1785, arg5 + arg6, class143.field2029);
            int var17 = class115.method640((byte) -87, class128.field1785, arg6 - var8, class143.field2029);
            int var18 = class115.method640((byte) -97, class128.field1785, arg6 + var8, class143.field2029);
            class105.method564(arg0, var15, 0, var14, var17);
            class105.method564(arg3, var17, 0, var14, var18);
            class105.method564(arg0, var18, 0, var14, var16);
        }
        int var19 = -1;
        while (var7 < var9) {
            var19 += 2;
            var13 += 2;
            var12 += var19;
            var10 += var13;
            if (var12 >= 0 && var11 >= 1) {
                var11--;
                class299.field4267[var11] = var7;
                var12 -= var11 << 1;
            }
            var7++;
            if (var10 >= 0) {
                var9--;
                var10 -= var9 << 1;
                int var20 = arg2 - var9;
                int var21 = arg2 + var9;
                if (var21 >= class20.field209 && var20 <= class407.field5914) {
                    if (var9 >= var8) {
                        int var22 = class115.method640((byte) -82, class128.field1785, arg6 + var7, class143.field2029);
                        int var23 = class115.method640((byte) -64, class128.field1785, arg6 - var7, class143.field2029);
                        if (var21 <= class407.field5914) {
                            class105.method564(arg0, var23, 0, class318.field4522[var21], var22);
                        }
                        if (class20.field209 <= var20) {
                            class105.method564(arg0, var23, arg4, class318.field4522[var20], var22);
                        }
                    } else {
                        int var24 = class299.field4267[var9];
                        int var25 = class115.method640((byte) -104, class128.field1785, arg6 + var7, class143.field2029);
                        int var26 = class115.method640((byte) -125, class128.field1785, arg6 - var7, class143.field2029);
                        int var27 = class115.method640((byte) -91, class128.field1785, arg6 + var24, class143.field2029);
                        int var28 = class115.method640((byte) -127, class128.field1785, arg6 - var24, class143.field2029);
                        if (class407.field5914 >= var21) {
                            int[] var29 = class318.field4522[var21];
                            class105.method564(arg0, var26, 0, var29, var28);
                            class105.method564(arg3, var28, 0, var29, var27);
                            class105.method564(arg0, var27, arg4, var29, var25);
                        }
                        if (class20.field209 <= var20) {
                            int[] var30 = class318.field4522[var20];
                            class105.method564(arg0, var26, 0, var30, var28);
                            class105.method564(arg3, var28, 0, var30, var27);
                            class105.method564(arg0, var27, 0, var30, var25);
                        }
                    }
                }
            }
            int var31 = arg2 - var7;
            int var32 = arg2 + var7;
            if (var32 >= class20.field209 && class407.field5914 >= var31) {
                int var33 = arg6 + var9;
                int var34 = arg6 - var9;
                if (var33 >= class143.field2029 && var34 <= class128.field1785) {
                    int var35 = class115.method640((byte) -78, class128.field1785, var33, class143.field2029);
                    int var36 = class115.method640((byte) -69, class128.field1785, var34, class143.field2029);
                    if (var8 <= var7) {
                        if (class407.field5914 >= var32) {
                            class105.method564(arg0, var36, 0, class318.field4522[var32], var35);
                        }
                        if (var31 >= class20.field209) {
                            class105.method564(arg0, var36, 0, class318.field4522[var31], var35);
                        }
                    } else {
                        int var37 = var7 > var11 ? class299.field4267[var7] : var11;
                        int var38 = class115.method640((byte) -102, class128.field1785, arg6 + var37, class143.field2029);
                        int var39 = class115.method640((byte) -99, class128.field1785, arg6 - var37, class143.field2029);
                        if (class407.field5914 >= var32) {
                            int[] var40 = class318.field4522[var32];
                            class105.method564(arg0, var36, 0, var40, var39);
                            class105.method564(arg3, var39, 0, var40, var38);
                            class105.method564(arg0, var38, arg4, var40, var35);
                        }
                        if (class20.field209 <= var31) {
                            int[] var41 = class318.field4522[var31];
                            class105.method564(arg0, var36, 0, var41, var39);
                            class105.method564(arg3, var39, 0, var41, var38);
                            class105.method564(arg0, var38, 0, var41, var35);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!mh", name = "b", descriptor = "(B)V")
    public static void method2377(byte arg0) {
        field5525 = null;
        if (arg0 != 87) {
            field5525 = null;
        }
    }

    @OriginalMember(owner = "client!mh", name = "a", descriptor = "(Lbk;I)V")
    public final void method2378(class211 arg0, int arg1) {
        field5527++;
        if (arg1 != 8238) {
            return;
        }
        while (true) {
            int var3 = arg0.method1342((byte) -126);
            if (var3 == 0) {
                return;
            }
            this.method2368(arg0, var3, (byte) -109);
        }
    }
}
