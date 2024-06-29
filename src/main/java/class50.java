import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ik")
public class class50 extends class279 {

    @OriginalMember(owner = "client!ik", name = "I", descriptor = "[I")
    private int[] field762 = new int[257];

    @OriginalMember(owner = "client!ik", name = "J", descriptor = "Lgb;")
    public static class212 field763 = new class212(5);

    @OriginalMember(owner = "client!ik", name = "Q", descriptor = "[[I")
    public static int[][] field769 = new int[104][104];

    @OriginalMember(owner = "client!ik", name = "O", descriptor = "[I")
    public static int[] field767 = new int[] { 0, -1, 0, 1 };

    @OriginalMember(owner = "client!ik", name = "S", descriptor = "Ltl;")
    public static class59 field771 = class85.method639(" )2> <col=ffffff>", 9588);

    @OriginalMember(owner = "client!ik", name = "L", descriptor = "I")
    public static int field765 = 0;

    @OriginalMember(owner = "client!ik", name = "V", descriptor = "[I")
    public static int[] field774 = new int[] { 0, 2, 2, 2, 1, 1, 2, 2, 1, 3, 1, 1 };

    @OriginalMember(owner = "client!ik", name = "G", descriptor = "I")
    public static int field760;

    @OriginalMember(owner = "client!ik", name = "H", descriptor = "I")
    public static int field761;

    @OriginalMember(owner = "client!ik", name = "K", descriptor = "I")
    public static int field764;

    @OriginalMember(owner = "client!ik", name = "P", descriptor = "I")
    public static int field768;

    @OriginalMember(owner = "client!ik", name = "R", descriptor = "I")
    public static int field770;

    @OriginalMember(owner = "client!ik", name = "T", descriptor = "I")
    public static int field772;

    @OriginalMember(owner = "client!ik", name = "U", descriptor = "I")
    public static int field773;

    @OriginalMember(owner = "client!ik", name = "W", descriptor = "I")
    public static int field775;

