import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tp")
public abstract class class375 implements class203 {

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "Z")
    private boolean field5183 = false;

    @OriginalMember(owner = "client!tp", name = "g", descriptor = "Lfu;")
    public class42 field5186;

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "I")
    public int field5180;

    @OriginalMember(owner = "client!tp", name = "h", descriptor = "I")
    public int field5187;

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "Z")
    private boolean field5181;

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "I")
    private int field5184;

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "I")
    public int field5182;

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "[I")
    private static int[] field5185 = new int[1];

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(I)I", line = 6)
    public static final int method2290(int arg0) {
        if (arg0 == 6406) {
            return 1;
        } else if (arg0 == 6409) {
            return 1;
        } else if (arg0 == 32841) {
            return 1;
        } else if (arg0 == 6410) {
            return 2;
        } else if (arg0 == 6407) {
            return 3;
        } else if (arg0 == 6408) {
            return 4;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "()I", line = 35)
    private final int method2291() {
        int var1 = this.field5186.method381(this.field5187) * this.field5184;
        return this.field5181 ? var1 * 4 / 3 : var1;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljaggl/opengl;IIIII[F)V", line = 39)
    public static final void method2292(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg3 > 0 && !class7.method41(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class7.method41(0, arg4)) {
            int var7 = method2290(arg5);
            int var8 = 0;
            int var9 = arg3 < arg4 ? arg3 : arg4;
            int var10 = arg3 >> 1;
            int var11 = arg4 >> 1;
            float[] var12 = arg6;
            float[] var13 = new float[var10 * var11 * var7];
            while (true) {
                arg0.glTexImage2D(arg1, var8, arg2, arg3, arg4, 0, arg5, 5126, FloatBuffer.wrap(var12));
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var14 + var15;
                    for (int var19 = 0; var19 < var11; var19++) {
                        for (int var20 = 0; var20 < var10; var20++) {
                            float var21 = var12[var17];
                            int var22 = var7 + var17;
                            float var23 = var12[var22] + var21;
                            var17 = var7 + var22;
                            float var24 = var12[var18] + var23;
                            int var25 = var7 + var18;
                            float var26 = var12[var25] + var24;
                            var18 = var7 + var25;
                            var13[var16] = var26 * 0.25F;
                            var16 += var7;
                        }
                        var17 += var14;
                        var18 += var14;
                    }
                }
                float[] var27 = var13;
                var13 = var12;
                var12 = var27;
                arg3 = var10;
                arg4 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(I)I", line = 130)
    public static final int method2293(int arg0) {
        if (arg0 == 6407 || arg0 == 34843 || arg0 == 34837) {
            return 6407;
        } else if (arg0 == 6408 || arg0 == 34842 || arg0 == 34836) {
            return 6408;
        } else if (arg0 == 6406 || arg0 == 34844) {
            return 6406;
        } else if (arg0 == 6409 || arg0 == 34846) {
            return 6409;
        } else if (arg0 == 6410 || arg0 == 34847) {
            return 6410;
        } else if (arg0 == 6402) {
            return 6402;
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljaggl/opengl;IIIIII[I)V", line = 152)
    public static final void method2294(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg3 > 0 && !class7.method41(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class7.method41(0, arg4)) {
            throw new IllegalArgumentException("");
        } else if (arg5 == 32993) {
            int var8 = 0;
            int var9 = arg3 < arg4 ? arg3 : arg4;
            int var10 = arg3 >> 1;
            int var11 = arg4 >> 1;
            int[] var12 = arg7;
            int[] var13 = new int[var10 * var11];
            while (true) {
                arg0.glTexImage2D(arg1, var8, arg2, arg3, arg4, 0, arg5, arg6, IntBuffer.wrap(var12));
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg3 + var15;
                for (int var17 = 0; var17 < var11; var17++) {
                    for (int var18 = 0; var18 < var10; var18++) {
                        int var19 = var12[var15++];
                        int var20 = var12[var15++];
                        int var21 = var12[var16++];
                        int var22 = var12[var16++];
                        int var23 = var19 >> 24 & 0xFF;
                        int var24 = var19 >> 16 & 0xFF;
                        int var25 = var19 >> 8 & 0xFF;
                        int var26 = var19 & 0xFF;
                        int var27 = (var20 >> 24 & 0xFF) + var23;
                        int var28 = (var20 >> 16 & 0xFF) + var24;
                        int var29 = (var20 >> 8 & 0xFF) + var25;
                        int var30 = (var20 & 0xFF) + var26;
                        int var31 = (var21 >> 24 & 0xFF) + var27;
                        int var32 = (var21 >> 16 & 0xFF) + var28;
                        int var33 = (var21 >> 8 & 0xFF) + var29;
                        int var34 = (var21 & 0xFF) + var30;
                        int var35 = (var22 >> 24 & 0xFF) + var31;
                        int var36 = (var22 >> 16 & 0xFF) + var32;
                        int var37 = (var22 >> 8 & 0xFF) + var33;
                        int var38 = (var22 & 0xFF) + var34;
                        var13[var14++] = (var35 & 0x3FC) << 22 | (var36 & 0x3FC) << 14 | (var37 & 0x3FC) << 6 | (var38 & 0x3FC) >> 2;
                    }
                    var15 += arg3;
                    var16 += arg3;
                }
                int[] var39 = var13;
                var13 = var12;
                var12 = var39;
                arg3 = var10;
                arg4 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "()I", line = 250)
    public final int method2295() {
        return this.field5182;
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Z)V", line = 254)
    public final void method2296(boolean arg0) {
        if (this.field5181 != arg0) {
            int var2 = this.method2291();
            this.field5181 = true;
            this.method2302();
            this.method2301(var2);
        }
    }

    @OriginalMember(owner = "client!tp", name = "b", descriptor = "(Z)V", line = 271)
    public final void method2297(boolean arg0) {
        if (this.field5183 != arg0) {
            this.field5183 = arg0;
            this.method2302();
        }
    }

    @OriginalMember(owner = "client!tp", name = "a", descriptor = "(Ljaggl/opengl;IIIII[B)V", line = 281)
    public static final void method2298(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        if (arg3 > 0 && !class7.method41(0, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class7.method41(0, arg4)) {
            int var7 = method2290(arg5);
            int var8 = 0;
            int var9 = arg3 < arg4 ? arg3 : arg4;
            int var10 = arg3 >> 1;
            int var11 = arg4 >> 1;
            byte[] var12 = arg6;
            byte[] var13 = new byte[var10 * var11 * var7];
            while (true) {
                arg0.glTexImage2D(arg1, var8, arg2, arg3, arg4, 0, arg5, 5121, ByteBuffer.wrap(var12));
                if (var9 <= 1) {
                    return;
                }
                int var14 = arg3 * var7;
                for (int var15 = 0; var15 < var7; var15++) {
                    int var16 = var15;
                    int var17 = var15;
                    int var18 = var14 + var15;
                    for (int var19 = 0; var19 < var11; var19++) {
                        for (int var20 = 0; var20 < var10; var20++) {
                            byte var21 = var12[var17];
                            int var22 = var7 + var17;
                            int var23 = var12[var22] + var21;
                            var17 = var7 + var22;
                            int var24 = var12[var18] + var23;
                            int var25 = var7 + var18;
                            int var26 = var12[var25] + var24;
                            var18 = var7 + var25;
                            var13[var16] = (byte) (var26 >> 2);
                            var16 += var7;
                        }
                        var17 += var14;
                        var18 += var14;
                    }
                }
                byte[] var27 = var13;
                var13 = var12;
                var12 = var27;
                arg3 = var10;
                arg4 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new IllegalArgumentException("");
        }
    }

    @OriginalMember(owner = "client!tp", name = "d", descriptor = "()Z", line = 372)
    public final boolean method2299() {
        opengl var1 = this.field5186.field557;
        if (!this.field5186.field693) {
            return false;
        }
        int var2 = this.method2291();
        this.field5186.method303(this);
        var1.glGenerateMipmapEXT(this.field5180);
        this.field5181 = true;
        this.method2302();
        this.method2301(var2);
        return true;
    }

    @OriginalMember(owner = "client!tp", name = "<init>", descriptor = "(Lfu;IIIZ)V", line = 408)
    public class375(class42 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5186 = arg0;
        this.field5180 = arg1;
        this.field5187 = arg2;
        this.field5181 = arg4;
        this.field5184 = arg3;
        this.field5186.field557.glGenTextures(1, field5185, 0);
        this.field5182 = field5185[0];
        this.method2301(0);
    }

    @OriginalMember(owner = "client!tp", name = "finalize", descriptor = "()V", line = 393)
    protected final void finalize() throws Throwable {
        this.method2300();
        super.finalize();
    }

    @OriginalMember(owner = "client!tp", name = "e", descriptor = "()V", line = 397)
    public final void method2300() {
        if (this.field5182 > 0) {
            this.field5186.method333(this.field5182, this.method2291());
            this.field5182 = 0;
        }
    }

    @OriginalMember(owner = "client!tp", name = "c", descriptor = "(I)V", line = 405)
    private final void method2301(int arg0) {
        this.field5186.field573 -= arg0;
        this.field5186.field573 += this.method2291();
    }

    @OriginalMember(owner = "client!tp", name = "f", descriptor = "()V", line = 422)
    private final void method2302() {
        opengl var1 = this.field5186.field557;
        this.field5186.method303(this);
        if (this.field5183) {
            var1.glTexParameteri(this.field5180, 10241, this.field5181 ? 9987 : 9729);
            var1.glTexParameteri(this.field5180, 10240, 9729);
        } else {
            var1.glTexParameteri(this.field5180, 10241, this.field5181 ? 9984 : 9728);
            var1.glTexParameteri(this.field5180, 10240, 9728);
        }
    }
}
