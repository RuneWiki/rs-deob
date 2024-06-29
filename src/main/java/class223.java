import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.security.InvalidParameterException;
import javax.media.opengl.GL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ia")
public class class223 extends class29 {

    @OriginalMember(owner = "client!ia", name = "A", descriptor = "I")
    private int field3545 = -1;

    @OriginalMember(owner = "client!ia", name = "J", descriptor = "Z")
    public boolean field3554 = false;

    @OriginalMember(owner = "client!ia", name = "K", descriptor = "I")
    private int field3555 = 0;

    @OriginalMember(owner = "client!ia", name = "E", descriptor = "Lef;")
    public class339 field3549;

    @OriginalMember(owner = "client!ia", name = "N", descriptor = "Z")
    private boolean field3557;

    @OriginalMember(owner = "client!ia", name = "G", descriptor = "Z")
    private boolean field3551;

    @OriginalMember(owner = "client!ia", name = "B", descriptor = "Z")
    private boolean field3546;

    @OriginalMember(owner = "client!ia", name = "P", descriptor = "Z")
    private boolean field3559;

    @OriginalMember(owner = "client!ia", name = "F", descriptor = "I")
    private int field3550;

    @OriginalMember(owner = "client!ia", name = "O", descriptor = "I")
    private int field3558;

    @OriginalMember(owner = "client!ia", name = "I", descriptor = "Z")
    private boolean field3553;

    @OriginalMember(owner = "client!ia", name = "C", descriptor = "I")
    private int field3547;

    @OriginalMember(owner = "client!ia", name = "M", descriptor = "I")
    private int field3556;

    @OriginalMember(owner = "client!ia", name = "Q", descriptor = "F")
    private float field3560;

    @OriginalMember(owner = "client!ia", name = "D", descriptor = "I")
    private int field3548;

    @OriginalMember(owner = "client!ia", name = "H", descriptor = "I")
    private int field3552;

    @OriginalMember(owner = "client!ia", name = "z", descriptor = "[I")
    private int[] field3544;

    @OriginalMember(owner = "client!ia", name = "R", descriptor = "[I")
    public static int[] field3561;

    @OriginalMember(owner = "client!ia", name = "c", descriptor = "(I)V", line = 9)
    public final void method1626(int arg0) {
        if (this.field3544 == null || this.field3558 == 0 && this.field3550 == 0) {
            return;
        }
        if (field3561 == null || field3561.length < this.field3544.length) {
            field3561 = new int[this.field3544.length];
        }
        int var2 = this.field3544.length;
        int var3 = this.field3550 * arg0;
        int var4 = this.field3552 - 1;
        int var5 = this.field3552 * arg0 * this.field3558;
        int var6 = var2 - 1;
        for (int var7 = 0; var7 < var2; var7 += this.field3552) {
            int var8 = var5 + var7 & var6;
            for (int var9 = 0; var9 < this.field3552; var9++) {
                int var10 = var7 + var9;
                int var11 = (var3 + var9 & var4) + var8;
                field3561[var10] = this.field3544[var11];
            }
        }
        int[] var12 = this.field3544;
        this.field3544 = field3561;
        field3561 = var12;
    }

