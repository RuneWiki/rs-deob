import java.awt.Component;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eh")
public class class84 extends class198 {

    @OriginalMember(owner = "client!eh", name = "M", descriptor = "I")
    private int field1317 = 0;

    @OriginalMember(owner = "client!eh", name = "L", descriptor = "I")
    private int field1316 = 0;

    @OriginalMember(owner = "client!eh", name = "V", descriptor = "I")
    private int field1326 = 1024;

    @OriginalMember(owner = "client!eh", name = "X", descriptor = "I")
    private int field1328 = 1024;

    @OriginalMember(owner = "client!eh", name = "T", descriptor = "I")
    private int field1324 = 409;

    @OriginalMember(owner = "client!eh", name = "P", descriptor = "I")
    private int field1320 = 1024;

    @OriginalMember(owner = "client!eh", name = "R", descriptor = "I")
    private int field1322 = 1024;

    @OriginalMember(owner = "client!eh", name = "U", descriptor = "I")
    private int field1325 = 2048;

    @OriginalMember(owner = "client!eh", name = "Z", descriptor = "I")
    private int field1330 = 819;

    @OriginalMember(owner = "client!eh", name = "bb", descriptor = "Ljava/lang/String;")
    public static String field1332 = "Cancel";

    @OriginalMember(owner = "client!eh", name = "K", descriptor = "Lec;")
    public static class25 field1315 = new class25(200);

    @OriginalMember(owner = "client!eh", name = "cb", descriptor = "I")
    public static int field1333 = 0;

    @OriginalMember(owner = "client!eh", name = "I", descriptor = "I")
    public static int field1313;

    @OriginalMember(owner = "client!eh", name = "J", descriptor = "I")
    public static int field1314;

    @OriginalMember(owner = "client!eh", name = "N", descriptor = "I")
    public static int field1318;

    @OriginalMember(owner = "client!eh", name = "O", descriptor = "I")
    public static int field1319;

    @OriginalMember(owner = "client!eh", name = "Q", descriptor = "I")
    public static int field1321;

    @OriginalMember(owner = "client!eh", name = "S", descriptor = "I")
    public static int field1323;

    @OriginalMember(owner = "client!eh", name = "W", descriptor = "I")
    public static int field1327;

    @OriginalMember(owner = "client!eh", name = "Y", descriptor = "I")
    public static int field1329;

    @OriginalMember(owner = "client!eh", name = "ab", descriptor = "I")
    private int field1331;

