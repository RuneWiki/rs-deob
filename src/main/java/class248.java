import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ei")
public class class248 extends class199 {

    @OriginalMember(owner = "client!ei", name = "J", descriptor = "I")
    private int field3933 = -1;

    @OriginalMember(owner = "client!ei", name = "G", descriptor = "I")
    private int field3930 = 0;

    @OriginalMember(owner = "client!ei", name = "M", descriptor = "Z")
    public boolean field3936 = false;

    @OriginalMember(owner = "client!ei", name = "C", descriptor = "Lhj;")
    public class76 field3926;

    @OriginalMember(owner = "client!ei", name = "D", descriptor = "Z")
    private boolean field3927;

    @OriginalMember(owner = "client!ei", name = "O", descriptor = "Z")
    private boolean field3938;

    @OriginalMember(owner = "client!ei", name = "R", descriptor = "Z")
    private boolean field3941;

    @OriginalMember(owner = "client!ei", name = "K", descriptor = "Z")
    private boolean field3934;

    @OriginalMember(owner = "client!ei", name = "E", descriptor = "I")
    private int field3928;

    @OriginalMember(owner = "client!ei", name = "I", descriptor = "I")
    private int field3932;

    @OriginalMember(owner = "client!ei", name = "Q", descriptor = "Z")
    private boolean field3940;

    @OriginalMember(owner = "client!ei", name = "B", descriptor = "I")
    private int field3925;

    @OriginalMember(owner = "client!ei", name = "P", descriptor = "I")
    private int field3939;

    @OriginalMember(owner = "client!ei", name = "N", descriptor = "F")
    private float field3937;

    @OriginalMember(owner = "client!ei", name = "F", descriptor = "I")
    private int field3929;

    @OriginalMember(owner = "client!ei", name = "L", descriptor = "I")
    private int field3935;

    @OriginalMember(owner = "client!ei", name = "A", descriptor = "[I")
    public static int[] field3924;

    @OriginalMember(owner = "client!ei", name = "H", descriptor = "[I")
    private int[] field3931;

