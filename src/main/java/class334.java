import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lc")
public class class334 extends class27 {

    @OriginalMember(owner = "client!lc", name = "R", descriptor = "[I")
    private int[] field5208 = new int[257];

    @OriginalMember(owner = "client!lc", name = "K", descriptor = "I")
    public static int field5201;

    @OriginalMember(owner = "client!lc", name = "L", descriptor = "I")
    public static int field5202;

    @OriginalMember(owner = "client!lc", name = "M", descriptor = "I")
    public static int field5203;

    @OriginalMember(owner = "client!lc", name = "N", descriptor = "I")
    public static int field5204;

    @OriginalMember(owner = "client!lc", name = "O", descriptor = "I")
    public static int field5205;

    @OriginalMember(owner = "client!lc", name = "Q", descriptor = "I")
    public static int field5207;

    @OriginalMember(owner = "client!lc", name = "S", descriptor = "I")
    public static int field5209;

    @OriginalMember(owner = "client!lc", name = "T", descriptor = "I")
    public static int field5210;

    @OriginalMember(owner = "client!lc", name = "U", descriptor = "I")
    public static int field5211;

    @OriginalMember(owner = "client!lc", name = "V", descriptor = "I")
    public static int field5212;

    @OriginalMember(owner = "client!lc", name = "P", descriptor = "[[I")
    private int[][] field5206;

