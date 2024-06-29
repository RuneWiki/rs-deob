import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pi")
public class class136 extends class123 {

    @OriginalMember(owner = "client!pi", name = "ab", descriptor = "I")
    private int field2442 = 0;

    @OriginalMember(owner = "client!pi", name = "Z", descriptor = "I")
    private int field2441 = 2048;

    @OriginalMember(owner = "client!pi", name = "jb", descriptor = "I")
    private int field2451 = 1024;

    @OriginalMember(owner = "client!pi", name = "fb", descriptor = "I")
    private int field2447 = 1024;

    @OriginalMember(owner = "client!pi", name = "nb", descriptor = "I")
    private int field2455 = 819;

    @OriginalMember(owner = "client!pi", name = "cb", descriptor = "I")
    private int field2444 = 1024;

    @OriginalMember(owner = "client!pi", name = "ob", descriptor = "I")
    private int field2456 = 1024;

    @OriginalMember(owner = "client!pi", name = "sb", descriptor = "I")
    private int field2460 = 0;

    @OriginalMember(owner = "client!pi", name = "hb", descriptor = "I")
    private int field2449 = 409;

    @OriginalMember(owner = "client!pi", name = "X", descriptor = "I")
    public static int field2439;

    @OriginalMember(owner = "client!pi", name = "Y", descriptor = "I")
    public static int field2440;

    @OriginalMember(owner = "client!pi", name = "bb", descriptor = "I")
    public static int field2443;

    @OriginalMember(owner = "client!pi", name = "db", descriptor = "I")
    public static int field2445;

    @OriginalMember(owner = "client!pi", name = "eb", descriptor = "I")
    public static int field2446;

    @OriginalMember(owner = "client!pi", name = "gb", descriptor = "I")
    public static int field2448;

    @OriginalMember(owner = "client!pi", name = "ib", descriptor = "I")
    public static int field2450;

    @OriginalMember(owner = "client!pi", name = "kb", descriptor = "I")
    public static int field2452;

    @OriginalMember(owner = "client!pi", name = "lb", descriptor = "I")
    public static int field2453;

    @OriginalMember(owner = "client!pi", name = "mb", descriptor = "I")
    public static int field2454;

    @OriginalMember(owner = "client!pi", name = "qb", descriptor = "I")
    private int field2458;

    @OriginalMember(owner = "client!pi", name = "rb", descriptor = "I")
    public static int field2459;

    @OriginalMember(owner = "client!pi", name = "pb", descriptor = "Loh;")
    public static class261 field2457;

    @OriginalMember(owner = "client!pi", name = "e", descriptor = "(II)V")
    public static final void method1048(int arg0, int arg1) {
        class68.field1279 = new int[arg1];
        class9.field162 = new int[arg1];
        class177.field3112 = new int[arg1];
        class232.field4037 = new int[arg1];
        class190.field3356 = new int[arg1];
        if (arg0 != -694336564) {
            method1052(29, 53, -105, (class260) null, 11);
        }
        ++field2450;
    }

