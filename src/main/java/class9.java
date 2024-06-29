import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class451;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ff")
public class class9 extends class283 implements class212 {

    @OriginalMember(owner = "client!ff", name = "i", descriptor = "I")
    private int field89;

    @OriginalMember(owner = "client!ff", name = "f", descriptor = "I")
    private int field86;

    @OriginalMember(owner = "client!ff", name = "h", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field88;

    @OriginalMember(owner = "client!ff", name = "g", descriptor = "Z")
    public boolean field87;

    @OriginalMember(owner = "client!ff", name = "j", descriptor = "Z")
    public boolean field90;

    @OriginalMember(owner = "client!ff", name = "d", descriptor = "(I)Ljagdx/IDirect3DBaseTexture;", line = 4)
    public final IDirect3DBaseTexture method33(int arg0) {
        if (arg0 > -49) {
            this.field87 = true;
        }
        return this.field88;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(IIIZIILnh;I[B)V", line = 15)
    public final void method34(int arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, class699 arg6, int arg7, byte[] arg8) {
        if (arg3) {
            this.field89 = 44;
        }
        if (this.field3587 != arg6 || class100.field1288 != this.field3586) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field3589.field690;
        int var11 = this.field88.LockRect(0, arg2, arg4, arg1, arg5, 0, var10);
        if (!class451.method2482(14528, var11)) {
            return;
        }
        int var12 = this.field3587.field9683 * arg7;
        int var13 = this.field3587.field9683 * arg1;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2480(arg8, arg0, 0, arg5 * var13);
        } else {
            for (int var15 = 0; var15 < arg5; var15++) {
                var10.method2480(arg8, var12 * var15 + arg0, var14 * var15, var13);
            }
        }
        this.field88.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "([IIIIIIII)V", line = 58)
    public final void method35(int[] arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        int var9 = 60 / ((arg6 + 8) / 47);
        if (class556.field6946 != this.field3587 || class100.field1288 != this.field3586) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field3589.field690;
        int var11 = this.field88.LockRect(0, arg7, arg4, arg3, arg2, 0, var10);
        if (!class451.method2482(14528, var11)) {
            return;
        }
        int var12 = var10.getRowPitch();
        if (arg3 * 4 == var12 && arg3 == arg5) {
            var10.method2485(arg0, arg1, 0, arg2 * arg3);
        } else {
            for (int var13 = 0; var13 < arg2; var13++) {
                var10.method2485(arg0, arg5 * var13 + arg1, var12 * var13, arg3);
            }
        }
        this.field88.UnlockRect(0);
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ltga;Lnh;Ljr;II)V", line = 94)
    public class9(class54 arg0, class699 arg1, class100 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field3589.field697) {
            this.field89 = arg3;
            this.field86 = arg4;
        } else {
            this.field89 = class560.method2979(arg3, (byte) 51);
            this.field86 = class560.method2979(arg4, (byte) 55);
        }
        this.field88 = this.field3589.field696.method2469(arg3, arg4, 1, 0, class54.method338(22, this.field3586, this.field3587), 1);
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(I)I", line = 114)
    public final int method36(int arg0) {
        if (arg0 != -24981) {
            this.field87 = false;
        }
        return this.field86;
    }

    @OriginalMember(owner = "client!ff", name = "b", descriptor = "(I)I", line = 124)
    public final int method37(int arg0) {
        return arg0 == -18693 ? this.field89 : -108;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(B)Z", line = 134)
    public final boolean method38(byte arg0) {
        if (arg0 <= 91) {
            this.field86 = 117;
        }
        return true;
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(FI)F", line = 144)
    public final float method39(float arg0, int arg1) {
        return arg1 > -79 ? 0.5232039F : arg0 / (float) this.field86;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ltga;IIZ[III)V", line = 156)
    public class9(class54 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class556.field6946, class100.field1288, arg3 && arg0.field695, arg1 * arg2);
        if (this.field3589.field697) {
            this.field86 = arg2;
            this.field89 = arg1;
        } else {
            this.field89 = class560.method2979(arg1, (byte) 36);
            this.field86 = class560.method2979(arg2, (byte) 101);
        }
        if (arg3) {
            this.field88 = this.field3589.field696.method2469(this.field89, this.field86, 0, 1024, 21, 1);
        } else {
            this.field88 = this.field3589.field696.method2469(this.field89, this.field86, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field3589.field690;
        int var9 = this.field88.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class451.method2482(14528, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method2485(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method2485(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field88.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ZZI)V", line = 213)
    public final void method40(boolean arg0, boolean arg1, int arg2) {
        this.field87 = arg0;
        this.field90 = arg1;
        if (arg2 != 7220) {
            this.method36(-47);
        }
    }

    @OriginalMember(owner = "client!ff", name = "c", descriptor = "(I)V", line = 224)
    public final void method41(int arg0) {
        this.field3589.method331(this, (byte) -63);
        if (arg0 != -9341) {
            this.method37(28);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(BF)F", line = 234)
    public final float method42(byte arg0, float arg1) {
        if (arg0 <= 125) {
            this.field90 = true;
        }
        return arg1 / (float) this.field89;
    }

    @OriginalMember(owner = "client!ff", name = "<init>", descriptor = "(Ltga;Lnh;IIZ[BII)V", line = 244)
    public class9(class54 arg0, class699 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class100.field1288, arg4 && arg0.field695, arg2 * arg3);
        if (this.field3589.field697) {
            this.field89 = arg2;
            this.field86 = arg3;
        } else {
            this.field89 = class560.method2979(arg2, (byte) 109);
            this.field86 = class560.method2979(arg3, (byte) 118);
        }
        if (arg4) {
            this.field88 = this.field3589.field696.method2469(this.field89, this.field86, 0, 1024, class54.method338(22, class100.field1288, this.field3587), 1);
        } else {
            this.field88 = this.field3589.field696.method2469(this.field89, this.field86, 1, 0, class54.method338(22, class100.field1288, this.field3587), 1);
        }
        PixelBuffer var9 = this.field3589.field690;
        int var10 = this.field88.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class451.method2482(14528, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field3587.field9683 * arg7;
            int var12 = this.field3587.field9683 * arg2;
            int var13 = var9.getRowPitch();
            if (var12 == var13 && var11 == var12) {
                var9.method2480(arg5, arg6, 0, arg3 * var12);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2480(arg5, arg6 + (var11 * var14), var13 * var14, var12);
                }
            }
            this.field88.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!ff", name = "a", descriptor = "(ILju;)V", line = 302)
    public final void method43(int arg0, class115 arg1) {
        if (arg0 != -29198) {
            this.method39(-0.032927793F, 66);
        }
        super.method43(arg0 ^ 0x0, arg1);
    }
}
