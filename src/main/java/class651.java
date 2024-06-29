import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oo")
public abstract class class651 implements class749 {

    @OriginalMember(owner = "client!oo", name = "l", descriptor = "Lcr;")
    private class597 field9168 = class480.field6804;

    @OriginalMember(owner = "client!oo", name = "m", descriptor = "Log;")
    public class673 field9169;

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "Z")
    private boolean field9164;

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "I")
    public int field9160;

    @OriginalMember(owner = "client!oo", name = "w", descriptor = "Lkn;")
    public class770 field9179;

    @OriginalMember(owner = "client!oo", name = "t", descriptor = "Lofa;")
    public class345 field9176;

    @OriginalMember(owner = "client!oo", name = "i", descriptor = "I")
    private int field9165;

    @OriginalMember(owner = "client!oo", name = "u", descriptor = "I")
    private int field9177;

    @OriginalMember(owner = "client!oo", name = "j", descriptor = "[[I")
    public static int[][] field9166 = new int[][] { { 0, 2, 4, 6 }, { 6, 0, 2, 4 }, { 6, 0, 2 }, { 2, 6, 0 }, { 0, 2, 6 }, { 6, 0, 2 }, { 5, 6, 0, 1, 2, 4 }, { 7, 2, 4, 4 }, { 2, 4, 4, 7 }, { 6, 6, 4, 0, 2, 2 }, { 0, 2, 2, 6, 6, 4 }, { 0, 2, 2, 4, 6, 6 }, { 0, 2, 4, 6 } };

    @OriginalMember(owner = "client!oo", name = "x", descriptor = "[Ljava/lang/String;")
    public static String[] field9180 = new String[8];

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "I")
    public static int field9157;

    @OriginalMember(owner = "client!oo", name = "c", descriptor = "I")
    public static int field9159;

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "I")
    public static int field9161;

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "I")
    public static int field9162;

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "I")
    public static int field9163;

    @OriginalMember(owner = "client!oo", name = "k", descriptor = "I")
    public static int field9167;

    @OriginalMember(owner = "client!oo", name = "n", descriptor = "I")
    public static int field9170;

    @OriginalMember(owner = "client!oo", name = "o", descriptor = "I")
    public static int field9171;

    @OriginalMember(owner = "client!oo", name = "p", descriptor = "I")
    public static int field9172;

    @OriginalMember(owner = "client!oo", name = "q", descriptor = "I")
    public static int field9173;

    @OriginalMember(owner = "client!oo", name = "r", descriptor = "I")
    public static int field9174;

    @OriginalMember(owner = "client!oo", name = "s", descriptor = "I")
    public static int field9175;

    @OriginalMember(owner = "client!oo", name = "v", descriptor = "I")
    public static int field9178;

    @OriginalMember(owner = "client!oo", name = "y", descriptor = "I")
    public static int field9181;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "Lqda;")
    public static class112 field9158;

    @OriginalMember(owner = "client!oo", name = "b", descriptor = "(B)V", line = 4)
    public static final void method3724(byte arg0) {
        if (class472.field6735 != -1) {
            class789.method4318(false, class472.field6735, -1, true, -1);
            class472.field6735 = -1;
        }
        field9170++;
        if (arg0 >= -65) {
            method3724((byte) -110);
        }
    }

    @OriginalMember(owner = "client!oo", name = "finalize", descriptor = "()V", line = 23)
    protected final void finalize() throws Throwable {
        this.method3725(17993);
        field9167++;
        super.finalize();
    }

    @OriginalMember(owner = "client!oo", name = "d", descriptor = "(I)V", line = 33)
    private final void method3725(int arg0) {
        if (this.field9177 > 0) {
            this.field9169.method3813(this.method3734(-104), arg0 ^ 0xFFFFAA86, this.field9177);
            this.field9177 = 0;
        }
        field9173++;
        if (arg0 != 17993) {
            this.method2686(62);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(IIIII)V", line = 51)
    public static final void method3726(int arg0, int arg1, int arg2, int arg3, int arg4) {
        field9163++;
        if (class463.field6612 != 1) {
            return;
        }
        int var5 = arg3 / class692.field9768;
        int var6 = arg4 / class692.field9768;
        int var7 = arg0 / class637.field8968;
        int var8 = arg2 / class637.field8968;
        if (var5 >= class606.field8522 || var6 < 0 || var7 >= class526.field7491 || var8 < 0) {
            return;
        }
        if (class606.field8522 <= var6) {
            var6 = class606.field8522 - 1;
        }
        if (var5 < 0) {
            var5 = 0;
        }
        if (var7 < 0) {
            var7 = 0;
        }
        if (class526.field7491 <= var8) {
            var8 = class526.field7491 - 1;
        }
        int var9 = var7;
        if (arg1 <= 3) {
            return;
        }
        while (var9 <= var8) {
            int var10 = class468.method2759(class526.field7491, class37.field556 + var9, 0) * class606.field8522;
            for (int var11 = var5; var11 <= var6; var11++) {
                int var12 = class468.method2759(class606.field8522, class596.field8414 + var11, 0) + var10;
                class148.field1898[var12] = class502.field7191;
            }
            var9++;
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(Lcr;Z)V", line = 119)
    public final void method2161(class597 arg0, boolean arg1) {
        if (this.field9168 != arg0) {
            this.field9168 = arg0;
            this.method3728(34838);
        }
        if (arg1) {
            this.field9160 = -120;
        }
        field9162++;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(ZI[III)V", line = 138)
    public final void method3727(boolean arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field9174++;
        if (arg1 > 0 && !class315.method2071(-127, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class315.method2071(-128, arg3)) {
            throw new IllegalArgumentException("");
        } else if (class12.field247 == this.field9176) {
            int var6 = 0;
            int var7 = arg1 >= arg3 ? arg3 : arg1;
            int var8 = arg1 >> 1;
            int var9 = arg3 >> 1;
            if (arg0) {
                field9180 = null;
            }
            int[] var10 = arg2;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var6, this.method3733(-95), arg1, arg3, 0, 32993, this.field9169.field9539, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg1;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 & 0xFF;
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var18 >> 16 & 0xFF;
                        int var24 = var10[var14++];
                        int var25 = (var18 & 0xFF03) >> 8;
                        int var26 = ((var20 & 0xFF8E79) >> 16) + var23;
                        int var27 = (var20 & 0xFF) + var21;
                        int var28 = (var20 >> 24 & 0xFF) + var22;
                        int var29 = (var20 >> 8 & 0xFF) + var25;
                        int var30 = (var19 >> 16 & 0xFF) + var26;
                        int var31 = (var19 & 0xFF) + var27;
                        int var32 = (var19 >> 24 & 0xFF) + var28;
                        int var33 = (var19 >> 8 & 0xFF) + var29;
                        int var34 = ((var24 & 0xFFDC1D) >> 16) + var30;
                        int var35 = (var24 & 0xFF) + var31;
                        int var36 = (var24 >> 8 & 0xFF) + var33;
                        int var37 = (var24 >> 24 & 0xFF) + var32;
                        var11[var12++] = class281.method1904(class111.method773(255, var35 >> 2), class281.method1904(class281.method1904(class111.method773(1020, var37) << 22, class111.method773(1020, var34) << 14), class111.method773(65280, var36 << 6)));
                    }
                    var14 += arg1;
                    var13 += arg1;
                }
                int[] var16 = var11;
                var11 = var10;
                arg1 = var8;
                var10 = var16;
                arg3 = var9;
                var9 >>= 0x1;
                var6++;
                var7 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oo", name = "e", descriptor = "(I)V", line = 244)
    private final void method3728(int arg0) {
        this.field9169.method1104(true, this);
        field9161++;
        if (arg0 != 34838) {
            return;
        }
        if (class480.field6804 == this.field9168) {
            OpenGL.glTexParameteri(this.field9160, 10241, this.field9164 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9160, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9160, 10241, this.field9164 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9160, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "([FIIII)V", line = 270)
    public final void method3729(float[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field9178++;
        if (arg1 > 0 && !class315.method2071(-128, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class315.method2071(-128, arg4)) {
            int var6 = this.field9176.field5077;
            int var7 = 0;
            int var8 = arg4 <= arg1 ? arg4 : arg1;
            int var9 = arg1 >> 1;
            int var10 = arg4 >> 1;
            if (arg2 >= -57) {
                this.field9160 = 39;
            }
            float[] var11 = arg0;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg3, var7, this.method3733(75), arg1, arg4, 0, class379.method2342(this.field9176, 6410), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var12[var16] = var26 * 0.25F;
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg4 = var10;
                arg1 = var9;
                var8 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(II)V", line = 366)
    private final void method3730(int arg0, int arg1) {
        field9159++;
        if (arg1 > -12) {
            this.method2686(94);
        }
        this.field9169.field2115 -= arg0;
        this.field9169.field2115 += this.method3734(90);
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(III[BI)V", line = 379)
    public final void method3731(int arg0, int arg1, int arg2, byte[] arg3, int arg4) {
        field9172++;
        if (arg4 > 0 && !class315.method2071(-126, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class315.method2071(-127, arg0)) {
            int var6 = this.field9176.field5077;
            int var7 = arg1;
            int var8 = arg0 > arg4 ? arg4 : arg0;
            int var9 = arg4 >> 1;
            int var10 = arg0 >> 1;
            byte[] var11 = arg3;
            byte[] var12 = new byte[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Dub(arg2, var7, this.method3733(-119), arg4, arg0, 0, class379.method2342(this.field9176, 6410), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg4 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var13 + var15;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            byte var21 = var11[var17];
                            int var22 = var6 + var17;
                            int var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            int var24 = var11[var18] + var23;
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
                var12 = var11;
                arg0 = var10;
                var11 = var14;
                arg4 = var9;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!oo", name = "<init>", descriptor = "(Log;ILofa;Lkn;IZ)V", line = 492)
    public class651(class673 arg0, int arg1, class345 arg2, class770 arg3, int arg4, boolean arg5) {
        this.field9169 = arg0;
        this.field9164 = arg5;
        this.field9160 = arg1;
        this.field9179 = arg3;
        this.field9176 = arg2;
        this.field9165 = arg4;
        OpenGL.glGenTextures(1, class95.field1222, 0);
        this.field9177 = class95.field1222[0];
        this.method3728(34838);
        this.method3730(0, -14);
    }

    @OriginalMember(owner = "client!oo", name = "f", descriptor = "(I)V", line = 476)
    public static void method3732(int arg0) {
        field9180 = null;
        field9166 = null;
        if (arg0 >= -124) {
            field9175 = -6;
        }
        field9158 = null;
    }

    @OriginalMember(owner = "client!oo", name = "a", descriptor = "(I)V", line = 511)
    public final void method2686(int arg0) {
        field9181++;
        if (arg0 != 32104) {
            this.field9164 = false;
        }
        int var2 = this.field9169.method1064((byte) 73);
        int var3 = this.field9169.field9543[var2];
        if (this.field9160 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field9160);
            this.field9169.field9543[var2] = this.field9160;
        }
        OpenGL.glBindTexture(this.field9160, this.field9177);
    }

    @OriginalMember(owner = "client!oo", name = "g", descriptor = "(I)I", line = 539)
    public final int method3733(int arg0) {
        field9157++;
        int var2 = 14 % ((arg0 + 13) / 57);
        if (class770.field10614 == this.field9179) {
            if (class67.field898 == this.field9176) {
                return 6407;
            }
            if (class12.field247 == this.field9176) {
                return 6408;
            }
            if (class539.field7574 == this.field9176) {
                return 6406;
            }
            if (class652.field9200 == this.field9176) {
                return 6409;
            }
            if (class519.field7418 == this.field9176) {
                return 6410;
            }
            if (class310.field4609 == this.field9176) {
                return 6145;
            }
        } else if (class770.field10617 == this.field9179) {
            if (class67.field898 == this.field9176) {
                return 34843;
            }
            if (class12.field247 == this.field9176) {
                return 34842;
            }
            if (class539.field7574 == this.field9176) {
                return 34844;
            }
            if (class652.field9200 == this.field9176) {
                return 34846;
            }
            if (class519.field7418 == this.field9176) {
                return 34847;
            }
            if (class310.field4609 == this.field9176) {
                return 6145;
            }
        } else if (class770.field10618 == this.field9179) {
            if (class67.field898 == this.field9176) {
                return 34837;
            }
            if (class12.field247 == this.field9176) {
                return 34836;
            }
            if (class539.field7574 == this.field9176) {
                return 34838;
            }
            if (class652.field9200 == this.field9176) {
                return 34840;
            }
            if (class519.field7418 == this.field9176) {
                return 34841;
            }
            if (class310.field4609 == this.field9176) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!oo", name = "h", descriptor = "(I)I", line = 635)
    private final int method3734(int arg0) {
        field9171++;
        int var2 = this.field9179.field10608 * this.field9176.field5077 * this.field9165;
        int var3 = 63 / ((arg0 + 17) / 45);
        return this.field9164 ? var2 * 4 / 3 : var2;
    }
}