    @OriginalMember(owner = "client!pi", name = "f", descriptor = "(II)V")
    public static final void method1049(int arg0, int arg1) {
        ++field2440;
        class160.field2858 = -1;
        if (arg1 < 66) {
            field2457 = null;
        }
        class149.field2671 = arg0;
        class68.field1270 = -1;
        class38.method343(120);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(BI)V")
    public static final void method1050(byte arg0, int arg1) {
        ++field2439;
        if (arg0 > -90) {
            field2445 = -39;
        }
        if (class173.field3058 == 0) {
            class210.field3663.method451(-716317374, arg1);
        } else {
            class168.field2975 = arg1;
        }
    }

    @OriginalMember(owner = "client!pi", name = "c", descriptor = "(I)V")
    public final void method257(int arg0) {
        if (arg0 == 0) {
            ++field2453;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(Ljava/util/Random;III[[III)V")
    private final void method1051(Random arg0, int arg1, int arg2, int arg3, int[][] arg4, int arg5, int arg6) {
        int var8 = arg5 >= this.field2456 ? 4096 : 4096 + -class51.method413(arg0, this.field2456, Integer.MIN_VALUE);
        int var9 = this.field2458 * this.field2451 >> 12;
        int var10 = this.field2458 + -(~var9 >= -1 ? 0 : class51.method413(arg0, var9, arg5 + Integer.MIN_VALUE));
        if (class140.field2505 <= arg2) {
            arg2 -= class140.field2505;
        }
        ++field2454;
        if (~var10 >= -1) {
            if (class140.field2505 < arg1 + arg2) {
                int var11 = class140.field2505 - arg2;
                for (int var12 = 0; ~arg3 < ~var12; ++var12) {
                    int[] var13 = arg4[arg6 + var12];
                    class43.method373(var13, arg2, var11, var8);
                    class43.method373(var13, 0, -var11 + arg1, var8);
                }
            } else {
                for (int var14 = 0; var14 < arg3; ++var14) {
                    class43.method373(arg4[arg6 + var14], arg2, arg1, var8);
                }
            }
        } else if (~arg3 < -1 && ~arg1 < -1) {
            int var15 = arg3 / 2;
            int var16 = arg1 / 2;
            int var17 = var10 > var15 ? var15 : var10;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = -(var18 * 2) + arg1;
            int var20 = arg2 + var18;
            for (int var21 = 0; ~var21 > ~arg3; ++var21) {
                int[] var22 = arg4[arg6 + var21];
                if (var17 > var21) {
                    int var23 = var8 * var21 / var17;
                    if (~this.field2460 != -1) {
                        for (int var24 = 0; var24 < var18; ++var24) {
                            int var25 = var8 * var24 / var18;
                            var22[class189.method1350(arg2 - -var24, class217.field3743)] = var22[class189.method1350(class217.field3743, arg2 - -arg1 - 1 + -var24)] = var23 <= var25 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var18 > var26; ++var26) {
                            int var28 = var8 * var26 / var18;
                            var22[class189.method1350(arg2 + var26, class217.field3743)] = var22[class189.method1350(class217.field3743, arg2 - var26 + arg1 + -1)] = var23 * var28 >> 12;
                        }
                    }
                    if (~class140.field2505 > ~(var20 - -var19)) {
                        int var27 = -var20 + class140.field2505;
                        class43.method373(var22, var20, var27, var23);
                        class43.method373(var22, 0, -var27 + var19, var23);
                    } else {
                        class43.method373(var22, var20, var19, var23);
                    }
                } else {
                    int var29 = arg3 + -1 + -var21;
                    if (~var17 < ~var29) {
                        int var30 = var8 * var29 / var17;
                        if (~this.field2460 != -1) {
                            for (int var31 = 0; ~var31 > ~var18; ++var31) {
                                int var32 = var8 * var31 / var18;
                                var22[class189.method1350(arg2 - -var31, class217.field3743)] = var22[class189.method1350(arg2 - var31 - 1 + arg1, class217.field3743)] = var32 >= var30 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; ~var33 > ~var18; ++var33) {
                                int var35 = var8 * var33 / var18;
                                var22[class189.method1350(arg2 + var33, class217.field3743)] = var22[class189.method1350(arg1 + arg2 + -var33 - 1, class217.field3743)] = var30 * var35 >> 12;
                            }
                        }
                        if (~class140.field2505 <= ~(var19 + var20)) {
                            class43.method373(var22, var20, var19, var30);
                        } else {
                            int var34 = -var20 + class140.field2505;
                            class43.method373(var22, var20, var34, var30);
                            class43.method373(var22, 0, var19 - var34, var30);
                        }
                    } else {
                        for (int var36 = 0; var18 > var36; ++var36) {
                            var22[class189.method1350(arg2 + var36, class217.field3743)] = var22[class189.method1350(class217.field3743, arg1 + arg2 + -1 + -var36)] = var8 * var36 / var18;
                        }
                        if (var20 - -var19 <= class140.field2505) {
                            class43.method373(var22, var20, var19, var8);
                        } else {
                            int var37 = -var20 + class140.field2505;
                            class43.method373(var22, var20, var37, var8);
                            class43.method373(var22, 0, -var37 + var19, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIILtj;I)V")
    public static final void method1052(int arg0, int arg1, int arg2, class260 arg3, int arg4) {
        ++field2448;
        if (class56.field1033 != arg3) {
            if (class186.field3266 < 400) {
                class230 var10;
                if (~arg3.field4621 == -1) {
                    boolean var5 = true;
                    if (class56.field1033.field4616 != -1 && ~arg3.field4616 != 0) {
                        int var6 = class56.field1033.field4602 > arg3.field4602 ? class56.field1033.field4602 : arg3.field4602;
                        int var7 = arg3.field4616 > class56.field1033.field4616 ? class56.field1033.field4616 : arg3.field4616;
                        int var8 = var6 * 10 / 100 + 5 - -var7;
                        int var9 = -arg3.field4602 + class56.field1033.field4602;
                        if (var9 < 0) {
                            var9 = -var9;
                        }
                        if (var8 < var9) {
                            var5 = false;
                        }
                    }
                    if (arg3.field4602 < arg3.field4619) {
                        var10 = class173.method1267((byte) 59, new class230[] { arg3.method1806((byte) -111), !var5 ? class209.field3658 : class56.method473(-12053, arg3.field4602, class56.field1033.field4602), class114.field2036, class183.field3211, class37.method340(arg3.field4602, (byte) -26), class123.field2153, class37.method340(arg3.field4619 - arg3.field4602, (byte) -26), class145.field2606 });
                    } else {
                        var10 = class173.method1267((byte) 59, new class230[] { arg3.method1806((byte) 77), !var5 ? class209.field3658 : class56.method473(-12053, arg3.field4602, class56.field1033.field4602), class114.field2036, class183.field3211, class37.method340(arg3.field4602, (byte) -26), class145.field2606 });
                    }
                } else {
                    var10 = class173.method1267((byte) 59, new class230[] { arg3.method1806((byte) -127), class114.field2036, class47.field829, class37.method340(arg3.field4621, (byte) -26), class145.field2606 });
                }
                if (~class196.field3513 == -2) {
                    ++class70.field1286;
                    class160.method1208(class173.method1267((byte) 59, new class230[] { class153.field2730, class259.field4586, var10 }), (long) arg2, -6600, class275.field4832, arg0, arg4, (short) 58);
                } else if (!class184.field3231) {
                    for (int var11 = 7; ~var11 <= -1; --var11) {
                        if (class85.field1494[var11] != null) {
                            short var12 = 0;
                            if (class144.field2580 == 0 && class85.field1494[var11].method1612((byte) 15, class88.field1535)) {
                                if (class56.field1033.field4602 < arg3.field4602) {
                                    var12 = 2000;
                                }
                                if (class56.field1033.field4603 != 0 && arg3.field4603 != 0) {
                                    if (~class56.field1033.field4603 == ~arg3.field4603) {
                                        var12 = 2000;
                                    } else {
                                        var12 = 0;
                                    }
                                }
                            } else if (class72.field1314[var11]) {
                                var12 = 2000;
                            }
                            ++class207.field3638;
                            boolean var13 = false;
                            short var14 = class270.field4779[var11];
                            short var15 = (short) (var12 + var14);
                            class160.method1208(class173.method1267((byte) 59, new class230[] { class209.field3658, var10 }), (long) arg2, -6600, class85.field1494[var11], arg0, arg4, var15);
                        }
                    }
                } else if ((8 & class138.field2475) == 8) {
                    ++class243.field4167;
                    class160.method1208(class173.method1267((byte) 59, new class230[] { class44.field792, class259.field4586, var10 }), (long) arg2, -6600, class68.field1275, arg0, arg4, (short) 50);
                }
                for (int var16 = arg1; class186.field3266 > var16; ++var16) {
                    if (~class225.field3890[var16] == -17) {
                        class192.field3388[var16] = class173.method1267((byte) 59, new class230[] { class209.field3658, var10 });
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(ILfk;I)V")
    public final void method6(int arg0, class14 arg1, int arg2) {
        ++field2446;
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (arg0 != 6) {
                                    if (~arg0 != -8) {
                                        if (arg0 == 8) {
                                            this.field2456 = arg1.method161(4);
                                        }
                                    } else {
                                        this.field2451 = arg1.method161(4);
                                    }
                                } else {
                                    this.field2460 = arg1.method200(arg2 ^ 1876195635);
                                }
                            } else {
                                this.field2444 = arg1.method161(arg2 + -1876195784);
                            }
                        } else {
                            this.field2455 = arg1.method161(4);
                        }
                    } else {
                        this.field2449 = arg1.method161(arg2 + -1876195784);
                    }
                } else {
                    this.field2441 = arg1.method161(4);
                }
            } else {
                this.field2447 = arg1.method161(arg2 + -1876195784);
            }
        } else {
            this.field2442 = arg1.method200(255);
        }
        if (arg2 != 1876195788) {
            this.field2442 = 108;
        }
    }

    @OriginalMember(owner = "client!pi", name = "d", descriptor = "(B)V")
    public static void method1053(byte arg0) {
        field2457 = null;
        if (arg0 > -99) {
            method1048(-16, -16);
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IBI)V")
    public static final void method1054(int arg0, byte arg1, int arg2) {
        ++field2459;
        int var3 = -42 % ((arg1 - 32) / 48);
        class197 var4 = class164.method1228(5, arg0, -1665874464);
        var4.method1402((byte) -102);
        var4.field3527 = arg2;
    }

    @OriginalMember(owner = "client!pi", name = "<init>", descriptor = "()V")
    public class136() {
        super(0, true);
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IIIII)Z")
    public static final boolean method1055(int arg0, int arg1, int arg2, int arg3, int arg4) {
        int var5 = class261.field4642 * arg0 + class21.field427 * arg3 >> 16;
        int var6 = class261.field4642 * arg3 - class21.field427 * arg0 >> 16;
        int var7 = class47.field831 * arg1 + class15.field354 * var6 >> 16;
        int var8 = class15.field354 * arg1 - class47.field831 * var6 >> 16;
        if (var7 < 1) {
            var7 = 1;
        }
        int var9 = (var5 << 9) / var7;
        int var10 = (var8 << 9) / var7;
        int var11 = class47.field831 * arg2 + class15.field354 * var6 >> 16;
        int var12 = class15.field354 * arg2 - class47.field831 * var6 >> 16;
        if (var11 < 1) {
            var11 = 1;
        }
        int var13 = (var5 << 9) / var11;
        int var14 = (var12 << 9) / var11;
        if (var7 < 50 && var11 < 50) {
            return false;
        } else if (var7 > arg4 && var11 > arg4) {
            return false;
        } else if (var9 < class1.field8 && var13 < class1.field8) {
            return false;
        } else if (var9 > class149.field2668 && var13 > class149.field2668) {
            return false;
        } else if (var10 < class108.field1947 && var14 < class108.field1947) {
            return false;
        } else {
            return var10 <= class150.field2674 || var14 <= class150.field2674;
        }
    }

    @OriginalMember(owner = "client!pi", name = "a", descriptor = "(IB)[I")
    public final int[] method4(int arg0, byte arg1) {
        ++field2443;
        int[] var3 = super.field2160.method1323((byte) -94, arg0);
        if (super.field2160.field3243) {
            int var4 = 0;
            int var5 = 0;
            int[][] var6 = super.field2160.method1319(0);
            int var7 = 0;
            int var8 = 0;
            boolean var9 = true;
            int var10 = 0;
            int var11 = 0;
            boolean var12 = true;
            int var13 = 0;
            int var14 = class140.field2505 * this.field2447 >> 12;
            int var15 = class255.field4540 * this.field2449 >> 12;
            int var16 = class140.field2505 * this.field2441 >> 12;
            int var17 = class255.field4540 * this.field2455 >> 12;
            if (var17 <= 1) {
                return var6[arg0];
            }
            this.field2458 = class140.field2505 / 8 * this.field2444 >> 12;
            int var18 = class140.field2505 / var14 + 1;
            int[][] var19 = new int[var18][3];
            Random var20 = new Random((long) this.field2442);
            int[][] var21 = new int[var18][3];
            label120: while (true) {
                while (true) {
                    int var22 = var14 - -class51.method413(var20, -var14 + var16, Integer.MIN_VALUE);
                    int var23 = class51.method413(var20, -var15 + var17, Integer.MIN_VALUE) + var15;
                    int var24 = var8 + var22;
                    if (class140.field2505 < var24) {
                        var24 = class140.field2505;
                        var22 = -var8 + class140.field2505;
                    }
                    int var25;
                    if (var9) {
                        var25 = 0;
                    } else {
                        int[] var26 = var21[var10];
                        int var27 = 0;
                        var25 = var26[2];
                        int var28 = var10;
                        int var29 = var4 + var24;
                        if (var29 < 0) {
                            var29 += class140.field2505;
                        }
                        if (~var29 < ~class140.field2505) {
                            var29 -= class140.field2505;
                        }
                        while (true) {
                            int[] var30 = var21[var28];
                            if (~var30[0] >= ~var29 && var29 <= var30[1]) {
                                if (var10 != var28) {
                                    int var31 = var8 - -var4;
                                    if (var31 < 0) {
                                        var31 += class140.field2505;
                                    }
                                    if (class140.field2505 < var31) {
                                        var31 -= class140.field2505;
                                    }
                                    for (int var32 = 1; ~var32 >= ~var27; ++var32) {
                                        int[] var40 = var21[(var10 - -var32) % var11];
                                        var25 = Math.max(var25, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                        int[] var34 = var21[(var10 + var33) % var11];
                                        int var35 = var34[2];
                                        if (var25 != var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (var31 < var29) {
                                                var38 = Math.max(var31, var36);
                                                var39 = Math.min(var29, var37);
                                            } else if (~var36 == -1) {
                                                var38 = 0;
                                                var39 = Math.min(var29, var37);
                                            } else {
                                                var38 = Math.max(var31, var36);
                                                var39 = class140.field2505;
                                            }
                                            this.method1051(var20, -var38 + var39, var5 + var38, -var35 + var25, var6, 0, var35);
                                        }
                                    }
                                }
                                var10 = var28;
                                break;
                            }
                            ++var27;
                            ++var28;
                            if (var11 <= var28) {
                                var28 = 0;
                            }
                        }
                    }
                    if (~(var25 - -var23) >= ~class255.field4540) {
                        var12 = false;
                    } else {
                        var23 = -var25 + class255.field4540;
                    }
                    if (~class140.field2505 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[1] = var24;
                        var41[0] = var8;
                        var41[2] = var23 + var25;
                        this.method1051(var20, var22, var7 + var8, var23, var6, 0, var25);
                        var8 = var24;
                    } else {
                        this.method1051(var20, var22, var7 + var8, var23, var6, 0, var25);
                        if (var12) {
                            break label120;
                        }
                        var9 = false;
                        var10 = 0;
                        var5 = var7;
                        int[] var42 = var19[var13++];
                        var42[1] = var24;
                        var42[2] = var25 - -var23;
                        var11 = var13;
                        int[][] var43 = var21;
                        var13 = 0;
                        var42[0] = var8;
                        var7 = class51.method413(var20, class140.field2505, Integer.MIN_VALUE);
                        var21 = var19;
                        var4 = var7 - var5;
                        var19 = var43;
                        var12 = true;
                        int var44 = var4;
                        var8 = 0;
                        if (var4 < 0) {
                            var44 = class140.field2505 + var4;
                        }
                        if (var44 > class140.field2505) {
                            var44 -= class140.field2505;
                        }
                        while (true) {
                            int[] var45 = var21[var10];
                            if (~var44 <= ~var45[0] && ~var44 >= ~var45[1]) {
                                break;
                            }
                            ++var10;
                            if (~var10 <= ~var11) {
                                var10 = 0;
                            }
                        }
                    }
                }
            }
        }
        int var46 = -64 % ((-24 - arg1) / 57);
        return var3;
    }
}
