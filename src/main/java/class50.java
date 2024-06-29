import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!so")
public class class50 extends class213 {

    @OriginalMember(owner = "client!so", name = "M", descriptor = "I")
    private int field673 = 0;

    @OriginalMember(owner = "client!so", name = "z", descriptor = "I")
    private int field660 = -1;

    @OriginalMember(owner = "client!so", name = "L", descriptor = "Z")
    public boolean field672 = false;

    @OriginalMember(owner = "client!so", name = "J", descriptor = "Lln;")
    public class255 field670;

    @OriginalMember(owner = "client!so", name = "N", descriptor = "Z")
    private boolean field674;

    @OriginalMember(owner = "client!so", name = "y", descriptor = "Z")
    private boolean field659;

    @OriginalMember(owner = "client!so", name = "P", descriptor = "Z")
    private boolean field676;

    @OriginalMember(owner = "client!so", name = "F", descriptor = "Z")
    private boolean field666;

    @OriginalMember(owner = "client!so", name = "C", descriptor = "I")
    private int field663;

    @OriginalMember(owner = "client!so", name = "G", descriptor = "I")
    private int field667;

    @OriginalMember(owner = "client!so", name = "K", descriptor = "Z")
    private boolean field671;

    @OriginalMember(owner = "client!so", name = "E", descriptor = "I")
    private int field665;

    @OriginalMember(owner = "client!so", name = "B", descriptor = "I")
    private int field662;

    @OriginalMember(owner = "client!so", name = "O", descriptor = "F")
    private float field675;

    @OriginalMember(owner = "client!so", name = "H", descriptor = "I")
    private int field668;

    @OriginalMember(owner = "client!so", name = "I", descriptor = "I")
    private int field669;

    @OriginalMember(owner = "client!so", name = "A", descriptor = "[I")
    private int[] field661;

