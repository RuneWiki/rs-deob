import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class723;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aga")
public class class644 extends class231 implements class620 {

    @OriginalMember(owner = "client!aga", name = "f", descriptor = "I")
    private int field8882;

    @OriginalMember(owner = "client!aga", name = "j", descriptor = "I")
    private int field8886;

    @OriginalMember(owner = "client!aga", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field8884;

    @OriginalMember(owner = "client!aga", name = "g", descriptor = "Z")
    public boolean field8883;

    @OriginalMember(owner = "client!aga", name = "i", descriptor = "Z")
    public boolean field8885;

    @OriginalMember(owner = "client!aga", name = "b", descriptor = "(I)I", line = 4)
    public final int method373(int arg0) {
        if (arg0 != -15836) {
            this.field8885 = false;
        }
        return this.field8886;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(FZ)F", line = 14)
    public final float method374(float arg0, boolean arg1) {
        return arg1 ? arg0 / (float) this.field8886 : -2.038589F;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(ZIZ)V", line = 24)
    public final void method381(boolean arg0, int arg1, boolean arg2) {
        this.field8883 = arg0;
        if (arg1 == -13021) {
            this.field8885 = arg2;
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(FI)F", line = 35)
    public final float method376(float arg0, int arg1) {
        if (arg1 != -31566) {
            this.method1793(-124);
        }
        return arg0 / (float) this.field8882;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lcu;IIZ[III)V", line = 44)
    public class644(class287 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class440.field6178, class240.field3093, arg3 && arg0.field3637, arg1 * arg2);
        if (this.field3005.field3635) {
            this.field8886 = arg2;
            this.field8882 = arg1;
        } else {
            this.field8882 = class353.method2103(91, arg1);
            this.field8886 = class353.method2103(72, arg2);
        }
        if (arg3) {
            this.field8884 = this.field3005.field3643.method4008(this.field8882, this.field8886, 0, 1024, 21, 1);
        } else {
            this.field8884 = this.field3005.field3643.method4008(this.field8882, this.field8886, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field3005.field3642;
        int var9 = this.field8884.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class723.method3998(false, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if ((arg1 * 4) == var10 && arg1 == arg6) {
                var8.method4000(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4000(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field8884.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lcu;Lem;Lew;II)V", line = 100)
    public class644(class287 arg0, class610 arg1, class240 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field3005.field3635) {
            this.field8886 = arg4;
            this.field8882 = arg3;
        } else {
            this.field8882 = class353.method2103(71, arg3);
            this.field8886 = class353.method2103(82, arg4);
        }
        this.field8884 = this.field3005.field3643.method4008(arg3, arg4, 1, 0, class287.method1722(this.field3004, this.field3003, -343), 1);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(IBIIII[I)V", line = 120)
    public final void method372(int arg0, byte arg1, int arg2, int arg3, int arg4, int arg5, int[] arg6) {
        if (class440.field6178 != this.field3003 || class240.field3093 != this.field3004) {
            throw new RuntimeException();
        }
        int var8 = 6 % ((arg1 + 28) / 56);
        PixelBuffer var9 = this.field3005.field3642;
        int var10 = this.field8884.LockRect(0, arg4, arg2, arg5, arg0, 16, var9);
        if (!class723.method3998(false, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if (arg5 * 4 == var11) {
            var9.method3999(arg6, arg3, 0, arg6.length);
        } else {
            for (int var12 = 0; var12 < arg0; var12++) {
                var9.method3999(arg6, arg3 + (arg5 * var12), var11 * var12, arg5);
            }
        }
        this.field8884.UnlockRect(0);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(B)Z", line = 158)
    public final boolean method375(byte arg0) {
        if (arg0 != 35) {
            this.field8884 = null;
        }
        return true;
    }

    @OriginalMember(owner = "client!aga", name = "c", descriptor = "(I)V", line = 168)
    public final void method1793(int arg0) {
        this.field3005.method1715(arg0 + 28067, this);
        if (arg0 != 3323) {
            this.method381(true, -22, true);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "([BIBIIILem;II)V", line = 178)
    public final void method379(byte[] arg0, int arg1, byte arg2, int arg3, int arg4, int arg5, class610 arg6, int arg7, int arg8) {
        if (this.field3003 != arg6 || class240.field3093 != this.field3004) {
            throw new RuntimeException();
        }
        if (arg2 != -68) {
            this.field8884 = null;
        }
        PixelBuffer var10 = this.field3005.field3642;
        int var11 = this.field8884.LockRect(0, arg7, arg4, arg1, arg5, 0, var10);
        if (!class723.method3998(false, var11)) {
            return;
        }
        int var12 = this.field3003.field8447 * arg8;
        int var13 = this.field3003.field8447 * arg1;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method281(arg0, arg3, 0, arg5 * var13);
        } else {
            for (int var15 = 0; var15 < arg5; var15++) {
                var10.method281(arg0, arg3 + (var12 * var15), var14 * var15, var13);
            }
        }
        this.field8884.UnlockRect(0);
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(I)I", line = 221)
    public final int method378(int arg0) {
        if (arg0 != 3631) {
            this.method379(null, 14, (byte) -66, -24, 73, -61, null, 14, 123);
        }
        return this.field8882;
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(III[IIIII)V", line = 231)
    public final void method380(int arg0, int arg1, int arg2, int[] arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class440.field6178 != this.field3003 || class240.field3093 != this.field3004) {
            throw new RuntimeException();
        }
        PixelBuffer var9 = this.field3005.field3642;
        int var10 = this.field8884.LockRect(0, arg6, arg2, arg0, arg1, 0, var9);
        if (class723.method3998(false, var10)) {
            int var11 = var9.getRowPitch();
            if ((arg0 * 4) == var11 && arg0 == arg7) {
                var9.method4000(arg3, arg4, 0, arg0 * arg1);
            } else {
                for (int var12 = 0; var12 < arg1; var12++) {
                    var9.method4000(arg3, arg7 * var12 + arg4, var11 * var12, arg0);
                }
            }
            this.field8884.UnlockRect(0);
        }
        if (arg5 != -19156) {
            this.method1466(null, 40);
        }
    }

    @OriginalMember(owner = "client!aga", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 272)
    public final IDirect3DBaseTexture method1465(int arg0) {
        return arg0 == 13367 ? this.field8884 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!aga", name = "<init>", descriptor = "(Lcu;Lem;IIZ[BII)V", line = 283)
    public class644(class287 arg0, class610 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class240.field3093, arg4 && arg0.field3637, arg2 * arg3);
        if (this.field3005.field3635) {
            this.field8882 = arg2;
            this.field8886 = arg3;
        } else {
            this.field8882 = class353.method2103(103, arg2);
            this.field8886 = class353.method2103(100, arg3);
        }
        if (arg4) {
            this.field8884 = this.field3005.field3643.method4008(this.field8882, this.field8886, 0, 1024, class287.method1722(class240.field3093, this.field3003, -343), 1);
        } else {
            this.field8884 = this.field3005.field3643.method4008(this.field8882, this.field8886, 1, 0, class287.method1722(class240.field3093, this.field3003, -343), 1);
        }
        PixelBuffer var9 = this.field3005.field3642;
        int var10 = this.field8884.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class723.method3998(false, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field3003.field8447 * arg7;
            int var12 = this.field3003.field8447 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method281(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method281(arg5, var11 * var14 + arg6, var13 * var14, var12);
                }
            }
            this.field8884.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!aga", name = "a", descriptor = "(Lbba;I)V", line = 342)
    public final void method1466(class721 arg0, int arg1) {
        super.method1466(arg0, arg1 ^ 0x0);
        if (arg1 != 13584) {
            this.method373(-16);
        }
    }
}
