import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uo")
public class class106 extends class306 {

    @OriginalMember(owner = "client!uo", name = "S", descriptor = "[I")
    private int[] field1468 = new int[257];

    @OriginalMember(owner = "client!uo", name = "N", descriptor = "[I")
    public static int[] field1463 = new int[] { 4, 4, 1, 2, 6, 4, 2, 48, 2, 2, 2, 2, 2, 2, 2, 2, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1, 1 };

    @OriginalMember(owner = "client!uo", name = "O", descriptor = "Ljava/lang/String;")
    public static String field1464 = "Members object";

    @OriginalMember(owner = "client!uo", name = "L", descriptor = "Ljava/lang/String;")
    public static String field1461 = "Loaded wordpack";

    @OriginalMember(owner = "client!uo", name = "M", descriptor = "Ljava/lang/String;")
    public static String field1462 = "Select";

    @OriginalMember(owner = "client!uo", name = "J", descriptor = "[I")
    public static int[] field1459 = new int[] { 7, 8, 9, 10, 11, 12, 13, 15 };

    @OriginalMember(owner = "client!uo", name = "V", descriptor = "[Lpb;")
    public static class89[] field1471 = new class89[8];

    @OriginalMember(owner = "client!uo", name = "G", descriptor = "I")
    public static int field1456;

    @OriginalMember(owner = "client!uo", name = "H", descriptor = "I")
    public static int field1457;

    @OriginalMember(owner = "client!uo", name = "I", descriptor = "I")
    public static int field1458;

    @OriginalMember(owner = "client!uo", name = "K", descriptor = "I")
    public static int field1460;

    @OriginalMember(owner = "client!uo", name = "P", descriptor = "I")
    public static int field1465;

    @OriginalMember(owner = "client!uo", name = "R", descriptor = "I")
    public static int field1467;

    @OriginalMember(owner = "client!uo", name = "U", descriptor = "I")
    public static int field1470;

    @OriginalMember(owner = "client!uo", name = "Q", descriptor = "Lch;")
    public static class158 field1466;

    @OriginalMember(owner = "client!uo", name = "T", descriptor = "[[I")
    private int[][] field1469;

    @OriginalMember(owner = "client!uo", name = "e", descriptor = "(I)V", line = 8)
    public static void method686(int arg0) {
        field1471 = null;
        field1466 = null;
        if (arg0 != -18355) {
            field1464 = (String) null;
        }
        field1464 = null;
        field1462 = null;
        field1461 = null;
        field1459 = null;
        field1463 = null;
    }

    @OriginalMember(owner = "client!uo", name = "d", descriptor = "(B)V", line = 25)
    public final void method43(byte arg0) {
        field1465++;
        if (this.field1469 == null) {
            this.method690((byte) 79, 1);
        }
        this.method687(-4501);
        if (arg0 > -103) {
            field1461 = (String) null;
        }
    }

