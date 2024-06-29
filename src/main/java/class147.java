import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!un")
public class class147 extends class748 {

    @OriginalMember(owner = "client!un", name = "I", descriptor = "I")
    private int field2031 = 2048;

    @OriginalMember(owner = "client!un", name = "P", descriptor = "I")
    private int field2038 = 0;

    @OriginalMember(owner = "client!un", name = "L", descriptor = "I")
    private int field2034 = 0;

    @OriginalMember(owner = "client!un", name = "O", descriptor = "I")
    private int field2037 = 1024;

    @OriginalMember(owner = "client!un", name = "K", descriptor = "I")
    private int field2033 = 409;

    @OriginalMember(owner = "client!un", name = "N", descriptor = "I")
    private int field2036 = 1024;

    @OriginalMember(owner = "client!un", name = "M", descriptor = "I")
    private int field2035 = 819;

    @OriginalMember(owner = "client!un", name = "S", descriptor = "I")
    private int field2041 = 1024;

    @OriginalMember(owner = "client!un", name = "V", descriptor = "I")
    private int field2044 = 1024;

    @OriginalMember(owner = "client!un", name = "H", descriptor = "I")
    public static int field2030 = 0;

    @OriginalMember(owner = "client!un", name = "J", descriptor = "I")
    public static int field2032;

