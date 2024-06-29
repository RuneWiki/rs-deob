import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class281 extends class179 {

    @OriginalMember(owner = "client!pl", name = "R", descriptor = "[I")
    private int[] field4877 = new int[257];

    @OriginalMember(owner = "client!pl", name = "W", descriptor = "Lke;")
    public static class256 field4882 = null;

    @OriginalMember(owner = "client!pl", name = "U", descriptor = "Z")
    public static boolean field4880 = true;

    @OriginalMember(owner = "client!pl", name = "db", descriptor = "Lke;")
    private static class256 field4889 = class316.method2202("Hidden", 27626);

    @OriginalMember(owner = "client!pl", name = "V", descriptor = "Lke;")
    public static class256 field4881 = field4889;

    @OriginalMember(owner = "client!pl", name = "cb", descriptor = "I")
    public static int field4888 = 1;

    @OriginalMember(owner = "client!pl", name = "Q", descriptor = "I")
    public static int field4876;

    @OriginalMember(owner = "client!pl", name = "S", descriptor = "I")
    public static int field4878;

    @OriginalMember(owner = "client!pl", name = "T", descriptor = "I")
    public static int field4879;

    @OriginalMember(owner = "client!pl", name = "X", descriptor = "I")
    public static int field4883;

    @OriginalMember(owner = "client!pl", name = "Y", descriptor = "I")
    public static int field4884;

    @OriginalMember(owner = "client!pl", name = "ab", descriptor = "I")
    public static int field4886;

    @OriginalMember(owner = "client!pl", name = "bb", descriptor = "I")
    public static int field4887;

    @OriginalMember(owner = "client!pl", name = "eb", descriptor = "I")
    public static int field4890;

    @OriginalMember(owner = "client!pl", name = "fb", descriptor = "I")
    public static int field4891;

    @OriginalMember(owner = "client!pl", name = "Z", descriptor = "[[I")
    private int[][] field4885;

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(B)V", line = 4)
    public final void method418(byte arg0) {
        if (this.field4885 == null) {
            this.method1967(1, (byte) 10);
        }
        if (arg0 == -110) {
            field4878++;
            this.method1971(arg0 + 1891);
        }
    }

    @OriginalMember(owner = "client!pl", name = "d", descriptor = "(III)V", line = 19)
    public static final void method1965(int arg0, int arg1, int arg2) {
        field4884++;
        if (class298.method2087(arg0, 20330)) {
            class90.method673(class50.field921[arg0], arg1 ^ arg1, arg2);
        }
    }

    @OriginalMember(owner = "client!pl", name = "j", descriptor = "(I)V", line = 36)
    public static void method1966(int arg0) {
        field4889 = null;
        field4882 = null;
        if (arg0 < 39) {
            field4882 = (class256) null;
        }
        field4881 = null;
    }

    @OriginalMember(owner = "client!pl", name = "<init>", descriptor = "()V", line = 51)
    public class281() {
        super(1, false);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(IB)V", line = 58)
    private final void method1967(int arg0, byte arg1) {
        field4879++;
        if (arg1 != 10) {
            method1965(95, 98, 35);
        }
        if (arg0 == 0) {
            return;
        }
        if (arg0 == 1) {
            this.field4885 = new int[2][4];
            this.field4885[0][0] = 0;
            this.field4885[1][0] = 4096;
            this.field4885[0][2] = 0;
            this.field4885[0][3] = 0;
            this.field4885[1][3] = 4096;
            this.field4885[1][2] = 4096;
            this.field4885[0][1] = 0;
            this.field4885[1][1] = 4096;
        } else if (arg0 == 2) {
            this.field4885 = new int[8][4];
            this.field4885[0][1] = 2650;
            this.field4885[0][0] = 0;
            this.field4885[1][1] = 2313;
            this.field4885[0][2] = 2602;
            this.field4885[0][3] = 2361;
            this.field4885[1][2] = 1799;
            this.field4885[2][1] = 2618;
            this.field4885[2][2] = 1734;
            this.field4885[3][2] = 1220;
            this.field4885[3][1] = 2296;
            this.field4885[1][3] = 1558;
            this.field4885[4][2] = 963;
            this.field4885[1][0] = 2867;
            this.field4885[2][0] = 3072;
            this.field4885[4][1] = 2072;
            this.field4885[5][1] = 2730;
            this.field4885[6][1] = 2232;
            this.field4885[2][3] = 1413;
            this.field4885[7][1] = 1686;
            this.field4885[3][0] = 3276;
            this.field4885[5][2] = 2152;
            this.field4885[6][2] = 1060;
            this.field4885[3][3] = 947;
            this.field4885[4][0] = 3481;
            this.field4885[5][0] = 3686;
            this.field4885[4][3] = 722;
            this.field4885[6][0] = 3891;
            this.field4885[5][3] = 1766;
            this.field4885[7][2] = 1413;
            this.field4885[7][0] = 4096;
            this.field4885[6][3] = 915;
            this.field4885[7][3] = 1140;
        } else if (arg0 == 3) {
            this.field4885 = new int[7][4];
            this.field4885[0][3] = 4096;
            this.field4885[1][3] = 4096;
            this.field4885[0][1] = 0;
            this.field4885[0][2] = 0;
            this.field4885[1][2] = 4096;
            this.field4885[2][3] = 0;
            this.field4885[0][0] = 0;
            this.field4885[3][3] = 0;
            this.field4885[1][1] = 0;
            this.field4885[2][1] = 0;
            this.field4885[4][3] = 0;
            this.field4885[5][3] = 4096;
            this.field4885[3][1] = 4096;
            this.field4885[4][1] = 4096;
            this.field4885[2][2] = 4096;
            this.field4885[6][3] = 4096;
            this.field4885[1][0] = 663;
            this.field4885[5][1] = 4096;
            this.field4885[3][2] = 4096;
            this.field4885[4][2] = 0;
            this.field4885[2][0] = 1363;
            this.field4885[5][2] = 0;
            this.field4885[6][1] = 0;
            this.field4885[3][0] = 2048;
            this.field4885[4][0] = 2727;
            this.field4885[6][2] = 0;
            this.field4885[5][0] = 3411;
            this.field4885[6][0] = 4096;
        } else if (arg0 == 4) {
            this.field4885 = new int[6][4];
            this.field4885[0][1] = 0;
            this.field4885[0][2] = 0;
            this.field4885[0][0] = 0;
            this.field4885[1][0] = 1843;
            this.field4885[1][1] = 0;
            this.field4885[1][2] = 0;
            this.field4885[2][2] = 0;
            this.field4885[0][3] = 0;
            this.field4885[2][1] = 0;
            this.field4885[3][1] = 0;
            this.field4885[3][2] = 1124;
            this.field4885[4][1] = 546;
            this.field4885[2][0] = 2457;
            this.field4885[3][0] = 2781;
            this.field4885[1][3] = 1493;
            this.field4885[2][3] = 2939;
            this.field4885[4][2] = 3084;
            this.field4885[5][1] = 4096;
            this.field4885[4][0] = 3481;
            this.field4885[5][2] = 4096;
            this.field4885[5][0] = 4096;
            this.field4885[3][3] = 3565;
            this.field4885[4][3] = 4031;
            this.field4885[5][3] = 4096;
        } else if (arg0 == 5) {
            this.field4885 = new int[16][4];
            this.field4885[0][2] = 192;
            this.field4885[0][1] = 80;
            this.field4885[1][2] = 449;
            this.field4885[0][0] = 0;
            this.field4885[1][0] = 155;
            this.field4885[2][2] = 690;
            this.field4885[2][0] = 389;
            this.field4885[0][3] = 321;
            this.field4885[3][0] = 671;
            this.field4885[1][3] = 562;
            this.field4885[4][0] = 897;
            this.field4885[1][1] = 321;
            this.field4885[2][3] = 803;
            this.field4885[5][0] = 1175;
            this.field4885[3][3] = 1140;
            this.field4885[2][1] = 578;
            this.field4885[6][0] = 1368;
            this.field4885[7][0] = 1507;
            this.field4885[4][3] = 1509;
            this.field4885[3][1] = 947;
            this.field4885[5][3] = 1413;
            this.field4885[3][2] = 995;
            this.field4885[4][1] = 1285;
            this.field4885[6][3] = 1333;
            this.field4885[4][2] = 1397;
            this.field4885[5][2] = 1429;
            this.field4885[6][2] = 1461;
            this.field4885[7][3] = 1702;
            this.field4885[7][2] = 1525;
            this.field4885[8][0] = 1736;
            this.field4885[9][0] = 2088;
            this.field4885[5][1] = 1525;
            this.field4885[8][3] = 2056;
            this.field4885[9][3] = 2666;
            this.field4885[6][1] = 1734;
            this.field4885[7][1] = 1413;
            this.field4885[8][1] = 1108;
            this.field4885[8][2] = 1590;
            this.field4885[10][0] = 2355;
            this.field4885[11][0] = 2691;
            this.field4885[12][0] = 3031;
            this.field4885[10][3] = 3276;
            this.field4885[9][2] = 2056;
            this.field4885[11][3] = 3228;
            this.field4885[10][2] = 2586;
            this.field4885[12][3] = 3196;
            this.field4885[9][1] = 1766;
            this.field4885[11][2] = 3148;
            this.field4885[10][1] = 2409;
            this.field4885[13][3] = 3019;
            this.field4885[13][0] = 3522;
            this.field4885[11][1] = 3116;
            this.field4885[12][2] = 3710;
            this.field4885[14][0] = 3727;
            this.field4885[12][1] = 3806;
            this.field4885[13][1] = 3437;
            this.field4885[14][1] = 3116;
            this.field4885[13][2] = 3421;
            this.field4885[15][1] = 2377;
            this.field4885[14][3] = 3228;
            this.field4885[15][3] = 2746;
            this.field4885[15][0] = 4096;
            this.field4885[14][2] = 3148;
            this.field4885[15][2] = 2505;
        } else if (arg0 == 6) {
            this.field4885 = new int[4][4];
            this.field4885[0][3] = 0;
            this.field4885[0][0] = 2048;
            this.field4885[0][1] = 0;
            this.field4885[1][1] = 4096;
            this.field4885[0][2] = 4096;
            this.field4885[2][1] = 4096;
            this.field4885[1][0] = 2867;
            this.field4885[2][0] = 3276;
            this.field4885[3][1] = 4096;
            this.field4885[3][0] = 4096;
            this.field4885[1][2] = 4096;
            this.field4885[1][3] = 0;
            this.field4885[2][2] = 4096;
            this.field4885[2][3] = 0;
            this.field4885[3][3] = 0;
            this.field4885[3][2] = 0;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ZIII)V", line = 310)
    public static final void method1968(boolean arg0, int arg1, int arg2, int arg3) {
        field4887++;
        if (arg0) {
            field4880 = true;
        }
        class256 var4 = class30.method214(new class256[] { class40.field725, class305.method2125((byte) 45, arg3), class121.field2132, class305.method2125((byte) 124, arg1 >> 6), class121.field2132, class305.method2125((byte) 56, arg2 >> 6), class121.field2132, class305.method2125((byte) 66, arg1 & 0x3F), class121.field2132, class305.method2125((byte) 39, arg2 & 0x3F) }, 29784);
        var4.method1797(-112);
        class148.method1079(3, var4);
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(Lng;III)Lrd;", line = 324)
    public static final class135 method1969(class138 arg0, int arg1, int arg2, int arg3) {
        field4890++;
        if (class83.method611(arg1, 121, arg0, arg2)) {
            int var4 = 65 % ((56 - arg3) / 61);
            return class247.method1669(0);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!pl", name = "b", descriptor = "(II)[[I", line = 349)
    public final int[][] method55(int arg0, int arg1) {
        field4891++;
        if (arg0 != 75) {
            this.method1967(-118, (byte) 4);
        }
        int[][] var3 = this.field3169.method463(arg1, 1);
        if (this.field3169.field1080) {
            int[] var4 = this.method1312(0, arg1, (byte) -63);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class161.field2858; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field4877[var9];
                var5[var8] = class150.method1123(16711680, var10) >> 12;
                var7[var8] = class150.method1123(4080, var10 >> 4);
                var6[var8] = class150.method1123(var10 << 4, 4080);
            }
        }
        return var3;
    }

    @OriginalMember(owner = "client!pl", name = "k", descriptor = "(I)V", line = 402)
    public static final void method1970(int arg0) {
        class76.field1443.method2084(113);
        if (arg0 <= 9) {
            field4881 = (class256) null;
        }
        field4886++;
    }

    @OriginalMember(owner = "client!pl", name = "l", descriptor = "(I)V", line = 423)
    private final void method1971(int arg0) {
        field4876++;
        if (arg0 != 1781) {
            method1968(true, 68, 35, -79);
        }
        int var2 = this.field4885.length;
        if (var2 <= 0) {
            return;
        }
        for (int var3 = 0; var3 < 257; var3++) {
            int var4 = 0;
            int var5 = var3 << 4;
            for (int var6 = 0; var6 < var2 && var5 >= this.field4885[var6][0]; var6++) {
                var4++;
            }
            int var8;
            int var9;
            int var10;
            if (var4 < var2) {
                int[] var7 = this.field4885[var4];
                if (var4 <= 0) {
                    var8 = var7[1];
                    var9 = var7[2];
                    var10 = var7[3];
                } else {
                    int[] var11 = this.field4885[var4 - 1];
                    int var12 = (var5 - var11[0] << 12) / (var7[0] - var11[0]);
                    int var13 = 4096 - var12;
                    var8 = var7[1] * var12 + var11[1] * var13 >> 12;
                    var10 = var7[3] * var12 + var11[3] * var13 >> 12;
                    var9 = var7[2] * var12 + var11[2] * var13 >> 12;
                }
            } else {
                int[] var14 = this.field4885[var2 - 1];
                var8 = var14[1];
                var10 = var14[3];
                var9 = var14[2];
            }
            int var15 = var10 >> 4;
            int var16 = var8 >> 4;
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
            this.field4877[var3] = class100.method721(var15, class100.method721(var16 << 16, var17 << 8));
        }
    }

    @OriginalMember(owner = "client!pl", name = "a", descriptor = "(ILra;I)V", line = 531)
    public final void method54(int arg0, class41 arg1, int arg2) {
        field4883++;
        if (arg2 == 0) {
            int var4 = arg1.method357(false);
            if (var4 == 0) {
                this.field4885 = new int[arg1.method357(false)][4];
                for (int var5 = 0; var5 < this.field4885.length; var5++) {
                    this.field4885[var5][0] = arg1.method346(-16);
                    this.field4885[var5][1] = arg1.method357(false) << 4;
                    this.field4885[var5][2] = arg1.method357(false) << 4;
                    this.field4885[var5][3] = arg1.method357(false) << 4;
                }
            } else {
                this.method1967(var4, (byte) 10);
            }
        }
        if (arg0 < 108) {
            this.field4885 = (int[][]) ((int[][]) null);
        }
    }
}
