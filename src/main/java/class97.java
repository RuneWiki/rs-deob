import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kb")
public class class97 extends class139 {

    @OriginalMember(owner = "client!kb", name = "bb", descriptor = "I")
    private int field2059 = 0;

    @OriginalMember(owner = "client!kb", name = "T", descriptor = "I")
    private int field2051 = 0;

    @OriginalMember(owner = "client!kb", name = "rb", descriptor = "I")
    private int field2075 = 0;

    @OriginalMember(owner = "client!kb", name = "V", descriptor = "I")
    public static int field2053 = 0;

    @OriginalMember(owner = "client!kb", name = "Y", descriptor = "I")
    public static int field2056 = -1;

    @OriginalMember(owner = "client!kb", name = "eb", descriptor = "I")
    public static int field2062 = 3353893;

    @OriginalMember(owner = "client!kb", name = "Z", descriptor = "Lrf;")
    public static class163 field2057 = class53.method392(-128, "Hidden)2");

    @OriginalMember(owner = "client!kb", name = "ab", descriptor = "Lrf;")
    private static class163 field2058 = class53.method392(69, "Walk here");

    @OriginalMember(owner = "client!kb", name = "tb", descriptor = "Lrf;")
    public static class163 field2077 = field2058;

    @OriginalMember(owner = "client!kb", name = "pb", descriptor = "Z")
    public static boolean field2073 = false;

    @OriginalMember(owner = "client!kb", name = "U", descriptor = "I")
    private int field2052;

    @OriginalMember(owner = "client!kb", name = "X", descriptor = "I")
    public static int field2055;

    @OriginalMember(owner = "client!kb", name = "cb", descriptor = "I")
    private int field2060;

    @OriginalMember(owner = "client!kb", name = "db", descriptor = "I")
    public static int field2061;

    @OriginalMember(owner = "client!kb", name = "fb", descriptor = "I")
    public static int field2063;

    @OriginalMember(owner = "client!kb", name = "gb", descriptor = "I")
    private int field2064;

    @OriginalMember(owner = "client!kb", name = "hb", descriptor = "I")
    public static int field2065;

    @OriginalMember(owner = "client!kb", name = "ib", descriptor = "I")
    public static int field2066;

    @OriginalMember(owner = "client!kb", name = "jb", descriptor = "I")
    public static int field2067;

    @OriginalMember(owner = "client!kb", name = "kb", descriptor = "I")
    public static int field2068;

    @OriginalMember(owner = "client!kb", name = "lb", descriptor = "I")
    public static int field2069;

    @OriginalMember(owner = "client!kb", name = "mb", descriptor = "I")
    public static int field2070;

    @OriginalMember(owner = "client!kb", name = "nb", descriptor = "I")
    public static int field2071;

    @OriginalMember(owner = "client!kb", name = "ob", descriptor = "I")
    private int field2072;

    @OriginalMember(owner = "client!kb", name = "qb", descriptor = "I")
    public static int field2074;

    @OriginalMember(owner = "client!kb", name = "sb", descriptor = "I")
    private int field2076;

    @OriginalMember(owner = "client!kb", name = "ub", descriptor = "I")
    private int field2078;

    @OriginalMember(owner = "client!kb", name = "vb", descriptor = "I")
    public static int field2079;

    @OriginalMember(owner = "client!kb", name = "wb", descriptor = "I")
    public static int field2080;

    @OriginalMember(owner = "client!kb", name = "xb", descriptor = "J")
    public static long field2081;

