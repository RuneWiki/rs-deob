import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ri")
public class class188 extends class197 {

    @OriginalMember(owner = "client!ri", name = "db", descriptor = "[I")
    private int[] field3341 = new int[257];

    @OriginalMember(owner = "client!ri", name = "M", descriptor = "I")
    public static int field3324 = -1;

    @OriginalMember(owner = "client!ri", name = "ab", descriptor = "[I")
    public static int[] field3338 = new int[2];

    @OriginalMember(owner = "client!ri", name = "Q", descriptor = "I")
    public static int field3328 = 128;

    @OriginalMember(owner = "client!ri", name = "T", descriptor = "[I")
    public static int[] field3331 = new int[256];

    @OriginalMember(owner = "client!ri", name = "Z", descriptor = "Loh;")
    public static class258 field3337 = class153.method1046("Bitte warten Sie )2 es wird versucht)1 die Verbindung wiederherzustellen)3", 89);

    @OriginalMember(owner = "client!ri", name = "Y", descriptor = "Ls;")
    public static class171 field3336 = null;

    @OriginalMember(owner = "client!ri", name = "bb", descriptor = "I")
    public static int field3339 = 0;

    @OriginalMember(owner = "client!ri", name = "O", descriptor = "I")
    public static int field3326 = -1;

    @OriginalMember(owner = "client!ri", name = "N", descriptor = "I")
    public static int field3325;

    @OriginalMember(owner = "client!ri", name = "P", descriptor = "I")
    public static int field3327;

    @OriginalMember(owner = "client!ri", name = "R", descriptor = "I")
    public static int field3329;

    @OriginalMember(owner = "client!ri", name = "U", descriptor = "I")
    public static int field3332;

    @OriginalMember(owner = "client!ri", name = "V", descriptor = "I")
    public static int field3333;

    @OriginalMember(owner = "client!ri", name = "W", descriptor = "I")
    public static int field3334;

    @OriginalMember(owner = "client!ri", name = "X", descriptor = "I")
    public static int field3335;

    @OriginalMember(owner = "client!ri", name = "cb", descriptor = "[I")
    public static int[] field3340;

    @OriginalMember(owner = "client!ri", name = "S", descriptor = "[[I")
    private int[][] field3330;

