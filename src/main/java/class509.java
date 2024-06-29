import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class481;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dk")
public class class509 extends class31 implements class358 {

    @OriginalMember(owner = "client!dk", name = "i", descriptor = "I")
    private int field7245;

    @OriginalMember(owner = "client!dk", name = "g", descriptor = "I")
    private int field7243;

    @OriginalMember(owner = "client!dk", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field7242;

    @OriginalMember(owner = "client!dk", name = "h", descriptor = "Z")
    public boolean field7244;

    @OriginalMember(owner = "client!dk", name = "j", descriptor = "Z")
    public boolean field7246;

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Z)I")
    public final int method603(boolean arg0) {
        if (!arg0) {
            this.method606(86, 0.57438856F);
        }
        return this.field7243;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lhl;Lwd;Ljm;II)V")
    public class509(class527 arg0, class272 arg1, class687 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field355.field7515) {
            this.field7245 = arg3;
            this.field7243 = arg4;
        } else {
            this.field7245 = class756.method4202(true, arg3);
            this.field7243 = class756.method4202(true, arg4);
        }
        this.field7242 = this.field355.field7501.method2910(arg3, arg4, 1, 0, class527.method3093(this.field357, this.field356, 116), 1);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIB[BIIILwd;I)V")
    public final void method601(int arg0, int arg1, byte arg2, byte[] arg3, int arg4, int arg5, int arg6, class272 arg7, int arg8) {
        if (this.field357 != arg7 || class687.field9697 != this.field356) {
            throw new RuntimeException();
        }
        int var10 = -68 % ((-arg2 - 60) / 47);
        PixelBuffer var11 = this.field355.field7514;
        int var12 = this.field7242.LockRect(0, arg4, arg8, arg1, arg0, 0, var11);
        if (!class481.method2896(var12, 2005530520)) {
            return;
        }
        int var13 = this.field357.field3357 * arg1;
        int var14 = this.field357.field3357 * arg5;
        int var15 = var11.getRowPitch();
        if (var13 == var15 && var13 == var14) {
            var11.method2917(arg3, arg6, 0, arg0 * var13);
        } else {
            for (int var16 = 0; var16 < arg0; var16++) {
                var11.method2917(arg3, var14 * var16 + arg6, var15 * var16, var13);
            }
        }
        this.field7242.UnlockRect(0);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IIII[IIZI)V")
    public final void method605(int arg0, int arg1, int arg2, int arg3, int[] arg4, int arg5, boolean arg6, int arg7) {
        if (class102.field1058 != this.field357 || class687.field9697 != this.field356) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field355.field7514;
        int var10 = this.field7242.LockRect(0, arg5, arg3, arg1, arg7, 0, var9);
        if (class481.method2896(var10, 2005530520)) {
            int var11 = var9.getRowPitch();
            if ((arg1 * 4) == var11 && arg1 == arg2) {
                var9.method2919(arg4, arg0, 0, arg1 * arg7);
            } else {
                for (int var12 = 0; var12 < arg7; var12++) {
                    var9.method2919(arg4, arg2 * var12 + arg0, var11 * var12, arg1);
                }
            }
            this.field7242.UnlockRect(0);
        }
        if (arg6) {
            this.field7242 = null;
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I)I")
    public final int method608(int arg0) {
        if (arg0 != -27620) {
            this.field7245 = 27;
        }
        return this.field7245;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(FI)F")
    public final float method599(float arg0, int arg1) {
        int var3 = -95 / ((arg1 + 41) / 47);
        return arg0 / (float) this.field7243;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(I[IIIIII)V")
    public final void method607(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class102.field1058 != this.field357 || class687.field9697 != this.field356) {
            throw new RuntimeException();
        }
        if (arg6 != 2444) {
            this.field7243 = 39;
        }
        PixelBuffer var8 = this.field355.field7514;
        int var9 = this.field7242.LockRect(0, arg5, arg4, arg2, arg3, 16, var8);
        if (!class481.method2896(var9, 2005530520)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if ((arg2 * 4) == var10) {
            var8.method2920(arg1, arg0, 0, arg1.length);
        } else {
            for (int var11 = 0; var11 < arg3; var11++) {
                var8.method2920(arg1, arg2 * var11 + arg0, var10 * var11, arg2);
            }
        }
        this.field7242.UnlockRect(0);
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lhl;Lwd;IIZ[BII)V")
    public class509(class527 arg0, class272 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class687.field9697, arg4 && arg0.field7525, arg2 * arg3);
        if (this.field355.field7515) {
            this.field7245 = arg2;
            this.field7243 = arg3;
        } else {
            this.field7245 = class756.method4202(true, arg2);
            this.field7243 = class756.method4202(true, arg3);
        }
        if (arg4) {
            this.field7242 = this.field355.field7501.method2910(this.field7245, this.field7243, 0, 1024, class527.method3093(this.field357, class687.field9697, -66), 1);
        } else {
            this.field7242 = this.field355.field7501.method2910(this.field7245, this.field7243, 1, 0, class527.method3093(this.field357, class687.field9697, 123), 1);
        }
        PixelBuffer var9 = this.field355.field7514;
        int var10 = this.field7242.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class481.method2896(var10, 2005530520)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field357.field3357 * arg7;
            int var12 = this.field357.field3357 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2917(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2917(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field7242.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (arg0 < 38) {
            this.field7243 = -16;
        }
        this.field355.method3090(1, this);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(IF)F")
    public final float method606(int arg0, float arg1) {
        if (arg0 != 13050) {
            this.method607(74, null, 103, 79, 25, 18, -56);
        }
        return arg1 / (float) this.field7245;
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(B)Z")
    public final boolean method600(byte arg0) {
        if (arg0 >= -113) {
            this.method154(true);
        }
        return true;
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(Lqo;I)V")
    public final void method155(class22 arg0, int arg1) {
        super.method155(arg0, arg1);
    }

    @OriginalMember(owner = "client!dk", name = "a", descriptor = "(ZZB)V")
    public final void method604(boolean arg0, boolean arg1, byte arg2) {
        if (arg2 != -43) {
            this.field7246 = true;
        }
        this.field7246 = arg1;
        this.field7244 = arg0;
    }

    @OriginalMember(owner = "client!dk", name = "<init>", descriptor = "(Lhl;IIZ[III)V")
    public class509(class527 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class102.field1058, class687.field9697, arg3 && arg0.field7525, arg1 * arg2);
        if (this.field355.field7515) {
            this.field7243 = arg2;
            this.field7245 = arg1;
        } else {
            this.field7245 = class756.method4202(true, arg1);
            this.field7243 = class756.method4202(true, arg2);
        }
        if (arg3) {
            this.field7242 = this.field355.field7501.method2910(this.field7245, this.field7243, 0, 1024, 21, 1);
        } else {
            this.field7242 = this.field355.field7501.method2910(this.field7245, this.field7243, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field355.field7514;
        int var9 = this.field7242.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class481.method2896(var9, 2005530520)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2919(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2919(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field7242.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!dk", name = "b", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method154(boolean arg0) {
        if (arg0) {
            this.field7246 = false;
        }
        return this.field7242;
    }
}
