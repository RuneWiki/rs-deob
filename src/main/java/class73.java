import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ne")
public class class73 extends class317 {

    @OriginalMember(owner = "client!ne", name = "L", descriptor = "[I")
    private int[] field1004 = new int[257];

    @OriginalMember(owner = "client!ne", name = "Q", descriptor = "Ljava/lang/String;")
    public static String field1009 = null;

    @OriginalMember(owner = "client!ne", name = "M", descriptor = "I")
    public static int field1005 = 0;

    @OriginalMember(owner = "client!ne", name = "U", descriptor = "Ljava/lang/String;")
    public static String field1013 = null;

    @OriginalMember(owner = "client!ne", name = "J", descriptor = "Z")
    public static boolean field1002 = false;

    @OriginalMember(owner = "client!ne", name = "N", descriptor = "I")
    public static int field1006;

    @OriginalMember(owner = "client!ne", name = "O", descriptor = "I")
    public static int field1007;

    @OriginalMember(owner = "client!ne", name = "P", descriptor = "I")
    public static int field1008;

    @OriginalMember(owner = "client!ne", name = "R", descriptor = "I")
    public static int field1010;

    @OriginalMember(owner = "client!ne", name = "S", descriptor = "I")
    public static int field1011;

    @OriginalMember(owner = "client!ne", name = "T", descriptor = "I")
    public static int field1012;

    @OriginalMember(owner = "client!ne", name = "V", descriptor = "I")
    public static int field1014;

    @OriginalMember(owner = "client!ne", name = "W", descriptor = "I")
    public static int field1015;

    @OriginalMember(owner = "client!ne", name = "X", descriptor = "I")
    public static int field1016;

    @OriginalMember(owner = "client!ne", name = "K", descriptor = "[[I")
    private int[][] field1003;

