import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class1 extends class8 {

    @OriginalMember(owner = "client!ok", name = "L", descriptor = "I")
    private int field6 = -1;

    @OriginalMember(owner = "client!ok", name = "U", descriptor = "I")
    private int field14 = 0;

    @OriginalMember(owner = "client!ok", name = "W", descriptor = "Z")
    public boolean field16 = false;

    @OriginalMember(owner = "client!ok", name = "J", descriptor = "Lpk;")
    public class25 field4;

    @OriginalMember(owner = "client!ok", name = "K", descriptor = "Z")
    private boolean field5;

    @OriginalMember(owner = "client!ok", name = "O", descriptor = "Z")
    private boolean field8;

    @OriginalMember(owner = "client!ok", name = "S", descriptor = "Z")
    private boolean field12;

    @OriginalMember(owner = "client!ok", name = "H", descriptor = "Z")
    private boolean field3;

    @OriginalMember(owner = "client!ok", name = "G", descriptor = "I")
    private int field2;

    @OriginalMember(owner = "client!ok", name = "N", descriptor = "I")
    private int field7;

    @OriginalMember(owner = "client!ok", name = "V", descriptor = "Z")
    private boolean field15;

    @OriginalMember(owner = "client!ok", name = "F", descriptor = "I")
    private int field1;

    @OriginalMember(owner = "client!ok", name = "R", descriptor = "I")
    private int field11;

    @OriginalMember(owner = "client!ok", name = "P", descriptor = "F")
    private float field9;

    @OriginalMember(owner = "client!ok", name = "T", descriptor = "I")
    private int field13;

    @OriginalMember(owner = "client!ok", name = "X", descriptor = "I")
    private int field17;

    @OriginalMember(owner = "client!ok", name = "Q", descriptor = "[I")
    private int[] field10;

    @OriginalMember(owner = "client!ok", name = "Y", descriptor = "[I")
    public static int[] field18;

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Leg;Lak;)Z", line = 6)
    public final boolean method1(class154 arg0, class172 arg1) {
        return this.field4.method148(-105, arg1, arg0);
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Leg;Lak;FZ)[I", line = 9)
    public final int[] method2(class154 arg0, class172 arg1, float arg2, boolean arg3) {
        if (this.field10 == null || this.field9 != arg2) {
            if (!this.field4.method148(-123, arg1, arg0)) {
                return null;
            }
            this.field17 = arg3 ? 64 : 128;
            this.field10 = this.field4.method147(this.field8, arg1, this.field17, (double) arg2, this.field17, arg0, true, true);
            this.field9 = arg2;
            if (this.field5) {
                int[] var5 = new int[this.field17];
                int[] var6 = new int[this.field17];
                int[] var7 = new int[this.field17];
                int[] var8 = new int[this.field17 * this.field17];
                int var9 = this.field17;
                int var10 = this.field17;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field10[var14];
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
                        int var32 = this.field10[var14];
                        var15--;
                        int var33 = this.field10[var15];
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
                this.field10 = var8;
            }
        }
        return this.field10;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII[F)V", line = 159)
    private static final void method3(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class60.method408(arg2, true)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class60.method408(arg3, true)) {
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
            GL var8 = class232.field3716;
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

    @OriginalMember(owner = "client!ok", name = "d", descriptor = "(I)V", line = 273)
    public final void method4(int arg0) {
        if (this.field10 == null || this.field7 == 0 && this.field2 == 0) {
            return;
        }
        if (field18 == null || field18.length < this.field10.length) {
            field18 = new int[this.field10.length];
        }
        int var2 = this.field10.length;
        int var3 = this.field2 * arg0;
        int var4 = this.field17 - 1;
        int var5 = this.field17 * arg0 * this.field7;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field17) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field17; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field18[var10] = this.field10[var11];
            }
        }
        int[] var12 = this.field10;
        this.field10 = field18;
        field18 = var12;
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(IIIIII[I)V", line = 324)
    private static final void method5(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class60.method408(arg2, true)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class60.method408(arg3, true)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class232.field3716;
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

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "()V", line = 425)
    public static void method6() {
        field18 = null;
    }

    @OriginalMember(owner = "client!ok", name = "<init>", descriptor = "(Ljj;)V", line = 598)
    public class1(class44 arg0) {
        this.field4 = new class25(arg0);
        this.field5 = arg0.method286((byte) -128) == 1;
        this.field8 = arg0.method286((byte) -121) == 1;
        this.field12 = arg0.method286((byte) -92) == 1;
        this.field3 = arg0.method286((byte) -64) == 1;
        int var2 = arg0.method286((byte) -74) & 0x3;
        this.field2 = arg0.method246((byte) -39);
        this.field7 = arg0.method246((byte) -73);
        int var3 = arg0.method286((byte) -92);
        arg0.method286((byte) -116);
        this.field15 = arg0.method286((byte) -124) == 1;
        this.field1 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field11 = 2;
        } else if (var2 == 2) {
            this.field11 = 3;
        } else if (var2 == 3) {
            this.field11 = 4;
        } else {
            this.field11 = 0;
        }
    }

    @OriginalMember(owner = "client!ok", name = "finalize", descriptor = "()V", line = 441)
    protected final void finalize() throws Throwable {
        if (this.field6 != -1) {
            class230.method1630(this.field6, this.field14, this.field13);
            this.field6 = -1;
            this.field14 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Leg;Lak;Z)[I", line = 464)
    public final int[] method7(class154 arg0, class172 arg1, boolean arg2) {
        if (this.field4.method148(-13, arg1, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field4.method147(this.field8, arg1, var4, 1.0D, var4, arg0, false, true);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ok", name = "a", descriptor = "(Leg;Lak;I)Z", line = 473)
    public final boolean method8(class154 arg0, class172 arg1, int arg2) {
        if (!this.field4.method148(-64, arg1, arg0)) {
            return false;
        }
        GL var4 = class232.field3716;
        int var5 = class131.method967(45);
        if ((var5 & 0x1) == 0) {
            if (this.field6 != -1 && this.field17 == arg2) {
                class232.method1662(this.field6);
            } else {
                if (this.field6 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field6 = var6[0];
                    this.field13 = class230.field3658;
                }
                class232.method1662(this.field6);
                if (this.field15 && class269.method1912()) {
                    float[] var7 = this.field4.method141(arg2, -117, arg0, this.field8, arg1, arg2);
                    if (this.field1 == 2) {
                        method3(class249.field3902, class249.field3908, arg2, arg2, class249.field3905, class249.field3915, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class230.field3663 += var7.length * 4 / 3 - this.field14;
                        this.field14 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class230.field3663 += var7.length - this.field14;
                        this.field14 = var7.length;
                    }
                } else {
                    int var8 = class232.field3718 ? 33639 : 5121;
                    int[] var9 = this.field4.method138(arg0, arg2, arg2, this.field8, arg1, (byte) 42, 0.7D);
                    if (this.field1 == 2) {
                        method5(class249.field3902, class249.field3905, arg2, arg2, class249.field3906, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class230.field3663 += var9.length * 4 / 3 - this.field14;
                        this.field14 = var9.length * 4 / 3;
                    } else if (this.field1 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class230.field3663 += var9.length * 4 / 3 - this.field14;
                                this.field14 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field4.method138(arg0, arg2, arg2, this.field8, arg1, (byte) 42, 0.7D);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class230.field3663 += var9.length - this.field14;
                        this.field14 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field12 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field3 ? 10497 : 33071);
                this.field17 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class232.method1677(this.field11);
        }
        if ((var5 & 0x4) == 0) {
            class232.method1664(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field7 == 0 && this.field2 == 0) {
                class232.method1654();
            } else {
                float var11 = (float) (class232.field3701 * this.field7) / (float) this.field17;
                float var12 = (float) (class232.field3701 * this.field2) / (float) this.field17;
                class232.method1683(var12, var11, 0.0F);
            }
        }
        return true;
    }
}
