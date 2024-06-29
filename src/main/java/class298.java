import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!s")
public class class298 extends class313 {

    @OriginalMember(owner = "client!s", name = "V", descriptor = "[I")
    private int[] field4758 = new int[257];

    @OriginalMember(owner = "client!s", name = "U", descriptor = "[I")
    public static int[] field4757 = new int[256];

    @OriginalMember(owner = "client!s", name = "I", descriptor = "I")
    public static int field4745;

    @OriginalMember(owner = "client!s", name = "J", descriptor = "I")
    public static int field4746;

    @OriginalMember(owner = "client!s", name = "L", descriptor = "I")
    public static int field4748;

    @OriginalMember(owner = "client!s", name = "N", descriptor = "I")
    public static int field4750;

    @OriginalMember(owner = "client!s", name = "P", descriptor = "I")
    public static int field4752;

    @OriginalMember(owner = "client!s", name = "Q", descriptor = "I")
    public static int field4753;

    @OriginalMember(owner = "client!s", name = "R", descriptor = "I")
    public static int field4754;

    @OriginalMember(owner = "client!s", name = "S", descriptor = "I")
    public static int field4755;

    @OriginalMember(owner = "client!s", name = "T", descriptor = "I")
    public static int field4756;

    @OriginalMember(owner = "client!s", name = "K", descriptor = "[I")
    public static int[] field4747;

    @OriginalMember(owner = "client!s", name = "O", descriptor = "[[I")
    private int[][] field4751;