    @OriginalMember(owner = "client!eh", name = "db", descriptor = "I")
    public static int field1334;

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ZI)[I")
    public final int[] method32(boolean arg0, int arg1) {
        int[] var3 = super.field3134.method36(arg1, 30672);
        if (!arg0) {
            this.field1317 = 88;
        }
        ++field1327;
        if (super.field3134.field69) {
            int var4 = 0;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            boolean var8 = true;
            int var9 = 0;
            boolean var10 = true;
            int[][] var11 = super.field3134.method35(-17218);
            int var12 = 0;
            int var13 = 0;
            int var14 = class42.field590 * this.field1325 >> 12;
            int var15 = class42.field590 * this.field1328 >> 12;
            int var16 = class258.field4243 * this.field1324 >> 12;
            int var17 = class258.field4243 * this.field1330 >> 12;
            if (~var17 >= -2) {
                return var11[arg1];
            } else {
                this.field1331 = class42.field590 / 8 * this.field1326 >> 12;
                int var18 = class42.field590 / var15 + 1;
                int[][] var19 = new int[var18][3];
                Random var20 = new Random((long) this.field1316);
                int[][] var21 = new int[var18][3];
                while (true) {
                    while (true) {
                        int var22 = class79.method524(var14 - var15, 97, var20) + var15;
                        int var23 = var5 + var22;
                        int var24 = class79.method524(-var16 + var17, 55, var20) + var16;
                        if (~class42.field590 > ~var23) {
                            var23 = class42.field590;
                            var22 = -var5 + class42.field590;
                        }
                        int var10000;
                        int var26;
                        if (var10) {
                            var26 = 0;
                        } else {
                            int[] var25 = var19[var7];
                            var26 = var25[2];
                            int var27 = var7;
                            int var28 = 0;
                            int var29 = var6 + var23;
                            if (var29 < 0) {
                                var29 += class42.field590;
                            }
                            if (~var29 < ~class42.field590) {
                                var29 -= class42.field590;
                            }
                            while (true) {
                                int[] var30 = var19[var27];
                                if (var30[0] <= var29 && ~var30[1] <= ~var29) {
                                    if (var7 != var27) {
                                        int var31 = var5 - -var6;
                                        if (~var31 > -1) {
                                            var31 += class42.field590;
                                        }
                                        if (~class42.field590 > ~var31) {
                                            var31 -= class42.field590;
                                        }
                                        for (int var32 = 1; ~var28 <= ~var32; ++var32) {
                                            int[] var40 = var19[(var7 - -var32) % var12];
                                            var26 = Math.max(var26, var40[2]);
                                        }
                                        for (int var33 = 0; var28 >= var33; ++var33) {
                                            int[] var34 = var19[(var7 + var33) % var12];
                                            int var35 = var34[2];
                                            if (~var26 != ~var35) {
                                                int var36 = var34[0];
                                                int var37 = var34[1];
                                                int var38;
                                                int var39;
                                                if (~var29 >= ~var31) {
                                                    if (var36 == 0) {
                                                        var38 = Math.min(var29, var37);
                                                        var39 = 0;
                                                    } else {
                                                        var39 = Math.max(var31, var36);
                                                        var38 = class42.field590;
                                                    }
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = Math.min(var29, var37);
                                                }
                                                this.method567(var4 + var39, var11, 0, var35, -var35 + var26, var20, -var39 + var38);
                                            }
                                        }
                                    }
                                    var7 = var27;
                                    break;
                                }
                                var10000 = ~var12;
                                ++var27;
                                if (var10000 >= ~var27) {
                                    var27 = 0;
                                }
                                ++var28;
                            }
                        }
                        if (~(var24 + var26) >= ~class258.field4243) {
                            var8 = false;
                        } else {
                            var24 = class258.field4243 - var26;
                        }
                        if (class42.field590 != var23) {
                            int[] var41 = var21[var13++];
                            var41[2] = var24 + var26;
                            var41[1] = var23;
                            var41[0] = var5;
                            this.method567(var5 + var9, var11, 0, var26, var24, var20, var22);
                            var5 = var23;
                        } else {
                            this.method567(var5 + var9, var11, 0, var26, var24, var20, var22);
                            if (var8) {
                                return var3;
                            }
                            var10 = false;
                            var8 = true;
                            var7 = 0;
                            int[][] var42 = var19;
                            var19 = var21;
                            int[] var43 = var21[var13++];
                            var4 = var9;
                            var43[0] = var5;
                            var43[2] = var24 + var26;
                            var5 = 0;
                            var21 = var42;
                            var12 = var13;
                            var43[1] = var23;
                            var13 = 0;
                            var9 = class79.method524(class42.field590, 99, var20);
                            var6 = -var4 + var9;
                            int var44 = var6;
                            if (var6 < 0) {
                                var44 = class42.field590 + var6;
                            }
                            if (~var44 < ~class42.field590) {
                                var44 -= class42.field590;
                            }
                            while (true) {
                                int[] var45 = var19[var7];
                                if (~var44 <= ~var45[0] && ~var44 >= ~var45[1]) {
                                    break;
                                }
                                var10000 = ~var12;
                                ++var7;
                                if (var10000 >= ~var7) {
                                    var7 = 0;
                                }
                            }
                        }
                    }
                }
            }
        } else {
            return var3;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(Ljava/awt/Component;IILgj;I)Lek;")
    public static final class173 method561(Component arg0, int arg1, int arg2, class255 arg3, int arg4) {
        ++field1319;
        if (~class131.field2018 == -1) {
            throw new IllegalStateException();
        } else if (arg2 >= 0 && ~arg2 > -3) {
            if (arg1 < 256) {
                arg1 = 256;
            }
            try {
                class173 var5 = (class173) Class.forName("me").newInstance();
                var5.field2710 = arg1;
                if (arg4 != -24998) {
                    method562(52, -6, 55, (byte) 29, 72, -35, -69, 114);
                }
                var5.field2695 = new int[(class287.field4787 ? 2 : 1) * 256];
                var5.method907(arg0);
                var5.field2706 = (-1024 & arg1) + 1024;
                if (var5.field2706 > 16384) {
                    var5.field2706 = 16384;
                }
                var5.method910(var5.field2706);
                if (~class309.field5005 < -1 && class275.field4558 == null) {
                    class275.field4558 = new class304();
                    class275.field4558.field4960 = arg3;
                    arg3.method1777(class309.field5005, class275.field4558, arg4 + 25000);
                }
                if (class275.field4558 != null) {
                    if (class275.field4558.field4959[arg2] != null) {
                        throw new IllegalArgumentException();
                    }
                    class275.field4558.field4959[arg2] = var5;
                }
                return var5;
            } catch (Throwable var8) {
                try {
                    class136 var6 = new class136(arg3, arg2);
                    var6.field2695 = new int[(class287.field4787 ? 2 : 1) * 256];
                    var6.field2710 = arg1;
                    var6.method907(arg0);
                    var6.field2706 = 16384;
                    var6.method910(var6.field2706);
                    if (class309.field5005 > 0 && class275.field4558 == null) {
                        class275.field4558 = new class304();
                        class275.field4558.field4960 = arg3;
                        arg3.method1777(class309.field5005, class275.field4558, arg4 + 25000);
                    }
                    if (class275.field4558 != null) {
                        if (class275.field4558.field4959[arg2] != null) {
                            throw new IllegalArgumentException();
                        }
                        class275.field4558.field4959[arg2] = var6;
                    }
                    return var6;
                } catch (Throwable var7) {
                    return new class173();
                }
            }
        } else {
            throw new IllegalArgumentException();
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIBIIII)V")
    public static final void method562(int arg0, int arg1, int arg2, byte arg3, int arg4, int arg5, int arg6, int arg7) {
        ++field1318;
        class34.method198(-10479, arg7, arg2, arg0, arg4, arg1, 0, arg6, arg5);
        if (arg3 != 67) {
            field1332 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(IIIII[[[B[I[I[I[I[IIBII)V")
    public static final void method563(int arg0, int arg1, int arg2, int arg3, int arg4, byte[][][] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int arg11, byte arg12, int arg13, int arg14) {
        if (arg0 < 0) {
            arg0 = 0;
        } else if (arg0 >= class183.field2835 * 128) {
            arg0 = class183.field2835 * 128 - 1;
        }
        if (arg2 < 0) {
            arg2 = 0;
        } else if (arg2 >= class90.field1391 * 128) {
            arg2 = class90.field1391 * 128 - 1;
        }
        class48.field663 = class172.field2669[arg3];
        class55.field746 = class172.field2658[arg3];
        class57.field781 = class172.field2669[arg4];
        class71.field1034 = class172.field2658[arg4];
        class160.field2527 = arg0;
        class60.field925 = arg1;
        class60.field927 = arg2;
        class111.field1690 = arg0 / 128;
        class100.field1512 = arg2 / 128;
        class152.field2376 = class111.field1690 - class35.field448;
        if (class152.field2376 < 0) {
            class152.field2376 = 0;
        }
        class151.field2348 = class100.field1512 - class35.field448;
        if (class151.field2348 < 0) {
            class151.field2348 = 0;
        }
        class287.field4788 = class35.field448 + class111.field1690;
        if (class287.field4788 > class183.field2835) {
            class287.field4788 = class183.field2835;
        }
        class79.field1249 = class35.field448 + class100.field1512;
        if (class79.field1249 > class90.field1391) {
            class79.field1249 = class90.field1391;
        }
        short var15 = 3500;
        for (int var16 = 0; var16 < class35.field448 + class35.field448 + 2; ++var16) {
            for (int var19 = 0; var19 < class35.field448 + class35.field448 + 2; ++var19) {
                int var20 = (var16 - class35.field448 << 7) - (class160.field2527 & 127);
                int var21 = (var19 - class35.field448 << 7) - (class60.field927 & 127);
                int var22 = class111.field1690 - class35.field448 + var16;
                int var23 = class100.field1512 - class35.field448 + var19;
                if (var22 >= 0 && var23 >= 0 && var22 < class183.field2835 && var23 < class90.field1391) {
                    int var24;
                    if (class304.field4965 != null) {
                        var24 = class304.field4965[0][var22][var23] - class60.field925 + 128;
                    } else {
                        var24 = class277.field4583[0][var22][var23] - class60.field925 + 128;
                    }
                    int var25 = class277.field4583[3][var22][var23] - class60.field925 - 1000;
                    class187.field2893[var16][var19] = class87.method574(var20, var25, var24, var21, var15);
                } else {
                    class187.field2893[var16][var19] = false;
                }
            }
        }
        for (int var17 = 0; var17 < class35.field448 + class35.field448 + 1; ++var17) {
            for (int var18 = 0; var18 < class35.field448 + class35.field448 + 1; ++var18) {
                class2.field12[var17][var18] = class187.field2893[var17][var18] || class187.field2893[var17 + 1][var18] || class187.field2893[var17][var18 + 1] || class187.field2893[var17 + 1][var18 + 1];
            }
        }
        class25.field326 = arg6;
        class284.field4748 = arg7;
        class178.field2764 = arg8;
        class271.field4442 = arg9;
        class106.field1587 = arg10;
        class139.method928();
        if (class114.field1727 != null) {
            class274.method1909(true);
            class134.method901(arg0, arg1, arg2, (byte[][][]) null, 0, (byte) 0, arg13, arg14);
            class274.method1909(false);
        }
        class134.method901(arg0, arg1, arg2, arg5, arg11, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!eh", name = "<init>", descriptor = "()V")
    public class84() {
        super(0, true);
    }

    @OriginalMember(owner = "client!eh", name = "g", descriptor = "(I)V")
    public static void method564(int arg0) {
        field1332 = null;
        field1315 = null;
        if (arg0 != 0) {
            field1315 = null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "b", descriptor = "(III)Ltf;")
    public static final class114 method565(int arg0, int arg1, int arg2) {
        if (arg1 >= 0 && arg1 < class183.field2835 && arg2 >= 0 && arg2 < class90.field1391) {
            class154 var3 = class27.field346[arg0][arg1][arg2];
            if (var3 == null) {
                return null;
            } else {
                class114 var4 = null;
                int var5 = -1;
                int var6 = -1;
                for (int var7 = 0; var7 < var3.field2431; ++var7) {
                    class114 var8 = var3.field2418[var7];
                    if ((var8.field1712 >> 29 & 3L) <= 1L && var8.field1724 == arg1 && var8.field1719 == arg2 && (var8.field1715 > var5 || var8.field1714 > var6)) {
                        var4 = var8;
                        var5 = var8.field1715;
                        var6 = var8.field1714;
                    }
                }
                return var4;
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!eh", name = "h", descriptor = "(I)Z")
    public static final boolean method566(int arg0) {
        if (arg0 != 0) {
            return true;
        } else {
            ++field1329;
            if (class119.field1836) {
                try {
                    class291.method2038("showVideoAd", 20042, class259.field4254.field4211);
                    return true;
                } catch (Throwable var1) {
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!eh", name = "c", descriptor = "(B)V")
    public final void method142(byte arg0) {
        ++field1314;
        int var2 = -111 % ((arg0 - -46) / 47);
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(I[[IIIILjava/util/Random;I)V")
    private final void method567(int arg0, int[][] arg1, int arg2, int arg3, int arg4, Random arg5, int arg6) {
        ++field1313;
        int var8 = this.field1320 <= 0 ? 4096 : -class79.method524(this.field1320, 96, arg5) + 4096;
        int var9 = this.field1331 * this.field1322 >> 12;
        int var10 = this.field1331 - (arg2 >= var9 ? 0 : class79.method524(var9, 45, arg5));
        if (arg0 >= class42.field590) {
            arg0 -= class42.field590;
        }
        if (~var10 >= -1) {
            if (class42.field590 >= arg0 + arg6) {
                for (int var11 = 0; arg4 > var11; ++var11) {
                    class158.method1050(arg1[arg3 + var11], arg0, arg6, var8);
                }
            } else {
                int var12 = class42.field590 - arg0;
                for (int var13 = 0; ~arg4 < ~var13; ++var13) {
                    int[] var14 = arg1[arg3 + var13];
                    class158.method1050(var14, arg0, var12, var8);
                    class158.method1050(var14, 0, -var12 + arg6, var8);
                }
            }
        } else if (arg4 > 0 && ~arg6 < -1) {
            int var15 = arg6 / 2;
            int var16 = arg4 / 2;
            int var17 = var15 < var10 ? var15 : var10;
            int var18 = var10 <= var16 ? var10 : var16;
            int var19 = arg0 + var17;
            int var20 = arg6 - var17 * 2;
            for (int var21 = 0; ~arg4 < ~var21; ++var21) {
                int[] var22 = arg1[arg3 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (~this.field1317 != -1) {
                        for (int var24 = 0; ~var17 < ~var24; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class10.method53(class227.field3594, arg0 - -var24)] = var22[class10.method53(class227.field3594, -var24 + -1 + arg0 + arg6)] = var25 < var23 ? var25 : var23;
                        }
                    } else {
                        for (int var26 = 0; ~var17 < ~var26; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class10.method53(class227.field3594, arg0 + var26)] = var22[class10.method53(arg0 + -1 + arg6 + -var26, class227.field3594)] = var23 * var28 >> 12;
                        }
                    }
                    if (var19 + var20 > class42.field590) {
                        int var27 = -var19 + class42.field590;
                        class158.method1050(var22, var19, var27, var23);
                        class158.method1050(var22, 0, -var27 + var20, var23);
                    } else {
                        class158.method1050(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg4 + -1 - var21;
                    if (~var29 > ~var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field1317 != -1) {
                            for (int var31 = 0; ~var17 < ~var31; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class10.method53(class227.field3594, arg0 + var31)] = var22[class10.method53(class227.field3594, -var31 + arg0 - 1 + arg6)] = var30 <= var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class10.method53(class227.field3594, arg0 + var33)] = var22[class10.method53(-var33 + arg6 + arg0 + -1, class227.field3594)] = var30 * var35 >> 12;
                            }
                        }
                        if (class42.field590 >= var19 + var20) {
                            class158.method1050(var22, var19, var20, var30);
                        } else {
                            int var34 = -var19 + class42.field590;
                            class158.method1050(var22, var19, var34, var30);
                            class158.method1050(var22, 0, -var34 + var20, var30);
                        }
                    } else {
                        for (int var36 = 0; var36 < var17; ++var36) {
                            var22[class10.method53(arg0 + var36, class227.field3594)] = var22[class10.method53(arg0 + arg6 - (var36 - -1), class227.field3594)] = var8 * var36 / var17;
                        }
                        if (~class42.field590 <= ~(var19 + var20)) {
                            class158.method1050(var22, var19, var20, var8);
                        } else {
                            int var37 = class42.field590 - var19;
                            class158.method1050(var22, var19, var37, var8);
                            class158.method1050(var22, 0, -var37 + var20, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!eh", name = "a", descriptor = "(ILma;I)V")
    public final void method52(int arg0, class202 arg1, int arg2) {
        int var4 = 47 % ((60 - arg0) / 61);
        if (~arg2 != -1) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (~arg2 != -6) {
                                if (arg2 != 6) {
                                    if (~arg2 != -8) {
                                        if (arg2 == 8) {
                                            this.field1320 = arg1.method1419(126);
                                        }
                                    } else {
                                        this.field1322 = arg1.method1419(84);
                                    }
                                } else {
                                    this.field1317 = arg1.method1420((byte) 0);
                                }
                            } else {
                                this.field1326 = arg1.method1419(67);
                            }
                        } else {
                            this.field1330 = arg1.method1419(89);
                        }
                    } else {
                        this.field1324 = arg1.method1419(101);
                    }
                } else {
                    this.field1325 = arg1.method1419(101);
                }
            } else {
                this.field1328 = arg1.method1419(66);
            }
        } else {
            this.field1316 = arg1.method1420((byte) 0);
        }
        ++field1321;
    }
}
