import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!id")
public class class609 extends class237 {

    @OriginalMember(owner = "client!id", name = "D", descriptor = "[I")
    private int[] field8605 = new int[this.field3419];

    @OriginalMember(owner = "client!id", name = "y", descriptor = "S")
    public static short field8600 = 320;

    @OriginalMember(owner = "client!id", name = "o", descriptor = "I")
    private int field8590;

    @OriginalMember(owner = "client!id", name = "q", descriptor = "I")
    public static int field8592;

    @OriginalMember(owner = "client!id", name = "r", descriptor = "I")
    public static int field8593;

    @OriginalMember(owner = "client!id", name = "s", descriptor = "I")
    public static int field8594;

    @OriginalMember(owner = "client!id", name = "t", descriptor = "I")
    public static int field8595;

    @OriginalMember(owner = "client!id", name = "u", descriptor = "I")
    private int field8596;

    @OriginalMember(owner = "client!id", name = "w", descriptor = "I")
    public static int field8598;

    @OriginalMember(owner = "client!id", name = "x", descriptor = "I")
    public static int field8599;

    @OriginalMember(owner = "client!id", name = "A", descriptor = "I")
    public static int field8602;

    @OriginalMember(owner = "client!id", name = "C", descriptor = "I")
    public static int field8604;

    @OriginalMember(owner = "client!id", name = "E", descriptor = "I")
    public static int field8606;

    @OriginalMember(owner = "client!id", name = "p", descriptor = "Lqda;")
    public static class112 field8591;

    @OriginalMember(owner = "client!id", name = "z", descriptor = "Ljava/lang/Object;")
    public static Object field8601;

    @OriginalMember(owner = "client!id", name = "B", descriptor = "[B")
    private byte[] field8603;