    @OriginalMember(owner = "client!kb", name = "W", descriptor = "[[[Llg;")
    public static class111[][][] field2054;

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lig;B)Z")
    public static final boolean method667(class84 arg0, byte arg1) {
        ++field2070;
        if (arg1 < 125) {
            field2053 = -99;
        }
        if (arg0.field1734 == null) {
            return false;
        } else {
            for (int var2 = 0; arg0.field1734.length > var2; ++var2) {
                int var3 = class162.method1017(arg0, 118, var2);
                int var4 = arg0.field1846[var2];
                if (arg0.field1734[var2] == 2) {
                    if (~var4 >= ~var3) {
                        return false;
                    }
                } else if (arg0.field1734[var2] == 3) {
                    if (var3 <= var4) {
                        return false;
                    }
                } else if (arg0.field1734[var2] != 4) {
                    if (~var3 != ~var4) {
                        return false;
                    }
                } else if (var3 == var4) {
                    return false;
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IB)Lre;")
    public static final class162 method668(int arg0, byte arg1) {
        ++field2065;
        class162 var2 = (class162) class52.field1043.method401((long) arg0, (byte) 126);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class112.field2366.method1235(arg0, (byte) -64, 12);
            class162 var4 = new class162();
            if (var3 != null) {
                var4.method1015(new class52(var3), true);
            }
            var4.method1018(true);
            if (arg1 != 44) {
                field2053 = -47;
            }
            class52.field1043.method398(var4, (long) arg0, (byte) 80);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "e", descriptor = "(II)Lac;")
    public static final class4 method669(int arg0, int arg1) {
        ++field2080;
        class4 var2 = (class4) class71.field1493.method401((long) arg1, (byte) 109);
        if (var2 != null) {
            return var2;
        } else {
            byte[] var3 = class197.field3921.method1235(arg1, (byte) -64, 10);
            class4 var4 = new class4();
            var4.field49 = arg1;
            if (var3 != null) {
                var4.method36(new class52(var3), (byte) -45);
            }
            var4.method35((byte) -53);
            if (var4.field53 != -1) {
                var4.method43(64, method669(-99, var4.field53), method669(-109, var4.field54));
            }
            if (!class184.field3645 && var4.field37) {
                var4.field88 = null;
                var4.field48 = false;
                var4.field79 = 0;
                var4.field62 = class108.field2255;
                var4.field42 = null;
            }
            if (arg0 >= -84) {
                field2073 = true;
            }
            class71.field1493.method398(var4, (long) arg1, (byte) 92);
            return var4;
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(II)[[I")
    public final int[][] method77(int arg0, int arg1) {
        ++field2067;
        int[][] var3 = super.field2866.method259(arg1, -2);
        if (arg0 < 53) {
            return null;
        } else {
            if (super.field2866.field885) {
                int[][] var4 = this.method910((byte) -60, arg1, 0);
                int[] var5 = var4[0];
                int[] var6 = var3[0];
                int[] var7 = var4[2];
                int[] var8 = var4[1];
                int[] var9 = var3[1];
                int[] var10 = var3[2];
                for (int var11 = 0; ~class23.field402 < ~var11; ++var11) {
                    this.method674(-1, var8[var11], var5[var11], var7[var11]);
                    this.field2072 += this.field2059;
                    this.field2064 += this.field2051;
                    while (this.field2072 < 0) {
                        this.field2072 += 4096;
                    }
                    while (~this.field2072 < -4097) {
                        this.field2072 -= 4096;
                    }
                    this.field2060 += this.field2075;
                    if (~this.field2060 > -1) {
                        this.field2060 = 0;
                    }
                    if (this.field2060 > 4096) {
                        this.field2060 = 4096;
                    }
                    if (this.field2064 < 0) {
                        this.field2064 = 0;
                    }
                    if (~this.field2064 < -4097) {
                        this.field2064 = 4096;
                    }
                    this.method677(this.field2072, this.field2064, this.field2060, -1272614688);
                    var6[var11] = this.field2076;
                    var9[var11] = this.field2078;
                    var10[var11] = this.field2052;
                }
            }
            return var3;
        }
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(I)V")
    public static final void method670(int arg0) {
        class141.field2896.method326(104, 192);
        if (arg0 <= -88) {
            ++field2071;
            for (class87 var1 = (class87) class138.field2847.method468(1); var1 != null; var1 = (class87) class138.field2847.method471(-4984)) {
                if (var1.field1890 == 0) {
                    class32.method211((byte) -20, true, var1);
                }
            }
            if (class88.field1924 != null) {
                class194.method1295((byte) -126, class88.field1924);
                class88.field1924 = null;
            }
            ++class177.field3571;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(IILfa;)V")
    public final void method64(int arg0, int arg1, class52 arg2) {
        if (arg1 == 21) {
            if (arg0 != 0) {
                if (arg0 != 1) {
                    if (~arg0 == -3) {
                        this.field2051 = (arg2.method353(90) << 12) / 100;
                    }
                } else {
                    this.field2075 = (arg2.method353(-88) << 12) / 100;
                }
            } else {
                this.field2059 = arg2.method389(353);
            }
            ++field2079;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(Lrf;Lrf;Lu;B)Lrh;")
    public static final class165 method671(class163 arg0, class163 arg1, class184 arg2, byte arg3) {
        ++field2061;
        int var4 = arg2.method1228(99, arg0);
        int var5 = arg2.method1231(arg1, var4, 2);
        if (arg3 != -47) {
            field2054 = null;
        }
        return class209.method1360(arg2, var5, var4, (byte) -53);
    }

    @OriginalMember(owner = "client!kb", name = "<init>", descriptor = "()V")
    public class97() {
        super(1, false);
    }

    @OriginalMember(owner = "client!kb", name = "f", descriptor = "(B)V")
    public static void method672(byte arg0) {
        if (arg0 > 24) {
            field2058 = null;
            field2054 = null;
            field2077 = null;
            field2057 = null;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ILig;)Z")
    public static final boolean method673(int arg0, class84 arg1) {
        if (arg0 != 2) {
            method667((class84) null, (byte) -70);
        }
        int var2 = arg1.field1830;
        ++field2063;
        if (~var2 == -206) {
            class202.field3984 = 250;
            return true;
        } else {
            if (~var2 <= -301 && var2 <= 313) {
                int var3 = (var2 + -300) / 2;
                int var4 = 1 & var2;
                class108.field2241.method794(-112, var3, ~var4 == -2);
            }
            if (~var2 <= -315 && var2 <= 323) {
                int var5 = (var2 + -314) / 2;
                int var6 = 1 & var2;
                class108.field2241.method790(var6 == 1, var5, (byte) -107);
            }
            if (var2 == 324) {
                class108.field2241.method792(-24238, false);
            }
            if (~var2 == -326) {
                class108.field2241.method792(-24238, true);
            }
            if (~var2 == -327) {
                ++class132.field2750;
                class141.field2896.method326(104, 231);
                class108.field2241.method789((byte) -76, class141.field2896);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!kb", name = "b", descriptor = "(IIII)V")
    private final void method674(int arg0, int arg1, int arg2, int arg3) {
        ++field2068;
        int var5 = ~arg1 > ~arg2 ? arg2 : arg1;
        int var6 = ~arg2 > ~arg1 ? arg2 : arg1;
        int var7 = arg3 <= var5 ? var5 : arg3;
        int var8 = ~var6 < ~arg3 ? arg3 : var6;
        int var9 = -var8 + var7;
        this.field2064 = (var8 - -var7) / 2;
        if (~var9 < arg0) {
            if (~this.field2064 < -1 && ~this.field2064 > -4097) {
                this.field2060 = (var9 << 12) / (~this.field2064 >= -2049 ? this.field2064 * 2 : 8192 - this.field2064 * 2);
            }
            int var10 = (-arg2 + var7 << 12) / var9;
            int var11 = (-arg1 + var7 << 12) / var9;
            int var12 = (-arg3 + var7 << 12) / var9;
            if (arg2 == var7) {
                this.field2072 = arg1 != var8 ? -var11 + 4096 : var12 + 20480;
            } else if (~arg1 != ~var7) {
                this.field2072 = ~arg2 == ~var8 ? var11 + 12288 : -var10 + 20480;
            } else {
                this.field2072 = ~arg3 == ~var8 ? var10 + 4096 : -var12 + 12288;
            }
            this.field2072 /= 6;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(ZI)V")
    public static final void method675(boolean arg0, int arg1) {
        if (class56.field1136.field716 >> 7 == class113.field2392 && ~(class56.field1136.field679 >> 7) == ~class158.field3233) {
            class113.field2392 = 0;
        }
        int var2 = class112.field2377;
        if (arg0) {
            var2 = 1;
        }
        ++field2066;
        for (int var3 = 0; ~var2 < ~var3; ++var3) {
            long var4;
            class38 var6;
            if (arg0) {
                var4 = 8791798054912L;
                var6 = class56.field1136;
            } else {
                var6 = class121.field2553[class27.field504[var3]];
                var4 = (long) class27.field504[var3] << 32;
            }
            if (var6 != null && var6.method228(3)) {
                var6.field774 = false;
                int var7 = var6.field716 >> 7;
                int var8 = var6.field679 >> 7;
                if ((class86.field1880 && ~class112.field2377 < -51 || class112.field2377 > 200) && !arg0 && ~var6.field721 == ~var6.field705) {
                    var6.field774 = true;
                }
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var6.field782 != null && ~class51.field1023 <= ~var6.field762 && class51.field1023 < var6.field790) {
                        var6.field774 = false;
                        var6.field739 = class175.method1186(var6.field716, class60.field1227, var6.field679, 1);
                        class121.method823(class60.field1227, var6.field716, var6.field679, var6.field739, var6, var6.field727, var4, var6.field759, var6.field755, var6.field787, var6.field768);
                    } else {
                        if ((127 & var6.field716) == 64 && (var6.field679 & 127) == 64) {
                            if (~class100.field2103[var7][var8] == ~class161.field3257) {
                                continue;
                            }
                            class100.field2103[var7][var8] = class161.field3257;
                        }
                        var6.field739 = class175.method1186(var6.field716, class60.field1227, var6.field679, 1);
                        class144.method936(class60.field1227, var6.field716, var6.field679, var6.field739, 60, var6, var6.field727, var4, var6.field683);
                    }
                }
            }
        }
        if (arg1 > -116) {
            field2074 = -66;
        }
    }

    @OriginalMember(owner = "client!kb", name = "a", descriptor = "(B[BI)I")
    public static final int method676(byte arg0, byte[] arg1, int arg2) {
        ++field2055;
        if (arg0 <= 123) {
            field2073 = false;
        }
        return class138.method908(0, (byte) -106, arg2, arg1);
    }

    @OriginalMember(owner = "client!kb", name = "c", descriptor = "(IIII)V")
    private final void method677(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 != -1272614688) {
            method668(-34, (byte) 30);
        }
        ++field2069;
        int var5 = ~arg1 >= -2049 ? (arg2 + 4096) * arg1 >> 12 : -(arg1 * arg2 >> 12) + arg1 + arg2;
        if (~var5 >= -1) {
            this.field2076 = this.field2078 = this.field2052 = arg1;
        } else {
            int var6 = arg0 * 6;
            int var7 = arg1 - -arg1 + -var5;
            int var8 = (-var7 + var5 << 12) / var5;
            int var9 = var6 >> 12;
            int var10 = var6 - (var9 << 12);
            int var12 = var8 * var5 >> 12;
            int var13 = var10 * var12 >> 12;
            int var14 = var7 + var13;
            int var15 = -var13 + var5;
            if (~var9 != -1) {
                if (~var9 != -2) {
                    if (~var9 != -3) {
                        if (~var9 != -4) {
                            if (~var9 != -5) {
                                if (var9 == 5) {
                                    this.field2078 = var7;
                                    this.field2076 = var5;
                                    this.field2052 = var15;
                                }
                            } else {
                                this.field2076 = var14;
                                this.field2078 = var7;
                                this.field2052 = var5;
                            }
                        } else {
                            this.field2078 = var15;
                            this.field2052 = var5;
                            this.field2076 = var7;
                        }
                    } else {
                        this.field2052 = var14;
                        this.field2078 = var5;
                        this.field2076 = var7;
                    }
                } else {
                    this.field2052 = var7;
                    this.field2078 = var5;
                    this.field2076 = var15;
                }
            } else {
                this.field2078 = var14;
                this.field2052 = var7;
                this.field2076 = var5;
            }
        }
    }
}
