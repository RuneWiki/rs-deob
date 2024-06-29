import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!c")
public class class158 extends class419 {

    @OriginalMember(owner = "client!c", name = "Ic", descriptor = "I")
    public int field2010 = 0;

    @OriginalMember(owner = "client!c", name = "Rc", descriptor = "I")
    public int field2019 = 0;

    @OriginalMember(owner = "client!c", name = "Gc", descriptor = "I")
    public int field2008 = -1;

    @OriginalMember(owner = "client!c", name = "Hc", descriptor = "I")
    public int field2009 = 0;

    @OriginalMember(owner = "client!c", name = "Xc", descriptor = "I")
    public int field2025 = 0;

    @OriginalMember(owner = "client!c", name = "dd", descriptor = "I")
    public int field2031 = -1;

    @OriginalMember(owner = "client!c", name = "Qc", descriptor = "I")
    public int field2018 = -1;

    @OriginalMember(owner = "client!c", name = "Oc", descriptor = "I")
    public int field2016 = -1;

    @OriginalMember(owner = "client!c", name = "bd", descriptor = "B")
    private byte field2029 = 0;

    @OriginalMember(owner = "client!c", name = "Jc", descriptor = "Z")
    public boolean field2011 = false;

    @OriginalMember(owner = "client!c", name = "cd", descriptor = "I")
    public int field2030 = -1;

    @OriginalMember(owner = "client!c", name = "Uc", descriptor = "I")
    public int field2022 = 0;

    @OriginalMember(owner = "client!c", name = "id", descriptor = "I")
    public int field2036 = -1;

    @OriginalMember(owner = "client!c", name = "Sc", descriptor = "I")
    public int field2020 = 255;

    @OriginalMember(owner = "client!c", name = "nd", descriptor = "I")
    public int field2041 = -1;

    @OriginalMember(owner = "client!c", name = "sd", descriptor = "B")
    private byte field2046 = 0;

    @OriginalMember(owner = "client!c", name = "td", descriptor = "Lph;")
    public static class114 field2047 = new class114(64);

    @OriginalMember(owner = "client!c", name = "Kc", descriptor = "I")
    public static int field2012;

    @OriginalMember(owner = "client!c", name = "Lc", descriptor = "I")
    public static int field2013;

    @OriginalMember(owner = "client!c", name = "Mc", descriptor = "I")
    public static int field2014;

    @OriginalMember(owner = "client!c", name = "Nc", descriptor = "I")
    public static int field2015;

    @OriginalMember(owner = "client!c", name = "Tc", descriptor = "I")
    public static int field2021;

    @OriginalMember(owner = "client!c", name = "Vc", descriptor = "I")
    public static int field2023;

    @OriginalMember(owner = "client!c", name = "Wc", descriptor = "I")
    public static int field2024;

    @OriginalMember(owner = "client!c", name = "Yc", descriptor = "I")
    public static int field2026;

    @OriginalMember(owner = "client!c", name = "Zc", descriptor = "I")
    public static int field2027;

    @OriginalMember(owner = "client!c", name = "ad", descriptor = "I")
    public static int field2028;

    @OriginalMember(owner = "client!c", name = "ed", descriptor = "I")
    private int field2032;

    @OriginalMember(owner = "client!c", name = "fd", descriptor = "I")
    public static int field2033;

    @OriginalMember(owner = "client!c", name = "hd", descriptor = "I")
    public static int field2035;

    @OriginalMember(owner = "client!c", name = "jd", descriptor = "I")
    public static int field2037;

    @OriginalMember(owner = "client!c", name = "kd", descriptor = "I")
    public static int field2038;

    @OriginalMember(owner = "client!c", name = "ld", descriptor = "I")
    public static int field2039;

    @OriginalMember(owner = "client!c", name = "md", descriptor = "I")
    public static int field2040;

    @OriginalMember(owner = "client!c", name = "od", descriptor = "I")
    public static int field2042;

    @OriginalMember(owner = "client!c", name = "qd", descriptor = "I")
    public static int field2044;

