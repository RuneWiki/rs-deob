import java.util.Random;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cn")
public class class216 extends class110 {

    @OriginalMember(owner = "client!cn", name = "J", descriptor = "[I")
    private int[] field3259 = new int[257];

    @OriginalMember(owner = "client!cn", name = "Q", descriptor = "I")
    public static int field3266 = 0;

    @OriginalMember(owner = "client!cn", name = "G", descriptor = "I")
    public static int field3256 = 0;

    @OriginalMember(owner = "client!cn", name = "L", descriptor = "F")
    public static float field3261;

    @OriginalMember(owner = "client!cn", name = "H", descriptor = "I")
    public static int field3257;

    @OriginalMember(owner = "client!cn", name = "I", descriptor = "I")
    public static int field3258;

    @OriginalMember(owner = "client!cn", name = "K", descriptor = "I")
    public static int field3260;

    @OriginalMember(owner = "client!cn", name = "M", descriptor = "I")
    public static int field3262;

    @OriginalMember(owner = "client!cn", name = "N", descriptor = "I")
    public static int field3263;

    @OriginalMember(owner = "client!cn", name = "P", descriptor = "I")
    public static int field3265;

    @OriginalMember(owner = "client!cn", name = "R", descriptor = "I")
    public static int field3267;

    @OriginalMember(owner = "client!cn", name = "S", descriptor = "I")
    public static int field3268;

