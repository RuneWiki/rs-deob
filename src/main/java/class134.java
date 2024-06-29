import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class134 extends class374 {

    @OriginalMember(owner = "client!qa", name = "Dc", descriptor = "I")
    public int field1921 = -1;

    @OriginalMember(owner = "client!qa", name = "Mc", descriptor = "B")
    private byte field1930 = 0;

    @OriginalMember(owner = "client!qa", name = "Hc", descriptor = "B")
    private byte field1925 = 0;

    @OriginalMember(owner = "client!qa", name = "Pc", descriptor = "I")
    public int field1933 = 255;

    @OriginalMember(owner = "client!qa", name = "Lc", descriptor = "I")
    public int field1929 = 0;

    @OriginalMember(owner = "client!qa", name = "Kc", descriptor = "I")
    public int field1928 = 0;

    @OriginalMember(owner = "client!qa", name = "Ic", descriptor = "I")
    public int field1926 = -1;

    @OriginalMember(owner = "client!qa", name = "cd", descriptor = "I")
    public int field1946 = 0;

    @OriginalMember(owner = "client!qa", name = "Jc", descriptor = "B")
    private byte field1927 = 0;

    @OriginalMember(owner = "client!qa", name = "ld", descriptor = "I")
    public int field1955 = -1;

    @OriginalMember(owner = "client!qa", name = "kd", descriptor = "I")
    public int field1954 = -1;

    @OriginalMember(owner = "client!qa", name = "nd", descriptor = "I")
    public int field1957 = 0;

    @OriginalMember(owner = "client!qa", name = "jd", descriptor = "I")
    public int field1953 = -1;

    @OriginalMember(owner = "client!qa", name = "qd", descriptor = "I")
    public int field1960 = -1;

    @OriginalMember(owner = "client!qa", name = "Gc", descriptor = "I")
    public int field1924 = 0;

    @OriginalMember(owner = "client!qa", name = "pd", descriptor = "I")
    public int field1959 = -1;

    @OriginalMember(owner = "client!qa", name = "rd", descriptor = "Z")
    public boolean field1961 = false;

    @OriginalMember(owner = "client!qa", name = "Rc", descriptor = "Z")
    public static boolean field1935 = false;

    @OriginalMember(owner = "client!qa", name = "Bc", descriptor = "I")
    public static int field1919;

    @OriginalMember(owner = "client!qa", name = "Cc", descriptor = "I")
    public static int field1920;

    @OriginalMember(owner = "client!qa", name = "Fc", descriptor = "I")
    public static int field1923;

    @OriginalMember(owner = "client!qa", name = "Nc", descriptor = "I")
    public static int field1931;

    @OriginalMember(owner = "client!qa", name = "Oc", descriptor = "I")
    public static int field1932;

    @OriginalMember(owner = "client!qa", name = "Sc", descriptor = "I")
    public static int field1936;

    @OriginalMember(owner = "client!qa", name = "Uc", descriptor = "I")
    public static int field1938;

    @OriginalMember(owner = "client!qa", name = "Vc", descriptor = "I")
    public static int field1939;

    @OriginalMember(owner = "client!qa", name = "Wc", descriptor = "I")
    public static int field1940;

    @OriginalMember(owner = "client!qa", name = "Xc", descriptor = "I")
    public static int field1941;

    @OriginalMember(owner = "client!qa", name = "Yc", descriptor = "I")
    public static int field1942;

    @OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
    public static int field1943;

    @OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
    public static int field1944;

    @OriginalMember(owner = "client!qa", name = "bd", descriptor = "I")
    public static int field1945;

    @OriginalMember(owner = "client!qa", name = "dd", descriptor = "I")
    private int field1947;

    @OriginalMember(owner = "client!qa", name = "ed", descriptor = "I")
    public static int field1948;

    @OriginalMember(owner = "client!qa", name = "fd", descriptor = "I")
    public static int field1949;

    @OriginalMember(owner = "client!qa", name = "gd", descriptor = "I")
    public static int field1950;

    @OriginalMember(owner = "client!qa", name = "hd", descriptor = "I")
    public static int field1951;

    @OriginalMember(owner = "client!qa", name = "id", descriptor = "I")
    public static int field1952;

    @OriginalMember(owner = "client!qa", name = "md", descriptor = "I")
    public static int field1956;

    @OriginalMember(owner = "client!qa", name = "od", descriptor = "I")
    public static int field1958;

    @OriginalMember(owner = "client!qa", name = "Qc", descriptor = "Lnj;")
    public class133 field1934;

    @OriginalMember(owner = "client!qa", name = "Ec", descriptor = "Ljava/lang/String;")
    public String field1922;

    @OriginalMember(owner = "client!qa", name = "Tc", descriptor = "Ljava/lang/String;")
    public String field1937;

    @OriginalMember(owner = "client!qa", name = "f", descriptor = "(B)Z", line = 6)
    public final boolean method929(byte arg0) {
        ++field1943;
        if (arg0 != -6) {
            this.method674((byte) -121);
        }
        return this.field1934 != null;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IZIII)V", line = 26)
    public final void method930(int arg0, boolean arg1, int arg2, int arg3, int arg4) {
        if (arg3 <= -68) {
            ++field1948;
            super.method2389(arg2, arg4, this.method942(false), arg1, -110, arg0);
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IILuo;I)Z", line = 37)
    public final boolean method675(int arg0, int arg1, class345 arg2, int arg3) {
        ++field1944;
        if (arg1 != -20759) {
            return true;
        } else if (this.field1934 != null && this.method935(65536, (byte) 22, arg2)) {
            class417 var5 = arg2.method84();
            int var6 = super.field5269.method608(16383);
            var5.method698(var6);
            var5.method696(super.field6262, super.field6270, super.field6266);
            for (int var7 = 0; ~super.field5325.length < ~var7; ++var7) {
                if (super.field5325[var7] != null && super.field5325[var7].method1465(arg3, arg0, var5, true)) {
                    return true;
                }
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Luo;I)V", line = 72)
    public final void method678(class345 arg0, int arg1) {
        ++field1942;
        if (arg1 != -22948) {
            this.field1929 = -56;
        }
        if (this.field1934 != null) {
            if (super.field5340 || this.method935(0, (byte) 22, arg0)) {
                this.method2387(super.field5340, arg0, super.field5325, (byte) 107);
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BZ)Ljava/lang/String;", line = 95)
    public final String method931(byte arg0, boolean arg1) {
        ++field1949;
        if (arg0 >= -122) {
            this.method942(false);
        }
        String var3 = "";
        if (class22.field400 != null) {
            var3 = var3 + class22.field400[this.field1927];
        }
        int[] var4;
        if (~this.field1930 == -2 && class47.field653 != null) {
            var4 = class47.field653;
        } else {
            var4 = class310.field4248;
        }
        if (var4 != null && ~var4[this.field1927] != 0) {
            class124 var5 = class277.method1808((byte) 124, var4[this.field1927]);
            if (~var5.field1725 != -116) {
                class271.method1776(-2296, new Throwable(), "gdn1");
                var4[this.field1927] = -1;
            } else {
                var3 = var3 + var5.method839(this.field1925 & 255, (byte) -12);
            }
        }
        String var6;
        if (arg1) {
            var6 = var3 + this.field1937;
        } else {
            var6 = var3 + this.field1922;
        }
        if (class378.field5405 != null) {
            var6 = var6 + class378.field5405[this.field1927];
        }
        return var6;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IIB)V", line = 139)
    public final void method932(int arg0, int arg1, byte arg2) {
        ++field1956;
        int var4 = super.field5326[0];
        int var5 = super.field5332[0];
        if (~arg1 == -1) {
            --var4;
            ++var5;
        }
        if (~arg1 == -2) {
            ++var5;
        }
        if (arg1 == 2) {
            ++var4;
            ++var5;
        }
        if (~arg1 == -4) {
            --var4;
        }
        if (arg1 == 4) {
            ++var4;
        }
        if (~arg1 == -6) {
            --var5;
            --var4;
        }
        if (~arg1 == -7) {
            --var5;
        }
        if (arg1 == 7) {
            --var5;
            ++var4;
        }
        if (~super.field5264 != 0 && class108.method761((byte) -82, super.field5264).field5817 == 1) {
            super.field5264 = -1;
        }
        if (super.field5300 != -1) {
            class80 var6 = class393.method2484(super.field5300, -57);
            if (var6.field1144 && var6.field1125 != -1 && ~class108.method761((byte) -82, var6.field1125).field5817 == -2) {
                super.field5300 = -1;
            }
        }
        if (super.field5344 < 9) {
            ++super.field5344;
        }
        int var7 = super.field5344;
        if (arg2 < 70) {
            this.method678((class345) null, 82);
        }
        while (var7 > 0) {
            super.field5326[var7] = super.field5326[var7 + -1];
            super.field5332[var7] = super.field5332[var7 - 1];
            super.field5337[var7] = super.field5337[var7 - 1];
            --var7;
        }
        super.field5326[0] = var4;
        super.field5337[0] = (byte) arg0;
        super.field5332[0] = var5;
    }

    @OriginalMember(owner = "client!qa", name = "e", descriptor = "(B)I", line = 240)
    public final int method915(byte arg0) {
        int var2 = 25 / ((34 - arg0) / 56);
        ++field1938;
        return super.field5262;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(I)I", line = 250)
    public final int method933(int arg0) {
        ++field1952;
        if (arg0 < 48) {
            this.field1924 = -96;
        }
        return this.field1947;
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(B)Lun;", line = 261)
    public static final class243 method934(byte arg0) {
        if (arg0 != 68) {
            field1935 = true;
        }
        ++field1941;
        try {
            return (class243) Class.forName("ed").newInstance();
        } catch (Throwable var1) {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZLuo;)Laj;", line = 283)
    public final class170 method681(boolean arg0, class345 arg1) {
        ++field1939;
        if (this.field1934 != null && this.method935(1024, (byte) 22, arg1)) {
            class417 var3 = arg1.method84();
            int var4 = super.field5269.method608(16383);
            var3.method698(var4);
            var3.method696(super.field6262, super.field6270, super.field6266);
            float var5 = arg1.method106();
            float var6 = arg1.method97();
            if (class106.field1472) {
                class428 var7 = this.method2388(26);
                if (var7.field6043 && (~this.field1934.field1911 == 0 || class412.method2584(this.field1934.field1911, true).field4514)) {
                    class411 var8 = ~super.field5264 != 0 && ~super.field5251 == -1 ? class108.method761((byte) -82, super.field5264) : null;
                    class411 var9 = ~super.field5297 == 0 || this.field1961 || super.field5280 && var8 != null ? null : class108.method761((byte) -82, super.field5297);
                    class394 var10 = class397.method2512(super.field5310, super.field5325[0], 0, 1, arg1, 0, 160, 0, super.field5283, var9 != null ? super.field5273 : super.field5319, super.field5315, var9 != null ? var9 : var8, var4, 240, super.field5254);
                    if (var10 != null) {
                        arg1.method80(var5, var6 + -128.0F);
                        arg1.method96(false);
                        var10.method1416(var3, (class84) null, 0);
                        arg1.method96(true);
                    }
                }
            }
            if (class412.field5841 == this) {
                arg1.method80(var5, var6 - 144.0F);
                var3.method702(super.field6262, super.field6270, super.field6266);
                for (int var11 = class131.field1864.length + -1; ~var11 <= -1; --var11) {
                    class285 var12 = class131.field1864[var11];
                    if (var12 != null && var12.field4024 != -1) {
                        if (~var12.field4017 == -2 && ~var12.field4025 <= -1 && ~class98.field1358.length < ~var12.field4025) {
                            class198 var13 = class98.field1358[var12.field4025];
                            if (var13 != null) {
                                int var14 = var13.field6262 / 32 + -(class412.field5841.field6262 / 32);
                                int var15 = var13.field6266 / 32 + -(class412.field5841.field6266 / 32);
                                this.method936(var12.field4024, var3, -1, arg1, var15, super.field5325[0], 360000, var14);
                            }
                        }
                        if (var12.field4017 == 2) {
                            int var16 = (var12.field4019 - class212.field2968) * 4 + 2 + -(class412.field5841.field6262 / 32);
                            int var17 = (var12.field4026 - class447.field6269) * 4 + 2 + -(class412.field5841.field6266 / 32);
                            int var18 = var12.field4022 * 4;
                            int var19 = var18 * var18;
                            this.method936(var12.field4024, var3, -1, arg1, var17, super.field5325[0], var19, var16);
                        }
                        if (~var12.field4017 == -11 && ~var12.field4025 <= -1 && class381.field5447.length > var12.field4025) {
                            class134 var20 = class381.field5447[var12.field4025];
                            if (var20 != null) {
                                int var21 = var20.field6262 / 32 - class412.field5841.field6262 / 32;
                                int var22 = var20.field6266 / 32 + -(class412.field5841.field6266 / 32);
                                this.method936(var12.field4024, var3, -1, arg1, var22, super.field5325[0], 360000, var21);
                            }
                        }
                    }
                }
                var3.method698(var4);
                var3.method696(super.field6262, super.field6270, super.field6266);
            }
            arg1.method80(var5, var6);
            class170 var23 = class175.method1152((byte) 72, super.field5325.length);
            if (super.field5336 == null) {
                arg1.method79(super.field5325, var3, var23.field2333, class412.field5841 == this ? 1 : 0);
            } else {
                class77 var24 = super.field5336.method2017();
                arg1.method123(super.field5325, var24, var3, var23.field2333, class412.field5841 != this ? 0 : 1);
            }
            if (!arg0) {
                this.method938((class11) null, (byte) 92);
            }
            this.method2387(false, arg1, super.field5325, (byte) 107);
            if (super.field5325[2] != null) {
                if (~var4 != -1) {
                    super.field5325[2].method1441(var4);
                }
                super.field5325[2].method1455(-super.field5334 + super.field6262, -super.field5342 + super.field6270, -super.field5329 + super.field6266);
            }
            return var23;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBLuo;)Z", line = 433)
    private final boolean method935(int arg0, byte arg1, class345 arg2) {
        ++field1950;
        int var4 = arg0;
        if (arg1 != 22) {
            return true;
        } else {
            class428 var5 = this.method2388(89);
            class411 var6 = ~super.field5264 != 0 && ~super.field5251 == -1 ? class108.method761((byte) -82, super.field5264) : null;
            class411 var7 = super.field5297 == -1 || this.field1961 || super.field5280 && var6 != null ? null : class108.method761((byte) -82, super.field5297);
            int var8 = var5.field6032;
            int var9 = var5.field6059;
            if (var8 != 0 || var9 != 0 || var5.field6062 != 0 || var5.field6023 != 0) {
                arg0 |= 7;
            }
            super.field5325[0] = this.field1934.method920(super.field5266, arg0, var6, super.field5270, super.field5296, 30740, super.field5319, arg2, super.field5273, super.field5256, super.field5255, true, var7);
            int var10 = class121.method826(false);
            if (class445.field6242 < 96 && ~var10 < -51) {
                class44.method397(false);
            }
            if (class412.field5854 != 0 && ~var10 > -51) {
                int var11 = -var10 + 50;
                while (class348.field4774 < var11) {
                    class285.field4028[class348.field4774] = new byte[102400];
                    ++class348.field4774;
                }
                while (~var11 > ~class348.field4774) {
                    --class348.field4774;
                    class285.field4028[class348.field4774] = null;
                }
            } else if (class412.field5854 != 0) {
                class285.field4028 = new byte[50][];
                class348.field4774 = 0;
            }
            if (super.field5325[0] == null) {
                return false;
            } else {
                super.field5262 = super.field5325[0].method1443();
                this.method2391(super.field5325[0], 2);
                int var12 = super.field5269.method608(16383);
                super.field5310 = 0;
                super.field5315 = 0;
                super.field5254 = 0;
                if (~var8 == -1 && var9 == 0) {
                    this.method2382(var12, this.method942(false) << 7, this.method942(false) << 7, (byte) 10);
                } else {
                    this.method2382(var12, var9, var8, (byte) 10);
                    if (~super.field5254 != -1) {
                        super.field5325[0].method1413(super.field5254);
                    }
                    if (~super.field5310 != -1) {
                        super.field5325[0].method1427(super.field5310);
                    }
                    if (super.field5315 != 0) {
                        super.field5325[0].method1455(0, super.field5315, 0);
                    }
                }
                super.field5325[1] = null;
                if (!this.field1961 && super.field5300 != -1 && super.field5295 != -1) {
                    class80 var13 = class393.method2484(super.field5300, -91);
                    class394 var14 = var13.method580(super.field5295, -1172, arg2, var4 | (!var13.field1136 ? 2 : 7), super.field5316, super.field5257);
                    if (var14 != null) {
                        var14.method1455(0, -super.field5288, 0);
                        if (var13.field1136 && (~var8 != -1 || ~var9 != -1)) {
                            if (super.field5254 != 0) {
                                var14.method1413(super.field5254);
                            }
                            if (super.field5310 != 0) {
                                var14.method1427(super.field5310);
                            }
                            if (~super.field5315 != -1) {
                                var14.method1455(0, super.field5315, 0);
                            }
                        }
                        super.field5325[1] = var14;
                    }
                }
                super.field5325[2] = null;
                if (!this.field1961 && super.field5343 != null) {
                    if (~class276.field3837 <= ~super.field5333) {
                        super.field5343 = null;
                    }
                    if (super.field5331 <= class276.field3837 && class276.field3837 < super.field5333) {
                        class394 var15 = super.field5343.method685(7 | var4, arg2, -9380);
                        if (var15 != null) {
                            var15.method1455(super.field5334 - super.field6262, -super.field6270 + super.field5342, -super.field6266 + super.field5329);
                            if (~var12 != -1) {
                                var15.method1441(16383 & -var12);
                            }
                            super.field5325[2] = var15;
                        }
                    }
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "d", descriptor = "(B)V", line = 584)
    public final void method674(byte arg0) {
        ++field1932;
        if (arg0 != -1) {
            this.method937(-62);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILic;ILuo;ILmj;II)V", line = 600)
    private final void method936(int arg0, class417 arg1, int arg2, class345 arg3, int arg4, class394 arg5, int arg6, int arg7) {
        ++field1958;
        int var9 = arg4 * arg4 + arg7 * arg7;
        if (var9 >= 16 && var9 <= arg6) {
            int var10 = (int) (2607.5945876176133D * Math.atan2((double) arg7, (double) arg4)) & 16383;
            class394 var11 = class200.method1305(super.field6262, var10, arg5, super.field5315, -27, super.field6270, super.field5310, arg3, super.field5254, arg0, super.field6266);
            if (arg2 == -1) {
                if (var11 != null) {
                    arg3.method96(false);
                    var11.method1416(arg1, (class84) null, 0);
                    arg3.method96(true);
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(I)I", line = 627)
    public final int method937(int arg0) {
        ++field1919;
        if (arg0 != 1) {
            this.field1955 = 27;
        }
        return -1;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lkh;B)V", line = 643)
    public final void method938(class11 arg0, byte arg1) {
        ++field1945;
        arg0.field191 = 0;
        int var3 = arg0.method172((byte) 52);
        this.field1930 = (byte) (var3 & 1);
        boolean var4 = ~(2 & var3) != -1;
        boolean var5 = ~(var3 & 4) != -1;
        int var6 = super.method942(false);
        this.method2383((7 & var3 >> 3) + 1, (byte) 1);
        this.field1927 = (byte) ((var3 & 207) >> 6);
        super.field6262 += 64 * (-var6 + this.method942(false));
        super.field6266 += (this.method942(false) + -var6) * 64;
        this.field1925 = arg0.method162(-4436);
        this.field1926 = arg0.method162(arg1 + -4500);
        this.field1960 = arg0.method162(-4436);
        int var7 = -1;
        this.field1957 = 0;
        int[] var8 = new int[12];
        for (int var9 = 0; var9 < 12; ++var9) {
            int var10 = arg0.method172((byte) 52);
            if (var10 == 0) {
                var8[var9] = 0;
            } else {
                int var11 = arg0.method172((byte) 52);
                int var12 = (var10 << 8) - -var11;
                if (~var9 == -1 && var12 == 65535) {
                    var7 = arg0.method174(255);
                    this.field1957 = arg0.method172((byte) 52);
                    break;
                }
                if (~var12 <= -32769) {
                    int var26 = class306.field4233[var12 + -32768];
                    var8[var9] = class393.method2487(var26, 1073741824);
                    int var27 = class51.method433((byte) 87, var26).field4943;
                    if (~var27 != -1) {
                        this.field1957 = var27;
                    }
                } else {
                    var8[var9] = class393.method2487(Integer.MIN_VALUE, var12 + -256);
                }
            }
        }
        int[] var13 = new int[5];
        for (int var14 = 0; ~var14 > -6; ++var14) {
            int var25 = arg0.method172((byte) 52);
            if (~var25 > -1 || var25 >= class157.field2219[var14].length) {
                var25 = 0;
            }
            var13[var14] = var25;
        }
        this.field1947 = arg0.method174(255);
        this.field1937 = arg0.method171(arg1 + -9329);
        if (!var4) {
            this.field1922 = this.field1937;
        } else {
            this.field1922 = arg0.method171(arg1 + -9329);
        }
        this.field1946 = arg0.method172((byte) 52);
        if (var5) {
            this.field1929 = arg0.method174(255);
            this.field1928 = this.field1946;
            this.field1955 = -1;
        } else {
            this.field1929 = 0;
            this.field1928 = arg0.method172((byte) 52);
            this.field1955 = arg0.method172((byte) 52);
            if (~this.field1955 == -256) {
                this.field1955 = -1;
            }
        }
        int var15 = this.field1924;
        this.field1924 = arg0.method172((byte) 52);
        if (~this.field1924 == -1) {
            class369.method2371(true, this);
        } else {
            int var16 = this.field1954;
            int var17 = this.field1953;
            int var18 = this.field1921;
            int var19 = this.field1959;
            int var20 = this.field1933;
            this.field1954 = arg0.method174(255);
            this.field1953 = arg0.method174(255);
            this.field1921 = arg0.method174(255);
            this.field1959 = arg0.method174(255);
            this.field1933 = arg0.method172((byte) 52);
            if (~this.field1924 != ~var15 || ~this.field1954 != ~var16 || ~this.field1953 != ~var17 || ~this.field1921 != ~var18 || ~this.field1959 != ~var19 || ~this.field1933 != ~var20) {
                class292.method1887((byte) -30, this);
            }
        }
        if (this.field1934 == null) {
            this.field1934 = new class133();
        }
        int var21 = this.field1934.field1911;
        int[] var22 = this.field1934.field1893;
        this.field1934.method928(var13, var7, var8, this.field1930 == 1, this.method933(arg1 ^ 55), 0);
        if (~var7 != ~var21) {
            super.field6262 = super.field5326[0] * 128 - -(this.method942(false) * 64);
            super.field6266 = super.field5332[0] * 128 - -(this.method942(false) * 64);
        }
        if (~super.field5294 == -2048 && var22 != null) {
            for (int var23 = 0; var13.length > var23; ++var23) {
                if (~var13[var23] != ~var22[var23]) {
                    class288.method1876(false);
                    break;
                }
            }
        }
        if (arg1 != 64) {
            this.field1922 = null;
        }
        if (super.field5336 != null) {
            super.field5336.method2024();
        }
        if (~super.field5297 != 0 && super.field5280) {
            class428 var24 = this.method2388(33);
            if (!var24.method2707(super.field5297, (byte) 109)) {
                super.field5297 = -1;
                super.field5280 = false;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ZB)Ljava/lang/String;", line = 838)
    public final String method939(boolean arg0, byte arg1) {
        ++field1951;
        if (arg1 != 0) {
            return null;
        } else {
            return arg0 ? this.field1937 : this.field1922;
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BC)Z", line = 856)
    public static final boolean method940(byte arg0, char arg1) {
        ++field1920;
        if (Character.isISOControl(arg1)) {
            return false;
        } else if (class165.method1109(-11891, arg1)) {
            return true;
        } else {
            char[] var2 = class62.field857;
            for (int var3 = 0; ~var3 > ~var2.length; ++var3) {
                char var7 = var2[var3];
                if (arg1 == var7) {
                    return true;
                }
            }
            if (arg0 != 62) {
                field1935 = false;
            }
            char[] var4 = class445.field6244;
            for (int var5 = 0; var5 < var4.length; ++var5) {
                char var6 = var4[var5];
                if (arg1 == var6) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(B)Z", line = 900)
    public final boolean method683(byte arg0) {
        ++field1931;
        int var2 = -105 / ((arg0 - 47) / 47);
        return false;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(IBIILrr;Luo;Z)V", line = 916)
    public final void method679(int arg0, byte arg1, int arg2, int arg3, class203 arg4, class345 arg5, boolean arg6) {
        ++field1923;
        if (arg1 != -126) {
            this.field1947 = 71;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!qa", name = "h", descriptor = "(B)V", line = 930)
    public static final void method941(byte arg0) {
        class341.field4664.method90(((float) class361.field5000 * 0.1F + 0.7F) * 1.1523438F);
        int var1 = 92 % ((-23 - arg0) / 54);
        ++field1936;
        class341.field4664.method67(class19.field344, 0.69921875F, 1.2F, -50.0F, -60.0F, -50.0F);
        class341.field4664.method120(class269.field3745, -1);
        class341.field4664.method130(class66.field986);
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(Z)I", line = 962)
    public final int method942(boolean arg0) {
        ++field1940;
        if (this.field1934 != null && this.field1934.field1911 != -1) {
            return class412.method2584(this.field1934.field1911, true).field4488;
        } else {
            if (arg0) {
                this.method674((byte) -94);
            }
            return super.method942(false);
        }
    }
}
