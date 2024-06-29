import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pk")
public class class104 extends class261 {

    @OriginalMember(owner = "client!pk", name = "Q", descriptor = "[I")
    private int[] field1755 = new int[257];

    @OriginalMember(owner = "client!pk", name = "M", descriptor = "Lve;")
    public static class255 field1751 = class87.method607(45, ":");

    @OriginalMember(owner = "client!pk", name = "K", descriptor = "Lve;")
    public static class255 field1749 = class87.method607(49, "Lade Texturen )2 ");

    @OriginalMember(owner = "client!pk", name = "H", descriptor = "Lve;")
    private static class255 field1746 = class87.method607(52, "Loaded sprites");

    @OriginalMember(owner = "client!pk", name = "J", descriptor = "Lve;")
    public static class255 field1748 = field1746;

    @OriginalMember(owner = "client!pk", name = "F", descriptor = "I")
    public static int field1744;

    @OriginalMember(owner = "client!pk", name = "G", descriptor = "I")
    public static int field1745;

    @OriginalMember(owner = "client!pk", name = "I", descriptor = "I")
    public static int field1747;

    @OriginalMember(owner = "client!pk", name = "N", descriptor = "I")
    public static int field1752;

    @OriginalMember(owner = "client!pk", name = "O", descriptor = "I")
    public static int field1753;

    @OriginalMember(owner = "client!pk", name = "R", descriptor = "I")
    public static int field1756;

    @OriginalMember(owner = "client!pk", name = "S", descriptor = "I")
    public static int field1757;

    @OriginalMember(owner = "client!pk", name = "L", descriptor = "Lrg;")
    public static class88 field1750;

    @OriginalMember(owner = "client!pk", name = "P", descriptor = "[[I")
    private int[][] field1754;

