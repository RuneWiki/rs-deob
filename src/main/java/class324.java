import jagex3.jagmisc.jagmisc;
import java.io.IOException;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bga")
public class class324 extends class225 {

    @OriginalMember(owner = "client!bga", name = "kb", descriptor = "Z")
    public boolean field4213 = false;

    @OriginalMember(owner = "client!bga", name = "ob", descriptor = "Z")
    public boolean field4217 = false;

    @OriginalMember(owner = "client!bga", name = "Cb", descriptor = "Z")
    public boolean field4231 = false;

    @OriginalMember(owner = "client!bga", name = "Db", descriptor = "Z")
    public boolean field4232 = false;

    @OriginalMember(owner = "client!bga", name = "Bb", descriptor = "Z")
    public boolean field4230 = false;

    @OriginalMember(owner = "client!bga", name = "vb", descriptor = "[[B")
    public static byte[][] field4224 = new byte[1000][];

    @OriginalMember(owner = "client!bga", name = "ub", descriptor = "[I")
    public static int[] field4223 = new int[2048];

    @OriginalMember(owner = "client!bga", name = "gb", descriptor = "I")
    public static int field4209;

    @OriginalMember(owner = "client!bga", name = "hb", descriptor = "I")
    public static int field4210;

    @OriginalMember(owner = "client!bga", name = "ib", descriptor = "I")
    public static int field4211;

    @OriginalMember(owner = "client!bga", name = "jb", descriptor = "I")
    public static int field4212;

    @OriginalMember(owner = "client!bga", name = "lb", descriptor = "I")
    public static int field4214;

    @OriginalMember(owner = "client!bga", name = "mb", descriptor = "I")
    public static int field4215;

    @OriginalMember(owner = "client!bga", name = "nb", descriptor = "I")
    public static int field4216;

    @OriginalMember(owner = "client!bga", name = "pb", descriptor = "I")
    public static int field4218;

    @OriginalMember(owner = "client!bga", name = "qb", descriptor = "I")
    public static int field4219;

    @OriginalMember(owner = "client!bga", name = "rb", descriptor = "I")
    public static int field4220;

    @OriginalMember(owner = "client!bga", name = "sb", descriptor = "I")
    public static int field4221;

    @OriginalMember(owner = "client!bga", name = "tb", descriptor = "I")
    public static int field4222;

    @OriginalMember(owner = "client!bga", name = "wb", descriptor = "I")
    public static int field4225;

    @OriginalMember(owner = "client!bga", name = "xb", descriptor = "I")
    public static int field4226;

    @OriginalMember(owner = "client!bga", name = "yb", descriptor = "I")
    public static int field4227;

    @OriginalMember(owner = "client!bga", name = "zb", descriptor = "I")
    public int field4228;

    @OriginalMember(owner = "client!bga", name = "Ab", descriptor = "I")
    public static int field4229;

    @OriginalMember(owner = "client!bga", name = "Eb", descriptor = "I")
    public static int field4233;

