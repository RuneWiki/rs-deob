import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class443;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cl")
public class class242 extends class481 implements class483 {

    @OriginalMember(owner = "client!cl", name = "g", descriptor = "I")
    private int field3461;

    @OriginalMember(owner = "client!cl", name = "f", descriptor = "I")
    private int field3460;

    @OriginalMember(owner = "client!cl", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field3463;

    @OriginalMember(owner = "client!cl", name = "h", descriptor = "Z")
    public boolean field3462;

    @OriginalMember(owner = "client!cl", name = "j", descriptor = "Z")
    public boolean field3464;

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(IIIII[III)V")
    public final void method782(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        int var9 = -87 / ((arg7 - 62) / 56);
        if (class583.field8126 != this.field6702 || class82.field1147 != this.field6701) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6698.field715;
        int var11 = this.field3463.LockRect(0, arg0, arg2, arg1, arg6, 0, var10);
        if (!class443.method2538(-1, var11)) {
            return;
        }
        int var12 = var10.getRowPitch();
        if (arg1 * 4 == var12 && arg1 == arg3) {
            var10.method2564(arg5, arg4, 0, arg1 * arg6);
        } else {
            for (int var13 = 0; var13 < arg6; var13++) {
                var10.method2564(arg5, arg3 * var13 + arg4, var12 * var13, arg1);
            }
        }
        this.field3463.UnlockRect(0);
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method130(int arg0) {
        if (arg0 < 9) {
            this.field3461 = 36;
        }
        return this.field3463;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(BLqaa;)V")
    public final void method131(byte arg0, class26 arg1) {
        if (arg0 <= 24) {
            this.method787(0.35449877F, (byte) 61);
        }
        super.method131((byte) 110, arg1);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FB)F")
    public final float method787(float arg0, byte arg1) {
        return arg1 < 24 ? -0.14824681F : arg0 / (float) this.field3461;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "([BIIILkf;ZIII)V")
    public final void method783(byte[] arg0, int arg1, int arg2, int arg3, class229 arg4, boolean arg5, int arg6, int arg7, int arg8) {
        if (this.field6702 != arg4 || class82.field1147 != this.field6701) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field6698.field715;
        if (!arg5) {
            return;
        }
        int var11 = this.field3463.LockRect(0, arg6, arg1, arg2, arg3, 0, var10);
        if (!class443.method2538(-1, var11)) {
            return;
        }
        int var12 = this.field6702.field3277 * arg8;
        int var13 = this.field6702.field3277 * arg2;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2562(arg0, arg7, 0, arg3 * var13);
        } else {
            for (int var15 = 0; var15 < arg3; var15++) {
                var10.method2562(arg0, arg7 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field3463.UnlockRect(0);
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(B)V")
    public final void method129(byte arg0) {
        this.field6698.method287((byte) -23, this);
        if (arg0 != -33) {
            this.field3463 = null;
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(I)I")
    public final int method785(int arg0) {
        return arg0 > -55 ? -73 : this.field3461;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(Z)Z")
    public final boolean method788(boolean arg0) {
        return arg0 ? true : true;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lvg;IIZ[III)V")
    public class242(class49 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class583.field8126, class82.field1147, arg3 && arg0.field731, arg1 * arg2);
        if (this.field6698.field709) {
            this.field3461 = arg2;
            this.field3460 = arg1;
        } else {
            this.field3460 = class350.method2082(-17, arg1);
            this.field3461 = class350.method2082(127, arg2);
        }
        if (arg3) {
            this.field3463 = this.field6698.field720.method2553(this.field3460, this.field3461, 0, 1024, 21, 1);
        } else {
            this.field3463 = this.field6698.field720.method2553(this.field3460, this.field3461, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field6698.field715;
        int var9 = this.field3463.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class443.method2538(-1, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2564(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2564(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field3463.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(ZIZ)V")
    public final void method786(boolean arg0, int arg1, boolean arg2) {
        if (arg1 != 27469) {
            this.field3461 = 63;
        }
        this.field3464 = arg0;
        this.field3462 = arg2;
    }

    @OriginalMember(owner = "client!cl", name = "a", descriptor = "(FI)F")
    public final float method781(float arg0, int arg1) {
        if (arg1 != -8639) {
            this.method785(-30);
        }
        return arg0 / (float) this.field3460;
    }

    @OriginalMember(owner = "client!cl", name = "b", descriptor = "(B)I")
    public final int method780(byte arg0) {
        if (arg0 != -93) {
            this.field3463 = null;
        }
        return this.field3460;
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lvg;Lkf;IIZ[BII)V")
    public class242(class49 arg0, class229 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class82.field1147, arg4 && arg0.field731, arg2 * arg3);
        if (this.field6698.field709) {
            this.field3461 = arg3;
            this.field3460 = arg2;
        } else {
            this.field3460 = class350.method2082(-112, arg2);
            this.field3461 = class350.method2082(127, arg3);
        }
        if (arg4) {
            this.field3463 = this.field6698.field720.method2553(this.field3460, this.field3461, 0, 1024, class49.method359(class82.field1147, false, this.field6702), 1);
        } else {
            this.field3463 = this.field6698.field720.method2553(this.field3460, this.field3461, 1, 0, class49.method359(class82.field1147, false, this.field6702), 1);
        }
        PixelBuffer var9 = this.field6698.field715;
        int var10 = this.field3463.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class443.method2538(-1, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field6702.field3277 * arg2;
            int var12 = this.field6702.field3277 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2562(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2562(arg5, var12 * var14 + arg6, var13 * var14, var11);
                }
            }
            this.field3463.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!cl", name = "<init>", descriptor = "(Lvg;Lkf;Lps;II)V")
    public class242(class49 arg0, class229 arg1, class82 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field6698.field709) {
            this.field3460 = arg3;
            this.field3461 = arg4;
        } else {
            this.field3460 = class350.method2082(127, arg3);
            this.field3461 = class350.method2082(126, arg4);
        }
        this.field3463 = this.field6698.field720.method2553(arg3, arg4, 1, 0, class49.method359(this.field6701, false, this.field6702), 1);
    }
}
