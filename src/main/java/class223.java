import jaggl.opengl;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dg")
public abstract class class223 implements class92 {

    @OriginalMember(owner = "client!dg", name = "g", descriptor = "Z")
    private boolean field3157 = false;

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "Lih;")
    public class330 field3152;

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "I")
    public int field3156;

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "I")
    public int field3151;

    @OriginalMember(owner = "client!dg", name = "h", descriptor = "Z")
    private boolean field3158;

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "I")
    private int field3153;

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "I")
    public int field3154;

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "[I")
    private static int[] field3155 = new int[1];

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(I)I")
    public static final int method1382(int arg0) {
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

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljaggl/opengl;IIIIII[I)V")
    public static final void method1383(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int[] arg7) {
        if (arg3 > 0 && !class167.method1040(false, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 > 0 && !class167.method1040(false, arg4)) {
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

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "()I")
    public final int method1384() {
        return this.field3154;
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljaggl/opengl;IIIII[B)V")
    public static final void method1385(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6) {
        if (arg3 > 0 && !class167.method1040(false, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class167.method1040(false, arg4)) {
            int var7 = method1391(arg5);
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

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "()V")
    public final void method1386() {
        if (this.field3154 > 0) {
            this.field3152.method2181(this.field3154, this.method1394());
            this.field3154 = 0;
        }
    }

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(I)V")
    private final void method1387(int arg0) {
        this.field3152.field4762 -= arg0;
        this.field3152.field4762 += this.method1394();
    }

    @OriginalMember(owner = "client!dg", name = "d", descriptor = "()Z")
    public final boolean method1388() {
        opengl var1 = this.field3152.field4741;
        if (!this.field3152.field4791) {
            return false;
        }
        int var2 = this.method1394();
        this.field3152.method2186(this);
        var1.glGenerateMipmapEXT(this.field3156);
        this.field3158 = true;
        this.method1389();
        this.method1387(var2);
        return true;
    }

    @OriginalMember(owner = "client!dg", name = "e", descriptor = "()V")
    private final void method1389() {
        opengl var1 = this.field3152.field4741;
        this.field3152.method2186(this);
        if (this.field3157) {
            var1.glTexParameteri(this.field3156, 10241, this.field3158 ? 9987 : 9729);
            var1.glTexParameteri(this.field3156, 10240, 9729);
        } else {
            var1.glTexParameteri(this.field3156, 10241, this.field3158 ? 9984 : 9728);
            var1.glTexParameteri(this.field3156, 10240, 9728);
        }
    }

    @OriginalMember(owner = "client!dg", name = "finalize", descriptor = "()V")
    protected final void finalize() throws Throwable {
        this.method1386();
        super.finalize();
    }

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Z)V")
    public final void method1390(boolean arg0) {
        if (this.field3157 != arg0) {
            this.field3157 = arg0;
            this.method1389();
        }
    }

    @OriginalMember(owner = "client!dg", name = "c", descriptor = "(I)I")
    public static final int method1391(int arg0) {
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

    @OriginalMember(owner = "client!dg", name = "a", descriptor = "(Ljaggl/opengl;IIIII[F)V")
    public static final void method1392(opengl arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg3 > 0 && !class167.method1040(false, arg3)) {
            throw new IllegalArgumentException("");
        } else if (arg4 <= 0 || class167.method1040(false, arg4)) {
            int var7 = method1391(arg5);
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

    @OriginalMember(owner = "client!dg", name = "b", descriptor = "(Z)V")
    public final void method1393(boolean arg0) {
        if (this.field3158 != arg0) {
            int var2 = this.method1394();
            this.field3158 = true;
            this.method1389();
            this.method1387(var2);
        }
    }

    @OriginalMember(owner = "client!dg", name = "f", descriptor = "()I")
    private final int method1394() {
        int var1 = this.field3152.method2055(this.field3151) * this.field3153;
        return this.field3158 ? var1 * 4 / 3 : var1;
    }

    @OriginalMember(owner = "client!dg", name = "<init>", descriptor = "(Lih;IIIZ)V")
    public class223(class330 arg0, int arg1, int arg2, int arg3, boolean arg4) {
        this.field3152 = arg0;
        this.field3156 = arg1;
        this.field3151 = arg2;
        this.field3158 = arg4;
        this.field3153 = arg3;
        this.field3152.field4741.glGenTextures(1, field3155, 0);
        this.field3154 = field3155[0];
        this.method1387(0);
    }
}
