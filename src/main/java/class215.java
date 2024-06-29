import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!to")
public class class215 extends class7 {

    @OriginalMember(owner = "client!to", name = "o", descriptor = "Liu;")
    public static class517 field3247 = new class517(95, 8);

    @OriginalMember(owner = "client!to", name = "z", descriptor = "[[J")
    public static long[][] field3258 = new long[8][256];

    @OriginalMember(owner = "client!to", name = "A", descriptor = "[J")
    public static long[] field3259 = new long[11];

    @OriginalMember(owner = "client!to", name = "D", descriptor = "Lpp;")
    public static class464 field3262;

    @OriginalMember(owner = "client!to", name = "C", descriptor = "F")
    public static float field3261;

    @OriginalMember(owner = "client!to", name = "n", descriptor = "I")
    public static int field3246;

    @OriginalMember(owner = "client!to", name = "p", descriptor = "I")
    public int field3248;

    @OriginalMember(owner = "client!to", name = "q", descriptor = "I")
    public static int field3249;

    @OriginalMember(owner = "client!to", name = "r", descriptor = "I")
    public static int field3250;

    @OriginalMember(owner = "client!to", name = "s", descriptor = "I")
    public int field3251;

    @OriginalMember(owner = "client!to", name = "t", descriptor = "I")
    public static int field3252;

    @OriginalMember(owner = "client!to", name = "u", descriptor = "I")
    public static int field3253;

    @OriginalMember(owner = "client!to", name = "v", descriptor = "I")
    public int field3254;

    @OriginalMember(owner = "client!to", name = "w", descriptor = "I")
    public static int field3255;

    @OriginalMember(owner = "client!to", name = "x", descriptor = "I")
    public static int field3256;

    @OriginalMember(owner = "client!to", name = "B", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!to", name = "y", descriptor = "J")
    public long field3257;

    static {
        for (int var0 = 0; var0 < 256; var0++) {
            char var3 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var0 / 2);
            long var4 = (long) ((var0 & 0x1) == 0 ? var3 >>> 8 : var3 & 0xFF);
            long var6 = var4 << 1;
            if (var6 >= 256L) {
                var6 ^= 0x11DL;
            }
            long var8 = var6 << 1;
            if (var8 >= 256L) {
                var8 ^= 0x11DL;
            }
            long var10 = var8 ^ var4;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var4 ^ var12;
            field3258[0][var0] = class362.method2185(class362.method2185(class362.method2185(class362.method2185(class362.method2185(var4 << 32, class362.method2185(var8 << 40, class362.method2185(var4 << 48, var4 << 56))), var12 << 24), var10 << 16), var6 << 8), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field3258[var16][var0] = class362.method2185(field3258[var16 - 1][var0] << 56, field3258[var16 - 1][var0] >>> 8);
            }
        }
        field3259[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field3259[var1] = class146.method1068(class104.method871(field3258[7][var2 + 7], 255L), class146.method1068(class104.method871(field3258[6][var2 + 6], 65280L), class146.method1068(class146.method1068(class146.method1068(class146.method1068(class104.method871(field3258[2][var2 + 2], 280375465082880L), class146.method1068(class104.method871(field3258[0][var2], -72057594037927936L), class104.method871(71776119061217280L, field3258[1][var2 + 1]))), class104.method871(1095216660480L, field3258[3][var2 + 3])), class104.method871(field3258[4][var2 + 4], 4278190080L)), class104.method871(16711680L, field3258[5][var2 + 5]))));
        }
        field3262 = new class464(72, 3);
    }