    @OriginalMember(owner = "client!lc", name = "g", descriptor = "(I)V", line = 4)
    private final void method2356(int arg0) {
        field5207++;
        if (arg0 <= 92) {
            this.field5206 = (int[][]) ((int[][]) null);
        }
        int var2 = this.field5206.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && this.field5206[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var4) {
                int[] var7 = this.field5206[var2 - 1];
                var8 = var7[1];
                var9 = var7[2];
                var10 = var7[3];
            } else {
                int[] var11 = this.field5206[var4];
                if (var4 <= 0) {
                    var8 = var11[1];
                    var9 = var11[2];
                    var10 = var11[3];
                } else {
                    int[] var12 = this.field5206[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var8 = var11[1] * var13 + var12[1] * var14 >> 12;
                }
            }
            int var15 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var8 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field5208[var3] = class81.method666(class81.method666(var17 << 8, var16 << 16), var15);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Z)V", line = 110)
    public static final void method2357(boolean arg0) {
        class265.field4049.method462(24);
        if (!arg0) {
            field5202 = 16;
        }
        field5203++;
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(ILsb;I)V", line = 121)
    public final void method23(int arg0, class190 arg1, int arg2) {
        if (arg0 != -5836) {
            return;
        }
        field5212++;
        if (arg2 != 0) {
            return;
        }
        int var4 = arg1.method1319(255);
        if (var4 != 0) {
            this.method2358(103, var4);
            return;
        }
        this.field5206 = new int[arg1.method1319(255)][4];
        for (int var5 = 0; var5 < this.field5206.length; var5++) {
            this.field5206[var5][0] = arg1.method1317((byte) 103);
            this.field5206[var5][1] = arg1.method1319(255) << 4;
            this.field5206[var5][2] = arg1.method1319(255) << 4;
            this.field5206[var5][3] = arg1.method1319(255) << 4;
        }
    }

    @OriginalMember(owner = "client!lc", name = "<init>", descriptor = "()V", line = 160)
    public class334() {
        super(1, false);
    }

    @OriginalMember(owner = "client!lc", name = "f", descriptor = "(I)V", line = 167)
    public final void method22(int arg0) {
        if (this.field5206 == null) {
            this.method2358(92, 1);
        }
        if (arg0 < -63) {
            this.method2356(122);
            field5211++;
        }
    }

    @OriginalMember(owner = "client!lc", name = "b", descriptor = "(II)V", line = 181)
    private final void method2358(int arg0, int arg1) {
        field5210++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field5206 = new int[2][4];
                this.field5206[0][1] = 0;
                this.field5206[1][1] = 4096;
                this.field5206[0][2] = 0;
                this.field5206[0][0] = 0;
                this.field5206[0][3] = 0;
                this.field5206[1][3] = 4096;
                this.field5206[1][2] = 4096;
                this.field5206[1][0] = 4096;
            } else if (arg1 == 2) {
                this.field5206 = new int[8][4];
                this.field5206[0][2] = 2602;
                this.field5206[1][2] = 1799;
                this.field5206[0][1] = 2650;
                this.field5206[2][2] = 1734;
                this.field5206[1][1] = 2313;
                this.field5206[2][1] = 2618;
                this.field5206[0][0] = 0;
                this.field5206[3][1] = 2296;
                this.field5206[0][3] = 2361;
                this.field5206[1][0] = 2867;
                this.field5206[4][1] = 2072;
                this.field5206[5][1] = 2730;
                this.field5206[3][2] = 1220;
                this.field5206[4][2] = 963;
                this.field5206[1][3] = 1558;
                this.field5206[2][3] = 1413;
                this.field5206[2][0] = 3072;
                this.field5206[5][2] = 2152;
                this.field5206[3][0] = 3276;
                this.field5206[6][1] = 2232;
                this.field5206[7][1] = 1686;
                this.field5206[6][2] = 1060;
                this.field5206[7][2] = 1413;
                this.field5206[3][3] = 947;
                this.field5206[4][3] = 722;
                this.field5206[5][3] = 1766;
                this.field5206[4][0] = 3481;
                this.field5206[6][3] = 915;
                this.field5206[7][3] = 1140;
                this.field5206[5][0] = 3686;
                this.field5206[6][0] = 3891;
                this.field5206[7][0] = 4096;
            } else if (arg1 == 3) {
                this.field5206 = new int[7][4];
                this.field5206[0][1] = 0;
                this.field5206[0][3] = 4096;
                this.field5206[1][1] = 0;
                this.field5206[0][0] = 0;
                this.field5206[0][2] = 0;
                this.field5206[1][3] = 4096;
                this.field5206[2][3] = 0;
                this.field5206[2][1] = 0;
                this.field5206[1][2] = 4096;
                this.field5206[2][2] = 4096;
                this.field5206[1][0] = 663;
                this.field5206[3][2] = 4096;
                this.field5206[3][3] = 0;
                this.field5206[3][1] = 4096;
                this.field5206[4][2] = 0;
                this.field5206[4][3] = 0;
                this.field5206[5][3] = 4096;
                this.field5206[5][2] = 0;
                this.field5206[2][0] = 1363;
                this.field5206[4][1] = 4096;
                this.field5206[5][1] = 4096;
                this.field5206[3][0] = 2048;
                this.field5206[6][2] = 0;
                this.field5206[4][0] = 2727;
                this.field5206[5][0] = 3411;
                this.field5206[6][0] = 4096;
                this.field5206[6][1] = 0;
                this.field5206[6][3] = 4096;
            } else if (arg1 == 4) {
                this.field5206 = new int[6][4];
                this.field5206[0][2] = 0;
                this.field5206[0][0] = 0;
                this.field5206[1][2] = 0;
                this.field5206[0][3] = 0;
                this.field5206[1][3] = 1493;
                this.field5206[2][3] = 2939;
                this.field5206[0][1] = 0;
                this.field5206[2][2] = 0;
                this.field5206[3][3] = 3565;
                this.field5206[3][2] = 1124;
                this.field5206[4][2] = 3084;
                this.field5206[5][2] = 4096;
                this.field5206[1][0] = 1843;
                this.field5206[4][3] = 4031;
                this.field5206[1][1] = 0;
                this.field5206[2][1] = 0;
                this.field5206[2][0] = 2457;
                this.field5206[3][1] = 0;
                this.field5206[5][3] = 4096;
                this.field5206[3][0] = 2781;
                this.field5206[4][0] = 3481;
                this.field5206[5][0] = 4096;
                this.field5206[4][1] = 546;
                this.field5206[5][1] = 4096;
            } else if (arg1 == 5) {
                this.field5206 = new int[16][4];
                this.field5206[0][1] = 80;
                this.field5206[0][0] = 0;
                this.field5206[0][3] = 321;
                this.field5206[1][0] = 155;
                this.field5206[0][2] = 192;
                this.field5206[1][2] = 449;
                this.field5206[2][2] = 690;
                this.field5206[1][3] = 562;
                this.field5206[2][3] = 803;
                this.field5206[1][1] = 321;
                this.field5206[2][0] = 389;
                this.field5206[3][3] = 1140;
                this.field5206[3][0] = 671;
                this.field5206[4][3] = 1509;
                this.field5206[3][2] = 995;
                this.field5206[4][2] = 1397;
                this.field5206[4][0] = 897;
                this.field5206[5][0] = 1175;
                this.field5206[5][3] = 1413;
                this.field5206[6][3] = 1333;
                this.field5206[2][1] = 578;
                this.field5206[3][1] = 947;
                this.field5206[7][3] = 1702;
                this.field5206[8][3] = 2056;
                this.field5206[6][0] = 1368;
                this.field5206[7][0] = 1507;
                this.field5206[9][3] = 2666;
                this.field5206[8][0] = 1736;
                this.field5206[5][2] = 1429;
                this.field5206[6][2] = 1461;
                this.field5206[10][3] = 3276;
                this.field5206[11][3] = 3228;
                this.field5206[12][3] = 3196;
                this.field5206[13][3] = 3019;
                this.field5206[14][3] = 3228;
                this.field5206[9][0] = 2088;
                this.field5206[15][3] = 2746;
                this.field5206[4][1] = 1285;
                this.field5206[5][1] = 1525;
                this.field5206[6][1] = 1734;
                this.field5206[7][1] = 1413;
                this.field5206[10][0] = 2355;
                this.field5206[7][2] = 1525;
                this.field5206[8][2] = 1590;
                this.field5206[8][1] = 1108;
                this.field5206[11][0] = 2691;
                this.field5206[9][2] = 2056;
                this.field5206[9][1] = 1766;
                this.field5206[10][2] = 2586;
                this.field5206[12][0] = 3031;
                this.field5206[11][2] = 3148;
                this.field5206[12][2] = 3710;
                this.field5206[13][2] = 3421;
                this.field5206[10][1] = 2409;
                this.field5206[11][1] = 3116;
                this.field5206[13][0] = 3522;
                this.field5206[14][2] = 3148;
                this.field5206[15][2] = 2505;
                this.field5206[14][0] = 3727;
                this.field5206[12][1] = 3806;
                this.field5206[13][1] = 3437;
                this.field5206[15][0] = 4096;
                this.field5206[14][1] = 3116;
                this.field5206[15][1] = 2377;
            } else if (arg1 == 6) {
                this.field5206 = new int[4][4];
                this.field5206[0][2] = 4096;
                this.field5206[1][2] = 4096;
                this.field5206[0][0] = 2048;
                this.field5206[2][2] = 4096;
                this.field5206[3][2] = 0;
                this.field5206[0][3] = 0;
                this.field5206[1][3] = 0;
                this.field5206[1][0] = 2867;
                this.field5206[2][3] = 0;
                this.field5206[0][1] = 0;
                this.field5206[3][3] = 0;
                this.field5206[1][1] = 4096;
                this.field5206[2][1] = 4096;
                this.field5206[2][0] = 3276;
                this.field5206[3][0] = 4096;
                this.field5206[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 < 89) {
            field5202 = -71;
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(Lo;IIIIII)V", line = 441)
    public static final void method2359(class96 arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        long var7 = 0L;
        field5209++;
        if (arg2 == 0) {
            var7 = class62.method503(arg3, arg4, arg1);
        } else if (arg2 == 1) {
            var7 = class2.method14(arg3, arg4, arg1);
        } else if (arg2 == 2) {
            var7 = class85.method693(arg3, arg4, arg1);
        } else if (arg2 == 3) {
            var7 = class313.method2191(arg3, arg4, arg1);
        }
        boolean var9 = true;
        int var10 = (int) (var7 >>> 32) & Integer.MAX_VALUE;
        boolean var11 = false;
        boolean var12 = false;
        int var13 = (int) var7 >> 14 & 0x1F;
        int var14 = ((int) var7 & 0x394F67) >> 20;
        class261 var15 = class30.method212(arg6 ^ arg6, var10);
        if (var15.method1921((byte) -107)) {
            class308.method2167(arg3, arg4, (byte) 110, arg1, var15);
        }
        if (var7 == 0L) {
            return;
        }
        class111 var16 = null;
        class111 var17 = null;
        if (arg2 == 0) {
            class11 var21 = class261.method1934(arg3, arg4, arg1);
            if (var21 != null) {
                var16 = var21.field165;
                var17 = var21.field174;
            }
            if (var15.field3957 != 0) {
                arg0.method746(!var15.field3945, var14, arg4, var13, var15.field3888, arg1, arg6 - 52);
            }
        } else if (arg2 == 1) {
            class94 var20 = class310.method2181(arg3, arg4, arg1);
            if (var20 != null) {
                var17 = var20.field1317;
                var16 = var20.field1313;
            }
        } else if (arg2 == 2) {
            class180 var18 = class255.method1872(arg3, arg4, arg1);
            if (var18 != null) {
                var16 = var18.field2591;
            }
            if (var15.field3957 != 0 && var15.field3962 + arg4 < 104 && (var15.field3962 + arg1) < 104 && arg4 + var15.field3907 < 104 && (var15.field3907 + arg1) < 104) {
                arg0.method750(var15.field3888, (byte) 123, var15.field3907, arg4, arg1, !var15.field3945, var15.field3962, var14);
            }
        } else if (arg2 == 3) {
            class85 var19 = class347.method2437(arg3, arg4, arg1);
            if (var19 != null) {
                var16 = var19.field1202;
            }
            if (var15.field3957 == 1) {
                arg0.method757(arg4, arg1, true);
            }
        }
        if (var15.field3895 != null) {
            var15 = var15.method1925(arg6 ^ 0x5B);
        }
        if (!class141.field2031 || var15 == null || !var15.field3905) {
            return;
        }
        if (var13 == 2) {
            if (var16 instanceof class149) {
                ((class149) var16).method1058((byte) 30);
            } else {
                class18.method114(arg5, var15, (byte) -109, var14 + 4, arg1, arg4, 0, 0, var13);
            }
            if (var17 instanceof class149) {
                ((class149) var17).method1058((byte) 23);
            } else {
                class18.method114(arg5, var15, (byte) -107, var14 + 1 & 0x3, arg1, arg4, 0, 0, var13);
            }
        } else if (var13 == 5) {
            if (var16 instanceof class149) {
                ((class149) var16).method1058((byte) 85);
            } else {
                class18.method114(arg5, var15, (byte) -125, var14, arg1, arg4, class81.field1170[var14] * 8, class91.field1262[var14] * 8, 4);
            }
        } else if (var13 == 6) {
            if ((var16 instanceof class149)) {
                ((class149) var16).method1058((byte) 22);
            } else {
                class18.method114(arg5, var15, (byte) -108, var14 + 4, arg1, arg4, class236.field3551[var14] * 8, class99.field1402[var14] * 8, 4);
            }
        } else if (var13 == 7) {
            if ((var16 instanceof class149)) {
                ((class149) var16).method1058((byte) 75);
            } else {
                class18.method114(arg5, var15, (byte) -105, (var14 + 2 & 0x3) + 4, arg1, arg4, 0, 0, 4);
            }
        } else if (var13 == 8) {
            if ((var16 instanceof class149)) {
                ((class149) var16).method1058((byte) 104);
            } else {
                class18.method114(arg5, var15, (byte) 67, var14 + 4, arg1, arg4, class236.field3551[var14] * 8, class99.field1402[var14] * 8, 4);
            }
            if (var17 instanceof class149) {
                ((class149) var17).method1058((byte) 112);
            } else {
                class18.method114(arg5, var15, (byte) -121, (var14 + 2 & 0x3) + 4, arg1, arg4, class236.field3551[var14] * 8, class99.field1402[var14] * 8, 4);
            }
        } else if (var13 == 11) {
            if ((var16 instanceof class149)) {
                ((class149) var16).method1058((byte) 125);
            } else {
                class18.method114(arg5, var15, (byte) -124, var14 + 4, arg1, arg4, 0, 0, 10);
            }
        } else if (var16 instanceof class149) {
            ((class149) var16).method1058((byte) 58);
        } else {
            class18.method114(arg5, var15, (byte) 80, var14, arg1, arg4, 0, 0, var13);
        }
    }

    @OriginalMember(owner = "client!lc", name = "a", descriptor = "(II)[[I", line = 642)
    public final int[][] method19(int arg0, int arg1) {
        if (arg0 != -28941) {
            field5202 = 49;
        }
        int[][] var3 = this.field379.method668(arg1, 0);
        if (this.field379.field1171) {
            int[] var4 = this.method164(arg1, 119, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class209.field3053; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field5208[var9];
                var6[var8] = class287.method2076(var10 >> 12, 4080);
                var5[var8] = class287.method2076(4080, var10 >> 4);
                var7[var8] = class287.method2076(var10 << 4, 4080);
            }
        }
        field5204++;
        return var3;
    }
}
