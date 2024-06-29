import java.net.URL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!am")
public class class251 extends class215 {

    @OriginalMember(owner = "client!am", name = "ab", descriptor = "I")
    private int field4106 = 4096;

    @OriginalMember(owner = "client!am", name = "R", descriptor = "Ljava/lang/String;")
    public static String field4097 = "wave:";

    @OriginalMember(owner = "client!am", name = "W", descriptor = "I")
    public static int field4102 = 20;

    @OriginalMember(owner = "client!am", name = "Y", descriptor = "[I")
    public static int[] field4104 = new int[500];

    @OriginalMember(owner = "client!am", name = "T", descriptor = "I")
    public static int field4099 = 0;

    @OriginalMember(owner = "client!am", name = "N", descriptor = "I")
    public static int field4093 = 0;

    @OriginalMember(owner = "client!am", name = "cb", descriptor = "[J")
    public static long[] field4108 = new long[200];

    @OriginalMember(owner = "client!am", name = "O", descriptor = "I")
    public static int field4094;

    @OriginalMember(owner = "client!am", name = "P", descriptor = "I")
    public static int field4095;

    @OriginalMember(owner = "client!am", name = "Q", descriptor = "I")
    public static int field4096;

    @OriginalMember(owner = "client!am", name = "S", descriptor = "I")
    public static int field4098;

    @OriginalMember(owner = "client!am", name = "U", descriptor = "I")
    public static int field4100;

    @OriginalMember(owner = "client!am", name = "V", descriptor = "I")
    public static int field4101;

    @OriginalMember(owner = "client!am", name = "X", descriptor = "I")
    public static int field4103;

    @OriginalMember(owner = "client!am", name = "Z", descriptor = "I")
    public static int field4105;

    @OriginalMember(owner = "client!am", name = "bb", descriptor = "I")
    public static int field4107;

    @OriginalMember(owner = "client!am", name = "c", descriptor = "(III)Ljava/lang/String;")
    public static final String method1727(int arg0, int arg1, int arg2) {
        ++field4095;
        int var3 = arg1 - arg0;
        if (~var3 > 8) {
            return "<col=ff0000>";
        } else if (~var3 > 5) {
            return "<col=ff3000>";
        } else if (arg2 < 25) {
            return null;
        } else if (var3 < -3) {
            return "<col=ff7000>";
        } else if (var3 < 0) {
            return "<col=ffb000>";
        } else if (~var3 < -10) {
            return "<col=00ff00>";
        } else if (var3 > 6) {
            return "<col=40ff00>";
        } else if (~var3 < -4) {
            return "<col=80ff00>";
        } else {
            return ~var3 < -1 ? "<col=c0ff00>" : "<col=ffff00>";
        }
    }

    @OriginalMember(owner = "client!am", name = "<init>", descriptor = "()V")
    public class251() {
        super(1, true);
    }

