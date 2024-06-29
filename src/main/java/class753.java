import jaggl.OpenGL;
import java.awt.Color;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rl")
public abstract class class753 implements class416 {

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "Lws;")
    private class379 field10380 = class782.field10751;

    @OriginalMember(owner = "client!rl", name = "m", descriptor = "Loia;")
    public class97 field10392;

    @OriginalMember(owner = "client!rl", name = "q", descriptor = "I")
    public int field10396;

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "I")
    private int field10384;

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "Lul;")
    public class599 field10382;

    @OriginalMember(owner = "client!rl", name = "k", descriptor = "Lso;")
    public class497 field10390;

    @OriginalMember(owner = "client!rl", name = "i", descriptor = "Z")
    private boolean field10388;

    @OriginalMember(owner = "client!rl", name = "o", descriptor = "I")
    private int field10394;

    @OriginalMember(owner = "client!rl", name = "s", descriptor = "I")
    public static int field10398 = 0;

    @OriginalMember(owner = "client!rl", name = "l", descriptor = "[Ljava/awt/Color;")
    public static Color[] field10391 = new Color[] { new Color(9179409), new Color(16777215), new Color(16726277), new Color(16726277) };

    @OriginalMember(owner = "client!rl", name = "x", descriptor = "Z")
    public static boolean field10403 = false;

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "I")
    public static int field10381;

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "I")
    public static int field10383;

    @OriginalMember(owner = "client!rl", name = "f", descriptor = "I")
    public static int field10385;

    @OriginalMember(owner = "client!rl", name = "g", descriptor = "I")
    public static int field10386;

    @OriginalMember(owner = "client!rl", name = "j", descriptor = "I")
    public static int field10389;

    @OriginalMember(owner = "client!rl", name = "n", descriptor = "I")
    public static int field10393;

    @OriginalMember(owner = "client!rl", name = "p", descriptor = "I")
    public static int field10395;

    @OriginalMember(owner = "client!rl", name = "r", descriptor = "I")
    public static int field10397;

    @OriginalMember(owner = "client!rl", name = "t", descriptor = "I")
    public static int field10399;

    @OriginalMember(owner = "client!rl", name = "u", descriptor = "I")
    public static int field10400;

    @OriginalMember(owner = "client!rl", name = "w", descriptor = "I")
    public static int field10402;

    @OriginalMember(owner = "client!rl", name = "h", descriptor = "Lnf;")
    public static class604 field10387;

    @OriginalMember(owner = "client!rl", name = "v", descriptor = "[Lsw;")
    public static class787[] field10401;

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(Lws;B)V")
    public final void method2034(class379 arg0, byte arg1) {
        if (arg1 < 27) {
            this.method4176(null, 113, -114, -60, false);
        }
        if (this.field10380 != arg0) {
            this.field10380 = arg0;
            this.method4179(92);
        }
        field10385++;
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(BI)V")
    private final void method4173(byte arg0, int arg1) {
        this.field10392.field7668 -= arg1;
        field10400++;
        int var3 = 24 / ((arg0 - 90) / 34);
        this.field10392.field7668 += this.method4174((byte) -68);
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(B)I")
    private final int method4174(byte arg0) {
        if (arg0 > -17) {
            this.field10392 = null;
        }
        field10395++;
        int var2 = this.field10390.field6795 * this.field10384 * this.field10382.field8381;
        return this.field10388 ? var2 * 4 / 3 : var2;
    }

    @OriginalMember(owner = "client!rl", name = "b", descriptor = "(I)V")
    public static void method4175(int arg0) {
        field10391 = null;
        if (arg0 == -18009) {
            field10387 = null;
            field10401 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([BIIIZ)V")
    public final void method4176(byte[] arg0, int arg1, int arg2, int arg3, boolean arg4) {
        field10386++;
        if (arg1 > 0 && !class461.method2656(0, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 <= 0 || class461.method2656(0, arg3)) {
            int var6 = this.field10382.field8381;
            int var7 = 0;
            int var8 = arg1 >= arg3 ? arg3 : arg1;
            if (!arg4) {
                int var9 = arg1 >> 1;
                int var10 = arg3 >> 1;
                byte[] var11 = arg0;
                byte[] var12 = new byte[var9 * var10 * var6];
                while (true) {
                    OpenGL.glTexImage2Dub(arg2, var7, this.method4178(6409), arg1, arg3, 0, class298.method1917(-112, this.field10382), 5121, var11, 0);
                    if (var8 <= 1) {
                        return;
                    }
                    int var13 = arg1 * var6;
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
                    arg3 = var10;
                    var11 = var14;
                    arg1 = var9;
                    var9 >>= 0x1;
                    var8 >>= 0x1;
                    var10 >>= 0x1;
                    var7++;
                }
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        field10389++;
        this.method4181(36);
        super.finalize();
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(B)V")
    public final void method2033(byte arg0) {
        field10402++;
        int var2 = this.field10392.method3111(arg0 + 40);
        int var3 = this.field10392.field1591[var2];
        if (this.field10396 != var3) {
            if (var3 != 0) {
                OpenGL.glBindTexture(var3, 0);
                OpenGL.glDisable(var3);
            }
            OpenGL.glEnable(this.field10396);
            this.field10392.field1591[var2] = this.field10396;
        }
        OpenGL.glBindTexture(this.field10396, this.field10394);
        if (arg0 != -40) {
            field10391 = null;
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "([IIIII)V")
    public final void method4177(int[] arg0, int arg1, int arg2, int arg3, int arg4) {
        field10399++;
        if (arg1 > 0 && !class461.method2656(0, arg1)) {
            throw new IllegalArgumentException("");
        } else if (arg3 > 0 && !class461.method2656(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (class530.field7176 == this.field10382) {
            int var6 = 0;
            int var7 = arg3 > arg1 ? arg1 : arg3;
            int var8 = arg1 >> 1;
            int var9 = arg3 >> 1;
            int[] var10 = arg0;
            if (arg4 != 1) {
                field10401 = null;
            }
            int[] var11 = new int[var8 * var9];
            while (true) {
                OpenGL.glTexImage2Di(arg2, var6, this.method4178(6409), arg1, arg3, 0, 32993, this.field10392.field1590, var10, 0);
                if (var7 <= 1) {
                    return;
                }
                int var12 = 0;
                int var13 = 0;
                int var14 = arg1 + var13;
                for (int var15 = 0; var15 < var9; var15++) {
                    for (int var17 = 0; var17 < var8; var17++) {
                        int var18 = var10[var13++];
                        int var19 = var10[var13++];
                        int var20 = var10[var14++];
                        int var21 = var18 >> 8 & 0xFF;
                        int var22 = (var18 & 0xFFADB9) >> 16;
                        int var23 = var10[var14++];
                        int var24 = var18 & 0xFF;
                        int var25 = var18 >> 24 & 0xFF;
                        int var26 = ((var19 & 0xFF9687) >> 16) + var22;
                        int var27 = ((var19 & 0xFF9E) >> 8) + var21;
                        int var28 = (var19 >> 24 & 0xFF) + var25;
                        int var29 = (var19 & 0xFF) + var24;
                        int var30 = ((var20 & 0xFFD07C) >> 16) + var26;
                        int var31 = (var20 >> 8 & 0xFF) + var27;
                        int var32 = (var20 >> 24 & 0xFF) + var28;
                        int var33 = (var20 & 0xFF) + var29;
                        int var34 = (var23 & 0xFF) + var33;
                        int var35 = ((var23 & 0xFF8536) >> 16) + var30;
                        int var36 = (var23 >> 24 & 0xFF) + var32;
                        int var37 = ((var23 & 0xFF4F) >> 8) + var31;
                        var11[var12++] = class530.method3011(class530.method3011(class204.method1456(65280, var37 << 6), class530.method3011(class204.method1456(16711680, var35 << 14), class204.method1456(var36 << 22, -16777216))), class204.method1456(255, var34 >> 2));
                    }
                    var13 += arg1;
                    var14 += arg1;
                }
                int[] var16 = var11;
                var11 = var10;
                var10 = var16;
                arg1 = var8;
                arg3 = var9;
                var6++;
                var7 >>= 0x1;
                var8 >>= 0x1;
                var9 >>= 0x1;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!rl", name = "c", descriptor = "(I)I")
    public final int method4178(int arg0) {
        if (arg0 != 6409) {
            return -31;
        }
        field10381++;
        if (class497.field6799 == this.field10390) {
            if (class320.field4368 == this.field10382) {
                return 6407;
            }
            if (class530.field7176 == this.field10382) {
                return 6408;
            }
            if (class485.field6566 == this.field10382) {
                return 6406;
            }
            if (class14.field216 == this.field10382) {
                return 6409;
            }
            if (class159.field2562 == this.field10382) {
                return 6410;
            }
            if (class707.field9721 == this.field10382) {
                return 6145;
            }
        } else if (class497.field6802 == this.field10390) {
            if (class320.field4368 == this.field10382) {
                return 34843;
            }
            if (class530.field7176 == this.field10382) {
                return 34842;
            }
            if (class485.field6566 == this.field10382) {
                return 34844;
            }
            if (class14.field216 == this.field10382) {
                return 34846;
            }
            if (class159.field2562 == this.field10382) {
                return 34847;
            }
            if (class707.field9721 == this.field10382) {
                return 6145;
            }
        } else if (class497.field6803 == this.field10390) {
            if (class320.field4368 == this.field10382) {
                return 34837;
            }
            if (class530.field7176 == this.field10382) {
                return 34836;
            }
            if (class485.field6566 == this.field10382) {
                return 34838;
            }
            if (class14.field216 == this.field10382) {
                return 34840;
            }
            if (class159.field2562 == this.field10382) {
                return 34841;
            }
            if (class707.field9721 == this.field10382) {
                return 6145;
            }
        }
        throw new IllegalStateException();
    }

    @OriginalMember(owner = "client!rl", name = "d", descriptor = "(I)V")
    private final void method4179(int arg0) {
        int var2 = -119 % ((-arg0 - 45) / 62);
        field10397++;
        this.field10392.method3090(this, (byte) 66);
        if (class782.field10751 == this.field10380) {
            OpenGL.glTexParameteri(this.field10396, 10241, this.field10388 ? 9987 : 9729);
            OpenGL.glTexParameteri(this.field10396, 10240, 9729);
        } else {
            OpenGL.glTexParameteri(this.field10396, 10241, this.field10388 ? 9984 : 9728);
            OpenGL.glTexParameteri(this.field10396, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!rl", name = "a", descriptor = "(II[FII)V")
    public final void method4180(int arg0, int arg1, float[] arg2, int arg3, int arg4) {
        field10383++;
        if (arg0 != 34836) {
            this.method2033((byte) -37);
        }
        if (arg3 > 0 && !class461.method2656(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg1 <= 0 || class461.method2656(0, arg1)) {
            int var6 = this.field10382.field8381;
            int var7 = 0;
            int var8 = arg1 <= arg3 ? arg1 : arg3;
            int var9 = arg3 >> 1;
            int var10 = arg1 >> 1;
            float[] var11 = arg2;
            float[] var12 = new float[var9 * var10 * var6];
            while (true) {
                OpenGL.glTexImage2Df(arg4, var7, this.method4178(6409), arg3, arg1, 0, class298.method1917(-98, this.field10382), 5126, var11, 0);
                if (var8 <= 1) {
                    return;
                }
                int var13 = arg3 * var6;
                for (int var14 = 0; var14 < var6; var14++) {
                    int var16 = var14;
                    int var17 = var14;
                    int var18 = var14 + var13;
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
                arg1 = var10;
                arg3 = var9;
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

    @OriginalMember(owner = "client!rl", name = "e", descriptor = "(I)V")
    private final void method4181(int arg0) {
        field10393++;
        if (arg0 < 28) {
            field10391 = null;
        }
        if (this.field10394 > 0) {
            this.field10392.method832((byte) -53, this.field10394, this.method4174((byte) -60));
            this.field10394 = 0;
        }
    }

    @OriginalMember(owner = "client!rl", name = "<init>", descriptor = "(Loia;ILul;Lso;IZ)V")
    public class753(class97 arg0, int arg1, class599 arg2, class497 arg3, int arg4, boolean arg5) {
        this.field10392 = arg0;
        this.field10396 = arg1;
        this.field10384 = arg4;
        this.field10382 = arg2;
        this.field10390 = arg3;
        this.field10388 = arg5;
        OpenGL.glGenTextures(1, class70.field1038, 0);
        this.field10394 = class70.field1038[0];
        this.method4179(-117);
        this.method4173((byte) -36, 0);
    }
}