    @OriginalMember(owner = "client!un", name = "Q", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!un", name = "R", descriptor = "I")
    private int field2040;

    @OriginalMember(owner = "client!un", name = "T", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!un", name = "U", descriptor = "I")
    public static int field2043;

    @OriginalMember(owner = "client!un", name = "W", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(I[[IIIIILjava/util/Random;)V")
    private final void method951(int arg0, int[][] arg1, int arg2, int arg3, int arg4, int arg5, Random arg6) {
        ++field2032;
        int var8 = this.field2041 <= 0 ? 4096 : -class99.method676(this.field2041, arg6, -120) + 4096;
        int var9 = this.field2044 * this.field2040 >> 12;
        if (arg5 != 1024) {
            this.field2036 = -85;
        }
        int var10 = this.field2040 - (var9 > 0 ? class99.method676(var9, arg6, arg5 + -1082) : 0);
        if (class424.field5889 <= arg4) {
            arg4 -= class424.field5889;
        }
        if (~var10 >= -1) {
            if (~class424.field5889 > ~(arg2 + arg4)) {
                int var11 = -arg4 + class424.field5889;
                for (int var12 = 0; arg3 > var12; ++var12) {
                    int[] var13 = arg1[arg0 + var12];
                    class34.method240(var13, arg4, var11, var8);
                    class34.method240(var13, 0, -var11 + arg2, var8);
                }
            } else {
                for (int var14 = 0; ~arg3 < ~var14; ++var14) {
                    class34.method240(arg1[arg0 + var14], arg4, arg2, var8);
                }
            }
        } else if (~arg3 < -1 && ~arg2 < -1) {
            int var15 = arg2 / 2;
            int var16 = arg3 / 2;
            int var17 = ~var15 > ~var10 ? var15 : var10;
            int var18 = ~var16 <= ~var10 ? var10 : var16;
            int var19 = arg4 + var17;
            int var20 = -(var17 * 2) + arg2;
            for (int var21 = 0; var21 < arg3; ++var21) {
                int[] var22 = arg1[arg0 + var21];
                if (~var21 > ~var18) {
                    int var23 = var8 * var21 / var18;
                    if (this.field2034 != 0) {
                        for (int var24 = 0; ~var24 > ~var17; ++var24) {
                            int var25 = var8 * var24 / var17;
                            var22[class136.method878(arg4 - -var24, class354.field4552)] = var22[class136.method878(-var24 + arg2 + arg4 + -1, class354.field4552)] = var25 >= var23 ? var23 : var25;
                        }
                    } else {
                        for (int var26 = 0; var26 < var17; ++var26) {
                            int var28 = var8 * var26 / var17;
                            var22[class136.method878(class354.field4552, arg4 + var26)] = var22[class136.method878(arg2 + arg4 + -var26 - 1, class354.field4552)] = var23 * var28 >> 12;
                        }
                    }
                    if (class424.field5889 < var19 + var20) {
                        int var27 = -var19 + class424.field5889;
                        class34.method240(var22, var19, var27, var23);
                        class34.method240(var22, 0, var20 - var27, var23);
                    } else {
                        class34.method240(var22, var19, var20, var23);
                    }
                } else {
                    int var29 = arg3 + -1 - var21;
                    if (var29 < var18) {
                        int var30 = var8 * var29 / var18;
                        if (~this.field2034 != -1) {
                            for (int var31 = 0; ~var31 > ~var17; ++var31) {
                                int var32 = var8 * var31 / var17;
                                var22[class136.method878(arg4 - -var31, class354.field4552)] = var22[class136.method878(class354.field4552, arg2 + arg4 + -1 + -var31)] = var30 <= var32 ? var30 : var32;
                            }
                        } else {
                            for (int var33 = 0; var33 < var17; ++var33) {
                                int var35 = var8 * var33 / var17;
                                var22[class136.method878(arg4 - -var33, class354.field4552)] = var22[class136.method878(-var33 - 1 + arg2 + arg4, class354.field4552)] = var30 * var35 >> 12;
                            }
                        }
                        if (class424.field5889 < var19 + var20) {
                            int var34 = class424.field5889 - var19;
                            class34.method240(var22, var19, var34, var30);
                            class34.method240(var22, 0, var20 - var34, var30);
                        } else {
                            class34.method240(var22, var19, var20, var30);
                        }
                    } else {
                        for (int var36 = 0; ~var36 > ~var17; ++var36) {
                            var22[class136.method878(arg4 + var36, class354.field4552)] = var22[class136.method878(-var36 + arg4 + arg2 + -1, class354.field4552)] = var8 * var36 / var17;
                        }
                        if (~class424.field5889 <= ~(var19 + var20)) {
                            class34.method240(var22, var19, var20, var8);
                        } else {
                            int var37 = -var19 + class424.field5889;
                            class34.method240(var22, var19, var37, var8);
                            class34.method240(var22, 0, var20 - var37, var8);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(B)V")
    public final void method23(byte arg0) {
        ++field2042;
        if (arg0 != 67) {
            this.method23((byte) -76);
        }
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(II)[I")
    public final int[] method25(int arg0, int arg1) {
        ++field2045;
        int[] var3 = super.field10407.method3873(0, arg0);
        if (super.field10407.field9527) {
            int[][] var4 = super.field10407.method3874(60);
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int var8 = 0;
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = true;
            int var12 = 0;
            int var13 = 0;
            int var14 = class424.field5889 * this.field2036 >> 12;
            int var15 = class424.field5889 * this.field2031 >> 12;
            int var16 = class245.field3400 * this.field2033 >> 12;
            int var17 = class245.field3400 * this.field2035 >> 12;
            if (var17 <= 1) {
                return var4[arg0];
            }
            this.field2040 = class424.field5889 / 8 * this.field2037 >> 12;
            int var18 = class424.field5889 / var14 + 1;
            int[][] var19 = new int[var18][3];
            int[][] var20 = new int[var18][3];
            Random var21 = new Random((long) this.field2038);
            label130: while (true) {
                while (true) {
                    int var22 = class99.method676(var15 - var14, var21, -90) + var14;
                    int var23 = class99.method676(-var16 + var17, var21, -107) + var16;
                    int var24 = var8 + var22;
                    if (var24 > class424.field5889) {
                        var24 = class424.field5889;
                        var22 = class424.field5889 - var8;
                    }
                    int var29;
                    if (var11) {
                        var29 = 0;
                    } else {
                        int var25 = var9;
                        int[] var26 = var20[var9];
                        int var27 = 0;
                        int var28 = var5 + var24;
                        if (~var28 > -1) {
                            var28 += class424.field5889;
                        }
                        if (~class424.field5889 > ~var28) {
                            var28 -= class424.field5889;
                        }
                        var29 = var26[2];
                        while (true) {
                            int[] var30 = var20[var25];
                            if (~var28 <= ~var30[0] && var28 <= var30[1]) {
                                if (~var9 != ~var25) {
                                    int var31 = var5 + var8;
                                    if (~var31 > -1) {
                                        var31 += class424.field5889;
                                    }
                                    if (class424.field5889 < var31) {
                                        var31 -= class424.field5889;
                                    }
                                    for (int var32 = 1; ~var27 <= ~var32; ++var32) {
                                        int[] var40 = var20[(var9 + var32) % var12];
                                        var29 = Math.max(var29, var40[2]);
                                    }
                                    for (int var33 = 0; ~var33 >= ~var27; ++var33) {
                                        int[] var34 = var20[(var9 + var33) % var12];
                                        int var35 = var34[2];
                                        if (~var29 != ~var35) {
                                            int var36 = var34[0];
                                            int var37 = var34[1];
                                            int var38;
                                            int var39;
                                            if (~var28 >= ~var31) {
                                                if (var36 == 0) {
                                                    var38 = Math.min(var28, var37);
                                                    var39 = 0;
                                                } else {
                                                    var39 = Math.max(var31, var36);
                                                    var38 = class424.field5889;
                                                }
                                            } else {
                                                var39 = Math.max(var31, var36);
                                                var38 = Math.min(var28, var37);
                                            }
                                            this.method951(var35, var4, var38 - var39, -var35 + var29, var7 + var39, arg1 + 769, var21);
                                        }
                                    }
                                }
                                var9 = var25;
                                break;
                            }
                            ++var25;
                            if (var12 <= var25) {
                                var25 = 0;
                            }
                            ++var27;
                        }
                    }
                    if (~(var23 + var29) < ~class245.field3400) {
                        var23 = -var29 + class245.field3400;
                    } else {
                        var10 = false;
                    }
                    if (~class424.field5889 != ~var24) {
                        int[] var41 = var19[var13++];
                        var41[0] = var8;
                        var41[2] = var23 + var29;
                        var41[1] = var24;
                        this.method951(var29, var4, var22, var23, var6 + var8, 1024, var21);
                        var8 = var24;
                    } else {
                        this.method951(var29, var4, var22, var23, var8 - -var6, 1024, var21);
                        if (var10) {
                            break label130;
                        }
                        var10 = true;
                        int[] var42 = var19[var13++];
                        var42[0] = var8;
                        var42[1] = var24;
                        var42[2] = var23 + var29;
                        int[][] var43 = var20;
                        var20 = var19;
                        var19 = var43;
                        var12 = var13;
                        var13 = 0;
                        var7 = var6;
                        var6 = class99.method676(class424.field5889, var21, -77);
                        var5 = -var7 + var6;
                        var8 = 0;
                        int var44 = var5;
                        if (~var5 > -1) {
                            var44 = class424.field5889 + var5;
                        }
                        var9 = 0;
                        if (~var44 < ~class424.field5889) {
                            var44 -= class424.field5889;
                        }
                        var11 = false;
                        while (true) {
                            int[] var45 = var20[var9];
                            if (var44 >= var45[0] && var45[1] >= var44) {
                                break;
                            }
                            int var10000 = ~var12;
                            ++var9;
                            if (var10000 >= ~var9) {
                                var9 = 0;
                            }
                        }
                    }
                }
            }
        }
        if (arg1 != 255) {
            method952(-67, 120);
        }
        return var3;
    }

    @OriginalMember(owner = "client!un", name = "a", descriptor = "(IZLvj;)V")
    public final void method20(int arg0, boolean arg1, class26 arg2) {
        ++field2043;
        if (!arg1) {
            if (~arg0 != -1) {
                if (~arg0 != -2) {
                    if (arg0 != 2) {
                        if (arg0 != 3) {
                            if (~arg0 != -5) {
                                if (arg0 != 5) {
                                    if (~arg0 != -7) {
                                        if (~arg0 != -8) {
                                            if (~arg0 == -9) {
                                                this.field2041 = arg2.method193(2);
                                            }
                                        } else {
                                            this.field2044 = arg2.method193(2);
                                        }
                                    } else {
                                        this.field2034 = arg2.method194((byte) 119);
                                    }
                                } else {
                                    this.field2037 = arg2.method193(2);
                                }
                            } else {
                                this.field2035 = arg2.method193(2);
                            }
                        } else {
                            this.field2033 = arg2.method193(2);
                        }
                    } else {
                        this.field2031 = arg2.method193(2);
                    }
                } else {
                    this.field2036 = arg2.method193(2);
                }
            } else {
                this.field2038 = arg2.method194((byte) 119);
            }
        }
    }

    @OriginalMember(owner = "client!un", name = "<init>", descriptor = "()V")
    public class147() {
        super(0, true);
    }

    @OriginalMember(owner = "client!un", name = "c", descriptor = "(II)V")
    public static final void method952(int arg0, int arg1) {
        ++field2039;
        class118 var2 = class126.method814(true, arg0, 6);
        var2.method778(27970);
        int var3 = 42 / ((arg1 - -61) / 51);
    }
}
