import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fia")
public abstract class class645 implements class101 {

    @OriginalMember(owner = "client!fia", name = "v", descriptor = "Lui;")
    private class308 field9288 = class23.field215;

    @OriginalMember(owner = "client!fia", name = "q", descriptor = "Lkca;")
    public class755 field9283;

    @OriginalMember(owner = "client!fia", name = "i", descriptor = "Z")
    private boolean field9275;

    @OriginalMember(owner = "client!fia", name = "f", descriptor = "Lmba;")
    public class643 field9272;

    @OriginalMember(owner = "client!fia", name = "e", descriptor = "I")
    private int field9271;

    @OriginalMember(owner = "client!fia", name = "u", descriptor = "Lwq;")
    public class674 field9287;

    @OriginalMember(owner = "client!fia", name = "r", descriptor = "I")
    public int field9284;

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "I")
    private int field9268;

    @OriginalMember(owner = "client!fia", name = "o", descriptor = "Llc;")
    public static class435 field9281 = new class435(115, 6);

    @OriginalMember(owner = "client!fia", name = "x", descriptor = "I")
    public static int field9290 = -1;

    @OriginalMember(owner = "client!fia", name = "p", descriptor = "I")
    public static int field9282 = 0;

    @OriginalMember(owner = "client!fia", name = "y", descriptor = "F")
    public static float field9291;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "I")
    public static int field9267;

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "I")
    public static int field9269;

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "I")
    public static int field9270;

    @OriginalMember(owner = "client!fia", name = "g", descriptor = "I")
    public static int field9273;

    @OriginalMember(owner = "client!fia", name = "h", descriptor = "I")
    public static int field9274;

    @OriginalMember(owner = "client!fia", name = "j", descriptor = "I")
    public static int field9276;

    @OriginalMember(owner = "client!fia", name = "k", descriptor = "I")
    public static int field9277;

    @OriginalMember(owner = "client!fia", name = "l", descriptor = "I")
    public static int field9278;

    @OriginalMember(owner = "client!fia", name = "m", descriptor = "I")
    public static int field9279;

    @OriginalMember(owner = "client!fia", name = "n", descriptor = "I")
    public static int field9280;

    @OriginalMember(owner = "client!fia", name = "s", descriptor = "I")
    public static int field9285;

    @OriginalMember(owner = "client!fia", name = "t", descriptor = "I")
    public static int field9286;

    @OriginalMember(owner = "client!fia", name = "w", descriptor = "[[B")
    public static byte[][] field9289;

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II)V", line = 6)
    private final void method3716(int arg0, int arg1) {
        if (arg0 != 392352200) {
            this.field9268 = 115;
        }
        this.field9272.field531 -= arg1;
        field9280++;
        this.field9272.field531 += this.method3717(6371);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(ZLui;)V", line = 20)
    public final void method616(boolean arg0, class308 arg1) {
        if (arg0) {
            this.method3719(70, 37, null, -16, 11);
        }
        field9274++;
        if (this.field9288 != arg1) {
            this.field9288 = arg1;
            this.method3722(true);
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(B)V", line = 37)
    public final void method617(byte arg0) {
        field9267++;
        int var2 = this.field9272.method198(113);
        int var3 = this.field9272.field9248[var2];
        if (this.field9284 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field9284);
            this.field9272.field9248[var2] = this.field9284;
        }
        OpenGL.glBindTexture(this.field9284, this.field9268);
        if (arg0 != 111) {
            this.field9284 = -85;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(I)I", line = 68)
    private final int method3717(int arg0) {
        field9269++;
        int var2 = this.field9283.field10513 * this.field9287.field9586 * this.field9271;
        if (arg0 != 6371) {
            this.field9272 = null;
        }
        return this.field9275 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!fia", name = "c", descriptor = "(I)V", line = 82)
    public static void method3718(int arg0) {
        field9289 = null;
        int var1 = 20 % ((-arg0 - 32) / 59);
        field9281 = null;
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(II[BII)V", line = 93)
    public final void method3719(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field9276++;
        if (arg1 > 0 && !class211.method1496(0, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class211.method1496(0, arg4)) {
            int var6 = this.field9283.field10513;
            if (arg3 < 15) {
                this.field9272 = null;
            }
            int var7 = 0;
            int var8 = arg4 > arg1 ? arg1 : arg4;
            int var9 = arg1 >> 1;
            int var10 = arg4 >> 1;
            byte[] var11 = arg2;
            byte[] var12 = new byte[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Dub(arg0, var7, this.method3720(9728), arg1, arg4, 0, class397.method2411(6145, this.field9283), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg1 * var6;
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
                            var12[var16] = (byte) (var26 >> 2);
                            var18 = var6 + var25;
                            var16 += var6;
                        }
                        var18 += var13;
                        var17 += var13;
                    }
                }
                byte[] var15 = var12;
                var12 = var11;
                var11 = var15;
                arg4 = var10;
                arg1 = var9;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fia", name = "d", descriptor = "(I)I", line = 190)
    public final int method3720(int arg0) {
        field9273++;
        if (class674.field9590 == this.field9287) {
            if (class456.field6496 == this.field9283) {
                return 6407;
            }
            if (class482.field6922 == this.field9283) {
                return 6408;
            }
            if (class315.field4259 == this.field9283) {
                return 6406;
            }
            if (class83.field1217 == this.field9283) {
                return 6409;
            }
            if (class367.field5365 == this.field9283) {
                return 6410;
            }
            if (class268.field3818 == this.field9283) {
                return 6145;
            }
        } else if (class674.field9593 == this.field9287) {
            if (class456.field6496 == this.field9283) {
                return 34843;
            }
            if (class482.field6922 == this.field9283) {
                return 34842;
            }
            if (class315.field4259 == this.field9283) {
                return 34844;
            }
            if (class83.field1217 == this.field9283) {
                return 34846;
            }
            if (class367.field5365 == this.field9283) {
                return 34847;
            }
            if (class268.field3818 == this.field9283) {
                return 6145;
            }
        } else if (class674.field9594 == this.field9287) {
            if (class456.field6496 == this.field9283) {
                return 34837;
            }
            if (class482.field6922 == this.field9283) {
                return 34836;
            }
            if (class315.field4259 == this.field9283) {
                return 34838;
            }
            if (class83.field1217 == this.field9283) {
                return 34840;
            }
            if (class367.field5365 == this.field9283) {
                return 34841;
            }
            if (class268.field3818 == this.field9283) {
                return 6145;
            }
        }
        if (arg0 != 9728) {
            this.method3717(-44);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!fia", name = "finalize", descriptor = "()V", line = 295)
    protected final void finalize() throws Throwable {
        field9270++;
        this.method3723(false);
        super.finalize();
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIII[I)V", line = 306)
    public final void method3721(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field9285++;
        if (arg0 > 0 && !class211.method1496(arg3 + 112, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 > 0 && !class211.method1496(0, arg2)) {
            throw new IllegalArgumentException("");
        } else if (class482.field6922 == this.field9283) {
            if (arg3 != -112) {
                this.field9284 = -61;
            }
            int var6 = 0;
            int var7 = arg0 >= arg2 ? arg2 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg2 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg1, var6, this.method3720(9728), arg0, arg2, 0, 32993, this.field9272.field9253, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 16 & 0xFF;
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var10[var14++];
                        int var24 = var18 & 0xFF;
                        int var25 = var18 >> 8 & 0xFF;
                        int var26 = ((var20 & 0xFFBE) >> 8) + var25;
                        int var27 = (var20 >> 24 & 0xFF) + var22;
                        int var28 = (var20 >> 16 & 0xFF) + var21;
                        int var29 = (var20 & 0xFF) + var24;
                        int var30 = (var19 & 0xFF) + var29;
                        int var31 = (var19 >> 24 & 0xFF) + var27;
                        int var32 = (var19 >> 16 & 0xFF) + var28;
                        int var33 = ((var19 & 0xFF1D) >> 8) + var26;
                        int var34 = ((var23 & 0xFFF439) >> 16) + var32;
                        int var35 = (var23 >> 24 & 0xFF) + var31;
                        int var36 = (var23 & 0xFF) + var30;
                        int var37 = (var23 >> 8 & 0xFF) + var33;
                        var11[var12++] = class430.method2658(class430.method2658(class368.method2314(65280, var37 << 6), class430.method2658(class368.method2314(var35 << 22, -16777216), class368.method2314(16711680, var34 << 14))), class368.method2314(255, var36 >> 2));
                    }
                    var13 += arg0;
                    var14 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg2 = var9;
                arg0 = var8;
                var10 = var16;
                var6++;
                var8 >>= 0x1;
                var7 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(Z)V", line = 417)
    private final void method3722(boolean arg0) {
        this.field9272.method264(this, -2);
        field9277++;
        if (class23.field215 == this.field9288) {
            OpenGL.glTexParameteri(this.field9284, 10241, this.field9275 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field9284, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field9284, 10241, this.field9275 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field9284, 10240, 9728);
        }
        if (!arg0) {
            field9282 = 107;
        }
    }

    @OriginalMember(owner = "client!fia", name = "b", descriptor = "(Z)V", line = 442)
    private final void method3723(boolean arg0) {
        field9286++;
        if (arg0) {
            this.field9287 = null;
        }
        if (this.field9268 > 0) {
            this.field9272.method3709(this.method3717(6371), this.field9268, 77);
            this.field9268 = 0;
        }
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIII[F)V", line = 462)
    public final void method3724(int arg0, int arg1, int arg2, int arg3, float[] arg4) {
        field9279++;
        if (arg3 > 0 && !class211.method1496(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class211.method1496(0, arg0)) {
            int var6 = this.field9283.field10513;
            int var7 = arg1;
            int var8 = arg3 < arg0 ? arg3 : arg0;
            int var9 = arg3 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg4;
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var7, this.method3720(9728), arg3, arg0, 0, class397.method2411(6145, this.field9283), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var13 + var14;
                    for (int var19 = 0; var19 < var10; var19++) {
                        for (int var20 = 0; var20 < var9; var20++) {
                            float var21 = var11[var17];
                            int var22 = var6 + var17;
                            float var23 = var11[var22] + var21;
                            var17 = var6 + var22;
                            float var24 = var11[var18] + var23;
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
                arg0 = var10;
                arg3 = var9;
                var8 >>= 0x1;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!fia", name = "<init>", descriptor = "(Lmba;ILkca;Lwq;IZ)V", line = 566)
    public class645(class643 arg0, int arg1, class755 arg2, class674 arg3, int arg4, boolean arg5) {
        this.field9283 = arg2;
        this.field9275 = arg5;
        this.field9272 = arg0;
        this.field9271 = arg4;
        this.field9287 = arg3;
        this.field9284 = arg1;
        OpenGL.glGenTextures(1, class591.field8405, 0);
        this.field9268 = class591.field8405[0];
        this.method3722(true);
        this.method3716(392352200, 0);
    }

    @OriginalMember(owner = "client!fia", name = "a", descriptor = "(IIILcs;IIIIILcs;)V", line = 585)
    public static final void method3725(int arg0, int arg1, int arg2, class335 arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class335 arg9) {
        field9278++;
        int var10 = arg3.method2064(88);
        if (var10 == -1) {
            return;
        }
        Object var11 = null;
        class515 var12 = (class515) class572.field8248.method2216(0, (long) var10);
        if (var12 == null) {
            class676[] var13 = class676.method3846(class603.field8548, var10, 0);
            if (var13 == null) {
                return;
            }
            var12 = class211.field3164.method202(var13[0], true);
            class572.field8248.method2213((byte) -16, (long) var10, var12);
        }
        if (arg7 < 64) {
            method3718(36);
        }
        class603.method3514(arg9.field3920, arg4, 0, arg8, arg9.method2053(true) * 256, arg1 >> 1, arg9.field3916, false, arg9.field3923, arg5 >> 1);
        int var14 = class90.field1273[0] + arg6 - 18;
        int var15 = arg2 + class90.field1273[1] - 70;
        int var16 = arg0 / 4 * 18 + var14;
        int var17 = arg0 % 4 * 18 + var15;
        var12.method3128(var16, var17);
        if (arg3 == arg9) {
            class211.field3164.method3261(var16 - 1, var17 + -1, -21307, 18, 18, -256);
        }
        class545.method3277(var16 - 1, var17 + -1, var16 + 18, -97, var17 + 18);
        class175 var18 = class83.method673(105);
        var18.field2452 = var16;
        var18.field2458 = arg3;
        var18.field2454 = var17 + 16;
        var18.field2456 = var16 + 16;
        var18.field2453 = var17;
        class597.field8488.method1521(var18, -24256);
    }
}