    @OriginalMember(owner = "client!cn", name = "O", descriptor = "[[I")
    private int[][] field3264;

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZLjava/util/Random;)I", line = 10)
    public static final int method1488(int arg0, boolean arg1, Random arg2) {
        field3257++;
        if (arg0 <= 0) {
            throw new IllegalArgumentException();
        } else if (class120.method878(arg0, 11770)) {
            return (int) ((long) arg0 * ((long) arg2.nextInt() & 0xFFFFFFFFL) >> 32);
        } else {
            int var3 = Integer.MIN_VALUE - ((int) (4294967296L % (long) arg0));
            if (!arg1) {
                return -59;
            }
            int var4;
            do {
                var4 = arg2.nextInt();
            } while (var4 >= var3);
            return class284.method1978(arg0, 117, var4);
        }
    }

    @OriginalMember(owner = "client!cn", name = "h", descriptor = "(I)V", line = 44)
    private final void method1489(int arg0) {
        field3268++;
        if (arg0 != -28960) {
            this.method47(112);
        }
        int var2 = this.field3264.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field3264[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 >= var2) {
                int[] var7 = this.field3264[var2 - 1];
                var8 = var7[3];
                var9 = var7[1];
                var10 = var7[2];
            } else {
                int[] var11 = this.field3264[var4];
                if (var4 <= 0) {
                    var10 = var11[2];
                    var9 = var11[1];
                    var8 = var11[3];
                } else {
                    int[] var12 = this.field3264[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                }
            }
            int var15 = var8 >> 4;
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
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            this.field3259[var3] = class140.method1009(class140.method1009(var16 << 16, var17 << 8), var15);
        }
    }

    @OriginalMember(owner = "client!cn", name = "c", descriptor = "(II)V", line = 148)
    private final void method1490(int arg0, int arg1) {
        if (arg0 < 33) {
            return;
        }
        field3265++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field3264 = new int[2][4];
            this.field3264[0][2] = 0;
            this.field3264[0][0] = 0;
            this.field3264[1][0] = 4096;
            this.field3264[1][2] = 4096;
            this.field3264[0][1] = 0;
            this.field3264[1][1] = 4096;
            this.field3264[0][3] = 0;
            this.field3264[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field3264 = new int[8][4];
            this.field3264[0][3] = 2361;
            this.field3264[1][3] = 1558;
            this.field3264[0][1] = 2650;
            this.field3264[0][2] = 2602;
            this.field3264[2][3] = 1413;
            this.field3264[1][1] = 2313;
            this.field3264[0][0] = 0;
            this.field3264[3][3] = 947;
            this.field3264[2][1] = 2618;
            this.field3264[3][1] = 2296;
            this.field3264[1][2] = 1799;
            this.field3264[4][1] = 2072;
            this.field3264[4][3] = 722;
            this.field3264[1][0] = 2867;
            this.field3264[5][3] = 1766;
            this.field3264[6][3] = 915;
            this.field3264[2][0] = 3072;
            this.field3264[5][1] = 2730;
            this.field3264[7][3] = 1140;
            this.field3264[6][1] = 2232;
            this.field3264[7][1] = 1686;
            this.field3264[3][0] = 3276;
            this.field3264[2][2] = 1734;
            this.field3264[3][2] = 1220;
            this.field3264[4][2] = 963;
            this.field3264[4][0] = 3481;
            this.field3264[5][2] = 2152;
            this.field3264[5][0] = 3686;
            this.field3264[6][2] = 1060;
            this.field3264[6][0] = 3891;
            this.field3264[7][0] = 4096;
            this.field3264[7][2] = 1413;
        } else if (arg1 == 3) {
            this.field3264 = new int[7][4];
            this.field3264[0][0] = 0;
            this.field3264[0][3] = 4096;
            this.field3264[0][1] = 0;
            this.field3264[1][1] = 0;
            this.field3264[1][0] = 663;
            this.field3264[2][0] = 1363;
            this.field3264[0][2] = 0;
            this.field3264[2][1] = 0;
            this.field3264[3][0] = 2048;
            this.field3264[3][1] = 4096;
            this.field3264[1][2] = 4096;
            this.field3264[4][0] = 2727;
            this.field3264[5][0] = 3411;
            this.field3264[2][2] = 4096;
            this.field3264[6][0] = 4096;
            this.field3264[4][1] = 4096;
            this.field3264[3][2] = 4096;
            this.field3264[4][2] = 0;
            this.field3264[1][3] = 4096;
            this.field3264[5][1] = 4096;
            this.field3264[2][3] = 0;
            this.field3264[5][2] = 0;
            this.field3264[3][3] = 0;
            this.field3264[6][2] = 0;
            this.field3264[4][3] = 0;
            this.field3264[6][1] = 0;
            this.field3264[5][3] = 4096;
            this.field3264[6][3] = 4096;
        } else if (arg1 == 4) {
            this.field3264 = new int[6][4];
            this.field3264[0][0] = 0;
            this.field3264[0][3] = 0;
            this.field3264[0][2] = 0;
            this.field3264[1][0] = 1843;
            this.field3264[0][1] = 0;
            this.field3264[1][1] = 0;
            this.field3264[1][3] = 1493;
            this.field3264[2][0] = 2457;
            this.field3264[1][2] = 0;
            this.field3264[2][3] = 2939;
            this.field3264[3][3] = 3565;
            this.field3264[4][3] = 4031;
            this.field3264[5][3] = 4096;
            this.field3264[2][1] = 0;
            this.field3264[3][0] = 2781;
            this.field3264[3][1] = 0;
            this.field3264[4][0] = 3481;
            this.field3264[2][2] = 0;
            this.field3264[5][0] = 4096;
            this.field3264[4][1] = 546;
            this.field3264[5][1] = 4096;
            this.field3264[3][2] = 1124;
            this.field3264[4][2] = 3084;
            this.field3264[5][2] = 4096;
        } else if (arg1 == 5) {
            this.field3264 = new int[16][4];
            this.field3264[0][1] = 80;
            this.field3264[0][3] = 321;
            this.field3264[0][2] = 192;
            this.field3264[0][0] = 0;
            this.field3264[1][3] = 562;
            this.field3264[1][1] = 321;
            this.field3264[2][3] = 803;
            this.field3264[1][2] = 449;
            this.field3264[2][1] = 578;
            this.field3264[3][1] = 947;
            this.field3264[2][2] = 690;
            this.field3264[3][3] = 1140;
            this.field3264[1][0] = 155;
            this.field3264[4][1] = 1285;
            this.field3264[4][3] = 1509;
            this.field3264[5][1] = 1525;
            this.field3264[3][2] = 995;
            this.field3264[2][0] = 389;
            this.field3264[4][2] = 1397;
            this.field3264[5][3] = 1413;
            this.field3264[6][3] = 1333;
            this.field3264[3][0] = 671;
            this.field3264[5][2] = 1429;
            this.field3264[4][0] = 897;
            this.field3264[6][2] = 1461;
            this.field3264[7][3] = 1702;
            this.field3264[8][3] = 2056;
            this.field3264[7][2] = 1525;
            this.field3264[6][1] = 1734;
            this.field3264[9][3] = 2666;
            this.field3264[8][2] = 1590;
            this.field3264[7][1] = 1413;
            this.field3264[10][3] = 3276;
            this.field3264[8][1] = 1108;
            this.field3264[9][2] = 2056;
            this.field3264[5][0] = 1175;
            this.field3264[6][0] = 1368;
            this.field3264[10][2] = 2586;
            this.field3264[11][2] = 3148;
            this.field3264[12][2] = 3710;
            this.field3264[13][2] = 3421;
            this.field3264[9][1] = 1766;
            this.field3264[11][3] = 3228;
            this.field3264[10][1] = 2409;
            this.field3264[14][2] = 3148;
            this.field3264[12][3] = 3196;
            this.field3264[11][1] = 3116;
            this.field3264[13][3] = 3019;
            this.field3264[12][1] = 3806;
            this.field3264[14][3] = 3228;
            this.field3264[15][3] = 2746;
            this.field3264[15][2] = 2505;
            this.field3264[7][0] = 1507;
            this.field3264[8][0] = 1736;
            this.field3264[9][0] = 2088;
            this.field3264[13][1] = 3437;
            this.field3264[10][0] = 2355;
            this.field3264[11][0] = 2691;
            this.field3264[12][0] = 3031;
            this.field3264[13][0] = 3522;
            this.field3264[14][1] = 3116;
            this.field3264[15][1] = 2377;
            this.field3264[14][0] = 3727;
            this.field3264[15][0] = 4096;
        } else if (arg1 == 6) {
            this.field3264 = new int[4][4];
            this.field3264[0][1] = 0;
            this.field3264[1][1] = 4096;
            this.field3264[0][2] = 4096;
            this.field3264[1][2] = 4096;
            this.field3264[2][2] = 4096;
            this.field3264[0][0] = 2048;
            this.field3264[1][0] = 2867;
            this.field3264[3][2] = 0;
            this.field3264[0][3] = 0;
            this.field3264[2][1] = 4096;
            this.field3264[3][1] = 4096;
            this.field3264[1][3] = 0;
            this.field3264[2][3] = 0;
            this.field3264[3][3] = 0;
            this.field3264[2][0] = 3276;
            this.field3264[3][0] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!cn", name = "<init>", descriptor = "()V", line = 401)
    public class216() {
        super(1, false);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(ILre;I)V", line = 405)
    public final void method44(int arg0, class263 arg1, int arg2) {
        if (arg0 == 0) {
            int var4 = arg1.method1787(false);
            if (var4 == 0) {
                this.field3264 = new int[arg1.method1787(false)][4];
                for (int var5 = 0; var5 < this.field3264.length; var5++) {
                    this.field3264[var5][0] = arg1.method1830((byte) -77);
                    this.field3264[var5][1] = arg1.method1787(false) << 4;
                    this.field3264[var5][2] = arg1.method1787(false) << 4;
                    this.field3264[var5][3] = arg1.method1787(false) << 4;
                }
            } else {
                this.method1490(48, var4);
            }
        }
        if (arg2 > -37) {
            this.method1489(-70);
        }
        field3267++;
    }

    @OriginalMember(owner = "client!cn", name = "f", descriptor = "(I)V", line = 450)
    public final void method47(int arg0) {
        if (arg0 != -9) {
            return;
        }
        field3260++;
        if (this.field3264 == null) {
            this.method1490(117, 1);
        }
        this.method1489(-28960);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(I[II[JZ)V", line = 471)
    public static final void method1491(int arg0, int[] arg1, int arg2, long[] arg3, boolean arg4) {
        field3262++;
        if (!arg4) {
            method1488(-81, true, (Random) null);
        }
        if (arg0 <= arg2) {
            return;
        }
        int var5 = (arg0 + arg2) / 2;
        int var6 = arg2;
        long var7 = arg3[var5];
        arg3[var5] = arg3[arg0];
        arg3[arg0] = var7;
        int var9 = arg1[var5];
        arg1[var5] = arg1[arg0];
        arg1[arg0] = var9;
        for (int var10 = arg2; var10 < arg0; var10++) {
            if (arg3[var10] < ((long) (var10 & 0x1) + var7)) {
                long var11 = arg3[var10];
                arg3[var10] = arg3[var6];
                arg3[var6] = var11;
                int var13 = arg1[var10];
                arg1[var10] = arg1[var6];
                arg1[var6++] = var13;
            }
        }
        arg3[arg0] = arg3[var6];
        arg3[var6] = var7;
        arg1[arg0] = arg1[var6];
        arg1[var6] = var9;
        method1491(var6 - 1, arg1, arg2, arg3, true);
        method1491(arg0, arg1, var6 + 1, arg3, true);
    }

    @OriginalMember(owner = "client!cn", name = "a", descriptor = "(IZ)[[I", line = 532)
    public final int[][] method445(int arg0, boolean arg1) {
        field3258++;
        int[][] var3 = this.field1701.method1477((byte) 89, arg0);
        if (this.field1701.field3255) {
            int[] var4 = this.method764(0, true, arg0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class124.field1936; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3259[var9];
                var5[var8] = class124.method893(var10 >> 12, 4080);
                var6[var8] = class124.method893(var10 >> 4, 4080);
                var7[var8] = class124.method893(4080, var10 << 4);
            }
        }
        return arg1 ? (int[][]) ((int[][]) null) : var3;
    }
}
