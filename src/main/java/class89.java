import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kg")
public class class89 extends class182 {

    @OriginalMember(owner = "client!kg", name = "P", descriptor = "I")
    private int field1461 = 4;

    @OriginalMember(owner = "client!kg", name = "S", descriptor = "I")
    private int field1464 = 1638;

    @OriginalMember(owner = "client!kg", name = "cb", descriptor = "[B")
    private byte[] field1474 = new byte[512];

    @OriginalMember(owner = "client!kg", name = "eb", descriptor = "I")
    private int field1476 = 4;

    @OriginalMember(owner = "client!kg", name = "ab", descriptor = "I")
    private int field1472 = 0;

    @OriginalMember(owner = "client!kg", name = "U", descriptor = "I")
    private int field1466 = 4;

    @OriginalMember(owner = "client!kg", name = "fb", descriptor = "Z")
    private boolean field1477 = true;

    @OriginalMember(owner = "client!kg", name = "O", descriptor = "I")
    public static int field1460 = 0;

    @OriginalMember(owner = "client!kg", name = "Q", descriptor = "I")
    public static int field1462;

    @OriginalMember(owner = "client!kg", name = "R", descriptor = "I")
    public static int field1463;

    @OriginalMember(owner = "client!kg", name = "W", descriptor = "I")
    public static int field1468;

    @OriginalMember(owner = "client!kg", name = "X", descriptor = "I")
    public static int field1469;

