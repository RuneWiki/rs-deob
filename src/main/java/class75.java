import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!he")
public class class75 extends class33 {

    @OriginalMember(owner = "client!he", name = "cb", descriptor = "I")
    private int field1473 = 1024;

    @OriginalMember(owner = "client!he", name = "hb", descriptor = "I")
    private int field1478 = 2048;

    @OriginalMember(owner = "client!he", name = "Y", descriptor = "I")
    private int field1469 = 819;

    @OriginalMember(owner = "client!he", name = "fb", descriptor = "I")
    private int field1476 = 1024;

    @OriginalMember(owner = "client!he", name = "X", descriptor = "I")
    private int field1468 = 409;

    @OriginalMember(owner = "client!he", name = "gb", descriptor = "I")
    private int field1477 = 1024;

    @OriginalMember(owner = "client!he", name = "kb", descriptor = "I")
    private int field1481 = 0;

    @OriginalMember(owner = "client!he", name = "pb", descriptor = "I")
    private int field1486 = 1024;

    @OriginalMember(owner = "client!he", name = "Z", descriptor = "I")
    private int field1470 = 0;

    @OriginalMember(owner = "client!he", name = "N", descriptor = "Lrd;")
    private static class173 field1459 = class133.method843("Your account is already logged in)3", -108);

    @OriginalMember(owner = "client!he", name = "O", descriptor = "Lrd;")
    private static class173 field1460 = class133.method843("Loaded fonts", -71);

    @OriginalMember(owner = "client!he", name = "U", descriptor = "Lrd;")
    public static class173 field1465 = field1459;

    @OriginalMember(owner = "client!he", name = "db", descriptor = "Lrd;")
    public static class173 field1474 = class133.method843("mapfunction", 21);

    @OriginalMember(owner = "client!he", name = "W", descriptor = "Lrd;")
    public static class173 field1467 = class133.method843("VOLL", -96);

    @OriginalMember(owner = "client!he", name = "T", descriptor = "Lrd;")
    private static class173 field1464 = class133.method843("glow3:", 100);

    @OriginalMember(owner = "client!he", name = "S", descriptor = "Lrd;")
    public static class173 field1463 = field1464;

    @OriginalMember(owner = "client!he", name = "jb", descriptor = "Lrd;")
    public static class173 field1480 = class133.method843("Spieler", -107);

    @OriginalMember(owner = "client!he", name = "mb", descriptor = "Lrd;")
    public static class173 field1483 = field1460;

    @OriginalMember(owner = "client!he", name = "V", descriptor = "Lrd;")
    public static class173 field1466 = field1464;

    @OriginalMember(owner = "client!he", name = "nb", descriptor = "I")
    public static int field1484 = 0;

    @OriginalMember(owner = "client!he", name = "lb", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1482 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!he", name = "M", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!he", name = "P", descriptor = "I")
    public static int field1461;

