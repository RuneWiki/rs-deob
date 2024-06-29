import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qa")
public class class96 extends class31 {

    @OriginalMember(owner = "client!qa", name = "od", descriptor = "I")
    public int field2220 = 0;

    @OriginalMember(owner = "client!qa", name = "td", descriptor = "I")
    public int field2225 = 0;

    @OriginalMember(owner = "client!qa", name = "Yc", descriptor = "I")
    public int field2204 = 0;

    @OriginalMember(owner = "client!qa", name = "hd", descriptor = "I")
    public int field2213 = -1;

    @OriginalMember(owner = "client!qa", name = "kd", descriptor = "I")
    public int field2216 = 0;

    @OriginalMember(owner = "client!qa", name = "Bd", descriptor = "I")
    public int field2233 = -1;

    @OriginalMember(owner = "client!qa", name = "id", descriptor = "I")
    public int field2214 = 0;

    @OriginalMember(owner = "client!qa", name = "zd", descriptor = "Z")
    public boolean field2231 = false;

    @OriginalMember(owner = "client!qa", name = "Zc", descriptor = "I")
    public static int field2205 = 0;

    @OriginalMember(owner = "client!qa", name = "vd", descriptor = "[Lpb;")
    public static class91[] field2227 = new class91[14];

    @OriginalMember(owner = "client!qa", name = "Ed", descriptor = "I")
    public static int field2236 = 99;

    @OriginalMember(owner = "client!qa", name = "Ad", descriptor = "Lba;")
    public static class7 field2232 = new class7(50);

    @OriginalMember(owner = "client!qa", name = "Hd", descriptor = "[I")
    public static int[] field2239 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!qa", name = "Id", descriptor = "Lgd;")
    private static class40 field2240 = class14.method90(false, "Loaded fonts");

    @OriginalMember(owner = "client!qa", name = "Gd", descriptor = "I")
    public static int field2238 = 0;

    @OriginalMember(owner = "client!qa", name = "Kd", descriptor = "Lgd;")
    private static class40 field2242 = class14.method90(false, "Password: ");

    @OriginalMember(owner = "client!qa", name = "Jd", descriptor = "Lgd;")
    public static class40 field2241 = field2242;

    @OriginalMember(owner = "client!qa", name = "Nd", descriptor = "Lgd;")
    public static class40 field2245 = field2240;

    @OriginalMember(owner = "client!qa", name = "Ld", descriptor = "I")
    public static int field2243 = 0;

    @OriginalMember(owner = "client!qa", name = "ad", descriptor = "I")
    public int field2206;

    @OriginalMember(owner = "client!qa", name = "bd", descriptor = "I")
    public static int field2207;

    @OriginalMember(owner = "client!qa", name = "cd", descriptor = "I")
    public int field2208;

    @OriginalMember(owner = "client!qa", name = "dd", descriptor = "I")
    public static int field2209;

    @OriginalMember(owner = "client!qa", name = "fd", descriptor = "I")
    public static int field2211;

    @OriginalMember(owner = "client!qa", name = "gd", descriptor = "I")
    public int field2212;

    @OriginalMember(owner = "client!qa", name = "jd", descriptor = "I")
    public int field2215;

    @OriginalMember(owner = "client!qa", name = "md", descriptor = "I")
    public static int field2218;

    @OriginalMember(owner = "client!qa", name = "nd", descriptor = "I")
    public int field2219;

    @OriginalMember(owner = "client!qa", name = "pd", descriptor = "I")
    public static int field2221;

    @OriginalMember(owner = "client!qa", name = "qd", descriptor = "I")
    public int field2222;

    @OriginalMember(owner = "client!qa", name = "rd", descriptor = "I")
    public static int field2223;

    @OriginalMember(owner = "client!qa", name = "sd", descriptor = "I")
    public static int field2224;

    @OriginalMember(owner = "client!qa", name = "ud", descriptor = "I")
    public static int field2226;

    @OriginalMember(owner = "client!qa", name = "wd", descriptor = "I")
    public static int field2228;

    @OriginalMember(owner = "client!qa", name = "yd", descriptor = "I")
    public static int field2230;

    @OriginalMember(owner = "client!qa", name = "Cd", descriptor = "I")
    public int field2234;

    @OriginalMember(owner = "client!qa", name = "Fd", descriptor = "I")
    public int field2237;

