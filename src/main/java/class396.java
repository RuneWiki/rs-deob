import jagdx.IDirect3DBaseTexture;
import jagdx.IDirect3DTexture;
import jagdx.PixelBuffer;
import jagdx.class737;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hl")
public class class396 extends class687 implements class90 {

    @OriginalMember(owner = "client!hl", name = "j", descriptor = "I")
    private int field5907;

    @OriginalMember(owner = "client!hl", name = "g", descriptor = "I")
    private int field5904;

    @OriginalMember(owner = "client!hl", name = "f", descriptor = "Ljagdx/IDirect3DTexture;")
    private IDirect3DTexture field5903;

    @OriginalMember(owner = "client!hl", name = "h", descriptor = "Z")
    public boolean field5905;

    @OriginalMember(owner = "client!hl", name = "i", descriptor = "Z")
    public boolean field5906;

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lhb;Llw;IIZ[BII)V")
    public class396(class585 arg0, class233 arg1, int arg2, int arg3, boolean arg4, byte[] arg5, int arg6, int arg7) {
        super(arg0, arg1, class121.field1859, arg4 && arg0.field8269, arg2 * arg3);
        if (this.field9695.field8259) {
            this.field5907 = arg3;
            this.field5904 = arg2;
        } else {
            this.field5904 = class567.method3292(arg2, -63);
            this.field5907 = class567.method3292(arg3, -118);
        }
        if (arg4) {
            this.field5903 = this.field9695.field8281.method4118(this.field5904, this.field5907, 0, 1024, class585.method3377(this.field9696, (byte) -2, class121.field1859), 1);
        } else {
            this.field5903 = this.field9695.field8281.method4118(this.field5904, this.field5907, 1, 0, class585.method3377(this.field9696, (byte) -2, class121.field1859), 1);
        }
        PixelBuffer var9 = this.field9695.field8260;
        int var10 = this.field5903.LockRect(0, 0, 0, arg2, arg3, 0, var9);
        if (class737.method4132(-112, var10)) {
            if (arg7 == 0) {
                arg7 = arg2;
            }
            int var11 = this.field9696.field3750 * arg2;
            int var12 = this.field9696.field3750 * arg7;
            int var13 = var9.getRowPitch();
            if (var11 == var13 && var11 == var12) {
                var9.method2587(arg5, arg6, 0, arg3 * var11);
            } else {
                for (int var14 = 0; var14 < arg3; var14++) {
                    var9.method2587(arg5, arg6 + (var12 * var14), var13 * var14, var11);
                }
            }
            this.field5903.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lhb;Llw;Lal;II)V")
    public class396(class585 arg0, class233 arg1, class121 arg2, int arg3, int arg4) {
        super(arg0, arg1, arg2, false, arg3 * arg4);
        if (this.field9695.field8259) {
            this.field5904 = arg3;
            this.field5907 = arg4;
        } else {
            this.field5904 = class567.method3292(arg3, -114);
            this.field5907 = class567.method3292(arg4, -71);
        }
        this.field5903 = this.field9695.field8281.method4118(arg3, arg4, 1, 0, class585.method3377(this.field9696, (byte) -2, this.field9698), 1);
    }

    @OriginalMember(owner = "client!hl", name = "<init>", descriptor = "(Lhb;IIZ[III)V")
    public class396(class585 arg0, int arg1, int arg2, boolean arg3, int[] arg4, int arg5, int arg6) {
        super(arg0, class238.field3830, class121.field1859, arg3 && arg0.field8269, arg1 * arg2);
        if (this.field9695.field8259) {
            this.field5907 = arg2;
            this.field5904 = arg1;
        } else {
            this.field5904 = class567.method3292(arg1, -83);
            this.field5907 = class567.method3292(arg2, -100);
        }
        if (arg3) {
            this.field5903 = this.field9695.field8281.method4118(this.field5904, this.field5907, 0, 1024, 21, 1);
        } else {
            this.field5903 = this.field9695.field8281.method4118(this.field5904, this.field5907, 1, 0, 21, 1);
        }
        PixelBuffer var8 = this.field9695.field8260;
        int var9 = this.field5903.LockRect(0, 0, 0, arg1, arg2, 0, var8);
        if (class737.method4132(-34, var9)) {
            if (arg6 == 0) {
                arg6 = arg1;
            }
            int var10 = var8.getRowPitch();
            if (arg1 * 4 == var10 && arg1 == arg6) {
                var8.method4112(arg4, arg5, 0, arg1 * arg2);
            } else {
                for (int var11 = 0; var11 < arg2; var11++) {
                    var8.method4112(arg4, arg6 * var11 + arg5, var10 * var11, arg1);
                }
            }
            this.field5903.UnlockRect(0);
        }
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Lgca;I)V")
    public final void method204(class206 arg0, int arg1) {
        int var3 = -36 % ((-arg1 - 2) / 39);
        super.method204(arg0, -127);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(B)Z")
    public final boolean method589(byte arg0) {
        if (arg0 > -112) {
            this.method589((byte) 108);
        }
        return true;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(Z)I")
    public final int method593(boolean arg0) {
        if (!arg0) {
            this.method204(null, 56);
        }
        return this.field5904;
    }

    @OriginalMember(owner = "client!hl", name = "c", descriptor = "(B)Ljagdx/IDirect3DBaseTexture;")
    public final IDirect3DBaseTexture method1860(byte arg0) {
        return arg0 == -66 ? this.field5903 : (IDirect3DBaseTexture) null;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(B)I")
    public final int method588(byte arg0) {
        if (arg0 != 21) {
            this.field5903 = null;
        }
        return this.field5907;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(ILlw;IIIIII[B)V")
    public final void method594(int arg0, class233 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte[] arg8) {
        if (this.field9696 != arg1 || class121.field1859 != this.field9698) {
            throw new RuntimeException();
        }
        PixelBuffer var10 = this.field9695.field8260;
        int var11 = this.field5903.LockRect(0, arg6, arg3, arg7, arg5, 0, var10);
        if (arg2 != -32482 || !class737.method4132(arg2 + 32589, var11)) {
            return;
        }
        int var12 = this.field9696.field3750 * arg0;
        int var13 = this.field9696.field3750 * arg7;
        int var14 = var10.getRowPitch();
        if (var13 == var14 && var12 == var13) {
            var10.method2587(arg8, arg4, 0, arg5 * var13);
        } else {
            for (int var15 = 0; var15 < arg5; var15++) {
                var10.method2587(arg8, var12 * var15 + arg4, var14 * var15, var13);
            }
        }
        this.field5903.UnlockRect(0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IZZ)V")
    public final void method597(int arg0, boolean arg1, boolean arg2) {
        int var4 = 91 % ((arg0 + 89) / 37);
        this.field5906 = arg1;
        this.field5905 = arg2;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I)V")
    public final void method195(int arg0) {
        int var2 = 91 / ((arg0 - 46) / 52);
        this.field9695.method3372(this, -5188);
    }

    @OriginalMember(owner = "client!hl", name = "b", descriptor = "(IF)F")
    public final float method591(int arg0, float arg1) {
        int var3 = 70 / ((arg0 - 52) / 33);
        return arg1 / (float) this.field5907;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IF)F")
    public final float method590(int arg0, float arg1) {
        return arg0 < 11 ? 0.45756143F : arg1 / (float) this.field5904;
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(IBII[III)V")
    public final void method595(int arg0, byte arg1, int arg2, int arg3, int[] arg4, int arg5, int arg6) {
        if (class238.field3830 != this.field9696 || class121.field1859 != this.field9698) {
            throw new RuntimeException();
        }
        if (arg1 != 26) {
            this.method204(null, 11);
        }
        PixelBuffer var8 = this.field9695.field8260;
        int var9 = this.field5903.LockRect(0, arg2, arg3, arg0, arg5, 16, var8);
        if (!class737.method4132(arg1 + 83, var9)) {
            return;
        }
        int var10 = var8.getRowPitch();
        if (arg0 * 4 == var10) {
            var8.method4111(arg4, arg6, 0, arg4.length);
        } else {
            for (int var11 = 0; var11 < arg5; var11++) {
                var8.method4111(arg4, arg6 + (arg0 * var11), var10 * var11, arg0);
            }
        }
        this.field5903.UnlockRect(0);
    }

    @OriginalMember(owner = "client!hl", name = "a", descriptor = "(I[IIIIIII)V")
    public final void method587(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (class238.field3830 != this.field9696 || class121.field1859 != this.field9698) {
            throw new RuntimeException();
        }
        if (arg4 != 17432) {
            this.field5903 = null;
        }
        PixelBuffer var9 = this.field9695.field8260;
        int var10 = this.field5903.LockRect(0, arg6, arg7, arg3, arg5, 0, var9);
        if (!class737.method4132(90, var10)) {
            return;
        }
        int var11 = var9.getRowPitch();
        if ((arg3 * 4) == var11 && arg0 == arg3) {
            var9.method4112(arg1, arg2, 0, arg3 * arg5);
        } else {
            for (int var12 = 0; var12 < arg5; var12++) {
                var9.method4112(arg1, arg0 * var12 + arg2, var11 * var12, arg3);
            }
        }
        this.field5903.UnlockRect(0);
    }
}
