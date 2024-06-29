import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cda")
public class class534 extends class418 {

    @OriginalMember(owner = "client!cda", name = "Lb", descriptor = "I")
    public static int field6947 = 1337;

    @OriginalMember(owner = "client!cda", name = "Gb", descriptor = "I")
    public static int field6942;

    @OriginalMember(owner = "client!cda", name = "Hb", descriptor = "I")
    public static int field6943;

    @OriginalMember(owner = "client!cda", name = "Jb", descriptor = "I")
    public static int field6945;

    @OriginalMember(owner = "client!cda", name = "Kb", descriptor = "I")
    public static int field6946;

    @OriginalMember(owner = "client!cda", name = "Mb", descriptor = "I")
    public static int field6948;

    @OriginalMember(owner = "client!cda", name = "Nb", descriptor = "I")
    private int field6949;

    @OriginalMember(owner = "client!cda", name = "Ob", descriptor = "I")
    public static int field6950;

    @OriginalMember(owner = "client!cda", name = "Pb", descriptor = "I")
    public static int field6951;

    @OriginalMember(owner = "client!cda", name = "Qb", descriptor = "I")
    public static int field6952;

    @OriginalMember(owner = "client!cda", name = "Rb", descriptor = "I")
    public static int field6953;

    @OriginalMember(owner = "client!cda", name = "Sb", descriptor = "I")
    public static int field6954;

    @OriginalMember(owner = "client!cda", name = "Tb", descriptor = "I")
    public static int field6955;

    @OriginalMember(owner = "client!cda", name = "Ub", descriptor = "I")
    public static int field6956;

    @OriginalMember(owner = "client!cda", name = "Ib", descriptor = "Lcaa;")
    private class541 field6944;

