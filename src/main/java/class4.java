import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class4 extends class183 {

    @OriginalMember(owner = "client!qc", name = "fb", descriptor = "[I")
    private int[] field39 = new int[257];

    @OriginalMember(owner = "client!qc", name = "V", descriptor = "Ljf;")
    private static class229 field29 = class212.method1457((byte) 116, "Checking for updates )2 ");

    @OriginalMember(owner = "client!qc", name = "T", descriptor = "I")
    public static int field27 = -2;

    @OriginalMember(owner = "client!qc", name = "ib", descriptor = "Ljf;")
    public static class229 field42 = field29;

    @OriginalMember(owner = "client!qc", name = "bb", descriptor = "I")
    public static int field35 = 0;

    @OriginalMember(owner = "client!qc", name = "ab", descriptor = "I")
    public static int field34 = 0;

    @OriginalMember(owner = "client!qc", name = "U", descriptor = "I")
    public static int field28;

    @OriginalMember(owner = "client!qc", name = "W", descriptor = "I")
    public static int field30;

    @OriginalMember(owner = "client!qc", name = "X", descriptor = "I")
    public static int field31;

    @OriginalMember(owner = "client!qc", name = "Y", descriptor = "I")
    public static int field32;

    @OriginalMember(owner = "client!qc", name = "Z", descriptor = "I")
    public static int field33;

    @OriginalMember(owner = "client!qc", name = "cb", descriptor = "I")
    public static int field36;

    @OriginalMember(owner = "client!qc", name = "db", descriptor = "I")
    public static int field37;

    @OriginalMember(owner = "client!qc", name = "gb", descriptor = "I")
    public static int field40;

    @OriginalMember(owner = "client!qc", name = "hb", descriptor = "I")
    public static int field41;

    @OriginalMember(owner = "client!qc", name = "jb", descriptor = "I")
    public static int field43;

    @OriginalMember(owner = "client!qc", name = "kb", descriptor = "I")
    public static int field44;

    @OriginalMember(owner = "client!qc", name = "eb", descriptor = "[[I")
    private int[][] field38;

    @OriginalMember(owner = "client!qc", name = "d", descriptor = "(II)Ljf;", line = 5)
    public static final class229 method19(int arg0, int arg1) {
        int var2 = 95 % ((-arg1 - 28) / 33);
        class229 var3 = new class229();
        field30++;
        var3.field3973 = 0;
        var3.field3944 = new byte[arg0];
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(II)I", line = 24)
    public static final int method20(int arg0, int arg1) {
        field36++;
        int var2 = -116 / ((22 - arg0) / 45);
        return arg1 >>> 7;
    }

    @OriginalMember(owner = "client!qc", name = "e", descriptor = "(B)V", line = 38)
    private final void method21(byte arg0) {
        field32++;
        int var2 = this.field38.length;
        int var3 = 111 / ((arg0 + 89) / 37);
        if (var2 <= 0) {
            return;
        }
        for (int var4 = 0; var4 < 257; var4++) {
            int var5 = 0;
            int var6 = var4 << 4;
            for (int var7 = 0; var2 > var7 && var6 >= this.field38[var7][0]; var7++) {
                var5++;
            }
            int var9;
            int var10;
            int var11;
            if (var2 > var5) {
                int[] var8 = this.field38[var5];
                if (var5 <= 0) {
                    var9 = var8[3];
                    var10 = var8[1];
                    var11 = var8[2];
                } else {
                    int[] var12 = this.field38[var5 - 1];
                    int var13 = (var6 - var12[0] << 12) / (var8[0] - var12[0]);
                    int var14 = 4096 - var13;
                    var10 = var8[1] * var13 + var12[1] * var14 >> 12;
                    var9 = var8[3] * var13 + var12[3] * var14 >> 12;
                    var11 = var8[2] * var13 + var12[2] * var14 >> 12;
                }
            } else {
                int[] var15 = this.field38[var2 - 1];
                var10 = var15[1];
                var11 = var15[2];
                var9 = var15[3];
            }
            int var16 = var9 >> 4;
            if (var16 < 0) {
                var16 = 0;
            } else if (var16 > 255) {
                var16 = 255;
            }
            int var17 = var11 >> 4;
            int var18 = var10 >> 4;
            if (var17 < 0) {
                var17 = 0;
            } else if (var17 > 255) {
                var17 = 255;
            }
            if (var18 < 0) {
                var18 = 0;
            } else if (var18 > 255) {
                var18 = 255;
            }
            this.field39[var4] = class97.method665(class97.method665(var18 << 16, var17 << 8), var16);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ILkh;I)V", line = 142)
    public final void method14(int arg0, class14 arg1, int arg2) {
        field28++;
        if (arg2 == 0) {
            int var4 = arg1.method93(false);
            if (var4 == 0) {
                this.field38 = new int[arg1.method93(false)][4];
                for (int var5 = 0; var5 < this.field38.length; var5++) {
                    this.field38[var5][0] = arg1.method116(-1);
                    this.field38[var5][1] = arg1.method93(false) << 4;
                    this.field38[var5][2] = arg1.method93(false) << 4;
                    this.field38[var5][3] = arg1.method93(false) << 4;
                }
            } else {
                this.method24(true, var4);
            }
        }
        if (arg0 > -43) {
            this.method21((byte) 39);
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Lkh;I)V", line = 179)
    public static final void method22(class14 arg0, int arg1) {
        field33++;
        if (arg0.field174.length - arg0.field195 < 1) {
            return;
        }
        int var2 = arg0.method93(false);
        if (var2 < 0 || var2 > 8) {
            return;
        }
        byte var3;
        if (var2 == 8) {
            var3 = 30;
        } else if (var2 == 7) {
            var3 = 29;
        } else if (var2 == 6) {
            var3 = 28;
        } else if (var2 == 5) {
            var3 = 28;
        } else if (var2 == 4) {
            var3 = 24;
        } else if (var2 == 3) {
            var3 = 23;
        } else if (var2 == 2) {
            var3 = 22;
        } else if (var2 == 1) {
            var3 = 23;
        } else {
            var3 = 19;
        }
        if (var3 > (arg0.field174.length - arg0.field195)) {
            return;
        }
        class281.field4822 = arg0.method93(false);
        if (class281.field4822 < 1) {
            class281.field4822 = 1;
        } else if (class281.field4822 > 4) {
            class281.field4822 = 4;
        }
        class44.method387(arg0.method93(false) == 1, 1);
        class320.field5415 = arg0.method93(false) == 1;
        class41.field735 = arg0.method93(false) == 1;
        class302.field5140 = arg0.method93(false) == 1;
        if (arg1 >= -18) {
            return;
        }
        class308.field5212 = arg0.method93(false) == 1;
        class329.field5605 = arg0.method93(false) == 1;
        class38.field713 = arg0.method93(false) == 1;
        class45.field825 = arg0.method93(false) == 1;
        class243.field4293 = arg0.method93(false);
        if (class243.field4293 > 2) {
            class243.field4293 = 2;
        }
        if (var2 < 2) {
            class329.field5607 = arg0.method93(false) == 1;
            arg0.method93(false);
        } else {
            class329.field5607 = arg0.method93(false) == 1;
        }
        class98.field1750 = arg0.method93(false) == 1;
        class201.field3527 = arg0.method93(false) == 1;
        class327.field5494 = arg0.method93(false);
        if (class327.field5494 > 2) {
            class327.field5494 = 2;
        }
        class252.field4406 = class327.field5494;
        class15.field218 = arg0.method93(false) == 1;
        class298.field5083 = arg0.method93(false);
        if (class298.field5083 > 127) {
            class298.field5083 = 127;
        }
        class27.field487 = arg0.method93(false);
        class31.field531 = arg0.method93(false);
        if (class31.field531 > 127) {
            class31.field531 = 127;
        }
        if (var2 >= 1) {
            class221.field3771 = arg0.method116(-1);
            class70.field1347 = arg0.method116(-1);
        }
        if (var2 >= 3 && var2 < 6) {
            arg0.method93(false);
        }
        if (var2 >= 4) {
            class164.method1127(arg0.method93(false));
        }
        if (var2 >= 5) {
            class1.field6 = arg0.method128((byte) 4);
        }
        if (var2 >= 6) {
            class186.field3269 = arg0.method93(false);
        }
        if (var2 >= 7) {
            class118.field2109 = arg0.method93(false) == 1;
        }
        if (var2 >= 8) {
            class282.field4836 = arg0.method93(false) == 1;
        }
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(B)V", line = 317)
    public static void method23(byte arg0) {
        field42 = null;
        field29 = null;
        if (arg0 > -94) {
            field27 = 5;
        }
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(ZI)V", line = 328)
    private final void method24(boolean arg0, int arg1) {
        field40++;
        if (!arg0 || arg1 == 0) {
            return;
        }
        if (arg1 == 1) {
            this.field38 = new int[2][4];
            this.field38[0][1] = 0;
            this.field38[0][0] = 0;
            this.field38[0][2] = 0;
            this.field38[1][1] = 4096;
            this.field38[1][2] = 4096;
            this.field38[0][3] = 0;
            this.field38[1][0] = 4096;
            this.field38[1][3] = 4096;
        } else if (arg1 == 2) {
            this.field38 = new int[8][4];
            this.field38[0][3] = 2361;
            this.field38[0][2] = 2602;
            this.field38[0][1] = 2650;
            this.field38[1][1] = 2313;
            this.field38[0][0] = 0;
            this.field38[1][0] = 2867;
            this.field38[2][0] = 3072;
            this.field38[2][1] = 2618;
            this.field38[3][1] = 2296;
            this.field38[1][3] = 1558;
            this.field38[4][1] = 2072;
            this.field38[2][3] = 1413;
            this.field38[1][2] = 1799;
            this.field38[2][2] = 1734;
            this.field38[3][0] = 3276;
            this.field38[4][0] = 3481;
            this.field38[5][0] = 3686;
            this.field38[3][2] = 1220;
            this.field38[4][2] = 963;
            this.field38[3][3] = 947;
            this.field38[6][0] = 3891;
            this.field38[7][0] = 4096;
            this.field38[5][2] = 2152;
            this.field38[5][1] = 2730;
            this.field38[6][1] = 2232;
            this.field38[4][3] = 722;
            this.field38[6][2] = 1060;
            this.field38[7][2] = 1413;
            this.field38[5][3] = 1766;
            this.field38[7][1] = 1686;
            this.field38[6][3] = 915;
            this.field38[7][3] = 1140;
        } else if (arg1 == 3) {
            this.field38 = new int[7][4];
            this.field38[0][1] = 0;
            this.field38[0][2] = 0;
            this.field38[1][2] = 4096;
            this.field38[0][0] = 0;
            this.field38[1][0] = 663;
            this.field38[2][0] = 1363;
            this.field38[2][2] = 4096;
            this.field38[0][3] = 4096;
            this.field38[3][0] = 2048;
            this.field38[1][1] = 0;
            this.field38[4][0] = 2727;
            this.field38[2][1] = 0;
            this.field38[3][2] = 4096;
            this.field38[1][3] = 4096;
            this.field38[4][2] = 0;
            this.field38[3][1] = 4096;
            this.field38[5][2] = 0;
            this.field38[4][1] = 4096;
            this.field38[6][2] = 0;
            this.field38[5][1] = 4096;
            this.field38[2][3] = 0;
            this.field38[6][1] = 0;
            this.field38[3][3] = 0;
            this.field38[5][0] = 3411;
            this.field38[4][3] = 0;
            this.field38[5][3] = 4096;
            this.field38[6][0] = 4096;
            this.field38[6][3] = 4096;
        } else if (arg1 == 4) {
            this.field38 = new int[6][4];
            this.field38[0][2] = 0;
            this.field38[0][0] = 0;
            this.field38[0][3] = 0;
            this.field38[1][2] = 0;
            this.field38[0][1] = 0;
            this.field38[2][2] = 0;
            this.field38[1][1] = 0;
            this.field38[1][3] = 1493;
            this.field38[1][0] = 1843;
            this.field38[2][3] = 2939;
            this.field38[2][0] = 2457;
            this.field38[2][1] = 0;
            this.field38[3][0] = 2781;
            this.field38[3][1] = 0;
            this.field38[3][2] = 1124;
            this.field38[4][0] = 3481;
            this.field38[4][1] = 546;
            this.field38[5][0] = 4096;
            this.field38[3][3] = 3565;
            this.field38[5][1] = 4096;
            this.field38[4][3] = 4031;
            this.field38[5][3] = 4096;
            this.field38[4][2] = 3084;
            this.field38[5][2] = 4096;
        } else if (arg1 == 5) {
            this.field38 = new int[16][4];
            this.field38[0][0] = 0;
            this.field38[0][1] = 80;
            this.field38[1][0] = 155;
            this.field38[2][0] = 389;
            this.field38[1][1] = 321;
            this.field38[0][2] = 192;
            this.field38[3][0] = 671;
            this.field38[2][1] = 578;
            this.field38[4][0] = 897;
            this.field38[0][3] = 321;
            this.field38[1][3] = 562;
            this.field38[2][3] = 803;
            this.field38[5][0] = 1175;
            this.field38[3][1] = 947;
            this.field38[4][1] = 1285;
            this.field38[6][0] = 1368;
            this.field38[3][3] = 1140;
            this.field38[4][3] = 1509;
            this.field38[5][1] = 1525;
            this.field38[1][2] = 449;
            this.field38[2][2] = 690;
            this.field38[7][0] = 1507;
            this.field38[5][3] = 1413;
            this.field38[3][2] = 995;
            this.field38[6][3] = 1333;
            this.field38[8][0] = 1736;
            this.field38[4][2] = 1397;
            this.field38[7][3] = 1702;
            this.field38[6][1] = 1734;
            this.field38[5][2] = 1429;
            this.field38[7][1] = 1413;
            this.field38[6][2] = 1461;
            this.field38[8][3] = 2056;
            this.field38[8][1] = 1108;
            this.field38[9][1] = 1766;
            this.field38[9][0] = 2088;
            this.field38[10][1] = 2409;
            this.field38[7][2] = 1525;
            this.field38[8][2] = 1590;
            this.field38[9][2] = 2056;
            this.field38[9][3] = 2666;
            this.field38[10][3] = 3276;
            this.field38[10][0] = 2355;
            this.field38[10][2] = 2586;
            this.field38[11][0] = 2691;
            this.field38[11][1] = 3116;
            this.field38[12][0] = 3031;
            this.field38[12][1] = 3806;
            this.field38[11][2] = 3148;
            this.field38[11][3] = 3228;
            this.field38[13][1] = 3437;
            this.field38[14][1] = 3116;
            this.field38[12][2] = 3710;
            this.field38[13][0] = 3522;
            this.field38[15][1] = 2377;
            this.field38[12][3] = 3196;
            this.field38[14][0] = 3727;
            this.field38[13][2] = 3421;
            this.field38[14][2] = 3148;
            this.field38[15][0] = 4096;
            this.field38[13][3] = 3019;
            this.field38[15][2] = 2505;
            this.field38[14][3] = 3228;
            this.field38[15][3] = 2746;
        } else if (arg1 == 6) {
            this.field38 = new int[4][4];
            this.field38[0][2] = 4096;
            this.field38[0][1] = 0;
            this.field38[0][3] = 0;
            this.field38[1][2] = 4096;
            this.field38[1][3] = 0;
            this.field38[2][3] = 0;
            this.field38[3][3] = 0;
            this.field38[1][1] = 4096;
            this.field38[2][1] = 4096;
            this.field38[3][1] = 4096;
            this.field38[0][0] = 2048;
            this.field38[2][2] = 4096;
            this.field38[3][2] = 0;
            this.field38[1][0] = 2867;
            this.field38[2][0] = 3276;
            this.field38[3][0] = 4096;
        } else {
            throw new RuntimeException("Invalid gradient preset");
        }
    }

    @OriginalMember(owner = "client!qc", name = "c", descriptor = "(I)V", line = 584)
    public final void method25(int arg0) {
        if (this.field38 == null) {
            this.method24(true, 1);
        }
        this.method21((byte) -14);
        if (arg0 != -8) {
            field34 = -63;
        }
        field41++;
    }

    @OriginalMember(owner = "client!qc", name = "<init>", descriptor = "()V", line = 600)
    public class4() {
        super(1, false);
    }

    @OriginalMember(owner = "client!qc", name = "f", descriptor = "(II)[F", line = 615)
    public static final float[] method26(int arg0, int arg1) {
        field44++;
        float var2 = class276.method1945() + class276.method1942();
        int var3 = class276.method1939();
        float var4 = (float) (var3 & 0xFF) / 255.0F;
        float var5 = (float) ((var3 & 0xFF77D5) >> 16) / 255.0F;
        class97.field1725[3] = 1.0F;
        float var6 = 0.58823526F;
        float var7 = (float) (var3 >> 8 & 0xFF) / 255.0F;
        class97.field1725[1] = var2 * var7 * ((float) class305.method2086(255, arg1 >> 8) / 255.0F) * var6;
        class97.field1725[2] = var2 * (float) class305.method2086(arg0, arg1) / 255.0F * var4 * var6;
        class97.field1725[0] = var5 * ((float) class305.method2086(arg1 >> 16, 255) / 255.0F) * var6 * var2;
        return class97.field1725;
    }

    @OriginalMember(owner = "client!qc", name = "b", descriptor = "(II)[[I", line = 647)
    public final int[][] method12(int arg0, int arg1) {
        int[][] var3 = this.field3160.method1057(-20449, arg1);
        if (this.field3160.field2689) {
            int[] var4 = this.method1253(0, arg1, 122);
            int[] var5 = var3[0];
            int[] var6 = var3[2];
            int[] var7 = var3[1];
            for (int var8 = 0; var8 < class22.field393; var8++) {
                int var9 = var4[var8] >> 4;
                if (var9 < 0) {
                    var9 = 0;
                }
                if (var9 > 256) {
                    var9 = 256;
                }
                int var10 = this.field39[var9];
                var5[var8] = class305.method2086(var10 >> 12, 4080);
                var7[var8] = class305.method2086(4080, var10 >> 4);
                var6[var8] = class305.method2086(var10 << 4, 4080);
            }
        }
        int var11 = -14 / ((18 - arg0) / 61);
        field43++;
        return var3;
    }

    @OriginalMember(owner = "client!qc", name = "a", descriptor = "(Z[B)[B", line = 699)
    public static final byte[] method27(boolean arg0, byte[] arg1) {
        field37++;
        if (arg1 == null) {
            return null;
        }
        if (arg0) {
            field42 = (class229) null;
        }
        byte[] var2 = new byte[arg1.length];
        class36.method321(arg1, 0, var2, 0, arg1.length);
        return var2;
    }
}
