import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!of")
public class class274 extends class68 {

    @OriginalMember(owner = "client!of", name = "P", descriptor = "I")
    private int field4231 = 0;

    @OriginalMember(owner = "client!of", name = "Y", descriptor = "I")
    private int field4240 = 2048;

    @OriginalMember(owner = "client!of", name = "bb", descriptor = "I")
    private int field4243 = 10;

    @OriginalMember(owner = "client!of", name = "Z", descriptor = "I")
    public static int field4241 = -2;

    @OriginalMember(owner = "client!of", name = "U", descriptor = "I")
    public static int field4236 = 64;

    @OriginalMember(owner = "client!of", name = "N", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!of", name = "O", descriptor = "I")
    public static int field4230;

    @OriginalMember(owner = "client!of", name = "Q", descriptor = "I")
    public static int field4232;

    @OriginalMember(owner = "client!of", name = "R", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!of", name = "S", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!of", name = "V", descriptor = "I")
    public static int field4237;

    @OriginalMember(owner = "client!of", name = "X", descriptor = "I")
    public static int field4239;

    @OriginalMember(owner = "client!of", name = "cb", descriptor = "I")
    public static int field4244;

    @OriginalMember(owner = "client!of", name = "eb", descriptor = "I")
    public static int field4246;

    @OriginalMember(owner = "client!of", name = "T", descriptor = "[I")
    private int[] field4235;

    @OriginalMember(owner = "client!of", name = "W", descriptor = "[I")
    private int[] field4238;

    @OriginalMember(owner = "client!of", name = "ab", descriptor = "[I")
    public static int[] field4242;

    @OriginalMember(owner = "client!of", name = "db", descriptor = "[Lse;")
    public static class211[] field4245;

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjb;IIBII)V")
    public static final void method1827(int arg0, class276 arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
        ++field4230;
        long var7 = 0L;
        if (~arg0 != -1) {
            if (arg0 != 1) {
                if (~arg0 != -3) {
                    if (~arg0 == -4) {
                        var7 = class69.method431(arg5, arg3, arg6);
                    }
                } else {
                    var7 = class176.method1156(arg5, arg3, arg6);
                }
            } else {
                var7 = class33.method223(arg5, arg3, arg6);
            }
        } else {
            var7 = class140.method945(arg5, arg3, arg6);
        }
        if (arg4 != -96) {
            field4242 = null;
        }
        boolean var9 = true;
        int var10 = Integer.MAX_VALUE & (int) (var7 >>> 32);
        boolean var11 = false;
        int var12 = 31 & (int) var7 >> 14;
        class111 var13 = class76.method489(var10, 59);
        boolean var14 = false;
        if (var13.method719(123)) {
            class47.method308(arg5, 27260, arg3, var13, arg6);
        }
        int var15 = (3183293 & (int) var7) >> 20;
        if (~var7 != -1L) {
            if (arg0 == 0) {
                class37.method248(arg5, arg3, arg6);
                if (~var13.field1584 != -1) {
                    arg1.method1843((byte) -101, var12, arg6, var13.field1589, !var13.field1576, var15, arg3);
                }
            } else if (arg0 != 1) {
                if (arg0 != 2) {
                    if (~arg0 == -4) {
                        class36.method244(arg5, arg3, arg6);
                        if (var13.field1584 == 1) {
                            arg1.method1847(-30176, arg3, arg6);
                        }
                    }
                } else {
                    class292.method1957(arg5, arg3, arg6);
                    if (var13.field1584 != 0 && var13.field1582 + arg3 < 104 && var13.field1582 + arg6 < 104 && arg3 - -var13.field1598 < 104 && ~(var13.field1598 + arg6) > -105) {
                        arg1.method1849(arg6, !var13.field1576, var15, arg3, 71, var13.field1598, var13.field1589, var13.field1582);
                    }
                }
            } else {
                class254.method1696(arg5, arg3, arg6);
            }
            if (var13.field1597 != null) {
                class111 var20 = var13.method726((byte) 115);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IJ)Ljava/lang/String;")
    public static final String method1828(int arg0, long arg1) {
        ++field4233;
        if (arg1 > 0L && ~arg1 > -6582952005840035282L) {
            if (~(arg1 % 37L) == -1L) {
                return null;
            } else {
                int var3 = 0;
                long var4 = arg1;
                while (~var4 != -1L) {
                    var4 /= 37L;
                    ++var3;
                }
                StringBuffer var6 = new StringBuffer(var3);
                while (arg1 != 0L) {
                    long var7 = arg1;
                    arg1 /= 37L;
                    char var9 = class75.field1045[(int) (-(arg1 * 37L) + var7)];
                    if (~var9 == -96) {
                        var9 = 160;
                        int var10 = -1 + var6.length();
                        var6.setCharAt(var10, Character.toUpperCase(var6.charAt(var10)));
                    }
                    var6.append(var9);
                }
                var6.reverse();
                var6.setCharAt(0, Character.toUpperCase(var6.charAt(arg0)));
                return var6.toString();
            }
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!of", name = "g", descriptor = "(I)V")
    private final void method1829(int arg0) {
        this.field4238 = new int[this.field4243 + 1];
        ++field4237;
        this.field4235 = new int[this.field4243 + 1];
        int var2 = 0;
        int var3 = 4096 / this.field4243;
        int var4 = this.field4240 * var3 >> 12;
        if (arg0 != 4684) {
            field4245 = null;
        }
        for (int var5 = 0; var5 < this.field4243; ++var5) {
            this.field4238[var5] = var2;
            this.field4235[var5] = var2 + var4;
            var2 += var3;
        }
        this.field4238[this.field4243] = 4096;
        this.field4235[this.field4243] = 4096 - -this.field4235[0];
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(IZIZZ)Lhc;")
    public static final class235 method1830(int arg0, boolean arg1, int arg2, boolean arg3, boolean arg4) {
        ++field4239;
        if (arg2 >= -114) {
            method1830(-118, true, 120, true, true);
        }
        class54 var5 = null;
        if (class66.field901 != null) {
            var5 = new class54(arg0, class66.field901, class288.field4551[arg0], 1000000);
        }
        class160.field2246[arg0] = class273.field4216.method263(class36.field552, var5, 0, arg0);
        if (arg3) {
            class160.field2246[arg0].method1101(-116);
        }
        return new class235(class160.field2246[arg0], arg4, arg1);
    }

    @OriginalMember(owner = "client!of", name = "e", descriptor = "(I)V")
    public final void method192(int arg0) {
        if (arg0 < -18) {
            this.method1829(4684);
            ++field4232;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(ILjava/lang/String;I)V")
    public static final void method1831(int arg0, String arg1, int arg2) {
        ++field4229;
        class280 var3 = class181.method1180(arg2, 0, 3);
        var3.method1876(1840457248);
        var3.field4336 = arg1;
        if (arg0 < 79) {
            field4236 = 89;
        }
    }

    @OriginalMember(owner = "client!of", name = "f", descriptor = "(B)V")
    public static void method1832(byte arg0) {
        if (arg0 > 97) {
            field4242 = null;
            field4245 = null;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(II)[I")
    public final int[] method32(int arg0, int arg1) {
        if (arg1 > -118) {
            return null;
        } else {
            int[] var3 = super.field917.method1920(arg0, true);
            ++field4244;
            if (super.field917.field4474) {
                int var4 = class127.field1794[arg0];
                if (this.field4231 == 0) {
                    short var5 = 0;
                    for (int var6 = 0; this.field4243 > var6; ++var6) {
                        if (~var4 <= ~this.field4238[var6] && this.field4238[var6 + 1] > var4) {
                            if (var4 < this.field4235[var6]) {
                                var5 = 4096;
                            }
                            break;
                        }
                    }
                    class115.method779(var3, 0, class89.field1248, var5);
                } else {
                    for (int var7 = 0; class89.field1248 > var7; ++var7) {
                        int var8 = 0;
                        int var9 = class215.field3231[var7];
                        short var10 = 0;
                        int var11 = this.field4231;
                        if (~var11 != -2) {
                            if (var11 != 2) {
                                if (~var11 == -4) {
                                    var8 = (-var4 + var9 >> 1) + 2048;
                                }
                            } else {
                                var8 = (var9 + -4096 - -var4 >> 1) + 2048;
                            }
                        } else {
                            var8 = var9;
                        }
                        for (int var12 = 0; var12 < this.field4243; ++var12) {
                            if (~this.field4238[var12] >= ~var8 && ~this.field4238[var12 + 1] < ~var8) {
                                if (~var8 > ~this.field4235[var12]) {
                                    var10 = 4096;
                                }
                                break;
                            }
                        }
                        var3[var7] = var10;
                    }
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lql;IZ)V")
    public final void method28(class224 arg0, int arg1, boolean arg2) {
        if (~arg1 != -1) {
            if (arg1 != 1) {
                if (~arg1 == -3) {
                    this.field4231 = arg0.method1453((byte) -128);
                }
            } else {
                this.field4240 = arg0.method1445(false);
            }
        } else {
            this.field4243 = arg0.method1453((byte) -128);
        }
        if (!arg2) {
            field4236 = -35;
        }
        ++field4246;
    }

    @OriginalMember(owner = "client!of", name = "<init>", descriptor = "()V")
    public class274() {
        super(0, true);
    }

    @OriginalMember(owner = "client!of", name = "a", descriptor = "(Lmi;I)V")
    public static final void method1833(class266 arg0, int arg1) {
        ++field4234;
        if (arg0.field3991 != 0) {
            class151 var2 = arg0.method1741((byte) 119);
            if (arg1 <= 97) {
                method1833((class266) null, 119);
            }
            if (~arg0.field4014 != 0 && arg0.field4014 < 32768) {
                class140 var3 = class119.field1679[arg0.field4014];
                if (var3 != null) {
                    int var4 = -var3.field4019 + arg0.field4019;
                    int var5 = arg0.field4085 - var3.field4085;
                    if (var4 != 0 || ~var5 != -1) {
                        arg0.field4009 = 2047 & (int) (Math.atan2((double) var4, (double) var5) * 325.949D);
                    }
                }
            }
            if (arg0.field4014 >= 32768) {
                int var6 = arg0.field4014 - 32768;
                if (~class35.field550 == ~var6) {
                    var6 = 2047;
                }
                class88 var7 = class154.field2133[var6];
                if (var7 != null) {
                    int var8 = -var7.field4019 + arg0.field4019;
                    int var9 = -var7.field4085 + arg0.field4085;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field4009 = (int) (325.949D * Math.atan2((double) var8, (double) var9)) & 2047;
                    }
                }
            }
            if ((arg0.field4026 != 0 || ~arg0.field4060 != -1) && (arg0.field4052 == 0 || arg0.field4021 > 0)) {
                int var10 = -((-class37.field565 + arg0.field4026 + -class37.field565) * 64) + arg0.field4019;
                int var11 = -((arg0.field4060 - class216.field3255 - class216.field3255) * 64) + arg0.field4085;
                if (var10 != 0 || ~var11 != -1) {
                    arg0.field4009 = 2047 & (int) (325.949D * Math.atan2((double) var10, (double) var11));
                }
                arg0.field4060 = 0;
                arg0.field4026 = 0;
            }
            int var12 = 2047 & -arg0.field4010 + arg0.field4009;
            if (var12 == 0) {
                arg0.field3993 = 0;
                arg0.field3995 = 0;
            } else {
                if (~var2.field2107 != -1) {
                    arg0.field4050 = -1;
                    int var13 = arg0.field4009 << 5;
                    if (arg0.field3992 != var13) {
                        arg0.field3992 = var13;
                        arg0.field4020 = 0;
                        int var14 = -arg0.field4045 + var13 & 65535;
                        int var15 = arg0.field3995 * arg0.field3995 / (var2.field2107 * 2);
                        if (~arg0.field3995 < -1 && ~var15 >= ~var14 && -var15 + var14 < 32768) {
                            arg0.field4016 = true;
                            arg0.field4074 = var14 / 2;
                            int var16 = var2.field2079 * var2.field2079 / (var2.field2107 * 2);
                            if (var16 > 32767) {
                                var16 = 32767;
                            }
                            if (var16 < arg0.field4074) {
                                arg0.field4074 = var14 - var16;
                            }
                        } else if (~arg0.field3995 > -1 && ~(-var14 + 65536) <= ~var15 && ~(65536 - var15 + -var14) > -32769) {
                            int var17 = var2.field2079 * var2.field2079 / (var2.field2107 * 2);
                            if (var17 > 32767) {
                                var17 = 32767;
                            }
                            arg0.field4074 = (-var14 + 65536) / 2;
                            arg0.field4016 = true;
                            if (var17 < arg0.field4074) {
                                arg0.field4074 = -var14 + -var17 + 65536;
                            }
                        } else {
                            arg0.field4016 = false;
                        }
                    }
                    if (arg0.field3995 != 0) {
                        if (~arg0.field3995 < -1) {
                            if (~arg0.field4074 >= ~arg0.field4020) {
                                arg0.field4016 = false;
                            }
                            if (arg0.field4016) {
                                if (~arg0.field3995 > ~var2.field2079) {
                                    arg0.field3995 += var2.field2107;
                                }
                            } else {
                                arg0.field3995 -= var2.field2107;
                                if (arg0.field3995 < 0) {
                                    arg0.field3995 = 0;
                                }
                            }
                        } else {
                            if (arg0.field4020 >= arg0.field4074) {
                                arg0.field4016 = false;
                            }
                            if (arg0.field4016) {
                                if (~(-var2.field2079) > ~arg0.field3995) {
                                    arg0.field3995 -= var2.field2107;
                                }
                            } else {
                                arg0.field3995 += var2.field2107;
                                if (arg0.field3995 > 0) {
                                    arg0.field3995 = 0;
                                }
                            }
                        }
                    } else {
                        int var18 = -arg0.field4045 + arg0.field3992 & 65535;
                        if (var2.field2107 > var18) {
                            arg0.field4045 = arg0.field3992;
                        } else {
                            int var19 = var2.field2079 * var2.field2079 / (var2.field2107 * 2);
                            arg0.field4016 = true;
                            arg0.field4020 = 0;
                            if (var19 > 32767) {
                                var19 = 32767;
                            }
                            if (~var18 > -32769) {
                                arg0.field3995 = var2.field2107;
                                arg0.field4074 = var18 / 2;
                                if (~var19 > ~arg0.field4074) {
                                    arg0.field4074 = -var19 + var18;
                                }
                            } else {
                                arg0.field4074 = (-var18 + 65536) / 2;
                                arg0.field3995 = -var2.field2107;
                                if (~arg0.field4074 < ~var19) {
                                    arg0.field4074 = 65536 - var18 + -var19;
                                }
                            }
                        }
                    }
                    if (~arg0.field3995 < -1) {
                        arg0.field4020 += arg0.field3995;
                    } else {
                        arg0.field4020 -= arg0.field3995;
                    }
                    arg0.field4045 += arg0.field3995;
                    arg0.field4045 &= 65535;
                    arg0.field4010 = arg0.field4045 >> 5;
                    if (~arg0.field3995 <= -1) {
                        if (arg0.field4052 > 0) {
                            if (~arg0.field4071[arg0.field4052 + -1] != -3) {
                                if (~arg0.field4071[arg0.field4052 + -1] == -1) {
                                    if (var2.field2088 != -1) {
                                        arg0.field4050 = var2.field2088;
                                    } else if (var2.field2121 != -1) {
                                        arg0.field4050 = var2.field2121;
                                    }
                                }
                            } else if (var2.field2091 == -1) {
                                if (~var2.field2087 != 0) {
                                    arg0.field4050 = var2.field2087;
                                }
                            } else {
                                arg0.field4050 = var2.field2091;
                            }
                        }
                        if (~arg0.field4050 == 0) {
                            if (var2.field2115 == -1) {
                                if (var2.field2114 != -1) {
                                    arg0.field4050 = var2.field2114;
                                }
                            } else {
                                arg0.field4050 = var2.field2115;
                            }
                        }
                    } else {
                        if (~arg0.field4052 < -1) {
                            if (arg0.field4071[arg0.field4052 + -1] == 2) {
                                if (~var2.field2117 != 0) {
                                    arg0.field4050 = var2.field2117;
                                } else if (var2.field2087 != -1) {
                                    arg0.field4050 = var2.field2087;
                                }
                            } else if (~arg0.field4071[arg0.field4052 - 1] == -1) {
                                if (var2.field2111 == -1) {
                                    if (~var2.field2121 != 0) {
                                        arg0.field4050 = var2.field2121;
                                    }
                                } else {
                                    arg0.field4050 = var2.field2111;
                                }
                            }
                        }
                        if (~arg0.field4050 == 0) {
                            if (var2.field2098 != -1) {
                                arg0.field4050 = var2.field2098;
                            } else if (~var2.field2112 != 0) {
                                arg0.field4050 = var2.field2112;
                            }
                        }
                    }
                    if (~arg0.field4050 == 0) {
                        arg0.field4050 = var2.field2109;
                        return;
                    }
                } else {
                    ++arg0.field3993;
                    if (~var12 < -1025) {
                        arg0.field4010 -= arg0.field3991;
                        boolean var20 = true;
                        if (~var12 > ~arg0.field3991 || var12 > -arg0.field3991 + 2048) {
                            arg0.field4010 = arg0.field4009;
                            var20 = false;
                        }
                        if (arg0.field3993 > 25 || var20) {
                            arg0.field4050 = var2.field2109;
                            if (arg0.field4052 > 0) {
                                if (~arg0.field4071[arg0.field4052 + -1] == -3) {
                                    if (var2.field2117 == -1) {
                                        if (var2.field2087 != -1) {
                                            arg0.field4050 = var2.field2087;
                                        }
                                    } else {
                                        arg0.field4050 = var2.field2117;
                                    }
                                } else if (~arg0.field4071[arg0.field4052 - 1] == -1) {
                                    if (~var2.field2111 != 0) {
                                        arg0.field4050 = var2.field2111;
                                    } else if (var2.field2121 != -1) {
                                        arg0.field4050 = var2.field2121;
                                    }
                                } else if (~var2.field2098 != 0) {
                                    arg0.field4050 = var2.field2098;
                                }
                            } else if (var2.field2112 != -1) {
                                arg0.field4050 = var2.field2112;
                            }
                        }
                    } else {
                        arg0.field4010 += arg0.field3991;
                        boolean var21 = true;
                        if (~var12 > ~arg0.field3991 || var12 > -arg0.field3991 + 2048) {
                            var21 = false;
                            arg0.field4010 = arg0.field4009;
                        }
                        if (~arg0.field3993 < -26 || var21) {
                            arg0.field4050 = var2.field2109;
                            if (~arg0.field4052 < -1) {
                                if (arg0.field4071[arg0.field4052 + -1] != 2) {
                                    if (arg0.field4071[arg0.field4052 + -1] == 0) {
                                        if (var2.field2088 != -1) {
                                            arg0.field4050 = var2.field2088;
                                        } else if (var2.field2121 != -1) {
                                            arg0.field4050 = var2.field2121;
                                        }
                                    } else if (var2.field2115 != -1) {
                                        arg0.field4050 = var2.field2115;
                                    }
                                } else if (~var2.field2091 == 0) {
                                    if (var2.field2087 != -1) {
                                        arg0.field4050 = var2.field2087;
                                    }
                                } else {
                                    arg0.field4050 = var2.field2091;
                                }
                            } else if (var2.field2114 != -1) {
                                arg0.field4050 = var2.field2114;
                            }
                        }
                    }
                    arg0.field4010 &= 2047;
                }
            }
        }
    }
}
