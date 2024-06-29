import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class672;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ir")
public class class328 extends class588 implements class612 {

    @OriginalMember(owner = "client!ir", name = "g", descriptor = "I")
    private int field4553;

    @OriginalMember(owner = "client!ir", name = "j", descriptor = "I")
    private int field4556;

    @OriginalMember(owner = "client!ir", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field4552;

    @OriginalMember(owner = "client!ir", name = "h", descriptor = "Z")
    public boolean field4554;

    @OriginalMember(owner = "client!ir", name = "i", descriptor = "Z")
    public boolean field4555;

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(Z)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method650(boolean arg0) {
        if (arg0) {
            this.method418(-1.4860406F, true);
        }
        return this.field4552;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IZZ)V")
    public final void method414(int arg0, boolean arg1, boolean arg2) {
        if (arg0 < 96) {
            this.field4552 = null;
        }
        this.field4554 = arg2;
        this.field4555 = arg1;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(FZ)F")
    public final float method418(float arg0, boolean arg1) {
        if (arg1) {
            this.field4554 = false;
        }
        return arg0 / (float) this.field4556;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IF)F")
    public final float method416(int arg0, float arg1) {
        if (arg0 != -14098) {
            this.method650(true);
        }
        return arg1 / (float) this.field4553;
    }

    @OriginalMember(owner = "client!ir", name = "d", descriptor = "(I)I")
    public final int method417(int arg0) {
        return arg0 == 7782 ? this.field4556 : 38;
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(BLtn;)V")
    public final void method394(byte arg0, class166 arg1) {
        super.method394((byte) -104, arg1);
        if (arg0 >= -92) {
            this.method416(109, 1.2633231F);
        }
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Loe;Ljb;IIZ[BII)V")
    public class328(class13 arg0, class666 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class689.field9771, arg4 && arg0.field176, arg2 * arg3);
        if (this.field8582.field161) {
            this.field4556 = arg3;
            this.field4553 = arg2;
        } else {
            this.field4553 = class99.method830(arg2, false);
            this.field4556 = class99.method830(arg3, false);
        }
        if (arg4) {
            this.field4552 = this.field8582.field154.method3795(this.field4553, this.field4556, 0, 1024, class13.method112(class689.field9771, false, this.field8583), 1);
        } else {
            this.field4552 = this.field8582.field154.method3795(this.field4553, this.field4556, 1, 0, class13.method112(class689.field9771, false, this.field8583), 1);
        }
        PixelBuffer var9 = this.field8582.field157;
        int var10 = this.field4552.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class672.method3806(-114, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field8583.field9362 * arg7;
            int var12 = this.field8583.field9362 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method227(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method227(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field4552.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "b", descriptor = "(I)Z")
    public final boolean method419(int arg0) {
        int var2 = -92 / ((19 - arg0) / 40);
        return true;
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Loe;Ljb;Lqda;II)V")
    public class328(class13 arg0, class666 arg1, class689 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field8582.field161) {
            this.field4553 = arg3;
            this.field4556 = arg4;
        } else {
            this.field4553 = class99.method830(arg3, false);
            this.field4556 = class99.method830(arg4, false);
        }
        this.field4552 = this.field8582.field154.method3795(arg3, arg4, 1, 0, class13.method112(this.field8584, false, this.field8583), 1);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "([BIIIIIIILjb;)V")
    public final void method421(byte[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class666 arg8) {
        if (this.field8583 != arg8 || class689.field9771 != this.field8584) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field8582.field157;
        int var11 = this.field4552.LockRect(0, arg7, arg4, arg5, arg3, 0, var10);
        if (arg6 > -55) {
            this.field4555 = false;
        }
        if (!class672.method3806(38, var11)) {
            return;
        }
        int var12 = this.field8583.field9362 * arg1;
        int var13 = this.field8583.field9362 * arg5;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method227(arg0, arg2, 0, arg3 * var13);
        } else {
            for (int var15 = 0; var15 < arg3; var15++) {
                var10.method227(arg0, var12 * var15 + arg2, var14 * var15, var13);
            }
        }
        this.field4552.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ir", name = "<init>", descriptor = "(Loe;IIZ[III)V")
    public class328(class13 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class297.field4191, class689.field9771, arg3 && arg0.field176, arg1 * arg2);
        if (this.field8582.field161) {
            this.field4556 = arg2;
            this.field4553 = arg1;
        } else {
            this.field4553 = class99.method830(arg1, false);
            this.field4556 = class99.method830(arg2, false);
        }
        if (arg3) {
            this.field4552 = this.field8582.field154.method3795(this.field4553, this.field4556, 0, 1024, 21, 1);
        } else {
            this.field4552 = this.field8582.field154.method3795(this.field4553, this.field4556, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field8582.field157;
        int var9 = this.field4552.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class672.method3806(-121, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method3780(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method3780(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field4552.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(IIIII[III)V")
    public final void method415(int arg0, int arg1, int arg2, int arg3, int arg4, int[] arg5, int arg6, int arg7) {
        if (class297.field4191 != this.field8583 || class689.field9771 != this.field8584) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field8582.field157;
        if (arg2 != 23208) {
            return;
        }
        int var10 = this.field4552.LockRect(0, arg4, arg1, arg3, arg6, 0, var9);
        if (!class672.method3806(-113, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg3 * 4) == var11 && arg0 == arg3) {
            var9.method3780(arg5, arg7, 0, arg3 * arg6);
        } else {
            for (int var12 = 0; var12 < arg6; var12++) {
                var9.method3780(arg5, arg7 + (arg0 * var12), var11 * var12, arg3);
            }
        }
        this.field4552.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ir", name = "a", descriptor = "(I)V")
    public final void method405(int arg0) {
        if (arg0 == -29399) {
            this.field8582.method111(this, false);
        }
    }

    @OriginalMember(owner = "client!ir", name = "c", descriptor = "(I)I")
    public final int method412(int arg0) {
        if (arg0 != -17847) {
            this.field4554 = true;
        }
        return this.field4553;
    }
}
