import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class157 extends class298 {

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public int field2100;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "Z")
    public boolean field2107;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "Z")
    public boolean field2105;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "[S")
    public short[] field2103;

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "I")
    public int field2099;

    @OriginalMember(owner = "client!pk", name = "U", descriptor = "I")
    private int field2112;

    @OriginalMember(owner = "client!pk", name = "B", descriptor = "Lbn;")
    public static class160 field2095 = new class160(49, 8);

    @OriginalMember(owner = "client!pk", name = "V", descriptor = "Lkg;")
    public static class223 field2113 = null;

    @OriginalMember(owner = "client!pk", name = "X", descriptor = "Lbn;")
    public static class160 field2115 = new class160(54, -1);

    @OriginalMember(owner = "client!pk", name = "Z", descriptor = "[[I")
    public static int[][] field2117 = new int[128][128];

    @OriginalMember(owner = "client!pk", name = "ab", descriptor = "Z")
    public static boolean field2118 = false;

    @OriginalMember(owner = "client!pk", name = "Y", descriptor = "Lbn;")
    public static class160 field2116 = new class160(74, 1);

    @OriginalMember(owner = "client!pk", name = "db", descriptor = "F")
    public static float field2121;

    @OriginalMember(owner = "client!pk", name = "E", descriptor = "I")
    public static int field2096;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    private int field2097;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    private int field2098;

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "I")
    public static int field2101;

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "I")
    public static int field2102;

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "I")
    public static int field2104;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field2106;

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "I")
    public static int field2108;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    private int field2109;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field2110;

    @OriginalMember(owner = "client!pk", name = "T", descriptor = "I")
    private int field2111;

    @OriginalMember(owner = "client!pk", name = "bb", descriptor = "Lwj;")
    public static class11 field2119;

    @OriginalMember(owner = "client!pk", name = "cb", descriptor = "Lfp;")
    public static class9 field2120;

    @OriginalMember(owner = "client!pk", name = "W", descriptor = "[[[B")
    public static byte[][][] field2114;

    @OriginalMember(owner = "client!pk", name = "d", descriptor = "(B)V", line = 3)
    public static final void method1061(byte arg0) {
        class304[] var1 = class5.field84;
        synchronized (class5.field84) {
            int var2 = 0;
            while (true) {
                if (var2 >= class5.field84.length) {
                    break;
                }
                class5.field84[var2] = new class304();
                class323.field4768[var2] = 0;
                ++var2;
            }
        }
        ++field2101;
        if (arg0 != -118) {
            method1068((byte) -50);
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZLwc;I)V", line = 26)
    public static final void method1062(boolean arg0, class380 arg1, int arg2) {
        ++field2104;
        if (class237.field3532 < 400) {
            if (arg2 >= 121) {
                if (class187.field2619 != arg1) {
                    String var9;
                    if (arg1.field5581 == 0) {
                        boolean var3 = true;
                        if (~class187.field2619.field5583 != 0 && arg1.field5583 != -1) {
                            int var4 = class187.field2619.field5553 > arg1.field5553 ? class187.field2619.field5553 : arg1.field5553;
                            int var5 = ~class187.field2619.field5583 > ~arg1.field5583 ? class187.field2619.field5583 : arg1.field5583;
                            int var6 = 5 - -(var4 * 10 / 100) + var5;
                            int var7 = class187.field2619.field5553 - arg1.field5553;
                            if (var7 < 0) {
                                var7 = -var7;
                            }
                            if (~var7 < ~var6) {
                                var3 = false;
                            }
                        }
                        String var8 = class408.field5869 == class166.field2191 ? class433.field6314.method2543(false, class153.field2073) : class37.field528.method2543(false, class153.field2073);
                        if (arg1.field5553 >= arg1.field5566) {
                            var9 = arg1.method2408(126, true) + (var3 ? class308.method2057(class187.field2619.field5553, (byte) 99, arg1.field5553) : "<col=ffffff>") + " (" + var8 + arg1.field5553 + ")";
                        } else {
                            var9 = arg1.method2408(-83, true) + (var3 ? class308.method2057(class187.field2619.field5553, (byte) 99, arg1.field5553) : "<col=ffffff>") + " (" + var8 + arg1.field5553 + "+" + (-arg1.field5553 + arg1.field5566) + ")";
                        }
                    } else {
                        var9 = arg1.method2408(103, true) + " (" + class402.field5804.method2543(false, class153.field2073) + arg1.field5581 + ")";
                    }
                    if (!class147.field1993) {
                        if (!arg0) {
                            for (int var10 = 7; ~var10 <= -1; --var10) {
                                if (class141.field1928[var10] != null) {
                                    short var11 = 0;
                                    if (class92.field1139 == class408.field5869 && class141.field1928[var10].equalsIgnoreCase(class282.field4143.method2543(false, class153.field2073))) {
                                        if (arg1.field5553 > class187.field2619.field5553) {
                                            var11 = 2000;
                                        }
                                        if (class187.field2619.field5580 != 0 && ~arg1.field5580 != -1) {
                                            if (~class187.field2619.field5580 != ~arg1.field5580) {
                                                var11 = 0;
                                            } else {
                                                var11 = 2000;
                                            }
                                        }
                                    } else if (class418.field6063[var10]) {
                                        var11 = 2000;
                                    }
                                    short var12 = (short) (class343.field5047[var10] + var11);
                                    int var13 = class466.field6859[var10] == -1 ? class452.field6668 : class466.field6859[var10];
                                    class463.method2862(var13, 0, false, true, class141.field1928[var10], (long) arg1.field777, "<col=ffffff>" + var9, (byte) -127, var12, 0);
                                    ++class13.field212;
                                }
                            }
                        } else {
                            class463.method2862(-1, 0, true, false, "<col=cccccc>" + var9, 0L, "", (byte) -97, 0, 0);
                        }
                    } else if (!arg0 && ~(8 & class433.field6315) != -1) {
                        class463.method2862(class90.field1107, 0, false, true, class253.field3723, (long) arg1.field777, class429.field6240 + " -> <col=ffffff>" + var9, (byte) -96, 44, 0);
                        ++class93.field1151;
                    }
                    if (!arg0) {
                        for (class375 var14 = (class375) class138.field1885.method2478(1603); var14 != null; var14 = (class375) class138.field1885.method2486((byte) -82)) {
                            if (var14.field5469 == 18) {
                                var14.field5477 = "<col=ffffff>" + var9;
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZIB)V", line = 166)
    public final void method1063(boolean arg0, int arg1, byte arg2) {
        ++field2102;
        int var4;
        if (arg0) {
            var4 = 2048;
        } else {
            int var5 = this.field2109 * arg1 / 50 + this.field2112 & 2047;
            int var6 = this.field2097;
            if (var6 != 1) {
                if (var6 != 3) {
                    if (var6 != 4) {
                        if (var6 != 2) {
                            if (~var6 == -6) {
                                var4 = (var5 < 1024 ? var5 : 2048 - var5) << 1;
                            } else {
                                var4 = 2048;
                            }
                        } else {
                            var4 = var5;
                        }
                    } else {
                        var4 = var5 >> 10 << 11;
                    }
                } else {
                    var4 = class387.field5659[var5] >> 1;
                }
            } else {
                var4 = (class327.field4863[var5 << 3] >> 5) + 1024;
            }
        }
        if (arg2 != -57) {
            this.field2103 = null;
        }
        super.field4335 = (float) ((this.field2098 * var4 >> 11) + this.field2111) / 2048.0F;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(CB)Z", line = 242)
    public static final boolean method1064(char arg0, byte arg1) {
        ++field2106;
        if (arg0 >= ' ' && arg0 <= '~') {
            return true;
        } else if (arg1 != -79) {
            return true;
        } else if (arg0 >= 160 && arg0 <= 255) {
            return true;
        } else {
            return ~arg0 == -8365 || ~arg0 == -339 || arg0 == 8212 || arg0 == 339 || arg0 == 376;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IIIII)V", line = 264)
    public final void method1065(int arg0, int arg1, int arg2, int arg3, int arg4) {
        this.field2097 = arg1;
        this.field2109 = arg2;
        if (arg0 != -22119) {
            this.field2109 = 100;
        }
        ++field2110;
        this.field2098 = arg4;
        this.field2111 = arg3;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Z)V", line = 287)
    public static void method1066(boolean arg0) {
        field2116 = null;
        field2115 = null;
        field2113 = null;
        field2114 = null;
        field2120 = null;
        if (arg0) {
            method1062(false, (class380) null, 95);
        }
        field2095 = null;
        field2117 = null;
        field2119 = null;
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(Z)V", line = 304)
    private final void method1067(boolean arg0) {
        ++field2096;
        int var2 = this.field2099;
        if (~var2 != -3) {
            if (~var2 != -4) {
                if (var2 != 4) {
                    if (var2 != 5) {
                        if (var2 != 12) {
                            if (~var2 != -14) {
                                if (~var2 != -11) {
                                    if (~var2 != -12) {
                                        if (~var2 != -7) {
                                            if (~var2 != -8) {
                                                if (var2 != 8) {
                                                    if (var2 != 9) {
                                                        if (var2 != 14) {
                                                            if (~var2 != -16) {
                                                                if (~var2 == -17) {
                                                                    this.field2097 = 1;
                                                                    this.field2111 = 1792;
                                                                    this.field2098 = 256;
                                                                    this.field2109 = 8192;
                                                                } else {
                                                                    this.field2097 = 0;
                                                                    this.field2111 = 0;
                                                                    this.field2109 = 2048;
                                                                    this.field2098 = 2048;
                                                                }
                                                            } else {
                                                                this.field2097 = 1;
                                                                this.field2098 = 512;
                                                                this.field2111 = 1536;
                                                                this.field2109 = 4096;
                                                            }
                                                        } else {
                                                            this.field2111 = 1280;
                                                            this.field2097 = 1;
                                                            this.field2109 = 2048;
                                                            this.field2098 = 768;
                                                        }
                                                    } else {
                                                        this.field2109 = 4096;
                                                        this.field2111 = 1024;
                                                        this.field2098 = 1024;
                                                        this.field2097 = 3;
                                                    }
                                                } else {
                                                    this.field2097 = 3;
                                                    this.field2109 = 2048;
                                                    this.field2111 = 1024;
                                                    this.field2098 = 1024;
                                                }
                                            } else {
                                                this.field2109 = 4096;
                                                this.field2098 = 768;
                                                this.field2097 = 3;
                                                this.field2111 = 1280;
                                            }
                                        } else {
                                            this.field2098 = 768;
                                            this.field2111 = 1280;
                                            this.field2097 = 3;
                                            this.field2109 = 2048;
                                        }
                                    } else {
                                        this.field2109 = 4096;
                                        this.field2098 = 512;
                                        this.field2097 = 3;
                                        this.field2111 = 1536;
                                    }
                                } else {
                                    this.field2109 = 2048;
                                    this.field2111 = 1536;
                                    this.field2098 = 512;
                                    this.field2097 = 3;
                                }
                            } else {
                                this.field2097 = 2;
                                this.field2111 = 0;
                                this.field2098 = 2048;
                                this.field2109 = 8192;
                            }
                        } else {
                            this.field2111 = 0;
                            this.field2097 = 2;
                            this.field2098 = 2048;
                            this.field2109 = 2048;
                        }
                    } else {
                        this.field2109 = 8192;
                        this.field2097 = 4;
                        this.field2098 = 2048;
                        this.field2111 = 0;
                    }
                } else {
                    this.field2097 = 4;
                    this.field2111 = 0;
                    this.field2098 = 2048;
                    this.field2109 = 2048;
                }
            } else {
                this.field2098 = 2048;
                this.field2097 = 1;
                this.field2111 = 0;
                this.field2109 = 4096;
            }
        } else {
            this.field2109 = 2048;
            this.field2111 = 0;
            this.field2097 = 1;
            this.field2098 = 2048;
        }
        if (!arg0) {
            this.method1067(true);
        }
    }

    @OriginalMember(owner = "client!pk", name = "e", descriptor = "(B)V", line = 505)
    public static final void method1068(byte arg0) {
        class271.field4016 = null;
        class184.field2580 = null;
        class342.field5039 = false;
        ++field2108;
        class296.field4313 = null;
        class169.field2215 = null;
        class446.field6502 = null;
        class51.method400(-57);
        int var1 = -106 % ((52 - arg0) / 44);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 527)
    protected class157() {
        if (class387.field5659 == null) {
            class377.method2392(0);
        }
        this.method1067(true);
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "(Lat;)V", line = 537)
    public class157(class256 arg0) {
        if (class387.field5659 == null) {
            class377.method2392(0);
        }
        this.field2100 = arg0.method1738((byte) -109);
        this.field2107 = (this.field2100 & 16) != 0;
        this.field2105 = ~(this.field2100 & 8) != -1;
        this.field2100 &= 7;
        super.field4337 = arg0.method1767(1930493576);
        super.field4336 = arg0.method1767(1930493576);
        super.field4338 = arg0.method1767(1930493576);
        super.field4332 = arg0.method1738((byte) 77);
        int var2 = super.field4332 * 2 + 1;
        this.field2103 = new short[var2];
        for (int var3 = 0; var3 < this.field2103.length; ++var3) {
            short var5 = (short) arg0.method1767(1930493576);
            int var6 = var5 >>> 8;
            if (~var2 >= ~var6) {
                var6 = var2 + -1;
            }
            int var7 = 255 & var5;
            if (-var6 + var2 < var7) {
                var7 = -var6 + var2;
            }
            this.field2103[var3] = (short) class259.method1785(var7, var6 << 8);
        }
        super.field4332 = (super.field4332 << class167.field2206) - -class135.field1852;
        if (class79.field992 == null) {
            super.field4342 = class10.field129[65535 & class57.method429(arg0.method1767(1930493576), 127)];
        } else {
            super.field4342 = class79.field992[arg0.method1767(1930493576)];
        }
        int var4 = arg0.method1738((byte) 108);
        this.field2099 = 31 & var4;
        this.field2112 = 1792 & var4 << 3;
        if (this.field2099 != 31) {
            this.method1067(true);
        }
    }
}
