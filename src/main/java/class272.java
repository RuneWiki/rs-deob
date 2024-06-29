import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sc")
public class class272 extends class107 {

    @OriginalMember(owner = "client!sc", name = "P", descriptor = "I")
    private int field4381 = 0;

    @OriginalMember(owner = "client!sc", name = "Q", descriptor = "I")
    private int field4382 = 5;

    @OriginalMember(owner = "client!sc", name = "I", descriptor = "I")
    private int field4375 = 2;

    @OriginalMember(owner = "client!sc", name = "R", descriptor = "I")
    private int field4383 = 2048;

    @OriginalMember(owner = "client!sc", name = "S", descriptor = "I")
    private int field4384 = 5;

    @OriginalMember(owner = "client!sc", name = "F", descriptor = "[S")
    private short[] field4372 = new short[512];

    @OriginalMember(owner = "client!sc", name = "X", descriptor = "I")
    private int field4389 = 1;

    @OriginalMember(owner = "client!sc", name = "L", descriptor = "[B")
    private byte[] field4378 = new byte[512];

    @OriginalMember(owner = "client!sc", name = "D", descriptor = "I")
    public static int field4371 = 0;

    @OriginalMember(owner = "client!sc", name = "Y", descriptor = "I")
    public static int field4390 = 99;

    @OriginalMember(owner = "client!sc", name = "V", descriptor = "[I")
    public static int[] field4387 = new int[] { 1, 4 };

    @OriginalMember(owner = "client!sc", name = "Z", descriptor = "[Ljava/lang/String;")
    public static String[] field4391 = null;

    @OriginalMember(owner = "client!sc", name = "G", descriptor = "I")
    public static int field4373;

    @OriginalMember(owner = "client!sc", name = "H", descriptor = "I")
    public static int field4374;

    @OriginalMember(owner = "client!sc", name = "J", descriptor = "I")
    public static int field4376;

    @OriginalMember(owner = "client!sc", name = "K", descriptor = "I")
    public static int field4377;

    @OriginalMember(owner = "client!sc", name = "M", descriptor = "I")
    public static int field4379;

    @OriginalMember(owner = "client!sc", name = "N", descriptor = "I")
    public static int field4380;

    @OriginalMember(owner = "client!sc", name = "T", descriptor = "I")
    public static int field4385;

    @OriginalMember(owner = "client!sc", name = "U", descriptor = "I")
    public static int field4386;

    @OriginalMember(owner = "client!sc", name = "W", descriptor = "I")
    public static int field4388;

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(I)V")
    public static void method1801(int arg0) {
        field4391 = null;
        field4387 = null;
        if (arg0 != 18804) {
            field4371 = -45;
        }
    }

    @OriginalMember(owner = "client!sc", name = "d", descriptor = "(B)V")
    public final void method300(byte arg0) {
        ++field4388;
        this.field4378 = class169.method1202((byte) 60, this.field4381);
        this.method1804((byte) 110);
        if (arg0 != 35) {
            this.method1804((byte) 117);
        }
    }