    @OriginalMember(owner = "client!qa", name = "ld", descriptor = "Lsd;")
    public class112 field2217;

    @OriginalMember(owner = "client!qa", name = "ed", descriptor = "Lgd;")
    public class40 field2210;

    @OriginalMember(owner = "client!qa", name = "Dd", descriptor = "Lqb;")
    public class97 field2235;

    @OriginalMember(owner = "client!qa", name = "Md", descriptor = "Z")
    public static boolean field2244;

    @OriginalMember(owner = "client!qa", name = "xd", descriptor = "[I")
    public static int[] field2229;

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lee;Z)Lee;", line = 4)
    public static final class30 method644(class30 arg0, boolean arg1) {
        int var2;
        if (~arg0.field704 <= -1) {
            var2 = arg0.field704 >> 16;
        } else {
            var2 = arg0.field722 >> 16;
        }
        ++field2228;
        if (!arg1) {
            field2240 = null;
        }
        if (!class94.method638(var2, 0)) {
            return null;
        } else if (~arg0.field758 > -1) {
            class30 var3 = class129.field3093[var2][arg0.field758 >> 15 & 65535];
            return var3 != null && var3.field745 != null && ~(32767 & arg0.field758) > ~var3.field745.length ? var3.field745[arg0.field758 & 32767] : null;
        } else {
            return class129.field3093[var2][65535 & arg0.field758];
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(BLfa;)V", line = 41)
    public static final void method645(byte arg0, class31 arg1) {
        if (arg0 != -72) {
            field2232 = null;
        }
        ++field2223;
        arg1.field777 = arg1.field830;
        if (~arg1.field791 == -1) {
            arg1.field768 = 0;
        } else {
            if (~arg1.field813 != 0 && ~arg1.field804 == -1) {
                class45 var2 = class22.method126((byte) -114, arg1.field813);
                if (arg1.field770 > 0 && var2.field1127 == 0) {
                    ++arg1.field768;
                    return;
                }
                if (arg1.field770 <= 0 && ~var2.field1158 == -1) {
                    ++arg1.field768;
                    return;
                }
            }
            int var3 = arg1.field819[arg1.field791 + -1] * 128 + arg1.field794 * 64;
            int var4 = arg1.field803[arg1.field791 + -1] * 128 + arg1.field794 * 64;
            int var5 = arg1.field792;
            int var6 = arg1.field838;
            if (-var5 + var4 <= 256 && ~(-var5 + var4) <= 255 && ~(-var6 + var3) >= -257 && ~(-var6 + var3) <= 255) {
                if (var4 > var5) {
                    if (var6 >= var3) {
                        if (~var6 >= ~var3) {
                            arg1.field781 = 1536;
                        } else {
                            arg1.field781 = 1792;
                        }
                    } else {
                        arg1.field781 = 1280;
                    }
                } else if (~var5 >= ~var4) {
                    if (~var6 > ~var3) {
                        arg1.field781 = 1024;
                    } else if (~var6 < ~var3) {
                        arg1.field781 = 0;
                    }
                } else if (var3 <= var6) {
                    if (~var6 < ~var3) {
                        arg1.field781 = 256;
                    } else {
                        arg1.field781 = 512;
                    }
                } else {
                    arg1.field781 = 768;
                }
                int var7 = 2047 & -arg1.field828 + arg1.field781;
                int var8 = arg1.field814;
                int var9 = 4;
                if (~arg1.field828 != ~arg1.field781 && arg1.field766 == -1 && arg1.field837 != 0) {
                    var9 = 2;
                }
                if (var7 > 1024) {
                    var7 -= 2048;
                }
                if (~arg1.field791 < -3) {
                    var9 = 6;
                }
                if (arg1.field791 > 3) {
                    var9 = 8;
                }
                if (~var7 <= 255 && var7 <= 256) {
                    var8 = arg1.field808;
                } else if (var7 >= 256 && var7 < 768) {
                    var8 = arg1.field785;
                } else if (~var7 <= 767 && ~var7 >= 255) {
                    var8 = arg1.field797;
                }
                if (~arg1.field768 < -1 && ~arg1.field791 < -2) {
                    --arg1.field768;
                    var9 = 8;
                }
                if (~var8 == 0) {
                    var8 = arg1.field808;
                }
                arg1.field777 = var8;
                if (arg1.field821[arg1.field791 + -1]) {
                    var9 <<= 1;
                }
                if (~var6 <= ~var3) {
                    if (~var3 > ~var6) {
                        arg1.field838 -= var9;
                        if (~arg1.field838 > ~var3) {
                            arg1.field838 = var3;
                        }
                    }
                } else {
                    arg1.field838 += var9;
                    if (~var3 > ~arg1.field838) {
                        arg1.field838 = var3;
                    }
                }
                if (~var5 > ~var4) {
                    arg1.field792 += var9;
                    if (arg1.field792 > var4) {
                        arg1.field792 = var4;
                    }
                } else if (~var5 < ~var4) {
                    arg1.field792 -= var9;
                    if (~var4 < ~arg1.field792) {
                        arg1.field792 = var4;
                    }
                }
                if (~arg1.field792 == ~var4 && arg1.field838 == var3) {
                    --arg1.field791;
                    if (arg1.field770 > 0) {
                        --arg1.field770;
                    }
                }
                if (var9 >= 8 && arg1.field808 == arg1.field777 && ~arg1.field807 != 0) {
                    arg1.field777 = arg1.field807;
                }
            } else {
                arg1.field838 = var3;
                arg1.field792 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "g", descriptor = "(I)Z", line = 224)
    public final boolean method135(int arg0) {
        ++field2221;
        if (this.field2217 == null) {
            return false;
        } else {
            if (arg0 != 25) {
                this.method2((byte) 7);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!qa", name = "c", descriptor = "(Z)V", line = 246)
    public static void method646(boolean arg0) {
        field2229 = null;
        field2245 = null;
        if (!arg0) {
            method647(96, -71);
        }
        field2241 = null;
        field2232 = null;
        field2240 = null;
        field2239 = null;
        field2242 = null;
        field2227 = null;
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(II)V", line = 280)
    public static final void method647(int arg0, int arg1) {
        ++field2226;
        if (arg1 != -1) {
            if (arg0 > -85) {
                field2229 = null;
            }
            if (class30.field756[arg1]) {
                class12.field311.method751((byte) -79, arg1);
                if (class129.field3093[arg1] != null) {
                    boolean var2 = true;
                    for (int var3 = 0; ~var3 > ~class129.field3093[arg1].length; ++var3) {
                        if (class129.field3093[arg1][var3] != null) {
                            if (~class129.field3093[arg1][var3].field660 == -3) {
                                var2 = false;
                            } else {
                                class129.field3093[arg1][var3] = null;
                            }
                        }
                    }
                    if (var2) {
                        class129.field3093[arg1] = null;
                    }
                    class30.field756[arg1] = false;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "j", descriptor = "(I)I", line = 341)
    public static final int method648(int arg0) {
        ++field2209;
        if (arg0 != 5) {
            field2244 = false;
        }
        return 5;
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(Lra;BZ)Z", line = 356)
    public static final boolean method649(class102 arg0, byte arg1, boolean arg2) {
        ++field2230;
        if (arg1 <= 2) {
            method649((class102) null, (byte) -53, false);
        }
        class11.field291 = 20;
        try {
            class114.field2744 = (class113) Class.forName("lc").newInstance();
            return true;
        } catch (Throwable var4) {
            class17 var3 = arg0.method724(41);
            if (var3 != null) {
                class114.field2744 = new class62(arg0, var3);
                return true;
            } else if (arg2) {
                class114.field2744 = new class13(arg0);
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "b", descriptor = "(B)Lqb;", line = 403)
    public final class97 method2(byte arg0) {
        ++field2224;
        if (this.field2217 == null) {
            return null;
        } else {
            class45 var2 = super.field813 != -1 && super.field804 == 0 ? class22.method126((byte) 102, super.field813) : null;
            if (arg0 > -110) {
                return null;
            } else {
                class45 var3 = super.field777 != -1 && !this.field2231 && (super.field830 != super.field777 || var2 == null) ? class22.method126((byte) 87, super.field777) : null;
                class97 var4 = this.field2217.method860(super.field799, var2, var3, (byte) -114, super.field798);
                if (var4 == null) {
                    return null;
                } else {
                    var4.method672();
                    super.field820 = var4.field11;
                    if (!this.field2231 && super.field827 != -1 && ~super.field806 != 0) {
                        class97 var5 = class58.method437(super.field827, -4990).method381((byte) 116, super.field806);
                        if (var5 != null) {
                            class97[] var6 = new class97[] { var4, var5 };
                            var5.method653(0, -super.field795, 0);
                            var4 = new class97(var6, 2, true);
                        }
                    }
                    if (!this.field2231 && this.field2235 != null) {
                        if (this.field2216 <= class10.field242) {
                            this.field2235 = null;
                        }
                        if (class10.field242 >= this.field2220 && this.field2216 > class10.field242) {
                            class97 var7 = this.field2235;
                            var7.method653(-super.field792 + this.field2219, -this.field2206 + this.field2212, -super.field838 + this.field2222);
                            if (~super.field781 == -513) {
                                var7.method679();
                                var7.method679();
                                var7.method679();
                            } else if (super.field781 == 1024) {
                                var7.method679();
                                var7.method679();
                            } else if (~super.field781 == -1537) {
                                var7.method679();
                            }
                            class97[] var8 = new class97[] { var4, var7 };
                            var4 = new class97(var8, 2, true);
                            if (super.field781 == 512) {
                                var7.method679();
                            } else if (~super.field781 != -1025) {
                                if (super.field781 == 1536) {
                                    var7.method679();
                                    var7.method679();
                                    var7.method679();
                                }
                            } else {
                                var7.method679();
                                var7.method679();
                            }
                            var7.method653(-this.field2219 + super.field792, -this.field2212 + this.field2206, -this.field2222 + super.field838);
                        }
                    }
                    var4.field2268 = true;
                    return var4;
                }
            }
        }
    }

    @OriginalMember(owner = "client!qa", name = "a", descriptor = "(ILrc;)V", line = 502)
    public final void method650(int arg0, class104 arg1) {
        arg1.field2563 = 0;
        int var3 = arg1.method798((byte) -102);
        ++field2207;
        this.field2233 = arg1.method781(255);
        this.field2213 = arg1.method781(255);
        int[] var4 = new int[12];
        int var5 = -1;
        this.field2225 = 0;
        for (int var6 = 0; var6 < 12; ++var6) {
            int var7 = arg1.method798((byte) -49);
            if (var7 == 0) {
                var4[var6] = 0;
            } else {
                int var8 = arg1.method798((byte) -58);
                var4[var6] = (var7 << 8) - -var8;
                if (~var6 == -1 && var4[0] == 65535) {
                    var5 = arg1.method797(arg0 + -8172);
                    break;
                }
                if (~var4[var6] <= -513) {
                    int var12 = class132.method1041(var4[var6] + -512, 95).field135;
                    if (~var12 != -1) {
                        this.field2225 = var12;
                    }
                }
            }
        }
        int[] var9 = new int[5];
        if (arg0 != 256) {
            method644((class30) null, false);
        }
        for (int var10 = 0; ~var10 > -6; ++var10) {
            int var11 = arg1.method798((byte) -106);
            if (var11 < 0 || ~var11 <= ~class125.field2962[var10].length) {
                var11 = 0;
            }
            var9[var10] = var11;
        }
        super.field830 = arg1.method797(-7916);
        if (~super.field830 == -65536) {
            super.field830 = -1;
        }
        super.field811 = arg1.method797(-7916);
        if (~super.field811 == -65536) {
            super.field811 = -1;
        }
        super.field825 = super.field811;
        super.field808 = arg1.method797(-7916);
        if (super.field808 == 65535) {
            super.field808 = -1;
        }
        super.field814 = arg1.method797(arg0 ^ -8172);
        if (~super.field814 == -65536) {
            super.field814 = -1;
        }
        super.field797 = arg1.method797(-7916);
        if (~super.field797 == -65536) {
            super.field797 = -1;
        }
        super.field785 = arg1.method797(arg0 + -8172);
        if (super.field785 == 65535) {
            super.field785 = -1;
        }
        super.field807 = arg1.method797(-7916);
        if (~super.field807 == -65536) {
            super.field807 = -1;
        }
        this.field2210 = class64.method463(arg1.method808(true), (byte) -69).method244(0);
        this.field2214 = arg1.method798((byte) -109);
        this.field2204 = arg1.method797(-7916);
        if (this.field2217 == null) {
            this.field2217 = new class112();
        }
        this.field2217.method862(var5, var4, 256, ~var3 == -2, var9);
    }
}