    @OriginalMember(owner = "client!ri", name = "<init>", descriptor = "()V", line = 6)
    public class188() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(ILva;I)V", line = 11)
    public final void method98(int arg0, class235 arg1, int arg2) {
        if (arg0 != 7955) {
            field3337 = (class258) null;
        }
        if (arg2 == 0) {
            int var4 = arg1.method1589(arg0 - 7861);
            if (var4 == 0) {
                this.field3330 = new int[arg1.method1589(arg0 ^ 0x1F6B)][4];
                for (int var5 = 0; var5 < this.field3330.length; var5++) {
                    this.field3330[var5][0] = arg1.method1615(74);
                    this.field3330[var5][1] = arg1.method1589(71) << 4;
                    this.field3330[var5][2] = arg1.method1589(111) << 4;
                    this.field3330[var5][3] = arg1.method1589(125) << 4;
                }
            } else {
                this.method1278((byte) 96, var4);
            }
        }
        field3334++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IBLoh;)V", line = 50)
    public static final void method1274(int arg0, byte arg1, class258 arg2) {
        field3329++;
        if (arg1 != -6) {
            field3324 = -102;
        }
        class286 var3 = class48.method389(arg0, 3, 10738);
        var3.method2017(arg1 ^ 0x64);
        var3.field4928 = arg2;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(I)V", line = 63)
    public final void method223(int arg0) {
        if (this.field3330 == null) {
            this.method1278((byte) 96, 1);
        }
        field3333++;
        if (arg0 != 11135) {
            this.field3341 = (int[]) null;
        }
        this.method1275(-12798);
    }

    @OriginalMember(owner = "client!ri", name = "b", descriptor = "(I)V", line = 79)
    private final void method1275(int arg0) {
        field3327++;
        if (arg0 != -12798) {
            field3328 = 125;
        }
        int var2 = this.field3330.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field3330[var6][0] <= var5; var6++) {
                var4++;
            }
            int var11;
            int var12;
            int var13;
            if (var4 < var2) {
                int[] var7 = this.field3330[var4];
                if (var4 > 0) {
                    int[] var8 = this.field3330[var4 - 1];
                    int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                    int var10 = 4096 - var9;
                    var11 = var7[3] * var9 + (var8[3] * var10) >> 12;
                    var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                    var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                } else {
                    var11 = var7[3];
                    var13 = var7[2];
                    var12 = var7[1];
                }
            } else {
                int[] var14 = this.field3330[var2 - 1];
                var13 = var14[2];
                var12 = var14[1];
                var11 = var14[3];
            }
            int var15 = var12 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var13 >> 4;
            int var17 = var11 >> 4;
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
            this.field3341[var3] = class307.method2139(class307.method2139(var16 << 8, var15 << 16), var17);
        }
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(Lva;I)V", line = 181)
    public static final void method1276(class235 arg0, int arg1) {
        if (arg1 <= 111) {
            field3339 = 85;
        }
        if (class253.field4356 != null) {
            try {
                class253.field4356.method290(false, 0L);
                class253.field4356.method292(123, arg0.field4066, arg0.field4051, 24);
            } catch (Exception var3) {
            }
        }
        arg0.field4051 += 24;
        field3325++;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(IB)[[I", line = 214)
    public final int[][] method101(int arg0, byte arg1) {
        int var3 = 57 % ((arg1 - 1) / 37);
        int[][] var4 = this.field3461.method1936(arg0, 17174);
        field3332++;
        if (this.field3461.field4765) {
            int[] var5 = this.method1327(0, -118, arg0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class190.field3362; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field3341[var10];
                var6[var9] = class2.method15(16711680, var11) >> 12;
                var7[var9] = class2.method15(var11, 65280) >> 4;
                var8[var9] = class2.method15(4080, var11 << 4);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ri", name = "g", descriptor = "(B)V", line = 277)
    public static void method1277(byte arg0) {
        field3337 = null;
        field3340 = null;
        field3336 = null;
        field3331 = null;
        if (arg0 != -88) {
            field3328 = 63;
        }
        field3338 = null;
    }

    @OriginalMember(owner = "client!ri", name = "a", descriptor = "(BI)V", line = 298)
    private final void method1278(byte arg0, int arg1) {
        field3335++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field3330 = new int[2][4];
                this.field3330[0][3] = 0;
                this.field3330[1][3] = 4096;
                this.field3330[0][0] = 0;
                this.field3330[1][0] = 4096;
                this.field3330[0][2] = 0;
                this.field3330[0][1] = 0;
                this.field3330[1][1] = 4096;
                this.field3330[1][2] = 4096;
            } else if (arg1 == 2) {
                this.field3330 = new int[8][4];
                this.field3330[0][2] = 2602;
                this.field3330[0][0] = 0;
                this.field3330[1][0] = 2867;
                this.field3330[1][2] = 1799;
                this.field3330[0][3] = 2361;
                this.field3330[2][2] = 1734;
                this.field3330[1][3] = 1558;
                this.field3330[2][0] = 3072;
                this.field3330[3][0] = 3276;
                this.field3330[4][0] = 3481;
                this.field3330[3][2] = 1220;
                this.field3330[4][2] = 963;
                this.field3330[5][0] = 3686;
                this.field3330[5][2] = 2152;
                this.field3330[2][3] = 1413;
                this.field3330[3][3] = 947;
                this.field3330[6][0] = 3891;
                this.field3330[7][0] = 4096;
                this.field3330[4][3] = 722;
                this.field3330[6][2] = 1060;
                this.field3330[5][3] = 1766;
                this.field3330[0][1] = 2650;
                this.field3330[6][3] = 915;
                this.field3330[7][3] = 1140;
                this.field3330[1][1] = 2313;
                this.field3330[2][1] = 2618;
                this.field3330[7][2] = 1413;
                this.field3330[3][1] = 2296;
                this.field3330[4][1] = 2072;
                this.field3330[5][1] = 2730;
                this.field3330[6][1] = 2232;
                this.field3330[7][1] = 1686;
            } else if (arg1 == 3) {
                this.field3330 = new int[7][4];
                this.field3330[0][1] = 0;
                this.field3330[1][1] = 0;
                this.field3330[0][2] = 0;
                this.field3330[0][3] = 4096;
                this.field3330[2][1] = 0;
                this.field3330[1][3] = 4096;
                this.field3330[0][0] = 0;
                this.field3330[3][1] = 4096;
                this.field3330[4][1] = 4096;
                this.field3330[1][0] = 663;
                this.field3330[1][2] = 4096;
                this.field3330[5][1] = 4096;
                this.field3330[2][0] = 1363;
                this.field3330[3][0] = 2048;
                this.field3330[2][3] = 0;
                this.field3330[6][1] = 0;
                this.field3330[3][3] = 0;
                this.field3330[4][3] = 0;
                this.field3330[4][0] = 2727;
                this.field3330[5][0] = 3411;
                this.field3330[5][3] = 4096;
                this.field3330[6][0] = 4096;
                this.field3330[6][3] = 4096;
                this.field3330[2][2] = 4096;
                this.field3330[3][2] = 4096;
                this.field3330[4][2] = 0;
                this.field3330[5][2] = 0;
                this.field3330[6][2] = 0;
            } else if (arg1 == 4) {
                this.field3330 = new int[6][4];
                this.field3330[0][2] = 0;
                this.field3330[0][0] = 0;
                this.field3330[0][1] = 0;
                this.field3330[0][3] = 0;
                this.field3330[1][1] = 0;
                this.field3330[2][1] = 0;
                this.field3330[1][2] = 0;
                this.field3330[1][3] = 1493;
                this.field3330[3][1] = 0;
                this.field3330[2][3] = 2939;
                this.field3330[2][2] = 0;
                this.field3330[3][2] = 1124;
                this.field3330[4][1] = 546;
                this.field3330[4][2] = 3084;
                this.field3330[3][3] = 3565;
                this.field3330[1][0] = 1843;
                this.field3330[2][0] = 2457;
                this.field3330[5][2] = 4096;
                this.field3330[4][3] = 4031;
                this.field3330[5][3] = 4096;
                this.field3330[5][1] = 4096;
                this.field3330[3][0] = 2781;
                this.field3330[4][0] = 3481;
                this.field3330[5][0] = 4096;
            } else if (arg1 == 5) {
                this.field3330 = new int[16][4];
                this.field3330[0][1] = 80;
                this.field3330[0][0] = 0;
                this.field3330[1][0] = 155;
                this.field3330[0][2] = 192;
                this.field3330[2][0] = 389;
                this.field3330[1][1] = 321;
                this.field3330[3][0] = 671;
                this.field3330[4][0] = 897;
                this.field3330[1][2] = 449;
                this.field3330[2][1] = 578;
                this.field3330[2][2] = 690;
                this.field3330[3][2] = 995;
                this.field3330[5][0] = 1175;
                this.field3330[3][1] = 947;
                this.field3330[6][0] = 1368;
                this.field3330[4][1] = 1285;
                this.field3330[4][2] = 1397;
                this.field3330[0][3] = 321;
                this.field3330[5][1] = 1525;
                this.field3330[1][3] = 562;
                this.field3330[2][3] = 803;
                this.field3330[5][2] = 1429;
                this.field3330[6][2] = 1461;
                this.field3330[3][3] = 1140;
                this.field3330[6][1] = 1734;
                this.field3330[7][0] = 1507;
                this.field3330[7][1] = 1413;
                this.field3330[8][1] = 1108;
                this.field3330[7][2] = 1525;
                this.field3330[4][3] = 1509;
                this.field3330[9][1] = 1766;
                this.field3330[5][3] = 1413;
                this.field3330[8][0] = 1736;
                this.field3330[8][2] = 1590;
                this.field3330[6][3] = 1333;
                this.field3330[10][1] = 2409;
                this.field3330[7][3] = 1702;
                this.field3330[11][1] = 3116;
                this.field3330[9][0] = 2088;
                this.field3330[8][3] = 2056;
                this.field3330[9][3] = 2666;
                this.field3330[10][0] = 2355;
                this.field3330[9][2] = 2056;
                this.field3330[11][0] = 2691;
                this.field3330[12][1] = 3806;
                this.field3330[10][2] = 2586;
                this.field3330[13][1] = 3437;
                this.field3330[11][2] = 3148;
                this.field3330[12][2] = 3710;
                this.field3330[12][0] = 3031;
                this.field3330[13][2] = 3421;
                this.field3330[14][2] = 3148;
                this.field3330[13][0] = 3522;
                this.field3330[15][2] = 2505;
                this.field3330[10][3] = 3276;
                this.field3330[11][3] = 3228;
                this.field3330[14][0] = 3727;
                this.field3330[12][3] = 3196;
                this.field3330[15][0] = 4096;
                this.field3330[14][1] = 3116;
                this.field3330[15][1] = 2377;
                this.field3330[13][3] = 3019;
                this.field3330[14][3] = 3228;
                this.field3330[15][3] = 2746;
            } else if (arg1 == 6) {
                this.field3330 = new int[4][4];
                this.field3330[0][3] = 0;
                this.field3330[0][0] = 2048;
                this.field3330[1][3] = 0;
                this.field3330[1][0] = 2867;
                this.field3330[0][1] = 0;
                this.field3330[2][0] = 3276;
                this.field3330[2][3] = 0;
                this.field3330[0][2] = 4096;
                this.field3330[1][2] = 4096;
                this.field3330[3][0] = 4096;
                this.field3330[2][2] = 4096;
                this.field3330[3][3] = 0;
                this.field3330[3][2] = 0;
                this.field3330[1][1] = 4096;
                this.field3330[2][1] = 4096;
                this.field3330[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 != 96) {
            field3340 = (int[]) null;
        }
    }
}