    @OriginalMember(owner = "client!ik", name = "M", descriptor = "[[I")
    private int[][] field766;

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IILs;)V", line = 4)
    public final void method51(int arg0, int arg1, class170 arg2) {
        if (arg1 == 0) {
            int var4 = arg2.method1221(81);
            if (var4 == 0) {
                this.field766 = new int[arg2.method1221(83)][4];
                for (int var5 = 0; var5 < this.field766.length; var5++) {
                    this.field766[var5][0] = arg2.method1214(-18254);
                    this.field766[var5][1] = arg2.method1221(122) << 4;
                    this.field766[var5][2] = arg2.method1221(93) << 4;
                    this.field766[var5][3] = arg2.method1221(112) << 4;
                }
            } else {
                this.method359(var4, false);
            }
        }
        field761++;
        if (arg0 > -125) {
            method360((byte) 127, -48, -6, 118, 51, 61, -42);
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(Z)V", line = 42)
    private final void method358(boolean arg0) {
        if (!arg0) {
            method360((byte) -103, -102, 69, -36, -107, 108, 88);
        }
        field772++;
        int var2 = this.field766.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && this.field766[var6][0] <= var5; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var4) {
                int[] var7 = this.field766[var2 - 1];
                var8 = var7[2];
                var9 = var7[1];
                var10 = var7[3];
            } else {
                int[] var11 = this.field766[var4];
                if (var4 > 0) {
                    int[] var12 = this.field766[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var8 = var11[2] * var13 + var12[2] * var14 >> 12;
                } else {
                    var9 = var11[1];
                    var8 = var11[2];
                    var10 = var11[3];
                }
            }
            int var15 = var8 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var10 >> 4;
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
            this.field762[var3] = class239.method1677(var16, class239.method1677(var15 << 8, var17 << 16));
        }
    }

    @OriginalMember(owner = "client!ik", name = "<init>", descriptor = "()V", line = 145)
    public class50() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(IZ)V", line = 150)
    private final void method359(int arg0, boolean arg1) {
        field770++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field766 = new int[2][4];
                this.field766[0][1] = 0;
                this.field766[0][3] = 0;
                this.field766[0][0] = 0;
                this.field766[0][2] = 0;
                this.field766[1][1] = 4096;
                this.field766[1][2] = 4096;
                this.field766[1][3] = 4096;
                this.field766[1][0] = 4096;
            } else if (arg0 == 2) {
                this.field766 = new int[8][4];
                this.field766[0][3] = 2361;
                this.field766[0][0] = 0;
                this.field766[1][3] = 1558;
                this.field766[0][1] = 2650;
                this.field766[1][1] = 2313;
                this.field766[1][0] = 2867;
                this.field766[2][0] = 3072;
                this.field766[0][2] = 2602;
                this.field766[3][0] = 3276;
                this.field766[1][2] = 1799;
                this.field766[2][3] = 1413;
                this.field766[4][0] = 3481;
                this.field766[5][0] = 3686;
                this.field766[6][0] = 3891;
                this.field766[3][3] = 947;
                this.field766[4][3] = 722;
                this.field766[2][1] = 2618;
                this.field766[7][0] = 4096;
                this.field766[2][2] = 1734;
                this.field766[3][1] = 2296;
                this.field766[3][2] = 1220;
                this.field766[4][1] = 2072;
                this.field766[5][1] = 2730;
                this.field766[4][2] = 963;
                this.field766[5][3] = 1766;
                this.field766[5][2] = 2152;
                this.field766[6][3] = 915;
                this.field766[7][3] = 1140;
                this.field766[6][2] = 1060;
                this.field766[7][2] = 1413;
                this.field766[6][1] = 2232;
                this.field766[7][1] = 1686;
            } else if (arg0 == 3) {
                this.field766 = new int[7][4];
                this.field766[0][2] = 0;
                this.field766[0][3] = 4096;
                this.field766[0][0] = 0;
                this.field766[1][0] = 663;
                this.field766[0][1] = 0;
                this.field766[2][0] = 1363;
                this.field766[1][2] = 4096;
                this.field766[1][3] = 4096;
                this.field766[1][1] = 0;
                this.field766[2][3] = 0;
                this.field766[3][3] = 0;
                this.field766[2][2] = 4096;
                this.field766[2][1] = 0;
                this.field766[4][3] = 0;
                this.field766[3][0] = 2048;
                this.field766[4][0] = 2727;
                this.field766[5][0] = 3411;
                this.field766[3][2] = 4096;
                this.field766[4][2] = 0;
                this.field766[6][0] = 4096;
                this.field766[3][1] = 4096;
                this.field766[4][1] = 4096;
                this.field766[5][1] = 4096;
                this.field766[6][1] = 0;
                this.field766[5][3] = 4096;
                this.field766[6][3] = 4096;
                this.field766[5][2] = 0;
                this.field766[6][2] = 0;
            } else if (arg0 == 4) {
                this.field766 = new int[6][4];
                this.field766[0][1] = 0;
                this.field766[0][2] = 0;
                this.field766[0][0] = 0;
                this.field766[1][2] = 0;
                this.field766[1][1] = 0;
                this.field766[2][1] = 0;
                this.field766[0][3] = 0;
                this.field766[2][2] = 0;
                this.field766[3][1] = 0;
                this.field766[1][0] = 1843;
                this.field766[4][1] = 546;
                this.field766[5][1] = 4096;
                this.field766[1][3] = 1493;
                this.field766[2][3] = 2939;
                this.field766[2][0] = 2457;
                this.field766[3][0] = 2781;
                this.field766[3][3] = 3565;
                this.field766[3][2] = 1124;
                this.field766[4][3] = 4031;
                this.field766[4][0] = 3481;
                this.field766[5][0] = 4096;
                this.field766[5][3] = 4096;
                this.field766[4][2] = 3084;
                this.field766[5][2] = 4096;
            } else if (arg0 == 5) {
                this.field766 = new int[16][4];
                this.field766[0][2] = 192;
                this.field766[0][1] = 80;
                this.field766[0][0] = 0;
                this.field766[1][0] = 155;
                this.field766[1][2] = 449;
                this.field766[1][1] = 321;
                this.field766[0][3] = 321;
                this.field766[1][3] = 562;
                this.field766[2][2] = 690;
                this.field766[3][2] = 995;
                this.field766[2][1] = 578;
                this.field766[4][2] = 1397;
                this.field766[3][1] = 947;
                this.field766[2][3] = 803;
                this.field766[2][0] = 389;
                this.field766[3][0] = 671;
                this.field766[3][3] = 1140;
                this.field766[5][2] = 1429;
                this.field766[6][2] = 1461;
                this.field766[4][0] = 897;
                this.field766[5][0] = 1175;
                this.field766[4][1] = 1285;
                this.field766[7][2] = 1525;
                this.field766[5][1] = 1525;
                this.field766[8][2] = 1590;
                this.field766[6][1] = 1734;
                this.field766[7][1] = 1413;
                this.field766[4][3] = 1509;
                this.field766[9][2] = 2056;
                this.field766[5][3] = 1413;
                this.field766[6][0] = 1368;
                this.field766[8][1] = 1108;
                this.field766[7][0] = 1507;
                this.field766[6][3] = 1333;
                this.field766[8][0] = 1736;
                this.field766[9][0] = 2088;
                this.field766[10][2] = 2586;
                this.field766[11][2] = 3148;
                this.field766[10][0] = 2355;
                this.field766[7][3] = 1702;
                this.field766[9][1] = 1766;
                this.field766[11][0] = 2691;
                this.field766[12][2] = 3710;
                this.field766[13][2] = 3421;
                this.field766[14][2] = 3148;
                this.field766[12][0] = 3031;
                this.field766[10][1] = 2409;
                this.field766[8][3] = 2056;
                this.field766[15][2] = 2505;
                this.field766[11][1] = 3116;
                this.field766[13][0] = 3522;
                this.field766[12][1] = 3806;
                this.field766[9][3] = 2666;
                this.field766[10][3] = 3276;
                this.field766[13][1] = 3437;
                this.field766[11][3] = 3228;
                this.field766[14][0] = 3727;
                this.field766[14][1] = 3116;
                this.field766[15][0] = 4096;
                this.field766[12][3] = 3196;
                this.field766[13][3] = 3019;
                this.field766[14][3] = 3228;
                this.field766[15][1] = 2377;
                this.field766[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field766 = new int[4][4];
                this.field766[0][2] = 4096;
                this.field766[0][3] = 0;
                this.field766[1][2] = 4096;
                this.field766[0][1] = 0;
                this.field766[1][3] = 0;
                this.field766[1][1] = 4096;
                this.field766[2][2] = 4096;
                this.field766[0][0] = 2048;
                this.field766[2][1] = 4096;
                this.field766[2][3] = 0;
                this.field766[3][3] = 0;
                this.field766[1][0] = 2867;
                this.field766[3][2] = 0;
                this.field766[3][1] = 4096;
                this.field766[2][0] = 3276;
                this.field766[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1) {
            field774 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(B)V", line = 404)
    public final void method319(byte arg0) {
        if (arg0 > -9) {
            return;
        }
        field775++;
        if (this.field766 == null) {
            this.method359(1, false);
        }
        this.method358(true);
    }

    @OriginalMember(owner = "client!ik", name = "a", descriptor = "(BIIIIII)I", line = 428)
    public static final int method360(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field768++;
        if (arg0 != 113) {
            method360((byte) -47, 110, -114, 57, -114, 22, 117);
        }
        int var7 = arg5 & 0x3;
        if ((arg2 & 0x1) == 1) {
            int var8 = arg1;
            arg1 = arg4;
            arg4 = var8;
        }
        if (var7 == 0) {
            return arg6;
        } else if (var7 == 1) {
            return arg3;
        } else if (var7 == 2) {
            return 7 - arg6 - (arg1 + -1);
        } else {
            return 1 + 7 - arg3 - arg4;
        }
    }

    @OriginalMember(owner = "client!ik", name = "f", descriptor = "(I)V", line = 502)
    public static void method361(int arg0) {
        field767 = null;
        field763 = null;
        field771 = null;
        field774 = null;
        field769 = (int[][]) null;
        if (arg0 != -19724) {
            field767 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ik", name = "c", descriptor = "(II)[[I", line = 525)
    public final int[][] method87(int arg0, int arg1) {
        field773++;
        int[][] var3 = this.field4786.method1427(0, arg1);
        if (arg0 != -7523) {
            this.method358(true);
        }
        if (this.field4786.field3297) {
            int[] var4 = this.method1960(-123, arg1, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class56.field835; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field762[var9];
                var5[var8] = class93.method680(var10, 16711680) >> 12;
                var6[var8] = class93.method680(var10, 65280) >> 4;
                var7[var8] = class93.method680(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!ik", name = "g", descriptor = "(I)V", line = 577)
    public static final void method362(int arg0) {
        if (class227.field3652 != null) {
            class227.field3652.method552(-23825);
        }
        if (class237.field3934 != null) {
            class237.field3934.method552(-23825);
        }
        field760++;
        class113.method810(22050, 2, false, class146.field2386);
        if (arg0 > -109) {
            method360((byte) -36, 124, 98, 122, 44, 84, 124);
        }
        class227.field3652 = class129.method954(class160.field2607, 256, 22050, 0, class308.field5222);
        class227.field3652.method556(class206.field3374, 104);
        class237.field3934 = class129.method954(class160.field2607, 256, 2048, 1, class308.field5222);
        class237.field3934.method556(class222.field3596, 112);
    }
}
