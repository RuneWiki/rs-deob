import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class483;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vs")
public class class592 extends class44 implements class334 {

    @OriginalMember(owner = "client!vs", name = "g", descriptor = "I")
    private int field8253;

    @OriginalMember(owner = "client!vs", name = "j", descriptor = "I")
    private int field8256;

    @OriginalMember(owner = "client!vs", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field8252;

    @OriginalMember(owner = "client!vs", name = "h", descriptor = "Z")
    public boolean field8254;

    @OriginalMember(owner = "client!vs", name = "i", descriptor = "Z")
    public boolean field8255;

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIIIII[BLkt;I)V")
    public final void method1691(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, class159 arg7, int arg8) {
        if (this.field479 != arg7 || class594.field8277 != this.field477) {
            throw new RuntimeException();
        }
        if (arg5 != -26946) {
            this.field8255 = true;
        }
        PixelBuffer var10 = this.field476.field2915;
        int var11 = this.field8252.LockRect(0, arg8, arg3, arg2, arg4, 0, var10);
        if (!class483.method2718(-21593, var11)) {
            return;
        }
        int var12 = this.field479.field2006 * arg0;
        int var13 = this.field479.field2006 * arg2;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2739(arg6, arg1, 0, arg4 * var13);
        } else {
            for (int var15 = 0; var15 < arg4; var15++) {
                var10.method2739(arg6, arg1 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field8252.UnlockRect(0);
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lbea;IIZ[III)V")
    public class592(class225 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class758.field10567, class594.field8277, arg3 && arg0.field2927, arg1 * arg2);
        if (this.field476.field2929) {
            this.field8253 = arg1;
            this.field8256 = arg2;
        } else {
            this.field8253 = class128.method814(423660257, arg1);
            this.field8256 = class128.method814(423660257, arg2);
        }
        if (arg3) {
            this.field8252 = this.field476.field2918.method2733(this.field8253, this.field8256, 0, 1024, 21, 1);
        } else {
            this.field8252 = this.field476.field2918.method2733(this.field8253, this.field8256, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field476.field2915;
        int var9 = this.field8252.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class483.method2718(-21593, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method2741(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2741(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field8252.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(I)V")
    public final void method1468(int arg0) {
        this.field476.method1322(false, this);
        if (arg0 < 14) {
            this.field8252 = null;
        }
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IF)F")
    public final float method1688(int arg0, float arg1) {
        return arg0 == -8473 ? arg1 / (float) this.field8256 : 1.9078624F;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lbea;Lkt;Lkq;II)V")
    public class592(class225 arg0, class159 arg1, class594 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field476.field2929) {
            this.field8256 = arg4;
            this.field8253 = arg3;
        } else {
            this.field8253 = class128.method814(423660257, arg3);
            this.field8256 = class128.method814(423660257, arg4);
        }
        this.field8252 = this.field476.field2918.method2733(arg3, arg4, 1, 0, class225.method1302(-1935, this.field479, this.field477), 1);
    }

    @OriginalMember(owner = "client!vs", name = "b", descriptor = "(I)I")
    public final int method1693(int arg0) {
        return arg0 < 109 ? 5 : this.field8256;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BF)F")
    public final float method1692(byte arg0, float arg1) {
        int var3 = -41 % ((arg0 + 5) / 39);
        return arg1 / (float) this.field8253;
    }

    @OriginalMember(owner = "client!vs", name = "<init>", descriptor = "(Lbea;Lkt;IIZ[BII)V")
    public class592(class225 arg0, class159 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class594.field8277, arg4 && arg0.field2927, arg2 * arg3);
        if (this.field476.field2929) {
            this.field8256 = arg3;
            this.field8253 = arg2;
        } else {
            this.field8253 = class128.method814(423660257, arg2);
            this.field8256 = class128.method814(423660257, arg3);
        }
        if (arg4) {
            this.field8252 = this.field476.field2918.method2733(this.field8253, this.field8256, 0, 1024, class225.method1302(-1935, this.field479, class594.field8277), 1);
        } else {
            this.field8252 = this.field476.field2918.method2733(this.field8253, this.field8256, 1, 0, class225.method1302(-1935, this.field479, class594.field8277), 1);
        }
        PixelBuffer var9 = this.field476.field2915;
        int var10 = this.field8252.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class483.method2718(-21593, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field479.field2006 * arg2;
            int var12 = this.field479.field2006 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2739(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2739(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field8252.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!vs", name = "d", descriptor = "(I)Z")
    public final boolean method1696(int arg0) {
        if (arg0 > -22) {
            this.field8254 = false;
        }
        return true;
    }

    @OriginalMember(owner = "client!vs", name = "c", descriptor = "(I)I")
    public final int method1690(int arg0) {
        if (arg0 != 12941) {
            this.field8255 = false;
        }
        return this.field8253;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(BLnd;)V")
    public final void method272(byte arg0, class545 arg1) {
        super.method272(arg0, arg1);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method271(byte arg0) {
        if (arg0 != 18) {
            this.method272((byte) -23, null);
        }
        return this.field8252;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(IIBII[II)V")
    public final void method1695(int arg0, int arg1, byte arg2, int arg3, int arg4, int[] arg5, int arg6) {
        if (class758.field10567 != this.field479 || class594.field8277 != this.field477) {
            throw new RuntimeException();
        }
        int var8 = 75 % ((-arg2 - 48) / 59);
        PixelBuffer var9 = this.field476.field2915;
        int var10 = this.field8252.LockRect(0, arg4, arg6, arg0, arg3, 16, var9);
        if (!class483.method2718(-21593, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg0 * 4) == var11) {
            var9.method2742(arg5, arg1, 0, arg5.length);
        } else {
            for (int var12 = 0; var12 < arg3; var12++) {
                var9.method2742(arg5, arg0 * var12 + arg1, var11 * var12, arg0);
            }
        }
        this.field8252.UnlockRect(0);
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(ZZI)V")
    public final void method1694(boolean arg0, boolean arg1, int arg2) {
        int var4 = 93 / ((17 - arg2) / 36);
        this.field8254 = arg0;
        this.field8255 = arg1;
    }

    @OriginalMember(owner = "client!vs", name = "a", descriptor = "(III[IIIII)V")
    public final void method1697(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class758.field10567 != this.field479 || class594.field8277 != this.field477) {
            throw new RuntimeException();
        } else if (arg0 == 17779) {
            PixelBuffer var9 = this.field476.field2915;
            int var10 = this.field8252.LockRect(0, arg4, arg1, arg7, arg2, 0, var9);
            if (class483.method2718(-21593, var10)) {
                int var11 = var9.getRowPitch();
                if ((arg7 * 4) == var11 && arg6 == arg7) {
                    var9.method2741(arg3, arg5, 0, arg2 * arg7);
                } else {
                    for (int var12 = 0; var12 < arg2; var12++) {
                        var9.method2741(arg3, arg6 * var12 + arg5, var11 * var12, arg7);
                    }
                }
                this.field8252.UnlockRect(0);
            }
        }
    }
}