    @OriginalMember(owner = "client!id", name = "v", descriptor = "[Lre;")
    public static class625[] field8597;

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(IIIBI)V")
    public static final void method3508(int arg0, int arg1, int arg2, byte arg3, int arg4) {
        ++field8606;
        int var5 = class502.field7180;
        if (~var5 != -1) {
            if (var5 != 1) {
                if (var5 == 2) {
                    if (~class432.field6152 < ~arg1) {
                        class432.field6152 = arg1;
                    }
                    if (arg2 > class293.field4432) {
                        class293.field4432 = arg2;
                    }
                    if (~arg4 < ~class490.field6968) {
                        class490.field6968 = arg4;
                    }
                    if (class396.field5621 > arg0) {
                        class396.field5621 = arg0;
                    }
                } else if (arg3 != -60) {
                    method3510(true);
                }
            } else {
                class490.field6968 = arg4;
                class432.field6152 = arg1;
                class396.field5621 = arg0;
                class502.field7180 = 2;
                class293.field4432 = arg2;
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ILha;ILwq;I)V")
    public static final void method3509(int arg0, class66 arg1, int arg2, class176 arg3, int arg4) {
        if (arg4 != 30481) {
            method3513(100);
        }
        ++field8599;
        class510 var5 = arg3.method1323(arg4 ^ -9291, arg1);
        if (var5 != null) {
            arg1.method455(arg2, arg0, arg2 - -arg3.field2673, arg0 - -arg3.field2664);
            if (~class2.field22 != -3 && class2.field22 != 5 && field8591 != null) {
                int var6;
                int var7;
                int var8;
                int var9;
                if (class763.field10510 == 4) {
                    var6 = 16383 & (int) (-class562.field8001);
                    var7 = 4096;
                    var8 = class579.field8185;
                    var9 = class75.field1009;
                } else {
                    var7 = 4096 - class611.field8630 * 16;
                    var8 = class251.field3549.field7719;
                    var9 = class251.field3549.field7718;
                    var6 = (int) (-class562.field8001) + class77.field1042 & 16383;
                }
                int var10 = var9 / 128 + -((class109.field1314 + -104) * 2) + 48;
                int var11 = class760.field10479 * 4 + 48 + -(class760.field10479 * 2) + 208 - var8 / 128;
                field8591.method801((float) arg3.field2673 / 2.0F + (float) arg2, (float) arg3.field2664 / 2.0F + (float) arg0, (float) var10, (float) var11, var7, var6 << 2, var5, arg2, arg0);
                for (class633 var12 = (class633) class385.field5485.method2508((byte) -39); var12 != null; var12 = (class633) class385.field5485.method2505((byte) -55)) {
                    int var58 = var12.field8932;
                    int var59 = ((class663.field9307.field3467[var58] & 268421698) >> 14) + -class103.field1295;
                    int var60 = (class663.field9307.field3467[var58] & 16383) + -class175.field2496;
                    int var61 = var59 * 4 + 2 + -(var9 / 128);
                    int var62 = var60 * 4 - var8 / 128 + 2;
                    class113.method803(var62, arg2, arg3, arg0, arg4 ^ 30489, arg1, var5, var61, class663.field9307.field3469[var58]);
                }
                for (int var13 = 0; class677.field9636 > var13; ++var13) {
                    int var55 = class219.field3130[var13] * 4 - var9 / 128 + 2;
                    int var56 = class551.field7856[var13] * 4 + -(var8 / 128) + 2;
                    class322 var57 = class496.field7061.method319(arg4 ^ 30537, class567.field8028[var13]);
                    if (var57.field4830 != null) {
                        var57 = var57.method2099(class271.field3796, arg4 + -30597);
                        if (var57 == null || ~var57.field4807 == 0) {
                            continue;
                        }
                    }
                    class113.method803(var56, arg2, arg3, arg0, 8, arg1, var5, var55, var57.field4807);
                }
                for (class541 var14 = (class541) class70.field959.method382(0); var14 != null; var14 = (class541) class70.field959.method391(37)) {
                    int var50 = (int) (var14.field7577 >> 28 & 3L);
                    if (class546.field7706 == var50) {
                        int var51 = (int) (var14.field7577 & 16383L) + -class103.field1295;
                        int var52 = -class175.field2496 + (int) (var14.field7577 >> 14 & 16383L);
                        int var53 = var51 * 4 - -2 + -(var9 / 128);
                        int var54 = var52 * 4 - (-2 - -(var8 / 128));
                        class395.method2411(var5, var54, arg0, class151.field2055[0], var53, arg2, arg4 + -30480, arg3);
                    }
                }
                for (int var15 = 0; ~var15 > ~class26.field379; ++var15) {
                    class14 var45 = (class14) class543.field7606.method380((byte) -3, (long) class790.field10846[var15]);
                    if (var45 != null) {
                        class645 var46 = var45.field262;
                        if (var46.method3688(0) && ~class251.field3549.field7710 == ~var46.field7710) {
                            class279 var47 = var46.field9071;
                            if (var47 != null && var47.field3943 != null) {
                                var47 = var47.method1810((byte) -106, class271.field3796);
                            }
                            if (var47 != null && var47.field3915 && var47.field3894) {
                                int var48 = var46.field7718 / 128 + -(var9 / 128);
                                int var49 = var46.field7719 / 128 + -(var8 / 128);
                                if (~var47.field3885 == 0) {
                                    class395.method2411(var5, var49, arg0, class151.field2055[1], var48, arg2, 1, arg3);
                                } else {
                                    class113.method803(var49, arg2, arg3, arg0, 8, arg1, var5, var48, var47.field3885);
                                }
                            }
                        }
                    }
                }
                int var16 = class147.field1873;
                int[] var17 = class568.field8045;
                for (int var18 = 0; var18 < var16; ++var18) {
                    class559 var37 = class581.field8250[var17[var18]];
                    if (var37 != null && var37.method3241(0) && !var37.field7945 && class251.field3549 != var37 && class251.field3549.field7710 == var37.field7710) {
                        int var38 = var37.field7718 / 128 + -(var9 / 128);
                        int var39 = var37.field7719 / 128 + -(var8 / 128);
                        boolean var40 = false;
                        for (int var41 = 0; class50.field719 > var41; ++var41) {
                            if (var37.field7955.equals(class662.field9293[var41]) && ~class146.field1861[var41] != -1) {
                                var40 = true;
                                break;
                            }
                        }
                        boolean var42 = false;
                        for (int var43 = 0; class75.field1011 > var43; ++var43) {
                            if (var37.field7955.equals(class269.field3772[var43].field1292)) {
                                var42 = true;
                                break;
                            }
                        }
                        boolean var44 = false;
                        if (~class251.field3549.field7952 != -1 && var37.field7952 != 0 && ~class251.field3549.field7952 == ~var37.field7952) {
                            var44 = true;
                        }
                        if (var37.field7950) {
                            class395.method2411(var5, var39, arg0, class151.field2055[6], var38, arg2, 1, arg3);
                        } else if (var44) {
                            class395.method2411(var5, var39, arg0, class151.field2055[4], var38, arg2, 1, arg3);
                        } else if (var37.field7948) {
                            class395.method2411(var5, var39, arg0, class151.field2055[7], var38, arg2, arg4 ^ 30480, arg3);
                        } else if (var40) {
                            class395.method2411(var5, var39, arg0, class151.field2055[3], var38, arg2, 1, arg3);
                        } else if (var42) {
                            class395.method2411(var5, var39, arg0, class151.field2055[5], var38, arg2, 1, arg3);
                        } else {
                            class395.method2411(var5, var39, arg0, class151.field2055[2], var38, arg2, arg4 ^ 30480, arg3);
                        }
                    }
                }
                class253[] var19 = class443.field6310;
                for (int var20 = 0; ~var20 > ~var19.length; ++var20) {
                    class253 var23 = var19[var20];
                    if (var23 != null && var23.field3558 != 0 && class673.field9441 % 20 < 10) {
                        if (~var23.field3558 == -2) {
                            class14 var24 = (class14) class543.field7606.method380((byte) -3, (long) var23.field3565);
                            if (var24 != null) {
                                class645 var25 = var24.field262;
                                int var26 = var25.field7718 / 128 - var9 / 128;
                                int var27 = var25.field7719 / 128 + -(var8 / 128);
                                class165.method1288(var26, -99, var23.field3560, arg3, arg0, var5, var27, 360000L, arg2);
                            }
                        }
                        if (var23.field3558 == 2) {
                            int var28 = var23.field3559 / 128 + -(var9 / 128);
                            int var29 = var23.field3564 / 128 - var8 / 128;
                            long var30 = (long) (var23.field3566 << 7);
                            long var32 = var30 * var30;
                            class165.method1288(var28, -110, var23.field3560, arg3, arg0, var5, var29, var32, arg2);
                        }
                        if (var23.field3558 == 10 && var23.field3565 >= 0 && ~var23.field3565 > ~class581.field8250.length) {
                            class559 var34 = class581.field8250[var23.field3565];
                            if (var34 != null) {
                                int var35 = var34.field7718 / 128 + -(var9 / 128);
                                int var36 = var34.field7719 / 128 + -(var8 / 128);
                                class165.method1288(var35, arg4 + -30590, var23.field3560, arg3, arg0, var5, var36, 360000L, arg2);
                            }
                        }
                    }
                }
                if (~class763.field10510 != -5) {
                    if (class697.field9843 != 0) {
                        int var21 = class697.field9843 * 4 - (-2 - (-(var9 / 128) + -2) - 2 * class251.field3549.method2692((byte) 122));
                        int var22 = 2 + (class336.field4995 * 4 - var8 / 128 - (-(class251.field3549.method2692((byte) 102) * 2) + 2));
                        class395.method2411(var5, var22, arg0, class573.field8107[class334.field4981 ? 1 : 0], var21, arg2, arg4 + -30480, arg3);
                    }
                    if (!class251.field3549.field7945) {
                        arg1.method488(arg3.field2664 / 2 + (arg0 - 1), arg3.field2673 / 2 + arg2 + -1, -1, 3, 1, 3);
                        return;
                    }
                }
            } else {
                arg1.method494(-16777216, var5, arg2, arg0);
            }
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(I)V")
    public final void method771(int arg0) {
        this.field8596 = Math.abs(this.field8596);
        ++field8604;
        if (~this.field8596 <= -4097) {
            this.field8596 = 4095;
        }
        this.method1296(true, (byte) (this.field8596 >> 4), this.field8590++);
        if (arg0 != -1338152244) {
            this.field8590 = 22;
        }
        this.field8596 = 0;
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(Z)V")
    public static final void method3510(boolean arg0) {
        if (arg0) {
            method3510(false);
        }
        ++field8592;
        class772.field10658 = 0;
        int var1 = (class251.field3549.field7718 >> 9) - -class103.field1295;
        int var2 = (class251.field3549.field7719 >> 9) + class175.field2496;
        if (var1 >= 3053 && var1 <= 3156 && ~var2 <= -3057 && var2 <= 3136) {
            class772.field10658 = 1;
        }
        if (~var1 <= -3073 && var1 <= 3118 && ~var2 <= -9493 && ~var2 >= -9536) {
            class772.field10658 = 1;
        }
        if (~class772.field10658 == -2 && ~var1 <= -3140 && var1 <= 3199 && ~var2 <= -3009 && var2 <= 3062) {
            class772.field10658 = 0;
        }
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(II)V")
    public static final void method3511(int arg0, int arg1) {
        class345.field5083 = 1000000000L / (long) arg1;
        int var2 = -103 % ((-47 - arg0) / 33);
        ++field8593;
    }

    @OriginalMember(owner = "client!id", name = "<init>", descriptor = "(IIIIIF)V")
    public class609(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
        super(arg0, arg1, arg2, arg3, arg4);
        for (int var7 = 0; super.field3419 > var7; ++var7) {
            this.field8605[var7] = (short) ((int) (4096.0D * Math.pow((double) arg5, (double) var7)));
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(III)V")
    public static final void method3512(int arg0, int arg1, int arg2) {
        if (arg1 == 128) {
            ++field8598;
            class678 var3 = class630.method3597(arg1 ^ 29508, 19, (long) arg0 << 32 | (long) arg2);
            var3.method3836((byte) -90);
        }
    }

    @OriginalMember(owner = "client!id", name = "b", descriptor = "(B)V")
    public final void method772(byte arg0) {
        this.field8590 = 0;
        if (arg0 != -15) {
            method3509(-56, (class66) null, 82, (class176) null, -74);
        }
        ++field8602;
        this.field8596 = 0;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(ZBI)V")
    public void method1296(boolean arg0, byte arg1, int arg2) {
        ++field8595;
        this.field8603[this.field8590++] = (byte) (127 + class111.method773(arg1 >> 1, 127));
        if (!arg0) {
            field8597 = null;
        }
    }

    @OriginalMember(owner = "client!id", name = "c", descriptor = "(I)V")
    public static void method3513(int arg0) {
        field8591 = null;
        if (arg0 != -1) {
            method3510(false);
        }
        field8601 = null;
        field8597 = null;
    }

    @OriginalMember(owner = "client!id", name = "a", descriptor = "(III)V")
    public final void method774(int arg0, int arg1, int arg2) {
        if (arg2 > -65) {
            method3511(-99, -110);
        }
        ++field8594;
        this.field8596 += this.field8605[arg1] * arg0 >> 12;
    }
}