    @OriginalMember(owner = "client!so", name = "D", descriptor = "[I")
    public static int[] field664;

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[F)V", line = 6)
    private static final void method392(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class277.method1876((byte) -110, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class277.method1876((byte) 94, arg3)) {
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
            GL var8 = class47.field592;
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

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lkj;Lfh;Z)[I", line = 125)
    public final int[] method393(class252 arg0, class140 arg1, boolean arg2) {
        if (this.field670.method1778(arg0, arg1, -50)) {
            int var4 = arg2 ? 64 : 128;
            return this.field670.method1782(1.0D, this.field659, 30319, arg1, arg0, var4, false, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(IIIIII[I)V", line = 133)
    private static final void method394(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class277.method1876((byte) -91, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class277.method1876((byte) -115, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class47.field592;
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

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lkj;Lfh;FZ)[I", line = 232)
    public final int[] method395(class252 arg0, class140 arg1, float arg2, boolean arg3) {
        if (this.field661 == null || this.field675 != arg2) {
            if (!this.field670.method1778(arg0, arg1, -75)) {
                return null;
            }
            this.field668 = arg3 ? 64 : 128;
            this.field661 = this.field670.method1782((double) arg2, this.field659, 30319, arg1, arg0, this.field668, true, this.field668);
            this.field675 = arg2;
            if (this.field674) {
                int[] var5 = new int[this.field668];
                int[] var6 = new int[this.field668];
                int[] var7 = new int[this.field668];
                int[] var8 = new int[this.field668 * this.field668];
                int var9 = this.field668;
                int var10 = this.field668;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field661[var14];
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
                        int var32 = this.field661[var14];
                        var15--;
                        int var33 = this.field661[var15];
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
                this.field661 = var8;
            }
        }
        return this.field661;
    }

    @OriginalMember(owner = "client!so", name = "finalize", descriptor = "()V", line = 388)
    protected final void finalize() throws Throwable {
        if (this.field660 != -1) {
            class298.method2037(this.field660, this.field673, this.field669);
            this.field660 = -1;
            this.field673 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!so", name = "d", descriptor = "(I)V", line = 398)
    public final void method396(int arg0) {
        if (this.field661 == null || this.field667 == 0 && this.field663 == 0) {
            return;
        }
        if (field664 == null || field664.length < this.field661.length) {
            field664 = new int[this.field661.length];
        }
        int var2 = this.field661.length;
        int var3 = this.field663 * arg0;
        int var4 = this.field668 - 1;
        int var5 = this.field668 * arg0 * this.field667;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field668) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field668; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field664[var10] = this.field661[var11];
            }
        }
        int[] var12 = this.field661;
        this.field661 = field664;
        field664 = var12;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "()V", line = 454)
    public static void method397() {
        field664 = null;
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lkj;Lfh;)Z", line = 457)
    public final boolean method398(class252 arg0, class140 arg1) {
        return this.field670.method1778(arg0, arg1, -55);
    }

    @OriginalMember(owner = "client!so", name = "<init>", descriptor = "(Lfd;)V", line = 598)
    public class50(class299 arg0) {
        this.field670 = new class255(arg0);
        this.field674 = arg0.method2096((byte) -122) == 1;
        this.field659 = arg0.method2096((byte) -122) == 1;
        this.field676 = arg0.method2096((byte) -122) == 1;
        this.field666 = arg0.method2096((byte) -122) == 1;
        int var2 = arg0.method2096((byte) -122) & 0x3;
        this.field663 = arg0.method2104(123);
        this.field667 = arg0.method2104(126);
        int var3 = arg0.method2096((byte) -122);
        arg0.method2096((byte) -122);
        this.field671 = arg0.method2096((byte) -122) == 1;
        this.field665 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field662 = 2;
        } else if (var2 == 2) {
            this.field662 = 3;
        } else if (var2 == 3) {
            this.field662 = 4;
        } else {
            this.field662 = 0;
        }
    }

    @OriginalMember(owner = "client!so", name = "a", descriptor = "(Lkj;Lfh;I)Z", line = 471)
    public final boolean method399(class252 arg0, class140 arg1, int arg2) {
        if (!this.field670.method1778(arg0, arg1, -26)) {
            return false;
        }
        GL var4 = class47.field592;
        int var5 = class353.method2454((byte) 124);
        if ((var5 & 0x1) == 0) {
            if (this.field660 != -1 && this.field668 == arg2) {
                class47.method357(this.field660);
            } else {
                if (this.field660 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field660 = var6[0];
                    this.field669 = class298.field4320;
                }
                class47.method357(this.field660);
                if (this.field671 && class46.method337()) {
                    float[] var7 = this.field670.method1777(arg2, (byte) -107, this.field659, arg0, arg1, arg2);
                    if (this.field665 == 2) {
                        method392(class358.field5590, class358.field5596, arg2, arg2, class358.field5593, class358.field5603, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class298.field4318 += var7.length * 4 / 3 - this.field673;
                        this.field673 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class298.field4318 += var7.length - this.field673;
                        this.field673 = var7.length;
                    }
                } else {
                    int var8 = class47.field593 ? 33639 : 5121;
                    int[] var9 = this.field670.method1775(arg2, (byte) 58, arg2, arg1, 0.7D, arg0, this.field659);
                    if (this.field665 == 2) {
                        method394(class358.field5590, class358.field5593, arg2, arg2, class358.field5594, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class298.field4318 += var9.length * 4 / 3 - this.field673;
                        this.field673 = var9.length * 4 / 3;
                    } else if (this.field665 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class298.field4318 += var9.length * 4 / 3 - this.field673;
                                this.field673 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field670.method1775(arg2, (byte) -120, arg2, arg1, 0.7D, arg0, this.field659);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class298.field4318 += var9.length - this.field673;
                        this.field673 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field676 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field666 ? 10497 : 33071);
                this.field668 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class47.method354(this.field662);
        }
        if ((var5 & 0x4) == 0) {
            class47.method364(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field667 == 0 && this.field663 == 0) {
                class47.method352();
            } else {
                float var11 = (float) (class47.field625 * this.field667) / (float) this.field668;
                float var12 = (float) (class47.field625 * this.field663) / (float) this.field668;
                class47.method366(var12, var11, 0.0F);
            }
        }
        return true;
    }
}
