import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dd")
public class class250 extends class177 {

    @OriginalMember(owner = "client!dd", name = "C", descriptor = "[I")
    private int[] field3744 = new int[257];

    @OriginalMember(owner = "client!dd", name = "J", descriptor = "Ljava/lang/String;")
    public static String field3751 = "wave2:";

    @OriginalMember(owner = "client!dd", name = "M", descriptor = "I")
    public static int field3754 = 0;

    @OriginalMember(owner = "client!dd", name = "K", descriptor = "I")
    public static int field3752 = 0;

    @OriginalMember(owner = "client!dd", name = "G", descriptor = "I")
    public static int field3748 = -1;

    @OriginalMember(owner = "client!dd", name = "D", descriptor = "I")
    public static int field3745;

    @OriginalMember(owner = "client!dd", name = "F", descriptor = "I")
    public static int field3747;

    @OriginalMember(owner = "client!dd", name = "H", descriptor = "I")
    public static int field3749;

    @OriginalMember(owner = "client!dd", name = "I", descriptor = "I")
    public static int field3750;

    @OriginalMember(owner = "client!dd", name = "L", descriptor = "I")
    public static int field3753;

    @OriginalMember(owner = "client!dd", name = "N", descriptor = "I")
    public static int field3755;

    @OriginalMember(owner = "client!dd", name = "O", descriptor = "[[I")
    private int[][] field3756;

