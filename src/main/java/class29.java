import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class29 extends class304 {

    @OriginalMember(owner = "client!dl", name = "X", descriptor = "[I")
    private int[] field351 = new int[257];

    @OriginalMember(owner = "client!dl", name = "Y", descriptor = "Lmn;")
    public static class161 field352 = null;

    @OriginalMember(owner = "client!dl", name = "ab", descriptor = "Ljava/lang/String;")
    public static String field354 = "Discard";

    @OriginalMember(owner = "client!dl", name = "bb", descriptor = "Lii;")
    public static class250 field355 = new class250(32);

    @OriginalMember(owner = "client!dl", name = "cb", descriptor = "S")
    public static short field356 = 256;

    @OriginalMember(owner = "client!dl", name = "Q", descriptor = "I")
    public static int field344;

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "I")
    public static int field345;

    @OriginalMember(owner = "client!dl", name = "S", descriptor = "I")
    public static int field346;

    @OriginalMember(owner = "client!dl", name = "T", descriptor = "I")
    public static int field347;

    @OriginalMember(owner = "client!dl", name = "U", descriptor = "I")
    public static int field348;

    @OriginalMember(owner = "client!dl", name = "V", descriptor = "I")
    public static int field349;

    @OriginalMember(owner = "client!dl", name = "W", descriptor = "I")
    public static int field350;

    @OriginalMember(owner = "client!dl", name = "Z", descriptor = "[[I")
    private int[][] field353;

    @OriginalMember(owner = "client!dl", name = "e", descriptor = "(B)V", line = 5)
    public static final void method222(byte arg0) {
        if (arg0 < 35) {
            method222((byte) 28);
        }
        if (class209.field3195 != null) {
            class204 var1 = class209.field3195;
            synchronized (class209.field3195) {
                class209.field3195 = null;
            }
        }
        field346++;
    }

    @OriginalMember(owner = "client!dl", name = "f", descriptor = "(I)V", line = 26)
    private final void method223(int arg0) {
        field350++;
        if (arg0 != -8715) {
            this.field353 = (int[][]) ((int[][]) null);
        }
        int var2 = this.field353.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = var3 << 4;
            int var5 = 0;
            for (int var6 = 0; var6 < var2 && var4 >= this.field353[var6][0]; var6++) {
                var5++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var5) {
                int[] var7 = this.field353[var2 - 1];
                var8 = var7[3];
                var9 = var7[2];
                var10 = var7[1];
            } else {
                int[] var11 = this.field353[var5];
                if (var5 <= 0) {
                    var10 = var11[1];
                    var9 = var11[2];
                    var8 = var11[3];
                } else {
                    int[] var12 = this.field353[var5 - 1];
                    int var13 = (var4 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var10 = var11[1] * var13 + (var12[1] * var14) >> 12;
                }
            }
            int var15 = var8 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var9 >> 4;
            int var17 = var10 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            this.field351[var3] = class261.method1835(class261.method1835(var16 << 8, var17 << 16), var15);
        }
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)[[I", line = 130)
    public final int[][] method75(int arg0, int arg1) {
        field344++;
        int[][] var3 = this.field4663.method886(arg0, 3);
        if (this.field4663.field1820) {
            int[] var4 = this.method2086(arg0, 0, (byte) 112);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class218.field3333; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field351[var9];
                var5[var8] = class149.method1117(16711680, var10) >> 12;
                var6[var8] = class149.method1117(var10, 65280) >> 4;
                var7[var8] = class149.method1117(4080, var10 << 4);
            }
        }
        if (arg1 != 0) {
            this.field351 = (int[]) null;
        }
        return var3;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Z)V", line = 180)
    public final void method100(boolean arg0) {
        field349++;
        if (this.field353 == null) {
            this.method224(1, true);
        }
        if (!arg0) {
            field356 = 29;
        }
        this.method223(-8715);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IZ)V", line = 196)
    private final void method224(int arg0, boolean arg1) {
        field348++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field353 = new int[2][4];
                this.field353[0][0] = 0;
                this.field353[0][1] = 0;
                this.field353[0][3] = 0;
                this.field353[1][1] = 4096;
                this.field353[0][2] = 0;
                this.field353[1][3] = 4096;
                this.field353[1][2] = 4096;
                this.field353[1][0] = 4096;
            } else if (arg0 == 2) {
                this.field353 = new int[8][4];
                this.field353[0][2] = 2602;
                this.field353[0][1] = 2650;
                this.field353[0][0] = 0;
                this.field353[1][1] = 2313;
                this.field353[2][1] = 2618;
                this.field353[1][2] = 1799;
                this.field353[1][0] = 2867;
                this.field353[2][0] = 3072;
                this.field353[3][1] = 2296;
                this.field353[4][1] = 2072;
                this.field353[5][1] = 2730;
                this.field353[3][0] = 3276;
                this.field353[0][3] = 2361;
                this.field353[6][1] = 2232;
                this.field353[4][0] = 3481;
                this.field353[7][1] = 1686;
                this.field353[2][2] = 1734;
                this.field353[3][2] = 1220;
                this.field353[1][3] = 1558;
                this.field353[5][0] = 3686;
                this.field353[4][2] = 963;
                this.field353[5][2] = 2152;
                this.field353[6][0] = 3891;
                this.field353[7][0] = 4096;
                this.field353[6][2] = 1060;
                this.field353[2][3] = 1413;
                this.field353[7][2] = 1413;
                this.field353[3][3] = 947;
                this.field353[4][3] = 722;
                this.field353[5][3] = 1766;
                this.field353[6][3] = 915;
                this.field353[7][3] = 1140;
            } else if (arg0 == 3) {
                this.field353 = new int[7][4];
                this.field353[0][1] = 0;
                this.field353[0][2] = 0;
                this.field353[0][0] = 0;
                this.field353[0][3] = 4096;
                this.field353[1][3] = 4096;
                this.field353[1][2] = 4096;
                this.field353[2][2] = 4096;
                this.field353[2][3] = 0;
                this.field353[3][3] = 0;
                this.field353[1][0] = 663;
                this.field353[1][1] = 0;
                this.field353[2][1] = 0;
                this.field353[3][2] = 4096;
                this.field353[4][2] = 0;
                this.field353[2][0] = 1363;
                this.field353[3][1] = 4096;
                this.field353[4][1] = 4096;
                this.field353[5][1] = 4096;
                this.field353[5][2] = 0;
                this.field353[6][1] = 0;
                this.field353[3][0] = 2048;
                this.field353[6][2] = 0;
                this.field353[4][0] = 2727;
                this.field353[5][0] = 3411;
                this.field353[4][3] = 0;
                this.field353[5][3] = 4096;
                this.field353[6][3] = 4096;
                this.field353[6][0] = 4096;
            } else if (arg0 == 4) {
                this.field353 = new int[6][4];
                this.field353[0][1] = 0;
                this.field353[0][0] = 0;
                this.field353[1][1] = 0;
                this.field353[1][0] = 1843;
                this.field353[2][0] = 2457;
                this.field353[3][0] = 2781;
                this.field353[4][0] = 3481;
                this.field353[0][2] = 0;
                this.field353[1][2] = 0;
                this.field353[5][0] = 4096;
                this.field353[0][3] = 0;
                this.field353[2][2] = 0;
                this.field353[3][2] = 1124;
                this.field353[4][2] = 3084;
                this.field353[1][3] = 1493;
                this.field353[2][1] = 0;
                this.field353[5][2] = 4096;
                this.field353[2][3] = 2939;
                this.field353[3][1] = 0;
                this.field353[4][1] = 546;
                this.field353[3][3] = 3565;
                this.field353[5][1] = 4096;
                this.field353[4][3] = 4031;
                this.field353[5][3] = 4096;
            } else if (arg0 == 5) {
                this.field353 = new int[16][4];
                this.field353[0][1] = 80;
                this.field353[0][2] = 192;
                this.field353[1][2] = 449;
                this.field353[0][0] = 0;
                this.field353[1][0] = 155;
                this.field353[2][0] = 389;
                this.field353[2][2] = 690;
                this.field353[3][0] = 671;
                this.field353[1][1] = 321;
                this.field353[3][2] = 995;
                this.field353[4][2] = 1397;
                this.field353[5][2] = 1429;
                this.field353[0][3] = 321;
                this.field353[6][2] = 1461;
                this.field353[7][2] = 1525;
                this.field353[4][0] = 897;
                this.field353[8][2] = 1590;
                this.field353[9][2] = 2056;
                this.field353[1][3] = 562;
                this.field353[10][2] = 2586;
                this.field353[2][3] = 803;
                this.field353[5][0] = 1175;
                this.field353[11][2] = 3148;
                this.field353[2][1] = 578;
                this.field353[3][3] = 1140;
                this.field353[6][0] = 1368;
                this.field353[4][3] = 1509;
                this.field353[3][1] = 947;
                this.field353[12][2] = 3710;
                this.field353[13][2] = 3421;
                this.field353[4][1] = 1285;
                this.field353[5][1] = 1525;
                this.field353[14][2] = 3148;
                this.field353[6][1] = 1734;
                this.field353[7][1] = 1413;
                this.field353[15][2] = 2505;
                this.field353[8][1] = 1108;
                this.field353[7][0] = 1507;
                this.field353[5][3] = 1413;
                this.field353[8][0] = 1736;
                this.field353[9][0] = 2088;
                this.field353[9][1] = 1766;
                this.field353[10][0] = 2355;
                this.field353[6][3] = 1333;
                this.field353[7][3] = 1702;
                this.field353[8][3] = 2056;
                this.field353[9][3] = 2666;
                this.field353[11][0] = 2691;
                this.field353[12][0] = 3031;
                this.field353[13][0] = 3522;
                this.field353[14][0] = 3727;
                this.field353[10][1] = 2409;
                this.field353[15][0] = 4096;
                this.field353[11][1] = 3116;
                this.field353[12][1] = 3806;
                this.field353[13][1] = 3437;
                this.field353[14][1] = 3116;
                this.field353[10][3] = 3276;
                this.field353[11][3] = 3228;
                this.field353[12][3] = 3196;
                this.field353[13][3] = 3019;
                this.field353[15][1] = 2377;
                this.field353[14][3] = 3228;
                this.field353[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field353 = new int[4][4];
                this.field353[0][2] = 4096;
                this.field353[0][0] = 2048;
                this.field353[0][3] = 0;
                this.field353[1][3] = 0;
                this.field353[2][3] = 0;
                this.field353[1][2] = 4096;
                this.field353[3][3] = 0;
                this.field353[0][1] = 0;
                this.field353[2][2] = 4096;
                this.field353[1][0] = 2867;
                this.field353[1][1] = 4096;
                this.field353[2][0] = 3276;
                this.field353[3][0] = 4096;
                this.field353[3][2] = 0;
                this.field353[2][1] = 4096;
                this.field353[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (!arg1) {
            field345 = 112;
        }
    }

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "(I)V", line = 447)
    public static void method225(int arg0) {
        field354 = null;
        field355 = null;
        field352 = null;
        int var1 = -121 % ((1 - arg0) / 44);
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "()V", line = 463)
    public class29() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lwm;II)V", line = 475)
    public final void method69(class254 arg0, int arg1, int arg2) {
        if (arg1 == 0) {
            int var4 = arg0.method1774((byte) -127);
            if (var4 == 0) {
                this.field353 = new int[arg0.method1774((byte) -123)][4];
                for (int var5 = 0; var5 < this.field353.length; var5++) {
                    this.field353[var5][0] = arg0.method1755(false);
                    this.field353[var5][1] = arg0.method1774((byte) -98) << 4;
                    this.field353[var5][2] = arg0.method1774((byte) -128) << 4;
                    this.field353[var5][3] = arg0.method1774((byte) 51) << 4;
                }
            } else {
                this.method224(var4, true);
            }
        }
        if (arg2 != -2828) {
            this.method223(95);
        }
        field347++;
    }
}
