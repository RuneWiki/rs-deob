import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uc")
public class class208 extends class128 {

    @OriginalMember(owner = "client!uc", name = "C", descriptor = "I")
    private int field3525 = 0;

    @OriginalMember(owner = "client!uc", name = "z", descriptor = "I")
    private int field3522 = -1;

    @OriginalMember(owner = "client!uc", name = "N", descriptor = "Z")
    public boolean field3536 = false;

    @OriginalMember(owner = "client!uc", name = "M", descriptor = "Lkj;")
    public class194 field3535;

    @OriginalMember(owner = "client!uc", name = "G", descriptor = "Z")
    private boolean field3529;

    @OriginalMember(owner = "client!uc", name = "I", descriptor = "Z")
    private boolean field3531;

    @OriginalMember(owner = "client!uc", name = "J", descriptor = "Z")
    private boolean field3532;

    @OriginalMember(owner = "client!uc", name = "O", descriptor = "Z")
    private boolean field3537;

    @OriginalMember(owner = "client!uc", name = "H", descriptor = "I")
    private int field3530;

    @OriginalMember(owner = "client!uc", name = "P", descriptor = "I")
    private int field3538;

    @OriginalMember(owner = "client!uc", name = "E", descriptor = "Z")
    private boolean field3527;

    @OriginalMember(owner = "client!uc", name = "y", descriptor = "I")
    private int field3521;

    @OriginalMember(owner = "client!uc", name = "B", descriptor = "I")
    private int field3524;

    @OriginalMember(owner = "client!uc", name = "L", descriptor = "F")
    private float field3534;

    @OriginalMember(owner = "client!uc", name = "D", descriptor = "I")
    private int field3526;

    @OriginalMember(owner = "client!uc", name = "K", descriptor = "I")
    private int field3533;

    @OriginalMember(owner = "client!uc", name = "A", descriptor = "[I")
    public static int[] field3523;

