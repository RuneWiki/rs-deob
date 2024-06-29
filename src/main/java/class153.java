import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!a")
public class class153 extends class276 {

    @OriginalMember(owner = "client!a", name = "O", descriptor = "I")
    private int field2551 = 2;

    @OriginalMember(owner = "client!a", name = "S", descriptor = "I")
    private int field2554 = 0;

    @OriginalMember(owner = "client!a", name = "P", descriptor = "I")
    private int field2552 = 5;

    @OriginalMember(owner = "client!a", name = "V", descriptor = "I")
    private int field2557 = 2048;

    @OriginalMember(owner = "client!a", name = "W", descriptor = "I")
    private int field2558 = 5;

    @OriginalMember(owner = "client!a", name = "fb", descriptor = "I")
    private int field2567 = 1;

    @OriginalMember(owner = "client!a", name = "gb", descriptor = "[B")
    private byte[] field2568 = new byte[512];

    @OriginalMember(owner = "client!a", name = "eb", descriptor = "[S")
    private short[] field2566 = new short[512];

    @OriginalMember(owner = "client!a", name = "M", descriptor = "Lrc;")
    public static class9 field2549 = new class9(500);

    @OriginalMember(owner = "client!a", name = "bb", descriptor = "[J")
    public static long[] field2563 = new long[500];

    @OriginalMember(owner = "client!a", name = "jb", descriptor = "I")
    public static int field2571 = 0;

    @OriginalMember(owner = "client!a", name = "N", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!a", name = "R", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!a", name = "T", descriptor = "I")
    public static int field2555;

    @OriginalMember(owner = "client!a", name = "U", descriptor = "I")
    public static int field2556;

    @OriginalMember(owner = "client!a", name = "X", descriptor = "I")
    public static int field2559;

    @OriginalMember(owner = "client!a", name = "Y", descriptor = "I")
    public static int field2560;

    @OriginalMember(owner = "client!a", name = "Z", descriptor = "I")
    public static int field2561;

    @OriginalMember(owner = "client!a", name = "ab", descriptor = "I")
    public static int field2562;

    @OriginalMember(owner = "client!a", name = "cb", descriptor = "I")
    public static int field2564;

    @OriginalMember(owner = "client!a", name = "db", descriptor = "I")
    public static int field2565;

    @OriginalMember(owner = "client!a", name = "hb", descriptor = "I")
    public static int field2569;

    @OriginalMember(owner = "client!a", name = "ib", descriptor = "I")
    public static int field2570;