    @OriginalMember(owner = "client!am", name = "d", descriptor = "(II)Z")
    public static final boolean method1728(int arg0, int arg1) {
        ++field4101;
        class216 var2 = class266.method1791(arg0, (byte) -65);
        if (var2 == null) {
            return false;
        } else if (arg1 != 0) {
            return false;
        } else if (class48.field615 != 1 && class48.field615 != 2 && class77.field969 != 2) {
            String var3 = "";
            String var4 = "";
            if (~class77.field969 != -1) {
                var3 = ":" + (var2.field3466 + 7000);
            }
            if (class272.field4343 != null) {
                var4 = "/p=" + class272.field4343;
            }
            String var5 = "http://" + var2.field3469 + var3 + "/l=" + class281.field4458 + "/a=" + class210.field3374 + var4 + "/j" + (!class239.field3945 ? "0" : "1") + ",o" + (!class3.field45 ? "0" : "1") + ",a2,m" + (!class51.field662 ? "0" : "1");
            try {
                class222.field3583.getAppletContext().showDocument(new URL(var5), "_self");
                return true;
            } catch (Exception var6) {
                return false;
            }
        } else {
            class115.field1638 = var2.field3466;
            if (class77.field969 != 0) {
                class42.field528 = 50000 - -class115.field1638;
                class20.field253 = class115.field1638 + 40000;
                class178.field2833 = class20.field253;
            }
            class180.field2860 = var2.field3469;
            return true;
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IILpd;)V")
    public final void method45(int arg0, int arg1, class96 arg2) {
        ++field4098;
        if (~arg1 == -1) {
            this.field4106 = arg2.method549(arg0 + -1521146093);
        }
        if (arg0 != 1521146348) {
            this.method47(57, 31);
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(BLid;)V")
    public static final void method1729(byte arg0, class230 arg1) {
        ++field4107;
        int var2 = -67 / ((38 - arg0) / 54);
        if (arg1.field3769 != 0) {
            class154 var3 = arg1.method1636(0);
            if (arg1.field3812 != -1 && ~arg1.field3812 > -32769) {
                class200 var4 = class265.field4273[arg1.field3812];
                if (var4 != null) {
                    int var5 = -var4.field3818 + arg1.field3818;
                    int var6 = -var4.field3820 + arg1.field3820;
                    if (~var5 != -1 || ~var6 != -1) {
                        arg1.field3835 = 2047 & (int) (325.949D * Math.atan2((double) var5, (double) var6));
                    }
                }
            }
            if (arg1.field3812 >= 32768) {
                int var7 = arg1.field3812 + -32768;
                if (~class185.field2958 == ~var7) {
                    var7 = 2047;
                }
                class259 var8 = class89.field1113[var7];
                if (var8 != null) {
                    int var9 = -var8.field3818 + arg1.field3818;
                    int var10 = -var8.field3820 + arg1.field3820;
                    if (~var9 != -1 || var10 != 0) {
                        arg1.field3835 = 2047 & (int) (325.949D * Math.atan2((double) var9, (double) var10));
                    }
                }
            }
            if ((arg1.field3803 != 0 || arg1.field3806 != 0) && (~arg1.field3791 == -1 || arg1.field3821 > 0)) {
                int var11 = -((-class167.field2683 + -class167.field2683 + arg1.field3803) * 64) + arg1.field3818;
                int var12 = -((-class181.field2883 + arg1.field3806 + -class181.field2883) * 64) + arg1.field3820;
                if (~var11 != -1 || var12 != 0) {
                    arg1.field3835 = 2047 & (int) (325.949D * Math.atan2((double) var11, (double) var12));
                }
                arg1.field3806 = 0;
                arg1.field3803 = 0;
            }
            int var13 = 2047 & -arg1.field3751 + arg1.field3835;
            if (var13 == 0) {
                arg1.field3778 = 0;
                arg1.field3801 = 0;
            } else if (~var3.field2409 == -1) {
                ++arg1.field3801;
                if (var13 <= 1024) {
                    arg1.field3751 += arg1.field3769;
                    boolean var14 = true;
                    if (arg1.field3769 > var13 || ~var13 < ~(-arg1.field3769 + 2048)) {
                        var14 = false;
                        arg1.field3751 = arg1.field3835;
                    }
                    if (~arg1.field3801 < -26 || var14) {
                        arg1.field3793 = var3.field2396;
                        if (~arg1.field3791 >= -1) {
                            if (~var3.field2420 != 0) {
                                arg1.field3793 = var3.field2420;
                            }
                        } else if (~arg1.field3756[arg1.field3791 - 1] == -3) {
                            if (var3.field2422 != -1) {
                                arg1.field3793 = var3.field2422;
                            } else if (var3.field2385 != -1) {
                                arg1.field3793 = var3.field2385;
                            }
                        } else if (arg1.field3756[arg1.field3791 - 1] != 0) {
                            if (~var3.field2411 != 0) {
                                arg1.field3793 = var3.field2411;
                            }
                        } else if (var3.field2419 == -1) {
                            if (var3.field2390 != -1) {
                                arg1.field3793 = var3.field2390;
                            }
                        } else {
                            arg1.field3793 = var3.field2419;
                        }
                    }
                } else {
                    arg1.field3751 -= arg1.field3769;
                    boolean var15 = true;
                    if (~var13 > ~arg1.field3769 || ~var13 < ~(-arg1.field3769 + 2048)) {
                        var15 = false;
                        arg1.field3751 = arg1.field3835;
                    }
                    if (~arg1.field3801 < -26 || var15) {
                        arg1.field3793 = var3.field2396;
                        if (arg1.field3791 <= 0) {
                            if (var3.field2399 != -1) {
                                arg1.field3793 = var3.field2399;
                            }
                        } else if (arg1.field3756[arg1.field3791 + -1] != 2) {
                            if (arg1.field3756[arg1.field3791 + -1] == 0) {
                                if (~var3.field2408 == 0) {
                                    if (~var3.field2390 != 0) {
                                        arg1.field3793 = var3.field2390;
                                    }
                                } else {
                                    arg1.field3793 = var3.field2408;
                                }
                            } else if (var3.field2401 != -1) {
                                arg1.field3793 = var3.field2401;
                            }
                        } else if (~var3.field2386 == 0) {
                            if (~var3.field2385 != 0) {
                                arg1.field3793 = var3.field2385;
                            }
                        } else {
                            arg1.field3793 = var3.field2386;
                        }
                    }
                }
                arg1.field3751 &= 2047;
            } else {
                arg1.field3793 = -1;
                int var16 = arg1.field3835 << 5;
                if (arg1.field3805 != var16) {
                    arg1.field3805 = var16;
                    int var17 = 65535 & -arg1.field3816 + var16;
                    arg1.field3781 = 0;
                    int var18 = arg1.field3778 * arg1.field3778 / (var3.field2409 * 2);
                    if (~arg1.field3778 < -1 && ~var18 >= ~var17 && -var18 + var17 < 32768) {
                        arg1.field3737 = true;
                        arg1.field3810 = var17 / 2;
                        int var19 = var3.field2395 * var3.field2395 / (var3.field2409 * 2);
                        if (~var19 < -32768) {
                            var19 = 32767;
                        }
                        if (~arg1.field3810 < ~var19) {
                            arg1.field3810 = -var19 + var17;
                        }
                    } else if (~arg1.field3778 > -1 && ~var18 >= ~(-var17 + 65536) && ~(-var18 + 65536 + -var17) > -32769) {
                        arg1.field3737 = true;
                        arg1.field3810 = (65536 - var17) / 2;
                        int var20 = var3.field2395 * var3.field2395 / (var3.field2409 * 2);
                        if (~var20 < -32768) {
                            var20 = 32767;
                        }
                        if (arg1.field3810 > var20) {
                            arg1.field3810 = -var20 + 65536 + -var17;
                        }
                    } else {
                        arg1.field3737 = false;
                    }
                }
                if (~arg1.field3778 != -1) {
                    if (~arg1.field3778 < -1) {
                        if (arg1.field3781 >= arg1.field3810) {
                            arg1.field3737 = false;
                        }
                        if (arg1.field3737) {
                            if (~var3.field2395 < ~arg1.field3778) {
                                arg1.field3778 += var3.field2409;
                            }
                        } else {
                            arg1.field3778 -= var3.field2409;
                            if (arg1.field3778 < 0) {
                                arg1.field3778 = 0;
                            }
                        }
                    } else {
                        if (arg1.field3781 >= arg1.field3810) {
                            arg1.field3737 = false;
                        }
                        if (!arg1.field3737) {
                            arg1.field3778 += var3.field2409;
                            if (~arg1.field3778 < -1) {
                                arg1.field3778 = 0;
                            }
                        } else if (-var3.field2395 < arg1.field3778) {
                            arg1.field3778 -= var3.field2409;
                        }
                    }
                } else {
                    int var21 = -arg1.field3816 + arg1.field3805 & 65535;
                    if (~var21 <= ~var3.field2409) {
                        arg1.field3737 = true;
                        arg1.field3781 = 0;
                        int var22 = var3.field2395 * var3.field2395 / (var3.field2409 * 2);
                        if (var22 > 32767) {
                            var22 = 32767;
                        }
                        if (~var21 > -32769) {
                            arg1.field3810 = var21 / 2;
                            arg1.field3778 = var3.field2409;
                            if (var22 < arg1.field3810) {
                                arg1.field3810 = -var22 + var21;
                            }
                        } else {
                            arg1.field3810 = (-var21 + 65536) / 2;
                            arg1.field3778 = -var3.field2409;
                            if (var22 < arg1.field3810) {
                                arg1.field3810 = -var21 + -var22 + 65536;
                            }
                        }
                    } else {
                        arg1.field3816 = arg1.field3805;
                    }
                }
                if (~arg1.field3778 >= -1) {
                    arg1.field3781 -= arg1.field3778;
                } else {
                    arg1.field3781 += arg1.field3778;
                }
                arg1.field3816 += arg1.field3778;
                arg1.field3816 &= 65535;
                arg1.field3751 = arg1.field3816 >> 5;
                if (~arg1.field3778 > -1) {
                    if (arg1.field3791 > 0) {
                        if (~arg1.field3756[arg1.field3791 - 1] == -3) {
                            if (~var3.field2386 == 0) {
                                if (var3.field2385 != -1) {
                                    arg1.field3793 = var3.field2385;
                                }
                            } else {
                                arg1.field3793 = var3.field2386;
                            }
                        } else if (~arg1.field3756[arg1.field3791 - 1] == -1) {
                            if (var3.field2408 == -1) {
                                if (~var3.field2390 != 0) {
                                    arg1.field3793 = var3.field2390;
                                }
                            } else {
                                arg1.field3793 = var3.field2408;
                            }
                        }
                    }
                    if (arg1.field3793 == -1) {
                        if (var3.field2401 == -1) {
                            if (~var3.field2399 != 0) {
                                arg1.field3793 = var3.field2399;
                            }
                        } else {
                            arg1.field3793 = var3.field2401;
                        }
                    }
                } else {
                    if (arg1.field3791 > 0) {
                        if (arg1.field3756[arg1.field3791 - 1] == 2) {
                            if (~var3.field2422 != 0) {
                                arg1.field3793 = var3.field2422;
                            } else if (var3.field2385 != -1) {
                                arg1.field3793 = var3.field2385;
                            }
                        } else if (~arg1.field3756[arg1.field3791 + -1] == -1) {
                            if (var3.field2419 != -1) {
                                arg1.field3793 = var3.field2419;
                            } else if (var3.field2390 != -1) {
                                arg1.field3793 = var3.field2390;
                            }
                        }
                    }
                    if (arg1.field3793 == -1) {
                        if (var3.field2411 == -1) {
                            if (var3.field2420 != -1) {
                                arg1.field3793 = var3.field2420;
                            }
                        } else {
                            arg1.field3793 = var3.field2411;
                        }
                    }
                }
                if (arg1.field3793 == -1) {
                    arg1.field3793 = var3.field2396;
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "g", descriptor = "(I)V")
    public static void method1730(int arg0) {
        field4104 = null;
        field4108 = null;
        if (arg0 < 80) {
            method1731(55, -10, 28, (class56) null, (class123) null, false, 29);
        }
        field4097 = null;
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "(IIILib;Lwb;ZI)V")
    public static final void method1731(int arg0, int arg1, int arg2, class56 arg3, class123 arg4, boolean arg5, int arg6) {
        ++field4100;
        if (arg3 != null) {
            int var7 = 2047 & (int) class226.field3639 + class84.field1045;
            int var8 = 10 + Math.max(arg4.field1879 / 2, arg4.field1809 / 2);
            if (!arg5) {
                int var9 = arg6 * arg6 - -(arg0 * arg0);
                if (var8 * var8 >= var9) {
                    int var10 = class174.field2753[var7];
                    int var11 = var10 * 256 / (class14.field185 + 256);
                    int var12 = class174.field2759[var7];
                    int var13 = var12 * 256 / (class14.field185 + 256);
                    int var14 = arg0 * var11 + arg6 * var13 >> 16;
                    int var15 = arg0 * var13 + -(arg6 * var11) >> 16;
                    ((class227) arg3).method1612(arg4.field1879 / 2 + arg1 + -(arg3.field721 / 2) - -var14, arg4.field1809 / 2 + arg2 + -(arg3.field717 / 2) + -var15, arg4.field1839, arg4.field1799);
                }
            }
        }
    }

    @OriginalMember(owner = "client!am", name = "a", descriptor = "([BZ)[B")
    public static final byte[] method1732(byte[] arg0, boolean arg1) {
        ++field4103;
        class96 var2 = new class96(arg0);
        int var3 = var2.method584(255);
        int var4 = var2.method597(-1197332568);
        if (arg1) {
            field4099 = 29;
        }
        if (~var4 <= -1 && (class55.field707 == 0 || var4 <= class55.field707)) {
            if (var3 == 0) {
                byte[] var5 = new byte[var4];
                var2.method596(32, var4, 0, var5);
                return var5;
            } else {
                int var6 = var2.method597(-1197332568);
                if (var6 >= 0 && (class55.field707 == 0 || ~var6 >= ~class55.field707)) {
                    byte[] var7 = new byte[var6];
                    if (~var3 != -2) {
                        class145.field2294.method972(var7, (byte) 95, var2);
                    } else {
                        class58.method333(var7, var6, arg0, var4, 9);
                    }
                    return var7;
                } else {
                    throw new RuntimeException();
                }
            }
        } else {
            throw new RuntimeException();
        }
    }

    @OriginalMember(owner = "client!am", name = "b", descriptor = "(II)[I")
    public final int[] method47(int arg0, int arg1) {
        if (arg1 != 255) {
            method1729((byte) -40, (class230) null);
        }
        int[] var3 = super.field3445.method1755(arg0, (byte) 115);
        if (super.field3445.field4163) {
            int[] var4 = this.method1503(arg1 ^ -256, 0, arg0 + -1 & class83.field1026);
            int[] var5 = this.method1503(-1, 0, arg0);
            int[] var6 = this.method1503(-1, 0, class83.field1026 & arg0 - -1);
            for (int var7 = 0; class244.field4015 > var7; ++var7) {
                int var8 = (var6[var7] + -var4[var7]) * this.field4106;
                int var9 = (var5[var7 + 1 & class118.field1673] + -var5[class118.field1673 & var7 + -1]) * this.field4106;
                int var10 = var9 >> 12;
                int var11 = var10 * var10 >> 12;
                int var12 = var8 >> 12;
                int var13 = var12 * var12 >> 12;
                int var14 = (int) (4096.0D * Math.sqrt((double) ((float) (var11 - -var13 + 4096) / 4096.0F)));
                int var15 = var14 != 0 ? 16777216 / var14 : 0;
                var3[var7] = -var15 + 4096;
            }
        }
        ++field4105;
        return var3;
    }

    @OriginalMember(owner = "client!am", name = "h", descriptor = "(I)V")
    public static final void method1733(int arg0) {
        ++field4096;
        class141.field2239.method711(true);
        class91.field1132.method121((byte) 116);
        if (arg0 != -1) {
            field4108 = null;
        }
        class273.field4364.method121((byte) 108);
    }
}
