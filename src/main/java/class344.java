import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gd")
public abstract class class344 implements class5 {

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "Z")
    private boolean field5128 = false;

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "Lse;")
    public class282 field5130;

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "I")
    public int field5129;

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "I")
    public int field5131;

    @OriginalMember(owner = "client!gd", name = "g", descriptor = "Z")
    private boolean field5132;

    @OriginalMember(owner = "client!gd", name = "h", descriptor = "I")
    private int field5133;

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "I")
    public int field5127;

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "[I")
    private static int[] field5126 = new int[1];

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(I)V", line = 6)
    private final void method2271(int arg0) {
        this.field5130.field4161 -= arg0;
        this.field5130.field4161 += this.method2274();
    }

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(I)I", line = 11)
    public static final int method2272(int arg0) {
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

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "()I", line = 32)
    public final int method2273() {
        return this.field5127;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "()I", line = 36)
    private final int method2274() {
        int var1 = this.field5130.method1890(this.field5131) * this.field5133;
        return this.field5132 ? var1 * 4 / 3 : var1;
    }

    @OriginalMember(owner = "client!gd", name = "finalize", descriptor = "()V", line = 40)
    protected final void finalize() throws Throwable {
        this.method2283();
        super.finalize();
    }

    @OriginalMember(owner = "client!gd", name = "d", descriptor = "()V", line = 46)
    private final void method2275() {
        opengl var1 = this.field5130.field4140;
        this.field5130.method1915(this);
        if (this.field5128) {
            var1.glTexParameteri(this.field5129, 10241, this.field5132 ? 9987 : 9729);
            var1.glTexParameteri(this.field5129, 10240, 9729);
        } else {
            var1.glTexParameteri(this.field5129, 10241, this.field5132 ? 9984 : 9728);
            var1.glTexParameteri(this.field5129, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljaggl/opengl;IIIIII[I)V", line = 66)
    public static final void method2276(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg3 > 0 && !class382.method2486(-1759919544, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class382.method2486(-1759919544, arg4)) {
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

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Z)V", line = 163)
    public final void method2277(boolean arg0) {
        this.field5128 = arg0;
        this.method2275();
    }

    @OriginalMember(owner = "client!gd", name = "e", descriptor = "()Z", line = 180)
    public final boolean method2278() {
        opengl var1 = this.field5130.field4140;
        if (!this.field5130.field4212) {
            return false;
        }
        int var2 = this.method2274();
        this.field5130.method1915(this);
        var1.glGenerateMipmapEXT(this.field5129);
        this.field5132 = true;
        this.method2275();
        this.method2271(var2);
        return true;
    }

    @OriginalMember(owner = "client!gd", name = "c", descriptor = "(I)I", line = 199)
    public static final int method2279(int arg0) {
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

    @OriginalMember(owner = "client!gd", name = "b", descriptor = "(Z)V", line = 225)
    public final void method2280(boolean arg0) {
        if (this.field5132 != arg0) {
            int var2 = this.method2274();
            this.field5132 = true;
            this.method2275();
            this.method2271(var2);
        }
    }

    @OriginalMember(owner = "client!gd", name = "<init>", descriptor = "(Lse;IIIZ)V", line = 416)
    public class344(class282 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field5130 = arg0;
        this.field5129 = arg1;
        this.field5131 = arg2;
        this.field5132 = arg4;
        this.field5133 = arg3;
        this.field5130.field4140.glGenTextures(1, field5126, 0);
        this.field5127 = field5126[0];
        this.method2271(0);
    }

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljaggl/opengl;IIIII[B)V", line = 239)
    public static final void method2281(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        if (arg3 > 0 && !class382.method2486(-1759919544, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class382.method2486(-1759919544, arg4)) {
            int var7 = method2279(arg5);
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

    @OriginalMember(owner = "client!gd", name = "a", descriptor = "(Ljaggl/opengl;IIIII[F)V", line = 327)
    public static final void method2282(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg3 > 0 && !class382.method2486(-1759919544, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class382.method2486(-1759919544, arg4)) {
            int var7 = method2279(arg5);
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

    @OriginalMember(owner = "client!gd", name = "f", descriptor = "()V", line = 429)
    public final void method2283() {
        if (this.field5127 > 0) {
            this.field5130.method1932(this.field5127, this.method2274());
            this.field5127 = 0;
        }
    }
}
