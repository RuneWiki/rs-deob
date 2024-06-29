import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kh")
public class class13 extends class22 {

    @OriginalMember(owner = "client!kh", name = "ad", descriptor = "I")
    public int field232 = -1;

    @OriginalMember(owner = "client!kh", name = "Xc", descriptor = "I")
    public int field229 = -1;

    @OriginalMember(owner = "client!kh", name = "Pc", descriptor = "Ltn;")
    public static class58 field221 = null;

    @OriginalMember(owner = "client!kh", name = "Oc", descriptor = "Lgf;")
    public static class180 field220 = new class180("M", "M", "M", "M");

    @OriginalMember(owner = "client!kh", name = "Fc", descriptor = "I")
    public static int field211;

    @OriginalMember(owner = "client!kh", name = "Gc", descriptor = "I")
    public static int field212;

    @OriginalMember(owner = "client!kh", name = "Hc", descriptor = "I")
    public static int field213;

    @OriginalMember(owner = "client!kh", name = "Ic", descriptor = "I")
    public static int field214;

    @OriginalMember(owner = "client!kh", name = "Jc", descriptor = "I")
    public static int field215;

    @OriginalMember(owner = "client!kh", name = "Kc", descriptor = "I")
    public static int field216;

    @OriginalMember(owner = "client!kh", name = "Lc", descriptor = "I")
    public static int field217;

    @OriginalMember(owner = "client!kh", name = "Mc", descriptor = "I")
    public static int field218;

    @OriginalMember(owner = "client!kh", name = "Nc", descriptor = "I")
    public static int field219;

    @OriginalMember(owner = "client!kh", name = "Qc", descriptor = "I")
    public static int field222;

    @OriginalMember(owner = "client!kh", name = "Rc", descriptor = "I")
    public static int field223;

    @OriginalMember(owner = "client!kh", name = "Sc", descriptor = "I")
    public static int field224;

    @OriginalMember(owner = "client!kh", name = "Tc", descriptor = "I")
    public static int field225;

    @OriginalMember(owner = "client!kh", name = "Uc", descriptor = "I")
    public static int field226;

    @OriginalMember(owner = "client!kh", name = "Vc", descriptor = "I")
    public static int field227;

    @OriginalMember(owner = "client!kh", name = "Wc", descriptor = "I")
    public static int field228;

    @OriginalMember(owner = "client!kh", name = "Yc", descriptor = "I")
    public static int field230;

