import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class757;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cw")
public class class146 extends class22 implements class225 {

    @OriginalMember(owner = "client!cw", name = "h", descriptor = "I")
    private int field2356;

    @OriginalMember(owner = "client!cw", name = "g", descriptor = "I")
    private int field2355;

    @OriginalMember(owner = "client!cw", name = "i", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field2357;

    @OriginalMember(owner = "client!cw", name = "f", descriptor = "Z")
    public boolean field2354;

    @OriginalMember(owner = "client!cw", name = "j", descriptor = "Z")
    public boolean field2358;

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;Lnea;IIZ[BII)V")
    public class146(class8 arg0, class600 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class629.field8918, arg4 && arg0.field111, arg2 * arg3);
        if (this.field252.field117) {
            this.field2355 = arg3;
            this.field2356 = arg2;
        } else {
            this.field2356 = class661.method3706(arg2, true);
            this.field2355 = class661.method3706(arg3, true);
        }
        if (arg4) {
            this.field2357 = this.field252.field100.method4189(this.field2356, this.field2355, 0, 1024, class8.method100(this.field255, class629.field8918, (byte) -119), 1);
        } else {
            this.field2357 = this.field252.field100.method4189(this.field2356, this.field2355, 1, 0, class8.method100(this.field255, class629.field8918, (byte) -110), 1);
        }
        PixelBuffer var9 = this.field252.field115;
        int var10 = this.field2357.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class757.method4191(-2005530600, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field255.field8555 * arg7;
            int var12 = this.field255.field8555 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method236(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method236(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field2357.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ZZI)V")
    public final void method333(boolean arg0, boolean arg1, int arg2) {
        this.field2354 = arg0;
        this.field2358 = arg1;
        if (arg2 != 7536) {
            this.method330(-0.53221196F, -5);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IF)F")
    public final float method328(int arg0, float arg1) {
        return arg0 == 431 ? arg1 / (float) this.field2356 : -1.1397845F;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(FI)F")
    public final float method330(float arg0, int arg1) {
        int var3 = 10 / ((78 - arg1) / 47);
        return arg0 / (float) this.field2355;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;Lnea;Ldr;II)V")
    public class146(class8 arg0, class600 arg1, class629 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field252.field117) {
            this.field2355 = arg4;
            this.field2356 = arg3;
        } else {
            this.field2356 = class661.method3706(arg3, true);
            this.field2355 = class661.method3706(arg4, true);
        }
        this.field2357 = this.field252.field100.method4189(arg3, arg4, 1, 0, class8.method100(this.field255, this.field254, (byte) -104), 1);
    }

    @OriginalMember(owner = "client!cw", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method210(byte arg0) {
        if (arg0 != -78) {
            this.field2358 = false;
        }
        return this.field2357;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(IZLnea;I[BIIII)V")
    public final void method331(int arg0, boolean arg1, class600 arg2, int arg3, byte[] arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field255 != arg2 || class629.field8918 != this.field254) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field252.field115;
        if (!arg1) {
            this.method336(40, 63, 72, null, -95, 83, -107);
        }
        int var11 = this.field2357.LockRect(0, arg0, arg3, arg6, arg8, 0, var10);
        if (!class757.method4191(-2005530600, var11)) {
            return;
        }
        int var12 = this.field255.field8555 * arg6;
        int var13 = this.field255.field8555 * arg5;
        int var14 = var10.getRowPitch();
        if (var12 == var14 && var12 == var13) {
            var10.method236(arg4, arg7, 0, arg8 * var12);
        } else {
            for (int var15 = 0; var15 < arg8; var15++) {
                var10.method236(arg4, var13 * var15 + arg7, var14 * var15, var12);
            }
        }
        this.field2357.UnlockRect(0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(ILrha;)V")
    public final void method211(int arg0, class455 arg1) {
        super.method211(arg0, arg1);
        if (arg0 != 27691) {
            this.method211(-19, null);
        }
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(B)I")
    public final int method334(byte arg0) {
        int var2 = -31 % ((arg0 - 30) / 37);
        return this.field2356;
    }

    @OriginalMember(owner = "client!cw", name = "<init>", descriptor = "(Llj;IIZ[III)V")
    public class146(class8 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class133.field2225, class629.field8918, arg3 && arg0.field111, arg1 * arg2);
        if (this.field252.field117) {
            this.field2356 = arg1;
            this.field2355 = arg2;
        } else {
            this.field2356 = class661.method3706(arg1, true);
            this.field2355 = class661.method3706(arg2, true);
        }
        if (arg3) {
            this.field2357 = this.field252.field100.method4189(this.field2356, this.field2355, 0, 1024, 21, 1);
        } else {
            this.field2357 = this.field252.field100.method4189(this.field2356, this.field2355, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field252.field115;
        int var9 = this.field2357.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class757.method4191(-2005530600, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method4163(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4163(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field2357.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(B)Z")
    public final boolean method337(byte arg0) {
        if (arg0 != 7) {
            this.field2356 = -117;
        }
        return true;
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(I)V")
    public final void method1159(int arg0) {
        if (arg0 != 16033) {
            this.method336(10, 100, -58, null, -119, -100, -3);
        }
        this.field252.method117(arg0 ^ 0x3EA2, this);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(III[IIII)V")
    public final void method336(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6) {
        if (arg4 != -7207) {
            return;
        }
        if (class133.field2225 != this.field255 || class629.field8918 != this.field254) {
            throw new RuntimeException();
        }
        PixelBuffer var8 = this.field252.field115;
        int var9 = this.field2357.LockRect(0, arg2, arg6, arg1, arg0, 16, var8);
        if (!class757.method4191(arg4 - 2005523393, var9)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg1 * 4 == var10) {
            var8.method4164(arg3, arg5, 0, arg3.length);
        } else {
            for (int var11 = 0; var11 < arg0; var11++) {
                var8.method4164(arg3, arg5 + (arg1 * var11), var10 * var11, arg1);
            }
        }
        this.field2357.UnlockRect(0);
    }

    @OriginalMember(owner = "client!cw", name = "a", descriptor = "(II[IIIIII)V")
    public final void method329(int arg0, int arg1, int[] arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -27716) {
            this.method211(-37, null);
        }
        if (class133.field2225 != this.field255 || class629.field8918 != this.field254) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field252.field115;
        int var10 = this.field2357.LockRect(0, arg5, arg1, arg4, arg3, 0, var9);
        if (!class757.method4191(-2005530600, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg4 * 4 == var11 && arg0 == arg4) {
            var9.method4163(arg2, arg6, 0, arg3 * arg4);
        } else {
            for (int var12 = 0; var12 < arg3; var12++) {
                var9.method4163(arg2, arg0 * var12 + arg6, var11 * var12, arg4);
            }
        }
        this.field2357.UnlockRect(0);
    }

    @OriginalMember(owner = "client!cw", name = "b", descriptor = "(I)I")
    public final int method338(int arg0) {
        int var2 = 68 % ((arg0 + 16) / 52);
        return this.field2355;
    }
}
