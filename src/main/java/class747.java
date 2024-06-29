import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hda")
public abstract class class747 implements class357 {

    @OriginalMember(owner = "client!hda", name = "t", descriptor = "Lria;")
    private class287 field10354 = class545.field7515;

    @OriginalMember(owner = "client!hda", name = "i", descriptor = "I")
    private int field10343;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "Lbga;")
    public class358 field10335;

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "Lwq;")
    public class169 field10337;

    @OriginalMember(owner = "client!hda", name = "g", descriptor = "Lbaa;")
    public class523 field10341;

    @OriginalMember(owner = "client!hda", name = "r", descriptor = "Z")
    private boolean field10352;

    @OriginalMember(owner = "client!hda", name = "l", descriptor = "I")
    public int field10346;

    @OriginalMember(owner = "client!hda", name = "o", descriptor = "I")
    private int field10349;

    @OriginalMember(owner = "client!hda", name = "h", descriptor = "J")
    public static long field10342 = -1L;

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "I")
    public static int field10336;

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "I")
    public static int field10338;

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "I")
    public static int field10339;

    @OriginalMember(owner = "client!hda", name = "f", descriptor = "I")
    public static int field10340;

    @OriginalMember(owner = "client!hda", name = "k", descriptor = "I")
    public static int field10345;

    @OriginalMember(owner = "client!hda", name = "m", descriptor = "I")
    public static int field10347;

    @OriginalMember(owner = "client!hda", name = "n", descriptor = "I")
    public static int field10348;

    @OriginalMember(owner = "client!hda", name = "p", descriptor = "I")
    public static int field10350;

    @OriginalMember(owner = "client!hda", name = "q", descriptor = "I")
    public static int field10351;

    @OriginalMember(owner = "client!hda", name = "s", descriptor = "I")
    public static int field10353;

    @OriginalMember(owner = "client!hda", name = "u", descriptor = "I")
    public static int field10355;

    @OriginalMember(owner = "client!hda", name = "v", descriptor = "I")
    public static int field10356;

    @OriginalMember(owner = "client!hda", name = "w", descriptor = "I")
    public static int field10357;

    @OriginalMember(owner = "client!hda", name = "j", descriptor = "[I")
    public static int[] field10344;

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(B)V")
    public final void method374(byte arg0) {
        field10357++;
        int var2 = this.field10335.method4114((byte) -126);
        if (arg0 > -21) {
            this.field10335 = null;
        }
        int var3 = this.field10335.field5178[var2];
        if (this.field10346 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field10346);
            this.field10335.field5178[var2] = this.field10346;
        }
        OpenGL.glBindTexture(this.field10346, this.field10349);
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(I)I")
    public final int method4164(int arg0) {
        field10338++;
        if (class523.field7249 == this.field10341) {
            if (class19.field290 == this.field10337) {
                return 6407;
            }
            if (class746.field10332 == this.field10337) {
                return 6408;
            }
            if (class556.field7676 == this.field10337) {
                return 6406;
            }
            if (class459.field6480 == this.field10337) {
                return 6409;
            }
            if (class16.field267 == this.field10337) {
                return 6410;
            }
            if (class726.field9831 == this.field10337) {
                return 6145;
            }
        } else if (class523.field7252 == this.field10341) {
            if (class19.field290 == this.field10337) {
                return 34843;
            }
            if (class746.field10332 == this.field10337) {
                return 34842;
            }
            if (class556.field7676 == this.field10337) {
                return 34844;
            }
            if (class459.field6480 == this.field10337) {
                return 34846;
            }
            if (class16.field267 == this.field10337) {
                return 34847;
            }
            if (class726.field9831 == this.field10337) {
                return 6145;
            }
        } else if (class523.field7253 == this.field10341) {
            if (class19.field290 == this.field10337) {
                return 34837;
            }
            if (class746.field10332 == this.field10337) {
                return 34836;
            }
            if (class556.field7676 == this.field10337) {
                return 34838;
            }
            if (class459.field6480 == this.field10337) {
                return 34840;
            }
            if (class16.field267 == this.field10337) {
                return 34841;
            }
            if (class726.field9831 == this.field10337) {
                return 6145;
            }
        }
        if (arg0 <= 104) {
            this.method4174(-54, 105, 2, null, 120);
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(Z)V")
    private final void method4165(boolean arg0) {
        this.field10335.method4097((byte) 107, this);
        field10336++;
        if (class545.field7515 == this.field10354) {
            OpenGL.glTexParameteri(this.field10346, 10241, this.field10352 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field10346, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field10346, 10241, this.field10352 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field10346, 10240, 9728);
        }
        if (!arg0) {
            method4168(null, (byte) 106, true, 70);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II[BII)V")
    public final void method4166(int arg0, int arg1, byte[] arg2, int arg3, int arg4) {
        field10353++;
        if (arg1 > 0 && !class476.method2796(66, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class476.method2796(arg0 ^ 0x1CB6, arg3)) {
            int var6 = this.field10337.field2654;
            int var7 = 0;
            int var8 = arg1 < arg3 ? arg1 : arg3;
            int var9 = arg1 >> 1;
            if (arg0 != 7365) {
                this.method4172(0, (byte) -113);
            }
            int var10 = arg3 >> 1;
            byte[] var11 = arg2;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method4164(108), arg1, arg3, 0, class175.method1310(arg0 - 7265, this.field10337), 5121, var11, 0);
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
                byte[] var15 = var12;
                var12 = var11;
                arg1 = var9;
                arg3 = var10;
                var11 = var15;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var7++;
                var8 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hda", name = "d", descriptor = "(I)I")
    private final int method4167(int arg0) {
        field10348++;
        int var2 = this.field10341.field7244 * this.field10337.field2654 * this.field10343;
        if (arg0 >= -105) {
            method4168(null, (byte) 118, true, 16);
        }
        return this.field10352 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lha;BZI)Lda;")
    public static final class60 method4168(class59 arg0, byte arg1, boolean arg2, int arg3) {
        if (arg1 != -53) {
            method4173(true);
        }
        field10347++;
        class547 var4 = class615.method3491(arg3, arg0, (byte) 55, arg2);
        return var4 == null ? null : var4.field7537;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(II[III)V")
    public final void method4169(int arg0, int arg1, int[] arg2, int arg3, int arg4) {
        field10345++;
        if (arg0 > 0 && !class476.method2796(-43, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg1 > 0 && !class476.method2796(arg4 ^ 0xFFFFFF2D, arg1)) {
            throw new IllegalArgumentException("");
        } else if (class746.field10332 == this.field10337) {
            int var6 = 0;
            int var7 = arg1 <= arg0 ? arg1 : arg0;
            int var8 = arg0 >> 1;
            int var9 = arg1 >> 1;
            int[] var10 = arg2;
            int[] var11 = new int[var8 * var9];
            if (arg4 != 255) {
                this.field10352 = true;
            }
            while (true) {
                OpenGL.glTexImage2Di(arg3, var6, this.method4164(112), arg0, arg1, 0, 32993, this.field10335.field5169, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg0 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var18 >> 16 & 0xFF;
                        int var22 = var18 >> 24 & 0xFF;
                        int var23 = var18 & 0xFF;
                        int var24 = (var18 & 0xFF58) >> 8;
                        int var25 = var10[var14++];
                        int var26 = (var19 & 0xFF) + var23;
                        int var27 = ((var19 & 0xFFBA54) >> 16) + var21;
                        int var28 = (var19 >> 24 & 0xFF) + var22;
                        int var29 = (var19 >> 8 & 0xFF) + var24;
                        int var30 = (var20 >> 24 & 0xFF) + var28;
                        int var31 = (var20 & 0xFF) + var26;
                        int var32 = ((var20 & 0xFF9C) >> 8) + var29;
                        int var33 = (var20 >> 16 & 0xFF) + var27;
                        int var34 = (var25 >> 24 & 0xFF) + var30;
                        int var35 = (var25 >> 16 & 0xFF) + var33;
                        int var36 = (var25 >> 8 & 0xFF) + var32;
                        int var37 = (var25 & 0xFF) + var31;
                        var11[var12++] = class418.method2577(class418.method2577(class263.method1762(var36 << 6, 65280), class418.method2577(class263.method1762(var34, 1020) << 22, class263.method1762(1020, var35) << 14)), class263.method1762(255, var37 >> 2));
                    }
                    var13 += arg0;
                    var14 += arg0;
                }
                int[] var16 = var11;
                var11 = var10;
                arg1 = var9;
                var10 = var16;
                arg0 = var8;
                var8 >>= 0x1;
                var6++;
                var7 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hda", name = "e", descriptor = "(I)V")
    private final void method4170(int arg0) {
        if (arg0 != 1617553025) {
            return;
        }
        if (this.field10349 > 0) {
            this.field10335.method2254(this.method4167(-109), (byte) 59, this.field10349);
            this.field10349 = 0;
        }
        field10350++;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(IB)V")
    public static final void method4171(int arg0, byte arg1) {
        field10340++;
        if (arg0 == -1 || !class609.field8353[arg0]) {
            return;
        }
        class732.field9887.method864(arg0, -120);
        class396.field5798[arg0] = null;
        class605.field8299[arg0] = null;
        if (arg1 <= -94) {
            class609.field8353[arg0] = false;
        }
    }

    @OriginalMember(owner = "client!hda", name = "b", descriptor = "(IB)V")
    private final void method4172(int arg0, byte arg1) {
        field10351++;
        this.field10335.field10176 -= arg0;
        this.field10335.field10176 += this.method4167(-119);
        if (arg1 >= -124) {
            this.field10352 = false;
        }
    }

    @OriginalMember(owner = "client!hda", name = "c", descriptor = "(Z)V")
    public static void method4173(boolean arg0) {
        if (arg0) {
            field10342 = -54L;
        }
        field10344 = null;
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(Lria;I)V")
    public final void method376(class287 arg0, int arg1) {
        field10339++;
        if (arg1 != -22095) {
            this.field10337 = null;
        }
        if (this.field10354 != arg0) {
            this.field10354 = arg0;
            this.method4165(true);
        }
    }

    @OriginalMember(owner = "client!hda", name = "a", descriptor = "(III[FI)V")
    public final void method4174(int arg0, int arg1, int arg2, float[] arg3, int arg4) {
        field10355++;
        if (arg2 > 0 && !class476.method2796(100, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class476.method2796(arg1 + 109, arg4)) {
            int var6 = this.field10337.field2654;
            int var7 = 0;
            if (arg1 != 1) {
                this.method4164(107);
            }
            int var8 = arg2 < arg4 ? arg2 : arg4;
            int var9 = arg2 >> 1;
            int var10 = arg4 >> 1;
            float[] var11 = arg3;
            float[] var12 = new float[var6 * var10 * var9];
            while (true) {
                OpenGL.glTexImage2Df(arg0, var7, this.method4164(123), arg2, arg4, 0, class175.method1310(124, this.field10337), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
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
                arg2 = var9;
                arg4 = var10;
                var11 = var15;
                var9 >>= 0x1;
                var10 >>= 0x1;
                var8 >>= 0x1;
                var7++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!hda", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field10356++;
        this.method4170(1617553025);
        super.finalize();
    }

    @OriginalMember(owner = "client!hda", name = "<init>", descriptor = "(Lbga;ILwq;Lbaa;IZ)V")
    public class747(class358 arg0, int arg1, class169 arg2, class523 arg3, int arg4, boolean arg5) {
        this.field10343 = arg4;
        this.field10335 = arg0;
        this.field10337 = arg2;
        this.field10341 = arg3;
        this.field10352 = arg5;
        this.field10346 = arg1;
        OpenGL.glGenTextures(1, class119.field2021, 0);
        this.field10349 = class119.field2021[0];
        this.method4165(true);
        this.method4172(0, (byte) -126);
    }
}