    @OriginalMember(owner = "client!a", name = "g", descriptor = "(I)V")
    private final void method1046(int arg0) {
        Random var2 = new Random((long) this.field2554);
        this.field2566 = new short[512];
        if (arg0 <= 58) {
            field2556 = 11;
        }
        if (this.field2557 > 0) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field2566[var3] = (short) class37.method246(this.field2557, (byte) -59, var2);
            }
        }
        ++field2553;
    }

    @OriginalMember(owner = "client!a", name = "c", descriptor = "(B)V")
    public static void method1047(byte arg0) {
        field2563 = null;
        field2549 = null;
        int var1 = 59 / ((-55 - arg0) / 37);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IIIIIIIIII)V")
    public static final void method1048(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg2 != 128) {
            field2556 = 63;
        }
        if (~arg4 == ~arg8 && ~arg0 == ~arg7 && ~arg1 == ~arg6 && arg3 == arg9) {
            class220.method1460(arg6, arg5, arg8, 0, arg7, arg3);
        } else {
            int var10 = arg8;
            int var11 = arg7 * 3;
            int var12 = arg8 * 3;
            int var13 = arg4 * 3;
            int var14 = arg7;
            int var15 = arg0 * 3;
            int var16 = arg1 * 3;
            int var17 = arg9 * 3;
            int var18 = -var17 + var15 + arg3 + -arg7;
            int var19 = arg6 - (-var13 + var16 + arg8);
            int var20 = -var12 + var13;
            int var21 = -var15 - -var11 + var17 + -var15;
            int var22 = -var13 + var12 + var16 + -var13;
            int var23 = -var11 + var15;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var22 * var25;
                int var27 = var24 * var25 >> 12;
                int var28 = var19 * var27;
                int var29 = var21 * var25;
                int var30 = var18 * var27;
                int var31 = var23 * var24;
                int var32 = (var29 + var30 + var31 >> 12) + arg7;
                int var33 = var20 * var24;
                int var34 = arg8 - -(var26 + var33 + var28 >> 12);
                class220.method1460(var34, arg5, var10, 0, var14, var32);
                var10 = var34;
                var14 = var32;
            }
        }
        ++field2550;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 > 66) {
            this.field2568 = class50.method305((byte) 52, this.field2554);
            this.method1046(112);
            ++field2570;
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(Lvh;BIILvh;)Lsa;")
    public static final class244 method1049(class108 arg0, byte arg1, int arg2, int arg3, class108 arg4) {
        ++field2555;
        if (!class127.method876(arg3, arg4, arg2, -8635)) {
            return null;
        } else {
            if (arg1 != -19) {
                method1049((class108) null, (byte) 79, 5, 32, (class108) null);
            }
            return class272.method1786((byte) -44, arg0.method746(arg3, (byte) -128, arg2));
        }
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(IB)V")
    public static final void method1050(int arg0, byte arg1) {
        class24.field376.method63(0, arg0);
        if (arg1 != -71) {
            field2556 = 80;
        }
        ++field2562;
    }

    @OriginalMember(owner = "client!a", name = "d", descriptor = "(II)Z")
    public static final boolean method1051(int arg0, int arg1) {
        byte var2 = 0;
        ++field2559;
        byte var3 = 0;
        if (class223.field3761 == null) {
            if (class84.field1524 != null) {
                class223.field3761 = (class197) class84.field1524;
            } else {
                class223.field3761 = new class197(512, 512);
            }
            int[] var4 = class223.field3761.field3189;
            int var5 = var4.length;
            for (int var6 = 0; var6 < var5; ++var6) {
                var4[var6] = 1;
            }
            for (int var7 = var3 + 1; var7 < -var3 + 103; ++var7) {
                int var21 = 24628 - -((-var7 + 103 - -var3) * 2048);
                for (int var22 = var2 + 1; ~(-var2 + 103) < ~var22; ++var22) {
                    if (~(24 & class229.field3862[arg1][var22][var7]) == -1) {
                        class154.method1057(var4, var21, 512, arg1, var22, var7);
                    }
                    if (arg1 < 3 && (8 & class229.field3862[arg1 + 1][var22][var7]) != 0) {
                        class154.method1057(var4, var21, 512, arg1 + 1, var22, var7);
                    }
                    var21 += 4;
                }
            }
            class248.field4062 = 0;
            for (int var8 = 0; var8 < 104; ++var8) {
                for (int var9 = 0; ~var9 > -105; ++var9) {
                    long var10 = class108.method747(class176.field2886, var2 + var8, var3 + var9);
                    if (~var10 != -1L) {
                        class206 var12 = class10.method64(arg0 + -17945, (int) (var10 >>> 32) & Integer.MAX_VALUE);
                        int var13 = var12.field3393;
                        if (var12.field3373 != null) {
                            for (int var14 = 0; ~var12.field3373.length < ~var14; ++var14) {
                                if (~var12.field3373[var14] != 0) {
                                    class206 var15 = class10.method64(64, var12.field3373[var14]);
                                    if (var15.field3393 >= 0) {
                                        var13 = var15.field3393;
                                        break;
                                    }
                                }
                            }
                        }
                        if (var13 >= 0) {
                            int var16 = var8 - -var2;
                            int var17 = var3 + var9;
                            if (~var13 != -23 && ~var13 != -30 && var13 != 34 && var13 != 36 && var13 != 46 && ~var13 != -48 && ~var13 != -49) {
                                int[][] var18 = class99.field1699[class176.field2886].field3061;
                                for (int var19 = 0; var19 < 10; ++var19) {
                                    int var20 = (int) (4.0D * Math.random());
                                    if (~var20 == -1 && var16 > 0 && var8 + -3 < var16 && ~(var18[var16 + -1][var17] & 2883848) == -1) {
                                        --var16;
                                    }
                                    if (var20 == 1 && var16 < 103 && ~var16 > ~(var8 - -3) && ~(var18[var16 - -1][var17] & 2883968) == -1) {
                                        ++var16;
                                    }
                                    if (var20 == 2 && var17 > 0 && ~var17 < ~(var9 + -3) && ~(2883842 & var18[var16][var17 - 1]) == -1) {
                                        --var17;
                                    }
                                    if (var20 == 3 && var17 < 103 && ~(var9 + 3) < ~var17 && ~(2883872 & var18[var16][var17 + 1]) == -1) {
                                        ++var17;
                                    }
                                }
                            }
                            class155.field2601[class248.field4062] = var12.field3384;
                            class290.field4635[class248.field4062] = -var2 + var16;
                            class93.field1633[class248.field4062] = var17 - var3;
                            ++class248.field4062;
                        }
                    }
                }
            }
        }
        class223.field3761.method1309();
        int var23 = -10 + (238 - (-((int) (Math.random() * 20.0D)) - ((int) (Math.random() * 20.0D) + 238 - 10 << 8))) + (-10 + (int) (20.0D * Math.random()) + 238 << 16);
        int var24 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        if (arg0 != 18009) {
            method1047((byte) 76);
        }
        for (int var25 = 1; var25 < 103; ++var25) {
            for (int var26 = 1; var26 < 103; ++var26) {
                if (~(class229.field3862[arg1][var2 + var26][var3 + var25] & 24) == -1 && !class223.method1500(var3, var25, arg1, var26, var2, (byte) -126, var24, var23)) {
                    class240.field3944.method186(106);
                    return false;
                }
                if (~arg1 > -4 && ~(8 & class229.field3862[arg1 - -1][var26 - -var2][var25 - -var3]) != -1 && !class223.method1500(var3, var25, arg1 + 1, var26, var2, (byte) -127, var24, var23)) {
                    class240.field3944.method186(73);
                    return false;
                }
            }
        }
        class84.field1524 = class223.field3761;
        class240.field3944.method186(arg0 ^ 17929);
        class223.field3761 = null;
        return true;
    }

    @OriginalMember(owner = "client!a", name = "<init>", descriptor = "()V")
    public class153() {
        super(0, true);
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(II)[I")
    public final int[] method23(int arg0, int arg1) {
        if (arg0 <= 39) {
            this.method1046(-87);
        }
        ++field2565;
        int[] var3 = super.field4425.method992(17118, arg1);
        if (super.field4425.field2448) {
            int var4 = 2048 - -(class206.field3389[arg1] * this.field2558);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class53.field929; ++var7) {
                class7.field89 = Integer.MAX_VALUE;
                class194.field3127 = Integer.MAX_VALUE;
                class259.field4247 = Integer.MAX_VALUE;
                class15.field202 = Integer.MAX_VALUE;
                int var8 = class175.field2883[var7] * this.field2552 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; var6 >= var11; ++var11) {
                    int var13 = 255 & this.field2568[(var11 >= this.field2558 ? var11 - this.field2558 : var11) & 255];
                    for (int var14 = var9 + -1; ~var14 >= ~var10; ++var14) {
                        int var15 = (this.field2568[255 & var13 + (~var14 > ~this.field2552 ? var14 : -this.field2552 + var14)] & 255) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field2566[var15]);
                        int var17 = var4 - this.field2566[var27] + -(var11 << 12);
                        int var18 = this.field2567;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 >= 0 ? var16 : -var16) - -(var17 < 0 ? -var17 : var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 > -1 ? -var16 : var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var26 < var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class15.field202 <= var19) {
                            if (~var19 <= ~class259.field4247) {
                                if (var19 >= class194.field3127) {
                                    if (class7.field89 > var19) {
                                        class7.field89 = var19;
                                    }
                                } else {
                                    class7.field89 = class194.field3127;
                                    class194.field3127 = var19;
                                }
                            } else {
                                class7.field89 = class194.field3127;
                                class194.field3127 = class259.field4247;
                                class259.field4247 = var19;
                            }
                        } else {
                            class7.field89 = class194.field3127;
                            class194.field3127 = class259.field4247;
                            class259.field4247 = class15.field202;
                            class15.field202 = var19;
                        }
                    }
                }
                int var12 = this.field2551;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (var12 == 2) {
                                    var3[var7] = -class15.field202 + class259.field4247;
                                }
                            } else {
                                var3[var7] = class7.field89;
                            }
                        } else {
                            var3[var7] = class194.field3127;
                        }
                    } else {
                        var3[var7] = class259.field4247;
                    }
                } else {
                    var3[var7] = class15.field202;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!a", name = "a", descriptor = "(ILeh;B)V")
    public final void method21(int arg0, class101 arg1, byte arg2) {
        ++field2561;
        if (arg2 == -1) {
            if (~arg0 != -1) {
                if (arg0 != 1) {
                    if (arg0 != 2) {
                        if (~arg0 != -4) {
                            if (arg0 != 4) {
                                if (arg0 != 5) {
                                    if (arg0 == 6) {
                                        this.field2558 = arg1.method669((byte) 36);
                                    }
                                } else {
                                    this.field2552 = arg1.method669((byte) 36);
                                }
                            } else {
                                this.field2567 = arg1.method669((byte) 36);
                            }
                        } else {
                            this.field2551 = arg1.method669((byte) 36);
                        }
                    } else {
                        this.field2557 = arg1.method677(false);
                    }
                } else {
                    this.field2554 = arg1.method669((byte) 36);
                }
            } else {
                this.field2552 = this.field2558 = arg1.method669((byte) 36);
            }
        }
    }
}