    @OriginalMember(owner = "client!to", name = "f", descriptor = "(I)V", line = 3)
    public static void method1456(int arg0) {
        field3262 = null;
        field3259 = null;
        field3258 = null;
        field3247 = null;
        if (arg0 != 255) {
            field3259 = null;
        }
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(Z)I", line = 16)
    public final int method26(boolean arg0) {
        field3249++;
        if (!arg0) {
            field3262 = null;
        }
        return this.field3254;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BLhn;Z)V", line = 31)
    public static final void method1457(byte arg0, class85 arg1, boolean arg2) {
        field3250++;
        class298 var3 = arg1.method772(0);
        if (arg1.field1567 == 0) {
            class580.field8260 = -1;
            arg1.field1575 = 0;
            class393.field5886 = 0;
            return;
        }
        if (arg1.field1514 != -1 && arg1.field1519 == 0) {
            class439 var4 = class49.field739.method2297((byte) 106, arg1.field1514);
            if (arg1.field1576 > 0 && var4.field6409 == 0) {
                arg1.field1575++;
                class393.field5886 = 0;
                class580.field8260 = -1;
                return;
            }
            if (arg1.field1576 <= 0 && var4.field6407 == 0) {
                class580.field8260 = -1;
                class393.field5886 = 0;
                arg1.field1575++;
                return;
            }
        }
        if (arg1.field1487 != -1 && arg1.field1481 <= class310.field4553) {
            class347 var5 = class522.field7247.method2489(30, arg1.field1487);
            if (var5.field4975 && var5.field4961 != -1) {
                class439 var6 = class49.field739.method2297((byte) 109, var5.field4961);
                if (arg1.field1576 > 0 && var6.field6409 == 0) {
                    arg1.field1575++;
                    class393.field5886 = 0;
                    class580.field8260 = -1;
                    return;
                }
                if (arg1.field1576 <= 0 && var6.field6407 == 0) {
                    class393.field5886 = 0;
                    class580.field8260 = -1;
                    arg1.field1575++;
                    return;
                }
            }
        }
        if (arg0 <= 21) {
            return;
        }
        if (arg1.field1487 != -1 && arg1.field1481 <= class310.field4553) {
            class347 var7 = class522.field7247.method2489(30, arg1.field1487);
            if (var7.field4975 && var7.field4961 != -1) {
                class439 var8 = class49.field739.method2297((byte) 108, var7.field4961);
                if (arg1.field1576 > 0 && var8.field6409 == 0) {
                    class393.field5886 = 0;
                    class580.field8260 = -1;
                    arg1.field1575++;
                    return;
                }
                if (arg1.field1576 <= 0 && var8.field6407 == 0) {
                    class393.field5886 = 0;
                    arg1.field1575++;
                    class580.field8260 = -1;
                    return;
                }
            }
        }
        int var9 = arg1.field5108;
        int var10 = arg1.field5109;
        int var11 = arg1.field1571[arg1.field1567 - 1] * 128 + arg1.method781((byte) 66) * 64;
        int var12 = arg1.field1572[arg1.field1567 - 1] * 128 + (arg1.method781((byte) 36) * 64);
        if (var9 < var11) {
            if (var10 < var12) {
                arg1.method782(10240, -36);
            } else if (var10 <= var12) {
                arg1.method782(12288, -36);
            } else {
                arg1.method782(14336, -36);
            }
        } else if (var11 < var9) {
            if (var12 > var10) {
                arg1.method782(6144, -36);
            } else if (var10 <= var12) {
                arg1.method782(4096, -36);
            } else {
                arg1.method782(2048, -36);
            }
        } else if (var10 < var12) {
            arg1.method782(8192, -36);
        } else if (var12 < var10) {
            arg1.method782(0, -36);
        }
        byte var13 = arg1.field1574[arg1.field1567 - 1];
        if (!arg2 && ((var11 - var9) > 256 || var11 - var9 < -256 || var12 - var10 > 256 || var12 - var10 < -256)) {
            arg1.field5108 = var11;
            arg1.field5109 = var12;
            arg1.method771(0, arg1.field1558, false);
            class580.field8260 = -1;
            arg1.field1567--;
            if (arg1.field1576 > 0) {
                arg1.field1576--;
            }
            class393.field5886 = 0;
            return;
        }
        int var14 = 4;
        boolean var15 = true;
        if (arg1 instanceof class170) {
            var15 = ((class170) arg1).field2492.field6351;
        }
        if (var15) {
            int var16 = arg1.field1558 - arg1.field1557.field1751;
            if (var16 != 0 && arg1.field1526 == -1 && arg1.field1550 != 0) {
                var14 = 2;
            }
            if (!arg2 && arg1.field1567 > 2) {
                var14 = 6;
            }
            if (!arg2 && arg1.field1567 > 3) {
                var14 = 8;
            }
        } else {
            if (!arg2 && arg1.field1567 > 1) {
                var14 = 6;
            }
            if (!arg2 && arg1.field1567 > 2) {
                var14 = 8;
            }
        }
        if (arg1.field1575 > 0 && arg1.field1567 > 1) {
            arg1.field1575--;
            var14 = 8;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field4317 != -1) {
            int var17 = var14 << 7;
            if (arg1.field1567 == 1) {
                int var18 = arg1.field1568 * arg1.field1568;
                int var19 = (var11 < arg1.field5108 ? arg1.field5108 - var11 : -arg1.field5108 + var11) << 7;
                int var20 = (var12 < arg1.field5109 ? arg1.field5109 - var12 : var12 - arg1.field5109) << 7;
                int var21 = var19 <= var20 ? var20 : var19;
                int var22 = var3.field4317 * var21 * 2;
                if (var22 < var18) {
                    arg1.field1568 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg1.field1568 -= var3.field4317;
                    if (arg1.field1568 < 0) {
                        arg1.field1568 = 0;
                    }
                } else if (var17 > arg1.field1568) {
                    arg1.field1568 += var3.field4317;
                    if (arg1.field1568 > var17) {
                        arg1.field1568 = var17;
                    }
                }
            } else if (arg1.field1568 < var17) {
                arg1.field1568 += var3.field4317;
                if (arg1.field1568 > var17) {
                    arg1.field1568 = var17;
                }
            } else if (arg1.field1568 > 0) {
                arg1.field1568 -= var3.field4317;
                if (arg1.field1568 < 0) {
                    arg1.field1568 = 0;
                }
            }
            var14 = arg1.field1568 >> 7;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class393.field5886 = 0;
        if (var9 == var11 && var10 == var12) {
            class580.field8260 = -1;
        } else {
            if (var9 < var11) {
                arg1.field5108 += var14;
                class393.field5886 |= 0x4;
                if (arg1.field5108 > var11) {
                    arg1.field5108 = var11;
                }
            } else if (var9 > var11) {
                class393.field5886 |= 0x8;
                arg1.field5108 -= var14;
                if (var11 > arg1.field5108) {
                    arg1.field5108 = var11;
                }
            }
            if (var12 > var10) {
                arg1.field5109 += var14;
                class393.field5886 |= 0x1;
                if (arg1.field5109 > var12) {
                    arg1.field5109 = var12;
                }
            } else if (var12 < var10) {
                arg1.field5109 -= var14;
                class393.field5886 |= 0x2;
                if (arg1.field5109 < var12) {
                    arg1.field5109 = var12;
                }
            }
            if (var14 >= 8) {
                class580.field8260 = 2;
            } else {
                class580.field8260 = var13;
            }
        }
        if (arg1.field5108 != var11 || arg1.field5109 != var12) {
            return;
        }
        arg1.field1567--;
        if (arg1.field1576 > 0) {
            arg1.field1576--;
            return;
        }
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(Z)I", line = 380)
    public final int method27(boolean arg0) {
        field3252++;
        return arg0 ? 116 : this.field3251;
    }

    @OriginalMember(owner = "client!to", name = "c", descriptor = "(I)I", line = 395)
    public final int method25(int arg0) {
        if (arg0 != 26999) {
            this.method23(-114);
        }
        field3246++;
        return this.field3248;
    }

    @OriginalMember(owner = "client!to", name = "b", descriptor = "(I)J", line = 408)
    public final long method24(int arg0) {
        field3260++;
        if (arg0 != -6) {
            this.method26(false);
        }
        return this.field3257;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(BII)Z", line = 419)
    public static final boolean method1458(byte arg0, int arg1, int arg2) {
        int var3 = -86 / ((arg0 - 18) / 51);
        field3255++;
        return class322.method2005(arg2, -103, arg1) & class57.method465(arg1, 80, arg2);
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(ILui;)Ljava/lang/String;", line = 434)
    public static final String method1459(int arg0, class587 arg1) {
        field3256++;
        int var2 = -65 / ((-arg0 - 36) / 33);
        return arg1.field8370 == null || arg1.field8370.length() <= 0 ? arg1.field8360 : arg1.field8360 + class287.field4175.method3220(false, class538.field7500) + arg1.field8370;
    }

    @OriginalMember(owner = "client!to", name = "a", descriptor = "(I)I", line = 451)
    public final int method23(int arg0) {
        field3253++;
        return arg0 == -31225 ? 0 : 13;
    }
}
