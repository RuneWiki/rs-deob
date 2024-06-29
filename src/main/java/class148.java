import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sm")
public class class148 extends class170 {

    @OriginalMember(owner = "client!sm", name = "U", descriptor = "[I")
    private int[] field2544 = new int[257];

    @OriginalMember(owner = "client!sm", name = "V", descriptor = "[I")
    public static int[] field2545 = new int[] { 0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, Integer.MAX_VALUE, -1 };

    @OriginalMember(owner = "client!sm", name = "R", descriptor = "[Lug;")
    public static class294[] field2541 = new class294[50];

    @OriginalMember(owner = "client!sm", name = "Z", descriptor = "I")
    public static int field2549 = 0;

    @OriginalMember(owner = "client!sm", name = "cb", descriptor = "I")
    public static int field2552 = 0;

    @OriginalMember(owner = "client!sm", name = "fb", descriptor = "Lmh;")
    public static class128 field2555 = class22.method156(123, "Untersuchen");

    @OriginalMember(owner = "client!sm", name = "gb", descriptor = "I")
    public static int field2556 = 0;

    @OriginalMember(owner = "client!sm", name = "ib", descriptor = "Lmh;")
    public static class128 field2558 = class22.method156(124, "Lade Schrifts-=tze )2 ");

    @OriginalMember(owner = "client!sm", name = "S", descriptor = "I")
    public static int field2542;

    @OriginalMember(owner = "client!sm", name = "T", descriptor = "I")
    public static int field2543;

    @OriginalMember(owner = "client!sm", name = "W", descriptor = "I")
    public static int field2546;

    @OriginalMember(owner = "client!sm", name = "Y", descriptor = "I")
    public static int field2548;

    @OriginalMember(owner = "client!sm", name = "ab", descriptor = "I")
    public static int field2550;

    @OriginalMember(owner = "client!sm", name = "bb", descriptor = "I")
    public static int field2551;

    @OriginalMember(owner = "client!sm", name = "db", descriptor = "I")
    public static int field2553;

    @OriginalMember(owner = "client!sm", name = "eb", descriptor = "I")
    public static int field2554;

    @OriginalMember(owner = "client!sm", name = "hb", descriptor = "I")
    public static int field2557;

