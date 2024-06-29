import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class184 extends class199 {

    @OriginalMember(owner = "client!vm", name = "bb", descriptor = "[I")
    private int[] field2514 = new int[257];

    @OriginalMember(owner = "client!vm", name = "Y", descriptor = "F")
    public static float field2511;

    @OriginalMember(owner = "client!vm", name = "S", descriptor = "I")
    public static int field2505;

    @OriginalMember(owner = "client!vm", name = "T", descriptor = "I")
    public static int field2506;

    @OriginalMember(owner = "client!vm", name = "U", descriptor = "I")
    public static int field2507;

    @OriginalMember(owner = "client!vm", name = "X", descriptor = "I")
    public static int field2510;

    @OriginalMember(owner = "client!vm", name = "Z", descriptor = "I")
    public static int field2512;

    @OriginalMember(owner = "client!vm", name = "ab", descriptor = "I")
    public static int field2513;

    @OriginalMember(owner = "client!vm", name = "cb", descriptor = "I")
    public static int field2515;

    @OriginalMember(owner = "client!vm", name = "V", descriptor = "[I")
    public static int[] field2508;

    @OriginalMember(owner = "client!vm", name = "W", descriptor = "[[I")
    private int[][] field2509;

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(IB)V", line = 4)
    private final void method1338(int arg0, byte arg1) {
        field2515++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2509 = new int[2][4];
                this.field2509[0][0] = 0;
                this.field2509[0][3] = 0;
                this.field2509[0][1] = 0;
                this.field2509[1][0] = 4096;
                this.field2509[0][2] = 0;
                this.field2509[1][2] = 4096;
                this.field2509[1][1] = 4096;
                this.field2509[1][3] = 4096;
            } else if (arg0 == 2) {
                this.field2509 = new int[8][4];
                this.field2509[0][0] = 0;
                this.field2509[0][1] = 2650;
                this.field2509[0][2] = 2602;
                this.field2509[1][0] = 2867;
                this.field2509[2][0] = 3072;
                this.field2509[1][2] = 1799;
                this.field2509[1][1] = 2313;
                this.field2509[2][2] = 1734;
                this.field2509[3][2] = 1220;
                this.field2509[4][2] = 963;
                this.field2509[0][3] = 2361;
                this.field2509[5][2] = 2152;
                this.field2509[3][0] = 3276;
                this.field2509[2][1] = 2618;
                this.field2509[6][2] = 1060;
                this.field2509[4][0] = 3481;
                this.field2509[1][3] = 1558;
                this.field2509[7][2] = 1413;
                this.field2509[5][0] = 3686;
                this.field2509[6][0] = 3891;
                this.field2509[7][0] = 4096;
                this.field2509[3][1] = 2296;
                this.field2509[2][3] = 1413;
                this.field2509[3][3] = 947;
                this.field2509[4][1] = 2072;
                this.field2509[5][1] = 2730;
                this.field2509[6][1] = 2232;
                this.field2509[7][1] = 1686;
                this.field2509[4][3] = 722;
                this.field2509[5][3] = 1766;
                this.field2509[6][3] = 915;
                this.field2509[7][3] = 1140;
            } else if (arg0 == 3) {
                this.field2509 = new int[7][4];
                this.field2509[0][3] = 4096;
                this.field2509[0][2] = 0;
                this.field2509[1][3] = 4096;
                this.field2509[2][3] = 0;
                this.field2509[0][0] = 0;
                this.field2509[3][3] = 0;
                this.field2509[4][3] = 0;
                this.field2509[1][2] = 4096;
                this.field2509[2][2] = 4096;
                this.field2509[5][3] = 4096;
                this.field2509[3][2] = 4096;
                this.field2509[0][1] = 0;
                this.field2509[1][0] = 663;
                this.field2509[1][1] = 0;
                this.field2509[6][3] = 4096;
                this.field2509[2][1] = 0;
                this.field2509[4][2] = 0;
                this.field2509[5][2] = 0;
                this.field2509[2][0] = 1363;
                this.field2509[3][0] = 2048;
                this.field2509[3][1] = 4096;
                this.field2509[4][0] = 2727;
                this.field2509[6][2] = 0;
                this.field2509[4][1] = 4096;
                this.field2509[5][0] = 3411;
                this.field2509[6][0] = 4096;
                this.field2509[5][1] = 4096;
                this.field2509[6][1] = 0;
            } else if (arg0 == 4) {
                this.field2509 = new int[6][4];
                this.field2509[0][0] = 0;
                this.field2509[0][1] = 0;
                this.field2509[0][2] = 0;
                this.field2509[1][2] = 0;
                this.field2509[0][3] = 0;
                this.field2509[1][0] = 1843;
                this.field2509[1][1] = 0;
                this.field2509[2][0] = 2457;
                this.field2509[1][3] = 1493;
                this.field2509[2][1] = 0;
                this.field2509[3][1] = 0;
                this.field2509[2][2] = 0;
                this.field2509[3][2] = 1124;
                this.field2509[3][0] = 2781;
                this.field2509[2][3] = 2939;
                this.field2509[3][3] = 3565;
                this.field2509[4][0] = 3481;
                this.field2509[5][0] = 4096;
                this.field2509[4][3] = 4031;
                this.field2509[4][2] = 3084;
                this.field2509[4][1] = 546;
                this.field2509[5][2] = 4096;
                this.field2509[5][3] = 4096;
                this.field2509[5][1] = 4096;
            } else if (arg0 == 5) {
                this.field2509 = new int[16][4];
                this.field2509[0][2] = 192;
                this.field2509[0][1] = 80;
                this.field2509[0][3] = 321;
                this.field2509[0][0] = 0;
                this.field2509[1][2] = 449;
                this.field2509[1][1] = 321;
                this.field2509[2][1] = 578;
                this.field2509[1][3] = 562;
                this.field2509[2][2] = 690;
                this.field2509[2][3] = 803;
                this.field2509[3][3] = 1140;
                this.field2509[3][1] = 947;
                this.field2509[3][2] = 995;
                this.field2509[1][0] = 155;
                this.field2509[2][0] = 389;
                this.field2509[3][0] = 671;
                this.field2509[4][2] = 1397;
                this.field2509[5][2] = 1429;
                this.field2509[4][0] = 897;
                this.field2509[4][3] = 1509;
                this.field2509[6][2] = 1461;
                this.field2509[5][3] = 1413;
                this.field2509[4][1] = 1285;
                this.field2509[6][3] = 1333;
                this.field2509[5][0] = 1175;
                this.field2509[7][3] = 1702;
                this.field2509[8][3] = 2056;
                this.field2509[6][0] = 1368;
                this.field2509[9][3] = 2666;
                this.field2509[10][3] = 3276;
                this.field2509[5][1] = 1525;
                this.field2509[7][0] = 1507;
                this.field2509[7][2] = 1525;
                this.field2509[6][1] = 1734;
                this.field2509[11][3] = 3228;
                this.field2509[8][0] = 1736;
                this.field2509[9][0] = 2088;
                this.field2509[7][1] = 1413;
                this.field2509[8][2] = 1590;
                this.field2509[9][2] = 2056;
                this.field2509[8][1] = 1108;
                this.field2509[10][0] = 2355;
                this.field2509[9][1] = 1766;
                this.field2509[11][0] = 2691;
                this.field2509[10][1] = 2409;
                this.field2509[12][0] = 3031;
                this.field2509[13][0] = 3522;
                this.field2509[10][2] = 2586;
                this.field2509[11][1] = 3116;
                this.field2509[11][2] = 3148;
                this.field2509[12][3] = 3196;
                this.field2509[14][0] = 3727;
                this.field2509[15][0] = 4096;
                this.field2509[12][2] = 3710;
                this.field2509[13][3] = 3019;
                this.field2509[13][2] = 3421;
                this.field2509[12][1] = 3806;
                this.field2509[14][3] = 3228;
                this.field2509[15][3] = 2746;
                this.field2509[13][1] = 3437;
                this.field2509[14][1] = 3116;
                this.field2509[15][1] = 2377;
                this.field2509[14][2] = 3148;
                this.field2509[15][2] = 2505;
            } else if (arg0 == 6) {
                this.field2509 = new int[4][4];
                this.field2509[0][3] = 0;
                this.field2509[0][1] = 0;
                this.field2509[1][3] = 0;
                this.field2509[0][2] = 4096;
                this.field2509[1][2] = 4096;
                this.field2509[2][3] = 0;
                this.field2509[2][2] = 4096;
                this.field2509[0][0] = 2048;
                this.field2509[3][3] = 0;
                this.field2509[1][1] = 4096;
                this.field2509[3][2] = 0;
                this.field2509[1][0] = 2867;
                this.field2509[2][1] = 4096;
                this.field2509[3][1] = 4096;
                this.field2509[2][0] = 3276;
                this.field2509[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        int var4 = -124 % ((78 - arg1) / 36);
    }

    @OriginalMember(owner = "client!vm", name = "f", descriptor = "(I)V", line = 256)
    private final void method1339(int arg0) {
        field2510++;
        int var2 = this.field2509.length;
        if (arg0 < 33 || var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field2509[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var4) {
                int[] var7 = this.field2509[var2 - 1];
                var8 = var7[3];
                var9 = var7[1];
                var10 = var7[2];
            } else {
                int[] var11 = this.field2509[var4];
                if (var4 <= 0) {
                    var10 = var11[2];
                    var9 = var11[1];
                    var8 = var11[3];
                } else {
                    int[] var12 = this.field2509[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var9 = var11[1] * var13 + var12[1] * var14 >> 12;
                    var8 = var11[3] * var13 + (var12[3] * var14) >> 12;
                }
            }
            int var15 = var10 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var8 >> 4;
            int var17 = var9 >> 4;
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
            this.field2514[var3] = class80.method568(var16, class80.method568(var15 << 8, var17 << 16));
        }
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(Lld;Lfh;Lfh;ZLfh;)Z", line = 356)
    public static final boolean method1340(class207 arg0, class140 arg1, class140 arg2, boolean arg3, class140 arg4) {
        class360.field5630 = arg0;
        field2506++;
        if (arg3) {
            method1341(41);
        }
        class44.field541 = arg1;
        class156.field2160 = arg4;
        class229.field3278 = arg2;
        return true;
    }

    @OriginalMember(owner = "client!vm", name = "e", descriptor = "(B)V", line = 375)
    public final void method189(byte arg0) {
        field2513++;
        int var2 = 40 % ((arg0 - 36) / 44);
        if (this.field2509 == null) {
            this.method1338(1, (byte) -68);
        }
        this.method1339(43);
    }

    @OriginalMember(owner = "client!vm", name = "g", descriptor = "(I)V", line = 390)
    public static void method1341(int arg0) {
        if (arg0 < 108) {
            method1340((class207) null, (class140) null, (class140) null, true, (class140) null);
        }
        field2508 = null;
    }

    @OriginalMember(owner = "client!vm", name = "a", descriptor = "(BLfd;I)V", line = 403)
    public final void method193(byte arg0, class299 arg1, int arg2) {
        if (arg0 != -43) {
            return;
        }
        if (arg2 == 0) {
            int var4 = arg1.method2096((byte) -122);
            if (var4 == 0) {
                this.field2509 = new int[arg1.method2096((byte) -122)][4];
                for (int var5 = 0; var5 < this.field2509.length; var5++) {
                    this.field2509[var5][0] = arg1.method2083((byte) -95);
                    this.field2509[var5][1] = arg1.method2096((byte) -122) << 4;
                    this.field2509[var5][2] = arg1.method2096((byte) -122) << 4;
                    this.field2509[var5][3] = arg1.method2096((byte) -122) << 4;
                }
            } else {
                this.method1338(var4, (byte) 121);
            }
        }
        field2505++;
    }

    @OriginalMember(owner = "client!vm", name = "c", descriptor = "(II)V", line = 447)
    public static final void method1342(int arg0, int arg1) {
        if (arg0 != 3) {
            field2508 = (int[]) null;
        }
        field2507++;
        class307 var2 = class226.field3250;
        synchronized (class226.field3250) {
            class193.field2671 = arg1;
        }
    }

    @OriginalMember(owner = "client!vm", name = "<init>", descriptor = "()V", line = 461)
    public class184() {
        super(1, false);
    }

    @OriginalMember(owner = "client!vm", name = "b", descriptor = "(II)[[I", line = 469)
    public final int[][] method215(int arg0, int arg1) {
        if (arg1 != -29869) {
            this.method1339(118);
        }
        int[][] var3 = this.field2796.method2187(arg0, arg1 ^ 0x74FA);
        if (this.field2796.field4667) {
            int[] var4 = this.method1467(-7764, arg0, 0);
            int[] var5 = var3[1];
            int[] var6 = var3[2];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class95.field1235; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field2514[var9];
                var7[var8] = class335.method2339(16711680, var10) >> 12;
                var5[var8] = class335.method2339(var10, 65280) >> 4;
                var6[var8] = class335.method2339(var10 << 4, 4080);
            }
        }
        field2512++;
        return var3;
    }
}
