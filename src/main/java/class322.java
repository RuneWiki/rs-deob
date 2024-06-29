import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jp")
public abstract class class322 implements class155 {

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "Lup;")
    private class249 field4173 = class17.field146;

    @OriginalMember(owner = "client!jp", name = "u", descriptor = "Lnb;")
    public class271 field4193;

    @OriginalMember(owner = "client!jp", name = "k", descriptor = "Lnfa;")
    public class621 field4183;

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "Z")
    private boolean field4175;

    @OriginalMember(owner = "client!jp", name = "r", descriptor = "I")
    public int field4190;

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "Lvj;")
    public class402 field4176;

    @OriginalMember(owner = "client!jp", name = "l", descriptor = "I")
    private int field4184;

    @OriginalMember(owner = "client!jp", name = "g", descriptor = "I")
    private int field4179;

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "I")
    public static int field4174;

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "I")
    public static int field4177;

    @OriginalMember(owner = "client!jp", name = "f", descriptor = "I")
    public static int field4178;

    @OriginalMember(owner = "client!jp", name = "h", descriptor = "I")
    public static int field4180;

    @OriginalMember(owner = "client!jp", name = "i", descriptor = "I")
    public static int field4181;

    @OriginalMember(owner = "client!jp", name = "j", descriptor = "I")
    public static int field4182;

    @OriginalMember(owner = "client!jp", name = "m", descriptor = "I")
    public static int field4185;

    @OriginalMember(owner = "client!jp", name = "n", descriptor = "I")
    public static int field4186;

    @OriginalMember(owner = "client!jp", name = "o", descriptor = "I")
    public static int field4187;

    @OriginalMember(owner = "client!jp", name = "p", descriptor = "I")
    public static int field4188;

    @OriginalMember(owner = "client!jp", name = "q", descriptor = "I")
    public static int field4189;

    @OriginalMember(owner = "client!jp", name = "s", descriptor = "I")
    public static int field4191;

    @OriginalMember(owner = "client!jp", name = "t", descriptor = "I")
    public static int field4192;

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IZIBI)V")
    public static final void method1815(int arg0, boolean arg1, int arg2, byte arg3, int arg4) {
        if (arg3 == -31) {
            field4174++;
            if (class315.method1784(arg4, 4269)) {
                class509.method2926(arg0, arg1, arg2, class271.field3434[arg4], 106, -1);
            }
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(II)V")
    private final void method1816(int arg0, int arg1) {
        this.field4183.field6775 -= arg0;
        field4187++;
        this.field4183.field6775 += this.method1820(-126);
        if (arg1 != 1) {
            this.field4190 = -61;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(B)V")
    private final void method1817(byte arg0) {
        field4188++;
        if (this.field4179 > 0) {
            this.field4183.method3484(this.method1820(-126), (byte) -110, this.field4179);
            this.field4179 = 0;
        }
        if (arg0 != -115) {
            this.field4176 = null;
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIII[I)V")
    public final void method1818(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
        field4192++;
        if (arg3 > 0 && !class644.method3612(false, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg0 > 0 && !class644.method3612(false, arg0)) {
            throw new IllegalArgumentException("");
        } else if (class581.field8260 == this.field4176) {
            int var6 = 0;
            int var7 = arg0 <= arg3 ? arg0 : arg3;
            int var8 = arg3 >> 1;
            int var9 = arg0 >> 1;
            int[] var10 = arg4;
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method1819((byte) -111), arg3, arg0, 0, 32993, this.field4183.field8814, var10, 0);
                if (var7 <= 1) {
                    if (arg1 != -2061612424) {
                        this.method1821(null, -81, 53, (byte) -118, 32);
                        return;
                    }
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = var13 + arg3;
                int[] var15 = var11;
                for (int var16 = 0; var16 < var9; var16++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var14++];
                        int var20 = var10[var13++];
                        int var21 = var18 >> 8 & 0xFF;
                        int var22 = var10[var14++];
                        int var23 = var18 & 0xFF;
                        int var24 = (var18 & 0xFF3AAF) >> 16;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = (var20 >> 24 & 0xFF) + var25;
                        int var27 = ((var20 & 0xFF1F47) >> 16) + var24;
                        int var28 = (var20 & 0xFF) + var23;
                        int var29 = ((var20 & 0xFF76) >> 8) + var21;
                        int var30 = (var19 >> 24 & 0xFF) + var26;
                        int var31 = (var19 & 0xFF) + var28;
                        int var32 = (var19 >> 16 & 0xFF) + var27;
                        int var33 = (var19 >> 8 & 0xFF) + var29;
                        int var34 = ((var22 & 0xFFCD) >> 8) + var33;
                        int var35 = (var22 & 0xFF) + var31;
                        int var36 = (var22 >> 16 & 0xFF) + var32;
                        int var37 = (var22 >> 24 & 0xFF) + var30;
                        var11[var12++] = class139.method776(class139.method776(class139.method776(class203.method1246(1020, var36) << 14, class203.method1246(var37, 1020) << 22), class203.method1246(65280, var34 << 6)), class203.method1246(var35, 1020) >> 2);
                    }
                    var14 += arg3;
                    var13 += arg3;
                }
                var11 = var10;
                var10 = var15;
                arg0 = var9;
                arg3 = var8;
                var9 >>= 0x1;
                var6++;
                var8 >>= 0x1;
                var7 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jp", name = "b", descriptor = "(B)I")
    public final int method1819(byte arg0) {
        field4178++;
        int var2 = -14 % ((-arg0 - 67) / 34);
        if (class271.field3429 == this.field4193) {
            if (class181.field2225 == this.field4176) {
                return 6407;
            }
            if (class581.field8260 == this.field4176) {
                return 6408;
            }
            if (class595.field8446 == this.field4176) {
                return 6406;
            }
            if (class301.field3936 == this.field4176) {
                return 6409;
            }
            if (class234.field2984 == this.field4176) {
                return 6410;
            }
            if (class624.field8841 == this.field4176) {
                return 6145;
            }
        } else if (class271.field3432 == this.field4193) {
            if (class181.field2225 == this.field4176) {
                return 34843;
            }
            if (class581.field8260 == this.field4176) {
                return 34842;
            }
            if (class595.field8446 == this.field4176) {
                return 34844;
            }
            if (class301.field3936 == this.field4176) {
                return 34846;
            }
            if (class234.field2984 == this.field4176) {
                return 34847;
            }
            if (class624.field8841 == this.field4176) {
                return 6145;
            }
        } else if (class271.field3433 == this.field4193) {
            if (class181.field2225 == this.field4176) {
                return 34837;
            }
            if (class581.field8260 == this.field4176) {
                return 34836;
            }
            if (class595.field8446 == this.field4176) {
                return 34838;
            }
            if (class301.field3936 == this.field4176) {
                return 34840;
            }
            if (class234.field2984 == this.field4176) {
                return 34841;
            }
            if (class624.field8841 == this.field4176) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!jp", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1817((byte) -115);
        field4182++;
        super.finalize();
    }

    @OriginalMember(owner = "client!jp", name = "e", descriptor = "(I)I")
    private final int method1820(int arg0) {
        field4185++;
        int var2 = 103 / ((arg0 + 62) / 61);
        int var3 = this.field4176.field5354 * this.field4184 * this.field4193.field3426;
        return this.field4175 ? var3 * 4 / 3 : var3;
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "([BIIBI)V")
    public final void method1821(byte[] arg0, int arg1, int arg2, byte arg3, int arg4) {
        if (arg3 != -52) {
            this.field4179 = -26;
        }
        field4180++;
        if (arg2 > 0 && !class644.method3612(false, arg2)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class644.method3612(false, arg1)) {
            int var6 = this.field4176.field5354;
            int var7 = 0;
            int var8 = arg2 < arg1 ? arg2 : arg1;
            int var9 = arg2 >> 1;
            int var10 = arg1 >> 1;
            byte[] var11 = arg0;
            byte[] var12 = new byte[var6 * var9 * var10];
            while (true) {
                OpenGL.glTexImage2Dub(arg4, var7, this.method1819((byte) 46), arg2, arg1, 0, class590.method3313((byte) 71, this.field4176), 5121, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg2 * var6;
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
                var12 = var11;
                arg1 = var10;
                arg2 = var9;
                var11 = var14;
                var8 >>= 0x1;
                var7++;
                var10 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jp", name = "c", descriptor = "(B)V")
    private final void method1822(byte arg0) {
        if (arg0 != 58) {
            this.method1821(null, 58, 43, (byte) 14, 100);
        }
        this.field4183.method2696(arg0 - 60, this);
        field4181++;
        if (class17.field146 == this.field4173) {
            OpenGL.glTexParameteri(this.field4190, 10241, this.field4175 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field4190, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field4190, 10241, this.field4175 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field4190, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(IIIB[F)V")
    public final void method1823(int arg0, int arg1, int arg2, byte arg3, float[] arg4) {
        field4186++;
        int var6 = 120 / ((arg3 - 8) / 62);
        if (arg0 > 0 && !class644.method3612(false, arg0)) {
            throw new IllegalArgumentException("");
        } else if (arg2 <= 0 || class644.method3612(false, arg2)) {
            int var7 = this.field4176.field5354;
            int var8 = 0;
            int var9 = arg0 < arg2 ? arg0 : arg2;
            int var10 = arg0 >> 1;
            int var11 = arg2 >> 1;
            float[] var12 = arg4;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                OpenGL.glTexImage2Df(arg1, var8, this.method1819((byte) -121), arg0, arg2, 0, class590.method3313((byte) 71, this.field4176), 5126, var12, 0);
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg0 * var7;
                float[] var15 = var13;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var16 + var14;
                    for (int var20 = 0; var20 < var11; var20++) {
                        for (int var21 = 0; var21 < var10; var21++) {
                            float var22 = var12[var18];
                            int var23 = var7 + var18;
                            float var24 = var12[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var12[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var12[var26] + var25;
                            var13[var17] = var27 * 0.25F;
                            var19 = var7 + var26;
                            var17 += var7;
                        }
                        var19 += var14;
                        var18 += var14;
                    }
                }
                var13 = var12;
                var12 = var15;
                arg2 = var11;
                arg0 = var10;
                var8++;
                var9 >>= 0x1;
                var11 >>= 0x1;
                var10 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!jp", name = "a", descriptor = "(ILup;)V")
    public final void method842(int arg0, class249 arg1) {
        if (this.field4173 != arg1) {
            this.field4173 = arg1;
            this.method1822((byte) 58);
        }
        if (arg0 == 16327) {
            field4191++;
        }
    }

    @OriginalMember(owner = "client!jp", name = "<init>", descriptor = "(Lnfa;ILvj;Lnb;IZ)V")
    public class322(class621 arg0, int arg1, class402 arg2, class271 arg3, int arg4, boolean arg5) {
        this.field4193 = arg3;
        this.field4183 = arg0;
        this.field4175 = arg5;
        this.field4190 = arg1;
        this.field4176 = arg2;
        this.field4184 = arg4;
        OpenGL.glGenTextures(1, class613.field8658, 0);
        this.field4179 = class613.field8658[0];
        this.method1822((byte) 58);
        this.method1816(0, 1);
    }

    @OriginalMember(owner = "client!jp", name = "d", descriptor = "(I)V")
    public final void method841(int arg0) {
        field4177++;
        int var2 = this.field4183.method2688(0);
        int var3 = this.field4183.field8813[var2];
        if (this.field4190 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field4190);
            this.field4183.field8813[var2] = this.field4190;
        }
        OpenGL.glBindTexture(this.field4190, this.field4179);
        if (arg0 > -124) {
            this.field4173 = null;
        }
    }
}
