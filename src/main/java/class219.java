import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tk")
public class class219 extends class86 {

    @OriginalMember(owner = "client!tk", name = "r", descriptor = "Lrl;")
    private class487 field3072;

    @OriginalMember(owner = "client!tk", name = "p", descriptor = "Ldq;")
    private class472 field3070;

    @OriginalMember(owner = "client!tk", name = "B", descriptor = "Lgb;")
    private class136 field3082;

    @OriginalMember(owner = "client!tk", name = "H", descriptor = "I")
    private int field3088;

    @OriginalMember(owner = "client!tk", name = "E", descriptor = "I")
    private int field3085;

    @OriginalMember(owner = "client!tk", name = "M", descriptor = "I")
    private int field3093;

    @OriginalMember(owner = "client!tk", name = "J", descriptor = "I")
    private int field3090;

    @OriginalMember(owner = "client!tk", name = "w", descriptor = "[[F")
    private float[][] field3077;

    @OriginalMember(owner = "client!tk", name = "u", descriptor = "[[F")
    private float[][] field3075;

    @OriginalMember(owner = "client!tk", name = "P", descriptor = "[[F")
    private float[][] field3096;

    @OriginalMember(owner = "client!tk", name = "O", descriptor = "Lms;")
    private class511 field3095;

    @OriginalMember(owner = "client!tk", name = "t", descriptor = "Llp;")
    private class255 field3074;

    @OriginalMember(owner = "client!tk", name = "o", descriptor = "Lbh;")
    private class27 field3069;

    @OriginalMember(owner = "client!tk", name = "q", descriptor = "Lbh;")
    private class27 field3071;

    @OriginalMember(owner = "client!tk", name = "z", descriptor = "Lae;")
    private class156 field3080;

    @OriginalMember(owner = "client!tk", name = "N", descriptor = "Lwl;")
    private class269 field3094;

    @OriginalMember(owner = "client!tk", name = "D", descriptor = "Lfe;")
    private class384 field3084;

    @OriginalMember(owner = "client!tk", name = "s", descriptor = "I")
    public static int field3073 = 0;

    @OriginalMember(owner = "client!tk", name = "x", descriptor = "[I")
    public static int[] field3078 = new int[5];

    @OriginalMember(owner = "client!tk", name = "K", descriptor = "Ljava/lang/String;")
    public static String field3091 = "";

    @OriginalMember(owner = "client!tk", name = "v", descriptor = "I")
    public static int field3076;

    @OriginalMember(owner = "client!tk", name = "y", descriptor = "I")
    public static int field3079;

    @OriginalMember(owner = "client!tk", name = "A", descriptor = "I")
    private int field3081;

    @OriginalMember(owner = "client!tk", name = "C", descriptor = "I")
    public static int field3083;

    @OriginalMember(owner = "client!tk", name = "F", descriptor = "I")
    public static int field3086;

    @OriginalMember(owner = "client!tk", name = "G", descriptor = "I")
    public static int field3087;

    @OriginalMember(owner = "client!tk", name = "I", descriptor = "I")
    private int field3089;

