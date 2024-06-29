import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class507;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!et")
public class class618 extends class335 implements class166 {

    @OriginalMember(owner = "client!et", name = "j", descriptor = "I")
    private int field8715;

    @OriginalMember(owner = "client!et", name = "h", descriptor = "I")
    private int field8713;

    @OriginalMember(owner = "client!et", name = "g", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field8712;

    @OriginalMember(owner = "client!et", name = "f", descriptor = "Z")
    public boolean field8711;

    @OriginalMember(owner = "client!et", name = "i", descriptor = "Z")
    public boolean field8714;

    @OriginalMember(owner = "client!et", name = "a", descriptor = "([IZIIIII)V")
    public final void method37(int[] arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        if (class12.field247 != this.field4991 || class770.field10614 != this.field4988) {
            throw new RuntimeException();
        }
        if (!arg1) {
            this.field8714 = true;
        }
        PixelBuffer var8 = this.field4987.field10272;
        int var9 = this.field8712.LockRect(0, arg6, arg4, arg3, arg5, 16, var8);
        if (!class507.method2947(var9, -69)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg3 * 4 == var10) {
            var8.method2975(arg0, arg2, 0, arg0.length);
        } else {
            for (int var11 = 0; var11 < arg5; var11++) {
                var8.method2975(arg0, arg3 * var11 + arg2, var10 * var11, arg3);
            }
        }
        this.field8712.UnlockRect(0);
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lki;IIZ[III)V")
    public class618(class735 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class12.field247, class770.field10614, arg3 && arg0.field10265, arg1 * arg2);
        if (this.field4987.field10270) {
            this.field8713 = arg2;
            this.field8715 = arg1;
        } else {
            this.field8715 = class89.method631((byte) 69, arg1);
            this.field8713 = class89.method631((byte) 102, arg2);
        }
        if (arg3) {
            this.field8712 = this.field4987.field10253.method2956(this.field8715, this.field8713, 0, 1024, 21, 1);
        } else {
            this.field8712 = this.field4987.field10253.method2956(this.field8715, this.field8713, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field4987.field10272;
        int var9 = this.field8712.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class507.method2947(var9, -85)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2974(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2974(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field8712.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IF)F")
    public final float method39(int arg0, float arg1) {
        if (arg0 != 2170) {
            this.method37(null, false, 61, -114, -121, -50, 92);
        }
        return arg1 / (float) this.field8715;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIILofa;[BIZI)V")
    public final void method43(int arg0, int arg1, int arg2, int arg3, class345 arg4, byte[] arg5, int arg6, boolean arg7, int arg8) {
        if (this.field4991 != arg4 || class770.field10614 != this.field4988) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field4987.field10272;
        if (arg7) {
            this.method42(false, (byte) -117, false);
        }
        int var11 = this.field8712.LockRect(0, arg8, arg0, arg6, arg3, 0, var10);
        if (!class507.method2947(var11, -61)) {
            return;
        }
        int var12 = this.field4991.field5077 * arg2;
        int var13 = this.field4991.field5077 * arg6;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2972(arg5, arg1, 0, arg3 * var13);
        } else {
            for (int var15 = 0; var15 < arg3; var15++) {
                var10.method2972(arg5, var12 * var15 + arg1, var14 * var15, var13);
            }
        }
        this.field8712.UnlockRect(0);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(I)I")
    public final int method38(int arg0) {
        int var2 = 32 / ((45 - arg0) / 51);
        return this.field8713;
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(Lcr;Z)V")
    public final void method2161(class597 arg0, boolean arg1) {
        super.method2161(arg0, arg1);
        if (arg1) {
            this.field8713 = 89;
        }
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lki;Lofa;Lkn;II)V")
    public class618(class735 arg0, class345 arg1, class770 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field4987.field10270) {
            this.field8713 = arg4;
            this.field8715 = arg3;
        } else {
            this.field8715 = class89.method631((byte) -74, arg3);
            this.field8713 = class89.method631((byte) 88, arg4);
        }
        this.field8712 = this.field4987.field10253.method2956(arg3, arg4, 1, 0, class735.method4116(this.field4991, 50, this.field4988), 1);
    }

    @OriginalMember(owner = "client!et", name = "b", descriptor = "(IF)F")
    public final float method36(int arg0, float arg1) {
        int var3 = 104 % ((65 - arg0) / 61);
        return arg1 / (float) this.field8713;
    }

    @OriginalMember(owner = "client!et", name = "c", descriptor = "(I)Z")
    public final boolean method40(int arg0) {
        return arg0 == 27610 ? true : true;
    }

    @OriginalMember(owner = "client!et", name = "<init>", descriptor = "(Lki;Lofa;IIZ[BII)V")
    public class618(class735 arg0, class345 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class770.field10614, arg4 && arg0.field10265, arg2 * arg3);
        if (this.field4987.field10270) {
            this.field8713 = arg3;
            this.field8715 = arg2;
        } else {
            this.field8715 = class89.method631((byte) -121, arg2);
            this.field8713 = class89.method631((byte) -102, arg3);
        }
        if (arg4) {
            this.field8712 = this.field4987.field10253.method2956(this.field8715, this.field8713, 0, 1024, class735.method4116(this.field4991, 50, class770.field10614), 1);
        } else {
            this.field8712 = this.field4987.field10253.method2956(this.field8715, this.field8713, 1, 0, class735.method4116(this.field4991, 50, class770.field10614), 1);
        }
        PixelBuffer var9 = this.field4987.field10272;
        int var10 = this.field8712.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class507.method2947(var10, -81)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field4991.field5077 * arg7;
            int var12 = this.field4991.field5077 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2972(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2972(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field8712.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(ZBZ)V")
    public final void method42(boolean arg0, byte arg1, boolean arg2) {
        this.field8711 = arg2;
        if (arg1 <= -111) {
            this.field8714 = arg0;
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(I)V")
    public final void method2686(int arg0) {
        this.field4987.method4111(arg0 - 32149, this);
        if (arg0 != 32104) {
            this.method39(-37, -0.053471904F);
        }
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(IIIIIZI[I)V")
    public final void method41(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
        if (class12.field247 != this.field4991 || class770.field10614 != this.field4988) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field4987.field10272;
        if (arg5) {
            return;
        }
        int var10 = this.field8712.LockRect(0, arg3, arg6, arg1, arg4, 0, var9);
        if (!class507.method2947(var10, -43)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg1 * 4) == var11 && arg1 == arg2) {
            var9.method2974(arg7, arg0, 0, arg1 * arg4);
        } else {
            for (int var12 = 0; var12 < arg4; var12++) {
                var9.method2974(arg7, arg2 * var12 + arg0, var11 * var12, arg1);
            }
        }
        this.field8712.UnlockRect(0);
    }

    @OriginalMember(owner = "client!et", name = "a", descriptor = "(B)I")
    public final int method34(byte arg0) {
        return arg0 == -109 ? this.field8715 : -8;
    }

    @OriginalMember(owner = "client!et", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method2162(int arg0) {
        if (arg0 != -26076) {
            this.method38(1);
        }
        return this.field8712;
    }
}
