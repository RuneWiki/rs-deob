import java.math.BigInteger;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hk")
public class class91 extends class195 {

    @OriginalMember(owner = "client!hk", name = "db", descriptor = "[I")
    private int[] field1414 = new int[257];

    @OriginalMember(owner = "client!hk", name = "W", descriptor = "Ljava/math/BigInteger;")
    public static BigInteger field1407 = new BigInteger("9431484119947534773405476242098823416177206852045075556673005859802229236458585051597844837479119770056361726819094346360070592289857694387401749674169083");

    @OriginalMember(owner = "client!hk", name = "gb", descriptor = "[I")
    public static int[] field1417 = new int[] { 0, 0, 4, 0, 0, 0, 0, 8, 0, 6, 3, 10, 0, 0, 0, -2, 0, 3, 0, 0, 6, 4, 0, 0, 0, 0, 0, -1, 4, 5, -2, 0, 0, 0, 5, 0, 6, 0, 0, -1, -2, 0, 0, 0, -2, 0, 1, 0, 0, 0, 0, 3, 0, 0, 0, 3, 0, 0, 0, 5, 0, 0, -1, 0, 0, 0, 2, 0, 0, 0, 8, 6, 7, 0, 0, 0, 0, 0, 0, 0, 7, 0, 3, 0, -2, 0, 0, 4, 6, 4, 0, 0, 0, 0, 7, 0, 0, 2, 0, 0, 0, 5, -2, 0, 20, 0, 0, 0, 0, -1, 0, 0, 9, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, 0, -1, 0, 5, 0, 0, -1, -2, 0, -1, 4, 0, 0, 8, -2, 0, 0, 6, 0, 3, 2, 2, 0, 0, 10, 0, 10, 6, 0, 0, 0, 0, 0, 0, 0, -1, 0, 0, 0, 0, 0, 2, 15, 0, 7, 0, 6, 0, -1, 5, 24, 0, 0, -2, 0, 0, 0, 0, 0, 8, 0, -2, 0, 0, 0, 0, 0, 0, 0, 0, 0, 6, 0, 0, 2, 0, 0, 14, 0, 4, 5, 0, 6, -1, 0, 4, 0, 1, 0, 0, 8, 12, 2, 0, 0, -1, 1, 0, 4, 0, 0, 0, -2, -2, 6, 0, 0, -2, 6, -1, 0, 1, 1, 0, -2, 0, 6, -1, 0, -1, 0, -1, 0, 0, 0, 0, 0, 0, 15, 0 };

    @OriginalMember(owner = "client!hk", name = "fb", descriptor = "Lvk;")
    public static class67 field1416 = new class67(50);

    @OriginalMember(owner = "client!hk", name = "hb", descriptor = "I")
    public static int field1418 = 0;

    @OriginalMember(owner = "client!hk", name = "ib", descriptor = "Z")
    public static boolean field1419 = false;

    @OriginalMember(owner = "client!hk", name = "U", descriptor = "I")
    public static int field1405;

    @OriginalMember(owner = "client!hk", name = "X", descriptor = "I")
    public static int field1408;

    @OriginalMember(owner = "client!hk", name = "Y", descriptor = "I")
    public static int field1409;

    @OriginalMember(owner = "client!hk", name = "Z", descriptor = "I")
    public static int field1410;

    @OriginalMember(owner = "client!hk", name = "ab", descriptor = "I")
    public static int field1411;

    @OriginalMember(owner = "client!hk", name = "bb", descriptor = "I")
    public static int field1412;

    @OriginalMember(owner = "client!hk", name = "cb", descriptor = "I")
    public static int field1413;

    @OriginalMember(owner = "client!hk", name = "eb", descriptor = "I")
    public static int field1415;

    @OriginalMember(owner = "client!hk", name = "V", descriptor = "[[I")
    private int[][] field1406;

    @OriginalMember(owner = "client!hk", name = "d", descriptor = "(I)V", line = 15)
    public final void method14(int arg0) {
        if (this.field1406 == null) {
            this.method625(1, true);
        }
        if (arg0 != 2048879374) {
            this.method13((class3) null, 114, 97);
        }
        field1413++;
        this.method628(155);
    }

