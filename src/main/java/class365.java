import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ph")
public class class365 extends class305 {

    @OriginalMember(owner = "client!ph", name = "F", descriptor = "I")
    private int field5378 = 32768;

    @OriginalMember(owner = "client!ph", name = "D", descriptor = "I")
    public static int field5376;

    @OriginalMember(owner = "client!ph", name = "E", descriptor = "I")
    public static int field5377;

    @OriginalMember(owner = "client!ph", name = "I", descriptor = "I")
    public static int field5380;

    @OriginalMember(owner = "client!ph", name = "J", descriptor = "I")
    public static int field5381;

    @OriginalMember(owner = "client!ph", name = "K", descriptor = "I")
    public static int field5382;

    @OriginalMember(owner = "client!ph", name = "H", descriptor = "Lum;")
    public static class83 field5379;

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(IB)[[I")
    public final int[][] method72(int arg0, byte arg1) {
        ++field5382;
        int[][] var3 = super.field4674.method2206(-87, arg0);
        if (arg1 >= -59) {
            return null;
        } else {
            if (super.field4674.field5110) {
                int[] var4 = this.method2021(1, arg0, 0);
                int[] var5 = this.method2021(2, arg0, 0);
                int[] var6 = var3[0];
                int[] var7 = var3[1];
                int[] var8 = var3[2];
                for (int var9 = 0; ~var9 > ~class91.field1471; ++var9) {
                    int var10 = 255 & var4[var9] * 255 >> 12;
                    int var11 = var5[var9] * this.field5378 >> 12;
                    int var12 = class480.field7043[var10] * var11 >> 12;
                    int var13 = class417.field6133[var10] * var11 >> 12;
                    int var14 = (var12 >> 12) + var9 & class228.field3447;
                    int var15 = class236.field3551 & arg0 - -(var13 >> 12);
                    int[][] var16 = this.method2015(true, 0, var15);
                    var6[var9] = var16[0][var14];
                    var7[var9] = var16[1][var14];
                    var8[var9] = var16[2][var14];
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(CB)B")
    public static final byte method2328(char arg0, byte arg1) {
        ++field5380;
        byte var2;
        if (~arg0 < -1 && ~arg0 > -129 || ~arg0 <= -161 && arg0 <= 255) {
            var2 = (byte) arg0;
        } else if (~arg0 == -8365) {
            var2 = -128;
        } else if (~arg0 != -8219) {
            if (arg0 != 402) {
                if (arg0 != 8222) {
                    if (~arg0 != -8231) {
                        if (~arg0 != -8225) {
                            if (~arg0 != -8226) {
                                if (~arg0 != -711) {
                                    if (arg0 != 8240) {
                                        if (~arg0 == -353) {
                                            var2 = -118;
                                        } else if (~arg0 != -8250) {
                                            if (~arg0 != -339) {
                                                if (arg0 != 381) {
                                                    if (~arg0 != -8217) {
                                                        if (arg0 == 8217) {
                                                            var2 = -110;
                                                        } else if (~arg0 != -8221) {
                                                            if (~arg0 == -8222) {
                                                                var2 = -108;
                                                            } else if (arg0 == 8226) {
                                                                var2 = -107;
                                                            } else if (~arg0 != -8212) {
                                                                if (~arg0 != -8213) {
                                                                    if (~arg0 != -733) {
                                                                        if (~arg0 == -8483) {
                                                                            var2 = -103;
                                                                        } else if (arg0 == 353) {
                                                                            var2 = -102;
                                                                        } else if (~arg0 == -8251) {
                                                                            var2 = -101;
                                                                        } else if (~arg0 == -340) {
                                                                            var2 = -100;
                                                                        } else if (~arg0 == -383) {
                                                                            var2 = -98;
                                                                        } else if (~arg0 != -377) {
                                                                            var2 = 63;
                                                                        } else {
                                                                            var2 = -97;
                                                                        }
                                                                    } else {
                                                                        var2 = -104;
                                                                    }
                                                                } else {
                                                                    var2 = -105;
                                                                }
                                                            } else {
                                                                var2 = -106;
                                                            }
                                                        } else {
                                                            var2 = -109;
                                                        }
                                                    } else {
                                                        var2 = -111;
                                                    }
                                                } else {
                                                    var2 = -114;
                                                }
                                            } else {
                                                var2 = -116;
                                            }
                                        } else {
                                            var2 = -117;
                                        }
                                    } else {
                                        var2 = -119;
                                    }
                                } else {
                                    var2 = -120;
                                }
                            } else {
                                var2 = -121;
                            }
                        } else {
                            var2 = -122;
                        }
                    } else {
                        var2 = -123;
                    }
                } else {
                    var2 = -124;
                }
            } else {
                var2 = -125;
            }
        } else {
            var2 = -126;
        }
        if (arg1 != -108) {
            method2329((byte) 39);
        }
        return var2;
    }

    @OriginalMember(owner = "client!ph", name = "<init>", descriptor = "()V")
    public class365() {
        super(3, false);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(ILfh;B)V")
    public final void method14(int arg0, class194 arg1, byte arg2) {
        if (arg2 <= 76) {
            this.field5378 = 89;
        }
        ++field5381;
        if (~arg0 != -1) {
            if (arg0 == 1) {
                super.field4675 = arg1.method1337((byte) 21) == 1;
            }
        } else {
            this.field5378 = arg1.method1396(-90) << 4;
        }
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(II)[I")
    public final int[] method15(int arg0, int arg1) {
        ++field5377;
        int[] var3 = super.field4677.method2174(arg0, 107);
        if (super.field4677.field5040) {
            int[] var4 = this.method2021(1, arg0, arg1 ^ 4688);
            int[] var5 = this.method2021(2, arg0, 0);
            for (int var6 = 0; class91.field1471 > var6; ++var6) {
                int var7 = var4[var6] >> 4 & 255;
                int var8 = var5[var6] * this.field5378 >> 12;
                int var9 = class480.field7043[var7] * var8 >> 12;
                int var10 = class417.field6133[var7] * var8 >> 12;
                int var11 = class228.field3447 & (var9 >> 12) + var6;
                int var12 = class236.field3551 & (var10 >> 12) + arg0;
                int[] var13 = this.method2021(0, var12, 0);
                var3[var6] = var13[var11];
            }
        }
        return arg1 != 4688 ? null : var3;
    }

    @OriginalMember(owner = "client!ph", name = "e", descriptor = "(B)V")
    public static void method2329(byte arg0) {
        field5379 = null;
        int var1 = -68 % ((-82 - arg0) / 37);
    }

    @OriginalMember(owner = "client!ph", name = "a", descriptor = "(B)V")
    public final void method17(byte arg0) {
        ++field5376;
        if (arg0 != -62) {
            this.field5378 = 64;
        }
        class441.method2728(false);
    }
}
