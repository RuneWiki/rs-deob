import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class389 extends class530 {

    @OriginalMember(owner = "client!tk", name = "m", descriptor = "[J")
    public static long[] field5424 = new long[11];

    @OriginalMember(owner = "client!tk", name = "i", descriptor = "[[J")
    public static long[][] field5420 = new long[8][256];

    @OriginalMember(owner = "client!tk", name = "g", descriptor = "I")
    public static int field5418;

    @OriginalMember(owner = "client!tk", name = "h", descriptor = "I")
    public static int field5419;

    @OriginalMember(owner = "client!tk", name = "j", descriptor = "I")
    public static int field5421;

    @OriginalMember(owner = "client!tk", name = "k", descriptor = "I")
    public static int field5422;

    @OriginalMember(owner = "client!tk", name = "l", descriptor = "I")
    public static int field5423;

    @OriginalMember(owner = "client!tk", name = "n", descriptor = "I")
    public static int field5425;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "I")
    public static int field5426;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "I")
    public static int field5427;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "I")
    public static int field5428;

    // $FF: synthetic field
    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Ljava/lang/Class;")
    public static Class field5429;

    // $FF: synthetic method
    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;)Ljava/lang/Class;", line = 1)
    public static Class method2366(String arg0) {
        try {
            return Class.forName(arg0);
        } catch (ClassNotFoundException var2) {
            throw new NoClassDefFoundError(var2.getMessage());
        }
    }

    static {
        for (int var0 = 0; ~var0 > -257; ++var0) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) (~(1 & var0) != -1 ? var3 & 255 : var3 >>> 8);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 285L;
            }
            long var8 = var6 << 1;
            if (~var8 <= -257L) {
                var8 ^= 285L;
            }
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (~var12 <= -257L) {
                var12 ^= 285L;
            }
            long var14 = var4 ^ var12;
            field5420[0][var0] = class637.method3702(var14, class637.method3702(var6 << 8, class637.method3702(var10 << 16, class637.method3702(var12 << 24, class637.method3702(class637.method3702(var8 << 40, class637.method3702(var4 << 56, var4 << 48)), var4 << 32)))));
            for (int var16 = 1; var16 < 8; ++var16) {
                field5420[var16][var0] = class637.method3702(field5420[var16 - 1][var0] >>> 8, field5420[var16 + -1][var0] << 56);
            }
        }
        field5424[0] = 0L;
        for (int var1 = 1; ~var1 >= -11; ++var1) {
            int var2 = (var1 + -1) * 8;
            field5424[var1] = class158.method993(class158.method993(class379.method2316(field5420[6][var2 + 6], 65280L), class158.method993(class379.method2316(16711680L, field5420[5][var2 + 5]), class158.method993(class158.method993(class379.method2316(field5420[3][var2 - -3], 1095216660480L), class158.method993(class158.method993(class379.method2316(field5420[1][var2 + 1], 71776119061217280L), class379.method2316(field5420[0][var2], -72057594037927936L)), class379.method2316(280375465082880L, field5420[2][var2 + 2]))), class379.method2316(field5420[4][var2 + 4], 4278190080L)))), class379.method2316(255L, field5420[7][var2 - -7]));
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(Z)Z", line = 3)
    public final boolean method2361(boolean arg0) {
        ++field5418;
        if (super.field7418.method2253(123)) {
            return false;
        } else {
            return arg0;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Z)V", line = 19)
    public final void method73(boolean arg0) {
        ++field5426;
        if (super.field7418.method2253(127)) {
            super.field7419 = 0;
        }
        if (~super.field7419 > -1 || ~super.field7419 < -3) {
            super.field7419 = this.method74(0);
        }
        if (!arg0) {
            this.method75(122, -105);
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(II)V", line = 36)
    public final void method70(int arg0, int arg1) {
        super.field7419 = arg0;
        ++field5421;
        if (arg1 > -38) {
            field5420 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "b", descriptor = "(I)V", line = 47)
    public static void method2362(int arg0) {
        field5424 = null;
        if (arg0 == -29932) {
            field5420 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(II)I", line = 61)
    public final int method75(int arg0, int arg1) {
        ++field5427;
        if (super.field7418.method2253(115)) {
            return 3;
        } else {
            int var3 = 100 / ((arg1 - 63) / 60);
            return 1;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIILhg;I)V", line = 75)
    public static final void method2363(int arg0, int arg1, int arg2, class584 arg3, int arg4) {
        ++field5425;
        class591 var5 = arg3.method3482(0);
        int var6 = -arg3.field8327.field6095 + arg3.field8376 & 16383;
        if (~arg4 == 0) {
            if (var6 == 0 && arg3.field8395 <= 25) {
                if (!arg3.field8352 || !var5.method3512(0, arg3.field8309)) {
                    arg3.field8309 = var5.method3515(-1);
                    arg3.field8352 = ~arg3.field8309 != 0;
                }
            } else {
                if (~arg0 > -1 && var5.field8494 != -1) {
                    arg3.field8352 = false;
                    arg3.field8309 = var5.field8494;
                } else if (~arg0 < -1 && var5.field8473 != -1) {
                    arg3.field8309 = var5.field8473;
                } else {
                    arg3.field8309 = var5.field8515;
                }
                arg3.field8352 = false;
            }
        } else if (arg3.field8342 != -1 && (~var6 <= -10241 || ~var6 >= -2049)) {
            int var7 = 16383 & class98.field1426[arg2] + -arg3.field8327.field6095;
            arg3.field8352 = false;
            if (arg4 == 2 && ~var5.field8489 != 0) {
                if (~var7 < -2049 && ~var7 >= -6145 && ~var5.field8518 != 0) {
                    arg3.field8309 = var5.field8518;
                } else if (~var7 <= -10241 && var7 < 14336 && var5.field8491 != -1) {
                    arg3.field8309 = var5.field8491;
                } else if (~var7 < -6145 && var7 < 10240 && var5.field8501 != -1) {
                    arg3.field8309 = var5.field8501;
                } else {
                    arg3.field8309 = var5.field8489;
                }
            } else if (arg4 == 0 && ~var5.field8516 != 0) {
                if (var7 > 2048 && ~var7 >= -6145 && var5.field8500 != -1) {
                    arg3.field8309 = var5.field8500;
                } else if (~var7 <= -10241 && var7 < 14336 && var5.field8496 != -1) {
                    arg3.field8309 = var5.field8496;
                } else if (var7 > 6144 && var7 < 10240 && ~var5.field8476 != 0) {
                    arg3.field8309 = var5.field8476;
                } else {
                    arg3.field8309 = var5.field8516;
                }
            } else if (var7 > 2048 && var7 <= 6144 && var5.field8492 != -1) {
                arg3.field8309 = var5.field8492;
            } else if (var7 >= 10240 && ~var7 > -14337 && ~var5.field8477 != 0) {
                arg3.field8309 = var5.field8477;
            } else if (~var7 < -6145 && var7 < 10240 && ~var5.field8506 != 0) {
                arg3.field8309 = var5.field8506;
            } else {
                arg3.field8309 = var5.field8515;
            }
        } else if (var6 == 0 && ~arg3.field8395 >= -26) {
            if (~arg4 == -3 && ~var5.field8489 != 0) {
                arg3.field8309 = var5.field8489;
            } else if (~arg4 == -1 && var5.field8516 != -1) {
                arg3.field8309 = var5.field8516;
            } else {
                arg3.field8309 = var5.field8515;
            }
            arg3.field8352 = false;
        } else {
            arg3.field8352 = false;
            if (~arg4 == -3 && var5.field8489 != -1) {
                if (~arg0 > -1 && var5.field8508 != -1) {
                    arg3.field8309 = var5.field8508;
                } else if (~arg0 < -1 && ~var5.field8507 != 0) {
                    arg3.field8309 = var5.field8507;
                } else {
                    arg3.field8309 = var5.field8489;
                }
            } else if (arg4 == 0 && ~var5.field8516 != 0) {
                if (~arg0 > -1 && var5.field8521 != -1) {
                    arg3.field8309 = var5.field8521;
                } else if (arg0 > 0 && var5.field8510 != -1) {
                    arg3.field8309 = var5.field8510;
                } else {
                    arg3.field8309 = var5.field8516;
                }
            } else if (arg0 < 0 && var5.field8485 != -1) {
                arg3.field8309 = var5.field8485;
            } else if (~arg0 < -1 && ~var5.field8499 != 0) {
                arg3.field8309 = var5.field8499;
            } else {
                arg3.field8309 = var5.field8515;
            }
        }
        if (arg1 > -104) {
            method2362(-51);
        }
    }

    @OriginalMember(owner = "client!tk", name = "c", descriptor = "(I)I", line = 239)
    public final int method2364(int arg0) {
        ++field5422;
        if (arg0 != 0) {
            field5424 = null;
        }
        return super.field7419;
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(Ljava/lang/String;B)Z", line = 252)
    public static final boolean method2365(String arg0, byte arg1) {
        ++field5423;
        int var2 = -96 % ((-15 - arg1) / 52);
        return class49.method333((byte) -47, arg0, field5429 != null ? field5429 : (field5429 = method2366("cn")));
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)I", line = 263)
    public final int method74(int arg0) {
        ++field5419;
        if (arg0 != 0) {
            method2363(-115, 85, -89, (class584) null, -3);
        }
        return 2;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(ILah;)V", line = 275)
    public class389(int arg0, class374 arg1) {
        super(arg0, arg1);
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lah;)V", line = 282)
    public class389(class374 arg0) {
        super(arg0);
    }
}
