import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nl")
public class class576 {

    @OriginalMember(owner = "client!nl", name = "e", descriptor = "I")
    public int field8116 = -1;

    @OriginalMember(owner = "client!nl", name = "j", descriptor = "I")
    public int field8121 = -1;

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "Lcj;")
    public static class721 field8113 = new class721(16);

    @OriginalMember(owner = "client!nl", name = "i", descriptor = "Z")
    public static boolean field8120 = false;

    @OriginalMember(owner = "client!nl", name = "h", descriptor = "Lfba;")
    public static class27 field8119 = new class27(86, 7);

    @OriginalMember(owner = "client!nl", name = "l", descriptor = "[I")
    public static int[] field8123 = new int[14];

    @OriginalMember(owner = "client!nl", name = "n", descriptor = "[J")
    public static long[] field8125 = new long[11];

    @OriginalMember(owner = "client!nl", name = "m", descriptor = "[[J")
    public static long[][] field8124 = new long[8][256];

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "I")
    public static int field8112;

    @OriginalMember(owner = "client!nl", name = "c", descriptor = "I")
    public static int field8114;

    @OriginalMember(owner = "client!nl", name = "d", descriptor = "I")
    public static int field8115;

    @OriginalMember(owner = "client!nl", name = "f", descriptor = "I")
    public static int field8117;

    @OriginalMember(owner = "client!nl", name = "g", descriptor = "I")
    public static int field8118;

    @OriginalMember(owner = "client!nl", name = "o", descriptor = "I")
    public static int field8126;

    @OriginalMember(owner = "client!nl", name = "k", descriptor = "[I")
    public int[] field8122;

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
            long var10 = var4 ^ var8;
            long var12 = var8 << 1;
            if (var12 >= 256L) {
                var12 ^= 0x11DL;
            }
            long var14 = var12 ^ var4;
            field8124[0][var0] = class635.method3630(var14, class635.method3630(var6 << 8, class635.method3630(var10 << 16, class635.method3630(var12 << 24, class635.method3630(var4 << 32, class635.method3630(var8 << 40, class635.method3630(var4 << 56, var4 << 48)))))));
            for (int var16 = 1; var16 < 8; var16++) {
                field8124[var16][var0] = class635.method3630(field8124[var16 - 1][var0] >>> 8, field8124[var16 - 1][var0] << 56);
            }
        }
        field8125[0] = 0L;
        for (int var1 = 1; var1 <= 10; var1++) {
            int var2 = (var1 - 1) * 8;
            field8125[var1] = class764.method4233(class764.method4233(class764.method4233(class167.method1248(16711680L, field8124[5][var2 + 5]), class764.method4233(class167.method1248(4278190080L, field8124[4][var2 + 4]), class764.method4233(class764.method4233(class764.method4233(class167.method1248(field8124[1][var2 + 1], 71776119061217280L), class167.method1248(field8124[0][var2], -72057594037927936L)), class167.method1248(field8124[2][var2 + 2], 280375465082880L)), class167.method1248(field8124[3][var2 + 3], 1095216660480L)))), class167.method1248(field8124[6][var2 + 6], 65280L)), class167.method1248(255L, field8124[7][var2 + 7]));
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BILjs;ILfb;)V", line = 3)
    public static final void method3380(byte arg0, int arg1, class349 arg2, int arg3, class702 arg4) {
        field8114++;
        byte var5 = -1;
        if ((arg3 & 0x800) != 0) {
            var5 = arg2.method2975(false);
        }
        if ((arg3 & 0x80) != 0) {
            int var6 = arg2.method2974((byte) -47);
            if (var6 == 65535) {
                var6 = -1;
            }
            int var7 = arg2.method2976(-128);
            int var8 = arg2.method2964((byte) 79);
            int var9 = var8 & 0x7;
            int var10 = (var8 & 0x7F) >> 3;
            if (var10 == 15) {
                var10 = -1;
            }
            arg4.method2109(var6, -124, var7, var9, var10, 0);
        }
        if ((arg3 & 0x100) != 0) {
            arg4.field9767 = arg2.method2944((byte) 4) == 1;
        }
        if ((arg3 & 0x4) != 0) {
            arg4.field9761 = arg2.method2938((byte) -67);
            if (arg4.field4668 == 0) {
                arg4.method2099(arg4.field9761, 47);
                arg4.field9761 = -1;
            }
        }
        if ((arg3 & 0x10000) != 0) {
            arg4.field9777 = arg2.method2944((byte) 4) == 1;
        }
        if ((arg3 & 0x40000) != 0) {
            int var11 = arg2.method2938((byte) -67);
            if (var11 == 65535) {
                var11 = -1;
            }
            int var12 = arg2.method2962(0);
            int var13 = arg2.method2964((byte) 114);
            int var14 = var13 & 0x7;
            int var15 = var13 >> 3 & 0xF;
            if (var15 == 15) {
                var15 = -1;
            }
            arg4.method2109(var11, -117, var12, var14, var15, 2);
        }
        if ((arg3 & 0x80000) != 0) {
            int var16 = arg2.method2964((byte) 68);
            int[] var17 = new int[var16];
            int[] var18 = new int[var16];
            for (int var19 = 0; var19 < var16; var19++) {
                int var20 = arg2.method2982(-1);
                if ((var20 & 0xC000) == 49152) {
                    int var21 = arg2.method2974((byte) -39);
                    var17[var19] = class746.method4158(var21, var20 << 16);
                } else {
                    var17[var19] = var20;
                }
                var18[var19] = arg2.method2938((byte) -67);
            }
            arg4.method2100((byte) -47, var17, var18);
        }
        if ((arg3 & 0x200) != 0) {
            int var22 = arg2.method2986(-20802);
            int[] var23 = new int[var22];
            int[] var24 = new int[var22];
            int[] var25 = new int[var22];
            for (int var26 = 0; var26 < var22; var26++) {
                int var27 = arg2.method2938((byte) -67);
                if (var27 == 65535) {
                    var27 = -1;
                }
                var23[var26] = var27;
                var24[var26] = arg2.method2964((byte) 96);
                var25[var26] = arg2.method2998(true);
            }
            class393.method2433(9433, arg4, var24, var23, var25);
        }
        if ((arg3 & 0x1000) != 0) {
            arg4.field4586 = arg2.method3004(true);
            arg4.field4591 = arg2.method3004(true);
            arg4.field4655 = arg2.method2943((byte) 16);
            arg4.field4602 = arg2.method2975(false);
            arg4.field4629 = arg2.method2982(-1) + class192.field2961;
            arg4.field4658 = arg2.method2974((byte) -67) + class192.field2961;
            arg4.field4594 = arg2.method2944((byte) 4);
            if (arg4.field9758) {
                arg4.field4586 += arg4.field9784;
                arg4.field4602 += arg4.field9749;
                arg4.field4655 += arg4.field9784;
                arg4.field4591 += arg4.field9749;
                arg4.field4668 = 0;
            } else {
                arg4.field4655 += arg4.field4670[0];
                arg4.field4602 += arg4.field4672[0];
                arg4.field4591 += arg4.field4672[0];
                arg4.field4668 = 1;
                arg4.field4586 += arg4.field4670[0];
            }
            arg4.field4675 = 0;
        }
        if ((arg3 & 0x4000) != 0) {
            int var28 = arg2.method2982(-1);
            int var29 = arg2.method2962(0);
            if (var28 == 65535) {
                var28 = -1;
            }
            int var30 = arg2.method2940((byte) -93);
            int var31 = var30 & 0x7;
            int var32 = var30 >> 3 & 0xF;
            if (var32 == 15) {
                var32 = -1;
            }
            arg4.method2109(var28, -108, var29, var31, var32, 1);
        }
        if ((arg3 & 0x8000) != 0) {
            arg4.field4635 = arg2.method2996(111);
            if (arg4.field4635.charAt(0) == '~') {
                arg4.field4635 = arg4.field4635.substring(1);
                class788.method4313(arg4.method3979(0, false), (byte) 51, arg4.method3976(true, -1), arg4.field4635, 2, 0, arg4.field9753);
            } else if (class210.field3250 == arg4) {
                class788.method4313(arg4.method3979(0, false), (byte) 51, arg4.method3976(true, -1), arg4.field4635, 2, 0, arg4.field9753);
            }
            arg4.field4606 = 0;
            arg4.field4592 = 150;
            arg4.field4639 = 0;
        }
        if ((arg3 & 0x20000) != 0) {
            arg4.field4582 = arg2.method2975(false);
            arg4.field4579 = arg2.method2978(true);
            arg4.field4665 = arg2.method3004(true);
            arg4.field4662 = (byte) arg2.method2944((byte) 4);
            arg4.field4663 = class192.field2961 + arg2.method2938((byte) -67);
            arg4.field4627 = class192.field2961 + arg2.method2938((byte) -67);
        }
        if ((arg3 & 0x400) != 0) {
            int var33 = arg2.method2982(-1);
            arg4.field4596 = arg2.method2964((byte) 81);
            arg4.field4590 = arg2.method2940((byte) -85);
            arg4.field4637 = (var33 & 0x8000) != 0;
            arg4.field4581 = var33 & 0x7FFF;
            arg4.field4660 = arg4.field4581 + arg4.field4596 + class192.field2961;
        }
        if (arg0 > -32) {
            method3382(-126);
        }
        if ((arg3 & 0x40) != 0) {
            int var34 = arg2.method2998(true);
            if (var34 == 65535) {
                var34 = -1;
            }
            arg4.field4584 = var34;
        }
        if ((arg3 & 0x2) != 0) {
            class256.field3766[arg1] = arg2.method2943((byte) 16);
        }
        if ((arg3 & 0x10) != 0) {
            int var35 = arg2.method2986(-20802);
            if (var35 > 0) {
                for (int var36 = 0; var36 < var35; var36++) {
                    int var37 = -1;
                    int var38 = -1;
                    int var39 = arg2.method2993(-126);
                    int var40 = -1;
                    if (var39 == 32767) {
                        var39 = arg2.method2993(-117);
                        var38 = arg2.method2993(-116);
                        var37 = arg2.method2993(51);
                        var40 = arg2.method2993(-97);
                    } else if (var39 == 32766) {
                        var39 = -1;
                    } else {
                        var38 = arg2.method2993(38);
                    }
                    int var41 = arg2.method2993(112);
                    int var42 = arg2.method2940((byte) 114);
                    arg4.method2108(var38, var41, var39, var40, var42, true, class192.field2961, var37);
                }
            }
        }
        if ((arg3 & 0x8) != 0) {
            int[] var43 = new int[4];
            for (int var44 = 0; var44 < 4; var44++) {
                var43[var44] = arg2.method2974((byte) -40);
                if (var43[var44] == 65535) {
                    var43[var44] = -1;
                }
            }
            int var45 = arg2.method2940((byte) 102);
            class749.method4173(var43, 19523, arg4, var45);
        }
        if ((arg3 & 0x1) != 0) {
            int var46 = arg2.method2940((byte) -81);
            byte[] var47 = new byte[var46];
            class494 var48 = new class494(var47);
            arg2.method2989(var47, (byte) 105, var46, 0);
            class85.field932[arg1] = var48;
            arg4.method3969((byte) -86, var48);
        }
        if (!arg4.field9758) {
            return;
        }
        if (var5 == 127) {
            arg4.method3978(arg4.field9784, arg4.field9749, (byte) 125);
            return;
        }
        byte var49;
        if (var5 == -1) {
            var49 = class256.field3766[arg1];
        } else {
            var49 = var5;
        }
        class622.method3587(var49, arg4, -20365);
        arg4.method3968((byte) 102, arg4.field9749, arg4.field9784, var49);
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I[BIIIII[BZ)V", line = 374)
    public static final void method3381(int arg0, byte[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte[] arg7, boolean arg8) {
        field8117++;
        int var9 = -(arg5 >> 2);
        int var10 = -(arg5 & 0x3);
        if (!arg8) {
            field8126 = 48;
        }
        for (int var11 = -arg0; var11 < 0; var11++) {
            int var10001;
            for (int var12 = var9; var12 < 0; var12++) {
                var10001 = arg2++;
                arg1[var10001] += arg7[arg4++];
                int var14 = arg2++;
                arg1[var14] += arg7[arg4++];
                int var15 = arg2++;
                arg1[var15] += arg7[arg4++];
                int var16 = arg2++;
                arg1[var16] += arg7[arg4++];
            }
            for (int var13 = var10; var13 < 0; var13++) {
                var10001 = arg2++;
                arg1[var10001] += arg7[arg4++];
            }
            arg4 += arg6;
            arg2 += arg3;
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(I)V", line = 425)
    public static final void method3382(int arg0) {
        if (arg0 > -8) {
            method3382(5);
        }
        field8115++;
        for (class184 var1 = (class184) class115.field1750.method1731((byte) -123); var1 != null; var1 = (class184) class115.field1750.method1724(0)) {
            class120 var2 = var1.field2825;
            if (var2.field1882 < class192.field2961) {
                var1.method3387((byte) -114);
                var2.method914(true);
            } else if (class192.field2961 >= var2.field1861) {
                var2.method911((byte) 125);
                if (var2.field1877 > 0) {
                    class205 var3 = (class205) class645.field9014.method2242((long) (var2.field1877 - 1), -1);
                    if (var3 != null) {
                        class665 var4 = var3.field3181;
                        if (var4.field5742 >= 0 && (class768.field10571 * 512) > var4.field5742 && var4.field5746 >= 0 && class350.field4898 * 512 > var4.field5746) {
                            var2.method904(2048, class192.field2961, var4.field5742, class702.method3970(var4.field5742, var2.field5755, -20103, var4.field5746) - var2.field1856, var4.field5746);
                        }
                    }
                }
                if (var2.field1877 < 0) {
                    int var5 = -var2.field1877 - 1;
                    class702 var6;
                    if (class250.field3689 == var5) {
                        var6 = class210.field3250;
                    } else {
                        var6 = class767.field10560[var5];
                    }
                    if (var6 != null && var6.field5742 >= 0 && class768.field10571 * 512 > var6.field5742 && var6.field5746 >= 0 && var6.field5746 < (class350.field4898 * 512)) {
                        var2.method904(2048, class192.field2961, var6.field5742, class702.method3970(var6.field5742, var2.field5755, -20103, var6.field5746) - var2.field1856, var6.field5746);
                    }
                }
                var2.method900(67, class471.field6608);
                class490.method2926(var2, true);
            }
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BLso;)V", line = 493)
    public final void method3383(byte arg0, class494 arg1) {
        field8112++;
        while (true) {
            int var3 = arg1.method2964((byte) 97);
            if (var3 == 0) {
                if (arg0 < 54) {
                    method3385(-80);
                    return;
                } else {
                    return;
                }
            }
            this.method3384((byte) -127, var3, arg1);
        }
    }

    @OriginalMember(owner = "client!nl", name = "a", descriptor = "(BILso;)V", line = 523)
    private final void method3384(byte arg0, int arg1, class494 arg2) {
        if (arg1 == 1) {
            this.field8121 = arg2.method2998(true);
        } else if (arg1 == 2) {
            this.field8122 = new int[arg2.method2964((byte) 74)];
            for (int var4 = 0; var4 < this.field8122.length; var4++) {
                this.field8122[var4] = arg2.method2998(true);
            }
        } else if (arg1 == 3) {
            this.field8116 = arg2.method2964((byte) 118);
        }
        if (arg0 <= -105) {
            field8118++;
        }
    }

    @OriginalMember(owner = "client!nl", name = "b", descriptor = "(I)V", line = 564)
    public static void method3385(int arg0) {
        field8119 = null;
        if (arg0 == -1) {
            field8124 = null;
            field8125 = null;
            field8113 = null;
            field8123 = null;
        }
    }
}
