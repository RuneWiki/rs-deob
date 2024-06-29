import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kk")
public class class128 extends class446 {

    @OriginalMember(owner = "client!kk", name = "h", descriptor = "Z")
    private boolean field2178 = false;

    @OriginalMember(owner = "client!kk", name = "r", descriptor = "Z")
    private boolean field2188;

    @OriginalMember(owner = "client!kk", name = "l", descriptor = "[Ldl;")
    private class46[] field2182;

    @OriginalMember(owner = "client!kk", name = "s", descriptor = "[I")
    public static int[] field2189 = new int[] { 160, 192, 80, 96, 0, 144, 80, 48, 160 };

    @OriginalMember(owner = "client!kk", name = "f", descriptor = "I")
    public static int field2176;

    @OriginalMember(owner = "client!kk", name = "g", descriptor = "I")
    public static int field2177;

    @OriginalMember(owner = "client!kk", name = "i", descriptor = "I")
    public static int field2179;

    @OriginalMember(owner = "client!kk", name = "j", descriptor = "I")
    public static int field2180;

    @OriginalMember(owner = "client!kk", name = "k", descriptor = "I")
    public static int field2181;

    @OriginalMember(owner = "client!kk", name = "n", descriptor = "I")
    public static int field2184;

    @OriginalMember(owner = "client!kk", name = "o", descriptor = "I")
    public static int field2185;

    @OriginalMember(owner = "client!kk", name = "p", descriptor = "I")
    public static int field2186;

    @OriginalMember(owner = "client!kk", name = "q", descriptor = "I")
    public static int field2187;

    @OriginalMember(owner = "client!kk", name = "t", descriptor = "I")
    public static int field2190;

    @OriginalMember(owner = "client!kk", name = "m", descriptor = "Ltm;")
    private class267 field2183;