    @OriginalMember(owner = "client!bga", name = "Fb", descriptor = "I")
    public static int field4234;

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IB)Z", line = 4)
    public final boolean method1826(int arg0, byte arg1) {
        ++field4212;
        if (arg1 > -4) {
            field4223 = null;
        }
        return arg0 != 0 ? true : super.field2852;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(I)I", line = 24)
    public final int method1827(int arg0) {
        ++field4227;
        boolean var2 = false;
        boolean var3 = false;
        boolean var4 = false;
        if (class623.field8837.field7924 && !class623.field8837.field7935) {
            if (!class556.field7916.startsWith("win")) {
                var3 = true;
            } else {
                if (!class556.field7915.startsWith("amd64") && !class556.field7915.startsWith("x86_64")) {
                    var2 = true;
                }
                var4 = true;
                var3 = true;
            }
        }
        if (this.field4231) {
            var2 = false;
        }
        if (this.field4232) {
            var4 = false;
        }
        if (this.field4213) {
            var3 = false;
        }
        if (!var2 && !var3 && !var4) {
            return this.method1831(6575);
        } else {
            if (arg0 <= 19) {
                this.method1841(-13, (class556) null);
            }
            int var5 = -1;
            int var6 = -1;
            if (var2) {
                try {
                    var5 = class362.method1990((byte) 50, 2, 1000);
                } catch (Exception var16) {
                }
            }
            int var7 = -1;
            if (var4) {
                try {
                    var7 = class362.method1990((byte) 50, 3, 1000);
                    if (class150.field1711 == 3) {
                        class482 var8 = class453.field6284.method298();
                        long var9 = var8.field7049 & 281474976710655L;
                        int var11 = var8.field7050;
                        if (~var11 != -4319) {
                            if (var11 == 4098) {
                                var3 &= var9 >= 60129613779L;
                            }
                        } else {
                            var3 &= ~var9 <= -64425238955L;
                        }
                    }
                } catch (Exception var15) {
                }
            }
            if (var3) {
                try {
                    var6 = class362.method1990((byte) 50, 1, 1000);
                } catch (Exception var14) {
                }
            }
            if (var5 == -1 && ~var6 == 0 && var7 == -1) {
                return this.method1831(6575);
            } else {
                int var12 = (int) ((float) var7 * 1.1F);
                int var13 = (int) ((float) var6 * 1.1F);
                if (var12 < var5 && ~var5 < ~var13) {
                    return this.method1837(686, var5);
                } else {
                    return ~var12 < ~var13 ? this.method1838(3, var12, -126) : this.method1838(1, var13, -121);
                }
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(B)V", line = 198)
    public final void method1828(byte arg0) {
        if (arg0 == 70) {
            ++field4233;
            this.method1842(117, true);
            super.field2862 = super.field2883 = 0;
            super.field2874 = false;
            super.field2845 = false;
            super.field2876 = false;
            super.field2842 = 0;
            super.field2872 = false;
            super.field2864 = false;
            super.field2853 = false;
            super.field2859 = false;
            super.field2851 = super.field2858 = 0;
            super.field2879 = false;
            super.field2882 = false;
            super.field2839 = true;
            super.field2861 = false;
            class178.method1049((byte) 34, 0);
            super.field2860 = true;
            super.field2854 = 0;
            super.field2849 = false;
            this.method1836(-96);
            this.method1832(false, 2);
            super.field2843 = 2;
            class593.method3325((byte) -95);
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(I)V", line = 234)
    public final void method1829(int arg0) {
        this.method1842(20, true);
        ++field4219;
        super.field2879 = true;
        super.field2839 = true;
        super.field2876 = true;
        super.field2874 = true;
        super.field2872 = true;
        super.field2859 = true;
        super.field2851 = super.field2858 = 0;
        super.field2842 = 1;
        super.field2861 = true;
        super.field2845 = true;
        int var2 = -77 % ((-78 - arg0) / 39);
        super.field2862 = super.field2883 = 2;
        super.field2864 = true;
        super.field2853 = true;
        super.field2882 = true;
        if (~class145.field1630 < -96) {
            class178.method1049((byte) 34, 2);
        } else {
            class178.method1049((byte) 34, 0);
        }
        super.field2854 = 0;
        super.field2860 = true;
        super.field2849 = false;
        this.method1836(-94);
        this.method1832(false, 0);
        super.field2843 = 4;
        class593.method3325((byte) -101);
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(II)I", line = 273)
    public final int method1830(int arg0, int arg1) {
        if (arg1 != 0) {
            this.method1829(-84);
        }
        ++field4209;
        if (this.field4217) {
            return 0;
        } else if (!this.method1835(arg0, (byte) 70)) {
            return 1;
        } else {
            return super.field2872 ? 2 : 1;
        }
    }

    @OriginalMember(owner = "client!bga", name = "<init>", descriptor = "(Lpe;)V", line = 1063)
    public class324(class556 arg0) {
        super.field2868 = 3;
        super.field2843 = 3;
        this.method1842(54, true);
        super.field2862 = 2;
        super.field2879 = true;
        super.field2853 = true;
        super.field2875 = 127;
        super.field2841 = 127;
        super.field2877 = 127;
        super.field2851 = 0;
        super.field2883 = 0;
        super.field2842 = 1;
        super.field2858 = 0;
        super.field2859 = true;
        super.field2845 = true;
        super.field2861 = true;
        super.field2850 = 0;
        super.field2840 = true;
        super.field2839 = true;
        super.field2873 = 127;
        super.field2864 = true;
        super.field2872 = true;
        super.field2874 = false;
        super.field2865 = 0;
        super.field2882 = true;
        super.field2866 = 127;
        if (class145.field1630 < 96) {
            class178.method1049((byte) 34, 0);
        } else {
            class178.method1049((byte) 34, 2);
        }
        super.field2863 = 0;
        super.field2860 = true;
        super.field2871 = 0;
        super.field2857 = ~class277.field3513 != -2 ? 4 : 2;
        super.field2849 = false;
        super.field2844 = true;
        super.field2880 = false;
        super.field2869 = 2;
        super.field2884 = 2;
        super.field2848 = false;
        super.field2854 = 0;
        class647 var2 = null;
        try {
            class199 var3 = arg0.method3140("", true, 123);
            while (~var3.field2437 == -1) {
                class370.method2025(-1, 1L);
            }
            if (var3.field2437 == 1) {
                var2 = (class647) var3.field2434;
                byte[] var4 = new byte[(int) var2.method3632((byte) 47)];
                int var6;
                for (int var5 = 0; ~var5 > ~var4.length; var5 += var6) {
                    var6 = var2.method3630(false, var4, var4.length - var5, var5);
                    if (~var6 == 0) {
                        throw new IOException("EOF");
                    }
                }
                this.method1834(true, new class452(var4));
            }
        } catch (Exception var8) {
        }
        try {
            if (var2 != null) {
                var2.method3633(0);
            }
        } catch (Exception var7) {
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(I)I", line = 295)
    private final int method1831(int arg0) {
        if (arg0 != 6575) {
            this.field4228 = 45;
        }
        ++field4226;
        byte var2;
        if (~class145.field1630 > -97) {
            this.method1833(0);
            var2 = 1;
        } else {
            int var3 = class453.method2579(100);
            if (~var3 < -101) {
                if (var3 <= 500) {
                    var2 = 3;
                    this.method1840(false);
                } else if (var3 > 1000) {
                    var2 = 1;
                    this.method1833(arg0 ^ 6575);
                } else {
                    this.method1828((byte) 70);
                    var2 = 2;
                }
            } else {
                this.method1829(arg0 ^ -6614);
                var2 = 4;
            }
        }
        if (class150.field1711 != 0) {
            super.field2884 = 0;
            class466.method2646(8000, 0);
        }
        this.method1841(125, class623.field8837);
        return var2;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZI)V", line = 357)
    public final void method1832(boolean arg0, int arg1) {
        super.field2863 = arg1;
        class168.field2015 = null;
        class208.field2532 = true;
        if (!arg0) {
            ++field4222;
        }
    }

    @OriginalMember(owner = "client!bga", name = "d", descriptor = "(I)V", line = 379)
    public final void method1833(int arg0) {
        this.method1842(101, false);
        ++field4234;
        super.field2851 = super.field2858 = 0;
        super.field2882 = false;
        super.field2845 = false;
        super.field2839 = false;
        super.field2842 = 0;
        super.field2862 = super.field2883 = arg0;
        super.field2879 = false;
        super.field2874 = false;
        super.field2859 = false;
        super.field2876 = false;
        super.field2864 = false;
        super.field2853 = false;
        super.field2861 = false;
        super.field2872 = false;
        class178.method1049((byte) 34, 0);
        super.field2860 = false;
        super.field2849 = false;
        super.field2854 = 0;
        this.method1836(-123);
        this.method1832(false, 2);
        super.field2843 = 1;
        class593.method3325((byte) -119);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ZLiaa;)V", line = 411)
    private final void method1834(boolean arg0, class452 arg1) {
        ++field4225;
        if (~(arg1.field6209.length + -arg1.field6215) <= -2) {
            int var3 = arg1.method2541(58);
            if (var3 >= 0 && ~var3 >= -23) {
                byte var4;
                if (var3 != 22) {
                    if (var3 != 21) {
                        if (var3 == 20) {
                            var4 = 43;
                        } else if (~var3 != -20) {
                            if (~var3 == -19) {
                                var4 = 41;
                            } else if (~var3 != -18) {
                                if (var3 == 16) {
                                    var4 = 38;
                                } else if (var3 == 15) {
                                    var4 = 37;
                                } else if (var3 != 14) {
                                    if (var3 == 13) {
                                        var4 = 35;
                                    } else if (var3 != 12) {
                                        if (var3 == 11) {
                                            var4 = 33;
                                        } else if (~var3 == -11) {
                                            var4 = 32;
                                        } else if (var3 != 9) {
                                            if (~var3 != -9) {
                                                if (~var3 != -8) {
                                                    if (var3 != 6) {
                                                        if (~var3 != -6) {
                                                            if (~var3 != -5) {
                                                                if (~var3 != -4) {
                                                                    if (~var3 != -3) {
                                                                        if (~var3 == -2) {
                                                                            var4 = 23;
                                                                        } else {
                                                                            var4 = 19;
                                                                        }
                                                                    } else {
                                                                        var4 = 22;
                                                                    }
                                                                } else {
                                                                    var4 = 23;
                                                                }
                                                            } else {
                                                                var4 = 24;
                                                            }
                                                        } else {
                                                            var4 = 28;
                                                        }
                                                    } else {
                                                        var4 = 28;
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
                                        var4 = 34;
                                    }
                                } else {
                                    var4 = 36;
                                }
                            } else {
                                var4 = 40;
                            }
                        } else {
                            var4 = 42;
                        }
                    } else {
                        var4 = 44;
                    }
                } else {
                    var4 = 45;
                }
                if (~var4 >= ~(arg1.field6209.length + -arg1.field6215)) {
                    super.field2868 = arg1.method2541(93);
                    if (~super.field2868 <= -2) {
                        if (~super.field2868 < -5) {
                            super.field2868 = 4;
                        }
                    } else {
                        super.field2868 = 1;
                    }
                    this.method1842(34, ~arg1.method2541(41) == -2);
                    super.field2872 = arg1.method2541(97) == 1;
                    super.field2839 = ~arg1.method2541(61) == -2;
                    super.field2879 = arg1.method2541(103) == 1;
                    super.field2842 = arg1.method2541(34) == 1 ? 1 : 0;
                    super.field2861 = ~arg1.method2541(49) == -2;
                    super.field2845 = ~arg1.method2541(120) == -2;
                    super.field2882 = ~arg1.method2541(37) == -2;
                    super.field2862 = arg1.method2541(65);
                    if (~super.field2862 < -3) {
                        super.field2862 = 2;
                    }
                    if (~var3 <= -18) {
                        super.field2883 = arg1.method2541(113);
                    }
                    if (var3 < 2) {
                        super.field2864 = ~arg1.method2541(97) == -2;
                        arg1.method2541(111);
                    } else {
                        super.field2864 = arg1.method2541(76) == 1;
                        if (~var3 <= -18) {
                            super.field2874 = arg1.method2541(112) == 1;
                        }
                    }
                    super.field2859 = ~arg1.method2541(60) == -2;
                    super.field2853 = ~arg1.method2541(94) == -2;
                    super.field2851 = arg1.method2541(123);
                    if (~super.field2851 < -3) {
                        super.field2851 = 2;
                    }
                    super.field2858 = super.field2851;
                    super.field2840 = ~arg1.method2541(90) == -2;
                    super.field2841 = arg1.method2541(65);
                    if (~super.field2841 < -128) {
                        super.field2841 = 127;
                    }
                    if (var3 >= 20) {
                        super.field2875 = arg1.method2541(70);
                        if (~super.field2875 < -128) {
                            super.field2875 = 127;
                        }
                    } else {
                        super.field2875 = super.field2841;
                    }
                    super.field2866 = arg1.method2541(119);
                    super.field2877 = arg1.method2541(45);
                    if (!arg0) {
                        this.method1828((byte) -90);
                    }
                    if (super.field2877 > 127) {
                        super.field2877 = 127;
                    }
                    if (~var3 > -22) {
                        super.field2873 = super.field2866;
                    } else {
                        super.field2873 = arg1.method2541(64);
                        if (~super.field2873 < -128) {
                            super.field2873 = 127;
                        }
                    }
                    if (var3 >= 1) {
                        super.field2850 = arg1.method2574(-1758460248);
                        super.field2865 = arg1.method2574(-1758460248);
                    }
                    if (var3 >= 3 && ~var3 > -7) {
                        arg1.method2541(114);
                    }
                    if (~var3 <= -5) {
                        int var5 = arg1.method2541(56);
                        if (var5 < 0 || ~var5 < -3) {
                            var5 = 0;
                        }
                        if (~class145.field1630 > -97) {
                            var5 = 0;
                        }
                        class178.method1049((byte) 34, var5);
                    }
                    if (var3 >= 5) {
                        super.field2871 = arg1.method2575((byte) -48);
                    }
                    int var6 = 0;
                    if (var3 >= 6) {
                        super.field2869 = var6 = arg1.method2541(76);
                    }
                    if (~super.field2869 != -2 && super.field2869 != 2) {
                        super.field2869 = 2;
                    }
                    if (~var3 <= -8) {
                        super.field2848 = arg1.method2541(69) == 1;
                    }
                    if (var3 >= 8) {
                        super.field2880 = arg1.method2541(83) == 1;
                    }
                    if (var3 >= 9) {
                        super.field2854 = arg1.method2541(111);
                    }
                    if (~super.field2854 > -1 || ~super.field2854 < ~class601.method3360(class145.field1630, (byte) 3)) {
                        super.field2854 = 0;
                    }
                    if (var3 >= 10) {
                        super.field2849 = ~arg1.method2541(82) != -1;
                    }
                    if (var3 >= 11) {
                        super.field2844 = arg1.method2541(93) != 0;
                    }
                    if (~var3 <= -13) {
                        super.field2842 = arg1.method2541(116);
                    }
                    if (super.field2842 < 0 || super.field2842 > 2) {
                        super.field2842 = 1;
                    }
                    if (~var3 <= -14) {
                        super.field2860 = ~arg1.method2541(101) == -2;
                    }
                    if (var3 >= 14) {
                        super.field2884 = arg1.method2541(105);
                    } else if (var6 != 0) {
                        super.field2884 = 1;
                    } else {
                        super.field2884 = 2;
                    }
                    if (super.field2884 < 0 || super.field2884 > 5) {
                        super.field2884 = 2;
                    }
                    if (var3 >= 15) {
                        super.field2857 = arg1.method2541(55);
                        if (super.field2857 < 0 || super.field2857 > 4) {
                            super.field2857 = class277.field3513 != 1 ? 4 : 2;
                        }
                    }
                    if (~var3 <= -17) {
                        super.field2876 = arg1.method2541(82) == 1;
                        try {
                            if (~jagmisc.getTotalPhysicalMemory() >= -268435457L) {
                                super.field2876 = false;
                            }
                        } catch (Throwable var7) {
                        }
                    }
                    if (var3 < 17 && ~super.field2884 == -1) {
                        super.field2884 = 2;
                    }
                    if (~var3 <= -19) {
                        super.field2843 = arg1.method2541(68);
                        if (~super.field2843 > -1 || ~super.field2843 < -5) {
                            super.field2843 = 0;
                        }
                    }
                    if (var3 >= 19) {
                        super.field2863 = arg1.method2541(124);
                    } else if (~super.field2843 != -2 && ~super.field2843 != -3) {
                        if (~super.field2843 == -4) {
                            super.field2863 = 1;
                        } else {
                            super.field2863 = 0;
                        }
                    } else {
                        super.field2863 = 2;
                    }
                    if (var3 >= 22) {
                        super.field2856 = arg1.method2541(79);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(IB)Z", line = 750)
    public final boolean method1835(int arg0, byte arg1) {
        ++field4218;
        if (arg1 <= 69) {
            return false;
        } else {
            return arg0 == 0 && !this.field4230 ? super.field2852 : true;
        }
    }

    @OriginalMember(owner = "client!bga", name = "h", descriptor = "(I)V", line = 768)
    private final void method1836(int arg0) {
        if (arg0 >= -91) {
            this.method1826(-97, (byte) 28);
        }
        ++field4220;
        if (~class277.field3513 < -2) {
            super.field2857 = 4;
        } else {
            super.field2857 = 2;
        }
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(II)I", line = 792)
    private final int method1837(int arg0, int arg1) {
        ++field4229;
        if (arg0 != 686) {
            method1839(0.2388215F, 0.52865946F, (byte) -40, -0.65321875F);
        }
        byte var3;
        if (arg1 <= 12000) {
            if (~arg1 < -5001) {
                this.method1840(false);
                var3 = 3;
            } else if (~arg1 >= -2001) {
                this.method1833(0);
                var3 = 1;
            } else {
                var3 = 2;
                this.method1828((byte) 70);
            }
        } else {
            var3 = 4;
            this.method1829(92);
        }
        if (~class150.field1711 != -3) {
            super.field2884 = 2;
            class466.method2646(8000, 2);
        }
        this.method1841(arg0 ^ 729, class623.field8837);
        return var3;
    }

    @OriginalMember(owner = "client!bga", name = "c", descriptor = "(III)I", line = 842)
    private final int method1838(int arg0, int arg1, int arg2) {
        ++field4211;
        byte var4;
        if (arg1 > 20000) {
            this.method1829(-122);
            var4 = 4;
        } else if (~arg1 < -10001) {
            var4 = 3;
            this.method1840(false);
        } else if (arg1 > 5000) {
            var4 = 2;
            this.method1828((byte) 70);
        } else {
            this.method1833(0);
            var4 = 1;
        }
        if (class150.field1711 != arg0) {
            super.field2884 = arg0;
            class466.method2646(8000, arg0);
        }
        this.method1841(124, class623.field8837);
        return arg2 >= -114 ? -48 : var4;
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(FFBF)I", line = 890)
    public static final int method1839(float arg0, float arg1, byte arg2, float arg3) {
        ++field4210;
        float var4 = arg1 < 0.0F ? -arg1 : arg1;
        if (arg2 != -99) {
            return -88;
        } else {
            float var5 = !(arg0 < 0.0F) ? arg0 : -arg0;
            float var6 = arg3 < 0.0F ? -arg3 : arg3;
            if (var4 < var5 && var6 < var5) {
                return !(arg0 > 0.0F) ? 1 : 0;
            } else if (var6 > var4 && var5 < var6) {
                return arg3 > 0.0F ? 2 : 3;
            } else {
                return arg1 > 0.0F ? 4 : 5;
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(Z)V", line = 934)
    public final void method1840(boolean arg0) {
        ++field4214;
        this.method1842(89, true);
        super.field2876 = true;
        super.field2839 = true;
        super.field2874 = false;
        super.field2861 = true;
        super.field2859 = false;
        super.field2879 = true;
        super.field2872 = true;
        super.field2862 = super.field2883 = 1;
        super.field2882 = true;
        super.field2845 = true;
        super.field2853 = true;
        super.field2842 = 1;
        super.field2864 = true;
        super.field2851 = super.field2858 = 0;
        if (class145.field1630 <= 95) {
            class178.method1049((byte) 34, 0);
        } else {
            class178.method1049((byte) 34, 1);
        }
        super.field2849 = arg0;
        super.field2854 = 0;
        super.field2860 = true;
        this.method1836(-127);
        this.method1832(false, 1);
        super.field2843 = 3;
        class593.method3325((byte) -101);
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(ILpe;)V", line = 972)
    public final void method1841(int arg0, class556 arg1) {
        ++field4216;
        class647 var3 = null;
        try {
            class199 var4 = arg1.method3140("", true, 118);
            while (var4.field2437 == 0) {
                class370.method2025(-1, 1L);
            }
            if (arg0 <= 118) {
                method1843(-126);
            }
            if (~var4.field2437 == -2) {
                var3 = (class647) var4.field2434;
                class452 var5 = new class452(class421.method2283((byte) -19));
                this.method1316(var5, (byte) -128);
                var3.method3635(var5.field6215, 1, var5.field6209, 0);
            }
        } catch (Exception var7) {
        }
        try {
            if (var3 != null) {
                var3.method3633(0);
            }
        } catch (Exception var6) {
        }
    }

    @OriginalMember(owner = "client!bga", name = "a", descriptor = "(IZ)V", line = 1009)
    public final void method1842(int arg0, boolean arg1) {
        ++field4215;
        if (arg0 > 12) {
            super.field2852 = arg1;
            if (class195.field2339 != null) {
                class195.field2339.method3734(!this.method1835(class150.field1711, (byte) 73), 500);
            }
        }
    }

    @OriginalMember(owner = "client!bga", name = "i", descriptor = "(I)V", line = 1023)
    public static void method1843(int arg0) {
        field4224 = null;
        field4223 = null;
        if (arg0 >= -123) {
            method1843(84);
        }
    }

    @OriginalMember(owner = "client!bga", name = "b", descriptor = "(IZ)I", line = 1040)
    public final int method1844(int arg0, boolean arg1) {
        ++field4221;
        if (!arg1) {
            this.method1838(29, -89, 46);
        }
        if (class662.method3719((byte) 73, arg0) && !class480.method2805(class351.field4601, 2)) {
            return class145.field1630 < 96 && class421.method2281(90, arg0) && super.field2863 == 0 ? 1 : super.field2863;
        } else {
            return 0;
        }
    }
}