    @OriginalMember(owner = "client!ne", name = "<init>", descriptor = "()V", line = 188)
    public class73() {
        super(1, false);
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(I)V", line = 17)
    private final void method540(int arg0) {
        int var2 = 86 % ((19 - arg0) / 53);
        field1007++;
        int var3 = this.field1003.length;
        if (var3 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = 0;
            int var6 = var4 << 4;
            for (int var7 = 0; var7 < var3 && var6 >= this.field1003[var7][0]; var7++) {
                var5++;
            }
            int var9;
            int var10;
            int var11;
            if (var5 >= var3) {
                int[] var8 = this.field1003[var3 - 1];
                var9 = var8[2];
                var10 = var8[3];
                var11 = var8[1];
            } else {
                int[] var12 = this.field1003[var5];
                if (var5 > 0) {
                    int[] var13 = this.field1003[var5 - 1];
                    int var14 = (var6 - var13[0] << 12) / (var12[0] - var13[0]);
                    int var15 = 4096 - var14;
                    var10 = var12[3] * var14 + var13[3] * var15 >> 12;
                    var9 = var12[2] * var14 + var13[2] * var15 >> 12;
                    var11 = var12[1] * var14 + (var13[1] * var15) >> 12;
                } else {
                    var11 = var12[1];
                    var10 = var12[3];
                    var9 = var12[2];
                }
            }
            int var16 = var9 >> 4;
            int var17 = var11 >> 4;
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
            int var18 = var10 >> 4;
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            this.field1004[var4] = class190.method1334(class190.method1334(var17 << 16, var16 << 8), var18);
        }
    }

    @OriginalMember(owner = "client!ne", name = "g", descriptor = "(I)V", line = 118)
    public static final void method541(int arg0) {
        field1014++;
        class203.field2900 = new class192();
        if (arg0 != 4845) {
            field1002 = true;
        }
    }

    @OriginalMember(owner = "client!ne", name = "e", descriptor = "(B)V", line = 131)
    public static final void method542(byte arg0) {
        for (int var1 = 0; var1 < class26.field331; var1++) {
            class145 var2 = class129.method928(var1, -112);
            if (var2 != null && var2.field1995 == 0) {
                class273.field4083[var1] = 0;
                class324.field4920[var1] = 0;
            }
        }
        if (arg0 != -128) {
            field1005 = -34;
        }
        field1010++;
        class7.field59 = new class17(16);
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(II)V", line = 163)
    public static final void method543(int arg0, int arg1) {
        field1012++;
        if (arg1 >= 106) {
            class143 var2 = class163.method1176((byte) -128, arg0, 10);
            var2.method1038(0);
        }
    }

    @OriginalMember(owner = "client!ne", name = "c", descriptor = "(III)Lj;", line = 178)
    public static final class7 method544(int arg0, int arg1, int arg2) {
        class202 var3 = class142.field1940[arg0][arg1][arg2];
        if (var3 == null) {
            return null;
        } else {
            class7 var4 = var3.field2873;
            var3.field2873 = null;
            return var4;
        }
    }

    @OriginalMember(owner = "client!ne", name = "f", descriptor = "(B)V", line = 193)
    public static void method545(byte arg0) {
        field1013 = null;
        field1009 = null;
        if (arg0 != 23) {
            method547(false, (byte) -17);
        }
    }

    @OriginalMember(owner = "client!ne", name = "d", descriptor = "(I)V", line = 206)
    public final void method546(int arg0) {
        if (this.field1003 == null) {
            this.method548(1, true);
        }
        field1011++;
        this.method540(-93);
        if (arg0 != -21522) {
            this.field1004 = (int[]) null;
        }
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(II)[[I", line = 232)
    public final int[][] method53(int arg0, int arg1) {
        int var3 = -77 % ((arg0 + 31) / 37);
        int[][] var4 = this.field4840.method1625(arg1, -13241);
        field1006++;
        if (this.field4840.field3352) {
            int[] var5 = this.method2225((byte) 66, 0, arg1);
            int[] var6 = var4[0];
            int[] var7 = var4[2];
            int[] var8 = var4[1];
            for (int var9 = 0; var9 < class326.field4933; var9++) {
                int var10 = var5[var9] >> 4;
                if (var10 < 0) {
                    var10 = 0;
                }
                if (var10 > 256) {
                    var10 = 256;
                }
                int var11 = this.field1004[var10];
                var6[var9] = class47.method303(var11 >> 12, 4080);
                var8[var9] = class47.method303(var11 >> 4, 4080);
                var7[var9] = class47.method303(255, var11) << 4;
            }
        }
        return var4;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(Lcg;II)V", line = 280)
    public final void method60(class316 arg0, int arg1, int arg2) {
        field1016++;
        if (arg2 == 0) {
            int var4 = arg0.method2219(16448);
            if (var4 == 0) {
                this.field1003 = new int[arg0.method2219(16448)][4];
                for (int var5 = 0; var5 < this.field1003.length; var5++) {
                    this.field1003[var5][0] = arg0.method2220((byte) 72);
                    this.field1003[var5][1] = arg0.method2219(16448) << 4;
                    this.field1003[var5][2] = arg0.method2219(16448) << 4;
                    this.field1003[var5][3] = arg0.method2219(16448) << 4;
                }
            } else {
                this.method548(var4, true);
            }
        }
        int var6 = 81 / ((-arg1 - 17) / 40);
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(ZB)V", line = 327)
    public static final void method547(boolean arg0, byte arg1) {
        if (arg1 != 4) {
            method545((byte) 13);
        }
        for (class98 var2 = (class98) class291.field4344.method1335(arg1 ^ 0x5); var2 != null; var2 = (class98) class291.field4344.method1336(3)) {
            if (var2.field1333 != null) {
                class160.field2196.method1130(var2.field1333);
                var2.field1333 = null;
            }
            if (var2.field1339 != null) {
                class160.field2196.method1130(var2.field1339);
                var2.field1339 = null;
            }
            var2.method1274((byte) -26);
        }
        if (arg0) {
            for (class98 var3 = (class98) class174.field2372.method1335(1); var3 != null; var3 = (class98) class174.field2372.method1336(3)) {
                if (var3.field1333 != null) {
                    class160.field2196.method1130(var3.field1333);
                    var3.field1333 = null;
                }
                var3.method1274((byte) -26);
            }
            for (class98 var4 = (class98) class223.field3199.method110(0); var4 != null; var4 = (class98) class223.field3199.method115(0)) {
                if (var4.field1333 != null) {
                    class160.field2196.method1130(var4.field1333);
                    var4.field1333 = null;
                }
                var4.method1274((byte) -26);
            }
        }
        field1015++;
    }

    @OriginalMember(owner = "client!ne", name = "a", descriptor = "(IZ)V", line = 393)
    private final void method548(int arg0, boolean arg1) {
        field1008++;
        if (arg0 != 0) {
            if (arg0 == 1) {
                this.field1003 = new int[2][4];
                this.field1003[0][3] = 0;
                this.field1003[0][1] = 0;
                this.field1003[1][1] = 4096;
                this.field1003[0][0] = 0;
                this.field1003[1][0] = 4096;
                this.field1003[1][3] = 4096;
                this.field1003[0][2] = 0;
                this.field1003[1][2] = 4096;
            } else if (arg0 == 2) {
                this.field1003 = new int[8][4];
                this.field1003[0][3] = 2361;
                this.field1003[1][3] = 1558;
                this.field1003[0][1] = 2650;
                this.field1003[0][2] = 2602;
                this.field1003[1][1] = 2313;
                this.field1003[2][1] = 2618;
                this.field1003[2][3] = 1413;
                this.field1003[3][1] = 2296;
                this.field1003[4][1] = 2072;
                this.field1003[0][0] = 0;
                this.field1003[1][0] = 2867;
                this.field1003[5][1] = 2730;
                this.field1003[1][2] = 1799;
                this.field1003[6][1] = 2232;
                this.field1003[2][2] = 1734;
                this.field1003[2][0] = 3072;
                this.field1003[3][0] = 3276;
                this.field1003[4][0] = 3481;
                this.field1003[3][3] = 947;
                this.field1003[3][2] = 1220;
                this.field1003[4][3] = 722;
                this.field1003[5][0] = 3686;
                this.field1003[7][1] = 1686;
                this.field1003[6][0] = 3891;
                this.field1003[7][0] = 4096;
                this.field1003[4][2] = 963;
                this.field1003[5][2] = 2152;
                this.field1003[6][2] = 1060;
                this.field1003[7][2] = 1413;
                this.field1003[5][3] = 1766;
                this.field1003[6][3] = 915;
                this.field1003[7][3] = 1140;
            } else if (arg0 == 3) {
                this.field1003 = new int[7][4];
                this.field1003[0][2] = 0;
                this.field1003[0][3] = 4096;
                this.field1003[0][1] = 0;
                this.field1003[1][1] = 0;
                this.field1003[1][2] = 4096;
                this.field1003[2][2] = 4096;
                this.field1003[3][2] = 4096;
                this.field1003[2][1] = 0;
                this.field1003[1][3] = 4096;
                this.field1003[3][1] = 4096;
                this.field1003[0][0] = 0;
                this.field1003[2][3] = 0;
                this.field1003[1][0] = 663;
                this.field1003[3][3] = 0;
                this.field1003[2][0] = 1363;
                this.field1003[4][1] = 4096;
                this.field1003[4][3] = 0;
                this.field1003[5][1] = 4096;
                this.field1003[3][0] = 2048;
                this.field1003[4][0] = 2727;
                this.field1003[5][3] = 4096;
                this.field1003[6][1] = 0;
                this.field1003[6][3] = 4096;
                this.field1003[5][0] = 3411;
                this.field1003[6][0] = 4096;
                this.field1003[4][2] = 0;
                this.field1003[5][2] = 0;
                this.field1003[6][2] = 0;
            } else if (arg0 == 4) {
                this.field1003 = new int[6][4];
                this.field1003[0][3] = 0;
                this.field1003[0][0] = 0;
                this.field1003[0][2] = 0;
                this.field1003[1][2] = 0;
                this.field1003[1][3] = 1493;
                this.field1003[2][2] = 0;
                this.field1003[3][2] = 1124;
                this.field1003[0][1] = 0;
                this.field1003[4][2] = 3084;
                this.field1003[5][2] = 4096;
                this.field1003[1][1] = 0;
                this.field1003[1][0] = 1843;
                this.field1003[2][1] = 0;
                this.field1003[3][1] = 0;
                this.field1003[2][0] = 2457;
                this.field1003[2][3] = 2939;
                this.field1003[3][3] = 3565;
                this.field1003[4][3] = 4031;
                this.field1003[3][0] = 2781;
                this.field1003[5][3] = 4096;
                this.field1003[4][1] = 546;
                this.field1003[5][1] = 4096;
                this.field1003[4][0] = 3481;
                this.field1003[5][0] = 4096;
            } else if (arg0 == 5) {
                this.field1003 = new int[16][4];
                this.field1003[0][3] = 321;
                this.field1003[0][1] = 80;
                this.field1003[1][3] = 562;
                this.field1003[0][0] = 0;
                this.field1003[0][2] = 192;
                this.field1003[2][3] = 803;
                this.field1003[3][3] = 1140;
                this.field1003[4][3] = 1509;
                this.field1003[5][3] = 1413;
                this.field1003[1][2] = 449;
                this.field1003[2][2] = 690;
                this.field1003[1][1] = 321;
                this.field1003[3][2] = 995;
                this.field1003[2][1] = 578;
                this.field1003[4][2] = 1397;
                this.field1003[3][1] = 947;
                this.field1003[5][2] = 1429;
                this.field1003[6][2] = 1461;
                this.field1003[4][1] = 1285;
                this.field1003[1][0] = 155;
                this.field1003[2][0] = 389;
                this.field1003[7][2] = 1525;
                this.field1003[5][1] = 1525;
                this.field1003[6][1] = 1734;
                this.field1003[3][0] = 671;
                this.field1003[6][3] = 1333;
                this.field1003[4][0] = 897;
                this.field1003[7][1] = 1413;
                this.field1003[5][0] = 1175;
                this.field1003[6][0] = 1368;
                this.field1003[7][0] = 1507;
                this.field1003[8][0] = 1736;
                this.field1003[8][1] = 1108;
                this.field1003[8][2] = 1590;
                this.field1003[9][2] = 2056;
                this.field1003[10][2] = 2586;
                this.field1003[7][3] = 1702;
                this.field1003[11][2] = 3148;
                this.field1003[9][1] = 1766;
                this.field1003[10][1] = 2409;
                this.field1003[8][3] = 2056;
                this.field1003[9][3] = 2666;
                this.field1003[11][1] = 3116;
                this.field1003[9][0] = 2088;
                this.field1003[12][2] = 3710;
                this.field1003[12][1] = 3806;
                this.field1003[13][2] = 3421;
                this.field1003[10][3] = 3276;
                this.field1003[10][0] = 2355;
                this.field1003[11][0] = 2691;
                this.field1003[12][0] = 3031;
                this.field1003[13][0] = 3522;
                this.field1003[14][2] = 3148;
                this.field1003[14][0] = 3727;
                this.field1003[11][3] = 3228;
                this.field1003[15][2] = 2505;
                this.field1003[12][3] = 3196;
                this.field1003[13][1] = 3437;
                this.field1003[13][3] = 3019;
                this.field1003[15][0] = 4096;
                this.field1003[14][3] = 3228;
                this.field1003[14][1] = 3116;
                this.field1003[15][3] = 2746;
                this.field1003[15][1] = 2377;
            } else if (arg0 == 6) {
                this.field1003 = new int[4][4];
                this.field1003[0][0] = 2048;
                this.field1003[0][1] = 0;
                this.field1003[0][3] = 0;
                this.field1003[0][2] = 4096;
                this.field1003[1][2] = 4096;
                this.field1003[1][0] = 2867;
                this.field1003[1][3] = 0;
                this.field1003[2][3] = 0;
                this.field1003[2][2] = 4096;
                this.field1003[3][2] = 0;
                this.field1003[2][0] = 3276;
                this.field1003[3][3] = 0;
                this.field1003[1][1] = 4096;
                this.field1003[2][1] = 4096;
                this.field1003[3][1] = 4096;
                this.field1003[3][0] = 4096;
            } else {
                throw new RuntimeException("Invalid gradient preset");
            }
        }
        if (arg1) {
            ;
        }
    }
}