    @OriginalMember(owner = "client!he", name = "R", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!he", name = "ab", descriptor = "I")
    private int field1471;

    @OriginalMember(owner = "client!he", name = "bb", descriptor = "I")
    public static int field1472;

    @OriginalMember(owner = "client!he", name = "eb", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!he", name = "ib", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!he", name = "qb", descriptor = "I")
    public static int field1487;

    @OriginalMember(owner = "client!he", name = "ob", descriptor = "Lqf;")
    public static class165 field1485;

    @OriginalMember(owner = "client!he", name = "c", descriptor = "(B)V")
    public static void method462(byte arg0) {
        field1460 = null;
        field1483 = null;
        field1485 = null;
        field1463 = null;
        field1482 = null;
        field1480 = null;
        field1466 = null;
        field1474 = null;
        field1464 = null;
        if (arg0 < -101) {
            field1465 = null;
            field1467 = null;
            field1459 = null;
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(II[[IILjava/util/Random;II)V")
    private final void method463(int arg0, int arg1, int[][] arg2, int arg3, Random arg4, int arg5, int arg6) {
        ++field1458;
        int var8 = this.field1486 > 0 ? -class159.method1044(this.field1486, (byte) 109, arg4) + 4096 : 4096;
        int var9 = this.field1476 * this.field1471 >> 12;
        int var10 = this.field1471 + -(~var9 >= -1 ? 0 : class159.method1044(var9, (byte) 93, arg4));
        if (~class117.field2173 >= ~arg1) {
            arg1 -= class117.field2173;
        }
        int var11 = -108 % ((arg3 - -4) / 36);
        if (var10 <= 0) {
            if (class117.field2173 >= arg1 + arg5) {
                for (int var12 = 0; arg0 > var12; ++var12) {
                    class85.method554(arg2[arg6 + var12], arg1, arg5, var8);
                }
            } else {
                int var13 = -arg1 + class117.field2173;
                for (int var14 = 0; arg0 > var14; ++var14) {
                    int[] var15 = arg2[arg6 - -var14];
                    class85.method554(var15, arg1, var13, var8);
                    class85.method554(var15, 0, -var13 + arg5, var8);
                }
            }
        } else if (~arg0 < -1 && ~arg5 < -1) {
            int var16 = arg5 / 2;
            int var17 = arg0 / 2;
            int var18 = var16 < var10 ? var16 : var10;
            int var19 = arg1 - -var18;
            int var20 = var17 < var10 ? var17 : var10;
            int var21 = -(var18 * 2) + arg5;
            for (int var22 = 0; ~arg0 < ~var22; ++var22) {
                int[] var23 = arg2[arg6 + var22];
                if (~var20 < ~var22) {
                    int var24 = var8 * var22 / var20;
                    if (this.field1470 == 0) {
                        for (int var25 = 0; ~var18 < ~var25; ++var25) {
                            int var26 = var8 * var25 / var18;
                            var23[class209.method1383(arg1 - -var25, class125.field2347)] = var23[class209.method1383(-var25 + -1 + arg1 + arg5, class125.field2347)] = var24 * var26 >> 12;
                        }
                    } else {
                        for (int var27 = 0; var18 > var27; ++var27) {
                            int var29 = var8 * var27 / var18;
                            var23[class209.method1383(class125.field2347, arg1 - -var27)] = var23[class209.method1383(arg1 + -1 - (-arg5 + var27), class125.field2347)] = ~var24 < ~var29 ? var29 : var24;
                        }
                    }
                    if (class117.field2173 >= var19 + var21) {
                        class85.method554(var23, var19, var21, var24);
                    } else {
                        int var28 = class117.field2173 - var19;
                        class85.method554(var23, var19, var28, var24);
                        class85.method554(var23, 0, var21 - var28, var24);
                    }
                } else {
                    int var30 = -var22 + arg0 + -1;
                    if (var20 > var30) {
                        int var31 = var8 * var30 / var20;
                        if (this.field1470 != 0) {
                            for (int var32 = 0; ~var18 < ~var32; ++var32) {
                                int var33 = var8 * var32 / var18;
                                var23[class209.method1383(class125.field2347, arg1 + var32)] = var23[class209.method1383(arg1 + arg5 + -var32 - 1, class125.field2347)] = var33 >= var31 ? var31 : var33;
                            }
                        } else {
                            for (int var34 = 0; ~var18 < ~var34; ++var34) {
                                int var36 = var8 * var34 / var18;
                                var23[class209.method1383(class125.field2347, arg1 + var34)] = var23[class209.method1383(arg1 - 1 + -var34 + arg5, class125.field2347)] = var31 * var36 >> 12;
                            }
                        }
                        if (~class117.field2173 <= ~(var19 + var21)) {
                            class85.method554(var23, var19, var21, var31);
                        } else {
                            int var35 = -var19 + class117.field2173;
                            class85.method554(var23, var19, var35, var31);
                            class85.method554(var23, 0, -var35 + var21, var31);
                        }
                    } else {
                        for (int var37 = 0; ~var37 > ~var18; ++var37) {
                            var23[class209.method1383(class125.field2347, arg1 + var37)] = var23[class209.method1383(class125.field2347, arg1 + arg5 + -var37 + -1)] = var8 * var37 / var18;
                        }
                        if (~(var19 + var21) < ~class117.field2173) {
                            int var38 = -var19 + class117.field2173;
                            class85.method554(var23, var19, var38, var8);
                            class85.method554(var23, 0, -var38 + var21, var8);
                        } else {
                            class85.method554(var23, var19, var21, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(Lrd;I)V")
    public static final void method464(class173 arg0, int arg1) {
        ++field1487;
        if (class172.field3352 != null) {
            int var2 = 0;
            long var3 = arg0.method1132(113);
            if (~var3 != -1L) {
                while (~class172.field3352.length < ~var2 && ~class172.field3352[var2].field2437 != ~var3) {
                    ++var2;
                }
                if (~var2 > ~class172.field3352.length && class172.field3352[var2] != null) {
                    ++class47.field1009;
                    if (arg1 == 7) {
                        class165.field3175.method1023(231, -21822);
                        class165.field3175.method756(class172.field3352[var2].field2437, arg1 + 107);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!he", name = "<init>", descriptor = "()V")
    public class75() {
        super(0, true);
    }

    @OriginalMember(owner = "client!he", name = "d", descriptor = "(I)V")
    public final void method179(int arg0) {
        ++field1462;
        if (arg0 != -1) {
            this.method463(-126, 105, (int[][]) null, -11, (Random) null, -81, -37);
        }
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IILmb;)V")
    public final void method177(int arg0, int arg1, class121 arg2) {
        if (arg1 > -99) {
            this.field1468 = -60;
        }
        if (~arg0 != -1) {
            if (~arg0 != -2) {
                if (~arg0 != -3) {
                    if (~arg0 != -4) {
                        if (arg0 != 4) {
                            if (~arg0 != -6) {
                                if (arg0 != 6) {
                                    if (arg0 != 7) {
                                        if (arg0 == 8) {
                                            this.field1486 = arg2.method755((byte) -46);
                                        }
                                    } else {
                                        this.field1476 = arg2.method755((byte) -89);
                                    }
                                } else {
                                    this.field1470 = arg2.method751((byte) -39);
                                }
                            } else {
                                this.field1477 = arg2.method755((byte) -68);
                            }
                        } else {
                            this.field1469 = arg2.method755((byte) -42);
                        }
                    } else {
                        this.field1468 = arg2.method755((byte) -109);
                    }
                } else {
                    this.field1478 = arg2.method755((byte) -27);
                }
            } else {
                this.field1473 = arg2.method755((byte) -108);
            }
        } else {
            this.field1481 = arg2.method751((byte) -34);
        }
        ++field1461;
    }

    @OriginalMember(owner = "client!he", name = "a", descriptor = "(IB)[I")
    public final int[] method175(int arg0, byte arg1) {
        ++field1472;
        int var3 = -15 / ((arg1 - -65) / 60);
        int[] var4 = super.field718.method514(arg0, -38);
        if (super.field718.field1615) {
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int[][] var9 = super.field718.method515(-29296);
            int var10 = 0;
            boolean var11 = true;
            int var12 = 0;
            int var13 = class117.field2173 * this.field1478 >> 12;
            int var14 = class99.field1802 * this.field1468 >> 12;
            int var15 = class99.field1802 * this.field1469 >> 12;
            int var16 = 0;
            boolean var17 = true;
            int var18 = class117.field2173 * this.field1473 >> 12;
            if (var15 <= 1) {
                return var9[arg0];
            } else {
                int var19 = class117.field2173 / var18 + 1;
                this.field1471 = class117.field2173 / 8 * this.field1477 >> 12;
                int[][] var20 = new int[var19][3];
                Random var21 = new Random((long) this.field1481);
                int[][] var22 = new int[var19][3];
                while (true) {
                    while (true) {
                        int var23 = var18 + class159.method1044(-var18 + var13, (byte) 108, var21);
                        int var24 = class159.method1044(-var14 + var15, (byte) 113, var21) + var14;
                        int var25 = var7 + var23;
                        if (class117.field2173 < var25) {
                            var25 = class117.field2173;
                            var23 = class117.field2173 - var7;
                        }
                        int var30;
                        if (var11) {
                            var30 = 0;
                        } else {
                            int var26 = var10;
                            int var27 = 0;
                            int var28 = var6 + var25;
                            int[] var29 = var22[var10];
                            var30 = var29[2];
                            if (var28 < 0) {
                                var28 += class117.field2173;
                            }
                            if (class117.field2173 < var28) {
                                var28 -= class117.field2173;
                            }
                            while (true) {
                                int[] var31 = var22[var26];
                                if (~var28 <= ~var31[0] && var28 <= var31[1]) {
                                    if (var10 != var26) {
                                        int var32 = var6 + var7;
                                        if (~var32 > -1) {
                                            var32 += class117.field2173;
                                        }
                                        if (~var32 < ~class117.field2173) {
                                            var32 -= class117.field2173;
                                        }
                                        for (int var33 = 1; var27 >= var33; ++var33) {
                                            int[] var41 = var22[(var10 + var33) % var12];
                                            var30 = Math.max(var30, var41[2]);
                                        }
                                        for (int var34 = 0; var27 >= var34; ++var34) {
                                            int[] var35 = var22[(var10 + var34) % var12];
                                            int var36 = var35[2];
                                            if (~var30 != ~var36) {
                                                int var37 = var35[0];
                                                int var38 = var35[1];
                                                int var39;
                                                int var40;
                                                if (var28 > var32) {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = Math.min(var28, var38);
                                                } else if (var37 == 0) {
                                                    var40 = Math.min(var28, var38);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var32, var37);
                                                    var40 = class117.field2173;
                                                }
                                                this.method463(-var36 + var30, var8 + var39, var9, 62, var21, -var39 + var40, var36);
                                            }
                                        }
                                    }
                                    var10 = var26;
                                    break;
                                }
                                ++var26;
                                if (~var26 <= ~var12) {
                                    var26 = 0;
                                }
                                ++var27;
                            }
                        }
                        if (class99.field1802 >= var24 + var30) {
                            var17 = false;
                        } else {
                            var24 = -var30 + class99.field1802;
                        }
                        if (~class117.field2173 == ~var25) {
                            this.method463(var24, var5 + var7, var9, -79, var21, var23, var30);
                            if (var17) {
                                return var4;
                            }
                            var8 = var5;
                            var11 = false;
                            var10 = 0;
                            var17 = true;
                            int[][] var42 = var22;
                            var22 = var20;
                            int[] var43 = var20[var16++];
                            var43[1] = var25;
                            var12 = var16;
                            var43[2] = var30 - -var24;
                            var16 = 0;
                            var43[0] = var7;
                            var20 = var42;
                            var7 = 0;
                            var5 = class159.method1044(class117.field2173, (byte) 122, var21);
                            var6 = var5 - var8;
                            int var44 = var6;
                            if (var6 < 0) {
                                var44 = class117.field2173 + var6;
                            }
                            if (~var44 < ~class117.field2173) {
                                var44 -= class117.field2173;
                            }
                            while (true) {
                                int[] var45 = var22[var10];
                                if (var44 >= var45[0] && var45[1] >= var44) {
                                    break;
                                }
                                ++var10;
                                if (~var10 <= ~var12) {
                                    var10 = 0;
                                }
                            }
                        } else {
                            int[] var46 = var20[var16++];
                            var46[2] = var24 + var30;
                            var46[0] = var7;
                            var46[1] = var25;
                            this.method463(var24, var5 + var7, var9, -98, var21, var23, var30);
                            var7 = var25;
                        }
                    }
                }
            }
        } else {
            return var4;
        }
    }
}
