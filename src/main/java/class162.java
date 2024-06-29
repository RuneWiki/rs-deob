import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class162 extends class224 {

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "[I")
    private int[] field2624 = new int[257];

    @OriginalMember(owner = "client!hk", name = "R", descriptor = "[J")
    public static long[] field2618 = new long[100];

    @OriginalMember(owner = "client!hk", name = "S", descriptor = "I")
    public static int field2619;

    @OriginalMember(owner = "client!hk", name = "T", descriptor = "I")
    public static int field2620;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field2621;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "I")
    public static int field2622;

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "I")
    public static int field2623;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field2626;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field2627;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
    public static int field2628;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field2629;

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "I")
    public static int field2630;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "[[I")
    private int[][] field2625;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 6)
    private final void method1141(int arg0) {
        if (arg0 != -3576) {
            this.method17(99, (byte) 67);
        }
        field2621++;
        int var2 = this.field2625.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = var3 << 4;
            int var5 = 0;
            for (int var6 = 0; var2 > var6 && this.field2625[var6][0] <= var4; var6++) {
                var5++;
            }
            int var8;
            int var9;
            int var10;
            if (var5 >= var2) {
                int[] var7 = this.field2625[var2 - 1];
                var8 = var7[3];
                var9 = var7[2];
                var10 = var7[1];
            } else {
                int[] var11 = this.field2625[var5];
                if (var5 > 0) {
                    int[] var12 = this.field2625[var5 - 1];
                    int var13 = (var4 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                    var10 = var11[1] * var13 + var12[1] * var14 >> 12;
                } else {
                    var10 = var11[1];
                    var8 = var11[3];
                    var9 = var11[2];
                }
            }
            int var15 = var8 >> 4;
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
            int var17 = var9 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2624[var3] = class80.method492(var15, class80.method492(var17 << 8, var16 << 16));
        }
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)Z", line = 109)
    public static final boolean method1142(int arg0) {
        field2630++;
        if (arg0 >= -20) {
            method1145((byte) -69);
        }
        if (class67.field888 != 0) {
            try {
                class46.field565.method1180(0, class51.field622.field1000);
                return true;
            } catch (Throwable var2) {
            }
        }
        return false;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Z)V", line = 140)
    public final void method80(boolean arg0) {
        if (arg0) {
            field2618 = (long[]) null;
        }
        field2622++;
        if (this.field2625 == null) {
            this.method1144((byte) -79, 1);
        }
        this.method1141(-3576);
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V", line = 155)
    public static void method1143(int arg0) {
        if (arg0 < 48) {
            method1146(15, false, -119, -44, -113, -106, (byte) 3);
        }
        field2618 = null;
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(BI)V", line = 170)
    private final void method1144(byte arg0, int arg1) {
        if (arg0 >= -8) {
            return;
        }
        field2619++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field2625 = new int[2][4];
            this.field2625[0][0] = 0;
            this.field2625[1][0] = 4096;
            this.field2625[0][1] = 0;
            this.field2625[1][1] = 4096;
            this.field2625[0][2] = 0;
            this.field2625[0][3] = 0;
            this.field2625[1][2] = 4096;
            this.field2625[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field2625 = new int[8][4];
            this.field2625[0][0] = 0;
            this.field2625[1][0] = 2867;
            this.field2625[0][1] = 2650;
            this.field2625[2][0] = 3072;
            this.field2625[3][0] = 3276;
            this.field2625[1][1] = 2313;
            this.field2625[0][3] = 2361;
            this.field2625[4][0] = 3481;
            this.field2625[5][0] = 3686;
            this.field2625[1][3] = 1558;
            this.field2625[6][0] = 3891;
            this.field2625[2][3] = 1413;
            this.field2625[7][0] = 4096;
            this.field2625[3][3] = 947;
            this.field2625[4][3] = 722;
            this.field2625[5][3] = 1766;
            this.field2625[0][2] = 2602;
            this.field2625[2][1] = 2618;
            this.field2625[3][1] = 2296;
            this.field2625[6][3] = 915;
            this.field2625[7][3] = 1140;
            this.field2625[1][2] = 1799;
            this.field2625[4][1] = 2072;
            this.field2625[2][2] = 1734;
            this.field2625[5][1] = 2730;
            this.field2625[3][2] = 1220;
            this.field2625[4][2] = 963;
            this.field2625[6][1] = 2232;
            this.field2625[7][1] = 1686;
            this.field2625[5][2] = 2152;
            this.field2625[6][2] = 1060;
            this.field2625[7][2] = 1413;
        } else if (arg1 == 3) {
            this.field2625 = new int[7][4];
            this.field2625[0][0] = 0;
            this.field2625[1][0] = 663;
            this.field2625[0][2] = 0;
            this.field2625[0][3] = 4096;
            this.field2625[1][2] = 4096;
            this.field2625[1][3] = 4096;
            this.field2625[2][2] = 4096;
            this.field2625[2][0] = 1363;
            this.field2625[2][3] = 0;
            this.field2625[3][0] = 2048;
            this.field2625[0][1] = 0;
            this.field2625[1][1] = 0;
            this.field2625[4][0] = 2727;
            this.field2625[5][0] = 3411;
            this.field2625[3][2] = 4096;
            this.field2625[2][1] = 0;
            this.field2625[3][1] = 4096;
            this.field2625[4][1] = 4096;
            this.field2625[6][0] = 4096;
            this.field2625[3][3] = 0;
            this.field2625[4][3] = 0;
            this.field2625[4][2] = 0;
            this.field2625[5][1] = 4096;
            this.field2625[6][1] = 0;
            this.field2625[5][2] = 0;
            this.field2625[6][2] = 0;
            this.field2625[5][3] = 4096;
            this.field2625[6][3] = 4096;
        } else if (arg1 == 4) {
            this.field2625 = new int[6][4];
            this.field2625[0][1] = 0;
            this.field2625[0][3] = 0;
            this.field2625[0][0] = 0;
            this.field2625[1][0] = 1843;
            this.field2625[1][3] = 1493;
            this.field2625[2][3] = 2939;
            this.field2625[0][2] = 0;
            this.field2625[1][2] = 0;
            this.field2625[1][1] = 0;
            this.field2625[2][0] = 2457;
            this.field2625[3][0] = 2781;
            this.field2625[2][2] = 0;
            this.field2625[4][0] = 3481;
            this.field2625[3][3] = 3565;
            this.field2625[4][3] = 4031;
            this.field2625[5][3] = 4096;
            this.field2625[2][1] = 0;
            this.field2625[5][0] = 4096;
            this.field2625[3][1] = 0;
            this.field2625[4][1] = 546;
            this.field2625[3][2] = 1124;
            this.field2625[4][2] = 3084;
            this.field2625[5][1] = 4096;
            this.field2625[5][2] = 4096;
        } else if (arg1 == 5) {
            this.field2625 = new int[16][4];
            this.field2625[0][0] = 0;
            this.field2625[0][1] = 80;
            this.field2625[1][1] = 321;
            this.field2625[2][1] = 578;
            this.field2625[0][2] = 192;
            this.field2625[0][3] = 321;
            this.field2625[1][3] = 562;
            this.field2625[3][1] = 947;
            this.field2625[1][2] = 449;
            this.field2625[4][1] = 1285;
            this.field2625[2][2] = 690;
            this.field2625[2][3] = 803;
            this.field2625[3][3] = 1140;
            this.field2625[4][3] = 1509;
            this.field2625[5][3] = 1413;
            this.field2625[6][3] = 1333;
            this.field2625[1][0] = 155;
            this.field2625[5][1] = 1525;
            this.field2625[6][1] = 1734;
            this.field2625[2][0] = 389;
            this.field2625[3][0] = 671;
            this.field2625[3][2] = 995;
            this.field2625[4][2] = 1397;
            this.field2625[5][2] = 1429;
            this.field2625[4][0] = 897;
            this.field2625[7][1] = 1413;
            this.field2625[7][3] = 1702;
            this.field2625[6][2] = 1461;
            this.field2625[8][3] = 2056;
            this.field2625[7][2] = 1525;
            this.field2625[9][3] = 2666;
            this.field2625[10][3] = 3276;
            this.field2625[5][0] = 1175;
            this.field2625[8][2] = 1590;
            this.field2625[8][1] = 1108;
            this.field2625[9][2] = 2056;
            this.field2625[11][3] = 3228;
            this.field2625[12][3] = 3196;
            this.field2625[6][0] = 1368;
            this.field2625[10][2] = 2586;
            this.field2625[13][3] = 3019;
            this.field2625[14][3] = 3228;
            this.field2625[11][2] = 3148;
            this.field2625[7][0] = 1507;
            this.field2625[9][1] = 1766;
            this.field2625[10][1] = 2409;
            this.field2625[12][2] = 3710;
            this.field2625[15][3] = 2746;
            this.field2625[13][2] = 3421;
            this.field2625[14][2] = 3148;
            this.field2625[11][1] = 3116;
            this.field2625[15][2] = 2505;
            this.field2625[8][0] = 1736;
            this.field2625[9][0] = 2088;
            this.field2625[10][0] = 2355;
            this.field2625[11][0] = 2691;
            this.field2625[12][1] = 3806;
            this.field2625[12][0] = 3031;
            this.field2625[13][0] = 3522;
            this.field2625[14][0] = 3727;
            this.field2625[13][1] = 3437;
            this.field2625[15][0] = 4096;
            this.field2625[14][1] = 3116;
            this.field2625[15][1] = 2377;
        } else if (arg1 == 6) {
            this.field2625 = new int[4][4];
            this.field2625[0][0] = 2048;
            this.field2625[1][0] = 2867;
            this.field2625[0][1] = 0;
            this.field2625[0][2] = 4096;
            this.field2625[1][2] = 4096;
            this.field2625[2][2] = 4096;
            this.field2625[2][0] = 3276;
            this.field2625[3][2] = 0;
            this.field2625[0][3] = 0;
            this.field2625[3][0] = 4096;
            this.field2625[1][3] = 0;
            this.field2625[1][1] = 4096;
            this.field2625[2][3] = 0;
            this.field2625[2][1] = 4096;
            this.field2625[3][1] = 4096;
            this.field2625[3][3] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IB)[[I", line = 424)
    public final int[][] method17(int arg0, byte arg1) {
        field2629++;
        if (arg1 != -77) {
            this.method80(false);
        }
        int[][] var3 = this.field3631.method1587(arg0, 9804);
        if (this.field3631.field3756) {
            int[] var4 = this.method1537(arg0, 0, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class187.field2961; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2624[var9];
                var5[var8] = class159.method1119(var10 >> 12, 4080);
                var7[var8] = class159.method1119(4080, var10 >> 4);
                var6[var8] = class159.method1119(var10, 255) << 4;
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(B)V", line = 475)
    public static final void method1145(byte arg0) {
        field2620++;
        if (class291.field4895 < 0) {
            class148.field2293 = -1;
            class238.field3846 = -1;
            class291.field4895 = 0;
        }
        if (class291.field4895 > class140.field2161) {
            class291.field4895 = class140.field2161;
            class238.field3846 = -1;
            class148.field2293 = -1;
        }
        if (class274.field4602 < 0) {
            class148.field2293 = -1;
            class274.field4602 = 0;
            class238.field3846 = -1;
        }
        if (class274.field4602 > class172.field2801) {
            class274.field4602 = class172.field2801;
            class148.field2293 = -1;
            class238.field3846 = -1;
        }
        if (arg0 > -87) {
            method1146(9, true, 48, 126, 48, 30, (byte) -84);
        }
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 593)
    public class162() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZIIIIB)V", line = 525)
    public static final void method1146(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, byte arg6) {
        class253.field4340 = arg0;
        class266.field4492 = arg3;
        field2627++;
        class92.field1425 = arg5;
        class102.field1580 = arg4;
        class262.field4452 = arg2;
        if (arg1 && class102.field1580 >= 100) {
            class248.field4249 = class262.field4452 * 128 + 64;
            class157.field2483 = class253.field4340 * 128 + 64;
            class143.field2208 = class62.method349(128, class79.field1127, class157.field2483, class248.field4249) - class92.field1425;
        }
        int var7 = -123 % ((3 - arg6) / 56);
        class289.field4867 = 2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(IZLj;)V", line = 549)
    public final void method19(int arg0, boolean arg1, class153 arg2) {
        if (arg0 == 0) {
            int var4 = arg2.method1042((byte) 115);
            if (var4 == 0) {
                this.field2625 = new int[arg2.method1042((byte) -40)][4];
                for (int var5 = 0; var5 < this.field2625.length; var5++) {
                    this.field2625[var5][0] = arg2.method1069(53);
                    this.field2625[var5][1] = arg2.method1042((byte) 113) << 4;
                    this.field2625[var5][2] = arg2.method1042((byte) -96) << 4;
                    this.field2625[var5][3] = arg2.method1042((byte) -45) << 4;
                }
            } else {
                this.method1144((byte) -66, var4);
            }
        }
        field2623++;
        if (arg1) {
            this.field2625 = (int[][]) ((int[][]) null);
        }
    }
}