    @OriginalMember(owner = "client!dd", name = "E", descriptor = "[[[Lp;")
    public static class99[][][] field3746;

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(Lhb;II)V", line = 11)
    public final void method97(class35 arg0, int arg1, int arg2) {
        if (arg2 == 0) {
            int var4 = arg0.method273(65280);
            if (var4 == 0) {
                this.field3756 = new int[arg0.method273(arg1 + 83341)][4];
                for (int var5 = 0; var5 < this.field3756.length; var5++) {
                    this.field3756[var5][0] = arg0.method300(-1394191632);
                    this.field3756[var5][1] = arg0.method273(65280) << 4;
                    this.field3756[var5][2] = arg0.method273(class203.method1462(arg1, -47501)) << 4;
                    this.field3756[var5][3] = arg0.method273(65280) << 4;
                }
            } else {
                this.method1730(var4, (byte) 14);
            }
        }
        if (arg1 != -18061) {
            this.field3744 = (int[]) null;
        }
        field3747++;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(IB)V", line = 52)
    private final void method1730(int arg0, byte arg1) {
        field3750++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field3756 = new int[2][4];
                this.field3756[0][1] = 0;
                this.field3756[0][3] = 0;
                this.field3756[0][0] = 0;
                this.field3756[1][3] = 4096;
                this.field3756[0][2] = 0;
                this.field3756[1][1] = 4096;
                this.field3756[1][0] = 4096;
                this.field3756[1][2] = 4096;
            } else if (arg0 == 2) {
                this.field3756 = new int[8][4];
                this.field3756[0][1] = 2650;
                this.field3756[0][3] = 2361;
                this.field3756[1][1] = 2313;
                this.field3756[0][0] = 0;
                this.field3756[2][1] = 2618;
                this.field3756[0][2] = 2602;
                this.field3756[1][2] = 1799;
                this.field3756[2][2] = 1734;
                this.field3756[1][3] = 1558;
                this.field3756[1][0] = 2867;
                this.field3756[3][1] = 2296;
                this.field3756[4][1] = 2072;
                this.field3756[2][0] = 3072;
                this.field3756[3][2] = 1220;
                this.field3756[3][0] = 3276;
                this.field3756[2][3] = 1413;
                this.field3756[4][2] = 963;
                this.field3756[3][3] = 947;
                this.field3756[5][2] = 2152;
                this.field3756[4][3] = 722;
                this.field3756[5][1] = 2730;
                this.field3756[6][1] = 2232;
                this.field3756[7][1] = 1686;
                this.field3756[4][0] = 3481;
                this.field3756[6][2] = 1060;
                this.field3756[5][3] = 1766;
                this.field3756[7][2] = 1413;
                this.field3756[5][0] = 3686;
                this.field3756[6][3] = 915;
                this.field3756[7][3] = 1140;
                this.field3756[6][0] = 3891;
                this.field3756[7][0] = 4096;
            } else if (arg0 == 3) {
                this.field3756 = new int[7][4];
                this.field3756[0][0] = 0;
                this.field3756[0][3] = 4096;
                this.field3756[0][2] = 0;
                this.field3756[1][3] = 4096;
                this.field3756[1][2] = 4096;
                this.field3756[2][2] = 4096;
                this.field3756[0][1] = 0;
                this.field3756[1][1] = 0;
                this.field3756[1][0] = 663;
                this.field3756[2][0] = 1363;
                this.field3756[2][1] = 0;
                this.field3756[2][3] = 0;
                this.field3756[3][3] = 0;
                this.field3756[4][3] = 0;
                this.field3756[3][2] = 4096;
                this.field3756[3][1] = 4096;
                this.field3756[5][3] = 4096;
                this.field3756[3][0] = 2048;
                this.field3756[4][2] = 0;
                this.field3756[5][2] = 0;
                this.field3756[4][1] = 4096;
                this.field3756[6][3] = 4096;
                this.field3756[4][0] = 2727;
                this.field3756[5][1] = 4096;
                this.field3756[6][2] = 0;
                this.field3756[6][1] = 0;
                this.field3756[5][0] = 3411;
                this.field3756[6][0] = 4096;
            } else if (arg0 == 4) {
                this.field3756 = new int[6][4];
                this.field3756[0][1] = 0;
                this.field3756[0][2] = 0;
                this.field3756[1][1] = 0;
                this.field3756[0][0] = 0;
                this.field3756[0][3] = 0;
                this.field3756[1][0] = 1843;
                this.field3756[1][2] = 0;
                this.field3756[2][2] = 0;
                this.field3756[1][3] = 1493;
                this.field3756[3][2] = 1124;
                this.field3756[4][2] = 3084;
                this.field3756[5][2] = 4096;
                this.field3756[2][3] = 2939;
                this.field3756[2][1] = 0;
                this.field3756[2][0] = 2457;
                this.field3756[3][0] = 2781;
                this.field3756[3][3] = 3565;
                this.field3756[4][3] = 4031;
                this.field3756[4][0] = 3481;
                this.field3756[5][0] = 4096;
                this.field3756[3][1] = 0;
                this.field3756[4][1] = 546;
                this.field3756[5][1] = 4096;
                this.field3756[5][3] = 4096;
            } else if (arg0 == 5) {
                this.field3756 = new int[16][4];
                this.field3756[0][2] = 192;
                this.field3756[0][0] = 0;
                this.field3756[1][0] = 155;
                this.field3756[2][0] = 389;
                this.field3756[3][0] = 671;
                this.field3756[1][2] = 449;
                this.field3756[0][3] = 321;
                this.field3756[4][0] = 897;
                this.field3756[2][2] = 690;
                this.field3756[5][0] = 1175;
                this.field3756[0][1] = 80;
                this.field3756[1][1] = 321;
                this.field3756[1][3] = 562;
                this.field3756[3][2] = 995;
                this.field3756[2][3] = 803;
                this.field3756[2][1] = 578;
                this.field3756[3][1] = 947;
                this.field3756[6][0] = 1368;
                this.field3756[7][0] = 1507;
                this.field3756[3][3] = 1140;
                this.field3756[4][2] = 1397;
                this.field3756[8][0] = 1736;
                this.field3756[4][3] = 1509;
                this.field3756[5][3] = 1413;
                this.field3756[5][2] = 1429;
                this.field3756[6][2] = 1461;
                this.field3756[6][3] = 1333;
                this.field3756[7][3] = 1702;
                this.field3756[9][0] = 2088;
                this.field3756[8][3] = 2056;
                this.field3756[10][0] = 2355;
                this.field3756[9][3] = 2666;
                this.field3756[7][2] = 1525;
                this.field3756[4][1] = 1285;
                this.field3756[10][3] = 3276;
                this.field3756[5][1] = 1525;
                this.field3756[11][3] = 3228;
                this.field3756[6][1] = 1734;
                this.field3756[12][3] = 3196;
                this.field3756[13][3] = 3019;
                this.field3756[14][3] = 3228;
                this.field3756[11][0] = 2691;
                this.field3756[15][3] = 2746;
                this.field3756[7][1] = 1413;
                this.field3756[8][2] = 1590;
                this.field3756[8][1] = 1108;
                this.field3756[9][1] = 1766;
                this.field3756[9][2] = 2056;
                this.field3756[10][1] = 2409;
                this.field3756[11][1] = 3116;
                this.field3756[12][1] = 3806;
                this.field3756[13][1] = 3437;
                this.field3756[14][1] = 3116;
                this.field3756[12][0] = 3031;
                this.field3756[15][1] = 2377;
                this.field3756[10][2] = 2586;
                this.field3756[13][0] = 3522;
                this.field3756[11][2] = 3148;
                this.field3756[12][2] = 3710;
                this.field3756[13][2] = 3421;
                this.field3756[14][2] = 3148;
                this.field3756[15][2] = 2505;
                this.field3756[14][0] = 3727;
                this.field3756[15][0] = 4096;
            } else if (arg0 == 6) {
                this.field3756 = new int[4][4];
                this.field3756[0][1] = 0;
                this.field3756[0][0] = 2048;
                this.field3756[0][2] = 4096;
                this.field3756[0][3] = 0;
                this.field3756[1][1] = 4096;
                this.field3756[1][2] = 4096;
                this.field3756[2][2] = 4096;
                this.field3756[1][3] = 0;
                this.field3756[2][3] = 0;
                this.field3756[1][0] = 2867;
                this.field3756[3][2] = 0;
                this.field3756[2][1] = 4096;
                this.field3756[2][0] = 3276;
                this.field3756[3][3] = 0;
                this.field3756[3][0] = 4096;
                this.field3756[3][1] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 != 14) {
            this.method1730(43, (byte) 121);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(Z)V", line = 302)
    public static final void method1731(boolean arg0) {
        field3753++;
        class198.method1442();
        int var1 = 0;
        if (!arg0) {
            method1731(true);
        }
        while (var1 < 4) {
            class90.field1309[var1].method2203(true);
            var1++;
        }
        System.gc();
    }

    @OriginalMember(owner = "client!dd", name = "<init>", descriptor = "()V", line = 478)
    public class250() {
        super(1, false);
    }

    @OriginalMember(owner = "client!dd", name = "d", descriptor = "(I)V", line = 329)
    private final void method1732(int arg0) {
        if (arg0 != -15818) {
            this.method1730(94, (byte) -40);
        }
        field3749++;
        int var2 = this.field3756.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field3756[var6][0]; var6++) {
                var4++;
            }
            int var11;
            int var12;
            int var13;
            if (var4 < var2) {
                int[] var7 = this.field3756[var4];
                if (var4 > 0) {
                    int[] var8 = this.field3756[var4 - 1];
                    int var9 = (var5 - var8[0] << 12) / (var7[0] - var8[0]);
                    int var10 = 4096 - var9;
                    var11 = var7[2] * var9 + var8[2] * var10 >> 12;
                    var12 = var7[1] * var9 + var8[1] * var10 >> 12;
                    var13 = var7[3] * var9 + var8[3] * var10 >> 12;
                } else {
                    var13 = var7[3];
                    var11 = var7[2];
                    var12 = var7[1];
                }
            } else {
                int[] var14 = this.field3756[var2 - 1];
                var12 = var14[1];
                var13 = var14[3];
                var11 = var14[2];
            }
            int var15 = var11 >> 4;
            int var16 = var12 >> 4;
            int var17 = var13 >> 4;
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
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field3744[var3] = class147.method1098(class147.method1098(var16 << 16, var15 << 8), var17);
        }
    }

