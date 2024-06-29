import jaclib.memory.Buffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jk")
public class class180 extends class308 implements class199 {

    @OriginalMember(owner = "client!jk", name = "d", descriptor = "I")
    private int field2015;

    @OriginalMember(owner = "client!jk", name = "i", descriptor = "[J")
    public static long[] field2020 = new long[10];

    @OriginalMember(owner = "client!jk", name = "h", descriptor = "Lcq;")
    public static class110 field2019 = new class110(0, -2);

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!jk", name = "e", descriptor = "I")
    public static int field2016;

    @OriginalMember(owner = "client!jk", name = "f", descriptor = "I")
    public static int field2017;

    @OriginalMember(owner = "client!jk", name = "g", descriptor = "I")
    public static int field2018;

    @OriginalMember(owner = "client!jk", name = "j", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!jk", name = "k", descriptor = "I")
    public static int field2022;

    @OriginalMember(owner = "client!jk", name = "l", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!jk", name = "m", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!jk", name = "n", descriptor = "I")
    public static int field2025;

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIBIII)V")
    public static final void method1094(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        ++field2018;
        int var6 = class266.method1567(class93.field949, true, class360.field4834, arg0);
        int var7 = class266.method1567(class93.field949, true, class360.field4834, arg4);
        int var8 = class266.method1567(class412.field5526, true, class72.field740, arg1);
        int var9 = class266.method1567(class412.field5526, true, class72.field740, arg5);
        for (int var10 = var6; ~var10 >= ~var7; ++var10) {
            class315.method1809(class557.field7954[var10], arg3, -128, var8, var9);
        }
        int var11 = -112 / ((1 - arg2) / 58);
    }

