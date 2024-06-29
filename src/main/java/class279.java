import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!md")
public class class279 extends class301 {

    @OriginalMember(owner = "client!md", name = "x", descriptor = "I")
    private int field4547 = 0;

    @OriginalMember(owner = "client!md", name = "D", descriptor = "I")
    private int field4553 = -1;

    @OriginalMember(owner = "client!md", name = "K", descriptor = "Z")
    public boolean field4560 = false;

    @OriginalMember(owner = "client!md", name = "E", descriptor = "Lpl;")
    public class216 field4554;

    @OriginalMember(owner = "client!md", name = "B", descriptor = "Z")
    private boolean field4551;

    @OriginalMember(owner = "client!md", name = "I", descriptor = "Z")
    private boolean field4558;

    @OriginalMember(owner = "client!md", name = "C", descriptor = "Z")
    private boolean field4552;

    @OriginalMember(owner = "client!md", name = "F", descriptor = "Z")
    private boolean field4555;

    @OriginalMember(owner = "client!md", name = "G", descriptor = "I")
    private int field4556;

    @OriginalMember(owner = "client!md", name = "v", descriptor = "I")
    private int field4545;

    @OriginalMember(owner = "client!md", name = "H", descriptor = "Z")
    private boolean field4557;

    @OriginalMember(owner = "client!md", name = "z", descriptor = "I")
    private int field4549;

    @OriginalMember(owner = "client!md", name = "M", descriptor = "I")
    private int field4562;

    @OriginalMember(owner = "client!md", name = "y", descriptor = "F")
    private float field4548;

    @OriginalMember(owner = "client!md", name = "w", descriptor = "I")
    private int field4546;

    @OriginalMember(owner = "client!md", name = "A", descriptor = "I")
    private int field4550;

    @OriginalMember(owner = "client!md", name = "J", descriptor = "[I")
    public static int[] field4559;

    @OriginalMember(owner = "client!md", name = "L", descriptor = "[I")
    private int[] field4561;

