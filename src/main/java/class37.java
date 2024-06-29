import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public abstract class class37 implements class596 {

    @OriginalMember(owner = "client!be", name = "n", descriptor = "Lqo;")
    private class22 field409 = class523.field7453;

    @OriginalMember(owner = "client!be", name = "s", descriptor = "Ljm;")
    public class687 field414;

    @OriginalMember(owner = "client!be", name = "w", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!be", name = "h", descriptor = "Lwd;")
    public class272 field403;

    @OriginalMember(owner = "client!be", name = "u", descriptor = "I")
    public int field416;

    @OriginalMember(owner = "client!be", name = "q", descriptor = "Z")
    private boolean field412;

    @OriginalMember(owner = "client!be", name = "v", descriptor = "Lai;")
    public class597 field417;

    @OriginalMember(owner = "client!be", name = "k", descriptor = "I")
    private int field406;

    @OriginalMember(owner = "client!be", name = "t", descriptor = "Ldh;")
    public static class320 field415 = new class320(42, 4);

    @OriginalMember(owner = "client!be", name = "y", descriptor = "Ldh;")
    public static class320 field420 = new class320(109, 0);

    @OriginalMember(owner = "client!be", name = "A", descriptor = "I")
    public static int field422 = 0;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "I")
    public static int field396;

    @OriginalMember(owner = "client!be", name = "b", descriptor = "I")
    public static int field397;

    @OriginalMember(owner = "client!be", name = "c", descriptor = "I")
    public static int field398;

    @OriginalMember(owner = "client!be", name = "d", descriptor = "I")
    public static int field399;

    @OriginalMember(owner = "client!be", name = "e", descriptor = "I")
    public static int field400;

    @OriginalMember(owner = "client!be", name = "f", descriptor = "I")
    public static int field401;

    @OriginalMember(owner = "client!be", name = "g", descriptor = "I")
    public static int field402;

    @OriginalMember(owner = "client!be", name = "i", descriptor = "I")
    public static int field404;

    @OriginalMember(owner = "client!be", name = "j", descriptor = "I")
    public static int field405;

    @OriginalMember(owner = "client!be", name = "l", descriptor = "I")
    public static int field407;

    @OriginalMember(owner = "client!be", name = "m", descriptor = "I")
    public static int field408;

    @OriginalMember(owner = "client!be", name = "o", descriptor = "I")
    public static int field410;

    @OriginalMember(owner = "client!be", name = "p", descriptor = "I")
    public static int field411;

    @OriginalMember(owner = "client!be", name = "r", descriptor = "I")
    public static int field413;

    @OriginalMember(owner = "client!be", name = "x", descriptor = "I")
    public static int field419;

    @OriginalMember(owner = "client!be", name = "z", descriptor = "Loca;")
    public static class263 field421;

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Lqo;I)V", line = 4)
    public final void method155(class22 arg0, int arg1) {
        if (arg1 != -25446) {
            return;
        }
        if (this.field409 != arg0) {
            this.field409 = arg0;
            this.method172(arg1 + 25541);
        }
        field396++;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(B)V", line = 26)
    public static void method167(byte arg0) {
        field420 = null;
        field421 = null;
        field415 = null;
        if (arg0 <= 25) {
            field420 = null;
        }
    }

    @OriginalMember(owner = "client!be", name = "d", descriptor = "(B)V", line = 43)
    public static final void method168(byte arg0) {
        if (arg0 <= 106) {
            field421 = null;
        }
        field401++;
        class729 var1 = null;
        try {
            class290 var2 = class289.field3549.method3201(true, (byte) -124, "");
            while (var2.field3573 == 0) {
                class524.method3076(1, 1L);
            }
            if (var2.field3573 == 1) {
                var1 = (class729) var2.field3577;
                class244 var3 = class654.field9334.method3935((byte) -92);
                var1.method4064(0, var3.field2903, var3.field2912, 121);
            }
        } catch (Exception var5) {
        }
        try {
            if (var1 != null) {
                var1.method4060((byte) 86);
            }
        } catch (Exception var4) {
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(Z)V", line = 81)
    private final void method169(boolean arg0) {
        field402++;
        if (this.field406 > 0) {
            this.field417.method3404((byte) -102, this.field406, this.method177(4));
            this.field406 = 0;
        }
        if (arg0) {
            this.method177(-69);
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II[III)V", line = 99)
    public final void method170(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field413++;
        if (arg0 > 0 && !class560.method3273(-3469, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class560.method3273(-3469, arg4)) {
            throw new IllegalArgumentException("");
        } else if (class102.field1058 == this.field403) {
            int var6 = 0;
            int var7 = arg0 < arg4 ? arg0 : arg4;
            int var8 = arg0 >> 1;
            int var9 = arg4 >> 1;
            if (arg3 > -37) {
                method168((byte) -7);
            }
            int[] var10 = arg2;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var6, this.method173(true), arg0, arg4, 0, 32993, this.field417.field8506, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg0;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 16 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = var18 & 0xFF;
                        int var24 = var18 >> 8 & 0xFF;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = (var20 >> 24 & 0xFF) + var25;
                        int var27 = (var20 & 0xFF) + var23;
                        int var28 = ((var20 & 0xFFDE6B) >> 16) + var21;
                        int var29 = ((var20 & 0xFFFA) >> 8) + var24;
                        int var30 = (var19 >> 16 & 0xFF) + var28;
                        int var31 = (var19 >> 24 & 0xFF) + var26;
                        int var32 = (var19 >> 8 & 0xFF) + var29;
                        int var33 = (var19 & 0xFF) + var27;
                        int var34 = (var22 >> 24 & 0xFF) + var31;
                        int var35 = ((var22 & 0xFFA1) >> 8) + var32;
                        int var36 = (var22 & 0xFF) + var33;
                        int var37 = (var22 >> 16 & 0xFF) + var30;
                        var11[var12++] = class695.method3919(class327.method1956(255, var36 >> 2), class695.method3919(class327.method1956(65280, var35 << 6), class695.method3919(class327.method1956(16711680, var37 << 14), class327.method1956(var34 << 22, -16777216))));
                    }
                    var14 += arg0;
                    var13 += arg0;
                }
                var11 = var10;
                arg0 = var8;
                var10 = var15;
                arg4 = var9;
                var7 >>= 0x1;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var6++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III[BI)V", line = 208)
    public final void method171(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field419++;
        if (arg0 > 0 && !class560.method3273(-3469, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class560.method3273(-3469, arg1)) {
            int var6 = this.field403.field3357;
            int var7 = 0;
            int var8 = arg1 > arg0 ? arg0 : arg1;
            int var9 = arg0 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg3;
            byte[] var12 = new byte[var6 * var9 * var10];
            if (arg4 <= 97) {
                this.method170(-8, 123, null, 88, 63);
            }
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method173(true), arg0, arg1, 0, class325.method1935(117, this.field403), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            int var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            int var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = (byte) (var26 >> 2);
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                arg0 = var9;
                arg1 = var10;
                var11 = var15;
                var9 >>= 0x1;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!be", name = "b", descriptor = "(I)V", line = 305)
    private final void method172(int arg0) {
        this.field417.method2207((byte) -61, this);
        field411++;
        if (arg0 <= 83) {
            this.method172(108);
        }
        if (class523.field7453 == this.field409) {
            OpenGL.glTexParameteri(this.field416, 10241, this.field412 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field416, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field416, 10241, this.field412 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field416, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(Z)I", line = 327)
    public final int method173(boolean arg0) {
        field407++;
        if (!arg0) {
            return 39;
        }
        if (class687.field9697 == this.field414) {
            if (class430.field6247 == this.field403) {
                return 6407;
            }
            if (class102.field1058 == this.field403) {
                return 6408;
            }
            if (class252.field3039 == this.field403) {
                return 6406;
            }
            if (class23.field209 == this.field403) {
                return 6409;
            }
            if (class147.field1639 == this.field403) {
                return 6410;
            }
            if (class411.field5613 == this.field403) {
                return 6145;
            }
        } else if (class687.field9700 == this.field414) {
            if (class430.field6247 == this.field403) {
                return 34843;
            }
            if (class102.field1058 == this.field403) {
                return 34842;
            }
            if (class252.field3039 == this.field403) {
                return 34844;
            }
            if (class23.field209 == this.field403) {
                return 34846;
            }
            if (class147.field1639 == this.field403) {
                return 34847;
            }
            if (class411.field5613 == this.field403) {
                return 6145;
            }
        } else if (class687.field9701 == this.field414) {
            if (class430.field6247 == this.field403) {
                return 34837;
            }
            if (class102.field1058 == this.field403) {
                return 34836;
            }
            if (class252.field3039 == this.field403) {
                return 34838;
            }
            if (class23.field209 == this.field403) {
                return 34840;
            }
            if (class147.field1639 == this.field403) {
                return 34841;
            }
            if (class411.field5613 == this.field403) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(B)V", line = 430)
    public final void method174(byte arg0) {
        field398++;
        if (arg0 < 38) {
            this.method172(-47);
        }
        int var2 = this.field417.method2276(-16504);
        int var3 = this.field417.field8515[var2];
        if (this.field416 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field416);
            this.field417.field8515[var2] = this.field416;
        }
        OpenGL.glBindTexture(this.field416, this.field406);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;IILjava/lang/String;)I", line = 460)
    public static final int method175(String arg0, int arg1, int arg2, String arg3) {
        if (arg1 != 2) {
            method180(null, -116);
        }
        field405++;
        int var4 = arg3.length();
        int var5 = arg0.length();
        int var6 = 0;
        int var7 = 0;
        char var8 = 0;
        char var9 = 0;
        while (var4 > (var6 - var8) || var7 - var9 < var5) {
            if (var4 <= var6 - var8) {
                return -1;
            }
            if ((var7 - var9) >= var5) {
                return 1;
            }
            char var22;
            if (var8 == '\u0000') {
                var22 = arg3.charAt(var6++);
            } else {
                var22 = var8;
                boolean var23 = false;
            }
            char var24;
            if (var9 == '\u0000') {
                var24 = arg0.charAt(var7++);
            } else {
                var24 = var9;
                boolean var25 = false;
            }
            var8 = class62.method470(var22, -80);
            var9 = class62.method470(var24, arg1 - 29);
            char var26 = class727.method4042(var22, (byte) -123, arg2);
            char var27 = class727.method4042(var24, (byte) -109, arg2);
            if (var26 != var27 && Character.toUpperCase(var26) != Character.toUpperCase(var27)) {
                char var28 = Character.toLowerCase(var26);
                char var29 = Character.toLowerCase(var27);
                if (var28 != var29) {
                    return class742.method4131(var28, (byte) -123, arg2) - class742.method4131(var29, (byte) -127, arg2);
                }
            }
        }
        int var10 = Math.min(var4, var5);
        for (int var11 = 0; var11 < var10; var11++) {
            int var16;
            int var17;
            if (arg2 == 2) {
                var16 = var5 - var11 - 1;
                var17 = var4 - var11 - 1;
            } else {
                var16 = var11;
                var17 = var11;
            }
            char var18 = arg3.charAt(var17);
            char var19 = arg0.charAt(var16);
            if (var18 != var19 && Character.toUpperCase(var18) != Character.toUpperCase(var19)) {
                char var20 = Character.toLowerCase(var18);
                char var21 = Character.toLowerCase(var19);
                if (var20 != var21) {
                    return class742.method4131(var20, (byte) -57, arg2) - class742.method4131(var21, (byte) -47, arg2);
                }
            }
        }
        int var12 = var4 - var5;
        if (var12 != 0) {
            return var12;
        }
        for (int var13 = 0; var13 < var10; var13++) {
            char var14 = arg3.charAt(var13);
            char var15 = arg0.charAt(var13);
            if (var14 != var15) {
                return class742.method4131(var14, (byte) -121, arg2) - class742.method4131(var15, (byte) -70, arg2);
            }
        }
        return 0;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(IBIIFFIF)[F", line = 582)
    public static final float[] method176(int arg0, byte arg1, int arg2, int arg3, float arg4, float arg5, int arg6, float arg7) {
        field399++;
        float[] var8 = new float[9];
        float[] var9 = new float[9];
        float var10 = (float) Math.cos((double) ((float) arg0 * 0.024543693F));
        float var11 = (float) Math.sin((double) ((float) arg0 * 0.024543693F));
        var8[8] = var10;
        var8[0] = var10;
        var8[1] = 0.0F;
        var8[7] = 0.0F;
        var8[4] = 1.0F;
        var8[5] = 0.0F;
        var8[6] = -var11;
        var8[2] = var11;
        float var12 = 1.0F - var10;
        var8[3] = 0.0F;
        float[] var13 = new float[9];
        float var14 = 1.0F;
        float var15 = (float) arg3 / 32767.0F;
        float var16 = 0.0F;
        float var17 = -((float) Math.sqrt((double) (1.0F - var15 * var15)));
        float var18 = 1.0F - var15;
        float var19 = (float) Math.sqrt((double) (arg2 * arg2 + arg6 * arg6));
        if (var19 == 0.0F && var15 == 0.0F) {
            var9 = var8;
        } else {
            if (var19 != 0.0F) {
                var14 = (float) (-arg2) / var19;
                var16 = (float) arg6 / var19;
            }
            var13[8] = var16 * var16 * var18 + var15;
            var13[7] = -var14 * var17;
            var13[1] = var16 * var17;
            var13[6] = var14 * var16 * var18;
            var13[2] = var14 * var16 * var18;
            var13[3] = -var16 * var17;
            var13[4] = var15;
            var13[5] = var14 * var17;
            var13[0] = var14 * var14 * var18 + var15;
            var9[0] = var8[2] * var13[6] + var8[0] * var13[0] + var8[1] * var13[3];
            var9[1] = var8[2] * var13[7] + var8[0] * var13[1] + var8[1] * var13[4];
            var9[2] = var8[2] * var13[8] + var8[0] * var13[2] + var8[1] * var13[5];
            var9[3] = var8[5] * var13[6] + var8[4] * var13[3] + var8[3] * var13[0];
            var9[4] = var8[5] * var13[7] + var8[4] * var13[4] + var8[3] * var13[1];
            var9[5] = var8[5] * var13[8] + var8[3] * var13[2] + var8[4] * var13[5];
            var9[6] = var8[8] * var13[6] + var8[7] * var13[3] + var8[6] * var13[0];
            var9[7] = var8[8] * var13[7] + var8[7] * var13[4] + var8[6] * var13[1];
            var9[8] = var8[8] * var13[8] + var8[7] * var13[5] + var8[6] * var13[2];
        }
        var9[5] *= arg4;
        if (arg1 != -4) {
            method167((byte) -59);
        }
        var9[6] *= arg7;
        var9[2] *= arg5;
        var9[4] *= arg4;
        var9[0] *= arg5;
        var9[3] *= arg4;
        var9[7] *= arg7;
        var9[8] *= arg7;
        var9[1] *= arg5;
        return var9;
    }

    @OriginalMember(owner = "client!be", name = "c", descriptor = "(I)I", line = 666)
    private final int method177(int arg0) {
        field404++;
        int var2 = this.field414.field9690 * this.field403.field3357 * this.field418;
        if (arg0 != 4) {
            this.method155(null, 107);
        }
        return this.field412 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(III[FI)V", line = 679)
    public final void method178(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        field408++;
        if (arg0 > 0 && !class560.method3273(-3469, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class560.method3273(-3469, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 == -7991) {
            int var6 = this.field403.field3357;
            int var7 = 0;
            int var8 = arg2 > arg0 ? arg0 : arg2;
            int var9 = arg0 >> 1;
            int var10 = arg2 >> 1;
            float[] var11 = arg3;
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method173(true), arg0, arg2, 0, class325.method1935(-82, this.field403), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg0 = var9;
                arg2 = var10;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var9 >>= 0x1;
            }
        }
    }

    @OriginalMember(owner = "client!be", name = "<init>", descriptor = "(Lai;ILwd;Ljm;IZ)V", line = 808)
    public class37(class597 arg0, int arg1, class272 arg2, class687 arg3, int arg4, boolean arg5) {
        this.field414 = arg3;
        this.field418 = arg4;
        this.field403 = arg2;
        this.field416 = arg1;
        this.field412 = arg5;
        this.field417 = arg0;
        OpenGL.glGenTextures(1, class708.field9988, 0);
        this.field406 = class708.field9988[0];
        this.method172(95);
        this.method179(0, 34840);
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(II)V", line = 781)
    private final void method179(int arg0, int arg1) {
        if (arg1 != 34840) {
            this.method179(-86, -84);
        }
        this.field417.field5049 -= arg0;
        field410++;
        this.field417.field5049 += this.method177(4);
    }

    @OriginalMember(owner = "client!be", name = "finalize", descriptor = "()V", line = 797)
    protected final void finalize() throws Throwable {
        this.method169(false);
        field397++;
        super.finalize();
    }

    @OriginalMember(owner = "client!be", name = "a", descriptor = "(Ljava/lang/String;I)I", line = 835)
    public static final int method180(String arg0, int arg1) {
        if (arg1 != 255) {
            method167((byte) 27);
        }
        field400++;
        return arg0.length() + 2;
    }
}
