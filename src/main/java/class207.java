import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class207 extends class378 {

    @OriginalMember(owner = "client!dl", name = "n", descriptor = "Leb;")
    private class395 field2898 = new class395();

    @OriginalMember(owner = "client!dl", name = "l", descriptor = "Lks;")
    public class173 field2896;

    @OriginalMember(owner = "client!dl", name = "o", descriptor = "[[I")
    private int[][] field2899;

    @OriginalMember(owner = "client!dl", name = "C", descriptor = "[[I")
    private int[][] field2913;

    @OriginalMember(owner = "client!dl", name = "p", descriptor = "I")
    public int field2900;

    @OriginalMember(owner = "client!dl", name = "g", descriptor = "I")
    public int field2891;

    @OriginalMember(owner = "client!dl", name = "s", descriptor = "I")
    public int field2903;

    @OriginalMember(owner = "client!dl", name = "m", descriptor = "[[[I")
    private int[][][] field2897;

    @OriginalMember(owner = "client!dl", name = "t", descriptor = "[[[Ldh;")
    private class198[][][] field2904;

    @OriginalMember(owner = "client!dl", name = "w", descriptor = "[[[I")
    public int[][][] field2907;

    @OriginalMember(owner = "client!dl", name = "v", descriptor = "[[[I")
    public int[][][] field2906;

    @OriginalMember(owner = "client!dl", name = "i", descriptor = "[[[I")
    private int[][][] field2893;

    @OriginalMember(owner = "client!dl", name = "j", descriptor = "[[[I")
    private int[][][] field2894;

    @OriginalMember(owner = "client!dl", name = "h", descriptor = "[[S")
    public short[][] field2892;

    @OriginalMember(owner = "client!dl", name = "q", descriptor = "[[B")
    private byte[][] field2901;

    @OriginalMember(owner = "client!dl", name = "F", descriptor = "[[B")
    private byte[][] field2916;

    @OriginalMember(owner = "client!dl", name = "I", descriptor = "[[F")
    private float[][] field2919;

    @OriginalMember(owner = "client!dl", name = "E", descriptor = "[[F")
    private float[][] field2915;

    @OriginalMember(owner = "client!dl", name = "B", descriptor = "[[F")
    private float[][] field2912;

    @OriginalMember(owner = "client!dl", name = "J", descriptor = "Ldq;")
    private class90 field2920;

    @OriginalMember(owner = "client!dl", name = "x", descriptor = "Lmb;")
    private class268 field2908;

    @OriginalMember(owner = "client!dl", name = "u", descriptor = "Lat;")
    public static class256 field2905 = new class256(1);

    @OriginalMember(owner = "client!dl", name = "M", descriptor = "[F")
    private static float[] field2923 = new float[16];

    @OriginalMember(owner = "client!dl", name = "L", descriptor = "[I")
    private static int[] field2922 = new int[1];

    @OriginalMember(owner = "client!dl", name = "N", descriptor = "[I")
    private static int[] field2924 = new int[1];

    @OriginalMember(owner = "client!dl", name = "R", descriptor = "[I")
    private static int[] field2927 = new int[1];

    @OriginalMember(owner = "client!dl", name = "k", descriptor = "I")
    private int field2895;

    @OriginalMember(owner = "client!dl", name = "r", descriptor = "I")
    private int field2902;

    @OriginalMember(owner = "client!dl", name = "G", descriptor = "I")
    private int field2917;

    @OriginalMember(owner = "client!dl", name = "H", descriptor = "I")
    private int field2918;

    @OriginalMember(owner = "client!dl", name = "P", descriptor = "I")
    private static int field2926;

    @OriginalMember(owner = "client!dl", name = "K", descriptor = "Lkd;")
    private class340 field2921;

    @OriginalMember(owner = "client!dl", name = "y", descriptor = "Lpa;")
    public class352 field2909;

    @OriginalMember(owner = "client!dl", name = "A", descriptor = "Lpa;")
    public class352 field2911;

    @OriginalMember(owner = "client!dl", name = "D", descriptor = "Lpa;")
    private class352 field2914;

    @OriginalMember(owner = "client!dl", name = "O", descriptor = "Lpa;")
    public class352 field2925;

    @OriginalMember(owner = "client!dl", name = "z", descriptor = "[Ldh;")
    private class198[] field2910;

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III[[ZZ)V", line = 11)
    public final void method1419(int arg0, int arg1, int arg2, boolean[][] arg3, boolean arg4) {
        if (this.field2910 == null) {
            return;
        }
        float var6 = this.field2896.field2377;
        float var7 = this.field2896.field2306;
        int var8 = arg2 + arg2 + 1;
        int var9 = var8 * var8;
        if (field2922.length < var9) {
            field2922 = new int[var9];
        }
        if (field2905.field3764.length < this.field2895 * 2) {
            field2905 = new class256(this.field2895 * 2);
        }
        int var10 = arg0 - arg2;
        int var11 = var10;
        if (var10 < 0) {
            var10 = 0;
        }
        int var12 = arg1 - arg2;
        int var13 = var12;
        if (var12 < 0) {
            var12 = 0;
        }
        int var14 = arg0 + arg2;
        if (var14 > this.field5538 - 1) {
            var14 = this.field5538 - 1;
        }
        int var15 = arg1 + arg2;
        if (var15 > this.field5540 - 1) {
            var15 = this.field5540 - 1;
        }
        field2926 = 0;
        for (int var16 = var10; var16 <= var14; var16++) {
            boolean[] var17 = arg3[var16 - var11];
            for (int var18 = var12; var18 <= var15; var18++) {
                if (var17[var18 - var13]) {
                    field2922[field2926++] = this.field5538 * var18 + var16;
                }
            }
        }
        this.field2896.method1135();
        this.field2896.method1132((this.field2900 & 0x7) != 0);
        for (int var19 = 0; var19 < this.field2910.length; var19++) {
            this.field2910[var19].method1376((byte) -107, field2926, field2922);
        }
        if (!this.field2898.method2473((byte) -119)) {
            int var20 = this.field2896.field2323;
            int var21 = this.field2896.field2293;
            this.field2896.method140(0, var21);
            this.field2896.method81(var7, var6 - 4.0F);
            this.field2896.method1132(false);
            this.field2896.method1189(false);
            this.field2896.method1179(130);
            this.field2896.method1133(-2);
            this.field2896.method1160(this.field2896.field2357);
            this.field2896.method1161(8448, 7681);
            this.field2896.method1127(0, 34166, 770);
            this.field2896.method1176(0, 34167, 770);
            for (class264 var22 = this.field2898.method2478(1603); var22 != null; var22 = this.field2898.method2486((byte) -82)) {
                class449 var23 = (class449) var22;
                var23.method2760(126, arg3, arg0, arg1, arg2);
            }
            this.field2896.method1127(0, 5890, 768);
            this.field2896.method1176(0, 5890, 770);
            this.field2896.method1160((class205) null);
            this.field2896.method140(var20, var21);
        }
        if (this.field2908 != null) {
            this.field2896.method81(var7, var6 - 8.0F);
            this.field2896.method1135();
            this.field2896.method1192(this.field2911, (class352) null, (class352) null, this.field2909);
            this.field2908.method1847(arg1, arg4, arg0, 14712, arg2, arg3);
        }
        this.field2896.method81(var7, var6);
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(II)V", line = 135)
    public final void method1420(int arg0, int arg1) {
    }

    @OriginalMember(owner = "client!dl", name = "<init>", descriptor = "(Lks;IIII[[I[[II)V", line = 138)
    public class207(class173 arg0, int arg1, int arg2, int arg3, int arg4, int[][] arg5, int[][] arg6, int arg7) {
        super(arg3, arg4);
        this.field2896 = arg0;
        this.field2899 = arg5;
        this.field2913 = arg6;
        this.field2900 = arg2;
        while (arg7 > 1) {
            this.field2891++;
            arg7 >>= 0x1;
        }
        this.field2903 = 0x1 << this.field2891;
        this.field2897 = new int[arg3][arg4][];
        this.field2904 = new class198[arg3][arg4][];
        this.field2907 = new int[arg3][arg4][];
        this.field2906 = new int[arg3][arg4][];
        this.field2893 = new int[arg3][arg4][];
        this.field2894 = new int[arg3][arg4][];
        this.field2892 = new short[arg3 * arg4][];
        this.field2901 = new byte[arg3][arg4];
        this.field2916 = new byte[arg3 + 1][arg4 + 1];
        this.field2919 = new float[arg3 + 1][arg4 + 1];
        this.field2915 = new float[arg3 + 1][arg4 + 1];
        this.field2912 = new float[arg3 + 1][arg4 + 1];
        for (int var9 = 1; var9 < arg4; var9++) {
            for (int var10 = 1; var10 < arg3; var10++) {
                int var11 = this.field2899[var10 + 1][var9] - this.field2899[var10 - 1][var9];
                int var12 = this.field2899[var10][var9 + 1] - this.field2899[var10][var9 - 1];
                float var13 = (float) (1.0D / Math.sqrt((double) (var12 * var12 + var11 * var11 + 65536)));
                this.field2919[var10][var9] = (float) var11 * var13;
                this.field2915[var10][var9] = var13 * -256.0F;
                this.field2912[var10][var9] = (float) var12 * var13;
            }
        }
        this.field2920 = new class90(128);
        if ((this.field2900 & 0x10) != 0) {
            this.field2908 = new class268(this.field2896, this);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "()V", line = 200)
    public final void method1421() {
        if (this.field2917 > 0) {
            byte[][] var1 = new byte[this.field5538 + 1][this.field5540 + 1];
            for (int var2 = 1; var2 < this.field5538; var2++) {
                for (int var3 = 1; var3 < this.field5540; var3++) {
                    var1[var2][var3] = (byte) ((this.field2916[var2][var3] >> 1) + (this.field2916[var2][var3 + 1] >> 3) + (this.field2916[var2][var3 - 1] >> 2) + (this.field2916[var2 - 1][var3] >> 2) + (this.field2916[var2 + 1][var3] >> 3));
                }
            }
            this.field2910 = new class198[this.field2920.method612(2)];
            this.field2920.method603(this.field2910, -1);
            for (int var4 = 0; var4 < this.field2910.length; var4++) {
                this.field2910[var4].method1373(this.field2917, 4);
            }
            int var5 = 24;
            if (this.field2913 != null) {
                var5 += 4;
            }
            if ((this.field2900 & 0x7) != 0) {
                var5 += 12;
            }
            ByteBuffer var6 = ByteBuffer.allocateDirect(this.field2917 * var5).order(ByteOrder.nativeOrder());
            class198[] var7 = new class198[this.field2917];
            class90 var8 = new class90(class164.method1087(this.field2917, 113));
            class198[] var9 = new class198[this.field2918];
            for (int var10 = 0; var10 < this.field5538; var10++) {
                for (int var11 = 0; var11 < this.field5540; var11++) {
                    if (this.field2893[var10][var11] != null) {
                        class198[] var12 = this.field2904[var10][var11];
                        int[] var13 = this.field2897[var10][var11];
                        int[] var14 = this.field2907[var10][var11];
                        int[] var15 = this.field2906[var10][var11];
                        int[] var16 = this.field2894[var10][var11];
                        int[] var17 = this.field2893[var10][var11];
                        if (var16 == null) {
                            var16 = var17;
                        }
                        float var18 = this.field2919[var10][var11];
                        float var19 = this.field2915[var10][var11];
                        float var20 = this.field2912[var10][var11];
                        float var21 = this.field2919[var10][var11 + 1];
                        float var22 = this.field2915[var10][var11 + 1];
                        float var23 = this.field2912[var10][var11 + 1];
                        float var24 = this.field2919[var10 + 1][var11 + 1];
                        float var25 = this.field2915[var10 + 1][var11 + 1];
                        float var26 = this.field2912[var10 + 1][var11 + 1];
                        float var27 = this.field2919[var10 + 1][var11];
                        float var28 = this.field2915[var10 + 1][var11];
                        float var29 = this.field2912[var10 + 1][var11];
                        int var30 = var1[var10][var11] & 0xFF;
                        int var31 = var1[var10][var11 + 1] & 0xFF;
                        int var32 = var1[var10 + 1][var11 + 1] & 0xFF;
                        int var33 = var1[var10 + 1][var11] & 0xFF;
                        float var34;
                        float var35;
                        float var36;
                        float var37;
                        if (this.field2913 == null) {
                            var37 = 0.0F;
                            var36 = 0.0F;
                            var35 = 0.0F;
                            var34 = 0.0F;
                        } else {
                            var34 = (float) this.field2913[var10][var11];
                            var35 = (float) this.field2913[var10][var11 + 1];
                            var36 = (float) this.field2913[var10 + 1][var11 + 1];
                            var37 = (float) this.field2913[var10 + 1][var11];
                        }
                        int var38 = 0;
                        label304: for (int var39 = 0; var39 < var17.length; var39++) {
                            class198 var40 = var12[var39];
                            for (int var41 = 0; var41 < var38; var41++) {
                                if (var9[var41] == var40) {
                                    continue label304;
                                }
                            }
                            var9[var38++] = var40;
                        }
                        short[] var42 = this.field2892[this.field5538 * var11 + var10] = new short[var17.length];
                        for (int var43 = 0; var43 < var17.length; var43++) {
                            int var44 = (var10 << this.field2891) + var14[var43];
                            int var45 = (var11 << this.field2891) + var15[var43];
                            int var46 = var17[var43];
                            int var47 = var16[var43];
                            int var48 = var13 == null ? 0 : var13[var43];
                            long var49 = (long) var47 << 48 | (long) var46 << 32 | (long) (var44 << 16) | (long) var45;
                            int var51 = var14[var43];
                            int var52 = var15[var43];
                            byte var53 = 74;
                            int var54 = 0;
                            float var55 = 1.0F;
                            float var56;
                            float var57;
                            float var58;
                            float var59;
                            int var60;
                            if (var51 == 0 && var52 == 0) {
                                var56 = var18;
                                var57 = var19;
                                var58 = var20;
                                var59 = var34;
                                var60 = var53 - var30;
                            } else if (var51 == 0 && this.field2903 == var52) {
                                var56 = var21;
                                var57 = var22;
                                var58 = var23;
                                var59 = var35;
                                var60 = var53 - var31;
                            } else if (this.field2903 == var51 && this.field2903 == var52) {
                                var56 = var24;
                                var57 = var25;
                                var58 = var26;
                                var59 = var36;
                                var60 = var53 - var32;
                            } else if (this.field2903 == var51 && var52 == 0) {
                                var56 = var27;
                                var57 = var28;
                                var58 = var29;
                                var59 = var37;
                                var60 = var53 - var33;
                            } else {
                                float var61 = (float) var51 / (float) this.field2903;
                                float var62 = (float) var52 / (float) this.field2903;
                                float var63 = (var27 - var18) * var61 + var18;
                                float var64 = (var28 - var19) * var61 + var19;
                                float var65 = (var29 - var20) * var61 + var20;
                                float var66 = (var24 - var21) * var61 + var21;
                                float var67 = (var25 - var22) * var61 + var22;
                                float var68 = (var26 - var23) * var61 + var23;
                                var56 = (var66 - var63) * var62 + var63;
                                var57 = (var67 - var64) * var62 + var64;
                                var58 = (var68 - var65) * var62 + var65;
                                int var69 = ((var33 - var30) * var51 >> this.field2891) + var30;
                                int var70 = ((var32 - var31) * var51 >> this.field2891) + var31;
                                var60 = var53 - (((var70 - var69) * var52 >> this.field2891) + var69);
                                float var71 = (var37 - var34) * var61 + var34;
                                float var72 = (var36 - var35) * var61 + var35;
                                var59 = (var72 - var71) * var62 + var71;
                            }
                            if (var46 != -1) {
                                int var73 = (var46 & 0x7F) * var60 >> 7;
                                if (var73 < 2) {
                                    var73 = 2;
                                } else if (var73 > 126) {
                                    var73 = 126;
                                }
                                var54 = class79.field992[var46 & 0xFF80 | var73];
                                if ((this.field2900 & 0x7) == 0) {
                                    float var74 = this.field2896.field2336[2] * var58 + this.field2896.field2336[0] * var56 + this.field2896.field2336[1] * var57;
                                    var55 = this.field2896.field2324 + var74 * (var74 > 0.0F ? this.field2896.field2331 : this.field2896.field2368);
                                }
                            }
                            class264 var75 = var8.method609(var49, 54);
                            int var86;
                            if (var75 == null) {
                                int var77;
                                if (var46 == var47) {
                                    var77 = var54;
                                } else {
                                    int var76 = (var47 & 0x7F) * var60 >> 7;
                                    if (var76 < 2) {
                                        var76 = 2;
                                    } else if (var76 > 126) {
                                        var76 = 126;
                                    }
                                    var77 = class79.field992[var47 & 0xFF80 | var76];
                                    if ((this.field2900 & 0x7) == 0) {
                                        float var78 = this.field2896.field2336[2] * var58 + this.field2896.field2336[0] * var56 + this.field2896.field2336[1] * var57;
                                        float var79 = this.field2896.field2324 + var55 * (var55 > 0.0F ? this.field2896.field2331 : this.field2896.field2368);
                                        int var80 = var77 >> 16 & 0xFF;
                                        int var81 = var77 >> 8 & 0xFF;
                                        int var82 = var77 & 0xFF;
                                        int var83 = (int) ((float) var80 * var79);
                                        if (var83 < 0) {
                                            var83 = 0;
                                        } else if (var83 > 255) {
                                            var83 = 255;
                                        }
                                        int var84 = (int) ((float) var81 * var79);
                                        if (var84 < 0) {
                                            var84 = 0;
                                        } else if (var84 > 255) {
                                            var84 = 255;
                                        }
                                        int var85 = (int) ((float) var82 * var79);
                                        if (var85 < 0) {
                                            var85 = 0;
                                        } else if (var85 > 255) {
                                            var85 = 255;
                                        }
                                        var77 = var83 << 16 | var84 << 8 | var85;
                                    }
                                }
                                var6.putFloat((float) var44);
                                var6.putFloat((float) (this.method1427(var44, var45) + var48));
                                var6.putFloat((float) var45);
                                var6.put((byte) (var77 >> 16));
                                var6.put((byte) (var77 >> 8));
                                var6.put((byte) var77);
                                var6.put((byte) -1);
                                var6.putFloat((float) var44);
                                var6.putFloat((float) var45);
                                if (this.field2913 != null) {
                                    var6.putFloat((float) var48 + var59);
                                }
                                if ((this.field2900 & 0x7) != 0) {
                                    var6.putFloat(var56);
                                    var6.putFloat(var57);
                                    var6.putFloat(var58);
                                }
                                var86 = this.field2902++;
                                var42[var43] = (short) var86;
                                if (var46 != -1) {
                                    var7[var86] = var12[var43];
                                }
                                var8.method606(1, new class191(var42[var43]), var49);
                            } else {
                                var42[var43] = ((class191) var75).field2669;
                                var86 = var42[var43] & 0xFFFF;
                                if (var46 != -1 && var12[var43].field3907 < var7[var86].field3907) {
                                    var7[var86] = var12[var43];
                                }
                            }
                            for (int var87 = 0; var87 < var38; var87++) {
                                var9[var87].method1372(var54, (byte) -22, var55, var60, var86);
                            }
                            this.field2895++;
                        }
                    }
                }
            }
            for (int var88 = 0; var88 < this.field2902; var88++) {
                class198 var89 = var7[var88];
                if (var89 != null) {
                    var89.method1377((byte) 42, var88);
                }
            }
            for (int var90 = 0; var90 < this.field5538; var90++) {
                for (int var91 = 0; var91 < this.field5540; var91++) {
                    short[] var92 = this.field2892[this.field5538 * var91 + var90];
                    if (var92 != null) {
                        int var93 = 0;
                        int var94 = 0;
                        while (var94 < var92.length) {
                            int var95 = var92[var94++] & 0xFFFF;
                            int var96 = var92[var94++] & 0xFFFF;
                            int var97 = var92[var94++] & 0xFFFF;
                            class198 var98 = var7[var95];
                            class198 var99 = var7[var96];
                            class198 var100 = var7[var97];
                            class198 var101 = null;
                            if (var98 != null) {
                                var98.method1375(var93, 1, var90, var91);
                                var101 = var98;
                            }
                            if (var99 != null) {
                                var99.method1375(var93, 1, var90, var91);
                                if (var101 == null || var99.field3907 < var101.field3907) {
                                    var101 = var99;
                                }
                            }
                            if (var100 != null) {
                                var100.method1375(var93, 1, var90, var91);
                                if (var101 == null || var100.field3907 < var101.field3907) {
                                    var101 = var100;
                                }
                            }
                            if (var101 != null) {
                                if (var98 != null) {
                                    var101.method1377((byte) 42, var95);
                                }
                                if (var99 != null) {
                                    var101.method1377((byte) 42, var96);
                                }
                                if (var100 != null) {
                                    var101.method1377((byte) 42, var97);
                                }
                                var101.method1375(var93, 1, var90, var91);
                            }
                            var93++;
                        }
                    }
                }
            }
            var6.flip();
            this.field2921 = this.field2896.method1168(var5, var6, false);
            this.field2911 = new class352(this.field2896, this.field2921, 5126, 3, 0);
            this.field2914 = new class352(this.field2896, this.field2921, 5121, 4, 12);
            byte var102;
            if (this.field2913 == null) {
                this.field2909 = new class352(this.field2896, this.field2921, 5126, 2, 16);
                var102 = 24;
            } else {
                this.field2909 = new class352(this.field2896, this.field2921, 5126, 3, 16);
                var102 = 28;
            }
            if ((this.field2900 & 0x7) != 0) {
                this.field2925 = new class352(this.field2896, this.field2921, 5126, 3, var102);
                int var106 = var102 + 12;
            }
            long[] var103 = new long[this.field2910.length];
            for (int var104 = 0; var104 < this.field2910.length; var104++) {
                class198 var105 = this.field2910[var104];
                var103[var104] = var105.field3907;
                var105.method1374((byte) 19, this.field2902);
            }
            class353.method2259(this.field2910, var103, 103);
            if (this.field2908 != null) {
                this.field2908.method1842(-35);
            }
        } else {
            this.field2908 = null;
        }
        this.field2907 = this.field2906 = (int[][][]) null;
        this.field2894 = (int[][][]) null;
        this.field2897 = (int[][][]) null;
        this.field2904 = (class198[][][]) null;
        this.field2893 = (int[][][]) null;
        this.field2916 = (byte[][]) null;
        this.field2920 = null;
        this.field2913 = (int[][]) null;
        this.field2919 = this.field2915 = this.field2912 = (float[][]) null;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IIIIIII[[Z)V", line = 737)
    public final void method1422(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, boolean[][] arg7) {
        if (this.field2917 <= 0) {
            return;
        }
        opengl var9 = this.field2896.field2253;
        this.field2896.method1170();
        this.field2896.method1142(false);
        this.field2896.method1132(false);
        this.field2896.method1162(false);
        this.field2896.method1189(false);
        this.field2896.method1179(0);
        this.field2896.method1133(-2);
        this.field2896.method1160((class205) null);
        field2923[0] = (float) arg2 / ((float) this.field2903 * 128.0F * (float) this.field2896.field2270);
        field2923[1] = 0.0F;
        field2923[2] = 0.0F;
        field2923[3] = 0.0F;
        field2923[4] = 0.0F;
        field2923[5] = (float) arg2 / ((float) this.field2903 * 128.0F * (float) this.field2896.field2272);
        field2923[6] = 0.0F;
        field2923[7] = 0.0F;
        field2923[8] = 0.0F;
        field2923[9] = 0.0F;
        field2923[10] = 0.0F;
        field2923[11] = 0.0F;
        field2923[12] = -1.0F - ((float) (arg2 * arg3) / 128.0F - (float) (arg0 * 2)) / (float) this.field2896.field2270;
        field2923[13] = 1.0F - ((float) (arg2 * arg6) / 128.0F + (float) (arg1 * 2)) / (float) this.field2896.field2272;
        field2923[14] = 0.0F;
        field2923[15] = 1.0F;
        var9.glMatrixMode(5889);
        var9.glLoadMatrixf(field2923, 0);
        field2923[0] = 1.0F;
        field2923[1] = 0.0F;
        field2923[2] = 0.0F;
        field2923[3] = 0.0F;
        field2923[4] = 0.0F;
        field2923[5] = 0.0F;
        field2923[6] = 1.0F;
        field2923[7] = 0.0F;
        field2923[8] = 0.0F;
        field2923[9] = 1.0F;
        field2923[10] = 0.0F;
        field2923[11] = 0.0F;
        field2923[12] = 0.0F;
        field2923[13] = 0.0F;
        field2923[14] = 0.0F;
        field2923[15] = 1.0F;
        var9.glMatrixMode(5888);
        var9.glLoadMatrixf(field2923, 0);
        if ((this.field2900 & 0x7) == 0) {
            this.field2896.method1132(false);
        } else {
            this.field2896.method1132(true);
            this.field2896.method1171();
        }
        this.field2896.method1192(this.field2911, this.field2925, this.field2914, this.field2909);
        if (field2905.field3764.length < this.field2895 * 2) {
            field2905 = new class256(this.field2895 * 2);
        } else {
            field2905.field3762 = 0;
        }
        int var10 = 0;
        if (this.field2896.field2296) {
            for (int var11 = arg4; var11 < arg6; var11++) {
                int var12 = this.field5538 * var11 + arg3;
                for (int var13 = arg3; var13 < arg5; var13++) {
                    if (arg7[var13 - arg3][var11 - arg4]) {
                        short[] var14 = this.field2892[var12];
                        if (var14 != null) {
                            for (int var15 = 0; var15 < var14.length; var15++) {
                                field2905.method1750((byte) 0, var14[var15] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var12++;
                }
            }
        } else {
            for (int var16 = arg4; var16 < arg6; var16++) {
                int var17 = this.field5538 * var16 + arg3;
                for (int var18 = arg3; var18 < arg5; var18++) {
                    if (arg7[var18 - arg3][var16 - arg4]) {
                        short[] var19 = this.field2892[var17];
                        if (var19 != null) {
                            for (int var20 = 0; var20 < var19.length; var20++) {
                                field2905.method1731(-100, var19[var20] & 0xFFFF);
                                var10++;
                            }
                        }
                    }
                    var17++;
                }
            }
        }
        if (var10 > 0) {
            class261 var21 = new class261(this.field2896, 5123, field2905.field3764, field2905.field3762);
            this.field2896.method1136(var21, 4, 0, var10);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I[I[I[I[I[I[IIIZ)V", line = 900)
    public final void method1423(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int arg9, int arg10, boolean arg11) {
        this.field2897[arg0][arg1] = arg3;
        this.field2907[arg0][arg1] = arg2;
        this.field2906[arg0][arg1] = arg4;
        this.field2893[arg0][arg1] = arg5;
        this.field2894[arg0][arg1] = arg6;
        class198[] var13 = this.field2904[arg0][arg1] = new class198[arg5.length];
        for (int var14 = 0; var14 < arg5.length; var14++) {
            long var15 = (long) arg10 << 48 | (long) arg9 << 32 | (long) (arg7[var14] << 16) | (long) arg8[var14];
            class264 var17 = this.field2920.method609(var15, 74);
            if (var17 == null) {
                var13[var14] = new class198(this, arg7[var14], arg8[var14], arg9, arg10);
                this.field2920.method606(1, var13[var14], var15);
            } else {
                var13[var14] = (class198) var17;
            }
        }
        if (arg11) {
            this.field2901[arg0][arg1] = (byte) (this.field2901[arg0][arg1] | 0x1);
        }
        if (arg5.length > this.field2918) {
            this.field2918 = arg5.length;
        }
        this.field2917 += arg5.length;
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(III)V", line = 940)
    public final void method1424(int arg0, int arg1, int arg2) {
        if ((this.field2916[arg0][arg1] & 0xFF) < arg2) {
            this.field2916[arg0][arg1] = (byte) arg2;
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II[I[I[I[I[I[I[I[I[I[IIIZ)V", line = 946)
    public final void method1425(int arg0, int arg1, int[] arg2, int[] arg3, int[] arg4, int[] arg5, int[] arg6, int[] arg7, int[] arg8, int[] arg9, int[] arg10, int[] arg11, int arg12, int arg13, boolean arg14) {
        int var16 = arg8.length;
        int[] var17 = new int[var16 * 3];
        int[] var18 = new int[var16 * 3];
        int[] var19 = new int[var16 * 3];
        int[] var20 = new int[var16 * 3];
        int[] var21 = new int[var16 * 3];
        int[] var22 = new int[var16 * 3];
        int[] var23 = arg3 == null ? null : new int[var16 * 3];
        int var24 = 0;
        for (int var25 = 0; var25 < var16; var25++) {
            int var26 = arg5[var25];
            int var27 = arg6[var25];
            int var28 = arg7[var25];
            var17[var24] = arg2[var26];
            var18[var24] = arg4[var26];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var26];
            }
            var24++;
            var17[var24] = arg2[var27];
            var18[var24] = arg4[var27];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var27];
            }
            var24++;
            var17[var24] = arg2[var28];
            var18[var24] = arg4[var28];
            var19[var24] = arg8[var25];
            var20[var24] = arg9[var25];
            var21[var24] = arg10[var25];
            var22[var24] = arg11[var25];
            if (arg3 != null) {
                var23[var24] = arg3[var28];
            }
            var24++;
        }
        this.method1423(arg0, arg1, var17, var23, var18, var19, var20, var21, var22, arg12, arg13, arg14);
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(IILqh;)Lqh;", line = 1011)
    public final class337 method1426(int arg0, int arg1, class337 arg2) {
        if ((this.field2901[arg0][arg1] & 0x1) == 0) {
            return null;
        }
        int var4 = this.field2903 >> this.field2896.field2274;
        class362 var5 = (class362) arg2;
        class362 var6;
        if (var5 != null && var5.method2297(var4, var4, (byte) 13)) {
            var6 = var5;
            var5.method2294(-83);
        } else {
            var6 = new class362(this.field2896, var4, var4);
        }
        var6.method2298(var4, var4, 14, 0, 0);
        this.method1433(var6, arg0, arg1);
        return var6;
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(II)I", line = 1035)
    public final int method1427(int arg0, int arg1) {
        int var3 = arg0 >> this.field2891;
        int var4 = arg1 >> this.field2891;
        if (var3 < 0 || var4 < 0 || var3 > this.field5538 - 1 || var4 > this.field5540 - 1) {
            return 0;
        }
        int var5 = arg0 & this.field2903 - 1;
        int var6 = arg1 & this.field2903 - 1;
        int var7 = (this.field2903 - var5) * this.field2899[var3][var4] + this.field2899[var3 + 1][var4] * var5 >> this.field2891;
        int var8 = (this.field2903 - var5) * this.field2899[var3][var4 + 1] + this.field2899[var3 + 1][var4 + 1] * var5 >> this.field2891;
        return (this.field2903 - var6) * var7 + var6 * var8 >> this.field2891;
    }

    @OriginalMember(owner = "client!dl", name = "c", descriptor = "(Lqh;IIIIZ)Z", line = 1056)
    public final boolean method1428(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2908 == null || arg0 == null) {
            return false;
        } else {
            int var7 = arg1 - (this.field2896.field2310 * arg2 >> 8) >> 3;
            int var8 = arg3 - (this.field2896.field2386 * arg2 >> 8) >> 3;
            return this.field2908.method1843(var7, var8, arg0, false);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(II)I", line = 1068)
    public final int method1429(int arg0, int arg1) {
        return this.field2899[arg0][arg1];
    }

    @OriginalMember(owner = "client!dl", name = "b", descriptor = "(Lqh;IIIIZ)V", line = 1071)
    public final void method1430(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2908 != null && arg0 != null) {
            int var7 = arg1 - (this.field2896.field2310 * arg2 >> 8) >> this.field2896.field2274;
            int var8 = arg3 - (this.field2896.field2386 * arg2 >> 8) >> this.field2896.field2274;
            this.field2908.method1840(-72, arg0, var7, var8);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lqh;IIIIZ)V", line = 1085)
    public final void method1431(class337 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
        if (this.field2908 != null && arg0 != null) {
            int var7 = arg1 - (this.field2896.field2310 * arg2 >> 8) >> this.field2896.field2274;
            int var8 = arg3 - (this.field2896.field2386 * arg2 >> 8) >> this.field2896.field2274;
            this.field2908.method1845(var7, var8, (byte) -100, arg0);
        }
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lap;[I)V", line = 1101)
    public final void method1432(class298 arg0, int[] arg1) {
        this.field2898.method2484(0, new class449(this.field2896, this, arg0, arg1));
    }

    @OriginalMember(owner = "client!dl", name = "a", descriptor = "(Lck;II)V", line = 1105)
    private final void method1433(class362 arg0, int arg1, int arg2) {
        int[] var4 = this.field2907[arg1][arg2];
        int[] var5 = this.field2906[arg1][arg2];
        int var6 = var4.length;
        if (field2927.length < var6) {
            field2927 = new int[var6];
            field2924 = new int[var6];
        }
        for (int var7 = 0; var7 < var6; var7++) {
            field2927[var7] = (var4[var7] & 0xFF) >> this.field2896.field2274;
            field2924[var7] = (var5[var7] & 0xFF) >> this.field2896.field2274;
        }
        int var8 = 0;
        while (var8 < var6) {
            int var9 = field2927[var8];
            int var10 = field2924[var8++];
            int var11 = field2927[var8];
            int var12 = field2924[var8++];
            int var13 = field2927[var8];
            int var14 = field2924[var8++];
            if ((var9 - var11) * (var12 - var14) - (var12 - var10) * (var13 - var11) > 0) {
                arg0.method2295(var13, var10, var12, 111, var9, var11, var14);
            }
        }
    }
}