    @OriginalMember(owner = "client!dd", name = "b", descriptor = "(II)[[I", line = 432)
    public final int[][] method99(int arg0, int arg1) {
        field3755++;
        int[][] var3 = this.field2645.method1456(arg0, (byte) -113);
        if (arg1 != -23387) {
            field3751 = (String) null;
        }
        if (this.field2645.field3203) {
            int[] var4 = this.method1280(arg0, 0, false);
            int[] var5 = var3[1];
            int[] var6 = var3[0];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class287.field4415; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field3744[var9];
                var6[var8] = class142.method1078(4080, var10 >> 12);
                var5[var8] = class142.method1078(var10 >> 4, 4080);
                var7[var8] = class142.method1078(4080, var10 << 4);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "()V", line = 499)
    public static final void method1733() {
        for (int var0 = 0; var0 < class39.field593; var0++) {
            class91 var1 = class249.field3739[var0];
            class293.method2068(var1);
            class249.field3739[var0] = null;
        }
        class39.field593 = 0;
    }

    @OriginalMember(owner = "client!dd", name = "a", descriptor = "(I)V", line = 516)
    public final void method465(int arg0) {
        int var2 = 23 % ((arg0 + 6) / 43);
        field3745++;
        if (this.field3756 == null) {
            this.method1730(1, (byte) 14);
        }
        this.method1732(-15818);
    }

    @OriginalMember(owner = "client!dd", name = "e", descriptor = "(I)V", line = 538)
    public static void method1734(int arg0) {
        field3751 = null;
        if (arg0 != 3) {
            field3751 = (String) null;
        }
        field3746 = (class99[][][]) null;
    }
}
