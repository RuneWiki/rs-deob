import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ag")
public class class680 {

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "Z")
    public boolean field9577;

    @OriginalMember(owner = "client!ag", name = "h", descriptor = "[[J")
    public static long[][] field9582 = new long[8][256];

    @OriginalMember(owner = "client!ag", name = "g", descriptor = "[J")
    public static long[] field9581 = new long[11];

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "I")
    public static int field9575;

    @OriginalMember(owner = "client!ag", name = "e", descriptor = "I")
    public static int field9579;

    @OriginalMember(owner = "client!ag", name = "f", descriptor = "I")
    public static int field9580;

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "Lida;")
    public class234 field9576;

    @OriginalMember(owner = "client!ag", name = "d", descriptor = "Lida;")
    public class234 field9578;

    @OriginalMember(owner = "client!ag", name = "i", descriptor = "Z")
    public boolean field9583;

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
            field9582[0][var0] = class395.method2452(var14, class395.method2452(class395.method2452(var10 << 16, class395.method2452(class395.method2452(var4 << 32, class395.method2452(var8 << 40, class395.method2452(var4 << 56, var4 << 48))), var12 << 24)), var6 << 8));
            for (int var16 = 1; var16 < 8; var16++) {
                field9582[var16][var0] = class395.method2452(field9582[var16 - 1][var0] >>> 8, field9582[var16 - 1][var0] << 56);
            }
        }
        field9581[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field9581[var1] = class182.method1304(class182.method1304(class182.method1304(class182.method1304(class182.method1304(class182.method1304(class182.method1304(class362.method2256(field9582[1][var2 + 1], 71776119061217280L), class362.method2256(field9582[0][var2], -72057594037927936L)), class362.method2256(280375465082880L, field9582[2][var2 + 2])), class362.method2256(1095216660480L, field9582[3][var2 + 3])), class362.method2256(4278190080L, field9582[4][var2 + 4])), class362.method2256(16711680L, field9582[5][var2 + 5])), class362.method2256(field9582[6][var2 + 6], 65280L)), class362.method2256(255L, field9582[7][var2 + 7]));
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "()V", line = 5)
    public static final void method3840() {
        for (int var0 = class475.field6803; var0 < class749.field10470; var0++) {
            for (int var1 = 0; var1 < class613.field8871; var1++) {
                for (int var2 = 0; var2 < class453.field6328; var2++) {
                    class416 var3 = class390.field5454[var0][var1][var2];
                    if (var3 != null) {
                        class455 var4 = var3.field5838;
                        class455 var5 = var3.field5840;
                        if (var4 != null && var4.method402((byte) 55)) {
                            class500.method3010(var4, var0, var1, var2, 1, 1);
                            if (var5 != null && var5.method402((byte) 100)) {
                                class500.method3010(var5, var0, var1, var2, 1, 1);
                                var5.method405((byte) -109, 0, class497.field7089, var4, false, 0, 0);
                                var5.method400(115);
                            }
                            var4.method400(112);
                        }
                        for (class217 var6 = var3.field5844; var6 != null; var6 = var6.field3091) {
                            class113 var8 = var6.field3090;
                            if (var8 != null && var8.method402((byte) 40)) {
                                class500.method3010(var8, var0, var1, var2, var8.field1818 + 1 - var8.field1814, var8.field1810 - var8.field1820 + 1);
                                var8.method400(108);
                            }
                        }
                        class578 var7 = var3.field5846;
                        if (var7 != null && var7.method402((byte) 53)) {
                            class152.method1166(var7, var0, var1, var2);
                            var7.method400(122);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(I)V", line = 81)
    public static void method3841(int arg0) {
        field9582 = null;
        field9581 = null;
        if (arg0 != 17813) {
            field9582 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "b", descriptor = "(I)V", line = 96)
    public final void method3842(int arg0) {
        field9575++;
        if (this.field9576 != null) {
            this.field9576.method1496(false);
        }
        this.field9583 = false;
        if (arg0 != -5668) {
            this.field9578 = null;
        }
    }

    @OriginalMember(owner = "client!ag", name = "c", descriptor = "(I)Z", line = 114)
    public final boolean method3843(int arg0) {
        if (arg0 != 1310982144) {
            method3840();
        }
        field9579++;
        return this.field9583 && !this.field9577;
    }

    @OriginalMember(owner = "client!ag", name = "a", descriptor = "(IIIIIIIBIIILjn;)Z", line = 127)
    public static final boolean method3844(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9, int arg10, class716 arg11) {
        field9580++;
        int var12 = arg5;
        int var13 = arg8;
        byte var14 = 64;
        byte var15 = 64;
        if (arg7 < 20) {
            field9581 = null;
        }
        int var16 = arg5 - var14;
        int var17 = arg8 - var15;
        class73.field1288[var14][var15] = 99;
        class668.field9364[var14][var15] = 0;
        byte var18 = 0;
        class541.field7609[var18] = arg5;
        int var19 = 0;
        int var35 = var18 + 1;
        class667.field9346[var18] = arg8;
        int[][] var20 = arg11.field9991;
        while (true) {
            label286: while (true) {
                int var21;
                int var22;
                int var23;
                int var24;
                int var26;
                do {
                    do {
                        do {
                            label263: do {
                                if (var35 == var19) {
                                    class40.field591 = var13;
                                    class33.field437 = var12;
                                    return false;
                                }
                                var13 = class667.field9346[var19];
                                var12 = class541.field7609[var19];
                                var21 = var12 - var16;
                                var19 = var19 + 1 & 0xFFF;
                                var22 = var13 - var17;
                                var23 = var12 - arg11.field9992;
                                var24 = var13 - arg11.field10004;
                                if (arg2 == -4) {
                                    if (arg0 == var12 && arg10 == var13) {
                                        class40.field591 = var13;
                                        class33.field437 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -3) {
                                    if (class78.method779(arg1, 1275, arg4, var13, arg9, var12, arg0, arg9, arg10)) {
                                        class40.field591 = var13;
                                        class33.field437 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -2) {
                                    if (arg11.method3990((byte) 68, arg10, arg1, var13, arg9, var12, arg0, arg4, arg9, arg3)) {
                                        class40.field591 = var13;
                                        class33.field437 = var12;
                                        return true;
                                    }
                                } else if (arg2 == -1) {
                                    if (arg11.method3984(var12, var13, arg3, arg9, arg0, (byte) 89, arg1, arg10, arg4)) {
                                        class40.field591 = var13;
                                        class33.field437 = var12;
                                        return true;
                                    }
                                } else if (arg2 == 0 || arg2 == 1 || arg2 == 2 || arg2 == 3 || arg2 == 9) {
                                    if (arg11.method3998(arg10, var13, arg2, arg6, arg9, arg0, 1, var12)) {
                                        class40.field591 = var13;
                                        class33.field437 = var12;
                                        return true;
                                    }
                                } else if (arg11.method3991(arg9, arg10, arg6, (byte) 98, var12, arg2, arg0, var13)) {
                                    class33.field437 = var12;
                                    class40.field591 = var13;
                                    return true;
                                }
                                var26 = class668.field9364[var21][var22] + 1;
                                if (var21 > 0 && class73.field1288[var21 - 1][var22] == 0 && (var20[var23 - 1][var24] & 0x43A40000) == 0 && (var20[var23 - 1][var24 + arg9 - 1] & 0x4E240000) == 0) {
                                    int var27 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var27) {
                                            class541.field7609[var35] = var12 - 1;
                                            class667.field9346[var35] = var13;
                                            class73.field1288[var21 - 1][var22] = 2;
                                            var35 = var35 + 1 & 0xFFF;
                                            class668.field9364[var21 - 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var27] & 0x4FA40000) != 0) {
                                            break;
                                        }
                                        var27++;
                                    }
                                }
                                if (128 - arg9 > var21 && class73.field1288[var21 + 1][var22] == 0 && (var20[arg9 + var23][var24] & 0x60E40000) == 0 && (var20[arg9 + var23][arg9 + var24 - 1] & 0x78240000) == 0) {
                                    int var28 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var28) {
                                            class541.field7609[var35] = var12 + 1;
                                            class667.field9346[var35] = var13;
                                            class73.field1288[var21 + 1][var22] = 8;
                                            var35 = var35 + 1 & 0xFFF;
                                            class668.field9364[var21 + 1][var22] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var28] & 0x78E40000) != 0) {
                                            break;
                                        }
                                        var28++;
                                    }
                                }
                                if (var22 > 0 && class73.field1288[var21][var22 - 1] == 0 && (var20[var23][var24 - 1] & 0x43A40000) == 0 && (var20[arg9 + var23 - 1][var24 - 1] & 0x60E40000) == 0) {
                                    int var29 = 1;
                                    while (true) {
                                        if (var29 >= (arg9 - 1)) {
                                            class541.field7609[var35] = var12;
                                            class667.field9346[var35] = var13 - 1;
                                            var35 = var35 + 1 & 0xFFF;
                                            class73.field1288[var21][var22 - 1] = 1;
                                            class668.field9364[var21][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var29][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var29++;
                                    }
                                }
                                if (var22 < 128 - arg9 && class73.field1288[var21][var22 + 1] == 0 && (var20[var23][arg9 + var24] & 0x4E240000) == 0 && (var20[var23 + arg9 - 1][arg9 + var24] & 0x78240000) == 0) {
                                    int var30 = 1;
                                    while (true) {
                                        if (arg9 - 1 <= var30) {
                                            class541.field7609[var35] = var12;
                                            class667.field9346[var35] = var13 + 1;
                                            class73.field1288[var21][var22 + 1] = 4;
                                            var35 = var35 + 1 & 0xFFF;
                                            class668.field9364[var21][var22 + 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 + var30][var24 + arg9] & 0x7E240000) != 0) {
                                            break;
                                        }
                                        var30++;
                                    }
                                }
                                if (var21 > 0 && var22 > 0 && class73.field1288[var21 - 1][var22 - 1] == 0 && (var20[var23 - 1][var24 - 1] & 0x43A40000) == 0) {
                                    int var31 = 1;
                                    while (true) {
                                        if (arg9 <= var31) {
                                            class541.field7609[var35] = var12 - 1;
                                            class667.field9346[var35] = var13 - 1;
                                            class73.field1288[var21 - 1][var22 - 1] = 3;
                                            var35 = var35 + 1 & 0xFFF;
                                            class668.field9364[var21 - 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[var23 - 1][var24 + var31 - 1] & 0x4FA40000) != 0 || (var20[var23 + var31 - 1][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var31++;
                                    }
                                }
                                if ((128 - arg9) > var21 && var22 > 0 && class73.field1288[var21 + 1][var22 - 1] == 0 && (var20[arg9 + var23][var24 - 1] & 0x60E40000) == 0) {
                                    int var32 = 1;
                                    while (true) {
                                        if (var32 >= arg9) {
                                            class541.field7609[var35] = var12 + 1;
                                            class667.field9346[var35] = var13 - 1;
                                            class73.field1288[var21 + 1][var22 - 1] = 9;
                                            var35 = var35 + 1 & 0xFFF;
                                            class668.field9364[var21 + 1][var22 - 1] = var26;
                                            break;
                                        }
                                        if ((var20[arg9 + var23][var24 + var32 - 1] & 0x78E40000) != 0 || (var20[var23 + var32][var24 - 1] & 0x63E40000) != 0) {
                                            break;
                                        }
                                        var32++;
                                    }
                                }
                                if (var21 > 0 && var22 < (128 - arg9) && class73.field1288[var21 - 1][var22 + 1] == 0 && (var20[var23 - 1][arg9 + var24] & 0x4E240000) == 0) {
                                    for (int var33 = 1; var33 < arg9; var33++) {
                                        if ((var20[var23 - 1][var24 + var33] & 0x4FA40000) != 0 || (var20[var23 + var33 - 1][arg9 + var24] & 0x7E240000) != 0) {
                                            continue label263;
                                        }
                                    }
                                    class541.field7609[var35] = var12 - 1;
                                    class667.field9346[var35] = var13 + 1;
                                    var35 = var35 + 1 & 0xFFF;
                                    class73.field1288[var21 - 1][var22 + 1] = 6;
                                    class668.field9364[var21 - 1][var22 + 1] = var26;
                                }
                            } while (128 - arg9 <= var21);
                        } while (var22 >= 128 - arg9);
                    } while (class73.field1288[var21 + 1][var22 + 1] != 0);
                } while ((var20[arg9 + var23][arg9 + var24] & 0x78240000) != 0);
                for (int var34 = 1; var34 < arg9; var34++) {
                    if ((var20[var23 + var34][var24 + arg9] & 0x7E240000) != 0 || (var20[arg9 + var23][var24 + var34] & 0x78E40000) != 0) {
                        continue label286;
                    }
                }
                class541.field7609[var35] = var12 + 1;
                class667.field9346[var35] = var13 + 1;
                var35 = var35 + 1 & 0xFFF;
                class73.field1288[var21 + 1][var22 + 1] = 12;
                class668.field9364[var21 + 1][var22 + 1] = var26;
            }
        }
    }

    @OriginalMember(owner = "client!ag", name = "<init>", descriptor = "(Z)V", line = 555)
    public class680(boolean arg0) {
        this.field9577 = arg0;
    }
}