    @OriginalMember(owner = "client!kk", name = "b", descriptor = "(I)V", line = 3)
    public final void method688(int arg0) {
        if (arg0 <= 5) {
            this.field2183 = null;
        }
        if (this.field2178) {
            if (!this.field2188) {
                super.field6642.method392((byte) 106, 2);
                super.field6642.method381((byte) 28, (class381) null);
            }
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, (class381) null);
            super.field6642.method392((byte) 106, 0);
            this.field2183.method1702(-82, '\u0001');
            this.field2178 = false;
        } else {
            super.field6642.method325(5890, 5126, 770, 0);
        }
        ++field2185;
        super.field6642.method426(8448, 8448, -24610);
    }

    @OriginalMember(owner = "client!kk", name = "<init>", descriptor = "(Lda;)V", line = 31)
    public class128(class44 arg0) {
        super(arg0);
        if (arg0.field935) {
            this.field2188 = arg0.field843 < 3;
            int var2 = this.field2188 ? 48 : 127;
            byte[][] var3 = new byte[6][4096];
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            int var6 = 0;
            for (int var7 = 0; ~var7 > -65; ++var7) {
                for (int var8 = 0; ~var8 > -65; ++var8) {
                    float var9 = (float) var8 * 2.0F / 64.0F - 1.0F;
                    float var10 = (float) var7 * 2.0F / 64.0F + -1.0F;
                    float var11 = (float) (1.0D / Math.sqrt((double) (var10 * var10 + var9 * var9 + 1.0F)));
                    float var12 = var10 * var11;
                    float var13 = var9 * var11;
                    for (int var14 = 0; ~var14 > -7; ++var14) {
                        float var15;
                        if (~var14 == -1) {
                            var15 = -var13;
                        } else if (var14 != 1) {
                            if (var14 == 2) {
                                var15 = var12;
                            } else if (~var14 == -4) {
                                var15 = -var12;
                            } else if (var14 == 4) {
                                var15 = var11;
                            } else {
                                var15 = -var11;
                            }
                        } else {
                            var15 = var13;
                        }
                        int var16;
                        int var17;
                        int var18;
                        if (!(var15 > 0.0F)) {
                            var16 = 0;
                            var17 = 0;
                            var18 = 0;
                        } else {
                            var18 = (int) ((double) var2 * Math.pow((double) var15, 96.0D));
                            var17 = (int) (Math.pow((double) var15, 36.0D) * (double) var2);
                            var16 = (int) ((double) var2 * Math.pow((double) var15, 12.0D));
                        }
                        var4[var14][var6] = (byte) var18;
                        var5[var14][var6] = (byte) var17;
                        var3[var14][var6] = (byte) var16;
                    }
                    ++var6;
                }
            }
            this.field2182 = new class46[3];
            this.field2182[0] = new class46(super.field6642, 6406, 64, false, var4, 6406);
            this.field2182[1] = new class46(super.field6642, 6406, 64, false, var5, 6406);
            this.field2182[2] = new class46(super.field6642, 6406, 64, false, var3, 6406);
            this.method1007(true);
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(B)Z", line = 144)
    public final boolean method691(byte arg0) {
        ++field2179;
        if (arg0 != -93) {
            field2189 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(III)V", line = 161)
    public final void method689(int arg0, int arg1, int arg2) {
        if (arg0 != -1) {
            this.field2182 = null;
        }
        if (this.field2178) {
            super.field6642.method392((byte) 106, 1);
            super.field6642.method381((byte) 28, this.field2182[arg1 - 1]);
            super.field6642.method392((byte) 106, 0);
        }
        ++field2180;
    }

    @OriginalMember(owner = "client!kk", name = "c", descriptor = "(I)V", line = 180)
    public static void method1004(int arg0) {
        if (arg0 != -22845) {
            field2189 = null;
        }
        field2189 = null;
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZB)V", line = 191)
    public final void method696(boolean arg0, byte arg1) {
        if (this.field2183 != null && arg0) {
            if (!this.field2188) {
                super.field6642.method392((byte) 106, 2);
                super.field6642.method381((byte) 28, super.field6642.field923);
                super.field6642.method392((byte) 106, 0);
            }
            this.field2183.method1702(arg1 + -111, '\u0000');
            this.field2178 = true;
        } else {
            super.field6642.method325(34168, 5126, 770, 0);
        }
        if (arg1 == 42) {
            ++field2177;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(ZIIIZII)V", line = 218)
    public static final void method1005(boolean arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        if (arg1 < -42) {
            ++field2184;
            if (arg6 > arg2) {
                int var7 = (arg2 + arg6) / 2;
                int var8 = arg2;
                class255 var9 = class35.field533[var7];
                class35.field533[var7] = class35.field533[arg6];
                class35.field533[arg6] = var9;
                for (int var10 = arg2; arg6 > var10; ++var10) {
                    if (~class311.method1982(arg4, -27551, arg0, arg5, var9, arg3, class35.field533[var10]) >= -1) {
                        class255 var11 = class35.field533[var10];
                        class35.field533[var10] = class35.field533[var8];
                        class35.field533[var8++] = var11;
                    }
                }
                class35.field533[arg6] = class35.field533[var8];
                class35.field533[var8] = var9;
                method1005(arg0, -69, arg2, arg3, arg4, arg5, var8 - 1);
                method1005(arg0, -97, var8 + 1, arg3, arg4, arg5, arg6);
            }
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(BZ)V", line = 266)
    public final void method695(byte arg0, boolean arg1) {
        super.field6642.method426(8448, 7681, -24610);
        ++field2181;
        if (arg0 != -33) {
            this.field2182 = null;
        }
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IIZ)Z", line = 279)
    public static final boolean method1006(int arg0, int arg1, boolean arg2) {
        ++field2190;
        return !arg2 ? true : (class5.method33(true, arg1, arg0) | class5.method39(1447, arg1, arg0) | class408.method2529(arg0, arg1, -1)) & class33.method230(true, arg1, arg0);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(Z)V", line = 290)
    private final void method1007(boolean arg0) {
        ++field2176;
        this.field2183 = new class267(super.field6642, 2);
        this.field2183.method1699((byte) 88, 0);
        super.field6642.method392((byte) 106, 1);
        OpenGL.glTexGeni(8192, 9472, 34065);
        OpenGL.glTexGeni(8193, 9472, 34065);
        OpenGL.glTexGeni(8194, 9472, 34065);
        OpenGL.glEnable(3168);
        OpenGL.glEnable(3169);
        OpenGL.glEnable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
        OpenGL.glMatrixMode(5888);
        if (!this.field2188) {
            super.field6642.method426(7681, 8448, -24610);
            super.field6642.method412(0, 34168, 768, 116);
            super.field6642.method392((byte) 106, 2);
            super.field6642.method426(260, 7681, -24610);
            super.field6642.method412(0, 34168, 768, 74);
            super.field6642.method412(1, 34168, 770, -102);
            super.field6642.method325(34167, 5126, 770, 0);
        } else {
            super.field6642.method426(260, 7681, -24610);
            super.field6642.method412(0, 5890, 770, -39);
            super.field6642.method325(34167, 5126, 770, 0);
        }
        super.field6642.method392((byte) 106, 0);
        this.field2183.method1700(2);
        this.field2183.method1699((byte) 88, 1);
        super.field6642.method392((byte) 106, 1);
        OpenGL.glDisable(3168);
        if (!arg0) {
            this.method1007(false);
        }
        OpenGL.glDisable(3169);
        OpenGL.glDisable(3170);
        OpenGL.glMatrixMode(5890);
        OpenGL.glLoadIdentity();
        OpenGL.glMatrixMode(5888);
        if (!this.field2188) {
            super.field6642.method426(8448, 8448, -24610);
            super.field6642.method412(0, 5890, 768, 81);
            super.field6642.method392((byte) 106, 2);
            super.field6642.method426(8448, 8448, -24610);
            super.field6642.method412(0, 5890, 768, -52);
            super.field6642.method412(1, 34168, 768, -48);
            super.field6642.method325(5890, 5126, 770, 0);
        } else {
            super.field6642.method426(8448, 8448, -24610);
            super.field6642.method412(0, 5890, 768, -25);
            super.field6642.method325(5890, 5126, 770, 0);
        }
        super.field6642.method392((byte) 106, 0);
        this.field2183.method1700(2);
    }

    @OriginalMember(owner = "client!kk", name = "a", descriptor = "(IILac;)V", line = 359)
    public final void method694(int arg0, int arg1, class381 arg2) {
        ++field2186;
        super.field6642.method381((byte) 28, arg2);
        if (arg1 == 0) {
            super.field6642.method288((byte) -107, arg0);
        }
    }
}
