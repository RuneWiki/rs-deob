import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public class class237 extends class13 {

    @OriginalMember(owner = "client!dg", name = "M", descriptor = "I")
    private int field3371 = 5;

    @OriginalMember(owner = "client!dg", name = "L", descriptor = "I")
    private int field3370 = 1;

    @OriginalMember(owner = "client!dg", name = "P", descriptor = "[S")
    private short[] field3374 = new short[512];

    @OriginalMember(owner = "client!dg", name = "T", descriptor = "I")
    private int field3378 = 2;

    @OriginalMember(owner = "client!dg", name = "D", descriptor = "I")
    private int field3362 = 0;

    @OriginalMember(owner = "client!dg", name = "I", descriptor = "[B")
    private byte[] field3367 = new byte[512];

    @OriginalMember(owner = "client!dg", name = "X", descriptor = "I")
    private int field3382 = 5;

    @OriginalMember(owner = "client!dg", name = "W", descriptor = "I")
    private int field3381 = 2048;

    @OriginalMember(owner = "client!dg", name = "K", descriptor = "I")
    public static int field3369 = 1;

    @OriginalMember(owner = "client!dg", name = "H", descriptor = "I")
    public static int field3366 = 0;

    @OriginalMember(owner = "client!dg", name = "R", descriptor = "Z")
    public static boolean field3376 = false;

    @OriginalMember(owner = "client!dg", name = "O", descriptor = "[[I")
    public static int[][] field3373 = new int[][] { { 2, 4, 6, 0 }, { 0, 2, 3, 5, 6, 4 }, { 0, 1, 4, 5 }, { 4, 6, 0, 2 }, { 2, 4, 0 }, { 0, 2, 4 }, { 6, 0, 1, 2, 4, 5 }, { 0, 1, 2, 4, 6, 7 }, { 4, 7, 6, 0 }, { 0, 8, 6, 1, 9, 2, 9, 4 }, { 2, 9, 4, 0, 8, 6 }, { 2, 11, 3, 7, 10, 10, 6, 6 }, { 2, 4, 6, 0 } };

    @OriginalMember(owner = "client!dg", name = "E", descriptor = "I")
    public static int field3363;

    @OriginalMember(owner = "client!dg", name = "F", descriptor = "I")
    public static int field3364;

    @OriginalMember(owner = "client!dg", name = "G", descriptor = "I")
    public static int field3365;

    @OriginalMember(owner = "client!dg", name = "J", descriptor = "I")
    public static int field3368;

    @OriginalMember(owner = "client!dg", name = "N", descriptor = "I")
    public static int field3372;

    @OriginalMember(owner = "client!dg", name = "Q", descriptor = "I")
    public static int field3375;

    @OriginalMember(owner = "client!dg", name = "S", descriptor = "I")
    public static int field3377;

    @OriginalMember(owner = "client!dg", name = "U", descriptor = "I")
    public static int field3379;

    @OriginalMember(owner = "client!dg", name = "V", descriptor = "I")
    public static int field3380;

    @OriginalMember(owner = "client!dg", name = "Y", descriptor = "I")
    public static int field3383;

    @OriginalMember(owner = "client!dg", name = "Z", descriptor = "I")
    public static int field3384;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(ZI)[I")
    public final int[] method29(boolean arg0, int arg1) {
        ++field3377;
        int[] var3 = super.field263.method893(arg1, 1578);
        if (super.field263.field1845) {
            int var4 = class277.field3873[arg1] * this.field3371 + 2048;
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; ~var7 > ~class269.field3751; ++var7) {
                class228.field3324 = Integer.MAX_VALUE;
                class128.field1808 = Integer.MAX_VALUE;
                class258.field3627 = Integer.MAX_VALUE;
                class322.field4419 = Integer.MAX_VALUE;
                int var8 = 2048 - -(class296.field4148[var7] * this.field3382);
                int var9 = var8 >> 12;
                int var10 = var9 + 1;
                for (int var11 = var5 + -1; ~var6 <= ~var11; ++var11) {
                    int var13 = this.field3367[(this.field3371 <= var11 ? -this.field3371 + var11 : var11) & 255] & 255;
                    for (int var14 = var9 + -1; var14 <= var10; ++var14) {
                        int var15 = 2 * (this.field3367[255 & (~var14 <= ~this.field3382 ? var14 - this.field3382 : var14) + var13] & 255);
                        int var10000 = -(var14 << 12);
                        int var27 = var15 + 1;
                        int var16 = var10000 + -this.field3374[var15] + var8;
                        int var17 = var4 - (var11 << 12) - this.field3374[var27];
                        int var18 = this.field3370;
                        int var19;
                        if (~var18 != -2) {
                            if (var18 != 3) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (var18 == 2) {
                                            var19 = (~var16 > -1 ? -var16 : var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (Math.sqrt((double) ((float) (var16 * var16 + var17 * var17) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var20 = var16 * var16;
                                        int var21 = var17 * var17;
                                        var19 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 <= -1 ? var16 : -var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (var17 < 0 ? -var17 : var17) / 4096.0F)));
                                    int var24 = var22 - -var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = var17 < 0 ? -var17 : var17;
                                int var26 = ~var16 <= -1 ? var16 : -var16;
                                var19 = ~var26 >= ~var25 ? var25 : var26;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (~class322.field4419 >= ~var19) {
                            if (class258.field3627 <= var19) {
                                if (class128.field1808 > var19) {
                                    class228.field3324 = class128.field1808;
                                    class128.field1808 = var19;
                                } else if (class228.field3324 > var19) {
                                    class228.field3324 = var19;
                                }
                            } else {
                                class228.field3324 = class128.field1808;
                                class128.field1808 = class258.field3627;
                                class258.field3627 = var19;
                            }
                        } else {
                            class228.field3324 = class128.field1808;
                            class128.field1808 = class258.field3627;
                            class258.field3627 = class322.field4419;
                            class322.field4419 = var19;
                        }
                    }
                }
                int var12 = this.field3378;
                if (~var12 != -1) {
                    if (~var12 != -2) {
                        if (var12 != 3) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class322.field4419 + class258.field3627;
                                }
                            } else {
                                var3[var7] = class228.field3324;
                            }
                        } else {
                            var3[var7] = class128.field1808;
                        }
                    } else {
                        var3[var7] = class258.field3627;
                    }
                } else {
                    var3[var7] = class322.field4419;
                }
            }
        }
        return !arg0 ? null : var3;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    private final void method1600(boolean arg0) {
        ++field3363;
        if (arg0) {
            field3366 = 60;
        }
        Random var2 = new Random((long) this.field3362);
        this.field3374 = new short[512];
        if (~this.field3381 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3374[var3] = (short) class26.method299(this.field3381, (byte) -69, var2);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(B)V")
    public static final void method1601(byte arg0) {
        class131 var1 = class406.field5774;
        synchronized (class406.field5774) {
            class406.field5774.method905((byte) 84);
        }
        if (arg0 >= -99) {
            method1603(-98);
        }
        ++field3365;
        class131 var2 = class158.field2222;
        synchronized (class158.field2222) {
            class158.field2222.method905((byte) 64);
        }
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(IIIIIIZ)V")
    public static final void method1602(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
        class112.method793(2, arg0);
        ++field3380;
        int var7 = 0;
        int var8 = -arg1 + arg0;
        if (var8 < 0) {
            var8 = 0;
        }
        int var9 = arg0;
        int var10 = -arg0;
        if (!arg6) {
            field3366 = -20;
        }
        int var11 = var8;
        int var12 = -var8;
        int var13 = -1;
        int var14 = -1;
        int[] var15 = class296.field4138[arg3];
        int var16 = arg2 - var8;
        class295.method1924(3289650, var15, var16, arg4, -arg0 + arg2);
        int var17 = arg2 + var8;
        class295.method1924(3289650, var15, var17, arg5, var16);
        class295.method1924(3289650, var15, arg0 + arg2, arg4, var17);
        while (var7 < var9) {
            var14 += 2;
            var13 += 2;
            var12 += var14;
            var10 += var13;
            if (~var12 <= -1 && var11 >= 1) {
                class47.field662[var11] = var7;
                --var11;
                var12 -= var11 << 1;
            }
            ++var7;
            if (~var10 <= -1) {
                --var9;
                var10 -= var9 << 1;
                if (~var9 > ~var8) {
                    int[] var18 = class296.field4138[arg3 + var9];
                    int[] var19 = class296.field4138[arg3 - var9];
                    int var20 = class47.field662[var9];
                    int var21 = arg2 + var7;
                    int var22 = arg2 - var7;
                    int var23 = arg2 + var20;
                    int var24 = -var20 + arg2;
                    class295.method1924(3289650, var18, var24, arg4, var22);
                    class295.method1924(3289650, var18, var23, arg5, var24);
                    class295.method1924(3289650, var18, var21, arg4, var23);
                    class295.method1924(3289650, var19, var24, arg4, var22);
                    class295.method1924(3289650, var19, var23, arg5, var24);
                    class295.method1924(3289650, var19, var21, arg4, var23);
                } else {
                    int[] var25 = class296.field4138[arg3 + var9];
                    int[] var26 = class296.field4138[arg3 - var9];
                    int var27 = arg2 + var7;
                    int var28 = -var7 + arg2;
                    class295.method1924(3289650, var25, var27, arg4, var28);
                    class295.method1924(3289650, var26, var27, arg4, var28);
                }
            }
            int[] var29 = class296.field4138[arg3 + var7];
            int[] var30 = class296.field4138[-var7 + arg3];
            int var31 = arg2 - -var9;
            int var32 = -var9 + arg2;
            if (var7 >= var8) {
                class295.method1924(3289650, var29, var31, arg4, var32);
                class295.method1924(3289650, var30, var31, arg4, var32);
            } else {
                int var33 = var7 <= var11 ? var11 : class47.field662[var7];
                int var34 = arg2 + var33;
                int var35 = arg2 - var33;
                class295.method1924(3289650, var29, var35, arg4, var32);
                class295.method1924(3289650, var29, var34, arg5, var35);
                class295.method1924(3289650, var29, var31, arg4, var34);
                class295.method1924(3289650, var30, var35, arg4, var32);
                class295.method1924(3289650, var30, var34, arg5, var35);
                class295.method1924(3289650, var30, var31, arg4, var34);
            }
        }
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "(I)V")
    public static final void method1603(int arg0) {
        ++field3383;
        for (class91 var1 = (class91) class447.field6259.method1013((byte) -71); var1 != null; var1 = (class91) class447.field6259.method1013((byte) -93)) {
            class63.method481(var1, -1);
        }
        client.method1104();
        client.method1105();
        if (arg0 != 4) {
            method1603(-87);
        }
        client.method1096();
        client.method1093();
        client.method1107();
        client.method1089();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Lkh;BI)V")
    public final void method31(class11 arg0, byte arg1, int arg2) {
        if (arg2 != 0) {
            if (arg2 != 1) {
                if (arg2 != 2) {
                    if (~arg2 != -4) {
                        if (~arg2 != -5) {
                            if (arg2 != 5) {
                                if (arg2 == 6) {
                                    this.field3371 = arg0.method172((byte) 52);
                                }
                            } else {
                                this.field3382 = arg0.method172((byte) 52);
                            }
                        } else {
                            this.field3370 = arg0.method172((byte) 52);
                        }
                    } else {
                        this.field3378 = arg0.method172((byte) 52);
                    }
                } else {
                    this.field3381 = arg0.method174(255);
                }
            } else {
                this.field3362 = arg0.method172((byte) 52);
            }
        } else {
            this.field3382 = this.field3371 = arg0.method172((byte) 52);
        }
        ++field3375;
        if (arg1 < 50) {
            this.field3378 = 21;
        }
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "(I)V")
    public static void method1604(int arg0) {
        if (arg0 == -1) {
            field3373 = null;
        }
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "()V")
    public class237() {
        super(0, true);
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "(I)V")
    public static final void method1605(int arg0) {
        ++field3364;
        if (arg0 != 1) {
            field3369 = -15;
        }
        class35.field544.method905((byte) 29);
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)V")
    public final void method33(int arg0) {
        ++field3379;
        int var2 = 100 / ((2 - arg0) / 51);
        this.field3367 = class305.method1967(-66, this.field3362);
        this.method1600(false);
    }
}
