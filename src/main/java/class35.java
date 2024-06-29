import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vd")
public abstract class class35 implements class506 {

    @OriginalMember(owner = "client!vd", name = "v", descriptor = "Lgca;")
    private class206 field336 = class397.field5910;

    @OriginalMember(owner = "client!vd", name = "q", descriptor = "Lal;")
    public class121 field331;

    @OriginalMember(owner = "client!vd", name = "g", descriptor = "Llw;")
    public class233 field321;

    @OriginalMember(owner = "client!vd", name = "n", descriptor = "Z")
    private boolean field328;

    @OriginalMember(owner = "client!vd", name = "i", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "I")
    public int field317;

    @OriginalMember(owner = "client!vd", name = "l", descriptor = "Lom;")
    public class642 field326;

    @OriginalMember(owner = "client!vd", name = "m", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!vd", name = "j", descriptor = "Z")
    public static boolean field324 = false;

    @OriginalMember(owner = "client!vd", name = "t", descriptor = "[I")
    public static int[] field334 = new int[] { 16, 32, 64, 128 };

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "I")
    public static int field315;

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "I")
    public static int field316;

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "I")
    public static int field318;

    @OriginalMember(owner = "client!vd", name = "e", descriptor = "I")
    public static int field319;

    @OriginalMember(owner = "client!vd", name = "f", descriptor = "I")
    public static int field320;

    @OriginalMember(owner = "client!vd", name = "h", descriptor = "I")
    public static int field322;

    @OriginalMember(owner = "client!vd", name = "k", descriptor = "I")
    public static int field325;

    @OriginalMember(owner = "client!vd", name = "o", descriptor = "I")
    public static int field329;

    @OriginalMember(owner = "client!vd", name = "p", descriptor = "I")
    public static int field330;

    @OriginalMember(owner = "client!vd", name = "s", descriptor = "I")
    public static int field333;

    @OriginalMember(owner = "client!vd", name = "u", descriptor = "I")
    public static int field335;

    @OriginalMember(owner = "client!vd", name = "r", descriptor = "Lda;")
    public static class400 field332;

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(II)V", line = 3)
    private final void method193(int arg0, int arg1) {
        this.field326.field550 -= arg0;
        field316++;
        this.field326.field550 += this.method194((byte) 90);
        if (arg1 < 54) {
            field334 = null;
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(B)I", line = 21)
    private final int method194(byte arg0) {
        if (arg0 == 90) {
            field325++;
            int var2 = this.field321.field3750 * this.field331.field1855 * this.field323;
            return this.field328 ? var2 * 4 / 3 : var2;
        } else {
            return -127;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I)V", line = 34)
    public final void method195(int arg0) {
        field329++;
        int var2 = 84 / ((46 - arg0) / 52);
        int var3 = this.field326.method306(1);
        int var4 = this.field326.field9177[var3];
        if (this.field317 != var4) {
            if (var4 != 0) {
                OpenGL.glBindTexture(var4, 0);
                OpenGL.glDisable(var4);
            }
            OpenGL.glEnable(this.field317);
            this.field326.field9177[var3] = this.field317;
        }
        OpenGL.glBindTexture(this.field317, this.field327);
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IBII[F)V", line = 62)
    public final void method196(int arg0, byte arg1, int arg2, int arg3, float[] arg4) {
        field335++;
        if (arg3 > 0 && !class668.method3743((byte) -124, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 <= 0 || class668.method3743((byte) -120, arg0)) {
            int var6 = this.field321.field3750;
            int var7 = 0;
            int var8 = arg0 <= arg3 ? arg0 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg0 >> 1;
            float[] var11 = arg4;
            if (arg1 != 120) {
                field334 = null;
            }
            float[] var12 = new float[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Df(arg2, var7, this.method203(120), arg3, arg0, 0, class329.method2125(this.field321, 6046), 5126, var11, 0);
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
                            float var24 = var11[var18] + var23;
                            var17 = var6 + var22;
                            int var25 = var6 + var18;
                            float var26 = var11[var25] + var24;
                            var18 = var6 + var25;
                            var12[var16] = var26 * 0.25F;
                            var16 += var6;
                        }
                        var17 += var13;
                        var18 += var13;
                    }
                }
                float[] var15 = var12;
                var12 = var11;
                arg0 = var10;
                var11 = var15;
                arg3 = var9;
                var7++;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(I)V", line = 165)
    public static void method197(int arg0) {
        field334 = null;
        if (arg0 != 255) {
            method197(84);
        }
        field332 = null;
    }

    @OriginalMember(owner = "client!vd", name = "b", descriptor = "(Z)V", line = 176)
    private final void method198(boolean arg0) {
        if (arg0) {
            this.field336 = null;
        }
        field322++;
        if (this.field327 > 0) {
            this.field326.method3630((byte) 124, this.field327, this.method194((byte) 90));
            this.field327 = 0;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(I[IIII)V", line = 195)
    public final void method199(int arg0, int[] arg1, int arg2, int arg3, int arg4) {
        field319++;
        if (arg2 > 0 && !class668.method3743((byte) -118, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class668.method3743((byte) -125, arg3)) {
            throw new IllegalArgumentException("");
        } else if (class238.field3830 == this.field321) {
            int var6 = 0;
            int var7 = arg3 > arg2 ? arg2 : arg3;
            int var8 = arg2 >> 1;
            int var9 = arg3 >> 1;
            int[] var10 = arg1;
            if (arg0 < 81) {
                this.field321 = null;
            }
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg4, var6, this.method203(114), arg2, arg3, 0, 32993, this.field326.field9175, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg2 + var13;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = (var18 & 0xFF24B2) >> 16;
                        int var22 = var10[var14++];
                        int var23 = var18 & 0xFF;
                        int var24 = var18 >> 8 & 0xFF;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = ((var19 & 0xFF9719) >> 16) + var21;
                        int var27 = (var19 & 0xFF) + var23;
                        int var28 = (var19 >> 8 & 0xFF) + var24;
                        int var29 = (var19 >> 24 & 0xFF) + var25;
                        int var30 = ((var20 & 0xFF9C7F) >> 16) + var26;
                        int var31 = (var20 & 0xFF) + var27;
                        int var32 = (var20 >> 24 & 0xFF) + var29;
                        int var33 = ((var20 & 0xFFE5) >> 8) + var28;
                        int var34 = (var22 >> 16 & 0xFF) + var30;
                        int var35 = (var22 >> 24 & 0xFF) + var32;
                        int var36 = (var22 & 0xFF) + var31;
                        int var37 = ((var22 & 0xFF8B) >> 8) + var33;
                        var11[var12++] = class112.method903(class112.method903(class636.method3603(var37 << 6, 65280), class112.method903(class636.method3603(var35, 1020) << 22, class636.method3603(1020, var34) << 14)), class636.method3603(var36 >> 2, 255));
                    }
                    var14 += arg2;
                    var13 += arg2;
                }
                var11 = var10;
                arg3 = var9;
                arg2 = var8;
                var10 = var15;
                var8 >>= 0x1;
                var6++;
                var9 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vd", name = "d", descriptor = "(B)V", line = 303)
    private final void method200(byte arg0) {
        field318++;
        this.field326.method215(8, this);
        if (class397.field5910 == this.field336) {
            OpenGL.glTexParameteri(this.field317, 10241, this.field328 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field317, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field317, 10241, this.field328 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field317, 10240, 9728);
        }
        if (arg0 > -85) {
            this.field323 = 80;
        }
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lvp;Z)V", line = 329)
    public static final void method201(class559 arg0, boolean arg1) {
        for (int var2 = arg0.field7927; var2 <= arg0.field7931; var2++) {
            for (int var3 = arg0.field7930; var3 <= arg0.field7934; var3++) {
                class114 var4 = class488.field7062[arg0.field9470][var2][var3];
                if (var4 != null) {
                    class291 var5 = var4.field1772;
                    class291 var6 = null;
                    while (var5 != null) {
                        if (var5.field4482 == arg0) {
                            if (var6 == null) {
                                var4.field1772 = var5.field4479;
                            } else {
                                var6.field4479 = var5.field4479;
                            }
                            var5.method1897(-127);
                            break;
                        }
                        var6 = var5;
                        var5 = var5.field4479;
                    }
                }
            }
        }
        if (!arg1) {
            class542.method3172(arg0);
        }
    }

    @OriginalMember(owner = "client!vd", name = "finalize", descriptor = "()V", line = 376)
    protected final void finalize() throws Throwable {
        this.method198(false);
        field330++;
        super.finalize();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(IIII[B)V", line = 390)
    public final void method202(int arg0, int arg1, int arg2, int arg3, byte[] arg4) {
        field320++;
        if (arg0 > 0 && !class668.method3743((byte) -120, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class668.method3743((byte) -119, arg3)) {
            int var6 = this.field321.field3750;
            int var7 = 0;
            int var8 = arg3 > arg0 ? arg0 : arg3;
            int var9 = arg0 >> 1;
            int var10 = arg3 >> 1;
            byte[] var11 = arg4;
            byte[] var12 = new byte[var6 * var9 * var10];
            if (arg2 != 1) {
                this.method199(-13, null, -123, 6, -109);
            }
            while (true) {
                OpenGL.glTexImage2Dub(arg1, var7, this.method203(123), arg0, arg3, 0, class329.method2125(this.field321, 6046), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg0 * var6;
                byte[] var14 = var12;
                for (int var15 = 0; var15 < var6; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var15 + var13;
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
                        var17 += var13;
                        var18 += var13;
                    }
                }
                var12 = var11;
                arg3 = var10;
                arg0 = var9;
                var11 = var14;
                var7++;
                var8 >>= 0x1;
                var9 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!vd", name = "c", descriptor = "(I)I", line = 489)
    public final int method203(int arg0) {
        if (arg0 < 110) {
            return -43;
        }
        field315++;
        if (class121.field1859 == this.field331) {
            if (class121.field1864 == this.field321) {
                return 6407;
            }
            if (class238.field3830 == this.field321) {
                return 6408;
            }
            if (class215.field3556 == this.field321) {
                return 6406;
            }
            if (class248.field3973 == this.field321) {
                return 6409;
            }
            if (class13.field129 == this.field321) {
                return 6410;
            }
            if (class651.field9246 == this.field321) {
                return 6145;
            }
        } else if (class121.field1862 == this.field331) {
            if (class121.field1864 == this.field321) {
                return 34843;
            }
            if (class238.field3830 == this.field321) {
                return 34842;
            }
            if (class215.field3556 == this.field321) {
                return 34844;
            }
            if (class248.field3973 == this.field321) {
                return 34846;
            }
            if (class13.field129 == this.field321) {
                return 34847;
            }
            if (class651.field9246 == this.field321) {
                return 6145;
            }
        } else if (class121.field1863 == this.field331) {
            if (class121.field1864 == this.field321) {
                return 34837;
            }
            if (class238.field3830 == this.field321) {
                return 34836;
            }
            if (class215.field3556 == this.field321) {
                return 34838;
            }
            if (class248.field3973 == this.field321) {
                return 34840;
            }
            if (class13.field129 == this.field321) {
                return 34841;
            }
            if (class651.field9246 == this.field321) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!vd", name = "a", descriptor = "(Lgca;I)V", line = 587)
    public final void method204(class206 arg0, int arg1) {
        field333++;
        int var3 = -43 % ((arg1 + 2) / 39);
        if (this.field336 != arg0) {
            this.field336 = arg0;
            this.method200((byte) -87);
        }
    }

    @OriginalMember(owner = "client!vd", name = "<init>", descriptor = "(Lom;ILlw;Lal;IZ)V", line = 615)
    public class35(class642 arg0, int arg1, class233 arg2, class121 arg3, int arg4, boolean arg5) {
        this.field331 = arg3;
        this.field321 = arg2;
        this.field328 = arg5;
        this.field323 = arg4;
        this.field317 = arg1;
        this.field326 = arg0;
        OpenGL.glGenTextures(1, class398.field5920, 0);
        this.field327 = class398.field5920[0];
        this.method200((byte) -90);
        this.method193(0, 108);
    }
}
