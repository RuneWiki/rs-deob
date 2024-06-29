import java.math.BigInteger;
import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sb")
public class class181 extends class7 {

    @OriginalMember(owner = "client!sb", name = "Y", descriptor = "I")
    private int field3554 = 2;

    @OriginalMember(owner = "client!sb", name = "X", descriptor = "I")
    private int field3553 = 5;

    @OriginalMember(owner = "client!sb", name = "fb", descriptor = "I")
    private int field3561 = 1;

    @OriginalMember(owner = "client!sb", name = "cb", descriptor = "[S")
    private short[] field3558 = new short[512];

    @OriginalMember(owner = "client!sb", name = "nb", descriptor = "I")
    private int field3569 = 0;

    @OriginalMember(owner = "client!sb", name = "ob", descriptor = "[B")
    private byte[] field3570 = new byte[512];

    @OriginalMember(owner = "client!sb", name = "pb", descriptor = "I")
    private int field3571 = 5;

    @OriginalMember(owner = "client!sb", name = "mb", descriptor = "I")
    private int field3568 = 2048;

    @OriginalMember(owner = "client!sb", name = "U", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field3550 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client!sb", name = "ab", descriptor = "[Lli;")
    public static class118[] field3556 = new class118[50];

    @OriginalMember(owner = "client!sb", name = "bb", descriptor = "Lob;")
    private static class141 field3557 = class175.method1195(40, "Create a free account");

    @OriginalMember(owner = "client!sb", name = "hb", descriptor = "Lob;")
    public static class141 field3563 = field3557;

    @OriginalMember(owner = "client!sb", name = "Z", descriptor = "Lra;")
    public static class170 field3555 = null;

    @OriginalMember(owner = "client!sb", name = "jb", descriptor = "Lob;")
    public static class141 field3565 = class175.method1195(40, " )2> <col=ffffff>");

    @OriginalMember(owner = "client!sb", name = "qb", descriptor = "[I")
    public static int[] field3572 = new int[128];

    @OriginalMember(owner = "client!sb", name = "R", descriptor = "I")
    public static int field3547;

    @OriginalMember(owner = "client!sb", name = "T", descriptor = "I")
    public static int field3549;

    @OriginalMember(owner = "client!sb", name = "V", descriptor = "I")
    public static int field3551;

    @OriginalMember(owner = "client!sb", name = "W", descriptor = "I")
    public static int field3552;

    @OriginalMember(owner = "client!sb", name = "db", descriptor = "I")
    public static int field3559;

    @OriginalMember(owner = "client!sb", name = "eb", descriptor = "I")
    public static int field3560;

    @OriginalMember(owner = "client!sb", name = "gb", descriptor = "I")
    public static int field3562;

    @OriginalMember(owner = "client!sb", name = "ib", descriptor = "I")
    public static int field3564;

    @OriginalMember(owner = "client!sb", name = "kb", descriptor = "I")
    public static int field3566;

    @OriginalMember(owner = "client!sb", name = "lb", descriptor = "I")
    public static int field3567;

    @OriginalMember(owner = "client!sb", name = "S", descriptor = "Lpe;")
    public static class154 field3548;

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(B)V")
    public static final void method1220(byte arg0) {
        short var1 = 256;
        if (class150.field2893 > 0) {
            for (int var2 = 0; ~var2 > -257; ++var2) {
                if (~class150.field2893 >= -769) {
                    if (~class150.field2893 >= -257) {
                        class136.field2593[var2] = class49.method321(256 - class150.field2893, class195.field3726[var2], (byte) -109, class85.field1701[var2]);
                    } else {
                        class136.field2593[var2] = class195.field3726[var2];
                    }
                } else {
                    class136.field2593[var2] = class49.method321(-class150.field2893 + 1024, class85.field1701[var2], (byte) -44, class195.field3726[var2]);
                }
            }
        } else if (class188.field3648 <= 0) {
            for (int var3 = 0; ~var3 > -257; ++var3) {
                class136.field2593[var3] = class85.field1701[var3];
            }
        } else {
            for (int var4 = 0; ~var4 > -257; ++var4) {
                if (class188.field3648 > 768) {
                    class136.field2593[var4] = class49.method321(-class188.field3648 + 1024, class85.field1701[var4], (byte) -32, class131.field2505[var4]);
                } else if (~class188.field3648 < -257) {
                    class136.field2593[var4] = class131.field2505[var4];
                } else {
                    class136.field2593[var4] = class49.method321(-class188.field3648 + 256, class131.field2505[var4], (byte) -50, class85.field1701[var4]);
                }
            }
        }
        ++field3559;
        int var5 = 0;
        int var6 = class107.field2051.field1985 * 9;
        int var7 = 0;
        if (arg0 != -110) {
            field3557 = null;
        }
        for (int var8 = 1; ~(var1 + -1) < ~var8; ++var8) {
            int var21 = (var1 - var8) * class187.field3634[var8] / var1 + 22;
            if (~var21 > -1) {
                var21 = 0;
            }
            var7 += var21;
            for (int var22 = var21; ~var22 > -129; ++var22) {
                int var24 = class107.field2051.field1983[var6++];
                int var25 = class169.field3244[var7++];
                if (~var25 == -1) {
                    class117.field2288.field1983[var5++] = var24;
                } else {
                    int var27 = -var25 + 256;
                    int var28 = class136.field2593[var25];
                    class117.field2288.field1983[var5++] = class15.method94(16711680, var25 * class15.method94(65280, var28) + var27 * class15.method94(var24, 65280)) + class15.method94(var25 * class15.method94(16711935, var28) - -(class15.method94(var24, 16711935) * var27), -16711936) >> 8;
                }
            }
            for (int var23 = 0; var21 > var23; ++var23) {
                class117.field2288.field1983[var5++] = class107.field2051.field1983[var6++];
            }
            var6 += class107.field2051.field1985 - 128;
        }
        int var9 = 0;
        int var10 = 0;
        class117.field2288.method681(0, 9);
        int var11 = class107.field2051.field1985 * 9 + 128;
        for (int var12 = 1; var1 + -1 > var12; ++var12) {
            int var13 = (var1 - var12) * class187.field3634[var12] / var1 + 22;
            if (var13 < 0) {
                var13 = 0;
            }
            for (int var14 = 0; var14 < var13; ++var14) {
                int var10001 = var9++;
                --var11;
                class11.field222.field1983[var10001] = class107.field2051.field1983[var11];
            }
            for (int var15 = var13; var15 < 128; ++var15) {
                --var11;
                int var16 = class107.field2051.field1983[var11];
                int var17 = class169.field3244[var10++];
                if (var17 != 0) {
                    int var18 = 256 - var17;
                    int var20 = class136.field2593[var17];
                    class11.field222.field1983[var9++] = class15.method94(var18 * class15.method94(var16, 65280) + var17 * class15.method94(65280, var20), 16711680) + class15.method94(-16711936, class15.method94(var16, 16711935) * var18 + var17 * class15.method94(var20, 16711935)) >> 8;
                } else {
                    class11.field222.field1983[var9++] = var16;
                }
            }
            var11 += class107.field2051.field1985 - -128;
            var10 += var13;
        }
        class11.field222.method681(637, 9);
    }

    @OriginalMember(owner = "client!sb", name = "i", descriptor = "(I)V")
    public static void method1221(int arg0) {
        field3550 = null;
        field3563 = null;
        field3555 = null;
        field3548 = null;
        int var1 = -38 % ((72 - arg0) / 46);
        field3565 = null;
        field3557 = null;
        field3556 = null;
        field3572 = null;
    }

    @OriginalMember(owner = "client!sb", name = "c", descriptor = "(B)V")
    private final void method1222(byte arg0) {
        int var2 = -88 % ((arg0 - -24) / 39);
        Random var3 = new Random((long) this.field3569);
        this.field3558 = new short[512];
        ++field3567;
        if (this.field3568 > 0) {
            for (int var4 = 0; ~var4 > -513; ++var4) {
                this.field3558[var4] = (short) class209.method1367((byte) 109, var3, this.field3568);
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "f", descriptor = "(I)V")
    public final void method47(int arg0) {
        this.field3570 = class14.method87((byte) -43, this.field3569);
        this.method1222((byte) 26);
        ++field3547;
        if (arg0 != 1) {
            method1225(56);
        }
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(BI)I")
    public static final int method1223(byte arg0, int arg1) {
        ++field3566;
        if (arg0 != 33) {
            field3555 = null;
        }
        return arg1 >>> 8;
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(BI)[I")
    public final int[] method30(byte arg0, int arg1) {
        if (arg0 < 13) {
            return null;
        } else {
            int[] var3 = super.field100.method842(arg1, 12);
            ++field3552;
            if (super.field100.field2534) {
                int var4 = class177.field3503[arg1] * this.field3571 + 2048;
                int var5 = var4 >> 12;
                int var6 = var5 + 1;
                for (int var7 = 0; class117.field2272 > var7; ++var7) {
                    class143.field2770 = Integer.MAX_VALUE;
                    class154.field2947 = Integer.MAX_VALUE;
                    class174.field3458 = Integer.MAX_VALUE;
                    class166.field3215 = Integer.MAX_VALUE;
                    int var8 = class15.field272[var7] * this.field3553 + 2048;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    for (int var11 = var5 - 1; ~var6 <= ~var11; ++var11) {
                        int var13 = 255 & this.field3570[255 & (~this.field3571 < ~var11 ? var11 : var11 - this.field3571)];
                        for (int var14 = var9 + -1; ~var10 <= ~var14; ++var14) {
                            int var15 = (this.field3570[var13 + (~var14 <= ~this.field3553 ? -this.field3553 + var14 : var14) & 255] & 255) * 2;
                            int var27 = var15 + 1;
                            int var16 = var8 - (this.field3558[var15] + (var14 << 12));
                            int var17 = -(var11 << 12) - (this.field3558[var27] - var4);
                            int var18 = this.field3561;
                            int var19;
                            if (~var18 != -2) {
                                if (var18 != 3) {
                                    if (~var18 != -5) {
                                        if (var18 != 5) {
                                            if (var18 == 2) {
                                                var19 = (~var17 > -1 ? -var17 : var17) + (var16 >= 0 ? var16 : -var16);
                                            } else {
                                                var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)) * 4096.0D);
                                            }
                                        } else {
                                            int var20 = var16 * var16;
                                            int var21 = var17 * var17;
                                            var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                        }
                                    } else {
                                        int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                        int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 >= 0 ? var17 : -var17) / 4096.0F)));
                                        int var24 = var22 + var23;
                                        var19 = var24 * var24 >> 12;
                                    }
                                } else {
                                    int var25 = var17 >= 0 ? var17 : -var17;
                                    int var26 = ~var16 > -1 ? -var16 : var16;
                                    var19 = var26 > var25 ? var26 : var25;
                                }
                            } else {
                                var19 = var16 * var16 + var17 * var17 >> 12;
                            }
                            if (~class166.field3215 < ~var19) {
                                class143.field2770 = class154.field2947;
                                class154.field2947 = class174.field3458;
                                class174.field3458 = class166.field3215;
                                class166.field3215 = var19;
                            } else if (~var19 > ~class174.field3458) {
                                class143.field2770 = class154.field2947;
                                class154.field2947 = class174.field3458;
                                class174.field3458 = var19;
                            } else if (var19 >= class154.field2947) {
                                if (var19 < class143.field2770) {
                                    class143.field2770 = var19;
                                }
                            } else {
                                class143.field2770 = class154.field2947;
                                class154.field2947 = var19;
                            }
                        }
                    }
                    int var12 = this.field3554;
                    if (var12 != 0) {
                        if (var12 != 1) {
                            if (var12 != 3) {
                                if (var12 != 4) {
                                    if (var12 == 2) {
                                        var3[var7] = -class166.field3215 + class174.field3458;
                                    }
                                } else {
                                    var3[var7] = class143.field2770;
                                }
                            } else {
                                var3[var7] = class154.field2947;
                            }
                        } else {
                            var3[var7] = class174.field3458;
                        }
                    } else {
                        var3[var7] = class166.field3215;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(IILog;)V")
    public final void method31(int arg0, int arg1, class146 arg2) {
        int var4 = -121 % ((66 - arg1) / 57);
        if (arg0 != 0) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (arg0 != 3) {
                        if (arg0 != 4) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field3571 = arg2.method991(255);
                                }
                            } else {
                                this.field3553 = arg2.method991(255);
                            }
                        } else {
                            this.field3561 = arg2.method991(255);
                        }
                    } else {
                        this.field3554 = arg2.method991(255);
                    }
                } else {
                    this.field3568 = arg2.method1007(83);
                }
            } else {
                this.field3569 = arg2.method991(255);
            }
        } else {
            this.field3553 = this.field3571 = arg2.method991(255);
        }
        ++field3564;
    }

    @OriginalMember(owner = "client!sb", name = "b", descriptor = "(IIIIII)V")
    public static final void method1224(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field3560;
        int var6 = -arg1 + arg0;
        int var7 = -arg4 + arg5;
        if (~var7 == -1) {
            if (var6 != 0) {
                class66.method441(arg4, arg3, arg0, arg1, arg2 + 638213620);
            }
        } else if (var6 == 0) {
            class59.method398(arg1, arg5, true, arg4, arg3);
        } else {
            if (~var7 > -1) {
                var7 = -var7;
            }
            if (~var6 > -1) {
                var6 = -var6;
            }
            boolean var8 = var6 > var7;
            if (var8) {
                int var9 = arg4;
                arg4 = arg1;
                int var10 = arg5;
                arg1 = var9;
                arg5 = arg0;
                arg0 = var10;
            }
            if (arg5 < arg4) {
                int var11 = arg4;
                arg4 = arg5;
                arg5 = var11;
                int var12 = arg1;
                arg1 = arg0;
                arg0 = var12;
            }
            if (arg2 != -638213620) {
                field3572 = null;
            }
            int var13 = arg1;
            int var14 = -arg1 + arg0;
            if (~var14 > -1) {
                var14 = -var14;
            }
            int var15 = ~arg1 > ~arg0 ? 1 : -1;
            int var16 = -arg4 + arg5;
            int var17 = -(var16 >> 1);
            if (var8) {
                for (int var18 = arg4; ~arg5 <= ~var18; ++var18) {
                    class41.field805[var18][var13] = arg3;
                    var17 += var14;
                    if (~var17 < -1) {
                        var13 += var15;
                        var17 -= var16;
                    }
                }
            } else {
                for (int var19 = arg4; var19 <= arg5; ++var19) {
                    class41.field805[var13][var19] = arg3;
                    var17 += var14;
                    if (var17 > 0) {
                        var17 -= var16;
                        var13 += var15;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!sb", name = "<init>", descriptor = "()V")
    public class181() {
        super(0, true);
    }

    @OriginalMember(owner = "client!sb", name = "j", descriptor = "(I)V")
    public static final void method1225(int arg0) {
        class30.field573.method1385(9946);
        ++field3549;
        class173.field3441.method1385(9946);
        class128.field2440.method1385(9946);
        int var1 = -114 % ((arg0 - -33) / 34);
    }

    @OriginalMember(owner = "client!sb", name = "a", descriptor = "(Log;Lob;I)I")
    public static final int method1226(class146 arg0, class141 arg1, int arg2) {
        ++field3551;
        int var3 = arg0.field2865;
        arg0.method1008(8, arg1.field2705);
        arg0.field2865 += class126.field2424.method1242(-786703935, 0, arg1.field2705, arg1.field2701, arg0.field2859, arg0.field2865);
        int var4 = 66 % ((arg2 - 42) / 33);
        return -var3 + arg0.field2865;
    }
}