    @OriginalMember(owner = "client!md", name = "finalize", descriptor = "()V", line = 6)
    protected final void finalize() throws Throwable {
        if (this.field4553 != -1) {
            class239.method1671(this.field4553, this.field4547, this.field4550);
            this.field4553 = -1;
            this.field4547 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII[F)V", line = 17)
    private static final void method1971(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class172.method1221(arg2, 0)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class172.method1221(arg3, 0)) {
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
            GL var8 = class241.field4012;
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

    @OriginalMember(owner = "client!md", name = "a", descriptor = "()V", line = 135)
    public static void method1972() {
        field4559 = null;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lli;Lek;I)Z", line = 143)
    public final boolean method1973(class245 arg0, class206 arg1, int arg2) {
        if (!this.field4554.method1508(arg1, (byte) -56, arg0)) {
            return false;
        }
        GL var4 = class241.field4012;
        int var5 = class292.method2077(2);
        if ((var5 & 0x1) == 0) {
            if (this.field4553 != -1 && this.field4546 == arg2) {
                class241.method1687(this.field4553);
            } else {
                if (this.field4553 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field4553 = var6[0];
                    this.field4550 = class239.field3974;
                }
                class241.method1687(this.field4553);
                if (this.field4557 && class163.method1173()) {
                    float[] var7 = this.field4554.method1501((byte) -123, arg2, arg1, this.field4558, arg2, arg0);
                    if (this.field4549 == 2) {
                        method1971(class62.field1195, class62.field1201, arg2, arg2, class62.field1198, class62.field1208, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class239.field3975 += var7.length * 4 / 3 - this.field4547;
                        this.field4547 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class239.field3975 += var7.length - this.field4547;
                        this.field4547 = var7.length;
                    }
                } else {
                    int var8 = class241.field4007 ? 33639 : 5121;
                    int[] var9 = this.field4554.method1506(arg1, arg0, 120, arg2, 0.7D, arg2, this.field4558);
                    if (this.field4549 == 2) {
                        method1976(class62.field1195, class62.field1198, arg2, arg2, class62.field1199, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class239.field3975 += var9.length * 4 / 3 - this.field4547;
                        this.field4547 = var9.length * 4 / 3;
                    } else if (this.field4549 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class239.field3975 += var9.length * 4 / 3 - this.field4547;
                                this.field4547 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field4554.method1506(arg1, arg0, 122, arg2, 0.7D, arg2, this.field4558);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class239.field3975 += var9.length - this.field4547;
                        this.field4547 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field4552 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field4555 ? 10497 : 33071);
                this.field4546 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class241.method1719(this.field4562);
        }
        if ((var5 & 0x4) == 0) {
            class241.method1718(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field4545 == 0 && this.field4556 == 0) {
                class241.method1702();
            } else {
                float var11 = (float) (class241.field4024 * this.field4545) / (float) this.field4546;
                float var12 = (float) (class241.field4024 * this.field4556) / (float) this.field4546;
                class241.method1686(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!md", name = "<init>", descriptor = "(Loe;)V", line = 598)
    public class279(class146 arg0) {
        this.field4554 = new class216(arg0);
        this.field4551 = arg0.method1005((byte) 122) == 1;
        this.field4558 = arg0.method1005((byte) 122) == 1;
        this.field4552 = arg0.method1005((byte) 122) == 1;
        this.field4555 = arg0.method1005((byte) 122) == 1;
        int var2 = arg0.method1005((byte) 122) & 0x3;
        this.field4556 = arg0.method1029(-2);
        this.field4545 = arg0.method1029(-2);
        int var3 = arg0.method1005((byte) 122);
        arg0.method1005((byte) 122);
        this.field4557 = arg0.method1005((byte) 122) == 1;
        this.field4549 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field4562 = 2;
        } else if (var2 == 2) {
            this.field4562 = 3;
        } else if (var2 == 3) {
            this.field4562 = 4;
        } else {
            this.field4562 = 0;
        }
    }

    @OriginalMember(owner = "client!md", name = "d", descriptor = "(I)V", line = 271)
    public final void method1974(int arg0) {
        if (this.field4561 == null || this.field4545 == 0 && this.field4556 == 0) {
            return;
        }
        if (field4559 == null || field4559.length < this.field4561.length) {
            field4559 = new int[this.field4561.length];
        }
        int var2 = this.field4561.length;
        int var3 = this.field4556 * arg0;
        int var4 = this.field4546 - 1;
        int var5 = this.field4546 * arg0 * this.field4545;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field4546) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field4546; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field4559[var10] = this.field4561[var11];
            }
        }
        int[] var12 = this.field4561;
        this.field4561 = field4559;
        field4559 = var12;
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lli;Lek;Z)[I", line = 323)
    public final int[] method1975(class245 arg0, class206 arg1, boolean arg2) {
        if (this.field4554.method1508(arg1, (byte) -56, arg0)) {
            int var4 = arg2 ? 64 : 128;
            return this.field4554.method1503(false, 1.0D, arg0, this.field4558, arg1, var4, 21374, var4);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(IIIIII[I)V", line = 338)
    private static final void method1976(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class172.method1221(arg2, 0)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class172.method1221(arg3, 0)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class241.field4012;
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

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lli;Lek;)Z", line = 437)
    public final boolean method1977(class245 arg0, class206 arg1) {
        return this.field4554.method1508(arg1, (byte) -56, arg0);
    }

    @OriginalMember(owner = "client!md", name = "a", descriptor = "(Lli;Lek;FZ)[I", line = 442)
    public final int[] method1978(class245 arg0, class206 arg1, float arg2, boolean arg3) {
        if (this.field4561 == null || this.field4548 != arg2) {
            if (!this.field4554.method1508(arg1, (byte) -56, arg0)) {
                return null;
            }
            this.field4546 = arg3 ? 64 : 128;
            this.field4561 = this.field4554.method1503(true, (double) arg2, arg0, this.field4558, arg1, this.field4546, 21374, this.field4546);
            this.field4548 = arg2;
            if (this.field4551) {
                int[] var5 = new int[this.field4546];
                int[] var6 = new int[this.field4546];
                int[] var7 = new int[this.field4546];
                int[] var8 = new int[this.field4546 * this.field4546];
                int var9 = this.field4546;
                int var10 = this.field4546;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field4561[var14];
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
                        int var32 = this.field4561[var14];
                        var15--;
                        int var33 = this.field4561[var15];
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
                this.field4561 = var8;
            }
        }
        return this.field4561;
    }
}