    @OriginalMember(owner = "client!ia", name = "<init>", descriptor = "(Lim;)V", line = 598)
    public class223(class192 arg0) {
        this.field3549 = new class339(arg0);
        this.field3557 = arg0.method1399(-1172389784) == 1;
        this.field3551 = arg0.method1399(-1172389784) == 1;
        this.field3546 = arg0.method1399(-1172389784) == 1;
        this.field3559 = arg0.method1399(-1172389784) == 1;
        int var2 = arg0.method1399(-1172389784) & 0x3;
        this.field3550 = arg0.method1377(true);
        this.field3558 = arg0.method1377(true);
        int var3 = arg0.method1399(-1172389784);
        arg0.method1399(-1172389784);
        this.field3553 = arg0.method1399(-1172389784) == 1;
        this.field3547 = var3 >> 4 & 0xF;
        if (var2 == 1) {
            this.field3556 = 2;
        } else if (var2 == 2) {
            this.field3556 = 3;
        } else if (var2 == 3) {
            this.field3556 = 4;
        } else {
            this.field3556 = 0;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "()V", line = 67)
    public static void method1627() {
        field3561 = null;
    }

    @OriginalMember(owner = "client!ia", name = "finalize", descriptor = "()V", line = 70)
    protected final void finalize() throws Throwable {
        if (this.field3545 != -1) {
            class275.method1957(this.field3545, this.field3555, this.field3548);
            this.field3545 = -1;
            this.field3555 = 0;
        }
        super.finalize();
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lmn;Lkb;)Z", line = 84)
    public final boolean method1628(class177 arg0, class39 arg1) {
        return this.field3549.method2341(arg1, arg0, (byte) 121);
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lmn;Lkb;I)Z", line = 89)
    public final boolean method1629(class177 arg0, class39 arg1, int arg2) {
        if (!this.field3549.method2341(arg1, arg0, (byte) 126)) {
            return false;
        }
        GL var4 = class186.field2990;
        int var5 = class182.method1259(121);
        if ((var5 & 0x1) == 0) {
            if (this.field3545 != -1 && this.field3552 == arg2) {
                class186.method1288(this.field3545);
            } else {
                if (this.field3545 == -1) {
                    int[] var6 = new int[1];
                    var4.glGenTextures(1, var6, 0);
                    this.field3545 = var6[0];
                    this.field3548 = class275.field4359;
                }
                class186.method1288(this.field3545);
                if (this.field3553 && class199.method1454()) {
                    float[] var7 = this.field3549.method2339(arg0, this.field3551, arg2, arg2, arg1, (byte) 72);
                    if (this.field3547 == 2) {
                        method1633(class96.field1462, class96.field1468, arg2, arg2, class96.field1465, class96.field1475, var7);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class275.field4358 += var7.length * 4 / 3 - this.field3555;
                        this.field3555 = var7.length * 4 / 3;
                    } else {
                        var4.glTexImage2D(3553, 0, 34842, arg2, arg2, 0, 6408, 5126, FloatBuffer.wrap(var7));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class275.field4358 += var7.length - this.field3555;
                        this.field3555 = var7.length;
                    }
                } else {
                    int var8 = class186.field3014 ? 33639 : 5121;
                    int[] var9 = this.field3549.method2337(arg2, 0.7D, -122, arg2, this.field3551, arg1, arg0);
                    if (this.field3547 == 2) {
                        method1632(class96.field1462, class96.field1465, arg2, arg2, class96.field1466, var8, var9);
                        var4.glTexParameteri(3553, 10241, 9987);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class275.field4358 += var9.length * 4 / 3 - this.field3555;
                        this.field3555 = var9.length * 4 / 3;
                    } else if (this.field3547 == 1) {
                        int var10 = 0;
                        while (true) {
                            var4.glTexImage2D(3553, var10++, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                            arg2 >>= 0x1;
                            if (arg2 == 0) {
                                var4.glTexParameteri(3553, 10241, 9987);
                                var4.glTexParameteri(3553, 10240, 9729);
                                class275.field4358 += var9.length * 4 / 3 - this.field3555;
                                this.field3555 = var9.length * 4 / 3;
                                break;
                            }
                            var9 = this.field3549.method2337(arg2, 0.7D, 28, arg2, this.field3551, arg1, arg0);
                        }
                    } else {
                        var4.glTexImage2D(3553, 0, 6408, arg2, arg2, 0, 32993, var8, IntBuffer.wrap(var9));
                        var4.glTexParameteri(3553, 10241, 9729);
                        var4.glTexParameteri(3553, 10240, 9729);
                        class275.field4358 += var9.length - this.field3555;
                        this.field3555 = var9.length;
                    }
                }
                var4.glTexParameteri(3553, 10242, this.field3546 ? 10497 : 33071);
                var4.glTexParameteri(3553, 10243, this.field3559 ? 10497 : 33071);
                this.field3552 = arg2;
            }
        }
        if ((var5 & 0x2) == 0) {
            class186.method1281(this.field3556);
        }
        if ((var5 & 0x4) == 0) {
            class186.method1299(0);
        }
        if ((var5 & 0x8) == 0) {
            if (this.field3558 == 0 && this.field3550 == 0) {
                class186.method1287();
            } else {
                float var11 = (float) (class186.field2993 * this.field3558) / (float) this.field3552;
                float var12 = (float) (class186.field2993 * this.field3550) / (float) this.field3552;
                class186.method1286(var12, var11, 0.0F);
            }
        }
        return true;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lmn;Lkb;FZ)[I", line = 213)
    public final int[] method1630(class177 arg0, class39 arg1, float arg2, boolean arg3) {
        if (this.field3544 == null || this.field3560 != arg2) {
            if (!this.field3549.method2341(arg1, arg0, (byte) 125)) {
                return null;
            }
            this.field3552 = arg3 ? 64 : 128;
            this.field3544 = this.field3549.method2334(arg0, (byte) 32, true, this.field3551, (double) arg2, this.field3552, this.field3552, arg1);
            this.field3560 = arg2;
            if (this.field3557) {
                int[] var5 = new int[this.field3552];
                int[] var6 = new int[this.field3552];
                int[] var7 = new int[this.field3552];
                int[] var8 = new int[this.field3552 * this.field3552];
                int var9 = this.field3552;
                int var10 = this.field3552;
                int var11 = var9 - 1;
                int var12 = var10 - 1;
                int var13 = var9 * var10;
                int var14;
                int var15 = var14 = var9;
                for (int var16 = 2; var16 >= 0; var16--) {
                    for (int var17 = var11; var17 >= 0; var17--) {
                        var14--;
                        int var18 = this.field3544[var14];
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
                        int var32 = this.field3544[var14];
                        var15--;
                        int var33 = this.field3544[var15];
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
                this.field3544 = var8;
            }
        }
        return this.field3544;
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(Lmn;Lkb;Z)[I", line = 371)
    public final int[] method1631(class177 arg0, class39 arg1, boolean arg2) {
        if (this.field3549.method2341(arg1, arg0, (byte) 109)) {
            int var4 = arg2 ? 64 : 128;
            return this.field3549.method2334(arg0, (byte) 32, false, this.field3551, 1.0D, var4, var4, arg1);
        } else {
            return null;
        }
    }

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII[I)V", line = 385)
    private static final void method1632(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class224.method1638((byte) -83, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class224.method1638((byte) -82, arg3)) {
            throw new InvalidParameterException("height must be power of 2");
        } else if (arg4 == 32993 || arg4 == 6408) {
            GL var7 = class186.field2990;
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

    @OriginalMember(owner = "client!ia", name = "a", descriptor = "(IIIIII[F)V", line = 484)
    private static final void method1633(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, float[] arg6) {
        if (arg2 == 0 || arg2 == Integer.MIN_VALUE || !class224.method1638((byte) -111, arg2)) {
            throw new InvalidParameterException("width must be power of 2");
        } else if (arg3 == 0 || arg3 == Integer.MIN_VALUE || !class224.method1638((byte) 94, arg3)) {
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
            GL var8 = class186.field2990;
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
}