    @OriginalMember(owner = "client!sc", name = "b", descriptor = "(II)[I")
    public final int[] method189(int arg0, int arg1) {
        int var3 = 41 / ((arg0 - -34) / 49);
        ++field4373;
        int[] var4 = super.field1661.method894(126, arg1);
        if (super.field1661.field2115) {
            int var5 = class259.field4254[arg1] * this.field4382 + 2048;
            int var6 = var5 >> 12;
            int var7 = var6 + 1;
            for (int var8 = 0; ~class24.field443 < ~var8; ++var8) {
                class213.field3381 = Integer.MAX_VALUE;
                class116.field1762 = Integer.MAX_VALUE;
                class147.field2358 = Integer.MAX_VALUE;
                class290.field4749 = Integer.MAX_VALUE;
                int var9 = class221.field3486[var8] * this.field4384 + 2048;
                int var10 = var9 >> 12;
                int var11 = var10 + 1;
                for (int var12 = var6 + -1; ~var7 <= ~var12; ++var12) {
                    int var14 = this.field4378[(~this.field4382 < ~var12 ? var12 : -this.field4382 + var12) & 255] & 255;
                    for (int var15 = var10 + -1; var15 <= var11; ++var15) {
                        int var16 = (255 & this.field4378[255 & var14 - -(var15 >= this.field4384 ? var15 - this.field4384 : var15)]) * 2;
                        int var10000 = var9 - (var15 << 12);
                        int var28 = var16 + 1;
                        int var17 = var10000 - this.field4372[var16];
                        int var18 = -(var12 << 12) - this.field4372[var28] + var5;
                        int var19 = this.field4389;
                        int var20;
                        if (~var19 != -2) {
                            if (~var19 != -4) {
                                if (~var19 != -5) {
                                    if (var19 != 5) {
                                        if (~var19 == -3) {
                                            var20 = (~var18 <= -1 ? var18 : -var18) + (~var17 <= -1 ? var17 : -var17);
                                        } else {
                                            var20 = (int) (Math.sqrt((double) ((float) (var17 * var17 - -(var18 * var18)) / 1.6777216E7F)) * 4096.0D);
                                        }
                                    } else {
                                        int var21 = var18 * var18;
                                        int var22 = var17 * var17;
                                        var20 = (int) (4096.0D * Math.sqrt(Math.sqrt((double) ((float) (var21 + var22) / 1.6777216E7F))));
                                    }
                                } else {
                                    int var23 = (int) (4096.0D * Math.sqrt((double) ((float) (~var17 <= -1 ? var17 : -var17) / 4096.0F)));
                                    int var24 = (int) (4096.0D * Math.sqrt((double) ((float) (var18 >= 0 ? var18 : -var18) / 4096.0F)));
                                    int var25 = var23 + var24;
                                    var20 = var25 * var25 >> 12;
                                }
                            } else {
                                int var26 = var18 < 0 ? -var18 : var18;
                                int var27 = var17 >= 0 ? var17 : -var17;
                                var20 = ~var27 >= ~var26 ? var26 : var27;
                            }
                        } else {
                            var20 = var17 * var17 + var18 * var18 >> 12;
                        }
                        if (var20 < class290.field4749) {
                            class213.field3381 = class116.field1762;
                            class116.field1762 = class147.field2358;
                            class147.field2358 = class290.field4749;
                            class290.field4749 = var20;
                        } else if (class147.field2358 <= var20) {
                            if (class116.field1762 > var20) {
                                class213.field3381 = class116.field1762;
                                class116.field1762 = var20;
                            } else if (var20 < class213.field3381) {
                                class213.field3381 = var20;
                            }
                        } else {
                            class213.field3381 = class116.field1762;
                            class116.field1762 = class147.field2358;
                            class147.field2358 = var20;
                        }
                    }
                }
                int var13 = this.field4375;
                if (~var13 != -1) {
                    if (~var13 != -2) {
                        if (var13 != 3) {
                            if (var13 != 4) {
                                if (~var13 == -3) {
                                    var4[var8] = -class290.field4749 + class147.field2358;
                                }
                            } else {
                                var4[var8] = class213.field3381;
                            }
                        } else {
                            var4[var8] = class116.field1762;
                        }
                    } else {
                        var4[var8] = class147.field2358;
                    }
                } else {
                    var4[var8] = class290.field4749;
                }
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILgi;IIZII)V")
    public static final void method1802(int arg0, class164 arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        class122.field1928 = arg2;
        class12.field230 = arg4;
        class298.field4859 = arg1;
        class161.field2631 = arg5;
        class88.field1378 = 1;
        ++field4379;
        if (arg0 > 68) {
            class249.field4093 = arg6;
            class76.field1226 = arg3;
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(ILfj;B)V")
    public final void method195(int arg0, class274 arg1, byte arg2) {
        ++field4376;
        if (arg0 != 0) {
            if (~arg0 != -2) {
                if (arg0 != 2) {
                    if (~arg0 != -4) {
                        if (~arg0 != -5) {
                            if (arg0 != 5) {
                                if (~arg0 == -7) {
                                    this.field4382 = arg1.method1849(255);
                                }
                            } else {
                                this.field4384 = arg1.method1849(255);
                            }
                        } else {
                            this.field4389 = arg1.method1849(255);
                        }
                    } else {
                        this.field4375 = arg1.method1849(255);
                    }
                } else {
                    this.field4383 = arg1.method1837(arg2 ^ 224);
                }
            } else {
                this.field4381 = arg1.method1849(arg2 + 227);
            }
        } else {
            this.field4384 = this.field4382 = arg1.method1849(arg2 + 227);
        }
        if (arg2 != 28) {
            this.method1804((byte) -65);
        }
    }

    @OriginalMember(owner = "client!sc", name = "a", descriptor = "(IZ)V")
    public static final void method1803(int arg0, boolean arg1) {
        if (arg0 != 2048) {
            field4387 = null;
        }
        ++field4380;
        class128.field2056 = arg1;
        if (!class128.field2056) {
            int var2 = class229.field3584.method1837(252);
            int var3 = class229.field3584.method1815(-101);
            boolean var4 = class48.method314(1, class229.field3584.method1854(false));
            int var5 = class229.field3584.method1815(-97);
            int var6 = class229.field3584.method1871((byte) -33);
            int var7 = (-class229.field3584.field4458 + class271.field4366) / 16;
            class304.field4955 = new int[var7][4];
            for (int var8 = 0; ~var7 < ~var8; ++var8) {
                for (int var15 = 0; ~var15 > -5; ++var15) {
                    class304.field4955[var8][var15] = class229.field3584.method1848((byte) -117);
                }
            }
            boolean var9 = false;
            if ((var3 / 8 == 48 || var3 / 8 == 49) && var2 / 8 == 48) {
                var9 = true;
            }
            if (var3 / 8 == 48 && var2 / 8 == 148) {
                var9 = true;
            }
            int var10 = class229.field3584.method1867((byte) -76);
            class197.field3176 = new byte[var7][];
            class33.field544 = new int[var7];
            class295.field4819 = null;
            class251.field4125 = null;
            class122.field1938 = new int[var7];
            class172.field2865 = new int[var7];
            class236.field3705 = new int[var7];
            class139.field2234 = new int[var7];
            class158.field2563 = new byte[var7][];
            int var11 = 0;
            for (int var12 = (var3 - 6) / 8; var12 <= (var3 + 6) / 8; ++var12) {
                for (int var13 = (var2 - 6) / 8; var13 <= (var2 + 6) / 8; ++var13) {
                    int var14 = (var12 << 8) + var13;
                    if (!var9 || ~var13 != -50 && var13 != 149 && var13 != 147 && var12 != 50 && (var12 != 49 || ~var13 != -48)) {
                        class122.field1938[var11] = var14;
                        class236.field3705[var11] = class175.field2919.method1160("m" + var12 + "_" + var13, -1);
                        class33.field544[var11] = class175.field2919.method1160("l" + var12 + "_" + var13, -1);
                        class139.field2234[var11] = class175.field2919.method1160("um" + var12 + "_" + var13, arg0 + -2049);
                        class172.field2865[var11] = class175.field2919.method1160("ul" + var12 + "_" + var13, -1);
                    } else {
                        class122.field1938[var11] = var14;
                        class236.field3705[var11] = -1;
                        class33.field544[var11] = -1;
                        class139.field2234[var11] = -1;
                        class172.field2865[var11] = -1;
                    }
                    ++var11;
                }
            }
            class93.method655(var6, var3, false, var10, var4, var5, var2, 84);
        } else {
            int var16 = class229.field3584.method1829(67);
            int var17 = class229.field3584.method1837(arg0 ^ 2300);
            boolean var18 = class48.method314(1, class229.field3584.method1826(30334));
            int var19 = class229.field3584.method1815(-96);
            int var20 = class229.field3584.method1815(arg0 ^ -2169);
            class229.field3584.method2085(arg0 + -1976);
            for (int var21 = 0; ~var21 > -5; ++var21) {
                for (int var37 = 0; var37 < 13; ++var37) {
                    for (int var38 = 0; var38 < 13; ++var38) {
                        int var39 = class229.field3584.method2087(1, (byte) -28);
                        if (var39 != 1) {
                            class290.field4757[var21][var37][var38] = -1;
                        } else {
                            class290.field4757[var21][var37][var38] = class229.field3584.method2087(26, (byte) 127);
                        }
                    }
                }
            }
            class229.field3584.method2075(21423);
            int var22 = (-class229.field3584.field4458 + class271.field4366) / 16;
            class304.field4955 = new int[var22][4];
            for (int var23 = 0; ~var23 > ~var22; ++var23) {
                for (int var36 = 0; var36 < 4; ++var36) {
                    class304.field4955[var23][var36] = class229.field3584.method1848((byte) -109);
                }
            }
            int var24 = class229.field3584.method1849(arg0 ^ 2303);
            class197.field3176 = new byte[var22][];
            class236.field3705 = new int[var22];
            class295.field4819 = null;
            class251.field4125 = null;
            class172.field2865 = new int[var22];
            class158.field2563 = new byte[var22][];
            class139.field2234 = new int[var22];
            class122.field1938 = new int[var22];
            class33.field544 = new int[var22];
            int var25 = 0;
            for (int var26 = 0; var26 < 4; ++var26) {
                for (int var27 = 0; ~var27 > -14; ++var27) {
                    for (int var28 = 0; var28 < 13; ++var28) {
                        int var29 = class290.field4757[var26][var27][var28];
                        if (~var29 != 0) {
                            int var30 = (16774997 & var29) >> 14;
                            int var31 = (var29 & 16378) >> 3;
                            int var32 = (var30 / 8 << 8) - -(var31 / 8);
                            for (int var33 = 0; ~var33 > ~var25; ++var33) {
                                if (~class122.field1938[var33] == ~var32) {
                                    var32 = -1;
                                    break;
                                }
                            }
                            if (var32 != -1) {
                                int var34 = 255 & var32 >> 8;
                                class122.field1938[var25] = var32;
                                int var35 = 255 & var32;
                                class236.field3705[var25] = class175.field2919.method1160("m" + var34 + "_" + var35, arg0 + -2049);
                                class33.field544[var25] = class175.field2919.method1160("l" + var34 + "_" + var35, -1);
                                class139.field2234[var25] = class175.field2919.method1160("um" + var34 + "_" + var35, -1);
                                class172.field2865[var25] = class175.field2919.method1160("ul" + var34 + "_" + var35, -1);
                                ++var25;
                            }
                        }
                    }
                }
            }
            class93.method655(var24, var19, false, var20, var18, var17, var16, 49);
        }
    }

    @OriginalMember(owner = "client!sc", name = "e", descriptor = "(B)V")
    private final void method1804(byte arg0) {
        ++field4385;
        if (arg0 <= 76) {
            this.field4378 = null;
        }
        Random var2 = new Random((long) this.field4381);
        this.field4372 = new short[512];
        if (~this.field4383 < -1) {
            for (int var3 = 0; var3 < 512; ++var3) {
                this.field4372[var3] = (short) class182.method1288(21953, var2, this.field4383);
            }
        }
    }

    @OriginalMember(owner = "client!sc", name = "<init>", descriptor = "()V")
    public class272() {
        super(0, true);
    }
}
