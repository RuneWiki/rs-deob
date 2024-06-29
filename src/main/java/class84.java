import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!p")
public class class84 extends class115 {

    @OriginalMember(owner = "client!p", name = "L", descriptor = "I")
    private int field1293 = 1024;

    @OriginalMember(owner = "client!p", name = "Q", descriptor = "I")
    private int field1296 = 3072;

    @OriginalMember(owner = "client!p", name = "X", descriptor = "I")
    private int field1303 = 2048;

    @OriginalMember(owner = "client!p", name = "K", descriptor = "Ljava/lang/String;")
    public static String field1292 = null;

    @OriginalMember(owner = "client!p", name = "S", descriptor = "Lha;")
    public static class267 field1298 = null;

    @OriginalMember(owner = "client!p", name = "W", descriptor = "Lb;")
    public static class51 field1302 = new class51(0, 0);

    @OriginalMember(owner = "client!p", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field1306 = "Please remove ";

    @OriginalMember(owner = "client!p", name = "Z", descriptor = "Ljl;")
    public static class231 field1305 = new class231(16);

    @OriginalMember(owner = "client!p", name = "J", descriptor = "I")
    public static int field1291;

    @OriginalMember(owner = "client!p", name = "M", descriptor = "I")
    public static int field1294;

    @OriginalMember(owner = "client!p", name = "O", descriptor = "I")
    public static int field1295;

    @OriginalMember(owner = "client!p", name = "R", descriptor = "I")
    public static int field1297;

    @OriginalMember(owner = "client!p", name = "T", descriptor = "I")
    public static int field1299;

    @OriginalMember(owner = "client!p", name = "U", descriptor = "I")
    public static int field1300;

    @OriginalMember(owner = "client!p", name = "V", descriptor = "I")
    public static int field1301;

    @OriginalMember(owner = "client!p", name = "Y", descriptor = "I")
    public static int field1304;

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(ILkl;I)V")
    public final void method168(int arg0, class114 arg1, int arg2) {
        if (arg0 != -1) {
            field1306 = null;
        }
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 == 2) {
                    super.field1713 = ~arg1.method760(false) == -2;
                }
            } else {
                this.field1296 = arg1.method756(arg0 ^ 29900);
            }
        } else {
            this.field1293 = arg1.method756(-29901);
        }
        ++field1294;
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(I)V")
    public static void method563(int arg0) {
        field1302 = null;
        field1298 = null;
        if (arg0 == -1) {
            field1305 = null;
            field1292 = null;
            field1306 = null;
        }
    }

    @OriginalMember(owner = "client!p", name = "e", descriptor = "(II)[I")
    public final int[] method116(int arg0, int arg1) {
        if (arg0 != 242152972) {
            method563(69);
        }
        int[] var3 = super.field1705.method463(arg1, false);
        if (super.field1705.field1072) {
            int[] var4 = this.method797(0, arg1, -91);
            for (int var5 = 0; ~class77.field1178 < ~var5; ++var5) {
                var3[var5] = this.field1293 - -(var4[var5] * this.field1303 >> 12);
            }
        }
        ++field1295;
        return var3;
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lkl;B)V")
    public static final void method564(class114 arg0, byte arg1) {
        int var2 = class158.field2289 >> 2 << 10;
        ++field1301;
        int var3 = class135.field1959 >> 1;
        byte[][] var4 = new byte[class99.field1482][class63.field1009];
        while (~arg0.field1673 > ~arg0.field1629.length) {
            boolean var34 = false;
            int var35 = 0;
            int var36 = 0;
            if (arg0.method760(false) == 1) {
                var36 = arg0.method760(false);
                var35 = arg0.method760(false);
                var34 = true;
            }
            int var37 = arg0.method760(false);
            int var38 = arg0.method760(false);
            int var39 = var37 * 64 + -class212.field3040;
            int var40 = class54.field828 - var38 * 64 + class63.field1009 + -1;
            if (var39 >= 0 && ~(var40 + -63) <= -1 && var39 + 63 < class99.field1482 && class63.field1009 > var40) {
                for (int var41 = 0; ~var41 > -65; ++var41) {
                    byte[] var42 = var4[var39 - -var41];
                    for (int var43 = 0; var43 < 64; ++var43) {
                        if (!var34 || var41 >= var36 * 8 && ~var41 > ~(var36 * 8 - -8) && ~var43 <= ~(var35 * 8) && var35 * 8 + 8 > var43) {
                            var42[-var43 + var40] = arg0.method741(3083);
                        }
                    }
                }
            } else if (var34) {
                arg0.field1673 += 64;
            } else {
                arg0.field1673 += 4096;
            }
        }
        int var5 = class63.field1009;
        int var6 = class99.field1482;
        int[] var7 = new int[var5];
        int[] var8 = new int[var5];
        int[] var9 = new int[var5];
        int[] var10 = new int[var5];
        int[] var11 = new int[var5];
        int var12 = -68 / ((arg1 - -62) / 41);
        for (int var13 = -5; var6 > var13; ++var13) {
            for (int var14 = 0; var14 < var5; ++var14) {
                int var28 = var13 + 5;
                int var10002;
                if (~var6 < ~var28) {
                    int var29 = var4[var28][var14] & 255;
                    if (~var29 < -1) {
                        class279 var30 = class152.method1031(var29 - 1, (byte) -4);
                        var7[var14] += var30.field4463;
                        var8[var14] += var30.field4448;
                        var9[var14] += var30.field4461;
                        var11[var14] += var30.field4456;
                        var10002 = var10[var14]++;
                    }
                }
                int var31 = var13 + -5;
                if (var31 >= 0) {
                    int var32 = var4[var31][var14] & 255;
                    if (~var32 < -1) {
                        class279 var33 = class152.method1031(var32 + -1, (byte) -4);
                        var7[var14] -= var33.field4463;
                        var8[var14] -= var33.field4448;
                        var9[var14] -= var33.field4461;
                        var11[var14] -= var33.field4456;
                        var10002 = var10[var14]--;
                    }
                }
            }
            if (~var13 <= -1) {
                int[][] var15 = class120.field1757[var13 >> 6];
                int var16 = 0;
                int var17 = 0;
                int var18 = 0;
                int var19 = 0;
                int var20 = 0;
                for (int var21 = -5; var21 < var5; ++var21) {
                    int var22 = var21 - -5;
                    if (~var22 > ~var5) {
                        var19 += var10[var22];
                        var20 += var11[var22];
                        var18 += var9[var22];
                        var16 += var7[var22];
                        var17 += var8[var22];
                    }
                    int var23 = var21 - 5;
                    if (~var23 <= -1) {
                        var18 -= var9[var23];
                        var19 -= var10[var23];
                        var17 -= var8[var23];
                        var20 -= var11[var23];
                        var16 -= var7[var23];
                    }
                    if (var21 >= 0 && ~var19 < -1) {
                        int[] var24 = var15[var21 >> 6];
                        int var25 = var20 == 0 ? 0 : class95.method643(2, var16 * 256 / var20, var18 / var19, var17 / var19);
                        if (var4[var13][var21] == 0) {
                            if (var24 != null) {
                                var24[class184.method1188(var21 << 6, 4032) + class184.method1188(var13, 63)] = 0;
                            }
                        } else {
                            if (var24 == null) {
                                var24 = var15[var21 >> 6] = new int[4096];
                            }
                            int var26 = (var25 & 127) - -var3;
                            if (~var26 > -1) {
                                var26 = 0;
                            } else if (var26 > 127) {
                                var26 = 127;
                            }
                            int var27 = (896 & var25) + ((64512 & var2 + var25) - -var26);
                            var24[class184.method1188(var13, 63) + (class184.method1188(63, var21) << 6)] = class18.field260[class275.method1852(96, var27, 54)];
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "b", descriptor = "(B)V")
    public final void method170(byte arg0) {
        ++field1304;
        this.field1303 = -this.field1293 + this.field1296;
        int var2 = -2 / ((78 - arg0) / 42);
    }

    @OriginalMember(owner = "client!p", name = "f", descriptor = "(I)V")
    public static final void method565(int arg0) {
        class204.field2966 = arg0;
        for (int var1 = 0; var1 < class90.field1372; ++var1) {
            for (int var2 = 0; var2 < class225.field3383; ++var2) {
                if (class16.field233[arg0][var1][var2] == null) {
                    class16.field233[arg0][var1][var2] = new class131(arg0, var1, var2);
                }
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "a", descriptor = "(Lqb;IIIIII)V")
    public static final void method566(class86 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        if (~arg3 == -1) {
            var7 = class155.method1052(arg5, arg2, arg4);
        } else if (arg3 == 1) {
            var7 = class25.method188(arg5, arg2, arg4);
        } else if (~arg3 != -3) {
            if (~arg3 == -4) {
                var7 = class24.method176(arg5, arg2, arg4);
            }
        } else {
            var7 = class161.method1079(arg5, arg2, arg4);
        }
        ++field1300;
        boolean var9 = true;
        if (arg1 != -30923) {
            field1298 = null;
        }
        boolean var10 = false;
        int var11 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        int var12 = 31 & (int) var7 >> 14;
        boolean var13 = false;
        int var14 = (3840571 & (int) var7) >> 20;
        class250 var15 = class91.method618(113, var11);
        if (var15.method1646((byte) -118)) {
            class245.method1603(arg5, arg2, var15, arg4, (byte) -54);
        }
        if (~var7 != -1L) {
            if (~arg3 != -1) {
                if (arg3 == 1) {
                    class170.method1120(arg5, arg2, arg4);
                } else if (arg3 != 2) {
                    if (~arg3 == -4) {
                        class170.method1126(arg5, arg2, arg4);
                        if (var15.field3820 == 1) {
                            arg0.method579(arg2, arg4, (byte) -82);
                        }
                    }
                } else {
                    class89.method600(arg5, arg2, arg4);
                    if (~var15.field3820 != -1 && var15.field3821 + arg2 < 104 && ~(var15.field3821 + arg4) > -105 && ~(arg2 - -var15.field3808) > -105 && ~(var15.field3808 + arg4) > -105) {
                        arg0.method585(arg2, var15.field3754, var15.field3808, arg4, var15.field3821, -90, var14);
                    }
                }
            } else {
                class283.method1907(arg5, arg2, arg4);
                if (~var15.field3820 != -1) {
                    arg0.method587(var15.field3754, var14, arg2, var12, (byte) 29, arg4);
                }
            }
            if (var15.field3817 != null) {
                class250 var20 = var15.method1639(-1);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!p", name = "<init>", descriptor = "()V")
    public class84() {
        super(1, false);
    }

    @OriginalMember(owner = "client!p", name = "c", descriptor = "(II)[[I")
    public final int[][] method235(int arg0, int arg1) {
        if (arg0 >= -33) {
            return null;
        } else {
            ++field1297;
            int[][] var3 = super.field1716.method6(arg1, (byte) 50);
            if (super.field1716.field23) {
                int[][] var4 = this.method798(0, 0, arg1);
                int[] var5 = var4[0];
                int[] var6 = var4[1];
                int[] var7 = var4[2];
                int[] var8 = var3[0];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class77.field1178 < ~var11; ++var11) {
                    var8[var11] = (var5[var11] * this.field1303 >> 12) + this.field1293;
                    var9[var11] = (var6[var11] * this.field1303 >> 12) + this.field1293;
                    var10[var11] = (var7[var11] * this.field1303 >> 12) + this.field1293;
                }
            }
            return var3;
        }
    }
}