    @OriginalMember(owner = "client!kg", name = "Y", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!kg", name = "Z", descriptor = "I")
    public static int field1471;

    @OriginalMember(owner = "client!kg", name = "bb", descriptor = "I")
    public static int field1473;

    @OriginalMember(owner = "client!kg", name = "db", descriptor = "I")
    public static int field1475;

    @OriginalMember(owner = "client!kg", name = "gb", descriptor = "I")
    public static int field1478;

    @OriginalMember(owner = "client!kg", name = "hb", descriptor = "I")
    public static int field1479;

    @OriginalMember(owner = "client!kg", name = "T", descriptor = "[S")
    private short[] field1465;

    @OriginalMember(owner = "client!kg", name = "V", descriptor = "[S")
    private short[] field1467;

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIII)V")
    public static final void method618(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var7 = 0;
        ++field1473;
        class170.method1272(0, arg0);
        int var8 = arg0;
        int var9 = -arg0;
        int var10 = -arg4 + arg0;
        if (~var10 > -1) {
            var10 = 0;
        }
        if (arg6 < 20) {
            method623(124, (String) null);
        }
        int var11 = -var10;
        int var12 = var10;
        int var13 = -1;
        if (~arg1 <= ~class55.field972 && ~arg1 >= ~class240.field4053) {
            int[] var14 = class41.field630[arg1];
            int var15 = class243.method1742(class23.field423, 0, class272.field4552, -arg0 + arg2);
            int var16 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - -arg0);
            int var17 = class243.method1742(class23.field423, 0, class272.field4552, -var10 + arg2);
            int var18 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - -var10);
            class134.method996(0, var17, var15, arg5, var14);
            class134.method996(0, var18, var17, arg3, var14);
            class134.method996(0, var16, var18, arg5, var14);
        }
        int var19 = -1;
        while (~var8 < ~var7) {
            var13 += 2;
            var11 += var13;
            if (var11 >= 0 && ~var12 <= -2) {
                --var12;
                class158.field2591[var12] = var7;
                var11 -= var12 << 1;
            }
            var19 += 2;
            ++var7;
            var9 += var19;
            if (var9 >= 0) {
                --var8;
                int var20 = -var8 + arg1;
                var9 -= var8 << 1;
                int var21 = arg1 + var8;
                if (class55.field972 <= var21 && ~var20 >= ~class240.field4053) {
                    if (~var10 >= ~var8) {
                        int var22 = class243.method1742(class23.field423, 0, class272.field4552, arg2 - -var7);
                        int var23 = class243.method1742(class23.field423, 0, class272.field4552, -var7 + arg2);
                        if (var21 <= class240.field4053) {
                            class134.method996(0, var22, var23, arg5, class41.field630[var21]);
                        }
                        if (var20 >= class55.field972) {
                            class134.method996(0, var22, var23, arg5, class41.field630[var20]);
                        }
                    } else {
                        int var24 = class158.field2591[var8];
                        int var25 = class243.method1742(class23.field423, 0, class272.field4552, arg2 + var7);
                        int var26 = class243.method1742(class23.field423, 0, class272.field4552, -var7 + arg2);
                        int var27 = class243.method1742(class23.field423, 0, class272.field4552, arg2 + var24);
                        int var28 = class243.method1742(class23.field423, 0, class272.field4552, -var24 + arg2);
                        if (var21 <= class240.field4053) {
                            int[] var29 = class41.field630[var21];
                            class134.method996(0, var28, var26, arg5, var29);
                            class134.method996(0, var27, var28, arg3, var29);
                            class134.method996(0, var25, var27, arg5, var29);
                        }
                        if (var20 >= class55.field972) {
                            int[] var30 = class41.field630[var20];
                            class134.method996(0, var28, var26, arg5, var30);
                            class134.method996(0, var27, var28, arg3, var30);
                            class134.method996(0, var25, var27, arg5, var30);
                        }
                    }
                }
            }
            int var31 = arg1 - var7;
            int var32 = arg1 + var7;
            if (class55.field972 <= var32 && ~var31 >= ~class240.field4053) {
                int var33 = arg2 + var8;
                int var34 = -var8 + arg2;
                if (~var33 <= ~class23.field423 && class272.field4552 >= var34) {
                    int var35 = class243.method1742(class23.field423, 0, class272.field4552, var33);
                    int var36 = class243.method1742(class23.field423, 0, class272.field4552, var34);
                    if (var7 >= var10) {
                        if (~var32 >= ~class240.field4053) {
                            class134.method996(0, var35, var36, arg5, class41.field630[var32]);
                        }
                        if (var31 >= class55.field972) {
                            class134.method996(0, var35, var36, arg5, class41.field630[var31]);
                        }
                    } else {
                        int var37 = ~var12 > ~var7 ? class158.field2591[var7] : var12;
                        int var38 = class243.method1742(class23.field423, 0, class272.field4552, arg2 + var37);
                        int var39 = class243.method1742(class23.field423, 0, class272.field4552, -var37 + arg2);
                        if (class240.field4053 >= var32) {
                            int[] var40 = class41.field630[var32];
                            class134.method996(0, var39, var36, arg5, var40);
                            class134.method996(0, var38, var39, arg3, var40);
                            class134.method996(0, var35, var38, arg5, var40);
                        }
                        if (class55.field972 <= var31) {
                            int[] var41 = class41.field630[var31];
                            class134.method996(0, var39, var36, arg5, var41);
                            class134.method996(0, var38, var39, arg3, var41);
                            class134.method996(0, var35, var38, arg5, var41);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIII)V")
    public static final void method619(int arg0, int arg1, int arg2, int arg3, int arg4) {
        ++field1471;
        class253 var5 = (class253) class209.field3536.method309(0);
        if (arg4 < 94) {
            method619(-27, -13, 22, -92, 96);
        }
        while (var5 != null) {
            class135.method1001(-104, arg0, arg1, arg3, arg2, var5);
            var5 = (class253) class209.field3536.method312((byte) -113);
        }
        for (class253 var6 = (class253) class237.field3995.method309(0); var6 != null; var6 = (class253) class237.field3995.method312((byte) -115)) {
            byte var11 = 1;
            class190 var12 = var6.field4280.method282(-1399);
            if (~var6.field4280.field782 != ~var12.field3072) {
                if (~var6.field4280.field782 != ~var12.field3082 && var6.field4280.field782 != var12.field3056 && var6.field4280.field782 != var12.field3084 && ~var6.field4280.field782 != ~var12.field3051) {
                    if (var6.field4280.field782 == var12.field3061 || ~var6.field4280.field782 == ~var12.field3059 || ~var6.field4280.field782 == ~var12.field3060 || ~var6.field4280.field782 == ~var12.field3041) {
                        var11 = 3;
                    }
                } else {
                    var11 = 2;
                }
            } else {
                var11 = 0;
            }
            if (~var6.field4299 != ~var11) {
                int var13 = class226.method1597((byte) 124, var6.field4280);
                if (~var6.field4287 != ~var13) {
                    if (var6.field4289 != null) {
                        class278.field4627.method113(var6.field4289);
                        var6.field4289 = null;
                    }
                    var6.field4287 = var13;
                }
                var6.field4299 = var11;
            }
            var6.field4273 = var6.field4280.field715;
            var6.field4292 = var6.field4280.field715 + var6.field4280.method294((byte) -105) * 64;
            var6.field4294 = var6.field4280.field771;
            var6.field4296 = var6.field4280.field771 - -(var6.field4280.method294((byte) -108) * 64);
            class135.method1001(-107, arg0, arg1, arg3, arg2, var6);
        }
        for (class253 var7 = (class253) class259.field4355.method982(-9570); var7 != null; var7 = (class253) class259.field4355.method981(-1)) {
            byte var8 = 1;
            class190 var9 = var7.field4281.method282(-1399);
            if (~var7.field4281.field782 == ~var9.field3072) {
                var8 = 0;
            } else if (var7.field4281.field782 != var9.field3082 && ~var7.field4281.field782 != ~var9.field3056 && var7.field4281.field782 != var9.field3084 && var7.field4281.field782 != var9.field3051) {
                if (var7.field4281.field782 == var9.field3061 || var7.field4281.field782 == var9.field3059 || ~var7.field4281.field782 == ~var9.field3060 || var7.field4281.field782 == var9.field3041) {
                    var8 = 3;
                }
            } else {
                var8 = 2;
            }
            if (~var7.field4299 != ~var8) {
                int var10 = class78.method550(15544, var7.field4281);
                if (var7.field4287 != var10) {
                    if (var7.field4289 != null) {
                        class278.field4627.method113(var7.field4289);
                        var7.field4289 = null;
                    }
                    var7.field4287 = var10;
                }
                var7.field4299 = var8;
            }
            var7.field4273 = var7.field4281.field715;
            var7.field4292 = var7.field4281.field715 + var7.field4281.method294((byte) -112) * 64;
            var7.field4294 = var7.field4281.field771;
            var7.field4296 = var7.field4281.field771 - -(var7.field4281.method294((byte) -127) * 64);
            class135.method1001(-128, arg0, arg1, arg3, arg2, var7);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IZI)V")
    public static final void method620(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            method623(34, (String) null);
        }
        class49 var3 = class125.field2101[class182.field2898][arg2][arg0];
        ++field1479;
        if (var3 == null) {
            class145.method1071(class182.field2898, arg2, arg0);
        } else {
            int var4 = -99999999;
            class61 var5 = null;
            for (class61 var6 = (class61) var3.method309(0); var6 != null; var6 = (class61) var3.method312((byte) -69)) {
                class71 var13 = class13.method75(false, var6.field1050.field2193);
                int var14 = var13.field1203;
                if (~var13.field1183 == -2) {
                    var14 = (var6.field1050.field2199 + 1) * var14;
                }
                if (~var14 < ~var4) {
                    var4 = var14;
                    var5 = var6;
                }
            }
            if (var5 == null) {
                class145.method1071(class182.field2898, arg2, arg0);
            } else {
                var3.method313(1, var5);
                class61 var7 = (class61) var3.method309(0);
                class133 var8 = null;
                class133 var9 = null;
                while (var7 != null) {
                    class133 var12 = var7.field1050;
                    if (var5.field1050.field2193 != var12.field2193) {
                        if (var9 == null) {
                            var9 = var12;
                        }
                        if (var9.field2193 != var12.field2193 && var8 == null) {
                            var8 = var12;
                        }
                    }
                    var7 = (class61) var3.method312((byte) 90);
                }
                long var10 = (long) ((arg0 << 7) + arg2 + 1610612736);
                class290.method2013(class182.field2898, arg2, arg0, class277.method1939(class182.field2898, arg2 * 128 + 64, arg0 * 128 + 64, (byte) -34), var5.field1050, var10, var9, var8);
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZLab;I)V")
    public final void method155(boolean arg0, class249 arg1, int arg2) {
        if (!arg0) {
            ++field1470;
            if (~arg2 != -1) {
                if (arg2 == 1) {
                    this.field1466 = arg1.method1802((byte) 104);
                } else {
                    if (~arg2 != -3) {
                        if (~arg2 == -4) {
                            this.field1476 = this.field1461 = arg1.method1802((byte) -117);
                            return;
                        }
                        if (arg2 == 4) {
                            this.field1472 = arg1.method1802((byte) -116);
                            return;
                        }
                        if (arg2 == 5) {
                            this.field1476 = arg1.method1802((byte) -125);
                            return;
                        }
                        if (arg2 == 6) {
                            this.field1461 = arg1.method1802((byte) 94);
                            return;
                        }
                    } else {
                        this.field1464 = arg1.method1762(-1);
                        if (this.field1464 < 0) {
                            this.field1467 = new short[this.field1466];
                            for (int var5 = 0; ~var5 > ~this.field1466; ++var5) {
                                this.field1467[var5] = (short) arg1.method1762(-1);
                            }
                            return;
                        }
                    }
                }
            } else {
                this.field1477 = ~arg1.method1802((byte) 33) == -2;
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "<init>", descriptor = "()V")
    public class89() {
        super(0, true);
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ZI)[I")
    public final int[] method153(boolean arg0, int arg1) {
        ++field1462;
        if (arg0) {
            this.field1472 = -40;
        }
        int[] var3 = super.field2911.method77(arg1, -41);
        if (super.field2911.field287) {
            this.method624(var3, arg1, 1);
        }
        return var3;
    }

    @OriginalMember(owner = "client!kg", name = "g", descriptor = "(I)V")
    public final void method469(int arg0) {
        this.field1474 = class31.method196(107, this.field1472);
        ++field1478;
        if (arg0 != -1) {
            this.field1465 = null;
        }
        this.method622(-107);
        for (int var2 = this.field1466 - 1; var2 >= 1; --var2) {
            short var3 = this.field1467[var2];
            if (~var3 < -9) {
                return;
            }
            if (~var3 > 7) {
                return;
            }
            --this.field1466;
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(IIIIIIB)I")
    private final int method621(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        ++field1475;
        int var8 = arg5 + -4096;
        int var9 = arg1 >> 12;
        int var10 = arg1 & 4095;
        int var11 = var10 + -4096;
        int var12 = var9 + 1;
        int var13 = class210.field3540[var10];
        int var14 = var9 & 255;
        int var15 = 3 & this.field1474[arg4 + var14];
        int var16;
        if (var15 > 1) {
            var16 = ~var15 != -3 ? -arg5 + -var10 : -arg5 + var10;
        } else {
            var16 = ~var15 == -1 ? arg5 + var10 : -var10 + arg5;
        }
        if (var12 >= arg2) {
            var12 = 0;
        }
        int var17 = var12 & 255;
        int var18 = this.field1474[var17 - -arg4] & 3;
        int var19;
        if (var18 <= 1) {
            var19 = ~var18 == -1 ? var11 - -arg5 : -var11 + arg5;
        } else {
            var19 = ~var18 == -3 ? -arg5 + var11 : -arg5 + -var11;
        }
        int var20 = 3 & this.field1474[arg0 + var14];
        int var21 = 83 % ((arg6 - 55) / 50);
        int var22 = ((-var16 + var19) * var13 >> 12) + var16;
        int var23;
        if (var20 > 1) {
            var23 = ~var20 == -3 ? -var8 + var10 : -var8 + -var10;
        } else {
            var23 = ~var20 != -1 ? -var10 + var8 : var8 + var10;
        }
        int var24 = 3 & this.field1474[arg0 + var17];
        int var25;
        if (~var24 < -2) {
            var25 = ~var24 != -3 ? -var8 + -var11 : var11 - var8;
        } else {
            var25 = ~var24 == -1 ? var8 + var11 : -var11 + var8;
        }
        int var26 = var23 - -((-var23 + var25) * var13 >> 12);
        return ((var26 - var22) * arg3 >> 12) + var22;
    }

    @OriginalMember(owner = "client!kg", name = "j", descriptor = "(I)V")
    private final void method622(int arg0) {
        ++field1469;
        if (arg0 <= -99) {
            if (this.field1464 > 0) {
                this.field1467 = new short[this.field1466];
                this.field1465 = new short[this.field1466];
                for (int var2 = 0; ~var2 > ~this.field1466; ++var2) {
                    this.field1467[var2] = (short) ((int) (4096.0D * Math.pow((double) ((float) this.field1464 / 4096.0F), (double) var2)));
                    this.field1465[var2] = (short) ((int) Math.pow(2.0D, (double) var2));
                }
            } else if (this.field1467 != null && ~this.field1467.length == ~this.field1466) {
                this.field1465 = new short[this.field1466];
                for (int var3 = 0; ~this.field1466 < ~var3; ++var3) {
                    this.field1465[var3] = (short) ((int) Math.pow(2.0D, (double) var3));
                }
            }
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public static final boolean method623(int arg0, String arg1) {
        ++field1468;
        if (arg1 == null) {
            return false;
        } else {
            for (int var2 = 0; var2 < class76.field1296; ++var2) {
                if (arg1.equalsIgnoreCase(class190.field3040[var2])) {
                    return true;
                }
            }
            if (arg0 != 1100172428) {
                field1460 = 123;
            }
            return arg1.equalsIgnoreCase(class16.field314.field2069);
        }
    }

    @OriginalMember(owner = "client!kg", name = "a", descriptor = "([III)V")
    private final void method624(int[] arg0, int arg1, int arg2) {
        ++field1463;
        int var4 = class66.field1112[arg1] * this.field1461;
        if (arg2 == 1) {
            if (~this.field1466 != -2) {
                short var5 = this.field1467[0];
                if (var5 > 8 || ~var5 > 7) {
                    int var6 = this.field1465[0] << 12;
                    int var7 = this.field1476 * var6 >> 12;
                    int var8 = var4 * var6 >> 12;
                    int var9 = var8 >> 12;
                    int var10 = var9 + 1;
                    int var11 = var8 & 4095;
                    int var12 = this.field1474[255 & var9] & 255;
                    int var13 = this.field1461 * var6 >> 12;
                    if (~var10 <= ~var13) {
                        var10 = 0;
                    }
                    int var14 = class210.field3540[var11];
                    int var15 = 255 & this.field1474[var10 & 255];
                    for (int var16 = 0; class4.field116 > var16; ++var16) {
                        int var36 = class207.field3415[var16] * this.field1476;
                        int var37 = this.method621(var15, var6 * var36 >> 12, var7, var14, var12, var11, (byte) -7);
                        arg0[var16] = var5 * var37 >> 12;
                    }
                }
                for (int var17 = 1; this.field1466 > var17; ++var17) {
                    short var18 = this.field1467[var17];
                    if (var18 > 8 || ~var18 > 7) {
                        int var19 = this.field1465[var17] << 12;
                        int var20 = this.field1476 * var19 >> 12;
                        int var21 = this.field1461 * var19 >> 12;
                        int var22 = var4 * var19 >> 12;
                        int var23 = var22 >> 12;
                        int var24 = var22 & 4095;
                        int var25 = class210.field3540[var24];
                        int var26 = 255 & this.field1474[var23 & 255];
                        int var27 = var23 - -1;
                        if (var27 >= var21) {
                            var27 = 0;
                        }
                        int var28 = this.field1474[var27 & 255] & 255;
                        if (this.field1477 && ~(this.field1466 + -1) == ~var17) {
                            for (int var29 = 0; class4.field116 > var29; ++var29) {
                                int var30 = class207.field3415[var29] * this.field1476;
                                int var31 = this.method621(var28, var19 * var30 >> 12, var20, var25, var26, var24, (byte) 2);
                                int var32 = (var18 * var31 >> 12) + arg0[var29];
                                arg0[var29] = (var32 >> 1) + 2048;
                            }
                        } else {
                            for (int var33 = 0; ~class4.field116 < ~var33; ++var33) {
                                int var34 = class207.field3415[var33] * this.field1476;
                                int var35 = this.method621(var28, var19 * var34 >> 12, var20, var25, var26, var24, (byte) 126);
                                arg0[var33] += var18 * var35 >> 12;
                            }
                        }
                    }
                }
            } else {
                short var38 = this.field1467[0];
                int var39 = this.field1465[0] << 12;
                int var40 = var4 * var39 >> 12;
                int var41 = this.field1476 * var39 >> 12;
                int var42 = var40 >> 12;
                int var43 = var40 & 4095;
                int var44 = var42 + 1;
                int var45 = class210.field3540[var43];
                int var46 = this.field1461 * var39 >> 12;
                int var47 = 255 & this.field1474[255 & var42];
                if (var44 >= var46) {
                    var44 = 0;
                }
                int var48 = this.field1474[255 & var44] & 255;
                if (this.field1477) {
                    for (int var49 = 0; var49 < class4.field116; ++var49) {
                        int var50 = class207.field3415[var49] * this.field1476;
                        int var51 = this.method621(var48, var39 * var50 >> 12, var41, var45, var47, var43, (byte) -40);
                        int var52 = var38 * var51 >> 12;
                        arg0[var49] = (var52 >> 1) + 2048;
                    }
                } else {
                    for (int var53 = 0; class4.field116 > var53; ++var53) {
                        int var54 = class207.field3415[var53] * this.field1476;
                        int var55 = this.method621(var48, var39 * var54 >> 12, var41, var45, var47, var43, (byte) -27);
                        arg0[var53] = var38 * var55 >> 12;
                    }
                }
            }
        }
    }
}