    @OriginalMember(owner = "client!sm", name = "X", descriptor = "[[I")
    private int[][] field2547;

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IB)V", line = 4)
    private final void method993(int arg0, byte arg1) {
        field2554++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field2547 = new int[2][4];
                this.field2547[0][0] = 0;
                this.field2547[0][1] = 0;
                this.field2547[1][0] = 4096;
                this.field2547[0][3] = 0;
                this.field2547[1][1] = 4096;
                this.field2547[1][3] = 4096;
                this.field2547[0][2] = 0;
                this.field2547[1][2] = 4096;
            } else if (arg0 == 2) {
                this.field2547 = new int[8][4];
                this.field2547[0][2] = 2602;
                this.field2547[0][1] = 2650;
                this.field2547[0][3] = 2361;
                this.field2547[0][0] = 0;
                this.field2547[1][1] = 2313;
                this.field2547[1][3] = 1558;
                this.field2547[1][0] = 2867;
                this.field2547[2][3] = 1413;
                this.field2547[1][2] = 1799;
                this.field2547[2][0] = 3072;
                this.field2547[2][1] = 2618;
                this.field2547[2][2] = 1734;
                this.field2547[3][1] = 2296;
                this.field2547[3][2] = 1220;
                this.field2547[4][1] = 2072;
                this.field2547[4][2] = 963;
                this.field2547[5][2] = 2152;
                this.field2547[5][1] = 2730;
                this.field2547[6][2] = 1060;
                this.field2547[6][1] = 2232;
                this.field2547[3][0] = 3276;
                this.field2547[4][0] = 3481;
                this.field2547[7][1] = 1686;
                this.field2547[3][3] = 947;
                this.field2547[4][3] = 722;
                this.field2547[5][3] = 1766;
                this.field2547[7][2] = 1413;
                this.field2547[5][0] = 3686;
                this.field2547[6][0] = 3891;
                this.field2547[6][3] = 915;
                this.field2547[7][3] = 1140;
                this.field2547[7][0] = 4096;
            } else if (arg0 == 3) {
                this.field2547 = new int[7][4];
                this.field2547[0][3] = 4096;
                this.field2547[1][3] = 4096;
                this.field2547[2][3] = 0;
                this.field2547[0][0] = 0;
                this.field2547[0][2] = 0;
                this.field2547[0][1] = 0;
                this.field2547[3][3] = 0;
                this.field2547[4][3] = 0;
                this.field2547[1][2] = 4096;
                this.field2547[5][3] = 4096;
                this.field2547[1][0] = 663;
                this.field2547[2][2] = 4096;
                this.field2547[6][3] = 4096;
                this.field2547[2][0] = 1363;
                this.field2547[3][0] = 2048;
                this.field2547[1][1] = 0;
                this.field2547[2][1] = 0;
                this.field2547[3][1] = 4096;
                this.field2547[3][2] = 4096;
                this.field2547[4][0] = 2727;
                this.field2547[5][0] = 3411;
                this.field2547[6][0] = 4096;
                this.field2547[4][1] = 4096;
                this.field2547[4][2] = 0;
                this.field2547[5][2] = 0;
                this.field2547[5][1] = 4096;
                this.field2547[6][2] = 0;
                this.field2547[6][1] = 0;
            } else if (arg0 == 4) {
                this.field2547 = new int[6][4];
                this.field2547[0][2] = 0;
                this.field2547[0][1] = 0;
                this.field2547[0][0] = 0;
                this.field2547[1][2] = 0;
                this.field2547[1][0] = 1843;
                this.field2547[1][1] = 0;
                this.field2547[0][3] = 0;
                this.field2547[1][3] = 1493;
                this.field2547[2][1] = 0;
                this.field2547[2][3] = 2939;
                this.field2547[3][3] = 3565;
                this.field2547[4][3] = 4031;
                this.field2547[3][1] = 0;
                this.field2547[2][0] = 2457;
                this.field2547[4][1] = 546;
                this.field2547[2][2] = 0;
                this.field2547[3][0] = 2781;
                this.field2547[5][1] = 4096;
                this.field2547[4][0] = 3481;
                this.field2547[3][2] = 1124;
                this.field2547[5][3] = 4096;
                this.field2547[4][2] = 3084;
                this.field2547[5][2] = 4096;
                this.field2547[5][0] = 4096;
            } else if (arg0 == 5) {
                this.field2547 = new int[16][4];
                this.field2547[0][1] = 80;
                this.field2547[0][2] = 192;
                this.field2547[1][1] = 321;
                this.field2547[2][1] = 578;
                this.field2547[0][0] = 0;
                this.field2547[0][3] = 321;
                this.field2547[3][1] = 947;
                this.field2547[1][0] = 155;
                this.field2547[1][2] = 449;
                this.field2547[2][2] = 690;
                this.field2547[3][2] = 995;
                this.field2547[2][0] = 389;
                this.field2547[4][2] = 1397;
                this.field2547[5][2] = 1429;
                this.field2547[3][0] = 671;
                this.field2547[1][3] = 562;
                this.field2547[4][0] = 897;
                this.field2547[2][3] = 803;
                this.field2547[3][3] = 1140;
                this.field2547[5][0] = 1175;
                this.field2547[4][3] = 1509;
                this.field2547[6][2] = 1461;
                this.field2547[5][3] = 1413;
                this.field2547[7][2] = 1525;
                this.field2547[6][0] = 1368;
                this.field2547[8][2] = 1590;
                this.field2547[9][2] = 2056;
                this.field2547[6][3] = 1333;
                this.field2547[10][2] = 2586;
                this.field2547[11][2] = 3148;
                this.field2547[12][2] = 3710;
                this.field2547[13][2] = 3421;
                this.field2547[4][1] = 1285;
                this.field2547[7][3] = 1702;
                this.field2547[7][0] = 1507;
                this.field2547[5][1] = 1525;
                this.field2547[6][1] = 1734;
                this.field2547[14][2] = 3148;
                this.field2547[7][1] = 1413;
                this.field2547[8][0] = 1736;
                this.field2547[9][0] = 2088;
                this.field2547[8][1] = 1108;
                this.field2547[9][1] = 1766;
                this.field2547[10][1] = 2409;
                this.field2547[15][2] = 2505;
                this.field2547[11][1] = 3116;
                this.field2547[12][1] = 3806;
                this.field2547[10][0] = 2355;
                this.field2547[11][0] = 2691;
                this.field2547[12][0] = 3031;
                this.field2547[13][0] = 3522;
                this.field2547[13][1] = 3437;
                this.field2547[8][3] = 2056;
                this.field2547[9][3] = 2666;
                this.field2547[14][1] = 3116;
                this.field2547[10][3] = 3276;
                this.field2547[15][1] = 2377;
                this.field2547[14][0] = 3727;
                this.field2547[11][3] = 3228;
                this.field2547[15][0] = 4096;
                this.field2547[12][3] = 3196;
                this.field2547[13][3] = 3019;
                this.field2547[14][3] = 3228;
                this.field2547[15][3] = 2746;
            } else if (arg0 == 6) {
                this.field2547 = new int[4][4];
                this.field2547[0][0] = 2048;
                this.field2547[0][2] = 4096;
                this.field2547[1][0] = 2867;
                this.field2547[0][3] = 0;
                this.field2547[1][3] = 0;
                this.field2547[1][2] = 4096;
                this.field2547[0][1] = 0;
                this.field2547[2][2] = 4096;
                this.field2547[1][1] = 4096;
                this.field2547[2][1] = 4096;
                this.field2547[2][0] = 3276;
                this.field2547[3][0] = 4096;
                this.field2547[2][3] = 0;
                this.field2547[3][1] = 4096;
                this.field2547[3][2] = 0;
                this.field2547[3][3] = 0;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1 < -70) {
            ;
        }
    }

    @OriginalMember(owner = "client!sm", name = "<init>", descriptor = "()V", line = 257)
    public class148() {
        super(1, false);
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(II)[[I", line = 269)
    public final int[][] method62(int arg0, int arg1) {
        int var3 = -76 % ((arg1 + 24) / 46);
        field2543++;
        int[][] var4 = this.field2976.method1098(arg0, -19544);
        if (this.field2976.field2883) {
            int[] var5 = this.method1142((byte) 44, 0, arg0);
            int[] var6 = var4[0];
            int[] var7 = var4[1];
            int[] var8 = var4[2];
            for (int var9 = 0; var9 < class185.field3225; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field2544[var10];
                var6[var9] = class238.method1622(4080, var11 >> 12);
                var7[var9] = class238.method1622(var11, 65280) >> 4;
                var8[var9] = class238.method1622(var11 << 4, 4080);
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(Z)V", line = 326)
    public static void method994(boolean arg0) {
        if (!arg0) {
            field2545 = null;
            field2558 = null;
            field2541 = null;
            field2555 = null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILdj;)I", line = 347)
    public static final int method995(int arg0, class314 arg1) {
        int var2 = 0;
        field2551++;
        if (arg1.method2157(arg0 - 1731, class287.field4908)) {
            var2++;
        }
        if (arg1.method2157(86, class196.field3446)) {
            var2++;
        }
        if (arg1.method2157(107, class271.field4712)) {
            var2++;
        }
        if (arg1.method2157(80, class192.field3324)) {
            var2++;
        }
        if (arg1.method2157(121, class306.field5209)) {
            var2++;
        }
        if (arg1.method2157(69, class218.field3839)) {
            var2++;
        }
        if (arg0 != 1799) {
            return -30;
        }
        if (arg1.method2157(arg0 ^ 0x751, class158.field2706)) {
            var2++;
        }
        if (arg1.method2157(64, class254.field4387)) {
            var2++;
        }
        if (arg1.method2157(arg0 ^ 0x749, class88.field1512)) {
            var2++;
        }
        if (arg1.method2157(107, class157.field2689)) {
            var2++;
        }
        if (arg1.method2157(116, class301.field5113)) {
            var2++;
        }
        if (arg1.method2157(77, class65.field1248)) {
            var2++;
        }
        if (arg1.method2157(105, class166.field2849)) {
            var2++;
        }
        if (arg1.method2157(113, class195.field3423)) {
            var2++;
        }
        if (arg1.method2157(98, class285.field4891)) {
            var2++;
        }
        if (arg1.method2157(114, class159.field2728)) {
            var2++;
        }
        return var2;
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(IZ)V", line = 415)
    public static final void method996(int arg0, boolean arg1) {
        field2557++;
        class56.field1071.method1833(arg0, (byte) 64);
        class156.field2676.method1833(arg0, (byte) 97);
        if (!arg1) {
            field2556 = 80;
        }
    }

    @OriginalMember(owner = "client!sm", name = "b", descriptor = "(IB)Z", line = 427)
    public static final boolean method997(int arg0, byte arg1) {
        field2553++;
        if (arg1 >= -25) {
            field2549 = 109;
        }
        return (-arg0 & arg0) == arg0;
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(I)V", line = 438)
    public final void method267(int arg0) {
        if (arg0 != -2718) {
            method994(false);
        }
        if (this.field2547 == null) {
            this.method993(1, (byte) -109);
        }
        this.method998(arg0 + 2719);
        field2542++;
    }

    @OriginalMember(owner = "client!sm", name = "d", descriptor = "(I)V", line = 456)
    private final void method998(int arg0) {
        field2548++;
        if (arg0 != 1) {
            field2558 = (class128) null;
        }
        int var2 = this.field2547.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = var3 << 4;
            int var5 = 0;
            for (int var6 = 0; var2 > var6 && var4 >= this.field2547[var6][0]; var6++) {
                var5++;
            }
            int var11;
            int var12;
            int var13;
            if (var2 > var5) {
                int[] var7 = this.field2547[var5];
                if (var5 > 0) {
                    int[] var8 = this.field2547[var5 - 1];
                    int var9 = (var4 - var8[0] << 12) / (var7[0] - var8[0]);
                    int var10 = 4096 - var9;
                    var11 = var7[1] * var9 + var8[1] * var10 >> 12;
                    var12 = var7[3] * var9 + var8[3] * var10 >> 12;
                    var13 = var7[2] * var9 + var8[2] * var10 >> 12;
                } else {
                    var11 = var7[1];
                    var12 = var7[3];
                    var13 = var7[2];
                }
            } else {
                int[] var14 = this.field2547[var2 - 1];
                var13 = var14[2];
                var11 = var14[1];
                var12 = var14[3];
            }
            int var15 = var11 >> 4;
            if (var15 < 0) {
                var15 = 0;
            } else if (var15 > 255) {
                var15 = 255;
            }
            int var16 = var12 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var13 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            this.field2544[var3] = class279.method1951(class279.method1951(var17 << 8, var15 << 16), var16);
        }
    }

    @OriginalMember(owner = "client!sm", name = "a", descriptor = "(ILbg;B)V", line = 571)
    public final void method63(int arg0, class194 arg1, byte arg2) {
        field2550++;
        if (arg0 == 0) {
            int var4 = arg1.method1325(7627);
            if (var4 == 0) {
                this.field2547 = new int[arg1.method1325(arg2 ^ 0x1DC6)][4];
                for (int var5 = 0; var5 < this.field2547.length; var5++) {
                    this.field2547[var5][0] = arg1.method1308(-49);
                    this.field2547[var5][1] = arg1.method1325(class233.method1599(arg2, 7622)) << 4;
                    this.field2547[var5][2] = arg1.method1325(7627) << 4;
                    this.field2547[var5][3] = arg1.method1325(class233.method1599(arg2, 7622)) << 4;
                }
            } else {
                this.method993(var4, (byte) -100);
            }
        }
        if (arg2 != 13) {
            field2555 = (class128) null;
        }
    }

    @OriginalMember(owner = "client!sm", name = "c", descriptor = "(IB)V", line = 608)
    public static final void method999(int arg0, byte arg1) {
        field2546++;
        class79.field1432.method1833(arg0, (byte) 78);
        class163.field2798.method1833(arg0, (byte) 95);
        if (arg1 == -29) {
            class115.field1926.method1833(arg0, (byte) 115);
            class275.field4765.method1833(arg0, (byte) 63);
        }
    }
}
