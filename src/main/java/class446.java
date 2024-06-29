import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jq")
public class class446 extends class558 {

    @OriginalMember(owner = "client!jq", name = "nb", descriptor = "Z")
    public boolean field6505 = false;

    @OriginalMember(owner = "client!jq", name = "qb", descriptor = "Z")
    public boolean field6508 = false;

    @OriginalMember(owner = "client!jq", name = "wb", descriptor = "Z")
    public boolean field6514 = false;

    @OriginalMember(owner = "client!jq", name = "ub", descriptor = "Z")
    public boolean field6512 = false;

    @OriginalMember(owner = "client!jq", name = "Ab", descriptor = "Z")
    public boolean field6518 = false;

    @OriginalMember(owner = "client!jq", name = "rb", descriptor = "Lml;")
    public static class36 field6509 = new class36("WTRC", 1);

    @OriginalMember(owner = "client!jq", name = "xb", descriptor = "[I")
    public static int[] field6515 = new int[4096];

    @OriginalMember(owner = "client!jq", name = "cb", descriptor = "I")
    public static int field6494;

    @OriginalMember(owner = "client!jq", name = "db", descriptor = "I")
    public static int field6495;

    @OriginalMember(owner = "client!jq", name = "eb", descriptor = "I")
    public int field6496;

    @OriginalMember(owner = "client!jq", name = "fb", descriptor = "I")
    public static int field6497;

    @OriginalMember(owner = "client!jq", name = "gb", descriptor = "I")
    public static int field6498;

    @OriginalMember(owner = "client!jq", name = "hb", descriptor = "I")
    public static int field6499;

    @OriginalMember(owner = "client!jq", name = "ib", descriptor = "I")
    public static int field6500;

    @OriginalMember(owner = "client!jq", name = "jb", descriptor = "I")
    public static int field6501;

    @OriginalMember(owner = "client!jq", name = "kb", descriptor = "I")
    public static int field6502;

    @OriginalMember(owner = "client!jq", name = "lb", descriptor = "I")
    public static int field6503;

    @OriginalMember(owner = "client!jq", name = "mb", descriptor = "I")
    public static int field6504;

    @OriginalMember(owner = "client!jq", name = "ob", descriptor = "I")
    public static int field6506;

    @OriginalMember(owner = "client!jq", name = "pb", descriptor = "I")
    public static int field6507;

    @OriginalMember(owner = "client!jq", name = "sb", descriptor = "I")
    public static int field6510;

    @OriginalMember(owner = "client!jq", name = "tb", descriptor = "I")
    public static int field6511;

    @OriginalMember(owner = "client!jq", name = "vb", descriptor = "I")
    public static int field6513;

    @OriginalMember(owner = "client!jq", name = "yb", descriptor = "I")
    public static int field6516;

