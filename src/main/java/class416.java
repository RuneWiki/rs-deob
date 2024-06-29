import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pr")
public class class416 {

    @OriginalMember(owner = "client!pr", name = "f", descriptor = "[F")
    private float[] field5688 = new float[16];

    @OriginalMember(owner = "client!pr", name = "d", descriptor = "Lps;")
    private class85 field5686 = new class85(786336);

    @OriginalMember(owner = "client!pr", name = "m", descriptor = "I")
    private int field5695 = class364.method2153((byte) -79, 1600);

    @OriginalMember(owner = "client!pr", name = "v", descriptor = "[[Ldi;")
    private class115[][] field5704 = new class115[64][768];

    @OriginalMember(owner = "client!pr", name = "u", descriptor = "[I")
    private int[] field5703 = new int[1600];

    @OriginalMember(owner = "client!pr", name = "s", descriptor = "I")
    private int field5701 = 0;

    @OriginalMember(owner = "client!pr", name = "w", descriptor = "[[Ldi;")
    private class115[][] field5705 = new class115[1600][64];

    @OriginalMember(owner = "client!pr", name = "t", descriptor = "[I")
    private int[] field5702 = new int[64];

    @OriginalMember(owner = "client!pr", name = "x", descriptor = "[I")
    private int[] field5706 = new int[8191];

    @OriginalMember(owner = "client!pr", name = "b", descriptor = "[I")
    public static int[] field5684 = new int[] { 3, 7, 15 };

    @OriginalMember(owner = "client!pr", name = "j", descriptor = "Ldb;")
    public static class298 field5692 = new class298(68, -2);

    @OriginalMember(owner = "client!pr", name = "k", descriptor = "I")
    public static int field5693 = -1;

