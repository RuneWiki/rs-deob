import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!as")
public class class572 {

    @OriginalMember(owner = "client!as", name = "v", descriptor = "I")
    public int field7990 = -1;

    @OriginalMember(owner = "client!as", name = "e", descriptor = "Lus;")
    public static class328 field7973 = new class328(50, 0);

    @OriginalMember(owner = "client!as", name = "r", descriptor = "[[J")
    public static long[][] field7986 = new long[8][256];

    @OriginalMember(owner = "client!as", name = "u", descriptor = "[J")
    public static long[] field7989 = new long[11];

    @OriginalMember(owner = "client!as", name = "B", descriptor = "Lmq;")
    public static class78 field7996;

    @OriginalMember(owner = "client!as", name = "a", descriptor = "I")
    public static int field7969;

    @OriginalMember(owner = "client!as", name = "m", descriptor = "I")
    public static int field7981;

    @OriginalMember(owner = "client!as", name = "q", descriptor = "I")
    public static int field7985;

    @OriginalMember(owner = "client!as", name = "w", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!as", name = "x", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!as", name = "A", descriptor = "I")
    public static int field7995;

    @OriginalMember(owner = "client!as", name = "n", descriptor = "Lsga;")
    private class583 field7982;

    @OriginalMember(owner = "client!as", name = "o", descriptor = "Lac;")
    public static class712 field7983;

    @OriginalMember(owner = "client!as", name = "h", descriptor = "Ljava/lang/String;")
    private String field7976;

    @OriginalMember(owner = "client!as", name = "s", descriptor = "Ljava/lang/String;")
    private String field7987;

    @OriginalMember(owner = "client!as", name = "b", descriptor = "[I")
    private int[] field7970;

    @OriginalMember(owner = "client!as", name = "g", descriptor = "[I")
    private int[] field7975;

    @OriginalMember(owner = "client!as", name = "i", descriptor = "[I")
    private int[] field7977;

    @OriginalMember(owner = "client!as", name = "j", descriptor = "[I")
    private int[] field7978;

    @OriginalMember(owner = "client!as", name = "l", descriptor = "[I")
    private int[] field7980;

    @OriginalMember(owner = "client!as", name = "t", descriptor = "[I")
    private int[] field7988;

    @OriginalMember(owner = "client!as", name = "y", descriptor = "[I")
    private int[] field7993;

    @OriginalMember(owner = "client!as", name = "z", descriptor = "[I")
    private int[] field7994;

    @OriginalMember(owner = "client!as", name = "c", descriptor = "[Ljava/lang/String;")
    private String[] field7971;

    @OriginalMember(owner = "client!as", name = "f", descriptor = "[Ljava/lang/String;")
    private String[] field7974;

    @OriginalMember(owner = "client!as", name = "d", descriptor = "[[I")
    private int[][] field7972;

    @OriginalMember(owner = "client!as", name = "k", descriptor = "[[I")
    private int[][] field7979;

