import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cb")
public class class249 extends class68 {

    @OriginalMember(owner = "client!cb", name = "Q", descriptor = "[B")
    private byte[] field3807 = new byte[512];

    @OriginalMember(owner = "client!cb", name = "O", descriptor = "I")
    private int field3805 = 2;

    @OriginalMember(owner = "client!cb", name = "V", descriptor = "I")
    private int field3812 = 5;

    @OriginalMember(owner = "client!cb", name = "T", descriptor = "I")
    private int field3810 = 0;

    @OriginalMember(owner = "client!cb", name = "U", descriptor = "[S")
    private short[] field3811 = new short[512];

    @OriginalMember(owner = "client!cb", name = "bb", descriptor = "I")
    private int field3818 = 5;

    @OriginalMember(owner = "client!cb", name = "db", descriptor = "I")
    private int field3820 = 2048;

    @OriginalMember(owner = "client!cb", name = "hb", descriptor = "I")
    private int field3824 = 1;

    @OriginalMember(owner = "client!cb", name = "P", descriptor = "Z")
    public static boolean field3806 = false;

    @OriginalMember(owner = "client!cb", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field3817 = " has logged out.";

    @OriginalMember(owner = "client!cb", name = "N", descriptor = "I")
    public static int field3804;

    @OriginalMember(owner = "client!cb", name = "R", descriptor = "I")
    public static int field3808;

    @OriginalMember(owner = "client!cb", name = "S", descriptor = "I")
    public static int field3809;

    @OriginalMember(owner = "client!cb", name = "W", descriptor = "I")
    public static int field3813;

    @OriginalMember(owner = "client!cb", name = "X", descriptor = "I")
    public static int field3814;

    @OriginalMember(owner = "client!cb", name = "Y", descriptor = "I")
    public static int field3815;

    @OriginalMember(owner = "client!cb", name = "Z", descriptor = "I")
    public static int field3816;

    @OriginalMember(owner = "client!cb", name = "cb", descriptor = "I")
    public static int field3819;

    @OriginalMember(owner = "client!cb", name = "fb", descriptor = "I")
    public static int field3822;

    @OriginalMember(owner = "client!cb", name = "gb", descriptor = "I")
    public static int field3823;

    @OriginalMember(owner = "client!cb", name = "ib", descriptor = "I")
    public static int field3825;

    @OriginalMember(owner = "client!cb", name = "eb", descriptor = "Lpa;")
    public static class220 field3821;

    @OriginalMember(owner = "client!cb", name = "c", descriptor = "(III)V")
    public static final void method1667(int arg0, int arg1, int arg2) {
        ++field3825;
        class148 var3 = class297.field4690[class295.field4642][arg2][arg0];
        if (var3 == null) {
            class250.method1677(class295.field4642, arg2, arg0);
        } else if (arg1 == 4) {
            int var4 = -99999999;
            class207 var5 = null;
            for (class207 var6 = (class207) var3.method990(-101); var6 != null; var6 = (class207) var3.method993(arg1 ^ -35)) {
                class32 var13 = class73.method463(var6.field2893.field2355, -31104);
                int var14 = var13.field486;
                if (var13.field458 == 1) {
                    var14 = (var6.field2893.field2358 + 1) * var14;
                }
                if (var4 < var14) {
                    var5 = var6;
                    var4 = var14;
                }
            }
            if (var5 == null) {
                class250.method1677(class295.field4642, arg2, arg0);
            } else {
                var3.method991(var5, 87);
                class207 var7 = (class207) var3.method990(-100);
                class170 var8 = null;
                class170 var9 = null;
                while (var7 != null) {
                    class170 var12 = var7.field2893;
                    if (~var5.field2893.field2355 != ~var12.field2355) {
                        if (var8 == null) {
                            var8 = var12;
                        }
                        if (var8.field2355 != var12.field2355 && var9 == null) {
                            var9 = var12;
                        }
                    }
                    var7 = (class207) var3.method993(-65);
                }
                long var10 = (long) ((arg0 << 7) + arg2 - -1610612736);
                class78.method504(class295.field4642, arg2, arg0, class275.method1836(class295.field4642, arg0 * 128 - -64, arg2 * 128 + 64, arg1 ^ -125), var5.field2893, var10, var8, var9);
            }
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/String;JIZZLjava/lang/String;IIZI)V")
    public static final void method1668(int arg0, String arg1, long arg2, int arg3, boolean arg4, boolean arg5, String arg6, int arg7, int arg8, boolean arg9, int arg10) {
        ++field3819;
        int[] var12 = new int[4];
        for (int var13 = 0; var13 < 3; ++var13) {
            var12[var13] = (int) (Math.random() * 9.9999999E7D);
        }
        class224 var14 = new class224(128);
        var14.method1447(10, 17363472);
        var14.method1470(393660232, (!arg4 ? 0 : 4) | (!arg5 ? 0 : 2) | (!arg9 ? 0 : 1));
        var14.method1451(arg2, (byte) -24);
        var14.method1435(-90, var12[0]);
        var14.method1472((byte) 67, arg6);
        var14.method1435(-115, var12[1]);
        var14.method1470(393660232, class230.field3491);
        var14.method1447(arg10, 17363472);
        var14.method1447(arg0, arg3 ^ 17362960);
        if (arg3 != 512) {
            field3804 = 12;
        }
        var14.method1435(-98, var12[2]);
        var14.method1470(393660232, arg7);
        var14.method1470(393660232, arg8);
        var14.method1435(arg3 ^ -606, var12[3]);
        var14.method1485((byte) 62, class33.field500, class277.field4290);
        class224 var15 = new class224(350);
        var15.method1472((byte) 67, arg1);
        int var16 = -(class69.method432(arg1, 18) % 8) + 8;
        for (int var17 = 0; var17 < var16; ++var17) {
            var15.method1447((int) (255.0D * Math.random()), 17363472);
        }
        var15.method1443(var12, 29423);
        class281.field4359.field3402 = 0;
        class281.field4359.method1447(22, 17363472);
        class281.field4359.method1470(393660232, var15.field3402 + 2 + var14.field3402);
        class281.field4359.method1470(arg3 + 393659720, 535);
        class281.field4359.method1452(var14.field3336, 0, var14.field3402, 128);
        class281.field4359.method1452(var15.field3336, 0, var15.field3402, 128);
        class66.field896 = 0;
        class253.field3871 = 1;
        class227.field3441 = 0;
        class35.field540 = -3;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(IIIIB)V")
    public static final void method1669(int arg0, int arg1, int arg2, int arg3, byte arg4) {
        if (arg4 >= -122) {
            method1673((byte) -34);
        }
        class296.field4668 = arg2;
        class93.field1294 = arg3;
        class273.field4228 = arg1;
        class127.field1782 = arg0;
        ++field3815;
    }

    @OriginalMember(owner = "client!cb", name = "<init>", descriptor = "()V")
    public class249() {
        super(0, true);
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(ILjava/lang/StringBuffer;CI)Ljava/lang/StringBuffer;")
    public static final StringBuffer method1670(int arg0, StringBuffer arg1, char arg2, int arg3) {
        int var4 = arg1.length();
        if (arg3 != 128) {
            field3821 = null;
        }
        ++field3808;
        arg1.setLength(arg0);
        for (int var5 = var4; arg0 > var5; ++var5) {
            arg1.setCharAt(var5, arg2);
        }
        return arg1;
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        ++field3823;
        if (arg1 >= -118) {
            this.method32(112, 33);
        }
        int[] var3 = super.field917.method1920(arg0, true);
        if (super.field917.field4474) {
            int var4 = 2048 - -(class127.field1794[arg0] * this.field3812);
            int var5 = var4 >> 12;
            int var6 = var5 + 1;
            for (int var7 = 0; class89.field1248 > var7; ++var7) {
                class169.field2342 = Integer.MAX_VALUE;
                class188.field2589 = Integer.MAX_VALUE;
                class2.field10 = Integer.MAX_VALUE;
                class111.field1616 = Integer.MAX_VALUE;
                int var8 = class215.field3231[var7] * this.field3818 + 2048;
                int var9 = var8 >> 12;
                int var10 = var9 - -1;
                for (int var11 = var5 + -1; var11 <= var6; ++var11) {
                    int var13 = this.field3807[(~this.field3812 < ~var11 ? var11 : -this.field3812 + var11) & 255] & 255;
                    for (int var14 = var9 - 1; var14 <= var10; ++var14) {
                        int var15 = (255 & this.field3807[(var14 < this.field3818 ? var14 : -this.field3818 + var14) + var13 & 255]) * 2;
                        int var10001 = var14 << 12;
                        int var27 = var15 + 1;
                        int var16 = var8 - (var10001 + this.field3811[var15]);
                        int var17 = -this.field3811[var27] - ((var11 << 12) - var4);
                        int var18 = this.field3824;
                        int var19;
                        if (var18 != 1) {
                            if (~var18 != -4) {
                                if (var18 != 4) {
                                    if (var18 != 5) {
                                        if (~var18 == -3) {
                                            var19 = (var16 >= 0 ? var16 : -var16) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var19 = (int) (4096.0D * Math.sqrt((double) ((float) (var16 * var16 - -(var17 * var17)) / 1.6777216E7F)));
                                        }
                                    } else {
                                        int var20 = var17 * var17;
                                        int var21 = var16 * var16;
                                        var19 = (int) (Math.sqrt(Math.sqrt((double) ((float) (var20 + var21) / 1.6777216E7F))) * 4096.0D);
                                    }
                                } else {
                                    int var22 = (int) (Math.sqrt((double) ((float) (~var16 > -1 ? -var16 : var16) / 4096.0F)) * 4096.0D);
                                    int var23 = (int) (Math.sqrt((double) ((float) (~var17 > -1 ? -var17 : var17) / 4096.0F)) * 4096.0D);
                                    int var24 = var22 + var23;
                                    var19 = var24 * var24 >> 12;
                                }
                            } else {
                                int var25 = ~var16 <= -1 ? var16 : -var16;
                                int var26 = var17 < 0 ? -var17 : var17;
                                var19 = var25 <= var26 ? var26 : var25;
                            }
                        } else {
                            var19 = var16 * var16 + var17 * var17 >> 12;
                        }
                        if (class111.field1616 > var19) {
                            class169.field2342 = class188.field2589;
                            class188.field2589 = class2.field10;
                            class2.field10 = class111.field1616;
                            class111.field1616 = var19;
                        } else if (var19 < class2.field10) {
                            class169.field2342 = class188.field2589;
                            class188.field2589 = class2.field10;
                            class2.field10 = var19;
                        } else if (var19 < class188.field2589) {
                            class169.field2342 = class188.field2589;
                            class188.field2589 = var19;
                        } else if (~var19 > ~class169.field2342) {
                            class169.field2342 = var19;
                        }
                    }
                }
                int var12 = this.field3805;
                if (~var12 != -1) {
                    if (var12 != 1) {
                        if (~var12 != -4) {
                            if (var12 != 4) {
                                if (~var12 == -3) {
                                    var3[var7] = -class111.field1616 + class2.field10;
                                }
                            } else {
                                var3[var7] = class169.field2342;
                            }
                        } else {
                            var3[var7] = class188.field2589;
                        }
                    } else {
                        var3[var7] = class2.field10;
                    }
                } else {
                    var3[var7] = class111.field1616;
                }
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(I)V")
    private final void method1671(int arg0) {
        Random var2 = new Random((long) this.field3810);
        this.field3811 = new short[512];
        ++field3816;
        if (~this.field3820 < -1) {
            for (int var3 = 0; ~var3 > -513; ++var3) {
                this.field3811[var3] = (short) class47.method310(this.field3820, (byte) -66, var2);
            }
        }
        if (arg0 != 27652) {
            field3804 = 24;
        }
    }

    @OriginalMember(owner = "client!cb", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        this.field3807 = class213.method1388(this.field3810, 512);
        if (arg0 <= -18) {
            ++field3809;
            this.method1671(27652);
        }
    }

    @OriginalMember(owner = "client!cb", name = "f", descriptor = "(B)V")
    public static void method1672(byte arg0) {
        field3821 = null;
        if (arg0 == -83) {
            field3817 = null;
        }
    }

    @OriginalMember(owner = "client!cb", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (!arg2) {
            method1667(-47, -30, -122);
        }
        if (arg1 != 0) {
            if (~arg1 != -2) {
                if (~arg1 != -3) {
                    if (arg1 != 3) {
                        if (~arg1 != -5) {
                            if (arg1 != 5) {
                                if (arg1 == 6) {
                                    this.field3812 = arg0.method1453((byte) -128);
                                }
                            } else {
                                this.field3818 = arg0.method1453((byte) -128);
                            }
                        } else {
                            this.field3824 = arg0.method1453((byte) -127);
                        }
                    } else {
                        this.field3805 = arg0.method1453((byte) -128);
                    }
                } else {
                    this.field3820 = arg0.method1445(false);
                }
            } else {
                this.field3810 = arg0.method1453((byte) -128);
            }
        } else {
            this.field3818 = this.field3812 = arg0.method1453((byte) -128);
        }
        ++field3822;
    }

    @OriginalMember(owner = "client!cb", name = "g", descriptor = "(B)V")
    public static final void method1673(byte arg0) {
        class103.field1434 = 0;
        int var1 = (class217.field3280.field4085 >> 7) + class216.field3255;
        int var2 = (class217.field3280.field4019 >> 7) + class37.field565;
        if (arg0 != -96) {
            field3806 = false;
        }
        if (~var2 <= -3054 && var2 <= 3156 && ~var1 <= -3057 && ~var1 >= -3137) {
            class103.field1434 = 1;
        }
        if (var2 >= 3072 && ~var2 >= -3119 && ~var1 <= -9493 && var1 <= 9535) {
            class103.field1434 = 1;
        }
        if (class103.field1434 == 1 && var2 >= 3139 && var2 <= 3199 && var1 >= 3008 && var1 <= 3062) {
            class103.field1434 = 0;
        }
        ++field3813;
    }
}