    @OriginalMember(owner = "client!hk", name = "e", descriptor = "(I)V", line = 30)
    public static final void method624(int arg0) {
        if (arg0 != 4096) {
            field1419 = false;
        }
        if (class195.field3110 != null) {
            class195.field3110.method300(false);
        }
        field1408++;
        if (class49.field767 != null) {
            class49.field767.method300(false);
        }
    }

    @OriginalMember(owner = "client!hk", name = "b", descriptor = "(IZ)V", line = 48)
    private final void method625(int arg0, boolean arg1) {
        field1409++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1406 = new int[2][4];
                this.field1406[0][3] = 0;
                this.field1406[1][3] = 4096;
                this.field1406[0][1] = 0;
                this.field1406[0][0] = 0;
                this.field1406[1][1] = 4096;
                this.field1406[1][0] = 4096;
                this.field1406[0][2] = 0;
                this.field1406[1][2] = 4096;
            } else if (arg0 == 2) {
                this.field1406 = new int[8][4];
                this.field1406[0][0] = 0;
                this.field1406[0][3] = 2361;
                this.field1406[1][0] = 2867;
                this.field1406[0][2] = 2602;
                this.field1406[1][2] = 1799;
                this.field1406[2][0] = 3072;
                this.field1406[1][3] = 1558;
                this.field1406[2][2] = 1734;
                this.field1406[2][3] = 1413;
                this.field1406[0][1] = 2650;
                this.field1406[3][2] = 1220;
                this.field1406[3][0] = 3276;
                this.field1406[4][2] = 963;
                this.field1406[3][3] = 947;
                this.field1406[4][0] = 3481;
                this.field1406[4][3] = 722;
                this.field1406[5][3] = 1766;
                this.field1406[5][0] = 3686;
                this.field1406[6][0] = 3891;
                this.field1406[5][2] = 2152;
                this.field1406[7][0] = 4096;
                this.field1406[6][2] = 1060;
                this.field1406[6][3] = 915;
                this.field1406[7][3] = 1140;
                this.field1406[1][1] = 2313;
                this.field1406[7][2] = 1413;
                this.field1406[2][1] = 2618;
                this.field1406[3][1] = 2296;
                this.field1406[4][1] = 2072;
                this.field1406[5][1] = 2730;
                this.field1406[6][1] = 2232;
                this.field1406[7][1] = 1686;
            } else if (arg0 == 3) {
                this.field1406 = new int[7][4];
                this.field1406[0][3] = 4096;
                this.field1406[1][3] = 4096;
                this.field1406[0][2] = 0;
                this.field1406[0][0] = 0;
                this.field1406[2][3] = 0;
                this.field1406[0][1] = 0;
                this.field1406[1][1] = 0;
                this.field1406[3][3] = 0;
                this.field1406[4][3] = 0;
                this.field1406[5][3] = 4096;
                this.field1406[2][1] = 0;
                this.field1406[1][0] = 663;
                this.field1406[1][2] = 4096;
                this.field1406[2][0] = 1363;
                this.field1406[2][2] = 4096;
                this.field1406[3][1] = 4096;
                this.field1406[3][0] = 2048;
                this.field1406[3][2] = 4096;
                this.field1406[4][1] = 4096;
                this.field1406[4][0] = 2727;
                this.field1406[5][0] = 3411;
                this.field1406[6][0] = 4096;
                this.field1406[5][1] = 4096;
                this.field1406[6][1] = 0;
                this.field1406[6][3] = 4096;
                this.field1406[4][2] = 0;
                this.field1406[5][2] = 0;
                this.field1406[6][2] = 0;
            } else if (arg0 == 4) {
                this.field1406 = new int[6][4];
                this.field1406[0][2] = 0;
                this.field1406[0][1] = 0;
                this.field1406[0][0] = 0;
                this.field1406[1][1] = 0;
                this.field1406[0][3] = 0;
                this.field1406[2][1] = 0;
                this.field1406[1][3] = 1493;
                this.field1406[2][3] = 2939;
                this.field1406[1][2] = 0;
                this.field1406[3][3] = 3565;
                this.field1406[3][1] = 0;
                this.field1406[4][3] = 4031;
                this.field1406[1][0] = 1843;
                this.field1406[4][1] = 546;
                this.field1406[2][0] = 2457;
                this.field1406[5][3] = 4096;
                this.field1406[2][2] = 0;
                this.field1406[3][0] = 2781;
                this.field1406[3][2] = 1124;
                this.field1406[5][1] = 4096;
                this.field1406[4][0] = 3481;
                this.field1406[4][2] = 3084;
                this.field1406[5][0] = 4096;
                this.field1406[5][2] = 4096;
            } else if (arg0 == 5) {
                this.field1406 = new int[16][4];
                this.field1406[0][2] = 192;
                this.field1406[0][1] = 80;
                this.field1406[0][0] = 0;
                this.field1406[0][3] = 321;
                this.field1406[1][0] = 155;
                this.field1406[2][0] = 389;
                this.field1406[1][3] = 562;
                this.field1406[2][3] = 803;
                this.field1406[3][3] = 1140;
                this.field1406[1][1] = 321;
                this.field1406[3][0] = 671;
                this.field1406[1][2] = 449;
                this.field1406[2][2] = 690;
                this.field1406[2][1] = 578;
                this.field1406[3][1] = 947;
                this.field1406[4][3] = 1509;
                this.field1406[5][3] = 1413;
                this.field1406[4][1] = 1285;
                this.field1406[4][0] = 897;
                this.field1406[5][0] = 1175;
                this.field1406[6][0] = 1368;
                this.field1406[3][2] = 995;
                this.field1406[5][1] = 1525;
                this.field1406[6][3] = 1333;
                this.field1406[7][0] = 1507;
                this.field1406[4][2] = 1397;
                this.field1406[5][2] = 1429;
                this.field1406[7][3] = 1702;
                this.field1406[6][1] = 1734;
                this.field1406[7][1] = 1413;
                this.field1406[8][1] = 1108;
                this.field1406[6][2] = 1461;
                this.field1406[8][0] = 1736;
                this.field1406[8][3] = 2056;
                this.field1406[9][3] = 2666;
                this.field1406[9][0] = 2088;
                this.field1406[10][3] = 3276;
                this.field1406[10][0] = 2355;
                this.field1406[7][2] = 1525;
                this.field1406[8][2] = 1590;
                this.field1406[9][2] = 2056;
                this.field1406[9][1] = 1766;
                this.field1406[11][3] = 3228;
                this.field1406[10][2] = 2586;
                this.field1406[12][3] = 3196;
                this.field1406[13][3] = 3019;
                this.field1406[11][0] = 2691;
                this.field1406[11][2] = 3148;
                this.field1406[12][2] = 3710;
                this.field1406[14][3] = 3228;
                this.field1406[10][1] = 2409;
                this.field1406[15][3] = 2746;
                this.field1406[12][0] = 3031;
                this.field1406[13][0] = 3522;
                this.field1406[11][1] = 3116;
                this.field1406[12][1] = 3806;
                this.field1406[13][2] = 3421;
                this.field1406[14][2] = 3148;
                this.field1406[15][2] = 2505;
                this.field1406[13][1] = 3437;
                this.field1406[14][0] = 3727;
                this.field1406[15][0] = 4096;
                this.field1406[14][1] = 3116;
                this.field1406[15][1] = 2377;
            } else if (arg0 == 6) {
                this.field1406 = new int[4][4];
                this.field1406[0][2] = 4096;
                this.field1406[0][3] = 0;
                this.field1406[0][1] = 0;
                this.field1406[1][3] = 0;
                this.field1406[1][1] = 4096;
                this.field1406[1][2] = 4096;
                this.field1406[2][3] = 0;
                this.field1406[2][1] = 4096;
                this.field1406[3][1] = 4096;
                this.field1406[2][2] = 4096;
                this.field1406[0][0] = 2048;
                this.field1406[3][3] = 0;
                this.field1406[1][0] = 2867;
                this.field1406[2][0] = 3276;
                this.field1406[3][0] = 4096;
                this.field1406[3][2] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (!arg1) {
            field1417 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!hk", name = "c", descriptor = "(B)V", line = 298)
    public static void method626(byte arg0) {
        field1416 = null;
        if (arg0 != -99) {
            field1417 = (int[]) null;
        }
        field1417 = null;
        field1407 = null;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(Lfj;II)V", line = 322)
    public final void method13(class3 arg0, int arg1, int arg2) {
        if (arg1 > -117) {
            field1416 = (class67) null;
        }
        if (arg2 == 0) {
            int var4 = arg0.method64((byte) 108);
            if (var4 == 0) {
                this.field1406 = new int[arg0.method64((byte) -99)][4];
                for (int var5 = 0; var5 < this.field1406.length; var5++) {
                    this.field1406[var5][0] = arg0.method63((byte) 1);
                    this.field1406[var5][1] = arg0.method64((byte) -87) << 4;
                    this.field1406[var5][2] = arg0.method64((byte) -97) << 4;
                    this.field1406[var5][3] = arg0.method64((byte) 6) << 4;
                }
            } else {
                this.method625(var4, true);
            }
        }
        field1405++;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(II)I", line = 359)
    public static final int method627(int arg0, int arg1) {
        int var2 = (arg0 >>> 1 & 0x55555555) + (arg0 & 0x55555555);
        if (arg1 != -27468) {
            field1418 = 77;
        }
        field1412++;
        int var3 = (var2 & 0x33333333) + ((var2 & 0xCCCCCCCC) >>> 2);
        int var4 = (var3 >>> 4) + var3 & 0xF0F0F0F;
        int var5 = (var4 >>> 8) + var4;
        int var6 = (var5 >>> 16) + var5;
        return var6 & 0xFF;
    }

    @OriginalMember(owner = "client!hk", name = "<init>", descriptor = "()V", line = 379)
    public class91() {
        super(1, false);
    }

    @OriginalMember(owner = "client!hk", name = "f", descriptor = "(I)V", line = 384)
    private final void method628(int arg0) {
        field1411++;
        if (arg0 != 155) {
            this.field1414 = (int[]) null;
        }
        int var2 = this.field1406.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var2 > var6 && var5 >= this.field1406[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 <= var4) {
                int[] var7 = this.field1406[var2 - 1];
                var8 = var7[3];
                var9 = var7[2];
                var10 = var7[1];
            } else {
                int[] var11 = this.field1406[var4];
                if (var4 > 0) {
                    int[] var12 = this.field1406[var4 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var11[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var9 = var11[2] * var13 + var12[2] * var14 >> 12;
                    var10 = var11[1] * var13 + (var12[1] * var14) >> 12;
                    var8 = var11[3] * var13 + var12[3] * var14 >> 12;
                } else {
                    var10 = var11[1];
                    var8 = var11[3];
                    var9 = var11[2];
                }
            }
            int var15 = var9 >> 4;
            int var16 = var10 >> 4;
            int var17 = var8 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            this.field1414[var3] = class156.method998(var17, class156.method998(var15 << 8, var16 << 16));
        }
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(JI)V", line = 487)
    public static final void method629(long arg0, int arg1) {
        field1410++;
        class86.method574(1);
        if (arg1 > -57) {
            field1417 = (int[]) null;
        }
        class6.field149.field44 = 0;
        class6.field149.method32(228, (byte) -99);
        class6.field149.method29(2069, arg0);
        class42.field644 = 1;
        class211.field3366 = 2;
    }

    @OriginalMember(owner = "client!hk", name = "a", descriptor = "(BI)[[I", line = 503)
    public final int[][] method9(byte arg0, int arg1) {
        field1415++;
        if (arg0 != 3) {
            return (int[][]) ((int[][]) null);
        }
        int[][] var3 = this.field3126.method603(arg1, -126);
        if (this.field3126.field1372) {
            int[] var4 = this.method1253(0, 125, arg1);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class157.field2504; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1414[var9];
                var5[var8] = class19.method151(var10 >> 12, 4080);
                var6[var8] = class19.method151(4080, var10 >> 4);
                var7[var8] = class19.method151(var10, 255) << 4;
            }
        }
        return var3;
    }
}
