import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class69 extends class99 {

    @OriginalMember(owner = "client!pi", name = "V", descriptor = "I")
    private int field1378 = 1024;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    private int field1380 = 2048;

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    private int field1383 = 1024;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    private int field1385 = 0;

    @OriginalMember(owner = "client!pi", name = "R", descriptor = "I")
    private int field1374 = 1024;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    private int field1384 = 819;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    private int field1382 = 1024;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    private int field1392 = 0;

    @OriginalMember(owner = "client!pi", name = "lb", descriptor = "I")
    private int field1394 = 409;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "Lr;")
    public static class66 field1388 = class93.method641(43, "<img=0>");

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "Lr;")
    public static class66 field1387 = class93.method641(43, "floorshadows");

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "[[B")
    public static byte[][] field1391 = new byte[50][];

    @OriginalMember(owner = "client!pi", name = "W", descriptor = "Lqc;")
    public static class245 field1379 = new class245(64);

    @OriginalMember(owner = "client!pi", name = "ob", descriptor = "I")
    public static int field1397 = -1;

    @OriginalMember(owner = "client!pi", name = "rb", descriptor = "I")
    public static int field1400 = 0;

    @OriginalMember(owner = "client!pi", name = "sb", descriptor = "I")
    public static int field1401 = 0;

    @OriginalMember(owner = "client!pi", name = "tb", descriptor = "[Lr;")
    public static class66[] field1402 = new class66[100];

    @OriginalMember(owner = "client!pi", name = "qb", descriptor = "F")
    public static float field1399;

    @OriginalMember(owner = "client!pi", name = "Q", descriptor = "I")
    public static int field1373;

    @OriginalMember(owner = "client!pi", name = "S", descriptor = "I")
    public static int field1375;

    @OriginalMember(owner = "client!pi", name = "T", descriptor = "I")
    public static int field1376;

    @OriginalMember(owner = "client!pi", name = "U", descriptor = "I")
    public static int field1377;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field1381;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field1386;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field1389;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    public static int field1390;

    @OriginalMember(owner = "client!pi", name = "kb", descriptor = "I")
    private int field1393;

    @OriginalMember(owner = "client!pi", name = "mb", descriptor = "I")
    public static int field1395;

    @OriginalMember(owner = "client!pi", name = "nb", descriptor = "I")
    public static int field1396;

    @OriginalMember(owner = "client!pi", name = "pb", descriptor = "Llb;")
    public static class228 field1398;

    @OriginalMember(owner = "client!pi", name = "g", descriptor = "(I)I")
    public static final int method501(int arg0) {
        if (arg0 != 0) {
            return 29;
        } else {
            ++field1381;
            return 16;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Llh;II)V")
    public final void method11(class249 arg0, int arg1, int arg2) {
        ++field1396;
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 != -3) {
                    if (~arg1 != -4) {
                        if (arg1 != 4) {
                            if (arg1 != 5) {
                                if (arg1 != 6) {
                                    if (arg1 != 7) {
                                        if (arg1 == 8) {
                                            this.field1383 = arg0.method1674(1355769544);
                                        }
                                    } else {
                                        this.field1378 = arg0.method1674(1355769544);
                                    }
                                } else {
                                    this.field1385 = arg0.method1677(-6677);
                                }
                            } else {
                                this.field1382 = arg0.method1674(arg2 ^ -1355769545);
                            }
                        } else {
                            this.field1384 = arg0.method1674(1355769544);
                        }
                    } else {
                        this.field1394 = arg0.method1674(arg2 ^ -1355769545);
                    }
                } else {
                    this.field1380 = arg0.method1674(1355769544);
                }
            } else {
                this.field1374 = arg0.method1674(1355769544);
            }
        } else {
            this.field1392 = arg0.method1677(-6677);
        }
        if (arg2 != -1) {
            method504(-128, 32, 28, -22, -29, (byte) -27);
        }
    }

    @OriginalMember(owner = "client!pi", name = "h", descriptor = "(I)V")
    public static void method502(int arg0) {
        field1387 = null;
        field1398 = null;
        field1379 = null;
        field1391 = null;
        field1402 = null;
        if (arg0 != 128) {
            field1397 = -101;
        }
        field1388 = null;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IZLha;)V")
    public static final void method503(int arg0, boolean arg1, class63 arg2) {
        ++field1386;
        int var3 = arg2.field1211 == 0 ? arg2.field1215 : arg2.field1211;
        int var4 = arg2.field1117 == 0 ? arg2.field1196 : arg2.field1117;
        class217.method1398(arg2.field1115, var4, arg1, false, var3, class31.field466[arg2.field1115 >> 16]);
        if (arg2.field1092 != null) {
            class217.method1398(arg2.field1115, var4, arg1, false, var3, arg2.field1092);
        }
        class75 var5 = (class75) class230.field3981.method1381((long) arg2.field1115, -78);
        if (var5 != null) {
            class48.method342((byte) 99, var4, arg1, var3, var5.field1492);
        }
        if (arg0 != -1) {
            method507(28, (byte[]) null, 33, -95);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIIIB)V")
    public static final void method504(int arg0, int arg1, int arg2, int arg3, int arg4, byte arg5) {
        if (arg0 <= class222.field3788 && ~class241.field4186 >= ~arg3) {
            boolean var6;
            if (~class165.field2972 >= ~arg4) {
                if (~class215.field3706 <= ~arg4) {
                    var6 = true;
                } else {
                    arg4 = class215.field3706;
                    var6 = false;
                }
            } else {
                var6 = false;
                arg4 = class165.field2972;
            }
            boolean var7;
            if (arg1 < class165.field2972) {
                arg1 = class165.field2972;
                var7 = false;
            } else if (~arg1 >= ~class215.field3706) {
                var7 = true;
            } else {
                arg1 = class215.field3706;
                var7 = false;
            }
            if (~arg0 > ~class241.field4186) {
                arg0 = class241.field4186;
            } else {
                class194.method1266(arg1, (byte) -17, arg2, class15.field183[arg0++], arg4);
            }
            if (class222.field3788 < arg3) {
                arg3 = class222.field3788;
            } else {
                class194.method1266(arg1, (byte) -17, arg2, class15.field183[arg3--], arg4);
            }
            if (var7 && var6) {
                for (int var8 = arg0; ~arg3 <= ~var8; ++var8) {
                    int[] var9 = class15.field183[var8];
                    var9[arg1] = var9[arg4] = arg2;
                }
            } else if (!var7) {
                if (var6) {
                    for (int var10 = arg0; var10 <= arg3; ++var10) {
                        class15.field183[var10][arg4] = arg2;
                    }
                }
            } else {
                for (int var11 = arg0; var11 <= arg3; ++var11) {
                    class15.field183[var11][arg1] = arg2;
                }
            }
        }
        ++field1395;
        if (arg5 < 82) {
            method505(28, -10, -23, 0);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIII)Z")
    public static final boolean method505(int arg0, int arg1, int arg2, int arg3) {
        if (!class28.method158(arg0, arg1, arg2)) {
            return false;
        } else {
            int var4 = arg1 << 7;
            int var5 = arg2 << 7;
            int var6 = class30.field453[arg0][arg1][arg2] - 1;
            int var7 = var6 - 120;
            int var8 = var6 - 230;
            int var9 = var6 - 238;
            if (arg3 < 16) {
                if (arg3 == 1) {
                    if (var4 > class171.field3036) {
                        if (!class230.method1504(var4, var6, var5)) {
                            return false;
                        }
                        if (!class230.method1504(var4, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class230.method1504(var4, var7, var5)) {
                            return false;
                        }
                        if (!class230.method1504(var4, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class230.method1504(var4, var8, var5)) {
                        return false;
                    }
                    if (!class230.method1504(var4, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 2) {
                    if (var5 < class30.field455) {
                        if (!class230.method1504(var4, var6, var5 + 128)) {
                            return false;
                        }
                        if (!class230.method1504(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class230.method1504(var4, var7, var5 + 128)) {
                            return false;
                        }
                        if (!class230.method1504(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class230.method1504(var4, var8, var5 + 128)) {
                        return false;
                    }
                    if (!class230.method1504(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 4) {
                    if (var4 < class171.field3036) {
                        if (!class230.method1504(var4 + 128, var6, var5)) {
                            return false;
                        }
                        if (!class230.method1504(var4 + 128, var6, var5 + 128)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class230.method1504(var4 + 128, var7, var5)) {
                            return false;
                        }
                        if (!class230.method1504(var4 + 128, var7, var5 + 128)) {
                            return false;
                        }
                    }
                    if (!class230.method1504(var4 + 128, var8, var5)) {
                        return false;
                    }
                    if (!class230.method1504(var4 + 128, var8, var5 + 128)) {
                        return false;
                    }
                    return true;
                }
                if (arg3 == 8) {
                    if (var5 > class30.field455) {
                        if (!class230.method1504(var4, var6, var5)) {
                            return false;
                        }
                        if (!class230.method1504(var4 + 128, var6, var5)) {
                            return false;
                        }
                    }
                    if (arg0 > 0) {
                        if (!class230.method1504(var4, var7, var5)) {
                            return false;
                        }
                        if (!class230.method1504(var4 + 128, var7, var5)) {
                            return false;
                        }
                    }
                    if (!class230.method1504(var4, var8, var5)) {
                        return false;
                    }
                    if (!class230.method1504(var4 + 128, var8, var5)) {
                        return false;
                    }
                    return true;
                }
            }
            if (!class230.method1504(var4 + 64, var9, var5 + 64)) {
                return false;
            } else if (arg3 == 16) {
                return class230.method1504(var4, var8, var5 + 128);
            } else if (arg3 == 32) {
                return class230.method1504(var4 + 128, var8, var5 + 128);
            } else if (arg3 == 64) {
                return class230.method1504(var4 + 128, var8, var5);
            } else if (arg3 == 128) {
                return class230.method1504(var4, var8, var5);
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/util/Random;II[[IIII)V")
    private final void method506(Random arg0, int arg1, int arg2, int[][] arg3, int arg4, int arg5, int arg6) {
        ++field1389;
        int var8 = ~this.field1383 < -1 ? 4096 + -class256.method1717(this.field1383, (byte) 70, arg0) : 4096;
        if (arg6 != 1) {
            field1397 = -98;
        }
        int var9 = this.field1393 * this.field1378 >> 12;
        int var10 = this.field1393 + -(var9 <= 0 ? 0 : class256.method1717(var9, (byte) 70, arg0));
        if (arg4 >= class199.field3432) {
            arg4 -= class199.field3432;
        }
        if (~var10 < -1) {
            if (~arg5 < -1 && ~arg2 < -1) {
                int var11 = arg2 / 2;
                int var12 = arg5 / 2;
                int var13 = ~var10 >= ~var11 ? var10 : var11;
                int var14 = var12 >= var10 ? var10 : var12;
                int var15 = arg4 - -var13;
                int var16 = -(var13 * 2) + arg2;
                for (int var17 = 0; ~var17 > ~arg5; ++var17) {
                    int[] var18 = arg3[var17 - -arg1];
                    if (var17 < var14) {
                        int var19 = var8 * var17 / var14;
                        if (~this.field1385 == -1) {
                            for (int var20 = 0; ~var13 < ~var20; ++var20) {
                                int var21 = var8 * var20 / var13;
                                var18[class115.method767(class98.field1914, arg4 + var20)] = var18[class115.method767(arg4 - -arg2 + -1 - var20, class98.field1914)] = var19 * var21 >> 12;
                            }
                        } else {
                            for (int var22 = 0; var22 < var13; ++var22) {
                                int var24 = var8 * var22 / var13;
                                var18[class115.method767(arg4 + var22, class98.field1914)] = var18[class115.method767(arg4 - (var22 - -1) + arg2, class98.field1914)] = var24 >= var19 ? var19 : var24;
                            }
                        }
                        if (~class199.field3432 > ~(var15 - -var16)) {
                            int var23 = class199.field3432 - var15;
                            class46.method330(var18, var15, var23, var19);
                            class46.method330(var18, 0, -var23 + var16, var19);
                        } else {
                            class46.method330(var18, var15, var16, var19);
                        }
                    } else {
                        int var25 = -var17 + arg5 + -1;
                        if (var14 > var25) {
                            int var26 = var8 * var25 / var14;
                            if (this.field1385 != 0) {
                                for (int var27 = 0; ~var13 < ~var27; ++var27) {
                                    int var28 = var8 * var27 / var13;
                                    var18[class115.method767(class98.field1914, arg4 + var27)] = var18[class115.method767(class98.field1914, arg2 + arg4 + -var27 + -1)] = var26 <= var28 ? var26 : var28;
                                }
                            } else {
                                for (int var29 = 0; ~var13 < ~var29; ++var29) {
                                    int var31 = var8 * var29 / var13;
                                    var18[class115.method767(class98.field1914, arg4 - -var29)] = var18[class115.method767(-var29 + arg4 - (-arg2 + 1), class98.field1914)] = var26 * var31 >> 12;
                                }
                            }
                            if (~class199.field3432 > ~(var15 + var16)) {
                                int var30 = -var15 + class199.field3432;
                                class46.method330(var18, var15, var30, var26);
                                class46.method330(var18, 0, -var30 + var16, var26);
                            } else {
                                class46.method330(var18, var15, var16, var26);
                            }
                        } else {
                            for (int var32 = 0; var13 > var32; ++var32) {
                                var18[class115.method767(class98.field1914, arg4 + var32)] = var18[class115.method767(class98.field1914, -var32 + -1 + arg4 + arg2)] = var8 * var32 / var13;
                            }
                            if (~(var15 - -var16) >= ~class199.field3432) {
                                class46.method330(var18, var15, var16, var8);
                            } else {
                                int var33 = -var15 + class199.field3432;
                                class46.method330(var18, var15, var33, var8);
                                class46.method330(var18, 0, var16 - var33, var8);
                            }
                        }
                    }
                }
            }
        } else if (~(arg2 + arg4) >= ~class199.field3432) {
            for (int var34 = 0; ~var34 > ~arg5; ++var34) {
                class46.method330(arg3[arg1 - -var34], arg4, arg2, var8);
            }
        } else {
            int var35 = -arg4 + class199.field3432;
            for (int var36 = 0; arg5 > var36; ++var36) {
                int[] var37 = arg3[arg1 + var36];
                class46.method330(var37, arg4, var35, var8);
                class46.method330(var37, 0, -var35 + arg2, var8);
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(I[BII)Lr;")
    public static final class66 method507(int arg0, byte[] arg1, int arg2, int arg3) {
        ++field1390;
        class66 var4 = new class66();
        var4.field1283 = new byte[arg0];
        var4.field1308 = 0;
        for (int var5 = arg3; ~(arg0 + arg3) < ~var5; ++var5) {
            if (~arg1[var5] != -1) {
                var4.field1283[var4.field1308++] = arg1[var5];
            }
        }
        if (arg2 < 36) {
            field1401 = -90;
        }
        return var4;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class69() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pi", name = "b", descriptor = "(IZ)V")
    public static final void method508(int arg0, boolean arg1) {
        ++field1376;
        if (~(class207.field3595.field2077 >> 7) == ~class32.field481 && ~(class207.field3595.field2053 >> 7) == ~class72.field1426) {
            class32.field481 = 0;
        }
        int var2 = client.field1650;
        if (arg1) {
            var2 = 1;
        }
        for (int var3 = 0; var2 > var3; ++var3) {
            class45 var4;
            long var5;
            if (!arg1) {
                var4 = class59.field988[class192.field3335[var3]];
                var5 = (long) class192.field3335[var3] << 32;
            } else {
                var5 = 8791798054912L;
                var4 = class207.field3595;
            }
            if (var4 != null && var4.method204(101)) {
                var4.field825 = false;
                if ((class66.field1277 && client.field1650 > 200 || client.field1650 > 50) && !arg1 && var4.field2046 == var4.field2040) {
                    var4.field825 = true;
                }
                int var7 = var4.field2077 >> 7;
                int var8 = var4.field2053 >> 7;
                if (~var7 <= -1 && var7 < 104 && ~var8 <= -1 && ~var8 > -105) {
                    if (var4.field812 != null && ~var4.field813 >= ~class75.field1501 && ~var4.field840 < ~class75.field1501) {
                        var4.field825 = false;
                        var4.field2098 = class45.method327(var4.field2077, class196.field3401, var4.field2053, false);
                        class201.method1305(class196.field3401, var4.field2077, var4.field2053, var4.field2098, var4, var4.field2064, var5, var4.field834, var4.field839, var4.field809, var4.field820);
                    } else {
                        if (var4.field2060 == 1 && (127 & var4.field2077) == 64 && ~(var4.field2053 & 127) == -65) {
                            if (~class127.field2372[var7][var8] == ~class214.field3683) {
                                continue;
                            }
                            class127.field2372[var7][var8] = class214.field3683;
                        }
                        var4.field2098 = class45.method327(var4.field2077, class196.field3401, var4.field2053, false);
                        class159.method1084(class196.field3401, var4.field2077, var4.field2053, var4.field2098, (var4.field2060 - 1) * 64 - -60, var4, var4.field2064, var5, var4.field2099);
                    }
                }
            }
        }
        if (arg0 != 64) {
            field1401 = -94;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)[I")
    public final int[] method10(byte arg0, int arg1) {
        ++field1375;
        int[] var3 = super.field1943.method749(false, arg1);
        if (super.field1943.field2147) {
            int var4 = 0;
            int[][] var5 = super.field1943.method748(-32044);
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class199.field3432 * this.field1374 >> 12;
            int var15 = class199.field3432 * this.field1380 >> 12;
            int var16 = class16.field223 * this.field1384 >> 12;
            int var17 = class16.field223 * this.field1394 >> 12;
            if (var16 <= 1) {
                return var5[arg1];
            }
            this.field1393 = class199.field3432 / 8 * this.field1382 >> 12;
            int var18 = class199.field3432 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field1392);
            label125: while (true) {
                while (true) {
                    int var22 = class256.method1717(-var14 + var15, (byte) 70, var21) + var14;
                    int var23 = var9 + var22;
                    int var24 = class256.method1717(-var17 + var16, (byte) 70, var21) + var17;
                    if (~var23 < ~class199.field3432) {
                        var22 = -var9 + class199.field3432;
                        var23 = class199.field3432;
                    }
                    int var25;
                    if (var11) {
                        var25 = 0;
                    } else {
                        int var26 = var7;
                        int[] var27 = var20[var7];
                        var25 = var27[2];
                        int var28 = 0;
                        int var29 = var4 + var23;
                        if (var29 < 0) {
                            var29 += class199.field3432;
                        }
                        if (class199.field3432 < var29) {
                            var29 -= class199.field3432;
                        }
                        while (true) {
                            int[] var30 = var20[var26];
                            if (~var29 <= ~var30[0] && ~var29 >= ~var30[1]) {
                                if (~var7 != ~var26) {
                                    int var31 = var9 - -var4;
                                    if (~var31 > -1) {
                                        var31 += class199.field3432;
                                    }
                                    if (class199.field3432 < var31) {
                                        var31 -= class199.field3432;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var28; ++var32) {
                                        int[] var40 = var20[(var7 + var32) % var12];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var28 <= ~var33; ++var33) {
                                        int[] var34 = var20[(var7 - -var33) % var12];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var31 > ~var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (~var36 != -1) {
                                                var38 = Math.max(var31, var36);
                                                var39 = class199.field3432;
                                            } else {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            }
                                            this.method506(var21, var35, -var38 + var39, var5, var8 + var38, -var35 + var25, 1);
                                        }
                                    }
                                }
                                var7 = var26;
                                break;
                            }
                            ++var28;
                            ++var26;
                            if (var26 >= var12) {
                                var26 = 0;
                            }
                        }
                    }
                    if (var24 + var25 <= class16.field223) {
                        var10 = false;
                    } else {
                        var24 = -var25 + class16.field223;
                    }
                    if (~class199.field3432 == ~var23) {
                        this.method506(var21, var25, var22, var5, var6 + var9, var24, 1);
                        if (var10) {
                            break label125;
                        }
                        var11 = false;
                        int[] var41 = var19[var13++];
                        var10 = true;
                        var41[2] = var24 + var25;
                        var41[0] = var9;
                        var8 = var6;
                        var41[1] = var23;
                        int[][] var42 = var20;
                        var7 = 0;
                        var12 = var13;
                        var13 = 0;
                        var20 = var19;
                        var9 = 0;
                        var6 = class256.method1717(class199.field3432, (byte) 70, var21);
                        var19 = var42;
                        var4 = var6 - var8;
                        int var43 = var4;
                        if (~var4 > -1) {
                            var43 = class199.field3432 + var4;
                        }
                        if (class199.field3432 < var43) {
                            var43 -= class199.field3432;
                        }
                        while (true) {
                            int[] var44 = var20[var7];
                            if (var43 >= var44[0] && ~var43 >= ~var44[1]) {
                                break;
                            }
                            ++var7;
                            if (var7 >= var12) {
                                var7 = 0;
                            }
                        }
                    } else {
                        int[] var45 = var19[var13++];
                        var45[1] = var23;
                        var45[2] = var24 + var25;
                        var45[0] = var9;
                        this.method506(var21, var25, var22, var5, var6 + var9, var24, 1);
                        var9 = var23;
                    }
                }
            }
        }
        if (arg0 != -61) {
            method508(-113, true);
        }
        return var3;
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(B)V")
    public final void method12(byte arg0) {
        ++field1373;
        if (arg0 >= -22) {
            method504(-109, 82, 75, -110, -79, (byte) -79);
        }
    }
}