    @OriginalMember(owner = "client!kh", name = "Zc", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client!kh", name = "bd", descriptor = "I")
    public static int field233;

    @OriginalMember(owner = "client!kh", name = "cd", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client!kh", name = "Ec", descriptor = "Lqb;")
    public class148 field210;

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(Z)I")
    public final int method107(boolean arg0) {
        if (arg0) {
            return 99;
        } else {
            ++field234;
            return super.field329;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILqa;I)Z")
    private final boolean method108(int arg0, class162 arg1, int arg2) {
        ++field214;
        int var4 = arg2;
        class441 var5 = this.method192(true);
        class357 var6 = super.field320 != arg0 && ~super.field345 == -1 ? class311.field4455.method1233(true, super.field320) : null;
        class357 var7 = super.field373 == -1 || super.field393 && var6 != null ? null : class311.field4455.method1233(true, super.field373);
        int var8 = var5.field6450;
        int var9 = var5.field6462;
        if (var8 != 0 || ~var9 != -1 || ~var5.field6467 != -1 || ~var5.field6478 != -1) {
            arg2 |= 7;
        }
        boolean var10 = ~super.field397 != -1 && class180.field2734 >= super.field309 && super.field364 > class180.field2734;
        if (var10) {
            arg2 |= 524288;
        }
        class121 var11 = super.field406[0] = this.field210.method1054(65535, super.field389, super.field371, super.field348, arg1, super.field367, class311.field4455, class4.field64, super.field322, var7, super.field383, arg2, super.field318, class526.field7733, var6);
        if (var11 == null) {
            return false;
        } else {
            super.field329 = var11.method918();
            this.method179(var11, (byte) 121);
            int var12 = super.field338.method2890((byte) -9);
            if (var8 == 0 && var9 == 0) {
                this.method194(this.method184(1) << 7, 0, (byte) 126, this.method184(arg0 ^ -2) << 7, var12, 0);
            } else {
                this.method194(var8, var5.field6437, (byte) 123, var9, var12, var5.field6458);
                if (~super.field361 != -1) {
                    super.field406[0].method886(super.field361);
                }
                if (~super.field392 != -1) {
                    super.field406[0].method895(super.field392);
                }
                if (super.field335 != 0) {
                    super.field406[0].method884(0, super.field335, 0);
                }
            }
            if (var10) {
                var11.method904(super.field356, super.field315, super.field368, super.field397 & 255);
            }
            if (~super.field359 != 0 && ~super.field360 != 0) {
                class246 var13 = class450.field6582.method1475(super.field359, true);
                boolean var14 = var13.field3558 == 3 && (var8 != 0 || var9 != 0);
                int var15 = var4;
                if (!var14) {
                    if (super.field381 != 0) {
                        var15 = var4 | 5;
                    }
                    if (~super.field346 != -1) {
                        var15 |= 2;
                    }
                } else {
                    var15 = var4 | 7;
                }
                class121 var16 = super.field406[1] = var13.method1577(class311.field4455, arg1, super.field351, super.field316, super.field360, var15, 63);
                if (var16 != null) {
                    if (~super.field346 != -1) {
                        var16.method884(0, -super.field346 << 0, 0);
                    }
                    if (~super.field381 != -1) {
                        var16.method897(super.field381 * 2048);
                    }
                    if (var14) {
                        if (super.field361 != 0) {
                            var16.method886(super.field361);
                        }
                        if (super.field392 != 0) {
                            var16.method895(super.field392);
                        }
                        if (~super.field335 != -1) {
                            var16.method884(0, super.field335, 0);
                        }
                    }
                }
            } else {
                super.field406[1] = null;
            }
            if (~super.field372 != 0 && ~super.field380 != 0) {
                class246 var17 = class450.field6582.method1475(super.field372, true);
                boolean var18 = ~var17.field3558 == -4 && (var8 != 0 || var9 != 0);
                int var19 = var4;
                if (!var18) {
                    if (~super.field391 != -1) {
                        var19 = var4 | 5;
                    }
                    if (~super.field324 != -1) {
                        var19 |= 2;
                    }
                } else {
                    var19 = var4 | 7;
                }
                class121 var20 = super.field406[3] = var17.method1574(arg1, class311.field4455, var19, super.field327, false, super.field380, super.field321);
                if (var20 != null) {
                    if (~super.field324 != -1) {
                        var20.method884(0, -super.field324 << 0, 0);
                    }
                    if (~super.field391 != -1) {
                        var20.method897(super.field391 * 2048);
                    }
                    if (var18) {
                        if (~super.field361 != -1) {
                            var20.method886(super.field361);
                        }
                        if (super.field392 != 0) {
                            var20.method895(super.field392);
                        }
                        if (~super.field335 != -1) {
                            var20.method884(0, super.field335, 0);
                        }
                    }
                }
            } else {
                super.field406[3] = null;
            }
            super.field406[2] = null;
            if (super.field415 != null) {
                if (~class180.field2734 <= ~super.field415.field3189) {
                    super.field415 = null;
                } else if (~class180.field2734 <= ~super.field415.field3196) {
                    class121 var21 = super.field415.method1462(arg1, 122, var4 | 7);
                    if (var21 != null) {
                        var21.method884(-super.field5529 + super.field415.field3205, -super.field5534 + super.field415.field3187, super.field415.field3194 - super.field5539);
                        if (~var12 != -1) {
                            var21.method897(var12);
                        }
                        super.field406[2] = var21;
                    }
                }
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ZLjava/lang/String;)Z")
    public static final boolean method109(boolean arg0, String arg1) {
        ++field228;
        if (arg1 == null) {
            return false;
        } else if (!arg0) {
            return false;
        } else {
            for (int var2 = 0; var2 < class520.field7636; ++var2) {
                if (arg1.equalsIgnoreCase(class173.field2656[var2])) {
                    return true;
                }
                if (arg1.equalsIgnoreCase(class408.field6017[var2])) {
                    return true;
                }
            }
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "b", descriptor = "(IIII)I")
    public static final int method110(int arg0, int arg1, int arg2, int arg3) {
        if (arg1 <= 106) {
            field220 = null;
        }
        ++field225;
        int var4 = (-16711936 & (16711935 & arg2) * arg0 | 16711680 & (arg2 & 65280) * arg0) >>> 8;
        int var5 = -arg0 + 255;
        return (((arg3 & 16711935) * var5 & -16711936 | 16711680 & (65280 & arg3) * var5) >>> 8) + var4;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IILqa;IZLha;I)V")
    public final void method111(int arg0, int arg1, class162 arg2, int arg3, boolean arg4, class41 arg5, int arg6) {
        ++field212;
        if (arg3 > 5) {
            throw new IllegalStateException();
        }
    }

    @OriginalMember(owner = "client!kh", name = "k", descriptor = "(I)Z")
    private final boolean method112(int arg0) {
        if (arg0 < 70) {
            method110(82, 77, 100, 109);
        }
        ++field230;
        return this.field210.field2170;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(B)I")
    public final int method113(byte arg0) {
        ++field224;
        if (this.field210.field2193 != null) {
            class148 var2 = this.field210.method1059((byte) -51, class526.field7733);
            if (var2 != null && ~var2.field2211 != 0) {
                return var2.field2211;
            }
        }
        if (arg0 <= 80) {
            return 103;
        } else {
            return ~this.field210.field2211 != 0 ? this.field210.field2211 : super.method113((byte) 120);
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(ILqa;)Lbw;")
    public final class482 method114(int arg0, class162 arg1) {
        ++field215;
        if (this.field210 != null && this.method108(arg0 ^ 6795, arg1, 2048)) {
            if (arg0 != -6796) {
                field221 = null;
            }
            class413 var3 = arg1.method439();
            int var4 = super.field338.method2890((byte) -9);
            var3.method1007(var4);
            var3.method1004(super.field5529, super.field5534, super.field5539);
            class441 var5 = this.method192(true);
            class148 var6 = this.field210.field2193 == null ? this.field210 : this.field210.method1059((byte) -51, class526.field7733);
            if (class397.field5830.field131 && var6.field2229 && var5.field6457) {
                class357 var7 = ~super.field320 != 0 && super.field345 == 0 ? class311.field4455.method1233(true, super.field320) : null;
                class357 var8 = super.field373 == -1 || super.field393 && var7 != null ? null : class311.field4455.method1233(true, super.field373);
                class121 var9 = class473.method2836(super.field392, arg1, arg0 + 7564, super.field398, super.field335, var4, 255 & this.field210.field2180, 65535 & this.field210.field2199, this.field210.field2214, var8 == null ? var7 : var8, super.field361, var8 == null ? super.field322 : super.field389, 255 & this.field210.field2217, this.field210.field2207 & 65535, super.field406[0]);
                if (var9 != null) {
                    float var10 = arg1.method487();
                    float var11 = arg1.method477();
                    arg1.method494(false);
                    arg1.method514(var10, var11 - 150.0F);
                    var9.method910(var3, (class361) null, 0);
                    arg1.method514(var10, var11);
                    arg1.method494(true);
                }
            }
            class482 var12 = null;
            if (this.method112(arg0 ^ -6851)) {
                var12 = class410.method2537((byte) -54, super.field406.length);
            }
            if (super.field414 != null) {
                class492 var13 = super.field414.method1519();
                arg1.method495(super.field406, var13, var3, var12 == null ? null : var12.field7079, 0);
            } else {
                arg1.method438(super.field406, var3, var12 == null ? null : var12.field7079, 0);
            }
            this.method189(super.field406, arg1, false, (byte) 106);
            if (super.field406[2] != null) {
                if (var4 != 0) {
                    super.field406[2].method897(var4);
                }
                super.field406[2].method884(-super.field415.field3205 + super.field5529, -super.field415.field3187 + super.field5534, -super.field415.field3194 + super.field5539);
            }
            super.field353 = class454.field6731;
            super.field406[0] = super.field406[1] = super.field406[2] = super.field406[3] = null;
            return var12;
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(Z)V")
    public static void method115(boolean arg0) {
        field220 = null;
        if (!arg0) {
            field221 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(I)I")
    public final int method116(int arg0) {
        ++field227;
        if (arg0 != 0) {
            this.field232 = -71;
        }
        if (this.field210.field2193 != null) {
            class148 var2 = this.field210.method1059((byte) -51, class526.field7733);
            if (var2 != null && ~var2.field2219 != 0) {
                return var2.field2219;
            }
        }
        return this.field210.field2219;
    }

    @OriginalMember(owner = "client!kh", name = "d", descriptor = "(I)V")
    public final void method117(int arg0) {
        ++field216;
        if (arg0 > -127) {
            this.field232 = 15;
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!kh", name = "l", descriptor = "(I)Z")
    public final boolean method118(int arg0) {
        if (arg0 != 3) {
            return true;
        } else {
            ++field233;
            return this.field210 != null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Lqb;I)V")
    public final void method119(class148 arg0, int arg1) {
        ++field222;
        this.field210 = arg0;
        if (super.field414 != null) {
            super.field414.method1522();
        }
        if (arg1 != 0) {
            this.field210 = null;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(BZIIII)V")
    public final void method120(byte arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
        ++field211;
        super.field5538 = (byte) arg5;
        if (super.field320 != -1 && ~class311.field4455.method1233(true, super.field320).field5396 == -2) {
            super.field320 = -1;
        }
        if (~super.field359 != 0) {
            class246 var7 = class450.field6582.method1475(super.field359, true);
            if (var7.field3543 && ~var7.field3547 != 0 && class311.field4455.method1233(true, var7.field3547).field5396 == 1) {
                super.field359 = -1;
            }
        }
        if (~super.field372 != 0) {
            class246 var8 = class450.field6582.method1475(super.field372, true);
            if (var8.field3543 && ~var8.field3547 != 0 && ~class311.field4455.method1233(true, var8.field3547).field5396 == -2) {
                super.field372 = -1;
            }
        }
        if (!arg1) {
            int var9 = arg4 - super.field409[0];
            int var10 = -super.field416[0] + arg3;
            if (var9 >= -8 && var9 <= 8 && var10 >= -8 && var10 <= 8) {
                if (super.field412 < 9) {
                    ++super.field412;
                }
                for (int var11 = super.field412; var11 > 0; --var11) {
                    super.field409[var11] = super.field409[var11 + -1];
                    super.field416[var11] = super.field416[var11 + -1];
                    super.field413[var11] = super.field413[var11 + -1];
                }
                super.field409[0] = arg4;
                super.field413[0] = 1;
                super.field416[0] = arg3;
                return;
            }
        }
        super.field412 = 0;
        super.field408 = 0;
        super.field411 = 0;
        super.field409[0] = arg4;
        super.field416[0] = arg3;
        int var12 = -45 % ((-69 - arg0) / 35);
        super.field5529 = (super.field409[0] << 7) + (arg2 << 6);
        super.field5539 = (super.field416[0] << 7) + (arg2 << 6);
        if (super.field414 != null) {
            super.field414.method1522();
        }
    }

    @OriginalMember(owner = "client!kh", name = "e", descriptor = "(I)Z")
    public final boolean method121(int arg0) {
        ++field219;
        if (arg0 != 26923) {
            method109(true, (String) null);
        }
        return false;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(IIILqa;)Z")
    public final boolean method122(int arg0, int arg1, int arg2, class162 arg3) {
        ++field226;
        if (this.field210 != null && this.method108(-1, arg3, 131072)) {
            class413 var5 = arg3.method439();
            if (arg1 != -1) {
                return false;
            } else {
                int var6 = super.field338.method2890((byte) -9);
                var5.method1007(var6);
                var5.method1004(super.field5529, super.field5534, super.field5539);
                boolean var7 = false;
                for (int var8 = 0; ~var8 > ~super.field406.length; ++var8) {
                    if (super.field406[var8] != null && super.field406[var8].method909(arg2, arg0, var5, this.field210.field2214 == 1)) {
                        var7 = true;
                        break;
                    }
                }
                super.field406[0] = super.field406[1] = super.field406[2] = super.field406[3] = null;
                return var7;
            }
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(III)V")
    public final void method123(int arg0, int arg1, int arg2) {
        ++field231;
        int var4 = super.field409[0];
        int var5 = super.field416[0];
        if (~arg2 == -1) {
            ++var5;
        }
        if (~arg2 == -2) {
            ++var4;
            ++var5;
        }
        if (arg2 == 2) {
            ++var4;
        }
        if (~arg2 == -4) {
            --var5;
            ++var4;
        }
        if (~arg2 == -5) {
            --var5;
        }
        if (arg2 == 5) {
            --var4;
            --var5;
        }
        if (arg2 == 6) {
            --var4;
        }
        if (~super.field320 != 0 && ~class311.field4455.method1233(true, super.field320).field5396 == -2) {
            super.field320 = -1;
        }
        if (~arg2 == -8) {
            --var4;
            ++var5;
        }
        if (~super.field359 != arg1) {
            class246 var6 = class450.field6582.method1475(super.field359, true);
            if (var6.field3543 && var6.field3547 != -1 && ~class311.field4455.method1233(true, var6.field3547).field5396 == -2) {
                super.field359 = -1;
            }
        }
        if (super.field372 != -1) {
            class246 var7 = class450.field6582.method1475(super.field372, true);
            if (var7.field3543 && var7.field3547 != -1 && class311.field4455.method1233(true, var7.field3547).field5396 == 1) {
                super.field372 = -1;
            }
        }
        if (~super.field412 > -10) {
            ++super.field412;
        }
        for (int var8 = super.field412; ~var8 < -1; --var8) {
            super.field409[var8] = super.field409[var8 + -1];
            super.field416[var8] = super.field416[var8 - 1];
            super.field413[var8] = super.field413[var8 + -1];
        }
        super.field409[0] = var4;
        super.field413[0] = (byte) arg0;
        super.field416[0] = var5;
    }

    @OriginalMember(owner = "client!kh", name = "a", descriptor = "(Z)I")
    public final int method124(boolean arg0) {
        ++field218;
        if (!arg0) {
            return -52;
        } else {
            if (this.field210.field2193 != null) {
                class148 var2 = this.field210.method1059((byte) -51, class526.field7733);
                if (var2 != null && ~var2.field2228 != 0) {
                    return var2.field2228;
                }
            }
            return this.field210.field2228;
        }
    }

    @OriginalMember(owner = "client!kh", name = "m", descriptor = "(I)V")
    public static final void method125(int arg0) {
        if (arg0 != -4) {
            field220 = null;
        }
        if (class84.field1407 != null) {
            class84.field1407.method1149(0);
        }
        ++field217;
        if (class204.field2944 != null) {
            class204.field2944.method1149(0);
        }
    }

    @OriginalMember(owner = "client!kh", name = "c", descriptor = "(Lqa;I)V")
    public final void method126(class162 arg0, int arg1) {
        ++field213;
        if (this.field210 != null) {
            if (super.field410 || this.method108(-1, arg0, 0)) {
                this.method189(super.field406, arg0, super.field410, (byte) 96);
                super.field406[0] = super.field406[1] = super.field406[2] = super.field406[3] = null;
                if (arg1 > -43) {
                    field221 = null;
                }
            }
        }
    }
}