    @OriginalMember(owner = "client!tk", name = "L", descriptor = "I")
    public static int field3092;

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIII)V", line = 5)
    private final void method1346(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        field3079++;
        long var8 = -1L;
        int var10 = (arg3 << this.field3082.field6441) + arg6;
        int var11 = (arg2 << this.field3082.field6441) + arg0;
        int var12 = this.field3082.method855(var10, var11);
        if (~(arg6 & 0x7F) == arg5 || (arg0 & 0x7F) == 0) {
            var8 = ((long) var11 & 0xFFFFL) << 16 | (long) var10 & 0xFFFFL;
            class86 var13 = this.field3084.method2310((byte) 76, var8);
            if (var13 != null) {
                this.method1350((byte) 115, ((class46) var13).field698);
                return;
            }
        }
        short var14 = (short) (this.field3081++);
        if (var8 != -1L) {
            this.field3084.method2317(-1, var8, new class46(var14));
        }
        float var15;
        float var16;
        float var17;
        if (arg6 == 0 && arg0 == 0) {
            var15 = this.field3096[arg4][arg1];
            var16 = this.field3077[arg4][arg1];
            var17 = this.field3075[arg4][arg1];
        } else if (this.field3082.field6438 == arg6 && arg0 == 0) {
            var15 = this.field3096[arg4 + 1][arg1];
            var17 = this.field3075[arg4 + 1][arg1];
            var16 = this.field3077[arg4 + 1][arg1];
        } else if (this.field3082.field6438 == arg6 && this.field3082.field6438 == arg0) {
            var15 = this.field3096[arg4 + 1][arg1 + 1];
            var16 = this.field3077[arg4 + 1][arg1 + 1];
            var17 = this.field3075[arg4 + 1][arg1 + 1];
        } else if (arg6 == 0 && this.field3082.field6438 == arg0) {
            var16 = this.field3077[arg4][arg1 + 1];
            var15 = this.field3096[arg4][arg1 + 1];
            var17 = this.field3075[arg4][arg1 + 1];
        } else {
            float var18 = (float) arg6 / (float) this.field3082.field6438;
            float var19 = (float) arg0 / (float) this.field3082.field6438;
            float var20 = this.field3077[arg4][arg1];
            float var21 = this.field3096[arg4][arg1];
            float var22 = this.field3075[arg4][arg1];
            float var23 = this.field3077[arg4 + 1][arg1];
            float var24 = this.field3096[arg4 + 1][arg1];
            float var25 = (this.field3096[arg4 + 1][arg1 + 1] - var24) * var18 + var24;
            float var26 = (this.field3075[arg4][arg1 + 1] - var22) * var18 + var22;
            float var27 = (this.field3077[arg4 + 1][arg1 + 1] - var23) * var18 + var23;
            float var28 = this.field3075[arg4 + 1][arg1];
            float var29 = (this.field3077[arg4][arg1 + 1] - var20) * var18 + var20;
            float var30 = (this.field3096[arg4][arg1 + 1] - var21) * var18 + var21;
            var15 = (var25 - var30) * var19 + var30;
            float var31 = (this.field3075[arg4 + 1][arg1 + 1] - var28) * var18 + var28;
            var16 = (var27 - var29) * var19 + var29;
            var17 = (var31 - var26) * var19 + var26;
        }
        float var32 = (float) (this.field3070.method2759(121) - var10);
        float var33 = (float) (this.field3070.method2760(-119) - var12);
        float var34 = (float) (this.field3070.method2761(0) - var11);
        float var35 = (float) Math.sqrt((double) (var34 * var34 + var32 * var32 + var33 * var33));
        float var36 = 1.0F / var35;
        float var37 = var32 * var36;
        float var38 = var33 * var36;
        float var39 = var34 * var36;
        float var40 = var35 / (float) this.field3070.method2764(false);
        float var41 = 1.0F - (var40 * var40);
        if (var41 < 0.0F) {
            var41 = 0.0F;
        }
        float var42 = var17 * var39 + var15 * var38 + var16 * var37;
        if (var42 < 0.0F) {
            var42 = 0.0F;
        }
        float var43 = var41 * var42 * 2.0F;
        if (var43 > 1.0F) {
            var43 = 1.0F;
        }
        int var44 = this.field3070.method2765(0);
        int var45 = (int) ((float) ((var44 & 0xFFEB74) >> 16) * var43);
        if (var45 > 255) {
            var45 = 255;
        }
        int var46 = (int) ((float) (var44 >> 8 & 0xFF) * var43);
        if (var46 > 255) {
            var46 = 255;
        }
        int var47 = (int) ((float) (var44 & 0xFF) * var43);
        if (var47 > 255) {
            var47 = 255;
        }
        if (this.field3072.field7350) {
            this.field3094.method1646((float) var10, arg5 ^ 0x8272147);
            this.field3094.method1646((float) var12, arg5 - 136782151);
            this.field3094.method1646((float) var11, -136782152);
        } else {
            this.field3094.method1647((float) var10, true);
            this.field3094.method1647((float) var12, true);
            this.field3094.method1647((float) var11, true);
        }
        this.field3094.method947(-124, var45);
        this.field3094.method947(-38, var46);
        this.field3094.method947(-61, var47);
        this.field3094.method947(arg5 ^ 0x31, 255);
        this.method1350((byte) 62, var14);
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(I)V", line = 175)
    public static void method1347(int arg0) {
        field3091 = null;
        field3078 = null;
        if (arg0 >= -70) {
            field3078 = null;
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIIIIIII)V", line = 188)
    public static final void method1348(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        field3076++;
        if (arg2 == arg7) {
            class2.method6(arg7, arg1, arg4, arg0, arg6, (byte) -124, arg5);
            return;
        }
        if (arg0 - arg7 >= class473.field6839 && (arg0 + arg7) <= class63.field933 && arg6 - arg2 >= class7.field131 && (arg6 + arg2) <= class92.field1252) {
            class129.method715((byte) -43, arg1, arg0, arg4, arg5, arg7, arg6, arg2);
        } else {
            class131.method721(arg0, arg1, arg7, arg6, 46, arg2, arg5, arg4);
        }
        if (arg3 != 12467) {
            method1347(50);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(IIII[[Z)V", line = 217)
    public final void method1349(int arg0, int arg1, int arg2, int arg3, boolean[][] arg4) {
        field3086++;
        if (this.field3074 == null || arg0 + arg3 < this.field3088 || this.field3085 < arg3 - arg0 || arg0 + arg2 < this.field3093 || (arg2 - arg0) > this.field3090) {
            return;
        }
        for (int var6 = this.field3093; var6 <= this.field3090; var6++) {
            for (int var7 = this.field3088; var7 <= this.field3085; var7++) {
                int var8 = var7 - arg3;
                int var9 = var6 - arg2;
                if (-arg0 < var8 && var8 < arg0 && (-arg0) < var9 && arg0 > var9 && arg4[arg0 + var8][arg0 + var9]) {
                    this.field3072.method2865((int) (this.field3070.method2758(-33) * 255.0F) << 24, -101);
                    this.field3072.method2861(this.field3071, arg1 ^ 0x23BD, this.field3069, null, null);
                    this.field3072.method2929(0, this.field3089, 0, this.field3074, 4);
                    return;
                }
            }
        }
        if (arg1 != 0) {
            this.method1346(-55, -21, 102, 65, -116, 88, -18);
        }
    }

    @OriginalMember(owner = "client!tk", name = "a", descriptor = "(BS)V", line = 274)
    private final void method1350(byte arg0, short arg1) {
        if (arg0 <= 48) {
            this.method1350((byte) -34, (short) 54);
        }
        if (this.field3072.field7350) {
            this.field3080.method961(arg1, 1608339368);
        } else {
            this.field3080.method988(arg1, -461070776);
        }
        field3092++;
        this.field3089++;
    }

    @OriginalMember(owner = "client!tk", name = "<init>", descriptor = "(Lrl;Lgb;Ldq;[I)V", line = 306)
    public class219(class487 arg0, class136 arg1, class472 arg2, int[] arg3) {
        this.field3072 = arg0;
        this.field3070 = arg2;
        this.field3082 = arg1;
        int var5 = this.field3070.method2764(false) - (arg1.field6438 >> 1);
        this.field3088 = this.field3070.method2759(125) - var5 >> arg1.field6441;
        this.field3085 = var5 + this.field3070.method2759(125) >> arg1.field6441;
        this.field3093 = this.field3070.method2761(0) - var5 >> arg1.field6441;
        this.field3090 = this.field3070.method2761(0) + var5 >> arg1.field6441;
        int var6 = this.field3085 + 1 - this.field3088;
        int var7 = this.field3090 + 1 - this.field3093;
        this.field3077 = new float[var6 + 1][var7 + 1];
        this.field3075 = new float[var6 + 1][var7 + 1];
        this.field3096 = new float[var6 + 1][var7 + 1];
        for (int var8 = 0; var8 <= var7; var8++) {
            int var24 = this.field3093 + var8;
            if (var24 > 0 && this.field3082.field6436 - 1 > var24) {
                for (int var25 = 0; var25 <= var6; var25++) {
                    int var26 = var25 + this.field3088;
                    if (var26 > 0 && (this.field3082.field6434 - 1) > var26) {
                        int var27 = arg1.method848(var26 + 1, var24) - arg1.method848(var26 - 1, var24);
                        int var28 = arg1.method848(var26, var24 + 1) - arg1.method848(var26, var24 - 1);
                        float var29 = (float) (1.0D / Math.sqrt((double) (var27 * var27 + ((var28 * var28) + 65536))));
                        this.field3077[var25][var8] = (float) var27 * var29;
                        this.field3096[var25][var8] = var29 * -256.0F;
                        this.field3075[var25][var8] = (float) var28 * var29;
                    }
                }
            }
        }
        int var9 = 0;
        int var10 = 0;
        for (int var11 = this.field3093; var11 <= this.field3090; var11++) {
            if (var11 >= 0 && arg1.field6436 > var11) {
                for (int var21 = this.field3088; var21 <= this.field3085; var21++) {
                    if (var21 >= 0 && var21 < arg1.field6434) {
                        int var22 = arg3[var10];
                        int[] var23 = arg1.field1738[var21][var11];
                        if (var23 != null && var22 != 0) {
                            if (var22 == 1) {
                                var9 += var23.length;
                            } else {
                                var9 += 3;
                            }
                        }
                    }
                    var10++;
                }
            } else {
                var10 += this.field3085 - this.field3088;
            }
        }
        if (var9 <= 0) {
            this.field3095 = null;
            this.field3074 = null;
            this.field3069 = null;
            this.field3071 = null;
        } else {
            this.field3080 = new class156(var9 * 2);
            this.field3094 = new class269(var9 * 16);
            this.field3084 = new class384(class340.method2064(126, var9));
            int var12 = 0;
            int var13 = 0;
            for (int var14 = this.field3093; var14 <= this.field3090; var14++) {
                if (var14 >= 0 && arg1.field6436 > var14) {
                    int var15 = 0;
                    for (int var16 = this.field3088; var16 <= this.field3085; var16++) {
                        if (var16 >= 0 && var16 < arg1.field6434) {
                            int var17 = arg3[var12];
                            int[] var18 = arg1.field1738[var16][var14];
                            int[] var19 = arg1.field1739[var16][var14];
                            if (var18 != null && var17 != 0) {
                                if (var17 == 1) {
                                    for (int var20 = 0; var20 < var18.length; var20++) {
                                        this.method1346(var19[var20], var13, var14, var16, var15, -1, var18[var20]);
                                    }
                                } else if (var17 == 3) {
                                    this.method1346(0, var13, var14, var16, var15, -1, 0);
                                    this.method1346(0, var13, var14, var16, var15, -1, arg1.field6438);
                                    this.method1346(arg1.field6438, var13, var14, var16, var15, -1, 0);
                                } else if (var17 == 2) {
                                    this.method1346(0, var13, var14, var16, var15, -1, arg1.field6438);
                                    this.method1346(arg1.field6438, var13, var14, var16, var15, -1, arg1.field6438);
                                    this.method1346(0, var13, var14, var16, var15, -1, 0);
                                } else if (var17 == 5) {
                                    this.method1346(arg1.field6438, var13, var14, var16, var15, -1, arg1.field6438);
                                    this.method1346(arg1.field6438, var13, var14, var16, var15, -1, 0);
                                    this.method1346(0, var13, var14, var16, var15, -1, arg1.field6438);
                                } else if (var17 == 4) {
                                    this.method1346(arg1.field6438, var13, var14, var16, var15, -1, 0);
                                    this.method1346(0, var13, var14, var16, var15, -1, 0);
                                    this.method1346(arg1.field6438, var13, var14, var16, var15, -1, arg1.field6438);
                                }
                            }
                        }
                        var15++;
                        var12++;
                    }
                } else {
                    var12 += this.field3085 - this.field3088;
                }
                var13++;
            }
            this.field3074 = this.field3072.method2910(5123, false, this.field3080.field2041, this.field3080.field2018, 768);
            this.field3095 = this.field3072.method2900(16, (byte) 123, false, this.field3094.field2018, this.field3094.field2041);
            this.field3069 = new class27(this.field3072, this.field3095, 5126, 3, 0);
            this.field3071 = new class27(this.field3072, this.field3095, 5121, 4, 12);
        }
        this.field3080 = null;
        this.field3084 = null;
        this.field3077 = this.field3096 = this.field3075 = null;
        this.field3094 = null;
    }
}
