import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lca")
public class class561 extends class356 implements class57 {

    @OriginalMember(owner = "client!lca", name = "F", descriptor = "Lmf;")
    public class356 field7997;

    @OriginalMember(owner = "client!lca", name = "x", descriptor = "[F")
    public static float[] field7989 = new float[16384];

    @OriginalMember(owner = "client!lca", name = "D", descriptor = "[F")
    public static float[] field7995 = new float[16384];

    @OriginalMember(owner = "client!lca", name = "N", descriptor = "[J")
    public static long[] field8005;

    @OriginalMember(owner = "client!lca", name = "P", descriptor = "[[J")
    public static long[][] field8007;

    @OriginalMember(owner = "client!lca", name = "W", descriptor = "[I")
    public static int[] field8014;

    @OriginalMember(owner = "client!lca", name = "y", descriptor = "I")
    public static int field7990;

    @OriginalMember(owner = "client!lca", name = "z", descriptor = "I")
    public static int field7991;

    @OriginalMember(owner = "client!lca", name = "A", descriptor = "I")
    public static int field7992;

    @OriginalMember(owner = "client!lca", name = "B", descriptor = "I")
    public static int field7993;

    @OriginalMember(owner = "client!lca", name = "C", descriptor = "I")
    public static int field7994;

    @OriginalMember(owner = "client!lca", name = "E", descriptor = "I")
    public static int field7996;

    @OriginalMember(owner = "client!lca", name = "G", descriptor = "I")
    public static int field7998;

    @OriginalMember(owner = "client!lca", name = "H", descriptor = "I")
    public static int field7999;

    @OriginalMember(owner = "client!lca", name = "I", descriptor = "I")
    public static int field8000;

    @OriginalMember(owner = "client!lca", name = "J", descriptor = "I")
    public static int field8001;

    @OriginalMember(owner = "client!lca", name = "K", descriptor = "I")
    public static int field8002;

    @OriginalMember(owner = "client!lca", name = "L", descriptor = "I")
    public static int field8003;

    @OriginalMember(owner = "client!lca", name = "M", descriptor = "I")
    public static int field8004;

    @OriginalMember(owner = "client!lca", name = "O", descriptor = "I")
    public static int field8006;

    @OriginalMember(owner = "client!lca", name = "Q", descriptor = "I")
    public static int field8008;

    @OriginalMember(owner = "client!lca", name = "R", descriptor = "I")
    public static int field8009;

    @OriginalMember(owner = "client!lca", name = "S", descriptor = "I")
    public static int field8010;

    @OriginalMember(owner = "client!lca", name = "T", descriptor = "I")
    public static int field8011;

    @OriginalMember(owner = "client!lca", name = "U", descriptor = "I")
    public static int field8012;

    @OriginalMember(owner = "client!lca", name = "X", descriptor = "Lfaa;")
    public static class136 field8015;

    @OriginalMember(owner = "client!lca", name = "V", descriptor = "Lqf;")
    public static class593 field8013;