    @OriginalMember(owner = "client!uo", name = "f", descriptor = "(I)V", line = 42)
    private final void method687(int arg0) {
        field1467++;
        if (arg0 != -4501) {
            this.method681(2, (byte) -105);
        }
        int var2 = this.field1469.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = var3 << 4;
            int var5 = 0;
            for (int var6 = 0; var6 < var2 && this.field1469[var6][0] <= var4; var6++) {
                var5++;
            }
            int var8;
            int var9;
            int var10;
            if (var2 > var5) {
                int[] var7 = this.field1469[var5];
                if (var5 <= 0) {
                    var8 = var7[2];
                    var9 = var7[3];
                    var10 = var7[1];
                } else {
                    int[] var11 = this.field1469[var5 - 1];
                    int var12 = (var4 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var9 = var7[3] * var12 + (var11[3] * var13) >> 12;
                    var8 = var7[2] * var12 + (var11[2] * var13) >> 12;
                    var10 = var7[1] * var12 + var11[1] * var13 >> 12;
                }
            } else {
                int[] var14 = this.field1469[var2 - 1];
                var10 = var14[1];
                var9 = var14[3];
                var8 = var14[2];
            }
            int var15 = var8 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var9 >> 4;
            int var17 = var10 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field1468[var3] = class77.method492(class77.method492(var17 << 16, var15 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ILlf;I)V", line = 159)
    public final void method45(int arg0, class143 arg1, int arg2) {
        field1456++;
        if (arg0 != -15334) {
            method688((byte) -48, -62, 3);
        }
        if (arg2 != 0) {
            return;
        }
        int var4 = arg1.method1043(true);
        if (var4 != 0) {
            this.method690((byte) 85, var4);
            return;
        }
        this.field1469 = new int[arg1.method1043(true)][4];
        for (int var5 = 0; var5 < this.field1469.length; var5++) {
            this.field1469[var5][0] = arg1.method1051(1);
            this.field1469[var5][1] = arg1.method1043(true) << 4;
            this.field1469[var5][2] = arg1.method1043(true) << 4;
            this.field1469[var5][3] = arg1.method1043(true) << 4;
        }
    }

    @OriginalMember(owner = "client!uo", name = "<init>", descriptor = "()V", line = 201)
    public class106() {
        super(1, false);
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BII)V", line = 209)
    public static final void method688(byte arg0, int arg1, int arg2) {
        field1457++;
        if (class296.method2104((byte) -64, arg2)) {
            if (arg0 != -24) {
                method689(false, -54);
            }
            class232.method1602(arg1, class232.field3512[arg2], arg0 + 24);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(ZI)V", line = 223)
    public static final void method689(boolean arg0, int arg1) {
        if (arg1 != 19889) {
            method688((byte) -123, 3, -14);
        }
        field1460++;
        if (class225.field3396 != arg0) {
            class225.field3396 = arg0;
            class128.method873(-42);
        }
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(IB)[[I", line = 251)
    public final int[][] method681(int arg0, byte arg1) {
        int[][] var3 = this.field4752.method1866(arg0, 0);
        if (this.field4752.field4179) {
            int[] var4 = this.method2161(arg0, (byte) 119, 0);
            int[] var5 = var3[0];
            int[] var6 = var3[1];
            int[] var7 = var3[2];
            for (int var8 = 0; var8 < class31.field367; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field1468[var9];
                var5[var8] = class261.method1840(var10 >> 12, 4080);
                var6[var8] = class261.method1840(var10 >> 4, 4080);
                var7[var8] = class261.method1840(var10 << 4, 4080);
            }
        }
        field1470++;
        if (arg1 != -119) {
            this.method681(-74, (byte) 22);
        }
        return var3;
    }

    @OriginalMember(owner = "client!uo", name = "a", descriptor = "(BI)V", line = 311)
    private final void method690(byte arg0, int arg1) {
        int var3 = -83 % ((arg0 + 9) / 44);
        field1458++;
        if (arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field1469 = new int[2][4];
            this.field1469[0][1] = 0;
            this.field1469[0][2] = 0;
            this.field1469[1][2] = 4096;
            this.field1469[0][0] = 0;
            this.field1469[1][0] = 4096;
            this.field1469[0][3] = 0;
            this.field1469[1][3] = 4096;
            this.field1469[1][1] = 4096;
        } else if (arg1 == 2) {
            this.field1469 = new int[8][4];
            this.field1469[0][2] = 2602;
            this.field1469[0][0] = 0;
            this.field1469[0][1] = 2650;
            this.field1469[1][0] = 2867;
            this.field1469[1][1] = 2313;
            this.field1469[2][1] = 2618;
            this.field1469[2][0] = 3072;
            this.field1469[3][0] = 3276;
            this.field1469[3][1] = 2296;
            this.field1469[4][1] = 2072;
            this.field1469[1][2] = 1799;
            this.field1469[4][0] = 3481;
            this.field1469[5][0] = 3686;
            this.field1469[5][1] = 2730;
            this.field1469[2][2] = 1734;
            this.field1469[3][2] = 1220;
            this.field1469[0][3] = 2361;
            this.field1469[1][3] = 1558;
            this.field1469[2][3] = 1413;
            this.field1469[6][1] = 2232;
            this.field1469[3][3] = 947;
            this.field1469[4][2] = 963;
            this.field1469[5][2] = 2152;
            this.field1469[4][3] = 722;
            this.field1469[6][2] = 1060;
            this.field1469[7][1] = 1686;
            this.field1469[6][0] = 3891;
            this.field1469[7][2] = 1413;
            this.field1469[5][3] = 1766;
            this.field1469[7][0] = 4096;
            this.field1469[6][3] = 915;
            this.field1469[7][3] = 1140;
        } else if (arg1 == 3) {
            this.field1469 = new int[7][4];
            this.field1469[0][0] = 0;
            this.field1469[0][2] = 0;
            this.field1469[1][0] = 663;
            this.field1469[1][2] = 4096;
            this.field1469[0][3] = 4096;
            this.field1469[2][0] = 1363;
            this.field1469[3][0] = 2048;
            this.field1469[1][3] = 4096;
            this.field1469[4][0] = 2727;
            this.field1469[2][2] = 4096;
            this.field1469[5][0] = 3411;
            this.field1469[3][2] = 4096;
            this.field1469[6][0] = 4096;
            this.field1469[4][2] = 0;
            this.field1469[0][1] = 0;
            this.field1469[5][2] = 0;
            this.field1469[1][1] = 0;
            this.field1469[6][2] = 0;
            this.field1469[2][1] = 0;
            this.field1469[3][1] = 4096;
            this.field1469[4][1] = 4096;
            this.field1469[5][1] = 4096;
            this.field1469[2][3] = 0;
            this.field1469[6][1] = 0;
            this.field1469[3][3] = 0;
            this.field1469[4][3] = 0;
            this.field1469[5][3] = 4096;
            this.field1469[6][3] = 4096;
        } else if (arg1 == 4) {
            this.field1469 = new int[6][4];
            this.field1469[0][3] = 0;
            this.field1469[0][0] = 0;
            this.field1469[1][0] = 1843;
            this.field1469[0][2] = 0;
            this.field1469[0][1] = 0;
            this.field1469[1][1] = 0;
            this.field1469[1][2] = 0;
            this.field1469[2][2] = 0;
            this.field1469[2][0] = 2457;
            this.field1469[1][3] = 1493;
            this.field1469[2][3] = 2939;
            this.field1469[2][1] = 0;
            this.field1469[3][2] = 1124;
            this.field1469[3][0] = 2781;
            this.field1469[4][2] = 3084;
            this.field1469[3][3] = 3565;
            this.field1469[4][3] = 4031;
            this.field1469[5][2] = 4096;
            this.field1469[4][0] = 3481;
            this.field1469[3][1] = 0;
            this.field1469[4][1] = 546;
            this.field1469[5][1] = 4096;
            this.field1469[5][3] = 4096;
            this.field1469[5][0] = 4096;
        } else if (arg1 == 5) {
            this.field1469 = new int[16][4];
            this.field1469[0][3] = 321;
            this.field1469[0][1] = 80;
            this.field1469[1][1] = 321;
            this.field1469[1][3] = 562;
            this.field1469[2][1] = 578;
            this.field1469[0][2] = 192;
            this.field1469[2][3] = 803;
            this.field1469[3][1] = 947;
            this.field1469[0][0] = 0;
            this.field1469[4][1] = 1285;
            this.field1469[1][2] = 449;
            this.field1469[2][2] = 690;
            this.field1469[3][2] = 995;
            this.field1469[3][3] = 1140;
            this.field1469[4][3] = 1509;
            this.field1469[4][2] = 1397;
            this.field1469[5][2] = 1429;
            this.field1469[6][2] = 1461;
            this.field1469[1][0] = 155;
            this.field1469[5][1] = 1525;
            this.field1469[5][3] = 1413;
            this.field1469[2][0] = 389;
            this.field1469[7][2] = 1525;
            this.field1469[3][0] = 671;
            this.field1469[6][3] = 1333;
            this.field1469[4][0] = 897;
            this.field1469[7][3] = 1702;
            this.field1469[8][3] = 2056;
            this.field1469[9][3] = 2666;
            this.field1469[8][2] = 1590;
            this.field1469[6][1] = 1734;
            this.field1469[5][0] = 1175;
            this.field1469[9][2] = 2056;
            this.field1469[6][0] = 1368;
            this.field1469[10][2] = 2586;
            this.field1469[10][3] = 3276;
            this.field1469[11][3] = 3228;
            this.field1469[7][1] = 1413;
            this.field1469[11][2] = 3148;
            this.field1469[7][0] = 1507;
            this.field1469[12][2] = 3710;
            this.field1469[8][1] = 1108;
            this.field1469[12][3] = 3196;
            this.field1469[9][1] = 1766;
            this.field1469[13][2] = 3421;
            this.field1469[10][1] = 2409;
            this.field1469[11][1] = 3116;
            this.field1469[12][1] = 3806;
            this.field1469[13][3] = 3019;
            this.field1469[13][1] = 3437;
            this.field1469[14][2] = 3148;
            this.field1469[8][0] = 1736;
            this.field1469[14][1] = 3116;
            this.field1469[15][2] = 2505;
            this.field1469[9][0] = 2088;
            this.field1469[14][3] = 3228;
            this.field1469[15][3] = 2746;
            this.field1469[15][1] = 2377;
            this.field1469[10][0] = 2355;
            this.field1469[11][0] = 2691;
            this.field1469[12][0] = 3031;
            this.field1469[13][0] = 3522;
            this.field1469[14][0] = 3727;
            this.field1469[15][0] = 4096;
        } else if (arg1 == 6) {
            this.field1469 = new int[4][4];
            this.field1469[0][0] = 2048;
            this.field1469[1][0] = 2867;
            this.field1469[0][2] = 4096;
            this.field1469[0][3] = 0;
            this.field1469[1][3] = 0;
            this.field1469[2][3] = 0;
            this.field1469[1][2] = 4096;
            this.field1469[3][3] = 0;
            this.field1469[2][0] = 3276;
            this.field1469[0][1] = 0;
            this.field1469[1][1] = 4096;
            this.field1469[2][2] = 4096;
            this.field1469[3][2] = 0;
            this.field1469[3][0] = 4096;
            this.field1469[2][1] = 4096;
            this.field1469[3][1] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }
}