    @OriginalMember(owner = "client!cda", name = "f", descriptor = "(IB)V")
    public final void method2835(int arg0, byte arg1) {
        int var3 = 49 % ((-2 - arg1) / 57);
        super.field5393[super.field5367++] = (byte) (this.field6944.method2868(false) + arg0);
        ++field6956;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(II[BI)V")
    public final void method2836(int arg0, int arg1, byte[] arg2, int arg3) {
        for (int var5 = arg0; arg3 > var5; ++var5) {
            arg2[var5 - -arg1] = (byte) (super.field5393[super.field5367++] + -this.field6944.method2868(false));
        }
        ++field6954;
    }

    @OriginalMember(owner = "client!cda", name = "l", descriptor = "(B)V")
    public final void method2837(byte arg0) {
        ++field6942;
        int var2 = -96 % ((arg0 - 25) / 49);
        super.field5367 = (this.field6949 + 7) / 8;
    }

    @OriginalMember(owner = "client!cda", name = "D", descriptor = "(I)V")
    public static final void method2838(int arg0) {
        class550.field7145 = null;
        ++field6943;
        int var1 = 30 / ((-35 - arg0) / 58);
    }

    @OriginalMember(owner = "client!cda", name = "m", descriptor = "(B)Z")
    public final boolean method2839(byte arg0) {
        ++field6951;
        int var2 = 255 & super.field5393[super.field5367] + -this.field6944.method2869(106);
        if (arg0 != 25) {
            this.method2839((byte) -23);
        }
        return ~var2 <= -129;
    }

    @OriginalMember(owner = "client!cda", name = "E", descriptor = "(I)I")
    public final int method2840(int arg0) {
        if (arg0 != 24571) {
            this.method2841(65, -91);
        }
        ++field6950;
        int var2 = super.field5393[super.field5367++] - this.field6944.method2868(false) & 255;
        return var2 < 128 ? var2 : (super.field5393[super.field5367++] + -this.field6944.method2868(false) & 255) + (var2 + -128 << 8);
    }

    @OriginalMember(owner = "client!cda", name = "<init>", descriptor = "(I)V")
    public class534(int arg0) {
        super(arg0);
    }

    @OriginalMember(owner = "client!cda", name = "j", descriptor = "(II)I")
    public final int method2841(int arg0, int arg1) {
        if (arg0 != 8) {
            this.method2839((byte) 107);
        }
        ++field6952;
        return arg1 * 8 - this.field6949;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(I[I)V")
    public final void method2842(int arg0, int[] arg1) {
        this.field6944 = new class541(arg1);
        if (arg0 != -13709) {
            method2838(-7);
        }
        ++field6953;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(BLcaa;)V")
    public final void method2843(byte arg0, class541 arg1) {
        ++field6945;
        int var3 = -25 % ((arg0 - -71) / 41);
        this.field6944 = arg1;
    }

    @OriginalMember(owner = "client!cda", name = "a", descriptor = "(IILnf;BII)V")
    public static final void method2844(int arg0, int arg1, class118 arg2, byte arg3, int arg4, int arg5) {
        ++field6946;
        if (arg2.field1525 != -1 || arg2.field1511 != null) {
            int var6 = 0;
            if (~arg1 < ~arg2.field1517) {
                var6 += -arg2.field1517 + arg1;
            } else if (~arg1 > ~arg2.field1524) {
                var6 += arg2.field1524 - arg1;
            }
            int var7 = class260.field3509.field1285 * arg2.field1526 >> 8;
            if (~arg2.field1529 > ~arg4) {
                var6 += -arg2.field1529 + arg4;
            } else if (arg4 < arg2.field1516) {
                var6 += -arg4 + arg2.field1516;
            }
            if (arg2.field1510 != 0 && ~(var6 + -256) >= ~arg2.field1510 && class260.field3509.field1285 != 0 && arg2.field1533 == arg5) {
                var6 -= 256;
                if (var6 < 0) {
                    var6 = 0;
                }
                int var8 = (-var6 + arg2.field1510) * var7 / arg2.field1510;
                if (arg2.field1530 == null) {
                    if (~arg2.field1525 <= -1) {
                        if (arg2.field1513) {
                            if (arg2.field1534 == null) {
                                arg2.field1534 = class73.method589(class680.field9375, arg2.field1525);
                            }
                            if (arg2.field1534 != null) {
                                if (arg2.field1515 == null) {
                                    arg2.field1515 = arg2.field1534.method581(new int[] { 22050 });
                                }
                                if (arg2.field1515 != null) {
                                    class137 var9 = class137.method994(arg2.field1515, 100, var8);
                                    var9.method1012(-1);
                                    class690.field9426.method2240(var9);
                                    arg2.field1530 = var9;
                                }
                            }
                        } else {
                            class664 var10 = class664.method3633(class63.field864, arg2.field1525, 0);
                            if (var10 != null) {
                                class430 var11 = var10.method3635().method2469(class648.field9026);
                                class137 var12 = class137.method994(var11, 100, var8);
                                var12.method1012(-1);
                                class690.field9426.method2240(var12);
                                arg2.field1530 = var12;
                            }
                        }
                    }
                } else {
                    arg2.field1530.method1024(var8);
                }
                if (arg3 >= -113) {
                    method2838(62);
                }
                if (arg2.field1514 == null) {
                    if (arg2.field1511 != null && ~(arg2.field1519 -= arg0) >= -1) {
                        if (!arg2.field1521) {
                            int var13 = (int) ((double) arg2.field1511.length * Math.random());
                            class664 var14 = class664.method3633(class63.field864, arg2.field1511[var13], 0);
                            if (var14 != null) {
                                class430 var15 = var14.method3635().method2469(class648.field9026);
                                class137 var16 = class137.method994(var15, 100, var8);
                                var16.method1012(0);
                                class690.field9426.method2240(var16);
                                arg2.field1519 = arg2.field1509 + (int) (Math.random() * (double) (-arg2.field1509 + arg2.field1508));
                                arg2.field1514 = var16;
                                return;
                            }
                        } else {
                            if (arg2.field1522 == null) {
                                int var17 = (int) (Math.random() * (double) arg2.field1511.length);
                                arg2.field1522 = class73.method589(class680.field9375, arg2.field1511[var17]);
                            }
                            if (arg2.field1522 == null) {
                                return;
                            }
                            if (arg2.field1523 == null) {
                                arg2.field1523 = arg2.field1522.method581(new int[] { 22050 });
                            }
                            if (arg2.field1523 == null) {
                                return;
                            }
                            class137 var18 = class137.method994(arg2.field1523, 100, var8);
                            var18.method1012(0);
                            class690.field9426.method2240(var18);
                            arg2.field1514 = var18;
                            arg2.field1519 = (int) (Math.random() * (double) (-arg2.field1509 + arg2.field1508)) + arg2.field1509;
                        }
                        return;
                    }
                } else {
                    arg2.field1514.method1024(var8);
                    if (arg2.field1514.method2440(64)) {
                        return;
                    }
                    arg2.field1523 = null;
                    arg2.field1522 = null;
                    arg2.field1514 = null;
                }
            } else {
                if (arg2.field1530 != null) {
                    class690.field9426.method2236(arg2.field1530);
                    arg2.field1534 = null;
                    arg2.field1515 = null;
                    arg2.field1530 = null;
                }
                if (arg2.field1514 != null) {
                    class690.field9426.method2236(arg2.field1514);
                    arg2.field1522 = null;
                    arg2.field1514 = null;
                    arg2.field1523 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!cda", name = "k", descriptor = "(II)I")
    public final int method2845(int arg0, int arg1) {
        ++field6955;
        int var3 = this.field6949 >> 3;
        int var4 = arg1 - (this.field6949 & 7);
        int var5 = 0;
        this.field6949 += arg0;
        while (var4 < arg0) {
            var5 += (super.field5393[var3++] & class57.field764[var4]) << -var4 + arg0;
            arg0 -= var4;
            var4 = 8;
        }
        int var6;
        if (~arg0 != ~var4) {
            var6 = (super.field5393[var3] >> -arg0 + var4 & class57.field764[arg0]) + var5;
        } else {
            var6 = (class57.field764[var4] & super.field5393[var3]) + var5;
        }
        return var6;
    }

    @OriginalMember(owner = "client!cda", name = "b", descriptor = "(Z)V")
    public final void method2846(boolean arg0) {
        ++field6948;
        if (!arg0) {
            method2844(-17, 99, (class118) null, (byte) -122, 29, -72);
        }
        this.field6949 = super.field5367 * 8;
    }
}