    @OriginalMember(owner = "client!uc", name = "F", descriptor = "[I")
    private int[] field3528;

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIII[F)V", line = 10)
    private static final void method1544(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class147.method1172((byte) -128, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class147.method1172((byte) -128, arg3)) {
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
            GL var8 = class43.field651;
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

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "()V", line = 124)
    public static void method1545() {
        field3523 = null;
    }

    @OriginalMember(owner = "client!uc", name = "finalize", descriptor = "()V", line = 134)
    protected final void finalize() throws Throwable {
        if (this.field3522 != -1) {
            class151.method1190(this.field3522, this.field3525, this.field3526);
            this.field3522 = -1;
            this.field3525 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lmh;Lcg;I)Z", line = 146)
    public final boolean method1546(class150 arg0, class49 arg1, int arg2) {
        if (!this.field3535.method1454(-61, arg1, arg0)) {
            return false;
        }
        GL var4 = class43.field651;
        int var5 = class108.method945(0);
        if ((var5 & 0x1) == 0) {
            if (this.field3522 != -1 && this.field3533 == arg2) {
                class43.method390(this.field3522);
            } else {
                if (this.field3522 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field3522 = var6[0];
                    this.field3526 = class151.field2669;
                }
                class43.method390(this.field3522);
                if (this.field3527 && class16.method164()) {
                    float[] var7 = this.field3535.method1458(arg0, arg2, arg1, arg2, 102, this.field3531);
                    if (this.field3521 == 2) {
                        method1544(class3.field38, class3.field44, arg2, arg2, class3.field41, class3.field51, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class151.field2671 += var7.length * 4 / 3 - this.field3525;
                        this.field3525 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class151.field2671 += var7.length - this.field3525;
                        this.field3525 = var7.length;
                    }
                } else {
                    int var8 = class43.field639 ? 33639 : 5121;
                    int[] var9 = this.field3535.method1460(111, this.field3531, arg1, arg0, arg2, 0.7D, arg2);
                    if (this.field3521 == 2) {
                        method1551(class3.field38, class3.field41, arg2, arg2, class3.field42, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class151.field2671 += var9.length * 4 / 3 - this.field3525;
                        this.field3525 = var9.length * 4 / 3;
                    } else if (this.field3521 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class151.field2671 += var9.length * 4 / 3 - this.field3525;
                                this.field3525 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field3535.method1460(70, this.field3531, arg1, arg0, arg2, 0.7D, arg2);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class151.field2671 += var9.length - this.field3525;
                        this.field3525 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field3532 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field3537 ? 10497 : 33071);
                this.field3533 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class43.method368(this.field3524);
        }
        if ((var5 & 0x4) == 0) {
            class43.method349(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field3538 == 0 && this.field3530 == 0) {
                class43.method371();
            } else {
                float var11 = (float) (class43.field675 * this.field3538) / (float) this.field3533;
                float var12 = (float) (class43.field675 * this.field3530) / (float) this.field3533;
                class43.method377(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lmh;Lcg;Z)[I", line = 270)
    public final int[] method1547(class150 arg0, class49 arg1, boolean arg2) {
        if (this.field3535.method1454(121, arg1, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field3535.method1457(1.0D, var4, false, arg0, this.field3531, (byte) 31, var4, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!uc", name = "d", descriptor = "(I)V", line = 278)
    public final void method1548(int arg0) {
        if (this.field3528 == null || this.field3538 == 0 && this.field3530 == 0) {
            return;
        }
        if (field3523 == null || field3523.length < this.field3528.length) {
            field3523 = new int[this.field3528.length];
        }
        int var2 = this.field3528.length;
        int var3 = this.field3530 * arg0;
        int var4 = this.field3533 - 1;
        int var5 = this.field3533 * arg0 * this.field3538;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field3533) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field3533; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field3523[var10] = this.field3528[var11];
            }
        }
        int[] var12 = this.field3528;
        this.field3528 = field3523;
        field3523 = var12;
    }

    @OriginalMember(owner = "client!uc", name = "<init>", descriptor = "(Lpi;)V", line = 598)
    public class208(class336 arg0) {
        this.field3535 = new class194(arg0);
        this.field3529 = arg0.method2364(-9069) == 1;
        this.field3531 = arg0.method2364(-9069) == 1;
        this.field3532 = arg0.method2364(-9069) == 1;
        this.field3537 = arg0.method2364(-9069) == 1;
        int var2 = arg0.method2364(-9069) & 0x3;
        this.field3530 = arg0.method2323(110);
        this.field3538 = arg0.method2323(-65);
        int var3 = arg0.method2364(-9069);
        arg0.method2364(-9069);
        this.field3527 = arg0.method2364(-9069) == 1;
        this.field3521 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field3524 = 2;
        } else if (var2 == 2) {
            this.field3524 = 3;
        } else if (var2 == 3) {
            this.field3524 = 4;
        } else {
            this.field3524 = 0;
        }
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lmh;Lcg;FZ)[I", line = 330)
    public final int[] method1549(class150 arg0, class49 arg1, float arg2, boolean arg3) {
        if (this.field3528 == null || this.field3534 != arg2) {
            if (!this.field3535.method1454(-36, arg1, arg0)) {
                return null;
            }
            this.field3533 = arg3 ? 64 : 128;
            this.field3528 = this.field3535.method1457((double) arg2, this.field3533, true, arg0, this.field3531, (byte) 31, this.field3533, arg1);
            this.field3534 = arg2;
            if (this.field3529) {
                int[] var5 = new int[this.field3533];
                int[] var6 = new int[this.field3533];
                int[] var7 = new int[this.field3533];
                int[] var8 = new int[this.field3533 * this.field3533];
                int var9 = this.field3533;
                int var10 = this.field3533;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field3528[var14];
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
                        int var32 = this.field3528[var14];
                        var15--;
                        int var33 = this.field3528[var15];
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
                this.field3528 = var8;
            }
        }
        return this.field3528;
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(Lmh;Lcg;)Z", line = 485)
    public final boolean method1550(class150 arg0, class49 arg1) {
        return this.field3535.method1454(108, arg1, arg0);
    }

    @OriginalMember(owner = "client!uc", name = "a", descriptor = "(IIIIII[I)V", line = 494)
    private static final void method1551(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class147.method1172((byte) -128, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class147.method1172((byte) -128, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class43.field651;
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
}