    @OriginalMember(owner = "client!c", name = "rd", descriptor = "I")
    public static int field2045;

    @OriginalMember(owner = "client!c", name = "ud", descriptor = "I")
    public static int field2048;

    @OriginalMember(owner = "client!c", name = "vd", descriptor = "I")
    public static int field2049;

    @OriginalMember(owner = "client!c", name = "Pc", descriptor = "Lol;")
    public class335 field2017;

    @OriginalMember(owner = "client!c", name = "gd", descriptor = "Ljava/lang/String;")
    public String field2034;

    @OriginalMember(owner = "client!c", name = "pd", descriptor = "Ljava/lang/String;")
    public String field2043;

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(BII)I")
    public static final int method849(byte arg0, int arg1, int arg2) {
        ++field2048;
        if (arg0 != 4) {
            return 29;
        } else {
            return arg1 != 1 && arg1 != 3 ? class419.field6032[arg2 & 3] : class360.field5102[3 & arg2];
        }
    }

    @OriginalMember(owner = "client!c", name = "k", descriptor = "(I)Z")
    public final boolean method850(int arg0) {
        ++field2021;
        if (arg0 != -1) {
            return false;
        } else {
            return this.field2017 != null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvm;I)V")
    public final void method352(class322 arg0, int arg1) {
        if (arg1 == 0) {
            ++field2028;
            if (this.field2017 != null) {
                if (super.field6117 || this.method856(arg0, 0, arg1 + 93)) {
                    this.method2608(super.field6117, (byte) 121, arg0, super.field6120);
                }
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method851(boolean arg0, int arg1) {
        ++field2038;
        String var3 = "";
        if (class172.field2161 != null) {
            var3 = var3 + class172.field2161[this.field2046];
        }
        if (class200.field2688 != null && ~class200.field2688[this.field2046] != 0) {
            class341 var4 = class155.method830(class200.field2688[this.field2046], (byte) -98);
            if (~var4.field4558 == -116) {
                var3 = var3 + var4.method1988(127, this.field2029 & 255);
            } else {
                class254.method1439(22292, new Throwable(), "gdn1");
                class200.field2688[this.field2046] = -1;
            }
        }
        if (arg1 != -116) {
            this.field2031 = 102;
        }
        String var5;
        if (!arg0) {
            var5 = var3 + this.field2034;
        } else {
            var5 = var3 + this.field2043;
        }
        if (class267.field3628 != null) {
            var5 = var5 + class267.field3628[this.field2046];
        }
        return var5;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZIIILai;ILvm;)V")
    public final void method353(boolean arg0, int arg1, int arg2, int arg3, class128 arg4, int arg5, class322 arg6) {
        if (arg1 < 36) {
            this.method344(-101, 74, 27, (class322) null);
        }
        ++field2039;
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ILtq;)V")
    public final void method852(int arg0, class250 arg1) {
        arg1.field3389 = arg0;
        ++field2013;
        int var3 = arg1.method1350(31351);
        int var4 = var3 & 1;
        boolean var5 = (var3 & 2) != 0;
        boolean var6 = ~(4 & var3) != -1;
        int var7 = super.method857((byte) -106);
        this.method2610((byte) 86, (var3 >> 3 & 7) + 1);
        this.field2046 = (byte) (var3 >> 6 & 3);
        super.field152 += 64 * (this.method857((byte) -106) - var7);
        super.field154 += 64 * (-var7 + this.method857((byte) -106));
        this.field2029 = arg1.method1363((byte) 123);
        this.field2008 = arg1.method1363((byte) 9);
        this.field2030 = arg1.method1363((byte) 122);
        int var8 = -1;
        this.field2010 = 0;
        int[] var9 = new int[12];
        for (int var10 = 0; ~var10 > -13; ++var10) {
            int var11 = arg1.method1350(31351);
            if (var11 == 0) {
                var9[var10] = 0;
            } else {
                int var12 = arg1.method1350(arg0 ^ 31351);
                int var13 = (var11 << 8) + var12;
                if (~var10 == -1 && ~var13 == -65536) {
                    var8 = arg1.method1374(-2);
                    this.field2010 = arg1.method1350(31351);
                    break;
                }
                if (~var13 <= -32769) {
                    int var27 = class72.field801[var13 + -32768];
                    var9[var10] = class392.method2441(1073741824, var27);
                    int var28 = class65.method368(var27, -112).field1582;
                    if (~var28 != -1) {
                        this.field2010 = var28;
                    }
                } else {
                    var9[var10] = class392.method2441(Integer.MIN_VALUE, var13 + -256);
                }
            }
        }
        int[] var14 = new int[5];
        for (int var15 = 0; ~var15 > -6; ++var15) {
            int var26 = arg1.method1350(31351);
            if (var26 < 0 || var26 >= class309.field4178[var15].length) {
                var26 = 0;
            }
            var14[var15] = var26;
        }
        this.field2032 = arg1.method1374(-2);
        this.field2043 = arg1.method1349(-1754884856);
        if (var5) {
            this.field2034 = arg1.method1349(-1754884856);
        } else {
            this.field2034 = this.field2043;
        }
        this.field2022 = arg1.method1350(31351);
        if (!var6) {
            this.field2009 = 0;
            this.field2019 = arg1.method1350(31351);
            this.field2018 = arg1.method1350(31351);
            if (~this.field2018 == -256) {
                this.field2018 = -1;
            }
        } else {
            this.field2009 = arg1.method1374(-2);
            this.field2018 = -1;
            this.field2019 = this.field2022;
        }
        int var16 = this.field2025;
        this.field2025 = arg1.method1350(arg0 ^ 31351);
        if (~this.field2025 != -1) {
            int var17 = this.field2031;
            int var18 = this.field2016;
            int var19 = this.field2036;
            int var20 = this.field2041;
            int var21 = this.field2020;
            this.field2031 = arg1.method1374(-2);
            this.field2016 = arg1.method1374(-2);
            this.field2036 = arg1.method1374(-2);
            this.field2041 = arg1.method1374(-2);
            this.field2020 = arg1.method1350(arg0 + 31351);
            if (~this.field2025 != ~var16 || ~this.field2031 != ~var17 || this.field2016 != var18 || ~this.field2036 != ~var19 || this.field2041 != var20 || this.field2020 != var21) {
                class289.method1714((byte) -17, this);
            }
        } else {
            class298.method1748(this, arg0 + 120);
        }
        if (this.field2017 == null) {
            this.field2017 = new class335();
        }
        int var22 = this.field2017.field4454;
        int[] var23 = this.field2017.field4450;
        this.field2017.method1917(var14, var9, var4 == 1, (byte) -114, var8, this.method495((byte) 75));
        if (var8 != var22) {
            super.field152 = super.field6119[0] * 128 - -(64 * this.method857((byte) -106));
            super.field154 = super.field6109[0] * 128 - -(this.method857((byte) -106) * 64);
        }
        if (~super.field6095 == -2048 && var23 != null) {
            for (int var24 = 0; ~var24 > ~var14.length; ++var24) {
                if (var14[var24] != var23[var24]) {
                    class397.method2485(false);
                    break;
                }
            }
        }
        if (super.field6115 != null) {
            super.field6115.method912();
        }
        if (super.field6100 != -1 && super.field6056) {
            class70 var25 = this.method2606(0);
            if (!var25.method404(super.field6100, (byte) 60)) {
                super.field6100 = -1;
                super.field6056 = false;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(B)I")
    public final int method495(byte arg0) {
        ++field2023;
        if (arg0 <= 32) {
            this.method856((class322) null, 9, 80);
        }
        return this.field2032;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IBIZI)V")
    public final void method853(int arg0, byte arg1, int arg2, boolean arg3, int arg4) {
        super.method2601(arg4, arg0, 0, arg3, this.method857((byte) -106), arg2);
        if (arg1 > 40) {
            ++field2037;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IILjn;IILvm;Lib;I)V")
    private final void method854(int arg0, int arg1, class396 arg2, int arg3, int arg4, class322 arg5, class247 arg6, int arg7) {
        ++field2044;
        int var9 = arg1 * arg1 + arg3 * arg3;
        if (~var9 <= -17 && arg4 >= var9) {
            int var10 = 16383 & (int) (Math.atan2((double) arg3, (double) arg1) * 2607.5945876176133D);
            class396 var11 = class412.method2566(super.field6065, false, super.field154, super.field152, arg5, super.field6041, super.field150, super.field6053, arg7, arg2, var10);
            if (var11 != null) {
                arg5.method1571(false);
                var11.method2284(arg6, (class447) null, 0);
                arg5.method1571(true);
            }
            if (arg0 != -2048) {
                this.field2032 = 12;
            }
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(ZZ)Ljava/lang/String;")
    public final String method855(boolean arg0, boolean arg1) {
        if (arg1) {
            this.method346(118);
        }
        ++field2026;
        return !arg0 ? this.field2034 : this.field2043;
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvm;II)Z")
    private final boolean method856(class322 arg0, int arg1, int arg2) {
        ++field2049;
        int var4 = -8 % ((-14 - arg2) / 48);
        int var5 = arg1;
        class70 var6 = this.method2606(0);
        class208 var7 = super.field6073 != -1 && super.field6036 == 0 ? class193.method1037(51, super.field6073) : null;
        class208 var8 = ~super.field6100 == 0 || this.field2011 || super.field6056 && var7 != null ? null : class193.method1037(39, super.field6100);
        int var9 = var6.field773;
        int var10 = var6.field771;
        if (var9 != 0 || ~var10 != -1 || var6.field737 != 0 || ~var6.field752 != -1) {
            arg1 |= 7;
        }
        super.field6120[0] = this.field2017.method1912(super.field6033, true, var7, super.field6074, super.field6030, super.field6094, arg0, var8, super.field6051, super.field6058, super.field6040, 0, arg1);
        int var11 = class84.method459(27582);
        if (class436.field6389 < 96 && ~var11 < -51) {
            class108.method570(-22106);
        }
        if (~class14.field131 != -1 && ~var11 > -51) {
            int var12 = -var11 + 50;
            while (~class359.field5079 > ~var12) {
                class441.field6442[class359.field5079] = new byte[102400];
                ++class359.field5079;
            }
            while (~class359.field5079 < ~var12) {
                --class359.field5079;
                class441.field6442[class359.field5079] = null;
            }
        } else if (~class14.field131 != -1) {
            class441.field6442 = new byte[50][];
            class359.field5079 = 0;
        }
        if (super.field6120[0] == null) {
            return false;
        } else {
            super.field6079 = super.field6120[0].method2299();
            this.method2602((byte) -26, super.field6120[0]);
            int var13 = super.field6075.method2690(-17869);
            super.field6041 = 0;
            super.field6053 = 0;
            super.field6065 = 0;
            if (~var9 == -1 && var10 == 0) {
                this.method2609((byte) -110, this.method857((byte) -106) << 7, var13, this.method857((byte) -106) << 7);
            } else {
                this.method2609((byte) -110, var9, var13, var10);
                if (super.field6041 != 0) {
                    super.field6120[0].method2317(super.field6041);
                }
                if (super.field6053 != 0) {
                    super.field6120[0].method2266(super.field6053);
                }
                if (super.field6065 != 0) {
                    super.field6120[0].method2286(0, super.field6065, 0);
                }
            }
            super.field6120[1] = null;
            if (!this.field2011 && ~super.field6027 != 0 && super.field6039 != -1) {
                class393 var14 = class220.method1186((byte) -110, super.field6027);
                class396 var15 = var14.method2446(super.field6083, super.field6039, arg0, (byte) 2, super.field6068, (var14.field5651 ? 7 : 2) | var5);
                if (var15 != null) {
                    var15.method2286(0, -super.field6091, 0);
                    if (var14.field5651 && (~var9 != -1 || ~var10 != -1)) {
                        if (~super.field6041 != -1) {
                            var15.method2317(super.field6041);
                        }
                        if (super.field6053 != 0) {
                            var15.method2266(super.field6053);
                        }
                        if (super.field6065 != 0) {
                            var15.method2286(0, super.field6065, 0);
                        }
                    }
                    super.field6120[1] = var15;
                }
            }
            super.field6120[2] = null;
            if (!this.field2011 && super.field6114 != null) {
                if (class234.field3224 >= super.field6124) {
                    super.field6114 = null;
                }
                if (super.field6110 <= class234.field3224 && ~super.field6124 < ~class234.field3224) {
                    class396 var16 = super.field6114.method349(arg0, -24206, var5 | 7);
                    if (var16 != null) {
                        var16.method2286(-super.field152 + super.field6113, -super.field150 + super.field6107, super.field6125 - super.field154);
                        if (var13 != 0) {
                            var16.method2269(-var13 & 16383);
                        }
                        super.field6120[2] = var16;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "c", descriptor = "(I)V")
    public final void method346(int arg0) {
        ++field2014;
        if (arg0 < -13) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(Lvm;Z)Ldn;")
    public final class321 method355(class322 arg0, boolean arg1) {
        ++field2012;
        if (this.field2017 != null && this.method856(arg0, 1024, 66)) {
            class247 var3 = arg0.method1650();
            int var4 = super.field6075.method2690(-17869);
            var3.method751(var4);
            var3.method742(super.field152, super.field150, super.field154);
            float var5 = arg0.method1564();
            float var6 = arg0.method1641();
            if (class405.field5900) {
                class70 var7 = this.method2606(0);
                if (var7.field765 && (~this.field2017.field4454 == 0 || class6.method30((byte) -102, this.field2017.field4454).field4649)) {
                    class208 var8 = ~super.field6073 != 0 && super.field6036 == 0 ? class193.method1037(30, super.field6073) : null;
                    class208 var9 = ~super.field6100 == 0 || this.field2011 || super.field6056 && var8 != null ? null : class193.method1037(109, super.field6100);
                    class396 var10 = class421.method2622(var9 != null ? var9 : var8, 240, 0, var9 == null ? super.field6033 : super.field6030, super.field6065, super.field6053, 160, 0, arg0, 1, var4, super.field6120[0], super.field6041, 13079, super.field6049);
                    if (var10 != null) {
                        arg0.method1583(var5, var6 + -128.0F);
                        arg0.method1571(false);
                        var10.method2284(var3, (class447) null, 0);
                        arg0.method1571(true);
                    }
                }
            }
            if (class427.field6264 == this) {
                arg0.method1583(var5, var6 + -144.0F);
                var3.method747(super.field152, super.field150, super.field154);
                for (int var11 = class416.field5982.length + -1; ~var11 <= -1; --var11) {
                    class41 var12 = class416.field5982[var11];
                    if (var12 != null && var12.field425 != -1) {
                        if (var12.field427 == 1 && var12.field429 >= 0 && ~class38.field397.length < ~var12.field429) {
                            class91 var13 = class38.field397[var12.field429];
                            if (var13 != null) {
                                int var14 = var13.field152 / 32 + -(class427.field6264.field152 / 32);
                                int var15 = var13.field154 / 32 + -(class427.field6264.field154 / 32);
                                this.method854(-2048, var15, super.field6120[0], var14, 360000, arg0, var3, var12.field425);
                            }
                        }
                        if (~var12.field427 == -3) {
                            int var16 = (var12.field424 - class70.field767) * 4 + 2 + -(class427.field6264.field152 / 32);
                            int var17 = (-class291.field3961 + var12.field428) * 4 + 2 - class427.field6264.field154 / 32;
                            int var18 = var12.field422 * 4;
                            int var19 = var18 * var18;
                            this.method854(-2048, var17, super.field6120[0], var16, var19, arg0, var3, var12.field425);
                        }
                        if (~var12.field427 == -11 && var12.field429 >= 0 && ~var12.field429 > ~class85.field957.length) {
                            class158 var20 = class85.field957[var12.field429];
                            if (var20 != null) {
                                int var21 = var20.field152 / 32 + -(class427.field6264.field152 / 32);
                                int var22 = var20.field154 / 32 + -(class427.field6264.field154 / 32);
                                this.method854(-2048, var22, super.field6120[0], var21, 360000, arg0, var3, var12.field425);
                            }
                        }
                    }
                }
                var3.method751(var4);
                var3.method742(super.field152, super.field150, super.field154);
            }
            arg0.method1583(var5, var6);
            class321 var23 = class204.method1110(258, super.field6120.length);
            if (super.field6115 == null) {
                arg0.method1581(super.field6120, var3, var23.field4293, class427.field6264 != this ? 0 : 1);
            } else {
                class366 var24 = super.field6115.method917();
                arg0.method1559(super.field6120, var24, var3, var23.field4293, class427.field6264 != this ? 0 : 1);
            }
            this.method2608(arg1, (byte) 114, arg0, super.field6120);
            if (super.field6120[2] != null) {
                if (~var4 != -1) {
                    super.field6120[2].method2269(var4);
                }
                super.field6120[2].method2286(-super.field6113 + super.field152, super.field150 - super.field6107, super.field154 - super.field6125);
            }
            return var23;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(B)I")
    public final int method857(byte arg0) {
        ++field2024;
        if (this.field2017 != null && this.field2017.field4454 != -1) {
            return class6.method30((byte) -120, this.field2017.field4454).field4624;
        } else {
            if (arg0 != -106) {
                this.method852(99, (class250) null);
            }
            return super.method857((byte) -106);
        }
    }

    @OriginalMember(owner = "client!c", name = "a", descriptor = "(IIILvm;)Z")
    public final boolean method344(int arg0, int arg1, int arg2, class322 arg3) {
        ++field2040;
        if (this.field2017 != null && this.method856(arg3, 65536, -76)) {
            class247 var5 = arg3.method1650();
            int var6 = super.field6075.method2690(-17869);
            var5.method751(var6);
            var5.method747(super.field152, super.field150, super.field154);
            for (int var7 = 0; var7 < super.field6120.length; ++var7) {
                if (super.field6120[var7] != null) {
                    return super.field6120[var7].method2300(arg1, arg2, var5, true);
                }
            }
            if (arg0 != -23563) {
                this.method355((class322) null, true);
            }
            return false;
        } else {
            return true;
        }
    }

    @OriginalMember(owner = "client!c", name = "d", descriptor = "(B)Z")
    public final boolean method345(byte arg0) {
        if (arg0 != -72) {
            this.method495((byte) 119);
        }
        ++field2042;
        return false;
    }

    @OriginalMember(owner = "client!c", name = "f", descriptor = "(B)I")
    public final int method500(byte arg0) {
        if (arg0 != -83) {
            this.field2011 = false;
        }
        ++field2045;
        return -1;
    }

    @OriginalMember(owner = "client!c", name = "l", descriptor = "(I)V")
    public static final void method858(int arg0) {
        ++field2033;
        for (int var1 = 0; class444.field6494 > var1; ++var1) {
            class151 var2 = class44.method209(var1, -123);
            if (var2 != null && var2.field1908 == 0) {
                class73.field814[var1] = 0;
                class254.field3495[var1] = 0;
            }
        }
        if (arg0 == 255) {
            class126.field1618 = new class58(16);
        }
    }

    @OriginalMember(owner = "client!c", name = "g", descriptor = "(B)V")
    public static void method859(byte arg0) {
        field2047 = null;
        if (arg0 < 72) {
            method859((byte) -27);
        }
    }

    @OriginalMember(owner = "client!c", name = "e", descriptor = "(I)I")
    public final int method76(int arg0) {
        if (arg0 != 20765) {
            return 34;
        } else {
            ++field2015;
            return super.field6079;
        }
    }

    @OriginalMember(owner = "client!c", name = "h", descriptor = "(B)V")
    public static final void method860(byte arg0) {
        ++field2035;
        class114 var1 = class130.field1669;
        synchronized (class130.field1669) {
            if (arg0 != 107) {
                method858(17);
            }
            class130.field1669.method606((byte) 88);
        }
    }
}