    static {
        double var0 = 3.834951969714103E-4D;
        for (int var2 = 0; var2 < 16384; var2++) {
            field7989[var2] = (float) Math.sin((double) var2 * var0);
            field7995[var2] = (float) Math.cos((double) var2 * var0);
        }
        field8005 = new long[11];
        field8007 = new long[8][256];
        for (int var3 = 0; var3 < 256; var3++) {
            char var6 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է\ue427䆋Ᵹ闘ﯮ籦\udd17䞞쨭뼇굚茳挂ꩱ젙䧙\uf2e3守騦㊰\ue90f햀뻍㑈ｺ遟\u2068\u1aae둔錢擱猒䀈쏬\udba1贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀\ude1c﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥\ue261댡鰞䏇ﰄ写洍\ufadf縤㮫츑轎럫㲁铷뤓ⳓ\ue76e쐃噄義⪻셓\udc0b鵬ㅴ\uf646겉ᓡᘺ椉炶탭챂颤⡜\uf886".charAt(var3 / 2);
            long var7 = (long) ((var3 & 0x1) == 0 ? var6 >>> 8 : var6 & 0xFF);
            long var9 = var7 << 1;
            if (var9 >= 256L) {
                var9 ^= 0x11DL;
            }
            long var11 = var9 << 1;
            if (var11 >= 256L) {
                var11 ^= 0x11DL;
            }
            long var13 = var11 ^ var7;
            long var15 = var11 << 1;
            if (var15 >= 256L) {
                var15 ^= 0x11DL;
            }
            long var17 = var7 ^ var15;
            field8007[0][var3] = class464.method2840(var17, class464.method2840(class464.method2840(var13 << 16, class464.method2840(var15 << 24, class464.method2840(var7 << 32, class464.method2840(var11 << 40, class464.method2840(var7 << 48, var7 << 56))))), var9 << 8));
            for (int var19 = 1; var19 < 8; var19++) {
                field8007[var19][var3] = class464.method2840(field8007[var19 - 1][var3] >>> 8, field8007[var19 - 1][var3] << 56);
            }
        }
        field8005[0] = 0L;
        for (int var4 = 1; var4 <= 10; var4++) {
            int var5 = (var4 - 1) * 8;
            field8005[var4] = class550.method3193(class550.method3193(class438.method2731(field8007[6][var5 + 6], 65280L), class550.method3193(class550.method3193(class550.method3193(class550.method3193(class438.method2731(280375465082880L, field8007[2][var5 + 2]), class550.method3193(class438.method2731(field8007[1][var5 + 1], 71776119061217280L), class438.method2731(-72057594037927936L, field8007[0][var5]))), class438.method2731(1095216660480L, field8007[3][var5 + 3])), class438.method2731(field8007[4][var5 + 4], 4278190080L)), class438.method2731(field8007[5][var5 + 5], 16711680L))), class438.method2731(field8007[7][var5 + 7], 255L));
        }
        field8014 = new int[5];
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(I)V", line = 3)
    public final void method87(int arg0) {
        if (arg0 != 7511) {
            this.method94(-84, true, null);
        }
        field7991++;
    }

    @OriginalMember(owner = "client!lca", name = "e", descriptor = "(I)I", line = 13)
    public final int method92(int arg0) {
        if (arg0 != 9812) {
            field7989 = null;
        }
        field7998++;
        return 0;
    }

    @OriginalMember(owner = "client!lca", name = "<init>", descriptor = "(IIIIILmf;)V", line = 30)
    public class561(int arg0, int arg1, int arg2, int arg3, int arg4, class356 arg5) {
        super(arg2, arg3, arg4, 0, 0, 0, class302.method2010(arg1, arg0, true));
        this.field7997 = arg5;
    }

    @OriginalMember(owner = "client!lca", name = "c", descriptor = "(B)V", line = 42)
    public static final void method3244(byte arg0) {
        for (int var1 = 0; var1 < class207.field2771; var1++) {
            int var2 = class200.field2684[var1];
            class78 var3 = ((class411) class42.field456.method524((byte) 83, (long) var2)).field6254;
            int var4 = class46.field498.method1177(255);
            if ((var4 & 0x8) != 0) {
                var4 += class46.field498.method1177(arg0 + 382) << 8;
            }
            if ((var4 & 0x40) != 0) {
                int var5 = class46.field498.method1176((byte) 123);
                int var6 = class46.field498.method1177(255);
                var3.method1156(class287.field3982, false, var5, var6);
                var3.field2457 = class287.field3982 + 300;
                var3.field2493 = class46.field498.method1226(128);
            }
            if ((var4 & 0x2) != 0) {
                var3.field844 = class46.field498.method1195((byte) -125);
                var3.field842 = class46.field498.method1197(true);
            }
            if ((var4 & 0x4) != 0) {
                var3.field2469 = class46.field498.method1195((byte) -125);
                if (var3.field2469 == 65535) {
                    var3.field2469 = -1;
                }
            }
            if ((var4 & 0x20) != 0) {
                if (var3.field864.method3283(-1)) {
                    class130.method801(var3, (byte) -76);
                }
                var3.method509(class224.field3151.method1817(-25, class46.field498.method1220(-99)), arg0 ^ 0x7D);
                var3.method1157((byte) -114, var3.field864.field8096);
                var3.field2505 = var3.field864.field8129 << 3;
                if (var3.field864.method3283(-1)) {
                    class474.method2903(var3.field1757, null, arg0 ^ 0x1D, var3.field2515[0], var3.field2524[0], 0, var3, null);
                }
            }
            if ((var4 & 0x400) != 0) {
                int var7 = class46.field498.method1226(128);
                int[] var8 = new int[var7];
                int[] var9 = new int[var7];
                int[] var10 = new int[var7];
                for (int var11 = 0; var11 < var7; var11++) {
                    int var12 = class46.field498.method1220(118);
                    if (var12 == 65535) {
                        var12 = -1;
                    }
                    var8[var11] = var12;
                    var9[var11] = class46.field498.method1226(arg0 + 255);
                    var10[var11] = class46.field498.method1197(true);
                }
                class460.method2832(var9, 0, var8, var3, var10);
            }
            if ((var4 & 0x800) != 0) {
                var3.field2466 = class46.field498.method1186(27029);
                var3.field2429 = class46.field498.method1213((byte) 63);
                var3.field2463 = class46.field498.method1215(-2);
                var3.field2461 = class46.field498.method1215(-2);
                var3.field2459 = class46.field498.method1220(-62) + class287.field3982;
                var3.field2498 = class46.field498.method1220(-116) + class287.field3982;
                var3.field2441 = class46.field498.method1209(-24738);
                var3.field2463 += var3.field2515[0];
                var3.field2519 = 0;
                var3.field2466 += var3.field2515[0];
                var3.field2461 += var3.field2524[0];
                var3.field2517 = 1;
                var3.field2429 += var3.field2524[0];
            }
            if ((var4 & 0x100) != 0) {
                var3.field2464 = class46.field498.method1186(arg0 + 27156);
                var3.field2467 = class46.field498.method1186(27029);
                var3.field2430 = class46.field498.method1186(27029);
                var3.field2503 = (byte) class46.field498.method1190(false);
                var3.field2449 = class287.field3982 + class46.field498.method1239((byte) 119);
                var3.field2417 = class287.field3982 + class46.field498.method1197(true);
            }
            if ((var4 & 0x10) != 0) {
                int var13 = class46.field498.method1220(arg0 + 247);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = class46.field498.method1226(128);
                class16.method103(var13, var3, 0, var14);
            }
            if ((var4 & 0x1) != 0) {
                var3.field2445 = class46.field498.method1218(false);
                var3.field2474 = 100;
            }
            if ((var4 & 0x80) != 0) {
                int var15 = class46.field498.method1197(true);
                int var16 = class46.field498.method1178(-230315992);
                if (var15 == 65535) {
                    var15 = -1;
                }
                int var17 = class46.field498.method1209(-24738);
                var3.method1150(false, var17, var15, var16, (byte) -68);
            }
            if ((var4 & 0x1000) != 0) {
                int var18 = class46.field498.method1220(arg0);
                if (var18 == 65535) {
                    var18 = -1;
                }
                int var19 = class46.field498.method1178(-230315992);
                int var20 = class46.field498.method1209(-24738);
                var3.method1150(true, var20, var18, var19, (byte) -68);
            }
            if ((var4 & 0x200) != 0) {
                int var21 = class46.field498.method1239((byte) 122);
                var3.field2484 = class46.field498.method1226(128);
                var3.field2480 = class46.field498.method1209(-24738);
                var3.field2500 = var21 & 0x7FFF;
                var3.field2431 = (var21 & 0x8000) != 0;
                var3.field2438 = class287.field3982 - (-var3.field2500 - var3.field2484);
            }
            if ((var4 & 0x2000) != 0) {
                int var22 = class46.field498.method1176((byte) 124);
                int var23 = class46.field498.method1177(arg0 ^ 0xFFFFFF7E);
                var3.method1156(class287.field3982, false, var22, var23);
            }
        }
        if (arg0 != -127) {
            method3248(null, 108, -8, -113, null, (byte) 69);
        }
        field7993++;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IIIIIIIBII)V", line = 247)
    public static final void method3245(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, int arg9) {
        field7996++;
        if (arg4 == arg8 && arg3 == arg9 && arg1 == arg5 && arg0 == arg6) {
            class380.method2444(-85, arg1, arg6, arg2, arg4, arg3);
        } else {
            int var10 = arg4;
            int var11 = arg3;
            int var12 = arg4 * 3;
            int var13 = arg3 * 3;
            int var14 = arg8 * 3;
            int var15 = arg9 * 3;
            int var16 = arg5 * 3;
            int var17 = arg0 * 3;
            int var18 = var14 + arg1 - var16 - arg4;
            int var19 = arg6 + var15 - var17 - arg3;
            int var20 = var12 + var16 - var14 - var14;
            int var21 = var17 - var15 - (-var13 + var15);
            int var22 = var14 - var12;
            int var23 = var15 - var13;
            for (int var24 = 128; var24 <= 4096; var24 += 128) {
                int var25 = var24 * var24 >> 12;
                int var26 = var24 * var25 >> 12;
                int var27 = var18 * var26;
                int var28 = var19 * var26;
                int var29 = var20 * var25;
                int var30 = var21 * var25;
                int var31 = var22 * var24;
                int var32 = var23 * var24;
                int var33 = (var27 + var31 + var29 >> 12) + arg4;
                int var34 = arg3 + (var30 + var32 + var28 >> 12);
                class380.method2444(-83, var33, var34, arg2, var10, var11);
                var11 = var34;
                var10 = var33;
            }
        }
        if (arg7 <= 94) {
            method3247((byte) 87);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Loa;B)Laca;", line = 324)
    public final class630 method88(class605 arg0, byte arg1) {
        field8001++;
        return arg1 >= -127 ? null : null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IBIZLeca;)V", line = 336)
    public static final void method3246(int arg0, byte arg1, int arg2, boolean arg3, class655 arg4) {
        field8010++;
        int var5 = arg4.field2515[0];
        int var6 = arg4.field2524[0];
        if (var5 < 0 || var5 >= class90.field1032 || var6 < 0 || var6 >= class30.field349 || arg2 < 0 || arg2 >= class90.field1032 || arg0 < 0 || arg0 >= class30.field349) {
            return;
        }
        int var7 = class371.method2388(0, var6, 0, arg4.method1153(true), (byte) 14, class353.field5027, class14.field120[arg4.field1757], class322.field4656, arg3, 0, 0, -4, var5, arg0, arg2);
        if (var7 >= 1 && var7 <= 3) {
            for (int var8 = 0; var8 < (var7 - 1); var8++) {
                arg4.method3747(arg1, class353.field5027[var8], -28926, class322.field4656[var8]);
            }
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Loa;I)V", line = 371)
    public final void method90(class605 arg0, int arg1) {
        field8009++;
        if (arg1 != -5) {
            this.method87(43);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(BLoa;)V", line = 384)
    public final void method102(byte arg0, class605 arg1) {
        field8000++;
        if (arg0 >= -54) {
            this.method91(-86, 94, null, 50);
        }
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(I)I", line = 394)
    public final int method95(int arg0) {
        field8002++;
        int var2 = -37 % ((arg0 - 14) / 33);
        return 0;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(ILoa;)V", line = 404)
    public final void method98(int arg0, class605 arg1) {
        field8003++;
        if (arg0 != 16343) {
            this.method548(19);
        }
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(I)Z", line = 416)
    public final boolean method93(int arg0) {
        field7994++;
        if (arg0 != -23445) {
            this.field7997 = null;
        }
        return false;
    }

    @OriginalMember(owner = "client!lca", name = "g", descriptor = "(I)I", line = 428)
    public final int method548(int arg0) {
        field7992++;
        return arg0 == 262144 ? 0 : 14;
    }

    @OriginalMember(owner = "client!lca", name = "d", descriptor = "(B)V", line = 439)
    public static void method3247(byte arg0) {
        if (arg0 <= 122) {
            method3247((byte) -106);
        }
        field8015 = null;
        field8014 = null;
        field8005 = null;
        field8007 = null;
        field8013 = null;
        field7989 = null;
        field7995 = null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IZLoa;)Lba;", line = 455)
    public final class327 method94(int arg0, boolean arg1, class605 arg2) {
        field8006++;
        return arg1 ? null : null;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(Ljava/lang/String;III[BB)I", line = 469)
    public static final int method3248(String arg0, int arg1, int arg2, int arg3, byte[] arg4, byte arg5) {
        field7990++;
        int var6 = arg1 - arg2;
        int var7 = 61 / ((arg5 - 91) / 35);
        for (int var8 = 0; var8 < var6; var8++) {
            char var9 = arg0.charAt(arg2 + var8);
            if (var9 > '\u0000' && var9 < '\u0080' || var9 >= ' ' && var9 <= 'ÿ') {
                arg4[arg3 + var8] = (byte) var9;
            } else if (var9 == '€') {
                arg4[arg3 + var8] = -128;
            } else if (var9 == '‚') {
                arg4[arg3 + var8] = -126;
            } else if (var9 == 'ƒ') {
                arg4[arg3 + var8] = -125;
            } else if (var9 == '„') {
                arg4[arg3 + var8] = -124;
            } else if (var9 == '…') {
                arg4[arg3 + var8] = -123;
            } else if (var9 == '†') {
                arg4[arg3 + var8] = -122;
            } else if (var9 == '‡') {
                arg4[arg3 + var8] = -121;
            } else if (var9 == 'ˆ') {
                arg4[arg3 + var8] = -120;
            } else if (var9 == '‰') {
                arg4[arg3 + var8] = -119;
            } else if (var9 == 'Š') {
                arg4[arg3 + var8] = -118;
            } else if (var9 == '‹') {
                arg4[arg3 + var8] = -117;
            } else if (var9 == 'Œ') {
                arg4[arg3 + var8] = -116;
            } else if (var9 == 'Ž') {
                arg4[arg3 + var8] = -114;
            } else if (var9 == '‘') {
                arg4[arg3 + var8] = -111;
            } else if (var9 == '’') {
                arg4[arg3 + var8] = -110;
            } else if (var9 == '“') {
                arg4[arg3 + var8] = -109;
            } else if (var9 == '”') {
                arg4[arg3 + var8] = -108;
            } else if (var9 == '•') {
                arg4[arg3 + var8] = -107;
            } else if (var9 == '–') {
                arg4[arg3 + var8] = -106;
            } else if (var9 == '—') {
                arg4[arg3 + var8] = -105;
            } else if (var9 == '˜') {
                arg4[arg3 + var8] = -104;
            } else if (var9 == '™') {
                arg4[arg3 + var8] = -103;
            } else if (var9 == 'š') {
                arg4[arg3 + var8] = -102;
            } else if (var9 == '›') {
                arg4[arg3 + var8] = -101;
            } else if (var9 == 'œ') {
                arg4[arg3 + var8] = -100;
            } else if (var9 == 'ž') {
                arg4[arg3 + var8] = -98;
            } else if (var9 == 'Ÿ') {
                arg4[arg3 + var8] = -97;
            } else {
                arg4[arg3 + var8] = 63;
            }
        }
        return var6;
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(I)I", line = 605)
    public final int method89(int arg0) {
        int var2 = -46 / ((11 - arg0) / 51);
        field8004++;
        return 0;
    }

    @OriginalMember(owner = "client!lca", name = "a", descriptor = "(IILoa;I)Z", line = 637)
    public final boolean method91(int arg0, int arg1, class605 arg2, int arg3) {
        if (arg0 == -10503) {
            field8008++;
            return false;
        } else {
            return false;
        }
    }

    @OriginalMember(owner = "client!lca", name = "b", descriptor = "(Loa;I)Lew;", line = 649)
    public final class425 method100(class605 arg0, int arg1) {
        if (arg1 != 28286) {
            field7995 = null;
        }
        field7999++;
        return this.field7997.method100(arg0, 28286);
    }
}