    @OriginalMember(owner = "client!ei", name = "finalize", descriptor = "()V", line = 7)
    protected final void finalize() throws Throwable {
        if (this.field3933 != -1) {
            class198.method1404(this.field3933, this.field3930, this.field3929);
            this.field3933 = -1;
            this.field3930 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lrf;Ll;FZ)[I", line = 17)
    public final int[] method1701(class79 arg0, class133 arg1, float arg2, boolean arg3) {
        if (this.field3931 == null || this.field3937 != arg2) {
            if (!this.field3926.method561(arg1, -73, arg0)) {
                return null;
            }
            this.field3935 = arg3 ? 64 : 128;
            this.field3931 = this.field3926.method555(this.field3935, this.field3938, 109, arg1, arg0, true, this.field3935, (double) arg2);
            this.field3937 = arg2;
            if (this.field3927) {
                int[] var5 = new int[this.field3935];
                int[] var6 = new int[this.field3935];
                int[] var7 = new int[this.field3935];
                int[] var8 = new int[this.field3935 * this.field3935];
                int var9 = this.field3935;
                int var10 = this.field3935;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field3931[var14];
                        var5[var17] += var18 >> 16 & 0xFF;
                        var6[var17] += var18 >> 8 & 0xFF;
                        var7[var17] += var18 & 0xFF;
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                }
                int var19 = var13;
                for (int var20 = var12; var20 >= 0; var20--) {
                    int var21 = 1;
                    int var22 = 1;
                    int var23 = 0;
                    int var24 = 0;
                    int var25 = 0;
                    for (int var26 = 2; var26 >= 0; var26--) {
                        var22--;
                        var25 += var5[var22];
                        var23 += var6[var22];
                        var24 += var7[var22];
                        if (var22 == 0) {
                            var22 = var9;
                        }
                    }
                    for (int var27 = var11; var27 >= 0; var27--) {
                        var22--;
                        var21--;
                        int var28 = var25 / 9;
                        int var29 = var23 / 9;
                        int var30 = var24 / 9;
                        var19--;
                        var8[var19] = var28 << 16 | var29 << 8 | var30;
                        var25 += var5[var22] - var5[var21];
                        var24 += var7[var22] - var7[var21];
                        var23 += var6[var22] - var6[var21];
                        if (var22 == 0) {
                            var22 = var9;
                        }
                        if (var21 == 0) {
                            var21 = var9;
                        }
                    }
                    for (int var31 = var11; var31 >= 0; var31--) {
                        var14--;
                        int var32 = this.field3931[var14];
                        var15--;
                        int var33 = this.field3931[var15];
                        var5[var31] += (var32 >> 16 & 0xFF) - (var33 >> 16 & 0xFF);
                        var6[var31] += (var32 >> 8 & 0xFF) - (var33 >> 8 & 0xFF);
                        var7[var31] += (var32 & 0xFF) - (var33 & 0xFF);
                    }
                    if (var14 == 0) {
                        var14 = var13;
                    }
                    if (var15 == 0) {
                        var15 = var13;
                    }
                }
                this.field3931 = var8;
            }
        }
        return this.field3931;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lrf;Ll;)Z", line = 169)
    public final boolean method1702(class79 arg0, class133 arg1) {
        return this.field3926.method561(arg1, -76, arg0);
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lrf;Ll;Z)[I", line = 173)
    public final int[] method1703(class79 arg0, class133 arg1, boolean arg2) {
        if (this.field3926.method561(arg1, -64, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field3926.method555(var4, this.field3938, 96, arg1, arg0, false, var4, 1.0D);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "()V", line = 182)
    public static void method1704() {
        field3924 = null;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII[F)V", line = 185)
    private static final void method1705(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class70.method526(arg2, -33)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class70.method526(arg3, -50)) {
            throw new InvalidParameterException("height must be power of 2");
        } else {
            byte var7;
            if (arg4 == 6406) {
                var7 = 1;
            } else if (arg4 == 6409) {
                var7 = 1;
            } else if (arg4 == 32841) {
                var7 = 1;
            } else if (arg4 == 6410) {
                var7 = 2;
            } else if (arg4 == 6407) {
                var7 = 3;
            } else if (arg4 == 6408) {
                var7 = 4;
            } else {
                throw new InvalidParameterException("Invalid external format");
            }
            GL var8 = class94.field1473;
            int var9 = 0;
            int var10 = arg2 < arg3 ? arg2 : arg3;
            int var11 = arg2 >> 1;
            int var12 = arg3 >> 1;
            float[] var13 = arg6;
            float[] var14 = new float[var11 * var12 * var7];
            while (true) {
                var8.glTexImage2D(arg0, var9, arg1, arg2, arg3, 0, arg4, 5126, FloatBuffer.wrap(var13));
                if (var10 <= 1) {
                    return;
                }
                int var15 = arg2 * var7;
                for (int var16 = 0; var16 < var7; var16++) {
                    int var17 = var16;
                    int var18 = var16;
                    int var19 = var15 + var16;
                    for (int var20 = 0; var20 < var12; var20++) {
                        for (int var21 = 0; var21 < var11; var21++) {
                            float var22 = var13[var18];
                            int var23 = var7 + var18;
                            float var24 = var13[var23] + var22;
                            var18 = var7 + var23;
                            float var25 = var13[var19] + var24;
                            int var26 = var7 + var19;
                            float var27 = var13[var26] + var25;
                            var19 = var7 + var26;
                            var14[var17] = var27 * 0.25F;
                            var17 += var7;
                        }
                        var18 += var15;
                        var19 += var15;
                    }
                }
                float[] var28 = var14;
                var14 = var13;
                var13 = var28;
                arg2 = var11;
                arg3 = var12;
                var11 >>= 0x1;
                var12 >>= 0x1;
                var10 >>= 0x1;
                var9++;
            }
        }
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(IIIIII[I)V", line = 305)
    private static final void method1706(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class70.method526(arg2, -82)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class70.method526(arg3, -75)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class94.field1473;
            int var8 = 0;
            int var9 = arg2 < arg3 ? arg2 : arg3;
            int var10 = arg2 >> 1;
            int var11 = arg3 >> 1;
            int[] var12 = arg6;
            int[] var13 = new int[var10 * var11];
            while (true) {
                var7.glTexImage2D(arg0, var8, arg1, arg2, arg3, 0, arg4, arg5, IntBuffer.wrap(var12));
                if (var9 <= 1) {
                    return;
                }
                int var14 = 0;
                int var15 = 0;
                int var16 = arg2 + var15;
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
                    var15 += arg2;
                    var16 += arg2;
                }
                int[] var39 = var13;
                var13 = var12;
                var12 = var39;
                arg2 = var10;
                arg3 = var11;
                var10 >>= 0x1;
                var11 >>= 0x1;
                var9 >>= 0x1;
                var8++;
            }
        } else {
            throw new InvalidParameterException("Invalid external format");
        }
    }

    @OriginalMember(owner = "client!ei", name = "<init>", descriptor = "(Lkh;)V", line = 598)
    public class248(class166 arg0) {
        this.field3926 = new class76(arg0);
        this.field3927 = arg0.method1178(0) == 1;
        this.field3938 = arg0.method1178(0) == 1;
        this.field3941 = arg0.method1178(0) == 1;
        this.field3934 = arg0.method1178(0) == 1;
        int var2 = arg0.method1178(0) & 0x3;
        this.field3928 = arg0.method1143(-70);
        this.field3932 = arg0.method1143(-64);
        int var3 = arg0.method1178(0);
        arg0.method1178(0);
        this.field3940 = arg0.method1178(0) == 1;
        this.field3925 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field3939 = 2;
        } else if (var2 == 2) {
            this.field3939 = 3;
        } else if (var2 == 3) {
            this.field3939 = 4;
        } else {
            this.field3939 = 0;
        }
    }

    @OriginalMember(owner = "client!ei", name = "g", descriptor = "(I)V", line = 415)
    public final void method1707(int arg0) {
        if (this.field3931 == null || this.field3932 == 0 && this.field3928 == 0) {
            return;
        }
        if (field3924 == null || field3924.length < this.field3931.length) {
            field3924 = new int[this.field3931.length];
        }
        int var2 = this.field3931.length;
        int var3 = this.field3928 * arg0;
        int var4 = this.field3935 - 1;
        int var5 = this.field3935 * arg0 * this.field3932;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field3935) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field3935; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field3924[var10] = this.field3931[var11];
            }
        }
        int[] var12 = this.field3931;
        this.field3931 = field3924;
        field3924 = var12;
    }