    @OriginalMember(owner = "client!pk", name = "c", descriptor = "(I)V", line = 9)
    public static void method797(int arg0) {
        field1751 = null;
        field1750 = null;
        field1749 = null;
        field1746 = null;
        field1748 = null;
        if (arg0 != 3) {
            field1748 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "b", descriptor = "(BI)V", line = 28)
    private final void method798(byte arg0, int arg1) {
        field1744++;
        if (arg1 != 0) {
            if (arg1 == 1) {
                this.field1754 = new int[2][4];
                this.field1754[0][2] = 0;
                this.field1754[0][0] = 0;
                this.field1754[0][1] = 0;
                this.field1754[0][3] = 0;
                this.field1754[1][2] = 4096;
                this.field1754[1][1] = 4096;
                this.field1754[1][0] = 4096;
                this.field1754[1][3] = 4096;
            } else if (arg1 == 2) {
                this.field1754 = new int[8][4];
                this.field1754[0][0] = 0;
                this.field1754[0][3] = 2361;
                this.field1754[1][0] = 2867;
                this.field1754[0][2] = 2602;
                this.field1754[1][3] = 1558;
                this.field1754[2][0] = 3072;
                this.field1754[2][3] = 1413;
                this.field1754[3][0] = 3276;
                this.field1754[3][3] = 947;
                this.field1754[4][3] = 722;
                this.field1754[4][0] = 3481;
                this.field1754[5][3] = 1766;
                this.field1754[0][1] = 2650;
                this.field1754[5][0] = 3686;
                this.field1754[6][3] = 915;
                this.field1754[6][0] = 3891;
                this.field1754[1][2] = 1799;
                this.field1754[1][1] = 2313;
                this.field1754[7][3] = 1140;
                this.field1754[7][0] = 4096;
                this.field1754[2][2] = 1734;
                this.field1754[3][2] = 1220;
                this.field1754[2][1] = 2618;
                this.field1754[3][1] = 2296;
                this.field1754[4][1] = 2072;
                this.field1754[4][2] = 963;
                this.field1754[5][2] = 2152;
                this.field1754[5][1] = 2730;
                this.field1754[6][2] = 1060;
                this.field1754[6][1] = 2232;
                this.field1754[7][1] = 1686;
                this.field1754[7][2] = 1413;
            } else if (arg1 == 3) {
                this.field1754 = new int[7][4];
                this.field1754[0][1] = 0;
                this.field1754[0][2] = 0;
                this.field1754[1][2] = 4096;
                this.field1754[2][2] = 4096;
                this.field1754[1][1] = 0;
                this.field1754[3][2] = 4096;
                this.field1754[2][1] = 0;
                this.field1754[4][2] = 0;
                this.field1754[0][0] = 0;
                this.field1754[5][2] = 0;
                this.field1754[0][3] = 4096;
                this.field1754[6][2] = 0;
                this.field1754[3][1] = 4096;
                this.field1754[1][0] = 663;
                this.field1754[2][0] = 1363;
                this.field1754[3][0] = 2048;
                this.field1754[4][0] = 2727;
                this.field1754[1][3] = 4096;
                this.field1754[4][1] = 4096;
                this.field1754[2][3] = 0;
                this.field1754[3][3] = 0;
                this.field1754[4][3] = 0;
                this.field1754[5][1] = 4096;
                this.field1754[5][3] = 4096;
                this.field1754[6][3] = 4096;
                this.field1754[5][0] = 3411;
                this.field1754[6][0] = 4096;
                this.field1754[6][1] = 0;
            } else if (arg1 == 4) {
                this.field1754 = new int[6][4];
                this.field1754[0][1] = 0;
                this.field1754[0][2] = 0;
                this.field1754[1][1] = 0;
                this.field1754[0][3] = 0;
                this.field1754[1][2] = 0;
                this.field1754[0][0] = 0;
                this.field1754[1][0] = 1843;
                this.field1754[2][0] = 2457;
                this.field1754[2][1] = 0;
                this.field1754[3][1] = 0;
                this.field1754[1][3] = 1493;
                this.field1754[4][1] = 546;
                this.field1754[3][0] = 2781;
                this.field1754[2][3] = 2939;
                this.field1754[3][3] = 3565;
                this.field1754[5][1] = 4096;
                this.field1754[4][0] = 3481;
                this.field1754[2][2] = 0;
                this.field1754[4][3] = 4031;
                this.field1754[5][3] = 4096;
                this.field1754[5][0] = 4096;
                this.field1754[3][2] = 1124;
                this.field1754[4][2] = 3084;
                this.field1754[5][2] = 4096;
            } else if (arg1 == 5) {
                this.field1754 = new int[16][4];
                this.field1754[0][0] = 0;
                this.field1754[1][0] = 155;
                this.field1754[0][3] = 321;
                this.field1754[0][1] = 80;
                this.field1754[1][3] = 562;
                this.field1754[2][3] = 803;
                this.field1754[2][0] = 389;
                this.field1754[1][1] = 321;
                this.field1754[3][0] = 671;
                this.field1754[4][0] = 897;
                this.field1754[3][3] = 1140;
                this.field1754[2][1] = 578;
                this.field1754[3][1] = 947;
                this.field1754[0][2] = 192;
                this.field1754[4][1] = 1285;
                this.field1754[5][0] = 1175;
                this.field1754[1][2] = 449;
                this.field1754[6][0] = 1368;
                this.field1754[5][1] = 1525;
                this.field1754[4][3] = 1509;
                this.field1754[6][1] = 1734;
                this.field1754[5][3] = 1413;
                this.field1754[7][0] = 1507;
                this.field1754[7][1] = 1413;
                this.field1754[2][2] = 690;
                this.field1754[6][3] = 1333;
                this.field1754[3][2] = 995;
                this.field1754[8][1] = 1108;
                this.field1754[4][2] = 1397;
                this.field1754[8][0] = 1736;
                this.field1754[7][3] = 1702;
                this.field1754[9][0] = 2088;
                this.field1754[5][2] = 1429;
                this.field1754[9][1] = 1766;
                this.field1754[10][0] = 2355;
                this.field1754[6][2] = 1461;
                this.field1754[11][0] = 2691;
                this.field1754[10][1] = 2409;
                this.field1754[8][3] = 2056;
                this.field1754[7][2] = 1525;
                this.field1754[8][2] = 1590;
                this.field1754[9][3] = 2666;
                this.field1754[12][0] = 3031;
                this.field1754[13][0] = 3522;
                this.field1754[9][2] = 2056;
                this.field1754[10][3] = 3276;
                this.field1754[11][3] = 3228;
                this.field1754[12][3] = 3196;
                this.field1754[13][3] = 3019;
                this.field1754[10][2] = 2586;
                this.field1754[11][1] = 3116;
                this.field1754[11][2] = 3148;
                this.field1754[14][3] = 3228;
                this.field1754[14][0] = 3727;
                this.field1754[12][1] = 3806;
                this.field1754[15][3] = 2746;
                this.field1754[13][1] = 3437;
                this.field1754[15][0] = 4096;
                this.field1754[12][2] = 3710;
                this.field1754[14][1] = 3116;
                this.field1754[15][1] = 2377;
                this.field1754[13][2] = 3421;
                this.field1754[14][2] = 3148;
                this.field1754[15][2] = 2505;
            } else if (arg1 == 6) {
                this.field1754 = new int[4][4];
                this.field1754[0][3] = 0;
                this.field1754[0][1] = 0;
                this.field1754[0][0] = 2048;
                this.field1754[1][1] = 4096;
                this.field1754[0][2] = 4096;
                this.field1754[1][3] = 0;
                this.field1754[1][0] = 2867;
                this.field1754[2][1] = 4096;
                this.field1754[2][3] = 0;
                this.field1754[2][0] = 3276;
                this.field1754[3][3] = 0;
                this.field1754[3][1] = 4096;
                this.field1754[1][2] = 4096;
                this.field1754[3][0] = 4096;
                this.field1754[2][2] = 4096;
                this.field1754[3][2] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg0 <= 73) {
            field1746 = (class255) null;
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(Lpb;BI)V", line = 280)
    public final void method20(class70 arg0, byte arg1, int arg2) {
        if (arg1 > -115) {
            field1751 = (class255) null;
        }
        if (arg2 == 0) {
            int var4 = arg0.method481(0);
            if (var4 == 0) {
                this.field1754 = new int[arg0.method481(0)][4];
                for (int var5 = 0; var5 < this.field1754.length; var5++) {
                    this.field1754[var5][0] = arg0.method423(255);
                    this.field1754[var5][1] = arg0.method481(0) << 4;
                    this.field1754[var5][2] = arg0.method481(0) << 4;
                    this.field1754[var5][3] = arg0.method481(0) << 4;
                }
            } else {
                this.method798((byte) 126, var4);
            }
        }
        field1757++;
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(ZI)[[I", line = 318)
    public final int[][] method13(boolean arg0, int arg1) {
        field1747++;
        int[][] var3 = this.field4418.method35(arg1, 102);
        if (!arg0) {
            field1751 = (class255) null;
        }
        if (this.field4418.field94) {
            int[] var4 = this.method1822(0, 31, arg1);
            int[] var5 = var3[2];
            int[] var6 = var3[1];
            int[] var7 = var3[0];
            for (int var8 = 0; var8 < class92.field1576; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1755[var9];
                var7[var8] = class154.method1134(16711680, var10) >> 12;
                var6[var8] = class154.method1134(4080, var10 >> 4);
                var5[var8] = class154.method1134(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pk", name = "h", descriptor = "(B)V", line = 371)
    private final void method799(byte arg0) {
        field1753++;
        int var2 = -45 % ((-arg0 - 24) / 41);
        int var3 = this.field1754.length;
        if (var3 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = var4 << 4;
            int var6 = 0;
            for (int var7 = 0; var3 > var7 && var5 >= this.field1754[var7][0]; var7++) {
                var6++;
            }
            int var9;
            int var10;
            int var11;
            if (var3 > var6) {
                int[] var8 = this.field1754[var6];
                if (var6 <= 0) {
                    var9 = var8[2];
                    var10 = var8[3];
                    var11 = var8[1];
                } else {
                    int[] var12 = this.field1754[var6 - 1];
                    int var13 = (var5 - var12[0] << 12) / (var8[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var11 = var8[1] * var13 + var12[1] * var14 >> 12;
                    var9 = var8[2] * var13 + var12[2] * var14 >> 12;
                    var10 = var8[3] * var13 + var12[3] * var14 >> 12;
                }
            } else {
                int[] var15 = this.field1754[var3 - 1];
                var9 = var15[2];
                var10 = var15[3];
                var11 = var15[1];
            }
            int var16 = var11 >> 4;
            int var17 = var9 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var18 = var10 >> 4;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field1755[var4] = class264.method1836(var18, class264.method1836(var17 << 8, var16 << 16));
        }
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(IB)V", line = 485)
    public static final void method800(int arg0, byte arg1) {
        class92.field1579.method562((byte) 56, arg0);
        int var2 = -23 / ((arg1 - 44) / 37);
        class121.field2014.method562((byte) 112, arg0);
        class68.field1015.method562((byte) 73, arg0);
        field1752++;
    }

    @OriginalMember(owner = "client!pk", name = "g", descriptor = "(B)V", line = 504)
    public final void method111(byte arg0) {
        if (this.field1754 == null) {
            this.method798((byte) 126, 1);
        }
        field1756++;
        if (arg0 == -57) {
            this.method799((byte) -113);
        }
    }

    @OriginalMember(owner = "client!pk", name = "<init>", descriptor = "()V", line = 518)
    public class104() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pk", name = "a", descriptor = "(BIIIII)V", line = 527)
    public static final void method801(byte arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        field1745++;
        class30.method170(arg4 + arg3, class250.field4213[arg1], arg4 - arg3, arg5, -30310);
        int var6 = arg2;
        int var7 = arg3 * arg3;
        int var8 = var7 << 1;
        int var9 = arg2 * arg2;
        int var10 = 0;
        int var11 = arg2 << 1;
        if (arg0 >= -12) {
            field1750 = (class88) null;
        }
        int var12 = var9 - ((var11 - 1) * var8);
        int var13 = var7 << 2;
        int var14 = var9 << 1;
        int var15 = (1 - var11) * var7 + var14;
        int var16 = var9 << 2;
        int var17 = ((var10 << 1) + 3) * var14;
        int var18 = (var10 + 1) * var16;
        int var19 = ((arg2 << 1) - 3) * var8;
        int var20 = (arg2 - 1) * var13;
        while (var6 > 0) {
            var6--;
            int var21 = arg1 - var6;
            if (var15 < 0) {
                while (var15 < 0) {
                    var12 += var18;
                    var10++;
                    var15 += var17;
                    var17 += var16;
                    var18 += var16;
                }
            }
            if (var12 < 0) {
                var12 += var18;
                var18 += var16;
                var10++;
                var15 += var17;
                var17 += var16;
            }
            var12 += -var19;
            var15 += -var20;
            var19 -= var13;
            int var22 = arg1 + var6;
            var20 -= var13;
            int var23 = arg4 - var10;
            int var24 = arg4 + var10;
            class30.method170(var24, class250.field4213[var21], var23, arg5, -30310);
            class30.method170(var24, class250.field4213[var22], var23, arg5, -30310);
        }
    }
}