    @OriginalMember(owner = "client!pr", name = "l", descriptor = "I")
    public static int field5694 = -1;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "I")
    public static int field5683;

    @OriginalMember(owner = "client!pr", name = "c", descriptor = "I")
    public static int field5685;

    @OriginalMember(owner = "client!pr", name = "e", descriptor = "I")
    public static int field5687;

    @OriginalMember(owner = "client!pr", name = "g", descriptor = "I")
    public static int field5689;

    @OriginalMember(owner = "client!pr", name = "h", descriptor = "I")
    public static int field5690;

    @OriginalMember(owner = "client!pr", name = "i", descriptor = "I")
    public static int field5691;

    @OriginalMember(owner = "client!pr", name = "o", descriptor = "I")
    public static int field5697;

    @OriginalMember(owner = "client!pr", name = "n", descriptor = "Lgb;")
    private class202 field5696;

    @OriginalMember(owner = "client!pr", name = "p", descriptor = "Lgda;")
    private class51 field5698;

    @OriginalMember(owner = "client!pr", name = "q", descriptor = "Lgda;")
    private class51 field5699;

    @OriginalMember(owner = "client!pr", name = "r", descriptor = "Lgda;")
    private class51 field5700;

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lno;B)V", line = 3)
    private final void method2379(class658 arg0, byte arg1) {
        field5689++;
        arg0.method3680(-94, true);
        int var3 = 69 % ((arg1 - 31) / 32);
        OpenGL.glEnable(16384);
        OpenGL.glEnable(16385);
        if (class108.field1588 != arg0.field9293) {
            arg0.method442(class108.field1588);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lno;I)V", line = 20)
    public final void method2380(class658 arg0, int arg1) {
        this.field5696 = arg0.method3641(24, null, true, 5225, 196584);
        field5697++;
        this.field5698 = new class51(this.field5696, 5126, 2, 0);
        this.field5700 = new class51(this.field5696, 5126, 3, 8);
        this.field5699 = new class51(this.field5696, arg1, 4, 20);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(Lno;II)V", line = 34)
    private final void method2381(class658 arg0, int arg1, int arg2) {
        OpenGL.glGetFloatv(2982, this.field5688, 0);
        field5683++;
        float var4 = this.field5688[0];
        float var5 = this.field5688[4];
        float var6 = this.field5688[8];
        float var7 = this.field5688[1];
        if (arg2 <= 57) {
            this.method2383(111, null);
        }
        float var8 = this.field5688[5];
        float var9 = this.field5688[9];
        float var10 = var4 + var7;
        float var11 = var5 + var8;
        float var12 = var6 + var9;
        float var13 = var4 - var7;
        float var14 = var5 - var8;
        float var15 = var6 - var9;
        float var16 = var7 - var4;
        float var17 = var8 - var5;
        float var18 = var9 - var6;
        this.field5686.field4619 = 0;
        if (arg0.field9272) {
            for (int var44 = arg1 - 1; var44 >= 0; var44--) {
                int var45 = this.field5703[var44] > 64 ? 64 : this.field5703[var44];
                if (var45 > 0) {
                    for (int var46 = var45 - 1; var46 >= 0; var46--) {
                        class115 var59 = this.field5705[var44][var46];
                        int var60 = var59.field1979;
                        byte var61 = (byte) (var60 >> 16);
                        byte var62 = (byte) (var60 >> 8);
                        byte var63 = (byte) var60;
                        byte var64 = (byte) (var60 >>> 24);
                        float var65 = (float) (var59.field1973 >> 12);
                        float var66 = (float) (var59.field1976 >> 12);
                        float var67 = (float) (var59.field1972 >> 12);
                        int var68 = var59.field1983 >> 12;
                        this.field5686.method693(0.0F, 47);
                        this.field5686.method693(0.0F, 80);
                        this.field5686.method693((float) (-var68) * var10 + var65, 28);
                        this.field5686.method693((float) (-var68) * var11 + var66, 50);
                        this.field5686.method693((float) (-var68) * var12 + var67, 97);
                        this.field5686.method1980(-345277664, var61);
                        this.field5686.method1980(-345277664, var62);
                        this.field5686.method1980(-345277664, var63);
                        this.field5686.method1980(-345277664, var64);
                        this.field5686.method693(1.0F, 84);
                        this.field5686.method693(0.0F, 106);
                        this.field5686.method693((float) var68 * var13 + var65, 107);
                        this.field5686.method693((float) var68 * var14 + var66, 127);
                        this.field5686.method693((float) var68 * var15 + var67, 111);
                        this.field5686.method1980(-345277664, var61);
                        this.field5686.method1980(-345277664, var62);
                        this.field5686.method1980(-345277664, var63);
                        this.field5686.method1980(-345277664, var64);
                        this.field5686.method693(1.0F, 68);
                        this.field5686.method693(1.0F, 26);
                        this.field5686.method693((float) var68 * var10 + var65, 84);
                        this.field5686.method693((float) var68 * var11 + var66, 48);
                        this.field5686.method693((float) var68 * var12 + var67, 72);
                        this.field5686.method1980(-345277664, var61);
                        this.field5686.method1980(-345277664, var62);
                        this.field5686.method1980(-345277664, var63);
                        this.field5686.method1980(-345277664, var64);
                        this.field5686.method693(0.0F, 93);
                        this.field5686.method693(1.0F, 75);
                        this.field5686.method693((float) var68 * var16 + var65, 25);
                        this.field5686.method693((float) var68 * var17 + var66, 54);
                        this.field5686.method693((float) var68 * var18 + var67, 67);
                        this.field5686.method1980(-345277664, var61);
                        this.field5686.method1980(-345277664, var62);
                        this.field5686.method1980(-345277664, var63);
                        this.field5686.method1980(-345277664, var64);
                    }
                    if (this.field5703[var44] > 64) {
                        int var47 = this.field5703[var44] - 65;
                        for (int var48 = this.field5702[var47] - 1; var48 >= 0; var48--) {
                            class115 var49 = this.field5704[var47][var48];
                            int var50 = var49.field1979;
                            byte var51 = (byte) (var50 >> 16);
                            byte var52 = (byte) (var50 >> 8);
                            byte var53 = (byte) var50;
                            byte var54 = (byte) (var50 >>> 24);
                            float var55 = (float) (var49.field1973 >> 12);
                            float var56 = (float) (var49.field1976 >> 12);
                            float var57 = (float) (var49.field1972 >> 12);
                            int var58 = var49.field1983 >> 12;
                            this.field5686.method693(0.0F, 31);
                            this.field5686.method693(0.0F, 45);
                            this.field5686.method693((float) (-var58) * var10 + var55, 67);
                            this.field5686.method693((float) (-var58) * var11 + var56, 44);
                            this.field5686.method693((float) (-var58) * var12 + var57, 54);
                            this.field5686.method1980(-345277664, var51);
                            this.field5686.method1980(-345277664, var52);
                            this.field5686.method1980(-345277664, var53);
                            this.field5686.method1980(-345277664, var54);
                            this.field5686.method693(1.0F, 103);
                            this.field5686.method693(0.0F, 78);
                            this.field5686.method693((float) var58 * var13 + var55, 49);
                            this.field5686.method693((float) var58 * var14 + var56, 119);
                            this.field5686.method693((float) var58 * var15 + var57, 59);
                            this.field5686.method1980(-345277664, var51);
                            this.field5686.method1980(-345277664, var52);
                            this.field5686.method1980(-345277664, var53);
                            this.field5686.method1980(-345277664, var54);
                            this.field5686.method693(1.0F, 61);
                            this.field5686.method693(1.0F, 100);
                            this.field5686.method693((float) var58 * var10 + var55, 39);
                            this.field5686.method693((float) var58 * var11 + var56, 88);
                            this.field5686.method693((float) var58 * var12 + var57, 38);
                            this.field5686.method1980(-345277664, var51);
                            this.field5686.method1980(-345277664, var52);
                            this.field5686.method1980(-345277664, var53);
                            this.field5686.method1980(-345277664, var54);
                            this.field5686.method693(0.0F, 34);
                            this.field5686.method693(1.0F, 33);
                            this.field5686.method693((float) var58 * var16 + var55, 36);
                            this.field5686.method693((float) var58 * var17 + var56, 119);
                            this.field5686.method693((float) var58 * var18 + var57, 78);
                            this.field5686.method1980(-345277664, var51);
                            this.field5686.method1980(-345277664, var52);
                            this.field5686.method1980(-345277664, var53);
                            this.field5686.method1980(-345277664, var54);
                        }
                    }
                }
            }
        } else {
            for (int var19 = arg1 - 1; var19 >= 0; var19--) {
                int var20 = this.field5703[var19] > 64 ? 64 : this.field5703[var19];
                if (var20 > 0) {
                    for (int var21 = var20 - 1; var21 >= 0; var21--) {
                        class115 var34 = this.field5705[var19][var21];
                        int var35 = var34.field1979;
                        byte var36 = (byte) (var35 >> 16);
                        byte var37 = (byte) (var35 >> 8);
                        byte var38 = (byte) var35;
                        byte var39 = (byte) (var35 >>> 24);
                        float var40 = (float) (var34.field1973 >> 12);
                        float var41 = (float) (var34.field1976 >> 12);
                        float var42 = (float) (var34.field1972 >> 12);
                        int var43 = var34.field1983 >> 12;
                        this.field5686.method692(-28, 0.0F);
                        this.field5686.method692(-125, 0.0F);
                        this.field5686.method692(-69, (float) (-var43) * var10 + var40);
                        this.field5686.method692(-56, (float) (-var43) * var11 + var41);
                        this.field5686.method692(109, (float) (-var43) * var12 + var42);
                        this.field5686.method1980(-345277664, var36);
                        this.field5686.method1980(-345277664, var37);
                        this.field5686.method1980(-345277664, var38);
                        this.field5686.method1980(-345277664, var39);
                        this.field5686.method692(-124, 1.0F);
                        this.field5686.method692(-60, 0.0F);
                        this.field5686.method692(-93, (float) var43 * var13 + var40);
                        this.field5686.method692(110, (float) var43 * var14 + var41);
                        this.field5686.method692(-55, (float) var43 * var15 + var42);
                        this.field5686.method1980(-345277664, var36);
                        this.field5686.method1980(-345277664, var37);
                        this.field5686.method1980(-345277664, var38);
                        this.field5686.method1980(-345277664, var39);
                        this.field5686.method692(114, 1.0F);
                        this.field5686.method692(-126, 1.0F);
                        this.field5686.method692(124, (float) var43 * var10 + var40);
                        this.field5686.method692(112, (float) var43 * var11 + var41);
                        this.field5686.method692(-80, (float) var43 * var12 + var42);
                        this.field5686.method1980(-345277664, var36);
                        this.field5686.method1980(-345277664, var37);
                        this.field5686.method1980(-345277664, var38);
                        this.field5686.method1980(-345277664, var39);
                        this.field5686.method692(-25, 0.0F);
                        this.field5686.method692(-91, 1.0F);
                        this.field5686.method692(-73, (float) var43 * var16 + var40);
                        this.field5686.method692(119, (float) var43 * var17 + var41);
                        this.field5686.method692(-81, (float) var43 * var18 + var42);
                        this.field5686.method1980(-345277664, var36);
                        this.field5686.method1980(-345277664, var37);
                        this.field5686.method1980(-345277664, var38);
                        this.field5686.method1980(-345277664, var39);
                    }
                    if (this.field5703[var19] > 64) {
                        int var22 = this.field5703[var19] - 65;
                        for (int var23 = this.field5702[var22] - 1; var23 >= 0; var23--) {
                            class115 var24 = this.field5704[var22][var23];
                            int var25 = var24.field1979;
                            byte var26 = (byte) (var25 >> 16);
                            byte var27 = (byte) (var25 >> 8);
                            byte var28 = (byte) var25;
                            byte var29 = (byte) (var25 >>> 24);
                            float var30 = (float) (var24.field1973 >> 12);
                            float var31 = (float) (var24.field1976 >> 12);
                            float var32 = (float) (var24.field1972 >> 12);
                            int var33 = var24.field1983 >> 12;
                            this.field5686.method692(-59, 0.0F);
                            this.field5686.method692(116, 0.0F);
                            this.field5686.method692(119, (float) (-var33) * var10 + var30);
                            this.field5686.method692(-35, (float) (-var33) * var11 + var31);
                            this.field5686.method692(-93, (float) (-var33) * var12 + var32);
                            this.field5686.method1980(-345277664, var26);
                            this.field5686.method1980(-345277664, var27);
                            this.field5686.method1980(-345277664, var28);
                            this.field5686.method1980(-345277664, var29);
                            this.field5686.method692(124, 1.0F);
                            this.field5686.method692(107, 0.0F);
                            this.field5686.method692(-72, (float) var33 * var13 + var30);
                            this.field5686.method692(114, (float) var33 * var14 + var31);
                            this.field5686.method692(112, (float) var33 * var15 + var32);
                            this.field5686.method1980(-345277664, var26);
                            this.field5686.method1980(-345277664, var27);
                            this.field5686.method1980(-345277664, var28);
                            this.field5686.method1980(-345277664, var29);
                            this.field5686.method692(-70, 1.0F);
                            this.field5686.method692(-73, 1.0F);
                            this.field5686.method692(-122, (float) var33 * var10 + var30);
                            this.field5686.method692(107, (float) var33 * var11 + var31);
                            this.field5686.method692(-83, (float) var33 * var12 + var32);
                            this.field5686.method1980(-345277664, var26);
                            this.field5686.method1980(-345277664, var27);
                            this.field5686.method1980(-345277664, var28);
                            this.field5686.method1980(-345277664, var29);
                            this.field5686.method692(121, 0.0F);
                            this.field5686.method692(-72, 1.0F);
                            this.field5686.method692(115, (float) var33 * var16 + var30);
                            this.field5686.method692(-32, (float) var33 * var17 + var31);
                            this.field5686.method692(108, (float) var33 * var18 + var32);
                            this.field5686.method1980(-345277664, var26);
                            this.field5686.method1980(-345277664, var27);
                            this.field5686.method1980(-345277664, var28);
                            this.field5686.method1980(-345277664, var29);
                        }
                    }
                }
            }
        }
        if (this.field5686.field4619 != 0) {
            this.field5696.method1322(this.field5686.field4600, 24, this.field5686.field4619, 9043);
            arg0.method3661(this.field5699, this.field5700, null, this.field5698, -126);
            arg0.method3615(7, 0, false, this.field5686.field4619 / 24);
        }
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(BLno;Lc;)V", line = 395)
    public final void method2382(byte arg0, class658 arg1, class174 arg2) {
        field5690++;
        if (arg0 != 116 || arg1.field9276 == null) {
            return;
        }
        this.method2383(-2795, arg1);
        float var4 = arg1.field9276.field9856;
        float var5 = arg1.field9276.field9858;
        float var6 = arg1.field9276.field9883;
        float var7 = arg1.field9276.field9868;
        try {
            if (arg2.field2683) {
                int var8 = arg2.field2684 - arg2.field2682;
                int var9;
                if (var8 + 2 > 1600) {
                    var9 = class364.method2153((byte) -71, var8) + 1 - this.field5695;
                    var8 = (var8 >> var9) + 2;
                } else {
                    var9 = 0;
                    var8 += 2;
                }
                class444 var10 = arg2.field2679.field4804;
                class444 var11 = var10.field6079;
                int var12 = -2;
                boolean var13 = true;
                boolean var14 = true;
                while (var10 != var11) {
                    this.field5701 = 0;
                    for (int var15 = 0; var15 < var8; var15++) {
                        this.field5703[var15] = 0;
                    }
                    for (int var16 = 0; var16 < 64; var16++) {
                        this.field5702[var16] = 0;
                    }
                    while (var10 != var11) {
                        class115 var17 = (class115) var11;
                        if (var14) {
                            var13 = var17.field1978;
                            var12 = var17.field1982;
                            var14 = false;
                        } else if (var17.field1982 != var12 || var13 != var17.field1978) {
                            var14 = true;
                            break;
                        }
                        int var18 = (int) ((float) (var17.field1972 >> 12) * var6 + (float) (var17.field1976 >> 12) * var5 + (float) (var17.field1973 >> 12) * var4 + var7) - arg2.field2682 >> var9;
                        if (var18 < 1600) {
                            if (this.field5703[var18] >= 64) {
                                label195: {
                                    if (this.field5703[var18] == 64) {
                                        if (this.field5701 == 64) {
                                            break label195;
                                        }
                                        this.field5703[var18] += this.field5701++ + 1;
                                    }
                                    this.field5704[this.field5703[var18] - 1 - 64][this.field5702[this.field5703[var18] - 64 - 1]++] = var17;
                                }
                            } else {
                                this.field5705[var18][this.field5703[var18]++] = var17;
                            }
                        }
                        var11 = var11.field6079;
                    }
                    if (var12 < 0) {
                        arg1.method3679(-82, -1);
                    } else {
                        arg1.method3679(arg0 - 208, var12);
                    }
                    if (var13 && class108.field1588 != arg1.field9293) {
                        arg1.method442(class108.field1588);
                    } else if (arg1.field9293 != 1.0F) {
                        arg1.method442(1.0F);
                    }
                    this.method2381(arg1, var8, 86);
                }
            } else {
                int var19 = 0;
                int var20 = Integer.MAX_VALUE;
                int var21 = 0;
                class444 var22 = arg2.field2679.field4804;
                for (class444 var23 = var22.field6079; var23 != var22; var23 = var23.field6079) {
                    class115 var24 = (class115) var23;
                    int var25 = (int) ((float) (var24.field1972 >> 12) * var6 + (float) (var24.field1976 >> 12) * var5 + (float) (var24.field1973 >> 12) * var4 + var7);
                    this.field5706[var19++] = var25;
                    if (var25 < var20) {
                        var20 = var25;
                    }
                    if (var21 < var25) {
                        var21 = var25;
                    }
                }
                int var26 = var21 - var20;
                int var27;
                if (var26 + 2 > 1600) {
                    var27 = class364.method2153((byte) -94, var26) + 1 - this.field5695;
                    var26 = (var26 >> var27) + 2;
                } else {
                    var27 = 0;
                    var26 += 2;
                }
                class444 var28 = var22.field6079;
                int var29 = 0;
                int var30 = -2;
                boolean var31 = true;
                boolean var32 = true;
                while (var22 != var28) {
                    this.field5701 = 0;
                    for (int var33 = 0; var33 < var26; var33++) {
                        this.field5703[var33] = 0;
                    }
                    for (int var34 = 0; var34 < 64; var34++) {
                        this.field5702[var34] = 0;
                    }
                    while (var22 != var28) {
                        class115 var35 = (class115) var28;
                        if (var32) {
                            var31 = var35.field1978;
                            var32 = false;
                            var30 = var35.field1982;
                        }
                        if (var29 > 0 && (var35.field1982 != var30 || var31 != var35.field1978)) {
                            var32 = true;
                            break;
                        }
                        int var36 = this.field5706[var29++] - var20 >> var27;
                        if (var36 < 1600) {
                            if (this.field5703[var36] >= 64) {
                                label145: {
                                    if (this.field5703[var36] == 64) {
                                        if (this.field5701 == 64) {
                                            break label145;
                                        }
                                        this.field5703[var36] += this.field5701++ + 1;
                                    }
                                    this.field5704[this.field5703[var36] - 64 - 1][this.field5702[this.field5703[var36] - 64 - 1]++] = var35;
                                }
                            } else {
                                this.field5705[var36][this.field5703[var36]++] = var35;
                            }
                        }
                        var28 = var28.field6079;
                    }
                    if (var30 >= 0) {
                        arg1.method3679(-88, var30);
                    } else {
                        arg1.method3679(-29, -1);
                    }
                    if (var31 && class108.field1588 != arg1.field9293) {
                        arg1.method442(class108.field1588);
                    } else if (arg1.field9293 != 1.0F) {
                        arg1.method442(1.0F);
                    }
                    this.method2381(arg1, var26, 70);
                }
            }
        } catch (Exception var37) {
        }
        this.method2379(arg1, (byte) -108);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(ILno;)V", line = 684)
    private final void method2383(int arg0, class658 arg1) {
        class108.field1588 = arg1.field9293;
        field5685++;
        arg1.method3660((byte) 42);
        if (arg0 != -2795) {
            this.field5686 = null;
        }
        OpenGL.glDisable(16384);
        OpenGL.glDisable(16385);
        arg1.method3680(-98, false);
        OpenGL.glNormal3f(0.0F, -1.0F, 0.0F);
    }

    @OriginalMember(owner = "client!pr", name = "a", descriptor = "(B)V", line = 702)
    public static void method2384(byte arg0) {
        field5692 = null;
        if (arg0 == 31) {
            field5684 = null;
        }
    }
}