    @OriginalMember(owner = "client!ei", name = "a", descriptor = "(Lrf;Ll;I)Z", line = 465)
    public final boolean method1708(class79 arg0, class133 arg1, int arg2) {
        if (!this.field3926.method561(arg1, -76, arg0)) {
            return false;
        }
        GL var4 = class94.field1473;
        int var5 = class205.method1453(-29705);
        if ((var5 & 0x1) == 0) {
            if (this.field3933 != -1 && this.field3935 == arg2) {
                class94.method698(this.field3933);
            } else {
                if (this.field3933 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field3933 = var6[0];
                    this.field3929 = class198.field2966;
                }
                class94.method698(this.field3933);
                if (this.field3940 && class277.method1895()) {
                    float[] var7 = this.field3926.method554(arg2, arg2, arg0, 255, this.field3938, arg1);
                    if (this.field3925 == 2) {
                        method1705(class114.field1749, class114.field1755, arg2, arg2, class114.field1752, class114.field1762, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class198.field2961 += var7.length * 4 / 3 - this.field3930;
                        this.field3930 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class198.field2961 += var7.length - this.field3930;
                        this.field3930 = var7.length;
                    }
                } else {
                    int var8 = class94.field1512 ? 33639 : 5121;
                    int[] var9 = this.field3926.method562(arg0, true, arg2, 0.7D, arg2, arg1, this.field3938);
                    if (this.field3925 == 2) {
                        method1706(class114.field1749, class114.field1752, arg2, arg2, class114.field1753, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class198.field2961 += var9.length * 4 / 3 - this.field3930;
                        this.field3930 = var9.length * 4 / 3;
                    } else if (this.field3925 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class198.field2961 += var9.length * 4 / 3 - this.field3930;
                                this.field3930 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field3926.method562(arg0, true, arg2, 0.7D, arg2, arg1, this.field3938);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class198.field2961 += var9.length - this.field3930;
                        this.field3930 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field3941 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field3934 ? 10497 : 33071);
                this.field3935 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class94.method677(this.field3939);
        }
        if ((var5 & 0x4) == 0) {
            class94.method675(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field3932 == 0 && this.field3928 == 0) {
                class94.method695();
            } else {
                float var11 = (float) (class94.field1499 * this.field3932) / (float) this.field3935;
                float var12 = (float) (class94.field1499 * this.field3928) / (float) this.field3935;
                class94.method710(var12, var11, 0.0F);
            }
        }
        return true;
    }
}