    @OriginalMember(owner = "client!as", name = "p", descriptor = "[[I")
    private int[][] field7984;

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
            field7986[0][var0] = class130.method834(class130.method834(var6 << 8, class130.method834(var10 << 16, class130.method834(class130.method834(class130.method834(class130.method834(var4 << 48, var4 << 56), var8 << 40), var4 << 32), var12 << 24))), var14);
            for (int var16 = 1; var16 < 8; var16++) {
                field7986[var16][var0] = class130.method834(field7986[var16 - 1][var0] << 56, field7986[var16 - 1][var0] >>> 8);
            }
        }
        field7989[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = var1 * 8 - 8;
            field7989[var1] = class748.method4180(class748.method4180(class748.method4180(class349.method2046(field7986[5][var2 + 5], 16711680L), class748.method4180(class748.method4180(class748.method4180(class349.method2046(field7986[2][var2 + 2], 280375465082880L), class748.method4180(class349.method2046(-72057594037927936L, field7986[0][var2]), class349.method2046(field7986[1][var2 + 1], 71776119061217280L))), class349.method2046(1095216660480L, field7986[3][var2 + 3])), class349.method2046(4278190080L, field7986[4][var2 + 4]))), class349.method2046(65280L, field7986[6][var2 + 6])), class349.method2046(field7986[7][var2 + 7], 255L));
        }
        field7996 = new class78(78, 3);
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ILtn;)V", line = 10)
    public final void method3213(int arg0, class179 arg1) {
        if (arg0 <= 19) {
            this.field7971 = null;
        }
        field7969++;
        while (true) {
            int var3 = arg1.method1094(255);
            if (var3 == 0) {
                return;
            }
            this.method3215(arg1, var3, 3);
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Z)V", line = 32)
    public final void method3214(boolean arg0) {
        field7992++;
        if (this.field7976 == null) {
            this.field7976 = this.field7987;
        }
        if (!arg0) {
            this.field7994 = null;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(Ltn;II)V", line = 61)
    private final void method3215(class179 arg0, int arg1, int arg2) {
        if (arg2 != 3) {
            this.field7987 = null;
        }
        field7985++;
        if (arg1 == 1) {
            this.field7987 = arg0.method1109(88);
        } else if (arg1 == 2) {
            this.field7976 = arg0.method1109(89);
        } else if (arg1 == 3) {
            int var22 = arg0.method1094(255);
            this.field7984 = new int[var22][3];
            for (int var23 = 0; var23 < var22; var23++) {
                this.field7984[var23][0] = arg0.method1107(false);
                this.field7984[var23][1] = arg0.method1095((byte) 118);
                this.field7984[var23][2] = arg0.method1095((byte) 122);
            }
        } else if (arg1 == 4) {
            int var4 = arg0.method1094(255);
            this.field7979 = new int[var4][3];
            for (int var5 = 0; var5 < var4; var5++) {
                this.field7979[var5][0] = arg0.method1107(false);
                this.field7979[var5][1] = arg0.method1095((byte) 114);
                this.field7979[var5][2] = arg0.method1095((byte) 126);
            }
        } else if (arg1 == 5) {
            arg0.method1107(false);
        } else if (arg1 == 6) {
            arg0.method1094(255);
        } else if (arg1 == 7) {
            arg0.method1094(255);
            return;
        } else if (arg1 != 8) {
            if (arg1 == 9) {
                arg0.method1094(255);
                return;
            }
            if (arg1 == 10) {
                int var6 = arg0.method1094(255);
                this.field7977 = new int[var6];
                for (int var7 = 0; var7 < var6; var7++) {
                    this.field7977[var7] = arg0.method1095((byte) 121);
                }
                return;
            }
            if (arg1 == 12) {
                arg0.method1095((byte) 113);
                return;
            }
            if (arg1 == 13) {
                int var8 = arg0.method1094(255);
                this.field7975 = new int[var8];
                for (int var9 = 0; var9 < var8; var9++) {
                    this.field7975[var9] = arg0.method1107(false);
                }
                return;
            }
            if (arg1 != 14) {
                if (arg1 == 15) {
                    arg0.method1107(false);
                    return;
                }
                if (arg1 == 17) {
                    this.field7990 = arg0.method1107(false);
                } else if (arg1 == 18) {
                    int var10 = arg0.method1094(255);
                    this.field7980 = new int[var10];
                    this.field7988 = new int[var10];
                    this.field7970 = new int[var10];
                    this.field7971 = new String[var10];
                    for (int var11 = 0; var11 < var10; var11++) {
                        this.field7980[var11] = arg0.method1095((byte) 120);
                        this.field7988[var11] = arg0.method1095((byte) 118);
                        this.field7970[var11] = arg0.method1095((byte) 123);
                        this.field7971[var11] = arg0.method1106(-1);
                    }
                    return;
                } else if (arg1 == 19) {
                    int var12 = arg0.method1094(255);
                    this.field7974 = new String[var12];
                    this.field7978 = new int[var12];
                    this.field7993 = new int[var12];
                    this.field7994 = new int[var12];
                    for (int var13 = 0; var13 < var12; var13++) {
                        this.field7994[var13] = arg0.method1095((byte) 119);
                        this.field7978[var13] = arg0.method1095((byte) 117);
                        this.field7993[var13] = arg0.method1095((byte) 114);
                        this.field7974[var13] = arg0.method1106(-1);
                    }
                    return;
                } else if (arg1 == 249) {
                    int var14 = arg0.method1094(255);
                    if (this.field7982 == null) {
                        int var15 = class353.method2103(arg2 ^ 0x57, var14);
                        this.field7982 = new class583(var15);
                    }
                    for (int var16 = 0; var16 < var14; var16++) {
                        boolean var17 = arg0.method1094(255) == 1;
                        int var18 = arg0.method1114(arg2 + 114);
                        class627 var19;
                        if (var17) {
                            var19 = new class739(arg0.method1106(-1));
                        } else {
                            var19 = new class394(arg0.method1095((byte) 119));
                        }
                        this.field7982.method3249((long) var18, var19, (byte) -82);
                    }
                    return;
                }
                return;
            }
            int var20 = arg0.method1094(255);
            this.field7972 = new int[var20][2];
            for (int var21 = 0; var21 < var20; var21++) {
                this.field7972[var21][0] = arg0.method1094(255);
                this.field7972[var21][1] = arg0.method1094(255);
            }
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(ZBLkba;)V", line = 308)
    public static final void method3216(boolean arg0, byte arg1, class24 arg2) {
        field7995++;
        class459 var3 = arg2.method249(-80);
        if (arg2.field427 == 0) {
            class363.field5163 = -1;
            arg2.field431 = 0;
            class213.field2712 = 0;
            return;
        }
        if (arg2.field376 != -1 && arg2.field364 == 0) {
            class747 var4 = class646.field8903.method643(arg2.field376, -122);
            if (arg2.field434 > 0 && var4.field10454 == 0) {
                class363.field5163 = -1;
                class213.field2712 = 0;
                arg2.field431++;
                return;
            }
            if (arg2.field434 <= 0 && var4.field10456 == 0) {
                arg2.field431++;
                class213.field2712 = 0;
                class363.field5163 = -1;
                return;
            }
        }
        if (arg2.field395 != -1 && class266.field3368 >= arg2.field383) {
            class716 var5 = class250.field3177.method3616((byte) 125, arg2.field395);
            if (var5.field10105 && var5.field10096 != -1) {
                class747 var6 = class646.field8903.method643(var5.field10096, -62);
                if (arg2.field434 > 0 && var6.field10454 == 0) {
                    arg2.field431++;
                    class363.field5163 = -1;
                    class213.field2712 = 0;
                    return;
                }
                if (arg2.field434 <= 0 && var6.field10456 == 0) {
                    class363.field5163 = -1;
                    class213.field2712 = 0;
                    arg2.field431++;
                    return;
                }
            }
        }
        if (arg2.field395 != -1 && class266.field3368 >= arg2.field383) {
            class716 var7 = class250.field3177.method3616((byte) 120, arg2.field395);
            if (var7.field10105 && var7.field10096 != -1) {
                class747 var8 = class646.field8903.method643(var7.field10096, -120);
                if (arg2.field434 > 0 && var8.field10454 == 0) {
                    arg2.field431++;
                    class213.field2712 = 0;
                    class363.field5163 = -1;
                    return;
                }
                if (arg2.field434 <= 0 && var8.field10456 == 0) {
                    class213.field2712 = 0;
                    class363.field5163 = -1;
                    arg2.field431++;
                    return;
                }
            }
        }
        int var9 = arg2.field5790;
        int var10 = arg2.field5784;
        int var11 = arg2.field435[arg2.field427 - 1] * 512 + (arg2.method253((byte) -27) * 256);
        if (arg1 != -97) {
            method3217(-8, null);
        }
        int var12 = arg2.field426[arg2.field427 - 1] * 512 + arg2.method253((byte) -27) * 256;
        if (var11 > var9) {
            if (var12 > var10) {
                arg2.method266(-122, 10240);
            } else if (var12 < var10) {
                arg2.method266(-118, 14336);
            } else {
                arg2.method266(-123, 12288);
            }
        } else if (var9 > var11) {
            if (var10 < var12) {
                arg2.method266(-127, 6144);
            } else if (var10 > var12) {
                arg2.method266(-128, 2048);
            } else {
                arg2.method266(-128, 4096);
            }
        } else if (var12 > var10) {
            arg2.method266(-115, 8192);
        } else if (var10 > var12) {
            arg2.method266(-121, 0);
        }
        byte var13 = arg2.field428[arg2.field427 - 1];
        if (!arg0 && var11 - var9 > 1024 || (var11 - var9) < -1024 || (var12 - var10) > 1024 || (var12 - var10) < -1024) {
            arg2.field5784 = var12;
            arg2.field5790 = var11;
            arg2.method270(arg1 ^ 0xFFFFFFD3, arg2.field371, false);
            arg2.field427--;
            class363.field5163 = -1;
            class213.field2712 = 0;
            if (arg2.field434 > 0) {
                arg2.field434--;
            }
            return;
        }
        int var14 = 16;
        boolean var15 = true;
        if (arg2 instanceof class124) {
            var15 = ((class124) arg2).field1486.field1934;
        }
        if (var15) {
            int var16 = arg2.field371 - arg2.field336.field7217;
            if (var16 != 0 && arg2.field407 == -1 && arg2.field335 != 0) {
                var14 = 8;
            }
            if (!arg0 && arg2.field427 > 2) {
                var14 = 24;
            }
            if (!arg0 && arg2.field427 > 3) {
                var14 = 32;
            }
        } else {
            if (!arg0 && arg2.field427 > 1) {
                var14 = 24;
            }
            if (!arg0 && arg2.field427 > 2) {
                var14 = 32;
            }
        }
        if (arg2.field431 > 0 && arg2.field427 > 1) {
            arg2.field431--;
            var14 = 32;
        }
        if (var13 == 2) {
            var14 <<= 0x1;
        } else if (var13 == 0) {
            var14 >>= 0x1;
        }
        if (var3.field6437 != -1) {
            int var17 = var14 << 9;
            if (arg2.field427 == 1) {
                int var18 = arg2.field430 * arg2.field430;
                int var19 = (var11 >= arg2.field5790 ? var11 - arg2.field5790 : -var11 + arg2.field5790) << 9;
                int var20 = (var12 >= arg2.field5784 ? var12 - arg2.field5784 : -var12 + arg2.field5784) << 9;
                int var21 = var19 > var20 ? var19 : var20;
                int var22 = var3.field6437 * 2 * var21;
                if (var18 > var22) {
                    arg2.field430 /= 2;
                } else if (var21 < (var18 / 2)) {
                    arg2.field430 -= var3.field6437;
                    if (arg2.field430 < 0) {
                        arg2.field430 = 0;
                    }
                } else if (arg2.field430 < var17) {
                    arg2.field430 += var3.field6437;
                    if (arg2.field430 > var17) {
                        arg2.field430 = var17;
                    }
                }
            } else if (arg2.field430 < var17) {
                arg2.field430 += var3.field6437;
                if (var17 < arg2.field430) {
                    arg2.field430 = var17;
                }
            } else if (arg2.field430 > 0) {
                arg2.field430 -= var3.field6437;
                if (arg2.field430 < 0) {
                    arg2.field430 = 0;
                }
            }
            var14 = arg2.field430 >> 9;
            if (var14 < 1) {
                var14 = 1;
            }
        }
        class213.field2712 = 0;
        if (var9 == var11 && var10 == var12) {
            class363.field5163 = -1;
        } else {
            if (var11 > var9) {
                class213.field2712 |= 0x4;
                arg2.field5790 += var14;
                if (arg2.field5790 > var11) {
                    arg2.field5790 = var11;
                }
            } else if (var11 < var9) {
                arg2.field5790 -= var14;
                class213.field2712 |= 0x8;
                if (arg2.field5790 < var11) {
                    arg2.field5790 = var11;
                }
            }
            if (var12 > var10) {
                class213.field2712 |= 0x1;
                arg2.field5784 += var14;
                if (var12 < arg2.field5784) {
                    arg2.field5784 = var12;
                }
            } else if (var12 < var10) {
                class213.field2712 |= 0x2;
                arg2.field5784 -= var14;
                if (var12 > arg2.field5784) {
                    arg2.field5784 = var12;
                }
            }
            if (var14 >= 32) {
                class363.field5163 = 2;
            } else {
                class363.field5163 = var13;
            }
        }
        if (arg2.field5790 != var11 || arg2.field5784 != var12) {
            return;
        }
        arg2.field427--;
        if (arg2.field434 > 0) {
            arg2.field434--;
            return;
        }
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I[B)[B", line = 659)
    public static final byte[] method3217(int arg0, byte[] arg1) {
        field7981++;
        int var2 = -10 / ((-arg0 - 6) / 62);
        int var3 = arg1.length;
        byte[] var4 = new byte[var3];
        class617.method3389(arg1, 0, var4, 0, var3);
        return var4;
    }

    @OriginalMember(owner = "client!as", name = "a", descriptor = "(I)V", line = 676)
    public static void method3218(int arg0) {
        field7996 = null;
        field7986 = null;
        if (arg0 != -2) {
            method3217(45, null);
        }
        field7989 = null;
        field7983 = null;
        field7973 = null;
    }
}
