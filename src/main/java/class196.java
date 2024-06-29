import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fd")
public class class196 implements class202 {

    @OriginalMember(owner = "client!fd", name = "c", descriptor = "Lle;")
    private class65 field2832 = new class65(256);

    @OriginalMember(owner = "client!fd", name = "k", descriptor = "Lij;")
    private class316 field2840;

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "Lij;")
    private class316 field2831;

    @OriginalMember(owner = "client!fd", name = "f", descriptor = "[Lva;")
    private class55[] field2835;

    @OriginalMember(owner = "client!fd", name = "i", descriptor = "Lcp;")
    public static class399 field2838 = new class399();

    @OriginalMember(owner = "client!fd", name = "o", descriptor = "[I")
    public static int[] field2844;

    @OriginalMember(owner = "client!fd", name = "l", descriptor = "[I")
    public static int[] field2841;

    @OriginalMember(owner = "client!fd", name = "p", descriptor = "Z")
    public static boolean field2845;

    @OriginalMember(owner = "client!fd", name = "n", descriptor = "Ljm;")
    public static class162 field2843;

    @OriginalMember(owner = "client!fd", name = "t", descriptor = "Lhc;")
    public static class368 field2849;

    @OriginalMember(owner = "client!fd", name = "u", descriptor = "[[I")
    public static int[][] field2850;

    @OriginalMember(owner = "client!fd", name = "v", descriptor = "[Ljava/lang/String;")
    public static String[] field2851;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "I")
    public static int field2830;

    @OriginalMember(owner = "client!fd", name = "d", descriptor = "I")
    public static int field2833;

    @OriginalMember(owner = "client!fd", name = "e", descriptor = "I")
    public static int field2834;

    @OriginalMember(owner = "client!fd", name = "g", descriptor = "I")
    public static int field2836;

    @OriginalMember(owner = "client!fd", name = "h", descriptor = "I")
    public static int field2837;

    @OriginalMember(owner = "client!fd", name = "j", descriptor = "I")
    public static int field2839;

    @OriginalMember(owner = "client!fd", name = "m", descriptor = "I")
    public static int field2842;

    @OriginalMember(owner = "client!fd", name = "q", descriptor = "I")
    public static int field2846;

    @OriginalMember(owner = "client!fd", name = "r", descriptor = "I")
    public static int field2847;

    @OriginalMember(owner = "client!fd", name = "s", descriptor = "I")
    public static int field2848;

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(B)V")
    public static void method1358(byte arg0) {
        field2850 = null;
        field2851 = null;
        field2843 = null;
        if (arg0 == 64) {
            field2849 = null;
            field2838 = null;
            field2844 = null;
            field2841 = null;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IZBIIF)[F")
    public final float[] method1359(int arg0, boolean arg1, byte arg2, int arg3, int arg4, float arg5) {
        field2837++;
        if (arg2 > -92) {
            method1361((byte[][]) null, 21, (byte[]) null, 66, (int[]) null, (byte[][]) null, -29, (int[]) null);
        }
        return this.method1364(2, arg0).method676(this.field2831, arg4, arg3, (byte) 85, this.field2835[arg0].field725, this);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(BI)Z")
    public final boolean method1360(byte arg0, int arg1) {
        if (arg0 != -106) {
            this.method1360((byte) 22, 32);
        }
        field2847++;
        class84 var3 = this.method1364(2, arg1);
        return var3 != null && var3.method677(this.field2831, this, 0);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "([[BI[BI[I[[BI[I)I")
    public static final int method1361(byte[][] arg0, int arg1, byte[] arg2, int arg3, int[] arg4, byte[][] arg5, int arg6, int[] arg7) {
        field2833++;
        int var8 = arg4[arg1];
        int var9 = arg7[arg1] + var8;
        int var10 = arg4[arg3];
        int var11 = arg7[arg3] + var10;
        int var12 = var8;
        if (var10 > var8) {
            var12 = var10;
        }
        int var13 = var9;
        if (var11 < var9) {
            var13 = var11;
        }
        int var14 = arg2[arg1] & 0xFF;
        if (var14 > (arg2[arg3] & 0xFF)) {
            var14 = arg2[arg3] & 0xFF;
        }
        byte[] var15 = arg5[arg1];
        byte[] var16 = arg0[arg3];
        if (arg6 != 2) {
            return -15;
        }
        int var17 = var12 - var8;
        int var18 = var12 - var10;
        for (int var19 = var12; var19 < var13; var19++) {
            int var20 = var16[var18++] + var15[var17++];
            if (var20 < var14) {
                var14 = var20;
            }
        }
        return -var14;
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(I)Z")
    public static final boolean method1362(int arg0) {
        field2848++;
        if (arg0 != -1) {
            field2841 = null;
        }
        return class62.field836;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(I)V")
    public static final void method1363(int arg0) {
        field2836++;
        if (class397.field5501 == -1 || class147.field2139 == -1) {
            return;
        }
        int var1 = ((class217.field3055 - class405.field5610) * class72.field1055 >> 16) + class405.field5610;
        class72.field1055 += var1;
        if (class72.field1055 >= 65535) {
            if (class388.field5402) {
                class380.field5246 = false;
            } else {
                class380.field5246 = true;
            }
            class72.field1055 = 65535;
            class388.field5402 = true;
        } else {
            class388.field5402 = false;
            class380.field5246 = false;
        }
        float var2 = (float) class72.field1055 / 65535.0F;
        float[] var3 = new float[3];
        int var4 = class30.field413 * 2;
        for (int var5 = 0; var5 < 3; var5++) {
            int var21 = class398.field5515[class397.field5501][var4][var5] * 3;
            int var22 = class398.field5515[class397.field5501][var4 + 1][var5] * 3;
            int var23 = (-class398.field5515[class397.field5501][var4 + 3][var5] - (-class398.field5515[class397.field5501][var4 + 2][var5] - class398.field5515[class397.field5501][var4 + 2][var5])) * 3;
            int var24 = class398.field5515[class397.field5501][var4][var5];
            int var25 = var22 - var21;
            int var26 = var21 + var23 - var22 * 2;
            int var27 = var22 + class398.field5515[class397.field5501][var4 + 2][var5] - var24 - var23;
            var3[var5] = (((float) var27 * var2 + (float) var26) * var2 + (float) var25) * var2 + (float) var24;
        }
        class63.field874 = (int) var3[0] - class6.field65 * 128;
        class375.field5213 = (int) var3[2] - class371.field5148 * 128;
        class104.field1433 = (int) var3[1] * -1;
        float[] var6 = new float[3];
        int var7 = class98.field1353 * arg0;
        for (int var8 = 0; var8 < 3; var8++) {
            int var14 = class398.field5515[class147.field2139][var7][var8] * 3;
            int var15 = class398.field5515[class147.field2139][var7 + 1][var8] * 3;
            int var16 = (class398.field5515[class147.field2139][var7 + 2][var8] - (class398.field5515[class147.field2139][var7 + 3][var8] - class398.field5515[class147.field2139][var7 + 2][var8])) * 3;
            int var17 = class398.field5515[class147.field2139][var7][var8];
            int var18 = var15 - var14;
            int var19 = var16 + var14 - (var15 * 2);
            int var20 = var15 + class398.field5515[class147.field2139][var7 + 2][var8] - var16 - var17;
            var6[var8] = (((float) var20 * var2 + (float) var19) * var2 + (float) var18) * var2 + (float) var17;
        }
        float var9 = var6[0] - var3[0];
        float var10 = (var6[1] - var3[1]) * -1.0F;
        float var11 = var6[2] - var3[2];
        double var12 = Math.sqrt((double) (var9 * var9 + var11 * var11));
        class389.field5410 = (int) (Math.atan2((double) var10, var12) * 2607.5945876176133D) & 0x3FFF;
        class86.field1208 = (int) (-Math.atan2((double) var9, (double) var11) * 2607.5945876176133D) & 0x3FFF;
        class103.field1426 = ((class398.field5515[class397.field5501][var4 + 2][3] - class398.field5515[class397.field5501][var4][3]) * class72.field1055 >> 16) + class398.field5515[class397.field5501][var4][3];
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(II)Lmr;")
    private final class84 method1364(int arg0, int arg1) {
        field2842++;
        class170 var3 = this.field2832.method515(-1, (long) arg1);
        if (var3 != null) {
            return (class84) var3;
        }
        byte[] var4 = this.field2840.method1908((byte) -22, arg1);
        if (var4 == null) {
            return null;
        }
        class84 var5 = new class84(new class366(var4));
        if (arg0 != 2) {
            field2841 = null;
        }
        this.field2832.method519((long) arg1, true, var5);
        return var5;
    }

    @OriginalMember(owner = "client!fd", name = "b", descriptor = "(B)V")
    public static final void method1365(byte arg0) {
        field2834++;
        try {
            if (class10.field78 == 1) {
                int var1 = class105.field1477.method2382(23059);
                if (var1 > 0 && class105.field1477.method2413(86)) {
                    int var2 = var1 - class277.field3784;
                    if (var2 < 0) {
                        var2 = 0;
                    }
                    class105.field1477.method2391(arg0 ^ 0x50, var2);
                    return;
                }
                class105.field1477.method2377(-124);
                class105.field1477.method2387(294323394);
                if (class82.field1136 == null) {
                    class10.field78 = 0;
                } else {
                    class10.field78 = 2;
                }
                class408.field5692 = null;
                class362.field4992 = null;
            }
            if (arg0 != 64) {
                method1363(-114);
            }
        } catch (Exception var4) {
            var4.printStackTrace();
            class105.field1477.method2377(-94);
            class408.field5692 = null;
            class362.field4992 = null;
            class82.field1136 = null;
            class10.field78 = 0;
        }
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(II)Lva;")
    public final class55 method1366(int arg0, int arg1) {
        if (arg1 != -11039) {
            field2845 = false;
        }
        field2846++;
        return this.field2835[arg0];
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(IIIZFI)[I")
    public final int[] method1367(int arg0, int arg1, int arg2, boolean arg3, float arg4, int arg5) {
        if (arg5 != -9882) {
            this.method1360((byte) -20, -64);
        }
        field2839++;
        return this.method1364(arg5 ^ 0xFFFFD964, arg2).method674(this.field2831, (double) arg4, this, arg3, arg1, arg0, this.field2835[arg2].field725, arg5 ^ 0x5123);
    }

    @OriginalMember(owner = "client!fd", name = "a", descriptor = "(ZFIIBI)[I")
    public final int[] method1368(boolean arg0, float arg1, int arg2, int arg3, byte arg4, int arg5) {
        field2830++;
        if (arg4 != -74) {
            this.method1367(12, -120, 84, true, -0.10729796F, 38);
        }
        return this.method1364(2, arg5).method672(this.field2835[arg5].field725, arg2, arg3, this, (double) arg1, this.field2831, true);
    }

    @OriginalMember(owner = "client!fd", name = "<init>", descriptor = "(Lij;Lij;Lij;)V")
    public class196(class316 arg0, class316 arg1, class316 arg2) {
        this.field2840 = arg1;
        this.field2831 = arg2;
        class366 var4 = new class366(arg0.method1926(0, 0, 0));
        int var5 = var4.method2297(13352);
        this.field2835 = new class55[var5];
        for (int var6 = 0; var6 < var5; var6++) {
            if (var4.method2306((byte) 31) == 1) {
                this.field2835[var6] = new class55();
            }
        }
        for (int var7 = 0; var7 < var5; var7++) {
            if (this.field2835[var7] != null) {
                this.field2835[var7].field709 = var4.method2306((byte) 101) == 0;
            }
        }
        for (int var8 = 0; var8 < var5; var8++) {
            if (this.field2835[var8] != null) {
                this.field2835[var8].field719 = var4.method2306((byte) 87) == 1;
            }
        }
        for (int var9 = 0; var9 < var5; var9++) {
            if (this.field2835[var9] != null) {
                this.field2835[var9].field708 = var4.method2306((byte) 40) == 1;
            }
        }
        for (int var10 = 0; var10 < var5; var10++) {
            if (this.field2835[var10] != null) {
                this.field2835[var10].field712 = var4.method2306((byte) 77) == 1;
            }
        }
        for (int var11 = 0; var11 < var5; var11++) {
            if (this.field2835[var11] != null) {
                this.field2835[var11].field715 = var4.method2289((byte) -77);
            }
        }
        for (int var12 = 0; var12 < var5; var12++) {
            if (this.field2835[var12] != null) {
                this.field2835[var12].field716 = var4.method2289((byte) -77);
            }
        }
        for (int var13 = 0; var13 < var5; var13++) {
            if (this.field2835[var13] != null) {
                this.field2835[var13].field707 = var4.method2289((byte) -77);
            }
        }
        for (int var14 = 0; var14 < var5; var14++) {
            if (this.field2835[var14] != null) {
                this.field2835[var14].field710 = var4.method2289((byte) -77);
            }
        }
        for (int var15 = 0; var15 < var5; var15++) {
            if (this.field2835[var15] != null) {
                this.field2835[var15].field723 = (short) var4.method2297(13352);
            }
        }
        for (int var16 = 0; var16 < var5; var16++) {
            if (this.field2835[var16] != null) {
                this.field2835[var16].field722 = var4.method2289((byte) -77);
            }
        }
        for (int var17 = 0; var17 < var5; var17++) {
            if (this.field2835[var17] != null) {
                this.field2835[var17].field721 = var4.method2289((byte) -77);
            }
        }
        for (int var18 = 0; var18 < var5; var18++) {
            if (this.field2835[var18] != null) {
                this.field2835[var18].field702 = var4.method2306((byte) 40) == 1;
            }
        }
        for (int var19 = 0; var19 < var5; var19++) {
            if (this.field2835[var19] != null) {
                this.field2835[var19].field725 = var4.method2306((byte) 97) == 1;
            }
        }
        for (int var20 = 0; var20 < var5; var20++) {
            if (this.field2835[var20] != null) {
                this.field2835[var20].field705 = var4.method2289((byte) -77);
            }
        }
        for (int var21 = 0; var21 < var5; var21++) {
            if (this.field2835[var21] != null) {
                this.field2835[var21].field714 = var4.method2306((byte) 33) == 1;
            }
        }
        for (int var22 = 0; var22 < var5; var22++) {
            if (this.field2835[var22] != null) {
                this.field2835[var22].field699 = var4.method2306((byte) 36) == 1;
            }
        }
        for (int var23 = 0; var23 < var5; var23++) {
            if (this.field2835[var23] != null) {
                this.field2835[var23].field717 = var4.method2306((byte) 127) == 1;
            }
        }
    }

    static {
        new class368("Now talking in clan channel ", "Chatraum: ", "Vous participez actuellement au canal de clan ", "Falando no canal do clã agora ");
        field2844 = new int[2];
        field2841 = new int[4096];
        field2845 = false;
        field2843 = new class162();
        field2849 = new class368("Loaded client variable data", "Client-Variablen geladen", "Variables du client chargées", "As variáveis do sistema foram carregadas");
        field2850 = new int[][] { { 0, 2 }, { 0, 2 }, { 0, 0, 2 }, { 2, 0, 0 }, { 0, 2, 0 }, { 0, 0, 2 }, { 0, 5, 1, 4 }, { 0, 4, 4, 4 }, { 4, 4, 4, 0 }, { 6, 6, 6, 2, 2, 2 }, { 2, 2, 2, 6, 6, 6 }, { 0, 11, 6, 6, 6, 4 }, { 0, 2 }, { 0, 4, 4, 4 }, { 0, 4, 4, 4 } };
        field2851 = new String[200];
    }
}