    @OriginalMember(owner = "client!s", name = "M", descriptor = "[[Lbl;")
    public static class337[][] field4749;

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(B)V", line = 9)
    public static void method2029(byte arg0) {
        if (arg0 != -24) {
            method2029((byte) -104);
        }
        field4749 = (class337[][]) null;
        field4747 = null;
        field4757 = null;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(ZI)V", line = 21)
    private final void method2030(boolean arg0, int arg1) {
        field4755++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field4751 = new int[2][4];
                this.field4751[0][3] = 0;
                this.field4751[0][0] = 0;
                this.field4751[1][0] = 4096;
                this.field4751[1][3] = 4096;
                this.field4751[0][2] = 0;
                this.field4751[1][2] = 4096;
                this.field4751[0][1] = 0;
                this.field4751[1][1] = 4096;
            } else if (arg1 == 2) {
                this.field4751 = new int[8][4];
                this.field4751[0][1] = 2650;
                this.field4751[1][1] = 2313;
                this.field4751[0][0] = 0;
                this.field4751[0][2] = 2602;
                this.field4751[0][3] = 2361;
                this.field4751[2][1] = 2618;
                this.field4751[1][2] = 1799;
                this.field4751[3][1] = 2296;
                this.field4751[2][2] = 1734;
                this.field4751[1][3] = 1558;
                this.field4751[2][3] = 1413;
                this.field4751[3][2] = 1220;
                this.field4751[1][0] = 2867;
                this.field4751[4][1] = 2072;
                this.field4751[2][0] = 3072;
                this.field4751[3][0] = 3276;
                this.field4751[5][1] = 2730;
                this.field4751[6][1] = 2232;
                this.field4751[4][0] = 3481;
                this.field4751[4][2] = 963;
                this.field4751[5][0] = 3686;
                this.field4751[5][2] = 2152;
                this.field4751[7][1] = 1686;
                this.field4751[6][2] = 1060;
                this.field4751[6][0] = 3891;
                this.field4751[3][3] = 947;
                this.field4751[7][2] = 1413;
                this.field4751[7][0] = 4096;
                this.field4751[4][3] = 722;
                this.field4751[5][3] = 1766;
                this.field4751[6][3] = 915;
                this.field4751[7][3] = 1140;
            } else if (arg1 == 3) {
                this.field4751 = new int[7][4];
                this.field4751[0][2] = 0;
                this.field4751[0][3] = 4096;
                this.field4751[1][2] = 4096;
                this.field4751[2][2] = 4096;
                this.field4751[0][0] = 0;
                this.field4751[0][1] = 0;
                this.field4751[3][2] = 4096;
                this.field4751[4][2] = 0;
                this.field4751[1][3] = 4096;
                this.field4751[5][2] = 0;
                this.field4751[1][1] = 0;
                this.field4751[2][3] = 0;
                this.field4751[6][2] = 0;
                this.field4751[2][1] = 0;
                this.field4751[3][1] = 4096;
                this.field4751[1][0] = 663;
                this.field4751[3][3] = 0;
                this.field4751[4][3] = 0;
                this.field4751[2][0] = 1363;
                this.field4751[3][0] = 2048;
                this.field4751[5][3] = 4096;
                this.field4751[4][1] = 4096;
                this.field4751[4][0] = 2727;
                this.field4751[6][3] = 4096;
                this.field4751[5][1] = 4096;
                this.field4751[5][0] = 3411;
                this.field4751[6][0] = 4096;
                this.field4751[6][1] = 0;
            } else if (arg1 == 4) {
                this.field4751 = new int[6][4];
                this.field4751[0][1] = 0;
                this.field4751[0][2] = 0;
                this.field4751[1][1] = 0;
                this.field4751[0][3] = 0;
                this.field4751[1][2] = 0;
                this.field4751[1][3] = 1493;
                this.field4751[0][0] = 0;
                this.field4751[2][1] = 0;
                this.field4751[2][3] = 2939;
                this.field4751[3][3] = 3565;
                this.field4751[4][3] = 4031;
                this.field4751[1][0] = 1843;
                this.field4751[2][2] = 0;
                this.field4751[5][3] = 4096;
                this.field4751[3][2] = 1124;
                this.field4751[4][2] = 3084;
                this.field4751[5][2] = 4096;
                this.field4751[2][0] = 2457;
                this.field4751[3][1] = 0;
                this.field4751[4][1] = 546;
                this.field4751[5][1] = 4096;
                this.field4751[3][0] = 2781;
                this.field4751[4][0] = 3481;
                this.field4751[5][0] = 4096;
            } else if (arg1 == 5) {
                this.field4751 = new int[16][4];
                this.field4751[0][0] = 0;
                this.field4751[0][2] = 192;
                this.field4751[0][1] = 80;
                this.field4751[1][2] = 449;
                this.field4751[1][0] = 155;
                this.field4751[2][0] = 389;
                this.field4751[0][3] = 321;
                this.field4751[2][2] = 690;
                this.field4751[1][1] = 321;
                this.field4751[2][1] = 578;
                this.field4751[3][1] = 947;
                this.field4751[1][3] = 562;
                this.field4751[3][2] = 995;
                this.field4751[2][3] = 803;
                this.field4751[3][3] = 1140;
                this.field4751[4][3] = 1509;
                this.field4751[4][1] = 1285;
                this.field4751[5][3] = 1413;
                this.field4751[5][1] = 1525;
                this.field4751[6][3] = 1333;
                this.field4751[4][2] = 1397;
                this.field4751[7][3] = 1702;
                this.field4751[3][0] = 671;
                this.field4751[4][0] = 897;
                this.field4751[6][1] = 1734;
                this.field4751[7][1] = 1413;
                this.field4751[5][0] = 1175;
                this.field4751[8][1] = 1108;
                this.field4751[6][0] = 1368;
                this.field4751[8][3] = 2056;
                this.field4751[9][3] = 2666;
                this.field4751[9][1] = 1766;
                this.field4751[10][3] = 3276;
                this.field4751[5][2] = 1429;
                this.field4751[6][2] = 1461;
                this.field4751[11][3] = 3228;
                this.field4751[7][2] = 1525;
                this.field4751[7][0] = 1507;
                this.field4751[12][3] = 3196;
                this.field4751[8][2] = 1590;
                this.field4751[10][1] = 2409;
                this.field4751[8][0] = 1736;
                this.field4751[9][0] = 2088;
                this.field4751[13][3] = 3019;
                this.field4751[14][3] = 3228;
                this.field4751[9][2] = 2056;
                this.field4751[10][2] = 2586;
                this.field4751[10][0] = 2355;
                this.field4751[11][0] = 2691;
                this.field4751[11][2] = 3148;
                this.field4751[12][2] = 3710;
                this.field4751[11][1] = 3116;
                this.field4751[12][0] = 3031;
                this.field4751[13][2] = 3421;
                this.field4751[15][3] = 2746;
                this.field4751[12][1] = 3806;
                this.field4751[13][0] = 3522;
                this.field4751[13][1] = 3437;
                this.field4751[14][2] = 3148;
                this.field4751[14][0] = 3727;
                this.field4751[14][1] = 3116;
                this.field4751[15][0] = 4096;
                this.field4751[15][2] = 2505;
                this.field4751[15][1] = 2377;
            } else if (arg1 == 6) {
                this.field4751 = new int[4][4];
                this.field4751[0][3] = 0;
                this.field4751[1][3] = 0;
                this.field4751[0][1] = 0;
                this.field4751[1][1] = 4096;
                this.field4751[2][3] = 0;
                this.field4751[3][3] = 0;
                this.field4751[2][1] = 4096;
                this.field4751[0][0] = 2048;
                this.field4751[3][1] = 4096;
                this.field4751[0][2] = 4096;
                this.field4751[1][0] = 2867;
                this.field4751[1][2] = 4096;
                this.field4751[2][0] = 3276;
                this.field4751[3][0] = 4096;
                this.field4751[2][2] = 4096;
                this.field4751[3][2] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (!arg0) {
            field4747 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!s", name = "g", descriptor = "(I)V", line = 277)
    private final void method2031(int arg0) {
        field4756++;
        int var2 = this.field4751.length;
        if (var2 <= arg0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field4751[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 > var4) {
                int[] var7 = this.field4751[var4];
                if (var4 <= 0) {
                    var8 = var7[3];
                    var9 = var7[2];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field4751[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                    var10 = var7[1] * var12 + (var11[1] * var13) >> 12;
                    var8 = var7[3] * var12 + var11[3] * var13 >> 12;
                }
            } else {
                int[] var14 = this.field4751[var2 - 1];
                var8 = var14[3];
                var10 = var14[1];
                var9 = var14[2];
            }
            int var15 = var9 >> 4;
            int var16 = var10 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field4758[var3] = class144.method1159(var17, class144.method1159(var15 << 8, var16 << 16));
        }
    }

    @OriginalMember(owner = "client!s", name = "<init>", descriptor = "()V", line = 388)
    public class298() {
        super(1, false);
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(II)[[I", line = 394)
    public final int[][] method299(int arg0, int arg1) {
        if (arg1 != 2) {
            this.method299(-80, -64);
        }
        field4748++;
        int[][] var3 = this.field4958.method2404(arg0, (byte) 122);
        if (this.field4958.field5463) {
            int[] var4 = this.method2156(0, true, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class133.field2269; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4758[var9];
                var5[var8] = class36.method319(16711680, var10) >> 12;
                var6[var8] = class36.method319(65280, var10) >> 4;
                var7[var8] = class36.method319(255, var10) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!s", name = "a", descriptor = "(IILpi;)V", line = 449)
    public final void method185(int arg0, int arg1, class336 arg2) {
        field4752++;
        if (arg0 == 0) {
            int var4 = arg2.method2364(arg1 ^ 0x66DB);
            if (var4 == 0) {
                this.field4751 = new int[arg2.method2364(-9069)][4];
                for (int var5 = 0; var5 < this.field4751.length; var5++) {
                    this.field4751[var5][0] = arg2.method2339((byte) -46);
                    this.field4751[var5][1] = arg2.method2364(arg1 + 8779) << 4;
                    this.field4751[var5][2] = arg2.method2364(-9069) << 4;
                    this.field4751[var5][3] = arg2.method2364(arg1 + 8779) << 4;
                }
            } else {
                this.method2030(true, var4);
            }
        }
        if (arg1 != -17848) {
            this.method182(-111);
        }
    }

    @OriginalMember(owner = "client!s", name = "c", descriptor = "(I)V", line = 489)
    public final void method182(int arg0) {
        if (this.field4751 == null) {
            this.method2030(true, 1);
        }
        if (arg0 != 25833) {
            this.method2030(false, 96);
        }
        field4745++;
        this.method2031(arg0 - 25833);
    }
}