    @OriginalMember(owner = "client!jk", name = "c", descriptor = "(I)J")
    public final long method608(int arg0) {
        ++field2024;
        if (arg0 != -29334) {
            this.method604(-76);
        }
        return super.field3798.getAddress();
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(B)V")
    public static final void method1095(byte arg0) {
        class247.field3061 = 0;
        ++field2017;
        int var1 = class626.field8849.method649(255);
        int var2 = class626.field8849.method650((byte) -68);
        int var3 = class626.field8849.method650((byte) -100);
        boolean var4 = ~class626.field8849.method649(255) == -2;
        class660.method3665(-1);
        class531.method2980(var1, 4);
        int var5 = (-class626.field8849.field1218 + class257.field3209) / 16;
        class80.field835 = new int[var5][4];
        for (int var6 = 0; var5 > var6; ++var6) {
            for (int var11 = 0; var11 < 4; ++var11) {
                class80.field835[var6][var11] = class626.field8849.method631(false);
            }
        }
        class338.field4249 = new byte[var5][];
        class306.field3784 = new int[var5];
        class222.field2746 = new byte[var5][];
        class248.field3079 = new byte[var5][];
        class676.field9404 = new int[var5];
        int var7 = -63 / ((33 - arg0) / 46);
        class383.field5177 = new int[var5];
        class684.field9647 = new int[var5];
        class212.field2576 = new int[var5];
        class314.field3909 = null;
        class400.field5385 = new byte[var5][];
        class254.field3181 = null;
        int var8 = 0;
        for (int var9 = (var2 - (class142.field1574 >> 4)) / 8; ~var9 >= ~(((class142.field1574 >> 4) + var2) / 8); ++var9) {
            for (int var10 = (-(class140.field1550 >> 4) + var3) / 8; ~var10 >= ~(((class140.field1550 >> 4) + var3) / 8); ++var10) {
                class306.field3784[var8] = (var9 << 8) - -var10;
                class383.field5177[var8] = class280.field3475.method3875("m" + var9 + "_" + var10, (byte) -72);
                class684.field9647[var8] = class280.field3475.method3875("l" + var9 + "_" + var10, (byte) -94);
                class212.field2576[var8] = class280.field3475.method3875("um" + var9 + "_" + var10, (byte) -76);
                class676.field9404[var8] = class280.field3475.method3875("ul" + var9 + "_" + var10, (byte) -103);
                ++var8;
            }
        }
        class256.method1517((byte) 39, 11, var2, var4, var3);
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IIII)I")
    public static final int method1096(int arg0, int arg1, int arg2, int arg3) {
        ++field2022;
        int var4 = -arg1 + 255;
        int var5 = (16711680 & (arg0 & 65280) * arg1 | -16711936 & (arg2 & arg0) * arg1) >>> 8;
        return ((16711680 & (arg3 & 65280) * var4 | (16711935 & arg3) * var4 & -16711936) >>> 8) + var5;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(IC)B")
    public static final byte method1097(int arg0, char arg1) {
        ++field2014;
        if (arg0 != -2740) {
            field2020 = null;
        }
        byte var2;
        if ((arg1 <= 0 || arg1 >= 128) && (arg1 < 160 || ~arg1 < -256)) {
            if (~arg1 == -8365) {
                var2 = -128;
            } else if (~arg1 != -8219) {
                if (arg1 == 402) {
                    var2 = -125;
                } else if (arg1 == 8222) {
                    var2 = -124;
                } else if (arg1 == 8230) {
                    var2 = -123;
                } else if (~arg1 == -8225) {
                    var2 = -122;
                } else if (arg1 != 8225) {
                    if (~arg1 != -711) {
                        if (arg1 != 8240) {
                            if (~arg1 != -353) {
                                if (arg1 != 8249) {
                                    if (~arg1 == -339) {
                                        var2 = -116;
                                    } else if (arg1 == 381) {
                                        var2 = -114;
                                    } else if (~arg1 != -8217) {
                                        if (arg1 != 8217) {
                                            if (~arg1 != -8221) {
                                                if (arg1 != 8221) {
                                                    if (arg1 == 8226) {
                                                        var2 = -107;
                                                    } else if (arg1 != 8211) {
                                                        if (~arg1 != -8213) {
                                                            if (~arg1 == -733) {
                                                                var2 = -104;
                                                            } else if (arg1 == 8482) {
                                                                var2 = -103;
                                                            } else if (~arg1 != -354) {
                                                                if (arg1 != 8250) {
                                                                    if (~arg1 != -340) {
                                                                        if (~arg1 == -383) {
                                                                            var2 = -98;
                                                                        } else if (~arg1 == -377) {
                                                                            var2 = -97;
                                                                        } else {
                                                                            var2 = 63;
                                                                        }
                                                                    } else {
                                                                        var2 = -100;
                                                                    }
                                                                } else {
                                                                    var2 = -101;
                                                                }
                                                            } else {
                                                                var2 = -102;
                                                            }
                                                        } else {
                                                            var2 = -105;
                                                        }
                                                    } else {
                                                        var2 = -106;
                                                    }
                                                } else {
                                                    var2 = -108;
                                                }
                                            } else {
                                                var2 = -109;
                                            }
                                        } else {
                                            var2 = -110;
                                        }
                                    } else {
                                        var2 = -111;
                                    }
                                } else {
                                    var2 = -117;
                                }
                            } else {
                                var2 = -118;
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
                var2 = -126;
            }
        } else {
            var2 = (byte) arg1;
        }
        return var2;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(II[BI)V")
    public final void method610(int arg0, int arg1, byte[] arg2, int arg3) {
        if (arg0 == 13506) {
            ++field2016;
            this.method1769(arg2, arg1);
            this.field2015 = arg3;
        }
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(B)V")
    public static void method1098(byte arg0) {
        if (arg0 >= -58) {
            method1094(47, -23, (byte) 108, -12, 57, 21);
        }
        field2019 = null;
        field2020 = null;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lvj;ILjaclib/memory/Buffer;)V")
    public class180(class422 arg0, int arg1, Buffer arg2) {
        super(arg0, arg2);
        this.field2015 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "<init>", descriptor = "(Lvj;I[BI)V")
    public class180(class422 arg0, int arg1, byte[] arg2, int arg3) {
        super(arg0, arg2, arg3);
        this.field2015 = arg1;
    }

    @OriginalMember(owner = "client!jk", name = "a", descriptor = "(I)I")
    public final int method607(int arg0) {
        if (arg0 != 31556) {
            this.method607(115);
        }
        ++field2023;
        return this.field2015;
    }

    @OriginalMember(owner = "client!jk", name = "b", descriptor = "(I)I")
    public final int method604(int arg0) {
        ++field2021;
        if (arg0 != -18775) {
            field2020 = null;
        }
        return 0;
    }
}