    @OriginalMember(owner = "client!jq", name = "zb", descriptor = "I")
    public static int field6517;

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BI)Z", line = 8)
    public final boolean method2628(byte arg0, int arg1) {
        if (arg0 != 68) {
            this.method2645(57, false);
        }
        ++field6503;
        return ~arg1 == -1 && !this.field6512 ? super.field7887 : true;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I)V", line = 28)
    public final void method2629(int arg0) {
        this.method2645(8364, true);
        if (arg0 != -1) {
            this.method2635(60, 65);
        }
        ++field6507;
        super.field7922 = true;
        super.field7898 = false;
        super.field7897 = true;
        super.field7896 = super.field7910 = 1;
        super.field7884 = true;
        super.field7899 = 1;
        super.field7919 = true;
        super.field7891 = true;
        super.field7890 = super.field7889 = 0;
        super.field7893 = true;
        super.field7912 = true;
        super.field7902 = true;
        super.field7900 = false;
        super.field7908 = true;
        if (class555.field7861 <= 95) {
            class617.method3495(arg0 ^ -950562889, 0);
        } else {
            class617.method3495(950562888, 1);
        }
        super.field7905 = false;
        super.field7895 = true;
        super.field7885 = 0;
        this.method2640(arg0 + -10016);
        super.field7892 = 3;
        class229.method1508(0);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(BI)Z", line = 68)
    public final boolean method2630(byte arg0, int arg1) {
        int var3 = -79 / ((-24 - arg0) / 62);
        ++field6506;
        return ~arg1 == -1 ? super.field7887 : true;
    }

    @OriginalMember(owner = "client!jq", name = "<init>", descriptor = "(Lae;)V", line = 1087)
    public class446(class40 arg0) {
        super.field7904 = 3;
        super.field7892 = 3;
        this.method2645(8364, true);
        super.field7899 = 1;
        super.field7902 = true;
        super.field7890 = 0;
        super.field7896 = 2;
        super.field7920 = 0;
        super.field7912 = true;
        super.field7888 = 127;
        super.field7922 = true;
        super.field7908 = true;
        super.field7921 = 127;
        super.field7900 = false;
        super.field7919 = true;
        super.field7916 = true;
        super.field7910 = 0;
        super.field7924 = 0;
        super.field7891 = true;
        super.field7897 = true;
        super.field7898 = true;
        super.field7884 = true;
        super.field7886 = 127;
        super.field7889 = 0;
        if (~class555.field7861 > -97) {
            class617.method3495(950562888, 0);
        } else {
            class617.method3495(950562888, 2);
        }
        super.field7903 = false;
        super.field7925 = 2;
        super.field7901 = true;
        super.field7918 = 2;
        super.field7923 = false;
        super.field7895 = true;
        super.field7894 = 0;
        super.field7885 = 0;
        super.field7905 = false;
        super.field7883 = ~class605.field8613 != -2 ? 4 : 2;
        class135 var2 = null;
        try {
            class329 var3 = arg0.method364(true, "", (byte) 68);
            while (var3.field4739 == 0) {
                class210.method1342(-78, 1L);
            }
            if (var3.field4739 == 1) {
                var2 = (class135) var3.field4737;
                byte[] var4 = new byte[(int) var2.method1037(0)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method1038(var4, var4.length + -var5, -93, var5);
                    if (var6 == -1) {
                        throw new IOException("EOF");
                    }
                }
                this.method2641(new class268(var4), (byte) -11);
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method1036(-125);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(I[BILjava/lang/String;II)I", line = 85)
    public static final int method2631(int arg0, byte[] arg1, int arg2, String arg3, int arg4, int arg5) {
        ++field6500;
        int var6 = -arg0 + arg4;
        for (int var7 = 0; ~var7 > ~var6; ++var7) {
            char var8 = arg3.charAt(arg0 + var7);
            if (var8 > 0 && var8 < 128 || var8 >= 160 && var8 <= 255) {
                arg1[arg5 - -var7] = (byte) var8;
            } else if (var8 == 8364) {
                arg1[arg5 + var7] = -128;
            } else if (var8 == 8218) {
                arg1[arg5 + var7] = -126;
            } else if (~var8 != -403) {
                if (var8 == 8222) {
                    arg1[arg5 - -var7] = -124;
                } else if (~var8 == -8231) {
                    arg1[arg5 + var7] = -123;
                } else if (~var8 == -8225) {
                    arg1[arg5 + var7] = -122;
                } else if (~var8 != -8226) {
                    if (~var8 != -711) {
                        if (~var8 == -8241) {
                            arg1[arg5 + var7] = -119;
                        } else if (var8 == 352) {
                            arg1[arg5 + var7] = -118;
                        } else if (~var8 == -8250) {
                            arg1[arg5 + var7] = -117;
                        } else if (~var8 != -339) {
                            if (~var8 != -382) {
                                if (var8 == 8216) {
                                    arg1[arg5 - -var7] = -111;
                                } else if (var8 != 8217) {
                                    if (~var8 != -8221) {
                                        if (var8 != 8221) {
                                            if (var8 != 8226) {
                                                if (var8 != 8211) {
                                                    if (~var8 == -8213) {
                                                        arg1[arg5 + var7] = -105;
                                                    } else if (var8 == 732) {
                                                        arg1[arg5 - -var7] = -104;
                                                    } else if (var8 != 8482) {
                                                        if (var8 == 353) {
                                                            arg1[arg5 + var7] = -102;
                                                        } else if (~var8 != -8251) {
                                                            if (~var8 != -340) {
                                                                if (~var8 == -383) {
                                                                    arg1[arg5 - -var7] = -98;
                                                                } else if (var8 == 376) {
                                                                    arg1[arg5 + var7] = -97;
                                                                } else {
                                                                    arg1[arg5 + var7] = 63;
                                                                }
                                                            } else {
                                                                arg1[arg5 + var7] = -100;
                                                            }
                                                        } else {
                                                            arg1[arg5 - -var7] = -101;
                                                        }
                                                    } else {
                                                        arg1[arg5 + var7] = -103;
                                                    }
                                                } else {
                                                    arg1[arg5 - -var7] = -106;
                                                }
                                            } else {
                                                arg1[arg5 + var7] = -107;
                                            }
                                        } else {
                                            arg1[arg5 - -var7] = -108;
                                        }
                                    } else {
                                        arg1[arg5 + var7] = -109;
                                    }
                                } else {
                                    arg1[arg5 - -var7] = -110;
                                }
                            } else {
                                arg1[arg5 + var7] = -114;
                            }
                        } else {
                            arg1[arg5 + var7] = -116;
                        }
                    } else {
                        arg1[arg5 - -var7] = -120;
                    }
                } else {
                    arg1[arg5 - -var7] = -121;
                }
            } else {
                arg1[arg5 + var7] = -125;
            }
        }
        if (arg2 != -382) {
            field6515 = null;
        }
        return var6;
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(I)V", line = 222)
    public final void method2632(int arg0) {
        this.method2645(8364, true);
        ++field6502;
        super.field7896 = super.field7910 = 2;
        super.field7899 = 1;
        super.field7897 = true;
        super.field7893 = true;
        super.field7891 = true;
        super.field7890 = super.field7889 = 0;
        super.field7922 = true;
        super.field7908 = true;
        super.field7898 = true;
        super.field7900 = true;
        super.field7912 = true;
        super.field7884 = true;
        super.field7919 = true;
        super.field7902 = true;
        if (arg0 == 8211) {
            if (~class555.field7861 < -96) {
                class617.method3495(950562888, 2);
            } else {
                class617.method3495(950562888, 0);
            }
            super.field7905 = false;
            super.field7895 = true;
            super.field7885 = 0;
            this.method2640(-10017);
            super.field7892 = 4;
            class229.method1508(0);
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IBLgp;I)Lrl;", line = 267)
    public static final class633 method2633(int arg0, byte arg1, class561 arg2, int arg3) {
        ++field6495;
        int var4 = -46 % ((arg1 - 46) / 34);
        byte[] var5 = arg2.method3175(arg3, (byte) -53, arg0);
        return var5 == null ? null : new class633(var5);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(B)V", line = 282)
    public final void method2634(byte arg0) {
        ++field6494;
        this.method2645(8364, false);
        super.field7896 = super.field7910 = 0;
        super.field7902 = false;
        if (arg0 != -75) {
            method2631(76, (byte[]) null, -105, (String) null, -111, -84);
        }
        super.field7893 = false;
        super.field7908 = false;
        super.field7912 = false;
        super.field7897 = false;
        super.field7891 = false;
        super.field7900 = false;
        super.field7899 = 0;
        super.field7884 = false;
        super.field7922 = false;
        super.field7898 = false;
        super.field7919 = false;
        super.field7890 = super.field7889 = 0;
        class617.method3495(950562888, 0);
        super.field7905 = false;
        super.field7895 = false;
        super.field7885 = 0;
        this.method2640(arg0 + -9942);
        super.field7892 = 1;
        class229.method1508(0);
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(II)I", line = 319)
    private final int method2635(int arg0, int arg1) {
        ++field6516;
        byte var3;
        if (~arg0 < -12001) {
            var3 = 4;
            this.method2632(8211);
        } else if (arg0 <= 5000) {
            if (~arg0 >= -2001) {
                var3 = 1;
                this.method2634((byte) -75);
            } else {
                var3 = 2;
                this.method2637(49);
            }
        } else {
            var3 = 3;
            this.method2629(-1);
        }
        if (class646.field9388 != 2) {
            super.field7918 = 2;
            class471.method2738(127, 2);
        }
        if (arg1 != -5) {
            return -121;
        } else {
            this.method2642((byte) -120, class270.field3976);
            return var3;
        }
    }

    @OriginalMember(owner = "client!jq", name = "c", descriptor = "(I)I", line = 368)
    private final int method2636(int arg0) {
        ++field6510;
        byte var3;
        if (~class555.field7861 <= -97) {
            int var2 = class145.method1064(arg0 + 986);
            if (var2 > 100) {
                if (~var2 < -501) {
                    if (~var2 < -1001) {
                        var3 = 1;
                        this.method2634((byte) -75);
                    } else {
                        var3 = 2;
                        this.method2637(73);
                    }
                } else {
                    this.method2629(arg0 ^ 1000);
                    var3 = 3;
                }
            } else {
                this.method2632(8211);
                var3 = 4;
            }
        } else {
            this.method2634((byte) -75);
            var3 = 1;
        }
        if (class646.field9388 != 0) {
            super.field7918 = 0;
            class471.method2738(arg0 + 1128, 0);
        }
        if (arg0 != -1001) {
            this.field6508 = true;
        }
        this.method2642((byte) -120, class270.field3976);
        return var3;
    }

    @OriginalMember(owner = "client!jq", name = "f", descriptor = "(I)V", line = 431)
    public final void method2637(int arg0) {
        ++field6498;
        this.method2645(8364, true);
        super.field7884 = false;
        super.field7922 = false;
        super.field7899 = 0;
        super.field7896 = super.field7910 = 0;
        super.field7898 = false;
        super.field7919 = false;
        if (arg0 < 46) {
            this.field6505 = false;
        }
        super.field7900 = false;
        super.field7891 = false;
        super.field7893 = false;
        super.field7897 = false;
        super.field7908 = false;
        super.field7890 = super.field7889 = 0;
        super.field7902 = true;
        super.field7912 = false;
        class617.method3495(950562888, 0);
        super.field7885 = 0;
        super.field7895 = true;
        super.field7905 = false;
        this.method2640(-10017);
        super.field7892 = 2;
        class229.method1508(0);
    }

    @OriginalMember(owner = "client!jq", name = "b", descriptor = "(III)I", line = 466)
    private final int method2638(int arg0, int arg1, int arg2) {
        if (arg2 >= -36) {
            this.field6508 = false;
        }
        ++field6501;
        byte var4;
        if (arg1 <= 20000) {
            if (~arg1 >= -10001) {
                if (~arg1 >= -5001) {
                    this.method2634((byte) -75);
                    var4 = 1;
                } else {
                    var4 = 2;
                    this.method2637(47);
                }
            } else {
                this.method2629(-1);
                var4 = 3;
            }
        } else {
            var4 = 4;
            this.method2632(8211);
        }
        if (~class646.field9388 != ~arg0) {
            super.field7918 = arg0;
            class471.method2738(127, arg0);
        }
        this.method2642((byte) -120, class270.field3976);
        return var4;
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IB)I", line = 513)
    public final int method2639(int arg0, byte arg1) {
        ++field6504;
        if (this.field6505) {
            return 0;
        } else if (arg1 <= 82) {
            return -30;
        } else if (!this.method2628((byte) 68, arg0)) {
            return 1;
        } else {
            return !super.field7908 ? 1 : 2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "g", descriptor = "(I)V", line = 536)
    private final void method2640(int arg0) {
        if (arg0 != -10017) {
            this.field6514 = false;
        }
        ++field6517;
        if (class605.field8613 > 1) {
            super.field7883 = 4;
        } else {
            super.field7883 = 2;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Lco;B)V", line = 562)
    private final void method2641(class268 arg0, byte arg1) {
        ++field6497;
        if (arg0.field3952.length - arg0.field3913 >= 1) {
            int var3 = arg0.method1738(arg1 ^ -246);
            if (~var3 <= -1 && var3 <= 18) {
                byte var4;
                if (var3 == 18) {
                    var4 = 41;
                } else if (var3 != 17) {
                    if (var3 != 16) {
                        if (~var3 == -16) {
                            var4 = 37;
                        } else if (var3 == 14) {
                            var4 = 36;
                        } else if (~var3 != -14) {
                            if (~var3 != -13) {
                                if (var3 == 11) {
                                    var4 = 33;
                                } else if (var3 != 10) {
                                    if (var3 != 9) {
                                        if (var3 != 8) {
                                            if (var3 != 7) {
                                                if (var3 == 6) {
                                                    var4 = 28;
                                                } else if (var3 == 5) {
                                                    var4 = 28;
                                                } else if (~var3 == -5) {
                                                    var4 = 24;
                                                } else if (~var3 == -4) {
                                                    var4 = 23;
                                                } else if (~var3 == -3) {
                                                    var4 = 22;
                                                } else if (~var3 == -2) {
                                                    var4 = 23;
                                                } else {
                                                    var4 = 19;
                                                }
                                            } else {
                                                var4 = 29;
                                            }
                                        } else {
                                            var4 = 30;
                                        }
                                    } else {
                                        var4 = 31;
                                    }
                                } else {
                                    var4 = 32;
                                }
                            } else {
                                var4 = 34;
                            }
                        } else {
                            var4 = 35;
                        }
                    } else {
                        var4 = 38;
                    }
                } else {
                    var4 = 40;
                }
                if (var4 <= arg0.field3952.length + -arg0.field3913) {
                    super.field7904 = arg0.method1738(255);
                    if (super.field7904 < 1) {
                        super.field7904 = 1;
                    } else if (~super.field7904 < -5) {
                        super.field7904 = 4;
                    }
                    this.method2645(8364, arg0.method1738(255) == 1);
                    super.field7908 = arg0.method1738(255) == 1;
                    super.field7902 = ~arg0.method1738(arg1 ^ -246) == -2;
                    super.field7912 = arg0.method1738(255) == 1;
                    super.field7899 = arg0.method1738(255) == 1 ? 1 : 0;
                    super.field7884 = ~arg0.method1738(arg1 + 266) == -2;
                    super.field7891 = arg0.method1738(255) == 1;
                    super.field7922 = arg0.method1738(255) == 1;
                    super.field7896 = arg0.method1738(255);
                    if (~super.field7896 < -3) {
                        super.field7896 = 2;
                    }
                    if (var3 >= 17) {
                        super.field7910 = arg0.method1738(255);
                    }
                    if (~var3 > -3) {
                        super.field7897 = arg0.method1738(255) == 1;
                        arg0.method1738(255);
                    } else {
                        super.field7897 = arg0.method1738(arg1 + 266) == 1;
                        if (var3 >= 17) {
                            super.field7900 = arg0.method1738(arg1 ^ -246) == 1;
                        }
                    }
                    super.field7898 = ~arg0.method1738(255) == -2;
                    super.field7919 = ~arg0.method1738(255) == -2;
                    super.field7890 = arg0.method1738(arg1 + 266);
                    if (~super.field7890 < -3) {
                        super.field7890 = 2;
                    }
                    super.field7889 = super.field7890;
                    super.field7916 = ~arg0.method1738(255) == -2;
                    super.field7888 = arg0.method1738(255);
                    if (super.field7888 > 127) {
                        super.field7888 = 127;
                    }
                    super.field7921 = arg0.method1738(255);
                    super.field7886 = arg0.method1738(255);
                    if (~super.field7886 < -128) {
                        super.field7886 = 127;
                    }
                    if (var3 >= 1) {
                        super.field7920 = arg0.method1745(arg1 ^ -32143);
                        super.field7924 = arg0.method1745(32132);
                    }
                    if (~var3 <= -4 && var3 < 6) {
                        arg0.method1738(arg1 + 266);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg0.method1738(255);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class555.field7861 > -97) {
                            var5 = 0;
                        }
                        class617.method3495(950562888, var5);
                    }
                    if (~var3 <= -6) {
                        super.field7894 = arg0.method1748(117);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field7925 = var6 = arg0.method1738(255);
                    }
                    if (super.field7925 != 1 && ~super.field7925 != -3) {
                        super.field7925 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field7923 = arg0.method1738(255) == 1;
                    }
                    if (arg1 != -11) {
                        field6515 = null;
                    }
                    if (var3 >= 8) {
                        super.field7903 = arg0.method1738(arg1 + 266) == 1;
                    }
                    if (var3 >= 9) {
                        super.field7885 = arg0.method1738(arg1 ^ -246);
                    }
                    if (super.field7885 < 0 || super.field7885 > class13.method73(class555.field7861, (byte) -83)) {
                        super.field7885 = 0;
                    }
                    if (~var3 <= -11) {
                        super.field7905 = ~arg0.method1738(255) != -1;
                    }
                    if (var3 >= 11) {
                        super.field7901 = ~arg0.method1738(255) != -1;
                    }
                    if (var3 >= 12) {
                        super.field7899 = arg0.method1738(255);
                    }
                    if (~super.field7899 > -1 || ~super.field7899 < -3) {
                        super.field7899 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field7895 = ~arg0.method1738(255) == -2;
                    }
                    if (~var3 > -15) {
                        if (var6 == 0) {
                            super.field7918 = 2;
                        } else {
                            super.field7918 = 1;
                        }
                    } else {
                        super.field7918 = arg0.method1738(255);
                    }
                    if (~super.field7918 > -1 || ~super.field7918 < -6) {
                        super.field7918 = 2;
                    }
                    if (var3 >= 15) {
                        super.field7883 = arg0.method1738(arg1 ^ -246);
                        if (~super.field7883 > -1 || ~super.field7883 < -5) {
                            super.field7883 = ~class605.field8613 != -2 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field7893 = arg0.method1738(255) == 1;
                        try {
                            if (jagmisc.getTotalPhysicalMemory() <= 268435456L) {
                                super.field7893 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && super.field7918 == 0) {
                        super.field7918 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field7892 = arg0.method1738(255);
                        if (super.field7892 < 0 || ~super.field7892 < -5) {
                            super.field7892 = 0;
                        }
                        if (~super.field7892 == -3) {
                            super.field7902 = true;
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(BLae;)V", line = 849)
    public final void method2642(byte arg0, class40 arg1) {
        ++field6513;
        class135 var3 = null;
        try {
            class329 var4 = arg1.method364(true, "", (byte) 68);
            while (var4.field4739 == 0) {
                class210.method1342(-12, 1L);
            }
            if (var4.field4739 == 1) {
                var3 = (class135) var4.field4737;
                class268 var5 = new class268(class305.method1899(arg0 + 229));
                this.method3141(var5, 6419);
                var3.method1034(var5.field3952, 0, 116, var5.field3913);
            }
        } catch (Exception var7) {
        }
        if (arg0 != -120) {
            this.field6508 = true;
        }
        try {
            if (var3 != null) {
                var3.method1036(85);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!jq", name = "h", descriptor = "(I)V", line = 890)
    public static void method2643(int arg0) {
        field6509 = null;
        if (arg0 == -2001) {
            field6515 = null;
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(Z)I", line = 901)
    public final int method2644(boolean arg0) {
        ++field6511;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class40.field554 != 3 && class40.field554 != 2) {
            if (class40.field564.startsWith("win")) {
                var3 = true;
                if (!class40.field561.startsWith("amd64") && !class40.field561.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
            } else {
                var3 = true;
            }
        }
        if (this.field6514) {
            var2 = false;
        }
        if (this.field6508) {
            var3 = false;
        }
        if (this.field6518) {
            var4 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method2636(-1001);
        } else {
            int var5 = -1;
            int var6 = -1;
            int var7 = -1;
            if (var2) {
                try {
                    var5 = class468.method2719(2, 1000, (byte) 120);
                } catch (Exception var14) {
                }
            }
            if (var4) {
                try {
                    var7 = class468.method2719(3, 1000, (byte) -45);
                    if (~class646.field9388 == -4) {
                        class425 var8 = class159.field2378.method85();
                        long var9 = var8.field6215 & 281474976710655L;
                        int var11 = var8.field6209;
                        if (var11 != 4318) {
                            if (var11 == 4098) {
                                var3 &= ~var9 <= -60129613780L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var13) {
                }
            }
            if (var3) {
                try {
                    var6 = class468.method2719(1, 1000, (byte) 126);
                } catch (Exception var12) {
                }
            }
            if (!arg0) {
                this.field6508 = true;
            }
            if (~var5 == 0 && var6 == -1 && ~var7 == 0) {
                return this.method2636(-1001);
            } else if (var7 < var5 && var5 > var6) {
                return this.method2635(var5, -5);
            } else {
                return var7 > var6 ? this.method2638(3, var7, -52) : this.method2638(1, var6, -89);
            }
        }
    }

    @OriginalMember(owner = "client!jq", name = "a", descriptor = "(IZ)V", line = 1071)
    public final void method2645(int arg0, boolean arg1) {
        if (arg0 == 8364) {
            ++field6499;
            super.field7887 = arg1;
            if (class552.field7819 != null) {
                class552.field7819.method2887((byte) -114, !this.method2628((byte) 68, class646.field9388));
            }
        }
    }
}
